package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.messenger.utils.CountdownTimer;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedNumberLayout;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AudioVisualizerDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.AvatarsListDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.FormattedDateSpan;
import org.telegram.ui.Components.ForwardBackground;
import org.telegram.ui.Components.InfiniteProgress;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.MessageBackgroundDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.MsgClockDrawable;
import org.telegram.ui.Components.PostRunnableHolder;
import org.telegram.ui.Components.Premium.boosts.BoostCounterSpan;
import org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayMessageCell;
import org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayResultsMessageCell;
import org.telegram.ui.Components.QuoteHighlight;
import org.telegram.ui.Components.RLottieDiceDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.RoundVideoPlayingDrawable;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.SeekBarAccessibilityDelegate;
import org.telegram.ui.Components.SeekBarWaveform;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.StickerSetLinkIcon;
import org.telegram.ui.Components.SuggestionOffer;
import org.telegram.ui.Components.SummaryIcon;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TimerParticles;
import org.telegram.ui.Components.TopicSeparator;
import org.telegram.ui.Components.TranscribeButton;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanBotCommand;
import org.telegram.ui.Components.URLSpanBrowser;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.VideoForwardDrawable;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.poll.PollContentDrawable;
import org.telegram.ui.Components.poll.buttons.PollAddButtonDrawable;
import org.telegram.ui.Components.poll.buttons.PollButtonDrawable;
import org.telegram.ui.Components.poll.buttons.PollInstantButtonDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.GradientClip;
import org.telegram.ui.MultiLayoutTypingAnimator;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.CaptionContainerView;

public class ChatMessageCell extends BaseCell implements SeekBar.SeekBarDelegate, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, TextSelectionHelper.SelectableView, NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target, IMessageCell {
    private static float[] radii = new float[8];
    private final boolean ALPHA_PROPERTY_WORKAROUND;
    public Property ANIMATION_OFFSET_X;
    private int TAG;
    CharSequence accessibilityText;
    private boolean accessibilityTextContentUnread;
    private long accessibilityTextFileSize;
    private boolean accessibilityTextUnread;
    private SparseArray accessibilityVirtualViewBounds;
    private float actionAlpha;
    private int[] adaptiveEmojiColor;
    private ColorFilter[] adaptiveEmojiColorFilter;
    private int addedCaptionHeight;
    private boolean addedForTest;
    private int additionalPaddingHeight;
    private int additionalTimeOffsetY;
    private StaticLayout adminLayout;
    private ButtonBounce adminLayoutBounce;
    private boolean adminLayoutIsAdmin;
    private boolean adminLayoutIsOwner;
    private boolean adminLayoutIsTag;
    private RectF adminLayoutRect;
    private boolean allowAssistant;
    private float alphaInternal;
    private int animateFromStatusDrawableParams;
    private boolean animatePollAnswer;
    private boolean animatePollAnswerAlpha;
    private boolean animatePollAvatars;
    private int animateToStatusDrawableParams;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiDescriptionStack;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiPollExplanation;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiPollQuestion;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiReplyStack;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    private AnimatedTextView.AnimatedTextDrawable animatedInfoLayout;
    private AnimatedTextView.AnimatedTextDrawable animatedInfoLayout2;
    private int animatingDrawVideoImageButton;
    private float animatingDrawVideoImageButtonProgress;
    private float animatingLoadingProgressProgress;
    private int animatingNoSound;
    private boolean animatingNoSoundPlaying;
    private float animatingNoSoundProgress;
    private float animationOffsetX;
    private boolean animationRunning;
    public int askBotForumBottomPadding;
    private BotAskCellDrawable askBotForumBubble;
    private TopicSeparator askBotForumSeparator;
    private boolean attachedToWindow;
    private StaticLayout authorLayout;
    private int authorLayoutLeft;
    private int authorLayoutWidth;
    private boolean autoPlayingMedia;
    private int availableTimeWidth;
    protected AvatarDrawable avatarDrawable;
    private ImageReceiver avatarImage;
    private boolean avatarPressed;
    private MessageDrawable.PathDrawParams backgroundCacheParams;
    private MessageBackgroundDrawable backgroundDrawable;
    private int backgroundDrawableBottom;
    private int backgroundDrawableLeft;
    private int backgroundDrawableRight;
    private int backgroundDrawableTop;
    public int backgroundHeight;
    public int backgroundWidth;
    private ImageReceiver blurredPhotoImage;
    public int blurredViewBottomOffset;
    public int blurredViewTopOffset;
    private RectF boostCounterBounds;
    private Drawable boostCounterLayoutSelector;
    private boolean boostCounterPressed;
    private int boostCounterSelectorColor;
    private BoostCounterSpan boostCounterSpan;
    private Path botButtonPath;
    private float[] botButtonRadii;
    private ArrayList botButtons;
    private HashMap botButtonsByData;
    private HashMap botButtonsByPosition;
    private String botButtonsLayout;
    public MultiLayoutTypingAnimator botDraftTypingAnimator;
    public int bottomActionPadding;
    private Text bottomActionText;
    private LinkPath bottomActionTextPath;
    private CornerPathEffect bottomActionTextPathEffect;
    private boolean bottomNearToSet;
    private int buttonPressed;
    private int buttonState;
    private int buttonX;
    private int buttonY;
    private final boolean canDrawBackgroundInParent;
    private boolean canStreamVideo;
    public boolean captionAbove;
    private int captionFullWidth;
    private int captionHeight;
    public MessageObject.TextLayoutBlocks captionLayout;
    private int captionOffsetX;
    private int captionWidth;
    private float captionX;
    public float captionY;
    public ChannelRecommendationsCell channelRecommendationsCell;
    private CheckBoxBase checkBox;
    private boolean checkBoxAnimationInProgress;
    private float checkBoxAnimationProgress;
    public int checkBoxTranslation;
    private boolean checkBoxVisible;
    private boolean checkOnlyButtonPressed;
    public int childPosition;
    public int childPosition2;
    private GradientClip clip;
    private Paint clipPaint;
    public boolean clipToGroupBounds;
    private Drawable closeExplanationDrawable;
    private int closeExplanationDrawableColor;
    private boolean closeExplanationPressed;
    private int closeExplanationX;
    private int closeExplanationY;
    private ButtonBounce closeSponsoredBounce;
    private RectF closeSponsoredBounds;
    private String closeTimeText;
    private int closeTimeWidth;
    private int commentArrowX;
    private AvatarDrawable[] commentAvatarDrawables;
    private ImageReceiver[] commentAvatarImages;
    private boolean[] commentAvatarImagesVisible;
    private boolean commentButtonPressed;
    private Rect commentButtonRect;
    private boolean commentDrawUnread;
    private StaticLayout commentLayout;
    private LoadingDrawable commentLoading;
    private AnimatedNumberLayout commentNumberLayout;
    private int commentNumberWidth;
    private InfiniteProgress commentProgress;
    private float commentProgressAlpha;
    private long commentProgressLastUpadteTime;
    private int commentUnreadX;
    private int commentWidth;
    private int commentX;
    public MessageObject.TextLayoutBlocks computedCaptionLayout;
    public int computedGroupCaptionY;
    private AvatarDrawable contactAvatarDrawable;
    public ButtonBounce contactBounce;
    private ArrayList contactButtons;
    public ReplyMessageLine contactLine;
    private boolean contactPressed;
    private RectF contactRect;
    private float controlsAlpha;
    public final int currentAccount;
    public MessageDrawable currentBackgroundDrawable;
    private MessageDrawable currentBackgroundSelectedDrawable;
    private CharSequence currentCaption;
    private TLRPC.Chat currentChat;
    private CharSequence currentExplanation;
    private int currentFocusedVirtualView;
    private TLRPC.Chat currentForwardChannel;
    private String currentForwardName;
    private String currentForwardNameString;
    private TLRPC.User currentForwardUser;
    private int currentMapProvider;
    private MessageObject currentMessageObject;
    private MessageObject.GroupedMessages currentMessagesGroup;
    private long currentNameBotVerificationId;
    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable currentNameEmojiStatusDrawable;
    private Object currentNameStatus;
    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable currentNameStatusDrawable;
    private String currentNameString;
    private TLRPC.FileLocation currentPhoto;
    private String currentPhotoFilter;
    private String currentPhotoFilterThumb;
    private ImageLocation currentPhotoLocation;
    private TLRPC.PhotoSize currentPhotoObject;
    private TLRPC.PhotoSize currentPhotoObjectThumb;
    private BitmapDrawable currentPhotoObjectThumbStripped;
    private ImageLocation currentPhotoThumbLocation;
    private MessageObject.GroupedMessagePosition currentPosition;
    private String currentRepliesString;
    private TLRPC.PhotoSize currentReplyPhoto;
    private float currentSelectedBackgroundAlpha;
    private CharSequence currentTimeString;
    private String currentUnlockString;
    private String currentUrl;
    private TLRPC.User currentUser;
    private TLRPC.User currentViaBotUser;
    private String currentViewsString;
    private WebFile currentWebFile;
    private ChatMessageCellDelegate delegate;
    private RectF deleteProgressRect;
    private StaticLayout descriptionLayout;
    private int descriptionLayoutLeft;
    private int descriptionLayoutWidth;
    private int descriptionX;
    private int descriptionY;
    private Runnable diceFinishCallback;
    private long diceStakeOutcome;
    private boolean disallowLongPress;
    public byte[] doNotDrawPollId;
    public int doNotDrawTaskId;
    private final Runnable doUpdateRelativeDatesRunnable;
    private StaticLayout docTitleLayout;
    private int docTitleOffsetX;
    private int docTitleWidth;
    private TLRPC.Document documentAttach;
    private int documentAttachType;
    public BotForumHelper.BotDraftAnimationsPool draftAnimationsPool;
    private boolean drawBackground;
    private boolean drawCommentButton;
    private boolean drawCommentNumber;
    private boolean drawContact;
    private boolean drawContactAdd;
    private boolean drawContactSendMessage;
    private boolean drawContactView;
    private boolean drawContinueBotTopic;
    public boolean drawForBlur;
    private boolean drawForwardedName;
    public boolean drawFromPinchToZoom;
    private boolean drawImageButton;
    private boolean drawInstantView;
    public int drawInstantViewType;
    private boolean drawMediaCheckBox;
    private boolean drawName;
    private boolean drawNameAvatar;
    private boolean drawNameLayout;
    public byte[] drawOnlyPollId;
    public boolean drawPhotoImage;
    public boolean drawPinnedBottom;
    public boolean drawPinnedTop;
    private boolean drawRadialCheckBackground;
    private boolean drawSelectionBackground;
    private int drawSideButton;
    private int drawSideButton2;
    private boolean drawStartBotTopic;
    private boolean drawSummarizeButton;
    public boolean drawSummaryReply;
    private boolean drawTime;
    private float drawTimeX;
    private float drawTimeY;
    private boolean drawTopic;
    private boolean drawVideoImageButton;
    private boolean drawVideoSize;
    public boolean drawingToBitmap;
    private int drawnContactButtonsFlag;
    private Paint drillHolePaint;
    private Path drillHolePath;
    private StaticLayout durationLayout;
    private int durationWidth;
    private boolean edited;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable effectDrawable;
    private ButtonBounce effectDrawableBounce;
    private long effectId;
    private int effectMessageId;
    boolean enterTransitionInProgress;
    private StaticLayout ephemeralLayout;
    private int ephemeralWidth;
    private float ephemeralX;
    private float ephemeralY;
    public ExpiredStoryView expiredStoryView;
    private int explanationContentHeight;
    private int explanationContentWidth;
    private int explanationHeight;
    public MessageObject.TextLayoutBlocks explanationLayout;
    public StaticLayout explanationTitleLayout;
    private Drawable factCheckArrow;
    private int factCheckArrowColor;
    private ButtonBounce factCheckBounce;
    private int factCheckHeight;
    private boolean factCheckLarge;
    public ReplyMessageLine factCheckLine;
    private LinkSpanDrawable.LinkCollector factCheckLinks;
    private boolean factCheckPressed;
    private StaticLayout factCheckText2Layout;
    private int factCheckText2LayoutLeft;
    private StaticLayout factCheckTextLayout;
    private int factCheckTextLayoutHeight;
    private boolean factCheckTextLayoutLastLineEnd;
    private int factCheckTextLayoutLeft;
    private Text factCheckTitle;
    private Text factCheckWhat;
    private ButtonBounce factCheckWhatBounce;
    private boolean factCheckWhatPressed;
    private int factCheckWidth;
    private int factCheckY;
    private ColorMatrixColorFilter fancyBlurFilter;
    private boolean firstCircleLength;
    public boolean firstInChat;
    private boolean firstInChatToSet;
    private int firstVisibleBlockNum;
    public int firstVisiblePollButton;
    private int firstVisibleRichBlock;
    private boolean fitPhotoImage;
    private FlagSecureReason flagSecure;
    private boolean flipImage;
    private boolean forceNotDrawTime;
    private boolean forcedLayout;
    private Drawable foreverDrawable;
    private int foreverDrawableColor;
    private AvatarSpan forwardAvatar;
    private ForwardBackground forwardBg;
    private boolean forwardBotPressed;
    private int forwardHeight;
    private int forwardNameCenterX;
    private final float[] forwardNameOffsetX;
    private boolean forwardNamePressed;
    private float forwardNameX;
    private int forwardNameY;
    private final StaticLayout[] forwardedNameLayout;
    private int forwardedNameWidth;
    private boolean frozen;
    private boolean fullyDraw;
    private boolean gamePreviewPressed;
    public final GiveawayMessageCell giveawayMessageCell;
    public final GiveawayResultsMessageCell giveawayResultsMessageCell;
    private Drawable gradientDrawable;
    private LinearGradient gradientShader;
    private Drawable groupCallDrawable;
    private int groupCallDrawableColor;
    private AvatarsDrawable groupCallParticipantsAvatars;
    private Text groupCallParticipantsText;
    public GroupMedia groupMedia;
    private boolean groupPhotoInvisible;
    private MessageObject.GroupedMessages groupedMessagesToSet;
    private boolean hadLongPress;
    public boolean hasDiscussion;
    private boolean hasEmbed;
    private boolean hasFactCheck;
    private boolean hasGamePreview;
    private boolean hasInvoicePreview;
    private boolean hasInvoicePrice;
    private boolean hasLinkPreview;
    private int hasMiniProgress;
    private boolean hasNewLineForTime;
    private boolean hasOldCaptionPreview;
    private boolean hasPsaHint;
    public boolean hasReplyQuote;
    private boolean hideSideButtonByQuickShare;
    private int highlightCaptionToSetEnd;
    private int highlightCaptionToSetStart;
    private LinkPath highlightPath;
    private long highlightPathStart;
    private int highlightProgress;
    private boolean highlightedQuote;
    private float hintButtonProgress;
    private boolean hintButtonVisible;
    private int imageBackgroundColor;
    private int imageBackgroundGradientColor1;
    private int imageBackgroundGradientColor2;
    private int imageBackgroundGradientColor3;
    private int imageBackgroundGradientRotation;
    private float imageBackgroundIntensity;
    private int imageBackgroundSideColor;
    private int imageBackgroundSideWidth;
    private boolean imageDrawn;
    private boolean imagePressed;
    boolean imageReceiversAttachState;
    boolean imageReceiversVisibleState;
    private boolean inLayout;
    private boolean inQuickShareMode;
    private StaticLayout infoLayout;
    private int infoWidth;
    private ButtonBounce instantButtonBounce;
    private LoadingDrawable instantButtonLoading;
    private boolean instantButtonPressed;
    private RectF instantButtonRect;
    public Drawable instantDrawable;
    public int instantDrawableColor;
    private Paint instantLinkArrowPaint;
    private Path instantLinkArrowPath;
    private boolean instantPressed;
    private int instantTextLeftX;
    private boolean instantTextNewLine;
    private int instantTextX;
    public CharSequence instantViewButtonText;
    private StaticLayout instantViewLayout;
    private float instantViewLayoutLeft;
    private float instantViewLayoutWidth;
    private TL_stars.StarGift instantViewTypeIsGiftAuction;
    private int instantWidth;
    private Runnable invalidateListener;
    private final Runnable invalidateOutboundsRunnable;
    private Runnable invalidateRunnable;
    private boolean invalidateSpoilersParent;
    private boolean invalidatesParent;
    public boolean isAllChats;
    public boolean isAvatarVisible;
    public boolean isBlurred;
    public boolean isBot;
    public boolean isBotForum;
    public boolean isChat;
    private boolean isCheckPressed;
    public boolean isForum;
    public boolean isForumGeneral;
    private boolean isHighlighted;
    private boolean isHighlightedAnimated;
    private boolean isMedia;
    public boolean isMegagroup;
    public boolean isMonoForum;
    public boolean isPinned;
    public boolean isPinnedChat;
    private boolean isPlayingRound;
    private boolean isPressed;
    public boolean isRepliesChat;
    public boolean isReplyQuote;
    public boolean isReplyTaskOrPollOption;
    public boolean isReportChat;
    private boolean isRoundVideo;
    public boolean isSavedChat;
    public boolean isSavedPreviewChat;
    public boolean isSideMenuEnabled;
    public boolean isSideMenued;
    private boolean isSmallImage;
    private boolean isSpoilerRevealing;
    private final BoolAnimator isSponsoredMessageHidden;
    public boolean isThreadChat;
    private boolean isThreadPost;
    private boolean isTitleLabelPressed;
    private boolean isUpdating;
    private int keyboardHeight;
    private long lastAnimationTime;
    private long lastCheckBoxAnimationTime;
    private long lastControlsAlphaChangeTime;
    private int lastDeleteDate;
    private float lastDrawExplanationX;
    private float lastDrawExplanationY;
    private float lastDrawingAudioProgress;
    private int lastHeight;
    private long lastHighlightProgressTime;
    public boolean lastInChatList;
    private boolean lastInChatListToSet;
    private long lastLoadingSizeTotal;
    private long lastNamesAnimationTime;
    private TLRPC.Poll lastPoll;
    private long lastPollCloseTime;
    private ArrayList lastPollResults;
    private TLRPC.PollResults lastPollResultsObj;
    private int lastPollResultsVoters;
    private String lastPostAuthor;
    private TLRPC.TL_messageReactions lastReactions;
    private int lastRepliesCount;
    private TLRPC.Message lastReplyMessage;
    private long lastSeekUpdateTime;
    private int lastSendState;
    int lastSize;
    private double lastTime;
    private float lastTouchX;
    private float lastTouchY;
    private boolean lastTranslated;
    private int lastViewsCount;
    private int lastVisibleBlockNum;
    public int lastVisiblePollButton;
    private int lastVisibleRichBlock;
    private WebFile lastWebFile;
    private int lastWidth;
    public int layoutHeight;
    public int layoutWidth;
    public int linkBlockNum;
    public int linkExplanationBlockNum;
    public ReplyMessageLine linkLine;
    public boolean linkPreviewAbove;
    private ButtonBounce linkPreviewBounce;
    public int linkPreviewHeight;
    private boolean linkPreviewPressed;
    private Drawable linkPreviewSelector;
    public int linkPreviewSelectorColor;
    private int linkPreviewY;
    private int linkSelectionBlockNum;
    public long linkedChatId;
    public LinkSpanDrawable.LinkCollector links;
    private StaticLayout loadingProgressLayout;
    private long loadingProgressLayoutHash;
    private boolean locationExpired;
    private ImageReceiver locationImageReceiver;
    private Drawable locationLoadingThumb;
    public boolean makeVisibleAfterChange;
    private boolean mediaBackground;
    private CheckBoxBase mediaCheckBox;
    private int mediaOffsetY;
    private SpoilerEffect mediaSpoilerEffect;
    private SpoilerEffect2 mediaSpoilerEffect2;
    private Integer mediaSpoilerEffect2Index;
    private Path mediaSpoilerPath;
    private float[] mediaSpoilerRadii;
    private float mediaSpoilerRevealMaxRadius;
    private float mediaSpoilerRevealProgress;
    private float mediaSpoilerRevealX;
    private float mediaSpoilerRevealY;
    private boolean mediaWasInvisible;
    private MessageObject messageObjectToSet;
    private int miniButtonPressed;
    private int miniButtonState;
    private MotionBackgroundDrawable motionBackgroundDrawable;
    private StaticLayout nameLayout;
    private boolean nameLayoutPressed;
    private Drawable nameLayoutSelector;
    private int nameLayoutSelectorColor;
    private int nameLayoutWidth;
    private float nameOffsetX;
    private boolean nameStatusPressed;
    private Drawable nameStatusSelector;
    private int nameStatusSelectorColor;
    private String nameStatusSlug;
    private int nameWidth;
    private float nameX;
    private float nameY;
    public int namesOffset;
    private boolean needNewVisiblePart;
    public boolean needReplyImage;
    private int noSoundCenterX;
    private final ArrayList oldPollButtons;
    private Paint onceClearPaint;
    private RLottieDrawable onceFire;
    private CaptionContainerView.PeriodDrawable oncePeriod;
    private Paint onceRadialCutPaint;
    private Paint onceRadialPaint;
    private Paint onceRadialStrokePaint;
    private boolean otherPressed;
    private int otherX;
    private int otherY;
    private int overideShouldDrawTimeOnMedia;
    private Runnable overrideInvalidate;
    private AudioVisualizerDrawable overridenAudioVisualizer;
    private long overridenDuration;
    public int parentBoundsBottom;
    public float parentBoundsTop;
    public int parentHeight;
    public float parentViewTopOffset;
    public int parentWidth;
    private StaticLayout performerLayout;
    private int performerX;
    private ImageReceiver photoImage;
    private Path photoImageClipPath;
    private float[] photoImageClipPathRadii;
    private boolean photoImageOutOfBounds;
    private boolean photoNotSet;
    private TLObject photoParentObject;
    private StaticLayout photosCountLayout;
    private int photosCountWidth;
    public boolean pinnedBottom;
    public boolean pinnedTop;
    private boolean playedDice;
    private PollAddButtonDrawable pollAddButtonDrawable;
    private int pollAddButtonHeight;
    private int pollAddButtonPressed;
    private boolean pollAllowAdding;
    private float pollAnimationProgress;
    private float pollAnimationProgressTime;
    public final ArrayList pollButtons;
    private CheckBoxBase[] pollCheckBox;
    private Paint pollCheckPaint;
    private Path pollCheckPath;
    private boolean pollClosed;
    private PollContentDrawable pollContentDrawable;
    private int pollContentHeight;
    private int pollContentHeightWithOffset;
    private int pollContentWidth;
    private CountdownTimer pollCountDownTimer;
    private Paint pollCutAvatarPaint;
    private PollContentDrawable pollExplanationDrawable;
    private boolean pollHasResults;
    private boolean pollHasVoteRestrictions;
    private boolean pollHideResults;
    private boolean pollHintPressed;
    private int pollHintX;
    private int pollHintY;
    private boolean pollInInputNewOption;
    private PollInstantButtonDrawable pollInstantButtonDrawable;
    private boolean pollInstantViewTouchesBottom;
    private int pollMediaPressedIndex;
    private int[] pollPhotoImageRadius;
    private AvatarsListDrawable pollRecentVotersDrawable;
    private boolean pollResultsPreview;
    private boolean pollUnvoteInProgress;
    private boolean pollVoteInProgress;
    private int pollVoteInProgressNum;
    private boolean pollVoted;
    private boolean pollWithMediaInAnswers;
    private final PostRunnableHolder postRunnableHolder;
    private int pressedBlock;
    private int pressedBotButton;
    private MessageObject.TextLayoutBlock pressedCopyCode;
    private boolean pressedEffect;
    private AnimatedEmojiSpan pressedEmoji;
    private LinkSpanDrawable pressedFactCheckLink;
    private LinkSpanDrawable pressedLink;
    private int pressedLinkType;
    private int pressedSideButton;
    private final int[] pressedState;
    private int pressedVoteButton;
    private boolean pressedVoteIsMedia;
    public MessageObject.TextLayoutBlocks prevCaptionLayout;
    private CharacterStyle progressLoadingLink;
    private LoadingDrawable progressLoadingLinkCurrentDrawable;
    private ArrayList progressLoadingLinkDrawables;
    private float psaButtonProgress;
    private boolean psaButtonVisible;
    private int psaHelpX;
    private int psaHelpY;
    private boolean psaHintPressed;
    public Drawable quoteArrow;
    public int quoteArrowColor;
    public Drawable[] quoteDrawable;
    public int[] quoteDrawableColor;
    public QuoteHighlight quoteHighlight;
    public ReplyMessageLine quoteLine;
    private RadialProgress2 radialProgress;
    protected float radialProgressAlpha;
    public final ReactionsLayoutInBubble reactionsLayoutInBubble;
    private boolean reactionsVisible;
    private RectF rect;
    private Path rectPath;
    private StaticLayout repliesLayout;
    private int repliesTextWidth;
    public ButtonBounce replyBounce;
    public float replyBounceX;
    public float replyBounceY;
    public float replyHeight;
    public ImageReceiver replyImageReceiver;
    public ReplyMessageLine replyLine;
    public StaticLayout replyNameLayout;
    private int replyNameOffset;
    private int replyNameWidth;
    private boolean replyPanelIsForward;
    private boolean replyPressed;
    private AnimatedFloat replyPressedFloat;
    public Drawable replyQuoteDrawable;
    public int replyQuoteDrawableColor;
    private Path replyRoundRectPath;
    public Drawable replySelector;
    private boolean replySelectorCanBePressed;
    public int replySelectorColor;
    private boolean replySelectorPressed;
    public float replySelectorRadLeft;
    public float replySelectorRadRight;
    public RectF replySelectorRect;
    public List replySpoilers;
    private final Stack replySpoilersPool;
    public int replyStartX;
    public int replyStartY;
    public CheckBoxBase replyTaskCheckbox;
    private int replyTextHeight;
    public StaticLayout replyTextLayout;
    public int replyTextOffset;
    public boolean replyTextRTL;
    private int replyTextWidth;
    private float replyTouchX;
    private float replyTouchY;
    private Theme.ResourcesProvider resourcesProvider;
    public float resultsPollButtonOffset;
    private float roundPlayingDrawableProgress;
    private float roundProgressAlpha;
    float roundSeekbarOutAlpha;
    float roundSeekbarOutProgress;
    int roundSeekbarTouched;
    private float roundToPauseProgress;
    private float roundToPauseProgress2;
    private AnimatedFloat roundVideoPlayPipFloat;
    private RoundVideoPlayingDrawable roundVideoPlayingDrawable;
    private final Path sPath;
    private final Runnable scheduleUpdateRelativeDatesRunnable;
    private boolean scheduledInvalidate;
    private Rect scrollRect;
    private SeekBar seekBar;
    private SeekBarAccessibilityDelegate seekBarAccessibilityDelegate;
    private int seekBarTranslateX;
    private SeekBarWaveform seekBarWaveform;
    private int seekBarWaveformTranslateX;
    private int seekBarX;
    private int seekBarY;
    float seekbarRoundX;
    float seekbarRoundY;
    private float selectedBackgroundProgress;
    private Paint selectionOverlayPaint;
    private final Drawable[] selectorDrawable;
    private int selectorDrawableColor;
    private int[] selectorDrawableMaskType;
    private final MaskDrawable[] selectorMaskDrawable;
    private Text sensitiveText;
    private Text sensitiveTextShort;
    private Text sensitiveTextShort2;
    private AnimatorSet shakeAnimation;
    private ChatMessageSharedResources sharedResources;
    public boolean shouldCheckVisibleOnScreen;
    public boolean showTopicSeparator;
    private Path sideButtonPath1;
    private Path sideButtonPath2;
    private float[] sideButtonPathCorners1;
    private float[] sideButtonPathCorners2;
    private boolean sideButtonPressed;
    private boolean sideButtonVisible;
    private ImageReceiver sideImage;
    public float sideMenuAlpha;
    public int sideMenuWidth;
    private int sideNameWidth;
    private float sideStartX;
    private float sideStartY;
    public int signWidth;
    private StaticLayout siteNameLayout;
    private float siteNameLayoutWidth;
    private float siteNameLeft;
    private int siteNameWidth;
    private boolean skipFrameUpdate;
    private float slidingOffsetX;
    private StaticLayout songLayout;
    private int songX;
    private SpoilerEffect spoilerPressed;
    private AtomicReference spoilersPatchedReplyTextLayout;
    private Paint srcOutPaint;
    private long starsPrice;
    private Text starsPriceText;
    private LinkPath starsPriceTextPath;
    private CornerPathEffect starsPriceTextPathEffect;
    public int starsPriceTopPadding;
    private boolean statusDrawableAnimationInProgress;
    private ValueAnimator statusDrawableAnimator;
    private float statusDrawableProgress;
    private StickerSetLinkIcon stickerSetIcons;
    private int substractBackgroundHeight;
    public SuggestionOffer suggestionOffer;
    private int suggestionOfferTopPadding;
    private boolean summarizeButtonPressed;
    private float summarizeButtonX;
    private float summarizeButtonY;
    private SummaryIcon summarizeIcon;
    public ButtonBounce summaryBounce;
    public ReplyMessageLine summaryLine;
    public StarsReactionsSheet.Particles summaryParticles;
    public Drawable summaryReplySelector;
    public int summarySelectorColor;
    public RectF summarySelectorRect;
    public int summaryStartX;
    public int summaryStartY;
    public Text summarySubtitle;
    public Text summaryTitle;
    public int textX;
    public int textY;
    private float timeAlpha;
    private int timeAudioX;
    public StaticLayout timeLayout;
    private boolean timePressed;
    private int timeTextWidth;
    private boolean timeWasInvisible;
    public int timeWidth;
    private int timeWidthAudio;
    public int timeX;
    private TimerParticles timerParticles;
    private AnimatedFloat timerParticlesAlpha;
    private float timerTransitionProgress;
    private ButtonBounce titleLabelBounce;
    private StaticLayout titleLabelLayout;
    private float titleLabelLayoutHeight;
    private float titleLabelLayoutWidth;
    private float titleLabelX;
    private float titleLabelY;
    private StaticLayout titleLayout;
    private int titleLayoutLeft;
    private int titleLayoutWidth;
    private int titleX;
    private float toSeekBarProgress;
    private boolean topNearToSet;
    public TopicSeparator topicSeparator;
    public int topicSeparatorTopPadding;
    private long totalChangeTime;
    private int totalCommentWidth;
    public int totalHeight;
    private int totalVisibleBlocksCount;
    private boolean touchedByCaption;
    private boolean touchedByExpanation;
    public TranscribeButton transcribeButton;
    private float transcribeX;
    private float transcribeY;
    public final TransitionParams transitionParams;
    public float transitionYOffsetForDrawables;
    private LoadingDrawable translationLoadingDrawable;
    private ArrayList translationLoadingDrawableText;
    private AnimatedFloat translationLoadingFloat;
    private LinkPath translationLoadingPath;
    private float unlockAlpha;
    private StaticLayout unlockLayout;
    private SpoilerEffect unlockSpoilerEffect;
    private Path unlockSpoilerPath;
    private float[] unlockSpoilerRadii;
    private int unlockTextWidth;
    private float unlockX;
    private float unlockY;
    private int unmovedTextX;
    private ArrayList urlPathCache;
    private ArrayList urlPathSelection;
    private boolean useSeekBarWaveform;
    private boolean useTranscribeButton;
    private int viaNameWidth;
    private boolean viaOnly;
    private TypefaceSpan viaSpan1;
    private TypefaceSpan viaSpan2;
    private int viaWidth;
    private boolean vibrateOnPollVote;
    private int videoButtonPressed;
    private int videoButtonX;
    private int videoButtonY;
    VideoForwardDrawable videoForwardDrawable;
    private StaticLayout videoInfoLayout;
    OldVideoPlayerRewinder videoPlayerRewinder;
    private RadialProgress2 videoRadialProgress;
    public float viewTop;
    private StaticLayout viewsLayout;
    private int viewsTextWidth;
    public int visibleHeight;
    private boolean visibleOnScreen;
    public int visibleParent;
    public float visibleParentOffset;
    public float visibleTop;
    private float voteCurrentCircleLength;
    private float voteCurrentProgressTime;
    private long voteLastUpdateTime;
    private float voteRadOffset;
    private boolean voteRisingCircleLength;
    private boolean wasAllChats;
    private boolean wasLayout;
    private boolean wasPinned;
    private boolean wasSending;
    private boolean wasTranscriptionOpen;
    private int widthBeforeNewTimeLine;
    private int widthForButtons;
    private boolean willRemoved;
    private boolean wouldBeInPip;

    private boolean intersect(float f, float f2, float f3, float f4) {
        return f <= f3 ? f2 >= f3 : f <= f4;
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    protected boolean isWidthAdaptive() {
        return false;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public RadialProgress2 getRadialProgress() {
        return this.radialProgress;
    }

    public void setEnterTransitionInProgress(boolean z) {
        this.enterTransitionInProgress = z;
        invalidate();
    }

    public ReactionsLayoutInBubble.ReactionButton getReactionButton(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        return this.reactionsLayoutInBubble.getReactionButton(visibleReaction);
    }

    public MessageObject getPrimaryMessageObject() {
        MessageObject messageObject = this.currentMessageObject;
        MessageObject messageObjectFindPrimaryMessageObject = (messageObject == null || this.currentMessagesGroup == null || !messageObject.hasValidGroupId()) ? null : this.currentMessagesGroup.findPrimaryMessageObject();
        return messageObjectFindPrimaryMessageObject != null ? messageObjectFindPrimaryMessageObject : this.currentMessageObject;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageObject messageObject;
        if (i == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i == NotificationCenter.userInfoDidLoad) {
            TLRPC.User user = this.currentUser;
            if (user != null) {
                if (user.id == ((Long) objArr[0]).longValue()) {
                    setAvatar(this.currentMessageObject);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
            return;
        }
        if (i != NotificationCenter.didUpdatePremiumGiftStickers || (messageObject = this.currentMessageObject) == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaGiveaway) || (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults)) {
            setMessageObject(messageObject, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop, this.firstInChat);
        }
    }

    public void setAvatar(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (this.isAvatarVisible) {
            Drawable drawable = messageObject.customAvatarDrawable;
            if (drawable != null) {
                this.avatarImage.setImageBitmap(drawable);
                return;
            }
            TLRPC.User user = this.currentUser;
            if (user != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                if (userProfilePhoto != null) {
                    this.currentPhoto = userProfilePhoto.photo_small;
                } else {
                    this.currentPhoto = null;
                }
                this.avatarDrawable.setInfo(this.currentAccount, user);
                this.avatarImage.setForUserOrChat(this.currentUser, this.avatarDrawable, null, LiteMode.isEnabled(360928), 1, false);
                return;
            }
            TLRPC.Chat chat = this.currentChat;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    this.currentPhoto = chatPhoto.photo_small;
                } else {
                    this.currentPhoto = null;
                }
                if (chat.signature_profiles && messageObject.getDialogId() != 1271266957) {
                    long peerDialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.from_id);
                    if (peerDialogId >= 0) {
                        TLRPC.User user2 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                        this.avatarDrawable.setInfo(this.currentAccount, user2);
                        this.avatarImage.setForUserOrChat(user2, this.avatarDrawable);
                        return;
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        this.avatarDrawable.setInfo(this.currentAccount, chat2);
                        this.avatarImage.setForUserOrChat(chat2, this.avatarDrawable);
                        return;
                    }
                }
                this.avatarDrawable.setInfo(this.currentAccount, this.currentChat);
                this.avatarImage.setForUserOrChat(this.currentChat, this.avatarDrawable);
                return;
            }
            if (messageObject.isSponsored()) {
                TLRPC.Photo photo = messageObject.sponsoredPhoto;
                if (photo != null) {
                    this.avatarImage.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(50.0f), false, null, true), messageObject.sponsoredPhoto), "50_50", this.avatarDrawable, null, null, 0);
                    return;
                }
                return;
            }
            this.currentPhoto = null;
            this.avatarDrawable.setInfo(messageObject.getFromChatId(), null, null);
            this.avatarImage.setImage(null, null, this.avatarDrawable, null, null, 0);
            return;
        }
        this.currentPhoto = null;
    }

    public void setSpoilersSuppressed(boolean z) {
        for (int i = 0; i < this.replySpoilers.size(); i++) {
            ((SpoilerEffect) this.replySpoilers.get(i)).setSuppressUpdates(z);
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.captionLayout;
        if (textLayoutBlocks != null && textLayoutBlocks.textLayoutBlocks != null) {
            for (int i2 = 0; i2 < this.captionLayout.textLayoutBlocks.size(); i2++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.captionLayout.textLayoutBlocks.get(i2);
                for (int i3 = 0; i3 < textLayoutBlock.spoilers.size(); i3++) {
                    textLayoutBlock.spoilers.get(i3).setSuppressUpdates(z);
                }
            }
        }
        if (getMessageObject() == null || getMessageObject().textLayoutBlocks == null) {
            return;
        }
        for (int i4 = 0; i4 < getMessageObject().textLayoutBlocks.size(); i4++) {
            MessageObject.TextLayoutBlock textLayoutBlock2 = getMessageObject().textLayoutBlocks.get(i4);
            for (int i5 = 0; i5 < textLayoutBlock2.spoilers.size(); i5++) {
                textLayoutBlock2.spoilers.get(i5).setSuppressUpdates(z);
            }
        }
    }

    public boolean hasSpoilers() {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.captionLayout;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            Iterator<MessageObject.TextLayoutBlock> it = arrayList.iterator();
            while (it.hasNext()) {
                if (!it.next().spoilers.isEmpty()) {
                    return true;
                }
            }
        }
        if (getMessageObject() == null || getMessageObject().textLayoutBlocks == null) {
            return false;
        }
        Iterator<MessageObject.TextLayoutBlock> it2 = getMessageObject().textLayoutBlocks.iterator();
        while (it2.hasNext()) {
            if (!it2.next().spoilers.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void updateSpoilersVisiblePart(int i, int i2) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.captionLayout;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            Iterator<MessageObject.TextLayoutBlock> it = arrayList.iterator();
            while (it.hasNext()) {
                MessageObject.TextLayoutBlock next = it.next();
                Iterator<SpoilerEffect> it2 = next.spoilers.iterator();
                while (it2.hasNext()) {
                    it2.next().setVisibleBounds(0.0f, (i - next.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams)) - this.captionX, getWidth(), (i2 - next.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams)) - this.captionY);
                }
            }
        }
        StaticLayout staticLayout = this.replyTextLayout;
        if (staticLayout != null) {
            float height = (-this.replyStartY) - staticLayout.getHeight();
            Iterator it3 = this.replySpoilers.iterator();
            while (it3.hasNext()) {
                ((SpoilerEffect) it3.next()).setVisibleBounds(0.0f, i + height, getWidth(), i2 + height);
            }
        }
        if (getMessageObject() == null || getMessageObject().textLayoutBlocks == null) {
            return;
        }
        Iterator<MessageObject.TextLayoutBlock> it4 = getMessageObject().textLayoutBlocks.iterator();
        while (it4.hasNext()) {
            MessageObject.TextLayoutBlock next2 = it4.next();
            Iterator<SpoilerEffect> it5 = next2.spoilers.iterator();
            while (it5.hasNext()) {
                it5.next().setVisibleBounds(0.0f, (i - next2.textYOffset(getMessageObject().textLayoutBlocks, this.transitionParams)) - this.textY, getWidth(), (i2 - next2.textYOffset(getMessageObject().textLayoutBlocks, this.transitionParams)) - this.textY);
            }
        }
    }

    public void setScrimReaction(Integer num) {
        this.reactionsLayoutInBubble.setScrimReaction(num);
    }

    public void drawScrimReaction(Canvas canvas, Integer num, float f, boolean z) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition != null) {
            int i = groupedMessagePosition.flags;
            if ((i & 8) == 0 || (i & 1) == 0) {
                return;
            }
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (reactionsLayoutInBubble.isSmall) {
            return;
        }
        reactionsLayoutInBubble.setScrimProgress(f, z);
        this.reactionsLayoutInBubble.draw(canvas, this.transitionParams.animateChangeProgress, num);
    }

    public void drawScrimReactionPreview(View view, Canvas canvas, int i, Integer num, float f) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition != null) {
            int i2 = groupedMessagePosition.flags;
            if ((i2 & 8) == 0 || (i2 & 1) == 0) {
                return;
            }
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (reactionsLayoutInBubble.isSmall) {
            return;
        }
        reactionsLayoutInBubble.setScrimProgress(f);
        this.reactionsLayoutInBubble.drawPreview(view, canvas, i, num);
    }

    public boolean checkUnreadPollVotes() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 17) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject.messageOwner);
            if (media instanceof TLRPC.TL_messageMediaPoll) {
                return ((TLRPC.TL_messageMediaPoll) media).results.has_unread_votes;
            }
        }
        return false;
    }

    public boolean checkUnreadReactions(float f, int i) {
        if (!this.reactionsLayoutInBubble.hasUnreadReactions) {
            return false;
        }
        float y = getY();
        float f2 = y + r2.y;
        return f2 > f && (f2 + ((float) this.reactionsLayoutInBubble.height)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i);
    }

    public void markReactionsAsRead() {
        this.reactionsLayoutInBubble.hasUnreadReactions = false;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.markReactionsAsRead();
    }

    public void markPollVotesAsRead() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.markPollVotesAsRead();
    }

    public void setVisibleOnScreen(boolean z, float f, float f2) {
        if (this.visibleOnScreen != z) {
            this.visibleOnScreen = z;
            checkImageReceiversAttachState();
            if (z) {
                invalidate();
            }
        }
        float imageY = f - this.photoImage.getImageY();
        float measuredHeight = f2 - (getMeasuredHeight() - this.photoImage.getImageY2());
        float imageHeight = this.photoImage.getImageHeight();
        if (imageY > 0.0f) {
            imageHeight -= imageY;
        }
        if (measuredHeight > 0.0f) {
            imageHeight -= measuredHeight;
        }
        ImageReceiver imageReceiver = this.photoImage;
        boolean z2 = imageHeight / imageReceiver.getImageHeight() < 0.25f;
        this.skipFrameUpdate = z2;
        imageReceiver.setSkipUpdateFrame(z2);
    }

    public void setParentBounds(float f, int i) {
        this.parentBoundsTop = f;
        this.parentBoundsBottom = i;
        if (this.photoImageOutOfBounds) {
            float y = getY() + getPaddingTop() + this.photoImage.getImageY();
            if (this.photoImage.getImageHeight() + y < this.parentBoundsTop || y > this.parentBoundsBottom) {
                return;
            }
            invalidate();
        }
    }

    public void setSponsoredMessageVisible(boolean z, boolean z2) {
        this.isSponsoredMessageHidden.setValue(!z, z2);
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            invalidate();
            invalidateOutbounds();
        }
    }

    public interface ChatMessageCellDelegate {
        boolean allowAddPollOptions();

        boolean canDrawOutboundsContent();

        boolean canPerformActions();

        boolean canPerformReply();

        boolean canSaveRichDocument(ChatMessageCell chatMessageCell);

        boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell);

        void didLongPress(ChatMessageCell chatMessageCell, float f, float f2);

        void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

        boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2);

        void didLongPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom);

        boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer);

        boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem);

        boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2);

        void didPressAboutRevenueSharingAds();

        void didPressAddPollOptionButton(ChatMessageCell chatMessageCell);

        void didPressAdmin(ChatMessageCell chatMessageCell);

        boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan);

        void didPressAppUpdateButton();

        void didPressBoostCounter(ChatMessageCell chatMessageCell);

        void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto);

        void didPressCancelSendButton(ChatMessageCell chatMessageCell);

        void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z);

        void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z);

        void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell);

        void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock);

        void didPressCommentButton(ChatMessageCell chatMessageCell);

        void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom);

        void didPressEffect(ChatMessageCell chatMessageCell);

        void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton);

        void didPressFactCheck(ChatMessageCell chatMessageCell);

        void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i, int i2);

        void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i);

        void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2);

        void didPressHiddenForward(ChatMessageCell chatMessageCell);

        void didPressHint(ChatMessageCell chatMessageCell, int i);

        void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z);

        void didPressInstantButton(ChatMessageCell chatMessageCell, int i);

        void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell);

        void didPressOther(ChatMessageCell chatMessageCell, float f, float f2);

        void didPressPollMedia(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i);

        void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2);

        void didPressReplyMessage(ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z);

        void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell);

        void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document, float f, float f2);

        void didPressShowMore(ChatMessageCell chatMessageCell);

        void didPressSideButton(ChatMessageCell chatMessageCell);

        void didPressSponsoredClose(ChatMessageCell chatMessageCell);

        void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2);

        void didPressSummarize(ChatMessageCell chatMessageCell, boolean z);

        void didPressTime(ChatMessageCell chatMessageCell);

        boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z);

        void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z);

        void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z);

        void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str);

        void didPressViaBot(ChatMessageCell chatMessageCell, String str);

        void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j);

        void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3);

        void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z);

        void didQuickShareEnd(ChatMessageCell chatMessageCell, float f, float f2);

        void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2);

        void didQuickShareStart(ChatMessageCell chatMessageCell, float f, float f2);

        void didStartVideoStream(MessageObject messageObject);

        void didTogglePollPreview(ChatMessageCell chatMessageCell);

        void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, boolean z, Runnable runnable);

        boolean doNotShowLoadingReply(MessageObject messageObject);

        void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell);

        void forceUpdate(ChatMessageCell chatMessageCell, boolean z);

        void forceUpdate(ChatMessageCell chatMessageCell, boolean z, boolean z2);

        void forceUpdateNoAnimation(ChatMessageCell chatMessageCell, boolean z);

        int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell);

        String getAdminRank(long j);

        int getChatMode();

        ChatActivityDraftMessageMeasureController getDraftMessageMeasureController();

        PinchToZoomHelper getPinchToZoomHelper();

        String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell);

        CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell);

        TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper();

        boolean hasSelectedMessages();

        void invalidateBlur();

        boolean isAdmin(long j);

        boolean isLandscape();

        boolean isOwner(long j);

        boolean isProgressLoading(ChatMessageCell chatMessageCell, int i);

        boolean isReplyOrSelf();

        boolean keyboardIsOpened();

        void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2);

        boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z);

        void needReloadPolls();

        void needShowPremiumBulletin(int i);

        boolean onAccessibilityAction(int i, Bundle bundle);

        void onDiceFinished();

        boolean openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock);

        void setShouldNotRepeatSticker(MessageObject messageObject);

        boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z);

        boolean shouldRepeatSticker(MessageObject messageObject);

        void videoTimerReached();

        public abstract class CC {
            public static boolean $default$allowAddPollOptions(ChatMessageCellDelegate chatMessageCellDelegate) {
                return false;
            }

            public static boolean $default$canDrawOutboundsContent(ChatMessageCellDelegate chatMessageCellDelegate) {
                return true;
            }

            public static boolean $default$canPerformActions(ChatMessageCellDelegate chatMessageCellDelegate) {
                return false;
            }

            public static boolean $default$canSaveRichDocument(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
                return false;
            }

            public static boolean $default$canToggleRichMessageCheckbox(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
                return false;
            }

            public static void $default$didLongPress(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didLongPressBotButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
            }

            public static boolean $default$didLongPressChannelAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2) {
                return false;
            }

            public static void $default$didLongPressCustomBotButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
            }

            public static boolean $default$didLongPressPollOption(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                return false;
            }

            public static boolean $default$didLongPressToDoButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                return false;
            }

            public static boolean $default$didLongPressUserAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                return false;
            }

            public static void $default$didPressAboutRevenueSharingAds(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static void $default$didPressAddPollOptionButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressAdmin(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static boolean $default$didPressAnimatedEmoji(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                return false;
            }

            public static void $default$didPressAppUpdateButton(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static void $default$didPressBoostCounter(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressBotButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
            }

            public static void $default$didPressCancelSendButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressChannelAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
            }

            public static void $default$didPressChannelRecommendation(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
            }

            public static void $default$didPressChannelRecommendationsClose(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressCodeCopy(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
            }

            public static void $default$didPressCommentButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressCustomBotButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
            }

            public static void $default$didPressEffect(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressExtendedMediaPreview(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
            }

            public static void $default$didPressFactCheck(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressFactCheckWhat(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i, int i2) {
            }

            public static void $default$didPressGiveawayChatButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressGroupImage(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
            }

            public static void $default$didPressHiddenForward(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressHint(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressImage(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
            }

            public static void $default$didPressInstantButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressMoreChannelRecommendations(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressOther(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didPressPollMedia(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i) {
            }

            public static void $default$didPressReaction(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
            }

            public static void $default$didPressReplyMessage(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z) {
            }

            public static void $default$didPressRevealSensitiveContent(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressRichDocumentOptions(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.Document document, float f, float f2) {
            }

            public static void $default$didPressShowMore(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressSideButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressSponsoredClose(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressSponsoredInfo(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didPressSummarize(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, boolean z) {
            }

            public static void $default$didPressTime(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static boolean $default$didPressToDoButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
                return false;
            }

            public static void $default$didPressUrl(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
            }

            public static void $default$didPressUserAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z) {
            }

            public static void $default$didPressUserStatus(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
            }

            public static void $default$didPressViaBot(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, String str) {
            }

            public static void $default$didPressViaBotNotInline(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, long j) {
            }

            public static void $default$didPressVoteButtons(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
            }

            public static void $default$didQuickShareEnd(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didQuickShareMove(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didQuickShareStart(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didStartVideoStream(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
            }

            public static void $default$didTogglePollPreview(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didToggleRichMessageCheckbox(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, boolean z, Runnable runnable) {
            }

            public static void $default$drawPollMode(ChatMessageCellDelegate chatMessageCellDelegate, Canvas canvas, ChatMessageCell chatMessageCell) {
            }

            public static void $default$forceUpdate(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, boolean z) {
            }

            public static void $default$forceUpdateNoAnimation(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, boolean z) {
            }

            public static int $default$getAddPollOptionInputFieldHeight(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
                return 0;
            }

            public static String $default$getAdminRank(ChatMessageCellDelegate chatMessageCellDelegate, long j) {
                return null;
            }

            public static int $default$getChatMode(ChatMessageCellDelegate chatMessageCellDelegate) {
                return 0;
            }

            public static ChatActivityDraftMessageMeasureController $default$getDraftMessageMeasureController(ChatMessageCellDelegate chatMessageCellDelegate) {
                return null;
            }

            public static PinchToZoomHelper $default$getPinchToZoomHelper(ChatMessageCellDelegate chatMessageCellDelegate) {
                return null;
            }

            public static String $default$getProgressLoadingBotButtonUrl(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
                return null;
            }

            public static CharacterStyle $default$getProgressLoadingLink(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
                return null;
            }

            public static TextSelectionHelper.ChatListTextSelectionHelper $default$getTextSelectionHelper(ChatMessageCellDelegate chatMessageCellDelegate) {
                return null;
            }

            public static boolean $default$hasSelectedMessages(ChatMessageCellDelegate chatMessageCellDelegate) {
                return false;
            }

            public static void $default$invalidateBlur(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static boolean $default$isAdmin(ChatMessageCellDelegate chatMessageCellDelegate, long j) {
                return false;
            }

            public static boolean $default$isLandscape(ChatMessageCellDelegate chatMessageCellDelegate) {
                return false;
            }

            public static boolean $default$isOwner(ChatMessageCellDelegate chatMessageCellDelegate, long j) {
                return false;
            }

            public static boolean $default$isProgressLoading(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
                return false;
            }

            public static boolean $default$isReplyOrSelf(ChatMessageCellDelegate chatMessageCellDelegate) {
                return false;
            }

            public static boolean $default$keyboardIsOpened(ChatMessageCellDelegate chatMessageCellDelegate) {
                return false;
            }

            public static void $default$needOpenWebView(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
            }

            public static boolean $default$needPlayMessage(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z) {
                return false;
            }

            public static void $default$needReloadPolls(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static void $default$needShowPremiumBulletin(ChatMessageCellDelegate chatMessageCellDelegate, int i) {
            }

            public static boolean $default$onAccessibilityAction(ChatMessageCellDelegate chatMessageCellDelegate, int i, Bundle bundle) {
                return false;
            }

            public static void $default$onDiceFinished(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static boolean $default$openArticlePhoto(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                return false;
            }

            public static void $default$setShouldNotRepeatSticker(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
            }

            public static boolean $default$shouldDrawThreadProgress(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, boolean z) {
                return false;
            }

            public static boolean $default$shouldRepeatSticker(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
                return true;
            }

            public static void $default$videoTimerReached(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static boolean $default$doNotShowLoadingReply(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
                return messageObject != null && messageObject.getDialogId() == 1271266957;
            }
        }
    }

    private ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate != null) {
            return chatMessageCellDelegate.getDraftMessageMeasureController();
        }
        return null;
    }

    public class PollButton {
        public int animateHeight;
        private StaticLayout animateTitle;
        private AnimatedEmojiSpan.EmojiGroupedSpans animateTitleEmoji;
        public int animateY;
        public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmoji;
        private TLRPC.PollAnswer answer;
        private Text author;
        private AvatarDrawable avatarDrawable;
        private ImageReceiver avatarImageReceiver;
        private boolean chosen;
        private boolean correct;
        private int count;
        private float decimal;
        public int height;
        public boolean moveTitleByCounter;
        private int percent;
        private float percentProgress;
        public PollButtonDrawable pollButtonDrawable;
        private boolean prevChosen;
        private int prevPercent;
        private float prevPercentProgress;
        public Drawable selectorDrawable;
        public int selectorDrawableColor;
        private TLRPC.TodoItem task;
        public StaticLayout title;
        public float titleX;
        public float titleY;
        private boolean translated;
        public int x;
        public int y;

        public PollButton() {
        }

        static int access$2412(PollButton pollButton, int i) {
            int i2 = pollButton.percent + i;
            pollButton.percent = i2;
            return i2;
        }

        static float access$3224(PollButton pollButton, float f) {
            float f2 = pollButton.decimal - f;
            pollButton.decimal = f2;
            return f2;
        }

        public void attach() {
            ImageReceiver imageReceiver = this.avatarImageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onAttachedToWindow();
            }
            PollButtonDrawable pollButtonDrawable = this.pollButtonDrawable;
            if (pollButtonDrawable != null) {
                pollButtonDrawable.attach();
            }
        }

        public void detach() {
            ImageReceiver imageReceiver = this.avatarImageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
            }
            PollButtonDrawable pollButtonDrawable = this.pollButtonDrawable;
            if (pollButtonDrawable != null) {
                pollButtonDrawable.detach();
            }
        }

        public void destroy() {
            detach();
            AnimatedEmojiSpan.release(ChatMessageCell.this, this.animatedEmoji);
            this.animatedEmoji = null;
            AnimatedEmojiSpan.release(ChatMessageCell.this, this.animateTitleEmoji);
            this.animateTitleEmoji = null;
        }
    }

    private static class InstantViewButton {
        private ButtonBounce buttonBounce;
        private float buttonWidth;
        private StaticLayout layout;
        private final RectF rect;
        private Drawable selectorDrawable;
        private float textX;
        private int type;

        private InstantViewButton() {
            this.rect = new RectF();
        }

        static float access$4424(InstantViewButton instantViewButton, float f) {
            float f2 = instantViewButton.textX - f;
            instantViewButton.textX = f2;
            return f2;
        }
    }

    public boolean isCellAttachedToWindow() {
        return this.attachedToWindow;
    }

    public float getLastTouchX() {
        return this.lastTouchX;
    }

    public float getLastTouchY() {
        return this.lastTouchY;
    }

    class LoadingDrawableLocation {
        int blockNum;
        LoadingDrawable drawable;

        LoadingDrawableLocation() {
        }
    }

    public ChatMessageCell(Context context, int i) {
        this(context, i, false, null, null);
    }

    public ChatMessageCell(Context context, int i, boolean z, ChatMessageSharedResources chatMessageSharedResources, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.visibleOnScreen = true;
        this.postRunnableHolder = new PostRunnableHolder();
        this.isSponsoredMessageHidden = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.reactionsLayoutInBubble = new ReactionsLayoutInBubble(this);
        this.giveawayMessageCell = new GiveawayMessageCell(this);
        this.giveawayResultsMessageCell = new GiveawayResultsMessageCell(this);
        this.scrollRect = new Rect();
        this.firstVisibleRichBlock = -1;
        this.lastVisibleRichBlock = -1;
        this.pollPhotoImageRadius = new int[4];
        this.drawnContactButtonsFlag = 0;
        this.imageBackgroundGradientRotation = 45;
        this.selectorDrawable = new Drawable[2];
        this.selectorMaskDrawable = new MaskDrawable[2];
        this.selectorDrawableMaskType = new int[2];
        this.instantButtonRect = new RectF();
        this.pressedState = new int[]{16842910, 16842919};
        this.highlightCaptionToSetStart = -1;
        this.highlightCaptionToSetEnd = -1;
        this.deleteProgressRect = new RectF();
        this.rect = new RectF();
        this.foreverDrawableColor = -1;
        this.timeAlpha = 1.0f;
        this.actionAlpha = 1.0f;
        this.controlsAlpha = 1.0f;
        this.pressedBlock = -1;
        this.links = new LinkSpanDrawable.LinkCollector(this);
        this.urlPathCache = new ArrayList();
        this.urlPathSelection = new ArrayList();
        this.rectPath = new Path();
        this.oldPollButtons = new ArrayList();
        this.pollButtons = new ArrayList();
        this.firstVisiblePollButton = -1;
        this.lastVisiblePollButton = -1;
        this.reactionsVisible = true;
        this.pollMediaPressedIndex = -1;
        this.botButtons = new ArrayList();
        this.botButtonPath = new Path();
        this.botButtonRadii = new float[8];
        this.botButtonsByData = new HashMap();
        this.botButtonsByPosition = new HashMap();
        this.doNotDrawTaskId = -1;
        this.isCheckPressed = true;
        this.drawBackground = true;
        this.backgroundWidth = 100;
        this.commentButtonRect = new Rect();
        this.spoilersPatchedReplyTextLayout = new AtomicReference();
        this.adminLayoutRect = new RectF();
        this.forwardedNameLayout = new StaticLayout[2];
        this.forwardNameOffsetX = new float[2];
        this.drawTime = true;
        this.mediaSpoilerPath = new Path();
        this.mediaSpoilerRadii = new float[8];
        this.unlockAlpha = 1.0f;
        this.unlockSpoilerPath = new Path();
        this.unlockSpoilerRadii = new float[8];
        this.replySelectorRect = new RectF();
        this.summarySelectorRect = new RectF();
        this.ALPHA_PROPERTY_WORKAROUND = Build.VERSION.SDK_INT == 28;
        this.alphaInternal = 1.0f;
        this.transitionParams = new TransitionParams();
        this.roundVideoPlayPipFloat = new AnimatedFloat(this, 200L, CubicBezierInterpolator.EASE_OUT);
        this.diceFinishCallback = new Runnable() {
            @Override
            public void run() {
                if (ChatMessageCell.this.delegate != null) {
                    ChatMessageCell.this.delegate.onDiceFinished();
                }
            }
        };
        this.invalidateRunnable = new Runnable() {
            @Override
            public void run() {
                ChatMessageCell.this.checkLocationExpired();
                if (ChatMessageCell.this.locationExpired) {
                    ChatMessageCell.this.invalidate();
                    ChatMessageCell.this.scheduledInvalidate = false;
                    return;
                }
                ChatMessageCell.this.invalidate(((int) r0.rect.left) - 5, ((int) ChatMessageCell.this.rect.top) - 5, ((int) ChatMessageCell.this.rect.right) + 5, ((int) ChatMessageCell.this.rect.bottom) + 5);
                if (ChatMessageCell.this.scheduledInvalidate) {
                    AndroidUtilities.runOnUIThread(ChatMessageCell.this.invalidateRunnable, 1000L);
                }
            }
        };
        this.accessibilityVirtualViewBounds = new SparseArray();
        this.currentFocusedVirtualView = -1;
        this.backgroundCacheParams = new MessageDrawable.PathDrawParams();
        this.replySpoilers = new ArrayList();
        this.replySpoilersPool = new Stack();
        this.sPath = new Path();
        this.scheduleUpdateRelativeDatesRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.scheduleUpdateRelativeDates();
            }
        };
        this.doUpdateRelativeDatesRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.doUpdateRelativeDates();
            }
        };
        this.pressedEffect = false;
        this.overridenDuration = -1L;
        this.hadLongPress = false;
        this.invalidateOutboundsRunnable = new ChatMessageCell$$ExternalSyntheticLambda7(this);
        this.showTopicSeparator = true;
        this.radialProgressAlpha = 1.0f;
        this.ANIMATION_OFFSET_X = new Property(Float.class, "animationOffsetX") {
            @Override
            public Float get(ChatMessageCell chatMessageCell) {
                return Float.valueOf(chatMessageCell.animationOffsetX);
            }

            @Override
            public void set(ChatMessageCell chatMessageCell, Float f) {
                chatMessageCell.setAnimationOffsetX(f.floatValue());
            }
        };
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        this.canDrawBackgroundInParent = z;
        this.sharedResources = chatMessageSharedResources;
        if (chatMessageSharedResources == null) {
            this.sharedResources = new ChatMessageSharedResources(context);
        }
        setClipChildren(false);
        setClipToPadding(false);
        this.backgroundDrawable = new MessageBackgroundDrawable(this);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.avatarImage = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        this.avatarImage.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.avatarDrawable = new AvatarDrawable();
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.replyImageReceiver = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        this.replyImageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.locationImageReceiver = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        this.locationImageReceiver.setRoundRadius(AndroidUtilities.dp(26.1f));
        this.TAG = DownloadController.getInstance(i).generateObserverTag();
        this.contactAvatarDrawable = new AvatarDrawable();
        ImageReceiver imageReceiver4 = new ImageReceiver(this) {
            @Override
            public void setRoundRadius(int[] iArr) {
                super.setRoundRadius(iArr);
                ChatMessageCell.this.pollPhotoImageRadius[0] = iArr[0];
                ChatMessageCell.this.pollPhotoImageRadius[1] = iArr[1];
                int[] iArr2 = ChatMessageCell.this.pollPhotoImageRadius;
                int[] iArr3 = ChatMessageCell.this.pollPhotoImageRadius;
                int iDp = AndroidUtilities.dp(6.0f);
                iArr3[3] = iDp;
                iArr2[2] = iDp;
                if (ChatMessageCell.this.pollContentDrawable != null) {
                    ChatMessageCell.this.pollContentDrawable.imageReceiver.setRoundRadius(ChatMessageCell.this.pollPhotoImageRadius);
                }
            }
        };
        this.photoImage = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        this.photoImage.setUseRoundForThumbDrawable(true);
        this.photoImage.setDelegate(this);
        ImageReceiver imageReceiver5 = new ImageReceiver(this);
        this.blurredPhotoImage = imageReceiver5;
        imageReceiver5.setAllowLoadingOnAttachedOnly(true);
        this.blurredPhotoImage.setUseRoundForThumbDrawable(true);
        this.radialProgress = new RadialProgress2(this, resourcesProvider);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, resourcesProvider);
        this.videoRadialProgress = radialProgress2;
        radialProgress2.setDrawBackground(false);
        this.videoRadialProgress.setCircleRadius(AndroidUtilities.dp(15.0f));
        SeekBar seekBar = new SeekBar(this) {
            @Override
            protected void onTimestampUpdate(URLSpanNoUnderline uRLSpanNoUnderline) {
                ChatMessageCell.this.setHighlightedSpan(uRLSpanNoUnderline);
            }
        };
        this.seekBar = seekBar;
        seekBar.setDelegate(this);
        SeekBarWaveform seekBarWaveform = new SeekBarWaveform(context);
        this.seekBarWaveform = seekBarWaveform;
        seekBarWaveform.setDelegate(this);
        this.seekBarWaveform.setParentView(this);
        this.seekBarAccessibilityDelegate = new FloatSeekBarAccessibilityDelegate() {
            @Override
            public float getProgress() {
                if (ChatMessageCell.this.currentMessageObject.isMusic()) {
                    return ChatMessageCell.this.seekBar.getProgress();
                }
                if (ChatMessageCell.this.currentMessageObject.isVoice()) {
                    return ChatMessageCell.this.useSeekBarWaveform ? ChatMessageCell.this.seekBarWaveform.getProgress() : ChatMessageCell.this.seekBar.getProgress();
                }
                if (ChatMessageCell.this.currentMessageObject.isRoundVideo()) {
                    return ChatMessageCell.this.currentMessageObject.audioProgress;
                }
                return 0.0f;
            }

            @Override
            public void setProgress(float f) {
                if (ChatMessageCell.this.currentMessageObject.isMusic()) {
                    ChatMessageCell.this.seekBar.setProgress(f);
                } else if (ChatMessageCell.this.currentMessageObject.isVoice()) {
                    if (ChatMessageCell.this.useSeekBarWaveform) {
                        ChatMessageCell.this.seekBarWaveform.setProgress(f);
                    } else {
                        ChatMessageCell.this.seekBar.setProgress(f);
                    }
                } else {
                    if (!ChatMessageCell.this.currentMessageObject.isRoundVideo()) {
                        return;
                    }
                    if (ChatMessageCell.this.useSeekBarWaveform) {
                        if (ChatMessageCell.this.seekBarWaveform != null) {
                            ChatMessageCell.this.seekBarWaveform.setProgress(f);
                        }
                    } else if (ChatMessageCell.this.seekBar != null) {
                        ChatMessageCell.this.seekBar.setProgress(f);
                    }
                    ChatMessageCell.this.currentMessageObject.audioProgress = f;
                }
                ChatMessageCell.this.onSeekBarDrag(f);
                ChatMessageCell.this.invalidate();
            }
        };
        this.roundVideoPlayingDrawable = new RoundVideoPlayingDrawable(this, resourcesProvider);
        setImportantForAccessibility(1);
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (radialProgress2 != null) {
            radialProgress2.setResourcesProvider(resourcesProvider);
        }
        RadialProgress2 radialProgress22 = this.videoRadialProgress;
        if (radialProgress22 != null) {
            radialProgress22.setResourcesProvider(resourcesProvider);
        }
        RoundVideoPlayingDrawable roundVideoPlayingDrawable = this.roundVideoPlayingDrawable;
        if (roundVideoPlayingDrawable != null) {
            roundVideoPlayingDrawable.setResourcesProvider(resourcesProvider);
        }
    }

    public Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    private void createPollUI(int i) {
        CheckBoxBase[] checkBoxBaseArr = this.pollCheckBox;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i) {
            if (checkBoxBaseArr != null) {
                int i2 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = this.pollCheckBox;
                    if (i2 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i2].onDetachedFromWindow();
                    i2++;
                }
            }
            this.pollCheckBox = new CheckBoxBase[i];
            int i3 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = this.pollCheckBox;
                if (i3 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i3] = new CheckBoxBase(this, 20, this.resourcesProvider);
                this.pollCheckBox[i3].setDrawUnchecked(false);
                this.pollCheckBox[i3].setCuttingCheck(true);
                this.pollCheckBox[i3].setBackgroundType(9);
                i3++;
            }
        }
        if (this.pollRecentVotersDrawable == null) {
            this.pollRecentVotersDrawable = new AvatarsListDrawable(this.currentAccount, this, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dpf2(1.0f));
        }
    }

    private void createCommentUI() {
        if (this.commentAvatarImages != null) {
            return;
        }
        this.commentAvatarImages = new ImageReceiver[3];
        this.commentAvatarDrawables = new AvatarDrawable[3];
        this.commentAvatarImagesVisible = new boolean[3];
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.commentAvatarImages;
            if (i >= imageReceiverArr.length) {
                return;
            }
            imageReceiverArr[i] = new ImageReceiver(this);
            this.commentAvatarImages[i].setRoundRadius(AndroidUtilities.dp(12.0f));
            this.commentAvatarDrawables[i] = new AvatarDrawable();
            this.commentAvatarDrawables[i].setTextSize(AndroidUtilities.dp(18.0f));
            i++;
        }
    }

    public void resetPressedLink(int i) {
        if (i != -1) {
            this.links.removeLinks(Integer.valueOf(i));
        } else {
            this.links.clear();
        }
        LinkSpanDrawable.LinkCollector linkCollector = this.factCheckLinks;
        if (linkCollector != null) {
            linkCollector.clear();
        }
        this.pressedEmoji = null;
        this.pressedFactCheckLink = null;
        if (this.pressedLink != null) {
            if (this.pressedLinkType == i || i == -1) {
                this.pressedLink = null;
                this.pressedLinkType = -1;
                this.touchedByExpanation = false;
                this.touchedByCaption = false;
                invalidate();
            }
        }
    }

    private void resetUrlPaths() {
        if (this.quoteHighlight != null) {
            this.quoteHighlight = null;
        }
        if (this.urlPathSelection.isEmpty()) {
            return;
        }
        this.urlPathCache.addAll(this.urlPathSelection);
        this.urlPathSelection.clear();
    }

    private LinkPath obtainNewUrlPath() {
        LinkPath linkPath;
        if (!this.urlPathCache.isEmpty()) {
            linkPath = (LinkPath) this.urlPathCache.get(0);
            this.urlPathCache.remove(0);
        } else {
            linkPath = new LinkPath(true);
        }
        linkPath.reset();
        this.urlPathSelection.add(linkPath);
        return linkPath;
    }

    public int[] getRealSpanStartAndEnd(Spannable spannable, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        boolean z;
        TextStyleSpan.TextStyleRun style;
        TLRPC.MessageEntity messageEntity;
        if (!(characterStyle instanceof URLSpanBrowser) || (style = ((URLSpanBrowser) characterStyle).getStyle()) == null || (messageEntity = style.urlEntity) == null) {
            spanStart = 0;
            spanEnd = 0;
            z = false;
        } else {
            spanStart = messageEntity.offset;
            spanEnd = messageEntity.length + spanStart;
            z = true;
        }
        if (!z) {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        return new int[]{spanStart, spanEnd};
    }

    private boolean checkQuickShareMotionEvent(MotionEvent motionEvent) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (!this.inQuickShareMode) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            if (action == 2 && (chatMessageCellDelegate = this.delegate) != null) {
                chatMessageCellDelegate.didQuickShareMove(this, getEventX(motionEvent), getEventY(motionEvent));
            }
            return true;
        }
        this.inQuickShareMode = false;
        ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
        if (chatMessageCellDelegate2 != null) {
            chatMessageCellDelegate2.didQuickShareEnd(this, getEventX(motionEvent), getEventY(motionEvent));
        }
        return true;
    }

    private boolean checkAdminMotionEvent(MotionEvent motionEvent) {
        RectF rectF;
        ChatMessageCellDelegate chatMessageCellDelegate;
        Drawable drawable;
        boolean z = false;
        if (this.adminLayout == null || (rectF = this.boostCounterBounds) == null || (this.currentUser == null && this.currentChat == null)) {
            this.boostCounterPressed = false;
            return false;
        }
        boolean zContains = rectF.contains((int) getEventX(motionEvent), (int) getEventY(motionEvent));
        if (motionEvent.getAction() == 0) {
            SpannableString spannableString = new SpannableString(this.adminLayout.getText());
            BoostCounterSpan[] boostCounterSpanArr = (BoostCounterSpan[]) spannableString.getSpans(0, spannableString.length(), BoostCounterSpan.class);
            if (zContains && boostCounterSpanArr != null && boostCounterSpanArr.length > 0) {
                z = true;
            }
            this.boostCounterPressed = z;
            if (z && (drawable = this.boostCounterLayoutSelector) != null) {
                drawable.setHotspot((int) getEventX(motionEvent), (int) getEventY(motionEvent));
                this.boostCounterLayoutSelector.setState(this.pressedState);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.boostCounterPressed && (chatMessageCellDelegate = this.delegate) != null) {
                chatMessageCellDelegate.didPressBoostCounter(this);
            }
            Drawable drawable2 = this.boostCounterLayoutSelector;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
            }
            this.boostCounterPressed = false;
        }
        return this.boostCounterPressed;
    }

    public CharSequence getAdminAccessibilityText() {
        StaticLayout staticLayout = this.adminLayout;
        if (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.adminLayout.getText());
        BoostCounterSpan[] boostCounterSpanArr = (BoostCounterSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), BoostCounterSpan.class);
        for (int length = boostCounterSpanArr.length - 1; length >= 0; length--) {
            int spanStart = spannableStringBuilder.getSpanStart(boostCounterSpanArr[length]);
            int spanEnd = spannableStringBuilder.getSpanEnd(boostCounterSpanArr[length]);
            if (spanStart >= 0 && spanEnd >= spanStart) {
                spannableStringBuilder.delete(spanStart, spanEnd);
            }
        }
        String strTrim = spannableStringBuilder.toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return null;
        }
        return strTrim;
    }

    private boolean checkNameMotionEvent(MotionEvent motionEvent) {
        Drawable drawable;
        ChatMessageCellDelegate chatMessageCellDelegate;
        TLRPC.Chat chat;
        int i;
        if (!this.drawNameLayout || this.nameLayout == null || (drawable = this.nameLayoutSelector) == null || (this.currentUser == null && this.currentChat == null)) {
            this.nameLayoutPressed = false;
            return false;
        }
        boolean zContains = drawable.getBounds().contains((int) getEventX(motionEvent), (int) getEventY(motionEvent));
        if (motionEvent.getAction() == 0) {
            this.nameLayoutPressed = zContains;
            if (zContains) {
                this.nameLayoutSelector.setHotspot((int) getEventX(motionEvent), (int) getEventY(motionEvent));
                this.nameLayoutSelector.setState(this.pressedState);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.nameLayoutPressed && (chatMessageCellDelegate = this.delegate) != null) {
                if (this.viaOnly) {
                    TLRPC.User user = this.currentViaBotUser;
                    if (user != null && user.bot_inline_placeholder == null) {
                        chatMessageCellDelegate.didPressViaBotNotInline(this, user.id);
                    } else {
                        String publicUsername = UserObject.getPublicUsername(user);
                        ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
                        if (publicUsername == null) {
                            publicUsername = this.currentMessageObject.messageOwner.via_bot_name;
                        }
                        chatMessageCellDelegate2.didPressViaBot(this, publicUsername);
                    }
                } else {
                    TLRPC.User user2 = this.currentUser;
                    if (user2 != null) {
                        chatMessageCellDelegate.didPressUserAvatar(this, user2, getEventX(motionEvent), getEventY(motionEvent), false);
                    } else {
                        TLRPC.Chat chat2 = this.currentChat;
                        if (chat2 != null) {
                            TLRPC.MessageFwdHeader messageFwdHeader = this.currentMessageObject.messageOwner.fwd_from;
                            if (messageFwdHeader != null) {
                                int i2 = messageFwdHeader.channel_post;
                                chat = this.currentForwardChannel;
                                i = i2;
                            } else {
                                chat = chat2;
                                i = 0;
                            }
                            chatMessageCellDelegate.didPressChannelAvatar(this, chat != null ? chat : chat2, i, this.lastTouchX, this.lastTouchY, false);
                        }
                    }
                }
            }
            this.nameLayoutSelector.setState(StateSet.NOTHING);
            this.nameLayoutPressed = false;
        }
        return this.nameLayoutPressed;
    }

    private boolean checkNameStatusMotionEvent(MotionEvent motionEvent) {
        if (!this.drawNameLayout || this.nameLayout == null || this.nameLayoutSelector == null || ((this.currentUser == null && this.currentChat == null) || this.currentNameStatus == null || this.currentNameStatusDrawable == null)) {
            this.nameStatusPressed = false;
            return false;
        }
        boolean zContains = this.nameStatusSelector.getBounds().contains((int) getEventX(motionEvent), (int) getEventY(motionEvent));
        if (motionEvent.getAction() == 0) {
            this.nameStatusPressed = zContains;
            if (zContains) {
                this.nameStatusSelector.setHotspot((int) getEventX(motionEvent), (int) getEventY(motionEvent));
                this.nameStatusSelector.setState(this.pressedState);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.nameStatusPressed && this.delegate != null && this.currentUser != null) {
                this.delegate.didPressUserStatus(this, this.currentUser, this.currentNameStatusDrawable.getDrawable() instanceof AnimatedEmojiDrawable ? ((AnimatedEmojiDrawable) this.currentNameStatusDrawable.getDrawable()).getDocument() : null, this.nameStatusSlug);
                invalidateOutbounds();
            }
            this.nameStatusSelector.setState(StateSet.NOTHING);
            this.nameStatusPressed = false;
        }
        return this.nameStatusPressed;
    }

    public void doUpdateRelativeDates() {
        this.postRunnableHolder.cancel(this.scheduleUpdateRelativeDatesRunnable);
        this.postRunnableHolder.cancel(this.doUpdateRelativeDatesRunnable);
        scheduleUpdateRelativeDates();
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.generateLayout(null);
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2.caption != null) {
            messageObject2.caption = null;
            messageObject2.generateCaption();
        }
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate != null) {
            chatMessageCellDelegate.forceUpdateNoAnimation(this, true);
        }
    }

    public void scheduleUpdateRelativeDates() {
        ArrayList allRelativeDates;
        long j;
        long j2;
        long j3;
        this.postRunnableHolder.cancel(this.scheduleUpdateRelativeDatesRunnable);
        this.postRunnableHolder.cancel(this.doUpdateRelativeDatesRunnable);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? this.currentMessageObject.caption : this.currentMessageObject.messageText;
        if (TextUtils.isEmpty(charSequence) || (allRelativeDates = FormattedDateSpan.getAllRelativeDates(charSequence)) == null || allRelativeDates.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = allRelativeDates.iterator();
        long j4 = Long.MAX_VALUE;
        long j5 = 0;
        while (it.hasNext()) {
            long jIntValue = ((Integer) it.next()).intValue() * 1000;
            long jAbs = Math.abs(jIntValue - jCurrentTimeMillis);
            if (jAbs < j4) {
                j4 = jAbs;
                j5 = jIntValue;
            }
        }
        long j6 = jCurrentTimeMillis - j5;
        if (j4 < 63000) {
            j = j6 > 0 ? 1000 - (j6 % 1000) : (-j6) % 1000;
        } else if (j4 < 3780000) {
            j2 = 60000;
            if (j6 > 0) {
                j3 = j6 % 60000;
                j = j2 - j3;
            } else {
                j = (-j6) % 60000;
            }
        } else if (j4 < 90720000) {
            j2 = 3600000;
            if (j6 > 0) {
                j3 = j6 % 3600000;
                j = j2 - j3;
            } else {
                j = (-j6) % 3600000;
            }
        } else {
            j = -1;
        }
        if (j > 0) {
            this.postRunnableHolder.post(this.doUpdateRelativeDatesRunnable, j + 100);
        }
    }

    private void resetCodeSelectors() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.textLayoutBlocks != null) {
            for (int i = 0; i < this.currentMessageObject.textLayoutBlocks.size(); i++) {
                MessageObject.TextLayoutBlock textLayoutBlock = this.currentMessageObject.textLayoutBlocks.get(i);
                Drawable drawable = textLayoutBlock.copySelector;
                if (drawable != null) {
                    drawable.setCallback(this);
                    textLayoutBlock.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
        if (this.captionLayout != null) {
            for (int i2 = 0; i2 < this.captionLayout.textLayoutBlocks.size(); i2++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = this.captionLayout.textLayoutBlocks.get(i2);
                Drawable drawable2 = textLayoutBlock2.copySelector;
                if (drawable2 != null) {
                    drawable2.setCallback(this);
                    textLayoutBlock2.copySelector.setState(StateSet.NOTHING);
                }
            }
        }
    }

    private boolean checkRichLayoutMotionEvent(MotionEvent motionEvent) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.richLayout == null || messageObject.type != 36) {
            return false;
        }
        motionEvent.offsetLocation(-this.textX, -this.textY);
        this.currentMessageObject.richLayout.setChatMessageCellDelegate(this, this.delegate);
        boolean zOnTouchEvent = this.currentMessageObject.richLayout.onTouchEvent(motionEvent);
        motionEvent.offsetLocation(this.textX, this.textY);
        return zOnTouchEvent;
    }

    private boolean checkTextBlockMotionEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkTextBlockMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkCaptionMotionEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkCaptionMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkExplanationMotionEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkExplanationMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkGameMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (!this.hasGamePreview) {
            return false;
        }
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        if (motionEvent.getAction() == 0) {
            if (this.drawPhotoImage && this.drawImageButton && this.buttonState != -1 && eventX >= (i = this.buttonX) && eventX <= i + AndroidUtilities.dp(48.0f) && eventY >= (i2 = this.buttonY) && eventY <= i2 + AndroidUtilities.dp(48.0f) && this.radialProgress.getIcon() != 4) {
                this.buttonPressed = 1;
                invalidate();
                return true;
            }
            if (this.drawPhotoImage && this.photoImage.isInsideImage(eventX, eventY)) {
                this.gamePreviewPressed = true;
                return true;
            }
            if (this.descriptionLayout != null && eventY >= this.descriptionY) {
                try {
                    int iDp = eventX - ((this.unmovedTextX + AndroidUtilities.dp(10.0f)) + this.descriptionX);
                    int i3 = eventY - this.descriptionY;
                    int lineForVertical = this.descriptionLayout.getLineForVertical(i3);
                    float f = iDp;
                    int offsetForHorizontal = this.descriptionLayout.getOffsetForHorizontal(lineForVertical, f);
                    float lineLeft = this.descriptionLayout.getLineLeft(lineForVertical);
                    if (lineLeft <= f && lineLeft + this.descriptionLayout.getLineWidth(lineForVertical) >= f) {
                        Spannable spannable = (Spannable) this.currentMessageObject.linkDescription;
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof URLSpanBotCommand) || URLSpanBotCommand.enabled) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                            LinkSpanDrawable linkSpanDrawable = this.pressedLink;
                            if (linkSpanDrawable == null || linkSpanDrawable.getSpan() != clickableSpanArr[0]) {
                                this.links.removeLink(this.pressedLink);
                                ClickableSpan clickableSpan = clickableSpanArr[0];
                                LinkSpanDrawable linkSpanDrawable2 = new LinkSpanDrawable(clickableSpan, this.resourcesProvider, f, i3, spanSupportsLongPress(clickableSpan));
                                this.pressedLink = linkSpanDrawable2;
                                linkSpanDrawable2.setColor(getThemedColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outLinkSelectBackground : Theme.key_chat_linkSelectBackground));
                                this.linkBlockNum = -10;
                                this.pressedLinkType = 2;
                                try {
                                    LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                                    int[] realSpanStartAndEnd = getRealSpanStartAndEnd(spannable, this.pressedLink.getSpan());
                                    linkPathObtainNewPath.setCurrentLayout(this.descriptionLayout, realSpanStartAndEnd[0], 0.0f);
                                    this.descriptionLayout.getSelectionPath(realSpanStartAndEnd[0], realSpanStartAndEnd[1], linkPathObtainNewPath);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                this.links.addLink(this.pressedLink, 2);
                            }
                            invalidate();
                            return true;
                        }
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.pressedLinkType == 2 || this.gamePreviewPressed || this.buttonPressed != 0) {
                if (this.buttonPressed != 0) {
                    this.buttonPressed = 0;
                    playSoundEffect(0);
                    didPressButton(true, false);
                    invalidate();
                } else {
                    LinkSpanDrawable linkSpanDrawable3 = this.pressedLink;
                    if (linkSpanDrawable3 != null) {
                        if (linkSpanDrawable3.getSpan() instanceof URLSpan) {
                            Browser.openUrl(getContext(), ((URLSpan) this.pressedLink.getSpan()).getURL());
                        } else if (this.pressedLink.getSpan() instanceof ClickableSpan) {
                            ((ClickableSpan) this.pressedLink.getSpan()).onClick(this);
                        }
                        resetPressedLink(2);
                    } else {
                        this.gamePreviewPressed = false;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= this.botButtons.size()) {
                                break;
                            }
                            BotButton botButton = (BotButton) this.botButtons.get(i4);
                            if (TLKeyboardHelper.isType(botButton.button, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                playSoundEffect(0);
                                this.delegate.didPressBotButton(this, botButton.button);
                                invalidate();
                                break;
                            }
                            i4++;
                        }
                        resetPressedLink(2);
                        return true;
                    }
                }
            } else {
                resetPressedLink(2);
            }
        }
        return false;
    }

    private boolean checkTranscribeButtonMotionEvent(MotionEvent motionEvent) {
        TranscribeButton transcribeButton;
        return this.useTranscribeButton && (!this.isPlayingRound || getVideoTranscriptionProgress() > 0.0f || this.wasTranscriptionOpen) && (transcribeButton = this.transcribeButton) != null && transcribeButton.onTouch(motionEvent.getAction(), getEventX(motionEvent), getEventY(motionEvent));
    }

    private boolean checkLinkPreviewMotionEvent(MotionEvent motionEvent) throws Resources.NotFoundException, NumberFormatException {
        int i;
        MessageObject messageObject;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        int i2;
        int i3;
        int i4;
        int i5;
        int iDp;
        int iDp2;
        int i6;
        int themedColor;
        MessageObject messageObject2;
        int i7 = this.currentMessageObject.type;
        if ((i7 != 0 && i7 != 24) || !this.hasLinkPreview) {
            return false;
        }
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        int i8 = this.unmovedTextX;
        if (eventX >= i8 && eventX <= (i8 + this.backgroundWidth) - AndroidUtilities.dp(14.0f) && eventY >= (i = this.linkPreviewY)) {
            if (eventY <= i + this.linkPreviewHeight + AndroidUtilities.dp((this.drawInstantView ? 46 : 0) + 8)) {
                if (motionEvent.getAction() == 0) {
                    if (this.descriptionLayout != null && eventY >= this.descriptionY && !this.currentMessageObject.preview) {
                        try {
                            int iDp3 = eventX - ((this.unmovedTextX + AndroidUtilities.dp(10.0f)) + this.descriptionX);
                            int i9 = eventY - this.descriptionY;
                            if (i9 <= this.descriptionLayout.getHeight()) {
                                int lineForVertical = this.descriptionLayout.getLineForVertical(i9);
                                float f = iDp3;
                                int offsetForHorizontal = this.descriptionLayout.getOffsetForHorizontal(lineForVertical, f);
                                float lineLeft = this.descriptionLayout.getLineLeft(lineForVertical);
                                if (lineLeft <= f && lineLeft + this.descriptionLayout.getLineWidth(lineForVertical) >= f) {
                                    Spannable spannable = (Spannable) (this.currentMessageObject.isSponsored() ? this.currentMessageObject.messageText : this.currentMessageObject.linkDescription);
                                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                    if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[0] instanceof URLSpanBotCommand) || URLSpanBotCommand.enabled) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                                        LinkSpanDrawable linkSpanDrawable = this.pressedLink;
                                        if (linkSpanDrawable == null || linkSpanDrawable.getSpan() != clickableSpanArr[0]) {
                                            this.links.removeLink(this.pressedLink);
                                            ClickableSpan clickableSpan = clickableSpanArr[0];
                                            LinkSpanDrawable linkSpanDrawable2 = new LinkSpanDrawable(clickableSpan, this.resourcesProvider, eventX, eventY, spanSupportsLongPress(clickableSpan));
                                            this.pressedLink = linkSpanDrawable2;
                                            if (!this.hasLinkPreview || this.linkLine == null || (messageObject2 = this.currentMessageObject) == null || messageObject2.isOutOwner()) {
                                                themedColor = getThemedColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outLinkSelectBackground : Theme.key_chat_linkSelectBackground);
                                            } else {
                                                themedColor = Theme.multAlpha(this.linkLine.getColor(), 0.1f);
                                            }
                                            linkSpanDrawable2.setColor(themedColor);
                                            this.linkBlockNum = -10;
                                            this.pressedLinkType = 2;
                                            startCheckLongPress();
                                            try {
                                                LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                                                int[] realSpanStartAndEnd = getRealSpanStartAndEnd(spannable, this.pressedLink.getSpan());
                                                linkPathObtainNewPath.setCurrentLayout(this.descriptionLayout, realSpanStartAndEnd[0], 0.0f);
                                                this.descriptionLayout.getSelectionPath(realSpanStartAndEnd[0], realSpanStartAndEnd[1], linkPathObtainNewPath);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            this.links.addLink(this.pressedLink, 2);
                                        }
                                        invalidate();
                                        return true;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                    }
                    if (this.pressedLink == null) {
                        int iDp4 = AndroidUtilities.dp(48.0f);
                        if (this.miniButtonState >= 0 && eventX >= (iDp2 = this.buttonX + (iDp = AndroidUtilities.dp(27.0f))) && eventX <= iDp2 + iDp4 && eventY >= (i6 = this.buttonY + iDp) && eventY <= i6 + iDp4) {
                            this.miniButtonPressed = 1;
                            invalidate();
                            return true;
                        }
                        if (this.drawVideoImageButton && this.buttonState != -1 && eventX >= (i4 = this.videoButtonX) && eventX <= i4 + AndroidUtilities.dp(34.0f) + Math.max(this.infoWidth, this.docTitleWidth) && eventY >= (i5 = this.videoButtonY) && eventY <= i5 + AndroidUtilities.dp(30.0f)) {
                            this.videoButtonPressed = 1;
                            invalidate();
                            return true;
                        }
                        if ((this.drawPhotoImage && this.currentMessageObject.sponsoredMedia != null && this.photoImage.isInsideImage(eventX, eventY)) || (this.drawPhotoImage && this.drawImageButton && ((this.buttonState != -1 || this.documentAttachType == 4) && ((!this.checkOnlyButtonPressed && this.photoImage.isInsideImage(eventX, eventY)) || (eventX >= (i2 = this.buttonX) && eventX <= i2 + AndroidUtilities.dp(48.0f) && eventY >= (i3 = this.buttonY) && eventY <= i3 + AndroidUtilities.dp(48.0f) && this.radialProgress.getIcon() != 4))))) {
                            this.buttonPressed = 1;
                            invalidate();
                            TLRPC.MessageMedia messageMedia = this.currentMessageObject.sponsoredMedia;
                            if (messageMedia != null && (MessageObject.isGifDocument(messageMedia.document) || this.currentMessageObject.sponsoredMedia.photo != null)) {
                                Drawable drawable = this.selectorDrawable[0];
                                if (drawable != null && drawable.getBounds().contains(eventX, eventY)) {
                                    this.selectorDrawable[0].setHotspot(eventX, eventY);
                                    this.selectorDrawable[0].setState(this.pressedState);
                                }
                                Drawable drawable2 = this.linkPreviewSelector;
                                if (drawable2 != null && drawable2.getBounds().contains(eventX, eventY)) {
                                    this.linkPreviewSelector.setHotspot(eventX, eventY);
                                    this.linkPreviewSelector.setState(this.pressedState);
                                }
                                setInstantButtonPressed(true);
                                ButtonBounce buttonBounce = this.linkPreviewBounce;
                                if (buttonBounce != null) {
                                    buttonBounce.setPressed(true);
                                }
                            }
                            return true;
                        }
                        this.instantPressed = true;
                        this.selectorDrawableMaskType[0] = 0;
                        Drawable drawable3 = this.selectorDrawable[0];
                        if (drawable3 != null && drawable3.getBounds().contains(eventX, eventY)) {
                            this.selectorDrawable[0].setHotspot(eventX, eventY);
                            this.selectorDrawable[0].setState(this.pressedState);
                        }
                        Drawable drawable4 = this.linkPreviewSelector;
                        if (drawable4 != null && drawable4.getBounds().contains(eventX, eventY)) {
                            this.linkPreviewSelector.setHotspot(eventX, eventY);
                            this.linkPreviewSelector.setState(this.pressedState);
                        }
                        setInstantButtonPressed(true);
                        ButtonBounce buttonBounce2 = this.linkPreviewBounce;
                        if (buttonBounce2 != null) {
                            buttonBounce2.setPressed(true);
                        }
                        invalidate();
                        return true;
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.instantPressed) {
                        int i10 = this.documentAttachType;
                        if (i10 == 7) {
                            if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) {
                                this.delegate.needPlayMessage(this, this.currentMessageObject, false);
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject);
                            }
                        } else if (this.drawInstantView || ((messageObject = this.currentMessageObject) != null && (tL_channelAdminLogEvent = messageObject.currentEvent) != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage))) {
                            ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                            if (chatMessageCellDelegate != null) {
                                chatMessageCellDelegate.didPressInstantButton(this, this.drawInstantViewType);
                            }
                        } else if (this.drawPhotoImage && (i10 == 2 || i10 == 4 || (this.authorLayout == null && this.titleLayout == null && this.descriptionLayout == null && this.siteNameLayout == null))) {
                            ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
                            if (chatMessageCellDelegate2 != null) {
                                chatMessageCellDelegate2.didPressImage(this, this.lastTouchX, this.lastTouchY, true);
                            }
                        } else if (messageObject != null && !messageObject.preview) {
                            TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner).webpage;
                            if (webPage != null && !TextUtils.isEmpty(webPage.embed_url)) {
                                ChatMessageCellDelegate chatMessageCellDelegate3 = this.delegate;
                                if (chatMessageCellDelegate3 != null) {
                                    chatMessageCellDelegate3.needOpenWebView(this.currentMessageObject, webPage.embed_url, webPage.site_name, webPage.title, webPage.url, webPage.embed_width, webPage.embed_height);
                                }
                            } else if (webPage != null) {
                                ChatMessageCellDelegate chatMessageCellDelegate4 = this.delegate;
                                if (chatMessageCellDelegate4 != null) {
                                    chatMessageCellDelegate4.didPressWebPage(this, webPage, webPage.url, MessageObject.getMedia(this.currentMessageObject.messageOwner).safe);
                                } else {
                                    Browser.openUrl(getContext(), webPage.url);
                                }
                            }
                        }
                        playSoundEffect(0);
                        Drawable drawable5 = this.selectorDrawable[0];
                        if (drawable5 != null) {
                            drawable5.setState(StateSet.NOTHING);
                        }
                        Drawable drawable6 = this.linkPreviewSelector;
                        if (drawable6 != null) {
                            drawable6.setState(StateSet.NOTHING);
                        }
                        ButtonBounce buttonBounce3 = this.linkPreviewBounce;
                        if (buttonBounce3 != null) {
                            buttonBounce3.setPressed(false);
                        }
                        this.instantPressed = false;
                        setInstantButtonPressed(false);
                        invalidate();
                    } else if (this.pressedLinkType == 2 || this.buttonPressed != 0 || this.miniButtonPressed != 0 || this.videoButtonPressed != 0 || this.linkPreviewPressed) {
                        if (this.videoButtonPressed == 1) {
                            this.videoButtonPressed = 0;
                            playSoundEffect(0);
                            didPressButton(true, true);
                            invalidate();
                        } else if (this.buttonPressed != 0) {
                            this.buttonPressed = 0;
                            playSoundEffect(0);
                            if (this.drawVideoImageButton || ((this.buttonState == -1 && this.documentAttachType == 4) || this.currentMessageObject.sponsoredMedia != null)) {
                                didClickedImage();
                            } else {
                                didPressButton(true, false);
                            }
                            invalidate();
                        } else if (this.miniButtonPressed != 0) {
                            this.miniButtonPressed = 0;
                            playSoundEffect(0);
                            didPressMiniButton(true);
                            invalidate();
                        } else {
                            LinkSpanDrawable linkSpanDrawable3 = this.pressedLink;
                            if (linkSpanDrawable3 != null) {
                                if (linkSpanDrawable3.getSpan() instanceof URLSpan) {
                                    this.delegate.didPressUrl(this, this.pressedLink.getSpan(), false);
                                } else if (this.pressedLink.getSpan() instanceof ClickableSpan) {
                                    ((ClickableSpan) this.pressedLink.getSpan()).onClick(this);
                                }
                                resetPressedLink(2);
                            } else {
                                AnimatedEmojiSpan animatedEmojiSpan = this.pressedEmoji;
                                if (animatedEmojiSpan != null && this.delegate.didPressAnimatedEmoji(this, animatedEmojiSpan)) {
                                    this.pressedEmoji = null;
                                    resetPressedLink(2);
                                } else {
                                    if (this.documentAttachType == 2 && this.drawImageButton) {
                                        int i11 = this.buttonState;
                                        if (i11 == -1) {
                                            if (SharedConfig.isAutoplayGifs() && !this.currentMessageObject.isRepostPreview) {
                                                this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY, false);
                                            } else {
                                                this.buttonState = 2;
                                                this.currentMessageObject.gifState = 1.0f;
                                                this.photoImage.setAllowStartAnimation(false);
                                                this.photoImage.stopAnimation();
                                                this.radialProgress.setIcon(getIconForCurrentState(), false, true);
                                                invalidate();
                                                playSoundEffect(0);
                                            }
                                        } else if (i11 == 2 || i11 == 0) {
                                            didPressButton(true, false);
                                            playSoundEffect(0);
                                        }
                                    } else {
                                        MessageObject messageObject3 = this.currentMessageObject;
                                        if (!messageObject3.preview) {
                                            TLRPC.WebPage webPage2 = MessageObject.getMedia(messageObject3.messageOwner).webpage;
                                            if (webPage2 != null && !TextUtils.isEmpty(webPage2.embed_url)) {
                                                this.delegate.needOpenWebView(this.currentMessageObject, webPage2.embed_url, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_width, webPage2.embed_height);
                                            } else {
                                                int i12 = this.buttonState;
                                                if (i12 == -1 || i12 == 3) {
                                                    this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY, false);
                                                    playSoundEffect(0);
                                                } else if (webPage2 != null) {
                                                    ChatMessageCellDelegate chatMessageCellDelegate5 = this.delegate;
                                                    if (chatMessageCellDelegate5 != null) {
                                                        chatMessageCellDelegate5.didPressWebPage(this, webPage2, webPage2.url, MessageObject.getMedia(this.currentMessageObject.messageOwner).safe);
                                                    } else {
                                                        Browser.openUrl(getContext(), webPage2.url);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    resetPressedLink(2);
                                    return true;
                                }
                            }
                        }
                    } else if (!this.hadLongPress) {
                        this.hadLongPress = false;
                        resetPressedLink(2);
                    }
                } else if (motionEvent.getAction() == 2 && this.instantButtonPressed) {
                    Drawable drawable7 = this.selectorDrawable[0];
                    if (drawable7 != null) {
                        drawable7.setHotspot(eventX, eventY);
                    }
                    Drawable drawable8 = this.linkPreviewSelector;
                    if (drawable8 != null) {
                        drawable8.setHotspot(eventX, eventY);
                    }
                }
            }
        }
        return false;
    }

    private boolean checkEffectMotionEvent(MotionEvent motionEvent) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.getEffect() == null) {
            return false;
        }
        int timeX = (int) ((getTimeX() - AndroidUtilities.dp(this.effectId == 0 ? 0.0f : 18.0f)) + (this.timeWidth * (this.currentMessageObject.sendPreview ? 1.0f - this.timeAlpha : 0.0f)));
        int timeY = (int) getTimeY();
        int iDp = timeX - AndroidUtilities.dp(2.0f);
        int iDp2 = timeY - AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(iDp, iDp2, iDp + AndroidUtilities.dp(16.0f) + this.timeWidth, iDp2 + AndroidUtilities.dp(16.0f));
        boolean zContains = rectF.contains(getEventX(motionEvent), getEventY(motionEvent));
        if (motionEvent.getAction() == 0) {
            if (zContains) {
                if (this.effectDrawableBounce == null) {
                    this.effectDrawableBounce = new ButtonBounce(this);
                }
                this.pressedEffect = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.pressedEffect = zContains;
        } else if (motionEvent.getAction() == 1) {
            if (this.pressedEffect && (chatMessageCellDelegate = this.delegate) != null) {
                chatMessageCellDelegate.didPressEffect(this);
            }
            this.pressedEffect = false;
        } else if (motionEvent.getAction() == 3) {
            this.pressedEffect = false;
        }
        ButtonBounce buttonBounce = this.effectDrawableBounce;
        if (buttonBounce != null) {
            buttonBounce.setPressed(this.pressedEffect);
        }
        return this.pressedEffect;
    }

    private boolean checkFactCheckMotionEvent(MotionEvent motionEvent) {
        int iDp;
        int extraTextX;
        int iDp2;
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (!this.hasFactCheck || this.factCheckTitle == null || this.factCheckWhat == null) {
            return false;
        }
        if (this.factCheckWhatBounce == null) {
            this.factCheckWhatBounce = new ButtonBounce(this);
        }
        if (this.factCheckBounce == null) {
            ButtonBounce buttonBounce = new ButtonBounce(this);
            this.factCheckBounce = buttonBounce;
            buttonBounce.setAdditionalInvalidate(new ChatMessageCell$$ExternalSyntheticLambda7(this));
        }
        float backgroundDrawableRight = getBackgroundDrawableRight();
        TransitionParams transitionParams = this.transitionParams;
        float fDp = ((backgroundDrawableRight + (transitionParams != null ? transitionParams.deltaRight : 0.0f)) - AndroidUtilities.dp(10 + ((!this.currentMessageObject.isOutOwner() || this.mediaBackground || this.drawPinnedBottom) ? 0 : 6))) - getExtraTextX();
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && !groupedMessages.isDocuments) {
            iDp2 = (int) this.captionX;
        } else {
            if (this.currentMessageObject.isOutOwner()) {
                iDp2 = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                if (this.currentMessageObject.type == 19) {
                    iDp2 -= Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + iDp2) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.mediaBackground) {
                    iDp = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f);
                    extraTextX = getExtraTextX();
                } else {
                    iDp = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
                    extraTextX = getExtraTextX();
                }
                iDp2 = iDp + extraTextX;
            }
        }
        int iDp3 = ((int) (iDp2 + this.transitionParams.deltaLeft)) - AndroidUtilities.dp(1.33f);
        int i = this.factCheckY;
        float f = iDp3;
        int i2 = (int) (fDp - f);
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        int iDp4 = (int) (AndroidUtilities.dp(10.0f) + iDp3 + this.factCheckTitle.getCurrentWidth() + AndroidUtilities.dp(4.0f));
        int iDp5 = AndroidUtilities.dp(4.33f) + i;
        RectF rectF = AndroidUtilities.rectTmp;
        float f2 = iDp4;
        rectF.set(f2, iDp5, this.factCheckWhat.getCurrentWidth() + f2 + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(17.33f) + iDp5);
        boolean zContains = rectF.contains(getEventX(motionEvent), getEventY(motionEvent));
        rectF.set(f, i, iDp3 + i2, this.factCheckHeight + i);
        boolean z = !zContains && !this.hadLongPress && this.pressedFactCheckLink == null && rectF.contains(getEventX(motionEvent), getEventY(motionEvent));
        if (((z && !this.hadLongPress) || this.pressedFactCheckLink != null) && this.factCheckTextLayout != null) {
            if (this.factCheckLinks == null) {
                LinkSpanDrawable.LinkCollector linkCollector = new LinkSpanDrawable.LinkCollector(this);
                this.factCheckLinks = linkCollector;
                linkCollector.setAdditionalInvalidate(new ChatMessageCell$$ExternalSyntheticLambda7(this));
            }
            int iDp6 = (iDp3 + AndroidUtilities.dp(10.0f)) - this.factCheckTextLayoutLeft;
            int iDp7 = i + AndroidUtilities.dp(22.0f);
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && this.pressedFactCheckLink != null)) {
                if (eventX >= iDp6 && eventY >= iDp7 && eventX <= i2 + iDp6 && eventY <= this.factCheckTextLayout.getHeight() + iDp7) {
                    try {
                        int i3 = eventY - iDp7;
                        int lineForVertical = this.factCheckTextLayout.getLineForVertical(i3);
                        float f3 = eventX - iDp6;
                        int offsetForHorizontal = this.factCheckTextLayout.getOffsetForHorizontal(lineForVertical, f3);
                        float lineLeft = this.factCheckTextLayout.getLineLeft(lineForVertical);
                        if (lineLeft <= f3 && lineLeft + this.factCheckTextLayout.getLineWidth(lineForVertical) >= f3) {
                            Spannable spannable = (Spannable) this.factCheckTextLayout.getText();
                            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (characterStyleArr == null || characterStyleArr.length == 0) {
                                characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpanMono.class);
                            }
                            if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof URLSpanBotCommand) || URLSpanBotCommand.enabled) && !AndroidUtilities.isAccessibilityScreenReaderEnabled())) {
                                if (motionEvent.getAction() == 0) {
                                    LinkSpanDrawable linkSpanDrawable = this.pressedFactCheckLink;
                                    if (linkSpanDrawable == null || linkSpanDrawable.getSpan() != characterStyleArr[0]) {
                                        this.factCheckLinks.removeLink(this.pressedFactCheckLink);
                                        CharacterStyle characterStyle = characterStyleArr[0];
                                        LinkSpanDrawable linkSpanDrawable2 = new LinkSpanDrawable(characterStyle, this.resourcesProvider, f3, i3, spanSupportsLongPress(characterStyle));
                                        this.pressedFactCheckLink = linkSpanDrawable2;
                                        ReplyMessageLine replyMessageLine = this.factCheckLine;
                                        if (replyMessageLine != null) {
                                            linkSpanDrawable2.setColor(Theme.multAlpha(replyMessageLine.getColor(), 0.1f));
                                        }
                                        try {
                                            LinkPath linkPathObtainNewPath = this.pressedFactCheckLink.obtainNewPath();
                                            int[] realSpanStartAndEnd = getRealSpanStartAndEnd(spannable, this.pressedFactCheckLink.getSpan());
                                            linkPathObtainNewPath.setCurrentLayout(this.factCheckTextLayout, realSpanStartAndEnd[0], 0.0f);
                                            this.factCheckTextLayout.getSelectionPath(realSpanStartAndEnd[0], realSpanStartAndEnd[1], linkPathObtainNewPath);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        this.factCheckLinks.addLink(this.pressedFactCheckLink, 1);
                                        z = false;
                                    }
                                    invalidate();
                                } else {
                                    LinkSpanDrawable linkSpanDrawable3 = this.pressedFactCheckLink;
                                    if (linkSpanDrawable3 != null && characterStyleArr[0] == linkSpanDrawable3.getSpan()) {
                                        this.delegate.didPressUrl(this, this.pressedFactCheckLink.getSpan(), false);
                                        resetPressedLink(1);
                                        this.factCheckWhatPressed = false;
                                        this.factCheckPressed = false;
                                        this.pressedFactCheckLink = null;
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                } else {
                    resetPressedLink(1);
                }
            }
        }
        boolean z2 = this.factCheckLarge && z;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.factCheckWhatPressed = zContains;
            this.factCheckPressed = z2;
        } else if (motionEvent.getAction() == 1) {
            if (this.factCheckWhatPressed) {
                ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
                if (chatMessageCellDelegate2 != null) {
                    chatMessageCellDelegate2.didPressFactCheckWhat(this, (int) (iDp4 + AndroidUtilities.dp(4.0f) + (this.factCheckWhat.getCurrentWidth() / 2.0f)), iDp5);
                }
            } else if (this.factCheckPressed && !this.transitionParams.animateFactCheckExpanded && (chatMessageCellDelegate = this.delegate) != null) {
                chatMessageCellDelegate.didPressFactCheck(this);
            }
            this.factCheckWhatPressed = false;
            this.factCheckPressed = false;
        } else if (motionEvent.getAction() == 3) {
            this.factCheckWhatPressed = false;
            this.factCheckPressed = false;
            LinkSpanDrawable.LinkCollector linkCollector2 = this.factCheckLinks;
            if (linkCollector2 != null) {
                linkCollector2.clear();
            }
            this.pressedFactCheckLink = null;
        }
        this.factCheckWhatBounce.setPressed(this.factCheckWhatPressed);
        this.factCheckBounce.setPressed(this.factCheckPressed);
        return this.factCheckWhatPressed || this.factCheckPressed || this.pressedFactCheckLink != null;
    }

    private boolean checkPollMediaMotionEvent(MotionEvent motionEvent) {
        PollContentDrawable pollContentDrawable;
        PollContentDrawable pollContentDrawable2;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.type != 17 || messageObject.isSending()) {
            return false;
        }
        int action = motionEvent.getAction();
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        PollContentDrawable pollContentDrawable3 = this.pollContentDrawable;
        if (pollContentDrawable3 != null) {
            if (pollContentDrawable3.isMusic() && this.pollContentDrawable.isPlaying() && this.pollContentDrawable.seekBarOnTouch(action, eventX, eventY)) {
                if (action == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.disallowLongPress = true;
                invalidate();
                return true;
            }
            if ((this.pollContentDrawable.isMusic() || this.pollContentDrawable.isFile()) && this.pollContentDrawable.miniButtonOnTouch(action, eventX, eventY)) {
                this.disallowLongPress = true;
                invalidate();
                return true;
            }
        }
        if (this.currentMessageObject.expandedExplanation && (pollContentDrawable2 = this.pollExplanationDrawable) != null) {
            if (pollContentDrawable2.isMusic() && this.pollExplanationDrawable.isPlaying() && this.pollExplanationDrawable.seekBarOnTouch(action, eventX, eventY)) {
                if (action == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.disallowLongPress = true;
                invalidate();
                return true;
            }
            if ((this.pollExplanationDrawable.isMusic() || this.pollExplanationDrawable.isFile()) && this.pollExplanationDrawable.miniButtonOnTouch(action, eventX, eventY)) {
                this.disallowLongPress = true;
                invalidate();
                return true;
            }
        }
        if (action == 0) {
            this.pollMediaPressedIndex = -1;
            PollContentDrawable pollContentDrawable4 = this.pollContentDrawable;
            if (pollContentDrawable4 != null && pollContentDrawable4.isHasMedia() && this.pollContentDrawable.getBounds().contains(eventX, eventY)) {
                this.pollMediaPressedIndex = -2;
                invalidate();
            } else {
                if (!this.currentMessageObject.expandedExplanation || (pollContentDrawable = this.pollExplanationDrawable) == null || !pollContentDrawable.isHasMedia() || !this.pollExplanationDrawable.getBounds().contains(eventX, eventY)) {
                    return false;
                }
                this.pollMediaPressedIndex = -3;
                invalidate();
            }
        } else if (action == 2) {
            if (this.pollMediaPressedIndex == -1) {
                return false;
            }
        } else {
            if (action != 1 || this.pollMediaPressedIndex == -1) {
                return false;
            }
            playSoundEffect(0);
            int i = this.pollMediaPressedIndex;
            if (i == -2) {
                didClickedPollImage(this, this.pollContentDrawable.getImageReceiver(), null, this.pollContentDrawable.getMedia(), eventX, eventY, -2);
            } else if (i == -3) {
                didClickedPollImage(this, this.pollExplanationDrawable.getImageReceiver(), null, this.pollExplanationDrawable.getMedia(), eventX, eventY, -3);
            }
            this.pollMediaPressedIndex = -1;
            invalidate();
        }
        return true;
    }

    private void resetPollButtonSelectors() {
        if (this.pollButtons != null) {
            for (int i = 0; i < this.pollButtons.size(); i++) {
                ((PollButton) this.pollButtons.get(i)).selectorDrawable.setState(StateSet.NOTHING);
            }
        }
        PollAddButtonDrawable pollAddButtonDrawable = this.pollAddButtonDrawable;
        if (pollAddButtonDrawable != null) {
            pollAddButtonDrawable.resetSelectors();
        }
    }

    private boolean checkPollButtonMotionEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkPollButtonMotionEvent(android.view.MotionEvent):boolean");
    }

    public void didPressVoteHint() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            messageObject.expandedExplanation = !messageObject.expandedExplanation;
            ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
            if (chatMessageCellDelegate != null) {
                chatMessageCellDelegate.forceUpdate(this, true);
            }
        }
    }

    private boolean checkInstantButtonMotionEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (!this.currentMessageObject.isSponsored() && !this.currentMessageObject.isUnsupported() && (!this.drawInstantView || this.currentMessageObject.type == 0)) {
            return false;
        }
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        if (motionEvent.getAction() == 0) {
            if (this.drawInstantView) {
                float f = eventX;
                float f2 = eventY;
                if (this.instantButtonRect.contains(f, f2)) {
                    this.selectorDrawableMaskType[0] = this.lastPoll == null ? 0 : 2;
                    this.instantPressed = true;
                    if (this.selectorDrawable[0] != null && this.instantButtonRect.contains(f, f2)) {
                        this.selectorDrawable[0].setHotspot(f, f2);
                        this.selectorDrawable[0].setState(this.pressedState);
                        setInstantButtonPressed(true);
                    }
                    invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.instantPressed) {
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate != null) {
                    if (this.lastPoll != null) {
                        MessageObject messageObject = this.currentMessageObject;
                        if (messageObject.scheduled) {
                            Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledVoteResults), 1).show();
                        } else if (this.pollInInputNewOption) {
                            chatMessageCellDelegate.didPressInstantButton(this, 84);
                        } else {
                            int i = this.drawInstantViewType;
                            if (i == 80) {
                                chatMessageCellDelegate.didPressInstantButton(this, 80);
                            } else if (i == 83) {
                                if (!messageObject.checkedVotes.isEmpty()) {
                                    this.pollVoteInProgressNum = -1;
                                    this.pollVoteInProgress = true;
                                    this.vibrateOnPollVote = true;
                                    this.voteCurrentProgressTime = 0.0f;
                                    this.firstCircleLength = true;
                                    this.voteCurrentCircleLength = 360.0f;
                                    this.voteRisingCircleLength = false;
                                }
                                this.delegate.didPressVoteButtons(this, this.currentMessageObject.checkedVotes, -1, 0, this.namesOffset);
                            } else if (i == 81) {
                                messageObject.forceShowPollResults = true;
                                this.pollVoteInProgress = true;
                                chatMessageCellDelegate.didTogglePollPreview(this);
                            } else if (i == 82) {
                                messageObject.forceShowPollResults = false;
                                chatMessageCellDelegate.didTogglePollPreview(this);
                            }
                        }
                    } else {
                        chatMessageCellDelegate.didPressInstantButton(this, this.drawInstantViewType);
                    }
                }
                playSoundEffect(0);
                Drawable drawable2 = this.selectorDrawable[0];
                if (drawable2 != null) {
                    drawable2.setState(StateSet.NOTHING);
                }
                this.instantPressed = false;
                setInstantButtonPressed(false);
                invalidate();
            }
        } else if (motionEvent.getAction() == 2 && this.instantButtonPressed && (drawable = this.selectorDrawable[0]) != null) {
            drawable.setHotspot(eventX, eventY);
        }
        return false;
    }

    private boolean checkContactMotionEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (this.currentMessageObject.type != 12) {
            return false;
        }
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.contactButtons;
            if (arrayList != null && arrayList.size() > 1) {
                for (int i = 0; i < this.contactButtons.size(); i++) {
                    InstantViewButton instantViewButton = (InstantViewButton) this.contactButtons.get(i);
                    float f = eventX;
                    float f2 = eventY;
                    if (instantViewButton.rect.contains(f, f2)) {
                        if (instantViewButton.buttonBounce == null) {
                            instantViewButton.buttonBounce = new ButtonBounce(this);
                        }
                        instantViewButton.buttonBounce.setPressed(true);
                        if (instantViewButton.selectorDrawable != null) {
                            instantViewButton.selectorDrawable.setHotspot(f, f2);
                            instantViewButton.selectorDrawable.setState(this.pressedState);
                        }
                        invalidate();
                        return true;
                    }
                }
            }
            float f3 = eventX;
            float f4 = eventY;
            if (this.contactRect.contains(f3, f4)) {
                this.contactPressed = true;
                this.contactBounce.setPressed(true);
                Drawable drawable2 = this.selectorDrawable[0];
                if (drawable2 != null) {
                    drawable2.setHotspot(f3, f4);
                    this.selectorDrawable[0].setState(this.pressedState);
                }
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.contactPressed) {
                if (this.delegate != null) {
                    ArrayList arrayList2 = this.contactButtons;
                    if (arrayList2 != null && arrayList2.size() == 1) {
                        this.delegate.didPressInstantButton(this, ((InstantViewButton) this.contactButtons.get(0)).type);
                    } else {
                        this.delegate.didPressInstantButton(this, 5);
                    }
                }
                playSoundEffect(0);
                Drawable drawable3 = this.selectorDrawable[0];
                if (drawable3 != null) {
                    drawable3.setState(StateSet.NOTHING);
                }
                this.contactPressed = false;
                this.contactBounce.setPressed(false);
                invalidate();
            } else {
                ArrayList arrayList3 = this.contactButtons;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    for (int i2 = 0; i2 < this.contactButtons.size(); i2++) {
                        InstantViewButton instantViewButton2 = (InstantViewButton) this.contactButtons.get(i2);
                        if (instantViewButton2.buttonBounce != null && instantViewButton2.buttonBounce.isPressed()) {
                            ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                            if (chatMessageCellDelegate != null) {
                                chatMessageCellDelegate.didPressInstantButton(this, instantViewButton2.type);
                            }
                            if (instantViewButton2.selectorDrawable != null) {
                                instantViewButton2.selectorDrawable.setState(StateSet.NOTHING);
                            }
                            instantViewButton2.buttonBounce.setPressed(false);
                            playSoundEffect(0);
                            invalidate();
                        }
                    }
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.contactPressed && (drawable = this.selectorDrawable[0]) != null) {
                drawable.setHotspot(eventX, eventY);
            } else {
                ArrayList arrayList4 = this.contactButtons;
                if (arrayList4 != null && arrayList4.size() > 1) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.contactButtons.size()) {
                            break;
                        }
                        InstantViewButton instantViewButton3 = (InstantViewButton) this.contactButtons.get(i3);
                        if (instantViewButton3.buttonBounce == null || !instantViewButton3.buttonBounce.isPressed()) {
                            i3++;
                        } else if (instantViewButton3.selectorDrawable != null) {
                            instantViewButton3.selectorDrawable.setHotspot(eventX, eventY);
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean checkTitleLabelMotion(MotionEvent motionEvent) {
        if (this.currentMessageObject.isSponsored() && this.currentMessageObject.sponsoredCanReport) {
            int eventX = (int) getEventX(motionEvent);
            int eventY = (int) getEventY(motionEvent);
            if (motionEvent.getAction() == 0) {
                float f = eventX;
                if (f >= this.titleLabelX - AndroidUtilities.dp(6.0f) && f <= this.titleLabelX + this.titleLabelLayoutWidth + AndroidUtilities.dp(6.0f)) {
                    float f2 = eventY;
                    if (f2 >= this.titleLabelY - AndroidUtilities.dp(2.0f) && f2 <= this.titleLabelY + this.titleLabelLayoutHeight + AndroidUtilities.dp(2.0f)) {
                        ButtonBounce buttonBounce = this.titleLabelBounce;
                        if (buttonBounce != null) {
                            buttonBounce.setPressed(true);
                        }
                        this.isTitleLabelPressed = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 && this.isTitleLabelPressed) {
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate != null) {
                    chatMessageCellDelegate.didPressAboutRevenueSharingAds();
                }
                ButtonBounce buttonBounce2 = this.titleLabelBounce;
                if (buttonBounce2 != null) {
                    buttonBounce2.setPressed(false);
                }
                playSoundEffect(0);
                this.isTitleLabelPressed = false;
            }
        }
        return false;
    }

    private void invalidateWithParent() {
        if (this.currentMessagesGroup != null && getParent() != null) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    private boolean checkCommentButtonMotionEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (!this.drawCommentButton) {
            return false;
        }
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition != null) {
            int i = groupedMessagePosition.flags;
            if ((i & 1) == 0 || (i & 8) == 0) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != this && (childAt instanceof ChatMessageCell)) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        if (chatMessageCell.drawCommentButton && chatMessageCell.currentMessagesGroup == this.currentMessagesGroup) {
                            int i3 = chatMessageCell.currentPosition.flags;
                            if ((i3 & 1) != 0 && (i3 & 8) != 0) {
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (getEventX(motionEvent) + getLeft()) - chatMessageCell.getLeft(), (getEventY(motionEvent) + getTop()) - chatMessageCell.getTop(), 0);
                                boolean zCheckCommentButtonMotionEvent = chatMessageCell.checkCommentButtonMotionEvent(motionEventObtain);
                                motionEventObtain.recycle();
                                return zCheckCommentButtonMotionEvent;
                            }
                        }
                    }
                }
                return false;
            }
        }
        if (motionEvent.getAction() == 0) {
            if (this.commentButtonRect.contains(eventX, eventY)) {
                if (this.currentMessageObject.isSent()) {
                    this.selectorDrawableMaskType[1] = 2;
                    this.commentButtonPressed = true;
                    Drawable drawable2 = this.selectorDrawable[1];
                    if (drawable2 != null) {
                        drawable2.setHotspot(eventX, eventY);
                        this.selectorDrawable[1].setState(this.pressedState);
                    }
                    invalidateWithParent();
                }
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.commentButtonPressed) {
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate != null) {
                    if (this.isRepliesChat) {
                        chatMessageCellDelegate.didPressSideButton(this);
                    } else {
                        chatMessageCellDelegate.didPressCommentButton(this);
                    }
                }
                playSoundEffect(0);
                Drawable drawable3 = this.selectorDrawable[1];
                if (drawable3 != null) {
                    drawable3.setState(StateSet.NOTHING);
                }
                this.commentButtonPressed = false;
                invalidateWithParent();
            }
        } else if (motionEvent.getAction() == 2 && this.commentButtonPressed && (drawable = this.selectorDrawable[1]) != null) {
            drawable.setHotspot(eventX, eventY);
        }
        return false;
    }

    private boolean checkSponsoredCloseMotionEvent(MotionEvent motionEvent) {
        ButtonBounce buttonBounce;
        ChatMessageCellDelegate chatMessageCellDelegate;
        RectF rectF;
        if (motionEvent.getAction() == 0 && (rectF = this.closeSponsoredBounds) != null && this.closeSponsoredBounce != null && rectF.contains(getEventX(motionEvent), getEventY(motionEvent))) {
            this.closeSponsoredBounce.setPressed(true);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            ButtonBounce buttonBounce2 = this.closeSponsoredBounce;
            if (buttonBounce2 != null && buttonBounce2.isPressed() && (chatMessageCellDelegate = this.delegate) != null) {
                chatMessageCellDelegate.didPressSponsoredClose(this);
            }
            ButtonBounce buttonBounce3 = this.closeSponsoredBounce;
            if (buttonBounce3 != null) {
                buttonBounce3.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (buttonBounce = this.closeSponsoredBounce) != null) {
            buttonBounce.setPressed(false);
        }
        ButtonBounce buttonBounce4 = this.closeSponsoredBounce;
        return buttonBounce4 != null && buttonBounce4.isPressed();
    }

    private boolean checkOtherButtonMotionEvent(MotionEvent motionEvent) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        Drawable drawable;
        Drawable drawable2;
        int i = this.documentAttachType;
        if ((i == 5 || i == 1) && (groupedMessagePosition = this.currentPosition) != null && (groupedMessagePosition.flags & 4) == 0) {
            return false;
        }
        int i2 = this.currentMessageObject.type;
        boolean z = i2 == 16;
        if (!z) {
            z = ((i != 1 && i2 != 12 && i != 5 && i != 4 && i != 2 && i2 != 8) || this.hasGamePreview || this.hasInvoicePreview) ? false : true;
        }
        if (!z) {
            return false;
        }
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        if (motionEvent.getAction() == 0) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject.type == 16) {
                boolean zIsVideoCall = messageObject.isVideoCall();
                int i3 = this.otherX;
                if (eventX >= i3) {
                    if (eventX <= i3 + (LocaleController.isRTL ? 0 : this.backgroundWidth - AndroidUtilities.dp(70.0f)) + AndroidUtilities.dp((!zIsVideoCall ? 2 : 0) + 30) && eventY >= this.otherY - AndroidUtilities.dp(14.0f) && eventY <= this.otherY + AndroidUtilities.dp(50.0f)) {
                        this.otherPressed = true;
                        this.selectorDrawableMaskType[0] = 4;
                        if (this.selectorDrawable[0] != null) {
                            int iDp = this.otherX + (LocaleController.isRTL ? 0 : this.backgroundWidth - AndroidUtilities.dp(70.0f)) + AndroidUtilities.dp(!zIsVideoCall ? 2 : 0) + (Theme.chat_msgInCallDrawable[zIsVideoCall ? 1 : 0].getIntrinsicWidth() / 2);
                            int intrinsicHeight = this.otherY + (Theme.chat_msgInCallDrawable[zIsVideoCall ? 1 : 0].getIntrinsicHeight() / 2);
                            this.selectorDrawable[0].setBounds(iDp - AndroidUtilities.dp(20.0f), intrinsicHeight - AndroidUtilities.dp(20.0f), iDp + AndroidUtilities.dp(20.0f), intrinsicHeight + AndroidUtilities.dp(20.0f));
                            this.selectorDrawable[0].setHotspot(eventX, eventY);
                            this.selectorDrawable[0].setState(this.pressedState);
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (eventX >= this.otherX - AndroidUtilities.dp(20.0f) && eventX <= this.otherX + AndroidUtilities.dp(20.0f) && eventY >= this.otherY - AndroidUtilities.dp(4.0f) && eventY <= this.otherY + AndroidUtilities.dp(30.0f)) {
                this.otherPressed = true;
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.otherPressed) {
                if (this.currentMessageObject.type == 16 && (drawable2 = this.selectorDrawable[0]) != null) {
                    drawable2.setState(StateSet.NOTHING);
                }
                this.otherPressed = false;
                playSoundEffect(0);
                this.delegate.didPressOther(this, this.otherX, this.otherY);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2 && this.currentMessageObject.type == 16 && this.otherPressed && (drawable = this.selectorDrawable[0]) != null) {
            drawable.setHotspot(eventX, eventY);
        }
        return false;
    }

    private void setInstantButtonPressed(boolean z) {
        if (this.instantButtonBounce == null) {
            this.instantButtonBounce = new ButtonBounce(this);
        }
        ButtonBounce buttonBounce = this.instantButtonBounce;
        this.instantButtonPressed = z;
        buttonBounce.setPressed(z);
    }

    private void resetContactButtonsPressedState() {
        this.contactPressed = false;
        ButtonBounce buttonBounce = this.contactBounce;
        if (buttonBounce != null) {
            buttonBounce.setPressed(false);
        }
        Drawable drawable = this.selectorDrawable[0];
        if (drawable != null) {
            drawable.setState(StateSet.NOTHING);
        }
        if (this.contactButtons != null) {
            for (int i = 0; i < this.contactButtons.size(); i++) {
                InstantViewButton instantViewButton = (InstantViewButton) this.contactButtons.get(i);
                if (instantViewButton.buttonBounce != null) {
                    instantViewButton.buttonBounce.setPressed(false);
                }
                if (instantViewButton.selectorDrawable != null) {
                    instantViewButton.selectorDrawable.setState(StateSet.NOTHING);
                }
            }
        }
    }

    private boolean checkDateMotionEvent(MotionEvent motionEvent) {
        if (!this.currentMessageObject.isImportedForward()) {
            return false;
        }
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        if (motionEvent.getAction() == 0) {
            float f = eventX;
            float f2 = this.drawTimeX;
            if (f < f2 || f > f2 + this.timeWidth) {
                return false;
            }
            float f3 = eventY;
            float f4 = this.drawTimeY;
            if (f3 < f4 || f3 > f4 + AndroidUtilities.dp(20.0f)) {
                return false;
            }
            this.timePressed = true;
            invalidate();
        } else {
            if (motionEvent.getAction() != 1 || !this.timePressed) {
                return false;
            }
            this.timePressed = false;
            playSoundEffect(0);
            this.delegate.didPressTime(this);
            invalidate();
        }
        return true;
    }

    private boolean checkRoundSeekbar(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkRoundSeekbar(android.view.MotionEvent):boolean");
    }

    private boolean checkPhotoImageMotionEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkPhotoImageMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkAudioMotionEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkAudioMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean checkSpoilersMotionEvent(MotionEvent motionEvent, int i) {
        int i2;
        MessageObject.GroupedMessages groupedMessages;
        if (i > 15 || getParent() == null) {
            return false;
        }
        if (this.currentMessageObject.hasValidGroupId() && (groupedMessages = this.currentMessagesGroup) != null && !groupedMessages.isDocuments) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                    MessageObject.GroupedMessagePosition currentPosition = chatMessageCell.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.currentMessagesGroup.groupId) {
                        int i4 = currentPosition.flags;
                        if ((i4 & 8) != 0 && (i4 & 1) != 0 && chatMessageCell != this) {
                            motionEvent.offsetLocation(getLeft() - chatMessageCell.getLeft(), getTop() - chatMessageCell.getTop());
                            boolean zCheckSpoilersMotionEvent = chatMessageCell.checkSpoilersMotionEvent(motionEvent, i + 1);
                            motionEvent.offsetLocation(-(getLeft() - chatMessageCell.getLeft()), -(getTop() - chatMessageCell.getTop()));
                            return zCheckSpoilersMotionEvent;
                        }
                    }
                }
            }
        }
        if (this.isSpoilerRevealing) {
            return false;
        }
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int i5 = this.textX;
            if (eventX >= i5 && eventY >= (i2 = this.textY)) {
                MessageObject messageObject = this.currentMessageObject;
                if (eventX <= i5 + messageObject.textWidth && eventY <= i2 + messageObject.textHeight(this.transitionParams)) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = this.currentMessageObject.textLayoutBlocks;
                    for (int i6 = 0; i6 < arrayList.size() && arrayList.get(i6).textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams) <= eventY; i6++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i6);
                        int i7 = textLayoutBlock.isRtl() ? (int) this.currentMessageObject.textXOffset : 0;
                        for (SpoilerEffect spoilerEffect : textLayoutBlock.spoilers) {
                            if (spoilerEffect.getBounds().contains((eventX - this.textX) + i7, (int) ((eventY - this.textY) - textLayoutBlock.textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams)))) {
                                this.spoilerPressed = spoilerEffect;
                                return true;
                            }
                        }
                    }
                }
            }
            if (this.captionLayout != null) {
                float f = eventX;
                float f2 = this.captionX;
                if (f >= f2) {
                    float f3 = eventY;
                    float f4 = this.captionY;
                    if (f3 >= f4 && f <= f2 + r1.textWidth && f3 <= f4 + r1.textHeight(this.transitionParams)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = this.captionLayout.textLayoutBlocks;
                        for (int i8 = 0; i8 < arrayList2.size() && arrayList2.get(i8).textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams) <= f3; i8++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i8);
                            int i9 = textLayoutBlock2.isRtl() ? (int) this.captionLayout.textXOffset : 0;
                            for (SpoilerEffect spoilerEffect2 : textLayoutBlock2.spoilers) {
                                if (spoilerEffect2.getBounds().contains((int) ((f - this.captionX) + i9), (int) ((f3 - this.captionY) - textLayoutBlock2.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams)))) {
                                    this.spoilerPressed = spoilerEffect2;
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            if (this.explanationLayout != null) {
                float f5 = eventX;
                float f6 = this.lastDrawExplanationX;
                if (f5 >= f6) {
                    float f7 = eventY;
                    float f8 = this.lastDrawExplanationY;
                    if (f7 > f8 && f5 <= f6 + r1.textWidth && f7 <= f8 + r1.textHeight(this.transitionParams)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.explanationLayout.textLayoutBlocks;
                        for (int i10 = 0; i10 < arrayList3.size() && arrayList3.get(i10).textYOffset(this.explanationLayout.textLayoutBlocks, this.transitionParams) <= f7; i10++) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i10);
                            int i11 = textLayoutBlock3.isRtl() ? (int) this.explanationLayout.textXOffset : 0;
                            for (SpoilerEffect spoilerEffect3 : textLayoutBlock3.spoilers) {
                                if (spoilerEffect3.getBounds().contains((int) ((f5 - this.lastDrawExplanationX) + i11), (int) ((f7 - this.lastDrawExplanationY) - textLayoutBlock3.textYOffset(this.explanationLayout.textLayoutBlocks, this.transitionParams)))) {
                                    this.spoilerPressed = spoilerEffect3;
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } else if (actionMasked == 1 && this.spoilerPressed != null) {
            playSoundEffect(0);
            this.sPath.rewind();
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.explanationLayout;
            if (textLayoutBlocks != null) {
                Iterator<MessageObject.TextLayoutBlock> it = textLayoutBlocks.textLayoutBlocks.iterator();
                while (it.hasNext()) {
                    MessageObject.TextLayoutBlock next = it.next();
                    Iterator<SpoilerEffect> it2 = next.spoilers.iterator();
                    while (it2.hasNext()) {
                        Rect bounds = it2.next().getBounds();
                        this.sPath.addRect(bounds.left, bounds.top + next.textYOffset(this.explanationLayout.textLayoutBlocks, this.transitionParams), bounds.right, next.textYOffset(this.explanationLayout.textLayoutBlocks, this.transitionParams) + bounds.bottom, Path.Direction.CW);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.captionLayout;
            if (textLayoutBlocks2 != null) {
                Iterator<MessageObject.TextLayoutBlock> it3 = textLayoutBlocks2.textLayoutBlocks.iterator();
                while (it3.hasNext()) {
                    MessageObject.TextLayoutBlock next2 = it3.next();
                    Iterator<SpoilerEffect> it4 = next2.spoilers.iterator();
                    while (it4.hasNext()) {
                        Rect bounds2 = it4.next().getBounds();
                        this.sPath.addRect(bounds2.left, bounds2.top + next2.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams), bounds2.right, next2.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams) + bounds2.bottom, Path.Direction.CW);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList4 = this.currentMessageObject.textLayoutBlocks;
                if (arrayList4 != null) {
                    Iterator<MessageObject.TextLayoutBlock> it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        MessageObject.TextLayoutBlock next3 = it5.next();
                        Iterator<SpoilerEffect> it6 = next3.spoilers.iterator();
                        while (it6.hasNext()) {
                            Rect bounds3 = it6.next().getBounds();
                            this.sPath.addRect(bounds3.left, bounds3.top + next3.textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams), bounds3.right, next3.textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams) + bounds3.bottom, Path.Direction.CW);
                        }
                    }
                }
            }
            this.sPath.computeBounds(this.rect, false);
            float fSqrt = (float) Math.sqrt(Math.pow(this.rect.width(), 2.0d) + Math.pow(this.rect.height(), 2.0d));
            this.isSpoilerRevealing = true;
            this.spoilerPressed.setOnRippleEndCallback(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkSpoilersMotionEvent$1();
                }
            });
            MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.explanationLayout;
            if (textLayoutBlocks3 != null) {
                Iterator<MessageObject.TextLayoutBlock> it7 = textLayoutBlocks3.textLayoutBlocks.iterator();
                while (it7.hasNext()) {
                    MessageObject.TextLayoutBlock next4 = it7.next();
                    int i12 = next4.isRtl() ? (int) this.explanationLayout.textXOffset : 0;
                    Iterator<SpoilerEffect> it8 = next4.spoilers.iterator();
                    while (it8.hasNext()) {
                        it8.next().startRipple((eventX - this.lastDrawExplanationX) + i12, (eventY - next4.textYOffset(this.explanationLayout.textLayoutBlocks, this.transitionParams)) - this.lastDrawExplanationY, fSqrt);
                    }
                }
            }
            MessageObject.TextLayoutBlocks textLayoutBlocks4 = this.captionLayout;
            if (textLayoutBlocks4 != null) {
                Iterator<MessageObject.TextLayoutBlock> it9 = textLayoutBlocks4.textLayoutBlocks.iterator();
                while (it9.hasNext()) {
                    MessageObject.TextLayoutBlock next5 = it9.next();
                    int i13 = next5.isRtl() ? (int) this.captionLayout.textXOffset : 0;
                    Iterator<SpoilerEffect> it10 = next5.spoilers.iterator();
                    while (it10.hasNext()) {
                        it10.next().startRipple((eventX - this.captionX) + i13, (eventY - next5.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams)) - this.captionY, fSqrt);
                    }
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList5 = this.currentMessageObject.textLayoutBlocks;
                if (arrayList5 != null) {
                    Iterator<MessageObject.TextLayoutBlock> it11 = arrayList5.iterator();
                    while (it11.hasNext()) {
                        MessageObject.TextLayoutBlock next6 = it11.next();
                        int i14 = next6.isRtl() ? (int) this.currentMessageObject.textXOffset : 0;
                        Iterator<SpoilerEffect> it12 = next6.spoilers.iterator();
                        while (it12.hasNext()) {
                            it12.next().startRipple((eventX - this.textX) + i14, (eventY - next6.textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams)) - this.textY, fSqrt);
                        }
                    }
                }
            }
            if (getParent() instanceof RecyclerListView) {
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                for (int i15 = 0; i15 < viewGroup2.getChildCount(); i15++) {
                    View childAt2 = viewGroup2.getChildAt(i15);
                    if (childAt2 instanceof ChatMessageCell) {
                        final ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt2;
                        if (chatMessageCell2.getMessageObject() != null && chatMessageCell2.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !chatMessageCell2.replySpoilers.isEmpty()) {
                            ((SpoilerEffect) chatMessageCell2.replySpoilers.get(0)).setOnRippleEndCallback(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$checkSpoilersMotionEvent$3(chatMessageCell2);
                                }
                            });
                            Iterator it13 = chatMessageCell2.replySpoilers.iterator();
                            while (it13.hasNext()) {
                                ((SpoilerEffect) it13.next()).startRipple(r5.getBounds().centerX(), r5.getBounds().centerY(), fSqrt);
                            }
                        }
                    }
                }
            }
            this.spoilerPressed = null;
            return true;
        }
        return false;
    }

    public void lambda$checkSpoilersMotionEvent$1() {
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkSpoilersMotionEvent$0();
            }
        });
    }

    public void lambda$checkSpoilersMotionEvent$0() {
        this.isSpoilerRevealing = false;
        getMessageObject().isSpoilersRevealed = true;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.explanationLayout;
        if (textLayoutBlocks != null) {
            Iterator<MessageObject.TextLayoutBlock> it = textLayoutBlocks.textLayoutBlocks.iterator();
            while (it.hasNext()) {
                it.next().spoilers.clear();
            }
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.captionLayout;
        if (textLayoutBlocks2 != null) {
            Iterator<MessageObject.TextLayoutBlock> it2 = textLayoutBlocks2.textLayoutBlocks.iterator();
            while (it2.hasNext()) {
                it2.next().spoilers.clear();
            }
        } else {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.currentMessageObject.textLayoutBlocks;
            if (arrayList != null) {
                Iterator<MessageObject.TextLayoutBlock> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().spoilers.clear();
                }
            }
        }
        invalidate();
    }

    public void lambda$checkSpoilersMotionEvent$3(final ChatMessageCell chatMessageCell) {
        post(new Runnable() {
            @Override
            public final void run() {
                ChatMessageCell.lambda$checkSpoilersMotionEvent$2(this.f$0);
            }
        });
    }

    public static void lambda$checkSpoilersMotionEvent$2(ChatMessageCell chatMessageCell) {
        chatMessageCell.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
        chatMessageCell.replySpoilers.clear();
        chatMessageCell.invalidate();
    }

    private boolean checkBotButtonMotionEvent(MotionEvent motionEvent) {
        int i;
        int iDp;
        if (this.botButtons.isEmpty()) {
            return false;
        }
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        if (motionEvent.getAction() == 0) {
            int widthForButtons = getWidthForButtons();
            if (this.currentMessageObject.isOutOwner()) {
                iDp = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                iDp = this.backgroundDrawableLeft + AndroidUtilities.dp(this.mediaBackground ? 1.0f : 7.0f);
            }
            for (int i2 = 0; i2 < this.botButtons.size(); i2++) {
                BotButton botButton = (BotButton) this.botButtons.get(i2);
                int iDp2 = (botButton.y + this.layoutHeight) - AndroidUtilities.dp(2.0f);
                float f = eventX;
                float f2 = widthForButtons;
                float f3 = (botButton.x * f2) + iDp;
                if (f >= f3 && f <= f3 + (botButton.width * f2) && eventY >= iDp2 && eventY <= botButton.height + iDp2) {
                    this.pressedBotButton = i2;
                    invalidateOutbounds();
                    if (botButton.selectorDrawable == null) {
                        Drawable drawableCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(getThemedColor(Theme.key_chat_serviceBackgroundSelector), 6, 6);
                        botButton.selectorDrawable = drawableCreateRadSelectorDrawable;
                        drawableCreateRadSelectorDrawable.setCallback(this);
                        Drawable drawable = botButton.selectorDrawable;
                        int i3 = ((int) (botButton.x * f2)) + iDp;
                        drawable.setBounds(i3, iDp2, ((int) (botButton.width * f2)) + i3, botButton.height + iDp2);
                    }
                    botButton.selectorDrawable.setHotspot(f, eventY);
                    botButton.selectorDrawable.setState(this.pressedState);
                    botButton.setPressed(!botButton.isLocked);
                    final int i4 = this.pressedBotButton;
                    postDelayed(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$checkBotButtonMotionEvent$4(i4);
                        }
                    }, ViewConfiguration.getLongPressTimeout() - 1);
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.pressedBotButton == -1) {
                return false;
            }
            playSoundEffect(0);
            BotButton botButton2 = (BotButton) this.botButtons.get(this.pressedBotButton);
            Drawable drawable2 = botButton2.selectorDrawable;
            if (drawable2 != null) {
                drawable2.setState(StateSet.NOTHING);
            }
            botButton2.setPressed(false);
            if (this.currentMessageObject.scheduled) {
                Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledBotAction), 1).show();
            } else {
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate != null && !botButton2.isLocked) {
                    BotInlineKeyboard.ButtonCustom buttonCustom = botButton2.buttonCustom;
                    if (buttonCustom != null) {
                        chatMessageCellDelegate.didPressCustomBotButton(this, buttonCustom);
                    } else {
                        TL_keyboard.KeyboardInlineButton keyboardInlineButton = botButton2.button;
                        if (keyboardInlineButton != null) {
                            chatMessageCellDelegate.didPressBotButton(this, keyboardInlineButton);
                        }
                    }
                }
            }
            this.pressedBotButton = -1;
            invalidateOutbounds();
            return false;
        }
        if (motionEvent.getAction() != 3 || (i = this.pressedBotButton) == -1) {
            return false;
        }
        BotButton botButton3 = (BotButton) this.botButtons.get(i);
        Drawable drawable3 = botButton3.selectorDrawable;
        if (drawable3 != null) {
            drawable3.setState(StateSet.NOTHING);
        }
        botButton3.setPressed(false);
        this.pressedBotButton = -1;
        invalidateOutbounds();
        return false;
    }

    public void lambda$checkBotButtonMotionEvent$4(int i) {
        int i2 = this.pressedBotButton;
        if (i == i2) {
            BotButton botButton = (BotButton) this.botButtons.get(i2);
            if (botButton != null) {
                Drawable drawable = botButton.selectorDrawable;
                if (drawable != null) {
                    drawable.setState(StateSet.NOTHING);
                }
                botButton.setPressed(false);
                if (!this.currentMessageObject.scheduled) {
                    if (botButton.buttonCustom != null) {
                        cancelCheckLongPress();
                        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                        if (chatMessageCellDelegate != null) {
                            chatMessageCellDelegate.didLongPressCustomBotButton(this, botButton.buttonCustom);
                        }
                    } else if (botButton.button != null) {
                        cancelCheckLongPress();
                        ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
                        if (chatMessageCellDelegate2 != null) {
                            chatMessageCellDelegate2.didLongPressBotButton(this, botButton.button);
                        }
                    }
                }
            }
            this.pressedBotButton = -1;
            invalidateOutbounds();
        }
    }

    private boolean checkSummaryTouchEvent(MotionEvent motionEvent) {
        if (!this.drawSummaryReply || this.summaryTitle == null || this.summaryBounce == null || this.delegate == null) {
            return false;
        }
        float eventX = getEventX(motionEvent);
        float eventY = getEventY(motionEvent);
        if (motionEvent.getAction() == 0) {
            if (this.summarySelectorRect.contains(eventX, eventY)) {
                this.summaryBounce.setPressed(true);
                Drawable drawable = this.summaryReplySelector;
                if (drawable != null) {
                    drawable.setHotspot(eventX, eventY);
                    this.summaryReplySelector.setState(new int[]{16842919, 16842910});
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.summaryBounce.isPressed() && !this.summarySelectorRect.contains(eventX, eventY)) {
                this.summaryBounce.setPressed(false);
                Drawable drawable2 = this.summaryReplySelector;
                if (drawable2 != null) {
                    drawable2.setState(new int[0]);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.summaryBounce.isPressed()) {
                this.delegate.didPressSummarize(this, true);
            }
            this.summaryBounce.setPressed(false);
            Drawable drawable3 = this.summaryReplySelector;
            if (drawable3 != null) {
                drawable3.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            this.summaryBounce.setPressed(false);
            Drawable drawable4 = this.summaryReplySelector;
            if (drawable4 != null) {
                drawable4.setState(new int[0]);
            }
        }
        return this.summaryBounce.isPressed();
    }

    private boolean checkAdminTouchEvent(MotionEvent motionEvent) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (this.adminLayout == null || (chatMessageCellDelegate = this.delegate) == null || !chatMessageCellDelegate.canPerformActions()) {
            return false;
        }
        boolean zContains = this.adminLayoutRect.contains(motionEvent.getX(), motionEvent.getY());
        if (this.adminLayoutBounce == null) {
            this.adminLayoutBounce = new ButtonBounce(this);
        }
        if (motionEvent.getAction() == 0) {
            this.adminLayoutBounce.setPressed(zContains);
        } else if (motionEvent.getAction() == 2) {
            if (!zContains) {
                this.adminLayoutBounce.setPressed(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.adminLayoutBounce.isPressed()) {
                this.delegate.didPressAdmin(this);
            }
            this.adminLayoutBounce.setPressed(false);
        } else if (motionEvent.getAction() == 3) {
            this.adminLayoutBounce.setPressed(false);
        }
        return this.adminLayoutBounce.isPressed();
    }

    private boolean checkReplyTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkReplyTouchEvent(android.view.MotionEvent):boolean");
    }

    public void lambda$checkReplyTouchEvent$5() {
        if (this.replyPressed && !this.replySelectorPressed && this.replySelectorCanBePressed) {
            this.replySelectorPressed = true;
            this.replySelector.setState(new int[]{16842919, 16842910});
        }
    }

    public void lambda$checkReplyTouchEvent$6() {
        this.replySelector.setState(new int[0]);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r20) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkReactionsTouchEvent(MotionEvent motionEvent) {
        MessageObject.GroupedMessages groupedMessages;
        if (this.currentMessageObject.hasValidGroupId() && (groupedMessages = this.currentMessagesGroup) != null && !groupedMessages.isDocuments) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup == null) {
                return false;
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                    MessageObject.GroupedMessagePosition currentPosition = chatMessageCell.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.currentMessagesGroup.groupId) {
                        int i2 = currentPosition.flags;
                        if ((i2 & 8) != 0 && (i2 & 1) != 0) {
                            if (chatMessageCell == this) {
                                return this.reactionsLayoutInBubble.checkTouchEvent(motionEvent);
                            }
                            motionEvent.offsetLocation(getLeft() - chatMessageCell.getLeft(), getTop() - chatMessageCell.getTop());
                            boolean zCheckTouchEvent = chatMessageCell.reactionsLayoutInBubble.checkTouchEvent(motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - chatMessageCell.getLeft()), -(getTop() - chatMessageCell.getTop()));
                            return zCheckTouchEvent;
                        }
                    }
                }
            }
            return false;
        }
        return this.reactionsLayoutInBubble.checkTouchEvent(motionEvent);
    }

    private boolean checkPinchToZoom(MotionEvent motionEvent) {
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        PinchToZoomHelper pinchToZoomHelper = chatMessageCellDelegate == null ? null : chatMessageCellDelegate.getPinchToZoomHelper();
        if (this.currentMessageObject == null || !this.photoImage.hasNotThumb() || pinchToZoomHelper == null || this.currentMessageObject.isSticker() || this.currentMessageObject.isAnimatedEmoji() || ((this.currentMessageObject.isVideo() && !this.autoPlayingMedia) || this.isRoundVideo || this.currentMessageObject.isAnimatedSticker() || ((this.currentMessageObject.isDocument() && !this.currentMessageObject.isGif()) || this.currentMessageObject.needDrawBluredPreview()))) {
            return false;
        }
        ImageReceiver imageReceiver = this.photoImage;
        MessageObject messageObject = this.currentMessageObject;
        SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
        return pinchToZoomHelper.checkPinchToZoom(motionEvent, this, imageReceiver, null, null, messageObject, spoilerEffect2 == null ? 0 : spoilerEffect2.getAttachIndex(this));
    }

    private boolean checkTextSelection(MotionEvent motionEvent) {
        TextSelectionHelper.ChatListTextSelectionHelper textSelectionHelper;
        int i;
        int iDp;
        int iDp2;
        int iDp3;
        int extraTextX;
        int iMax;
        MessageObject.GroupedMessages groupedMessages;
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate == null || (textSelectionHelper = chatMessageCellDelegate.getTextSelectionHelper()) == null || textSelectionHelper.isMenuEmpty()) {
            return false;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = this.currentMessageObject.textLayoutBlocks;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        RichMessageLayout richMessageLayout = this.currentMessageObject.richLayout;
        boolean z2 = (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) ? false : true;
        if (!z && !hasCaptionLayout() && !z2) {
            return false;
        }
        if ((!this.drawSelectionBackground && this.currentMessagesGroup == null) || (this.currentMessagesGroup != null && !this.delegate.hasSelectedMessages())) {
            return false;
        }
        if (this.currentMessageObject.hasValidGroupId() && (groupedMessages = this.currentMessagesGroup) != null && !groupedMessages.isDocuments) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup == null) {
                return false;
            }
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                    MessageObject.GroupedMessagePosition currentPosition = chatMessageCell.getCurrentPosition();
                    if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.currentMessagesGroup.groupId && (currentPosition.flags & captionFlag()) != 0 && (currentPosition.flags & 1) != 0) {
                        textSelectionHelper.setMaybeTextCord((int) chatMessageCell.captionX, (int) chatMessageCell.captionY);
                        textSelectionHelper.setMessageObject(chatMessageCell);
                        if (chatMessageCell == this) {
                            return textSelectionHelper.onTouchEvent(motionEvent);
                        }
                        motionEvent.offsetLocation(getLeft() - chatMessageCell.getLeft(), getTop() - chatMessageCell.getTop());
                        boolean zOnTouchEvent = textSelectionHelper.onTouchEvent(motionEvent);
                        motionEvent.offsetLocation(-(getLeft() - chatMessageCell.getLeft()), -(getTop() - chatMessageCell.getTop()));
                        return zOnTouchEvent;
                    }
                }
            }
            return false;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && !messageObject.preview && this.factCheckTextLayout != null && getEventY(motionEvent) >= this.factCheckY) {
            textSelectionHelper.setIsDescription(false);
            textSelectionHelper.setIsFactCheck(true);
            textSelectionHelper.setIsRich(false);
            MessageObject.GroupedMessages groupedMessages2 = this.currentMessagesGroup;
            if (groupedMessages2 != null && !groupedMessages2.isDocuments) {
                iMax = (int) this.captionX;
            } else if (this.currentMessageObject.isOutOwner()) {
                int iDp4 = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                iMax = this.currentMessageObject.type == 19 ? iDp4 - Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + iDp4) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x) : iDp4;
            } else {
                if (this.mediaBackground) {
                    iDp3 = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f);
                    extraTextX = getExtraTextX();
                } else {
                    iDp3 = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
                    extraTextX = getExtraTextX();
                }
                iMax = iDp3 + extraTextX;
            }
            textSelectionHelper.setMaybeTextCord(((((int) (iMax + this.transitionParams.deltaLeft)) - AndroidUtilities.dp(1.33f)) + AndroidUtilities.dp(10.0f)) - this.factCheckTextLayoutLeft, this.factCheckY + AndroidUtilities.dp(22.0f));
        } else if (hasCaptionLayout()) {
            textSelectionHelper.setIsDescription(false);
            textSelectionHelper.setIsFactCheck(false);
            textSelectionHelper.setIsRich(false);
            textSelectionHelper.setMaybeTextCord((int) this.captionX, (int) this.captionY);
        } else {
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null && !messageObject2.preview && this.descriptionLayout != null && (!this.linkPreviewAbove ? getEventY(motionEvent) > this.descriptionY : getEventY(motionEvent) < this.textY)) {
                textSelectionHelper.setIsDescription(true);
                textSelectionHelper.setIsFactCheck(false);
                textSelectionHelper.setIsRich(false);
                if (this.hasGamePreview) {
                    iDp2 = this.unmovedTextX - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.hasInvoicePreview) {
                        i = this.unmovedTextX;
                        iDp = AndroidUtilities.dp(1.0f);
                    } else {
                        i = this.unmovedTextX;
                        iDp = AndroidUtilities.dp(1.0f);
                    }
                    iDp2 = i + iDp;
                }
                textSelectionHelper.setMaybeTextCord(iDp2 + AndroidUtilities.dp(10.0f) + this.descriptionX, this.descriptionY);
            } else if (z2) {
                textSelectionHelper.setIsDescription(false);
                textSelectionHelper.setIsFactCheck(false);
                textSelectionHelper.setIsRich(true);
                textSelectionHelper.setMaybeTextCord(this.textX, this.textY);
            } else {
                textSelectionHelper.setIsDescription(false);
                textSelectionHelper.setIsFactCheck(false);
                textSelectionHelper.setIsRich(false);
                textSelectionHelper.setMaybeTextCord(this.textX, this.textY);
            }
        }
        textSelectionHelper.setMessageObject(this);
        return textSelectionHelper.onTouchEvent(motionEvent);
    }

    private void updateSelectionTextPosition() {
        int iDp;
        int extraTextX;
        int iDp2;
        int i;
        int iDp3;
        int iDp4;
        if (getDelegate() == null || getDelegate().getTextSelectionHelper() == null || !getDelegate().getTextSelectionHelper().isSelected(this.currentMessageObject)) {
            return;
        }
        int textSelectionType = getDelegate().getTextSelectionHelper().getTextSelectionType(this);
        if (textSelectionType == TextSelectionHelper.ChatListTextSelectionHelper.TYPE_DESCRIPTION) {
            if (this.hasGamePreview) {
                iDp4 = this.unmovedTextX - AndroidUtilities.dp(10.0f);
            } else {
                if (this.hasInvoicePreview) {
                    i = this.unmovedTextX;
                    iDp3 = AndroidUtilities.dp(1.0f);
                } else {
                    i = this.unmovedTextX;
                    iDp3 = AndroidUtilities.dp(1.0f);
                }
                iDp4 = i + iDp3;
            }
            getDelegate().getTextSelectionHelper().updateTextPosition(iDp4 + AndroidUtilities.dp(10.0f) + this.descriptionX, this.descriptionY);
            return;
        }
        if (textSelectionType == TextSelectionHelper.ChatListTextSelectionHelper.TYPE_CAPTION) {
            updateCaptionLayout();
            getDelegate().getTextSelectionHelper().updateTextPosition((int) this.captionX, (int) this.captionY);
            return;
        }
        if (textSelectionType == TextSelectionHelper.ChatListTextSelectionHelper.TYPE_FACTCHECK) {
            MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                iDp2 = (int) this.captionX;
            } else {
                if (this.currentMessageObject.isOutOwner()) {
                    iDp2 = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                    if (this.currentMessageObject.type == 19) {
                        iDp2 -= Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + iDp2) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.mediaBackground) {
                        iDp = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f);
                        extraTextX = getExtraTextX();
                    } else {
                        iDp = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
                        extraTextX = getExtraTextX();
                    }
                    iDp2 = iDp + extraTextX;
                }
            }
            int iDp5 = ((int) (iDp2 + this.transitionParams.deltaLeft)) - AndroidUtilities.dp(1.33f);
            int i2 = this.factCheckY;
            updateCaptionLayout();
            getDelegate().getTextSelectionHelper().updateTextPosition((iDp5 + AndroidUtilities.dp(10.0f)) - this.factCheckTextLayoutLeft, i2 + AndroidUtilities.dp(22.0f));
            return;
        }
        getDelegate().getTextSelectionHelper().updateTextPosition(this.textX, this.textY);
    }

    public ArrayList<PollButton> getPollButtons() {
        return this.pollButtons;
    }

    public void toggleTodoCheck(int i, boolean z) {
        if (i < 0 || i >= this.pollButtons.size()) {
            return;
        }
        PollButton pollButton = (PollButton) this.pollButtons.get(i);
        if (this.delegate.didPressToDoButton(this, pollButton.task, !pollButton.chosen)) {
            if (z) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            long dialogId = this.currentMessageObject.getDialogId();
            long sendAsPeerId = ChatObject.getSendAsPeerId(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(dialogId)), MessagesController.getInstance(this.currentAccount).getChatFull(dialogId), true);
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.currentMessageObject);
            MessageObject.toggleTodo(this.currentAccount, sendAsPeerId, tL_messageMediaToDo, pollButton.task.id, !pollButton.chosen, ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
            if (!pollButton.chosen) {
                TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(sendAsPeerId);
                pollButton.avatarDrawable.setInfo(userOrChat);
                pollButton.avatarImageReceiver.setForUserOrChat(userOrChat, pollButton.avatarDrawable);
                pollButton.author = new Text(DialogObject.getName(userOrChat), 12.0f);
            }
            this.pollCheckBox[i].setChecked(!pollButton.chosen, true);
            if (this.animatedInfoLayout != null) {
                if (!this.currentMessageObject.isOutOwner() && this.currentMessageObject.getDialogId() >= 0 && !tL_messageMediaToDo.todo.others_can_complete) {
                    this.animatedInfoLayout.setText(LocaleController.formatPluralStringComma("TodoCompletedBy", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo)), DialogObject.getName(this.currentMessageObject.getFromChatId())));
                } else {
                    this.animatedInfoLayout.setText(LocaleController.formatPluralStringComma("TodoCompleted", tL_messageMediaToDo.todo.list.size(), Integer.valueOf(MessageObject.getCompletionsCount(tL_messageMediaToDo))));
                }
            }
            pollButton.chosen = !pollButton.chosen;
            invalidate();
            return;
        }
        this.pollVoteInProgress = false;
    }

    public void syncTodoCheck(int i, ChatMessageCell chatMessageCell) {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        CheckBoxBase[] checkBoxBaseArr2 = this.pollCheckBox;
        if (checkBoxBaseArr2 == null || i < 0 || i >= checkBoxBaseArr2.length || (checkBoxBase = checkBoxBaseArr2[i]) == null || chatMessageCell == null || (checkBoxBaseArr = chatMessageCell.pollCheckBox) == null || i < 0 || i >= checkBoxBaseArr.length || (checkBoxBase2 = checkBoxBaseArr[i]) == null) {
            return;
        }
        checkBoxBase.cancelCheckAnimator();
        checkBoxBase.setProgress(checkBoxBase2.getProgress());
        checkBoxBase.setChecked(checkBoxBase2.isChecked(), true);
    }

    public void updatePlayingMessageProgress() {
        boolean z;
        double dMax;
        double currentProgressMs;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        OldVideoPlayerRewinder oldVideoPlayerRewinder = this.videoPlayerRewinder;
        if (oldVideoPlayerRewinder != null && oldVideoPlayerRewinder.rewindCount != 0 && oldVideoPlayerRewinder.rewindByBackSeek) {
            messageObject.audioProgress = oldVideoPlayerRewinder.getVideoProgress();
        }
        if (this.currentMessageObject.isPoll()) {
            PollContentDrawable pollContentDrawable = this.pollContentDrawable;
            if (pollContentDrawable != null) {
                pollContentDrawable.updatePlayingMessageProgress();
            }
            PollContentDrawable pollContentDrawable2 = this.pollExplanationDrawable;
            if (pollContentDrawable2 != null) {
                pollContentDrawable2.updatePlayingMessageProgress();
            }
        }
        double d = 0.0d;
        if (this.documentAttachType == 4) {
            SeekBar seekBar = this.seekBar;
            if (seekBar != null) {
                seekBar.clearTimestamps();
            }
            if (this.infoLayout == null || !(PhotoViewer.isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isGoingToShowMessageObject(this.currentMessageObject))) {
                AnimatedFileDrawable animation = this.photoImage.getAnimation();
                if (animation != null) {
                    MessageObject messageObject2 = this.currentMessageObject;
                    int durationMs = animation.getDurationMs() / 1000;
                    messageObject2.audioPlayerDuration = durationMs;
                    currentProgressMs = durationMs;
                    MessageObject messageObject3 = this.currentMessageObject;
                    TLRPC.Message message = messageObject3.messageOwner;
                    if (message.ttl > 0 && message.destroyTime == 0 && !messageObject3.needDrawBluredPreview() && this.currentMessageObject.isVideo() && animation.hasBitmap()) {
                        this.delegate.didStartVideoStream(this.currentMessageObject);
                    }
                } else {
                    currentProgressMs = 0.0d;
                }
                if (currentProgressMs == 0.0d) {
                    currentProgressMs = this.currentMessageObject.getDuration();
                }
                if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                    currentProgressMs -= this.currentMessageObject.audioProgress * currentProgressMs;
                } else if (animation != null) {
                    if (currentProgressMs != 0.0d) {
                        currentProgressMs -= animation.getCurrentProgressMs() / 1000;
                    }
                    if (this.delegate != null && animation.getCurrentProgressMs() >= 3000) {
                        this.delegate.videoTimerReached();
                    }
                }
                if (this.lastTime != currentProgressMs) {
                    String shortDuration = AndroidUtilities.formatShortDuration((int) currentProgressMs);
                    this.infoWidth = (int) Math.ceil(Theme.chat_infoPaint.measureText(shortDuration));
                    this.infoLayout = new StaticLayout(shortDuration, Theme.chat_infoPaint, this.infoWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.lastTime = currentProgressMs;
                    return;
                }
                return;
            }
            return;
        }
        boolean z2 = true;
        if (this.isRoundVideo) {
            if (this.useSeekBarWaveform) {
                if (!this.seekBarWaveform.isDragging()) {
                    this.seekBarWaveform.setProgress(this.currentMessageObject.audioProgress, true);
                }
            } else {
                if (!this.seekBar.isDragging()) {
                    this.seekBar.setProgress(this.currentMessageObject.audioProgress);
                    this.seekBar.setBufferedProgress(this.currentMessageObject.bufferedProgress);
                }
                this.seekBar.clearTimestamps();
            }
            TLRPC.Document document = this.currentMessageObject.getDocument();
            if (document != null) {
                while (i < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        dMax = documentAttribute.duration;
                        break;
                    }
                    i++;
                }
                dMax = 0.0d;
            } else {
                dMax = 0.0d;
            }
            long j = this.overridenDuration;
            if (j >= 0) {
                dMax = j;
            } else if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                dMax = Math.max(0.0d, dMax - this.currentMessageObject.audioProgressSec);
            }
            if (this.lastTime != dMax) {
                this.lastTime = dMax;
                String longDuration = AndroidUtilities.formatLongDuration((int) dMax);
                this.timeWidthAudio = (int) Math.ceil(Theme.chat_timePaint.measureText(longDuration));
                this.durationLayout = new StaticLayout(longDuration, Theme.chat_timePaint, this.timeWidthAudio, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f = this.currentMessageObject.audioProgress;
            if (f != 0.0f) {
                this.lastDrawingAudioProgress = f;
                if (f > 0.9f) {
                    this.lastDrawingAudioProgress = 1.0f;
                }
            }
            invalidate();
            return;
        }
        if (this.documentAttach != null) {
            if (this.useSeekBarWaveform) {
                if (!this.seekBarWaveform.isDragging()) {
                    this.seekBarWaveform.setProgress(this.currentMessageObject.audioProgress, true);
                }
                z = true;
            } else {
                if (!this.seekBar.isDragging()) {
                    this.seekBar.setProgress(this.currentMessageObject.audioProgress);
                    this.seekBar.setBufferedProgress(this.currentMessageObject.bufferedProgress);
                }
                this.seekBar.updateTimestamps(this.currentMessageObject, null);
                z = false;
            }
            int i = this.documentAttachType;
            if (i == 5) {
                z = true;
            }
            if (i == 3) {
                long j2 = this.overridenDuration;
                if (j2 >= 0) {
                    d = j2;
                } else if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                    while (true) {
                        if (i >= this.documentAttach.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute2 = this.documentAttach.attributes.get(i);
                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute2.duration;
                            break;
                        }
                        i++;
                    }
                } else {
                    d = this.currentMessageObject.audioProgressSec;
                }
                if (this.lastTime != d) {
                    this.lastTime = d;
                    String longDuration2 = AndroidUtilities.formatLongDuration((int) d);
                    this.timeWidthAudio = (int) Math.ceil(Theme.chat_audioTimePaint.measureText(longDuration2));
                    this.durationLayout = new StaticLayout(longDuration2, Theme.chat_audioTimePaint, this.timeWidthAudio, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
            } else {
                double duration = this.currentMessageObject.getDuration();
                i = MediaController.getInstance().isPlayingMessage(this.currentMessageObject) ? this.currentMessageObject.audioProgressSec : 0;
                double d2 = i;
                if (this.lastTime != d2) {
                    this.lastTime = d2;
                    this.durationLayout = new StaticLayout(AndroidUtilities.formatShortDuration(i, (int) duration), Theme.chat_audioTimePaint, (int) Math.ceil(Theme.chat_audioTimePaint.measureText(r4)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                z2 = z;
            }
            if (z2) {
                invalidate();
            }
        }
    }

    public void overrideDuration(long j) {
        this.overridenDuration = j;
    }

    public void setFullyDraw(boolean z) {
        this.fullyDraw = z;
    }

    public void setParentViewSize(int i, int i2) {
        MessageDrawable messageDrawable;
        this.parentWidth = i;
        this.parentHeight = i2;
        this.backgroundHeight = i2;
        if (!(this.currentMessageObject != null && hasGradientService() && this.currentMessageObject.shouldDrawWithoutBackground()) && ((messageDrawable = this.currentBackgroundDrawable) == null || messageDrawable.getGradientShader() == null)) {
            return;
        }
        invalidate();
    }

    public void copyVisiblePartTo(ChatMessageCell chatMessageCell) {
        if (chatMessageCell == null) {
            return;
        }
        chatMessageCell.setVisiblePart(this.childPosition, this.visibleHeight, this.visibleParent, this.visibleParentOffset, this.visibleTop, this.parentWidth, this.parentHeight, this.blurredViewTopOffset, this.blurredViewBottomOffset, this.childPosition2);
    }

    public void copyParamsTo(ChatMessageCell chatMessageCell) {
        if (chatMessageCell == null) {
            return;
        }
        chatMessageCell.isChat = this.isChat;
        chatMessageCell.isReportChat = this.isReportChat;
        chatMessageCell.isSavedChat = this.isSavedChat;
        chatMessageCell.isSavedPreviewChat = this.isSavedPreviewChat;
        chatMessageCell.isBot = this.isBot;
        chatMessageCell.isMegagroup = this.isMegagroup;
        chatMessageCell.isForum = this.isForum;
        chatMessageCell.isMonoForum = this.isMonoForum;
        chatMessageCell.isForumGeneral = this.isForumGeneral;
        chatMessageCell.isThreadChat = this.isThreadChat;
        chatMessageCell.hasDiscussion = this.hasDiscussion;
        chatMessageCell.isPinned = this.isPinned;
        chatMessageCell.linkedChatId = this.linkedChatId;
        chatMessageCell.isRepliesChat = this.isRepliesChat;
        chatMessageCell.isPinnedChat = this.isPinnedChat;
        chatMessageCell.isAllChats = this.isAllChats;
        chatMessageCell.isSideMenued = this.isSideMenued;
        chatMessageCell.isSideMenuEnabled = this.isSideMenuEnabled;
        chatMessageCell.sideMenuAlpha = this.sideMenuAlpha;
        chatMessageCell.sideMenuWidth = this.sideMenuWidth;
    }

    public void setVisiblePart(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, int i8) {
        RichMessageLayout richMessageLayout;
        MessageObject messageObject;
        this.childPosition = i;
        this.visibleHeight = i2;
        this.visibleParent = i3;
        this.parentWidth = i4;
        this.parentHeight = i5;
        this.visibleTop = f2;
        this.visibleParentOffset = f;
        this.backgroundHeight = i5;
        this.blurredViewTopOffset = i6;
        this.blurredViewBottomOffset = i7;
        this.childPosition2 = i8;
        if ((!this.botButtons.isEmpty() || (this.channelRecommendationsCell != null && (messageObject = this.currentMessageObject) != null && messageObject.type == 27)) && this.viewTop != f2) {
            invalidate();
        }
        this.viewTop = f2;
        if (i3 != this.parentHeight || f != this.parentViewTopOffset) {
            this.parentViewTopOffset = f;
            this.parentHeight = i3;
        }
        if (this.currentMessageObject != null && hasGradientService() && this.currentMessageObject.shouldDrawWithoutBackground()) {
            invalidate();
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && messageObject2.textLayoutBlocks != null) {
            int i9 = i - this.textY;
            int i10 = 0;
            for (int i11 = 0; i11 < this.currentMessageObject.textLayoutBlocks.size() && this.currentMessageObject.textLayoutBlocks.get(i11).textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams) <= i9; i11++) {
                i10 = i11;
            }
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            while (i10 < this.currentMessageObject.textLayoutBlocks.size()) {
                float fTextYOffset = this.currentMessageObject.textLayoutBlocks.get(i10).textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams);
                float fHeight = r14.padTop + fTextYOffset + r14.height(this.transitionParams) + r14.padBottom;
                float f3 = i9;
                if (!intersect(fTextYOffset, fHeight, f3, i9 + i2)) {
                    if (fTextYOffset > f3) {
                        break;
                    }
                } else {
                    if (i12 == -1) {
                        i12 = i10;
                    }
                    i14++;
                    i13 = i10;
                }
                i10++;
            }
            if (this.lastVisibleBlockNum != i13 || this.firstVisibleBlockNum != i12 || this.totalVisibleBlocksCount != i14) {
                this.lastVisibleBlockNum = i13;
                this.firstVisibleBlockNum = i12;
                this.totalVisibleBlocksCount = i14;
                invalidate();
            } else if (this.animatedEmojiStack != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= this.animatedEmojiStack.holders.size()) {
                        break;
                    }
                    AnimatedEmojiSpan.AnimatedEmojiHolder animatedEmojiHolder = (AnimatedEmojiSpan.AnimatedEmojiHolder) this.animatedEmojiStack.holders.get(i15);
                    if (animatedEmojiHolder != null && animatedEmojiHolder.skipDraw && !animatedEmojiHolder.outOfBounds((this.parentBoundsTop - getY()) - animatedEmojiHolder.drawingYOffset, (this.parentBoundsBottom - getY()) - animatedEmojiHolder.drawingYOffset)) {
                        invalidate();
                        break;
                    }
                    i15++;
                }
            }
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null && (richMessageLayout = messageObject3.richLayout) != null) {
            int i16 = i - this.textY;
            int i17 = -1;
            int i18 = -1;
            for (int i19 = 0; i19 < richMessageLayout.blocks.size(); i19++) {
                RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i19);
                if (richBlock.currVisible || richBlock.prevVisible) {
                    float f4 = richBlock.currY;
                    float f5 = i16 + i2;
                    if (!intersect(f4, richBlock.getHeight() + f4, i16, f5)) {
                        if (f4 > f5) {
                            break;
                        }
                    } else {
                        if (i17 == -1) {
                            i17 = i19;
                        }
                        i18 = i19;
                    }
                }
            }
            if (this.firstVisibleRichBlock != i17 || this.lastVisibleRichBlock != i18) {
                this.firstVisibleRichBlock = i17;
                this.lastVisibleRichBlock = i18;
                invalidate();
            }
        }
        if (!this.pollButtons.isEmpty()) {
            int i20 = -1;
            int i21 = -1;
            for (int i22 = 0; i22 < this.pollButtons.size(); i22++) {
                PollButton pollButton = (PollButton) this.pollButtons.get(i22);
                int i23 = pollButton.y + this.namesOffset;
                if (intersect(i23, i23 + pollButton.height, this.childPosition, r10 + this.visibleHeight)) {
                    if (i21 == -1) {
                        i21 = i22;
                    }
                    i20 = i22;
                }
            }
            if (this.lastVisiblePollButton != i20 || this.firstVisiblePollButton != i21) {
                this.lastVisiblePollButton = i20;
                this.firstVisiblePollButton = i21;
                invalidate();
            }
        }
        if (this.drawSummarizeButton) {
            if (Math.abs(this.summarizeButtonY - Math.max(Math.min((-this.childPosition2) + AndroidUtilities.dp(4.0f), this.sideStartY - AndroidUtilities.dp(42.0f)), getPaddingTop() + AndroidUtilities.dp(8.0f))) >= 1.0f) {
                invalidate();
            }
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        int i24 = reactionsLayoutInBubble.y;
        boolean zIntersect = intersect(i24, i24 + reactionsLayoutInBubble.height, this.childPosition, r6 + this.visibleHeight);
        if (this.reactionsVisible != zIntersect) {
            this.reactionsVisible = zIntersect;
            invalidate();
        }
    }

    public static StaticLayout generateStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, int i2, int i3, int i4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int i5 = i;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            staticLayout.getLineDirections(i7);
            if (staticLayout.getLineLeft(i7) != 0.0f || staticLayout.isRtlCharAt(staticLayout.getLineStart(i7)) || staticLayout.isRtlCharAt(staticLayout.getLineEnd(i7))) {
                i5 = i2;
            }
            int lineEnd = staticLayout.getLineEnd(i7);
            if (lineEnd == charSequence.length()) {
                break;
            }
            int i8 = (lineEnd - 1) + i6;
            if (spannableStringBuilder.charAt(i8) == ' ') {
                spannableStringBuilder.replace(i8, i8 + 1, (CharSequence) "\n");
            } else if (spannableStringBuilder.charAt(i8) != '\n') {
                spannableStringBuilder.insert(i8, (CharSequence) "\n");
                i6++;
            }
            if (i7 == staticLayout.getLineCount() - 1 || i7 == i4 - 1) {
                break;
            }
        }
        int i9 = i5;
        return StaticLayoutEx.createStaticLayout(spannableStringBuilder, textPaint, i9, Layout.Alignment.ALIGN_NORMAL, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, i9, i4, true);
    }

    private void didClickedPollImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i) {
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate != null) {
            chatMessageCellDelegate.didPressPollMedia(chatMessageCell, imageReceiver, pollAnswer, messageMedia, f, f2, i);
        }
    }

    private void didClickedImage() throws Resources.NotFoundException, NumberFormatException {
        MessageObject messageObject;
        ChatMessageCellDelegate chatMessageCellDelegate;
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia messageMedia;
        if (this.currentMessageObject.hasMediaSpoilers() && !this.currentMessageObject.needDrawBluredPreview()) {
            MessageObject messageObject2 = this.currentMessageObject;
            if (!messageObject2.isMediaSpoilersRevealed) {
                if (this.delegate != null && messageObject2.isSensitive()) {
                    this.delegate.didPressRevealSensitiveContent(this);
                    return;
                } else {
                    startRevealMedia(this.lastTouchX, this.lastTouchY);
                    return;
                }
            }
        }
        MessageObject messageObject3 = this.currentMessageObject;
        int i = messageObject3.type;
        if (i == 20) {
            TLRPC.Message message = messageObject3.messageOwner;
            if (message == null || (messageMedia = message.media) == null || messageMedia.extended_media.isEmpty()) {
                return;
            }
            TLRPC.ReplyMarkup replyMarkup = this.currentMessageObject.messageOwner.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                Iterator<TL_keyboard.KeyboardInlineButtonRow> it = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.iterator();
                while (it.hasNext()) {
                    Iterator<TL_keyboard.KeyboardInlineButton> it2 = it.next().buttons.iterator();
                    if (it2.hasNext()) {
                        this.delegate.didPressExtendedMediaPreview(this, it2.next());
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == 1 || messageObject3.isAnyKindOfSticker()) {
            int i2 = this.buttonState;
            if (i2 == -1) {
                this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY, false);
                return;
            } else {
                if (i2 == 0) {
                    didPressButton(true, false);
                    return;
                }
                return;
            }
        }
        MessageObject messageObject4 = this.currentMessageObject;
        int i3 = messageObject4.type;
        if (i3 == 12) {
            long j = MessageObject.getMedia(messageObject4.messageOwner).user_id;
            this.delegate.didPressUserAvatar(this, j != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)) : null, this.lastTouchX, this.lastTouchY, false);
            return;
        }
        if (i3 == 5) {
            if (this.buttonState != -1) {
                didPressButton(true, false);
                return;
            } else if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) {
                this.delegate.needPlayMessage(this, this.currentMessageObject, false);
                return;
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject);
                return;
            }
        }
        if (i3 == 8) {
            int i4 = this.buttonState;
            if (i4 == -1 || (i4 == 1 && this.canStreamVideo && this.autoPlayingMedia)) {
                this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY, false);
                return;
            } else {
                if (i4 == 2 || i4 == 0) {
                    didPressButton(true, false);
                    return;
                }
                return;
            }
        }
        if (this.documentAttachType == 4 || messageObject4.hasVideoQualities()) {
            if (this.buttonState == -1 || (this.drawVideoImageButton && (this.autoPlayingMedia || (((messageObject = this.currentMessageObject) != null && messageObject.hasVideoQualities()) || (SharedConfig.streamMedia && this.canStreamVideo))))) {
                this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY, false);
                return;
            }
            if (this.drawVideoImageButton) {
                didPressButton(true, true);
                return;
            }
            int i5 = this.buttonState;
            if (i5 == 0 || i5 == 3) {
                didPressButton(true, false);
                return;
            }
            return;
        }
        MessageObject messageObject5 = this.currentMessageObject;
        int i6 = messageObject5.type;
        if (i6 == 4 || i6 == 17 || i6 == 23 || i6 == 24) {
            this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY, false);
            return;
        }
        int i7 = this.documentAttachType;
        if (i7 == 1) {
            if (this.buttonState == -1) {
                this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY, false);
                return;
            }
            return;
        }
        if (messageObject5.sponsoredMedia != null) {
            ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
            if (chatMessageCellDelegate2 != null) {
                chatMessageCellDelegate2.didPressImage(this, this.lastTouchX, this.lastTouchY, false);
                return;
            }
            return;
        }
        if (i7 == 2) {
            if (this.buttonState != -1 || (webPage = MessageObject.getMedia(messageObject5.messageOwner).webpage) == null) {
                return;
            }
            String str = webPage.embed_url;
            if (str != null && str.length() != 0) {
                this.delegate.needOpenWebView(this.currentMessageObject, webPage.embed_url, webPage.site_name, webPage.description, webPage.url, webPage.embed_width, webPage.embed_height);
                return;
            } else {
                Browser.openUrl(getContext(), webPage.url);
                return;
            }
        }
        if (this.hasInvoicePreview) {
            if (this.buttonState == -1) {
                this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY, false);
            }
        } else {
            if (Build.VERSION.SDK_INT < 26 || (chatMessageCellDelegate = this.delegate) == null) {
                return;
            }
            if (i6 == 16) {
                chatMessageCellDelegate.didLongPress(this, 0.0f, 0.0f);
            } else {
                chatMessageCellDelegate.didPressOther(this, this.otherX, this.otherY);
            }
        }
    }

    private void updateSecretTimeText(MessageObject messageObject) {
        CharSequence secretTimeString;
        if (messageObject == null || !messageObject.needDrawBluredPreview() || (secretTimeString = messageObject.getSecretTimeString()) == null) {
            return;
        }
        if (secretTimeString instanceof String) {
            int iCeil = (int) Math.ceil(Theme.chat_infoPaint.measureText((String) secretTimeString));
            this.infoWidth = iCeil;
            this.infoLayout = new StaticLayout(TextUtils.ellipsize(secretTimeString, Theme.chat_infoPaint, iCeil, TextUtils.TruncateAt.END), Theme.chat_infoPaint, this.infoWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            StaticLayout staticLayout = new StaticLayout(secretTimeString, Theme.chat_infoBoldPaint, getMeasuredWidth() > 0 ? getMeasuredWidth() : 9999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.infoLayout = staticLayout;
            this.infoWidth = staticLayout.getLineCount() > 0 ? (int) this.infoLayout.getLineWidth(0) : 0;
        }
        invalidate();
    }

    private boolean isPhotoDataChanged(org.telegram.messenger.MessageObject r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.isPhotoDataChanged(org.telegram.messenger.MessageObject):boolean");
    }

    public int getRepliesCount() {
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            return this.currentMessagesGroup.messages.get(0).getRepliesCount();
        }
        return this.currentMessageObject.getRepliesCount();
    }

    private ArrayList<TLRPC.Peer> getRecentRepliers() {
        TLRPC.MessageReplies messageReplies;
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty() && (messageReplies = this.currentMessagesGroup.messages.get(0).messageOwner.replies) != null) {
            return messageReplies.recent_repliers;
        }
        TLRPC.MessageReplies messageReplies2 = this.currentMessageObject.messageOwner.replies;
        if (messageReplies2 != null) {
            return messageReplies2.recent_repliers;
        }
        return null;
    }

    public void updateAnimatedEmojis() {
        MessageObject messageObject;
        RichMessageLayout richMessageLayout;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        if (!this.imageReceiversAttachState || (messageObject = this.currentMessageObject) == null) {
            return;
        }
        int cacheTypeForEnterView = messageObject.wasJustSent ? AnimatedEmojiDrawable.getCacheTypeForEnterView() : 0;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.captionLayout;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            this.animatedEmojiStack = AnimatedEmojiSpan.update(cacheTypeForEnterView, (View) this, false, this.animatedEmojiStack, arrayList);
        } else {
            ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
            this.animatedEmojiStack = AnimatedEmojiSpan.update(cacheTypeForEnterView, this, chatMessageCellDelegate == null || !chatMessageCellDelegate.canDrawOutboundsContent(), this.animatedEmojiStack, this.currentMessageObject.textLayoutBlocks);
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2.type != 36 || (richMessageLayout = messageObject2.richLayout) == null) {
            return;
        }
        ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
        richMessageLayout.invalidateAnimatedEmojiInParent = chatMessageCellDelegate2 == null || !chatMessageCellDelegate2.canDrawOutboundsContent();
        this.currentMessageObject.richLayout.updateAnimatedEmojis(cacheTypeForEnterView);
    }

    private boolean isUserDataChanged() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.isUserDataChanged():boolean");
    }

    public ImageReceiver getPhotoImage() {
        return this.photoImage;
    }

    public ImageReceiver getPhotoImage(int i) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 17) {
            if (i == -2) {
                PollContentDrawable pollContentDrawable = this.pollContentDrawable;
                if (pollContentDrawable != null) {
                    return pollContentDrawable.getImageReceiver();
                }
                return null;
            }
            if (i == -3) {
                PollContentDrawable pollContentDrawable2 = this.pollExplanationDrawable;
                if (pollContentDrawable2 != null) {
                    return pollContentDrawable2.getImageReceiver();
                }
                return null;
            }
            ArrayList arrayList = this.pollButtons;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PollButton pollButton = (PollButton) it.next();
                    if (pollButton.pollButtonDrawable != null && pollButton.answer != null && pollButton.answer.unshuffled_index == i) {
                        return pollButton.pollButtonDrawable.getImageReceiver();
                    }
                }
            }
        }
        GroupMedia groupMedia = this.groupMedia;
        if (groupMedia != null) {
            return groupMedia.getPhotoImage(i);
        }
        return this.photoImage;
    }

    public ImageReceiver getBlurredPhotoImage() {
        return this.blurredPhotoImage;
    }

    public int getNoSoundIconCenterX() {
        return this.noSoundCenterX;
    }

    public int getForwardNameCenterX() {
        float centerX;
        TLRPC.User user = this.currentUser;
        if (user != null && user.id == 0) {
            centerX = this.avatarImage.getCenterX();
        } else {
            centerX = this.forwardNameX + this.forwardNameCenterX;
        }
        return (int) centerX;
    }

    public int getChecksX() {
        return this.layoutWidth - AndroidUtilities.dp(SharedConfig.bubbleRadius >= 10 ? 27.3f : 25.3f);
    }

    public int getChecksY() {
        float f;
        int intrinsicHeight;
        if (this.currentMessageObject.shouldDrawWithoutBackground()) {
            f = this.drawTimeY;
            intrinsicHeight = getThemedDrawable("drawableMsgStickerCheck").getIntrinsicHeight();
        } else {
            f = this.drawTimeY;
            intrinsicHeight = Theme.chat_msgMediaCheckDrawable.getIntrinsicHeight();
        }
        return (int) (f - intrinsicHeight);
    }

    public void overrideAudioVisualizer(AudioVisualizerDrawable audioVisualizerDrawable) {
        this.overridenAudioVisualizer = audioVisualizerDrawable;
    }

    public TLRPC.User getCurrentUser() {
        return this.currentUser;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.currentChat;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startSpoilers);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopSpoilers);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        cancelShakeAnimation();
        CheckBoxBase checkBoxBase = this.checkBox;
        if (checkBoxBase != null) {
            checkBoxBase.onDetachedFromWindow();
        }
        PollContentDrawable pollContentDrawable = this.pollContentDrawable;
        if (pollContentDrawable != null) {
            pollContentDrawable.detach();
        }
        PollContentDrawable pollContentDrawable2 = this.pollExplanationDrawable;
        if (pollContentDrawable2 != null) {
            pollContentDrawable2.detach();
        }
        CountdownTimer countdownTimer = this.pollCountDownTimer;
        if (countdownTimer != null) {
            countdownTimer.stop();
            this.pollCountDownTimer = null;
        }
        RichMessageLayout richMessageLayout = this.currentMessageObject.richLayout;
        if (richMessageLayout != null) {
            richMessageLayout.detach(this);
        }
        if (this.transitionParams.animateOutRichLayout != null) {
            this.transitionParams.animateOutRichLayout.detach(this);
        }
        Iterator it = this.pollButtons.iterator();
        while (it.hasNext()) {
            ((PollButton) it.next()).detach();
        }
        AvatarsDrawable avatarsDrawable = this.groupCallParticipantsAvatars;
        if (avatarsDrawable != null) {
            avatarsDrawable.onDetachedFromWindow();
        }
        CheckBoxBase checkBoxBase2 = this.mediaCheckBox;
        if (checkBoxBase2 != null) {
            checkBoxBase2.onDetachedFromWindow();
        }
        if (this.pollCheckBox != null) {
            int i = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.pollCheckBox;
                if (i >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i].onDetachedFromWindow();
                i++;
            }
        }
        CheckBoxBase checkBoxBase3 = this.replyTaskCheckbox;
        if (checkBoxBase3 != null) {
            checkBoxBase3.onDetachedFromWindow();
        }
        this.attachedToWindow = false;
        GroupMedia groupMedia = this.groupMedia;
        if (groupMedia != null) {
            groupMedia.onDetachedFromWindow();
        }
        this.avatarImage.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.sideImage;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        TopicSeparator topicSeparator = this.topicSeparator;
        if (topicSeparator != null) {
            topicSeparator.detach();
        }
        checkImageReceiversAttachState();
        if (this.addedForTest && this.currentUrl != null && this.currentWebFile != null) {
            ImageLoader.getInstance().removeTestWebFile(this.currentUrl);
            this.addedForTest = false;
        }
        StickerSetLinkIcon stickerSetLinkIcon = this.stickerSetIcons;
        if (stickerSetLinkIcon != null) {
            stickerSetLinkIcon.detach(this);
        }
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        if (getDelegate() != null && getDelegate().getTextSelectionHelper() != null) {
            getDelegate().getTextSelectionHelper().onChatMessageCellDetached(this);
        }
        this.transitionParams.onDetach();
        if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
            Theme.getCurrentAudiVisualizerDrawable().setParentView(null);
        }
        ValueAnimator valueAnimator = this.statusDrawableAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.statusDrawableAnimator.cancel();
        }
        this.reactionsLayoutInBubble.onDetachFromWindow();
        this.statusDrawableAnimationInProgress = false;
        FlagSecureReason flagSecureReason = this.flagSecure;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.currentNameStatusDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.detach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.currentNameEmojiStatusDrawable;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.detach();
        }
        SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this);
        }
        ChannelRecommendationsCell channelRecommendationsCell = this.channelRecommendationsCell;
        if (channelRecommendationsCell != null) {
            channelRecommendationsCell.onDetachedFromWindow();
        }
        Choreographer60FpsContent.getInstance().removeFrameCallback(this.invalidateOutboundsRunnable);
    }

    @Override
    protected void onAttachedToWindow() throws Resources.NotFoundException, NumberFormatException {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            messageObject.animateComments = false;
            RichMessageLayout richMessageLayout = messageObject.richLayout;
            if (richMessageLayout != null) {
                richMessageLayout.attach(this);
            }
        }
        if (this.transitionParams.animateOutRichLayout != null) {
            this.transitionParams.animateOutRichLayout.attach(this);
        }
        AvatarsDrawable avatarsDrawable = this.groupCallParticipantsAvatars;
        if (avatarsDrawable != null) {
            avatarsDrawable.onAttachedToWindow();
        }
        PollContentDrawable pollContentDrawable = this.pollContentDrawable;
        if (pollContentDrawable != null) {
            pollContentDrawable.attach();
        }
        PollContentDrawable pollContentDrawable2 = this.pollExplanationDrawable;
        if (pollContentDrawable2 != null) {
            pollContentDrawable2.attach();
        }
        Iterator it = this.pollButtons.iterator();
        while (it.hasNext()) {
            ((PollButton) it.next()).attach();
        }
        MessageObject messageObject2 = this.messageObjectToSet;
        if (messageObject2 != null) {
            messageObject2.animateComments = false;
            setMessageContent(messageObject2, this.groupedMessagesToSet, this.bottomNearToSet, this.topNearToSet, this.firstInChatToSet, this.lastInChatListToSet);
            this.messageObjectToSet = null;
            this.groupedMessagesToSet = null;
        }
        CheckBoxBase checkBoxBase = this.checkBox;
        if (checkBoxBase != null) {
            checkBoxBase.onAttachedToWindow();
        }
        CheckBoxBase checkBoxBase2 = this.mediaCheckBox;
        if (checkBoxBase2 != null) {
            checkBoxBase2.onAttachedToWindow();
        }
        TopicSeparator topicSeparator = this.topicSeparator;
        if (topicSeparator != null) {
            topicSeparator.attach();
        }
        CheckBoxBase checkBoxBase3 = this.replyTaskCheckbox;
        if (checkBoxBase3 != null) {
            checkBoxBase3.onAttachedToWindow();
        }
        if (this.pollCheckBox != null) {
            int i = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.pollCheckBox;
                if (i >= checkBoxBaseArr.length) {
                    break;
                }
                checkBoxBaseArr[i].onAttachedToWindow();
                i++;
            }
        }
        this.attachedToWindow = true;
        this.animationOffsetX = 0.0f;
        this.slidingOffsetX = 0.0f;
        this.checkBoxTranslation = 0;
        updateTranslation();
        this.avatarImage.setParentView((View) getParent());
        this.avatarImage.onAttachedToWindow();
        ImageReceiver imageReceiver = this.sideImage;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        checkImageReceiversAttachState();
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null) {
            setAvatar(messageObject3);
        }
        int i2 = this.documentAttachType;
        if (i2 == 4 && this.autoPlayingMedia) {
            boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
            this.animatingNoSoundPlaying = zIsPlayingMessage;
            this.animatingNoSoundProgress = zIsPlayingMessage ? 0.0f : 1.0f;
            this.animatingNoSound = 0;
        } else {
            this.animatingNoSoundPlaying = false;
            this.animatingNoSoundProgress = 0.0f;
            this.animatingDrawVideoImageButtonProgress = ((i2 == 4 || i2 == 2) && this.drawVideoSize) ? 1.0f : 0.0f;
        }
        if (getDelegate() != null && getDelegate().getTextSelectionHelper() != null) {
            getDelegate().getTextSelectionHelper().onChatMessageCellAttached(this);
        }
        if (this.documentAttachType == 5) {
            this.toSeekBarProgress = MediaController.getInstance().isPlayingMessage(this.currentMessageObject) ? 1.0f : 0.0f;
        }
        this.reactionsLayoutInBubble.onAttachToWindow();
        FlagSecureReason flagSecureReason = this.flagSecure;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        GroupMedia groupMedia = this.groupMedia;
        if (groupMedia != null) {
            groupMedia.onAttachedToWindow();
        }
        updateFlagSecure();
        MessageObject messageObject4 = this.currentMessageObject;
        if (messageObject4 != null && messageObject4.type == 20 && this.unlockLayout != null) {
            invalidate();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.currentNameStatusDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.attach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.currentNameEmojiStatusDrawable;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.attach();
        }
        SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
        if (spoilerEffect2 != null) {
            if (spoilerEffect2.destroyed) {
                SpoilerEffect2 spoilerEffect2MakeSpoilerEffect = makeSpoilerEffect();
                this.mediaSpoilerEffect2 = spoilerEffect2MakeSpoilerEffect;
                Integer num = this.mediaSpoilerEffect2Index;
                if (num != null) {
                    spoilerEffect2MakeSpoilerEffect.reassignAttach(this, num.intValue());
                }
            } else {
                spoilerEffect2.attach(this);
            }
        }
        ChannelRecommendationsCell channelRecommendationsCell = this.channelRecommendationsCell;
        if (channelRecommendationsCell != null) {
            channelRecommendationsCell.onAttachedToWindow();
        }
        StickerSetLinkIcon stickerSetLinkIcon = this.stickerSetIcons;
        if (stickerSetLinkIcon != null) {
            stickerSetLinkIcon.attach(this);
        }
    }

    protected SpoilerEffect2 makeSpoilerEffect() {
        return SpoilerEffect2.getInstance(this);
    }

    public void copySpoilerEffect2AttachIndexFrom(ChatMessageCell chatMessageCell) {
        SpoilerEffect2 spoilerEffect2;
        if (chatMessageCell == null || (spoilerEffect2 = chatMessageCell.mediaSpoilerEffect2) == null) {
            return;
        }
        int attachIndex = spoilerEffect2.getAttachIndex(chatMessageCell);
        this.mediaSpoilerEffect2Index = Integer.valueOf(attachIndex);
        SpoilerEffect2 spoilerEffect22 = this.mediaSpoilerEffect2;
        if (spoilerEffect22 != null) {
            spoilerEffect22.reassignAttach(this, attachIndex);
        }
    }

    private void checkImageReceiversAttachState() {
        boolean z = this.attachedToWindow;
        boolean z2 = false;
        if (z != this.imageReceiversAttachState) {
            this.imageReceiversAttachState = z;
            if (z) {
                this.radialProgress.onAttachedToWindow();
                this.videoRadialProgress.onAttachedToWindow();
                AvatarsListDrawable avatarsListDrawable = this.pollRecentVotersDrawable;
                if (avatarsListDrawable != null) {
                    avatarsListDrawable.attach();
                }
                ArrayList arrayList = this.pollButtons;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((PollButton) it.next()).attach();
                    }
                }
                PollContentDrawable pollContentDrawable = this.pollContentDrawable;
                if (pollContentDrawable != null) {
                    pollContentDrawable.attach();
                }
                PollContentDrawable pollContentDrawable2 = this.pollExplanationDrawable;
                if (pollContentDrawable2 != null) {
                    pollContentDrawable2.attach();
                }
                if (this.commentAvatarImages != null) {
                    int i = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr = this.commentAvatarImages;
                        if (i >= imageReceiverArr.length) {
                            break;
                        }
                        imageReceiverArr[i].onAttachedToWindow();
                        i++;
                    }
                }
                this.giveawayMessageCell.onAttachedToWindow();
                this.giveawayResultsMessageCell.onAttachedToWindow();
                this.replyImageReceiver.onAttachedToWindow();
                this.locationImageReceiver.onAttachedToWindow();
                this.blurredPhotoImage.onAttachedToWindow();
                if (!this.photoImage.onAttachedToWindow() || this.drawPhotoImage) {
                    updateButtonState(false, false, false);
                }
                this.animatedEmojiReplyStack = AnimatedEmojiSpan.update(0, (View) this, false, this.animatedEmojiReplyStack, this.replyTextLayout);
                this.animatedEmojiDescriptionStack = AnimatedEmojiSpan.update(0, (View) this, false, this.animatedEmojiDescriptionStack, this.descriptionLayout);
                updateAnimatedEmojis();
            } else {
                this.radialProgress.onDetachedFromWindow();
                this.videoRadialProgress.onDetachedFromWindow();
                AvatarsListDrawable avatarsListDrawable2 = this.pollRecentVotersDrawable;
                if (avatarsListDrawable2 != null) {
                    avatarsListDrawable2.detach();
                }
                PollContentDrawable pollContentDrawable3 = this.pollContentDrawable;
                if (pollContentDrawable3 != null) {
                    pollContentDrawable3.detach();
                }
                PollContentDrawable pollContentDrawable4 = this.pollExplanationDrawable;
                if (pollContentDrawable4 != null) {
                    pollContentDrawable4.detach();
                }
                ArrayList arrayList2 = this.pollButtons;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((PollButton) it2.next()).detach();
                    }
                }
                if (this.commentAvatarImages != null) {
                    int i2 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr2 = this.commentAvatarImages;
                        if (i2 >= imageReceiverArr2.length) {
                            break;
                        }
                        imageReceiverArr2[i2].onDetachedFromWindow();
                        i2++;
                    }
                }
                this.replyImageReceiver.onDetachedFromWindow();
                this.locationImageReceiver.onDetachedFromWindow();
                this.photoImage.onDetachedFromWindow();
                this.blurredPhotoImage.onDetachedFromWindow();
                this.giveawayMessageCell.onDetachedFromWindow();
                this.giveawayResultsMessageCell.onDetachedFromWindow();
                AnimatedEmojiSpan.release(this, this.animatedEmojiDescriptionStack);
                AnimatedEmojiSpan.release(this, this.animatedEmojiReplyStack);
                AnimatedEmojiSpan.release(this, this.animatedEmojiStack);
            }
        }
        if (this.attachedToWindow && (this.visibleOnScreen || !this.shouldCheckVisibleOnScreen)) {
            z2 = true;
        }
        if (z2 != this.imageReceiversVisibleState) {
            this.imageReceiversVisibleState = z2;
            if (z2) {
                fileAttach(true, this.currentMessageObject);
            } else {
                fileDetach(this.currentMessageObject);
            }
        }
    }

    private void fileAttach(boolean z, MessageObject messageObject) {
        ImageReceiver imageReceiver = this.photoImage;
        if (imageReceiver != null) {
            imageReceiver.setFileLoadingPriority(1);
        }
        if (z && messageObject != null && (this.isRoundVideo || messageObject.isVideo())) {
            checkVideoPlayback(true, null);
        }
        if (messageObject == null || messageObject.mediaExists) {
            return;
        }
        int iCanDownloadMediaType = DownloadController.getInstance(this.currentAccount).canDownloadMediaType(messageObject);
        TLRPC.Document document = messageObject.getDocument();
        if (!MessageObject.isStickerDocument(document) && !MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isGifDocument(document) && !MessageObject.isRoundVideoDocument(document) && !messageObject.hasVideoQualities() && !this.isSmallImage) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = document == null ? FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize()) : null;
            if (iCanDownloadMediaType == 2 || (iCanDownloadMediaType == 1 && messageObject.isVideo())) {
                if (iCanDownloadMediaType != 2 && document != null && !messageObject.shouldEncryptPhotoOrVideo() && messageObject.canStreamVideo()) {
                    FileLoader.getInstance(this.currentAccount).loadFile(document, messageObject, 1, 0);
                }
            } else if (iCanDownloadMediaType != 0) {
                if (document != null) {
                    FileLoader.getInstance(this.currentAccount).loadFile(document, messageObject, 1, ((MessageObject.isVideoDocument(document) || messageObject.isVoiceOnce() || messageObject.isRoundOnce()) && messageObject.shouldEncryptPhotoOrVideo()) ? 2 : 0);
                } else if (closestPhotoSizeWithSize != null) {
                    FileLoader.getInstance(this.currentAccount).loadFile(ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), messageObject, null, 1, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
                }
            }
            if (z) {
                updateButtonState(false, false, false);
            }
        }
        if (messageObject.hasVideoQualities()) {
            VideoPlayer.VideoUri videoUri = messageObject.highestQuality;
            if (videoUri != null && !videoUri.isManifestCached()) {
                FileLoader.getInstance(this.currentAccount).loadFile(messageObject.highestQuality.manifestDocument, messageObject, 1, 0);
            }
            VideoPlayer.VideoUri videoUri2 = messageObject.thumbQuality;
            if (videoUri2 == null || videoUri2.isManifestCached()) {
                return;
            }
            FileLoader.getInstance(this.currentAccount).loadFile(messageObject.thumbQuality.manifestDocument, messageObject, 1, 0);
        }
    }

    private void fileDetach(MessageObject messageObject) {
        ImageReceiver imageReceiver = this.photoImage;
        if (imageReceiver != null) {
            imageReceiver.setFileLoadingPriority(0);
        }
        cancelLoading(messageObject);
    }

    private void cancelLoading(MessageObject messageObject) {
        if (messageObject == null || messageObject.mediaExists || messageObject.putInDownloadsStore || DownloadController.getInstance(this.currentAccount).isDownloading(messageObject.messageOwner.id) || PhotoViewer.getInstance().isVisible()) {
            return;
        }
        TLRPC.Document document = messageObject.getDocument();
        if (MessageObject.isStickerDocument(document) || MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isGifDocument(document) || MessageObject.isRoundVideoDocument(document)) {
            return;
        }
        if (document != null) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(document);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(closestPhotoSizeWithSize);
        }
    }

    private void setMessageContent(org.telegram.messenger.MessageObject r90, org.telegram.messenger.MessageObject.GroupedMessages r91, boolean r92, boolean r93, boolean r94, boolean r95) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setMessageContent(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean, boolean, boolean, boolean):void");
    }

    public void lambda$setMessageContent$7(long j, int i) {
        BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = this.draftAnimationsPool;
        if (botDraftAnimationsPool != null) {
            botDraftAnimationsPool.removeAnimator(j, i);
        }
    }

    public void lambda$setMessageContent$8(TLRPC.User user, int i, TLRPC.Chat chat, long j) {
        if (user != null) {
            this.commentAvatarDrawables[i].setInfo(this.currentAccount, user);
            this.commentAvatarImages[i].setForUserOrChat(user, this.commentAvatarDrawables[i]);
        } else if (chat != null) {
            this.commentAvatarDrawables[i].setInfo(this.currentAccount, chat);
            this.commentAvatarImages[i].setForUserOrChat(chat, this.commentAvatarDrawables[i]);
        } else {
            this.commentAvatarDrawables[i].setInfo(j, "", "");
        }
    }

    public void lambda$setMessageContent$9() {
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate != null) {
            chatMessageCellDelegate.didPressSideButton(this);
        }
    }

    public void checkPollFileState() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isPoll()) {
            return;
        }
        PollContentDrawable pollContentDrawable = this.pollExplanationDrawable;
        if (pollContentDrawable != null) {
            pollContentDrawable.checkFileState();
        }
        PollContentDrawable pollContentDrawable2 = this.pollContentDrawable;
        if (pollContentDrawable2 != null) {
            pollContentDrawable2.checkFileState();
        }
    }

    private void setMessageContentIfPoll(org.telegram.messenger.MessageObject r57, boolean r58) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setMessageContentIfPoll(org.telegram.messenger.MessageObject, boolean):void");
    }

    public void lambda$setMessageContentIfPoll$10(boolean z, long j) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.animatedInfoLayout2;
        if (animatedTextDrawable != null) {
            animatedTextDrawable.setText(LocaleController.formatPollEndTime((int) j, z), true);
        }
    }

    private void checkInstantButtonForPoll(boolean z) {
        boolean z2;
        CharSequence string;
        String string2;
        int i = 0;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            if (this.pollCheckBox != null) {
                int iMin = Math.min(tL_messageMediaPoll.poll.answers.size(), this.pollCheckBox.length);
                z2 = false;
                for (int i2 = 0; i2 < iMin; i2++) {
                    CheckBoxBase checkBoxBase = this.pollCheckBox[i2];
                    if (checkBoxBase != null && checkBoxBase.isChecked()) {
                        z2 = true;
                    }
                }
            } else {
                z2 = false;
            }
            TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
            boolean z3 = this.pollVoted;
            boolean z4 = (z3 || this.pollClosed || !this.pollHasResults || pollResults == null || pollResults.total_voters == 0 || !tL_messageMediaPoll.poll.creator) ? false : true;
            boolean z5 = (z3 || this.pollClosed || this.pollHasVoteRestrictions) ? false : true;
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            boolean z6 = poll.public_voters;
            if (this.pollInInputNewOption) {
                string = LocaleController.getString(R.string.PollButtonSave);
                i = 84;
            } else if (!z4 || (poll.multiple_choice && z5 && z2)) {
                if (poll.multiple_choice && z5) {
                    string = LocaleController.getString(R.string.PollSubmitVotesNoCaps);
                    i = 83;
                } else if (this.isBot || !z6 || ((!z3 || (this.pollHideResults && !this.pollHasResults)) && (!this.pollClosed || pollResults.total_voters == 0))) {
                    string = null;
                } else {
                    string2 = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                    string = string2;
                    i = 80;
                }
            } else if (!z6) {
                if (messageObject.forceShowPollResults) {
                    string = AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PollViewBack), false, -AndroidUtilities.dp(2.6666667f), 0.0f, 1.0f);
                    i = 82;
                } else {
                    string = AndroidUtilities.replaceArrows(LocaleController.formatPluralString("PollViewVotesAsAdmin", pollResults.total_voters, new Object[0]), false);
                    i = 81;
                }
            } else {
                string2 = LocaleController.formatString(R.string.PollViewVotesX, Integer.valueOf(pollResults.total_voters));
                string = string2;
                i = 80;
            }
            if (i != 0) {
                if (this.pollInstantButtonDrawable == null) {
                    PollInstantButtonDrawable pollInstantButtonDrawable = new PollInstantButtonDrawable(this, this.resourcesProvider);
                    this.pollInstantButtonDrawable = pollInstantButtonDrawable;
                    pollInstantButtonDrawable.setupCallbacks(this);
                }
                this.instantViewButtonText = string;
                this.pollInstantButtonDrawable.setButtonText(string, z);
                this.drawInstantView = true;
                this.drawInstantViewType = i;
                createInstantViewButton();
            }
            checkPollVoteSendingStatus(z);
        }
    }

    public void checkPollVoteSendingStatus(boolean z) {
        MessageObject messageObject;
        if (this.pollInstantButtonDrawable == null || (messageObject = this.currentMessageObject) == null || !messageObject.isPoll()) {
            return;
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(this.currentMessageObject);
        boolean z2 = false;
        boolean z3 = media instanceof TLRPC.TL_messageMediaPoll ? ((TLRPC.TL_messageMediaPoll) media).poll.multiple_choice : false;
        PollInstantButtonDrawable pollInstantButtonDrawable = this.pollInstantButtonDrawable;
        if (z3 && SendMessagesHelper.getInstance(this.currentAccount).isSendingVote(this.currentMessageObject) != null) {
            z2 = true;
        }
        pollInstantButtonDrawable.setLoading(z2, z);
    }

    private boolean loopStickers() {
        return LiteMode.isEnabled(2);
    }

    private void calculateUnlockXY() {
        if (this.currentMessageObject.type != 20 || this.unlockLayout == null) {
            return;
        }
        this.unlockX = this.backgroundDrawableLeft + ((this.photoImage.getImageWidth() - this.unlockLayout.getWidth()) / 2.0f);
        this.unlockY = this.backgroundDrawableTop + this.photoImage.getImageY() + ((this.photoImage.getImageHeight() - this.unlockLayout.getHeight()) / 2.0f);
    }

    private void updateFlagSecure() {
        if (this.flagSecure == null) {
            Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
            Window window = activityFindActivity == null ? null : activityFindActivity.getWindow();
            if (window != null) {
                FlagSecureReason flagSecureReason = new FlagSecureReason(window, new FlagSecureReason.FlagSecureCondition() {
                    @Override
                    public final boolean run() {
                        return this.f$0.lambda$updateFlagSecure$11();
                    }
                });
                this.flagSecure = flagSecureReason;
                if (this.attachedToWindow) {
                    flagSecureReason.attach();
                }
            }
        }
        FlagSecureReason flagSecureReason2 = this.flagSecure;
        if (flagSecureReason2 != null) {
            flagSecureReason2.invalidate();
        }
    }

    public boolean lambda$updateFlagSecure$11() {
        TLRPC.Message message;
        GroupMedia groupMedia;
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || (message = messageObject.messageOwner) == null || ((messageObject.type != 29 || ((groupMedia = this.groupMedia) != null && groupMedia.hidden)) && !message.noforwards && !messageObject.isVoiceOnce() && !this.currentMessageObject.hasRevealedExtendedMedia())) ? false : true;
    }

    public void checkVideoPlayback(boolean z, Bitmap bitmap) {
        if (this.currentMessageObject.isVideo()) {
            if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                this.photoImage.setAllowStartAnimation(false);
                this.photoImage.stopAnimation();
                return;
            } else {
                this.photoImage.setAllowStartAnimation(true);
                this.photoImage.startAnimation();
                return;
            }
        }
        if (z) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            z = playingMessageObject == null || !playingMessageObject.isRoundVideo();
        }
        this.photoImage.setAllowStartAnimation(z);
        if (bitmap != null) {
            this.photoImage.startCrossfadeFromStaticThumb(bitmap);
        }
        if (z) {
            this.photoImage.startAnimation();
        } else {
            this.photoImage.stopAnimation();
        }
    }

    private static boolean spanSupportsLongPress(CharacterStyle characterStyle) {
        return (characterStyle instanceof URLSpanMono) || (characterStyle instanceof URLSpan);
    }

    @Override
    protected boolean onLongPress() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.onLongPress():boolean");
    }

    public void lambda$onLongPress$12() {
        this.replySelector.setState(new int[0]);
        invalidate();
    }

    public void showHintButton(boolean z, boolean z2, int i) {
        if (i == -1 || i == 0) {
            if (this.hintButtonVisible == z) {
                return;
            }
            this.hintButtonVisible = z;
            if (!z2) {
                this.hintButtonProgress = z ? 1.0f : 0.0f;
            } else {
                invalidate();
            }
        }
        if ((i == -1 || i == 1) && this.psaButtonVisible != z) {
            this.psaButtonVisible = z;
            if (!z2) {
                this.psaButtonProgress = z ? 1.0f : 0.0f;
            } else {
                setInvalidatesParent(true);
                invalidate();
            }
        }
    }

    public void setCheckPressed(boolean z, boolean z2) {
        this.isCheckPressed = z;
        this.isPressed = z2;
        updateRadialProgressBackground();
        if (this.useSeekBarWaveform) {
            this.seekBarWaveform.setSelected(isDrawSelectionBackground());
        } else {
            this.seekBar.setSelected(isDrawSelectionBackground());
        }
        invalidate();
    }

    public void setInvalidateSpoilersParent(boolean z) {
        this.invalidateSpoilersParent = z;
    }

    public void setInvalidatesParent(boolean z) {
        this.invalidatesParent = z;
    }

    public boolean invalidateParentForce() {
        MessageObject messageObject;
        return (this.links.isEmpty() && this.reactionsLayoutInBubble.isEmpty && ((messageObject = this.currentMessageObject) == null || !messageObject.preview)) ? false : true;
    }

    public void invalidateOutbounds() {
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate == null || !chatMessageCellDelegate.canDrawOutboundsContent()) {
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
                return;
            }
            return;
        }
        super.invalidate();
    }

    @Override
    public void invalidate() {
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (this.currentMessageObject == null) {
            return;
        }
        Runnable runnable = this.invalidateCallback;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.overrideInvalidate;
        if (runnable2 != null) {
            runnable2.run();
            return;
        }
        Runnable runnable3 = this.invalidateListener;
        if (runnable3 != null) {
            runnable3.run();
        }
        super.invalidate();
        if ((this.invalidatesParent || (this.currentMessagesGroup != null && invalidateParentForce())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.isBlurred || (chatMessageCellDelegate = this.delegate) == null) {
            return;
        }
        chatMessageCellDelegate.invalidateBlur();
    }

    @Override
    public void invalidateLite() {
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (this.currentMessageObject == null) {
            return;
        }
        Runnable runnable = this.overrideInvalidate;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.invalidateListener;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate();
        if ((this.invalidatesParent || (this.currentMessagesGroup != null && invalidateParentForce())) && getParent() != null) {
            View view = (View) getParent();
            if (view.getParent() != null) {
                view.invalidate();
                ((View) view.getParent()).invalidate();
            }
        }
        if (!this.isBlurred || (chatMessageCellDelegate = this.delegate) == null) {
            return;
        }
        chatMessageCellDelegate.invalidateBlur();
    }

    public void setOverrideInvalidate(Runnable runnable) {
        this.overrideInvalidate = runnable;
    }

    public void setInvalidateListener(Runnable runnable) {
        this.invalidateListener = runnable;
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (this.currentMessageObject == null) {
            return;
        }
        Runnable runnable = this.overrideInvalidate;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.invalidateListener;
        if (runnable2 != null) {
            runnable2.run();
        }
        super.invalidate(i, i2, i3, i4);
        if (this.invalidatesParent && getParent() != null) {
            ((View) getParent()).invalidate(((int) getX()) + i, ((int) getY()) + i2, ((int) getX()) + i3, ((int) getY()) + i4);
        }
        if (!this.isBlurred || (chatMessageCellDelegate = this.delegate) == null) {
            return;
        }
        chatMessageCellDelegate.invalidateBlur();
    }

    public boolean isHighlightedAnimated() {
        return this.isHighlightedAnimated;
    }

    public void setHighlightedAnimated() {
        this.isHighlightedAnimated = true;
        this.highlightProgress = 1000;
        this.lastHighlightProgressTime = System.currentTimeMillis();
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public boolean isHighlighted() {
        return this.isHighlighted;
    }

    public void setHighlighted(boolean z) {
        if (this.isHighlighted == z) {
            return;
        }
        this.isHighlighted = z;
        if (z) {
            this.quoteHighlight = null;
        }
        if (!z) {
            this.lastHighlightProgressTime = System.currentTimeMillis();
            this.isHighlightedAnimated = true;
            this.highlightProgress = 300;
        } else {
            this.isHighlightedAnimated = false;
            this.highlightProgress = 0;
        }
        updateRadialProgressBackground();
        if (this.useSeekBarWaveform) {
            this.seekBarWaveform.setSelected(isDrawSelectionBackground());
        } else {
            this.seekBar.setSelected(isDrawSelectionBackground());
        }
        invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        updateRadialProgressBackground();
        if (this.useSeekBarWaveform) {
            this.seekBarWaveform.setSelected(isDrawSelectionBackground());
        } else {
            this.seekBar.setSelected(isDrawSelectionBackground());
        }
        invalidate();
    }

    private void updateRadialProgressBackground() {
        if (this.drawRadialCheckBackground) {
            return;
        }
        boolean z = true;
        boolean z2 = (this.isHighlighted || this.isPressed || isPressed()) && !(this.drawPhotoImage && this.photoImage.hasBitmapImage());
        this.radialProgress.setPressed(z2 || this.buttonPressed != 0, false);
        if (this.hasMiniProgress != 0) {
            this.radialProgress.setPressed(z2 || this.miniButtonPressed != 0, true);
        }
        RadialProgress2 radialProgress2 = this.videoRadialProgress;
        if (!z2 && this.videoButtonPressed == 0) {
            z = false;
        }
        radialProgress2.setPressed(z, false);
    }

    @Override
    public void onSeekBarPressed() {
        requestDisallowInterceptTouchEvent(true);
    }

    @Override
    public void onSeekBarReleased() {
        requestDisallowInterceptTouchEvent(false);
    }

    @Override
    public boolean isSeekBarDragAllowed() {
        MessageObject messageObject = this.currentMessageObject;
        return messageObject == null || !messageObject.isVoiceOnce();
    }

    @Override
    public boolean reverseWaveform() {
        MessageObject messageObject = this.currentMessageObject;
        return messageObject != null && messageObject.isVoiceOnce();
    }

    @Override
    public void onSeekBarDrag(float f) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f;
        MediaController.getInstance().seekToProgress(this.currentMessageObject, f);
        updatePlayingMessageProgress();
    }

    @Override
    public void onSeekBarContinuousDrag(float f) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f;
        messageObject.audioProgressSec = (int) (messageObject.getDuration() * f);
        updatePlayingMessageProgress();
    }

    public boolean isAnimatingPollAnswer() {
        return this.animatePollAnswerAlpha;
    }

    private void updateWaveform() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject;
        TLRPC.Message message2;
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null) {
            int i = this.documentAttachType;
            if (i == 3 || i == 7) {
                byte[] waveform = messageObject2.getWaveform();
                boolean z = false;
                this.useSeekBarWaveform = waveform != null;
                SeekBarWaveform seekBarWaveform = this.seekBarWaveform;
                if (seekBarWaveform != null) {
                    seekBarWaveform.setWaveform(waveform);
                }
                MessageObject messageObject3 = this.currentMessageObject;
                if (messageObject3 != null && !messageObject3.isQuickReply()) {
                    MessageObject messageObject4 = this.currentMessageObject;
                    if (!messageObject4.isRepostPreview && (!messageObject4.isOutOwner() || this.currentMessageObject.isSent())) {
                        if (!UserConfig.getInstance(this.currentAccount).isPremium() && !TranscribeButton.isFreeTranscribeInChat(this.currentMessageObject)) {
                            if (MessagesController.getInstance(this.currentAccount).transcribeAudioTrialWeeklyNumber > 0 && this.currentMessageObject.getDuration() <= MessagesController.getInstance(this.currentAccount).transcribeAudioTrialDurationMax) {
                                TLRPC.Message message3 = this.currentMessageObject.messageOwner;
                                if (message3 == null || (TextUtils.isEmpty(message3.voiceTranscription) && !this.currentMessageObject.messageOwner.voiceTranscriptionFinal)) {
                                    TranscribeButton.canTranscribeTrial(this.currentMessageObject);
                                }
                            } else if (MessagesController.getInstance(this.currentAccount).transcribeAudioTrialWeeklyNumber <= 0 && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !MessagesController.getInstance(this.currentAccount).didPressTranscribeButtonEnough() && !this.currentMessageObject.isOutOwner() && (((message2 = (messageObject = this.currentMessageObject).messageOwner) != null && message2.voiceTranscriptionForce) || messageObject.getDuration() >= 60.0d)) {
                            }
                            z = !this.currentMessageObject.isVoice() ? true : true;
                        } else if (((!this.currentMessageObject.isVoice() && this.useSeekBarWaveform) || this.currentMessageObject.isRoundVideo()) && (message = this.currentMessageObject.messageOwner) != null && !(MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) && ((messageMedia = this.currentMessageObject.messageOwner.media) == null || messageMedia.ttl_seconds == 0)) {
                        }
                    }
                }
                this.useTranscribeButton = z;
                updateSeekBarWaveformWidth(null);
            }
        }
    }

    private void updateSeekBarWaveformWidth(Canvas canvas) {
        int i;
        this.seekBarWaveformTranslateX = 0;
        this.seekBarTranslateX = 0;
        int i2 = -AndroidUtilities.dp((this.hasLinkPreview ? 10 : 0) + 92);
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateBackgroundBoundsInner && ((i = this.documentAttachType) == 3 || i == 7)) {
            int i3 = this.backgroundWidth;
            float f = i3;
            int iDp = (int) ((f - transitionParams.toDeltaLeft) + transitionParams.toDeltaRight);
            int videoTranscriptionProgress = (int) ((f - transitionParams.deltaLeft) + transitionParams.deltaRight);
            if (this.isRoundVideo && !this.drawBackground) {
                videoTranscriptionProgress = (int) (videoTranscriptionProgress + (getVideoTranscriptionProgress() * AndroidUtilities.dp(8.0f)));
                iDp += AndroidUtilities.dp(8.0f);
            }
            TransitionParams transitionParams2 = this.transitionParams;
            if (transitionParams2.toDeltaLeft == 0.0f && transitionParams2.toDeltaRight == 0.0f) {
                iDp = videoTranscriptionProgress;
            }
            SeekBarWaveform seekBarWaveform = this.seekBarWaveform;
            if (seekBarWaveform != null) {
                if (transitionParams2.animateUseTranscribeButton) {
                    seekBarWaveform.setSize(((videoTranscriptionProgress + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()))) - AndroidUtilities.dp(this.hasLinkPreview ? 10.0f : 0.0f), AndroidUtilities.dp(30.0f), i3 + i2 + (!this.useTranscribeButton ? -AndroidUtilities.dp(34.0f) : 0), iDp + i2 + (this.useTranscribeButton ? -AndroidUtilities.dp(34.0f) : 0));
                } else {
                    seekBarWaveform.setSize(((videoTranscriptionProgress + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()))) - AndroidUtilities.dp(this.hasLinkPreview ? 10.0f : 0.0f), AndroidUtilities.dp(30.0f), (i3 + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())), (iDp + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            SeekBar seekBar = this.seekBar;
            if (seekBar != null) {
                seekBar.setSize((videoTranscriptionProgress - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)))) - AndroidUtilities.dp((this.documentAttachType == 5 ? 65 : 72) + (this.hasLinkPreview ? 20 : 0)), AndroidUtilities.dp(30.0f));
                return;
            }
            return;
        }
        SeekBarWaveform seekBarWaveform2 = this.seekBarWaveform;
        if (seekBarWaveform2 != null) {
            if (transitionParams.animateUseTranscribeButton) {
                seekBarWaveform2.setSize(((this.backgroundWidth + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()))) - AndroidUtilities.dp(this.hasLinkPreview ? 10.0f : 0.0f), AndroidUtilities.dp(30.0f), ((this.backgroundWidth + i2) + (!this.useTranscribeButton ? -AndroidUtilities.dp(34.0f) : 0)) - AndroidUtilities.dp(this.hasLinkPreview ? 10.0f : 0.0f), this.backgroundWidth + i2 + (this.useTranscribeButton ? -AndroidUtilities.dp(34.0f) : 0));
            } else {
                seekBarWaveform2.setSize(((this.backgroundWidth + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()))) - AndroidUtilities.dp(this.hasLinkPreview ? 10.0f : 0.0f), AndroidUtilities.dp(30.0f));
            }
        }
        SeekBar seekBar2 = this.seekBar;
        if (seekBar2 != null) {
            seekBar2.setSize((this.backgroundWidth - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)))) - AndroidUtilities.dp((this.documentAttachType == 5 ? 65 : 72) + (this.hasLinkPreview ? 20 : 0)), AndroidUtilities.dp(30.0f));
        }
    }

    private int createDocumentLayout(int i, MessageObject messageObject) {
        int iMin;
        int iDp = i;
        int i2 = 0;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        if (messageMedia != null) {
            this.documentAttach = messageMedia.document;
        } else if (messageObject.type == 0) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject.messageOwner);
            TLRPC.WebPage webPage = media == null ? null : media.webpage;
            this.documentAttach = webPage == null ? null : webPage.document;
        } else {
            this.documentAttach = messageObject.getDocument();
        }
        TLRPC.Document document = this.documentAttach;
        if (document == null) {
            return 0;
        }
        double d = 0.0d;
        if (MessageObject.isVoiceDocument(document)) {
            this.documentAttachType = 3;
            int i3 = 0;
            while (true) {
                if (i3 >= this.documentAttach.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.documentAttach.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    d = documentAttribute.duration;
                    break;
                }
                i3++;
            }
            this.widthBeforeNewTimeLine = (iDp - AndroidUtilities.dp(94.0f)) - ((int) Math.ceil(Theme.chat_audioTimePaint.measureText("00:00")));
            this.availableTimeWidth = iDp - AndroidUtilities.dp(18.0f);
            measureTime(messageObject);
            int iDp2 = AndroidUtilities.dp(174.0f) + this.timeWidth;
            if (!this.hasLinkPreview) {
                this.backgroundWidth = Math.min(iDp, iDp2 + ((int) Math.ceil(Theme.chat_audioTimePaint.measureText(AndroidUtilities.formatLongDuration((int) d)))));
            }
            this.seekBarWaveform.setMessageObject(messageObject);
            return 0;
        }
        if (MessageObject.isVideoDocument(this.documentAttach)) {
            this.documentAttachType = 4;
            if (!messageObject.needDrawBluredPreview()) {
                updatePlayingMessageProgress();
                String str = String.format("%s", AndroidUtilities.formatFileSize(this.documentAttach.size));
                this.docTitleWidth = (int) Math.ceil(Theme.chat_infoPaint.measureText(str));
                this.docTitleLayout = new StaticLayout(str, Theme.chat_infoPaint, this.docTitleWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return 0;
        }
        if (MessageObject.isMusicDocument(this.documentAttach)) {
            this.documentAttachType = 5;
            int iDp3 = iDp - AndroidUtilities.dp(92.0f);
            if (iDp3 < 0) {
                iDp3 = AndroidUtilities.dp(100.0f);
            }
            String strReplace = messageObject.getMusicTitle().replace('\n', ' ');
            TextPaint textPaint = Theme.chat_audioTitlePaint;
            float fDp = iDp3 - AndroidUtilities.dp(12.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(strReplace, textPaint, fDp, truncateAt);
            TextPaint textPaint2 = Theme.chat_audioTitlePaint;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(charSequenceEllipsize, textPaint2, iDp3, alignment, 1.0f, 0.0f, false);
            this.songLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.songX = -((int) Math.ceil(this.songLayout.getLineLeft(0)));
                int lineWidth = (int) this.songLayout.getLineWidth(0);
                if (AndroidUtilities.dp(104.0f) + lineWidth > this.backgroundWidth) {
                    this.backgroundWidth = lineWidth + AndroidUtilities.dp(104.0f);
                }
            }
            StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicAuthor().replace('\n', ' '), Theme.chat_audioPerformerPaint, iDp3, truncateAt), Theme.chat_audioPerformerPaint, iDp3, alignment, 1.0f, 0.0f, false);
            this.performerLayout = staticLayout2;
            if (staticLayout2.getLineCount() > 0) {
                this.performerX = -((int) Math.ceil(this.performerLayout.getLineLeft(0)));
                int lineWidth2 = (int) this.performerLayout.getLineWidth(0);
                if (AndroidUtilities.dp(104.0f) + lineWidth2 > this.backgroundWidth) {
                    this.backgroundWidth = lineWidth2 + AndroidUtilities.dp(104.0f);
                }
            }
            while (true) {
                if (i2 >= this.documentAttach.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute2 = this.documentAttach.attributes.get(i2);
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                    d = documentAttribute2.duration;
                    break;
                }
                i2++;
            }
            int i4 = (int) d;
            int iCeil = (int) Math.ceil(Theme.chat_audioTimePaint.measureText(AndroidUtilities.formatShortDuration(i4, i4)));
            this.widthBeforeNewTimeLine = (this.backgroundWidth - AndroidUtilities.dp(86.0f)) - iCeil;
            this.availableTimeWidth = this.backgroundWidth - AndroidUtilities.dp(28.0f);
            return iCeil;
        }
        if (MessageObject.isGifDocument(this.documentAttach, messageObject.hasValidGroupId())) {
            this.documentAttachType = 2;
            if (!messageObject.needDrawBluredPreview()) {
                String string = LocaleController.getString("AttachGif", R.string.AttachGif);
                this.infoWidth = (int) Math.ceil(Theme.chat_infoPaint.measureText(string));
                TextPaint textPaint3 = Theme.chat_infoPaint;
                int i5 = this.infoWidth;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                this.infoLayout = new StaticLayout(string, textPaint3, i5, alignment2, 1.0f, 0.0f, false);
                String str2 = String.format("%s", AndroidUtilities.formatFileSize(this.documentAttach.size));
                this.docTitleWidth = (int) Math.ceil(Theme.chat_infoPaint.measureText(str2));
                this.docTitleLayout = new StaticLayout(str2, Theme.chat_infoPaint, this.docTitleWidth, alignment2, 1.0f, 0.0f, false);
            }
            return 0;
        }
        String str3 = this.documentAttach.mime_type;
        boolean z = (str3 != null && (str3.toLowerCase().startsWith("image/") || this.documentAttach.mime_type.toLowerCase().startsWith("video/mp4"))) || MessageObject.isDocumentHasThumb(this.documentAttach);
        this.drawPhotoImage = z;
        if (!z) {
            iDp += AndroidUtilities.dp(30.0f);
        }
        this.documentAttachType = 1;
        String documentFileName = FileLoader.getDocumentFileName(this.documentAttach);
        if (documentFileName.length() == 0) {
            documentFileName = LocaleController.getString("AttachDocument", R.string.AttachDocument);
        }
        StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(documentFileName, Theme.chat_docNamePaint, iDp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.MIDDLE, iDp, 2, false);
        this.docTitleLayout = staticLayoutCreateStaticLayout;
        this.docTitleOffsetX = Integer.MIN_VALUE;
        if (staticLayoutCreateStaticLayout != null && staticLayoutCreateStaticLayout.getLineCount() > 0) {
            int iMax = 0;
            while (i2 < this.docTitleLayout.getLineCount()) {
                iMax = Math.max(iMax, (int) Math.ceil(this.docTitleLayout.getLineWidth(i2)));
                this.docTitleOffsetX = Math.max(this.docTitleOffsetX, (int) Math.ceil(-this.docTitleLayout.getLineLeft(i2)));
                i2++;
            }
            iMin = Math.min(iDp, iMax);
        } else {
            this.docTitleOffsetX = 0;
            iMin = iDp;
        }
        String str4 = AndroidUtilities.formatFileSize(this.documentAttach.size) + " " + FileLoader.getDocumentExtension(this.documentAttach);
        int iDp4 = iDp - AndroidUtilities.dp(30.0f);
        TextPaint textPaint4 = Theme.chat_infoPaint;
        int iMin2 = Math.min(iDp4, (int) Math.ceil(textPaint4.measureText("000.0 mm / " + AndroidUtilities.formatFileSize(this.documentAttach.size))));
        this.infoWidth = iMin2;
        CharSequence charSequenceEllipsize2 = TextUtils.ellipsize(str4, Theme.chat_infoPaint, (float) iMin2, TextUtils.TruncateAt.END);
        try {
            if (this.infoWidth < 0) {
                this.infoWidth = AndroidUtilities.dp(10.0f);
            }
            this.infoLayout = new StaticLayout(charSequenceEllipsize2, Theme.chat_infoPaint, this.infoWidth + AndroidUtilities.dp(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.drawPhotoImage) {
            this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
            this.currentPhotoObjectThumb = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
            if (this.currentMessageObject.isHiddenSensitive() || (DownloadController.getInstance(this.currentAccount).getAutodownloadMask() & 1) == 0) {
                this.currentPhotoObject = null;
            }
            TLRPC.PhotoSize photoSize = this.currentPhotoObject;
            if (photoSize == null || photoSize == this.currentPhotoObjectThumb) {
                this.currentPhotoObject = null;
                this.photoImage.setNeedsQualityThumb(true);
                this.photoImage.setShouldGenerateQualityThumb(true);
            } else {
                BitmapDrawable bitmapDrawable = this.currentMessageObject.strippedThumb;
                if (bitmapDrawable != null) {
                    this.currentPhotoObjectThumb = null;
                    this.currentPhotoObjectThumbStripped = bitmapDrawable;
                }
            }
            this.currentPhotoFilter = "86_86_b";
            this.photoImage.setImage(ImageLocation.getForObject(this.currentPhotoObject, messageObject.photoThumbsObject), "86_86", ImageLocation.getForObject(this.currentPhotoObjectThumb, messageObject.photoThumbsObject), this.currentPhotoFilter, this.currentPhotoObjectThumbStripped, 0L, null, messageObject, 1);
        }
        return iMin;
    }

    private void calcBackgroundWidth(int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.calcBackgroundWidth(int, int, int):void");
    }

    public boolean setHighlightedText(String str) {
        return setHighlightedText(str, false, -1, false);
    }

    public boolean setHighlightedText(java.lang.String r18, boolean r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setHighlightedText(java.lang.String, boolean, int, boolean):boolean");
    }

    public boolean setHighlightedTask(int i) {
        MessageObject messageObject = this.messageObjectToSet;
        if (messageObject == null) {
            messageObject = this.currentMessageObject;
        }
        if (messageObject == null) {
            this.quoteHighlight = null;
            return false;
        }
        QuoteHighlight quoteHighlight = this.quoteHighlight;
        if (quoteHighlight == null || !quoteHighlight.todo || quoteHighlight.start != (-i)) {
            this.quoteHighlight = new QuoteHighlight(this, messageObject.getId(), i);
        }
        this.highlightedQuote = true;
        return true;
    }

    public boolean setHighlightedPoll(byte[] bArr) {
        MessageObject messageObject = this.messageObjectToSet;
        if (messageObject == null) {
            messageObject = this.currentMessageObject;
        }
        if (messageObject == null) {
            this.quoteHighlight = null;
            return false;
        }
        QuoteHighlight quoteHighlight = this.quoteHighlight;
        if (quoteHighlight == null || !quoteHighlight.poll || !Arrays.equals(quoteHighlight.pollOptionId, bArr)) {
            this.quoteHighlight = new QuoteHighlight(this, messageObject.getId(), bArr);
        }
        this.highlightedQuote = true;
        return true;
    }

    private void highlight(int i, int i2, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i3 = i2 - i;
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                break;
            }
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList.get(i4);
            if (i < textLayoutBlock.charactersOffset || i >= textLayoutBlock.charactersEnd) {
                i4++;
            } else {
                this.linkSelectionBlockNum = i4;
                resetUrlPaths();
                try {
                    LinkPath linkPathObtainNewUrlPath = obtainNewUrlPath();
                    linkPathObtainNewUrlPath.setUseCornerPathImplementation(true);
                    linkPathObtainNewUrlPath.setCurrentLayout(textLayoutBlock.textLayout, i, 0.0f);
                    textLayoutBlock.textLayout.getSelectionPath(i, i2, linkPathObtainNewUrlPath);
                    linkPathObtainNewUrlPath.closeRects();
                    float f = textLayoutBlock.height + textLayoutBlock.padBottom;
                    if (i2 >= textLayoutBlock.charactersOffset + i3) {
                        for (int i5 = i4 + 1; i5 < arrayList.size(); i5++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) arrayList.get(i5);
                            int i6 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                            LinkPath linkPathObtainNewUrlPath2 = obtainNewUrlPath();
                            linkPathObtainNewUrlPath2.setUseCornerPathImplementation(true);
                            float f2 = f + textLayoutBlock2.padTop;
                            linkPathObtainNewUrlPath2.setCurrentLayout(textLayoutBlock2.textLayout, 0, f2);
                            f = f2 + textLayoutBlock2.height + textLayoutBlock2.padBottom;
                            textLayoutBlock2.textLayout.getSelectionPath(0, i2 - textLayoutBlock2.charactersOffset, linkPathObtainNewUrlPath2);
                            linkPathObtainNewUrlPath2.closeRects();
                            if (i2 < (textLayoutBlock.charactersOffset + i6) - 1) {
                                break;
                            }
                        }
                    }
                    if (this.highlightedQuote) {
                        this.isHighlightedAnimated = true;
                        this.highlightProgress = 2500;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                invalidate();
            }
        }
        this.highlightCaptionToSetStart = -1;
        this.highlightCaptionToSetEnd = -1;
    }

    public boolean setHighlightedSpan(android.text.style.CharacterStyle r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setHighlightedSpan(android.text.style.CharacterStyle):boolean");
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        ReactionsLayoutInBubble reactionsLayoutInBubble;
        PollButtonDrawable pollButtonDrawable;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.selectorDrawable;
            if (drawable != drawableArr[0] && drawable != this.animatedInfoLayout && drawable != drawableArr[1] && drawable != this.linkPreviewSelector && drawable != this.nameLayoutSelector && drawable != this.replySelector && (((reactionsLayoutInBubble = this.reactionsLayoutInBubble) == null || !reactionsLayoutInBubble.verifyDrawable(drawable)) && !(drawable instanceof LoadingDrawable))) {
                PollAddButtonDrawable pollAddButtonDrawable = this.pollAddButtonDrawable;
                if (pollAddButtonDrawable != null && pollAddButtonDrawable.verifyDrawable(drawable)) {
                    return true;
                }
                Iterator it = this.pollButtons.iterator();
                while (it.hasNext()) {
                    PollButton pollButton = (PollButton) it.next();
                    if (pollButton.selectorDrawable == drawable || ((pollButtonDrawable = pollButton.pollButtonDrawable) != null && pollButtonDrawable.verifyDrawable(drawable))) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.currentMessagesGroup != null) {
            invalidateWithParent();
        }
    }

    private boolean isCurrentLocationTimeExpired(MessageObject messageObject) {
        int i = MessageObject.getMedia(this.currentMessageObject.messageOwner).period;
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if (i == Integer.MAX_VALUE) {
            return false;
        }
        return i % 60 == 0 ? Math.abs(currentTime - messageObject.messageOwner.date) > i : Math.abs(currentTime - messageObject.messageOwner.date) > i + (-5);
    }

    public void checkLocationExpired() {
        boolean zIsCurrentLocationTimeExpired;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || (zIsCurrentLocationTimeExpired = isCurrentLocationTimeExpired(messageObject)) == this.locationExpired) {
            return;
        }
        this.locationExpired = zIsCurrentLocationTimeExpired;
        if (!zIsCurrentLocationTimeExpired) {
            AndroidUtilities.runOnUIThread(this.invalidateRunnable, 1000L);
            this.scheduledInvalidate = true;
            int iDp = this.backgroundWidth - AndroidUtilities.dp(91.0f);
            this.docTitleLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), Theme.chat_locationTitlePaint, iDp, TextUtils.TruncateAt.END), Theme.chat_locationTitlePaint, iDp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        this.currentMessageObject = null;
        setMessageObject(messageObject2, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop, this.firstInChat);
    }

    public void setIsUpdating(boolean z) {
        this.isUpdating = true;
    }

    public void setMessageObject(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z, boolean z2, boolean z3) {
        setMessageObject(messageObject, groupedMessages, z, z2, z3, false);
    }

    public void setMessageObject(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z, boolean z2, boolean z3, boolean z4) throws Resources.NotFoundException, NumberFormatException {
        if (this.attachedToWindow && !this.frozen) {
            setMessageContent(messageObject, groupedMessages, z, z2, z3, z4);
            return;
        }
        this.messageObjectToSet = messageObject;
        this.groupedMessagesToSet = groupedMessages;
        this.bottomNearToSet = z;
        this.topNearToSet = z2;
        this.firstInChatToSet = z3;
        this.lastInChatListToSet = z4;
    }

    private int getAdditionalWidthForPosition(MessageObject.GroupedMessagePosition groupedMessagePosition) {
        if (groupedMessagePosition == null) {
            return 0;
        }
        int iDp = (groupedMessagePosition.flags & 2) == 0 ? AndroidUtilities.dp(4.0f) : 0;
        return (groupedMessagePosition.flags & 1) == 0 ? iDp + AndroidUtilities.dp(4.0f) : iDp;
    }

    public void createSelectorDrawable(final int i) {
        int themedColor;
        ReplyMessageLine replyMessageLine;
        ReplyMessageLine replyMessageLine2;
        if (this.currentMessageObject.isUnsupported()) {
            themedColor = getThemedColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outPreviewInstantText : Theme.key_chat_inPreviewInstantText);
        } else if (i == 0 && this.psaHintPressed) {
            themedColor = getThemedColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outViews : Theme.key_chat_inViews);
        } else if (i == 0 && (replyMessageLine2 = this.linkLine) != null) {
            themedColor = replyMessageLine2.getColor();
        } else if (i == 0 && (replyMessageLine = this.contactLine) != null) {
            themedColor = replyMessageLine.getColor();
        } else {
            themedColor = getThemedColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outPreviewInstantText : Theme.key_chat_inPreviewInstantText);
        }
        Drawable drawable = this.selectorDrawable[i];
        if (drawable == null) {
            this.selectorMaskDrawable[i] = new MaskDrawable() {
                {
                    super();
                }

                @Override
                public void updatePath() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.AnonymousClass7.updatePath():void");
                }
            };
            this.selectorDrawable[i] = new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{436207615 & getThemedColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outPreviewInstantText : Theme.key_chat_inPreviewInstantText)}), null, this.selectorMaskDrawable[i]);
            this.selectorDrawable[i].setCallback(this);
        } else {
            Theme.setSelectorDrawableColor(drawable, themedColor & 436207615, true);
        }
        this.selectorDrawable[i].setVisible(true, false);
    }

    private static class MaskDrawable extends Drawable {
        protected final Paint maskPaint;
        public final Path path;
        public int pathX;
        public int pathY;
        public final RectF rect;

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

        public abstract void updatePath();

        private MaskDrawable() {
            Paint paint = new Paint(1);
            this.maskPaint = paint;
            paint.setColor(-1);
            this.rect = new RectF();
            this.path = new Path();
        }

        @Override
        public void draw(Canvas canvas) {
            updatePath();
            canvas.drawPath(this.path, this.maskPaint);
        }
    }

    private void createInstantViewButton() {
        int iMeasureText;
        CharSequence string;
        boolean z;
        if (this.drawInstantView) {
            createSelectorDrawable(0);
        }
        if (this.drawInstantView && this.instantViewLayout == null) {
            this.instantWidth = AndroidUtilities.dp(33.0f);
            CharSequence string2 = this.instantViewButtonText;
            if (string2 == null) {
                int i = this.drawInstantViewType;
                if (i == 12) {
                    string = LocaleController.getString(R.string.OpenChannelPost);
                } else if (i == 1) {
                    string = LocaleController.getString(R.string.OpenChannel);
                } else if (i == 29) {
                    string = LocaleController.getString(R.string.OpenChannelDirect);
                } else if (i == 13) {
                    string = LocaleController.getString(R.string.SendMessage).toUpperCase();
                } else if (i == 32) {
                    string = LocaleController.getString(R.string.OpenProfile).toUpperCase();
                } else if (i == 85) {
                    string = LocaleController.getString(R.string.OpenAIStyle);
                } else if (i == 10) {
                    string = LocaleController.getString(R.string.OpenBot);
                } else if (i == 2) {
                    string = LocaleController.getString(R.string.OpenGroup);
                } else if (i == 3) {
                    string = LocaleController.getString(R.string.OpenMessage);
                } else if (i == 5) {
                    string = LocaleController.getString(R.string.ViewContact);
                } else if (i == 6) {
                    string = LocaleController.getString(R.string.OpenBackground);
                } else if (i == 7) {
                    string = LocaleController.getString(R.string.OpenTheme);
                } else if (i == 9 || i == 11) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) MessageObject.getMedia(this.currentMessageObject.messageOwner).webpage;
                    if (tL_webPage != null && tL_webPage.url.contains("voicechat=")) {
                        string = LocaleController.getString(R.string.VoipGroupJoinAsSpeaker);
                    } else {
                        string = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    }
                } else if (i == 25) {
                    string = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                } else if (i == 14) {
                    string = LocaleController.getString(R.string.ViewChatList).toUpperCase();
                } else if (i == 15) {
                    string = LocaleController.getString(R.string.BotWebAppInstantViewOpen).toUpperCase();
                } else if (i == 16) {
                    string = LocaleController.getString(R.string.OpenLink).toUpperCase();
                } else if (i == 17) {
                    string = LocaleController.getString(R.string.ViewStory).toUpperCase();
                } else if (i == 18 || i == 22) {
                    string = LocaleController.getString(R.string.BoostLinkButton);
                } else if (i == 19) {
                    string = LocaleController.getString(R.string.BoostingHowItWork);
                } else if (i == 20) {
                    string = LocaleController.getString(R.string.OpenGift);
                } else if (i == 21) {
                    string = LocaleController.getString(R.string.AppUpdate);
                } else if (i == 23) {
                    string = LocaleController.getString(R.string.OpenStickerSet);
                } else if (i == 24) {
                    string = LocaleController.getString(R.string.OpenEmojiSet);
                } else if (i == 26) {
                    TL_stars.StarGift starGift = this.instantViewTypeIsGiftAuction;
                    if (starGift != null) {
                        if (starGift.auction_start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                            string2 = LocaleController.getString(R.string.OpenGiftAuctionView);
                            z = false;
                        } else {
                            if (this.instantViewTypeIsGiftAuction.sold_out) {
                                string2 = LocaleController.getString(R.string.OpenGiftAuctionResults);
                            } else {
                                string2 = LocaleController.getString(R.string.OpenGiftAuctionActive);
                            }
                            z = true;
                        }
                        if (z) {
                            SpannableString spannableString = new SpannableString("*");
                            spannableString.setSpan(new ColoredImageSpan(R.drawable.filled_gift_sell_24), 0, spannableString.length(), 33);
                            string = TextUtils.concat(spannableString, " ", string2);
                        }
                    } else {
                        string = LocaleController.getString(R.string.OpenUniqueGift);
                    }
                } else if (i == 27) {
                    string = LocaleController.getString(R.string.JoinCall).toUpperCase();
                } else if (i == 28) {
                    string = LocaleController.getString(R.string.ViewCollection);
                } else {
                    string = LocaleController.getString(R.string.InstantView);
                }
                string2 = string;
            }
            if (this.currentMessageObject.isSponsored() && this.backgroundWidth < (iMeasureText = (int) (Theme.chat_instantViewPaint.measureText(string2, 0, string2.length()) + AndroidUtilities.dp(75.0f)))) {
                this.backgroundWidth = iMeasureText;
            }
            int iDp = this.backgroundWidth - AndroidUtilities.dp(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(string2, Theme.chat_instantViewPaint, iDp, TextUtils.TruncateAt.END), Theme.chat_instantViewPaint, iDp + AndroidUtilities.dp(2.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.instantViewLayout = staticLayout;
            this.instantViewLayoutWidth = staticLayout.getLineCount() > 0 ? this.instantViewLayout.getLineWidth(0) : 0.0f;
            this.instantViewLayoutLeft = this.instantViewLayout.getLineCount() > 0 ? this.instantViewLayout.getLineLeft(0) : 0.0f;
            int i2 = this.backgroundWidth;
            int i3 = this.drawInstantViewType;
            this.instantWidth = i2 - AndroidUtilities.dp((i3 == 82 || i3 == 81 || i3 == 80 || i3 == 84 || i3 == 83) ? 13.0f : 34.0f);
            int iDp2 = this.totalHeight + AndroidUtilities.dp(46.0f);
            this.totalHeight = iDp2;
            if (this.currentMessageObject.type == 12) {
                this.totalHeight = iDp2 + AndroidUtilities.dp(14.0f);
            }
            if (this.currentMessageObject.isSponsored()) {
                this.totalHeight += AndroidUtilities.dp(2.0f);
            }
            StaticLayout staticLayout2 = this.instantViewLayout;
            if (staticLayout2 == null || staticLayout2.getLineCount() <= 0) {
                return;
            }
            this.instantTextX = (((int) (this.instantWidth - Math.ceil(this.instantViewLayout.getLineWidth(0)))) / 2) + (this.drawInstantViewType == 0 ? AndroidUtilities.dp(8.0f) : 0);
            int lineLeft = (int) this.instantViewLayout.getLineLeft(0);
            this.instantTextLeftX = lineLeft;
            this.instantTextX += -lineLeft;
        }
    }

    private void createContactButtons() {
        int i;
        boolean z;
        createSelectorDrawable(0);
        if (this.drawContact) {
            boolean z2 = this.drawContactView;
            if (this.drawContactSendMessage) {
                boolean z3 = (z2 ? 1 : 0) | 2;
                i = (z2 ? 1 : 0) + 1;
                z = z3;
            } else {
                i = z2 ? 1 : 0;
                z = z2;
            }
            boolean z4 = z;
            if (this.drawContactAdd) {
                i++;
                z4 = (z ? 1 : 0) | 4;
            }
            if (i == 0) {
                this.contactButtons = null;
                this.drawnContactButtonsFlag = 0;
                return;
            }
            this.totalHeight += AndroidUtilities.dp(60.0f);
            if (z4 != this.drawnContactButtonsFlag) {
                this.drawnContactButtonsFlag = 0;
                int iDp = (this.backgroundWidth - AndroidUtilities.dp(75.0f)) / i;
                float fDpf2 = (this.backgroundWidth - AndroidUtilities.dpf2(37.0f)) / i;
                ArrayList arrayList = this.contactButtons;
                if (arrayList == null) {
                    this.contactButtons = new ArrayList(i);
                } else {
                    arrayList.clear();
                }
                if (this.drawContactView) {
                    this.drawnContactButtonsFlag |= 1;
                    this.contactButtons.add(createInstantViewButton(5, LocaleController.getString("ViewContact", R.string.ViewContact), iDp, fDpf2));
                }
                if (this.drawContactSendMessage) {
                    this.drawnContactButtonsFlag |= 2;
                    this.contactButtons.add(createInstantViewButton(30, LocaleController.getString("SharedContactMessage", R.string.SharedContactMessage), iDp, fDpf2));
                }
                if (this.drawContactAdd) {
                    this.drawnContactButtonsFlag |= 4;
                    this.contactButtons.add(createInstantViewButton(31, LocaleController.getString("SharedContactAdd", R.string.SharedContactAdd), iDp, fDpf2));
                }
            }
        }
    }

    private InstantViewButton createInstantViewButton(int i, String str, int i2, float f) {
        InstantViewButton instantViewButton = new InstantViewButton();
        instantViewButton.type = i;
        instantViewButton.layout = new StaticLayout(TextUtils.ellipsize(str, Theme.chat_instantViewPaint, i2, TextUtils.TruncateAt.END), Theme.chat_instantViewPaint, i2 + AndroidUtilities.dp(2.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        instantViewButton.buttonWidth = f;
        if (instantViewButton.layout.getLineCount() > 0) {
            instantViewButton.textX = ((float) (instantViewButton.buttonWidth - Math.ceil(instantViewButton.layout.getLineWidth(0)))) / 2.0f;
            InstantViewButton.access$4424(instantViewButton, (int) instantViewButton.layout.getLineLeft(0));
        }
        return instantViewButton;
    }

    @Override
    public void requestLayout() {
        if (this.inLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && (messageObject.checkLayout() || this.lastHeight != AndroidUtilities.displaySize.y)) {
            this.inLayout = true;
            MessageObject messageObject2 = this.currentMessageObject;
            this.currentMessageObject = null;
            setMessageObject(messageObject2, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop, this.firstInChat);
            this.inLayout = false;
        }
        updateSelectionTextPosition();
        int i3 = this.starsPriceTopPadding + this.topicSeparatorTopPadding + this.suggestionOfferTopPadding + this.totalHeight + this.keyboardHeight + this.askBotForumBottomPadding + this.bottomActionPadding;
        ChatActivityDraftMessageMeasureController draftMessageMeasureController = getDraftMessageMeasureController();
        int overrideMeasureHeight = draftMessageMeasureController != null ? draftMessageMeasureController.getOverrideMeasureHeight(this.currentMessageObject, i3) : i3;
        this.additionalPaddingHeight = Math.max(0, overrideMeasureHeight - i3);
        setMeasuredDimension(isWidthAdaptive() ? getBoundsRight() - getBoundsLeft() : View.MeasureSpec.getSize(i), overrideMeasureHeight);
    }

    public int getAdditionalPaddingHeight() {
        return this.additionalPaddingHeight;
    }

    public void forceResetMessageObject() {
        MessageObject messageObject = this.messageObjectToSet;
        if (messageObject == null) {
            messageObject = this.currentMessageObject;
        }
        MessageObject messageObject2 = messageObject;
        this.currentMessageObject = null;
        setMessageObject(messageObject2, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop, this.firstInChat);
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.preview) {
            parentWidth = this.parentWidth;
        }
        return (AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) ? parentWidth : (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2) ? parentWidth - AndroidUtilities.getTabletLeftFragmentSize(parentWidth, 0, 0) : parentWidth;
    }

    int getExtraTextX() {
        int i = SharedConfig.bubbleRadius;
        if (i >= 15) {
            return AndroidUtilities.dp(2.0f);
        }
        if (i >= 11) {
            return AndroidUtilities.dp(1.0f);
        }
        return 0;
    }

    private int getExtraTimeX() {
        int i;
        if (!this.currentMessageObject.isOutOwner() && ((!this.mediaBackground || this.captionLayout != null) && (i = SharedConfig.bubbleRadius) > 11)) {
            return AndroidUtilities.dp((i - 11) / 1.5f);
        }
        if (!this.currentMessageObject.isOutOwner() && this.isPlayingRound && this.isAvatarVisible && this.currentMessageObject.type == 5) {
            return (int) ((AndroidUtilities.roundPlayingMessageSize(this.isSideMenued) - AndroidUtilities.roundMessageSize) * 0.7f);
        }
        return 0;
    }

    public void relayout() {
        this.forcedLayout = true;
        forceLayout();
    }

    @Override
    protected void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.onLayout(boolean, int, int, int, int):void");
    }

    public boolean needDelayRoundProgressDraw() {
        MessageObject messageObject;
        int i = this.documentAttachType;
        return (i == 7 || i == 4) && (messageObject = this.currentMessageObject) != null && messageObject.type != 5 && MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
    }

    public void drawRoundProgress(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawRoundProgress(android.graphics.Canvas):void");
    }

    private void updatePollAnimations(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.updatePollAnimations(long):void");
    }

    public void drawContent(final android.graphics.Canvas r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawContent(android.graphics.Canvas, boolean):void");
    }

    public void lambda$drawContent$13(Canvas canvas) {
        this.radialProgress.draw(canvas);
    }

    private void checkStakedDice() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isStakedDice() || this.playedDice) {
            return;
        }
        Drawable drawable = this.photoImage.getDrawable();
        if (drawable instanceof RLottieDiceDrawable) {
            RLottieDiceDrawable rLottieDiceDrawable = (RLottieDiceDrawable) drawable;
            if (rLottieDiceDrawable.hasBaseDice() && !this.playedDice && rLottieDiceDrawable.isDiceRevealed()) {
                this.playedDice = true;
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate != null) {
                    chatMessageCellDelegate.forceUpdate(this, false);
                }
            }
        }
    }

    public void startRevealMedia() throws Resources.NotFoundException, NumberFormatException {
        startRevealMedia(this.photoImage.getImageX() + (this.photoImage.getImageWidth() / 2.0f), this.photoImage.getImageY() + (this.photoImage.getImageHeight() / 2.0f));
    }

    public void startRevealMedia(float f, float f2) throws Resources.NotFoundException, NumberFormatException {
        float fSqrt = (float) Math.sqrt(Math.pow(this.photoImage.getImageWidth(), 2.0d) + Math.pow(this.photoImage.getImageHeight(), 2.0d));
        this.mediaSpoilerRevealMaxRadius = fSqrt;
        startRevealMedia(f, f2, fSqrt);
    }

    private void startRevealMedia(float f, float f2, float f3) throws Resources.NotFoundException, NumberFormatException {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject.isMediaSpoilersRevealed || this.mediaSpoilerRevealProgress != 0.0f) {
            return;
        }
        if (messageObject.type == 3) {
            messageObject.forceUpdate = true;
            messageObject.revealingMediaSpoilers = true;
            setMessageContent(messageObject, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop, this.firstInChat, this.lastInChatList);
            MessageObject messageObject2 = this.currentMessageObject;
            messageObject2.revealingMediaSpoilers = false;
            messageObject2.forceUpdate = false;
            if (this.currentMessagesGroup != null) {
                this.radialProgress.setProgress(0.0f, false);
            }
        }
        this.mediaSpoilerRevealX = f;
        this.mediaSpoilerRevealY = f2;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) MathUtils.clamp(this.mediaSpoilerRevealMaxRadius * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$startRevealMedia$14(valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChatMessageCell.this.currentMessageObject.isMediaSpoilersRevealed = true;
                ChatMessageCell.this.invalidate();
            }
        });
        duration.start();
    }

    public void lambda$startRevealMedia$14(ValueAnimator valueAnimator) {
        this.mediaSpoilerRevealProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void drawBlurredPhoto(Canvas canvas) {
        if (this.currentMessageObject.isMediaSpoilersRevealed || this.mediaSpoilerRevealProgress == 1.0f) {
            return;
        }
        int[] roundRadius = this.photoImage.getRoundRadius();
        float[] fArr = this.mediaSpoilerRadii;
        float f = roundRadius[0];
        fArr[1] = f;
        fArr[0] = f;
        float f2 = roundRadius[1];
        fArr[3] = f2;
        fArr[2] = f2;
        float f3 = roundRadius[2];
        fArr[5] = f3;
        fArr[4] = f3;
        float f4 = roundRadius[3];
        fArr[7] = f4;
        fArr[6] = f4;
        this.mediaSpoilerPath.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.photoImage.getImageX(), this.photoImage.getImageY(), this.photoImage.getImageX2(), this.photoImage.getImageY2());
        Path path = this.mediaSpoilerPath;
        float[] fArr2 = this.mediaSpoilerRadii;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr2, direction);
        canvas.save();
        canvas.clipPath(this.mediaSpoilerPath);
        if (this.mediaSpoilerRevealProgress != 0.0f) {
            this.mediaSpoilerPath.rewind();
            this.mediaSpoilerPath.addCircle(this.mediaSpoilerRevealX, this.mediaSpoilerRevealY, this.mediaSpoilerRevealMaxRadius * this.mediaSpoilerRevealProgress, direction);
            canvas.clipPath(this.mediaSpoilerPath, Region.Op.DIFFERENCE);
        }
        if (this.currentMessageObject.needDrawBluredPreview()) {
            this.photoImage.draw(canvas);
        } else {
            this.blurredPhotoImage.setImageCoords(this.photoImage.getImageX(), this.photoImage.getImageY(), this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
            this.blurredPhotoImage.setRoundRadius(this.photoImage.getRoundRadius());
            this.blurredPhotoImage.draw(canvas);
        }
        drawBlurredPhotoParticles(canvas);
        canvas.restore();
    }

    public void drawBlurredPhotoParticles(Canvas canvas) {
        if (this.mediaSpoilerEffect2 == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.photoImage.getImageX(), this.photoImage.getImageY());
        this.mediaSpoilerEffect2.draw(canvas, this, (int) this.photoImage.getImageWidth(), (int) this.photoImage.getImageHeight(), this.photoImage.getAlpha(), this.drawingToBitmap);
        canvas.restore();
        invalidate();
    }

    private float getUseTranscribeButtonProgress() {
        TransitionParams transitionParams = this.transitionParams;
        if (!transitionParams.animateUseTranscribeButton) {
            return this.useTranscribeButton ? 1.0f : 0.0f;
        }
        if (this.useTranscribeButton) {
            return transitionParams.animateChangeProgress;
        }
        return 1.0f - transitionParams.animateChangeProgress;
    }

    public void updateReactionLayoutPosition() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.updateReactionLayoutPosition():void");
    }

    public float getPhotoBottom() {
        if (this.groupMedia != null) {
            return r0.y + r0.height;
        }
        return this.photoImage.getImageY2();
    }

    public void drawVoiceOnce(Canvas canvas, float f, Runnable runnable) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            float fCenterX = this.radialProgress.progressRect.centerX() + (((float) Math.cos((AndroidUtilities.lerp(190, 45, f) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f));
            float fCenterY = this.radialProgress.progressRect.centerY() + (((float) Math.sin((AndroidUtilities.lerp(190, 45, f) / 180.0f) * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.radialProgress.progressRect);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            canvas.saveLayerAlpha(rectF, 255, 31);
            this.radialProgress.setBackgroundDrawable(isDrawSelectionBackground() ? this.currentBackgroundSelectedDrawable : this.currentBackgroundDrawable);
            this.radialProgress.iconScale = f;
            runnable.run();
            if (this.onceClearPaint == null) {
                Paint paint = new Paint(1);
                this.onceClearPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (f < 1.0f) {
                canvas.save();
                float f2 = 1.0f - f;
                float f3 = 0.7f * f2;
                float fCenterX2 = this.radialProgress.progressRect.centerX();
                RectF rectF2 = this.radialProgress.progressRect;
                canvas.scale(f3, f3, fCenterX2, AndroidUtilities.lerp(rectF2.top, rectF2.bottom, 0.5f));
                if (this.onceFire == null) {
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.fire_once, "fire_once", AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), true, null);
                    this.onceFire = rLottieDrawable;
                    rLottieDrawable.setMasterParent(this);
                    this.onceFire.setAllowDecodeSingleFrame(true);
                    this.onceFire.setAutoRepeat(1);
                    this.onceFire.start();
                }
                RLottieDrawable rLottieDrawable2 = this.onceFire;
                RectF rectF3 = this.radialProgress.progressRect;
                rLottieDrawable2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                if (this.onceRadialPaint == null) {
                    this.onceRadialPaint = new Paint(1);
                }
                if (this.onceRadialCutPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.onceRadialCutPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                }
                if (this.onceRadialStrokePaint == null) {
                    Paint paint3 = new Paint(1);
                    this.onceRadialStrokePaint = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i = radialProgress2.iconColorKey;
                int themedColor = i >= 0 ? getThemedColor(i) : radialProgress2.iconColor;
                this.onceRadialPaint.setColor(themedColor);
                this.onceRadialStrokePaint.setColor(themedColor);
                this.radialProgress.mediaActionDrawable.applyShaderMatrix(false);
                this.onceRadialPaint.setShader(this.radialProgress.mediaActionDrawable.paint2.getShader());
                this.onceRadialStrokePaint.setShader(this.radialProgress.mediaActionDrawable.paint2.getShader());
                rectF.set(this.onceFire.getBounds());
                canvas.saveLayerAlpha(rectF, 255, 31);
                rectF.inset(1.0f, 1.0f);
                canvas.drawRect(rectF, this.onceRadialPaint);
                this.onceFire.draw(canvas, this.onceRadialCutPaint);
                canvas.restore();
                canvas.restore();
                this.onceRadialStrokePaint.setAlpha((int) (255.0f * f2));
                this.onceRadialStrokePaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
                this.rect.set(this.radialProgress.progressRect);
                this.rect.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                canvas.drawArc(this.rect, -90.0f, (1.0f - this.seekBarWaveform.explodeProgress) * (-360.0f), false, this.onceRadialStrokePaint);
                if (this.timerParticles == null) {
                    this.timerParticles = new TimerParticles();
                }
                this.timerParticles.draw(canvas, this.onceRadialStrokePaint, this.rect, (1.0f - this.seekBarWaveform.explodeProgress) * (-360.0f), f2);
            } else {
                RLottieDrawable rLottieDrawable3 = this.onceFire;
                if (rLottieDrawable3 != null) {
                    rLottieDrawable3.recycle(true);
                    this.onceFire = null;
                    if (this.timerParticles != null) {
                        this.timerParticles = null;
                    }
                }
            }
            canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp((f * 1.5f) + 10.0f) * f, this.onceClearPaint);
            canvas.restore();
            if (this.oncePeriod == null) {
                CaptionContainerView.PeriodDrawable periodDrawable = new CaptionContainerView.PeriodDrawable(3);
                this.oncePeriod = periodDrawable;
                periodDrawable.updateColors(-1, 0, 0);
                CaptionContainerView.PeriodDrawable periodDrawable2 = this.oncePeriod;
                periodDrawable2.diameterDp = 14.0f;
                periodDrawable2.setTextSize(10.0f);
                this.oncePeriod.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                this.oncePeriod.setValue(1, false, false);
                this.oncePeriod.textOffsetX = -AndroidUtilities.dpf2(0.33f);
                this.oncePeriod.textOffsetY = AndroidUtilities.dpf2(0.33f);
            }
            CaptionContainerView.PeriodDrawable periodDrawable3 = this.oncePeriod;
            periodDrawable3.diameterDp = f * 14.0f;
            periodDrawable3.setTextSize(f * 10.0f);
            canvas.saveLayerAlpha(fCenterX - AndroidUtilities.dp(10.0f), fCenterY - AndroidUtilities.dp(10.0f), fCenterX + AndroidUtilities.dp(10.0f), fCenterY + AndroidUtilities.dp(10.0f), 255, 31);
            canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(10.0f) * f, this.radialProgress.circlePaint);
            this.oncePeriod.setClear(AndroidUtilities.computePerceivedBrightness(this.radialProgress.circlePaint.getColor()) > 0.8f);
            this.oncePeriod.setCenterXY(fCenterX, fCenterY);
            this.oncePeriod.draw(canvas, f);
            canvas.restore();
            return;
        }
        runnable.run();
    }

    public void drawLinkPreview(android.graphics.Canvas r48, float r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawLinkPreview(android.graphics.Canvas, float):void");
    }

    public void drawFactCheck(Canvas canvas, float f) {
        int iDp;
        int extraTextX;
        int iDp2;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition == null || groupedMessagePosition.last) {
            float fLerp = this.hasFactCheck ? 1.0f : 0.0f;
            TransitionParams transitionParams = this.transitionParams;
            if (transitionParams.animateFactCheck) {
                fLerp = AndroidUtilities.lerp(1.0f - fLerp, fLerp, transitionParams.animateChangeProgress);
            }
            float f2 = f * fLerp;
            if (f2 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight();
            TransitionParams transitionParams2 = this.transitionParams;
            float fDp = ((backgroundDrawableRight + (transitionParams2 != null ? transitionParams2.deltaRight : 0.0f)) - AndroidUtilities.dp(10 + ((!this.currentMessageObject.isOutOwner() || this.mediaBackground || this.drawPinnedBottom) ? 0 : 6))) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                iDp2 = (int) this.captionX;
            } else if (this.currentMessageObject.isOutOwner()) {
                iDp2 = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                if (this.currentMessageObject.type == 19) {
                    iDp2 -= Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + iDp2) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.mediaBackground) {
                    iDp = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f);
                    extraTextX = getExtraTextX();
                } else {
                    iDp = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
                    extraTextX = getExtraTextX();
                }
                iDp2 = iDp + extraTextX;
            }
            int iDp3 = ((int) (iDp2 + this.transitionParams.deltaLeft)) - AndroidUtilities.dp(1.33f);
            int i = this.factCheckY;
            float f3 = iDp3;
            int i2 = (int) (fDp - f3);
            int iLerp = this.factCheckHeight;
            TransitionParams transitionParams3 = this.transitionParams;
            if (transitionParams3.animateFactCheckHeight) {
                iLerp = AndroidUtilities.lerp(transitionParams3.animateFactCheckHeightFrom, iLerp, transitionParams3.animateChangeProgress);
            }
            float f4 = (!this.factCheckLarge || (getPrimaryMessageObject() != null && getPrimaryMessageObject().factCheckExpanded)) ? 1.0f : 0.0f;
            TransitionParams transitionParams4 = this.transitionParams;
            if (transitionParams4.animateFactCheckExpanded) {
                AndroidUtilities.lerp(1.0f - f4, f4, transitionParams4.animateChangeProgress);
            }
            if (this.factCheckLine == null) {
                this.factCheckLine = new ReplyMessageLine(this);
            }
            int factCheck = this.factCheckLine.setFactCheck(this.resourcesProvider);
            canvas.save();
            canvas.translate(f3, i);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i2, iLerp);
            ButtonBounce buttonBounce = this.factCheckBounce;
            float scale = buttonBounce != null ? buttonBounce.getScale(0.01f) : 1.0f;
            canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
            this.factCheckLine.drawBackground(canvas, rectF, 5.0f, 5.0f, 5.0f, f2, false, false);
            this.factCheckLine.drawLine(canvas, rectF, f2);
            Text text = this.factCheckTitle;
            if (text != null) {
                text.draw(canvas, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), factCheck, f2);
                if (this.factCheckWhat != null) {
                    rectF.set((int) (AndroidUtilities.dp(10.0f) + this.factCheckTitle.getCurrentWidth() + AndroidUtilities.dp(4.0f)), AndroidUtilities.dp(4.33f), AndroidUtilities.dp(10.0f) + r1 + this.factCheckWhat.getCurrentWidth(), AndroidUtilities.dp(21.66f));
                    ButtonBounce buttonBounce2 = this.factCheckWhatBounce;
                    float scale2 = buttonBounce2 != null ? buttonBounce2.getScale(0.1f) : 1.0f;
                    canvas.save();
                    canvas.scale(scale2, scale2, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), this.factCheckLine.backgroundPaint);
                    this.factCheckWhat.draw(canvas, r1 + AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), factCheck, f2);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public void drawFactCheckText(Canvas canvas, float f) {
        int iDp;
        int extraTextX;
        int iDp2;
        float f2;
        int i;
        float f3;
        float f4;
        RectF rectF;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition == null || groupedMessagePosition.last) {
            float fLerp = this.hasFactCheck ? 1.0f : 0.0f;
            TransitionParams transitionParams = this.transitionParams;
            if (transitionParams.animateFactCheck) {
                fLerp = AndroidUtilities.lerp(1.0f - fLerp, fLerp, transitionParams.animateChangeProgress);
            }
            float f5 = f * fLerp;
            if (f5 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight();
            TransitionParams transitionParams2 = this.transitionParams;
            float fDp = ((backgroundDrawableRight + (transitionParams2 != null ? transitionParams2.deltaRight : 0.0f)) - AndroidUtilities.dp(10 + ((!this.currentMessageObject.isOutOwner() || this.mediaBackground || this.drawPinnedBottom) ? 0 : 6))) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                iDp2 = (int) this.captionX;
            } else {
                if (this.currentMessageObject.isOutOwner()) {
                    iDp2 = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                    if (this.currentMessageObject.type == 19) {
                        iDp2 -= Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + iDp2) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.mediaBackground) {
                        iDp = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f);
                        extraTextX = getExtraTextX();
                    } else {
                        iDp = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
                        extraTextX = getExtraTextX();
                    }
                    iDp2 = iDp + extraTextX;
                }
            }
            int iDp3 = ((int) (iDp2 + this.transitionParams.deltaLeft)) - AndroidUtilities.dp(1.33f);
            int i2 = this.factCheckY;
            float f6 = iDp3;
            int i3 = (int) (fDp - f6);
            int iLerp = this.factCheckHeight;
            TransitionParams transitionParams3 = this.transitionParams;
            if (transitionParams3.animateFactCheckHeight) {
                iLerp = AndroidUtilities.lerp(transitionParams3.animateFactCheckHeightFrom, iLerp, transitionParams3.animateChangeProgress);
            }
            int i4 = iLerp;
            float fLerp2 = (!this.factCheckLarge || (getPrimaryMessageObject() != null && getPrimaryMessageObject().factCheckExpanded)) ? 1.0f : 0.0f;
            TransitionParams transitionParams4 = this.transitionParams;
            if (transitionParams4.animateFactCheckExpanded) {
                fLerp2 = AndroidUtilities.lerp(1.0f - fLerp2, fLerp2, transitionParams4.animateChangeProgress);
            }
            float f7 = fLerp2;
            if (this.factCheckLine == null) {
                this.factCheckLine = new ReplyMessageLine(this);
            }
            int factCheck = this.factCheckLine.setFactCheck(this.resourcesProvider);
            canvas.save();
            canvas.translate(f6, i2);
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f8 = i3;
            float f9 = i4;
            rectF2.set(0.0f, 0.0f, f8, f9);
            ButtonBounce buttonBounce = this.factCheckBounce;
            float scale = buttonBounce != null ? buttonBounce.getScale(0.01f) : 1.0f;
            canvas.scale(scale, scale, rectF2.centerX(), rectF2.centerY());
            if (this.factCheckTextLayout != null) {
                if (this.factCheckLarge) {
                    f3 = f9;
                    f4 = f8;
                    rectF = rectF2;
                    f2 = f7;
                    i = factCheck;
                    canvas.saveLayerAlpha(0.0f, 0.0f, f8, i4 - 1, 255, 31);
                } else {
                    f3 = f9;
                    f4 = f8;
                    rectF = rectF2;
                    f2 = f7;
                    i = factCheck;
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dp(10.0f) - this.factCheckTextLayoutLeft, AndroidUtilities.dp(22.0f));
                Theme.chat_replyTextPaint.linkColor = i;
                LinkSpanDrawable.LinkCollector linkCollector = this.factCheckLinks;
                if (linkCollector != null && linkCollector.draw(canvas)) {
                    invalidateOutbounds();
                }
                if (this.currentMessageObject.isOutOwner()) {
                    Theme.chat_replyTextPaint.setColor(getThemedColor(Theme.key_chat_messageTextOut));
                } else {
                    Theme.chat_replyTextPaint.setColor(getThemedColor(Theme.key_chat_messageTextIn));
                }
                int alpha = Theme.chat_replyTextPaint.getAlpha();
                Theme.chat_replyTextPaint.setAlpha((int) (alpha * f5));
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate != null && chatMessageCellDelegate.getTextSelectionHelper() != null && getDelegate().getTextSelectionHelper().isSelected(this.currentMessageObject)) {
                    this.delegate.getTextSelectionHelper().drawFactCheck(this.currentMessageObject.isOutOwner(), this.factCheckTextLayout, canvas);
                }
                this.factCheckTextLayout.draw(canvas);
                canvas.restore();
                Theme.chat_replyTextPaint.setAlpha(alpha);
                rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(22.0f) + this.factCheckTextLayoutHeight + AndroidUtilities.dp(6.33f), i3 - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(22.0f) + this.factCheckTextLayoutHeight + AndroidUtilities.dp(6.33f) + 1);
                Theme.chat_titleLabelTextPaint.setColor(i);
                Theme.chat_titleLabelTextPaint.setAlpha((int) (r2.getAlpha() * 0.5f * f5));
                canvas.drawRect(rectF, Theme.chat_titleLabelTextPaint);
                canvas.save();
                canvas.translate(AndroidUtilities.dp(10.0f) - this.factCheckText2LayoutLeft, AndroidUtilities.dp(22.0f) + this.factCheckTextLayoutHeight + AndroidUtilities.dp(12.66f));
                Theme.chat_titleLabelTextPaint.setColor(i);
                Theme.chat_titleLabelTextPaint.setAlpha((int) (r1.getAlpha() * f5));
                this.factCheckText2Layout.draw(canvas);
                canvas.restore();
                if (this.clip == null) {
                    this.clip = new GradientClip();
                }
                if (this.factCheckLarge) {
                    canvas.save();
                    int iDp4 = AndroidUtilities.dp((AndroidUtilities.dp(22.0f) + this.factCheckTextLayoutHeight) + AndroidUtilities.dp(12.66f) < i4 ? 20.0f : 24.0f);
                    rectF.set(0.0f, (i4 - AndroidUtilities.dp(6.66f)) - iDp4, f4, f3);
                    float f10 = (1.0f - f2) * f5;
                    this.clip.draw(canvas, rectF, 3, f10);
                    float f11 = i4 - iDp4;
                    rectF.set(i3 - AndroidUtilities.dp(60.0f), f11, i3 - AndroidUtilities.dp(32.0f), f3);
                    this.clip.draw(canvas, rectF, 2, f10);
                    rectF.set(i3 - AndroidUtilities.dp(32.0f), f11, f4, f3);
                    canvas.drawRect(rectF, this.clip.getPaint(2, f10));
                    canvas.restore();
                    canvas.restore();
                }
            } else {
                f2 = f7;
                i = factCheck;
            }
            if (this.factCheckLarge) {
                if (this.factCheckArrow == null) {
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
                    this.factCheckArrow = drawableMutate;
                    this.factCheckArrowColor = i;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
                if (i != this.factCheckArrowColor) {
                    Drawable drawable = this.factCheckArrow;
                    this.factCheckArrowColor = i;
                    drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
                canvas.save();
                int iDp5 = AndroidUtilities.dp(16.0f);
                this.factCheckArrow.setBounds((i3 - iDp5) - AndroidUtilities.dp(7.0f), (i4 - iDp5) - AndroidUtilities.dp(5.0f), i3 - AndroidUtilities.dp(7.0f), i4 - AndroidUtilities.dp(5.0f));
                canvas.rotate(AndroidUtilities.lerp(0, 180, f2), this.factCheckArrow.getBounds().centerX(), this.factCheckArrow.getBounds().centerY());
                this.factCheckArrow.setAlpha((int) (f5 * 255.0f));
                this.factCheckArrow.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    private float isSmallImage() {
        TransitionParams transitionParams = this.transitionParams;
        if (!transitionParams.animateSmallImage) {
            return this.isSmallImage ? 1.0f : 0.0f;
        }
        boolean z = this.isSmallImage;
        float f = transitionParams.animateChangeProgress;
        return z ? f : 1.0f - f;
    }

    public boolean shouldDrawMenuDrawable() {
        MessageObject messageObject;
        return (this.currentMessagesGroup == null || (this.currentPosition.flags & 4) != 0) && !this.hasLinkPreview && ((messageObject = this.currentMessageObject) == null || !(messageObject.isRepostPreview || messageObject.isSponsored()));
    }

    private void drawContact(Canvas canvas) {
        boolean z;
        float scale;
        if (this.contactLine == null) {
            this.contactLine = new ReplyMessageLine(this);
        }
        int iCheck = this.contactLine.check(this.currentMessageObject, this.currentUser, this.currentChat, this.resourcesProvider, 4);
        if (this.contactBounce == null) {
            this.contactBounce = new ButtonBounce(this, 2.0f, 2.0f);
        }
        int imageX = (int) (this.photoImage.getImageX() - AndroidUtilities.dp(13.0f));
        int iDp = this.layoutHeight - AndroidUtilities.dp(62.0f);
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.isEmpty && !reactionsLayoutInBubble.isSmall) {
            iDp -= reactionsLayoutInBubble.totalHeight;
        }
        if (this.drawCommentButton) {
            iDp -= AndroidUtilities.dp(shouldDrawTimeOnMedia() ? 39.3f : 41.0f);
        }
        int i = iDp;
        if (this.contactRect == null) {
            this.contactRect = new RectF();
        }
        float backgroundDrawableRight = (getBackgroundDrawableRight() - (AndroidUtilities.dp(10.0f) + ((!this.currentMessageObject.isOutOwner() || this.mediaBackground || this.drawPinnedBottom) ? 0 : AndroidUtilities.dp(6.0f)))) - getExtraTextX();
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateBackgroundBoundsInner) {
            backgroundDrawableRight += transitionParams.deltaRight;
        }
        this.contactRect.set(imageX, this.photoImage.getImageY() - AndroidUtilities.dp(9.0f), backgroundDrawableRight, AndroidUtilities.dp(38.0f) + i);
        float scale2 = this.contactBounce.getScale(0.0125f);
        boolean z2 = scale2 != 1.0f;
        if (z2) {
            canvas.save();
            canvas.scale(scale2, scale2, this.contactRect.centerX(), this.contactRect.centerY());
        }
        Drawable drawable = this.selectorDrawable[0];
        if (drawable != null) {
            this.selectorDrawableMaskType[0] = 0;
            drawable.setBounds(imageX, (int) (this.photoImage.getImageY() - AndroidUtilities.dp(9.0f)), (int) backgroundDrawableRight, AndroidUtilities.dp(38.0f) + i);
            if (this.selectorDrawableColor != Theme.multAlpha(this.contactLine.getColor(), 0.1f)) {
                Drawable drawable2 = this.selectorDrawable[0];
                int iMultAlpha = Theme.multAlpha(this.contactLine.getColor(), 0.1f);
                this.selectorDrawableColor = iMultAlpha;
                Theme.setSelectorDrawableColor(drawable2, iMultAlpha, true);
            }
            this.selectorDrawable[0].draw(canvas);
        }
        float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
        int i2 = (int) fFloor;
        this.contactLine.drawBackground(canvas, this.contactRect, fFloor, fFloor, fFloor, 1.0f);
        this.contactLine.drawLine(canvas, this.contactRect, 1.0f);
        Theme.chat_contactNamePaint.setColor(iCheck);
        Theme.chat_contactPhonePaint.setColor(getThemedColor(Theme.key_chat_inContactPhoneSelectedText));
        if (this.currentMessageObject.isOutOwner()) {
            Theme.chat_contactPhonePaint.setColor(getThemedColor(Theme.key_chat_messageTextOut));
        } else {
            Theme.chat_contactPhonePaint.setColor(getThemedColor(Theme.key_chat_messageTextIn));
        }
        if (this.titleLayout != null) {
            canvas.save();
            canvas.translate(this.photoImage.getImageX() + this.photoImage.getImageWidth() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(27.0f) + this.namesOffset);
            SpoilerEffect.layoutDrawMaybe(this.titleLayout, canvas);
            canvas.restore();
        }
        if (this.docTitleLayout != null) {
            canvas.save();
            canvas.translate(this.photoImage.getImageX() + this.photoImage.getImageWidth() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(50.0f) + this.namesOffset);
            SpoilerEffect.layoutDrawMaybe(this.docTitleLayout, canvas);
            canvas.restore();
        }
        ArrayList arrayList = this.contactButtons;
        if (arrayList != null && arrayList.size() > 0) {
            Theme.chat_instantViewPaint.setColor(iCheck);
            Theme.chat_instantViewButtonPaint.setColor(Theme.multAlpha(iCheck, 0.1f));
            int alpha = Theme.chat_instantViewPaint.getAlpha();
            Theme.chat_instantViewPaint.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(AndroidUtilities.dp(10.0f) + this.contactRect.left, AndroidUtilities.dp(2.0f) + i, this.contactRect.right - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(2.0f) + i + Math.max(1, AndroidUtilities.dp(0.66f)), Theme.chat_instantViewPaint);
            Theme.chat_instantViewPaint.setAlpha(alpha);
            int iDp2 = i + AndroidUtilities.dp(2.0f);
            float fDp = imageX + AndroidUtilities.dp(3.0f);
            ArrayList arrayList2 = this.contactButtons;
            boolean z3 = arrayList2 != null && arrayList2.size() > 1;
            int backgroundColor = this.contactLine.getBackgroundColor();
            int i3 = 0;
            while (i3 < this.contactButtons.size()) {
                InstantViewButton instantViewButton = (InstantViewButton) this.contactButtons.get(i3);
                float fMin = Math.min(instantViewButton.buttonWidth + fDp, this.contactRect.right);
                instantViewButton.rect.set(fDp, iDp2, fMin, AndroidUtilities.dp(36.0f) + iDp2);
                if (z3 && instantViewButton.selectorDrawable == null) {
                    this.linkPreviewSelectorColor = backgroundColor;
                    instantViewButton.selectorDrawable = Theme.createRadSelectorDrawable(backgroundColor, 0, 0, i3 == this.contactButtons.size() - 1 ? i2 : 0, 0);
                    instantViewButton.selectorDrawable.setCallback(this);
                }
                if (instantViewButton.selectorDrawable != null) {
                    instantViewButton.selectorDrawable.setBounds((int) fDp, iDp2, (int) fMin, AndroidUtilities.dp(36.0f) + iDp2);
                    instantViewButton.selectorDrawable.draw(canvas);
                }
                if (z2 || instantViewButton.buttonBounce == null) {
                    z = false;
                    scale = 1.0f;
                } else {
                    scale = instantViewButton.buttonBounce.getScale(0.02f);
                    z = scale != 1.0f;
                }
                if (z) {
                    canvas.save();
                    canvas.scale(scale, scale, instantViewButton.rect.centerX(), instantViewButton.rect.centerY());
                }
                if (instantViewButton.layout != null) {
                    canvas.save();
                    canvas.translate(instantViewButton.textX + fDp, AndroidUtilities.dp(10.5f) + iDp2);
                    instantViewButton.layout.draw(canvas);
                    canvas.restore();
                }
                if (z) {
                    canvas.restore();
                }
                fDp += instantViewButton.buttonWidth;
                i3++;
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    private void drawBotButtons(android.graphics.Canvas r19, java.util.ArrayList r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawBotButtons(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final boolean drawButtonProgress(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            return SendMessagesHelper.getInstance(this.currentAccount).isSendingCallback(this.currentMessageObject, keyboardButtonProto);
        }
        if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
            return SendMessagesHelper.getInstance(this.currentAccount).isSendingCurrentLocation(this.currentMessageObject, keyboardButtonProto);
        }
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
        return tL_inlineButtonTypeUrl != null && (chatMessageCellDelegate = this.delegate) != null && chatMessageCellDelegate.isProgressLoading(this, 3) && TextUtils.equals(this.delegate.getProgressLoadingBotButtonUrl(this), tL_inlineButtonTypeUrl.url);
    }

    private boolean allowDrawPhotoImage() {
        return !this.currentMessageObject.hasMediaSpoilers() || this.currentMessageObject.isMediaSpoilersRevealed || this.mediaSpoilerRevealProgress != 0.0f || this.blurredPhotoImage.getBitmap() == null;
    }

    public void layoutTextXY(boolean z) {
        int iDp;
        int i;
        int iDp2;
        int iDp3;
        if (this.currentMessageObject.isOutOwner()) {
            this.textX = (z ? (int) (this.backgroundDrawableLeft + this.transitionParams.deltaLeft) : getCurrentBackgroundLeft()) + AndroidUtilities.dp(11.0f) + getExtraTextX();
        } else {
            int currentBackgroundLeft = z ? (int) (this.backgroundDrawableLeft + this.transitionParams.deltaLeft) : getCurrentBackgroundLeft();
            if (this.currentMessageObject.type == 19) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp((this.mediaBackground || !this.drawPinnedBottom) ? 17.0f : 11.0f);
            }
            this.textX = currentBackgroundLeft + iDp + getExtraTextX();
        }
        if (this.hasGamePreview) {
            this.textX += AndroidUtilities.dp(11.0f);
            int iDp4 = AndroidUtilities.dp(14.0f) + this.namesOffset;
            this.textY = iDp4;
            StaticLayout staticLayout = this.siteNameLayout;
            if (staticLayout != null) {
                this.textY = iDp4 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            }
        } else if (this.hasInvoicePreview) {
            int iDp5 = AndroidUtilities.dp(14.0f) + this.namesOffset;
            this.textY = iDp5;
            StaticLayout staticLayout2 = this.siteNameLayout;
            if (staticLayout2 != null) {
                this.textY = iDp5 + staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            }
        } else if (this.currentMessageObject.type == 19) {
            this.textY = AndroidUtilities.dp(6.0f) + this.namesOffset;
            if (!this.currentMessageObject.isOut()) {
                this.textX = getCurrentBackgroundLeft();
            } else {
                this.textX -= AndroidUtilities.dp(4.0f);
            }
        } else {
            int iDp6 = AndroidUtilities.dp(8.0f) + this.namesOffset;
            this.textY = iDp6;
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject.type == 36) {
                RichMessageLayout richMessageLayout = messageObject.richLayout;
                if (richMessageLayout != null && richMessageLayout.startsWithMedia()) {
                    this.textY += AndroidUtilities.dp(this.namesOffset <= 0 ? -3.0f : 2.0f);
                }
            } else {
                if (messageObject.hasCodeAtTop && (i = SharedConfig.bubbleRadius) > 10) {
                    this.textY = iDp6 + AndroidUtilities.dp(i < 15 ? 1.0f : 2.0f);
                }
                if (this.currentMessageObject.hasCodeAtTop && this.namesOffset > 0) {
                    this.textY += AndroidUtilities.dp(5.0f);
                }
            }
        }
        if (this.currentMessageObject.isSponsored()) {
            this.linkPreviewY = this.textY + AndroidUtilities.dp(14.0f);
        } else if (this.linkPreviewAbove) {
            this.linkPreviewY = this.textY + AndroidUtilities.dp(10.0f);
            this.textY += this.linkPreviewHeight + AndroidUtilities.dp(13.0f);
            if (this.drawInstantView && !this.hasInvoicePreview && !this.currentMessageObject.isGiveawayOrGiveawayResults()) {
                this.textY += AndroidUtilities.dp(44.0f);
            }
        } else {
            this.linkPreviewY = this.textY + this.currentMessageObject.textHeight(this.transitionParams) + AndroidUtilities.dp(10.0f);
        }
        if (this.linkPreviewAbove) {
            iDp2 = this.textY + this.currentMessageObject.textHeight(this.transitionParams);
            iDp3 = AndroidUtilities.dp(10.0f);
        } else {
            iDp2 = this.linkPreviewY + this.linkPreviewHeight + AndroidUtilities.dp(this.drawInstantView ? 46.0f : 0.0f);
            iDp3 = AndroidUtilities.dp(this.linkPreviewHeight <= 0 ? -8.0f : 4.0f);
        }
        this.factCheckY = iDp2 + iDp3;
        this.unmovedTextX = this.textX;
        if (this.currentMessageObject.textXOffset == 0.0f || this.replyNameLayout == null) {
            return;
        }
        int iDp7 = this.backgroundWidth - AndroidUtilities.dp(31.0f);
        MessageObject messageObject2 = this.currentMessageObject;
        int iDp8 = iDp7 - messageObject2.textWidth;
        if (!this.hasNewLineForTime) {
            iDp8 -= this.timeWidth + AndroidUtilities.dp((messageObject2.isOutOwner() ? 20 : 0) + 4);
        }
        if (iDp8 > 0) {
            this.textX += iDp8 - getExtraTimeX();
        }
    }

    public void drawMessageText(Canvas canvas) {
        float f;
        float fTextHeight;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.isSponsored()) {
            return;
        }
        float f2 = this.textY;
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateTextY) {
            float f3 = transitionParams.animateFromTextY;
            float f4 = transitionParams.animateChangeProgress;
            f = (f3 * (1.0f - f4)) + (f4 * f2);
        } else {
            f = f2;
        }
        if (transitionParams.animateChangeProgress != 1.0f && transitionParams.animateMessageText) {
            canvas.save();
            MessageDrawable messageDrawable = this.currentBackgroundDrawable;
            if (messageDrawable != null) {
                Rect bounds = messageDrawable.getBounds();
                if (this.currentMessageObject.isOutOwner() && !this.mediaBackground && !this.pinnedBottom) {
                    canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                } else {
                    canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                }
            }
            MultiLayoutTypingAnimator multiLayoutTypingAnimator = this.botDraftTypingAnimator;
            if (multiLayoutTypingAnimator != null && multiLayoutTypingAnimator.isRunning()) {
                float f5 = this.textX;
                MessageObject messageObject2 = this.currentMessageObject;
                drawMessageText(f5, f, canvas, messageObject2.textLayoutBlocks, messageObject2.textXOffset, true, 1.0f, true, false, false);
            } else {
                float f6 = f;
                drawMessageText(this.textX, f6, canvas, this.transitionParams.animateOutTextBlocks, this.transitionParams.animateOutTextXOffset, false, 1.0f - this.transitionParams.animateChangeProgress, true, false, false);
                float f7 = this.textX;
                MessageObject messageObject3 = this.currentMessageObject;
                drawMessageText(f7, f6, canvas, messageObject3.textLayoutBlocks, messageObject3.textXOffset, true, this.transitionParams.animateChangeProgress, true, false, false);
            }
            canvas.restore();
            return;
        }
        boolean z = transitionParams.animateLinkAbove;
        if (z && this.currentBackgroundDrawable != null) {
            if (z) {
                float fTextHeight2 = (this.linkPreviewAbove ? 1 : -1) * this.currentMessageObject.textHeight(transitionParams);
                TransitionParams transitionParams2 = this.transitionParams;
                f = f2 + (fTextHeight2 * (1.0f - transitionParams2.animateChangeProgress));
                fTextHeight = transitionParams2.animateFromTextY - (((this.linkPreviewAbove ? 1 : -1) * this.currentMessageObject.textHeight(transitionParams2)) * this.transitionParams.animateChangeProgress);
            } else {
                fTextHeight = f;
            }
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.currentBackgroundDrawable.getBounds());
            if (this.currentMessageObject.isOutOwner() && !this.mediaBackground && !this.pinnedBottom) {
                rectF.left += AndroidUtilities.dp(4.0f);
                rectF.right -= AndroidUtilities.dp(10.0f);
            } else {
                rectF.left += AndroidUtilities.dp(4.0f);
                rectF.right -= AndroidUtilities.dp(4.0f);
            }
            float f8 = rectF.left;
            float f9 = this.transitionParams.animateFromTextY;
            canvas.clipRect(f8, f9, rectF.right, this.currentMessageObject.textHeight(r1) + f9 + AndroidUtilities.dp(4.0f));
            float f10 = this.textX;
            MessageObject messageObject4 = this.currentMessageObject;
            drawMessageText(f10, fTextHeight, canvas, messageObject4.textLayoutBlocks, messageObject4.textXOffset, false, 1.0f - this.transitionParams.animateChangeProgress, true, false, false);
            canvas.restore();
            canvas.save();
            rectF.set(this.currentBackgroundDrawable.getBounds());
            if (this.currentMessageObject.isOutOwner() && !this.mediaBackground && !this.pinnedBottom) {
                rectF.left += AndroidUtilities.dp(4.0f);
                rectF.right -= AndroidUtilities.dp(10.0f);
            } else {
                rectF.left += AndroidUtilities.dp(4.0f);
                rectF.right -= AndroidUtilities.dp(4.0f);
            }
            canvas.clipRect(rectF.left, this.textY, rectF.right, r1 + this.currentMessageObject.textHeight(this.transitionParams) + AndroidUtilities.dp(4.0f));
            float f11 = this.textX;
            MessageObject messageObject5 = this.currentMessageObject;
            drawMessageText(f11, f, canvas, messageObject5.textLayoutBlocks, messageObject5.textXOffset, true, 1.0f, true, false, false);
            canvas.restore();
            return;
        }
        float f12 = this.textX;
        MessageObject messageObject6 = this.currentMessageObject;
        drawMessageText(f12, f, canvas, messageObject6.textLayoutBlocks, messageObject6.textXOffset, true, 1.0f, true, false, false);
    }

    public void drawMessageText(Canvas canvas, ArrayList arrayList, boolean z, float f, boolean z2) {
        float f2;
        float f3 = this.textY;
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateTextY) {
            float f4 = transitionParams.animateFromTextY;
            float f5 = transitionParams.animateChangeProgress;
            f2 = (f4 * (1.0f - f5)) + (f3 * f5);
        } else {
            f2 = f3;
        }
        float f6 = this.textX;
        MessageObject messageObject = this.currentMessageObject;
        drawMessageText(f6, f2, canvas, arrayList, messageObject == null ? 0.0f : messageObject.textXOffset, z, f, false, z2, false);
    }

    public void drawMessageText(float f, float f2, Canvas canvas, ArrayList arrayList, float f3, boolean z, float f4, boolean z2, boolean z3, boolean z4) {
        drawMessageText(f, f2, canvas, arrayList, f3, z, f4, z2, z3, z4, false);
    }

    public void drawMessageText(float r46, float r47, android.graphics.Canvas r48, java.util.ArrayList r49, float r50, boolean r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawMessageText(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean, boolean):void");
    }

    public org.telegram.ui.Components.AnimatedEmojiSpan[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.getAnimatedEmojiSpans():org.telegram.ui.Components.AnimatedEmojiSpan[]");
    }

    public void updateCaptionLayout() {
        float imageX;
        float imageY;
        float imageHeight;
        float fDp;
        int i;
        int iDp;
        MessageObject messageObject = this.currentMessageObject;
        int i2 = messageObject.type;
        boolean z = true;
        if (i2 == 1 || i2 == 20 || this.documentAttachType == 4 || i2 == 8 || i2 == 23) {
            TransitionParams transitionParams = this.transitionParams;
            if (transitionParams.imageChangeBoundsTransition) {
                imageX = transitionParams.animateToImageX;
                imageY = transitionParams.animateToImageY;
                imageHeight = transitionParams.animateToImageH;
            } else {
                imageX = this.photoImage.getImageX();
                imageY = this.photoImage.getImageY();
                imageHeight = this.photoImage.getImageHeight();
            }
            this.captionX = imageX + AndroidUtilities.dp(5.0f) + this.captionOffsetX;
            float fDp2 = imageY + imageHeight + AndroidUtilities.dp(6.0f);
            this.captionY = imageY + AndroidUtilities.lerp(imageHeight + AndroidUtilities.dp(6.0f), (this.captionLayout == null ? 0 : -r6.textHeight()) - AndroidUtilities.dp(4.0f), mediaAbove());
            fDp = fDp2;
            z = false;
        } else {
            float f = 43.0f;
            float f2 = 0.0f;
            if (this.hasOldCaptionPreview) {
                this.captionX = this.backgroundDrawableLeft + AndroidUtilities.dp(messageObject.isOutOwner() ? 11.0f : 17.0f) + this.captionOffsetX;
                int iDp2 = (((this.totalHeight - this.captionHeight) - AndroidUtilities.dp(this.drawPinnedTop ? 9.0f : 10.0f)) - this.linkPreviewHeight) - AndroidUtilities.dp(17.0f);
                if (!this.drawCommentButton || this.drawSideButton == 3) {
                    f = 0.0f;
                } else if (shouldDrawTimeOnMedia()) {
                    f = 41.3f;
                }
                fDp = iDp2 - AndroidUtilities.dp(f);
                this.captionY = AndroidUtilities.lerp(fDp, AndroidUtilities.dp(9.0f) + this.namesOffset, mediaAbove());
            } else {
                if (this.isRoundVideo) {
                    this.captionX = getBackgroundDrawableLeft() + AndroidUtilities.dp((this.currentMessageObject.isOutOwner() ? 0 : 6) + 11);
                } else {
                    int i3 = this.backgroundDrawableLeft;
                    if (!messageObject.isOutOwner() && !this.mediaBackground && !this.drawPinnedBottom) {
                        f = 17.0f;
                    }
                    this.captionX = i3 + AndroidUtilities.dp(f) + this.captionOffsetX;
                }
                int iDp3 = (this.totalHeight - this.captionHeight) - AndroidUtilities.dp(this.drawPinnedTop ? 9.0f : 10.0f);
                if (!this.drawCommentButton || this.drawSideButton == 3) {
                    f = 0.0f;
                } else if (shouldDrawTimeOnMedia()) {
                    f = 41.3f;
                }
                int iDp4 = iDp3 - AndroidUtilities.dp(f);
                ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                if (reactionsLayoutInBubble.isEmpty || reactionsLayoutInBubble.isSmall) {
                    iDp = 0;
                } else {
                    if (this.currentMessageObject.type == 9 && this.currentPosition == null) {
                        f2 = 10.0f;
                    }
                    iDp = AndroidUtilities.dp(f2) + this.reactionsLayoutInBubble.totalHeight;
                }
                fDp = iDp4 - iDp;
                this.captionY = AndroidUtilities.lerp(fDp, AndroidUtilities.dp(9.0f) + this.namesOffset, mediaAbove());
            }
        }
        this.captionX += getExtraTextX();
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && (i = messageObject2.type) != 0 && i != 24 && !messageObject2.isGiveawayOrGiveawayResults() && !this.currentMessageObject.isSponsored()) {
            if (z && this.hasFactCheck) {
                this.captionY -= (this.factCheckHeight + AndroidUtilities.dp(16.0f)) * (1.0f - mediaAbove());
            }
            this.factCheckY = (int) (((fDp - (z ? this.factCheckHeight + AndroidUtilities.dp(14.0f) : 0)) + AndroidUtilities.lerp(this.captionLayout != null ? r1.textHeight(this.transitionParams) + AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(6.0f), mediaAbove())) - this.transitionParams.deltaTop);
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 == null || messageObject3.type != 17) {
            return;
        }
        this.captionY += this.pollContentHeightWithOffset;
    }

    private float mediaAbove() {
        TransitionParams transitionParams = this.transitionParams;
        if (!transitionParams.animateMediaAbove) {
            return this.captionAbove ? 1.0f : 0.0f;
        }
        boolean z = this.captionAbove;
        return AndroidUtilities.lerp(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f, transitionParams.animateChangeProgress);
    }

    public int captionFlag() {
        return this.captionAbove ? 4 : 8;
    }

    private boolean textIsSelectionMode() {
        ChatMessageCellDelegate chatMessageCellDelegate;
        return getCurrentMessagesGroup() == null && (chatMessageCellDelegate = this.delegate) != null && chatMessageCellDelegate.getTextSelectionHelper() != null && this.delegate.getTextSelectionHelper().isSelected(this.currentMessageObject);
    }

    public float getViewTop() {
        return this.viewTop;
    }

    public int getBackgroundHeight() {
        return this.backgroundHeight;
    }

    public int getMiniIconForCurrentState() {
        int i = this.miniButtonState;
        if (i < 0) {
            return 4;
        }
        return i == 0 ? 2 : 3;
    }

    public int getIconForCurrentState() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.hasExtendedMedia()) {
            return 4;
        }
        if (this.documentAttachType == 7 && this.currentMessageObject.isVoiceTranscriptionOpen() && this.canStreamVideo) {
            int i = this.buttonState;
            return (i == 1 || i == 4) ? 1 : 0;
        }
        int i2 = this.documentAttachType;
        if (i2 == 3 || i2 == 5) {
            if (this.currentMessageObject.isOutOwner()) {
                this.radialProgress.setColorKeys(Theme.key_chat_outLoader, Theme.key_chat_outLoaderSelected, Theme.key_chat_outMediaIcon, Theme.key_chat_outMediaIconSelected);
            } else {
                ReplyMessageLine replyMessageLine = this.linkLine;
                if (replyMessageLine != null && this.hasLinkPreview) {
                    this.radialProgress.setColors(replyMessageLine.getColor(), this.linkLine.getColor(), Theme.blendOver(-1, Theme.multAlpha(this.linkLine.getColor(), 0.01f)), Theme.blendOver(-1, Theme.multAlpha(this.linkLine.getColor(), 0.05f)));
                } else {
                    this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
                }
            }
            int i3 = this.buttonState;
            if (i3 == 1) {
                return 1;
            }
            if (i3 == 2) {
                return 2;
            }
            return i3 == 4 ? 3 : 0;
        }
        if (i2 == 1 && !this.drawPhotoImage) {
            if (this.currentMessageObject.isOutOwner()) {
                this.radialProgress.setColorKeys(Theme.key_chat_outLoader, Theme.key_chat_outLoaderSelected, Theme.key_chat_outMediaIcon, Theme.key_chat_outMediaIconSelected);
            } else {
                ReplyMessageLine replyMessageLine2 = this.linkLine;
                if (replyMessageLine2 != null && this.hasLinkPreview) {
                    this.radialProgress.setColors(replyMessageLine2.getColor(), this.linkLine.getColor(), Theme.blendOver(-1, Theme.multAlpha(this.linkLine.getColor(), 0.01f)), Theme.blendOver(-1, Theme.multAlpha(this.linkLine.getColor(), 0.05f)));
                } else {
                    this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
                }
            }
            int i4 = this.buttonState;
            if (i4 == -1) {
                return 5;
            }
            if (i4 == 0) {
                return 2;
            }
            if (i4 == 1) {
                return 3;
            }
        } else {
            RadialProgress2 radialProgress2 = this.radialProgress;
            int i5 = Theme.key_chat_mediaLoaderPhoto;
            int i6 = Theme.key_chat_mediaLoaderPhotoSelected;
            int i7 = Theme.key_chat_mediaLoaderPhotoIcon;
            int i8 = Theme.key_chat_mediaLoaderPhotoIconSelected;
            radialProgress2.setColorKeys(i5, i6, i7, i8);
            this.videoRadialProgress.setColorKeys(i5, i6, i7, i8);
            int i9 = this.buttonState;
            if (i9 >= 0 && i9 < 4) {
                if (i9 == 0) {
                    return 2;
                }
                if (i9 == 1) {
                    return 3;
                }
                return (i9 != 2 && this.autoPlayingMedia) ? 4 : 0;
            }
            if (i9 == -1) {
                if (this.documentAttachType == 1) {
                    return (!this.drawPhotoImage || (this.currentPhotoObject == null && this.currentPhotoObjectThumb == null) || !(this.photoImage.hasBitmapImage() || this.currentMessageObject.mediaExists() || this.currentMessageObject.attachPathExists)) ? 5 : 4;
                }
                if (this.currentMessageObject.needDrawBluredPreview()) {
                    return 7;
                }
                if (this.hasEmbed) {
                    return 0;
                }
            }
        }
        MessageObject messageObject2 = this.currentMessageObject;
        return (messageObject2 != null && this.isRoundVideo && messageObject2.isVoiceTranscriptionOpen()) ? 0 : 4;
    }

    public int getMaxNameWidth() {
        int iMin;
        int iDp;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i;
        int iDp2;
        int iDp3;
        int parentWidth;
        int i2 = this.documentAttachType;
        if (i2 == 6 || i2 == 8 || (i = (messageObject2 = this.currentMessageObject).type) == 5) {
            float f = 0.0f;
            if (AndroidUtilities.isTablet()) {
                iMin = AndroidUtilities.getMinTabletSide();
                if (this.isSideMenued) {
                    f = 71.0f;
                } else if (needDrawAvatar()) {
                    f = 42.0f;
                }
                iDp = AndroidUtilities.dp(f);
            } else {
                iMin = Math.min(getParentWidth(), AndroidUtilities.displaySize.y);
                if (this.isSideMenued) {
                    f = 71.0f;
                } else if (needDrawAvatar()) {
                    f = 42.0f;
                }
                iDp = AndroidUtilities.dp(f);
            }
            int iDp4 = iMin - iDp;
            MessageObject messageObject3 = this.currentMessageObject;
            if (messageObject3 != null && messageObject3.isSaved && messageObject3.isOutOwner() && checkNeedDrawShareButton(this.currentMessageObject)) {
                iDp4 -= AndroidUtilities.dp(25.0f);
            }
            if (this.isPlayingRound && ((messageObject = this.currentMessageObject) == null || !messageObject.isVoiceTranscriptionOpen())) {
                return (iDp4 - (this.backgroundWidth - (AndroidUtilities.roundPlayingMessageSize(this.isSideMenued) - AndroidUtilities.roundMessageSize))) - AndroidUtilities.dp(57.0f);
            }
            if (this.isSideMenued && (this.currentMessageObject.type == 5 || this.documentAttachType == 6)) {
                return this.backgroundWidth - AndroidUtilities.dp(57.0f);
            }
            return (iDp4 - this.backgroundWidth) - AndroidUtilities.dp(57.0f);
        }
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && !groupedMessages.isDocuments) {
            if (AndroidUtilities.isTablet()) {
                parentWidth = AndroidUtilities.getMinTabletSide();
            } else {
                parentWidth = getParentWidth();
            }
            iDp2 = 0;
            for (int i3 = 0; i3 < this.currentMessagesGroup.posArray.size(); i3++) {
                if (this.currentMessagesGroup.posArray.get(i3).minY != 0) {
                    break;
                }
                iDp2 = (int) (iDp2 + Math.ceil(((r4.pw + r4.leftSpanOffset) / 1000.0f) * parentWidth));
            }
            if (this.isSideMenued) {
                i = 71;
            } else if (needDrawAvatar()) {
                i = 48;
            }
            iDp3 = AndroidUtilities.dp(i + 31);
        } else {
            if (i == 19) {
                return Math.max(messageObject2.textWidth, (int) (((AndroidUtilities.displaySize.x - AndroidUtilities.dp(52.0f)) - (this.isAvatarVisible ? AndroidUtilities.dp(48.0f) : 0)) * 0.5f));
            }
            iDp2 = this.backgroundWidth;
            if (messageObject2.isSaved && messageObject2.isOutOwner() && checkNeedDrawShareButton(this.currentMessageObject)) {
                iDp2 -= AndroidUtilities.dp(25.0f);
            }
            iDp3 = AndroidUtilities.dp(this.mediaBackground ? 22.0f : 31.0f);
        }
        return iDp2 - iDp3;
    }

    public void updatePollContentButtonState(boolean z, boolean z2, boolean z3) {
        PollContentDrawable pollContentDrawable = this.pollContentDrawable;
        if (pollContentDrawable != null) {
            pollContentDrawable.updatePlayingMessageProgress();
        }
        PollContentDrawable pollContentDrawable2 = this.pollExplanationDrawable;
        if (pollContentDrawable2 != null) {
            pollContentDrawable2.updatePlayingMessageProgress();
        }
        invalidate();
    }

    public void updateButtonState(boolean r18, boolean r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.updateButtonState(boolean, boolean, boolean):void");
    }

    private void didPressMiniButton(boolean z) {
        int i = this.miniButtonState;
        if (i != 0) {
            if (i == 1) {
                int i2 = this.documentAttachType;
                if ((i2 == 3 || i2 == 5 || i2 == 7) && MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                }
                this.miniButtonState = 0;
                this.currentMessageObject.loadingCancelled = true;
                FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.documentAttach);
                this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        this.miniButtonState = 1;
        this.radialProgress.setProgress(0.0f, false);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && !messageObject.isAnyKindOfSticker()) {
            this.currentMessageObject.putInDownloadsStore = true;
        }
        int i3 = this.documentAttachType;
        if (i3 == 3 || i3 == 5) {
            FileLoader fileLoader = FileLoader.getInstance(this.currentAccount);
            TLRPC.Document document = this.documentAttach;
            MessageObject messageObject2 = this.currentMessageObject;
            fileLoader.loadFile(document, messageObject2, 2, messageObject2.shouldEncryptPhotoOrVideo() ? 2 : 0);
            this.currentMessageObject.loadingCancelled = false;
        } else if (i3 == 4 || i3 == 7) {
            createLoadingProgressLayout(this.documentAttach);
            FileLoader fileLoader2 = FileLoader.getInstance(this.currentAccount);
            TLRPC.Document document2 = this.documentAttach;
            MessageObject messageObject3 = this.currentMessageObject;
            fileLoader2.loadFile(document2, messageObject3, 2, messageObject3.shouldEncryptPhotoOrVideo() ? 2 : 0);
            this.currentMessageObject.loadingCancelled = false;
        }
        this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, true);
        invalidate();
    }

    private void didPressButton(boolean z, boolean z2) {
        MessageObject messageObject;
        MessageObject playingMessageObject;
        MessageObject messageObject2;
        TLRPC.PhotoSize photoSize;
        String str;
        MessageObject messageObject3;
        if (this.delegate != null && this.currentMessageObject.isSensitive() && this.currentMessageObject.hasMediaSpoilers() && !this.currentMessageObject.needDrawBluredPreview() && !this.currentMessageObject.isMediaSpoilersRevealed) {
            this.delegate.didPressRevealSensitiveContent(this);
            return;
        }
        MessageObject messageObject4 = this.currentMessageObject;
        if (messageObject4 != null && !messageObject4.isAnyKindOfSticker()) {
            this.currentMessageObject.putInDownloadsStore = true;
        }
        int i = this.buttonState;
        if (i == 0 && (!this.drawVideoImageButton || z2)) {
            int i2 = this.documentAttachType;
            if (i2 == 3 || i2 == 5 || (i2 == 7 && (messageObject3 = this.currentMessageObject) != null && messageObject3.isVoiceTranscriptionOpen() && this.currentMessageObject.mediaExists)) {
                if (this.miniButtonState == 0) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 2, 0);
                    this.currentMessageObject.loadingCancelled = false;
                }
                if (this.delegate.needPlayMessage(this, this.currentMessageObject, false)) {
                    if (this.hasMiniProgress == 2 && this.miniButtonState != 1) {
                        this.miniButtonState = 1;
                        this.radialProgress.setProgress(0.0f, false);
                        this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, true);
                    }
                    updatePlayingMessageProgress();
                    this.buttonState = 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (z2) {
                this.videoRadialProgress.setProgress(0.0f, false);
            } else {
                this.radialProgress.setProgress(0.0f, false);
            }
            if (this.currentPhotoObject != null && (this.photoImage.hasNotThumb() || this.currentPhotoObjectThumb == null)) {
                photoSize = this.currentPhotoObject;
                str = ((photoSize instanceof TLRPC.TL_photoStrippedSize) || "s".equals(photoSize.type)) ? this.currentPhotoFilterThumb : this.currentPhotoFilter;
            } else {
                photoSize = this.currentPhotoObjectThumb;
                str = this.currentPhotoFilterThumb;
            }
            String str2 = str;
            int i3 = this.currentMessageObject.shouldEncryptPhotoOrVideo() ? 2 : 0;
            MessageObject messageObject5 = this.currentMessageObject;
            int i4 = messageObject5.type;
            if (i4 == 1 || i4 == 20) {
                this.photoImage.setForceLoading(true);
                this.photoImage.setImage(ImageLocation.getForObject(this.currentPhotoObject, this.photoParentObject), this.currentPhotoFilter, ImageLocation.getForObject(this.currentPhotoObjectThumb, this.photoParentObject), this.currentPhotoFilterThumb, this.currentPhotoObjectThumbStripped, this.currentPhotoObject.size, null, this.currentMessageObject, i3);
            } else if (i4 == 8) {
                FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 2, 0);
                if (this.currentMessageObject.loadedFileSize > 0) {
                    createLoadingProgressLayout(this.documentAttach);
                }
            } else if (this.isRoundVideo) {
                if (messageObject5.isSecretMedia()) {
                    FileLoader fileLoader = FileLoader.getInstance(this.currentAccount);
                    TLRPC.Document document = this.currentMessageObject.getDocument();
                    MessageObject messageObject6 = this.currentMessageObject;
                    fileLoader.loadFile(document, messageObject6, 2, messageObject6.shouldEncryptPhotoOrVideo() ? 2 : 1);
                } else {
                    MessageObject messageObject7 = this.currentMessageObject;
                    messageObject7.gifState = 2.0f;
                    TLRPC.Document document2 = messageObject7.getDocument();
                    this.photoImage.setForceLoading(true);
                    this.photoImage.setImage(ImageLocation.getForDocument(document2), null, ImageLocation.getForObject(photoSize, document2), str2, document2.size, null, this.currentMessageObject, 0);
                }
                this.wouldBeInPip = true;
                invalidate();
            } else if (i4 == 9) {
                FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 2, 0);
                if (this.currentMessageObject.loadedFileSize > 0) {
                    createLoadingProgressLayout(this.documentAttach);
                }
            } else {
                int i5 = this.documentAttachType;
                if (i5 == 4) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 1, i3);
                    MessageObject messageObject8 = this.currentMessageObject;
                    if (messageObject8.loadedFileSize > 0) {
                        createLoadingProgressLayout(messageObject8.getDocument());
                    }
                } else if (i4 != 0 || i5 == 0) {
                    this.photoImage.setForceLoading(true);
                    this.photoImage.setImage(ImageLocation.getForObject(this.currentPhotoObject, this.photoParentObject), this.currentPhotoFilter, ImageLocation.getForObject(this.currentPhotoObjectThumb, this.photoParentObject), this.currentPhotoFilterThumb, this.currentPhotoObjectThumbStripped, 0L, null, this.currentMessageObject, 0);
                } else if (i5 == 2) {
                    this.photoImage.setForceLoading(true);
                    this.photoImage.setImage(ImageLocation.getForDocument(this.documentAttach), null, ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), this.currentPhotoFilterThumb, this.documentAttach.size, null, this.currentMessageObject, i3);
                    MessageObject messageObject9 = this.currentMessageObject;
                    messageObject9.gifState = 2.0f;
                    if (messageObject9.loadedFileSize > 0) {
                        createLoadingProgressLayout(messageObject9.getDocument());
                    }
                } else if (i5 == 1) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 2, 0);
                } else if (i5 == 8) {
                    this.photoImage.setImage(ImageLocation.getForDocument(this.documentAttach), this.currentPhotoFilter, ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), "b1", 0L, "jpg", this.currentMessageObject, 1);
                }
            }
            this.currentMessageObject.loadingCancelled = false;
            this.buttonState = 1;
            if (z2) {
                this.videoRadialProgress.setIcon(14, false, z);
            } else {
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            }
            invalidate();
            return;
        }
        if (i == 1 && (!this.drawVideoImageButton || z2)) {
            this.photoImage.setForceLoading(false);
            int i6 = this.documentAttachType;
            if (i6 == 3 || i6 == 5 || (i6 == 7 && (messageObject2 = this.currentMessageObject) != null && messageObject2.isVoiceTranscriptionOpen())) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                    return;
                }
                return;
            }
            if (this.currentMessageObject.isOut() && !this.drawVideoImageButton && (this.currentMessageObject.isSending() || this.currentMessageObject.isEditing())) {
                if (this.radialProgress.getIcon() != 6) {
                    this.delegate.didPressCancelSendButton(this);
                    return;
                }
                return;
            }
            MessageObject messageObject10 = this.currentMessageObject;
            messageObject10.loadingCancelled = true;
            int i7 = this.documentAttachType;
            if (i7 == 2 || i7 == 4 || i7 == 1 || i7 == 8) {
                FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.documentAttach);
            } else {
                int i8 = messageObject10.type;
                if (i8 == 0 || i8 == 1 || i8 == 20 || i8 == 8 || i8 == 5) {
                    ImageLoader.getInstance().cancelForceLoadingForImageReceiver(this.photoImage);
                    this.photoImage.cancelLoadImage();
                } else if (i8 == 9) {
                    FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.currentMessageObject.getDocument());
                }
            }
            this.buttonState = 0;
            if (z2) {
                this.videoRadialProgress.setIcon(2, false, z);
            } else {
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            }
            invalidate();
            return;
        }
        if (i != 2) {
            if (i == 3 || i == 0) {
                if (this.hasMiniProgress == 2 && this.miniButtonState != 1) {
                    this.miniButtonState = 1;
                    this.radialProgress.setProgress(0.0f, false);
                    this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, z);
                }
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate != null) {
                    chatMessageCellDelegate.didPressImage(this, 0.0f, 0.0f, false);
                    return;
                }
                return;
            }
            if (i == 4) {
                int i9 = this.documentAttachType;
                if (i9 == 3 || i9 == 5 || (i9 == 7 && (messageObject = this.currentMessageObject) != null && messageObject.isVoiceTranscriptionOpen())) {
                    if ((this.currentMessageObject.isOut() && (this.currentMessageObject.isSending() || this.currentMessageObject.isEditing())) || this.currentMessageObject.isSendError()) {
                        if (this.delegate == null || this.radialProgress.getIcon() == 6) {
                            return;
                        }
                        this.delegate.didPressCancelSendButton(this);
                        return;
                    }
                    this.currentMessageObject.loadingCancelled = true;
                    FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.documentAttach);
                    this.buttonState = 2;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        MessageObject messageObject11 = this.currentMessageObject;
        if (messageObject11 != null && messageObject11.type == 23) {
            this.delegate.didPressImage(this, 0.0f, 0.0f, false);
            return;
        }
        if (this.documentAttachType == 7 && messageObject11 != null && messageObject11.isVoiceTranscriptionOpen()) {
            if (this.miniButtonState == 0) {
                FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 2, 0);
                this.currentMessageObject.loadingCancelled = false;
            }
            if (this.delegate.needPlayMessage(this, this.currentMessageObject, false)) {
                if (this.hasMiniProgress == 2 && this.miniButtonState != 1) {
                    this.miniButtonState = 1;
                    this.radialProgress.setProgress(0.0f, false);
                    this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, true);
                }
                updatePlayingMessageProgress();
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
            if (this.isRoundVideo) {
                this.wouldBeInPip = true;
                invalidate();
                return;
            }
            return;
        }
        int i10 = this.documentAttachType;
        if (i10 == 3 || i10 == 5) {
            this.radialProgress.setProgress(0.0f, false);
            FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 2, 0);
            this.currentMessageObject.loadingCancelled = false;
            this.buttonState = 4;
            this.radialProgress.setIcon(getIconForCurrentState(), true, z);
            invalidate();
            return;
        }
        if (!this.isRoundVideo || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || !playingMessageObject.isRoundVideo()) {
            this.photoImage.setAllowStartAnimation(true);
            this.photoImage.startAnimation();
        }
        this.currentMessageObject.gifState = 0.0f;
        this.buttonState = -1;
        this.radialProgress.setIcon(getIconForCurrentState(), false, z);
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        int i = this.documentAttachType;
        updateButtonState(true, i == 3 || i == 5, false);
    }

    @Override
    public void onSuccessDownload(java.lang.String r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.onSuccessDownload(java.lang.String):void");
    }

    @Override
    public void didSetImage(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public boolean setCurrentDiceValue(boolean z) {
        MessagesController.DiceFrameSuccess diceFrameSuccess;
        if (!this.currentMessageObject.isDice()) {
            return false;
        }
        Drawable drawable = this.photoImage.getDrawable();
        if (!(drawable instanceof RLottieDiceDrawable)) {
            return false;
        }
        RLottieDiceDrawable rLottieDiceDrawable = (RLottieDiceDrawable) drawable;
        String diceEmoji = this.currentMessageObject.getDiceEmoji();
        TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(diceEmoji);
        if (stickerSetByEmojiOrName == null) {
            MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(diceEmoji, true, true);
            return false;
        }
        int diceValue = this.currentMessageObject.getDiceValue();
        if ("🎰".equals(this.currentMessageObject.getDiceEmoji())) {
            if (diceValue >= 0 && diceValue <= 64) {
                ((SlotsDrawable) rLottieDiceDrawable).setDiceNumber(this, diceValue, stickerSetByEmojiOrName, z);
                if (this.currentMessageObject.isOut()) {
                    rLottieDiceDrawable.setOnFinishCallback(this.diceFinishCallback, Integer.MAX_VALUE);
                }
                this.currentMessageObject.wasUnread = false;
            }
            if (!rLottieDiceDrawable.hasBaseDice() && stickerSetByEmojiOrName.documents.size() > 0) {
                ((SlotsDrawable) rLottieDiceDrawable).setBaseDice(this, stickerSetByEmojiOrName);
            }
        } else {
            if (!rLottieDiceDrawable.hasBaseDice() && stickerSetByEmojiOrName.documents.size() > 0) {
                TLRPC.Document document = stickerSetByEmojiOrName.documents.get(0);
                if (rLottieDiceDrawable.setBaseDice(FileLoader.getInstance(this.currentAccount).getPathToAttach(document, true))) {
                    DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(document), this.currentMessageObject, this);
                    FileLoader.getInstance(this.currentAccount).loadFile(document, stickerSetByEmojiOrName, 1, 1);
                }
            }
            if (diceValue >= 0 && diceValue < stickerSetByEmojiOrName.documents.size()) {
                if (!z && this.currentMessageObject.isOut() && (diceFrameSuccess = MessagesController.getInstance(this.currentAccount).diceSuccess.get(diceEmoji)) != null && diceFrameSuccess.num == diceValue) {
                    rLottieDiceDrawable.setOnFinishCallback(this.diceFinishCallback, diceFrameSuccess.frame);
                }
                TLRPC.Document document2 = stickerSetByEmojiOrName.documents.get(Math.max(diceValue, 0));
                if (rLottieDiceDrawable.setDiceNumber(FileLoader.getInstance(this.currentAccount).getPathToAttach(document2, true), z)) {
                    DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(document2), this.currentMessageObject, this);
                    FileLoader.getInstance(this.currentAccount).loadFile(document2, stickerSetByEmojiOrName, 1, 1);
                }
                this.currentMessageObject.wasUnread = false;
            }
        }
        return true;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && imageReceiver == this.photoImage && messageObject.isAnimatedSticker()) {
            this.delegate.setShouldNotRepeatSticker(this.currentMessageObject);
        }
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.currentMessageObject.loadedFileSize = j;
        createLoadingProgressLayout(j, j2);
        if (this.drawVideoImageButton) {
            this.videoRadialProgress.setProgress(fMin, true);
        } else {
            this.radialProgress.setProgress(fMin, true);
        }
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            if (this.hasMiniProgress != 0) {
                if (this.miniButtonState != 1) {
                    updateButtonState(false, false, false);
                    return;
                }
                return;
            } else {
                if (this.buttonState != 4) {
                    updateButtonState(false, false, false);
                    return;
                }
                return;
            }
        }
        if (this.hasMiniProgress != 0) {
            if (this.miniButtonState != 1) {
                updateButtonState(false, false, false);
            }
        } else if (this.buttonState != 1) {
            updateButtonState(false, false, false);
        }
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
        int i;
        float fMin = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.currentMessageObject.loadedFileSize = j;
        this.radialProgress.setProgress(fMin, true);
        if (j == j2 && ((this.currentPosition != null || this.currentMessageObject.isPaid()) && SendMessagesHelper.getInstance(this.currentAccount).isSendingMessage(this.currentMessageObject.getId()) && ((i = this.buttonState) == 1 || (i == 4 && this.documentAttachType == 5)))) {
            this.drawRadialCheckBackground = true;
            getIconForCurrentState();
            this.radialProgress.setIcon(6, false, true);
        }
        long j3 = this.lastLoadingSizeTotal;
        if (j3 > 0 && Math.abs(j3 - j2) > 1048576) {
            this.lastLoadingSizeTotal = j2;
        }
        createLoadingProgressLayout(j, j2);
    }

    private void createLoadingProgressLayout(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(FileLoader.getDocumentFileName(document));
        if (fileProgressSizes != null) {
            createLoadingProgressLayout(fileProgressSizes[0], fileProgressSizes[1]);
        } else {
            createLoadingProgressLayout(this.currentMessageObject.loadedFileSize, document.size);
        }
    }

    private void createLoadingProgressLayout(long r22, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.createLoadingProgressLayout(long, long):void");
    }

    @Override
    public void onProvideStructure(ViewStructure viewStructure) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onProvideStructure(viewStructure);
        if (!this.allowAssistant || Build.VERSION.SDK_INT < 23) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && (charSequence2 = messageObject.messageText) != null && charSequence2.length() > 0) {
            viewStructure.setText(this.currentMessageObject.messageText);
            return;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 == null || (charSequence = messageObject2.caption) == null || charSequence.length() <= 0) {
            return;
        }
        viewStructure.setText(this.currentMessageObject.caption);
    }

    public void setDelegate(ChatMessageCellDelegate chatMessageCellDelegate) {
        this.delegate = chatMessageCellDelegate;
    }

    public ChatMessageCellDelegate getDelegate() {
        return this.delegate;
    }

    public void setAllowAssistant(boolean z) {
        this.allowAssistant = z;
    }

    private void measureTime(org.telegram.messenger.MessageObject r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.measureTime(org.telegram.messenger.MessageObject):void");
    }

    protected boolean shouldDrawSelectionOverlay() {
        return hasSelectionOverlay() && ((isPressed() && this.isCheckPressed) || ((!this.isCheckPressed && this.isPressed) || this.isHighlighted || this.isHighlightedAnimated)) && !textIsSelectionMode() && ((this.currentMessagesGroup == null || this.drawSelectionBackground) && this.currentBackgroundDrawable != null);
    }

    private int getSelectionOverlayColor() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider == null) {
            return 0;
        }
        MessageObject messageObject = this.currentMessageObject;
        return resourcesProvider.getColor((messageObject == null || !messageObject.isOut()) ? Theme.key_chat_inBubbleSelectedOverlay : Theme.key_chat_outBubbleSelectedOverlay);
    }

    private boolean hasSelectionOverlay() {
        int selectionOverlayColor = getSelectionOverlayColor();
        return (selectionOverlayColor == 0 || selectionOverlayColor == -65536) ? false : true;
    }

    public boolean isDrawSelectionBackground() {
        MessageObject messageObject;
        return ((isPressed() && this.isCheckPressed) || ((!this.isCheckPressed && this.isPressed) || this.isHighlighted)) && !textIsSelectionMode() && !hasSelectionOverlay() && ((messageObject = this.currentMessageObject) == null || !messageObject.preview);
    }

    public boolean isOpenChatByShare(MessageObject messageObject) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        return (messageFwdHeader == null || messageFwdHeader.saved_from_peer == null || ((chatMessageCellDelegate = this.delegate) != null && !chatMessageCellDelegate.isReplyOrSelf())) ? false : true;
    }

    protected boolean checkNeedDrawShareButton(org.telegram.messenger.MessageObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkNeedDrawShareButton(org.telegram.messenger.MessageObject):boolean");
    }

    public boolean isInsideBackground(float f, float f2) {
        if (this.currentBackgroundDrawable != null) {
            if (f >= this.backgroundDrawableLeft && f <= r3 + this.backgroundDrawableRight) {
                return true;
            }
        }
        return false;
    }

    private void updateCurrentUserAndChat() {
        TLRPC.Peer peer;
        if (this.currentMessageObject == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC.MessageFwdHeader messageFwdHeader = this.currentMessageObject.messageOwner.fwd_from;
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel) && (this.currentMessageObject.getDialogId() == clientUserId || this.currentMessageObject.getDialogId() == 1271266957)) {
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(messageFwdHeader.from_id.channel_id));
            return;
        }
        if (messageFwdHeader != null && this.currentMessageObject.getDialogId() == 489000) {
            long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader.from_id);
            if (peerDialogId >= 0) {
                this.currentUser = messagesController.getUser(Long.valueOf(peerDialogId));
                return;
            } else {
                this.currentChat = messagesController.getChat(Long.valueOf(-peerDialogId));
                return;
            }
        }
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long j = peer.user_id;
            if (j != 0) {
                if (!this.isSavedChat) {
                    TLRPC.Peer peer2 = messageFwdHeader.from_id;
                    if (peer2 instanceof TLRPC.TL_peerUser) {
                        this.currentUser = messagesController.getUser(Long.valueOf(peer2.user_id));
                        return;
                    }
                }
                this.currentUser = messagesController.getUser(Long.valueOf(j));
                return;
            }
            if (peer.channel_id != 0) {
                if (this.currentMessageObject.isSavedFromMegagroup()) {
                    TLRPC.Peer peer3 = messageFwdHeader.from_id;
                    if (peer3 instanceof TLRPC.TL_peerUser) {
                        this.currentUser = messagesController.getUser(Long.valueOf(peer3.user_id));
                        return;
                    }
                }
                this.currentChat = messagesController.getChat(Long.valueOf(messageFwdHeader.saved_from_peer.channel_id));
                return;
            }
            long j2 = peer.chat_id;
            if (j2 != 0) {
                TLRPC.Peer peer4 = messageFwdHeader.from_id;
                if (peer4 instanceof TLRPC.TL_peerUser) {
                    this.currentUser = messagesController.getUser(Long.valueOf(peer4.user_id));
                    return;
                } else {
                    this.currentChat = messagesController.getChat(Long.valueOf(j2));
                    return;
                }
            }
            return;
        }
        if (messageFwdHeader != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerUser) && (messageFwdHeader.imported || this.currentMessageObject.getDialogId() == clientUserId)) {
            this.currentUser = messagesController.getUser(Long.valueOf(messageFwdHeader.from_id.user_id));
            return;
        }
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.saved_from_name) && (messageFwdHeader.imported || this.currentMessageObject.getDialogId() == clientUserId)) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            this.currentUser = tL_user;
            tL_user.first_name = messageFwdHeader.saved_from_name;
            return;
        }
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.from_name) && (messageFwdHeader.imported || this.currentMessageObject.getDialogId() == clientUserId)) {
            TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
            this.currentUser = tL_user2;
            tL_user2.first_name = messageFwdHeader.from_name;
            return;
        }
        if (this.currentMessageObject.isWelcomeAnchored()) {
            long dialogId = this.currentMessageObject.getDialogId();
            if (dialogId > 0) {
                this.currentUser = messagesController.getUser(Long.valueOf(dialogId));
                return;
            } else {
                this.currentChat = messagesController.getChat(Long.valueOf(-dialogId));
                return;
            }
        }
        long dialogId2 = this.currentMessageObject.getDialogId();
        long fromChatId = this.currentMessageObject.getFromChatId();
        TLRPC.Chat chat = DialogObject.isChatDialog(fromChatId) ? messagesController.getChat(Long.valueOf(-fromChatId)) : null;
        TLRPC.Chat chat2 = DialogObject.isChatDialog(dialogId2) ? messagesController.getChat(Long.valueOf(-dialogId2)) : null;
        if (DialogObject.isEncryptedDialog(this.currentMessageObject.getDialogId())) {
            if (this.currentMessageObject.isOutOwner()) {
                this.currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                return;
            }
            TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.currentMessageObject.getDialogId())));
            if (encryptedChat != null) {
                this.currentUser = messagesController.getUser(Long.valueOf(encryptedChat.user_id));
                return;
            }
            return;
        }
        if (DialogObject.isUserDialog(fromChatId) && (!this.currentMessageObject.messageOwner.post || (chat != null && chat.signature_profiles))) {
            this.currentUser = messagesController.getUser(Long.valueOf(fromChatId));
            return;
        }
        if (this.currentMessageObject.messageOwner.post && chat2 != null && !chat2.signature_profiles) {
            this.currentChat = chat2;
            return;
        }
        if (DialogObject.isChatDialog(fromChatId)) {
            this.currentChat = chat;
            return;
        }
        TLRPC.Message message = this.currentMessageObject.messageOwner;
        if (message.post) {
            this.currentChat = messagesController.getChat(Long.valueOf(message.peer_id.channel_id));
        }
    }

    private void setMessageObjectInternal(org.telegram.messenger.MessageObject r70) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setMessageObjectInternal(org.telegram.messenger.MessageObject):void");
    }

    private String getNameFromDialogId(long j) {
        TLRPC.Chat chat;
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            if (user != null) {
                return UserObject.getUserName(user);
            }
        } else if (j < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j))) != null) {
            return chat.title;
        }
        return null;
    }

    protected boolean isNeedAuthorName() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject.forceAvatar) {
            return true;
        }
        if (messageObject.getDialogId() == 489000 && (message = this.currentMessageObject.messageOwner) != null && message.fwd_from != null) {
            return true;
        }
        if (this.currentMessageObject.isSponsored() || this.currentMessageObject.isGiveawayOrGiveawayResults()) {
            return false;
        }
        if (this.isBotForum && !this.isPinnedChat) {
            return false;
        }
        TLRPC.Message message2 = this.currentMessageObject.messageOwner;
        if (message2 != null && (messageFwdHeader = message2.fwd_from) != null && (peer = messageFwdHeader.from_id) != null && message2.via_bot_id != 0 && DialogObject.getPeerDialogId(peer) == DialogObject.getPeerDialogId(this.currentMessageObject.messageOwner.peer_id)) {
            return false;
        }
        if (this.isPinnedChat && this.currentMessageObject.type == 0) {
            return true;
        }
        if (!this.pinnedTop && this.drawName && this.isChat) {
            if (!this.currentMessageObject.isOutOwner()) {
                return true;
            }
            if ((this.currentMessageObject.isSupergroup() && this.currentMessageObject.isFromGroup()) || this.currentMessageObject.isRepostPreview) {
                return true;
            }
        }
        return this.currentMessageObject.isImportedForward() && this.currentMessageObject.messageOwner.fwd_from.from_id == null;
    }

    private String getAuthorName() {
        TLRPC.User user = this.currentUser;
        if (user != null) {
            return UserObject.getUserName(user);
        }
        if (this.currentChat != null) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject != null && messageObject.getDialogId() != 1271266957 && this.currentChat.signature_profiles) {
                long peerDialogId = DialogObject.getPeerDialogId(this.currentMessageObject.messageOwner.from_id);
                if (peerDialogId >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (user2 != null) {
                        return UserObject.getUserName(user2);
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        return chat.title;
                    }
                }
            }
            return this.currentChat.title;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && messageObject2.isSponsored()) {
            return this.currentMessageObject.sponsoredTitle;
        }
        return "DELETED";
    }

    private Object getAuthorStatus() {
        MessageObject messageObject;
        TLRPC.User user = this.currentUser;
        if (user != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                TLRPC.EmojiStatus emojiStatus = this.currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.nameStatusSlug = ((TLRPC.TL_emojiStatusCollectible) emojiStatus).slug;
                }
                return emojiStatusDocumentId;
            }
            if (this.currentUser.premium) {
                return ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_premium_liststar).mutate();
            }
            return null;
        }
        if (this.currentChat == null || (messageObject = this.currentMessageObject) == null || messageObject.getDialogId() == 1271266957 || !this.currentChat.signature_profiles) {
            return null;
        }
        long peerDialogId = DialogObject.getPeerDialogId(this.currentMessageObject.messageOwner.from_id);
        if (peerDialogId >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (user2 != null) {
                TLRPC.EmojiStatus emojiStatus2 = user2.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.nameStatusSlug = ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).slug;
                }
            }
            return UserObject.getEmojiStatusDocumentId(user2);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
        if (chat == null) {
            return null;
        }
        TLRPC.EmojiStatus emojiStatus3 = chat.emoji_status;
        if (emojiStatus3 instanceof TLRPC.TL_emojiStatusCollectible) {
            this.nameStatusSlug = ((TLRPC.TL_emojiStatusCollectible) emojiStatus3).slug;
        }
        return Long.valueOf(DialogObject.getEmojiStatusDocumentId(emojiStatus3));
    }

    private long getAuthorBotVerificationId() {
        MessageObject messageObject;
        TLRPC.User user = this.currentUser;
        if (user != null) {
            return DialogObject.getBotVerificationIcon(user);
        }
        if (this.currentChat != null && (messageObject = this.currentMessageObject) != null && messageObject.getDialogId() != 1271266957 && this.currentChat.signature_profiles) {
            long peerDialogId = DialogObject.getPeerDialogId(this.currentMessageObject.messageOwner.from_id);
            if (peerDialogId >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                if (user2 != null) {
                    return DialogObject.getBotVerificationIcon(user2);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    return DialogObject.getBotVerificationIcon(chat);
                }
            }
        }
        return 0L;
    }

    private String getForwardedMessageText(MessageObject messageObject) {
        if (this.hasPsaHint) {
            String string = LocaleController.getString("PsaMessage_" + messageObject.messageOwner.fwd_from.psa_type);
            return string == null ? LocaleController.getString("PsaMessageDefault", R.string.PsaMessageDefault) : string;
        }
        return LocaleController.getString(R.string.ForwardedFrom);
    }

    public int getExtraInsetHeight() {
        int iDp = this.addedCaptionHeight;
        if (this.hasFactCheck) {
            iDp += AndroidUtilities.dp((this.reactionsLayoutInBubble.isEmpty ? 18 : 0) + 2) + this.factCheckHeight;
        }
        if (this.drawCommentButton) {
            iDp += AndroidUtilities.dp(shouldDrawTimeOnMedia() ? 41.3f : 43.0f);
        }
        return (this.reactionsLayoutInBubble.isEmpty || !this.currentMessageObject.shouldDrawReactionsInLayout()) ? iDp : iDp + this.reactionsLayoutInBubble.totalHeight;
    }

    @Override
    public ImageReceiver getAvatarImage() {
        if (this.isAvatarVisible) {
            return this.avatarImage;
        }
        return null;
    }

    @Override
    public float getCheckBoxTranslation() {
        return this.checkBoxTranslation;
    }

    @Override
    public boolean shouldDrawAlphaLayer() {
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        return (groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) && getAlpha() != 1.0f;
    }

    public float getCaptionX() {
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateBackgroundBoundsInner) {
            if (transitionParams.transformGroupToSingleMessage) {
                this.captionX += transitionParams.deltaLeft;
            } else if (transitionParams.moveCaption) {
                float f = this.captionX;
                TransitionParams transitionParams2 = this.transitionParams;
                float f2 = transitionParams2.animateChangeProgress;
                this.captionX = (f * f2) + (transitionParams2.captionFromX * (1.0f - f2));
            } else if (!this.currentMessageObject.isVoice() || !TextUtils.isEmpty(this.currentMessageObject.caption)) {
                this.captionX += this.transitionParams.deltaLeft;
            }
        }
        return this.captionX;
    }

    public float getCaptionY() {
        float f = this.captionY;
        TransitionParams transitionParams = this.transitionParams;
        if (!transitionParams.animateBackgroundBoundsInner) {
            return f;
        }
        if (transitionParams.transformGroupToSingleMessage) {
            return f - getTranslationY();
        }
        if (!transitionParams.moveCaption) {
            return f;
        }
        float f2 = this.captionY;
        TransitionParams transitionParams2 = this.transitionParams;
        float f3 = transitionParams2.animateChangeProgress;
        return (f2 * f3) + (transitionParams2.captionFromY * (1.0f - f3));
    }

    public boolean isDrawPinnedBottom() {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        return this.mediaBackground || this.drawPinnedBottom || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && this.currentMessagesGroup.isDocuments);
    }

    public void drawCheckBox(Canvas canvas) {
        MessageObject messageObject;
        float top;
        MessageObject messageObject2 = this.currentMessageObject;
        if ((messageObject2 != null && messageObject2.isSponsored()) || (messageObject = this.currentMessageObject) == null || messageObject.isSending()) {
            return;
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3.type == 27 || messageObject3.isSendError() || this.checkBox == null) {
            return;
        }
        if (this.checkBoxVisible || this.checkBoxAnimationInProgress) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
            if (groupedMessagePosition != null) {
                int i = groupedMessagePosition.flags;
                if ((i & 8) == 0 || (i & 1) == 0) {
                    return;
                }
            }
            canvas.save();
            float y = getY() + getPaddingTop();
            MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
            if (groupedMessages != null && groupedMessages.messages.size() > 1) {
                top = (getTop() + this.currentMessagesGroup.transitionParams.offsetTop) - getTranslationY();
            } else {
                top = y + this.transitionParams.deltaTop;
            }
            canvas.translate(this.sideMenuWidth, top + this.transitionYOffsetForDrawables);
            this.checkBox.draw(canvas);
            canvas.restore();
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setBackgroundTopY(boolean):void");
    }

    public void setBackgroundTopY(int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setBackgroundTopY(int):void");
    }

    public void setDrawableBoundsInner(Drawable drawable, int i, int i2, int i3, int i4) {
        if (drawable != null) {
            MultiLayoutTypingAnimator multiLayoutTypingAnimator = this.botDraftTypingAnimator;
            if (multiLayoutTypingAnimator != null && multiLayoutTypingAnimator.isRunning()) {
                this.transitionYOffsetForDrawables = 0.0f;
            } else {
                this.transitionYOffsetForDrawables = ((i2 + i4) + this.transitionParams.deltaBottom) - ((int) r0);
            }
            TransitionParams transitionParams = this.transitionParams;
            drawable.setBounds((int) (i + transitionParams.deltaLeft), (int) (i2 + transitionParams.deltaTop), (int) (i + i3 + transitionParams.deltaRight), (int) (i2 + i4 + transitionParams.deltaBottom));
        }
    }

    public void setupTextColors() {
        int i;
        if (this.currentMessageObject.isOutOwner()) {
            TextPaint textPaint = Theme.chat_msgTextPaint;
            int i2 = Theme.key_chat_messageTextOut;
            textPaint.setColor(getThemedColor(i2));
            Theme.chat_msgGameTextPaint.setColor(getThemedColor(i2));
            Theme.chat_msgTextCodePaint.setColor(getThemedColor(i2));
            Theme.chat_msgTextCode2Paint.setColor(getThemedColor(i2));
            Theme.chat_msgTextCode3Paint.setColor(getThemedColor(i2));
            TextPaint textPaint2 = Theme.chat_msgGameTextPaint;
            TextPaint textPaint3 = Theme.chat_replyTextPaint;
            TextPaint textPaint4 = Theme.chat_quoteTextPaint;
            TextPaint textPaint5 = Theme.chat_msgTextPaint;
            TextPaint textPaint6 = Theme.chat_msgTextCodePaint;
            TextPaint textPaint7 = Theme.chat_msgTextCode2Paint;
            TextPaint textPaint8 = Theme.chat_msgTextCode3Paint;
            int themedColor = getThemedColor(Theme.key_chat_messageLinkOut);
            textPaint8.linkColor = themedColor;
            textPaint7.linkColor = themedColor;
            textPaint6.linkColor = themedColor;
            textPaint5.linkColor = themedColor;
            textPaint4.linkColor = themedColor;
            textPaint3.linkColor = themedColor;
            textPaint2.linkColor = themedColor;
        } else {
            TextPaint textPaint9 = Theme.chat_msgTextPaint;
            int i3 = Theme.key_chat_messageTextIn;
            textPaint9.setColor(getThemedColor(i3));
            Theme.chat_msgGameTextPaint.setColor(getThemedColor(i3));
            Theme.chat_msgTextCodePaint.setColor(getThemedColor(i3));
            Theme.chat_msgTextCode2Paint.setColor(getThemedColor(i3));
            Theme.chat_msgTextCode3Paint.setColor(getThemedColor(i3));
            TextPaint textPaint10 = Theme.chat_msgGameTextPaint;
            TextPaint textPaint11 = Theme.chat_replyTextPaint;
            TextPaint textPaint12 = Theme.chat_quoteTextPaint;
            TextPaint textPaint13 = Theme.chat_msgTextPaint;
            TextPaint textPaint14 = Theme.chat_msgTextCodePaint;
            TextPaint textPaint15 = Theme.chat_msgTextCode2Paint;
            TextPaint textPaint16 = Theme.chat_msgTextCode3Paint;
            int themedColor2 = getThemedColor(Theme.key_chat_messageLinkIn);
            textPaint16.linkColor = themedColor2;
            textPaint15.linkColor = themedColor2;
            textPaint14.linkColor = themedColor2;
            textPaint13.linkColor = themedColor2;
            textPaint12.linkColor = themedColor2;
            textPaint11.linkColor = themedColor2;
            textPaint10.linkColor = themedColor2;
        }
        if (this.documentAttach != null) {
            int i4 = this.documentAttachType;
            if (i4 == 3 || i4 == 7) {
                if (this.currentMessageObject.isOutOwner()) {
                    this.seekBarWaveform.setColors(getThemedColor(Theme.key_chat_outVoiceSeekbar), getThemedColor(Theme.key_chat_outVoiceSeekbarFill), getThemedColor(Theme.key_chat_outVoiceSeekbarSelected));
                    SeekBar seekBar = this.seekBar;
                    int themedColor3 = getThemedColor(Theme.key_chat_outAudioSeekbar);
                    int themedColor4 = getThemedColor(Theme.key_chat_outAudioCacheSeekbar);
                    int i5 = Theme.key_chat_outAudioSeekbarFill;
                    seekBar.setColors(themedColor3, themedColor4, getThemedColor(i5), getThemedColor(i5), getThemedColor(Theme.key_chat_outAudioSeekbarSelected));
                } else if (this.hasLinkPreview && this.linkLine != null) {
                    this.seekBarWaveform.setColors(Theme.adaptHue(getThemedColor(Theme.key_chat_inVoiceSeekbar), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(Theme.key_chat_inVoiceSeekbarFill), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(Theme.key_chat_inVoiceSeekbarSelected), this.linkLine.getColor()));
                    SeekBar seekBar2 = this.seekBar;
                    int iAdaptHue = Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioSeekbar), this.linkLine.getColor());
                    int iAdaptHue2 = Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioCacheSeekbar), this.linkLine.getColor());
                    int i6 = Theme.key_chat_inAudioSeekbarFill;
                    seekBar2.setColors(iAdaptHue, iAdaptHue2, Theme.adaptHue(getThemedColor(i6), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(i6), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioSeekbarSelected), this.linkLine.getColor()));
                } else {
                    this.seekBarWaveform.setColors(getThemedColor(Theme.key_chat_inVoiceSeekbar), getThemedColor(Theme.key_chat_inVoiceSeekbarFill), getThemedColor(Theme.key_chat_inVoiceSeekbarSelected));
                    SeekBar seekBar3 = this.seekBar;
                    int themedColor5 = getThemedColor(Theme.key_chat_inAudioSeekbar);
                    int themedColor6 = getThemedColor(Theme.key_chat_inAudioCacheSeekbar);
                    int i7 = Theme.key_chat_inAudioSeekbarFill;
                    seekBar3.setColors(themedColor5, themedColor6, getThemedColor(i7), getThemedColor(i7), getThemedColor(Theme.key_chat_inAudioSeekbarSelected));
                }
            } else if (i4 == 5) {
                if (this.currentMessageObject.isOutOwner()) {
                    SeekBar seekBar4 = this.seekBar;
                    int themedColor7 = getThemedColor(Theme.key_chat_outAudioSeekbar);
                    int themedColor8 = getThemedColor(Theme.key_chat_outAudioCacheSeekbar);
                    int i8 = Theme.key_chat_outAudioSeekbarFill;
                    seekBar4.setColors(themedColor7, themedColor8, getThemedColor(i8), getThemedColor(i8), getThemedColor(Theme.key_chat_outAudioSeekbarSelected));
                } else if (this.hasLinkPreview && this.linkLine != null) {
                    SeekBar seekBar5 = this.seekBar;
                    int iAdaptHue3 = Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioSeekbar), this.linkLine.getColor());
                    int iAdaptHue4 = Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioCacheSeekbar), this.linkLine.getColor());
                    int i9 = Theme.key_chat_inAudioSeekbarFill;
                    seekBar5.setColors(iAdaptHue3, iAdaptHue4, Theme.adaptHue(getThemedColor(i9), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(i9), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioSeekbarSelected), this.linkLine.getColor()));
                } else {
                    SeekBar seekBar6 = this.seekBar;
                    int themedColor9 = getThemedColor(Theme.key_chat_inAudioSeekbar);
                    int themedColor10 = getThemedColor(Theme.key_chat_inAudioCacheSeekbar);
                    int i10 = Theme.key_chat_inAudioSeekbarFill;
                    seekBar6.setColors(themedColor9, themedColor10, getThemedColor(i10), getThemedColor(i10), getThemedColor(Theme.key_chat_inAudioSeekbarSelected));
                }
            }
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject.type == 5) {
            TextPaint textPaint17 = Theme.chat_timePaint;
            int themedColor11 = getThemedColor(Theme.key_chat_serviceText);
            if (isDrawSelectionBackground()) {
                i = this.currentMessageObject.isOutOwner() ? Theme.key_chat_outTimeSelectedText : Theme.key_chat_inTimeSelectedText;
            } else {
                i = this.currentMessageObject.isOutOwner() ? Theme.key_chat_outTimeText : Theme.key_chat_inTimeText;
            }
            textPaint17.setColor(ColorUtils.blendARGB(themedColor11, getThemedColor(i), getVideoTranscriptionProgress()));
            return;
        }
        if (this.mediaBackground) {
            if (messageObject.shouldDrawWithoutBackground()) {
                Theme.chat_timePaint.setColor(getThemedColor(Theme.key_chat_serviceText));
                return;
            } else {
                Theme.chat_timePaint.setColor(getThemedColor(Theme.key_chat_mediaTimeText));
                return;
            }
        }
        if (messageObject.isOutOwner()) {
            Theme.chat_timePaint.setColor(getThemedColor(isDrawSelectionBackground() ? Theme.key_chat_outTimeSelectedText : Theme.key_chat_outTimeText));
        } else {
            Theme.chat_timePaint.setColor(getThemedColor(isDrawSelectionBackground() ? Theme.key_chat_inTimeSelectedText : Theme.key_chat_inTimeText));
        }
    }

    @Override
    public int getBoundsLeft() {
        int iDp;
        int iDp2;
        float f;
        MessageObject messageObject = this.currentMessageObject;
        boolean z = messageObject != null && messageObject.isOutOwner();
        if (needDrawAvatar()) {
            if (this.currentPosition != null) {
                f = 73.0f;
            } else {
                MessageObject messageObject2 = this.currentMessageObject;
                f = (messageObject2 == null || !messageObject2.isRepostPreview) ? 63 : 42;
            }
            iDp = AndroidUtilities.dp(f);
        } else {
            iDp = 0;
        }
        int backgroundDrawableLeft = (getBackgroundDrawableLeft() - iDp) - ((z && (checkNeedDrawShareButton(this.currentMessageObject) || this.useTranscribeButton)) ? AndroidUtilities.dp(48.0f) : 0);
        if (this.botButtons != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject3 = this.currentMessageObject;
            if (messageObject3 != null && messageObject3.isOutOwner()) {
                iDp2 = (getMeasuredWidth() - widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                iDp2 = this.backgroundDrawableLeft + AndroidUtilities.dp((this.mediaBackground || this.drawPinnedBottom) ? 1.0f : 7.0f);
            }
            int iMax = Integer.MAX_VALUE;
            for (int i = 0; i < this.botButtons.size(); i++) {
                iMax = Math.max(iMax, ((int) (((BotButton) this.botButtons.get(i)).x * widthForButtons)) + iDp2);
            }
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, iMax);
        }
        if (this.starsPriceText != null) {
            backgroundDrawableLeft = Math.min(backgroundDrawableLeft, ((int) ((getParentWidth() - this.starsPriceText.getWidth()) - AndroidUtilities.dp(18.0f))) / 2);
        }
        if (this.topicSeparator != null) {
            backgroundDrawableLeft = Math.min(this.sideMenuWidth, backgroundDrawableLeft);
        }
        return Math.max(0, backgroundDrawableLeft);
    }

    @Override
    public int getBoundsRight() {
        int iDp;
        MessageObject messageObject = this.currentMessageObject;
        int backgroundDrawableRight = getBackgroundDrawableRight() + ((messageObject == null || messageObject.isOutOwner() || !(checkNeedDrawShareButton(this.currentMessageObject) || this.useTranscribeButton)) ? 0 : AndroidUtilities.dp(48.0f));
        if (this.botButtons != null) {
            int widthForButtons = getWidthForButtons();
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                iDp = (getMeasuredWidth() - getWidthForButtons()) - AndroidUtilities.dp(10.0f);
            } else {
                iDp = this.backgroundDrawableLeft + AndroidUtilities.dp((this.mediaBackground || this.drawPinnedBottom) ? 1.0f : 7.0f);
            }
            int iMax = 0;
            for (int i = 0; i < this.botButtons.size(); i++) {
                BotButton botButton = (BotButton) this.botButtons.get(i);
                float f = widthForButtons;
                iMax = Math.max(iMax, ((int) (botButton.x * f)) + iDp + ((int) (botButton.width * f)));
            }
            backgroundDrawableRight = Math.max(backgroundDrawableRight, iMax);
        }
        if (this.starsPriceText != null) {
            backgroundDrawableRight = Math.max(backgroundDrawableRight, ((int) ((getParentWidth() + this.starsPriceText.getWidth()) + AndroidUtilities.dp(18.0f))) / 2);
        }
        return this.topicSeparator != null ? Math.max(backgroundDrawableRight, getWidth()) : backgroundDrawableRight;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        drawInternal(canvas);
    }

    public void drawInternal(android.graphics.Canvas r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawInternal(android.graphics.Canvas):void");
    }

    public void drawBackgroundInternal(Canvas canvas, boolean z) {
        drawBackgroundInternal(canvas, z, false);
    }

    private boolean drawBackgroundInternal(android.graphics.Canvas r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawBackgroundInternal(android.graphics.Canvas, boolean, boolean):boolean");
    }

    private void animateCheckboxTranslation() {
        boolean z = this.checkBoxVisible;
        if (z || this.checkBoxAnimationInProgress) {
            if ((z && this.checkBoxAnimationProgress == 1.0f) || (!z && this.checkBoxAnimationProgress == 0.0f)) {
                this.checkBoxAnimationInProgress = false;
            }
            this.checkBoxTranslation = (int) Math.ceil((z ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(this.checkBoxAnimationProgress) * AndroidUtilities.dp(35.0f));
            if (this.currentMessageObject.type == 36 && getCurrentBackgroundRight() + AndroidUtilities.dp(35.0f) > getWidth()) {
                this.checkBoxTranslation = 0;
            }
            if (!this.currentMessageObject.isOutOwner() || this.currentMessageObject.hasWideCode) {
                updateTranslation();
            }
            if (this.checkBoxAnimationInProgress) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.lastCheckBoxAnimationTime;
                this.lastCheckBoxAnimationTime = jElapsedRealtime;
                if (this.checkBoxVisible) {
                    float f = this.checkBoxAnimationProgress + (j / 200.0f);
                    this.checkBoxAnimationProgress = f;
                    if (f > 1.0f) {
                        this.checkBoxAnimationProgress = 1.0f;
                    }
                } else {
                    float f2 = this.checkBoxAnimationProgress - (j / 200.0f);
                    this.checkBoxAnimationProgress = f2;
                    if (f2 <= 0.0f) {
                        this.checkBoxAnimationProgress = 0.0f;
                    }
                }
                invalidate();
                ((View) getParent()).invalidate();
            }
        }
    }

    public boolean drawBackgroundInParent() {
        MessageObject messageObject;
        return this.canDrawBackgroundInParent && (messageObject = this.currentMessageObject) != null && messageObject.isOutOwner() && getThemedColor(Theme.key_chat_outBubbleGradient1) != 0;
    }

    public void drawServiceBackground(Canvas canvas, RectF rectF, float f, float f2) {
        applyServiceShaderMatrix();
        if (f2 != 1.0f) {
            int alpha = getThemedPaint("paintChatActionBackground").getAlpha();
            getThemedPaint("paintChatActionBackground").setAlpha((int) (alpha * f2));
            canvas.drawRoundRect(rectF, f, f, getThemedPaint("paintChatActionBackground"));
            getThemedPaint("paintChatActionBackground").setAlpha(alpha);
        } else {
            canvas.drawRoundRect(rectF, f, f, getThemedPaint(this.sideButtonPressed ? "paintChatActionBackgroundSelected" : "paintChatActionBackground"));
        }
        if (hasGradientService()) {
            if (f2 != 1.0f) {
                int alpha2 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
                Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (f2 * alpha2));
                canvas.drawRoundRect(rectF, f, f, Theme.chat_actionBackgroundGradientDarkenPaint);
                Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha2);
                return;
            }
            canvas.drawRoundRect(rectF, f, f, Theme.chat_actionBackgroundGradientDarkenPaint);
        }
    }

    public void drawCommentButton(Canvas canvas, float f) {
        if (this.drawSideButton != 3) {
            return;
        }
        int iDp = AndroidUtilities.dp(32.0f);
        if (this.commentLayout != null) {
            this.sideStartY -= AndroidUtilities.dp(18.0f);
            iDp += AndroidUtilities.dp(18.0f);
        }
        RectF rectF = this.rect;
        float f2 = this.sideStartX;
        rectF.set(f2, this.sideStartY, AndroidUtilities.dp(32.0f) + f2, this.sideStartY + iDp);
        applyServiceShaderMatrix();
        if (f != 1.0f) {
            int alpha = getThemedPaint("paintChatActionBackground").getAlpha();
            getThemedPaint("paintChatActionBackground").setAlpha((int) (alpha * f));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
            getThemedPaint("paintChatActionBackground").setAlpha(alpha);
        } else {
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), getThemedPaint(this.sideButtonPressed ? "paintChatActionBackgroundSelected" : "paintChatActionBackground"));
        }
        if (hasGradientService()) {
            if (f != 1.0f) {
                int alpha2 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
                Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha2 * f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
                Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha2);
            } else {
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
            }
        }
        Drawable themeDrawable = Theme.getThemeDrawable("drawableCommentSticker");
        BaseCell.setDrawableBounds(themeDrawable, this.sideStartX + AndroidUtilities.dp(4.0f), this.sideStartY + AndroidUtilities.dp(4.0f));
        if (f != 1.0f) {
            themeDrawable.setAlpha((int) (f * 255.0f));
            themeDrawable.draw(canvas);
            themeDrawable.setAlpha(255);
        } else {
            themeDrawable.draw(canvas);
        }
        if (this.commentLayout != null) {
            Theme.chat_stickerCommentCountPaint.setColor(getThemedColor(Theme.key_chat_stickerReplyNameText));
            Theme.chat_stickerCommentCountPaint.setAlpha((int) (f * 255.0f));
            if (this.transitionParams.animateComments) {
                if (this.transitionParams.animateCommentsLayout != null) {
                    canvas.save();
                    Theme.chat_stickerCommentCountPaint.setAlpha((int) ((1.0d - this.transitionParams.animateChangeProgress) * 255.0d * f));
                    canvas.translate(this.sideStartX + ((AndroidUtilities.dp(32.0f) - this.transitionParams.animateTotalCommentWidth) / 2), this.sideStartY + AndroidUtilities.dp(30.0f));
                    this.transitionParams.animateCommentsLayout.draw(canvas);
                    canvas.restore();
                }
                Theme.chat_stickerCommentCountPaint.setAlpha((int) (this.transitionParams.animateChangeProgress * 255.0f));
            }
            canvas.save();
            canvas.translate(this.sideStartX + ((AndroidUtilities.dp(32.0f) - this.totalCommentWidth) / 2), this.sideStartY + AndroidUtilities.dp(30.0f));
            this.commentLayout.draw(canvas);
            canvas.restore();
        }
    }

    public void applyServiceShaderMatrix() {
        applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, getX(), this.viewTop);
    }

    public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(i, i2, f, f2 + this.starsPriceTopPadding + this.topicSeparatorTopPadding + this.suggestionOfferTopPadding);
        } else {
            Theme.applyServiceShaderMatrix(i, i2, f, f2 + this.starsPriceTopPadding + this.topicSeparatorTopPadding + this.suggestionOfferTopPadding);
        }
    }

    public boolean hasOutboundsContent() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.hasOutboundsContent():boolean");
    }

    public void setShowTopic(boolean z) {
        if (this.showTopicSeparator != z) {
            this.showTopicSeparator = z;
            invalidateOutbounds();
            invalidate();
        }
    }

    public int getTopicSeparatorTopPadding() {
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateMonoforumPadding) {
            return AndroidUtilities.lerp(transitionParams.animateMonoforumPaddingFrom, this.topicSeparatorTopPadding, transitionParams.animateChangeProgress);
        }
        return this.topicSeparatorTopPadding;
    }

    public int getStarsPriceTopPadding() {
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateStarsPriceTopPadding) {
            return AndroidUtilities.lerp(transitionParams.animateStarsPriceTopPaddingFrom, this.starsPriceTopPadding, transitionParams.animateChangeProgress);
        }
        return this.starsPriceTopPadding;
    }

    public int getBottomActionPadding() {
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateBottomActionPadding) {
            return AndroidUtilities.lerp(transitionParams.animateBottomActionPaddingFrom, this.bottomActionPadding, transitionParams.animateChangeProgress);
        }
        return this.bottomActionPadding;
    }

    public void drawOutboundsContent(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawOutboundsContent(android.graphics.Canvas):void");
    }

    public void drawAnimatedEmojis(Canvas canvas, float f) {
        drawAnimatedEmojiMessageText(canvas, f);
        if (shouldDrawCaptionLayout()) {
            drawAnimatedEmojiCaption(canvas, f);
        }
    }

    private void drawAnimatedEmojiMessageText(Canvas canvas, float f) {
        float f2;
        MultiLayoutTypingAnimator multiLayoutTypingAnimator;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.isSponsored()) {
            return;
        }
        float f3 = this.textY;
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateTextY) {
            float f4 = transitionParams.animateFromTextY;
            float f5 = transitionParams.animateChangeProgress;
            f2 = (f4 * (1.0f - f5)) + (f3 * f5);
        } else {
            f2 = f3;
        }
        if (transitionParams.animateChangeProgress != 1.0f && transitionParams.animateMessageText && ((multiLayoutTypingAnimator = this.botDraftTypingAnimator) == null || !multiLayoutTypingAnimator.isRunning())) {
            canvas.save();
            MessageDrawable messageDrawable = this.currentBackgroundDrawable;
            if (messageDrawable != null) {
                Rect bounds = messageDrawable.getBounds();
                if (this.currentMessageObject.isOutOwner() && !this.mediaBackground && !this.pinnedBottom) {
                    canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                } else {
                    canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                }
            }
            drawAnimatedEmojiMessageText(this.textX, f2, canvas, this.transitionParams.animateOutTextBlocks, this.transitionParams.animateOutAnimateEmoji, false, f * (1.0f - this.transitionParams.animateChangeProgress), this.currentMessageObject.textXOffset, false);
            float f6 = this.textX;
            MessageObject messageObject2 = this.currentMessageObject;
            drawAnimatedEmojiMessageText(f6, f2, canvas, messageObject2.textLayoutBlocks, this.animatedEmojiStack, true, f * this.transitionParams.animateChangeProgress, messageObject2.textXOffset, false);
            canvas.restore();
            return;
        }
        float f7 = this.textX;
        MessageObject messageObject3 = this.currentMessageObject;
        drawAnimatedEmojiMessageText(f7, f2, canvas, messageObject3.textLayoutBlocks, this.animatedEmojiStack, true, f, messageObject3.textXOffset, false);
    }

    private void drawAnimatedEmojiMessageText(float r26, float r27, android.graphics.Canvas r28, java.util.ArrayList r29, org.telegram.ui.Components.AnimatedEmojiSpan.EmojiGroupedSpans r30, boolean r31, float r32, float r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawAnimatedEmojiMessageText(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.AnimatedEmojiSpan$EmojiGroupedSpans, boolean, float, float, boolean):void");
    }

    public void drawAnimatedEmojiCaption(Canvas canvas, float f) {
        float f2;
        float f3;
        float f4;
        if (this.captionLayout == null) {
            return;
        }
        float translationY = this.captionY;
        float f5 = this.captionX;
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateBackgroundBoundsInner) {
            if (transitionParams.transformGroupToSingleMessage) {
                translationY -= getTranslationY();
                f4 = this.transitionParams.deltaLeft;
            } else if (transitionParams.moveCaption) {
                float f6 = this.captionX;
                TransitionParams transitionParams2 = this.transitionParams;
                float f7 = transitionParams2.animateChangeProgress;
                float f8 = 1.0f - f7;
                f3 = (f6 * f7) + (transitionParams2.captionFromX * f8);
                f2 = (this.captionY * f7) + (transitionParams2.captionFromY * f8);
            } else {
                if (!this.currentMessageObject.isVoice() || !TextUtils.isEmpty(this.currentMessageObject.caption)) {
                    f4 = this.transitionParams.deltaLeft;
                }
                f2 = translationY;
                f3 = f5;
            }
            f5 += f4;
            f2 = translationY;
            f3 = f5;
        } else {
            f2 = translationY;
            f3 = f5;
        }
        TransitionParams transitionParams3 = this.transitionParams;
        if (!transitionParams3.animateReplaceCaptionLayout || transitionParams3.animateChangeProgress == 1.0f) {
            MessageObject.TextLayoutBlocks textLayoutBlocks = this.captionLayout;
            drawAnimatedEmojiMessageText(f3, f2, canvas, textLayoutBlocks != null ? textLayoutBlocks.textLayoutBlocks : null, this.animatedEmojiStack, true, f, textLayoutBlocks != null ? textLayoutBlocks.textXOffset : 0.0f, true);
            return;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = transitionParams3.animateOutCaptionLayout != null ? this.transitionParams.animateOutCaptionLayout.textLayoutBlocks : null;
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.transitionParams.animateOutAnimateEmoji;
        TransitionParams transitionParams4 = this.transitionParams;
        drawAnimatedEmojiMessageText(f3, f2, canvas, arrayList, emojiGroupedSpans, false, f * (1.0f - transitionParams4.animateChangeProgress), transitionParams4.animateOutCaptionLayout != null ? this.transitionParams.animateOutCaptionLayout.textXOffset : 0.0f, true);
        MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.captionLayout;
        drawAnimatedEmojiMessageText(f3, f2, canvas, textLayoutBlocks2 != null ? textLayoutBlocks2.textLayoutBlocks : null, this.animatedEmojiStack, true, f * this.transitionParams.animateChangeProgress, textLayoutBlocks2 != null ? textLayoutBlocks2.textXOffset : 0.0f, true);
    }

    public void setHideSideButtonByQuickShare(boolean z) {
        if (this.hideSideButtonByQuickShare != z) {
            this.hideSideButtonByQuickShare = z;
            boolean z2 = this.invalidatesParent;
            this.invalidatesParent = true;
            invalidate();
            this.invalidatesParent = z2;
        }
    }

    public void drawSideButton(Canvas canvas) {
        drawSideButton(canvas, false);
    }

    public void drawSideButton(Canvas canvas, boolean z) {
        int iSaveLayerAlpha;
        MessageObject.GroupedMessages groupedMessages;
        if ((!this.hideSideButtonByQuickShare || z) && this.drawSideButton != 0) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
            if (groupedMessagePosition == null || (groupedMessages = this.currentMessagesGroup) == null || !groupedMessages.isDocuments || groupedMessagePosition.last) {
                if (this.currentMessageObject.isOutOwner()) {
                    float fDp = this.transitionParams.lastBackgroundLeft - AndroidUtilities.dp(40.0f);
                    this.sideStartX = fDp;
                    MessageObject.GroupedMessages groupedMessages2 = this.currentMessagesGroup;
                    if (groupedMessages2 != null) {
                        this.sideStartX = fDp + (groupedMessages2.transitionParams.offsetLeft - this.animationOffsetX);
                    }
                } else {
                    float fDp2 = this.transitionParams.lastBackgroundRight + AndroidUtilities.dp(8.0f);
                    this.sideStartX = fDp2;
                    MessageObject.GroupedMessages groupedMessages3 = this.currentMessagesGroup;
                    if (groupedMessages3 != null) {
                        this.sideStartX = fDp2 + (groupedMessages3.transitionParams.offsetRight - this.animationOffsetX);
                    }
                }
                if (this.drawSideButton == 4) {
                    this.sideStartY = AndroidUtilities.dp(6.0f);
                } else {
                    float fDp3 = (this.layoutHeight + this.transitionParams.deltaBottom) - AndroidUtilities.dp(41.0f);
                    this.sideStartY = fDp3;
                    MessageObject messageObject = this.currentMessageObject;
                    if (messageObject.type == 19 && messageObject.textWidth < this.timeTextWidth) {
                        this.sideStartY = fDp3 - AndroidUtilities.dp(22.0f);
                    }
                    MessageObject.GroupedMessages groupedMessages4 = this.currentMessagesGroup;
                    if (groupedMessages4 != null) {
                        float f = this.sideStartY;
                        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages4.transitionParams;
                        float f2 = f + transitionParams.offsetBottom;
                        this.sideStartY = f2;
                        if (transitionParams.backgroundChangeBounds) {
                            this.sideStartY = f2 - getTranslationY();
                        }
                    }
                    if (this.currentMessageObject.shouldDrawReactions()) {
                        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                        if (!reactionsLayoutInBubble.isSmall) {
                            if (this.isRoundVideo) {
                                this.sideStartY -= reactionsLayoutInBubble.getCurrentTotalHeight(this.transitionParams.animateChangeProgress) * (1.0f - getVideoTranscriptionProgress());
                            } else if (reactionsLayoutInBubble.drawServiceShaderBackground > 0.0f) {
                                this.sideStartY -= reactionsLayoutInBubble.getCurrentTotalHeight(this.transitionParams.animateChangeProgress);
                            }
                        }
                    }
                }
                if (this.drawSideButton != 4) {
                    float fDp4 = ((this.layoutHeight + this.transitionParams.deltaBottom) - AndroidUtilities.dp(32.0f)) / 2.0f;
                    if (this.sideStartY < fDp4) {
                        this.sideStartY = fDp4;
                    }
                }
                if (this.currentMessageObject.type == 19) {
                    if (this.drawSideButton == 3 && this.commentLayout != null) {
                        this.sideStartY = AndroidUtilities.dp(18.0f);
                    } else {
                        this.sideStartY = 0.0f;
                    }
                }
                if (!this.currentMessageObject.isOutOwner() && this.isRoundVideo && !this.hasLinkPreview) {
                    float fRoundPlayingMessageSize = this.isAvatarVisible ? (AndroidUtilities.roundPlayingMessageSize(this.isSideMenued) - AndroidUtilities.roundMessageSize) * 0.7f : AndroidUtilities.dp(50.0f);
                    float videoTranscriptionProgress = this.isPlayingRound ? (1.0f - getVideoTranscriptionProgress()) * fRoundPlayingMessageSize : 0.0f;
                    float fDp5 = this.isPlayingRound ? AndroidUtilities.dp(28.0f) * (1.0f - getVideoTranscriptionProgress()) : 0.0f;
                    TransitionParams transitionParams2 = this.transitionParams;
                    if (transitionParams2.animatePlayingRound) {
                        videoTranscriptionProgress = (this.isPlayingRound ? transitionParams2.animateChangeProgress : 1.0f - transitionParams2.animateChangeProgress) * (1.0f - getVideoTranscriptionProgress()) * fRoundPlayingMessageSize;
                        fDp5 = AndroidUtilities.dp(28.0f) * (this.isPlayingRound ? this.transitionParams.animateChangeProgress : 1.0f - this.transitionParams.animateChangeProgress) * (1.0f - getVideoTranscriptionProgress());
                    }
                    this.sideStartX -= videoTranscriptionProgress;
                    this.sideStartY -= fDp5;
                }
                this.sideButtonVisible = true;
                if (this.drawSideButton == 3) {
                    if (!this.enterTransitionInProgress || this.currentMessageObject.isVoice()) {
                        drawCommentButton(canvas, 1.0f);
                        return;
                    }
                    return;
                }
                if (SizeNotifierFrameLayout.drawingBlur) {
                    return;
                }
                RectF rectF = this.rect;
                float f3 = this.sideStartX;
                rectF.set(f3, this.sideStartY, AndroidUtilities.dp(32.0f) + f3, this.sideStartY + AndroidUtilities.dp(this.drawSideButton2 == 5 ? 64.0f : 32.0f));
                if (this.rect.right >= getMeasuredWidth()) {
                    this.sideButtonVisible = false;
                    return;
                }
                int floatValue = (int) ((1.0f - this.isSponsoredMessageHidden.getFloatValue()) * 255.0f);
                if (floatValue != 255) {
                    float f4 = this.sideStartX;
                    iSaveLayerAlpha = canvas.saveLayerAlpha(f4, this.sideStartY, f4 + AndroidUtilities.dp(32.0f), AndroidUtilities.dp(64.0f) + this.sideStartY, floatValue);
                } else {
                    iSaveLayerAlpha = -1;
                }
                applyServiceShaderMatrix();
                if (this.drawSideButton == 4 && this.drawSideButton2 == 5 && this.sideButtonPressed) {
                    Path path = this.sideButtonPath1;
                    if (path == null) {
                        this.sideButtonPath1 = new Path();
                    } else {
                        path.rewind();
                    }
                    Path path2 = this.sideButtonPath2;
                    if (path2 == null) {
                        this.sideButtonPath2 = new Path();
                    } else {
                        path2.rewind();
                    }
                    if (this.sideButtonPathCorners1 == null) {
                        this.sideButtonPathCorners1 = new float[]{fDp, fDp, fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f};
                        float fDp6 = AndroidUtilities.dp(16.0f);
                    }
                    if (this.sideButtonPathCorners2 == null) {
                        this.sideButtonPathCorners2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, fDp, fDp, fDp, fDp};
                        float fDp7 = AndroidUtilities.dp(16.0f);
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f5 = this.sideStartX;
                    rectF2.set(f5, this.sideStartY, AndroidUtilities.dp(32.0f) + f5, this.sideStartY + AndroidUtilities.dp(32.0f));
                    Path path3 = this.sideButtonPath1;
                    float[] fArr = this.sideButtonPathCorners1;
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF2, fArr, direction);
                    rectF2.set(this.sideStartX, this.sideStartY + AndroidUtilities.dp(32.0f), this.sideStartX + AndroidUtilities.dp(32.0f), this.sideStartY + AndroidUtilities.dp(64.0f));
                    this.sideButtonPath2.addRoundRect(rectF2, this.sideButtonPathCorners2, direction);
                    if (this.pressedSideButton == 4) {
                        canvas.drawPath(this.sideButtonPath1, getThemedPaint("paintChatActionBackgroundSelected"));
                        canvas.drawPath(this.sideButtonPath2, getThemedPaint("paintChatActionBackground"));
                    } else {
                        canvas.drawPath(this.sideButtonPath1, getThemedPaint("paintChatActionBackground"));
                        canvas.drawPath(this.sideButtonPath2, getThemedPaint("paintChatActionBackgroundSelected"));
                    }
                } else {
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), getThemedPaint(this.sideButtonPressed ? "paintChatActionBackgroundSelected" : "paintChatActionBackground"));
                }
                if (hasGradientService()) {
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
                }
                int i = this.drawSideButton;
                if (i == 2) {
                    Drawable themedDrawable = getThemedDrawable("drawableGoIcon");
                    BaseCell.setDrawableBounds(themedDrawable, (this.sideStartX + AndroidUtilities.dp(16.0f)) - (themedDrawable.getIntrinsicWidth() / 2.0f), (this.sideStartY + AndroidUtilities.dp(16.0f)) - (themedDrawable.getIntrinsicHeight() / 2.0f));
                    themedDrawable.draw(canvas);
                } else if (i == 4) {
                    int iDp = (int) (this.sideStartX + AndroidUtilities.dp(16.0f));
                    int iDp2 = (int) (this.sideStartY + AndroidUtilities.dp(16.0f));
                    Drawable themedDrawable2 = getThemedDrawable("drawableCloseIcon");
                    int intrinsicWidth = themedDrawable2.getIntrinsicWidth() / 2;
                    int intrinsicHeight = themedDrawable2.getIntrinsicHeight() / 2;
                    themedDrawable2.setBounds(iDp - intrinsicWidth, iDp2 - intrinsicHeight, intrinsicWidth + iDp, intrinsicHeight + iDp2);
                    BaseCell.setDrawableBounds(themedDrawable2, this.sideStartX + AndroidUtilities.dp(4.0f), this.sideStartY + AndroidUtilities.dp(4.0f));
                    canvas.save();
                    canvas.scale(0.65f, 0.65f, themedDrawable2.getBounds().centerX(), themedDrawable2.getBounds().centerY());
                    themedDrawable2.draw(canvas);
                    canvas.restore();
                    if (this.drawSideButton2 == 5) {
                        Drawable themedDrawable3 = getThemedDrawable("drawableMoreIcon");
                        int intrinsicWidth2 = themedDrawable3.getIntrinsicWidth() / 2;
                        int intrinsicHeight2 = themedDrawable3.getIntrinsicHeight() / 2;
                        themedDrawable3.setBounds(iDp - intrinsicWidth2, iDp2 - intrinsicHeight2, iDp + intrinsicWidth2, iDp2 + intrinsicHeight2);
                        BaseCell.setDrawableBounds(themedDrawable3, this.sideStartX + AndroidUtilities.dp(4.0f), this.sideStartY + AndroidUtilities.dp(34.0f));
                        themedDrawable3.draw(canvas);
                    }
                } else {
                    int iDp3 = (int) (this.sideStartX + AndroidUtilities.dp(16.0f));
                    int iDp4 = (int) (this.sideStartY + AndroidUtilities.dp(16.0f));
                    Drawable themedDrawable4 = getThemedDrawable("drawableShareIcon");
                    int intrinsicWidth3 = themedDrawable4.getIntrinsicWidth() / 2;
                    int intrinsicHeight3 = themedDrawable4.getIntrinsicHeight() / 2;
                    themedDrawable4.setBounds(iDp3 - intrinsicWidth3, iDp4 - intrinsicHeight3, iDp3 + intrinsicWidth3, iDp4 + intrinsicHeight3);
                    BaseCell.setDrawableBounds(themedDrawable4, this.sideStartX + AndroidUtilities.dp(4.0f), this.sideStartY + AndroidUtilities.dp(4.0f));
                    themedDrawable4.draw(canvas);
                }
                if (iSaveLayerAlpha != -1) {
                    canvas.restoreToCount(iSaveLayerAlpha);
                }
            }
        }
    }

    public void drawSummarizeButton(Canvas canvas) {
        TLRPC.Message message;
        this.summarizeButtonX = this.sideStartX;
        this.summarizeButtonY = getPaddingTop() + AndroidUtilities.dp(8.0f);
        float fMax = Math.max(Math.min((-this.childPosition2) + AndroidUtilities.dp(4.0f), this.sideStartY - AndroidUtilities.dp(42.0f)), this.summarizeButtonY);
        this.summarizeButtonY = fMax;
        if (this.drawSummarizeButton && this.sideButtonVisible) {
            RectF rectF = this.rect;
            float f = this.summarizeButtonX;
            rectF.set(f, fMax, AndroidUtilities.dp(32.0f) + f, this.summarizeButtonY + AndroidUtilities.dp(32.0f));
            applyServiceShaderMatrix();
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), getThemedPaint(this.sideButtonPressed ? "paintChatActionBackgroundSelected" : "paintChatActionBackground"));
            if (hasGradientService()) {
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            if (this.summarizeIcon == null) {
                this.summarizeIcon = new SummaryIcon(this);
            }
            MessageObject messageObject = getMessageObject();
            this.summarizeIcon.set((messageObject == null || (message = messageObject.messageOwner) == null || !message.summarizedOpen) ? false : true);
            BaseCell.setDrawableBounds(this.summarizeIcon, (this.summarizeButtonX + AndroidUtilities.dp(16.0f)) - (this.summarizeIcon.getIntrinsicWidth() / 2.0f), (this.summarizeButtonY + AndroidUtilities.dp(16.0f)) - (this.summarizeIcon.getIntrinsicHeight() / 2.0f));
            this.summarizeIcon.draw(canvas);
        }
    }

    public float getSideButtonStartX() {
        return this.sideStartX;
    }

    public float getSideButtonStartY() {
        return this.sideStartY;
    }

    public void setTimeAlpha(float f) {
        this.timeAlpha = f;
    }

    public float getTimeAlpha() {
        return this.timeAlpha;
    }

    private boolean isSideMenuPossibleLeftMargin() {
        MessageObject messageObject;
        return this.isSideMenued && (messageObject = this.currentMessageObject) != null && !messageObject.isOutOwner() && this.currentPosition == null;
    }

    private boolean isSideMenuLeftMargin() {
        MessageObject messageObject;
        return this.isSideMenuEnabled && (messageObject = this.currentMessageObject) != null && !messageObject.isOutOwner() && this.currentPosition == null;
    }

    public int getBackgroundDrawableLeft() {
        int iDp;
        int iDp2;
        int iDp3;
        int i;
        MessageObject messageObject = getMessageObject();
        if (messageObject != null && messageObject.isOutOwner()) {
            if (this.isRoundVideo) {
                return (this.layoutWidth - this.backgroundWidth) - ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(9.0f)));
            }
            return (this.layoutWidth - this.backgroundWidth) - (this.mediaBackground ? AndroidUtilities.dp(9.0f) : 0);
        }
        float f = 71.0f;
        if (this.isRoundVideo) {
            if (!isSideMenuLeftMargin()) {
                if ((this.isChat || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.isAvatarVisible) {
                    i = 48;
                }
                f = i + 3;
            }
            iDp = AndroidUtilities.dp(f);
            iDp2 = (int) (AndroidUtilities.dp(6.0f) * (1.0f - getVideoTranscriptionProgress()));
        } else {
            if (!isSideMenuLeftMargin()) {
                if ((this.isChat || ((messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar || messageObject.messageOwner.guestchat_via_from != null)) || messageObject.getDialogId() == 489000)) && this.isAvatarVisible) {
                    i = 48;
                }
                f = i;
            }
            iDp = AndroidUtilities.dp(f);
            iDp2 = AndroidUtilities.dp(this.mediaBackground ? 9.0f : 3.0f);
        }
        int iCeil = iDp + iDp2;
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && !groupedMessages.isDocuments && (i = this.currentPosition.leftSpanOffset) != 0) {
            iCeil += (int) Math.ceil((i / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.isRoundVideo) {
            if (!this.drawPinnedBottom) {
                return iCeil;
            }
            iDp3 = (int) (AndroidUtilities.dp(6.0f) * (1.0f - getVideoTranscriptionProgress()));
        } else {
            if (this.mediaBackground || !this.drawPinnedBottom) {
                return iCeil;
            }
            iDp3 = AndroidUtilities.dp(6.0f);
        }
        return iCeil + iDp3;
    }

    public int getBackgroundDrawableRight() {
        int iDp;
        int backgroundDrawableLeft;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i = this.backgroundWidth;
        if (this.isRoundVideo) {
            iDp = i - ((int) (getVideoTranscriptionProgress() * AndroidUtilities.dp(3.0f)));
            if (this.drawPinnedBottom && (messageObject2 = this.currentMessageObject) != null && messageObject2.isOutOwner()) {
                iDp = (int) (iDp - (AndroidUtilities.dp(6.0f) * (1.0f - getVideoTranscriptionProgress())));
            }
            if (this.drawPinnedBottom && ((messageObject = this.currentMessageObject) == null || !messageObject.isOutOwner())) {
                iDp = (int) (iDp - (AndroidUtilities.dp(6.0f) * (1.0f - getVideoTranscriptionProgress())));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            iDp = i - (this.mediaBackground ? 0 : AndroidUtilities.dp(3.0f));
            if (!this.mediaBackground && this.drawPinnedBottom) {
                iDp -= AndroidUtilities.dp(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + iDp;
    }

    public int getBackgroundDrawableTop() {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        int iDp = ((groupedMessagePosition == null || (groupedMessagePosition.flags & 4) != 0) ? 0 : 0 - AndroidUtilities.dp(3.0f)) + (this.drawPinnedTop ? 0 : AndroidUtilities.dp(1.0f));
        return (this.mediaBackground || !this.drawPinnedTop) ? iDp : iDp - AndroidUtilities.dp(1.0f);
    }

    public int getBackgroundDrawableBottom() {
        int iDp;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        int iDp2 = 0;
        if (groupedMessagePosition != null) {
            int i = 4;
            iDp = (groupedMessagePosition.flags & 4) == 0 ? AndroidUtilities.dp(3.0f) : 0;
            if ((this.currentPosition.flags & 8) == 0) {
                MessageObject messageObject = this.currentMessageObject;
                if (messageObject != null && messageObject.isOutOwner()) {
                    i = 3;
                }
                iDp += AndroidUtilities.dp(i);
            }
        } else {
            iDp = 0;
        }
        boolean z = this.drawPinnedBottom;
        if (!z || !this.drawPinnedTop) {
            if (z) {
                iDp2 = AndroidUtilities.dp(1.0f);
            } else {
                iDp2 = AndroidUtilities.dp(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.layoutHeight) - iDp2) + iDp;
        if (this.mediaBackground) {
            return backgroundDrawableTop;
        }
        if (this.drawPinnedTop) {
            backgroundDrawableTop += AndroidUtilities.dp(1.0f);
        }
        return this.drawPinnedBottom ? backgroundDrawableTop + AndroidUtilities.dp(1.0f) : backgroundDrawableTop;
    }

    public void drawBackground(android.graphics.Canvas r16, int r17, int r18, int r19, int r20, boolean r21, boolean r22, boolean r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawBackground(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    private boolean hasInlineBotButtons() {
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject != null && messageObject.hasInlineBotButtons()) || this.drawContinueBotTopic;
    }

    public boolean hasNameLayout() {
        if (this.drawNameLayout && this.nameLayout != null) {
            return true;
        }
        if (this.drawForwardedName) {
            StaticLayout[] staticLayoutArr = this.forwardedNameLayout;
            if (staticLayoutArr[0] != null && staticLayoutArr[1] != null) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
                if (groupedMessagePosition == null) {
                    return true;
                }
                if (groupedMessagePosition.minY == 0 && groupedMessagePosition.minX == 0) {
                    return true;
                }
            }
        }
        return this.drawSummaryReply || this.transitionParams.animateSummaryReply || this.replyNameLayout != null;
    }

    public boolean isDrawNameLayout() {
        return this.drawNameLayout && this.nameLayout != null;
    }

    public boolean isAdminLayoutChanged() {
        return !TextUtils.equals(this.lastPostAuthor, this.currentMessageObject.messageOwner.post_author);
    }

    public void drawNamesLayout(android.graphics.Canvas r44, float r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawNamesLayout(android.graphics.Canvas, float):void");
    }

    public boolean hasCaptionLayout() {
        return this.captionLayout != null;
    }

    public boolean hasCommentLayout() {
        return this.drawCommentButton;
    }

    public MessageObject.TextLayoutBlocks getCaptionLayout() {
        return this.captionLayout;
    }

    public MessageObject.TextLayoutBlocks getExplanationLayout() {
        return this.explanationLayout;
    }

    public float getExplanationX() {
        return this.lastDrawExplanationX;
    }

    public float getExplanationY() {
        return this.lastDrawExplanationY;
    }

    public void setDrawSelectionBackground(boolean z) {
        if (this.drawSelectionBackground != z) {
            this.drawSelectionBackground = z;
            invalidate();
        }
    }

    public boolean isDrawingSelectionBackground() {
        return this.drawSelectionBackground || this.isHighlightedAnimated || this.isHighlighted;
    }

    public float getHighlightAlpha() {
        return getHighlightAlpha(false);
    }

    public float getHighlightAlpha(boolean z) {
        float f;
        QuoteHighlight quoteHighlight;
        if (this.drawSelectionBackground || !this.isHighlightedAnimated) {
            f = 1.0f;
        } else {
            int i = this.highlightProgress;
            f = (i >= 300 ? 1.0f : i / 300.0f) * 1.0f;
        }
        return (z || (quoteHighlight = this.quoteHighlight) == null) ? f : f * (1.0f - quoteHighlight.getT());
    }

    public void setCheckBoxVisible(boolean z, boolean z2) {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject;
        if (z2 && (messageObject = this.currentMessageObject) != null && messageObject.deletedByThanos) {
            return;
        }
        if (z) {
            this.quoteHighlight = null;
            CheckBoxBase checkBoxBase = this.checkBox;
            if (checkBoxBase == null) {
                CheckBoxBase checkBoxBase2 = new CheckBoxBase(this, 21, this.resourcesProvider);
                this.checkBox = checkBoxBase2;
                if (this.attachedToWindow) {
                    checkBoxBase2.onAttachedToWindow();
                }
            } else {
                checkBoxBase.setResourcesProvider(this.resourcesProvider);
            }
        }
        if (z && (((groupedMessages = this.currentMessagesGroup) != null && groupedMessages.messages.size() > 1) || ((groupedMessages2 = this.groupedMessagesToSet) != null && groupedMessages2.messages.size() > 1))) {
            CheckBoxBase checkBoxBase3 = this.mediaCheckBox;
            if (checkBoxBase3 == null) {
                CheckBoxBase checkBoxBase4 = new CheckBoxBase(this, 21, this.resourcesProvider);
                this.mediaCheckBox = checkBoxBase4;
                checkBoxBase4.setUseDefaultCheck(true);
                if (this.attachedToWindow) {
                    this.mediaCheckBox.onAttachedToWindow();
                }
            } else {
                checkBoxBase3.setResourcesProvider(this.resourcesProvider);
            }
        }
        if (this.checkBoxVisible == z) {
            if (z2 == this.checkBoxAnimationInProgress || z2) {
                return;
            }
            this.checkBoxAnimationProgress = z ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        this.checkBoxAnimationInProgress = z2;
        this.checkBoxVisible = z;
        if (z2) {
            this.lastCheckBoxAnimationTime = SystemClock.elapsedRealtime();
        } else {
            this.checkBoxAnimationProgress = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public boolean isCheckBoxVisible() {
        return this.checkBoxVisible || this.checkBoxAnimationInProgress;
    }

    public void setChecked(boolean z, boolean z2, boolean z3) {
        MessageObject messageObject;
        if (z || !z3 || (messageObject = this.currentMessageObject) == null || !messageObject.deletedByThanos) {
            CheckBoxBase checkBoxBase = this.checkBox;
            if (checkBoxBase != null) {
                checkBoxBase.setChecked(z2, z3);
            }
            CheckBoxBase checkBoxBase2 = this.mediaCheckBox;
            if (checkBoxBase2 != null) {
                checkBoxBase2.setChecked(z, z3);
            }
            this.backgroundDrawable.setSelected(z2, z3);
        }
    }

    public void setLastTouchCoords(float f, float f2) {
        this.lastTouchX = f;
        this.lastTouchY = f2;
        this.backgroundDrawable.setTouchCoords(f + getTranslationX(), this.lastTouchY);
    }

    public MessageBackgroundDrawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public MessageDrawable getCurrentBackgroundDrawable(boolean z) {
        if (z) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
            boolean z2 = groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && this.currentMessagesGroup.isDocuments && !this.drawPinnedBottom;
            if (this.currentMessageObject.isOutOwner()) {
                if (!this.mediaBackground && !this.drawPinnedBottom && !z2) {
                    this.currentBackgroundDrawable = (MessageDrawable) getThemedDrawable("drawableMsgOut");
                } else {
                    this.currentBackgroundDrawable = (MessageDrawable) getThemedDrawable("drawableMsgOutMedia");
                }
            } else if (!this.mediaBackground && !this.drawPinnedBottom && !z2) {
                this.currentBackgroundDrawable = (MessageDrawable) getThemedDrawable("drawableMsgIn");
            } else {
                this.currentBackgroundDrawable = (MessageDrawable) getThemedDrawable("drawableMsgInMedia");
            }
        }
        this.currentBackgroundDrawable.getBackgroundDrawable();
        return this.currentBackgroundDrawable;
    }

    private boolean shouldDrawCaptionLayout() {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || messageObject.preview || messageObject.isSponsored() || ((groupedMessagePosition = this.currentPosition) != null && ((groupedMessages = this.currentMessagesGroup) == null || !groupedMessages.isDocuments || (groupedMessagePosition.flags & 8) != 0)) || this.transitionParams.animateBackgroundBoundsInner || (this.enterTransitionInProgress && this.currentMessageObject.isVoice())) ? false : true;
    }

    public void drawCaptionLayout(Canvas canvas, boolean z, float f) {
        if (this.animatedEmojiStack != null && !(canvas instanceof SizeNotifierFrameLayout.SimplerCanvas) && (this.captionLayout != null || this.transitionParams.animateOutCaptionLayout != null)) {
            this.animatedEmojiStack.clearPositions();
        }
        TransitionParams transitionParams = this.transitionParams;
        if (!transitionParams.animateReplaceCaptionLayout || transitionParams.animateChangeProgress == 1.0f) {
            drawCaptionLayout(canvas, this.captionLayout, true, z, f);
        } else {
            drawCaptionLayout(canvas, transitionParams.animateOutCaptionLayout, false, z, f * (1.0f - this.transitionParams.animateChangeProgress));
            drawCaptionLayout(canvas, this.captionLayout, true, z, f * this.transitionParams.animateChangeProgress);
        }
        if (!z) {
            drawAnimatedEmojiCaption(canvas, f);
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.messageOwner == null || !messageObject.isVoiceTranscriptionOpen()) {
            return;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2.messageOwner.voiceTranscriptionFinal || !TranscribeButton.isTranscribing(messageObject2)) {
            return;
        }
        invalidate();
    }

    public void drawCommentLayout(android.graphics.Canvas r25, float r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawCommentLayout(android.graphics.Canvas, float):void");
    }

    public boolean hasReactionsToDraw() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.hasReactionsToDraw():boolean");
    }

    public void drawReactionsLayout(Canvas canvas, float f, Integer num) {
        boolean z;
        if (this.isRoundVideo) {
            this.reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f - getVideoTranscriptionProgress();
        }
        if (this.reactionsVisible && hasReactionsToDraw()) {
            if (this.reactionsLayoutInBubble.drawServiceShaderBackground > 0.0f) {
                applyServiceShaderMatrix();
            }
            if (getAlpha() * f != 1.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (f * 255.0f * getAlpha()), 31);
                z = true;
            } else {
                z = false;
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
            if (reactionsLayoutInBubble.drawServiceShaderBackground > 0.0f || !this.transitionParams.animateBackgroundBoundsInner || this.currentPosition != null || this.isRoundVideo) {
                reactionsLayoutInBubble.setScrimProgress(0.0f, false);
                ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
                TransitionParams transitionParams = this.transitionParams;
                reactionsLayoutInBubble2.draw(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f, num);
            } else {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + this.transitionParams.deltaBottom);
                this.reactionsLayoutInBubble.setScrimProgress(0.0f, false);
                ReactionsLayoutInBubble reactionsLayoutInBubble3 = this.reactionsLayoutInBubble;
                TransitionParams transitionParams2 = this.transitionParams;
                reactionsLayoutInBubble3.draw(canvas, transitionParams2.animateChange ? transitionParams2.animateChangeProgress : 1.0f, num);
                canvas.restore();
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public boolean drawReactionsLayoutOverlay(Canvas canvas, float f) {
        if (this.isRoundVideo) {
            this.reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f - getVideoTranscriptionProgress();
        }
        boolean z = false;
        if (!this.reactionsVisible || !hasReactionsToDraw()) {
            return false;
        }
        if (this.reactionsLayoutInBubble.drawServiceShaderBackground > 0.0f) {
            applyServiceShaderMatrix();
        }
        if (getAlpha() * f != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (f * 255.0f * getAlpha()), 31);
            z = true;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (reactionsLayoutInBubble.drawServiceShaderBackground > 0.0f || !this.transitionParams.animateBackgroundBoundsInner || this.currentPosition != null || this.isRoundVideo) {
            TransitionParams transitionParams = this.transitionParams;
            reactionsLayoutInBubble.drawOverlay(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f);
        } else {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + this.transitionParams.deltaBottom);
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
            TransitionParams transitionParams2 = this.transitionParams;
            reactionsLayoutInBubble2.drawOverlay(canvas, transitionParams2.animateChange ? transitionParams2.animateChangeProgress : 1.0f);
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
        return true;
    }

    private void drawCaptionLayout(Canvas canvas, MessageObject.TextLayoutBlocks textLayoutBlocks, boolean z, boolean z2, float f) {
        float f2;
        int iSaveLayerAlpha;
        Rect rect;
        int i;
        int i2;
        int i3;
        float fDp;
        float imageHeight;
        float fDp2;
        int iDp;
        int i4;
        Path path;
        float f3;
        if (this.mediaBackground) {
            AndroidUtilities.dp(12.0f);
            getExtraTextX();
        } else {
            AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
            getExtraTextX();
        }
        getExtraTextX();
        if (this.currentMessagesGroup != null && !this.currentMessageObject.isMusic() && !this.currentMessageObject.isDocument()) {
            int groupPhotosWidth = getGroupPhotosWidth();
            if ((this.currentPosition.flags & 1) == 0) {
                Math.ceil((r4.pw / 1000.0f) * groupPhotosWidth);
            } else {
                for (int i5 = 0; i5 < this.currentMessagesGroup.posArray.size(); i5++) {
                    if (this.currentMessagesGroup.posArray.get(i5).minY != 0) {
                        break;
                    }
                    Math.ceil(((r5.pw + r5.leftSpanOffset) / 1000.0f) * groupPhotosWidth);
                }
                AndroidUtilities.dp(9.0f);
            }
        } else if (!this.mediaBackground) {
            AndroidUtilities.dp(9.0f);
        }
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition != null && (groupedMessagePosition.flags & 1) == 0 && !this.currentMessagesGroup.hasSibling) {
            AndroidUtilities.dp(14.0f);
        }
        drawCommentLayout(canvas, f);
        if (textLayoutBlocks != null) {
            if (z2 && this.links.isEmpty()) {
                return;
            }
            if ((!this.currentMessageObject.deleted || this.drawingToBitmap || this.currentPosition == null) && f != 0.0f) {
                setupTextColors();
                canvas.save();
                MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
                float f4 = groupedMessages != null ? groupedMessages.transitionParams.captionEnterProgress * f : f;
                if (f4 == 0.0f) {
                    return;
                }
                float videoTranscriptionProgress = this.captionY;
                float f5 = this.captionX;
                TransitionParams transitionParams = this.transitionParams;
                if (transitionParams.animateBackgroundBoundsInner) {
                    if (transitionParams.transformGroupToSingleMessage) {
                        videoTranscriptionProgress -= getTranslationY();
                        f3 = this.transitionParams.deltaLeft;
                    } else if (transitionParams.moveCaption) {
                        float f6 = this.captionX;
                        TransitionParams transitionParams2 = this.transitionParams;
                        float f7 = transitionParams2.animateChangeProgress;
                        float f8 = 1.0f - f7;
                        f2 = (f6 * f7) + (transitionParams2.captionFromX * f8);
                        videoTranscriptionProgress = (transitionParams2.captionFromY * f8) + (this.captionY * f7);
                    } else {
                        if ((!this.currentMessageObject.isVoice() && !this.currentMessageObject.isRoundVideo()) || !TextUtils.isEmpty(this.currentMessageObject.caption)) {
                            f3 = this.transitionParams.deltaLeft;
                        }
                        f2 = f5;
                    }
                    f5 += f3;
                    f2 = f5;
                } else {
                    f2 = f5;
                }
                if (this.isRoundVideo && this.transitionParams.animateDrawBackground) {
                    videoTranscriptionProgress += (1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.roundMessageSize;
                }
                if (f4 != 1.0f) {
                    this.rect.set(f2, videoTranscriptionProgress, textLayoutBlocks.textWidth + f2, textLayoutBlocks.textHeight(this.transitionParams) + videoTranscriptionProgress);
                    iSaveLayerAlpha = canvas.saveLayerAlpha(this.rect, (int) (f4 * 255.0f), 31);
                } else {
                    iSaveLayerAlpha = Integer.MIN_VALUE;
                }
                if (this.isRoundVideo && this.transitionParams.animateDrawBackground) {
                    MessageDrawable.PathDrawParams pathDrawParams = this.backgroundCacheParams;
                    if (pathDrawParams != null && (path = pathDrawParams.getPath()) != null && !path.isEmpty()) {
                        canvas.translate(0.0f, this.transitionYOffsetForDrawables);
                        canvas.clipPath(path);
                        canvas.translate(0.0f, -this.transitionYOffsetForDrawables);
                    }
                } else {
                    TransitionParams transitionParams3 = this.transitionParams;
                    if ((transitionParams3.animateBackgroundBoundsInner && this.currentBackgroundDrawable != null && this.currentMessagesGroup == null) || (transitionParams3.animateMediaAbove && this.currentMessagesGroup == null)) {
                        int iHeight = (!this.drawCommentButton || (rect = this.commentButtonRect) == null) ? 0 : rect.height();
                        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                        int i6 = iHeight + ((reactionsLayoutInBubble == null || reactionsLayoutInBubble.isSmall) ? 0 : reactionsLayoutInBubble.height);
                        if (this.currentMessageObject.isOutOwner() && !this.mediaBackground && !this.pinnedBottom) {
                            canvas.clipRect(getBackgroundDrawableLeft() + this.transitionParams.deltaLeft + AndroidUtilities.dp(4.0f), getBackgroundDrawableTop() + this.transitionParams.deltaTop + AndroidUtilities.dp(4.0f), (getBackgroundDrawableRight() + this.transitionParams.deltaRight) - AndroidUtilities.dp(10.0f), ((getBackgroundDrawableBottom() + this.transitionParams.deltaBottom) - AndroidUtilities.dp(4.0f)) - i6);
                        } else {
                            canvas.clipRect(getBackgroundDrawableLeft() + this.transitionParams.deltaLeft + AndroidUtilities.dp(4.0f), getBackgroundDrawableTop() + this.transitionParams.deltaTop + AndroidUtilities.dp(4.0f), (getBackgroundDrawableRight() + this.transitionParams.deltaRight) - AndroidUtilities.dp(4.0f), ((getBackgroundDrawableBottom() + this.transitionParams.deltaBottom) - AndroidUtilities.dp(4.0f)) - i6);
                        }
                    }
                }
                canvas.save();
                canvas.translate(f2, videoTranscriptionProgress);
                if (this.highlightPath != null) {
                    float fCurrentTimeMillis = (System.currentTimeMillis() - this.highlightPathStart) / 850.0f;
                    if (fCurrentTimeMillis > 1.0f) {
                        this.highlightPath = null;
                    } else {
                        int alpha = Theme.chat_textSearchSelectionPaint.getAlpha();
                        float f9 = fCurrentTimeMillis * 4.0f;
                        Theme.chat_textSearchSelectionPaint.setAlpha((int) (alpha * 0.8f * (1.0f - fCurrentTimeMillis) * f9));
                        canvas.save();
                        float interpolation = (AndroidUtilities.overshootInterpolator.getInterpolation(Math.min(1.0f, f9)) * 0.6f) + 0.4f;
                        LinkPath linkPath = this.highlightPath;
                        canvas.scale(interpolation, interpolation, linkPath.centerX, linkPath.centerY);
                        canvas.drawPath(this.highlightPath, Theme.chat_textSearchSelectionPaint);
                        canvas.restore();
                        Theme.chat_textSearchSelectionPaint.setAlpha(alpha);
                    }
                    invalidate();
                }
                canvas.restore();
                if (this.currentMessageObject.type == 5) {
                    TextPaint textPaint = Theme.chat_timePaint;
                    int themedColor = getThemedColor(Theme.key_chat_serviceText);
                    if (isDrawSelectionBackground()) {
                        i4 = this.currentMessageObject.isOutOwner() ? Theme.key_chat_outTimeSelectedText : Theme.key_chat_inTimeSelectedText;
                    } else {
                        i4 = this.currentMessageObject.isOutOwner() ? Theme.key_chat_outTimeText : Theme.key_chat_inTimeText;
                    }
                    textPaint.setColor(ColorUtils.blendARGB(themedColor, getThemedColor(i4), getVideoTranscriptionProgress()));
                }
                if (z2) {
                    i = Integer.MIN_VALUE;
                    i2 = iSaveLayerAlpha;
                } else {
                    TransitionParams transitionParams4 = this.transitionParams;
                    if (transitionParams4.animateMediaAbove && transitionParams4.animateChangeProgress != 1.0f) {
                        int i7 = this.currentMessageObject.type;
                        if (i7 == 1 || i7 == 20 || this.documentAttachType == 4 || i7 == 8 || i7 == 23) {
                            float imageY = this.photoImage.getImageY();
                            fDp = (imageY + (-textLayoutBlocks.textHeight(this.transitionParams))) - AndroidUtilities.dp(4.0f);
                            imageHeight = this.photoImage.getImageHeight() + imageY + AndroidUtilities.dp(6.0f);
                        } else {
                            float f10 = 43.0f;
                            if (this.hasOldCaptionPreview) {
                                int iDp2 = ((this.totalHeight - AndroidUtilities.dp(this.drawPinnedTop ? 9.0f : 10.0f)) - this.linkPreviewHeight) - AndroidUtilities.dp(17.0f);
                                if (!this.drawCommentButton || this.drawSideButton == 3) {
                                    f10 = 0.0f;
                                } else if (shouldDrawTimeOnMedia()) {
                                    f10 = 41.3f;
                                }
                                fDp2 = (iDp2 - AndroidUtilities.dp(f10)) - this.captionHeight;
                                iDp = AndroidUtilities.dp(9.0f);
                            } else {
                                int iDp3 = (this.totalHeight - this.captionHeight) - AndroidUtilities.dp(this.drawPinnedTop ? 9.0f : 10.0f);
                                if (!this.drawCommentButton || this.drawSideButton == 3) {
                                    f10 = 0.0f;
                                } else if (shouldDrawTimeOnMedia()) {
                                    f10 = 41.3f;
                                }
                                int iDp4 = iDp3 - AndroidUtilities.dp(f10);
                                ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
                                fDp2 = iDp4 - ((reactionsLayoutInBubble2.isEmpty || reactionsLayoutInBubble2.isSmall) ? 0 : reactionsLayoutInBubble2.totalHeight);
                                iDp = AndroidUtilities.dp(9.0f);
                            }
                            imageHeight = fDp2;
                            fDp = iDp;
                        }
                        i3 = iSaveLayerAlpha;
                        i = Integer.MIN_VALUE;
                        drawMessageText(f2, this.captionAbove ? imageHeight : fDp, canvas, textLayoutBlocks.textLayoutBlocks, textLayoutBlocks.textXOffset, z, f * (1.0f - this.transitionParams.animateChangeProgress), true, false, true);
                        drawMessageText(f2, this.captionAbove ? fDp : imageHeight, canvas, textLayoutBlocks.textLayoutBlocks, textLayoutBlocks.textXOffset, z, f * this.transitionParams.animateChangeProgress, true, false, true);
                    } else {
                        i3 = iSaveLayerAlpha;
                        i = Integer.MIN_VALUE;
                        drawMessageText(f2, videoTranscriptionProgress, canvas, textLayoutBlocks.textLayoutBlocks, textLayoutBlocks.textXOffset, z, f, true, false, true);
                    }
                    i2 = i3;
                }
                if (i2 != i) {
                    canvas.restoreToCount(i2);
                }
                canvas.restore();
            }
        }
    }

    public void drawProgressLoadingLink(Canvas canvas, int i) {
        updateProgressLoadingLink();
        ArrayList arrayList = this.progressLoadingLinkDrawables;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        int themedColor = getThemedColor((messageObject == null || !messageObject.isOutOwner()) ? Theme.key_chat_linkSelectBackground : Theme.key_chat_outLinkSelectBackground);
        int i2 = 0;
        while (i2 < this.progressLoadingLinkDrawables.size()) {
            LoadingDrawableLocation loadingDrawableLocation = (LoadingDrawableLocation) this.progressLoadingLinkDrawables.get(i2);
            if (loadingDrawableLocation.blockNum == i) {
                LoadingDrawable loadingDrawable = loadingDrawableLocation.drawable;
                loadingDrawable.setColors(Theme.multAlpha(themedColor, 0.85f), Theme.multAlpha(themedColor, 2.0f), Theme.multAlpha(themedColor, 3.5f), Theme.multAlpha(themedColor, 6.0f));
                loadingDrawable.draw(canvas);
                invalidate();
                if (loadingDrawable.isDisappeared()) {
                    this.progressLoadingLinkDrawables.remove(i2);
                    i2--;
                }
            }
            i2++;
        }
    }

    public void updateProgressLoadingLink() {
        MessageObject messageObject;
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate == null) {
            return;
        }
        if (!chatMessageCellDelegate.isProgressLoading(this, 1)) {
            this.progressLoadingLink = null;
            ArrayList arrayList = this.progressLoadingLinkDrawables;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            for (int i = 0; i < this.progressLoadingLinkDrawables.size(); i++) {
                LoadingDrawableLocation loadingDrawableLocation = (LoadingDrawableLocation) this.progressLoadingLinkDrawables.get(i);
                if (!loadingDrawableLocation.drawable.isDisappearing()) {
                    loadingDrawableLocation.drawable.disappear();
                }
            }
            return;
        }
        CharacterStyle progressLoadingLink = this.delegate.getProgressLoadingLink(this);
        if (progressLoadingLink == this.progressLoadingLink) {
            return;
        }
        this.progressLoadingLink = progressLoadingLink;
        LoadingDrawable loadingDrawable = this.progressLoadingLinkCurrentDrawable;
        if (loadingDrawable != null) {
            loadingDrawable.disappear();
            this.progressLoadingLinkCurrentDrawable = null;
        }
        LoadingDrawable loadingDrawable2 = new LoadingDrawable();
        this.progressLoadingLinkCurrentDrawable = loadingDrawable2;
        loadingDrawable2.setAppearByGradient(true);
        LinkPath linkPath = new LinkPath(true);
        this.progressLoadingLinkCurrentDrawable.usePath(linkPath);
        this.progressLoadingLinkCurrentDrawable.setRadiiDp(5.0f);
        LoadingDrawableLocation loadingDrawableLocation2 = new LoadingDrawableLocation();
        loadingDrawableLocation2.drawable = this.progressLoadingLinkCurrentDrawable;
        loadingDrawableLocation2.blockNum = -3;
        if (this.progressLoadingLinkDrawables == null) {
            this.progressLoadingLinkDrawables = new ArrayList();
        }
        this.progressLoadingLinkDrawables.add(loadingDrawableLocation2);
        if (this.progressLoadingLink == null || findProgressLoadingLink(loadingDrawableLocation2, linkPath, this.descriptionLayout, 0.0f, -2)) {
            return;
        }
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.captionLayout;
        if ((textLayoutBlocks == null || !findProgressLoadingLink(loadingDrawableLocation2, linkPath, textLayoutBlocks.textLayoutBlocks)) && (messageObject = this.currentMessageObject) != null) {
            findProgressLoadingLink(loadingDrawableLocation2, linkPath, messageObject.textLayoutBlocks);
        }
    }

    private boolean findProgressLoadingLink(LoadingDrawableLocation loadingDrawableLocation, LinkPath linkPath, ArrayList arrayList) {
        if (arrayList == null) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (findProgressLoadingLink(loadingDrawableLocation, linkPath, ((MessageObject.TextLayoutBlock) arrayList.get(i)).textLayout, 0.0f, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean findProgressLoadingLink(LoadingDrawableLocation loadingDrawableLocation, LinkPath linkPath, Layout layout, float f, int i) {
        if (layout == null || !(layout.getText() instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) layout.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= characterStyleArr.length) {
                    break;
                }
                if (characterStyleArr[i2] == this.progressLoadingLink) {
                    loadingDrawableLocation.blockNum = i;
                    break;
                }
                i2++;
            }
        }
        if (loadingDrawableLocation.blockNum != i) {
            return false;
        }
        linkPath.rewind();
        int spanStart = spanned.getSpanStart(this.progressLoadingLink);
        int spanEnd = spanned.getSpanEnd(this.progressLoadingLink);
        linkPath.setUseCornerPathImplementation(true);
        linkPath.setCurrentLayout(layout, spanStart, f);
        layout.getSelectionPath(spanStart, spanEnd, linkPath);
        linkPath.closeRects();
        this.progressLoadingLinkCurrentDrawable.updateBounds();
        return true;
    }

    public boolean needDrawTime() {
        MessageObject messageObject;
        return !this.forceNotDrawTime && ((messageObject = this.currentMessageObject) == null || messageObject.type != 27);
    }

    public boolean shouldDrawTimeOnMedia() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.shouldDrawTimeOnMedia():boolean");
    }

    public void drawTime(android.graphics.Canvas r17, float r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawTime(android.graphics.Canvas, float, boolean):void");
    }

    private void drawTimeInternal(android.graphics.Canvas r43, float r44, boolean r45, float r46, android.text.StaticLayout r47, float r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawTimeInternal(android.graphics.Canvas, float, boolean, float, android.text.StaticLayout, float, boolean):void");
    }

    public void createStatusDrawableAnimator(int i, int i2, final boolean z) {
        boolean z2 = false;
        boolean z3 = (i2 & 1) != 0;
        boolean z4 = (i2 & 2) != 0;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        if ((i & 4) == 0 && z6 && z4 && !z5 && z3) {
            z2 = true;
        }
        if (!this.transitionParams.messageEntering || z2) {
            this.statusDrawableProgress = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.statusDrawableAnimator = valueAnimatorOfFloat;
            if (z2) {
                valueAnimatorOfFloat.setDuration(220L);
            } else {
                valueAnimatorOfFloat.setDuration(150L);
            }
            this.statusDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animateFromStatusDrawableParams = i;
            this.animateToStatusDrawableParams = i2;
            this.statusDrawableAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$createStatusDrawableAnimator$15(z, valueAnimator);
                }
            });
            this.statusDrawableAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    int iCreateStatusDrawableParams = ChatMessageCell.this.transitionParams.createStatusDrawableParams();
                    if (ChatMessageCell.this.animateToStatusDrawableParams == iCreateStatusDrawableParams) {
                        ChatMessageCell.this.statusDrawableAnimationInProgress = false;
                        ChatMessageCell chatMessageCell = ChatMessageCell.this;
                        chatMessageCell.transitionParams.lastStatusDrawableParams = chatMessageCell.animateToStatusDrawableParams;
                        return;
                    }
                    ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
                    chatMessageCell2.createStatusDrawableAnimator(chatMessageCell2.animateToStatusDrawableParams, iCreateStatusDrawableParams, z);
                }
            });
            this.statusDrawableAnimationInProgress = true;
            this.statusDrawableAnimator.start();
        }
    }

    public void lambda$createStatusDrawableAnimator$15(boolean z, ValueAnimator valueAnimator) {
        this.statusDrawableProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
        if (!z || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    private void drawClockOrErrorLayout(android.graphics.Canvas r7, boolean r8, boolean r9, float r10, float r11, float r12, float r13, float r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawClockOrErrorLayout(android.graphics.Canvas, boolean, boolean, float, float, float, float, float, boolean):void");
    }

    public float getTimeX() {
        return this.transitionParams.shouldAnimateTimeX ? AndroidUtilities.lerp(r0.animateFromTimeX, this.timeX, r0.animateChangeProgress) : this.timeX;
    }

    public float getTimeY() {
        int iDp;
        int iDp2 = 0;
        if (shouldDrawTimeOnMedia()) {
            if (this.drawCommentButton) {
                iDp2 = AndroidUtilities.dp(41.3f);
            }
        } else {
            if (this.currentMessageObject.isSponsored()) {
                iDp = -AndroidUtilities.dp(48.0f);
                if (this.hasNewLineForTime) {
                    iDp -= AndroidUtilities.dp(4.0f);
                }
                return getTimeY(iDp);
            }
            if (this.drawCommentButton) {
                iDp2 = AndroidUtilities.dp(43.0f);
            }
        }
        iDp = -iDp2;
        return getTimeY(iDp);
    }

    public float getTimeY(float f) {
        if (shouldDrawTimeOnMedia() && this.documentAttachType != 7) {
            return ((getPhotoBottom() + this.additionalTimeOffsetY) - AndroidUtilities.dp(7.3f)) - this.timeLayout.getHeight();
        }
        float fDp = ((this.layoutHeight - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 7.5f : 6.5f)) - this.timeLayout.getHeight()) + f;
        if (this.isRoundVideo) {
            fDp -= (AndroidUtilities.dp(this.drawPinnedBottom ? 4.0f : 5.0f) + this.reactionsLayoutInBubble.getCurrentTotalHeight(this.transitionParams.animateChangeProgress)) * (1.0f - getVideoTranscriptionProgress());
        }
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
            float f2 = fDp + transitionParams.offsetBottom;
            return transitionParams.backgroundChangeBounds ? f2 - getTranslationY() : f2;
        }
        TransitionParams transitionParams2 = this.transitionParams;
        return fDp + (transitionParams2.deltaBottom - transitionParams2.deltaTop);
    }

    private void drawViewsAndRepliesLayout(android.graphics.Canvas r25, float r26, float r27, float r28, float r29, float r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawViewsAndRepliesLayout(android.graphics.Canvas, float, float, float, float, float, boolean):void");
    }

    private void drawStatusDrawable(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5, float f2, float f3, float f4, boolean z6, boolean z7) {
        float photoBottom;
        int iDp;
        int iDp2;
        Drawable themedDrawable;
        Drawable themedDrawable2;
        int themedColor;
        MessageObject messageObject;
        boolean z8 = (f4 == 1.0f || z6) ? false : true;
        float f5 = (f4 * 0.5f) + 0.5f;
        float f6 = z8 ? f * f4 : f;
        if (this.documentAttachType != 7 || ((messageObject = this.currentMessageObject) != null && messageObject.isRoundOnce())) {
            photoBottom = getPhotoBottom() + this.additionalTimeOffsetY;
        } else {
            photoBottom = f3 - ((AndroidUtilities.dp(this.drawPinnedBottom ? 4.0f : 5.0f) + this.reactionsLayoutInBubble.getCurrentTotalHeight(this.transitionParams.animateChangeProgress)) * (1.0f - getVideoTranscriptionProgress()));
        }
        float fDp = photoBottom - AndroidUtilities.dp(8.5f);
        MessageObject messageObject2 = this.currentMessageObject;
        float fDp2 = (messageObject2 == null || !messageObject2.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(-6.0f);
        if (z3) {
            MsgClockDrawable msgClockDrawable = Theme.chat_msgClockDrawable;
            if (shouldDrawTimeOnMedia()) {
                if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                    themedColor = getThemedColor(Theme.key_chat_serviceText);
                    BaseCell.setDrawableBounds(msgClockDrawable, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 24.0f : 22.0f)) - msgClockDrawable.getIntrinsicWidth()) + fDp2, (fDp - msgClockDrawable.getIntrinsicHeight()) + f2);
                    msgClockDrawable.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                } else {
                    themedColor = getThemedColor(Theme.key_chat_mediaSentClock);
                    BaseCell.setDrawableBounds(msgClockDrawable, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 24.0f : 22.0f)) - msgClockDrawable.getIntrinsicWidth()) + fDp2, (fDp - msgClockDrawable.getIntrinsicHeight()) + f2);
                    msgClockDrawable.setAlpha((int) (f6 * 255.0f));
                }
            } else {
                int themedColor2 = getThemedColor(Theme.key_chat_outSentClock);
                BaseCell.setDrawableBounds(msgClockDrawable, (this.layoutWidth - AndroidUtilities.dp(18.5f)) - msgClockDrawable.getIntrinsicWidth(), ((f3 - AndroidUtilities.dp(8.5f)) - msgClockDrawable.getIntrinsicHeight()) + f2);
                msgClockDrawable.setAlpha((int) (f6 * 255.0f));
                themedColor = themedColor2;
            }
            msgClockDrawable.setColor(themedColor);
            if (z8) {
                canvas.save();
                canvas.scale(f5, f5, msgClockDrawable.getBounds().centerX(), msgClockDrawable.getBounds().centerY());
            }
            msgClockDrawable.draw(canvas);
            msgClockDrawable.setAlpha(255);
            if (z8) {
                canvas.restore();
            }
            invalidate();
        }
        if (z2) {
            if (shouldDrawTimeOnMedia()) {
                if (z6) {
                    canvas.save();
                }
                if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                    themedDrawable2 = getThemedDrawable("drawableMsgStickerCheck");
                    if (z) {
                        if (z6) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (1.0f - f4), 0.0f);
                        }
                        BaseCell.setDrawableBounds(themedDrawable2, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 28.3f : 26.3f)) - themedDrawable2.getIntrinsicWidth()) + fDp2, (fDp - themedDrawable2.getIntrinsicHeight()) + f2);
                    } else {
                        BaseCell.setDrawableBounds(themedDrawable2, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 23.5f : 21.5f)) - themedDrawable2.getIntrinsicWidth()) + fDp2, (fDp - themedDrawable2.getIntrinsicHeight()) + f2);
                    }
                    themedDrawable2.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                } else {
                    if (z) {
                        if (z6) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (1.0f - f4), 0.0f);
                        }
                        BaseCell.setDrawableBounds(Theme.chat_msgMediaCheckDrawable, (this.layoutWidth - AndroidUtilities.dp(z5 ? 28.3f : 26.3f)) - Theme.chat_msgMediaCheckDrawable.getIntrinsicWidth(), (fDp - Theme.chat_msgMediaCheckDrawable.getIntrinsicHeight()) + f2);
                    } else {
                        BaseCell.setDrawableBounds(Theme.chat_msgMediaCheckDrawable, (this.layoutWidth - AndroidUtilities.dp(z5 ? 23.5f : 21.5f)) - Theme.chat_msgMediaCheckDrawable.getIntrinsicWidth(), (fDp - Theme.chat_msgMediaCheckDrawable.getIntrinsicHeight()) + f2);
                    }
                    Theme.chat_msgMediaCheckDrawable.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                    themedDrawable2 = Theme.chat_msgMediaCheckDrawable;
                }
                if (z8) {
                    canvas.save();
                    canvas.scale(f5, f5, themedDrawable2.getBounds().centerX(), themedDrawable2.getBounds().centerY());
                }
                themedDrawable2.draw(canvas);
                if (z8) {
                    canvas.restore();
                }
                if (z6) {
                    canvas.restore();
                }
                themedDrawable2.setAlpha(255);
            } else {
                if (z6) {
                    canvas.save();
                }
                if (z) {
                    if (z6) {
                        canvas.translate(AndroidUtilities.dp(4.0f) * (1.0f - f4), 0.0f);
                    }
                    themedDrawable = getThemedDrawable(z7 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    BaseCell.setDrawableBounds(themedDrawable, ((this.layoutWidth - AndroidUtilities.dp(22.5f)) - themedDrawable.getIntrinsicWidth()) + fDp2, ((f3 - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 9.0f : 8.0f)) - themedDrawable.getIntrinsicHeight()) + f2);
                } else {
                    themedDrawable = getThemedDrawable(z7 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    BaseCell.setDrawableBounds(themedDrawable, ((this.layoutWidth - AndroidUtilities.dp(18.5f)) - themedDrawable.getIntrinsicWidth()) + fDp2, ((f3 - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 9.0f : 8.0f)) - themedDrawable.getIntrinsicHeight()) + f2);
                }
                themedDrawable.setAlpha((int) (f6 * 255.0f));
                if (z8) {
                    canvas.save();
                    canvas.scale(f5, f5, themedDrawable.getBounds().centerX(), themedDrawable.getBounds().centerY());
                }
                themedDrawable.draw(canvas);
                if (z8) {
                    canvas.restore();
                }
                if (z6) {
                    canvas.restore();
                }
                themedDrawable.setAlpha(255);
            }
        }
        if (z) {
            if (shouldDrawTimeOnMedia()) {
                Drawable themedDrawable3 = this.currentMessageObject.shouldDrawWithoutBackground() ? getThemedDrawable("drawableMsgStickerHalfCheck") : Theme.chat_msgMediaHalfCheckDrawable;
                BaseCell.setDrawableBounds(themedDrawable3, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 23.5f : 21.5f)) - themedDrawable3.getIntrinsicWidth()) + fDp2, (fDp - themedDrawable3.getIntrinsicHeight()) + f2);
                themedDrawable3.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                if (z8 || z6) {
                    canvas.save();
                    canvas.scale(f5, f5, themedDrawable3.getBounds().centerX(), themedDrawable3.getBounds().centerY());
                }
                themedDrawable3.draw(canvas);
                if (z8 || z6) {
                    canvas.restore();
                }
                themedDrawable3.setAlpha(255);
            } else {
                Drawable themedDrawable4 = getThemedDrawable(z7 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                BaseCell.setDrawableBounds(themedDrawable4, (this.layoutWidth - AndroidUtilities.dp(18.0f)) - themedDrawable4.getIntrinsicWidth(), ((f3 - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 9.0f : 8.0f)) - themedDrawable4.getIntrinsicHeight()) + f2);
                themedDrawable4.setAlpha((int) (f6 * 255.0f));
                if (z8 || z6) {
                    canvas.save();
                    canvas.scale(f5, f5, themedDrawable4.getBounds().centerX(), themedDrawable4.getBounds().centerY());
                }
                themedDrawable4.draw(canvas);
                if (z8 || z6) {
                    canvas.restore();
                }
                themedDrawable4.setAlpha(255);
            }
        }
        if (z4) {
            if (shouldDrawTimeOnMedia()) {
                iDp = this.layoutWidth - AndroidUtilities.dp(34.5f);
                iDp2 = AndroidUtilities.dp(26.5f);
            } else {
                iDp = this.layoutWidth - AndroidUtilities.dp(32.0f);
                iDp2 = AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 22.0f : 21.0f);
            }
            float f7 = (f3 - iDp2) + f2;
            this.rect.set((int) (iDp + fDp2), f7, AndroidUtilities.dp(14.0f) + r6, AndroidUtilities.dp(14.0f) + f7);
            int alpha = Theme.chat_msgErrorPaint.getAlpha();
            Theme.chat_msgErrorPaint.setAlpha((int) (alpha * f6));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.chat_msgErrorPaint);
            Theme.chat_msgErrorPaint.setAlpha(alpha);
            BaseCell.setDrawableBounds(Theme.chat_msgErrorDrawable, r6 + AndroidUtilities.dp(6.0f), f7 + AndroidUtilities.dp(2.0f));
            Theme.chat_msgErrorDrawable.setAlpha((int) (f6 * 255.0f));
            if (z8) {
                canvas.save();
                canvas.scale(f5, f5, Theme.chat_msgErrorDrawable.getBounds().centerX(), Theme.chat_msgErrorDrawable.getBounds().centerY());
            }
            Theme.chat_msgErrorDrawable.draw(canvas);
            Theme.chat_msgErrorDrawable.setAlpha(255);
            if (z8) {
                canvas.restore();
            }
        }
    }

    public void drawOverlays(android.graphics.Canvas r80) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawOverlays(android.graphics.Canvas):void");
    }

    public int getTodoIndex(int i) {
        for (int i2 = 0; i2 < this.pollButtons.size(); i2++) {
            PollButton pollButton = (PollButton) this.pollButtons.get(i2);
            if (pollButton.task != null && pollButton.task.id == i) {
                return i2;
            }
        }
        return -1;
    }

    public int getPollIndex(byte[] bArr) {
        for (int i = 0; i < this.pollButtons.size(); i++) {
            PollButton pollButton = (PollButton) this.pollButtons.get(i);
            if (pollButton.answer != null && Arrays.equals(pollButton.answer.option, bArr)) {
                return i;
            }
        }
        return -1;
    }

    public float getPollButtonTop(int i) {
        if (i < 0 || i >= this.pollButtons.size()) {
            return 0.0f;
        }
        int i2 = ((PollButton) this.pollButtons.get(i)).y;
        int i3 = this.namesOffset;
        float f = i2 + i3;
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateForwardedLayout) {
            float f2 = transitionParams.animateChangeProgress;
            f += (i3 * f2) + (transitionParams.animateForwardedNamesOffset * (1.0f - f2));
            if (this.currentMessageObject.needDrawForwarded()) {
                f -= this.namesOffset;
            }
        }
        TransitionParams transitionParams2 = this.transitionParams;
        if (transitionParams2.animateBackgroundBoundsInner) {
            f += transitionParams2.deltaTop;
        }
        return f - AndroidUtilities.dp(13.0f);
    }

    public float getPollButtonsLeft() {
        int iDp;
        if (getMessageObject() != null && getMessageObject().isOutOwner()) {
            iDp = (AndroidUtilities.dp(3.0f) + this.layoutWidth) - this.backgroundWidth;
        } else if (this.isSideMenuEnabled) {
            iDp = AndroidUtilities.dp(82.0f);
        } else if (needDrawAvatar()) {
            iDp = AndroidUtilities.dp(59.0f);
        } else {
            iDp = AndroidUtilities.dp(11.0f);
        }
        return iDp;
    }

    public float getPollButtonsRight() {
        return (getPollButtonsLeft() + this.backgroundWidth) - AndroidUtilities.dp(15.0f);
    }

    public float getPollButtonBottom(int i) {
        if (i < 0 || i >= this.pollButtons.size()) {
            return 0.0f;
        }
        int i2 = ((PollButton) this.pollButtons.get(i)).y;
        int i3 = this.namesOffset;
        float f = i2 + i3;
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateForwardedLayout) {
            float f2 = transitionParams.animateChangeProgress;
            f += (i3 * f2) + (transitionParams.animateForwardedNamesOffset * (1.0f - f2));
            if (this.currentMessageObject.needDrawForwarded()) {
                f -= this.namesOffset;
            }
        }
        TransitionParams transitionParams2 = this.transitionParams;
        if (transitionParams2.animateBackgroundBoundsInner) {
            f += transitionParams2.deltaTop;
        }
        return f + r6.height + AndroidUtilities.dp(13.0f);
    }

    protected void drawRadialProgress(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawRadialProgress(android.graphics.Canvas):void");
    }

    protected void drawPhotoBlurRect(Canvas canvas, RectF rectF) {
        this.rectPath.rewind();
        this.rectPath.addRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.rectPath);
        float alpha = this.photoImage.getAlpha();
        this.photoImage.setAlpha((this.currentMessageObject.isRoundOnce() ? 1.0f : 0.5f) * alpha);
        this.photoImage.draw(canvas);
        this.photoImage.setAlpha(alpha);
        canvas.restore();
        Paint themedPaint = getThemedPaint("paintChatTimeBackground");
        int alpha2 = themedPaint.getAlpha();
        themedPaint.setAlpha((int) (alpha2 * this.controlsAlpha * 0.4f));
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, themedPaint);
        themedPaint.setAlpha(alpha2);
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public MessageObject getMessageObject() {
        MessageObject messageObject = this.messageObjectToSet;
        return messageObject != null ? messageObject : this.currentMessageObject;
    }

    public ReactionsLayoutInBubble getReactionsLayout() {
        return this.reactionsLayoutInBubble;
    }

    @Override
    public void didPressReactionFromLayout(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate != null) {
            chatMessageCellDelegate.didPressReaction(this, reactionCount, z, f, f2);
        }
    }

    public TLRPC.Document getStreamingMedia() {
        int i = this.documentAttachType;
        if (i == 4 || i == 7 || i == 2) {
            return this.documentAttach;
        }
        return null;
    }

    @Override
    public boolean drawPinnedBottom() {
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && groupedMessages.isDocuments) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
            if (groupedMessagePosition == null || (groupedMessagePosition.flags & 8) == 0) {
                return true;
            }
            return this.pinnedBottom;
        }
        return this.pinnedBottom;
    }

    public float getVideoTranscriptionProgress() {
        MessageObject messageObject;
        if (this.transitionParams == null || (messageObject = this.currentMessageObject) == null || !messageObject.isRoundVideo()) {
            return 1.0f;
        }
        TransitionParams transitionParams = this.transitionParams;
        if (!transitionParams.animateDrawBackground) {
            return this.drawBackground ? 1.0f : 0.0f;
        }
        if (this.drawBackground) {
            return transitionParams.animateChangeProgress;
        }
        return 1.0f - transitionParams.animateChangeProgress;
    }

    @Override
    public boolean drawPinnedTop() {
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && groupedMessages.isDocuments) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
            if (groupedMessagePosition == null || (groupedMessagePosition.flags & 4) == 0) {
                return true;
            }
            return this.pinnedTop;
        }
        return this.pinnedTop;
    }

    public boolean isPinnedBottom() {
        if (this.messageObjectToSet != null) {
            return this.bottomNearToSet;
        }
        return this.pinnedBottom;
    }

    public boolean isPinnedTop() {
        if (this.messageObjectToSet != null) {
            return this.topNearToSet;
        }
        return this.pinnedTop;
    }

    public boolean isFirstInChat() {
        if (this.messageObjectToSet != null) {
            return this.firstInChatToSet;
        }
        return this.firstInChat;
    }

    public boolean isLastInChatList() {
        if (this.messageObjectToSet != null) {
            return this.lastInChatListToSet;
        }
        return this.lastInChatList;
    }

    public MessageObject.GroupedMessages getCurrentMessagesGroup() {
        return this.currentMessagesGroup;
    }

    @Override
    public MessageObject.GroupedMessagePosition getCurrentPosition() {
        return this.currentPosition;
    }

    public int getLayoutHeight() {
        return this.layoutHeight;
    }

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) throws Resources.NotFoundException, NumberFormatException {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate != null && chatMessageCellDelegate.onAccessibilityAction(i, bundle)) {
            return false;
        }
        if (i == 16) {
            int iconForCurrentState = getIconForCurrentState();
            if (iconForCurrentState != 4 && iconForCurrentState != 5) {
                didPressButton(true, false);
            } else if (this.currentMessageObject.type == 16) {
                this.delegate.didPressOther(this, this.otherX, this.otherY);
            } else {
                didClickedImage();
            }
            return true;
        }
        if (i == R.id.acc_action_small_button) {
            didPressMiniButton(true);
        } else if (i == R.id.acc_action_msg_options) {
            ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
            if (chatMessageCellDelegate2 != null) {
                if (this.currentMessageObject.type == 16) {
                    chatMessageCellDelegate2.didLongPress(this, 0.0f, 0.0f);
                } else {
                    chatMessageCellDelegate2.didPressOther(this, this.otherX, this.otherY);
                }
            }
        } else if (i == R.id.acc_action_open_forwarded_origin) {
            ChatMessageCellDelegate chatMessageCellDelegate3 = this.delegate;
            if (chatMessageCellDelegate3 != null) {
                TLRPC.Chat chat = this.currentForwardChannel;
                if (chat != null) {
                    chatMessageCellDelegate3.didPressChannelAvatar(this, chat, this.currentMessageObject.messageOwner.fwd_from.channel_post, this.lastTouchX, this.lastTouchY, false);
                } else {
                    TLRPC.User user = this.currentForwardUser;
                    if (user != null) {
                        chatMessageCellDelegate3.didPressUserAvatar(this, user, this.lastTouchX, this.lastTouchY, false);
                    } else if (this.currentForwardName != null) {
                        chatMessageCellDelegate3.didPressHiddenForward(this);
                    }
                }
            }
        } else if (i == R.id.acc_action_summarize) {
            ChatMessageCellDelegate chatMessageCellDelegate4 = this.delegate;
            if (chatMessageCellDelegate4 != null) {
                chatMessageCellDelegate4.didPressSummarize(this, this.drawSummaryReply);
            }
        } else if (i == R.id.acc_action_copy_code && this.delegate != null && (arrayList = this.currentMessageObject.textLayoutBlocks) != null) {
            Iterator<MessageObject.TextLayoutBlock> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MessageObject.TextLayoutBlock next = it.next();
                if (next.hasCodeCopyButton) {
                    this.delegate.didPressCodeCopy(this, next);
                    break;
                }
            }
        }
        if ((this.currentMessageObject.isVoice() || this.currentMessageObject.isRoundVideo() || (this.currentMessageObject.isMusic() && MediaController.getInstance().isPlayingMessage(this.currentMessageObject))) && this.seekBarAccessibilityDelegate.performAccessibilityActionInternal(i, bundle)) {
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override
    public void setAnimationRunning(boolean z, boolean z2) {
        this.animationRunning = z;
        if (z) {
            this.willRemoved = z2;
        } else {
            this.willRemoved = false;
        }
    }

    public float getEventX(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    public float getEventY(MotionEvent motionEvent) {
        return ((motionEvent.getY() - this.starsPriceTopPadding) - this.topicSeparatorTopPadding) - this.suggestionOfferTopPadding;
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int eventX = (int) getEventX(motionEvent);
        int eventY = (int) getEventY(motionEvent);
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            for (int i = 0; i < this.accessibilityVirtualViewBounds.size(); i++) {
                if (((Rect) this.accessibilityVirtualViewBounds.valueAt(i)).contains(eventX, eventY)) {
                    int iKeyAt = this.accessibilityVirtualViewBounds.keyAt(i);
                    if (iKeyAt == this.currentFocusedVirtualView) {
                        return true;
                    }
                    this.currentFocusedVirtualView = iKeyAt;
                    sendAccessibilityEventForVirtualView(iKeyAt, 32768);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 10) {
            this.currentFocusedVirtualView = 0;
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new MessageAccessibilityNodeProvider();
    }

    public void sendAccessibilityEventForVirtualView(int i, int i2) {
        sendAccessibilityEventForVirtualView(i, i2, null);
    }

    private void sendAccessibilityEventForVirtualView(int i, int i2, String str) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            accessibilityEventObtain.setPackageName(getContext().getPackageName());
            accessibilityEventObtain.setSource(this, i);
            if (str != null) {
                accessibilityEventObtain.getText().add(str);
            }
            if (getParent() != null) {
                getParent().requestSendAccessibilityEvent(this, accessibilityEventObtain);
            }
        }
    }

    public static PointF getMessageSize(int i, int i2) {
        return getMessageSize(i, i2, 0, 0);
    }

    private static android.graphics.PointF getMessageSize(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.getMessageSize(int, int, int, int):android.graphics.PointF");
    }

    public StaticLayout getDescriptionlayout() {
        return this.descriptionLayout;
    }

    public float getDescriptionLayoutX() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.getDescriptionLayoutX():float");
    }

    public float getDescriptionLayoutY() {
        float f = this.descriptionY;
        TransitionParams transitionParams = this.transitionParams;
        return f + (!transitionParams.animateLinkPreviewY ? (-transitionParams.deltaTop) + transitionParams.deltaBottom : 0.0f);
    }

    public StaticLayout getFactCheckLayout() {
        return this.factCheckTextLayout;
    }

    public void setSelectedBackgroundProgress(float f) {
        this.selectedBackgroundProgress = f;
        invalidate();
    }

    public int computeHeight(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z) throws Resources.NotFoundException, NumberFormatException {
        this.photoImage.setIgnoreImageSet(true);
        this.avatarImage.setIgnoreImageSet(true);
        this.replyImageReceiver.setIgnoreImageSet(true);
        this.locationImageReceiver.setIgnoreImageSet(true);
        if (groupedMessages != null && groupedMessages.messages.size() != 1) {
            if (groupedMessages.messages.size() != groupedMessages.positions.size()) {
                groupedMessages.calculate();
            }
            this.computedGroupCaptionY = 0;
            int i = 0;
            for (int i2 = 0; i2 < groupedMessages.messages.size(); i2++) {
                MessageObject messageObject2 = groupedMessages.messages.get(i2);
                MessageObject.GroupedMessagePosition position = groupedMessages.getPosition(messageObject2);
                if (position != null && (position.flags & 1) != 0) {
                    setMessageContent(messageObject2, groupedMessages, false, false, false, false);
                    if (z && !TextUtils.isEmpty(this.currentCaption)) {
                        updateCaptionLayout();
                        this.computedGroupCaptionY = (int) (i + this.captionY);
                        this.computedCaptionLayout = this.captionLayout;
                    }
                    i += this.totalHeight + this.keyboardHeight;
                }
            }
            return i;
        }
        setMessageContent(messageObject, groupedMessages, false, false, false, false);
        this.photoImage.setIgnoreImageSet(false);
        this.avatarImage.setIgnoreImageSet(false);
        this.replyImageReceiver.setIgnoreImageSet(false);
        this.locationImageReceiver.setIgnoreImageSet(false);
        updateCaptionLayout();
        return this.totalHeight + this.keyboardHeight;
    }

    public int computeWidth(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages) throws Resources.NotFoundException, NumberFormatException {
        this.photoImage.setIgnoreImageSet(true);
        this.avatarImage.setIgnoreImageSet(true);
        this.replyImageReceiver.setIgnoreImageSet(true);
        this.locationImageReceiver.setIgnoreImageSet(true);
        if (groupedMessages != null && groupedMessages.messages.size() != 1) {
            if (groupedMessages.messages.size() != groupedMessages.positions.size()) {
                groupedMessages.calculate();
            }
            this.computedGroupCaptionY = 0;
            int i = 0;
            for (int i2 = 0; i2 < groupedMessages.messages.size(); i2++) {
                MessageObject messageObject2 = groupedMessages.messages.get(i2);
                MessageObject.GroupedMessagePosition position = groupedMessages.getPosition(messageObject2);
                if (position != null && (position.flags & 4) != 0) {
                    setMessageContent(messageObject2, groupedMessages, false, false, false, false);
                    i += this.backgroundWidth;
                }
            }
            return i;
        }
        setMessageContent(messageObject, groupedMessages, false, false, false, false);
        this.photoImage.setIgnoreImageSet(false);
        this.avatarImage.setIgnoreImageSet(false);
        this.replyImageReceiver.setIgnoreImageSet(false);
        this.locationImageReceiver.setIgnoreImageSet(false);
        updateCaptionLayout();
        return this.backgroundWidth;
    }

    public void shakeView() {
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(View.ROTATION, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.2f, 3.0f), Keyframe.ofFloat(0.4f, -3.0f), Keyframe.ofFloat(0.6f, 3.0f), Keyframe.ofFloat(0.8f, -3.0f), Keyframe.ofFloat(1.0f, 0.0f));
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.5f, 0.97f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(1.0f, 1.0f);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(View.SCALE_X, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3);
        PropertyValuesHolder propertyValuesHolderOfKeyframe3 = PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3);
        AnimatorSet animatorSet = new AnimatorSet();
        this.shakeAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofPropertyValuesHolder(this, propertyValuesHolderOfKeyframe), ObjectAnimator.ofPropertyValuesHolder(this, propertyValuesHolderOfKeyframe2), ObjectAnimator.ofPropertyValuesHolder(this, propertyValuesHolderOfKeyframe3));
        this.shakeAnimation.setDuration(500L);
        this.shakeAnimation.start();
    }

    private void cancelShakeAnimation() {
        AnimatorSet animatorSet = this.shakeAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.shakeAnimation = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
            setRotation(0.0f);
        }
    }

    public void setSlidingOffset(float f) {
        if (this.slidingOffsetX != f) {
            this.slidingOffsetX = f;
            updateTranslation();
        }
    }

    public void setAnimationOffsetX(float f) {
        if (this.animationOffsetX != f) {
            this.animationOffsetX = f;
            updateTranslation();
        }
    }

    public void updateTranslation() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        float fDp = this.slidingOffsetX + this.animationOffsetX;
        if (!messageObject.isOutOwner() || this.currentMessageObject.hasWideCode) {
            fDp += this.checkBoxTranslation;
        }
        if (this.isSideMenued && !this.currentMessageObject.isOutOwner() && this.currentPosition != null) {
            fDp += AndroidUtilities.dp(71 - (needDrawAvatar() ? 48 : 0)) * this.sideMenuAlpha;
        }
        setTranslationX(fDp);
    }

    public float getNonAnimationTranslationX(boolean z) {
        boolean z2;
        float f = this.slidingOffsetX;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.isOutOwner()) {
            return f;
        }
        if (z && ((z2 = this.checkBoxVisible) || this.checkBoxAnimationInProgress)) {
            this.checkBoxTranslation = (int) Math.ceil((z2 ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(this.checkBoxAnimationProgress) * AndroidUtilities.dp(35.0f));
            if (this.currentMessageObject.type == 36 && getCurrentBackgroundRight() + AndroidUtilities.dp(35.0f) > getWidth()) {
                this.checkBoxTranslation = 0;
            }
        }
        float f2 = f + this.checkBoxTranslation;
        if (!this.isSideMenued || this.currentPosition == null) {
            return f2;
        }
        return f2 + (AndroidUtilities.dp(71 - (needDrawAvatar() ? 48 : 0)) * this.sideMenuAlpha);
    }

    @Override
    public float getSlidingOffsetX() {
        return this.slidingOffsetX;
    }

    @Override
    public boolean willRemovedAfterAnimation() {
        return this.willRemoved;
    }

    public float getAnimationOffsetX() {
        return this.animationOffsetX;
    }

    @Override
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    public boolean isDraggingdAnyMusicSeekBar() {
        SeekBar seekBar = this.seekBar;
        if (seekBar != null && seekBar.isDragging()) {
            return true;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isPoll()) {
            return false;
        }
        PollContentDrawable pollContentDrawable = this.pollContentDrawable;
        if (pollContentDrawable != null && pollContentDrawable.isDraggingSeekBar()) {
            return true;
        }
        PollContentDrawable pollContentDrawable2 = this.pollExplanationDrawable;
        return pollContentDrawable2 != null && pollContentDrawable2.isDraggingSeekBar();
    }

    public SeekBarWaveform getSeekBarWaveform() {
        return this.seekBarWaveform;
    }

    class MessageAccessibilityNodeProvider extends AccessibilityNodeProvider {
        private Path linkPath;
        private Rect rect;
        private RectF rectF;

        private MessageAccessibilityNodeProvider() {
            this.linkPath = new Path();
            this.rectF = new RectF();
            this.rect = new Rect();
        }

        private class ProfileSpan extends ClickableSpan {
            private TLRPC.User user;

            public ProfileSpan(TLRPC.User user) {
                this.user = user;
            }

            @Override
            public void onClick(View view) {
                if (ChatMessageCell.this.delegate != null) {
                    ChatMessageCell.this.delegate.didPressUserAvatar(ChatMessageCell.this, this.user, 0.0f, 0.0f, false);
                }
            }
        }

        private RichMessageLayout.RichBlock resolveRichElement(int i, int[] iArr) {
            int i2;
            if (ChatMessageCell.this.currentMessageObject == null || ChatMessageCell.this.currentMessageObject.richLayout == null || i - 6000 < 0) {
                return null;
            }
            RichMessageLayout richMessageLayout = ChatMessageCell.this.currentMessageObject.richLayout;
            int i3 = 0;
            for (int i4 = 0; i4 < richMessageLayout.blocks.size(); i4++) {
                RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i4);
                if (richBlock.isVisible()) {
                    int accessibilityElementCount = richBlock.getAccessibilityElementCount() + i3;
                    if (i2 < accessibilityElementCount) {
                        iArr[0] = i2 - i3;
                        return richBlock;
                    }
                    i3 = accessibilityElementCount;
                }
            }
            return null;
        }

        @Override
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r27) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.MessageAccessibilityNodeProvider.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
        }

        public static int lambda$createAccessibilityNodeInfo$0(Spanned spanned, CodeHighlighting.Span span, CodeHighlighting.Span span2) {
            return spanned.getSpanStart(span2) - spanned.getSpanStart(span);
        }

        @Override
        public boolean performAction(int r10, int r11, android.os.Bundle r12) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.MessageAccessibilityNodeProvider.performAction(int, int, android.os.Bundle):boolean");
        }

        private ClickableSpan getLinkById(int i, boolean z) {
            if (i == 5000) {
                return null;
            }
            if (z) {
                int i2 = i - 3000;
                if (!(ChatMessageCell.this.currentMessageObject.caption instanceof Spannable) || i2 < 0) {
                    return null;
                }
                Spannable spannable = (Spannable) ChatMessageCell.this.currentMessageObject.caption;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
                if (clickableSpanArr.length <= i2) {
                    return null;
                }
                return clickableSpanArr[i2];
            }
            int i3 = i - 2000;
            if (!(ChatMessageCell.this.currentMessageObject.messageText instanceof Spannable) || i3 < 0) {
                return null;
            }
            Spannable spannable2 = (Spannable) ChatMessageCell.this.currentMessageObject.messageText;
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
            if (clickableSpanArr2.length <= i3) {
                return null;
            }
            return clickableSpanArr2[i3];
        }
    }

    public void setImageCoords(RectF rectF) {
        setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public void setImageCoords(float f, float f2, float f3, float f4) {
        this.photoImage.setImageCoords(f, f2, f3, f4);
        int i = this.documentAttachType;
        if (i == 4 || i == 2) {
            this.videoButtonX = (int) (this.photoImage.getImageX() + AndroidUtilities.dp(8.0f));
            int imageY = (int) (this.photoImage.getImageY() + AndroidUtilities.dp(8.0f));
            this.videoButtonY = imageY;
            RadialProgress2 radialProgress2 = this.videoRadialProgress;
            int i2 = this.videoButtonX;
            radialProgress2.setProgressRect(i2, imageY, AndroidUtilities.dp(24.0f) + i2, this.videoButtonY + AndroidUtilities.dp(24.0f));
            this.buttonX = (int) (f + ((this.photoImage.getImageWidth() - AndroidUtilities.dp(48.0f)) / 2.0f));
            int imageY2 = (int) (this.photoImage.getImageY() + ((this.photoImage.getImageHeight() - AndroidUtilities.dp(48.0f)) / 2.0f));
            this.buttonY = imageY2;
            RadialProgress2 radialProgress22 = this.radialProgress;
            int i3 = this.buttonX;
            radialProgress22.setProgressRect(i3, imageY2, AndroidUtilities.dp(48.0f) + i3, this.buttonY + AndroidUtilities.dp(48.0f));
        }
    }

    @Override
    public float getAlpha() {
        if (this.ALPHA_PROPERTY_WORKAROUND) {
            return this.alphaInternal;
        }
        return super.getAlpha();
    }

    @Override
    public void setAlpha(float f) {
        if ((f == 1.0f) != (getAlpha() == 1.0f)) {
            invalidate();
        }
        if (this.ALPHA_PROPERTY_WORKAROUND) {
            this.alphaInternal = f;
            invalidate();
        } else {
            super.setAlpha(f);
        }
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if ((groupedMessagePosition != null && (groupedMessagePosition.minY != 0 || groupedMessagePosition.minX != 0)) || ((this.enterTransitionInProgress && !this.currentMessageObject.isVoice()) || this.replyNameLayout == null || this.replyTextLayout == null)) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.currentPosition;
            if (groupedMessagePosition2 != null) {
                int i = groupedMessagePosition2.flags;
                if ((i & 8) == 0 || (i & 1) == 0) {
                    return;
                }
            }
            if (this.reactionsLayoutInBubble.isSmall) {
                return;
            }
        }
        invalidate();
    }

    public int getCurrentBackgroundLeft() {
        MessageDrawable messageDrawable = this.currentBackgroundDrawable;
        if (messageDrawable == null) {
            return 0;
        }
        int i = messageDrawable.getBounds().left;
        if (this.currentMessageObject.isOutOwner() || this.transitionParams.changePinnedBottomProgress == 1.0f) {
            return i;
        }
        boolean z = this.isRoundVideo;
        if ((!z && this.mediaBackground) || this.drawPinnedBottom) {
            return i;
        }
        if (z) {
            return (int) (i - (AndroidUtilities.dp(6.0f) * getVideoTranscriptionProgress()));
        }
        return i - AndroidUtilities.dp(6.0f);
    }

    public int getCurrentBackgroundRight() {
        MessageDrawable messageDrawable = this.currentBackgroundDrawable;
        if (messageDrawable == null) {
            return getWidth();
        }
        int i = messageDrawable.getBounds().right;
        if (!this.currentMessageObject.isOutOwner() || this.transitionParams.changePinnedBottomProgress == 1.0f) {
            return i;
        }
        boolean z = this.isRoundVideo;
        if ((!z && this.mediaBackground) || this.drawPinnedBottom) {
            return i;
        }
        if (z) {
            return (int) (i + (AndroidUtilities.dp(6.0f) * getVideoTranscriptionProgress()));
        }
        return i + AndroidUtilities.dp(6.0f);
    }

    public float getPaddingTopAnimated() {
        return getTopicSeparatorTopPadding() + this.starsPriceTopPadding + this.suggestionOfferTopPadding;
    }

    public TransitionParams getTransitionParams() {
        return this.transitionParams;
    }

    public float getDeltaTop() {
        return this.transitionParams.deltaTop;
    }

    public float getDeltaLeft() {
        return this.transitionParams.deltaLeft;
    }

    public float getDeltaRight() {
        return this.transitionParams.deltaRight;
    }

    @Override
    public float getDeltaBottom() {
        return this.transitionParams.deltaBottom;
    }

    public int getTopMediaOffset() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.type != 14) {
            return 0;
        }
        return this.mediaOffsetY + this.namesOffset;
    }

    public int getMediaOffsetY() {
        if (!this.transitionParams.animateMediaOffsetY) {
            return this.mediaOffsetY;
        }
        return AndroidUtilities.lerp(this.transitionParams.animateFromMediaOffsetY, this.mediaOffsetY, this.transitionParams.animateChangeProgress);
    }

    public int getTextX() {
        return this.textX;
    }

    public int getTextY() {
        return this.textY;
    }

    public boolean isPlayingRound() {
        return this.isRoundVideo && this.isPlayingRound;
    }

    public int getParentWidth() {
        int i;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            messageObject = this.messageObjectToSet;
        }
        return (messageObject == null || !messageObject.preview || (i = this.parentWidth) <= 0) ? AndroidUtilities.displaySize.x : i;
    }

    public class TransitionParams {
        public boolean animateBackgroundBoundsInner;
        public boolean animateBackgroundWidth;
        boolean animateBotButtonsChanged;
        public boolean animateBottomActionPadding;
        public int animateBottomActionPaddingFrom;
        public boolean animateBottomActionText;
        private boolean animateButton;
        public boolean animateChange;
        private int animateCommentArrowX;
        private boolean animateCommentDrawUnread;
        private int animateCommentUnreadX;
        private float animateCommentX;
        private boolean animateComments;
        private StaticLayout animateCommentsLayout;
        public boolean animateDrawAvatar;
        public boolean animateDrawBackground;
        private boolean animateDrawCommentNumber;
        public boolean animateDrawNameLayout;
        public boolean animateDrawTopic;
        public boolean animateDrawingSideMenuEnabled;
        public boolean animateDrawingTimeAlpha;
        private boolean animateEditedEnter;
        private StaticLayout animateEditedLayout;
        private int animateEditedWidthDiff;
        public boolean animateExpandedExplanation;
        public boolean animateExpandedQuotes;
        public HashSet animateExpandedQuotesFrom;
        public boolean animateFactCheck;
        public boolean animateFactCheckExpanded;
        public boolean animateFactCheckHeight;
        public int animateFactCheckHeightFrom;
        int animateForwardNameWidth;
        float animateForwardNameX;
        public boolean animateForwardedLayout;
        public int animateForwardedNamesOffset;
        private float animateFromButtonX;
        private float animateFromButtonY;
        public int animateFromLinkPreviewHeight;
        public int animateFromLinkPreviewY;
        private int animateFromMediaOffsetY;
        public boolean animateFromRecommendationsExpanded;
        private float animateFromReplyTextHeight;
        public float animateFromReplyY;
        public float animateFromRoundVideoDotY;
        public float animateFromTextY;
        public int animateFromTimeX;
        public float animateFromTimeXPinned;
        private float animateFromTimeXReplies;
        private float animateFromTimeXViews;
        public int animateFromWidthForButton;
        public boolean animateLinkAbove;
        public boolean animateLinkPreviewHeight;
        public boolean animateLinkPreviewY;
        public boolean animateLocationIsExpired;
        public boolean animateMediaAbove;
        private boolean animateMediaOffsetY;
        public boolean animateMessageText;
        public boolean animateMonoforumPadding;
        public int animateMonoforumPaddingFrom;
        private float animateNameX;
        public boolean animateNamesOffset;
        public int animateNamesOffsetFrom;
        private AnimatedEmojiSpan.EmojiGroupedSpans animateOutAnimateEmoji;
        private AnimatedEmojiSpan.EmojiGroupedSpans animateOutAnimateEmojiReply;
        private MessageObject.TextLayoutBlocks animateOutCaptionLayout;
        private RichMessageLayout animateOutRichLayout;
        private ArrayList animateOutTextBlocks;
        private float animateOutTextXOffset;
        private boolean animatePinned;
        public boolean animatePlayingRound;
        public boolean animatePollAddOptionHeight;
        public int animatePollAddOptionHeightFrom;
        public boolean animateRadius;
        public boolean animateRecommendationsExpanded;
        boolean animateReplaceCaptionLayout;
        private boolean animateReplies;
        private StaticLayout animateRepliesLayout;
        private StaticLayout animateReplyTextLayout;
        public float animateReplyTextOffset;
        public boolean animateReplyY;
        public boolean animateRichLayout;
        public boolean animateRoundVideoDotY;
        private boolean animateShouldDrawMenuDrawable;
        private boolean animateShouldDrawTimeOnMedia;
        private boolean animateSign;
        public boolean animateSmallImage;
        public boolean animateStarsPriceText;
        public boolean animateStarsPriceTopPadding;
        public int animateStarsPriceTopPaddingFrom;
        public boolean animateSummaryReply;
        public boolean animateTextY;
        private StaticLayout animateTimeLayout;
        private int animateTimeWidth;
        public StaticLayout animateTitleLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans animateTitleLayoutEmoji;
        public float animateToImageH;
        public float animateToImageW;
        public float animateToImageX;
        public float animateToImageY;
        public int[] animateToRadius;
        private int animateTotalCommentWidth;
        public boolean animateUseTranscribeButton;
        private StaticLayout animateViewsLayout;
        public boolean animateWidthForButton;
        public float captionFromX;
        public float captionFromY;
        public float deltaBottom;
        public float deltaLeft;
        public float deltaRight;
        public float deltaTop;
        public boolean drawPinnedBottomBackground;
        public boolean expandedExplanationFrom;
        public boolean ignoreAlpha;
        public boolean imageChangeBoundsTransition;
        public int lastBackgroundLeft;
        public int lastBackgroundRight;
        public float lastButtonX;
        public float lastButtonY;
        public int lastCommentArrowX;
        public boolean lastCommentDrawUnread;
        public StaticLayout lastCommentLayout;
        public int lastCommentUnreadX;
        public float lastCommentX;
        public int lastCommentsCount;
        public boolean lastDrawAvatar;
        public boolean lastDrawBackground;
        public boolean lastDrawCommentNumber;
        public StaticLayout lastDrawDocTitleLayout;
        public StaticLayout lastDrawInfoLayout;
        public float lastDrawLocationExpireProgress;
        public String lastDrawLocationExpireText;
        public boolean lastDrawNameLayout;
        public float lastDrawReplyY;
        public float lastDrawRoundVideoDotY;
        public boolean lastDrawTime;
        public boolean lastDrawTopic;
        public MessageObject.TextLayoutBlocks lastDrawingCaptionLayout;
        public float lastDrawingCaptionX;
        public float lastDrawingCaptionY;
        public boolean lastDrawingEdited;
        public boolean lastDrawingExpandedExplanation;
        public HashSet lastDrawingExpandedQuotes;
        public boolean lastDrawingFactCheck;
        public boolean lastDrawingFactCheckExpanded;
        public int lastDrawingFactCheckHeight;
        public float lastDrawingImageH;
        public float lastDrawingImageW;
        public float lastDrawingImageX;
        public float lastDrawingImageY;
        public boolean lastDrawingLinkAbove;
        public int lastDrawingLinkPreviewHeight;
        public int lastDrawingLinkPreviewY;
        public boolean lastDrawingMediaAbove;
        public int lastDrawingPollAddOptionHeight;
        public boolean lastDrawingRecommendationsExpanded;
        public float lastDrawingReplyTextHeight;
        public RichMessageLayout lastDrawingRichLayout;
        public boolean lastDrawingSideMenuEnabled;
        public boolean lastDrawingSmallImage;
        public boolean lastDrawingSummarized;
        public boolean lastDrawingSummaryReply;
        public ArrayList lastDrawingTextBlocks;
        private int lastDrawingTextWidth;
        public float lastDrawingTextX;
        public float lastDrawingTextY;
        public int lastDrawnBottomActionPadding;
        public boolean lastDrawnBottomActionText;
        public boolean lastDrawnForwardedName;
        public int lastDrawnMonoforumPadding;
        public StaticLayout lastDrawnReplyTextLayout;
        public boolean lastDrawnStarsPriceText;
        public int lastDrawnStarsPriceTopPadding;
        public StaticLayout lastDrawnTitleLayout;
        public boolean lastDrawnTranslated;
        public int lastDrawnWidthForButtons;
        public int lastForwardNameWidth;
        public float lastForwardNameX;
        public int lastForwardedNamesOffset;
        public boolean lastIsPinned;
        public boolean lastIsPlayingRound;
        public boolean lastLocatinIsExpired;
        public int lastMediaOffsetY;
        public int lastNamesOffset;
        public int lastRepliesCount;
        public StaticLayout lastRepliesLayout;
        public int lastReplyTextXOffset;
        public boolean lastShouldDrawMenuDrawable;
        public boolean lastShouldDrawTimeOnMedia;
        public String lastSignMessage;
        public float lastTextXOffset;
        public StaticLayout lastTimeLayout;
        public int lastTimeWidth;
        public int lastTimeX;
        public float lastTimeXPinned;
        private float lastTimeXReplies;
        private float lastTimeXViews;
        public int lastTopOffset;
        public int lastTotalCommentWidth;
        public boolean lastUseTranscribeButton;
        public int lastViewsCount;
        public StaticLayout lastViewsLayout;
        public boolean messageEntering;
        private boolean moveCaption;
        public boolean needsStopClipping;
        public float photoImageFromCenterX;
        public float photoImageFromCenterY;
        public float photoImageFromHeight;
        public float photoImageFromWidth;
        public boolean shouldAnimateTimeX;
        public float toDeltaLeft;
        public float toDeltaRight;
        public boolean transformGroupToSingleMessage;
        public boolean updatePhotoImageX;
        public boolean wasDraw;
        public int[] imageRoundRadius = new int[4];
        public float captionEnterProgress = 1.0f;
        public float changePinnedBottomProgress = 1.0f;
        public Rect lastDrawingBackgroundRect = new Rect();
        public float animateChangeProgress = 1.0f;
        private ArrayList lastDrawBotButtons = new ArrayList();
        private ArrayList transitionBotButtons = new ArrayList();
        public int lastStatusDrawableParams = -1;
        public StaticLayout[] lastDrawnForwardedNameLayout = new StaticLayout[2];
        public StaticLayout[] animatingForwardedNameLayout = new StaticLayout[2];

        public boolean supportChangeAnimation() {
            return true;
        }

        public TransitionParams() {
        }

        public void recordDrawingState() {
            ChannelRecommendationsCell channelRecommendationsCell;
            this.wasDraw = true;
            this.lastDrawingImageX = ChatMessageCell.this.photoImage.getImageX();
            this.lastDrawingImageY = ChatMessageCell.this.photoImage.getImageY();
            this.lastDrawingImageW = ChatMessageCell.this.photoImage.getImageWidth();
            this.lastDrawingImageH = ChatMessageCell.this.photoImage.getImageHeight();
            System.arraycopy(ChatMessageCell.this.photoImage.getRoundRadius(), 0, this.imageRoundRadius, 0, 4);
            MessageDrawable messageDrawable = ChatMessageCell.this.currentBackgroundDrawable;
            if (messageDrawable != null) {
                this.lastDrawingBackgroundRect.set(messageDrawable.getBounds());
            }
            ChatMessageCell chatMessageCell = ChatMessageCell.this;
            this.lastDrawingSideMenuEnabled = chatMessageCell.isSideMenuEnabled;
            this.lastDrawingTextBlocks = chatMessageCell.currentMessageObject != null ? ChatMessageCell.this.currentMessageObject.textLayoutBlocks : null;
            this.lastDrawingTextWidth = ChatMessageCell.this.currentMessageObject != null ? ChatMessageCell.this.currentMessageObject.textWidth : 0;
            this.lastDrawingEdited = ChatMessageCell.this.edited;
            this.lastDrawingRichLayout = ChatMessageCell.this.currentMessageObject != null ? ChatMessageCell.this.currentMessageObject.richLayout : null;
            this.lastDrawingCaptionX = ChatMessageCell.this.captionX;
            ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
            this.lastDrawingCaptionY = chatMessageCell2.captionY;
            this.lastDrawingCaptionLayout = chatMessageCell2.captionLayout;
            this.lastDrawingSummarized = chatMessageCell2.currentMessageObject != null ? ChatMessageCell.this.currentMessageObject.summarized : false;
            this.lastDrawBotButtons.clear();
            if (!ChatMessageCell.this.botButtons.isEmpty()) {
                this.lastDrawBotButtons.addAll(ChatMessageCell.this.botButtons);
            }
            this.lastDrawingSmallImage = ChatMessageCell.this.isSmallImage;
            ChatMessageCell chatMessageCell3 = ChatMessageCell.this;
            this.lastDrawnMonoforumPadding = chatMessageCell3.topicSeparatorTopPadding;
            this.lastDrawnStarsPriceTopPadding = chatMessageCell3.starsPriceTopPadding;
            this.lastDrawnBottomActionPadding = chatMessageCell3.bottomActionPadding;
            this.lastDrawnStarsPriceText = chatMessageCell3.starsPriceText != null;
            this.lastDrawnBottomActionText = ChatMessageCell.this.bottomActionText != null;
            ChatMessageCell chatMessageCell4 = ChatMessageCell.this;
            this.lastDrawingLinkPreviewHeight = chatMessageCell4.linkPreviewHeight;
            this.lastDrawingLinkAbove = chatMessageCell4.linkPreviewAbove;
            this.lastDrawingMediaAbove = chatMessageCell4.captionAbove;
            this.lastDrawingRecommendationsExpanded = chatMessageCell4.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.type == 27 && (channelRecommendationsCell = ChatMessageCell.this.channelRecommendationsCell) != null && channelRecommendationsCell.isExpanded();
            if (ChatMessageCell.this.commentLayout != null) {
                this.lastCommentsCount = ChatMessageCell.this.getRepliesCount();
                this.lastTotalCommentWidth = ChatMessageCell.this.totalCommentWidth;
                this.lastCommentLayout = ChatMessageCell.this.commentLayout;
                this.lastCommentArrowX = ChatMessageCell.this.commentArrowX;
                this.lastCommentUnreadX = ChatMessageCell.this.commentUnreadX;
                this.lastCommentDrawUnread = ChatMessageCell.this.commentDrawUnread;
                this.lastCommentX = ChatMessageCell.this.commentX;
                this.lastDrawCommentNumber = ChatMessageCell.this.drawCommentNumber;
            }
            this.lastRepliesCount = ChatMessageCell.this.getRepliesCount();
            this.lastViewsCount = ChatMessageCell.this.getMessageObject().messageOwner.views;
            this.lastRepliesLayout = ChatMessageCell.this.repliesLayout;
            this.lastViewsLayout = ChatMessageCell.this.viewsLayout;
            ChatMessageCell chatMessageCell5 = ChatMessageCell.this;
            this.lastIsPinned = chatMessageCell5.isPinned;
            this.lastSignMessage = chatMessageCell5.lastPostAuthor;
            this.lastDrawBackground = ChatMessageCell.this.drawBackground;
            this.lastUseTranscribeButton = ChatMessageCell.this.useTranscribeButton;
            this.lastButtonX = ChatMessageCell.this.buttonX;
            this.lastButtonY = ChatMessageCell.this.buttonY;
            this.lastMediaOffsetY = ChatMessageCell.this.mediaOffsetY;
            this.lastDrawTime = !ChatMessageCell.this.forceNotDrawTime;
            ChatMessageCell chatMessageCell6 = ChatMessageCell.this;
            this.lastTimeX = chatMessageCell6.timeX;
            this.lastTimeLayout = chatMessageCell6.timeLayout;
            this.lastTimeWidth = chatMessageCell6.timeWidth;
            this.lastShouldDrawTimeOnMedia = chatMessageCell6.shouldDrawTimeOnMedia();
            this.lastTopOffset = ChatMessageCell.this.getTopMediaOffset();
            this.lastShouldDrawMenuDrawable = ChatMessageCell.this.shouldDrawMenuDrawable();
            this.lastLocatinIsExpired = ChatMessageCell.this.locationExpired;
            this.lastIsPlayingRound = ChatMessageCell.this.isPlayingRound;
            ChatMessageCell chatMessageCell7 = ChatMessageCell.this;
            this.lastDrawingTextY = chatMessageCell7.textY;
            this.lastDrawingTextX = chatMessageCell7.textX;
            this.lastDrawingLinkPreviewY = chatMessageCell7.linkPreviewY;
            this.lastDrawnWidthForButtons = ChatMessageCell.this.widthForButtons;
            this.lastDrawnForwardedNameLayout[0] = ChatMessageCell.this.forwardedNameLayout[0];
            this.lastDrawnForwardedNameLayout[1] = ChatMessageCell.this.forwardedNameLayout[1];
            this.lastDrawnForwardedName = ChatMessageCell.this.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.needDrawForwarded();
            this.lastForwardNameX = ChatMessageCell.this.forwardNameX;
            ChatMessageCell chatMessageCell8 = ChatMessageCell.this;
            int i = chatMessageCell8.namesOffset;
            this.lastForwardedNamesOffset = i;
            this.lastNamesOffset = i;
            this.lastForwardNameWidth = chatMessageCell8.forwardedNameWidth;
            this.lastBackgroundLeft = ChatMessageCell.this.getCurrentBackgroundLeft();
            MessageDrawable messageDrawable2 = ChatMessageCell.this.currentBackgroundDrawable;
            if (messageDrawable2 != null) {
                this.lastBackgroundRight = messageDrawable2.getBounds().right;
            }
            this.lastTextXOffset = ChatMessageCell.this.currentMessageObject != null ? ChatMessageCell.this.currentMessageObject.textXOffset : 0.0f;
            this.lastDrawingReplyTextHeight = ChatMessageCell.this.replyTextHeight;
            ChatMessageCell chatMessageCell9 = ChatMessageCell.this;
            this.lastDrawnReplyTextLayout = chatMessageCell9.replyTextLayout;
            this.lastReplyTextXOffset = chatMessageCell9.replyTextOffset;
            chatMessageCell9.reactionsLayoutInBubble.recordDrawingState();
            ChatMessageCell chatMessageCell10 = ChatMessageCell.this;
            if (chatMessageCell10.replyNameLayout != null) {
                this.lastDrawReplyY = chatMessageCell10.replyStartY;
            } else {
                this.lastDrawReplyY = 0.0f;
            }
            this.lastDrawNameLayout = chatMessageCell10.drawNameLayout;
            this.lastDrawAvatar = ChatMessageCell.this.drawNameAvatar;
            this.lastDrawTopic = ChatMessageCell.this.drawTopic;
            this.lastDrawingFactCheckHeight = ChatMessageCell.this.factCheckHeight;
            this.lastDrawingFactCheckExpanded = ChatMessageCell.this.getPrimaryMessageObject() != null && ChatMessageCell.this.getPrimaryMessageObject().factCheckExpanded;
            this.lastDrawingFactCheck = ChatMessageCell.this.hasFactCheck;
            this.lastDrawingPollAddOptionHeight = ChatMessageCell.this.pollAddButtonHeight;
            ChatMessageCell chatMessageCell11 = ChatMessageCell.this;
            this.lastDrawingSummaryReply = chatMessageCell11.drawSummaryReply;
            this.lastDrawingExpandedQuotes = chatMessageCell11.getPrimaryMessageObject() != null ? ChatMessageCell.this.getPrimaryMessageObject().expandedQuotes : null;
            this.lastDrawingExpandedExplanation = ChatMessageCell.this.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.expandedExplanation;
            this.lastDrawnTranslated = ChatMessageCell.this.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.translated;
            this.lastDrawnTitleLayout = ChatMessageCell.this.titleLayout;
        }

        public void recordDrawingStatePreview() {
            this.lastDrawnForwardedNameLayout[0] = ChatMessageCell.this.forwardedNameLayout[0];
            this.lastDrawnForwardedNameLayout[1] = ChatMessageCell.this.forwardedNameLayout[1];
            this.lastDrawnForwardedName = ChatMessageCell.this.currentMessageObject.needDrawForwarded();
            this.lastForwardNameX = ChatMessageCell.this.forwardNameX;
            ChatMessageCell chatMessageCell = ChatMessageCell.this;
            int i = chatMessageCell.namesOffset;
            this.lastForwardedNamesOffset = i;
            this.lastNamesOffset = i;
            this.lastForwardNameWidth = chatMessageCell.forwardedNameWidth;
        }

        public boolean animateChange() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.TransitionParams.animateChange():boolean");
        }

        public void onDetach() {
            this.wasDraw = false;
        }

        public void resetAnimation() {
            this.animateChange = false;
            this.animatePinned = false;
            this.animateBackgroundBoundsInner = false;
            this.animateBackgroundWidth = false;
            this.deltaLeft = 0.0f;
            this.deltaRight = 0.0f;
            this.deltaBottom = 0.0f;
            this.deltaTop = 0.0f;
            this.toDeltaLeft = 0.0f;
            this.toDeltaRight = 0.0f;
            if (this.imageChangeBoundsTransition && this.animateToImageW != 0.0f && this.animateToImageH != 0.0f) {
                ChatMessageCell.this.photoImage.setImageCoords(this.animateToImageX, this.animateToImageY, this.animateToImageW, this.animateToImageH);
            }
            if (this.animateRadius) {
                ChatMessageCell.this.photoImage.setRoundRadius(this.animateToRadius);
            }
            this.animateToImageX = 0.0f;
            this.animateToImageY = 0.0f;
            this.animateToImageW = 0.0f;
            this.animateToImageH = 0.0f;
            this.imageChangeBoundsTransition = false;
            this.changePinnedBottomProgress = 1.0f;
            this.captionEnterProgress = 1.0f;
            this.animateRadius = false;
            this.animateChangeProgress = 1.0f;
            this.animateMessageText = false;
            this.animateRichLayout = false;
            this.animateDrawingSideMenuEnabled = false;
            this.animateDrawNameLayout = false;
            this.animateDrawAvatar = false;
            this.animateDrawTopic = false;
            this.animateOutTextBlocks = null;
            RichMessageLayout richMessageLayout = this.animateOutRichLayout;
            if (richMessageLayout != null) {
                richMessageLayout.detach(ChatMessageCell.this);
            }
            this.animateOutRichLayout = null;
            this.animateEditedLayout = null;
            this.animateTimeLayout = null;
            this.animateEditedEnter = false;
            this.animateReplaceCaptionLayout = false;
            this.transformGroupToSingleMessage = false;
            this.animateOutCaptionLayout = null;
            AnimatedEmojiSpan.release(ChatMessageCell.this, this.animateOutAnimateEmoji);
            this.animateOutAnimateEmoji = null;
            this.moveCaption = false;
            this.animateDrawingTimeAlpha = false;
            this.transitionBotButtons.clear();
            this.animateButton = false;
            this.animateBotButtonsChanged = false;
            this.animateWidthForButton = false;
            this.animateMediaOffsetY = false;
            this.animateReplyTextLayout = null;
            this.animateReplies = false;
            this.animateRepliesLayout = null;
            this.animateComments = false;
            this.animateCommentsLayout = null;
            this.animateViewsLayout = null;
            this.animateShouldDrawTimeOnMedia = false;
            this.animateShouldDrawMenuDrawable = false;
            this.shouldAnimateTimeX = false;
            this.animateDrawBackground = false;
            this.animateSign = false;
            this.animateSmallImage = false;
            this.animateMonoforumPadding = false;
            this.animateStarsPriceTopPadding = false;
            this.animateStarsPriceText = false;
            this.animateBottomActionText = false;
            this.animateBottomActionPadding = false;
            this.needsStopClipping = false;
            this.animateLinkAbove = false;
            this.animateMediaAbove = false;
            this.animateRecommendationsExpanded = false;
            this.animateDrawingTimeAlpha = false;
            this.animateLocationIsExpired = false;
            this.animatePlayingRound = false;
            this.animateTextY = false;
            this.animateLinkPreviewY = false;
            this.animateFactCheckHeight = false;
            this.animateFactCheckExpanded = false;
            this.animateExpandedQuotes = false;
            this.animateExpandedExplanation = false;
            this.animateFactCheck = false;
            this.animateSummaryReply = false;
            this.animateForwardedLayout = false;
            this.animateNamesOffset = false;
            StaticLayout[] staticLayoutArr = this.animatingForwardedNameLayout;
            staticLayoutArr[0] = null;
            staticLayoutArr[1] = null;
            this.animateRoundVideoDotY = false;
            this.animateReplyY = false;
            ChatMessageCell.this.reactionsLayoutInBubble.resetAnimation();
            this.animateTitleLayout = null;
            AnimatedEmojiSpan.release(ChatMessageCell.this, this.animateTitleLayoutEmoji);
        }

        public int createStatusDrawableParams() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.TransitionParams.createStatusDrawableParams():int");
        }
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private Drawable getThemedDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : Theme.getThemeDrawable(str);
    }

    public Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService();
    }

    private ColorMatrixColorFilter getFancyBlurFilter() {
        if (this.fancyBlurFilter == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
            this.fancyBlurFilter = new ColorMatrixColorFilter(colorMatrix);
        }
        return this.fancyBlurFilter;
    }

    public int getNameStatusX() {
        return (int) (this.nameX + this.nameOffsetX + (this.viaNameWidth > 0 ? r1 - AndroidUtilities.dp(32.0f) : this.nameLayoutWidth) + AndroidUtilities.dp(2.0f) + (AndroidUtilities.dp(20.0f) / 2));
    }

    public int getNameStatusY() {
        return (int) (this.nameY + ((this.nameLayout == null ? 0 : r1.getHeight()) / 2));
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
        ChannelRecommendationsCell channelRecommendationsCell = this.channelRecommendationsCell;
        if (channelRecommendationsCell != null) {
            channelRecommendationsCell.computeScroll();
        }
    }

    private ColorFilter getAdaptiveEmojiColorFilter(int i, int i2) {
        if (this.adaptiveEmojiColorFilter == null) {
            this.adaptiveEmojiColor = new int[3];
            this.adaptiveEmojiColorFilter = new ColorFilter[3];
        }
        if (i2 != this.adaptiveEmojiColor[i] || this.adaptiveEmojiColorFilter[i] == null) {
            ColorFilter[] colorFilterArr = this.adaptiveEmojiColorFilter;
            this.adaptiveEmojiColor[i] = i2;
            colorFilterArr[i] = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
        return this.adaptiveEmojiColorFilter[i];
    }

    public boolean needDrawAvatar() {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessageObject messageObject3;
        return (this.isChat && !this.isSavedPreviewChat && ((!this.isThreadPost || this.isForum) && (messageObject3 = this.currentMessageObject) != null && !messageObject3.isOutOwner() && this.currentMessageObject.needDrawAvatar())) || ((messageObject = this.currentMessageObject) != null && messageObject.getDialogId() == 489000) || (((messageObject2 = this.currentMessageObject) != null && messageObject2.forceAvatar) || !(messageObject2 == null || messageObject2.messageOwner.guestchat_via_from == null));
    }

    protected boolean drawPhotoImage(Canvas canvas) {
        AnimatedFileDrawable animation;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.isLivePhoto() && (animation = this.photoImage.getAnimation()) != null && animation.getDurationMs() > 0) {
            float fClamp01 = 1.0f - Utilities.clamp01(((animation.getDurationMs() - 90) - animation.getCurrentProgressMs()) / 500.0f);
            if (fClamp01 > 0.0f) {
                boolean zDraw = fClamp01 < 1.0f ? this.photoImage.draw(canvas) : true;
                this.photoImage.setForceNotMedia(true);
                float alpha = this.photoImage.getAlpha();
                this.photoImage.setAlpha(fClamp01 * alpha);
                this.photoImage.draw(canvas);
                this.photoImage.setAlpha(alpha);
                this.photoImage.setForceNotMedia(false);
                return zDraw;
            }
        }
        return this.photoImage.draw(canvas);
    }

    public boolean areTags() {
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject primaryMessageObject = getPrimaryMessageObject();
        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
            return false;
        }
        return tL_messageReactions.reactions_as_tags;
    }

    public String getFilename() {
        int i;
        int i2;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return null;
        }
        int i3 = messageObject.type;
        if (i3 == 1) {
            TLRPC.PhotoSize photoSize = this.currentPhotoObject;
            if (photoSize == null) {
                return null;
            }
            return FileLoader.getAttachFileName(photoSize);
        }
        if (i3 == 8 || (i2 = this.documentAttachType) == 7 || i2 == 4 || i2 == 8 || i3 == 9 || i2 == 3 || i2 == 5) {
            if (messageObject.useCustomPhoto) {
                return null;
            }
            if (messageObject.attachPathExists && !TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                return this.currentMessageObject.messageOwner.attachPath;
            }
            if (!this.currentMessageObject.isSendError() || (i = this.documentAttachType) == 3 || i == 5) {
                return this.currentMessageObject.getFileName();
            }
        } else {
            if (i2 != 0) {
                return FileLoader.getAttachFileName(this.documentAttach);
            }
            TLRPC.PhotoSize photoSize2 = this.currentPhotoObject;
            if (photoSize2 != null) {
                return FileLoader.getAttachFileName(photoSize2);
            }
        }
        return null;
    }

    public boolean checkLoadCaughtPremiumFloodWait() {
        return FileLoader.getInstance(this.currentAccount).checkLoadCaughtPremiumFloodWait(getFilename());
    }

    public boolean checkUploadCaughtPremiumFloodWait() {
        return FileLoader.getInstance(this.currentAccount).checkUploadCaughtPremiumFloodWait(getFilename());
    }

    public TLRPC.TL_availableEffect getEffect() {
        MessageObject messageObject;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if ((groupedMessagePosition == null || groupedMessagePosition.last) && (messageObject = this.currentMessageObject) != null) {
            return messageObject.getEffect();
        }
        return null;
    }

    private int layoutFactCheck(int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.layoutFactCheck(int):int");
    }

    public int getWidthForButtons() {
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateWidthForButton) {
            return AndroidUtilities.lerp(transitionParams.animateFromWidthForButton, this.widthForButtons, transitionParams.animateChangeProgress);
        }
        return this.widthForButtons;
    }

    public void drawVideoTimestamps(Canvas canvas, int i) {
        float videoSavedProgress;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.isLivePhoto() || this.controlsAlpha <= 0.0f || !this.photoImage.getVisible()) {
            return;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (!messageObject2.openedInViewer && messageObject2.getVideoStartsTimestamp() != -1) {
            videoSavedProgress = this.currentMessageObject.getVideoStartsTimestamp() / ((float) this.currentMessageObject.getDuration());
        } else {
            videoSavedProgress = this.currentMessageObject.getVideoSavedProgress();
        }
        float fClamp01 = Utilities.clamp01(videoSavedProgress);
        if (fClamp01 > 0.0f) {
            int[] roundRadius = this.photoImage.getRoundRadius();
            canvas.save();
            if (roundRadius[0] <= 0 && roundRadius[1] <= 0 && roundRadius[2] <= 0 && roundRadius[3] <= 0) {
                canvas.clipRect(this.photoImage.getImageX(), this.photoImage.getImageY(), this.photoImage.getImageX2(), this.photoImage.getImageY2());
            } else {
                if (this.photoImageClipPath == null) {
                    this.photoImageClipPath = new Path();
                    this.photoImageClipPathRadii = new float[8];
                }
                float[] fArr = this.photoImageClipPathRadii;
                float fMax = Math.max(0, roundRadius[0]);
                fArr[1] = fMax;
                fArr[0] = fMax;
                float[] fArr2 = this.photoImageClipPathRadii;
                float fMax2 = Math.max(0, roundRadius[1]);
                fArr2[3] = fMax2;
                fArr2[2] = fMax2;
                float[] fArr3 = this.photoImageClipPathRadii;
                float fMax3 = Math.max(0, roundRadius[2]);
                fArr3[5] = fMax3;
                fArr3[4] = fMax3;
                float[] fArr4 = this.photoImageClipPathRadii;
                float fMax4 = Math.max(0, roundRadius[3]);
                fArr4[7] = fMax4;
                fArr4[6] = fMax4;
                this.photoImageClipPath.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.photoImage.getImageX(), this.photoImage.getImageY(), this.photoImage.getImageX2(), this.photoImage.getImageY2());
                this.photoImageClipPath.addRoundRect(rectF, this.photoImageClipPathRadii, Path.Direction.CW);
                canvas.clipPath(this.photoImageClipPath);
            }
            Theme.chat_videoProgressPaint.setColor(Theme.multAlpha(-1, this.controlsAlpha * 0.35f));
            canvas.drawRect(this.photoImage.getImageX(), this.photoImage.getImageY2() - AndroidUtilities.dp(3.0f), this.photoImage.getImageX2(), this.photoImage.getImageY2(), Theme.chat_videoProgressPaint);
            Theme.chat_videoProgressPaint.setColor(Theme.multAlpha(i, this.controlsAlpha));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.photoImage.getImageX() - AndroidUtilities.dp(2.0f), this.photoImage.getImageY2() - AndroidUtilities.dp(3.0f), this.photoImage.getImageX() + (this.photoImage.getImageWidth() * fClamp01), this.photoImage.getImageY2());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.chat_videoProgressPaint);
            canvas.restore();
        }
    }

    public long getStarsPrice() {
        TLRPC.Message message;
        TLRPC.Message message2;
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null) {
            Iterator<MessageObject> it = groupedMessages.messages.iterator();
            long j = 0;
            while (it.hasNext()) {
                MessageObject next = it.next();
                j += (next == null || (message2 = next.messageOwner) == null) ? 0L : message2.paid_message_stars;
            }
            return j;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return 0L;
        }
        return message.paid_message_stars;
    }

    private int getNameHeight() {
        if (this.drawNameAvatar) {
            if (this.adminLayout == null) {
                return AndroidUtilities.dp(31.0f);
            }
            return AndroidUtilities.dp(37.66f);
        }
        return (int) (AndroidUtilities.dp(5.0f) + Theme.chat_namePaint.getTextSize());
    }

    private float getNameHeightAnimated() {
        float fLerp;
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateDrawAvatar) {
            boolean z = this.drawNameAvatar;
            fLerp = AndroidUtilities.lerp(!z, z, transitionParams.animateChangeProgress);
        } else {
            fLerp = this.drawNameAvatar ? 1.0f : 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f) + Theme.chat_namePaint.getTextSize(), AndroidUtilities.dp(this.adminLayout == null ? 31.0f : 35.0f), fLerp);
    }

    private static boolean isSmallImageLinkPreviewType(String str) {
        return "app".equals(str) || "profile".equals(str) || "article".equals(str) || "telegram_bot".equals(str) || "telegram_user".equals(str) || "telegram_channel".equals(str) || "telegram_channel_direct".equals(str) || "telegram_megagroup".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_aicomposetone".equals(str);
    }

    private static void normalizePollPercents(boolean z, int i, ArrayList arrayList) {
        if (!z || i == 0 || arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ChatMessageCell.lambda$normalizePollPercents$16((ChatMessageCell.PollButton) obj, (ChatMessageCell.PollButton) obj2);
            }
        });
        int size = arrayList.size();
        for (int i2 = 0; i2 < size && i > 0; i2++) {
            PollButton pollButton = (PollButton) arrayList.get(i2);
            if (pollButton.percent > 0) {
                PollButton.access$2412(pollButton, 1);
                i--;
            }
        }
    }

    public static int lambda$normalizePollPercents$16(PollButton pollButton, PollButton pollButton2) {
        if (pollButton.decimal > pollButton2.decimal) {
            return -1;
        }
        if (pollButton.decimal >= pollButton2.decimal && pollButton.percent <= pollButton2.percent) {
            return pollButton.percent < pollButton2.percent ? -1 : 0;
        }
        return 1;
    }

    public boolean getPollAddButtonBounds(Rect rect) {
        PollAddButtonDrawable pollAddButtonDrawable = this.pollAddButtonDrawable;
        if (pollAddButtonDrawable == null || !this.pollAllowAdding) {
            return false;
        }
        rect.set(pollAddButtonDrawable.getBounds());
        return true;
    }

    private static void clearBlurredImage(ImageReceiver imageReceiver) {
        Bitmap bitmap;
        if (imageReceiver == null || (bitmap = imageReceiver.getBitmap()) == null) {
            return;
        }
        bitmap.recycle();
        imageReceiver.setImageBitmap((Bitmap) null);
    }

    private static String getCallMessageText(MessageObject messageObject, boolean z, boolean z2, boolean z3) {
        if (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionConferenceCall) {
            if (messageObject.isOutOwner()) {
                return LocaleController.getString(R.string.ConferenceCallOutgoing);
            }
            if (z) {
                return LocaleController.getString(R.string.ConferenceCallMissed);
            }
            return LocaleController.getString(R.string.ConferenceCallIncoming);
        }
        if (messageObject.isOutOwner()) {
            if (z) {
                if (z3) {
                    return LocaleController.getString(R.string.CallMessageVideoOutgoingMissed);
                }
                return LocaleController.getString(R.string.CallMessageOutgoingMissed);
            }
            if (z3) {
                return LocaleController.getString(R.string.CallMessageVideoOutgoing);
            }
            return LocaleController.getString(R.string.CallMessageOutgoing);
        }
        if (z) {
            if (z3) {
                return LocaleController.getString(R.string.CallMessageVideoIncomingMissed);
            }
            return LocaleController.getString(R.string.CallMessageIncomingMissed);
        }
        if (z2) {
            if (z3) {
                return LocaleController.getString(R.string.CallMessageVideoIncomingDeclined);
            }
            return LocaleController.getString(R.string.CallMessageIncomingDeclined);
        }
        if (z3) {
            return LocaleController.getString(R.string.CallMessageVideoIncoming);
        }
        return LocaleController.getString(R.string.CallMessageIncoming);
    }
}
