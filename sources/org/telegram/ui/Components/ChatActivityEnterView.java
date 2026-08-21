package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
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
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.Property;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.os.BuildCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
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
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.utils.EphemeralMessagesHelper;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.chat.SendButtonBlockedByTypingView;
import org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout;
import org.telegram.ui.Components.inset.WindowInsetsInAppController;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.GroupStickersActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.MultiContactsSelectorBottomSheet;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.HighlightMessageSheet;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.bots.BotCommandsMenuContainer;
import org.telegram.ui.bots.BotCommandsMenuView;
import org.telegram.ui.bots.BotKeyboardView;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatActivityBotWebViewButton;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichHtml;
import org.telegram.ui.iv.RichMessageConvert;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, StickersAlert.StickersAlertDelegate, SuggestEmojiView.AnchorViewDelegate, FactorAnimator.Target, Theme.Colorable {
    private final Property ATTACH_LAYOUT_ALPHA;
    private final Property ATTACH_LAYOUT_TRANSLATION_X;
    private final Property EMOJI_BUTTON_ALPHA;
    private final Property EMOJI_BUTTON_SCALE;
    private final Property MESSAGE_TEXT_TRANSLATION_X;
    private AccountInstance accountInstance;
    private ActionBarMenuSubItem actionScheduleButton;
    private AdjustPanLayoutHelper adjustPanLayoutHelper;
    private ImageView aiButton;
    private AiButtonDrawable aiButtonIcon;
    public HintView2 aiHint;
    private boolean allowAnimatedEmoji;
    public boolean allowBlur;
    private boolean allowGifs;
    private boolean allowShowTopView;
    private boolean allowStickers;
    protected int animatedTop;
    private int animatingContentType;
    private Runnable animationEndRunnable;
    private HashMap animationParamsX;
    private final BoolAnimator animatorEphemeralMessageVisibility;
    private final FactorAnimator animatorInputFieldHeight;
    private final BoolAnimator animatorIsBlockedByStreaming;
    private final BoolAnimator animatorTopViewVisibility;
    private ImageView attachButton;
    private float attachButtonAlpha;
    private ViewPropertyAnimator attachButtonAnimator;
    private LinearLayout attachLayout;
    private float attachLayoutAlpha;
    private float attachLayoutPaddingAlpha;
    protected float attachLayoutPaddingTranslationX;
    private float attachLayoutTranslationX;
    protected RecordedAudioPlayerView audioTimelineView;
    private TLRPC.TL_document audioToSend;
    private MessageObject audioToSendMessageObject;
    private String audioToSendPath;
    private FrameLayout audioVideoButtonContainer;
    private boolean audioVideoButtonContainerForbidden;
    private ChatActivityEnterViewAnimatedIconView audioVideoSendButton;
    Paint backgroundPaint;
    public HintView2 birthdayHint;
    private Rect blurBounds;
    private ImageView botButton;
    private ReplaceableIconDrawable botButtonDrawable;
    private MessageObject botButtonsMessageObject;
    int botCommandLastPosition;
    int botCommandLastTop;
    private BotCommandsMenuView.BotCommandsAdapter botCommandsAdapter;
    private BotCommandsMenuView botCommandsMenuButton;
    public BotCommandsMenuContainer botCommandsMenuContainer;
    private int botCount;
    private BotKeyboardView botKeyboardView;
    private boolean botKeyboardViewVisible;
    private BotMenuButtonType botMenuButtonType;
    private String botMenuWebViewTitle;
    private String botMenuWebViewUrl;
    private MessageObject botMessageObject;
    private TLRPC.TL_replyKeyboardMarkup botReplyMarkup;
    private ChatActivityBotWebViewButton botWebViewButton;
    private final AnimatedFloat bottomGradientAlpha;
    private boolean calledRecordRunnable;
    private Drawable cameraDrawable;
    private Drawable cameraOutline;
    private boolean canWriteToChannel;
    private ImageView cancelBotButton;
    private boolean canceledByGesture;
    private boolean captionAbove;
    private boolean captionLimitBulletinShown;
    public NumberTextView captionLimitView;
    private boolean clearBotButtonsOnKeyboardOpen;
    private final LinearGradient clipGradient;
    private final Matrix clipMatrix;
    private boolean closeAnimationInProgress;
    private int codePointCount;
    private int commonInputType;
    private float composeShadowAlpha;
    private float controlsScale;
    public ControlsView controlsView;
    boolean ctrlPressed;
    private int currentAccount;
    private float currentIslandTotalHeight;
    private float currentIslandTotalHeightTarget;
    private int currentLimit;
    private int currentPopupContentType;
    private ChatActivityEnterViewDelegate delegate;
    private ImageView deleteRichDraftButton;
    private boolean destroyed;
    private long dialog_id;
    private final Runnable dismissSendPreview;
    private boolean dismissSendPreviewSent;
    private float distCanMove;
    private SendButton doneButton;
    private AnimatorSet doneButtonAnimation;
    boolean doneButtonEnabled;
    private float doneButtonEnabledProgress;
    private Drawable doneCheckDrawable;
    private Paint dotPaint;
    private CharSequence draftMessage;
    private boolean draftSearchWebpage;
    private TL_account.TL_businessChatLink editingBusinessLink;
    private boolean editingCaption;
    private MessageObject editingMessageObject;
    private long effectId;
    private ChatActivityEnterViewAnimatedIconView emojiButton;
    float emojiButtonAlpha;
    float emojiButtonPaddingAlpha;
    float emojiButtonPaddingScale;
    private boolean emojiButtonRestricted;
    float emojiButtonScale;
    private int emojiPadding;
    private boolean emojiTabOpen;
    private EmojiView emojiView;
    private boolean emojiViewFrozen;
    public boolean emojiViewVisible;
    private float exitTransition;
    private ImageView expandStickersButton;
    private Runnable focusRunnable;
    private boolean forceShowSendButton;
    private ImageView giftButton;
    private final Paint gradientPaint;
    private boolean hasBotCommands;
    private boolean hasQuickReplies;
    private boolean hasRecordVideo;
    private Runnable hideKeyboardRunnable;
    private float horizontalPadding;
    float idleProgress;
    private boolean ignoreTextChange;
    private TLRPC.ChatFull info;
    private int innerTextChange;
    private final boolean isChat;
    private boolean isInVideoMode;
    private boolean isInitLineCount;
    private boolean isLiveComment;
    private boolean isPaste;
    private boolean isPaused;
    public boolean isStories;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private boolean keyboardVisible;
    private int lastAttachVisible;
    private LongSparseArray lastBotInfo;
    private int lastRecordState;
    private BusinessLinkPresetMessage lastSavedBusinessLinkMessage;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private long lastTypingTimeSend;
    private int lineCount;
    private int[] location;
    private float lockAnimatedTranslation;
    private Drawable lockShadowDrawable;
    private View mCustomWindowView;
    private EditTextBoldCursor mOverrideEditTextView;
    private View.AccessibilityDelegate mediaMessageButtonsDelegate;
    public EditTextCaption messageEditText;
    public FrameLayout messageEditTextContainer;
    private boolean messageEditTextEnabled;
    private ArrayList messageEditTextWatchers;
    public MessageSendPreview messageSendPreview;
    private float messageTextPaddingTranslationX;
    private float messageTextTranslationX;
    boolean messageTransitionIsRunning;
    private TLRPC.WebPage messageWebPage;
    private boolean messageWebPageSearch;
    private Drawable micDrawable;
    private Drawable micOutline;
    private long millisecondsRecorded;
    private Runnable moveToSendStateRunnable;
    private boolean needShowTopView;
    private AnimationNotificationsLocker notificationsLocker;
    private ImageView notifyButton;
    private CrossOutDrawable notifySilentDrawable;
    private Runnable onEmojiSearchClosed;
    private Runnable onFinishInitCameraRunnable;
    private Runnable onKeyboardClosed;
    public boolean onceVisible;
    private Runnable openKeyboardRunnable;
    private int originalViewHeight;
    private CharSequence overrideHint;
    private CharSequence overrideHint2;
    private boolean overrideKeyboardAnimation;
    private long paidMessagesPrice;
    private Paint paint;
    private AnimatorSet panelAnimation;
    private Activity parentActivity;
    private ChatActivity parentFragment;
    private RectF pauseRect;
    private TL_keyboard.KeyboardButtonProto pendingLocationButton;
    private MessageObject pendingMessageObject;
    private int popupX;
    private int popupY;
    public boolean preventInput;
    private CloseProgressDrawable2 progressDrawable;
    private ImageView reactionsButton;
    private Runnable recordAudioVideoRunnable;
    private boolean recordAudioVideoRunnableStarted;
    private RecordCircle recordCircle;
    private Property recordCircleScale;
    private Property recordControlsCircleScale;
    private RLottieImageView recordDeleteImageView;
    private RecordDot recordDot;
    private int recordInterfaceState;
    private boolean recordIsCanceled;
    private FrameLayout recordPanel;
    private AnimatorSet recordPannelAnimation;
    private LinearLayout recordTimeContainer;
    private TimerView recordTimerView;
    public FrameLayout recordedAudioPanel;
    private boolean recordingAudioVideo;
    public int recordingGuid;
    private Rect rect;
    private Paint redDotPaint;
    private boolean removeEmojiViewAfterAnimation;
    private MessageObject replyingMessageObject;
    private ChatActivity.ReplyQuote replyingQuote;
    private MessageObject replyingTopMessage;
    private boolean resizeForTopViewLastShow;
    private final Theme.ResourcesProvider resourcesProvider;
    private ImageView richButton;
    private boolean richDraftActive;
    private TL_iv.RichMessage richDraftMessage;
    public RichMessageLayout.PreviewView richDraftPreview;
    private Property roundedTranslationYProperty;
    private Runnable runEmojiPanelAnimation;
    private AnimatorSet runningAnimation;
    private AnimatorSet runningAnimation2;
    private AnimatorSet runningAnimationAudio;
    private int runningAnimationType;
    private float scale;
    private boolean scheduleButtonHidden;
    private ImageView scheduledButton;
    private AnimatorSet scheduledButtonAnimation;
    private ValueAnimator searchAnimator;
    private float searchToOpenProgress;
    private int searchingType;
    private SendButton sendButton;
    private int sendButtonBackgroundColor;
    private SendButtonBlockedByTypingView sendButtonBlockedByTypingView;
    public FrameLayout sendButtonContainer;
    private boolean sendButtonEnabled;
    private boolean sendButtonVisible;
    private boolean sendByEnter;
    private Drawable sendDrawable;
    private ImageView sendOutlineView;
    public boolean sendPlainEnabled;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout sendPopupLayout;
    private ActionBarPopupWindow sendPopupWindow;
    private Rect sendRect;
    private boolean sendRoundEnabled;
    private HintView2 sendSuggestHintView;
    private boolean sendVoiceEnabled;
    private ActionBarMenuSubItem sendWhenOnlineButton;
    private SenderSelectPopup senderSelectPopupWindow;
    public SenderSelectView senderSelectView;
    private long sentFromPreview;
    private Runnable setTextFieldRunnable;
    boolean shiftPressed;
    protected boolean shouldAnimateEditTextWithBounds;
    public boolean shouldDrawBackground;
    public boolean shouldDrawRecordedAudioPanelInParent;
    private boolean showKeyboardOnResume;
    private boolean showTooltip;
    private long showTooltipStartTime;
    private Runnable showTopViewRunnable;
    private boolean shownAiButton;
    private boolean shownRichButton;
    private ChatActivitySideControlsButtonsLayout sideButtons;
    private boolean silent;
    private SizeNotifierFrameLayout sizeNotifierLayout;
    private int slideDelta;
    private SlideTextView slideText;
    private float slideToCancelLockProgress;
    private float slideToCancelProgress;
    private SlowModeBtn slowModeButton;
    private int slowModeTimer;
    private boolean smoothKeyboard;
    private float snapAnimationProgress;
    public final ColoredImageSpan[] spans;
    private float startTranslation;
    private float startedDraggingX;
    private AnimatedArrowDrawable stickersArrow;
    private boolean stickersDragging;
    private boolean stickersEnabled;
    private boolean stickersExpanded;
    private int stickersExpandedHeight;
    private Animator stickersExpansionAnim;
    private float stickersExpansionProgress;
    private boolean stickersTabOpen;
    private BotForumHelper.SteamingSendButtonState streamingState;
    private ImageView suggestButton;
    private ValueAnimator suggestButtonAppear;
    private boolean suggestButtonVisible;
    public FrameLayout textFieldContainer;
    boolean textTransitionIsRunning;
    private float tooltipAlpha;
    private final AnimatedFloat topGradientAlpha;
    protected View topView;
    protected boolean topViewShowed;
    private float transformToSeekbar;
    private TrendingStickersAlert trendingStickersAlert;
    private Runnable updateExpandabilityRunnable;
    private Runnable updateSlowModeRunnable;
    private TLRPC.UserFull userInfo;
    protected VideoTimelineView videoTimelineView;
    private VideoEditedInfo videoToSendMessageObject;
    private ViewGroup viewParentForEmojiView;
    public boolean voiceOnce;
    private boolean waitingForKeyboardOpen;
    private boolean waitingForKeyboardOpenAfterAnimation;
    private PowerManager.WakeLock wakeLock;
    private boolean wasSendTyping;
    private WindowInsetsInAppController windowInsetsInAppController;

    public enum BotMenuButtonType {
        NO_BUTTON,
        COMMANDS,
        WEB_VIEW
    }

    public interface ChatActivityEnterViewDelegate {

        public abstract class CC {
            public static void $default$bottomPanelTranslationYChanged(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate, float f) {
            }

            public static boolean $default$checkCanRemoveRestrictionsByBoosts(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return false;
            }

            public static void $default$didPressStreamingStop(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static void $default$didPressSuggestionButton(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static int $default$getContentViewHeight(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return 0;
            }

            public static TLRPC.Peer $default$getDefaultSendAs(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return null;
            }

            public static ChatActivity.ReplyQuote $default$getReplyQuote(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return null;
            }

            public static TL_stories.StoryItem $default$getReplyToStory(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return null;
            }

            public static TLRPC.TL_channels_sendAsPeers $default$getSendAsPeers(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return null;
            }

            public static boolean $default$hasForwardingMessages(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return false;
            }

            public static boolean $default$hasScheduledMessages(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return true;
            }

            public static int $default$measureKeyboardHeight(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return 0;
            }

            public static void $default$onContextMenuClose(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static void $default$onContextMenuOpen(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static void $default$onEditTextScroll(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static void $default$onEmojiViewTabChanged(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static void $default$onKeyboardRequested(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static void $default$onTrendingStickersShowed(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate, boolean z) {
            }

            public static boolean $default$onceVoiceAvailable(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
                return false;
            }

            public static void $default$openScheduledMessages(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static void $default$prepareMessageSending(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static void $default$scrollToSendingMessage(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
            }

            public static boolean $default$setDefaultSendAs(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate, long j, long j2) {
                return false;
            }
        }

        void bottomPanelTranslationYChanged(float f);

        boolean checkCanRemoveRestrictionsByBoosts();

        void didPressAttachButton();

        void didPressStreamingStop();

        void didPressSuggestionButton();

        int getContentViewHeight();

        TLRPC.Peer getDefaultSendAs();

        ChatActivity.ReplyQuote getReplyQuote();

        TL_stories.StoryItem getReplyToStory();

        TLRPC.TL_channels_sendAsPeers getSendAsPeers();

        boolean hasForwardingMessages();

        boolean hasScheduledMessages();

        boolean isVideoRecordingPaused();

        int measureKeyboardHeight();

        void needChangeVideoPreviewState(int i, float f);

        void needSendTyping();

        void needShowMediaBanHint();

        void needStartRecordAudio(int i);

        void needStartRecordVideo(int i, boolean z, int i2, int i3, int i4, long j, long j2);

        void onAttachButtonHidden();

        void onAttachButtonShow();

        void onAudioVideoInterfaceUpdated();

        void onContextMenuClose();

        void onContextMenuOpen();

        void onEditTextScroll();

        void onEmojiViewTabChanged();

        void onKeyboardRequested();

        void onMessageEditEnd(boolean z);

        void onMessageSend(CharSequence charSequence, boolean z, int i, int i2, long j);

        void onPreAudioVideoRecord();

        void onSendLongClick();

        void onStickersExpandedChange();

        void onStickersTab(boolean z);

        void onSwitchRecordMode(boolean z);

        void onTextChanged(CharSequence charSequence, boolean z, boolean z2);

        void onTextSelectionChanged(int i, int i2);

        void onTextSpansChanged(CharSequence charSequence);

        void onTrendingStickersShowed(boolean z);

        void onUpdateSlowModeButton(View view, boolean z, CharSequence charSequence);

        void onWindowSizeChanged(int i);

        boolean onceVoiceAvailable();

        void openScheduledMessages();

        void prepareMessageSending();

        void scrollToSendingMessage();

        boolean setDefaultSendAs(long j, long j2);

        void toggleVideoRecordingPause();
    }

    public static boolean $r8$lambda$1GqsLXvX_QIt91kWc3l4wdvEQ6I(View view, MotionEvent motionEvent) {
        return true;
    }

    private void createBotWebViewMenuContainer() {
    }

    public boolean areLiveCommentsFree() {
        return false;
    }

    public void checkAnimation() {
    }

    public void extendActionMode(Menu menu) {
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    protected void isRecordingStateChanged() {
    }

    public void onAdjustPanTransitionUpdate(float f, float f2, boolean z) {
    }

    protected void onChangedIslandTotalHeight(float f) {
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    protected void onKeyboardShown() {
    }

    protected void onLineCountChanged(int i, int i2) {
    }

    protected boolean pannelAnimationEnabled() {
        return true;
    }

    protected boolean showConfirmAlert(Runnable runnable) {
        return false;
    }

    static float access$4816(ChatActivityEnterView chatActivityEnterView, float f) {
        float f2 = chatActivityEnterView.tooltipAlpha + f;
        chatActivityEnterView.tooltipAlpha = f2;
        return f2;
    }

    static float access$4824(ChatActivityEnterView chatActivityEnterView, float f) {
        float f2 = chatActivityEnterView.tooltipAlpha - f;
        chatActivityEnterView.tooltipAlpha = f2;
        return f2;
    }

    static float access$5516(ChatActivityEnterView chatActivityEnterView, float f) {
        float f2 = chatActivityEnterView.slideToCancelLockProgress + f;
        chatActivityEnterView.slideToCancelLockProgress = f2;
        return f2;
    }

    static float access$5524(ChatActivityEnterView chatActivityEnterView, float f) {
        float f2 = chatActivityEnterView.slideToCancelLockProgress - f;
        chatActivityEnterView.slideToCancelLockProgress = f2;
        return f2;
    }

    public void drawRecordedPannel(Canvas canvas) {
        FrameLayout frameLayout;
        Canvas canvas2;
        if (getAlpha() == 0.0f || (frameLayout = this.recordedAudioPanel) == null || frameLayout.getParent() == null || this.recordedAudioPanel.getVisibility() != 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getX() + this.textFieldContainer.getX() + this.messageEditTextContainer.getX() + this.recordedAudioPanel.getX(), getY() + this.textFieldContainer.getY() + this.messageEditTextContainer.getY() + this.recordedAudioPanel.getY());
        if (getAlpha() != 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getAlpha() * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        this.recordedAudioPanel.draw(canvas2);
        canvas2.restoreToCount(iSave);
    }

    public void setAnimatedTop(int i) {
        this.animatedTop = i;
    }

    public float getTopViewEnterProgress() {
        return this.animatorTopViewVisibility.getFloatValue();
    }

    static class SlowModeBtn extends FrameLayout {
        private final RectF bgRect;
        private final Drawable closeDrawable;
        private final Paint gradientPaint;
        private boolean isPremiumMode;
        private final SimpleTextView textView;

        public SlowModeBtn(Context context) {
            super(context);
            this.bgRect = new RectF();
            this.gradientPaint = new Paint(1);
            this.isPremiumMode = false;
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            addView(simpleTextView, LayoutHelper.createFrame(-1, -1.0f));
            setWillNotDraw(false);
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.msg_mini_close_tooltip);
            this.closeDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            setClipToPadding(false);
            setClipChildren(false);
            ScaleStateListAnimator.apply(this);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }

        public void setTextSize(int i) {
            this.textView.setTextSize(i);
            invalidate();
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
            invalidate();
        }

        public void setGravity(int i) {
            this.textView.setGravity(i);
            invalidate();
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
            invalidate();
        }

        public void setPremiumMode(boolean z) {
            this.isPremiumMode = z;
            invalidate();
        }

        public CharSequence getText() {
            return this.textView.getText();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.isPremiumMode) {
                canvas.save();
                int iDp = AndroidUtilities.dp(26.0f);
                canvas.translate(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - iDp) / 2.0f);
                float f = iDp;
                this.bgRect.set(-AndroidUtilities.dp(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f);
                float f2 = f / 2.0f;
                canvas.drawRoundRect(this.bgRect, f2, f2, this.gradientPaint);
                canvas.translate(((getMeasuredWidth() - getPaddingEnd()) - AndroidUtilities.dp(6.0f)) - this.closeDrawable.getIntrinsicWidth(), AndroidUtilities.dp(5.0f));
                this.closeDrawable.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if ((view instanceof SimpleTextView) && this.isPremiumMode) {
                SimpleTextView simpleTextView = (SimpleTextView) view;
                canvas.save();
                canvas.scale(0.8f, 0.8f);
                canvas.translate(-AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                int color = simpleTextView.getTextPaint().getColor();
                simpleTextView.getTextPaint().setColor(-1);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                simpleTextView.getTextPaint().setColor(color);
                canvas.restore();
                return zDrawChild;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    private class RecordDot extends View {
        private float alpha;
        boolean attachedToWindow;
        RLottieDrawable drawable;
        private boolean enterAnimation;
        private boolean isIncr;
        private long lastUpdateTime;
        boolean playing;

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attachedToWindow = true;
            if (this.playing) {
                this.drawable.start();
            }
            this.drawable.setMasterParent(this);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attachedToWindow = false;
            this.drawable.stop();
            this.drawable.setMasterParent(null);
        }

        public RecordDot(Context context) {
            super(context);
            int i = R.raw.chat_audio_record_delete_2;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
            this.drawable = rLottieDrawable;
            rLottieDrawable.setInvalidateOnProgressSet(true);
            updateColors();
        }

        public void updateColors() {
            int themedColor = ChatActivityEnterView.this.getThemedColor(Theme.key_chat_recordedVoiceDot);
            int themedColor2 = ChatActivityEnterView.this.getThemedColor(Theme.key_chat_messagePanelBackground);
            ChatActivityEnterView.this.redDotPaint.setColor(themedColor);
            this.drawable.beginApplyLayerColors();
            this.drawable.setLayerColor("Cup Red", themedColor);
            this.drawable.setLayerColor("Box", themedColor);
            this.drawable.setLayerColor("Line 1", themedColor2);
            this.drawable.setLayerColor("Line 2", themedColor2);
            this.drawable.setLayerColor("Line 3", themedColor2);
            this.drawable.commitApplyLayerColors();
        }

        public void resetAlpha() {
            this.alpha = 1.0f;
            this.lastUpdateTime = System.currentTimeMillis();
            this.isIncr = false;
            this.playing = false;
            this.drawable.stop();
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.playing) {
                this.drawable.setAlpha((int) (this.alpha * 255.0f));
            }
            ChatActivityEnterView.this.redDotPaint.setAlpha((int) (this.alpha * 255.0f));
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
            if (this.enterAnimation) {
                this.alpha = 1.0f;
            } else if (!this.isIncr && !this.playing) {
                float f = this.alpha - (jCurrentTimeMillis / 600.0f);
                this.alpha = f;
                if (f <= 0.0f) {
                    this.alpha = 0.0f;
                    this.isIncr = true;
                }
            } else {
                float f2 = this.alpha + (jCurrentTimeMillis / 600.0f);
                this.alpha = f2;
                if (f2 >= 1.0f) {
                    this.alpha = 1.0f;
                    this.isIncr = false;
                }
            }
            this.lastUpdateTime = System.currentTimeMillis();
            if (this.playing) {
                this.drawable.draw(canvas);
            }
            if (!this.playing || !this.drawable.hasBitmap()) {
                canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), ChatActivityEnterView.this.redDotPaint);
            }
            invalidate();
        }

        public void playDeleteAnimation() {
            this.playing = true;
            this.drawable.setProgress(0.0f);
            if (this.attachedToWindow) {
                this.drawable.start();
            }
        }
    }

    public class ControlsView extends FrameLayout {
        private BlurredBackgroundColorProviderThemed colorProvider;
        private AnimatedFloat hidePauseT;
        private int lastSize;
        private long lastUpdateTime;
        private BlurredBackgroundDrawable lockBackgroundDrawable;
        Paint lockBackgroundPaint;
        Paint lockOutlinePaint;
        Paint lockPaint;
        private Drawable micDrawable;
        private HintView2 onceHint;
        private boolean oncePressed;
        public final RectF onceRect;
        private Paint p;
        Path path;
        private final Path path2;
        private HintView2 pauseHint;
        private boolean pausePressed;
        private BlurredBackgroundDrawable periodBackgroundDrawable;
        private CaptionContainerView.PeriodDrawable periodDrawable;
        private final float[] radiiLeft;
        private final float[] radiiRight;
        private final RectF rectF;
        private Drawable tooltipBackground;
        private Drawable tooltipBackgroundArrow;
        private StaticLayout tooltipLayout;
        private String tooltipMessage;
        private TextPaint tooltipPaint;
        private float tooltipWidth;
        private boolean useGlassDesign;
        private Drawable vidDrawable;
        private VirtualViewHelper virtualViewHelper;

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
        }

        @Override
        protected boolean onSetAlpha(int i) {
            return super.onSetAlpha(i);
        }

        public ControlsView(Context context) {
            super(context);
            this.tooltipPaint = new TextPaint(1);
            this.lockBackgroundPaint = new Paint(1);
            this.lockPaint = new Paint(1);
            this.lockOutlinePaint = new Paint(1);
            this.path = new Path();
            this.p = new Paint(1);
            this.rectF = new RectF();
            this.onceRect = new RectF();
            this.path2 = new Path();
            this.radiiLeft = new float[]{fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f, fDp, fDp};
            this.radiiRight = new float[]{0.0f, 0.0f, fDp, fDp, fDp, fDp, 0.0f, 0.0f};
            this.hidePauseT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            VirtualViewHelper virtualViewHelper = new VirtualViewHelper(this);
            this.virtualViewHelper = virtualViewHelper;
            ViewCompat.setAccessibilityDelegate(this, virtualViewHelper);
            CaptionContainerView.PeriodDrawable periodDrawable = new CaptionContainerView.PeriodDrawable();
            this.periodDrawable = periodDrawable;
            periodDrawable.setCallback(this);
            this.periodDrawable.setValue(1, ChatActivityEnterView.this.voiceOnce, false);
            this.lockOutlinePaint.setStyle(Paint.Style.STROKE);
            this.lockOutlinePaint.setStrokeCap(Paint.Cap.ROUND);
            this.lockOutlinePaint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
            ChatActivityEnterView.this.lockShadowDrawable = getResources().getDrawable(R.drawable.lock_round_shadow);
            ChatActivityEnterView.this.lockShadowDrawable.setColorFilter(new PorterDuffColorFilter(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_messagePanelVoiceLockShadow), PorterDuff.Mode.MULTIPLY));
            this.tooltipBackground = Theme.createRoundRectDrawable(AndroidUtilities.dp(5.0f), ChatActivityEnterView.this.getThemedColor(Theme.key_chat_gifSaveHintBackground));
            this.tooltipPaint.setTextSize(AndroidUtilities.dp(14.0f));
            this.tooltipBackgroundArrow = ContextCompat.getDrawable(context, R.drawable.tooltip_arrow);
            this.tooltipMessage = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
            float fDp = AndroidUtilities.dp(3.0f);
            float fDp2 = AndroidUtilities.dp(3.0f);
            this.micDrawable = getResources().getDrawable(R.drawable.input_mic).mutate();
            this.vidDrawable = getResources().getDrawable(R.drawable.input_video).mutate();
            setWillNotDraw(false);
            updateColors();
        }

        public void showTooltipIfNeed() {
            if (SharedConfig.lockRecordAudioVideoHint < 3) {
                ChatActivityEnterView.this.showTooltip = true;
                ChatActivityEnterView.this.showTooltipStartTime = System.currentTimeMillis();
            }
        }

        public void showPauseHint() {
            if (MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) > 3) {
                return;
            }
            hideHintView();
            HintView2 hintView2 = new HintView2(getContext(), 2);
            this.pauseHint = hintView2;
            hintView2.setJoint(1.0f, 0.0f);
            this.pauseHint.setMultilineText(true);
            this.pauseHint.setText(LocaleController.getString(R.string.VoicePauseHint));
            MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
            addView(this.pauseHint, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
            final HintView2 hintView3 = this.pauseHint;
            hintView3.setOnHiddenListener(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.ControlsView.$r8$lambda$lmTB8QxNms3swRq6pYiHf_r9tFU(this.f$0, hintView3);
                }
            });
            this.pauseHint.show();
        }

        public static void $r8$lambda$lmTB8QxNms3swRq6pYiHf_r9tFU(ControlsView controlsView, HintView2 hintView2) {
            controlsView.removeView(hintView2);
            if (controlsView.pauseHint == hintView2) {
                controlsView.pauseHint = null;
            }
        }

        public void showOnceHint() {
            int i;
            hideHintView();
            HintView2 hintView2 = new HintView2(getContext(), 2);
            this.onceHint = hintView2;
            hintView2.setJoint(1.0f, 0.0f);
            this.onceHint.setMultilineText(true);
            if (ChatActivityEnterView.this.isInVideoMode) {
                i = ChatActivityEnterView.this.voiceOnce ? R.string.VideoSetOnceHintEnabled : R.string.VideoSetOnceHint;
            } else {
                i = ChatActivityEnterView.this.voiceOnce ? R.string.VoiceSetOnceHintEnabled : R.string.VoiceSetOnceHint;
            }
            this.onceHint.setText(AndroidUtilities.replaceTags(LocaleController.getString(i)));
            HintView2 hintView3 = this.onceHint;
            hintView3.setMaxWidthPx(HintView2.cutInFancyHalf(hintView3.getText(), this.onceHint.getTextPaint()));
            if (ChatActivityEnterView.this.voiceOnce) {
                this.onceHint.setIcon(R.raw.fire_on);
            } else {
                MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
            }
            addView(this.onceHint, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
            final HintView2 hintView4 = this.onceHint;
            hintView4.setOnHiddenListener(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.ControlsView.$r8$lambda$iT5sdX0rQMnhl6C43VNT4MqnQOI(this.f$0, hintView4);
                }
            });
            this.onceHint.show();
        }

        public static void $r8$lambda$iT5sdX0rQMnhl6C43VNT4MqnQOI(ControlsView controlsView, HintView2 hintView2) {
            controlsView.removeView(hintView2);
            if (controlsView.onceHint == hintView2) {
                controlsView.onceHint = null;
            }
        }

        public void hideHintView() {
            final HintView2 hintView2 = this.pauseHint;
            if (hintView2 != null) {
                hintView2.setOnHiddenListener(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.removeView(hintView2);
                    }
                });
                hintView2.hide();
                this.pauseHint = null;
            }
            final HintView2 hintView3 = this.onceHint;
            if (hintView3 != null) {
                hintView3.setOnHiddenListener(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.removeView(hintView3);
                    }
                });
                hintView3.hide();
                this.onceHint = null;
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int iDp = AndroidUtilities.dp(250.0f);
            if (this.lastSize != size) {
                this.lastSize = size;
                StaticLayout staticLayout = new StaticLayout(this.tooltipMessage, this.tooltipPaint, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                this.tooltipLayout = staticLayout;
                int lineCount = staticLayout.getLineCount();
                this.tooltipWidth = 0.0f;
                for (int i3 = 0; i3 < lineCount; i3++) {
                    float lineWidth = this.tooltipLayout.getLineWidth(i3);
                    if (lineWidth > this.tooltipWidth) {
                        this.tooltipWidth = lineWidth;
                    }
                }
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float f;
            float fMax;
            float f2;
            float f3;
            float fDpf2;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float interpolation;
            float f9;
            float f10;
            ChatActivityEnterView chatActivityEnterView;
            float fMax2;
            float f11;
            Drawable drawable;
            if (ChatActivityEnterView.this.scale <= 0.5f) {
                f = ChatActivityEnterView.this.scale / 0.5f;
            } else {
                f = ChatActivityEnterView.this.scale <= 0.75f ? 1.0f - (((ChatActivityEnterView.this.scale - 0.5f) / 0.25f) * 0.1f) : (((ChatActivityEnterView.this.scale - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
            this.lastUpdateTime = System.currentTimeMillis();
            if (ChatActivityEnterView.this.lockAnimatedTranslation != 10000.0f) {
                fMax = Math.max(0, (int) (ChatActivityEnterView.this.startTranslation - ChatActivityEnterView.this.lockAnimatedTranslation));
                if (fMax > AndroidUtilities.dp(57.0f)) {
                    fMax = AndroidUtilities.dp(57.0f);
                }
            } else {
                fMax = 0.0f;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            float fDp = 1.0f - (fMax / AndroidUtilities.dp(57.0f));
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(194.0f);
            if (ChatActivityEnterView.this.sendButtonVisible) {
                float fDp2 = AndroidUtilities.dp(36.0f);
                f2 = 0.25f;
                float fDp3 = (((AndroidUtilities.dp(60.0f) + measuredHeight) + (AndroidUtilities.dpf2(30.0f) * (1.0f - f))) - fMax) + (AndroidUtilities.dpf2(14.0f) * fDp);
                fDpf2 = (((fDp2 / 2.0f) + fDp3) - AndroidUtilities.dpf2(8.0f)) + AndroidUtilities.dpf2(2.0f);
                AndroidUtilities.dpf2(16.0f);
                AndroidUtilities.dpf2(2.0f);
                f3 = 0.4f;
                f4 = (((1.0f - fDp) * 9.0f) * (1.0f - ChatActivityEnterView.this.snapAnimationProgress)) - ((ChatActivityEnterView.this.snapAnimationProgress * 15.0f) * (1.0f - (fDp > 0.4f ? 1.0f : fDp / 0.4f)));
                f5 = fDp2;
                f6 = fDp3;
                f7 = fDp;
            } else {
                f2 = 0.25f;
                f3 = 0.4f;
                float fDp4 = AndroidUtilities.dp(36.0f) + ((int) (AndroidUtilities.dp(14.0f) * fDp));
                float fDp5 = (((AndroidUtilities.dp(60.0f) + measuredHeight) + ((int) (AndroidUtilities.dp(30.0f) * (1.0f - f)))) - ((int) fMax)) + (ChatActivityEnterView.this.idleProgress * fDp * (-AndroidUtilities.dp(8.0f)));
                fDpf2 = (((fDp4 / 2.0f) + fDp5) - AndroidUtilities.dpf2(8.0f)) + AndroidUtilities.dpf2(2.0f) + (AndroidUtilities.dpf2(2.0f) * fDp);
                AndroidUtilities.dpf2(16.0f);
                AndroidUtilities.dpf2(2.0f);
                AndroidUtilities.dpf2(2.0f);
                f4 = (1.0f - fDp) * 9.0f;
                ChatActivityEnterView.this.snapAnimationProgress = 0.0f;
                f5 = fDp4;
                f6 = fDp5;
                f7 = 0.0f;
            }
            if ((!ChatActivityEnterView.this.showTooltip || System.currentTimeMillis() - ChatActivityEnterView.this.showTooltipStartTime <= 200) && ChatActivityEnterView.this.tooltipAlpha == 0.0f) {
                f8 = 1.0f;
            } else {
                if (fDp < 0.8f || ChatActivityEnterView.this.sendButtonVisible || ChatActivityEnterView.this.exitTransition != 0.0f || ChatActivityEnterView.this.transformToSeekbar != 0.0f) {
                    ChatActivityEnterView.this.showTooltip = false;
                }
                if (!ChatActivityEnterView.this.showTooltip) {
                    ChatActivityEnterView.access$4824(ChatActivityEnterView.this, jCurrentTimeMillis / 150.0f);
                    if (ChatActivityEnterView.this.tooltipAlpha < 0.0f) {
                        ChatActivityEnterView.this.tooltipAlpha = 0.0f;
                    }
                } else if (ChatActivityEnterView.this.tooltipAlpha != 1.0f) {
                    ChatActivityEnterView.access$4816(ChatActivityEnterView.this, jCurrentTimeMillis / 150.0f);
                    if (ChatActivityEnterView.this.tooltipAlpha >= 1.0f) {
                        ChatActivityEnterView.this.tooltipAlpha = 1.0f;
                        SharedConfig.increaseLockRecordAudioVideoHintShowed();
                    }
                }
                int i = (int) (ChatActivityEnterView.this.tooltipAlpha * 255.0f);
                this.tooltipBackground.setAlpha(i);
                this.tooltipBackgroundArrow.setAlpha(i);
                this.tooltipPaint.setAlpha(i);
                if (this.tooltipLayout != null) {
                    canvas.save();
                    this.rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.translate((getMeasuredWidth() - this.tooltipWidth) - AndroidUtilities.dp(44.0f), AndroidUtilities.dpf2(16.0f) + measuredHeight);
                    f8 = 1.0f;
                    this.tooltipBackground.setBounds(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(2.0f), (int) (this.tooltipWidth + AndroidUtilities.dp(36.0f)), (int) (this.tooltipLayout.getHeight() + AndroidUtilities.dpf2(4.0f)));
                    this.tooltipBackground.draw(canvas);
                    this.tooltipLayout.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - AndroidUtilities.dp(26.0f), ((AndroidUtilities.dpf2(17.0f) + measuredHeight) + (this.tooltipLayout.getHeight() / 2.0f)) - (ChatActivityEnterView.this.idleProgress * AndroidUtilities.dpf2(3.0f)));
                    this.path.reset();
                    this.path.setLastPoint(-AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                    this.path.lineTo(0.0f, 0.0f);
                    this.path.lineTo(AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                    this.p.setColor(-1);
                    this.p.setAlpha(i);
                    this.p.setStyle(Paint.Style.STROKE);
                    this.p.setStrokeCap(Paint.Cap.ROUND);
                    this.p.setStrokeJoin(Paint.Join.ROUND);
                    this.p.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                    canvas.drawPath(this.path, this.p);
                    canvas.restore();
                    canvas.save();
                    Drawable drawable2 = this.tooltipBackgroundArrow;
                    drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (this.tooltipLayout.getHeight() + measuredHeight + AndroidUtilities.dpf2(20.0f)), (this.tooltipBackgroundArrow.getIntrinsicWidth() / 2) + measuredWidth, ((int) (this.tooltipLayout.getHeight() + measuredHeight + AndroidUtilities.dpf2(20.0f))) + this.tooltipBackgroundArrow.getIntrinsicHeight());
                    this.tooltipBackgroundArrow.draw(canvas);
                    canvas.restore();
                } else {
                    f8 = 1.0f;
                }
            }
            float f12 = this.hidePauseT.set(ChatActivityEnterView.this.isInVideoMode && ChatActivityEnterView.this.millisecondsRecorded >= 59000);
            if (ChatActivityEnterView.this.transformToSeekbar != 0.0f) {
                ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                if (chatActivityEnterView2.audioTimelineView != null) {
                    float f13 = chatActivityEnterView2.transformToSeekbar > 0.38f ? 1.0f : ChatActivityEnterView.this.transformToSeekbar / 0.38f;
                    float fMax3 = ChatActivityEnterView.this.transformToSeekbar > 0.63f ? 1.0f : Math.max(0.0f, (ChatActivityEnterView.this.transformToSeekbar - 0.38f) / f2);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
                    float interpolation2 = cubicBezierInterpolator.getInterpolation(f13);
                    cubicBezierInterpolator.getInterpolation(fMax3);
                    f9 = interpolation2;
                    interpolation = 0.0f;
                } else if (ChatActivityEnterView.this.exitTransition != 0.0f) {
                    if (ChatActivityEnterView.this.exitTransition > 0.6f) {
                        f10 = 1.0f;
                    } else {
                        f10 = ChatActivityEnterView.this.exitTransition / 0.6f;
                    }
                    chatActivityEnterView = ChatActivityEnterView.this;
                    if (chatActivityEnterView.messageTransitionIsRunning) {
                        fMax2 = chatActivityEnterView.exitTransition;
                    } else {
                        fMax2 = Math.max(0.0f, (chatActivityEnterView.exitTransition - 0.6f) / f3);
                    }
                    CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_BOTH;
                    float interpolation3 = cubicBezierInterpolator2.getInterpolation(f10);
                    interpolation = cubicBezierInterpolator2.getInterpolation(fMax2);
                    f9 = interpolation3;
                } else {
                    interpolation = 0.0f;
                    f9 = 0.0f;
                }
            } else if (ChatActivityEnterView.this.exitTransition != 0.0f) {
                if (ChatActivityEnterView.this.exitTransition > 0.6f) {
                    f10 = 1.0f;
                } else {
                    f10 = ChatActivityEnterView.this.exitTransition / 0.6f;
                }
                chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.messageTransitionIsRunning) {
                    fMax2 = chatActivityEnterView.exitTransition;
                } else {
                    fMax2 = Math.max(0.0f, (chatActivityEnterView.exitTransition - 0.6f) / f3);
                }
                CubicBezierInterpolator cubicBezierInterpolator3 = CubicBezierInterpolator.EASE_BOTH;
                float interpolation4 = cubicBezierInterpolator3.getInterpolation(f10);
                interpolation = cubicBezierInterpolator3.getInterpolation(fMax2);
                f9 = interpolation4;
            } else {
                interpolation = 0.0f;
                f9 = 0.0f;
            }
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ChatActivityEnterView.this.textFieldContainer.getMeasuredHeight());
            if (f8 - ChatActivityEnterView.this.controlsScale != 0.0f) {
                f11 = f8 - ChatActivityEnterView.this.controlsScale;
            } else {
                f11 = interpolation != 0.0f ? interpolation : 0.0f;
            }
            if (ChatActivityEnterView.this.slideToCancelProgress < 0.7f || ChatActivityEnterView.this.canceledByGesture) {
                ChatActivityEnterView.this.showTooltip = false;
                if (ChatActivityEnterView.this.slideToCancelLockProgress != 0.0f) {
                    ChatActivityEnterView.access$5524(ChatActivityEnterView.this, 0.12f);
                    if (ChatActivityEnterView.this.slideToCancelLockProgress < 0.0f) {
                        ChatActivityEnterView.this.slideToCancelLockProgress = 0.0f;
                    }
                }
            } else if (ChatActivityEnterView.this.slideToCancelLockProgress != f8) {
                ChatActivityEnterView.access$5516(ChatActivityEnterView.this, 0.12f);
                if (ChatActivityEnterView.this.slideToCancelLockProgress > f8) {
                    ChatActivityEnterView.this.slideToCancelLockProgress = 1.0f;
                }
            }
            float fDpf3 = AndroidUtilities.dpf2(72.0f);
            float fDpf4 = (fDpf3 * f11) + (AndroidUtilities.dpf2(24.0f) * f9 * (1.0f - f11)) + ((1.0f - ChatActivityEnterView.this.slideToCancelLockProgress) * fDpf3);
            if (fDpf4 > fDpf3) {
                fDpf4 = fDpf3;
            }
            float f14 = (1.0f - f12) * ChatActivityEnterView.this.controlsScale * (1.0f - interpolation) * ChatActivityEnterView.this.slideToCancelLockProgress;
            float f15 = measuredWidth;
            float f16 = fDpf2 + fDpf4;
            canvas.scale(f14, f14, f15, f16);
            float f17 = f6 + fDpf4;
            float f18 = f7;
            this.rectF.set(f15 - AndroidUtilities.dpf2(18.0f), f17, f15 + AndroidUtilities.dpf2(18.0f), f17 + f5);
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.lockBackgroundDrawable;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.setBounds((int) (this.rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.right + AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.bottom + AndroidUtilities.dpf2(3.0f)));
                this.lockBackgroundDrawable.draw(canvas);
            } else {
                ChatActivityEnterView.this.lockShadowDrawable.setBounds((int) (this.rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.right + AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.bottom + AndroidUtilities.dpf2(3.0f)));
                ChatActivityEnterView.this.lockShadowDrawable.draw(canvas);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), this.lockBackgroundPaint);
            }
            ChatActivityEnterView.this.pauseRect.set(this.rectF);
            scale(ChatActivityEnterView.this.pauseRect, f14);
            HintView2 hintView2 = this.pauseHint;
            if (hintView2 != null) {
                hintView2.setJointPx(0.0f, this.rectF.centerY());
                this.pauseHint.invalidate();
            }
            float f19 = 1.0f - f18;
            this.rectF.set((f15 - AndroidUtilities.dpf2(6.0f)) - (AndroidUtilities.dpf2(2.0f) * f19), f16 - (AndroidUtilities.dpf2(2.0f) * f19), measuredWidth + AndroidUtilities.dp(6.0f) + (AndroidUtilities.dpf2(2.0f) * f19), f16 + AndroidUtilities.dp(12.0f) + (AndroidUtilities.dpf2(2.0f) * f19));
            RectF rectF = this.rectF;
            float f20 = rectF.bottom;
            float fCenterX = rectF.centerX();
            float fCenterY = this.rectF.centerY();
            canvas.save();
            float fClamp = Utilities.clamp(ChatActivityEnterView.this.transformToSeekbar * 2.0f, 1.0f, 0.0f);
            int alpha = this.lockPaint.getAlpha();
            float f21 = fDpf4;
            float f22 = f4;
            float f23 = f5;
            Canvas canvas2 = canvas;
            int iSaveLayerAlpha = canvas2.saveLayerAlpha(fCenterX - AndroidUtilities.dp(24.0f), fCenterY - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f) + fCenterX, AndroidUtilities.dp(24.0f) + fCenterY, (int) (alpha * (1.0f - fClamp)), 31);
            this.lockOutlinePaint.setAlpha(255);
            this.lockPaint.setAlpha(255);
            float f24 = 1.0f - fDp;
            canvas2.translate(0.0f, AndroidUtilities.dpf2(2.0f) * f24);
            canvas2.rotate(f22, fCenterX, fCenterY);
            if (f18 != 1.0f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(8.0f));
                canvas2.save();
                canvas2.clipRect(0.0f, 0.0f, getMeasuredWidth(), f21 + f20 + (AndroidUtilities.dpf2(2.0f) * f24));
                canvas2.translate(f15 - AndroidUtilities.dpf2(4.0f), ((this.rectF.top - AndroidUtilities.dp(6.0f)) - AndroidUtilities.lerp(AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(1.5f) * (1.0f - ChatActivityEnterView.this.idleProgress), fDp)) + (AndroidUtilities.dpf2(12.0f) * f18) + (AndroidUtilities.dpf2(2.0f) * ChatActivityEnterView.this.snapAnimationProgress));
                if (f22 > 0.0f) {
                    canvas2.rotate(f22, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                }
                canvas2.drawLine(AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(6.0f) + (AndroidUtilities.dpf2(4.0f) * f19), this.lockOutlinePaint);
                canvas.drawArc(rectF2, 0.0f, -180.0f, false, this.lockOutlinePaint);
                float fDpf5 = AndroidUtilities.dpf2(4.0f);
                float fDpf6 = AndroidUtilities.dpf2(4.0f);
                float fDpf7 = AndroidUtilities.dpf2(4.0f);
                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, fDpf5, 0.0f, fDpf6 + (fDpf7 * chatActivityEnterView3.idleProgress * fDp * (!chatActivityEnterView3.sendButtonVisible ? 1 : 0)) + (AndroidUtilities.dpf2(4.0f) * ChatActivityEnterView.this.snapAnimationProgress * f24), this.lockOutlinePaint);
                canvas2.restore();
            }
            if (fClamp > 0.0f) {
                drawable = ChatActivityEnterView.this.isInVideoMode ? this.vidDrawable : this.micDrawable;
            } else {
                drawable = null;
            }
            if (f18 > 0.0f) {
                if (this.periodBackgroundDrawable == null) {
                    canvas2.drawRoundRect(this.rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), this.lockBackgroundPaint);
                }
                this.path2.rewind();
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(this.rectF);
                rectF3.right = this.rectF.centerX() - (AndroidUtilities.dp(1.66f) * f18);
                float[] fArr = this.radiiLeft;
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f18);
                fArr[7] = fLerp;
                fArr[6] = fLerp;
                fArr[1] = fLerp;
                fArr[0] = fLerp;
                float[] fArr2 = this.radiiLeft;
                float fDp6 = AndroidUtilities.dp(1.5f) * f18;
                fArr2[5] = fDp6;
                fArr2[4] = fDp6;
                fArr2[3] = fDp6;
                fArr2[2] = fDp6;
                Path path = this.path2;
                float[] fArr3 = this.radiiLeft;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF3, fArr3, direction);
                rectF3.set(this.rectF);
                rectF3.left = this.rectF.centerX() + (AndroidUtilities.dp(1.66f) * f18);
                float[] fArr4 = this.radiiRight;
                float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f18);
                fArr4[5] = fLerp2;
                fArr4[4] = fLerp2;
                fArr4[3] = fLerp2;
                fArr4[2] = fLerp2;
                float[] fArr5 = this.radiiRight;
                float fDp7 = AndroidUtilities.dp(1.5f) * f18;
                fArr5[7] = fDp7;
                fArr5[6] = fDp7;
                fArr5[1] = fDp7;
                fArr5[0] = fDp7;
                this.path2.addRoundRect(rectF3, this.radiiRight, direction);
                canvas2.drawPath(this.path2, this.lockPaint);
            } else {
                canvas2.drawRoundRect(this.rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), this.lockPaint);
            }
            this.lockPaint.setAlpha(alpha);
            this.lockOutlinePaint.setAlpha(alpha);
            canvas2.restoreToCount(iSaveLayerAlpha);
            if (drawable != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((int) (this.rectF.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (this.rectF.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (this.rectF.centerX() + ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (this.rectF.centerY() + ((drawable.getIntrinsicHeight() / 2) * 0.9285f)));
                drawable.setBounds(rect);
                drawable.setAlpha((int) (255.0f * fClamp));
                drawable.draw(canvas2);
            }
            if (f18 != 1.0f) {
                canvas2.drawCircle(fCenterX, fCenterY, AndroidUtilities.dpf2(2.0f) * f19, this.lockBackgroundPaint);
            }
            canvas2.restore();
            canvas2.restore();
            float fLerp3 = AndroidUtilities.lerp(f6, getMeasuredHeight() - AndroidUtilities.dp(118.0f), Math.max(ChatActivityEnterView.this.exitTransition, Math.min(f9, ChatActivityEnterView.this.slideToCancelLockProgress))) + f21 + (AndroidUtilities.dp(38.0f) * f12);
            this.rectF.set(f15 - AndroidUtilities.dpf2(18.0f), fLerp3, f15 + AndroidUtilities.dpf2(18.0f), fLerp3 + f23);
            ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
            chatActivityEnterView4.onceVisible = chatActivityEnterView4.delegate != null && ChatActivityEnterView.this.delegate.onceVoiceAvailable();
            if (ChatActivityEnterView.this.onceVisible) {
                float fDpf8 = AndroidUtilities.dpf2(12.0f);
                RectF rectF4 = this.rectF;
                float f25 = rectF4.left;
                float fDpf9 = (rectF4.top - AndroidUtilities.dpf2(36.0f)) - fDpf8;
                RectF rectF5 = this.rectF;
                rectF4.set(f25, fDpf9, rectF5.right, rectF5.top - fDpf8);
                HintView2 hintView3 = this.onceHint;
                if (hintView3 != null) {
                    hintView3.setJointPx(0.0f, this.rectF.centerY());
                    this.onceHint.invalidate();
                }
                this.onceRect.set(this.rectF);
                canvas2.save();
                float f26 = ChatActivityEnterView.this.controlsScale * (1.0f - ChatActivityEnterView.this.exitTransition) * ChatActivityEnterView.this.slideToCancelLockProgress * ChatActivityEnterView.this.snapAnimationProgress;
                canvas2.scale(f26, f26, this.rectF.centerX(), this.rectF.centerY());
                BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.periodBackgroundDrawable;
                if (blurredBackgroundDrawable2 != null) {
                    blurredBackgroundDrawable2.setBounds((int) (this.rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.right + AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.bottom + AndroidUtilities.dpf2(3.0f)));
                    this.periodBackgroundDrawable.draw(canvas2);
                } else {
                    ChatActivityEnterView.this.lockShadowDrawable.setBounds((int) (this.rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.right + AndroidUtilities.dpf2(3.0f)), (int) (this.rectF.bottom + AndroidUtilities.dpf2(3.0f)));
                    ChatActivityEnterView.this.lockShadowDrawable.draw(canvas2);
                    canvas2.drawRoundRect(this.rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), this.lockBackgroundPaint);
                }
                CaptionContainerView.PeriodDrawable periodDrawable = this.periodDrawable;
                RectF rectF6 = this.rectF;
                periodDrawable.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                this.periodDrawable.draw(canvas2);
                canvas2.restore();
            }
        }

        @Override
        protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.virtualViewHelper.dispatchHoverEvent(motionEvent);
        }

        public void setBlurredBackgroundFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
            this.useGlassDesign = true;
            if (this.colorProvider == null) {
                this.colorProvider = new BlurredBackgroundColorProviderThemed(ChatActivityEnterView.this.resourcesProvider, Theme.key_chat_messagePanelVoiceLockBackground);
            }
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, this.colorProvider);
            this.lockBackgroundDrawable = blurredBackgroundDrawableCreate;
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(18.0f));
            this.lockBackgroundDrawable.setPadding(AndroidUtilities.dp(3.0f));
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = blurredBackgroundDrawableViewFactory.create(this, this.colorProvider);
            this.periodBackgroundDrawable = blurredBackgroundDrawableCreate2;
            blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(18.0f));
            this.periodBackgroundDrawable.setPadding(AndroidUtilities.dp(3.0f));
            updateColors();
        }

        public void updateColors() {
            BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed = this.colorProvider;
            if (blurredBackgroundColorProviderThemed != null) {
                blurredBackgroundColorProviderThemed.updateColors();
            }
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.lockBackgroundDrawable;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.updateColors();
            }
            BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.periodBackgroundDrawable;
            if (blurredBackgroundDrawable2 != null) {
                blurredBackgroundDrawable2.updateColors();
            }
            this.periodDrawable.updateColors(ChatActivityEnterView.this.getThemedColor(this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock), ChatActivityEnterView.this.getThemedColor(Theme.key_chat_messagePanelVoiceBackground), -1);
            this.tooltipPaint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_gifSaveHintText));
            int iDp = AndroidUtilities.dp(5.0f);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i = Theme.key_chat_gifSaveHintBackground;
            this.tooltipBackground = Theme.createRoundRectDrawable(iDp, chatActivityEnterView.getThemedColor(i));
            Drawable drawable = this.tooltipBackgroundArrow;
            int themedColor = ChatActivityEnterView.this.getThemedColor(i);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            this.lockBackgroundPaint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_messagePanelVoiceLockBackground));
            this.lockPaint.setColor(ChatActivityEnterView.this.getThemedColor(this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock));
            this.lockOutlinePaint.setColor(ChatActivityEnterView.this.getThemedColor(this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock));
            this.micDrawable.setColorFilter(new PorterDuffColorFilter(ChatActivityEnterView.this.getThemedColor(this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock), mode));
            this.vidDrawable.setColorFilter(new PorterDuffColorFilter(ChatActivityEnterView.this.getThemedColor(this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock), mode));
        }

        private void scale(RectF rectF, float f) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            rectF.left = AndroidUtilities.lerp(fCenterX, rectF.left, f);
            rectF.right = AndroidUtilities.lerp(fCenterX, rectF.right, f);
            rectF.top = AndroidUtilities.lerp(fCenterY, rectF.top, f);
            rectF.bottom = AndroidUtilities.lerp(fCenterY, rectF.bottom, f);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.sendButtonVisible) {
                    this.pausePressed = ChatActivityEnterView.this.pauseRect.contains(x, y);
                }
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.onceVisible && chatActivityEnterView.recordCircle != null && ChatActivityEnterView.this.snapAnimationProgress > 0.1f) {
                    this.oncePressed = this.onceRect.contains(x, y);
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.pausePressed && ChatActivityEnterView.this.pauseRect.contains(x, y)) {
                    if (ChatActivityEnterView.this.isInVideoMode()) {
                        if (ChatActivityEnterView.this.slideText != null) {
                            ChatActivityEnterView.this.slideText.setEnabled(false);
                        }
                        ChatActivityEnterView.this.delegate.toggleVideoRecordingPause();
                    } else {
                        final Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                ChatActivityEnterView.ControlsView.$r8$lambda$2fBqdS8TCW8bVyvahkaB5GIj_8Y(this.f$0);
                            }
                        };
                        HintView2 hintView2 = this.pauseHint;
                        if (hintView2 != null && hintView2.shown()) {
                            hideHintView();
                        }
                        RecordedAudioPlayerView recordedAudioPlayerView = ChatActivityEnterView.this.audioTimelineView;
                        if (recordedAudioPlayerView != null) {
                            recordedAudioPlayerView.setPlaying(false);
                        }
                        if (MediaController.getInstance().isRecordingPaused() && (ChatActivityEnterView.this.audioTimelineView.getAudioLeft() > 0.01f || ChatActivityEnterView.this.audioTimelineView.getAudioRight() < 0.99f)) {
                            final Runnable runnable2 = new Runnable() {
                                @Override
                                public final void run() {
                                    ChatActivityEnterView.ControlsView.$r8$lambda$dQ9wdwwlsx3rnOjmhGE1SaY6fNk(this.f$0, runnable);
                                }
                            };
                            if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                                new AlertDialog.Builder(getContext(), ChatActivityEnterView.this.resourcesProvider).setTitle(LocaleController.getString(R.string.RecordingTrimTitle)).setMessage(LocaleController.getString(R.string.RecordingTrimText)).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                                    @Override
                                    public final void onClick(AlertDialog alertDialog, int i) {
                                        ChatActivityEnterView.ControlsView.m2123$r8$lambda$FY0XsNC9mcf5MkieqYHt46XKE(runnable2, alertDialog, i);
                                    }
                                }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
                            } else {
                                runnable2.run();
                            }
                        } else {
                            runnable.run();
                        }
                    }
                    this.oncePressed = false;
                    this.pausePressed = false;
                    return true;
                }
                if (this.oncePressed && this.onceRect.contains(x, y)) {
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z = !chatActivityEnterView2.voiceOnce;
                    chatActivityEnterView2.voiceOnce = z;
                    this.periodDrawable.setValue(1, z, true);
                    MediaDataController.getInstance(ChatActivityEnterView.this.currentAccount).toggleDraftVoiceOnce(ChatActivityEnterView.this.dialog_id, (ChatActivityEnterView.this.parentFragment == null || !ChatActivityEnterView.this.parentFragment.isTopic) ? 0L : ChatActivityEnterView.this.parentFragment.getTopicId(), ChatActivityEnterView.this.voiceOnce);
                    if (ChatActivityEnterView.this.voiceOnce) {
                        showOnceHint();
                    } else {
                        hideHintView();
                    }
                    invalidate();
                    this.oncePressed = false;
                    this.pausePressed = false;
                    return true;
                }
                this.oncePressed = false;
                this.pausePressed = false;
            } else if (motionEvent.getAction() == 3) {
                this.oncePressed = false;
                this.pausePressed = false;
            }
            return this.pausePressed || this.oncePressed;
        }

        public static void $r8$lambda$2fBqdS8TCW8bVyvahkaB5GIj_8Y(ControlsView controlsView) {
            controlsView.getClass();
            if (!MediaController.getInstance().isRecordingPaused()) {
                MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", 3).apply();
            }
            if (ChatActivityEnterView.this.sendButtonVisible) {
                ChatActivityEnterView.this.calledRecordRunnable = true;
            }
            MediaController.getInstance().toggleRecordingPause(ChatActivityEnterView.this.voiceOnce);
            ChatActivityEnterView.this.delegate.needStartRecordAudio(0);
            if (ChatActivityEnterView.this.slideText != null) {
                ChatActivityEnterView.this.slideText.setEnabled(false);
            }
        }

        public static void $r8$lambda$dQ9wdwwlsx3rnOjmhGE1SaY6fNk(ControlsView controlsView, Runnable runnable) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.millisecondsRecorded = chatActivityEnterView.audioTimelineView.getAudioRightMs() - ChatActivityEnterView.this.audioTimelineView.getAudioLeftMs();
            MediaController.getInstance().trimCurrentRecording(ChatActivityEnterView.this.audioTimelineView.getAudioLeftMs(), ChatActivityEnterView.this.audioTimelineView.getAudioRightMs(), runnable);
        }

        public static void m2123$r8$lambda$FY0XsNC9mcf5MkieqYHt46XKE(Runnable runnable, AlertDialog alertDialog, int i) {
            runnable.run();
            MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.periodDrawable || super.verifyDrawable(drawable);
        }

        private class VirtualViewHelper extends ExploreByTouchHelper {
            @Override
            protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
                return true;
            }

            public VirtualViewHelper(View view) {
                super(view);
            }

            @Override
            protected int getVirtualViewAt(float f, float f2) {
                if (ChatActivityEnterView.this.sendButtonVisible && ChatActivityEnterView.this.recordCircle != null && ChatActivityEnterView.this.pauseRect.contains(f, f2)) {
                    return 2;
                }
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                return (!chatActivityEnterView.onceVisible || chatActivityEnterView.recordCircle == null || ChatActivityEnterView.this.snapAnimationProgress <= 0.1f || !ControlsView.this.onceRect.contains(f, f2)) ? -1 : 4;
            }

            @Override
            protected void getVisibleVirtualViews(List list) {
                if (ChatActivityEnterView.this.sendButtonVisible) {
                    list.add(2);
                }
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (!chatActivityEnterView.onceVisible || chatActivityEnterView.recordCircle == null || ChatActivityEnterView.this.snapAnimationProgress <= 0.1f) {
                    return;
                }
                list.add(4);
            }

            @Override
            protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                if (i == 2) {
                    ChatActivityEnterView.this.rect.set((int) ChatActivityEnterView.this.pauseRect.left, (int) ChatActivityEnterView.this.pauseRect.top, (int) ChatActivityEnterView.this.pauseRect.right, (int) ChatActivityEnterView.this.pauseRect.bottom);
                    accessibilityNodeInfoCompat.setBoundsInParent(ChatActivityEnterView.this.rect);
                    accessibilityNodeInfoCompat.setText(LocaleController.getString(ChatActivityEnterView.this.transformToSeekbar > 0.5f ? R.string.AccActionResume : R.string.AccActionPause));
                } else if (i == 4) {
                    Rect rect = ChatActivityEnterView.this.rect;
                    RectF rectF = ControlsView.this.onceRect;
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    accessibilityNodeInfoCompat.setBoundsInParent(ChatActivityEnterView.this.rect);
                    accessibilityNodeInfoCompat.setText(LocaleController.getString(ChatActivityEnterView.this.voiceOnce ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
                }
            }
        }
    }

    public float getExitTransition() {
        return this.exitTransition;
    }

    public void setExitTransition(float f) {
        this.exitTransition = f;
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public float getSlideToCancelProgress() {
        return this.slideToCancelProgress;
    }

    public void setSlideToCancelProgress(float f) {
        this.slideToCancelProgress = f;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.slideDelta = (int) ((-measuredWidth) * (1.0f - this.slideToCancelProgress));
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public float getLockAnimatedTranslation() {
        return this.lockAnimatedTranslation;
    }

    public void setLockAnimatedTranslation(float f) {
        this.lockAnimatedTranslation = f;
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSnapAnimationProgress(float f) {
        this.snapAnimationProgress = f;
        invalidate();
    }

    public boolean seekbarVisible() {
        return !this.recordIsCanceled && this.transformToSeekbar > 0.0f;
    }

    public class RecordCircle extends View {
        private float amplitude;
        private float animateAmplitudeDiff;
        private float animateToAmplitude;
        BlobDrawable bigWaveDrawable;
        private float circleRadius;
        private float circleRadiusAmplitude;
        public float drawingCircleRadius;
        public float drawingCx;
        public float drawingCy;
        public float iconScale;
        boolean incIdle;
        private float lastMovingX;
        private float lastMovingY;
        private long lastUpdateTime;
        private int paintAlpha;
        public float progressToSeekbarStep3;
        private float progressToSendButton;
        RectF rectF;
        private boolean showWaves;
        public boolean skipDraw;
        BlobDrawable tinyWaveDrawable;
        private float touchSlop;
        private VirtualViewHelper virtualViewHelper;
        public boolean voiceEnterTransitionInProgress;
        private float wavesEnterAnimation;

        public RecordCircle(Context context) {
            super(context);
            this.tinyWaveDrawable = new BlobDrawable(11, 360928);
            this.bigWaveDrawable = new BlobDrawable(12, 360928);
            this.circleRadius = AndroidUtilities.dpf2(41.0f);
            this.circleRadiusAmplitude = AndroidUtilities.dp(30.0f);
            this.rectF = new RectF();
            this.wavesEnterAnimation = 0.0f;
            this.showWaves = true;
            VirtualViewHelper virtualViewHelper = new VirtualViewHelper(this);
            this.virtualViewHelper = virtualViewHelper;
            ViewCompat.setAccessibilityDelegate(this, virtualViewHelper);
            this.tinyWaveDrawable.minRadius = AndroidUtilities.dp(47.0f);
            this.tinyWaveDrawable.maxRadius = AndroidUtilities.dp(55.0f);
            this.tinyWaveDrawable.generateBlob();
            this.bigWaveDrawable.minRadius = AndroidUtilities.dp(47.0f);
            this.bigWaveDrawable.maxRadius = AndroidUtilities.dp(55.0f);
            this.bigWaveDrawable.generateBlob();
            this.iconScale = 1.0f;
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.touchSlop = scaledTouchSlop * scaledTouchSlop;
            updateColors();
        }

        private void checkDrawables() {
            if (ChatActivityEnterView.this.micDrawable != null) {
                return;
            }
            ChatActivityEnterView.this.micDrawable = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = ChatActivityEnterView.this.micDrawable;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i = Theme.key_chat_messagePanelVoicePressed;
            int themedColor = chatActivityEnterView.getThemedColor(i);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            ChatActivityEnterView.this.cameraDrawable = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            ChatActivityEnterView.this.cameraDrawable.setColorFilter(new PorterDuffColorFilter(ChatActivityEnterView.this.getThemedColor(i), mode));
            ChatActivityEnterView.this.sendDrawable = getResources().getDrawable(R.drawable.attach_send).mutate();
            ChatActivityEnterView.this.sendDrawable.setColorFilter(new PorterDuffColorFilter(ChatActivityEnterView.this.getThemedColor(i), mode));
            ChatActivityEnterView.this.micOutline = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = ChatActivityEnterView.this.micOutline;
            ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
            int i2 = Theme.key_glass_defaultIcon;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView2.getThemedColor(i2), mode));
            ChatActivityEnterView.this.cameraOutline = getResources().getDrawable(R.drawable.input_video).mutate();
            ChatActivityEnterView.this.cameraOutline.setColorFilter(new PorterDuffColorFilter(ChatActivityEnterView.this.getThemedColor(i2), mode));
        }

        public void setAmplitude(double d) {
            this.bigWaveDrawable.setValue((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.tinyWaveDrawable.setValue((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float fMin = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.animateToAmplitude = fMin;
            this.animateAmplitudeDiff = (fMin - this.amplitude) / 375.0f;
            invalidate();
        }

        public float getScale() {
            return ChatActivityEnterView.this.scale;
        }

        public void setScale(float f) {
            ChatActivityEnterView.this.scale = f;
            invalidate();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.controlsScale;
        }

        public void setControlsScale(float f) {
            ChatActivityEnterView.this.controlsScale = f;
            ControlsView controlsView = ChatActivityEnterView.this.controlsView;
            if (controlsView != null) {
                controlsView.invalidate();
            }
        }

        public boolean isSendButtonVisible() {
            return ChatActivityEnterView.this.sendButtonVisible;
        }

        public void setSendButtonInvisible() {
            ChatActivityEnterView.this.sendButtonVisible = false;
            invalidate();
            ControlsView controlsView = ChatActivityEnterView.this.controlsView;
            if (controlsView != null) {
                controlsView.invalidate();
            }
        }

        public void resetLockTranslation(boolean z) {
            if (!z) {
                ChatActivityEnterView.this.sendButtonVisible = false;
                ChatActivityEnterView.this.lockAnimatedTranslation = -1.0f;
                ChatActivityEnterView.this.startTranslation = -1.0f;
                ChatActivityEnterView.this.slideToCancelProgress = 1.0f;
                ChatActivityEnterView.this.slideToCancelLockProgress = 1.0f;
                ChatActivityEnterView.this.snapAnimationProgress = 0.0f;
                ChatActivityEnterView.this.controlsScale = 0.0f;
            }
            invalidate();
            ChatActivityEnterView.this.transformToSeekbar = 0.0f;
            ChatActivityEnterView.this.isRecordingStateChanged();
            ChatActivityEnterView.this.exitTransition = 0.0f;
            this.iconScale = 1.0f;
            ChatActivityEnterView.this.scale = 0.0f;
            ChatActivityEnterView.this.tooltipAlpha = 0.0f;
            ChatActivityEnterView.this.showTooltip = false;
            this.progressToSendButton = 0.0f;
            ChatActivityEnterView.this.canceledByGesture = false;
            ControlsView controlsView = ChatActivityEnterView.this.controlsView;
            if (controlsView != null) {
                controlsView.invalidate();
            }
        }

        public int setLockTranslation(float f) {
            if (ChatActivityEnterView.this.sendButtonVisible) {
                return 2;
            }
            if (ChatActivityEnterView.this.lockAnimatedTranslation == -1.0f) {
                ChatActivityEnterView.this.startTranslation = f;
            }
            ChatActivityEnterView.this.lockAnimatedTranslation = f;
            invalidate();
            if (ChatActivityEnterView.this.canceledByGesture || ChatActivityEnterView.this.slideToCancelProgress < 0.7f || ChatActivityEnterView.this.startTranslation - ChatActivityEnterView.this.lockAnimatedTranslation < AndroidUtilities.dp(57.0f)) {
                return 1;
            }
            ChatActivityEnterView.this.sendButtonVisible = true;
            ControlsView controlsView = ChatActivityEnterView.this.controlsView;
            if (controlsView != null) {
                controlsView.showPauseHint();
            }
            return 2;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            View.MeasureSpec.getSize(i);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                measuredWidth = AndroidUtilities.dp(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.slideDelta = (int) ((-measuredWidth) * (1.0f - chatActivityEnterView.slideToCancelProgress));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float f;
            float f2;
            int i;
            float interpolation;
            float fMax;
            float f3;
            float interpolation2;
            float f4;
            float f5;
            float f6;
            Drawable drawable;
            float f7;
            float f8;
            float f9;
            Drawable drawable2;
            Drawable drawable3;
            Drawable drawable4;
            Drawable drawable5;
            ChatActivityEnterView chatActivityEnterView;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            ChatActivityEnterView chatActivityEnterView2;
            float f17;
            float f18;
            float f19;
            if (this.skipDraw) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            int iDp = (int) (AndroidUtilities.dp(170.0f) + 0.0f);
            this.drawingCx = ChatActivityEnterView.this.slideDelta + measuredWidth;
            float f20 = iDp;
            this.drawingCy = f20;
            float f21 = ChatActivityEnterView.this.scale <= 0.5f ? ChatActivityEnterView.this.scale / 0.5f : ChatActivityEnterView.this.scale <= 0.75f ? 1.0f - (((ChatActivityEnterView.this.scale - 0.5f) / 0.25f) * 0.1f) : (((ChatActivityEnterView.this.scale - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
            float f22 = this.animateToAmplitude;
            float f23 = this.amplitude;
            if (f22 != f23) {
                float f24 = this.animateAmplitudeDiff;
                float f25 = f23 + (jCurrentTimeMillis * f24);
                this.amplitude = f25;
                if (f24 > 0.0f) {
                    if (f25 > f22) {
                        this.amplitude = f22;
                    }
                } else if (f25 < f22) {
                    this.amplitude = f22;
                }
                invalidate();
            }
            float interpolation3 = (this.circleRadius + (this.circleRadiusAmplitude * this.amplitude)) * f21 * (ChatActivityEnterView.this.canceledByGesture ? CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - ChatActivityEnterView.this.slideToCancelProgress) * 0.7f : (ChatActivityEnterView.this.slideToCancelProgress * 0.3f) + 0.7f);
            this.progressToSeekbarStep3 = 0.0f;
            if (ChatActivityEnterView.this.transformToSeekbar != 0.0f) {
                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                f = 16.0f;
                if (chatActivityEnterView3.audioTimelineView != null) {
                    float f26 = chatActivityEnterView3.transformToSeekbar > 0.38f ? 1.0f : ChatActivityEnterView.this.transformToSeekbar / 0.38f;
                    float fMax2 = ChatActivityEnterView.this.transformToSeekbar > 0.63f ? 1.0f : Math.max(0.0f, (ChatActivityEnterView.this.transformToSeekbar - 0.38f) / 0.25f);
                    i = 360928;
                    this.progressToSeekbarStep3 = Math.max(0.0f, ((ChatActivityEnterView.this.transformToSeekbar - 0.38f) - 0.25f) / 0.37f);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
                    interpolation = cubicBezierInterpolator.getInterpolation(f26);
                    float interpolation4 = cubicBezierInterpolator.getInterpolation(fMax2);
                    f2 = 0.3f;
                    this.progressToSeekbarStep3 = cubicBezierInterpolator.getInterpolation(this.progressToSeekbarStep3);
                    float fDp = interpolation3 + (AndroidUtilities.dp(16.0f) * interpolation);
                    float fDp2 = AndroidUtilities.dp(8.0f);
                    interpolation3 = ((fDp - fDp2) * (1.0f - interpolation4)) + fDp2;
                    f3 = interpolation4;
                    fMax = 1.0f;
                }
                interpolation2 = 0.0f;
                if (ChatActivityEnterView.this.canceledByGesture && ChatActivityEnterView.this.slideToCancelProgress > 0.7f) {
                    fMax *= 1.0f - ((ChatActivityEnterView.this.slideToCancelProgress - 0.7f) / f2);
                }
                if (this.progressToSeekbarStep3 > 0.0f) {
                    f4 = 0.4f;
                    f5 = 0.0f;
                    f6 = 1.0f;
                    ChatActivityEnterView.this.paint.setColor(ColorUtils.blendARGB(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_messagePanelVoiceBackground), ChatActivityEnterView.this.getThemedColor(Theme.key_chat_recordedVoiceBackground), this.progressToSeekbarStep3));
                } else {
                    f4 = 0.4f;
                    f5 = 0.0f;
                    f6 = 1.0f;
                    ChatActivityEnterView.this.paint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_messagePanelVoiceBackground));
                }
                checkDrawables();
                drawable = null;
                if (isSendButtonVisible()) {
                    f18 = this.progressToSendButton;
                    if (f18 != f6) {
                        f19 = f18 + (jCurrentTimeMillis / 150.0f);
                        this.progressToSendButton = f19;
                        if (f19 > f6) {
                            this.progressToSendButton = 1.0f;
                        }
                        if (ChatActivityEnterView.this.isInVideoMode()) {
                            drawable = ChatActivityEnterView.this.cameraDrawable;
                        } else {
                            drawable = ChatActivityEnterView.this.micDrawable;
                        }
                    }
                    drawable3 = ChatActivityEnterView.this.sendDrawable;
                    f9 = 12.0f;
                    f7 = interpolation;
                    f8 = fMax;
                    ChatActivityEnterView.this.sendRect.set(measuredWidth - (drawable3.getIntrinsicWidth() / 2), iDp - (drawable3.getIntrinsicHeight() / 2), measuredWidth + (drawable3.getIntrinsicWidth() / 2), iDp + (drawable3.getIntrinsicHeight() / 2));
                    if (drawable != null) {
                        drawable.setBounds(measuredWidth - (drawable.getIntrinsicWidth() / 2), iDp - (drawable.getIntrinsicHeight() / 2), (drawable.getIntrinsicWidth() / 2) + measuredWidth, iDp + (drawable.getIntrinsicHeight() / 2));
                    }
                } else {
                    f7 = interpolation;
                    f8 = fMax;
                    f9 = 12.0f;
                    if (ChatActivityEnterView.this.isInVideoMode()) {
                        drawable2 = ChatActivityEnterView.this.cameraDrawable;
                    } else {
                        drawable2 = ChatActivityEnterView.this.micDrawable;
                    }
                    drawable3 = drawable2;
                    ChatActivityEnterView.this.sendRect.set(measuredWidth - AndroidUtilities.dp(12.0f), iDp - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + measuredWidth, iDp + AndroidUtilities.dp(12.0f));
                }
                drawable4 = drawable3;
                drawable5 = drawable;
                drawable4.setBounds(ChatActivityEnterView.this.sendRect);
                int y = 0;
                if (this.incIdle) {
                    chatActivityEnterView2 = ChatActivityEnterView.this;
                    f17 = chatActivityEnterView2.idleProgress + 0.01f;
                    chatActivityEnterView2.idleProgress = f17;
                    if (f17 > 1.0f) {
                        this.incIdle = false;
                        chatActivityEnterView2.idleProgress = 1.0f;
                    }
                } else {
                    chatActivityEnterView = ChatActivityEnterView.this;
                    f10 = chatActivityEnterView.idleProgress - 0.01f;
                    chatActivityEnterView.idleProgress = f10;
                    if (f10 < f5) {
                        this.incIdle = true;
                        chatActivityEnterView.idleProgress = 0.0f;
                    }
                }
                if (LiteMode.isEnabled(i)) {
                    this.tinyWaveDrawable.minRadius = AndroidUtilities.dp(47.0f);
                    this.tinyWaveDrawable.maxRadius = AndroidUtilities.dp(47.0f) + (AndroidUtilities.dp(15.0f) * BlobDrawable.FORM_SMALL_MAX);
                    this.bigWaveDrawable.minRadius = AndroidUtilities.dp(50.0f);
                    this.bigWaveDrawable.maxRadius = AndroidUtilities.dp(50.0f) + (AndroidUtilities.dp(f9) * BlobDrawable.FORM_BIG_MAX);
                    this.bigWaveDrawable.updateAmplitude(jCurrentTimeMillis);
                    BlobDrawable blobDrawable = this.bigWaveDrawable;
                    blobDrawable.update(blobDrawable.amplitude, 1.01f);
                    this.tinyWaveDrawable.updateAmplitude(jCurrentTimeMillis);
                    BlobDrawable blobDrawable2 = this.tinyWaveDrawable;
                    blobDrawable2.update(blobDrawable2.amplitude, 1.02f);
                }
                this.lastUpdateTime = System.currentTimeMillis();
                if (ChatActivityEnterView.this.slideToCancelProgress > 0.7f) {
                    f11 = 1.0f;
                } else {
                    f11 = ChatActivityEnterView.this.slideToCancelProgress / 0.7f;
                }
                if (LiteMode.isEnabled(i) && f3 != 1.0f && interpolation2 < f4 && f11 > 0.0f && !ChatActivityEnterView.this.canceledByGesture) {
                    if (this.showWaves) {
                        f15 = this.wavesEnterAnimation;
                        if (f15 != 1.0f) {
                            f16 = f15 + 0.04f;
                            this.wavesEnterAnimation = f16;
                            if (f16 > 1.0f) {
                                this.wavesEnterAnimation = 1.0f;
                            }
                        }
                    }
                    if (!this.voiceEnterTransitionInProgress) {
                        float interpolation5 = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.wavesEnterAnimation);
                        canvas.save();
                        float f27 = 1.0f - f7;
                        float f28 = ChatActivityEnterView.this.scale * f27 * f11 * interpolation5 * (BlobDrawable.SCALE_BIG_MIN + (this.bigWaveDrawable.amplitude * 1.4f));
                        canvas.scale(f28, f28, ChatActivityEnterView.this.slideDelta + measuredWidth, f20);
                        this.bigWaveDrawable.draw(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, canvas, this.bigWaveDrawable.paint);
                        canvas.restore();
                        float f29 = ChatActivityEnterView.this.scale * f27 * f11 * interpolation5 * (BlobDrawable.SCALE_SMALL_MIN + (this.tinyWaveDrawable.amplitude * 1.4f));
                        canvas.save();
                        canvas.scale(f29, f29, ChatActivityEnterView.this.slideDelta + measuredWidth, f20);
                        this.tinyWaveDrawable.draw(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, canvas, this.tinyWaveDrawable.paint);
                        canvas.restore();
                    }
                }
                if (ChatActivityEnterView.this.canceledByGesture && ChatActivityEnterView.this.slideToCancelProgress < 1.0f) {
                    interpolation3 = Math.max(interpolation3, AndroidUtilities.dp(19.0f));
                }
                if (this.voiceEnterTransitionInProgress) {
                    f12 = 255.0f;
                    f13 = 1.0f;
                } else {
                    ChatActivityEnterView.this.paint.setAlpha((int) (this.paintAlpha * f8));
                    if (ChatActivityEnterView.this.scale == 1.0f) {
                        if (ChatActivityEnterView.this.transformToSeekbar != 0.0f) {
                            if (!ChatActivityEnterView.this.isInVideoMode || this.progressToSeekbarStep3 <= 0.0f) {
                                f12 = 255.0f;
                                canvas.drawCircle(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, (1.0f - this.progressToSeekbarStep3) * interpolation3, ChatActivityEnterView.this.paint);
                            } else {
                                ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
                                if (chatActivityEnterView4.audioTimelineView != null) {
                                    float f30 = f20 + interpolation3;
                                    float f31 = f20 - interpolation3;
                                    float f32 = chatActivityEnterView4.slideDelta + measuredWidth + interpolation3;
                                    float f33 = (ChatActivityEnterView.this.slideDelta + measuredWidth) - interpolation3;
                                    RecordedAudioPlayerView recordedAudioPlayerView = ChatActivityEnterView.this.audioTimelineView;
                                    int x = 0;
                                    f12 = 255.0f;
                                    for (View view = (View) recordedAudioPlayerView.getParent(); view != getParent(); view = (View) view.getParent()) {
                                        y = (int) (y + view.getY());
                                        x = (int) (x + view.getX());
                                    }
                                    float f34 = y;
                                    float y2 = (recordedAudioPlayerView.getY() + f34) - getY();
                                    float y3 = ((recordedAudioPlayerView.getY() + recordedAudioPlayerView.getMeasuredHeight()) + f34) - getY();
                                    float f35 = x;
                                    float x2 = (((recordedAudioPlayerView.getX() + recordedAudioPlayerView.getMeasuredWidth()) + f35) - getX()) - ChatActivityEnterView.this.horizontalPadding;
                                    float x3 = ((recordedAudioPlayerView.getX() + f35) - getX()) + ChatActivityEnterView.this.horizontalPadding;
                                    float measuredHeight = ChatActivityEnterView.this.isInVideoMode() ? 0.0f : recordedAudioPlayerView.getMeasuredHeight() / 2.0f;
                                    float fLerp = AndroidUtilities.lerp(f31, y2, this.progressToSeekbarStep3);
                                    float fLerp2 = AndroidUtilities.lerp(f30, y3, this.progressToSeekbarStep3);
                                    float fLerp3 = AndroidUtilities.lerp(f33, x3, this.progressToSeekbarStep3);
                                    float fLerp4 = AndroidUtilities.lerp(f32, x2, this.progressToSeekbarStep3);
                                    AndroidUtilities.lerp(interpolation3, measuredHeight, this.progressToSeekbarStep3);
                                    this.rectF.set(fLerp3, fLerp, fLerp4, fLerp2);
                                    ChatActivityEnterView.this.audioTimelineView.drawIn(canvas, this.rectF, this.progressToSeekbarStep3);
                                } else {
                                    f12 = 255.0f;
                                    canvas.drawCircle(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, (1.0f - this.progressToSeekbarStep3) * interpolation3, ChatActivityEnterView.this.paint);
                                }
                            }
                        } else {
                            f12 = 255.0f;
                            canvas.drawCircle(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, interpolation3, ChatActivityEnterView.this.paint);
                        }
                        canvas.save();
                        f13 = 1.0f;
                        canvas.translate(ChatActivityEnterView.this.slideDelta, 0.0f);
                        drawable4 = drawable4;
                        drawable5 = drawable5;
                        drawIconInternal(canvas, drawable4, drawable5, this.progressToSendButton, (int) ((1.0f - f3) * (1.0f - interpolation2) * f12));
                        canvas.restore();
                    } else {
                        f12 = 255.0f;
                        f13 = 1.0f;
                    }
                }
                if (ChatActivityEnterView.this.scale != f13) {
                    canvas.drawCircle(measuredWidth + ChatActivityEnterView.this.slideDelta, f20, interpolation3, ChatActivityEnterView.this.paint);
                    if (ChatActivityEnterView.this.canceledByGesture) {
                        f14 = 1.0f - ChatActivityEnterView.this.slideToCancelProgress;
                    } else {
                        f14 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(ChatActivityEnterView.this.slideDelta, 0.0f);
                    drawIconInternal(canvas, drawable4, drawable5, this.progressToSendButton, (int) (f14 * f12));
                    canvas.restore();
                }
                this.drawingCircleRadius = interpolation3;
            }
            f = 16.0f;
            f2 = 0.3f;
            i = 360928;
            if (ChatActivityEnterView.this.exitTransition != 0.0f) {
                float f36 = ChatActivityEnterView.this.exitTransition > 0.6f ? 1.0f : ChatActivityEnterView.this.exitTransition / 0.6f;
                ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                boolean z = chatActivityEnterView5.messageTransitionIsRunning;
                float fMax3 = chatActivityEnterView5.exitTransition;
                if (!z) {
                    fMax3 = Math.max(0.0f, (fMax3 - 0.6f) / 0.4f);
                }
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_BOTH;
                interpolation = cubicBezierInterpolator2.getInterpolation(f36);
                interpolation2 = cubicBezierInterpolator2.getInterpolation(fMax3);
                interpolation3 = (interpolation3 + (AndroidUtilities.dp(f) * interpolation)) * (1.0f - interpolation2);
                fMax = (!LiteMode.isEnabled(360928) || ChatActivityEnterView.this.exitTransition <= 0.6f) ? 1.0f : Math.max(0.0f, 1.0f - ((ChatActivityEnterView.this.exitTransition - 0.6f) / 0.4f));
                f3 = 0.0f;
            } else {
                interpolation = 0.0f;
                fMax = 1.0f;
                f3 = 0.0f;
                interpolation2 = 0.0f;
            }
            if (ChatActivityEnterView.this.canceledByGesture) {
                fMax *= 1.0f - ((ChatActivityEnterView.this.slideToCancelProgress - 0.7f) / f2);
            }
            if (this.progressToSeekbarStep3 > 0.0f) {
                f4 = 0.4f;
                f5 = 0.0f;
                f6 = 1.0f;
                ChatActivityEnterView.this.paint.setColor(ColorUtils.blendARGB(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_messagePanelVoiceBackground), ChatActivityEnterView.this.getThemedColor(Theme.key_chat_recordedVoiceBackground), this.progressToSeekbarStep3));
            } else {
                f4 = 0.4f;
                f5 = 0.0f;
                f6 = 1.0f;
                ChatActivityEnterView.this.paint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_messagePanelVoiceBackground));
            }
            checkDrawables();
            drawable = null;
            if (isSendButtonVisible()) {
                f18 = this.progressToSendButton;
                if (f18 != f6) {
                    f19 = f18 + (jCurrentTimeMillis / 150.0f);
                    this.progressToSendButton = f19;
                    if (f19 > f6) {
                        this.progressToSendButton = 1.0f;
                    }
                    if (ChatActivityEnterView.this.isInVideoMode()) {
                        drawable = ChatActivityEnterView.this.cameraDrawable;
                    } else {
                        drawable = ChatActivityEnterView.this.micDrawable;
                    }
                }
                drawable3 = ChatActivityEnterView.this.sendDrawable;
                f9 = 12.0f;
                f7 = interpolation;
                f8 = fMax;
                ChatActivityEnterView.this.sendRect.set(measuredWidth - (drawable3.getIntrinsicWidth() / 2), iDp - (drawable3.getIntrinsicHeight() / 2), measuredWidth + (drawable3.getIntrinsicWidth() / 2), iDp + (drawable3.getIntrinsicHeight() / 2));
                if (drawable != null) {
                    drawable.setBounds(measuredWidth - (drawable.getIntrinsicWidth() / 2), iDp - (drawable.getIntrinsicHeight() / 2), (drawable.getIntrinsicWidth() / 2) + measuredWidth, iDp + (drawable.getIntrinsicHeight() / 2));
                }
            } else {
                f7 = interpolation;
                f8 = fMax;
                f9 = 12.0f;
                if (ChatActivityEnterView.this.isInVideoMode()) {
                    drawable2 = ChatActivityEnterView.this.cameraDrawable;
                } else {
                    drawable2 = ChatActivityEnterView.this.micDrawable;
                }
                drawable3 = drawable2;
                ChatActivityEnterView.this.sendRect.set(measuredWidth - AndroidUtilities.dp(12.0f), iDp - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + measuredWidth, iDp + AndroidUtilities.dp(12.0f));
            }
            drawable4 = drawable3;
            drawable5 = drawable;
            drawable4.setBounds(ChatActivityEnterView.this.sendRect);
            int y4 = 0;
            if (this.incIdle) {
                chatActivityEnterView2 = ChatActivityEnterView.this;
                f17 = chatActivityEnterView2.idleProgress + 0.01f;
                chatActivityEnterView2.idleProgress = f17;
                if (f17 > 1.0f) {
                    this.incIdle = false;
                    chatActivityEnterView2.idleProgress = 1.0f;
                }
            } else {
                chatActivityEnterView = ChatActivityEnterView.this;
                f10 = chatActivityEnterView.idleProgress - 0.01f;
                chatActivityEnterView.idleProgress = f10;
                if (f10 < f5) {
                    this.incIdle = true;
                    chatActivityEnterView.idleProgress = 0.0f;
                }
            }
            if (LiteMode.isEnabled(i)) {
                this.tinyWaveDrawable.minRadius = AndroidUtilities.dp(47.0f);
                this.tinyWaveDrawable.maxRadius = AndroidUtilities.dp(47.0f) + (AndroidUtilities.dp(15.0f) * BlobDrawable.FORM_SMALL_MAX);
                this.bigWaveDrawable.minRadius = AndroidUtilities.dp(50.0f);
                this.bigWaveDrawable.maxRadius = AndroidUtilities.dp(50.0f) + (AndroidUtilities.dp(f9) * BlobDrawable.FORM_BIG_MAX);
                this.bigWaveDrawable.updateAmplitude(jCurrentTimeMillis);
                BlobDrawable blobDrawable3 = this.bigWaveDrawable;
                blobDrawable3.update(blobDrawable3.amplitude, 1.01f);
                this.tinyWaveDrawable.updateAmplitude(jCurrentTimeMillis);
                BlobDrawable blobDrawable4 = this.tinyWaveDrawable;
                blobDrawable4.update(blobDrawable4.amplitude, 1.02f);
            }
            this.lastUpdateTime = System.currentTimeMillis();
            if (ChatActivityEnterView.this.slideToCancelProgress > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = ChatActivityEnterView.this.slideToCancelProgress / 0.7f;
            }
            if (LiteMode.isEnabled(i)) {
                if (this.showWaves) {
                    f15 = this.wavesEnterAnimation;
                    if (f15 != 1.0f) {
                        f16 = f15 + 0.04f;
                        this.wavesEnterAnimation = f16;
                        if (f16 > 1.0f) {
                            this.wavesEnterAnimation = 1.0f;
                        }
                    }
                }
                if (!this.voiceEnterTransitionInProgress) {
                    float interpolation6 = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.wavesEnterAnimation);
                    canvas.save();
                    float f210 = 1.0f - f7;
                    float f211 = ChatActivityEnterView.this.scale * f210 * f11 * interpolation6 * (BlobDrawable.SCALE_BIG_MIN + (this.bigWaveDrawable.amplitude * 1.4f));
                    canvas.scale(f211, f211, ChatActivityEnterView.this.slideDelta + measuredWidth, f20);
                    this.bigWaveDrawable.draw(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, canvas, this.bigWaveDrawable.paint);
                    canvas.restore();
                    float f212 = ChatActivityEnterView.this.scale * f210 * f11 * interpolation6 * (BlobDrawable.SCALE_SMALL_MIN + (this.tinyWaveDrawable.amplitude * 1.4f));
                    canvas.save();
                    canvas.scale(f212, f212, ChatActivityEnterView.this.slideDelta + measuredWidth, f20);
                    this.tinyWaveDrawable.draw(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, canvas, this.tinyWaveDrawable.paint);
                    canvas.restore();
                }
            }
            if (ChatActivityEnterView.this.canceledByGesture) {
                interpolation3 = Math.max(interpolation3, AndroidUtilities.dp(19.0f));
            }
            if (this.voiceEnterTransitionInProgress) {
                ChatActivityEnterView.this.paint.setAlpha((int) (this.paintAlpha * f8));
                if (ChatActivityEnterView.this.scale == 1.0f) {
                    if (ChatActivityEnterView.this.transformToSeekbar != 0.0f) {
                        if (ChatActivityEnterView.this.isInVideoMode) {
                            f12 = 255.0f;
                            canvas.drawCircle(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, (1.0f - this.progressToSeekbarStep3) * interpolation3, ChatActivityEnterView.this.paint);
                        } else {
                            f12 = 255.0f;
                            canvas.drawCircle(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, (1.0f - this.progressToSeekbarStep3) * interpolation3, ChatActivityEnterView.this.paint);
                        }
                    } else {
                        f12 = 255.0f;
                        canvas.drawCircle(ChatActivityEnterView.this.slideDelta + measuredWidth, f20, interpolation3, ChatActivityEnterView.this.paint);
                    }
                    canvas.save();
                    f13 = 1.0f;
                    canvas.translate(ChatActivityEnterView.this.slideDelta, 0.0f);
                    drawable4 = drawable4;
                    drawable5 = drawable5;
                    drawIconInternal(canvas, drawable4, drawable5, this.progressToSendButton, (int) ((1.0f - f3) * (1.0f - interpolation2) * f12));
                    canvas.restore();
                } else {
                    f12 = 255.0f;
                    f13 = 1.0f;
                }
            } else {
                f12 = 255.0f;
                f13 = 1.0f;
            }
            if (ChatActivityEnterView.this.scale != f13) {
                canvas.drawCircle(measuredWidth + ChatActivityEnterView.this.slideDelta, f20, interpolation3, ChatActivityEnterView.this.paint);
                if (ChatActivityEnterView.this.canceledByGesture) {
                    f14 = 1.0f - ChatActivityEnterView.this.slideToCancelProgress;
                } else {
                    f14 = 1.0f;
                }
                canvas.save();
                canvas.translate(ChatActivityEnterView.this.slideDelta, 0.0f);
                drawIconInternal(canvas, drawable4, drawable5, this.progressToSendButton, (int) (f14 * f12));
                canvas.restore();
            }
            this.drawingCircleRadius = interpolation3;
        }

        @Override
        public void invalidate() {
            super.invalidate();
            ControlsView controlsView = ChatActivityEnterView.this.controlsView;
            if (controlsView != null) {
                controlsView.invalidate();
            }
        }

        public void drawIcon(Canvas canvas, int i, int i2, float f) {
            Drawable drawable;
            checkDrawables();
            Drawable drawable2 = null;
            if (isSendButtonVisible()) {
                if (this.progressToSendButton != 1.0f) {
                    drawable2 = ChatActivityEnterView.this.isInVideoMode() ? ChatActivityEnterView.this.cameraDrawable : ChatActivityEnterView.this.micDrawable;
                }
                drawable = ChatActivityEnterView.this.sendDrawable;
                ChatActivityEnterView.this.sendRect.set(i - (drawable.getIntrinsicWidth() / 2), i2 - (drawable.getIntrinsicHeight() / 2), (drawable.getIntrinsicWidth() / 2) + i, (drawable.getIntrinsicHeight() / 2) + i2);
                if (drawable2 != null) {
                    drawable2.setBounds(i - (drawable2.getIntrinsicWidth() / 2), i2 - (drawable2.getIntrinsicHeight() / 2), (drawable2.getIntrinsicWidth() / 2) + i, (drawable2.getIntrinsicHeight() / 2) + i2);
                }
            } else {
                drawable = ChatActivityEnterView.this.isInVideoMode() ? ChatActivityEnterView.this.cameraDrawable : ChatActivityEnterView.this.micDrawable;
                ChatActivityEnterView.this.sendRect.set(i - AndroidUtilities.dp(12.0f), i2 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i, AndroidUtilities.dp(12.0f) + i2);
            }
            Drawable drawable3 = drawable2;
            Drawable drawable4 = drawable;
            drawable4.setBounds(ChatActivityEnterView.this.sendRect);
            drawIconInternal(canvas, drawable4, drawable3, this.progressToSendButton, (int) (255.0f * f));
        }

        private void drawIconInternal(Canvas canvas, Drawable drawable, Drawable drawable2, float f, int i) {
            checkDrawables();
            if (f == 0.0f || f == 1.0f || drawable2 == null) {
                if (!ChatActivityEnterView.this.canceledByGesture || ChatActivityEnterView.this.slideToCancelProgress != 1.0f) {
                    if (!ChatActivityEnterView.this.canceledByGesture || ChatActivityEnterView.this.slideToCancelProgress >= 1.0f) {
                        if (ChatActivityEnterView.this.canceledByGesture) {
                            return;
                        }
                        drawable.setAlpha(i);
                        drawable.draw(canvas);
                        return;
                    }
                    drawable.setAlpha(255);
                    drawable.draw(canvas);
                    return;
                }
                ChatActivityEnterView.this.audioVideoSendButton.setAlpha(1.0f);
                setVisibility(8);
                return;
            }
            canvas.save();
            canvas.scale(f, f, drawable.getBounds().centerX(), drawable.getBounds().centerY());
            float f2 = i;
            drawable.setAlpha((int) (f2 * f));
            drawable.draw(canvas);
            canvas.restore();
            canvas.save();
            float f3 = 1.0f - f;
            canvas.scale(f3, f3, drawable.getBounds().centerX(), drawable.getBounds().centerY());
            drawable2.setAlpha((int) (f2 * f3));
            drawable2.draw(canvas);
            canvas.restore();
        }

        @Override
        protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.virtualViewHelper.dispatchHoverEvent(motionEvent);
        }

        public void setTransformToSeekbar(float f) {
            ChatActivityEnterView.this.transformToSeekbar = f;
            invalidate();
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.progressToSeekbarStep3;
        }

        public void updateColors() {
            Paint paint = ChatActivityEnterView.this.paint;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i = Theme.key_chat_messagePanelVoiceBackground;
            paint.setColor(chatActivityEnterView.getThemedColor(i));
            this.tinyWaveDrawable.paint.setColor(ColorUtils.setAlphaComponent(ChatActivityEnterView.this.getThemedColor(i), 38));
            this.bigWaveDrawable.paint.setColor(ColorUtils.setAlphaComponent(ChatActivityEnterView.this.getThemedColor(i), 76));
            this.paintAlpha = ChatActivityEnterView.this.paint.getAlpha();
        }

        public void canceledByGesture() {
            ChatActivityEnterView.this.canceledByGesture = true;
        }

        public void setMovingCords(float f, float f2) {
            float f3 = f - this.lastMovingX;
            float f4 = f2 - this.lastMovingY;
            float f5 = (f3 * f3) + (f4 * f4);
            this.lastMovingY = f2;
            this.lastMovingX = f;
            if (ChatActivityEnterView.this.showTooltip && ChatActivityEnterView.this.tooltipAlpha == 0.0f && f5 > this.touchSlop) {
                ChatActivityEnterView.this.showTooltipStartTime = System.currentTimeMillis();
            }
        }

        public void showWaves(boolean z, boolean z2) {
            if (!z2) {
                this.wavesEnterAnimation = z ? 1.0f : 0.5f;
            }
            this.showWaves = z;
        }

        public void drawWaves(Canvas canvas, float f, float f2, float f3) {
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.wavesEnterAnimation);
            float f4 = ChatActivityEnterView.this.slideToCancelProgress > 0.7f ? 1.0f : ChatActivityEnterView.this.slideToCancelProgress / 0.7f;
            canvas.save();
            float f5 = ChatActivityEnterView.this.scale * f4 * interpolation * (BlobDrawable.SCALE_BIG_MIN + (this.bigWaveDrawable.amplitude * 1.4f)) * f3;
            canvas.scale(f5, f5, f, f2);
            BlobDrawable blobDrawable = this.bigWaveDrawable;
            blobDrawable.draw(f, f2, canvas, blobDrawable.paint);
            canvas.restore();
            float f6 = ChatActivityEnterView.this.scale * f4 * interpolation * (BlobDrawable.SCALE_SMALL_MIN + (this.tinyWaveDrawable.amplitude * 1.4f)) * f3;
            canvas.save();
            canvas.scale(f6, f6, f, f2);
            BlobDrawable blobDrawable2 = this.tinyWaveDrawable;
            blobDrawable2.draw(f, f2, canvas, blobDrawable2.paint);
            canvas.restore();
        }

        private class VirtualViewHelper extends ExploreByTouchHelper {
            private int[] coords;

            @Override
            protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
                return true;
            }

            public VirtualViewHelper(View view) {
                super(view);
                this.coords = new int[2];
            }

            @Override
            protected int getVirtualViewAt(float f, float f2) {
                if (!RecordCircle.this.isSendButtonVisible() || ChatActivityEnterView.this.recordCircle == null) {
                    return -1;
                }
                if (ChatActivityEnterView.this.sendRect.contains((int) f, (int) f2)) {
                    return 1;
                }
                if (ChatActivityEnterView.this.pauseRect.contains(f, f2)) {
                    return 2;
                }
                if (ChatActivityEnterView.this.slideText == null || ChatActivityEnterView.this.slideText.cancelRect == null) {
                    return -1;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(ChatActivityEnterView.this.slideText.cancelRect);
                ChatActivityEnterView.this.slideText.getLocationOnScreen(this.coords);
                int[] iArr = this.coords;
                rectF.offset(iArr[0], iArr[1]);
                ChatActivityEnterView.this.recordCircle.getLocationOnScreen(this.coords);
                int[] iArr2 = this.coords;
                rectF.offset(-iArr2[0], -iArr2[1]);
                return rectF.contains(f, f2) ? 3 : -1;
            }

            @Override
            protected void getVisibleVirtualViews(List list) {
                if (RecordCircle.this.isSendButtonVisible()) {
                    list.add(1);
                    list.add(3);
                }
            }

            @Override
            protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                if (i == 1) {
                    accessibilityNodeInfoCompat.setBoundsInParent(ChatActivityEnterView.this.sendRect);
                    accessibilityNodeInfoCompat.setText(LocaleController.getString("Send", R.string.Send));
                    return;
                }
                if (i == 2) {
                    ChatActivityEnterView.this.rect.set((int) ChatActivityEnterView.this.pauseRect.left, (int) ChatActivityEnterView.this.pauseRect.top, (int) ChatActivityEnterView.this.pauseRect.right, (int) ChatActivityEnterView.this.pauseRect.bottom);
                    accessibilityNodeInfoCompat.setBoundsInParent(ChatActivityEnterView.this.rect);
                    accessibilityNodeInfoCompat.setText(LocaleController.getString(R.string.Stop));
                    return;
                }
                if (i != 3 || ChatActivityEnterView.this.recordCircle == null) {
                    return;
                }
                if (ChatActivityEnterView.this.slideText != null && ChatActivityEnterView.this.slideText.cancelRect != null) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(ChatActivityEnterView.this.slideText.cancelRect);
                    ChatActivityEnterView.this.slideText.getLocationOnScreen(this.coords);
                    int[] iArr = this.coords;
                    rect.offset(iArr[0], iArr[1]);
                    ChatActivityEnterView.this.recordCircle.getLocationOnScreen(this.coords);
                    int[] iArr2 = this.coords;
                    rect.offset(-iArr2[0], -iArr2[1]);
                    accessibilityNodeInfoCompat.setBoundsInParent(rect);
                }
                accessibilityNodeInfoCompat.setText(LocaleController.getString("Cancel", R.string.Cancel));
            }
        }
    }

    public ChatActivityEnterView(Activity activity, SizeNotifierFrameLayout sizeNotifierFrameLayout, ChatActivity chatActivity, boolean z) {
        this(activity, sizeNotifierFrameLayout, chatActivity, z, null);
    }

    public ChatActivityEnterView(final Activity activity, SizeNotifierFrameLayout sizeNotifierFrameLayout, final ChatActivity chatActivity, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        int i;
        String str;
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate;
        super(activity);
        this.emojiButtonScale = 1.0f;
        this.emojiButtonAlpha = 1.0f;
        this.emojiButtonPaddingScale = 1.0f;
        this.emojiButtonPaddingAlpha = 1.0f;
        this.attachLayoutAlpha = 1.0f;
        this.attachLayoutPaddingAlpha = 1.0f;
        this.horizontalPadding = 0.0f;
        this.sendButtonEnabled = true;
        int i2 = UserConfig.selectedAccount;
        this.currentAccount = i2;
        this.accountInstance = AccountInstance.getInstance(i2);
        this.lineCount = 1;
        this.currentLimit = -1;
        this.botMenuButtonType = BotMenuButtonType.NO_BUTTON;
        this.sendRoundEnabled = true;
        this.sendVoiceEnabled = true;
        this.sendPlainEnabled = true;
        this.animationParamsX = new HashMap();
        this.mediaMessageButtonsDelegate = new View.AccessibilityDelegate() {
            @Override
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.ImageButton");
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.setLongClickable(true);
            }
        };
        this.ctrlPressed = false;
        this.shiftPressed = false;
        this.attachButtonAlpha = 1.0f;
        this.currentPopupContentType = -1;
        this.isPaused = true;
        this.startedDraggingX = -1.0f;
        this.distCanMove = AndroidUtilities.dp(80.0f);
        this.location = new int[2];
        this.messageWebPageSearch = true;
        this.animatingContentType = -1;
        this.doneButtonEnabledProgress = 1.0f;
        this.doneButtonEnabled = true;
        this.openKeyboardRunnable = new Runnable() {
            @Override
            public void run() {
                if ((ChatActivityEnterView.this.hasBotWebView() && ChatActivityEnterView.this.botCommandsMenuIsShowing()) || BaseFragment.hasSheets(ChatActivityEnterView.this.parentFragment) || ChatActivityEnterView.this.destroyed) {
                    return;
                }
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.messageEditText == null || !chatActivityEnterView.waitingForKeyboardOpen || ChatActivityEnterView.this.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    return;
                }
                if (ChatActivityEnterView.this.delegate != null) {
                    ChatActivityEnterView.this.delegate.onKeyboardRequested();
                }
                ChatActivityEnterView.this.messageEditText.requestFocus();
                AndroidUtilities.showKeyboard(ChatActivityEnterView.this.messageEditText);
                AndroidUtilities.cancelRunOnUIThread(ChatActivityEnterView.this.openKeyboardRunnable);
                AndroidUtilities.runOnUIThread(ChatActivityEnterView.this.openKeyboardRunnable, 100L);
            }
        };
        this.updateExpandabilityRunnable = new Runnable() {
            private int lastKnownPage = -1;

            @Override
            public void run() {
                int currentPage;
                if (ChatActivityEnterView.this.emojiView == null || (currentPage = ChatActivityEnterView.this.emojiView.getCurrentPage()) == this.lastKnownPage) {
                    return;
                }
                this.lastKnownPage = currentPage;
                boolean z2 = ChatActivityEnterView.this.stickersTabOpen;
                ChatActivityEnterView.this.stickersTabOpen = currentPage == 1 || currentPage == 2;
                boolean z3 = ChatActivityEnterView.this.emojiTabOpen;
                ChatActivityEnterView.this.emojiTabOpen = currentPage == 0;
                if (ChatActivityEnterView.this.stickersExpanded) {
                    if (ChatActivityEnterView.this.searchingType != 0) {
                        ChatActivityEnterView.this.setSearchingTypeInternal(currentPage != 0 ? 1 : 2, true);
                        ChatActivityEnterView.this.checkStickresExpandHeight();
                    } else if (!ChatActivityEnterView.this.stickersTabOpen) {
                        ChatActivityEnterView.this.setStickersExpanded(false, true, false);
                    }
                }
                if (z2 == ChatActivityEnterView.this.stickersTabOpen && z3 == ChatActivityEnterView.this.emojiTabOpen) {
                    return;
                }
                ChatActivityEnterView.this.checkSendButton(true);
            }
        };
        this.roundedTranslationYProperty = new Property(Integer.class, "translationY") {
            @Override
            public Integer get(View view) {
                return Integer.valueOf(Math.round(view.getTranslationY()));
            }

            @Override
            public void set(View view, Integer num) {
                view.setTranslationY(num.intValue());
            }
        };
        Class<Float> cls = Float.class;
        this.recordCircleScale = new Property(cls, "scale") {
            @Override
            public Float get(RecordCircle recordCircle) {
                return Float.valueOf(recordCircle.getScale());
            }

            @Override
            public void set(RecordCircle recordCircle, Float f) {
                recordCircle.setScale(f.floatValue());
            }
        };
        this.recordControlsCircleScale = new Property(cls, "controlsScale") {
            @Override
            public Float get(RecordCircle recordCircle) {
                return Float.valueOf(recordCircle.getControlsScale());
            }

            @Override
            public void set(RecordCircle recordCircle, Float f) {
                recordCircle.setControlsScale(f.floatValue());
            }
        };
        this.redDotPaint = new Paint(1);
        this.onFinishInitCameraRunnable = new Runnable() {
            @Override
            public void run() {
                if (ChatActivityEnterView.this.delegate != null) {
                    ChatActivityEnterView.this.delegate.needStartRecordVideo(0, true, 0, 0, 0, 0L, 0L);
                }
            }
        };
        this.recordAudioVideoRunnable = new Runnable() {
            @Override
            public void run() {
                if (ChatActivityEnterView.this.delegate == null || ChatActivityEnterView.this.parentActivity == null) {
                    return;
                }
                ChatActivityEnterView.this.delegate.onPreAudioVideoRecord();
                ChatActivityEnterView.this.calledRecordRunnable = true;
                ChatActivityEnterView.this.recordAudioVideoRunnableStarted = false;
                if (ChatActivityEnterView.this.slideText != null) {
                    ChatActivityEnterView.this.slideText.setAlpha(1.0f);
                    ChatActivityEnterView.this.slideText.setTranslationY(0.0f);
                }
                ChatActivityEnterView.this.audioToSendPath = null;
                ChatActivityEnterView.this.audioToSend = null;
                if (ChatActivityEnterView.this.isInVideoMode()) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        boolean z2 = ChatActivityEnterView.this.parentActivity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
                        boolean z3 = ChatActivityEnterView.this.parentActivity.checkSelfPermission("android.permission.CAMERA") == 0;
                        if (!z2 || !z3) {
                            String[] strArr = new String[(z2 || z3) ? 1 : 2];
                            if (!z2 && !z3) {
                                strArr[0] = "android.permission.RECORD_AUDIO";
                                strArr[1] = "android.permission.CAMERA";
                            } else if (!z2) {
                                strArr[0] = "android.permission.RECORD_AUDIO";
                            } else {
                                strArr[0] = "android.permission.CAMERA";
                            }
                            ChatActivityEnterView.this.parentActivity.requestPermissions(strArr, 150);
                            return;
                        }
                    }
                    if (!CameraController.getInstance().isCameraInitied()) {
                        CameraController.getInstance().initCamera(ChatActivityEnterView.this.onFinishInitCameraRunnable);
                    } else {
                        ChatActivityEnterView.this.onFinishInitCameraRunnable.run();
                    }
                    if (ChatActivityEnterView.this.recordingAudioVideo) {
                        return;
                    }
                    ChatActivityEnterView.this.recordingAudioVideo = true;
                    ChatActivityEnterView.this.updateRecordInterface(0, true);
                    if (ChatActivityEnterView.this.recordCircle != null) {
                        ChatActivityEnterView.this.recordCircle.showWaves(false, false);
                    }
                    if (ChatActivityEnterView.this.recordTimerView != null) {
                        ChatActivityEnterView.this.recordTimerView.reset();
                        return;
                    }
                    return;
                }
                if (Build.VERSION.SDK_INT < 23 || ChatActivityEnterView.this.parentActivity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                    ChatActivityEnterView.this.delegate.needStartRecordAudio(1);
                    ChatActivityEnterView.this.startedDraggingX = -1.0f;
                    TL_stories.StoryItem replyToStory = ChatActivityEnterView.this.delegate != null ? ChatActivityEnterView.this.delegate.getReplyToStory() : null;
                    MediaController mediaController = MediaController.getInstance();
                    int i3 = ChatActivityEnterView.this.currentAccount;
                    long j = ChatActivityEnterView.this.dialog_id;
                    MessageObject messageObject = ChatActivityEnterView.this.replyingMessageObject;
                    MessageObject threadMessage = ChatActivityEnterView.this.getThreadMessage();
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    mediaController.startRecording(i3, j, messageObject, threadMessage, replyToStory, chatActivityEnterView.recordingGuid, true, chatActivityEnterView.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null, ChatActivityEnterView.this.getSendMonoForumPeerId(), ChatActivityEnterView.this.getSendMessageSuggestionParams());
                    ChatActivityEnterView.this.recordingAudioVideo = true;
                    ChatActivityEnterView.this.updateRecordInterface(0, true);
                    if (ChatActivityEnterView.this.recordTimerView != null) {
                        ChatActivityEnterView.this.recordTimerView.start(0L);
                    }
                    if (ChatActivityEnterView.this.recordDot != null) {
                        ChatActivityEnterView.this.recordDot.enterAnimation = false;
                    }
                    ChatActivityEnterView.this.audioVideoButtonContainer.getParent().requestDisallowInterceptTouchEvent(true);
                    if (ChatActivityEnterView.this.recordCircle != null) {
                        ChatActivityEnterView.this.recordCircle.showWaves(true, false);
                        return;
                    }
                    return;
                }
                ChatActivityEnterView.this.parentActivity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            }
        };
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.paint = new Paint(1);
        this.pauseRect = new RectF();
        this.sendRect = new Rect();
        this.rect = new Rect();
        this.runEmojiPanelAnimation = new Runnable() {
            @Override
            public void run() {
                if (ChatActivityEnterView.this.panelAnimation == null || ChatActivityEnterView.this.panelAnimation.isRunning()) {
                    return;
                }
                ChatActivityEnterView.this.panelAnimation.start();
            }
        };
        this.EMOJI_BUTTON_SCALE = new Property(cls, "emoji_button_scale") {
            @Override
            public Float get(View view) {
                return Float.valueOf(ChatActivityEnterView.this.emojiButtonScale);
            }

            @Override
            public void set(View view, Float f) {
                ChatActivityEnterView.this.emojiButtonScale = f.floatValue();
                ChatActivityEnterView.this.updateEmojiButtonParams();
            }
        };
        this.ATTACH_LAYOUT_ALPHA = new Property(cls, "attach_scale") {
            @Override
            public Float get(View view) {
                return Float.valueOf(ChatActivityEnterView.this.attachLayoutAlpha);
            }

            @Override
            public void set(View view, Float f) {
                ChatActivityEnterView.this.attachLayoutAlpha = f.floatValue();
                ChatActivityEnterView.this.updateAttachLayoutParams();
            }
        };
        this.EMOJI_BUTTON_ALPHA = new Property(cls, "emoji_button_alpha") {
            @Override
            public Float get(View view) {
                return Float.valueOf(ChatActivityEnterView.this.emojiButtonAlpha);
            }

            @Override
            public void set(View view, Float f) {
                ChatActivityEnterView.this.emojiButtonAlpha = f.floatValue();
                ChatActivityEnterView.this.updateEmojiButtonParams();
            }
        };
        this.ATTACH_LAYOUT_TRANSLATION_X = new Property(cls, "attach_layout_translation_x") {
            @Override
            public Float get(View view) {
                return Float.valueOf(ChatActivityEnterView.this.attachLayoutTranslationX);
            }

            @Override
            public void set(View view, Float f) {
                ChatActivityEnterView.this.attachLayoutTranslationX = f.floatValue();
                ChatActivityEnterView.this.updateAttachLayoutParams();
            }
        };
        this.MESSAGE_TEXT_TRANSLATION_X = new Property(cls, "message_text_translation_x") {
            @Override
            public Float get(View view) {
                return Float.valueOf(ChatActivityEnterView.this.messageTextTranslationX);
            }

            @Override
            public void set(View view, Float f) {
                ChatActivityEnterView.this.messageTextTranslationX = f.floatValue();
                ChatActivityEnterView.this.updateMessageTextParams();
            }
        };
        this.allowBlur = true;
        this.shouldDrawBackground = true;
        this.backgroundPaint = new Paint();
        this.composeShadowAlpha = 1.0f;
        this.blurBounds = new Rect();
        this.dismissSendPreview = new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$h1OvR33lGVGShsERVZ43UEskFrY(this.f$0);
            }
        };
        this.messageEditTextEnabled = true;
        this.spans = new ColoredImageSpan[1];
        this.streamingState = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.botCommandLastPosition = -1;
        Paint paint = new Paint(1);
        this.gradientPaint = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.clipGradient = linearGradient;
        this.clipMatrix = new Matrix();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.topGradientAlpha = new AnimatedFloat(this, 0L, 280L, cubicBezierInterpolator);
        this.bottomGradientAlpha = new AnimatedFloat(this, 0L, 280L, cubicBezierInterpolator);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        Interpolator interpolator = ChatListItemAnimator.DEFAULT_INTERPOLATOR;
        this.animatorInputFieldHeight = new FactorAnimator(0, this, interpolator, 250L);
        this.animatorTopViewVisibility = new BoolAnimator(1, this, interpolator, 250L);
        this.animatorIsBlockedByStreaming = new BoolAnimator(2, this, cubicBezierInterpolator, 320L);
        this.animatorEphemeralMessageVisibility = new BoolAnimator(3, this, cubicBezierInterpolator, 320L);
        this.resourcesProvider = resourcesProvider;
        this.isChat = z;
        this.smoothKeyboard = z && !AndroidUtilities.isInMultiwindow && (chatActivity == null || !chatActivity.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.dotPaint = paint2;
        paint2.setColor(getThemedColor(Theme.key_chat_emojiPanelNewTrending));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.parentActivity = activity;
        this.parentFragment = chatActivity;
        if (chatActivity != null) {
            this.recordingGuid = chatActivity.getClassGuid();
        }
        this.sizeNotifierLayout = sizeNotifierFrameLayout;
        this.viewParentForEmojiView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setDelegate(this);
        this.sendByEnter = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        FrameLayout frameLayout = new FrameLayout(activity) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (ChatActivityEnterView.this.botWebViewButton != null && ChatActivityEnterView.this.botWebViewButton.getVisibility() == 0) {
                    return ChatActivityEnterView.this.botWebViewButton.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.textFieldContainer = frameLayout;
        frameLayout.setClipChildren(false);
        this.textFieldContainer.setClipToPadding(false);
        this.textFieldContainer.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(this.textFieldContainer, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(activity);
        this.messageEditTextContainer = anonymousClass16;
        anonymousClass16.setClipChildren(false);
        this.textFieldContainer.addView(anonymousClass16, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = new ChatActivityEnterViewAnimatedIconView(activity) {
            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (getTag() == null || ChatActivityEnterView.this.attachLayout == null) {
                    return;
                }
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.emojiViewVisible || MediaDataController.getInstance(chatActivityEnterView.currentAccount).getUnreadStickerSets().isEmpty() || ChatActivityEnterView.this.dotPaint == null) {
                    return;
                }
                canvas.drawCircle((getWidth() / 2) + AndroidUtilities.dp(9.0f), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), ChatActivityEnterView.this.dotPaint);
            }
        };
        this.emojiButton = chatActivityEnterViewAnimatedIconView;
        chatActivityEnterViewAnimatedIconView.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.emojiButton.setFocusable(true);
        int iDp = AndroidUtilities.dp(7.5f);
        this.emojiButton.setPadding(iDp, iDp, iDp, iDp);
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView2 = this.emojiButton;
        int i3 = Theme.key_glass_defaultIcon;
        int themedColor = getThemedColor(i3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        chatActivityEnterViewAnimatedIconView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView3 = this.emojiButton;
        int i4 = Theme.key_listSelector;
        chatActivityEnterViewAnimatedIconView3.setBackground(Theme.createInsetRoundRectDrawable(getThemedColor(i4), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(3.0f)));
        this.emojiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.$r8$lambda$ZrQW9JL5wEaNAIEw3eM3R9jmS1k(this.f$0, view);
            }
        });
        this.messageEditTextContainer.addView(this.emojiButton, LayoutHelper.createFrame(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        setEmojiButtonImage(false, false);
        ImageView imageView = new ImageView(activity);
        this.deleteRichDraftButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.deleteRichDraftButton.setImageResource(R.drawable.menu_delete_old);
        this.deleteRichDraftButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        this.deleteRichDraftButton.setBackground(Theme.createInsetRoundRectDrawable(getThemedColor(i4), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(3.0f)));
        this.deleteRichDraftButton.setVisibility(8);
        this.deleteRichDraftButton.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        this.deleteRichDraftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView chatActivityEnterView = this.f$0;
                new AlertDialog.Builder(chatActivityEnterView.getContext(), resourcesProvider).setTitle(LocaleController.getString(R.string.ArticleDeleteDraftTitle)).setMessage(LocaleController.getString(R.string.ArticleDeleteDraftMessage)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i5) {
                        ChatActivityEnterView.m2078$r8$lambda$tAgvvDQ7vGQLAZ8LnvO8B8W_E(this.f$0, alertDialog, i5);
                    }
                }).makeRed(-1).show();
            }
        });
        this.messageEditTextContainer.addView(this.deleteRichDraftButton, LayoutHelper.createFrame(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            int chatMode = chatActivity != null ? chatActivity.getChatMode() : -1;
            LinearLayout linearLayout = new LinearLayout(activity) {
                @Override
                protected void onLayout(boolean z2, int i5, int i6, int i7, int i8) {
                    super.onLayout(z2, i5, i6, i7, i8);
                    setPivotX(getWidth());
                }
            };
            this.attachLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.attachLayout.setEnabled(false);
            this.attachLayout.setClipChildren(false);
            this.messageEditTextContainer.addView(this.attachLayout, LayoutHelper.createFrame(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (chatMode != 9) {
                this.notifyButton = new ImageView(activity);
                CrossOutDrawable crossOutDrawable = new CrossOutDrawable(activity, R.drawable.input_notify_on, i3);
                this.notifySilentDrawable = crossOutDrawable;
                this.notifyButton.setImageDrawable(crossOutDrawable);
                this.notifySilentDrawable.setCrossOut(this.silent, false);
                ImageView imageView2 = this.notifyButton;
                if (this.silent) {
                    i = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i));
                this.notifyButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), PorterDuff.Mode.MULTIPLY));
                this.notifyButton.setScaleType(scaleType);
                this.notifyButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i4)));
                this.notifyButton.setVisibility((!this.canWriteToChannel || ((chatActivityEnterViewDelegate = this.delegate) != null && chatActivityEnterViewDelegate.hasScheduledMessages())) ? 8 : 0);
                this.attachLayout.addView(this.notifyButton, LayoutHelper.createLinear(44, 44));
                this.notifyButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int i5;
                        String str2;
                        if (chatActivity == null) {
                            return;
                        }
                        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                        chatActivityEnterView.silent = !chatActivityEnterView.silent;
                        if (ChatActivityEnterView.this.notifySilentDrawable == null) {
                            ChatActivityEnterView.this.notifySilentDrawable = new CrossOutDrawable(activity, R.drawable.input_notify_on, Theme.key_glass_defaultIcon);
                        }
                        ChatActivityEnterView.this.notifySilentDrawable.setCrossOut(ChatActivityEnterView.this.silent, true);
                        ChatActivityEnterView.this.notifyButton.setImageDrawable(ChatActivityEnterView.this.notifySilentDrawable);
                        MessagesController.getNotificationsSettings(ChatActivityEnterView.this.currentAccount).edit().putBoolean("silent_" + ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.silent).commit();
                        NotificationsController notificationsController = NotificationsController.getInstance(ChatActivityEnterView.this.currentAccount);
                        long j = ChatActivityEnterView.this.dialog_id;
                        ChatActivity chatActivity2 = chatActivity;
                        notificationsController.updateServerNotificationsSettings(j, chatActivity2 == null ? 0L : chatActivity2.getTopicId());
                        UndoView undoView = chatActivity.getUndoView();
                        if (undoView != null) {
                            undoView.showWithAction(0L, !ChatActivityEnterView.this.silent ? 54 : 55, (Runnable) null);
                        }
                        ImageView imageView3 = ChatActivityEnterView.this.notifyButton;
                        if (ChatActivityEnterView.this.silent) {
                            i5 = R.string.AccDescrChanSilentOn;
                            str2 = "AccDescrChanSilentOn";
                        } else {
                            i5 = R.string.AccDescrChanSilentOff;
                            str2 = "AccDescrChanSilentOff";
                        }
                        imageView3.setContentDescription(LocaleController.getString(str2, i5));
                        ChatActivityEnterView.this.updateFieldHint(true);
                    }
                });
            }
            ImageView imageView3 = new ImageView(activity) {
                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (getAlpha() < 0.5f) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            this.attachButton = imageView3;
            imageView3.setScaleType(scaleType);
            this.attachButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), PorterDuff.Mode.MULTIPLY));
            this.attachButton.setImageResource(R.drawable.msg_input_attach2);
            this.attachButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i4)));
            this.messageEditTextContainer.addView(this.attachButton, LayoutHelper.createFrame(44, 44, 85));
            this.attachButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatActivityEnterView.$r8$lambda$M7RuD6i03ibEOkgkWk4tSmW1Iec(this.f$0, view);
                }
            });
            this.attachButton.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            updateFieldRight(1);
        }
        ImageView imageView4 = new ImageView(activity);
        this.aiButton = imageView4;
        AiButtonDrawable aiButtonDrawable = new AiButtonDrawable(activity);
        this.aiButtonIcon = aiButtonDrawable;
        imageView4.setImageDrawable(aiButtonDrawable);
        this.aiButton.setScaleType(scaleType);
        ImageView imageView5 = this.aiButton;
        int themedColor2 = getThemedColor(i3);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView5.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        this.aiButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i4), 1, AndroidUtilities.dp(16.0f)));
        this.textFieldContainer.addView(this.aiButton, LayoutHelper.createFrame(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        this.aiButton.setContentDescription(LocaleController.getString(R.string.AIEditor));
        ScaleStateListAnimator.apply(this.aiButton);
        this.aiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.$r8$lambda$zefJUK1r668N5X4KvWEvm8Netoo(this.f$0, resourcesProvider, view);
            }
        });
        this.aiButton.setVisibility(8);
        this.aiButton.setAlpha(0.0f);
        this.aiButton.setScaleX(0.6f);
        this.aiButton.setScaleY(0.6f);
        ImageView imageView6 = new ImageView(activity);
        this.richButton = imageView6;
        imageView6.setImageResource(R.drawable.iv_fullscreen);
        this.richButton.setScaleType(scaleType);
        this.richButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode2));
        this.richButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i4), 1, AndroidUtilities.dp(16.0f)));
        this.textFieldContainer.addView(this.richButton, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        this.richButton.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        ScaleStateListAnimator.apply(this.richButton);
        this.richButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.openRichEditor();
            }
        });
        this.richButton.setVisibility(8);
        this.richButton.setAlpha(0.0f);
        this.richButton.setScaleX(0.6f);
        this.richButton.setScaleY(0.6f);
        if (this.audioToSend != null) {
            createRecordAudioPanel();
        }
        ImageView imageView7 = new ImageView(activity);
        this.sendOutlineView = imageView7;
        imageView7.setImageResource(R.drawable.send_outline);
        this.sendOutlineView.setScaleType(scaleType);
        this.sendOutlineView.setVisibility(8);
        this.sendOutlineView.setColorFilter(getThemedColor(Theme.key_telegram_color), mode);
        this.textFieldContainer.addView(this.sendOutlineView, LayoutHelper.createFrame(44, 44, 85));
        FrameLayout frameLayout2 = new FrameLayout(activity) {
            @Override
            protected void onSizeChanged(int i5, int i6, int i7, int i8) {
                super.onSizeChanged(i5, i6, i7, i8);
                setPivotX(i5 - AndroidUtilities.dp(22.0f));
                setPivotY(i6 - AndroidUtilities.dp(22.0f));
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == ChatActivityEnterView.this.sendButton && ChatActivityEnterView.this.textTransitionIsRunning) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (ChatActivityEnterView.this.isSendButtonEnabled()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (ChatActivityEnterView.this.isSendButtonEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.sendButtonContainer = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.sendButtonContainer.setClipToPadding(false);
        this.textFieldContainer.addView(this.sendButtonContainer, LayoutHelper.createFrame(100, 44, 85));
        AnonymousClass24 anonymousClass24 = new AnonymousClass24(activity, resourcesProvider);
        this.audioVideoButtonContainer = anonymousClass24;
        anonymousClass24.setSoundEffectsEnabled(false);
        this.sendButtonContainer.addView(this.audioVideoButtonContainer, LayoutHelper.createFrame(44, 44, 85));
        this.audioVideoButtonContainer.setFocusable(true);
        this.audioVideoButtonContainer.setImportantForAccessibility(1);
        Drawable drawableMutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.micOutline = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode2));
        Drawable drawableMutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.cameraOutline = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode2));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView4 = new ChatActivityEnterViewAnimatedIconView(activity, 24) {
            private final Rect tmpRectF = new Rect();

            @Override
            public void draw(Canvas canvas) {
                if (ChatActivityEnterView.this.audioVideoButtonContainerForbidden) {
                    this.tmpRectF.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.tmpRectF.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
                    Drawable drawable = getCurrentState() == ChatActivityEnterViewAnimatedIconView.State.VIDEO ? ChatActivityEnterView.this.cameraOutline : ChatActivityEnterView.this.micOutline;
                    drawable.setBounds(this.tmpRectF);
                    drawable.draw(canvas);
                    return;
                }
                super.draw(canvas);
            }
        };
        this.audioVideoSendButton = chatActivityEnterViewAnimatedIconView4;
        chatActivityEnterViewAnimatedIconView4.setImportantForAccessibility(2);
        int iDp2 = AndroidUtilities.dp(10.0f);
        this.audioVideoSendButton.setPadding(iDp2, iDp2, iDp2, iDp2);
        this.audioVideoButtonContainer.addView(this.audioVideoSendButton, LayoutHelper.createFrame(44, 44.0f));
        ImageView imageView8 = new ImageView(activity);
        this.cancelBotButton = imageView8;
        imageView8.setVisibility(4);
        this.cancelBotButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageView imageView9 = this.cancelBotButton;
        CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2() {
            @Override
            protected int getCurrentColor() {
                return Theme.getColor(Theme.key_chat_messagePanelCancelInlineBot);
            }
        };
        this.progressDrawable = closeProgressDrawable2;
        imageView9.setImageDrawable(closeProgressDrawable2);
        this.cancelBotButton.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        this.cancelBotButton.setSoundEffectsEnabled(false);
        this.cancelBotButton.setScaleX(0.1f);
        this.cancelBotButton.setScaleY(0.1f);
        this.cancelBotButton.setAlpha(0.0f);
        this.cancelBotButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i4)));
        this.sendButtonContainer.addView(this.cancelBotButton, LayoutHelper.createFrame(44, 44, 85));
        this.cancelBotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.$r8$lambda$SxXZjPhGQnA5HnEP5BXvCHYw1sk(this.f$0, view);
            }
        });
        SendButton sendButton = new SendButton(activity, isInScheduleMode() ? R.drawable.input_schedule : R.drawable.send_plane_24, resourcesProvider, true) {
            @Override
            public boolean isInScheduleMode() {
                return ChatActivityEnterView.this.isInScheduleMode();
            }

            @Override
            public boolean isOpen() {
                MessageSendPreview messageSendPreview = ChatActivityEnterView.this.messageSendPreview;
                return (messageSendPreview != null && messageSendPreview.isShowing()) || super.isOpen();
            }

            @Override
            public boolean isInactive() {
                return !isInScheduleMode() && ChatActivityEnterView.this.slowModeTimer == Integer.MAX_VALUE;
            }

            @Override
            public boolean shouldDrawBackground() {
                return ChatActivityEnterView.this.shouldDrawBackground;
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                ChatActivityEnterView.this.updateAttachButtonTranslationX();
            }
        };
        this.sendButton = sendButton;
        sendButton.setVisibility(4);
        this.sendButton.setContentDescription(LocaleController.getString(R.string.Send));
        this.sendButton.setSoundEffectsEnabled(false);
        this.sendButton.setScaleX(0.1f);
        this.sendButton.setScaleY(0.1f);
        this.sendButton.setAlpha(0.0f);
        this.sendButtonContainer.addView(this.sendButton, LayoutHelper.createFrame(100, 44, 85));
        this.sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.$r8$lambda$FBmnO917jP9AZij_vD2tqGf1OQk(this.f$0, view);
            }
        });
        this.sendButton.setOnLongClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda14(this));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.sendButtonContainer.setOnLongClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda14(this));
        }
        SendButtonBlockedByTypingView sendButtonBlockedByTypingView = new SendButtonBlockedByTypingView(activity, resourcesProvider);
        this.sendButtonBlockedByTypingView = sendButtonBlockedByTypingView;
        sendButtonBlockedByTypingView.setVisibility(4);
        this.sendButtonBlockedByTypingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.$r8$lambda$FF9oL91gM3uZi1kVL6M_Uel4_kE(this.f$0, view);
            }
        });
        this.sendButtonContainer.addView(this.sendButtonBlockedByTypingView, LayoutHelper.createFrame(44, 44, 85));
        SlowModeBtn slowModeBtn = new SlowModeBtn(activity);
        this.slowModeButton = slowModeBtn;
        slowModeBtn.setTextSize(16);
        this.slowModeButton.setVisibility(4);
        this.slowModeButton.setSoundEffectsEnabled(false);
        this.slowModeButton.setScaleX(0.1f);
        this.slowModeButton.setScaleY(0.1f);
        this.slowModeButton.setAlpha(0.0f);
        this.slowModeButton.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.slowModeButton.setGravity(21);
        this.slowModeButton.setTextColor(getThemedColor(i3));
        this.sendButtonContainer.addView(this.slowModeButton, LayoutHelper.createFrame(74, 44, 85));
        this.slowModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.m2076$r8$lambda$RePpqMMpZJ2sevPR66IM24WtSc(this.f$0, view);
            }
        });
        this.slowModeButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return ChatActivityEnterView.$r8$lambda$MjEY8WnuJGMCZk3mHalcySBdmCk(this.f$0, view);
            }
        });
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.keyboardHeight = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.keyboardHeightLand = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        setRecordVideoButtonVisible(false, false);
        checkSendButton(false);
        checkChannelRights();
        createMessageEditText();
    }

    class AnonymousClass16 extends FrameLayout {
        AnonymousClass16(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int iMax = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
            if (ChatActivityEnterView.this.animatorInputFieldHeight.getFactor() > 0.0f) {
                ChatActivityEnterView.this.animatorInputFieldHeight.animateTo(iMax);
            } else {
                ChatActivityEnterView.this.animatorInputFieldHeight.forceFactor(iMax);
            }
            ChatActivityEnterView.this.checkUi_TopViewVisibility();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (ChatActivityEnterView.this.animationParamsX.isEmpty()) {
                return;
            }
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                Float f = (Float) ChatActivityEnterView.this.animationParamsX.get(childAt);
                if (f != null) {
                    childAt.setTranslationX(f.floatValue() - childAt.getLeft());
                    childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
            }
            ChatActivityEnterView.this.animationParamsX.clear();
        }

        @Override
        protected boolean drawChild(final Canvas canvas, final View view, final long j) {
            if (view != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (view == chatActivityEnterView.messageEditText) {
                    return chatActivityEnterView.drawMessageEditText(canvas, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            return Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j));
                        }
                    });
                }
            }
            ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
            if (chatActivityEnterView2.shouldDrawRecordedAudioPanelInParent && view == chatActivityEnterView2.recordedAudioPanel) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public static void $r8$lambda$ZrQW9JL5wEaNAIEw3eM3R9jmS1k(final ChatActivityEnterView chatActivityEnterView, View view) {
        AdjustPanLayoutHelper adjustPanLayoutHelper = chatActivityEnterView.adjustPanLayoutHelper;
        if (adjustPanLayoutHelper == null || !adjustPanLayoutHelper.animationInProgress()) {
            if (chatActivityEnterView.emojiButtonRestricted) {
                chatActivityEnterView.showRestrictedHint();
                return;
            }
            if (!chatActivityEnterView.isPopupShowing() || chatActivityEnterView.currentPopupContentType != 0) {
                chatActivityEnterView.showPopup(1, 0);
                EmojiView emojiView = chatActivityEnterView.emojiView;
                EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
                boolean z = editTextCaption != null && editTextCaption.length() > 0;
                ChatActivity chatActivity = chatActivityEnterView.parentFragment;
                emojiView.onOpen(z, chatActivity != null && chatActivity.groupEmojiPackHintWasVisible());
                return;
            }
            if (chatActivityEnterView.searchingType != 0) {
                chatActivityEnterView.setSearchingTypeInternal(0, true);
                EmojiView emojiView2 = chatActivityEnterView.emojiView;
                if (emojiView2 != null) {
                    emojiView2.closeSearch(false);
                }
                EditTextCaption editTextCaption2 = chatActivityEnterView.messageEditText;
                if (editTextCaption2 != null) {
                    editTextCaption2.requestFocus();
                }
            }
            if (chatActivityEnterView.stickersExpanded) {
                chatActivityEnterView.setStickersExpanded(false, true, false);
                chatActivityEnterView.waitingForKeyboardOpenAfterAnimation = true;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatActivityEnterView.$r8$lambda$5wO0pcBJSKBGRoYL4hEclo_StXs(this.f$0);
                    }
                }, 200L);
                return;
            }
            chatActivityEnterView.openKeyboardInternal();
        }
    }

    public static void $r8$lambda$5wO0pcBJSKBGRoYL4hEclo_StXs(ChatActivityEnterView chatActivityEnterView) {
        chatActivityEnterView.waitingForKeyboardOpenAfterAnimation = false;
        chatActivityEnterView.openKeyboardInternal();
    }

    public static void m2078$r8$lambda$tAgvvDQ7vGQLAZ8LnvO8B8W_E(ChatActivityEnterView chatActivityEnterView, AlertDialog alertDialog, int i) {
        chatActivityEnterView.clearRichDraft();
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setText("");
        }
    }

    public static void $r8$lambda$M7RuD6i03ibEOkgkWk4tSmW1Iec(ChatActivityEnterView chatActivityEnterView, View view) {
        AdjustPanLayoutHelper adjustPanLayoutHelper = chatActivityEnterView.adjustPanLayoutHelper;
        if ((adjustPanLayoutHelper == null || !adjustPanLayoutHelper.animationInProgress()) && chatActivityEnterView.attachLayoutPaddingAlpha != 0.0f) {
            chatActivityEnterView.delegate.didPressAttachButton();
        }
    }

    public static void $r8$lambda$zefJUK1r668N5X4KvWEvm8Netoo(final ChatActivityEnterView chatActivityEnterView, final Theme.ResourcesProvider resourcesProvider, View view) {
        chatActivityEnterView.getClass();
        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
        ChatActivity chatActivity = chatActivityEnterView.parentFragment;
        final long dialogId = chatActivity != null ? chatActivity.getDialogId() : chatActivityEnterView.dialog_id;
        if (chatActivityEnterView.richDraftActive) {
            if (chatActivityEnterView.richDraftMessage == null) {
                return;
            }
            new AIEditorAlert(chatActivityEnterView.getContext(), resourcesProvider).setText(chatActivityEnterView.richDraftMessage).setOnUseRich(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.saveRichDraft((TL_iv.RichMessage) obj);
                }
            }).setOnSendRich(dialogId, new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    ChatActivityEnterView.m2100$r8$lambda$cxTLS5yxZZaUgdwy05MHF6Kt_A(this.f$0, dialogId, resourcesProvider, (TL_iv.RichMessage) obj, (Integer) obj2, (Integer) obj3, (Boolean) obj4);
                }
            }).show();
        } else {
            if (chatActivityEnterView.messageEditText == null) {
                return;
            }
            new AIEditorAlert(chatActivityEnterView.getContext(), resourcesProvider).setText(chatActivityEnterView.messageEditText.getText()).setOnUse(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ChatActivityEnterView.m2109$r8$lambda$uSGWYfWKqmk9HFGtz7IdJaELRw(this.f$0, (CharSequence) obj);
                }
            }).setOnSend(dialogId, chatActivityEnterView.editingMessageObject != null, new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    ChatActivityEnterView.m2102$r8$lambda$h4HoYQBW4QlaAtuxPmCA8tcdPY(this.f$0, dialogId, resourcesProvider, (CharSequence) obj, (Integer) obj2, (Integer) obj3, (Boolean) obj4);
                }
            }).show();
        }
    }

    public static void m2100$r8$lambda$cxTLS5yxZZaUgdwy05MHF6Kt_A(ChatActivityEnterView chatActivityEnterView, long j, Theme.ResourcesProvider resourcesProvider, TL_iv.RichMessage richMessage, Integer num, Integer num2, Boolean bool) {
        chatActivityEnterView.saveRichDraft(richMessage);
        if (chatActivityEnterView.isInScheduleMode() && num.intValue() == 0) {
            AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, j, new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public void didSelectDate(boolean z, int i, int i2) {
                    ChatActivityEnterView.this.sendMessageInternal(z, i, i2, 0L, true);
                }
            }, resourcesProvider);
        } else {
            chatActivityEnterView.sendMessageInternal(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
        }
    }

    public static void m2109$r8$lambda$uSGWYfWKqmk9HFGtz7IdJaELRw(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence) {
        chatActivityEnterView.messageEditText.setText(charSequence);
        chatActivityEnterView.messageEditText.setSelection(charSequence.length(), charSequence.length());
    }

    public static void m2102$r8$lambda$h4HoYQBW4QlaAtuxPmCA8tcdPY(ChatActivityEnterView chatActivityEnterView, long j, Theme.ResourcesProvider resourcesProvider, CharSequence charSequence, Integer num, Integer num2, Boolean bool) {
        chatActivityEnterView.messageEditText.setText(charSequence);
        if (chatActivityEnterView.editingMessageObject != null) {
            chatActivityEnterView.doneEditingMessage();
        } else if (chatActivityEnterView.isInScheduleMode() && num.intValue() == 0) {
            AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, j, new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public void didSelectDate(boolean z, int i, int i2) {
                    boolean zSendMessageInternal = ChatActivityEnterView.this.sendMessageInternal(z, i, i2, 0L, true);
                    MessageSendPreview messageSendPreview = ChatActivityEnterView.this.messageSendPreview;
                    if (messageSendPreview != null) {
                        messageSendPreview.dismiss(!zSendMessageInternal);
                        ChatActivityEnterView.this.messageSendPreview = null;
                    }
                }
            }, resourcesProvider);
        } else {
            chatActivityEnterView.sendMessageInternal(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
        }
    }

    class AnonymousClass24 extends FrameLayout {
        private final RectF backgroundRect;
        private final Paint paint;
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass24(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.val$resourcesProvider = resourcesProvider;
            this.paint = new Paint(1);
            this.backgroundRect = new RectF();
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return !ChatActivityEnterView.this.isLiveComment;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            FrameLayout frameLayout;
            if (ChatActivityEnterView.this.isLiveComment) {
                return false;
            }
            ChatActivityEnterView.this.createRecordCircle();
            if (motionEvent.getAction() == 0) {
                if (ChatActivityEnterView.this.recordCircle.isSendButtonVisible()) {
                    if (!ChatActivityEnterView.this.hasRecordVideo || ChatActivityEnterView.this.calledRecordRunnable) {
                        ChatActivityEnterView.this.startedDraggingX = -1.0f;
                        if (!ChatActivityEnterView.this.hasRecordVideo || !ChatActivityEnterView.this.isInVideoMode()) {
                            if (ChatActivityEnterView.this.recordingAudioVideo && ChatActivityEnterView.this.isInScheduleMode()) {
                                AlertsCreator.createScheduleDatePickerDialog(ChatActivityEnterView.this.parentActivity, ChatActivityEnterView.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                                    @Override
                                    public final void didSelectDate(boolean z, int i, int i2) {
                                        MediaController.getInstance().stopRecording(1, z, i, false, 0L);
                                    }
                                }, new Runnable() {
                                    @Override
                                    public final void run() {
                                        MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                                    }
                                }, this.val$resourcesProvider);
                            }
                            if (AlertsCreator.needsPaidMessageAlert(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id)) {
                                if (ChatActivityEnterView.this.isInVideoMode()) {
                                    if (ChatActivityEnterView.this.slideText != null) {
                                        ChatActivityEnterView.this.slideText.setEnabled(false);
                                    }
                                    ChatActivityEnterView.this.delegate.toggleVideoRecordingPause();
                                } else {
                                    if (ChatActivityEnterView.this.sendButtonVisible) {
                                        ChatActivityEnterView.this.calledRecordRunnable = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(ChatActivityEnterView.this.voiceOnce);
                                    ChatActivityEnterView.this.delegate.needStartRecordAudio(0);
                                    if (ChatActivityEnterView.this.slideText != null) {
                                        ChatActivityEnterView.this.slideText.setEnabled(false);
                                    }
                                }
                                AlertsCreator.ensurePaidMessageConfirmation(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id, 1, new Utilities.Callback() {
                                    @Override
                                    public final void run(Object obj) {
                                        ChatActivityEnterView.this.sendMessageInternal(true, 0, 0, ((Long) obj).longValue(), false);
                                    }
                                });
                                return true;
                            }
                            MediaController.getInstance().stopRecording(ChatActivityEnterView.this.isInScheduleMode() ? 3 : 1, true, 0, ChatActivityEnterView.this.voiceOnce, 0L);
                            ChatActivityEnterView.this.delegate.needStartRecordAudio(0);
                        } else {
                            if (AlertsCreator.needsPaidMessageAlert(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id)) {
                                if (ChatActivityEnterView.this.slideText != null) {
                                    ChatActivityEnterView.this.slideText.setEnabled(false);
                                }
                                ChatActivityEnterView.this.delegate.toggleVideoRecordingPause();
                                AlertsCreator.ensurePaidMessageConfirmation(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id, 1, new Utilities.Callback() {
                                    @Override
                                    public final void run(Object obj) {
                                        ChatActivityEnterView.this.sendMessageInternal(true, 0, 0, ((Long) obj).longValue(), false);
                                    }
                                });
                                return true;
                            }
                            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = ChatActivityEnterView.this.delegate;
                            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                            chatActivityEnterViewDelegate.needStartRecordVideo(1, true, 0, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L);
                            ChatActivityEnterView.this.sendButton.setEffect(ChatActivityEnterView.this.effectId = 0L);
                        }
                        ChatActivityEnterView.this.recordingAudioVideo = false;
                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                        chatActivityEnterView2.messageTransitionIsRunning = false;
                        AndroidUtilities.runOnUIThread(chatActivityEnterView2.moveToSendStateRunnable = new Runnable() {
                            @Override
                            public final void run() {
                                ChatActivityEnterView.AnonymousClass24.$r8$lambda$B9CFX_NaOu5yvkjvmFURGXCqZ7c(this.f$0);
                            }
                        }, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                TLRPC.Chat currentChat = ChatActivityEnterView.this.parentFragment == null ? null : ChatActivityEnterView.this.parentFragment.getCurrentChat();
                TLRPC.UserFull currentUserInfo = ChatActivityEnterView.this.parentFragment == null ? ChatActivityEnterView.this.userInfo : ChatActivityEnterView.this.parentFragment.getCurrentUserInfo();
                if ((currentChat == null || ChatObject.canSendVoice(currentChat) || (ChatObject.canSendRoundVideo(currentChat) && ChatActivityEnterView.this.hasRecordVideo)) && (currentUserInfo == null || !currentUserInfo.voice_messages_forbidden)) {
                    if (ChatActivityEnterView.this.hasRecordVideo) {
                        ChatActivityEnterView.this.calledRecordRunnable = false;
                        ChatActivityEnterView.this.recordAudioVideoRunnableStarted = true;
                        AndroidUtilities.runOnUIThread(ChatActivityEnterView.this.recordAudioVideoRunnable, 150L);
                    } else {
                        ChatActivityEnterView.this.recordAudioVideoRunnable.run();
                    }
                    return true;
                }
                ChatActivityEnterView.this.delegate.needShowMediaBanHint();
                return true;
            }
            float f = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 3 && ChatActivityEnterView.this.recordingAudioVideo) {
                    if (ChatActivityEnterView.this.slideToCancelProgress < 0.7f) {
                        if (!ChatActivityEnterView.this.hasRecordVideo || !ChatActivityEnterView.this.isInVideoMode()) {
                            ChatActivityEnterView.this.delegate.needStartRecordAudio(0);
                            MediaController.getInstance().stopRecording(0, false, 0, ChatActivityEnterView.this.voiceOnce, 0L);
                        } else {
                            CameraController.getInstance().cancelOnInitRunnable(ChatActivityEnterView.this.onFinishInitCameraRunnable);
                            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = ChatActivityEnterView.this.delegate;
                            ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                            chatActivityEnterViewDelegate2.needStartRecordVideo(2, true, 0, 0, chatActivityEnterView3.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView3.effectId, 0L);
                            ChatActivityEnterView.this.sendButton.setEffect(ChatActivityEnterView.this.effectId = 0L);
                        }
                        ChatActivityEnterView.this.millisecondsRecorded = 0L;
                        ChatActivityEnterView.this.recordingAudioVideo = false;
                        ChatActivityEnterView.this.updateRecordInterface(5, true);
                    } else {
                        ChatActivityEnterView.this.sendButtonVisible = true;
                        ChatActivityEnterView.this.startLockTransition();
                    }
                    return false;
                }
                if ((ChatActivityEnterView.this.recordCircle != null && ChatActivityEnterView.this.recordCircle.isSendButtonVisible()) || ((frameLayout = ChatActivityEnterView.this.recordedAudioPanel) != null && frameLayout.getVisibility() == 0)) {
                    if (ChatActivityEnterView.this.recordAudioVideoRunnableStarted) {
                        AndroidUtilities.cancelRunOnUIThread(ChatActivityEnterView.this.recordAudioVideoRunnable);
                    }
                    return false;
                }
                if ((((motionEvent.getX() + ChatActivityEnterView.this.audioVideoButtonContainer.getX()) - ChatActivityEnterView.this.startedDraggingX) / ChatActivityEnterView.this.distCanMove) + 1.0f < 0.45d) {
                    if (!ChatActivityEnterView.this.hasRecordVideo || !ChatActivityEnterView.this.isInVideoMode()) {
                        ChatActivityEnterView.this.delegate.needStartRecordAudio(0);
                        MediaController.getInstance().stopRecording(0, false, 0, ChatActivityEnterView.this.voiceOnce, 0L);
                    } else {
                        CameraController.getInstance().cancelOnInitRunnable(ChatActivityEnterView.this.onFinishInitCameraRunnable);
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate3 = ChatActivityEnterView.this.delegate;
                        ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
                        chatActivityEnterViewDelegate3.needStartRecordVideo(2, true, 0, 0, chatActivityEnterView4.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView4.effectId, 0L);
                        ChatActivityEnterView.this.sendButton.setEffect(ChatActivityEnterView.this.effectId = 0L);
                    }
                    ChatActivityEnterView.this.millisecondsRecorded = 0L;
                    ChatActivityEnterView.this.recordingAudioVideo = false;
                    ChatActivityEnterView.this.updateRecordInterface(5, true);
                } else if (ChatActivityEnterView.this.recordAudioVideoRunnableStarted) {
                    AndroidUtilities.cancelRunOnUIThread(ChatActivityEnterView.this.recordAudioVideoRunnable);
                    if (!ChatActivityEnterView.this.sendVoiceEnabled || !ChatActivityEnterView.this.sendRoundEnabled) {
                        ChatActivityEnterView.this.delegate.needShowMediaBanHint();
                    } else {
                        ChatActivityEnterView.this.delegate.onSwitchRecordMode(!ChatActivityEnterView.this.isInVideoMode());
                        ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                        chatActivityEnterView5.setRecordVideoButtonVisible(!chatActivityEnterView5.isInVideoMode(), true);
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                } else if (!ChatActivityEnterView.this.hasRecordVideo || ChatActivityEnterView.this.calledRecordRunnable) {
                    ChatActivityEnterView.this.startedDraggingX = -1.0f;
                    if (!ChatActivityEnterView.this.hasRecordVideo || !ChatActivityEnterView.this.isInVideoMode()) {
                        if (!ChatActivityEnterView.this.sendVoiceEnabled) {
                            ChatActivityEnterView.this.delegate.needShowMediaBanHint();
                        } else {
                            if (AlertsCreator.needsPaidMessageAlert(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id)) {
                                if (ChatActivityEnterView.this.sendButtonVisible) {
                                    ChatActivityEnterView.this.calledRecordRunnable = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(ChatActivityEnterView.this.voiceOnce);
                                ChatActivityEnterView.this.delegate.needStartRecordAudio(0);
                                if (ChatActivityEnterView.this.slideText != null) {
                                    ChatActivityEnterView.this.slideText.setEnabled(false);
                                }
                                AlertsCreator.ensurePaidMessageConfirmation(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id, 1, new Utilities.Callback() {
                                    @Override
                                    public final void run(Object obj) {
                                        ChatActivityEnterView.this.sendMessageInternal(true, 0, 0, ((Long) obj).longValue(), false);
                                    }
                                });
                                return true;
                            }
                            if (ChatActivityEnterView.this.recordingAudioVideo && ChatActivityEnterView.this.isInScheduleMode()) {
                                AlertsCreator.createScheduleDatePickerDialog(ChatActivityEnterView.this.parentActivity, ChatActivityEnterView.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                                    @Override
                                    public final void didSelectDate(boolean z, int i, int i2) {
                                        MediaController.getInstance().stopRecording(1, z, i, false, 0L);
                                    }
                                }, new Runnable() {
                                    @Override
                                    public final void run() {
                                        MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
                                    }
                                }, this.val$resourcesProvider);
                            }
                            ChatActivityEnterView.this.delegate.needStartRecordAudio(0);
                            MediaController.getInstance().stopRecording(ChatActivityEnterView.this.isInScheduleMode() ? 3 : 1, true, 0, ChatActivityEnterView.this.voiceOnce, 0L);
                        }
                    } else {
                        if (AlertsCreator.needsPaidMessageAlert(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id)) {
                            if (ChatActivityEnterView.this.slideText != null) {
                                ChatActivityEnterView.this.slideText.setEnabled(false);
                            }
                            ChatActivityEnterView.this.delegate.toggleVideoRecordingPause();
                            AlertsCreator.ensurePaidMessageConfirmation(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id, 1, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    ChatActivityEnterView.this.sendMessageInternal(true, 0, 0, ((Long) obj).longValue(), false);
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(ChatActivityEnterView.this.onFinishInitCameraRunnable);
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate4 = ChatActivityEnterView.this.delegate;
                        ChatActivityEnterView chatActivityEnterView6 = ChatActivityEnterView.this;
                        chatActivityEnterViewDelegate4.needStartRecordVideo(1, true, 0, 0, chatActivityEnterView6.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView6.effectId, 0L);
                        ChatActivityEnterView.this.sendButton.setEffect(ChatActivityEnterView.this.effectId = 0L);
                    }
                    ChatActivityEnterView.this.recordingAudioVideo = false;
                    ChatActivityEnterView chatActivityEnterView7 = ChatActivityEnterView.this;
                    chatActivityEnterView7.messageTransitionIsRunning = false;
                    AndroidUtilities.runOnUIThread(chatActivityEnterView7.moveToSendStateRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            ChatActivityEnterView.AnonymousClass24.$r8$lambda$QUAPttQr9HcUEqvY957NeXldFpc(this.f$0);
                        }
                    }, ChatActivityEnterView.this.shouldDrawBackground ? 500L : 0L);
                }
                return true;
            }
            if (motionEvent.getAction() == 2 && ChatActivityEnterView.this.recordingAudioVideo) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (ChatActivityEnterView.this.recordCircle.isSendButtonVisible()) {
                    return false;
                }
                if (ChatActivityEnterView.this.recordCircle.setLockTranslation(y) == 2) {
                    ChatActivityEnterView.this.startLockTransition();
                    return false;
                }
                ChatActivityEnterView.this.recordCircle.setMovingCords(x, y);
                if (ChatActivityEnterView.this.startedDraggingX == -1.0f) {
                    ChatActivityEnterView.this.startedDraggingX = x;
                    ChatActivityEnterView chatActivityEnterView8 = ChatActivityEnterView.this;
                    chatActivityEnterView8.distCanMove = (float) (((double) chatActivityEnterView8.sizeNotifierLayout.getMeasuredWidth()) * 0.35d);
                    if (ChatActivityEnterView.this.distCanMove > AndroidUtilities.dp(140.0f)) {
                        ChatActivityEnterView.this.distCanMove = AndroidUtilities.dp(140.0f);
                    }
                }
                float x2 = (((x + ChatActivityEnterView.this.audioVideoButtonContainer.getX()) - ChatActivityEnterView.this.startedDraggingX) / ChatActivityEnterView.this.distCanMove) + 1.0f;
                if (ChatActivityEnterView.this.startedDraggingX != -1.0f) {
                    if (x2 <= 1.0f) {
                        f = x2 < 0.0f ? 0.0f : x2;
                    }
                    if (ChatActivityEnterView.this.slideText != null) {
                        ChatActivityEnterView.this.slideText.setSlideX(f);
                    }
                    ChatActivityEnterView.this.setSlideToCancelProgress(f);
                    x2 = f;
                }
                if (x2 == 0.0f) {
                    if (!ChatActivityEnterView.this.hasRecordVideo || !ChatActivityEnterView.this.isInVideoMode()) {
                        ChatActivityEnterView.this.delegate.needStartRecordAudio(0);
                        MediaController.getInstance().stopRecording(0, false, 0, ChatActivityEnterView.this.voiceOnce, 0L);
                    } else {
                        CameraController.getInstance().cancelOnInitRunnable(ChatActivityEnterView.this.onFinishInitCameraRunnable);
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate5 = ChatActivityEnterView.this.delegate;
                        ChatActivityEnterView chatActivityEnterView9 = ChatActivityEnterView.this;
                        chatActivityEnterViewDelegate5.needStartRecordVideo(2, true, 0, 0, chatActivityEnterView9.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView9.effectId, 0L);
                        ChatActivityEnterView.this.sendButton.setEffect(ChatActivityEnterView.this.effectId = 0L);
                    }
                    ChatActivityEnterView.this.recordingAudioVideo = false;
                    ChatActivityEnterView.this.updateRecordInterface(5, true);
                }
            }
            return true;
        }

        public static void $r8$lambda$B9CFX_NaOu5yvkjvmFURGXCqZ7c(AnonymousClass24 anonymousClass24) {
            ChatActivityEnterView.this.moveToSendStateRunnable = null;
            ChatActivityEnterView.this.updateRecordInterface(1, true);
        }

        public static void $r8$lambda$QUAPttQr9HcUEqvY957NeXldFpc(AnonymousClass24 anonymousClass24) {
            ChatActivityEnterView.this.moveToSendStateRunnable = null;
            ChatActivityEnterView.this.updateRecordInterface(1, true);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (!ChatActivityEnterView.this.audioVideoButtonContainerForbidden) {
                float alpha = 1.0f;
                if (ChatActivityEnterView.this.expandStickersButton != null && ChatActivityEnterView.this.expandStickersButton.getVisibility() == 0) {
                    alpha = 1.0f - ChatActivityEnterView.this.expandStickersButton.getAlpha();
                }
                float fDpf2 = AndroidUtilities.dpf2(19.0f);
                this.paint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_messagePanelSend));
                float fDpf3 = AndroidUtilities.dpf2(3.0f);
                this.backgroundRect.set((getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - fDpf3, (getMeasuredHeight() - AndroidUtilities.dpf2(38.0f)) - fDpf3, getMeasuredWidth() - fDpf3, getMeasuredHeight() - fDpf3);
                canvas.save();
                canvas.scale(alpha, alpha, this.backgroundRect.centerX(), this.backgroundRect.centerY());
                canvas.drawRoundRect(this.backgroundRect, fDpf2, fDpf2, this.paint);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
        }
    }

    public static void $r8$lambda$SxXZjPhGQnA5HnEP5BXvCHYw1sk(ChatActivityEnterView chatActivityEnterView, View view) {
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        String string = editTextCaption != null ? editTextCaption.getText().toString() : "";
        int iIndexOf = string.indexOf(32);
        if (iIndexOf == -1 || iIndexOf == string.length() - 1) {
            chatActivityEnterView.setFieldText("");
        } else {
            chatActivityEnterView.setFieldText(string.substring(0, iIndexOf + 1));
        }
    }

    public static void $r8$lambda$FBmnO917jP9AZij_vD2tqGf1OQk(ChatActivityEnterView chatActivityEnterView, View view) {
        MessageSendPreview messageSendPreview = chatActivityEnterView.messageSendPreview;
        if (messageSendPreview == null || !messageSendPreview.isShowing()) {
            AnimatorSet animatorSet = chatActivityEnterView.runningAnimationAudio;
            if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.moveToSendStateRunnable == null) {
                chatActivityEnterView.sendMessage();
            }
        }
    }

    public static void $r8$lambda$FF9oL91gM3uZi1kVL6M_Uel4_kE(ChatActivityEnterView chatActivityEnterView, View view) {
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate;
        if (chatActivityEnterView.streamingState != BotForumHelper.SteamingSendButtonState.STOP || (chatActivityEnterViewDelegate = chatActivityEnterView.delegate) == null) {
            return;
        }
        chatActivityEnterViewDelegate.didPressStreamingStop();
    }

    public static void m2076$r8$lambda$RePpqMMpZJ2sevPR66IM24WtSc(ChatActivityEnterView chatActivityEnterView, View view) {
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate == null || chatActivityEnterViewDelegate.checkCanRemoveRestrictionsByBoosts()) {
            return;
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = chatActivityEnterView.delegate;
        SlowModeBtn slowModeBtn = chatActivityEnterView.slowModeButton;
        chatActivityEnterViewDelegate2.onUpdateSlowModeButton(slowModeBtn, true, slowModeBtn.getText());
    }

    public static boolean $r8$lambda$MjEY8WnuJGMCZk3mHalcySBdmCk(ChatActivityEnterView chatActivityEnterView, View view) {
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        if (editTextCaption == null || editTextCaption.length() <= 0) {
            return false;
        }
        return chatActivityEnterView.onSendLongClick(view);
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.viewParentForEmojiView = viewGroup;
    }

    public void updateSendButtonPaid() {
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= (long) getMessagesCount();
        }
        if (this.paidMessagesPrice != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.paidMessagesPrice = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.isLiveComment) {
                this.sendButton.setStarsPrice(starsPrice, 1);
            }
            updateFieldRight(this.lastAttachVisible);
        }
        if (this.isLiveComment) {
            createCaptionLimitView();
            int maxLength = areLiveCommentsFree() ? HighlightMessageSheet.getMaxLength(this.currentAccount) : HighlightMessageSheet.getTierOption(this.currentAccount, (int) starsPrice, HighlightMessageSheet.TIER_LENGTH);
            if (this.currentLimit != maxLength) {
                this.currentLimit = maxLength;
                if (maxLength > 0) {
                    int i = maxLength - this.codePointCount;
                    if (i <= (this.isLiveComment ? 5 : 100)) {
                        if (i < -9999) {
                            i = -9999;
                        }
                        createCaptionLimitView();
                        NumberTextView numberTextView = this.captionLimitView;
                        numberTextView.setNumber(i, numberTextView.getVisibility() == 0);
                        if (this.captionLimitView.getVisibility() != 0) {
                            this.captionLimitView.setVisibility(0);
                            this.captionLimitView.setAlpha(0.0f);
                            this.captionLimitView.setScaleX(0.5f);
                            this.captionLimitView.setScaleY(0.5f);
                        }
                        this.captionLimitView.animate().setListener(null).cancel();
                        this.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.captionLimitView.setTextColor(getThemedColor(i < 0 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.captionLimitView;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatActivityEnterView.this.captionLimitView.setVisibility(8);
                        }
                    });
                }
            }
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        SendButton sendButton = this.sendButton;
        if (onLongClickListener == null) {
            onLongClickListener = new ChatActivityEnterView$$ExternalSyntheticLambda14(this);
        }
        sendButton.setOnLongClickListener(onLongClickListener);
    }

    public long getStarsPrice() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            return chatActivity.getMessagesController().getSendPaidMessagesStars(this.parentFragment.getDialogId());
        }
        return MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialog_id);
    }

    public int getMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        ChatActivity chatActivity = this.parentFragment;
        int forwardedMessagesCount = (chatActivity == null || (messagePreviewParams = chatActivity.messagePreviewParams) == null) ? 0 : messagePreviewParams.getForwardedMessagesCount();
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption != null && !TextUtils.isEmpty(editTextCaption.getText())) {
            String trimmedString = SendMessagesHelper.getTrimmedString(this.messageEditText.getText().toString());
            int maxMessageLength = this.accountInstance.getMessagesController().getMaxMessageLength();
            if (trimmedString.length() != 0) {
                forwardedMessagesCount += (int) Math.ceil(trimmedString.length() / maxMessageLength);
            } else {
                forwardedMessagesCount++;
            }
        } else if (hasAudioToSend()) {
            forwardedMessagesCount++;
        }
        return Math.max(1, forwardedMessagesCount);
    }

    public void createCaptionLimitView() {
        if (this.captionLimitView != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.captionLimitView = numberTextView;
        numberTextView.setVisibility(8);
        this.captionLimitView.setTextSize(15);
        this.captionLimitView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        this.captionLimitView.setTypeface(AndroidUtilities.bold());
        this.captionLimitView.setCenterAlign(true);
        addView(this.captionLimitView, Math.min(2, getChildCount()), LayoutHelper.createFrame(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    private void createScheduledButton() {
        if (this.scheduledButton != null || this.parentFragment == null) {
            return;
        }
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int themedColor = getThemedColor(Theme.key_glass_defaultIcon);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_recordedVoiceDot), mode));
        CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate, drawableMutate2);
        ImageView imageView = new ImageView(getContext()) {
            private float innerTranslationX;

            @Override
            public float getTranslationX() {
                return this.innerTranslationX;
            }

            @Override
            public void setTranslationX(float f) {
                this.innerTranslationX = f;
                float fDp = AndroidUtilities.dp(-44.0f) + this.innerTranslationX;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                super.setTranslationX(fDp + chatActivityEnterView.attachLayoutPaddingTranslationX + chatActivityEnterView.attachLayoutTranslationX + (AndroidUtilities.dp((ChatActivityEnterView.this.giftButton == null || ChatActivityEnterView.this.giftButton.getVisibility() != 0) ? 0.0f : -44.0f) * (ChatActivityEnterView.this.giftButton == null ? 0.0f : ChatActivityEnterView.this.giftButton.getAlpha())) + (AndroidUtilities.dp((ChatActivityEnterView.this.botButton == null || ChatActivityEnterView.this.botButton.getVisibility() != 0) ? 0.0f : -44.0f) * (ChatActivityEnterView.this.botButton != null ? ChatActivityEnterView.this.botButton.getAlpha() : 0.0f)));
            }
        };
        this.scheduledButton = imageView;
        imageView.setImageDrawable(combinedDrawable);
        this.scheduledButton.setVisibility(8);
        this.scheduledButton.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
        this.scheduledButton.setScaleType(ImageView.ScaleType.CENTER);
        this.scheduledButton.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector)));
        this.messageEditTextContainer.addView(this.scheduledButton, 2, LayoutHelper.createFrame(44, 44, 85));
        this.scheduledButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.m2085$r8$lambda$6xZAfoooh9MLplbrM7GFkNHW5U(this.f$0, view);
            }
        });
        this.scheduledButton.setTranslationX(0.0f);
    }

    public static void m2085$r8$lambda$6xZAfoooh9MLplbrM7GFkNHW5U(ChatActivityEnterView chatActivityEnterView, View view) {
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.openScheduledMessages();
        }
    }

    private ValueAnimator animateScheduledTranslationX(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.scheduledButton.getTranslationX(), f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.scheduledButton.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    private void createGiftButton() {
        if (this.giftButton != null || this.parentFragment == null) {
            return;
        }
        AnonymousClass30 anonymousClass30 = new AnonymousClass30(getContext());
        this.giftButton = anonymousClass30;
        anonymousClass30.setImageResource(R.drawable.msg_input_gift);
        this.giftButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_glass_defaultIcon), PorterDuff.Mode.MULTIPLY));
        this.giftButton.setVisibility(8);
        this.giftButton.setContentDescription(LocaleController.getString(R.string.GiftPremium));
        this.giftButton.setScaleType(ImageView.ScaleType.CENTER);
        this.giftButton.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector)));
        this.attachLayout.addView(this.giftButton, 0, LayoutHelper.createFrame(44, 44, 21));
        this.giftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.m2095$r8$lambda$NYsSHzCsd9txxTEeOEtSbM5vEk(this.f$0, view);
            }
        });
    }

    class AnonymousClass30 extends ImageView {
        AnonymousClass30(Context context) {
            super(context);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            final ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            post(new Runnable() {
                @Override
                public final void run() {
                    chatActivityEnterView.checkBirthdayHint();
                }
            });
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            if (ChatActivityEnterView.this.scheduledButton != null) {
                ChatActivityEnterView.this.scheduledButton.setTranslationX(ChatActivityEnterView.this.scheduledButton.getTranslationX());
            }
        }
    }

    public static void m2095$r8$lambda$NYsSHzCsd9txxTEeOEtSbM5vEk(final ChatActivityEnterView chatActivityEnterView, View view) {
        SharedPreferences.Editor editorEdit = MessagesController.getInstance(chatActivityEnterView.currentAccount).getMainSettings().edit();
        if (BirthdayController.isToday(chatActivityEnterView.parentFragment.getCurrentUserInfo())) {
            editorEdit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + chatActivityEnterView.parentFragment.getDialogId(), false);
        } else {
            editorEdit.putBoolean("show_gift_for_" + chatActivityEnterView.parentFragment.getDialogId(), false);
        }
        if (MessagesController.getInstance(chatActivityEnterView.currentAccount).giftAttachMenuIcon && MessagesController.getInstance(chatActivityEnterView.currentAccount).giftTextFieldIcon) {
            editorEdit.putBoolean("show_gift_for_" + chatActivityEnterView.parentFragment.getDialogId(), false);
        }
        editorEdit.apply();
        TLRPC.UserFull userFull = MessagesController.getInstance(chatActivityEnterView.currentAccount).getUserFull(UserConfig.getInstance(chatActivityEnterView.currentAccount).getClientUserId());
        if ((chatActivityEnterView.getParentFragment().getCurrentUserInfo() == null || !chatActivityEnterView.getParentFragment().getCurrentUserInfo().display_gifts_button) && (userFull == null || !userFull.display_gifts_button)) {
            AndroidUtilities.updateViewVisibilityAnimated(chatActivityEnterView.giftButton, false);
        }
        final TLRPC.User currentUser = chatActivityEnterView.getParentFragment().getCurrentUser();
        if (currentUser == null) {
            return;
        }
        final boolean z = chatActivityEnterView.getParentFragment().getCurrentUserInfo() != null && BirthdayController.isToday(chatActivityEnterView.getParentFragment().getCurrentUserInfo().birthday);
        final AlertDialog alertDialog = new AlertDialog(chatActivityEnterView.getContext(), 3);
        alertDialog.showDelayed(200L);
        final int iLoadGiftOptions = BoostRepository.loadGiftOptions(chatActivityEnterView.currentAccount, null, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatActivityEnterView.$r8$lambda$P1norzP0ojKfp5SbJ1Jz61uZgVk(this.f$0, alertDialog, currentUser, z, (List) obj);
            }
        });
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                this.f$0.parentFragment.getConnectionsManager().cancelRequest(iLoadGiftOptions, true);
            }
        });
    }

    public static void $r8$lambda$P1norzP0ojKfp5SbJ1Jz61uZgVk(ChatActivityEnterView chatActivityEnterView, AlertDialog alertDialog, TLRPC.User user, boolean z, List list) {
        chatActivityEnterView.getClass();
        alertDialog.dismiss();
        new GiftSheet(chatActivityEnterView.getContext(), chatActivityEnterView.currentAccount, user.id, BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(list, 1)), null).setBirthday(z).show();
    }

    public void createSuggestionButton() {
        if (this.suggestButton != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.suggestButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.suggestButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_glass_defaultIcon), PorterDuff.Mode.MULTIPLY));
        this.suggestButton.setImageResource(R.drawable.input_suggest_paid_24);
        this.suggestButton.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector)));
        if (this.isLiveComment) {
            this.suggestButton.setTranslationX(AndroidUtilities.dp(42.0f));
            this.textFieldContainer.addView(this.suggestButton, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
        } else {
            this.attachLayout.addView(this.suggestButton, 0, LayoutHelper.createLinear(44, 44));
        }
        this.suggestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.$r8$lambda$qiKoivYvOttLzm92pi4qlBXavls(this.f$0, view);
            }
        });
        this.suggestButton.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
    }

    public static void $r8$lambda$qiKoivYvOttLzm92pi4qlBXavls(ChatActivityEnterView chatActivityEnterView, View view) {
        AdjustPanLayoutHelper adjustPanLayoutHelper = chatActivityEnterView.adjustPanLayoutHelper;
        if ((adjustPanLayoutHelper == null || !adjustPanLayoutHelper.animationInProgress()) && chatActivityEnterView.attachLayoutPaddingAlpha != 0.0f) {
            chatActivityEnterView.delegate.didPressSuggestionButton();
        }
    }

    public void setSuggestionButtonVisible(final boolean z, boolean z2) {
        if (this.suggestButtonVisible == z && z2) {
            return;
        }
        if (this.suggestButton == null) {
            if (!z && !this.isLiveComment) {
                return;
            } else {
                createSuggestionButton();
            }
        }
        boolean z3 = this.suggestButtonVisible != z;
        this.suggestButtonVisible = z;
        float f = z ? 1.0f : 0.6f;
        float f2 = z ? 1.0f : 0.0f;
        this.suggestButton.setEnabled(z);
        this.suggestButton.setClickable(z);
        ValueAnimator valueAnimator = this.suggestButtonAppear;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.suggestButtonAppear = null;
        }
        if (z2) {
            if (this.isLiveComment) {
                this.suggestButton.setVisibility(0);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.suggestButton.getAlpha(), f2);
            this.suggestButtonAppear = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChatActivityEnterView.$r8$lambda$KRJGRPpWye3AOw3e3WEvUoLl7Y4(this.f$0, valueAnimator2);
                }
            });
            this.suggestButtonAppear.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ChatActivityEnterView.this.isLiveComment) {
                        ChatActivityEnterView.this.suggestButton.setVisibility(z ? 0 : 8);
                    }
                }
            });
            this.suggestButtonAppear.setDuration(220L);
            this.suggestButtonAppear.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.suggestButtonAppear.start();
        } else {
            this.suggestButton.setScaleX(f);
            this.suggestButton.setScaleY(f);
            this.suggestButton.setAlpha(f2);
            if (this.isLiveComment) {
                this.suggestButton.setVisibility(z ? 0 : 8);
            }
        }
        updateFieldRight(this.lastAttachVisible);
        if (z3) {
            checkSendButton(true);
        }
    }

    public static void $r8$lambda$KRJGRPpWye3AOw3e3WEvUoLl7Y4(ChatActivityEnterView chatActivityEnterView, ValueAnimator valueAnimator) {
        chatActivityEnterView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatActivityEnterView.suggestButton.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
        chatActivityEnterView.suggestButton.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
        chatActivityEnterView.suggestButton.setAlpha(fFloatValue);
    }

    private void createBotButton() {
        if (this.botButton != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext()) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                if (ChatActivityEnterView.this.scheduledButton != null) {
                    ChatActivityEnterView.this.scheduledButton.setTranslationX(ChatActivityEnterView.this.scheduledButton.getTranslationX());
                }
            }
        };
        this.botButton = imageView;
        ReplaceableIconDrawable replaceableIconDrawable = new ReplaceableIconDrawable(getContext());
        this.botButtonDrawable = replaceableIconDrawable;
        imageView.setImageDrawable(replaceableIconDrawable);
        this.botButtonDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_glass_defaultIcon), PorterDuff.Mode.MULTIPLY));
        this.botButtonDrawable.setIcon(R.drawable.input_bot2, false);
        this.botButton.setScaleType(ImageView.ScaleType.CENTER);
        this.botButton.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector)));
        this.botButton.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.botButton, false, 0.1f, false);
        this.attachLayout.addView(this.botButton, 0, LayoutHelper.createLinear(44, 44));
        this.botButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.m2075$r8$lambda$8z0xcNbbeB0O4Kytrksfcn7Oc(this.f$0, view);
            }
        });
    }

    public static void m2075$r8$lambda$8z0xcNbbeB0O4Kytrksfcn7Oc(ChatActivityEnterView chatActivityEnterView, View view) {
        if (chatActivityEnterView.searchingType != 0) {
            chatActivityEnterView.setSearchingTypeInternal(0, false);
            chatActivityEnterView.emojiView.closeSearch(false);
            EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
            if (editTextCaption != null) {
                editTextCaption.requestFocus();
            }
        }
        if (chatActivityEnterView.botReplyMarkup != null) {
            if (!chatActivityEnterView.isPopupShowing() || chatActivityEnterView.currentPopupContentType != 1) {
                chatActivityEnterView.showPopup(1, 1);
            } else if (chatActivityEnterView.isPopupShowing() && chatActivityEnterView.currentPopupContentType == 1) {
                chatActivityEnterView.showPopup(0, 1, true, false);
            }
        } else if (chatActivityEnterView.hasBotCommands || chatActivityEnterView.hasQuickReplies) {
            chatActivityEnterView.setFieldText("/");
            EditTextCaption editTextCaption2 = chatActivityEnterView.messageEditText;
            if (editTextCaption2 != null) {
                editTextCaption2.requestFocus();
            }
            chatActivityEnterView.openKeyboard();
        }
        if (chatActivityEnterView.stickersExpanded) {
            chatActivityEnterView.setStickersExpanded(false, false, false);
        }
    }

    private void createDoneButton(boolean z) {
        if (this.doneButton != null) {
            return;
        }
        SendButton sendButton = new SendButton(getContext(), R.drawable.input_done, this.resourcesProvider, true) {
            @Override
            public boolean isOpen() {
                return true;
            }

            @Override
            public boolean isInactive() {
                return !ChatActivityEnterView.this.doneButtonEnabled;
            }
        };
        this.doneButton = sendButton;
        sendButton.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z) {
            ScaleStateListAnimator.apply(this.doneButton);
        }
        this.textFieldContainer.addView(this.doneButton, LayoutHelper.createFrame(44, 44, 85));
    }

    private void createExpandStickersButton() {
        if (this.expandStickersButton != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext()) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                if (ChatActivityEnterView.this.audioVideoButtonContainer != null) {
                    ChatActivityEnterView.this.audioVideoButtonContainer.invalidate();
                }
            }

            @Override
            public void setVisibility(int i) {
                super.setVisibility(i);
                if (ChatActivityEnterView.this.audioVideoButtonContainer != null) {
                    ChatActivityEnterView.this.audioVideoButtonContainer.invalidate();
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (getAlpha() <= 0.0f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.expandStickersButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.expandStickersButton;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(getThemedColor(Theme.key_glass_defaultIcon), false);
        this.stickersArrow = animatedArrowDrawable;
        imageView2.setImageDrawable(animatedArrowDrawable);
        this.expandStickersButton.setVisibility(8);
        this.expandStickersButton.setScaleX(0.1f);
        this.expandStickersButton.setScaleY(0.1f);
        this.expandStickersButton.setAlpha(0.0f);
        this.expandStickersButton.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector)));
        this.sendButtonContainer.addView(this.expandStickersButton, LayoutHelper.createFrame(44, 44, 85));
        this.expandStickersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.$r8$lambda$gjVyIdVIj1YhH1jvxgKXzthpd5E(this.f$0, view);
            }
        });
        this.expandStickersButton.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public static void $r8$lambda$gjVyIdVIj1YhH1jvxgKXzthpd5E(ChatActivityEnterView chatActivityEnterView, View view) {
        EmojiView emojiView;
        EditTextCaption editTextCaption;
        if (chatActivityEnterView.expandStickersButton.getVisibility() == 0 && chatActivityEnterView.expandStickersButton.getAlpha() == 1.0f && !chatActivityEnterView.waitingForKeyboardOpen) {
            if (chatActivityEnterView.keyboardVisible && (editTextCaption = chatActivityEnterView.messageEditText) != null && editTextCaption.isFocused()) {
                return;
            }
            if (chatActivityEnterView.stickersExpanded) {
                if (chatActivityEnterView.searchingType != 0) {
                    chatActivityEnterView.setSearchingTypeInternal(0, true);
                    chatActivityEnterView.emojiView.closeSearch(true);
                    chatActivityEnterView.emojiView.hideSearchKeyboard();
                    if (chatActivityEnterView.emojiTabOpen) {
                        chatActivityEnterView.checkSendButton(true);
                    }
                } else if (!chatActivityEnterView.stickersDragging && (emojiView = chatActivityEnterView.emojiView) != null) {
                    emojiView.showSearchField(false);
                }
            } else if (!chatActivityEnterView.stickersDragging) {
                chatActivityEnterView.emojiView.showSearchField(true);
            }
            if (chatActivityEnterView.stickersDragging) {
                return;
            }
            chatActivityEnterView.setStickersExpanded(!chatActivityEnterView.stickersExpanded, true, false);
        }
    }

    private void createRecordAudioPanel() {
        if (this.recordedAudioPanel != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext()) {
            @Override
            public void setVisibility(int i) {
                super.setVisibility(i);
                ChatActivityEnterView.this.updateSendAsButton();
            }
        };
        this.recordedAudioPanel = frameLayout;
        frameLayout.setVisibility(this.audioToSend == null ? 8 : 0);
        this.recordedAudioPanel.setFocusable(true);
        this.recordedAudioPanel.setFocusableInTouchMode(true);
        this.recordedAudioPanel.setClickable(true);
        this.messageEditTextContainer.addView(this.recordedAudioPanel, LayoutHelper.createFrame(-1, 44, 80));
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        this.recordDeleteImageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.recordDeleteImageView.setAnimation(R.raw.chat_audio_record_delete_2, 28, 28);
        this.recordDeleteImageView.getAnimatedDrawable().setInvalidateOnProgressSet(true);
        updateRecordedDeleteIconColors();
        this.recordDeleteImageView.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.recordDeleteImageView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector)));
        this.recordedAudioPanel.addView(this.recordDeleteImageView, LayoutHelper.createFrame(44, 44.0f));
        this.recordDeleteImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.m2081$r8$lambda$22Ul2MtdAe_tCMDLwGtSAcEDsI(this.f$0, view);
            }
        });
        VideoTimelineView videoTimelineView = new VideoTimelineView(getContext());
        this.videoTimelineView = videoTimelineView;
        videoTimelineView.setVisibility(4);
        VideoTimelineView videoTimelineView2 = this.videoTimelineView;
        videoTimelineView2.useClip = !this.shouldDrawBackground;
        videoTimelineView2.setRoundFrames(true);
        this.videoTimelineView.setDelegate(new VideoTimelineView.VideoTimelineViewDelegate() {
            @Override
            public void onLeftProgressChanged(float f) {
                if (ChatActivityEnterView.this.videoToSendMessageObject == null) {
                    return;
                }
                ChatActivityEnterView.this.videoToSendMessageObject.startTime = (long) (ChatActivityEnterView.this.videoToSendMessageObject.estimatedDuration * f);
                ChatActivityEnterView.this.delegate.needChangeVideoPreviewState(2, f);
            }

            @Override
            public void onRightProgressChanged(float f) {
                if (ChatActivityEnterView.this.videoToSendMessageObject == null) {
                    return;
                }
                ChatActivityEnterView.this.videoToSendMessageObject.endTime = (long) (ChatActivityEnterView.this.videoToSendMessageObject.estimatedDuration * f);
                ChatActivityEnterView.this.delegate.needChangeVideoPreviewState(2, f);
            }

            @Override
            public void didStartDragging() {
                ChatActivityEnterView.this.delegate.needChangeVideoPreviewState(1, 0.0f);
            }

            @Override
            public void didStopDragging() {
                ChatActivityEnterView.this.delegate.needChangeVideoPreviewState(0, 0.0f);
            }
        });
        this.recordedAudioPanel.addView(this.videoTimelineView, LayoutHelper.createFrame(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        VideoTimelineView.TimeHintView timeHintView = new VideoTimelineView.TimeHintView(getContext());
        this.videoTimelineView.setTimeHintView(timeHintView);
        this.sizeNotifierLayout.addView(timeHintView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        RecordedAudioPlayerView recordedAudioPlayerView = new RecordedAudioPlayerView(getContext(), this.resourcesProvider);
        this.audioTimelineView = recordedAudioPlayerView;
        this.recordedAudioPanel.addView(recordedAudioPlayerView, LayoutHelper.createFrame(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        updateFieldRight(this.lastAttachVisible);
    }

    public static void m2081$r8$lambda$22Ul2MtdAe_tCMDLwGtSAcEDsI(ChatActivityEnterView chatActivityEnterView, View view) {
        AnimatorSet animatorSet = chatActivityEnterView.runningAnimationAudio;
        if (animatorSet == null || !animatorSet.isRunning()) {
            chatActivityEnterView.resetRecordedState();
        }
    }

    private void resetRecordedState() {
        RecordedAudioPlayerView recordedAudioPlayerView = this.audioTimelineView;
        if (recordedAudioPlayerView != null) {
            recordedAudioPlayerView.setPlaying(false);
        }
        if (this.videoToSendMessageObject != null) {
            CameraController.getInstance().cancelOnInitRunnable(this.onFinishInitCameraRunnable);
            this.delegate.needStartRecordVideo(2, true, 0, 0, this.voiceOnce ? Integer.MAX_VALUE : 0, this.effectId, 0L);
            SendButton sendButton = this.sendButton;
            this.effectId = 0L;
            sendButton.setEffect(0L);
        } else {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject == this.audioToSendMessageObject) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
        }
        if (this.audioToSendPath != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("delete file " + this.audioToSendPath);
            }
            new File(this.audioToSendPath).delete();
        }
        MediaController.getInstance().cleanRecording(true);
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        long j = this.dialog_id;
        ChatActivity chatActivity = this.parentFragment;
        mediaDataController.pushDraftVoiceMessage(j, (chatActivity == null || !chatActivity.isTopic) ? 0L : chatActivity.getTopicId(), null);
        MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        this.millisecondsRecorded = 0L;
        hideRecordedAudioPanel(false);
        checkSendButton(true);
    }

    public void createSenderSelectView() {
        if (this.senderSelectView != null || getContext() == null) {
            return;
        }
        SenderSelectView senderSelectView = new SenderSelectView(getContext());
        this.senderSelectView = senderSelectView;
        senderSelectView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.$r8$lambda$qyBmK8X7FiLOYGLz_2R8nGUrVJQ(this.f$0, view);
            }
        });
        this.senderSelectView.setVisibility(8);
        this.messageEditTextContainer.addView(this.senderSelectView, LayoutHelper.createFrame(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public static void $r8$lambda$qyBmK8X7FiLOYGLz_2R8nGUrVJQ(final ChatActivityEnterView chatActivityEnterView, View view) {
        final TLRPC.ChatFull chatFull;
        int i;
        int iDp;
        ChatActivity chatActivity;
        if (!chatActivityEnterView.isLiveComment ? chatActivityEnterView.getTranslationY() != 0.0f : chatActivityEnterView.isPopupShowing()) {
            chatActivityEnterView.onEmojiSearchClosed = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.senderSelectView.callOnClick();
                }
            };
            if (chatActivityEnterView.isLiveComment) {
                chatActivityEnterView.hidePopup(true, false);
                return;
            } else {
                chatActivityEnterView.hidePopup(true, true);
                return;
            }
        }
        if (chatActivityEnterView.delegate.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            int contentViewHeight = chatActivityEnterView.delegate.getContentViewHeight();
            int iMeasureKeyboardHeight = chatActivityEnterView.delegate.measureKeyboardHeight();
            if (iMeasureKeyboardHeight <= AndroidUtilities.dp(20.0f)) {
                contentViewHeight += iMeasureKeyboardHeight;
            }
            if (chatActivityEnterView.emojiViewVisible) {
                contentViewHeight -= chatActivityEnterView.getEmojiPadding();
            }
            if (contentViewHeight < AndroidUtilities.dp(200.0f)) {
                chatActivityEnterView.onKeyboardClosed = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.senderSelectView.callOnClick();
                    }
                };
                chatActivityEnterView.closeKeyboard();
                return;
            }
        }
        if (chatActivityEnterView.delegate.getSendAsPeers() != null) {
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            SenderSelectPopup senderSelectPopup = chatActivityEnterView.senderSelectPopupWindow;
            if (senderSelectPopup != null) {
                senderSelectPopup.setPauseNotifications(false);
                chatActivityEnterView.senderSelectPopupWindow.startDismissAnimation(new SpringAnimation[0]);
                return;
            }
            final MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.currentAccount);
            TLRPC.Peer defaultSendAs = null;
            if (chatActivityEnterView.isLiveComment) {
                defaultSendAs = chatActivityEnterView.delegate.getDefaultSendAs();
                chatFull = null;
            } else {
                MessagesController.getInstance(chatActivityEnterView.currentAccount).getChat(Long.valueOf(-chatActivityEnterView.dialog_id));
                chatFull = MessagesController.getInstance(chatActivityEnterView.currentAccount).getChatFull(-chatActivityEnterView.dialog_id);
                if (chatFull != null) {
                    defaultSendAs = chatFull.default_send_as;
                }
            }
            if (defaultSendAs == null && chatActivityEnterView.delegate.getSendAsPeers() != null && !chatActivityEnterView.delegate.getSendAsPeers().peers.isEmpty()) {
                defaultSendAs = chatActivityEnterView.delegate.getSendAsPeers().peers.get(0).peer;
            }
            TLRPC.Peer peer = defaultSendAs;
            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-chatActivityEnterView.dialog_id)));
            if (chatActivityEnterView.isLiveComment) {
            } else {
                chatActivityEnterView.parentFragment.getParentLayout().getOverlayContainerView();
            }
            SenderSelectPopup senderSelectPopup2 = new SenderSelectPopup(chatActivityEnterView.getContext(), chatActivityEnterView.parentFragment, messagesController, zIsChannelAndNotMegaGroup, peer, chatActivityEnterView.delegate.getSendAsPeers(), new SenderSelectPopup.OnSelectCallback() {
                @Override
                public final void onPeerSelected(RecyclerView recyclerView, SenderSelectPopup.SenderView senderView, TLRPC.Peer peer2) {
                    ChatActivityEnterView.$r8$lambda$02JWZInpurTv2aRRRO9pvcvyKWo(this.f$0, chatFull, messagesController, recyclerView, senderView, peer2);
                }
            }, chatActivityEnterView.resourcesProvider) {
                @Override
                public void dismiss() {
                    if (ChatActivityEnterView.this.senderSelectPopupWindow == this) {
                        ChatActivityEnterView.this.senderSelectPopupWindow = null;
                        if (!this.runningCustomSprings) {
                            startDismissAnimation(new SpringAnimation[0]);
                            ChatActivityEnterView.this.senderSelectView.setProgress(0.0f, true, true);
                            return;
                        }
                        Iterator it = this.springAnimations.iterator();
                        while (it.hasNext()) {
                            ((SpringAnimation) it.next()).cancel();
                        }
                        this.springAnimations.clear();
                        super.dismiss();
                        return;
                    }
                    super.dismiss();
                }
            };
            chatActivityEnterView.senderSelectPopupWindow = senderSelectPopup2;
            senderSelectPopup2.setPauseNotifications(true);
            chatActivityEnterView.senderSelectPopupWindow.setDismissAnimationDuration(220);
            chatActivityEnterView.senderSelectPopupWindow.setOutsideTouchable(true);
            chatActivityEnterView.senderSelectPopupWindow.setClippingEnabled(true);
            chatActivityEnterView.senderSelectPopupWindow.setFocusable(true);
            chatActivityEnterView.senderSelectPopupWindow.getContentView().measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            chatActivityEnterView.senderSelectPopupWindow.setInputMethodMode(2);
            chatActivityEnterView.senderSelectPopupWindow.setSoftInputMode(0);
            chatActivityEnterView.senderSelectPopupWindow.getContentView().setFocusableInTouchMode(true);
            chatActivityEnterView.senderSelectPopupWindow.setAnimationEnabled(false);
            int i2 = -AndroidUtilities.dp(4.0f);
            int[] iArr = new int[2];
            if (!AndroidUtilities.isTablet() || (chatActivity = chatActivityEnterView.parentFragment) == null) {
                i = i2;
            } else {
                chatActivity.getFragmentView().getLocationInWindow(iArr);
                i = iArr[0] + i2;
            }
            int contentViewHeight2 = chatActivityEnterView.delegate.getContentViewHeight();
            int measuredHeight = chatActivityEnterView.senderSelectPopupWindow.getContentView().getMeasuredHeight();
            int iMeasureKeyboardHeight2 = chatActivityEnterView.delegate.measureKeyboardHeight();
            if (iMeasureKeyboardHeight2 <= AndroidUtilities.dp(20.0f)) {
                contentViewHeight2 += iMeasureKeyboardHeight2;
            }
            if (chatActivityEnterView.emojiViewVisible) {
                contentViewHeight2 -= chatActivityEnterView.getEmojiPadding();
            }
            AndroidUtilities.dp(1.0f);
            int i3 = (i2 * 2) + contentViewHeight2;
            ChatActivity chatActivity2 = chatActivityEnterView.parentFragment;
            if (measuredHeight < (i3 - ((chatActivity2 == null || !chatActivity2.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0)) - chatActivityEnterView.senderSelectPopupWindow.headerText.getMeasuredHeight()) {
                chatActivityEnterView.getLocationInWindow(iArr);
                iDp = ((iArr[1] - measuredHeight) - i2) - AndroidUtilities.dp(2.0f);
            } else {
                ChatActivity chatActivity3 = chatActivityEnterView.parentFragment;
                int i4 = (chatActivity3 == null || !chatActivity3.isInBubbleMode()) ? AndroidUtilities.statusBarHeight : 0;
                chatActivityEnterView.senderSelectPopupWindow.recyclerContainer.getLayoutParams().height = ((contentViewHeight2 - i4) - AndroidUtilities.dp(14.0f)) - chatActivityEnterView.getHeightWithTopView();
                iDp = i4;
            }
            chatActivityEnterView.senderSelectPopupWindow.startShowAnimation();
            SenderSelectPopup senderSelectPopup3 = chatActivityEnterView.senderSelectPopupWindow;
            chatActivityEnterView.popupX = i;
            chatActivityEnterView.popupY = iDp;
            senderSelectPopup3.showAtLocation(view, 51, i, iDp);
            chatActivityEnterView.senderSelectView.setProgress(1.0f);
        }
    }

    public static void $r8$lambda$02JWZInpurTv2aRRRO9pvcvyKWo(final ChatActivityEnterView chatActivityEnterView, TLRPC.ChatFull chatFull, MessagesController messagesController, RecyclerView recyclerView, final SenderSelectPopup.SenderView senderView, TLRPC.Peer peer) {
        TLRPC.User user;
        if (chatActivityEnterView.senderSelectPopupWindow == null) {
            return;
        }
        if (chatFull != null) {
            chatFull.default_send_as = peer;
        }
        chatActivityEnterView.updateSendAsButton();
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate == null || !chatActivityEnterViewDelegate.setDefaultSendAs(chatActivityEnterView.dialog_id, DialogObject.getPeerDialogId(peer))) {
            messagesController.setDefaultSendAs(chatActivityEnterView.dialog_id, DialogObject.getPeerDialogId(peer));
        }
        final int[] iArr = new int[2];
        boolean zIsSelected = senderView.avatar.isSelected();
        senderView.avatar.getLocationInWindow(iArr);
        senderView.avatar.setSelected(true, true);
        final SimpleAvatarView simpleAvatarView = new SimpleAvatarView(chatActivityEnterView.getContext());
        long j = peer.channel_id;
        if (j != 0) {
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
            if (chat != null) {
                simpleAvatarView.setAvatar(chat);
            }
        } else {
            long j2 = peer.user_id;
            if (j2 != 0 && (user = messagesController.getUser(Long.valueOf(j2))) != null) {
                simpleAvatarView.setAvatar(user);
            }
        }
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if ((childAt instanceof SenderSelectPopup.SenderView) && childAt != senderView) {
                ((SenderSelectPopup.SenderView) childAt).avatar.setSelected(false, true);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$7qjEOurB0igLlJB9zoUkWMehbNY(this.f$0, simpleAvatarView, iArr, senderView);
            }
        }, zIsSelected ? 0L : 200L);
    }

    public static void $r8$lambda$7qjEOurB0igLlJB9zoUkWMehbNY(final ChatActivityEnterView chatActivityEnterView, final SimpleAvatarView simpleAvatarView, int[] iArr, SenderSelectPopup.SenderView senderView) {
        char c;
        SpringAnimation spring;
        if (chatActivityEnterView.senderSelectPopupWindow == null) {
            return;
        }
        final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(simpleAvatarView, LayoutHelper.createFrame(40, 40, 3));
        dialog.setContentView(frameLayout);
        dialog.getWindow().setLayout(-1, -1);
        dialog.getWindow().clearFlags(1024);
        dialog.getWindow().clearFlags(67108864);
        dialog.getWindow().clearFlags(134217728);
        dialog.getWindow().addFlags(Integer.MIN_VALUE);
        dialog.getWindow().addFlags(512);
        dialog.getWindow().addFlags(131072);
        dialog.getWindow().getAttributes().windowAnimations = 0;
        dialog.getWindow().getDecorView().setSystemUiVisibility(1792);
        dialog.getWindow().setStatusBarColor(0);
        dialog.getWindow().setNavigationBarColor(0);
        AndroidUtilities.setLightStatusBar(dialog, Theme.getColor(Theme.key_actionBarDefault, null, true) == -1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            AndroidUtilities.setLightNavigationBar(dialog, AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundGray, null, true)) >= 0.721f);
        }
        if (i >= 23) {
            chatActivityEnterView.popupX += chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft();
        }
        chatActivityEnterView.senderSelectView.getLocationInWindow(chatActivityEnterView.location);
        int[] iArr2 = chatActivityEnterView.location;
        final float f = iArr2[0];
        final float f2 = iArr2[1];
        float fDp = AndroidUtilities.dp(5.0f);
        float fDp2 = iArr[0] + chatActivityEnterView.popupX + fDp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f3 = iArr[1] + chatActivityEnterView.popupY + fDp + 0.0f;
        simpleAvatarView.setTranslationX(fDp2);
        simpleAvatarView.setTranslationY(f3);
        float scaleX = (chatActivityEnterView.senderSelectView.getLayoutParams().width * (chatActivityEnterView.isLiveComment ? chatActivityEnterView.senderSelectView.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
        simpleAvatarView.setPivotX(0.0f);
        simpleAvatarView.setPivotY(0.0f);
        simpleAvatarView.setScaleX(0.75f);
        simpleAvatarView.setScaleY(0.75f);
        simpleAvatarView.getViewTreeObserver().addOnDrawListener(chatActivityEnterView.new AnonymousClass38(simpleAvatarView, senderView));
        dialog.show();
        if (!chatActivityEnterView.isLiveComment) {
            chatActivityEnterView.senderSelectView.setScaleX(1.0f);
            chatActivityEnterView.senderSelectView.setScaleY(1.0f);
        }
        chatActivityEnterView.senderSelectView.setAlpha(1.0f);
        SenderSelectPopup senderSelectPopup = chatActivityEnterView.senderSelectPopupWindow;
        if (chatActivityEnterView.isLiveComment) {
            spring = null;
            c = 3;
        } else {
            c = 3;
            spring = new SpringAnimation(chatActivityEnterView.senderSelectView, DynamicAnimation.SCALE_X).setSpring(new SpringForce(0.5f).setStiffness(750.0f).setDampingRatio(1.0f));
        }
        SpringAnimation spring2 = chatActivityEnterView.isLiveComment ? null : new SpringAnimation(chatActivityEnterView.senderSelectView, DynamicAnimation.SCALE_Y).setSpring(new SpringForce(0.5f).setStiffness(750.0f).setDampingRatio(1.0f));
        SpringAnimation springAnimation = (SpringAnimation) new SpringAnimation(chatActivityEnterView.senderSelectView, DynamicAnimation.ALPHA).setSpring(new SpringForce(0.0f).setStiffness(750.0f).setDampingRatio(1.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f4, float f5) {
                ChatActivityEnterView.$r8$lambda$LcNvtygXF_0XlmK6BIHsrNai9Ms(this.f$0, dialog, simpleAvatarView, f, f2, dynamicAnimation, z, f4, f5);
            }
        });
        SpringAnimation springAnimation2 = (SpringAnimation) ((SpringAnimation) new SpringAnimation(simpleAvatarView, DynamicAnimation.TRANSLATION_X).setStartValue(MathUtils.clamp(fDp2, f - AndroidUtilities.dp(6.0f), fDp2))).setSpring(new SpringForce(f).setStiffness(700.0f).setDampingRatio(0.75f)).setMinValue(f - AndroidUtilities.dp(6.0f));
        SpringAnimation springAnimation3 = (SpringAnimation) ((SpringAnimation) ((SpringAnimation) ((SpringAnimation) new SpringAnimation(simpleAvatarView, DynamicAnimation.TRANSLATION_Y).setStartValue(MathUtils.clamp(f3, f3, AndroidUtilities.dp(6.0f) + f2))).setSpring(new SpringForce(f2).setStiffness(700.0f).setDampingRatio(0.75f)).setMaxValue(AndroidUtilities.dp(6.0f) + f2)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            boolean performedHapticFeedback = false;

            @Override
            public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f4, float f5) {
                if (this.performedHapticFeedback || f4 < f2) {
                    return;
                }
                this.performedHapticFeedback = true;
                try {
                    simpleAvatarView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        })).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f4, float f5) {
                ChatActivityEnterView.$r8$lambda$QznAcl1N_NxiJ576Be_MW2QBb5c(this.f$0, dialog, simpleAvatarView, f, f2, dynamicAnimation, z, f4, f5);
            }
        });
        SpringAnimation spring3 = new SpringAnimation(simpleAvatarView, DynamicAnimation.SCALE_X).setSpring(new SpringForce(scaleX).setStiffness(1000.0f).setDampingRatio(1.0f));
        SpringAnimation spring4 = new SpringAnimation(simpleAvatarView, DynamicAnimation.SCALE_Y).setSpring(new SpringForce(scaleX).setStiffness(1000.0f).setDampingRatio(1.0f));
        SpringAnimation[] springAnimationArr = new SpringAnimation[7];
        springAnimationArr[0] = spring;
        springAnimationArr[1] = spring2;
        springAnimationArr[2] = springAnimation;
        springAnimationArr[c] = springAnimation2;
        springAnimationArr[4] = springAnimation3;
        springAnimationArr[5] = spring3;
        springAnimationArr[6] = spring4;
        senderSelectPopup.startDismissAnimation(springAnimationArr);
    }

    class AnonymousClass38 implements ViewTreeObserver.OnDrawListener {
        final SimpleAvatarView val$avatar;
        final SenderSelectPopup.SenderView val$senderView;

        AnonymousClass38(SimpleAvatarView simpleAvatarView, SenderSelectPopup.SenderView senderView) {
            this.val$avatar = simpleAvatarView;
            this.val$senderView = senderView;
        }

        @Override
        public void onDraw() {
            final SimpleAvatarView simpleAvatarView = this.val$avatar;
            final SenderSelectPopup.SenderView senderView = this.val$senderView;
            simpleAvatarView.post(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.AnonymousClass38.$r8$lambda$kkzqFXv0PVK46_IiPY5hEqOyNpI(this.f$0, simpleAvatarView, senderView);
                }
            });
        }

        public static void $r8$lambda$kkzqFXv0PVK46_IiPY5hEqOyNpI(AnonymousClass38 anonymousClass38, SimpleAvatarView simpleAvatarView, SenderSelectPopup.SenderView senderView) {
            anonymousClass38.getClass();
            simpleAvatarView.getViewTreeObserver().removeOnDrawListener(anonymousClass38);
            senderView.avatar.setHideAvatar(true);
        }
    }

    public static void $r8$lambda$LcNvtygXF_0XlmK6BIHsrNai9Ms(ChatActivityEnterView chatActivityEnterView, final Dialog dialog, SimpleAvatarView simpleAvatarView, float f, float f2, DynamicAnimation dynamicAnimation, boolean z, float f3, float f4) {
        chatActivityEnterView.getClass();
        if (dialog.isShowing()) {
            simpleAvatarView.setTranslationX(f);
            simpleAvatarView.setTranslationY(f2);
            chatActivityEnterView.senderSelectView.setProgress(0.0f, false);
            if (!chatActivityEnterView.isLiveComment) {
                chatActivityEnterView.senderSelectView.setScaleX(1.0f);
                chatActivityEnterView.senderSelectView.setScaleY(1.0f);
            }
            chatActivityEnterView.senderSelectView.setAlpha(1.0f);
            chatActivityEnterView.senderSelectView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    ChatActivityEnterView.this.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                    SenderSelectView senderSelectView = ChatActivityEnterView.this.senderSelectView;
                    Dialog dialog2 = dialog;
                    Objects.requireNonNull(dialog2);
                    senderSelectView.postDelayed(new ChatActivityEnterView$39$$ExternalSyntheticLambda0(dialog2), 100L);
                    return true;
                }
            });
        }
    }

    public static void $r8$lambda$QznAcl1N_NxiJ576Be_MW2QBb5c(ChatActivityEnterView chatActivityEnterView, final Dialog dialog, SimpleAvatarView simpleAvatarView, float f, float f2, DynamicAnimation dynamicAnimation, boolean z, float f3, float f4) {
        chatActivityEnterView.getClass();
        if (dialog.isShowing()) {
            simpleAvatarView.setTranslationX(f);
            simpleAvatarView.setTranslationY(f2);
            chatActivityEnterView.senderSelectView.setProgress(0.0f, false);
            if (!chatActivityEnterView.isLiveComment) {
                chatActivityEnterView.senderSelectView.setScaleX(1.0f);
                chatActivityEnterView.senderSelectView.setScaleY(1.0f);
            }
            chatActivityEnterView.senderSelectView.setAlpha(1.0f);
            chatActivityEnterView.senderSelectView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    ChatActivityEnterView.this.senderSelectView.getViewTreeObserver().removeOnPreDrawListener(this);
                    SenderSelectView senderSelectView = ChatActivityEnterView.this.senderSelectView;
                    Dialog dialog2 = dialog;
                    Objects.requireNonNull(dialog2);
                    senderSelectView.postDelayed(new ChatActivityEnterView$39$$ExternalSyntheticLambda0(dialog2), 100L);
                    return true;
                }
            });
        }
    }

    private void createBotCommandsMenuButton() {
        if (this.botCommandsMenuButton != null) {
            return;
        }
        BotCommandsMenuView botCommandsMenuView = new BotCommandsMenuView(getContext());
        this.botCommandsMenuButton = botCommandsMenuView;
        botCommandsMenuView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityEnterView.$r8$lambda$xM3blZBu4jis5SDTpdkSP2VuXt4(this.f$0, view);
            }
        });
        this.messageEditTextContainer.addView(this.botCommandsMenuButton, LayoutHelper.createFrame(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.botCommandsMenuButton, false, 1.0f, false);
        this.botCommandsMenuButton.setExpanded(true, false);
    }

    public static void $r8$lambda$xM3blZBu4jis5SDTpdkSP2VuXt4(final ChatActivityEnterView chatActivityEnterView, View view) {
        boolean zIsOpened = chatActivityEnterView.botCommandsMenuButton.isOpened();
        chatActivityEnterView.botCommandsMenuButton.setOpened(!zIsOpened);
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (chatActivityEnterView.hasBotWebView()) {
            if (zIsOpened) {
                return;
            }
            if (chatActivityEnterView.emojiViewVisible || chatActivityEnterView.botKeyboardViewVisible) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.openWebViewMenu();
                    }
                }, 275L);
                chatActivityEnterView.hidePopup(false);
                return;
            } else {
                chatActivityEnterView.openWebViewMenu();
                return;
            }
        }
        if (!zIsOpened) {
            chatActivityEnterView.createBotCommandsMenuContainer();
            chatActivityEnterView.botCommandsMenuContainer.show();
        } else {
            BotCommandsMenuContainer botCommandsMenuContainer = chatActivityEnterView.botCommandsMenuContainer;
            if (botCommandsMenuContainer != null) {
                botCommandsMenuContainer.dismiss();
            }
        }
    }

    private void createBotWebViewButton() {
        if (this.botWebViewButton != null) {
            return;
        }
        ChatActivityBotWebViewButton chatActivityBotWebViewButton = new ChatActivityBotWebViewButton(getContext());
        this.botWebViewButton = chatActivityBotWebViewButton;
        chatActivityBotWebViewButton.setVisibility(8);
        createBotCommandsMenuButton();
        this.botWebViewButton.setBotMenuButton(this.botCommandsMenuButton);
        this.messageEditTextContainer.addView(this.botWebViewButton, LayoutHelper.createFrame(-1, -1, 80));
    }

    public void createRecordCircle() {
        createControlsView();
        if (this.recordCircle != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.recordCircle = recordCircle;
        recordCircle.setVisibility(8);
        this.sizeNotifierLayout.addView(this.recordCircle, LayoutHelper.createFrame(-1, -2, 80));
    }

    private void createControlsView() {
        if (this.controlsView != null) {
            return;
        }
        ControlsView controlsView = new ControlsView(getContext());
        this.controlsView = controlsView;
        controlsView.setVisibility(8);
        this.sizeNotifierLayout.addView(this.controlsView, LayoutHelper.createFrame(-1, -2, 80));
    }

    public boolean isRecordCircleOrControlsView(View view) {
        if (view != null) {
            return view == this.controlsView || view == this.recordCircle;
        }
        return false;
    }

    public void showRestrictedHint() {
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if ((chatActivityEnterViewDelegate == null || !chatActivityEnterViewDelegate.checkCanRemoveRestrictionsByBoosts()) && DialogObject.isChatDialog(this.dialog_id)) {
            BulletinFactory.of(this.parentFragment).createSimpleBulletin(R.raw.passcode_lock_close, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id)))), 3).show();
        }
    }

    public void openWebViewMenu() {
        createBotWebViewMenuContainer();
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$N4TBQC4V1lAHwppleMRmoeFmEX4(this.f$0);
            }
        };
        if (SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, this.dialog_id) || MessagesController.getInstance(this.currentAccount).whitelistedBots.contains(Long.valueOf(this.dialog_id))) {
            runnable.run();
        } else {
            AlertsCreator.createBotLaunchAlert(this.parentFragment, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialog_id)), new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.m2106$r8$lambda$s_FgKwdRYp5Sy6wPBhVlpgTWaI(this.f$0, runnable);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.m2074$r8$lambda$vC3zH8vPYWyZm82ImgoVTszoM(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$N4TBQC4V1lAHwppleMRmoeFmEX4(final ChatActivityEnterView chatActivityEnterView) {
        chatActivityEnterView.getClass();
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        int i = chatActivityEnterView.currentAccount;
        long j = chatActivityEnterView.dialog_id;
        String str = chatActivityEnterView.botMenuWebViewTitle;
        String str2 = chatActivityEnterView.botMenuWebViewUrl;
        ChatActivity chatActivity = chatActivityEnterView.parentFragment;
        WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i, j, j, str, str2, 2, 0, chatActivity == null ? 0L : chatActivity.getSendMonoForumPeerId(), false, null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && launchActivity.getBottomSheetTabs() != null && LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf) != null) {
            BotCommandsMenuView botCommandsMenuView = chatActivityEnterView.botCommandsMenuButton;
            if (botCommandsMenuView != null) {
                botCommandsMenuView.setOpened(false);
                return;
            }
            return;
        }
        if (LinkManager.isWebAppLink(chatActivityEnterView.botMenuWebViewUrl)) {
            Browser.Progress progress = new Browser.Progress();
            progress.onEnd(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.$r8$lambda$45N66LcT3VAiOrbJ9QMh3Dteazs(this.f$0);
                }
            });
            Browser.openAsInternalIntent(chatActivityEnterView.getContext(), chatActivityEnterView.botMenuWebViewUrl, false, false, progress);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.currentAccount).getUser(Long.valueOf(chatActivityEnterView.dialog_id));
        String restrictionReason = MessagesController.getInstance(chatActivityEnterView.currentAccount).getRestrictionReason(user == null ? null : user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(chatActivityEnterView.currentAccount);
            MessagesController.showCantOpenAlert(chatActivityEnterView.parentFragment, restrictionReason);
            return;
        }
        BotWebViewSheet botWebViewSheet = new BotWebViewSheet(chatActivityEnterView.getContext(), chatActivityEnterView.resourcesProvider);
        botWebViewSheet.setDefaultFullsize(false);
        botWebViewSheet.setNeedsContext(true);
        botWebViewSheet.setParentActivity(chatActivityEnterView.parentActivity);
        botWebViewSheet.requestWebView(chatActivityEnterView.parentFragment, webViewRequestPropsOf);
        botWebViewSheet.show();
        BotCommandsMenuView botCommandsMenuView2 = chatActivityEnterView.botCommandsMenuButton;
        if (botCommandsMenuView2 != null) {
            botCommandsMenuView2.setOpened(false);
        }
    }

    public static void $r8$lambda$45N66LcT3VAiOrbJ9QMh3Dteazs(final ChatActivityEnterView chatActivityEnterView) {
        chatActivityEnterView.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.m2099$r8$lambda$_YALa1nc3XzowdrVGIllg7SYqc(this.f$0);
            }
        });
    }

    public static void m2099$r8$lambda$_YALa1nc3XzowdrVGIllg7SYqc(ChatActivityEnterView chatActivityEnterView) {
        BotCommandsMenuView botCommandsMenuView = chatActivityEnterView.botCommandsMenuButton;
        if (botCommandsMenuView != null) {
            botCommandsMenuView.setOpened(false);
        }
    }

    public static void m2106$r8$lambda$s_FgKwdRYp5Sy6wPBhVlpgTWaI(ChatActivityEnterView chatActivityEnterView, Runnable runnable) {
        chatActivityEnterView.getClass();
        runnable.run();
        SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id, true);
    }

    public static void m2074$r8$lambda$vC3zH8vPYWyZm82ImgoVTszoM(ChatActivityEnterView chatActivityEnterView) {
        if (chatActivityEnterView.botCommandsMenuButton == null || SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id)) {
            return;
        }
        chatActivityEnterView.botCommandsMenuButton.setOpened(false);
    }

    public void setBotWebViewButtonOffsetX(float f) {
        this.emojiButton.setTranslationX(f);
        if (this.messageEditText != null) {
            this.messageTextTranslationX = f;
            updateMessageTextParams();
        }
        this.attachButton.setTranslationX(this.attachLayoutPaddingTranslationX + this.attachLayoutTranslationX + f);
        this.audioVideoSendButton.setTranslationX(f);
        ImageView imageView = this.botButton;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
    }

    public void setComposeShadowAlpha(float f) {
        this.composeShadowAlpha = f;
        invalidate();
    }

    public ChatActivityBotWebViewButton getBotWebViewButton() {
        createBotWebViewButton();
        return this.botWebViewButton;
    }

    @Override
    public ChatActivity getParentFragment() {
        return this.parentFragment;
    }

    public void checkBotMenu() {
        EditTextCaption editTextCaption = this.messageEditText;
        boolean z = ((editTextCaption != null && !TextUtils.isEmpty(editTextCaption.getText())) || this.keyboardVisible || this.waitingForKeyboardOpen || isPopupShowing()) ? false : true;
        if (z) {
            createBotCommandsMenuButton();
        }
        BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
        if (botCommandsMenuView != null) {
            boolean z2 = botCommandsMenuView.expanded;
            botCommandsMenuView.setExpanded(z, true);
            if (z2 != this.botCommandsMenuButton.expanded) {
                beginDelayedTransition();
            }
        }
    }

    public void forceSmoothKeyboard(boolean z) {
        ChatActivity chatActivity;
        this.smoothKeyboard = z && !AndroidUtilities.isInMultiwindow && ((chatActivity = this.parentFragment) == null || !chatActivity.isInBubbleMode());
    }

    public void startLockTransition() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.startTranslation);
        objectAnimatorOfFloat.setStartDelay(100L);
        objectAnimatorOfFloat.setDuration(350L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        objectAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        objectAnimatorOfFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.slideText, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.topView;
        return (view == null || view.getVisibility() != 0) ? top : top + this.topView.getLayoutParams().height;
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.topView || view == this.textFieldContainer;
        if (z) {
            float measuredHeight = getMeasuredHeight() - this.animatorInputFieldHeight.getFactor();
            canvas.save();
            if (view == this.textFieldContainer) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.topView) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        drawBackground(canvas, true);
    }

    public void drawBackground(Canvas canvas, boolean z) {
        if (this.shouldDrawBackground) {
            int intrinsicHeight = (int) (this.animatedTop + (Theme.chat_composeShadowDrawable.getIntrinsicHeight() * (1.0f - this.composeShadowAlpha)));
            View view = this.topView;
            if (view != null && view.getVisibility() == 0) {
                intrinsicHeight = (int) (intrinsicHeight + ((1.0f - getTopViewEnterProgress()) * this.topView.getLayoutParams().height));
            }
            int intrinsicHeight2 = Theme.chat_composeShadowDrawable.getIntrinsicHeight() + intrinsicHeight;
            if (z) {
                Theme.chat_composeShadowDrawable.setAlpha((int) (this.composeShadowAlpha * 255.0f));
                Theme.chat_composeShadowDrawable.setBounds(0, intrinsicHeight, getMeasuredWidth(), intrinsicHeight2);
                Theme.chat_composeShadowDrawable.draw(canvas);
            }
            if (this.allowBlur) {
                this.backgroundPaint.setColor(getThemedColor(Theme.key_chat_messagePanelBackground));
                if (SharedConfig.chatBlurEnabled() && this.sizeNotifierLayout != null) {
                    this.blurBounds.set(0, intrinsicHeight2, getWidth(), getHeight());
                    this.sizeNotifierLayout.drawBlurRect(canvas, getTop(), this.blurBounds, this.backgroundPaint, false);
                    return;
                } else {
                    canvas.drawRect(0.0f, intrinsicHeight2, getWidth(), getHeight(), this.backgroundPaint);
                    return;
                }
            }
            canvas.drawRect(0.0f, intrinsicHeight2, getWidth(), getHeight(), getThemedPaint("paintChatComposeBackground"));
        }
    }

    public float getVisualHeight() {
        float topViewEnterProgress = this.animatedTop;
        View view = this.topView;
        if (view != null && view.getVisibility() == 0) {
            topViewEnterProgress += (1.0f - getTopViewEnterProgress()) * this.topView.getLayoutParams().height;
        }
        return getMeasuredHeight() - topViewEnterProgress;
    }

    public static void $r8$lambda$h1OvR33lGVGShsERVZ43UEskFrY(ChatActivityEnterView chatActivityEnterView) {
        MessageSendPreview messageSendPreview = chatActivityEnterView.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(chatActivityEnterView.dismissSendPreviewSent);
            chatActivityEnterView.messageSendPreview = null;
        }
    }

    public boolean onSendLongClick(View view) {
        ChatActivity chatActivity;
        int measuredHeight;
        float f;
        EditTextCaption editTextCaption;
        ChatActivity chatActivity2;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        InstantCameraView instantCameraView;
        boolean z;
        MessagePreviewParams messagePreviewParams2;
        ItemOptions itemOptionsMakeOptions;
        ChatActivity chatActivity3;
        boolean z2;
        ChatActivity chatActivity4;
        boolean z3;
        ChatActivity chatActivity5;
        TLRPC.User currentUser;
        int i;
        EditTextCaption editTextCaption2;
        boolean z4 = true;
        if (isInScheduleMode() || (((chatActivity = this.parentFragment) != null && chatActivity.getChatMode() == 5) || this.animatorEphemeralMessageVisibility.getValue())) {
            return false;
        }
        if (this.isStories || (((editTextCaption = this.messageEditText) == null || TextUtils.isEmpty(editTextCaption.getText())) && (chatActivity2 = this.parentFragment) != null && (messagePreviewParams = chatActivity2.messagePreviewParams) != null && (messages = messagePreviewParams.forwardMessages) != null && (arrayList = messages.messages) != null && !arrayList.isEmpty())) {
            ChatActivity chatActivity6 = this.parentFragment;
            boolean z5 = chatActivity6 != null && UserObject.isUserSelf(chatActivity6.getCurrentUser());
            if (this.sendPopupLayout == null) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, this.resourcesProvider);
                this.sendPopupLayout = actionBarPopupWindowLayout;
                actionBarPopupWindowLayout.setAnimationEnabled(false);
                this.sendPopupLayout.setOnTouchListener(new View.OnTouchListener() {
                    private Rect popupRect = new Rect();

                    @Override
                    public boolean onTouch(View view2, MotionEvent motionEvent) {
                        if (motionEvent.getActionMasked() != 0 || ChatActivityEnterView.this.sendPopupWindow == null || !ChatActivityEnterView.this.sendPopupWindow.isShowing()) {
                            return false;
                        }
                        view2.getHitRect(this.popupRect);
                        if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            return false;
                        }
                        ChatActivityEnterView.this.sendPopupWindow.dismiss();
                        return false;
                    }
                });
                this.sendPopupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                    @Override
                    public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                        ChatActivityEnterView.$r8$lambda$Nz1nvS0SkW35YLQoEsZ6cG6lmwI(this.f$0, keyEvent);
                    }
                });
                this.sendPopupLayout.setShownFromBottom(false);
                ChatActivity chatActivity7 = this.parentFragment;
                boolean z6 = chatActivity7 != null && chatActivity7.canScheduleMessage();
                boolean z7 = !z5 && (this.slowModeTimer <= 0 || isInScheduleMode());
                if (z6) {
                    boolean z8 = !z7;
                    f = 196.0f;
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, z8, this.resourcesProvider);
                    this.actionScheduleButton = actionBarMenuSubItem;
                    if (z5) {
                        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2);
                    } else {
                        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2);
                    }
                    this.actionScheduleButton.setMinimumWidth(AndroidUtilities.dp(196.0f));
                    this.actionScheduleButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            ChatActivityEnterView.$r8$lambda$ENMLDPCcAmZEtgIQZt4qGxx_rTk(this.f$0, view2);
                        }
                    });
                    this.sendPopupLayout.addView((View) this.actionScheduleButton, LayoutHelper.createLinear(-1, 44));
                    SharedConfig.removeScheduledHint();
                    if (!z5 && this.dialog_id > 0) {
                        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getContext(), true, z8, this.resourcesProvider);
                        this.sendWhenOnlineButton = actionBarMenuSubItem2;
                        actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SendWhenOnline), R.drawable.msg_online);
                        this.sendWhenOnlineButton.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        this.sendWhenOnlineButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                ChatActivityEnterView.m2080$r8$lambda$1xGp_SEbMxBrUMYCOimlHfntM4(this.f$0, view2);
                            }
                        });
                        this.sendPopupLayout.addView((View) this.sendWhenOnlineButton, LayoutHelper.createLinear(-1, 44));
                    }
                } else {
                    f = 196.0f;
                }
                if (z7) {
                    ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(getContext(), !z6, true, this.resourcesProvider);
                    actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off);
                    actionBarMenuSubItem3.setMinimumWidth(AndroidUtilities.dp(f));
                    actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            ChatActivityEnterView.$r8$lambda$gDxkkjO26tNEflby6on3RO8us9E(this.f$0, view2);
                        }
                    });
                    this.sendPopupLayout.addView((View) actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 44));
                }
                this.sendPopupLayout.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
                int i2 = -2;
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(this.sendPopupLayout, i2, i2) {
                    @Override
                    public void dismiss() {
                        super.dismiss();
                        ChatActivityEnterView.this.sendButton.invalidate();
                    }
                };
                this.sendPopupWindow = actionBarPopupWindow;
                actionBarPopupWindow.setAnimationEnabled(false);
                this.sendPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
                this.sendPopupWindow.setOutsideTouchable(true);
                this.sendPopupWindow.setClippingEnabled(true);
                this.sendPopupWindow.setInputMethodMode(2);
                this.sendPopupWindow.setSoftInputMode(0);
                this.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
                SharedConfig.removeScheduledOrNoSoundHint();
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    chatActivityEnterViewDelegate.onSendLongClick();
                }
            }
            ActionBarMenuSubItem actionBarMenuSubItem4 = this.actionScheduleButton;
            if (actionBarMenuSubItem4 != null) {
                actionBarMenuSubItem4.setVisibility(this.voiceOnce ? 8 : 0);
            }
            if (this.sendWhenOnlineButton != null) {
                ChatActivity chatActivity8 = this.parentFragment;
                TLRPC.User currentUser2 = chatActivity8 == null ? null : chatActivity8.getCurrentUser();
                if (currentUser2 == null || currentUser2.bot) {
                    this.sendWhenOnlineButton.setVisibility(8);
                } else {
                    TLRPC.UserStatus userStatus = currentUser2.status;
                    if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                        this.sendWhenOnlineButton.setVisibility(0);
                    } else {
                        this.sendWhenOnlineButton.setVisibility(8);
                    }
                }
            }
            this.sendPopupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.sendPopupWindow.setFocusable(true);
            view.getLocationInWindow(this.location);
            if (this.keyboardVisible) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.topView;
                if (measuredHeight2 > AndroidUtilities.dp((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = this.location[1] + view.getMeasuredHeight();
                } else {
                    measuredHeight = (this.location[1] - this.sendPopupLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
                }
            } else {
                measuredHeight = (this.location[1] - this.sendPopupLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            }
            this.sendPopupWindow.showAtLocation(view, 51, ((this.location[0] + view.getMeasuredWidth()) - this.sendPopupLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f), measuredHeight);
            this.sendPopupWindow.dimBehind();
            this.sendButton.invalidate();
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            return true;
        }
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.dismissSendPreview);
        MessageSendPreview messageSendPreview2 = new MessageSendPreview(getContext(), this.resourcesProvider) {
            @Override
            protected void onEffectChange(long j) {
                ChatActivityEnterView.this.setEffectId(j);
            }
        };
        this.messageSendPreview = messageSendPreview2;
        messageSendPreview2.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.messageSendPreview = null;
            }
        });
        final boolean z9 = (this.audioToSendMessageObject == null && ((editTextCaption2 = this.messageEditText) == null || TextUtils.isEmpty(editTextCaption2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        try {
            if (this.richDraftMessage != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialog_id);
                tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                tL_message.rich_message = this.richDraftMessage;
                MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
                MessageObject messageObject2 = this.replyingMessageObject;
                if (messageObject2 != null && !messageObject2.isTopicMainMessage) {
                    messageObject.replyMessageObject = messageObject2;
                }
                messageObject.isOutOwnerCached = Boolean.TRUE;
                messageObject.generateLayout(null);
                messageObject.notime = true;
                messageObject.sendPreview = true;
                arrayList2.add(messageObject);
            } else if (this.audioToSend != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                tL_message2.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialog_id);
                tL_message2.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.voice = true;
                tL_messageMediaDocument.document = this.audioToSend;
                tL_message2.send_state = 1;
                tL_message2.attachPath = this.audioToSendPath;
                MessageObject messageObject3 = new MessageObject(this.currentAccount, tL_message2, false, true);
                MessageObject messageObject4 = this.replyingMessageObject;
                if (messageObject4 != null && !messageObject4.isTopicMainMessage) {
                    messageObject3.replyMessageObject = messageObject4;
                }
                messageObject3.isOutOwnerCached = Boolean.TRUE;
                messageObject3.generateLayout(null);
                messageObject3.notime = true;
                messageObject3.sendPreview = true;
                arrayList2.add(messageObject3);
            } else if (z9) {
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.id = 0;
                tL_message3.out = true;
                tL_message3.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialog_id);
                tL_message3.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                EditTextCaption editTextCaption3 = this.messageEditText;
                CharSequence[] charSequenceArr = {new SpannableStringBuilder(editTextCaption3 == null ? "" : editTextCaption3.getTextToUse())};
                MessageObject.addLinks(true, charSequenceArr[0]);
                tL_message3.entities.addAll(MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true));
                tL_message3.message = charSequenceArr[0].toString();
                MessageObject messageObject5 = this.replyingMessageObject;
                if (messageObject5 != null && !messageObject5.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    MessageObject messageObject6 = this.replyingTopMessage;
                    if (messageObject6 != null) {
                        tL_messageReplyHeader.flags |= 2;
                        tL_messageReplyHeader.reply_to_top_id = messageObject6.getId();
                    }
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = this.replyingMessageObject.getId();
                    tL_message3.reply_to = tL_messageReplyHeader;
                }
                if (this.messageWebPage != null) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    tL_messageMediaWebPage.webpage = this.messageWebPage;
                    ChatActivity chatActivity9 = this.parentFragment;
                    if (chatActivity9 != null && (messagePreviewParams2 = chatActivity9.messagePreviewParams) != null && messagePreviewParams2.hasMedia) {
                        boolean z10 = messagePreviewParams2.webpageSmall;
                        tL_messageMediaWebPage.force_small_media = z10;
                        tL_messageMediaWebPage.force_large_media = !z10;
                        tL_message3.invert_media = messagePreviewParams2.webpageTop;
                    }
                    tL_message3.media = tL_messageMediaWebPage;
                }
                MessageObject messageObject7 = new MessageObject(this.currentAccount, tL_message3, false, false);
                MessageObject messageObject8 = this.replyingMessageObject;
                if (messageObject8 != null && !messageObject8.isTopicMainMessage) {
                    messageObject7.replyMessageObject = messageObject8;
                }
                messageObject7.sendPreview = true;
                messageObject7.isOutOwnerCached = Boolean.TRUE;
                messageObject7.type = 0;
                messageObject7.generateLayout(null);
                messageObject7.notime = true;
                arrayList2.add(messageObject7);
            } else {
                ChatActivity chatActivity10 = this.parentFragment;
                if (chatActivity10 != null && (instantCameraView = chatActivity10.instantCameraView) != null && instantCameraView.getTextureView() != null) {
                    this.messageSendPreview.setCameraTexture(this.parentFragment.instantCameraView.getTextureView());
                    z = true;
                }
                this.messageSendPreview.setMessageObjects(arrayList2);
                if (z9 && this.audioToSend == null) {
                    this.messageSendPreview.setEditText(this.messageEditText, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            this.f$0.drawMessageEditText((Canvas) obj, (Utilities.Callback0Return) obj2);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.drawBackground((Canvas) obj, false);
                        }
                    });
                }
                this.messageSendPreview.setSendButton(this.sendButton, true, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        ChatActivityEnterView.$r8$lambda$g5NLgRRuLSbE4KzRM5I75RwrDSk(this.f$0, z9, view3);
                    }
                });
                if ((!z9 || z) && this.dialog_id >= 0) {
                    this.messageSendPreview.allowEffectSelector(this.parentFragment);
                    this.messageSendPreview.setEffectId(this.effectId);
                }
                itemOptionsMakeOptions = ItemOptions.makeOptions(this, this.resourcesProvider, this.sendButton);
                chatActivity3 = this.parentFragment;
                if (chatActivity3 == null && UserObject.isUserSelf(chatActivity3.getCurrentUser())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                chatActivity4 = this.parentFragment;
                if (chatActivity4 == null && chatActivity4.canScheduleMessage()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 || (this.slowModeTimer > 0 && !isInScheduleMode())) {
                    z4 = false;
                }
                if (z3) {
                    int i3 = R.drawable.msg_calendar2;
                    if (z2) {
                        i = R.string.SetReminder;
                    } else {
                        i = R.string.ScheduleMessage;
                    }
                    itemOptionsMakeOptions.add(i3, LocaleController.getString(i), new Runnable() {
                        @Override
                        public final void run() {
                            ChatActivityEnterView chatActivityEnterView = this.f$0;
                            AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, chatActivityEnterView.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                                @Override
                                public void didSelectDate(boolean z11, int i4, int i5) {
                                    ChatActivityEnterView.this.sendMessageInternal(z11, i4, i5, 0L, true);
                                    MessageSendPreview messageSendPreview3 = ChatActivityEnterView.this.messageSendPreview;
                                    if (messageSendPreview3 != null) {
                                        messageSendPreview3.dismissInstant();
                                        ChatActivityEnterView.this.messageSendPreview = null;
                                    }
                                }
                            }, chatActivityEnterView.resourcesProvider);
                        }
                    });
                    if (!z2 && this.dialog_id > 0) {
                        itemOptionsMakeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new Runnable() {
                            @Override
                            public final void run() {
                                ChatActivityEnterView.m2097$r8$lambda$UWc0rYGbFDcYZMBUablII0xik(this.f$0);
                            }
                        });
                        this.sendWhenOnlineButton = itemOptionsMakeOptions.getLast();
                    }
                }
                chatActivity5 = this.parentFragment;
                if (chatActivity5 != null && this.delegate != null && ChatObject.isMonoForum(chatActivity5.getCurrentChat())) {
                    itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new Runnable() {
                        @Override
                        public final void run() {
                            ChatActivityEnterView.$r8$lambda$lhLmxk4Bt6bggDuQFL1UVPqjNcY(this.f$0);
                        }
                    });
                }
                if (z4) {
                    itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() {
                        @Override
                        public final void run() {
                            ChatActivityEnterView.m2103$r8$lambda$hBQSFYYRCpQvDoDd1cxWKAlAA(this.f$0, z9);
                        }
                    });
                }
                itemOptionsMakeOptions.setupSelectors();
                if (this.sendWhenOnlineButton != null) {
                    ChatActivity chatActivity11 = this.parentFragment;
                    currentUser = chatActivity11 != null ? chatActivity11.getCurrentUser() : null;
                    if (currentUser != null || currentUser.bot) {
                        this.sendWhenOnlineButton.setVisibility(8);
                    } else {
                        TLRPC.UserStatus userStatus2 = currentUser.status;
                        if (!(userStatus2 instanceof TLRPC.TL_userStatusEmpty) && !(userStatus2 instanceof TLRPC.TL_userStatusOnline) && !(userStatus2 instanceof TLRPC.TL_userStatusRecently) && !(userStatus2 instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                            this.sendWhenOnlineButton.setVisibility(0);
                        } else {
                            this.sendWhenOnlineButton.setVisibility(8);
                        }
                    }
                }
                this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
                this.messageSendPreview.show();
                view.performHapticFeedback(3, 2);
                return false;
            }
            view.performHapticFeedback(3, 2);
        } catch (Exception unused2) {
        }
        z = false;
        this.messageSendPreview.setMessageObjects(arrayList2);
        if (z9) {
            this.messageSendPreview.setEditText(this.messageEditText, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.drawMessageEditText((Canvas) obj, (Utilities.Callback0Return) obj2);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.drawBackground((Canvas) obj, false);
                }
            });
        }
        this.messageSendPreview.setSendButton(this.sendButton, true, new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                ChatActivityEnterView.$r8$lambda$g5NLgRRuLSbE4KzRM5I75RwrDSk(this.f$0, z9, view3);
            }
        });
        if (!z9) {
            this.messageSendPreview.allowEffectSelector(this.parentFragment);
            this.messageSendPreview.setEffectId(this.effectId);
        } else {
            this.messageSendPreview.allowEffectSelector(this.parentFragment);
            this.messageSendPreview.setEffectId(this.effectId);
        }
        itemOptionsMakeOptions = ItemOptions.makeOptions(this, this.resourcesProvider, this.sendButton);
        chatActivity3 = this.parentFragment;
        if (chatActivity3 == null) {
            z2 = false;
        } else {
            z2 = false;
        }
        chatActivity4 = this.parentFragment;
        if (chatActivity4 == null) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (z2) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z3) {
            int i4 = R.drawable.msg_calendar2;
            if (z2) {
                i = R.string.SetReminder;
            } else {
                i = R.string.ScheduleMessage;
            }
            itemOptionsMakeOptions.add(i4, LocaleController.getString(i), new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView chatActivityEnterView = this.f$0;
                    AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, chatActivityEnterView.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public void didSelectDate(boolean z11, int i5, int i6) {
                            ChatActivityEnterView.this.sendMessageInternal(z11, i5, i6, 0L, true);
                            MessageSendPreview messageSendPreview3 = ChatActivityEnterView.this.messageSendPreview;
                            if (messageSendPreview3 != null) {
                                messageSendPreview3.dismissInstant();
                                ChatActivityEnterView.this.messageSendPreview = null;
                            }
                        }
                    }, chatActivityEnterView.resourcesProvider);
                }
            });
            if (!z2) {
                itemOptionsMakeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new Runnable() {
                    @Override
                    public final void run() {
                        ChatActivityEnterView.m2097$r8$lambda$UWc0rYGbFDcYZMBUablII0xik(this.f$0);
                    }
                });
                this.sendWhenOnlineButton = itemOptionsMakeOptions.getLast();
            }
        }
        chatActivity5 = this.parentFragment;
        if (chatActivity5 != null) {
            itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.$r8$lambda$lhLmxk4Bt6bggDuQFL1UVPqjNcY(this.f$0);
                }
            });
        }
        if (z4) {
            itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.m2103$r8$lambda$hBQSFYYRCpQvDoDd1cxWKAlAA(this.f$0, z9);
                }
            });
        }
        itemOptionsMakeOptions.setupSelectors();
        if (this.sendWhenOnlineButton != null) {
            ChatActivity chatActivity12 = this.parentFragment;
            if (chatActivity12 != null) {
            }
            if (currentUser != null) {
                this.sendWhenOnlineButton.setVisibility(8);
            } else {
                this.sendWhenOnlineButton.setVisibility(8);
            }
        }
        this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
        this.messageSendPreview.show();
        return false;
    }

    public static void $r8$lambda$Nz1nvS0SkW35YLQoEsZ6cG6lmwI(ChatActivityEnterView chatActivityEnterView, KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        chatActivityEnterView.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = chatActivityEnterView.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            chatActivityEnterView.sendPopupWindow.dismiss();
        }
    }

    public static void $r8$lambda$ENMLDPCcAmZEtgIQZt4qGxx_rTk(ChatActivityEnterView chatActivityEnterView, View view) {
        ActionBarPopupWindow actionBarPopupWindow = chatActivityEnterView.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            chatActivityEnterView.sendPopupWindow.dismiss();
        }
        AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, chatActivityEnterView.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public void didSelectDate(boolean z, int i, int i2) {
                ChatActivityEnterView.this.sendMessageInternal(z, i, 0, 0L, true);
            }
        }, chatActivityEnterView.resourcesProvider);
    }

    public static void m2080$r8$lambda$1xGp_SEbMxBrUMYCOimlHfntM4(ChatActivityEnterView chatActivityEnterView, View view) {
        ActionBarPopupWindow actionBarPopupWindow = chatActivityEnterView.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            chatActivityEnterView.sendPopupWindow.dismiss();
        }
        chatActivityEnterView.sendMessageInternal(true, 2147483646, 0, 0L, true);
    }

    public static void $r8$lambda$gDxkkjO26tNEflby6on3RO8us9E(ChatActivityEnterView chatActivityEnterView, View view) {
        ActionBarPopupWindow actionBarPopupWindow = chatActivityEnterView.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            chatActivityEnterView.sendPopupWindow.dismiss();
        }
        chatActivityEnterView.sendMessageInternal(false, 0, 0, 0L, true);
    }

    public static void $r8$lambda$g5NLgRRuLSbE4KzRM5I75RwrDSk(ChatActivityEnterView chatActivityEnterView, boolean z, View view) {
        MessageSendPreview messageSendPreview;
        chatActivityEnterView.getClass();
        chatActivityEnterView.sentFromPreview = System.currentTimeMillis();
        boolean zSendMessage = chatActivityEnterView.sendMessage();
        if (!z && (messageSendPreview = chatActivityEnterView.messageSendPreview) != null) {
            messageSendPreview.dismiss(!zSendMessage);
            chatActivityEnterView.messageSendPreview = null;
        } else {
            chatActivityEnterView.dismissSendPreviewSent = !zSendMessage;
            AndroidUtilities.cancelRunOnUIThread(chatActivityEnterView.dismissSendPreview);
            AndroidUtilities.runOnUIThread(chatActivityEnterView.dismissSendPreview, 500L);
        }
    }

    public static void m2097$r8$lambda$UWc0rYGbFDcYZMBUablII0xik(ChatActivityEnterView chatActivityEnterView) {
        chatActivityEnterView.sendMessageInternal(true, 2147483646, 0, 0L, true);
        MessageSendPreview messageSendPreview = chatActivityEnterView.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
            chatActivityEnterView.messageSendPreview = null;
        }
    }

    public static void $r8$lambda$lhLmxk4Bt6bggDuQFL1UVPqjNcY(final ChatActivityEnterView chatActivityEnterView) {
        MessageSendPreview messageSendPreview = chatActivityEnterView.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismiss(false);
            chatActivityEnterView.messageSendPreview = null;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$rjRfvHx2oGbXuINAuMRfFucr5tQ(this.f$0);
            }
        }, 600L);
    }

    public static void $r8$lambda$rjRfvHx2oGbXuINAuMRfFucr5tQ(ChatActivityEnterView chatActivityEnterView) {
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.didPressSuggestionButton();
        }
    }

    public static void m2103$r8$lambda$hBQSFYYRCpQvDoDd1cxWKAlAA(ChatActivityEnterView chatActivityEnterView, boolean z) {
        MessageSendPreview messageSendPreview;
        chatActivityEnterView.getClass();
        chatActivityEnterView.sentFromPreview = System.currentTimeMillis();
        boolean zSendMessageInternal = chatActivityEnterView.sendMessageInternal(false, 0, 0, 0L, true);
        if (!z && (messageSendPreview = chatActivityEnterView.messageSendPreview) != null) {
            messageSendPreview.dismiss(!zSendMessageInternal);
            chatActivityEnterView.messageSendPreview = null;
        } else {
            chatActivityEnterView.dismissSendPreviewSent = !zSendMessageInternal;
            AndroidUtilities.cancelRunOnUIThread(chatActivityEnterView.dismissSendPreview);
            AndroidUtilities.runOnUIThread(chatActivityEnterView.dismissSendPreview, 500L);
        }
    }

    private void createBotCommandsMenuContainer() {
        if (this.botCommandsMenuContainer != null) {
            return;
        }
        BotCommandsMenuContainer botCommandsMenuContainer = new BotCommandsMenuContainer(getContext()) {
            boolean ignoreLayout = false;

            @Override
            protected void onDismiss() {
                super.onDismiss();
                if (ChatActivityEnterView.this.botCommandsMenuButton != null) {
                    ChatActivityEnterView.this.botCommandsMenuButton.setOpened(false);
                }
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                if (this.ignoreLayout) {
                    return;
                }
                this.ignoreLayout = true;
                ChatActivityEnterView.this.updateBotCommandsMenuContainerTopPadding();
            }
        };
        this.botCommandsMenuContainer = botCommandsMenuContainer;
        botCommandsMenuContainer.listView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerListView recyclerListView = this.botCommandsMenuContainer.listView;
        BotCommandsMenuView.BotCommandsAdapter botCommandsAdapter = new BotCommandsMenuView.BotCommandsAdapter();
        this.botCommandsAdapter = botCommandsAdapter;
        recyclerListView.setAdapter(botCommandsAdapter);
        this.botCommandsMenuContainer.listView.setOnItemClickListener(new AnonymousClass48());
        this.botCommandsMenuContainer.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public boolean onItemClick(View view, int i) {
                if (!(view instanceof BotCommandsMenuView.BotCommandView)) {
                    return false;
                }
                String command = ((BotCommandsMenuView.BotCommandView) view).getCommand();
                ChatActivityEnterView.this.setFieldText(command + " ");
                ChatActivityEnterView.this.botCommandsMenuContainer.dismiss();
                return true;
            }
        });
        this.botCommandsMenuContainer.setClipToPadding(false);
        this.sizeNotifierLayout.addView(this.botCommandsMenuContainer, LayoutHelper.createFrame(-1, -1, 80));
        this.botCommandsMenuContainer.setVisibility(8);
        LongSparseArray longSparseArray = this.lastBotInfo;
        if (longSparseArray != null) {
            this.botCommandsAdapter.setBotInfo(longSparseArray);
        }
        updateBotCommandsMenuContainerTopPadding();
    }

    class AnonymousClass48 implements RecyclerListView.OnItemClickListener {
        AnonymousClass48() {
        }

        @Override
        public void onItemClick(View view, int i) {
            if (view instanceof BotCommandsMenuView.BotCommandView) {
                final String command = ((BotCommandsMenuView.BotCommandView) view).getCommand();
                if (TextUtils.isEmpty(command)) {
                    return;
                }
                if (!ChatActivityEnterView.this.isInScheduleMode()) {
                    if (ChatActivityEnterView.this.parentFragment == null || !ChatActivityEnterView.this.parentFragment.checkSlowMode(view)) {
                        AlertsCreator.ensurePaidMessageConfirmation(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id, 1, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                ChatActivityEnterView.AnonymousClass48.m2118$r8$lambda$wzpYjVxWpTDgE364YXSHjQyRrs(this.f$0, command, (Long) obj);
                            }
                        });
                        return;
                    }
                    return;
                }
                AlertsCreator.createScheduleDatePickerDialog(ChatActivityEnterView.this.parentActivity, ChatActivityEnterView.this.dialog_id, new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i2, int i3) {
                        ChatActivityEnterView.AnonymousClass48.m2117$r8$lambda$uWjjf6zwxLEN6_s7Bgsq6fhwkk(this.f$0, command, z, i2, i3);
                    }
                }, ChatActivityEnterView.this.resourcesProvider);
            }
        }

        public static void m2117$r8$lambda$uWjjf6zwxLEN6_s7Bgsq6fhwkk(AnonymousClass48 anonymousClass48, String str, boolean z, int i, int i2) {
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(str, ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.replyingMessageObject, ChatActivityEnterView.this.getThreadMessage(), null, false, null, null, null, z, i, i2, null, false);
            sendMessageParamsOf.sendMessageChatArguments = ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null;
            sendMessageParamsOf.effect_id = ChatActivityEnterView.this.effectId;
            SendMessagesHelper.getInstance(ChatActivityEnterView.this.currentAccount).sendMessage(sendMessageParamsOf);
            ChatActivityEnterView.this.setFieldText("");
            ChatActivityEnterView.this.botCommandsMenuContainer.dismiss();
            ChatActivityEnterView.this.sendButton.setEffect(ChatActivityEnterView.this.effectId = 0L);
        }

        public static void m2118$r8$lambda$wzpYjVxWpTDgE364YXSHjQyRrs(AnonymousClass48 anonymousClass48, String str, Long l) {
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(str, ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.replyingMessageObject, ChatActivityEnterView.this.getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            sendMessageParamsOf.sendMessageChatArguments = ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null;
            sendMessageParamsOf.effect_id = ChatActivityEnterView.this.effectId;
            sendMessageParamsOf.payStars = l.longValue();
            sendMessageParamsOf.monoForumPeer = ChatActivityEnterView.this.getSendMonoForumPeerId();
            sendMessageParamsOf.suggestionParams = ChatActivityEnterView.this.getSendMessageSuggestionParams();
            SendMessagesHelper.getInstance(ChatActivityEnterView.this.currentAccount).sendMessage(sendMessageParamsOf);
            ChatActivityEnterView.this.setFieldText("");
            ChatActivityEnterView.this.botCommandsMenuContainer.dismiss();
            ChatActivityEnterView.this.sendButton.setEffect(ChatActivityEnterView.this.effectId = 0L);
        }
    }

    public void updateBotCommandsMenuContainerTopPadding() {
        int iMax;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        View viewFindViewByPosition;
        BotCommandsMenuContainer botCommandsMenuContainer = this.botCommandsMenuContainer;
        if (botCommandsMenuContainer == null) {
            return;
        }
        int childCount = botCommandsMenuContainer.listView.getChildCount();
        int measuredHeight = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.botCommandsMenuContainer.listView.getChildAt(i);
            if (i < 4) {
                measuredHeight += childAt.getMeasuredHeight();
            }
        }
        if (measuredHeight > 0) {
            iMax = Math.max(0, ((this.sizeNotifierLayout.getMeasuredHeight() - measuredHeight) - AndroidUtilities.dp(8.0f)) - AndroidUtilities.dp(childCount > 4 ? 12.0f : 0.0f));
        } else if (this.botCommandsAdapter.getItemCount() > 4) {
            iMax = Math.max(0, this.sizeNotifierLayout.getMeasuredHeight() - AndroidUtilities.dp(162.8f));
        } else {
            iMax = Math.max(0, this.sizeNotifierLayout.getMeasuredHeight() - AndroidUtilities.dp((Math.max(1, Math.min(4, this.botCommandsAdapter.getItemCount())) * 36) + 8));
        }
        if (this.botCommandsMenuContainer.listView.getPaddingTop() != iMax) {
            this.botCommandsMenuContainer.listView.setTopGlowOffset(iMax);
            if (this.botCommandLastPosition == -1 && this.botCommandsMenuContainer.getVisibility() == 0 && this.botCommandsMenuContainer.listView.getLayoutManager() != null && (iFindFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) this.botCommandsMenuContainer.listView.getLayoutManager()).findFirstVisibleItemPosition()) >= 0 && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                this.botCommandLastPosition = iFindFirstVisibleItemPosition;
                this.botCommandLastTop = viewFindViewByPosition.getTop() - this.botCommandsMenuContainer.listView.getPaddingTop();
            }
            this.botCommandsMenuContainer.listView.setPadding(0, iMax, 0, AndroidUtilities.dp(8.0f));
        }
    }

    class ChatActivityEditTextCaption extends EditTextCaption {
        CanvasButton canvasButton;

        public ChatActivityEditTextCaption(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        protected void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (ChatActivityEnterView.this.delegate != null) {
                ChatActivityEnterView.this.delegate.onEditTextScroll();
            }
        }

        @Override
        protected void onContextMenuOpen() {
            if (ChatActivityEnterView.this.delegate != null) {
                ChatActivityEnterView.this.delegate.onContextMenuOpen();
            }
        }

        @Override
        protected void onContextMenuClose() {
            if (ChatActivityEnterView.this.delegate != null) {
                ChatActivityEnterView.this.delegate.onContextMenuClose();
            }
        }

        public void send(InputContentInfoCompat inputContentInfoCompat, boolean z, int i, int i2) {
            MessageSendPreview messageSendPreview = ChatActivityEnterView.this.messageSendPreview;
            if (messageSendPreview != null) {
                messageSendPreview.dismiss(true);
                ChatActivityEnterView.this.messageSendPreview = null;
            }
            if (ChatActivityEnterView.this.replyingQuote != null && ChatActivityEnterView.this.parentFragment != null && ChatActivityEnterView.this.replyingQuote.outdated) {
                ChatActivityEnterView.this.parentFragment.showQuoteMessageUpdate();
                return;
            }
            if (inputContentInfoCompat.getDescription().hasMimeType("image/gif")) {
                SendMessagesHelper.prepareSendingDocument(ChatActivityEnterView.this.accountInstance, null, null, inputContentInfoCompat.getContentUri(), null, "image/gif", ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.replyingMessageObject, ChatActivityEnterView.this.getThreadMessage(), null, ChatActivityEnterView.this.replyingQuote, null, z, 0, inputContentInfoCompat, ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null, false);
            } else {
                SendMessagesHelper.prepareSendingPhoto(ChatActivityEnterView.this.accountInstance, null, inputContentInfoCompat.getContentUri(), ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.replyingMessageObject, ChatActivityEnterView.this.getThreadMessage(), ChatActivityEnterView.this.replyingQuote, null, null, null, inputContentInfoCompat, 0, null, z, 0, ChatActivityEnterView.this.parentFragment == null ? 0 : ChatActivityEnterView.this.parentFragment.getChatMode(), ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null);
            }
            if (ChatActivityEnterView.this.delegate != null) {
                ChatActivityEnterView.this.delegate.onMessageSend(null, true, i, i2, 0L);
            }
        }

        @Override
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (inputConnectionOnCreateInputConnection == null) {
                return null;
            }
            try {
                if (ChatActivityEnterView.this.isEditingBusinessLink() || ChatActivityEnterView.this.isLiveComment) {
                    EditorInfoCompat.setContentMimeTypes(editorInfo, null);
                } else {
                    EditorInfoCompat.setContentMimeTypes(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                }
                return InputConnectionCompat.createWrapper(inputConnectionOnCreateInputConnection, editorInfo, new InputConnectionCompat.OnCommitContentListener() {
                    @Override
                    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
                        return ChatActivityEnterView.ChatActivityEditTextCaption.$r8$lambda$1W350ny26NjGgYgYrFwb5RDcm7g(this.f$0, inputContentInfoCompat, i, bundle);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
                return inputConnectionOnCreateInputConnection;
            }
        }

        public static boolean $r8$lambda$1W350ny26NjGgYgYrFwb5RDcm7g(final ChatActivityEditTextCaption chatActivityEditTextCaption, final InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
            if (ChatActivityEnterView.this.isLiveComment) {
                return true;
            }
            if (BuildCompat.isAtLeastNMR1() && (i & 1) != 0) {
                try {
                    inputContentInfoCompat.requestPermission();
                } catch (Exception unused) {
                    return false;
                }
            }
            if (inputContentInfoCompat.getDescription().hasMimeType("image/gif") || SendMessagesHelper.shouldSendWebPAsSticker(null, inputContentInfoCompat.getContentUri())) {
                if (ChatActivityEnterView.this.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(ChatActivityEnterView.this.parentActivity, ChatActivityEnterView.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z, int i2, int i3) {
                            this.f$0.send(inputContentInfoCompat, z, i2, i3);
                        }
                    }, ChatActivityEnterView.this.resourcesProvider);
                    return true;
                }
                chatActivityEditTextCaption.send(inputContentInfoCompat, true, 0, 0);
                return true;
            }
            chatActivityEditTextCaption.editPhoto(inputContentInfoCompat.getContentUri(), inputContentInfoCompat.getDescription().getMimeType(0));
            return true;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ChatActivityEnterView.this.stickersDragging && ChatActivityEnterView.this.stickersExpansionAnim == null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (!chatActivityEnterView.sendPlainEnabled && !chatActivityEnterView.isEditingMessage()) {
                    if (this.canvasButton == null) {
                        CanvasButton canvasButton = new CanvasButton(this);
                        this.canvasButton = canvasButton;
                        canvasButton.setDelegate(new Runnable() {
                            @Override
                            public final void run() {
                                ChatActivityEnterView.this.showRestrictedHint();
                            }
                        });
                    }
                    this.canvasButton.setRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    return this.canvasButton.checkTouchEvent(motionEvent);
                }
                if (ChatActivityEnterView.this.isPopupShowing() && motionEvent.getAction() == 0) {
                    if (ChatActivityEnterView.this.searchingType != 0) {
                        ChatActivityEnterView.this.setSearchingTypeInternal(0, false);
                        ChatActivityEnterView.this.emojiView.closeSearch(false);
                        requestFocus();
                    }
                    ChatActivityEnterView.this.showPopup(AndroidUtilities.usingHardwareInput ? 0 : 2, 0);
                    if (ChatActivityEnterView.this.stickersExpanded) {
                        ChatActivityEnterView.this.setStickersExpanded(false, true, false);
                        ChatActivityEnterView.this.waitingForKeyboardOpenAfterAnimation = true;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ChatActivityEnterView.ChatActivityEditTextCaption.m2121$r8$lambda$VpVGQN9GfxEgYMwtkVy8GlYGyk(this.f$0);
                            }
                        }, 200L);
                    } else {
                        ChatActivityEnterView.this.openKeyboardInternal();
                    }
                    return true;
                }
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return false;
        }

        public static void m2121$r8$lambda$VpVGQN9GfxEgYMwtkVy8GlYGyk(ChatActivityEditTextCaption chatActivityEditTextCaption) {
            ChatActivityEnterView.this.waitingForKeyboardOpenAfterAnimation = false;
            ChatActivityEnterView.this.openKeyboardInternal();
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (ChatActivityEnterView.this.preventInput) {
                return false;
            }
            if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed() && handleFormattingShortcut(keyEvent)) {
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        private boolean handleFormattingShortcut(KeyEvent keyEvent) {
            int i;
            boolean z;
            if (!keyEvent.isShiftPressed()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 30) {
                    i = 1;
                } else if (keyCode == 33) {
                    i = 4;
                } else if (keyCode == 37) {
                    i = 2;
                } else if (keyCode == 39) {
                    i = 0;
                    z = true;
                } else if (keyCode != 49) {
                    i = 0;
                } else {
                    i = 16;
                }
                z = false;
            } else {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 41) {
                    i = 4;
                } else if (keyCode2 == 44) {
                    i = 256;
                } else if (keyCode2 == 47 || keyCode2 == 52) {
                    i = 8;
                } else {
                    i = 0;
                }
                z = false;
            }
            if ((!z && i == 0) || getSelectionStart() == getSelectionEnd()) {
                return false;
            }
            if (z) {
                makeSelectedUrl();
            } else {
                toggleStyleForSelection(i);
            }
            return true;
        }

        @Override
        protected void onSelectionChanged(int i, int i2) {
            super.onSelectionChanged(i, i2);
            if (ChatActivityEnterView.this.delegate != null) {
                ChatActivityEnterView.this.delegate.onTextSelectionChanged(i, i2);
            }
        }

        @Override
        protected void extendActionMode(ActionMode actionMode, Menu menu) {
            if (ChatActivityEnterView.this.parentFragment != null) {
                ChatActivityEnterView.this.parentFragment.extendActionMode(menu);
            } else {
                ChatActivityEnterView.this.extendActionMode(menu);
            }
        }

        @Override
        public boolean requestRectangleOnScreen(Rect rect) {
            rect.bottom += AndroidUtilities.dp(1000.0f);
            return super.requestRectangleOnScreen(rect);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            ChatActivityEnterView.this.isInitLineCount = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
            super.onMeasure(i, i2);
            if (ChatActivityEnterView.this.isInitLineCount) {
                ChatActivityEnterView.this.lineCount = getLineCount();
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.showAiButton(chatActivityEnterView.lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim()));
                ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                chatActivityEnterView2.showRichButton(chatActivityEnterView2.lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            }
            ChatActivityEnterView.this.isInitLineCount = false;
        }

        @Override
        public boolean onTextContextMenuItem(int i) {
            if (i == 16908322) {
                ChatActivityEnterView.this.isPaste = true;
                ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && !ChatActivityEnterView.this.isEditingBusinessLink()) {
                    editPhoto(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
                }
            }
            return super.onTextContextMenuItem(i);
        }

        private void editPhoto(final Uri uri, String str) {
            final File fileGeneratePicturePath = AndroidUtilities.generatePicturePath(ChatActivityEnterView.this.parentFragment != null && ChatActivityEnterView.this.parentFragment.isSecretChat(), MimeTypeMap.getSingleton().getExtensionFromMimeType(str));
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.ChatActivityEditTextCaption.$r8$lambda$6YEiCHCEyhZo6JsMd2qsUhbhFOs(this.f$0, uri, fileGeneratePicturePath);
                }
            });
        }

        public static void $r8$lambda$6YEiCHCEyhZo6JsMd2qsUhbhFOs(final ChatActivityEditTextCaption chatActivityEditTextCaption, Uri uri, final File file) {
            chatActivityEditTextCaption.getClass();
            try {
                InputStream inputStreamOpenInputStream = chatActivityEditTextCaption.getContext().getContentResolver().openInputStream(uri);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i > 0) {
                        fileOutputStream.write(bArr, 0, i);
                        fileOutputStream.flush();
                    } else {
                        inputStreamOpenInputStream.close();
                        fileOutputStream.close();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, -1, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                        final ArrayList arrayList = new ArrayList();
                        arrayList.add(photoEntry);
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.openPhotoViewerForEdit(arrayList, file);
                            }
                        });
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void openPhotoViewerForEdit(final ArrayList arrayList, final File file) {
            if (ChatActivityEnterView.this.parentFragment == null || ChatActivityEnterView.this.parentFragment.getParentActivity() == null) {
                return;
            }
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (!ChatActivityEnterView.this.keyboardVisible) {
                PhotoViewer.getInstance().setParentActivity(ChatActivityEnterView.this.parentFragment, ChatActivityEnterView.this.resourcesProvider);
                PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 2, false, new PhotoViewer.EmptyPhotoViewerProvider() {
                    boolean sending;

                    @Override
                    public boolean canCaptureMorePhotos() {
                        return false;
                    }

                    @Override
                    public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
                        String str;
                        if (ChatActivityEnterView.this.replyingQuote != null && ChatActivityEnterView.this.parentFragment != null && ChatActivityEnterView.this.replyingQuote.outdated) {
                            ChatActivityEnterView.this.parentFragment.showQuoteMessageUpdate();
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        MediaController.PhotoEntry photoEntry2 = photoEntry;
                        if (!photoEntry2.isVideo && (str = photoEntry2.imagePath) != null) {
                            sendingMediaInfo.path = str;
                        } else {
                            String str2 = photoEntry2.path;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            }
                        }
                        sendingMediaInfo.thumbPath = photoEntry2.thumbPath;
                        sendingMediaInfo.isLivePhoto = photoEntry2.isLivePhoto();
                        MediaController.PhotoEntry photoEntry3 = photoEntry;
                        sendingMediaInfo.isVideo = photoEntry3.isVideo;
                        sendingMediaInfo.discardLivePhoto = photoEntry3.isUnalivePhoto();
                        MediaController.PhotoEntry photoEntry4 = photoEntry;
                        sendingMediaInfo.livePhotoVideoOffset = photoEntry4.livePhotoVideoOffset;
                        sendingMediaInfo.livePhotoTimestampUs = photoEntry4.livePhotoTimestampUs;
                        CharSequence charSequence = photoEntry4.caption;
                        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                        MediaController.PhotoEntry photoEntry5 = photoEntry;
                        sendingMediaInfo.entities = photoEntry5.entities;
                        sendingMediaInfo.masks = photoEntry5.stickers;
                        sendingMediaInfo.ttl = photoEntry5.ttl;
                        sendingMediaInfo.videoEditedInfo = videoEditedInfo;
                        sendingMediaInfo.canDeleteAfter = true;
                        arrayList2.add(sendingMediaInfo);
                        photoEntry.reset();
                        this.sending = true;
                        SendMessagesHelper.prepareSendingMedia(ChatActivityEnterView.this.accountInstance, arrayList2, ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.replyingMessageObject, ChatActivityEnterView.this.getThreadMessage(), null, ChatActivityEnterView.this.replyingQuote, false, false, ChatActivityEnterView.this.editingMessageObject, z, i2, i3, ChatActivityEnterView.this.parentFragment == null ? 0 : ChatActivityEnterView.this.parentFragment.getChatMode(), SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption), null, ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null, 0L, false, 0L, ChatActivityEnterView.this.getSendMonoForumPeerId(), ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.messageSuggestionParams : null);
                        if (ChatActivityEnterView.this.delegate != null) {
                            ChatActivityEnterView.this.delegate.onMessageSend(null, true, i2, i3, 0L);
                        }
                    }

                    @Override
                    public void willHidePhotoViewer() {
                        if (this.sending) {
                            return;
                        }
                        try {
                            file.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }, ChatActivityEnterView.this.parentFragment);
            } else {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public void run() {
                        ChatActivityEditTextCaption.this.openPhotoViewerForEdit(arrayList, file);
                    }
                }, 100L);
            }
        }

        @Override
        protected Theme.ResourcesProvider getResourcesProvider() {
            return ChatActivityEnterView.this.resourcesProvider;
        }

        @Override
        public boolean requestFocus(int i, Rect rect) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!chatActivityEnterView.sendPlainEnabled && !chatActivityEnterView.isEditingMessage()) {
                return false;
            }
            ChatActivityEnterView.this.onKeyboardShown();
            return super.requestFocus(i, rect);
        }

        @Override
        public void setOffsetY(float f) {
            super.setOffsetY(f);
            if (ChatActivityEnterView.this.sizeNotifierLayout.getForeground() != null) {
                ChatActivityEnterView.this.sizeNotifierLayout.invalidateDrawable(ChatActivityEnterView.this.sizeNotifierLayout.getForeground());
            }
        }
    }

    private boolean isKeyboardSupportIncognitoMode() {
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        return string == null || !string.startsWith("com.samsung");
    }

    public void setCustomWindowView(View view) {
        this.mCustomWindowView = view;
        this.messageEditText.setWindowView(view);
    }

    private void createMessageEditText() {
        if (this.messageEditText != null) {
            return;
        }
        ChatActivityEditTextCaption chatActivityEditTextCaption = new ChatActivityEditTextCaption(getContext(), this.resourcesProvider) {
            boolean clickMaybe;
            private boolean firstDraw = true;
            float touchX;
            float touchY;

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (getLayout() == null || !this.firstDraw) {
                    return;
                }
                this.firstDraw = false;
                ChatActivityEnterView.this.checkSendButton(true);
            }

            @Override
            public boolean onTextContextMenuItem(int i) {
                if (i == 16908322 && ChatActivityEnterView.this.handleRichHtmlPaste()) {
                    return true;
                }
                return super.onTextContextMenuItem(i);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (ChatActivityEnterView.this.botCommandsMenuIsShowing()) {
                    if (motionEvent.getAction() == 0) {
                        this.touchX = motionEvent.getX();
                        this.touchY = motionEvent.getY();
                        this.clickMaybe = true;
                    } else if (this.clickMaybe && motionEvent.getAction() == 2) {
                        if (Math.abs(motionEvent.getX() - this.touchX) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.touchY) > AndroidUtilities.touchSlop) {
                            this.clickMaybe = false;
                        }
                    } else if (this.clickMaybe) {
                        if (ChatActivityEnterView.this.delegate != null) {
                            fixHandlesColor();
                            ChatActivityEnterView.this.delegate.onKeyboardRequested();
                        }
                        EditTextCaption editTextCaption = ChatActivityEnterView.this.messageEditText;
                        if (editTextCaption != null && !AndroidUtilities.showKeyboard(editTextCaption)) {
                            ChatActivityEnterView.this.messageEditText.clearFocus();
                            ChatActivityEnterView.this.messageEditText.requestFocus();
                        }
                    }
                    return this.clickMaybe;
                }
                if (motionEvent.getAction() == 0 && ChatActivityEnterView.this.delegate != null) {
                    fixHandlesColor();
                    ChatActivityEnterView.this.delegate.onKeyboardRequested();
                }
                return super.onTouchEvent(motionEvent);
            }

            private void fixHandlesColor() {
                setHandlesColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_TextSelectionCursor));
            }

            @Override
            public void setOffsetY(float f) {
                super.setOffsetY(f);
                ChatActivityEnterView.this.messageEditTextContainer.invalidate();
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                if (ChatActivityEnterView.this.mCustomWindowView != null) {
                    setWindowView(ChatActivityEnterView.this.mCustomWindowView);
                } else if (ChatActivityEnterView.this.parentFragment == null || ChatActivityEnterView.this.parentFragment.getParentLayout() == null || !ChatActivityEnterView.this.parentFragment.getParentLayout().isSheet()) {
                    setWindowView(ChatActivityEnterView.this.parentActivity.getWindow().getDecorView());
                } else {
                    setWindowView(ChatActivityEnterView.this.parentFragment.getParentLayout().getWindow().getDecorView());
                }
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                if (ChatActivityEnterView.this.lineCount != ChatActivityEnterView.this.messageEditText.getLineCount()) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    boolean z = false;
                    chatActivityEnterView.showAiButton((chatActivityEnterView.messageEditText.getLineCount() <= 2 || ChatActivityEnterView.this.messageEditText.getText() == null || TextUtils.isEmpty(ChatActivityEnterView.this.messageEditText.getText().toString().trim())) ? false : true);
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    if (chatActivityEnterView2.messageEditText.getLineCount() > 2 && ChatActivityEnterView.this.messageEditText.getText() != null && !TextUtils.isEmpty(ChatActivityEnterView.this.messageEditText.getText().toString().trim())) {
                        z = true;
                    }
                    chatActivityEnterView2.showRichButton(z);
                }
            }
        };
        this.messageEditText = chatActivityEditTextCaption;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            chatActivityEditTextCaption.setFallbackLineSpacing(false);
        }
        if (i >= 35) {
            this.messageEditText.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.messageEditText.setDelegate(new EditTextCaption.EditTextCaptionDelegate() {
            @Override
            public final void onSpansChanged() {
                ChatActivityEnterView.$r8$lambda$E8FZB83W4C9qc4nCOe0dnxRbmkQ(this.f$0);
            }
        });
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null && chatActivity.getParentLayout() != null && this.parentFragment.getParentLayout().isSheet()) {
            this.messageEditText.setWindowView(this.parentFragment.getParentLayout().getWindow().getDecorView());
        } else {
            this.messageEditText.setWindowView(this.parentActivity.getWindow().getDecorView());
        }
        ChatActivity chatActivity2 = this.parentFragment;
        TLRPC.EncryptedChat currentEncryptedChat = chatActivity2 != null ? chatActivity2.getCurrentEncryptedChat() : null;
        this.messageEditText.setAllowTextEntitiesIntersection(supportsSendingNewEntities());
        int i2 = (!isKeyboardSupportIncognitoMode() || currentEncryptedChat == null) ? 268435456 : 285212672;
        this.messageEditText.setIncludeFontPadding(false);
        this.messageEditText.setImeOptions(i2);
        EditTextCaption editTextCaption = this.messageEditText;
        int inputType = editTextCaption.getInputType() | 147456;
        this.commonInputType = inputType;
        editTextCaption.setInputType(inputType);
        updateFieldHint(false);
        this.messageEditText.setSingleLine(false);
        this.messageEditText.setMaxLines(6);
        this.messageEditText.setTextSize(1, 18.0f);
        this.messageEditText.setGravity(80);
        this.messageEditText.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.messageEditText.setBackgroundDrawable(null);
        this.messageEditText.setTextColor(getThemedColor(Theme.key_chat_messagePanelText));
        this.messageEditText.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkOut));
        this.messageEditText.setHighlightColor(getThemedColor(Theme.key_chat_inTextSelectionHighlight));
        EditTextCaption editTextCaption2 = this.messageEditText;
        int i3 = Theme.key_chat_messagePanelHint;
        editTextCaption2.setHintColor(getThemedColor(i3));
        this.messageEditText.setHintTextColor(getThemedColor(i3));
        this.messageEditText.setCursorColor(getThemedColor(Theme.key_chat_messagePanelCursor));
        this.messageEditText.setHandlesColor(getThemedColor(Theme.key_chat_TextSelectionCursor));
        this.messageEditTextContainer.addView(this.messageEditText, 1, LayoutHelper.createFrame(-1, -2.0f, 80, 52.0f, 0.0f, this.isChat ? 50.0f : 2.0f, 1.5f));
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.currentAccount, this.resourcesProvider);
        this.richDraftPreview = previewView;
        previewView.setAllowActions(false);
        this.richDraftPreview.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.richDraftPreview.setMinHeight(AndroidUtilities.dp(88.0f));
        this.richDraftPreview.setVisibility(8);
        this.richDraftPreview.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.richDraftPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.openRichEditor();
            }
        });
        this.messageEditTextContainer.addView(this.richDraftPreview, 2, LayoutHelper.createFrame(-1, -2.0f, 80, 44.0f, 0.0f, (this.isChat ? 50 : 2) - 8, 1.5f));
        this.messageEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(android.view.View r5, int r6, android.view.KeyEvent r7) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.AnonymousClass51.onKey(android.view.View, int, android.view.KeyEvent):boolean");
            }
        });
        this.messageEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                if (i4 == 4) {
                    ChatActivityEnterView.this.sendMessage();
                    return true;
                }
                if (keyEvent == null || i4 != 0 || keyEvent.isShiftPressed()) {
                    return false;
                }
                if (ChatActivityEnterView.this.sendByEnter) {
                    if (keyEvent.isCtrlPressed()) {
                        return false;
                    }
                } else if (!keyEvent.isCtrlPressed()) {
                    return false;
                }
                if (keyEvent.getAction() != 0 || ChatActivityEnterView.this.editingMessageObject != null) {
                    return false;
                }
                ChatActivityEnterView.this.sendMessage();
                return true;
            }
        });
        this.messageEditText.addTextChangedListener(new AnonymousClass53());
        this.messageEditText.addTextChangedListener(new EditTextSuggestionsFix());
        this.messageEditText.setEnabled(this.messageEditTextEnabled);
        ArrayList arrayList = this.messageEditTextWatchers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                this.messageEditText.addTextChangedListener((TextWatcher) obj);
            }
            this.messageEditTextWatchers.clear();
        }
        updateFieldHint(false);
        ChatActivity chatActivity3 = this.parentFragment;
        updateSendAsButton(chatActivity3 != null && chatActivity3.getFragmentBeginToShow());
        ChatActivity chatActivity4 = this.parentFragment;
        if (chatActivity4 != null) {
            chatActivity4.applyDraftMaybe(false);
        }
        updateFieldRight(this.lastAttachVisible);
    }

    public static void $r8$lambda$E8FZB83W4C9qc4nCOe0dnxRbmkQ(ChatActivityEnterView chatActivityEnterView) {
        chatActivityEnterView.messageEditText.invalidateEffects();
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onTextSpansChanged(chatActivityEnterView.messageEditText.getTextToUse());
        }
    }

    class AnonymousClass53 implements TextWatcher {
        boolean heightShouldBeChanged;
        private boolean ignorePrevTextChange;
        private boolean nextChangeIsSend;
        private CharSequence prevText;
        private boolean processChange;

        AnonymousClass53() {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.ignorePrevTextChange && ChatActivityEnterView.this.recordingAudioVideo) {
                this.prevText = charSequence.toString();
            }
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int currentPage;
            if (this.ignorePrevTextChange) {
                return;
            }
            if (ChatActivityEnterView.this.emojiView != null) {
                currentPage = ChatActivityEnterView.this.emojiView.getCurrentPage();
            } else {
                currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
            }
            boolean z = currentPage != 0 && (ChatActivityEnterView.this.allowStickers || ChatActivityEnterView.this.allowGifs);
            if (((i2 == 0 && !TextUtils.isEmpty(charSequence)) || (i2 != 0 && TextUtils.isEmpty(charSequence))) && z) {
                ChatActivityEnterView.this.setEmojiButtonImage(false, true);
            }
            if (ChatActivityEnterView.this.lineCount != ChatActivityEnterView.this.messageEditText.getLineCount()) {
                this.heightShouldBeChanged = (ChatActivityEnterView.this.messageEditText.getLineCount() >= 4) != (ChatActivityEnterView.this.lineCount >= 4);
                if (!ChatActivityEnterView.this.isInitLineCount && ChatActivityEnterView.this.messageEditText.getMeasuredWidth() > 0) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    chatActivityEnterView.onLineCountChanged(chatActivityEnterView.lineCount, ChatActivityEnterView.this.messageEditText.getLineCount());
                }
                ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                chatActivityEnterView2.lineCount = chatActivityEnterView2.messageEditText.getLineCount();
                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                chatActivityEnterView3.showAiButton((chatActivityEnterView3.lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
                ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
                chatActivityEnterView4.showRichButton((chatActivityEnterView4.lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            } else {
                this.heightShouldBeChanged = false;
            }
            if (ChatActivityEnterView.this.innerTextChange == 1) {
                return;
            }
            if (ChatActivityEnterView.this.sendByEnter) {
                ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                if (!chatActivityEnterView5.ctrlPressed && !chatActivityEnterView5.shiftPressed && !chatActivityEnterView5.ignoreTextChange && !ChatActivityEnterView.this.isPaste && ChatActivityEnterView.this.editingMessageObject == null && i3 > i2 && charSequence.length() > 0 && charSequence.length() == i + i3 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                    this.nextChangeIsSend = true;
                }
            }
            ChatActivityEnterView.this.isPaste = false;
            ChatActivityEnterView.this.checkSendButton(true);
            CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
            if (ChatActivityEnterView.this.delegate != null && !ChatActivityEnterView.this.ignoreTextChange) {
                int i4 = i3 + 1;
                if (i2 > i4 || i3 - i2 > 2 || TextUtils.isEmpty(charSequence)) {
                    ChatActivityEnterView.this.messageWebPageSearch = true;
                }
                ChatActivityEnterView.this.delegate.onTextChanged(charSequence, i2 > i4 || i3 - i2 > 2, false);
            }
            if (ChatActivityEnterView.this.innerTextChange != 2 && i3 - i2 > 1) {
                this.processChange = true;
            }
            if (ChatActivityEnterView.this.editingMessageObject == null && !ChatActivityEnterView.this.canWriteToChannel && trimmedString.length() != 0 && ChatActivityEnterView.this.lastTypingTimeSend < System.currentTimeMillis() - 5000 && !ChatActivityEnterView.this.ignoreTextChange) {
                ChatActivityEnterView.this.lastTypingTimeSend = System.currentTimeMillis();
                if (ChatActivityEnterView.this.delegate != null) {
                    ChatActivityEnterView.this.delegate.needSendTyping();
                }
            }
            ChatActivityEnterView.this.updateSendButtonPaid();
        }

        @Override
        public void afterTextChanged(Editable editable) {
            NumberTextView numberTextView;
            boolean z;
            if (this.ignorePrevTextChange) {
                return;
            }
            if (this.prevText == null) {
                if (ChatActivityEnterView.this.innerTextChange == 0) {
                    if (this.nextChangeIsSend) {
                        ChatActivityEnterView.this.sendMessage();
                        this.nextChangeIsSend = false;
                    }
                    if (this.processChange) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji((CharSequence) editable, ChatActivityEnterView.this.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
                        this.processChange = false;
                    }
                }
                ChatActivityEnterView.this.codePointCount = Character.codePointCount(editable, 0, editable.length());
                if (ChatActivityEnterView.this.currentLimit > 0) {
                    int i = ChatActivityEnterView.this.currentLimit - ChatActivityEnterView.this.codePointCount;
                    if (i <= (ChatActivityEnterView.this.isLiveComment ? 5 : 100)) {
                        if (i < -9999) {
                            i = -9999;
                        }
                        ChatActivityEnterView.this.createCaptionLimitView();
                        NumberTextView numberTextView2 = ChatActivityEnterView.this.captionLimitView;
                        numberTextView2.setNumber(i, numberTextView2.getVisibility() == 0);
                        if (ChatActivityEnterView.this.captionLimitView.getVisibility() != 0) {
                            ChatActivityEnterView.this.captionLimitView.setVisibility(0);
                            ChatActivityEnterView.this.captionLimitView.setAlpha(0.0f);
                            ChatActivityEnterView.this.captionLimitView.setScaleX(0.5f);
                            ChatActivityEnterView.this.captionLimitView.setScaleY(0.5f);
                        }
                        ChatActivityEnterView.this.captionLimitView.animate().setListener(null).cancel();
                        ChatActivityEnterView.this.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        if (i < 0) {
                            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                            chatActivityEnterView.captionLimitView.setTextColor(chatActivityEnterView.getThemedColor(Theme.key_text_RedRegular));
                            z = false;
                        } else {
                            ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                            chatActivityEnterView2.captionLimitView.setTextColor(chatActivityEnterView2.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                        }
                    } else {
                        numberTextView = ChatActivityEnterView.this.captionLimitView;
                        if (numberTextView != null) {
                            numberTextView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    ChatActivityEnterView.this.captionLimitView.setVisibility(8);
                                }
                            });
                        }
                    }
                    z = true;
                } else {
                    numberTextView = ChatActivityEnterView.this.captionLimitView;
                    if (numberTextView != null) {
                        numberTextView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                ChatActivityEnterView.this.captionLimitView.setVisibility(8);
                            }
                        });
                    }
                    z = true;
                }
                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                if (chatActivityEnterView3.doneButtonEnabled != z && chatActivityEnterView3.doneButton != null) {
                    ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
                    chatActivityEnterView4.doneButtonEnabled = z;
                    if (chatActivityEnterView4.doneButton != null) {
                        ChatActivityEnterView.this.doneButton.invalidate();
                    }
                }
                BotCommandsMenuContainer botCommandsMenuContainer = ChatActivityEnterView.this.botCommandsMenuContainer;
                if (botCommandsMenuContainer != null) {
                    botCommandsMenuContainer.dismiss();
                }
                ChatActivityEnterView.this.checkBotMenu();
                if (ChatActivityEnterView.this.editingCaption && !ChatActivityEnterView.this.captionLimitBulletinShown && !MessagesController.getInstance(ChatActivityEnterView.this.currentAccount).premiumFeaturesBlocked() && !UserConfig.getInstance(ChatActivityEnterView.this.currentAccount).isPremium() && ChatActivityEnterView.this.codePointCount > MessagesController.getInstance(ChatActivityEnterView.this.currentAccount).captionLengthLimitDefault && ChatActivityEnterView.this.codePointCount < MessagesController.getInstance(ChatActivityEnterView.this.currentAccount).captionLengthLimitPremium) {
                    ChatActivityEnterView.this.captionLimitBulletinShown = true;
                    if (!this.heightShouldBeChanged) {
                        ChatActivityEnterView.this.showCaptionLimitBulletin();
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ChatActivityEnterView.this.showCaptionLimitBulletin();
                            }
                        }, 300L);
                    }
                }
                ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                chatActivityEnterView5.showAiButton(chatActivityEnterView5.lineCount > 2 && !TextUtils.isEmpty(editable.toString().trim()));
                ChatActivityEnterView.this.checkIsEphemeralMessage(true);
                ChatActivityEnterView chatActivityEnterView6 = ChatActivityEnterView.this;
                chatActivityEnterView6.showRichButton(chatActivityEnterView6.lineCount > 2 && !TextUtils.isEmpty(editable.toString().trim()));
                return;
            }
            this.ignorePrevTextChange = true;
            editable.replace(0, editable.length(), this.prevText);
            this.prevText = null;
            this.ignorePrevTextChange = false;
        }
    }

    public void showAiButton(boolean z) {
        ChatActivity chatActivity;
        final boolean z2 = ((!z && !this.richDraftActive) || (chatActivity = this.parentFragment) == null || chatActivity.isSecretChat()) ? false : true;
        if (this.shownAiButton == z2) {
            return;
        }
        if (z2) {
            MessagesController.getInstance(this.currentAccount).getTonesController().load();
        }
        this.shownAiButton = z2;
        this.aiButton.setVisibility(0);
        this.aiButton.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$HmXIRgtiPxFIu6OVUVOnpb2NT4U(this.f$0, z2);
            }
        }).start();
        if (z2) {
            ImageView imageView = this.aiButton;
            AiButtonDrawable aiButtonDrawable = this.aiButtonIcon;
            Objects.requireNonNull(aiButtonDrawable);
            imageView.postDelayed(new CaptionPhotoViewer$$ExternalSyntheticLambda5(aiButtonDrawable), 220L);
            HintView2 hintView2 = this.aiHint;
            if (hintView2 != null) {
                hintView2.hide();
                this.aiHint = null;
            }
            if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                final HintView2 hintView3 = new HintView2(getContext(), 3);
                this.aiHint = hintView3;
                hintView3.setMultilineText(true);
                this.aiHint.setText(LocaleController.getString(R.string.AIEditorHint));
                this.aiHint.setJointPx(0.0f, (this.aiButton.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
                addView(this.aiHint, LayoutHelper.createFrame(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                this.aiHint.setOnHiddenListener(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.removeView(hintView3);
                    }
                });
                this.aiHint.setDuration(4000L);
                this.aiHint.show();
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                return;
            }
            return;
        }
        HintView2 hintView4 = this.aiHint;
        if (hintView4 != null) {
            hintView4.hide();
            this.aiHint = null;
        }
    }

    public static void $r8$lambda$HmXIRgtiPxFIu6OVUVOnpb2NT4U(ChatActivityEnterView chatActivityEnterView, boolean z) {
        if (z) {
            chatActivityEnterView.getClass();
        } else {
            chatActivityEnterView.aiButton.setVisibility(8);
        }
    }

    public void showRichButton(boolean z) {
        ChatActivity chatActivity;
        final boolean z2 = (this.richDraftActive || z) && (chatActivity = this.parentFragment) != null && !chatActivity.isSecretChat() && this.editingMessageObject == null && MessagesController.getInstance(this.currentAccount).richEditorAvailable();
        if (this.shownRichButton == z2) {
            return;
        }
        this.shownRichButton = z2;
        this.richButton.setVisibility(0);
        this.richButton.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$X_5xC6BqG4XDrwvFKzGPIR_AOOQ(this.f$0, z2);
            }
        }).start();
    }

    public static void $r8$lambda$X_5xC6BqG4XDrwvFKzGPIR_AOOQ(ChatActivityEnterView chatActivityEnterView, boolean z) {
        if (z) {
            chatActivityEnterView.getClass();
        } else {
            chatActivityEnterView.richButton.setVisibility(8);
        }
    }

    @Override
    public void addTextChangedListener(TextWatcher textWatcher) {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.addTextChangedListener(textWatcher);
            return;
        }
        if (this.messageEditTextWatchers == null) {
            this.messageEditTextWatchers = new ArrayList();
        }
        this.messageEditTextWatchers.add(textWatcher);
    }

    public boolean isSendButtonVisible() {
        return this.sendButton.getVisibility() == 0;
    }

    public void setRecordVideoButtonVisible(boolean z, boolean z2) {
        if (this.audioVideoSendButton == null) {
            return;
        }
        this.isInVideoMode = z;
        if (z2) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z3 = false;
            if (DialogObject.isChatDialog(this.dialog_id)) {
                TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    z3 = true;
                }
            }
            globalMainSettings.edit().putBoolean(z3 ? "currentModeVideoChannel" : "currentModeVideo", z).apply();
        }
        this.audioVideoSendButton.setState(isInVideoMode() ? ChatActivityEnterViewAnimatedIconView.State.VIDEO : ChatActivityEnterViewAnimatedIconView.State.VOICE, z2);
        this.audioVideoSendButton.setContentDescription(LocaleController.getString(isInVideoMode() ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        this.audioVideoButtonContainer.setContentDescription(LocaleController.getString(isInVideoMode() ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        this.audioVideoSendButton.sendAccessibilityEvent(8);
    }

    public boolean isRecordingAudioVideo() {
        if (this.recordingAudioVideo) {
            return true;
        }
        AnimatorSet animatorSet = this.runningAnimationAudio;
        return (animatorSet == null || !animatorSet.isRunning() || this.recordIsCanceled) ? false : true;
    }

    public boolean isRecordLocked() {
        return this.recordingAudioVideo && this.recordCircle.isSendButtonVisible();
    }

    public void cancelRecordingAudioVideo() {
        if (this.hasRecordVideo && isInVideoMode()) {
            CameraController.getInstance().cancelOnInitRunnable(this.onFinishInitCameraRunnable);
            this.delegate.needStartRecordVideo(5, true, 0, 0, this.voiceOnce ? Integer.MAX_VALUE : 0, this.effectId, 0L);
            SendButton sendButton = this.sendButton;
            this.effectId = 0L;
            sendButton.setEffect(0L);
        } else {
            this.delegate.needStartRecordAudio(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.recordingAudioVideo = false;
        updateRecordInterface(2, true);
    }

    public void showContextProgress(boolean z) {
        CloseProgressDrawable2 closeProgressDrawable2 = this.progressDrawable;
        if (closeProgressDrawable2 == null) {
            return;
        }
        if (z) {
            closeProgressDrawable2.startAnimation();
        } else {
            closeProgressDrawable2.stopAnimation();
        }
    }

    public void setCaption(String str) {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setCaption(str);
            checkSendButton(true);
        }
    }

    public void setSlowModeTimer(int i) {
        this.slowModeTimer = i;
        updateSlowModeText();
    }

    public CharSequence getSlowModeTimer() {
        if (this.slowModeTimer > 0) {
            return this.slowModeButton.getText();
        }
        return null;
    }

    public void updateSlowModeText() {
        int i;
        boolean zIsUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.updateSlowModeRunnable);
        this.updateSlowModeRunnable = null;
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((zIsUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.currentAccount).isUploadingMessageIdDialog(this.dialog_id)) || SendMessagesHelper.getInstance(this.currentAccount).isSendingMessageIdDialog(this.dialog_id))) {
            if (ChatObject.hasAdminRights(this.accountInstance.getMessagesController().getChat(Long.valueOf(this.info.id))) || ChatObject.isIgnoredChatRestrictionsForBoosters(this.info)) {
                i = 0;
            } else {
                i = this.info.slowmode_seconds;
                this.slowModeTimer = zIsUploadingMessageIdDialog ? Integer.MAX_VALUE : 2147483646;
            }
        } else {
            int i2 = this.slowModeTimer;
            if (i2 >= 2147483646) {
                if (this.info != null) {
                    this.accountInstance.getMessagesController().loadFullChat(this.info.id, 0, true);
                }
                i = 0;
            } else {
                i = i2 - currentTime;
            }
        }
        if (this.slowModeTimer != 0 && i > 0) {
            this.slowModeButton.setText(AndroidUtilities.formatDurationNoHours(Math.max(1, i), false));
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                SlowModeBtn slowModeBtn = this.slowModeButton;
                chatActivityEnterViewDelegate.onUpdateSlowModeButton(slowModeBtn, false, slowModeBtn.getText());
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.updateSlowModeText();
                }
            };
            this.updateSlowModeRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 100L);
        } else {
            this.slowModeTimer = 0;
        }
        if (isInScheduleMode()) {
            return;
        }
        checkSendButton(true);
    }

    public void addTopView(View view, int i) {
        if (view == null) {
            return;
        }
        this.topView = view;
        addView(view, 0, LayoutHelper.createFrame(-1, i, 51));
        this.needShowTopView = false;
        checkUi_TopViewVisibility();
    }

    public void setForceShowSendButton(boolean z, boolean z2) {
        this.forceShowSendButton = z;
        checkSendButton(z2);
    }

    public void setAllowStickersAndGifs(boolean z, boolean z2, boolean z3) {
        setAllowStickersAndGifs(z, z2, z3, false);
    }

    public void setAllowStickersAndGifs(boolean z, boolean z2, boolean z3, boolean z4) {
        if ((this.allowStickers != z2 || this.allowGifs != z3) && this.emojiView != null) {
            if (this.emojiViewVisible && !z4) {
                this.removeEmojiViewAfterAnimation = true;
                hidePopup(false);
            } else if (z4) {
                openKeyboardInternal();
            }
        }
        this.allowAnimatedEmoji = z;
        this.allowStickers = z2;
        this.allowGifs = z3;
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.setAllow(z2, z3, true);
        }
        setEmojiButtonImage(false, !this.isPaused);
    }

    public void addEmojiToRecent(String str) {
        createEmojiView();
        this.emojiView.addEmojiToRecent(str);
    }

    public void setOpenGifsTabFirst() {
        createEmojiView();
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, true, true, false);
        this.emojiView.switchToGifRecent();
    }

    public void showTopView(boolean z, boolean z2) {
        showTopView(z, z2, false);
    }

    private void showTopView(boolean z, boolean z2, boolean z3) {
        if (this.topView == null || this.topViewShowed || getVisibility() != 0) {
            FrameLayout frameLayout = this.recordedAudioPanel;
            if (frameLayout == null || frameLayout.getVisibility() != 0) {
                if ((!this.forceShowSendButton && this.replyingQuote == null && this.replyingMessageObject == null) || z2) {
                    openKeyboard();
                    return;
                }
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.recordedAudioPanel;
        boolean z4 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) && ((!this.forceShowSendButton && this.replyingQuote == null) || z2) && (this.botReplyMarkup == null || this.editingMessageObject != null);
        if (!z3 && z && z4 && !this.keyboardVisible && !isPopupShowing()) {
            openKeyboard();
            Runnable runnable = this.showTopViewRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.m2089$r8$lambda$GFzQwZMuZz5yfqegsT5v8llPw(this.f$0);
                }
            };
            this.showTopViewRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 200L);
            return;
        }
        this.needShowTopView = true;
        this.topViewShowed = true;
        if (this.allowShowTopView) {
            this.animatorTopViewVisibility.setValue(true, z);
            if (z4) {
                EditTextCaption editTextCaption = this.messageEditText;
                if (editTextCaption != null) {
                    editTextCaption.requestFocus();
                }
                openKeyboard();
            }
        }
    }

    public static void m2089$r8$lambda$GFzQwZMuZz5yfqegsT5v8llPw(ChatActivityEnterView chatActivityEnterView) {
        chatActivityEnterView.showTopView(true, false, true);
        chatActivityEnterView.showTopViewRunnable = null;
    }

    public void onEditTimeExpired() {
        SendButton sendButton = this.doneButton;
        if (sendButton != null) {
            sendButton.setVisibility(8);
        }
    }

    public void showEditDoneProgress(boolean z, boolean z2) {
        if (this.doneButton == null) {
            return;
        }
        AnimatorSet animatorSet = this.doneButtonAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            this.doneButton.setEnabled(false);
            this.doneButton.setLoading(true, -3.0f);
        } else {
            this.doneButton.setEnabled(true);
            this.doneButton.setLoading(false, -3.0f);
        }
    }

    public void hideTopView(boolean z) {
        if (this.topView == null || !this.topViewShowed) {
            return;
        }
        Runnable runnable = this.showTopViewRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.topViewShowed = false;
        this.needShowTopView = false;
        if (this.allowShowTopView) {
            this.animatorTopViewVisibility.setValue(false, z);
        }
    }

    public boolean isTopViewVisible() {
        View view = this.topView;
        return view != null && view.getVisibility() == 0;
    }

    public float topViewVisible() {
        return getTopViewEnterProgress();
    }

    public void onAdjustPanTransitionEnd() {
        Runnable runnable = this.onKeyboardClosed;
        if (runnable != null) {
            runnable.run();
            this.onKeyboardClosed = null;
        }
    }

    public void onAdjustPanTransitionStart(boolean z, int i) {
        Runnable runnable;
        if (z && (runnable = this.showTopViewRunnable) != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.showTopViewRunnable.run();
        }
        Runnable runnable2 = this.setTextFieldRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.setTextFieldRunnable.run();
        }
    }

    private void onWindowSizeChanged() {
        int height = this.sizeNotifierLayout.getHeight();
        if (!this.keyboardVisible) {
            height -= this.emojiPadding;
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onWindowSizeChanged(height);
        }
        if (this.topView != null) {
            if (height < AndroidUtilities.dp(72.0f) + ActionBar.getCurrentActionBarHeight()) {
                if (this.allowShowTopView) {
                    this.allowShowTopView = false;
                    if (this.needShowTopView) {
                        this.animatorTopViewVisibility.setValue(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.allowShowTopView) {
                return;
            }
            this.allowShowTopView = true;
            if (this.needShowTopView) {
                this.animatorTopViewVisibility.setValue(true, false);
            }
        }
    }

    private void resizeForTopView(boolean z) {
        if (this.resizeForTopViewLastShow == z) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textFieldContainer.getLayoutParams();
        int i = z ? this.topView.getLayoutParams().height : 0;
        layoutParams.topMargin = i;
        layoutParams.topMargin = i + AndroidUtilities.dp(9.0f);
        this.textFieldContainer.setLayoutParams(layoutParams);
        this.resizeForTopViewLastShow = z;
        setMinimumHeight(AndroidUtilities.dp(44.0f) + (z ? this.topView.getLayoutParams().height : 0));
        if (this.stickersExpanded) {
            if (this.searchingType == 0) {
                setStickersExpanded(false, true, false);
            } else {
                checkStickresExpandHeight();
            }
        }
    }

    public void onDestroy() {
        RecordedAudioPlayerView recordedAudioPlayerView = this.audioTimelineView;
        if (recordedAudioPlayerView != null) {
            recordedAudioPlayerView.destroy();
        }
        if (this.audioTimelineView != null && this.audioToSend != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            long j = this.dialog_id;
            ChatActivity chatActivity = this.parentFragment;
            long topicId = (chatActivity == null || !chatActivity.isTopic) ? 0L : chatActivity.getTopicId();
            RecordedAudioPlayerView recordedAudioPlayerView2 = this.audioTimelineView;
            float audioLeft = recordedAudioPlayerView2 == null ? 0.0f : recordedAudioPlayerView2.getAudioLeft();
            RecordedAudioPlayerView recordedAudioPlayerView3 = this.audioTimelineView;
            mediaDataController.setDraftVoiceRegion(j, topicId, audioLeft, recordedAudioPlayerView3 == null ? 1.0f : recordedAudioPlayerView3.getAudioRight());
        }
        this.destroyed = true;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.onDestroy();
        }
        Runnable runnable = this.updateSlowModeRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.updateSlowModeRunnable = null;
        }
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.wakeLock = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.setDelegate(null);
        }
        SenderSelectPopup senderSelectPopup = this.senderSelectPopupWindow;
        if (senderSelectPopup != null) {
            senderSelectPopup.setPauseNotifications(false);
            this.senderSelectPopupWindow.dismiss();
        }
    }

    public void checkChannelRights() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        updateRecordButton(chatActivity.getCurrentChat(), this.parentFragment.getCurrentUserInfo());
    }

    public void updateRecordButton(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        EmojiView emojiView;
        this.emojiButtonRestricted = false;
        boolean z = true;
        this.stickersEnabled = true;
        this.sendPlainEnabled = true;
        this.sendRoundEnabled = true;
        this.sendVoiceEnabled = true;
        if (chat != null) {
            this.audioVideoButtonContainerForbidden = (ChatObject.canSendVoice(chat) || (ChatObject.canSendRoundVideo(chat) && this.hasRecordVideo)) ? false : true;
            this.stickersEnabled = ChatObject.canSendStickers(chat);
            boolean zCanSendPlain = ChatObject.canSendPlain(chat);
            this.sendPlainEnabled = zCanSendPlain;
            boolean z2 = (this.stickersEnabled || zCanSendPlain) ? false : true;
            this.emojiButtonRestricted = z2;
            this.emojiButtonAlpha = z2 ? 0.5f : 1.0f;
            updateEmojiButtonParams();
            if (!this.emojiButtonRestricted && (emojiView = this.emojiView) != null) {
                emojiView.setStickersBanned(!this.sendPlainEnabled, !this.stickersEnabled, -this.dialog_id);
            }
            this.sendRoundEnabled = ChatObject.canSendRoundVideo(chat);
            this.sendVoiceEnabled = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.audioVideoButtonContainerForbidden = userFull.voice_messages_forbidden;
            this.userInfo = userFull;
        }
        this.audioVideoButtonContainer.setAlpha(this.audioVideoButtonContainerForbidden ? 0.5f : 1.0f);
        this.audioVideoButtonContainer.invalidate();
        this.audioVideoSendButton.setColorFilter(new PorterDuffColorFilter(this.audioVideoButtonContainerForbidden ? getThemedColor(Theme.key_glass_defaultIcon) : -1, PorterDuff.Mode.SRC_IN));
        this.audioVideoSendButton.invalidate();
        updateFieldHint(false);
        boolean z3 = this.isInVideoMode;
        if (!this.sendRoundEnabled && z3) {
            z3 = false;
        }
        if (this.sendVoiceEnabled || z3) {
            z = z3;
        } else if (!this.hasRecordVideo) {
            z = false;
        }
        setRecordVideoButtonVisible(z, false);
    }

    public void onBeginHide() {
        Runnable runnable = this.focusRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.focusRunnable = null;
        }
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        SenderSelectPopup senderSelectPopup = this.senderSelectPopupWindow;
        if (senderSelectPopup != null) {
            senderSelectPopup.setPauseNotifications(false);
            this.senderSelectPopupWindow.dismiss();
        }
    }

    public void onPause() {
        this.isPaused = true;
        SenderSelectPopup senderSelectPopup = this.senderSelectPopupWindow;
        if (senderSelectPopup != null) {
            senderSelectPopup.setPauseNotifications(false);
            this.senderSelectPopupWindow.dismiss();
        }
        if (this.keyboardVisible) {
            this.showKeyboardOnResume = true;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.m2083$r8$lambda$5ODemsIEmp3XiKgylKgKLLH8Og(this.f$0);
            }
        };
        this.hideKeyboardRunnable = runnable;
        AndroidUtilities.runOnUIThread(runnable, 500L);
    }

    public static void m2083$r8$lambda$5ODemsIEmp3XiKgylKgKLLH8Og(ChatActivityEnterView chatActivityEnterView) {
        ChatActivity chatActivity = chatActivityEnterView.parentFragment;
        if (chatActivity == null || chatActivity.isLastFragment()) {
            chatActivityEnterView.closeKeyboard();
        }
        chatActivityEnterView.hideKeyboardRunnable = null;
    }

    public void onResume() {
        EditTextCaption editTextCaption;
        this.isPaused = false;
        Runnable runnable = this.hideKeyboardRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideKeyboardRunnable = null;
        }
        if (hasBotWebView() && botCommandsMenuIsShowing()) {
            return;
        }
        getVisibility();
        if (!this.showKeyboardOnResume || BaseFragment.hasSheets(this.parentFragment)) {
            return;
        }
        this.showKeyboardOnResume = false;
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onKeyboardRequested();
        }
        if (this.searchingType == 0 && (editTextCaption = this.messageEditText) != null) {
            editTextCaption.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.messageEditText);
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow) {
            return;
        }
        this.waitingForKeyboardOpen = true;
        AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        AndroidUtilities.runOnUIThread(this.openKeyboardRunnable, 100L);
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        this.messageEditTextEnabled = z;
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setEnabled(z);
        }
    }

    public void setDialogId(long j, int i) {
        this.dialog_id = j;
        if (this.currentAccount != i) {
            this.notificationsLocker.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
            int i2 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i2);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.currentAccount);
            int i3 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i3);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.currentAccount);
            int i4 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i4);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.currentAccount);
            int i5 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i5);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.currentAccount);
            int i6 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i6);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.currentAccount);
            int i7 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i7);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.currentAccount);
            int i8 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i8);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.currentAccount);
            int i9 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i9);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.currentAccount);
            int i10 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i10);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.currentAccount);
            int i11 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i11);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.currentAccount);
            int i12 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i12);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.currentAccount);
            int i13 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i13);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.currentAccount);
            int i14 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i14);
            this.currentAccount = i;
            this.accountInstance = AccountInstance.getInstance(i);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i2);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i3);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i4);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i5);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i6);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i7);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i8);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i9);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i10);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i11);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i12);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i13);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i14);
        }
        this.sendPlainEnabled = true;
        if (DialogObject.isChatDialog(this.dialog_id)) {
            this.sendPlainEnabled = ChatObject.canSendPlain(this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id)));
        }
        updateScheduleButton(false);
        updateGiftButton(false);
        checkRoundVideo();
        checkChannelRights();
        updateFieldHint(false);
        if (this.messageEditText != null) {
            ChatActivity chatActivity = this.parentFragment;
            updateSendAsButton(chatActivity != null && chatActivity.getFragmentBeginToShow());
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.setChatInfo(chatFull);
        }
        SlowModeBtn slowModeBtn = this.slowModeButton;
        if (slowModeBtn != null) {
            slowModeBtn.setPremiumMode(ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull));
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void checkRoundVideo() {
        boolean z;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.hasRecordVideo) {
            return;
        }
        if (this.attachLayout == null) {
            this.hasRecordVideo = false;
            setRecordVideoButtonVisible(false, false);
            return;
        }
        boolean z3 = true;
        this.hasRecordVideo = true;
        this.sendRoundEnabled = true;
        this.sendVoiceEnabled = true;
        if (DialogObject.isChatDialog(this.dialog_id)) {
            TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
            z = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.hasRecordVideo = false;
            }
            this.sendRoundEnabled = ChatObject.canSendRoundVideo(chat);
            this.sendVoiceEnabled = ChatObject.canSendVoice(chat);
        } else {
            z = false;
        }
        if (!SharedConfig.inappCamera) {
            this.hasRecordVideo = false;
        }
        if (this.hasRecordVideo) {
            if (SharedConfig.hasCameraCache) {
                CameraController.getInstance().initCamera(null);
            }
            z2 = MessagesController.getGlobalMainSettings().getBoolean(z ? "currentModeVideoChannel" : "currentModeVideo", z);
        } else {
            z2 = false;
        }
        if (!this.sendRoundEnabled && z2) {
            z2 = false;
        }
        if (this.sendVoiceEnabled || z2) {
            z3 = z2;
        } else if (!this.hasRecordVideo) {
            z3 = false;
        }
        setRecordVideoButtonVisible(z3, false);
    }

    public boolean isInVideoMode() {
        return this.isInVideoMode;
    }

    public boolean hasRecordVideo() {
        return this.hasRecordVideo;
    }

    public MessageObject getReplyingMessageObject() {
        return this.replyingMessageObject;
    }

    public void updateFieldHint(boolean z) {
        boolean zIsChannelAndNotMegaGroup;
        ChatActivity chatActivity;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        boolean z2 = false;
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return;
        }
        CharSequence charSequence = this.overrideHint;
        if (charSequence != null) {
            editTextCaption.setHintText(charSequence, z);
            this.messageEditText.setHintText2(this.overrideHint2, z);
            return;
        }
        if (!this.sendPlainEnabled && !isEditingMessage()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock3), 1, 2, 0);
            this.messageEditText.setHintText(spannableStringBuilder, z);
            this.messageEditText.setText((CharSequence) null);
            this.messageEditText.setEnabled(false);
            this.messageEditText.setInputType(1);
            return;
        }
        this.messageEditText.setEnabled(true);
        int inputType = this.messageEditText.getInputType();
        int i = this.commonInputType;
        if (inputType != i) {
            this.messageEditText.setInputType(i);
        }
        updateSendButtonPaid();
        ChatActivity chatActivity2 = this.parentFragment;
        boolean z3 = chatActivity2 != null && chatActivity2.getChatMode() == 8 && this.parentFragment.isSubscriberSuggestions;
        ChatActivity chatActivity3 = this.parentFragment;
        long sendPaidMessagesStars = chatActivity3 != null ? chatActivity3.getMessagesController().getSendPaidMessagesStars(this.parentFragment.getDialogId()) : 0L;
        if (sendPaidMessagesStars > 0) {
            sendPaidMessagesStars *= (long) getMessagesCount();
        }
        ChatActivity chatActivity4 = this.parentFragment;
        int chatMode = chatActivity4 != null ? chatActivity4.getChatMode() : -1;
        if (chatMode == 9) {
            this.messageEditText.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            return;
        }
        if (chatMode == 5) {
            if ("hello".equalsIgnoreCase(this.parentFragment.quickReplyShortcut)) {
                this.messageEditText.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                return;
            } else if ("away".equalsIgnoreCase(this.parentFragment.quickReplyShortcut)) {
                this.messageEditText.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                return;
            } else {
                this.messageEditText.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                return;
            }
        }
        if (z3) {
            this.messageEditText.setHintText(sendPaidMessagesStars > 0 ? StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ','), this.spans)) : LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]));
            ColoredImageSpan coloredImageSpan = this.spans[0];
            if (coloredImageSpan != null) {
                coloredImageSpan.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (isEditingBusinessLink()) {
            this.messageEditText.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
            return;
        }
        MessageObject messageObject2 = this.replyingMessageObject;
        if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.messageEditText.setHintText(this.replyingMessageObject.messageOwner.reply_markup.placeholder, z);
            return;
        }
        if (this.editingMessageObject != null) {
            this.messageEditText.setHintText(LocaleController.getString(this.editingCaption ? R.string.Caption : R.string.TypeMessage));
            return;
        }
        if (sendPaidMessagesStars > 0) {
            this.messageEditText.setHintText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ',')), this.spans));
            ColoredImageSpan coloredImageSpan2 = this.spans[0];
            if (coloredImageSpan2 != null) {
                coloredImageSpan2.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.botKeyboardViewVisible && (messageObject = this.botButtonsMessageObject) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.messageEditText.setHintText(this.botButtonsMessageObject.messageOwner.reply_markup.placeholder, z);
            return;
        }
        ChatActivity chatActivity5 = this.parentFragment;
        if (chatActivity5 != null && chatActivity5.isForumInViewAsMessagesMode()) {
            MessageObject messageObject3 = this.replyingTopMessage;
            if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                this.messageEditText.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z);
                return;
            }
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(this.parentFragment.getCurrentChat().id, 1L);
            if (tL_forumTopicFindTopic != null && (str = tL_forumTopicFindTopic.title) != null) {
                this.messageEditText.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z);
                return;
            } else {
                this.messageEditText.setHintText(LocaleController.getString(R.string.TypeMessage), z);
                return;
            }
        }
        if (DialogObject.isChatDialog(this.dialog_id)) {
            TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
            TLRPC.ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(-this.dialog_id);
            zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (!zIsChannelAndNotMegaGroup && ChatObject.getSendAsPeerId(chat, chatFull) == (-this.dialog_id)) {
                z2 = true;
            }
        } else {
            zIsChannelAndNotMegaGroup = false;
        }
        if (z2) {
            this.messageEditText.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
            return;
        }
        TLRPC.User user = this.accountInstance.getMessagesController().getUser(Long.valueOf(this.dialog_id));
        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && (chatActivity = this.parentFragment) != null && !chatActivity.isTopic) {
            this.messageEditText.setHintText(LocaleController.getString(R.string.SendBotNoThread));
            return;
        }
        ChatActivity chatActivity6 = this.parentFragment;
        if (chatActivity6 != null && chatActivity6.isThreadChat()) {
            ChatActivity chatActivity7 = this.parentFragment;
            if (!chatActivity7.isTopic) {
                if (chatActivity7.isReplyChatComment()) {
                    this.messageEditText.setHintText(LocaleController.getString(R.string.Comment));
                    return;
                } else {
                    this.messageEditText.setHintText(LocaleController.getString("Reply", R.string.Reply));
                    return;
                }
            }
        }
        if (zIsChannelAndNotMegaGroup) {
            if (this.silent) {
                this.messageEditText.setHintText(LocaleController.getString("ChannelSilentBroadcast", R.string.ChannelSilentBroadcast), z);
                return;
            } else {
                this.messageEditText.setHintText(LocaleController.getString("ChannelBroadcast", R.string.ChannelBroadcast), z);
                return;
            }
        }
        this.messageEditText.setHintText(LocaleController.getString(R.string.TypeMessage));
    }

    public void setReplyingMessageObject(MessageObject messageObject, ChatActivity.ReplyQuote replyQuote) {
        setReplyingMessageObject(messageObject, replyQuote, null);
    }

    public void setReplyingMessageObject(MessageObject messageObject, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject2) {
        MessageObject messageObject3;
        ChatActivity chatActivity = this.parentFragment;
        boolean z = (chatActivity == null || !chatActivity.isForumInViewAsMessagesMode() || this.replyingTopMessage == messageObject2) ? false : true;
        if (messageObject != null) {
            if (this.botMessageObject == null && (messageObject3 = this.botButtonsMessageObject) != this.replyingMessageObject) {
                this.botMessageObject = messageObject3;
            }
            this.replyingMessageObject = messageObject;
            this.replyingQuote = replyQuote;
            this.replyingTopMessage = messageObject2;
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 == null || !chatActivity2.isTopic || chatActivity2.getThreadMessage() != this.replyingMessageObject) {
                setButtons(this.replyingMessageObject, true);
            }
        } else if (this.replyingMessageObject == this.botButtonsMessageObject) {
            this.replyingMessageObject = null;
            this.replyingTopMessage = null;
            this.replyingQuote = null;
            setButtons(this.botMessageObject, false);
            this.botMessageObject = null;
        } else {
            this.replyingMessageObject = null;
            this.replyingQuote = null;
            this.replyingTopMessage = null;
        }
        checkIsEphemeralMessage(true);
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), chatActivityEnterViewDelegate != null ? chatActivityEnterViewDelegate.getReplyToStory() : null);
        updateFieldHint(z);
    }

    public boolean isEphemeralMessageVisible() {
        return this.animatorEphemeralMessageVisibility.getValue();
    }

    public void checkIsEphemeralMessage(boolean z) {
        MessageObject messageObject;
        boolean z2 = this.dialog_id < 0 && this.isChat && this.editingMessageObject == null && (EphemeralMessagesHelper.getInstance(this.currentAccount).isEphemeralCommand(getEditText() != null ? getEditText().toString() : null, this.lastBotInfo) || ((messageObject = this.replyingMessageObject) != null && messageObject.isEphemeral()));
        boolean z3 = this.animatorEphemeralMessageVisibility.getValue() != z2;
        this.animatorEphemeralMessageVisibility.setValue(z2, z);
        SendButton sendButton = this.sendButton;
        if (sendButton != null) {
            sendButton.hidePrice = z2;
            this.sendButton.invalidate();
        }
        if (z3) {
            checkSendButton(z);
        }
    }

    public void setWebPage(TLRPC.WebPage webPage, boolean z) {
        this.messageWebPage = webPage;
        this.messageWebPageSearch = z;
    }

    public boolean isMessageWebPageSearchEnabled() {
        return this.messageWebPageSearch;
    }

    private void hideRecordedAudioPanel(boolean z) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.recordPannelAnimation;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.audioToSendPath = null;
            this.audioToSend = null;
            this.audioToSendMessageObject = null;
            this.videoToSendMessageObject = null;
            VideoTimelineView videoTimelineView = this.videoTimelineView;
            if (videoTimelineView != null) {
                videoTimelineView.destroy();
            }
            ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.audioVideoSendButton;
            if (chatActivityEnterViewAnimatedIconView != null) {
                chatActivityEnterViewAnimatedIconView.setVisibility(0);
            }
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            Property property3 = View.ALPHA;
            if (z) {
                ImageView imageView = this.attachButton;
                if (imageView != null) {
                    this.attachButtonAlpha = 0.0f;
                    imageView.setAlpha(0.0f);
                    this.attachButton.setScaleX(0.0f);
                    this.attachButton.setScaleY(0.0f);
                }
                this.emojiButtonAlpha = 0.0f;
                this.emojiButtonScale = 0.0f;
                updateEmojiButtonParams();
                this.recordPannelAnimation = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_ALPHA, this.emojiButtonRestricted ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_SCALE, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.recordedAudioPanel, (Property<FrameLayout, Float>) property3, 0.0f));
                if (this.attachButton != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.attachButtonAnimator;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.attachButtonAnimator = null;
                    }
                    ImageView imageView2 = this.attachButton;
                    this.attachButtonAlpha = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) this.MESSAGE_TEXT_TRANSLATION_X, 0.0f));
                ControlsView controlsView = this.controlsView;
                if (controlsView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(controlsView, (Property<ControlsView, Float>) property3, 0.0f));
                    this.controlsView.hideHintView();
                }
                this.recordPannelAnimation.playTogether(arrayList);
                BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
                if (botCommandsMenuView != null) {
                    botCommandsMenuView.setAlpha(0.0f);
                    this.botCommandsMenuButton.setScaleY(0.0f);
                    this.botCommandsMenuButton.setScaleX(0.0f);
                    this.recordPannelAnimation.playTogether(ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property, 1.0f));
                }
                this.recordPannelAnimation.setDuration(150L);
                this.recordPannelAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        FrameLayout frameLayout = ChatActivityEnterView.this.recordedAudioPanel;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                        EditTextCaption editTextCaption = ChatActivityEnterView.this.messageEditText;
                        if (editTextCaption != null) {
                            editTextCaption.requestFocus();
                        }
                        ChatActivityEnterView.this.isRecordingStateChanged();
                    }
                });
            } else {
                RLottieImageView rLottieImageView = this.recordDeleteImageView;
                if (rLottieImageView != null) {
                    rLottieImageView.playAnimation();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean zIsInVideoMode = isInVideoMode();
                Property property4 = View.TRANSLATION_X;
                if (zIsInVideoMode) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.videoTimelineView, (Property<VideoTimelineView, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.videoTimelineView, (Property<VideoTimelineView, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) this.MESSAGE_TEXT_TRANSLATION_X, 0.0f));
                    ControlsView controlsView2 = this.controlsView;
                    if (controlsView2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(controlsView2, (Property<ControlsView, Float>) property3, 0.0f));
                        this.controlsView.hideHintView();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.emojiButtonPaddingAlpha == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) property3, 1.0f);
                        objectAnimatorOfFloat.setStartDelay(750L);
                        objectAnimatorOfFloat.setDuration(200L);
                        animatorSet3.playTogether(objectAnimatorOfFloat);
                    }
                } else {
                    EditTextCaption editTextCaption = this.messageEditText;
                    if (editTextCaption != null && this.emojiButtonPaddingAlpha == 1.0f) {
                        editTextCaption.setAlpha(1.0f);
                        this.messageTextTranslationX = 0.0f;
                        updateMessageTextParams();
                    } else {
                        this.messageTextTranslationX = 0.0f;
                        updateMessageTextParams();
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) property3, 1.0f);
                        objectAnimatorOfFloat2.setStartDelay(750L);
                        objectAnimatorOfFloat2.setDuration(200L);
                        animatorSet3.playTogether(objectAnimatorOfFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.audioTimelineView, (Property<RecordedAudioPlayerView, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.audioTimelineView, (Property<RecordedAudioPlayerView, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    ControlsView controlsView3 = this.controlsView;
                    if (controlsView3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(controlsView3, (Property<ControlsView, Float>) property3, 0.0f));
                        this.controlsView.hideHintView();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (this.attachButton != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.attachButtonAnimator;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.attachButtonAnimator = null;
                    }
                    ImageView imageView3 = this.attachButton;
                    this.attachButtonAlpha = 0.0f;
                    imageView3.setAlpha(0.0f);
                    this.attachButton.setScaleX(0.0f);
                    this.attachButton.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    ImageView imageView4 = this.attachButton;
                    this.attachButtonAlpha = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.emojiButtonScale = 0.0f;
                this.emojiButtonAlpha = 0.0f;
                updateEmojiButtonParams();
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_ALPHA, this.emojiButtonRestricted ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_SCALE, 1.0f));
                BotCommandsMenuView botCommandsMenuView2 = this.botCommandsMenuButton;
                if (botCommandsMenuView2 != null) {
                    botCommandsMenuView2.setAlpha(0.0f);
                    this.botCommandsMenuButton.setScaleY(0.0f);
                    this.botCommandsMenuButton.setScaleX(0.0f);
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property, 1.0f));
                }
                animatorSet4.setDuration(150L);
                animatorSet4.setStartDelay(600L);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.recordPannelAnimation = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                } else {
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.recordPannelAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        VideoTimelineView videoTimelineView2 = ChatActivityEnterView.this.videoTimelineView;
                        if (videoTimelineView2 != null) {
                            videoTimelineView2.setVisibility(8);
                        }
                        RecordedAudioPlayerView recordedAudioPlayerView = ChatActivityEnterView.this.audioTimelineView;
                        if (recordedAudioPlayerView != null) {
                            recordedAudioPlayerView.setVisibility(8);
                        }
                        ChatActivityEnterView.this.transformToSeekbar = 0.0f;
                        ChatActivityEnterView.this.isRecordingStateChanged();
                        ChatActivityEnterView.this.hideRecordedAudioPanelInternal();
                        if (ChatActivityEnterView.this.recordCircle != null) {
                            ChatActivityEnterView.this.recordCircle.setSendButtonInvisible();
                        }
                    }
                });
            }
            AnimatorSet animatorSet6 = this.recordPannelAnimation;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            ControlsView controlsView4 = this.controlsView;
            if (controlsView4 != null) {
                controlsView4.invalidate();
            }
        }
    }

    public void hideRecordedAudioPanelInternal() {
        this.audioToSendPath = null;
        this.audioToSend = null;
        this.audioToSendMessageObject = null;
        this.videoToSendMessageObject = null;
        VideoTimelineView videoTimelineView = this.videoTimelineView;
        if (videoTimelineView != null) {
            videoTimelineView.destroy();
        }
        RecordedAudioPlayerView recordedAudioPlayerView = this.audioTimelineView;
        if (recordedAudioPlayerView != null) {
            recordedAudioPlayerView.setAlpha(1.0f);
            this.audioTimelineView.setTranslationX(0.0f);
        }
        VideoTimelineView videoTimelineView2 = this.videoTimelineView;
        if (videoTimelineView2 != null) {
            videoTimelineView2.setAlpha(1.0f);
            this.videoTimelineView.setTranslationX(0.0f);
        }
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setAlpha(1.0f);
            this.messageTextTranslationX = 0.0f;
            updateMessageTextParams();
            this.messageEditText.requestFocus();
        }
        FrameLayout frameLayout = this.recordedAudioPanel;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        isRecordingStateChanged();
    }

    public boolean sendMessage() {
        if (this.richDraftActive && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            RichEditor.openConversionSheet(getContext(), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.openRichEditorWithoutFormatting();
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.m2101$r8$lambda$gT75VQaGocHgW0cfzb_ERICN7A(this.f$0);
                }
            }, this.resourcesProvider);
            return true;
        }
        if (isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(this.parentActivity, this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public void didSelectDate(boolean z, int i, int i2) {
                    boolean zSendMessageInternal = ChatActivityEnterView.this.sendMessageInternal(z, i, i2, 0L, true);
                    MessageSendPreview messageSendPreview = ChatActivityEnterView.this.messageSendPreview;
                    if (messageSendPreview != null) {
                        messageSendPreview.dismiss(!zSendMessageInternal);
                        ChatActivityEnterView.this.messageSendPreview = null;
                    }
                }
            }, this.resourcesProvider);
            return true;
        }
        return sendMessageInternal(true, 0, 0, 0L, true);
    }

    public static void m2101$r8$lambda$gT75VQaGocHgW0cfzb_ERICN7A(ChatActivityEnterView chatActivityEnterView) {
        ChatActivity chatActivity = chatActivityEnterView.parentFragment;
        if (chatActivity != null) {
            chatActivity.showDialog(new PremiumFeatureBottomSheet(chatActivityEnterView.parentFragment, 43, true));
        }
    }

    public boolean sendMessageInternal(final boolean z, final int i, final int i2, final long j, boolean z2) {
        final boolean z3 = z2 && !this.animatorEphemeralMessageVisibility.getValue();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.m2079$r8$lambda$00FNR0jXgl17GmIyCVFvL2T0Q(this.f$0, z, z3, i, i2, j);
            }
        };
        if (z3) {
            boolean zEnsurePaidMessageConfirmation = AlertsCreator.ensurePaidMessageConfirmation(this.currentAccount, this.dialog_id, getMessagesCount(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ChatActivityEnterView.$r8$lambda$WEv5PlvURjFgKsVM31d_nTfGKms(this.f$0, z, i, i2, (Long) obj);
                }
            }, j);
            if (zEnsurePaidMessageConfirmation && this.sendButtonVisible) {
                if (isInVideoMode()) {
                    if (!this.delegate.isVideoRecordingPaused()) {
                        SlideTextView slideTextView = this.slideText;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.delegate.toggleVideoRecordingPause();
                        return zEnsurePaidMessageConfirmation;
                    }
                } else if (!MediaController.getInstance().isRecordingPaused()) {
                    if (this.sendButtonVisible) {
                        this.calledRecordRunnable = true;
                    }
                    MediaController.getInstance().toggleRecordingPause(this.voiceOnce);
                    this.delegate.needStartRecordAudio(0);
                    SlideTextView slideTextView2 = this.slideText;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return zEnsurePaidMessageConfirmation;
        }
        runnable.run();
        return false;
    }

    public static void m2079$r8$lambda$00FNR0jXgl17GmIyCVFvL2T0Q(final ChatActivityEnterView chatActivityEnterView, final boolean z, boolean z2, final int i, final int i2, final long j) {
        ChatActivityEnterView chatActivityEnterView2;
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate;
        TLRPC.Chat currentChat;
        EmojiView emojiView;
        if (chatActivityEnterView.slowModeTimer == Integer.MAX_VALUE && !chatActivityEnterView.isInScheduleMode()) {
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = chatActivityEnterView.delegate;
            if (chatActivityEnterViewDelegate2 != null) {
                chatActivityEnterViewDelegate2.scrollToSendingMessage();
                return;
            }
            return;
        }
        ChatActivity chatActivity = chatActivityEnterView.parentFragment;
        if (chatActivity != null) {
            TLRPC.Chat currentChat2 = chatActivity.getCurrentChat();
            if (chatActivityEnterView.parentFragment.getCurrentUser() != null || ((ChatObject.isChannel(currentChat2) && currentChat2.megagroup) || !ChatObject.isChannel(currentChat2))) {
                MessagesController.getNotificationsSettings(chatActivityEnterView.currentAccount).edit().putBoolean("silent_" + chatActivityEnterView.dialog_id, !z).commit();
            }
        }
        if (chatActivityEnterView.stickersExpanded) {
            chatActivityEnterView.setStickersExpanded(false, true, false);
            if (chatActivityEnterView.searchingType != 0 && (emojiView = chatActivityEnterView.emojiView) != null) {
                emojiView.closeSearch(false);
                chatActivityEnterView.emojiView.hideSearchKeyboard();
            }
        }
        if (z2 && chatActivityEnterView.showConfirmAlert(new Runnable() {
            @Override
            public final void run() {
                this.f$0.sendMessageInternal(z, i, i2, j, false);
            }
        })) {
            return;
        }
        chatActivityEnterView.dismissSendPreviewSent = true;
        if (chatActivityEnterView.videoToSendMessageObject != null) {
            chatActivityEnterView.delegate.needStartRecordVideo(4, z, i, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, j);
            SendButton sendButton = chatActivityEnterView.sendButton;
            chatActivityEnterView.effectId = 0L;
            sendButton.setEffect(0L);
            chatActivityEnterView.hideRecordedAudioPanel(true);
            chatActivityEnterView.checkSendButton(true);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.$r8$lambda$Y_MSQpLa93_s7Af_JF2foyloreM(this.f$0);
                }
            }, 100L);
            chatActivityEnterView.millisecondsRecorded = 0L;
            return;
        }
        if (chatActivityEnterView.audioToSend != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.audioToSendMessageObject) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            MediaController.getInstance().cleanRecording(false);
            MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.currentAccount);
            long j2 = chatActivityEnterView.dialog_id;
            ChatActivity chatActivity2 = chatActivityEnterView.parentFragment;
            mediaDataController.pushDraftVoiceMessage(j2, (chatActivity2 == null || !chatActivity2.isTopic) ? 0L : chatActivity2.getTopicId(), null);
            RecordedAudioPlayerView recordedAudioPlayerView = chatActivityEnterView.audioTimelineView;
            if (recordedAudioPlayerView != null && recordedAudioPlayerView.needsCut()) {
                chatActivityEnterView.audioTimelineView.setPlaying(false);
                String str = chatActivityEnterView.audioToSendPath + ".ogg";
                if (MediaController.cropOpusFile(chatActivityEnterView.audioToSendPath, str, chatActivityEnterView.audioTimelineView.getAudioLeftMs(), chatActivityEnterView.audioTimelineView.getAudioRightMs())) {
                    try {
                        new File(chatActivityEnterView.audioToSendPath).delete();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    try {
                        new File(str).renameTo(new File(chatActivityEnterView.audioToSendPath));
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    for (int i3 = 0; i3 < chatActivityEnterView.audioToSend.attributes.size(); i3++) {
                        TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.audioToSend.attributes.get(i3);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.audioToSendPath);
                            documentAttribute.duration = chatActivityEnterView.audioTimelineView.getNewDuration();
                            break;
                        }
                    }
                }
            }
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(chatActivityEnterView.audioToSend, null, chatActivityEnterView.audioToSendPath, chatActivityEnterView.dialog_id, chatActivityEnterView.replyingMessageObject, chatActivityEnterView.getThreadMessage(), null, null, null, null, z, i, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, null, null, false);
            ChatActivity chatActivity3 = chatActivityEnterView.parentFragment;
            sendMessageParamsOf.sendMessageChatArguments = chatActivity3 != null ? chatActivity3.getMessageChatSendParams() : null;
            sendMessageParamsOf.effect_id = chatActivityEnterView.effectId;
            sendMessageParamsOf.payStars = j;
            sendMessageParamsOf.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
            sendMessageParamsOf.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
            SendButton sendButton2 = chatActivityEnterView.sendButton;
            chatActivityEnterView.effectId = 0L;
            sendButton2.setEffect(0L);
            if (!chatActivityEnterView.delegate.hasForwardingMessages()) {
                MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
                sendAnimationData.fromPreview = System.currentTimeMillis() - chatActivityEnterView.sentFromPreview < 200;
                sendMessageParamsOf.sendAnimationData = sendAnimationData;
            }
            chatActivityEnterView.applyStoryToSendMessageParams(sendMessageParamsOf);
            SendMessagesHelper.getInstance(chatActivityEnterView.currentAccount).sendMessage(sendMessageParamsOf);
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate3 = chatActivityEnterView.delegate;
            if (chatActivityEnterViewDelegate3 != null) {
                chatActivityEnterViewDelegate3.onMessageSend(null, z, i, i2, j);
            }
            chatActivityEnterView.hideRecordedAudioPanel(true);
            chatActivityEnterView.checkSendButton(true);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.$r8$lambda$IMew2GHQC0hnR_gfrRD3TD8RGEI(this.f$0);
                }
            }, 100L);
            chatActivityEnterView.millisecondsRecorded = 0L;
            return;
        }
        if (chatActivityEnterView.richDraftActive && chatActivityEnterView.richDraftMessage != null) {
            chatActivityEnterView.sendRichDraft(z, i, i2, j);
            return;
        }
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        CharSequence textToUse = editTextCaption == null ? "" : editTextCaption.getTextToUse();
        ChatActivity chatActivity4 = chatActivityEnterView.parentFragment;
        if (chatActivity4 != null && (currentChat = chatActivity4.getCurrentChat()) != null && currentChat.slowmode_enabled && !ChatObject.hasAdminRights(currentChat)) {
            if (textToUse.length() > chatActivityEnterView.accountInstance.getMessagesController().getMaxMessageLength()) {
                AlertsCreator.showSimpleAlert(chatActivityEnterView.parentFragment, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendErrorTooLong", R.string.SlowmodeSendErrorTooLong), chatActivityEnterView.resourcesProvider);
                return;
            } else if (chatActivityEnterView.forceShowSendButton && textToUse.length() > 0) {
                AlertsCreator.showSimpleAlert(chatActivityEnterView.parentFragment, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError), chatActivityEnterView.resourcesProvider);
                return;
            }
        }
        final CharSequence charSequence = textToUse;
        if (checkPremiumAnimatedEmoji(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id, chatActivityEnterView.parentFragment, null, charSequence)) {
            return;
        }
        if (chatActivityEnterView.processSendingText(charSequence, z, i, i2, j)) {
            if (chatActivityEnterView.delegate.hasForwardingMessages() || ((i != 0 && !chatActivityEnterView.isInScheduleMode()) || chatActivityEnterView.isInScheduleMode())) {
                chatActivityEnterView2 = chatActivityEnterView;
                EditTextCaption editTextCaption2 = chatActivityEnterView2.messageEditText;
                if (editTextCaption2 != null) {
                    editTextCaption2.setText("");
                }
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate4 = chatActivityEnterView2.delegate;
                if (chatActivityEnterViewDelegate4 != null) {
                    chatActivityEnterViewDelegate4.onMessageSend(charSequence, z, i, i2, j);
                }
            } else {
                chatActivityEnterView.messageTransitionIsRunning = false;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        ChatActivityEnterView.$r8$lambda$FrWqrv66WA5JFSMmud2sXM8oWms(this.f$0, charSequence, z, i, i2, j);
                    }
                };
                chatActivityEnterView2 = chatActivityEnterView;
                chatActivityEnterView2.moveToSendStateRunnable = runnable;
                AndroidUtilities.runOnUIThread(runnable, 200L);
            }
            chatActivityEnterView2.lastTypingTimeSend = 0L;
        } else {
            chatActivityEnterView2 = chatActivityEnterView;
            if (chatActivityEnterView2.forceShowSendButton && (chatActivityEnterViewDelegate = chatActivityEnterView2.delegate) != null) {
                chatActivityEnterViewDelegate.onMessageSend(null, z, i, i2, j);
            }
        }
        chatActivityEnterView2.updateSendButtonPaid();
    }

    public static void $r8$lambda$Y_MSQpLa93_s7Af_JF2foyloreM(ChatActivityEnterView chatActivityEnterView) {
        RecordCircle recordCircle = chatActivityEnterView.recordCircle;
        if (recordCircle != null) {
            recordCircle.setSendButtonInvisible();
        }
    }

    public static void $r8$lambda$IMew2GHQC0hnR_gfrRD3TD8RGEI(ChatActivityEnterView chatActivityEnterView) {
        RecordCircle recordCircle = chatActivityEnterView.recordCircle;
        if (recordCircle != null) {
            recordCircle.setSendButtonInvisible();
        }
    }

    public static void $r8$lambda$FrWqrv66WA5JFSMmud2sXM8oWms(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z, int i, int i2, long j) {
        chatActivityEnterView.moveToSendStateRunnable = null;
        chatActivityEnterView.hideTopView(true);
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setText("");
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onMessageSend(charSequence, z, i, i2, j);
        }
    }

    public static void $r8$lambda$WEv5PlvURjFgKsVM31d_nTfGKms(ChatActivityEnterView chatActivityEnterView, boolean z, int i, int i2, Long l) {
        chatActivityEnterView.getClass();
        chatActivityEnterView.sendMessageInternal(z, i, i2, l.longValue(), false);
    }

    public static boolean checkPremiumAnimatedEmoji(int i, long j, final BaseFragment baseFragment, FrameLayout frameLayout, CharSequence charSequence) {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int i2;
        int i3;
        boolean z;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i4;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList4;
        ArrayList<TLRPC.Document> arrayList5;
        if (charSequence != null && baseFragment != null && !UserConfig.getInstance(i).isPremium() && UserConfig.getInstance(i).getClientUserId() != j && (charSequence instanceof Spanned) && (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class)) != null) {
            int i5 = 0;
            while (i5 < animatedEmojiSpanArr.length) {
                AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i5];
                if (animatedEmojiSpan != null) {
                    TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                    if (documentFindDocument == null) {
                        i3 = i;
                        documentFindDocument = AnimatedEmojiDrawable.findDocument(i3, animatedEmojiSpan.getDocumentId());
                    } else {
                        i3 = i;
                    }
                    long documentId = animatedEmojiSpanArr[i5].getDocumentId();
                    if (documentFindDocument != null) {
                        i2 = i5;
                        z = false;
                        break;
                    }
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i3).getStickerSets(5);
                    int size = stickerSets.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            i2 = i5;
                            z = false;
                            break;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i6);
                        i6++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        if (tL_messages_stickerSet2 != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty()) {
                            ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet2.documents;
                            int size2 = arrayList6.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size2) {
                                    i2 = i5;
                                    arrayList4 = stickerSets;
                                    z = false;
                                    break;
                                }
                                TLRPC.Document document = arrayList6.get(i7);
                                i7++;
                                z = false;
                                TLRPC.Document document2 = document;
                                i2 = i5;
                                arrayList4 = stickerSets;
                                if (document2.id == documentId) {
                                    documentFindDocument = document2;
                                    break;
                                }
                                stickerSets = arrayList4;
                                i5 = i2;
                            }
                        } else {
                            i2 = i5;
                            arrayList4 = stickerSets;
                            z = false;
                            break;
                        }
                        if (documentFindDocument != null) {
                            break;
                        }
                        stickerSets = arrayList4;
                        i5 = i2;
                    }
                    if (documentFindDocument == null) {
                        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i3).getFeaturedEmojiSets();
                        int size3 = featuredEmojiSets.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i8);
                            i8++;
                            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                            if (stickerSetCovered2 != null && (arrayList3 = stickerSetCovered2.covers) != null && !arrayList3.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2.covers;
                                int size4 = arrayList7.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size4) {
                                        arrayList = featuredEmojiSets;
                                        i4 = size3;
                                        break;
                                    }
                                    TLRPC.Document document3 = arrayList7.get(i9);
                                    i9++;
                                    TLRPC.Document document4 = document3;
                                    arrayList = featuredEmojiSets;
                                    i4 = size3;
                                    if (document4.id == documentId) {
                                        documentFindDocument = document4;
                                        break;
                                    }
                                    featuredEmojiSets = arrayList;
                                    size3 = i4;
                                }
                            } else {
                                arrayList = featuredEmojiSets;
                                i4 = size3;
                                break;
                            }
                            if (documentFindDocument != null) {
                                break;
                            }
                            if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents;
                            } else if (!(stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) || stickerSetCovered2.set == null) {
                                arrayList2 = null;
                            } else {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i3).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                                if (stickerSet == null || (arrayList2 = stickerSet.documents) == null) {
                                    arrayList2 = null;
                                }
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                int size5 = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size5) {
                                    TLRPC.Document document5 = arrayList2.get(i10);
                                    i10++;
                                    TLRPC.Document document6 = document5;
                                    if (document6.id == documentId) {
                                        documentFindDocument = document6;
                                        break;
                                    }
                                }
                            }
                            if (documentFindDocument != null) {
                                break;
                            }
                            featuredEmojiSets = arrayList;
                            size3 = i4;
                        }
                    }
                    if (documentFindDocument != null && (chatFull = MessagesController.getInstance(i3).getChatFull(-j)) != null && chatFull.emojiset != null && (groupStickerSetById = MediaDataController.getInstance(i3).getGroupStickerSetById(chatFull.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = groupStickerSetById.documents;
                        int size6 = arrayList8.size();
                        int i11 = 0;
                        while (i11 < size6) {
                            TLRPC.Document document7 = arrayList8.get(i11);
                            i11++;
                            if (document7.id == documentId) {
                                return z;
                            }
                        }
                    }
                    if (documentFindDocument == null || !MessageObject.isFreeEmoji(documentFindDocument)) {
                        BulletinFactory.of(baseFragment).createEmojiBulletin(documentFindDocument, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiHint", R.string.UnlockPremiumEmojiHint)), LocaleController.getString("PremiumMore", R.string.PremiumMore), new Runnable() {
                            @Override
                            public final void run() {
                                ChatActivityEnterView.$r8$lambda$fVoCy6Losn6wugtWn6tSGWORIMI(baseFragment);
                            }
                        }).show();
                        return true;
                    }
                } else {
                    i2 = i5;
                }
                i5 = i2 + 1;
            }
        }
        return false;
    }

    public static void $r8$lambda$fVoCy6Losn6wugtWn6tSGWORIMI(BaseFragment baseFragment) {
        if (baseFragment != null) {
            new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
        } else if (baseFragment.getContext() instanceof LaunchActivity) {
            ((LaunchActivity) baseFragment.getContext()).presentFragment(new PremiumPreviewFragment(null));
        }
    }

    public void showCaptionLimitBulletin() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null || !ChatObject.isChannelAndNotMegaGroup(chatActivity.getCurrentChat())) {
            return;
        }
        BulletinFactory.of(this.parentFragment).createCaptionLimitBulletin(MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium, new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$k2Os3eUTFTcJdZv36LSBuewpCOo(this.f$0);
            }
        }).show();
    }

    public static void $r8$lambda$k2Os3eUTFTcJdZv36LSBuewpCOo(ChatActivityEnterView chatActivityEnterView) {
        ChatActivity chatActivity = chatActivityEnterView.parentFragment;
        if (chatActivity != null) {
            chatActivity.presentFragment(new PremiumPreviewFragment("caption_limit"));
        }
    }

    private static class BusinessLinkPresetMessage {
        public ArrayList entities;
        public String text;

        private BusinessLinkPresetMessage() {
        }
    }

    private BusinessLinkPresetMessage calculateBusinessLinkPresetMessage() {
        EditTextCaption editTextCaption = this.messageEditText;
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(editTextCaption == null ? "" : editTextCaption.getTextToUse())};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i = 0; i < size; i++) {
            TLRPC.MessageEntity messageEntity = entities.get(i);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        BusinessLinkPresetMessage businessLinkPresetMessage = new BusinessLinkPresetMessage();
        businessLinkPresetMessage.text = charSequence.toString();
        businessLinkPresetMessage.entities = entities;
        return businessLinkPresetMessage;
    }

    public boolean businessLinkHasChanges() {
        BusinessLinkPresetMessage businessLinkPresetMessageCalculateBusinessLinkPresetMessage = calculateBusinessLinkPresetMessage();
        return (TextUtils.equals(businessLinkPresetMessageCalculateBusinessLinkPresetMessage.text, this.lastSavedBusinessLinkMessage.text) && MediaDataController.entitiesEqual((ArrayList<TLRPC.MessageEntity>) this.lastSavedBusinessLinkMessage.entities, (ArrayList<TLRPC.MessageEntity>) businessLinkPresetMessageCalculateBusinessLinkPresetMessage.entities)) ? false : true;
    }

    public void saveBusinessLink() {
        if (isEditingBusinessLink()) {
            if (this.currentLimit - this.codePointCount < 0) {
                NumberTextView numberTextView = this.captionLimitView;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.captionLimitView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            BusinessLinkPresetMessage businessLinkPresetMessageCalculateBusinessLinkPresetMessage = calculateBusinessLinkPresetMessage();
            this.lastSavedBusinessLinkMessage = businessLinkPresetMessageCalculateBusinessLinkPresetMessage;
            BusinessLinksController.getInstance(this.currentAccount).editLinkMessage(this.editingBusinessLink.link, businessLinkPresetMessageCalculateBusinessLinkPresetMessage.text, businessLinkPresetMessageCalculateBusinessLinkPresetMessage.entities, new Runnable() {
                @Override
                public final void run() {
                    BulletinFactory.of(this.f$0.parentFragment).createSuccessBulletin(LocaleController.getString(R.string.BusinessLinkSaved)).show();
                }
            });
        }
    }

    public void doneEditingMessage() {
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams messageSuggestionParamsOf;
        int i;
        MessageSuggestionParams messageSuggestionParamsOf2;
        MessageObject messageObject = this.editingMessageObject;
        if (messageObject == null) {
            return;
        }
        if (messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.editingMessageObject.getDialogId())) {
            ChatActivity chatActivity = this.parentFragment;
            if (chatActivity == null || (messageSuggestionParamsOf2 = chatActivity.messageSuggestionParams) == null) {
                messageSuggestionParamsOf2 = MessageSuggestionParams.of(this.editingMessageObject.messageOwner.suggested_post);
            }
            if (!StarsController.isEnoughAmount(this.currentAccount, messageSuggestionParamsOf2.amount)) {
                ChatActivity chatActivity2 = this.parentFragment;
                if (chatActivity2 != null) {
                    chatActivity2.showSuggestionOfferForEditMessage(messageSuggestionParamsOf2);
                    return;
                }
                return;
            }
        }
        if (this.currentLimit - this.codePointCount < 0) {
            NumberTextView numberTextView = this.captionLimitView;
            if (numberTextView != null) {
                AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                try {
                    this.captionLimitView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium <= this.codePointCount) {
                return;
            }
            showCaptionLimitBulletin();
            return;
        }
        if (this.searchingType != 0) {
            setSearchingTypeInternal(0, true);
            this.emojiView.closeSearch(false);
            if (this.stickersExpanded) {
                setStickersExpanded(false, true, false);
                this.waitingForKeyboardOpenAfterAnimation = true;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatActivityEnterView.$r8$lambda$3a50_DgmJgG3JQ8TkAuq5pOLRlQ(this.f$0);
                    }
                }, 200L);
            }
        }
        EditTextCaption editTextCaption = this.messageEditText;
        CharSequence textToUse = editTextCaption == null ? "" : editTextCaption.getTextToUse();
        MessageObject messageObject2 = this.editingMessageObject;
        if (messageObject2 == null || messageObject2.type != 19) {
            textToUse = AndroidUtilities.getTrimmedString(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.editingMessageObject.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                AndroidUtilities.shakeViewSpring(this.messageEditText, -3.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
        }
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, supportsSendingNewEntities());
        if (!TextUtils.equals(charSequenceArr[0], this.editingMessageObject.messageText) || ((entities != null && !entities.isEmpty()) || !this.editingMessageObject.messageOwner.entities.isEmpty() || (this.editingMessageObject.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
            MessageObject messageObject3 = this.editingMessageObject;
            messageObject3.editingMessage = charSequenceArr[0];
            messageObject3.editingMessageEntities = entities;
            messageObject3.editingMessageSearchWebPage = this.messageWebPageSearch;
            ChatActivity chatActivity3 = this.parentFragment;
            if (chatActivity3 != null && chatActivity3.getCurrentChat() != null && (((i = this.editingMessageObject.type) == 0 || i == 19) && !ChatObject.canSendEmbed(this.parentFragment.getCurrentChat()))) {
                MessageObject messageObject4 = this.editingMessageObject;
                messageObject4.editingMessageSearchWebPage = false;
                TLRPC.Message message = messageObject4.messageOwner;
                message.flags &= -513;
                message.media = null;
            } else {
                ChatActivity chatActivity4 = this.parentFragment;
                if (chatActivity4 != null && (messagePreviewParams = chatActivity4.messagePreviewParams) != null) {
                    if (chatActivity4.foundWebPage instanceof TLRPC.TL_webPagePending) {
                        MessageObject messageObject5 = this.editingMessageObject;
                        messageObject5.editingMessageSearchWebPage = false;
                        int i2 = messageObject5.type;
                        if (i2 == 0 || i2 == 19) {
                            messageObject5.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                            this.editingMessageObject.messageOwner.flags |= 512;
                        }
                    } else if (messagePreviewParams.webpage != null) {
                        MessageObject messageObject6 = this.editingMessageObject;
                        messageObject6.editingMessageSearchWebPage = false;
                        TLRPC.Message message2 = messageObject6.messageOwner;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.editingMessageObject.messageOwner.media.webpage = this.parentFragment.messagePreviewParams.webpage;
                    } else {
                        MessageObject messageObject7 = this.editingMessageObject;
                        messageObject7.editingMessageSearchWebPage = false;
                        int i3 = messageObject7.type;
                        if (i3 == 0 || i3 == 19) {
                            TLRPC.Message message3 = messageObject7.messageOwner;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.editingMessageObject.messageOwner;
                    MessagePreviewParams messagePreviewParams2 = this.parentFragment.messagePreviewParams;
                    message4.invert_media = messagePreviewParams2.webpageTop;
                    if (messagePreviewParams2.hasMedia) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z = messagePreviewParams2.webpageSmall;
                            messageMedia2.force_small_media = z;
                            messageMedia2.force_large_media = true ^ z;
                        }
                    }
                } else {
                    MessageObject messageObject8 = this.editingMessageObject;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i4 = messageObject8.type;
                    if (i4 == 0 || i4 == 19) {
                        TLRPC.Message message5 = messageObject8.messageOwner;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
            }
            if (this.editingMessageObject.needResendWhenEdit()) {
                SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(this.editingMessageObject.editingMessage.toString(), this.editingMessageObject.getDialogId());
                ChatActivity chatActivity5 = this.parentFragment;
                if (chatActivity5 == null || (messageSuggestionParamsOf = chatActivity5.messageSuggestionParams) == null) {
                    messageSuggestionParamsOf = MessageSuggestionParams.of(this.editingMessageObject.messageOwner.suggested_post);
                }
                sendMessageParamsOf.suggestionParams = messageSuggestionParamsOf;
                sendMessageParamsOf.monoForumPeer = DialogObject.getPeerDialogId(this.editingMessageObject.messageOwner.saved_peer_id);
                sendMessageParamsOf.hasMediaSpoilers = this.editingMessageObject.hasMediaSpoilers();
                MessageObject messageObject9 = this.editingMessageObject;
                sendMessageParamsOf.replyToMsg = messageObject9;
                sendMessageParamsOf.parentObject = messageObject9;
                if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                    sendMessageParamsOf.document = (TLRPC.TL_document) this.editingMessageObject.getDocument();
                    sendMessageParamsOf.caption = sendMessageParamsOf.message;
                    sendMessageParamsOf.message = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.editingMessageObject.messageOwner.media;
                    if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                        TLRPC.Photo photo = messageMedia3.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            sendMessageParamsOf.photo = (TLRPC.TL_photo) photo;
                        } else {
                            sendMessageParamsOf.location = messageMedia3;
                        }
                        sendMessageParamsOf.caption = sendMessageParamsOf.message;
                        sendMessageParamsOf.message = null;
                    }
                }
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
            } else {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.currentAccount);
                MessageObject messageObject10 = this.editingMessageObject;
                sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
            }
        }
        setEditingMessageObject(null, null, false);
    }

    public static void $r8$lambda$3a50_DgmJgG3JQ8TkAuq5pOLRlQ(ChatActivityEnterView chatActivityEnterView) {
        chatActivityEnterView.waitingForKeyboardOpenAfterAnimation = false;
        chatActivityEnterView.openKeyboardInternal();
    }

    public boolean processSendingText(CharSequence charSequence, boolean z, int i, int i2, long j) {
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        MessageObject.SendAnimationData sendAnimationData;
        MessageObject.SendAnimationData sendAnimationData2;
        MessageObject threadMessage;
        MessageObject messageObject;
        SendMessagesHelper.SendMessageParams sendMessageParamsOf;
        ChatActivity chatActivity;
        SendMessageChatArguments messageChatSendParams;
        ChatActivity chatActivity2;
        boolean z2;
        TLRPC.WebPage webPage;
        ChatActivity chatActivity3;
        boolean z3;
        boolean z4;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams messagePreviewParams2;
        ChatActivity chatActivity4;
        MessagePreviewParams messagePreviewParams3;
        MessagePreviewParams messagePreviewParams4;
        MessageObject messageObject2;
        ChatActivity chatActivity5;
        ChatActivity chatActivity6;
        ChatActivity.ReplyQuote replyQuote = this.replyingQuote;
        if (replyQuote != null && (chatActivity6 = this.parentFragment) != null && replyQuote.outdated) {
            chatActivity6.showQuoteMessageUpdate();
            return false;
        }
        int[] iArr = new int[1];
        CharSequence trimmedString = charSequence;
        Emoji.parseEmojis(trimmedString, iArr);
        boolean z5 = iArr[0] > 0;
        if (!z5) {
            trimmedString = AndroidUtilities.getTrimmedString(trimmedString);
        }
        boolean zSupportsSendingNewEntities = supportsSendingNewEntities();
        int maxMessageLength = this.accountInstance.getMessagesController().getMaxMessageLength();
        if (trimmedString.length() == 0) {
            return false;
        }
        if (this.delegate != null && (chatActivity5 = this.parentFragment) != null) {
            if ((i != 0) == chatActivity5.isInScheduleMode()) {
                this.delegate.prepareMessageSending();
            }
        }
        int i7 = 0;
        do {
            int i8 = i7 + maxMessageLength;
            if (trimmedString.length() > i8) {
                i3 = i8 - 1;
                int i9 = 0;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                while (true) {
                    if (i3 > i7 && i9 < 300) {
                        char cCharAt = trimmedString.charAt(i3);
                        char cCharAt2 = i3 > 0 ? trimmedString.charAt(i3 - 1) : ' ';
                        c = 0;
                        if (cCharAt == '\n' && cCharAt2 == '\n') {
                            break;
                        }
                        if (cCharAt == '\n') {
                            i6 = i3;
                        } else if (i4 < 0 && Character.isWhitespace(cCharAt) && cCharAt2 == '.') {
                            i4 = i3;
                        } else if (i5 < 0 && Character.isWhitespace(cCharAt)) {
                            i5 = i3;
                        }
                        i3--;
                        i9++;
                    } else {
                        c = 0;
                        i3 = -1;
                        break;
                    }
                }
            } else {
                c = 0;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
            }
            int iMin = Math.min(i8, trimmedString.length());
            if (i3 <= 0) {
                if (i6 > 0) {
                    i3 = i6;
                } else if (i4 > 0) {
                    i3 = i4;
                } else {
                    i3 = i5 > 0 ? i5 : iMin;
                }
            }
            CharSequence charSequenceSubSequence = trimmedString.subSequence(i7, i3);
            if (!z5) {
                charSequenceSubSequence = AndroidUtilities.getTrimmedString(charSequenceSubSequence);
            }
            CharSequence[] charSequenceArr = new CharSequence[1];
            charSequenceArr[c] = charSequenceSubSequence;
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, zSupportsSendingNewEntities);
            if (!this.delegate.hasForwardingMessages()) {
                sendAnimationData2 = new MessageObject.SendAnimationData();
                sendAnimationData2.fromPreview = System.currentTimeMillis() - this.sentFromPreview < 200;
                float fDp = AndroidUtilities.dp(22.0f);
                sendAnimationData2.height = fDp;
                sendAnimationData2.width = fDp;
                EditTextCaption editTextCaption = this.messageEditText;
                if (editTextCaption != null) {
                    editTextCaption.getLocationInWindow(this.location);
                    sendAnimationData2.x = this.location[c] + AndroidUtilities.dp(11.0f);
                    sendAnimationData2.y = this.location[1] + AndroidUtilities.dp(19.0f);
                } else {
                    sendAnimationData2.x = AndroidUtilities.dp(55.0f);
                    sendAnimationData2.y = AndroidUtilities.displaySize.y - AndroidUtilities.dp(19.0f);
                }
            } else {
                if (this.messageSendPreview != null) {
                    sendAnimationData2 = new MessageObject.SendAnimationData();
                    sendAnimationData2.fromPreview = System.currentTimeMillis() - this.sentFromPreview < 200;
                } else {
                    sendAnimationData = null;
                }
                boolean zCheckUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(trimmedString);
                threadMessage = getThreadMessage();
                if (threadMessage == null || (messageObject2 = this.replyingTopMessage) == null) {
                    messageObject = threadMessage;
                } else {
                    messageObject = messageObject2;
                }
                sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c].toString(), this.dialog_id, this.replyingMessageObject, messageObject, this.messageWebPage, this.messageWebPageSearch, entities, null, null, z, i, i2, sendAnimationData, zCheckUpdateStickersOrder);
                chatActivity = this.parentFragment;
                if (chatActivity != null) {
                    messageChatSendParams = chatActivity.getMessageChatSendParams();
                } else {
                    messageChatSendParams = null;
                }
                sendMessageParamsOf.sendMessageChatArguments = messageChatSendParams;
                sendMessageParamsOf.effect_id = this.effectId;
                sendMessageParamsOf.payStars = j;
                sendMessageParamsOf.monoForumPeer = getSendMonoForumPeerId();
                sendMessageParamsOf.suggestionParams = getSendMessageSuggestionParams();
                SendButton sendButton = this.sendButton;
                this.effectId = 0L;
                sendButton.setEffect(0L);
                applyStoryToSendMessageParams(sendMessageParamsOf);
                chatActivity2 = this.parentFragment;
                if (chatActivity2 == null && (messagePreviewParams4 = chatActivity2.messagePreviewParams) != null && messagePreviewParams4.webpageTop) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sendMessageParamsOf.invert_media = z2;
                if (chatActivity2 == null && chatActivity2.getCurrentChat() != null && !ChatObject.canSendEmbed(this.parentFragment.getCurrentChat())) {
                    sendMessageParamsOf.searchLinks = false;
                    sendMessageParamsOf.mediaWebPage = null;
                } else {
                    webPage = this.messageWebPage;
                    if (webPage instanceof TLRPC.TL_webPagePending) {
                        sendMessageParamsOf.searchLinks = true;
                        sendMessageParamsOf.mediaWebPage = null;
                    } else if (webPage != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        sendMessageParamsOf.mediaWebPage = tL_messageMediaWebPage;
                        tL_messageMediaWebPage.webpage = this.messageWebPage;
                        chatActivity3 = this.parentFragment;
                        if (chatActivity3 != null || (messagePreviewParams2 = chatActivity3.messagePreviewParams) == null || messagePreviewParams2.webpageSmall) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        tL_messageMediaWebPage.force_large_media = z3;
                        if (chatActivity3 == null && (messagePreviewParams = chatActivity3.messagePreviewParams) != null && messagePreviewParams.webpageSmall) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        tL_messageMediaWebPage.force_small_media = z4;
                    }
                }
                chatActivity4 = this.parentFragment;
                if (chatActivity4 != null) {
                    chatActivity4.editingMessageObject = null;
                    chatActivity4.foundWebPage = null;
                    messagePreviewParams3 = chatActivity4.messagePreviewParams;
                    if (messagePreviewParams3 != null) {
                        messagePreviewParams3.updateLink(this.currentAccount, null, "", null, null, null);
                    }
                    setWebPage(null, true);
                    this.parentFragment.fallbackFieldPanel();
                }
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
                i7 = i3 + 1;
            }
            sendAnimationData = sendAnimationData2;
            boolean zCheckUpdateStickersOrder2 = SendMessagesHelper.checkUpdateStickersOrder(trimmedString);
            threadMessage = getThreadMessage();
            if (threadMessage == null) {
                messageObject = threadMessage;
            } else {
                messageObject = threadMessage;
            }
            sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c].toString(), this.dialog_id, this.replyingMessageObject, messageObject, this.messageWebPage, this.messageWebPageSearch, entities, null, null, z, i, i2, sendAnimationData, zCheckUpdateStickersOrder2);
            chatActivity = this.parentFragment;
            if (chatActivity != null) {
                messageChatSendParams = chatActivity.getMessageChatSendParams();
            } else {
                messageChatSendParams = null;
            }
            sendMessageParamsOf.sendMessageChatArguments = messageChatSendParams;
            sendMessageParamsOf.effect_id = this.effectId;
            sendMessageParamsOf.payStars = j;
            sendMessageParamsOf.monoForumPeer = getSendMonoForumPeerId();
            sendMessageParamsOf.suggestionParams = getSendMessageSuggestionParams();
            SendButton sendButton2 = this.sendButton;
            this.effectId = 0L;
            sendButton2.setEffect(0L);
            applyStoryToSendMessageParams(sendMessageParamsOf);
            chatActivity2 = this.parentFragment;
            if (chatActivity2 == null) {
                z2 = false;
            } else {
                z2 = false;
            }
            sendMessageParamsOf.invert_media = z2;
            if (chatActivity2 == null) {
                webPage = this.messageWebPage;
                if (webPage instanceof TLRPC.TL_webPagePending) {
                    sendMessageParamsOf.searchLinks = true;
                    sendMessageParamsOf.mediaWebPage = null;
                } else if (webPage != null) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage2 = new TLRPC.TL_messageMediaWebPage();
                    sendMessageParamsOf.mediaWebPage = tL_messageMediaWebPage2;
                    tL_messageMediaWebPage2.webpage = this.messageWebPage;
                    chatActivity3 = this.parentFragment;
                    if (chatActivity3 != null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    tL_messageMediaWebPage2.force_large_media = z3;
                    if (chatActivity3 == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    tL_messageMediaWebPage2.force_small_media = z4;
                }
            } else {
                webPage = this.messageWebPage;
                if (webPage instanceof TLRPC.TL_webPagePending) {
                    sendMessageParamsOf.searchLinks = true;
                    sendMessageParamsOf.mediaWebPage = null;
                } else if (webPage != null) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage3 = new TLRPC.TL_messageMediaWebPage();
                    sendMessageParamsOf.mediaWebPage = tL_messageMediaWebPage3;
                    tL_messageMediaWebPage3.webpage = this.messageWebPage;
                    chatActivity3 = this.parentFragment;
                    if (chatActivity3 != null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    tL_messageMediaWebPage3.force_large_media = z3;
                    if (chatActivity3 == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    tL_messageMediaWebPage3.force_small_media = z4;
                }
            }
            chatActivity4 = this.parentFragment;
            if (chatActivity4 != null) {
                chatActivity4.editingMessageObject = null;
                chatActivity4.foundWebPage = null;
                messagePreviewParams3 = chatActivity4.messagePreviewParams;
                if (messagePreviewParams3 != null) {
                    messagePreviewParams3.updateLink(this.currentAccount, null, "", null, null, null);
                }
                setWebPage(null, true);
                this.parentFragment.fallbackFieldPanel();
            }
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
            i7 = i3 + 1;
        } while (i3 != trimmedString.length());
        return true;
    }

    public long getSendMonoForumPeerId() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            return chatActivity.getSendMonoForumPeerId();
        }
        return 0L;
    }

    public MessageSuggestionParams getSendMessageSuggestionParams() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            return chatActivity.getSendMessageSuggestionParams();
        }
        return null;
    }

    private void applyStoryToSendMessageParams(SendMessagesHelper.SendMessageParams sendMessageParams) {
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            sendMessageParams.replyToStoryItem = chatActivityEnterViewDelegate.getReplyToStory();
            sendMessageParams.replyQuote = this.delegate.getReplyQuote();
        }
    }

    private boolean supportsSendingNewEntities() {
        ChatActivity chatActivity = this.parentFragment;
        TLRPC.EncryptedChat currentEncryptedChat = chatActivity != null ? chatActivity.getCurrentEncryptedChat() : null;
        return currentEncryptedChat == null || AndroidUtilities.getPeerLayerVersion(currentEncryptedChat.layer) >= 101;
    }

    private boolean isSlowModeIgnored() {
        return isInScheduleMode() || this.animatorEphemeralMessageVisibility.getValue();
    }

    public void checkSendButton(boolean z) {
        int themedColor;
        float f;
        int i;
        AnimatorSet animatorSet;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        int i2;
        boolean z2 = true;
        if (this.editingMessageObject != null || this.recordingAudioVideo) {
            return;
        }
        boolean z3 = this.isPaused ? false : z;
        updateSendButtonPaid();
        EditTextCaption editTextCaption = this.messageEditText;
        CharSequence trimmedString = editTextCaption == null ? "" : AndroidUtilities.getTrimmedString(editTextCaption.getTextToUse());
        int i3 = this.slowModeTimer;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        if (i3 > 0 && i3 != Integer.MAX_VALUE && !isSlowModeIgnored()) {
            if (this.slowModeButton.getVisibility() != 0) {
                if (z3) {
                    if (this.runningAnimationType == 5) {
                        return;
                    }
                    AnimatorSet animatorSet2 = this.runningAnimation;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.runningAnimation = null;
                    }
                    AnimatorSet animatorSet3 = this.runningAnimation2;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.runningAnimation2 = null;
                    }
                    ViewPropertyAnimator viewPropertyAnimator = this.attachButtonAnimator;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.attachButtonAnimator = null;
                    }
                    if (this.attachLayout != null) {
                        this.runningAnimation2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_ALPHA, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) property, 0.5f));
                        this.scheduleButtonHidden = false;
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
                        boolean z4 = chatActivityEnterViewDelegate != null && chatActivityEnterViewDelegate.hasScheduledMessages();
                        if (z4) {
                            createScheduledButton();
                        }
                        ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout = this.sideButtons;
                        if (chatActivitySideControlsButtonsLayout != null) {
                            chatActivitySideControlsButtonsLayout.showButton(0, false, true);
                        }
                        ImageView imageView5 = this.attachButton;
                        if (imageView5 != null) {
                            this.attachButtonAlpha = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(imageView5, (Property<ImageView, Float>) property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property, 0.5f));
                            arrayList.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 0.5f));
                        }
                        ImageView imageView6 = this.scheduledButton;
                        if (imageView6 != null) {
                            imageView6.setScaleY(1.0f);
                            if (z4) {
                                this.scheduledButton.setVisibility(0);
                                this.scheduledButton.setTag(1);
                                this.scheduledButton.setPivotX(AndroidUtilities.dp(44.0f));
                                arrayList.add(animateScheduledTranslationX(0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) property, 1.0f));
                            } else {
                                this.scheduledButton.setTranslationX(0.0f);
                                this.scheduledButton.setAlpha(1.0f);
                                this.scheduledButton.setScaleX(1.0f);
                            }
                        }
                        this.runningAnimation2.playTogether(arrayList);
                        this.runningAnimation2.setDuration(100L);
                        this.runningAnimation2.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (animator.equals(ChatActivityEnterView.this.runningAnimation2)) {
                                    ChatActivityEnterView.this.attachLayout.setVisibility(8);
                                    ChatActivityEnterView.this.runningAnimation2 = null;
                                }
                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {
                                if (animator.equals(ChatActivityEnterView.this.runningAnimation2)) {
                                    ChatActivityEnterView.this.runningAnimation2 = null;
                                }
                            }
                        });
                        this.runningAnimation2.start();
                        updateFieldRight(0);
                        if (this.delegate != null && getVisibility() == 0) {
                            this.delegate.onAttachButtonHidden();
                        }
                    }
                    this.runningAnimationType = 5;
                    this.runningAnimation = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (this.audioVideoButtonContainer.getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property3, 0.0f));
                    }
                    ImageView imageView7 = this.expandStickersButton;
                    if (imageView7 != null && imageView7.getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property3, 0.0f));
                    }
                    if (getSendButtonInternal().getVisibility() == 0) {
                        arrayList2.add(animateSendButton(false));
                    }
                    if (this.cancelBotButton.getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property3, 0.0f));
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property, 1.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property2, 1.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property3, 1.0f));
                    setSlowModeButtonVisible(true);
                    this.runningAnimation.playTogether(arrayList2);
                    this.runningAnimation.setDuration(220L);
                    this.runningAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.runningAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(ChatActivityEnterView.this.runningAnimation)) {
                                ChatActivityEnterView.this.getSendButtonInternal().setVisibility(8);
                                ChatActivityEnterView.this.cancelBotButton.setVisibility(8);
                                ChatActivityEnterView.this.audioVideoButtonContainer.setVisibility(8);
                                if (ChatActivityEnterView.this.expandStickersButton != null) {
                                    ChatActivityEnterView.this.expandStickersButton.setVisibility(8);
                                }
                                ChatActivityEnterView.this.runningAnimation = null;
                                ChatActivityEnterView.this.runningAnimationType = 0;
                            }
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {
                            if (animator.equals(ChatActivityEnterView.this.runningAnimation)) {
                                ChatActivityEnterView.this.runningAnimation = null;
                            }
                        }
                    });
                    this.runningAnimation.start();
                } else {
                    this.slowModeButton.setScaleX(1.0f);
                    this.slowModeButton.setScaleY(1.0f);
                    this.slowModeButton.setAlpha(1.0f);
                    setSlowModeButtonVisible(true);
                    this.audioVideoSendButton.setScaleX(0.1f);
                    this.audioVideoSendButton.setScaleY(0.1f);
                    this.audioVideoSendButton.setAlpha(0.0f);
                    this.audioVideoButtonContainer.setVisibility(8);
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    this.cancelBotButton.setScaleX(0.1f);
                    this.cancelBotButton.setScaleY(0.1f);
                    this.cancelBotButton.setAlpha(0.0f);
                    this.cancelBotButton.setVisibility(8);
                    ImageView imageView8 = this.expandStickersButton;
                    if (imageView8 == null || imageView8.getVisibility() != 0) {
                        i2 = 8;
                    } else {
                        this.expandStickersButton.setScaleX(0.1f);
                        this.expandStickersButton.setScaleY(0.1f);
                        this.expandStickersButton.setAlpha(0.0f);
                        i2 = 8;
                        this.expandStickersButton.setVisibility(8);
                    }
                    LinearLayout linearLayout = this.attachLayout;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(i2);
                        if (this.delegate != null && getVisibility() == 0) {
                            this.delegate.onAttachButtonHidden();
                        }
                        updateFieldRight(0);
                        ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout2 = this.sideButtons;
                        if (chatActivitySideControlsButtonsLayout2 != null) {
                            chatActivitySideControlsButtonsLayout2.showButton(0, false, false);
                        }
                        ImageView imageView9 = this.attachButton;
                        if (imageView9 != null) {
                            this.attachButtonAlpha = 0.0f;
                            imageView9.setAlpha(0.0f);
                            this.attachButton.setScaleX(0.5f);
                            this.attachButton.setScaleY(0.5f);
                        }
                    }
                    this.scheduleButtonHidden = false;
                    ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = this.delegate;
                    boolean z5 = chatActivityEnterViewDelegate2 != null && chatActivityEnterViewDelegate2.hasScheduledMessages();
                    if (z5) {
                        createScheduledButton();
                    }
                    ImageView imageView10 = this.scheduledButton;
                    if (imageView10 != null) {
                        if (z5) {
                            imageView10.setVisibility(0);
                            this.scheduledButton.setTag(1);
                        }
                        this.scheduledButton.setTranslationX(0.0f);
                        this.scheduledButton.setAlpha(1.0f);
                        this.scheduledButton.setScaleX(1.0f);
                        this.scheduledButton.setScaleY(1.0f);
                    }
                }
            }
        } else {
            if (trimmedString.length() > 0 || this.forceShowSendButton || this.richDraftActive || this.audioToSend != null || this.videoToSendMessageObject != null || ((this.slowModeTimer == Integer.MAX_VALUE && !isSlowModeIgnored()) || ((this.isLiveComment && getStarsPrice() > 0) || this.animatorIsBlockedByStreaming.getValue()))) {
                EditTextCaption editTextCaption2 = this.messageEditText;
                final String caption = editTextCaption2 == null ? null : editTextCaption2.getCaption();
                boolean z6 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((imageView2 = this.expandStickersButton) != null && imageView2.getVisibility() == 0));
                boolean z7 = caption == null && (this.cancelBotButton.getVisibility() == 0 || ((imageView = this.expandStickersButton) != null && imageView.getVisibility() == 0));
                if (this.slowModeTimer == Integer.MAX_VALUE && !isSlowModeIgnored()) {
                    themedColor = getThemedColor(Theme.key_glass_defaultIcon);
                } else {
                    themedColor = getThemedColor(Theme.key_chat_messagePanelSend);
                }
                EditTextCaption editTextCaption3 = this.messageEditText;
                boolean z8 = (editTextCaption3 != null && (!TextUtils.isEmpty(editTextCaption3.getCaption()) || this.messageEditText.isNearRightCaption(AndroidUtilities.dp(44.0f)))) || LocaleController.isRTL;
                if (themedColor != this.sendButtonBackgroundColor) {
                    this.sendButtonBackgroundColor = themedColor;
                    f = 0.0f;
                    Theme.setSelectorDrawableColor(this.sendButton.getBackground(), Color.argb(24, Color.red(themedColor), Color.green(themedColor), Color.blue(themedColor)), true);
                } else {
                    f = 0.0f;
                }
                if (this.audioVideoButtonContainer.getVisibility() != 0 && this.slowModeButton.getVisibility() != 0 && !z6 && !z7 && !this.animatorIsBlockedByStreaming.getValue()) {
                    ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout3 = this.sideButtons;
                    if (chatActivitySideControlsButtonsLayout3 != null) {
                        chatActivitySideControlsButtonsLayout3.showButton(0, z8, true);
                        if (this.attachButton != null) {
                            ViewPropertyAnimator viewPropertyAnimator2 = this.attachButtonAnimator;
                            if (viewPropertyAnimator2 != null) {
                                viewPropertyAnimator2.cancel();
                                this.attachButtonAnimator = null;
                            }
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.attachButton.animate();
                            float f2 = z8 ? 0.0f : 1.0f;
                            this.attachButtonAlpha = f2;
                            ViewPropertyAnimator duration = viewPropertyAnimatorAnimate.alpha(f2).scaleX(z8 ? 0.5f : 1.0f).scaleY(z8 ? 0.5f : 1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L);
                            this.attachButtonAnimator = duration;
                            duration.start();
                        }
                    }
                } else if (z3) {
                    int i4 = this.runningAnimationType;
                    if (i4 == 1 && caption == null) {
                        return;
                    }
                    if (i4 == 3 && caption != null) {
                        return;
                    }
                    AnimatorSet animatorSet4 = this.runningAnimation;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        animatorSet = null;
                        this.runningAnimation = null;
                    } else {
                        animatorSet = null;
                    }
                    AnimatorSet animatorSet5 = this.runningAnimation2;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.runningAnimation2 = animatorSet;
                    }
                    if (this.attachLayout != null) {
                        this.runningAnimation2 = new AnimatorSet();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_ALPHA, f));
                        arrayList3.add(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator3 = this.attachButtonAnimator;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.attachButtonAnimator = null;
                        }
                        ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout4 = this.sideButtons;
                        if (chatActivitySideControlsButtonsLayout4 != null) {
                            chatActivitySideControlsButtonsLayout4.showButton(0, z8, true);
                            ImageView imageView11 = this.attachButton;
                            if (imageView11 != null) {
                                float f3 = z8 ? 0.0f : 1.0f;
                                this.attachButtonAlpha = f3;
                                arrayList3.add(ObjectAnimator.ofFloat(imageView11, (Property<ImageView, Float>) property3, f3));
                                arrayList3.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property, z8 ? 0.5f : 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, z8 ? 0.5f : 1.0f));
                            }
                        } else {
                            ImageView imageView12 = this.attachButton;
                            if (imageView12 != null) {
                                this.attachButtonAlpha = 0.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(imageView12, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property, 0.5f));
                                arrayList3.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 0.5f));
                            }
                        }
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate3 = this.delegate;
                        final boolean z9 = chatActivityEnterViewDelegate3 != null && chatActivityEnterViewDelegate3.hasScheduledMessages();
                        this.scheduleButtonHidden = true;
                        ImageView imageView13 = this.scheduledButton;
                        if (imageView13 != null) {
                            imageView13.setScaleY(1.0f);
                            if (z9) {
                                this.scheduledButton.setTag(null);
                                arrayList3.add(ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) property, 0.0f));
                                arrayList3.add(animateScheduledTranslationX(0.0f));
                            } else {
                                this.scheduledButton.setAlpha(0.0f);
                                this.scheduledButton.setScaleX(0.0f);
                                this.scheduledButton.setTranslationX(0.0f);
                            }
                        }
                        this.runningAnimation2.playTogether(arrayList3);
                        this.runningAnimation2.setDuration(100L);
                        this.runningAnimation2.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (animator.equals(ChatActivityEnterView.this.runningAnimation2)) {
                                    ChatActivityEnterView.this.attachLayout.setVisibility(8);
                                    if (z9 && ChatActivityEnterView.this.scheduledButton != null) {
                                        ChatActivityEnterView.this.scheduledButton.setVisibility(8);
                                    }
                                    ChatActivityEnterView.this.runningAnimation2 = null;
                                }
                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {
                                if (animator.equals(ChatActivityEnterView.this.runningAnimation2)) {
                                    ChatActivityEnterView.this.runningAnimation2 = null;
                                }
                            }
                        });
                        this.runningAnimation2.start();
                        updateFieldRight(0);
                        if (this.delegate != null && getVisibility() == 0) {
                            this.delegate.onAttachButtonHidden();
                        }
                    }
                    this.runningAnimation = new AnimatorSet();
                    ArrayList arrayList4 = new ArrayList();
                    if (this.audioVideoButtonContainer.getVisibility() == 0) {
                        arrayList4.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property, 0.1f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property2, 0.1f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property3, 0.0f));
                    }
                    ImageView imageView14 = this.expandStickersButton;
                    if (imageView14 != null && imageView14.getVisibility() == 0) {
                        arrayList4.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property, 0.1f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property2, 0.1f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property3, 0.0f));
                    }
                    if (this.slowModeButton.getVisibility() == 0) {
                        arrayList4.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property, 0.1f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property2, 0.1f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property3, 0.0f));
                    }
                    if (z6) {
                        arrayList4.add(animateSendButton(false));
                    } else if (z7) {
                        arrayList4.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property, 0.1f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property2, 0.1f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property3, 0.0f));
                    }
                    if (caption != null) {
                        this.runningAnimationType = 3;
                        arrayList4.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property2, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property3, 1.0f));
                        this.cancelBotButton.setVisibility(0);
                    } else {
                        this.runningAnimationType = 1;
                        arrayList4.add(animateSendButton(true));
                        getSendButtonInternal().setVisibility(0);
                    }
                    this.runningAnimation.playTogether(arrayList4);
                    this.runningAnimation.setDuration(220L);
                    this.runningAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.runningAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(ChatActivityEnterView.this.runningAnimation)) {
                                if (caption != null) {
                                    ChatActivityEnterView.this.cancelBotButton.setVisibility(0);
                                    ChatActivityEnterView.this.getSendButtonInternal().setVisibility(8);
                                } else {
                                    ChatActivityEnterView.this.getSendButtonInternal().setVisibility(0);
                                    ChatActivityEnterView.this.cancelBotButton.setVisibility(8);
                                }
                                ChatActivityEnterView.this.audioVideoButtonContainer.setVisibility(8);
                                if (ChatActivityEnterView.this.expandStickersButton != null) {
                                    ChatActivityEnterView.this.expandStickersButton.setVisibility(8);
                                }
                                ChatActivityEnterView.this.setSlowModeButtonVisible(false);
                                ChatActivityEnterView.this.runningAnimation = null;
                                ChatActivityEnterView.this.runningAnimationType = 0;
                            }
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {
                            if (animator.equals(ChatActivityEnterView.this.runningAnimation)) {
                                ChatActivityEnterView.this.runningAnimation = null;
                            }
                        }
                    });
                    this.runningAnimation.start();
                } else {
                    this.audioVideoSendButton.setScaleX(0.1f);
                    this.audioVideoSendButton.setScaleY(0.1f);
                    this.audioVideoSendButton.setAlpha(0.0f);
                    this.audioVideoButtonContainer.setVisibility(8);
                    if (this.slowModeButton.getVisibility() == 0) {
                        this.slowModeButton.setScaleX(0.1f);
                        this.slowModeButton.setScaleY(0.1f);
                        this.slowModeButton.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                    }
                    if (caption != null) {
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        this.cancelBotButton.setScaleX(1.0f);
                        this.cancelBotButton.setScaleY(1.0f);
                        this.cancelBotButton.setAlpha(1.0f);
                        this.cancelBotButton.setVisibility(0);
                    } else {
                        this.cancelBotButton.setScaleX(0.1f);
                        this.cancelBotButton.setScaleY(0.1f);
                        this.cancelBotButton.setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(0);
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        this.cancelBotButton.setVisibility(8);
                    }
                    ImageView imageView15 = this.expandStickersButton;
                    if (imageView15 == null || imageView15.getVisibility() != 0) {
                        i = 8;
                    } else {
                        this.expandStickersButton.setScaleX(0.1f);
                        this.expandStickersButton.setScaleY(0.1f);
                        this.expandStickersButton.setAlpha(0.0f);
                        i = 8;
                        this.expandStickersButton.setVisibility(8);
                    }
                    LinearLayout linearLayout2 = this.attachLayout;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(i);
                        if (this.delegate != null && getVisibility() == 0) {
                            this.delegate.onAttachButtonHidden();
                        }
                        updateFieldRight(0);
                        ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout5 = this.sideButtons;
                        if (chatActivitySideControlsButtonsLayout5 != null) {
                            chatActivitySideControlsButtonsLayout5.showButton(0, z8, true);
                            ImageView imageView16 = this.attachButton;
                            if (imageView16 != null) {
                                float f4 = z8 ? 0.0f : 1.0f;
                                this.attachButtonAlpha = f4;
                                imageView16.setAlpha(f4);
                                this.attachButton.setScaleX(z8 ? 0.5f : 1.0f);
                                this.attachButton.setScaleY(z8 ? 0.5f : 1.0f);
                            }
                        } else {
                            ImageView imageView17 = this.attachButton;
                            if (imageView17 != null) {
                                this.attachButtonAlpha = 0.0f;
                                imageView17.setAlpha(0.0f);
                                this.attachButton.setScaleX(0.5f);
                                this.attachButton.setScaleY(0.5f);
                            }
                        }
                    }
                    this.scheduleButtonHidden = true;
                    if (this.scheduledButton != null) {
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate4 = this.delegate;
                        if (chatActivityEnterViewDelegate4 != null && chatActivityEnterViewDelegate4.hasScheduledMessages()) {
                            this.scheduledButton.setVisibility(8);
                            this.scheduledButton.setTag(null);
                        }
                        this.scheduledButton.setAlpha(0.0f);
                        this.scheduledButton.setScaleX(0.0f);
                        this.scheduledButton.setScaleY(1.0f);
                        this.scheduledButton.setTranslationX(0.0f);
                    }
                }
            } else if (this.emojiView == null || !this.emojiViewVisible || (!(this.stickersTabOpen || (this.emojiTabOpen && this.searchingType == 2)) || AndroidUtilities.isInMultiwindow || this.isLiveComment)) {
                if (getSendButtonInternal().getVisibility() == 0 || this.cancelBotButton.getVisibility() == 0 || (((imageView3 = this.expandStickersButton) != null && imageView3.getVisibility() == 0) || this.slowModeButton.getVisibility() == 0)) {
                    if (z3) {
                        if (this.runningAnimationType == 2) {
                            return;
                        }
                        AnimatorSet animatorSet6 = this.runningAnimation;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            this.runningAnimation = null;
                        }
                        AnimatorSet animatorSet7 = this.runningAnimation2;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.runningAnimation2 = null;
                        }
                        LinearLayout linearLayout3 = this.attachLayout;
                        if (linearLayout3 != null) {
                            if (linearLayout3.getVisibility() != 0) {
                                this.attachLayout.setVisibility(0);
                                this.attachLayoutAlpha = 0.0f;
                                updateAttachLayoutParams();
                                this.attachLayout.setScaleX(0.0f);
                            }
                            this.runningAnimation2 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_ALPHA, 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) property, 1.0f));
                            ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout6 = this.sideButtons;
                            if (chatActivitySideControlsButtonsLayout6 != null) {
                                chatActivitySideControlsButtonsLayout6.showButton(0, false, true);
                            }
                            if (this.attachButton != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.attachButtonAnimator;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.attachButtonAnimator = null;
                                }
                                ImageView imageView18 = this.attachButton;
                                this.attachButtonAlpha = 1.0f;
                                arrayList5.add(ObjectAnimator.ofFloat(imageView18, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList5.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property, 1.0f));
                                arrayList5.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 1.0f));
                            }
                            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate5 = this.delegate;
                            boolean z10 = chatActivityEnterViewDelegate5 != null && chatActivityEnterViewDelegate5.hasScheduledMessages();
                            this.scheduleButtonHidden = false;
                            if (z10) {
                                createScheduledButton();
                            }
                            ImageView imageView19 = this.scheduledButton;
                            if (imageView19 != null) {
                                if (z10) {
                                    imageView19.setVisibility(0);
                                    this.scheduledButton.setTag(1);
                                    this.scheduledButton.setPivotX(AndroidUtilities.dp(44.0f));
                                    arrayList5.add(ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList5.add(ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) property, 1.0f));
                                    arrayList5.add(animateScheduledTranslationX(0.0f));
                                    ImageView imageView20 = this.notifyButton;
                                    if (imageView20 != null && imageView20.getVisibility() == 0) {
                                        this.notifyButton.setVisibility(8);
                                    }
                                } else {
                                    imageView19.setAlpha(1.0f);
                                    this.scheduledButton.setScaleX(1.0f);
                                    this.scheduledButton.setScaleY(1.0f);
                                    this.scheduledButton.setTranslationX(0.0f);
                                }
                            }
                            this.runningAnimation2.playTogether(arrayList5);
                            this.runningAnimation2.setDuration(100L);
                            this.runningAnimation2.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (animator.equals(ChatActivityEnterView.this.runningAnimation2)) {
                                        ChatActivityEnterView.this.runningAnimation2 = null;
                                    }
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {
                                    if (animator.equals(ChatActivityEnterView.this.runningAnimation2)) {
                                        ChatActivityEnterView.this.runningAnimation2 = null;
                                    }
                                }
                            });
                            this.runningAnimation2.start();
                            updateFieldRight(1);
                            if (getVisibility() == 0) {
                                this.delegate.onAttachButtonShow();
                            }
                        }
                        this.audioVideoButtonContainer.setVisibility(0);
                        this.runningAnimation = new AnimatorSet();
                        this.runningAnimationType = 2;
                        ArrayList arrayList6 = new ArrayList();
                        ChatActivity chatActivity = this.parentFragment;
                        TLRPC.Chat currentChat = chatActivity != null ? chatActivity.getCurrentChat() : null;
                        ChatActivity chatActivity2 = this.parentFragment;
                        TLRPC.UserFull currentUserInfo = chatActivity2 == null ? this.userInfo : chatActivity2.getCurrentUserInfo();
                        float f5 = (currentChat == null ? currentUserInfo == null || !currentUserInfo.voice_messages_forbidden : ChatObject.canSendVoice(currentChat) || ChatObject.canSendRoundVideo(currentChat)) ? 1.0f : 0.5f;
                        arrayList6.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property, 1.0f));
                        arrayList6.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property2, 1.0f));
                        arrayList6.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property3, f5));
                        if (this.cancelBotButton.getVisibility() == 0) {
                            arrayList6.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property, 0.1f));
                            arrayList6.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property2, 0.1f));
                            arrayList6.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property3, 0.0f));
                        } else {
                            ImageView imageView21 = this.expandStickersButton;
                            if (imageView21 != null && imageView21.getVisibility() == 0) {
                                arrayList6.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property, 0.1f));
                                arrayList6.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property2, 0.1f));
                                arrayList6.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property3, 0.0f));
                            } else if (this.slowModeButton.getVisibility() == 0) {
                                arrayList6.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property, 0.1f));
                                arrayList6.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property2, 0.1f));
                                arrayList6.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property3, 0.0f));
                            } else {
                                arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                                arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                                arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                            }
                        }
                        this.runningAnimation.playTogether(arrayList6);
                        this.runningAnimation.setDuration(150L);
                        this.runningAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (animator.equals(ChatActivityEnterView.this.runningAnimation)) {
                                    ChatActivityEnterView.this.setSlowModeButtonVisible(false);
                                    ChatActivityEnterView.this.runningAnimation = null;
                                    ChatActivityEnterView.this.runningAnimationType = 0;
                                    if (ChatActivityEnterView.this.audioVideoButtonContainer != null) {
                                        ChatActivityEnterView.this.audioVideoButtonContainer.setVisibility(0);
                                    }
                                }
                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {
                                if (animator.equals(ChatActivityEnterView.this.runningAnimation)) {
                                    ChatActivityEnterView.this.runningAnimation = null;
                                }
                            }
                        });
                        this.runningAnimation.start();
                    } else {
                        this.slowModeButton.setScaleX(0.1f);
                        this.slowModeButton.setScaleY(0.1f);
                        this.slowModeButton.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        this.cancelBotButton.setScaleX(0.1f);
                        this.cancelBotButton.setScaleY(0.1f);
                        this.cancelBotButton.setAlpha(0.0f);
                        this.cancelBotButton.setVisibility(8);
                        ImageView imageView22 = this.expandStickersButton;
                        if (imageView22 != null) {
                            imageView22.setScaleX(0.1f);
                            this.expandStickersButton.setScaleY(0.1f);
                            this.expandStickersButton.setAlpha(0.0f);
                            this.expandStickersButton.setVisibility(8);
                        }
                        this.audioVideoSendButton.setScaleX(1.0f);
                        this.audioVideoSendButton.setScaleY(1.0f);
                        this.audioVideoSendButton.setAlpha(1.0f);
                        this.audioVideoButtonContainer.setVisibility(0);
                        if (this.attachLayout != null) {
                            if (getVisibility() == 0) {
                                this.delegate.onAttachButtonShow();
                            }
                            this.attachLayoutAlpha = 1.0f;
                            updateAttachLayoutParams();
                            this.attachLayout.setScaleX(1.0f);
                            this.attachLayout.setVisibility(0);
                            updateFieldRight(1);
                        }
                        if (this.attachButton != null) {
                            ViewPropertyAnimator viewPropertyAnimator5 = this.attachButtonAnimator;
                            if (viewPropertyAnimator5 != null) {
                                viewPropertyAnimator5.cancel();
                                this.attachButtonAnimator = null;
                            }
                            ImageView imageView23 = this.attachButton;
                            this.attachButtonAlpha = 1.0f;
                            imageView23.setAlpha(1.0f);
                            this.attachButton.setScaleX(1.0f);
                            this.attachButton.setScaleY(1.0f);
                        }
                        this.scheduleButtonHidden = false;
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate6 = this.delegate;
                        if (chatActivityEnterViewDelegate6 != null && chatActivityEnterViewDelegate6.hasScheduledMessages()) {
                            createScheduledButton();
                        }
                        if (this.scheduledButton != null) {
                            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate7 = this.delegate;
                            if (chatActivityEnterViewDelegate7 != null && chatActivityEnterViewDelegate7.hasScheduledMessages()) {
                                this.scheduledButton.setVisibility(0);
                                this.scheduledButton.setTag(1);
                            }
                            this.scheduledButton.setAlpha(1.0f);
                            this.scheduledButton.setScaleX(1.0f);
                            this.scheduledButton.setScaleY(1.0f);
                            this.scheduledButton.setTranslationX(0.0f);
                        }
                    }
                }
            } else if (z3) {
                if (this.runningAnimationType == 4) {
                    return;
                }
                AnimatorSet animatorSet8 = this.runningAnimation;
                if (animatorSet8 != null) {
                    animatorSet8.cancel();
                    this.runningAnimation = null;
                }
                AnimatorSet animatorSet9 = this.runningAnimation2;
                if (animatorSet9 != null) {
                    animatorSet9.cancel();
                    this.runningAnimation2 = null;
                }
                LinearLayout linearLayout4 = this.attachLayout;
                if (linearLayout4 != null && this.recordInterfaceState == 0) {
                    linearLayout4.setVisibility(0);
                    this.runningAnimation2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_ALPHA, 1.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) property, 1.0f));
                    ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout7 = this.sideButtons;
                    if (chatActivitySideControlsButtonsLayout7 != null) {
                        chatActivitySideControlsButtonsLayout7.showButton(0, false, true);
                    }
                    if (this.attachButton != null) {
                        ViewPropertyAnimator viewPropertyAnimator6 = this.attachButtonAnimator;
                        if (viewPropertyAnimator6 != null) {
                            viewPropertyAnimator6.cancel();
                            this.attachButtonAnimator = null;
                        }
                        ImageView imageView24 = this.attachButton;
                        this.attachButtonAlpha = 1.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(imageView24, (Property<ImageView, Float>) property3, 1.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property, 1.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 1.0f));
                    }
                    ChatActivityEnterViewDelegate chatActivityEnterViewDelegate8 = this.delegate;
                    boolean z11 = chatActivityEnterViewDelegate8 != null && chatActivityEnterViewDelegate8.hasScheduledMessages();
                    this.scheduleButtonHidden = false;
                    if (z11) {
                        createScheduledButton();
                    }
                    ImageView imageView25 = this.scheduledButton;
                    if (imageView25 != null) {
                        imageView25.setScaleY(1.0f);
                        if (z11) {
                            this.scheduledButton.setVisibility(0);
                            this.scheduledButton.setTag(1);
                            this.scheduledButton.setPivotX(AndroidUtilities.dp(44.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) property, 1.0f));
                            arrayList7.add(animateScheduledTranslationX(0.0f));
                        } else {
                            this.scheduledButton.setAlpha(1.0f);
                            this.scheduledButton.setScaleX(1.0f);
                            this.scheduledButton.setTranslationX(0.0f);
                        }
                    }
                    this.runningAnimation2.playTogether(arrayList7);
                    this.runningAnimation2.setDuration(100L);
                    this.runningAnimation2.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(ChatActivityEnterView.this.runningAnimation2)) {
                                ChatActivityEnterView.this.runningAnimation2 = null;
                            }
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {
                            if (animator.equals(ChatActivityEnterView.this.runningAnimation2)) {
                                ChatActivityEnterView.this.runningAnimation2 = null;
                            }
                        }
                    });
                    this.runningAnimation2.start();
                    updateFieldRight(1);
                    if (getVisibility() == 0) {
                        this.delegate.onAttachButtonShow();
                    }
                }
                createExpandStickersButton();
                this.expandStickersButton.setVisibility(0);
                this.runningAnimation = new AnimatorSet();
                this.runningAnimationType = 4;
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property, 1.0f));
                arrayList8.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property2, 1.0f));
                arrayList8.add(ObjectAnimator.ofFloat(this.expandStickersButton, (Property<ImageView, Float>) property3, 1.0f));
                if (this.cancelBotButton.getVisibility() == 0) {
                    arrayList8.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(this.cancelBotButton, (Property<ImageView, Float>) property3, 0.0f));
                } else if (this.audioVideoButtonContainer.getVisibility() == 0) {
                    arrayList8.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(this.audioVideoSendButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) property3, 0.0f));
                } else if (this.slowModeButton.getVisibility() == 0) {
                    arrayList8.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(this.slowModeButton, (Property<SlowModeBtn, Float>) property3, 0.0f));
                } else {
                    arrayList8.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                }
                this.runningAnimation.playTogether(arrayList8);
                this.runningAnimation.setDuration(250L);
                this.runningAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (animator.equals(ChatActivityEnterView.this.runningAnimation)) {
                            ChatActivityEnterView.this.getSendButtonInternal().setVisibility(8);
                            ChatActivityEnterView.this.cancelBotButton.setVisibility(8);
                            ChatActivityEnterView.this.setSlowModeButtonVisible(false);
                            ChatActivityEnterView.this.audioVideoButtonContainer.setVisibility(8);
                            ChatActivityEnterView.this.expandStickersButton.setVisibility(0);
                            ChatActivityEnterView.this.runningAnimation = null;
                            ChatActivityEnterView.this.runningAnimationType = 0;
                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {
                        if (animator.equals(ChatActivityEnterView.this.runningAnimation)) {
                            ChatActivityEnterView.this.runningAnimation = null;
                        }
                    }
                });
                this.runningAnimation.start();
            } else {
                this.slowModeButton.setScaleX(0.1f);
                this.slowModeButton.setScaleY(0.1f);
                this.slowModeButton.setAlpha(0.0f);
                setSlowModeButtonVisible(false);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                this.cancelBotButton.setScaleX(0.1f);
                this.cancelBotButton.setScaleY(0.1f);
                this.cancelBotButton.setAlpha(0.0f);
                this.cancelBotButton.setVisibility(8);
                this.audioVideoSendButton.setScaleX(0.1f);
                this.audioVideoSendButton.setScaleY(0.1f);
                this.audioVideoSendButton.setAlpha(0.0f);
                this.audioVideoButtonContainer.setVisibility(8);
                createExpandStickersButton();
                this.expandStickersButton.setScaleX(1.0f);
                this.expandStickersButton.setScaleY(1.0f);
                this.expandStickersButton.setAlpha(1.0f);
                this.expandStickersButton.setVisibility(0);
                if (this.attachLayout != null) {
                    if (getVisibility() == 0) {
                        this.delegate.onAttachButtonShow();
                    }
                    this.attachLayout.setVisibility(0);
                    updateFieldRight(1);
                }
                this.scheduleButtonHidden = false;
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate9 = this.delegate;
                boolean z12 = chatActivityEnterViewDelegate9 != null && chatActivityEnterViewDelegate9.hasScheduledMessages();
                if (z12) {
                    createScheduledButton();
                }
                ImageView imageView26 = this.scheduledButton;
                if (imageView26 != null) {
                    if (z12) {
                        imageView26.setVisibility(0);
                        this.scheduledButton.setTag(1);
                    }
                    this.scheduledButton.setAlpha(1.0f);
                    this.scheduledButton.setScaleX(1.0f);
                    this.scheduledButton.setScaleY(1.0f);
                    this.scheduledButton.setTranslationX(0.0f);
                }
            }
            if (this.isStories || (imageView4 = this.suggestButton) == null) {
            }
            if (z3) {
                imageView4.animate().translationX(z2 ? -Math.max(0, this.sendButton.width() - AndroidUtilities.dp(64.0f)) : AndroidUtilities.dp(42.0f)).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                return;
            } else {
                imageView4.setTranslationX(z2 ? -Math.max(0, this.sendButton.width() - AndroidUtilities.dp(64.0f)) : AndroidUtilities.dp(42.0f));
                return;
            }
        }
        z2 = false;
        if (this.isStories) {
        }
    }

    public void setSlowModeButtonVisible(boolean z) {
        int iDp;
        this.slowModeButton.setVisibility(z ? 0 : 8);
        if (z) {
            iDp = AndroidUtilities.dp(this.slowModeButton.isPremiumMode ? 26.0f : 16.0f);
        } else {
            iDp = 0;
        }
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null || editTextCaption.getPaddingRight() == iDp) {
            return;
        }
        this.messageEditText.setPadding(0, AndroidUtilities.dp(9.0f), iDp, AndroidUtilities.dp(10.0f));
    }

    private void updateFieldRight(int i) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        this.lastAttachVisible = i;
        if (this.messageEditText != null) {
            MessageObject messageObject = this.editingMessageObject;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.messageEditText.getLayoutParams();
                int i2 = layoutParams.rightMargin;
                if (this.isStories && this.isLiveComment) {
                    layoutParams.rightMargin = AndroidUtilities.dp(this.suggestButtonVisible ? 50.0f : 2.0f) + Math.max(0, this.sendButton.width() - AndroidUtilities.dp(44.0f));
                } else if (i == 1 || i == 2) {
                    ImageView imageView5 = this.botButton;
                    if (imageView5 != null && imageView5.getVisibility() == 0 && (imageView3 = this.scheduledButton) != null && imageView3.getVisibility() == 0 && (imageView4 = this.attachButton) != null && imageView4.getVisibility() == 0) {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        ImageView imageView6 = this.botButton;
                        if ((imageView6 != null && imageView6.getVisibility() == 0) || (((imageView = this.notifyButton) != null && imageView.getVisibility() == 0) || ((imageView2 = this.scheduledButton) != null && imageView2.getTag() != null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        }
                    }
                } else {
                    ImageView imageView7 = this.scheduledButton;
                    if (imageView7 != null && imageView7.getTag() != null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.sendButton.width() - AndroidUtilities.dp(44.0f)));
                SendButton sendButton = this.doneButton;
                if (sendButton != null && sendButton.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.doneButton.width() - AndroidUtilities.dp(44.0f)));
                }
                if (i2 != layoutParams.rightMargin) {
                    this.messageEditText.setLayoutParams(layoutParams);
                }
                FrameLayout frameLayout = this.recordedAudioPanel;
                if (frameLayout != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams2.rightMargin = this.editingMessageObject == null ? Math.max(0, this.sendButton.width() - AndroidUtilities.dp(44.0f)) : 0;
                    this.recordedAudioPanel.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public void startMessageTransition() {
        Runnable runnable = this.moveToSendStateRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.messageTransitionIsRunning = true;
            this.moveToSendStateRunnable.run();
            this.moveToSendStateRunnable = null;
        }
    }

    public boolean canShowMessageTransition() {
        MessageSendPreview messageSendPreview;
        boolean z = this.moveToSendStateRunnable != null && ((messageSendPreview = this.messageSendPreview) == null || !messageSendPreview.isShowing()) && System.currentTimeMillis() - this.sentFromPreview > 300;
        this.sentFromPreview = -1L;
        return z;
    }

    protected void updateRecordInterface(final int i, boolean z) {
        boolean zIsRunning;
        int i2;
        char c;
        float f;
        int i3;
        boolean z2;
        ?? r7;
        int i4;
        long j;
        char c2;
        ?? r12;
        float f2;
        int i5;
        ?? r13;
        float f3;
        int i6;
        final ViewGroup.LayoutParams layoutParams;
        final ViewGroup viewGroup;
        int i7;
        char c3;
        char c4;
        Runnable runnable = this.moveToSendStateRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.moveToSendStateRunnable = null;
        }
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.voiceEnterTransitionInProgress = false;
        }
        boolean z3 = this.recordingAudioVideo;
        Property property = View.TRANSLATION_X;
        Property property2 = View.SCALE_X;
        Property property3 = View.SCALE_Y;
        Property property4 = View.ALPHA;
        if (z3) {
            if (this.recordInterfaceState == 1) {
                this.lastRecordState = i;
                return;
            }
            final boolean z4 = this.lastRecordState == 3;
            if (!z4) {
                this.voiceOnce = false;
                ControlsView controlsView = this.controlsView;
                if (controlsView != null) {
                    controlsView.periodDrawable.setValue(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                long j2 = this.dialog_id;
                ChatActivity chatActivity = this.parentFragment;
                mediaDataController.toggleDraftVoiceOnce(j2, (chatActivity == null || !chatActivity.isTopic) ? 0L : chatActivity.getTopicId(), this.voiceOnce);
                this.millisecondsRecorded = 0L;
            }
            createRecordAudioPanel();
            this.recordInterfaceState = 1;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.setEnabled(false);
            }
            try {
                if (this.wakeLock == null) {
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.wakeLock = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.acquire();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.lockOrientation(this.parentActivity);
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.needStartRecordAudio(0);
            }
            AnimatorSet animatorSet = this.runningAnimationAudio;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.recordPannelAnimation;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            createRecordPanel();
            FrameLayout frameLayout = this.recordPanel;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            createRecordCircle();
            RecordCircle recordCircle2 = this.recordCircle;
            if (recordCircle2 != null) {
                recordCircle2.voiceEnterTransitionInProgress = false;
                recordCircle2.setVisibility(0);
                this.recordCircle.setAmplitude(0.0d);
            }
            ControlsView controlsView2 = this.controlsView;
            if (controlsView2 != null) {
                controlsView2.setVisibility(0);
            }
            RecordDot recordDot = this.recordDot;
            if (recordDot != null) {
                recordDot.resetAlpha();
                this.recordDot.setScaleX(0.0f);
                this.recordDot.setScaleY(0.0f);
                this.recordDot.enterAnimation = true;
            }
            this.runningAnimationAudio = new AnimatorSet();
            this.recordTimerView.setTranslationX(AndroidUtilities.dp(20.0f));
            this.recordTimerView.setAlpha(0.0f);
            if (this.lastRecordState != 3) {
                this.slideText.setTranslationX(AndroidUtilities.dp(20.0f));
                this.slideText.setAlpha(0.0f);
                this.slideText.setCancelToProgress(0.0f);
                this.slideText.setSlideX(1.0f);
                this.slideText.setEnabled(true);
            } else {
                this.slideText.setTranslationX(0.0f);
                this.slideText.setAlpha(0.0f);
                this.slideText.setCancelToProgress(1.0f);
                this.slideText.setEnabled(true);
            }
            this.recordCircle.resetLockTranslation(this.lastRecordState == 3);
            this.recordIsCanceled = false;
            isRecordingStateChanged();
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_SCALE, 0.0f), ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_ALPHA, 0.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property4, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property4, 1.0f));
            ControlsView controlsView3 = this.controlsView;
            if (controlsView3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(controlsView3, (Property<ControlsView, Float>) property4, 1.0f));
            }
            if (this.audioVideoSendButton != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property4, 0.0f));
            }
            BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
            if (botCommandsMenuView != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(botCommandsMenuView, (Property<BotCommandsMenuView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property4, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) this.MESSAGE_TEXT_TRANSLATION_X, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.recordedAudioPanel, (Property<FrameLayout, Float>) property4, 1.0f));
            if (z4) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.audioTimelineView, (Property<RecordedAudioPlayerView, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.videoTimelineView, (Property<VideoTimelineView, Float>) property4, 0.0f));
            }
            if (this.scheduledButton != null) {
                animatorSet4.playTogether(animateScheduledTranslationX(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) property4, 0.0f));
            }
            LinearLayout linearLayout = this.attachLayout;
            if (linearLayout != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_TRANSLATION_X, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_ALPHA, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.attachButtonAnimator;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.attachButtonAnimator = null;
                }
                ImageView imageView = this.attachButton;
                this.attachButtonAlpha = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 0.5f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property3, 0.5f));
            }
            ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout = this.sideButtons;
            if (chatActivitySideControlsButtonsLayout != null) {
                chatActivitySideControlsButtonsLayout.showButton(0, false, true);
            }
            this.runningAnimationAudio.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.recordCircle, (Property<RecordCircle, Float>) this.recordCircleScale, 1.0f).setDuration(300L));
            if (!z4) {
                this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(this.recordCircle, (Property<RecordCircle, Float>) this.recordControlsCircleScale, 1.0f).setDuration(300L));
            }
            this.runningAnimationAudio.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatActivityEnterView.this.runningAnimationAudio)) {
                        ChatActivityEnterView.this.runningAnimationAudio = null;
                    }
                    ChatActivityEnterView.this.isRecordingStateChanged();
                    ChatActivityEnterView.this.slideText.setAlpha(1.0f);
                    ChatActivityEnterView.this.slideText.setTranslationX(0.0f);
                    ControlsView controlsView4 = ChatActivityEnterView.this.controlsView;
                    if (controlsView4 != null) {
                        controlsView4.showTooltipIfNeed();
                    }
                    EditTextCaption editTextCaption = ChatActivityEnterView.this.messageEditText;
                    if (editTextCaption != null) {
                        editTextCaption.setAlpha(0.0f);
                    }
                    if (z4) {
                        RecordedAudioPlayerView recordedAudioPlayerView = ChatActivityEnterView.this.audioTimelineView;
                        if (recordedAudioPlayerView != null) {
                            recordedAudioPlayerView.setVisibility(8);
                        }
                        FrameLayout frameLayout2 = ChatActivityEnterView.this.recordedAudioPanel;
                        if (frameLayout2 != null) {
                            frameLayout2.setVisibility(8);
                        }
                        ChatActivityEnterView.this.isRecordingStateChanged();
                    }
                }
            });
            this.runningAnimationAudio.setInterpolator(new DecelerateInterpolator());
            this.runningAnimationAudio.start();
            this.recordTimerView.start(this.millisecondsRecorded);
        } else {
            if (this.recordIsCanceled && i == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.wakeLock = null;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            AndroidUtilities.unlockOrientation(this.parentActivity);
            this.wasSendTyping = false;
            if (this.recordInterfaceState == 0) {
                this.lastRecordState = i;
                return;
            }
            this.accountInstance.getMessagesController().sendTyping(this.dialog_id, getThreadMessageId(), 2, 0);
            this.recordInterfaceState = 0;
            EmojiView emojiView2 = this.emojiView;
            if (emojiView2 != null) {
                emojiView2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.runningAnimationAudio;
            if (animatorSet5 != null) {
                zIsRunning = animatorSet5.isRunning();
                ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.audioVideoSendButton;
                if (chatActivityEnterViewAnimatedIconView != null) {
                    chatActivityEnterViewAnimatedIconView.setScaleX(1.0f);
                    this.audioVideoSendButton.setScaleY(1.0f);
                }
                this.runningAnimationAudio.removeAllListeners();
                this.runningAnimationAudio.cancel();
            } else {
                zIsRunning = false;
            }
            AnimatorSet animatorSet6 = this.recordPannelAnimation;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            EditTextCaption editTextCaption = this.messageEditText;
            if (editTextCaption != null) {
                editTextCaption.setVisibility(0);
            }
            this.runningAnimationAudio = new AnimatorSet();
            if (zIsRunning || i == 4) {
                ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView2 = this.audioVideoSendButton;
                if (chatActivityEnterViewAnimatedIconView2 != null) {
                    chatActivityEnterViewAnimatedIconView2.setVisibility(0);
                }
                this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_SCALE, 1.0f), ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_ALPHA, this.emojiButtonRestricted ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.recordCircle, (Property<RecordCircle, Float>) this.recordCircleScale, 0.0f), ObjectAnimator.ofFloat(this.recordCircle, (Property<RecordCircle, Float>) this.recordControlsCircleScale, 0.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) this.MESSAGE_TEXT_TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                ControlsView controlsView4 = this.controlsView;
                if (controlsView4 != null) {
                    i2 = 1;
                    c = 0;
                    this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(controlsView4, (Property<ControlsView, Float>) property4, 0.0f));
                    this.controlsView.hideHintView();
                } else {
                    i2 = 1;
                    c = 0;
                }
                BotCommandsMenuView botCommandsMenuView2 = this.botCommandsMenuButton;
                if (botCommandsMenuView2 != null) {
                    AnimatorSet animatorSet7 = this.runningAnimationAudio;
                    float[] fArr = new float[i2];
                    f = 1.0f;
                    fArr[c] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(botCommandsMenuView2, (Property<BotCommandsMenuView, Float>) property3, fArr);
                    BotCommandsMenuView botCommandsMenuView3 = this.botCommandsMenuButton;
                    float[] fArr2 = new float[i2];
                    fArr2[c] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(botCommandsMenuView3, (Property<BotCommandsMenuView, Float>) property2, fArr2);
                    BotCommandsMenuView botCommandsMenuView4 = this.botCommandsMenuButton;
                    float[] fArr3 = new float[i2];
                    fArr3[c] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(botCommandsMenuView4, (Property<BotCommandsMenuView, Float>) property4, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c] = objectAnimatorOfFloat;
                    animatorArr[i2] = objectAnimatorOfFloat2;
                    animatorArr[2] = objectAnimatorOfFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f = 1.0f;
                }
                ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView3 = this.audioVideoSendButton;
                if (chatActivityEnterViewAnimatedIconView3 != null) {
                    chatActivityEnterViewAnimatedIconView3.setScaleX(f);
                    this.audioVideoSendButton.setScaleY(f);
                    i3 = 1;
                    this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property4, f));
                    this.audioVideoSendButton.setState(isInVideoMode() ? ChatActivityEnterViewAnimatedIconView.State.VIDEO : ChatActivityEnterViewAnimatedIconView.State.VOICE, true);
                } else {
                    i3 = 1;
                }
                if (this.scheduledButton != null) {
                    AnimatorSet animatorSet8 = this.runningAnimationAudio;
                    ValueAnimator valueAnimatorAnimateScheduledTranslationX = animateScheduledTranslationX(0.0f);
                    ImageView imageView2 = this.scheduledButton;
                    float[] fArr4 = new float[i3];
                    fArr4[0] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = valueAnimatorAnimateScheduledTranslationX;
                    animatorArr2[i3] = objectAnimatorOfFloat4;
                    animatorSet8.playTogether(animatorArr2);
                }
                if (this.attachLayout != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.attachButtonAnimator;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.attachButtonAnimator = null;
                    }
                    z2 = true;
                    r7 = 0;
                    this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_ALPHA, 1.0f));
                    AnimatorSet animatorSet9 = this.runningAnimationAudio;
                    ImageView imageView3 = this.attachButton;
                    this.attachButtonAlpha = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property3, 1.0f));
                } else {
                    z2 = true;
                    r7 = 0;
                }
                ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout2 = this.sideButtons;
                if (chatActivitySideControlsButtonsLayout2 != 0) {
                    chatActivitySideControlsButtonsLayout2.showButton(r7, r7, z2);
                }
                this.recordIsCanceled = z2;
                isRecordingStateChanged();
                this.runningAnimationAudio.setDuration(150L);
            } else if (i == 3) {
                createRecordAudioPanel();
                createRecordCircle();
                SlideTextView slideTextView = this.slideText;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                }
                if (isInVideoMode()) {
                    RecordedAudioPlayerView recordedAudioPlayerView = this.audioTimelineView;
                    if (recordedAudioPlayerView != null) {
                        recordedAudioPlayerView.setVisibility(8);
                    }
                    FrameLayout frameLayout2 = this.recordedAudioPanel;
                    if (frameLayout2 != null) {
                        frameLayout2.setAlpha(1.0f);
                        this.recordedAudioPanel.setVisibility(0);
                    }
                    RLottieImageView rLottieImageView = this.recordDeleteImageView;
                    if (rLottieImageView != null) {
                        rLottieImageView.setProgress(0.0f);
                        this.recordDeleteImageView.stopAnimation();
                    }
                    f3 = 1.0f;
                } else {
                    VideoTimelineView videoTimelineView = this.videoTimelineView;
                    if (videoTimelineView != null) {
                        videoTimelineView.setVisibility(8);
                        isRecordingStateChanged();
                    }
                    FrameLayout frameLayout3 = this.recordedAudioPanel;
                    if (frameLayout3 != null) {
                        i6 = 0;
                        frameLayout3.setVisibility(0);
                        f3 = 1.0f;
                        this.recordedAudioPanel.setAlpha(1.0f);
                    } else {
                        f3 = 1.0f;
                        i6 = 0;
                    }
                    RecordedAudioPlayerView recordedAudioPlayerView2 = this.audioTimelineView;
                    if (recordedAudioPlayerView2 != null) {
                        recordedAudioPlayerView2.setVisibility(i6);
                        this.audioTimelineView.setAlpha(0.0f);
                    }
                }
                this.sendButtonVisible = true;
                this.snapAnimationProgress = f3;
                this.lockAnimatedTranslation = this.startTranslation;
                this.slideToCancelProgress = f3;
                SlideTextView slideTextView2 = this.slideText;
                if (slideTextView2 != null) {
                    slideTextView2.setCancelToProgress(f3);
                }
                ControlsView controlsView5 = this.controlsView;
                if (controlsView5 != null) {
                    controlsView5.invalidate();
                }
                RLottieImageView rLottieImageView2 = this.recordDeleteImageView;
                if (rLottieImageView2 != null) {
                    rLottieImageView2.setAlpha(0.0f);
                    this.recordDeleteImageView.setScaleX(0.0f);
                    this.recordDeleteImageView.setScaleY(0.0f);
                    this.recordDeleteImageView.setProgress(0.0f);
                    this.recordDeleteImageView.stopAnimation();
                }
                if (!isInVideoMode() && !this.shouldDrawRecordedAudioPanelInParent) {
                    viewGroup = (ViewGroup) this.recordedAudioPanel.getParent();
                    layoutParams = this.recordedAudioPanel.getLayoutParams();
                    viewGroup.removeView(this.recordedAudioPanel);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.editingMessageObject == null ? Math.max(0, this.sendButton.width() - AndroidUtilities.dp(44.0f)) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.sizeNotifierLayout.addView(this.recordedAudioPanel, layoutParams2);
                    this.videoTimelineView.setVisibility(8);
                } else {
                    this.videoTimelineView.setVisibility(0);
                    layoutParams = null;
                    viewGroup = null;
                }
                isRecordingStateChanged();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (!z) {
                    createRecordPanel();
                    this.recordCircleScale.set(this.recordCircle, Float.valueOf(1.0f));
                    this.recordCircle.setTransformToSeekbar(1.0f);
                    if (!isInVideoMode()) {
                        float f4 = this.transformToSeekbar;
                        if (f4 != 0.0f && this.audioTimelineView != null) {
                            this.audioTimelineView.setAlpha(CubicBezierInterpolator.EASE_BOTH.getInterpolation(Math.max(0.0f, ((f4 - 0.38f) - 0.25f) / 0.37f)));
                            this.audioTimelineView.invalidate();
                        }
                    }
                    this.recordDot.setScaleY(0.0f);
                    this.recordDot.setScaleX(0.0f);
                    this.recordTimerView.setAlpha(0.0f);
                    this.recordTimerView.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.slideText.setAlpha(0.0f);
                    this.recordDeleteImageView.setAlpha(1.0f);
                    this.recordDeleteImageView.setScaleY(1.0f);
                    this.recordDeleteImageView.setScaleX(1.0f);
                    this.EMOJI_BUTTON_SCALE.set(this.emojiButton, Float.valueOf(0.0f));
                    this.EMOJI_BUTTON_ALPHA.set(this.emojiButton, Float.valueOf(0.0f));
                    this.messageEditText.setAlpha(0.0f);
                    ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView4 = this.audioVideoSendButton;
                    if (chatActivityEnterViewAnimatedIconView4 != null) {
                        chatActivityEnterViewAnimatedIconView4.setState(isInVideoMode() ? ChatActivityEnterViewAnimatedIconView.State.VIDEO : ChatActivityEnterViewAnimatedIconView.State.VOICE, z);
                        this.audioVideoButtonContainer.setAlpha(1.0f);
                        this.audioVideoButtonContainer.setScaleX(1.0f);
                        this.audioVideoButtonContainer.setScaleY(1.0f);
                    }
                    BotCommandsMenuView botCommandsMenuView5 = this.botCommandsMenuButton;
                    if (botCommandsMenuView5 != null) {
                        botCommandsMenuView5.setAlpha(0.0f);
                        this.botCommandsMenuButton.setScaleX(0.0f);
                        this.botCommandsMenuButton.setScaleY(0.0f);
                    }
                    if (isInVideoMode()) {
                        this.videoTimelineView.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.sizeNotifierLayout.removeView(this.recordedAudioPanel);
                        viewGroup.addView(this.recordedAudioPanel, layoutParams);
                    }
                    this.recordedAudioPanel.setAlpha(1.0f);
                    this.audioTimelineView.setAlpha(1.0f);
                    this.emojiButtonScale = 0.0f;
                    this.emojiButtonAlpha = 0.0f;
                    updateEmojiButtonParams();
                    isRecordingStateChanged();
                } else {
                    this.audioTimelineView.setAllowDraw(false);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatActivityEnterView.m2112$r8$lambda$ztQtTol6fOqstGxDdDC3ACeL4(this.f$0, valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatActivityEnterView.this.audioTimelineView.setAllowDraw(true);
                            ChatActivityEnterView.this.recordCircle.setTransformToSeekbar(1.0f);
                            ChatActivityEnterView.this.isRecordingStateChanged();
                        }
                    });
                    valueAnimatorOfFloat.setDuration(isInVideoMode() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_SCALE, 0.0f), ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_ALPHA, 0.0f), ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) property4, 0.0f));
                    RLottieImageView rLottieImageView3 = this.recordDeleteImageView;
                    if (rLottieImageView3 != null) {
                        rLottieImageView3.setAlpha(0.0f);
                        this.recordDeleteImageView.setScaleX(0.0f);
                        this.recordDeleteImageView.setScaleY(0.0f);
                    }
                    if (this.audioVideoSendButton != null) {
                        i7 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property3, 1.0f));
                        this.audioVideoSendButton.setState(isInVideoMode() ? ChatActivityEnterViewAnimatedIconView.State.VIDEO : ChatActivityEnterViewAnimatedIconView.State.VOICE, true);
                    } else {
                        i7 = 1;
                    }
                    BotCommandsMenuView botCommandsMenuView6 = this.botCommandsMenuButton;
                    if (botCommandsMenuView6 != null) {
                        float[] fArr5 = new float[i7];
                        fArr5[0] = 0.0f;
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(botCommandsMenuView6, (Property<BotCommandsMenuView, Float>) property4, fArr5);
                        BotCommandsMenuView botCommandsMenuView7 = this.botCommandsMenuButton;
                        float[] fArr6 = new float[i7];
                        fArr6[0] = 0.0f;
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(botCommandsMenuView7, (Property<BotCommandsMenuView, Float>) property2, fArr6);
                        BotCommandsMenuView botCommandsMenuView8 = this.botCommandsMenuButton;
                        float[] fArr7 = new float[i7];
                        fArr7[0] = 0.0f;
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(botCommandsMenuView8, (Property<BotCommandsMenuView, Float>) property3, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = objectAnimatorOfFloat5;
                        animatorArr3[i7] = objectAnimatorOfFloat6;
                        animatorArr3[2] = objectAnimatorOfFloat7;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (ChatActivityEnterView.this.audioVideoSendButton != null) {
                                ChatActivityEnterView.this.audioVideoSendButton.setScaleX(1.0f);
                                ChatActivityEnterView.this.audioVideoSendButton.setScaleY(1.0f);
                            }
                        }
                    });
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (isInVideoMode()) {
                        this.videoTimelineView.setAlpha(0.0f);
                        c3 = 1;
                        c4 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.videoTimelineView, (Property<VideoTimelineView, Float>) property4, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c3 = 1;
                        c4 = 0;
                    }
                    AnimatorSet animatorSet12 = this.runningAnimationAudio;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c4] = animatorSet11;
                    animatorArr4[c3] = valueAnimatorOfFloat;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.runningAnimationAudio.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (viewGroup != null) {
                                ChatActivityEnterView.this.sizeNotifierLayout.removeView(ChatActivityEnterView.this.recordedAudioPanel);
                                viewGroup.addView(ChatActivityEnterView.this.recordedAudioPanel, layoutParams);
                            }
                            ChatActivityEnterView.this.recordedAudioPanel.setAlpha(1.0f);
                            ChatActivityEnterView.this.audioTimelineView.setAlpha(1.0f);
                            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                            chatActivityEnterView.emojiButtonScale = 0.0f;
                            chatActivityEnterView.emojiButtonAlpha = 0.0f;
                            chatActivityEnterView.updateEmojiButtonParams();
                            if (ChatActivityEnterView.this.botCommandsMenuButton != null) {
                                ChatActivityEnterView.this.botCommandsMenuButton.setAlpha(0.0f);
                                ChatActivityEnterView.this.botCommandsMenuButton.setScaleX(0.0f);
                                ChatActivityEnterView.this.botCommandsMenuButton.setScaleY(0.0f);
                            }
                            ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                            if (chatActivityEnterView2.controlsView == null || !chatActivityEnterView2.onceVisible || chatActivityEnterView2.voiceOnce || MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) >= 3) {
                                return;
                            }
                            ChatActivityEnterView.this.controlsView.showOnceHint();
                        }
                    });
                }
            } else if (i == 2 || i == 5) {
                ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView5 = this.audioVideoSendButton;
                if (chatActivityEnterViewAnimatedIconView5 != null) {
                    chatActivityEnterViewAnimatedIconView5.setVisibility(0);
                }
                this.recordIsCanceled = true;
                isRecordingStateChanged();
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_SCALE, 1.0f), ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_ALPHA, this.emojiButtonRestricted ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 0.0f));
                ControlsView controlsView6 = this.controlsView;
                if (controlsView6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(controlsView6, (Property<ControlsView, Float>) property4, 0.0f));
                    this.controlsView.hideHintView();
                }
                BotCommandsMenuView botCommandsMenuView9 = this.botCommandsMenuButton;
                if (botCommandsMenuView9 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(botCommandsMenuView9, (Property<BotCommandsMenuView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property4, 1.0f));
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                animatorSet14.playTogether(ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property, -AndroidUtilities.dp(20.0f)));
                if (i != 5) {
                    this.audioVideoButtonContainer.setScaleX(0.0f);
                    this.audioVideoButtonContainer.setScaleY(0.0f);
                    ImageView imageView4 = this.attachButton;
                    if (imageView4 != null && imageView4.getVisibility() == 0) {
                        this.attachButton.setScaleX(0.5f);
                        this.attachButton.setScaleY(0.5f);
                    }
                    ImageView imageView5 = this.botButton;
                    if (imageView5 != null && imageView5.getVisibility() == 0) {
                        this.botButton.setScaleX(0.0f);
                        this.botButton.setScaleY(0.0f);
                    }
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property4, 1.0f));
                    if (this.attachLayout != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = this.attachButtonAnimator;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.attachButtonAnimator = null;
                        }
                        i4 = 1;
                        r12 = 0;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_ALPHA, 1.0f), ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_TRANSLATION_X, 0.0f));
                        ImageView imageView6 = this.attachButton;
                        this.attachButtonAlpha = 1.0f;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property3, 1.0f));
                    } else {
                        i4 = 1;
                        r12 = 0;
                    }
                    ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout3 = this.sideButtons;
                    if (chatActivitySideControlsButtonsLayout3 != 0) {
                        chatActivitySideControlsButtonsLayout3.showButton(r12, r12, i4);
                    }
                    ImageView imageView7 = this.botButton;
                    if (imageView7 != null) {
                        float[] fArr8 = new float[i4];
                        fArr8[r12] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(imageView7, (Property<ImageView, Float>) property2, fArr8);
                        ImageView imageView8 = this.botButton;
                        float[] fArr9 = new float[i4];
                        fArr9[r12] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(imageView8, (Property<ImageView, Float>) property3, fArr9);
                        Animator[] animatorArr5 = new Animator[2];
                        animatorArr5[r12] = objectAnimatorOfFloat8;
                        animatorArr5[i4] = objectAnimatorOfFloat9;
                        animatorSet13.playTogether(animatorArr5);
                    }
                    if (this.audioVideoSendButton != null) {
                        FrameLayout frameLayout4 = this.audioVideoButtonContainer;
                        float[] fArr10 = new float[i4];
                        fArr10[r12] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, fArr10);
                        Animator[] animatorArr6 = new Animator[i4];
                        animatorArr6[r12] = objectAnimatorOfFloat10;
                        animatorSet13.playTogether(animatorArr6);
                        FrameLayout frameLayout5 = this.audioVideoButtonContainer;
                        float[] fArr11 = new float[i4];
                        fArr11[r12] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(frameLayout5, (Property<FrameLayout, Float>) property2, fArr11);
                        Animator[] animatorArr7 = new Animator[i4];
                        animatorArr7[r12] = objectAnimatorOfFloat11;
                        animatorSet13.playTogether(animatorArr7);
                        FrameLayout frameLayout6 = this.audioVideoButtonContainer;
                        float[] fArr12 = new float[i4];
                        fArr12[r12] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(frameLayout6, (Property<FrameLayout, Float>) property3, fArr12);
                        Animator[] animatorArr8 = new Animator[i4];
                        animatorArr8[r12] = objectAnimatorOfFloat12;
                        animatorSet13.playTogether(animatorArr8);
                        this.audioVideoSendButton.setState(isInVideoMode() ? ChatActivityEnterViewAnimatedIconView.State.VIDEO : ChatActivityEnterViewAnimatedIconView.State.VOICE, i4);
                    }
                    ImageView imageView9 = this.scheduledButton;
                    if (imageView9 != null) {
                        float[] fArr13 = new float[i4];
                        c2 = 0;
                        fArr13[0] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(imageView9, (Property<ImageView, Float>) property4, fArr13);
                        ValueAnimator valueAnimatorAnimateScheduledTranslationX2 = animateScheduledTranslationX(0.0f);
                        Animator[] animatorArr9 = new Animator[2];
                        animatorArr9[0] = objectAnimatorOfFloat13;
                        animatorArr9[i4] = valueAnimatorAnimateScheduledTranslationX2;
                        animatorSet13.playTogether(animatorArr9);
                    } else {
                        c2 = 0;
                    }
                    j = 150;
                } else {
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property4, 1.0f));
                    if (this.attachLayout != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.attachButtonAnimator;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.attachButtonAnimator = null;
                        }
                        i4 = 1;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_ALPHA, 1.0f));
                        ImageView imageView10 = this.attachButton;
                        this.attachButtonAlpha = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(imageView10, (Property<ImageView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property3, 1.0f));
                    } else {
                        i4 = 1;
                    }
                    ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout4 = this.sideButtons;
                    if (chatActivitySideControlsButtonsLayout4 != null) {
                        chatActivitySideControlsButtonsLayout4.showButton(0, false, i4);
                    }
                    ImageView imageView11 = this.scheduledButton;
                    if (imageView11 != null) {
                        float[] fArr14 = new float[i4];
                        fArr14[0] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(imageView11, (Property<ImageView, Float>) property4, fArr14);
                        ValueAnimator valueAnimatorAnimateScheduledTranslationX3 = animateScheduledTranslationX(0.0f);
                        Animator[] animatorArr10 = new Animator[2];
                        animatorArr10[0] = objectAnimatorOfFloat14;
                        animatorArr10[i4] = valueAnimatorAnimateScheduledTranslationX3;
                        animatorSet15.playTogether(animatorArr10);
                    }
                    j = 150;
                    animatorSet15.setDuration(150L);
                    animatorSet15.setStartDelay(110L);
                    animatorSet15.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            if (ChatActivityEnterView.this.audioVideoSendButton != null) {
                                ChatActivityEnterView.this.audioVideoSendButton.setAlpha(1.0f);
                            }
                        }
                    });
                    AnimatorSet animatorSet16 = this.runningAnimationAudio;
                    Animator[] animatorArr11 = new Animator[i4];
                    c2 = 0;
                    animatorArr11[0] = animatorSet15;
                    animatorSet16.playTogether(animatorArr11);
                }
                animatorSet13.setDuration(j);
                animatorSet13.setStartDelay(700L);
                animatorSet14.setDuration(200L);
                animatorSet14.setStartDelay(200L);
                this.messageTextTranslationX = 0.0f;
                updateMessageTextParams();
                EditTextCaption editTextCaption2 = this.messageEditText;
                float[] fArr15 = new float[i4];
                fArr15[c2] = 1.0f;
                ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(editTextCaption2, (Property<EditTextCaption, Float>) property4, fArr15);
                objectAnimatorOfFloat15.setStartDelay(this.emojiButtonPaddingAlpha == 1.0f ? 300L : 700L);
                objectAnimatorOfFloat15.setDuration(200L);
                this.runningAnimationAudio.playTogether(animatorSet13, animatorSet14, objectAnimatorOfFloat15, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.startTranslation).setDuration(200L));
                if (i != 5) {
                    ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    objectAnimatorOfFloat16.setDuration(360L);
                    objectAnimatorOfFloat16.setStartDelay(490L);
                    this.runningAnimationAudio.playTogether(objectAnimatorOfFloat16);
                } else {
                    this.recordCircle.canceledByGesture();
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                    this.runningAnimationAudio.playTogether(duration);
                }
                RecordDot recordDot2 = this.recordDot;
                if (recordDot2 != null) {
                    recordDot2.playDeleteAnimation();
                }
            } else {
                ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView6 = this.audioVideoSendButton;
                if (chatActivityEnterViewAnimatedIconView6 != null) {
                    chatActivityEnterViewAnimatedIconView6.setVisibility(0);
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_SCALE, 1.0f), ObjectAnimator.ofFloat(this.emojiButton, (Property<ChatActivityEnterViewAnimatedIconView, Float>) this.EMOJI_BUTTON_ALPHA, this.emojiButtonRestricted ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property4, 1.0f));
                ControlsView controlsView7 = this.controlsView;
                if (controlsView7 != null) {
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(controlsView7, (Property<ControlsView, Float>) property4, 0.0f));
                    this.controlsView.hideHintView();
                }
                BotCommandsMenuView botCommandsMenuView10 = this.botCommandsMenuButton;
                if (botCommandsMenuView10 != null) {
                    f2 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(botCommandsMenuView10, (Property<BotCommandsMenuView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property4, 1.0f));
                } else {
                    f2 = 1.0f;
                }
                ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView7 = this.audioVideoSendButton;
                if (chatActivityEnterViewAnimatedIconView7 != null) {
                    chatActivityEnterViewAnimatedIconView7.setScaleX(f2);
                    this.audioVideoSendButton.setScaleY(f2);
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<FrameLayout, Float>) property4, f2));
                    this.audioVideoSendButton.setState(isInVideoMode() ? ChatActivityEnterViewAnimatedIconView.State.VIDEO : ChatActivityEnterViewAnimatedIconView.State.VOICE, true);
                }
                if (this.attachLayout != null) {
                    ViewPropertyAnimator viewPropertyAnimator5 = this.attachButtonAnimator;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.attachButtonAnimator = null;
                    }
                    this.attachLayoutTranslationX = 0.0f;
                    updateAttachLayoutParams();
                    i5 = 1;
                    r13 = 0;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.attachLayout, (Property<LinearLayout, Float>) this.ATTACH_LAYOUT_ALPHA, 1.0f));
                    ImageView imageView12 = this.attachButton;
                    this.attachButtonAlpha = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(imageView12, (Property<ImageView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<ImageView, Float>) property3, 1.0f));
                } else {
                    i5 = 1;
                    r13 = 0;
                }
                ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout5 = this.sideButtons;
                if (chatActivitySideControlsButtonsLayout5 != 0) {
                    chatActivitySideControlsButtonsLayout5.showButton(r13, r13, i5);
                }
                ImageView imageView13 = this.scheduledButton;
                if (imageView13 != null) {
                    float[] fArr16 = new float[i5];
                    fArr16[r13] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(imageView13, (Property<ImageView, Float>) property4, fArr16);
                    ValueAnimator valueAnimatorAnimateScheduledTranslationX4 = animateScheduledTranslationX(0.0f);
                    Animator[] animatorArr12 = new Animator[2];
                    animatorArr12[r13] = objectAnimatorOfFloat17;
                    animatorArr12[i5] = valueAnimatorAnimateScheduledTranslationX4;
                    animatorSet17.playTogether(animatorArr12);
                }
                animatorSet17.setDuration(150L);
                animatorSet17.setStartDelay(200L);
                AnimatorSet animatorSet18 = new AnimatorSet();
                TimerView timerView = this.recordTimerView;
                float[] fArr17 = new float[i5];
                fArr17[r13] = 0.0f;
                ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(timerView, (Property<TimerView, Float>) property4, fArr17);
                TimerView timerView2 = this.recordTimerView;
                float[] fArr18 = new float[i5];
                fArr18[r13] = AndroidUtilities.dp(40.0f);
                ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(timerView2, (Property<TimerView, Float>) property, fArr18);
                SlideTextView slideTextView3 = this.slideText;
                float[] fArr19 = new float[i5];
                fArr19[r13] = 0.0f;
                ObjectAnimator objectAnimatorOfFloat20 = ObjectAnimator.ofFloat(slideTextView3, (Property<SlideTextView, Float>) property4, fArr19);
                SlideTextView slideTextView4 = this.slideText;
                float[] fArr20 = new float[i5];
                fArr20[r13] = AndroidUtilities.dp(40.0f);
                ObjectAnimator objectAnimatorOfFloat21 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property, fArr20);
                Animator[] animatorArr13 = new Animator[4];
                animatorArr13[r13] = objectAnimatorOfFloat18;
                animatorArr13[i5] = objectAnimatorOfFloat19;
                animatorArr13[2] = objectAnimatorOfFloat20;
                animatorArr13[3] = objectAnimatorOfFloat21;
                animatorSet18.playTogether(animatorArr13);
                animatorSet18.setDuration(150L);
                float[] fArr21 = new float[i5];
                fArr21[r13] = 1.0f;
                ObjectAnimator objectAnimatorOfFloat22 = ObjectAnimator.ofFloat(this, "exitTransition", fArr21);
                objectAnimatorOfFloat22.setDuration(this.messageTransitionIsRunning ? 220L : 360L);
                this.messageTextTranslationX = 0.0f;
                updateMessageTextParams();
                ObjectAnimator objectAnimatorOfFloat23 = ObjectAnimator.ofFloat(this.messageEditText, (Property<EditTextCaption, Float>) property4, 1.0f);
                objectAnimatorOfFloat23.setStartDelay(this.emojiButtonPaddingAlpha == 1.0f ? 150L : 450L);
                objectAnimatorOfFloat23.setDuration(200L);
                this.runningAnimationAudio.playTogether(animatorSet17, animatorSet18, objectAnimatorOfFloat23, objectAnimatorOfFloat22);
            }
            this.runningAnimationAudio.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatActivityEnterView.this.runningAnimationAudio)) {
                        if (i != 3 && ChatActivityEnterView.this.messageEditText != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            ChatActivityEnterView.this.messageEditText.requestFocus();
                        }
                        ChatActivityEnterView.this.cancelRecordInterfaceInternal();
                        if (i != 3) {
                            ControlsView controlsView8 = ChatActivityEnterView.this.controlsView;
                            if (controlsView8 != null) {
                                controlsView8.setVisibility(8);
                            }
                            if (ChatActivityEnterView.this.recordCircle != null) {
                                ChatActivityEnterView.this.recordCircle.setSendButtonInvisible();
                            }
                        }
                    }
                }
            });
            this.runningAnimationAudio.start();
            TimerView timerView3 = this.recordTimerView;
            if (timerView3 != null) {
                timerView3.stop();
            }
        }
        this.delegate.onAudioVideoInterfaceUpdated();
        updateSendAsButton();
        this.lastRecordState = i;
    }

    public static void m2112$r8$lambda$ztQtTol6fOqstGxDdDC3ACeL4(ChatActivityEnterView chatActivityEnterView, ValueAnimator valueAnimator) {
        chatActivityEnterView.getClass();
        chatActivityEnterView.recordCircle.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
        if (!chatActivityEnterView.isInVideoMode()) {
            chatActivityEnterView.audioTimelineView.setAlpha(chatActivityEnterView.recordCircle.getTransformToSeekbarProgressStep3());
            chatActivityEnterView.audioTimelineView.invalidate();
        }
        chatActivityEnterView.isRecordingStateChanged();
    }

    public void cancelRecordInterfaceInternal() {
        FrameLayout frameLayout = this.recordPanel;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.runningAnimationAudio = null;
        isRecordingStateChanged();
        if (this.attachLayout != null) {
            this.attachLayoutTranslationX = 0.0f;
            updateAttachLayoutParams();
        }
        SlideTextView slideTextView = this.slideText;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.delegate.onAudioVideoInterfaceUpdated();
        updateSendAsButton();
    }

    private void createRecordPanel() {
        if (this.recordPanel != null || getContext() == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext()) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return super.onTouchEvent(motionEvent);
            }
        };
        this.recordPanel = frameLayout;
        frameLayout.setClipChildren(false);
        this.recordPanel.setVisibility(8);
        this.messageEditTextContainer.addView(this.recordPanel, LayoutHelper.createFrame(-1, 44.0f));
        this.recordPanel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ChatActivityEnterView.$r8$lambda$1GqsLXvX_QIt91kWc3l4wdvEQ6I(view, motionEvent);
            }
        });
        FrameLayout frameLayout2 = this.recordPanel;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.slideText = slideTextView;
        frameLayout2.addView(slideTextView, LayoutHelper.createFrame(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.recordTimeContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.recordTimeContainer.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
        this.recordTimeContainer.setFocusable(false);
        LinearLayout linearLayout2 = this.recordTimeContainer;
        RecordDot recordDot = new RecordDot(getContext());
        this.recordDot = recordDot;
        linearLayout2.addView(recordDot, LayoutHelper.createLinear(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.recordTimeContainer;
        TimerView timerView = new TimerView(getContext());
        this.recordTimerView = timerView;
        linearLayout3.addView(timerView, LayoutHelper.createLinear(-1, -1, 16, 6, 0, 0, 0));
        this.recordPanel.addView(this.recordTimeContainer, LayoutHelper.createFrame(-1, -1, 16));
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View viewFindChildViewUnder;
        if (this.recordingAudioVideo) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (viewFindChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.birthdayHint && viewFindChildViewUnder != this.aiHint) {
            hideHints();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setDelegate(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
        this.delegate = chatActivityEnterViewDelegate;
    }

    public void setCommand(MessageObject messageObject, String str, boolean z, boolean z2) {
        EditTextCaption editTextCaption;
        String str2;
        if (str == null || getVisibility() != 0 || (editTextCaption = this.messageEditText) == null) {
            return;
        }
        Object user = null;
        if (z) {
            String string = editTextCaption.getText().toString();
            if (messageObject != null && DialogObject.isChatDialog(this.dialog_id)) {
                user = this.accountInstance.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
            }
            ?? r1 = user;
            if ((this.botCount != 1 || z2) && r1 != 0 && r1.bot && !str.contains("@")) {
                str2 = String.format(Locale.US, "%s@%s", str, UserObject.getPublicUsername(r1)) + " " + string.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", "");
            } else {
                str2 = str + " " + string.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", "");
            }
            this.ignoreTextChange = true;
            this.messageEditText.setText(str2);
            EditTextCaption editTextCaption2 = this.messageEditText;
            editTextCaption2.setSelection(editTextCaption2.getText().length());
            this.ignoreTextChange = false;
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onTextChanged(this.messageEditText.getText(), true, false);
            }
            if (this.keyboardVisible || this.currentPopupContentType != -1) {
                return;
            }
            openKeyboard();
            return;
        }
        if (this.slowModeTimer > 0 && !isInScheduleMode()) {
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = this.delegate;
            if (chatActivityEnterViewDelegate2 != null) {
                SlowModeBtn slowModeBtn = this.slowModeButton;
                chatActivityEnterViewDelegate2.onUpdateSlowModeButton(slowModeBtn, true, slowModeBtn.getText());
                return;
            }
            return;
        }
        TLRPC.User user2 = (messageObject == null || !DialogObject.isChatDialog(this.dialog_id)) ? null : this.accountInstance.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
        SendMessagesHelper.SendMessageParams sendMessageParamsOf = ((this.botCount != 1 || z2) && user2 != null && user2.bot && !str.contains("@")) ? SendMessagesHelper.SendMessageParams.of(String.format(Locale.US, "%s@%s", str, UserObject.getPublicUsername(user2)), this.dialog_id, this.replyingMessageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false) : SendMessagesHelper.SendMessageParams.of(str, this.dialog_id, this.replyingMessageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
        ChatActivity chatActivity = this.parentFragment;
        sendMessageParamsOf.sendMessageChatArguments = chatActivity != null ? chatActivity.getMessageChatSendParams() : null;
        sendMessageParamsOf.effect_id = this.effectId;
        SendButton sendButton = this.sendButton;
        this.effectId = 0L;
        sendButton.setEffect(0L);
        applyStoryToSendMessageParams(sendMessageParamsOf);
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.editingBusinessLink = tL_businessChatLink;
        updateFieldHint(false);
        if (this.editingBusinessLink != null) {
            AnimatorSet animatorSet = this.doneButtonAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.doneButtonAnimation = null;
            }
            createDoneButton(true);
            this.doneButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.saveBusinessLink();
                }
            });
            this.doneButton.setContentDescription(LocaleController.getString(R.string.Done));
            this.doneButton.setVisibility(0);
            this.doneButton.setScaleX(0.1f);
            this.doneButton.setScaleY(0.1f);
            this.doneButton.setAlpha(0.0f);
            this.doneButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            this.currentLimit = this.accountInstance.getMessagesController().getMaxMessageLength();
            EditTextCaption editTextCaption = this.messageEditText;
            TextPaint paint = editTextCaption != null ? editTextCaption.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.editingBusinessLink.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(applyMessageEntities(arrayList, str, fontMetricsInt));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.lastSavedBusinessLinkMessage = calculateBusinessLinkPresetMessage();
            setAllowStickersAndGifs(true, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.cancelBotButton.setVisibility(8);
            this.audioVideoButtonContainer.setVisibility(8);
            LinearLayout linearLayout = this.attachLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ImageView imageView = this.attachButton;
            if (imageView != null) {
                this.attachButtonAlpha = 0.0f;
                imageView.setAlpha(0.0f);
                this.attachButton.setScaleX(0.5f);
                this.attachButton.setScaleY(0.5f);
            }
            this.sendButtonContainer.setVisibility(8);
            ImageView imageView2 = this.scheduledButton;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j) {
        this.effectId = j;
        SendButton sendButton = this.sendButton;
        if (sendButton != null) {
            sendButton.setEffect(j);
        }
    }

    public long getEffectId() {
        return this.effectId;
    }

    private MessageObject editingMessageObjectPreview(MessageObject messageObject, boolean z) {
        MessageObject messageObject2 = new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true) {
            @Override
            public boolean isOutOwner() {
                return true;
            }

            @Override
            public boolean needDrawShareButton() {
                return false;
            }
        };
        if (z) {
            EditTextCaption editTextCaption = this.messageEditText;
            CharSequence[] charSequenceArr = {editTextCaption == null ? "" : editTextCaption.getTextToUse()};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, Theme.chat_msgTextPaint.getFontMetricsInt(), false, (int[]) null), entities, Theme.chat_msgTextPaint.getFontMetricsInt());
        }
        return messageObject2;
    }

    public void setEditingMessageObject(final MessageObject messageObject, final MessageObject.GroupedMessages groupedMessages, boolean z) {
        float f;
        CharSequence charSequence;
        final CharSequence charSequenceApplyMessageEntities;
        int i;
        if (this.audioToSend == null && this.videoToSendMessageObject == null && this.editingMessageObject != messageObject) {
            createMessageEditText();
            boolean z2 = this.editingMessageObject != null;
            this.editingMessageObject = messageObject;
            this.editingCaption = z;
            if (messageObject != null) {
                this.captionAbove = groupedMessages != null ? groupedMessages.captionAbove : messageObject.messageOwner.invert_media;
                AnimatorSet animatorSet = this.doneButtonAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.doneButtonAnimation = null;
                }
                createDoneButton(false);
                this.doneButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.doneEditingMessage();
                    }
                });
                if (this.editingMessageObject.needResendWhenEdit()) {
                    long j = this.paidMessagesPrice;
                    if (j > 0) {
                        this.doneButton.setStarsPrice(j, 1, true);
                        this.doneButton.setLayoutParams(LayoutHelper.createFrame(44, 44, 85));
                        this.doneButton.requestLayout();
                    } else {
                        this.doneButton.setStarsPrice(0L, 1, true);
                        this.doneButton.setLayoutParams(LayoutHelper.createFrame(44, 44, 85));
                        this.doneButton.requestLayout();
                    }
                } else {
                    this.doneButton.setStarsPrice(0L, 1, true);
                    this.doneButton.setLayoutParams(LayoutHelper.createFrame(44, 44, 85));
                    this.doneButton.requestLayout();
                }
                this.doneButton.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        return ChatActivityEnterView.m2086$r8$lambda$9PrlIsJxL8OVOuv1lHBLmnanw(this.f$0, messageObject, groupedMessages, view);
                    }
                });
                this.doneButton.setVisibility(0);
                this.doneButton.setScaleX(0.1f);
                this.doneButton.setScaleY(0.1f);
                this.doneButton.setAlpha(0.0f);
                this.doneButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                if (z) {
                    this.currentLimit = this.accountInstance.getMessagesController().maxCaptionLength;
                    charSequence = this.editingMessageObject.caption;
                } else {
                    this.currentLimit = this.accountInstance.getMessagesController().getMaxMessageLength();
                    charSequence = this.editingMessageObject.messageText;
                }
                if (charSequence != null) {
                    EditTextCaption editTextCaption = this.messageEditText;
                    TextPaint paint = editTextCaption != null ? editTextCaption.getPaint() : null;
                    if (paint == null) {
                        paint = new TextPaint();
                        paint.setTextSize(AndroidUtilities.dp(18.0f));
                    }
                    charSequenceApplyMessageEntities = applyMessageEntities(this.editingMessageObject.messageOwner.entities, charSequence, paint.getFontMetricsInt());
                } else {
                    charSequenceApplyMessageEntities = "";
                }
                if (this.draftMessage == null && !z2) {
                    EditTextCaption editTextCaption2 = this.messageEditText;
                    this.draftMessage = (editTextCaption2 == null || editTextCaption2.length() <= 0) ? null : this.messageEditText.getText();
                    this.draftSearchWebpage = this.messageWebPageSearch;
                }
                MessageObject messageObject2 = this.editingMessageObject;
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                this.messageWebPageSearch = !((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.manual) && ((i = messageObject2.type) == 0 || i == 19);
                if (!this.keyboardVisible) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            ChatActivityEnterView.m2104$r8$lambda$kG6lGr3RnxhQtQMlOxUM243by4(this.f$0, charSequenceApplyMessageEntities);
                        }
                    };
                    this.setTextFieldRunnable = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 200L);
                } else {
                    Runnable runnable2 = this.setTextFieldRunnable;
                    if (runnable2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                        this.setTextFieldRunnable = null;
                    }
                    setFieldText(charSequenceApplyMessageEntities);
                }
                EditTextCaption editTextCaption3 = this.messageEditText;
                if (editTextCaption3 != null) {
                    editTextCaption3.requestFocus();
                }
                openKeyboard();
                EditTextCaption editTextCaption4 = this.messageEditText;
                if (editTextCaption4 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) editTextCaption4.getLayoutParams();
                    layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    this.messageEditText.setLayoutParams(layoutParams);
                }
                FrameLayout frameLayout = this.recordedAudioPanel;
                if (frameLayout != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams2.rightMargin = 0;
                    this.recordedAudioPanel.setLayoutParams(layoutParams2);
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(false);
                this.cancelBotButton.setVisibility(8);
                this.audioVideoButtonContainer.setVisibility(8);
                this.attachLayout.setVisibility(8);
                ImageView imageView = this.attachButton;
                if (imageView != null) {
                    this.attachButtonAlpha = 0.0f;
                    imageView.setAlpha(0.0f);
                    this.attachButton.setScaleX(0.5f);
                    this.attachButton.setScaleY(0.5f);
                }
                this.sendButtonContainer.setVisibility(8);
                ImageView imageView2 = this.scheduledButton;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            } else {
                Runnable runnable3 = this.setTextFieldRunnable;
                if (runnable3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable3);
                    this.setTextFieldRunnable = null;
                }
                SendButton sendButton = this.doneButton;
                if (sendButton != null) {
                    sendButton.setVisibility(8);
                }
                this.currentLimit = -1;
                this.delegate.onMessageEditEnd(false);
                this.sendButtonContainer.setVisibility(0);
                this.cancelBotButton.setScaleX(0.1f);
                this.cancelBotButton.setScaleY(0.1f);
                this.cancelBotButton.setAlpha(0.0f);
                this.cancelBotButton.setVisibility(8);
                if (this.slowModeTimer > 0 && !isInScheduleMode()) {
                    if (this.slowModeTimer == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        this.slowModeButton.setScaleX(0.1f);
                        this.slowModeButton.setScaleY(0.1f);
                        this.slowModeButton.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                    } else {
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        this.slowModeButton.setScaleX(1.0f);
                        this.slowModeButton.setScaleY(1.0f);
                        this.slowModeButton.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    this.attachLayout.setScaleX(0.01f);
                    this.attachLayoutAlpha = 0.0f;
                    updateAttachLayoutParams();
                    this.attachLayout.setVisibility(8);
                    ImageView imageView3 = this.attachButton;
                    if (imageView3 != null) {
                        this.attachButtonAlpha = 0.0f;
                        imageView3.setAlpha(0.0f);
                        this.attachButton.setScaleX(0.5f);
                        this.attachButton.setScaleY(0.5f);
                    }
                    this.audioVideoButtonContainer.setScaleX(0.1f);
                    this.audioVideoButtonContainer.setScaleY(0.1f);
                    this.audioVideoButtonContainer.setAlpha(0.0f);
                    this.audioVideoButtonContainer.setVisibility(8);
                    f = 1.0f;
                } else {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    this.slowModeButton.setScaleX(0.1f);
                    this.slowModeButton.setScaleY(0.1f);
                    this.slowModeButton.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f = 1.0f;
                    this.attachLayout.setScaleX(1.0f);
                    this.attachLayoutAlpha = 1.0f;
                    updateAttachLayoutParams();
                    this.attachLayout.setVisibility(0);
                    ImageView imageView4 = this.attachButton;
                    if (imageView4 != null) {
                        this.attachButtonAlpha = 1.0f;
                        imageView4.setAlpha(1.0f);
                        this.attachButton.setScaleX(1.0f);
                        this.attachButton.setScaleY(1.0f);
                    }
                    this.audioVideoButtonContainer.setScaleX(1.0f);
                    this.audioVideoButtonContainer.setScaleY(1.0f);
                    this.audioVideoButtonContainer.setAlpha(1.0f);
                    this.audioVideoButtonContainer.setVisibility(0);
                }
                createScheduledButton();
                ImageView imageView5 = this.scheduledButton;
                if (imageView5 != null && imageView5.getTag() != null) {
                    this.scheduledButton.setScaleX(f);
                    this.scheduledButton.setScaleY(f);
                    this.scheduledButton.setAlpha(f);
                    this.scheduledButton.setVisibility(0);
                }
                ChatActivity chatActivity = this.parentFragment;
                if (chatActivity != null) {
                    chatActivity.editingMessageObject = null;
                    chatActivity.foundWebPage = null;
                    MessagePreviewParams messagePreviewParams = chatActivity.messagePreviewParams;
                    if (messagePreviewParams != null) {
                        messagePreviewParams.updateLink(this.currentAccount, null, "", null, null, null);
                    }
                    setWebPage(null, true);
                    this.parentFragment.fallbackFieldPanel();
                }
                createMessageEditText();
                EditTextCaption editTextCaption5 = this.messageEditText;
                if (editTextCaption5 != null) {
                    editTextCaption5.setText(this.draftMessage);
                    EditTextCaption editTextCaption6 = this.messageEditText;
                    editTextCaption6.setSelection(editTextCaption6.length());
                }
                this.draftMessage = null;
                this.messageWebPageSearch = this.draftSearchWebpage;
                if (getVisibility() == 0) {
                    this.delegate.onAttachButtonShow();
                }
                updateFieldRight(1);
            }
            updateFieldHint(true);
            updateSendAsButton(true);
            updateButtons();
            updateRichDraftPreview();
        }
    }

    public static boolean m2086$r8$lambda$9PrlIsJxL8OVOuv1lHBLmnanw(final ChatActivityEnterView chatActivityEnterView, final MessageObject messageObject, final MessageObject.GroupedMessages groupedMessages, View view) {
        EditTextCaption editTextCaption;
        int i;
        chatActivityEnterView.getClass();
        if (messageObject.isMediaEmpty() || (editTextCaption = chatActivityEnterView.messageEditText) == null || TextUtils.isEmpty(editTextCaption.getTextToUse()) || ((groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) || ((i = messageObject.type) != 1 && i != 3 && i != 8))) {
            return false;
        }
        final MessageSendPreview messageSendPreview = new MessageSendPreview(chatActivityEnterView.getContext(), chatActivityEnterView.resourcesProvider);
        messageSendPreview.allowRelayout = true;
        final ArrayList arrayList = new ArrayList();
        if (groupedMessages != null) {
            int i2 = 0;
            while (i2 < groupedMessages.messages.size()) {
                arrayList.add(chatActivityEnterView.editingMessageObjectPreview(groupedMessages.messages.get(i2), i2 == 0));
                i2++;
            }
        } else {
            arrayList.add(chatActivityEnterView.editingMessageObjectPreview(messageObject, true));
        }
        messageSendPreview.setMessageObjects(arrayList);
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(chatActivityEnterView.sizeNotifierLayout, chatActivityEnterView.resourcesProvider, chatActivityEnterView.doneButton);
        final MessagePreviewView.ToggleButton toggleButton = new MessagePreviewView.ToggleButton(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.resourcesProvider);
        toggleButton.setState(!chatActivityEnterView.captionAbove, false);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChatActivityEnterView.$r8$lambda$Cbk4ZVcdh35DEF9IgSmJKMTnL7M(this.f$0, arrayList, toggleButton, messageSendPreview, view2);
            }
        });
        itemOptionsMakeOptions.addView(toggleButton);
        itemOptionsMakeOptions.setupSelectors();
        messageSendPreview.setItemOptions(itemOptionsMakeOptions);
        messageSendPreview.setSendButton(chatActivityEnterView.doneButton, false, new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChatActivityEnterView.$r8$lambda$pYk5myhAayaHE0QsZjwVLj_gdv8(this.f$0, groupedMessages, messageObject, messageSendPreview, view2);
            }
        });
        messageSendPreview.show();
        return true;
    }

    public static void $r8$lambda$Cbk4ZVcdh35DEF9IgSmJKMTnL7M(ChatActivityEnterView chatActivityEnterView, ArrayList arrayList, MessagePreviewView.ToggleButton toggleButton, MessageSendPreview messageSendPreview, View view) {
        chatActivityEnterView.captionAbove = !chatActivityEnterView.captionAbove;
        for (int i = 0; i < arrayList.size(); i++) {
            ((MessageObject) arrayList.get(i)).messageOwner.invert_media = chatActivityEnterView.captionAbove;
        }
        toggleButton.setState(!chatActivityEnterView.captionAbove, true);
        if (!arrayList.isEmpty()) {
            messageSendPreview.changeMessage((MessageObject) arrayList.get(0));
        }
        messageSendPreview.scrollTo(!chatActivityEnterView.captionAbove);
    }

    public static void $r8$lambda$pYk5myhAayaHE0QsZjwVLj_gdv8(ChatActivityEnterView chatActivityEnterView, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, MessageSendPreview messageSendPreview, View view) {
        chatActivityEnterView.getClass();
        if (groupedMessages != null) {
            ArrayList<MessageObject> arrayList = groupedMessages.messages;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                MessageObject messageObject2 = arrayList.get(i);
                i++;
                messageObject2.messageOwner.invert_media = chatActivityEnterView.captionAbove;
            }
            groupedMessages.calculate();
        } else {
            messageObject.messageOwner.invert_media = chatActivityEnterView.captionAbove;
        }
        chatActivityEnterView.doneEditingMessage();
        messageSendPreview.dismiss(true);
        chatActivityEnterView.captionAbove = false;
    }

    public static void m2104$r8$lambda$kG6lGr3RnxhQtQMlOxUM243by4(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence) {
        chatActivityEnterView.setFieldText(charSequence);
        chatActivityEnterView.setTextFieldRunnable = null;
    }

    public static CharSequence applyMessageEntities(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        AnimatedEmojiSpan animatedEmojiSpan;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(FormattedDateSpan.restoreFormatedDateEntities(charSequence));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            URLSpanUserMention uRLSpanUserMention = new URLSpanUserMention("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3);
                            int i2 = messageEntity.offset;
                            spannableStringBuilder.setSpan(uRLSpanUserMention, i2, messageEntity.length + i2, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            URLSpanUserMention uRLSpanUserMention2 = new URLSpanUserMention("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3);
                            int i3 = messageEntity.offset;
                            spannableStringBuilder.setSpan(uRLSpanUserMention2, i3, messageEntity.length + i3, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                            textStyleRun.flags |= 4;
                            TextStyleSpan textStyleSpan = new TextStyleSpan(textStyleRun);
                            int i4 = messageEntity.offset;
                            MediaDataController.addStyleToText(textStyleSpan, i4, messageEntity.length + i4, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun();
                                textStyleRun2.flags |= 1;
                                TextStyleSpan textStyleSpan2 = new TextStyleSpan(textStyleRun2);
                                int i5 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan2, i5, messageEntity.length + i5, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                TextStyleSpan.TextStyleRun textStyleRun3 = new TextStyleSpan.TextStyleRun();
                                textStyleRun3.flags |= 2;
                                TextStyleSpan textStyleSpan3 = new TextStyleSpan(textStyleRun3);
                                int i6 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan3, i6, messageEntity.length + i6, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                TextStyleSpan.TextStyleRun textStyleRun4 = new TextStyleSpan.TextStyleRun();
                                textStyleRun4.flags |= 8;
                                TextStyleSpan textStyleSpan4 = new TextStyleSpan(textStyleRun4);
                                int i7 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan4, i7, messageEntity.length + i7, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                TextStyleSpan.TextStyleRun textStyleRun5 = new TextStyleSpan.TextStyleRun();
                                textStyleRun5.flags |= 16;
                                TextStyleSpan textStyleSpan5 = new TextStyleSpan(textStyleRun5);
                                int i8 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan5, i8, messageEntity.length + i8, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                URLSpanReplacement uRLSpanReplacement = new URLSpanReplacement(messageEntity.url);
                                int i9 = messageEntity.offset;
                                spannableStringBuilder.setSpan(uRLSpanReplacement, i9, messageEntity.length + i9, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                TextStyleSpan.TextStyleRun textStyleRun6 = new TextStyleSpan.TextStyleRun();
                                textStyleRun6.flags |= 128;
                                int i10 = messageEntity.offset;
                                textStyleRun6.start = i10;
                                textStyleRun6.end = i10 + messageEntity.length;
                                textStyleRun6.urlEntity = messageEntity;
                                int i11 = messageEntity.offset;
                                FormattedDateSpan formattedDateSpan = new FormattedDateSpan(spannableStringBuilder.subSequence(i11, messageEntity.length + i11).toString(), textStyleRun6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i12 = messageEntity.offset;
                                spannableStringBuilder.setSpan(formattedDateSpan, i12, messageEntity.length + i12, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                TextStyleSpan.TextStyleRun textStyleRun7 = new TextStyleSpan.TextStyleRun();
                                textStyleRun7.flags |= 256;
                                TextStyleSpan textStyleSpan6 = new TextStyleSpan(textStyleRun7);
                                int i13 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan6, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    animatedEmojiSpan = new AnimatedEmojiSpan(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    animatedEmojiSpan = new AnimatedEmojiSpan(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i14 = messageEntity.offset;
                                spannableStringBuilder.setSpan(animatedEmojiSpan, i14, messageEntity.length + i14, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        QuoteSpan.mergeQuotes(spannableStringBuilder, arrayList);
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, (int[]) null);
        if (arrayList != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(size);
                    if ((messageEntity2 instanceof TLRPC.TL_messageEntityPre) && messageEntity2.offset + messageEntity2.length <= charSequenceReplaceEmoji.length()) {
                        if (!(charSequenceReplaceEmoji instanceof Spannable)) {
                            charSequenceReplaceEmoji = new SpannableStringBuilder(charSequenceReplaceEmoji);
                        }
                        ((SpannableStringBuilder) charSequenceReplaceEmoji).insert(messageEntity2.offset + messageEntity2.length, (CharSequence) "```\n");
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequenceReplaceEmoji;
                        int i15 = messageEntity2.offset;
                        StringBuilder sb = new StringBuilder();
                        sb.append("```");
                        String str = messageEntity2.language;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append("\n");
                        spannableStringBuilder2.insert(i15, (CharSequence) sb.toString());
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return charSequenceReplaceEmoji;
    }

    public ImageView getAttachButton() {
        return this.attachButton;
    }

    public ImageView getSuggestButton() {
        return this.suggestButton;
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.audioVideoButtonContainer;
    }

    public View getSendButtonInternal() {
        return this.sendButton;
    }

    public void setBlockedByStreaming(BotForumHelper.SteamingSendButtonState steamingSendButtonState, boolean z) {
        boolean z2 = steamingSendButtonState != BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        boolean z3 = steamingSendButtonState == BotForumHelper.SteamingSendButtonState.STOP;
        this.sendButtonBlockedByTypingView.setStopAllowed(z3, z && this.animatorIsBlockedByStreaming.getFloatValue() > 0.0f);
        this.sendButtonBlockedByTypingView.setClickable(z3);
        this.sendButtonBlockedByTypingView.setEnabled(z3);
        boolean z4 = this.animatorIsBlockedByStreaming.getValue() != z2;
        this.animatorIsBlockedByStreaming.setValue(z2, z);
        this.streamingState = steamingSendButtonState;
        if (z4) {
            checkSendButton(z);
        }
    }

    public ValueAnimator animateSendButton(boolean z) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f = z ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f2 = z ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f3 = z ? 1.0f : 0.1f;
        if (z && alpha < 0.25f && (getSendButtonInternal() instanceof SendButton)) {
            ((SendButton) getSendButtonInternal()).appear();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatActivityEnterView.m2105$r8$lambda$kTWWY0PJA3KbmzG6GjL1UyZmo(this.f$0, alpha, f, scaleX, f2, scaleY, f3, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public static void m2105$r8$lambda$kTWWY0PJA3KbmzG6GjL1UyZmo(ChatActivityEnterView chatActivityEnterView, float f, float f2, float f3, float f4, float f5, float f6, ValueAnimator valueAnimator) {
        chatActivityEnterView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatActivityEnterView.getSendButtonInternal().setAlpha(AndroidUtilities.lerp(f, f2, fFloatValue));
        chatActivityEnterView.getSendButtonInternal().setScaleX(AndroidUtilities.lerp(f3, f4, fFloatValue));
        chatActivityEnterView.getSendButtonInternal().setScaleY(AndroidUtilities.lerp(f5, f6, fFloatValue));
    }

    public View getAudioVideoButtonContainer() {
        return this.audioVideoButtonContainer;
    }

    public View getEmojiButton() {
        return this.emojiButton;
    }

    public EmojiView getEmojiView() {
        return this.emojiView;
    }

    public TrendingStickersAlert getTrendingStickersAlert() {
        return this.trendingStickersAlert;
    }

    @Override
    public void updateColors() {
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.updateColors();
        }
        updateRecordedDeleteIconColors();
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.updateColors();
        }
        RecordDot recordDot = this.recordDot;
        if (recordDot != null) {
            recordDot.updateColors();
        }
        SlideTextView slideTextView = this.slideText;
        if (slideTextView != null) {
            slideTextView.updateColors();
        }
        TimerView timerView = this.recordTimerView;
        if (timerView != null) {
            timerView.updateColors();
        }
        VideoTimelineView videoTimelineView = this.videoTimelineView;
        if (videoTimelineView != null) {
            videoTimelineView.updateColors();
        }
        NumberTextView numberTextView = this.captionLimitView;
        if (numberTextView != null && this.messageEditText != null) {
            if (this.codePointCount - this.currentLimit < 0) {
                numberTextView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
            } else {
                numberTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
            }
        }
        int themedColor = getThemedColor(Theme.key_chat_messagePanelVoicePressed);
        int iAlpha = Color.alpha(themedColor);
        Drawable drawable = this.doneCheckDrawable;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(themedColor, (int) (iAlpha * ((this.doneButtonEnabledProgress * 0.42f) + 0.58f))), PorterDuff.Mode.MULTIPLY));
        }
        BotCommandsMenuContainer botCommandsMenuContainer = this.botCommandsMenuContainer;
        if (botCommandsMenuContainer != null) {
            botCommandsMenuContainer.updateColors();
        }
        BotKeyboardView botKeyboardView = this.botKeyboardView;
        if (botKeyboardView != null) {
            botKeyboardView.updateColors();
        }
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.audioVideoSendButton;
        int themedColor2 = this.audioVideoButtonContainerForbidden ? getThemedColor(Theme.key_glass_defaultIcon) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        chatActivityEnterViewAnimatedIconView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView2 = this.emojiButton;
        int i = Theme.key_glass_defaultIcon;
        chatActivityEnterViewAnimatedIconView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i), mode));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView3 = this.emojiButton;
        int i2 = Theme.key_listSelector;
        chatActivityEnterViewAnimatedIconView3.setBackground(Theme.createSelectorDrawable(getThemedColor(i2)));
        this.deleteRichDraftButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i), mode));
        this.deleteRichDraftButton.setBackground(Theme.createInsetRoundRectDrawable(getThemedColor(i2), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(3.0f)));
        this.sendOutlineView.setColorFilter(getThemedColor(Theme.key_telegram_color), mode);
    }

    private void updateRecordedDeleteIconColors() {
        int themedColor = getThemedColor(Theme.key_chat_recordedVoiceDot);
        int themedColor2 = getThemedColor(Theme.key_chat_messagePanelBackground);
        int themedColor3 = getThemedColor(Theme.key_chat_messagePanelVoiceDelete);
        RLottieImageView rLottieImageView = this.recordDeleteImageView;
        if (rLottieImageView != null) {
            rLottieImageView.setLayerColor("Cup Red", themedColor);
            this.recordDeleteImageView.setLayerColor("Box Red", themedColor);
            this.recordDeleteImageView.setLayerColor("Cup Grey", themedColor3);
            this.recordDeleteImageView.setLayerColor("Box Grey", themedColor3);
            this.recordDeleteImageView.setLayerColor("Line 1", themedColor2);
            this.recordDeleteImageView.setLayerColor("Line 2", themedColor2);
            this.recordDeleteImageView.setLayerColor("Line 3", themedColor2);
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        setFieldText(charSequence, true, false);
    }

    public void setFieldText(CharSequence charSequence, boolean z) {
        setFieldText(charSequence, z, false);
    }

    public void setFieldText(CharSequence charSequence, boolean z, boolean z2) {
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate;
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return;
        }
        this.ignoreTextChange = z;
        editTextCaption.setText(charSequence);
        this.messageEditText.invalidateQuotes(true);
        EditTextCaption editTextCaption2 = this.messageEditText;
        editTextCaption2.setSelection(editTextCaption2.getText().length());
        this.ignoreTextChange = false;
        if (!z || (chatActivityEnterViewDelegate = this.delegate) == null) {
            return;
        }
        chatActivityEnterViewDelegate.onTextChanged(this.messageEditText.getText(), true, z2);
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        if (draftVoice == null) {
            return;
        }
        this.voiceOnce = draftVoice.once;
        ControlsView controlsView = this.controlsView;
        if (controlsView != null) {
            controlsView.periodDrawable.setValue(1, this.voiceOnce, true);
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        TL_stories.StoryItem replyToStory = chatActivityEnterViewDelegate != null ? chatActivityEnterViewDelegate.getReplyToStory() : null;
        MediaController mediaController = MediaController.getInstance();
        int i = this.currentAccount;
        long j = this.dialog_id;
        MessageObject messageObject = this.replyingMessageObject;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments messageChatSendParams = null;
        int i2 = this.recordingGuid;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            messageChatSendParams = chatActivity.getMessageChatSendParams();
        }
        mediaController.prepareResumedRecording(i, draftVoice, j, messageObject, threadMessage, replyToStory, i2, messageChatSendParams, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public void setSelection(int i) {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return;
        }
        editTextCaption.setSelection(i, editTextCaption.length());
    }

    public int getCursorPosition() {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return 0;
        }
        return editTextCaption.getSelectionStart();
    }

    public int getSelectionLength() {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return 0;
        }
        try {
            return editTextCaption.getSelectionEnd() - this.messageEditText.getSelectionStart();
        } catch (Exception e) {
            FileLog.e(e);
            return 0;
        }
    }

    public void replaceWithText(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.messageEditText == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.messageEditText.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.messageEditText.setText(spannableStringBuilder);
            this.messageEditText.setSelection(i + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setFieldFocused() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.parentActivity.getSystemService("accessibility");
        if (this.messageEditText == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.messageEditText.requestFocus();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setFieldFocused(boolean z) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.parentActivity.getSystemService("accessibility");
        if (this.messageEditText == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z && BaseFragment.hasSheets(this.parentFragment)) {
            z = false;
        }
        if (z) {
            if (this.searchingType != 0 || this.messageEditText.isFocused()) {
                return;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.m2077$r8$lambda$SGxh9snnfxkA_n9XeqVHpArz18(this.f$0);
                }
            };
            this.focusRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 600L);
            return;
        }
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null || !editTextCaption.isFocused()) {
            return;
        }
        if (!this.keyboardVisible || this.isPaused) {
            this.messageEditText.clearFocus();
        }
    }

    public static void m2077$r8$lambda$SGxh9snnfxkA_n9XeqVHpArz18(ChatActivityEnterView chatActivityEnterView) {
        boolean z;
        EditTextCaption editTextCaption;
        ViewGroup view = null;
        chatActivityEnterView.focusRunnable = null;
        if (AndroidUtilities.isTablet()) {
            Activity activity = chatActivityEnterView.parentActivity;
            if (activity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity != null && launchActivity.getLayersActionBarLayout() != null) {
                    view = launchActivity.getLayersActionBarLayout().getView();
                }
                if (view == null || view.getVisibility() != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        if (chatActivityEnterView.isPaused || !z || (editTextCaption = chatActivityEnterView.messageEditText) == null) {
            return;
        }
        try {
            editTextCaption.requestFocus();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean hasText() {
        EditTextCaption editTextCaption = this.messageEditText;
        return editTextCaption != null && editTextCaption.length() > 0;
    }

    @Override
    public EditTextCaption getEditField() {
        return this.messageEditText;
    }

    public SenderSelectView getSenderSelectView() {
        return this.senderSelectView;
    }

    @Override
    public Editable getEditText() {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null) {
            return null;
        }
        return editTextCaption.getText();
    }

    public CharSequence getDraftMessage() {
        if (this.editingMessageObject != null) {
            if (TextUtils.isEmpty(this.draftMessage)) {
                return null;
            }
            return this.draftMessage;
        }
        if (this.messageEditText == null || !hasText()) {
            return null;
        }
        return this.messageEditText.getText();
    }

    @Override
    public CharSequence getFieldText() {
        if (this.messageEditText == null || !hasText()) {
            return null;
        }
        return this.messageEditText.getText();
    }

    public void openRichEditor() {
        RichEditor richEditor;
        if (this.messageEditText == null || this.parentFragment == null || !MessagesController.getInstance(this.currentAccount).richEditorAvailable()) {
            return;
        }
        TL_iv.RichMessage richMessage = this.richDraftMessage;
        if (richMessage != null) {
            richEditor = new RichEditor(richMessage);
        } else {
            Editable text = this.messageEditText.getText();
            CharSequence fieldMarkdown = parseFieldMarkdown(text);
            RichEditor richEditor2 = new RichEditor(fieldMarkdown);
            if (fieldMarkdown == text) {
                int selectionStart = this.messageEditText.getSelectionStart();
                int selectionEnd = this.messageEditText.getSelectionEnd();
                if (selectionStart < 0) {
                    selectionStart = this.messageEditText.length();
                }
                if (selectionEnd < 0) {
                    selectionEnd = selectionStart;
                }
                richEditor2.setInitialSelection(selectionStart, selectionEnd);
            }
            richEditor2.setOnCleared(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.$r8$lambda$FWxSy3OkItJM6vTB95Iqr_9_4XI(this.f$0);
                }
            });
            richEditor = richEditor2;
        }
        richEditor.setResourceProvider(this.resourcesProvider);
        richEditor.setChatActivity(this.parentFragment);
        richEditor.animateFrom(this.parentFragment);
        richEditor.setOnSent(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.m2084$r8$lambda$5naIU3ZJfb6oqKJ2KHYa54HBYw(this.f$0);
            }
        });
        this.parentFragment.presentFragment(richEditor);
    }

    public static void $r8$lambda$FWxSy3OkItJM6vTB95Iqr_9_4XI(ChatActivityEnterView chatActivityEnterView) {
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setText("");
        }
    }

    public static void m2084$r8$lambda$5naIU3ZJfb6oqKJ2KHYa54HBYw(ChatActivityEnterView chatActivityEnterView) {
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setText("");
        }
        chatActivityEnterView.checkSendButton(true);
    }

    public void openRichEditorWithHtml(CharSequence charSequence, String str, CharSequence charSequence2) {
        if (this.messageEditText == null || this.parentFragment == null || !MessagesController.getInstance(this.currentAccount).richEditorAvailable()) {
            return;
        }
        RichEditor htmlSurrounding = new RichEditor(str, true).setHtmlSurrounding(charSequence, charSequence2);
        htmlSurrounding.setResourceProvider(this.resourcesProvider);
        htmlSurrounding.setChatActivity(this.parentFragment);
        htmlSurrounding.animateFrom(this.parentFragment);
        htmlSurrounding.setOnCleared(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$aP4V1ATtacb4WgizFVg79pMb8cQ(this.f$0);
            }
        });
        htmlSurrounding.setOnSent(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.m2094$r8$lambda$KGlsZYYc3fpmsglJ9wEyJA18kk(this.f$0);
            }
        });
        this.parentFragment.presentFragment(htmlSurrounding);
    }

    public static void $r8$lambda$aP4V1ATtacb4WgizFVg79pMb8cQ(ChatActivityEnterView chatActivityEnterView) {
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setText("");
        }
    }

    public static void m2094$r8$lambda$KGlsZYYc3fpmsglJ9wEyJA18kk(ChatActivityEnterView chatActivityEnterView) {
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setText("");
        }
        chatActivityEnterView.checkSendButton(true);
    }

    public boolean handleRichHtmlPaste() {
        HashMap map;
        List list;
        if (this.messageEditText == null) {
            return false;
        }
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                String htmlText = primaryClip.getItemAt(0).getHtmlText();
                if (!TextUtils.isEmpty(htmlText) && (list = RichHtml.parse(htmlText, (map = new HashMap()))) != null && !list.isEmpty()) {
                    if (RichMessageConvert.isLossy(list, map)) {
                        if (!MessagesController.getInstance(this.currentAccount).richEditorAvailable()) {
                            return false;
                        }
                        int iMax = Math.max(0, this.messageEditText.getSelectionStart());
                        int iMin = Math.min(this.messageEditText.getText().length(), this.messageEditText.getSelectionEnd());
                        openRichEditorWithHtml(this.messageEditText.getText().subSequence(0, Math.min(iMax, iMin)), htmlText, this.messageEditText.getText().subSequence(Math.max(iMax, iMin), this.messageEditText.getText().length()));
                        return true;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(RichMessageConvert.rowsToCharSequence(list));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
                    AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class);
                    if (animatedEmojiSpanArr != null) {
                        for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                            animatedEmojiSpan.applyFontMetrics(this.messageEditText.getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
                        }
                    }
                    int iMax2 = Math.max(0, this.messageEditText.getSelectionStart());
                    int iMin2 = Math.min(this.messageEditText.getText().length(), this.messageEditText.getSelectionEnd());
                    QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr = (QuoteSpan.QuoteStyleSpan[]) this.messageEditText.getText().getSpans(iMax2, iMin2, QuoteSpan.QuoteStyleSpan.class);
                    if (quoteStyleSpanArr != null && quoteStyleSpanArr.length > 0) {
                        QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr2 = (QuoteSpan.QuoteStyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), QuoteSpan.QuoteStyleSpan.class);
                        for (int i = 0; i < quoteStyleSpanArr2.length; i++) {
                            spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i]);
                            spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i].span);
                        }
                    } else {
                        QuoteSpan.normalizeQuotes(spannableStringBuilder);
                    }
                    EditTextCaption editTextCaption = this.messageEditText;
                    editTextCaption.setText(editTextCaption.getText().replace(iMax2, iMin2, spannableStringBuilder));
                    this.messageEditText.setSelection(Math.min(iMax2 + spannableStringBuilder.length(), this.messageEditText.getText().length()));
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    private CharSequence parseFieldMarkdown(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && TextUtils.indexOf(charSequence, '`') >= 0) {
            try {
                CharSequence[] charSequenceArr = {new SpannableStringBuilder(charSequence)};
                ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                if (entities != null && !entities.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0]);
                    MessageObject.addEntitiesToText(spannableStringBuilder, entities, false, false, false, false);
                    return spannableStringBuilder;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return charSequence;
    }

    public boolean isRichDraftActive() {
        return this.richDraftActive;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.richDraftPreview == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAvailable()) {
            richMessage = null;
        }
        this.richDraftMessage = richMessage;
        updateRichDraftPreview();
    }

    private void updateRichDraftPreview() {
        RichMessageLayout.PreviewView previewView = this.richDraftPreview;
        if (previewView == null) {
            return;
        }
        boolean z = this.richDraftActive;
        boolean z2 = this.richDraftMessage != null && this.editingMessageObject == null;
        this.richDraftActive = z2;
        if (z2) {
            previewView.setResourcesProvider(this.resourcesProvider);
            this.richDraftPreview.set(this.richDraftMessage);
            this.richDraftPreview.setVisibility(0);
            EditTextCaption editTextCaption = this.messageEditText;
            if (editTextCaption != null) {
                editTextCaption.setVisibility(8);
            }
            this.emojiButton.setVisibility(8);
            this.deleteRichDraftButton.setVisibility(0);
            this.sendButton.setLocked(!UserConfig.getInstance(this.currentAccount).isPremium());
        } else {
            previewView.setVisibility(8);
            EditTextCaption editTextCaption2 = this.messageEditText;
            if (editTextCaption2 != null) {
                editTextCaption2.setVisibility(0);
            }
            this.emojiButton.setVisibility(0);
            this.deleteRichDraftButton.setVisibility(8);
            this.sendButton.setLocked(false);
        }
        updateButtons();
        if (z != this.richDraftActive) {
            checkSendButton(true);
        }
    }

    private void updateButtons() {
        EditTextCaption editTextCaption = this.messageEditText;
        boolean z = false;
        showAiButton((editTextCaption == null || editTextCaption.getLineCount() <= 2 || this.messageEditText.getText() == null || TextUtils.isEmpty(this.messageEditText.getText().toString().trim())) ? false : true);
        EditTextCaption editTextCaption2 = this.messageEditText;
        if (editTextCaption2 != null && editTextCaption2.getLineCount() > 2 && this.messageEditText.getText() != null && !TextUtils.isEmpty(this.messageEditText.getText().toString().trim())) {
            z = true;
        }
        showRichButton(z);
    }

    private void sendRichDraftAsSimpleMessage() {
        TL_iv.RichMessage richMessage = this.richDraftMessage;
        if (richMessage == null || this.messageEditText == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(RichMessageConvert.toCharSequence(richMessage));
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class);
        if (animatedEmojiSpanArr != null) {
            for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                animatedEmojiSpan.applyFontMetrics(this.messageEditText.getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
            }
        }
        QuoteSpan.normalizeQuotes(spannableStringBuilder);
        clearRichDraft();
        setFieldText(spannableStringBuilder);
        sendMessage();
    }

    public void sendConvertedRichAsSimple(CharSequence charSequence, boolean z, int i, int i2) {
        if (this.messageEditText == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class);
        if (animatedEmojiSpanArr != null) {
            for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                animatedEmojiSpan.applyFontMetrics(this.messageEditText.getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
            }
        }
        QuoteSpan.normalizeQuotes(spannableStringBuilder);
        clearRichDraft();
        setFieldText(spannableStringBuilder);
        sendMessageInternal(z, i, i2, 0L, true);
    }

    public void openRichEditorWithoutFormatting() {
        TL_iv.RichMessage richMessage = this.richDraftMessage;
        if (richMessage == null || this.messageEditText == null || this.parentFragment == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAvailable()) {
            sendRichDraftAsSimpleMessage();
            return;
        }
        RichEditor richEditorConvertToSimpleOnOpen = new RichEditor(richMessage).convertToSimpleOnOpen();
        richEditorConvertToSimpleOnOpen.setResourceProvider(this.resourcesProvider);
        richEditorConvertToSimpleOnOpen.setChatActivity(this.parentFragment);
        richEditorConvertToSimpleOnOpen.animateFrom(this.parentFragment);
        richEditorConvertToSimpleOnOpen.setOnCleared(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$MA4h9GaKFclu3lhaRVJCFon5At8(this.f$0);
            }
        });
        richEditorConvertToSimpleOnOpen.setOnSent(new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.$r8$lambda$pRiajpfAJYRFhyY6rogIYSR9MiE(this.f$0);
            }
        });
        this.parentFragment.presentFragment(richEditorConvertToSimpleOnOpen);
    }

    public static void $r8$lambda$MA4h9GaKFclu3lhaRVJCFon5At8(ChatActivityEnterView chatActivityEnterView) {
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setText("");
        }
    }

    public static void $r8$lambda$pRiajpfAJYRFhyY6rogIYSR9MiE(ChatActivityEnterView chatActivityEnterView) {
        EditTextCaption editTextCaption = chatActivityEnterView.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setText("");
        }
        chatActivityEnterView.checkSendButton(true);
    }

    private void sendRichDraft(boolean z, int i, int i2, long j) {
        TL_iv.RichMessage richMessage = this.richDraftMessage;
        if (richMessage == null) {
            return;
        }
        AccountInstance accountInstance = this.accountInstance;
        ArrayList<TL_iv.PageBlock> arrayList = richMessage.blocks;
        ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
        ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
        long j2 = this.dialog_id;
        MessageObject messageObject = this.replyingMessageObject;
        MessageObject threadMessage = getThreadMessage();
        ChatActivity chatActivity = this.parentFragment;
        SendMessagesHelper.prepareSendingArticle(accountInstance, arrayList, arrayList2, arrayList3, null, false, j2, messageObject, threadMessage, z, i, i2, chatActivity != null ? chatActivity.getMessageChatSendParams() : null, this.effectId, getSendMonoForumPeerId(), j);
        SendButton sendButton = this.sendButton;
        this.effectId = 0L;
        sendButton.setEffect(0L);
        this.messageEditText.setText("");
        clearRichDraft();
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onMessageSend(null, z, i, i2, j);
        }
        checkSendButton(true);
    }

    public void clearRichDraft() {
        if (this.parentFragment != null) {
            MediaDataController.getInstance(this.currentAccount).saveDraft(this.parentFragment.getDialogId(), this.parentFragment.getDraftThreadId(), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public void saveRichDraft(TL_iv.RichMessage richMessage) {
        if (this.parentFragment != null) {
            MediaDataController.getInstance(this.currentAccount).saveDraft(this.parentFragment.getDialogId(), this.parentFragment.getDraftThreadId(), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public void applyConvertedSimpleDraft(CharSequence charSequence) {
        if (this.messageEditText == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : charSequence);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class);
        if (animatedEmojiSpanArr != null) {
            for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                animatedEmojiSpan.applyFontMetrics(this.messageEditText.getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
            }
        }
        QuoteSpan.normalizeQuotes(spannableStringBuilder);
        if (this.parentFragment != null) {
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
            MediaDataController.getInstance(this.currentAccount).saveDraft(this.parentFragment.getDialogId(), this.parentFragment.getDraftThreadId(), charSequenceArr[0], MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
        }
        setRichDraftPreview(null);
        if (this.messageEditText.getText() != null) {
            this.messageEditText.getText().clear();
        }
        setFieldText(spannableStringBuilder);
    }

    public void updateGiftButton(boolean z) {
        boolean z2;
        HintView2 hintView2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        ChatActivity chatActivity;
        TLRPC.UserFull currentUserInfo = getParentFragment() == null ? null : getParentFragment().getCurrentUserInfo();
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
        TLRPC.User currentUser = getParentFragment() != null ? getParentFragment().getCurrentUser() : null;
        if (MessagesController.getInstance(this.currentAccount).premiumPurchaseBlocked() || getParentFragment() == null || currentUser == null || BuildVars.IS_BILLING_UNAVAILABLE || ((UserObject.isUserSelf(currentUser) && (userFull == null || !userFull.display_gifts_button)) || UserObject.isBot(currentUser) || MessagesController.isSupportUser(currentUser) || currentUserInfo == null)) {
            z2 = false;
        } else {
            if (!currentUser.premium && MessagesController.getInstance(this.currentAccount).giftAttachMenuIcon && MessagesController.getInstance(this.currentAccount).giftTextFieldIcon) {
                if (MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("show_gift_for_" + this.parentFragment.getDialogId(), true)) {
                    chatActivity = this.parentFragment;
                    if (chatActivity == null) {
                    }
                } else if (BirthdayController.isToday(currentUserInfo.birthday)) {
                    if (!MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + this.parentFragment.getDialogId(), true)) {
                        chatActivity = this.parentFragment;
                        if (chatActivity == null) {
                        }
                    } else if (currentUserInfo.display_gifts_button) {
                        chatActivity = this.parentFragment;
                        if (chatActivity == null) {
                        }
                    } else {
                        chatActivity = this.parentFragment;
                        if (chatActivity == null) {
                        }
                    }
                } else if (currentUserInfo.display_gifts_button) {
                    chatActivity = this.parentFragment;
                    if (chatActivity == null) {
                    }
                } else {
                    chatActivity = this.parentFragment;
                    if (chatActivity == null) {
                    }
                }
            } else if (BirthdayController.isToday(currentUserInfo.birthday)) {
                if (!MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + this.parentFragment.getDialogId(), true)) {
                    chatActivity = this.parentFragment;
                    if (chatActivity == null) {
                    }
                } else if ((currentUserInfo.display_gifts_button || (userFull != null && userFull.display_gifts_button)) && ((disallowedGiftsSettings = currentUserInfo.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts || !disallowedGiftsSettings.disallow_unique_stargifts)) {
                    chatActivity = this.parentFragment;
                    if (chatActivity == null && chatActivity.getChatMode() == 0) {
                        z2 = true;
                    }
                }
            } else if (currentUserInfo.display_gifts_button) {
                chatActivity = this.parentFragment;
                if (chatActivity == null) {
                }
            } else {
                chatActivity = this.parentFragment;
                if (chatActivity == null) {
                }
            }
            z2 = false;
        }
        if (!z2 && (hintView2 = this.birthdayHint) != null) {
            hintView2.hide();
        }
        if (z2 || this.giftButton != null) {
            createGiftButton();
            AndroidUtilities.updateViewVisibilityAnimated(this.giftButton, z2, 1.0f, true, 1.0f, z, new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatActivityEnterView.$r8$lambda$fk30vKCG6Tnyg40HWRXs1KuNyA0(this.f$0, valueAnimator);
                }
            });
            if (z2) {
                checkBirthdayHint();
            }
        }
    }

    public static void $r8$lambda$fk30vKCG6Tnyg40HWRXs1KuNyA0(ChatActivityEnterView chatActivityEnterView, ValueAnimator valueAnimator) {
        ImageView imageView = chatActivityEnterView.scheduledButton;
        if (imageView != null) {
            imageView.setTranslationX(imageView.getTranslationX());
        }
    }

    public void checkBirthdayHint() {
        ImageView imageView;
        ChatActivity chatActivity;
        if (this.birthdayHint != null || (imageView = this.giftButton) == null || imageView.getRight() == 0 || (chatActivity = this.parentFragment) == null || !BirthdayController.isToday(chatActivity.getCurrentUserInfo())) {
            return;
        }
        if (MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + this.parentFragment.getDialogId(), true)) {
            MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + this.parentFragment.getDialogId(), false).apply();
            HintView2 hintView2 = new HintView2(getContext(), 3);
            this.birthdayHint = hintView2;
            hintView2.setRounding(13.0f);
            this.birthdayHint.setMultilineText(true);
            setBirthdayHintText();
            this.birthdayHint.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.birthdayHint.setJointPx(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - (((this.messageEditTextContainer.getX() + this.attachLayout.getX()) + this.giftButton.getX()) + (this.giftButton.getMeasuredWidth() / 2.0f))));
            addView(this.birthdayHint, LayoutHelper.createFrame(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            this.birthdayHint.setOnHiddenListener(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView chatActivityEnterView = this.f$0;
                    chatActivityEnterView.removeView(chatActivityEnterView.birthdayHint);
                }
            });
            this.birthdayHint.setDuration(8000L);
            this.birthdayHint.show();
        }
    }

    public void setBirthdayHintText() {
        HintView2 hintView2 = this.birthdayHint;
        if (hintView2 == null) {
            return;
        }
        hintView2.setText(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.parentFragment.getCurrentUser()))), this.birthdayHint.getTextPaint().getFontMetricsInt(), new Runnable() {
            @Override
            public final void run() {
                this.f$0.setBirthdayHintText();
            }
        }));
        HintView2 hintView3 = this.birthdayHint;
        hintView3.setMaxWidthPx(HintView2.cutInFancyHalf(hintView3.getText(), this.birthdayHint.getTextPaint()));
    }

    public boolean showSendSuggestionHint() {
        ImageView imageView;
        if (this.sendSuggestHintView != null || (imageView = this.suggestButton) == null || imageView.getVisibility() != 0 || MessagesController.getGlobalMainSettings().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        HintView2 hintView2 = new HintView2(getContext(), 3);
        this.sendSuggestHintView = hintView2;
        hintView2.setRounding(13.0f);
        this.sendSuggestHintView.setMultilineText(true);
        this.sendSuggestHintView.setText(LocaleController.formatString(R.string.SuggestAPostBelowHint, ForumUtilities.getMonoForumTitle(this.currentAccount, this.dialog_id, true)));
        this.sendSuggestHintView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.sendSuggestHintView.setJointPx(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - (((this.messageEditTextContainer.getX() + this.attachLayout.getX()) + this.suggestButton.getX()) + (this.suggestButton.getMeasuredWidth() / 2.0f))));
        addView(this.sendSuggestHintView, LayoutHelper.createFrame(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        this.sendSuggestHintView.setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.removeFromParent(this.f$0.sendSuggestHintView);
            }
        });
        this.sendSuggestHintView.setDuration(8000L);
        this.sendSuggestHintView.show();
        MessagesController.getGlobalMainSettings().edit().putInt("channelsuggesthint2", MessagesController.getGlobalMainSettings().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    public void hideHints() {
        HintView2 hintView2 = this.sendSuggestHintView;
        if (hintView2 != null) {
            hintView2.hide();
        }
        HintView2 hintView3 = this.birthdayHint;
        if (hintView3 != null) {
            hintView3.hide();
        }
    }

    public void updateScheduleButton(boolean z) {
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (DialogObject.isChatDialog(this.dialog_id)) {
            TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
            this.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + this.dialog_id, false);
            z2 = ChatObject.isChannel(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup;
            this.canWriteToChannel = z2;
            if (this.notifyButton != null) {
                if (this.notifySilentDrawable == null) {
                    this.notifySilentDrawable = new CrossOutDrawable(getContext(), R.drawable.input_notify_on, Theme.key_glass_defaultIcon);
                }
                this.notifySilentDrawable.setCrossOut(this.silent, false);
                this.notifyButton.setImageDrawable(this.notifySilentDrawable);
            } else {
                z2 = false;
            }
            LinearLayout linearLayout = this.attachLayout;
            if (linearLayout != null) {
                updateFieldRight(linearLayout.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z2 = false;
        }
        boolean z3 = (this.delegate == null || isInScheduleMode() || !this.delegate.hasScheduledMessages()) ? false : true;
        final boolean z4 = (!z3 || this.scheduleButtonHidden || this.recordingAudioVideo) ? false : true;
        if (z4) {
            createScheduledButton();
        }
        ImageView imageView = this.scheduledButton;
        if (imageView != null) {
            if ((imageView.getTag() != null && z4) || (this.scheduledButton.getTag() == null && !z4)) {
                if (this.notifyButton != null) {
                    int i = (z3 || !z2 || this.scheduledButton.getVisibility() == 0) ? 8 : 0;
                    if (i != this.notifyButton.getVisibility()) {
                        this.notifyButton.setVisibility(i);
                        return;
                    }
                    return;
                }
                return;
            }
            this.scheduledButton.setTag(z4 ? 1 : null);
        } else {
            ImageView imageView2 = this.notifyButton;
            if (imageView2 != null) {
                int i2 = (z3 || !z2) ? 8 : 0;
                if (i2 != imageView2.getVisibility()) {
                    this.notifyButton.setVisibility(i2);
                }
            }
        }
        AnimatorSet animatorSet = this.scheduledButtonAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.scheduledButtonAnimation = null;
        }
        if (!z || z2) {
            ImageView imageView3 = this.scheduledButton;
            if (imageView3 != null) {
                imageView3.setVisibility(z4 ? 0 : 8);
                this.scheduledButton.setAlpha(z4 ? 1.0f : 0.0f);
                this.scheduledButton.setScaleX(z4 ? 1.0f : 0.1f);
                this.scheduledButton.setScaleY(z4 ? 1.0f : 0.1f);
                ImageView imageView4 = this.notifyButton;
                if (imageView4 != null) {
                    imageView4.setVisibility((!z2 || this.scheduledButton.getVisibility() == 0) ? 8 : 0);
                }
                this.scheduledButton.setTranslationX(0.0f);
                return;
            }
            ImageView imageView5 = this.notifyButton;
            if (imageView5 != null) {
                imageView5.setVisibility(z2 ? 0 : 8);
                return;
            }
            return;
        }
        ImageView imageView6 = this.scheduledButton;
        if (imageView6 != null) {
            if (z4) {
                imageView6.setVisibility(0);
            }
            this.scheduledButton.setPivotX(AndroidUtilities.dp(24.0f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.scheduledButtonAnimation = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) View.SCALE_X, z4 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.scheduledButton, (Property<ImageView, Float>) View.SCALE_Y, z4 ? 1.0f : 0.1f));
            this.scheduledButtonAnimation.setDuration(180L);
            this.scheduledButtonAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatActivityEnterView.this.scheduledButtonAnimation = null;
                    if (z4) {
                        return;
                    }
                    ChatActivityEnterView.this.scheduledButton.setVisibility(8);
                }
            });
            this.scheduledButtonAnimation.start();
        }
    }

    public void updateSendAsButton() {
        updateSendAsButton(true);
    }

    public void updateSendAsButton(boolean z) {
        updateSendAsButton(false, z);
    }

    public void updateSendAsButton(boolean z, boolean z2) {
        TLRPC.Chat chat;
        TLRPC.Peer defaultSendAs;
        final float f;
        float f2;
        ChatActivity chatActivity;
        SenderSelectView senderSelectView;
        SenderSelectView senderSelectView2;
        FrameLayout frameLayout;
        ChatActivity chatActivity2;
        if (this.delegate == null) {
            return;
        }
        createMessageEditText();
        if (this.isLiveComment) {
            defaultSendAs = this.delegate.getDefaultSendAs();
            chat = null;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialog_id));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialog_id);
            if (chatFull != null) {
                TLRPC.Peer peer = chatFull.default_send_as;
                chat = chat2;
                defaultSendAs = peer;
            } else {
                chat = chat2;
                defaultSendAs = null;
            }
        }
        if (defaultSendAs == null && this.delegate.getSendAsPeers() != null && !this.delegate.getSendAsPeers().peers.isEmpty()) {
            defaultSendAs = this.delegate.getSendAsPeers().peers.get(0).peer;
        }
        boolean z3 = (z || defaultSendAs == null || (this.delegate.getSendAsPeers() != null && this.delegate.getSendAsPeers().peers.size() <= 1) || isEditingMessage() || isRecordingAudioVideo() || (((frameLayout = this.recordedAudioPanel) != null && frameLayout.getVisibility() == 0) || ((!this.isLiveComment && ((ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canSendAsPeers(chat)) || ChatObject.isMonoForum(chat))) || ((chatActivity2 = this.parentFragment) != null && chatActivity2.getChatMode() == 9)))) ? false : true;
        if (z3) {
            createSenderSelectView();
        }
        if (defaultSendAs != null) {
            if (defaultSendAs.channel_id != 0) {
                TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(defaultSendAs.channel_id));
                if (chat3 != null && (senderSelectView2 = this.senderSelectView) != null) {
                    senderSelectView2.setAvatar(chat3);
                    this.senderSelectView.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(defaultSendAs.user_id));
                if (user != null && (senderSelectView = this.senderSelectView) != null) {
                    senderSelectView.setAvatar(user);
                    this.senderSelectView.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                }
            }
        }
        SenderSelectView senderSelectView3 = this.senderSelectView;
        boolean z4 = senderSelectView3 != null && senderSelectView3.getVisibility() == 0;
        int iDp = AndroidUtilities.dp(2.0f);
        float f3 = z3 ? 0.0f : 1.0f;
        final float f4 = z3 ? 1.0f : 0.0f;
        SenderSelectView senderSelectView4 = this.senderSelectView;
        if (senderSelectView4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) senderSelectView4.getLayoutParams();
            f2 = z3 ? ((-this.senderSelectView.getLayoutParams().width) - marginLayoutParams.leftMargin) - iDp : 0.0f;
            f = z3 ? 0.0f : ((-this.senderSelectView.getLayoutParams().width) - marginLayoutParams.leftMargin) - iDp;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (z4 == z3) {
            return;
        }
        SenderSelectView senderSelectView5 = this.senderSelectView;
        ValueAnimator valueAnimator = senderSelectView5 == null ? null : (ValueAnimator) senderSelectView5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.senderSelectView.setTag(null);
        }
        if ((this.isLiveComment || ((chatActivity = this.parentFragment) != null && chatActivity.getOtherSameChatsDiff() == 0 && this.parentFragment.fragmentOpened)) && z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            SenderSelectView senderSelectView6 = this.senderSelectView;
            if (senderSelectView6 != null) {
                senderSelectView6.setTranslationX(f2);
            }
            this.messageTextTranslationX = f2;
            updateMessageTextParams();
            final float f5 = f3;
            final float f6 = f2;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChatActivityEnterView.$r8$lambda$p06_eY4l8eViofC28tTJaJem1ps(this.f$0, f6, f, f5, f4, valueAnimator2);
                }
            };
            final boolean z5 = z3;
            final float f7 = f;
            duration.addUpdateListener(animatorUpdateListener);
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    float translationX;
                    if (z5) {
                        ChatActivityEnterView.this.createSenderSelectView();
                        ChatActivityEnterView.this.senderSelectView.setVisibility(0);
                    }
                    SenderSelectView senderSelectView7 = ChatActivityEnterView.this.senderSelectView;
                    if (senderSelectView7 != null) {
                        senderSelectView7.setAlpha(f5);
                        ChatActivityEnterView.this.senderSelectView.setTranslationX(f6);
                        translationX = ChatActivityEnterView.this.senderSelectView.getTranslationX();
                    } else {
                        translationX = 0.0f;
                    }
                    ChatActivityEnterView.this.emojiButton.setTranslationX(translationX);
                    ChatActivityEnterView.this.messageTextTranslationX = translationX;
                    ChatActivityEnterView.this.updateMessageTextParams();
                    if (ChatActivityEnterView.this.botCommandsMenuButton == null || ChatActivityEnterView.this.botCommandsMenuButton.getTag() != null) {
                        return;
                    }
                    ChatActivityEnterView.this.animationParamsX.clear();
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (z5) {
                        return;
                    }
                    SenderSelectView senderSelectView7 = ChatActivityEnterView.this.senderSelectView;
                    if (senderSelectView7 != null) {
                        senderSelectView7.setVisibility(8);
                    }
                    ChatActivityEnterView.this.emojiButton.setTranslationX(0.0f);
                    ChatActivityEnterView.this.messageTextTranslationX = 0.0f;
                    ChatActivityEnterView.this.updateMessageTextParams();
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    float translationX;
                    if (z5) {
                        ChatActivityEnterView.this.createSenderSelectView();
                    }
                    SenderSelectView senderSelectView7 = ChatActivityEnterView.this.senderSelectView;
                    if (senderSelectView7 != null) {
                        senderSelectView7.setVisibility(z5 ? 0 : 8);
                        ChatActivityEnterView.this.senderSelectView.setAlpha(f4);
                        ChatActivityEnterView.this.senderSelectView.setTranslationX(f7);
                        translationX = ChatActivityEnterView.this.senderSelectView.getTranslationX();
                    } else {
                        translationX = 0.0f;
                    }
                    ChatActivityEnterView.this.emojiButton.setTranslationX(translationX);
                    ChatActivityEnterView.this.messageTextTranslationX = translationX;
                    ChatActivityEnterView.this.updateMessageTextParams();
                    ChatActivityEnterView.this.requestLayout();
                }
            });
            duration.start();
            SenderSelectView senderSelectView7 = this.senderSelectView;
            if (senderSelectView7 != null) {
                senderSelectView7.setTag(duration);
                return;
            }
            return;
        }
        boolean z6 = z3;
        float f8 = f;
        if (z6) {
            createSenderSelectView();
        }
        SenderSelectView senderSelectView8 = this.senderSelectView;
        if (senderSelectView8 != null) {
            senderSelectView8.setVisibility(z6 ? 0 : 8);
            this.senderSelectView.setTranslationX(f8);
        }
        float f9 = z6 ? f8 : 0.0f;
        this.emojiButton.setTranslationX(f9);
        this.messageTextTranslationX = f9;
        updateMessageTextParams();
        SenderSelectView senderSelectView9 = this.senderSelectView;
        if (senderSelectView9 != null) {
            senderSelectView9.setAlpha(f4);
            this.senderSelectView.setTag(null);
        }
    }

    public static void $r8$lambda$p06_eY4l8eViofC28tTJaJem1ps(ChatActivityEnterView chatActivityEnterView, float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        chatActivityEnterView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f5 = f + ((f2 - f) * fFloatValue);
        SenderSelectView senderSelectView = chatActivityEnterView.senderSelectView;
        if (senderSelectView != null) {
            senderSelectView.setAlpha(f3 + ((f4 - f3) * fFloatValue));
            chatActivityEnterView.senderSelectView.setTranslationX(f5);
        }
        chatActivityEnterView.emojiButton.setTranslationX(f5);
        chatActivityEnterView.messageTextTranslationX = f5;
        chatActivityEnterView.updateMessageTextParams();
    }

    public boolean hasBotWebView() {
        return this.botMenuButtonType == BotMenuButtonType.WEB_VIEW;
    }

    private void updateBotButton(boolean z) {
        int i;
        ImageView imageView;
        if (this.isChat) {
            ChatActivity chatActivity = this.parentFragment;
            if (chatActivity != null && !chatActivity.openAnimationEnded) {
                z = false;
            }
            boolean zHasBotWebView = hasBotWebView();
            boolean z2 = this.botMenuButtonType != BotMenuButtonType.NO_BUTTON && this.dialog_id > 0;
            ImageView imageView2 = this.botButton;
            boolean z3 = imageView2 != null && imageView2.getVisibility() == 0;
            if (zHasBotWebView || this.hasBotCommands || this.hasQuickReplies || this.botReplyMarkup != null) {
                if (this.botReplyMarkup != null) {
                    if (isPopupShowing() && this.currentPopupContentType == 1 && this.botReplyMarkup.is_persistent) {
                        ImageView imageView3 = this.botButton;
                        if (imageView3 != null && imageView3.getVisibility() != 8) {
                            this.botButton.setVisibility(8);
                        }
                    } else {
                        createBotButton();
                        if (this.botButton.getVisibility() != 0) {
                            this.botButton.setVisibility(0);
                        }
                        this.botButtonDrawable.setIcon(R.drawable.input_bot2, true);
                        this.botButton.setContentDescription(LocaleController.getString("AccDescrBotKeyboard", R.string.AccDescrBotKeyboard));
                    }
                } else if (!z2) {
                    createBotButton();
                    this.botButtonDrawable.setIcon(R.drawable.input_bot1, true);
                    this.botButton.setContentDescription(LocaleController.getString("AccDescrBotCommands", R.string.AccDescrBotCommands));
                    this.botButton.setVisibility(0);
                } else {
                    ImageView imageView4 = this.botButton;
                    if (imageView4 != null) {
                        imageView4.setVisibility(8);
                    }
                }
            } else {
                ImageView imageView5 = this.botButton;
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
            }
            if (z2) {
                createBotCommandsMenuButton();
            }
            ImageView imageView6 = this.botButton;
            boolean z4 = (imageView6 != null && imageView6.getVisibility() == 0) != z3;
            BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
            if (botCommandsMenuView != null) {
                boolean z5 = botCommandsMenuView.isWebView;
                botCommandsMenuView.setWebView(this.botMenuButtonType == BotMenuButtonType.WEB_VIEW);
                boolean menuText = this.botCommandsMenuButton.setMenuText(this.botMenuButtonType == BotMenuButtonType.COMMANDS ? LocaleController.getString(R.string.BotsMenuTitle) : this.botMenuWebViewTitle);
                AndroidUtilities.updateViewVisibilityAnimated(this.botCommandsMenuButton, z2, 0.5f, z);
                z4 = z4 || menuText || z5 != this.botCommandsMenuButton.isWebView;
            }
            if (z4 && z) {
                beginDelayedTransition();
                ImageView imageView7 = this.botButton;
                boolean z6 = imageView7 != null && imageView7.getVisibility() == 0;
                if (z6 != z3 && (imageView = this.botButton) != null) {
                    imageView.setVisibility(0);
                    if (z6) {
                        this.botButton.setAlpha(0.0f);
                        this.botButton.setScaleX(0.1f);
                        this.botButton.setScaleY(0.1f);
                    } else if (!z6) {
                        this.botButton.setAlpha(1.0f);
                        this.botButton.setScaleX(1.0f);
                        this.botButton.setScaleY(1.0f);
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(this.botButton, z6, 0.1f, true, 1.0f, true, new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatActivityEnterView.$r8$lambda$C2vS1xGP692kbVreJt_0Xbima9s(this.f$0, valueAnimator);
                        }
                    });
                }
            }
            ImageView imageView8 = this.botButton;
            if (imageView8 == null || imageView8.getVisibility() != 0) {
                i = this.lastAttachVisible;
            } else {
                EditTextCaption editTextCaption = this.messageEditText;
                if (TextUtils.isEmpty(editTextCaption == null ? "" : AndroidUtilities.getTrimmedString(editTextCaption.getTextToUse()))) {
                    i = 2;
                } else {
                    i = this.lastAttachVisible;
                }
            }
            updateFieldRight(i);
        }
    }

    public static void $r8$lambda$C2vS1xGP692kbVreJt_0Xbima9s(ChatActivityEnterView chatActivityEnterView, ValueAnimator valueAnimator) {
        ImageView imageView = chatActivityEnterView.scheduledButton;
        if (imageView != null) {
            imageView.setTranslationX(imageView.getTranslationX());
        }
    }

    public void updateBotWebView(boolean z) {
        if (this.botMenuButtonType != BotMenuButtonType.NO_BUTTON && this.dialog_id > 0) {
            createBotCommandsMenuButton();
        }
        BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
        if (botCommandsMenuView != null) {
            botCommandsMenuView.setWebView(hasBotWebView());
        }
        updateBotButton(z);
    }

    public void setBotsCount(int i, boolean z, boolean z2, boolean z3) {
        this.botCount = i;
        if (this.hasBotCommands == z && this.hasQuickReplies == z2) {
            return;
        }
        this.hasBotCommands = z;
        this.hasQuickReplies = z2;
        updateBotButton(z3);
    }

    public void setButtons(MessageObject messageObject) {
        setButtons(messageObject, true);
    }

    public void setButtons(MessageObject messageObject, boolean z) {
        setButtons(messageObject, true, z);
    }

    public void setButtons(MessageObject messageObject, boolean z, boolean z2) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z3;
        EditTextCaption editTextCaption;
        MessageObject messageObject2 = this.replyingMessageObject;
        if (messageObject2 != null && messageObject2 == this.botButtonsMessageObject && messageObject2 != messageObject) {
            this.botMessageObject = messageObject;
            return;
        }
        MessageObject messageObject3 = this.botButtonsMessageObject;
        if (messageObject3 == null || messageObject3 != messageObject) {
            if (messageObject3 == null && messageObject == null) {
                return;
            }
            if (this.botKeyboardView == null) {
                BotKeyboardView botKeyboardView = new BotKeyboardView(this.parentActivity, this.resourcesProvider) {
                    @Override
                    public void setTranslationY(float f) {
                        super.setTranslationY(f);
                        if (ChatActivityEnterView.this.panelAnimation == null || ChatActivityEnterView.this.animatingContentType != 1) {
                            return;
                        }
                        ChatActivityEnterView.this.delegate.bottomPanelTranslationYChanged(f);
                    }
                };
                this.botKeyboardView = botKeyboardView;
                botKeyboardView.setVisibility(8);
                this.botKeyboardViewVisible = false;
                this.botKeyboardView.setDelegate(new BotKeyboardView.BotKeyboardViewDelegate() {
                    @Override
                    public final void didPressedButton(TL_keyboard.KeyboardButton keyboardButton) {
                        ChatActivityEnterView.$r8$lambda$yQkVfkjChFz7ioA7CUDN3QVqVxg(this.f$0, keyboardButton);
                    }
                });
                this.viewParentForEmojiView.addView(this.botKeyboardView);
            }
            this.botButtonsMessageObject = messageObject;
            if (messageObject != null) {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                } else {
                    tL_replyKeyboardMarkup = null;
                }
            } else {
                tL_replyKeyboardMarkup = null;
            }
            this.botReplyMarkup = tL_replyKeyboardMarkup;
            BotKeyboardView botKeyboardView2 = this.botKeyboardView;
            Point point = AndroidUtilities.displaySize;
            botKeyboardView2.setPanelHeight(point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight);
            if (this.botReplyMarkup != null) {
                SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
                if (this.botButtonsMessageObject != this.replyingMessageObject && messageObject != null) {
                    if (this.botReplyMarkup.single_use) {
                        if (mainSettings.getInt("answered_" + getTopicKeyString(), 0) != messageObject.getId()) {
                            if (!this.botReplyMarkup.is_persistent) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("closed_botkeyboard_");
                                sb.append(getTopicKeyString());
                                if (mainSettings.getInt(sb.toString(), 0) != messageObject.getId()) {
                                }
                            }
                        }
                    } else {
                        if (!this.botReplyMarkup.is_persistent) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("closed_botkeyboard_");
                            sb2.append(getTopicKeyString());
                            z3 = mainSettings.getInt(sb2.toString(), 0) != messageObject.getId();
                        }
                    }
                }
                boolean z4 = z ? z3 : false;
                this.botKeyboardView.setButtons(this.botReplyMarkup);
                if (z4 && (((editTextCaption = this.messageEditText) == null || editTextCaption.length() == 0) && !isPopupShowing())) {
                    showPopup(1, 1);
                }
            } else if (isPopupShowing() && this.currentPopupContentType == 1) {
                if (z2) {
                    this.clearBotButtonsOnKeyboardOpen = true;
                    openKeyboardInternal();
                } else {
                    showPopup(0, 1);
                }
            }
            updateBotButton(true);
        }
    }

    public static void $r8$lambda$yQkVfkjChFz7ioA7CUDN3QVqVxg(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        MessageObject messageObject;
        ChatActivity chatActivity;
        boolean z = chatActivityEnterView.replyingMessageObject != null && (chatActivity = chatActivityEnterView.parentFragment) != null && chatActivity.isTopic && chatActivity.getTopicId() == ((long) chatActivityEnterView.replyingMessageObject.getId());
        if ((chatActivityEnterView.replyingMessageObject == null || z) && !BotForumHelper.isBotForum(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id)) {
            messageObject = DialogObject.isChatDialog(chatActivityEnterView.dialog_id) ? chatActivityEnterView.botButtonsMessageObject : null;
        } else {
            messageObject = chatActivityEnterView.replyingMessageObject;
        }
        MessageObject messageObject2 = chatActivityEnterView.replyingMessageObject;
        if (messageObject2 == null || z) {
            messageObject2 = chatActivityEnterView.botButtonsMessageObject;
        }
        boolean zDidPressedBotButton = chatActivityEnterView.didPressedBotButton(keyboardButton, messageObject, messageObject2);
        if (chatActivityEnterView.replyingMessageObject != null && !z) {
            chatActivityEnterView.openKeyboardInternal();
            chatActivityEnterView.setButtons(chatActivityEnterView.botMessageObject, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.botButtonsMessageObject;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (zDidPressedBotButton) {
                    chatActivityEnterView.openKeyboardInternal();
                } else {
                    chatActivityEnterView.showPopup(0, 0);
                }
                MessagesController.getMainSettings(chatActivityEnterView.currentAccount).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.botButtonsMessageObject.getId()).commit();
            }
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onMessageSend(null, true, 0, 0, 0L);
        }
    }

    public boolean didPressedBotButton(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2) {
        return didPressedBotButton(keyboardButtonProto, messageObject, messageObject2, null);
    }

    public boolean didPressedBotButton(final TL_keyboard.KeyboardButtonProto keyboardButtonProto, final MessageObject messageObject, final MessageObject messageObject2, Browser.Progress progress) {
        int i;
        TLRPC.User user;
        TLRPC.Message message;
        final long j;
        final Runnable runnable;
        int i2 = 0;
        if (keyboardButtonProto == null || messageObject2 == null) {
            return false;
        }
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null && chatActivity.getChatMode() == 5) {
            return false;
        }
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
        final TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
        final TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        if (tL_inlineButtonTypeCopy != null) {
            AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
            BulletinFactory.of(this.parentFragment).createCopyBulletin(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).show(true);
        } else {
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.dialog_id, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    ChatActivity chatActivity2 = this.parentFragment;
                    sendMessageParamsOf.sendMessageChatArguments = chatActivity2 != null ? chatActivity2.getMessageChatSendParams() : null;
                    sendMessageParamsOf.effect_id = this.effectId;
                    SendButton sendButton = this.sendButton;
                    this.effectId = 0L;
                    sendButton.setEffect(0L);
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
                } else if (tL_inlineButtonTypeUrl != null) {
                    if (Browser.urlMustNotHaveConfirmation(tL_inlineButtonTypeUrl.url)) {
                        Browser.openUrl(this.parentActivity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, progress);
                    } else {
                        AlertsCreator.showOpenUrlAlert(this.parentFragment, tL_inlineButtonTypeUrl.url, false, true, true, progress, this.resourcesProvider);
                    }
                } else if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                    this.parentFragment.shareMyContact(2, messageObject2);
                } else {
                    if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                        TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                        this.parentFragment.openPollCreate((tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null);
                        return false;
                    }
                    if (TLKeyboardHelper.isButtonWebView(keyboardButtonProto)) {
                        message = messageObject2.messageOwner;
                        j = message.via_bot_id;
                        if (j == 0) {
                            j = message.from_id.user_id;
                        }
                        final TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                        runnable = new Runnable() {
                            @Override
                            public void run() {
                                if (ChatActivityEnterView.this.sizeNotifierLayout.measureKeyboardHeight() <= AndroidUtilities.dp(20.0f) && !ChatActivityEnterView.this.isPopupShowing()) {
                                    if (ChatActivityEnterView.this.parentFragment == null) {
                                        return;
                                    }
                                    int i3 = ChatActivityEnterView.this.currentAccount;
                                    long j2 = messageObject2.messageOwner.dialog_id;
                                    long j3 = j;
                                    String text = keyboardButtonProto.getText();
                                    String url = keyboardButtonProto.getUrl();
                                    boolean zIsType = TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                                    MessageObject messageObject3 = messageObject;
                                    WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i3, j2, j3, text, url, zIsType ? 1 : 0, messageObject3 != null ? messageObject3.messageOwner.id : 0, ChatActivityEnterView.this.parentFragment == null ? 0L : ChatActivityEnterView.this.parentFragment.getSendMonoForumPeerId(), false, null, false, null, null, 0, false, false);
                                    LaunchActivity launchActivity = LaunchActivity.instance;
                                    if (launchActivity != null && launchActivity.getBottomSheetTabs() != null && LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf) != null) {
                                        if (ChatActivityEnterView.this.botCommandsMenuButton != null) {
                                            ChatActivityEnterView.this.botCommandsMenuButton.setOpened(false);
                                            return;
                                        }
                                        return;
                                    }
                                    String restrictionReason = user2 == null ? null : MessagesController.getInstance(ChatActivityEnterView.this.currentAccount).getRestrictionReason(user2.restriction_reason);
                                    if (!TextUtils.isEmpty(restrictionReason)) {
                                        MessagesController.getInstance(ChatActivityEnterView.this.currentAccount);
                                        MessagesController.showCantOpenAlert(ChatActivityEnterView.this.parentFragment, restrictionReason);
                                        return;
                                    } else {
                                        BotWebViewSheet botWebViewSheet = new BotWebViewSheet(ChatActivityEnterView.this.getContext(), ChatActivityEnterView.this.resourcesProvider);
                                        botWebViewSheet.setParentActivity(ChatActivityEnterView.this.parentActivity);
                                        botWebViewSheet.requestWebView(ChatActivityEnterView.this.parentFragment, webViewRequestPropsOf);
                                        botWebViewSheet.show();
                                        return;
                                    }
                                }
                                ChatActivityEnterView.this.hidePopup(false);
                                AndroidUtilities.hideKeyboard(ChatActivityEnterView.this);
                                AndroidUtilities.runOnUIThread(this, 150L);
                            }
                        };
                        if (!SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j) || MessagesController.getInstance(this.currentAccount).whitelistedBots.contains(Long.valueOf(j))) {
                            runnable.run();
                        } else {
                            AlertsCreator.createBotLaunchAlert(this.parentFragment, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialog_id)), new Runnable() {
                                @Override
                                public final void run() {
                                    ChatActivityEnterView.$r8$lambda$OQTQ1NKzfAhHzl7BgOeHLyS4tMs(this.f$0, runnable, j);
                                }
                            }, (Runnable) null);
                        }
                    } else if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity);
                        builder.setTitle(LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle));
                        builder.setMessage(LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo));
                        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i3) {
                                ChatActivityEnterView.$r8$lambda$ywaC7cgPsKapzZlzD37EFIgZjk8(this.f$0, messageObject2, keyboardButtonProto, alertDialog, i3);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                        this.parentFragment.showDialog(builder.create());
                    } else if (!TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                        SendMessagesHelper.getInstance(this.currentAccount).sendCallback(true, messageObject2, keyboardButtonProto, this.parentFragment);
                    } else if (tL_inlineButtonTypeSwitchInline != null) {
                        if (this.parentFragment.processSwitchButton(tL_inlineButtonTypeSwitchInline)) {
                            return true;
                        }
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            long j2 = message2.from_id.user_id;
                            long j3 = message2.via_bot_id;
                            if (j3 != 0) {
                                j2 = j3;
                            }
                            TLRPC.User user3 = this.accountInstance.getMessagesController().getUser(Long.valueOf(j2));
                            if (user3 == null) {
                                return true;
                            }
                            setFieldText("@" + UserObject.getPublicUsername(user3) + " " + tL_inlineButtonTypeSwitchInline.query);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("onlySelect", true);
                            bundle.putInt("dialogsType", 1);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                bundle.putBoolean("allowGroups", false);
                                bundle.putBoolean("allowMegagroups", false);
                                bundle.putBoolean("allowLegacyGroups", false);
                                bundle.putBoolean("allowUsers", false);
                                bundle.putBoolean("allowChannels", false);
                                bundle.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i2 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i2);
                                    i2++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        bundle.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        bundle.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        bundle.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        bundle.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        bundle.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
                            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                                @Override
                                public boolean canSelectStories() {
                                    return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                                }

                                @Override
                                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList2, CharSequence charSequence, boolean z, boolean z2, int i3, int i4, TopicsFragment topicsFragment) {
                                    return ChatActivityEnterView.m2107$r8$lambda$t53DTj3tS5nQ14aQGYgC1mEtsk(this.f$0, messageObject2, tL_inlineButtonTypeSwitchInline, dialogsActivity2, arrayList2, charSequence, z, z2, i3, i4, topicsFragment);
                                }

                                @Override
                                public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                                    return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
                                }
                            });
                            this.parentFragment.presentFragment(dialogsActivity);
                        }
                    } else if (tL_inlineButtonTypeUserProfile != null) {
                        if (MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                            this.parentFragment.presentFragment(new ProfileActivity(bundle2));
                        }
                    } else if (tL_buttonTypeRequestPeer != null) {
                        TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                        if (requestPeerType != null && messageObject2.messageOwner != null) {
                            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                                if (getParentFragment() != null) {
                                    user = getParentFragment().getCurrentUser();
                                } else {
                                    user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialog_id));
                                }
                                final TLRPC.User user4 = user;
                                if (user4 == null) {
                                    return false;
                                }
                                CreateBotAlert.show(getContext(), this.currentAccount, user4, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new Utilities.Callback() {
                                    @Override
                                    public final void run(Object obj) {
                                        ChatActivityEnterView.$r8$lambda$JyQ9unVt577RXErR_1DrY3oSvGg(this.f$0, messageObject2, tL_buttonTypeRequestPeer, user4, (TLRPC.User) obj);
                                    }
                                }, this.resourcesProvider, null, false);
                                return false;
                            }
                            if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                                TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                                MultiContactsSelectorBottomSheet.open(tL_requestPeerTypeUser.bot, tL_requestPeerTypeUser.premium, i, new MultiContactsSelectorBottomSheet.SelectorListener() {
                                    @Override
                                    public final void onUserSelected(List list) {
                                        ChatActivityEnterView.$r8$lambda$pL5wg2f1uuAwctC_N9a5dSa4t_Y(this.f$0, messageObject2, tL_buttonTypeRequestPeer, list);
                                    }
                                });
                                return false;
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putInt("dialogsType", 15);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    bundle3.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                bundle3.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            DialogsActivity dialogsActivity2 = new DialogsActivity(bundle3);
                            dialogsActivity2.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                                @Override
                                public boolean canSelectStories() {
                                    return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                                }

                                @Override
                                public final boolean didSelectDialogs(DialogsActivity dialogsActivity3, ArrayList arrayList2, CharSequence charSequence, boolean z, boolean z2, int i3, int i4, TopicsFragment topicsFragment) {
                                    return ChatActivityEnterView.$r8$lambda$VQFNwnfhReOguy4CoMmi_uLifaE(this.f$0, messageObject2, tL_buttonTypeRequestPeer, dialogsActivity3, arrayList2, charSequence, z, z2, i3, i4, topicsFragment);
                                }

                                @Override
                                public boolean didSelectStories(DialogsActivity dialogsActivity3) {
                                    return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity3);
                                }
                            });
                            this.parentFragment.presentFragment(dialogsActivity2);
                            return false;
                        }
                        FileLog.e("button.peer_type is null");
                    }
                }
            } else if (tL_inlineButtonTypeUrl != null) {
                if (Browser.urlMustNotHaveConfirmation(tL_inlineButtonTypeUrl.url)) {
                    Browser.openUrl(this.parentActivity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, progress);
                } else {
                    AlertsCreator.showOpenUrlAlert(this.parentFragment, tL_inlineButtonTypeUrl.url, false, true, true, progress, this.resourcesProvider);
                }
            } else if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                this.parentFragment.shareMyContact(2, messageObject2);
            } else {
                if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                    TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll2 = (TL_keyboard.TL_buttonTypeRequestPoll) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                    this.parentFragment.openPollCreate((tL_buttonTypeRequestPoll2.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll2.quiz) : null);
                    return false;
                }
                if (TLKeyboardHelper.isButtonWebView(keyboardButtonProto)) {
                    message = messageObject2.messageOwner;
                    j = message.via_bot_id;
                    if (j == 0) {
                        j = message.from_id.user_id;
                    }
                    final TLRPC.User user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                    runnable = new Runnable() {
                        @Override
                        public void run() {
                            if (ChatActivityEnterView.this.sizeNotifierLayout.measureKeyboardHeight() <= AndroidUtilities.dp(20.0f) && !ChatActivityEnterView.this.isPopupShowing()) {
                                if (ChatActivityEnterView.this.parentFragment == null) {
                                    return;
                                }
                                int i3 = ChatActivityEnterView.this.currentAccount;
                                long j4 = messageObject2.messageOwner.dialog_id;
                                long j5 = j;
                                String text = keyboardButtonProto.getText();
                                String url = keyboardButtonProto.getUrl();
                                boolean zIsType = TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                                MessageObject messageObject3 = messageObject;
                                WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i3, j4, j5, text, url, zIsType ? 1 : 0, messageObject3 != null ? messageObject3.messageOwner.id : 0, ChatActivityEnterView.this.parentFragment == null ? 0L : ChatActivityEnterView.this.parentFragment.getSendMonoForumPeerId(), false, null, false, null, null, 0, false, false);
                                LaunchActivity launchActivity = LaunchActivity.instance;
                                if (launchActivity != null && launchActivity.getBottomSheetTabs() != null && LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf) != null) {
                                    if (ChatActivityEnterView.this.botCommandsMenuButton != null) {
                                        ChatActivityEnterView.this.botCommandsMenuButton.setOpened(false);
                                        return;
                                    }
                                    return;
                                }
                                String restrictionReason = user5 == null ? null : MessagesController.getInstance(ChatActivityEnterView.this.currentAccount).getRestrictionReason(user5.restriction_reason);
                                if (!TextUtils.isEmpty(restrictionReason)) {
                                    MessagesController.getInstance(ChatActivityEnterView.this.currentAccount);
                                    MessagesController.showCantOpenAlert(ChatActivityEnterView.this.parentFragment, restrictionReason);
                                    return;
                                } else {
                                    BotWebViewSheet botWebViewSheet = new BotWebViewSheet(ChatActivityEnterView.this.getContext(), ChatActivityEnterView.this.resourcesProvider);
                                    botWebViewSheet.setParentActivity(ChatActivityEnterView.this.parentActivity);
                                    botWebViewSheet.requestWebView(ChatActivityEnterView.this.parentFragment, webViewRequestPropsOf);
                                    botWebViewSheet.show();
                                    return;
                                }
                            }
                            ChatActivityEnterView.this.hidePopup(false);
                            AndroidUtilities.hideKeyboard(ChatActivityEnterView.this);
                            AndroidUtilities.runOnUIThread(this, 150L);
                        }
                    };
                    if (!SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j)) {
                        runnable.run();
                    } else {
                        runnable.run();
                    }
                } else if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(this.parentActivity);
                    builder2.setTitle(LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle));
                    builder2.setMessage(LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo));
                    builder2.setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i3) {
                            ChatActivityEnterView.$r8$lambda$ywaC7cgPsKapzZlzD37EFIgZjk8(this.f$0, messageObject2, keyboardButtonProto, alertDialog, i3);
                        }
                    });
                    builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    this.parentFragment.showDialog(builder2.create());
                } else if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                    SendMessagesHelper.getInstance(this.currentAccount).sendCallback(true, messageObject2, keyboardButtonProto, this.parentFragment);
                } else {
                    SendMessagesHelper.getInstance(this.currentAccount).sendCallback(true, messageObject2, keyboardButtonProto, this.parentFragment);
                }
            }
        }
        return true;
    }

    public static void $r8$lambda$OQTQ1NKzfAhHzl7BgOeHLyS4tMs(ChatActivityEnterView chatActivityEnterView, Runnable runnable, long j) {
        chatActivityEnterView.getClass();
        runnable.run();
        SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView.currentAccount, j, true);
    }

    public static void $r8$lambda$ywaC7cgPsKapzZlzD37EFIgZjk8(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, AlertDialog alertDialog, int i) {
        if (Build.VERSION.SDK_INT >= 23 && chatActivityEnterView.parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            chatActivityEnterView.parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            chatActivityEnterView.pendingMessageObject = messageObject;
            chatActivityEnterView.pendingLocationButton = keyboardButtonProto;
            return;
        }
        SendMessagesHelper.getInstance(chatActivityEnterView.currentAccount).sendCurrentLocation(messageObject, keyboardButtonProto);
    }

    public static boolean m2107$r8$lambda$t53DTj3tS5nQ14aQGYgC1mEtsk(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        chatActivityEnterView.getClass();
        TLRPC.Message message = messageObject.messageOwner;
        long j = message.from_id.user_id;
        long j2 = message.via_bot_id;
        if (j2 != 0) {
            j = j2;
        }
        TLRPC.User user = chatActivityEnterView.accountInstance.getMessagesController().getUser(Long.valueOf(j));
        if (user == null) {
            dialogsActivity.finishFragment();
            return true;
        }
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        MediaDataController.getInstance(chatActivityEnterView.currentAccount).saveDraft(j3, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
        if (j3 != chatActivityEnterView.dialog_id) {
            if (!DialogObject.isEncryptedDialog(j3)) {
                Bundle bundle = new Bundle();
                if (DialogObject.isUserDialog(j3)) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                if (chatActivityEnterView.accountInstance.getMessagesController().checkCanOpenChat(bundle, dialogsActivity)) {
                    if (chatActivityEnterView.parentFragment.presentFragment(new ChatActivity(bundle), true)) {
                        if (!AndroidUtilities.isTablet()) {
                            chatActivityEnterView.parentFragment.removeSelfFromStack();
                        }
                    } else {
                        dialogsActivity.finishFragment();
                        return true;
                    }
                }
                return true;
            }
            dialogsActivity.finishFragment();
            return true;
        }
        dialogsActivity.finishFragment();
        return true;
    }

    public static void $r8$lambda$JyQ9unVt577RXErR_1DrY3oSvGg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, TLRPC.User user, TLRPC.User user2) {
        chatActivityEnterView.getClass();
        if (user2 != null) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
            tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user2));
            ConnectionsManager.getInstance(chatActivityEnterView.currentAccount).sendRequest(tL_messages_sendBotRequestedPeer, null);
            long j = user.id;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user2.id);
            AnonymousClass77 anonymousClass77 = chatActivityEnterView.new AnonymousClass77(bundle, user2, user, j);
            ChatActivity chatActivity = chatActivityEnterView.parentFragment;
            if (chatActivity != null) {
                chatActivity.presentFragment(anonymousClass77);
            }
        }
    }

    class AnonymousClass77 extends ChatActivity {
        private boolean shownToast;
        final TLRPC.User val$bot;
        final long val$managerId;
        final TLRPC.User val$newBot;

        AnonymousClass77(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j) {
            super(bundle);
            this.val$newBot = user;
            this.val$bot = user2;
            this.val$managerId = j;
        }

        @Override
        public void onBecomeFullyVisible() {
            super.onBecomeFullyVisible();
            if (this.shownToast) {
                return;
            }
            this.shownToast = true;
            BulletinFactory bulletinFactoryOf = BulletinFactory.of(this);
            int i = R.raw.contact_check;
            String string = LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.val$newBot));
            String string2 = LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.val$bot));
            final long j = this.val$managerId;
            bulletinFactoryOf.createSimpleBulletin(i, string, AndroidUtilities.replaceSingleTag(string2, new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.AnonymousClass77.m2119$r8$lambda$CsXTiRZQ4hYMZ_RFx5dE9JnzvQ(this.f$0, j);
                }
            })).show();
        }

        public static void m2119$r8$lambda$CsXTiRZQ4hYMZ_RFx5dE9JnzvQ(AnonymousClass77 anonymousClass77, long j) {
            anonymousClass77.getClass();
            anonymousClass77.presentFragment(ChatActivity.of(j));
        }
    }

    public static void $r8$lambda$pL5wg2f1uuAwctC_N9a5dSa4t_Y(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, List list) {
        chatActivityEnterView.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
        tL_messages_sendBotRequestedPeer.flags |= 1;
        tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
        tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.currentAccount).getInputPeer(((Long) it.next()).longValue()));
        }
        ConnectionsManager.getInstance(chatActivityEnterView.currentAccount).sendRequest(tL_messages_sendBotRequestedPeer, null);
    }

    public static boolean $r8$lambda$VQFNwnfhReOguy4CoMmi_uLifaE(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        chatActivityEnterView.getClass();
        if (arrayList != null && !arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
            tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(chatActivityEnterView.currentAccount).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.currentAccount).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        dialogsActivity.finishFragment();
        return true;
    }

    public boolean isPopupView(View view) {
        return view == this.botKeyboardView || view == this.emojiView;
    }

    public int getPopupViewHeight(View view) {
        BotKeyboardView botKeyboardView = this.botKeyboardView;
        if (view != botKeyboardView || botKeyboardView == null) {
            return -1;
        }
        return botKeyboardView.getKeyboardHeight();
    }

    public boolean isRecordCircle(View view) {
        return view == this.recordCircle;
    }

    public SizeNotifierFrameLayout getSizeNotifierLayout() {
        return this.sizeNotifierLayout;
    }

    public void overrideEditTextView(EditTextBoldCursor editTextBoldCursor) {
        this.mOverrideEditTextView = editTextBoldCursor;
    }

    protected void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            this.viewParentForEmojiView.removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(this.parentFragment, this.allowAnimatedEmoji, true, true, getContext(), true, this.info, this.sizeNotifierLayout, this.shouldDrawBackground, this.resourcesProvider, this.emojiViewFrozen, this.windowInsetsInAppController != null) {
            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (ChatActivityEnterView.this.panelAnimation == null || ChatActivityEnterView.this.animatingContentType != 0) {
                    return;
                }
                ChatActivityEnterView.this.delegate.bottomPanelTranslationYChanged(f);
            }
        };
        this.emojiView = emojiView2;
        emojiView2.shouldDrawStickerSettings = true;
        if (!this.shouldDrawBackground) {
            emojiView2.updateColors();
        }
        this.emojiView.setAllow(this.allowStickers, this.allowGifs, true);
        this.emojiView.setVisibility(8);
        this.emojiView.setShowing(false);
        if (this.windowInsetsInAppController != null) {
            EmojiView emojiView3 = this.emojiView;
            emojiView3.shouldLightenBackground = false;
            emojiView3.setShouldDrawBackground(false);
            this.emojiView.isNewHeightControl = true;
        }
        this.emojiView.setDelegate(new AnonymousClass79());
        this.emojiView.setDragListener(new EmojiView.DragListener() {
            int initialOffset;
            boolean wasExpanded;

            @Override
            public void onDragStart() {
                if (allowDragging()) {
                    if (ChatActivityEnterView.this.stickersExpansionAnim != null) {
                        ChatActivityEnterView.this.stickersExpansionAnim.cancel();
                    }
                    ChatActivityEnterView.this.stickersDragging = true;
                    this.wasExpanded = ChatActivityEnterView.this.stickersExpanded;
                    ChatActivityEnterView.this.stickersExpanded = true;
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 1);
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    chatActivityEnterView.stickersExpandedHeight = ((((chatActivityEnterView.sizeNotifierLayout.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - ActionBar.getCurrentActionBarHeight()) - ChatActivityEnterView.this.getHeight();
                    if (ChatActivityEnterView.this.searchingType == 2) {
                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                        int i = chatActivityEnterView2.stickersExpandedHeight;
                        int iDp = AndroidUtilities.dp(175.0f);
                        Point point = AndroidUtilities.displaySize;
                        chatActivityEnterView2.stickersExpandedHeight = Math.min(i, iDp + (point.x > point.y ? ChatActivityEnterView.this.keyboardHeightLand : ChatActivityEnterView.this.keyboardHeight));
                    }
                    if (ChatActivityEnterView.this.windowInsetsInAppController == null) {
                        ChatActivityEnterView.this.emojiView.getLayoutParams().height = ChatActivityEnterView.this.stickersExpandedHeight;
                    }
                    ChatActivityEnterView.this.emojiView.setLayerType(2, null);
                    ChatActivityEnterView.this.sizeNotifierLayout.requestLayout();
                    ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                    if (chatActivityEnterView3.shouldDrawBackground) {
                        chatActivityEnterView3.sizeNotifierLayout.setForeground(ChatActivityEnterView.this.new ScrimDrawable());
                    }
                    this.initialOffset = (int) ChatActivityEnterView.this.getTranslationY();
                    if (ChatActivityEnterView.this.delegate != null) {
                        ChatActivityEnterView.this.delegate.onStickersExpandedChange();
                    }
                }
            }

            @Override
            public void onDragEnd(float f) {
                if (allowDragging()) {
                    ChatActivityEnterView.this.stickersDragging = false;
                    if ((this.wasExpanded && f >= AndroidUtilities.dp(200.0f)) || ((!this.wasExpanded && f <= AndroidUtilities.dp(-200.0f)) || ((this.wasExpanded && ChatActivityEnterView.this.stickersExpansionProgress <= 0.6f) || (!this.wasExpanded && ChatActivityEnterView.this.stickersExpansionProgress >= 0.4f)))) {
                        ChatActivityEnterView.this.setStickersExpanded(!this.wasExpanded, true, true);
                    } else {
                        ChatActivityEnterView.this.setStickersExpanded(this.wasExpanded, true, true);
                    }
                }
            }

            @Override
            public void onDragCancel() {
                if (ChatActivityEnterView.this.stickersTabOpen) {
                    ChatActivityEnterView.this.stickersDragging = false;
                    ChatActivityEnterView.this.setStickersExpanded(this.wasExpanded, true, false);
                }
            }

            @Override
            public void onDrag(int i) {
                if (allowDragging()) {
                    Point point = AndroidUtilities.displaySize;
                    int i2 = point.x > point.y ? ChatActivityEnterView.this.keyboardHeightLand : ChatActivityEnterView.this.keyboardHeight;
                    int iMax = Math.max(Math.min(i + this.initialOffset, 0), -(ChatActivityEnterView.this.stickersExpandedHeight - i2));
                    if (ChatActivityEnterView.this.windowInsetsInAppController == null) {
                        float f = iMax;
                        ChatActivityEnterView.this.emojiView.setTranslationY(f);
                        ChatActivityEnterView.this.setTranslationY(f);
                    }
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    chatActivityEnterView.stickersExpansionProgress = iMax / (-(chatActivityEnterView.stickersExpandedHeight - i2));
                    ChatActivityEnterView.this.sizeNotifierLayout.invalidate();
                }
            }

            private boolean allowDragging() {
                EditTextCaption editTextCaption;
                if (ChatActivityEnterView.this.stickersTabOpen) {
                    return (ChatActivityEnterView.this.stickersExpanded || (editTextCaption = ChatActivityEnterView.this.messageEditText) == null || editTextCaption.length() <= 0) && ChatActivityEnterView.this.emojiView.areThereAnyStickers() && !ChatActivityEnterView.this.waitingForKeyboardOpen;
                }
                return false;
            }
        });
        EmojiView emojiView4 = this.emojiView;
        if (emojiView4 != null) {
            emojiView4.setStickersBanned(!this.sendPlainEnabled, !this.stickersEnabled, -this.dialog_id);
        }
        attachEmojiView();
        checkChannelRights();
    }

    class AnonymousClass79 implements EmojiView.EmojiViewDelegate {
        @Override
        public boolean canAddCaptionToGif(TLRPC.Document document) {
            return true;
        }

        AnonymousClass79() {
        }

        @Override
        public boolean isUserSelf() {
            return ChatActivityEnterView.this.dialog_id == UserConfig.getInstance(ChatActivityEnterView.this.currentAccount).getClientUserId();
        }

        @Override
        public boolean onBackspace() {
            TextView textView = ChatActivityEnterView.this.mOverrideEditTextView != null ? ChatActivityEnterView.this.mOverrideEditTextView : ChatActivityEnterView.this.messageEditText;
            if (textView == null || textView.length() == 0) {
                return false;
            }
            textView.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public void onEmojiSelected(String str) {
            EditText editText = ChatActivityEnterView.this.mOverrideEditTextView != null ? ChatActivityEnterView.this.mOverrideEditTextView : ChatActivityEnterView.this.messageEditText;
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                ChatActivityEnterView.this.innerTextChange = 2;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
                editText.setText(editText.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                int length = selectionEnd + charSequenceReplaceEmoji.length();
                editText.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            } finally {
                ChatActivityEnterView.this.innerTextChange = 0;
            }
        }

        @Override
        public void onCustomEmojiSelected(final long j, final TLRPC.Document document, final String str, final boolean z) {
            final EditTextBoldCursor editTextBoldCursor = ChatActivityEnterView.this.mOverrideEditTextView != null ? ChatActivityEnterView.this.mOverrideEditTextView : ChatActivityEnterView.this.messageEditText;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.AnonymousClass79.m2120$r8$lambda$pKPVKiWKXt_ShiOBAGavFBXeM8(this.f$0, editTextBoldCursor, str, document, j, z);
                }
            });
        }

        public static void m2120$r8$lambda$pKPVKiWKXt_ShiOBAGavFBXeM8(AnonymousClass79 anonymousClass79, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j, boolean z) {
            AnimatedEmojiSpan animatedEmojiSpan;
            anonymousClass79.getClass();
            if (editTextBoldCursor == null) {
                return;
            }
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                ChatActivityEnterView.this.innerTextChange = 2;
                if (str == null) {
                    str = "😀";
                }
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(j, editTextBoldCursor.getPaint().getFontMetricsInt());
                }
                if (!z) {
                    animatedEmojiSpan.fromEmojiKeyboard = true;
                }
                animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
            } catch (Exception e) {
                FileLog.e(e);
            } finally {
                ChatActivityEnterView.this.innerTextChange = 0;
            }
        }

        @Override
        public void onAnimatedEmojiUnlockClick() {
            BaseFragment lastFragment = ChatActivityEnterView.this.parentFragment;
            if (lastFragment == null) {
                lastFragment = LaunchActivity.getLastFragment();
            }
            PremiumFeatureBottomSheet premiumFeatureBottomSheet = new PremiumFeatureBottomSheet(lastFragment, 11, false);
            if (lastFragment != null) {
                lastFragment.showDialog(premiumFeatureBottomSheet);
            } else {
                premiumFeatureBottomSheet.show();
            }
        }

        @Override
        public void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
            if (ChatActivityEnterView.this.isLiveComment) {
                return;
            }
            if (ChatActivityEnterView.this.trendingStickersAlert != null) {
                ChatActivityEnterView.this.trendingStickersAlert.dismiss();
                ChatActivityEnterView.this.trendingStickersAlert = null;
            }
            if (ChatActivityEnterView.this.slowModeTimer <= 0 || isInScheduleMode()) {
                if (ChatActivityEnterView.this.stickersExpanded) {
                    if (ChatActivityEnterView.this.searchingType != 0) {
                        ChatActivityEnterView.this.setSearchingTypeInternal(0, true);
                        ChatActivityEnterView.this.emojiView.closeSearch(true, MessageObject.getStickerSetId(document));
                        ChatActivityEnterView.this.emojiView.hideSearchKeyboard();
                    }
                    ChatActivityEnterView.this.setStickersExpanded(false, true, false);
                }
                ChatActivityEnterView.this.onStickerSelected(document, str, obj, sendAnimationData, false, z, i, 0);
                if (DialogObject.isEncryptedDialog(ChatActivityEnterView.this.dialog_id) && MessageObject.isGifDocument(document)) {
                    ChatActivityEnterView.this.accountInstance.getMessagesController().saveGif(obj, document);
                    return;
                }
                return;
            }
            if (ChatActivityEnterView.this.delegate != null) {
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = ChatActivityEnterView.this.delegate;
                if (view == null) {
                    view = ChatActivityEnterView.this.slowModeButton;
                }
                chatActivityEnterViewDelegate.onUpdateSlowModeButton(view, true, ChatActivityEnterView.this.slowModeButton.getText());
            }
        }

        @Override
        public void onStickersSettingsClick() {
            if (ChatActivityEnterView.this.parentFragment != null) {
                ChatActivityEnterView.this.parentFragment.presentFragment(new StickersActivity(0, null));
            }
        }

        @Override
        public void onEmojiSettingsClick(ArrayList arrayList) {
            if (ChatActivityEnterView.this.parentFragment != null) {
                ChatActivityEnterView.this.parentFragment.presentFragment(new StickersActivity(5, arrayList));
            }
        }

        @Override
        public void onGifSelectedForAddCaption(final View view, final Object obj, final String str, final Object obj2, boolean z, int i, int i2) {
            if (ChatActivityEnterView.this.parentFragment == null) {
                return;
            }
            PhotoViewer.getInstance().setParentActivity(ChatActivityEnterView.this.parentFragment, ChatActivityEnterView.this.parentFragment.themeDelegate);
            File pathToAttach = obj instanceof TLRPC.Document ? FileLoader.getInstance(ChatActivityEnterView.this.currentAccount).getPathToAttach((TLRPC.Document) obj) : null;
            if (pathToAttach == null) {
                return;
            }
            File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
            if (!pathToAttach.exists()) {
                if (!file.exists()) {
                    return;
                } else {
                    pathToAttach = file;
                }
            }
            ArrayList arrayList = new ArrayList();
            final MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, pathToAttach.getAbsolutePath(), 0, false, 0, 0, 0L);
            photoEntry.caption = null;
            photoEntry.isVideo = true;
            arrayList.add(photoEntry);
            PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 12, false, new PhotoViewer.PhotoViewerProvider() {
                private boolean isCaptionAbove;

                @Override
                public boolean allowCaption() {
                    return true;
                }

                @Override
                public boolean allowLivePhotos() {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$allowLivePhotos(this);
                }

                @Override
                public boolean allowSendingSubmenu() {
                    return true;
                }

                @Override
                public boolean canCaptureMorePhotos() {
                    return false;
                }

                @Override
                public boolean canEdit(int i3) {
                    return false;
                }

                @Override
                public boolean canLoadMoreAvatars() {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$canLoadMoreAvatars(this);
                }

                @Override
                public boolean canMoveCaptionAbove() {
                    return true;
                }

                @Override
                public boolean canReplace(int i3) {
                    return false;
                }

                @Override
                public boolean canSchedule() {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$canSchedule(this);
                }

                @Override
                public boolean canScrollAway() {
                    return false;
                }

                @Override
                public boolean canSetTimer() {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$canSetTimer(this);
                }

                @Override
                public boolean cancelButtonPressed() {
                    return false;
                }

                @Override
                public boolean closeKeyboard() {
                    return false;
                }

                @Override
                public void deleteImageAtIndex(int i3) {
                }

                @Override
                public boolean forceAllInGroup() {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$forceAllInGroup(this);
                }

                @Override
                public long getDialogId() {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$getDialogId(this);
                }

                @Override
                public MessageObject getEditingMessageObject() {
                    return null;
                }

                @Override
                public int getPhotoIndex(int i3) {
                    return 0;
                }

                @Override
                public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i3, boolean z2, boolean z3) {
                    return null;
                }

                @Override
                public int getSelectedCount() {
                    return 0;
                }

                @Override
                public HashMap getSelectedPhotos() {
                    return null;
                }

                @Override
                public ArrayList getSelectedPhotosOrder() {
                    return null;
                }

                @Override
                public CharSequence getSubtitleFor(int i3) {
                    return null;
                }

                @Override
                public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i3) {
                    return null;
                }

                @Override
                public CharSequence getTitleFor(int i3) {
                    return null;
                }

                @Override
                public int getTotalImageCount() {
                    return 0;
                }

                @Override
                public boolean isEditingMessage() {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$isEditingMessage(this);
                }

                @Override
                public boolean isEditingMessageResend() {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$isEditingMessageResend(this);
                }

                @Override
                public boolean isEditingSticker() {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$isEditingSticker(this);
                }

                @Override
                public boolean isPhotoChecked(int i3) {
                    return false;
                }

                @Override
                public boolean loadMore() {
                    return false;
                }

                @Override
                public void needAddMorePhotos() {
                }

                @Override
                public void onApplyCaption(CharSequence charSequence) {
                }

                @Override
                public void onClose() {
                }

                @Override
                public boolean onDeletePhoto(int i3) {
                    return PhotoViewer.PhotoViewerProvider.CC.$default$onDeletePhoto(this, i3);
                }

                @Override
                public void onEditModeChanged(boolean z2) {
                    PhotoViewer.PhotoViewerProvider.CC.$default$onEditModeChanged(this, z2);
                }

                @Override
                public void onPollAttachDelete() {
                    PhotoViewer.PhotoViewerProvider.CC.$default$onPollAttachDelete(this);
                }

                @Override
                public void onPollAttachReplace() {
                    PhotoViewer.PhotoViewerProvider.CC.$default$onPollAttachReplace(this);
                }

                @Override
                public void onPreClose() {
                    PhotoViewer.PhotoViewerProvider.CC.$default$onPreClose(this);
                }

                @Override
                public void onPreOpen() {
                    PhotoViewer.PhotoViewerProvider.CC.$default$onPreOpen(this);
                }

                @Override
                public void onReleasePlayerBeforeClose(int i3) {
                    PhotoViewer.PhotoViewerProvider.CC.$default$onReleasePlayerBeforeClose(this, i3);
                }

                @Override
                public void openPhotoForEdit(String str2, String str3, boolean z2) {
                }

                @Override
                public void replaceButtonPressed(int i3, VideoEditedInfo videoEditedInfo) {
                }

                @Override
                public boolean scaleToFill() {
                    return false;
                }

                @Override
                public int setPhotoChecked(int i3, VideoEditedInfo videoEditedInfo) {
                    return 0;
                }

                @Override
                public int setPhotoUnchecked(Object obj3) {
                    return 0;
                }

                @Override
                public void updatePhotoAtIndex(int i3) {
                }

                @Override
                public void updatedLivePhotos() {
                    PhotoViewer.PhotoViewerProvider.CC.$default$updatedLivePhotos(this);
                }

                @Override
                public void willHidePhotoViewer() {
                }

                @Override
                public void willSwitchFromPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i3) {
                }

                @Override
                public void sendButtonPressed(int i3, VideoEditedInfo videoEditedInfo, boolean z2, int i4, int i5, boolean z3) {
                    AnonymousClass79.this.onGifSelected(view, obj, str, obj2, z2, i4, i5, photoEntry, this.isCaptionAbove);
                }

                @Override
                public String getDeleteMessageString() {
                    return "";
                }

                @Override
                public void onOpen() {
                    PhotoViewer.getInstance().openKeyboard();
                }

                @Override
                public void moveCaptionAbove(boolean z2) {
                    this.isCaptionAbove = z2;
                }

                @Override
                public boolean isCaptionAbove() {
                    return this.isCaptionAbove;
                }
            }, ChatActivityEnterView.this.parentFragment);
        }

        @Override
        public void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            onGifSelected(view, obj, str, obj2, z, i, i2, null, false);
        }

        public void onGifSelected(final View view, final Object obj, final String str, final Object obj2, final boolean z, final int i, final int i2, final MediaController.PhotoEntry photoEntry, final boolean z2) {
            if (ChatActivityEnterView.this.replyingQuote != null && ChatActivityEnterView.this.parentFragment != null && ChatActivityEnterView.this.replyingQuote.outdated) {
                ChatActivityEnterView.this.parentFragment.showQuoteMessageUpdate();
                return;
            }
            if (!isInScheduleMode() || i != 0) {
                if (ChatActivityEnterView.this.slowModeTimer <= 0 || isInScheduleMode()) {
                    AlertsCreator.ensurePaidMessageConfirmation(ChatActivityEnterView.this.currentAccount, ChatActivityEnterView.this.dialog_id, 1, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj3) {
                            ChatActivityEnterView.AnonymousClass79.$r8$lambda$704Qh6EhXqXGS1VO0Bd40KStl0U(this.f$0, obj, photoEntry, z, i, i2, z2, str, obj2, (Long) obj3);
                        }
                    });
                    return;
                } else {
                    if (ChatActivityEnterView.this.delegate != null) {
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = ChatActivityEnterView.this.delegate;
                        if (view == null) {
                            view = ChatActivityEnterView.this.slowModeButton;
                        }
                        chatActivityEnterViewDelegate.onUpdateSlowModeButton(view, true, ChatActivityEnterView.this.slowModeButton.getText());
                        return;
                    }
                    return;
                }
            }
            AlertsCreator.createScheduleDatePickerDialog(ChatActivityEnterView.this.parentActivity, ChatActivityEnterView.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z3, int i3, int i4) {
                    this.f$0.onGifSelected(view, obj, str, obj2, z3, i3, i4, photoEntry, z2);
                }
            }, ChatActivityEnterView.this.resourcesProvider);
        }

        public static void $r8$lambda$704Qh6EhXqXGS1VO0Bd40KStl0U(final AnonymousClass79 anonymousClass79, final Object obj, final MediaController.PhotoEntry photoEntry, final boolean z, final int i, final int i2, final boolean z2, final String str, final Object obj2, final Long l) {
            anonymousClass79.getClass();
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.AnonymousClass79.$r8$lambda$Zfytw9rJs9NB4iyDEPWhqvw6meM(this.f$0, obj, photoEntry, z, i, i2, z2, l, str, obj2);
                }
            };
            if (ChatActivityEnterView.this.showConfirmAlert(runnable)) {
                return;
            }
            runnable.run();
        }

        public static void $r8$lambda$Zfytw9rJs9NB4iyDEPWhqvw6meM(AnonymousClass79 anonymousClass79, Object obj, MediaController.PhotoEntry photoEntry, boolean z, int i, int i2, boolean z2, Long l, String str, Object obj2) {
            String str2;
            boolean z3 = false;
            if (ChatActivityEnterView.this.stickersExpanded) {
                if (ChatActivityEnterView.this.searchingType != 0) {
                    ChatActivityEnterView.this.emojiView.hideSearchKeyboard();
                }
                ChatActivityEnterView.this.setStickersExpanded(false, true, false);
            }
            TL_stories.StoryItem replyToStory = ChatActivityEnterView.this.delegate != null ? ChatActivityEnterView.this.delegate.getReplyToStory() : null;
            if (obj instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) obj;
                VideoEditedInfo videoEditedInfo = photoEntry != null ? photoEntry.editedInfo : null;
                if (videoEditedInfo != null && photoEntry != null) {
                    videoEditedInfo.roundVideo = true;
                    boolean zNeedConvert = videoEditedInfo.needConvert();
                    videoEditedInfo.roundVideo = false;
                    videoEditedInfo.muted = true;
                    z3 = zNeedConvert;
                }
                if (!z3) {
                    SendMessagesHelper.getInstance(ChatActivityEnterView.this.currentAccount).sendSticker(document, str, ChatActivityEnterView.this.dialog_id, photoEntry != null ? photoEntry.caption : null, videoEditedInfo, ChatActivityEnterView.this.replyingMessageObject, ChatActivityEnterView.this.getThreadMessage(), replyToStory, ChatActivityEnterView.this.replyingQuote, null, z, i, i2, false, obj2, ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null, l.longValue(), ChatActivityEnterView.this.getSendMonoForumPeerId(), ChatActivityEnterView.this.getSendMessageSuggestionParams(), z2);
                    MediaDataController.getInstance(ChatActivityEnterView.this.currentAccount).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
                    if (DialogObject.isEncryptedDialog(ChatActivityEnterView.this.dialog_id)) {
                        ChatActivityEnterView.this.accountInstance.getMessagesController().saveGif(obj2, document);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    if (!photoEntry.isVideo && (str2 = photoEntry.imagePath) != null) {
                        sendingMediaInfo.path = str2;
                        if (photoEntry.isHighQuality()) {
                            sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                        }
                    } else {
                        String str3 = photoEntry.path;
                        if (str3 != null) {
                            sendingMediaInfo.path = str3;
                        }
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.coverPhoto = photoEntry.coverPhoto;
                    sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                    sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                    sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                    CharSequence charSequence = photoEntry.caption;
                    sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                    sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                    sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                    sendingMediaInfo.stars = photoEntry.starsAmount;
                    sendingMediaInfo.highQuality = photoEntry.isHighQuality();
                    arrayList.add(sendingMediaInfo);
                    photoEntry.reset();
                    SendMessagesHelper.prepareSendingMedia(AccountInstance.getInstance(ChatActivityEnterView.this.currentAccount), arrayList, ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.replyingMessageObject, ChatActivityEnterView.this.getThreadMessage(), null, ChatActivityEnterView.this.replyingQuote, false, false, ChatActivityEnterView.this.editingMessageObject, z, i, i2, 0, false, null, ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null, ChatActivityEnterView.this.effectId, z2, l.longValue(), ChatActivityEnterView.this.getSendMonoForumPeerId(), ChatActivityEnterView.this.getSendMessageSuggestionParams());
                }
            } else {
                TL_stories.StoryItem storyItem = replyToStory;
                if (obj instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                    if (botInlineResult.document != null) {
                        MediaDataController.getInstance(ChatActivityEnterView.this.currentAccount).addRecentGif(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                        if (DialogObject.isEncryptedDialog(ChatActivityEnterView.this.dialog_id)) {
                            ChatActivityEnterView.this.accountInstance.getMessagesController().saveGif(obj2, botInlineResult.document);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put("id", botInlineResult.id);
                    map.put("query_id", "" + botInlineResult.query_id);
                    map.put("force_gif", "1");
                    if (storyItem == null) {
                        SendMessagesHelper.prepareSendingBotContextResult(ChatActivityEnterView.this.parentFragment, ChatActivityEnterView.this.accountInstance, botInlineResult, map, ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.replyingMessageObject, ChatActivityEnterView.this.getThreadMessage(), null, ChatActivityEnterView.this.replyingQuote, z, i, 0, ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null, l.longValue(), ChatActivityEnterView.this.getSendMonoForumPeerId());
                    } else {
                        SendMessagesHelper.getInstance(ChatActivityEnterView.this.currentAccount).sendSticker(botInlineResult.document, str, ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.replyingMessageObject, ChatActivityEnterView.this.getThreadMessage(), storyItem, ChatActivityEnterView.this.replyingQuote, null, z, i, i2, false, obj2, ChatActivityEnterView.this.parentFragment != null ? ChatActivityEnterView.this.parentFragment.getMessageChatSendParams() : null, l.longValue(), ChatActivityEnterView.this.getSendMonoForumPeerId(), ChatActivityEnterView.this.getSendMessageSuggestionParams());
                    }
                    if (ChatActivityEnterView.this.searchingType != 0) {
                        ChatActivityEnterView.this.setSearchingTypeInternal(0, true);
                        ChatActivityEnterView.this.emojiView.closeSearch(true);
                        ChatActivityEnterView.this.emojiView.hideSearchKeyboard();
                    }
                }
            }
            if (ChatActivityEnterView.this.delegate != null) {
                ChatActivityEnterView.this.delegate.onMessageSend(null, z, i, 0, 0L);
            }
        }

        @Override
        public void onTabOpened(int i) {
            ChatActivityEnterView.this.delegate.onEmojiViewTabChanged();
            ChatActivityEnterView.this.delegate.onStickersTab(i == 3);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.post(chatActivityEnterView.updateExpandabilityRunnable);
        }

        @Override
        public void onClearEmojiRecent() {
            if (ChatActivityEnterView.this.parentFragment == null || ChatActivityEnterView.this.parentActivity == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(ChatActivityEnterView.this.parentActivity, ChatActivityEnterView.this.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatActivityEnterView.this.emojiView.clearRecentEmoji();
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            ChatActivityEnterView.this.parentFragment.showDialog(builder.create());
        }

        @Override
        public void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            if (ChatActivityEnterView.this.trendingStickersAlert == null || ChatActivityEnterView.this.trendingStickersAlert.isDismissed()) {
                BaseFragment lastFragment = ChatActivityEnterView.this.parentFragment;
                if (lastFragment == null) {
                    lastFragment = LaunchActivity.getLastFragment();
                }
                BaseFragment baseFragment = lastFragment;
                if (baseFragment == null || ChatActivityEnterView.this.parentActivity == null) {
                    return;
                }
                if (stickerSet != null) {
                    inputStickerSet = new TLRPC.TL_inputStickerSetID();
                    inputStickerSet.access_hash = stickerSet.access_hash;
                    inputStickerSet.id = stickerSet.id;
                }
                Activity activity = ChatActivityEnterView.this.parentActivity;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                StickersAlert stickersAlert = new StickersAlert(activity, baseFragment, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.resourcesProvider, false);
                baseFragment.showDialog(stickersAlert);
                if (z) {
                    stickersAlert.enableEditMode();
                    return;
                }
                return;
            }
            ChatActivityEnterView.this.trendingStickersAlert.getLayout().showStickerSet(stickerSet, inputStickerSet);
        }

        @Override
        public void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
            MediaDataController.getInstance(ChatActivityEnterView.this.currentAccount).toggleStickerSet(ChatActivityEnterView.this.parentActivity, stickerSetCovered, 2, ChatActivityEnterView.this.parentFragment, false, false);
        }

        @Override
        public void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            MediaDataController.getInstance(ChatActivityEnterView.this.currentAccount).toggleStickerSet(ChatActivityEnterView.this.parentActivity, stickerSetCovered, 0, ChatActivityEnterView.this.parentFragment, false, false);
        }

        @Override
        public void onStickersGroupClick(long j) {
            if (ChatActivityEnterView.this.parentFragment != null) {
                if (AndroidUtilities.isTablet()) {
                    ChatActivityEnterView.this.hidePopup(false);
                }
                GroupStickersActivity groupStickersActivity = new GroupStickersActivity(j);
                groupStickersActivity.setInfo(ChatActivityEnterView.this.info);
                ChatActivityEnterView.this.parentFragment.presentFragment(groupStickersActivity);
            }
        }

        @Override
        public void onSearchOpenClose(int i) {
            ChatActivityEnterView.this.setSearchingTypeInternal(i, true);
            if (i != 0) {
                ChatActivityEnterView.this.setStickersExpanded(true, true, false, i == 1);
            }
            if (ChatActivityEnterView.this.emojiTabOpen && ChatActivityEnterView.this.searchingType == 2) {
                ChatActivityEnterView.this.checkStickresExpandHeight();
            }
        }

        @Override
        public boolean isSearchOpened() {
            return ChatActivityEnterView.this.searchingType != 0;
        }

        @Override
        public boolean isExpanded() {
            return ChatActivityEnterView.this.stickersExpanded;
        }

        @Override
        public boolean canSchedule() {
            return ChatActivityEnterView.this.parentFragment != null && ChatActivityEnterView.this.parentFragment.canScheduleMessage();
        }

        @Override
        public boolean isInScheduleMode() {
            return ChatActivityEnterView.this.parentFragment != null && ChatActivityEnterView.this.parentFragment.isInScheduleMode();
        }

        @Override
        public long getDialogId() {
            return ChatActivityEnterView.this.dialog_id;
        }

        @Override
        public int getThreadId() {
            return ChatActivityEnterView.this.getThreadMessageId();
        }

        @Override
        public void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            BaseFragment lastFragment = ChatActivityEnterView.this.parentFragment;
            if (lastFragment == null) {
                lastFragment = LaunchActivity.getLastFragment();
            }
            BaseFragment baseFragment = lastFragment;
            if (baseFragment != null) {
                ChatActivityEnterView.this.trendingStickersAlert = new TrendingStickersAlert(ChatActivityEnterView.this.getContext(), baseFragment, trendingStickersLayout, ChatActivityEnterView.this.resourcesProvider) {
                    @Override
                    public void dismiss() {
                        super.dismiss();
                        if (ChatActivityEnterView.this.trendingStickersAlert == this) {
                            ChatActivityEnterView.this.trendingStickersAlert = null;
                        }
                        if (ChatActivityEnterView.this.delegate != null) {
                            ChatActivityEnterView.this.delegate.onTrendingStickersShowed(false);
                        }
                    }
                };
                if (ChatActivityEnterView.this.delegate != null) {
                    ChatActivityEnterView.this.delegate.onTrendingStickersShowed(true);
                }
                baseFragment.showDialog(ChatActivityEnterView.this.trendingStickersAlert);
            }
        }

        @Override
        public void invalidateEnterView() {
            ChatActivityEnterView.this.invalidate();
        }

        @Override
        public float getProgressToSearchOpened() {
            return ChatActivityEnterView.this.searchToOpenProgress;
        }
    }

    @Override
    public void onStickerSelected(final TLRPC.Document document, final String str, final Object obj, final MessageObject.SendAnimationData sendAnimationData, final boolean z, final boolean z2, final int i, final int i2) {
        ChatActivity chatActivity;
        if (this.isLiveComment) {
            return;
        }
        ChatActivity.ReplyQuote replyQuote = this.replyingQuote;
        if (replyQuote != null && (chatActivity = this.parentFragment) != null && replyQuote.outdated) {
            chatActivity.showQuoteMessageUpdate();
        } else if (isInScheduleMode() && i == 0) {
            AlertsCreator.createScheduleDatePickerDialog(this.parentActivity, this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z3, int i3, int i4) {
                    this.f$0.onStickerSelected(document, str, obj, sendAnimationData, z, z3, i3, i4);
                }
            }, this.resourcesProvider);
        } else {
            AlertsCreator.ensurePaidMessageConfirmation(this.currentAccount, this.dialog_id, 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    ChatActivityEnterView.$r8$lambda$PJdtgB9VsyQY1pFztNgdQwK0oNQ(this.f$0, document, str, sendAnimationData, z2, i, i2, obj, z, (Long) obj2);
                }
            });
        }
    }

    public static void $r8$lambda$PJdtgB9VsyQY1pFztNgdQwK0oNQ(final ChatActivityEnterView chatActivityEnterView, final TLRPC.Document document, final String str, final MessageObject.SendAnimationData sendAnimationData, final boolean z, final int i, final int i2, final Object obj, final boolean z2, final Long l) {
        chatActivityEnterView.getClass();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChatActivityEnterView.m2098$r8$lambda$WYgDBn6l43VUCHiUESgEtucmGc(this.f$0, document, str, sendAnimationData, z, i, i2, obj, l, z2);
            }
        };
        if (chatActivityEnterView.showConfirmAlert(runnable)) {
            return;
        }
        runnable.run();
    }

    public static void m2098$r8$lambda$WYgDBn6l43VUCHiUESgEtucmGc(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        if (chatActivityEnterView.slowModeTimer > 0 && !chatActivityEnterView.isInScheduleMode()) {
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
            if (chatActivityEnterViewDelegate != null) {
                SlowModeBtn slowModeBtn = chatActivityEnterView.slowModeButton;
                chatActivityEnterViewDelegate.onUpdateSlowModeButton(slowModeBtn, true, slowModeBtn.getText());
                return;
            }
            return;
        }
        if (chatActivityEnterView.searchingType != 0) {
            chatActivityEnterView.setSearchingTypeInternal(0, true);
            chatActivityEnterView.emojiView.closeSearch(true);
            chatActivityEnterView.emojiView.hideSearchKeyboard();
        }
        chatActivityEnterView.setStickersExpanded(false, true, false);
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = chatActivityEnterView.delegate;
        TL_stories.StoryItem replyToStory = chatActivityEnterViewDelegate2 != null ? chatActivityEnterViewDelegate2.getReplyToStory() : null;
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.currentAccount);
        long j = chatActivityEnterView.dialog_id;
        MessageObject messageObject = chatActivityEnterView.replyingMessageObject;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        ChatActivity.ReplyQuote replyQuote = chatActivityEnterView.replyingQuote;
        boolean z3 = obj instanceof TLRPC.TL_messages_stickerSet;
        ChatActivity chatActivity = chatActivityEnterView.parentFragment;
        sendMessagesHelper.sendSticker(document, str, j, messageObject, threadMessage, replyToStory, replyQuote, sendAnimationData, z, i, i2, z3, obj, chatActivity != null ? chatActivity.getMessageChatSendParams() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate3 = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate3 != null) {
            chatActivityEnterViewDelegate3.onMessageSend(null, true, i, 0, 0L);
        }
        if (z2) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.currentAccount).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    @Override
    public boolean canSchedule() {
        ChatActivity chatActivity = this.parentFragment;
        return chatActivity != null && chatActivity.canScheduleMessage();
    }

    @Override
    public boolean isInScheduleMode() {
        ChatActivity chatActivity = this.parentFragment;
        return chatActivity != null && chatActivity.isInScheduleMode();
    }

    public boolean isEditingBusinessLink() {
        return this.editingBusinessLink != null;
    }

    public void addStickerToRecent(TLRPC.Document document) {
        createEmojiView();
        this.emojiView.addRecentSticker(document);
    }

    public void showEmojiView() {
        showPopup(1, 0);
    }

    public void showPopup(int i, int i2) {
        showPopup(i, i2, true, true);
    }

    private void showPopup(int i, int i2, boolean z) {
        showPopup(i, i2, z, true);
    }

    public void showPopup(final int i, int i2, boolean z, boolean z2) {
        boolean z3;
        float f;
        int measuredHeight;
        int measuredHeight2;
        float f2;
        boolean z4 = false;
        if (i == 2) {
            return;
        }
        View view = null;
        Property property = View.TRANSLATION_Y;
        if (i == 1) {
            if (i2 == 0) {
                if (this.parentActivity == null && this.emojiView == null) {
                    return;
                } else {
                    createEmojiView();
                }
            }
            if (i2 == 0) {
                attachEmojiView();
                if (this.emojiViewVisible) {
                    this.emojiView.getVisibility();
                }
                this.emojiView.setVisibility(0);
                this.emojiViewVisible = true;
                BotKeyboardView botKeyboardView = this.botKeyboardView;
                if (botKeyboardView == null || botKeyboardView.getVisibility() == 8) {
                    measuredHeight = 0;
                } else {
                    this.botKeyboardView.setVisibility(8);
                    this.botKeyboardViewVisible = false;
                    measuredHeight = this.botKeyboardView.getMeasuredHeight();
                }
                this.emojiView.setShowing(true);
                view = this.emojiView;
                this.animatingContentType = 0;
                f = 0.0f;
            } else if (i2 == 1) {
                if (this.botKeyboardViewVisible) {
                    this.botKeyboardView.getVisibility();
                }
                this.botKeyboardViewVisible = true;
                EmojiView emojiView = this.emojiView;
                if (emojiView == null || emojiView.getVisibility() == 8) {
                    measuredHeight2 = 0;
                } else {
                    this.viewParentForEmojiView.removeView(this.emojiView);
                    this.emojiView.setVisibility(8);
                    this.emojiView.setShowing(false);
                    this.emojiViewVisible = false;
                    measuredHeight2 = this.emojiView.getMeasuredHeight();
                }
                this.botKeyboardView.setVisibility(0);
                View view2 = this.botKeyboardView;
                this.animatingContentType = 1;
                f = 0.0f;
                MessagesController.getMainSettings(this.currentAccount).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                measuredHeight = measuredHeight2;
                view = view2;
            } else {
                f = 0.0f;
                measuredHeight = 0;
            }
            this.currentPopupContentType = i2;
            if (this.keyboardHeight <= 0) {
                f2 = 200.0f;
                this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            } else {
                f2 = 200.0f;
            }
            if (this.keyboardHeightLand <= 0) {
                this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f2));
            }
            Point point = AndroidUtilities.displaySize;
            int iMin = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
            ChatActivity chatActivity = this.parentFragment;
            if (chatActivity != null && chatActivity.getParentLayout() != null) {
                iMin -= this.parentFragment.getParentLayout().getBottomTabsHeight(false);
            }
            if (i2 == 1) {
                iMin = Math.min(this.botKeyboardView.getKeyboardHeight(), iMin);
            }
            BotKeyboardView botKeyboardView2 = this.botKeyboardView;
            if (botKeyboardView2 != null) {
                botKeyboardView2.setPanelHeight(iMin);
            }
            if (view != null && this.windowInsetsInAppController == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.height = iMin;
                view.setLayoutParams(layoutParams);
            }
            if (!AndroidUtilities.isInMultiwindow) {
                AndroidUtilities.hideKeyboard(this.messageEditText);
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
            if (sizeNotifierFrameLayout != null) {
                this.emojiPadding = iMin;
                sizeNotifierFrameLayout.requestLayout();
                setEmojiButtonImage(true, true);
                updateBotButton(true);
                onWindowSizeChanged();
                if (this.smoothKeyboard && !this.keyboardVisible && iMin != measuredHeight && z) {
                    final Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            ChatActivityEnterView.$r8$lambda$wA_TiQCErjdsUoro5y1OJyPYaV4(this.f$0);
                        }
                    };
                    if (this.overrideKeyboardAnimation) {
                        this.animationEndRunnable = runnable;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.panelAnimation = animatorSet;
                        if (this.windowInsetsInAppController != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(iMin - measuredHeight, f));
                        } else {
                            float f3 = iMin - measuredHeight;
                            view.setTranslationY(f3);
                            this.panelAnimation.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f3, f));
                        }
                        this.panelAnimation.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                        this.panelAnimation.setDuration(250L);
                        this.panelAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                ChatActivityEnterView.this.panelAnimation = null;
                                ChatActivityEnterView.this.notificationsLocker.unlock();
                                runnable.run();
                            }
                        });
                        AndroidUtilities.runOnUIThread(this.runEmojiPanelAnimation, 50L);
                        this.notificationsLocker.lock();
                    }
                    requestLayout();
                }
            }
            WindowInsetsInAppController windowInsetsInAppController = this.windowInsetsInAppController;
            if (windowInsetsInAppController != null) {
                windowInsetsInAppController.requestInAppKeyboardHeightIncludeNavbar(iMin);
            }
        } else {
            if (this.emojiButton != null) {
                setEmojiButtonImage(false, true);
            }
            this.currentPopupContentType = -1;
            EmojiView emojiView2 = this.emojiView;
            if (emojiView2 != null) {
                if (i != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    if (this.smoothKeyboard && !this.keyboardVisible && !this.stickersExpanded) {
                        this.emojiViewVisible = true;
                        this.animatingContentType = 0;
                        emojiView2.setShowing(false);
                        final Runnable runnable2 = new Runnable() {
                            @Override
                            public final void run() {
                                ChatActivityEnterView.$r8$lambda$fWF8gW8Ibc8kASvyywk9NIdXFtc(this.f$0, i);
                            }
                        };
                        if (!this.overrideKeyboardAnimation) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.panelAnimation = animatorSet2;
                            if (this.windowInsetsInAppController != null) {
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.emojiView.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                EmojiView emojiView3 = this.emojiView;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(emojiView3, (Property<EmojiView, Float>) property, emojiView3.getMeasuredHeight()));
                            }
                            this.panelAnimation.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                            this.panelAnimation.setDuration(250L);
                            this.notificationsLocker.lock();
                            this.panelAnimation.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    runnable2.run();
                                    ChatActivityEnterView.this.notificationsLocker.unlock();
                                }
                            });
                        } else {
                            this.animationEndRunnable = runnable2;
                        }
                        AndroidUtilities.runOnUIThread(this.runEmojiPanelAnimation, 50L);
                        requestLayout();
                        z4 = false;
                    } else {
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
                        if (chatActivityEnterViewDelegate != null) {
                            chatActivityEnterViewDelegate.bottomPanelTranslationYChanged(0.0f);
                        }
                        z4 = false;
                        this.emojiPadding = 0;
                        this.viewParentForEmojiView.removeView(this.emojiView);
                        this.emojiView.setVisibility(8);
                        this.emojiView.setShowing(false);
                    }
                } else {
                    this.removeEmojiViewAfterAnimation = false;
                    ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = this.delegate;
                    if (chatActivityEnterViewDelegate2 != null) {
                        chatActivityEnterViewDelegate2.bottomPanelTranslationYChanged(0.0f);
                    }
                    this.viewParentForEmojiView.removeView(this.emojiView);
                    this.emojiView = null;
                }
                this.emojiViewVisible = z4;
            }
            BotKeyboardView botKeyboardView3 = this.botKeyboardView;
            if (botKeyboardView3 != null && botKeyboardView3.getVisibility() == 0) {
                if (i != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    if (this.smoothKeyboard && !this.keyboardVisible) {
                        if (this.botKeyboardViewVisible) {
                            this.animatingContentType = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.panelAnimation = animatorSet3;
                        if (this.windowInsetsInAppController != null) {
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.botKeyboardView.getMeasuredHeight()));
                        } else {
                            BotKeyboardView botKeyboardView4 = this.botKeyboardView;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(botKeyboardView4, (Property<BotKeyboardView, Float>) property, botKeyboardView4.getMeasuredHeight()));
                        }
                        this.panelAnimation.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                        this.panelAnimation.setDuration(250L);
                        this.panelAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (i == 0) {
                                    ChatActivityEnterView.this.emojiPadding = 0;
                                }
                                ChatActivityEnterView.this.panelAnimation = null;
                                ChatActivityEnterView.this.botKeyboardView.setTranslationY(0.0f);
                                ChatActivityEnterView.this.botKeyboardView.setVisibility(8);
                                ChatActivityEnterView.this.notificationsLocker.unlock();
                                if (ChatActivityEnterView.this.delegate != null) {
                                    ChatActivityEnterView.this.delegate.bottomPanelTranslationYChanged(0.0f);
                                }
                                ChatActivityEnterView.this.requestLayout();
                            }
                        });
                        this.notificationsLocker.lock();
                        AndroidUtilities.runOnUIThread(this.runEmojiPanelAnimation, 50L);
                        requestLayout();
                    } else if (!this.waitingForKeyboardOpen) {
                        this.botKeyboardView.setVisibility(8);
                    }
                }
                this.botKeyboardViewVisible = false;
            }
            if (i2 == 1 && this.botButtonsMessageObject != null) {
                MessagesController.getMainSettings(this.currentAccount).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.botButtonsMessageObject.getId()).apply();
            }
            updateBotButton(true);
            WindowInsetsInAppController windowInsetsInAppController2 = this.windowInsetsInAppController;
            if (windowInsetsInAppController2 != null) {
                windowInsetsInAppController2.resetInAppKeyboardHeight(z2);
            }
        }
        if (this.stickersTabOpen || this.emojiTabOpen) {
            checkSendButton(true);
        }
        if (!this.stickersExpanded || i == 1) {
            z3 = false;
        } else {
            z3 = false;
            setStickersExpanded(false, false, false);
        }
        updateFieldHint(z3);
        checkBotMenu();
    }

    public static void $r8$lambda$wA_TiQCErjdsUoro5y1OJyPYaV4(ChatActivityEnterView chatActivityEnterView) {
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.bottomPanelTranslationYChanged(0.0f);
        }
        chatActivityEnterView.requestLayout();
    }

    public static void $r8$lambda$fWF8gW8Ibc8kASvyywk9NIdXFtc(ChatActivityEnterView chatActivityEnterView, int i) {
        if (i == 0) {
            chatActivityEnterView.emojiPadding = 0;
        }
        chatActivityEnterView.panelAnimation = null;
        EmojiView emojiView = chatActivityEnterView.emojiView;
        if (emojiView != null) {
            if (chatActivityEnterView.windowInsetsInAppController == null) {
                emojiView.setTranslationY(0.0f);
            }
            chatActivityEnterView.emojiView.setVisibility(8);
            chatActivityEnterView.viewParentForEmojiView.removeView(chatActivityEnterView.emojiView);
            if (chatActivityEnterView.removeEmojiViewAfterAnimation) {
                chatActivityEnterView.removeEmojiViewAfterAnimation = false;
                chatActivityEnterView.emojiView = null;
            }
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.bottomPanelTranslationYChanged(0.0f);
        }
        chatActivityEnterView.requestLayout();
    }

    private void attachEmojiView() {
        if (this.emojiView.getParent() == null) {
            if (this.windowInsetsInAppController == null) {
                this.viewParentForEmojiView.addView(this.emojiView);
            } else {
                this.viewParentForEmojiView.addView(this.emojiView, LayoutHelper.createFrame(-1, -1.0f));
            }
        }
    }

    private String getTopicKeyString() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null && chatActivity.isTopic) {
            return this.dialog_id + "_" + this.parentFragment.getTopicId();
        }
        return "" + this.dialog_id;
    }

    public void setEmojiButtonImage(boolean z, boolean z2) {
        int currentPage;
        ChatActivityEnterViewAnimatedIconView.State state;
        ChatActivityEnterViewAnimatedIconView.State state2;
        FrameLayout frameLayout;
        if (this.emojiButton == null) {
            return;
        }
        if (this.recordInterfaceState == 1 || ((frameLayout = this.recordedAudioPanel) != null && frameLayout.getVisibility() == 0)) {
            this.emojiButtonScale = 0.0f;
            this.emojiButtonAlpha = 0.0f;
            updateEmojiButtonParams();
            z2 = false;
        }
        if (z && this.currentPopupContentType == 0) {
            if (!this.sendPlainEnabled) {
                return;
            } else {
                state = ChatActivityEnterViewAnimatedIconView.State.KEYBOARD;
            }
        } else {
            EmojiView emojiView = this.emojiView;
            if (emojiView == null) {
                currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
            } else {
                currentPage = emojiView.getCurrentPage();
            }
            if (currentPage == 0 || (!this.allowStickers && !this.allowGifs)) {
                state = ChatActivityEnterViewAnimatedIconView.State.SMILE;
            } else {
                EditTextCaption editTextCaption = this.messageEditText;
                if (editTextCaption != null && !TextUtils.isEmpty(editTextCaption.getText())) {
                    state = ChatActivityEnterViewAnimatedIconView.State.SMILE;
                } else if (currentPage == 1) {
                    state = ChatActivityEnterViewAnimatedIconView.State.STICKER;
                } else {
                    state = ChatActivityEnterViewAnimatedIconView.State.GIF;
                }
            }
        }
        if (!this.sendPlainEnabled && state == ChatActivityEnterViewAnimatedIconView.State.SMILE) {
            state = ChatActivityEnterViewAnimatedIconView.State.GIF;
        } else if (!this.stickersEnabled && state != (state2 = ChatActivityEnterViewAnimatedIconView.State.SMILE)) {
            state = state2;
        }
        this.emojiButton.setState(state, z2);
        onEmojiIconChanged(state);
    }

    protected void onEmojiIconChanged(ChatActivityEnterViewAnimatedIconView.State state) {
        if (state == ChatActivityEnterViewAnimatedIconView.State.GIF && this.emojiView == null) {
            MediaDataController.getInstance(this.currentAccount).loadRecents(0, true, true, false);
            ArrayList<String> arrayList = MessagesController.getInstance(this.currentAccount).gifSearchEmojies;
            int iMin = Math.min(10, arrayList.size());
            for (int i = 0; i < iMin; i++) {
                Emoji.preloadEmoji(arrayList.get(i));
            }
        }
    }

    public boolean hidePopup(boolean z) {
        return hidePopup(z, false);
    }

    public boolean hidePopup(boolean z, boolean z2) {
        return hidePopup(z, z2, true);
    }

    public boolean hidePopup(boolean z, boolean z2, boolean z3) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (!isPopupShowing()) {
            return false;
        }
        if (this.currentPopupContentType == 1 && (tL_replyKeyboardMarkup = this.botReplyMarkup) != null && z && this.botButtonsMessageObject != null) {
            if (tL_replyKeyboardMarkup.is_persistent) {
                return false;
            }
            MessagesController.getMainSettings(this.currentAccount).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.botButtonsMessageObject.getId()).apply();
        }
        if ((z && this.searchingType != 0) || z2) {
            setSearchingTypeInternal(0, true);
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(true);
            }
            EditTextCaption editTextCaption = this.messageEditText;
            if (editTextCaption != null) {
                editTextCaption.requestFocus();
            }
            setStickersExpanded(false, true, false);
            if (this.emojiTabOpen) {
                checkSendButton(true);
            }
        } else if (this.searchingType != 0) {
            setSearchingTypeInternal(0, false);
            this.emojiView.closeSearch(false);
            EditTextCaption editTextCaption2 = this.messageEditText;
            if (editTextCaption2 != null) {
                editTextCaption2.requestFocus();
            }
        } else if (this.stickersExpanded) {
            setStickersExpanded(false, true, false);
        } else {
            showPopup(0, 0, true, z3 && !z);
        }
        return true;
    }

    public void setSearchingTypeInternal(int i, boolean z) {
        final boolean z2 = i != 0;
        if (z2 != (this.searchingType != 0)) {
            ValueAnimator valueAnimator = this.searchAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.searchAnimator.cancel();
            }
            if (!z) {
                this.searchToOpenProgress = z2 ? 1.0f : 0.0f;
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    emojiView.searchProgressChanged();
                }
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchToOpenProgress, z2 ? 1.0f : 0.0f);
                this.searchAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ChatActivityEnterView.$r8$lambda$RA79Y2uwiULkvWLo03OWAvsE500(this.f$0, valueAnimator2);
                    }
                });
                this.searchAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChatActivityEnterView.this.searchToOpenProgress = z2 ? 1.0f : 0.0f;
                        if (ChatActivityEnterView.this.emojiView != null) {
                            ChatActivityEnterView.this.emojiView.searchProgressChanged();
                        }
                    }
                });
                this.searchAnimator.setDuration(220L);
                this.searchAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.searchAnimator.start();
            }
        }
        this.searchingType = i;
    }

    public static void $r8$lambda$RA79Y2uwiULkvWLo03OWAvsE500(ChatActivityEnterView chatActivityEnterView, ValueAnimator valueAnimator) {
        chatActivityEnterView.getClass();
        chatActivityEnterView.searchToOpenProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        EmojiView emojiView = chatActivityEnterView.emojiView;
        if (emojiView != null) {
            emojiView.searchProgressChanged();
        }
    }

    public boolean isCurrentPageEmoji() {
        EmojiView emojiView = this.emojiView;
        return emojiView != null && emojiView.getCurrentPage() == 0;
    }

    public void openKeyboardInternal() {
        ChatActivity chatActivity;
        if ((hasBotWebView() && botCommandsMenuIsShowing()) || BaseFragment.hasSheets(this.parentFragment)) {
            return;
        }
        showPopup((AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || ((chatActivity = this.parentFragment) != null && chatActivity.isInBubbleMode()) || this.isPaused) ? 0 : 2, 0);
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onKeyboardRequested();
        }
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.messageEditText);
        if (this.isPaused) {
            this.showKeyboardOnResume = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow) {
            return;
        }
        ChatActivity chatActivity2 = this.parentFragment;
        if (chatActivity2 == null || !chatActivity2.isInBubbleMode()) {
            this.waitingForKeyboardOpen = true;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
            AndroidUtilities.runOnUIThread(this.openKeyboardRunnable, 100L);
        }
    }

    public boolean isEditingMessage() {
        return this.editingMessageObject != null;
    }

    public MessageObject getEditingMessageObject() {
        return this.editingMessageObject;
    }

    public boolean isEditingCaption() {
        return this.editingCaption;
    }

    public boolean hasAudioToSend() {
        return (this.audioToSendMessageObject == null && this.videoToSendMessageObject == null) ? false : true;
    }

    public void openKeyboard() {
        if ((hasBotWebView() && botCommandsMenuIsShowing()) || BaseFragment.hasSheets(this.parentFragment)) {
            return;
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onKeyboardRequested();
        }
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption == null || AndroidUtilities.showKeyboard(editTextCaption)) {
            return;
        }
        this.messageEditText.clearFocus();
        this.messageEditText.requestFocus();
    }

    public void closeKeyboard() {
        AndroidUtilities.hideKeyboard(this.messageEditText);
    }

    public boolean isPopupShowing() {
        return this.emojiViewVisible || this.botKeyboardViewVisible;
    }

    public boolean closeCreationLinkDialog(boolean z) {
        EditTextCaption editTextCaption = this.messageEditText;
        return editTextCaption != null && editTextCaption.closeCreationLinkDialog(z);
    }

    public boolean isKeyboardVisible() {
        return this.keyboardVisible;
    }

    public boolean isWaitingForKeyboard() {
        return this.waitingForKeyboardOpen;
    }

    public void addRecentGif(TLRPC.Document document) {
        MediaDataController.getInstance(this.currentAccount).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.addRecentGif(document);
        }
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && this.stickersExpanded) {
            setSearchingTypeInternal(0, false);
            this.emojiView.closeSearch(false);
            setStickersExpanded(false, false, false);
        }
        VideoTimelineView videoTimelineView = this.videoTimelineView;
        if (videoTimelineView != null) {
            videoTimelineView.clearFrames();
        }
    }

    public boolean isStickersExpanded() {
        return this.stickersExpanded;
    }

    @Override
    public void onSizeChanged(int i, boolean z) {
        MessageObject messageObject;
        EditTextCaption editTextCaption;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z2;
        View view;
        int i2;
        int i3;
        WindowInsetsInAppController windowInsetsInAppController;
        if (this.searchingType != 0) {
            this.lastSizeChangeValue1 = i;
            this.lastSizeChangeValue2 = z;
            this.keyboardVisible = i > 0;
            checkBotMenu();
            return;
        }
        if (i > AndroidUtilities.dp(50.0f) && this.keyboardVisible && !AndroidUtilities.isInMultiwindow) {
            if (z) {
                this.keyboardHeightLand = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
            } else {
                this.keyboardHeight = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
            }
        }
        if (this.keyboardVisible && this.emojiViewVisible && this.emojiView == null) {
            this.emojiViewVisible = false;
        }
        if (isPopupShowing()) {
            int iMin = z ? this.keyboardHeightLand : this.keyboardHeight;
            ChatActivity chatActivity = this.parentFragment;
            if (chatActivity != null && chatActivity.getParentLayout() != null) {
                iMin -= this.parentFragment.getParentLayout().getBottomTabsHeight(false);
            }
            if (this.currentPopupContentType == 1 && !this.botKeyboardView.isFullSize()) {
                iMin = Math.min(this.botKeyboardView.getKeyboardHeight(), iMin);
            }
            int i4 = this.currentPopupContentType;
            if (i4 == 0) {
                view = this.emojiView;
            } else {
                view = i4 == 1 ? this.botKeyboardView : null;
            }
            BotKeyboardView botKeyboardView = this.botKeyboardView;
            if (botKeyboardView != null) {
                botKeyboardView.setPanelHeight(iMin);
                WindowInsetsInAppController windowInsetsInAppController2 = this.windowInsetsInAppController;
                if (windowInsetsInAppController2 != null && iMin > 0 && this.currentPopupContentType == 1) {
                    windowInsetsInAppController2.requestInAppKeyboardHeightIncludeNavbar(iMin);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.closeAnimationInProgress && !this.stickersExpanded && (((i2 = layoutParams.width) != (i3 = AndroidUtilities.displaySize.x) || layoutParams.height != iMin) && ((windowInsetsInAppController = this.windowInsetsInAppController) == null || i2 != -1 || layoutParams.height != -1))) {
                    if (windowInsetsInAppController == null) {
                        layoutParams.width = i3;
                        layoutParams.height = iMin;
                        view.setLayoutParams(layoutParams);
                    }
                    SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
                    if (sizeNotifierFrameLayout != null) {
                        int i5 = this.emojiPadding;
                        this.emojiPadding = layoutParams.height;
                        sizeNotifierFrameLayout.requestLayout();
                        onWindowSizeChanged();
                        if (this.smoothKeyboard && !this.keyboardVisible && i5 != this.emojiPadding && pannelAnimationEnabled()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.panelAnimation = animatorSet;
                            if (this.windowInsetsInAppController != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.emojiPadding - i5, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, this.emojiPadding - i5, 0.0f));
                            }
                            this.panelAnimation.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                            this.panelAnimation.setDuration(250L);
                            this.panelAnimation.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    ChatActivityEnterView.this.panelAnimation = null;
                                    if (ChatActivityEnterView.this.delegate != null) {
                                        ChatActivityEnterView.this.delegate.bottomPanelTranslationYChanged(0.0f);
                                    }
                                    ChatActivityEnterView.this.requestLayout();
                                    ChatActivityEnterView.this.notificationsLocker.unlock();
                                }
                            });
                            AndroidUtilities.runOnUIThread(this.runEmojiPanelAnimation, 50L);
                            this.notificationsLocker.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            onWindowSizeChanged();
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z3 = this.keyboardVisible;
        this.keyboardVisible = i > 0;
        checkBotMenu();
        if (this.keyboardVisible && isPopupShowing() && this.stickersExpansionAnim == null) {
            showPopup(0, this.currentPopupContentType);
        } else if (!this.keyboardVisible && !isPopupShowing() && (messageObject = this.botButtonsMessageObject) != null && this.replyingMessageObject != messageObject && !hasBotWebView() && !botCommandsMenuIsShowing() && !BaseFragment.hasSheets(this.parentFragment) && (((editTextCaption = this.messageEditText) == null || TextUtils.isEmpty(editTextCaption.getText())) && (tL_replyKeyboardMarkup = this.botReplyMarkup) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            if (this.sizeNotifierLayout.adjustPanLayoutHelper.animationInProgress()) {
                this.sizeNotifierLayout.adjustPanLayoutHelper.stopTransition();
            } else {
                this.sizeNotifierLayout.adjustPanLayoutHelper.ignoreOnce();
            }
            showPopup(1, 1, false);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !isPopupShowing()) {
            this.emojiPadding = 0;
            this.sizeNotifierLayout.requestLayout();
        }
        if (this.keyboardVisible && this.waitingForKeyboardOpen) {
            this.waitingForKeyboardOpen = false;
            if (this.clearBotButtonsOnKeyboardOpen) {
                this.clearBotButtonsOnKeyboardOpen = false;
                this.botKeyboardView.setButtons(this.botReplyMarkup);
            }
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        }
        onWindowSizeChanged();
    }

    public void checkReactionsButton(boolean z) {
        AndroidUtilities.updateViewVisibilityAnimated(this.reactionsButton, z, 0.1f, true);
    }

    public int getEmojiPadding() {
        return this.emojiPadding;
    }

    public int getVisibleEmojiPadding() {
        if (this.emojiViewVisible) {
            return this.emojiPadding;
        }
        return 0;
    }

    public MessageObject getThreadMessage() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            return chatActivity.getThreadMessage();
        }
        return null;
    }

    public int getThreadMessageId() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null || chatActivity.getThreadMessage() == null) {
            return 0;
        }
        return this.parentFragment.getThreadMessage().getId();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        SendButton sendButton;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        double d;
        ImageView imageView;
        if (i == NotificationCenter.emojiLoaded) {
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.invalidateViews();
            }
            BotKeyboardView botKeyboardView = this.botKeyboardView;
            if (botKeyboardView != null) {
                botKeyboardView.invalidateViews();
            }
            EditTextCaption editTextCaption = this.messageEditText;
            if (editTextCaption != null) {
                editTextCaption.postInvalidate();
                this.messageEditText.invalidateForce();
                return;
            }
            return;
        }
        if (i == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() != this.recordingGuid) {
                return;
            }
            if (this.recordInterfaceState != 0 && !this.wasSendTyping && !isInScheduleMode()) {
                this.wasSendTyping = true;
                this.accountInstance.getMessagesController().sendTyping(this.dialog_id, getThreadMessageId(), isInVideoMode() ? 7 : 1, 0);
            }
            RecordCircle recordCircle = this.recordCircle;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i == NotificationCenter.closeChats) {
            EditTextCaption editTextCaption2 = this.messageEditText;
            if (editTextCaption2 == null || !editTextCaption2.isFocused()) {
                return;
            }
            AndroidUtilities.hideKeyboard(this.messageEditText);
            return;
        }
        int i3 = 5;
        if (i == NotificationCenter.recordStartError || i == NotificationCenter.recordStopped) {
            if (((Integer) objArr[0]).intValue() == this.recordingGuid && this.recordingAudioVideo) {
                this.recordingAudioVideo = false;
                if (i == NotificationCenter.recordStopped) {
                    Integer num = (Integer) objArr[1];
                    if (num.intValue() == 4) {
                        i3 = 4;
                    } else if (isInVideoMode() && num.intValue() == 5) {
                        i3 = 1;
                    } else if (num.intValue() != 0) {
                        i3 = num.intValue() == 6 ? 2 : 3;
                    }
                    if (i3 != 3) {
                        updateRecordInterface(i3, true);
                        return;
                    }
                    return;
                }
                updateRecordInterface(2, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.recordStarted) {
            if (((Integer) objArr[0]).intValue() != this.recordingGuid) {
                return;
            }
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            this.isInVideoMode = !zBooleanValue;
            ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.audioVideoSendButton;
            if (chatActivityEnterViewAnimatedIconView != null) {
                chatActivityEnterViewAnimatedIconView.setState(zBooleanValue ? ChatActivityEnterViewAnimatedIconView.State.VOICE : ChatActivityEnterViewAnimatedIconView.State.VIDEO, true);
            }
            if (!this.recordingAudioVideo) {
                this.recordingAudioVideo = true;
                updateRecordInterface(0, true);
            } else {
                RecordCircle recordCircle2 = this.recordCircle;
                if (recordCircle2 != null) {
                    recordCircle2.showWaves(true, true);
                }
            }
            TimerView timerView = this.recordTimerView;
            if (timerView != null) {
                timerView.start(this.millisecondsRecorded);
            }
            RecordDot recordDot = this.recordDot;
            if (recordDot != null) {
                recordDot.enterAnimation = false;
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (i == NotificationCenter.recordPaused) {
            this.recordingAudioVideo = false;
            this.audioToSend = null;
            this.videoToSendMessageObject = null;
            return;
        }
        if (i == NotificationCenter.recordResumed) {
            this.audioToSend = null;
            this.videoToSendMessageObject = null;
            TimerView timerView2 = this.recordTimerView;
            if (timerView2 != null) {
                timerView2.start(this.millisecondsRecorded);
            }
            checkSendButton(true);
            this.recordingAudioVideo = true;
            updateRecordInterface(0, true);
            return;
        }
        if (i == NotificationCenter.audioDidSent) {
            if (((Integer) objArr[0]).intValue() != this.recordingGuid) {
                return;
            }
            this.millisecondsRecorded = 0L;
            Object obj = objArr[1];
            if (obj instanceof VideoEditedInfo) {
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                this.videoToSendMessageObject = videoEditedInfo;
                String str = (String) objArr[2];
                this.audioToSendPath = str;
                ArrayList<Bitmap> arrayList = (ArrayList) objArr[3];
                this.millisecondsRecorded = videoEditedInfo.estimatedDuration;
                VideoTimelineView videoTimelineView = this.videoTimelineView;
                if (videoTimelineView != null) {
                    videoTimelineView.setVideoPath(str);
                    this.videoTimelineView.setKeyframes(arrayList);
                    this.videoTimelineView.setVisibility(0);
                    this.videoTimelineView.setMinProgressDiff(1000.0f / this.videoToSendMessageObject.estimatedDuration);
                    isRecordingStateChanged();
                }
                updateRecordInterface(3, true);
                checkSendButton(false);
                return;
            }
            this.audioToSend = (TLRPC.TL_document) obj;
            this.audioToSendPath = (String) objArr[2];
            boolean z = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
            float fFloatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
            float fFloatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
            if (this.audioToSend != null) {
                createRecordAudioPanel();
                if (this.recordedAudioPanel == null) {
                    return;
                }
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = 0;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                tL_peerUser.user_id = clientUserId;
                peer.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                tL_message.attachPath = this.audioToSendPath;
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = this.audioToSend;
                tL_message.flags |= 768;
                this.audioToSendMessageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                this.recordedAudioPanel.setAlpha(1.0f);
                this.recordedAudioPanel.setVisibility(0);
                this.recordDeleteImageView.setVisibility(0);
                this.recordDeleteImageView.setAlpha(0.0f);
                this.recordDeleteImageView.setScaleY(0.0f);
                this.recordDeleteImageView.setScaleX(0.0f);
                int i4 = 0;
                while (true) {
                    if (i4 >= this.audioToSend.attributes.size()) {
                        d = 0.0d;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.audioToSend.attributes.get(i4);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i4++;
                }
                double d2 = d;
                for (int i5 = 0; i5 < this.audioToSend.attributes.size(); i5++) {
                    TLRPC.DocumentAttribute documentAttribute2 = this.audioToSend.attributes.get(i5);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        byte[] bArr2 = documentAttribute2.waveform;
                        if (bArr2 == null || bArr2.length == 0) {
                            documentAttribute2.waveform = MediaController.getWaveform(this.audioToSendPath);
                        }
                        bArr = documentAttribute2.waveform;
                        break;
                    }
                }
                byte[] bArr3 = bArr;
                if (z && (imageView = this.attachButton) != null) {
                    this.attachButtonAlpha = 0.0f;
                    imageView.setAlpha(0.0f);
                    this.attachButton.setScaleX(0.0f);
                    this.attachButton.setScaleY(0.0f);
                }
                this.millisecondsRecorded = (long) (1000.0d * d2);
                this.audioTimelineView.init(this.audioToSendPath, d2, bArr3, fFloatValue, fFloatValue2);
                checkSendButton(false);
                if (z) {
                    createRecordCircle();
                    createRecordPanel();
                    createRecordAudioPanel();
                    this.recordInterfaceState = 1;
                    this.recordCircle.resetLockTranslation(false);
                    this.recordControlsCircleScale.set(this.recordCircle, Float.valueOf(1.0f));
                    ControlsView controlsView = this.controlsView;
                    if (controlsView != null) {
                        controlsView.setVisibility(0);
                        this.controlsView.setAlpha(1.0f);
                    }
                }
                updateRecordInterface(3, !z);
                return;
            }
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onMessageSend(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        if (i == NotificationCenter.audioRouteChanged) {
            if (this.parentActivity != null) {
                this.parentActivity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : Integer.MIN_VALUE);
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingProgressDidChanged) {
            if (this.audioToSendMessageObject == null || !MediaController.getInstance().isPlayingMessage(this.audioToSendMessageObject)) {
                return;
            }
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            MessageObject messageObject = this.audioToSendMessageObject;
            messageObject.audioProgress = playingMessageObject.audioProgress;
            messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
            return;
        }
        if (i == NotificationCenter.featuredStickersDidLoad) {
            ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView2 = this.emojiButton;
            if (chatActivityEnterViewAnimatedIconView2 != null) {
                chatActivityEnterViewAnimatedIconView2.invalidate();
                return;
            }
            return;
        }
        if (i == NotificationCenter.messageReceivedByServer2) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            long jLongValue = ((Long) objArr[3]).longValue();
            Integer num2 = (Integer) objArr[1];
            if (jLongValue != this.dialog_id || (chatFull = this.info) == null || chatFull.slowmode_seconds == 0 || MessageObject.isEphemeralMessageId(num2.intValue()) || (chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(this.info.id))) == null || ChatObject.hasAdminRights(chat) || ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                return;
            }
            TLRPC.ChatFull chatFull2 = this.info;
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            TLRPC.ChatFull chatFull3 = this.info;
            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
            chatFull3.flags |= 262144;
            setSlowModeTimer(chatFull3.slowmode_next_send_date);
            return;
        }
        if (i == NotificationCenter.sendingMessagesChanged) {
            if (this.info != null) {
                updateSlowModeText();
                return;
            }
            return;
        }
        if (i == NotificationCenter.audioRecordTooShort) {
            this.audioToSend = null;
            this.videoToSendMessageObject = null;
            updateRecordInterface(4, true);
            return;
        }
        if (i == NotificationCenter.updateBotMenuButton) {
            long jLongValue2 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (jLongValue2 == this.dialog_id) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.botMenuWebViewTitle = tL_botMenuButton.text;
                    this.botMenuWebViewUrl = tL_botMenuButton.url;
                    this.botMenuButtonType = BotMenuButtonType.WEB_VIEW;
                } else if (this.hasBotCommands || this.hasQuickReplies) {
                    this.botMenuButtonType = BotMenuButtonType.COMMANDS;
                } else {
                    this.botMenuButtonType = BotMenuButtonType.NO_BUTTON;
                }
                updateBotButton(false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
            updateGiftButton(true);
        } else if (i == NotificationCenter.currentUserPremiumStatusChanged && this.richDraftActive && (sendButton = this.sendButton) != null) {
            sendButton.setLocked(!UserConfig.getInstance(this.currentAccount).isPremium());
        }
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i != 2 || this.pendingLocationButton == null) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            SendMessagesHelper.getInstance(this.currentAccount).sendCurrentLocation(this.pendingMessageObject, this.pendingLocationButton);
        }
        this.pendingLocationButton = null;
        this.pendingMessageObject = null;
    }

    public void checkStickresExpandHeight() {
        if (this.emojiView == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int i = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
        int iDp = ((((this.originalViewHeight - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - ActionBar.getCurrentActionBarHeight()) - getHeight();
        if (this.searchingType == 2) {
            iDp = Math.min(iDp, AndroidUtilities.dp(175.0f) + i);
        }
        int i2 = this.emojiView.getLayoutParams().height;
        if (i2 == iDp) {
            return;
        }
        Animator animator = this.stickersExpansionAnim;
        if (animator != null) {
            animator.cancel();
            this.stickersExpansionAnim = null;
        }
        this.stickersExpandedHeight = iDp;
        if (i2 > iDp) {
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ChatActivityEnterView.m2092$r8$lambda$INs3YXQnz5eyQs1JogO7iYhabA(this.f$0);
                }
            };
            this.emojiView.setLayerType(2, null);
            if (this.overrideKeyboardAnimation) {
                this.animationEndRunnable = runnable;
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.windowInsetsInAppController != null) {
                    animatorSet.playTogether(ValueAnimator.ofInt(-(this.stickersExpandedHeight - i)), ValueAnimator.ofInt(-(this.stickersExpandedHeight - i)));
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofInt(this, (Property<ChatActivityEnterView, Integer>) this.roundedTranslationYProperty, -(this.stickersExpandedHeight - i)), ObjectAnimator.ofInt(this.emojiView, (Property<EmojiView, Integer>) this.roundedTranslationYProperty, -(this.stickersExpandedHeight - i)));
                    ((ObjectAnimator) animatorSet.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f$0.sizeNotifierLayout.invalidate();
                        }
                    });
                }
                animatorSet.setDuration(300L);
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator2) {
                        ChatActivityEnterView.this.stickersExpansionAnim = null;
                        runnable.run();
                    }
                });
                this.stickersExpansionAnim = animatorSet;
                animatorSet.start();
            }
        } else {
            if (this.windowInsetsInAppController == null) {
                this.emojiView.getLayoutParams().height = this.stickersExpandedHeight;
            }
            this.sizeNotifierLayout.requestLayout();
            EditTextCaption editTextCaption = this.messageEditText;
            if (editTextCaption != null) {
                int selectionStart = editTextCaption.getSelectionStart();
                int selectionEnd = this.messageEditText.getSelectionEnd();
                EditTextCaption editTextCaption2 = this.messageEditText;
                editTextCaption2.setText(editTextCaption2.getText());
                this.messageEditText.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (this.windowInsetsInAppController != null) {
                animatorSet2.playTogether(ValueAnimator.ofInt(-(this.stickersExpandedHeight - i)), ValueAnimator.ofInt(-(this.stickersExpandedHeight - i)));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofInt(this, (Property<ChatActivityEnterView, Integer>) this.roundedTranslationYProperty, -(this.stickersExpandedHeight - i)), ObjectAnimator.ofInt(this.emojiView, (Property<EmojiView, Integer>) this.roundedTranslationYProperty, -(this.stickersExpandedHeight - i)));
                ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.sizeNotifierLayout.invalidate();
                    }
                });
            }
            animatorSet2.setDuration(300L);
            animatorSet2.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator2) {
                    ChatActivityEnterView.this.stickersExpansionAnim = null;
                    ChatActivityEnterView.this.emojiView.setLayerType(0, null);
                }
            });
            this.stickersExpansionAnim = animatorSet2;
            this.emojiView.setLayerType(2, null);
            animatorSet2.start();
        }
        WindowInsetsInAppController windowInsetsInAppController = this.windowInsetsInAppController;
        if (windowInsetsInAppController != null) {
            windowInsetsInAppController.requestInAppKeyboardHeightIncludeNavbar(iDp);
        }
    }

    public static void m2092$r8$lambda$INs3YXQnz5eyQs1JogO7iYhabA(ChatActivityEnterView chatActivityEnterView) {
        EmojiView emojiView = chatActivityEnterView.emojiView;
        if (emojiView != null) {
            if (chatActivityEnterView.windowInsetsInAppController == null) {
                emojiView.getLayoutParams().height = chatActivityEnterView.stickersExpandedHeight;
            }
            chatActivityEnterView.emojiView.setLayerType(0, null);
        }
    }

    public void setStickersExpanded(boolean z, boolean z2, boolean z3) {
        setStickersExpanded(z, z2, z3, true);
    }

    public void setStickersExpanded(boolean z, boolean z2, boolean z3, boolean z4) {
        AdjustPanLayoutHelper adjustPanLayoutHelper = this.adjustPanLayoutHelper;
        if ((adjustPanLayoutHelper != null && adjustPanLayoutHelper.animationInProgress()) || this.waitingForKeyboardOpenAfterAnimation || this.emojiView == null) {
            return;
        }
        if (z3 || this.stickersExpanded != z) {
            this.stickersExpanded = z;
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onStickersExpandedChange();
            }
            Point point = AndroidUtilities.displaySize;
            final int i = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
            Animator animator = this.stickersExpansionAnim;
            if (animator != null) {
                animator.cancel();
                this.stickersExpansionAnim = null;
            }
            if (this.stickersExpanded) {
                if (z4) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 1);
                }
                int height = this.sizeNotifierLayout.getHeight();
                this.originalViewHeight = height;
                int iDp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - ActionBar.getCurrentActionBarHeight()) - getHeight();
                this.stickersExpandedHeight = iDp;
                if (this.searchingType == 2) {
                    this.stickersExpandedHeight = Math.min(iDp, AndroidUtilities.dp(175.0f) + i);
                }
                if (this.windowInsetsInAppController == null) {
                    this.emojiView.getLayoutParams().height = this.stickersExpandedHeight;
                }
                this.sizeNotifierLayout.requestLayout();
                if (this.shouldDrawBackground) {
                    this.sizeNotifierLayout.setForeground(new ScrimDrawable());
                }
                EditTextCaption editTextCaption = this.messageEditText;
                if (editTextCaption != null) {
                    int selectionStart = editTextCaption.getSelectionStart();
                    int selectionEnd = this.messageEditText.getSelectionEnd();
                    EditTextCaption editTextCaption2 = this.messageEditText;
                    editTextCaption2.setText(editTextCaption2.getText());
                    this.messageEditText.setSelection(selectionStart, selectionEnd);
                }
                if (z2) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (this.windowInsetsInAppController != null) {
                        animatorSet.playTogether(ValueAnimator.ofInt(-(this.stickersExpandedHeight - i)), ValueAnimator.ofInt(-(this.stickersExpandedHeight - i)), ObjectAnimator.ofFloat(this.stickersArrow, "animationProgress", 1.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofInt(this, (Property<ChatActivityEnterView, Integer>) this.roundedTranslationYProperty, -(this.stickersExpandedHeight - i)), ObjectAnimator.ofInt(this.emojiView, (Property<EmojiView, Integer>) this.roundedTranslationYProperty, -(this.stickersExpandedHeight - i)), ObjectAnimator.ofFloat(this.stickersArrow, "animationProgress", 1.0f));
                    }
                    animatorSet.setDuration(300L);
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    if (this.windowInsetsInAppController == null) {
                        ((ObjectAnimator) animatorSet.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatActivityEnterView.$r8$lambda$NIPFFiE5f3Nfww_Osft_BXOvNWc(this.f$0, i, valueAnimator);
                            }
                        });
                    }
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator2) {
                            ChatActivityEnterView.this.stickersExpansionAnim = null;
                            ChatActivityEnterView.this.emojiView.setLayerType(0, null);
                            ChatActivityEnterView.this.notificationsLocker.unlock();
                        }
                    });
                    this.stickersExpansionAnim = animatorSet;
                    this.emojiView.setLayerType(2, null);
                    this.notificationsLocker.lock();
                    this.stickersExpansionProgress = 0.0f;
                    this.sizeNotifierLayout.invalidate();
                    animatorSet.start();
                } else {
                    this.stickersExpansionProgress = 1.0f;
                    if (this.windowInsetsInAppController == null) {
                        setTranslationY(-(this.stickersExpandedHeight - i));
                        this.emojiView.setTranslationY(-(this.stickersExpandedHeight - i));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.stickersArrow;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                WindowInsetsInAppController windowInsetsInAppController = this.windowInsetsInAppController;
                if (windowInsetsInAppController != null) {
                    windowInsetsInAppController.requestInAppKeyboardHeightIncludeNavbar(this.stickersExpandedHeight);
                }
            } else {
                if (z4) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 1);
                }
                if (z2) {
                    this.closeAnimationInProgress = true;
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.windowInsetsInAppController != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.stickersArrow, "animationProgress", 0.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, (Property<ChatActivityEnterView, Integer>) this.roundedTranslationYProperty, 0), ObjectAnimator.ofInt(this.emojiView, (Property<EmojiView, Integer>) this.roundedTranslationYProperty, 0), ObjectAnimator.ofFloat(this.stickersArrow, "animationProgress", 0.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    if (this.windowInsetsInAppController == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatActivityEnterView.m2091$r8$lambda$I3_jyaB3_WvF4_KPxYU_uYRYJU(this.f$0, i, valueAnimator);
                            }
                        });
                    }
                    animatorSet2.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator2) {
                            ChatActivityEnterView.this.closeAnimationInProgress = false;
                            ChatActivityEnterView.this.stickersExpansionAnim = null;
                            if (ChatActivityEnterView.this.emojiView != null) {
                                if (ChatActivityEnterView.this.windowInsetsInAppController == null) {
                                    ChatActivityEnterView.this.emojiView.getLayoutParams().height = i;
                                }
                                ChatActivityEnterView.this.emojiView.setLayerType(0, null);
                            }
                            if (ChatActivityEnterView.this.sizeNotifierLayout != null) {
                                ChatActivityEnterView.this.sizeNotifierLayout.requestLayout();
                                ChatActivityEnterView.this.sizeNotifierLayout.setForeground(null);
                                ChatActivityEnterView.this.sizeNotifierLayout.setWillNotDraw(false);
                            }
                            if (ChatActivityEnterView.this.keyboardVisible && ChatActivityEnterView.this.isPopupShowing()) {
                                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                                chatActivityEnterView.showPopup(0, chatActivityEnterView.currentPopupContentType);
                            }
                            if (ChatActivityEnterView.this.onEmojiSearchClosed != null) {
                                ChatActivityEnterView.this.onEmojiSearchClosed.run();
                                ChatActivityEnterView.this.onEmojiSearchClosed = null;
                            }
                            ChatActivityEnterView.this.notificationsLocker.unlock();
                        }
                    });
                    this.stickersExpansionProgress = 1.0f;
                    this.sizeNotifierLayout.invalidate();
                    this.stickersExpansionAnim = animatorSet2;
                    this.emojiView.setLayerType(2, null);
                    this.notificationsLocker.lock();
                    animatorSet2.start();
                } else {
                    this.stickersExpansionProgress = 0.0f;
                    if (this.windowInsetsInAppController == null) {
                        setTranslationY(0.0f);
                        this.emojiView.setTranslationY(0.0f);
                        this.emojiView.getLayoutParams().height = i;
                    }
                    this.sizeNotifierLayout.requestLayout();
                    this.sizeNotifierLayout.setForeground(null);
                    this.sizeNotifierLayout.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.stickersArrow;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                WindowInsetsInAppController windowInsetsInAppController2 = this.windowInsetsInAppController;
                if (windowInsetsInAppController2 != null) {
                    windowInsetsInAppController2.requestInAppKeyboardHeightIncludeNavbar(i);
                }
            }
            ImageView imageView = this.expandStickersButton;
            if (imageView != null) {
                if (this.stickersExpanded) {
                    imageView.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                } else {
                    imageView.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                }
            }
        }
    }

    public static void $r8$lambda$NIPFFiE5f3Nfww_Osft_BXOvNWc(ChatActivityEnterView chatActivityEnterView, int i, ValueAnimator valueAnimator) {
        chatActivityEnterView.stickersExpansionProgress = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.stickersExpandedHeight - i)));
        chatActivityEnterView.sizeNotifierLayout.invalidate();
    }

    public static void m2091$r8$lambda$I3_jyaB3_WvF4_KPxYU_uYRYJU(ChatActivityEnterView chatActivityEnterView, int i, ValueAnimator valueAnimator) {
        chatActivityEnterView.stickersExpansionProgress = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.stickersExpandedHeight - i));
        chatActivityEnterView.sizeNotifierLayout.invalidate();
    }

    public boolean swipeToBackEnabled() {
        FrameLayout frameLayout;
        if (this.recordingAudioVideo) {
            return false;
        }
        if (isInVideoMode() && (frameLayout = this.recordedAudioPanel) != null && frameLayout.getVisibility() == 0) {
            return false;
        }
        return ((hasBotWebView() && this.botCommandsMenuButton.isOpened()) || BaseFragment.hasSheets(this.parentFragment)) ? false : true;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.topView;
        return (view == null || view.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.topView.getLayoutParams().height));
    }

    public void setAdjustPanLayoutHelper(AdjustPanLayoutHelper adjustPanLayoutHelper) {
        this.adjustPanLayoutHelper = adjustPanLayoutHelper;
    }

    public AdjustPanLayoutHelper getAdjustPanLayoutHelper() {
        return this.adjustPanLayoutHelper;
    }

    public boolean panelAnimationInProgress() {
        return this.panelAnimation != null;
    }

    public float getTopViewTranslation() {
        View view = this.topView;
        if (view == null || view.getVisibility() == 8) {
            return 0.0f;
        }
        return this.topView.getTranslationY();
    }

    public int getAnimatedTop() {
        return this.animatedTop;
    }

    private class ScrimDrawable extends Drawable {
        private Paint paint;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public ScrimDrawable() {
            Paint paint = new Paint();
            this.paint = paint;
            paint.setColor(0);
        }

        @Override
        public void draw(Canvas canvas) {
            if (ChatActivityEnterView.this.emojiView == null) {
                return;
            }
            this.paint.setAlpha(Math.round(ChatActivityEnterView.this.stickersExpansionProgress * 102.0f));
            float width = ChatActivityEnterView.this.getWidth();
            float y = (ChatActivityEnterView.this.emojiView.getY() - ChatActivityEnterView.this.getHeight()) + Theme.chat_composeShadowDrawable.getIntrinsicHeight();
            EditTextCaption editTextCaption = ChatActivityEnterView.this.messageEditText;
            canvas.drawRect(0.0f, 0.0f, width, y + (editTextCaption == null ? 0.0f : editTextCaption.getOffsetY()), this.paint);
        }
    }

    class SlideTextView extends View {
        Paint arrowPaint;
        Path arrowPath;
        TextPaint bluePaint;
        float cancelAlpha;
        int cancelCharOffset;
        StaticLayout cancelLayout;
        public Rect cancelRect;
        String cancelString;
        float cancelToProgress;
        float cancelWidth;
        TextPaint grayPaint;
        private int lastSize;
        long lastUpdateTime;
        boolean moveForward;
        private boolean pressed;
        Drawable selectableBackground;
        float slideProgress;
        float slideToAlpha;
        String slideToCancelString;
        float slideToCancelWidth;
        StaticLayout slideToLayout;
        boolean smallSize;
        float xOffset;

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.cancelToProgress == 0.0f || !isEnabled()) {
                return false;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                boolean zContains = this.cancelRect.contains(x, y);
                this.pressed = zContains;
                if (zContains) {
                    this.selectableBackground.setHotspot(x, y);
                    setPressed(true);
                }
                return this.pressed;
            }
            boolean z = this.pressed;
            if (!z) {
                return z;
            }
            if (motionEvent.getAction() == 2 && !this.cancelRect.contains(x, y)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && this.cancelRect.contains(x, y)) {
                onCancelButtonPressed();
            }
            return true;
        }

        public void onCancelButtonPressed() {
            long topicId = 0;
            if (!ChatActivityEnterView.this.hasRecordVideo || !ChatActivityEnterView.this.isInVideoMode()) {
                ChatActivityEnterView.this.delegate.needStartRecordAudio(0);
                MediaController.getInstance().stopRecording(0, false, 0, ChatActivityEnterView.this.voiceOnce, 0L);
            } else {
                CameraController.getInstance().cancelOnInitRunnable(ChatActivityEnterView.this.onFinishInitCameraRunnable);
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = ChatActivityEnterView.this.delegate;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterViewDelegate.needStartRecordVideo(5, true, 0, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L);
                ChatActivityEnterView.this.sendButton.setEffect(ChatActivityEnterView.this.effectId = 0L);
            }
            ChatActivityEnterView.this.audioToSend = null;
            ChatActivityEnterView.this.audioToSendMessageObject = null;
            ChatActivityEnterView.this.videoToSendMessageObject = null;
            ChatActivityEnterView.this.millisecondsRecorded = 0L;
            ChatActivityEnterView.this.recordingAudioVideo = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(ChatActivityEnterView.this.currentAccount);
            long j = ChatActivityEnterView.this.dialog_id;
            if (ChatActivityEnterView.this.parentFragment != null && ChatActivityEnterView.this.parentFragment.isTopic) {
                topicId = ChatActivityEnterView.this.parentFragment.getTopicId();
            }
            mediaDataController.pushDraftVoiceMessage(j, topicId, null);
            ChatActivityEnterView.this.updateRecordInterface(2, true);
            ChatActivityEnterView.this.checkSendButton(true);
        }

        public SlideTextView(Context context) {
            super(context);
            this.arrowPaint = new Paint(1);
            this.xOffset = 0.0f;
            this.arrowPath = new Path();
            this.cancelRect = new Rect();
            this.smallSize = AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f);
            TextPaint textPaint = new TextPaint(1);
            this.grayPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(this.smallSize ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.bluePaint = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.bluePaint.setTypeface(AndroidUtilities.bold());
            this.arrowPaint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_glass_defaultIcon));
            this.arrowPaint.setStyle(Paint.Style.STROKE);
            this.arrowPaint.setStrokeWidth(AndroidUtilities.dpf2(this.smallSize ? 1.0f : 1.6f));
            this.arrowPaint.setStrokeCap(Paint.Cap.ROUND);
            this.arrowPaint.setStrokeJoin(Paint.Join.ROUND);
            this.slideToCancelString = LocaleController.getString(R.string.SlideToCancel2);
            String upperCase = LocaleController.getString("Cancel", R.string.Cancel).toUpperCase();
            this.cancelString = upperCase;
            this.cancelCharOffset = this.slideToCancelString.indexOf(upperCase);
            updateColors();
        }

        public void updateColors() {
            this.grayPaint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_recordTime));
            TextPaint textPaint = this.bluePaint;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i = Theme.key_chat_recordVoiceCancel;
            textPaint.setColor(chatActivityEnterView.getThemedColor(i));
            this.slideToAlpha = this.grayPaint.getAlpha();
            this.cancelAlpha = this.bluePaint.getAlpha();
            Drawable drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(60.0f), 0, ColorUtils.setAlphaComponent(ChatActivityEnterView.this.getThemedColor(i), 26));
            this.selectableBackground = drawableCreateSimpleSelectorCircleDrawable;
            drawableCreateSimpleSelectorCircleDrawable.setCallback(this);
        }

        @Override
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            this.selectableBackground.setState(getDrawableState());
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            return this.selectableBackground == drawable || super.verifyDrawable(drawable);
        }

        @Override
        public void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            Drawable drawable = this.selectableBackground;
            if (drawable != null) {
                drawable.jumpToCurrentState();
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.lastSize != measuredHeight) {
                this.lastSize = measuredHeight;
                this.slideToCancelWidth = this.grayPaint.measureText(this.slideToCancelString);
                this.cancelWidth = this.bluePaint.measureText(this.cancelString);
                this.lastUpdateTime = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                this.arrowPath.reset();
                if (this.smallSize) {
                    float f = measuredHeight2;
                    this.arrowPath.setLastPoint(AndroidUtilities.dpf2(2.5f), f - AndroidUtilities.dpf2(3.12f));
                    this.arrowPath.lineTo(0.0f, f);
                    this.arrowPath.lineTo(AndroidUtilities.dpf2(2.5f), f + AndroidUtilities.dpf2(3.12f));
                } else {
                    float f2 = measuredHeight2;
                    this.arrowPath.setLastPoint(AndroidUtilities.dpf2(4.0f), f2 - AndroidUtilities.dpf2(5.0f));
                    this.arrowPath.lineTo(0.0f, f2);
                    this.arrowPath.lineTo(AndroidUtilities.dpf2(4.0f), f2 + AndroidUtilities.dpf2(5.0f));
                }
                String str = this.slideToCancelString;
                TextPaint textPaint = this.grayPaint;
                int i3 = (int) this.slideToCancelWidth;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.slideToLayout = new StaticLayout(str, textPaint, i3, alignment, 1.0f, 0.0f, false);
                this.cancelLayout = new StaticLayout(this.cancelString, this.bluePaint, (int) this.cancelWidth, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float f;
            float f2;
            if (this.slideToLayout == null || this.cancelLayout == null || ChatActivityEnterView.this.recordCircle == null) {
                return;
            }
            int width = this.cancelLayout.getWidth() + AndroidUtilities.dp(16.0f);
            this.grayPaint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_recordTime));
            this.grayPaint.setAlpha((int) (this.slideToAlpha * (1.0f - this.cancelToProgress) * this.slideProgress));
            this.bluePaint.setAlpha((int) (this.cancelAlpha * this.cancelToProgress));
            this.arrowPaint.setColor(this.grayPaint.getColor());
            if (this.smallSize) {
                this.xOffset = AndroidUtilities.dp(16.0f);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
                this.lastUpdateTime = System.currentTimeMillis();
                if (this.cancelToProgress == 0.0f && this.slideProgress > 0.8f) {
                    if (this.moveForward) {
                        float fDp = this.xOffset + ((AndroidUtilities.dp(3.0f) / 250.0f) * jCurrentTimeMillis);
                        this.xOffset = fDp;
                        if (fDp > AndroidUtilities.dp(6.0f)) {
                            this.xOffset = AndroidUtilities.dp(6.0f);
                            this.moveForward = false;
                        }
                    } else {
                        float fDp2 = this.xOffset - ((AndroidUtilities.dp(3.0f) / 250.0f) * jCurrentTimeMillis);
                        this.xOffset = fDp2;
                        if (fDp2 < (-AndroidUtilities.dp(6.0f))) {
                            this.xOffset = -AndroidUtilities.dp(6.0f);
                            this.moveForward = true;
                        }
                    }
                }
            }
            boolean z = this.cancelCharOffset >= 0;
            int measuredWidth = ((int) ((getMeasuredWidth() - this.slideToCancelWidth) / 2.0f)) + AndroidUtilities.dp(5.0f);
            int measuredWidth2 = (int) ((getMeasuredWidth() - this.cancelWidth) / 2.0f);
            float primaryHorizontal = z ? this.slideToLayout.getPrimaryHorizontal(this.cancelCharOffset) : 0.0f;
            float f3 = z ? (measuredWidth + primaryHorizontal) - measuredWidth2 : 0.0f;
            float f4 = this.xOffset;
            float f5 = this.cancelToProgress;
            float fDp3 = ((measuredWidth + ((f4 * (1.0f - f5)) * this.slideProgress)) - (f3 * f5)) + AndroidUtilities.dp(16.0f);
            float fDp4 = z ? 0.0f : this.cancelToProgress * AndroidUtilities.dp(12.0f);
            if (this.cancelToProgress != 1.0f) {
                int translationX = (int) ((((-getMeasuredWidth()) / 4) * (1.0f - this.slideProgress)) + (ChatActivityEnterView.this.recordCircle.getTranslationX() * 0.3f));
                canvas.save();
                f2 = 16.0f;
                f = 1.0f;
                canvas.clipRect((ChatActivityEnterView.this.recordTimerView == null ? 0.0f : ChatActivityEnterView.this.recordTimerView.getLeftProperty()) + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i = (int) fDp3;
                canvas.translate((i - AndroidUtilities.dp(this.smallSize ? 7.0f : 10.0f)) + translationX, fDp4);
                canvas.drawPath(this.arrowPath, this.arrowPaint);
                canvas.restore();
                canvas.save();
                canvas.translate(i + translationX, ((getMeasuredHeight() - this.slideToLayout.getHeight()) / 2.0f) + fDp4);
                this.slideToLayout.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f = 1.0f;
                f2 = 16.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.cancelLayout.getHeight()) / 2.0f;
            if (!z) {
                measuredHeight -= AndroidUtilities.dp(12.0f) - fDp4;
            }
            float f6 = z ? fDp3 + primaryHorizontal : measuredWidth2;
            this.cancelRect.set((int) f6, (int) measuredHeight, (int) (this.cancelLayout.getWidth() + f6), (int) (this.cancelLayout.getHeight() + measuredHeight));
            this.cancelRect.inset(-AndroidUtilities.dp(f2), -AndroidUtilities.dp(f2));
            if (this.cancelToProgress > 0.0f) {
                this.selectableBackground.setBounds((getMeasuredWidth() / 2) - width, (getMeasuredHeight() / 2) - width, (getMeasuredWidth() / 2) + width, (getMeasuredHeight() / 2) + width);
                this.selectableBackground.draw(canvas);
                canvas.save();
                canvas.translate(f6, measuredHeight);
                this.cancelLayout.draw(canvas);
                canvas.restore();
            } else {
                setPressed(false);
            }
            if (this.cancelToProgress != f) {
                invalidate();
            }
        }

        public void setCancelToProgress(float f) {
            this.cancelToProgress = f;
        }

        public void setSlideX(float f) {
            this.slideProgress = f;
        }
    }

    public class TimerView extends View {
        StaticLayout inLayout;
        boolean isRunning;
        long lastSendTypingTime;
        float left;
        String oldString;
        StaticLayout outLayout;
        final float replaceDistance;
        SpannableStringBuilder replaceIn;
        SpannableStringBuilder replaceOut;
        SpannableStringBuilder replaceStable;
        float replaceTransition;
        long startTime;
        long stopTime;
        boolean stoppedInternal;
        TextPaint textPaint;

        public TimerView(Context context) {
            super(context);
            this.replaceIn = new SpannableStringBuilder();
            this.replaceOut = new SpannableStringBuilder();
            this.replaceStable = new SpannableStringBuilder();
            this.replaceDistance = AndroidUtilities.dp(15.0f);
        }

        public void start(long j) {
            this.isRunning = true;
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            this.startTime = jCurrentTimeMillis;
            this.lastSendTypingTime = jCurrentTimeMillis;
            invalidate();
        }

        public void stop() {
            if (this.isRunning) {
                this.isRunning = false;
                if (this.startTime > 0) {
                    this.stopTime = System.currentTimeMillis();
                }
                invalidate();
            }
            this.lastSendTypingTime = 0L;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            String str;
            if (this.textPaint == null) {
                TextPaint textPaint = new TextPaint(1);
                this.textPaint = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(15.0f));
                this.textPaint.setTypeface(AndroidUtilities.bold());
                this.textPaint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_recordTime));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.isRunning ? jCurrentTimeMillis - this.startTime : this.stopTime - this.startTime;
            long j2 = j / 1000;
            int i = ((int) (j % 1000)) / 10;
            if (ChatActivityEnterView.this.isInVideoMode() && j >= 59500 && !this.stoppedInternal) {
                ChatActivityEnterView.this.startedDraggingX = -1.0f;
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = ChatActivityEnterView.this.delegate;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterViewDelegate.needStartRecordVideo(3, true, 0, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L);
                ChatActivityEnterView.this.sendButton.setEffect(ChatActivityEnterView.this.effectId = 0L);
                this.stoppedInternal = true;
            }
            if (this.isRunning && jCurrentTimeMillis > this.lastSendTypingTime + 5000) {
                this.lastSendTypingTime = jCurrentTimeMillis;
                MessagesController.getInstance(ChatActivityEnterView.this.currentAccount).sendTyping(ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.getThreadMessageId(), ChatActivityEnterView.this.isInVideoMode() ? 7 : 1, 0);
            }
            String timerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j2, i);
            if (timerDurationFast.length() >= 3 && (str = this.oldString) != null && str.length() >= 3 && timerDurationFast.length() == this.oldString.length() && timerDurationFast.charAt(timerDurationFast.length() - 3) != this.oldString.charAt(timerDurationFast.length() - 3)) {
                int length = timerDurationFast.length();
                this.replaceIn.clear();
                this.replaceOut.clear();
                this.replaceStable.clear();
                this.replaceIn.append((CharSequence) timerDurationFast);
                this.replaceOut.append((CharSequence) this.oldString);
                this.replaceStable.append((CharSequence) timerDurationFast);
                int i2 = -1;
                int i3 = -1;
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < length - 1; i6++) {
                    if (this.oldString.charAt(i6) != timerDurationFast.charAt(i6)) {
                        if (i5 == 0) {
                            i3 = i6;
                        }
                        i5++;
                        if (i4 != 0) {
                            EmptyStubSpan emptyStubSpan = new EmptyStubSpan();
                            if (i6 == length - 2) {
                                i4++;
                            }
                            int i7 = i4 + i2;
                            this.replaceIn.setSpan(emptyStubSpan, i2, i7, 33);
                            this.replaceOut.setSpan(emptyStubSpan, i2, i7, 33);
                            i4 = 0;
                        }
                    } else {
                        if (i4 == 0) {
                            i2 = i6;
                        }
                        i4++;
                        if (i5 != 0) {
                            this.replaceStable.setSpan(new EmptyStubSpan(), i3, i5 + i3, 33);
                            i5 = 0;
                        }
                    }
                }
                if (i4 != 0) {
                    EmptyStubSpan emptyStubSpan2 = new EmptyStubSpan();
                    int i8 = i4 + i2 + 1;
                    this.replaceIn.setSpan(emptyStubSpan2, i2, i8, 33);
                    this.replaceOut.setSpan(emptyStubSpan2, i2, i8, 33);
                }
                if (i5 != 0) {
                    this.replaceStable.setSpan(new EmptyStubSpan(), i3, i5 + i3, 33);
                }
                SpannableStringBuilder spannableStringBuilder = this.replaceIn;
                TextPaint textPaint2 = this.textPaint;
                int measuredWidth = getMeasuredWidth();
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.inLayout = new StaticLayout(spannableStringBuilder, textPaint2, measuredWidth, alignment, 1.0f, 0.0f, false);
                this.outLayout = new StaticLayout(this.replaceOut, this.textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
                this.replaceTransition = 1.0f;
            } else {
                if (this.replaceStable == null) {
                    this.replaceStable = new SpannableStringBuilder(timerDurationFast);
                }
                if (this.replaceStable.length() == 0 || this.replaceStable.length() != timerDurationFast.length()) {
                    this.replaceStable.clear();
                    this.replaceStable.append((CharSequence) timerDurationFast);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = this.replaceStable;
                    spannableStringBuilder2.replace(spannableStringBuilder2.length() - 1, this.replaceStable.length(), (CharSequence) timerDurationFast, (timerDurationFast.length() - 1) - (timerDurationFast.length() - this.replaceStable.length()), timerDurationFast.length());
                }
            }
            float f = this.replaceTransition;
            if (f != 0.0f) {
                float f2 = f - 0.15f;
                this.replaceTransition = f2;
                if (f2 < 0.0f) {
                    this.replaceTransition = 0.0f;
                }
            }
            float measuredHeight = getMeasuredHeight() / 2;
            if (this.replaceTransition == 0.0f) {
                this.replaceStable.clearSpans();
                StaticLayout staticLayout = new StaticLayout(this.replaceStable, this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                canvas.save();
                canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
                staticLayout.draw(canvas);
                canvas.restore();
                this.left = staticLayout.getLineWidth(0) + 0.0f;
            } else {
                if (this.inLayout != null) {
                    canvas.save();
                    this.textPaint.setAlpha((int) ((1.0f - this.replaceTransition) * 255.0f));
                    canvas.translate(0.0f, (measuredHeight - (this.inLayout.getHeight() / 2.0f)) - (this.replaceDistance * this.replaceTransition));
                    this.inLayout.draw(canvas);
                    canvas.restore();
                }
                if (this.outLayout != null) {
                    canvas.save();
                    this.textPaint.setAlpha((int) (this.replaceTransition * 255.0f));
                    canvas.translate(0.0f, (measuredHeight - (this.outLayout.getHeight() / 2.0f)) + (this.replaceDistance * (1.0f - this.replaceTransition)));
                    this.outLayout.draw(canvas);
                    canvas.restore();
                }
                canvas.save();
                this.textPaint.setAlpha(255);
                StaticLayout staticLayout2 = new StaticLayout(this.replaceStable, this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                canvas.translate(0.0f, measuredHeight - (staticLayout2.getHeight() / 2.0f));
                staticLayout2.draw(canvas);
                canvas.restore();
                this.left = staticLayout2.getLineWidth(0) + 0.0f;
            }
            this.oldString = timerDurationFast;
            if (this.isRunning || this.replaceTransition != 0.0f) {
                invalidate();
            }
        }

        public void updateColors() {
            TextPaint textPaint = this.textPaint;
            if (textPaint != null) {
                textPaint.setColor(ChatActivityEnterView.this.getThemedColor(Theme.key_chat_recordTime));
            }
        }

        public float getLeftProperty() {
            return this.left;
        }

        public void reset() {
            this.isRunning = false;
            this.startTime = 0L;
            this.stopTime = 0L;
            this.stoppedInternal = false;
        }
    }

    public RecordCircle getRecordCircle() {
        return this.recordCircle;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int measuredHeight = this.textFieldContainer.getMeasuredHeight();
        BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
        int i3 = 0;
        if (botCommandsMenuView != null && botCommandsMenuView.getTag() != null) {
            this.botCommandsMenuButton.measure(i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.emojiButton.getLayoutParams();
            int iDp = AndroidUtilities.dp(10.0f);
            BotCommandsMenuView botCommandsMenuView2 = this.botCommandsMenuButton;
            marginLayoutParams.leftMargin = iDp + (botCommandsMenuView2 == null ? 0 : botCommandsMenuView2.getMeasuredWidth());
            ImageView imageView = this.deleteRichDraftButton;
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iDp2 = AndroidUtilities.dp(10.0f);
                BotCommandsMenuView botCommandsMenuView3 = this.botCommandsMenuButton;
                marginLayoutParams2.leftMargin = iDp2 + (botCommandsMenuView3 == null ? 0 : botCommandsMenuView3.getMeasuredWidth());
            }
            EditTextCaption editTextCaption = this.messageEditText;
            if (editTextCaption != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) editTextCaption.getLayoutParams();
                int iDp3 = AndroidUtilities.dp(57.0f);
                BotCommandsMenuView botCommandsMenuView4 = this.botCommandsMenuButton;
                marginLayoutParams3.leftMargin = iDp3 + (botCommandsMenuView4 == null ? 0 : botCommandsMenuView4.getMeasuredWidth());
            }
            RichMessageLayout.PreviewView previewView = this.richDraftPreview;
            if (previewView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView.getLayoutParams();
                int iDp4 = AndroidUtilities.dp(57.0f);
                BotCommandsMenuView botCommandsMenuView5 = this.botCommandsMenuButton;
                marginLayoutParams4.leftMargin = iDp4 + (botCommandsMenuView5 == null ? 0 : botCommandsMenuView5.getMeasuredWidth());
            }
        } else {
            SenderSelectView senderSelectView = this.senderSelectView;
            if (senderSelectView != null && senderSelectView.getVisibility() == 0) {
                int i4 = this.senderSelectView.getLayoutParams().width;
                this.senderSelectView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(this.senderSelectView.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) this.emojiButton.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i4;
                ImageView imageView2 = this.deleteRichDraftButton;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i4;
                }
                EditTextCaption editTextCaption2 = this.messageEditText;
                if (editTextCaption2 != null) {
                    ((ViewGroup.MarginLayoutParams) editTextCaption2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i4;
                }
                RichMessageLayout.PreviewView previewView2 = this.richDraftPreview;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i4;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) this.emojiButton.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                ImageView imageView3 = this.deleteRichDraftButton;
                if (imageView3 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                EditTextCaption editTextCaption3 = this.messageEditText;
                if (editTextCaption3 != null) {
                    ((ViewGroup.MarginLayoutParams) editTextCaption3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView3 = this.richDraftPreview;
                if (previewView3 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            }
        }
        updateBotCommandsMenuContainerTopPadding();
        super.onMeasure(i, i2);
        ChatActivityBotWebViewButton chatActivityBotWebViewButton = this.botWebViewButton;
        if (chatActivityBotWebViewButton != null) {
            BotCommandsMenuView botCommandsMenuView6 = this.botCommandsMenuButton;
            if (botCommandsMenuView6 != null) {
                chatActivityBotWebViewButton.setMeasuredButtonWidth(botCommandsMenuView6.getMeasuredWidth());
            }
            this.botWebViewButton.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.botWebViewButton, i, i2);
        }
        checkUi_IslandTotalHeight();
        checkUi_TopViewVisibility();
        if (measuredHeight <= 0 || this.textFieldContainer.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i3 < 2) {
            ImageView imageView4 = i3 == 0 ? this.aiButton : this.richButton;
            imageView4.setTranslationY((imageView4.getTranslationY() + this.textFieldContainer.getMeasuredHeight()) - measuredHeight);
            imageView4.animate().translationY(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
            i3++;
        }
        HintView2 hintView2 = this.aiHint;
        if (hintView2 != null) {
            hintView2.setTranslationY((hintView2.getTranslationY() + this.textFieldContainer.getMeasuredHeight()) - measuredHeight);
            this.aiHint.animate().translationY(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        BotCommandsMenuContainer botCommandsMenuContainer;
        super.onLayout(z, i, i2, i3, i4);
        if (this.botCommandLastPosition == -1 || (botCommandsMenuContainer = this.botCommandsMenuContainer) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) botCommandsMenuContainer.listView.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(this.botCommandLastPosition, this.botCommandLastTop);
        }
        this.botCommandLastPosition = -1;
    }

    private void beginDelayedTransition() {
        HashMap map = this.animationParamsX;
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.emojiButton;
        map.put(chatActivityEnterViewAnimatedIconView, Float.valueOf(chatActivityEnterViewAnimatedIconView.getX()));
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption != null) {
            this.animationParamsX.put(editTextCaption, Float.valueOf(editTextCaption.getX()));
        }
    }

    public void setBotInfo(LongSparseArray longSparseArray) {
        setBotInfo(longSparseArray, true);
    }

    public void setBotInfo(LongSparseArray longSparseArray, boolean z) {
        this.lastBotInfo = longSparseArray;
        if (longSparseArray.size() == 1 && ((TL_bots.BotInfo) longSparseArray.valueAt(0)).user_id == this.dialog_id) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) longSparseArray.valueAt(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.botMenuWebViewTitle = tL_botMenuButton.text;
                this.botMenuWebViewUrl = tL_botMenuButton.url;
                this.botMenuButtonType = BotMenuButtonType.WEB_VIEW;
            } else if (!botInfo.commands.isEmpty()) {
                this.botMenuButtonType = BotMenuButtonType.COMMANDS;
            } else {
                this.botMenuButtonType = BotMenuButtonType.NO_BUTTON;
            }
        } else {
            this.botMenuButtonType = BotMenuButtonType.NO_BUTTON;
        }
        BotCommandsMenuView.BotCommandsAdapter botCommandsAdapter = this.botCommandsAdapter;
        if (botCommandsAdapter != null) {
            botCommandsAdapter.setBotInfo(longSparseArray);
        }
        updateBotButton(z);
        checkIsEphemeralMessage(z);
    }

    public boolean botCommandsMenuIsShowing() {
        BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
        return botCommandsMenuView != null && botCommandsMenuView.isOpened();
    }

    public void hideBotCommands() {
        BotCommandsMenuContainer botCommandsMenuContainer;
        BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
        if (botCommandsMenuView != null) {
            botCommandsMenuView.setOpened(false);
        }
        if (hasBotWebView() || (botCommandsMenuContainer = this.botCommandsMenuContainer) == null) {
            return;
        }
        botCommandsMenuContainer.dismiss();
    }

    public void setTextTransitionIsRunning(boolean z) {
        this.textTransitionIsRunning = z;
        this.sendButtonContainer.invalidate();
    }

    public float getTopViewHeight() {
        View view = this.topView;
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return this.topView.getLayoutParams().height;
    }

    public void runEmojiPanelAnimation() {
        AndroidUtilities.cancelRunOnUIThread(this.runEmojiPanelAnimation);
        this.runEmojiPanelAnimation.run();
    }

    public Drawable getStickersArrowDrawable() {
        return this.stickersArrow;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        EmojiView emojiView = this.emojiView;
        if (emojiView == null || emojiView.getVisibility() != 0 || this.emojiView.getStickersExpandOffset() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
        canvas.translate(0.0f, -this.emojiView.getStickersExpandOffset());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public int getThemedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    private Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public void setHorizontalPadding(float f, float f2, float f3, boolean z) {
        int iDp;
        float f4 = 1.0f - f3;
        float f5 = f * f4;
        float f6 = f2 * f4;
        this.emojiButtonPaddingScale = (f3 * 0.5f) + 0.5f;
        this.emojiButtonPaddingAlpha = f3;
        updateEmojiButtonParams();
        float f7 = -f5;
        this.emojiButton.setTranslationX(f7);
        if (this.messageEditText == null) {
            iDp = 0;
        } else {
            int iDp2 = AndroidUtilities.dp(40.0f);
            SenderSelectView senderSelectView = this.senderSelectView;
            iDp = iDp2 + ((senderSelectView == null || senderSelectView.getVisibility() != 0) ? 0 : AndroidUtilities.dp(18.0f));
        }
        this.messageTextPaddingTranslationX = f7 - (iDp * f4);
        RLottieImageView rLottieImageView = this.recordDeleteImageView;
        if (rLottieImageView != null) {
            rLottieImageView.setTranslationX(f7);
        }
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f6);
        }
        ControlsView controlsView = this.controlsView;
        if (controlsView != null) {
            controlsView.setTranslationX(f6);
        }
        LinearLayout linearLayout = this.recordTimeContainer;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f7);
        }
        this.sendButtonContainer.setTranslationX(f6);
        this.sendButtonContainer.setAlpha(f3);
        ImageView imageView = this.suggestButton;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f3 : 0.0f);
        }
        this.sendButtonEnabled = !z || f3 == 1.0f;
        this.attachLayoutPaddingTranslationX = f6;
        this.attachLayoutPaddingAlpha = f3;
        updateAttachLayoutParams();
        updateMessageTextParams();
        float f8 = f5 * f4;
        if (this.horizontalPadding != f8) {
            this.horizontalPadding = f8;
            RecordedAudioPlayerView recordedAudioPlayerView = this.audioTimelineView;
            if (recordedAudioPlayerView != null) {
                recordedAudioPlayerView.setTranslationX(f8);
                this.audioTimelineView.invalidate();
            }
        }
        if (this.messageEditText != null) {
            float fLerp = AndroidUtilities.lerp(0.88f, 1.0f, f3);
            this.messageEditText.setPivotX(0.0f);
            EditTextCaption editTextCaption = this.messageEditText;
            editTextCaption.setPivotY(editTextCaption.getMeasuredHeight() / 2.0f);
            this.messageEditText.setScaleX(fLerp);
            this.messageEditText.setScaleY(fLerp);
            this.messageEditText.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f3));
        }
    }

    public void updateMessageTextParams() {
        EditTextCaption editTextCaption = this.messageEditText;
        if (editTextCaption != null) {
            editTextCaption.setTranslationX(this.messageTextPaddingTranslationX + this.messageTextTranslationX);
        }
    }

    public void updateAttachLayoutParams() {
        updateAttachButtonTranslationX();
        LinearLayout linearLayout = this.attachLayout;
        if (linearLayout != null) {
            linearLayout.setTranslationX(this.attachLayoutPaddingTranslationX + this.attachLayoutTranslationX);
            this.attachLayout.setAlpha(this.attachLayoutAlpha * this.attachLayoutPaddingAlpha);
            LinearLayout linearLayout2 = this.attachLayout;
            linearLayout2.setVisibility(linearLayout2.getAlpha() > 0.0f ? 0 : 8);
            ImageView imageView = this.attachButton;
            if (imageView != null && this.isStories) {
                imageView.setAlpha(this.attachButtonAlpha * this.attachLayoutPaddingAlpha);
            }
        }
        ImageView imageView2 = this.scheduledButton;
        if (imageView2 != null) {
            imageView2.setTranslationX(imageView2.getTranslationX());
        }
    }

    public boolean isSendButtonEnabled() {
        return this.sendButtonEnabled && this.streamingState != BotForumHelper.SteamingSendButtonState.BLOCKING;
    }

    public void updateAttachButtonTranslationX() {
        ImageView imageView = this.attachButton;
        if (imageView == null) {
            return;
        }
        float f = this.attachLayoutPaddingTranslationX + this.attachLayoutTranslationX;
        SendButton sendButton = this.sendButton;
        imageView.setTranslationX(f + (sendButton != null ? (-Math.max(0, sendButton.width() - AndroidUtilities.dp(56.0f))) * this.sendButton.getAlpha() : 0.0f));
    }

    public void updateEmojiButtonParams() {
        this.emojiButton.setScaleX(this.emojiButtonPaddingScale * this.emojiButtonScale);
        this.emojiButton.setScaleY(this.emojiButtonPaddingScale * this.emojiButtonScale);
        this.emojiButton.setAlpha(this.emojiButtonPaddingAlpha * this.emojiButtonAlpha);
    }

    public void setOverrideHint(CharSequence charSequence) {
        setOverrideHint(charSequence, false);
    }

    public void setOverrideHint(CharSequence charSequence, boolean z) {
        this.overrideHint = charSequence;
        this.overrideHint2 = null;
        updateFieldHint(z);
    }

    public void setOverrideHint(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.overrideHint = charSequence;
        this.overrideHint2 = charSequence2;
        updateFieldHint(z);
    }

    public void setOverrideKeyboardAnimation(boolean z) {
        this.overrideKeyboardAnimation = z;
    }

    public void onOverrideAnimationEnd() {
        Runnable runnable = this.animationEndRunnable;
        if (runnable != null) {
            runnable.run();
            this.animationEndRunnable = null;
        }
    }

    public int getStickersExpandedHeight() {
        return this.stickersExpandedHeight;
    }

    public void reset() {
        setStickersExpanded(false, true, false);
        showPopup(0, 0, false);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.recordingAudioVideo = false;
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.audioVideoSendButton;
        if (chatActivityEnterViewAnimatedIconView != null) {
            chatActivityEnterViewAnimatedIconView.setVisibility(0);
        }
        this.recordIsCanceled = true;
        isRecordingStateChanged();
        cancelRecordInterfaceInternal();
        hideRecordedAudioPanelInternal();
        ControlsView controlsView = this.controlsView;
        if (controlsView != null) {
            controlsView.setVisibility(8);
        }
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.setSendButtonInvisible();
        }
    }

    public void freezeEmojiView(boolean z) {
        this.emojiViewFrozen = z;
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.freeze(z);
        }
    }

    public static class SendButton extends View implements ItemOptions.ScrimView {
        private final AnimatedFloat animatedPriceVisible;
        private final AnimatedFloat appear;
        private final Paint backgroundPaint;
        private final RectF backgroundRect;
        private BlurredBackgroundDrawable blurredBackgroundDrawable;
        public final ButtonBounce bounce;
        private ValueAnimator bounceCountAnimator;
        public boolean center;
        private int circleHeight;
        private float circlePadX;
        private float circlePadY;
        private int circleWidth;
        private final AnimatedTextView.AnimatedTextDrawable count;
        private float countBounceScale;
        private Drawable drawable;
        private int drawableColor;
        private Drawable drawableInverse;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiDrawable;
        private float ephemeralFactor;
        private Drawable ephemeralOutlineDrawable;
        private boolean hidePrice;
        private Drawable inactiveDrawable;
        private boolean infiniteLoading;
        private boolean isNewDesignSendButton;
        private final AnimatedFloat loadingAnimatedProgress;
        private final AnimatedFloat loadingAnimatedShown;
        private final FastOutSlowInInterpolator loadingInterpolator;
        private final Paint loadingPaint;
        private float loadingProgress;
        private boolean loadingShown;
        private Drawable lockIcon;
        private int lockIconColor;
        private boolean locked;
        private int messagesCount;
        public boolean newCounterPos;
        public final AnimatedFloat open;
        private final Path path;
        private final AnimatedTextView.AnimatedTextDrawable priceText;
        public int resId;
        public final Theme.ResourcesProvider resourcesProvider;
        private float sameWidthFactor;
        private int scrimViewBackgroundColor;
        private final Paint scrimViewBackgroundPaint;
        private final ColoredImageSpan[] spans;
        private long starsPrice;

        public boolean isInScheduleMode() {
            return false;
        }

        public boolean isInactive() {
            return false;
        }

        public boolean shouldDrawBackground() {
            return false;
        }

        public SendButton(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            this(context, i, resourcesProvider, false);
        }

        public void setEphemeralFactor(float f) {
            if (this.ephemeralFactor != f) {
                this.ephemeralFactor = f;
                invalidate();
            }
        }

        public void setSameWidthFactor(float f) {
            if (this.sameWidthFactor != f) {
                this.sameWidthFactor = f;
                invalidate();
            }
        }

        public SendButton(Context context, int i, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedPriceVisible = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            this.backgroundPaint = new Paint(1);
            this.circleWidth = -1;
            this.circleHeight = -1;
            this.scrimViewBackgroundPaint = new Paint(1);
            this.spans = new ColoredImageSpan[1];
            this.open = new AnimatedFloat(this, 0L, 420L, cubicBezierInterpolator);
            this.bounce = new ButtonBounce(this);
            this.loadingInterpolator = new FastOutSlowInInterpolator();
            this.loadingAnimatedShown = new AnimatedFloat(this, 0L, 420L, cubicBezierInterpolator);
            this.loadingAnimatedProgress = new AnimatedFloat(this, 0L, 500L, cubicBezierInterpolator);
            this.path = new Path();
            Paint paint = new Paint(1);
            this.loadingPaint = paint;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.count = animatedTextDrawable;
            this.countBounceScale = 1.0f;
            this.appear = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            this.backgroundRect = new RectF();
            this.resId = i;
            this.resourcesProvider = resourcesProvider;
            this.isNewDesignSendButton = z;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable();
            this.priceText = animatedTextDrawable2;
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextDrawable2.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable2.setTextColor(-1);
            animatedTextDrawable2.setGravity(3);
            animatedTextDrawable2.setCallback(this);
            animatedTextDrawable2.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            this.drawable = context.getResources().getDrawable(i).mutate();
            this.inactiveDrawable = context.getResources().getDrawable(i).mutate();
            this.drawableInverse = context.getResources().getDrawable(i).mutate();
            this.emojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(14.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.setTextColor(-1);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            animatedTextDrawable.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setGravity(17);
        }

        public void setLocked(boolean z) {
            if (this.locked == z) {
                return;
            }
            this.locked = z;
            invalidate();
        }

        public void setResourceId(int i) {
            if (this.resId != i) {
                this.resId = i;
                this.drawable = getContext().getResources().getDrawable(i).mutate();
                this.inactiveDrawable = getContext().getResources().getDrawable(i).mutate();
                this.drawableInverse = getContext().getResources().getDrawable(i).mutate();
                invalidate();
            }
        }

        public void setCircleSize(int i) {
            this.circleWidth = i;
            this.circleHeight = i;
        }

        public void setCircleSize(int i, int i2) {
            this.circleWidth = i;
            this.circleHeight = i2;
        }

        public int getCircleWidth() {
            int i = this.circleWidth;
            return i >= 0 ? i : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        }

        public int getCircleHeight() {
            int i = this.circleHeight;
            return i >= 0 ? i : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        }

        @Override
        public void getBounds(RectF rectF) {
            float circleWidth = getCircleWidth();
            float circleHeight = getCircleHeight();
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.circlePadX;
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.circlePadY;
            rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
        }

        public void setScrimViewBackgroundColor(int i) {
            this.scrimViewBackgroundColor = i;
            this.scrimViewBackgroundPaint.setColor(i);
        }

        @Override
        public void drawScrim(Canvas canvas, float f) {
            float fLerp;
            float fLerp2;
            float fLerp3;
            float measuredWidth;
            float measuredHeight;
            int i = this.scrimViewBackgroundColor;
            if (i != 0) {
                this.scrimViewBackgroundPaint.setColor(i);
                this.scrimViewBackgroundPaint.setAlpha((int) (Color.alpha(this.scrimViewBackgroundColor) * f));
                float f2 = this.open.get();
                float f3 = this.animatedPriceVisible.get();
                if (this.newCounterPos) {
                    fLerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f2) - this.circlePadX;
                    fLerp3 = getCircleHeight() * f2;
                    fLerp2 = ((getMeasuredHeight() - this.circlePadY) - AndroidUtilities.dp(4.0f)) - (fLerp3 / 2.0f);
                } else {
                    fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f2) - this.circlePadX, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f3);
                    fLerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.circlePadY) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f3);
                    fLerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f3) * f2;
                }
                float fLerp4 = AndroidUtilities.lerp(getCircleWidth(), AndroidUtilities.dp(this.isNewDesignSendButton ? 20.0f : 22.0f) + this.priceText.getCurrentWidth(), f3) * f2;
                if (f2 > 0.0f && fLerp4 > 0.0f && fLerp3 > 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f4 = fLerp3 / 2.0f;
                    rectF.set(fLerp - fLerp4, fLerp2 - f4, fLerp, f4 + fLerp2);
                    rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                    float fMin = (Math.min(fLerp4, fLerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                    canvas.drawRoundRect(rectF, fMin, fMin, this.scrimViewBackgroundPaint);
                }
                float fIsNotEmpty = this.count.isNotEmpty() * (1.0f - f3);
                if (fIsNotEmpty > 0.0f) {
                    float fMax = Math.max(AndroidUtilities.dp(9.0f) + this.count.getCurrentWidth(), AndroidUtilities.dp(18.0f));
                    if (this.newCounterPos) {
                        measuredWidth = fLerp - AndroidUtilities.dp(50.0f);
                        measuredHeight = (fLerp2 - (getCircleHeight() / 2.0f)) + (fMax / 2.0f);
                    } else {
                        float f5 = fMax / 2.0f;
                        measuredWidth = (getMeasuredWidth() - this.circlePadX) - f5;
                        measuredHeight = (getMeasuredHeight() - this.circlePadY) - f5;
                    }
                    canvas.drawCircle(measuredWidth, measuredHeight, ((fMax / 2.0f) + AndroidUtilities.dp(2.0f)) * fIsNotEmpty * this.countBounceScale, this.scrimViewBackgroundPaint);
                }
            }
            draw(canvas);
        }

        public void setCirclePadding(float f, float f2) {
            this.circlePadX = f;
            this.circlePadY = f2;
        }

        public void setStarsPrice(long j, int i) {
            setStarsPrice(j, i, true);
        }

        public void setStarsPrice(long j, int i, boolean z) {
            if (this.starsPrice == j && this.messagesCount == i) {
                return;
            }
            this.starsPrice = j;
            this.messagesCount = i;
            if (j > 0) {
                this.priceText.setText(StarsIntroActivity.replaceStars("⭐️" + LocaleController.formatNumber(j * ((long) Math.max(1, this.messagesCount)), ','), this.spans), z);
            } else {
                this.priceText.setText("", z);
            }
            if (!z) {
                this.animatedPriceVisible.force(this.starsPrice > 0);
            } else {
                invalidate();
            }
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.count || drawable == this.emojiDrawable || drawable == this.priceText || super.verifyDrawable(drawable);
        }

        public void setEffect(long j) {
            TLRPC.TL_availableEffect effect = MessagesController.getInstance(UserConfig.selectedAccount).getEffect(j);
            setEmoji(effect != null ? Emoji.getEmojiDrawable(effect.emoticon) : null);
        }

        public void setEmoji(Drawable drawable) {
            this.emojiDrawable.set(drawable, true);
        }

        public boolean isOpen() {
            return this.starsPrice > 0;
        }

        public int getFillColor() {
            return Theme.getColor(Theme.key_chat_messagePanelSend, this.resourcesProvider);
        }

        public void appear() {
            this.appear.force(0.0f);
            invalidate();
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z);
            this.bounce.setPressed(z);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Canvas canvas2;
            int measuredWidth;
            int measuredHeight;
            float f;
            float f2;
            float fLerp;
            float fLerp2;
            float fLerp3;
            float f3;
            float f4;
            float measuredWidth2;
            float measuredHeight2;
            float fDp;
            float f5;
            int iSave = canvas.save();
            if (this.isNewDesignSendButton) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            updateColors();
            checkBackgroundRect();
            if (this.isNewDesignSendButton) {
                canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), this.backgroundPaint);
            }
            Drawable drawable = isInactive() ? this.inactiveDrawable : this.drawable;
            if (this.isNewDesignSendButton) {
                RectF rectF = this.backgroundRect;
                measuredWidth = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
                RectF rectF2 = this.backgroundRect;
                measuredHeight = Math.round((rectF2.top + (rectF2.height() / 2.0f)) - (drawable.getIntrinsicHeight() / 2.0f));
            } else {
                measuredWidth = (getMeasuredWidth() - (getMeasuredHeight() / 2)) - (drawable.getIntrinsicWidth() / 2);
                measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
                if (!this.center) {
                    if (isInScheduleMode()) {
                        measuredHeight -= AndroidUtilities.dp(1.0f);
                    } else {
                        measuredWidth += AndroidUtilities.dp(2.0f);
                    }
                }
            }
            int i = measuredWidth;
            int i2 = measuredHeight;
            float f6 = this.loadingAnimatedShown.set(this.loadingShown);
            float f7 = this.open.set(isOpen());
            float f8 = this.animatedPriceVisible.set(this.starsPrice > 0 && !this.hidePrice) * (1.0f - this.ephemeralFactor);
            float f9 = this.appear.set(1.0f);
            if (f7 < 1.0f) {
                canvas2.save();
                float f10 = 1.0f - f9;
                f = 24.0f;
                canvas2.translate((-AndroidUtilities.dp(24.0f)) * f10, AndroidUtilities.dp(24.0f) * f10);
                float fLerp4 = AndroidUtilities.lerp(0.35f, 1.0f, f9);
                float f11 = i;
                float f12 = i2;
                f2 = 2.0f;
                canvas2.scale(fLerp4, fLerp4, (drawable.getIntrinsicWidth() / 2.0f) + f11, (drawable.getIntrinsicHeight() / 2.0f) + f12);
                canvas2.rotate(60.0f * f10, f11 + (drawable.getIntrinsicWidth() / 2.0f), f12 + (drawable.getIntrinsicHeight() / 2.0f));
                drawable.setBounds(i, i2, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + i2);
                drawable.setAlpha((int) ((1.0f - f8) * 255.0f));
                drawable.draw(canvas2);
                canvas2.restore();
            } else {
                f = 24.0f;
                f2 = 2.0f;
            }
            if (this.newCounterPos) {
                fLerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f2), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f7) - this.circlePadX;
                fLerp3 = getCircleHeight() * f7;
                fLerp2 = ((getMeasuredHeight() - this.circlePadY) - AndroidUtilities.dp(4.0f)) - (fLerp3 / f2);
            } else {
                fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f2), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f7) - this.circlePadX, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f8);
                fLerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.circlePadY) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f2), getMeasuredHeight() - AndroidUtilities.dp(f), f8);
                fLerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f8) * f7;
            }
            float f13 = fLerp2;
            float fLerp5 = AndroidUtilities.lerp(getCircleWidth(), AndroidUtilities.dp(this.isNewDesignSendButton ? 20.0f : 22.0f) + this.priceText.getCurrentWidth(), f8);
            float fLerp6 = AndroidUtilities.lerp(fLerp5, fLerp3, this.sameWidthFactor) * f7;
            float f14 = fLerp5 - fLerp6;
            float f15 = fLerp - (fLerp6 / f2);
            setPivotX(f15);
            setPivotY(f13);
            float f16 = f13;
            float fLerp7 = AndroidUtilities.lerp(1.0f, 0.79f, this.ephemeralFactor);
            if (f7 > 0.0f) {
                canvas2.save();
                this.path.rewind();
                float fMin = Math.min(fLerp6, fLerp3) / f2;
                f4 = 0.0f;
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f17 = fLerp3 / f2;
                float f18 = f16 - f17;
                float f19 = f16 + f17;
                rectF3.set(fLerp - fLerp6, f18, fLerp, f19);
                f3 = fLerp;
                this.path.addRoundRect(rectF3, fMin, fMin, Path.Direction.CW);
                float fCenterX = rectF3.centerX();
                float fCenterY = rectF3.centerY();
                if (this.ephemeralFactor > 0.0f) {
                    if (this.ephemeralOutlineDrawable == null) {
                        this.ephemeralOutlineDrawable = getContext().getResources().getDrawable(R.drawable.send_outline);
                    }
                    this.ephemeralOutlineDrawable.setColorFilter(this.backgroundPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                    DrawableUtils.setBounds(this.ephemeralOutlineDrawable, fCenterX, fCenterY, 17);
                    DrawableUtils.drawWithScale(canvas2, this.ephemeralOutlineDrawable, this.ephemeralFactor);
                } else {
                    f18 = f18;
                }
                canvas2.scale(fLerp7, fLerp7, fCenterX, fCenterY);
                if (this.blurredBackgroundDrawable != null) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    rectF3.round(rect);
                    rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                    this.blurredBackgroundDrawable.setBounds(rect);
                    this.blurredBackgroundDrawable.draw(canvas2);
                }
                if (!this.isNewDesignSendButton) {
                    canvas2.drawPath(this.path, this.backgroundPaint);
                }
                canvas2.clipPath(this.path);
                int i3 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                if (i3 > 0) {
                    this.loadingPaint.setColor(-1);
                    this.loadingPaint.setAlpha((int) (f6 * 255.0f));
                    float fDp2 = AndroidUtilities.dp(8.66f);
                    rectF3.set(f15 - fDp2, f16 - fDp2, f15 + fDp2, f16 + fDp2);
                    if (this.infiniteLoading) {
                        long jCurrentTimeMillis = System.currentTimeMillis() % 5400;
                        float f20 = (1520 * jCurrentTimeMillis) / 5400.0f;
                        float fMax = Math.max(0.0f, f20 - 20.0f);
                        int i4 = 0;
                        while (i4 < 4) {
                            int i5 = i4 * 1350;
                            long j = jCurrentTimeMillis;
                            float interpolation = f20 + (this.loadingInterpolator.getInterpolation((j - ((long) i5)) / 667.0f) * 250.0f);
                            fMax += this.loadingInterpolator.getInterpolation((j - ((long) (i5 + 667))) / 667.0f) * 250.0f;
                            i4++;
                            jCurrentTimeMillis = j;
                            f20 = interpolation;
                        }
                        canvas2 = canvas;
                        f4 = 0.0f;
                        canvas2.drawArc(AndroidUtilities.rectTmp, fMax, f20 - fMax, false, this.loadingPaint);
                    } else {
                        canvas2 = canvas;
                        canvas2.drawArc(rectF3, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.loadingAnimatedProgress.set(this.loadingProgress) * 360.0f, false, this.loadingPaint);
                    }
                    canvas2.save();
                    float fLerp8 = AndroidUtilities.lerp(1.0f, 0.6f, f6);
                    canvas2.scale(fLerp8, fLerp8, f15, f16);
                    invalidate();
                } else {
                    i3 = i3;
                    f16 = f16;
                    f15 = f15;
                    f14 = f14;
                    f18 = f18;
                }
                if (f8 > f4) {
                    if (this.newCounterPos) {
                        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.priceText;
                        animatedTextDrawable.setBounds((f3 - animatedTextDrawable.getAnimateToWidth()) - AndroidUtilities.dp(11.0f), f18, f3 - AndroidUtilities.dp(11.0f), f19);
                    } else if (this.isNewDesignSendButton) {
                        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.priceText;
                        float fDp3 = this.backgroundRect.left + AndroidUtilities.dp(10.0f);
                        RectF rectF4 = this.backgroundRect;
                        animatedTextDrawable2.setBounds(fDp3, rectF4.top, rectF4.right, rectF4.bottom);
                    } else {
                        this.priceText.setBounds((getMeasuredWidth() - this.priceText.getAnimateToWidth()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                    }
                    f5 = 1.0f;
                    this.priceText.setAlpha((int) (f8 * 255.0f * (1.0f - f6)));
                    this.priceText.draw(canvas2);
                } else {
                    f5 = 1.0f;
                }
                this.drawableInverse.setAlpha((int) ((f5 - f6) * 255.0f * (f5 - f8)));
                if (this.circleWidth > 0) {
                    Drawable drawable2 = this.drawableInverse;
                    drawable2.setBounds((int) (f15 - (drawable2.getIntrinsicWidth() / f2)), (int) (f16 - (this.drawableInverse.getIntrinsicHeight() / f2)), (int) (f15 + (this.drawableInverse.getIntrinsicWidth() / f2)), (int) ((this.drawableInverse.getIntrinsicHeight() / f2) + f16));
                } else {
                    this.drawableInverse.setBounds(i, i2, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + i2);
                }
                this.drawableInverse.draw(canvas2);
                if (i3 > 0) {
                    canvas2.restore();
                }
                canvas2.restore();
            } else {
                f3 = fLerp;
                f16 = f16;
                f4 = 0.0f;
                f14 = f14;
            }
            float fIsNotEmpty = this.count.isNotEmpty() * (1.0f - f8);
            if (!this.locked) {
                float fMax2 = Math.max(AndroidUtilities.dp(9.0f) + this.count.getCurrentWidth(), AndroidUtilities.dp(18.0f));
                if (this.newCounterPos) {
                    measuredWidth2 = (f3 - AndroidUtilities.dp(50.0f)) + f14;
                    measuredHeight2 = (f16 - (getCircleHeight() / f2)) + (fMax2 / f2);
                    fDp = AndroidUtilities.dp(0.66f);
                } else {
                    float f21 = fMax2 / f2;
                    measuredWidth2 = (getMeasuredWidth() - this.circlePadX) - f21;
                    measuredHeight2 = (getMeasuredHeight() - this.circlePadY) - f21;
                    fDp = 0.0f;
                }
                float f22 = fMax2 / f2;
                this.count.setBounds((int) (measuredWidth2 - f22), (int) ((measuredHeight2 - f22) - fDp), (int) (measuredWidth2 + f22), (int) ((measuredHeight2 + f22) - fDp));
                if (fIsNotEmpty > f4) {
                    float fLerp9 = AndroidUtilities.lerp(1.0f, 0.85f, this.ephemeralFactor);
                    canvas2.save();
                    canvas2.scale(fLerp9, fLerp9, measuredWidth2, measuredHeight2);
                    if (!this.isNewDesignSendButton) {
                        canvas2.drawCircle(measuredWidth2, measuredHeight2, (AndroidUtilities.dp(f2) + f22) * fIsNotEmpty * this.countBounceScale, Theme.PAINT_CLEAR);
                        canvas2.drawCircle(measuredWidth2, measuredHeight2, f22 * fIsNotEmpty * this.countBounceScale, this.backgroundPaint);
                    }
                    this.count.setAlpha((int) (fIsNotEmpty * 255.0f));
                    this.count.draw(canvas2);
                    canvas2.restore();
                }
            }
            if (fIsNotEmpty < 1.0f) {
                int iDp = AndroidUtilities.dp(8.0f);
                int iLerp = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f2)) - this.circlePadX) + AndroidUtilities.dp(12.0f), f3 - AndroidUtilities.dp(f2), f8);
                int iLerp2 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f2)) - this.circlePadY) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), f8);
                this.emojiDrawable.setBounds(iLerp - iDp, iLerp2 - iDp, iLerp + iDp, iLerp2 + iDp);
                this.emojiDrawable.setAlpha((int) ((1.0f - fIsNotEmpty) * 255.0f));
                this.emojiDrawable.draw(canvas2);
            }
            if (!this.isNewDesignSendButton) {
                canvas2.restore();
            }
            canvas2.restoreToCount(iSave);
            super.onDraw(canvas);
        }

        @Override
        public void draw(Canvas canvas) {
            if (!this.locked) {
                super.draw(canvas);
                return;
            }
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), getWidth(), getHeight(), 255, 31);
            super.draw(canvas);
            float fDp = AndroidUtilities.dp(18.0f) / 2.0f;
            float fDp2 = (this.backgroundRect.left + fDp) - AndroidUtilities.dp(6.0f);
            float fDp3 = (this.backgroundRect.top + fDp) - AndroidUtilities.dp(6.0f);
            canvas.drawCircle(fDp2, fDp3, AndroidUtilities.dp(2.0f) + fDp, Theme.PAINT_CLEAR);
            canvas.drawCircle(fDp2, fDp3, fDp, this.backgroundPaint);
            if (this.lockIcon == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
                this.lockIcon = drawableMutate;
                int i = this.drawableColor;
                this.lockIconColor = i;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            if (this.lockIconColor != this.drawableColor) {
                Drawable drawable = this.lockIcon;
                int i2 = this.drawableColor;
                this.lockIconColor = i2;
                drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            this.lockIcon.setBounds((int) (fDp2 - AndroidUtilities.dp(8.0f)), (int) (fDp3 - AndroidUtilities.dp(8.0f)), (int) (fDp2 + AndroidUtilities.dp(8.0f)), (int) (fDp3 + AndroidUtilities.dp(8.0f)));
            this.lockIcon.draw(canvas);
            canvas.restore();
        }

        public void setBlurredBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
            this.blurredBackgroundDrawable = blurredBackgroundDrawable;
            blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(22.0f));
            this.blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(4.0f));
        }

        public int width() {
            return width(getMeasuredHeight());
        }

        public int width(int i) {
            return (int) AndroidUtilities.lerp(this.circlePadX + getCircleWidth() + this.circlePadX, AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(this.isNewDesignSendButton ? 20.0f : 22.0f) + this.priceText.getAnimateToWidth(), (this.starsPrice > 0 ? 1.0f : 0.0f) * (isOpen() ? 1.0f : 0.0f));
        }

        public int height() {
            return height(getMeasuredHeight());
        }

        public int height(int i) {
            return (int) AndroidUtilities.lerp(this.circlePadY + getCircleHeight() + this.circlePadY, AndroidUtilities.dp(32.0f), this.starsPrice > 0 ? 1.0f : 0.0f);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (getAlpha() <= 0.0f) {
                return false;
            }
            if (motionEvent.getAction() != 0 || (motionEvent.getX() >= getWidth() - width() && motionEvent.getY() >= getHeight() - height())) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }

        public void updateColors() {
            int color = this.isNewDesignSendButton ? -1 : Theme.getColor(Theme.key_chat_messagePanelSend, this.resourcesProvider);
            if (color != this.drawableColor) {
                this.drawableColor = color;
                Drawable drawable = this.drawable;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                int color2 = Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider);
                this.inactiveDrawable.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(color2), Color.green(color2), Color.blue(color2)), mode));
                this.drawableInverse.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelVoicePressed, this.resourcesProvider), mode));
            }
            if (this.isNewDesignSendButton) {
                this.backgroundPaint.setColor(Theme.getColor(Theme.key_chat_messagePanelSend, this.resourcesProvider));
            } else if (shouldDrawBackground()) {
                this.backgroundPaint.setColor(getFillColor());
            } else {
                this.backgroundPaint.setColor(ColorUtils.setAlphaComponent(-1, 75));
            }
        }

        public void setLoading(boolean z, float f) {
            if (this.loadingShown == z && (!z || Math.abs(this.loadingProgress - f) < 0.01f)) {
                if (this.infiniteLoading == (Math.abs(f - (-3.0f)) < 0.01f)) {
                    return;
                }
            }
            this.infiniteLoading = Math.abs(f - (-3.0f)) < 0.01f;
            if (!this.loadingShown && z) {
                this.loadingAnimatedProgress.set(0.0f, true);
            }
            AnimatedFloat animatedFloat = this.loadingAnimatedShown;
            animatedFloat.setDelay((!z || animatedFloat.get() < 1.0f) ? 0L : 650L);
            this.loadingShown = z;
            if (!z) {
                f = 1.0f;
            }
            this.loadingProgress = f;
            invalidate();
        }

        public void setCount(int i, boolean z) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.count;
            String str = "";
            if (i > 0) {
                str = "" + i;
            }
            animatedTextDrawable.setText(str, z);
            invalidate();
        }

        public void copyTo(SendButton sendButton) {
            sendButton.isNewDesignSendButton = this.isNewDesignSendButton;
            sendButton.newCounterPos = this.newCounterPos;
            sendButton.count.setText(this.count.getText(), false);
            sendButton.countBounceScale = this.countBounceScale;
            sendButton.setEmoji(this.emojiDrawable.getDrawable());
            sendButton.setStarsPrice(this.starsPrice, this.messagesCount);
            sendButton.open.force(this.open.get());
            sendButton.animatedPriceVisible.force(this.animatedPriceVisible.get());
            sendButton.setCircleSize(this.circleWidth, this.circleHeight);
            sendButton.setCirclePadding(this.circlePadX, this.circlePadY);
        }

        public void bounceCount() {
            ValueAnimator valueAnimator = this.bounceCountAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.bounceCountAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChatActivityEnterView.SendButton.$r8$lambda$Fv3wnbGQp6oku3gypqZkZ2Lw4Zs(this.f$0, valueAnimator2);
                }
            });
            this.bounceCountAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SendButton.this.countBounceScale = 1.0f;
                }
            });
            this.bounceCountAnimator.setDuration(180L);
            this.bounceCountAnimator.setInterpolator(new OvershootInterpolator());
            this.bounceCountAnimator.start();
        }

        public static void $r8$lambda$Fv3wnbGQp6oku3gypqZkZ2Lw4Zs(SendButton sendButton, ValueAnimator valueAnimator) {
            sendButton.getClass();
            sendButton.countBounceScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }

        private void checkBackgroundRect() {
            float fDpf2 = AndroidUtilities.dpf2(3.0f);
            float fDpf3 = AndroidUtilities.dpf2(38.0f);
            this.backgroundRect.set((getMeasuredWidth() - AndroidUtilities.lerp(Math.max(fDpf3, AndroidUtilities.dpf2(20.0f) + this.priceText.getCurrentWidth()), fDpf3, this.sameWidthFactor)) - fDpf2, (getMeasuredHeight() - fDpf3) - fDpf2, getMeasuredWidth() - fDpf2, getMeasuredHeight() - fDpf2);
        }
    }

    public boolean drawMessageEditText(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f;
        float f2 = this.topGradientAlpha.set(this.messageEditText.canScrollVertically(-1));
        float f3 = this.bottomGradientAlpha.set(this.messageEditText.canScrollVertically(1));
        if (f2 <= 0.0f && f3 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.messageEditText.getX() + this.messageEditText.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.messageEditText.getY() + this.messageEditText.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean zBooleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        if (f2 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            f = 255.0f;
            rectF.set(this.messageEditText.getX() - AndroidUtilities.dp(5.0f), (this.messageEditText.getY() + this.animatedTop) - 1.0f, this.messageEditText.getX() + this.messageEditText.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.messageEditText.getY() + this.animatedTop + AndroidUtilities.dp(13.0f));
            this.clipMatrix.reset();
            this.clipMatrix.postScale(1.0f, rectF.height() / 16.0f);
            this.clipMatrix.postTranslate(rectF.left, rectF.top);
            this.clipGradient.setLocalMatrix(this.clipMatrix);
            this.gradientPaint.setAlpha((int) (f2 * 255.0f));
            canvas.drawRect(rectF, this.gradientPaint);
        } else {
            f = 255.0f;
        }
        if (f3 > 0.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.messageEditText.getX() - AndroidUtilities.dp(5.0f), (this.messageEditText.getY() + this.messageEditText.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.messageEditText.getX() + this.messageEditText.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.messageEditText.getY() + this.messageEditText.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            this.clipMatrix.reset();
            this.clipMatrix.postScale(1.0f, rectF2.height() / 16.0f);
            this.clipMatrix.postRotate(180.0f);
            this.clipMatrix.postTranslate(rectF2.left, rectF2.bottom);
            this.clipGradient.setLocalMatrix(this.clipMatrix);
            this.gradientPaint.setAlpha((int) (f3 * f));
            canvas.drawRect(rectF2, this.gradientPaint);
        }
        canvas.restore();
        canvas.restore();
        return zBooleanValue;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public void setInAppInsetsController(WindowInsetsInAppController windowInsetsInAppController) {
        this.windowInsetsInAppController = windowInsetsInAppController;
    }

    public void setSideButtonsForAttach(ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout) {
        this.sideButtons = chatActivitySideControlsButtonsLayout;
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0 || i == 1) {
            checkUi_IslandTotalHeight();
            checkUi_TopViewVisibility();
        } else {
            if (i == 2) {
                this.sendButtonBlockedByTypingView.setAlpha(f);
                this.sendButtonBlockedByTypingView.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f));
                this.sendButtonBlockedByTypingView.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f));
                this.sendButtonBlockedByTypingView.setVisibility(f <= 0.0f ? 4 : 0);
            } else if (i == 3) {
                this.sendButtonContainer.setScaleX(AndroidUtilities.lerp(1.0f, 0.79f, f));
                this.sendButtonContainer.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f));
                this.sendOutlineView.setScaleX(AndroidUtilities.lerp(0.79f, 1.0f, f));
                this.sendOutlineView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f));
                this.sendOutlineView.setVisibility(f <= 0.0f ? 8 : 0);
                this.sendOutlineView.setAlpha(f);
                SendButton sendButton = this.sendButton;
                if (sendButton != null) {
                    sendButton.setSameWidthFactor(f);
                }
            }
        }
        invalidate();
    }

    public void checkUi_TopViewVisibility() {
        float floatValue = this.animatorTopViewVisibility.getFloatValue();
        if (this.topView != null) {
            float measuredHeight = getMeasuredHeight() - this.animatorInputFieldHeight.getFactor();
            View view = this.topView;
            view.setTranslationY(measuredHeight - (view.getMeasuredHeight() * floatValue));
            this.topView.setVisibility(floatValue > 0.0f ? 0 : 8);
        }
        resizeForTopView(floatValue > 0.0f);
    }

    private float calculateIslandTotalHeight(boolean z) {
        float factor;
        float floatValue;
        if (z) {
            factor = this.animatorInputFieldHeight.getToFactor();
        } else {
            factor = this.animatorInputFieldHeight.getFactor();
        }
        if (z) {
            floatValue = this.animatorTopViewVisibility.getValue() ? 1.0f : 0.0f;
        } else {
            floatValue = this.animatorTopViewVisibility.getFloatValue();
        }
        View view = this.topView;
        return factor + ((view != null ? view.getMeasuredHeight() : 0) * floatValue);
    }

    private void checkUi_IslandTotalHeight() {
        this.currentIslandTotalHeightTarget = calculateIslandTotalHeight(true);
        float fCalculateIslandTotalHeight = calculateIslandTotalHeight(false);
        if (this.currentIslandTotalHeight != fCalculateIslandTotalHeight) {
            this.currentIslandTotalHeight = fCalculateIslandTotalHeight;
            onChangedIslandTotalHeight(fCalculateIslandTotalHeight);
        }
    }

    public float getIslandTotalHeight(boolean z) {
        if (z) {
            return this.currentIslandTotalHeightTarget;
        }
        return this.currentIslandTotalHeight;
    }

    public void setLiveComment(boolean z, boolean z2) {
        if (this.isLiveComment == z) {
            return;
        }
        this.isLiveComment = z;
        this.attachButton.setVisibility(z ? 8 : 0);
        if (z) {
            AndroidUtilities.removeFromParent(this.notifyButton);
        }
        if (z) {
            this.audioVideoSendButton.setVisibility(8);
        } else {
            reset();
        }
        if (!z) {
            this.currentLimit = -1;
            NumberTextView numberTextView = this.captionLimitView;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        updateFieldRight(this.lastAttachVisible);
        checkSendButton(false);
    }

    public static void disableNewLines(EditText editText) {
        InputFilter inputFilter = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return ChatActivityEnterView.$r8$lambda$6GhB1Ws4PD16BXgg4KkIWwrzS7w(charSequence, i, i2, spanned, i3, i4);
            }
        };
        InputFilter[] filters = editText.getFilters();
        if (filters == null) {
            editText.setFilters(new InputFilter[]{inputFilter});
            return;
        }
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        editText.setFilters(inputFilterArr);
    }

    public static CharSequence $r8$lambda$6GhB1Ws4PD16BXgg4KkIWwrzS7w(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        for (int i5 = i; i5 < i2; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '\n' || cCharAt == '\r') {
                StringBuilder sb = new StringBuilder(i2 - i);
                while (i < i2) {
                    char cCharAt2 = charSequence.charAt(i);
                    if (cCharAt2 != '\n' && cCharAt2 != '\r') {
                        sb.append(cCharAt2);
                    }
                    i++;
                }
                return sb;
            }
        }
        return null;
    }
}
