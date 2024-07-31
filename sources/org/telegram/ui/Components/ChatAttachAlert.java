package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$InputInvoice;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$PaymentForm;
import org.telegram.tgnet.TLRPC$PaymentReceipt;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIcon;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIconColor;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messages_toggleBotInAttachMenu;
import org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.PhotoPickerSearchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.WebAppDisclaimerAlert;
import org.telegram.ui.bots.BotWebViewMenuContainer$ActionBarColorsAnimating;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.BotWebViewContainer;
public class ChatAttachAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, BottomSheet.BottomSheetDelegateInterface {
    public final Property<AttachAlertLayout, Float> ATTACH_ALERT_LAYOUT_TRANSLATION;
    private final Property<ChatAttachAlert, Float> ATTACH_ALERT_PROGRESS;
    public ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private View actionBarShadow;
    private boolean allowDrawContent;
    public boolean allowEnterCaption;
    protected boolean allowOrder;
    protected boolean allowPassConfirmationAlert;
    private SpringAnimation appearSpringAnimation;
    private final Paint attachButtonPaint;
    private int attachItemSize;
    private ChatAttachAlertAudioLayout audioLayout;
    protected int avatarPicker;
    protected boolean avatarSearch;
    public final BaseFragment baseFragment;
    private float baseSelectedTextViewTranslationY;
    private LongSparseArray<ChatAttachAlertBotWebViewLayout> botAttachLayouts;
    private boolean botButtonProgressWasVisible;
    private boolean botButtonWasVisible;
    private float botMainButtonOffsetY;
    private TextView botMainButtonTextView;
    private RadialProgressView botProgressView;
    private float bottomPannelTranslation;
    private boolean buttonPressed;
    private ButtonsAdapter buttonsAdapter;
    private AnimatorSet buttonsAnimation;
    private LinearLayoutManager buttonsLayoutManager;
    protected RecyclerListView buttonsRecyclerView;
    public boolean canOpenPreview;
    public boolean captionAbove;
    private float captionEditTextTopOffset;
    private final NumberTextView captionLimitView;
    private float chatActivityEnterViewAnimateFromTop;
    private int codepointCount;
    public ChatAttachAlertColorsLayout colorsLayout;
    public EditTextEmoji commentTextView;
    private int[] commentTextViewLocation;
    private AnimatorSet commentsAnimator;
    private boolean confirmationAlertShown;
    private ChatAttachAlertContactsLayout contactsLayout;
    protected float cornerRadius;
    public final int currentAccount;
    private AttachAlertLayout currentAttachLayout;
    private int currentLimit;
    float currentPanTranslationY;
    public Utilities.Callback2<String, TLRPC$InputDocument> customStickerHandler;
    protected ChatAttachViewDelegate delegate;
    public boolean destroyed;
    public long dialogId;
    private ChatAttachAlertDocumentLayout documentLayout;
    private ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentsDelegate;
    private boolean documentsEnabled;
    protected ActionBarMenuItem doneItem;
    protected MessageObject editingMessageObject;
    private boolean enterCommentEventSent;
    private ArrayList<android.graphics.Rect> exclusionRects;
    private android.graphics.Rect exclustionRect;
    public boolean forUser;
    private final boolean forceDarkTheme;
    private FrameLayout frameLayout2;
    private float fromScrollY;
    protected FrameLayout headerView;
    public boolean inBubbleMode;
    public boolean isBizLocationPicker;
    public boolean isPhotoPicker;
    private boolean isSoundPicker;
    public boolean isStickerMode;
    public boolean isStoryAudioPicker;
    public boolean isStoryLocationPicker;
    private AttachAlertLayout[] layouts;
    private ChatAttachAlertLocationLayout locationLayout;
    protected int maxSelectedPhotos;
    protected TextView mediaPreviewTextView;
    protected LinearLayout mediaPreviewView;
    public MentionsContainerView mentionContainer;
    private AnimatorSet menuAnimator;
    private boolean menuShowed;
    private MessageSendPreview messageSendPreview;
    private boolean musicEnabled;
    private AttachAlertLayout nextAttachLayout;
    private boolean openTransitionFinished;
    protected boolean openWithFrontFaceCamera;
    protected ActionBarMenuItem optionsItem;
    private boolean overrideBackgroundColor;
    private Paint paint;
    public ImageUpdater parentImageUpdater;
    public ChatActivity.ThemeDelegate parentThemeDelegate;
    private PasscodeView passcodeView;
    protected boolean paused;
    private ChatAttachAlertPhotoLayout photoLayout;
    private ChatAttachAlertPhotoLayoutPreview photoPreviewLayout;
    private boolean photosEnabled;
    public boolean pinnedToTop;
    private boolean plainTextEnabled;
    private ChatAttachAlertPollLayout pollLayout;
    private boolean pollsEnabled;
    private int previousScrollOffsetY;
    private ChatAttachAlertQuickRepliesLayout quickRepliesLayout;
    private RectF rect;
    private ChatAttachRestrictedLayout restrictedLayout;
    public int[] scrollOffsetY;
    protected ActionBarMenuItem searchItem;
    protected ImageView selectedArrowImageView;
    private View selectedCountView;
    private long selectedId;
    protected ActionBarMenuItem selectedMenuItem;
    protected TextView selectedTextView;
    protected LinearLayout selectedView;
    boolean sendButtonEnabled;
    private float sendButtonEnabledProgress;
    public boolean sent;
    private ImageUpdater.AvatarFor setAvatarFor;
    private View shadow;
    public SizeNotifierFrameLayout sizeNotifierFrameLayout;
    public boolean storyLocationPickerFileIsVideo;
    public double[] storyLocationPickerLatLong;
    public File storyLocationPickerPhotoFile;
    public boolean storyMediaPicker;
    private TextPaint textPaint;
    private float toScrollY;
    private ValueAnimator topBackgroundAnimator;
    public float translationProgress;
    protected boolean typeButtonsAvailable;
    private boolean videosEnabled;
    private Object viewChangeAnimator;
    private ChatActivityEnterView.SendButton writeButton;
    private FrameLayout writeButtonContainer;

    public static boolean lambda$new$15(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean canDismiss() {
        return true;
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public TLRPC$Chat getChat() {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            return ((ChatActivity) baseFragment).getCurrentChat();
        }
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
    }

    public void setCanOpenPreview(boolean z) {
        this.canOpenPreview = z;
        this.selectedArrowImageView.setVisibility((!z || this.avatarPicker == 2) ? 8 : 0);
    }

    public float getClipLayoutBottom() {
        return this.frameLayout2.getMeasuredHeight() - ((this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(84.0f)) * (1.0f - this.frameLayout2.getAlpha()));
    }

    public void showBotLayout(long j, boolean z) {
        showBotLayout(j, null, false, z);
    }

    public void showBotLayout(long r17, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.showBotLayout(long, java.lang.String, boolean, boolean):void");
    }

    public class AnonymousClass1 implements BotWebViewContainer.Delegate {
        private ValueAnimator botButtonAnimator;
        final long val$id;
        final String val$startCommand;
        final ChatAttachAlertBotWebViewLayout val$webViewLayout;

        @Override
        public void onCloseToTabs() {
            onCloseRequested(null);
        }

        @Override
        public void onInstantClose() {
            onCloseRequested(null);
        }

        @Override
        public void onSendWebViewData(String str) {
            BotWebViewContainer.Delegate.CC.$default$onSendWebViewData(this, str);
        }

        @Override
        public void onWebAppBackgroundChanged(boolean z, int i) {
            BotWebViewContainer.Delegate.CC.$default$onWebAppBackgroundChanged(this, z, i);
        }

        @Override
        public void onWebAppReady() {
            BotWebViewContainer.Delegate.CC.$default$onWebAppReady(this);
        }

        AnonymousClass1(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, long j) {
            ChatAttachAlert.this = r1;
            this.val$webViewLayout = chatAttachAlertBotWebViewLayout;
            this.val$startCommand = str;
            this.val$id = j;
        }

        @Override
        public void onWebAppSetupClosingBehavior(boolean z) {
            this.val$webViewLayout.setNeedCloseConfirmation(z);
        }

        @Override
        public void onWebAppSwipingBehavior(boolean z) {
            this.val$webViewLayout.setAllowSwipes(z);
        }

        @Override
        public void onCloseRequested(final Runnable runnable) {
            if (ChatAttachAlert.this.currentAttachLayout != this.val$webViewLayout) {
                return;
            }
            ChatAttachAlert.this.setFocusable(false);
            ChatAttachAlert.this.getWindow().setSoftInputMode(48);
            ChatAttachAlert.this.dismiss();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.AnonymousClass1.lambda$onCloseRequested$0(runnable);
                }
            }, 150L);
        }

        public static void lambda$onCloseRequested$0(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void onWebAppSetActionBarColor(int i, final int i2, boolean z) {
            final int color = ((ColorDrawable) ChatAttachAlert.this.actionBar.getBackground()).getColor();
            final BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating = new BotWebViewMenuContainer$ActionBarColorsAnimating();
            botWebViewMenuContainer$ActionBarColorsAnimating.setFrom(ChatAttachAlert.this.overrideBackgroundColor ? color : 0, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            ChatAttachAlert.this.overrideBackgroundColor = z;
            botWebViewMenuContainer$ActionBarColorsAnimating.setTo(ChatAttachAlert.this.overrideBackgroundColor ? i2 : 0, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatAttachAlert.AnonymousClass1.this.lambda$onWebAppSetActionBarColor$1(color, i2, chatAttachAlertBotWebViewLayout, botWebViewMenuContainer$ActionBarColorsAnimating, valueAnimator);
                }
            });
            duration.start();
        }

        public void lambda$onWebAppSetActionBarColor$1(int i, int i2, ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.actionBar.setBackgroundColor(ColorUtils.blendARGB(i, i2, floatValue));
            chatAttachAlertBotWebViewLayout.setCustomActionBarBackground(ColorUtils.blendARGB(i, i2, floatValue));
            ChatAttachAlert.this.currentAttachLayout.invalidate();
            ChatAttachAlert.this.sizeNotifierFrameLayout.invalidate();
            botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(ChatAttachAlert.this.actionBar, floatValue);
        }

        @Override
        public void onWebAppSetBackgroundColor(int i) {
            this.val$webViewLayout.setCustomBackground(i);
        }

        @Override
        public void onWebAppOpenInvoice(TLRPC$InputInvoice tLRPC$InputInvoice, final String str, TLObject tLObject) {
            PaymentFormActivity paymentFormActivity;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            if (tLObject instanceof TLRPC$TL_payments_paymentFormStars) {
                final AlertDialog alertDialog = new AlertDialog(ChatAttachAlert.this.getContext(), 3);
                alertDialog.showDelayed(150L);
                StarsController starsController = StarsController.getInstance(ChatAttachAlert.this.currentAccount);
                TLRPC$TL_payments_paymentFormStars tLRPC$TL_payments_paymentFormStars = (TLRPC$TL_payments_paymentFormStars) tLObject;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        AlertDialog.this.dismiss();
                    }
                };
                final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
                starsController.openPaymentForm(null, tLRPC$InputInvoice, tLRPC$TL_payments_paymentFormStars, runnable, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ChatAttachAlert.AnonymousClass1.lambda$onWebAppOpenInvoice$3(ChatAttachAlertBotWebViewLayout.this, str, (String) obj);
                    }
                });
                AndroidUtilities.hideKeyboard(this.val$webViewLayout);
                return;
            }
            if (tLObject instanceof TLRPC$PaymentForm) {
                TLRPC$PaymentForm tLRPC$PaymentForm = (TLRPC$PaymentForm) tLObject;
                MessagesController.getInstance(chatAttachAlert.currentAccount).putUsers(tLRPC$PaymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(tLRPC$PaymentForm, str, baseFragment);
            } else {
                paymentFormActivity = tLObject instanceof TLRPC$PaymentReceipt ? new PaymentFormActivity((TLRPC$PaymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                this.val$webViewLayout.scrollToTop();
                AndroidUtilities.hideKeyboard(this.val$webViewLayout);
                final OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(baseFragment.getParentActivity(), ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
                overlayActionBarLayoutDialog.show();
                final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout2 = this.val$webViewLayout;
                paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
                    @Override
                    public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                        ChatAttachAlert.AnonymousClass1.lambda$onWebAppOpenInvoice$4(OverlayActionBarLayoutDialog.this, chatAttachAlertBotWebViewLayout2, str, invoiceStatus);
                    }
                });
                paymentFormActivity.setResourcesProvider(((BottomSheet) ChatAttachAlert.this).resourcesProvider);
                overlayActionBarLayoutDialog.addFragment(paymentFormActivity);
            }
        }

        public static void lambda$onWebAppOpenInvoice$3(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, String str2) {
            chatAttachAlertBotWebViewLayout.getWebViewContainer().onInvoiceStatusUpdate(str, str2);
        }

        public static void lambda$onWebAppOpenInvoice$4(OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, PaymentFormActivity.InvoiceStatus invoiceStatus) {
            if (invoiceStatus != PaymentFormActivity.InvoiceStatus.PENDING) {
                overlayActionBarLayoutDialog.dismiss();
            }
            chatAttachAlertBotWebViewLayout.getWebViewContainer().onInvoiceStatusUpdate(str, invoiceStatus.name().toLowerCase(Locale.ROOT));
        }

        @Override
        public void onWebAppExpand() {
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout && chatAttachAlertBotWebViewLayout.canExpandByRequest()) {
                this.val$webViewLayout.scrollToTop();
            }
        }

        @Override
        public void onWebAppSwitchInlineQuery(final TLRPC$User tLRPC$User, final String str, List<String> list) {
            if (list.isEmpty()) {
                BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                if (baseFragment instanceof ChatActivity) {
                    ChatActivityEnterView chatActivityEnterView = ((ChatActivity) baseFragment).getChatActivityEnterView();
                    chatActivityEnterView.setFieldText("@" + UserObject.getPublicUsername(tLRPC$User) + " " + str);
                }
                ChatAttachAlert.this.dismiss(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialogsType", 14);
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("allowGroups", list.contains("groups"));
            bundle.putBoolean("allowLegacyGroups", list.contains("groups"));
            bundle.putBoolean("allowMegagroups", list.contains("groups"));
            bundle.putBoolean("allowUsers", list.contains("users"));
            bundle.putBoolean("allowChannels", list.contains("channels"));
            bundle.putBoolean("allowBots", list.contains("bots"));
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            final OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(ChatAttachAlert.this.getContext(), ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                @Override
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
                    boolean lambda$onWebAppSwitchInlineQuery$5;
                    lambda$onWebAppSwitchInlineQuery$5 = ChatAttachAlert.AnonymousClass1.this.lambda$onWebAppSwitchInlineQuery$5(tLRPC$User, str, overlayActionBarLayoutDialog, dialogsActivity2, arrayList, charSequence, z, topicsFragment);
                    return lambda$onWebAppSwitchInlineQuery$5;
                }
            });
            overlayActionBarLayoutDialog.show();
            overlayActionBarLayoutDialog.addFragment(dialogsActivity);
        }

        public boolean lambda$onWebAppSwitchInlineQuery$5(TLRPC$User tLRPC$User, String str, OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
            long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle bundle = new Bundle();
            bundle.putBoolean("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j)) {
                bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j));
            } else if (DialogObject.isUserDialog(j)) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putString("start_text", "@" + UserObject.getPublicUsername(tLRPC$User) + " " + str);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            if (MessagesController.getInstance(chatAttachAlert.currentAccount).checkCanOpenChat(bundle, baseFragment)) {
                overlayActionBarLayoutDialog.dismiss();
                ChatAttachAlert.this.dismiss(true);
                baseFragment.presentFragment(new INavigationLayout.NavigationParams(new ChatActivity(bundle)).setRemoveLast(true));
            }
            return true;
        }

        @Override
        public void onSetupMainButton(final boolean z, boolean z2, String str, int i, int i2, final boolean z3) {
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout) {
                if (chatAttachAlertBotWebViewLayout.isBotButtonAvailable() || this.val$startCommand != null) {
                    ChatAttachAlert.this.botMainButtonTextView.setClickable(z2);
                    ChatAttachAlert.this.botMainButtonTextView.setText(str);
                    ChatAttachAlert.this.botMainButtonTextView.setTextColor(i2);
                    ChatAttachAlert.this.botMainButtonTextView.setBackground(BotWebViewContainer.getMainButtonRippleDrawable(i));
                    if (ChatAttachAlert.this.botButtonWasVisible != z) {
                        ChatAttachAlert.this.botButtonWasVisible = z;
                        ValueAnimator valueAnimator = this.botButtonAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float[] fArr = new float[2];
                        fArr[0] = z ? 0.0f : 1.0f;
                        fArr[1] = z ? 1.0f : 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(250L);
                        this.botButtonAnimator = duration;
                        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                ChatAttachAlert.AnonymousClass1.this.lambda$onSetupMainButton$6(valueAnimator2);
                            }
                        });
                        this.botButtonAnimator.addListener(new AnimatorListenerAdapter() {
                            {
                                AnonymousClass1.this = this;
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                if (z) {
                                    ChatAttachAlert.this.botMainButtonTextView.setAlpha(0.0f);
                                    ChatAttachAlert.this.botMainButtonTextView.setVisibility(0);
                                    int dp = AndroidUtilities.dp(36.0f);
                                    for (int i3 = 0; i3 < ChatAttachAlert.this.botAttachLayouts.size(); i3++) {
                                        ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i3)).setMeasureOffsetY(dp);
                                    }
                                    return;
                                }
                                ChatAttachAlert.this.buttonsRecyclerView.setAlpha(0.0f);
                                ChatAttachAlert.this.buttonsRecyclerView.setVisibility(0);
                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (!z) {
                                    ChatAttachAlert.this.botMainButtonTextView.setVisibility(8);
                                } else {
                                    ChatAttachAlert.this.buttonsRecyclerView.setVisibility(8);
                                }
                                int dp = z ? AndroidUtilities.dp(36.0f) : 0;
                                for (int i3 = 0; i3 < ChatAttachAlert.this.botAttachLayouts.size(); i3++) {
                                    ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i3)).setMeasureOffsetY(dp);
                                }
                                if (AnonymousClass1.this.botButtonAnimator == animator) {
                                    AnonymousClass1.this.botButtonAnimator = null;
                                }
                            }
                        });
                        this.botButtonAnimator.start();
                    }
                    ChatAttachAlert.this.botProgressView.setProgressColor(i2);
                    if (ChatAttachAlert.this.botButtonProgressWasVisible != z3) {
                        ChatAttachAlert.this.botProgressView.animate().cancel();
                        if (z3) {
                            ChatAttachAlert.this.botProgressView.setAlpha(0.0f);
                            ChatAttachAlert.this.botProgressView.setVisibility(0);
                        }
                        ChatAttachAlert.this.botProgressView.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.1f).scaleY(z3 ? 1.0f : 0.1f).setDuration(250L).setListener(new AnimatorListenerAdapter() {
                            {
                                AnonymousClass1.this = this;
                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                ChatAttachAlert.this.botButtonProgressWasVisible = z3;
                                if (z3) {
                                    return;
                                }
                                ChatAttachAlert.this.botProgressView.setVisibility(8);
                            }
                        }).start();
                    }
                }
            }
        }

        public void lambda$onSetupMainButton$6(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.buttonsRecyclerView.setAlpha(1.0f - floatValue);
            ChatAttachAlert.this.botMainButtonTextView.setAlpha(floatValue);
            ChatAttachAlert.this.botMainButtonOffsetY = floatValue * AndroidUtilities.dp(36.0f);
            ChatAttachAlert.this.shadow.setTranslationY(ChatAttachAlert.this.botMainButtonOffsetY);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.buttonsRecyclerView.setTranslationY(chatAttachAlert.botMainButtonOffsetY);
        }

        @Override
        public void onSetBackButtonVisible(boolean z) {
            AndroidUtilities.updateImageViewImageAnimated(ChatAttachAlert.this.actionBar.getBackButton(), z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        }

        @Override
        public void onSetSettingsButtonVisible(boolean z) {
            ActionBarMenuSubItem actionBarMenuSubItem = this.val$webViewLayout.settingsItem;
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setVisibility(z ? 0 : 8);
            }
        }

        @Override
        public boolean isClipboardAvailable() {
            return MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).botInAttachMenu(this.val$id);
        }
    }

    public boolean checkCaption(CharSequence charSequence) {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            return ChatActivityEnterView.checkPremiumAnimatedEmoji(this.currentAccount, ((ChatActivity) baseFragment).getDialogId(), this.baseFragment, this.sizeNotifierFrameLayout, charSequence);
        }
        return false;
    }

    public void avatarFor(ImageUpdater.AvatarFor avatarFor) {
        this.setAvatarFor = avatarFor;
    }

    public ImageUpdater.AvatarFor getAvatarFor() {
        return this.setAvatarFor;
    }

    public void setImageUpdater(ImageUpdater imageUpdater) {
        this.parentImageUpdater = imageUpdater;
    }

    public void setupPhotoPicker(String str) {
        this.avatarPicker = 1;
        this.isPhotoPicker = true;
        this.avatarSearch = false;
        this.typeButtonsAvailable = false;
        this.videosEnabled = false;
        this.buttonsRecyclerView.setVisibility(8);
        this.shadow.setVisibility(8);
        this.selectedTextView.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.updateAvatarPicker();
        }
    }

    public void presentFragment(PhotoPickerActivity photoPickerActivity) {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            baseFragment.presentFragment(photoPickerActivity);
            return;
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(photoPickerActivity);
        }
    }

    public void setDialogId(long j) {
        this.dialogId = j;
    }

    public interface ChatAttachViewDelegate {
        void didPressedButton(int i, boolean z, boolean z2, int i2, long j, boolean z3, boolean z4);

        void didSelectBot(TLRPC$User tLRPC$User);

        void doOnIdle(Runnable runnable);

        boolean needEnterComment();

        void onCameraOpened();

        void onWallpaperSelected(Object obj);

        void openAvatarsSearch();

        boolean selectItemOnClicking();

        void sendAudio(ArrayList<MessageObject> arrayList, CharSequence charSequence, boolean z, int i, long j, boolean z2);

        public final class CC {
            public static void $default$didSelectBot(ChatAttachViewDelegate chatAttachViewDelegate, TLRPC$User tLRPC$User) {
            }

            public static boolean $default$needEnterComment(ChatAttachViewDelegate chatAttachViewDelegate) {
                return false;
            }

            public static void $default$onCameraOpened(ChatAttachViewDelegate chatAttachViewDelegate) {
            }

            public static void $default$onWallpaperSelected(ChatAttachViewDelegate chatAttachViewDelegate, Object obj) {
            }

            public static void $default$openAvatarsSearch(ChatAttachViewDelegate chatAttachViewDelegate) {
            }

            public static boolean $default$selectItemOnClicking(ChatAttachViewDelegate chatAttachViewDelegate) {
                return false;
            }

            public static void $default$sendAudio(ChatAttachViewDelegate chatAttachViewDelegate, ArrayList arrayList, CharSequence charSequence, boolean z, int i, long j, boolean z2) {
            }

            public static void $default$doOnIdle(ChatAttachViewDelegate _this, Runnable runnable) {
                runnable.run();
            }
        }
    }

    public static class AttachAlertLayout extends FrameLayout {
        protected ChatAttachAlert parentAlert;
        protected final Theme.ResourcesProvider resourcesProvider;

        public void applyCaption(CharSequence charSequence) {
        }

        public boolean canDismissWithTouchOutside() {
            return true;
        }

        public boolean canScheduleMessages() {
            return true;
        }

        public void checkColors() {
        }

        public int getCurrentItemTop() {
            return 0;
        }

        public int getCustomActionBarBackground() {
            return 0;
        }

        public int getCustomBackground() {
            return 0;
        }

        public int getFirstOffset() {
            return 0;
        }

        public int getListTopPadding() {
            return 0;
        }

        public int getSelectedItemsCount() {
            return 0;
        }

        public ArrayList<ThemeDescription> getThemeDescriptions() {
            return null;
        }

        public boolean hasCustomActionBarBackground() {
            return false;
        }

        public boolean hasCustomBackground() {
            return false;
        }

        public int needsActionBar() {
            return 0;
        }

        public boolean onBackPressed() {
            return false;
        }

        public void onButtonsTranslationYUpdated() {
        }

        public void onContainerTranslationUpdated(float f) {
        }

        public boolean onContainerViewTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void onDestroy() {
        }

        public boolean onDismiss() {
            return false;
        }

        public void onDismissWithButtonClick(int i) {
        }

        public boolean onDismissWithTouchOutside() {
            return true;
        }

        public void onHidden() {
        }

        public void onHide() {
        }

        public void onHideShowProgress(float f) {
        }

        public void onMenuItemClick(int i) {
        }

        public void onOpenAnimationEnd() {
        }

        public void onPanTransitionEnd() {
        }

        public void onPanTransitionStart(boolean z, int i) {
        }

        public void onPause() {
        }

        public void onPreMeasure(int i, int i2) {
        }

        public void onResume() {
        }

        public void onSelectedItemsCountChanged(int i) {
        }

        public boolean onSheetKeyDown(int i, KeyEvent keyEvent) {
            return false;
        }

        public void onShow(AttachAlertLayout attachAlertLayout) {
        }

        public void onShown() {
        }

        public void scrollToTop() {
        }

        public void sendSelectedItems(boolean z, int i, long j, boolean z2) {
        }

        public boolean shouldHideBottomButtons() {
            return true;
        }

        public AttachAlertLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            this.parentAlert = chatAttachAlert;
        }

        public int getButtonsHideOffset() {
            return AndroidUtilities.dp(needsActionBar() != 0 ? 12.0f : 17.0f);
        }

        public int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }
    }

    public class AttachButton extends FrameLayout {
        private int backgroundKey;
        private Animator checkAnimator;
        private boolean checked;
        private float checkedState;
        private int currentId;
        private RLottieImageView imageView;
        private int textKey;
        private TextView textView;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        public AttachButton(Context context) {
            super(context);
            ChatAttachAlert.this = r10;
            setWillNotDraw(false);
            setFocusable(true);
            RLottieImageView rLottieImageView = new RLottieImageView(context, r10) {
                {
                    AttachButton.this = this;
                }

                @Override
                public void setScaleX(float f) {
                    super.setScaleX(f);
                    AttachButton.this.invalidate();
                }
            };
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(32, 32.0f, 49, 0.0f, 18.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setMaxLines(2);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setTextColor(r10.getThemedColor(Theme.key_dialogTextGray2));
            this.textView.setTextSize(1, 12.0f);
            this.textView.setLineSpacing(-AndroidUtilities.dp(2.0f), 1.0f);
            this.textView.setImportantForAccessibility(2);
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(this.textView.getText());
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setSelected(this.checked);
        }

        void updateCheckedState(boolean z) {
            if (this.checked == (((long) this.currentId) == ChatAttachAlert.this.selectedId)) {
                return;
            }
            this.checked = ((long) this.currentId) == ChatAttachAlert.this.selectedId;
            Animator animator = this.checkAnimator;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                if (this.checked) {
                    this.imageView.setProgress(0.0f);
                    this.imageView.playAnimation();
                }
                float[] fArr = new float[1];
                fArr[0] = this.checked ? 1.0f : 0.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", fArr);
                this.checkAnimator = ofFloat;
                ofFloat.setDuration(200L);
                this.checkAnimator.start();
                return;
            }
            this.imageView.stopAnimation();
            this.imageView.setProgress(0.0f);
            setCheckedState(this.checked ? 1.0f : 0.0f);
        }

        @Keep
        public void setCheckedState(float f) {
            this.checkedState = f;
            float f2 = 1.0f - (f * 0.06f);
            this.imageView.setScaleX(f2);
            this.imageView.setScaleY(f2);
            this.textView.setTextColor(ColorUtils.blendARGB(ChatAttachAlert.this.getThemedColor(Theme.key_dialogTextGray2), ChatAttachAlert.this.getThemedColor(this.textKey), this.checkedState));
            invalidate();
        }

        @Keep
        public float getCheckedState() {
            return this.checkedState;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ChatAttachAlert.this.attachItemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(84.0f), 1073741824));
        }

        public void setTextAndIcon(int i, CharSequence charSequence, RLottieDrawable rLottieDrawable, int i2, int i3) {
            this.currentId = i;
            this.textView.setText(charSequence);
            this.imageView.setAnimation(rLottieDrawable);
            this.backgroundKey = i2;
            this.textKey = i3;
            this.textView.setTextColor(ColorUtils.blendARGB(ChatAttachAlert.this.getThemedColor(Theme.key_dialogTextGray2), ChatAttachAlert.this.getThemedColor(this.textKey), this.checkedState));
        }

        public void setTextAndIcon(int i, CharSequence charSequence, Drawable drawable, int i2, int i3) {
            this.currentId = i;
            this.textView.setText(charSequence);
            this.imageView.setImageDrawable(drawable);
            this.backgroundKey = i2;
            this.textKey = i3;
            this.textView.setTextColor(ColorUtils.blendARGB(ChatAttachAlert.this.getThemedColor(Theme.key_dialogTextGray2), ChatAttachAlert.this.getThemedColor(this.textKey), this.checkedState));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float scaleX = this.imageView.getScaleX() + (this.checkedState * 0.06f);
            float dp = AndroidUtilities.dp(23.0f) * scaleX;
            float left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2.0f);
            float top = this.imageView.getTop() + (this.imageView.getMeasuredWidth() / 2.0f);
            ChatAttachAlert.this.attachButtonPaint.setColor(ChatAttachAlert.this.getThemedColor(this.backgroundKey));
            ChatAttachAlert.this.attachButtonPaint.setStyle(Paint.Style.STROKE);
            ChatAttachAlert.this.attachButtonPaint.setStrokeWidth(AndroidUtilities.dp(3.0f) * scaleX);
            ChatAttachAlert.this.attachButtonPaint.setAlpha(Math.round(this.checkedState * 255.0f));
            canvas.drawCircle(left, top, dp - (ChatAttachAlert.this.attachButtonPaint.getStrokeWidth() * 0.5f), ChatAttachAlert.this.attachButtonPaint);
            ChatAttachAlert.this.attachButtonPaint.setAlpha(255);
            ChatAttachAlert.this.attachButtonPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(left, top, dp - (AndroidUtilities.dp(5.0f) * this.checkedState), ChatAttachAlert.this.attachButtonPaint);
        }
    }

    public class AttachBotButton extends FrameLayout {
        private TLRPC$TL_attachMenuBot attachMenuBot;
        private AvatarDrawable avatarDrawable;
        private ValueAnimator checkAnimator;
        private Boolean checked;
        private float checkedState;
        private TLRPC$User currentUser;
        private int iconBackgroundColor;
        private BackupImageView imageView;
        private TextView nameTextView;
        private View selector;
        private int textColor;

        public AttachBotButton(Context context) {
            super(context);
            ChatAttachAlert.this = r10;
            this.avatarDrawable = new AvatarDrawable();
            setWillNotDraw(false);
            setFocusable(true);
            setFocusableInTouchMode(true);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, r10);
            this.imageView = anonymousClass1;
            anonymousClass1.setRoundRadius(AndroidUtilities.dp(25.0f));
            addView(this.imageView, LayoutHelper.createFrame(46, 46.0f, 49, 0.0f, 9.0f, 0.0f, 0.0f));
            if (Build.VERSION.SDK_INT >= 21) {
                View view = new View(context);
                this.selector = view;
                view.setBackground(Theme.createSelectorDrawable(r10.getThemedColor(Theme.key_dialogButtonSelector), 1, AndroidUtilities.dp(23.0f)));
                addView(this.selector, LayoutHelper.createFrame(46, 46.0f, 49, 0.0f, 9.0f, 0.0f, 0.0f));
            }
            TextView textView = new TextView(context);
            this.nameTextView = textView;
            textView.setTextSize(1, 12.0f);
            this.nameTextView.setGravity(49);
            this.nameTextView.setLines(1);
            this.nameTextView.setSingleLine(true);
            this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
            addView(this.nameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 60.0f, 6.0f, 0.0f));
        }

        public class AnonymousClass1 extends BackupImageView {
            AnonymousClass1(Context context, ChatAttachAlert chatAttachAlert) {
                super(context);
                AttachBotButton.this = r1;
                this.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                    @Override
                    public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                        ChatAttachAlert.AttachBotButton.AnonymousClass1.lambda$new$0(imageReceiver, z, z2, z3);
                    }

                    @Override
                    public void didSetImageBitmap(int i, String str, Drawable drawable) {
                        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
                    }

                    @Override
                    public void onAnimationReady(ImageReceiver imageReceiver) {
                        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
                    }
                });
            }

            public static void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof RLottieDrawable) {
                    RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                    rLottieDrawable.setCustomEndFrame(0);
                    rLottieDrawable.stop();
                    rLottieDrawable.setProgress(0.0f, false);
                }
            }

            @Override
            public void setScaleX(float f) {
                super.setScaleX(f);
                AttachBotButton.this.invalidate();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.selector == null || !this.checked.booleanValue()) {
                return;
            }
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ChatAttachAlert.this.attachItemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
        }

        public void setCheckedState(float f) {
            this.checkedState = f;
            float f2 = 1.0f - (f * 0.06f);
            this.imageView.setScaleX(f2);
            this.imageView.setScaleY(f2);
            this.nameTextView.setTextColor(ColorUtils.blendARGB(ChatAttachAlert.this.getThemedColor(Theme.key_dialogTextGray2), this.textColor, this.checkedState));
            invalidate();
        }

        private void updateMargins() {
            ((ViewGroup.MarginLayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(this.attachMenuBot != null ? 62.0f : 60.0f);
            ((ViewGroup.MarginLayoutParams) this.imageView.getLayoutParams()).topMargin = AndroidUtilities.dp(this.attachMenuBot != null ? 11.0f : 9.0f);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.attachMenuBot != null) {
                float scaleX = this.imageView.getScaleX() + (this.checkedState * 0.06f);
                float dp = AndroidUtilities.dp(23.0f) * scaleX;
                float left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2.0f);
                float top = this.imageView.getTop() + (this.imageView.getMeasuredWidth() / 2.0f);
                ChatAttachAlert.this.attachButtonPaint.setColor(this.iconBackgroundColor);
                ChatAttachAlert.this.attachButtonPaint.setStyle(Paint.Style.STROKE);
                ChatAttachAlert.this.attachButtonPaint.setStrokeWidth(AndroidUtilities.dp(3.0f) * scaleX);
                ChatAttachAlert.this.attachButtonPaint.setAlpha(Math.round(this.checkedState * 255.0f));
                canvas.drawCircle(left, top, dp - (ChatAttachAlert.this.attachButtonPaint.getStrokeWidth() * 0.5f), ChatAttachAlert.this.attachButtonPaint);
                ChatAttachAlert.this.attachButtonPaint.setAlpha(255);
                ChatAttachAlert.this.attachButtonPaint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(left, top, dp - (AndroidUtilities.dp(5.0f) * this.checkedState), ChatAttachAlert.this.attachButtonPaint);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        void updateCheckedState(boolean z) {
            boolean z2 = this.attachMenuBot != null && (-this.currentUser.id) == ChatAttachAlert.this.selectedId;
            Boolean bool = this.checked;
            if (bool != null && bool.booleanValue() == z2 && z) {
                return;
            }
            this.checked = Boolean.valueOf(z2);
            ValueAnimator valueAnimator = this.checkAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            RLottieDrawable lottieAnimation = this.imageView.getImageReceiver().getLottieAnimation();
            if (z) {
                if (this.checked.booleanValue() && lottieAnimation != null) {
                    lottieAnimation.setAutoRepeat(0);
                    lottieAnimation.setCustomEndFrame(-1);
                    lottieAnimation.setProgress(0.0f, false);
                    lottieAnimation.start();
                }
                float[] fArr = new float[2];
                fArr[0] = this.checked.booleanValue() ? 0.0f : 1.0f;
                fArr[1] = this.checked.booleanValue() ? 1.0f : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.checkAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ChatAttachAlert.AttachBotButton.this.lambda$updateCheckedState$0(valueAnimator2);
                    }
                });
                this.checkAnimator.setDuration(200L);
                this.checkAnimator.start();
                return;
            }
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                lottieAnimation.setProgress(0.0f, false);
            }
            setCheckedState(this.checked.booleanValue() ? 1.0f : 0.0f);
        }

        public void lambda$updateCheckedState$0(ValueAnimator valueAnimator) {
            setCheckedState(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        public void setUser(TLRPC$User tLRPC$User) {
            if (tLRPC$User == null) {
                return;
            }
            this.nameTextView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_dialogTextGray2));
            this.currentUser = tLRPC$User;
            this.nameTextView.setText(ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name));
            this.avatarDrawable.setInfo(ChatAttachAlert.this.currentAccount, tLRPC$User);
            this.imageView.setForUserOrChat(tLRPC$User, this.avatarDrawable);
            this.imageView.setSize(-1, -1);
            this.imageView.setColorFilter(null);
            this.attachMenuBot = null;
            this.selector.setVisibility(0);
            updateMargins();
            setCheckedState(0.0f);
            invalidate();
        }

        public void setAttachBot(TLRPC$User tLRPC$User, TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
            boolean z;
            if (tLRPC$User == null || tLRPC$TL_attachMenuBot == null) {
                return;
            }
            this.nameTextView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_dialogTextGray2));
            this.currentUser = tLRPC$User;
            this.nameTextView.setText(tLRPC$TL_attachMenuBot.short_name);
            this.avatarDrawable.setInfo(ChatAttachAlert.this.currentAccount, tLRPC$User);
            TLRPC$TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
                z = false;
            } else {
                z = true;
            }
            if (animatedAttachMenuBotIcon != null) {
                this.textColor = ChatAttachAlert.this.getThemedColor(Theme.key_chat_attachContactText);
                this.iconBackgroundColor = ChatAttachAlert.this.getThemedColor(Theme.key_chat_attachContactBackground);
                Iterator<TLRPC$TL_attachMenuBotIconColor> it = animatedAttachMenuBotIcon.colors.iterator();
                while (it.hasNext()) {
                    TLRPC$TL_attachMenuBotIconColor next = it.next();
                    String str = next.name;
                    str.hashCode();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1852424286:
                            if (str.equals("dark_icon")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1852094378:
                            if (str.equals("dark_text")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -208896510:
                            if (str.equals("light_icon")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -208566602:
                            if (str.equals("light_text")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (!Theme.getCurrentTheme().isDark()) {
                                break;
                            } else {
                                this.iconBackgroundColor = next.color;
                                break;
                            }
                        case 1:
                            if (!Theme.getCurrentTheme().isDark()) {
                                break;
                            } else {
                                this.textColor = next.color;
                                break;
                            }
                        case 2:
                            if (!Theme.getCurrentTheme().isDark()) {
                                this.iconBackgroundColor = next.color;
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (!Theme.getCurrentTheme().isDark()) {
                                this.textColor = next.color;
                                break;
                            } else {
                                break;
                            }
                    }
                }
                this.textColor = ColorUtils.setAlphaComponent(this.textColor, 255);
                this.iconBackgroundColor = ColorUtils.setAlphaComponent(this.iconBackgroundColor, 255);
                TLRPC$Document tLRPC$Document = animatedAttachMenuBotIcon.icon;
                this.imageView.getImageReceiver().setAllowStartLottieAnimation(false);
                this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), String.valueOf(tLRPC$TL_attachMenuBot.bot_id), z ? "tgs" : "svg", DocumentObject.getSvgThumb(tLRPC$Document, Theme.key_windowBackgroundGray, 1.0f), tLRPC$TL_attachMenuBot);
            }
            this.imageView.setSize(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            this.imageView.setColorFilter(new PorterDuffColorFilter(ChatAttachAlert.this.getThemedColor(Theme.key_chat_attachIcon), PorterDuff.Mode.SRC_IN));
            this.attachMenuBot = tLRPC$TL_attachMenuBot;
            this.selector.setVisibility(8);
            updateMargins();
            setCheckedState(0.0f);
            invalidate();
        }
    }

    public ChatAttachAlert(Context context, BaseFragment baseFragment, boolean z, boolean z2) {
        this(context, baseFragment, z, z2, true, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ChatAttachAlert(final Context context, final BaseFragment baseFragment, boolean z, final boolean z2, boolean z3, final Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        int i;
        this.canOpenPreview = false;
        this.isSoundPicker = false;
        this.isStoryLocationPicker = false;
        this.isBizLocationPicker = false;
        this.isStoryAudioPicker = false;
        this.translationProgress = 0.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION = new AnimationProperties.FloatProperty<AttachAlertLayout>("translation") {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void setValue(AttachAlertLayout attachAlertLayout, float f) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.translationProgress = f;
                if (chatAttachAlert.nextAttachLayout == null) {
                    return;
                }
                if ((ChatAttachAlert.this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                    int max = Math.max(ChatAttachAlert.this.nextAttachLayout.getWidth(), ChatAttachAlert.this.currentAttachLayout.getWidth());
                    if (ChatAttachAlert.this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX((-max) * f);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((1.0f - f) * max);
                    } else {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX(max * f);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((-max) * (1.0f - f));
                    }
                } else {
                    ChatAttachAlert.this.nextAttachLayout.setAlpha(f);
                    ChatAttachAlert.this.nextAttachLayout.onHideShowProgress(f);
                    if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout) {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.updateSelectedPosition(chatAttachAlert2.nextAttachLayout == ChatAttachAlert.this.pollLayout ? 1 : 0);
                    }
                    ChatAttachAlert.this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) * f);
                    ChatAttachAlert.this.currentAttachLayout.onHideShowProgress(1.0f - Math.min(1.0f, f / 0.7f));
                    ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                }
                if (ChatAttachAlert.this.viewChangeAnimator != null) {
                    ChatAttachAlert.this.updateSelectedPosition(1);
                }
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }

            @Override
            public Float get(AttachAlertLayout attachAlertLayout) {
                return Float.valueOf(ChatAttachAlert.this.translationProgress);
            }
        };
        this.layouts = new AttachAlertLayout[8];
        this.botAttachLayouts = new LongSparseArray<>();
        this.commentTextViewLocation = new int[2];
        this.textPaint = new TextPaint(1);
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.sendButtonEnabled = true;
        this.sendButtonEnabledProgress = 1.0f;
        this.cornerRadius = 1.0f;
        this.botButtonProgressWasVisible = false;
        this.botButtonWasVisible = false;
        int i2 = UserConfig.selectedAccount;
        this.currentAccount = i2;
        this.documentsEnabled = true;
        this.photosEnabled = true;
        this.videosEnabled = true;
        this.musicEnabled = true;
        this.pollsEnabled = true;
        this.plainTextEnabled = true;
        this.maxSelectedPhotos = -1;
        this.allowOrder = true;
        this.attachItemSize = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.scrollOffsetY = new int[2];
        this.attachButtonPaint = new Paint(1);
        this.exclusionRects = new ArrayList<>();
        this.exclustionRect = new android.graphics.Rect();
        this.ATTACH_ALERT_PROGRESS = new AnimationProperties.FloatProperty<ChatAttachAlert>("openProgress") {
            private float openProgress;

            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void setValue(ChatAttachAlert chatAttachAlert, float f) {
                float f2;
                int childCount = ChatAttachAlert.this.buttonsRecyclerView.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    float f3 = (3 - i3) * 32.0f;
                    View childAt = ChatAttachAlert.this.buttonsRecyclerView.getChildAt(i3);
                    if (f > f3) {
                        float f4 = f - f3;
                        f2 = 1.0f;
                        if (f4 <= 200.0f) {
                            float f5 = f4 / 200.0f;
                            f2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(f5) * 1.1f;
                            childAt.setAlpha(CubicBezierInterpolator.EASE_BOTH.getInterpolation(f5));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f6 = f4 - 200.0f;
                            if (f6 <= 100.0f) {
                                f2 = 1.1f - (CubicBezierInterpolator.EASE_IN.getInterpolation(f6 / 100.0f) * 0.1f);
                            }
                        }
                    } else {
                        f2 = 0.0f;
                    }
                    if (childAt instanceof AttachButton) {
                        AttachButton attachButton = (AttachButton) childAt;
                        attachButton.textView.setScaleX(f2);
                        attachButton.textView.setScaleY(f2);
                        attachButton.imageView.setScaleX(f2);
                        attachButton.imageView.setScaleY(f2);
                    } else if (childAt instanceof AttachBotButton) {
                        AttachBotButton attachBotButton = (AttachBotButton) childAt;
                        attachBotButton.nameTextView.setScaleX(f2);
                        attachBotButton.nameTextView.setScaleY(f2);
                        attachBotButton.imageView.setScaleX(f2);
                        attachBotButton.imageView.setScaleY(f2);
                    }
                }
            }

            @Override
            public Float get(ChatAttachAlert chatAttachAlert) {
                return Float.valueOf(this.openProgress);
            }
        };
        this.allowDrawContent = true;
        this.sent = false;
        this.confirmationAlertShown = false;
        this.allowPassConfirmationAlert = false;
        boolean z4 = baseFragment instanceof ChatActivity;
        if (z4) {
            setImageReceiverNumLevel(0, 4);
        }
        this.forceDarkTheme = z;
        this.drawNavigationBar = true;
        this.inBubbleMode = z4 && baseFragment.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.baseFragment = baseFragment;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.quickRepliesUpdated);
        this.exclusionRects.add(this.exclustionRect);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, z);
        this.sizeNotifierFrameLayout = anonymousClass3;
        anonymousClass3.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void onSizeChanged(int i3, boolean z5) {
                if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout) {
                    ChatAttachAlert.this.currentAttachLayout.invalidate();
                }
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i3 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i3, 0, i3, 0);
        ActionBar actionBar = new ActionBar(context, resourcesProvider) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void setAlpha(float f) {
                float alpha = getAlpha();
                super.setAlpha(f);
                if (alpha != f) {
                    ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
                    if (ChatAttachAlert.this.frameLayout2 != null) {
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        if (chatAttachAlert.buttonsRecyclerView != null) {
                            if (chatAttachAlert.frameLayout2.getTag() == null) {
                                if (ChatAttachAlert.this.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons()) {
                                    float f2 = 1.0f - f;
                                    ChatAttachAlert.this.buttonsRecyclerView.setAlpha(f2);
                                    ChatAttachAlert.this.shadow.setAlpha(f2);
                                    ChatAttachAlert.this.buttonsRecyclerView.setTranslationY(AndroidUtilities.dp(44.0f) * f);
                                }
                                ChatAttachAlert.this.frameLayout2.setTranslationY(AndroidUtilities.dp(48.0f) * f);
                                ChatAttachAlert.this.shadow.setTranslationY((AndroidUtilities.dp(84.0f) * f) + ChatAttachAlert.this.botMainButtonOffsetY);
                            } else if (ChatAttachAlert.this.currentAttachLayout == null) {
                                float f3 = f != 0.0f ? 0.0f : 1.0f;
                                if (ChatAttachAlert.this.buttonsRecyclerView.getAlpha() != f3) {
                                    ChatAttachAlert.this.buttonsRecyclerView.setAlpha(f3);
                                }
                            }
                        }
                    }
                }
            }
        };
        this.actionBar = actionBar;
        int i4 = Theme.key_dialogBackground;
        actionBar.setBackgroundColor(getThemedColor(i4));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ActionBar actionBar2 = this.actionBar;
        int i5 = Theme.key_dialogTextBlack;
        actionBar2.setItemsColor(getThemedColor(i5), false);
        ActionBar actionBar3 = this.actionBar;
        int i6 = Theme.key_dialogButtonSelector;
        actionBar3.setItemsBackgroundColor(getThemedColor(i6), false);
        this.actionBar.setTitleColor(getThemedColor(i5));
        this.actionBar.setOccupyStatusBar(false);
        this.actionBar.setAlpha(0.0f);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void onItemClick(int i7) {
                if (i7 == -1) {
                    if (ChatAttachAlert.this.currentAttachLayout.onBackPressed()) {
                        return;
                    }
                    ChatAttachAlert.this.dismiss();
                    return;
                }
                ChatAttachAlert.this.currentAttachLayout.onMenuItemClick(i7);
            }
        });
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, getThemedColor(i5), false, resourcesProvider);
        this.selectedMenuItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        ActionBarMenuItem actionBarMenuItem2 = this.selectedMenuItem;
        int i7 = R.drawable.ic_ab_other;
        actionBarMenuItem2.setIcon(i7);
        ActionBarMenuItem actionBarMenuItem3 = this.selectedMenuItem;
        int i8 = R.string.AccDescrMoreOptions;
        actionBarMenuItem3.setContentDescription(LocaleController.getString(i8));
        this.selectedMenuItem.setVisibility(4);
        this.selectedMenuItem.setAlpha(0.0f);
        this.selectedMenuItem.setSubMenuOpenSide(2);
        this.selectedMenuItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i9) {
                ChatAttachAlert.this.lambda$new$0(i9);
            }
        });
        this.selectedMenuItem.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        this.selectedMenuItem.setTranslationX(AndroidUtilities.dp(6.0f));
        this.selectedMenuItem.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i6), 6));
        this.selectedMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$1(view);
            }
        });
        ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem(context, null, 0, getThemedColor(Theme.key_windowBackgroundWhiteBlueHeader), true, resourcesProvider);
        this.doneItem = actionBarMenuItem4;
        actionBarMenuItem4.setLongClickEnabled(false);
        this.doneItem.setText(LocaleController.getString(R.string.Create).toUpperCase());
        this.doneItem.setVisibility(4);
        this.doneItem.setAlpha(0.0f);
        this.doneItem.setTranslationX(-AndroidUtilities.dp(12.0f));
        this.doneItem.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i6), 3));
        this.doneItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$2(view);
            }
        });
        if (baseFragment != null) {
            ActionBarMenuItem actionBarMenuItem5 = new ActionBarMenuItem(context, null, 0, getThemedColor(i5), false, resourcesProvider);
            this.searchItem = actionBarMenuItem5;
            actionBarMenuItem5.setLongClickEnabled(false);
            this.searchItem.setIcon(R.drawable.ic_ab_search);
            this.searchItem.setContentDescription(LocaleController.getString(R.string.Search));
            this.searchItem.setVisibility(4);
            this.searchItem.setAlpha(0.0f);
            this.searchItem.setTranslationX(-AndroidUtilities.dp(42.0f));
            i = i6;
            this.searchItem.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i), 6));
            this.searchItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatAttachAlert.this.lambda$new$3(z2, view);
                }
            });
        } else {
            i = i6;
        }
        ActionBarMenuItem actionBarMenuItem6 = new ActionBarMenuItem(context, null, 0, getThemedColor(i5), false, resourcesProvider);
        this.optionsItem = actionBarMenuItem6;
        actionBarMenuItem6.setLongClickEnabled(false);
        this.optionsItem.setIcon(i7);
        this.optionsItem.setContentDescription(LocaleController.getString(i8));
        this.optionsItem.setVisibility(8);
        this.optionsItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 3));
        this.optionsItem.addSubItem(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$4(resourcesProvider, view);
            }
        });
        this.optionsItem.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        this.optionsItem.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        this.optionsItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$5(view);
            }
        });
        FrameLayout frameLayout = new FrameLayout(context) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                ChatAttachAlert.this.updateSelectedPosition(0);
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        this.headerView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$6(view);
            }
        });
        this.headerView.setAlpha(0.0f);
        this.headerView.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.selectedView = linearLayout;
        linearLayout.setOrientation(0);
        this.selectedView.setGravity(16);
        TextView textView = new TextView(context);
        this.selectedTextView = textView;
        textView.setTextColor(getThemedColor(i5));
        this.selectedTextView.setTextSize(1, 16.0f);
        this.selectedTextView.setTypeface(AndroidUtilities.bold());
        this.selectedTextView.setGravity(19);
        this.selectedTextView.setMaxLines(1);
        this.selectedTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.selectedView.addView(this.selectedTextView, LayoutHelper.createLinear(-2, -2, 16));
        this.selectedArrowImageView = new ImageView(context);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i5), PorterDuff.Mode.MULTIPLY));
        this.selectedArrowImageView.setImageDrawable(mutate);
        this.selectedArrowImageView.setVisibility(8);
        this.selectedView.addView(this.selectedArrowImageView, LayoutHelper.createLinear(-2, -2, 16, 4, 1, 0, 0));
        this.selectedView.setAlpha(1.0f);
        this.headerView.addView(this.selectedView, LayoutHelper.createFrame(-2, -1.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.mediaPreviewView = linearLayout2;
        linearLayout2.setOrientation(0);
        this.mediaPreviewView.setGravity(16);
        ImageView imageView = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i5), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate2);
        this.mediaPreviewView.addView(imageView, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.mediaPreviewTextView = textView2;
        textView2.setTextColor(getThemedColor(i5));
        this.mediaPreviewTextView.setTextSize(1, 16.0f);
        this.mediaPreviewTextView.setTypeface(AndroidUtilities.bold());
        this.mediaPreviewTextView.setGravity(19);
        this.mediaPreviewTextView.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        this.mediaPreviewView.setAlpha(0.0f);
        this.mediaPreviewView.addView(this.mediaPreviewTextView, LayoutHelper.createLinear(-2, -2, 16));
        this.headerView.addView(this.mediaPreviewView, LayoutHelper.createFrame(-2, -1.0f));
        AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z, z3, resourcesProvider);
        this.photoLayout = chatAttachAlertPhotoLayout;
        attachAlertLayoutArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.photoLayout;
        this.currentAttachLayout = chatAttachAlertPhotoLayout2;
        this.selectedId = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout2, LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.addView(this.headerView, LayoutHelper.createFrame(-1, -2.0f, 51, 23.0f, 0.0f, 12.0f, 0.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.containerView.addView(this.selectedMenuItem, LayoutHelper.createFrame(48, 48, 53));
        ActionBarMenuItem actionBarMenuItem7 = this.searchItem;
        if (actionBarMenuItem7 != null) {
            this.containerView.addView(actionBarMenuItem7, LayoutHelper.createFrame(48, 48, 53));
        }
        ActionBarMenuItem actionBarMenuItem8 = this.optionsItem;
        if (actionBarMenuItem8 != null) {
            this.headerView.addView(actionBarMenuItem8, LayoutHelper.createFrame(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        }
        this.containerView.addView(this.doneItem, LayoutHelper.createFrame(-2, 48, 53));
        View view = new View(context);
        this.actionBarShadow = view;
        view.setAlpha(0.0f);
        this.actionBarShadow.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
        this.containerView.addView(this.actionBarShadow, LayoutHelper.createFrame(-1, 1.0f));
        View view2 = new View(context);
        this.shadow = view2;
        view2.setBackgroundResource(R.drawable.attach_shadow);
        this.shadow.getBackground().setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        this.containerView.addView(this.shadow, LayoutHelper.createFrame(-1, 2.0f, 83, 0.0f, 0.0f, 0.0f, 84.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                ChatAttachAlert.this.currentAttachLayout.onButtonsTranslationYUpdated();
            }
        };
        this.buttonsRecyclerView = recyclerListView;
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(context);
        this.buttonsAdapter = buttonsAdapter;
        recyclerListView.setAdapter(buttonsAdapter);
        RecyclerListView recyclerListView2 = this.buttonsRecyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.buttonsLayoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.buttonsRecyclerView.setVerticalScrollBarEnabled(false);
        this.buttonsRecyclerView.setHorizontalScrollBarEnabled(false);
        this.buttonsRecyclerView.setItemAnimator(null);
        this.buttonsRecyclerView.setLayoutAnimation(null);
        this.buttonsRecyclerView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.buttonsRecyclerView.setBackgroundColor(getThemedColor(i4));
        this.buttonsRecyclerView.setImportantForAccessibility(1);
        this.containerView.addView(this.buttonsRecyclerView, LayoutHelper.createFrame(-1, 84, 83));
        this.buttonsRecyclerView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view3, int i9) {
                ChatAttachAlert.this.lambda$new$12(resourcesProvider, view3, i9);
            }
        });
        this.buttonsRecyclerView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view3, int i9) {
                boolean lambda$new$13;
                lambda$new$13 = ChatAttachAlert.this.lambda$new$13(view3, i9);
                return lambda$new$13;
            }
        });
        TextView textView3 = new TextView(context);
        this.botMainButtonTextView = textView3;
        textView3.setVisibility(8);
        this.botMainButtonTextView.setAlpha(0.0f);
        this.botMainButtonTextView.setSingleLine();
        this.botMainButtonTextView.setGravity(17);
        this.botMainButtonTextView.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        this.botMainButtonTextView.setPadding(dp, 0, dp, 0);
        this.botMainButtonTextView.setTextSize(1, 14.0f);
        this.botMainButtonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                ChatAttachAlert.this.lambda$new$14(view3);
            }
        });
        this.containerView.addView(this.botMainButtonTextView, LayoutHelper.createFrame(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.botProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        this.botProgressView.setAlpha(0.0f);
        this.botProgressView.setScaleX(0.1f);
        this.botProgressView.setScaleY(0.1f);
        this.botProgressView.setVisibility(8);
        this.containerView.addView(this.botProgressView, LayoutHelper.createFrame(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(context, z);
        this.frameLayout2 = anonymousClass11;
        anonymousClass11.setWillNotDraw(false);
        this.frameLayout2.setVisibility(4);
        this.frameLayout2.setAlpha(0.0f);
        this.containerView.addView(this.frameLayout2, LayoutHelper.createFrame(-1, -2, 83));
        this.frameLayout2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                boolean lambda$new$15;
                lambda$new$15 = ChatAttachAlert.lambda$new$15(view3, motionEvent);
                return lambda$new$15;
            }
        });
        NumberTextView numberTextView = new NumberTextView(context);
        this.captionLimitView = numberTextView;
        numberTextView.setVisibility(8);
        numberTextView.setTextSize(15);
        numberTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        numberTextView.setTypeface(AndroidUtilities.bold());
        numberTextView.setCenterAlign(true);
        this.frameLayout2.addView(numberTextView, LayoutHelper.createFrame(56, 20.0f, 85, 3.0f, 0.0f, 14.0f, 78.0f));
        this.currentLimit = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(context, this.sizeNotifierFrameLayout, null, 1, true, resourcesProvider);
        this.commentTextView = anonymousClass12;
        anonymousClass12.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        this.commentTextView.onResume();
        this.commentTextView.getEditText().addTextChangedListener(new TextWatcher() {
            private boolean processChange;
            private boolean wasEmpty;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }

            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                if (i11 - i10 >= 1) {
                    this.processChange = true;
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.mentionContainer == null) {
                    chatAttachAlert.createMentionsContainer();
                }
                if (ChatAttachAlert.this.mentionContainer.getAdapter() != null) {
                    ChatAttachAlert.this.mentionContainer.getAdapter().lambda$searchUsernameOrHashtag$7(charSequence, ChatAttachAlert.this.commentTextView.getEditText().getSelectionStart(), null, false, false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int i9;
                boolean z5 = true;
                if (this.wasEmpty != TextUtils.isEmpty(editable)) {
                    if (ChatAttachAlert.this.currentAttachLayout != null) {
                        ChatAttachAlert.this.currentAttachLayout.onSelectedItemsCountChanged(ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount());
                    }
                    this.wasEmpty = !this.wasEmpty;
                }
                if (this.processChange) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji((CharSequence) editable, ChatAttachAlert.this.commentTextView.getEditText().getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
                    this.processChange = false;
                }
                ChatAttachAlert.this.codepointCount = Character.codePointCount(editable, 0, editable.length());
                if (ChatAttachAlert.this.currentLimit <= 0 || (i9 = ChatAttachAlert.this.currentLimit - ChatAttachAlert.this.codepointCount) > 100) {
                    ChatAttachAlert.this.captionLimitView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                        {
                            AnonymousClass13.this = this;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlert.this.captionLimitView.setVisibility(8);
                        }
                    });
                } else {
                    if (i9 < -9999) {
                        i9 = -9999;
                    }
                    ChatAttachAlert.this.captionLimitView.setNumber(i9, ChatAttachAlert.this.captionLimitView.getVisibility() == 0);
                    if (ChatAttachAlert.this.captionLimitView.getVisibility() != 0) {
                        ChatAttachAlert.this.captionLimitView.setVisibility(0);
                        ChatAttachAlert.this.captionLimitView.setAlpha(0.0f);
                        ChatAttachAlert.this.captionLimitView.setScaleX(0.5f);
                        ChatAttachAlert.this.captionLimitView.setScaleY(0.5f);
                    }
                    ChatAttachAlert.this.captionLimitView.animate().setListener(null).cancel();
                    ChatAttachAlert.this.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i9 < 0) {
                        ChatAttachAlert.this.captionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_text_RedRegular));
                        z5 = false;
                    } else {
                        ChatAttachAlert.this.captionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                    }
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.sendButtonEnabled != z5) {
                    chatAttachAlert.sendButtonEnabled = z5;
                    chatAttachAlert.writeButton.invalidate();
                }
            }
        });
        this.frameLayout2.addView(this.commentTextView, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        this.frameLayout2.setClipChildren(false);
        this.commentTextView.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ChatAttachAlert.this.photoLayout.getSelectedItemsCount(), new Object[0]));
                } else if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.documentLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", ChatAttachAlert.this.documentLayout.getSelectedItemsCount(), new Object[0]));
                } else if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.audioLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", ChatAttachAlert.this.audioLayout.getSelectedItemsCount(), new Object[0]));
                }
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
            }
        };
        this.writeButtonContainer = frameLayout2;
        frameLayout2.setFocusable(true);
        this.writeButtonContainer.setFocusableInTouchMode(true);
        this.writeButtonContainer.setVisibility(4);
        this.writeButtonContainer.setScaleX(0.2f);
        this.writeButtonContainer.setScaleY(0.2f);
        this.writeButtonContainer.setAlpha(0.0f);
        this.containerView.addView(this.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 6.0f, 10.0f));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(context, R.drawable.attach_send, resourcesProvider) {
            @Override
            public boolean isOpen() {
                return true;
            }

            @Override
            public boolean shouldDrawBackground() {
                return true;
            }

            {
                ChatAttachAlert.this = this;
            }

            @Override
            public boolean isInScheduleMode() {
                return super.isInScheduleMode();
            }

            @Override
            public boolean isInactive() {
                return !ChatAttachAlert.this.sendButtonEnabled;
            }

            @Override
            public int getFillColor() {
                return ChatAttachAlert.this.getThemedColor(Theme.key_dialogFloatingButton);
            }
        };
        this.writeButton = sendButton;
        sendButton.center = true;
        sendButton.setImportantForAccessibility(2);
        this.writeButtonContainer.addView(this.writeButton, LayoutHelper.createFrame(64, 64.0f, 51, -4.0f, -4.0f, 0.0f, 0.0f));
        this.writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                ChatAttachAlert.this.lambda$new$17(baseFragment, resourcesProvider, view3);
            }
        });
        this.writeButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view3) {
                boolean lambda$new$26;
                lambda$new$26 = ChatAttachAlert.this.lambda$new$26(context, resourcesProvider, baseFragment, view3);
                return lambda$new$26;
            }
        });
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        View view3 = new View(context) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            protected void onDraw(Canvas canvas) {
                int ceil;
                int i9;
                int i10;
                String format = String.format("%d", Integer.valueOf(Math.max(1, ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(ChatAttachAlert.this.textPaint.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = ChatAttachAlert.this.getThemedColor(Theme.key_dialogRoundCheckBoxCheck);
                TextPaint textPaint = ChatAttachAlert.this.textPaint;
                double alpha = Color.alpha(themedColor);
                double d = ChatAttachAlert.this.sendButtonEnabledProgress;
                Double.isNaN(d);
                Double.isNaN(alpha);
                textPaint.setColor(ColorUtils.setAlphaComponent(themedColor, (int) (alpha * ((d * 0.42d) + 0.58d))));
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_dialogBackground));
                int i11 = max / 2;
                ChatAttachAlert.this.rect.set(measuredWidth - i11, 0.0f, i11 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(ChatAttachAlert.this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ChatAttachAlert.this.paint);
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_chat_attachCheckBoxBackground));
                ChatAttachAlert.this.rect.set(i9 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), i10 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ChatAttachAlert.this.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ChatAttachAlert.this.paint);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), ChatAttachAlert.this.textPaint);
            }
        };
        this.selectedCountView = view3;
        view3.setAlpha(0.0f);
        this.selectedCountView.setScaleX(0.2f);
        this.selectedCountView.setScaleY(0.2f);
        if (z) {
            checkColors();
            this.navBarColorKey = -1;
        }
        PasscodeView passcodeView = new PasscodeView(context);
        this.passcodeView = passcodeView;
        this.containerView.addView(passcodeView, LayoutHelper.createFrame(-1, -1.0f));
    }

    public class AnonymousClass3 extends SizeNotifierFrameLayout {
        AdjustPanLayoutHelper adjustPanLayoutHelper;
        private boolean ignoreLayout;
        private float initialTranslationY;
        private int lastNotifyWidth;
        private RectF rect;
        final boolean val$forceDarkTheme;

        AnonymousClass3(Context context, boolean z) {
            super(context);
            ChatAttachAlert.this = r1;
            this.val$forceDarkTheme = z;
            new Bulletin.Delegate() {
                @Override
                public boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public boolean clipWithGradient(int i) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
                }

                @Override
                public int getTopOffset(int i) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
                }

                @Override
                public void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }

                {
                    AnonymousClass3.this = this;
                }

                @Override
                public int getBottomOffset(int i) {
                    return (AnonymousClass3.this.getHeight() - ChatAttachAlert.this.frameLayout2.getTop()) + AndroidUtilities.dp(52.0f);
                }
            };
            this.rect = new RectF();
            this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
                {
                    AnonymousClass3.this = this;
                }

                @Override
                public void onTransitionStart(boolean r5, int r6) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.AnonymousClass3.AnonymousClass2.onTransitionStart(boolean, int):void");
                }

                @Override
                public void onTransitionEnd() {
                    super.onTransitionEnd();
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, false, 0);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.previousScrollOffsetY = chatAttachAlert2.scrollOffsetY[0];
                    ChatAttachAlert.this.currentAttachLayout.onPanTransitionEnd();
                    if (!(ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertBotWebViewLayout) || ChatAttachAlert.this.botButtonWasVisible) {
                        return;
                    }
                    int dp = ((BottomSheet) ChatAttachAlert.this).keyboardVisible ? AndroidUtilities.dp(84.0f) : 0;
                    for (int i = 0; i < ChatAttachAlert.this.botAttachLayouts.size(); i++) {
                        ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i)).setMeasureOffsetY(dp);
                    }
                }

                @Override
                public void onPanTranslationUpdate(float f, float f2, boolean z2) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.currentPanTranslationY = f;
                    if (chatAttachAlert.fromScrollY > 0.0f) {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.currentPanTranslationY += (chatAttachAlert2.fromScrollY - ChatAttachAlert.this.toScrollY) * (1.0f - f2);
                    }
                    ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
                    chatAttachAlert3.actionBar.setTranslationY(chatAttachAlert3.currentPanTranslationY);
                    ChatAttachAlert chatAttachAlert4 = ChatAttachAlert.this;
                    chatAttachAlert4.selectedMenuItem.setTranslationY(chatAttachAlert4.currentPanTranslationY);
                    ChatAttachAlert chatAttachAlert5 = ChatAttachAlert.this;
                    ActionBarMenuItem actionBarMenuItem = chatAttachAlert5.searchItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setTranslationY(chatAttachAlert5.currentPanTranslationY);
                    }
                    ChatAttachAlert chatAttachAlert6 = ChatAttachAlert.this;
                    chatAttachAlert6.doneItem.setTranslationY(chatAttachAlert6.currentPanTranslationY);
                    ChatAttachAlert.this.actionBarShadow.setTranslationY(ChatAttachAlert.this.currentPanTranslationY);
                    ChatAttachAlert.this.updateSelectedPosition(0);
                    ChatAttachAlert chatAttachAlert7 = ChatAttachAlert.this;
                    chatAttachAlert7.setCurrentPanTranslationY(chatAttachAlert7.currentPanTranslationY);
                    AnonymousClass3.this.invalidate();
                    ChatAttachAlert.this.frameLayout2.invalidate();
                    ChatAttachAlert.this.updateCommentTextViewPosition();
                    if (ChatAttachAlert.this.currentAttachLayout != null) {
                        ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                    }
                }

                @Override
                protected boolean heightAnimationEnabled() {
                    if (ChatAttachAlert.this.isDismissed() || !ChatAttachAlert.this.openTransitionFinished) {
                        return false;
                    }
                    return !(ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.commentTextView.isPopupVisible()) || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout && !ChatAttachAlert.this.pollLayout.isPopupVisible());
                }
            };
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            if (motionEvent.getAction() == 0 && ChatAttachAlert.this.scrollOffsetY[0] != 0 && motionEvent.getY() < getCurrentTop() && ChatAttachAlert.this.actionBar.getAlpha() == 0.0f) {
                ChatAttachAlert.this.onDismissWithTouchOutside();
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            return !ChatAttachAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size;
            if (getLayoutParams().height > 0) {
                size = getLayoutParams().height;
            } else {
                size = View.MeasureSpec.getSize(i2);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (!chatAttachAlert.inBubbleMode) {
                    this.ignoreLayout = true;
                    setPadding(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, 0);
                    this.ignoreLayout = false;
                }
            }
            getPaddingTop();
            int size2 = View.MeasureSpec.getSize(i) - (((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft * 2);
            if (AndroidUtilities.isTablet()) {
                ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            } else {
                android.graphics.Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(0);
                } else {
                    ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
                }
            }
            ((FrameLayout.LayoutParams) ChatAttachAlert.this.actionBarShadow.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
            ((FrameLayout.LayoutParams) ChatAttachAlert.this.doneItem.getLayoutParams()).height = ActionBar.getCurrentActionBarHeight();
            this.ignoreLayout = true;
            int min = (int) (size2 / Math.min(4.5f, ChatAttachAlert.this.buttonsAdapter.getItemCount()));
            if (ChatAttachAlert.this.attachItemSize != min) {
                ChatAttachAlert.this.attachItemSize = min;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlert.AnonymousClass3.this.lambda$onMeasure$0();
                    }
                });
            }
            this.ignoreLayout = false;
            onMeasureInternal(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        public void lambda$onMeasure$0() {
            ChatAttachAlert.this.buttonsAdapter.notifyDataSetChanged();
        }

        private void onMeasureInternal(int i, int i2) {
            int emojiPadding;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            int i3 = size - (((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft * 2);
            if (!ChatAttachAlert.this.commentTextView.isWaitingForKeyboardOpen() && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.commentTextView.isPopupShowing() && !ChatAttachAlert.this.commentTextView.isAnimatePopupClosing()) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.commentTextView.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (ChatAttachAlert.this.pollLayout != null && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.pollLayout.isWaitingForKeyboardOpen() && !ChatAttachAlert.this.pollLayout.isPopupShowing() && !ChatAttachAlert.this.pollLayout.isAnimatePopupClosing() && !ChatAttachAlert.this.pollLayout.isEmojiSearchOpened) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.pollLayout.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (AndroidUtilities.dp(20.0f) >= 0) {
                if (!((BottomSheet) ChatAttachAlert.this).keyboardVisible) {
                    if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout && ChatAttachAlert.this.pollLayout.emojiView != null) {
                        emojiPadding = ChatAttachAlert.this.pollLayout.getEmojiPadding();
                    } else {
                        emojiPadding = ChatAttachAlert.this.commentTextView.getEmojiPadding();
                    }
                } else {
                    emojiPadding = (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout && ChatAttachAlert.this.pollLayout.emojiView != null && ChatAttachAlert.this.pollLayout.isEmojiSearchOpened) ? AndroidUtilities.dp(120.0f) + 0 : 0;
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    size2 -= emojiPadding;
                    i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                }
                this.ignoreLayout = true;
                ChatAttachAlert.this.currentAttachLayout.onPreMeasure(i3, size2);
                if (ChatAttachAlert.this.nextAttachLayout != null) {
                    ChatAttachAlert.this.nextAttachLayout.onPreMeasure(i3, size2);
                }
                this.ignoreLayout = false;
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8) {
                    EditTextEmoji editTextEmoji = ChatAttachAlert.this.commentTextView;
                    if ((editTextEmoji != null && editTextEmoji.isPopupView(childAt)) || (ChatAttachAlert.this.pollLayout != null && childAt == ChatAttachAlert.this.pollLayout.emojiView)) {
                        if (ChatAttachAlert.this.inBubbleMode) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size2, 1073741824));
                        } else if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                            if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (size2 - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                            }
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        }
                    } else {
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                    }
                }
            }
        }

        @Override
        public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.AnonymousClass3.onLayout(boolean, int, int, int, int):void");
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        private float getY(View view) {
            int i;
            int dp;
            float dp2;
            if (view instanceof AttachAlertLayout) {
                AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
                int needsActionBar = attachAlertLayout.needsActionBar();
                int dp3 = AndroidUtilities.dp(13.0f);
                FrameLayout frameLayout = ChatAttachAlert.this.headerView;
                int alpha = dp3 + ((int) ((frameLayout != null ? frameLayout.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f)));
                int scrollOffsetY = (ChatAttachAlert.this.getScrollOffsetY(0) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - alpha;
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                    scrollOffsetY = (int) (scrollOffsetY + view.getTranslationY());
                }
                int dp4 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                if (needsActionBar == 0) {
                    i = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                } else {
                    i = ActionBar.getCurrentActionBarHeight();
                }
                if (needsActionBar != 2 && scrollOffsetY + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop < i) {
                    float f = alpha;
                    if (attachAlertLayout != ChatAttachAlert.this.locationLayout) {
                        if (attachAlertLayout == ChatAttachAlert.this.pollLayout) {
                            dp2 = f - AndroidUtilities.dp(3.0f);
                            dp4 -= (int) (((i - dp2) + AndroidUtilities.statusBarHeight) * ChatAttachAlert.this.actionBar.getAlpha());
                        } else {
                            dp = AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    dp2 = f + dp;
                    dp4 -= (int) (((i - dp2) + AndroidUtilities.statusBarHeight) * ChatAttachAlert.this.actionBar.getAlpha());
                }
                if (Build.VERSION.SDK_INT >= 21 && !ChatAttachAlert.this.inBubbleMode) {
                    dp4 += AndroidUtilities.statusBarHeight;
                }
                return dp4;
            }
            return 0.0f;
        }

        private void drawChildBackground(Canvas canvas, View view) {
            int i;
            int dp;
            float dp2;
            float f;
            int themedColor;
            float f2;
            int themedColor2;
            float alpha;
            float f3;
            if (view instanceof AttachAlertLayout) {
                canvas.save();
                canvas.translate(0.0f, ChatAttachAlert.this.currentPanTranslationY);
                int alpha2 = (int) (view.getAlpha() * 255.0f);
                AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
                int needsActionBar = attachAlertLayout.needsActionBar();
                int dp3 = AndroidUtilities.dp(13.0f);
                FrameLayout frameLayout = ChatAttachAlert.this.headerView;
                int alpha3 = dp3 + ((int) ((frameLayout != null ? frameLayout.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f)));
                int scrollOffsetY = (ChatAttachAlert.this.getScrollOffsetY(0) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - alpha3;
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                    scrollOffsetY = (int) (scrollOffsetY + view.getTranslationY());
                }
                int dp4 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(45.0f) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                if (needsActionBar == 0) {
                    i = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                } else {
                    i = ActionBar.getCurrentActionBarHeight();
                }
                if (needsActionBar == 2) {
                    f = scrollOffsetY < i ? Math.max(0.0f, 1.0f - ((i - scrollOffsetY) / ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop)) : 1.0f;
                } else {
                    float f4 = alpha3;
                    if (attachAlertLayout != ChatAttachAlert.this.locationLayout) {
                        if (attachAlertLayout == ChatAttachAlert.this.pollLayout) {
                            dp2 = f4 - AndroidUtilities.dp(3.0f);
                            float alpha4 = ChatAttachAlert.this.actionBar.getAlpha();
                            int i2 = (int) (((i - dp2) + AndroidUtilities.statusBarHeight) * alpha4);
                            scrollOffsetY -= i2;
                            dp4 -= i2;
                            measuredHeight += i2;
                            f = 1.0f - alpha4;
                        } else {
                            dp = AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    dp2 = f4 + dp;
                    float alpha42 = ChatAttachAlert.this.actionBar.getAlpha();
                    int i22 = (int) (((i - dp2) + AndroidUtilities.statusBarHeight) * alpha42);
                    scrollOffsetY -= i22;
                    dp4 -= i22;
                    measuredHeight += i22;
                    f = 1.0f - alpha42;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 21 && !ChatAttachAlert.this.inBubbleMode) {
                    int i4 = AndroidUtilities.statusBarHeight;
                    scrollOffsetY += i4;
                    dp4 += i4;
                    measuredHeight -= i4;
                }
                if (ChatAttachAlert.this.currentAttachLayout.hasCustomBackground()) {
                    themedColor = ChatAttachAlert.this.currentAttachLayout.getCustomBackground();
                } else {
                    themedColor = ChatAttachAlert.this.getThemedColor(this.val$forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground);
                }
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setAlpha(alpha2);
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setBounds(0, scrollOffsetY, getMeasuredWidth(), measuredHeight);
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.draw(canvas);
                if (needsActionBar == 2) {
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                    canvas.save();
                    RectF rectF = this.rect;
                    float f5 = rectF.left;
                    float f6 = rectF.top;
                    canvas.clipRect(f5, f6, rectF.right, (rectF.height() / 2.0f) + f6);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                    canvas.restore();
                }
                if ((f != 1.0f && needsActionBar != 2) || ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                    Paint paint = Theme.dialogs_onlineCirclePaint;
                    if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                        themedColor = ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground();
                    }
                    paint.setColor(themedColor);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                    canvas.save();
                    RectF rectF2 = this.rect;
                    float f7 = rectF2.left;
                    float f8 = rectF2.top;
                    canvas.clipRect(f7, f8, rectF2.right, (rectF2.height() / 2.0f) + f8);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                    canvas.restore();
                }
                if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                    Theme.dialogs_onlineCirclePaint.setColor(ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground());
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    int scrollOffsetY2 = ChatAttachAlert.this.getScrollOffsetY(0);
                    if (i3 >= 21 && !ChatAttachAlert.this.inBubbleMode) {
                        scrollOffsetY2 += AndroidUtilities.statusBarHeight;
                    }
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, (((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(12.0f)) * f, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, scrollOffsetY2 + AndroidUtilities.dp(12.0f));
                    canvas.save();
                    canvas.drawRect(this.rect, Theme.dialogs_onlineCirclePaint);
                    canvas.restore();
                }
                FrameLayout frameLayout2 = ChatAttachAlert.this.headerView;
                if ((frameLayout2 == null || frameLayout2.getAlpha() != 1.0f) && f != 0.0f) {
                    int dp5 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - dp5) / 2, dp4, (getMeasuredWidth() + dp5) / 2, dp4 + AndroidUtilities.dp(4.0f));
                    if (needsActionBar == 2) {
                        themedColor2 = 536870912;
                        f3 = f;
                    } else if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                        int customActionBarBackground = ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground();
                        themedColor2 = ColorUtils.blendARGB(customActionBarBackground, ColorUtils.calculateLuminance(customActionBarBackground) < 0.5d ? -1 : -16777216, 0.5f);
                        FrameLayout frameLayout3 = ChatAttachAlert.this.headerView;
                        if (frameLayout3 != null) {
                            alpha = frameLayout3.getAlpha();
                            f2 = 1.0f;
                            f3 = f2 - alpha;
                        }
                        f3 = 1.0f;
                    } else {
                        f2 = 1.0f;
                        themedColor2 = ChatAttachAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                        FrameLayout frameLayout4 = ChatAttachAlert.this.headerView;
                        if (frameLayout4 != null) {
                            alpha = frameLayout4.getAlpha();
                            f3 = f2 - alpha;
                        }
                        f3 = 1.0f;
                    }
                    int alpha5 = Color.alpha(themedColor2);
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor2);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (alpha5 * f3 * f * view.getAlpha()));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                canvas.restore();
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            int i;
            int dp;
            float dp2;
            float f;
            int themedColor;
            boolean drawChild;
            int themedColor2;
            float alpha;
            if ((view instanceof AttachAlertLayout) && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(0.0f, ChatAttachAlert.this.currentPanTranslationY);
                int alpha2 = (int) (view.getAlpha() * 255.0f);
                AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
                int needsActionBar = attachAlertLayout.needsActionBar();
                int dp3 = AndroidUtilities.dp(13.0f);
                FrameLayout frameLayout = ChatAttachAlert.this.headerView;
                int dp4 = dp3 + (frameLayout != null ? AndroidUtilities.dp(frameLayout.getAlpha() * 26.0f) : 0);
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                int scrollOffsetY = (chatAttachAlert.getScrollOffsetY(attachAlertLayout == chatAttachAlert.currentAttachLayout ? 0 : 1) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - dp4;
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                    scrollOffsetY = (int) (scrollOffsetY + view.getTranslationY());
                }
                int dp5 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(45.0f) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                if (needsActionBar == 0) {
                    i = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                } else {
                    i = ActionBar.getCurrentActionBarHeight();
                }
                if (needsActionBar == 2) {
                    if (scrollOffsetY < i) {
                        f = Math.max(0.0f, 1.0f - ((i - scrollOffsetY) / ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop));
                    }
                    f = 1.0f;
                } else {
                    if (((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY < i) {
                        float f2 = dp4;
                        if (attachAlertLayout != ChatAttachAlert.this.locationLayout) {
                            if (attachAlertLayout == ChatAttachAlert.this.pollLayout) {
                                dp2 = f2 - AndroidUtilities.dp(3.0f);
                                float min = Math.min(1.0f, ((i - scrollOffsetY) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) / dp2);
                                int i2 = (int) ((i - dp2) * min);
                                scrollOffsetY -= i2;
                                dp5 -= i2;
                                measuredHeight += i2;
                                f = 1.0f - min;
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                        } else {
                            dp = AndroidUtilities.dp(11.0f);
                        }
                        dp2 = f2 + dp;
                        float min2 = Math.min(1.0f, ((i - scrollOffsetY) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) / dp2);
                        int i22 = (int) ((i - dp2) * min2);
                        scrollOffsetY -= i22;
                        dp5 -= i22;
                        measuredHeight += i22;
                        f = 1.0f - min2;
                    }
                    f = 1.0f;
                }
                if (Build.VERSION.SDK_INT >= 21 && !ChatAttachAlert.this.inBubbleMode) {
                    int i3 = AndroidUtilities.statusBarHeight;
                    scrollOffsetY += i3;
                    dp5 += i3;
                    measuredHeight -= i3;
                }
                if (ChatAttachAlert.this.currentAttachLayout.hasCustomBackground()) {
                    themedColor = ChatAttachAlert.this.currentAttachLayout.getCustomBackground();
                } else {
                    themedColor = ChatAttachAlert.this.getThemedColor(this.val$forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground);
                }
                boolean z = (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout || ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.photoPreviewLayout || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout && ChatAttachAlert.this.nextAttachLayout == null)) ? false : true;
                if (z) {
                    ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setAlpha(alpha2);
                    ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setBounds(0, scrollOffsetY, getMeasuredWidth(), measuredHeight);
                    ((BottomSheet) ChatAttachAlert.this).shadowDrawable.draw(canvas);
                    if (needsActionBar == 2) {
                        Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                        Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                        this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                        canvas.save();
                        RectF rectF = this.rect;
                        float f3 = rectF.left;
                        float f4 = rectF.top;
                        canvas.clipRect(f3, f4, rectF.right, (rectF.height() / 2.0f) + f4);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                        canvas.restore();
                    }
                }
                if (view != ChatAttachAlert.this.contactsLayout && view != ChatAttachAlert.this.quickRepliesLayout && view != ChatAttachAlert.this.audioLayout) {
                    canvas.save();
                    canvas.clipRect(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, (ChatAttachAlert.this.actionBar.getY() + ChatAttachAlert.this.actionBar.getMeasuredHeight()) - ChatAttachAlert.this.currentPanTranslationY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, getMeasuredHeight());
                    drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                } else {
                    drawChild = super.drawChild(canvas, view, j);
                }
                if (z) {
                    if (f != 1.0f && needsActionBar != 2) {
                        Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                        Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                        this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                        canvas.save();
                        RectF rectF2 = this.rect;
                        float f5 = rectF2.left;
                        float f6 = rectF2.top;
                        canvas.clipRect(f5, f6, rectF2.right, (rectF2.height() / 2.0f) + f6);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                        canvas.restore();
                    }
                    FrameLayout frameLayout2 = ChatAttachAlert.this.headerView;
                    if ((frameLayout2 == null || frameLayout2.getAlpha() != 1.0f) && f != 0.0f) {
                        int dp6 = AndroidUtilities.dp(36.0f);
                        this.rect.set((getMeasuredWidth() - dp6) / 2, dp5, (getMeasuredWidth() + dp6) / 2, dp5 + AndroidUtilities.dp(4.0f));
                        if (needsActionBar == 2) {
                            themedColor2 = 536870912;
                            alpha = f;
                        } else {
                            themedColor2 = ChatAttachAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                            FrameLayout frameLayout3 = ChatAttachAlert.this.headerView;
                            alpha = frameLayout3 == null ? 1.0f : 1.0f - frameLayout3.getAlpha();
                        }
                        int alpha3 = Color.alpha(themedColor2);
                        Theme.dialogs_onlineCirclePaint.setColor(themedColor2);
                        Theme.dialogs_onlineCirclePaint.setAlpha((int) (alpha3 * alpha * f * view.getAlpha()));
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    }
                }
                canvas.restore();
                return drawChild;
            }
            ActionBar actionBar = ChatAttachAlert.this.actionBar;
            if (view == actionBar) {
                float alpha4 = actionBar.getAlpha();
                if (alpha4 <= 0.0f) {
                    return false;
                }
                if (alpha4 >= 1.0f) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(ChatAttachAlert.this.actionBar.getX(), getY(ChatAttachAlert.this.currentAttachLayout), ChatAttachAlert.this.actionBar.getX() + ChatAttachAlert.this.actionBar.getWidth(), ChatAttachAlert.this.actionBar.getY() + ChatAttachAlert.this.actionBar.getHeight());
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            boolean z = ChatAttachAlert.this.inBubbleMode;
        }

        private int getCurrentTop() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            int i = chatAttachAlert.scrollOffsetY[0] - (((BottomSheet) chatAttachAlert).backgroundPaddingTop * 2);
            int dp = AndroidUtilities.dp(13.0f);
            FrameLayout frameLayout = ChatAttachAlert.this.headerView;
            int dp2 = (i - (dp + (frameLayout != null ? AndroidUtilities.dp(frameLayout.getAlpha() * 26.0f) : 0))) + AndroidUtilities.dp(20.0f);
            return (Build.VERSION.SDK_INT < 21 || ChatAttachAlert.this.inBubbleMode) ? dp2 : dp2 + AndroidUtilities.statusBarHeight;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout || ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.photoPreviewLayout || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout && ChatAttachAlert.this.nextAttachLayout == null)) {
                drawChildBackground(canvas, ChatAttachAlert.this.currentAttachLayout);
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public void setTranslationY(float f) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            float f2 = f + chatAttachAlert.currentPanTranslationY;
            if (((BottomSheet) chatAttachAlert).currentSheetAnimationType == 0) {
                this.initialTranslationY = f2;
            }
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1) {
                if (f2 < 0.0f) {
                    ChatAttachAlert.this.currentAttachLayout.setTranslationY(f2);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    if (chatAttachAlert2.avatarPicker != 0 || chatAttachAlert2.storyMediaPicker) {
                        chatAttachAlert2.headerView.setTranslationY((chatAttachAlert2.baseSelectedTextViewTranslationY + f2) - ChatAttachAlert.this.currentPanTranslationY);
                    }
                    ChatAttachAlert.this.buttonsRecyclerView.setTranslationY(0.0f);
                    f2 = 0.0f;
                } else {
                    ChatAttachAlert.this.currentAttachLayout.setTranslationY(0.0f);
                    RecyclerListView recyclerListView = ChatAttachAlert.this.buttonsRecyclerView;
                    recyclerListView.setTranslationY((-f2) + (recyclerListView.getMeasuredHeight() * (f2 / this.initialTranslationY)));
                }
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }
            super.setTranslationY(f2 - ChatAttachAlert.this.currentPanTranslationY);
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType != 1) {
                ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.adjustPanLayoutHelper.setResizableView(this);
            this.adjustPanLayoutHelper.onAttach();
            ChatAttachAlert.this.commentTextView.setAdjustPanLayoutHelper(this.adjustPanLayoutHelper);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.adjustPanLayoutHelper.onDetach();
        }
    }

    public void lambda$new$0(int i) {
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    public void lambda$new$1(View view) {
        this.selectedMenuItem.toggleSubMenu();
    }

    public void lambda$new$2(View view) {
        this.currentAttachLayout.onMenuItemClick(40);
    }

    public void lambda$new$3(boolean z, View view) {
        if (this.avatarPicker != 0) {
            this.delegate.openAvatarsSearch();
            dismiss();
            return;
        }
        final HashMap hashMap = new HashMap();
        final ArrayList arrayList = new ArrayList();
        PhotoPickerSearchActivity photoPickerSearchActivity = new PhotoPickerSearchActivity(hashMap, arrayList, 0, true, (ChatActivity) this.baseFragment);
        photoPickerSearchActivity.setDelegate(new PhotoPickerActivity.PhotoPickerActivityDelegate() {
            private boolean sendPressed;

            @Override
            public boolean canFinishFragment() {
                return PhotoPickerActivity.PhotoPickerActivityDelegate.CC.$default$canFinishFragment(this);
            }

            @Override
            public void onCaptionChanged(CharSequence charSequence) {
            }

            @Override
            public void onOpenInPressed() {
                PhotoPickerActivity.PhotoPickerActivityDelegate.CC.$default$onOpenInPressed(this);
            }

            @Override
            public void selectedPhotosChanged() {
            }

            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void actionButtonPressed(boolean z2, boolean z3, int i) {
                if (z2 || hashMap.isEmpty() || this.sendPressed) {
                    return;
                }
                this.sendPressed = true;
                ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList2 = new ArrayList<>();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Object obj = hashMap.get(arrayList.get(i2));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    arrayList2.add(sendingMediaInfo);
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str = searchImage.imagePath;
                    if (str != null) {
                        sendingMediaInfo.path = str;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence = searchImage.caption;
                    sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC$BotInlineResult tLRPC$BotInlineResult = searchImage.inlineResult;
                    if (tLRPC$BotInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = tLRPC$BotInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
                ((ChatActivity) ChatAttachAlert.this.baseFragment).didSelectSearchPhotos(arrayList2, z3, i);
            }
        });
        photoPickerSearchActivity.setMaxSelectedPhotos(this.maxSelectedPhotos, this.allowOrder);
        if (z) {
            this.baseFragment.showAsSheet(photoPickerSearchActivity);
        } else {
            this.baseFragment.presentFragment(photoPickerSearchActivity);
        }
        dismiss();
    }

    public void lambda$new$4(Theme.ResourcesProvider resourcesProvider, View view) {
        this.optionsItem.toggleSubMenu();
        PhotoViewer.getInstance().setParentActivity(this.baseFragment, resourcesProvider);
        PhotoViewer.getInstance().setParentAlert(this);
        PhotoViewer.getInstance().setMaxSelectedPhotos(this.maxSelectedPhotos, this.allowOrder);
        if (!this.delegate.needEnterComment()) {
            AndroidUtilities.hideKeyboard(this.baseFragment.getFragmentView().findFocus());
            AndroidUtilities.hideKeyboard(getContainer().findFocus());
        }
        File makeCacheFile = StoryEntry.makeCacheFile(this.currentAccount, "webp");
        android.graphics.Point point = AndroidUtilities.displaySize;
        int i = point.x;
        int i2 = point.y;
        if (i > 1080 || i2 > 1080) {
            float min = Math.min(i, i2) / 1080.0f;
            i = (int) (i * min);
            i2 = (int) (i2 * min);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        try {
            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(makeCacheFile));
        } catch (Throwable th) {
            FileLog.e(th);
        }
        createBitmap.recycle();
        ArrayList<Object> arrayList = new ArrayList<>();
        final MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, makeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
        arrayList.add(photoEntry);
        PhotoViewer photoViewer = PhotoViewer.getInstance();
        PhotoViewer.EmptyPhotoViewerProvider emptyPhotoViewerProvider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public boolean allowCaption() {
                return false;
            }

            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void sendButtonPressed(int i3, VideoEditedInfo videoEditedInfo, boolean z, int i4, boolean z2) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.sent = true;
                if (chatAttachAlert.delegate == null) {
                    return;
                }
                photoEntry.editedInfo = videoEditedInfo;
                ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
                ChatAttachAlertPhotoLayout.selectedPhotos.clear();
                ChatAttachAlertPhotoLayout.selectedPhotosOrder.add(0);
                ChatAttachAlertPhotoLayout.selectedPhotos.put(0, photoEntry);
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                chatAttachAlert2.delegate.didPressedButton(7, true, z, i4, 0L, chatAttachAlert2.isCaptionAbove(), z2);
            }
        };
        BaseFragment baseFragment = this.baseFragment;
        photoViewer.openPhotoForSelect(arrayList, 0, 11, false, emptyPhotoViewerProvider, baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null);
        if (this.isStickerMode) {
            PhotoViewer.getInstance().enableStickerMode(null, true, this.customStickerHandler);
        }
    }

    public void lambda$new$5(View view) {
        this.optionsItem.toggleSubMenu();
    }

    public void lambda$new$6(View view) {
        updatePhotoPreview(this.currentAttachLayout != this.photoPreviewLayout);
    }

    public void lambda$new$12(Theme.ResourcesProvider resourcesProvider, View view, int i) {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment == null) {
            baseFragment = LaunchActivity.getLastFragment();
        }
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (view instanceof AttachButton) {
            Activity parentActivity = baseFragment.getParentActivity();
            int intValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (intValue == 1) {
                if (!this.photosEnabled && !this.videosEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!this.photosEnabled && !this.videosEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(1, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout;
                    showLayout(chatAttachRestrictedLayout);
                }
                showLayout(this.photoLayout);
            } else if (intValue == 3) {
                if (!this.musicEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i2 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                openAudioLayout(true);
            } else if (intValue == 4) {
                if (!this.documentsEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i3 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                openDocumentsLayout(true);
            } else if (intValue == 5) {
                if (!this.plainTextEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && this.plainTextEnabled && getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                openContactsLayout();
            } else if (intValue == 6) {
                if ((!this.plainTextEnabled && checkCanRemoveRestrictionsByBoosts()) || !AndroidUtilities.isMapsInstalled(this.baseFragment)) {
                    return;
                }
                if (!this.plainTextEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout2 = new ChatAttachRestrictedLayout(6, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout2;
                    showLayout(chatAttachRestrictedLayout2);
                } else {
                    if (this.locationLayout == null) {
                        AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), resourcesProvider);
                        this.locationLayout = chatAttachAlertLocationLayout;
                        attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                        chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() {
                            @Override
                            public final void didSelectLocation(TLRPC$MessageMedia tLRPC$MessageMedia, int i4, boolean z, int i5) {
                                ChatAttachAlert.this.lambda$new$7(tLRPC$MessageMedia, i4, z, i5);
                            }
                        });
                    }
                    showLayout(this.locationLayout);
                }
            } else if (intValue == 9) {
                if (!this.pollsEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!this.pollsEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout3 = new ChatAttachRestrictedLayout(9, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout3;
                    showLayout(chatAttachRestrictedLayout3);
                } else {
                    if (this.pollLayout == null) {
                        AttachAlertLayout[] attachAlertLayoutArr2 = this.layouts;
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(this, getContext(), resourcesProvider);
                        this.pollLayout = chatAttachAlertPollLayout;
                        attachAlertLayoutArr2[1] = chatAttachAlertPollLayout;
                        chatAttachAlertPollLayout.setDelegate(new ChatAttachAlertPollLayout.PollCreateActivityDelegate() {
                            @Override
                            public final void sendPoll(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, HashMap hashMap, boolean z, int i4) {
                                ChatAttachAlert.this.lambda$new$8(tLRPC$TL_messageMediaPoll, hashMap, z, i4);
                            }
                        });
                    }
                    showLayout(this.pollLayout);
                }
            } else if (intValue == 11) {
                openQuickRepliesLayout();
            } else if (view.getTag() instanceof Integer) {
                this.delegate.didPressedButton(((Integer) view.getTag()).intValue(), true, true, 0, 0L, isCaptionAbove(), false);
            }
            int left = view.getLeft();
            int right = view.getRight();
            int dp = AndroidUtilities.dp(10.0f);
            int i4 = left - dp;
            if (i4 < 0) {
                this.buttonsRecyclerView.smoothScrollBy(i4, 0);
            } else {
                int i5 = right + dp;
                if (i5 > this.buttonsRecyclerView.getMeasuredWidth()) {
                    RecyclerListView recyclerListView = this.buttonsRecyclerView;
                    recyclerListView.smoothScrollBy(i5 - recyclerListView.getMeasuredWidth(), 0);
                }
            }
        } else if (view instanceof AttachBotButton) {
            final AttachBotButton attachBotButton = (AttachBotButton) view;
            if (attachBotButton.attachMenuBot != null) {
                if (!attachBotButton.attachMenuBot.inactive) {
                    showBotLayout(attachBotButton.attachMenuBot.bot_id, true);
                } else {
                    WebAppDisclaimerAlert.show(getContext(), new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            ChatAttachAlert.this.lambda$new$11(attachBotButton, (Boolean) obj);
                        }
                    }, null);
                }
            } else {
                this.delegate.didSelectBot(attachBotButton.currentUser);
                dismiss();
            }
        }
        if (view.getX() + view.getWidth() >= this.buttonsRecyclerView.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) {
            this.buttonsRecyclerView.smoothScrollBy((int) (view.getWidth() * 1.5f), 0);
        }
    }

    public void lambda$new$7(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
        ((ChatActivity) this.baseFragment).didSelectLocation(tLRPC$MessageMedia, i, z, i2);
    }

    public void lambda$new$8(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, HashMap hashMap, boolean z, int i) {
        ((ChatActivity) this.baseFragment).sendPoll(tLRPC$TL_messageMediaPoll, hashMap, z, i);
    }

    public void lambda$new$11(final AttachBotButton attachBotButton, Boolean bool) {
        TLRPC$TL_messages_toggleBotInAttachMenu tLRPC$TL_messages_toggleBotInAttachMenu = new TLRPC$TL_messages_toggleBotInAttachMenu();
        tLRPC$TL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(attachBotButton.attachMenuBot.bot_id);
        tLRPC$TL_messages_toggleBotInAttachMenu.enabled = true;
        tLRPC$TL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_toggleBotInAttachMenu, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatAttachAlert.this.lambda$new$10(attachBotButton, tLObject, tLRPC$TL_error);
            }
        }, 66);
    }

    public void lambda$new$10(final AttachBotButton attachBotButton, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.this.lambda$new$9(attachBotButton);
            }
        });
    }

    public void lambda$new$9(AttachBotButton attachBotButton) {
        TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot = attachBotButton.attachMenuBot;
        attachBotButton.attachMenuBot.side_menu_disclaimer_needed = false;
        tLRPC$TL_attachMenuBot.inactive = false;
        showBotLayout(attachBotButton.attachMenuBot.bot_id, true);
        MediaDataController.getInstance(this.currentAccount).updateAttachMenuBotsInCache();
    }

    public boolean lambda$new$13(View view, int i) {
        if (view instanceof AttachBotButton) {
            AttachBotButton attachBotButton = (AttachBotButton) view;
            if (!this.destroyed && attachBotButton.currentUser != null) {
                onLongClickBotButton(attachBotButton.attachMenuBot, attachBotButton.currentUser);
                return true;
            }
        }
        return false;
    }

    public void lambda$new$14(View view) {
        ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
        long j = this.selectedId;
        if (j >= 0 || (chatAttachAlertBotWebViewLayout = this.botAttachLayouts.get(-j)) == null) {
            return;
        }
        chatAttachAlertBotWebViewLayout.getWebViewContainer().onMainButtonPressed();
    }

    public class AnonymousClass11 extends FrameLayout {
        private int color;
        private final Paint p;
        final boolean val$forceDarkTheme;

        AnonymousClass11(Context context, boolean z) {
            super(context);
            ChatAttachAlert.this = r1;
            this.val$forceDarkTheme = z;
            this.p = new Paint();
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int themedColor;
            if (ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop != 0.0f && ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop != ChatAttachAlert.this.frameLayout2.getTop() + ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop) {
                if (ChatAttachAlert.this.topBackgroundAnimator != null) {
                    ChatAttachAlert.this.topBackgroundAnimator.cancel();
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.captionEditTextTopOffset = chatAttachAlert.chatActivityEnterViewAnimateFromTop - (ChatAttachAlert.this.frameLayout2.getTop() + ChatAttachAlert.this.captionEditTextTopOffset);
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                chatAttachAlert2.topBackgroundAnimator = ValueAnimator.ofFloat(chatAttachAlert2.captionEditTextTopOffset, 0.0f);
                ChatAttachAlert.this.topBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatAttachAlert.AnonymousClass11.this.lambda$onDraw$0(valueAnimator);
                    }
                });
                ChatAttachAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ChatAttachAlert.this.topBackgroundAnimator.setDuration(200L);
                ChatAttachAlert.this.topBackgroundAnimator.start();
                ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
            }
            float measuredHeight = (ChatAttachAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(84.0f)) * (1.0f - getAlpha());
            View view = ChatAttachAlert.this.shadow;
            float f = (-(ChatAttachAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(84.0f))) + ChatAttachAlert.this.captionEditTextTopOffset;
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
            view.setTranslationY(f + chatAttachAlert3.currentPanTranslationY + chatAttachAlert3.bottomPannelTranslation + measuredHeight + ChatAttachAlert.this.botMainButtonOffsetY);
            if (ChatAttachAlert.this.currentAttachLayout.hasCustomBackground()) {
                themedColor = ChatAttachAlert.this.currentAttachLayout.getCustomBackground();
            } else {
                themedColor = ChatAttachAlert.this.getThemedColor(this.val$forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground);
            }
            if (this.color != themedColor) {
                this.color = themedColor;
                this.p.setColor(themedColor);
            }
            canvas.drawRect(0.0f, ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight(), this.p);
        }

        public void lambda$onDraw$0(ValueAnimator valueAnimator) {
            ChatAttachAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.frameLayout2.invalidate();
            invalidate();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    public class AnonymousClass12 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        AnonymousClass12(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, z, resourcesProvider);
            ChatAttachAlert.this = r8;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ChatAttachAlert.this.enterCommentEventSent) {
                if (motionEvent.getX() > ChatAttachAlert.this.commentTextView.getEditText().getLeft() && motionEvent.getX() < ChatAttachAlert.this.commentTextView.getEditText().getRight() && motionEvent.getY() > ChatAttachAlert.this.commentTextView.getEditText().getTop() && motionEvent.getY() < ChatAttachAlert.this.commentTextView.getEditText().getBottom()) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.makeFocusable(chatAttachAlert.commentTextView.getEditText(), true);
                } else {
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.makeFocusable(chatAttachAlert2.commentTextView.getEditText(), false);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (this.shouldAnimateEditTextWithBounds) {
                final EditTextCaption editText = ChatAttachAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawHeigth - editText.getMeasuredHeight()) + (this.messageEditTextPredrawScrollY - editText.getScrollY())));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatAttachAlert.AnonymousClass12.this.lambda$dispatchDraw$0(editText, valueAnimator);
                    }
                });
                ValueAnimator valueAnimator = this.messageEditTextAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.messageEditTextAnimator = ofFloat;
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ofFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
            }
            super.dispatchDraw(canvas);
        }

        public void lambda$dispatchDraw$0(EditTextCaption editTextCaption, ValueAnimator valueAnimator) {
            editTextCaption.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ChatAttachAlert.this.updateCommentTextViewPosition();
            if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout) {
                ChatAttachAlert.this.photoLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            }
        }

        @Override
        protected void onLineCountChanged(int i, int i2) {
            if (!TextUtils.isEmpty(getEditText().getText())) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            } else {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.chatActivityEnterViewAnimateFromTop = chatAttachAlert.frameLayout2.getTop() + ChatAttachAlert.this.captionEditTextTopOffset;
            ChatAttachAlert.this.frameLayout2.invalidate();
            ChatAttachAlert.this.updateCommentTextViewPosition();
        }

        @Override
        protected void bottomPanelTranslationY(float f) {
            ChatAttachAlert.this.bottomPannelTranslation = f;
            ChatAttachAlert.this.frameLayout2.setTranslationY(f);
            ChatAttachAlert.this.writeButtonContainer.setTranslationY(f);
            ChatAttachAlert.this.frameLayout2.invalidate();
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, true, 0);
        }

        @Override
        protected void closeParent() {
            ChatAttachAlert.super.dismiss();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ChatAttachAlert.this.updateCommentTextViewPosition();
        }

        @Override
        public void extendActionMode(ActionMode actionMode, Menu menu) {
            BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) baseFragment).getCurrentEncryptedChat(), true);
            }
            super.extendActionMode(actionMode, menu);
        }
    }

    public void lambda$new$17(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.currentLimit - this.codepointCount < 0) {
            AndroidUtilities.shakeView(this.captionLimitView);
            try {
                this.captionLimitView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium <= this.codepointCount) {
                return;
            }
            showCaptionLimitBulletin(baseFragment);
            return;
        }
        if (this.editingMessageObject == null) {
            BaseFragment baseFragment2 = this.baseFragment;
            if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.baseFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i) {
                        ChatAttachAlert.this.lambda$new$16(z, i);
                    }
                }, resourcesProvider);
                return;
            }
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(true, 0, 0L, isCaptionAbove());
            return;
        }
        attachAlertLayout.sendSelectedItems(true, 0, 0L, isCaptionAbove());
        this.allowPassConfirmationAlert = true;
        dismiss();
    }

    public void lambda$new$16(boolean z, int i) {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(z, i, 0L, isCaptionAbove());
            return;
        }
        attachAlertLayout.sendSelectedItems(z, i, 0L, isCaptionAbove());
        this.allowPassConfirmationAlert = true;
        dismiss();
    }

    public boolean lambda$new$26(final android.content.Context r33, final org.telegram.ui.ActionBar.Theme.ResourcesProvider r34, final org.telegram.ui.ActionBar.BaseFragment r35, android.view.View r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.lambda$new$26(android.content.Context, org.telegram.ui.ActionBar.Theme$ResourcesProvider, org.telegram.ui.ActionBar.BaseFragment, android.view.View):boolean");
    }

    public void lambda$new$19(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, View view) {
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        final long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        forceKeyboardOnDismiss();
        MessageSendPreview messageSendPreview2 = this.messageSendPreview;
        if (messageSendPreview2 != null) {
            messageSendPreview2.dismiss(true);
            this.messageSendPreview = null;
        }
        if (this.currentLimit - this.codepointCount < 0) {
            AndroidUtilities.shakeView(this.captionLimitView);
            try {
                this.captionLimitView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium <= this.codepointCount) {
                return;
            }
            showCaptionLimitBulletin(baseFragment);
            return;
        }
        if (this.editingMessageObject == null) {
            BaseFragment baseFragment2 = this.baseFragment;
            if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.baseFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i) {
                        ChatAttachAlert.this.lambda$new$18(selectedEffect, z, i);
                    }
                }, resourcesProvider);
                this.captionAbove = false;
            }
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(true, 0, selectedEffect, isCaptionAbove());
        } else {
            attachAlertLayout.sendSelectedItems(true, 0, selectedEffect, isCaptionAbove());
            this.allowPassConfirmationAlert = true;
            dismiss();
        }
        this.captionAbove = false;
    }

    public void lambda$new$18(long j, boolean z, int i) {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(z, i, j, isCaptionAbove());
            return;
        }
        attachAlertLayout.sendSelectedItems(z, i, j, isCaptionAbove());
        this.allowPassConfirmationAlert = true;
        dismiss();
    }

    public void lambda$new$20(MessageObject messageObject, MessagePreviewView.ToggleButton toggleButton, View view) {
        MessagePreviewView.ToggleButton toggleButton2;
        boolean z = !this.captionAbove;
        this.captionAbove = z;
        messageObject.messageOwner.invert_media = z;
        toggleButton.setState(!z, true);
        this.messageSendPreview.changeMessage(messageObject);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null && (toggleButton2 = chatAttachAlertPhotoLayout.captionItem) != null) {
            toggleButton2.setState(!this.captionAbove, true);
        }
        this.messageSendPreview.scrollTo(!this.captionAbove);
    }

    public void lambda$new$22(long j, Theme.ResourcesProvider resourcesProvider) {
        AlertsCreator.createScheduleDatePickerDialog(getContext(), j, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i) {
                ChatAttachAlert.this.lambda$new$21(z, i);
            }
        }, resourcesProvider);
    }

    public void lambda$new$21(boolean z, int i) {
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        MessageSendPreview messageSendPreview2 = this.messageSendPreview;
        if (messageSendPreview2 != null) {
            messageSendPreview2.dismiss(true);
            this.messageSendPreview = null;
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(z, i, selectedEffect, isCaptionAbove());
            return;
        }
        attachAlertLayout.sendSelectedItems(z, i, selectedEffect, isCaptionAbove());
        dismiss();
    }

    public void lambda$new$23() {
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        MessageSendPreview messageSendPreview2 = this.messageSendPreview;
        if (messageSendPreview2 != null) {
            messageSendPreview2.dismiss(true);
            this.messageSendPreview = null;
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(false, 0, selectedEffect, isCaptionAbove());
            return;
        }
        attachAlertLayout.sendSelectedItems(false, 0, selectedEffect, isCaptionAbove());
        dismiss();
    }

    public void lambda$new$25(Context context, final ActionBarMenuSubItem actionBarMenuSubItem, Theme.ResourcesProvider resourcesProvider, View view) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null) {
            return;
        }
        StarsIntroActivity.showMediaPriceSheet(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChatAttachAlert.this.lambda$new$24(actionBarMenuSubItem, (Long) obj, (Runnable) obj2);
            }
        }, resourcesProvider);
    }

    public void lambda$new$24(ActionBarMenuSubItem actionBarMenuSubItem, Long l, Runnable runnable) {
        runnable.run();
        this.photoLayout.setStarsPrice(l.longValue());
        if (l.longValue() > 0) {
            actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
            actionBarMenuSubItem.setSubtext(LocaleController.formatPluralString("Stars", (int) l.longValue(), new Object[0]));
            this.messageSendPreview.setStars(l.longValue());
            return;
        }
        actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaButton));
        actionBarMenuSubItem.setSubtext(null);
        this.messageSendPreview.setStars(0L);
    }

    public boolean hasCaption() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null) {
            return false;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = this.photoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < Math.ceil(selectedPhotos.size() / 10.0f); i++) {
            int i2 = i * 10;
            int min = Math.min(10, selectedPhotos.size() - i2);
            Utilities.random.nextLong();
            for (int i3 = 0; i3 < min; i3++) {
                int i4 = i2 + i3;
                if (i4 < selectedPhotosOrder.size()) {
                    CharSequence charSequence = ((MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i4))).caption;
                    String charSequence2 = charSequence == null ? "" : charSequence.toString();
                    if (this.commentTextView != null && TextUtils.isEmpty(charSequence2) && i3 == 0) {
                        charSequence2 = this.commentTextView.getText().toString();
                    }
                    if (TextUtils.isEmpty(charSequence2)) {
                        continue;
                    } else if (z) {
                        return false;
                    } else {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public boolean isCaptionAbove() {
        AttachAlertLayout attachAlertLayout;
        return this.captionAbove && ((attachAlertLayout = this.currentAttachLayout) == this.photoLayout || attachAlertLayout == this.photoPreviewLayout);
    }

    @Override
    public void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).addOverlayPasscodeView(this.passcodeView);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).removeOverlayPasscodeView(this.passcodeView);
        }
    }

    public void updateCommentTextViewPosition() {
        this.commentTextView.getLocationOnScreen(this.commentTextViewLocation);
        if (this.mentionContainer != null) {
            float f = -this.commentTextView.getHeight();
            if (this.mentionContainer.getY() != f) {
                this.mentionContainer.setTranslationY(f);
                this.mentionContainer.invalidate();
            }
        }
    }

    public int getCommentTextViewTop() {
        return this.commentTextViewLocation[1];
    }

    private void showCaptionLimitBulletin(final BaseFragment baseFragment) {
        if ((baseFragment instanceof ChatActivity) && ChatObject.isChannelAndNotMegaGroup(((ChatActivity) baseFragment).getCurrentChat())) {
            BulletinFactory.of(this.sizeNotifierFrameLayout, this.resourcesProvider).createCaptionLimitBulletin(MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium, new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.this.lambda$showCaptionLimitBulletin$27(baseFragment);
                }
            }).show();
        }
    }

    public void lambda$showCaptionLimitBulletin$27(BaseFragment baseFragment) {
        dismiss(true);
        if (baseFragment != null) {
            baseFragment.presentFragment(new PremiumPreviewFragment("caption_limit"));
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.baseFragment != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), this.baseFragment.isLightStatusBar());
        }
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground)) > 0.699999988079071d;
    }

    public void onLongClickBotButton(final TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot, final TLRPC$User tLRPC$User) {
        String userName = tLRPC$TL_attachMenuBot != null ? tLRPC$TL_attachMenuBot.short_name : UserObject.getUserName(tLRPC$User);
        Iterator<TLRPC$TL_attachMenuBot> it = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots.iterator();
        while (it.hasNext() && it.next().bot_id != tLRPC$User.id) {
        }
        String formatString = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog.Builder title = new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.BotRemoveFromMenuTitle));
        if (tLRPC$TL_attachMenuBot == null) {
            formatString = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        title.setMessage(AndroidUtilities.replaceTags(formatString)).setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatAttachAlert.this.lambda$onLongClickBotButton$30(tLRPC$TL_attachMenuBot, tLRPC$User, dialogInterface, i);
            }
        }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).show();
    }

    public void lambda$onLongClickBotButton$30(final TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot, TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
        if (tLRPC$TL_attachMenuBot != null) {
            TLRPC$TL_messages_toggleBotInAttachMenu tLRPC$TL_messages_toggleBotInAttachMenu = new TLRPC$TL_messages_toggleBotInAttachMenu();
            tLRPC$TL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tLRPC$User);
            tLRPC$TL_messages_toggleBotInAttachMenu.enabled = false;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_toggleBotInAttachMenu, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatAttachAlert.this.lambda$onLongClickBotButton$29(tLRPC$TL_attachMenuBot, tLObject, tLRPC$TL_error);
                }
            }, 66);
            return;
        }
        MediaDataController.getInstance(this.currentAccount).removeInline(tLRPC$User.id);
    }

    public void lambda$onLongClickBotButton$29(final TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.this.lambda$onLongClickBotButton$28(tLRPC$TL_attachMenuBot);
            }
        });
    }

    public void lambda$onLongClickBotButton$28(TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
        MediaDataController.getInstance(this.currentAccount).loadAttachMenuBots(false, true);
        if (this.currentAttachLayout == this.botAttachLayouts.get(tLRPC$TL_attachMenuBot.bot_id)) {
            showLayout(this.photoLayout);
        }
    }

    @Override
    protected boolean shouldOverlayCameraViewOverNavBar() {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        return attachAlertLayout == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.cameraExpanded;
    }

    @Override
    public void show() {
        super.show();
        this.buttonPressed = false;
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            this.calcMandatoryInsets = ((ChatActivity) baseFragment).isKeyboardVisible();
        }
        this.openTransitionFinished = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), 0);
            AndroidUtilities.setNavigationBarColor(getWindow(), this.navBarColor, false);
            AndroidUtilities.setLightNavigationBar(getWindow(), ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
    }

    public void setEditingMessageObject(MessageObject messageObject) {
        if (this.editingMessageObject == messageObject) {
            return;
        }
        this.editingMessageObject = messageObject;
        if (messageObject != null) {
            this.maxSelectedPhotos = 1;
            this.allowOrder = false;
        } else {
            this.maxSelectedPhotos = -1;
            this.allowOrder = true;
        }
        this.buttonsAdapter.notifyDataSetChanged();
    }

    public MessageObject getEditingMessageObject() {
        return this.editingMessageObject;
    }

    public void applyCaption() {
        if (this.commentTextView.length() <= 0) {
            return;
        }
        this.currentAttachLayout.applyCaption(this.commentTextView.getText());
    }

    private void sendPressed(boolean z, int i, long j, boolean z2) {
        if (this.buttonPressed) {
            return;
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            TLRPC$Chat currentChat = chatActivity.getCurrentChat();
            if (chatActivity.getCurrentUser() != null || ((ChatObject.isChannel(currentChat) && currentChat.megagroup) || !ChatObject.isChannel(currentChat))) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                edit.putBoolean("silent_" + chatActivity.getDialogId(), !z).commit();
            }
        }
        if (checkCaption(this.commentTextView.getText())) {
            return;
        }
        applyCaption();
        this.buttonPressed = true;
        this.delegate.didPressedButton(7, true, z, i, j, z2, false);
    }

    public void showLayout(AttachAlertLayout attachAlertLayout) {
        long j = this.selectedId;
        ChatAttachRestrictedLayout chatAttachRestrictedLayout = this.restrictedLayout;
        if (attachAlertLayout == chatAttachRestrictedLayout) {
            j = chatAttachRestrictedLayout.id;
        } else if (attachAlertLayout == this.photoLayout) {
            j = 1;
        } else if (attachAlertLayout == this.audioLayout) {
            j = 3;
        } else if (attachAlertLayout == this.documentLayout) {
            j = 4;
        } else if (attachAlertLayout == this.contactsLayout) {
            j = 5;
        } else if (attachAlertLayout == this.locationLayout) {
            j = 6;
        } else if (attachAlertLayout == this.pollLayout) {
            j = 9;
        } else if (attachAlertLayout == this.colorsLayout) {
            j = 10;
        } else if (attachAlertLayout == this.quickRepliesLayout) {
            j = 11;
        }
        showLayout(attachAlertLayout, j);
    }

    private void showLayout(AttachAlertLayout attachAlertLayout, long j) {
        showLayout(attachAlertLayout, j, true);
    }

    private void showLayout(final AttachAlertLayout attachAlertLayout, long j, boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        CameraView cameraView;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        CameraView cameraView2;
        if (this.viewChangeAnimator == null && this.commentsAnimator == null) {
            AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
            if (attachAlertLayout2 == attachAlertLayout) {
                attachAlertLayout2.scrollToTop();
                return;
            }
            this.botButtonWasVisible = false;
            this.botButtonProgressWasVisible = false;
            this.botMainButtonOffsetY = 0.0f;
            this.botMainButtonTextView.setVisibility(8);
            this.botProgressView.setAlpha(0.0f);
            this.botProgressView.setScaleX(0.1f);
            this.botProgressView.setScaleY(0.1f);
            this.botProgressView.setVisibility(8);
            this.buttonsRecyclerView.setAlpha(1.0f);
            this.buttonsRecyclerView.setTranslationY(this.botMainButtonOffsetY);
            for (int i = 0; i < this.botAttachLayouts.size(); i++) {
                this.botAttachLayouts.valueAt(i).setMeasureOffsetY(0);
            }
            this.selectedId = j;
            int childCount = this.buttonsRecyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.buttonsRecyclerView.getChildAt(i2);
                if (childAt instanceof AttachButton) {
                    ((AttachButton) childAt).updateCheckedState(true);
                } else if (childAt instanceof AttachBotButton) {
                    ((AttachBotButton) childAt).updateCheckedState(true);
                }
            }
            int firstOffset = (this.currentAttachLayout.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.scrollOffsetY[0];
            this.nextAttachLayout = attachAlertLayout;
            if (Build.VERSION.SDK_INT >= 20) {
                this.container.setLayerType(2, null);
            }
            this.actionBar.setVisibility(this.nextAttachLayout.needsActionBar() != 0 ? 0 : 4);
            this.actionBarShadow.setVisibility(this.actionBar.getVisibility());
            if (this.actionBar.isSearchFieldVisible()) {
                this.actionBar.closeSearchField();
            }
            this.currentAttachLayout.onHide();
            AttachAlertLayout attachAlertLayout3 = this.nextAttachLayout;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = this.photoLayout;
            if (attachAlertLayout3 == chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            this.nextAttachLayout.onShow(this.currentAttachLayout);
            this.nextAttachLayout.setVisibility(0);
            if (attachAlertLayout.getParent() != null) {
                this.containerView.removeView(this.nextAttachLayout);
            }
            int indexOfChild = this.containerView.indexOfChild(this.currentAttachLayout);
            ViewParent parent = this.nextAttachLayout.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                AttachAlertLayout attachAlertLayout4 = this.nextAttachLayout;
                if (attachAlertLayout4 != this.locationLayout) {
                    indexOfChild++;
                }
                viewGroup.addView(attachAlertLayout4, indexOfChild, LayoutHelper.createFrame(-1, -1.0f));
            }
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.this.lambda$showLayout$31();
                }
            };
            AttachAlertLayout attachAlertLayout5 = this.currentAttachLayout;
            if (!(attachAlertLayout5 instanceof ChatAttachAlertPhotoLayoutPreview) && !(this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.nextAttachLayout.setAlpha(0.0f);
                    this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f));
                    AttachAlertLayout attachAlertLayout6 = this.currentAttachLayout;
                    Property property = View.TRANSLATION_Y;
                    float[] fArr = {AndroidUtilities.dp(78.0f) + firstOffset};
                    ActionBar actionBar = this.actionBar;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(attachAlertLayout6, property, fArr), ObjectAnimator.ofFloat(this.currentAttachLayout, this.ATTACH_ALERT_LAYOUT_TRANSLATION, 0.0f, 1.0f), ObjectAnimator.ofFloat(actionBar, View.ALPHA, actionBar.getAlpha(), 0.0f));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    animatorSet.addListener(new AnonymousClass17(firstOffset, runnable));
                    this.viewChangeAnimator = animatorSet;
                    this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(0.0f));
                    animatorSet.start();
                    return;
                }
                attachAlertLayout5.setAlpha(0.0f);
                runnable.run();
                updateSelectedPosition(0);
                this.containerView.invalidate();
                return;
            }
            int max = Math.max(this.nextAttachLayout.getWidth(), this.currentAttachLayout.getWidth());
            AttachAlertLayout attachAlertLayout7 = this.nextAttachLayout;
            if (attachAlertLayout7 instanceof ChatAttachAlertPhotoLayoutPreview) {
                attachAlertLayout7.setTranslationX(max);
                AttachAlertLayout attachAlertLayout8 = this.currentAttachLayout;
                if ((attachAlertLayout8 instanceof ChatAttachAlertPhotoLayout) && (cameraView2 = (chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) attachAlertLayout8).cameraView) != null) {
                    cameraView2.setVisibility(4);
                    chatAttachAlertPhotoLayout2.cameraIcon.setVisibility(4);
                    chatAttachAlertPhotoLayout2.cameraCell.setVisibility(0);
                }
            } else {
                this.currentAttachLayout.setTranslationX(-max);
                AttachAlertLayout attachAlertLayout9 = this.nextAttachLayout;
                if (attachAlertLayout9 == this.photoLayout && (cameraView = (chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) attachAlertLayout9).cameraView) != null) {
                    cameraView.setVisibility(0);
                    chatAttachAlertPhotoLayout.cameraIcon.setVisibility(0);
                }
            }
            this.nextAttachLayout.setAlpha(1.0f);
            this.currentAttachLayout.setAlpha(1.0f);
            if (z) {
                this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(0.0f));
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlert.this.lambda$showLayout$34(attachAlertLayout, runnable);
                    }
                });
                return;
            }
            boolean z2 = this.nextAttachLayout.getCurrentItemTop() <= attachAlertLayout.getButtonsHideOffset();
            this.currentAttachLayout.onHideShowProgress(1.0f);
            this.nextAttachLayout.onHideShowProgress(1.0f);
            this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
            this.nextAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
            this.containerView.invalidate();
            this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(1.0f));
            this.actionBar.setTag(z2 ? 1 : null);
            runnable.run();
        }
    }

    public void lambda$showLayout$31() {
        AttachAlertLayout attachAlertLayout;
        ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview;
        if (Build.VERSION.SDK_INT >= 20) {
            this.container.setLayerType(0, null);
        }
        this.viewChangeAnimator = null;
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        if (attachAlertLayout2 != this.photoLayout && (attachAlertLayout = this.nextAttachLayout) != (chatAttachAlertPhotoLayoutPreview = this.photoPreviewLayout) && attachAlertLayout2 != attachAlertLayout && attachAlertLayout2 != chatAttachAlertPhotoLayoutPreview) {
            this.containerView.removeView(attachAlertLayout2);
        }
        this.currentAttachLayout.setVisibility(8);
        this.currentAttachLayout.onHidden();
        this.nextAttachLayout.onShown();
        this.currentAttachLayout = this.nextAttachLayout;
        this.nextAttachLayout = null;
        int[] iArr = this.scrollOffsetY;
        iArr[0] = iArr[1];
    }

    public class AnonymousClass17 extends AnimatorListenerAdapter {
        final Runnable val$onEnd;
        final int val$t;

        AnonymousClass17(int i, Runnable runnable) {
            ChatAttachAlert.this = r1;
            this.val$t = i;
            this.val$onEnd = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ChatAttachAlert.this.currentAttachLayout.setAlpha(0.0f);
            ChatAttachAlert.this.currentAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) + this.val$t);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.ATTACH_ALERT_LAYOUT_TRANSLATION.set(chatAttachAlert.currentAttachLayout, Float.valueOf(1.0f));
            ChatAttachAlert.this.actionBar.setAlpha(0.0f);
            SpringAnimation springAnimation = new SpringAnimation(ChatAttachAlert.this.nextAttachLayout, DynamicAnimation.TRANSLATION_Y, 0.0f);
            springAnimation.getSpring().setDampingRatio(0.75f);
            springAnimation.getSpring().setStiffness(500.0f);
            springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    ChatAttachAlert.AnonymousClass17.this.lambda$onAnimationEnd$0(dynamicAnimation, f, f2);
                }
            });
            final Runnable runnable = this.val$onEnd;
            springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    ChatAttachAlert.AnonymousClass17.this.lambda$onAnimationEnd$1(runnable, dynamicAnimation, z, f, f2);
                }
            });
            ChatAttachAlert.this.viewChangeAnimator = springAnimation;
            springAnimation.start();
        }

        public void lambda$onAnimationEnd$0(androidx.dynamicanimation.animation.DynamicAnimation r1, float r2, float r3) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.AnonymousClass17.lambda$onAnimationEnd$0(androidx.dynamicanimation.animation.DynamicAnimation, float, float):void");
        }

        public void lambda$onAnimationEnd$1(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            ChatAttachAlert.this.nextAttachLayout.setTranslationY(0.0f);
            ChatAttachAlert.this.nextAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            runnable.run();
            ChatAttachAlert.this.updateSelectedPosition(0);
        }
    }

    public void lambda$showLayout$34(AttachAlertLayout attachAlertLayout, final Runnable runnable) {
        final boolean z = this.nextAttachLayout.getCurrentItemTop() <= attachAlertLayout.getButtonsHideOffset();
        final float alpha = this.actionBar.getAlpha();
        final float f = z ? 1.0f : 0.0f;
        SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.0f));
        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                ChatAttachAlert.this.lambda$showLayout$32(alpha, f, z, dynamicAnimation, f2, f3);
            }
        });
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3) {
                ChatAttachAlert.this.lambda$showLayout$33(z, runnable, dynamicAnimation, z2, f2, f3);
            }
        });
        springAnimation.setSpring(new SpringForce(500.0f));
        springAnimation.getSpring().setDampingRatio(1.0f);
        springAnimation.getSpring().setStiffness(1000.0f);
        springAnimation.start();
        this.viewChangeAnimator = springAnimation;
    }

    public void lambda$showLayout$32(float f, float f2, boolean z, DynamicAnimation dynamicAnimation, float f3, float f4) {
        float f5 = f3 / 500.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(f5));
        this.actionBar.setAlpha(AndroidUtilities.lerp(f, f2, f5));
        updateLayout(this.currentAttachLayout, false, 0);
        updateLayout(this.nextAttachLayout, false, 0);
        if (!(this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || z) {
            f5 = 1.0f - f5;
        }
        float clamp = Utilities.clamp(f5, 1.0f, 0.0f);
        this.mediaPreviewView.setAlpha(clamp);
        float f6 = 1.0f - clamp;
        this.selectedView.setAlpha(f6);
        this.selectedView.setTranslationX(clamp * (-AndroidUtilities.dp(16.0f)));
        this.mediaPreviewView.setTranslationX(f6 * AndroidUtilities.dp(16.0f));
    }

    public void lambda$showLayout$33(boolean z, Runnable runnable, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        this.currentAttachLayout.onHideShowProgress(1.0f);
        this.nextAttachLayout.onHideShowProgress(1.0f);
        this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.nextAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.containerView.invalidate();
        this.actionBar.setTag(z ? 1 : null);
        runnable.run();
    }

    public AttachAlertLayout getCurrentAttachLayout() {
        return this.currentAttachLayout;
    }

    public ChatAttachAlertPhotoLayoutPreview getPhotoPreviewLayout() {
        return this.photoPreviewLayout;
    }

    public void updatePhotoPreview(boolean z) {
        if (z) {
            if (this.canOpenPreview) {
                if (this.photoPreviewLayout == null) {
                    Context context = getContext();
                    Theme.ResourcesProvider resourcesProvider = this.parentThemeDelegate;
                    if (resourcesProvider == null) {
                        resourcesProvider = this.resourcesProvider;
                    }
                    ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = new ChatAttachAlertPhotoLayoutPreview(this, context, resourcesProvider);
                    this.photoPreviewLayout = chatAttachAlertPhotoLayoutPreview;
                    chatAttachAlertPhotoLayoutPreview.bringToFront();
                }
                AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
                AttachAlertLayout attachAlertLayout2 = this.photoPreviewLayout;
                if (attachAlertLayout == attachAlertLayout2) {
                    attachAlertLayout2 = this.photoLayout;
                }
                showLayout(attachAlertLayout2);
                return;
            }
            return;
        }
        showLayout(this.photoLayout);
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout;
        if (i == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            openContactsLayout();
        } else if (i == 30 && (chatAttachAlertLocationLayout = this.locationLayout) != null && this.currentAttachLayout == chatAttachAlertLocationLayout && isShowing()) {
            this.locationLayout.openShareLiveLocation();
        }
    }

    private void openContactsLayout() {
        if (!this.plainTextEnabled) {
            ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(5, this, getContext(), this.resourcesProvider);
            this.restrictedLayout = chatAttachRestrictedLayout;
            showLayout(chatAttachRestrictedLayout);
        }
        if (this.contactsLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = new ChatAttachAlertContactsLayout(this, getContext(), this.resourcesProvider);
            this.contactsLayout = chatAttachAlertContactsLayout;
            attachAlertLayoutArr[2] = chatAttachAlertContactsLayout;
            chatAttachAlertContactsLayout.setDelegate(new ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate() {
                {
                    ChatAttachAlert.this = this;
                }

                @Override
                public void didSelectContact(TLRPC$User tLRPC$User, boolean z, int i, long j, boolean z2) {
                    ((ChatActivity) ChatAttachAlert.this.baseFragment).sendContact(tLRPC$User, z, i, j, z2);
                }

                @Override
                public void didSelectContacts(ArrayList<TLRPC$User> arrayList, String str, boolean z, int i, long j, boolean z2) {
                    ((ChatActivity) ChatAttachAlert.this.baseFragment).sendContacts(arrayList, str, z, i, j, z2);
                }
            });
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            TLRPC$Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
            this.contactsLayout.setMultipleSelectionAllowed(currentChat == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled);
        }
        showLayout(this.contactsLayout);
    }

    private void openQuickRepliesLayout() {
        if (this.quickRepliesLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout = new ChatAttachAlertQuickRepliesLayout(this, getContext(), this.resourcesProvider);
            this.quickRepliesLayout = chatAttachAlertQuickRepliesLayout;
            attachAlertLayoutArr[7] = chatAttachAlertQuickRepliesLayout;
        }
        showLayout(this.quickRepliesLayout);
    }

    public boolean checkCanRemoveRestrictionsByBoosts() {
        BaseFragment baseFragment = this.baseFragment;
        return (baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).checkCanRemoveRestrictionsByBoosts();
    }

    public void openAudioLayout(boolean z) {
        if (!this.musicEnabled && z) {
            ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(3, this, getContext(), this.resourcesProvider);
            this.restrictedLayout = chatAttachRestrictedLayout;
            showLayout(chatAttachRestrictedLayout);
        }
        if (this.audioLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = new ChatAttachAlertAudioLayout(this, getContext(), this.resourcesProvider);
            this.audioLayout = chatAttachAlertAudioLayout;
            attachAlertLayoutArr[3] = chatAttachAlertAudioLayout;
            chatAttachAlertAudioLayout.setDelegate(new ChatAttachAlertAudioLayout.AudioSelectDelegate() {
                @Override
                public final void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i, long j, boolean z3) {
                    ChatAttachAlert.this.lambda$openAudioLayout$35(arrayList, charSequence, z2, i, j, z3);
                }
            });
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            TLRPC$Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
            this.audioLayout.setMaxSelectedFiles(((currentChat == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled) && this.editingMessageObject == null) ? -1 : 1);
        }
        if (z) {
            showLayout(this.audioLayout);
        }
    }

    public void lambda$openAudioLayout$35(ArrayList arrayList, CharSequence charSequence, boolean z, int i, long j, boolean z2) {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null && (baseFragment instanceof ChatActivity)) {
            ((ChatActivity) baseFragment).sendAudio(arrayList, charSequence, z, i, j, z2);
            return;
        }
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.sendAudio(arrayList, charSequence, z, i, j, z2);
        }
    }

    public void openColorsLayout() {
        if (this.colorsLayout == null) {
            ChatAttachAlertColorsLayout chatAttachAlertColorsLayout = new ChatAttachAlertColorsLayout(this, getContext(), this.resourcesProvider);
            this.colorsLayout = chatAttachAlertColorsLayout;
            chatAttachAlertColorsLayout.setDelegate(new androidx.core.util.Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChatAttachAlert.this.lambda$openColorsLayout$36(obj);
                }
            });
        }
        showLayout(this.colorsLayout);
    }

    public void lambda$openColorsLayout$36(Object obj) {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.onWallpaperSelected(obj);
        }
    }

    private void openDocumentsLayout(boolean z) {
        if (!this.documentsEnabled && z) {
            ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(4, this, getContext(), this.resourcesProvider);
            this.restrictedLayout = chatAttachRestrictedLayout;
            showLayout(chatAttachRestrictedLayout);
        }
        boolean z2 = false;
        if (this.documentLayout == null) {
            int i = this.isSoundPicker ? 2 : 0;
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = new ChatAttachAlertDocumentLayout(this, getContext(), i, this.resourcesProvider);
            this.documentLayout = chatAttachAlertDocumentLayout;
            attachAlertLayoutArr[4] = chatAttachAlertDocumentLayout;
            chatAttachAlertDocumentLayout.setDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
                {
                    ChatAttachAlert.this = this;
                }

                @Override
                public void didSelectFiles(ArrayList<String> arrayList, String str, ArrayList<MessageObject> arrayList2, boolean z3, int i2, long j, boolean z4) {
                    if (ChatAttachAlert.this.documentsDelegate != null) {
                        ChatAttachAlert.this.documentsDelegate.didSelectFiles(arrayList, str, arrayList2, z3, i2, j, z4);
                        return;
                    }
                    BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                    if (baseFragment instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) baseFragment).didSelectFiles(arrayList, str, arrayList2, z3, i2, j, z4);
                    } else if (baseFragment instanceof PassportActivity) {
                        ((PassportActivity) baseFragment).didSelectFiles(arrayList, str, z3, i2, j, z4);
                    }
                }

                @Override
                public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z3, int i2) {
                    if (ChatAttachAlert.this.documentsDelegate != null) {
                        ChatAttachAlert.this.documentsDelegate.didSelectPhotos(arrayList, z3, i2);
                        return;
                    }
                    BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                    if (baseFragment instanceof ChatActivity) {
                        ((ChatActivity) baseFragment).didSelectPhotos(arrayList, z3, i2);
                    } else if (baseFragment instanceof PassportActivity) {
                        ((PassportActivity) baseFragment).didSelectPhotos(arrayList, z3, i2);
                    }
                }

                @Override
                public void startDocumentSelectActivity() {
                    if (ChatAttachAlert.this.documentsDelegate != null) {
                        ChatAttachAlert.this.documentsDelegate.startDocumentSelectActivity();
                        return;
                    }
                    BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                    if (baseFragment instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) baseFragment).startDocumentSelectActivity();
                    } else if (baseFragment instanceof PassportActivity) {
                        ((PassportActivity) baseFragment).startDocumentSelectActivity();
                    }
                }

                @Override
                public void startMusicSelectActivity() {
                    ChatAttachAlert.this.openAudioLayout(true);
                }
            });
        }
        BaseFragment baseFragment = this.baseFragment;
        int i2 = 1;
        if (baseFragment instanceof ChatActivity) {
            TLRPC$Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout2 = this.documentLayout;
            if ((currentChat == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled) && this.editingMessageObject == null) {
                i2 = -1;
            }
            chatAttachAlertDocumentLayout2.setMaxSelectedFiles(i2);
        } else {
            this.documentLayout.setMaxSelectedFiles(this.maxSelectedPhotos);
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout3 = this.documentLayout;
            if (!this.isSoundPicker && !this.allowEnterCaption) {
                z2 = true;
            }
            chatAttachAlertDocumentLayout3.setCanSelectOnlyImageFiles(z2);
        }
        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout4 = this.documentLayout;
        chatAttachAlertDocumentLayout4.isSoundPicker = this.isSoundPicker;
        if (z) {
            showLayout(chatAttachAlertDocumentLayout4);
        }
    }

    private boolean showCommentTextView(final boolean z, boolean z2) {
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.commentsAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (this.commentTextView.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
        }
        this.commentTextView.hidePopup(true);
        if (z) {
            if (!this.isSoundPicker) {
                this.frameLayout2.setVisibility(0);
            }
            this.writeButtonContainer.setVisibility(0);
            if (!this.typeButtonsAvailable && !this.isSoundPicker) {
                this.shadow.setVisibility(0);
            }
        } else if (this.typeButtonsAvailable) {
            this.buttonsRecyclerView.setVisibility(0);
        }
        if (z2) {
            this.commentsAnimator = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            FrameLayout frameLayout = this.frameLayout2;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, fArr));
            FrameLayout frameLayout2 = this.writeButtonContainer;
            Property property2 = View.SCALE_X;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 1.0f : 0.2f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property2, fArr2));
            FrameLayout frameLayout3 = this.writeButtonContainer;
            Property property3 = View.SCALE_Y;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 1.0f : 0.2f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property3, fArr3));
            FrameLayout frameLayout4 = this.writeButtonContainer;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout4, property4, fArr4));
            ChatActivityEnterView.SendButton sendButton = this.writeButton;
            Property property5 = View.SCALE_X;
            float[] fArr5 = new float[1];
            fArr5[0] = z ? 1.0f : 0.2f;
            arrayList.add(ObjectAnimator.ofFloat(sendButton, property5, fArr5));
            ChatActivityEnterView.SendButton sendButton2 = this.writeButton;
            Property property6 = View.SCALE_Y;
            float[] fArr6 = new float[1];
            fArr6[0] = z ? 1.0f : 0.2f;
            arrayList.add(ObjectAnimator.ofFloat(sendButton2, property6, fArr6));
            ChatActivityEnterView.SendButton sendButton3 = this.writeButton;
            Property property7 = View.ALPHA;
            float[] fArr7 = new float[1];
            fArr7[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(sendButton3, property7, fArr7));
            if (this.actionBar.getTag() != null) {
                FrameLayout frameLayout5 = this.frameLayout2;
                Property property8 = View.TRANSLATION_Y;
                float[] fArr8 = new float[1];
                fArr8[0] = z ? 0.0f : AndroidUtilities.dp(48.0f);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout5, property8, fArr8));
                View view = this.shadow;
                Property property9 = View.TRANSLATION_Y;
                float[] fArr9 = new float[1];
                fArr9[0] = z ? AndroidUtilities.dp(36.0f) : AndroidUtilities.dp(84.0f);
                arrayList.add(ObjectAnimator.ofFloat(view, property9, fArr9));
                View view2 = this.shadow;
                Property property10 = View.ALPHA;
                float[] fArr10 = new float[1];
                fArr10[0] = z ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(view2, property10, fArr10));
            } else if (this.typeButtonsAvailable) {
                RecyclerListView recyclerListView = this.buttonsRecyclerView;
                Property property11 = View.TRANSLATION_Y;
                float[] fArr11 = new float[1];
                fArr11[0] = z ? AndroidUtilities.dp(36.0f) : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(recyclerListView, property11, fArr11));
                View view3 = this.shadow;
                Property property12 = View.TRANSLATION_Y;
                float[] fArr12 = new float[1];
                fArr12[0] = z ? AndroidUtilities.dp(36.0f) : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(view3, property12, fArr12));
            } else if (!this.isSoundPicker) {
                this.shadow.setTranslationY(AndroidUtilities.dp(36.0f) + this.botMainButtonOffsetY);
                View view4 = this.shadow;
                Property property13 = View.ALPHA;
                float[] fArr13 = new float[1];
                fArr13[0] = z ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(view4, property13, fArr13));
            }
            this.commentsAnimator.playTogether(arrayList);
            this.commentsAnimator.setInterpolator(new DecelerateInterpolator());
            this.commentsAnimator.setDuration(180L);
            this.commentsAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    ChatAttachAlert.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        if (!z) {
                            if (!ChatAttachAlert.this.isSoundPicker) {
                                ChatAttachAlert.this.frameLayout2.setVisibility(4);
                            }
                            ChatAttachAlert.this.writeButtonContainer.setVisibility(4);
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (!chatAttachAlert.typeButtonsAvailable && !chatAttachAlert.isSoundPicker) {
                                ChatAttachAlert.this.shadow.setVisibility(4);
                            }
                        } else {
                            ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                            if (chatAttachAlert2.typeButtonsAvailable && (chatAttachAlert2.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons())) {
                                ChatAttachAlert.this.buttonsRecyclerView.setVisibility(4);
                            }
                        }
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }
            });
            this.commentsAnimator.start();
        } else {
            this.frameLayout2.setAlpha(z ? 1.0f : 0.0f);
            this.writeButtonContainer.setScaleX(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setScaleY(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setAlpha(z ? 1.0f : 0.0f);
            this.writeButton.setScaleX(z ? 1.0f : 0.2f);
            this.writeButton.setScaleY(z ? 1.0f : 0.2f);
            this.writeButton.setAlpha(z ? 1.0f : 0.0f);
            if (this.actionBar.getTag() != null) {
                this.frameLayout2.setTranslationY(z ? 0.0f : AndroidUtilities.dp(48.0f));
                this.shadow.setTranslationY((z ? AndroidUtilities.dp(36.0f) : AndroidUtilities.dp(84.0f)) + this.botMainButtonOffsetY);
                this.shadow.setAlpha(z ? 1.0f : 0.0f);
            } else if (this.typeButtonsAvailable) {
                AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
                if (attachAlertLayout == null || attachAlertLayout.shouldHideBottomButtons()) {
                    this.buttonsRecyclerView.setTranslationY(z ? AndroidUtilities.dp(36.0f) : 0.0f);
                }
                this.shadow.setTranslationY((z ? AndroidUtilities.dp(36.0f) : 0) + this.botMainButtonOffsetY);
            } else {
                this.shadow.setTranslationY(AndroidUtilities.dp(36.0f) + this.botMainButtonOffsetY);
                this.shadow.setAlpha(z ? 1.0f : 0.0f);
            }
            if (!z) {
                this.frameLayout2.setVisibility(4);
                this.writeButtonContainer.setVisibility(4);
                if (!this.typeButtonsAvailable) {
                    this.shadow.setVisibility(4);
                }
            }
        }
        this.writeButton.setCount(z ? Math.max(1, this.currentAttachLayout.getSelectedItemsCount()) : 0, z2);
        return true;
    }

    @Override
    protected void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            SpringAnimation springAnimation = this.appearSpringAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            AnimatorSet animatorSet2 = this.buttonsAnimation;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    @Override
    public boolean onCustomOpenAnimation() {
        this.photoLayout.setTranslationX(0.0f);
        this.mediaPreviewView.setAlpha(0.0f);
        this.selectedView.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.buttonsAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.ATTACH_ALERT_PROGRESS, 0.0f, 400.0f));
        this.buttonsAnimation.setDuration(400L);
        this.buttonsAnimation.setStartDelay(20L);
        this.ATTACH_ALERT_PROGRESS.set(this, Float.valueOf(0.0f));
        this.buttonsAnimation.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$37(valueAnimator2);
            }
        });
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        springAnimation2.getSpring().setDampingRatio(0.75f);
        this.appearSpringAnimation.getSpring().setStiffness(350.0f);
        this.appearSpringAnimation.start();
        if (Build.VERSION.SDK_INT >= 20 && this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        Animator[] animatorArr = new Animator[1];
        ColorDrawable colorDrawable = this.backDrawable;
        Property<ColorDrawable, Integer> property = AnimationProperties.COLOR_DRAWABLE_ALPHA;
        int[] iArr = new int[1];
        iArr[0] = this.dimBehind ? this.dimBehindAlpha : 0;
        animatorArr[0] = ObjectAnimator.ofInt(colorDrawable, property, iArr);
        animatorSet2.playTogether(animatorArr);
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        final BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface = super.delegate;
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$38(animationNotificationsLocker, bottomSheetDelegateInterface);
            }
        };
        this.appearSpringAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$39(runnable, dynamicAnimation, z, f, f2);
            }
        });
        this.currentSheetAnimation.addListener(new AnimatorListenerAdapter() {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimation == null || !((BottomSheet) ChatAttachAlert.this).currentSheetAnimation.equals(animator) || ChatAttachAlert.this.appearSpringAnimation == null || ChatAttachAlert.this.appearSpringAnimation.isRunning()) {
                    return;
                }
                runnable.run();
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimation == null || !((BottomSheet) ChatAttachAlert.this).currentSheetAnimation.equals(animator)) {
                    return;
                }
                ((BottomSheet) ChatAttachAlert.this).currentSheetAnimation = null;
                ((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType = 0;
            }
        });
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        setNavBarAlpha(0.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$40(valueAnimator2);
            }
        });
        ofFloat2.setStartDelay(25L);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(CubicBezierInterpolator.DEFAULT);
        ofFloat2.start();
        return true;
    }

    public void lambda$onCustomOpenAnimation$37(ValueAnimator valueAnimator) {
        this.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BottomSheet.ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public void lambda$onCustomOpenAnimation$38(AnimationNotificationsLocker animationNotificationsLocker, BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface) {
        this.currentSheetAnimation = null;
        this.appearSpringAnimation = null;
        animationNotificationsLocker.unlock();
        this.currentSheetAnimationType = 0;
        if (bottomSheetDelegateInterface != null) {
            bottomSheetDelegateInterface.onOpenAnimationEnd();
        }
        if (this.useHardwareLayer) {
            this.container.setLayerType(0, null);
        }
        if (this.isFullscreen) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags &= -1025;
            getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public void lambda$onCustomOpenAnimation$39(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        runnable.run();
    }

    public void lambda$onCustomOpenAnimation$40(ValueAnimator valueAnimator) {
        setNavBarAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setNavBarAlpha(float f) {
        this.navBarColor = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), Math.min(255, Math.max(0, (int) (f * 255.0f))));
        AndroidUtilities.setNavigationBarColor(getWindow(), this.navBarColor, false);
        AndroidUtilities.setLightNavigationBar(getWindow(), ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    @Override
    protected boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.currentAttachLayout.onContainerViewTouchEvent(motionEvent);
    }

    public void makeFocusable(final EditTextBoldCursor editTextBoldCursor, final boolean z) {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate == null || this.enterCommentEventSent) {
            return;
        }
        boolean needEnterComment = chatAttachViewDelegate.needEnterComment();
        this.enterCommentEventSent = true;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.this.lambda$makeFocusable$42(editTextBoldCursor, z);
            }
        }, needEnterComment ? 200L : 0L);
    }

    public void lambda$makeFocusable$42(final EditTextBoldCursor editTextBoldCursor, boolean z) {
        setFocusable(true);
        editTextBoldCursor.requestFocus();
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                }
            });
        }
    }

    public void applyAttachButtonColors(View view) {
        if (view instanceof AttachButton) {
            AttachButton attachButton = (AttachButton) view;
            attachButton.textView.setTextColor(ColorUtils.blendARGB(getThemedColor(Theme.key_dialogTextGray2), getThemedColor(attachButton.textKey), attachButton.checkedState));
        } else if (view instanceof AttachBotButton) {
            AttachBotButton attachBotButton = (AttachBotButton) view;
            attachBotButton.nameTextView.setTextColor(ColorUtils.blendARGB(getThemedColor(Theme.key_dialogTextGray2), attachBotButton.textColor, attachBotButton.checkedState));
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions;
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                if (attachAlertLayoutArr[i] != null && (themeDescriptions = attachAlertLayoutArr[i].getThemeDescriptions()) != null) {
                    arrayList.addAll(themeDescriptions);
                }
                i++;
            } else {
                arrayList.add(new ThemeDescription(this.container, 0, null, null, null, null, Theme.key_dialogBackgroundGray));
                return arrayList;
            }
        }
    }

    public void checkColors() {
        RecyclerListView recyclerListView = this.buttonsRecyclerView;
        if (recyclerListView == null) {
            return;
        }
        int childCount = recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            applyAttachButtonColors(this.buttonsRecyclerView.getChildAt(i));
        }
        this.selectedTextView.setTextColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        this.mediaPreviewTextView.setTextColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        this.doneItem.getTextView().setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlueHeader));
        this.selectedMenuItem.setIconColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        Theme.setDrawableColor(this.selectedMenuItem.getBackground(), getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector));
        ActionBarMenuItem actionBarMenuItem = this.selectedMenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        actionBarMenuItem.setPopupItemsColor(getThemedColor(i2), false);
        this.selectedMenuItem.setPopupItemsColor(getThemedColor(i2), true);
        this.selectedMenuItem.redrawPopup(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        ActionBarMenuItem actionBarMenuItem2 = this.searchItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setIconColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
            Theme.setDrawableColor(this.searchItem.getBackground(), getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector));
        }
        this.commentTextView.updateColors();
        this.actionBarShadow.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
        this.buttonsRecyclerView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.buttonsRecyclerView.setBackgroundColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground));
        this.frameLayout2.setBackgroundColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground));
        this.actionBar.setBackgroundColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBar : Theme.key_dialogBackground));
        this.actionBar.setItemsColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector), false);
        this.actionBar.setTitleColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        Theme.setDrawableColor(this.shadowDrawable, getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground));
        this.containerView.invalidate();
        int i3 = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i3 >= attachAlertLayoutArr.length) {
                break;
            }
            if (attachAlertLayoutArr[i3] != null) {
                attachAlertLayoutArr[i3].checkColors();
            }
            i3++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(Theme.key_dialogBackgroundGray);
            AndroidUtilities.setNavigationBarColor(getWindow(), getThemedColor(Theme.key_dialogBackground), false);
            AndroidUtilities.setLightNavigationBar(getWindow(), ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
            return;
        }
        fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
    }

    @Override
    protected boolean onCustomMeasure(View view, int i, int i2) {
        return this.photoLayout.onCustomMeasure(view, i, i2);
    }

    @Override
    protected boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        return this.photoLayout.onCustomLayout(view, i, i2, i3, i4);
    }

    public void onPause() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                if (attachAlertLayoutArr[i] != null) {
                    attachAlertLayoutArr[i].onPause();
                }
                i++;
            } else {
                this.paused = true;
                return;
            }
        }
    }

    public void onResume() {
        int i = 0;
        this.paused = false;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            if (attachAlertLayoutArr[i] != null) {
                attachAlertLayoutArr[i].onResume();
            }
            i++;
        }
        if (isShowing()) {
            this.delegate.needEnterComment();
        }
    }

    public void onActivityResultFragment(int i, Intent intent, String str) {
        this.photoLayout.onActivityResultFragment(i, intent, str);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.reloadInlineHints || i == NotificationCenter.attachMenuBotsDidLoad || i == NotificationCenter.quickRepliesUpdated) {
            ButtonsAdapter buttonsAdapter = this.buttonsAdapter;
            if (buttonsAdapter != null) {
                buttonsAdapter.notifyDataSetChanged();
            }
        } else if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            this.currentLimit = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        }
    }

    public int getScrollOffsetY(int i) {
        AttachAlertLayout attachAlertLayout = this.nextAttachLayout;
        if (attachAlertLayout != null && ((this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (attachAlertLayout instanceof ChatAttachAlertPhotoLayoutPreview))) {
            int[] iArr = this.scrollOffsetY;
            return AndroidUtilities.lerp(iArr[0], iArr[1], this.translationProgress);
        }
        return this.scrollOffsetY[i];
    }

    public void updateSelectedPosition(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.updateSelectedPosition(int):void");
    }

    private void updateActionBarVisibility(final boolean z, boolean z2) {
        AttachAlertLayout attachAlertLayout;
        if (!(z && this.actionBar.getTag() == null) && (z || this.actionBar.getTag() == null)) {
            return;
        }
        this.actionBar.setTag(z ? 1 : null);
        AnimatorSet animatorSet = this.actionBarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.actionBarAnimation = null;
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        boolean z3 = actionBarMenuItem != null && this.avatarSearch;
        boolean z4 = (this.isPhotoPicker || this.storyMediaPicker || (this.avatarPicker == 0 && this.menuShowed) || this.currentAttachLayout != this.photoLayout || (!this.photosEnabled && !this.videosEnabled)) ? false : true;
        if (this.currentAttachLayout == this.restrictedLayout) {
            z3 = false;
            z4 = false;
        }
        if (z) {
            if (z3) {
                actionBarMenuItem.setVisibility(0);
            }
            if (z4) {
                this.selectedMenuItem.setVisibility(0);
            }
        } else if (this.typeButtonsAvailable && this.frameLayout2.getTag() == null) {
            this.buttonsRecyclerView.setVisibility(0);
        }
        if (getWindow() != null && this.baseFragment != null) {
            if (z) {
                AndroidUtilities.setLightStatusBar(getWindow(), isLightStatusBar());
            } else {
                AndroidUtilities.setLightStatusBar(getWindow(), this.baseFragment.isLightStatusBar());
            }
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration(Math.abs((z ? 1.0f : 0.0f) - this.actionBar.getAlpha()) * 180.0f);
            ArrayList arrayList = new ArrayList();
            ActionBar actionBar = this.actionBar;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(actionBar, property, fArr));
            View view = this.actionBarShadow;
            Property property2 = View.ALPHA;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(view, property2, fArr2));
            if (z3) {
                ActionBarMenuItem actionBarMenuItem2 = this.searchItem;
                Property property3 = View.ALPHA;
                float[] fArr3 = new float[1];
                fArr3[0] = z ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, property3, fArr3));
            }
            if (z4) {
                ActionBarMenuItem actionBarMenuItem3 = this.selectedMenuItem;
                Property property4 = View.ALPHA;
                float[] fArr4 = new float[1];
                fArr4[0] = z ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem3, property4, fArr4));
            }
            this.actionBarAnimation.playTogether(arrayList);
            this.actionBarAnimation.addListener(new AnimatorListenerAdapter() {
                {
                    ChatAttachAlert.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ChatAttachAlert.this.actionBarAnimation != null) {
                        if (z) {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.typeButtonsAvailable) {
                                if (chatAttachAlert.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons()) {
                                    ChatAttachAlert.this.buttonsRecyclerView.setVisibility(4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ActionBarMenuItem actionBarMenuItem4 = ChatAttachAlert.this.searchItem;
                        if (actionBarMenuItem4 != null) {
                            actionBarMenuItem4.setVisibility(4);
                        }
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        if (chatAttachAlert2.avatarPicker == 0 && chatAttachAlert2.menuShowed) {
                            return;
                        }
                        ChatAttachAlert.this.selectedMenuItem.setVisibility(4);
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    ChatAttachAlert.this.actionBarAnimation = null;
                }
            });
            this.actionBarAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionBarAnimation.setDuration(380L);
            this.actionBarAnimation.start();
            return;
        }
        if (z && this.typeButtonsAvailable && ((attachAlertLayout = this.currentAttachLayout) == null || attachAlertLayout.shouldHideBottomButtons())) {
            this.buttonsRecyclerView.setVisibility(4);
        }
        this.actionBar.setAlpha(z ? 1.0f : 0.0f);
        this.actionBarShadow.setAlpha(z ? 1.0f : 0.0f);
        if (z3) {
            this.searchItem.setAlpha(z ? 1.0f : 0.0f);
        }
        if (z4) {
            this.selectedMenuItem.setAlpha(z ? 1.0f : 0.0f);
        }
        if (z) {
            return;
        }
        ActionBarMenuItem actionBarMenuItem4 = this.searchItem;
        if (actionBarMenuItem4 != null) {
            actionBarMenuItem4.setVisibility(4);
        }
        if (this.avatarPicker == 0 && this.menuShowed) {
            return;
        }
        this.selectedMenuItem.setVisibility(4);
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void updateLayout(org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout r7, boolean r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.updateLayout(org.telegram.ui.Components.ChatAttachAlert$AttachAlertLayout, boolean, int):void");
    }

    public void updateCountButton(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.updateCountButton(int):void");
    }

    public void setDelegate(ChatAttachViewDelegate chatAttachViewDelegate) {
        this.delegate = chatAttachViewDelegate;
    }

    public void init() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.init():void");
    }

    public void lambda$init$43(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
        ((ChatActivity) this.baseFragment).didSelectLocation(tLRPC$MessageMedia, i, z, i2);
    }

    public void onDestroy() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            if (attachAlertLayoutArr[i] != null) {
                attachAlertLayoutArr[i].onDestroy();
            }
            i++;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.destroyed = true;
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        MediaController.AlbumEntry albumEntry;
        if (this.baseFragment instanceof ChatActivity) {
            albumEntry = MediaController.allMediaAlbumEntry;
        } else {
            albumEntry = MediaController.allPhotosAlbumEntry;
        }
        if (Build.VERSION.SDK_INT <= 19 && albumEntry == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
        this.currentAttachLayout.onOpenAnimationEnd();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.openTransitionFinished = true;
        if (this.videosEnabled || this.photosEnabled) {
            return;
        }
        checkCanRemoveRestrictionsByBoosts();
    }

    @Override
    public void setAllowDrawContent(boolean z) {
        super.setAllowDrawContent(z);
        this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        if (this.allowDrawContent != z) {
            this.allowDrawContent = z;
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
            if (attachAlertLayout != chatAttachAlertPhotoLayout || chatAttachAlertPhotoLayout == null || chatAttachAlertPhotoLayout.cameraExpanded) {
                return;
            }
            chatAttachAlertPhotoLayout.pauseCamera(!z || this.sent);
        }
    }

    public void setAvatarPicker(int i, boolean z) {
        this.avatarPicker = i;
        this.avatarSearch = z;
        if (i != 0) {
            this.typeButtonsAvailable = false;
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            if (attachAlertLayout == null || attachAlertLayout == this.photoLayout) {
                this.buttonsRecyclerView.setVisibility(8);
                this.shadow.setVisibility(8);
            }
            if (this.avatarPicker == 2) {
                this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            } else {
                this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhoto));
            }
        } else {
            this.typeButtonsAvailable = true;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.updateAvatarPicker();
        }
    }

    public void setStoryMediaPicker() {
        this.storyMediaPicker = true;
        this.typeButtonsAvailable = false;
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
    }

    public void enableStickerMode(Utilities.Callback2<String, TLRPC$InputDocument> callback2) {
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoForSticker));
        this.typeButtonsAvailable = false;
        this.buttonsRecyclerView.setVisibility(8);
        this.shadow.setVisibility(8);
        this.avatarPicker = 1;
        this.isPhotoPicker = true;
        this.isStickerMode = true;
        this.customStickerHandler = callback2;
        if (this.optionsItem != null) {
            this.selectedTextView.setTranslationY(-AndroidUtilities.dp(8.0f));
            this.optionsItem.setVisibility(0);
        }
    }

    public void enableDefaultMode() {
        this.typeButtonsAvailable = true;
        this.buttonsRecyclerView.setVisibility(0);
        this.shadow.setVisibility(0);
        this.avatarPicker = 0;
        this.isPhotoPicker = false;
        this.isStickerMode = false;
        this.customStickerHandler = null;
        if (this.optionsItem != null) {
            this.selectedTextView.setTranslationY(0.0f);
            this.optionsItem.setVisibility(8);
        }
    }

    public TextView getSelectedTextView() {
        return this.selectedTextView;
    }

    public void setSoundPicker() {
        this.isSoundPicker = true;
        this.buttonsRecyclerView.setVisibility(8);
        this.shadow.setVisibility(8);
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
    }

    public void setStoryLocationPicker() {
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerView.setVisibility(8);
        this.shadow.setVisibility(8);
    }

    public void setStoryLocationPicker(boolean z, File file) {
        this.storyLocationPickerFileIsVideo = z;
        this.storyLocationPickerPhotoFile = file;
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerView.setVisibility(8);
        this.shadow.setVisibility(8);
    }

    public void setStoryLocationPicker(double d, double d2) {
        this.storyLocationPickerLatLong = new double[]{d, d2};
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerView.setVisibility(8);
        this.shadow.setVisibility(8);
    }

    public void setStoryAudioPicker() {
        this.isStoryAudioPicker = true;
    }

    public void setMaxSelectedPhotos(int i, boolean z) {
        if (this.editingMessageObject != null) {
            return;
        }
        this.maxSelectedPhotos = i;
        this.allowOrder = z;
    }

    public void setOpenWithFrontFaceCamera(boolean z) {
        this.openWithFrontFaceCamera = z;
    }

    public ChatAttachAlertPhotoLayout getPhotoLayout() {
        return this.photoLayout;
    }

    public class ButtonsAdapter extends RecyclerListView.SelectionAdapter {
        private int attachBotsEndRow;
        private int attachBotsStartRow;
        private List<TLRPC$TL_attachMenuBot> attachMenuBots = new ArrayList();
        private int buttonsCount;
        private int contactButton;
        private int documentButton;
        private int galleryButton;
        private int locationButton;
        private Context mContext;
        private int musicButton;
        private int pollButton;
        private int quickRepliesButton;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public ButtonsAdapter(Context context) {
            ChatAttachAlert.this = r1;
            this.mContext = context;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View attachButton;
            if (i == 0) {
                attachButton = new AttachButton(this.mContext);
            } else {
                attachButton = new AttachBotButton(this.mContext);
            }
            attachButton.setImportantForAccessibility(1);
            attachButton.setFocusable(true);
            return new RecyclerListView.Holder(attachButton);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    return;
                }
                AttachBotButton attachBotButton = (AttachBotButton) viewHolder.itemView;
                int i2 = this.attachBotsStartRow;
                if (i >= i2 && i < this.attachBotsEndRow) {
                    int i3 = i - i2;
                    attachBotButton.setTag(Integer.valueOf(i3));
                    TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot = this.attachMenuBots.get(i3);
                    attachBotButton.setAttachBot(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(tLRPC$TL_attachMenuBot.bot_id)), tLRPC$TL_attachMenuBot);
                    return;
                }
                int i4 = i - this.buttonsCount;
                attachBotButton.setTag(Integer.valueOf(i4));
                attachBotButton.setUser(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).inlineBots.get(i4).peer.user_id)));
                return;
            }
            AttachButton attachButton = (AttachButton) viewHolder.itemView;
            if (i == this.galleryButton) {
                attachButton.setTextAndIcon(1, (CharSequence) LocaleController.getString("ChatGallery", R.string.ChatGallery), Theme.chat_attachButtonDrawables[0], Theme.key_chat_attachGalleryBackground, Theme.key_chat_attachGalleryText);
                attachButton.setTag(1);
            } else if (i == this.documentButton) {
                attachButton.setTextAndIcon(4, (CharSequence) LocaleController.getString("ChatDocument", R.string.ChatDocument), Theme.chat_attachButtonDrawables[2], Theme.key_chat_attachFileBackground, Theme.key_chat_attachFileText);
                attachButton.setTag(4);
            } else if (i == this.locationButton) {
                attachButton.setTextAndIcon(6, (CharSequence) LocaleController.getString("ChatLocation", R.string.ChatLocation), Theme.chat_attachButtonDrawables[4], Theme.key_chat_attachLocationBackground, Theme.key_chat_attachLocationText);
                attachButton.setTag(6);
            } else if (i == this.musicButton) {
                attachButton.setTextAndIcon(3, (CharSequence) LocaleController.getString("AttachMusic", R.string.AttachMusic), Theme.chat_attachButtonDrawables[1], Theme.key_chat_attachAudioBackground, Theme.key_chat_attachAudioText);
                attachButton.setTag(3);
            } else if (i == this.pollButton) {
                attachButton.setTextAndIcon(9, (CharSequence) LocaleController.getString("Poll", R.string.Poll), Theme.chat_attachButtonDrawables[5], Theme.key_chat_attachPollBackground, Theme.key_chat_attachPollText);
                attachButton.setTag(9);
            } else if (i == this.contactButton) {
                attachButton.setTextAndIcon(5, (CharSequence) LocaleController.getString("AttachContact", R.string.AttachContact), Theme.chat_attachButtonDrawables[3], Theme.key_chat_attachContactBackground, Theme.key_chat_attachContactText);
                attachButton.setTag(5);
            } else if (i == this.quickRepliesButton) {
                attachButton.setTextAndIcon(11, LocaleController.getString(R.string.AttachQuickReplies), ChatAttachAlert.this.getContext().getResources().getDrawable(R.drawable.ic_ab_reply).mutate(), Theme.key_chat_attachContactBackground, Theme.key_chat_attachContactText);
                attachButton.setTag(11);
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            ChatAttachAlert.this.applyAttachButtonColors(viewHolder.itemView);
        }

        @Override
        public int getItemCount() {
            int i = this.buttonsCount;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            return (chatAttachAlert.editingMessageObject == null && (chatAttachAlert.baseFragment instanceof ChatActivity)) ? i + MediaDataController.getInstance(chatAttachAlert.currentAccount).inlineBots.size() : i;
        }

        @Override
        public void notifyDataSetChanged() {
            this.buttonsCount = 0;
            this.galleryButton = -1;
            this.documentButton = -1;
            this.musicButton = -1;
            this.pollButton = -1;
            this.contactButton = -1;
            this.quickRepliesButton = -1;
            this.locationButton = -1;
            this.attachBotsStartRow = -1;
            this.attachBotsEndRow = -1;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!(chatAttachAlert.baseFragment instanceof ChatActivity)) {
                int i = 0 + 1;
                this.buttonsCount = i;
                this.galleryButton = 0;
                int i2 = i + 1;
                this.buttonsCount = i2;
                this.documentButton = i;
                if (chatAttachAlert.allowEnterCaption) {
                    this.buttonsCount = i2 + 1;
                    this.musicButton = i2;
                }
            } else {
                MessageObject messageObject = chatAttachAlert.editingMessageObject;
                if (messageObject != null) {
                    if ((messageObject.isMusic() || ChatAttachAlert.this.editingMessageObject.isDocument()) && ChatAttachAlert.this.editingMessageObject.hasValidGroupId()) {
                        if (ChatAttachAlert.this.editingMessageObject.isMusic()) {
                            int i3 = this.buttonsCount;
                            this.buttonsCount = i3 + 1;
                            this.musicButton = i3;
                        } else {
                            int i4 = this.buttonsCount;
                            this.buttonsCount = i4 + 1;
                            this.documentButton = i4;
                        }
                    } else {
                        int i5 = this.buttonsCount;
                        int i6 = i5 + 1;
                        this.buttonsCount = i6;
                        this.galleryButton = i5;
                        int i7 = i6 + 1;
                        this.buttonsCount = i7;
                        this.documentButton = i6;
                        this.buttonsCount = i7 + 1;
                        this.musicButton = i7;
                    }
                } else {
                    this.buttonsCount = 0 + 1;
                    this.galleryButton = 0;
                    if (chatAttachAlert.photosEnabled || ChatAttachAlert.this.videosEnabled) {
                        BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                        if ((baseFragment instanceof ChatActivity) && !((ChatActivity) baseFragment).isInScheduleMode() && !((ChatActivity) ChatAttachAlert.this.baseFragment).isSecretChat() && ((ChatActivity) ChatAttachAlert.this.baseFragment).getChatMode() != 5) {
                            ChatActivity chatActivity = (ChatActivity) ChatAttachAlert.this.baseFragment;
                            this.attachBotsStartRow = this.buttonsCount;
                            this.attachMenuBots.clear();
                            Iterator<TLRPC$TL_attachMenuBot> it = MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).getAttachMenuBots().bots.iterator();
                            while (it.hasNext()) {
                                TLRPC$TL_attachMenuBot next = it.next();
                                if (next.show_in_attach_menu) {
                                    if (MediaDataController.canShowAttachMenuBot(next, chatActivity.getCurrentChat() != null ? chatActivity.getCurrentChat() : chatActivity.getCurrentUser())) {
                                        this.attachMenuBots.add(next);
                                    }
                                }
                            }
                            int size = this.buttonsCount + this.attachMenuBots.size();
                            this.buttonsCount = size;
                            this.attachBotsEndRow = size;
                        }
                    }
                    int i8 = this.buttonsCount;
                    this.buttonsCount = i8 + 1;
                    this.documentButton = i8;
                    if (ChatAttachAlert.this.plainTextEnabled) {
                        int i9 = this.buttonsCount;
                        this.buttonsCount = i9 + 1;
                        this.locationButton = i9;
                    }
                    if (ChatAttachAlert.this.pollsEnabled) {
                        int i10 = this.buttonsCount;
                        this.buttonsCount = i10 + 1;
                        this.pollButton = i10;
                    }
                    if (ChatAttachAlert.this.plainTextEnabled) {
                        int i11 = this.buttonsCount;
                        this.buttonsCount = i11 + 1;
                        this.contactButton = i11;
                    }
                    BaseFragment baseFragment2 = ChatAttachAlert.this.baseFragment;
                    TLRPC$User currentUser = baseFragment2 instanceof ChatActivity ? ((ChatActivity) baseFragment2).getCurrentUser() : null;
                    BaseFragment baseFragment3 = ChatAttachAlert.this.baseFragment;
                    if ((baseFragment3 instanceof ChatActivity) && ((ChatActivity) baseFragment3).getChatMode() == 0 && currentUser != null && !currentUser.bot && QuickRepliesController.getInstance(ChatAttachAlert.this.currentAccount).hasReplies()) {
                        int i12 = this.buttonsCount;
                        this.buttonsCount = i12 + 1;
                        this.quickRepliesButton = i12;
                    }
                    int i13 = this.buttonsCount;
                    this.buttonsCount = i13 + 1;
                    this.musicButton = i13;
                }
            }
            super.notifyDataSetChanged();
        }

        @Override
        public int getItemViewType(int i) {
            if (i < this.buttonsCount) {
                return (i < this.attachBotsStartRow || i >= this.attachBotsEndRow) ? 0 : 1;
            }
            return 1;
        }
    }

    @Override
    public void dismissInternal() {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.doOnIdle(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.this.removeFromRoot();
                }
            });
        } else {
            removeFromRoot();
        }
    }

    public void removeFromRoot() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        if (this.actionBar.isSearchFieldVisible()) {
            this.actionBar.closeSearchField();
        }
        this.contactsLayout = null;
        this.quickRepliesLayout = null;
        this.audioLayout = null;
        this.pollLayout = null;
        this.locationLayout = null;
        this.documentLayout = null;
        int i = 1;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                if (attachAlertLayoutArr[i] != null) {
                    attachAlertLayoutArr[i].onDestroy();
                    this.containerView.removeView(this.layouts[i]);
                    this.layouts[i] = null;
                }
                i++;
            } else {
                updateActionBarVisibility(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (this.passcodeView.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else if (this.actionBar.isSearchFieldVisible()) {
            this.actionBar.closeSearchField();
        } else if (this.currentAttachLayout.onBackPressed()) {
        } else {
            EditTextEmoji editTextEmoji = this.commentTextView;
            if (editTextEmoji != null && editTextEmoji.isPopupShowing()) {
                this.commentTextView.hidePopup(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public void dismissWithButtonClick(int i) {
        super.dismissWithButtonClick(i);
        this.currentAttachLayout.onDismissWithButtonClick(i);
    }

    @Override
    protected boolean canDismissWithTouchOutside() {
        return this.currentAttachLayout.canDismissWithTouchOutside();
    }

    @Override
    public void onDismissWithTouchOutside() {
        if (this.currentAttachLayout.onDismissWithTouchOutside()) {
            dismiss();
        }
    }

    @Override
    public void dismiss(boolean z) {
        if (z) {
            this.allowPassConfirmationAlert = z;
        }
        dismiss();
    }

    @Override
    public void dismiss() {
        if (this.currentAttachLayout.onDismiss() || isDismissed()) {
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            AndroidUtilities.hideKeyboard(editTextEmoji.getEditText());
        }
        this.botAttachLayouts.clear();
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment == null) {
            baseFragment = LaunchActivity.getLastFragment();
        }
        if (!this.allowPassConfirmationAlert && baseFragment != null && this.currentAttachLayout.getSelectedItemsCount() > 0 && !this.isPhotoPicker) {
            if (this.confirmationAlertShown) {
                return;
            }
            this.confirmationAlertShown = true;
            AlertDialog create = new AlertDialog.Builder(baseFragment.getParentActivity(), this.resourcesProvider).setTitle(LocaleController.getString("DiscardSelectionAlertTitle", R.string.DiscardSelectionAlertTitle)).setMessage(LocaleController.getString("DiscardSelectionAlertMessage", R.string.DiscardSelectionAlertMessage)).setPositiveButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatAttachAlert.this.lambda$dismiss$44(dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ChatAttachAlert.this.lambda$dismiss$45(dialogInterface);
                }
            }).setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    ChatAttachAlert.this.lambda$dismiss$46(dialogInterface);
                }
            }).create();
            create.show();
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            if (attachAlertLayoutArr[i] != null && this.currentAttachLayout != attachAlertLayoutArr[i]) {
                attachAlertLayoutArr[i].onDismiss();
            }
            i++;
        }
        AndroidUtilities.setNavigationBarColor(getWindow(), ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), 0), true, new AndroidUtilities.IntColorCallback() {
            @Override
            public final void run(int i2) {
                ChatAttachAlert.this.lambda$dismiss$47(i2);
            }
        });
        if (baseFragment != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), baseFragment.isLightStatusBar());
        }
        super.dismiss();
        this.allowPassConfirmationAlert = false;
    }

    public void lambda$dismiss$44(DialogInterface dialogInterface, int i) {
        this.allowPassConfirmationAlert = true;
        dismiss();
    }

    public void lambda$dismiss$45(DialogInterface dialogInterface) {
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        springAnimation2.getSpring().setDampingRatio(1.5f);
        this.appearSpringAnimation.getSpring().setStiffness(1500.0f);
        this.appearSpringAnimation.start();
    }

    public void lambda$dismiss$46(DialogInterface dialogInterface) {
        this.confirmationAlertShown = false;
    }

    public void lambda$dismiss$47(int i) {
        this.navBarColorKey = -1;
        this.navBarColor = i;
        this.containerView.invalidate();
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.currentAttachLayout.onSheetKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
    }

    public BaseFragment getBaseFragment() {
        return this.baseFragment;
    }

    public EditTextEmoji getCommentTextView() {
        return this.commentTextView;
    }

    public ChatAttachAlertDocumentLayout getDocumentLayout() {
        return this.documentLayout;
    }

    public void setAllowEnterCaption(boolean z) {
        this.allowEnterCaption = z;
    }

    public void setDocumentsDelegate(ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentSelectActivityDelegate) {
        this.documentsDelegate = documentSelectActivityDelegate;
    }

    public void replaceWithText(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.commentTextView == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.commentTextView.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.commentTextView.getEditText().getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
            }
            this.commentTextView.setText(spannableStringBuilder);
            this.commentTextView.setSelection(i + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void createMentionsContainer() {
        this.mentionContainer = new MentionsContainerView(getContext(), UserConfig.getInstance(this.currentAccount).getClientUserId(), 0L, LaunchActivity.getLastFragment(), null, this.resourcesProvider) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            protected void onScrolled(boolean z, boolean z2) {
                if (ChatAttachAlert.this.photoLayout != null) {
                    ChatAttachAlert.this.photoLayout.checkCameraViewPosition();
                }
            }

            @Override
            protected void onAnimationScroll() {
                if (ChatAttachAlert.this.photoLayout != null) {
                    ChatAttachAlert.this.photoLayout.checkCameraViewPosition();
                }
            }
        };
        setupMentionContainer();
        this.mentionContainer.withDelegate(new MentionsContainerView.Delegate() {
            @Override
            public void addEmojiToRecent(String str) {
                MentionsContainerView.Delegate.CC.$default$addEmojiToRecent(this, str);
            }

            @Override
            public void onStickerSelected(TLRPC$TL_document tLRPC$TL_document, String str, Object obj) {
                MentionsContainerView.Delegate.CC.$default$onStickerSelected(this, tLRPC$TL_document, str, obj);
            }

            @Override
            public void sendBotInlineResult(TLRPC$BotInlineResult tLRPC$BotInlineResult, boolean z, int i) {
                MentionsContainerView.Delegate.CC.$default$sendBotInlineResult(this, tLRPC$BotInlineResult, z, i);
            }

            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void replaceText(int i, int i2, CharSequence charSequence, boolean z) {
                ChatAttachAlert.this.replaceWithText(i, i2, charSequence, z);
            }

            @Override
            public Paint.FontMetricsInt getFontMetrics() {
                return ChatAttachAlert.this.commentTextView.getEditText().getPaint().getFontMetricsInt();
            }
        });
        ViewGroup viewGroup = this.containerView;
        viewGroup.addView(this.mentionContainer, viewGroup.indexOfChild(this.frameLayout2), LayoutHelper.createFrame(-1, -1, 83));
        this.mentionContainer.setTranslationY(-this.commentTextView.getHeight());
        setupMentionContainer();
    }

    protected void setupMentionContainer() {
        this.mentionContainer.getAdapter().setAllowStickers(false);
        this.mentionContainer.getAdapter().setAllowBots(false);
        this.mentionContainer.getAdapter().setAllowChats(false);
        this.mentionContainer.getAdapter().setSearchInDailogs(true);
        if (this.baseFragment instanceof ChatActivity) {
            this.mentionContainer.getAdapter().setChatInfo(((ChatActivity) this.baseFragment).getCurrentChatInfo());
            this.mentionContainer.getAdapter().setNeedUsernames(((ChatActivity) this.baseFragment).getCurrentChat() != null);
        } else {
            this.mentionContainer.getAdapter().setChatInfo(null);
            this.mentionContainer.getAdapter().setNeedUsernames(false);
        }
        this.mentionContainer.getAdapter().setNeedBotContext(false);
    }
}
