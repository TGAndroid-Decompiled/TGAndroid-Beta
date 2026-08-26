package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PlayingGameDrawable;
import org.telegram.ui.Components.PopupAudioView;
import org.telegram.ui.Components.RecordStatusDrawable;
import org.telegram.ui.Components.RoundStatusDrawable;
import org.telegram.ui.Components.SendingFileDrawable;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StatusDrawable;
import org.telegram.ui.Components.TypingDotsDrawable;

public class PopupNotificationActivity extends Activity implements NotificationCenter.NotificationCenterDelegate {
    private static final int id_chat_compose_panel = 1000;
    private ActionBar actionBar;
    private FrameLayout avatarContainer;
    private BackupImageView avatarImageView;
    private ViewGroup centerButtonsView;
    private ViewGroup centerView;
    private ChatActivityEnterView chatActivityEnterView;
    private int classGuid;
    private TextView countText;
    private TLRPC.Chat currentChat;
    private TLRPC.User currentUser;
    private boolean isReply;
    private CharSequence lastPrintString;
    private ViewGroup leftButtonsView;
    private ViewGroup leftView;
    private ViewGroup messageContainer;
    private TextView nameTextView;
    private TextView onlineTextView;
    private RelativeLayout popupContainer;
    private ViewGroup rightButtonsView;
    private ViewGroup rightView;
    private ArrayList<ViewGroup> textViews = new ArrayList<>();
    private ArrayList<ViewGroup> imageViews = new ArrayList<>();
    private ArrayList<ViewGroup> audioViews = new ArrayList<>();
    private VelocityTracker velocityTracker = null;
    private StatusDrawable[] statusDrawables = new StatusDrawable[5];
    private int lastResumedAccount = -1;
    private boolean finished = false;
    private MessageObject currentMessageObject = null;
    private MessageObject[] setMessageObjects = new MessageObject[3];
    private int currentMessageNum = 0;
    private PowerManager.WakeLock wakeLock = null;
    private boolean animationInProgress = false;
    private long animationStartTime = 0;
    private float moveStartX = -1.0f;
    private boolean startedMoving = false;
    private Runnable onAnimationEndRunnable = null;
    private ArrayList<MessageObject> popupMessages = new ArrayList<>();

    public void applyViewsLayoutParams(int i) {
        int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        ViewGroup viewGroup = this.leftView;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != iDp) {
                layoutParams.width = iDp;
                this.leftView.setLayoutParams(layoutParams);
            }
            this.leftView.setTranslationX((-iDp) + i);
        }
        ViewGroup viewGroup2 = this.leftButtonsView;
        if (viewGroup2 != null) {
            viewGroup2.setTranslationX((-iDp) + i);
        }
        ViewGroup viewGroup3 = this.centerView;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams2.width != iDp) {
                layoutParams2.width = iDp;
                this.centerView.setLayoutParams(layoutParams2);
            }
            this.centerView.setTranslationX(i);
        }
        ViewGroup viewGroup4 = this.centerButtonsView;
        if (viewGroup4 != null) {
            viewGroup4.setTranslationX(i);
        }
        ViewGroup viewGroup5 = this.rightView;
        if (viewGroup5 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup5.getLayoutParams();
            if (layoutParams3.width != iDp) {
                layoutParams3.width = iDp;
                this.rightView.setLayoutParams(layoutParams3);
            }
            this.rightView.setTranslationX(iDp + i);
        }
        ViewGroup viewGroup6 = this.rightButtonsView;
        if (viewGroup6 != null) {
            viewGroup6.setTranslationX(iDp + i);
        }
        this.messageContainer.invalidate();
    }

    private void checkAndUpdateAvatar() {
        TLRPC.User user;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        if (this.currentChat != null) {
            TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(this.currentChat.id));
            if (chat == null) {
                return;
            }
            this.currentChat = chat;
            if (this.avatarImageView != null) {
                this.avatarImageView.setForUserOrChat(chat, new AvatarDrawable(this.currentChat));
                return;
            }
            return;
        }
        if (this.currentUser == null || (user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(this.currentUser.id))) == null) {
            return;
        }
        this.currentUser = user;
        if (this.avatarImageView != null) {
            this.avatarImageView.setForUserOrChat(user, new AvatarDrawable(this.currentUser));
        }
    }

    private void fixLayout() {
        FrameLayout frameLayout = this.avatarContainer;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    if (PopupNotificationActivity.this.avatarContainer != null) {
                        PopupNotificationActivity.this.avatarContainer.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    int iM$2 = OKLCH.m$2(48.0f, ActionBar.getCurrentActionBarHeight(), 2);
                    PopupNotificationActivity.this.avatarContainer.setPadding(PopupNotificationActivity.this.avatarContainer.getPaddingLeft(), iM$2, PopupNotificationActivity.this.avatarContainer.getPaddingRight(), iM$2);
                    return true;
                }
            });
        }
        ViewGroup viewGroup = this.messageContainer;
        if (viewGroup != null) {
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    PopupNotificationActivity.this.messageContainer.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (PopupNotificationActivity.this.checkTransitionAnimation() || PopupNotificationActivity.this.startedMoving) {
                        return true;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) PopupNotificationActivity.this.messageContainer.getLayoutParams();
                    marginLayoutParams.topMargin = ActionBar.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    PopupNotificationActivity.this.messageContainer.setLayoutParams(marginLayoutParams);
                    PopupNotificationActivity.this.applyViewsLayoutParams(0);
                    return true;
                }
            });
        }
    }

    private LinearLayout getButtonsViewForMessage(int i, boolean z) {
        int i2;
        ?? r3;
        ?? r10;
        ?? r5;
        Object obj;
        int size = i;
        Object obj2 = null;
        if (this.popupMessages.size() == 1 && (size < 0 || size >= this.popupMessages.size())) {
            return null;
        }
        boolean z2 = false;
        if (size == -1) {
            size = this.popupMessages.size() - 1;
        } else if (size == this.popupMessages.size()) {
            size = 0;
        }
        MessageObject messageObject = this.popupMessages.get(size);
        TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
        if (messageObject.getDialogId() == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size2 = arrayList.size();
            i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList.get(i3);
                int size3 = keyboardInlineButtonRow.buttons.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    if (TLKeyboardHelper.isType(keyboardInlineButtonRow.buttons.get(i4), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i2++;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        int i5 = messageObject.currentAccount;
        if (i2 <= 0 || !(replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            r3 = 0;
        } else {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList2 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size4 = arrayList2.size();
            ?? r11 = 0;
            int i6 = 0;
            while (i6 < size4) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList2.get(i6);
                int size5 = keyboardInlineButtonRow2.buttons.size();
                int i7 = 0;
                while (i7 < size5) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i7);
                    if (TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (r10 == 0) {
                            ?? linearLayout = new LinearLayout(this);
                            linearLayout.setOrientation(r5);
                            linearLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, r5));
                            linearLayout.setWeightSum(100.0f);
                            linearLayout.setTag("b");
                            linearLayout.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(26));
                            r10 = linearLayout;
                        } else {
                            r10 = r10;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        obj = null;
                        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        r10.addView(textView, LayoutHelper.createLinear(-1, -1, 100.0f / i2));
                        textView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda323(i5, messageObject));
                    } else {
                        r5 = z2;
                        r10 = r11;
                        arrayList2 = arrayList2;
                        obj = obj2;
                    }
                    i7++;
                    obj2 = obj;
                    size4 = size4;
                    arrayList2 = arrayList2;
                    r5 = 0;
                    r10 = r10;
                }
                r5 = z2;
                r10 = r11;
                i6++;
                size4 = size4;
                arrayList2 = arrayList2;
                z2 = false;
                r11 = r10;
            }
            r3 = r11;
        }
        if (r3 != 0) {
            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z) {
                int i8 = this.currentMessageNum;
                if (size == i8) {
                    r3.setTranslationX(0.0f);
                } else if (size == i8 - 1) {
                    r3.setTranslationX(-iDp);
                } else if (size == i8 + 1) {
                    r3.setTranslationX(iDp);
                }
            }
            this.popupContainer.addView(r3, layoutParams);
        }
        return r3;
    }

    public void getNewMessage() {
        if (this.popupMessages.isEmpty()) {
            onFinish();
            finish();
            return;
        }
        if ((this.currentMessageNum != 0 || this.chatActivityEnterView.hasText() || this.startedMoving) && this.currentMessageObject != null) {
            int size = this.popupMessages.size();
            for (int i = 0; i < size; i++) {
                MessageObject messageObject = this.popupMessages.get(i);
                if (messageObject.currentAccount == this.currentMessageObject.currentAccount && messageObject.getDialogId() == this.currentMessageObject.getDialogId() && messageObject.getId() == this.currentMessageObject.getId()) {
                    this.currentMessageNum = i;
                    if (this.startedMoving) {
                        if (i == this.popupMessages.size() - 1) {
                            prepareLayouts(3);
                        } else if (this.currentMessageNum == 1) {
                            prepareLayouts(4);
                        }
                    }
                }
            }
            this.currentMessageNum = 0;
            this.currentMessageObject = this.popupMessages.get(0);
            updateInterfaceForCurrentMessage(0);
        } else {
            this.currentMessageNum = 0;
            this.currentMessageObject = this.popupMessages.get(0);
            updateInterfaceForCurrentMessage(0);
        }
        this.countText.setText(String.format("%d/%d", Integer.valueOf(this.currentMessageNum + 1), Integer.valueOf(this.popupMessages.size())));
    }

    private ViewGroup getViewForMessage(int i, boolean z) {
        int i2;
        ?? r6;
        ?? r7;
        ?? r3;
        ViewGroup frameLayout;
        PopupAudioView popupAudioView;
        int size = i;
        if (this.popupMessages.size() == 1 && (size < 0 || size >= this.popupMessages.size())) {
            return null;
        }
        if (size == -1) {
            size = this.popupMessages.size() - 1;
        } else if (size == this.popupMessages.size()) {
            size = 0;
        }
        MessageObject messageObject = this.popupMessages.get(size);
        int i3 = messageObject.type;
        if ((i3 == 1 || i3 == 4) && !messageObject.isSecretMedia()) {
            if (this.imageViews.size() > 0) {
                ViewGroup viewGroup = this.imageViews.get(0);
                this.imageViews.remove(0);
                i2 = 312;
                r6 = viewGroup;
            } else {
                ?? frameLayout2 = new FrameLayout(this);
                FrameLayout frameLayout3 = new FrameLayout(this);
                i2 = 312;
                frameLayout3.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f));
                BackupImageView backupImageView = new BackupImageView(this);
                backupImageView.setTag(311);
                frameLayout3.addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f));
                TextView textView = new TextView(this);
                textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                textView.setTextSize(1, 16.0f);
                textView.setGravity(17);
                textView.setTag(312);
                frameLayout3.addView(textView, LayoutHelper.createFrame(-1, -2, 17));
                frameLayout2.setTag(2);
                final int i4 = 0;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$getViewForMessage$6(view);
                                break;
                            case 1:
                                this.f$0.lambda$getViewForMessage$7(view);
                                break;
                            default:
                                this.f$0.lambda$getViewForMessage$8(view);
                                break;
                        }
                    }
                });
                r6 = frameLayout2;
            }
            TextView textView2 = (TextView) r6.findViewWithTag(Integer.valueOf(i2));
            BackupImageView backupImageView2 = (BackupImageView) r6.findViewWithTag(311);
            backupImageView2.setAspectFit(true);
            int i5 = messageObject.type;
            if (i5 == 1) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 100);
                if (closestPhotoSizeWithSize == null) {
                    backupImageView2.setVisibility(8);
                    textView2.setVisibility(0);
                    textView2.setTextSize(2, SharedConfig.fontSize);
                    textView2.setText(messageObject.messageText);
                    r7 = r6;
                } else {
                    boolean z2 = messageObject.type != 1 || FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject.messageOwner).exists();
                    if (messageObject.needDrawBluredPreview()) {
                        backupImageView2.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setTextSize(2, SharedConfig.fontSize);
                        textView2.setText(messageObject.messageText);
                        r7 = r6;
                    } else {
                        if (z2 || DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject)) {
                            backupImageView2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "100_100", ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", closestPhotoSizeWithSize.size, messageObject);
                        } else if (closestPhotoSizeWithSize2 != null) {
                            backupImageView2.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", (String) null, (Drawable) null, messageObject);
                        } else {
                            backupImageView2.setVisibility(8);
                            textView2.setVisibility(0);
                            textView2.setTextSize(2, SharedConfig.fontSize);
                            textView2.setText(messageObject.messageText);
                            r7 = r6;
                        }
                        backupImageView2.setVisibility(0);
                        textView2.setVisibility(8);
                        r7 = r6;
                    }
                }
            } else if (i5 == 4) {
                textView2.setVisibility(8);
                textView2.setText(messageObject.messageText);
                backupImageView2.setVisibility(0);
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                if (MessagesController.getInstance(messageObject.currentAccount).mapProvider == 2) {
                    r7 = r6;
                    backupImageView2.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 100, 100, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (String) null, (Drawable) null, messageObject);
                    r7 = r6;
                } else {
                    r7 = r6;
                    backupImageView2.setImage(AndroidUtilities.formapMapUrl(messageObject.currentAccount, d, d2, 100, 100, true, 15, -1), null, null);
                    r7 = r6;
                }
            }
        } else if (messageObject.type == 2) {
            if (this.audioViews.size() > 0) {
                frameLayout = this.audioViews.get(0);
                this.audioViews.remove(0);
                popupAudioView = (PopupAudioView) frameLayout.findViewWithTag(300);
            } else {
                frameLayout = new FrameLayout(this);
                FrameLayout frameLayout4 = new FrameLayout(this);
                frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout4.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                frameLayout.addView(frameLayout4, LayoutHelper.createFrame(-1, -1.0f));
                FrameLayout frameLayout5 = new FrameLayout(this);
                frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                PopupAudioView popupAudioView2 = new PopupAudioView(this);
                popupAudioView2.setTag(300);
                frameLayout5.addView(popupAudioView2);
                frameLayout.setTag(3);
                final int i6 = 1;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i6) {
                            case 0:
                                this.f$0.lambda$getViewForMessage$6(view);
                                break;
                            case 1:
                                this.f$0.lambda$getViewForMessage$7(view);
                                break;
                            default:
                                this.f$0.lambda$getViewForMessage$8(view);
                                break;
                        }
                    }
                });
                popupAudioView = popupAudioView2;
            }
            ViewGroup viewGroup2 = frameLayout;
            popupAudioView.setMessageObject(messageObject);
            r7 = viewGroup2;
            if (DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject)) {
                popupAudioView.downloadAudioIfNeed();
                r7 = viewGroup2;
            }
        } else {
            if (this.textViews.size() > 0) {
                ViewGroup viewGroup3 = this.textViews.get(0);
                this.textViews.remove(0);
                r3 = viewGroup3;
            } else {
                ?? frameLayout6 = new FrameLayout(this);
                ?? scrollView = new ScrollView(this);
                scrollView.setFillViewport(true);
                frameLayout6.addView(scrollView, LayoutHelper.createFrame(-1, -1.0f));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                scrollView.addView(linearLayout, LayoutHelper.createScroll(-1, -2, 1));
                linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                final int i7 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                this.f$0.lambda$getViewForMessage$6(view);
                                break;
                            case 1:
                                this.f$0.lambda$getViewForMessage$7(view);
                                break;
                            default:
                                this.f$0.lambda$getViewForMessage$8(view);
                                break;
                        }
                    }
                });
                TextView textView3 = new TextView(this);
                textView3.setTextSize(1, 16.0f);
                textView3.setTag(301);
                int i8 = Theme.key_windowBackgroundWhiteBlackText;
                textView3.setTextColor(Theme.getColor(null, i8, false));
                textView3.setLinkTextColor(Theme.getColor(null, i8, false));
                textView3.setGravity(17);
                linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 17));
                frameLayout6.setTag(1);
                r3 = frameLayout6;
            }
            TextView textView4 = (TextView) r3.findViewWithTag(301);
            textView4.setTextSize(2, SharedConfig.fontSize);
            textView4.setText(messageObject.messageText);
            r7 = r3;
        }
        r7 = r6;
        if (r7.getParent() == null) {
            this.messageContainer.addView(r7);
        }
        r7.setVisibility(0);
        if (z) {
            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r7.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = iDp;
            int i9 = this.currentMessageNum;
            if (size == i9) {
                r7.setTranslationX(0.0f);
            } else if (size == i9 - 1) {
                r7.setTranslationX(-iDp);
            } else if (size == i9 + 1) {
                r7.setTranslationX(iDp);
            }
            r7.setLayoutParams(layoutParams);
            r7.invalidate();
        }
        return r7;
    }

    private void handleIntent(Intent intent) {
        this.isReply = intent != null && intent.getBooleanExtra("force", false);
        this.popupMessages.clear();
        if (this.isReply) {
            int intExtra = intent != null ? intent.getIntExtra("currentAccount", UserConfig.selectedAccount) : UserConfig.selectedAccount;
            if (!UserConfig.isValidAccount(intExtra)) {
                return;
            } else {
                this.popupMessages.addAll(NotificationsController.getInstance(intExtra).popupReplyMessages);
            }
        } else {
            for (int i = 0; i < 4; i++) {
                if (UserConfig.getInstance(i).isClientActivated()) {
                    this.popupMessages.addAll(NotificationsController.getInstance(i).popupMessages);
                }
            }
        }
        if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() || !ApplicationLoader.isScreenOn) {
            getWindow().addFlags(2623490);
        } else {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        }
        if (this.currentMessageObject == null) {
            this.currentMessageNum = 0;
        }
        getNewMessage();
    }

    public static boolean lambda$getButtonsViewForMessage$4(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$getButtonsViewForMessage$5(int i, MessageObject messageObject, View view) {
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
        if (keyboardButtonProto != null) {
            SendMessagesHelper.getInstance(i).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
        }
    }

    public void lambda$getViewForMessage$6(View view) {
        openCurrentMessage();
    }

    public void lambda$getViewForMessage$7(View view) {
        openCurrentMessage();
    }

    public void lambda$getViewForMessage$8(View view) {
        openCurrentMessage();
    }

    public void lambda$onRequestPermissionsResult$0(AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onTouchEventMy$1() {
        this.animationInProgress = false;
        switchToPreviousMessage();
        AndroidUtilities.unlockOrientation(this);
    }

    public void lambda$onTouchEventMy$2() {
        this.animationInProgress = false;
        switchToNextMessage();
        AndroidUtilities.unlockOrientation(this);
    }

    public void lambda$onTouchEventMy$3() {
        this.animationInProgress = false;
        applyViewsLayoutParams(0);
        AndroidUtilities.unlockOrientation(this);
    }

    public void openCurrentMessage() {
        if (this.currentMessageObject == null) {
            return;
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        long dialogId = this.currentMessageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            intent.putExtra("encId", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            intent.putExtra("userId", dialogId);
        } else if (DialogObject.isChatDialog(dialogId)) {
            intent.putExtra("chatId", -dialogId);
        }
        intent.putExtra("currentAccount", this.currentMessageObject.currentAccount);
        intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent.setFlags(32768);
        startActivity(intent);
        onFinish();
        finish();
    }

    private void prepareLayouts(int i) {
        MessageObject messageObject;
        int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        if (i == 0) {
            reuseView(this.centerView);
            reuseView(this.leftView);
            reuseView(this.rightView);
            reuseButtonsView(this.centerButtonsView);
            reuseButtonsView(this.leftButtonsView);
            reuseButtonsView(this.rightButtonsView);
            int i2 = this.currentMessageNum - 1;
            while (true) {
                int i3 = this.currentMessageNum;
                if (i2 >= i3 + 2) {
                    break;
                }
                if (i2 == i3 - 1) {
                    this.leftView = getViewForMessage(i2, true);
                    this.leftButtonsView = getButtonsViewForMessage(i2, true);
                } else if (i2 == i3) {
                    this.centerView = getViewForMessage(i2, true);
                    this.centerButtonsView = getButtonsViewForMessage(i2, true);
                } else if (i2 == i3 + 1) {
                    this.rightView = getViewForMessage(i2, true);
                    this.rightButtonsView = getButtonsViewForMessage(i2, true);
                }
                i2++;
            }
        } else if (i == 1) {
            reuseView(this.rightView);
            reuseButtonsView(this.rightButtonsView);
            this.rightView = this.centerView;
            this.centerView = this.leftView;
            this.leftView = getViewForMessage(this.currentMessageNum - 1, true);
            this.rightButtonsView = this.centerButtonsView;
            this.centerButtonsView = this.leftButtonsView;
            this.leftButtonsView = getButtonsViewForMessage(this.currentMessageNum - 1, true);
        } else if (i == 2) {
            reuseView(this.leftView);
            reuseButtonsView(this.leftButtonsView);
            this.leftView = this.centerView;
            this.centerView = this.rightView;
            this.rightView = getViewForMessage(this.currentMessageNum + 1, true);
            this.leftButtonsView = this.centerButtonsView;
            this.centerButtonsView = this.rightButtonsView;
            this.rightButtonsView = getButtonsViewForMessage(this.currentMessageNum + 1, true);
        } else if (i == 3) {
            ViewGroup viewGroup = this.rightView;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                reuseView(this.rightView);
                ViewGroup viewForMessage = getViewForMessage(this.currentMessageNum + 1, false);
                this.rightView = viewForMessage;
                if (viewForMessage != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewForMessage.getLayoutParams();
                    layoutParams.width = iDp;
                    this.rightView.setLayoutParams(layoutParams);
                    this.rightView.setTranslationX(translationX);
                    this.rightView.invalidate();
                }
            }
            ViewGroup viewGroup2 = this.rightButtonsView;
            if (viewGroup2 != null) {
                float translationX2 = viewGroup2.getTranslationX();
                reuseButtonsView(this.rightButtonsView);
                LinearLayout buttonsViewForMessage = getButtonsViewForMessage(this.currentMessageNum + 1, false);
                this.rightButtonsView = buttonsViewForMessage;
                if (buttonsViewForMessage != null) {
                    buttonsViewForMessage.setTranslationX(translationX2);
                }
            }
        } else if (i == 4) {
            ViewGroup viewGroup3 = this.leftView;
            if (viewGroup3 != null) {
                float translationX3 = viewGroup3.getTranslationX();
                reuseView(this.leftView);
                ViewGroup viewForMessage2 = getViewForMessage(0, false);
                this.leftView = viewForMessage2;
                if (viewForMessage2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewForMessage2.getLayoutParams();
                    layoutParams2.width = iDp;
                    this.leftView.setLayoutParams(layoutParams2);
                    this.leftView.setTranslationX(translationX3);
                    this.leftView.invalidate();
                }
            }
            ViewGroup viewGroup4 = this.leftButtonsView;
            if (viewGroup4 != null) {
                float translationX4 = viewGroup4.getTranslationX();
                reuseButtonsView(this.leftButtonsView);
                LinearLayout buttonsViewForMessage2 = getButtonsViewForMessage(0, false);
                this.leftButtonsView = buttonsViewForMessage2;
                if (buttonsViewForMessage2 != null) {
                    buttonsViewForMessage2.setTranslationX(translationX4);
                }
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            int size = (this.currentMessageNum - 1) + i4;
            if (this.popupMessages.size() != 1 || (size >= 0 && size < this.popupMessages.size())) {
                if (size == -1) {
                    size = this.popupMessages.size() - 1;
                } else if (size == this.popupMessages.size()) {
                    size = 0;
                }
                messageObject = this.popupMessages.get(size);
            } else {
                messageObject = null;
            }
            this.setMessageObjects[i4] = messageObject;
        }
    }

    private void reuseButtonsView(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        this.popupContainer.removeView(viewGroup);
    }

    private void reuseView(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int iIntValue = ((Integer) viewGroup.getTag()).intValue();
        viewGroup.setVisibility(8);
        if (iIntValue == 1) {
            this.textViews.add(viewGroup);
        } else if (iIntValue == 2) {
            this.imageViews.add(viewGroup);
        } else if (iIntValue == 3) {
            this.audioViews.add(viewGroup);
        }
    }

    private void setTypingAnimation(boolean z) {
        if (this.actionBar == null) {
            return;
        }
        int i = 0;
        if (z) {
            try {
                Integer printingStringType = MessagesController.getInstance(this.currentMessageObject.currentAccount).getPrintingStringType(this.currentMessageObject.getDialogId(), 0L);
                this.onlineTextView.setCompoundDrawablesWithIntrinsicBounds(this.statusDrawables[printingStringType.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                this.onlineTextView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                while (i < this.statusDrawables.length) {
                    if (i == printingStringType.intValue()) {
                        this.statusDrawables[i].start();
                    } else {
                        this.statusDrawables[i].stop();
                    }
                    i++;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        this.onlineTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.onlineTextView.setCompoundDrawablePadding(0);
        while (true) {
            StatusDrawable[] statusDrawableArr = this.statusDrawables;
            if (i >= statusDrawableArr.length) {
                return;
            }
            statusDrawableArr[i].stop();
            i++;
        }
    }

    public void switchToNextMessage() {
        if (this.popupMessages.size() > 1) {
            if (this.currentMessageNum < this.popupMessages.size() - 1) {
                this.currentMessageNum++;
            } else {
                this.currentMessageNum = 0;
            }
            this.currentMessageObject = this.popupMessages.get(this.currentMessageNum);
            updateInterfaceForCurrentMessage(2);
            this.countText.setText(String.format("%d/%d", Integer.valueOf(this.currentMessageNum + 1), Integer.valueOf(this.popupMessages.size())));
        }
    }

    private void switchToPreviousMessage() {
        if (this.popupMessages.size() > 1) {
            int i = this.currentMessageNum;
            if (i > 0) {
                this.currentMessageNum = i - 1;
            } else {
                this.currentMessageNum = this.popupMessages.size() - 1;
            }
            this.currentMessageObject = this.popupMessages.get(this.currentMessageNum);
            updateInterfaceForCurrentMessage(1);
            this.countText.setText(String.format("%d/%d", Integer.valueOf(this.currentMessageNum + 1), Integer.valueOf(this.popupMessages.size())));
        }
    }

    private void updateInterfaceForCurrentMessage(int i) {
        if (this.actionBar == null) {
            return;
        }
        int i2 = this.lastResumedAccount;
        if (i2 != this.currentMessageObject.currentAccount) {
            if (i2 >= 0) {
                ConnectionsManager.getInstance(i2).setAppPaused(true, false);
            }
            int i3 = this.currentMessageObject.currentAccount;
            this.lastResumedAccount = i3;
            ConnectionsManager.getInstance(i3).setAppPaused(false, false);
        }
        this.currentChat = null;
        this.currentUser = null;
        long dialogId = this.currentMessageObject.getDialogId();
        this.chatActivityEnterView.setDialogId(dialogId, this.currentMessageObject.currentAccount);
        if (DialogObject.isEncryptedDialog(dialogId)) {
            this.currentUser = MessagesController.getInstance(this.currentMessageObject.currentAccount).getUser(Long.valueOf(MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentMessageObject.currentAccount), dialogId).user_id));
        } else if (DialogObject.isUserDialog(dialogId)) {
            this.currentUser = MessagesController.getInstance(this.currentMessageObject.currentAccount).getUser(Long.valueOf(dialogId));
        } else if (DialogObject.isChatDialog(dialogId)) {
            this.currentChat = MessagesController.getInstance(this.currentMessageObject.currentAccount).getChat(Long.valueOf(-dialogId));
            if (this.currentMessageObject.isFromUser()) {
                this.currentUser = MessagesController.getInstance(this.currentMessageObject.currentAccount).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.currentChat;
        if (chat != null) {
            this.nameTextView.setText(chat.title);
            TLRPC.User user = this.currentUser;
            if (user != null) {
                this.onlineTextView.setText(UserObject.getUserName(user));
            } else {
                this.onlineTextView.setText((CharSequence) null);
            }
            this.nameTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.nameTextView.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.currentUser;
            if (user2 != null) {
                this.nameTextView.setText(UserObject.getUserName(user2));
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    this.nameTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_white, 0, 0, 0);
                    this.nameTextView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                } else {
                    this.nameTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.nameTextView.setCompoundDrawablePadding(0);
                }
            }
        }
        prepareLayouts(i);
        updateSubtitle();
        checkAndUpdateAvatar();
        applyViewsLayoutParams(0);
    }

    private void updateSubtitle() {
        MessageObject messageObject;
        TLRPC.User user;
        String str;
        if (this.actionBar == null || (messageObject = this.currentMessageObject) == null || this.currentChat != null || (user = this.currentUser) == null) {
            return;
        }
        long j = user.id / 1000;
        if (j == 777 || j == 333 || ContactsController.getInstance(messageObject.currentAccount).contactsDict.get(Long.valueOf(this.currentUser.id)) != null || ((ContactsController.getInstance(this.currentMessageObject.currentAccount).contactsDict.size() == 0 && ContactsController.getInstance(this.currentMessageObject.currentAccount).isLoadingContacts()) || (str = this.currentUser.phone) == null || str.length() == 0)) {
            this.nameTextView.setText(UserObject.getUserName(this.currentUser));
        } else {
            this.nameTextView.setText(PhoneFormat.getInstance().format("+" + this.currentUser.phone));
        }
        TLRPC.User user2 = this.currentUser;
        if (user2 != null && user2.id == 489000) {
            this.onlineTextView.setText(LocaleController.getString(R.string.VerifyCodesNotifications));
            return;
        }
        if (user2 != null && user2.id == 777000) {
            this.onlineTextView.setText(LocaleController.getString(R.string.ServiceNotifications));
            return;
        }
        CharSequence printingString = MessagesController.getInstance(this.currentMessageObject.currentAccount).getPrintingString(this.currentMessageObject.getDialogId(), 0L, false);
        if (printingString != null && printingString.length() != 0) {
            this.lastPrintString = printingString;
            this.onlineTextView.setText(printingString);
            setTypingAnimation(true);
        } else {
            this.lastPrintString = null;
            setTypingAnimation(false);
            TLRPC.User user3 = MessagesController.getInstance(this.currentMessageObject.currentAccount).getUser(Long.valueOf(this.currentUser.id));
            if (user3 != null) {
                this.currentUser = user3;
            }
            this.onlineTextView.setText(LocaleController.formatUserStatus(this.currentMessageObject.currentAccount, this.currentUser));
        }
    }

    public boolean checkTransitionAnimation() {
        if (this.animationInProgress && this.animationStartTime < System.currentTimeMillis() - 400) {
            this.animationInProgress = false;
            Runnable runnable = this.onAnimationEndRunnable;
            if (runnable != null) {
                runnable.run();
                this.onAnimationEndRunnable = null;
            }
        }
        return this.animationInProgress;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        PopupAudioView popupAudioView;
        MessageObject messageObject;
        PopupAudioView popupAudioView2;
        MessageObject messageObject2;
        MessageObject messageObject3;
        if (i == NotificationCenter.appDidLogout) {
            if (i2 == this.lastResumedAccount) {
                onFinish();
                finish();
                return;
            }
            return;
        }
        int i3 = 0;
        if (i == NotificationCenter.pushMessagesUpdated) {
            if (this.isReply) {
                return;
            }
            this.popupMessages.clear();
            for (int i4 = 0; i4 < 4; i4++) {
                if (UserConfig.getInstance(i4).isClientActivated()) {
                    this.popupMessages.addAll(NotificationsController.getInstance(i4).popupMessages);
                }
            }
            getNewMessage();
            if (this.popupMessages.isEmpty()) {
                return;
            }
            for (int i5 = 0; i5 < 3; i5++) {
                int size = (this.currentMessageNum - 1) + i5;
                if (this.popupMessages.size() != 1 || (size >= 0 && size < this.popupMessages.size())) {
                    if (size == -1) {
                        size = this.popupMessages.size() - 1;
                    } else if (size == this.popupMessages.size()) {
                        size = 0;
                    }
                    messageObject3 = this.popupMessages.get(size);
                } else {
                    messageObject3 = null;
                }
                if (this.setMessageObjects[i5] != messageObject3) {
                    updateInterfaceForCurrentMessage(0);
                }
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            if (this.currentMessageObject == null || i2 != this.lastResumedAccount) {
                return;
            }
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_NAME & iIntValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & iIntValue) != 0) {
                updateSubtitle();
            }
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & iIntValue) != 0) {
                checkAndUpdateAvatar();
            }
            if ((iIntValue & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                CharSequence printingString = MessagesController.getInstance(this.currentMessageObject.currentAccount).getPrintingString(this.currentMessageObject.getDialogId(), 0L, false);
                CharSequence charSequence = this.lastPrintString;
                if ((charSequence == null || printingString != null) && ((charSequence != null || printingString == null) && (charSequence == null || charSequence.equals(printingString)))) {
                    return;
                }
                updateSubtitle();
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidReset) {
            Integer num = (Integer) objArr[0];
            ViewGroup viewGroup = this.messageContainer;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                while (i3 < childCount) {
                    View childAt = this.messageContainer.getChildAt(i3);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (popupAudioView2 = (PopupAudioView) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.currentAccount == i2 && messageObject2.getId() == num.intValue()) {
                        popupAudioView2.updateButtonState();
                        return;
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num2 = (Integer) objArr[0];
            ViewGroup viewGroup2 = this.messageContainer;
            if (viewGroup2 != null) {
                int childCount2 = viewGroup2.getChildCount();
                while (i3 < childCount2) {
                    View childAt2 = this.messageContainer.getChildAt(i3);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (popupAudioView = (PopupAudioView) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.currentAccount == i2 && messageObject.getId() == num2.intValue()) {
                        popupAudioView.updateProgress();
                        return;
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        if (i != NotificationCenter.emojiLoaded) {
            if (i == NotificationCenter.contactsDidLoad && i2 == this.lastResumedAccount) {
                updateSubtitle();
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.messageContainer;
        if (viewGroup3 != null) {
            int childCount3 = viewGroup3.getChildCount();
            while (i3 < childCount3) {
                View childAt3 = this.messageContainer.getChildAt(i3);
                if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                    textView.invalidate();
                }
                i3++;
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (this.chatActivityEnterView.isPopupShowing()) {
            this.chatActivityEnterView.hidePopup(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        fixLayout();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Theme.createDialogsResources(this);
        Theme.createChatResources(this);
        AndroidUtilities.fillStatusBarHeight(this, false);
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.statusDrawables[0] = new TypingDotsDrawable(false);
        this.statusDrawables[1] = new RecordStatusDrawable(false);
        this.statusDrawables[2] = new SendingFileDrawable(false);
        this.statusDrawables[3] = new PlayingGameDrawable(false, null);
        this.statusDrawables[4] = new RoundStatusDrawable(false);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(this) {
            @Override
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                int i6;
                int i7;
                int measuredWidth;
                int i8;
                int i9;
                int measuredHeight;
                int childCount = getChildCount();
                int emojiPadding = measureKeyboardHeight() <= AndroidUtilities.dp(20.0f) ? PopupNotificationActivity.this.chatActivityEnterView.getEmojiPadding() : 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        int i11 = layoutParams.gravity;
                        if (i11 == -1) {
                            i11 = 51;
                        }
                        int i12 = i11 & 112;
                        int i13 = i11 & 7;
                        if (i13 != 1) {
                            if (i13 != 5) {
                                measuredWidth = layoutParams.leftMargin;
                            } else {
                                i6 = i4 - measuredWidth2;
                                i7 = layoutParams.rightMargin;
                            }
                            if (i12 != 16) {
                                if (i12 != 80) {
                                    measuredHeight = layoutParams.topMargin;
                                } else {
                                    i8 = ((i5 - emojiPadding) - i3) - measuredHeight2;
                                    i9 = layoutParams.bottomMargin;
                                }
                                if (PopupNotificationActivity.this.chatActivityEnterView.isPopupView(childAt)) {
                                    if (emojiPadding != 0) {
                                        measuredHeight = getMeasuredHeight() - emojiPadding;
                                    } else {
                                        measuredHeight = getMeasuredHeight();
                                    }
                                } else if (PopupNotificationActivity.this.chatActivityEnterView.isRecordCircle(childAt)) {
                                    measuredHeight = ((PopupNotificationActivity.this.popupContainer.getMeasuredHeight() + PopupNotificationActivity.this.popupContainer.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                    measuredWidth = ((PopupNotificationActivity.this.popupContainer.getMeasuredWidth() + PopupNotificationActivity.this.popupContainer.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                                }
                                childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
                            } else {
                                i8 = ((((i5 - emojiPadding) - i3) - measuredHeight2) / 2) + layoutParams.topMargin;
                                i9 = layoutParams.bottomMargin;
                            }
                            measuredHeight = i8 - i9;
                            if (PopupNotificationActivity.this.chatActivityEnterView.isPopupView(childAt)) {
                                if (emojiPadding != 0) {
                                    measuredHeight = getMeasuredHeight() - emojiPadding;
                                } else {
                                    measuredHeight = getMeasuredHeight();
                                }
                            } else if (PopupNotificationActivity.this.chatActivityEnterView.isRecordCircle(childAt)) {
                                measuredHeight = ((PopupNotificationActivity.this.popupContainer.getMeasuredHeight() + PopupNotificationActivity.this.popupContainer.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                measuredWidth = ((PopupNotificationActivity.this.popupContainer.getMeasuredWidth() + PopupNotificationActivity.this.popupContainer.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                            }
                            childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
                        } else {
                            i6 = (((i4 - i2) - measuredWidth2) / 2) + layoutParams.leftMargin;
                            i7 = layoutParams.rightMargin;
                        }
                        measuredWidth = i6 - i7;
                        if (i12 != 16) {
                            if (i12 != 80) {
                                measuredHeight = layoutParams.topMargin;
                            } else {
                                i8 = ((i5 - emojiPadding) - i3) - measuredHeight2;
                                i9 = layoutParams.bottomMargin;
                            }
                            if (PopupNotificationActivity.this.chatActivityEnterView.isPopupView(childAt)) {
                                if (emojiPadding != 0) {
                                    measuredHeight = getMeasuredHeight() - emojiPadding;
                                } else {
                                    measuredHeight = getMeasuredHeight();
                                }
                            } else if (PopupNotificationActivity.this.chatActivityEnterView.isRecordCircle(childAt)) {
                                measuredHeight = ((PopupNotificationActivity.this.popupContainer.getMeasuredHeight() + PopupNotificationActivity.this.popupContainer.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                measuredWidth = ((PopupNotificationActivity.this.popupContainer.getMeasuredWidth() + PopupNotificationActivity.this.popupContainer.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                            }
                            childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
                        } else {
                            i8 = ((((i5 - emojiPadding) - i3) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i9 = layoutParams.bottomMargin;
                        }
                        measuredHeight = i8 - i9;
                        if (PopupNotificationActivity.this.chatActivityEnterView.isPopupView(childAt)) {
                            if (emojiPadding != 0) {
                                measuredHeight = getMeasuredHeight() - emojiPadding;
                            } else {
                                measuredHeight = getMeasuredHeight();
                            }
                        } else if (PopupNotificationActivity.this.chatActivityEnterView.isRecordCircle(childAt)) {
                            measuredHeight = ((PopupNotificationActivity.this.popupContainer.getMeasuredHeight() + PopupNotificationActivity.this.popupContainer.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                            measuredWidth = ((PopupNotificationActivity.this.popupContainer.getMeasuredWidth() + PopupNotificationActivity.this.popupContainer.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                        }
                        childAt.layout(measuredWidth, measuredHeight, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
                    }
                }
                notifyHeightChanged();
            }

            @Override
            public void onMeasure(int i2, int i3) {
                int i4;
                View.MeasureSpec.getMode(i2);
                View.MeasureSpec.getMode(i3);
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                setMeasuredDimension(size, size2);
                if (measureKeyboardHeight() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= PopupNotificationActivity.this.chatActivityEnterView.getEmojiPadding();
                }
                int childCount = getChildCount();
                int i5 = 0;
                while (i5 < childCount) {
                    View childAt = getChildAt(i5);
                    if (childAt.getVisibility() == 8) {
                        i4 = i3;
                    } else if (PopupNotificationActivity.this.chatActivityEnterView.isPopupView(childAt)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        i4 = i3;
                    } else if (PopupNotificationActivity.this.chatActivityEnterView.isRecordCircle(childAt)) {
                        i4 = i3;
                        measureChildWithMargins(childAt, i2, 0, i4, 0);
                    } else {
                        i4 = i3;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + size2), 1073741824));
                    }
                    i5++;
                    i3 = i4;
                }
            }
        };
        setContentView(sizeNotifierFrameLayout);
        sizeNotifierFrameLayout.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        sizeNotifierFrameLayout.addView(relativeLayout, LayoutHelper.createFrame(-1, -1.0f));
        RelativeLayout relativeLayout2 = new RelativeLayout(this) {
            @Override
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getTag() instanceof String) {
                        childAt.layout(childAt.getLeft(), AndroidUtilities.dp(3.0f) + PopupNotificationActivity.this.chatActivityEnterView.getTop(), childAt.getRight(), PopupNotificationActivity.this.chatActivityEnterView.getBottom());
                    }
                }
            }

            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                int measuredWidth = PopupNotificationActivity.this.chatActivityEnterView.getMeasuredWidth();
                int measuredHeight = PopupNotificationActivity.this.chatActivityEnterView.getMeasuredHeight();
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getTag() instanceof String) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight - AndroidUtilities.dp(3.0f), 1073741824));
                    }
                }
            }
        };
        this.popupContainer = relativeLayout2;
        relativeLayout2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        relativeLayout.addView(this.popupContainer, LayoutHelper.createRelative(-1, 240, 12, 0, 12, 0, 13));
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onDestroy();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, sizeNotifierFrameLayout, null, false);
        this.chatActivityEnterView = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.popupContainer.addView(this.chatActivityEnterView, LayoutHelper.createRelative(-1, -2, 12));
        this.chatActivityEnterView.setDelegate(new ChatActivityEnterView.ChatActivityEnterViewDelegate() {
            @Override
            public final void bottomPanelTranslationYChanged(float f) {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$bottomPanelTranslationYChanged(this, f);
            }

            @Override
            public final boolean checkCanRemoveRestrictionsByBoosts() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$checkCanRemoveRestrictionsByBoosts(this);
            }

            @Override
            public void didPressAttachButton() {
            }

            @Override
            public final void didPressStreamingStop() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$didPressStreamingStop(this);
            }

            @Override
            public final void didPressSuggestionButton() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$didPressSuggestionButton(this);
            }

            @Override
            public final int getContentViewHeight() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getContentViewHeight(this);
            }

            @Override
            public final TLRPC.Peer getDefaultSendAs() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getDefaultSendAs(this);
            }

            @Override
            public final ChatActivity.ReplyQuote getReplyQuote() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyQuote(this);
            }

            @Override
            public final TL_stories.StoryItem getReplyToStory() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyToStory(this);
            }

            @Override
            public final TLRPC.TL_channels_sendAsPeers getSendAsPeers() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getSendAsPeers(this);
            }

            @Override
            public final boolean hasForwardingMessages() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasForwardingMessages(this);
            }

            @Override
            public final boolean hasScheduledMessages() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasScheduledMessages(this);
            }

            @Override
            public boolean isVideoRecordingPaused() {
                return false;
            }

            @Override
            public final int measureKeyboardHeight() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$measureKeyboardHeight(this);
            }

            @Override
            public void needChangeVideoPreviewState(int i2, float f) {
            }

            @Override
            public void needSendTyping() {
                if (PopupNotificationActivity.this.currentMessageObject != null) {
                    MessagesController.getInstance(PopupNotificationActivity.this.currentMessageObject.currentAccount).sendTyping(PopupNotificationActivity.this.currentMessageObject.getDialogId(), 0L, 0, PopupNotificationActivity.this.classGuid);
                }
            }

            @Override
            public void needShowMediaBanHint() {
            }

            @Override
            public void needStartRecordAudio(int i2) {
            }

            @Override
            public void needStartRecordVideo(int i2, boolean z, int i3, int i4, int i5, long j, long j2) {
            }

            @Override
            public void onAttachButtonHidden() {
            }

            @Override
            public void onAttachButtonShow() {
            }

            @Override
            public void onAudioVideoInterfaceUpdated() {
            }

            @Override
            public final void onContextMenuClose() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onContextMenuClose(this);
            }

            @Override
            public final void onContextMenuOpen() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onContextMenuOpen(this);
            }

            @Override
            public final void onEditTextScroll() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onEditTextScroll(this);
            }

            @Override
            public final void onEmojiViewTabChanged() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onEmojiViewTabChanged(this);
            }

            @Override
            public final void onKeyboardRequested() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onKeyboardRequested(this);
            }

            @Override
            public void onMessageEditEnd(boolean z) {
            }

            @Override
            public void onMessageSend(CharSequence charSequence, boolean z, int i2, int i3, long j) {
                if (PopupNotificationActivity.this.currentMessageObject == null) {
                    return;
                }
                if (PopupNotificationActivity.this.currentMessageNum >= 0 && PopupNotificationActivity.this.currentMessageNum < PopupNotificationActivity.this.popupMessages.size()) {
                    PopupNotificationActivity.this.popupMessages.remove(PopupNotificationActivity.this.currentMessageNum);
                }
                MessagesController.getInstance(PopupNotificationActivity.this.currentMessageObject.currentAccount).markDialogAsRead(PopupNotificationActivity.this.currentMessageObject.getDialogId(), PopupNotificationActivity.this.currentMessageObject.getId(), Math.max(0, PopupNotificationActivity.this.currentMessageObject.getId()), PopupNotificationActivity.this.currentMessageObject.messageOwner.date, true, 0L, 0, true, 0);
                PopupNotificationActivity.this.currentMessageObject = null;
                PopupNotificationActivity.this.getNewMessage();
            }

            @Override
            public void onPreAudioVideoRecord() {
            }

            @Override
            public void onSendLongClick() {
            }

            @Override
            public void onStickersExpandedChange() {
            }

            @Override
            public void onStickersTab(boolean z) {
            }

            @Override
            public void onSwitchRecordMode(boolean z) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, boolean z, boolean z2) {
            }

            @Override
            public void onTextSelectionChanged(int i2, int i3) {
            }

            @Override
            public void onTextSpansChanged(CharSequence charSequence) {
            }

            @Override
            public final void onTrendingStickersShowed(boolean z) {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onTrendingStickersShowed(this, z);
            }

            @Override
            public void onUpdateSlowModeButton(View view, boolean z, CharSequence charSequence) {
            }

            @Override
            public void onWindowSizeChanged(int i2) {
            }

            @Override
            public final boolean onceVoiceAvailable() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onceVoiceAvailable(this);
            }

            @Override
            public final void openScheduledMessages() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$openScheduledMessages(this);
            }

            @Override
            public final void prepareMessageSending() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$prepareMessageSending(this);
            }

            @Override
            public final void scrollToSendingMessage() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$scrollToSendingMessage(this);
            }

            @Override
            public final boolean setDefaultSendAs(long j, long j2) {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$setDefaultSendAs(this, j, j2);
            }

            @Override
            public void toggleVideoRecordingPause() {
            }
        });
        FrameLayoutTouch frameLayoutTouch = new FrameLayoutTouch(this);
        this.messageContainer = frameLayoutTouch;
        this.popupContainer.addView(frameLayoutTouch, 0);
        ActionBar actionBar = new ActionBar(this, null);
        this.actionBar = actionBar;
        actionBar.setOccupyStatusBar(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_close_white);
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefault, false));
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefaultSelector, false), false);
        this.popupContainer.addView(this.actionBar);
        ViewGroup.LayoutParams layoutParams = this.actionBar.getLayoutParams();
        layoutParams.width = -1;
        this.actionBar.setLayoutParams(layoutParams);
        ActionBarMenuItem actionBarMenuItemAddItemWithWidth = this.actionBar.createMenu().addItemWithWidth(2, 0, AndroidUtilities.dp(56.0f));
        TextView textView = new TextView(this);
        this.countText = textView;
        int i2 = Theme.key_actionBarDefaultSubtitle;
        textView.setTextColor(Theme.getColor(null, i2, false));
        this.countText.setTextSize(1, 14.0f);
        this.countText.setGravity(17);
        actionBarMenuItemAddItemWithWidth.addView(this.countText, LayoutHelper.createFrame(56, -1.0f));
        FrameLayout frameLayout = new FrameLayout(this);
        this.avatarContainer = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        this.actionBar.addView(this.avatarContainer);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.avatarContainer.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = AndroidUtilities.dp(48.0f);
        layoutParams2.leftMargin = AndroidUtilities.dp(60.0f);
        layoutParams2.gravity = 51;
        this.avatarContainer.setLayoutParams(layoutParams2);
        BackupImageView backupImageView = new BackupImageView(this);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.avatarContainer.addView(this.avatarImageView);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.avatarImageView.getLayoutParams();
        layoutParams3.width = AndroidUtilities.dp(42.0f);
        layoutParams3.height = AndroidUtilities.dp(42.0f);
        layoutParams3.topMargin = AndroidUtilities.dp(3.0f);
        this.avatarImageView.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.nameTextView = textView2;
        textView2.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultTitle, false));
        this.nameTextView.setTextSize(1, 18.0f);
        this.nameTextView.setLines(1);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setSingleLine(true);
        TextView textView3 = this.nameTextView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.nameTextView.setGravity(3);
        this.nameTextView.setTypeface(AndroidUtilities.bold());
        this.avatarContainer.addView(this.nameTextView);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.nameTextView.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams4.bottomMargin = AndroidUtilities.dp(22.0f);
        layoutParams4.gravity = 80;
        this.nameTextView.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.onlineTextView = textView4;
        textView4.setTextColor(Theme.getColor(null, i2, false));
        this.onlineTextView.setTextSize(1, 14.0f);
        this.onlineTextView.setLines(1);
        this.onlineTextView.setMaxLines(1);
        this.onlineTextView.setSingleLine(true);
        this.onlineTextView.setEllipsize(truncateAt);
        this.onlineTextView.setGravity(3);
        this.avatarContainer.addView(this.onlineTextView);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.onlineTextView.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = AndroidUtilities.dp(54.0f);
        layoutParams5.bottomMargin = AndroidUtilities.dp(4.0f);
        layoutParams5.gravity = 80;
        this.onlineTextView.setLayoutParams(layoutParams5);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    PopupNotificationActivity.this.onFinish();
                    PopupNotificationActivity.this.finish();
                } else if (i3 == 1) {
                    PopupNotificationActivity.this.openCurrentMessage();
                } else if (i3 == 2) {
                    PopupNotificationActivity.this.switchToNextMessage();
                }
            }
        });
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(268435462, "screen");
        this.wakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        handleIntent(getIntent());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        onFinish();
        MediaController.getInstance().setFeedbackView(this.chatActivityEnterView, false);
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        BackupImageView backupImageView = this.avatarImageView;
        if (backupImageView != null) {
            backupImageView.setImageDrawable(null);
        }
    }

    public void onFinish() {
        if (this.finished) {
            return;
        }
        this.finished = true;
        if (this.isReply) {
            this.popupMessages.clear();
        }
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.appDidLogout);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.updateInterfaces);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.contactsDidLoad);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onDestroy();
        }
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.hidePopup(false);
            this.chatActivityEnterView.setFieldFocused(false);
        }
        int i = this.lastResumedAccount;
        if (i >= 0) {
            ConnectionsManager.getInstance(i).setAppPaused(true, false);
        }
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 3 || iArr[0] == 0) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, 0, null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setMessage(LocaleController.getString(R.string.PermissionNoAudioWithHint));
        builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new TodoItemMenu$$ExternalSyntheticLambda3(this, 14));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        MediaController.getInstance().setFeedbackView(this.chatActivityEnterView, true);
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        fixLayout();
        checkAndUpdateAvatar();
        this.wakeLock.acquire(7000L);
    }

    public boolean onTouchEventMy(MotionEvent motionEvent) {
        char c;
        float translationX;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        if (checkTransitionAnimation()) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.moveStartX = motionEvent.getX();
        } else if (motionEvent != null && motionEvent.getAction() == 2) {
            float x = motionEvent.getX();
            float f = this.moveStartX;
            int i4 = (int) (x - f);
            if (f != -1.0f && !this.startedMoving && Math.abs(i4) > AndroidUtilities.dp(10.0f)) {
                this.startedMoving = true;
                this.moveStartX = x;
                AndroidUtilities.lockOrientation(this);
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                i4 = 0;
            }
            if (this.startedMoving) {
                if (this.leftView == null && i4 > 0) {
                    i4 = 0;
                }
                i3 = (this.rightView != null || i4 >= 0) ? i4 : 0;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                applyViewsLayoutParams(i3);
            }
        } else if (motionEvent == null || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent == null || !this.startedMoving) {
                applyViewsLayoutParams(0);
            } else {
                int x2 = (int) (motionEvent.getX() - this.moveStartX);
                int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.computeCurrentVelocity(1000);
                    if (this.velocityTracker.getXVelocity() >= 3500.0f) {
                        c = 1;
                    } else if (this.velocityTracker.getXVelocity() <= -3500.0f) {
                        c = 2;
                    } else {
                        c = 0;
                    }
                } else {
                    c = 0;
                }
                if ((c == 1 || x2 > iDp / 3) && this.leftView != null) {
                    translationX = iDp - this.centerView.getTranslationX();
                    viewGroup = this.leftView;
                    viewGroup2 = this.leftButtonsView;
                    this.onAnimationEndRunnable = new Runnable(this) {
                        public final PopupNotificationActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    this.f$0.lambda$onTouchEventMy$1();
                                    break;
                                case 1:
                                    this.f$0.lambda$onTouchEventMy$2();
                                    break;
                                default:
                                    this.f$0.lambda$onTouchEventMy$3();
                                    break;
                            }
                        }
                    };
                } else if ((c == 2 || x2 < (-iDp) / 3) && this.rightView != null) {
                    translationX = (-iDp) - this.centerView.getTranslationX();
                    viewGroup = this.rightView;
                    viewGroup2 = this.rightButtonsView;
                    this.onAnimationEndRunnable = new Runnable(this) {
                        public final PopupNotificationActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.f$0.lambda$onTouchEventMy$1();
                                    break;
                                case 1:
                                    this.f$0.lambda$onTouchEventMy$2();
                                    break;
                                default:
                                    this.f$0.lambda$onTouchEventMy$3();
                                    break;
                            }
                        }
                    };
                } else if (this.centerView.getTranslationX() != 0.0f) {
                    float f2 = -this.centerView.getTranslationX();
                    ViewGroup viewGroup3 = x2 > 0 ? this.leftView : this.rightView;
                    ViewGroup viewGroup4 = x2 > 0 ? this.leftButtonsView : this.rightButtonsView;
                    this.onAnimationEndRunnable = new Runnable(this) {
                        public final PopupNotificationActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i) {
                                case 0:
                                    this.f$0.lambda$onTouchEventMy$1();
                                    break;
                                case 1:
                                    this.f$0.lambda$onTouchEventMy$2();
                                    break;
                                default:
                                    this.f$0.lambda$onTouchEventMy$3();
                                    break;
                            }
                        }
                    };
                    viewGroup2 = viewGroup4;
                    translationX = f2;
                    viewGroup = viewGroup3;
                } else {
                    viewGroup = null;
                    viewGroup2 = null;
                    translationX = 0.0f;
                }
                if (translationX != 0.0f) {
                    int iAbs = (int) (Math.abs(translationX / iDp) * 200.0f);
                    ArrayList arrayList = new ArrayList();
                    ViewGroup viewGroup5 = this.centerView;
                    arrayList.add(ObjectAnimator.ofFloat(viewGroup5, "translationX", viewGroup5.getTranslationX() + translationX));
                    ViewGroup viewGroup6 = this.centerButtonsView;
                    if (viewGroup6 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(viewGroup6, "translationX", viewGroup6.getTranslationX() + translationX));
                    }
                    if (viewGroup != null) {
                        arrayList.add(ObjectAnimator.ofFloat(viewGroup, "translationX", viewGroup.getTranslationX() + translationX));
                    }
                    if (viewGroup2 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(viewGroup2, "translationX", viewGroup2.getTranslationX() + translationX));
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(iAbs);
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (PopupNotificationActivity.this.onAnimationEndRunnable != null) {
                                PopupNotificationActivity.this.onAnimationEndRunnable.run();
                                PopupNotificationActivity.this.onAnimationEndRunnable = null;
                            }
                        }
                    });
                    animatorSet.start();
                    this.animationInProgress = true;
                    this.animationStartTime = System.currentTimeMillis();
                }
            }
            VelocityTracker velocityTracker4 = this.velocityTracker;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.velocityTracker = null;
            }
            this.startedMoving = false;
            this.moveStartX = -1.0f;
        }
        return this.startedMoving;
    }

    public class FrameLayoutTouch extends FrameLayout {
        public FrameLayoutTouch(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return PopupNotificationActivity.this.checkTransitionAnimation() || ((PopupNotificationActivity) getContext()).onTouchEventMy(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return PopupNotificationActivity.this.checkTransitionAnimation() || ((PopupNotificationActivity) getContext()).onTouchEventMy(motionEvent);
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            ((PopupNotificationActivity) getContext()).onTouchEventMy(null);
            super.requestDisallowInterceptTouchEvent(z);
        }

        public FrameLayoutTouch(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public FrameLayoutTouch(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }
}
