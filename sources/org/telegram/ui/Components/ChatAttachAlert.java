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
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
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
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
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
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
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
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.BotWebViewContainer;

public class ChatAttachAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, BottomSheet.BottomSheetDelegateInterface, FactorAnimator.Target {
    private static final int ANIMATOR_ID_ACTIONBAR_VISIBLE = 2;
    private static final int ANIMATOR_ID_CAPTION_ABOVE = 0;
    private static final int ANIMATOR_ID_CAPTION_NOT_EMPTY = 3;
    private static final int ANIMATOR_ID_CAPTION_VISIBLE = 1;
    private static final int ANIMATOR_ID_EPHEMERAL_MESSAGE_VISIBILITY = 5;
    private static final int ANIMATOR_ID_TOGGLE_CAPTION_SUPPORTED = 4;
    public static final int EDITMEDIA_TYPE_ANY = -1;
    public static final int EDITMEDIA_TYPE_FILE = 1;
    public static final int EDITMEDIA_TYPE_MUSIC = 2;
    public static final int EDITMEDIA_TYPE_PHOTOVIDEO = 0;
    public static final int LAYOUT_TYPE_CONTACTS = 5;
    public static final int LAYOUT_TYPE_DOCUMENTS = 4;
    public static final int LAYOUT_TYPE_EMOJI = 14;
    public static final int LAYOUT_TYPE_LINK = 15;
    public static final int LAYOUT_TYPE_LOCATION = 6;
    public static final int LAYOUT_TYPE_MUSIC = 3;
    public static final int LAYOUT_TYPE_PHOTO = 1;
    public static final int LAYOUT_TYPE_POLL = 9;
    public static final int LAYOUT_TYPE_REPLIES = 11;
    public static final int LAYOUT_TYPE_RICH = 16;
    public static final int LAYOUT_TYPE_STICKERS = 13;
    public static final int LAYOUT_TYPE_TODO = 12;
    public final Property<AttachAlertLayout, Float> ATTACH_ALERT_LAYOUT_TRANSLATION;
    private final Property<ChatAttachAlert, Float> ATTACH_ALERT_PROGRESS;
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
    protected Utilities.Callback0Return<PhotoViewer.PlaceProviderObject> avatarWithBulletin;
    public final BaseFragment baseFragment;
    private float baseSelectedTextViewTranslationY;
    private LongSparseArray<ChatAttachAlertBotWebViewLayout> botAttachLayouts;
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
    public Utilities.Callback2<String, TLRPC.InputDocument> customStickerHandler;
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
    private ArrayList<Rect> exclusionRects;
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
    private final ArrayList<RectF> iBlur3Positions;
    private final ArrayList<RectF> iBlur3PositionsMerged;
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
    private ValueAnimator sendButtonColorAnimator;
    boolean sendButtonEnabled;
    private float sendButtonEnabledProgress;
    public boolean sent;
    private ImageUpdater.AvatarFor setAvatarFor;
    private final boolean showingFromDialog;
    private boolean shownAiButton;
    public SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private ChatAttachAlertEmojiLayout stickersLayout;
    private boolean stories;
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

    public class AnonymousClass1 implements BotWebViewContainer.Delegate {
        private ValueAnimator botButtonAnimator;
        final long val$id;
        final String val$startCommand;
        final ChatAttachAlertBotWebViewLayout val$webViewLayout;

        public AnonymousClass1(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, long j) {
            this.val$webViewLayout = chatAttachAlertBotWebViewLayout;
            this.val$startCommand = str;
            this.val$id = j;
        }

        public static void lambda$onCloseRequested$0(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }

        public void lambda$onSetupMainButton$6(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(1.0f - fFloatValue);
            ChatAttachAlert.this.botMainButtonTextView.setAlpha(fFloatValue);
            ChatAttachAlert.this.botMainButtonOffsetY = fFloatValue * AndroidUtilities.dp(36.0f);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.buttonsRecyclerViewWrapper.setTranslationY(chatAttachAlert.botMainButtonOffsetY);
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

        public void lambda$onWebAppSetActionBarColor$1(int i, int i2, ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating, ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int iBlendARGB = ColorUtils.blendARGB(fFloatValue, i, i2);
            ChatAttachAlert.this.overridenWebviewBackgroundColor = iBlendARGB;
            ChatAttachAlert.this.hasOverridenWebviewBackgroundColor = true;
            ActionBar actionBar = ChatAttachAlert.this.actionBar;
            if (actionBar != null) {
                actionBar.updateColors();
                ChatAttachAlert.this.actionBar.invalidate();
            }
            ChatAttachAlert.this.iBlur3SourceColor.paint.setColor(iBlendARGB);
            if (ChatAttachAlert.this.fadeView != null) {
                ChatAttachAlert.this.fadeView.invalidate();
            }
            chatAttachAlertBotWebViewLayout.setCustomActionBarBackground(iBlendARGB);
            ChatAttachAlert.this.currentAttachLayout.invalidate();
            ChatAttachAlert.this.sizeNotifierFrameLayout.invalidate();
            botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(ChatAttachAlert.this.actionBar, fFloatValue);
        }

        public boolean lambda$onWebAppSwitchInlineQuery$5(TLRPC.User user, String str, OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
            long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j)) {
                bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j));
            } else if (DialogObject.isUserDialog(j)) {
                bundleM.putLong("user_id", j);
            } else {
                bundleM.putLong("chat_id", -j);
            }
            bundleM.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            if (MessagesController.getInstance(chatAttachAlert.currentAccount).checkCanOpenChat(bundleM, baseFragment)) {
                overlayActionBarLayoutDialog.dismiss();
                ChatAttachAlert.this.dismiss(true);
                INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(new ChatActivity(bundleM));
                navigationParams.removeLast = true;
                baseFragment.presentFragment(navigationParams);
            }
            return true;
        }

        @Override
        public BotSensors getBotSensors() {
            return null;
        }

        public String getWebAppName() {
            return null;
        }

        @Override
        public boolean isClipboardAvailable() {
            return MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).botInAttachMenu(this.val$id) || MessagesController.getInstance(ChatAttachAlert.this.currentAccount).whitelistedBots.contains(Long.valueOf(this.val$id));
        }

        @Override
        public void onCloseRequested(Runnable runnable) {
            if (ChatAttachAlert.this.currentAttachLayout != this.val$webViewLayout) {
                return;
            }
            ChatAttachAlert.this.setFocusable(false);
            ChatAttachAlert.this.getWindow().setSoftInputMode(48);
            ChatAttachAlert.this.lambda$showGiftOfferSheet$15();
            AndroidUtilities.runOnUIThread(new ChatAttachAlert$1$$ExternalSyntheticLambda6(0, runnable), 150L);
        }

        @Override
        public void onCloseToTabs() {
            onCloseRequested(null);
        }

        @Override
        public void onEmojiStatusGranted(boolean z) {
        }

        @Override
        public void onEmojiStatusSet(TLRPC.Document document) {
        }

        @Override
        public String onFullscreenRequested(boolean z, boolean z2) {
            return "UNSUPPORTED";
        }

        @Override
        public void onInstantClose() {
            onCloseRequested(null);
        }

        @Override
        public void onLocationGranted(boolean z) {
        }

        @Override
        public void onOpenBackFromTabs() {
        }

        @Override
        public void onOrientationLockChanged(boolean z) {
        }

        @Override
        public void onSendWebViewData(String str) {
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
        public void onSetupMainButton(final boolean z, boolean z2, String str, long j, int i, int i2, final boolean z3, boolean z4) {
            int i3 = 1;
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout) {
                if (chatAttachAlertBotWebViewLayout.isBotButtonAvailable || this.val$startCommand != null) {
                    ChatAttachAlert.this.botMainButtonTextView.setClickable(z2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (j != 0) {
                        spannableStringBuilder.append((CharSequence) "* ");
                        spannableStringBuilder.append((CharSequence) str);
                        spannableStringBuilder.setSpan(new AnimatedEmojiSpan(j, 1.4f, ChatAttachAlert.this.botMainButtonTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
                        ChatAttachAlert.this.botMainButtonTextView.setText(spannableStringBuilder);
                    } else {
                        ChatAttachAlert.this.botMainButtonTextView.setText(str);
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
                        duration.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, i3));
                        this.botButtonAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (z) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(8);
                                } else {
                                    ChatAttachAlert.this.botMainButtonTextView.setVisibility(8);
                                }
                                int iDp = z ? AndroidUtilities.dp(36.0f) : 0;
                                for (int i4 = 0; i4 < ChatAttachAlert.this.botAttachLayouts.size(); i4++) {
                                    ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i4)).setMeasureOffsetY(iDp);
                                }
                                if (AnonymousClass1.this.botButtonAnimator == animator) {
                                    AnonymousClass1.this.botButtonAnimator = null;
                                }
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                if (!z) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(0.0f);
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(0);
                                    return;
                                }
                                ChatAttachAlert.this.botMainButtonTextView.setAlpha(0.0f);
                                ChatAttachAlert.this.botMainButtonTextView.setVisibility(0);
                                int iDp = AndroidUtilities.dp(36.0f);
                                for (int i4 = 0; i4 < ChatAttachAlert.this.botAttachLayouts.size(); i4++) {
                                    ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i4)).setMeasureOffsetY(iDp);
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

        @Override
        public void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
        }

        @Override
        public void onSharedTo(ArrayList arrayList) {
        }

        @Override
        public void onWebAppBackgroundChanged(boolean z, int i) {
        }

        @Override
        public void onWebAppExpand() {
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout && !chatAttachAlertBotWebViewLayout.swipeContainer.isSwipeInProgress()) {
                this.val$webViewLayout.scrollToTop();
            }
        }

        @Override
        public void onWebAppOpenInvoice(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            PaymentFormActivity paymentFormActivity = null;
            if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                AlertDialog alertDialog = new AlertDialog(ChatAttachAlert.this.getContext(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 150L);
                AlertsCreator$$ExternalSyntheticLambda257 alertsCreator$$ExternalSyntheticLambda257 = new AlertsCreator$$ExternalSyntheticLambda257(alertDialog, 1);
                StarsController.getInstance(ChatAttachAlert.this.currentAccount, false).openPaymentForm(alertsCreator$$ExternalSyntheticLambda257, null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new ScrimOptions$$ExternalSyntheticLambda8(2, this.val$webViewLayout, str));
                AndroidUtilities.hideKeyboard(this.val$webViewLayout);
                return;
            }
            if (tLObject instanceof TLRPC.PaymentForm) {
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                MessagesController.getInstance(chatAttachAlert.currentAccount).putUsers(paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(paymentForm, str, baseFragment);
            } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                paymentFormActivity = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject);
            }
            if (paymentFormActivity != null) {
                this.val$webViewLayout.scrollToTop();
                AndroidUtilities.hideKeyboard(this.val$webViewLayout);
                OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(baseFragment.getParentActivity(), ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
                overlayActionBarLayoutDialog.show();
                paymentFormActivity.setPaymentFormCallback(new AlertsCreator$$ExternalSyntheticLambda201(overlayActionBarLayoutDialog, this.val$webViewLayout, str, 1));
                paymentFormActivity.setResourcesProvider(((BottomSheet) ChatAttachAlert.this).resourcesProvider);
                overlayActionBarLayoutDialog.addFragment(paymentFormActivity);
            }
        }

        @Override
        public void onWebAppReady() {
        }

        @Override
        public void onWebAppSetActionBarColor(int i, final int i2, boolean z) {
            final int color = ChatAttachAlert.this.iBlur3SourceColor.paint.getColor();
            final BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating = new BotWebViewMenuContainer$ActionBarColorsAnimating();
            botWebViewMenuContainer$ActionBarColorsAnimating.updateColors(botWebViewMenuContainer$ActionBarColorsAnimating.fromColors, ChatAttachAlert.this.overrideBackgroundColor ? color : 0, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            ChatAttachAlert.this.overrideBackgroundColor = z;
            botWebViewMenuContainer$ActionBarColorsAnimating.updateColors(botWebViewMenuContainer$ActionBarColorsAnimating.toColors, ChatAttachAlert.this.overrideBackgroundColor ? i2 : 0, ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating2 = botWebViewMenuContainer$ActionBarColorsAnimating;
                    this.f$0.lambda$onWebAppSetActionBarColor$1(color, i2, chatAttachAlertBotWebViewLayout, botWebViewMenuContainer$ActionBarColorsAnimating2, valueAnimator);
                }
            });
            duration.start();
        }

        @Override
        public void onWebAppSetBackgroundColor(int i) {
            this.val$webViewLayout.setCustomBackground(i);
        }

        @Override
        public void onWebAppSetNavigationBarColor(int i) {
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
        public void onWebAppSwitchInlineQuery(TLRPC.User user, String str, List<String> list) {
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
            OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(ChatAttachAlert.this.getContext(), ((BottomSheet) ChatAttachAlert.this).resourcesProvider);
            dialogsActivity.setDelegate(new AudioPlayerAlert$$ExternalSyntheticLambda2(1, this, user, str, overlayActionBarLayoutDialog));
            overlayActionBarLayoutDialog.show();
            overlayActionBarLayoutDialog.addFragment(dialogsActivity);
        }
    }

    public class AnonymousClass11 extends PhotoViewer.EmptyPhotoViewerProvider {
        final MediaController.PhotoEntry val$entry;

        public AnonymousClass11(MediaController.PhotoEntry photoEntry) {
            this.val$entry = photoEntry;
        }

        public void lambda$sendButtonPressed$0(MediaController.PhotoEntry photoEntry, boolean z, int i, boolean z2, Long l) {
            ChatAttachAlertPhotoLayout.selectedPhotosOrder.clear();
            ChatAttachAlertPhotoLayout.selectedPhotos.clear();
            ChatAttachAlertPhotoLayout.selectedPhotosOrder.add(0);
            ChatAttachAlertPhotoLayout.selectedPhotos.put(0, photoEntry);
            ChatAttachAlert.this.delegate.didPressedButton(7, true, z, i, 0, 0L, isCaptionAbove(), z2, l.longValue());
        }

        @Override
        public boolean allowCaption() {
            return false;
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
                    ChatAttachAlert.AnonymousClass11 anonymousClass11 = this.f$0;
                    boolean z3 = z;
                    int i5 = i2;
                    anonymousClass11.lambda$sendButtonPressed$0(photoEntry, z3, i5, z2, (Long) obj);
                }
            });
        }
    }

    public class AnonymousClass17 extends FrameLayout {
        public AnonymousClass17(Context context) {
            super(context);
        }

        public void lambda$onDraw$0(ValueAnimator valueAnimator) {
            ChatAttachAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.captionContainer.invalidate();
            ChatAttachAlert.this.frameLayout2.invalidate();
            invalidate();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i = 2;
            if (ChatAttachAlert.this.captionContainer.getAlpha() <= 0.0f || ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop == 0.0f || ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop == ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop + ChatAttachAlert.this.frameLayout2.getTop()) {
                return;
            }
            if (ChatAttachAlert.this.topBackgroundAnimator != null) {
                ChatAttachAlert.this.topBackgroundAnimator.cancel();
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.captionEditTextTopOffset = chatAttachAlert.chatActivityEnterViewAnimateFromTop - (ChatAttachAlert.this.captionEditTextTopOffset + ChatAttachAlert.this.frameLayout2.getTop());
            ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
            chatAttachAlert2.topBackgroundAnimator = ValueAnimator.ofFloat(chatAttachAlert2.captionEditTextTopOffset, 0.0f);
            ChatAttachAlert.this.topBackgroundAnimator.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, i));
            ChatAttachAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ChatAttachAlert.this.topBackgroundAnimator.setDuration(200L);
            ChatAttachAlert.this.topBackgroundAnimator.start();
            ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }
    }

    public class AnonymousClass19 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        public AnonymousClass19(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, z, resourcesProvider);
        }

        public void lambda$dispatchDraw$0(EditTextCaption editTextCaption, ValueAnimator valueAnimator) {
            editTextCaption.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ChatAttachAlert.this.updateCommentTextViewPosition();
            if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout) {
                ChatAttachAlert.this.photoLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            }
        }

        @Override
        public void bottomPanelTranslationY(float f) {
            ChatAttachAlert.this.bottomPannelTranslation = f;
            ChatAttachAlert.this.frameLayout2.setTranslationY(f);
            ChatAttachAlert.this.frameLayout2.invalidate();
            ChatAttachAlert.this.checkUi_writeButtonContainerY();
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, true, 0);
        }

        @Override
        public void closeParent() {
            ChatAttachAlert.super.lambda$showGiftOfferSheet$15();
        }

        @Override
        public void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                emojiView.shouldLightenBackground = false;
                emojiView.fixBottomTabContainerTranslation = false;
                emojiView.setShouldDrawBackground(false);
                emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            int i = 0;
            if (this.shouldAnimateEditTextWithBounds) {
                EditTextCaption editText = ChatAttachAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawScrollY - editText.getScrollY()) + (this.messageEditTextPredrawHeigth - editText.getMeasuredHeight())));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlert$19$$ExternalSyntheticLambda0(i, this, editText));
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

        @Override
        public void extendActionMode(ActionMode actionMode, Menu menu) {
            BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) baseFragment).getCurrentEncryptedChat(), true, true);
            }
            super.extendActionMode(actionMode, menu);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ChatAttachAlert.this.enterCommentEventSent) {
                if (motionEvent.getX() <= ChatAttachAlert.this.commentTextView.getEditText().getLeft() || motionEvent.getX() >= ChatAttachAlert.this.commentTextView.getEditText().getRight() || motionEvent.getY() <= ChatAttachAlert.this.commentTextView.getEditText().getTop() || motionEvent.getY() >= ChatAttachAlert.this.commentTextView.getEditText().getBottom()) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.makeFocusable(chatAttachAlert.commentTextView.getEditText(), false);
                } else {
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.makeFocusable(chatAttachAlert2.commentTextView.getEditText(), true);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ChatAttachAlert.this.updateCommentTextViewPosition();
        }

        @Override
        public void onLineCountChanged(int i, int i2) {
            boolean z = false;
            if (TextUtils.isEmpty(getEditText().getText())) {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            } else {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!chatAttachAlert.captionAbove) {
                if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                    z = true;
                }
                chatAttachAlert.showAiButton(z);
            }
            ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
            chatAttachAlert2.chatActivityEnterViewAnimateFromTop = ChatAttachAlert.this.captionEditTextTopOffset + chatAttachAlert2.frameLayout2.getTop();
            ChatAttachAlert.this.frameLayout2.invalidate();
            ChatAttachAlert.this.updateCommentTextViewPosition();
        }
    }

    public class AnonymousClass27 extends AnimatorListenerAdapter {
        final Runnable val$onEnd;
        final int val$t;

        public AnonymousClass27(int i, Runnable runnable) {
            this.val$t = i;
            this.val$onEnd = runnable;
        }

        public void lambda$onAnimationEnd$0(DynamicAnimation dynamicAnimation, float f, float f2) {
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

        public void lambda$onAnimationEnd$1(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            ChatAttachAlert.this.nextAttachLayout.setTranslationY(0.0f);
            ChatAttachAlert.this.nextAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            runnable.run();
            ChatAttachAlert.this.updateSelectedPosition(0);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ChatAttachAlert.this.currentAttachLayout.setAlpha(0.0f);
            ChatAttachAlert.this.currentAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) + this.val$t);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.ATTACH_ALERT_LAYOUT_TRANSLATION.set(chatAttachAlert.currentAttachLayout, Float.valueOf(1.0f));
            ChatAttachAlert.this.actionBar.setAlpha(0.0f);
            SpringAnimation springAnimation = new SpringAnimation(ChatAttachAlert.this.nextAttachLayout, DynamicAnimation.TRANSLATION_Y, 0.0f);
            springAnimation.mSpring.setDampingRatio(0.75f);
            springAnimation.mSpring.setStiffness(500.0f);
            springAnimation.addUpdateListener(new Bulletin$$ExternalSyntheticLambda2(this, 2));
            springAnimation.addEndListener(new PasscodeView$$ExternalSyntheticLambda12(1, this, this.val$onEnd));
            ChatAttachAlert.this.viewChangeAnimator = springAnimation;
            springAnimation.start();
        }
    }

    public class AnonymousClass5 extends SizeNotifierFrameLayout {
        AdjustPanLayoutHelper adjustPanLayoutHelper;
        private Bulletin.Delegate bulletinDelegate;
        private boolean ignoreLayout;
        private float initialTranslationY;
        private int lastNotifyWidth;
        private RectF rect;

        public AnonymousClass5(Context context) {
            super(context);
            this.bulletinDelegate = new Bulletin.Delegate() {
                @Override
                public final boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public final boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public final boolean clipWithGradient(int i) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
                }

                @Override
                public int getBottomOffset(int i) {
                    return AndroidUtilities.dp(52.0f) + (AnonymousClass5.this.getHeight() - ChatAttachAlert.this.frameLayout2.getTop());
                }

                @Override
                public final int getLeftPadding() {
                    return Bulletin.Delegate.CC.$default$getLeftPadding(this);
                }

                @Override
                public final int getRightPadding() {
                    return Bulletin.Delegate.CC.$default$getRightPadding(this);
                }

                @Override
                public final int getTopOffset(int i) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
                }

                @Override
                public final void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public final void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public final void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }
            };
            this.rect = new RectF();
            this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
                {
                    boolean z = AdjustPanLayoutHelper.USE_ANDROID11_INSET_ANIMATOR;
                }

                @Override
                public boolean heightAnimationEnabled() {
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

                @Override
                public void onPanTranslationUpdate(float f, float f2, boolean z) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.currentPanTranslationY = f;
                    if (chatAttachAlert.fromScrollY > 0.0f) {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.currentPanTranslationY = DiffUtil.m(1.0f, f2, chatAttachAlert2.fromScrollY - ChatAttachAlert.this.toScrollY, chatAttachAlert2.currentPanTranslationY);
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
                public void onTransitionEnd() {
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
                public void onTransitionStart(boolean z, int i) {
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
            };
        }

        private void drawChildBackground(Canvas canvas, View view) {
            float f;
            int iDp;
            float f2;
            float fMax;
            float f3;
            float f4;
            int themedColor;
            float alpha;
            float f5;
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
                    scrollOffsetY = (int) (view.getTranslationY() + scrollOffsetY);
                }
                int iDp3 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                getMeasuredHeight();
                AndroidUtilities.dp(45.0f);
                int unused = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                int currentActionBarHeight = iNeedsActionBar != 0 ? ActionBar.getCurrentActionBarHeight() : ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
                if (iNeedsActionBar == 2) {
                    fMax = scrollOffsetY < currentActionBarHeight ? Math.max(0.0f, 1.0f - ((currentActionBarHeight - scrollOffsetY) / ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop)) : 1.0f;
                    f = 0.0f;
                } else {
                    float f6 = alpha4;
                    f = 0.0f;
                    if (attachAlertLayout == ChatAttachAlert.this.locationLayout) {
                        iDp = AndroidUtilities.dp(11.0f);
                    } else if (attachAlertLayout == ChatAttachAlert.this.pollLayout || attachAlertLayout == ChatAttachAlert.this.todoLayout) {
                        int iDp4 = AndroidUtilities.dp(3.0f);
                        f2 = f6 - iDp4;
                        float alpha5 = ChatAttachAlert.this.actionBar.getAlpha();
                        int i = (int) (((currentActionBarHeight - f2) + AndroidUtilities.statusBarHeight) * alpha5);
                        scrollOffsetY -= i;
                        iDp3 -= i;
                        fMax = 1.0f - alpha5;
                    } else {
                        iDp = AndroidUtilities.dp(4.0f);
                    }
                    f2 = f6 + iDp;
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
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setBounds(0, scrollOffsetY, getMeasuredWidth(), ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + AndroidUtilities.dp(45.0f) + getMeasuredHeight());
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.draw(canvas);
                if (iNeedsActionBar == 2) {
                    Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    f4 = 24.0f;
                    f3 = 1.0f;
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY);
                } else {
                    f3 = 1.0f;
                    f4 = 24.0f;
                }
                if ((fMax != f3 && iNeedsActionBar != 2) || ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                    Paint paint = Theme.dialogs_onlineCirclePaint;
                    if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                        customBackground = ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground();
                    }
                    paint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(f4) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY);
                }
                if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                    Theme.dialogs_onlineCirclePaint.setColor(ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground());
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    int scrollOffsetY2 = ChatAttachAlert.this.getScrollOffsetY(0);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    if (!chatAttachAlert2.inBubbleMode) {
                        scrollOffsetY2 += AndroidUtilities.statusBarHeight;
                    }
                    this.rect.set(((BottomSheet) chatAttachAlert2).backgroundPaddingLeft, (AndroidUtilities.dp(12.0f) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY) * fMax, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + scrollOffsetY2);
                    canvas.save();
                    canvas.drawRect(this.rect, Theme.dialogs_onlineCirclePaint);
                    canvas.restore();
                }
                FrameLayout frameLayout3 = ChatAttachAlert.this.headerView;
                if ((frameLayout3 == null || frameLayout3.getAlpha() != f3) && fMax != f) {
                    int iDp5 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - iDp5) / 2, iDp3, (getMeasuredWidth() + iDp5) / 2, AndroidUtilities.dp(4.0f) + iDp3);
                    if (iNeedsActionBar == 2) {
                        themedColor = 536870912;
                        f5 = fMax;
                    } else if (ChatAttachAlert.this.currentAttachLayout.hasCustomActionBarBackground()) {
                        int customActionBarBackground = ChatAttachAlert.this.currentAttachLayout.getCustomActionBarBackground();
                        themedColor = ColorUtils.blendARGB(0.5f, customActionBarBackground, ColorUtils.calculateLuminance(customActionBarBackground) < 0.5d ? -1 : -16777216);
                        FrameLayout frameLayout4 = ChatAttachAlert.this.headerView;
                        if (frameLayout4 == null) {
                            f5 = 1.0f;
                        } else {
                            alpha = frameLayout4.getAlpha();
                            f5 = f3 - alpha;
                        }
                    } else {
                        themedColor = ChatAttachAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
                        FrameLayout frameLayout5 = ChatAttachAlert.this.headerView;
                        if (frameLayout5 == null) {
                            f5 = 1.0f;
                        } else {
                            alpha = frameLayout5.getAlpha();
                            f5 = f3 - alpha;
                        }
                    }
                    int iAlpha = Color.alpha(themedColor);
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (view.getAlpha() * iAlpha * f5 * fMax));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                canvas.restore();
            }
        }

        private int getCurrentTop() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            int i = chatAttachAlert.scrollOffsetY[0] - (((BottomSheet) chatAttachAlert).backgroundPaddingTop * 2);
            int iDp = AndroidUtilities.dp(13.0f);
            FrameLayout frameLayout = ChatAttachAlert.this.headerView;
            int iDp2 = i - (iDp + (frameLayout != null ? AndroidUtilities.dp(frameLayout.getAlpha() * 26.0f) : 0));
            FrameLayout frameLayout2 = ChatAttachAlert.this.topCommentContainer;
            int iDp3 = AndroidUtilities.dp(20.0f) + (iDp2 - ((int) (frameLayout2 != null ? frameLayout2.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f)));
            return !ChatAttachAlert.this.inBubbleMode ? iDp3 + AndroidUtilities.statusBarHeight : iDp3;
        }

        private int getRootBottomInset(int i) {
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this);
            if (rootWindowInsets != null) {
                return rootWindowInsets.mImpl.getInsets(i).bottom;
            }
            return 0;
        }

        private int getRootKeyboardHeight() {
            return getRootBottomInset(8);
        }

        private float getY(View view) {
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
                scrollOffsetY = (int) (view.getTranslationY() + scrollOffsetY);
            }
            int iDp3 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
            int currentActionBarHeight = iNeedsActionBar != 0 ? ActionBar.getCurrentActionBarHeight() : ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
            if (iNeedsActionBar != 2 && ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY < currentActionBarHeight) {
                float f2 = alpha2;
                if (attachAlertLayout == ChatAttachAlert.this.locationLayout) {
                    iDp = AndroidUtilities.dp(11.0f);
                } else if (attachAlertLayout == ChatAttachAlert.this.pollLayout || attachAlertLayout == ChatAttachAlert.this.todoLayout) {
                    int iDp4 = AndroidUtilities.dp(3.0f);
                    f = f2 - iDp4;
                    iDp3 -= (int) (ChatAttachAlert.this.actionBar.getAlpha() * ((currentActionBarHeight - f) + AndroidUtilities.statusBarHeight));
                } else {
                    iDp = AndroidUtilities.dp(4.0f);
                }
                f = f2 + iDp;
                iDp3 -= (int) (ChatAttachAlert.this.actionBar.getAlpha() * ((currentActionBarHeight - f) + AndroidUtilities.statusBarHeight));
            }
            if (!ChatAttachAlert.this.inBubbleMode) {
                iDp3 += AndroidUtilities.statusBarHeight;
            }
            return iDp3;
        }

        public void lambda$onMeasure$0() {
            ChatAttachAlert.this.buttonsAdapter.notifyDataSetChanged();
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
                if (!((BottomSheet) ChatAttachAlert.this).keyboardVisible) {
                    emojiPadding = ChatAttachAlert.this.getEmojiPadding();
                } else if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout && ChatAttachAlert.this.pollLayout.emojiView != null && ChatAttachAlert.this.pollLayout.isEmojiSearchOpened) {
                    emojiPadding = AndroidUtilities.dp(120.0f);
                } else {
                    emojiPadding = (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout && ChatAttachAlert.this.todoLayout.emojiView != null && ChatAttachAlert.this.todoLayout.isEmojiSearchOpened) ? AndroidUtilities.dp(120.0f) : 0;
                }
                int rootBottomInset = getRootBottomInset(8);
                Math.max(getRootBottomInset(527), emojiPadding);
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
                        ChatAttachAlert.this.nextAttachLayout.listPaddingBottom = AndroidUtilities.dp(62.0f) + iMax;
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
                    if ((editTextEmoji2 == null || !editTextEmoji2.isPopupView(childAt)) && (((editTextEmoji = ChatAttachAlert.this.topCommentTextView) == null || !editTextEmoji.isPopupView(childAt)) && ((ChatAttachAlert.this.pollLayout == null || childAt != ChatAttachAlert.this.pollLayout.emojiView) && (ChatAttachAlert.this.todoLayout == null || childAt != ChatAttachAlert.this.todoLayout.emojiView)))) {
                        measureChildWithMargins(childAt, i3, 0, i4, i7 + i8);
                    } else if (ChatAttachAlert.this.inBubbleMode) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size2, 1073741824));
                    } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                }
                i6++;
                i = i3;
                i2 = i4;
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (Build.VERSION.SDK_INT >= 31 && ChatAttachAlert.this.scrollableViewNoiseSuppressor != null) {
                ChatAttachAlert.this.blur3_InvalidateBlur();
                if (ChatAttachAlert.this.iBlur3SourceGlassFrosted != null) {
                    ChatAttachAlert.this.iBlur3SourceGlassFrosted.setSize(((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredHeight());
                    ChatAttachAlert.this.iBlur3SourceGlassFrosted.renderNodeWithHash.updateDisplayListIfNeeded();
                }
                if (ChatAttachAlert.this.iBlur3SourceGlass != null) {
                    ChatAttachAlert.this.iBlur3SourceGlass.setSize(((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ChatAttachAlert.this).containerView.getMeasuredHeight());
                    ChatAttachAlert.this.iBlur3SourceGlass.renderNodeWithHash.updateDisplayListIfNeeded();
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
        public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
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
            if (!(view instanceof AttachAlertLayout) || view.getAlpha() <= 0.0f) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                ActionBar actionBar = chatAttachAlert.actionBar;
                if (view == actionBar) {
                    float alpha2 = actionBar.getAlpha();
                    if (alpha2 <= 0.0f) {
                        return false;
                    }
                    if (alpha2 >= 1.0f) {
                        return super.drawChild(canvas, view, j);
                    }
                    canvas.save();
                    canvas.clipRect(ChatAttachAlert.this.actionBar.getX(), getY(ChatAttachAlert.this.currentAttachLayout), ChatAttachAlert.this.actionBar.getX() + ChatAttachAlert.this.actionBar.getWidth(), ChatAttachAlert.this.actionBar.getY() + ChatAttachAlert.this.actionBar.getHeight());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild2;
                }
                if (!(view instanceof EmojiView) || chatAttachAlert.emojiViewChildBg == null) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                ChatAttachAlert.this.emojiViewChildBg.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(ChatAttachAlert.this.emojiViewChildBg.boundProps.path);
                ChatAttachAlert.this.emojiViewChildBg.draw(canvas);
                boolean zDrawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild3;
            }
            canvas.save();
            canvas.translate(0.0f, ChatAttachAlert.this.currentPanTranslationY);
            int alpha3 = (int) (view.getAlpha() * 255.0f);
            AttachAlertLayout attachAlertLayout = (AttachAlertLayout) view;
            int iNeedsActionBar = attachAlertLayout.needsActionBar();
            int iDp2 = AndroidUtilities.dp(13.0f);
            FrameLayout frameLayout3 = ChatAttachAlert.this.headerView;
            int iDp3 = iDp2 + (frameLayout3 != null ? AndroidUtilities.dp(frameLayout3.getAlpha() * 26.0f) : 0);
            FrameLayout frameLayout4 = ChatAttachAlert.this.topCommentContainer;
            int alpha4 = iDp3 + ((int) (frameLayout4 != null ? frameLayout4.getAlpha() * ChatAttachAlert.this.topCommentContainer.getMeasuredHeight() : 0.0f));
            ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
            int scrollOffsetY = (chatAttachAlert2.getScrollOffsetY(attachAlertLayout == chatAttachAlert2.currentAttachLayout ? 0 : 1) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) - alpha4;
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1 || ChatAttachAlert.this.viewChangeAnimator != null) {
                scrollOffsetY = (int) (view.getTranslationY() + scrollOffsetY);
            }
            int iDp4 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
            int iDp5 = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            int currentActionBarHeight = iNeedsActionBar != 0 ? ActionBar.getCurrentActionBarHeight() : ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop;
            if (iNeedsActionBar != 2) {
                f = 0.0f;
                if (((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY < currentActionBarHeight) {
                    float f5 = alpha4;
                    if (attachAlertLayout == ChatAttachAlert.this.locationLayout) {
                        iDp = AndroidUtilities.dp(11.0f);
                    } else if (attachAlertLayout == ChatAttachAlert.this.pollLayout || attachAlertLayout == ChatAttachAlert.this.todoLayout) {
                        int iDp6 = AndroidUtilities.dp(3.0f);
                        f2 = f5 - iDp6;
                        float fMin = Math.min(1.0f, ((currentActionBarHeight - scrollOffsetY) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) / f2);
                        int i = (int) ((currentActionBarHeight - f2) * fMin);
                        scrollOffsetY -= i;
                        iDp4 -= i;
                        iDp5 += i;
                        fMax = 1.0f - fMin;
                    } else {
                        iDp = AndroidUtilities.dp(4.0f);
                    }
                    f2 = f5 + iDp;
                    float fMin2 = Math.min(1.0f, ((currentActionBarHeight - scrollOffsetY) - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop) / f2);
                    int i2 = (int) ((currentActionBarHeight - f2) * fMin2);
                    scrollOffsetY -= i2;
                    iDp4 -= i2;
                    iDp5 += i2;
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
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
            if (!chatAttachAlert3.inBubbleMode) {
                int i3 = AndroidUtilities.statusBarHeight;
                scrollOffsetY += i3;
                iDp4 += i3;
                iDp5 -= i3;
            }
            int customBackground = chatAttachAlert3.currentAttachLayout.hasCustomBackground() ? ChatAttachAlert.this.currentAttachLayout.getCustomBackground() : ChatAttachAlert.this.getActionBarDrawableColor();
            boolean z = (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout || ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.photoPreviewLayout || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout && ChatAttachAlert.this.nextAttachLayout == null)) ? false : true;
            if (z) {
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setAlpha(alpha3);
                f3 = 1.0f;
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.setBounds(0, scrollOffsetY, getMeasuredWidth(), iDp5);
                ((BottomSheet) ChatAttachAlert.this).shadowDrawable.draw(canvas);
                if (iNeedsActionBar == 2) {
                    Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha3);
                    f4 = 24.0f;
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY);
                }
                if (view != ChatAttachAlert.this.contactsLayout || view == ChatAttachAlert.this.quickRepliesLayout || view == ChatAttachAlert.this.audioLayout) {
                    zDrawChild = super.drawChild(canvas, view, j);
                } else {
                    canvas.save();
                    zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                }
                if (z) {
                    if (fMax != f3 && iNeedsActionBar != 2) {
                        Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                        Theme.dialogs_onlineCirclePaint.setAlpha(alpha3);
                        this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(f4) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY);
                    }
                    frameLayout = ChatAttachAlert.this.headerView;
                    if ((frameLayout != null || frameLayout.getAlpha() != f3) && fMax != f) {
                        int iDp7 = AndroidUtilities.dp(36.0f);
                        this.rect.set((getMeasuredWidth() - iDp7) / 2, iDp4, (getMeasuredWidth() + iDp7) / 2, AndroidUtilities.dp(4.0f) + iDp4);
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
                        Theme.dialogs_onlineCirclePaint.setAlpha((int) (view.getAlpha() * iAlpha * alpha * fMax));
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    }
                }
                canvas.restore();
                return zDrawChild;
            }
            f3 = 1.0f;
            f4 = 24.0f;
            if (view != ChatAttachAlert.this.contactsLayout) {
                zDrawChild = super.drawChild(canvas, view, j);
            } else {
                zDrawChild = super.drawChild(canvas, view, j);
            }
            if (z) {
                if (fMax != f3) {
                    Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha3);
                    this.rect.set(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(f4) + ((BottomSheet) ChatAttachAlert.this).backgroundPaddingTop + scrollOffsetY);
                }
                frameLayout = ChatAttachAlert.this.headerView;
                if (frameLayout != null) {
                    int iDp8 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - iDp8) / 2, iDp4, (getMeasuredWidth() + iDp8) / 2, AndroidUtilities.dp(4.0f) + iDp4);
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
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (view.getAlpha() * iAlpha2 * alpha * fMax));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                } else {
                    int iDp9 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - iDp9) / 2, iDp4, (getMeasuredWidth() + iDp9) / 2, AndroidUtilities.dp(4.0f) + iDp4);
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
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (view.getAlpha() * iAlpha3 * alpha * fMax));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
            }
            canvas.restore();
            return zDrawChild;
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.adjustPanLayoutHelper.setResizableView(this);
            this.adjustPanLayoutHelper.onAttach();
            ChatAttachAlert.this.commentTextView.setAdjustPanLayoutHelper(this.adjustPanLayoutHelper);
            ChatAttachAlert.this.topCommentTextView.setAdjustPanLayoutHelper(this.adjustPanLayoutHelper);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.adjustPanLayoutHelper.onDetach();
        }

        @Override
        public void onDraw(Canvas canvas) {
            boolean z = ChatAttachAlert.this.inBubbleMode;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            if (motionEvent.getAction() != 0 || ChatAttachAlert.this.scrollOffsetY[0] == 0 || motionEvent.getY() >= getCurrentTop() || ChatAttachAlert.this.actionBar.getAlpha() != 0.0f) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            ChatAttachAlert.this.onDismissWithTouchOutside();
            return true;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
                    if (ChatAttachAlert.this.todoLayout == null || ChatAttachAlert.this.currentAttachLayout != ChatAttachAlert.this.todoLayout || ChatAttachAlert.this.todoLayout.emojiView == null) {
                        if (rootKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                            emojiPadding = 0;
                        } else {
                            emojiPadding = ChatAttachAlert.this.getCommentView().getEmojiPadding();
                        }
                    } else if (rootKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                        emojiPadding = 0;
                    } else {
                        emojiPadding = ChatAttachAlert.this.todoLayout.getEmojiPadding();
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
                    if (i15 != 1) {
                        if (i15 != 5) {
                            paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                        } else {
                            paddingRight = ((i10 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                            i5 = ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft;
                        }
                        if (i14 != 16) {
                            if (i14 != 48) {
                                i8 = layoutParams.topMargin + i12;
                            } else if (i14 != 80) {
                                i8 = layoutParams.topMargin;
                            } else {
                                i6 = ((i4 - iMax2) - i2) - measuredHeight3;
                                i7 = layoutParams.bottomMargin;
                            }
                            chatAttachAlert = ChatAttachAlert.this;
                            if (childAt != chatAttachAlert.actionBar || childAt == chatAttachAlert.fadeView) {
                                i8 = 0;
                            }
                            editTextEmoji = ChatAttachAlert.this.commentTextView;
                            if (!(editTextEmoji == null && editTextEmoji.isPopupView(childAt)) && (((editTextEmoji2 = ChatAttachAlert.this.topCommentTextView) == null || !editTextEmoji2.isPopupView(childAt)) && ((ChatAttachAlert.this.pollLayout == null || childAt != ChatAttachAlert.this.pollLayout.emojiView) && (ChatAttachAlert.this.todoLayout == null || childAt != ChatAttachAlert.this.todoLayout.emojiView)))) {
                                chatAttachAlert2 = ChatAttachAlert.this;
                                if (childAt == chatAttachAlert2.mentionContainer) {
                                    if (chatAttachAlert2.captionAbove) {
                                        i9 = AndroidUtilities.statusBarHeight;
                                        iMax = ActionBar.getCurrentActionBarHeight();
                                        i8 = i9 + iMax;
                                    }
                                } else if (childAt == chatAttachAlert2.bottomFadeView) {
                                    i9 = i8 + AndroidUtilities.navigationBarHeight;
                                    iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                    i8 = i9 + iMax;
                                }
                            } else {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + rootKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                i8 = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, measuredHeight3 + i8);
                        } else {
                            i6 = ((((i4 - iMax2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i7 = layoutParams.bottomMargin;
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
                            if (childAt == chatAttachAlert2.mentionContainer) {
                                if (chatAttachAlert2.captionAbove) {
                                    i9 = AndroidUtilities.statusBarHeight;
                                    iMax = ActionBar.getCurrentActionBarHeight();
                                    i8 = i9 + iMax;
                                }
                            } else if (childAt == chatAttachAlert2.bottomFadeView) {
                                i9 = i8 + AndroidUtilities.navigationBarHeight;
                                iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                i8 = i9 + iMax;
                            }
                        } else {
                            chatAttachAlert2 = ChatAttachAlert.this;
                            if (childAt == chatAttachAlert2.mentionContainer) {
                                if (chatAttachAlert2.captionAbove) {
                                    i9 = AndroidUtilities.statusBarHeight;
                                    iMax = ActionBar.getCurrentActionBarHeight();
                                    i8 = i9 + iMax;
                                }
                            } else if (childAt == chatAttachAlert2.bottomFadeView) {
                                i9 = i8 + AndroidUtilities.navigationBarHeight;
                                iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                i8 = i9 + iMax;
                            }
                        }
                        childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, measuredHeight3 + i8);
                    } else {
                        paddingRight = ((i10 - measuredWidth) / 2) + layoutParams.leftMargin;
                        i5 = layoutParams.rightMargin;
                    }
                    paddingLeft = paddingRight - i5;
                    if (i14 != 16) {
                        if (i14 != 48) {
                            i8 = layoutParams.topMargin + i12;
                        } else if (i14 != 80) {
                            i8 = layoutParams.topMargin;
                        } else {
                            i6 = ((i4 - iMax2) - i2) - measuredHeight3;
                            i7 = layoutParams.bottomMargin;
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
                            if (childAt == chatAttachAlert2.mentionContainer) {
                                if (chatAttachAlert2.captionAbove) {
                                    i9 = AndroidUtilities.statusBarHeight;
                                    iMax = ActionBar.getCurrentActionBarHeight();
                                    i8 = i9 + iMax;
                                }
                            } else if (childAt == chatAttachAlert2.bottomFadeView) {
                                i9 = i8 + AndroidUtilities.navigationBarHeight;
                                iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                i8 = i9 + iMax;
                            }
                        } else {
                            chatAttachAlert2 = ChatAttachAlert.this;
                            if (childAt == chatAttachAlert2.mentionContainer) {
                                if (chatAttachAlert2.captionAbove) {
                                    i9 = AndroidUtilities.statusBarHeight;
                                    iMax = ActionBar.getCurrentActionBarHeight();
                                    i8 = i9 + iMax;
                                }
                            } else if (childAt == chatAttachAlert2.bottomFadeView) {
                                i9 = i8 + AndroidUtilities.navigationBarHeight;
                                iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                                i8 = i9 + iMax;
                            }
                        }
                        childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, measuredHeight3 + i8);
                    } else {
                        i6 = ((((i4 - iMax2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i7 = layoutParams.bottomMargin;
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
                        if (childAt == chatAttachAlert2.mentionContainer) {
                            if (chatAttachAlert2.captionAbove) {
                                i9 = AndroidUtilities.statusBarHeight;
                                iMax = ActionBar.getCurrentActionBarHeight();
                                i8 = i9 + iMax;
                            }
                        } else if (childAt == chatAttachAlert2.bottomFadeView) {
                            i9 = i8 + AndroidUtilities.navigationBarHeight;
                            iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
                            i8 = i9 + iMax;
                        }
                    } else {
                        chatAttachAlert2 = ChatAttachAlert.this;
                        if (childAt == chatAttachAlert2.mentionContainer) {
                            if (chatAttachAlert2.captionAbove) {
                                i9 = AndroidUtilities.statusBarHeight;
                                iMax = ActionBar.getCurrentActionBarHeight();
                                i8 = i9 + iMax;
                            }
                        } else if (childAt == chatAttachAlert2.bottomFadeView) {
                            i9 = i8 + AndroidUtilities.navigationBarHeight;
                            iMax = Math.max(rootKeyboardHeight, ChatAttachAlert.this.getEmojiPadding());
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
            fastScroll.topOffset = currentActionBarHeight + (chatAttachAlert6.captionAbove ? (int) (ChatAttachAlert.this.topCommentContainer.getAlpha() * chatAttachAlert6.topCommentContainer.getMeasuredHeight()) : 0);
            ChatAttachAlert.this.photoLayout.gridView.getFastScroll().invalidate();
        }

        @Override
        public void onMeasure(int i, int i2) {
            int size = getLayoutParams().height > 0 ? getLayoutParams().height : View.MeasureSpec.getSize(i2);
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
                AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 4));
            }
            this.ignoreLayout = false;
            onMeasureInternal(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
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
                ChatAttachAlert.this.emojiViewChildBg.setRadius$1(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), radius, i5);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            return !ChatAttachAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
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
                    frameLayout.setTranslationY(((f2 / this.initialTranslationY) * frameLayout.getMeasuredHeight()) + (-f2));
                }
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }
            super.setTranslationY(f2 - ChatAttachAlert.this.currentPanTranslationY);
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType != 1) {
                ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            }
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

        public AttachAlertLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            this.parentAlert = chatAttachAlert;
        }

        public void applyCaption(CharSequence charSequence) {
        }

        public boolean canDismissWithSwipe() {
            return false;
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

        public int getButtonsHideOffset() {
            return AndroidUtilities.dp(needsActionBar() != 0 ? 12.0f : 17.0f);
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

        public int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }

        public boolean hasCustomActionBarBackground() {
            return false;
        }

        public boolean hasCustomBackground() {
            return false;
        }

        public boolean hasDoneItem() {
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

        public boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onCustomMeasure(View view, int i, int i2) {
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

        public void onInit(boolean z, boolean z2, boolean z3) {
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
    }

    public class AttachBotButton extends AttachButtonBase {
        private TLRPC.TL_attachMenuBot attachMenuBot;
        private TLRPC.User currentUser;

        public AttachBotButton(Context context) {
            super(context);
            setWillNotDraw(false);
            setFocusable(true);
            setFocusableInTouchMode(true);
            Theme.ResourcesProvider resourcesProvider = ((BottomSheet) ChatAttachAlert.this).resourcesProvider;
            GlassTabView glassTabView = new GlassTabView(context);
            glassTabView.resourcesProvider = resourcesProvider;
            glassTabView.selfMeasure = true;
            TextView textView = glassTabView.textView;
            textView.setTextSize(1, 11.0f);
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            glassTabView.imageView.setVisibility(8);
            glassTabView.checkPlayAnimation(false);
            BackupImageView backupImageView = new BackupImageView(context);
            glassTabView.backupImageView = backupImageView;
            glassTabView.addView(backupImageView, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
            glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
            glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
            glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
            glassTabView.updateColors$2();
            this.glassTabView = glassTabView;
            glassTabView.getBackupImageView().imageReceiver.setDelegate(new AIEditorAlert$$ExternalSyntheticLambda20(3));
            addView(this.glassTabView, LayoutHelper.createFrame(-1, -1.0f));
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
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        public void setAttachBot(TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
            if (user == null || tL_attachMenuBot == null) {
                return;
            }
            GlassTabView glassTabView = this.glassTabView;
            int i = ChatAttachAlert.this.currentAccount;
            glassTabView.getClass();
            glassTabView.tabAnimation = null;
            glassTabView.tabAnimationBot = tL_attachMenuBot;
            glassTabView.lastIconAnimationRaw = 0;
            glassTabView.lastBotIconId = 0L;
            glassTabView.textView.setText(tL_attachMenuBot.short_name);
            glassTabView.backupImageView.setRoundRadius(0);
            glassTabView.backupImageView.setSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            glassTabView.backupImageView.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
            glassTabView.needUpdateBackupViewColor = true;
            glassTabView.checkPlayAnimation(false);
            glassTabView.updateColors$2();
            glassTabView.invalidate();
            this.currentUser = user;
            this.attachMenuBot = tL_attachMenuBot;
            this.glassTabView.setSelected(false, false);
            invalidate();
        }

        public void setUser(TLRPC.User user) {
            if (user == null) {
                return;
            }
            GlassTabView glassTabView = this.glassTabView;
            int i = ChatAttachAlert.this.currentAccount;
            glassTabView.tabAnimation = null;
            glassTabView.tabAnimationBot = null;
            glassTabView.lastIconAnimationRaw = 0;
            glassTabView.lastBotIconId = 0L;
            glassTabView.textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            if (glassTabView.avatarDrawable == null) {
                glassTabView.avatarDrawable = new AvatarDrawable();
            }
            glassTabView.avatarDrawable.setInfo(i, user);
            glassTabView.backupImageView.setForUserOrChat(user, glassTabView.avatarDrawable);
            glassTabView.backupImageView.setSize(-1, -1);
            glassTabView.backupImageView.setRoundRadius(AndroidUtilities.dp(11.33f));
            glassTabView.backupImageView.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            glassTabView.backupImageView.setColorFilter(null);
            glassTabView.needUpdateBackupViewColor = false;
            glassTabView.invalidate();
            this.currentUser = user;
            this.attachMenuBot = null;
            this.glassTabView.setSelected(false, false);
            invalidate();
        }

        public void updateCheckedState(boolean z) {
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
    }

    public class AttachButton extends AttachButtonBase {
        private int currentId;

        public AttachButton(Context context) {
            super(context);
            setWillNotDraw(false);
            setFocusable(true);
            Theme.ResourcesProvider resourcesProvider = ((BottomSheet) ChatAttachAlert.this).resourcesProvider;
            GlassTabView glassTabView = new GlassTabView(context);
            glassTabView.resourcesProvider = resourcesProvider;
            glassTabView.selfMeasure = true;
            TextView textView = glassTabView.textView;
            textView.setTextSize(1, 11.0f);
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            glassTabView.checkPlayAnimation(false);
            glassTabView.imageView.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
            glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
            glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
            glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
            glassTabView.updateColors$2();
            this.glassTabView = glassTabView;
            addView(glassTabView, LayoutHelper.createFrame(-1, -1.0f));
        }

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        public void setTextAndIcon(int i, CharSequence charSequence, GlassTabView.TabAnimation tabAnimation) {
            this.glassTabView.setText(charSequence);
            this.glassTabView.setTabAnimation(tabAnimation);
            this.currentId = i;
        }

        public void updateCheckedState(boolean z) {
            this.glassTabView.setSelected(((long) this.currentId) == ChatAttachAlert.this.selectedId, z);
        }
    }

    public static abstract class AttachButtonBase extends FrameLayout {
        protected GlassTabView glassTabView;

        public AttachButtonBase(Context context) {
            super(context);
        }
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

    public class ButtonsAdapter extends RecyclerListView.SelectionAdapter {
        private static final int VIEW_TYPE_BOT_BUTTON = 1;
        private static final int VIEW_TYPE_BUTTON = 0;
        private int attachBotsEndRow;
        private int attachBotsStartRow;
        private List<TLRPC.TL_attachMenuBot> attachMenuBots = new ArrayList();
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

        public ButtonsAdapter(Context context) {
            this.mContext = context;
        }

        public int getButtonsCount() {
            return this.buttonsCount;
        }

        @Override
        public int getItemCount() {
            int i = this.buttonsCount;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            return (chatAttachAlert.editingMessageObject == null && (chatAttachAlert.baseFragment instanceof ChatActivity) && !chatAttachAlert.isPollAttach) ? MediaDataController.getInstance(chatAttachAlert.currentAccount).inlineBots.size() + i : i;
        }

        @Override
        public int getItemViewType(int i) {
            if (i < this.buttonsCount) {
                return (i < this.attachBotsStartRow || i >= this.attachBotsEndRow) ? 0 : 1;
            }
            return 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
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
                } else if (chatAttachAlert.editingMessageObject == null) {
                    TLRPC.User currentUser = baseFragment != null ? ((ChatActivity) baseFragment).getCurrentUser() : null;
                    BaseFragment baseFragment2 = ChatAttachAlert.this.baseFragment;
                    TLRPC.Chat currentChat = baseFragment2 instanceof ChatActivity ? ((ChatActivity) baseFragment2).getCurrentChat() : null;
                    boolean z = currentUser != null && ((ChatActivity) ChatAttachAlert.this.baseFragment).getMessagesController().getSendPaidMessagesStars(currentUser.id) > 0;
                    int i8 = this.buttonsCount;
                    this.buttonsCount = i8 + 1;
                    this.galleryButton = i8;
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
                            int size2 = this.attachMenuBots.size() + this.buttonsCount;
                            this.buttonsCount = size2;
                            this.attachBotsEndRow = size2;
                        }
                    }
                    int i9 = this.buttonsCount;
                    this.buttonsCount = i9 + 1;
                    this.documentButton = i9;
                    if (ChatAttachAlert.this.plainTextEnabled) {
                        int i10 = this.buttonsCount;
                        this.buttonsCount = i10 + 1;
                        this.locationButton = i10;
                    }
                    if (ChatAttachAlert.this.plainTextEnabled && MessagesController.getInstance(ChatAttachAlert.this.currentAccount).richEditorAvailable()) {
                        int i11 = this.buttonsCount;
                        this.buttonsCount = i11 + 1;
                        this.richButton = i11;
                    }
                    if (ChatAttachAlert.this.pollsEnabled) {
                        int i12 = this.buttonsCount;
                        this.buttonsCount = i12 + 1;
                        this.pollButton = i12;
                    }
                    if (ChatAttachAlert.this.todoEnabled) {
                        int i13 = this.buttonsCount;
                        this.buttonsCount = i13 + 1;
                        this.todoButton = i13;
                    }
                    if (ChatAttachAlert.this.plainTextEnabled) {
                        int i14 = this.buttonsCount;
                        this.buttonsCount = i14 + 1;
                        this.contactButton = i14;
                    }
                    BaseFragment baseFragment4 = ChatAttachAlert.this.baseFragment;
                    if ((baseFragment4 instanceof ChatActivity) && ((ChatActivity) baseFragment4).getChatMode() == 0 && currentUser != null && !z && !currentUser.bot && !QuickRepliesController.getInstance(ChatAttachAlert.this.currentAccount).replies.isEmpty()) {
                        int i15 = this.buttonsCount;
                        this.buttonsCount = i15 + 1;
                        this.quickRepliesButton = i15;
                    }
                    int i16 = this.buttonsCount;
                    this.buttonsCount = i16 + 1;
                    this.musicButton = i16;
                } else if (chatAttachAlert.editType == -1) {
                    int i17 = this.buttonsCount;
                    this.galleryButton = i17;
                    this.documentButton = i17 + 1;
                    this.buttonsCount = i17 + 3;
                    this.musicButton = i17 + 2;
                } else {
                    if (ChatAttachAlert.this.editType == 0) {
                        int i18 = this.buttonsCount;
                        this.buttonsCount = i18 + 1;
                        this.galleryButton = i18;
                    }
                    if (ChatAttachAlert.this.editType == 1) {
                        int i19 = this.buttonsCount;
                        this.buttonsCount = i19 + 1;
                        this.documentButton = i19;
                    }
                    if (ChatAttachAlert.this.editType == 2) {
                        int i20 = this.buttonsCount;
                        this.buttonsCount = i20 + 1;
                        this.musicButton = i20;
                    }
                }
            }
            super.notifyDataSetChanged();
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
                attachBotButton.glassTabView.getClass();
                int i2 = this.attachBotsStartRow;
                if (i < i2 || i >= this.attachBotsEndRow) {
                    int i3 = i - this.buttonsCount;
                    attachBotButton.setTag(Integer.valueOf(i3));
                    attachBotButton.setUser(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).inlineBots.get(i3).peer.user_id)));
                    return;
                } else {
                    int i4 = i - i2;
                    attachBotButton.setTag(Integer.valueOf(i4));
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = this.attachMenuBots.get(i4);
                    attachBotButton.setAttachBot(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(tL_attachMenuBot.bot_id)), tL_attachMenuBot);
                    return;
                }
            }
            AttachButton attachButton = (AttachButton) viewHolder.itemView;
            attachButton.glassTabView.getClass();
            if (i == this.galleryButton) {
                attachButton.setTextAndIcon(1, LocaleController.getString(R.string.ChatGallery), GlassTabView.TabAnimation.GALLERY);
                attachButton.setTag(1);
                zCheckContactsPermission = ChatAttachAlert.checkPhotoAndCameraPermission(this.mContext);
            } else {
                if (i != this.documentButton) {
                    if (i == this.locationButton) {
                        attachButton.setTextAndIcon(6, LocaleController.getString(R.string.ChatLocation), GlassTabView.TabAnimation.LOCATION);
                        attachButton.setTag(6);
                    } else if (i == this.musicButton) {
                        attachButton.setTextAndIcon(3, LocaleController.getString(R.string.AttachMusic), GlassTabView.TabAnimation.MUSIC);
                        attachButton.setTag(3);
                        zCheckContactsPermission = ChatAttachAlert.checkMusicPermission(this.mContext);
                    } else {
                        if (i != this.pollButton) {
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
                        attachButton.setTextAndIcon(9, LocaleController.getString(R.string.Poll), GlassTabView.TabAnimation.POLL);
                        attachButton.setTag(9);
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
                attachButton.setTextAndIcon(4, LocaleController.getString(R.string.ChatDocument), GlassTabView.TabAnimation.FILES);
                attachButton.setTag(4);
                zCheckContactsPermission = ChatAttachAlert.checkPhotoAndDocumentsPermission(this.mContext);
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
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View attachBotButton = i != 0 ? ChatAttachAlert.this.new AttachBotButton(this.mContext) : ChatAttachAlert.this.new AttachButton(this.mContext);
            attachBotButton.setImportantForAccessibility(1);
            attachBotButton.setFocusable(true);
            attachBotButton.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            return new RecyclerListView.Holder(attachBotButton);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            ChatAttachAlert.this.applyAttachButtonColors(viewHolder.itemView);
        }
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
        public void onDraw(Canvas canvas) {
            this.gradientProtectionDrawable.setColor(Theme.multAlpha(0.5f, Theme.getColor(this.bgKeyColor, this.resourcesProvider)));
            this.gradientProtectionDrawable.draw(canvas);
            this.gradientProtectionDrawable2.setColor(Theme.multAlpha(0.95f, Theme.getColor(this.bgKeyColor, this.resourcesProvider)));
            this.gradientProtectionDrawable2.draw(canvas);
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            int i5 = AndroidUtilities.statusBarHeight;
            this.gradientProtectionDrawable.setInsets(AndroidUtilities.dp(12.0f) + i5, 0);
            this.gradientProtectionDrawable.setBounds(0, 0, i, AndroidUtilities.dp(52.0f) + i5);
            this.gradientProtectionDrawable2.setInsets(i5 / 3, 0);
            this.gradientProtectionDrawable2.setBounds(0, 0, i, i5);
        }
    }

    public ChatAttachAlert(Context context, BaseFragment baseFragment, boolean z, boolean z2) {
        this(context, baseFragment, z, z2, true, null);
    }

    public void applyAttachButtonColors(View view) {
        if (view instanceof AttachButton) {
            return;
        }
        boolean z = view instanceof AttachBotButton;
    }

    private void checkColorSourceColor(int i) {
        if (this.iBlur3SourceColor.paint.getColor() != i) {
            this.iBlur3SourceColor.paint.setColor(i);
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

    public static boolean checkContactsPermission(Context context) {
        return Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") == 0;
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
            if ((attachAlertLayout != null && attachAlertLayout.getSelectedItemsCount() > 1) || (EphemeralMessagesHelper.getInstance(this.currentAccount).getEphemeralCommandBotId(string, chatActivity.botInfo) <= 0 && (chatActivity.getReplyMessage() == null || !chatActivity.getReplyMessage().isEphemeral()))) {
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

    public static boolean checkMusicPermission(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return ContextCompat.checkSelfPermission(context, i >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0;
        }
        return true;
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

    private void checkUi_attachButtonsVisibility() {
    }

    private void checkUi_bottomFade() {
        float f = this.animatorCaptionVisible.floatValue;
        this.bottomFadeView.setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f) * (1.0f - this.animatorActionBarVisible.floatValue))), 1.0f - ((1.0f - this.animatorCaptionAbove.floatValue) * f)));
    }

    private void checkUi_doneItemVisibility() {
        TextView textView = this.doneItem;
        if (textView != null) {
            float f = this.doneItemAlphaByEnabled * this.doneItemAlphaByLayout;
            textView.setAlpha(f);
            this.doneItem.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    public void checkUi_fadeTopAlpha() {
        int alpha;
        if (this.fadeView == null || this.actionBar == null) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        ChatActivityFadeView chatActivityFadeView = this.fadeView;
        if (this.actionBar.getVisibility() == 0) {
            alpha = (int) (this.actionBar.getAlpha() * (zIsDark ? 255 : 160));
        } else {
            alpha = 0;
        }
        chatActivityFadeView.setFadeTopAlpha(alpha);
    }

    public void checkUi_writeButtonContainerY() {
        FrameLayout frameLayout = this.topCommentContainer;
        if (frameLayout == null || frameLayout.getVisibility() != 0 || this.topCommentContainer.getAlpha() == 0.0f) {
            this.writeButtonContainer.setTranslationY(this.bottomPannelTranslation);
            this.writeButton.setAlpha(1.0f);
            return;
        }
        float f = this.animatorCaptionAbove.floatValue;
        float fAbs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f));
        this.writeButton.setAlpha(MediaController$$ExternalSyntheticOutline0.m(fAbs, fAbs, fAbs, fAbs));
        this.writeButtonContainer.setTranslationY(AndroidUtilities.lerp(this.bottomPannelTranslation, ((this.topCommentContainer.getTranslationY() + this.topCommentContainer.getTop()) - this.writeButtonContainer.getTop()) + AndroidUtilities.dp(8.0f), CubicBezierInterpolator.EASE_BOTH.getInterpolation(f)));
    }

    public void createMentionsContainer() {
        MentionsContainerView mentionsContainerView = new MentionsContainerView(getContext(), this.dialogId, 0L, LaunchActivity.getLastFragment(), this.resourcesProvider) {
            @Override
            public void onAnimationScroll() {
                if (ChatAttachAlert.this.photoLayout != null) {
                    ChatAttachAlert.this.photoLayout.checkCameraViewPosition();
                }
            }

            @Override
            public void onScrolled(boolean z, boolean z2) {
                if (ChatAttachAlert.this.photoLayout != null) {
                    ChatAttachAlert.this.photoLayout.checkCameraViewPosition();
                }
            }
        };
        this.mentionContainer = mentionsContainerView;
        mentionsContainerView.withDelegate(new MentionsContainerView.Delegate() {
            @Override
            public final void addEmojiToRecent(String str) {
                MentionsContainerView.Delegate.CC.$default$addEmojiToRecent(this, str);
            }

            @Override
            public Paint.FontMetricsInt getFontMetrics() {
                return ChatAttachAlert.this.commentTextView.getEditText().getPaint().getFontMetricsInt();
            }

            @Override
            public final void onStickerSelected(TLRPC.TL_document tL_document, String str, Object obj) {
                MentionsContainerView.Delegate.CC.$default$onStickerSelected(this, tL_document, str, obj);
            }

            @Override
            public void replaceText(int i, int i2, CharSequence charSequence, boolean z) {
                ChatAttachAlert.this.replaceWithText(i, i2, charSequence, z);
            }

            @Override
            public final void sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
                MentionsContainerView.Delegate.CC.$default$sendBotInlineResult(this, botInlineResult, z, i);
            }
        });
        ViewGroup viewGroup = this.containerView;
        viewGroup.addView(this.mentionContainer, viewGroup.indexOfChild(this.frameLayout2), LayoutHelper.createFrame(-1, -1, 83));
        setupMentionContainer(this.mentionContainer);
        updateCommentTextViewPosition();
    }

    public int getActionBarDrawableColor() {
        return getShadowDrawableColor(true);
    }

    public int getEmojiPadding() {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
        if (attachAlertLayout == chatAttachAlertPollLayout && chatAttachAlertPollLayout.emojiView != null) {
            return chatAttachAlertPollLayout.getEmojiPadding();
        }
        ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
        if (attachAlertLayout != chatAttachAlertPollLayout2 || chatAttachAlertPollLayout2.emojiView == null) {
            return this.captionAbove ? this.topCommentTextView.getEmojiPadding() : this.commentTextView.getEmojiPadding();
        }
        return chatAttachAlertPollLayout2.getEmojiPadding();
    }

    public int getScrollOffsetY(int i) {
        AttachAlertLayout attachAlertLayout = this.nextAttachLayout;
        if (attachAlertLayout == null || !((this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (attachAlertLayout instanceof ChatAttachAlertPhotoLayoutPreview))) {
            return this.scrollOffsetY[i];
        }
        int[] iArr = this.scrollOffsetY;
        return AndroidUtilities.lerp(iArr[0], iArr[1], this.translationProgress);
    }

    private int getShadowDrawableColor() {
        return getShadowDrawableColor(false);
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground)) > 0.699999988079071d;
    }

    public void lambda$dismiss$69(AlertDialog alertDialog, int i) {
        this.allowPassConfirmationAlert = true;
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$dismiss$70(DialogInterface dialogInterface) {
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        springAnimation2.mSpring.setDampingRatio(1.5f);
        this.appearSpringAnimation.mSpring.setStiffness(1500.0f);
        this.appearSpringAnimation.start();
    }

    public void lambda$dismiss$71(DialogInterface dialogInterface) {
        this.confirmationAlertShown = false;
    }

    public void lambda$dismiss$72(int i) {
        this.navBarColorKey = -1;
        this.navBarColor = i;
        this.containerView.invalidate();
    }

    public void lambda$init$65(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        ((ChatActivity) this.baseFragment).didSelectLocation(messageMedia, i, z, i2, 0L);
    }

    public void lambda$makeFocusable$62(EditTextBoldCursor editTextBoldCursor, boolean z) {
        setFocusable(true);
        editTextBoldCursor.requestFocus();
        if (z) {
            AndroidUtilities.runOnUIThread(new TagEditCell$$ExternalSyntheticLambda3(2, editTextBoldCursor));
        }
    }

    public void lambda$new$0(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        AttachAlertLayout attachAlertLayout;
        int i = 0;
        while (i < 2) {
            AttachAlertLayout attachAlertLayout2 = i == 0 ? this.currentAttachLayout : this.nextAttachLayout;
            if (attachAlertLayout2 == null || attachAlertLayout2.iBlur3Capture == null || attachAlertLayout2.getVisibility() != 0) {
                canvas2 = canvas;
                rectF2 = rectF;
            } else {
                canvas2 = canvas;
                rectF2 = rectF;
                Blur3Utils.captureRelativeParent(attachAlertLayout2.iBlur3Capture, canvas2, rectF2, attachAlertLayout2.iBlur3CaptureView, getContainerView(), (int) (((i == 0 && (attachAlertLayout = this.nextAttachLayout) != null && attachAlertLayout.getVisibility() == 0) ? (1.0f - this.nextAttachLayout.getAlpha()) * attachAlertLayout2.getAlpha() : attachAlertLayout2.getAlpha()) * 255.0f));
            }
            i++;
            canvas = canvas2;
            rectF = rectF2;
        }
    }

    public void lambda$new$1(int i) {
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    public void lambda$new$10(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i, long j) {
        ((ChatActivity) this.baseFragment).sendTodo((TLRPC.TL_messageMediaToDo) messageMedia, z, i, j);
    }

    public void lambda$new$11(AttachBotButton attachBotButton) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot = attachBotButton.attachMenuBot;
        attachBotButton.attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        showBotLayout(attachBotButton.attachMenuBot.bot_id, true);
        MediaDataController.getInstance(this.currentAccount).updateAttachMenuBotsInCache();
    }

    public void lambda$new$12(AttachBotButton attachBotButton, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda0(1, this, attachBotButton));
    }

    public void lambda$new$13(AttachBotButton attachBotButton, Boolean bool) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(attachBotButton.attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ShareAlert$$ExternalSyntheticLambda13(1, this, attachBotButton), 66);
    }

    public void lambda$new$14(Theme.ResourcesProvider resourcesProvider, View view, int i) {
        BaseFragment lastFragment = this.baseFragment;
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
                if (!this.photosEnabled && !this.videosEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!this.photosEnabled && !this.videosEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(1, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout;
                    showLayout(chatAttachRestrictedLayout);
                }
                showLayout(this.photoLayout);
            } else if (iIntValue == 3) {
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
            } else if (iIntValue == 4) {
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
            } else if (iIntValue == 5) {
                if (!this.plainTextEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && this.plainTextEnabled && getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                openContactsLayout();
            } else if (iIntValue == 6) {
                if ((!this.plainTextEnabled && checkCanRemoveRestrictionsByBoosts()) || !AndroidUtilities.isMapsInstalled(this.baseFragment)) {
                    return;
                }
                if (this.plainTextEnabled) {
                    if (this.locationLayout == null) {
                        AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), resourcesProvider, (this.isPollAttach || this.restrictEphemeralMessageTypes) ? false : true);
                        this.locationLayout = chatAttachAlertLocationLayout;
                        attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                        ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = this.locationActivityDelegate;
                        if (locationActivityDelegate != null) {
                            chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                        } else {
                            chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 1));
                        }
                    }
                    showLayout(this.locationLayout);
                } else {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout2 = new ChatAttachRestrictedLayout(6, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout2;
                    showLayout(chatAttachRestrictedLayout2);
                }
            } else if (iIntValue == 9) {
                if (!this.pollsEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (this.pollsEnabled) {
                    showPollLayout(true, null);
                } else {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout3 = new ChatAttachRestrictedLayout(9, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout3;
                    showLayout(chatAttachRestrictedLayout3);
                }
            } else if (iIntValue == 11) {
                openQuickRepliesLayout();
            } else if (iIntValue == 12) {
                if (!this.todoEnabled && checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (this.todoEnabled) {
                    if (this.todoLayout == null) {
                        AttachAlertLayout[] attachAlertLayoutArr2 = this.layouts;
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(this, getContext(), true, resourcesProvider, null);
                        this.todoLayout = chatAttachAlertPollLayout;
                        attachAlertLayoutArr2[1] = chatAttachAlertPollLayout;
                        chatAttachAlertPollLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 2));
                    }
                    showLayout(this.todoLayout);
                } else {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout4 = new ChatAttachRestrictedLayout(9, this, getContext(), resourcesProvider);
                    this.restrictedLayout = chatAttachRestrictedLayout4;
                    showLayout(chatAttachRestrictedLayout4);
                }
            } else if (iIntValue == 13) {
                if (this.stickersLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr3 = this.layouts;
                    ChatAttachAlertEmojiLayout chatAttachAlertEmojiLayout = new ChatAttachAlertEmojiLayout(this, getContext(), resourcesProvider, true);
                    this.stickersLayout = chatAttachAlertEmojiLayout;
                    attachAlertLayoutArr3[8] = chatAttachAlertEmojiLayout;
                    chatAttachAlertEmojiLayout.setDelegate(this.emojiViewDelegate);
                }
                showLayout(this.stickersLayout);
            } else if (iIntValue == 14) {
                if (this.emojiLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr4 = this.layouts;
                    ChatAttachAlertEmojiLayout chatAttachAlertEmojiLayout2 = new ChatAttachAlertEmojiLayout(this, getContext(), resourcesProvider, false);
                    this.emojiLayout = chatAttachAlertEmojiLayout2;
                    attachAlertLayoutArr4[9] = chatAttachAlertEmojiLayout2;
                    chatAttachAlertEmojiLayout2.setDelegate(this.emojiViewDelegate);
                }
                showLayout(this.emojiLayout);
            } else if (iIntValue == 16) {
                if (this.richLayout == null) {
                    AttachAlertLayout[] attachAlertLayoutArr5 = this.layouts;
                    ChatAttachAlertRichLayout chatAttachAlertRichLayout = new ChatAttachAlertRichLayout(this, getContext(), this.currentAccount, resourcesProvider);
                    this.richLayout = chatAttachAlertRichLayout;
                    attachAlertLayoutArr5[10] = chatAttachAlertRichLayout;
                }
                showLayout(this.richLayout);
            } else if (view.getTag() instanceof Integer) {
                this.delegate.didPressedButton(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, isCaptionAbove(), false, 0L);
            }
        } else if (view instanceof AttachBotButton) {
            AttachBotButton attachBotButton = (AttachBotButton) view;
            if (attachBotButton.attachMenuBot == null) {
                this.delegate.didSelectBot(attachBotButton.currentUser);
                lambda$showGiftOfferSheet$15();
            } else if (attachBotButton.attachMenuBot.inactive) {
                WebAppDisclaimerAlert.show(getContext(), new ChatAttachAlert$$ExternalSyntheticLambda15(0, this, attachBotButton), null, null);
            } else {
                showBotLayout(attachBotButton.attachMenuBot.bot_id, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int iDp = AndroidUtilities.dp(70.0f);
        int i4 = left - iDp;
        if (i4 < 0) {
            this.buttonsRecyclerView.smoothScrollBy(i4, 0);
            return;
        }
        int i5 = right + iDp;
        if (i5 > this.buttonsRecyclerView.getMeasuredWidth()) {
            RecyclerListView recyclerListView = this.buttonsRecyclerView;
            recyclerListView.smoothScrollBy(i5 - recyclerListView.getMeasuredWidth(), 0);
        }
    }

    public boolean lambda$new$15(View view, int i) {
        if (view instanceof AttachBotButton) {
            AttachBotButton attachBotButton = (AttachBotButton) view;
            if (!this.destroyed && attachBotButton.currentUser != null) {
                onLongClickBotButton(attachBotButton.attachMenuBot, attachBotButton.currentUser);
                return true;
            }
        }
        return false;
    }

    public void lambda$new$16(View view) {
        ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
        long j = this.selectedId;
        if (j >= 0 || (chatAttachAlertBotWebViewLayout = this.botAttachLayouts.get(-j)) == null) {
            return;
        }
        chatAttachAlertBotWebViewLayout.getWebViewContainer().onMainButtonPressed();
    }

    public void lambda$new$17(View view) {
        if (this.captionAbove) {
            return;
        }
        toggleCaptionAbove();
    }

    public static boolean lambda$new$18(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$new$19(CharSequence charSequence) {
        this.commentTextView.setText(charSequence);
        this.commentTextView.setSelection(charSequence.length(), charSequence.length());
    }

    public void lambda$new$2(View view) {
        this.selectedMenuItem.toggleSubMenu();
    }

    public void lambda$new$20(CharSequence charSequence, Integer num, Integer num2, Boolean bool) {
        this.commentTextView.setText(charSequence);
        this.commentTextView.setSelection(charSequence.length(), charSequence.length());
        onWriteButtonPressed();
    }

    public void lambda$new$21(Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.commentTextView == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
        new AIEditorAlert(getContext(), resourcesProvider).setText(this.commentTextView.getText()).setOnUse(new ChatAttachAlert$$ExternalSyntheticLambda2(this, 0)).setOnSend(this.dialogId, this.editingMessageObject != null, new ChatAttachAlert$$ExternalSyntheticLambda3(this, 0)).show();
    }

    public void lambda$new$22(View view) {
        if (this.captionAbove) {
            toggleCaptionAbove();
        }
    }

    public void lambda$new$23(CharSequence charSequence) {
        this.topCommentTextView.setText(charSequence);
        this.topCommentTextView.setSelection(charSequence.length(), charSequence.length());
    }

    public void lambda$new$24(CharSequence charSequence, Integer num, Integer num2, Boolean bool) {
        this.topCommentTextView.setText(charSequence);
        this.topCommentTextView.setSelection(charSequence.length(), charSequence.length());
        onWriteButtonPressed();
    }

    public void lambda$new$25(Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.topCommentTextView == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
        new AIEditorAlert(getContext(), resourcesProvider).setText(this.topCommentTextView.getText()).setOnUse(new ChatAttachAlert$$ExternalSyntheticLambda2(this, 1)).setOnSend(this.dialogId, this.editingMessageObject != null, new ChatAttachAlert$$ExternalSyntheticLambda3(this, 1)).show();
    }

    public void lambda$new$26(View view) {
        onWriteButtonPressed();
    }

    public void lambda$new$27(long j, boolean z, int i, int i2) {
        ChatAttachAlert chatAttachAlert;
        boolean zSendPressed;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            chatAttachAlert = this;
            zSendPressed = chatAttachAlert.sendPressed(z, i, i2, j, isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(z, i, i2, j, isCaptionAbove())) {
                this.allowPassConfirmationAlert = true;
                lambda$showGiftOfferSheet$15();
            }
            zSendPressed = false;
            chatAttachAlert = this;
        }
        MessageSendPreview messageSendPreview = chatAttachAlert.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(!zSendPressed);
            chatAttachAlert.messageSendPreview = null;
        }
    }

    public void lambda$new$28(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, View view) {
        AttachAlertLayout attachAlertLayout;
        ChatAttachAlert chatAttachAlert;
        boolean zSendPressed;
        MessageSendPreview messageSendPreview;
        MessageSendPreview messageSendPreview2 = this.messageSendPreview;
        long selectedEffect = messageSendPreview2 != null ? messageSendPreview2.getSelectedEffect() : 0L;
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        this.effectId = selectedEffect;
        sendButton.setEffect(selectedEffect);
        forceKeyboardOnDismiss();
        if (this.currentLimit - this.codepointCount < 0) {
            AndroidUtilities.shakeView(this.captionLimitView);
            AndroidUtilities.shakeView(this.topCaptionLimitView);
            try {
                this.writeButton.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium > this.codepointCount) {
                showCaptionLimitBulletin(baseFragment);
            }
            MessageSendPreview messageSendPreview3 = this.messageSendPreview;
            if (messageSendPreview3 != null) {
                messageSendPreview3.dismiss(false);
                this.messageSendPreview = null;
                return;
            }
            return;
        }
        if (this.editingMessageObject == null) {
            BaseFragment baseFragment2 = this.baseFragment;
            if ((baseFragment2 instanceof ChatActivity) && ((ChatActivity) baseFragment2).isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.baseFragment).getDialogId(), new VideoPlayer$$ExternalSyntheticLambda2(this, selectedEffect), resourcesProvider);
            } else {
                attachAlertLayout = this.currentAttachLayout;
                if (attachAlertLayout != this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
                    chatAttachAlert = this;
                    zSendPressed = chatAttachAlert.sendPressed(true, 0, 0, selectedEffect, isCaptionAbove());
                } else {
                    if (!attachAlertLayout.sendSelectedItems(true, 0, 0, selectedEffect, isCaptionAbove())) {
                        this.allowPassConfirmationAlert = true;
                        lambda$showGiftOfferSheet$15();
                    }
                    zSendPressed = false;
                    chatAttachAlert = this;
                }
                messageSendPreview = chatAttachAlert.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.dismiss(!zSendPressed);
                    chatAttachAlert.messageSendPreview = null;
                }
            }
        } else {
            attachAlertLayout = this.currentAttachLayout;
            if (attachAlertLayout != this.photoLayout) {
                chatAttachAlert = this;
                zSendPressed = chatAttachAlert.sendPressed(true, 0, 0, selectedEffect, isCaptionAbove());
            } else {
                chatAttachAlert = this;
                zSendPressed = chatAttachAlert.sendPressed(true, 0, 0, selectedEffect, isCaptionAbove());
            }
            messageSendPreview = chatAttachAlert.messageSendPreview;
            if (messageSendPreview != null) {
                messageSendPreview.dismiss(!zSendPressed);
                chatAttachAlert.messageSendPreview = null;
            }
        }
        setCaptionAbove(false, false);
    }

    public void lambda$new$29(MessageObject messageObject, MessagePreviewView.ToggleButton toggleButton, View view) {
        MessagePreviewView.ToggleButton toggleButton2;
        setCaptionAbove(!this.captionAbove);
        TLRPC.Message message = messageObject.messageOwner;
        boolean z = this.captionAbove;
        message.invert_media = z;
        toggleButton.setState(!z, true);
        this.messageSendPreview.changeMessage(messageObject);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null && (toggleButton2 = chatAttachAlertPhotoLayout.captionItem) != null) {
            toggleButton2.setState(!this.captionAbove, true);
        }
        this.messageSendPreview.scrollTo(!this.captionAbove);
    }

    public void lambda$new$3(View view) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null) {
            return;
        }
        boolean z = !chatAttachAlertPhotoLayout.areLivePhotosEnabled();
        this.photoLayout.toggleLivePhotos(z);
        updateMotionItem(true);
        showMotionHint(z);
    }

    public void lambda$new$30(boolean z, int i, int i2) {
        ChatAttachAlert chatAttachAlert;
        boolean zSendPressed;
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        this.effectId = selectedEffect;
        sendButton.setEffect(selectedEffect);
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            chatAttachAlert = this;
            zSendPressed = chatAttachAlert.sendPressed(z, i, i2, selectedEffect, isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(z, i, i2, selectedEffect, isCaptionAbove())) {
                lambda$showGiftOfferSheet$15();
            }
            zSendPressed = false;
            chatAttachAlert = this;
        }
        MessageSendPreview messageSendPreview2 = chatAttachAlert.messageSendPreview;
        if (messageSendPreview2 != null) {
            messageSendPreview2.dismiss(!zSendPressed);
            chatAttachAlert.messageSendPreview = null;
        }
    }

    public void lambda$new$31(long j, Theme.ResourcesProvider resourcesProvider) {
        AlertsCreator.createScheduleDatePickerDialog(getContext(), j, new ChatAttachAlert$$ExternalSyntheticLambda1(this, 4), resourcesProvider);
    }

    public void lambda$new$32(ChatActivity chatActivity, MessageSuggestionParams messageSuggestionParams) {
        chatActivity.messageSuggestionParams = messageSuggestionParams;
        boolean zSendPressed = sendPressed(true, 0, 0, this.effectId, isCaptionAbove());
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(!zSendPressed);
            this.messageSendPreview = null;
        }
    }

    public void lambda$new$33(long j, ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider) {
        Context context = getContext();
        int i = this.currentAccount;
        MessageSuggestionParams messageSuggestionParamsEmpty = chatActivity.messageSuggestionParams;
        if (messageSuggestionParamsEmpty == null) {
            messageSuggestionParamsEmpty = MessageSuggestionParams.empty();
        }
        new MessageSuggestionOfferSheet(context, i, j, messageSuggestionParamsEmpty, chatActivity, resourcesProvider, 0, new ScrimOptions$$ExternalSyntheticLambda8(9, this, chatActivity)).show();
    }

    public void lambda$new$34() {
        ChatAttachAlert chatAttachAlert;
        boolean zSendPressed;
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        long selectedEffect = messageSendPreview != null ? messageSendPreview.getSelectedEffect() : 0L;
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        this.effectId = selectedEffect;
        sendButton.setEffect(selectedEffect);
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            chatAttachAlert = this;
            zSendPressed = chatAttachAlert.sendPressed(false, 0, 0, selectedEffect, isCaptionAbove());
        } else {
            if (!attachAlertLayout.sendSelectedItems(false, 0, 0, selectedEffect, isCaptionAbove())) {
                lambda$showGiftOfferSheet$15();
            }
            zSendPressed = false;
            chatAttachAlert = this;
        }
        MessageSendPreview messageSendPreview2 = chatAttachAlert.messageSendPreview;
        if (messageSendPreview2 != null) {
            messageSendPreview2.dismiss(!zSendPressed);
            chatAttachAlert.messageSendPreview = null;
        }
    }

    public void lambda$new$35(ActionBarMenuSubItem actionBarMenuSubItem, Long l, Runnable runnable) {
        runnable.run();
        this.photoLayout.setStarsPrice(l.longValue());
        if (l.longValue() > 0) {
            actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
            actionBarMenuSubItem.setSubtext(LocaleController.formatPluralString("Stars", (int) l.longValue(), new Object[0]));
            this.messageSendPreview.setStars(l.longValue());
        } else {
            actionBarMenuSubItem.setText(LocaleController.getString(R.string.PaidMediaButton));
            actionBarMenuSubItem.setSubtext(null);
            this.messageSendPreview.setStars(0L);
        }
    }

    public void lambda$new$36(Context context, ActionBarMenuSubItem actionBarMenuSubItem, Theme.ResourcesProvider resourcesProvider, View view) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null) {
            return;
        }
        StarsIntroActivity.showMediaPriceSheet(context, chatAttachAlertPhotoLayout.getStarsPrice(), true, new ScrimOptions$$ExternalSyntheticLambda2(1, this, actionBarMenuSubItem), resourcesProvider);
    }

    public boolean lambda$new$37(Context context, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment, View view) throws Throwable {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        ChatActivity chatActivity;
        ArrayList<MessageObject> arrayList;
        boolean z;
        boolean z2;
        MessageObject messageObject3;
        int i;
        long j;
        int i2;
        CharSequence charSequence;
        String string;
        MessageObject messageObject4;
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        ParcelFileDescriptor parcelFileDescriptor;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor2;
        ParcelFileDescriptor parcelFileDescriptor3;
        ParcelFileDescriptor parcelFileDescriptor4;
        String str;
        ItemOptions itemOptionsMakeOptions;
        long j2;
        AttachAlertLayout attachAlertLayout;
        ChatActivity chatActivity2;
        int i3;
        ActionBarMenuSubItem last;
        long starsPrice;
        AttachAlertLayout attachAlertLayout2;
        boolean z3;
        String strSubstring;
        boolean z4;
        boolean z5;
        int i4;
        boolean z6;
        int i5 = 10;
        boolean z7 = true;
        long dialogId = this.dialogId;
        if ((dialogId == 0 && !(this.baseFragment instanceof ChatActivity)) || this.currentLimit - this.codepointCount < 0 || this.animatorEphemeralMessageVisibility.value) {
            return false;
        }
        BaseFragment baseFragment2 = this.baseFragment;
        if (baseFragment2 instanceof ChatActivity) {
            ChatActivity chatActivity3 = (ChatActivity) baseFragment2;
            chatActivity3.getCurrentChat();
            TLRPC.User currentUser = chatActivity3.getCurrentUser();
            MessageObject replyMessage = chatActivity3.getReplyMessage();
            MessageObject replyTopMessage = chatActivity3.getReplyTopMessage();
            if (chatActivity3.isInScheduleMode() || chatActivity3.getChatMode() == 5) {
                return false;
            }
            chatActivity = chatActivity3;
            user = currentUser;
            messageObject = replyMessage;
            messageObject2 = replyTopMessage;
            dialogId = chatActivity3.getDialogId();
        } else {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
            messageObject = null;
            messageObject2 = null;
            chatActivity = null;
        }
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss();
        }
        MessageSendPreview messageSendPreview2 = new MessageSendPreview(context, resourcesProvider) {
            @Override
            public void onEffectChange(long j3) {
                ChatAttachAlert.this.writeButton.setEffect(ChatAttachAlert.this.effectId = j3);
                super.onEffectChange(j3);
            }
        };
        this.messageSendPreview = messageSendPreview2;
        messageSendPreview2.setSendButton(this.writeButton, false, new EditTextEmoji$$ExternalSyntheticLambda0(this, baseFragment, resourcesProvider, 8));
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        AttachAlertLayout attachAlertLayout3 = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (attachAlertLayout3 != chatAttachAlertPhotoLayout && attachAlertLayout3 != this.photoPreviewLayout) {
            if (attachAlertLayout3 == this.contactsLayout) {
                if (TextUtils.isEmpty(getCommentView().getText())) {
                    arrayList = arrayList2;
                    i4 = 0;
                    z6 = false;
                } else {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = 0;
                    tL_message.out = true;
                    tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                    tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(dialogId);
                    CharSequence[] charSequenceArr = {getCommentView().getText()};
                    MessageObject.addLinks(true, charSequenceArr[0]);
                    tL_message.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                    tL_message.message = charSequenceArr[0].toString();
                    MessageObject messageObject5 = new MessageObject(this.currentAccount, tL_message, true, false);
                    messageObject5.sendPreview = true;
                    messageObject5.notime = true;
                    messageObject5.isOutOwnerCached = Boolean.TRUE;
                    arrayList = arrayList2;
                    arrayList.add(messageObject5);
                    i4 = 1;
                    z6 = true;
                }
                ArrayList<TLRPC.User> selected = this.contactsLayout.getSelected();
                boolean z8 = z6;
                int i6 = 0;
                while (i6 < selected.size()) {
                    TLRPC.User user2 = selected.get(i6);
                    TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                    int i7 = i4 + 1;
                    tL_message2.id = i4;
                    tL_message2.out = z7;
                    ArrayList<MessageObject> arrayList3 = arrayList;
                    tL_message2.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                    tL_message2.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(dialogId);
                    TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                    tL_message2.media = tL_messageMediaContact;
                    tL_messageMediaContact.phone_number = user2.phone;
                    tL_messageMediaContact.first_name = user2.first_name;
                    tL_messageMediaContact.last_name = user2.last_name;
                    if (user2.restriction_reason.isEmpty() || !user2.restriction_reason.get(0).text.startsWith("BEGIN:VCARD")) {
                        tL_message2.media.vcard = "";
                    } else {
                        tL_message2.media.vcard = user2.restriction_reason.get(0).text;
                    }
                    tL_message2.media.user_id = user2.id;
                    MessageObject messageObject6 = new MessageObject(this.currentAccount, tL_message2, true, false);
                    messageObject6.sendPreview = true;
                    messageObject6.notime = true;
                    messageObject6.isOutOwnerCached = Boolean.TRUE;
                    arrayList = arrayList3;
                    arrayList.add(messageObject6);
                    i6++;
                    i4 = i7;
                    z8 = true;
                    z7 = true;
                }
                z = z8;
                messageObject3 = null;
            } else {
                arrayList = arrayList2;
                if (attachAlertLayout3 == this.documentLayout) {
                    int i8 = 0;
                    boolean z9 = false;
                    MessageObject messageObject7 = null;
                    for (int i9 = 0; i9 < this.documentLayout.selectedFilesOrder.size(); i9++) {
                        String str2 = this.documentLayout.selectedFilesOrder.get(i9);
                        if (str2 != null) {
                            int iLastIndexOf = str2.lastIndexOf(File.separator);
                            if (iLastIndexOf < 0) {
                                strSubstring = str2;
                                z3 = true;
                            } else {
                                z3 = true;
                                strSubstring = str2.substring(iLastIndexOf + 1);
                            }
                            if (!TextUtils.isEmpty(strSubstring)) {
                                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                                int i10 = i8 + 1;
                                tL_message3.id = i8;
                                tL_message3.out = z3;
                                tL_message3.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                                tL_message3.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(dialogId);
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message3.media = tL_messageMediaDocument;
                                tL_message3.attachPath = str2;
                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                TLRPC.Document document = tL_message3.media.document;
                                document.file_name = strSubstring;
                                document.size = new File(str2).length();
                                if (TextUtils.isEmpty(tL_message3.message) && i9 == 0) {
                                    z4 = true;
                                    z5 = false;
                                    CharSequence[] charSequenceArr2 = {getCommentView().getText()};
                                    tL_message3.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr2, true);
                                    tL_message3.message = charSequenceArr2[0].toString();
                                } else {
                                    z4 = true;
                                    z5 = false;
                                }
                                MessageObject messageObject8 = new MessageObject(this.currentAccount, tL_message3, z4, z5);
                                messageObject8.attachPathExists = z4;
                                messageObject8.sendPreview = z4;
                                messageObject8.notime = z4;
                                messageObject8.isOutOwnerCached = Boolean.TRUE;
                                arrayList.add(messageObject8);
                                if (i9 == 0 && messageObject7 == null && !TextUtils.isEmpty(tL_message3.message)) {
                                    messageObject7 = messageObject8;
                                }
                                i8 = i10;
                                z9 = true;
                            }
                        }
                    }
                    z = z9;
                    messageObject3 = messageObject7;
                } else {
                    ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.audioLayout;
                    if (attachAlertLayout3 == chatAttachAlertAudioLayout) {
                        arrayList.addAll(chatAttachAlertAudioLayout.getSelected());
                        if (arrayList.isEmpty()) {
                            messageObject3 = null;
                        } else {
                            messageObject3 = arrayList.get(0);
                            CharSequence[] charSequenceArr3 = {getCommentView().getText()};
                            MessageObject.addLinks(true, charSequenceArr3[0]);
                            messageObject3.messageOwner.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr3, true);
                            messageObject3.messageOwner.message = charSequenceArr3[0].toString();
                            if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                                messageObject3 = null;
                            } else {
                                messageObject3.generateCaption();
                            }
                        }
                        if (arrayList.size() > 1) {
                            int i11 = 0;
                            while (i11 < Math.ceil(arrayList.size() / 10.0f)) {
                                int i12 = i11 * 10;
                                int iMin = Math.min(i5, arrayList.size() - i12);
                                long jNextLong = Utilities.random.nextLong();
                                for (int i13 = 0; i13 < iMin; i13++) {
                                    int i14 = i12 + i13;
                                    if (i14 < arrayList.size()) {
                                        arrayList.get(i14).messageOwner.grouped_id = jNextLong;
                                    }
                                }
                                i11++;
                                i5 = 10;
                            }
                        }
                        z = true;
                    }
                }
            }
            z2 = false;
            if (arrayList.isEmpty()) {
                return false;
            }
            itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, resourcesProvider, this.writeButton);
            if (messageObject3 != null) {
                MessagePreviewView.ToggleButton toggleButton = new MessagePreviewView.ToggleButton(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), resourcesProvider);
                TLRPC.Message message = messageObject3.messageOwner;
                boolean z10 = this.captionAbove;
                message.invert_media = z10;
                toggleButton.setState(!z10, false);
                toggleButton.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, messageObject3, toggleButton, 9));
                itemOptionsMakeOptions.addView(toggleButton);
                if (this.editingMessageObject == null) {
                    itemOptionsMakeOptions.addGap();
                }
            }
            boolean zIsUserSelf = UserObject.isUserSelf(user);
            if (this.editingMessageObject == null) {
                j2 = dialogId;
            } else {
                j2 = dialogId;
            }
            attachAlertLayout = this.currentAttachLayout;
            if (attachAlertLayout != this.photoLayout) {
                chatActivity2 = chatActivity;
                itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new TopicsTabsView$$ExternalSyntheticLambda0(this, j2, chatActivity2, resourcesProvider));
            } else {
                chatActivity2 = chatActivity;
                itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new TopicsTabsView$$ExternalSyntheticLambda0(this, j2, chatActivity2, resourcesProvider));
            }
            if (this.editingMessageObject == null) {
                itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ChatAttachAlert$$ExternalSyntheticLambda12(this, 2));
            }
            if (this.editingMessageObject == null) {
                int i15 = R.drawable.menu_feature_paid;
                i3 = R.string.PaidMediaButton;
                last = itemOptionsMakeOptions.add(i15, LocaleController.getString(i3), (Runnable) null).getLast();
                last.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda4(this, context, last, resourcesProvider, 4));
                starsPrice = this.photoLayout.getStarsPrice();
                if (starsPrice > 0) {
                    last.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                    last.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
                } else {
                    last.setText(LocaleController.getString(i3));
                    last.setSubtext(null);
                }
                this.messageSendPreview.setStars(starsPrice);
            }
            itemOptionsMakeOptions.setupSelectors();
            this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
            this.messageSendPreview.setMessageObjects(arrayList);
            if (this.editingMessageObject == null) {
                this.messageSendPreview.allowEffectSelector(baseFragment);
                this.messageSendPreview.setEffectId(this.effectId);
            }
            this.messageSendPreview.show();
            view.performHapticFeedback(3, 2);
            return true;
        }
        arrayList = arrayList2;
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = this.photoLayout.getSelectedPhotosOrder();
        if (!selectedPhotos.isEmpty()) {
            int iCeil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            boolean z11 = false;
            int i16 = 0;
            int i17 = 0;
            z = false;
            MessageObject messageObject9 = null;
            while (i17 < iCeil) {
                int i18 = i17 * 10;
                MessageObject messageObject10 = messageObject2;
                int iMin2 = Math.min(10, selectedPhotos.size() - i18);
                int i19 = iCeil;
                int i20 = i17;
                long jNextLong2 = Utilities.random.nextLong();
                int i21 = i16;
                z11 = z11;
                int i22 = 0;
                while (i22 < iMin2) {
                    boolean z12 = z11;
                    int i23 = i18 + i22;
                    int i24 = iMin2;
                    if (i23 >= selectedPhotosOrder.size()) {
                        j = dialogId;
                        i = i22;
                        z11 = z12;
                    } else {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i23));
                        TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                        i = i22;
                        int i25 = i21 + 1;
                        tL_message4.id = i21;
                        tL_message4.out = true;
                        tL_message4.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                        tL_message4.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(dialogId);
                        boolean z13 = photoEntry.isVideo;
                        if (z13 || (str = photoEntry.imagePath) == null) {
                            String str3 = photoEntry.path;
                            if (str3 != null) {
                                tL_message4.attachPath = str3;
                            }
                        } else {
                            tL_message4.attachPath = str;
                        }
                        if (i24 > 0) {
                            tL_message4.grouped_id = jNextLong2;
                        }
                        int i26 = photoEntry.width;
                        int i27 = photoEntry.height;
                        int i28 = photoEntry.orientation;
                        if (z13) {
                            if (photoEntry.videoOrientation == -1) {
                                try {
                                    MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
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
                                                                        parcelFileDescriptor4 = parcelFileDescriptorOpen;
                                                                        try {
                                                                            mediaMetadataRetriever3.setDataSource(parcelFileDescriptorOpen.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                        } catch (Exception e) {
                                                                            e = e;
                                                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                            parcelFileDescriptor2 = parcelFileDescriptor4;
                                                                            try {
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
                                                                                    parcelFileDescriptor2.close();
                                                                                }
                                                                                i2 = photoEntry.videoOrientation;
                                                                                if ((i2 / 90) % 2 == 0) {
                                                                                    i27 = i26;
                                                                                    i26 = i27;
                                                                                }
                                                                                if (photoEntry.isLivePhoto()) {
                                                                                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                                                                    tL_message4.media = tL_messageMediaPhoto;
                                                                                    tL_messageMediaPhoto.live_photo = true;
                                                                                    tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                                                                    TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                                                                    tL_photoSize.w = i27;
                                                                                    tL_photoSize.h = i26;
                                                                                    tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                                    tL_message4.media.photo.sizes.add(tL_photoSize);
                                                                                    tL_message4.media.document = new TLRPC.TL_document();
                                                                                    tL_message4.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message4.attachPath);
                                                                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                                                                    tL_documentAttributeVideo.w = i27;
                                                                                    tL_documentAttributeVideo.h = i26;
                                                                                    tL_documentAttributeVideo.duration = photoEntry.duration;
                                                                                    tL_message4.media.document.attributes.add(tL_documentAttributeVideo);
                                                                                } else if (photoEntry.isVideo) {
                                                                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                                                                                    tL_message4.media = tL_messageMediaDocument2;
                                                                                    tL_messageMediaDocument2.document = new TLRPC.TL_document();
                                                                                    tL_message4.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message4.attachPath);
                                                                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                                                                    tL_documentAttributeVideo2.w = i27;
                                                                                    tL_documentAttributeVideo2.h = i26;
                                                                                    tL_documentAttributeVideo2.duration = photoEntry.duration;
                                                                                    tL_message4.media.document.attributes.add(tL_documentAttributeVideo2);
                                                                                } else {
                                                                                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                                                                    tL_message4.media = tL_messageMediaPhoto2;
                                                                                    tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                                                                    TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                                                                    tL_photoSize2.w = i27;
                                                                                    tL_photoSize2.h = i26;
                                                                                    tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                                    tL_message4.media.photo.sizes.add(tL_photoSize2);
                                                                                }
                                                                                tL_message4.media.spoiler = photoEntry.hasSpoiler;
                                                                                charSequence = photoEntry.caption;
                                                                                if (charSequence == null) {
                                                                                    string = "";
                                                                                } else {
                                                                                    string = charSequence.toString();
                                                                                }
                                                                                tL_message4.message = string;
                                                                                if (TextUtils.isEmpty(string)) {
                                                                                    CharSequence[] charSequenceArr4 = {getCommentView().getText()};
                                                                                    MessageObject.addLinks(true, charSequenceArr4[0]);
                                                                                    tL_message4.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr4, true);
                                                                                    tL_message4.message = charSequenceArr4[0].toString();
                                                                                }
                                                                                if (i20 == 0) {
                                                                                    tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                                                    if (messageObject10 != null) {
                                                                                        tL_messageReplyHeader.flags |= 2;
                                                                                        tL_messageReplyHeader.reply_to_top_id = messageObject10.getId();
                                                                                    }
                                                                                    tL_messageReplyHeader.flags |= 16;
                                                                                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                                                    tL_message4.reply_to = tL_messageReplyHeader;
                                                                                }
                                                                                messageObject4 = new MessageObject(this.currentAccount, tL_message4, true, false);
                                                                                if (i20 == 0) {
                                                                                    messageObject4.replyMessageObject = messageObject;
                                                                                }
                                                                                messageObject4.sendPreviewEntry = photoEntry;
                                                                                messageObject4.sendPreview = true;
                                                                                messageObject4.notime = true;
                                                                                messageObject4.isOutOwnerCached = Boolean.TRUE;
                                                                                arrayList.add(messageObject4);
                                                                                if (messageObject9 == null) {
                                                                                    messageObject9 = messageObject4;
                                                                                }
                                                                                i21 = i25;
                                                                                z11 = true;
                                                                                z = true;
                                                                                i22 = i + 1;
                                                                                iMin2 = i24;
                                                                                selectedPhotos = selectedPhotos;
                                                                                selectedPhotosOrder = selectedPhotosOrder;
                                                                                dialogId = j;
                                                                            } catch (Throwable th2) {
                                                                                th = th2;
                                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                                parcelFileDescriptor = parcelFileDescriptor2;
                                                                                if (mediaMetadataRetriever != null) {
                                                                                    try {
                                                                                        mediaMetadataRetriever.release();
                                                                                    } catch (IOException e3) {
                                                                                        FileLog.e(e3);
                                                                                    }
                                                                                }
                                                                                if (parcelFileDescriptor != null) {
                                                                                    throw th;
                                                                                }
                                                                                try {
                                                                                    parcelFileDescriptor.close();
                                                                                    throw th;
                                                                                } catch (IOException e4) {
                                                                                    FileLog.e(e4);
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                            parcelFileDescriptor3 = parcelFileDescriptor4;
                                                                            th = th;
                                                                            parcelFileDescriptor = parcelFileDescriptor3;
                                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                            if (mediaMetadataRetriever != null) {
                                                                                mediaMetadataRetriever.release();
                                                                            }
                                                                            if (parcelFileDescriptor != null) {
                                                                                throw th;
                                                                            }
                                                                            parcelFileDescriptor.close();
                                                                            throw th;
                                                                        }
                                                                    } catch (Exception e5) {
                                                                        e = e5;
                                                                        parcelFileDescriptor4 = parcelFileDescriptorOpen;
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        parcelFileDescriptor4 = parcelFileDescriptorOpen;
                                                                    }
                                                                }
                                                                photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                                                mediaMetadataRetriever2.release();
                                                                if (parcelFileDescriptor4 != null) {
                                                                    try {
                                                                        parcelFileDescriptor4.close();
                                                                    } catch (IOException e6) {
                                                                        FileLog.e(e6);
                                                                    }
                                                                }
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                parcelFileDescriptor4 = null;
                                                                parcelFileDescriptor2 = parcelFileDescriptor4;
                                                                photoEntry.videoOrientation = 0;
                                                                FileLog.e(e);
                                                                if (mediaMetadataRetriever2 != null) {
                                                                    mediaMetadataRetriever2.release();
                                                                }
                                                                if (parcelFileDescriptor2 != null) {
                                                                    parcelFileDescriptor2.close();
                                                                }
                                                                i2 = photoEntry.videoOrientation;
                                                                if ((i2 / 90) % 2 == 0) {
                                                                    i27 = i26;
                                                                    i26 = i27;
                                                                }
                                                                if (photoEntry.isLivePhoto()) {
                                                                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto3 = new TLRPC.TL_messageMediaPhoto();
                                                                    tL_message4.media = tL_messageMediaPhoto3;
                                                                    tL_messageMediaPhoto3.live_photo = true;
                                                                    tL_messageMediaPhoto3.photo = new TLRPC.TL_photo();
                                                                    TLRPC.TL_photoSize tL_photoSize3 = new TLRPC.TL_photoSize();
                                                                    tL_photoSize3.w = i27;
                                                                    tL_photoSize3.h = i26;
                                                                    tL_photoSize3.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                    tL_message4.media.photo.sizes.add(tL_photoSize3);
                                                                    tL_message4.media.document = new TLRPC.TL_document();
                                                                    tL_message4.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message4.attachPath);
                                                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo3 = new TLRPC.TL_documentAttributeVideo();
                                                                    tL_documentAttributeVideo3.w = i27;
                                                                    tL_documentAttributeVideo3.h = i26;
                                                                    tL_documentAttributeVideo3.duration = photoEntry.duration;
                                                                    tL_message4.media.document.attributes.add(tL_documentAttributeVideo3);
                                                                } else if (photoEntry.isVideo) {
                                                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                                                                    tL_message4.media = tL_messageMediaDocument3;
                                                                    tL_messageMediaDocument3.document = new TLRPC.TL_document();
                                                                    tL_message4.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message4.attachPath);
                                                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo4 = new TLRPC.TL_documentAttributeVideo();
                                                                    tL_documentAttributeVideo4.w = i27;
                                                                    tL_documentAttributeVideo4.h = i26;
                                                                    tL_documentAttributeVideo4.duration = photoEntry.duration;
                                                                    tL_message4.media.document.attributes.add(tL_documentAttributeVideo4);
                                                                } else {
                                                                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto4 = new TLRPC.TL_messageMediaPhoto();
                                                                    tL_message4.media = tL_messageMediaPhoto4;
                                                                    tL_messageMediaPhoto4.photo = new TLRPC.TL_photo();
                                                                    TLRPC.TL_photoSize tL_photoSize4 = new TLRPC.TL_photoSize();
                                                                    tL_photoSize4.w = i27;
                                                                    tL_photoSize4.h = i26;
                                                                    tL_photoSize4.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                    tL_message4.media.photo.sizes.add(tL_photoSize4);
                                                                }
                                                                tL_message4.media.spoiler = photoEntry.hasSpoiler;
                                                                charSequence = photoEntry.caption;
                                                                if (charSequence == null) {
                                                                    string = "";
                                                                } else {
                                                                    string = charSequence.toString();
                                                                }
                                                                tL_message4.message = string;
                                                                if (TextUtils.isEmpty(string)) {
                                                                    CharSequence[] charSequenceArr5 = {getCommentView().getText()};
                                                                    MessageObject.addLinks(true, charSequenceArr5[0]);
                                                                    tL_message4.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr5, true);
                                                                    tL_message4.message = charSequenceArr5[0].toString();
                                                                }
                                                                if (i20 == 0) {
                                                                    tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                                    if (messageObject10 != null) {
                                                                        tL_messageReplyHeader.flags |= 2;
                                                                        tL_messageReplyHeader.reply_to_top_id = messageObject10.getId();
                                                                    }
                                                                    tL_messageReplyHeader.flags |= 16;
                                                                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                                    tL_message4.reply_to = tL_messageReplyHeader;
                                                                }
                                                                messageObject4 = new MessageObject(this.currentAccount, tL_message4, true, false);
                                                                if (i20 == 0) {
                                                                    messageObject4.replyMessageObject = messageObject;
                                                                }
                                                                messageObject4.sendPreviewEntry = photoEntry;
                                                                messageObject4.sendPreview = true;
                                                                messageObject4.notime = true;
                                                                messageObject4.isOutOwnerCached = Boolean.TRUE;
                                                                arrayList.add(messageObject4);
                                                                if (messageObject9 == null) {
                                                                    messageObject9 = messageObject4;
                                                                }
                                                                i21 = i25;
                                                                z11 = true;
                                                                z = true;
                                                                i22 = i + 1;
                                                                iMin2 = i24;
                                                                selectedPhotos = selectedPhotos;
                                                                selectedPhotosOrder = selectedPhotosOrder;
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
                                                    if (parcelFileDescriptor4 != null) {
                                                        parcelFileDescriptor4.close();
                                                    }
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    parcelFileDescriptor2 = parcelFileDescriptor4;
                                                    photoEntry.videoOrientation = 0;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                        mediaMetadataRetriever2.release();
                                                    }
                                                    if (parcelFileDescriptor2 != null) {
                                                        parcelFileDescriptor2.close();
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    parcelFileDescriptor3 = parcelFileDescriptor4;
                                                    th = th;
                                                    parcelFileDescriptor = parcelFileDescriptor3;
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    if (mediaMetadataRetriever != null) {
                                                        mediaMetadataRetriever.release();
                                                    }
                                                    if (parcelFileDescriptor != null) {
                                                        throw th;
                                                    }
                                                    parcelFileDescriptor.close();
                                                    throw th;
                                                }
                                                mediaMetadataRetriever2.setDataSource(photoEntry.path);
                                                parcelFileDescriptor4 = null;
                                            } catch (Exception e10) {
                                                e = e10;
                                                parcelFileDescriptor4 = null;
                                                parcelFileDescriptor2 = parcelFileDescriptor4;
                                                photoEntry.videoOrientation = 0;
                                                FileLog.e(e);
                                                if (mediaMetadataRetriever2 != null) {
                                                    mediaMetadataRetriever2.release();
                                                }
                                                if (parcelFileDescriptor2 != null) {
                                                    parcelFileDescriptor2.close();
                                                }
                                                i2 = photoEntry.videoOrientation;
                                                if ((i2 / 90) % 2 == 0) {
                                                    i27 = i26;
                                                    i26 = i27;
                                                }
                                                if (photoEntry.isLivePhoto()) {
                                                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto5 = new TLRPC.TL_messageMediaPhoto();
                                                    tL_message4.media = tL_messageMediaPhoto5;
                                                    tL_messageMediaPhoto5.live_photo = true;
                                                    tL_messageMediaPhoto5.photo = new TLRPC.TL_photo();
                                                    TLRPC.TL_photoSize tL_photoSize5 = new TLRPC.TL_photoSize();
                                                    tL_photoSize5.w = i27;
                                                    tL_photoSize5.h = i26;
                                                    tL_photoSize5.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                    tL_message4.media.photo.sizes.add(tL_photoSize5);
                                                    tL_message4.media.document = new TLRPC.TL_document();
                                                    tL_message4.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message4.attachPath);
                                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo5 = new TLRPC.TL_documentAttributeVideo();
                                                    tL_documentAttributeVideo5.w = i27;
                                                    tL_documentAttributeVideo5.h = i26;
                                                    tL_documentAttributeVideo5.duration = photoEntry.duration;
                                                    tL_message4.media.document.attributes.add(tL_documentAttributeVideo5);
                                                } else if (photoEntry.isVideo) {
                                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
                                                    tL_message4.media = tL_messageMediaDocument4;
                                                    tL_messageMediaDocument4.document = new TLRPC.TL_document();
                                                    tL_message4.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message4.attachPath);
                                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo6 = new TLRPC.TL_documentAttributeVideo();
                                                    tL_documentAttributeVideo6.w = i27;
                                                    tL_documentAttributeVideo6.h = i26;
                                                    tL_documentAttributeVideo6.duration = photoEntry.duration;
                                                    tL_message4.media.document.attributes.add(tL_documentAttributeVideo6);
                                                } else {
                                                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto6 = new TLRPC.TL_messageMediaPhoto();
                                                    tL_message4.media = tL_messageMediaPhoto6;
                                                    tL_messageMediaPhoto6.photo = new TLRPC.TL_photo();
                                                    TLRPC.TL_photoSize tL_photoSize6 = new TLRPC.TL_photoSize();
                                                    tL_photoSize6.w = i27;
                                                    tL_photoSize6.h = i26;
                                                    tL_photoSize6.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                    tL_message4.media.photo.sizes.add(tL_photoSize6);
                                                }
                                                tL_message4.media.spoiler = photoEntry.hasSpoiler;
                                                charSequence = photoEntry.caption;
                                                if (charSequence == null) {
                                                    string = "";
                                                } else {
                                                    string = charSequence.toString();
                                                }
                                                tL_message4.message = string;
                                                if (TextUtils.isEmpty(string)) {
                                                    CharSequence[] charSequenceArr6 = {getCommentView().getText()};
                                                    MessageObject.addLinks(true, charSequenceArr6[0]);
                                                    tL_message4.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr6, true);
                                                    tL_message4.message = charSequenceArr6[0].toString();
                                                }
                                                if (i20 == 0) {
                                                    tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                    if (messageObject10 != null) {
                                                        tL_messageReplyHeader.flags |= 2;
                                                        tL_messageReplyHeader.reply_to_top_id = messageObject10.getId();
                                                    }
                                                    tL_messageReplyHeader.flags |= 16;
                                                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                    tL_message4.reply_to = tL_messageReplyHeader;
                                                }
                                                messageObject4 = new MessageObject(this.currentAccount, tL_message4, true, false);
                                                if (i20 == 0) {
                                                    messageObject4.replyMessageObject = messageObject;
                                                }
                                                messageObject4.sendPreviewEntry = photoEntry;
                                                messageObject4.sendPreview = true;
                                                messageObject4.notime = true;
                                                messageObject4.isOutOwnerCached = Boolean.TRUE;
                                                arrayList.add(messageObject4);
                                                if (messageObject9 == null) {
                                                    messageObject9 = messageObject4;
                                                }
                                                i21 = i25;
                                                z11 = true;
                                                z = true;
                                                i22 = i + 1;
                                                iMin2 = i24;
                                                selectedPhotos = selectedPhotos;
                                                selectedPhotosOrder = selectedPhotosOrder;
                                                dialogId = j;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                parcelFileDescriptor3 = null;
                                                th = th;
                                                parcelFileDescriptor = parcelFileDescriptor3;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                if (mediaMetadataRetriever != null) {
                                                    mediaMetadataRetriever.release();
                                                }
                                                if (parcelFileDescriptor != null) {
                                                    throw th;
                                                }
                                                parcelFileDescriptor.close();
                                                throw th;
                                            }
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        j = dialogId;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    j = dialogId;
                                    mediaMetadataRetriever2 = null;
                                    parcelFileDescriptor2 = null;
                                } catch (Throwable th8) {
                                    th = th8;
                                    mediaMetadataRetriever = null;
                                    parcelFileDescriptor = null;
                                }
                            } else {
                                j = dialogId;
                            }
                            i2 = photoEntry.videoOrientation;
                        } else {
                            j = dialogId;
                            i2 = i28;
                        }
                        if ((i2 / 90) % 2 == 0) {
                            i27 = i26;
                            i26 = i27;
                        }
                        if (photoEntry.isLivePhoto()) {
                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto7 = new TLRPC.TL_messageMediaPhoto();
                            tL_message4.media = tL_messageMediaPhoto7;
                            tL_messageMediaPhoto7.live_photo = true;
                            tL_messageMediaPhoto7.photo = new TLRPC.TL_photo();
                            TLRPC.TL_photoSize tL_photoSize7 = new TLRPC.TL_photoSize();
                            tL_photoSize7.w = i27;
                            tL_photoSize7.h = i26;
                            tL_photoSize7.location = new TLRPC.TL_fileLocationToBeDeprecated();
                            tL_message4.media.photo.sizes.add(tL_photoSize7);
                            tL_message4.media.document = new TLRPC.TL_document();
                            tL_message4.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message4.attachPath);
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo7 = new TLRPC.TL_documentAttributeVideo();
                            tL_documentAttributeVideo7.w = i27;
                            tL_documentAttributeVideo7.h = i26;
                            tL_documentAttributeVideo7.duration = photoEntry.duration;
                            tL_message4.media.document.attributes.add(tL_documentAttributeVideo7);
                        } else if (photoEntry.isVideo) {
                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument5 = new TLRPC.TL_messageMediaDocument();
                            tL_message4.media = tL_messageMediaDocument5;
                            tL_messageMediaDocument5.document = new TLRPC.TL_document();
                            tL_message4.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message4.attachPath);
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo8 = new TLRPC.TL_documentAttributeVideo();
                            tL_documentAttributeVideo8.w = i27;
                            tL_documentAttributeVideo8.h = i26;
                            tL_documentAttributeVideo8.duration = photoEntry.duration;
                            tL_message4.media.document.attributes.add(tL_documentAttributeVideo8);
                        } else {
                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto8 = new TLRPC.TL_messageMediaPhoto();
                            tL_message4.media = tL_messageMediaPhoto8;
                            tL_messageMediaPhoto8.photo = new TLRPC.TL_photo();
                            TLRPC.TL_photoSize tL_photoSize8 = new TLRPC.TL_photoSize();
                            tL_photoSize8.w = i27;
                            tL_photoSize8.h = i26;
                            tL_photoSize8.location = new TLRPC.TL_fileLocationToBeDeprecated();
                            tL_message4.media.photo.sizes.add(tL_photoSize8);
                        }
                        tL_message4.media.spoiler = photoEntry.hasSpoiler;
                        charSequence = photoEntry.caption;
                        if (charSequence == null) {
                            string = "";
                        } else {
                            string = charSequence.toString();
                        }
                        tL_message4.message = string;
                        if (TextUtils.isEmpty(string) && i20 == 0 && i == 0) {
                            CharSequence[] charSequenceArr7 = {getCommentView().getText()};
                            MessageObject.addLinks(true, charSequenceArr7[0]);
                            tL_message4.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr7, true);
                            tL_message4.message = charSequenceArr7[0].toString();
                        }
                        if (i20 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                            tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                            if (messageObject10 != null) {
                                tL_messageReplyHeader.flags |= 2;
                                tL_messageReplyHeader.reply_to_top_id = messageObject10.getId();
                            }
                            tL_messageReplyHeader.flags |= 16;
                            tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                            tL_message4.reply_to = tL_messageReplyHeader;
                        }
                        messageObject4 = new MessageObject(this.currentAccount, tL_message4, true, false);
                        if (i20 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                            messageObject4.replyMessageObject = messageObject;
                        }
                        messageObject4.sendPreviewEntry = photoEntry;
                        messageObject4.sendPreview = true;
                        messageObject4.notime = true;
                        messageObject4.isOutOwnerCached = Boolean.TRUE;
                        arrayList.add(messageObject4);
                        if (messageObject9 == null && !TextUtils.isEmpty(tL_message4.message)) {
                            messageObject9 = messageObject4;
                        }
                        i21 = i25;
                        z11 = true;
                        z = true;
                    }
                    i22 = i + 1;
                    iMin2 = i24;
                    selectedPhotos = selectedPhotos;
                    selectedPhotosOrder = selectedPhotosOrder;
                    dialogId = j;
                }
                i17 = i20 + 1;
                i16 = i21;
                iCeil = i19;
                messageObject2 = messageObject10;
            }
            z2 = z11;
            dialogId = dialogId;
            messageObject3 = messageObject9;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, resourcesProvider, this.writeButton);
        if (messageObject3 != null && ((attachAlertLayout2 = this.currentAttachLayout) == this.photoLayout || attachAlertLayout2 == this.photoPreviewLayout)) {
            MessagePreviewView.ToggleButton toggleButton2 = new MessagePreviewView.ToggleButton(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), resourcesProvider);
            TLRPC.Message message2 = messageObject3.messageOwner;
            boolean z14 = this.captionAbove;
            message2.invert_media = z14;
            toggleButton2.setState(!z14, false);
            toggleButton2.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, messageObject3, toggleButton2, 9));
            itemOptionsMakeOptions.addView(toggleButton2);
            if (this.editingMessageObject == null) {
                itemOptionsMakeOptions.addGap();
            }
        }
        boolean zIsUserSelf2 = UserObject.isUserSelf(user);
        if (this.editingMessageObject == null || ((chatActivity != null && ChatObject.isMonoForum(chatActivity.getCurrentChat())) || ((chatActivity == null || !chatActivity.canScheduleMessage()) && !this.currentAttachLayout.canScheduleMessages()))) {
            j2 = dialogId;
        } else {
            j2 = dialogId;
            itemOptionsMakeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf2 ? R.string.SetReminder : R.string.ScheduleMessage), new BulletinFactory$$ExternalSyntheticLambda5(this, j2, resourcesProvider, 4));
        }
        attachAlertLayout = this.currentAttachLayout;
        if ((attachAlertLayout != this.photoLayout || attachAlertLayout == this.photoPreviewLayout) && attachAlertLayout.getSelectedItemsCount() == 1 && chatActivity != null && ChatObject.isMonoForum(chatActivity.getCurrentChat())) {
            chatActivity2 = chatActivity;
            itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new TopicsTabsView$$ExternalSyntheticLambda0(this, j2, chatActivity2, resourcesProvider));
        } else {
            chatActivity2 = chatActivity;
        }
        if (this.editingMessageObject == null && !zIsUserSelf2) {
            itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ChatAttachAlert$$ExternalSyntheticLambda12(this, 2));
        }
        if (this.editingMessageObject == null && z2 && chatActivity2 != null && ChatObject.isChannelAndNotMegaGroup(chatActivity2.getCurrentChat()) && chatActivity2.getCurrentChatInfo() != null && chatActivity2.getCurrentChatInfo().paid_media_allowed) {
            int i110 = R.drawable.menu_feature_paid;
            i3 = R.string.PaidMediaButton;
            last = itemOptionsMakeOptions.add(i110, LocaleController.getString(i3), (Runnable) null).getLast();
            last.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda4(this, context, last, resourcesProvider, 4));
            starsPrice = this.photoLayout.getStarsPrice();
            if (starsPrice > 0) {
                last.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                last.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                last.setText(LocaleController.getString(i3));
                last.setSubtext(null);
            }
            this.messageSendPreview.setStars(starsPrice);
        }
        itemOptionsMakeOptions.setupSelectors();
        this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
        this.messageSendPreview.setMessageObjects(arrayList);
        if (this.editingMessageObject == null && j2 >= 0 && z) {
            this.messageSendPreview.allowEffectSelector(baseFragment);
            this.messageSendPreview.setEffectId(this.effectId);
        }
        this.messageSendPreview.show();
        try {
            view.performHapticFeedback(3, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
        messageObject3 = null;
        z = false;
        z2 = false;
        if (arrayList.isEmpty()) {
            return false;
        }
        itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, resourcesProvider, this.writeButton);
        if (messageObject3 != null) {
            MessagePreviewView.ToggleButton toggleButton3 = new MessagePreviewView.ToggleButton(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), resourcesProvider);
            TLRPC.Message message3 = messageObject3.messageOwner;
            boolean z15 = this.captionAbove;
            message3.invert_media = z15;
            toggleButton3.setState(!z15, false);
            toggleButton3.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, messageObject3, toggleButton3, 9));
            itemOptionsMakeOptions.addView(toggleButton3);
            if (this.editingMessageObject == null) {
                itemOptionsMakeOptions.addGap();
            }
        }
        boolean zIsUserSelf3 = UserObject.isUserSelf(user);
        if (this.editingMessageObject == null) {
            j2 = dialogId;
        } else {
            j2 = dialogId;
        }
        attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout != this.photoLayout) {
            chatActivity2 = chatActivity;
            itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new TopicsTabsView$$ExternalSyntheticLambda0(this, j2, chatActivity2, resourcesProvider));
        } else {
            chatActivity2 = chatActivity;
            itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new TopicsTabsView$$ExternalSyntheticLambda0(this, j2, chatActivity2, resourcesProvider));
        }
        if (this.editingMessageObject == null) {
            itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ChatAttachAlert$$ExternalSyntheticLambda12(this, 2));
        }
        if (this.editingMessageObject == null) {
            int i111 = R.drawable.menu_feature_paid;
            i3 = R.string.PaidMediaButton;
            last = itemOptionsMakeOptions.add(i111, LocaleController.getString(i3), (Runnable) null).getLast();
            last.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda4(this, context, last, resourcesProvider, 4));
            starsPrice = this.photoLayout.getStarsPrice();
            if (starsPrice > 0) {
                last.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                last.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                last.setText(LocaleController.getString(i3));
                last.setSubtext(null);
            }
            this.messageSendPreview.setStars(starsPrice);
        }
        itemOptionsMakeOptions.setupSelectors();
        this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
        this.messageSendPreview.setMessageObjects(arrayList);
        if (this.editingMessageObject == null) {
            this.messageSendPreview.allowEffectSelector(baseFragment);
            this.messageSendPreview.setEffectId(this.effectId);
        }
        this.messageSendPreview.show();
        view.performHapticFeedback(3, 2);
        return true;
    }

    public int lambda$new$38(Theme.ResourcesProvider resourcesProvider, boolean z) {
        float f = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
        int color = Theme.getColor(z ? Theme.key_windowBackgroundGray : Theme.key_dialogBackgroundGray, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
        return this.hasOverridenWebviewBackgroundColor ? ColorUtils.blendARGB(0.75f, color2, this.overridenWebviewBackgroundColor) : BlurredBackgroundProviderImpl.solveSrcColor(f, color, color2);
    }

    public int lambda$new$39(Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (this.hasOverridenWebviewBackgroundColor) {
            return 0;
        }
        return z ? 687865855 : -1;
    }

    public void lambda$new$4(View view) {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout != null) {
            attachAlertLayout.onMenuItemClick(40);
        }
    }

    public int lambda$new$40(Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (this.hasOverridenWebviewBackgroundColor) {
            return 0;
        }
        return z ? 352321535 : -1;
    }

    public int lambda$new$41(Theme.ResourcesProvider resourcesProvider, boolean z) {
        if (this.hasOverridenWebviewBackgroundColor) {
            return AndroidUtilities.computePerceivedBrightness(this.overridenWebviewBackgroundColor) > 0.72f ? 536870912 : 1090519039;
        }
        return z ? 0 : 536870912;
    }

    public void lambda$new$5(boolean z, View view) {
        if (this.avatarPicker != 0) {
            this.delegate.openAvatarsSearch();
            lambda$showGiftOfferSheet$15();
            return;
        }
        final HashMap map = new HashMap();
        final ArrayList arrayList = new ArrayList();
        PhotoPickerSearchActivity photoPickerSearchActivity = new PhotoPickerSearchActivity(map, arrayList, 0, true, (ChatActivity) this.baseFragment);
        photoPickerSearchActivity.setDelegate(new PhotoPickerActivity.PhotoPickerActivityDelegate() {
            private boolean sendPressed;

            @Override
            public void actionButtonPressed(boolean z2, boolean z3, int i, int i2) {
                if (z2 || map.isEmpty() || this.sendPressed) {
                    return;
                }
                this.sendPressed = true;
                ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList2 = new ArrayList<>();
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

            @Override
            public final boolean canFinishFragment() {
                return PhotoPickerActivity.PhotoPickerActivityDelegate.CC.$default$canFinishFragment(this);
            }

            @Override
            public void onCaptionChanged(CharSequence charSequence) {
            }

            @Override
            public final void onOpenInPressed() {
                PhotoPickerActivity.PhotoPickerActivityDelegate.CC.$default$onOpenInPressed(this);
            }

            @Override
            public void selectedPhotosChanged() {
            }
        });
        photoPickerSearchActivity.setMaxSelectedPhotos(this.maxSelectedPhotos, this.allowOrder);
        if (z) {
            this.baseFragment.showAsSheet(photoPickerSearchActivity);
        } else {
            this.baseFragment.presentFragment(photoPickerSearchActivity);
        }
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$6(Theme.ResourcesProvider resourcesProvider, View view) {
        this.optionsItem.toggleSubMenu();
        PhotoViewer.getInstance().setParentActivity(this.baseFragment, resourcesProvider);
        PhotoViewer.getInstance().setParentAlert(this);
        PhotoViewer.getInstance().setMaxSelectedPhotos(this.maxSelectedPhotos, this.allowOrder);
        if (!this.delegate.needEnterComment()) {
            AndroidUtilities.hideKeyboard(this.baseFragment.getFragmentView().findFocus());
            AndroidUtilities.hideKeyboard(getContainer().findFocus());
        }
        File fileMakeCacheFile = StoryEntry.makeCacheFile(this.currentAccount, "webp");
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
        ArrayList<Object> arrayList = new ArrayList<>();
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileMakeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
        arrayList.add(photoEntry);
        PhotoViewer photoViewer = PhotoViewer.getInstance();
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(photoEntry);
        BaseFragment baseFragment = this.baseFragment;
        photoViewer.openPhotoForSelect(arrayList, 0, 11, false, anonymousClass11, baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null);
        if (this.isStickerMode) {
            PhotoViewer.getInstance().enableStickerMode(null, null, true, this.customStickerHandler);
        }
    }

    public void lambda$new$7(View view) {
        this.optionsItem.toggleSubMenu();
    }

    public void lambda$new$8(View view) {
        updatePhotoPreview(this.currentAttachLayout != this.photoPreviewLayout);
    }

    public void lambda$new$9(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        ((ChatActivity) this.baseFragment).didSelectLocation(messageMedia, i, z, i2, j);
    }

    public void lambda$onCustomOpenAnimation$57(ValueAnimator valueAnimator) {
        this.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BottomSheet.ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public void lambda$onCustomOpenAnimation$58(AnimationNotificationsLocker animationNotificationsLocker, BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface) {
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

    public void lambda$onCustomOpenAnimation$59(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        runnable.run();
    }

    public void lambda$onCustomOpenAnimation$60(ValueAnimator valueAnimator) {
        setNavBarAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$onLongClickBotButton$44(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        MediaDataController.getInstance(this.currentAccount).loadAttachMenuBots(false, true);
        if (this.currentAttachLayout == this.botAttachLayouts.get(tL_attachMenuBot.bot_id)) {
            showLayout(this.photoLayout);
        }
    }

    public void lambda$onLongClickBotButton$45(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda7(6, this, tL_attachMenuBot));
    }

    public void lambda$onLongClickBotButton$46(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, AlertDialog alertDialog, int i) {
        if (tL_attachMenuBot == null) {
            MediaDataController.getInstance(this.currentAccount).removeInline(user.id);
            return;
        }
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_toggleBotInAttachMenu.enabled = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ShareAlert$$ExternalSyntheticLambda13(5, this, tL_attachMenuBot), 66);
    }

    public void lambda$onWriteButtonPressed$42(boolean z, int i, int i2) {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(z, i, 0, this.effectId, isCaptionAbove());
        } else {
            if (attachAlertLayout.sendSelectedItems(z, i, i2, 0L, isCaptionAbove())) {
                return;
            }
            this.allowPassConfirmationAlert = true;
            lambda$showGiftOfferSheet$15();
        }
    }

    public void lambda$openAttachLayoutForType$48(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        ((ChatActivity) this.baseFragment).didSelectLocation(messageMedia, i, z, i2, j);
    }

    public void lambda$openAudioLayout$54(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate = this.audioSelectDelegate;
        if (audioSelectDelegate != null) {
            audioSelectDelegate.didSelectAudio(arrayList, charSequence, z, i, i2, j, z2, j2);
            return;
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null && (baseFragment instanceof ChatActivity)) {
            ((ChatActivity) baseFragment).sendAudio(arrayList, charSequence, z, i, i2, j, z2, j2);
            return;
        }
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.sendAudio(arrayList, charSequence, z, i, i2, j, z2, j2);
        }
    }

    public void lambda$openColorsLayout$55(Object obj) {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.onWallpaperSelected(obj);
        }
    }

    public void lambda$sendPressed$47(boolean z, int i, int i2, long j, boolean z2, Long l) {
        setButtonPressed(true);
        this.delegate.didPressedButton(7, true, z, i, i2, j, z2, false, l.longValue());
    }

    public void lambda$setCaptionAbove$73(ValueAnimator valueAnimator) {
        updatedTopCaptionHeight();
    }

    public void lambda$setCaptionAbove$74(boolean z, boolean z2) {
        if (!z || !z2) {
            this.topCommentContainer.setVisibility(8);
        }
        updatedTopCaptionHeight();
    }

    public void lambda$setCaptionAbove$75(ValueAnimator valueAnimator) {
        this.frameLayout2.invalidate();
    }

    public void lambda$setCaptionAbove$76(boolean z, boolean z2) {
        if (z || !z2) {
            this.captionContainer.setVisibility(8);
        }
    }

    public void lambda$setCaptionAbove$77() {
        EditTextEmoji editTextEmoji = this.captionAbove ? this.topCommentTextView : this.commentTextView;
        showAiButton(editTextEmoji.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(editTextEmoji.getText().toString().trim()));
    }

    public void lambda$setTypeButtonsHidden$66(boolean z) {
        if (z) {
            this.buttonsRecyclerViewWrapper.setVisibility(4);
        }
    }

    public void lambda$showAiButton$67(boolean z) {
        if (z) {
            return;
        }
        this.aiButton.setVisibility(8);
    }

    public void lambda$showAiButton$68(boolean z) {
        if (z) {
            return;
        }
        this.topAiButton.setVisibility(8);
    }

    public void lambda$showCaptionLimitBulletin$43(BaseFragment baseFragment) {
        dismiss(true);
        if (baseFragment != null) {
            baseFragment.presentFragment(new PremiumPreviewFragment("caption_limit"));
        }
    }

    public void lambda$showCommentTextView$56(ValueAnimator valueAnimator) {
        updatedTopCaptionHeight();
    }

    public void lambda$showLayout$50() {
        AttachAlertLayout attachAlertLayout;
        ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview;
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
        setCaptionAbove(this.captionAbove, false);
        updateDoneItemEnabled();
    }

    public void lambda$showLayout$51(float f, float f2, boolean z, DynamicAnimation dynamicAnimation, float f3, float f4) {
        float f5 = f3 / 500.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(f5));
        this.actionBar.setAlpha(AndroidUtilities.lerp(f, f2, f5));
        updateLayout(this.currentAttachLayout, false, 0);
        updateLayout(this.nextAttachLayout, false, 0);
        if (!(this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || z) {
            f5 = 1.0f - f5;
        }
        float fClamp = Utilities.clamp(f5, 1.0f, 0.0f);
        this.mediaPreviewView.setAlpha(fClamp);
        float f6 = 1.0f - fClamp;
        this.selectedView.setAlpha(f6);
        this.selectedView.setTranslationX(fClamp * (-AndroidUtilities.dp(16.0f)));
        this.mediaPreviewView.setTranslationX(f6 * AndroidUtilities.dp(16.0f));
    }

    public void lambda$showLayout$52(boolean z, Runnable runnable, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        this.currentAttachLayout.onHideShowProgress(1.0f);
        this.nextAttachLayout.onHideShowProgress(1.0f);
        this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.nextAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.containerView.invalidate();
        this.actionBar.setTag(z ? 1 : null);
        runnable.run();
    }

    public void lambda$showLayout$53(AttachAlertLayout attachAlertLayout, final Runnable runnable) {
        final boolean z = this.nextAttachLayout.getCurrentItemTop() <= attachAlertLayout.getButtonsHideOffset();
        float alpha = this.actionBar.getAlpha();
        float f = z ? 1.0f : 0.0f;
        SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.0f));
        springAnimation.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda24(this, alpha, f, z));
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3) {
                this.f$0.lambda$showLayout$52(z, runnable, dynamicAnimation, z2, f2, f3);
            }
        });
        SpringForce springForce = new SpringForce(500.0f);
        springAnimation.mSpring = springForce;
        springForce.setDampingRatio(1.0f);
        springAnimation.mSpring.setStiffness(1000.0f);
        springAnimation.start();
        this.viewChangeAnimator = springAnimation;
    }

    public void lambda$showMotionHint$64(HintView2 hintView2) {
        this.containerView.removeView(hintView2);
    }

    public void lambda$showPollLayout$49(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i, long j) {
        ((ChatActivity) this.baseFragment).sendPoll((TLRPC.TL_messageMediaPoll) messageMedia, charSequence, pollAttachedMediaPack, arrayList, z, i, j);
    }

    public void lambda$updateMotionItem$63(boolean z) {
        if (z) {
            return;
        }
        this.motionItem.setVisibility(8);
    }

    public void onCurrentLayoutAnimatorChanged(ReplaceAnimator replaceAnimator) {
        onCurrentLayoutAnimatorChanged();
    }

    private void onWriteButtonPressed() {
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
                AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.baseFragment).getDialogId(), new ChatAttachAlert$$ExternalSyntheticLambda1(this, 3), this.resourcesProvider);
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
            lambda$showGiftOfferSheet$15();
        }
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
            this.audioLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 8));
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
                public void didSelectContacts(ArrayList<TLRPC.User> arrayList, String str, boolean z, int i, long j, boolean z2, long j2) {
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
                public void didSelectFiles(ArrayList<String> arrayList, String str, ArrayList<TLRPC.MessageEntity> arrayList2, ArrayList<MessageObject> arrayList3, boolean z3, int i2, int i3, long j, boolean z4, long j2) {
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
                public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z3, int i2, int i3, long j) {
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
            if (i >= attachAlertLayoutArr.length) {
                updateActionBarVisibility(false, false);
                super.dismissInternal();
                return;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onDestroy();
                this.containerView.removeView(this.layouts[i]);
                this.layouts[i] = null;
            }
            i++;
        }
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
        if (this.animatorEphemeralMessageVisibility.value) {
            setButtonPressed(true);
            this.delegate.didPressedButton(7, true, z, i, i2, j, z2, false, 0L);
            return true;
        }
        int i3 = this.currentAccount;
        long dialogId = getDialogId();
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        return AlertsCreator.ensurePaidMessageConfirmation(i3, dialogId, getAdditionalMessagesCount() + (attachAlertLayout != null ? attachAlertLayout.getSelectedItemsCount() : 1), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlert chatAttachAlert = this.f$0;
                int i4 = i2;
                long j2 = j;
                chatAttachAlert.lambda$sendPressed$47(z, i, i4, j2, z2, (Long) obj);
            }
        });
    }

    private void setNavBarAlpha(float f) {
        int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), Math.min(255, Math.max(0, (int) (f * 255.0f))));
        this.navBarColor = alphaComponent;
        AndroidUtilities.setNavigationBarColor((Dialog) this, alphaComponent, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    public void showAiButton(boolean z) {
        boolean z2;
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
        viewPropertyAnimatorScaleY.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new ChatAttachAlert$$ExternalSyntheticLambda8(this, z2, 2)).start();
        this.topAiButton.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new ChatAttachAlert$$ExternalSyntheticLambda8(this, z2, 3)).start();
        if (z2) {
            ImageView imageView = this.aiButton;
            AiButtonDrawable aiButtonDrawable = this.aiButtonIcon;
            Objects.requireNonNull(aiButtonDrawable);
            imageView.postDelayed(new AiButtonDrawable$$ExternalSyntheticLambda0(aiButtonDrawable, 1), 220L);
            ImageView imageView2 = this.topAiButton;
            AiButtonDrawable aiButtonDrawable2 = this.topAiButtonIcon;
            Objects.requireNonNull(aiButtonDrawable2);
            imageView2.postDelayed(new AiButtonDrawable$$ExternalSyntheticLambda0(aiButtonDrawable2, 1), 220L);
        }
    }

    public void showCaptionLimitBulletin(BaseFragment baseFragment) {
        if ((baseFragment instanceof ChatActivity) && ChatObject.isChannelAndNotMegaGroup(((ChatActivity) baseFragment).getCurrentChat())) {
            BulletinFactory.of(this.sizeNotifierFrameLayout, this.resourcesProvider).createCaptionLimitBulletin(MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium, new FilterGLThread$$ExternalSyntheticLambda7(8, this, (ChatActivity) baseFragment)).show();
        }
    }

    private boolean showCommentTextView(final boolean z, boolean z2) {
        float f;
        AttachAlertLayout attachAlertLayout;
        this.animatorCaptionVisible.setValue(z, true);
        int i = 0;
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
                valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda20(this, i));
                arrayList.add(valueAnimatorOfFloat);
            }
            this.commentsAnimator.playTogether(arrayList);
            this.commentsAnimator.setInterpolator(new DecelerateInterpolator());
            this.commentsAnimator.setDuration(180L);
            this.commentsAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        if (z) {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.typeButtonsAvailable && (chatAttachAlert.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons())) {
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(4);
                            }
                        } else {
                            if (!ChatAttachAlert.this.isSoundPicker) {
                                ChatAttachAlert.this.frameLayout2.setVisibility(4);
                            }
                            ChatAttachAlert.this.writeButtonContainer.setVisibility(4);
                        }
                        if (z3) {
                            ChatAttachAlert.this.updatedTopCaptionHeight();
                            ChatAttachAlert.this.topCommentContainer.setVisibility(z ? 0 : 8);
                        }
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
        this.writeButton.setStarsPrice(this.editingMessageObject != null ? 0L : MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(getDialogId()), getAdditionalMessagesCount() + this.currentAttachLayout.getSelectedItemsCount());
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

    private void showMotionHint(boolean z) {
        HintView2 hintView2 = this.motionHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        HintView2 hintView3 = new HintView2(getContext(), 1);
        this.motionHint = hintView3;
        hintView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(z ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        this.motionHint.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.motionHint.setJointPx(1.0f, -((this.containerView.getWidth() - ((this.motionItem.getWidth() / 2.0f) + this.motionItem.getX())) - AndroidUtilities.dp(14.0f)));
        this.motionHint.setTranslationY(this.selectedMenuItem.getTranslationY());
        this.motionHint.setOnHiddenListener(new FilterGLThread$$ExternalSyntheticLambda7(7, this, hintView3));
        this.containerView.addView(this.motionHint, LayoutHelper.createFrame(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        this.motionHint.show();
    }

    private void showPollLayout(boolean z, Boolean bool) {
        ChatAttachAlert chatAttachAlert;
        if (this.pollLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            chatAttachAlert = this;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(chatAttachAlert, getContext(), false, this.resourcesProvider, bool);
            chatAttachAlert.pollLayout = chatAttachAlertPollLayout;
            attachAlertLayoutArr[1] = chatAttachAlertPollLayout;
            chatAttachAlertPollLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 6));
        } else {
            chatAttachAlert = this;
        }
        showLayout(chatAttachAlert.pollLayout, 9L, z);
    }

    private void toggleCaptionAbove() {
        setCaptionAbove(!this.captionAbove);
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
                public void onAnimationCancel(Animator animator) {
                    ChatAttachAlert.this.actionBarAnimation = null;
                }

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

    private void updateMotionItem(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null || this.motionIcon == null) {
            return;
        }
        boolean z2 = this.menuShowed && this.allowLivePhotos && this.currentAttachLayout == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.hasLivePhotos();
        this.motionIcon.setDisabled(true ^ this.photoLayout.areLivePhotosEnabled(), z);
        if (z && this.menuShowed) {
            this.motionItem.setVisibility(0);
            this.motionItem.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new ChatAttachAlert$$ExternalSyntheticLambda8(this, z2, 0)).start();
        } else {
            this.motionItem.setVisibility(z2 ? 0 : 8);
            this.motionItem.setAlpha(z2 ? 1.0f : 0.0f);
            this.motionItem.setScaleX(z2 ? 1.0f : 0.6f);
            this.motionItem.setScaleY(z2 ? 1.0f : 0.6f);
        }
    }

    public void updateSelectedPosition(int i) {
        int i2;
        float translationY;
        float f;
        float translationY2;
        float translationY3;
        float fMax;
        int i3;
        float f2 = this.animatorActionBarVisible.floatValue;
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
        float f3 = 1.0f;
        float f4 = 1.0f - f2;
        this.cornerRadius = f4;
        if (AndroidUtilities.isTablet()) {
            i2 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i2 = point.x > point.y ? 6 : 12;
        }
        float fDp = this.actionBar.getAlpha() != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - this.headerView.getAlpha()) * 26.0f);
        if (this.menuShowed && this.avatarPicker == 0 && !this.storyMediaPicker) {
            this.selectedMenuItem.setTranslationY(Math.max((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i2 + 37), ((scrollOffsetY - AndroidUtilities.dp((i2 * f2) + 37.0f)) + fDp) - (this.topCommentContainer.getAlpha() * this.topCommentContainer.getMeasuredHeight())) + this.currentPanTranslationY);
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
        float fDp2 = ((((scrollOffsetY - AndroidUtilities.dp((i2 * f2) + 25.0f)) + fDp) + this.currentPanTranslationY) + translationY) - (this.topCommentContainer.getAlpha() * this.topCommentContainer.getMeasuredHeight());
        this.baseSelectedTextViewTranslationY = fDp2;
        this.headerView.setTranslationY(Math.max(this.currentPanTranslationY, fDp2));
        this.topCommentContainer.setTranslationY(Math.max(ActionBar.getCurrentActionBarHeight() + this.currentPanTranslationY, (this.headerView.getAlpha() * AndroidUtilities.dp(26.0f)) + this.baseSelectedTextViewTranslationY + AndroidUtilities.dp(8.0f)));
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
                translationY2 = (chatAttachAlertPollLayout.getTranslationY() + getScrollOffsetY(1)) - AndroidUtilities.dp(((i3 * f2) + 7.0f) - (f4 * 12.0f));
                f = this.translationProgress;
            } else if (chatAttachAlertPollLayout == this.currentAttachLayout) {
                translationY2 = (chatAttachAlertPollLayout.getTranslationY() + getScrollOffsetY(0)) - AndroidUtilities.dp(((i3 * f2) + 7.0f) - (f4 * 12.0f));
                f = this.nextAttachLayout == null ? 1.0f : 1.0f - this.translationProgress;
            } else {
                f = 0.0f;
                translationY2 = 0.0f;
            }
        }
        if (this.todoLayout == null) {
            translationY3 = 0.0f;
            f3 = 0.0f;
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
                float translationY4 = (chatAttachAlertPollLayout2.getTranslationY() + getScrollOffsetY(1)) - AndroidUtilities.dp(((i4 * f2) + 7.0f) - (f4 * 12.0f));
                f3 = this.translationProgress;
                translationY3 = translationY4;
            } else if (chatAttachAlertPollLayout2 == this.currentAttachLayout) {
                translationY3 = (chatAttachAlertPollLayout2.getTranslationY() + getScrollOffsetY(0)) - AndroidUtilities.dp(((i4 * f2) + 7.0f) - (f4 * 12.0f));
                if (this.nextAttachLayout != null) {
                    f3 = 1.0f - this.translationProgress;
                }
            } else {
                translationY3 = 0.0f;
                f3 = 0.0f;
            }
        }
        if (this.doneItem != null) {
            int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - this.doneItem.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
            TextView textView = this.doneItem;
            if (f <= 0.0f || f3 <= 0.0f) {
                if (f <= 0.0f) {
                    translationY2 = 0.0f;
                }
                if (f3 <= 0.0f) {
                    translationY3 = 0.0f;
                }
                fMax = Math.max(translationY2, translationY3);
            } else {
                fMax = AndroidUtilities.lerp(translationY2, translationY3, f3);
            }
            textView.setTranslationY(Math.max(0.0f, fMax) + this.currentPanTranslationY);
            this.doneItem.setTranslationX(-((measuredWidth * f4) + AndroidUtilities.dp((7.0f * f4) + 12.0f)));
        }
        this.doneItemAlphaByLayout = Math.max(f3, f);
        checkUi_doneItemVisibility();
    }

    public void updatedTopCaptionHeight() {
        int alpha = 0;
        updateSelectedPosition(0);
        this.sizeNotifierFrameLayout.invalidate();
        this.topCommentContainer.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.checkCameraViewPosition();
            RecyclerListView recyclerListView = this.photoLayout.gridView;
            if (recyclerListView != null && recyclerListView.getFastScroll() != null) {
                RecyclerListView.FastScroll fastScroll = this.photoLayout.gridView.getFastScroll();
                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + this.photoLayout.listAdditionalH;
                if (this.captionAbove) {
                    alpha = (int) (this.topCommentContainer.getAlpha() * this.topCommentContainer.getMeasuredHeight());
                }
                fastScroll.topOffset = currentActionBarHeight + alpha;
                this.photoLayout.gridView.getFastScroll().invalidate();
            }
        }
        updateCommentTextViewPosition();
        checkUi_writeButtonContainerY();
    }

    public void applyCaption() {
        if (getCommentView().length() <= 0) {
            return;
        }
        this.currentAttachLayout.applyCaption(getCommentView().getText());
    }

    public void avatarFor(ImageUpdater.AvatarFor avatarFor) {
        this.setAvatarFor = avatarFor;
    }

    public void blur3_InvalidateBlur() {
        boolean z;
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        ViewPositionWatcher.computeRectInParent(this.buttonsRecyclerViewWrapper, this.containerView, this.iBlur3PositionMainTabs);
        this.iBlur3PositionActionBar.set(0.0f, 0.0f, this.containerView.getMeasuredWidth(), this.actionBar.getMeasuredHeight());
        this.iBlur3PositionActionBar.inset(0.0f, -AndroidUtilities.dp(48.0f));
        this.iBlur3PositionMainTabs.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, getEmojiPadding())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
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
        this.scrollableViewNoiseSuppressor.setupRenderNodes(FBool.mergeOverlapping(this.iBlur3Positions, this.iBlur3PositionsMerged, z ? 3 : 2), this.iBlur3PositionsMerged);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    @Override
    public boolean canDismiss() {
        return true;
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public boolean canDismissWithTouchOutside() {
        return this.currentAttachLayout.canDismissWithTouchOutside();
    }

    @Override
    public void cancelSheetAnimation() {
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

    public boolean checkCanRemoveRestrictionsByBoosts() {
        BaseFragment baseFragment = this.baseFragment;
        return (baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).checkCanRemoveRestrictionsByBoosts();
    }

    public boolean checkCaption(CharSequence charSequence) {
        BaseFragment baseFragment = this.baseFragment;
        if (!(baseFragment instanceof ChatActivity)) {
            return false;
        }
        return ChatActivityEnterView.checkPremiumAnimatedEmoji(this.currentAccount, ((ChatActivity) baseFragment).getDialogId(), this.baseFragment, this.sizeNotifierFrameLayout, charSequence);
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
        Theme.setDrawableColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector), this.selectedMenuItem.getBackground());
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
            Theme.setDrawableColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector), this.searchItem.getBackground());
        }
        this.commentTextView.updateColors();
        this.buttonsRecyclerView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.actionBar.setItemsColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector), false);
        this.actionBar.setTitleColor(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        int shadowDrawableColor = getShadowDrawableColor();
        Theme.setDrawableColor(shadowDrawableColor, this.shadowDrawable);
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
        if (Build.VERSION.SDK_INT < 30) {
            fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(Theme.key_dialogBackgroundGray);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(Theme.key_dialogBackground), false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
    }

    public void checkUi_moveCaptionButtonVisibility() {
        FragmentFloatingButton.setAnimatedVisibility(this.moveCaptionButton, MediaController$$ExternalSyntheticOutline0.m(this.animatorCaptionNotEmpty.floatValue, this.animatorToggleCaptionSupported.floatValue, FBool.not(this.animatorEphemeralMessageVisibility.floatValue), this.restrictEphemeralMessageTypes ? 0.0f : 1.0f));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.reloadInlineHints && i != NotificationCenter.attachMenuBotsDidLoad && i != NotificationCenter.quickRepliesUpdated) {
            if (i == NotificationCenter.currentUserPremiumStatusChanged) {
                this.currentLimit = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            ButtonsAdapter buttonsAdapter = this.buttonsAdapter;
            if (buttonsAdapter != null) {
                buttonsAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public void dismiss(boolean z) {
        if (z) {
            this.allowPassConfirmationAlert = z;
        }
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public void dismissInternal() {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.doOnIdle(new ChatAttachAlert$$ExternalSyntheticLambda12(this, 0));
        } else {
            removeFromRoot();
        }
    }

    @Override
    public void dismissWithButtonClick(int i) {
        super.dismissWithButtonClick(i);
        this.currentAttachLayout.onDismissWithButtonClick(i);
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

    public void enableStickerMode(Utilities.Callback2<String, TLRPC.InputDocument> callback2) {
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

    public int getAdditionalMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        BaseFragment baseFragment = this.baseFragment;
        if (!(baseFragment instanceof ChatActivity) || (messagePreviewParams = ((ChatActivity) baseFragment).messagePreviewParams) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public ImageUpdater.AvatarFor getAvatarFor() {
        return this.setAvatarFor;
    }

    public BaseFragment getBaseFragment() {
        return this.baseFragment;
    }

    public TLRPC.Chat getChat() {
        BaseFragment baseFragment = this.baseFragment;
        return baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getCurrentChat() : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
    }

    public float getClipLayoutBottom() {
        return this.frameLayout2.getMeasuredHeight() - ((1.0f - this.frameLayout2.getAlpha()) * (this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public EditTextEmoji getCommentTextView() {
        return this.commentTextView;
    }

    public int getCommentTextViewTop() {
        return this.commentTextViewLocation[1];
    }

    public EditTextEmoji getCommentView() {
        AttachAlertLayout attachAlertLayout;
        return (this.captionAbove && ((attachAlertLayout = this.currentAttachLayout) == this.photoLayout || attachAlertLayout == this.photoPreviewLayout)) ? this.topCommentTextView : this.commentTextView;
    }

    public AttachAlertLayout getCurrentAttachLayout() {
        return this.currentAttachLayout;
    }

    public long getDialogId() {
        BaseFragment baseFragment = this.baseFragment;
        return baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getDialogId() : this.dialogId;
    }

    public ChatAttachAlertDocumentLayout getDocumentLayout() {
        return this.documentLayout;
    }

    public MessageObject getEditingMessageObject() {
        return this.editingMessageObject;
    }

    public ChatAttachAlertLocationLayout getLocationLayout() {
        return this.locationLayout;
    }

    public ChatAttachAlertPhotoLayout getPhotoLayout() {
        return this.photoLayout;
    }

    public ChatAttachAlertPhotoLayoutPreview getPhotoPreviewLayout() {
        return this.photoPreviewLayout;
    }

    public TextView getSelectedTextView() {
        return this.selectedTextView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions;
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                arrayList.add(new ThemeDescription(this.container, 0, null, null, null, null, Theme.key_dialogBackgroundGray));
                return arrayList;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null && (themeDescriptions = attachAlertLayout.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i++;
        }
    }

    public int getTypeButtonsHeight() {
        if (this.typeButtonsAvailable) {
            return AndroidUtilities.dp(62.0f);
        }
        return 0;
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
            this.botAttachLayouts.valueAt(i).setMeasureOffsetY(0);
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
                    chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 0));
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

    public boolean isCaptionAbove() {
        if (!this.captionAbove) {
            return false;
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        return attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout;
    }

    public void makeFocusable(EditTextBoldCursor editTextBoldCursor, boolean z) {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate == null || this.enterCommentEventSent) {
            return;
        }
        boolean zNeedEnterComment = chatAttachViewDelegate.needEnterComment();
        this.enterCommentEventSent = true;
        AndroidUtilities.runOnUIThread(new MediaActivity$$ExternalSyntheticLambda0(this, editTextBoldCursor, z, 3), zNeedEnterComment ? 200L : 0L);
    }

    public void onActivityResultFragment(int i, Intent intent, String str) {
        this.photoLayout.onActivityResultFragment(i, intent, str);
    }

    @Override
    public void lambda$openCrafting$8() {
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
            if (getCommentView() == null || !getCommentView().isPopupShowing()) {
                super.lambda$openCrafting$8();
            } else {
                getCommentView().hidePopup(true);
            }
        }
    }

    @Override
    public boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.currentAttachLayout.onContainerViewTouchEvent(motionEvent);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            AndroidUtilities.setLightStatusBar(this, baseFragment.isLightStatusBar());
        }
    }

    @Override
    public boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        return this.photoLayout.onCustomLayout(view, i, i2, i3, i4);
    }

    @Override
    public boolean onCustomMeasure(View view, int i, int i2) {
        return this.photoLayout.onCustomMeasure(view, i, i2);
    }

    @Override
    public boolean onCustomOpenAnimation() {
        int i = 3;
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda20(this, i));
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        if (this.editingMessageObject != null) {
            springAnimation2.mSpring.setDampingRatio(0.75f);
            this.appearSpringAnimation.mSpring.setStiffness(350.0f);
        } else {
            springAnimation2.mSpring.setDampingRatio(0.75f);
            this.appearSpringAnimation.mSpring.setStiffness(350.0f);
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
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        final ImageUpdater$$ExternalSyntheticLambda1 imageUpdater$$ExternalSyntheticLambda1 = new ImageUpdater$$ExternalSyntheticLambda1(this, animationNotificationsLocker, super.delegate, 17);
        this.appearSpringAnimation.addEndListener(new PasscodeView$$ExternalSyntheticLambda12(i, this, imageUpdater$$ExternalSyntheticLambda1));
        this.currentSheetAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimation == null || !((BottomSheet) ChatAttachAlert.this).currentSheetAnimation.equals(animator)) {
                    return;
                }
                ((BottomSheet) ChatAttachAlert.this).currentSheetAnimation = null;
                ((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType = 0;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimation == null || !((BottomSheet) ChatAttachAlert.this).currentSheetAnimation.equals(animator) || ChatAttachAlert.this.appearSpringAnimation == null || ChatAttachAlert.this.appearSpringAnimation.mRunning) {
                    return;
                }
                imageUpdater$$ExternalSyntheticLambda1.run();
            }
        });
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        setNavBarAlpha(0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda20(this, 4));
        valueAnimatorOfFloat2.setStartDelay(25L);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.DEFAULT);
        valueAnimatorOfFloat2.start();
        return true;
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
    public void onDismissWithTouchOutside() {
        if (this.currentAttachLayout.onDismissWithTouchOutside()) {
            lambda$showGiftOfferSheet$15();
        }
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
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

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.currentAttachLayout.onSheetKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLongClickBotButton(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
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
        AlertDialog.Builder title = new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.BotRemoveFromMenuTitle));
        if (tL_attachMenuBot == null) {
            string = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        title.setMessage(AndroidUtilities.replaceTags(string)).setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertsCreator$$ExternalSyntheticLambda201(this, tL_attachMenuBot, user, 8)).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).show();
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

    public void onOpenAnimationStart() {
        this.sent = false;
    }

    public void onPause() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                this.paused = true;
                return;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onPause();
            }
            i++;
        }
    }

    public void onPollAttachFilePicker(Intent intent) {
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
        if (chatAttachAlertPollLayout != null) {
            chatAttachAlertPollLayout.onPollAttachFilePicker(intent);
        }
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout;
        if (i == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            openContactsLayout();
        } else if (i == 30 && (chatAttachAlertLocationLayout = this.locationLayout) != null && this.currentAttachLayout == chatAttachAlertLocationLayout && isShowing()) {
            this.locationLayout.openShareLiveLocation();
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
    public void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).removeOverlayPasscodeView(this.passcodeView);
        }
    }

    public void openAttachLayoutForType(int i) {
        if (i != 3) {
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
                        chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 7));
                    }
                }
                showLayout(this.locationLayout);
                return;
            }
            return;
        }
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
        }
    }

    public void openColorsLayout() {
        if (this.colorsLayout == null) {
            ChatAttachAlertColorsLayout chatAttachAlertColorsLayout = new ChatAttachAlertColorsLayout(this, getContext(), this.resourcesProvider);
            this.colorsLayout = chatAttachAlertColorsLayout;
            chatAttachAlertColorsLayout.setDelegate(new Bulletin$$ExternalSyntheticLambda6(this, 1));
        }
        showLayout(this.colorsLayout);
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

    public void setAllowEnterCaption(boolean z) {
        this.allowEnterCaption = z;
    }

    @Override
    public void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
    }

    public void setAudioSelectDelegate(ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate) {
        this.audioSelectDelegate = audioSelectDelegate;
    }

    public void setAvatarPicker(int i, boolean z, Utilities.Callback0Return<PhotoViewer.PlaceProviderObject> callback0Return) {
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

    public void setBusinessLocationPicker() {
        this.isBizLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
    }

    public void setButtonPressed(boolean z) {
        this.buttonPressed = z;
    }

    public void setCanOpenPreview(boolean z) {
        this.canOpenPreview = z;
        this.selectedArrowImageView.setVisibility((!z || this.avatarPicker == 2) ? 8 : 0);
    }

    public void setCaptionAbove(boolean z) {
        setCaptionAbove(z, true);
    }

    public void setDelegate(ChatAttachViewDelegate chatAttachViewDelegate) {
        this.delegate = chatAttachViewDelegate;
    }

    public void setDialogId(long j) {
        this.dialogId = j;
    }

    public void setDocumentsDelegate(ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentSelectActivityDelegate) {
        this.documentsDelegate = documentSelectActivityDelegate;
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

    public void setEmojiViewDelegate(EmojiView.EmojiViewDelegate emojiViewDelegate) {
        this.emojiViewDelegate = emojiViewDelegate;
    }

    public void setImageUpdater(ImageUpdater imageUpdater) {
        this.parentImageUpdater = imageUpdater;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public void setLocationActivityDelegate(ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate) {
        this.locationActivityDelegate = locationActivityDelegate;
    }

    public void setLocationPicker() {
        this.isLocationPicker = true;
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

    public void setSoundPicker() {
        this.isSoundPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
    }

    public void setStories(boolean z) {
        this.stories = z;
    }

    public void setStoryAudioPicker() {
        this.isStoryAudioPicker = true;
    }

    public void setStoryLocationPicker() {
        this.isStoryLocationPicker = true;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
    }

    public void setStoryMediaPicker() {
        this.storyMediaPicker = true;
        this.typeButtonsAvailable = false;
        this.selectedTextView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
    }

    public void setTypeButtonsHidden(boolean z, boolean z2) {
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
                this.buttonsRecyclerViewWrapper.animate().alpha(z ? 0.0f : 1.0f).translationY(z ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new ChatAttachAlert$$ExternalSyntheticLambda8(this, z, 1)).start();
                return;
            }
            this.buttonsRecyclerViewWrapper.setAlpha(z ? 0.0f : 1.0f);
            this.buttonsRecyclerViewWrapper.setTranslationY(z ? AndroidUtilities.dp(48.0f) : 0.0f);
            this.buttonsRecyclerViewWrapper.setVisibility(z ? 4 : 0);
        }
    }

    public void setupMentionContainer(MentionsContainerView mentionsContainerView) {
        mentionsContainerView.getAdapter().allowStickers = false;
        mentionsContainerView.getAdapter().allowBots = false;
        mentionsContainerView.getAdapter().allowChats = false;
        if (this.baseFragment instanceof ChatActivity) {
            mentionsContainerView.getAdapter().searchInDialogs = false;
            ChatActivity chatActivity = (ChatActivity) this.baseFragment;
            MentionsAdapter adapter = mentionsContainerView.getAdapter();
            chatActivity.getCurrentUser();
            TLRPC.Chat currentChat = chatActivity.getCurrentChat();
            adapter.getClass();
            adapter.chat = currentChat;
            mentionsContainerView.getAdapter().setChatInfo(chatActivity.getCurrentChatInfo());
            mentionsContainerView.getAdapter().needUsernames = chatActivity.getCurrentChat() != null;
        } else {
            mentionsContainerView.getAdapter().searchInDialogs = true;
            mentionsContainerView.getAdapter().setChatInfo(null);
            mentionsContainerView.getAdapter().needUsernames = false;
        }
        mentionsContainerView.getAdapter().needBotContext = false;
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

    public void setupPoll(Boolean bool) {
        this.typeButtonsAvailable = false;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        showPollLayout(false, bool);
    }

    @Override
    public boolean shouldOverlayCameraViewOverNavBar() {
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

    public void showBotLayout(long j, boolean z) {
        showBotLayout(j, null, false, z);
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
                public void onAnimationCancel(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        if (z) {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.typeButtonsAvailable && (chatAttachAlert.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons())) {
                                ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(4);
                            }
                        } else {
                            ChatAttachAlert.this.writeButtonContainer.setVisibility(4);
                        }
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

    public void updateCommentTextViewPosition() {
        float alpha;
        this.commentTextView.getLocationOnScreen(this.commentTextViewLocation);
        if (this.mentionContainer != null) {
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            if ((attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) && this.captionAbove) {
                alpha = (this.topCommentContainer.getAlpha() * this.topCommentContainer.getMeasuredHeight()) + (this.topCommentContainer.getY() - this.mentionContainer.getTop());
            } else {
                alpha = -this.commentTextView.getHeight();
            }
            if (Math.abs(this.mentionContainer.getTranslationY() - alpha) > 0.5f) {
                this.mentionContainer.setTranslationY(alpha);
                this.mentionContainer.invalidate();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.checkCameraViewPosition();
                }
            }
        }
        checkUi_writeButtonContainerY();
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
            if (showCommentTextView(true, i != 0) || i == 0) {
                this.writeButton.setCount(selectedItemsCount, i != 0);
                this.writeButton.bounceCount();
            } else {
                this.writeButton.setCount(selectedItemsCount, true);
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
                        if (ChatAttachAlert.this.menuShowed) {
                            ActionBarMenuItem actionBarMenuItem3 = ChatAttachAlert.this.searchItem;
                            if (actionBarMenuItem3 != null) {
                                actionBarMenuItem3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (ChatAttachAlert.this.actionBar.getTag() == null) {
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (chatAttachAlert.avatarPicker == 0 && !chatAttachAlert.storyMediaPicker) {
                                chatAttachAlert.selectedMenuItem.setVisibility(4);
                            }
                        }
                        ChatAttachAlert.this.headerView.setVisibility(4);
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
        this.writeButton.setStarsPrice(sendPaidMessagesStars, getAdditionalMessagesCount() + (attachAlertLayout != null ? attachAlertLayout.getSelectedItemsCount() : 0));
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

    public void updateDoneItemEnabled() {
        TextView textView = this.doneItem;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        textView.setEnabled(attachAlertLayout == null ? false : attachAlertLayout.isDoneItemEnabled());
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        float fM = 0.0f;
        if (attachAlertLayout2 != null) {
            fM = 0.0f + ((attachAlertLayout2.isDoneItemEnabled() ? 1.0f : 0.5f) * (this.nextAttachLayout == null ? 1.0f : this.translationProgress));
        }
        AttachAlertLayout attachAlertLayout3 = this.nextAttachLayout;
        if (attachAlertLayout3 != null) {
            fM = DiffUtil.m(1.0f, this.translationProgress, attachAlertLayout3.isDoneItemEnabled() ? 1.0f : 0.5f, fM);
        }
        this.doneItemAlphaByEnabled = fM;
        checkUi_doneItemVisibility();
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
        int iM = zzkl.m(11.0f, layoutParams == null ? 0 : layoutParams.topMargin, currentItemTop);
        AttachAlertLayout attachAlertLayout3 = this.currentAttachLayout;
        int i2 = attachAlertLayout3 == attachAlertLayout ? 0 : 1;
        if ((attachAlertLayout3 instanceof ChatAttachAlertPhotoLayoutPreview) || (this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
            Object obj = this.viewChangeAnimator;
            if ((obj instanceof SpringAnimation) && ((SpringAnimation) obj).mRunning) {
                z2 = true;
            }
        }
        int[] iArr = this.scrollOffsetY;
        int i3 = iArr[i2];
        if (i3 == iM && !z2) {
            if (i != 0) {
                this.previousScrollOffsetY = i3;
            }
        } else {
            this.previousScrollOffsetY = i3;
            iArr[i2] = iM;
            updateSelectedPosition(i2);
            this.containerView.invalidate();
        }
    }

    public void updatePhotoPreview(boolean z) {
        if (!z) {
            showLayout(this.photoLayout);
            return;
        }
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
        }
    }

    public ChatAttachAlert(final Context context, final BaseFragment baseFragment, boolean z, boolean z2, boolean z3, final Theme.ResourcesProvider resourcesProvider) {
        TextView textView;
        int i;
        int i2;
        float f;
        super(context, false, false, resourcesProvider);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorCaptionAbove = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, false);
        this.animatorCaptionVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L, false);
        this.animatorActionBarVisible = new BoolAnimator(2, this, cubicBezierInterpolator, 380L, false);
        this.animatorCaptionNotEmpty = new BoolAnimator(3, this, cubicBezierInterpolator, 380L, false);
        this.animatorToggleCaptionSupported = new BoolAnimator(4, this, cubicBezierInterpolator, 380L, true);
        this.animatorEphemeralMessageVisibility = new BoolAnimator(5, this, cubicBezierInterpolator, 320L, false);
        ReplaceAnimator replaceAnimator = new ReplaceAnimator(new EmojiView$$ExternalSyntheticLambda11(this, 3), cubicBezierInterpolator, 380L);
        this.animatorCurrentVisibleLayout = replaceAnimator;
        this.canOpenPreview = false;
        this.isSoundPicker = false;
        this.isStoryLocationPicker = false;
        this.isBizLocationPicker = false;
        this.isLocationPicker = false;
        this.isStoryAudioPicker = false;
        this.translationProgress = 0.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION = new AnimationProperties.FloatProperty<AttachAlertLayout>("translation") {
            @Override
            public Float get(AttachAlertLayout attachAlertLayout) {
                return Float.valueOf(ChatAttachAlert.this.translationProgress);
            }

            @Override
            public void setValue(AttachAlertLayout attachAlertLayout, float f2) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.translationProgress = f2;
                if (chatAttachAlert.nextAttachLayout == null) {
                    return;
                }
                if ((ChatAttachAlert.this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                    int iMax = Math.max(ChatAttachAlert.this.nextAttachLayout.getWidth(), ChatAttachAlert.this.currentAttachLayout.getWidth());
                    if (ChatAttachAlert.this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX((-iMax) * f2);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((1.0f - f2) * iMax);
                    } else {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX(iMax * f2);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((1.0f - f2) * (-iMax));
                    }
                } else {
                    ChatAttachAlert.this.nextAttachLayout.setAlpha(f2);
                    ChatAttachAlert.this.nextAttachLayout.onHideShowProgress(f2);
                    if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout) {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.updateSelectedPosition(chatAttachAlert2.nextAttachLayout == ChatAttachAlert.this.pollLayout ? 1 : 0);
                    }
                    if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.todoLayout || ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.todoLayout) {
                        ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
                        chatAttachAlert3.updateSelectedPosition(chatAttachAlert3.nextAttachLayout == ChatAttachAlert.this.todoLayout ? 1 : 0);
                    }
                    ChatAttachAlert.this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) * f2);
                    ChatAttachAlert.this.currentAttachLayout.onHideShowProgress(1.0f - Math.min(1.0f, f2 / 0.7f));
                    ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                }
                if (ChatAttachAlert.this.viewChangeAnimator != null) {
                    ChatAttachAlert.this.updateSelectedPosition(1);
                }
                ChatAttachAlert.this.blur3_InvalidateBlur();
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }
        };
        this.allowLivePhotos = false;
        this.layouts = new AttachAlertLayout[11];
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
        int i3 = UserConfig.selectedAccount;
        this.currentAccount = i3;
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
        this.exclusionRects = new ArrayList<>();
        this.exclustionRect = new Rect();
        this.ATTACH_ALERT_PROGRESS = new AnimationProperties.FloatProperty<ChatAttachAlert>("openProgress") {
            private float openProgress;

            @Override
            public Float get(ChatAttachAlert chatAttachAlert) {
                return Float.valueOf(this.openProgress);
            }

            @Override
            public void setValue(ChatAttachAlert chatAttachAlert, float f2) {
                float interpolation;
                int childCount = ChatAttachAlert.this.buttonsRecyclerView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    float f3 = (3 - i4) * 32.0f;
                    View childAt = ChatAttachAlert.this.buttonsRecyclerView.getChildAt(i4);
                    if (f2 > f3) {
                        float f4 = f2 - f3;
                        if (f4 <= 200.0f) {
                            float f5 = f4 / 200.0f;
                            interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f5) * 1.1f;
                            childAt.setAlpha(CubicBezierInterpolator.EASE_BOTH.getInterpolation(f5));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f6 = f4 - 200.0f;
                            interpolation = f6 <= 100.0f ? 1.1f - (CubicBezierInterpolator.EASE_IN.getInterpolation(f6 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        interpolation = 0.0f;
                    }
                    if (childAt instanceof AttachButtonBase) {
                        ((AttachButtonBase) childAt).glassTabView.setAttachScale(interpolation);
                    }
                }
            }
        };
        this.allowDrawContent = true;
        this.sent = false;
        this.confirmationAlertShown = false;
        this.allowPassConfirmationAlert = false;
        ArrayList<RectF> arrayList = new ArrayList<>();
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
        this.iBlur3PositionsMerged = new ArrayList<>();
        this.occupyNavigationBarWithoutKeyboard = true;
        boolean z4 = baseFragment instanceof ChatActivity;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    Blur3HashImpl blur3HashImpl = (Blur3HashImpl) iBlur3Hash;
                    blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    ((Blur3HashImpl) iBlur3Hash).add(SharedConfig.chatBlurEnabled());
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
                    Blur3HashImpl blur3HashImpl = (Blur3HashImpl) iBlur3Hash;
                    blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, ChatAttachAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    ((Blur3HashImpl) iBlur3Hash).add(SharedConfig.chatBlurEnabled());
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
            blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
            this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryFrostedLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.iBlur3FactoryFade = blurredBackgroundDrawableViewFactory3;
        this.iBlur3Capture = new EmojiView$$ExternalSyntheticLambda27(this, 1);
        this.forceDarkTheme = z;
        this.showingFromDialog = z2;
        this.inBubbleMode = z4 && baseFragment.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.baseFragment = baseFragment;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i3).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i3).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i3).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i3).addObserver(this, NotificationCenter.quickRepliesUpdated);
        this.exclusionRects.add(this.exclustionRect);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
        this.sizeNotifierFrameLayout = anonymousClass5;
        anonymousClass5.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
            @Override
            public void onSizeChanged(int i4, boolean z5) {
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
        int i4 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i4, 0, i4, 0);
        ActionBar actionBar = new ActionBar(context, resourcesProvider) {
            @Override
            public void onFactorChangeFinished(int i5, float f2, FactorAnimator factorAnimator) {
            }

            @Override
            public void setAlpha(float f2) {
                float alpha = getAlpha();
                super.setAlpha(f2);
                if (alpha != f2) {
                    TextView textView2 = ChatAttachAlert.this.selectedTextView;
                    if (textView2 != null) {
                        float f3 = 1.0f - f2;
                        textView2.setAlpha(f3);
                        ChatAttachAlert.this.selectedTextView.setVisibility(f3 > 0.0f ? 0 : 8);
                    }
                    ChatAttachAlert.this.checkUi_fadeTopAlpha();
                    ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
                    if (ChatAttachAlert.this.frameLayout2 != null) {
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        if (chatAttachAlert.buttonsRecyclerViewWrapper != null) {
                            if (chatAttachAlert.frameLayout2.getTag() == null) {
                                if (ChatAttachAlert.this.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons()) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(1.0f - f2);
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setTranslationY(AndroidUtilities.dp(44.0f) * f2);
                                }
                                ChatAttachAlert.this.frameLayout2.setTranslationY(AndroidUtilities.dp(48.0f) * f2);
                                return;
                            }
                            if (ChatAttachAlert.this.currentAttachLayout == null) {
                                float f4 = f2 == 0.0f ? 1.0f : 0.0f;
                                if (ChatAttachAlert.this.buttonsRecyclerViewWrapper.getAlpha() != f4) {
                                    ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(f4);
                                }
                            }
                        }
                    }
                }
            }

            @Override
            public void setVisibility(int i5) {
                super.setVisibility(i5);
                ChatAttachAlert.this.checkUi_fadeTopAlpha();
            }
        };
        this.actionBar = actionBar;
        actionBar.alwaysApplyColorFilterToBackButton();
        this.actionBar.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        zzki.m(this.actionBar);
        ActionBar actionBar2 = this.actionBar;
        int i5 = Theme.key_dialogTextBlack;
        actionBar2.setItemsColor(getThemedColor(i5), false);
        ActionBar actionBar3 = this.actionBar;
        int i6 = Theme.key_dialogButtonSelector;
        actionBar3.setItemsBackgroundColor(getThemedColor(i6), false);
        this.actionBar.setTitleColor(getThemedColor(i5));
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setAlpha(0.0f);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i7) {
                if (i7 != -1) {
                    ChatAttachAlert.this.currentAttachLayout.onMenuItemClick(i7);
                } else {
                    if (ChatAttachAlert.this.currentAttachLayout.onBackPressed()) {
                        return;
                    }
                    ChatAttachAlert.this.lambda$showGiftOfferSheet$15();
                }
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
        final int i9 = 4;
        this.selectedMenuItem.setVisibility(4);
        this.selectedMenuItem.setAlpha(0.0f);
        this.selectedMenuItem.setScaleX(0.6f);
        this.selectedMenuItem.setScaleY(0.6f);
        this.selectedMenuItem.setSubMenuOpenSide(2);
        this.selectedMenuItem.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 14));
        this.selectedMenuItem.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        this.selectedMenuItem.setTranslationX(AndroidUtilities.dp(1.0f));
        this.selectedMenuItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i6), 6, -1));
        this.selectedMenuItem.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        this.f$0.lambda$new$16(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$17(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$22(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$26(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 6:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 7:
                        this.f$0.lambda$new$7(view);
                        break;
                    default:
                        this.f$0.lambda$new$8(view);
                        break;
                }
            }
        });
        ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem(context, null, 0, getThemedColor(i5), false, resourcesProvider);
        this.motionItem = actionBarMenuItem4;
        actionBarMenuItem4.setLongClickEnabled(false);
        ActionBarMenuItem actionBarMenuItem5 = this.motionItem;
        MotionPhotoDrawable motionPhotoDrawable = new MotionPhotoDrawable();
        this.motionIcon = motionPhotoDrawable;
        actionBarMenuItem5.setIcon(motionPhotoDrawable);
        this.motionItem.setContentDescription(LocaleController.getString(i8));
        this.motionItem.setVisibility(8);
        this.motionItem.setAlpha(0.0f);
        this.motionItem.setScaleX(0.6f);
        this.motionItem.setScaleY(0.6f);
        this.motionItem.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        this.motionItem.setTranslationX(-AndroidUtilities.dp(3.0f));
        this.motionItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i6), 6, -1));
        final int i10 = 5;
        this.motionItem.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f$0.lambda$new$16(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$17(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$22(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$26(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 6:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 7:
                        this.f$0.lambda$new$7(view);
                        break;
                    default:
                        this.f$0.lambda$new$8(view);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context) {
            Paint p = new Paint(1);

            @Override
            public void onDraw(Canvas canvas) {
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
        final int i11 = 6;
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f$0.lambda$new$16(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$17(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$22(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$26(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 6:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 7:
                        this.f$0.lambda$new$7(view);
                        break;
                    default:
                        this.f$0.lambda$new$8(view);
                        break;
                }
            }
        });
        ScaleStateListAnimator.apply(textView2);
        this.doneItem = textView2;
        updateDoneItemEnabled();
        if (baseFragment != null) {
            i2 = i5;
            textView = textView2;
            i = i6;
            f = 14.0f;
            ActionBarMenuItem actionBarMenuItem6 = new ActionBarMenuItem(context, null, 0, getThemedColor(i5), false, resourcesProvider);
            this.searchItem = actionBarMenuItem6;
            actionBarMenuItem6.setLongClickEnabled(false);
            this.searchItem.setIcon(R.drawable.outline_header_search);
            this.searchItem.setContentDescription(LocaleController.getString(R.string.Search));
            this.searchItem.setVisibility(4);
            this.searchItem.setAlpha(0.0f);
            this.searchItem.setTranslationX(-AndroidUtilities.dp(42.0f));
            this.searchItem.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i), 6, -1));
            this.searchItem.setOnClickListener(new PipVideoOverlay$$ExternalSyntheticLambda5(this, z2, 2));
        } else {
            textView = textView2;
            i = i6;
            i2 = i5;
            f = 14.0f;
        }
        int i12 = i2;
        ActionBarMenuItem actionBarMenuItem7 = new ActionBarMenuItem(context, null, 0, getThemedColor(i12), false, resourcesProvider);
        this.optionsItem = actionBarMenuItem7;
        actionBarMenuItem7.setLongClickEnabled(false);
        this.optionsItem.setIcon(i7);
        this.optionsItem.setContentDescription(LocaleController.getString(i8));
        this.optionsItem.setVisibility(8);
        this.optionsItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 3, -1));
        final int i13 = 2;
        this.optionsItem.addSubItem(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f$0.lambda$new$21(resourcesProvider, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$25(resourcesProvider, view);
                        break;
                    default:
                        this.f$0.lambda$new$6(resourcesProvider, view);
                        break;
                }
            }
        });
        this.optionsItem.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        this.optionsItem.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i14 = 7;
        this.optionsItem.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.f$0.lambda$new$16(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$17(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$22(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$26(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 6:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 7:
                        this.f$0.lambda$new$7(view);
                        break;
                    default:
                        this.f$0.lambda$new$8(view);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override
            public void setAlpha(float f2) {
                super.setAlpha(f2);
                ChatAttachAlert.this.updateSelectedPosition(0);
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }
        };
        this.headerView = frameLayout;
        final int i15 = 8;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.f$0.lambda$new$16(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$17(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$22(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$26(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 6:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 7:
                        this.f$0.lambda$new$7(view);
                        break;
                    default:
                        this.f$0.lambda$new$8(view);
                        break;
                }
            }
        });
        this.headerView.setAlpha(0.0f);
        this.headerView.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.selectedView = linearLayout;
        linearLayout.setOrientation(0);
        this.selectedView.setGravity(16);
        TextView textView3 = new TextView(context);
        this.selectedTextView = textView3;
        textView3.setTextColor(getThemedColor(i12));
        this.selectedTextView.setTextSize(1, 16.0f);
        this.selectedTextView.setTypeface(AndroidUtilities.bold());
        this.selectedTextView.setGravity(19);
        this.selectedTextView.setMaxLines(1);
        this.selectedTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.selectedView.addView(this.selectedTextView, LayoutHelper.createLinear(-2, -2, 16));
        this.selectedArrowImageView = new ImageView(context);
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i12);
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
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        imageView.setImageDrawable(drawableMutate2);
        this.mediaPreviewView.addView(imageView, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 4, 0));
        TextView textView4 = new TextView(context);
        this.mediaPreviewTextView = textView4;
        textView4.setTextColor(getThemedColor(i12));
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
        this.fadeView.setFadeZoneTop(AndroidUtilities.dp(5.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(this.fadeView, LayoutHelper.createFrameMatchParent());
        this.containerView.addView(this.headerView, LayoutHelper.createFrame(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            private final Path path = new Path();
            private final GradientClip clip = new GradientClip();

            @Override
            public void dispatchDraw(Canvas canvas) {
                float fDp = AndroidUtilities.dp(20.0f);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                this.path.rewind();
                this.path.addRoundRect(rectF4, fDp, fDp, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(this.path);
                canvas.saveLayerAlpha(rectF4, 255, 31);
                super.dispatchDraw(canvas);
                rectF4.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
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
            public void onMeasure(int i16, int i17) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (!chatAttachAlert.isPollAttach || chatAttachAlert.pollAllowedLayouts == 0) {
                    super.onMeasure(i16, i17);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i16), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(ChatAttachAlert.this.pollAllowedLayouts))), 1073741824), i17);
            }

            @Override
            public void setTranslationY(float f2) {
                super.setTranslationY(f2);
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
            public void dispatchDraw(Canvas canvas) {
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
                    canvas.translate(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.hasFadeLeft.floatValue, AndroidUtilities.dp(8.0f), fDp), 0.0f);
                    canvas.drawPaint(this.paintLeft);
                    canvas.restore();
                    canvas.restore();
                }
                if (z7) {
                    float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                    canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                    super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(DiffUtil.m(1.0f, this.hasFadeRight.floatValue, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                    canvas.drawPaint(this.paintRight);
                    canvas.restore();
                    canvas.restore();
                }
                return zDrawChild;
            }

            @Override
            public void onMeasure(int i16, int i17) {
                int childCount = getChildCount();
                int size = (View.MeasureSpec.getSize(i16) - getPaddingLeft()) - getPaddingRight();
                float fMin = 0.0f;
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt instanceof AttachButtonBase) {
                        float fMeasureTextWidth = ((AttachButtonBase) childAt).glassTabView.measureTextWidth();
                        fMin += Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), MathUtils.clamp((fMeasureTextWidth - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + fMeasureTextWidth));
                    }
                }
                float f2 = size;
                int iFloor = (f2 <= fMin || childCount <= 0) ? 0 : (int) Math.floor((f2 - fMin) / childCount);
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt2 = getChildAt(i19);
                    if (childAt2 instanceof AttachButtonBase) {
                        ((AttachButtonBase) childAt2).glassTabView.setAdditionalWidth(iFloor);
                    }
                }
                super.onMeasure(i16, i17);
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
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.buttonsLayoutManager = linearLayoutManager;
        recyclerListView3.setLayoutManager(linearLayoutManager);
        this.buttonsRecyclerView.setVerticalScrollBarEnabled(false);
        this.buttonsRecyclerView.setHorizontalScrollBarEnabled(false);
        this.buttonsRecyclerView.lambda$onCellEnter$52(null);
        this.buttonsRecyclerView.setLayoutAnimation(null);
        this.buttonsRecyclerView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.buttonsRecyclerView.setAdaptiveOverScroll();
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory4 = this.iBlur3FactoryLiquidGlass;
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        blurredBackgroundDrawableViewFactory4.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory4.parent = viewGroup2;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory5 = this.iBlur3FactoryFrostedLiquidGlass;
        ViewPositionWatcher viewPositionWatcher2 = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        blurredBackgroundDrawableViewFactory5.viewPositionWatcher = viewPositionWatcher2;
        blurredBackgroundDrawableViewFactory5.parent = viewGroup3;
        ViewPositionWatcher viewPositionWatcher3 = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        blurredBackgroundDrawableViewFactory3.viewPositionWatcher = viewPositionWatcher3;
        blurredBackgroundDrawableViewFactory3.parent = viewGroup4;
        this.bottomFadeView = new View(context) {
            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
                ChatAttachAlert.this.bottomFadeDrawable.draw(canvas);
            }

            @Override
            public void onSizeChanged(int i16, int i17, int i18, int i19) {
                super.onSizeChanged(i16, i17, i18, i19);
                ChatAttachAlert.this.bottomFadeDrawable.setBounds(0, (i17 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i16, i17);
            }
        };
        this.bottomFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory3.create(this.bottomFadeView, null, false));
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        this.bottomFadeDrawable.setFadeHeight(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView(this.bottomFadeView, LayoutHelper.createFrameMatchParent());
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryLiquidGlass.create(this.buttonsRecyclerViewWrapper, BlurredBackgroundProviderImpl.mainTabs(resourcesProvider), false);
        Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate, AndroidUtilities.dp(28.0f), 7.0f);
        this.buttonsRecyclerViewWrapper.setBackground(blurredBackgroundDrawableCreate);
        this.buttonsRecyclerView.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        this.buttonsRecyclerView.setClipToOutline(true);
        RecyclerListView recyclerListView4 = this.buttonsRecyclerView;
        int iDp = AndroidUtilities.dp(11.0f);
        float fDp = AndroidUtilities.dp(28.0f);
        RichEditor.AnonymousClass5 anonymousClass6 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        recyclerListView4.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(iDp, fDp));
        this.buttonsRecyclerView.setImportantForAccessibility(1);
        this.buttonsRecyclerViewWrapper.addView(this.buttonsRecyclerView, LayoutHelper.createFrameMatchParent());
        this.containerView.addView(this.buttonsRecyclerViewWrapper, LayoutHelper.createFrame(-1, 70, 81));
        this.buttonsRecyclerView.setOnItemClickListener(new JoinCallAlert$$ExternalSyntheticLambda5(this, resourcesProvider, 2));
        this.buttonsRecyclerView.setOnItemLongClickListener(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 9));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, true);
        this.botMainButtonTextView = animatedTextView;
        animatedTextView.setVisibility(8);
        this.botMainButtonTextView.setAlpha(0.0f);
        this.botMainButtonTextView.setGravity(17);
        this.botMainButtonTextView.setTypeface(AndroidUtilities.bold());
        int iDp2 = AndroidUtilities.dp(16.0f);
        final int i16 = 0;
        this.botMainButtonTextView.setPadding(iDp2, 0, iDp2, 0);
        this.botMainButtonTextView.setTextSize(AndroidUtilities.dp(f));
        this.botMainButtonTextView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.f$0.lambda$new$16(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$17(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$22(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$26(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 6:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 7:
                        this.f$0.lambda$new$7(view);
                        break;
                    default:
                        this.f$0.lambda$new$8(view);
                        break;
                }
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
        final int i17 = 1;
        this.moveCaptionButton.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.f$0.lambda$new$16(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$17(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$22(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$26(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 6:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 7:
                        this.f$0.lambda$new$7(view);
                        break;
                    default:
                        this.f$0.lambda$new$8(view);
                        break;
                }
            }
        });
        this.frameLayout2 = new AnonymousClass17(context);
        FrameLayout frameLayout3 = new FrameLayout(context) {
            private int lastHeight;
            private final Path path = new Path();
            private final GradientClip clip = new GradientClip();

            @Override
            public void dispatchDraw(Canvas canvas) {
                if (ChatAttachAlert.this.captionContainerBg != null) {
                    ChatAttachAlert.this.captionContainerBg.setBounds(0, (int) ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
                    ChatAttachAlert.this.captionContainerBg.draw(canvas);
                }
                float fDp2 = AndroidUtilities.dp(20.0f);
                int iDp3 = AndroidUtilities.dp(7.0f);
                int iDp4 = AndroidUtilities.dp(7.0f);
                RectF rectF4 = AndroidUtilities.rectTmp;
                float f2 = iDp3;
                rectF4.set(getPaddingLeft(), f2, getWidth() - getPaddingRight(), getHeight() - iDp4);
                this.path.rewind();
                this.path.addRoundRect(rectF4, fDp2, fDp2, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.path);
                canvas.saveLayerAlpha(rectF4, 255, 31);
                super.dispatchDraw(canvas);
                rectF4.set(getPaddingLeft(), f2, getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + iDp3);
                this.clip.draw(canvas, rectF4, 1, 1.0f);
                rectF4.set(getPaddingLeft(), (getHeight() - iDp4) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - iDp4);
                this.clip.draw(canvas, rectF4, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }

            @Override
            public void onLayout(boolean z5, int i18, int i19, int i20, int i21) {
                int top = this.lastHeight - ChatAttachAlert.this.aiButton.getTop();
                super.onLayout(z5, i18, i19, i20, i21);
                this.lastHeight = getHeight();
                if (ChatAttachAlert.this.aiButton.getVisibility() != 0 || getHeight() - ChatAttachAlert.this.aiButton.getTop() == top) {
                    return;
                }
                ChatAttachAlert.this.aiButton.setTranslationY(ChatAttachAlert.this.aiButton.getTranslationY() + ((getHeight() - ChatAttachAlert.this.aiButton.getTop()) - top));
                ChatAttachAlert.this.aiButton.animate().translationY(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        };
        this.captionContainer = frameLayout3;
        this.frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = this.iBlur3FactoryFrostedLiquidGlass.create(this.sizeNotifierFrameLayout, BlurredBackgroundProviderImpl.topPanel(resourcesProvider), false);
        this.emojiViewChildBg = blurredBackgroundDrawableCreate2;
        blurredBackgroundDrawableCreate2.inAppKeyboardOptimization = true;
        blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.emojiViewChildBg;
        blurredBackgroundDrawable.boundProps.liquidThickness = AndroidUtilities.dp(32.0f);
        blurredBackgroundDrawable.onBoundPropsChanged();
        BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.emojiViewChildBg;
        blurredBackgroundDrawable2.boundProps.liquidIntensity = 0.4f;
        blurredBackgroundDrawable2.onBoundPropsChanged();
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = this.iBlur3FactoryLiquidGlass.create(this.captionContainer, BlurredBackgroundProviderImpl.topPanel(resourcesProvider), false);
        this.captionContainerBg = blurredBackgroundDrawableCreate3;
        blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(22.0f));
        this.captionContainerBg.setPadding(AndroidUtilities.dp(7.0f));
        this.captionContainer.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        this.frameLayout2.setWillNotDraw(false);
        this.frameLayout2.setVisibility(4);
        this.frameLayout2.setAlpha(0.0f);
        this.containerView.addView(this.frameLayout2, LayoutHelper.createFrame(-1, -2, 83));
        this.frameLayout2.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(18));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.captionLimitView = animatedTextView2;
        animatedTextView2.setAllowCancel(true);
        animatedTextView2.setScaleProperty(0.6f);
        animatedTextView2.setVisibility(8);
        animatedTextView2.setTextSize(AndroidUtilities.dp(15.0f));
        int i18 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView2.setTextColor(getThemedColor(i18));
        animatedTextView2.setTypeface(AndroidUtilities.bold());
        animatedTextView2.setGravity(17);
        this.captionContainer.addView(animatedTextView2, LayoutHelper.createFrame(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.aiButton = imageView4;
        AiButtonDrawable aiButtonDrawable = new AiButtonDrawable(context);
        this.aiButtonIcon = aiButtonDrawable;
        imageView4.setImageDrawable(aiButtonDrawable);
        imageView4.setScaleType(scaleType);
        int i19 = Theme.key_glass_defaultIcon;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i19), mode));
        int i20 = Theme.key_listSelector;
        imageView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i20), 1, AndroidUtilities.dp(16.0f)));
        this.captionContainer.addView(imageView4, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        int i21 = R.string.AIEditor;
        imageView4.setContentDescription(LocaleController.getString(i21));
        ScaleStateListAnimator.apply(imageView4);
        final int i22 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        this.f$0.lambda$new$21(resourcesProvider, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$25(resourcesProvider, view);
                        break;
                    default:
                        this.f$0.lambda$new$6(resourcesProvider, view);
                        break;
                }
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
        int i23 = R.string.AddCaption;
        anonymousClass19.setHint(LocaleController.getString("AddCaption", i23));
        this.commentTextView.onResume();
        this.commentTextView.getEditText().setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        this.commentTextView.getEditText().addTextChangedListener(new TextWatcher() {
            private boolean processChange;
            private boolean wasEmpty;

            @Override
            public void afterTextChanged(Editable editable) {
                boolean z5;
                int i24;
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
                if (ChatAttachAlert.this.currentLimit <= 0 || (i24 = ChatAttachAlert.this.currentLimit - ChatAttachAlert.this.codepointCount) > 100) {
                    ChatAttachAlert.this.captionLimitView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlert.this.captionLimitView.setVisibility(8);
                        }
                    });
                    ChatAttachAlert.this.topCaptionLimitView.setAlpha(0.0f);
                    z5 = true;
                } else {
                    if (i24 < -9999) {
                        i24 = -9999;
                    }
                    long j = i24;
                    ChatAttachAlert.this.captionLimitView.setText(LocaleController.formatNumber(j, ','), ChatAttachAlert.this.captionLimitView.getVisibility() == 0);
                    if (ChatAttachAlert.this.captionLimitView.getVisibility() != 0) {
                        ChatAttachAlert.this.captionLimitView.setVisibility(0);
                        ChatAttachAlert.this.captionLimitView.setAlpha(0.0f);
                        ChatAttachAlert.this.captionLimitView.setScaleX(0.5f);
                        ChatAttachAlert.this.captionLimitView.setScaleY(0.5f);
                    }
                    ChatAttachAlert.this.captionLimitView.animate().setListener(null).cancel();
                    ChatAttachAlert.this.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i24 < 0) {
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

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i24, int i25, int i26) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i24, int i25, int i26) {
                if (i26 - i25 >= 1) {
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
        });
        this.captionContainer.addView(this.commentTextView, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        this.captionContainer.setClipChildren(false);
        this.frameLayout2.setClipChildren(false);
        this.commentTextView.setClipChildren(false);
        this.topCommentContainer.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        this.topCommentContainer.setWillNotDraw(false);
        EditTextEmoji editTextEmoji = new EditTextEmoji(context, this.sizeNotifierFrameLayout, null, 1, true, resourcesProvider) {
            @Override
            public void createEmojiView() {
                super.createEmojiView();
                EmojiView emojiView = getEmojiView();
                if (emojiView != null) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                    emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
            }

            @Override
            public void extendActionMode(ActionMode actionMode, Menu menu) {
                BaseFragment baseFragment2 = ChatAttachAlert.this.baseFragment;
                if (baseFragment2 instanceof ChatActivity) {
                    ChatActivity.fillActionModeMenu(menu, ((ChatActivity) baseFragment2).getCurrentEncryptedChat(), true, true);
                }
                super.extendActionMode(actionMode, menu);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (!ChatAttachAlert.this.enterCommentEventSent) {
                    if (motionEvent.getX() <= ChatAttachAlert.this.topCommentTextView.getEditText().getLeft() || motionEvent.getX() >= ChatAttachAlert.this.topCommentTextView.getEditText().getRight() || motionEvent.getY() <= ChatAttachAlert.this.topCommentTextView.getEditText().getTop() || motionEvent.getY() >= ChatAttachAlert.this.topCommentTextView.getEditText().getBottom()) {
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        chatAttachAlert.makeFocusable(chatAttachAlert.topCommentTextView.getEditText(), false);
                    } else {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.makeFocusable(chatAttachAlert2.topCommentTextView.getEditText(), true);
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void onLayout(boolean z5, int i24, int i25, int i26, int i27) {
                super.onLayout(z5, i24, i25, i26, i27);
                ChatAttachAlert.this.updatedTopCaptionHeight();
            }

            @Override
            public void onLineCountChanged(int i24, int i25) {
                super.onLineCountChanged(i24, i25);
                ChatAttachAlert.this.updatedTopCaptionHeight();
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (chatAttachAlert.captionAbove) {
                    chatAttachAlert.showAiButton(i25 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
                }
            }
        };
        this.topCommentTextView = editTextEmoji;
        editTextEmoji.includeNavigationBar = true;
        editTextEmoji.getEditText().addTextChangedListener(new TextWatcher() {
            private boolean processChange;
            private boolean wasEmpty;

            @Override
            public void afterTextChanged(Editable editable) {
                boolean z5;
                int i24;
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
                if (ChatAttachAlert.this.currentLimit <= 0 || (i24 = ChatAttachAlert.this.currentLimit - ChatAttachAlert.this.codepointCount) > 100) {
                    ChatAttachAlert.this.topCaptionLimitView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlert.this.topCaptionLimitView.setVisibility(8);
                        }
                    });
                    ChatAttachAlert.this.captionLimitView.setAlpha(0.0f);
                    z5 = true;
                } else {
                    if (i24 < -9999) {
                        i24 = -9999;
                    }
                    long j = i24;
                    ChatAttachAlert.this.topCaptionLimitView.setText(LocaleController.formatNumber(j, ','), ChatAttachAlert.this.topCaptionLimitView.getVisibility() == 0);
                    if (ChatAttachAlert.this.topCaptionLimitView.getVisibility() != 0) {
                        ChatAttachAlert.this.topCaptionLimitView.setVisibility(0);
                        ChatAttachAlert.this.topCaptionLimitView.setAlpha(0.0f);
                        ChatAttachAlert.this.topCaptionLimitView.setScaleX(0.5f);
                        ChatAttachAlert.this.topCaptionLimitView.setScaleY(0.5f);
                    }
                    ChatAttachAlert.this.topCaptionLimitView.animate().setListener(null).cancel();
                    ChatAttachAlert.this.topCaptionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i24 < 0) {
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

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i24, int i25, int i26) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i24, int i25, int i26) {
                if (i26 - i25 >= 1) {
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
        });
        this.topCommentTextView.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        this.topCommentTextView.getEditText().setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        this.topCommentTextView.getEditText().setTextSize(1, 17.0f);
        this.topCommentTextView.getEmojiButton().setLayoutParams(LayoutHelper.createFrame(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.topCommentTextView.setHint(LocaleController.getString("AddCaption", i23));
        this.topCommentContainer.addView(this.topCommentTextView, LayoutHelper.createFrame(-1, -2, 119));
        this.topCommentContainer.setAlpha(0.0f);
        this.topCommentContainer.setVisibility(8);
        this.commentTextView.addView(this.moveCaptionButton, LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate4 = this.iBlur3FactoryLiquidGlass.create(this.topCommentContainer, BlurredBackgroundProviderImpl.topPanel(resourcesProvider), false);
        Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate4, AndroidUtilities.dp(22.0f), 7.0f);
        this.topCommentContainer.setBackground(blurredBackgroundDrawableCreate4);
        this.topCommentContainer.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        AnimatedTextView animatedTextView3 = new AnimatedTextView(context);
        this.topCaptionLimitView = animatedTextView3;
        animatedTextView3.setScaleProperty(0.6f);
        animatedTextView3.setVisibility(8);
        animatedTextView3.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView3.setTextColor(getThemedColor(i18));
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
        final int i24 = 2;
        this.topCommentMoveButton.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i24) {
                    case 0:
                        this.f$0.lambda$new$16(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$17(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$22(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$26(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 6:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 7:
                        this.f$0.lambda$new$7(view);
                        break;
                    default:
                        this.f$0.lambda$new$8(view);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.topAiButton = imageView6;
        AiButtonDrawable aiButtonDrawable2 = new AiButtonDrawable(context);
        this.topAiButtonIcon = aiButtonDrawable2;
        imageView6.setImageDrawable(aiButtonDrawable2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i19), mode));
        imageView6.setBackground(Theme.createSelectorDrawable(getThemedColor(i20), 1, AndroidUtilities.dp(16.0f)));
        this.topCommentContainer.addView(imageView6, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(i21));
        ScaleStateListAnimator.apply(imageView6);
        final int i25 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i25) {
                    case 0:
                        this.f$0.lambda$new$21(resourcesProvider, view);
                        break;
                    case 1:
                        this.f$0.lambda$new$25(resourcesProvider, view);
                        break;
                    default:
                        this.f$0.lambda$new$6(resourcesProvider, view);
                        break;
                }
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
            public int getFillColor() {
                return ChatAttachAlert.this.getThemedColor(Theme.key_dialogFloatingButton);
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
            public boolean isOpen() {
                return true;
            }

            @Override
            public boolean shouldDrawBackground() {
                return true;
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
        final int i26 = 3;
        sendButton2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i26) {
                    case 0:
                        this.f$0.lambda$new$16(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$17(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$22(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$26(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 6:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 7:
                        this.f$0.lambda$new$7(view);
                        break;
                    default:
                        this.f$0.lambda$new$8(view);
                        break;
                }
            }
        });
        this.writeButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$new$37(context, resourcesProvider, baseFragment, view);
            }
        });
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        View view = new View(context) {
            @Override
            public void onDraw(Canvas canvas) {
                String str = String.format("%d", Integer.valueOf(Math.max(1, ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount())));
                int iCeil = (int) Math.ceil(ChatAttachAlert.this.textPaint.measureText(str));
                int iMax = Math.max(AndroidUtilities.dp(16.0f) + iCeil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor3 = ChatAttachAlert.this.getThemedColor(Theme.key_dialogRoundCheckBoxCheck);
                ChatAttachAlert.this.textPaint.setColor(ColorUtils.setAlphaComponent(themedColor3, (int) (((((double) ChatAttachAlert.this.sendButtonEnabledProgress) * 0.42d) + 0.58d) * ((double) Color.alpha(themedColor3)))));
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_dialogBackground));
                int i27 = iMax / 2;
                int i28 = measuredWidth - i27;
                int i29 = i27 + measuredWidth;
                ChatAttachAlert.this.rect.set(i28, 0.0f, i29, getMeasuredHeight());
                canvas.drawRoundRect(ChatAttachAlert.this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ChatAttachAlert.this.paint);
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor(Theme.key_chat_attachCheckBoxBackground));
                ChatAttachAlert.this.rect.set(AndroidUtilities.dp(2.0f) + i28, AndroidUtilities.dp(2.0f), i29 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
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
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder.backgroundColor = new ChatAttachAlert$$ExternalSyntheticLambda1(this, 10);
        blurredBackgroundProviderBuilder.strokeColorTop = new ChatAttachAlert$$ExternalSyntheticLambda1(this, 11);
        blurredBackgroundProviderBuilder.strokeColorBottom = new ChatAttachAlert$$ExternalSyntheticLambda1(this, 12);
        blurredBackgroundProviderBuilder.shadowColor = new ChatAttachAlert$$ExternalSyntheticLambda1(this, 13);
        float fDpf2 = AndroidUtilities.dpf2(3.3333333f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder.shadowRadius = fDpf2;
        blurredBackgroundProviderBuilder.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(1.0f);
        float fDpf5 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder.strokeWidthTop = fDpf4;
        blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf5;
        this.actionBar.setupGlass(this.iBlur3FactoryLiquidGlass, blurredBackgroundProviderBuilder);
        replaceAnimator.replace(1L, false);
    }

    private int getShadowDrawableColor(boolean z) {
        ActionBar actionBar;
        if (this.forceDarkTheme) {
            return getThemedColor(Theme.key_voipgroup_listViewBackground);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        ArrayList arrayList = this.animatorCurrentVisibleLayout.list.entries;
        int size = arrayList.size();
        int i = 0;
        float visibility = 0.0f;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            long jLongValue = ((Long) entry.item).longValue();
            if (jLongValue == 1 || jLongValue == 3 || jLongValue == 4 || jLongValue == 5 || jLongValue == 6 || jLongValue == 9 || jLongValue == 11 || jLongValue == 12) {
                visibility += entry.getVisibility();
            }
        }
        float fClamp = MathUtils.clamp(visibility, 0.0f, 1.0f);
        if (z && (actionBar = this.actionBar) != null && actionBar.getVisibility() == 0) {
            fClamp *= 1.0f - this.actionBar.getAlpha();
        }
        return ColorUtils.blendARGB(fClamp, getThemedColor(Theme.key_dialogBackground), getThemedColor(zIsDark ? Theme.key_windowBackgroundGray : Theme.key_dialogBackgroundGray));
    }

    private void onCurrentLayoutAnimatorChanged() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int shadowDrawableColor = getShadowDrawableColor();
        Theme.setDrawableColor(shadowDrawableColor, this.shadowDrawable);
        checkColorSourceColor(shadowDrawableColor);
        updateDoneItemEnabled();
        this.containerView.invalidate();
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
            final int i = 0;
            duration.setInterpolator(cubicBezierInterpolator).setUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda20(this, 1)).withEndAction(new Runnable(this) {
                public final ChatAttachAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$setCaptionAbove$74(z4, z3);
                            break;
                        default:
                            this.f$0.lambda$setCaptionAbove$76(z4, z3);
                            break;
                    }
                }
            }).start();
            this.captionContainer.setVisibility(0);
            ViewPropertyAnimator updateListener = this.captionContainer.animate().translationY((z4 || !z3) ? this.captionContainer.getMeasuredHeight() : 0.0f).alpha((z4 || !z3) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).setUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda20(this, 2));
            final int i2 = 1;
            updateListener.withEndAction(new Runnable(this) {
                public final ChatAttachAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$setCaptionAbove$74(z4, z3);
                            break;
                        default:
                            this.f$0.lambda$setCaptionAbove$76(z4, z3);
                            break;
                    }
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
        AndroidUtilities.runOnUIThread(new ChatAttachAlert$$ExternalSyntheticLambda12(this, 3));
    }

    public void showBotLayout(long j, String str, boolean z, boolean z2) {
        String str2;
        ChatAttachAlert chatAttachAlert;
        ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
        TLRPC.User user;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        int size;
        int i;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        boolean z3;
        String string;
        if (this.botAttachLayouts.get(j) != null) {
            str2 = str;
            if (Objects.equals(str2, this.botAttachLayouts.get(j).getStartCommand())) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout2 = this.botAttachLayouts.get(j);
                if (chatAttachAlertBotWebViewLayout2.needReload) {
                    chatAttachAlertBotWebViewLayout2.needReload = false;
                } else {
                    chatAttachAlert = this;
                }
            }
            if (chatAttachAlert.botAttachLayouts.get(j) != null) {
                chatAttachAlert.botAttachLayouts.get(j).swipeContainer.setSwipeOffsetAnimationDisallowed(true);
                chatAttachAlert.showLayout(chatAttachAlert.botAttachLayouts.get(j), -j, z2);
                if (z) {
                    chatAttachAlertBotWebViewLayout = chatAttachAlert.botAttachLayouts.get(j);
                    user = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getUser(Long.valueOf(chatAttachAlertBotWebViewLayout.botId));
                    arrayList = MediaDataController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getAttachMenuBots().bots;
                    size = arrayList.size();
                    i = 0;
                    do {
                        if (i < size) {
                            tL_attachMenuBot = null;
                            break;
                        } else {
                            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
                            i++;
                            tL_attachMenuBot = tL_attachMenuBot2;
                        }
                    } while (tL_attachMenuBot.bot_id != chatAttachAlertBotWebViewLayout.botId);
                    if (tL_attachMenuBot == null) {
                        return;
                    }
                    z3 = tL_attachMenuBot.show_in_side_menu;
                    if (!z3 && tL_attachMenuBot.show_in_attach_menu) {
                        string = LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name);
                    } else if (z3) {
                        string = LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name);
                    } else {
                        string = LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name);
                    }
                    AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(18, chatAttachAlertBotWebViewLayout, string), 200L);
                }
            }
        }
        str2 = str;
        if (this.baseFragment instanceof ChatActivity) {
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout3 = new ChatAttachAlertBotWebViewLayout(this, getContext(), this.resourcesProvider);
            this.botAttachLayouts.put(j, chatAttachAlertBotWebViewLayout3);
            chatAttachAlert = this;
            this.botAttachLayouts.get(j).setDelegate(new AnonymousClass1(chatAttachAlertBotWebViewLayout3, str2, j));
            MessageObject replyingMessageObject = ((ChatActivity) chatAttachAlert.baseFragment).getChatActivityEnterView().getReplyingMessageObject();
            chatAttachAlert.botAttachLayouts.get(j).requestWebView(chatAttachAlert.currentAccount, ((ChatActivity) chatAttachAlert.baseFragment).getDialogId(), j, replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0, str, ((ChatActivity) chatAttachAlert.baseFragment).getSendMonoForumPeerId());
        } else {
            chatAttachAlert = this;
        }
        if (chatAttachAlert.botAttachLayouts.get(j) != null) {
            chatAttachAlert.botAttachLayouts.get(j).swipeContainer.setSwipeOffsetAnimationDisallowed(true);
            chatAttachAlert.showLayout(chatAttachAlert.botAttachLayouts.get(j), -j, z2);
            if (z) {
                chatAttachAlertBotWebViewLayout = chatAttachAlert.botAttachLayouts.get(j);
                user = MessagesController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getUser(Long.valueOf(chatAttachAlertBotWebViewLayout.botId));
                arrayList = MediaDataController.getInstance(chatAttachAlertBotWebViewLayout.currentAccount).getAttachMenuBots().bots;
                size = arrayList.size();
                i = 0;
                do {
                    if (i < size) {
                        tL_attachMenuBot = null;
                        break;
                    } else {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot3 = arrayList.get(i);
                        i++;
                        tL_attachMenuBot = tL_attachMenuBot3;
                    }
                } while (tL_attachMenuBot.bot_id != chatAttachAlertBotWebViewLayout.botId);
                if (tL_attachMenuBot == null) {
                    return;
                }
                z3 = tL_attachMenuBot.show_in_side_menu;
                if (!z3) {
                    if (z3) {
                        string = LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name);
                    } else {
                        string = LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name);
                    }
                } else if (z3) {
                    string = LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name);
                } else {
                    string = LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name);
                }
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(18, chatAttachAlertBotWebViewLayout, string), 200L);
            }
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
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
            AlertDialog alertDialogCreate = new AlertDialog.Builder(lastFragment.getParentActivity(), 0, this.resourcesProvider).setTitle(LocaleController.getString(R.string.DiscardSelectionAlertTitle)).setMessage(LocaleController.getString(R.string.DiscardSelectionAlertMessage)).setPositiveButton(LocaleController.getString(R.string.Discard), new ChatAttachAlert$$ExternalSyntheticLambda1(this, 5)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setOnCancelListener(new ChatAttachAlert$$ExternalSyntheticLambda5(this, 0)).setOnPreDismissListener(new SearchTagsList$$ExternalSyntheticLambda5(this, 3)).create();
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
        AndroidUtilities.setNavigationBarColor((Dialog) this, ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), 0), true, (AndroidUtilities.IntColorCallback) new ChatAttachAlert$$ExternalSyntheticLambda1(this, 15));
        if (lastFragment != null) {
            AndroidUtilities.setLightStatusBar(this, lastFragment.isLightStatusBar());
        }
        this.captionLimitBulletinShown = false;
        super.lambda$showGiftOfferSheet$15();
        this.allowPassConfirmationAlert = false;
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

    private void showLayout(AttachAlertLayout attachAlertLayout, long j) {
        showLayout(attachAlertLayout, j, true);
    }

    private void showLayout(AttachAlertLayout attachAlertLayout, long j, boolean z) {
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal;
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal2;
        int iDp = 0;
        int i = 1;
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
            for (int i2 = 0; i2 < this.botAttachLayouts.size(); i2++) {
                this.botAttachLayouts.valueAt(i2).setMeasureOffsetY(0);
            }
            this.selectedId = j;
            int childCount = this.buttonsRecyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.buttonsRecyclerView.getChildAt(i3);
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
            ChatAttachAlert$$ExternalSyntheticLambda12 chatAttachAlert$$ExternalSyntheticLambda12 = new ChatAttachAlert$$ExternalSyntheticLambda12(this, i);
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
                    AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda1(this, attachAlertLayout, chatAttachAlert$$ExternalSyntheticLambda12, 16));
                } else {
                    boolean z2 = this.nextAttachLayout.getCurrentItemTop() <= attachAlertLayout.getButtonsHideOffset();
                    this.currentAttachLayout.onHideShowProgress(1.0f);
                    this.nextAttachLayout.onHideShowProgress(1.0f);
                    this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
                    this.nextAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
                    this.containerView.invalidate();
                    this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(1.0f));
                    this.actionBar.setTag(z2 ? 1 : null);
                    chatAttachAlert$$ExternalSyntheticLambda12.run();
                }
            } else if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.nextAttachLayout.setAlpha(0.0f);
                this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.currentAttachLayout, (Property<AttachAlertLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.currentAttachLayout, this.ATTACH_ALERT_LAYOUT_TRANSLATION, 0.0f, 1.0f);
                ActionBar actionBar = this.actionBar;
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) View.ALPHA, actionBar.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet.addListener(new AnonymousClass27(firstOffset, chatAttachAlert$$ExternalSyntheticLambda12));
                this.viewChangeAnimator = animatorSet;
                this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(0.0f));
                animatorSet.start();
            } else {
                attachAlertLayout5.setAlpha(0.0f);
                chatAttachAlert$$ExternalSyntheticLambda12.run();
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

    public interface ChatAttachViewDelegate {
        void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2);

        void didSelectBot(TLRPC.User user);

        void doOnIdle(Runnable runnable);

        View getRevealView();

        boolean needEnterComment();

        void onCameraOpened();

        void onWallpaperSelected(Object obj);

        void openAvatarsSearch();

        boolean selectItemOnClicking();

        void sendAudio(ArrayList<MessageObject> arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2);

        public abstract class CC {
            public static View $default$getRevealView(ChatAttachViewDelegate chatAttachViewDelegate) {
                return null;
            }

            public static boolean $default$needEnterComment(ChatAttachViewDelegate chatAttachViewDelegate) {
                return false;
            }

            public static boolean $default$selectItemOnClicking(ChatAttachViewDelegate chatAttachViewDelegate) {
                return false;
            }

            public static void $default$onCameraOpened(ChatAttachViewDelegate chatAttachViewDelegate) {
            }

            public static void $default$openAvatarsSearch(ChatAttachViewDelegate chatAttachViewDelegate) {
            }

            public static void $default$didSelectBot(ChatAttachViewDelegate chatAttachViewDelegate, TLRPC.User user) {
            }

            public static void $default$onWallpaperSelected(ChatAttachViewDelegate chatAttachViewDelegate, Object obj) {
            }

            public static void $default$sendAudio(ChatAttachViewDelegate chatAttachViewDelegate, ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
            }
        }
    }
}
