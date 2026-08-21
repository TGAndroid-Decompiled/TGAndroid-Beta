package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
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
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.utils.EphemeralMessagesHelper;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.messenger.utils.RectFMergeBounding;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Components.poll.PollAttachedMediaPack;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.PhotoPickerSearchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.WebAppDisclaimerAlert;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotWebViewMenuContainer$ActionBarColorsAnimating;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.web.BotWebViewContainer;

public class ChatAttachAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, BottomSheet.BottomSheetDelegateInterface, FactorAnimator.Target {
    public final Property ATTACH_ALERT_LAYOUT_TRANSLATION;
    private final Property ATTACH_ALERT_PROGRESS;
    public ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private final ImageView aiButton;
    private final AiButtonDrawable aiButtonIcon;
    private boolean allowDrawContent;
    public boolean allowEnterCaption;
    public boolean allowLivePhotos;
    protected boolean allowOrder;
    protected boolean allowPassConfirmationAlert;
    private final BoolAnimator animatorActionBarVisible;
    private final BoolAnimator animatorCaptionAbove;
    private final BoolAnimator animatorCaptionNotEmpty;
    private final BoolAnimator animatorCaptionVisible;
    private final ReplaceAnimator animatorCurrentVisibleLayout;
    private final BoolAnimator animatorEphemeralMessageVisibility;
    private final BoolAnimator animatorToggleCaptionSupported;
    private SpringAnimation appearSpringAnimation;
    private final Paint attachButtonPaint;
    private int attachItemSize;
    private ChatAttachAlertAudioLayout audioLayout;
    private ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate;
    protected int avatarPicker;
    protected boolean avatarSearch;
    protected Utilities.Callback0Return avatarWithBulletin;
    public final BaseFragment baseFragment;
    private float baseSelectedTextViewTranslationY;
    private LongSparseArray botAttachLayouts;
    private boolean botButtonProgressWasVisible;
    private boolean botButtonWasVisible;
    private float botMainButtonOffsetY;
    private AnimatedTextView botMainButtonTextView;
    private RadialProgressView botProgressView;
    private BlurredBackgroundWithFadeDrawable bottomFadeDrawable;
    private View bottomFadeView;
    private float bottomPannelTranslation;
    private boolean buttonPressed;
    private ButtonsAdapter buttonsAdapter;
    private AnimatorSet buttonsAnimation;
    private LinearLayoutManager buttonsLayoutManager;
    protected RecyclerListView buttonsRecyclerView;
    protected FrameLayout buttonsRecyclerViewWrapper;
    public boolean canOpenPreview;
    public boolean captionAbove;
    private FrameLayout captionContainer;
    private BlurredBackgroundDrawable captionContainerBg;
    private float captionEditTextTopOffset;
    protected boolean captionLimitBulletinShown;
    private final AnimatedTextView captionLimitView;
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
    public float currentPanTranslationY;
    public Utilities.Callback2 customStickerHandler;
    private DecelerateInterpolator decelerateInterpolator;
    protected ChatAttachViewDelegate delegate;
    public boolean destroyed;
    public long dialogId;
    private ChatAttachAlertDocumentLayout documentLayout;
    private ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentsDelegate;
    private boolean documentsEnabled;
    protected TextView doneItem;
    private float doneItemAlphaByEnabled;
    private float doneItemAlphaByLayout;
    private int editType;
    protected MessageObject editingMessageObject;
    private long effectId;
    private ChatAttachAlertEmojiLayout emojiLayout;
    private BlurredBackgroundDrawable emojiViewChildBg;
    private EmojiView.EmojiViewDelegate emojiViewDelegate;
    private boolean enterCommentEventSent;
    private ArrayList exclusionRects;
    private Rect exclustionRect;
    private ChatActivityFadeView fadeView;
    public boolean forUser;
    private final boolean forceDarkTheme;
    private FrameLayout frameLayout2;
    private float fromScrollY;
    private boolean hasOverridenWebviewBackgroundColor;
    protected FrameLayout headerView;
    private final IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFade;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionFastScroll;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final ArrayList iBlur3PositionsMerged;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public boolean inBubbleMode;
    public boolean isBizLocationPicker;
    public boolean isLocationPicker;
    public boolean isPhotoPicker;
    public boolean isPollAttach;
    private boolean isSoundPicker;
    public boolean isStickerMode;
    public boolean isStoryAudioPicker;
    public boolean isStoryLocationPicker;
    private AttachAlertLayout[] layouts;
    private ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate;
    private ChatAttachAlertLocationLayout locationLayout;
    protected int maxSelectedPhotos;
    protected TextView mediaPreviewTextView;
    protected LinearLayout mediaPreviewView;
    public MentionsContainerView mentionContainer;
    private AnimatorSet menuAnimator;
    private boolean menuShowed;
    private MessageSendPreview messageSendPreview;
    private HintView2 motionHint;
    private MotionPhotoDrawable motionIcon;
    protected ActionBarMenuItem motionItem;
    public ImageView moveCaptionButton;
    private boolean musicEnabled;
    private AttachAlertLayout nextAttachLayout;
    private boolean openTransitionFinished;
    protected boolean openWithFrontFaceCamera;
    protected ActionBarMenuItem optionsItem;
    private boolean overrideBackgroundColor;
    private int overridenWebviewBackgroundColor;
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
    private int pollAllowedLayouts;
    private ChatAttachAlertPollLayout pollLayout;
    private boolean pollsEnabled;
    private int previousScrollOffsetY;
    private ChatAttachAlertQuickRepliesLayout quickRepliesLayout;
    private RectF rect;
    public boolean restrictEphemeralMessageTypes;
    private ChatAttachRestrictedLayout restrictedLayout;
    private ChatAttachAlertRichLayout richLayout;
    public int[] scrollOffsetY;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
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
    private final boolean showingFromDialog;
    private boolean shownAiButton;
    public SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private ChatAttachAlertEmojiLayout stickersLayout;
    public boolean storyLocationPickerFileIsVideo;
    public double[] storyLocationPickerLatLong;
    public File storyLocationPickerPhotoFile;
    public boolean storyMediaPicker;
    private TextPaint textPaint;
    private float toScrollY;
    private boolean todoEnabled;
    private ChatAttachAlertPollLayout todoLayout;
    private final ImageView topAiButton;
    private final AiButtonDrawable topAiButtonIcon;
    private ValueAnimator topBackgroundAnimator;
    private final AnimatedTextView topCaptionLimitView;
    public FrameLayout topCommentContainer;
    public ImageView topCommentMoveButton;
    public EditTextEmoji topCommentTextView;
    public float translationProgress;
    protected boolean typeButtonsAvailable;
    private boolean typeButtonsHidden;
    private boolean videosEnabled;
    private Object viewChangeAnimator;
    private ChatActivityEnterView.SendButton writeButton;
    private FrameLayout writeButtonContainer;

    public static boolean $r8$lambda$ajAajr0t3B1zTNAXl2WKQMSJcro(View view, MotionEvent motionEvent) {
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

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public TLRPC.Chat getChat() {
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

    public void showBotLayout(long j, String str, boolean z, boolean z2) {
        String str2;
        if (this.botAttachLayouts.get(j) != null) {
            str2 = str;
            if (!Objects.equals(str, ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).getStartCommand()) || ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).needReload()) {
            }
            if (this.botAttachLayouts.get(j) != null) {
                ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).disallowSwipeOffsetAnimation();
                showLayout((AttachAlertLayout) this.botAttachLayouts.get(j), -j, z2);
                if (z) {
                    ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).showJustAddedBulletin();
                }
            }
        }
        str2 = str;
        if (this.baseFragment instanceof ChatActivity) {
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = new ChatAttachAlertBotWebViewLayout(this, getContext(), this.resourcesProvider);
            this.botAttachLayouts.put(j, chatAttachAlertBotWebViewLayout);
            ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).setDelegate(new AnonymousClass1(chatAttachAlertBotWebViewLayout, str2, j));
            MessageObject replyingMessageObject = ((ChatActivity) this.baseFragment).getChatActivityEnterView().getReplyingMessageObject();
            ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).requestWebView(this.currentAccount, ((ChatActivity) this.baseFragment).getDialogId(), j, false, replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0, str, ((ChatActivity) this.baseFragment).getSendMonoForumPeerId());
        }
        if (this.botAttachLayouts.get(j) != null) {
            ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).disallowSwipeOffsetAnimation();
            showLayout((AttachAlertLayout) this.botAttachLayouts.get(j), -j, z2);
            if (z) {
                ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.get(j)).showJustAddedBulletin();
            }
        }
    }

    class AnonymousClass1 implements BotWebViewContainer.Delegate {
        private ValueAnimator botButtonAnimator;
        final long val$id;
        final String val$startCommand;
        final ChatAttachAlertBotWebViewLayout val$webViewLayout;

        @Override
        public BotSensors getBotSensors() {
            return BotWebViewContainer.Delegate.CC.$default$getBotSensors(this);
        }

        @Override
        public void onCloseToTabs() {
            onCloseRequested(null);
        }

        @Override
        public void onEmojiStatusGranted(boolean z) {
            BotWebViewContainer.Delegate.CC.$default$onEmojiStatusGranted(this, z);
        }

        @Override
        public void onEmojiStatusSet(TLRPC.Document document) {
            BotWebViewContainer.Delegate.CC.$default$onEmojiStatusSet(this, document);
        }

        @Override
        public String onFullscreenRequested(boolean z, boolean z2) {
            return BotWebViewContainer.Delegate.CC.$default$onFullscreenRequested(this, z, z2);
        }

        @Override
        public void onInstantClose() {
            onCloseRequested(null);
        }

        @Override
        public void onLocationGranted(boolean z) {
            BotWebViewContainer.Delegate.CC.$default$onLocationGranted(this, z);
        }

        @Override
        public void onOpenBackFromTabs() {
            BotWebViewContainer.Delegate.CC.$default$onOpenBackFromTabs(this);
        }

        @Override
        public void onOrientationLockChanged(boolean z) {
            BotWebViewContainer.Delegate.CC.$default$onOrientationLockChanged(this, z);
        }

        @Override
        public void onSendWebViewData(String str) {
            BotWebViewContainer.Delegate.CC.$default$onSendWebViewData(this, str);
        }

        @Override
        public void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
        }

        @Override
        public void onSharedTo(ArrayList arrayList) {
            BotWebViewContainer.Delegate.CC.$default$onSharedTo(this, arrayList);
        }

        @Override
        public void onWebAppBackgroundChanged(boolean z, int i) {
            BotWebViewContainer.Delegate.CC.$default$onWebAppBackgroundChanged(this, z, i);
        }

        @Override
        public void onWebAppReady() {
            BotWebViewContainer.Delegate.CC.$default$onWebAppReady(this);
        }

        @Override
        public void onWebAppSetNavigationBarColor(int i) {
            BotWebViewContainer.Delegate.CC.$default$onWebAppSetNavigationBarColor(this, i);
        }

        AnonymousClass1(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, long j) {
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
                    ChatAttachAlert.AnonymousClass1.$r8$lambda$o9xXvPK9XJQ3UhaUGaDM0nQN0oE(runnable);
                }
            }, 150L);
        }

        public static void $r8$lambda$o9xXvPK9XJQ3UhaUGaDM0nQN0oE(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void onWebAppSetActionBarColor(int i, final int i2, boolean z) {
            final int color = ChatAttachAlert.this.iBlur3SourceColor.getColor();
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
                    ChatAttachAlert.AnonymousClass1.$r8$lambda$Jf9Hd5X5eHvbcdLNhVHG5nlkbcU(this.f$0, color, i2, chatAttachAlertBotWebViewLayout, botWebViewMenuContainer$ActionBarColorsAnimating, valueAnimator);
                }
            });
            duration.start();
        }

        public static void $r8$lambda$Jf9Hd5X5eHvbcdLNhVHG5nlkbcU(AnonymousClass1 anonymousClass1, int i, int i2, ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating, ValueAnimator valueAnimator) {
            anonymousClass1.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int iBlendARGB = ColorUtils.blendARGB(i, i2, fFloatValue);
            ChatAttachAlert.this.overridenWebviewBackgroundColor = iBlendARGB;
            ChatAttachAlert.this.hasOverridenWebviewBackgroundColor = true;
            ActionBar actionBar = ChatAttachAlert.this.actionBar;
            if (actionBar != null) {
                actionBar.updateColors();
                ChatAttachAlert.this.actionBar.invalidate();
            }
            ChatAttachAlert.this.iBlur3SourceColor.setColor(iBlendARGB);
            if (ChatAttachAlert.this.fadeView != null) {
                ChatAttachAlert.this.fadeView.invalidate();
            }
            chatAttachAlertBotWebViewLayout.setCustomActionBarBackground(iBlendARGB);
            ChatAttachAlert.this.currentAttachLayout.invalidate();
            ChatAttachAlert.this.sizeNotifierFrameLayout.invalidate();
            botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(ChatAttachAlert.this.actionBar, fFloatValue);
        }

        @Override
        public void onWebAppSetBackgroundColor(int i) {
            this.val$webViewLayout.setCustomBackground(i);
        }

        @Override
        public void onWebAppOpenInvoice(TLRPC.InputInvoice inputInvoice, final String str, TLObject tLObject) {
            PaymentFormActivity paymentFormActivity;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                final AlertDialog alertDialog = new AlertDialog(ChatAttachAlert.this.getContext(), 3);
                alertDialog.showDelayed(150L);
                StarsController starsController = StarsController.getInstance(ChatAttachAlert.this.currentAccount);
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        alertDialog.dismiss();
                    }
                };
                final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
                starsController.openPaymentForm(null, inputInvoice, tL_payments_paymentFormStars, runnable, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        chatAttachAlertBotWebViewLayout.getWebViewContainer().onInvoiceStatusUpdate(str, (String) obj);
                    }
                });
                AndroidUtilities.hideKeyboard(this.val$webViewLayout);
                return;
            }
            if (tLObject instanceof TLRPC.PaymentForm) {
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                MessagesController.getInstance(chatAttachAlert.currentAccount).putUsers(paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(paymentForm, str, baseFragment);
            } else {
                paymentFormActivity = tLObject instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject) : null;
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
                        ChatAttachAlert.AnonymousClass1.$r8$lambda$PmxU41FRyzgAm9jTxK4Sg8RKKow(overlayActionBarLayoutDialog, chatAttachAlertBotWebViewLayout2, str, invoiceStatus);
                    }
                });
                paymentFormActivity.setResourcesProvider(((BottomSheet) ChatAttachAlert.this).resourcesProvider);
                overlayActionBarLayoutDialog.addFragment(paymentFormActivity);
            }
        }

        public static void $r8$lambda$PmxU41FRyzgAm9jTxK4Sg8RKKow(OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, PaymentFormActivity.InvoiceStatus invoiceStatus) {
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
        public void onWebAppSwitchInlineQuery(final TLRPC.User user, final String str, List list) {
            if (list.isEmpty()) {
                BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                if (baseFragment instanceof ChatActivity) {
                    ((ChatActivity) baseFragment).getChatActivityEnterView().setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
                public boolean canSelectStories() {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                }

                @Override
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
                    return ChatAttachAlert.AnonymousClass1.$r8$lambda$naiwqkBt9EaWFgvXwoYqm9wCDBg(this.f$0, user, str, overlayActionBarLayoutDialog, dialogsActivity2, arrayList, charSequence, z, z2, i, i2, topicsFragment);
                }

                @Override
                public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
                }
            });
            overlayActionBarLayoutDialog.show();
            overlayActionBarLayoutDialog.addFragment(dialogsActivity);
        }

        public static boolean $r8$lambda$naiwqkBt9EaWFgvXwoYqm9wCDBg(AnonymousClass1 anonymousClass1, TLRPC.User user, String str, OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
            anonymousClass1.getClass();
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
            bundle.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
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
        public void onSetupMainButton(final boolean z, boolean z2, String str, long j, int i, int i2, final boolean z3, boolean z4) {
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout) {
                if (chatAttachAlertBotWebViewLayout.isBotButtonAvailable() || this.val$startCommand != null) {
                    ChatAttachAlert.this.botMainButtonTextView.setClickable(z2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (j == 0) {
                        ChatAttachAlert.this.botMainButtonTextView.setText(str);
                    } else {
                        spannableStringBuilder.append((CharSequence) "* ");
                        spannableStringBuilder.append((CharSequence) str);
                        spannableStringBuilder.setSpan(new AnimatedEmojiSpan(j, 1.4f, ChatAttachAlert.this.botMainButtonTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
                        ChatAttachAlert.this.botMainButtonTextView.setText(spannableStringBuilder);
                    }
                    ChatAttachAlert.this.botMainButtonTextView.setTextColor(i2);
                    ChatAttachAlert.this.botMainButtonTextView.setEmojiColor(i2);
                    ChatAttachAlert.this.botMainButtonTextView.setBackground(BotWebViewContainer.getMainButtonRippleDrawable(i));
                    if (ChatAttachAlert.this.botButtonWasVisible != z) {
                        ChatAttachAlert.this.botButtonWasVisible = z;
                        ValueAnimator valueAnimator = this.botButtonAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(250L);
                        this.botButtonAnimator = duration;
                        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                ChatAttachAlert.AnonymousClass1.m2157$r8$lambda$jlfGBgZH3a8Rg2pp0tjd8Al3AU(this.f$0, valueAnimator2);
                            }
                        });
                        this.botButtonAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animator) {
                                if (z) {
                                    ChatAttachAlert.this.botMainButtonTextView.setAlpha(0.0f);
                                    ChatAttachAlert.this.botMainButtonTextView.setVisibility(0);
                                    int iDp = AndroidUtilities.dp(36.0f);
                                    for (int i3 = 0; i3 < ChatAttachAlert.this.botAttachLayouts.size(); i3++) {
                                        ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i3)).setMeasureOffsetY(iDp);
                                    }
                                    return;
                                }
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(0.0f);
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(0);
                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (!z) {
                                    ChatAttachAlert.this.botMainButtonTextView.setVisibility(8);
                                } else {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(8);
                                }
                                int iDp = z ? AndroidUtilities.dp(36.0f) : 0;
                                for (int i3 = 0; i3 < ChatAttachAlert.this.botAttachLayouts.size(); i3++) {
                                    ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i3)).setMeasureOffsetY(iDp);
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

        public static void m2157$r8$lambda$jlfGBgZH3a8Rg2pp0tjd8Al3AU(AnonymousClass1 anonymousClass1, ValueAnimator valueAnimator) {
            anonymousClass1.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(1.0f - fFloatValue);
            ChatAttachAlert.this.botMainButtonTextView.setAlpha(fFloatValue);
            ChatAttachAlert.this.botMainButtonOffsetY = fFloatValue * AndroidUtilities.dp(36.0f);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.buttonsRecyclerViewWrapper.setTranslationY(chatAttachAlert.botMainButtonOffsetY);
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
            return MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).botInAttachMenu(this.val$id) || MessagesController.getInstance(ChatAttachAlert.this.currentAccount).whitelistedBots.contains(Long.valueOf(this.val$id));
        }
    }

    public boolean checkCaption(CharSequence charSequence) {
        BaseFragment baseFragment = this.baseFragment;
        if (!(baseFragment instanceof ChatActivity)) {
            return false;
        }
        return ChatActivityEnterView.checkPremiumAnimatedEmoji(this.currentAccount, ((ChatActivity) baseFragment).getDialogId(), this.baseFragment, this.sizeNotifierFrameLayout, charSequence);
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
        this.buttonsRecyclerViewWrapper.setVisibility(8);
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

    public long getDialogId() {
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            return ((ChatActivity) baseFragment).getDialogId();
        }
        return this.dialogId;
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        AttachAlertLayout attachAlertLayout;
        if (i == 0) {
            checkUi_writeButtonContainerY();
            checkUi_bottomFade();
            return;
        }
        if (i == 2) {
            checkUi_bottomFade();
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
            if (chatAttachAlertPollLayout != null && ((attachAlertLayout = this.nextAttachLayout) == chatAttachAlertPollLayout || this.currentAttachLayout == chatAttachAlertPollLayout)) {
                updateSelectedPosition(attachAlertLayout == chatAttachAlertPollLayout ? 1 : 0);
            }
            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
            if (chatAttachAlertPollLayout2 != null) {
                AttachAlertLayout attachAlertLayout2 = this.nextAttachLayout;
                if (attachAlertLayout2 == chatAttachAlertPollLayout2 || this.currentAttachLayout == chatAttachAlertPollLayout2) {
                    updateSelectedPosition(attachAlertLayout2 != chatAttachAlertPollLayout2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            checkUi_bottomFade();
            return;
        }
        if (i == 3) {
            checkUi_moveCaptionButtonVisibility();
            return;
        }
        if (i == 4) {
            checkUi_moveCaptionButtonVisibility();
            return;
        }
        if (i == 5) {
            checkUi_moveCaptionButtonVisibility();
            ChatActivityEnterView.SendButton sendButton = this.writeButton;
            if (sendButton != null) {
                sendButton.setEphemeralFactor(f);
                this.writeButton.setSameWidthFactor(f);
            }
        }
    }

    public void checkUi_moveCaptionButtonVisibility() {
        float floatValue = this.animatorCaptionNotEmpty.getFloatValue();
        float floatValue2 = this.animatorToggleCaptionSupported.getFloatValue();
        FragmentFloatingButton.setAnimatedVisibility(this.moveCaptionButton, floatValue * floatValue2 * FBool.not(this.animatorEphemeralMessageVisibility.getFloatValue()) * (this.restrictEphemeralMessageTypes ? 0.0f : 1.0f));
    }

    public interface ChatAttachViewDelegate {
        void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2);

        void didSelectBot(TLRPC.User user);

        void doOnIdle(Runnable runnable);

        boolean needEnterComment();

        void onCameraOpened();

        void onWallpaperSelected(Object obj);

        void openAvatarsSearch();

        boolean selectItemOnClicking();

        void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2);

        public abstract class CC {
            public static void $default$didSelectBot(ChatAttachViewDelegate chatAttachViewDelegate, TLRPC.User user) {
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

            public static void $default$sendAudio(ChatAttachViewDelegate chatAttachViewDelegate, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
            }
        }
    }

    public void updateDoneItemEnabled() {
        TextView textView = this.doneItem;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        textView.setEnabled(attachAlertLayout == null ? false : attachAlertLayout.isDoneItemEnabled());
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        float f = 0.0f;
        if (attachAlertLayout2 != null) {
            f = 0.0f + ((attachAlertLayout2.isDoneItemEnabled() ? 1.0f : 0.5f) * (this.nextAttachLayout == null ? 1.0f : this.translationProgress));
        }
        AttachAlertLayout attachAlertLayout3 = this.nextAttachLayout;
        if (attachAlertLayout3 != null) {
            f += (attachAlertLayout3.isDoneItemEnabled() ? 1.0f : 0.5f) * (1.0f - this.translationProgress);
        }
        this.doneItemAlphaByEnabled = f;
        checkUi_doneItemVisibility();
    }

    private void checkUi_doneItemVisibility() {
        TextView textView = this.doneItem;
        if (textView != null) {
            float f = this.doneItemAlphaByEnabled * this.doneItemAlphaByLayout;
            textView.setAlpha(f);
            this.doneItem.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    public static class AttachAlertLayout extends FrameLayout {
        protected IBlur3Capture iBlur3Capture;
        protected View iBlur3CaptureView;
        protected int listPaddingBottom;
        protected boolean occupyNavigationBar;
        protected boolean occupyStatusBar;
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

        public boolean disableBottomFade() {
            return false;
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

        public IBlur3Capture getIBlur3Capture() {
            return null;
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

        public boolean isDoneItemEnabled() {
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

        public boolean sendSelectedItems(boolean z, int i, int i2, long j, boolean z2) {
            return false;
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

    private static abstract class AttachButtonBase extends FrameLayout {
        protected GlassTabView glassTabView;

        public AttachButtonBase(Context context) {
            super(context);
        }
    }

    class AttachButton extends AttachButtonBase {
        private int currentId;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        public AttachButton(Context context) {
            super(context);
            setWillNotDraw(false);
            setFocusable(true);
            GlassTabView glassTabViewCreateAttachTab = GlassTabView.createAttachTab(context, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            this.glassTabView = glassTabViewCreateAttachTab;
            addView(glassTabViewCreateAttachTab, LayoutHelper.createFrame(-1, -1.0f));
        }

        void updateCheckedState(boolean z) {
            this.glassTabView.setSelected(((long) this.currentId) == ChatAttachAlert.this.selectedId, z);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        public void setTextAndIcon(int i, CharSequence charSequence, GlassTabView.TabAnimation tabAnimation) {
            this.glassTabView.setText(charSequence);
            this.glassTabView.setTabAnimation(tabAnimation);
            this.currentId = i;
        }
    }

    class AttachBotButton extends AttachButtonBase {
        private TLRPC.TL_attachMenuBot attachMenuBot;
        private TLRPC.User currentUser;

        public AttachBotButton(Context context) {
            super(context);
            setWillNotDraw(false);
            setFocusable(true);
            setFocusableInTouchMode(true);
            GlassTabView glassTabViewCreateAttachBotTab = GlassTabView.createAttachBotTab(context, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            this.glassTabView = glassTabViewCreateAttachBotTab;
            glassTabViewCreateAttachBotTab.getBackupImageView().imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                @Override
                public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                    ChatAttachAlert.AttachBotButton.m2158$r8$lambda$Q4NR2NsLg9EoXirNGvADBmdOEU(imageReceiver, z, z2, z3);
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
            addView(this.glassTabView, LayoutHelper.createFrame(-1, -1.0f));
        }

        public static void m2158$r8$lambda$Q4NR2NsLg9EoXirNGvADBmdOEU(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
            Drawable drawable = imageReceiver.getDrawable();
            if (drawable instanceof RLottieDrawable) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                rLottieDrawable.setCustomEndFrame(0);
                rLottieDrawable.stop();
                rLottieDrawable.setProgress(0.0f, false);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        void updateCheckedState(boolean z) {
            boolean z2 = this.attachMenuBot != null && (-this.currentUser.id) == ChatAttachAlert.this.selectedId;
            this.glassTabView.setSelected(z2, z);
            RLottieDrawable lottieAnimation = this.glassTabView.getBackupImageView().getImageReceiver().getLottieAnimation();
            if (!z) {
                if (lottieAnimation != null) {
                    lottieAnimation.stop();
                    lottieAnimation.setProgress(0.0f, false);
                    return;
                }
                return;
            }
            if (!z2 || lottieAnimation == null) {
                return;
            }
            lottieAnimation.setAutoRepeat(0);
            lottieAnimation.setCustomEndFrame(-1);
            lottieAnimation.setProgress(0.0f, false);
            lottieAnimation.start();
        }

        public void setUser(TLRPC.User user) {
            if (user == null) {
                return;
            }
            this.glassTabView.setAttachBotUser(user, ChatAttachAlert.this.currentAccount);
            this.currentUser = user;
            this.attachMenuBot = null;
            this.glassTabView.setSelected(false, false);
            invalidate();
        }

        public void setAttachBot(TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
            if (user == null || tL_attachMenuBot == null) {
                return;
            }
            this.glassTabView.setAttachBot(user, tL_attachMenuBot, ChatAttachAlert.this.currentAccount);
            this.currentUser = user;
            this.attachMenuBot = tL_attachMenuBot;
            this.glassTabView.setSelected(false, false);
            invalidate();
        }
    }

    public ChatAttachAlert(Context context, BaseFragment baseFragment, boolean z, boolean z2) {
        this(context, baseFragment, z, z2, true, null);
    }

    public ChatAttachAlert(final Context context, final BaseFragment baseFragment, boolean z, final boolean z2, boolean z3, final Theme.ResourcesProvider resourcesProvider) {
        TextView textView;
        int i;
        super(context, false, resourcesProvider);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorCaptionAbove = new BoolAnimator(0, this, cubicBezierInterpolator, 380L);
        this.animatorCaptionVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L);
        this.animatorActionBarVisible = new BoolAnimator(2, this, cubicBezierInterpolator, 380L);
        this.animatorCaptionNotEmpty = new BoolAnimator(3, this, cubicBezierInterpolator, 380L);
        this.animatorToggleCaptionSupported = new BoolAnimator(4, this, cubicBezierInterpolator, 380L, true);
        this.animatorEphemeralMessageVisibility = new BoolAnimator(5, this, cubicBezierInterpolator, 320L);
        ReplaceAnimator replaceAnimator = new ReplaceAnimator(new ReplaceAnimator.Callback() {
            @Override
            public boolean hasChanges(ReplaceAnimator replaceAnimator2) {
                return ReplaceAnimator.Callback.CC.$default$hasChanges(this, replaceAnimator2);
            }

            @Override
            public boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator2, float f) {
                return ReplaceAnimator.Callback.CC.$default$onApplyMetadataAnimation(this, replaceAnimator2, f);
            }

            @Override
            public void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator2, boolean z4) {
                ReplaceAnimator.Callback.CC.$default$onFinishMetadataAnimation(this, replaceAnimator2, z4);
            }

            @Override
            public void onForceApplyChanges(ReplaceAnimator replaceAnimator2) {
                ReplaceAnimator.Callback.CC.$default$onForceApplyChanges(this, replaceAnimator2);
            }

            @Override
            public final void onItemChanged(ReplaceAnimator replaceAnimator2) {
                this.f$0.onCurrentLayoutAnimatorChanged(replaceAnimator2);
            }

            @Override
            public void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator2) {
                ReplaceAnimator.Callback.CC.$default$onPrepareMetadataAnimation(this, replaceAnimator2);
            }
        }, cubicBezierInterpolator, 380L);
        this.animatorCurrentVisibleLayout = replaceAnimator;
        this.canOpenPreview = false;
        this.isSoundPicker = false;
        this.isStoryLocationPicker = false;
        this.isBizLocationPicker = false;
        this.isLocationPicker = false;
        this.isStoryAudioPicker = false;
        this.translationProgress = 0.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION = new AnimationProperties.FloatProperty("translation") {
            @Override
            public void setValue(AttachAlertLayout attachAlertLayout, float f) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.translationProgress = f;
                if (chatAttachAlert.nextAttachLayout == null) {
                    return;
                }
                if ((ChatAttachAlert.this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                    int iMax = Math.max(ChatAttachAlert.this.nextAttachLayout.getWidth(), ChatAttachAlert.this.currentAttachLayout.getWidth());
                    if (ChatAttachAlert.this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX((-iMax) * f);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((1.0f - f) * iMax);
                    } else {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX(iMax * f);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((-iMax) * (1.0f - f));
                    }
                } else {
                    ChatAttachAlert.this.nextAttachLayout.setAlpha(f);
                    ChatAttachAlert.this.nextAttachLayout.onHideShowProgress(f);
                    if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout) {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.updateSelectedPosition(chatAttachAlert2.nextAttachLayout == ChatAttachAlert.this.pollLayout ? 1 : 0);
                    }
                    if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.todoLayout || ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout) {
                        ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
                        chatAttachAlert3.updateSelectedPosition(chatAttachAlert3.nextAttachLayout == ChatAttachAlert.this.todoLayout ? 1 : 0);
                    }
                    ChatAttachAlert.this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) * f);
                    ChatAttachAlert.this.currentAttachLayout.onHideShowProgress(1.0f - Math.min(1.0f, f / 0.7f));
                    ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                }
                if (ChatAttachAlert.this.viewChangeAnimator != null) {
                    ChatAttachAlert.this.updateSelectedPosition(1);
                }
                ChatAttachAlert.this.blur3_InvalidateBlur();
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }

            @Override
            public Float get(AttachAlertLayout attachAlertLayout) {
                return Float.valueOf(ChatAttachAlert.this.translationProgress);
            }
        };
        this.allowLivePhotos = false;
        this.layouts = new AttachAlertLayout[11];
        this.botAttachLayouts = new LongSparseArray();
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
        this.todoEnabled = true;
        this.plainTextEnabled = true;
        this.maxSelectedPhotos = -1;
        this.allowOrder = true;
        this.attachItemSize = AndroidUtilities.dp(85.0f);
        this.decelerateInterpolator = new DecelerateInterpolator();
        this.scrollOffsetY = new int[2];
        this.attachButtonPaint = new Paint(1);
        this.captionLimitBulletinShown = false;
        this.exclusionRects = new ArrayList();
        this.exclustionRect = new Rect();
        this.ATTACH_ALERT_PROGRESS = new AnimationProperties.FloatProperty("openProgress") {
            private float openProgress;

            @Override
            public void setValue(ChatAttachAlert chatAttachAlert, float f) {
                float interpolation;
                int childCount = ChatAttachAlert.this.buttonsRecyclerView.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    float f2 = (3 - i3) * 32.0f;
                    View childAt = ChatAttachAlert.this.buttonsRecyclerView.getChildAt(i3);
                    if (f > f2) {
                        float f3 = f - f2;
                        if (f3 <= 200.0f) {
                            float f4 = f3 / 200.0f;
                            interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f4) * 1.1f;
                            childAt.setAlpha(CubicBezierInterpolator.EASE_BOTH.getInterpolation(f4));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f5 = f3 - 200.0f;
                            interpolation = f5 <= 100.0f ? 1.1f - (CubicBezierInterpolator.EASE_IN.getInterpolation(f5 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        interpolation = 0.0f;
                    }
                    if (childAt instanceof AttachButtonBase) {
                        ((AttachButtonBase) childAt).glassTabView.setAttachScale(interpolation);
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
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        RectF rectF3 = new RectF();
        this.iBlur3PositionFastScroll = rectF3;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        arrayList.add(rectF3);
        this.iBlur3PositionsMerged = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        boolean z4 = baseFragment instanceof ChatActivity;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ChatAttachAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -2);
                    }
                }
            });
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode2;
            blurredBackgroundSourceRenderNode2.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ChatAttachAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -3);
                    }
                }
            });
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
            this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryFrostedLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.iBlur3FactoryFade = blurredBackgroundDrawableViewFactory3;
        this.iBlur3Capture = new IBlur3Capture() {
            @Override
            public final void capture(Canvas canvas, RectF rectF4) {
                ChatAttachAlert.m2155$r8$lambda$x5I8ghpSRep5DF7z5acXsneI9c(this.f$0, canvas, rectF4);
            }

            @Override
            public void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF4) {
                iBlur3Hash.unsupported();
            }
        };
        this.forceDarkTheme = z;
        this.showingFromDialog = z2;
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
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
        this.sizeNotifierFrameLayout = anonymousClass5;
        anonymousClass5.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
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
            @Override
            public void setVisibility(int i4) {
                super.setVisibility(i4);
                ChatAttachAlert.this.checkUi_fadeTopAlpha();
            }

            @Override
            public void setAlpha(float f) {
                float alpha = getAlpha();
                super.setAlpha(f);
                if (alpha != f) {
                    TextView textView2 = ChatAttachAlert.this.selectedTextView;
                    if (textView2 != null) {
                        float f2 = 1.0f - f;
                        textView2.setAlpha(f2);
                        ChatAttachAlert.this.selectedTextView.setVisibility(f2 > 0.0f ? 0 : 8);
                    }
                    ChatAttachAlert.this.checkUi_fadeTopAlpha();
                    ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
                    if (ChatAttachAlert.this.frameLayout2 != null) {
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        if (chatAttachAlert.buttonsRecyclerViewWrapper != null) {
                            if (chatAttachAlert.frameLayout2.getTag() == null) {
                                if (ChatAttachAlert.this.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons()) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(1.0f - f);
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setTranslationY(AndroidUtilities.dp(44.0f) * f);
                                }
                                ChatAttachAlert.this.frameLayout2.setTranslationY(AndroidUtilities.dp(48.0f) * f);
                                return;
                            }
                            if (ChatAttachAlert.this.currentAttachLayout == null) {
                                float f3 = f == 0.0f ? 1.0f : 0.0f;
                                if (ChatAttachAlert.this.buttonsRecyclerViewWrapper.getAlpha() != f3) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(f3);
                                }
                            }
                        }
                    }
                }
            }
        };
        this.actionBar = actionBar;
        actionBar.alwaysApplyColorFilterToBackButton();
        this.actionBar.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        ActionBar actionBar2 = this.actionBar;
        int i4 = Theme.key_dialogTextBlack;
        actionBar2.setItemsColor(getThemedColor(i4), false);
        ActionBar actionBar3 = this.actionBar;
        int i5 = Theme.key_dialogButtonSelector;
        actionBar3.setItemsBackgroundColor(getThemedColor(i5), false);
        this.actionBar.setTitleColor(getThemedColor(i4));
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setAlpha(0.0f);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i6) {
                if (i6 == -1) {
                    if (ChatAttachAlert.this.currentAttachLayout.onBackPressed()) {
                        return;
                    }
                    ChatAttachAlert.this.dismiss();
                    return;
                }
                ChatAttachAlert.this.currentAttachLayout.onMenuItemClick(i6);
            }
        });
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, getThemedColor(i4), false, resourcesProvider);
        this.selectedMenuItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        ActionBarMenuItem actionBarMenuItem2 = this.selectedMenuItem;
        int i6 = R.drawable.ic_ab_other;
        actionBarMenuItem2.setIcon(i6);
        ActionBarMenuItem actionBarMenuItem3 = this.selectedMenuItem;
        int i7 = R.string.AccDescrMoreOptions;
        actionBarMenuItem3.setContentDescription(LocaleController.getString(i7));
        this.selectedMenuItem.setVisibility(4);
        this.selectedMenuItem.setAlpha(0.0f);
        this.selectedMenuItem.setScaleX(0.6f);
        this.selectedMenuItem.setScaleY(0.6f);
        this.selectedMenuItem.setSubMenuOpenSide(2);
        this.selectedMenuItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i8) {
                this.f$0.actionBar.getActionBarMenuOnItemClick().onItemClick(i8);
            }
        });
        this.selectedMenuItem.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        this.selectedMenuItem.setTranslationX(AndroidUtilities.dp(1.0f));
        this.selectedMenuItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i5), 6));
        this.selectedMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.selectedMenuItem.toggleSubMenu();
            }
        });
        ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem(context, null, 0, getThemedColor(i4), false, resourcesProvider);
        this.motionItem = actionBarMenuItem4;
        actionBarMenuItem4.setLongClickEnabled(false);
        ActionBarMenuItem actionBarMenuItem5 = this.motionItem;
        MotionPhotoDrawable motionPhotoDrawable = new MotionPhotoDrawable();
        this.motionIcon = motionPhotoDrawable;
        actionBarMenuItem5.setIcon(motionPhotoDrawable);
        this.motionItem.setContentDescription(LocaleController.getString(i7));
        this.motionItem.setVisibility(8);
        this.motionItem.setAlpha(0.0f);
        this.motionItem.setScaleX(0.6f);
        this.motionItem.setScaleY(0.6f);
        this.motionItem.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        this.motionItem.setTranslationX(-AndroidUtilities.dp(3.0f));
        this.motionItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i5), 6));
        this.motionItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.m2149$r8$lambda$kZgc3zq2gMWBNqYfuEtk9BhQQI(this.f$0, view);
            }
        });
        TextView textView2 = new TextView(context) {
            Paint p = new Paint(1);

            @Override
            protected void onDraw(Canvas canvas) {
                this.p.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_featuredStickers_addButton));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.p);
                super.onDraw(canvas);
            }
        };
        textView2.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        textView2.setText(LocaleController.getString(R.string.Create));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 14.0f);
        textView2.setVisibility(4);
        textView2.setAlpha(0.0f);
        textView2.setGravity(17);
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setTranslationX(-AndroidUtilities.dp(12.0f));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.$r8$lambda$Bx20EyZFzQmYxOalN0J1inPx_Jk(this.f$0, view);
            }
        });
        ScaleStateListAnimator.apply(textView2);
        this.doneItem = textView2;
        updateDoneItemEnabled();
        if (baseFragment != null) {
            textView = textView2;
            i = 4;
            ActionBarMenuItem actionBarMenuItem6 = new ActionBarMenuItem(context, null, 0, getThemedColor(i4), false, resourcesProvider);
            this.searchItem = actionBarMenuItem6;
            actionBarMenuItem6.setLongClickEnabled(false);
            this.searchItem.setIcon(R.drawable.outline_header_search);
            this.searchItem.setContentDescription(LocaleController.getString(R.string.Search));
            this.searchItem.setVisibility(4);
            this.searchItem.setAlpha(0.0f);
            this.searchItem.setTranslationX(-AndroidUtilities.dp(42.0f));
            this.searchItem.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i5), 6));
            this.searchItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatAttachAlert.$r8$lambda$sv4_pwE_a1VSjs6JkaaPOWwpplg(this.f$0, z2, view);
                }
            });
        } else {
            textView = textView2;
            i = 4;
        }
        ActionBarMenuItem actionBarMenuItem7 = new ActionBarMenuItem(context, null, 0, getThemedColor(i4), false, resourcesProvider);
        this.optionsItem = actionBarMenuItem7;
        actionBarMenuItem7.setLongClickEnabled(false);
        this.optionsItem.setIcon(i6);
        this.optionsItem.setContentDescription(LocaleController.getString(i7));
        this.optionsItem.setVisibility(8);
        this.optionsItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i5), 3));
        this.optionsItem.addSubItem(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.m2156$r8$lambda$xhISNtOk_T0lREcznX8rMM8Tpo(this.f$0, resourcesProvider, view);
            }
        });
        this.optionsItem.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        this.optionsItem.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        this.optionsItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.optionsItem.toggleSubMenu();
            }
        });
        FrameLayout frameLayout = new FrameLayout(context) {
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
                ChatAttachAlert chatAttachAlert = this.f$0;
                chatAttachAlert.updatePhotoPreview(chatAttachAlert.currentAttachLayout != chatAttachAlert.photoPreviewLayout);
            }
        });
        this.headerView.setAlpha(0.0f);
        this.headerView.setVisibility(i);
        LinearLayout linearLayout = new LinearLayout(context);
        this.selectedView = linearLayout;
        linearLayout.setOrientation(0);
        this.selectedView.setGravity(16);
        TextView textView3 = new TextView(context);
        this.selectedTextView = textView3;
        textView3.setTextColor(getThemedColor(i4));
        this.selectedTextView.setTextSize(1, 16.0f);
        this.selectedTextView.setTypeface(AndroidUtilities.bold());
        this.selectedTextView.setGravity(19);
        this.selectedTextView.setMaxLines(1);
        this.selectedTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.selectedView.addView(this.selectedTextView, LayoutHelper.createLinear(-2, -2, 16));
        this.selectedArrowImageView = new ImageView(context);
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i4);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        this.selectedArrowImageView.setImageDrawable(drawableMutate);
        this.selectedArrowImageView.setVisibility(8);
        this.selectedView.addView(this.selectedArrowImageView, LayoutHelper.createLinear(-2, -2, 16, 4, 1, 0, 0));
        this.selectedView.setAlpha(1.0f);
        this.headerView.addView(this.selectedView, LayoutHelper.createFrame(-2, -1.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.mediaPreviewView = linearLayout2;
        linearLayout2.setOrientation(0);
        this.mediaPreviewView.setGravity(16);
        ImageView imageView = new ImageView(context);
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        imageView.setImageDrawable(drawableMutate2);
        this.mediaPreviewView.addView(imageView, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 4, 0));
        TextView textView4 = new TextView(context);
        this.mediaPreviewTextView = textView4;
        textView4.setTextColor(getThemedColor(i4));
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
        ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(context);
        this.fadeView = chatActivityFadeView;
        chatActivityFadeView.setup(blurredBackgroundDrawableViewFactory3);
        this.fadeView.setFadeTopAlpha(0);
        this.fadeView.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        this.fadeView.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        this.fadeView.setFadeZoneTop(AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(5.0f));
        this.containerView.addView(this.fadeView, LayoutHelper.createFrameMatchParent());
        this.containerView.addView(this.headerView, LayoutHelper.createFrame(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            private final Path path = new Path();
            private final GradientClip clip = new GradientClip();

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float fDp = AndroidUtilities.dp(20.0f);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                this.path.rewind();
                this.path.addRoundRect(rectF4, fDp, fDp, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * getAlpha());
                canvas.clipPath(this.path);
                canvas.saveLayerAlpha(rectF4, 255, 31);
                super.dispatchDraw(canvas);
                rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + AndroidUtilities.dp(6.0f));
                this.clip.draw(canvas, rectF4, 1, 1.0f);
                rectF4.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                this.clip.draw(canvas, rectF4, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
        };
        this.topCommentContainer = frameLayout2;
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 55));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.containerView.addView(this.selectedMenuItem, LayoutHelper.createFrame(48, 48, 53));
        this.containerView.addView(this.motionItem, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem8 = this.searchItem;
        if (actionBarMenuItem8 != null) {
            this.containerView.addView(actionBarMenuItem8, LayoutHelper.createFrame(48, 48, 53));
        }
        ActionBarMenuItem actionBarMenuItem9 = this.optionsItem;
        if (actionBarMenuItem9 != null) {
            this.headerView.addView(actionBarMenuItem9, LayoutHelper.createFrame(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        }
        this.containerView.addView(textView, LayoutHelper.createFrame(-2, 48, 53));
        this.buttonsRecyclerViewWrapper = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i8, int i9) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.isPollAttach && chatAttachAlert.pollAllowedLayouts != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i8), (Integer.bitCount(ChatAttachAlert.this.pollAllowedLayouts) * AndroidUtilities.dp(80.0f)) + AndroidUtilities.dp(36.0f)), 1073741824), i9);
                } else {
                    super.onMeasure(i8, i9);
                }
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                ChatAttachAlert.this.currentAttachLayout.onButtonsTranslationYUpdated();
            }
        };
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            private final BoolAnimator hasFadeLeft;
            private final BoolAnimator hasFadeRight;
            private boolean mHasFadeLeft;
            private boolean mHasFadeRight;
            private final Paint paintLeft;
            private final Paint paintRight;
            private final Shader shaderLeft;
            private final Shader shaderRight;

            {
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.hasFadeLeft = new BoolAnimator(this, cubicBezierInterpolator2, 320L);
                this.hasFadeRight = new BoolAnimator(this, cubicBezierInterpolator2, 320L);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode);
                this.shaderLeft = linearGradient;
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode);
                this.shaderRight = linearGradient2;
                Paint paint = new Paint(1);
                this.paintLeft = paint;
                Paint paint2 = new Paint(1);
                this.paintRight = paint2;
                paint.setShader(linearGradient);
                PorterDuff.Mode mode2 = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode2));
                paint2.setShader(linearGradient2);
                paint2.setXfermode(new PorterDuffXfermode(mode2));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                this.mHasFadeRight = false;
                this.mHasFadeLeft = false;
                super.dispatchDraw(canvas);
                this.hasFadeLeft.setValue(this.mHasFadeLeft, true);
                this.hasFadeRight.setValue(this.mHasFadeRight, true);
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                float x = view.getX();
                float width = view.getWidth() + x;
                boolean z5 = true;
                boolean z6 = x < ((float) AndroidUtilities.dp(10.0f));
                boolean z7 = width > ((float) (getMeasuredWidth() - AndroidUtilities.dp(10.0f)));
                if (!z6 && !z7) {
                    z5 = false;
                }
                this.mHasFadeLeft |= z6;
                this.mHasFadeRight |= z7;
                canvas.save();
                if (z5) {
                    canvas.clipRect(AndroidUtilities.dp(19.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(19.0f), getMeasuredHeight());
                }
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                if (z6) {
                    float fDp = AndroidUtilities.dp(11.0f);
                    canvas.saveLayer(fDp, getPaddingTop(), AndroidUtilities.dp(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(fDp - (AndroidUtilities.dp(8.0f) * (1.0f - this.hasFadeLeft.getFloatValue())), 0.0f);
                    canvas.drawPaint(this.paintLeft);
                    canvas.restore();
                    canvas.restore();
                }
                if (z7) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(measuredWidth + (AndroidUtilities.dp(8.0f) * (1.0f - this.hasFadeRight.getFloatValue())), 0.0f);
                    canvas.drawPaint(this.paintRight);
                    canvas.restore();
                    canvas.restore();
                }
                return zDrawChild;
            }

            @Override
            protected void onMeasure(int i8, int i9) {
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i8) - getPaddingLeft()) - getPaddingRight();
                float fMeasureAttachTabWidth = 0.0f;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt instanceof AttachButtonBase) {
                        fMeasureAttachTabWidth += ((AttachButtonBase) childAt).glassTabView.measureAttachTabWidth();
                    }
                }
                float f = size;
                int iFloor = (f <= fMeasureAttachTabWidth || childCount <= 0) ? 0 : (int) Math.floor((f - fMeasureAttachTabWidth) / childCount);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = getChildAt(i11);
                    if (childAt2 instanceof AttachButtonBase) {
                        ((AttachButtonBase) childAt2).glassTabView.setAdditionalWidth(iFloor);
                    }
                }
                super.onMeasure(i8, i9);
            }
        };
        this.buttonsRecyclerView = recyclerListView;
        recyclerListView.setClipChildren(true);
        this.buttonsRecyclerView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.buttonsRecyclerView;
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(context);
        this.buttonsAdapter = buttonsAdapter;
        recyclerListView2.setAdapter(buttonsAdapter);
        RecyclerListView recyclerListView3 = this.buttonsRecyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.buttonsLayoutManager = linearLayoutManager;
        recyclerListView3.setLayoutManager(linearLayoutManager);
        this.buttonsRecyclerView.setVerticalScrollBarEnabled(false);
        this.buttonsRecyclerView.setHorizontalScrollBarEnabled(false);
        this.buttonsRecyclerView.setItemAnimator(null);
        this.buttonsRecyclerView.setLayoutAnimation(null);
        this.buttonsRecyclerView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.buttonsRecyclerView.setAdaptiveOverScroll();
        this.iBlur3FactoryLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.iBlur3FactoryFrostedLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        blurredBackgroundDrawableViewFactory3.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.bottomFadeView = new View(context) {
            @Override
            protected void onSizeChanged(int i8, int i9, int i10, int i11) {
                super.onSizeChanged(i8, i9, i10, i11);
                ChatAttachAlert.this.bottomFadeDrawable.setBounds(0, (i9 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i8, i9);
            }

            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
                ChatAttachAlert.this.bottomFadeDrawable.draw(canvas);
            }
        };
        this.bottomFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory3.create(this.bottomFadeView, (BlurredBackgroundColorProvider) null));
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        this.bottomFadeDrawable.setFadeHeight(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(this.bottomFadeView, LayoutHelper.createFrameMatchParent());
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryLiquidGlass.create(this.buttonsRecyclerViewWrapper, BlurredBackgroundProviderImpl.mainTabs(resourcesProvider));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(28.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.0f));
        this.buttonsRecyclerViewWrapper.setBackground(blurredBackgroundDrawableCreate);
        this.buttonsRecyclerView.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        this.buttonsRecyclerView.setClipToOutline(true);
        this.buttonsRecyclerView.setOutlineProvider(ViewOutlineProviderImpl.boundsWithPaddingRoundRect(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(28.0f)));
        this.buttonsRecyclerView.setImportantForAccessibility(1);
        this.buttonsRecyclerViewWrapper.addView(this.buttonsRecyclerView, LayoutHelper.createFrameMatchParent());
        this.containerView.addView(this.buttonsRecyclerViewWrapper, LayoutHelper.createFrame(-1, 70, 81));
        this.buttonsRecyclerView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i8) {
                ChatAttachAlert.m2152$r8$lambda$qXIHkUrgR5iMzperioi89jQqH0(this.f$0, resourcesProvider, view, i8);
            }
        });
        this.buttonsRecyclerView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i8) {
                return ChatAttachAlert.$r8$lambda$I2VDFtPSAgMfXsvrr9IuB8qKZUo(this.f$0, view, i8);
            }
        });
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, true);
        this.botMainButtonTextView = animatedTextView;
        animatedTextView.setVisibility(8);
        this.botMainButtonTextView.setAlpha(0.0f);
        this.botMainButtonTextView.setGravity(17);
        this.botMainButtonTextView.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(16.0f);
        this.botMainButtonTextView.setPadding(iDp, 0, iDp, 0);
        this.botMainButtonTextView.setTextSize(AndroidUtilities.dp(14.0f));
        this.botMainButtonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.$r8$lambda$FhQRuxqYtOrjPTWqYE2ayya2naQ(this.f$0, view);
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
        ImageView imageView2 = new ImageView(context);
        this.moveCaptionButton = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.moveCaptionButton;
        int themedColor2 = getThemedColor(Theme.key_windowBackgroundWhiteGrayText2);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        this.moveCaptionButton.setImageResource(R.drawable.menu_link_above);
        this.moveCaptionButton.setVisibility(8);
        this.moveCaptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.m2139$r8$lambda$MIjeLv6TnwE7wJ4oQvrW6pYQI(this.f$0, view);
            }
        });
        this.frameLayout2 = new AnonymousClass17(context);
        FrameLayout frameLayout3 = new FrameLayout(context) {
            private int lastHeight;
            private final Path path = new Path();
            private final GradientClip clip = new GradientClip();

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (ChatAttachAlert.this.captionContainerBg != null) {
                    ChatAttachAlert.this.captionContainerBg.setBounds(0, (int) ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
                    ChatAttachAlert.this.captionContainerBg.draw(canvas);
                }
                float fDp = AndroidUtilities.dp(20.0f);
                int iDp2 = AndroidUtilities.dp(7.0f);
                int iDp3 = AndroidUtilities.dp(7.0f);
                RectF rectF4 = AndroidUtilities.rectTmp;
                float f = iDp2;
                rectF4.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), getHeight() - iDp3);
                this.path.rewind();
                this.path.addRoundRect(rectF4, fDp, fDp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.path);
                canvas.saveLayerAlpha(rectF4, 255, 31);
                super.dispatchDraw(canvas);
                rectF4.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), iDp2 + AndroidUtilities.dp(6.0f));
                this.clip.draw(canvas, rectF4, 1, 1.0f);
                rectF4.set(getPaddingLeft(), (getHeight() - iDp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - iDp3);
                this.clip.draw(canvas, rectF4, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }

            @Override
            protected void onLayout(boolean z5, int i8, int i9, int i10, int i11) {
                int top = this.lastHeight - ChatAttachAlert.this.aiButton.getTop();
                super.onLayout(z5, i8, i9, i10, i11);
                this.lastHeight = getHeight();
                if (ChatAttachAlert.this.aiButton.getVisibility() != 0 || getHeight() - ChatAttachAlert.this.aiButton.getTop() == top) {
                    return;
                }
                ChatAttachAlert.this.aiButton.setTranslationY(((getHeight() - ChatAttachAlert.this.aiButton.getTop()) - top) + ChatAttachAlert.this.aiButton.getTranslationY());
                ChatAttachAlert.this.aiButton.animate().translationY(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        };
        this.captionContainer = frameLayout3;
        this.frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = this.iBlur3FactoryFrostedLiquidGlass.create(this.sizeNotifierFrameLayout, BlurredBackgroundProviderImpl.inputFieldDialogActivity(resourcesProvider));
        this.emojiViewChildBg = blurredBackgroundDrawableCreate2;
        blurredBackgroundDrawableCreate2.enableInAppKeyboardOptimization();
        this.emojiViewChildBg.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.emojiViewChildBg.setThickness(AndroidUtilities.dp(32.0f));
        this.emojiViewChildBg.setIntensity(0.4f);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = this.iBlur3FactoryLiquidGlass.create(this.captionContainer, BlurredBackgroundProviderImpl.inputFieldDialogActivity(resourcesProvider));
        this.captionContainerBg = blurredBackgroundDrawableCreate3;
        blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(22.0f));
        this.captionContainerBg.setPadding(AndroidUtilities.dp(7.0f));
        this.captionContainer.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        this.frameLayout2.setWillNotDraw(false);
        this.frameLayout2.setVisibility(4);
        this.frameLayout2.setAlpha(0.0f);
        this.containerView.addView(this.frameLayout2, LayoutHelper.createFrame(-1, -2, 83));
        this.frameLayout2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ChatAttachAlert.$r8$lambda$ajAajr0t3B1zTNAXl2WKQMSJcro(view, motionEvent);
            }
        });
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.captionLimitView = animatedTextView2;
        animatedTextView2.setAllowCancel(true);
        animatedTextView2.setScaleProperty(0.6f);
        animatedTextView2.setVisibility(8);
        animatedTextView2.setTextSize(AndroidUtilities.dp(15.0f));
        int i8 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView2.setTextColor(getThemedColor(i8));
        animatedTextView2.setTypeface(AndroidUtilities.bold());
        animatedTextView2.setGravity(17);
        this.captionContainer.addView(animatedTextView2, LayoutHelper.createFrame(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.aiButton = imageView4;
        AiButtonDrawable aiButtonDrawable = new AiButtonDrawable(context);
        this.aiButtonIcon = aiButtonDrawable;
        imageView4.setImageDrawable(aiButtonDrawable);
        imageView4.setScaleType(scaleType);
        int i9 = Theme.key_glass_defaultIcon;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i9), mode));
        int i10 = Theme.key_listSelector;
        imageView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i10), 1, AndroidUtilities.dp(16.0f)));
        this.captionContainer.addView(imageView4, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        int i11 = R.string.AIEditor;
        imageView4.setContentDescription(LocaleController.getString(i11));
        ScaleStateListAnimator.apply(imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.$r8$lambda$X7_CmBWfXWXG1TyPgG3OdMaTBps(this.f$0, resourcesProvider, view);
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.currentLimit = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(context, this.sizeNotifierFrameLayout, null, 1, true, resourcesProvider);
        this.commentTextView = anonymousClass19;
        anonymousClass19.includeNavigationBar = true;
        int i12 = R.string.AddCaption;
        anonymousClass19.setHint(LocaleController.getString("AddCaption", i12));
        this.commentTextView.onResume();
        this.commentTextView.getEditText().setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        this.commentTextView.getEditText().addTextChangedListener(new TextWatcher() {
            private boolean processChange;
            private boolean wasEmpty;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
                if (i15 - i14 >= 1) {
                    this.processChange = true;
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.mentionContainer == null) {
                    chatAttachAlert.createMentionsContainer();
                }
                if (ChatAttachAlert.this.mentionContainer.getAdapter() != null) {
                    ChatAttachAlert.this.mentionContainer.setReversed(false);
                    ChatAttachAlert.this.mentionContainer.getAdapter().searchUsernameOrHashtag(charSequence, ChatAttachAlert.this.commentTextView.getEditText().getSelectionStart(), null, false, false);
                    ChatAttachAlert.this.updateCommentTextViewPosition();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean z5;
                int i13;
                if (this.wasEmpty != TextUtils.isEmpty(editable)) {
                    if (ChatAttachAlert.this.currentAttachLayout != null) {
                        ChatAttachAlert.this.currentAttachLayout.onSelectedItemsCountChanged(ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount());
                    }
                    this.wasEmpty = !this.wasEmpty;
                }
                boolean z6 = false;
                if (this.processChange) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, ChatAttachAlert.this.commentTextView.getEditText().getPaint().getFontMetricsInt(), false);
                    this.processChange = false;
                }
                ChatAttachAlert.this.codepointCount = Character.codePointCount(editable, 0, editable.length());
                ChatAttachAlert.this.animatorCaptionNotEmpty.setValue(ChatAttachAlert.this.codepointCount > 0, true);
                if (ChatAttachAlert.this.currentLimit <= 0 || (i13 = ChatAttachAlert.this.currentLimit - ChatAttachAlert.this.codepointCount) > 100) {
                    ChatAttachAlert.this.captionLimitView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlert.this.captionLimitView.setVisibility(8);
                        }
                    });
                    ChatAttachAlert.this.topCaptionLimitView.setAlpha(0.0f);
                    z5 = true;
                } else {
                    if (i13 < -9999) {
                        i13 = -9999;
                    }
                    long j = i13;
                    ChatAttachAlert.this.captionLimitView.setText(LocaleController.formatNumber(j, ','), ChatAttachAlert.this.captionLimitView.getVisibility() == 0);
                    if (ChatAttachAlert.this.captionLimitView.getVisibility() != 0) {
                        ChatAttachAlert.this.captionLimitView.setVisibility(0);
                        ChatAttachAlert.this.captionLimitView.setAlpha(0.0f);
                        ChatAttachAlert.this.captionLimitView.setScaleX(0.5f);
                        ChatAttachAlert.this.captionLimitView.setScaleY(0.5f);
                    }
                    ChatAttachAlert.this.captionLimitView.animate().setListener(null).cancel();
                    ChatAttachAlert.this.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i13 < 0) {
                        ChatAttachAlert.this.captionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_text_RedRegular));
                        z5 = false;
                    } else {
                        ChatAttachAlert.this.captionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                        z5 = true;
                    }
                    ChatAttachAlert.this.topCaptionLimitView.setText(LocaleController.formatNumber(j, ','), false);
                    ChatAttachAlert.this.topCaptionLimitView.setAlpha(1.0f);
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.sendButtonEnabled != z5) {
                    chatAttachAlert.sendButtonEnabled = z5;
                    chatAttachAlert.writeButton.invalidate();
                }
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                if (!chatAttachAlert2.captionAbove) {
                    if (chatAttachAlert2.commentTextView.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ChatAttachAlert.this.commentTextView.getText().toString().trim())) {
                        z6 = true;
                    }
                    chatAttachAlert2.showAiButton(z6);
                }
                ChatAttachAlert.this.checkIsEphemeralMessage(true);
            }
        });
        this.captionContainer.addView(this.commentTextView, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        this.captionContainer.setClipChildren(false);
        this.frameLayout2.setClipChildren(false);
        this.commentTextView.setClipChildren(false);
        this.topCommentContainer.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        this.topCommentContainer.setWillNotDraw(false);
        EditTextEmoji editTextEmoji = new EditTextEmoji(context, this.sizeNotifierFrameLayout, null, 1, true, resourcesProvider) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (!ChatAttachAlert.this.enterCommentEventSent) {
                    if (motionEvent.getX() > ChatAttachAlert.this.topCommentTextView.getEditText().getLeft() && motionEvent.getX() < ChatAttachAlert.this.topCommentTextView.getEditText().getRight() && motionEvent.getY() > ChatAttachAlert.this.topCommentTextView.getEditText().getTop() && motionEvent.getY() < ChatAttachAlert.this.topCommentTextView.getEditText().getBottom()) {
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        chatAttachAlert.makeFocusable(chatAttachAlert.topCommentTextView.getEditText(), true);
                    } else {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.makeFocusable(chatAttachAlert2.topCommentTextView.getEditText(), false);
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            protected void onLineCountChanged(int i13, int i14) {
                super.onLineCountChanged(i13, i14);
                ChatAttachAlert.this.updatedTopCaptionHeight();
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.captionAbove) {
                    chatAttachAlert.showAiButton(i14 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
                }
            }

            @Override
            protected void onLayout(boolean z5, int i13, int i14, int i15, int i16) {
                super.onLayout(z5, i13, i14, i15, i16);
                ChatAttachAlert.this.updatedTopCaptionHeight();
            }

            @Override
            protected void extendActionMode(ActionMode actionMode, Menu menu) {
                BaseFragment baseFragment2 = ChatAttachAlert.this.baseFragment;
                if (baseFragment2 instanceof ChatActivity) {
                    ChatActivity.fillActionModeMenu(menu, ((ChatActivity) baseFragment2).getCurrentEncryptedChat(), true, true);
                }
                super.extendActionMode(actionMode, menu);
            }

            @Override
            protected void createEmojiView() {
                super.createEmojiView();
                EmojiView emojiView = getEmojiView();
                if (emojiView != null) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                    emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
            }
        };
        this.topCommentTextView = editTextEmoji;
        editTextEmoji.includeNavigationBar = true;
        editTextEmoji.getEditText().addTextChangedListener(new TextWatcher() {
            private boolean processChange;
            private boolean wasEmpty;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
                if (i15 - i14 >= 1) {
                    this.processChange = true;
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.mentionContainer == null) {
                    chatAttachAlert.createMentionsContainer();
                }
                if (ChatAttachAlert.this.mentionContainer.getAdapter() != null) {
                    ChatAttachAlert.this.mentionContainer.setReversed(true);
                    ChatAttachAlert.this.mentionContainer.getAdapter().searchUsernameOrHashtag(charSequence, ChatAttachAlert.this.topCommentTextView.getEditText().getSelectionStart(), null, false, false);
                    ChatAttachAlert.this.updateCommentTextViewPosition();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean z5;
                int i13;
                if (this.wasEmpty != TextUtils.isEmpty(editable)) {
                    if (ChatAttachAlert.this.currentAttachLayout != null) {
                        ChatAttachAlert.this.currentAttachLayout.onSelectedItemsCountChanged(ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount());
                    }
                    this.wasEmpty = !this.wasEmpty;
                }
                boolean z6 = false;
                if (this.processChange) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji(editable, ChatAttachAlert.this.topCommentTextView.getEditText().getPaint().getFontMetricsInt(), false);
                    this.processChange = false;
                }
                ChatAttachAlert.this.codepointCount = Character.codePointCount(editable, 0, editable.length());
                ChatAttachAlert.this.animatorCaptionNotEmpty.setValue(ChatAttachAlert.this.codepointCount > 0, true);
                if (ChatAttachAlert.this.currentLimit <= 0 || (i13 = ChatAttachAlert.this.currentLimit - ChatAttachAlert.this.codepointCount) > 100) {
                    ChatAttachAlert.this.topCaptionLimitView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlert.this.topCaptionLimitView.setVisibility(8);
                        }
                    });
                    ChatAttachAlert.this.captionLimitView.setAlpha(0.0f);
                    z5 = true;
                } else {
                    if (i13 < -9999) {
                        i13 = -9999;
                    }
                    long j = i13;
                    ChatAttachAlert.this.topCaptionLimitView.setText(LocaleController.formatNumber(j, ','), ChatAttachAlert.this.topCaptionLimitView.getVisibility() == 0);
                    if (ChatAttachAlert.this.topCaptionLimitView.getVisibility() != 0) {
                        ChatAttachAlert.this.topCaptionLimitView.setVisibility(0);
                        ChatAttachAlert.this.topCaptionLimitView.setAlpha(0.0f);
                        ChatAttachAlert.this.topCaptionLimitView.setScaleX(0.5f);
                        ChatAttachAlert.this.topCaptionLimitView.setScaleY(0.5f);
                    }
                    ChatAttachAlert.this.topCaptionLimitView.animate().setListener(null).cancel();
                    ChatAttachAlert.this.topCaptionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i13 < 0) {
                        ChatAttachAlert.this.topCaptionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_text_RedRegular));
                        z5 = false;
                    } else {
                        ChatAttachAlert.this.topCaptionLimitView.setTextColor(ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                        z5 = true;
                    }
                    ChatAttachAlert.this.captionLimitView.setText(LocaleController.formatNumber(j, ','), false);
                    ChatAttachAlert.this.captionLimitView.setAlpha(1.0f);
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.sendButtonEnabled != z5) {
                    chatAttachAlert.sendButtonEnabled = z5;
                    chatAttachAlert.writeButton.invalidate();
                }
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                if (!chatAttachAlert2.captionLimitBulletinShown && !MessagesController.getInstance(chatAttachAlert2.currentAccount).premiumFeaturesBlocked() && !UserConfig.getInstance(ChatAttachAlert.this.currentAccount).isPremium() && ChatAttachAlert.this.codepointCount > MessagesController.getInstance(ChatAttachAlert.this.currentAccount).captionLengthLimitDefault && ChatAttachAlert.this.codepointCount < MessagesController.getInstance(ChatAttachAlert.this.currentAccount).captionLengthLimitPremium) {
                    ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
                    chatAttachAlert3.captionLimitBulletinShown = true;
                    chatAttachAlert3.showCaptionLimitBulletin(baseFragment);
                }
                ChatAttachAlert chatAttachAlert4 = ChatAttachAlert.this;
                if (chatAttachAlert4.captionAbove) {
                    if (chatAttachAlert4.topCommentTextView.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ChatAttachAlert.this.topCommentTextView.getText().toString().trim())) {
                        z6 = true;
                    }
                    chatAttachAlert4.showAiButton(z6);
                }
                ChatAttachAlert.this.checkIsEphemeralMessage(true);
            }
        });
        this.topCommentTextView.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        this.topCommentTextView.getEditText().setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        this.topCommentTextView.getEditText().setTextSize(1, 17.0f);
        this.topCommentTextView.getEmojiButton().setLayoutParams(LayoutHelper.createFrame(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.topCommentTextView.setHint(LocaleController.getString("AddCaption", i12));
        this.topCommentContainer.addView(this.topCommentTextView, LayoutHelper.createFrame(-1, -2, 119));
        this.topCommentContainer.setAlpha(0.0f);
        this.topCommentContainer.setVisibility(8);
        this.commentTextView.addView(this.moveCaptionButton, LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate4 = this.iBlur3FactoryLiquidGlass.create(this.topCommentContainer, BlurredBackgroundProviderImpl.inputFieldDialogActivity(resourcesProvider));
        blurredBackgroundDrawableCreate4.setRadius(AndroidUtilities.dp(22.0f));
        blurredBackgroundDrawableCreate4.setPadding(AndroidUtilities.dp(7.0f));
        this.topCommentContainer.setBackground(blurredBackgroundDrawableCreate4);
        this.topCommentContainer.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        AnimatedTextView animatedTextView3 = new AnimatedTextView(context);
        this.topCaptionLimitView = animatedTextView3;
        animatedTextView3.setScaleProperty(0.6f);
        animatedTextView3.setVisibility(8);
        animatedTextView3.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView3.setTextColor(getThemedColor(i8));
        animatedTextView3.setTypeface(AndroidUtilities.bold());
        animatedTextView3.setGravity(17);
        animatedTextView3.setAllowCancel(true);
        this.topCommentContainer.addView(animatedTextView3, LayoutHelper.createFrame(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        this.topCommentMoveButton = imageView5;
        imageView5.setScaleType(scaleType);
        this.topCommentMoveButton.setImageResource(R.drawable.menu_link_below);
        this.topCommentMoveButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_messagePanelIcons), mode2));
        this.topCommentTextView.addView(this.topCommentMoveButton, LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        this.topCommentMoveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.m2143$r8$lambda$R4KK8WxbkNdWJ37eLexM7mlbjU(this.f$0, view);
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.topAiButton = imageView6;
        AiButtonDrawable aiButtonDrawable2 = new AiButtonDrawable(context);
        this.topAiButtonIcon = aiButtonDrawable2;
        imageView6.setImageDrawable(aiButtonDrawable2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i9), mode));
        imageView6.setBackground(Theme.createSelectorDrawable(getThemedColor(i10), 1, AndroidUtilities.dp(16.0f)));
        this.topCommentContainer.addView(imageView6, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(i11));
        ScaleStateListAnimator.apply(imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.$r8$lambda$eNsKa5bakSUf4hUeoC32IIN8UCg(this.f$0, resourcesProvider, view);
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        FrameLayout frameLayout4 = new FrameLayout(context) {
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
        this.writeButtonContainer = frameLayout4;
        frameLayout4.setFocusable(true);
        this.writeButtonContainer.setFocusableInTouchMode(true);
        this.writeButtonContainer.setVisibility(4);
        this.writeButtonContainer.setScaleX(0.2f);
        this.writeButtonContainer.setScaleY(0.2f);
        this.writeButtonContainer.setAlpha(0.0f);
        this.writeButtonContainer.setClipChildren(false);
        this.writeButtonContainer.setClipToPadding(false);
        this.containerView.addView(this.writeButtonContainer, LayoutHelper.createFrame(110, 50, 85));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(context, R.drawable.send_plane_24, resourcesProvider) {
            @Override
            public boolean isOpen() {
                return true;
            }

            @Override
            public boolean shouldDrawBackground() {
                return true;
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
        sendButton.setImportantForAccessibility(2);
        this.writeButtonContainer.addView(this.writeButton, LayoutHelper.createFrame(-1, -1, 119));
        this.writeButton.setTranslationX(this.backgroundPaddingLeft);
        this.writeButton.setCircleSize(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(38.0f));
        this.writeButton.setCirclePadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
        ChatActivityEnterView.SendButton sendButton2 = this.writeButton;
        sendButton2.newCounterPos = true;
        sendButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.onWriteButtonPressed();
            }
        });
        this.writeButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return ChatAttachAlert.$r8$lambda$BBkoXQngtsbqesA1F92xuLnCs04(this.f$0, context, resourcesProvider, baseFragment, view);
            }
        });
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        View view = new View(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                String str = String.format("%d", Integer.valueOf(Math.max(1, ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount())));
                int iCeil = (int) Math.ceil(ChatAttachAlert.this.textPaint.measureText(str));
                int iMax = Math.max(AndroidUtilities.dp(16.0f) + iCeil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor3 = ChatAttachAlert.this.getThemedColor(Theme.key_dialogRoundCheckBoxCheck);
                ChatAttachAlert.this.textPaint.setColor(ColorUtils.setAlphaComponent(themedColor3, (int) (((double) Color.alpha(themedColor3)) * ((((double) ChatAttachAlert.this.sendButtonEnabledProgress) * 0.42d) + 0.58d))));
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_dialogBackground));
                int i13 = iMax / 2;
                int i14 = measuredWidth - i13;
                int i15 = i13 + measuredWidth;
                ChatAttachAlert.this.rect.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(ChatAttachAlert.this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ChatAttachAlert.this.paint);
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_chat_attachCheckBoxBackground));
                ChatAttachAlert.this.rect.set(i14 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), i15 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ChatAttachAlert.this.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ChatAttachAlert.this.paint);
                canvas.drawText(str, measuredWidth - (iCeil / 2), AndroidUtilities.dp(16.2f), ChatAttachAlert.this.textPaint);
            }
        };
        this.selectedCountView = view;
        view.setAlpha(0.0f);
        this.selectedCountView.setScaleX(0.2f);
        this.selectedCountView.setScaleY(0.2f);
        if (z) {
            checkColors();
            this.navBarColorKey = -1;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = this.photoLayout;
        if (chatAttachAlertPhotoLayout3 != null) {
            chatAttachAlertPhotoLayout3.gridView.getFastScroll().applyBlurDrawables(this.iBlur3FactoryLiquidGlass, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
        }
        PasscodeView passcodeView = new PasscodeView(context);
        this.passcodeView = passcodeView;
        this.containerView.addView(passcodeView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setupGlass(this.iBlur3FactoryLiquidGlass, new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() {
            @Override
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z5) {
                return ChatAttachAlert.$r8$lambda$YIAXGHoWjLDEYh1xpDeyOwOpzyk(this.f$0, resourcesProvider2, z5);
            }
        }).setStrokeColorTop(new BlurredBackgroundProviderBuilder.ColorProvider() {
            @Override
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z5) {
                return ChatAttachAlert.m2137$r8$lambda$JFuvbyhZmR6gkd84Oyl3s5Y(this.f$0, resourcesProvider2, z5);
            }
        }).setStrokeColorBottom(new BlurredBackgroundProviderBuilder.ColorProvider() {
            @Override
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z5) {
                return ChatAttachAlert.m2138$r8$lambda$JuCIGbOUgFeNpxVqRGDzkJprQA(this.f$0, resourcesProvider2, z5);
            }
        }).setShadowColor(new BlurredBackgroundProviderBuilder.ColorProvider() {
            @Override
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z5) {
                return ChatAttachAlert.$r8$lambda$UDSfsEPHPrd3oEgJ0CaN9t0zedM(this.f$0, resourcesProvider2, z5);
            }
        }).setShadowLayer(AndroidUtilities.dpf2(3.3333333f), 0.0f, AndroidUtilities.dpf2(0.6666667f)).setStrokeWidth(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(0.6666667f)).build());
        replaceAnimator.replace(1L, false);
    }

    public static void m2155$r8$lambda$x5I8ghpSRep5DF7z5acXsneI9c(ChatAttachAlert chatAttachAlert, Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        AttachAlertLayout attachAlertLayout;
        int i = 0;
        while (i < 2) {
            AttachAlertLayout attachAlertLayout2 = i == 0 ? chatAttachAlert.currentAttachLayout : chatAttachAlert.nextAttachLayout;
            if (attachAlertLayout2 == null || attachAlertLayout2.iBlur3Capture == null || attachAlertLayout2.getVisibility() != 0) {
                canvas2 = canvas;
                rectF2 = rectF;
            } else {
                canvas2 = canvas;
                rectF2 = rectF;
                Blur3Utils.captureRelativeParent(attachAlertLayout2.iBlur3Capture, canvas2, rectF2, attachAlertLayout2.iBlur3CaptureView, chatAttachAlert.getContainerView(), (int) (((i == 0 && (attachAlertLayout = chatAttachAlert.nextAttachLayout) != null && attachAlertLayout.getVisibility() == 0) ? attachAlertLayout2.getAlpha() * (1.0f - chatAttachAlert.nextAttachLayout.getAlpha()) : attachAlertLayout2.getAlpha()) * 255.0f));
            }
            i++;
            canvas = canvas2;
            rectF = rectF2;
        }
        chatAttachAlert.getClass();
    }

    class AnonymousClass5 extends SizeNotifierFrameLayout {
        AdjustPanLayoutHelper adjustPanLayoutHelper;
        private Bulletin.Delegate bulletinDelegate;
        private boolean ignoreLayout;
        private float initialTranslationY;
        private int lastNotifyWidth;
        private RectF rect;

        @Override
        public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        }

        AnonymousClass5(Context context) {
            super(context);
            this.bulletinDelegate = new Bulletin.Delegate() {
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

                @Override
                public int getBottomOffset(int i) {
                    return (AnonymousClass5.this.getHeight() - ChatAttachAlert.this.frameLayout2.getTop()) + AndroidUtilities.dp(52.0f);
                }
            };
            this.rect = new RectF();
            this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
                @Override
                protected void onTransitionStart(boolean z, int i) {
                    super.onTransitionStart(z, i);
                    if (ChatAttachAlert.this.previousScrollOffsetY > 0) {
                        int i2 = ChatAttachAlert.this.previousScrollOffsetY;
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        if (i2 == chatAttachAlert.scrollOffsetY[0] || !z) {
                            ChatAttachAlert.this.fromScrollY = -1.0f;
                        } else {
                            chatAttachAlert.fromScrollY = chatAttachAlert.previousScrollOffsetY;
                            ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                            chatAttachAlert2.toScrollY = chatAttachAlert2.scrollOffsetY[0];
                        }
                    } else {
                        ChatAttachAlert.this.fromScrollY = -1.0f;
                    }
                    AnonymousClass5.this.invalidate();
                    if ((ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertBotWebViewLayout) && !ChatAttachAlert.this.botButtonWasVisible) {
                        if (z) {
                            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(8);
                        } else {
                            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(0);
                        }
                    }
                    ChatAttachAlert.this.currentAttachLayout.onPanTransitionStart(z, i);
                }

                @Override
                protected void onTransitionEnd() {
                    super.onTransitionEnd();
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, false, 0);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.previousScrollOffsetY = chatAttachAlert2.scrollOffsetY[0];
                    ChatAttachAlert.this.currentAttachLayout.onPanTransitionEnd();
                    if (!(ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertBotWebViewLayout) || ChatAttachAlert.this.botButtonWasVisible) {
                        return;
                    }
                    int iDp = ((BottomSheet) ChatAttachAlert.this).keyboardVisible ? AndroidUtilities.dp(84.0f) : 0;
                    for (int i = 0; i < ChatAttachAlert.this.botAttachLayouts.size(); i++) {
                        ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i)).setMeasureOffsetY(iDp);
                    }
                }

                @Override
                protected void onPanTranslationUpdate(float f, float f2, boolean z) {
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
                    ActionBarMenuItem actionBarMenuItem2 = chatAttachAlert6.motionItem;
                    if (actionBarMenuItem2 != null) {
                        actionBarMenuItem2.setTranslationY(chatAttachAlert6.selectedMenuItem.getTranslationY());
                    }
                    if (ChatAttachAlert.this.motionHint != null) {
                        ChatAttachAlert.this.motionHint.setTranslationY(ChatAttachAlert.this.selectedMenuItem.getTranslationY());
                    }
                    ChatAttachAlert chatAttachAlert7 = ChatAttachAlert.this;
                    chatAttachAlert7.doneItem.setTranslationY(chatAttachAlert7.currentPanTranslationY);
                    ChatAttachAlert.this.updateSelectedPosition(0);
                    ChatAttachAlert chatAttachAlert8 = ChatAttachAlert.this;
                    chatAttachAlert8.setCurrentPanTranslationY(chatAttachAlert8.currentPanTranslationY);
                    AnonymousClass5.this.invalidate();
                    ChatAttachAlert.this.frameLayout2.invalidate();
                    ChatAttachAlert.this.updateCommentTextViewPosition();
                    if (ChatAttachAlert.this.currentAttachLayout != null) {
                        ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                    }
                }

                @Override
                protected boolean heightAnimationEnabled() {
                    if (!ChatAttachAlert.this.isDismissed() && ChatAttachAlert.this.openTransitionFinished) {
                        if (ChatAttachAlert.this.currentAttachLayout != ChatAttachAlert.this.pollLayout && ChatAttachAlert.this.currentAttachLayout != ChatAttachAlert.this.todoLayout && !ChatAttachAlert.this.getCommentView().isPopupVisible()) {
                            return true;
                        }
                        if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout && !ChatAttachAlert.this.pollLayout.isPopupVisible()) {
                            return true;
                        }
                        if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout && !ChatAttachAlert.this.todoLayout.isPopupVisible()) {
                            return true;
                        }
                    }
                    return false;
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
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!chatAttachAlert.inBubbleMode) {
                this.ignoreLayout = true;
                setPadding(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, 0, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, 0);
                this.ignoreLayout = false;
            }
            int size2 = View.MeasureSpec.getSize(i) - (((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft * 2);
            if (AndroidUtilities.isTablet()) {
                ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(0);
                } else {
                    ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
                }
            }
            ((FrameLayout.LayoutParams) ChatAttachAlert.this.doneItem.getLayoutParams()).height = ActionBar.getCurrentActionBarHeight();
            this.ignoreLayout = true;
            int iMin = (int) (size2 / Math.min(4.5f, ChatAttachAlert.this.buttonsAdapter.getItemCount()));
            if (ChatAttachAlert.this.attachItemSize != iMin) {
                ChatAttachAlert.this.attachItemSize = iMin;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlert.this.buttonsAdapter.notifyDataSetChanged();
                    }
                });
            }
            this.ignoreLayout = false;
            onMeasureInternal(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        private void onMeasureInternal(int i, int i2) {
            int i3;
            int i4;
            EditTextEmoji editTextEmoji;
            int emojiPadding;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            int i5 = size - (((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft * 2);
            if (!ChatAttachAlert.this.commentTextView.isWaitingForKeyboardOpen() && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.commentTextView.isPopupShowing() && !ChatAttachAlert.this.commentTextView.isAnimatePopupClosing()) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.commentTextView.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (!ChatAttachAlert.this.topCommentTextView.isWaitingForKeyboardOpen() && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.topCommentTextView.isPopupShowing() && !ChatAttachAlert.this.topCommentTextView.isAnimatePopupClosing()) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.topCommentTextView.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (ChatAttachAlert.this.pollLayout != null && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.pollLayout.isWaitingForKeyboardOpen() && !ChatAttachAlert.this.pollLayout.isPopupShowing() && !ChatAttachAlert.this.pollLayout.isAnimatePopupClosing() && !ChatAttachAlert.this.pollLayout.isEmojiSearchOpened) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.pollLayout.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (ChatAttachAlert.this.todoLayout != null && AndroidUtilities.dp(20.0f) >= 0 && !ChatAttachAlert.this.todoLayout.isWaitingForKeyboardOpen() && !ChatAttachAlert.this.todoLayout.isPopupShowing() && !ChatAttachAlert.this.todoLayout.isAnimatePopupClosing() && !ChatAttachAlert.this.todoLayout.isEmojiSearchOpened) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.todoLayout.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (AndroidUtilities.dp(20.0f) >= 0) {
                if (((BottomSheet) ChatAttachAlert.this).keyboardVisible) {
                    if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout && ChatAttachAlert.this.pollLayout.emojiView != null && ChatAttachAlert.this.pollLayout.isEmojiSearchOpened) {
                        emojiPadding = AndroidUtilities.dp(120.0f);
                    } else {
                        emojiPadding = (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout && ChatAttachAlert.this.todoLayout.emojiView != null && ChatAttachAlert.this.todoLayout.isEmojiSearchOpened) ? AndroidUtilities.dp(120.0f) : 0;
                    }
                } else {
                    emojiPadding = ChatAttachAlert.this.getEmojiPadding();
                }
                int rootBottomInset = getRootBottomInset(WindowInsetsCompat.Type.ime());
                Math.max(getRootBottomInset(WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.systemBars()), emojiPadding);
                int iMax = Math.max(rootBottomInset > 0 ? 0 : AndroidUtilities.navigationBarHeight, emojiPadding);
                this.ignoreLayout = true;
                if (ChatAttachAlert.this.currentAttachLayout.occupyNavigationBar) {
                    ChatAttachAlert.this.currentAttachLayout.listPaddingBottom = AndroidUtilities.dp(62.0f) + iMax;
                    ChatAttachAlert.this.currentAttachLayout.onPreMeasure(i5, size2);
                } else {
                    ChatAttachAlert.this.currentAttachLayout.listPaddingBottom = AndroidUtilities.navigationBarHeight;
                    ChatAttachAlert.this.currentAttachLayout.onPreMeasure(i5, size2 - emojiPadding);
                }
                if (ChatAttachAlert.this.nextAttachLayout != null) {
                    if (ChatAttachAlert.this.nextAttachLayout.occupyNavigationBar) {
                        ChatAttachAlert.this.nextAttachLayout.listPaddingBottom = iMax + AndroidUtilities.dp(62.0f);
                        ChatAttachAlert.this.nextAttachLayout.onPreMeasure(i5, size2);
                    } else {
                        ChatAttachAlert.this.nextAttachLayout.listPaddingBottom = AndroidUtilities.navigationBarHeight;
                        ChatAttachAlert.this.nextAttachLayout.onPreMeasure(i5, size2 - emojiPadding);
                    }
                }
                this.ignoreLayout = false;
            }
            int childCount = getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = getChildAt(i6);
                if (childAt == null || childAt.getVisibility() == 8) {
                    i3 = i;
                    i4 = i2;
                } else if (childAt == ChatAttachAlert.this.fadeView) {
                    i3 = i;
                    i4 = i2;
                    measureChildWithMargins(childAt, i3, 0, i4, 0);
                } else {
                    i3 = i;
                    i4 = i2;
                    int i7 = AndroidUtilities.statusBarHeight;
                    int i8 = AndroidUtilities.navigationBarHeight;
                    if (childAt instanceof AttachAlertLayout) {
                        AttachAlertLayout attachAlertLayout = (AttachAlertLayout) childAt;
                        if (attachAlertLayout.occupyStatusBar) {
                            i7 = 0;
                        }
                        if (attachAlertLayout.occupyNavigationBar) {
                            i8 = 0;
                        }
                    }
                    EditTextEmoji editTextEmoji2 = ChatAttachAlert.this.commentTextView;
                    if ((editTextEmoji2 != null && editTextEmoji2.isPopupView(childAt)) || (((editTextEmoji = ChatAttachAlert.this.topCommentTextView) != null && editTextEmoji.isPopupView(childAt)) || ((ChatAttachAlert.this.pollLayout != null && childAt == ChatAttachAlert.this.pollLayout.emojiView) || (ChatAttachAlert.this.todoLayout != null && childAt == ChatAttachAlert.this.todoLayout.emojiView)))) {
                        if (ChatAttachAlert.this.inBubbleMode) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size2, 1073741824));
                        } else if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                            if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (size2 - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                            }
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        }
                    } else {
                        measureChildWithMargins(childAt, i3, 0, i4, i7 + i8);
                    }
                }
                i6++;
                i = i3;
                i2 = i4;
            }
        }

        private int getRootKeyboardHeight() {
            return getRootBottomInset(WindowInsetsCompat.Type.ime());
        }

        private int getRootBottomInset(int i) {
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this);
            if (rootWindowInsets != null) {
                return rootWindowInsets.getInsets(i).bottom;
            }
            return 0;
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int paddingRight;
            int i5;
            int paddingLeft;
            int i6;
            int i7;
            int i8;
            ChatAttachAlert chatAttachAlert;
            EditTextEmoji editTextEmoji;
            EditTextEmoji editTextEmoji2;
            ChatAttachAlert chatAttachAlert2;
            int i9;
            int iMax;
            int measuredHeight;
            int measuredHeight2;
            int emojiPadding;
            int i10 = i3 - i;
            if (this.lastNotifyWidth != i10) {
                this.lastNotifyWidth = i10;
                if (ChatAttachAlert.this.messageSendPreview != null && ChatAttachAlert.this.messageSendPreview.isShowing()) {
                    ChatAttachAlert.this.messageSendPreview.dismiss();
                }
            }
            int childCount = getChildCount();
            if (Build.VERSION.SDK_INT >= 29) {
                ChatAttachAlert.this.exclustionRect.set(i, i2, i3, i4);
                setSystemGestureExclusionRects(ChatAttachAlert.this.exclusionRects);
            }
            int rootKeyboardHeight = getRootKeyboardHeight();
            int paddingBottom = getPaddingBottom();
            if (!((BottomSheet) ChatAttachAlert.this).keyboardVisible) {
                if (ChatAttachAlert.this.pollLayout == null || ChatAttachAlert.this.currentAttachLayout != ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.pollLayout.emojiView == null) {
                    if (ChatAttachAlert.this.todoLayout != null && ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout && ChatAttachAlert.this.todoLayout.emojiView != null) {
                        if (rootKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                            emojiPadding = 0;
                        } else {
                            emojiPadding = ChatAttachAlert.this.todoLayout.getEmojiPadding();
                        }
                    } else if (rootKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                        emojiPadding = 0;
                    } else {
                        emojiPadding = ChatAttachAlert.this.getCommentView().getEmojiPadding();
                    }
                } else if (rootKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = ChatAttachAlert.this.pollLayout.getEmojiPadding();
                }
                if (emojiPadding > 0) {
                    paddingBottom += emojiPadding;
                }
            }
            setBottomClip(paddingBottom);
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8) {
                    int i12 = AndroidUtilities.statusBarHeight;
                    int iMax2 = rootKeyboardHeight == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                    if (childAt instanceof AttachAlertLayout) {
                        AttachAlertLayout attachAlertLayout = (AttachAlertLayout) childAt;
                        if (attachAlertLayout.occupyStatusBar) {
                            i12 = 0;
                        }
                        if (attachAlertLayout.occupyNavigationBar) {
                            iMax2 = 0;
                        }
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    int i13 = layoutParams.gravity;
                    if (i13 == -1) {
                        i13 = 51;
                    }
                    int i14 = i13 & 112;
                    int i15 = i13 & 7;
                    if (i15 == 1) {
                        paddingRight = ((i10 - measuredWidth) / 2) + layoutParams.leftMargin;
                        i5 = layoutParams.rightMargin;
                    } else {
                        if (i15 == 5) {
                            paddingRight = ((i10 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                            i5 = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft;
                        } else {
                            paddingLeft = layoutParams.leftMargin + getPaddingLeft();
                        }
                        if (i14 != 16) {
                            i6 = ((((i4 - iMax2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i7 = layoutParams.bottomMargin;
                        } else {
                            if (i14 != 48) {
                                i8 = layoutParams.topMargin + i12;
                            } else if (i14 != 80) {
                                i6 = ((i4 - iMax2) - i2) - measuredHeight3;
                                i7 = layoutParams.bottomMargin;
                            } else {
                                i8 = layoutParams.topMargin;
                            }
                            chatAttachAlert = ChatAttachAlert.this;
                            if (childAt != chatAttachAlert.actionBar || childAt == chatAttachAlert.fadeView) {
                                i8 = 0;
                            }
                            editTextEmoji = ChatAttachAlert.this.commentTextView;
                            if ((editTextEmoji == null && editTextEmoji.isPopupView(childAt)) || (((editTextEmoji2 = ChatAttachAlert.this.topCommentTextView) != null && editTextEmoji2.isPopupView(childAt)) || ((ChatAttachAlert.this.pollLayout != null && childAt == ChatAttachAlert.this.pollLayout.emojiView) || (ChatAttachAlert.this.todoLayout != null && childAt == ChatAttachAlert.this.todoLayout.emojiView)))) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + rootKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                i8 = measuredHeight - measuredHeight2;
                            } else {
                                chatAttachAlert2 = ChatAttachAlert.this;
                                if (childAt != chatAttachAlert2.mentionContainer) {
                                    if (childAt == chatAttachAlert2.bottomFadeView) {
                                        i9 = i8 + AndroidUtilities.navigationBarHeight;
                                        iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                        i8 = i9 + iMax;
                                    }
                                } else if (chatAttachAlert2.captionAbove) {
                                    i9 = AndroidUtilities.statusBarHeight;
                                    iMax = ActionBar.getCurrentActionBarHeight();
                                    i8 = i9 + iMax;
                                }
                            }
                            childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, measuredHeight3 + i8);
                        }
                        i8 = i6 - i7;
                        chatAttachAlert = ChatAttachAlert.this;
                        if (childAt != chatAttachAlert.actionBar) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                        }
                        editTextEmoji = ChatAttachAlert.this.commentTextView;
                        if (editTextEmoji == null) {
                            chatAttachAlert2 = ChatAttachAlert.this;
                            if (childAt != chatAttachAlert2.mentionContainer) {
                                if (childAt == chatAttachAlert2.bottomFadeView) {
                                    i9 = i8 + AndroidUtilities.navigationBarHeight;
                                    iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                    i8 = i9 + iMax;
                                }
                            } else if (chatAttachAlert2.captionAbove) {
                                i9 = AndroidUtilities.statusBarHeight;
                                iMax = ActionBar.getCurrentActionBarHeight();
                                i8 = i9 + iMax;
                            }
                        } else {
                            chatAttachAlert2 = ChatAttachAlert.this;
                            if (childAt != chatAttachAlert2.mentionContainer) {
                                if (childAt == chatAttachAlert2.bottomFadeView) {
                                    i9 = i8 + AndroidUtilities.navigationBarHeight;
                                    iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                    i8 = i9 + iMax;
                                }
                            } else if (chatAttachAlert2.captionAbove) {
                                i9 = AndroidUtilities.statusBarHeight;
                                iMax = ActionBar.getCurrentActionBarHeight();
                                i8 = i9 + iMax;
                            }
                        }
                        childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, measuredHeight3 + i8);
                    }
                    paddingLeft = paddingRight - i5;
                    if (i14 != 16) {
                        i6 = ((((i4 - iMax2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i7 = layoutParams.bottomMargin;
                    } else {
                        if (i14 != 48) {
                            i8 = layoutParams.topMargin + i12;
                        } else if (i14 != 80) {
                            i6 = ((i4 - iMax2) - i2) - measuredHeight3;
                            i7 = layoutParams.bottomMargin;
                        } else {
                            i8 = layoutParams.topMargin;
                        }
                        chatAttachAlert = ChatAttachAlert.this;
                        if (childAt != chatAttachAlert.actionBar) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                        }
                        editTextEmoji = ChatAttachAlert.this.commentTextView;
                        if (editTextEmoji == null) {
                            chatAttachAlert2 = ChatAttachAlert.this;
                            if (childAt != chatAttachAlert2.mentionContainer) {
                                if (childAt == chatAttachAlert2.bottomFadeView) {
                                    i9 = i8 + AndroidUtilities.navigationBarHeight;
                                    iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                    i8 = i9 + iMax;
                                }
                            } else if (chatAttachAlert2.captionAbove) {
                                i9 = AndroidUtilities.statusBarHeight;
                                iMax = ActionBar.getCurrentActionBarHeight();
                                i8 = i9 + iMax;
                            }
                        } else {
                            chatAttachAlert2 = ChatAttachAlert.this;
                            if (childAt != chatAttachAlert2.mentionContainer) {
                                if (childAt == chatAttachAlert2.bottomFadeView) {
                                    i9 = i8 + AndroidUtilities.navigationBarHeight;
                                    iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                    i8 = i9 + iMax;
                                }
                            } else if (chatAttachAlert2.captionAbove) {
                                i9 = AndroidUtilities.statusBarHeight;
                                iMax = ActionBar.getCurrentActionBarHeight();
                                i8 = i9 + iMax;
                            }
                        }
                        childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, measuredHeight3 + i8);
                    }
                    i8 = i6 - i7;
                    chatAttachAlert = ChatAttachAlert.this;
                    if (childAt != chatAttachAlert.actionBar) {
                        i8 = 0;
                    } else {
                        i8 = 0;
                    }
                    editTextEmoji = ChatAttachAlert.this.commentTextView;
                    if (editTextEmoji == null) {
                        chatAttachAlert2 = ChatAttachAlert.this;
                        if (childAt != chatAttachAlert2.mentionContainer) {
                            if (childAt == chatAttachAlert2.bottomFadeView) {
                                i9 = i8 + AndroidUtilities.navigationBarHeight;
                                iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                i8 = i9 + iMax;
                            }
                        } else if (chatAttachAlert2.captionAbove) {
                            i9 = AndroidUtilities.statusBarHeight;
                            iMax = ActionBar.getCurrentActionBarHeight();
                            i8 = i9 + iMax;
                        }
                    } else {
                        chatAttachAlert2 = ChatAttachAlert.this;
                        if (childAt != chatAttachAlert2.mentionContainer) {
                            if (childAt == chatAttachAlert2.bottomFadeView) {
                                i9 = i8 + AndroidUtilities.navigationBarHeight;
                                iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                i8 = i9 + iMax;
                            }
                        } else if (chatAttachAlert2.captionAbove) {
                            i9 = AndroidUtilities.statusBarHeight;
                            iMax = ActionBar.getCurrentActionBarHeight();
                            i8 = i9 + iMax;
                        }
                    }
                    childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, measuredHeight3 + i8);
                }
            }
            notifyHeightChanged();
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
            chatAttachAlert3.updateLayout(chatAttachAlert3.currentAttachLayout, false, 0);
            ChatAttachAlert chatAttachAlert4 = ChatAttachAlert.this;
            chatAttachAlert4.updateLayout(chatAttachAlert4.nextAttachLayout, false, 0);
            ChatAttachAlert chatAttachAlert5 = ChatAttachAlert.this;
            if (chatAttachAlert5.captionAbove) {
                chatAttachAlert5.updateCommentTextViewPosition();
            }
            if (ChatAttachAlert.this.photoLayout == null || ChatAttachAlert.this.photoLayout.gridView == null || ChatAttachAlert.this.photoLayout.gridView.getFastScroll() == null) {
                return;
            }
            RecyclerListView.FastScroll fastScroll = ChatAttachAlert.this.photoLayout.gridView.getFastScroll();
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + ChatAttachAlert.this.photoLayout.listAdditionalH;
            ChatAttachAlert chatAttachAlert6 = ChatAttachAlert.this;
            fastScroll.topOffset = currentActionBarHeight + (chatAttachAlert6.captionAbove ? (int) (chatAttachAlert6.topCommentContainer.getMeasuredHeight() * ChatAttachAlert.this.topCommentContainer.getAlpha()) : 0);
            ChatAttachAlert.this.photoLayout.gridView.getFastScroll().invalidate();
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        private float getY(View view) {
            int currentActionBarHeight;
            int iDp;
            float f;
            if (!(view instanceof AttachAlertLayout)) {
                return 0.0f;
            }
            AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
            int iNeedsActionBar = attachAlertLayout.needsActionBar();
            int iDp2 = AndroidUtilities.dp(13.0f);
            FrameLayout frameLayout = ChatAttachAlert.this.headerView;
            int alpha = iDp2 + ((int) ((frameLayout != null ? frameLayout.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f)));
            FrameLayout frameLayout2 = ChatAttachAlert.this.topCommentContainer;
            int alpha2 = alpha + ((int) (frameLayout2 != null ? frameLayout2.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f));
            int scrollOffsetY = (ChatAttachAlert.this.getScrollOffsetY(0) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - alpha2;
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                scrollOffsetY = (int) (scrollOffsetY + view.getTranslationY());
            }
            int iDp3 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
            if (iNeedsActionBar == 0) {
                currentActionBarHeight = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
            } else {
                currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
            }
            if (iNeedsActionBar != 2 && scrollOffsetY + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop < currentActionBarHeight) {
                float f2 = alpha2;
                if (attachAlertLayout != ChatAttachAlert.this.locationLayout) {
                    if (attachAlertLayout == ChatAttachAlert.this.pollLayout || attachAlertLayout == ChatAttachAlert.this.todoLayout) {
                        int iDp4 = AndroidUtilities.dp(3.0f);
                        f = f2 - iDp4;
                        iDp3 -= (int) (((currentActionBarHeight - f) + AndroidUtilities.statusBarHeight) * ChatAttachAlert.this.actionBar.getAlpha());
                    } else {
                        iDp = AndroidUtilities.dp(4.0f);
                    }
                } else {
                    iDp = AndroidUtilities.dp(11.0f);
                }
                f = f2 + iDp;
                iDp3 -= (int) (((currentActionBarHeight - f) + AndroidUtilities.statusBarHeight) * ChatAttachAlert.this.actionBar.getAlpha());
            }
            if (!ChatAttachAlert.this.inBubbleMode) {
                iDp3 += AndroidUtilities.statusBarHeight;
            }
            return iDp3;
        }

        private void drawChildBackground(Canvas canvas, View view) {
            int currentActionBarHeight;
            float f;
            int iDp;
            float f2;
            float fMax;
            float f3;
            float f4;
            float f5;
            int themedColor;
            float alpha;
            float f6;
            if (view instanceof AttachAlertLayout) {
                canvas.save();
                canvas.translate(0.0f, ChatAttachAlert.this.currentPanTranslationY);
                int alpha2 = (int) (view.getAlpha() * 255.0f);
                AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
                int iNeedsActionBar = attachAlertLayout.needsActionBar();
                int iDp2 = AndroidUtilities.dp(13.0f);
                FrameLayout frameLayout = ChatAttachAlert.this.headerView;
                int alpha3 = iDp2 + ((int) ((frameLayout != null ? frameLayout.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f)));
                FrameLayout frameLayout2 = ChatAttachAlert.this.topCommentContainer;
                int alpha4 = alpha3 + ((int) (frameLayout2 != null ? frameLayout2.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f));
                int scrollOffsetY = (ChatAttachAlert.this.getScrollOffsetY(0) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - alpha4;
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                    scrollOffsetY = (int) (scrollOffsetY + view.getTranslationY());
                }
                int iDp3 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                getMeasuredHeight();
                AndroidUtilities.dp(45.0f);
                int unused = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                if (iNeedsActionBar == 0) {
                    currentActionBarHeight = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                } else {
                    currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
                }
                if (iNeedsActionBar == 2) {
                    fMax = scrollOffsetY < currentActionBarHeight ? Math.max(0.0f, 1.0f - ((currentActionBarHeight - scrollOffsetY) / ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop)) : 1.0f;
                    f = 0.0f;
                } else {
                    float f7 = alpha4;
                    f = 0.0f;
                    if (attachAlertLayout != ChatAttachAlert.this.locationLayout) {
                        if (attachAlertLayout == ChatAttachAlert.this.pollLayout || attachAlertLayout == ChatAttachAlert.this.todoLayout) {
                            int iDp4 = AndroidUtilities.dp(3.0f);
                            f2 = f7 - iDp4;
                            float alpha5 = ChatAttachAlert.this.actionBar.getAlpha();
                            int i = (int) (((currentActionBarHeight - f2) + AndroidUtilities.statusBarHeight) * alpha5);
                            scrollOffsetY -= i;
                            iDp3 -= i;
                            fMax = 1.0f - alpha5;
                        } else {
                            iDp = AndroidUtilities.dp(4.0f);
                        }
                    } else {
                        iDp = AndroidUtilities.dp(11.0f);
                    }
                    f2 = f7 + iDp;
                    float alpha6 = ChatAttachAlert.this.actionBar.getAlpha();
                    int i2 = (int) (((currentActionBarHeight - f2) + AndroidUtilities.statusBarHeight) * alpha6);
                    scrollOffsetY -= i2;
                    iDp3 -= i2;
                    fMax = 1.0f - alpha6;
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (!chatAttachAlert.inBubbleMode) {
                    int i3 = AndroidUtilities.statusBarHeight;
                    scrollOffsetY += i3;
                    iDp3 += i3;
                }
                int customBackground = chatAttachAlert.currentAttachLayout.hasCustomBackground() ? ChatAttachAlert.this.currentAttachLayout.getCustomBackground() : ChatAttachAlert.this.getActionBarDrawableColor();
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setAlpha(alpha2);
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setBounds(0, scrollOffsetY, getMeasuredWidth(), getMeasuredHeight() + AndroidUtilities.dp(45.0f) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop);
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.draw(canvas);
                if (iNeedsActionBar == 2) {
                    Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    f3 = 24.0f;
                    f5 = 4.0f;
                    f4 = 1.0f;
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                } else {
                    f3 = 24.0f;
                    f4 = 1.0f;
                    f5 = 4.0f;
                }
                if ((fMax != f4 && iNeedsActionBar != 2) || ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                    Paint paint = Theme.dialogs_onlineCirclePaint;
                    if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                        customBackground = ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground();
                    }
                    paint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(f3));
                }
                if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                    Theme.dialogs_onlineCirclePaint.setColor(ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground());
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    int scrollOffsetY2 = ChatAttachAlert.this.getScrollOffsetY(0);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    if (!chatAttachAlert2.inBubbleMode) {
                        scrollOffsetY2 += AndroidUtilities.statusBarHeight;
                    }
                    this.rect.set(((BottomSheet) chatAttachAlert2).backgroundPaddingLeft, (((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(12.0f)) * fMax, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, scrollOffsetY2 + AndroidUtilities.dp(12.0f));
                    canvas.save();
                    canvas.drawRect(this.rect, Theme.dialogs_onlineCirclePaint);
                    canvas.restore();
                }
                FrameLayout frameLayout3 = ChatAttachAlert.this.headerView;
                if ((frameLayout3 == null || frameLayout3.getAlpha() != f4) && fMax != f) {
                    int iDp5 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - iDp5) / 2, iDp3, (getMeasuredWidth() + iDp5) / 2, iDp3 + AndroidUtilities.dp(f5));
                    if (iNeedsActionBar == 2) {
                        themedColor = 536870912;
                        f6 = fMax;
                    } else if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                        int customActionBarBackground = ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground();
                        themedColor = ColorUtils.blendARGB(customActionBarBackground, ColorUtils.calculateLuminance(customActionBarBackground) < 0.5d ? -1 : -16777216, 0.5f);
                        FrameLayout frameLayout4 = ChatAttachAlert.this.headerView;
                        if (frameLayout4 == null) {
                            f6 = 1.0f;
                        } else {
                            alpha = frameLayout4.getAlpha();
                            f6 = f4 - alpha;
                        }
                    } else {
                        themedColor = ChatAttachAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                        FrameLayout frameLayout5 = ChatAttachAlert.this.headerView;
                        if (frameLayout5 == null) {
                            f6 = 1.0f;
                        } else {
                            alpha = frameLayout5.getAlpha();
                            f6 = f4 - alpha;
                        }
                    }
                    int iAlpha = Color.alpha(themedColor);
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (iAlpha * f6 * fMax * view.getAlpha()));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                canvas.restore();
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            int currentActionBarHeight;
            float f;
            int iDp;
            float f2;
            float fMax;
            float f3;
            float f4;
            boolean zDrawChild;
            FrameLayout frameLayout;
            int themedColor;
            FrameLayout frameLayout2;
            float alpha;
            if ((view instanceof AttachAlertLayout) && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(0.0f, ChatAttachAlert.this.currentPanTranslationY);
                int alpha2 = (int) (view.getAlpha() * 255.0f);
                AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
                int iNeedsActionBar = attachAlertLayout.needsActionBar();
                int iDp2 = AndroidUtilities.dp(13.0f);
                FrameLayout frameLayout3 = ChatAttachAlert.this.headerView;
                int iDp3 = iDp2 + (frameLayout3 != null ? AndroidUtilities.dp(frameLayout3.getAlpha() * 26.0f) : 0);
                FrameLayout frameLayout4 = ChatAttachAlert.this.topCommentContainer;
                int alpha3 = iDp3 + ((int) (frameLayout4 != null ? frameLayout4.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f));
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                int scrollOffsetY = (chatAttachAlert.getScrollOffsetY(attachAlertLayout == chatAttachAlert.currentAttachLayout ? 0 : 1) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - alpha3;
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                    scrollOffsetY = (int) (scrollOffsetY + view.getTranslationY());
                }
                int iDp4 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(45.0f) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                if (iNeedsActionBar == 0) {
                    currentActionBarHeight = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                } else {
                    currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
                }
                if (iNeedsActionBar != 2) {
                    f = 0.0f;
                    if (((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY < currentActionBarHeight) {
                        float f5 = alpha3;
                        if (attachAlertLayout != ChatAttachAlert.this.locationLayout) {
                            if (attachAlertLayout == ChatAttachAlert.this.pollLayout || attachAlertLayout == ChatAttachAlert.this.todoLayout) {
                                int iDp5 = AndroidUtilities.dp(3.0f);
                                f2 = f5 - iDp5;
                                float fMin = Math.min(1.0f, ((currentActionBarHeight - scrollOffsetY) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) / f2);
                                int i = (int) ((currentActionBarHeight - f2) * fMin);
                                scrollOffsetY -= i;
                                iDp4 -= i;
                                measuredHeight += i;
                                fMax = 1.0f - fMin;
                            } else {
                                iDp = AndroidUtilities.dp(4.0f);
                            }
                        } else {
                            iDp = AndroidUtilities.dp(11.0f);
                        }
                        f2 = f5 + iDp;
                        float fMin2 = Math.min(1.0f, ((currentActionBarHeight - scrollOffsetY) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) / f2);
                        int i2 = (int) ((currentActionBarHeight - f2) * fMin2);
                        scrollOffsetY -= i2;
                        iDp4 -= i2;
                        measuredHeight += i2;
                        fMax = 1.0f - fMin2;
                    } else {
                        fMax = 1.0f;
                    }
                } else if (scrollOffsetY < currentActionBarHeight) {
                    fMax = Math.max(0.0f, 1.0f - ((currentActionBarHeight - scrollOffsetY) / ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop));
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    fMax = 1.0f;
                }
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                if (!chatAttachAlert2.inBubbleMode) {
                    int i3 = AndroidUtilities.statusBarHeight;
                    scrollOffsetY += i3;
                    iDp4 += i3;
                    measuredHeight -= i3;
                }
                int customBackground = chatAttachAlert2.currentAttachLayout.hasCustomBackground() ? ChatAttachAlert.this.currentAttachLayout.getCustomBackground() : ChatAttachAlert.this.getActionBarDrawableColor();
                boolean z = (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout || ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.photoPreviewLayout || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout && ChatAttachAlert.this.nextAttachLayout == null)) ? false : true;
                if (z) {
                    ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setAlpha(alpha2);
                    f3 = 1.0f;
                    ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setBounds(0, scrollOffsetY, getMeasuredWidth(), measuredHeight);
                    ((BottomSheet) ChatAttachAlert.this).shadowDrawable.draw(canvas);
                    if (iNeedsActionBar == 2) {
                        Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                        Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                        f4 = 24.0f;
                        this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(24.0f));
                    }
                    if (view == ChatAttachAlert.this.contactsLayout && view != ChatAttachAlert.this.quickRepliesLayout && view != ChatAttachAlert.this.audioLayout) {
                        canvas.save();
                        zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                    } else {
                        zDrawChild = super.drawChild(canvas, view, j);
                    }
                    if (z) {
                        if (fMax != f3 && iNeedsActionBar != 2) {
                            Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                            Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                            this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(f4));
                        }
                        frameLayout = ChatAttachAlert.this.headerView;
                        if ((frameLayout != null || frameLayout.getAlpha() != f3) && fMax != f) {
                            int iDp6 = AndroidUtilities.dp(36.0f);
                            this.rect.set((getMeasuredWidth() - iDp6) / 2, iDp4, (getMeasuredWidth() + iDp6) / 2, iDp4 + AndroidUtilities.dp(4.0f));
                            if (iNeedsActionBar == 2) {
                                themedColor = 536870912;
                                alpha = fMax;
                            } else {
                                themedColor = ChatAttachAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                                frameLayout2 = ChatAttachAlert.this.headerView;
                                if (frameLayout2 == null) {
                                    alpha = 1.0f;
                                } else {
                                    alpha = f3 - frameLayout2.getAlpha();
                                }
                            }
                            int iAlpha = Color.alpha(themedColor);
                            Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                            Theme.dialogs_onlineCirclePaint.setAlpha((int) (iAlpha * alpha * fMax * view.getAlpha()));
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                        }
                    }
                    canvas.restore();
                    return zDrawChild;
                }
                f3 = 1.0f;
                f4 = 24.0f;
                if (view == ChatAttachAlert.this.contactsLayout) {
                    zDrawChild = super.drawChild(canvas, view, j);
                } else {
                    zDrawChild = super.drawChild(canvas, view, j);
                }
                if (z) {
                    if (fMax != f3) {
                        Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                        Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                        this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY + AndroidUtilities.dp(f4));
                    }
                    frameLayout = ChatAttachAlert.this.headerView;
                    if (frameLayout != null) {
                        int iDp7 = AndroidUtilities.dp(36.0f);
                        this.rect.set((getMeasuredWidth() - iDp7) / 2, iDp4, (getMeasuredWidth() + iDp7) / 2, iDp4 + AndroidUtilities.dp(4.0f));
                        if (iNeedsActionBar == 2) {
                            themedColor = 536870912;
                            alpha = fMax;
                        } else {
                            themedColor = ChatAttachAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                            frameLayout2 = ChatAttachAlert.this.headerView;
                            if (frameLayout2 == null) {
                                alpha = 1.0f;
                            } else {
                                alpha = f3 - frameLayout2.getAlpha();
                            }
                        }
                        int iAlpha2 = Color.alpha(themedColor);
                        Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                        Theme.dialogs_onlineCirclePaint.setAlpha((int) (iAlpha2 * alpha * fMax * view.getAlpha()));
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    } else {
                        int iDp8 = AndroidUtilities.dp(36.0f);
                        this.rect.set((getMeasuredWidth() - iDp8) / 2, iDp4, (getMeasuredWidth() + iDp8) / 2, iDp4 + AndroidUtilities.dp(4.0f));
                        if (iNeedsActionBar == 2) {
                            themedColor = 536870912;
                            alpha = fMax;
                        } else {
                            themedColor = ChatAttachAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                            frameLayout2 = ChatAttachAlert.this.headerView;
                            if (frameLayout2 == null) {
                                alpha = 1.0f;
                            } else {
                                alpha = f3 - frameLayout2.getAlpha();
                            }
                        }
                        int iAlpha3 = Color.alpha(themedColor);
                        Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                        Theme.dialogs_onlineCirclePaint.setAlpha((int) (iAlpha3 * alpha * fMax * view.getAlpha()));
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    }
                }
                canvas.restore();
                return zDrawChild;
            }
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
            ActionBar actionBar = chatAttachAlert3.actionBar;
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
                boolean zDrawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild2;
            }
            if ((view instanceof EmojiView) && chatAttachAlert3.emojiViewChildBg != null) {
                canvas.save();
                ChatAttachAlert.this.emojiViewChildBg.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(ChatAttachAlert.this.emojiViewChildBg.getPath());
                ChatAttachAlert.this.emojiViewChildBg.draw(canvas);
                boolean zDrawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild3;
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
            int iDp = AndroidUtilities.dp(13.0f);
            FrameLayout frameLayout = ChatAttachAlert.this.headerView;
            int iDp2 = i - (iDp + (frameLayout != null ? AndroidUtilities.dp(frameLayout.getAlpha() * 26.0f) : 0));
            FrameLayout frameLayout2 = ChatAttachAlert.this.topCommentContainer;
            int alpha = (iDp2 - ((int) (frameLayout2 != null ? frameLayout2.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f))) + AndroidUtilities.dp(20.0f);
            return !ChatAttachAlert.this.inBubbleMode ? alpha + AndroidUtilities.statusBarHeight : alpha;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (Build.VERSION.SDK_INT >= 31 && ChatAttachAlert.this.scrollableViewNoiseSuppressor != null) {
                ChatAttachAlert.this.blur3_InvalidateBlur();
                if (ChatAttachAlert.this.iBlur3SourceGlassFrosted != null) {
                    ChatAttachAlert.this.iBlur3SourceGlassFrosted.setSize(((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredHeight());
                    ChatAttachAlert.this.iBlur3SourceGlassFrosted.updateDisplayListIfNeeded();
                }
                if (ChatAttachAlert.this.iBlur3SourceGlass != null) {
                    ChatAttachAlert.this.iBlur3SourceGlass.setSize(((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredHeight());
                    ChatAttachAlert.this.iBlur3SourceGlass.updateDisplayListIfNeeded();
                }
            }
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
                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setTranslationY(0.0f);
                    f2 = 0.0f;
                } else {
                    ChatAttachAlert.this.currentAttachLayout.setTranslationY(0.0f);
                    FrameLayout frameLayout = ChatAttachAlert.this.buttonsRecyclerViewWrapper;
                    frameLayout.setTranslationY((-f2) + (frameLayout.getMeasuredHeight() * (f2 / this.initialTranslationY)));
                }
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }
            super.setTranslationY(f2 - ChatAttachAlert.this.currentPanTranslationY);
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType != 1) {
                ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.adjustPanLayoutHelper.setResizableView(this);
            this.adjustPanLayoutHelper.onAttach();
            ChatAttachAlert.this.commentTextView.setAdjustPanLayoutHelper(this.adjustPanLayoutHelper);
            ChatAttachAlert.this.topCommentTextView.setAdjustPanLayoutHelper(this.adjustPanLayoutHelper);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.adjustPanLayoutHelper.onDetach();
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            int radius;
            WindowInsets rootWindowInsets;
            super.onSizeChanged(i, i2, i3, i4);
            int i5 = 0;
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                radius = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                int radius2 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 == null) {
                    i5 = radius2;
                    radius = 0;
                } else {
                    radius = roundedCorner2.getRadius();
                    i5 = radius2;
                }
            }
            if (ChatAttachAlert.this.emojiViewChildBg != null) {
                ChatAttachAlert.this.emojiViewChildBg.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), radius, i5, true);
            }
        }
    }

    public static void m2149$r8$lambda$kZgc3zq2gMWBNqYfuEtk9BhQQI(ChatAttachAlert chatAttachAlert, View view) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
        if (chatAttachAlertPhotoLayout == null) {
            return;
        }
        boolean z = !chatAttachAlertPhotoLayout.areLivePhotosEnabled();
        chatAttachAlert.photoLayout.toggleLivePhotos(z);
        chatAttachAlert.updateMotionItem(true);
        chatAttachAlert.showMotionHint(z);
    }

    public static void $r8$lambda$Bx20EyZFzQmYxOalN0J1inPx_Jk(ChatAttachAlert chatAttachAlert, View view) {
        AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
        if (attachAlertLayout != null) {
            attachAlertLayout.onMenuItemClick(40);
        }
    }

    public static void $r8$lambda$sv4_pwE_a1VSjs6JkaaPOWwpplg(ChatAttachAlert chatAttachAlert, boolean z, View view) {
        if (chatAttachAlert.avatarPicker != 0) {
            chatAttachAlert.delegate.openAvatarsSearch();
            chatAttachAlert.dismiss();
            return;
        }
        final HashMap map = new HashMap();
        final ArrayList arrayList = new ArrayList();
        PhotoPickerSearchActivity photoPickerSearchActivity = new PhotoPickerSearchActivity(map, arrayList, 0, true, (ChatActivity) chatAttachAlert.baseFragment);
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

            @Override
            public void actionButtonPressed(boolean z2, boolean z3, int i, int i2) {
                if (z2 || map.isEmpty() || this.sendPressed) {
                    return;
                }
                this.sendPressed = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Object obj = map.get(arrayList.get(i3));
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
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
                ((ChatActivity) ChatAttachAlert.this.baseFragment).didSelectSearchPhotos(arrayList2, z3, i);
            }
        });
        photoPickerSearchActivity.setMaxSelectedPhotos(chatAttachAlert.maxSelectedPhotos, chatAttachAlert.allowOrder);
        if (z) {
            chatAttachAlert.baseFragment.showAsSheet(photoPickerSearchActivity);
        } else {
            chatAttachAlert.baseFragment.presentFragment(photoPickerSearchActivity);
        }
        chatAttachAlert.dismiss();
    }

    public static void m2156$r8$lambda$xhISNtOk_T0lREcznX8rMM8Tpo(ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider, View view) {
        chatAttachAlert.optionsItem.toggleSubMenu();
        PhotoViewer.getInstance().setParentActivity(chatAttachAlert.baseFragment, resourcesProvider);
        PhotoViewer.getInstance().setParentAlert(chatAttachAlert);
        PhotoViewer.getInstance().setMaxSelectedPhotos(chatAttachAlert.maxSelectedPhotos, chatAttachAlert.allowOrder);
        if (!chatAttachAlert.delegate.needEnterComment()) {
            AndroidUtilities.hideKeyboard(chatAttachAlert.baseFragment.getFragmentView().findFocus());
            AndroidUtilities.hideKeyboard(chatAttachAlert.getContainer().findFocus());
        }
        File fileMakeCacheFile = StoryEntry.makeCacheFile(chatAttachAlert.currentAccount, "webp");
        Point point = AndroidUtilities.displaySize;
        int i = point.x;
        int i2 = point.y;
        if (i > 1080 || i2 > 1080) {
            float fMin = Math.min(i, i2) / 1080.0f;
            i = (int) (i * fMin);
            i2 = (int) (i2 * fMin);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile));
        } catch (Throwable th) {
            FileLog.e(th);
        }
        bitmapCreateBitmap.recycle();
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileMakeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
        arrayList.add(photoEntry);
        PhotoViewer photoViewer = PhotoViewer.getInstance();
        AnonymousClass11 anonymousClass11 = chatAttachAlert.new AnonymousClass11(photoEntry);
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        photoViewer.openPhotoForSelect(arrayList, 0, 11, false, anonymousClass11, baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null);
        if (chatAttachAlert.isStickerMode) {
            PhotoViewer.getInstance().enableStickerMode(null, null, true, chatAttachAlert.customStickerHandler);
        }
    }

    class AnonymousClass11 extends PhotoViewer.EmptyPhotoViewerProvider {
        final MediaController.PhotoEntry val$entry;

        @Override
        public boolean allowCaption() {
            return false;
        }

        AnonymousClass11(MediaController.PhotoEntry photoEntry) {
            this.val$entry = photoEntry;
        }

        @Override
        public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, final boolean z, final int i2, int i3, final boolean z2) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.sent = true;
            if (chatAttachAlert.delegate == null) {
                return;
            }
            this.val$entry.editedInfo = videoEditedInfo;
            int i4 = chatAttachAlert.currentAccount;
            long dialogId = getDialogId();
            int additionalMessagesCount = ChatAttachAlert.this.getAdditionalMessagesCount() + 1;
            final MediaController.PhotoEntry photoEntry = this.val$entry;
            AlertsCreator.ensurePaidMessageConfirmation(i4, dialogId, additionalMessagesCount, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ChatAttachAlert.AnonymousClass11.$r8$lambda$P_N54PmDndhw9ehWaDtmjPNNQ8o(this.f$0, photoEntry, z, i2, z2, (Long) obj);
                }
            });
        }

        public static void $r8$lambda$P_N54PmDndhw9ehWaDtmjPNNQ8o(AnonymousClass11 anonymousClass11, MediaController.PhotoEntry photoEntry, boolean z, int i, boolean z2, Long l) {
            anonymousClass11.getClass();
            ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
            ChatAttachAlertPhotoLayout.selectedPhotos.clear();
            ChatAttachAlertPhotoLayout.selectedPhotosOrder.add(0);
            ChatAttachAlertPhotoLayout.selectedPhotos.put(0, photoEntry);
            ChatAttachAlert.this.delegate.didPressedButton(7, true, z, i, 0, 0L, anonymousClass11.isCaptionAbove(), z2, l.longValue());
        }
    }

    public static void m2152$r8$lambda$qXIHkUrgR5iMzperioi89jQqH0(final ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider, View view, int i) {
        BaseFragment lastFragment = chatAttachAlert.baseFragment;
        if (lastFragment == null) {
            lastFragment = LaunchActivity.getLastFragment();
        }
        if (lastFragment == null || lastFragment.getParentActivity() == null) {
            return;
        }
        if (view instanceof AttachButton) {
            Activity parentActivity = lastFragment.getParentActivity();
            int iIntValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (iIntValue == 1) {
                if (!chatAttachAlert.photosEnabled && !chatAttachAlert.videosEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!chatAttachAlert.photosEnabled && !chatAttachAlert.videosEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(1, chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider);
                    chatAttachAlert.restrictedLayout = chatAttachRestrictedLayout;
                    chatAttachAlert.showLayout(chatAttachRestrictedLayout);
                }
                chatAttachAlert.showLayout(chatAttachAlert.photoLayout);
            } else if (iIntValue == 3) {
                if (!chatAttachAlert.musicEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i2 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(chatAttachAlert.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                chatAttachAlert.openAudioLayout(true);
            } else if (iIntValue == 4) {
                if (!chatAttachAlert.documentsEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i3 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(chatAttachAlert.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                chatAttachAlert.openDocumentsLayout(true);
            } else if (iIntValue == 5) {
                if (!chatAttachAlert.plainTextEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlert.plainTextEnabled && chatAttachAlert.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(chatAttachAlert.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                chatAttachAlert.openContactsLayout();
            } else if (iIntValue == 6) {
                if ((!chatAttachAlert.plainTextEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) || !AndroidUtilities.isMapsInstalled(chatAttachAlert.baseFragment)) {
                    return;
                }
                if (!chatAttachAlert.plainTextEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout2 = new ChatAttachRestrictedLayout(6, chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider);
                    chatAttachAlert.restrictedLayout = chatAttachRestrictedLayout2;
                    chatAttachAlert.showLayout(chatAttachRestrictedLayout2);
                } else {
                    if (chatAttachAlert.locationLayout == null) {
                        AttachAlertLayout[] attachAlertLayoutArr = chatAttachAlert.layouts;
                        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider, (chatAttachAlert.isPollAttach || chatAttachAlert.restrictEphemeralMessageTypes) ? false : true);
                        chatAttachAlert.locationLayout = chatAttachAlertLocationLayout;
                        attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                        ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = chatAttachAlert.locationActivityDelegate;
                        if (locationActivityDelegate != null) {
                            chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                        } else {
                            chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() {
                                @Override
                                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i4, boolean z, int i5, long j) {
                                    ((ChatActivity) this.f$0.baseFragment).didSelectLocation(messageMedia, i4, z, i5, j);
                                }
                            });
                        }
                    }
                    chatAttachAlert.showLayout(chatAttachAlert.locationLayout);
                }
            } else if (iIntValue == 9) {
                if (!chatAttachAlert.pollsEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!chatAttachAlert.pollsEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout3 = new ChatAttachRestrictedLayout(9, chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider);
                    chatAttachAlert.restrictedLayout = chatAttachRestrictedLayout3;
                    chatAttachAlert.showLayout(chatAttachRestrictedLayout3);
                } else {
                    chatAttachAlert.showPollLayout(true, null);
                }
            } else if (iIntValue == 11) {
                chatAttachAlert.openQuickRepliesLayout();
            } else if (iIntValue == 12) {
                if (!chatAttachAlert.todoEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!chatAttachAlert.todoEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout4 = new ChatAttachRestrictedLayout(9, chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider);
                    chatAttachAlert.restrictedLayout = chatAttachRestrictedLayout4;
                    chatAttachAlert.showLayout(chatAttachRestrictedLayout4);
                } else {
                    if (chatAttachAlert.todoLayout == null) {
                        AttachAlertLayout[] attachAlertLayoutArr2 = chatAttachAlert.layouts;
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(chatAttachAlert, chatAttachAlert.getContext(), true, resourcesProvider, null);
                        chatAttachAlert.todoLayout = chatAttachAlertPollLayout;
                        attachAlertLayoutArr2[1] = chatAttachAlertPollLayout;
                        chatAttachAlertPollLayout.setDelegate(new ChatAttachAlertPollLayout.PollCreateActivityDelegate() {
                            @Override
                            public final void sendPoll(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i4, long j) {
                                ((ChatActivity) this.f$0.baseFragment).sendTodo((TLRPC.TL_messageMediaToDo) messageMedia, z, i4, j);
                            }
                        });
                    }
                    chatAttachAlert.showLayout(chatAttachAlert.todoLayout);
                }
            } else if (iIntValue == 13) {
                if (chatAttachAlert.stickersLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr3 = chatAttachAlert.layouts;
                    ChatAttachAlertEmojiLayout chatAttachAlertEmojiLayout = new ChatAttachAlertEmojiLayout(chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider, true);
                    chatAttachAlert.stickersLayout = chatAttachAlertEmojiLayout;
                    attachAlertLayoutArr3[8] = chatAttachAlertEmojiLayout;
                    chatAttachAlertEmojiLayout.setDelegate(chatAttachAlert.emojiViewDelegate);
                }
                chatAttachAlert.showLayout(chatAttachAlert.stickersLayout);
            } else if (iIntValue == 14) {
                if (chatAttachAlert.emojiLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr4 = chatAttachAlert.layouts;
                    ChatAttachAlertEmojiLayout chatAttachAlertEmojiLayout2 = new ChatAttachAlertEmojiLayout(chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider, false);
                    chatAttachAlert.emojiLayout = chatAttachAlertEmojiLayout2;
                    attachAlertLayoutArr4[9] = chatAttachAlertEmojiLayout2;
                    chatAttachAlertEmojiLayout2.setDelegate(chatAttachAlert.emojiViewDelegate);
                }
                chatAttachAlert.showLayout(chatAttachAlert.emojiLayout);
            } else if (iIntValue == 16) {
                if (chatAttachAlert.richLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr5 = chatAttachAlert.layouts;
                    ChatAttachAlertRichLayout chatAttachAlertRichLayout = new ChatAttachAlertRichLayout(chatAttachAlert, chatAttachAlert.getContext(), chatAttachAlert.currentAccount, resourcesProvider);
                    chatAttachAlert.richLayout = chatAttachAlertRichLayout;
                    attachAlertLayoutArr5[10] = chatAttachAlertRichLayout;
                }
                chatAttachAlert.showLayout(chatAttachAlert.richLayout);
            } else if (view.getTag() instanceof Integer) {
                chatAttachAlert.delegate.didPressedButton(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
            }
        } else if (view instanceof AttachBotButton) {
            final AttachBotButton attachBotButton = (AttachBotButton) view;
            if (attachBotButton.attachMenuBot != null) {
                if (!attachBotButton.attachMenuBot.inactive) {
                    chatAttachAlert.showBotLayout(attachBotButton.attachMenuBot.bot_id, true);
                } else {
                    WebAppDisclaimerAlert.show(chatAttachAlert.getContext(), new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            ChatAttachAlert.$r8$lambda$lJL2SHFLATdDTGgzl_srs_rdlCk(this.f$0, attachBotButton, (Boolean) obj);
                        }
                    }, null, null);
                }
            } else {
                chatAttachAlert.delegate.didSelectBot(attachBotButton.currentUser);
                chatAttachAlert.dismiss();
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int iDp = AndroidUtilities.dp(70.0f);
        int i4 = left - iDp;
        if (i4 < 0) {
            chatAttachAlert.buttonsRecyclerView.smoothScrollBy(i4, 0);
            return;
        }
        int i5 = right + iDp;
        if (i5 > chatAttachAlert.buttonsRecyclerView.getMeasuredWidth()) {
            RecyclerListView recyclerListView = chatAttachAlert.buttonsRecyclerView;
            recyclerListView.smoothScrollBy(i5 - recyclerListView.getMeasuredWidth(), 0);
        }
    }

    public static void $r8$lambda$lJL2SHFLATdDTGgzl_srs_rdlCk(final ChatAttachAlert chatAttachAlert, final AttachBotButton attachBotButton, Boolean bool) {
        chatAttachAlert.getClass();
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(chatAttachAlert.currentAccount).getInputUser(attachBotButton.attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(chatAttachAlert.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatAttachAlert.$r8$lambda$roKVUkWtEUhLPoL0EZRsCTswg7Y(this.f$0, attachBotButton, tLObject, tL_error);
            }
        }, 66);
    }

    public static void $r8$lambda$roKVUkWtEUhLPoL0EZRsCTswg7Y(final ChatAttachAlert chatAttachAlert, final AttachBotButton attachBotButton, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatAttachAlert.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.$r8$lambda$EqvuJZssCvHAjdXPRmJCd_RkrIU(this.f$0, attachBotButton);
            }
        });
    }

    public static void $r8$lambda$EqvuJZssCvHAjdXPRmJCd_RkrIU(ChatAttachAlert chatAttachAlert, AttachBotButton attachBotButton) {
        chatAttachAlert.getClass();
        TLRPC.TL_attachMenuBot tL_attachMenuBot = attachBotButton.attachMenuBot;
        attachBotButton.attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        chatAttachAlert.showBotLayout(attachBotButton.attachMenuBot.bot_id, true);
        MediaDataController.getInstance(chatAttachAlert.currentAccount).updateAttachMenuBotsInCache();
    }

    public static boolean $r8$lambda$I2VDFtPSAgMfXsvrr9IuB8qKZUo(ChatAttachAlert chatAttachAlert, View view, int i) {
        chatAttachAlert.getClass();
        if (!(view instanceof AttachBotButton)) {
            return false;
        }
        AttachBotButton attachBotButton = (AttachBotButton) view;
        if (chatAttachAlert.destroyed || attachBotButton.currentUser == null) {
            return false;
        }
        chatAttachAlert.onLongClickBotButton(attachBotButton.attachMenuBot, attachBotButton.currentUser);
        return true;
    }

    public static void $r8$lambda$FhQRuxqYtOrjPTWqYE2ayya2naQ(ChatAttachAlert chatAttachAlert, View view) {
        ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
        long j = chatAttachAlert.selectedId;
        if (j >= 0 || (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) == null) {
            return;
        }
        chatAttachAlertBotWebViewLayout.getWebViewContainer().onMainButtonPressed();
    }

    public static void m2139$r8$lambda$MIjeLv6TnwE7wJ4oQvrW6pYQI(ChatAttachAlert chatAttachAlert, View view) {
        if (chatAttachAlert.captionAbove) {
            return;
        }
        chatAttachAlert.toggleCaptionAbove();
    }

    class AnonymousClass17 extends FrameLayout {
        AnonymousClass17(Context context) {
            super(context);
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (ChatAttachAlert.this.captionContainer.getAlpha() <= 0.0f || ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop == 0.0f || ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop == ChatAttachAlert.this.frameLayout2.getTop() + ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop) {
                return;
            }
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
                    ChatAttachAlert.AnonymousClass17.$r8$lambda$PubdtvThn_ZBgAulnjGsGrT2ELg(this.f$0, valueAnimator);
                }
            });
            ChatAttachAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ChatAttachAlert.this.topBackgroundAnimator.setDuration(200L);
            ChatAttachAlert.this.topBackgroundAnimator.start();
            ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
        }

        public static void $r8$lambda$PubdtvThn_ZBgAulnjGsGrT2ELg(AnonymousClass17 anonymousClass17, ValueAnimator valueAnimator) {
            ChatAttachAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.captionContainer.invalidate();
            ChatAttachAlert.this.frameLayout2.invalidate();
            anonymousClass17.invalidate();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    public static void $r8$lambda$X7_CmBWfXWXG1TyPgG3OdMaTBps(final ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider, View view) {
        if (chatAttachAlert.commentTextView == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
        new AIEditorAlert(chatAttachAlert.getContext(), resourcesProvider).setText(chatAttachAlert.commentTextView.getText()).setOnUse(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlert.$r8$lambda$SAecFRB8uZOlzyBz76oqVNB4NzM(this.f$0, (CharSequence) obj);
            }
        }).setOnSend(chatAttachAlert.dialogId, chatAttachAlert.editingMessageObject != null, new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                ChatAttachAlert.$r8$lambda$eFftFWLukeltl4oimbXKq7zfB80(this.f$0, (CharSequence) obj, (Integer) obj2, (Integer) obj3, (Boolean) obj4);
            }
        }).show();
    }

    public static void $r8$lambda$SAecFRB8uZOlzyBz76oqVNB4NzM(ChatAttachAlert chatAttachAlert, CharSequence charSequence) {
        chatAttachAlert.commentTextView.setText(charSequence);
        chatAttachAlert.commentTextView.setSelection(charSequence.length(), charSequence.length());
    }

    public static void $r8$lambda$eFftFWLukeltl4oimbXKq7zfB80(ChatAttachAlert chatAttachAlert, CharSequence charSequence, Integer num, Integer num2, Boolean bool) {
        chatAttachAlert.commentTextView.setText(charSequence);
        chatAttachAlert.commentTextView.setSelection(charSequence.length(), charSequence.length());
        chatAttachAlert.onWriteButtonPressed();
    }

    class AnonymousClass19 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        AnonymousClass19(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, z, resourcesProvider);
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
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatAttachAlert.AnonymousClass19.$r8$lambda$BX3kkabpbZQcVpe7vwZqJ8lan3E(this.f$0, editText, valueAnimator);
                    }
                });
                ValueAnimator valueAnimator = this.messageEditTextAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.messageEditTextAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                valueAnimatorOfFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
            }
            super.dispatchDraw(canvas);
        }

        public static void $r8$lambda$BX3kkabpbZQcVpe7vwZqJ8lan3E(AnonymousClass19 anonymousClass19, EditTextCaption editTextCaption, ValueAnimator valueAnimator) {
            anonymousClass19.getClass();
            editTextCaption.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ChatAttachAlert.this.updateCommentTextViewPosition();
            if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout) {
                ChatAttachAlert.this.photoLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            }
        }

        @Override
        protected void onLineCountChanged(int i, int i2) {
            boolean z = false;
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
            if (!chatAttachAlert.captionAbove) {
                if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                    z = true;
                }
                chatAttachAlert.showAiButton(z);
            }
            ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
            chatAttachAlert2.chatActivityEnterViewAnimateFromTop = chatAttachAlert2.frameLayout2.getTop() + ChatAttachAlert.this.captionEditTextTopOffset;
            ChatAttachAlert.this.frameLayout2.invalidate();
            ChatAttachAlert.this.updateCommentTextViewPosition();
        }

        @Override
        protected void bottomPanelTranslationY(float f) {
            ChatAttachAlert.this.bottomPannelTranslation = f;
            ChatAttachAlert.this.frameLayout2.setTranslationY(f);
            ChatAttachAlert.this.frameLayout2.invalidate();
            ChatAttachAlert.this.checkUi_writeButtonContainerY();
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
        protected void extendActionMode(ActionMode actionMode, Menu menu) {
            BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) baseFragment).getCurrentEncryptedChat(), true, true);
            }
            super.extendActionMode(actionMode, menu);
        }

        @Override
        protected void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                emojiView.shouldLightenBackground = false;
                emojiView.fixBottomTabContainerTranslation = false;
                emojiView.setShouldDrawBackground(false);
                emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
        }
    }

    public static void m2143$r8$lambda$R4KK8WxbkNdWJ37eLexM7mlbjU(ChatAttachAlert chatAttachAlert, View view) {
        if (chatAttachAlert.captionAbove) {
            chatAttachAlert.toggleCaptionAbove();
        }
    }

    public static void $r8$lambda$eNsKa5bakSUf4hUeoC32IIN8UCg(final ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider, View view) {
        if (chatAttachAlert.topCommentTextView == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
        new AIEditorAlert(chatAttachAlert.getContext(), resourcesProvider).setText(chatAttachAlert.topCommentTextView.getText()).setOnUse(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlert.$r8$lambda$aBrklPpzGJxxOv3zFytYXErO9X8(this.f$0, (CharSequence) obj);
            }
        }).setOnSend(chatAttachAlert.dialogId, chatAttachAlert.editingMessageObject != null, new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                ChatAttachAlert.m2147$r8$lambda$gFBrUTy814KTmySWdjOqnoTAOs(this.f$0, (CharSequence) obj, (Integer) obj2, (Integer) obj3, (Boolean) obj4);
            }
        }).show();
    }

    public static void $r8$lambda$aBrklPpzGJxxOv3zFytYXErO9X8(ChatAttachAlert chatAttachAlert, CharSequence charSequence) {
        chatAttachAlert.topCommentTextView.setText(charSequence);
        chatAttachAlert.topCommentTextView.setSelection(charSequence.length(), charSequence.length());
    }

    public static void m2147$r8$lambda$gFBrUTy814KTmySWdjOqnoTAOs(ChatAttachAlert chatAttachAlert, CharSequence charSequence, Integer num, Integer num2, Boolean bool) {
        chatAttachAlert.topCommentTextView.setText(charSequence);
        chatAttachAlert.topCommentTextView.setSelection(charSequence.length(), charSequence.length());
        chatAttachAlert.onWriteButtonPressed();
    }

    public static boolean $r8$lambda$BBkoXQngtsbqesA1F92xuLnCs04(final ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider, final BaseFragment baseFragment, View view) throws Throwable {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        ChatActivity chatActivity;
        final MessageObject messageObject3;
        boolean z;
        boolean z2;
        String str;
        long j;
        CharSequence charSequence;
        String string;
        MessageObject messageObject4;
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        ParcelFileDescriptor parcelFileDescriptor;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor2;
        String str2;
        final Context context2;
        final long j2;
        int i;
        final long j3;
        final ChatActivity chatActivity2;
        AttachAlertLayout attachAlertLayout;
        boolean z3;
        String strSubstring;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
        if ((chatAttachAlert.dialogId == 0 && !(chatAttachAlert.baseFragment instanceof ChatActivity)) || chatAttachAlert.currentLimit - chatAttachAlert.codepointCount < 0 || chatAttachAlert.animatorEphemeralMessageVisibility.getValue()) {
            return false;
        }
        long dialogId = chatAttachAlert.dialogId;
        BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
        if (baseFragment2 instanceof ChatActivity) {
            ChatActivity chatActivity3 = (ChatActivity) baseFragment2;
            chatActivity3.getCurrentChat();
            TLRPC.User currentUser = chatActivity3.getCurrentUser();
            MessageObject replyMessage = chatActivity3.getReplyMessage();
            MessageObject replyTopMessage = chatActivity3.getReplyTopMessage();
            if (chatActivity3.isInScheduleMode() || chatActivity3.getChatMode() == 5) {
                return false;
            }
            messageObject2 = replyTopMessage;
            chatActivity = chatActivity3;
            user = currentUser;
            messageObject = replyMessage;
            dialogId = chatActivity3.getDialogId();
        } else {
            user = MessagesController.getInstance(chatAttachAlert.currentAccount).getUser(Long.valueOf(dialogId));
            messageObject = null;
            messageObject2 = null;
            chatActivity = null;
        }
        MessageSendPreview messageSendPreview = chatAttachAlert.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss();
        }
        MessageSendPreview messageSendPreview2 = new MessageSendPreview(context, resourcesProvider2) {
            @Override
            protected void onEffectChange(long j4) {
                ChatAttachAlert.this.writeButton.setEffect(ChatAttachAlert.this.effectId = j4);
                super.onEffectChange(j4);
            }
        };
        chatAttachAlert.messageSendPreview = messageSendPreview2;
        messageSendPreview2.setSendButton(chatAttachAlert.writeButton, false, new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChatAttachAlert.$r8$lambda$DjvQeRNk9tJwtAOvjvF1twMTWPc(this.f$0, baseFragment, resourcesProvider2, view2);
            }
        });
        ArrayList arrayList = new ArrayList();
        AttachAlertLayout attachAlertLayout2 = chatAttachAlert.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
        String str3 = "";
        if (attachAlertLayout2 == chatAttachAlertPhotoLayout || attachAlertLayout2 == chatAttachAlert.photoPreviewLayout) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlert.photoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.isEmpty()) {
                dialogId = dialogId;
                messageObject3 = null;
                z = false;
                z2 = false;
            } else {
                int iCeil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                messageObject3 = null;
                int i3 = 0;
                int i4 = 0;
                z = false;
                z2 = false;
                while (i3 < iCeil) {
                    MessageObject messageObject5 = messageObject2;
                    int i5 = i3 * 10;
                    MessageObject messageObject6 = messageObject3;
                    int i6 = iCeil;
                    int iMin = Math.min(10, selectedPhotos.size() - i5);
                    long jNextLong = Utilities.random.nextLong();
                    int i7 = i3;
                    int i8 = 0;
                    while (i8 < iMin) {
                        int i9 = i5 + i8;
                        int i10 = iMin;
                        if (i9 >= selectedPhotosOrder.size()) {
                            j = dialogId;
                            str = str3;
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i9));
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            int i11 = i4 + 1;
                            tL_message.id = i4;
                            tL_message.out = true;
                            str = str3;
                            tL_message.from_id = MessagesController.getInstance(chatAttachAlert.currentAccount).getPeer(UserConfig.getInstance(chatAttachAlert.currentAccount).getClientUserId());
                            tL_message.peer_id = MessagesController.getInstance(chatAttachAlert.currentAccount).getPeer(dialogId);
                            boolean z7 = photoEntry.isVideo;
                            if (!z7 && (str2 = photoEntry.imagePath) != null) {
                                tL_message.attachPath = str2;
                            } else {
                                String str4 = photoEntry.path;
                                if (str4 != null) {
                                    tL_message.attachPath = str4;
                                }
                            }
                            if (i10 > 0) {
                                tL_message.grouped_id = jNextLong;
                            }
                            int i12 = photoEntry.width;
                            int i13 = photoEntry.height;
                            int i14 = photoEntry.orientation;
                            if (z7) {
                                if (photoEntry.videoOrientation == -1) {
                                    try {
                                        MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (photoEntry.isLivePhoto()) {
                                                                    j = dialogId;
                                                                    try {
                                                                        if (photoEntry.livePhotoVideoOffset > 0) {
                                                                            File file = new File(photoEntry.path);
                                                                            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                                                                            try {
                                                                                parcelFileDescriptor2 = parcelFileDescriptorOpen;
                                                                                try {
                                                                                    mediaMetadataRetriever3.setDataSource(parcelFileDescriptorOpen.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                                } catch (Exception e) {
                                                                                    e = e;
                                                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                                    photoEntry.videoOrientation = 0;
                                                                                    FileLog.e(e);
                                                                                    if (mediaMetadataRetriever2 != null) {
                                                                                        try {
                                                                                            mediaMetadataRetriever2.release();
                                                                                        } catch (IOException e2) {
                                                                                            FileLog.e(e2);
                                                                                        }
                                                                                    }
                                                                                    if (parcelFileDescriptor2 != null) {
                                                                                        try {
                                                                                            parcelFileDescriptor2.close();
                                                                                        } catch (IOException e3) {
                                                                                            FileLog.e(e3);
                                                                                        }
                                                                                    }
                                                                                    i14 = photoEntry.videoOrientation;
                                                                                    if ((i14 / 90) % 2 == 0) {
                                                                                        i13 = i12;
                                                                                        i12 = i13;
                                                                                    }
                                                                                    if (photoEntry.isLivePhoto()) {
                                                                                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                                                                        tL_message.media = tL_messageMediaPhoto;
                                                                                        tL_messageMediaPhoto.live_photo = true;
                                                                                        tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                                                                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                                                                        tL_photoSize.w = i13;
                                                                                        tL_photoSize.h = i12;
                                                                                        tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                                        tL_message.media.photo.sizes.add(tL_photoSize);
                                                                                        tL_message.media.document = new TLRPC.TL_document();
                                                                                        tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                                                                        tL_documentAttributeVideo.w = i13;
                                                                                        tL_documentAttributeVideo.h = i12;
                                                                                        tL_documentAttributeVideo.duration = photoEntry.duration;
                                                                                        tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                                                                                    } else if (photoEntry.isVideo) {
                                                                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                                                                        tL_message.media = tL_messageMediaDocument;
                                                                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                                                                        tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                                                                        tL_documentAttributeVideo2.w = i13;
                                                                                        tL_documentAttributeVideo2.h = i12;
                                                                                        tL_documentAttributeVideo2.duration = photoEntry.duration;
                                                                                        tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                                                                                    } else {
                                                                                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                                                                        tL_message.media = tL_messageMediaPhoto2;
                                                                                        tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                                                                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                                                                        tL_photoSize2.w = i13;
                                                                                        tL_photoSize2.h = i12;
                                                                                        tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                                        tL_message.media.photo.sizes.add(tL_photoSize2);
                                                                                    }
                                                                                    tL_message.media.spoiler = photoEntry.hasSpoiler;
                                                                                    charSequence = photoEntry.caption;
                                                                                    if (charSequence == null) {
                                                                                        string = str;
                                                                                    } else {
                                                                                        string = charSequence.toString();
                                                                                    }
                                                                                    tL_message.message = string;
                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                        CharSequence[] charSequenceArr = {chatAttachAlert.getCommentView().getText()};
                                                                                        MessageObject.addLinks(true, charSequenceArr[0]);
                                                                                        tL_message.entities = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr, true);
                                                                                        tL_message.message = charSequenceArr[0].toString();
                                                                                    }
                                                                                    if (i7 == 0) {
                                                                                        tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                                                        if (messageObject5 != null) {
                                                                                            tL_messageReplyHeader.flags |= 2;
                                                                                            tL_messageReplyHeader.reply_to_top_id = messageObject5.getId();
                                                                                        }
                                                                                        tL_messageReplyHeader.flags |= 16;
                                                                                        tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                                                        tL_message.reply_to = tL_messageReplyHeader;
                                                                                    }
                                                                                    messageObject4 = new MessageObject(chatAttachAlert.currentAccount, tL_message, true, false);
                                                                                    if (i7 == 0) {
                                                                                        messageObject4.replyMessageObject = messageObject;
                                                                                    }
                                                                                    messageObject4.sendPreviewEntry = photoEntry;
                                                                                    messageObject4.sendPreview = true;
                                                                                    messageObject4.notime = true;
                                                                                    messageObject4.isOutOwnerCached = Boolean.TRUE;
                                                                                    arrayList.add(messageObject4);
                                                                                    if (messageObject6 == null) {
                                                                                        messageObject6 = messageObject4;
                                                                                    }
                                                                                    i4 = i11;
                                                                                    z = true;
                                                                                    z2 = true;
                                                                                    i8++;
                                                                                    iMin = i10;
                                                                                    selectedPhotos = selectedPhotos;
                                                                                    selectedPhotosOrder = selectedPhotosOrder;
                                                                                    str3 = str;
                                                                                    dialogId = j;
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                                    th = th;
                                                                                    parcelFileDescriptor = parcelFileDescriptor2;
                                                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                                    if (mediaMetadataRetriever != null) {
                                                                                        try {
                                                                                            mediaMetadataRetriever.release();
                                                                                        } catch (IOException e4) {
                                                                                            FileLog.e(e4);
                                                                                        }
                                                                                    }
                                                                                    if (parcelFileDescriptor != null) {
                                                                                        try {
                                                                                            parcelFileDescriptor.close();
                                                                                            throw th;
                                                                                        } catch (IOException e5) {
                                                                                            FileLog.e(e5);
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (Exception e6) {
                                                                                e = e6;
                                                                                parcelFileDescriptor2 = parcelFileDescriptorOpen;
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                parcelFileDescriptor2 = parcelFileDescriptorOpen;
                                                                            }
                                                                        }
                                                                        photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                                                        mediaMetadataRetriever2.release();
                                                                        if (parcelFileDescriptor2 != null) {
                                                                            parcelFileDescriptor2.close();
                                                                        }
                                                                    } catch (Exception e7) {
                                                                        e = e7;
                                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                        parcelFileDescriptor2 = null;
                                                                        photoEntry.videoOrientation = 0;
                                                                        FileLog.e(e);
                                                                        if (mediaMetadataRetriever2 != null) {
                                                                            mediaMetadataRetriever2.release();
                                                                        }
                                                                        if (parcelFileDescriptor2 != null) {
                                                                            parcelFileDescriptor2.close();
                                                                        }
                                                                        i14 = photoEntry.videoOrientation;
                                                                        if ((i14 / 90) % 2 == 0) {
                                                                            i13 = i12;
                                                                            i12 = i13;
                                                                        }
                                                                        if (photoEntry.isLivePhoto()) {
                                                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto3 = new TLRPC.TL_messageMediaPhoto();
                                                                            tL_message.media = tL_messageMediaPhoto3;
                                                                            tL_messageMediaPhoto3.live_photo = true;
                                                                            tL_messageMediaPhoto3.photo = new TLRPC.TL_photo();
                                                                            TLRPC.TL_photoSize tL_photoSize3 = new TLRPC.TL_photoSize();
                                                                            tL_photoSize3.w = i13;
                                                                            tL_photoSize3.h = i12;
                                                                            tL_photoSize3.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                            tL_message.media.photo.sizes.add(tL_photoSize3);
                                                                            tL_message.media.document = new TLRPC.TL_document();
                                                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo3 = new TLRPC.TL_documentAttributeVideo();
                                                                            tL_documentAttributeVideo3.w = i13;
                                                                            tL_documentAttributeVideo3.h = i12;
                                                                            tL_documentAttributeVideo3.duration = photoEntry.duration;
                                                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo3);
                                                                        } else if (photoEntry.isVideo) {
                                                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                                                                            tL_message.media = tL_messageMediaDocument2;
                                                                            tL_messageMediaDocument2.document = new TLRPC.TL_document();
                                                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo4 = new TLRPC.TL_documentAttributeVideo();
                                                                            tL_documentAttributeVideo4.w = i13;
                                                                            tL_documentAttributeVideo4.h = i12;
                                                                            tL_documentAttributeVideo4.duration = photoEntry.duration;
                                                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo4);
                                                                        } else {
                                                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto4 = new TLRPC.TL_messageMediaPhoto();
                                                                            tL_message.media = tL_messageMediaPhoto4;
                                                                            tL_messageMediaPhoto4.photo = new TLRPC.TL_photo();
                                                                            TLRPC.TL_photoSize tL_photoSize4 = new TLRPC.TL_photoSize();
                                                                            tL_photoSize4.w = i13;
                                                                            tL_photoSize4.h = i12;
                                                                            tL_photoSize4.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                            tL_message.media.photo.sizes.add(tL_photoSize4);
                                                                        }
                                                                        tL_message.media.spoiler = photoEntry.hasSpoiler;
                                                                        charSequence = photoEntry.caption;
                                                                        if (charSequence == null) {
                                                                            string = str;
                                                                        } else {
                                                                            string = charSequence.toString();
                                                                        }
                                                                        tL_message.message = string;
                                                                        if (TextUtils.isEmpty(string)) {
                                                                            CharSequence[] charSequenceArr2 = {chatAttachAlert.getCommentView().getText()};
                                                                            MessageObject.addLinks(true, charSequenceArr2[0]);
                                                                            tL_message.entities = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr2, true);
                                                                            tL_message.message = charSequenceArr2[0].toString();
                                                                        }
                                                                        if (i7 == 0) {
                                                                            tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                                            if (messageObject5 != null) {
                                                                                tL_messageReplyHeader.flags |= 2;
                                                                                tL_messageReplyHeader.reply_to_top_id = messageObject5.getId();
                                                                            }
                                                                            tL_messageReplyHeader.flags |= 16;
                                                                            tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                                            tL_message.reply_to = tL_messageReplyHeader;
                                                                        }
                                                                        messageObject4 = new MessageObject(chatAttachAlert.currentAccount, tL_message, true, false);
                                                                        if (i7 == 0) {
                                                                            messageObject4.replyMessageObject = messageObject;
                                                                        }
                                                                        messageObject4.sendPreviewEntry = photoEntry;
                                                                        messageObject4.sendPreview = true;
                                                                        messageObject4.notime = true;
                                                                        messageObject4.isOutOwnerCached = Boolean.TRUE;
                                                                        arrayList.add(messageObject4);
                                                                        if (messageObject6 == null) {
                                                                            messageObject6 = messageObject4;
                                                                        }
                                                                        i4 = i11;
                                                                        z = true;
                                                                        z2 = true;
                                                                        i8++;
                                                                        iMin = i10;
                                                                        selectedPhotos = selectedPhotos;
                                                                        selectedPhotosOrder = selectedPhotosOrder;
                                                                        str3 = str;
                                                                        dialogId = j;
                                                                    }
                                                                } else {
                                                                    j = dialogId;
                                                                }
                                                                mediaMetadataRetriever2.release();
                                                            } catch (IOException e8) {
                                                                FileLog.e(e8);
                                                            }
                                                            photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                                            if (parcelFileDescriptor2 != null) {
                                                                parcelFileDescriptor2.close();
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            th = th;
                                                            parcelFileDescriptor = parcelFileDescriptor2;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            if (mediaMetadataRetriever != null) {
                                                                mediaMetadataRetriever.release();
                                                            }
                                                            if (parcelFileDescriptor != null) {
                                                                parcelFileDescriptor.close();
                                                                throw th;
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        photoEntry.videoOrientation = 0;
                                                        FileLog.e(e);
                                                        if (mediaMetadataRetriever2 != null) {
                                                            mediaMetadataRetriever2.release();
                                                        }
                                                        if (parcelFileDescriptor2 != null) {
                                                            parcelFileDescriptor2.close();
                                                        }
                                                    }
                                                    mediaMetadataRetriever2.setDataSource(photoEntry.path);
                                                    parcelFileDescriptor2 = null;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    parcelFileDescriptor2 = null;
                                                    photoEntry.videoOrientation = 0;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                        mediaMetadataRetriever2.release();
                                                    }
                                                    if (parcelFileDescriptor2 != null) {
                                                        parcelFileDescriptor2.close();
                                                    }
                                                    i14 = photoEntry.videoOrientation;
                                                    if ((i14 / 90) % 2 == 0) {
                                                        i13 = i12;
                                                        i12 = i13;
                                                    }
                                                    if (photoEntry.isLivePhoto()) {
                                                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto5 = new TLRPC.TL_messageMediaPhoto();
                                                        tL_message.media = tL_messageMediaPhoto5;
                                                        tL_messageMediaPhoto5.live_photo = true;
                                                        tL_messageMediaPhoto5.photo = new TLRPC.TL_photo();
                                                        TLRPC.TL_photoSize tL_photoSize5 = new TLRPC.TL_photoSize();
                                                        tL_photoSize5.w = i13;
                                                        tL_photoSize5.h = i12;
                                                        tL_photoSize5.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                        tL_message.media.photo.sizes.add(tL_photoSize5);
                                                        tL_message.media.document = new TLRPC.TL_document();
                                                        tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo5 = new TLRPC.TL_documentAttributeVideo();
                                                        tL_documentAttributeVideo5.w = i13;
                                                        tL_documentAttributeVideo5.h = i12;
                                                        tL_documentAttributeVideo5.duration = photoEntry.duration;
                                                        tL_message.media.document.attributes.add(tL_documentAttributeVideo5);
                                                    } else if (photoEntry.isVideo) {
                                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                                                        tL_message.media = tL_messageMediaDocument3;
                                                        tL_messageMediaDocument3.document = new TLRPC.TL_document();
                                                        tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo6 = new TLRPC.TL_documentAttributeVideo();
                                                        tL_documentAttributeVideo6.w = i13;
                                                        tL_documentAttributeVideo6.h = i12;
                                                        tL_documentAttributeVideo6.duration = photoEntry.duration;
                                                        tL_message.media.document.attributes.add(tL_documentAttributeVideo6);
                                                    } else {
                                                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto6 = new TLRPC.TL_messageMediaPhoto();
                                                        tL_message.media = tL_messageMediaPhoto6;
                                                        tL_messageMediaPhoto6.photo = new TLRPC.TL_photo();
                                                        TLRPC.TL_photoSize tL_photoSize6 = new TLRPC.TL_photoSize();
                                                        tL_photoSize6.w = i13;
                                                        tL_photoSize6.h = i12;
                                                        tL_photoSize6.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                        tL_message.media.photo.sizes.add(tL_photoSize6);
                                                    }
                                                    tL_message.media.spoiler = photoEntry.hasSpoiler;
                                                    charSequence = photoEntry.caption;
                                                    if (charSequence == null) {
                                                        string = str;
                                                    } else {
                                                        string = charSequence.toString();
                                                    }
                                                    tL_message.message = string;
                                                    if (TextUtils.isEmpty(string)) {
                                                        CharSequence[] charSequenceArr3 = {chatAttachAlert.getCommentView().getText()};
                                                        MessageObject.addLinks(true, charSequenceArr3[0]);
                                                        tL_message.entities = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr3, true);
                                                        tL_message.message = charSequenceArr3[0].toString();
                                                    }
                                                    if (i7 == 0) {
                                                        tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                        if (messageObject5 != null) {
                                                            tL_messageReplyHeader.flags |= 2;
                                                            tL_messageReplyHeader.reply_to_top_id = messageObject5.getId();
                                                        }
                                                        tL_messageReplyHeader.flags |= 16;
                                                        tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                        tL_message.reply_to = tL_messageReplyHeader;
                                                    }
                                                    messageObject4 = new MessageObject(chatAttachAlert.currentAccount, tL_message, true, false);
                                                    if (i7 == 0) {
                                                        messageObject4.replyMessageObject = messageObject;
                                                    }
                                                    messageObject4.sendPreviewEntry = photoEntry;
                                                    messageObject4.sendPreview = true;
                                                    messageObject4.notime = true;
                                                    messageObject4.isOutOwnerCached = Boolean.TRUE;
                                                    arrayList.add(messageObject4);
                                                    if (messageObject6 == null) {
                                                        messageObject6 = messageObject4;
                                                    }
                                                    i4 = i11;
                                                    z = true;
                                                    z2 = true;
                                                    i8++;
                                                    iMin = i10;
                                                    selectedPhotos = selectedPhotos;
                                                    selectedPhotosOrder = selectedPhotosOrder;
                                                    str3 = str;
                                                    dialogId = j;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    parcelFileDescriptor2 = null;
                                                    th = th;
                                                    parcelFileDescriptor = parcelFileDescriptor2;
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    if (mediaMetadataRetriever != null) {
                                                        mediaMetadataRetriever.release();
                                                    }
                                                    if (parcelFileDescriptor != null) {
                                                        parcelFileDescriptor.close();
                                                        throw th;
                                                    }
                                                    throw th;
                                                }
                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                            } catch (Exception e11) {
                                                e = e11;
                                                j = dialogId;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        j = dialogId;
                                        mediaMetadataRetriever2 = null;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        mediaMetadataRetriever = null;
                                        parcelFileDescriptor = null;
                                    }
                                } else {
                                    j = dialogId;
                                }
                                i14 = photoEntry.videoOrientation;
                            } else {
                                j = dialogId;
                            }
                            if ((i14 / 90) % 2 == 0) {
                                i13 = i12;
                                i12 = i13;
                            }
                            if (photoEntry.isLivePhoto()) {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto7 = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto7;
                                tL_messageMediaPhoto7.live_photo = true;
                                tL_messageMediaPhoto7.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize7 = new TLRPC.TL_photoSize();
                                tL_photoSize7.w = i13;
                                tL_photoSize7.h = i12;
                                tL_photoSize7.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize7);
                                tL_message.media.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo7 = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo7.w = i13;
                                tL_documentAttributeVideo7.h = i12;
                                tL_documentAttributeVideo7.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo7);
                            } else if (photoEntry.isVideo) {
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument4;
                                tL_messageMediaDocument4.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo8 = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo8.w = i13;
                                tL_documentAttributeVideo8.h = i12;
                                tL_documentAttributeVideo8.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo8);
                            } else {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto8 = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto8;
                                tL_messageMediaPhoto8.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize8 = new TLRPC.TL_photoSize();
                                tL_photoSize8.w = i13;
                                tL_photoSize8.h = i12;
                                tL_photoSize8.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize8);
                            }
                            tL_message.media.spoiler = photoEntry.hasSpoiler;
                            charSequence = photoEntry.caption;
                            if (charSequence == null) {
                                string = str;
                            } else {
                                string = charSequence.toString();
                            }
                            tL_message.message = string;
                            if (TextUtils.isEmpty(string) && i7 == 0 && i8 == 0) {
                                CharSequence[] charSequenceArr4 = {chatAttachAlert.getCommentView().getText()};
                                MessageObject.addLinks(true, charSequenceArr4[0]);
                                tL_message.entities = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr4, true);
                                tL_message.message = charSequenceArr4[0].toString();
                            }
                            if (i7 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                if (messageObject5 != null) {
                                    tL_messageReplyHeader.flags |= 2;
                                    tL_messageReplyHeader.reply_to_top_id = messageObject5.getId();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            messageObject4 = new MessageObject(chatAttachAlert.currentAccount, tL_message, true, false);
                            if (i7 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject4.replyMessageObject = messageObject;
                            }
                            messageObject4.sendPreviewEntry = photoEntry;
                            messageObject4.sendPreview = true;
                            messageObject4.notime = true;
                            messageObject4.isOutOwnerCached = Boolean.TRUE;
                            arrayList.add(messageObject4);
                            if (messageObject6 == null && !TextUtils.isEmpty(tL_message.message)) {
                                messageObject6 = messageObject4;
                            }
                            i4 = i11;
                            z = true;
                            z2 = true;
                        }
                        i8++;
                        iMin = i10;
                        selectedPhotos = selectedPhotos;
                        selectedPhotosOrder = selectedPhotosOrder;
                        str3 = str;
                        dialogId = j;
                    }
                    i3 = i7 + 1;
                    iCeil = i6;
                    messageObject2 = messageObject5;
                    messageObject3 = messageObject6;
                }
                dialogId = dialogId;
            }
        } else {
            if (attachAlertLayout2 == chatAttachAlert.contactsLayout) {
                if (TextUtils.isEmpty(chatAttachAlert.getCommentView().getText())) {
                    i2 = 0;
                    z6 = false;
                } else {
                    TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                    tL_message2.id = 0;
                    tL_message2.out = true;
                    tL_message2.from_id = MessagesController.getInstance(chatAttachAlert.currentAccount).getPeer(UserConfig.getInstance(chatAttachAlert.currentAccount).getClientUserId());
                    tL_message2.peer_id = MessagesController.getInstance(chatAttachAlert.currentAccount).getPeer(dialogId);
                    CharSequence[] charSequenceArr5 = {chatAttachAlert.getCommentView().getText()};
                    MessageObject.addLinks(true, charSequenceArr5[0]);
                    tL_message2.entities = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr5, true);
                    tL_message2.message = charSequenceArr5[0].toString();
                    MessageObject messageObject7 = new MessageObject(chatAttachAlert.currentAccount, tL_message2, true, false);
                    messageObject7.sendPreview = true;
                    messageObject7.notime = true;
                    messageObject7.isOutOwnerCached = Boolean.TRUE;
                    arrayList.add(messageObject7);
                    i2 = 1;
                    z6 = true;
                }
                ArrayList<TLRPC.User> selected = chatAttachAlert.contactsLayout.getSelected();
                boolean z8 = z6;
                int i15 = 0;
                while (i15 < selected.size()) {
                    TLRPC.User user2 = selected.get(i15);
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    int i16 = i2 + 1;
                    tL_message3.id = i2;
                    tL_message3.out = true;
                    int i17 = i15;
                    tL_message3.from_id = MessagesController.getInstance(chatAttachAlert.currentAccount).getPeer(UserConfig.getInstance(chatAttachAlert.currentAccount).getClientUserId());
                    tL_message3.peer_id = MessagesController.getInstance(chatAttachAlert.currentAccount).getPeer(dialogId);
                    TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                    tL_message3.media = tL_messageMediaContact;
                    tL_messageMediaContact.phone_number = user2.phone;
                    tL_messageMediaContact.first_name = user2.first_name;
                    tL_messageMediaContact.last_name = user2.last_name;
                    if (!user2.restriction_reason.isEmpty() && user2.restriction_reason.get(0).text.startsWith("BEGIN:VCARD")) {
                        tL_message3.media.vcard = user2.restriction_reason.get(0).text;
                    } else {
                        tL_message3.media.vcard = "";
                    }
                    tL_message3.media.user_id = user2.id;
                    MessageObject messageObject8 = new MessageObject(chatAttachAlert.currentAccount, tL_message3, true, false);
                    messageObject8.sendPreview = true;
                    messageObject8.notime = true;
                    messageObject8.isOutOwnerCached = Boolean.TRUE;
                    arrayList.add(messageObject8);
                    i15 = i17 + 1;
                    i2 = i16;
                    z8 = true;
                }
                z2 = z8;
                messageObject3 = null;
            } else if (attachAlertLayout2 == chatAttachAlert.documentLayout) {
                messageObject3 = null;
                int i18 = 0;
                boolean z9 = false;
                for (int i19 = 0; i19 < chatAttachAlert.documentLayout.selectedFilesOrder.size(); i19++) {
                    String str5 = (String) chatAttachAlert.documentLayout.selectedFilesOrder.get(i19);
                    if (str5 != null) {
                        int iLastIndexOf = str5.lastIndexOf(File.separator);
                        if (iLastIndexOf < 0) {
                            strSubstring = str5;
                            z3 = true;
                        } else {
                            z3 = true;
                            strSubstring = str5.substring(iLastIndexOf + 1);
                        }
                        if (!TextUtils.isEmpty(strSubstring)) {
                            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                            int i20 = i18 + 1;
                            tL_message4.id = i18;
                            tL_message4.out = z3;
                            tL_message4.from_id = MessagesController.getInstance(chatAttachAlert.currentAccount).getPeer(UserConfig.getInstance(chatAttachAlert.currentAccount).getClientUserId());
                            tL_message4.peer_id = MessagesController.getInstance(chatAttachAlert.currentAccount).getPeer(dialogId);
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument5 = new TLRPC.TL_messageMediaDocument();
                            tL_message4.media = tL_messageMediaDocument5;
                            tL_message4.attachPath = str5;
                            tL_messageMediaDocument5.document = new TLRPC.TL_document();
                            TLRPC.Document document = tL_message4.media.document;
                            document.file_name = strSubstring;
                            document.size = new File(str5).length();
                            if (TextUtils.isEmpty(tL_message4.message) && i19 == 0) {
                                z5 = true;
                                z4 = false;
                                CharSequence[] charSequenceArr6 = {chatAttachAlert.getCommentView().getText()};
                                tL_message4.entities = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr6, true);
                                tL_message4.message = charSequenceArr6[0].toString();
                            } else {
                                z4 = false;
                                z5 = true;
                            }
                            MessageObject messageObject9 = new MessageObject(chatAttachAlert.currentAccount, tL_message4, z5, z4);
                            messageObject9.attachPathExists = z5;
                            messageObject9.sendPreview = z5;
                            messageObject9.notime = z5;
                            messageObject9.isOutOwnerCached = Boolean.TRUE;
                            arrayList.add(messageObject9);
                            if (i19 == 0 && messageObject3 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                messageObject3 = messageObject9;
                            }
                            i18 = i20;
                            z9 = true;
                        }
                    }
                }
                z2 = z9;
            } else {
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = chatAttachAlert.audioLayout;
                if (attachAlertLayout2 == chatAttachAlertAudioLayout) {
                    arrayList.addAll(chatAttachAlertAudioLayout.getSelected());
                    if (arrayList.isEmpty()) {
                        messageObject3 = null;
                    } else {
                        messageObject3 = (MessageObject) arrayList.get(0);
                        CharSequence[] charSequenceArr7 = {chatAttachAlert.getCommentView().getText()};
                        MessageObject.addLinks(true, charSequenceArr7[0]);
                        messageObject3.messageOwner.entities = MediaDataController.getInstance(chatAttachAlert.currentAccount).getEntities(charSequenceArr7, true);
                        messageObject3.messageOwner.message = charSequenceArr7[0].toString();
                        if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                            messageObject3 = null;
                        } else {
                            messageObject3.generateCaption();
                        }
                    }
                    if (arrayList.size() > 1) {
                        for (int i21 = 0; i21 < Math.ceil(arrayList.size() / 10.0f); i21++) {
                            int i22 = i21 * 10;
                            int iMin2 = Math.min(10, arrayList.size() - i22);
                            long jNextLong2 = Utilities.random.nextLong();
                            for (int i23 = 0; i23 < iMin2; i23++) {
                                int i24 = i22 + i23;
                                if (i24 < arrayList.size()) {
                                    ((MessageObject) arrayList.get(i24)).messageOwner.grouped_id = jNextLong2;
                                }
                            }
                        }
                    }
                    dialogId = dialogId;
                    z = false;
                    z2 = true;
                } else {
                    dialogId = dialogId;
                    messageObject3 = null;
                    z = false;
                    z2 = false;
                }
            }
            z = false;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(chatAttachAlert.containerView, resourcesProvider2, chatAttachAlert.writeButton);
        if (messageObject3 == null || !((attachAlertLayout = chatAttachAlert.currentAttachLayout) == chatAttachAlert.photoLayout || attachAlertLayout == chatAttachAlert.photoPreviewLayout)) {
            context2 = context;
            j2 = dialogId;
            i = 2;
        } else {
            j2 = dialogId;
            i = 2;
            final MessagePreviewView.ToggleButton toggleButton = new MessagePreviewView.ToggleButton(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), resourcesProvider2);
            context2 = context;
            resourcesProvider2 = resourcesProvider2;
            TLRPC.Message message = messageObject3.messageOwner;
            boolean z10 = chatAttachAlert.captionAbove;
            message.invert_media = z10;
            toggleButton.setState(!z10, false);
            toggleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatAttachAlert.$r8$lambda$40VJsl0MBodsHduJyE9rsnaqNxU(this.f$0, messageObject3, toggleButton, view2);
                }
            });
            itemOptionsMakeOptions.addView(toggleButton);
            if (chatAttachAlert.editingMessageObject == null) {
                itemOptionsMakeOptions.addGap();
            }
        }
        boolean zIsUserSelf = UserObject.isUserSelf(user);
        if (chatAttachAlert.editingMessageObject == null && ((chatActivity == null || !ChatObject.isMonoForum(chatActivity.getCurrentChat())) && ((chatActivity != null && chatActivity.canScheduleMessage()) || chatAttachAlert.currentAttachLayout.canScheduleMessages()))) {
            itemOptionsMakeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert chatAttachAlert2 = this.f$0;
                    AlertsCreator.createScheduleDatePickerDialog(chatAttachAlert2.getContext(), j2, new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z11, int i25, int i26) {
                            ChatAttachAlert.m2144$r8$lambda$RNMkiyAT0gG67AbNzAdULcAGxc(chatAttachAlert2, z11, i25, i26);
                        }
                    }, resourcesProvider2);
                }
            });
        }
        AttachAlertLayout attachAlertLayout3 = chatAttachAlert.currentAttachLayout;
        if ((attachAlertLayout3 == chatAttachAlert.photoLayout || attachAlertLayout3 == chatAttachAlert.photoPreviewLayout) && attachAlertLayout3.getSelectedItemsCount() == 1 && chatActivity != null && ChatObject.isMonoForum(chatActivity.getCurrentChat())) {
            j3 = j2;
            chatActivity2 = chatActivity;
            itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.$r8$lambda$bsB5u1OHQcAAbT_1AIugPdj7ajk(this.f$0, j3, chatActivity2, resourcesProvider2);
                }
            });
        } else {
            j3 = j2;
            chatActivity2 = chatActivity;
        }
        if (chatAttachAlert.editingMessageObject == null && !zIsUserSelf) {
            itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.$r8$lambda$li1ySXOfbxxPj2b_5TBBbjuYuJU(this.f$0);
                }
            });
        }
        if (chatAttachAlert.editingMessageObject == null && z && chatActivity2 != null && ChatObject.isChannelAndNotMegaGroup(chatActivity2.getCurrentChat()) && chatActivity2.getCurrentChatInfo() != null && chatActivity2.getCurrentChatInfo().paid_media_allowed) {
            int i25 = R.drawable.menu_feature_paid;
            int i26 = R.string.PaidMediaButton;
            final ActionBarMenuSubItem last = itemOptionsMakeOptions.add(i25, LocaleController.getString(i26), (Runnable) null).getLast();
            last.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChatAttachAlert.$r8$lambda$HiHkiezWAPrbs5WybWkvHbNCZH8(this.f$0, context2, last, resourcesProvider2, view2);
                }
            });
            long starsPrice = chatAttachAlert.photoLayout.getStarsPrice();
            if (starsPrice > 0) {
                last.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                last.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                last.setText(LocaleController.getString(i26));
                last.setSubtext(null);
            }
            chatAttachAlert.messageSendPreview.setStars(starsPrice);
        }
        itemOptionsMakeOptions.setupSelectors();
        chatAttachAlert.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
        chatAttachAlert.messageSendPreview.setMessageObjects(arrayList);
        if (chatAttachAlert.editingMessageObject == null && j3 >= 0 && z2) {
            chatAttachAlert.messageSendPreview.allowEffectSelector(baseFragment);
            chatAttachAlert.messageSendPreview.setEffectId(chatAttachAlert.effectId);
        }
        chatAttachAlert.messageSendPreview.show();
        try {
            view.performHapticFeedback(3, i);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void $r8$lambda$DjvQeRNk9tJwtAOvjvF1twMTWPc(final ChatAttachAlert chatAttachAlert, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, View view) {
        AttachAlertLayout attachAlertLayout;
        ChatAttachAlert chatAttachAlert2;
        boolean zSendPressed;
        MessageSendPreview messageSendPreview;
        MessageSendPreview messageSendPreview2 = chatAttachAlert.messageSendPreview;
        final long selectedEffect = messageSendPreview2 != null ? messageSendPreview2.getSelectedEffect() : 0L;
        ChatActivityEnterView.SendButton sendButton = chatAttachAlert.writeButton;
        chatAttachAlert.effectId = selectedEffect;
        sendButton.setEffect(selectedEffect);
        chatAttachAlert.forceKeyboardOnDismiss();
        if (chatAttachAlert.currentLimit - chatAttachAlert.codepointCount < 0) {
            AndroidUtilities.shakeView(chatAttachAlert.captionLimitView);
            AndroidUtilities.shakeView(chatAttachAlert.topCaptionLimitView);
            try {
                chatAttachAlert.writeButton.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(chatAttachAlert.currentAccount).premiumFeaturesBlocked() && MessagesController.getInstance(chatAttachAlert.currentAccount).captionLengthLimitPremium > chatAttachAlert.codepointCount) {
                chatAttachAlert.showCaptionLimitBulletin(baseFragment);
            }
            MessageSendPreview messageSendPreview3 = chatAttachAlert.messageSendPreview;
            if (messageSendPreview3 != null) {
                messageSendPreview3.dismiss(false);
                chatAttachAlert.messageSendPreview = null;
                return;
            }
            return;
        }
        if (chatAttachAlert.editingMessageObject == null) {
            BaseFragment baseFragment2 = chatAttachAlert.baseFragment;
            if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(chatAttachAlert.getContext(), ((ChatActivity) chatAttachAlert.baseFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i, int i2) {
                        ChatAttachAlert.$r8$lambda$XmCBZFN60f3YHtj9lIelC7lHpaU(this.f$0, selectedEffect, z, i, i2);
                    }
                }, resourcesProvider);
                chatAttachAlert2 = chatAttachAlert;
            } else {
                attachAlertLayout = chatAttachAlert.currentAttachLayout;
                if (attachAlertLayout != chatAttachAlert.photoLayout || attachAlertLayout == chatAttachAlert.photoPreviewLayout) {
                    chatAttachAlert2 = chatAttachAlert;
                    zSendPressed = chatAttachAlert2.sendPressed(true, 0, 0, selectedEffect, chatAttachAlert.isCaptionAbove());
                } else {
                    if (!attachAlertLayout.sendSelectedItems(true, 0, 0, selectedEffect, chatAttachAlert.isCaptionAbove())) {
                        chatAttachAlert.allowPassConfirmationAlert = true;
                        chatAttachAlert.dismiss();
                    }
                    chatAttachAlert2 = chatAttachAlert;
                    zSendPressed = false;
                }
                messageSendPreview = chatAttachAlert2.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.dismiss(!zSendPressed);
                    chatAttachAlert2.messageSendPreview = null;
                }
            }
        } else {
            attachAlertLayout = chatAttachAlert.currentAttachLayout;
            if (attachAlertLayout != chatAttachAlert.photoLayout) {
                chatAttachAlert2 = chatAttachAlert;
                zSendPressed = chatAttachAlert2.sendPressed(true, 0, 0, selectedEffect, chatAttachAlert.isCaptionAbove());
            } else {
                chatAttachAlert2 = chatAttachAlert;
                zSendPressed = chatAttachAlert2.sendPressed(true, 0, 0, selectedEffect, chatAttachAlert.isCaptionAbove());
            }
            messageSendPreview = chatAttachAlert2.messageSendPreview;
            if (messageSendPreview != null) {
                messageSendPreview.dismiss(!zSendPressed);
                chatAttachAlert2.messageSendPreview = null;
            }
        }
        chatAttachAlert2.setCaptionAbove(false, false);
    }

    public static void $r8$lambda$XmCBZFN60f3YHtj9lIelC7lHpaU(ChatAttachAlert chatAttachAlert, long j, boolean z, int i, int i2) {
        ChatAttachAlert chatAttachAlert2;
        boolean zSendPressed;
        AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
        if (attachAlertLayout == chatAttachAlert.photoLayout || attachAlertLayout == chatAttachAlert.photoPreviewLayout) {
            chatAttachAlert2 = chatAttachAlert;
            zSendPressed = chatAttachAlert2.sendPressed(z, i, i2, j, chatAttachAlert.isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(z, i, i2, j, chatAttachAlert.isCaptionAbove())) {
                chatAttachAlert.allowPassConfirmationAlert = true;
                chatAttachAlert.dismiss();
            }
            zSendPressed = false;
            chatAttachAlert2 = chatAttachAlert;
        }
        MessageSendPreview messageSendPreview = chatAttachAlert2.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(!zSendPressed);
            chatAttachAlert2.messageSendPreview = null;
        }
    }

    public static void $r8$lambda$40VJsl0MBodsHduJyE9rsnaqNxU(ChatAttachAlert chatAttachAlert, MessageObject messageObject, MessagePreviewView.ToggleButton toggleButton, View view) {
        MessagePreviewView.ToggleButton toggleButton2;
        chatAttachAlert.setCaptionAbove(!chatAttachAlert.captionAbove);
        TLRPC.Message message = messageObject.messageOwner;
        boolean z = chatAttachAlert.captionAbove;
        message.invert_media = z;
        toggleButton.setState(!z, true);
        chatAttachAlert.messageSendPreview.changeMessage(messageObject);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
        if (chatAttachAlertPhotoLayout != null && (toggleButton2 = chatAttachAlertPhotoLayout.captionItem) != null) {
            toggleButton2.setState(!chatAttachAlert.captionAbove, true);
        }
        chatAttachAlert.messageSendPreview.scrollTo(!chatAttachAlert.captionAbove);
    }

    public static void m2144$r8$lambda$RNMkiyAT0gG67AbNzAdULcAGxc(ChatAttachAlert chatAttachAlert, boolean z, int i, int i2) {
        ChatAttachAlert chatAttachAlert2;
        boolean zSendPressed;
        MessageSendPreview messageSendPreview = chatAttachAlert.messageSendPreview;
        long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        ChatActivityEnterView.SendButton sendButton = chatAttachAlert.writeButton;
        chatAttachAlert.effectId = selectedEffect;
        sendButton.setEffect(selectedEffect);
        AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
        if (attachAlertLayout == chatAttachAlert.photoLayout || attachAlertLayout == chatAttachAlert.photoPreviewLayout) {
            chatAttachAlert2 = chatAttachAlert;
            zSendPressed = chatAttachAlert2.sendPressed(z, i, i2, selectedEffect, chatAttachAlert.isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(z, i, i2, selectedEffect, chatAttachAlert.isCaptionAbove())) {
                chatAttachAlert.dismiss();
            }
            zSendPressed = false;
            chatAttachAlert2 = chatAttachAlert;
        }
        MessageSendPreview messageSendPreview2 = chatAttachAlert2.messageSendPreview;
        if (messageSendPreview2 != null) {
            messageSendPreview2.dismiss(!zSendPressed);
            chatAttachAlert2.messageSendPreview = null;
        }
    }

    public static void $r8$lambda$bsB5u1OHQcAAbT_1AIugPdj7ajk(final ChatAttachAlert chatAttachAlert, long j, final ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider) {
        Context context = chatAttachAlert.getContext();
        int i = chatAttachAlert.currentAccount;
        MessageSuggestionParams messageSuggestionParamsEmpty = chatActivity.messageSuggestionParams;
        if (messageSuggestionParamsEmpty == null) {
            messageSuggestionParamsEmpty = MessageSuggestionParams.empty();
        }
        new MessageSuggestionOfferSheet(context, i, j, messageSuggestionParamsEmpty, chatActivity, resourcesProvider, 0, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlert.$r8$lambda$YQD6CU7maB8c1qx3VP2tUWKIDH4(this.f$0, chatActivity, (MessageSuggestionParams) obj);
            }
        }).show();
    }

    public static void $r8$lambda$YQD6CU7maB8c1qx3VP2tUWKIDH4(ChatAttachAlert chatAttachAlert, ChatActivity chatActivity, MessageSuggestionParams messageSuggestionParams) {
        chatAttachAlert.getClass();
        chatActivity.messageSuggestionParams = messageSuggestionParams;
        boolean zSendPressed = chatAttachAlert.sendPressed(true, 0, 0, chatAttachAlert.effectId, chatAttachAlert.isCaptionAbove());
        MessageSendPreview messageSendPreview = chatAttachAlert.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(!zSendPressed);
            chatAttachAlert.messageSendPreview = null;
        }
    }

    public static void $r8$lambda$li1ySXOfbxxPj2b_5TBBbjuYuJU(ChatAttachAlert chatAttachAlert) {
        ChatAttachAlert chatAttachAlert2;
        boolean zSendPressed;
        MessageSendPreview messageSendPreview = chatAttachAlert.messageSendPreview;
        long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        ChatActivityEnterView.SendButton sendButton = chatAttachAlert.writeButton;
        chatAttachAlert.effectId = selectedEffect;
        sendButton.setEffect(selectedEffect);
        AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
        if (attachAlertLayout == chatAttachAlert.photoLayout || attachAlertLayout == chatAttachAlert.photoPreviewLayout) {
            chatAttachAlert2 = chatAttachAlert;
            zSendPressed = chatAttachAlert2.sendPressed(false, 0, 0, selectedEffect, chatAttachAlert.isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(false, 0, 0, selectedEffect, chatAttachAlert.isCaptionAbove())) {
                chatAttachAlert.dismiss();
            }
            zSendPressed = false;
            chatAttachAlert2 = chatAttachAlert;
        }
        MessageSendPreview messageSendPreview2 = chatAttachAlert2.messageSendPreview;
        if (messageSendPreview2 != null) {
            messageSendPreview2.dismiss(!zSendPressed);
            chatAttachAlert2.messageSendPreview = null;
        }
    }

    public static void $r8$lambda$HiHkiezWAPrbs5WybWkvHbNCZH8(final ChatAttachAlert chatAttachAlert, Context context, final ActionBarMenuSubItem actionBarMenuSubItem, Theme.ResourcesProvider resourcesProvider, View view) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
        if (chatAttachAlertPhotoLayout == null) {
            return;
        }
        StarsIntroActivity.showMediaPriceSheet(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChatAttachAlert.$r8$lambda$9IloRWtj3AAsL2UvJ97cWooOQaE(this.f$0, actionBarMenuSubItem, (Long) obj, (Runnable) obj2);
            }
        }, resourcesProvider);
    }

    public static void $r8$lambda$9IloRWtj3AAsL2UvJ97cWooOQaE(ChatAttachAlert chatAttachAlert, ActionBarMenuSubItem actionBarMenuSubItem, Long l, Runnable runnable) {
        chatAttachAlert.getClass();
        runnable.run();
        chatAttachAlert.photoLayout.setStarsPrice(l.longValue());
        if (l.longValue() > 0) {
            actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
            actionBarMenuSubItem.setSubtext(LocaleController.formatPluralString("Stars", (int) l.longValue(), new Object[0]));
            chatAttachAlert.messageSendPreview.setStars(l.longValue());
        } else {
            actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaButton));
            actionBarMenuSubItem.setSubtext(null);
            chatAttachAlert.messageSendPreview.setStars(0L);
        }
    }

    public static int $r8$lambda$YIAXGHoWjLDEYh1xpDeyOwOpzyk(ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider, boolean z) {
        chatAttachAlert.getClass();
        float f = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
        int color = Theme.getColor(z ? Theme.key_windowBackgroundGray : Theme.key_dialogBackgroundGray, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
        if (chatAttachAlert.hasOverridenWebviewBackgroundColor) {
            return ColorUtils.blendARGB(color2, chatAttachAlert.overridenWebviewBackgroundColor, 0.75f);
        }
        return BlurredBackgroundProviderImpl.solveSrcColor(color, color2, f);
    }

    public static int m2137$r8$lambda$JFuvbyhZmR6gkd84Oyl3s5Y(ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (chatAttachAlert.hasOverridenWebviewBackgroundColor) {
            return 0;
        }
        return z ? 687865855 : -1;
    }

    public static int m2138$r8$lambda$JuCIGbOUgFeNpxVqRGDzkJprQA(ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (chatAttachAlert.hasOverridenWebviewBackgroundColor) {
            return 0;
        }
        return z ? 352321535 : -1;
    }

    public static int $r8$lambda$UDSfsEPHPrd3oEgJ0CaN9t0zedM(ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (chatAttachAlert.hasOverridenWebviewBackgroundColor) {
            return AndroidUtilities.computePerceivedBrightness(chatAttachAlert.overridenWebviewBackgroundColor) > 0.72f ? 536870912 : 1090519039;
        }
        return z ? 0 : 536870912;
    }

    public int getEmojiPadding() {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
        if (attachAlertLayout == chatAttachAlertPollLayout && chatAttachAlertPollLayout.emojiView != null) {
            return chatAttachAlertPollLayout.getEmojiPadding();
        }
        ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
        if (attachAlertLayout == chatAttachAlertPollLayout2 && chatAttachAlertPollLayout2.emojiView != null) {
            return chatAttachAlertPollLayout2.getEmojiPadding();
        }
        if (this.captionAbove) {
            return this.topCommentTextView.getEmojiPadding();
        }
        return this.commentTextView.getEmojiPadding();
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
            int iMin = Math.min(10, selectedPhotos.size() - i2);
            Utilities.random.nextLong();
            for (int i3 = 0; i3 < iMin; i3++) {
                int i4 = i2 + i3;
                if (i4 < selectedPhotosOrder.size()) {
                    CharSequence charSequence = ((MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i4))).caption;
                    String string = charSequence == null ? "" : charSequence.toString();
                    if (getCommentView() != null && TextUtils.isEmpty(string) && i3 == 0) {
                        string = getCommentView().getText().toString();
                    }
                    if (TextUtils.isEmpty(string)) {
                        continue;
                    } else {
                        if (z) {
                            return false;
                        }
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public void checkUi_writeButtonContainerY() {
        FrameLayout frameLayout = this.topCommentContainer;
        if (frameLayout == null || frameLayout.getVisibility() != 0 || this.topCommentContainer.getAlpha() == 0.0f) {
            this.writeButtonContainer.setTranslationY(this.bottomPannelTranslation);
            this.writeButton.setAlpha(1.0f);
            return;
        }
        float floatValue = this.animatorCaptionAbove.getFloatValue();
        float fAbs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, floatValue));
        this.writeButton.setAlpha(fAbs * fAbs * fAbs * fAbs);
        this.writeButtonContainer.setTranslationY(AndroidUtilities.lerp(this.bottomPannelTranslation, ((this.topCommentContainer.getTop() + this.topCommentContainer.getTranslationY()) - this.writeButtonContainer.getTop()) + AndroidUtilities.dp(8.0f), CubicBezierInterpolator.EASE_BOTH.getInterpolation(floatValue)));
    }

    private void checkUi_bottomFade() {
        float floatValue = this.animatorCaptionVisible.getFloatValue();
        this.bottomFadeView.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - this.animatorActionBarVisible.getFloatValue()) * (1.0f - floatValue))), 1.0f - ((1.0f - this.animatorCaptionAbove.getFloatValue()) * floatValue)));
    }

    public boolean isCaptionAbove() {
        if (!this.captionAbove) {
            return false;
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        return attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout;
    }

    @Override
    protected void onStart() {
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

    public void onWriteButtonPressed() {
        MessageObject messageObject = this.editingMessageObject;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.editingMessageObject.getDialogId())) {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                MessageSuggestionParams messageSuggestionParamsOf = chatActivity.messageSuggestionParams;
                if (messageSuggestionParamsOf == null) {
                    messageSuggestionParamsOf = MessageSuggestionParams.of(this.editingMessageObject.messageOwner.suggested_post);
                }
                if (!StarsController.isEnoughAmount(this.currentAccount, messageSuggestionParamsOf.amount)) {
                    chatActivity.showSuggestionOfferForEditMessage(messageSuggestionParamsOf);
                    return;
                }
            }
        }
        if (this.currentLimit - this.codepointCount < 0) {
            AndroidUtilities.shakeView(this.captionLimitView);
            AndroidUtilities.shakeView(this.topCaptionLimitView);
            try {
                this.writeButton.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium <= this.codepointCount) {
                return;
            }
            showCaptionLimitBulletin(this.baseFragment);
            return;
        }
        if (this.editingMessageObject == null) {
            BaseFragment baseFragment2 = this.baseFragment;
            if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.baseFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i, int i2) {
                        ChatAttachAlert.$r8$lambda$fxB7E9TMGIQPR3iW5qo7H3x8kuY(this.f$0, z, i, i2);
                    }
                }, this.resourcesProvider);
                return;
            }
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(true, 0, 0, this.effectId, isCaptionAbove());
        } else {
            if (attachAlertLayout.sendSelectedItems(true, 0, 0, this.effectId, isCaptionAbove())) {
                return;
            }
            this.allowPassConfirmationAlert = true;
            dismiss();
        }
    }

    public static void $r8$lambda$fxB7E9TMGIQPR3iW5qo7H3x8kuY(ChatAttachAlert chatAttachAlert, boolean z, int i, int i2) {
        AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
        if (attachAlertLayout == chatAttachAlert.photoLayout || attachAlertLayout == chatAttachAlert.photoPreviewLayout) {
            chatAttachAlert.sendPressed(z, i, 0, chatAttachAlert.effectId, chatAttachAlert.isCaptionAbove());
        } else {
            if (attachAlertLayout.sendSelectedItems(z, i, i2, 0L, chatAttachAlert.isCaptionAbove())) {
                return;
            }
            chatAttachAlert.allowPassConfirmationAlert = true;
            chatAttachAlert.dismiss();
        }
    }

    public void updateCommentTextViewPosition() {
        float y;
        this.commentTextView.getLocationOnScreen(this.commentTextViewLocation);
        if (this.mentionContainer != null) {
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            if ((attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) && this.captionAbove) {
                y = (this.topCommentContainer.getY() - this.mentionContainer.getTop()) + (this.topCommentContainer.getMeasuredHeight() * this.topCommentContainer.getAlpha());
            } else {
                y = -this.commentTextView.getHeight();
            }
            if (Math.abs(this.mentionContainer.getTranslationY() - y) > 0.5f) {
                this.mentionContainer.setTranslationY(y);
                this.mentionContainer.invalidate();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.checkCameraViewPosition();
                }
            }
        }
        checkUi_writeButtonContainerY();
    }

    public int getCommentTextViewTop() {
        return this.commentTextViewLocation[1];
    }

    public void showCaptionLimitBulletin(final BaseFragment baseFragment) {
        if ((baseFragment instanceof ChatActivity) && ChatObject.isChannelAndNotMegaGroup(((ChatActivity) baseFragment).getCurrentChat())) {
            BulletinFactory.of(this.sizeNotifierFrameLayout, this.resourcesProvider).createCaptionLimitBulletin(MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium, new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.m2150$r8$lambda$lMEaQPY4V7aBRO_jkGQA1N3Wic(this.f$0, baseFragment);
                }
            }).show();
        }
    }

    public static void m2150$r8$lambda$lMEaQPY4V7aBRO_jkGQA1N3Wic(ChatAttachAlert chatAttachAlert, BaseFragment baseFragment) {
        chatAttachAlert.dismiss(true);
        if (baseFragment != null) {
            baseFragment.presentFragment(new PremiumPreviewFragment("caption_limit"));
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            AndroidUtilities.setLightStatusBar(this, baseFragment.isLightStatusBar());
        }
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground)) > 0.699999988079071d;
    }

    public void onLongClickBotButton(final TLRPC.TL_attachMenuBot tL_attachMenuBot, final TLRPC.User user) {
        String userName = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : UserObject.getUserName(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
            i++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String string = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog.Builder title = new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.BotRemoveFromMenuTitle));
        if (tL_attachMenuBot == null) {
            string = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        title.setMessage(AndroidUtilities.replaceTags(string)).setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                ChatAttachAlert.$r8$lambda$C98SxycoGKwhpG2rrT2eYWXO6uE(this.f$0, tL_attachMenuBot, user, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).show();
    }

    public static void $r8$lambda$C98SxycoGKwhpG2rrT2eYWXO6uE(final ChatAttachAlert chatAttachAlert, final TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, AlertDialog alertDialog, int i) {
        if (tL_attachMenuBot != null) {
            chatAttachAlert.getClass();
            TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
            tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(chatAttachAlert.currentAccount).getInputUser(user);
            tL_messages_toggleBotInAttachMenu.enabled = false;
            ConnectionsManager.getInstance(chatAttachAlert.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatAttachAlert.$r8$lambda$uB_4HQGk5ZvVS6SfqgAUr0aPAvI(this.f$0, tL_attachMenuBot, tLObject, tL_error);
                }
            }, 66);
            return;
        }
        MediaDataController.getInstance(chatAttachAlert.currentAccount).removeInline(user.id);
    }

    public static void $r8$lambda$uB_4HQGk5ZvVS6SfqgAUr0aPAvI(final ChatAttachAlert chatAttachAlert, final TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatAttachAlert.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.$r8$lambda$nXXrRirSMwlse43Wuoed_HCqyAI(this.f$0, tL_attachMenuBot);
            }
        });
    }

    public static void $r8$lambda$nXXrRirSMwlse43Wuoed_HCqyAI(ChatAttachAlert chatAttachAlert, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        MediaDataController.getInstance(chatAttachAlert.currentAccount).loadAttachMenuBots(false, true);
        if (chatAttachAlert.currentAttachLayout == chatAttachAlert.botAttachLayouts.get(tL_attachMenuBot.bot_id)) {
            chatAttachAlert.showLayout(chatAttachAlert.photoLayout);
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
        updateDoneItemEnabled();
        this.openTransitionFinished = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), 0);
            this.navBarColor = alphaComponent;
            AndroidUtilities.setNavigationBarColor((Dialog) this, alphaComponent, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.hasOverridenWebviewBackgroundColor) {
            this.hasOverridenWebviewBackgroundColor = false;
            this.actionBar.updateColors();
            this.actionBar.invalidate();
            onCurrentLayoutAnimatorChanged();
        }
    }

    public void setEditingMessageObject(int i, MessageObject messageObject) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.photoLayout) != null) {
            chatAttachAlertPhotoLayout.clearSelectedPhotos();
        }
        if (this.editingMessageObject == messageObject && this.editType == i) {
            return;
        }
        this.editingMessageObject = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            if (this.editingMessageObject.isMusic()) {
                i = 2;
            } else {
                i = this.editingMessageObject.isDocument() ? 1 : 0;
            }
        }
        this.editType = i;
        if (this.editingMessageObject != null) {
            this.maxSelectedPhotos = 1;
            this.allowOrder = false;
        } else {
            this.maxSelectedPhotos = -1;
            this.allowOrder = true;
        }
        this.buttonsAdapter.notifyDataSetChanged();
        updateCountButton(0);
    }

    public MessageObject getEditingMessageObject() {
        return this.editingMessageObject;
    }

    protected void applyCaption() {
        if (getCommentView().length() <= 0) {
            return;
        }
        this.currentAttachLayout.applyCaption(getCommentView().getText());
    }

    private boolean sendPressed(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        if (this.buttonPressed) {
            return false;
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            TLRPC.Chat currentChat = chatActivity.getCurrentChat();
            if (chatActivity.getCurrentUser() != null || ((ChatObject.isChannel(currentChat) && currentChat.megagroup) || !ChatObject.isChannel(currentChat))) {
                MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean("silent_" + chatActivity.getDialogId(), !z).commit();
            }
        }
        if (checkCaption(getCommentView().getText())) {
            return true;
        }
        applyCaption();
        if (this.animatorEphemeralMessageVisibility.getValue()) {
            setButtonPressed(true);
            this.delegate.didPressedButton(7, true, z, i, i2, j, z2, false, 0L);
            return true;
        }
        int i3 = this.currentAccount;
        long dialogId = getDialogId();
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        return AlertsCreator.ensurePaidMessageConfirmation(i3, dialogId, (attachAlertLayout != null ? attachAlertLayout.getSelectedItemsCount() : 1) + getAdditionalMessagesCount(), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlert.$r8$lambda$nAAW3lCEGJLztKLZU0RDtcHFb5Y(this.f$0, z, i, i2, j, z2, (Long) obj);
            }
        });
    }

    public static void $r8$lambda$nAAW3lCEGJLztKLZU0RDtcHFb5Y(ChatAttachAlert chatAttachAlert, boolean z, int i, int i2, long j, boolean z2, Long l) {
        chatAttachAlert.setButtonPressed(true);
        chatAttachAlert.delegate.didPressedButton(7, true, z, i, i2, j, z2, false, l.longValue());
    }

    public void setButtonPressed(boolean z) {
        this.buttonPressed = z;
    }

    public void openAttachLayoutForType(int i) {
        if (i == 3) {
            if (this.musicEnabled || !checkCanRemoveRestrictionsByBoosts()) {
                BaseFragment baseFragment = this.baseFragment;
                Activity parentActivity = baseFragment != null ? baseFragment.getParentActivity() : null;
                if (parentActivity != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 33) {
                        if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                            return;
                        }
                    } else if (i2 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                }
                openAudioLayout(true);
                return;
            }
            return;
        }
        if (i == 6 && AndroidUtilities.isMapsInstalled(this.baseFragment)) {
            if (this.locationLayout == null) {
                AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), this.resourcesProvider, (this.isPollAttach || this.restrictEphemeralMessageTypes) ? false : true);
                this.locationLayout = chatAttachAlertLocationLayout;
                attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = this.locationActivityDelegate;
                if (locationActivityDelegate != null) {
                    chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                } else if (this.baseFragment instanceof ChatActivity) {
                    chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() {
                        @Override
                        public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i3, boolean z, int i4, long j) {
                            ((ChatActivity) this.f$0.baseFragment).didSelectLocation(messageMedia, i3, z, i4, j);
                        }
                    });
                }
            }
            showLayout(this.locationLayout);
        }
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
        } else if (attachAlertLayout == this.todoLayout) {
            j = 12;
        } else if (attachAlertLayout == this.emojiLayout) {
            j = 14;
        } else if (attachAlertLayout == this.stickersLayout) {
            j = 13;
        } else if (attachAlertLayout == this.richLayout) {
            j = 16;
        }
        showLayout(attachAlertLayout, j);
    }

    private void showPollLayout(boolean z, Boolean bool) {
        ChatAttachAlert chatAttachAlert;
        if (this.pollLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            chatAttachAlert = this;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(chatAttachAlert, getContext(), false, this.resourcesProvider, bool);
            chatAttachAlert.pollLayout = chatAttachAlertPollLayout;
            attachAlertLayoutArr[1] = chatAttachAlertPollLayout;
            chatAttachAlertPollLayout.setDelegate(new ChatAttachAlertPollLayout.PollCreateActivityDelegate() {
                @Override
                public final void sendPoll(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z2, int i, long j) {
                    ((ChatActivity) this.f$0.baseFragment).sendPoll((TLRPC.TL_messageMediaPoll) messageMedia, charSequence, pollAttachedMediaPack, arrayList, z2, i, j);
                }
            });
        } else {
            chatAttachAlert = this;
        }
        showLayout(chatAttachAlert.pollLayout, 9L, z);
    }

    public void setupPoll(Boolean bool) {
        this.typeButtonsAvailable = false;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        showPollLayout(false, bool);
    }

    private void showLayout(AttachAlertLayout attachAlertLayout, long j) {
        showLayout(attachAlertLayout, j, true);
    }

    private void showLayout(final AttachAlertLayout attachAlertLayout, long j, boolean z) {
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal;
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal2;
        int iDp = 0;
        if (this.viewChangeAnimator == null && this.commentsAnimator == null) {
            AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
            if (attachAlertLayout2 == attachAlertLayout) {
                attachAlertLayout2.scrollToTop();
                return;
            }
            if (attachAlertLayout == this.todoLayout && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                new PremiumFeatureBottomSheet(this.baseFragment, 39, false).show();
                return;
            }
            this.animatorToggleCaptionSupported.setValue(j == 1, z);
            this.animatorCurrentVisibleLayout.replace(Long.valueOf(j), z);
            this.botButtonWasVisible = false;
            this.botButtonProgressWasVisible = false;
            this.botMainButtonOffsetY = 0.0f;
            this.botMainButtonTextView.setVisibility(8);
            this.botProgressView.setAlpha(0.0f);
            this.botProgressView.setScaleX(0.1f);
            this.botProgressView.setScaleY(0.1f);
            this.botProgressView.setVisibility(8);
            this.buttonsRecyclerViewWrapper.setAlpha(1.0f);
            this.buttonsRecyclerViewWrapper.setTranslationY(this.botMainButtonOffsetY);
            for (int i = 0; i < this.botAttachLayouts.size(); i++) {
                ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.valueAt(i)).setMeasureOffsetY(0);
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
            boolean zDisableBottomFade = attachAlertLayout.disableBottomFade();
            ChatActivityFadeView chatActivityFadeView = this.fadeView;
            if (chatActivityFadeView != null) {
                chatActivityFadeView.setFadeHeightBottom(zDisableBottomFade ? 0 : AndroidUtilities.dp(48.0f));
            }
            View view = this.bottomFadeView;
            if (view != null) {
                view.setVisibility(zDisableBottomFade ? 4 : 0);
            }
            this.actionBar.setVisibility(this.nextAttachLayout.needsActionBar() != 0 ? 0 : 4);
            if (this.actionBar.isSearchFieldVisible()) {
                this.actionBar.closeSearchField();
            }
            this.currentAttachLayout.onHide();
            AttachAlertLayout attachAlertLayout3 = this.nextAttachLayout;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
            if (attachAlertLayout3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.nextAttachLayout.onShow(this.currentAttachLayout);
            this.nextAttachLayout.setVisibility(0);
            if (attachAlertLayout.getParent() != null) {
                this.containerView.removeView(this.nextAttachLayout);
            }
            int iIndexOfChild = this.containerView.indexOfChild(this.currentAttachLayout);
            ViewParent parent = this.nextAttachLayout.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                AttachAlertLayout attachAlertLayout4 = this.nextAttachLayout;
                if (attachAlertLayout4 != this.locationLayout) {
                    iIndexOfChild++;
                }
                viewGroup.addView(attachAlertLayout4, iIndexOfChild, LayoutHelper.createFrame(-1, -1.0f));
            }
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.m2154$r8$lambda$u73ImYJAglFrFE339jAJn27kN8(this.f$0);
                }
            };
            AttachAlertLayout attachAlertLayout5 = this.currentAttachLayout;
            if ((attachAlertLayout5 instanceof ChatAttachAlertPhotoLayoutPreview) || (this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                int iMax = Math.max(this.nextAttachLayout.getWidth(), this.currentAttachLayout.getWidth());
                AttachAlertLayout attachAlertLayout6 = this.nextAttachLayout;
                if (attachAlertLayout6 instanceof ChatAttachAlertPhotoLayoutPreview) {
                    attachAlertLayout6.setTranslationX(iMax);
                    AttachAlertLayout attachAlertLayout7 = this.currentAttachLayout;
                    if ((attachAlertLayout7 instanceof ChatAttachAlertPhotoLayout) && (cameraViewInternal2 = ((ChatAttachAlertPhotoLayout) attachAlertLayout7).cameraView) != null) {
                        cameraViewInternal2.setVisibility(4);
                    }
                } else {
                    this.currentAttachLayout.setTranslationX(-iMax);
                    AttachAlertLayout attachAlertLayout8 = this.nextAttachLayout;
                    if (attachAlertLayout8 == this.photoLayout && (cameraViewInternal = ((ChatAttachAlertPhotoLayout) attachAlertLayout8).cameraView) != null) {
                        cameraViewInternal.setVisibility(0);
                    }
                }
                this.nextAttachLayout.setAlpha(1.0f);
                this.currentAttachLayout.setAlpha(1.0f);
                if (z) {
                    this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(0.0f));
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ChatAttachAlert.$r8$lambda$vp2c95u2SHYdZeYBKY5wviaHSOo(this.f$0, attachAlertLayout, runnable);
                        }
                    });
                } else {
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
            } else if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.nextAttachLayout.setAlpha(0.0f);
                this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.currentAttachLayout, (Property<AttachAlertLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.currentAttachLayout, (Property<AttachAlertLayout, Float>) this.ATTACH_ALERT_LAYOUT_TRANSLATION, 0.0f, 1.0f);
                ActionBar actionBar = this.actionBar;
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) View.ALPHA, actionBar.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet.addListener(new AnonymousClass27(firstOffset, runnable));
                this.viewChangeAnimator = animatorSet;
                this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(0.0f));
                animatorSet.start();
            } else {
                attachAlertLayout5.setAlpha(0.0f);
                runnable.run();
                updateSelectedPosition(0);
                this.containerView.invalidate();
            }
            ActionBar actionBar2 = this.actionBar;
            if (actionBar2 != null) {
                if (this.hasOverridenWebviewBackgroundColor && !(attachAlertLayout instanceof ChatAttachAlertBotWebViewLayout)) {
                    this.hasOverridenWebviewBackgroundColor = false;
                    actionBar2.updateColors();
                    this.actionBar.invalidate();
                    onCurrentLayoutAnimatorChanged();
                }
                if (j == 1 || j == 6 || (attachAlertLayout instanceof ChatAttachAlertBotWebViewLayout)) {
                    iDp = AndroidUtilities.dp(46.0f);
                } else if (j == 4) {
                    iDp = AndroidUtilities.dp(84.0f);
                }
                this.actionBar.setForcedMenuWidth(iDp);
            }
        }
    }

    public static void m2154$r8$lambda$u73ImYJAglFrFE339jAJn27kN8(ChatAttachAlert chatAttachAlert) {
        AttachAlertLayout attachAlertLayout;
        ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview;
        chatAttachAlert.viewChangeAnimator = null;
        AttachAlertLayout attachAlertLayout2 = chatAttachAlert.currentAttachLayout;
        if (attachAlertLayout2 != chatAttachAlert.photoLayout && (attachAlertLayout = chatAttachAlert.nextAttachLayout) != (chatAttachAlertPhotoLayoutPreview = chatAttachAlert.photoPreviewLayout) && attachAlertLayout2 != attachAlertLayout && attachAlertLayout2 != chatAttachAlertPhotoLayoutPreview) {
            chatAttachAlert.containerView.removeView(attachAlertLayout2);
        }
        chatAttachAlert.currentAttachLayout.setVisibility(8);
        chatAttachAlert.currentAttachLayout.onHidden();
        chatAttachAlert.nextAttachLayout.onShown();
        chatAttachAlert.currentAttachLayout = chatAttachAlert.nextAttachLayout;
        chatAttachAlert.nextAttachLayout = null;
        int[] iArr = chatAttachAlert.scrollOffsetY;
        iArr[0] = iArr[1];
        chatAttachAlert.setCaptionAbove(chatAttachAlert.captionAbove, false);
        chatAttachAlert.updateDoneItemEnabled();
    }

    class AnonymousClass27 extends AnimatorListenerAdapter {
        final Runnable val$onEnd;
        final int val$t;

        AnonymousClass27(int i, Runnable runnable) {
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
                    ChatAttachAlert.AnonymousClass27.$r8$lambda$SvIxzErSswMNcWHixfPe3VYKiDA(this.f$0, dynamicAnimation, f, f2);
                }
            });
            final Runnable runnable = this.val$onEnd;
            springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    ChatAttachAlert.AnonymousClass27.$r8$lambda$gpO7OWRoiPVRIm_HiGnvNYxE9js(this.f$0, runnable, dynamicAnimation, z, f, f2);
                }
            });
            ChatAttachAlert.this.viewChangeAnimator = springAnimation;
            springAnimation.start();
        }

        public static void $r8$lambda$SvIxzErSswMNcWHixfPe3VYKiDA(AnonymousClass27 anonymousClass27, DynamicAnimation dynamicAnimation, float f, float f2) {
            if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.todoLayout) {
                ChatAttachAlert.this.updateSelectedPosition(1);
            } else {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.isPhotoPicker && chatAttachAlert.viewChangeAnimator != null) {
                    ChatAttachAlert.this.updateSelectedPosition(1);
                }
            }
            ChatAttachAlert.this.nextAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
        }

        public static void $r8$lambda$gpO7OWRoiPVRIm_HiGnvNYxE9js(AnonymousClass27 anonymousClass27, Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            ChatAttachAlert.this.nextAttachLayout.setTranslationY(0.0f);
            ChatAttachAlert.this.nextAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            runnable.run();
            ChatAttachAlert.this.updateSelectedPosition(0);
        }
    }

    public static void $r8$lambda$vp2c95u2SHYdZeYBKY5wviaHSOo(final ChatAttachAlert chatAttachAlert, AttachAlertLayout attachAlertLayout, final Runnable runnable) {
        final boolean z = chatAttachAlert.nextAttachLayout.getCurrentItemTop() <= attachAlertLayout.getButtonsHideOffset();
        final float alpha = chatAttachAlert.actionBar.getAlpha();
        final float f = z ? 1.0f : 0.0f;
        SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.0f));
        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                ChatAttachAlert.m2127$r8$lambda$1K6AhmeDDr2DTUrKadvxKjQgEY(this.f$0, alpha, f, z, dynamicAnimation, f2, f3);
            }
        });
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3) {
                ChatAttachAlert.$r8$lambda$orJ2wLZs5RgjfUcGogz2biU1iZk(this.f$0, z, runnable, dynamicAnimation, z2, f2, f3);
            }
        });
        springAnimation.setSpring(new SpringForce(500.0f));
        springAnimation.getSpring().setDampingRatio(1.0f);
        springAnimation.getSpring().setStiffness(1000.0f);
        springAnimation.start();
        chatAttachAlert.viewChangeAnimator = springAnimation;
    }

    public static void m2127$r8$lambda$1K6AhmeDDr2DTUrKadvxKjQgEY(ChatAttachAlert chatAttachAlert, float f, float f2, boolean z, DynamicAnimation dynamicAnimation, float f3, float f4) {
        float f5 = f3 / 500.0f;
        chatAttachAlert.ATTACH_ALERT_LAYOUT_TRANSLATION.set(chatAttachAlert.currentAttachLayout, Float.valueOf(f5));
        chatAttachAlert.actionBar.setAlpha(AndroidUtilities.lerp(f, f2, f5));
        chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, false, 0);
        chatAttachAlert.updateLayout(chatAttachAlert.nextAttachLayout, false, 0);
        if (!(chatAttachAlert.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || z) {
            f5 = 1.0f - f5;
        }
        float fClamp = Utilities.clamp(f5, 1.0f, 0.0f);
        chatAttachAlert.mediaPreviewView.setAlpha(fClamp);
        float f6 = 1.0f - fClamp;
        chatAttachAlert.selectedView.setAlpha(f6);
        chatAttachAlert.selectedView.setTranslationX(fClamp * (-AndroidUtilities.dp(16.0f)));
        chatAttachAlert.mediaPreviewView.setTranslationX(f6 * AndroidUtilities.dp(16.0f));
    }

    public static void $r8$lambda$orJ2wLZs5RgjfUcGogz2biU1iZk(ChatAttachAlert chatAttachAlert, boolean z, Runnable runnable, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        chatAttachAlert.currentAttachLayout.onHideShowProgress(1.0f);
        chatAttachAlert.nextAttachLayout.onHideShowProgress(1.0f);
        chatAttachAlert.currentAttachLayout.onContainerTranslationUpdated(chatAttachAlert.currentPanTranslationY);
        chatAttachAlert.nextAttachLayout.onContainerTranslationUpdated(chatAttachAlert.currentPanTranslationY);
        chatAttachAlert.containerView.invalidate();
        chatAttachAlert.actionBar.setTag(z ? 1 : null);
        runnable.run();
    }

    public void onCurrentLayoutAnimatorChanged(ReplaceAnimator replaceAnimator) {
        onCurrentLayoutAnimatorChanged();
    }

    private void onCurrentLayoutAnimatorChanged() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int shadowDrawableColor = getShadowDrawableColor();
        Theme.setDrawableColor(this.shadowDrawable, shadowDrawableColor);
        checkColorSourceColor(shadowDrawableColor);
        updateDoneItemEnabled();
        this.containerView.invalidate();
    }

    private void checkColorSourceColor(int i) {
        if (this.iBlur3SourceColor.getColor() != i) {
            this.iBlur3SourceColor.setColor(i);
            ChatActivityFadeView chatActivityFadeView = this.fadeView;
            if (chatActivityFadeView != null) {
                chatActivityFadeView.invalidate();
            }
            View view = this.bottomFadeView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    private int getShadowDrawableColor() {
        return getShadowDrawableColor(false);
    }

    private int getShadowDrawableColor(boolean z) {
        ActionBar actionBar;
        if (this.forceDarkTheme) {
            return getThemedColor(Theme.key_voipgroup_listViewBackground);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        float visibility = 0.0f;
        for (ListAnimator.Entry entry : this.animatorCurrentVisibleLayout) {
            long jLongValue = ((Long) entry.item).longValue();
            if (jLongValue == 1 || jLongValue == 3 || jLongValue == 4 || jLongValue == 5 || jLongValue == 6 || jLongValue == 9 || jLongValue == 11 || jLongValue == 12) {
                visibility += entry.getVisibility();
            }
        }
        float fClamp = MathUtils.clamp(visibility, 0.0f, 1.0f);
        if (z && (actionBar = this.actionBar) != null && actionBar.getVisibility() == 0) {
            fClamp *= 1.0f - this.actionBar.getAlpha();
        }
        return ColorUtils.blendARGB(getThemedColor(Theme.key_dialogBackground), getThemedColor(zIsDark ? Theme.key_windowBackgroundGray : Theme.key_dialogBackgroundGray), fClamp);
    }

    public int getActionBarDrawableColor() {
        return getShadowDrawableColor(true);
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
            chatAttachAlertContactsLayout.setupBlurredSearchField(this.iBlur3FactoryLiquidGlass);
            this.contactsLayout.setDelegate(new ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate() {
                @Override
                public void didSelectContact(TLRPC.User user, boolean z, int i, long j, boolean z2, long j2) {
                    ((ChatActivity) ChatAttachAlert.this.baseFragment).sendContact(user, z, i, j, z2, j2);
                }

                @Override
                public void didSelectContacts(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2, long j2) {
                    ((ChatActivity) ChatAttachAlert.this.baseFragment).sendContacts(arrayList, str, z, i, j, z2, 0L);
                }
            });
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            TLRPC.Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
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
            chatAttachAlertQuickRepliesLayout.setupBlurredSearchField(this.iBlur3FactoryLiquidGlass);
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
        int i = 1;
        if (this.audioLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = new ChatAttachAlertAudioLayout(this, getContext(), this.resourcesProvider);
            this.audioLayout = chatAttachAlertAudioLayout;
            attachAlertLayoutArr[3] = chatAttachAlertAudioLayout;
            chatAttachAlertAudioLayout.setupBlurredSearchField(this.iBlur3FactoryLiquidGlass);
            this.audioLayout.setDelegate(new ChatAttachAlertAudioLayout.AudioSelectDelegate() {
                @Override
                public final void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i2, int i3, long j, boolean z3, long j2) {
                    ChatAttachAlert.m2153$r8$lambda$qkQmkAVCg3Pz1yvqIp3ts7OQA(this.f$0, arrayList, charSequence, z2, i2, i3, j, z3, j2);
                }
            });
            if (this.isPollAttach) {
                this.audioLayout.setMaxSelectedFiles(1);
            }
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            TLRPC.Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
            ChatAttachAlertAudioLayout chatAttachAlertAudioLayout2 = this.audioLayout;
            if ((currentChat == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled) && this.editingMessageObject == null) {
                i = -1;
            }
            chatAttachAlertAudioLayout2.setMaxSelectedFiles(i);
        }
        if (z) {
            showLayout(this.audioLayout);
        }
    }

    public static void m2153$r8$lambda$qkQmkAVCg3Pz1yvqIp3ts7OQA(ChatAttachAlert chatAttachAlert, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate = chatAttachAlert.audioSelectDelegate;
        if (audioSelectDelegate != null) {
            audioSelectDelegate.didSelectAudio(arrayList, charSequence, z, i, i2, j, z2, j2);
            return;
        }
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        if (baseFragment != null && (baseFragment instanceof ChatActivity)) {
            ((ChatActivity) baseFragment).sendAudio(arrayList, charSequence, z, i, i2, j, z2, j2);
            return;
        }
        ChatAttachViewDelegate chatAttachViewDelegate = chatAttachAlert.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.sendAudio(arrayList, charSequence, z, i, i2, j, z2, j2);
        }
    }

    public void openColorsLayout() {
        if (this.colorsLayout == null) {
            ChatAttachAlertColorsLayout chatAttachAlertColorsLayout = new ChatAttachAlertColorsLayout(this, getContext(), this.resourcesProvider);
            this.colorsLayout = chatAttachAlertColorsLayout;
            chatAttachAlertColorsLayout.setDelegate(new androidx.core.util.Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChatAttachAlert.m2130$r8$lambda$5FrMtWP0bAxsGde_ew23MpudC4(this.f$0, obj);
                }
            });
        }
        showLayout(this.colorsLayout);
    }

    public static void m2130$r8$lambda$5FrMtWP0bAxsGde_ew23MpudC4(ChatAttachAlert chatAttachAlert, Object obj) {
        ChatAttachViewDelegate chatAttachViewDelegate = chatAttachAlert.delegate;
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
                @Override
                public void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z3, int i2, int i3, long j, boolean z4, long j2) {
                    if (ChatAttachAlert.this.documentsDelegate != null) {
                        ChatAttachAlert.this.documentsDelegate.didSelectFiles(arrayList, str, arrayList2, arrayList3, z3, i2, i3, j, z4, j2);
                        return;
                    }
                    Object obj = ChatAttachAlert.this.baseFragment;
                    if (obj instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) obj).didSelectFiles(arrayList, str, arrayList2, arrayList3, z3, i2, i3, j, z4, j2);
                    } else if (obj instanceof PassportActivity) {
                        ((PassportActivity) obj).didSelectFiles(arrayList, str, z3, i2, j, z4);
                    }
                }

                @Override
                public void didSelectPhotos(ArrayList arrayList, boolean z3, int i2, int i3, long j) {
                    if (ChatAttachAlert.this.documentsDelegate != null) {
                        ChatAttachAlert.this.documentsDelegate.didSelectPhotos(arrayList, z3, i2, i3, j);
                        return;
                    }
                    BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                    if (baseFragment instanceof ChatActivity) {
                        ((ChatActivity) baseFragment).didSelectPhotos(arrayList, z3, i2, i3, j);
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
                    Object obj = ChatAttachAlert.this.baseFragment;
                    if (obj instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) obj).startDocumentSelectActivity();
                    } else if (obj instanceof PassportActivity) {
                        ((PassportActivity) obj).startDocumentSelectActivity();
                    }
                }

                @Override
                public void startMusicSelectActivity() {
                    ChatAttachAlert.this.openAudioLayout(true);
                }
            });
        }
        int i2 = 1;
        if (this.isPollAttach) {
            this.documentLayout.setMaxSelectedFiles(1);
        } else {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                TLRPC.Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
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
        }
        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout4 = this.documentLayout;
        chatAttachAlertDocumentLayout4.isSoundPicker = this.isSoundPicker;
        if (z) {
            showLayout(chatAttachAlertDocumentLayout4);
        }
    }

    public boolean showSendButtonOnly(final boolean z, boolean z2) {
        AttachAlertLayout attachAlertLayout;
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.commentsAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (z) {
            this.writeButtonContainer.setVisibility(0);
        } else if (this.typeButtonsAvailable) {
            this.buttonsRecyclerViewWrapper.setVisibility(0);
        }
        if (z2) {
            this.commentsAnimator = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            FrameLayout frameLayout = this.writeButtonContainer;
            Property property = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.2f));
            FrameLayout frameLayout2 = this.writeButtonContainer;
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, z ? 1.0f : 0.2f));
            FrameLayout frameLayout3 = this.writeButtonContainer;
            Property property3 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButton, (Property<ChatActivityEnterView.SendButton, Float>) property, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButton, (Property<ChatActivityEnterView.SendButton, Float>) property2, z ? 1.0f : 0.2f));
            if (this.typeButtonsAvailable) {
                arrayList.add(ObjectAnimator.ofFloat(this.buttonsRecyclerViewWrapper, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.buttonsRecyclerViewWrapper, (Property<FrameLayout, Float>) property3, z ? 0.0f : 1.0f));
            }
            this.commentsAnimator.playTogether(arrayList);
            this.commentsAnimator.setInterpolator(new DecelerateInterpolator());
            this.commentsAnimator.setDuration(180L);
            this.commentsAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        if (!z) {
                            ChatAttachAlert.this.writeButtonContainer.setVisibility(4);
                        } else {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.typeButtonsAvailable && (chatAttachAlert.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons())) {
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(4);
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
            this.writeButtonContainer.setScaleX(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setScaleY(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setAlpha(z ? 1.0f : 0.0f);
            this.writeButton.setScaleX(z ? 1.0f : 0.2f);
            this.writeButton.setScaleY(z ? 1.0f : 0.2f);
            if (this.typeButtonsAvailable) {
                this.buttonsRecyclerViewWrapper.setTranslationY(z ? AndroidUtilities.dp(36.0f) : 0.0f);
                this.buttonsRecyclerViewWrapper.setAlpha(z ? 0.0f : 1.0f);
                if (z && ((attachAlertLayout = this.currentAttachLayout) == null || attachAlertLayout.shouldHideBottomButtons())) {
                    this.buttonsRecyclerViewWrapper.setVisibility(4);
                }
            }
            if (!z) {
                this.writeButtonContainer.setVisibility(4);
            }
        }
        this.writeButton.setCount(0, z2);
        return true;
    }

    private boolean showCommentTextView(final boolean z, boolean z2) {
        float f;
        AttachAlertLayout attachAlertLayout;
        this.animatorCaptionVisible.setValue(z, true);
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
        this.topCommentTextView.hidePopup(true);
        if (z) {
            if (!this.isSoundPicker) {
                this.frameLayout2.setVisibility(0);
            }
            this.writeButtonContainer.setVisibility(0);
        } else if (this.typeButtonsAvailable) {
            this.buttonsRecyclerViewWrapper.setVisibility(0);
        }
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        final boolean z3 = (attachAlertLayout2 == this.photoLayout || attachAlertLayout2 == this.photoPreviewLayout) && this.captionAbove;
        if (z2) {
            this.commentsAnimator = new AnimatorSet();
            if (z3) {
                this.topCommentContainer.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            FrameLayout frameLayout = this.frameLayout2;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.captionContainer, (Property<FrameLayout, Float>) property, (!z || z3) ? 0.0f : 1.0f));
            if (z && !z3) {
                this.captionContainer.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.captionContainer, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.topCommentContainer, (Property<FrameLayout, Float>) property, (z && z3) ? 1.0f : 0.0f));
            FrameLayout frameLayout2 = this.writeButtonContainer;
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, z ? 1.0f : 0.2f));
            FrameLayout frameLayout3 = this.writeButtonContainer;
            Property property3 = View.SCALE_Y;
            f = 48.0f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButton, (Property<ChatActivityEnterView.SendButton, Float>) property2, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(this.writeButton, (Property<ChatActivityEnterView.SendButton, Float>) property3, z ? 1.0f : 0.2f));
            if (this.actionBar.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(this.frameLayout2, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else if (this.typeButtonsAvailable) {
                arrayList.add(ObjectAnimator.ofFloat(this.buttonsRecyclerViewWrapper, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z ? AndroidUtilities.dp(36.0f) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.buttonsRecyclerViewWrapper, (Property<FrameLayout, Float>) property, z ? 0.0f : 1.0f));
            }
            if (z3) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.updatedTopCaptionHeight();
                    }
                });
                arrayList.add(valueAnimatorOfFloat);
            }
            this.commentsAnimator.playTogether(arrayList);
            this.commentsAnimator.setInterpolator(new DecelerateInterpolator());
            this.commentsAnimator.setDuration(180L);
            this.commentsAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        if (!z) {
                            if (!ChatAttachAlert.this.isSoundPicker) {
                                ChatAttachAlert.this.frameLayout2.setVisibility(4);
                            }
                            ChatAttachAlert.this.writeButtonContainer.setVisibility(4);
                        } else {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.typeButtonsAvailable && (chatAttachAlert.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons())) {
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(4);
                            }
                        }
                        if (z3) {
                            ChatAttachAlert.this.updatedTopCaptionHeight();
                            ChatAttachAlert.this.topCommentContainer.setVisibility(z ? 0 : 8);
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
            f = 48.0f;
            this.frameLayout2.setAlpha(z ? 1.0f : 0.0f);
            this.captionContainer.setAlpha((z && z3) ? 1.0f : 0.0f);
            if (z && !z3) {
                this.captionContainer.setVisibility(0);
                this.captionContainer.setTranslationY(0.0f);
            }
            this.writeButtonContainer.setScaleX(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setScaleY(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setAlpha(z ? 1.0f : 0.0f);
            this.topCommentContainer.setVisibility((z && z3) ? 0 : 8);
            this.topCommentContainer.setAlpha((z && z3) ? 1.0f : 0.0f);
            this.writeButton.setScaleX(z ? 1.0f : 0.2f);
            this.writeButton.setScaleY(z ? 1.0f : 0.2f);
            if (this.actionBar.getTag() != null) {
                this.frameLayout2.setTranslationY(z ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.typeButtonsAvailable && ((attachAlertLayout = this.currentAttachLayout) == null || attachAlertLayout.shouldHideBottomButtons())) {
                this.buttonsRecyclerViewWrapper.setTranslationY(z ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z) {
                this.frameLayout2.setVisibility(4);
                this.writeButtonContainer.setVisibility(4);
            }
            if (z3) {
                updatedTopCaptionHeight();
            }
        }
        this.writeButton.setCount(z ? Math.max(1, this.currentAttachLayout.getSelectedItemsCount()) : 0, z2);
        this.writeButton.setStarsPrice(this.editingMessageObject != null ? 0L : MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(getDialogId()), this.currentAttachLayout.getSelectedItemsCount() + getAdditionalMessagesCount());
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextEmoji.getLayoutParams();
            int iMax = Math.max(AndroidUtilities.dp(f), this.writeButton.width());
            if (marginLayoutParams.rightMargin != iMax) {
                marginLayoutParams.rightMargin = iMax;
                this.commentTextView.setLayoutParams(marginLayoutParams);
            }
        }
        return true;
    }

    public int getAdditionalMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        BaseFragment baseFragment = this.baseFragment;
        if (!(baseFragment instanceof ChatActivity) || (messagePreviewParams = ((ChatActivity) baseFragment).messagePreviewParams) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
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
    protected boolean onCustomOpenAnimation() {
        this.photoLayout.setTranslationX(0.0f);
        this.mediaPreviewView.setAlpha(0.0f);
        this.selectedView.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.buttonsAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ChatAttachAlert, Float>) this.ATTACH_ALERT_PROGRESS, 0.0f, 400.0f));
        this.buttonsAnimation.setDuration(400L);
        this.buttonsAnimation.setStartDelay(20L);
        this.ATTACH_ALERT_PROGRESS.set(this, Float.valueOf(0.0f));
        this.buttonsAnimation.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ChatAttachAlert.m2125$r8$lambda$9lOm59w9AQC_MuMDsXte7rD18(this.f$0, valueAnimator2);
            }
        });
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        if (this.editingMessageObject != null) {
            springAnimation2.getSpring().setDampingRatio(0.75f);
            this.appearSpringAnimation.getSpring().setStiffness(350.0f);
        } else {
            springAnimation2.getSpring().setDampingRatio(0.75f);
            this.appearSpringAnimation.getSpring().setStiffness(350.0f);
        }
        this.appearSpringAnimation.start();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, (Property<BottomSheet.SheetBackDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        final BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface = super.delegate;
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.m2128$r8$lambda$2SaMkzEtrVKbMfnc1o1dAik6z4(this.f$0, animationNotificationsLocker, bottomSheetDelegateInterface);
            }
        };
        this.appearSpringAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                ChatAttachAlert.m2141$r8$lambda$NYxWA99Do483lPbAOt5Wm0SbxQ(this.f$0, runnable, dynamicAnimation, z, f, f2);
            }
        });
        this.currentSheetAnimation.addListener(new AnimatorListenerAdapter() {
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
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        setNavBarAlpha(0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ChatAttachAlert.m2126$r8$lambda$qJ1F_bV_JdKoglD2q3XH5xD6YU(this.f$0, valueAnimator2);
            }
        });
        valueAnimatorOfFloat2.setStartDelay(25L);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.DEFAULT);
        valueAnimatorOfFloat2.start();
        return true;
    }

    public static void m2125$r8$lambda$9lOm59w9AQC_MuMDsXte7rD18(ChatAttachAlert chatAttachAlert, ValueAnimator valueAnimator) {
        chatAttachAlert.getClass();
        chatAttachAlert.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BottomSheet.ContainerView containerView = chatAttachAlert.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public static void m2128$r8$lambda$2SaMkzEtrVKbMfnc1o1dAik6z4(ChatAttachAlert chatAttachAlert, AnimationNotificationsLocker animationNotificationsLocker, BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface) {
        chatAttachAlert.currentSheetAnimation = null;
        chatAttachAlert.appearSpringAnimation = null;
        animationNotificationsLocker.unlock();
        chatAttachAlert.currentSheetAnimationType = 0;
        if (bottomSheetDelegateInterface != null) {
            bottomSheetDelegateInterface.onOpenAnimationEnd();
        }
        if (chatAttachAlert.useHardwareLayer) {
            chatAttachAlert.container.setLayerType(0, null);
        }
        if (chatAttachAlert.isFullscreen) {
            WindowManager.LayoutParams attributes = chatAttachAlert.getWindow().getAttributes();
            attributes.flags &= -1025;
            chatAttachAlert.getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
    }

    public static void m2141$r8$lambda$NYxWA99Do483lPbAOt5Wm0SbxQ(ChatAttachAlert chatAttachAlert, Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        AnimatorSet animatorSet = chatAttachAlert.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        runnable.run();
    }

    public static void m2126$r8$lambda$qJ1F_bV_JdKoglD2q3XH5xD6YU(ChatAttachAlert chatAttachAlert, ValueAnimator valueAnimator) {
        chatAttachAlert.getClass();
        chatAttachAlert.setNavBarAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setNavBarAlpha(float f) {
        int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), Math.min(255, Math.max(0, (int) (f * 255.0f))));
        this.navBarColor = alphaComponent;
        AndroidUtilities.setNavigationBarColor((Dialog) this, alphaComponent, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
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
        boolean zNeedEnterComment = chatAttachViewDelegate.needEnterComment();
        this.enterCommentEventSent = true;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.m2142$r8$lambda$Palh6pxTFNEZbyimSpkUh1O_6s(this.f$0, editTextBoldCursor, z);
            }
        }, zNeedEnterComment ? 200L : 0L);
    }

    public static void m2142$r8$lambda$Palh6pxTFNEZbyimSpkUh1O_6s(ChatAttachAlert chatAttachAlert, final EditTextBoldCursor editTextBoldCursor, boolean z) {
        chatAttachAlert.setFocusable(true);
        editTextBoldCursor.requestFocus();
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
            });
        }
    }

    public void applyAttachButtonColors(View view) {
        if (view instanceof AttachButton) {
            return;
        }
        boolean z = view instanceof AttachBotButton;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
                if (attachAlertLayout != null && (themeDescriptions = attachAlertLayout.getThemeDescriptions()) != null) {
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
        this.doneItem.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        this.selectedMenuItem.setIconColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        Theme.setDrawableColor(this.selectedMenuItem.getBackground(), getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector));
        ActionBarMenuItem actionBarMenuItem = this.selectedMenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        actionBarMenuItem.setPopupItemsColor(getThemedColor(i2), false);
        this.selectedMenuItem.setPopupItemsColor(getThemedColor(i2), true);
        this.selectedMenuItem.redrawPopup(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        ActionBarMenuItem actionBarMenuItem2 = this.motionItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setIconColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        }
        ActionBarMenuItem actionBarMenuItem3 = this.searchItem;
        if (actionBarMenuItem3 != null) {
            actionBarMenuItem3.setIconColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
            Theme.setDrawableColor(this.searchItem.getBackground(), getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector));
        }
        this.commentTextView.updateColors();
        this.buttonsRecyclerView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.actionBar.setItemsColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector), false);
        this.actionBar.setTitleColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        int shadowDrawableColor = getShadowDrawableColor();
        Theme.setDrawableColor(this.shadowDrawable, shadowDrawableColor);
        checkColorSourceColor(shadowDrawableColor);
        this.containerView.invalidate();
        int i3 = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i3 >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i3];
            if (attachAlertLayout != null) {
                attachAlertLayout.checkColors();
            }
            i3++;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            this.navBarColor = getThemedColor(Theme.key_dialogBackgroundGray);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(Theme.key_dialogBackground), false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
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
                AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
                if (attachAlertLayout != null) {
                    attachAlertLayout.onPause();
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
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onResume();
            }
            i++;
        }
        if (isShowing()) {
            this.delegate.needEnterComment();
        }
        ButtonsAdapter buttonsAdapter = this.buttonsAdapter;
        if (buttonsAdapter != null) {
            buttonsAdapter.notifyDataSetChanged();
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
                return;
            }
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
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

    public void updateSelectedPosition(int i) {
        int i2;
        float translationY;
        float f;
        float translationY2;
        float translationY3;
        float fMax;
        int i3;
        float floatValue = this.animatorActionBarVisible.getFloatValue();
        AttachAlertLayout attachAlertLayout = i == 0 ? this.currentAttachLayout : this.nextAttachLayout;
        if (attachAlertLayout == null || attachAlertLayout.getVisibility() != 0) {
            return;
        }
        int scrollOffsetY = getScrollOffsetY(i);
        if (attachAlertLayout == this.pollLayout || attachAlertLayout == this.todoLayout) {
            AndroidUtilities.dp(13.0f);
            AndroidUtilities.dp(11.0f);
        } else {
            AndroidUtilities.dp(39.0f);
            AndroidUtilities.dp(43.0f);
        }
        ActionBar.getCurrentActionBarHeight();
        float f2 = 1.0f;
        float f3 = 1.0f - floatValue;
        this.cornerRadius = f3;
        if (AndroidUtilities.isTablet()) {
            i2 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i2 = point.x > point.y ? 6 : 12;
        }
        float fDp = this.actionBar.getAlpha() != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - this.headerView.getAlpha()) * 26.0f);
        if (this.menuShowed && this.avatarPicker == 0 && !this.storyMediaPicker) {
            this.selectedMenuItem.setTranslationY(Math.max((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i2 + 37), ((scrollOffsetY - AndroidUtilities.dp((i2 * floatValue) + 37.0f)) + fDp) - (this.topCommentContainer.getMeasuredHeight() * this.topCommentContainer.getAlpha())) + this.currentPanTranslationY);
        } else {
            this.selectedMenuItem.setTranslationY(((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i2 + 37)) + this.currentPanTranslationY);
        }
        ActionBarMenuItem actionBarMenuItem = this.motionItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setTranslationY(this.selectedMenuItem.getTranslationY());
        }
        HintView2 hintView2 = this.motionHint;
        if (hintView2 != null) {
            hintView2.setTranslationY(this.selectedMenuItem.getTranslationY());
        }
        if (this.isPhotoPicker && this.openTransitionFinished) {
            AttachAlertLayout attachAlertLayout2 = this.nextAttachLayout;
            if (attachAlertLayout2 != null && this.currentAttachLayout != null) {
                translationY = Math.min(attachAlertLayout2.getTranslationY(), this.currentAttachLayout.getTranslationY());
            } else if (attachAlertLayout2 != null) {
                translationY = attachAlertLayout2.getTranslationY();
            } else {
                translationY = 0.0f;
            }
        } else {
            translationY = 0.0f;
        }
        ActionBarMenuItem actionBarMenuItem2 = this.searchItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setTranslationY(((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i2 + 37)) + this.currentPanTranslationY);
        }
        float fDp2 = ((((scrollOffsetY - AndroidUtilities.dp((i2 * floatValue) + 25.0f)) + fDp) + this.currentPanTranslationY) + translationY) - (this.topCommentContainer.getMeasuredHeight() * this.topCommentContainer.getAlpha());
        this.baseSelectedTextViewTranslationY = fDp2;
        this.headerView.setTranslationY(Math.max(this.currentPanTranslationY, fDp2));
        this.topCommentContainer.setTranslationY(Math.max(ActionBar.getCurrentActionBarHeight() + this.currentPanTranslationY, this.baseSelectedTextViewTranslationY + (AndroidUtilities.dp(26.0f) * this.headerView.getAlpha()) + AndroidUtilities.dp(8.0f)));
        if (this.captionAbove) {
            updateCommentTextViewPosition();
        }
        checkUi_writeButtonContainerY();
        int i4 = 59;
        if (this.pollLayout == null) {
            f = 0.0f;
            translationY2 = 0.0f;
        } else {
            if (AndroidUtilities.isTablet()) {
                i3 = 63;
            } else {
                Point point2 = AndroidUtilities.displaySize;
                i3 = point2.x > point2.y ? 53 : 59;
            }
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
            if (chatAttachAlertPollLayout == this.nextAttachLayout) {
                translationY2 = (chatAttachAlertPollLayout.getTranslationY() + getScrollOffsetY(1)) - AndroidUtilities.dp(((i3 * floatValue) + 7.0f) - (f3 * 12.0f));
                f = this.translationProgress;
            } else if (chatAttachAlertPollLayout == this.currentAttachLayout) {
                translationY2 = (chatAttachAlertPollLayout.getTranslationY() + getScrollOffsetY(0)) - AndroidUtilities.dp(((i3 * floatValue) + 7.0f) - (f3 * 12.0f));
                f = this.nextAttachLayout == null ? 1.0f : 1.0f - this.translationProgress;
            } else {
                f = 0.0f;
                translationY2 = 0.0f;
            }
        }
        if (this.todoLayout == null) {
            translationY3 = 0.0f;
            f2 = 0.0f;
        } else {
            if (AndroidUtilities.isTablet()) {
                i4 = 63;
            } else {
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i4 = 53;
                }
            }
            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
            if (chatAttachAlertPollLayout2 == this.nextAttachLayout) {
                float translationY4 = (chatAttachAlertPollLayout2.getTranslationY() + getScrollOffsetY(1)) - AndroidUtilities.dp(((i4 * floatValue) + 7.0f) - (f3 * 12.0f));
                f2 = this.translationProgress;
                translationY3 = translationY4;
            } else if (chatAttachAlertPollLayout2 == this.currentAttachLayout) {
                translationY3 = (chatAttachAlertPollLayout2.getTranslationY() + getScrollOffsetY(0)) - AndroidUtilities.dp(((i4 * floatValue) + 7.0f) - (f3 * 12.0f));
                if (this.nextAttachLayout != null) {
                    f2 = 1.0f - this.translationProgress;
                }
            } else {
                translationY3 = 0.0f;
                f2 = 0.0f;
            }
        }
        if (this.doneItem != null) {
            int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - this.doneItem.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
            TextView textView = this.doneItem;
            if (f > 0.0f && f2 > 0.0f) {
                fMax = AndroidUtilities.lerp(translationY2, translationY3, f2);
            } else {
                if (f <= 0.0f) {
                    translationY2 = 0.0f;
                }
                if (f2 <= 0.0f) {
                    translationY3 = 0.0f;
                }
                fMax = Math.max(translationY2, translationY3);
            }
            textView.setTranslationY(Math.max(0.0f, fMax) + this.currentPanTranslationY);
            this.doneItem.setTranslationX(-(AndroidUtilities.dp((7.0f * f3) + 12.0f) + (measuredWidth * f3)));
        }
        this.doneItemAlphaByLayout = Math.max(f2, f);
        checkUi_doneItemVisibility();
    }

    private void updateActionBarVisibility(final boolean z, boolean z2) {
        AttachAlertLayout attachAlertLayout;
        this.animatorActionBarVisible.setValue(z, z2);
        if (!(z && this.actionBar.getTag() == null) && (z || this.actionBar.getTag() == null)) {
            return;
        }
        this.actionBar.setTag(z ? 1 : null);
        AnimatorSet animatorSet = this.actionBarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.actionBarAnimation = null;
        }
        boolean z3 = (this.isPhotoPicker || this.storyMediaPicker || (this.avatarPicker == 0 && this.menuShowed) || this.currentAttachLayout != this.photoLayout || (!this.photosEnabled && !this.videosEnabled)) ? false : true;
        if (this.currentAttachLayout == this.restrictedLayout) {
            z3 = false;
        }
        if (z) {
            if (z3) {
                this.selectedMenuItem.setVisibility(0);
                this.selectedMenuItem.setClickable(true);
            }
        } else if (this.typeButtonsAvailable && this.frameLayout2.getTag() == null) {
            this.buttonsRecyclerViewWrapper.setVisibility(0);
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            if (z) {
                AndroidUtilities.setLightStatusBar(this, isLightStatusBar());
            } else {
                AndroidUtilities.setLightStatusBar(this, baseFragment.isLightStatusBar());
            }
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z ? 1.0f : 0.0f) - this.actionBar.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            ActionBar actionBar = this.actionBar;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property, z ? 1.0f : 0.0f));
            if (z3) {
                arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) property, z ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
            }
            this.actionBarAnimation.playTogether(arrayList);
            this.actionBarAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ChatAttachAlert.this.actionBarAnimation != null) {
                        if (z) {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.typeButtonsAvailable) {
                                if (chatAttachAlert.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons()) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ActionBarMenuItem actionBarMenuItem = ChatAttachAlert.this.searchItem;
                        if (actionBarMenuItem != null) {
                            actionBarMenuItem.setVisibility(4);
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
            this.buttonsRecyclerViewWrapper.setVisibility(4);
        }
        this.actionBar.setAlpha(z ? 1.0f : 0.0f);
        if (z3) {
            this.selectedMenuItem.setAlpha(z ? 1.0f : 0.0f);
            this.selectedMenuItem.setScaleX(z ? 1.0f : 0.6f);
            this.selectedMenuItem.setScaleY(z ? 1.0f : 0.6f);
        }
        if (z) {
            return;
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(4);
        }
        if (this.avatarPicker == 0 && this.menuShowed) {
            return;
        }
        this.selectedMenuItem.setVisibility(4);
    }

    public void updateLayout(AttachAlertLayout attachAlertLayout, boolean z, int i) {
        if (attachAlertLayout == null) {
            return;
        }
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor;
        if (downscaleScrollableNoiseSuppressor != null && Build.VERSION.SDK_INT >= 31) {
            downscaleScrollableNoiseSuppressor.onScrolled(0.0f, i);
            blur3_InvalidateBlur();
        }
        int currentItemTop = attachAlertLayout.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z2 = false;
        boolean z3 = attachAlertLayout == this.currentAttachLayout && currentItemTop <= attachAlertLayout.getButtonsHideOffset();
        this.pinnedToTop = z3;
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        if (attachAlertLayout2 != this.photoPreviewLayout && this.keyboardVisible && z) {
            boolean z4 = attachAlertLayout2 instanceof ChatAttachAlertBotWebViewLayout;
        }
        if (attachAlertLayout == attachAlertLayout2) {
            updateActionBarVisibility(z3, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) attachAlertLayout.getLayoutParams();
        int iDp = currentItemTop + ((layoutParams == null ? 0 : layoutParams.topMargin) - AndroidUtilities.dp(11.0f));
        AttachAlertLayout attachAlertLayout3 = this.currentAttachLayout;
        int i2 = attachAlertLayout3 == attachAlertLayout ? 0 : 1;
        if ((attachAlertLayout3 instanceof ChatAttachAlertPhotoLayoutPreview) || (this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
            Object obj = this.viewChangeAnimator;
            if ((obj instanceof SpringAnimation) && ((SpringAnimation) obj).isRunning()) {
                z2 = true;
            }
        }
        int[] iArr = this.scrollOffsetY;
        int i3 = iArr[i2];
        if (i3 == iDp && !z2) {
            if (i != 0) {
                this.previousScrollOffsetY = i3;
            }
        } else {
            this.previousScrollOffsetY = i3;
            iArr[i2] = iDp;
            updateSelectedPosition(i2);
            this.containerView.invalidate();
        }
    }

    public void updateCountButton(int i) {
        boolean z;
        ActionBarMenuItem actionBarMenuItem;
        ActionBarMenuItem actionBarMenuItem2;
        if (this.viewChangeAnimator != null) {
            return;
        }
        int selectedItemsCount = this.currentAttachLayout.getSelectedItemsCount();
        if (selectedItemsCount == 0) {
            this.writeButton.setCount(0, i != 0);
            showCommentTextView(false, i != 0);
        } else {
            if (!showCommentTextView(true, i != 0) && i != 0) {
                this.writeButton.setCount(selectedItemsCount, true);
                this.writeButton.bounceCount();
            } else {
                this.writeButton.setCount(selectedItemsCount, i != 0);
                this.writeButton.bounceCount();
            }
        }
        this.currentAttachLayout.onSelectedItemsCountChanged(selectedItemsCount);
        checkIsEphemeralMessage(i != 0);
        if (this.currentAttachLayout == this.photoLayout && (((this.baseFragment instanceof ChatActivity) || this.avatarPicker != 0 || this.storyMediaPicker) && ((selectedItemsCount == 0 && this.menuShowed) || ((selectedItemsCount != 0 || this.avatarPicker != 0 || this.storyMediaPicker) && !this.menuShowed)))) {
            this.menuShowed = (selectedItemsCount == 0 && this.avatarPicker == 0 && !this.storyMediaPicker) ? false : true;
            AnimatorSet animatorSet = this.menuAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.menuAnimator = null;
            }
            if (this.avatarPicker == 0 || this.searchItem == null || this.actionBar.getTag() == null) {
                z = false;
            } else {
                BaseFragment baseFragment = this.baseFragment;
                if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).allowSendGifs()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (this.menuShowed) {
                if (this.avatarPicker == 0 && !this.storyMediaPicker) {
                    this.selectedMenuItem.setVisibility(0);
                    this.selectedMenuItem.setClickable(true);
                }
                this.headerView.setVisibility(0);
            } else if (this.actionBar.getTag() != null && (actionBarMenuItem = this.searchItem) != null) {
                actionBarMenuItem.setVisibility(0);
            }
            if (i == 0) {
                if (this.actionBar.getTag() == null && this.avatarPicker == 0 && !this.storyMediaPicker) {
                    this.selectedMenuItem.setAlpha(this.menuShowed ? 1.0f : 0.0f);
                    this.selectedMenuItem.setScaleX(this.menuShowed ? 1.0f : 0.6f);
                    this.selectedMenuItem.setScaleY(this.menuShowed ? 1.0f : 0.6f);
                }
                this.headerView.setAlpha(this.menuShowed ? 1.0f : 0.0f);
                if (z) {
                    this.searchItem.setAlpha(this.menuShowed ? 0.0f : 1.0f);
                }
                if (this.menuShowed && (actionBarMenuItem2 = this.searchItem) != null) {
                    actionBarMenuItem2.setVisibility(4);
                }
            } else {
                this.menuAnimator = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.actionBar.getTag() == null && this.avatarPicker == 0 && !this.storyMediaPicker) {
                    arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.ALPHA, this.menuShowed ? 1.0f : 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_X, this.menuShowed ? 1.0f : 0.6f));
                    arrayList.add(ObjectAnimator.ofFloat(this.selectedMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_Y, this.menuShowed ? 1.0f : 0.6f));
                }
                FrameLayout frameLayout = this.headerView;
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, this.menuShowed ? 1.0f : 0.0f));
                if (z) {
                    arrayList.add(ObjectAnimator.ofFloat(this.searchItem, (Property<ActionBarMenuItem, Float>) property, this.menuShowed ? 0.0f : 1.0f));
                }
                this.menuAnimator.playTogether(arrayList);
                this.menuAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChatAttachAlert.this.menuAnimator = null;
                        if (!ChatAttachAlert.this.menuShowed) {
                            if (ChatAttachAlert.this.actionBar.getTag() == null) {
                                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                                if (chatAttachAlert.avatarPicker == 0 && !chatAttachAlert.storyMediaPicker) {
                                    chatAttachAlert.selectedMenuItem.setVisibility(4);
                                }
                            }
                            ChatAttachAlert.this.headerView.setVisibility(4);
                            return;
                        }
                        ActionBarMenuItem actionBarMenuItem3 = ChatAttachAlert.this.searchItem;
                        if (actionBarMenuItem3 != null) {
                            actionBarMenuItem3.setVisibility(4);
                        }
                    }
                });
                this.menuAnimator.setDuration(180L);
                this.menuAnimator.start();
            }
        }
        updateMotionItem(i != 0);
        MessageObject messageObject = this.editingMessageObject;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(getDialogId()) : 0L;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        this.writeButton.setStarsPrice(sendPaidMessagesStars, (attachAlertLayout != null ? attachAlertLayout.getSelectedItemsCount() : 0) + getAdditionalMessagesCount());
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextEmoji.getLayoutParams();
            int iMax = Math.max(AndroidUtilities.dp(48.0f), this.writeButton.width());
            if (marginLayoutParams.rightMargin != iMax) {
                marginLayoutParams.rightMargin = iMax;
                this.commentTextView.setLayoutParams(marginLayoutParams);
            }
        }
    }

    private void updateMotionItem(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null || this.motionIcon == null) {
            return;
        }
        final boolean z2 = this.menuShowed && this.allowLivePhotos && this.currentAttachLayout == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.hasLivePhotos();
        this.motionIcon.setDisabled(true ^ this.photoLayout.areLivePhotosEnabled(), z);
        if (z && this.menuShowed) {
            this.motionItem.setVisibility(0);
            this.motionItem.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.m2151$r8$lambda$onvaZGkEjkuhNXjtKAp25JpOgI(this.f$0, z2);
                }
            }).start();
        } else {
            this.motionItem.setVisibility(z2 ? 0 : 8);
            this.motionItem.setAlpha(z2 ? 1.0f : 0.0f);
            this.motionItem.setScaleX(z2 ? 1.0f : 0.6f);
            this.motionItem.setScaleY(z2 ? 1.0f : 0.6f);
        }
    }

    public static void m2151$r8$lambda$onvaZGkEjkuhNXjtKAp25JpOgI(ChatAttachAlert chatAttachAlert, boolean z) {
        if (z) {
            chatAttachAlert.getClass();
        } else {
            chatAttachAlert.motionItem.setVisibility(8);
        }
    }

    private void showMotionHint(boolean z) {
        HintView2 hintView2 = this.motionHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        final HintView2 hintView3 = new HintView2(getContext(), 1);
        this.motionHint = hintView3;
        hintView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(z ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        this.motionHint.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.motionHint.setJointPx(1.0f, -((this.containerView.getWidth() - (this.motionItem.getX() + (this.motionItem.getWidth() / 2.0f))) - AndroidUtilities.dp(14.0f)));
        this.motionHint.setTranslationY(this.selectedMenuItem.getTranslationY());
        this.motionHint.setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.containerView.removeView(hintView3);
            }
        });
        this.containerView.addView(this.motionHint, LayoutHelper.createFrame(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        this.motionHint.show();
    }

    public void setDelegate(ChatAttachViewDelegate chatAttachViewDelegate) {
        this.delegate = chatAttachViewDelegate;
    }

    public void setEmojiViewDelegate(EmojiView.EmojiViewDelegate emojiViewDelegate) {
        this.emojiViewDelegate = emojiViewDelegate;
    }

    public void init() {
        TLRPC.Chat chat;
        TLRPC.User user;
        AttachAlertLayout attachAlertLayout;
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        this.effectId = 0L;
        sendButton.setEffect(0L);
        this.botButtonWasVisible = false;
        this.botButtonProgressWasVisible = false;
        this.botMainButtonOffsetY = 0.0f;
        this.botMainButtonTextView.setVisibility(8);
        this.botProgressView.setAlpha(0.0f);
        this.botProgressView.setScaleX(0.1f);
        this.botProgressView.setScaleY(0.1f);
        this.botProgressView.setVisibility(8);
        this.buttonsRecyclerViewWrapper.setAlpha(1.0f);
        this.buttonsRecyclerViewWrapper.setTranslationY(0.0f);
        for (int i = 0; i < this.botAttachLayouts.size(); i++) {
            ((ChatAttachAlertBotWebViewLayout) this.botAttachLayouts.valueAt(i)).setMeasureOffsetY(0);
        }
        if (this.avatarPicker != 2) {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                chat = ((ChatActivity) baseFragment).getCurrentChat();
                user = ((ChatActivity) this.baseFragment).getCurrentUser();
            } else {
                long j = this.dialogId;
                if (j >= 0) {
                    user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
                    chat = null;
                } else if (j < 0) {
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                    user = null;
                } else {
                    chat = null;
                    user = null;
                }
            }
        } else {
            chat = null;
            user = null;
        }
        if (((this.baseFragment instanceof ChatActivity) && this.avatarPicker != 2) || chat != null || user != null) {
            if (chat != null) {
                this.photosEnabled = ChatObject.canSendPhoto(chat);
                this.videosEnabled = ChatObject.canSendVideo(chat);
                this.musicEnabled = ChatObject.canSendMusic(chat);
                this.pollsEnabled = ChatObject.canSendPolls(chat);
                this.todoEnabled = !ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.canSendPolls(chat);
                this.plainTextEnabled = ChatObject.canSendPlain(chat);
                this.documentsEnabled = ChatObject.canSendDocument(chat);
            } else {
                this.pollsEnabled = UserObject.isBot(user) || UserObject.isUserSelf(user);
                BaseFragment baseFragment2 = this.baseFragment;
                this.todoEnabled = !(baseFragment2 instanceof ChatActivity) || ((ChatActivity) baseFragment2).getCurrentEncryptedChat() == null;
            }
        }
        if (this.restrictEphemeralMessageTypes) {
            this.pollsEnabled = false;
            this.todoEnabled = false;
        }
        if (!(this.baseFragment instanceof ChatActivity) || this.avatarPicker == 2) {
            this.commentTextView.setVisibility(this.allowEnterCaption ? 0 : 4);
        }
        this.photoLayout.onInit(this.videosEnabled, this.photosEnabled, this.documentsEnabled);
        this.commentTextView.hidePopup(true);
        this.topCommentTextView.hidePopup(true);
        this.enterCommentEventSent = false;
        setFocusable(false);
        if (this.isStoryLocationPicker || this.isBizLocationPicker || this.isLocationPicker) {
            if (this.locationLayout == null) {
                AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), this.resourcesProvider, (this.isPollAttach || this.isLocationPicker || this.restrictEphemeralMessageTypes) ? false : true);
                this.locationLayout = chatAttachAlertLocationLayout;
                attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = this.locationActivityDelegate;
                if (locationActivityDelegate != null) {
                    chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                } else {
                    chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() {
                        @Override
                        public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i2, boolean z, int i3, long j2) {
                            ((ChatActivity) this.f$0.baseFragment).didSelectLocation(messageMedia, i2, z, i3, 0L);
                        }
                    });
                }
            }
            this.selectedId = 5L;
            attachAlertLayout = this.locationLayout;
        } else if (this.isStoryAudioPicker) {
            openAudioLayout(false);
            attachAlertLayout = this.audioLayout;
            this.selectedId = 3L;
        } else if (this.isSoundPicker) {
            openDocumentsLayout(false);
            attachAlertLayout = this.documentLayout;
            this.selectedId = 4L;
        } else {
            MessageObject messageObject = this.editingMessageObject;
            if (messageObject != null) {
                int i2 = this.editType;
                if (i2 == -1) {
                    this.typeButtonsAvailable = true;
                    if (messageObject.isMusic()) {
                        openAudioLayout(false);
                        attachAlertLayout = this.audioLayout;
                        this.selectedId = 3L;
                    } else if (this.editingMessageObject.isDocument()) {
                        openDocumentsLayout(false);
                        attachAlertLayout = this.documentLayout;
                        this.selectedId = 4L;
                    } else {
                        attachAlertLayout = this.photoLayout;
                        this.selectedId = 1L;
                    }
                } else {
                    if (i2 == 2) {
                        openAudioLayout(false);
                        attachAlertLayout = this.audioLayout;
                        this.selectedId = 3L;
                    } else if (i2 == 1) {
                        openDocumentsLayout(false);
                        attachAlertLayout = this.documentLayout;
                        this.selectedId = 4L;
                    } else {
                        attachAlertLayout = this.photoLayout;
                        this.selectedId = 1L;
                    }
                    this.typeButtonsAvailable = false;
                }
            } else {
                attachAlertLayout = this.photoLayout;
                this.typeButtonsAvailable = this.avatarPicker == 0 && !this.storyMediaPicker;
                this.selectedId = 1L;
            }
        }
        this.buttonsRecyclerViewWrapper.setVisibility(this.typeButtonsAvailable ? 0 : 8);
        if (this.currentAttachLayout != attachAlertLayout) {
            if (this.actionBar.isSearchFieldVisible()) {
                this.actionBar.closeSearchField();
            }
            this.containerView.removeView(this.currentAttachLayout);
            this.currentAttachLayout.onHide();
            this.currentAttachLayout.setVisibility(8);
            this.currentAttachLayout.onHidden();
            this.currentAttachLayout = attachAlertLayout;
            setAllowNestedScroll(true);
            if (this.currentAttachLayout.getParent() == null) {
                this.containerView.addView(this.currentAttachLayout, 0, LayoutHelper.createFrame(-1, -1.0f));
            }
            attachAlertLayout.setAlpha(1.0f);
            attachAlertLayout.setVisibility(0);
            attachAlertLayout.onShow(null);
            attachAlertLayout.onShown();
            this.actionBar.setVisibility(attachAlertLayout.needsActionBar() != 0 ? 0 : 4);
            setCaptionAbove(this.captionAbove, false);
            updateDoneItemEnabled();
        }
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (attachAlertLayout2 != chatAttachAlertPhotoLayout) {
            chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
        }
        updateCountButton(0);
        this.buttonsAdapter.notifyDataSetChanged();
        getCommentView().setText("");
        this.buttonsLayoutManager.scrollToPositionWithOffset(0, 1000000);
    }

    public void onDestroy() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onDestroy();
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
        EditTextEmoji editTextEmoji2 = this.topCommentTextView;
        if (editTextEmoji2 != null) {
            editTextEmoji2.onDestroy();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        if (this.baseFragment instanceof ChatActivity) {
            int i = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i2 = MediaController.VIDEO_BITRATE_1080;
        }
        this.currentAttachLayout.onOpenAnimationEnd();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.openTransitionFinished = true;
        if (this.videosEnabled || this.photosEnabled) {
            return;
        }
        checkCanRemoveRestrictionsByBoosts();
    }

    public void setAllowDrawContent(boolean z) {
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

    public void setAvatarPicker(int i, boolean z, Utilities.Callback0Return callback0Return) {
        this.avatarPicker = i;
        this.avatarSearch = z;
        this.avatarWithBulletin = callback0Return;
        if (i != 0) {
            this.typeButtonsAvailable = false;
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            if (attachAlertLayout == null || attachAlertLayout == this.photoLayout) {
                this.buttonsRecyclerViewWrapper.setVisibility(8);
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

    public void enableStickerMode(Utilities.Callback2 callback2) {
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoForSticker));
        this.typeButtonsAvailable = false;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        this.avatarPicker = 1;
        this.isPhotoPicker = true;
        this.isStickerMode = true;
        this.allowLivePhotos = false;
        this.customStickerHandler = callback2;
        if (this.optionsItem != null) {
            this.selectedTextView.setTranslationY(-AndroidUtilities.dp(8.0f));
            this.optionsItem.setVisibility(0);
            this.optionsItem.setClickable(true);
            this.optionsItem.setAlpha(1.0f);
            this.optionsItem.setScaleX(1.0f);
            this.optionsItem.setScaleY(1.0f);
        }
    }

    public void enablePollAttachMode(int i) {
        this.typeButtonsAvailable = true;
        this.buttonsRecyclerViewWrapper.setVisibility(0);
        this.isPollAttach = true;
        this.pollAllowedLayouts = i;
        this.avatarPicker = 0;
        this.isPhotoPicker = false;
        this.isStickerMode = false;
        this.customStickerHandler = null;
        if (this.optionsItem != null) {
            this.selectedTextView.setTranslationY(0.0f);
            this.optionsItem.setVisibility(8);
        }
    }

    public void setLocationActivityDelegate(ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate) {
        this.locationActivityDelegate = locationActivityDelegate;
    }

    public void enableDefaultMode() {
        this.typeButtonsAvailable = true;
        this.buttonsRecyclerViewWrapper.setVisibility(0);
        this.avatarPicker = 0;
        this.isPhotoPicker = false;
        this.isStickerMode = false;
        this.allowLivePhotos = true;
        this.customStickerHandler = null;
        if (this.optionsItem != null) {
            this.selectedTextView.setTranslationY(0.0f);
            this.optionsItem.setVisibility(8);
        }
    }

    public TextView getSelectedTextView() {
        return this.selectedTextView;
    }

    public int getTypeButtonsHeight() {
        if (this.typeButtonsAvailable) {
            return AndroidUtilities.dp(62.0f);
        }
        return 0;
    }

    public void setTypeButtonsHidden(final boolean z, boolean z2) {
        if (this.typeButtonsHidden == z) {
            return;
        }
        this.typeButtonsHidden = z;
        if (this.typeButtonsAvailable) {
            this.buttonsRecyclerViewWrapper.animate().cancel();
            if (!z) {
                this.buttonsRecyclerViewWrapper.setVisibility(0);
            }
            if (z2) {
                this.buttonsRecyclerViewWrapper.animate().alpha(z ? 0.0f : 1.0f).translationY(z ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlert.m2135$r8$lambda$F_2WwrSKh6zeLj_OzRDQxugYiU(this.f$0, z);
                    }
                }).start();
                return;
            }
            this.buttonsRecyclerViewWrapper.setAlpha(z ? 0.0f : 1.0f);
            this.buttonsRecyclerViewWrapper.setTranslationY(z ? AndroidUtilities.dp(48.0f) : 0.0f);
            this.buttonsRecyclerViewWrapper.setVisibility(z ? 4 : 0);
        }
    }

    public static void m2135$r8$lambda$F_2WwrSKh6zeLj_OzRDQxugYiU(ChatAttachAlert chatAttachAlert, boolean z) {
        if (z) {
            chatAttachAlert.buttonsRecyclerViewWrapper.setVisibility(4);
        } else {
            chatAttachAlert.getClass();
        }
    }

    public void setSoundPicker() {
        this.isSoundPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
    }

    public void setLocationPicker() {
        this.isLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
    }

    public void setStoryLocationPicker() {
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
    }

    public void setStoryLocationPicker(boolean z, File file) {
        this.storyLocationPickerFileIsVideo = z;
        this.storyLocationPickerPhotoFile = file;
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
    }

    public void setStoryLocationPicker(double d, double d2) {
        this.storyLocationPickerLatLong = new double[]{d, d2};
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
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

    public static boolean checkPhotoAndCameraPermission(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_VIDEO") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0;
        }
        return i < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    public static boolean checkPhotoAndDocumentsPermission(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_VIDEO") == 0;
        }
        return i < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    public void showAiButton(boolean z) {
        final boolean z2;
        if (z) {
            BaseFragment baseFragment = this.baseFragment;
            if (!(baseFragment instanceof ChatActivity) || ((ChatActivity) baseFragment).isSecretChat()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (this.shownAiButton == z2) {
            return;
        }
        if (z2) {
            MessagesController.getInstance(this.currentAccount).getTonesController().load();
        }
        this.shownAiButton = z2;
        this.aiButton.setVisibility(0);
        this.topAiButton.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorScaleY = this.aiButton.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        viewPropertyAnimatorScaleY.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.m2129$r8$lambda$3Abzd2IKdCfG0OnGzOVDiK_mU0(this.f$0, z2);
            }
        }).start();
        this.topAiButton.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.m2140$r8$lambda$NYChqFBCxMveUk0Aq1a6CPVRng(this.f$0, z2);
            }
        }).start();
        if (z2) {
            ImageView imageView = this.aiButton;
            AiButtonDrawable aiButtonDrawable = this.aiButtonIcon;
            Objects.requireNonNull(aiButtonDrawable);
            imageView.postDelayed(new CaptionPhotoViewer$$ExternalSyntheticLambda5(aiButtonDrawable), 220L);
            ImageView imageView2 = this.topAiButton;
            AiButtonDrawable aiButtonDrawable2 = this.topAiButtonIcon;
            Objects.requireNonNull(aiButtonDrawable2);
            imageView2.postDelayed(new CaptionPhotoViewer$$ExternalSyntheticLambda5(aiButtonDrawable2), 220L);
        }
    }

    public static void m2129$r8$lambda$3Abzd2IKdCfG0OnGzOVDiK_mU0(ChatAttachAlert chatAttachAlert, boolean z) {
        if (z) {
            chatAttachAlert.getClass();
        } else {
            chatAttachAlert.aiButton.setVisibility(8);
        }
    }

    public static void m2140$r8$lambda$NYChqFBCxMveUk0Aq1a6CPVRng(ChatAttachAlert chatAttachAlert, boolean z) {
        if (z) {
            chatAttachAlert.getClass();
        } else {
            chatAttachAlert.topAiButton.setVisibility(8);
        }
    }

    public static boolean checkContactsPermission(Context context) {
        return Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") == 0;
    }

    public static boolean checkMusicPermission(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return ContextCompat.checkSelfPermission(context, i >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0;
        }
        return true;
    }

    class ButtonsAdapter extends RecyclerListView.SelectionAdapter {
        private int attachBotsEndRow;
        private int attachBotsStartRow;
        private List attachMenuBots = new ArrayList();
        private int buttonsCount;
        private int contactButton;
        private int documentButton;
        private int emojiButton;
        private int galleryButton;
        private int linksButton;
        private int locationButton;
        private Context mContext;
        private int musicButton;
        private int pollButton;
        private int quickRepliesButton;
        private int richButton;
        private int stickerButton;
        private int todoButton;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public ButtonsAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View attachButton;
            if (i == 0) {
                attachButton = ChatAttachAlert.this.new AttachButton(this.mContext);
            } else {
                attachButton = ChatAttachAlert.this.new AttachBotButton(this.mContext);
            }
            attachButton.setImportantForAccessibility(1);
            attachButton.setFocusable(true);
            attachButton.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            return new RecyclerListView.Holder(attachButton);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            boolean zCheckContactsPermission;
            String str;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    return;
                }
                AttachBotButton attachBotButton = (AttachBotButton) viewHolder.itemView;
                attachBotButton.glassTabView.onPreBind();
                int i2 = this.attachBotsStartRow;
                if (i >= i2 && i < this.attachBotsEndRow) {
                    int i3 = i - i2;
                    attachBotButton.setTag(Integer.valueOf(i3));
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.attachMenuBots.get(i3);
                    attachBotButton.setAttachBot(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(tL_attachMenuBot.bot_id)), tL_attachMenuBot);
                    return;
                }
                int i4 = i - this.buttonsCount;
                attachBotButton.setTag(Integer.valueOf(i4));
                attachBotButton.setUser(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).inlineBots.get(i4).peer.user_id)));
                return;
            }
            AttachButton attachButton = (AttachButton) viewHolder.itemView;
            attachButton.glassTabView.onPreBind();
            if (i == this.galleryButton) {
                attachButton.setTextAndIcon(1, LocaleController.getString(R.string.ChatGallery), GlassTabView.TabAnimation.GALLERY);
                attachButton.setTag(1);
                zCheckContactsPermission = ChatAttachAlert.checkPhotoAndCameraPermission(this.mContext);
            } else if (i == this.documentButton) {
                attachButton.setTextAndIcon(4, LocaleController.getString(R.string.ChatDocument), GlassTabView.TabAnimation.FILES);
                attachButton.setTag(4);
                zCheckContactsPermission = ChatAttachAlert.checkPhotoAndDocumentsPermission(this.mContext);
            } else {
                if (i == this.locationButton) {
                    attachButton.setTextAndIcon(6, LocaleController.getString(R.string.ChatLocation), GlassTabView.TabAnimation.LOCATION);
                    attachButton.setTag(6);
                } else if (i == this.musicButton) {
                    attachButton.setTextAndIcon(3, LocaleController.getString(R.string.AttachMusic), GlassTabView.TabAnimation.MUSIC);
                    attachButton.setTag(3);
                    zCheckContactsPermission = ChatAttachAlert.checkMusicPermission(this.mContext);
                } else if (i == this.pollButton) {
                    attachButton.setTextAndIcon(9, LocaleController.getString(R.string.Poll), GlassTabView.TabAnimation.POLL);
                    attachButton.setTag(9);
                } else {
                    if (i == this.contactButton) {
                        attachButton.setTextAndIcon(5, LocaleController.getString(R.string.AttachContact), GlassTabView.TabAnimation.CONTACTS);
                        attachButton.setTag(5);
                        zCheckContactsPermission = ChatAttachAlert.checkContactsPermission(this.mContext);
                    } else {
                        if (i == this.quickRepliesButton) {
                            attachButton.setTextAndIcon(11, LocaleController.getString(R.string.AttachQuickReplies), GlassTabView.TabAnimation.REPLIES);
                            attachButton.setTag(11);
                        } else if (i == this.todoButton) {
                            attachButton.setTextAndIcon(12, LocaleController.getString(R.string.Todo), GlassTabView.TabAnimation.CHECKLIST);
                            attachButton.setTag(12);
                        } else if (i == this.stickerButton) {
                            attachButton.setTextAndIcon(13, LocaleController.getString(R.string.ChatSticker), GlassTabView.TabAnimation.STICKER);
                            attachButton.setTag(13);
                        } else if (i == this.linksButton) {
                            attachButton.setTextAndIcon(15, LocaleController.getString(R.string.ChatLink), GlassTabView.TabAnimation.LINK);
                            attachButton.setTag(15);
                        } else if (i == this.emojiButton) {
                            attachButton.setTextAndIcon(14, LocaleController.getString(R.string.ChatEmoji), GlassTabView.TabAnimation.EMOJI);
                            attachButton.setTag(14);
                        } else if (i == this.richButton) {
                            attachButton.setTextAndIcon(16, LocaleController.getString(R.string.AttachArticle), GlassTabView.TabAnimation.ARTICLE);
                            attachButton.setTag(16);
                            z = !MessagesController.getInstance(ChatAttachAlert.this.currentAccount).storyEntitiesAllowed();
                            z2 = false;
                        }
                        z2 = false;
                        z = true;
                    }
                    GlassTabView glassTabView = attachButton.glassTabView;
                    if (z2) {
                        str = "!";
                    } else {
                        str = null;
                    }
                    glassTabView.setCounter(str, z2, false);
                    attachButton.glassTabView.setPremiumBadge((z || UserConfig.getInstance(ChatAttachAlert.this.currentAccount).isPremium()) ? false : true);
                }
                z2 = false;
                z = false;
                GlassTabView glassTabView2 = attachButton.glassTabView;
                if (z2) {
                    str = "!";
                } else {
                    str = null;
                }
                glassTabView2.setCounter(str, z2, false);
                attachButton.glassTabView.setPremiumBadge((z || UserConfig.getInstance(ChatAttachAlert.this.currentAccount).isPremium()) ? false : true);
            }
            z2 = !zCheckContactsPermission;
            z = false;
            GlassTabView glassTabView3 = attachButton.glassTabView;
            if (z2) {
                str = "!";
            } else {
                str = null;
            }
            glassTabView3.setCounter(str, z2, false);
            attachButton.glassTabView.setPremiumBadge((z || UserConfig.getInstance(ChatAttachAlert.this.currentAccount).isPremium()) ? false : true);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            ChatAttachAlert.this.applyAttachButtonColors(viewHolder.itemView);
        }

        @Override
        public int getItemCount() {
            int i = this.buttonsCount;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            return (chatAttachAlert.editingMessageObject == null && (chatAttachAlert.baseFragment instanceof ChatActivity) && !chatAttachAlert.isPollAttach) ? i + MediaDataController.getInstance(chatAttachAlert.currentAccount).inlineBots.size() : i;
        }

        @Override
        public void notifyDataSetChanged() {
            int i = 0;
            this.buttonsCount = 0;
            this.galleryButton = -1;
            this.documentButton = -1;
            this.musicButton = -1;
            this.pollButton = -1;
            this.todoButton = -1;
            this.contactButton = -1;
            this.quickRepliesButton = -1;
            this.locationButton = -1;
            this.stickerButton = -1;
            this.linksButton = -1;
            this.richButton = -1;
            this.emojiButton = -1;
            this.attachBotsStartRow = -1;
            this.attachBotsEndRow = -1;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (chatAttachAlert.isPollAttach) {
                this.buttonsCount = 1;
                this.galleryButton = 0;
                if (chatAttachAlert.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 16)) {
                    int i2 = this.buttonsCount;
                    this.buttonsCount = i2 + 1;
                    this.documentButton = i2;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 8192)) {
                    int i3 = this.buttonsCount;
                    this.buttonsCount = i3 + 1;
                    this.stickerButton = i3;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 16384)) {
                    int i4 = this.buttonsCount;
                    this.buttonsCount = i4 + 1;
                    this.emojiButton = i4;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 8)) {
                    int i5 = this.buttonsCount;
                    this.buttonsCount = i5 + 1;
                    this.musicButton = i5;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 64)) {
                    int i6 = this.buttonsCount;
                    this.buttonsCount = i6 + 1;
                    this.locationButton = i6;
                }
                if (ChatAttachAlert.this.pollAllowedLayouts == 0 || BitwiseUtils.hasFlag(ChatAttachAlert.this.pollAllowedLayouts, 32768)) {
                    int i7 = this.buttonsCount;
                    this.buttonsCount = i7 + 1;
                    this.linksButton = i7;
                }
            } else {
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                if (!(baseFragment instanceof ChatActivity)) {
                    this.galleryButton = 0;
                    this.buttonsCount = 2;
                    this.documentButton = 1;
                    if (chatAttachAlert.allowEnterCaption) {
                        this.buttonsCount = 3;
                        this.musicButton = 2;
                    }
                } else if (chatAttachAlert.editingMessageObject != null) {
                    if (chatAttachAlert.editType != -1) {
                        if (ChatAttachAlert.this.editType == 0) {
                            int i8 = this.buttonsCount;
                            this.buttonsCount = i8 + 1;
                            this.galleryButton = i8;
                        }
                        if (ChatAttachAlert.this.editType == 1) {
                            int i9 = this.buttonsCount;
                            this.buttonsCount = i9 + 1;
                            this.documentButton = i9;
                        }
                        if (ChatAttachAlert.this.editType == 2) {
                            int i10 = this.buttonsCount;
                            this.buttonsCount = i10 + 1;
                            this.musicButton = i10;
                        }
                    } else {
                        int i11 = this.buttonsCount;
                        this.galleryButton = i11;
                        this.documentButton = i11 + 1;
                        this.buttonsCount = i11 + 3;
                        this.musicButton = i11 + 2;
                    }
                } else {
                    TLRPC.User currentUser = OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(baseFragment) ? ((ChatActivity) baseFragment).getCurrentUser() : null;
                    BaseFragment baseFragment2 = ChatAttachAlert.this.baseFragment;
                    TLRPC.Chat currentChat = baseFragment2 instanceof ChatActivity ? ((ChatActivity) baseFragment2).getCurrentChat() : null;
                    boolean z = currentUser != null && ((ChatActivity) ChatAttachAlert.this.baseFragment).getMessagesController().getSendPaidMessagesStars(currentUser.id) > 0;
                    int i12 = this.buttonsCount;
                    this.buttonsCount = i12 + 1;
                    this.galleryButton = i12;
                    if ((ChatAttachAlert.this.photosEnabled || ChatAttachAlert.this.videosEnabled) && !z && (currentChat == null || !ChatObject.isMonoForum(currentChat))) {
                        BaseFragment baseFragment3 = ChatAttachAlert.this.baseFragment;
                        if ((baseFragment3 instanceof ChatActivity) && !((ChatActivity) baseFragment3).isInScheduleMode() && !((ChatActivity) ChatAttachAlert.this.baseFragment).isSecretChat() && ((ChatActivity) ChatAttachAlert.this.baseFragment).getChatMode() != 5) {
                            ChatActivity chatActivity = (ChatActivity) ChatAttachAlert.this.baseFragment;
                            this.attachBotsStartRow = this.buttonsCount;
                            this.attachMenuBots.clear();
                            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).getAttachMenuBots().bots;
                            int size = arrayList.size();
                            while (i < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i);
                                i++;
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                if (tL_attachMenuBot2.show_in_attach_menu) {
                                    if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, chatActivity.getCurrentChat() != null ? chatActivity.getCurrentChat() : chatActivity.getCurrentUser())) {
                                        this.attachMenuBots.add(tL_attachMenuBot2);
                                    }
                                }
                            }
                            int size2 = this.buttonsCount + this.attachMenuBots.size();
                            this.buttonsCount = size2;
                            this.attachBotsEndRow = size2;
                        }
                    }
                    int i13 = this.buttonsCount;
                    this.buttonsCount = i13 + 1;
                    this.documentButton = i13;
                    if (ChatAttachAlert.this.plainTextEnabled) {
                        int i14 = this.buttonsCount;
                        this.buttonsCount = i14 + 1;
                        this.locationButton = i14;
                    }
                    if (ChatAttachAlert.this.plainTextEnabled && MessagesController.getInstance(ChatAttachAlert.this.currentAccount).richEditorAvailable()) {
                        int i15 = this.buttonsCount;
                        this.buttonsCount = i15 + 1;
                        this.richButton = i15;
                    }
                    if (ChatAttachAlert.this.pollsEnabled) {
                        int i16 = this.buttonsCount;
                        this.buttonsCount = i16 + 1;
                        this.pollButton = i16;
                    }
                    if (ChatAttachAlert.this.todoEnabled) {
                        int i17 = this.buttonsCount;
                        this.buttonsCount = i17 + 1;
                        this.todoButton = i17;
                    }
                    if (ChatAttachAlert.this.plainTextEnabled) {
                        int i18 = this.buttonsCount;
                        this.buttonsCount = i18 + 1;
                        this.contactButton = i18;
                    }
                    BaseFragment baseFragment4 = ChatAttachAlert.this.baseFragment;
                    if ((baseFragment4 instanceof ChatActivity) && ((ChatActivity) baseFragment4).getChatMode() == 0 && currentUser != null && !z && !currentUser.bot && QuickRepliesController.getInstance(ChatAttachAlert.this.currentAccount).hasReplies()) {
                        int i19 = this.buttonsCount;
                        this.buttonsCount = i19 + 1;
                        this.quickRepliesButton = i19;
                    }
                    int i20 = this.buttonsCount;
                    this.buttonsCount = i20 + 1;
                    this.musicButton = i20;
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
                    this.f$0.removeFromRoot();
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
        this.todoLayout = null;
        this.locationLayout = null;
        this.documentLayout = null;
        int i = 1;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
                if (attachAlertLayout != null) {
                    attachAlertLayout.onDestroy();
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
        } else {
            if (this.actionBar.isSearchFieldVisible()) {
                this.actionBar.closeSearchField();
                return;
            }
            if (this.currentAttachLayout.onBackPressed()) {
                return;
            }
            if (getCommentView() != null && getCommentView().isPopupShowing()) {
                getCommentView().hidePopup(true);
            } else {
                super.onBackPressed();
            }
        }
    }

    public EditTextEmoji getCommentView() {
        AttachAlertLayout attachAlertLayout;
        return (this.captionAbove && ((attachAlertLayout = this.currentAttachLayout) == this.photoLayout || attachAlertLayout == this.photoPreviewLayout)) ? this.topCommentTextView : this.commentTextView;
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
    protected void onDismissWithTouchOutside() {
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
        EditTextEmoji editTextEmoji2 = this.topCommentTextView;
        if (editTextEmoji2 != null) {
            AndroidUtilities.hideKeyboard(editTextEmoji2.getEditText());
        }
        this.botAttachLayouts.clear();
        BaseFragment lastFragment = this.baseFragment;
        if (lastFragment == null) {
            lastFragment = LaunchActivity.getLastFragment();
        }
        if (!this.allowPassConfirmationAlert && lastFragment != null && this.currentAttachLayout.getSelectedItemsCount() > 0 && !this.isPhotoPicker) {
            if (this.confirmationAlertShown) {
                return;
            }
            this.confirmationAlertShown = true;
            AlertDialog alertDialogCreate = new AlertDialog.Builder(lastFragment.getParentActivity(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.DiscardSelectionAlertTitle)).setMessage(LocaleController.getString(R.string.DiscardSelectionAlertMessage)).setPositiveButton(LocaleController.getString(R.string.Discard), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatAttachAlert.$r8$lambda$BgPeEd8DPPzTzAZBL6bsanLSMq0(this.f$0, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ChatAttachAlert.m2132$r8$lambda$AyPZX92ztpgipgCqbbqxt8giBE(this.f$0, dialogInterface);
                }
            }).setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f$0.confirmationAlertShown = false;
                }
            }).create();
            alertDialogCreate.show();
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
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
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null && this.currentAttachLayout != attachAlertLayout) {
                attachAlertLayout.onDismiss();
            }
            i++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), 0), true, new AndroidUtilities.IntColorCallback() {
            @Override
            public final void run(int i2) {
                ChatAttachAlert.m2131$r8$lambda$89ISqsmZFXCMNzK88NNY4kcn_k(this.f$0, i2);
            }
        });
        if (lastFragment != null) {
            AndroidUtilities.setLightStatusBar(this, lastFragment.isLightStatusBar());
        }
        this.captionLimitBulletinShown = false;
        super.dismiss();
        this.allowPassConfirmationAlert = false;
    }

    public static void $r8$lambda$BgPeEd8DPPzTzAZBL6bsanLSMq0(ChatAttachAlert chatAttachAlert, AlertDialog alertDialog, int i) {
        chatAttachAlert.allowPassConfirmationAlert = true;
        chatAttachAlert.dismiss();
    }

    public static void m2132$r8$lambda$AyPZX92ztpgipgCqbbqxt8giBE(ChatAttachAlert chatAttachAlert, DialogInterface dialogInterface) {
        SpringAnimation springAnimation = chatAttachAlert.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(chatAttachAlert.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        chatAttachAlert.appearSpringAnimation = springAnimation2;
        springAnimation2.getSpring().setDampingRatio(1.5f);
        chatAttachAlert.appearSpringAnimation.getSpring().setStiffness(1500.0f);
        chatAttachAlert.appearSpringAnimation.start();
    }

    public static void m2131$r8$lambda$89ISqsmZFXCMNzK88NNY4kcn_k(ChatAttachAlert chatAttachAlert, int i) {
        chatAttachAlert.navBarColorKey = -1;
        chatAttachAlert.navBarColor = i;
        chatAttachAlert.containerView.invalidate();
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

    public ChatAttachAlertDocumentLayout getDocumentLayout() {
        return this.documentLayout;
    }

    public void setAllowEnterCaption(boolean z) {
        this.allowEnterCaption = z;
    }

    public void setAudioSelectDelegate(ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate) {
        this.audioSelectDelegate = audioSelectDelegate;
    }

    public void setDocumentsDelegate(ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentSelectActivityDelegate) {
        this.documentsDelegate = documentSelectActivityDelegate;
    }

    public void replaceWithText(int i, int i2, CharSequence charSequence, boolean z) {
        if (getCommentView() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getCommentView().getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                Emoji.replaceEmoji(spannableStringBuilder, getCommentView().getEditText().getPaint().getFontMetricsInt(), false);
            }
            getCommentView().setText(spannableStringBuilder);
            getCommentView().setSelection(i + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void createMentionsContainer() {
        MentionsContainerView mentionsContainerView = new MentionsContainerView(getContext(), this.dialogId, 0L, LaunchActivity.getLastFragment(), this.resourcesProvider) {
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
        this.mentionContainer = mentionsContainerView;
        mentionsContainerView.withDelegate(new MentionsContainerView.Delegate() {
            @Override
            public void addEmojiToRecent(String str) {
                MentionsContainerView.Delegate.CC.$default$addEmojiToRecent(this, str);
            }

            @Override
            public void onStickerSelected(TLRPC.TL_document tL_document, String str, Object obj) {
                MentionsContainerView.Delegate.CC.$default$onStickerSelected(this, tL_document, str, obj);
            }

            @Override
            public void sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
                MentionsContainerView.Delegate.CC.$default$sendBotInlineResult(this, botInlineResult, z, i);
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
        setupMentionContainer(this.mentionContainer);
        updateCommentTextViewPosition();
    }

    protected void setupMentionContainer(MentionsContainerView mentionsContainerView) {
        mentionsContainerView.getAdapter().setAllowStickers(false);
        mentionsContainerView.getAdapter().setAllowBots(false);
        mentionsContainerView.getAdapter().setAllowChats(false);
        if (this.baseFragment instanceof ChatActivity) {
            mentionsContainerView.getAdapter().setSearchInDialogs(false);
            ChatActivity chatActivity = (ChatActivity) this.baseFragment;
            mentionsContainerView.getAdapter().setUserOrChat(chatActivity.getCurrentUser(), chatActivity.getCurrentChat());
            mentionsContainerView.getAdapter().setChatInfo(chatActivity.getCurrentChatInfo());
            mentionsContainerView.getAdapter().setNeedUsernames(chatActivity.getCurrentChat() != null);
        } else {
            mentionsContainerView.getAdapter().setSearchInDialogs(true);
            mentionsContainerView.getAdapter().setChatInfo(null);
            mentionsContainerView.getAdapter().setNeedUsernames(false);
        }
        mentionsContainerView.getAdapter().setNeedBotContext(false);
    }

    public void setCaptionAbove(boolean z) {
        setCaptionAbove(z, true);
    }

    public void setCaptionAbove(boolean z, boolean z2) {
        this.animatorCaptionAbove.setValue(z, z2);
        EditTextEmoji commentView = getCommentView();
        this.captionAbove = z;
        EditTextEmoji commentView2 = getCommentView();
        final boolean z3 = this.frameLayout2.getTag() != null;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        final boolean z4 = this.captionAbove && (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout);
        if (z2) {
            this.topCommentContainer.setVisibility(z3 ? 0 : 8);
            ViewPropertyAnimator duration = this.topCommentContainer.animate().alpha((z4 && z3) ? 1.0f : 0.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.updatedTopCaptionHeight();
                }
            }).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.$r8$lambda$0zFXQGXYeRPubNXJ7XgKR9rfJxI(this.f$0, z4, z3);
                }
            }).start();
            this.captionContainer.setVisibility(0);
            this.captionContainer.animate().translationY((z4 || !z3) ? this.captionContainer.getMeasuredHeight() : 0.0f).alpha((z4 || !z3) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.frameLayout2.invalidate();
                }
            }).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.$r8$lambda$05hL0aXoHWXl1UwrYauTNsBeEEg(this.f$0, z4, z3);
                }
            }).start();
        } else {
            this.topCommentContainer.setVisibility((z4 && z3) ? 0 : 8);
            this.topCommentContainer.setAlpha((z4 && z3) ? 1.0f : 0.0f);
            updatedTopCaptionHeight();
            this.captionContainer.setAlpha((z4 || !z3) ? 0.0f : 1.0f);
            FrameLayout frameLayout = this.captionContainer;
            frameLayout.setTranslationY((z4 || !z3) ? frameLayout.getMeasuredHeight() : 0.0f);
            this.captionContainer.setVisibility((z4 || !z3) ? 8 : 0);
        }
        if (commentView != commentView2) {
            commentView.hidePopup(true);
            commentView2.setText(AnimatedEmojiSpan.cloneSpans(commentView.getText()));
            commentView2.getEditText().setAllowTextEntitiesIntersection(commentView.getEditText().getAllowTextEntitiesIntersection());
            if (commentView.getEditText().isFocused()) {
                commentView2.getEditText().requestFocus();
                commentView2.getEditText().setSelection(commentView.getEditText().getSelectionStart(), commentView.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.$r8$lambda$7Qwe_tqJzigTmpbXSua__McoOmc(this.f$0);
            }
        });
    }

    public static void $r8$lambda$0zFXQGXYeRPubNXJ7XgKR9rfJxI(ChatAttachAlert chatAttachAlert, boolean z, boolean z2) {
        chatAttachAlert.getClass();
        if (!z || !z2) {
            chatAttachAlert.topCommentContainer.setVisibility(8);
        }
        chatAttachAlert.updatedTopCaptionHeight();
    }

    public static void $r8$lambda$05hL0aXoHWXl1UwrYauTNsBeEEg(ChatAttachAlert chatAttachAlert, boolean z, boolean z2) {
        chatAttachAlert.getClass();
        if (z || !z2) {
            chatAttachAlert.captionContainer.setVisibility(8);
        }
    }

    public static void $r8$lambda$7Qwe_tqJzigTmpbXSua__McoOmc(ChatAttachAlert chatAttachAlert) {
        EditTextEmoji editTextEmoji = chatAttachAlert.captionAbove ? chatAttachAlert.topCommentTextView : chatAttachAlert.commentTextView;
        chatAttachAlert.showAiButton(editTextEmoji.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(editTextEmoji.getText().toString().trim()));
    }

    public void updatedTopCaptionHeight() {
        updateSelectedPosition(0);
        this.sizeNotifierFrameLayout.invalidate();
        this.topCommentContainer.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.checkCameraViewPosition();
            RecyclerListView recyclerListView = this.photoLayout.gridView;
            if (recyclerListView != null && recyclerListView.getFastScroll() != null) {
                this.photoLayout.gridView.getFastScroll().topOffset = ActionBar.getCurrentActionBarHeight() + this.photoLayout.listAdditionalH + (this.captionAbove ? (int) (this.topCommentContainer.getMeasuredHeight() * this.topCommentContainer.getAlpha()) : 0);
                this.photoLayout.gridView.getFastScroll().invalidate();
            }
        }
        updateCommentTextViewPosition();
        checkUi_writeButtonContainerY();
    }

    private void toggleCaptionAbove() {
        setCaptionAbove(!this.captionAbove);
    }

    public void checkIsEphemeralMessage(boolean z) {
        boolean z2;
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment == null || !(baseFragment instanceof ChatActivity)) {
            return;
        }
        ChatActivity chatActivity = (ChatActivity) baseFragment;
        EditTextEmoji editTextEmoji = this.captionAbove ? this.topCommentTextView : this.commentTextView;
        String string = editTextEmoji != null ? editTextEmoji.getText().toString() : null;
        if (this.editingMessageObject == null) {
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            z2 = true;
            if ((attachAlertLayout != null && attachAlertLayout.getSelectedItemsCount() > 1) || (!EphemeralMessagesHelper.getInstance(this.currentAccount).isEphemeralCommand(string, chatActivity.botInfo) && (chatActivity.getReplyMessage() == null || !chatActivity.getReplyMessage().isEphemeral()))) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.animatorEphemeralMessageVisibility.setValue(z2, z);
        if (z2 && isCaptionAbove()) {
            setCaptionAbove(false, z);
        }
    }

    public void blur3_InvalidateBlur() {
        boolean z;
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        ViewPositionWatcher.computeRectInParent(this.buttonsRecyclerViewWrapper, this.containerView, this.iBlur3PositionMainTabs);
        this.iBlur3PositionActionBar.set(0.0f, 0.0f, this.containerView.getMeasuredWidth(), this.actionBar.getMeasuredHeight());
        this.iBlur3PositionActionBar.inset(0.0f, -AndroidUtilities.dp(48.0f));
        this.iBlur3PositionMainTabs.set(0.0f, this.containerView.getMeasuredHeight() - (Math.max(AndroidUtilities.navigationBarHeight, getEmojiPadding()) + AndroidUtilities.dp(180.0f)), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (attachAlertLayout != chatAttachAlertPhotoLayout || chatAttachAlertPhotoLayout == null || chatAttachAlertPhotoLayout.gridView.getFastScroll() == null) {
            z = false;
        } else {
            this.photoLayout.gridView.getFastScroll().fillDrawablesRect(this.iBlur3PositionFastScroll);
            RecyclerListView.FastScroll fastScroll = this.photoLayout.gridView.getFastScroll();
            ViewGroup viewGroup = this.containerView;
            RectF rectF = AndroidUtilities.rectTmp;
            ViewPositionWatcher.computeRectInParent(fastScroll, viewGroup, rectF);
            this.iBlur3PositionFastScroll.offset(rectF.left, rectF.top);
            this.iBlur3PositionFastScroll.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
            RectF rectF2 = this.iBlur3PositionFastScroll;
            rectF2.left = Math.max(0.0f, rectF2.left);
            this.iBlur3PositionFastScroll.right = Math.min(this.containerView.getMeasuredWidth(), this.iBlur3PositionFastScroll.right);
            z = true;
        }
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3PositionsMerged, RectFMergeBounding.mergeOverlapping(this.iBlur3Positions, z ? 3 : 2, this.iBlur3PositionsMerged));
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public static class SearchFadeView extends View {
        private final int bgKeyColor;
        private final GradientProtectionDrawable gradientProtectionDrawable;
        private final GradientProtectionDrawable gradientProtectionDrawable2;
        private final Theme.ResourcesProvider resourcesProvider;

        public SearchFadeView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.gradientProtectionDrawable = new GradientProtectionDrawable(2);
            this.gradientProtectionDrawable2 = new GradientProtectionDrawable(2);
            this.resourcesProvider = resourcesProvider;
            this.bgKeyColor = i;
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            int i5 = AndroidUtilities.statusBarHeight;
            this.gradientProtectionDrawable.setInsets(0, AndroidUtilities.dp(12.0f) + i5, 0, 0);
            this.gradientProtectionDrawable.setBounds(0, 0, i, AndroidUtilities.dp(52.0f) + i5);
            this.gradientProtectionDrawable2.setInsets(0, i5 / 3, 0, 0);
            this.gradientProtectionDrawable2.setBounds(0, 0, i, i5);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.gradientProtectionDrawable.setColor(Theme.multAlpha(Theme.getColor(this.bgKeyColor, this.resourcesProvider), 0.5f));
            this.gradientProtectionDrawable.draw(canvas);
            this.gradientProtectionDrawable2.setColor(Theme.multAlpha(Theme.getColor(this.bgKeyColor, this.resourcesProvider), 0.95f));
            this.gradientProtectionDrawable2.draw(canvas);
        }
    }

    public void onPollAttachFilePicker(Intent intent) {
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
        if (chatAttachAlertPollLayout != null) {
            chatAttachAlertPollLayout.onPollAttachFilePicker(intent);
        }
    }

    public void checkUi_fadeTopAlpha() {
        int alpha;
        if (this.fadeView == null || this.actionBar == null) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        ChatActivityFadeView chatActivityFadeView = this.fadeView;
        if (this.actionBar.getVisibility() == 0) {
            alpha = (int) ((zIsDark ? 255 : 160) * this.actionBar.getAlpha());
        } else {
            alpha = 0;
        }
        chatActivityFadeView.setFadeTopAlpha(alpha);
    }

    public static class AttachSearchField extends FragmentSearchField {
        private final ChatAttachAlert parentAlert;

        public AttachSearchField(Context context, ChatAttachAlert chatAttachAlert, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.parentAlert = chatAttachAlert;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.parentAlert.makeFocusable(this.editText, true);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }
}
