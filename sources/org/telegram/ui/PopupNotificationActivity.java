package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
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
import org.telegram.ui.Components.StatusDrawable;
import org.telegram.ui.Components.TypingDotsDrawable;

public class PopupNotificationActivity extends Activity implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public ActionBar actionBar;
    public FrameLayout avatarContainer;
    public BackupImageView avatarImageView;
    public LinearLayout centerButtonsView;
    public ViewGroup centerView;
    public ChatActivityEnterView chatActivityEnterView;
    public int classGuid;
    public TextView countText;
    public TLRPC.Chat currentChat;
    public TLRPC.User currentUser;
    public boolean isReply;
    public CharSequence lastPrintString;
    public LinearLayout leftButtonsView;
    public ViewGroup leftView;
    public LoginActivity.AnonymousClass4 messageContainer;
    public TextView nameTextView;
    public TextView onlineTextView;
    public AnonymousClass2 popupContainer;
    public LinearLayout rightButtonsView;
    public ViewGroup rightView;
    public final ArrayList textViews = new ArrayList();
    public final ArrayList imageViews = new ArrayList();
    public final ArrayList audioViews = new ArrayList();
    public VelocityTracker velocityTracker = null;
    public final StatusDrawable[] statusDrawables = new StatusDrawable[5];
    public int lastResumedAccount = -1;
    public boolean finished = false;
    public MessageObject currentMessageObject = null;
    public final MessageObject[] setMessageObjects = new MessageObject[3];
    public int currentMessageNum = 0;
    public PowerManager.WakeLock wakeLock = null;
    public boolean animationInProgress = false;
    public long animationStartTime = 0;
    public float moveStartX = -1.0f;
    public boolean startedMoving = false;
    public Runnable onAnimationEndRunnable = null;
    public final ArrayList popupMessages = new ArrayList();

    public final class AnonymousClass6 implements ViewTreeObserver.OnPreDrawListener {
        public final int $r8$classId;
        public final PopupNotificationActivity this$0;

        public AnonymousClass6(PopupNotificationActivity popupNotificationActivity, int i) {
            this.$r8$classId = i;
            this.this$0 = popupNotificationActivity;
        }

        @Override
        public final boolean onPreDraw() {
            switch (this.$r8$classId) {
                case 0:
                    PopupNotificationActivity popupNotificationActivity = this.this$0;
                    FrameLayout frameLayout = popupNotificationActivity.avatarContainer;
                    if (frameLayout != null) {
                        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    int iM$2 = OKLCH.m$2(48.0f, ActionBar.getCurrentActionBarHeight(), 2);
                    FrameLayout frameLayout2 = popupNotificationActivity.avatarContainer;
                    frameLayout2.setPadding(frameLayout2.getPaddingLeft(), iM$2, popupNotificationActivity.avatarContainer.getPaddingRight(), iM$2);
                    break;
                default:
                    PopupNotificationActivity popupNotificationActivity2 = this.this$0;
                    popupNotificationActivity2.messageContainer.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (!popupNotificationActivity2.checkTransitionAnimation() && !popupNotificationActivity2.startedMoving) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.messageContainer.getLayoutParams();
                        marginLayoutParams.topMargin = ActionBar.getCurrentActionBarHeight();
                        marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                        marginLayoutParams.width = -1;
                        marginLayoutParams.height = -1;
                        popupNotificationActivity2.messageContainer.setLayoutParams(marginLayoutParams);
                        popupNotificationActivity2.applyViewsLayoutParams(0);
                        break;
                    }
                    break;
            }
            return true;
        }
    }

    public final void applyViewsLayoutParams(int i) {
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
        LinearLayout linearLayout = this.leftButtonsView;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-iDp) + i);
        }
        ViewGroup viewGroup2 = this.centerView;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != iDp) {
                layoutParams2.width = iDp;
                this.centerView.setLayoutParams(layoutParams2);
            }
            this.centerView.setTranslationX(i);
        }
        LinearLayout linearLayout2 = this.centerButtonsView;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i);
        }
        ViewGroup viewGroup3 = this.rightView;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != iDp) {
                layoutParams3.width = iDp;
                this.rightView.setLayoutParams(layoutParams3);
            }
            this.rightView.setTranslationX(iDp + i);
        }
        LinearLayout linearLayout3 = this.rightButtonsView;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(iDp + i);
        }
        this.messageContainer.invalidate();
    }

    public final void checkAndUpdateAvatar$1() {
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
                AvatarDrawable avatarDrawable = new AvatarDrawable(this.currentChat);
                BackupImageView backupImageView = this.avatarImageView;
                backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                backupImageView.onNewImageSet();
                return;
            }
            return;
        }
        if (this.currentUser == null || (user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(this.currentUser.id))) == null) {
            return;
        }
        this.currentUser = user;
        if (this.avatarImageView != null) {
            AvatarDrawable avatarDrawable2 = new AvatarDrawable(this.currentUser);
            BackupImageView backupImageView2 = this.avatarImageView;
            backupImageView2.imageReceiver.setForUserOrChat(user, avatarDrawable2);
            backupImageView2.onNewImageSet();
        }
    }

    public final boolean checkTransitionAnimation() {
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
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        PopupAudioView popupAudioView;
        MessageObject messageObject;
        PopupAudioView popupAudioView2;
        MessageObject messageObject2;
        MessageObject messageObject3;
        if (i == NotificationCenter.appDidLogout) {
            if (i2 == this.lastResumedAccount) {
                onFinish$1();
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
            ArrayList arrayList = this.popupMessages;
            arrayList.clear();
            for (int i4 = 0; i4 < 4; i4++) {
                if (UserConfig.getInstance(i4).isClientActivated()) {
                    arrayList.addAll(NotificationsController.getInstance(i4).popupMessages);
                }
            }
            getNewMessage();
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i5 = 0; i5 < 3; i5++) {
                int size = (this.currentMessageNum - 1) + i5;
                if (arrayList.size() != 1 || (size >= 0 && size < arrayList.size())) {
                    if (size == -1) {
                        size = arrayList.size() - 1;
                    } else if (size == arrayList.size()) {
                        size = 0;
                    }
                    messageObject3 = (MessageObject) arrayList.get(size);
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
                updateSubtitle$2();
            }
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & iIntValue) != 0) {
                checkAndUpdateAvatar$1();
            }
            if ((iIntValue & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                CharSequence printingString = MessagesController.getInstance(this.currentMessageObject.currentAccount).getPrintingString(this.currentMessageObject.getDialogId(), 0L, false);
                CharSequence charSequence = this.lastPrintString;
                if ((charSequence == null || printingString != null) && ((charSequence != null || printingString == null) && (charSequence == null || charSequence.equals(printingString)))) {
                    return;
                }
                updateSubtitle$2();
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidReset) {
            Integer num = (Integer) objArr[0];
            LoginActivity.AnonymousClass4 anonymousClass4 = this.messageContainer;
            if (anonymousClass4 != null) {
                int childCount = anonymousClass4.getChildCount();
                while (i3 < childCount) {
                    View childAt = this.messageContainer.getChildAt(i3);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (popupAudioView2 = (PopupAudioView) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.currentAccount == i2 && messageObject2.getId() == num.intValue()) {
                        popupAudioView2.updateButtonState$1();
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
            LoginActivity.AnonymousClass4 anonymousClass5 = this.messageContainer;
            if (anonymousClass5 != null) {
                int childCount2 = anonymousClass5.getChildCount();
                while (i3 < childCount2) {
                    View childAt2 = this.messageContainer.getChildAt(i3);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (popupAudioView = (PopupAudioView) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.currentAccount == i2 && messageObject.getId() == num2.intValue()) {
                        popupAudioView.updateProgress$1();
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
                updateSubtitle$2();
                return;
            }
            return;
        }
        LoginActivity.AnonymousClass4 anonymousClass6 = this.messageContainer;
        if (anonymousClass6 != null) {
            int childCount3 = anonymousClass6.getChildCount();
            while (i3 < childCount3) {
                View childAt3 = this.messageContainer.getChildAt(i3);
                if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                    textView.invalidate();
                }
                i3++;
            }
        }
    }

    public final LinearLayout getButtonsViewForMessage(int i, boolean z) {
        int i2;
        ?? r4;
        ?? r10;
        ?? r6;
        Object obj;
        int size = i;
        ArrayList arrayList = this.popupMessages;
        Object obj2 = null;
        if (arrayList.size() == 1 && (size < 0 || size >= arrayList.size())) {
            return null;
        }
        boolean z2 = false;
        if (size == -1) {
            size = arrayList.size() - 1;
        } else if (size == arrayList.size()) {
            size = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(size);
        TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
        if (messageObject.getDialogId() == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList2 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size2 = arrayList2.size();
            i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList2.get(i3);
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
            r4 = 0;
        } else {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size4 = arrayList3.size();
            ?? r11 = 0;
            int i6 = 0;
            while (i6 < size4) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList3.get(i6);
                int size5 = keyboardInlineButtonRow2.buttons.size();
                int i7 = 0;
                while (i7 < size5) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i7);
                    if (TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (r10 == 0) {
                            ?? linearLayout = new LinearLayout(this);
                            linearLayout.setOrientation(r6);
                            linearLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, r6));
                            linearLayout.setWeightSum(100.0f);
                            linearLayout.setTag("b");
                            linearLayout.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(28));
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
                        r10.addView(textView, LayoutHelper.createLinear(100.0f / i2, -1, -1));
                        textView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(messageObject, i5));
                    } else {
                        r6 = z2;
                        r10 = r11;
                        arrayList3 = arrayList3;
                        obj = obj2;
                    }
                    i7++;
                    obj2 = obj;
                    size4 = size4;
                    arrayList3 = arrayList3;
                    r6 = 0;
                    r10 = r10;
                }
                r6 = z2;
                r10 = r11;
                i6++;
                size4 = size4;
                arrayList3 = arrayList3;
                z2 = false;
                r11 = r10;
            }
            r4 = r11;
        }
        if (r4 != 0) {
            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z) {
                int i8 = this.currentMessageNum;
                if (size == i8) {
                    r4.setTranslationX(0.0f);
                } else if (size == i8 - 1) {
                    r4.setTranslationX(-iDp);
                } else if (size == i8 + 1) {
                    r4.setTranslationX(iDp);
                }
            }
            this.popupContainer.addView(r4, layoutParams);
        }
        return r4;
    }

    public final void getNewMessage() {
        ArrayList arrayList = this.popupMessages;
        if (arrayList.isEmpty()) {
            onFinish$1();
            finish();
            return;
        }
        if ((this.currentMessageNum != 0 || this.chatActivityEnterView.hasText() || this.startedMoving) && this.currentMessageObject != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i);
                if (messageObject.currentAccount == this.currentMessageObject.currentAccount && messageObject.getDialogId() == this.currentMessageObject.getDialogId() && messageObject.getId() == this.currentMessageObject.getId()) {
                    this.currentMessageNum = i;
                    if (this.startedMoving) {
                        if (i == arrayList.size() - 1) {
                            prepareLayouts(3);
                        } else if (this.currentMessageNum == 1) {
                            prepareLayouts(4);
                        }
                    }
                }
            }
            this.currentMessageNum = 0;
            this.currentMessageObject = (MessageObject) arrayList.get(0);
            updateInterfaceForCurrentMessage(0);
        } else {
            this.currentMessageNum = 0;
            this.currentMessageObject = (MessageObject) arrayList.get(0);
            updateInterfaceForCurrentMessage(0);
        }
        this.countText.setText(String.format("%d/%d", Integer.valueOf(this.currentMessageNum + 1), Integer.valueOf(arrayList.size())));
    }

    public final ViewGroup getViewForMessage(int i, boolean z) {
        ?? r2;
        int i2;
        BackupImageView backupImageView;
        int i3;
        TextView textView;
        ?? r3;
        ?? r4;
        ViewGroup viewGroup;
        PopupAudioView popupAudioView;
        int size = i;
        ArrayList arrayList = this.popupMessages;
        if (arrayList.size() == 1 && (size < 0 || size >= arrayList.size())) {
            return null;
        }
        if (size == -1) {
            size = arrayList.size() - 1;
        } else if (size == arrayList.size()) {
            size = 0;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(size);
        int i4 = messageObject.type;
        if ((i4 == 1 || i4 == 4) && !messageObject.isSecretMedia()) {
            ArrayList arrayList2 = this.imageViews;
            if (arrayList2.size() > 0) {
                ViewGroup viewGroup2 = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
                r2 = viewGroup2;
            } else {
                ?? frameLayout = new FrameLayout(this);
                FrameLayout frameLayout2 = new FrameLayout(this);
                frameLayout2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1.0f, -1));
                BackupImageView backupImageView2 = new BackupImageView(this);
                backupImageView2.setTag(311);
                frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(-1.0f, -1));
                TextView textView2 = new TextView(this);
                textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity(17);
                textView2.setTag(312);
                frameLayout2.addView(textView2, LayoutHelper.createFrame(-1, -2, 17));
                frameLayout.setTag(2);
                final int i5 = 0;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i5) {
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
                r2 = frameLayout;
            }
            TextView textView3 = (TextView) r2.findViewWithTag(312);
            BackupImageView backupImageView3 = (BackupImageView) r2.findViewWithTag(311);
            backupImageView3.setAspectFit(true);
            int i6 = messageObject.type;
            if (i6 == 1) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 100);
                if (closestPhotoSizeWithSize == null) {
                    i2 = 8;
                    backupImageView3.setVisibility(i2);
                    textView3.setVisibility(0);
                    textView3.setTextSize(2, SharedConfig.fontSize);
                    textView3.setText(messageObject.messageText);
                    r3 = r2;
                } else {
                    boolean z2 = messageObject.type != 1 || FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject.messageOwner).exists();
                    if (messageObject.needDrawBluredPreview()) {
                        i2 = 8;
                    } else {
                        if (z2 || DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject)) {
                            backupImageView = backupImageView3;
                            i3 = 8;
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                            int i7 = closestPhotoSizeWithSize.size;
                            textView = textView3;
                            backupImageView.setImage(forObject, "100_100", forObject2, "100_100_b", null, null, i7, messageObject);
                        } else if (closestPhotoSizeWithSize2 != null) {
                            textView = textView3;
                            backupImageView = backupImageView3;
                            i3 = 8;
                            backupImageView.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "100_100_b", null, null, null, null, 0, messageObject);
                        } else {
                            i2 = 8;
                        }
                        backupImageView.setVisibility(0);
                        textView.setVisibility(i3);
                        r3 = r2;
                    }
                    backupImageView3.setVisibility(i2);
                    textView3.setVisibility(0);
                    textView3.setTextSize(2, SharedConfig.fontSize);
                    textView3.setText(messageObject.messageText);
                    r3 = r2;
                }
            } else if (i6 == 4) {
                textView3.setVisibility(8);
                textView3.setText(messageObject.messageText);
                backupImageView3.setVisibility(0);
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                if (MessagesController.getInstance(messageObject.currentAccount).mapProvider == 2) {
                    r3 = r2;
                    backupImageView3.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 100, 100, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, null, 0, messageObject);
                    r3 = r2;
                } else {
                    r3 = r2;
                    backupImageView3.setImage(AndroidUtilities.formapMapUrl(messageObject.currentAccount, d, d2, 100, 100, true, 15, -1), null, null);
                    r3 = r2;
                }
            }
        } else if (messageObject.type == 2) {
            ArrayList arrayList3 = this.audioViews;
            if (arrayList3.size() > 0) {
                viewGroup = (ViewGroup) arrayList3.get(0);
                arrayList3.remove(0);
                popupAudioView = (PopupAudioView) viewGroup.findViewWithTag(300);
            } else {
                ViewGroup frameLayout3 = new FrameLayout(this);
                FrameLayout frameLayout4 = new FrameLayout(this);
                frameLayout4.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                frameLayout4.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                frameLayout3.addView(frameLayout4, LayoutHelper.createFrame(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(this);
                frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-1, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
                PopupAudioView popupAudioView2 = new PopupAudioView(this);
                popupAudioView2.setTag(300);
                frameLayout5.addView(popupAudioView2);
                frameLayout3.setTag(3);
                final int i8 = 1;
                frameLayout3.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i8) {
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
                viewGroup = frameLayout3;
                popupAudioView = popupAudioView2;
            }
            popupAudioView.setMessageObject(messageObject);
            if (DownloadController.getInstance(messageObject.currentAccount).canDownloadMedia(messageObject) && popupAudioView.buttonState == 2) {
                FileLoader.getInstance(popupAudioView.currentAccount).loadFile(popupAudioView.currentMessageObject.getDocument(), popupAudioView.currentMessageObject, 1, 0);
                popupAudioView.buttonState = 3;
                popupAudioView.invalidate();
            }
            r3 = viewGroup;
        } else {
            ArrayList arrayList4 = this.textViews;
            if (arrayList4.size() > 0) {
                ViewGroup viewGroup3 = (ViewGroup) arrayList4.get(0);
                arrayList4.remove(0);
                r4 = viewGroup3;
            } else {
                ?? frameLayout6 = new FrameLayout(this);
                ?? scrollView = new ScrollView(this);
                scrollView.setFillViewport(true);
                frameLayout6.addView(scrollView, LayoutHelper.createFrame(-1.0f, -1));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                scrollView.addView(linearLayout, LayoutHelper.createScroll(-1, -2, 1));
                linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                final int i9 = 2;
                linearLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final PopupNotificationActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i9) {
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
                TextView textView4 = new TextView(this);
                textView4.setTextSize(1, 16.0f);
                textView4.setTag(301);
                int i10 = Theme.key_windowBackgroundWhiteBlackText;
                textView4.setTextColor(Theme.getColor(null, i10, false));
                textView4.setLinkTextColor(Theme.getColor(null, i10, false));
                textView4.setGravity(17);
                linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 17));
                frameLayout6.setTag(1);
                r4 = frameLayout6;
            }
            TextView textView5 = (TextView) r4.findViewWithTag(301);
            textView5.setTextSize(2, SharedConfig.fontSize);
            textView5.setText(messageObject.messageText);
            r3 = r4;
        }
        r3 = r2;
        if (r3.getParent() == null) {
            this.messageContainer.addView(r3);
        }
        r3.setVisibility(0);
        if (z) {
            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r3.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.height = -1;
            layoutParams.width = iDp;
            int i11 = this.currentMessageNum;
            if (size == i11) {
                r3.setTranslationX(0.0f);
            } else if (size == i11 - 1) {
                r3.setTranslationX(-iDp);
            } else if (size == i11 + 1) {
                r3.setTranslationX(iDp);
            }
            r3.setLayoutParams(layoutParams);
            r3.invalidate();
        }
        return r3;
    }

    public final void handleIntent(Intent intent) {
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

    public final void lambda$getViewForMessage$6(View view) {
        openCurrentMessage();
    }

    public final void lambda$getViewForMessage$7(View view) {
        openCurrentMessage();
    }

    public final void lambda$getViewForMessage$8(View view) {
        openCurrentMessage();
    }

    @Override
    public final void onBackPressed() {
        if (this.chatActivityEnterView.isPopupShowing()) {
            this.chatActivityEnterView.hidePopup(true, false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        FrameLayout frameLayout = this.avatarContainer;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass6(this, 0));
        }
        LoginActivity.AnonymousClass4 anonymousClass4 = this.messageContainer;
        if (anonymousClass4 != null) {
            anonymousClass4.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass6(this, 1));
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
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
        this.statusDrawables[3] = new PlayingGameDrawable(null, false);
        this.statusDrawables[4] = new RoundStatusDrawable(false);
        LoginActivity.AnonymousClass2 anonymousClass2 = new LoginActivity.AnonymousClass2(this, this, 5);
        setContentView(anonymousClass2);
        anonymousClass2.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        anonymousClass2.addView(relativeLayout, LayoutHelper.createFrame(-1.0f, -1));
        ?? r3 = new RelativeLayout(this) {
            @Override
            public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getTag() instanceof String) {
                        int left = childAt.getLeft();
                        PopupNotificationActivity popupNotificationActivity = PopupNotificationActivity.this;
                        childAt.layout(left, AndroidUtilities.dp(3.0f) + popupNotificationActivity.chatActivityEnterView.getTop(), childAt.getRight(), popupNotificationActivity.chatActivityEnterView.getBottom());
                    }
                }
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                PopupNotificationActivity popupNotificationActivity = PopupNotificationActivity.this;
                int measuredWidth = popupNotificationActivity.chatActivityEnterView.getMeasuredWidth();
                int measuredHeight = popupNotificationActivity.chatActivityEnterView.getMeasuredHeight();
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getTag() instanceof String) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight - AndroidUtilities.dp(3.0f), 1073741824));
                    }
                }
            }
        };
        this.popupContainer = r3;
        r3.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        float f = -1;
        relativeLayout.addView(this.popupContainer, LayoutHelper.createRelative(12, f, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onDestroy();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, anonymousClass2, null, false, null);
        this.chatActivityEnterView = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        addView(this.chatActivityEnterView, LayoutHelper.createRelative(0, f, 0, -2, 12));
        this.chatActivityEnterView.setDelegate(new ChatActivityEnterView.ChatActivityEnterViewDelegate() {
            @Override
            public final void bottomPanelTranslationYChanged(float f2) {
            }

            @Override
            public final boolean checkCanRemoveRestrictionsByBoosts() {
                return false;
            }

            @Override
            public final void didPressAttachButton() {
            }

            @Override
            public final void didPressStreamingStop() {
            }

            @Override
            public final void didPressSuggestionButton() {
            }

            @Override
            public final int getContentViewHeight() {
                return 0;
            }

            @Override
            public final TLRPC.Peer getDefaultSendAs() {
                return null;
            }

            @Override
            public final ChatActivity.ReplyQuote getReplyQuote() {
                return null;
            }

            @Override
            public final TL_stories.StoryItem getReplyToStory() {
                return null;
            }

            @Override
            public final TLRPC.TL_channels_sendAsPeers getSendAsPeers() {
                return null;
            }

            @Override
            public final boolean hasForwardingMessages() {
                return false;
            }

            @Override
            public final boolean hasScheduledMessages() {
                return true;
            }

            @Override
            public final boolean isVideoRecordingPaused() {
                return false;
            }

            @Override
            public final int measureKeyboardHeight() {
                return 0;
            }

            @Override
            public final void needChangeVideoPreviewState(float f2, int i2) {
            }

            @Override
            public final void needSendTyping() {
                PopupNotificationActivity popupNotificationActivity = PopupNotificationActivity.this;
                MessageObject messageObject = popupNotificationActivity.currentMessageObject;
                if (messageObject != null) {
                    MessagesController.getInstance(messageObject.currentAccount).sendTyping(popupNotificationActivity.currentMessageObject.getDialogId(), 0L, 0, popupNotificationActivity.classGuid);
                }
            }

            @Override
            public final void needShowMediaBanHint() {
            }

            @Override
            public final void needStartRecordAudio(int i2) {
            }

            @Override
            public final void onAttachButtonHidden() {
            }

            @Override
            public final void onAttachButtonShow() {
            }

            @Override
            public final void onAudioVideoInterfaceUpdated() {
            }

            @Override
            public final void onContextMenuClose() {
            }

            @Override
            public final void onContextMenuOpen() {
            }

            @Override
            public final void onEditTextScroll() {
            }

            @Override
            public final void onEmojiViewTabChanged() {
            }

            @Override
            public final void onKeyboardRequested() {
            }

            @Override
            public final void onMessageEditEnd() {
            }

            @Override
            public final void onMessageSend(CharSequence charSequence, boolean z, int i2, int i3, long j) {
                PopupNotificationActivity popupNotificationActivity = PopupNotificationActivity.this;
                if (popupNotificationActivity.currentMessageObject == null) {
                    return;
                }
                int i4 = popupNotificationActivity.currentMessageNum;
                if (i4 >= 0 && i4 < popupNotificationActivity.popupMessages.size()) {
                    popupNotificationActivity.popupMessages.remove(popupNotificationActivity.currentMessageNum);
                }
                MessagesController.getInstance(popupNotificationActivity.currentMessageObject.currentAccount).markDialogAsRead(popupNotificationActivity.currentMessageObject.getDialogId(), popupNotificationActivity.currentMessageObject.getId(), Math.max(0, popupNotificationActivity.currentMessageObject.getId()), popupNotificationActivity.currentMessageObject.messageOwner.date, true, 0L, 0, true, 0);
                popupNotificationActivity.currentMessageObject = null;
                popupNotificationActivity.getNewMessage();
            }

            @Override
            public final void onPreAudioVideoRecord() {
            }

            @Override
            public final void onSendLongClick() {
            }

            @Override
            public final void onStickersExpandedChange() {
            }

            @Override
            public final void onStickersTab(boolean z) {
            }

            @Override
            public final void onSwitchRecordMode(boolean z) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, boolean z, boolean z2) {
            }

            @Override
            public final void onTextSelectionChanged(int i2, int i3) {
            }

            @Override
            public final void onTextSpansChanged(CharSequence charSequence) {
            }

            @Override
            public final void onTrendingStickersShowed(boolean z) {
            }

            @Override
            public final void onUpdateSlowModeButton(CharSequence charSequence, View view, boolean z) {
            }

            @Override
            public final void onWindowSizeChanged(int i2) {
            }

            @Override
            public final boolean onceVoiceAvailable() {
                return false;
            }

            @Override
            public final void openScheduledMessages() {
            }

            @Override
            public final void prepareMessageSending() {
            }

            @Override
            public final void scrollToSendingMessage() {
            }

            @Override
            public final boolean setDefaultSendAs(long j) {
                return false;
            }

            @Override
            public final void toggleVideoRecordingPause() {
            }

            @Override
            public final void needStartRecordVideo(int i2, int i3, int i4, long j, long j2, boolean z) {
            }
        });
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, this, 16);
        this.messageContainer = anonymousClass4;
        addView(anonymousClass4, 0);
        ActionBar actionBar = new ActionBar(this, null);
        this.actionBar = actionBar;
        actionBar.setOccupyStatusBar(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_close_white);
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefault, false));
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefaultSelector, false), false);
        addView(this.actionBar);
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
        actionBarMenuItemAddItemWithWidth.addView(this.countText, LayoutHelper.createFrame(-1.0f, 56));
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
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 11));
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(268435462, "screen");
        this.wakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        handleIntent(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        onFinish$1();
        MediaController.getInstance().setFeedbackView(this.chatActivityEnterView, false);
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        BackupImageView backupImageView = this.avatarImageView;
        if (backupImageView != null) {
            backupImageView.setImageDrawable(null);
        }
    }

    public final void onFinish$1() {
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
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    @Override
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.hidePopup(false, false, true);
            this.chatActivityEnterView.setFieldFocused(false);
        }
        int i = this.lastResumedAccount;
        if (i >= 0) {
            ConnectionsManager.getInstance(i).setAppPaused(true, false);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 3 || iArr[0] == 0) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, 0, null);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.PermissionNoAudioWithHint);
        builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new PhotoViewer$$ExternalSyntheticLambda115(this, 23));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.show();
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController.getInstance().setFeedbackView(this.chatActivityEnterView, true);
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        FrameLayout frameLayout = this.avatarContainer;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass6(this, 0));
        }
        LoginActivity.AnonymousClass4 anonymousClass4 = this.messageContainer;
        if (anonymousClass4 != null) {
            anonymousClass4.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass6(this, 1));
        }
        checkAndUpdateAvatar$1();
        this.wakeLock.acquire(7000L);
    }

    public final boolean onTouchEventMy(MotionEvent motionEvent) {
        char c;
        float translationX;
        ViewGroup viewGroup;
        LinearLayout linearLayout;
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
                    linearLayout = this.leftButtonsView;
                    this.onAnimationEndRunnable = new Runnable(this) {
                        public final PopupNotificationActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            PopupNotificationActivity popupNotificationActivity = this.f$0;
                            switch (i3) {
                                case 0:
                                    popupNotificationActivity.animationInProgress = false;
                                    ArrayList arrayList = popupNotificationActivity.popupMessages;
                                    if (arrayList.size() > 1) {
                                        int i5 = popupNotificationActivity.currentMessageNum;
                                        if (i5 > 0) {
                                            popupNotificationActivity.currentMessageNum = i5 - 1;
                                        } else {
                                            popupNotificationActivity.currentMessageNum = arrayList.size() - 1;
                                        }
                                        popupNotificationActivity.currentMessageObject = (MessageObject) arrayList.get(popupNotificationActivity.currentMessageNum);
                                        popupNotificationActivity.updateInterfaceForCurrentMessage(1);
                                        popupNotificationActivity.countText.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.currentMessageNum + 1), Integer.valueOf(arrayList.size())));
                                    }
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                case 1:
                                    popupNotificationActivity.animationInProgress = false;
                                    popupNotificationActivity.switchToNextMessage();
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                default:
                                    popupNotificationActivity.animationInProgress = false;
                                    popupNotificationActivity.applyViewsLayoutParams(0);
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                } else if ((c == 2 || x2 < (-iDp) / 3) && this.rightView != null) {
                    translationX = (-iDp) - this.centerView.getTranslationX();
                    viewGroup = this.rightView;
                    linearLayout = this.rightButtonsView;
                    this.onAnimationEndRunnable = new Runnable(this) {
                        public final PopupNotificationActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            PopupNotificationActivity popupNotificationActivity = this.f$0;
                            switch (i2) {
                                case 0:
                                    popupNotificationActivity.animationInProgress = false;
                                    ArrayList arrayList = popupNotificationActivity.popupMessages;
                                    if (arrayList.size() > 1) {
                                        int i5 = popupNotificationActivity.currentMessageNum;
                                        if (i5 > 0) {
                                            popupNotificationActivity.currentMessageNum = i5 - 1;
                                        } else {
                                            popupNotificationActivity.currentMessageNum = arrayList.size() - 1;
                                        }
                                        popupNotificationActivity.currentMessageObject = (MessageObject) arrayList.get(popupNotificationActivity.currentMessageNum);
                                        popupNotificationActivity.updateInterfaceForCurrentMessage(1);
                                        popupNotificationActivity.countText.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.currentMessageNum + 1), Integer.valueOf(arrayList.size())));
                                    }
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                case 1:
                                    popupNotificationActivity.animationInProgress = false;
                                    popupNotificationActivity.switchToNextMessage();
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                default:
                                    popupNotificationActivity.animationInProgress = false;
                                    popupNotificationActivity.applyViewsLayoutParams(0);
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                } else if (this.centerView.getTranslationX() != 0.0f) {
                    float f2 = -this.centerView.getTranslationX();
                    ViewGroup viewGroup2 = x2 > 0 ? this.leftView : this.rightView;
                    LinearLayout linearLayout2 = x2 > 0 ? this.leftButtonsView : this.rightButtonsView;
                    this.onAnimationEndRunnable = new Runnable(this) {
                        public final PopupNotificationActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            PopupNotificationActivity popupNotificationActivity = this.f$0;
                            switch (i) {
                                case 0:
                                    popupNotificationActivity.animationInProgress = false;
                                    ArrayList arrayList = popupNotificationActivity.popupMessages;
                                    if (arrayList.size() > 1) {
                                        int i5 = popupNotificationActivity.currentMessageNum;
                                        if (i5 > 0) {
                                            popupNotificationActivity.currentMessageNum = i5 - 1;
                                        } else {
                                            popupNotificationActivity.currentMessageNum = arrayList.size() - 1;
                                        }
                                        popupNotificationActivity.currentMessageObject = (MessageObject) arrayList.get(popupNotificationActivity.currentMessageNum);
                                        popupNotificationActivity.updateInterfaceForCurrentMessage(1);
                                        popupNotificationActivity.countText.setText(String.format("%d/%d", Integer.valueOf(popupNotificationActivity.currentMessageNum + 1), Integer.valueOf(arrayList.size())));
                                    }
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                case 1:
                                    popupNotificationActivity.animationInProgress = false;
                                    popupNotificationActivity.switchToNextMessage();
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                                default:
                                    popupNotificationActivity.animationInProgress = false;
                                    popupNotificationActivity.applyViewsLayoutParams(0);
                                    AndroidUtilities.unlockOrientation(popupNotificationActivity);
                                    break;
                            }
                        }
                    };
                    linearLayout = linearLayout2;
                    translationX = f2;
                    viewGroup = viewGroup2;
                } else {
                    viewGroup = null;
                    linearLayout = null;
                    translationX = 0.0f;
                }
                if (translationX != 0.0f) {
                    int iAbs = (int) (Math.abs(translationX / iDp) * 200.0f);
                    ArrayList arrayList = new ArrayList();
                    ViewGroup viewGroup3 = this.centerView;
                    arrayList.add(ObjectAnimator.ofFloat(viewGroup3, "translationX", viewGroup3.getTranslationX() + translationX));
                    LinearLayout linearLayout3 = this.centerButtonsView;
                    if (linearLayout3 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout3, "translationX", linearLayout3.getTranslationX() + translationX));
                    }
                    if (viewGroup != null) {
                        arrayList.add(ObjectAnimator.ofFloat(viewGroup, "translationX", viewGroup.getTranslationX() + translationX));
                    }
                    if (linearLayout != null) {
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, "translationX", linearLayout.getTranslationX() + translationX));
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(iAbs);
                    animatorSet.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 4));
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

    public final void openCurrentMessage() {
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
        onFinish$1();
        finish();
    }

    public final void prepareLayouts(int i) {
        MessageObject messageObject;
        int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(24.0f);
        if (i == 0) {
            reuseView(this.centerView);
            reuseView(this.leftView);
            reuseView(this.rightView);
            LinearLayout linearLayout = this.centerButtonsView;
            if (linearLayout != null) {
                removeView(linearLayout);
            }
            LinearLayout linearLayout2 = this.leftButtonsView;
            if (linearLayout2 != null) {
                removeView(linearLayout2);
            }
            LinearLayout linearLayout3 = this.rightButtonsView;
            if (linearLayout3 != null) {
                removeView(linearLayout3);
            }
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
            LinearLayout linearLayout4 = this.rightButtonsView;
            if (linearLayout4 != null) {
                removeView(linearLayout4);
            }
            this.rightView = this.centerView;
            this.centerView = this.leftView;
            this.leftView = getViewForMessage(this.currentMessageNum - 1, true);
            this.rightButtonsView = this.centerButtonsView;
            this.centerButtonsView = this.leftButtonsView;
            this.leftButtonsView = getButtonsViewForMessage(this.currentMessageNum - 1, true);
        } else if (i == 2) {
            reuseView(this.leftView);
            LinearLayout linearLayout5 = this.leftButtonsView;
            if (linearLayout5 != null) {
                removeView(linearLayout5);
            }
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
            LinearLayout linearLayout6 = this.rightButtonsView;
            if (linearLayout6 != null) {
                float translationX2 = linearLayout6.getTranslationX();
                LinearLayout linearLayout7 = this.rightButtonsView;
                if (linearLayout7 != null) {
                    removeView(linearLayout7);
                }
                LinearLayout buttonsViewForMessage = getButtonsViewForMessage(this.currentMessageNum + 1, false);
                this.rightButtonsView = buttonsViewForMessage;
                if (buttonsViewForMessage != null) {
                    buttonsViewForMessage.setTranslationX(translationX2);
                }
            }
        } else if (i == 4) {
            ViewGroup viewGroup2 = this.leftView;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
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
            LinearLayout linearLayout8 = this.leftButtonsView;
            if (linearLayout8 != null) {
                float translationX4 = linearLayout8.getTranslationX();
                LinearLayout linearLayout9 = this.leftButtonsView;
                if (linearLayout9 != null) {
                    removeView(linearLayout9);
                }
                LinearLayout buttonsViewForMessage2 = getButtonsViewForMessage(0, false);
                this.leftButtonsView = buttonsViewForMessage2;
                if (buttonsViewForMessage2 != null) {
                    buttonsViewForMessage2.setTranslationX(translationX4);
                }
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            int size = (this.currentMessageNum - 1) + i4;
            ArrayList arrayList = this.popupMessages;
            if (arrayList.size() != 1 || (size >= 0 && size < arrayList.size())) {
                if (size == -1) {
                    size = arrayList.size() - 1;
                } else if (size == arrayList.size()) {
                    size = 0;
                }
                messageObject = (MessageObject) arrayList.get(size);
            } else {
                messageObject = null;
            }
            this.setMessageObjects[i4] = messageObject;
        }
    }

    public final void reuseView(ViewGroup viewGroup) {
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

    public final void setTypingAnimation(boolean z) {
        if (this.actionBar == null) {
            return;
        }
        int i = 0;
        StatusDrawable[] statusDrawableArr = this.statusDrawables;
        if (!z) {
            this.onlineTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.onlineTextView.setCompoundDrawablePadding(0);
            while (i < statusDrawableArr.length) {
                statusDrawableArr[i].stop();
                i++;
            }
            return;
        }
        try {
            Integer printingStringType = MessagesController.getInstance(this.currentMessageObject.currentAccount).getPrintingStringType(this.currentMessageObject.getDialogId(), 0L);
            this.onlineTextView.setCompoundDrawablesWithIntrinsicBounds(statusDrawableArr[printingStringType.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
            this.onlineTextView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            while (i < statusDrawableArr.length) {
                if (i == printingStringType.intValue()) {
                    statusDrawableArr[i].start();
                } else {
                    statusDrawableArr[i].stop();
                }
                i++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void switchToNextMessage() {
        ArrayList arrayList = this.popupMessages;
        if (arrayList.size() > 1) {
            if (this.currentMessageNum < arrayList.size() - 1) {
                this.currentMessageNum++;
            } else {
                this.currentMessageNum = 0;
            }
            this.currentMessageObject = (MessageObject) arrayList.get(this.currentMessageNum);
            updateInterfaceForCurrentMessage(2);
            this.countText.setText(String.format("%d/%d", Integer.valueOf(this.currentMessageNum + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void updateInterfaceForCurrentMessage(int i) {
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
        this.chatActivityEnterView.setDialogId(this.currentMessageObject.currentAccount, dialogId);
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
        updateSubtitle$2();
        checkAndUpdateAvatar$1();
        applyViewsLayoutParams(0);
    }

    public final void updateSubtitle$2() {
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
}
