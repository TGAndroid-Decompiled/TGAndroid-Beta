package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
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
import android.view.animation.OvershootInterpolator;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatObject;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoPlayerRewinder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageExtendedMedia;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessagePeerReaction;
import org.telegram.tgnet.TLRPC$MessageReplies;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Poll;
import org.telegram.tgnet.TLRPC$PollAnswer;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$ReplyMarkup;
import org.telegram.tgnet.TLRPC$TL_availableEffect;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonBuy;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonCallback;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonGame;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonRequestGeoLocation;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonRequestPeer;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonRow;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonSwitchInline;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonUrl;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonUrlAuth;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonWebView;
import org.telegram.tgnet.TLRPC$TL_messageExtendedMediaPreview;
import org.telegram.tgnet.TLRPC$TL_messageMediaGiveaway;
import org.telegram.tgnet.TLRPC$TL_messageMediaGiveawayResults;
import org.telegram.tgnet.TLRPC$TL_messageReactions;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerColor;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.tgnet.TLRPC$TL_pollAnswerVoters;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.TLRPC$TL_user;
import org.telegram.tgnet.TLRPC$TL_webPage;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedNumberLayout;
import org.telegram.ui.Components.AudioVisualizerDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.Forum.MessageTopicButton;
import org.telegram.ui.Components.ForwardBackground;
import org.telegram.ui.Components.InfiniteProgress;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.MessageBackgroundDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.MsgClockDrawable;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.Premium.boosts.BoostCounterSpan;
import org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayMessageCell;
import org.telegram.ui.Components.Premium.boosts.cells.msg.GiveawayResultsMessageCell;
import org.telegram.ui.Components.QuoteHighlight;
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
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TimerParticles;
import org.telegram.ui.Components.TranscribeButton;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanBrowser;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.VideoForwardDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.GradientClip;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
public class ChatMessageCell extends BaseCell implements SeekBar.SeekBarDelegate, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, TextSelectionHelper.SelectableView, NotificationCenter.NotificationCenterDelegate {
    private static float[] radii = new float[8];
    private final boolean ALPHA_PROPERTY_WORKAROUND;
    public Property<ChatMessageCell, Float> ANIMATION_OFFSET_X;
    private int TAG;
    CharSequence accessibilityText;
    private boolean accessibilityTextContentUnread;
    private long accessibilityTextFileSize;
    private boolean accessibilityTextUnread;
    private SparseArray<Rect> accessibilityVirtualViewBounds;
    private int[] adaptiveEmojiColor;
    private ColorFilter[] adaptiveEmojiColorFilter;
    private int addedCaptionHeight;
    private boolean addedForTest;
    private int additionalTimeOffsetY;
    private StaticLayout adminLayout;
    private boolean allowAssistant;
    private float alphaInternal;
    private int animateFromStatusDrawableParams;
    private boolean animatePollAnswer;
    private boolean animatePollAnswerAlpha;
    private boolean animatePollAvatars;
    private int animateToStatusDrawableParams;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiDescriptionStack;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiPollQuestion;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiReplyStack;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    private int animatingDrawVideoImageButton;
    private float animatingDrawVideoImageButtonProgress;
    private float animatingLoadingProgressProgress;
    private int animatingNoSound;
    private boolean animatingNoSoundPlaying;
    private float animatingNoSoundProgress;
    private float animationOffsetX;
    private boolean animationRunning;
    private boolean attachedToWindow;
    private StaticLayout authorLayout;
    private int authorLayoutLeft;
    private int authorLayoutWidth;
    private boolean autoPlayingMedia;
    private int availableTimeWidth;
    protected AvatarDrawable avatarDrawable;
    private ImageReceiver avatarImage;
    private boolean avatarPressed;
    private Theme.MessageDrawable.PathDrawParams backgroundCacheParams;
    private MessageBackgroundDrawable backgroundDrawable;
    private int backgroundDrawableBottom;
    private int backgroundDrawableLeft;
    private int backgroundDrawableRight;
    private int backgroundDrawableTop;
    private int backgroundHeight;
    private int backgroundWidth;
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
    private ArrayList<BotButton> botButtons;
    private HashMap<String, BotButton> botButtonsByData;
    private HashMap<String, BotButton> botButtonsByPosition;
    private String botButtonsLayout;
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
    private GradientClip clip;
    private Paint clipPaint;
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
    private ArrayList<InstantViewButton> contactButtons;
    public ReplyMessageLine contactLine;
    private boolean contactPressed;
    private RectF contactRect;
    private float controlsAlpha;
    public final int currentAccount;
    public Theme.MessageDrawable currentBackgroundDrawable;
    private Theme.MessageDrawable currentBackgroundSelectedDrawable;
    private CharSequence currentCaption;
    private TLRPC$Chat currentChat;
    private int currentFocusedVirtualView;
    private TLRPC$Chat currentForwardChannel;
    private String currentForwardName;
    private String currentForwardNameString;
    private TLRPC$User currentForwardUser;
    private int currentMapProvider;
    private MessageObject currentMessageObject;
    private MessageObject.GroupedMessages currentMessagesGroup;
    private Object currentNameStatus;
    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable currentNameStatusDrawable;
    private String currentNameString;
    private TLRPC$FileLocation currentPhoto;
    private String currentPhotoFilter;
    private String currentPhotoFilterThumb;
    private ImageLocation currentPhotoLocation;
    private TLRPC$PhotoSize currentPhotoObject;
    private TLRPC$PhotoSize currentPhotoObjectThumb;
    private BitmapDrawable currentPhotoObjectThumbStripped;
    private ImageLocation currentPhotoThumbLocation;
    private MessageObject.GroupedMessagePosition currentPosition;
    private String currentRepliesString;
    private TLRPC$PhotoSize currentReplyPhoto;
    private float currentSelectedBackgroundAlpha;
    private CharSequence currentTimeString;
    private String currentUnlockString;
    private String currentUrl;
    private TLRPC$User currentUser;
    private TLRPC$User currentViaBotUser;
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
    private boolean disallowLongPress;
    public boolean doNotDraw;
    private StaticLayout docTitleLayout;
    private int docTitleOffsetX;
    private int docTitleWidth;
    private TLRPC$Document documentAttach;
    private int documentAttachType;
    private boolean drawBackground;
    private boolean drawCommentButton;
    private boolean drawCommentNumber;
    private boolean drawContact;
    private boolean drawContactAdd;
    private boolean drawContactSendMessage;
    private boolean drawContactView;
    public boolean drawForBlur;
    private boolean drawForwardedName;
    public boolean drawFromPinchToZoom;
    private boolean drawImageButton;
    private boolean drawInstantView;
    public int drawInstantViewType;
    private boolean drawMediaCheckBox;
    private boolean drawName;
    private boolean drawNameLayout;
    public boolean drawPhotoImage;
    public boolean drawPinnedBottom;
    public boolean drawPinnedTop;
    private boolean drawRadialCheckBackground;
    private boolean drawSelectionBackground;
    private int drawSideButton;
    private int drawSideButton2;
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
    public ExpiredStoryView expiredStoryView;
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
    private int firstVisibleBlockNum;
    private boolean fitPhotoImage;
    private FlagSecureReason flagSecure;
    private boolean flipImage;
    private boolean forceNotDrawTime;
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
    private StaticLayout infoLayout;
    private int infoWidth;
    private int infoX;
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
    public String instantViewButtonText;
    private StaticLayout instantViewLayout;
    private float instantViewLayoutLeft;
    private float instantViewLayoutWidth;
    private int instantWidth;
    private Runnable invalidateCallback;
    private Runnable invalidateRunnable;
    private boolean invalidateSpoilersParent;
    private boolean invalidatesParent;
    public boolean isAvatarVisible;
    public boolean isBlurred;
    public boolean isBot;
    public boolean isChat;
    private boolean isCheckPressed;
    public boolean isForum;
    public boolean isForumGeneral;
    private boolean isHighlighted;
    private boolean isHighlightedAnimated;
    public boolean isMegagroup;
    public boolean isPinned;
    public boolean isPinnedChat;
    private boolean isPlayingRound;
    private boolean isPressed;
    public boolean isRepliesChat;
    public boolean isReplyQuote;
    private boolean isRoundVideo;
    public boolean isSavedChat;
    public boolean isSavedPreviewChat;
    private boolean isSmallImage;
    private boolean isSpoilerRevealing;
    public boolean isThreadChat;
    private boolean isThreadPost;
    private boolean isTitleLabelPressed;
    private boolean isUpdating;
    private int keyboardHeight;
    private long lastAnimationTime;
    private long lastCheckBoxAnimationTime;
    private long lastControlsAlphaChangeTime;
    private int lastDeleteDate;
    private float lastDrawingAudioProgress;
    private int lastHeight;
    private long lastHighlightProgressTime;
    private long lastLoadingSizeTotal;
    private long lastNamesAnimationTime;
    private TLRPC$Poll lastPoll;
    private long lastPollCloseTime;
    private ArrayList<TLRPC$TL_pollAnswerVoters> lastPollResults;
    private int lastPollResultsVoters;
    private String lastPostAuthor;
    private TLRPC$TL_messageReactions lastReactions;
    private int lastRepliesCount;
    private TLRPC$Message lastReplyMessage;
    private long lastSeekUpdateTime;
    private int lastSendState;
    int lastSize;
    private double lastTime;
    private float lastTouchX;
    private float lastTouchY;
    private boolean lastTranslated;
    private int lastViewsCount;
    private int lastVisibleBlockNum;
    private int lastWidth;
    private int layoutHeight;
    private int layoutWidth;
    public int linkBlockNum;
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
    private int nameWidth;
    private float nameX;
    private float nameY;
    public int namesOffset;
    private boolean needNewVisiblePart;
    public boolean needReplyImage;
    private int noSoundCenterX;
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
    private boolean photoImageOutOfBounds;
    private boolean photoNotSet;
    private TLObject photoParentObject;
    private StaticLayout photosCountLayout;
    private int photosCountWidth;
    public boolean pinnedBottom;
    public boolean pinnedTop;
    private float pollAnimationProgress;
    private float pollAnimationProgressTime;
    private AvatarDrawable[] pollAvatarDrawables;
    private ImageReceiver[] pollAvatarImages;
    private boolean[] pollAvatarImagesVisible;
    private ArrayList<PollButton> pollButtons;
    private CheckBoxBase[] pollCheckBox;
    private boolean pollClosed;
    private boolean pollHintPressed;
    private int pollHintX;
    private int pollHintY;
    private boolean pollInstantViewTouchesBottom;
    private boolean pollUnvoteInProgress;
    private boolean pollVoteInProgress;
    private int pollVoteInProgressNum;
    private boolean pollVoted;
    private int pressedBlock;
    private int pressedBotButton;
    private MessageObject.TextLayoutBlock pressedCopyCode;
    private boolean pressedEffect;
    private AnimatedEmojiSpan pressedEmoji;
    private LinkSpanDrawable pressedFactCheckLink;
    private LinkSpanDrawable pressedLink;
    private int pressedLinkType;
    private int pressedSideButton;
    private int[] pressedState;
    private int pressedVoteButton;
    public MessageObject.TextLayoutBlocks prevCaptionLayout;
    private CharacterStyle progressLoadingLink;
    private LoadingDrawable progressLoadingLinkCurrentDrawable;
    private ArrayList<LoadingDrawableLocation> progressLoadingLinkDrawables;
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
    public List<SpoilerEffect> replySpoilers;
    private final Stack<SpoilerEffect> replySpoilersPool;
    public int replyStartX;
    public int replyStartY;
    private int replyTextHeight;
    public StaticLayout replyTextLayout;
    public int replyTextOffset;
    public boolean replyTextRTL;
    private int replyTextWidth;
    private float replyTouchX;
    private float replyTouchY;
    private Theme.ResourcesProvider resourcesProvider;
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
    private boolean scheduledInvalidate;
    private Rect scrollRect;
    private SeekBar seekBar;
    private SeekBarAccessibilityDelegate seekBarAccessibilityDelegate;
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
    private AnimatorSet shakeAnimation;
    private ChatMessageSharedResources sharedResources;
    public boolean shouldCheckVisibleOnScreen;
    private Path sideButtonPath1;
    private Path sideButtonPath2;
    private float[] sideButtonPathCorners1;
    private float[] sideButtonPathCorners2;
    private boolean sideButtonPressed;
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
    private AtomicReference<Layout> spoilersPatchedReplyTextLayout;
    private boolean statusDrawableAnimationInProgress;
    private ValueAnimator statusDrawableAnimator;
    private float statusDrawableProgress;
    private StickerSetLinkIcon stickerSetIcons;
    private int substractBackgroundHeight;
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
    private float toSeekBarProgress;
    private boolean topNearToSet;
    private MessageTopicButton topicButton;
    private long totalChangeTime;
    private int totalCommentWidth;
    public int totalHeight;
    private int totalVisibleBlocksCount;
    public TranscribeButton transcribeButton;
    private float transcribeX;
    private float transcribeY;
    public final TransitionParams transitionParams;
    float transitionYOffsetForDrawables;
    private LoadingDrawable translationLoadingDrawable;
    private ArrayList<MessageObject.TextLayoutBlock> translationLoadingDrawableText;
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
    private ArrayList<LinkPath> urlPathCache;
    private ArrayList<LinkPath> urlPathSelection;
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
    VideoPlayerRewinder videoPlayerRewinder;
    private RadialProgress2 videoRadialProgress;
    private float viewTop;
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
    private boolean wasLayout;
    private boolean wasPinned;
    private boolean wasSending;
    private boolean wasTranscriptionOpen;
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
        MessageObject findPrimaryMessageObject = (messageObject == null || this.currentMessagesGroup == null || !messageObject.hasValidGroupId()) ? null : this.currentMessagesGroup.findPrimaryMessageObject();
        return findPrimaryMessageObject != null ? findPrimaryMessageObject : this.currentMessageObject;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageObject messageObject;
        if (i == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
        } else if (i == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
        } else if (i == NotificationCenter.userInfoDidLoad) {
            TLRPC$User tLRPC$User = this.currentUser;
            if (tLRPC$User == null || tLRPC$User.id != ((Long) objArr[0]).longValue()) {
                return;
            }
            setAvatar(this.currentMessageObject);
        } else if (i == NotificationCenter.emojiLoaded) {
            invalidate();
        } else if (i != NotificationCenter.didUpdatePremiumGiftStickers || (messageObject = this.currentMessageObject) == null) {
        } else {
            TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
            if ((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaGiveaway) || (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaGiveawayResults)) {
                setMessageObject(messageObject, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop);
            }
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
            TLRPC$User tLRPC$User = this.currentUser;
            if (tLRPC$User != null) {
                TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$User.photo;
                if (tLRPC$UserProfilePhoto != null) {
                    this.currentPhoto = tLRPC$UserProfilePhoto.photo_small;
                } else {
                    this.currentPhoto = null;
                }
                this.avatarDrawable.setInfo(this.currentAccount, tLRPC$User);
                this.avatarImage.setForUserOrChat(this.currentUser, this.avatarDrawable, null, LiteMode.isEnabled(98784), 1, false);
                return;
            }
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            if (tLRPC$Chat != null) {
                TLRPC$ChatPhoto tLRPC$ChatPhoto = tLRPC$Chat.photo;
                if (tLRPC$ChatPhoto != null) {
                    this.currentPhoto = tLRPC$ChatPhoto.photo_small;
                } else {
                    this.currentPhoto = null;
                }
                this.avatarDrawable.setInfo(this.currentAccount, tLRPC$Chat);
                this.avatarImage.setForUserOrChat(this.currentChat, this.avatarDrawable);
                return;
            } else if (messageObject.isSponsored()) {
                TLRPC$Photo tLRPC$Photo = messageObject.sponsoredPhoto;
                if (tLRPC$Photo != null) {
                    this.avatarImage.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, AndroidUtilities.dp(50.0f), false, null, true), messageObject.sponsoredPhoto), "50_50", this.avatarDrawable, null, null, 0);
                    return;
                }
                return;
            } else {
                this.currentPhoto = null;
                this.avatarDrawable.setInfo(messageObject.getFromChatId(), null, null);
                this.avatarImage.setImage(null, null, this.avatarDrawable, null, null, 0);
                return;
            }
        }
        this.currentPhoto = null;
    }

    public void setSpoilersSuppressed(boolean z) {
        for (int i = 0; i < this.replySpoilers.size(); i++) {
            this.replySpoilers.get(i).setSuppressUpdates(z);
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
                for (SpoilerEffect spoilerEffect : next.spoilers) {
                    spoilerEffect.setVisibleBounds(0.0f, (i - next.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams)) - this.captionX, getWidth(), (i2 - next.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams)) - this.captionY);
                }
            }
        }
        StaticLayout staticLayout = this.replyTextLayout;
        if (staticLayout != null) {
            float height = (-this.replyStartY) - staticLayout.getHeight();
            for (SpoilerEffect spoilerEffect2 : this.replySpoilers) {
                spoilerEffect2.setVisibleBounds(0.0f, i + height, getWidth(), i2 + height);
            }
        }
        if (getMessageObject() == null || getMessageObject().textLayoutBlocks == null) {
            return;
        }
        Iterator<MessageObject.TextLayoutBlock> it2 = getMessageObject().textLayoutBlocks.iterator();
        while (it2.hasNext()) {
            MessageObject.TextLayoutBlock next2 = it2.next();
            for (SpoilerEffect spoilerEffect3 : next2.spoilers) {
                spoilerEffect3.setVisibleBounds(0.0f, (i - next2.textYOffset(getMessageObject().textLayoutBlocks, this.transitionParams)) - this.textY, getWidth(), (i2 - next2.textYOffset(getMessageObject().textLayoutBlocks, this.transitionParams)) - this.textY);
            }
        }
    }

    public void setScrimReaction(Integer num) {
        this.reactionsLayoutInBubble.setScrimReaction(num);
    }

    public void drawScrimReaction(Canvas canvas, Integer num, float f) {
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
        reactionsLayoutInBubble.setScrimProgress(f);
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

    public boolean checkUnreadReactions(float f, int i) {
        if (this.reactionsLayoutInBubble.hasUnreadReactions) {
            float y = getY();
            ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
            float f2 = y + reactionsLayoutInBubble.y;
            return f2 > f && (f2 + ((float) reactionsLayoutInBubble.height)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i);
        }
        return false;
    }

    public void markReactionsAsRead() {
        this.reactionsLayoutInBubble.hasUnreadReactions = false;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.markReactionsAsRead();
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
            float y = getY() + this.photoImage.getImageY();
            if (this.photoImage.getImageHeight() + y < this.parentBoundsTop || y > this.parentBoundsBottom) {
                return;
            }
            invalidate();
        }
    }

    public interface ChatMessageCellDelegate {
        boolean canDrawOutboundsContent();

        boolean canPerformActions();

        void didLongPress(ChatMessageCell chatMessageCell, float f, float f2);

        void didLongPressBotButton(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton);

        boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2);

        boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2);

        void didPressAboutRevenueSharingAds();

        boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan);

        void didPressBoostCounter(ChatMessageCell chatMessageCell);

        void didPressBotButton(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton);

        void didPressCancelSendButton(ChatMessageCell chatMessageCell);

        void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2, boolean z);

        void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, boolean z);

        void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell);

        void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock);

        void didPressCommentButton(ChatMessageCell chatMessageCell);

        void didPressDialogButton(ChatMessageCell chatMessageCell);

        void didPressEffect(ChatMessageCell chatMessageCell);

        void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton);

        void didPressFactCheck(ChatMessageCell chatMessageCell);

        void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i, int i2);

        void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i);

        void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia, float f, float f2);

        void didPressHiddenForward(ChatMessageCell chatMessageCell);

        void didPressHint(ChatMessageCell chatMessageCell, int i);

        void didPressImage(ChatMessageCell chatMessageCell, float f, float f2);

        void didPressInstantButton(ChatMessageCell chatMessageCell, int i);

        void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell);

        void didPressOther(ChatMessageCell chatMessageCell, float f, float f2);

        void didPressReaction(ChatMessageCell chatMessageCell, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z);

        void didPressReplyMessage(ChatMessageCell chatMessageCell, int i);

        void didPressSideButton(ChatMessageCell chatMessageCell);

        void didPressSponsoredClose(ChatMessageCell chatMessageCell);

        void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2);

        void didPressTime(ChatMessageCell chatMessageCell);

        void didPressTopicButton(ChatMessageCell chatMessageCell);

        void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z);

        void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2, boolean z);

        void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, TLRPC$Document tLRPC$Document);

        void didPressViaBot(ChatMessageCell chatMessageCell, String str);

        void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j);

        void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList<TLRPC$PollAnswer> arrayList, int i, int i2, int i3);

        void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC$WebPage tLRPC$WebPage, String str, boolean z);

        void didStartVideoStream(MessageObject messageObject);

        boolean doNotShowLoadingReply(MessageObject messageObject);

        void forceUpdate(ChatMessageCell chatMessageCell, boolean z);

        String getAdminRank(long j);

        PinchToZoomHelper getPinchToZoomHelper();

        String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell);

        CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell);

        TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper();

        boolean hasSelectedMessages();

        void invalidateBlur();

        boolean isLandscape();

        boolean isProgressLoading(ChatMessageCell chatMessageCell, int i);

        boolean isReplyOrSelf();

        boolean keyboardIsOpened();

        void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2);

        boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z);

        void needReloadPolls();

        void needShowPremiumBulletin(int i);

        boolean onAccessibilityAction(int i, Bundle bundle);

        void onDiceFinished();

        void setShouldNotRepeatSticker(MessageObject messageObject);

        boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z);

        boolean shouldRepeatSticker(MessageObject messageObject);

        boolean shouldShowDialogButton(ChatMessageCell chatMessageCell);

        boolean shouldShowTopicButton(ChatMessageCell chatMessageCell);

        void videoTimerReached();

        public final class CC {
            public static boolean $default$canDrawOutboundsContent(ChatMessageCellDelegate chatMessageCellDelegate) {
                return true;
            }

            public static boolean $default$canPerformActions(ChatMessageCellDelegate chatMessageCellDelegate) {
                return false;
            }

            public static void $default$didLongPress(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didLongPressBotButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
            }

            public static boolean $default$didLongPressChannelAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2) {
                return false;
            }

            public static boolean $default$didLongPressUserAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2) {
                return false;
            }

            public static void $default$didPressAboutRevenueSharingAds(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static boolean $default$didPressAnimatedEmoji(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                return false;
            }

            public static void $default$didPressBoostCounter(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressBotButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
            }

            public static void $default$didPressCancelSendButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressChannelAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2, boolean z) {
            }

            public static void $default$didPressChannelRecommendation(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, boolean z) {
            }

            public static void $default$didPressChannelRecommendationsClose(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressCodeCopy(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
            }

            public static void $default$didPressCommentButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressDialogButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressEffect(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressExtendedMediaPreview(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
            }

            public static void $default$didPressFactCheck(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressFactCheckWhat(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i, int i2) {
            }

            public static void $default$didPressGiveawayChatButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressGroupImage(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia, float f, float f2) {
            }

            public static void $default$didPressHiddenForward(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressHint(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressImage(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didPressInstantButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressMoreChannelRecommendations(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressOther(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didPressReaction(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z) {
            }

            public static void $default$didPressReplyMessage(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressSideButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressSponsoredClose(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressSponsoredInfo(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didPressTime(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressTopicButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressUrl(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
            }

            public static void $default$didPressUserAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2, boolean z) {
            }

            public static void $default$didPressUserStatus(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, TLRPC$Document tLRPC$Document) {
            }

            public static void $default$didPressViaBot(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, String str) {
            }

            public static void $default$didPressViaBotNotInline(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, long j) {
            }

            public static void $default$didPressVoteButtons(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
            }

            public static void $default$didStartVideoStream(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
            }

            public static void $default$forceUpdate(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, boolean z) {
            }

            public static String $default$getAdminRank(ChatMessageCellDelegate chatMessageCellDelegate, long j) {
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

            public static boolean $default$isLandscape(ChatMessageCellDelegate chatMessageCellDelegate) {
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

            public static void $default$setShouldNotRepeatSticker(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
            }

            public static boolean $default$shouldDrawThreadProgress(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, boolean z) {
                return false;
            }

            public static boolean $default$shouldRepeatSticker(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
                return true;
            }

            public static boolean $default$shouldShowDialogButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
                return false;
            }

            public static boolean $default$shouldShowTopicButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
                return false;
            }

            public static void $default$videoTimerReached(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static boolean $default$doNotShowLoadingReply(ChatMessageCellDelegate _this, MessageObject messageObject) {
                return messageObject != null && messageObject.getDialogId() == 1271266957;
            }
        }
    }

    public class BotButton {
        private int angle;
        private TLRPC$KeyboardButton button;
        private int height;
        private boolean isInviteButton;
        private long lastUpdateTime;
        private LoadingDrawable loadingDrawable;
        private int positionFlags;
        private ValueAnimator pressAnimator;
        private float pressT;
        private boolean pressed;
        private float progressAlpha;
        private Drawable selectorDrawable;
        private StaticLayout title;
        private int width;
        private int x;
        private int y;

        private BotButton() {
        }

        static int access$3776(BotButton botButton, int i) {
            int i2 = i | botButton.positionFlags;
            botButton.positionFlags = i2;
            return i2;
        }

        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            if (this.pressed != z) {
                this.pressed = z;
                ChatMessageCell.this.invalidateOutbounds();
                if (z && (valueAnimator = this.pressAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.pressAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressT;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.pressAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            ChatMessageCell.BotButton.this.lambda$setPressed$0(valueAnimator2);
                        }
                    });
                    this.pressAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            BotButton.this.pressAnimator = null;
                        }
                    });
                    this.pressAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                    this.pressAnimator.setDuration(350L);
                    this.pressAnimator.start();
                }
            }
        }

        public void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatMessageCell.this.invalidateOutbounds();
        }

        public boolean hasPositionFlag(int i) {
            return (this.positionFlags & i) == i;
        }

        public float getPressScale() {
            if (this.pressed) {
                float f = this.pressT;
                if (f != 1.0f) {
                    float min = f + (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f);
                    this.pressT = min;
                    this.pressT = Utilities.clamp(min, 1.0f, 0.0f);
                    ChatMessageCell.this.invalidateOutbounds();
                }
            }
            return ((1.0f - this.pressT) * 0.04f) + 0.96f;
        }
    }

    public static class PollButton {
        public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmoji;
        private TLRPC$PollAnswer answer;
        private boolean chosen;
        private boolean correct;
        private int count;
        private float decimal;
        public int height;
        private int percent;
        private float percentProgress;
        private boolean prevChosen;
        private int prevPercent;
        private float prevPercentProgress;
        private StaticLayout title;
        public int x;
        public int y;

        static int access$2412(PollButton pollButton, int i) {
            int i2 = pollButton.percent + i;
            pollButton.percent = i2;
            return i2;
        }

        static float access$3124(PollButton pollButton, float f) {
            float f2 = pollButton.decimal - f;
            pollButton.decimal = f2;
            return f2;
        }
    }

    public static class InstantViewButton {
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

        static float access$5024(InstantViewButton instantViewButton, float f) {
            float f2 = instantViewButton.textX - f;
            instantViewButton.textX = f2;
            return f2;
        }
    }

    public boolean isCellAttachedToWindow() {
        return this.attachedToWindow;
    }

    public class LoadingDrawableLocation {
        int blockNum;
        LoadingDrawable drawable;

        LoadingDrawableLocation(ChatMessageCell chatMessageCell) {
        }
    }

    public ChatMessageCell(Context context, int i) {
        this(context, i, false, null, null);
    }

    public ChatMessageCell(Context context, int i, boolean z, ChatMessageSharedResources chatMessageSharedResources, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.visibleOnScreen = true;
        this.reactionsLayoutInBubble = new ReactionsLayoutInBubble(this);
        this.giveawayMessageCell = new GiveawayMessageCell(this);
        this.giveawayResultsMessageCell = new GiveawayResultsMessageCell(this);
        this.scrollRect = new Rect();
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
        this.controlsAlpha = 1.0f;
        this.pressedBlock = -1;
        this.links = new LinkSpanDrawable.LinkCollector(this);
        this.urlPathCache = new ArrayList<>();
        this.urlPathSelection = new ArrayList<>();
        this.rectPath = new Path();
        this.pollButtons = new ArrayList<>();
        this.botButtons = new ArrayList<>();
        this.botButtonPath = new Path();
        this.botButtonRadii = new float[8];
        this.botButtonsByData = new HashMap<>();
        this.botButtonsByPosition = new HashMap<>();
        this.isCheckPressed = true;
        this.drawBackground = true;
        this.backgroundWidth = 100;
        this.commentButtonRect = new Rect();
        this.spoilersPatchedReplyTextLayout = new AtomicReference<>();
        this.forwardedNameLayout = new StaticLayout[2];
        this.forwardNameOffsetX = new float[2];
        this.drawTime = true;
        this.mediaSpoilerPath = new Path();
        this.mediaSpoilerRadii = new float[8];
        this.mediaSpoilerEffect = new SpoilerEffect();
        this.unlockAlpha = 1.0f;
        this.unlockSpoilerEffect = new SpoilerEffect();
        this.unlockSpoilerPath = new Path();
        this.unlockSpoilerRadii = new float[8];
        this.replySelectorRect = new RectF();
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
                ChatMessageCell chatMessageCell = ChatMessageCell.this;
                chatMessageCell.invalidate(((int) chatMessageCell.rect.left) - 5, ((int) ChatMessageCell.this.rect.top) - 5, ((int) ChatMessageCell.this.rect.right) + 5, ((int) ChatMessageCell.this.rect.bottom) + 5);
                if (ChatMessageCell.this.scheduledInvalidate) {
                    AndroidUtilities.runOnUIThread(ChatMessageCell.this.invalidateRunnable, 1000L);
                }
            }
        };
        this.accessibilityVirtualViewBounds = new SparseArray<>();
        this.currentFocusedVirtualView = -1;
        this.backgroundCacheParams = new Theme.MessageDrawable.PathDrawParams();
        this.replySpoilers = new ArrayList();
        this.replySpoilersPool = new Stack<>();
        this.sPath = new Path();
        this.pressedEffect = false;
        this.overridenDuration = -1L;
        this.hadLongPress = false;
        this.radialProgressAlpha = 1.0f;
        this.ANIMATION_OFFSET_X = new Property<ChatMessageCell, Float>(this, Float.class, "animationOffsetX") {
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
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
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
                } else if (ChatMessageCell.this.currentMessageObject.isRoundVideo()) {
                    return ChatMessageCell.this.currentMessageObject.audioProgress;
                } else {
                    return 0.0f;
                }
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
                } else if (!ChatMessageCell.this.currentMessageObject.isRoundVideo()) {
                    return;
                } else {
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

    private void createPollUI() {
        if (this.pollAvatarImages != null) {
            return;
        }
        this.pollAvatarImages = new ImageReceiver[3];
        this.pollAvatarDrawables = new AvatarDrawable[3];
        this.pollAvatarImagesVisible = new boolean[3];
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.pollAvatarImages;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i] = new ImageReceiver(this);
            this.pollAvatarImages[i].setRoundRadius(AndroidUtilities.dp(8.0f));
            this.pollAvatarDrawables[i] = new AvatarDrawable();
            this.pollAvatarDrawables[i].setTextSize(AndroidUtilities.dp(22.0f));
            i++;
        }
        this.pollCheckBox = new CheckBoxBase[10];
        int i2 = 0;
        while (true) {
            CheckBoxBase[] checkBoxBaseArr = this.pollCheckBox;
            if (i2 >= checkBoxBaseArr.length) {
                return;
            }
            checkBoxBaseArr[i2] = new CheckBoxBase(this, 20, this.resourcesProvider);
            this.pollCheckBox[i2].setDrawUnchecked(false);
            this.pollCheckBox[i2].setBackgroundType(9);
            i2++;
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
            linkPath = this.urlPathCache.get(0);
            this.urlPathCache.remove(0);
        } else {
            linkPath = new LinkPath(true);
        }
        linkPath.reset();
        this.urlPathSelection.add(linkPath);
        return linkPath;
    }

    public int[] getRealSpanStartAndEnd(Spannable spannable, CharacterStyle characterStyle) {
        int i;
        int i2;
        boolean z;
        TextStyleSpan.TextStyleRun style;
        TLRPC$MessageEntity tLRPC$MessageEntity;
        if (!(characterStyle instanceof URLSpanBrowser) || (style = ((URLSpanBrowser) characterStyle).getStyle()) == null || (tLRPC$MessageEntity = style.urlEntity) == null) {
            i = 0;
            i2 = 0;
            z = false;
        } else {
            i2 = tLRPC$MessageEntity.offset;
            i = tLRPC$MessageEntity.length + i2;
            z = true;
        }
        if (!z) {
            i2 = spannable.getSpanStart(characterStyle);
            i = spannable.getSpanEnd(characterStyle);
        }
        return new int[]{i2, i};
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
        boolean contains = rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            SpannableString spannableString = new SpannableString(this.adminLayout.getText());
            BoostCounterSpan[] boostCounterSpanArr = (BoostCounterSpan[]) spannableString.getSpans(0, spannableString.length(), BoostCounterSpan.class);
            if (contains && boostCounterSpanArr != null && boostCounterSpanArr.length > 0) {
                z = true;
            }
            this.boostCounterPressed = z;
            if (z && (drawable = this.boostCounterLayoutSelector) != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable.setHotspot((int) motionEvent.getX(), (int) motionEvent.getY());
                }
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

    private boolean checkNameMotionEvent(MotionEvent motionEvent) {
        Drawable drawable;
        ChatMessageCellDelegate chatMessageCellDelegate;
        TLRPC$Chat tLRPC$Chat;
        int i;
        int i2;
        if (!this.drawNameLayout || this.nameLayout == null || (drawable = this.nameLayoutSelector) == null || (this.currentUser == null && this.currentChat == null)) {
            this.nameLayoutPressed = false;
            return false;
        }
        boolean contains = drawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.nameLayoutPressed = contains;
            if (contains) {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.nameLayoutSelector.setHotspot((int) motionEvent.getX(), (int) motionEvent.getY());
                }
                this.nameLayoutSelector.setState(this.pressedState);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.nameLayoutPressed && (chatMessageCellDelegate = this.delegate) != null) {
                if (this.viaOnly) {
                    TLRPC$User tLRPC$User = this.currentViaBotUser;
                    if (tLRPC$User != null && tLRPC$User.bot_inline_placeholder == null) {
                        chatMessageCellDelegate.didPressViaBotNotInline(this, tLRPC$User != null ? tLRPC$User.id : 0L);
                    } else {
                        chatMessageCellDelegate.didPressViaBot(this, tLRPC$User != null ? tLRPC$User.username : this.currentMessageObject.messageOwner.via_bot_name);
                    }
                } else {
                    TLRPC$User tLRPC$User2 = this.currentUser;
                    if (tLRPC$User2 != null) {
                        chatMessageCellDelegate.didPressUserAvatar(this, tLRPC$User2, motionEvent.getX(), motionEvent.getY(), false);
                    } else {
                        TLRPC$Chat tLRPC$Chat2 = this.currentChat;
                        if (tLRPC$Chat2 != null) {
                            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.currentMessageObject.messageOwner.fwd_from;
                            if (tLRPC$MessageFwdHeader != null) {
                                if (tLRPC$Chat2 == null && (tLRPC$MessageFwdHeader.flags & 16) != 0) {
                                    i2 = tLRPC$MessageFwdHeader.saved_from_msg_id;
                                    tLRPC$Chat = tLRPC$Chat2;
                                } else {
                                    i2 = tLRPC$MessageFwdHeader.channel_post;
                                    tLRPC$Chat = this.currentForwardChannel;
                                }
                                i = i2;
                            } else {
                                tLRPC$Chat = tLRPC$Chat2;
                                i = 0;
                            }
                            chatMessageCellDelegate.didPressChannelAvatar(this, tLRPC$Chat != null ? tLRPC$Chat : tLRPC$Chat2, i, this.lastTouchX, this.lastTouchY, false);
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
        boolean contains = this.nameStatusSelector.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.nameStatusPressed = contains;
            if (contains) {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.nameStatusSelector.setHotspot((int) motionEvent.getX(), (int) motionEvent.getY());
                }
                this.nameStatusSelector.setState(this.pressedState);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.nameStatusPressed && this.delegate != null && this.currentUser != null) {
                this.delegate.didPressUserStatus(this, this.currentUser, this.currentNameStatusDrawable.getDrawable() instanceof AnimatedEmojiDrawable ? ((AnimatedEmojiDrawable) this.currentNameStatusDrawable.getDrawable()).getDocument() : null);
                invalidateOutbounds();
            }
            this.nameStatusSelector.setState(StateSet.NOTHING);
            this.nameStatusPressed = false;
        }
        return this.nameStatusPressed;
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

    private boolean checkTextBlockMotionEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkTextBlockMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkCaptionMotionEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkCaptionMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkGameMotionEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkGameMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkTranscribeButtonMotionEvent(MotionEvent motionEvent) {
        TranscribeButton transcribeButton;
        return this.useTranscribeButton && (!this.isPlayingRound || getVideoTranscriptionProgress() > 0.0f || this.wasTranscriptionOpen) && (transcribeButton = this.transcribeButton) != null && transcribeButton.onTouch(motionEvent.getAction(), motionEvent.getX(), motionEvent.getY());
    }

    private boolean checkLinkPreviewMotionEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkLinkPreviewMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkEffectMotionEvent(MotionEvent motionEvent) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.getEffect() == null) {
            return false;
        }
        int timeX = ((int) ((getTimeX() - AndroidUtilities.dp(this.effectId == 0 ? 0.0f : 18.0f)) + (this.timeWidth * (this.currentMessageObject.sendPreview ? 1.0f - this.timeAlpha : 0.0f)))) - AndroidUtilities.dp(2.0f);
        int timeY = ((int) getTimeY()) - AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(timeX, timeY, timeX + AndroidUtilities.dp(16.0f) + this.timeWidth, timeY + AndroidUtilities.dp(16.0f));
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains) {
                if (this.effectDrawableBounce == null) {
                    this.effectDrawableBounce = new ButtonBounce(this);
                }
                this.pressedEffect = true;
            }
        } else if (motionEvent.getAction() == 2) {
            this.pressedEffect = contains;
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

    private boolean checkFactCheckMotionEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkFactCheckMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkPollButtonMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.currentMessageObject.eventId != 0 || this.pollVoteInProgress || this.pollUnvoteInProgress || this.pollButtons.isEmpty()) {
            return false;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject.type == 17 && messageObject.isSent()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                this.pressedVoteButton = -1;
                this.pollHintPressed = false;
                if (this.hintButtonVisible && (i = this.pollHintX) != -1 && x >= i && x <= i + AndroidUtilities.dp(40.0f) && y >= (i2 = this.pollHintY) && y <= i2 + AndroidUtilities.dp(40.0f)) {
                    this.pollHintPressed = true;
                    this.selectorDrawableMaskType[0] = 3;
                    if (Build.VERSION.SDK_INT >= 21) {
                        Drawable[] drawableArr = this.selectorDrawable;
                        if (drawableArr[0] != null) {
                            drawableArr[0].setBounds(this.pollHintX - AndroidUtilities.dp(8.0f), this.pollHintY - AndroidUtilities.dp(8.0f), this.pollHintX + AndroidUtilities.dp(32.0f), this.pollHintY + AndroidUtilities.dp(32.0f));
                            this.selectorDrawable[0].setHotspot(x, y);
                            this.selectorDrawable[0].setState(this.pressedState);
                        }
                    }
                    invalidate();
                } else {
                    for (int i3 = 0; i3 < this.pollButtons.size(); i3++) {
                        PollButton pollButton = this.pollButtons.get(i3);
                        int dp = (pollButton.y + this.namesOffset) - AndroidUtilities.dp(13.0f);
                        int i4 = pollButton.x;
                        if (x >= i4 && x <= (i4 + this.backgroundWidth) - AndroidUtilities.dp(31.0f) && y >= dp && y <= pollButton.height + dp + AndroidUtilities.dp(26.0f)) {
                            this.pressedVoteButton = i3;
                            if (!this.pollVoted && !this.pollClosed) {
                                this.selectorDrawableMaskType[0] = 1;
                                if (Build.VERSION.SDK_INT >= 21) {
                                    Drawable[] drawableArr2 = this.selectorDrawable;
                                    if (drawableArr2[0] != null) {
                                        drawableArr2[0].setBounds(pollButton.x - AndroidUtilities.dp(9.0f), dp, (pollButton.x + this.backgroundWidth) - AndroidUtilities.dp(22.0f), pollButton.height + dp + AndroidUtilities.dp(26.0f));
                                        this.selectorDrawable[0].setHotspot(x, y);
                                        this.selectorDrawable[0].setState(this.pressedState);
                                    }
                                }
                                invalidate();
                            }
                        }
                    }
                    return false;
                }
                return true;
            } else if (motionEvent.getAction() == 1) {
                if (this.pollHintPressed) {
                    playSoundEffect(0);
                    this.delegate.didPressHint(this, 0);
                    this.pollHintPressed = false;
                    if (Build.VERSION.SDK_INT >= 21) {
                        Drawable[] drawableArr3 = this.selectorDrawable;
                        if (drawableArr3[0] != null) {
                            drawableArr3[0].setState(StateSet.NOTHING);
                            return false;
                        }
                        return false;
                    }
                    return false;
                } else if (this.pressedVoteButton != -1) {
                    playSoundEffect(0);
                    if (Build.VERSION.SDK_INT >= 21) {
                        Drawable[] drawableArr4 = this.selectorDrawable;
                        if (drawableArr4[0] != null) {
                            drawableArr4[0].setState(StateSet.NOTHING);
                        }
                    }
                    if (this.currentMessageObject.scheduled) {
                        Toast.makeText(getContext(), LocaleController.getString("MessageScheduledVote", R.string.MessageScheduledVote), 1).show();
                    } else {
                        PollButton pollButton2 = this.pollButtons.get(this.pressedVoteButton);
                        TLRPC$PollAnswer tLRPC$PollAnswer = pollButton2.answer;
                        if (this.pollVoted || this.pollClosed) {
                            ArrayList<TLRPC$PollAnswer> arrayList = new ArrayList<>();
                            arrayList.add(tLRPC$PollAnswer);
                            this.delegate.didPressVoteButtons(this, arrayList, pollButton2.count, pollButton2.x + AndroidUtilities.dp(50.0f), this.namesOffset + pollButton2.y);
                        } else if (this.lastPoll.multiple_choice) {
                            if (this.currentMessageObject.checkedVotes.contains(tLRPC$PollAnswer)) {
                                this.currentMessageObject.checkedVotes.remove(tLRPC$PollAnswer);
                                this.pollCheckBox[this.pressedVoteButton].setChecked(false, true);
                            } else {
                                this.currentMessageObject.checkedVotes.add(tLRPC$PollAnswer);
                                this.pollCheckBox[this.pressedVoteButton].setChecked(true, true);
                            }
                        } else {
                            this.pollVoteInProgressNum = this.pressedVoteButton;
                            this.pollVoteInProgress = true;
                            this.vibrateOnPollVote = true;
                            this.voteCurrentProgressTime = 0.0f;
                            this.firstCircleLength = true;
                            this.voteCurrentCircleLength = 360.0f;
                            this.voteRisingCircleLength = false;
                            ArrayList<TLRPC$PollAnswer> arrayList2 = new ArrayList<>();
                            arrayList2.add(tLRPC$PollAnswer);
                            this.delegate.didPressVoteButtons(this, arrayList2, -1, 0, 0);
                        }
                    }
                    this.pressedVoteButton = -1;
                    invalidate();
                    return false;
                } else {
                    return false;
                }
            } else if (motionEvent.getAction() == 2) {
                if ((this.pressedVoteButton != -1 || this.pollHintPressed) && Build.VERSION.SDK_INT >= 21) {
                    Drawable[] drawableArr5 = this.selectorDrawable;
                    if (drawableArr5[0] != null) {
                        drawableArr5[0].setHotspot(x, y);
                        return false;
                    }
                    return false;
                }
                return false;
            } else {
                return false;
            }
        }
        return false;
    }

    private boolean checkInstantButtonMotionEvent(MotionEvent motionEvent) {
        if (this.currentMessageObject.isSponsored() || this.currentMessageObject.isUnsupported() || (this.drawInstantView && this.currentMessageObject.type != 0)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                if (this.drawInstantView) {
                    float f = x;
                    float f2 = y;
                    if (this.instantButtonRect.contains(f, f2)) {
                        this.selectorDrawableMaskType[0] = this.lastPoll == null ? 0 : 2;
                        this.instantPressed = true;
                        if (Build.VERSION.SDK_INT >= 21 && this.selectorDrawable[0] != null && this.instantButtonRect.contains(f, f2)) {
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
                                Toast.makeText(getContext(), LocaleController.getString("MessageScheduledVoteResults", R.string.MessageScheduledVoteResults), 1).show();
                            } else if (this.pollVoted || this.pollClosed) {
                                chatMessageCellDelegate.didPressInstantButton(this, this.drawInstantViewType);
                            } else {
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
                            }
                        } else {
                            chatMessageCellDelegate.didPressInstantButton(this, this.drawInstantViewType);
                        }
                    }
                    playSoundEffect(0);
                    if (Build.VERSION.SDK_INT >= 21) {
                        Drawable[] drawableArr = this.selectorDrawable;
                        if (drawableArr[0] != null) {
                            drawableArr[0].setState(StateSet.NOTHING);
                        }
                    }
                    this.instantPressed = false;
                    setInstantButtonPressed(false);
                    invalidate();
                }
            } else if (motionEvent.getAction() == 2 && this.instantButtonPressed && Build.VERSION.SDK_INT >= 21) {
                Drawable[] drawableArr2 = this.selectorDrawable;
                if (drawableArr2[0] != null) {
                    drawableArr2[0].setHotspot(x, y);
                }
            }
            return false;
        }
        return false;
    }

    private boolean checkContactMotionEvent(MotionEvent motionEvent) {
        if (this.currentMessageObject.type != 12) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            ArrayList<InstantViewButton> arrayList = this.contactButtons;
            if (arrayList != null && arrayList.size() > 1) {
                for (int i = 0; i < this.contactButtons.size(); i++) {
                    InstantViewButton instantViewButton = this.contactButtons.get(i);
                    float f = x;
                    float f2 = y;
                    if (instantViewButton.rect.contains(f, f2)) {
                        if (instantViewButton.buttonBounce == null) {
                            instantViewButton.buttonBounce = new ButtonBounce(this);
                        }
                        instantViewButton.buttonBounce.setPressed(true);
                        if (Build.VERSION.SDK_INT >= 21 && instantViewButton.selectorDrawable != null) {
                            instantViewButton.selectorDrawable.setHotspot(f, f2);
                            instantViewButton.selectorDrawable.setState(this.pressedState);
                        }
                        invalidate();
                        return true;
                    }
                }
            }
            float f3 = x;
            float f4 = y;
            if (this.contactRect.contains(f3, f4)) {
                this.contactPressed = true;
                this.contactBounce.setPressed(true);
                if (Build.VERSION.SDK_INT >= 21) {
                    Drawable[] drawableArr = this.selectorDrawable;
                    if (drawableArr[0] != null) {
                        drawableArr[0].setHotspot(f3, f4);
                        this.selectorDrawable[0].setState(this.pressedState);
                    }
                }
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.contactPressed) {
                if (this.delegate != null) {
                    ArrayList<InstantViewButton> arrayList2 = this.contactButtons;
                    if (arrayList2 != null && arrayList2.size() == 1) {
                        this.delegate.didPressInstantButton(this, this.contactButtons.get(0).type);
                    } else {
                        this.delegate.didPressInstantButton(this, 5);
                    }
                }
                playSoundEffect(0);
                if (Build.VERSION.SDK_INT >= 21) {
                    Drawable[] drawableArr2 = this.selectorDrawable;
                    if (drawableArr2[0] != null) {
                        drawableArr2[0].setState(StateSet.NOTHING);
                    }
                }
                this.contactPressed = false;
                this.contactBounce.setPressed(false);
                invalidate();
            } else {
                ArrayList<InstantViewButton> arrayList3 = this.contactButtons;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    for (int i2 = 0; i2 < this.contactButtons.size(); i2++) {
                        InstantViewButton instantViewButton2 = this.contactButtons.get(i2);
                        if (instantViewButton2.buttonBounce != null && instantViewButton2.buttonBounce.isPressed()) {
                            ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                            if (chatMessageCellDelegate != null) {
                                chatMessageCellDelegate.didPressInstantButton(this, instantViewButton2.type);
                            }
                            if (Build.VERSION.SDK_INT >= 21 && instantViewButton2.selectorDrawable != null) {
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
            if (this.contactPressed && Build.VERSION.SDK_INT >= 21) {
                Drawable[] drawableArr3 = this.selectorDrawable;
                if (drawableArr3[0] != null) {
                    drawableArr3[0].setHotspot(x, y);
                }
            }
            ArrayList<InstantViewButton> arrayList4 = this.contactButtons;
            if (arrayList4 != null && arrayList4.size() > 1) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.contactButtons.size()) {
                        break;
                    }
                    InstantViewButton instantViewButton3 = this.contactButtons.get(i3);
                    if (instantViewButton3.buttonBounce == null || !instantViewButton3.buttonBounce.isPressed()) {
                        i3++;
                    } else if (Build.VERSION.SDK_INT >= 21 && instantViewButton3.selectorDrawable != null) {
                        instantViewButton3.selectorDrawable.setHotspot(x, y);
                    }
                }
            }
        }
        return false;
    }

    private boolean checkTitleLabelMotion(MotionEvent motionEvent) {
        if (this.currentMessageObject.isSponsored() && this.currentMessageObject.sponsoredCanReport) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                float f = x;
                if (f >= this.titleLabelX - AndroidUtilities.dp(6.0f) && f <= this.titleLabelX + this.titleLabelLayoutWidth + AndroidUtilities.dp(6.0f)) {
                    float f2 = y;
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
        int i = 0;
        if (this.drawCommentButton) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
            if (groupedMessagePosition != null && (groupedMessagePosition.flags & 1) == 0 && this.commentButtonRect.contains(x, y)) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                int childCount = viewGroup.getChildCount();
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != this && (childAt instanceof ChatMessageCell)) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        if (chatMessageCell.drawCommentButton && chatMessageCell.currentMessagesGroup == this.currentMessagesGroup && (chatMessageCell.currentPosition.flags & 1) != 0) {
                            MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), (motionEvent.getX() + getLeft()) - chatMessageCell.getLeft(), (motionEvent.getY() + getTop()) - chatMessageCell.getTop(), 0);
                            chatMessageCell.checkCommentButtonMotionEvent(obtain);
                            obtain.recycle();
                            break;
                        }
                    }
                    i++;
                }
                return true;
            }
            if (motionEvent.getAction() == 0) {
                if (this.commentButtonRect.contains(x, y)) {
                    if (this.currentMessageObject.isSent()) {
                        this.selectorDrawableMaskType[1] = 2;
                        this.commentButtonPressed = true;
                        if (Build.VERSION.SDK_INT >= 21) {
                            Drawable[] drawableArr = this.selectorDrawable;
                            if (drawableArr[1] != null) {
                                drawableArr[1].setHotspot(x, y);
                                this.selectorDrawable[1].setState(this.pressedState);
                            }
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
                    if (Build.VERSION.SDK_INT >= 21) {
                        Drawable[] drawableArr2 = this.selectorDrawable;
                        if (drawableArr2[1] != null) {
                            drawableArr2[1].setState(StateSet.NOTHING);
                        }
                    }
                    this.commentButtonPressed = false;
                    invalidateWithParent();
                }
            } else if (motionEvent.getAction() == 2 && this.commentButtonPressed && Build.VERSION.SDK_INT >= 21) {
                Drawable[] drawableArr3 = this.selectorDrawable;
                if (drawableArr3[1] != null) {
                    drawableArr3[1].setHotspot(x, y);
                }
            }
            return false;
        }
        return false;
    }

    private boolean checkSponsoredCloseMotionEvent(MotionEvent motionEvent) {
        ButtonBounce buttonBounce;
        ChatMessageCellDelegate chatMessageCellDelegate;
        RectF rectF;
        if (motionEvent.getAction() == 0 && (rectF = this.closeSponsoredBounds) != null && this.closeSponsoredBounce != null && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        int i = this.documentAttachType;
        if ((i == 5 || i == 1) && (groupedMessagePosition = this.currentPosition) != null && (groupedMessagePosition.flags & 4) == 0) {
            return false;
        }
        int i2 = this.currentMessageObject.type;
        boolean z = i2 == 16;
        if (!z) {
            z = ((i != 1 && i2 != 12 && i != 5 && i != 4 && i != 2 && i2 != 8) || this.hasGamePreview || this.hasInvoicePreview) ? false : true;
        }
        if (z) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                MessageObject messageObject = this.currentMessageObject;
                if (messageObject.type == 16) {
                    boolean isVideoCall = messageObject.isVideoCall();
                    int i3 = this.otherX;
                    if (x >= i3) {
                        if (x <= i3 + AndroidUtilities.dp((LocaleController.isRTL ? 0 : 200) + 30 + (!isVideoCall ? 2 : 0)) && y >= this.otherY - AndroidUtilities.dp(14.0f) && y <= this.otherY + AndroidUtilities.dp(50.0f)) {
                            this.otherPressed = true;
                            this.selectorDrawableMaskType[0] = 4;
                            if (Build.VERSION.SDK_INT >= 21 && this.selectorDrawable[0] != null) {
                                int dp = this.otherX + AndroidUtilities.dp((LocaleController.isRTL ? 0 : 200) + (!isVideoCall ? 2 : 0)) + (Theme.chat_msgInCallDrawable[isVideoCall ? 1 : 0].getIntrinsicWidth() / 2);
                                int intrinsicHeight = this.otherY + (Theme.chat_msgInCallDrawable[isVideoCall ? 1 : 0].getIntrinsicHeight() / 2);
                                this.selectorDrawable[0].setBounds(dp - AndroidUtilities.dp(20.0f), intrinsicHeight - AndroidUtilities.dp(20.0f), dp + AndroidUtilities.dp(20.0f), intrinsicHeight + AndroidUtilities.dp(20.0f));
                                this.selectorDrawable[0].setHotspot(x, y);
                                this.selectorDrawable[0].setState(this.pressedState);
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (x >= this.otherX - AndroidUtilities.dp(20.0f) && x <= this.otherX + AndroidUtilities.dp(20.0f) && y >= this.otherY - AndroidUtilities.dp(4.0f) && y <= this.otherY + AndroidUtilities.dp(30.0f)) {
                    this.otherPressed = true;
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.otherPressed) {
                    if (this.currentMessageObject.type == 16 && Build.VERSION.SDK_INT >= 21) {
                        Drawable[] drawableArr = this.selectorDrawable;
                        if (drawableArr[0] != null) {
                            drawableArr[0].setState(StateSet.NOTHING);
                        }
                    }
                    this.otherPressed = false;
                    playSoundEffect(0);
                    this.delegate.didPressOther(this, this.otherX, this.otherY);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && this.currentMessageObject.type == 16 && this.otherPressed && Build.VERSION.SDK_INT >= 21) {
                Drawable[] drawableArr2 = this.selectorDrawable;
                if (drawableArr2[0] != null) {
                    drawableArr2[0].setHotspot(x, y);
                }
            }
            return false;
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
        if (Build.VERSION.SDK_INT >= 21) {
            Drawable[] drawableArr = this.selectorDrawable;
            if (drawableArr[0] != null) {
                drawableArr[0].setState(StateSet.NOTHING);
            }
        }
        if (this.contactButtons != null) {
            for (int i = 0; i < this.contactButtons.size(); i++) {
                InstantViewButton instantViewButton = this.contactButtons.get(i);
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
        if (this.currentMessageObject.isImportedForward()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                float f = x;
                float f2 = this.drawTimeX;
                if (f < f2 || f > f2 + this.timeWidth) {
                    return false;
                }
                float f3 = y;
                float f4 = this.drawTimeY;
                if (f3 < f4 || f3 > f4 + AndroidUtilities.dp(20.0f)) {
                    return false;
                }
                this.timePressed = true;
                invalidate();
            } else if (motionEvent.getAction() != 1 || !this.timePressed) {
                return false;
            } else {
                this.timePressed = false;
                playSoundEffect(0);
                this.delegate.didPressTime(this);
                invalidate();
            }
            return true;
        }
        return false;
    }

    private boolean checkRoundSeekbar(MotionEvent motionEvent) {
        if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject) && MediaController.getInstance().isMessagePaused()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                float f = x;
                if (f >= this.seekbarRoundX - AndroidUtilities.dp(20.0f) && f <= this.seekbarRoundX + AndroidUtilities.dp(20.0f)) {
                    float f2 = y;
                    if (f2 >= this.seekbarRoundY - AndroidUtilities.dp(20.0f) && f2 <= this.seekbarRoundY + AndroidUtilities.dp(20.0f)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        cancelCheckLongPress();
                        this.roundSeekbarTouched = 1;
                        invalidate();
                    }
                }
                float centerX = f - this.photoImage.getCenterX();
                float centerY = y - this.photoImage.getCenterY();
                float imageWidth = (this.photoImage.getImageWidth() - AndroidUtilities.dp(64.0f)) / 2.0f;
                float f3 = (centerX * centerX) + (centerY * centerY);
                if (f3 < ((this.photoImage.getImageWidth() / 2.0f) * this.photoImage.getImageWidth()) / 2.0f && f3 > imageWidth * imageWidth) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    cancelCheckLongPress();
                    this.roundSeekbarTouched = 1;
                    invalidate();
                }
            } else if (this.roundSeekbarTouched == 1 && motionEvent.getAction() == 2) {
                float degrees = ((float) Math.toDegrees(Math.atan2(y - this.photoImage.getCenterY(), x - this.photoImage.getCenterX()))) + 90.0f;
                if (degrees < 0.0f) {
                    degrees += 360.0f;
                }
                float f4 = degrees / 360.0f;
                if (Math.abs(this.currentMessageObject.audioProgress - f4) > 0.9f) {
                    if (this.roundSeekbarOutAlpha == 0.0f) {
                        performHapticFeedback(3);
                    }
                    this.roundSeekbarOutAlpha = 1.0f;
                    this.roundSeekbarOutProgress = this.currentMessageObject.audioProgress;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.lastSeekUpdateTime > 100) {
                    MediaController.getInstance().seekToProgress(this.currentMessageObject, f4);
                    this.lastSeekUpdateTime = currentTimeMillis;
                }
                this.currentMessageObject.audioProgress = f4;
                updatePlayingMessageProgress();
            }
            if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.roundSeekbarTouched != 0) {
                if (motionEvent.getAction() == 1) {
                    float degrees2 = ((float) Math.toDegrees(Math.atan2(y - this.photoImage.getCenterY(), x - this.photoImage.getCenterX()))) + 90.0f;
                    if (degrees2 < 0.0f) {
                        degrees2 += 360.0f;
                    }
                    float f5 = degrees2 / 360.0f;
                    this.currentMessageObject.audioProgress = f5;
                    MediaController.getInstance().seekToProgress(this.currentMessageObject, f5);
                    updatePlayingMessageProgress();
                }
                MediaController.getInstance().playMessage(this.currentMessageObject);
                this.roundSeekbarTouched = 0;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return this.roundSeekbarTouched != 0;
        }
        return false;
    }

    private boolean checkPhotoImageMotionEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkPhotoImageMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkAudioMotionEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkAudioMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean checkSpoilersMotionEvent(MotionEvent motionEvent, int i) {
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int i2;
        MessageObject.GroupedMessages groupedMessages;
        if (i <= 15 && getParent() != null) {
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
                                boolean checkSpoilersMotionEvent = chatMessageCell.checkSpoilersMotionEvent(motionEvent, i + 1);
                                motionEvent.offsetLocation(-(getLeft() - chatMessageCell.getLeft()), -(getTop() - chatMessageCell.getTop()));
                                return checkSpoilersMotionEvent;
                            }
                        }
                    }
                }
            }
            if (this.isSpoilerRevealing) {
                return false;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int i5 = this.textX;
                if (x >= i5 && y >= (i2 = this.textY)) {
                    MessageObject messageObject = this.currentMessageObject;
                    if (x <= i5 + messageObject.textWidth && y <= i2 + messageObject.textHeight(this.transitionParams)) {
                        ArrayList<MessageObject.TextLayoutBlock> arrayList = this.currentMessageObject.textLayoutBlocks;
                        for (int i6 = 0; i6 < arrayList.size() && arrayList.get(i6).textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams) <= y; i6++) {
                            MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i6);
                            int i7 = textLayoutBlock.isRtl() ? (int) this.currentMessageObject.textXOffset : 0;
                            for (SpoilerEffect spoilerEffect : textLayoutBlock.spoilers) {
                                if (spoilerEffect.getBounds().contains((x - this.textX) + i7, (int) ((y - this.textY) - textLayoutBlock.textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams)))) {
                                    this.spoilerPressed = spoilerEffect;
                                    return true;
                                }
                            }
                        }
                    }
                }
                if (this.captionLayout != null) {
                    float f = x;
                    float f2 = this.captionX;
                    if (f >= f2) {
                        float f3 = y;
                        float f4 = this.captionY;
                        if (f3 >= f4 && f <= f2 + textLayoutBlocks.textWidth && f3 <= f4 + textLayoutBlocks.textHeight(this.transitionParams)) {
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
            } else if (actionMasked == 1 && this.spoilerPressed != null) {
                playSoundEffect(0);
                this.sPath.rewind();
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = this.captionLayout;
                if (textLayoutBlocks2 != null) {
                    Iterator<MessageObject.TextLayoutBlock> it = textLayoutBlocks2.textLayoutBlocks.iterator();
                    while (it.hasNext()) {
                        MessageObject.TextLayoutBlock next = it.next();
                        for (SpoilerEffect spoilerEffect3 : next.spoilers) {
                            Rect bounds = spoilerEffect3.getBounds();
                            this.sPath.addRect(bounds.left, bounds.top + next.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams), bounds.right, next.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams) + bounds.bottom, Path.Direction.CW);
                        }
                    }
                } else {
                    Iterator<MessageObject.TextLayoutBlock> it2 = this.currentMessageObject.textLayoutBlocks.iterator();
                    while (it2.hasNext()) {
                        MessageObject.TextLayoutBlock next2 = it2.next();
                        for (SpoilerEffect spoilerEffect4 : next2.spoilers) {
                            Rect bounds2 = spoilerEffect4.getBounds();
                            this.sPath.addRect(bounds2.left, bounds2.top + next2.textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams), bounds2.right, next2.textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams) + bounds2.bottom, Path.Direction.CW);
                        }
                    }
                }
                this.sPath.computeBounds(this.rect, false);
                float sqrt = (float) Math.sqrt(Math.pow(this.rect.width(), 2.0d) + Math.pow(this.rect.height(), 2.0d));
                this.isSpoilerRevealing = true;
                this.spoilerPressed.setOnRippleEndCallback(new Runnable() {
                    @Override
                    public final void run() {
                        ChatMessageCell.this.lambda$checkSpoilersMotionEvent$1();
                    }
                });
                MessageObject.TextLayoutBlocks textLayoutBlocks3 = this.captionLayout;
                if (textLayoutBlocks3 != null) {
                    Iterator<MessageObject.TextLayoutBlock> it3 = textLayoutBlocks3.textLayoutBlocks.iterator();
                    while (it3.hasNext()) {
                        MessageObject.TextLayoutBlock next3 = it3.next();
                        int i10 = next3.isRtl() ? (int) this.captionLayout.textXOffset : 0;
                        for (SpoilerEffect spoilerEffect5 : next3.spoilers) {
                            spoilerEffect5.startRipple((x - this.captionX) + i10, (y - next3.textYOffset(this.captionLayout.textLayoutBlocks, this.transitionParams)) - this.captionY, sqrt);
                        }
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = this.currentMessageObject.textLayoutBlocks;
                    if (arrayList3 != null) {
                        Iterator<MessageObject.TextLayoutBlock> it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            MessageObject.TextLayoutBlock next4 = it4.next();
                            int i11 = next4.isRtl() ? (int) this.currentMessageObject.textXOffset : 0;
                            for (SpoilerEffect spoilerEffect6 : next4.spoilers) {
                                spoilerEffect6.startRipple((x - this.textX) + i11, (y - next4.textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams)) - this.textY, sqrt);
                            }
                        }
                    }
                }
                if (getParent() instanceof RecyclerListView) {
                    ViewGroup viewGroup2 = (ViewGroup) getParent();
                    for (int i12 = 0; i12 < viewGroup2.getChildCount(); i12++) {
                        View childAt2 = viewGroup2.getChildAt(i12);
                        if (childAt2 instanceof ChatMessageCell) {
                            final ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt2;
                            if (chatMessageCell2.getMessageObject() != null && chatMessageCell2.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !chatMessageCell2.replySpoilers.isEmpty()) {
                                chatMessageCell2.replySpoilers.get(0).setOnRippleEndCallback(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ChatMessageCell.this.lambda$checkSpoilersMotionEvent$3(chatMessageCell2);
                                    }
                                });
                                for (SpoilerEffect spoilerEffect7 : chatMessageCell2.replySpoilers) {
                                    spoilerEffect7.startRipple(spoilerEffect7.getBounds().centerX(), spoilerEffect7.getBounds().centerY(), sqrt);
                                }
                            }
                        }
                    }
                }
                this.spoilerPressed = null;
                return true;
            }
        }
        return false;
    }

    public void lambda$checkSpoilersMotionEvent$1() {
        post(new Runnable() {
            @Override
            public final void run() {
                ChatMessageCell.this.lambda$checkSpoilersMotionEvent$0();
            }
        });
    }

    public void lambda$checkSpoilersMotionEvent$0() {
        this.isSpoilerRevealing = false;
        getMessageObject().isSpoilersRevealed = true;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.captionLayout;
        if (textLayoutBlocks != null) {
            Iterator<MessageObject.TextLayoutBlock> it = textLayoutBlocks.textLayoutBlocks.iterator();
            while (it.hasNext()) {
                it.next().spoilers.clear();
            }
        } else {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.currentMessageObject.textLayoutBlocks;
            if (arrayList != null) {
                Iterator<MessageObject.TextLayoutBlock> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().spoilers.clear();
                }
            }
        }
        invalidate();
    }

    public void lambda$checkSpoilersMotionEvent$3(final ChatMessageCell chatMessageCell) {
        post(new Runnable() {
            @Override
            public final void run() {
                ChatMessageCell.lambda$checkSpoilersMotionEvent$2(ChatMessageCell.this);
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
        int dp;
        if (this.botButtons.isEmpty()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            if (this.currentMessageObject.isOutOwner()) {
                dp = (getMeasuredWidth() - this.widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                dp = this.backgroundDrawableLeft + AndroidUtilities.dp(this.mediaBackground ? 1.0f : 7.0f);
            }
            for (int i2 = 0; i2 < this.botButtons.size(); i2++) {
                BotButton botButton = this.botButtons.get(i2);
                int dp2 = (botButton.y + this.layoutHeight) - AndroidUtilities.dp(2.0f);
                if (x >= botButton.x + dp && x <= botButton.x + dp + botButton.width && y >= dp2 && y <= botButton.height + dp2) {
                    this.pressedBotButton = i2;
                    invalidateOutbounds();
                    if (botButton.selectorDrawable == null) {
                        botButton.selectorDrawable = Theme.createRadSelectorDrawable(getThemedColor(Theme.key_chat_serviceBackgroundSelector), 6, 6);
                        botButton.selectorDrawable.setCallback(this);
                        botButton.selectorDrawable.setBounds(botButton.x + dp, dp2, botButton.x + dp + botButton.width, botButton.height + dp2);
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        botButton.selectorDrawable.setHotspot(x, y);
                    }
                    botButton.selectorDrawable.setState(this.pressedState);
                    botButton.setPressed(true);
                    final int i3 = this.pressedBotButton;
                    postDelayed(new Runnable() {
                        @Override
                        public final void run() {
                            ChatMessageCell.this.lambda$checkBotButtonMotionEvent$4(i3);
                        }
                    }, ViewConfiguration.getLongPressTimeout() - 1);
                    return true;
                }
            }
            return false;
        } else if (motionEvent.getAction() == 1) {
            if (this.pressedBotButton != -1) {
                playSoundEffect(0);
                BotButton botButton2 = this.botButtons.get(this.pressedBotButton);
                if (botButton2.selectorDrawable != null) {
                    botButton2.selectorDrawable.setState(StateSet.NOTHING);
                }
                botButton2.setPressed(false);
                if (!this.currentMessageObject.scheduled) {
                    if (botButton2.button != null) {
                        this.delegate.didPressBotButton(this, botButton2.button);
                    }
                } else {
                    Toast.makeText(getContext(), LocaleController.getString("MessageScheduledBotAction", R.string.MessageScheduledBotAction), 1).show();
                }
                this.pressedBotButton = -1;
                invalidateOutbounds();
                return false;
            }
            return false;
        } else if (motionEvent.getAction() != 3 || (i = this.pressedBotButton) == -1) {
            return false;
        } else {
            BotButton botButton3 = this.botButtons.get(i);
            if (botButton3.selectorDrawable != null) {
                botButton3.selectorDrawable.setState(StateSet.NOTHING);
            }
            botButton3.setPressed(false);
            this.pressedBotButton = -1;
            invalidateOutbounds();
            return false;
        }
    }

    public void lambda$checkBotButtonMotionEvent$4(int i) {
        int i2 = this.pressedBotButton;
        if (i == i2) {
            BotButton botButton = this.botButtons.get(i2);
            if (botButton != null) {
                if (botButton.selectorDrawable != null) {
                    botButton.selectorDrawable.setState(StateSet.NOTHING);
                }
                botButton.setPressed(false);
                if (!this.currentMessageObject.scheduled && botButton.button != null) {
                    cancelCheckLongPress();
                    this.delegate.didLongPressBotButton(this, botButton.button);
                }
            }
            this.pressedBotButton = -1;
            invalidateOutbounds();
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void lambda$onTouchEvent$5() {
        if (this.replyPressed && !this.replySelectorPressed && this.replySelectorCanBePressed) {
            this.replySelectorPressed = true;
            this.replySelector.setState(new int[]{16842919, 16842910});
        }
    }

    public void lambda$onTouchEvent$6() {
        this.replySelector.setState(new int[0]);
        invalidate();
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
                                return this.reactionsLayoutInBubble.chekTouchEvent(motionEvent);
                            }
                            motionEvent.offsetLocation(getLeft() - chatMessageCell.getLeft(), getTop() - chatMessageCell.getTop());
                            boolean chekTouchEvent = chatMessageCell.reactionsLayoutInBubble.chekTouchEvent(motionEvent);
                            motionEvent.offsetLocation(-(getLeft() - chatMessageCell.getLeft()), -(getTop() - chatMessageCell.getTop()));
                            return chekTouchEvent;
                        }
                    }
                }
            }
            return false;
        }
        return this.reactionsLayoutInBubble.chekTouchEvent(motionEvent);
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
        int dp;
        int i2;
        int dp2;
        int extraTextX;
        int i3;
        MessageObject.GroupedMessages groupedMessages;
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate == null || (textSelectionHelper = chatMessageCellDelegate.getTextSelectionHelper()) == null || textSelectionHelper.isMenuEmpty()) {
            return false;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = this.currentMessageObject.textLayoutBlocks;
        if (((arrayList == null || arrayList.isEmpty()) ? false : true) || hasCaptionLayout()) {
            if ((this.drawSelectionBackground || this.currentMessagesGroup != null) && (this.currentMessagesGroup == null || this.delegate.hasSelectedMessages())) {
                if (this.currentMessageObject.hasValidGroupId() && (groupedMessages = this.currentMessagesGroup) != null && !groupedMessages.isDocuments) {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup == null) {
                        return false;
                    }
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        View childAt = viewGroup.getChildAt(i4);
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
                                boolean onTouchEvent = textSelectionHelper.onTouchEvent(motionEvent);
                                motionEvent.offsetLocation(-(getLeft() - chatMessageCell.getLeft()), -(getTop() - chatMessageCell.getTop()));
                                return onTouchEvent;
                            }
                        }
                    }
                    return false;
                }
                MessageObject messageObject = this.currentMessageObject;
                if (messageObject != null && !messageObject.preview && this.factCheckTextLayout != null && motionEvent.getY() >= this.factCheckY) {
                    textSelectionHelper.setIsDescription(false);
                    textSelectionHelper.setIsFactCheck(true);
                    MessageObject.GroupedMessages groupedMessages2 = this.currentMessagesGroup;
                    if (groupedMessages2 != null && !groupedMessages2.isDocuments) {
                        i3 = (int) this.captionX;
                    } else if (this.currentMessageObject.isOutOwner()) {
                        int dp3 = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                        i3 = this.currentMessageObject.type == 19 ? dp3 - Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + dp3) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x) : dp3;
                    } else {
                        if (this.mediaBackground) {
                            dp2 = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f);
                            extraTextX = getExtraTextX();
                        } else {
                            dp2 = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
                            extraTextX = getExtraTextX();
                        }
                        i3 = dp2 + extraTextX;
                    }
                    textSelectionHelper.setMaybeTextCord(((((int) (i3 + this.transitionParams.deltaLeft)) - AndroidUtilities.dp(1.33f)) + AndroidUtilities.dp(10.0f)) - this.factCheckTextLayoutLeft, this.factCheckY + AndroidUtilities.dp(22.0f));
                } else if (hasCaptionLayout()) {
                    textSelectionHelper.setIsDescription(false);
                    textSelectionHelper.setIsFactCheck(false);
                    textSelectionHelper.setMaybeTextCord((int) this.captionX, (int) this.captionY);
                } else {
                    MessageObject messageObject2 = this.currentMessageObject;
                    if (messageObject2 != null && !messageObject2.preview && this.descriptionLayout != null && (!this.linkPreviewAbove ? motionEvent.getY() > this.descriptionY : motionEvent.getY() < this.textY)) {
                        textSelectionHelper.setIsDescription(true);
                        textSelectionHelper.setIsFactCheck(false);
                        if (this.hasGamePreview) {
                            i2 = this.unmovedTextX - AndroidUtilities.dp(10.0f);
                        } else {
                            if (this.hasInvoicePreview) {
                                i = this.unmovedTextX;
                                dp = AndroidUtilities.dp(1.0f);
                            } else {
                                i = this.unmovedTextX;
                                dp = AndroidUtilities.dp(1.0f);
                            }
                            i2 = i + dp;
                        }
                        textSelectionHelper.setMaybeTextCord(i2 + AndroidUtilities.dp(10.0f) + this.descriptionX, this.descriptionY);
                    } else {
                        textSelectionHelper.setIsDescription(false);
                        textSelectionHelper.setIsFactCheck(false);
                        textSelectionHelper.setMaybeTextCord(this.textX, this.textY);
                    }
                }
                textSelectionHelper.setMessageObject(this);
                return textSelectionHelper.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    private void updateSelectionTextPosition() {
        int dp;
        int extraTextX;
        int i;
        int i2;
        int dp2;
        int i3;
        if (getDelegate() == null || getDelegate().getTextSelectionHelper() == null || !getDelegate().getTextSelectionHelper().isSelected(this.currentMessageObject)) {
            return;
        }
        int textSelectionType = getDelegate().getTextSelectionHelper().getTextSelectionType(this);
        if (textSelectionType == TextSelectionHelper.ChatListTextSelectionHelper.TYPE_DESCRIPTION) {
            if (this.hasGamePreview) {
                i3 = this.unmovedTextX - AndroidUtilities.dp(10.0f);
            } else {
                if (this.hasInvoicePreview) {
                    i2 = this.unmovedTextX;
                    dp2 = AndroidUtilities.dp(1.0f);
                } else {
                    i2 = this.unmovedTextX;
                    dp2 = AndroidUtilities.dp(1.0f);
                }
                i3 = i2 + dp2;
            }
            getDelegate().getTextSelectionHelper().updateTextPosition(i3 + AndroidUtilities.dp(10.0f) + this.descriptionX, this.descriptionY);
        } else if (textSelectionType == TextSelectionHelper.ChatListTextSelectionHelper.TYPE_CAPTION) {
            updateCaptionLayout();
            getDelegate().getTextSelectionHelper().updateTextPosition((int) this.captionX, (int) this.captionY);
        } else if (textSelectionType == TextSelectionHelper.ChatListTextSelectionHelper.TYPE_FACTCHECK) {
            MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i = (int) this.captionX;
            } else {
                if (this.currentMessageObject.isOutOwner()) {
                    i = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                    if (this.currentMessageObject.type == 19) {
                        i -= Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + i) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.mediaBackground) {
                        dp = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f);
                        extraTextX = getExtraTextX();
                    } else {
                        dp = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
                        extraTextX = getExtraTextX();
                    }
                    i = dp + extraTextX;
                }
            }
            int dp3 = ((int) (i + this.transitionParams.deltaLeft)) - AndroidUtilities.dp(1.33f);
            int i4 = this.factCheckY;
            updateCaptionLayout();
            getDelegate().getTextSelectionHelper().updateTextPosition((dp3 + AndroidUtilities.dp(10.0f)) - this.factCheckTextLayoutLeft, i4 + AndroidUtilities.dp(22.0f));
        } else {
            getDelegate().getTextSelectionHelper().updateTextPosition(this.textX, this.textY);
        }
    }

    public ArrayList<PollButton> getPollButtons() {
        return this.pollButtons;
    }

    public void updatePlayingMessageProgress() {
        String formatShortDuration;
        double d;
        double d2;
        double d3;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        VideoPlayerRewinder videoPlayerRewinder = this.videoPlayerRewinder;
        if (videoPlayerRewinder != null && videoPlayerRewinder.rewindCount != 0 && videoPlayerRewinder.rewindByBackSeek) {
            messageObject.audioProgress = videoPlayerRewinder.getVideoProgress();
        }
        double d4 = 0.0d;
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
                    d3 = durationMs;
                    MessageObject messageObject3 = this.currentMessageObject;
                    TLRPC$Message tLRPC$Message = messageObject3.messageOwner;
                    if (tLRPC$Message.ttl > 0 && tLRPC$Message.destroyTime == 0 && !messageObject3.needDrawBluredPreview() && this.currentMessageObject.isVideo() && animation.hasBitmap()) {
                        this.delegate.didStartVideoStream(this.currentMessageObject);
                    }
                } else {
                    d3 = 0.0d;
                }
                if (d3 == 0.0d) {
                    d3 = this.currentMessageObject.getDuration();
                }
                if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                    double d5 = this.currentMessageObject.audioProgress;
                    Double.isNaN(d5);
                    d3 -= d5 * d3;
                } else if (animation != null) {
                    if (d3 != 0.0d) {
                        double currentProgressMs = animation.getCurrentProgressMs() / 1000;
                        Double.isNaN(currentProgressMs);
                        d3 -= currentProgressMs;
                    }
                    if (this.delegate != null && animation.getCurrentProgressMs() >= 3000) {
                        this.delegate.videoTimerReached();
                    }
                }
                if (this.lastTime != d3) {
                    String formatShortDuration2 = AndroidUtilities.formatShortDuration((int) d3);
                    this.infoWidth = (int) Math.ceil(Theme.chat_infoPaint.measureText(formatShortDuration2));
                    this.infoLayout = new StaticLayout(formatShortDuration2, Theme.chat_infoPaint, this.infoWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.lastTime = d3;
                    return;
                }
                return;
            }
            return;
        }
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
            TLRPC$Document document = this.currentMessageObject.getDocument();
            if (document != null) {
                while (r1 < document.attributes.size()) {
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(r1);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                        d2 = tLRPC$DocumentAttribute.duration;
                        break;
                    }
                    r1++;
                }
            }
            d2 = 0.0d;
            long j = this.overridenDuration;
            if (j >= 0) {
                d2 = j;
            } else if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                double d6 = this.currentMessageObject.audioProgressSec;
                Double.isNaN(d6);
                d2 = Math.max(0.0d, d2 - d6);
            }
            if (this.lastTime != d2) {
                this.lastTime = d2;
                String formatLongDuration = AndroidUtilities.formatLongDuration((int) d2);
                this.timeWidthAudio = (int) Math.ceil(Theme.chat_timePaint.measureText(formatLongDuration));
                this.durationLayout = new StaticLayout(formatLongDuration, Theme.chat_timePaint, this.timeWidthAudio, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f = this.currentMessageObject.audioProgress;
            if (f != 0.0f) {
                this.lastDrawingAudioProgress = f;
                if (f > 0.9f) {
                    this.lastDrawingAudioProgress = 1.0f;
                }
            }
            invalidate();
        } else if (this.documentAttach != null) {
            if (this.useSeekBarWaveform) {
                if (!this.seekBarWaveform.isDragging()) {
                    this.seekBarWaveform.setProgress(this.currentMessageObject.audioProgress, true);
                }
            } else {
                if (!this.seekBar.isDragging()) {
                    this.seekBar.setProgress(this.currentMessageObject.audioProgress);
                    this.seekBar.setBufferedProgress(this.currentMessageObject.bufferedProgress);
                }
                this.seekBar.updateTimestamps(this.currentMessageObject, null);
            }
            if (this.documentAttachType == 3) {
                long j2 = this.overridenDuration;
                if (j2 >= 0) {
                    d = j2;
                } else if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                    d = this.currentMessageObject.audioProgressSec;
                } else {
                    while (true) {
                        if (r1 >= this.documentAttach.attributes.size()) {
                            break;
                        }
                        TLRPC$DocumentAttribute tLRPC$DocumentAttribute2 = this.documentAttach.attributes.get(r1);
                        if (tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeAudio) {
                            d4 = tLRPC$DocumentAttribute2.duration;
                            break;
                        }
                        r1++;
                    }
                    d = d4;
                }
                if (this.lastTime != d) {
                    this.lastTime = d;
                    String formatLongDuration2 = AndroidUtilities.formatLongDuration((int) d);
                    this.timeWidthAudio = (int) Math.ceil(Theme.chat_audioTimePaint.measureText(formatLongDuration2));
                    this.durationLayout = new StaticLayout(formatLongDuration2, Theme.chat_audioTimePaint, this.timeWidthAudio, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
            } else {
                double duration = this.currentMessageObject.getDuration();
                r1 = MediaController.getInstance().isPlayingMessage(this.currentMessageObject) ? this.currentMessageObject.audioProgressSec : 0;
                double d7 = r1;
                if (this.lastTime != d7) {
                    this.lastTime = d7;
                    this.durationLayout = new StaticLayout(AndroidUtilities.formatShortDuration(r1, (int) duration), Theme.chat_audioTimePaint, (int) Math.ceil(Theme.chat_audioTimePaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
            }
            invalidate();
        }
    }

    public void overrideDuration(long j) {
        this.overridenDuration = j;
    }

    public void setFullyDraw(boolean z) {
        this.fullyDraw = z;
    }

    public void setParentViewSize(int i, int i2) {
        Theme.MessageDrawable messageDrawable;
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
        chatMessageCell.setVisiblePart(this.childPosition, this.visibleHeight, this.visibleParent, this.visibleParentOffset, this.visibleTop, this.parentWidth, this.parentHeight, this.blurredViewTopOffset, this.blurredViewBottomOffset);
    }

    public void setVisiblePart(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        MessageObject.TextLayoutBlock textLayoutBlock;
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
        if (messageObject2 == null || messageObject2.textLayoutBlocks == null) {
            return;
        }
        int i8 = i - this.textY;
        int i9 = 0;
        for (int i10 = 0; i10 < this.currentMessageObject.textLayoutBlocks.size() && this.currentMessageObject.textLayoutBlocks.get(i10).textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams) <= i8; i10++) {
            i9 = i10;
        }
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        while (i9 < this.currentMessageObject.textLayoutBlocks.size()) {
            float textYOffset = this.currentMessageObject.textLayoutBlocks.get(i9).textYOffset(this.currentMessageObject.textLayoutBlocks, this.transitionParams);
            float height = textLayoutBlock.padTop + textYOffset + textLayoutBlock.height(this.transitionParams) + textLayoutBlock.padBottom;
            float f3 = i8;
            if (intersect(textYOffset, height, f3, i8 + i2)) {
                if (i11 == -1) {
                    i11 = i9;
                }
                i13++;
                i12 = i9;
            } else if (textYOffset > f3) {
                break;
            }
            i9++;
        }
        if (this.lastVisibleBlockNum != i12 || this.firstVisibleBlockNum != i11 || this.totalVisibleBlocksCount != i13) {
            this.lastVisibleBlockNum = i12;
            this.firstVisibleBlockNum = i11;
            this.totalVisibleBlocksCount = i13;
            invalidate();
        } else if (this.animatedEmojiStack != null) {
            for (int i14 = 0; i14 < this.animatedEmojiStack.holders.size(); i14++) {
                AnimatedEmojiSpan.AnimatedEmojiHolder animatedEmojiHolder = this.animatedEmojiStack.holders.get(i14);
                if (animatedEmojiHolder != null && animatedEmojiHolder.skipDraw && !animatedEmojiHolder.outOfBounds((this.parentBoundsTop - getY()) - animatedEmojiHolder.drawingYOffset, (this.parentBoundsBottom - getY()) - animatedEmojiHolder.drawingYOffset)) {
                    invalidate();
                    return;
                }
            }
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

    private void didClickedImage() {
        ChatMessageCellDelegate chatMessageCellDelegate;
        TLRPC$WebPage tLRPC$WebPage;
        boolean z;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        TLRPC$ReplyMarkup tLRPC$ReplyMarkup;
        if (this.currentMessageObject.hasMediaSpoilers() && !this.currentMessageObject.needDrawBluredPreview() && !this.currentMessageObject.isMediaSpoilersRevealed) {
            startRevealMedia(this.lastTouchX, this.lastTouchY);
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        int i = messageObject.type;
        if (i == 20) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message == null || (tLRPC$MessageMedia = tLRPC$Message.media) == null || tLRPC$MessageMedia.extended_media.isEmpty() || (tLRPC$ReplyMarkup = this.currentMessageObject.messageOwner.reply_markup) == null) {
                return;
            }
            Iterator<TLRPC$TL_keyboardButtonRow> it = tLRPC$ReplyMarkup.rows.iterator();
            while (it.hasNext()) {
                Iterator<TLRPC$KeyboardButton> it2 = it.next().buttons.iterator();
                if (it2.hasNext()) {
                    this.delegate.didPressExtendedMediaPreview(this, it2.next());
                    return;
                }
            }
        } else if (i == 1 || messageObject.isAnyKindOfSticker()) {
            int i2 = this.buttonState;
            if (i2 == -1) {
                this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
            } else if (i2 == 0) {
                didPressButton(true, false);
            }
        } else {
            MessageObject messageObject2 = this.currentMessageObject;
            int i3 = messageObject2.type;
            if (i3 == 12) {
                long j = MessageObject.getMedia(messageObject2.messageOwner).user_id;
                this.delegate.didPressUserAvatar(this, j != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)) : null, this.lastTouchX, this.lastTouchY, false);
            } else if (i3 == 5) {
                if (this.buttonState != -1) {
                    didPressButton(true, false);
                } else if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) {
                    this.delegate.needPlayMessage(this, this.currentMessageObject, false);
                } else {
                    MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject);
                }
            } else if (i3 == 8) {
                int i4 = this.buttonState;
                if (i4 == -1 || (i4 == 1 && this.canStreamVideo && this.autoPlayingMedia)) {
                    this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                } else if (i4 == 2 || i4 == 0) {
                    didPressButton(true, false);
                }
            } else {
                int i5 = this.documentAttachType;
                if (i5 == 4) {
                    int i6 = this.buttonState;
                    if (i6 == -1 || ((z = this.drawVideoImageButton) && (this.autoPlayingMedia || (SharedConfig.streamMedia && this.canStreamVideo)))) {
                        this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                    } else if (z) {
                        didPressButton(true, true);
                    } else if (i6 == 0 || i6 == 3) {
                        didPressButton(true, false);
                    }
                } else if (i3 == 4 || i3 == 23 || i3 == 24) {
                    this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                } else if (i5 == 1) {
                    if (this.buttonState == -1) {
                        this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                    }
                } else if (i5 == 2) {
                    if (this.buttonState != -1 || (tLRPC$WebPage = MessageObject.getMedia(messageObject2.messageOwner).webpage) == null) {
                        return;
                    }
                    String str = tLRPC$WebPage.embed_url;
                    if (str != null && str.length() != 0) {
                        this.delegate.needOpenWebView(this.currentMessageObject, tLRPC$WebPage.embed_url, tLRPC$WebPage.site_name, tLRPC$WebPage.description, tLRPC$WebPage.url, tLRPC$WebPage.embed_width, tLRPC$WebPage.embed_height);
                    } else {
                        Browser.openUrl(getContext(), tLRPC$WebPage.url);
                    }
                } else if (this.hasInvoicePreview) {
                    if (this.buttonState == -1) {
                        this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                    }
                } else if (Build.VERSION.SDK_INT < 26 || (chatMessageCellDelegate = this.delegate) == null) {
                } else {
                    if (i3 == 16) {
                        chatMessageCellDelegate.didLongPress(this, 0.0f, 0.0f);
                    } else {
                        chatMessageCellDelegate.didPressOther(this, this.otherX, this.otherY);
                    }
                }
            }
        }
    }

    private void updateSecretTimeText(MessageObject messageObject) {
        CharSequence secretTimeString;
        if (messageObject == null || !messageObject.needDrawBluredPreview() || (secretTimeString = messageObject.getSecretTimeString()) == null) {
            return;
        }
        if (secretTimeString instanceof String) {
            int ceil = (int) Math.ceil(Theme.chat_infoPaint.measureText((String) secretTimeString));
            this.infoWidth = ceil;
            this.infoLayout = new StaticLayout(TextUtils.ellipsize(secretTimeString, Theme.chat_infoPaint, ceil, TextUtils.TruncateAt.END), Theme.chat_infoPaint, this.infoWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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

    private ArrayList<TLRPC$Peer> getRecentRepliers() {
        TLRPC$MessageReplies tLRPC$MessageReplies;
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && !groupedMessages.messages.isEmpty() && (tLRPC$MessageReplies = this.currentMessagesGroup.messages.get(0).messageOwner.replies) != null) {
            return tLRPC$MessageReplies.recent_repliers;
        }
        TLRPC$MessageReplies tLRPC$MessageReplies2 = this.currentMessageObject.messageOwner.replies;
        if (tLRPC$MessageReplies2 != null) {
            return tLRPC$MessageReplies2.recent_repliers;
        }
        return null;
    }

    public void updateAnimatedEmojis() {
        MessageObject messageObject;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        if (!this.imageReceiversAttachState || (messageObject = this.currentMessageObject) == null) {
            return;
        }
        boolean z = false;
        int cacheTypeForEnterView = messageObject.wasJustSent ? AnimatedEmojiDrawable.getCacheTypeForEnterView() : 0;
        MessageObject.TextLayoutBlocks textLayoutBlocks = this.captionLayout;
        if (textLayoutBlocks != null && (arrayList = textLayoutBlocks.textLayoutBlocks) != null) {
            this.animatedEmojiStack = AnimatedEmojiSpan.update(cacheTypeForEnterView, (View) this, false, this.animatedEmojiStack, arrayList);
            return;
        }
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        this.animatedEmojiStack = AnimatedEmojiSpan.update(cacheTypeForEnterView, this, (chatMessageCellDelegate == null || !chatMessageCellDelegate.canDrawOutboundsContent()) ? true : true, this.animatedEmojiStack, this.currentMessageObject.textLayoutBlocks);
    }

    private boolean isUserDataChanged() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.isUserDataChanged():boolean");
    }

    public ImageReceiver getPhotoImage() {
        return this.photoImage;
    }

    public ImageReceiver getPhotoImage(int i) {
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
        float f;
        TLRPC$User tLRPC$User = this.currentUser;
        if (tLRPC$User != null && tLRPC$User.id == 0) {
            f = this.avatarImage.getCenterX();
        } else {
            f = this.forwardNameX + this.forwardNameCenterX;
        }
        return (int) f;
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

    public TLRPC$User getCurrentUser() {
        return this.currentUser;
    }

    public TLRPC$Chat getCurrentChat() {
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
        this.attachedToWindow = false;
        GroupMedia groupMedia = this.groupMedia;
        if (groupMedia != null) {
            groupMedia.onDetachedFromWindow();
        }
        this.avatarImage.onDetachedFromWindow();
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
        MessageTopicButton messageTopicButton = this.topicButton;
        if (messageTopicButton != null) {
            messageTopicButton.onDetached(this);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.currentNameStatusDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.detach();
        }
        SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this);
        }
        ChannelRecommendationsCell channelRecommendationsCell = this.channelRecommendationsCell;
        if (channelRecommendationsCell != null) {
            channelRecommendationsCell.onDetachedFromWindow();
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            messageObject.animateComments = false;
        }
        MessageObject messageObject2 = this.messageObjectToSet;
        if (messageObject2 != null) {
            messageObject2.animateComments = false;
            setMessageContent(messageObject2, this.groupedMessagesToSet, this.bottomNearToSet, this.topNearToSet);
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
        checkImageReceiversAttachState();
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null) {
            setAvatar(messageObject3);
        }
        int i2 = this.documentAttachType;
        if (i2 == 4 && this.autoPlayingMedia) {
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
            this.animatingNoSoundPlaying = isPlayingMessage;
            this.animatingNoSoundProgress = isPlayingMessage ? 0.0f : 1.0f;
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
        MessageTopicButton messageTopicButton = this.topicButton;
        if (messageTopicButton != null) {
            messageTopicButton.onAttached(this);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.currentNameStatusDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.attach();
        }
        SpoilerEffect2 spoilerEffect2 = this.mediaSpoilerEffect2;
        if (spoilerEffect2 != null) {
            if (spoilerEffect2.destroyed) {
                SpoilerEffect2 makeSpoilerEffect = makeSpoilerEffect();
                this.mediaSpoilerEffect2 = makeSpoilerEffect;
                Integer num = this.mediaSpoilerEffect2Index;
                if (num != null) {
                    makeSpoilerEffect.reassignAttach(this, num.intValue());
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
        Integer valueOf = Integer.valueOf(spoilerEffect2.getAttachIndex(chatMessageCell));
        this.mediaSpoilerEffect2Index = valueOf;
        SpoilerEffect2 spoilerEffect22 = this.mediaSpoilerEffect2;
        if (spoilerEffect22 != null) {
            spoilerEffect22.reassignAttach(this, valueOf.intValue());
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
                if (this.pollAvatarImages != null) {
                    int i = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr = this.pollAvatarImages;
                        if (i >= imageReceiverArr.length) {
                            break;
                        }
                        imageReceiverArr[i].onAttachedToWindow();
                        i++;
                    }
                }
                if (this.commentAvatarImages != null) {
                    int i2 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr2 = this.commentAvatarImages;
                        if (i2 >= imageReceiverArr2.length) {
                            break;
                        }
                        imageReceiverArr2[i2].onAttachedToWindow();
                        i2++;
                    }
                }
                this.giveawayMessageCell.onAttachedToWindow();
                this.giveawayResultsMessageCell.onAttachedToWindow();
                this.replyImageReceiver.onAttachedToWindow();
                this.locationImageReceiver.onAttachedToWindow();
                this.blurredPhotoImage.onAttachedToWindow();
                if (this.photoImage.onAttachedToWindow()) {
                    if (this.drawPhotoImage) {
                        updateButtonState(false, false, false);
                    }
                } else {
                    updateButtonState(false, false, false);
                }
                this.animatedEmojiReplyStack = AnimatedEmojiSpan.update(0, (View) this, false, this.animatedEmojiReplyStack, this.replyTextLayout);
                this.animatedEmojiDescriptionStack = AnimatedEmojiSpan.update(0, (View) this, false, this.animatedEmojiDescriptionStack, this.descriptionLayout);
                updateAnimatedEmojis();
            } else {
                this.radialProgress.onDetachedFromWindow();
                this.videoRadialProgress.onDetachedFromWindow();
                if (this.pollAvatarImages != null) {
                    int i3 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr3 = this.pollAvatarImages;
                        if (i3 >= imageReceiverArr3.length) {
                            break;
                        }
                        imageReceiverArr3[i3].onDetachedFromWindow();
                        i3++;
                    }
                }
                if (this.commentAvatarImages != null) {
                    int i4 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr4 = this.commentAvatarImages;
                        if (i4 >= imageReceiverArr4.length) {
                            break;
                        }
                        imageReceiverArr4[i4].onDetachedFromWindow();
                        i4++;
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
        int canDownloadMedia = DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject.messageOwner);
        TLRPC$Document document = messageObject.getDocument();
        if ((MessageObject.isStickerDocument(document) || MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isGifDocument(document) || MessageObject.isRoundVideoDocument(document)) || this.isSmallImage) {
            return;
        }
        TLRPC$PhotoSize closestPhotoSizeWithSize = document == null ? FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize()) : null;
        if (canDownloadMedia == 2 || (canDownloadMedia == 1 && messageObject.isVideo())) {
            if (canDownloadMedia != 2 && document != null && !messageObject.shouldEncryptPhotoOrVideo() && messageObject.canStreamVideo()) {
                FileLoader.getInstance(this.currentAccount).loadFile(document, messageObject, 1, 0);
            }
        } else if (canDownloadMedia != 0) {
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
        TLRPC$Document document = messageObject.getDocument();
        boolean z = true;
        if (!MessageObject.isStickerDocument(document) && !MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isGifDocument(document) && !MessageObject.isRoundVideoDocument(document)) {
            z = false;
        }
        if (z) {
            return;
        }
        if (document != null) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(document);
            return;
        }
        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(closestPhotoSizeWithSize);
        }
    }

    private void setMessageContent(org.telegram.messenger.MessageObject r72, org.telegram.messenger.MessageObject.GroupedMessages r73, boolean r74, boolean r75) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setMessageContent(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean, boolean):void");
    }

    public void lambda$setMessageContent$7(TLRPC$User tLRPC$User, int i, TLRPC$Chat tLRPC$Chat, long j) {
        if (tLRPC$User != null) {
            this.commentAvatarDrawables[i].setInfo(this.currentAccount, tLRPC$User);
            this.commentAvatarImages[i].setForUserOrChat(tLRPC$User, this.commentAvatarDrawables[i]);
        } else if (tLRPC$Chat != null) {
            this.commentAvatarDrawables[i].setInfo(this.currentAccount, tLRPC$Chat);
            this.commentAvatarImages[i].setForUserOrChat(tLRPC$Chat, this.commentAvatarDrawables[i]);
        } else {
            this.commentAvatarDrawables[i].setInfo(j, "", "");
        }
    }

    public static int lambda$setMessageContent$8(PollButton pollButton, PollButton pollButton2) {
        if (pollButton.decimal > pollButton2.decimal) {
            return -1;
        }
        if (pollButton.decimal < pollButton2.decimal) {
            return 1;
        }
        if (pollButton.decimal == pollButton2.decimal) {
            if (pollButton.percent > pollButton2.percent) {
                return 1;
            }
            return pollButton.percent < pollButton2.percent ? -1 : 0;
        }
        return 0;
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
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            Window window = findActivity == null ? null : findActivity.getWindow();
            if (window != null) {
                FlagSecureReason flagSecureReason = new FlagSecureReason(window, new FlagSecureReason.FlagSecureCondition() {
                    @Override
                    public final boolean run() {
                        boolean lambda$updateFlagSecure$9;
                        lambda$updateFlagSecure$9 = ChatMessageCell.this.lambda$updateFlagSecure$9();
                        return lambda$updateFlagSecure$9;
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

    public boolean lambda$updateFlagSecure$9() {
        TLRPC$Message tLRPC$Message;
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || (messageObject.type != 29 && !tLRPC$Message.noforwards && !messageObject.isVoiceOnce() && !this.currentMessageObject.hasRevealedExtendedMedia())) ? false : true;
    }

    public void checkVideoPlayback(boolean z, Bitmap bitmap) {
        if (this.currentMessageObject.isVideo()) {
            if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                this.photoImage.setAllowStartAnimation(false);
                this.photoImage.stopAnimation();
                return;
            }
            this.photoImage.setAllowStartAnimation(true);
            this.photoImage.startAnimation();
            return;
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
        int i;
        int i2;
        boolean z = false;
        if (this.isRoundVideo && this.isPlayingRound && MediaController.getInstance().isPlayingMessage(this.currentMessageObject) && ((this.lastTouchX - this.photoImage.getCenterX()) * (this.lastTouchX - this.photoImage.getCenterX())) + ((this.lastTouchY - this.photoImage.getCenterY()) * (this.lastTouchY - this.photoImage.getCenterY())) < (this.photoImage.getImageWidth() / 2.0f) * (this.photoImage.getImageWidth() / 2.0f) && (this.lastTouchX > this.photoImage.getCenterX() + (this.photoImage.getImageWidth() / 4.0f) || this.lastTouchX < this.photoImage.getCenterX() - (this.photoImage.getImageWidth() / 4.0f))) {
            boolean z2 = this.lastTouchX > this.photoImage.getCenterX();
            if (this.videoPlayerRewinder == null) {
                this.videoForwardDrawable = new VideoForwardDrawable(true);
                this.videoPlayerRewinder = new VideoPlayerRewinder() {
                    @Override
                    protected void onRewindCanceled() {
                        ChatMessageCell.this.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        ChatMessageCell.this.videoForwardDrawable.setShowing(false);
                    }

                    @Override
                    protected void updateRewindProgressUi(long j, float f, boolean z3) {
                        ChatMessageCell.this.videoForwardDrawable.setTime(Math.abs(j));
                        if (z3) {
                            ChatMessageCell.this.currentMessageObject.audioProgress = f;
                            ChatMessageCell.this.updatePlayingMessageProgress();
                        }
                    }

                    @Override
                    protected void onRewindStart(boolean z3) {
                        ChatMessageCell.this.videoForwardDrawable.setDelegate(new VideoForwardDrawable.VideoForwardDrawableDelegate() {
                            @Override
                            public void onAnimationEnd() {
                            }

                            @Override
                            public void invalidate() {
                                ChatMessageCell.this.invalidate();
                            }
                        });
                        ChatMessageCell.this.videoForwardDrawable.setOneShootAnimation(false);
                        ChatMessageCell.this.videoForwardDrawable.setLeftSide(!z3);
                        ChatMessageCell.this.videoForwardDrawable.setShowing(true);
                        ChatMessageCell.this.invalidate();
                    }
                };
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.videoPlayerRewinder.startRewind(MediaController.getInstance().getVideoPlayer(), z2, MediaController.getInstance().getPlaybackSpeed(false));
            return false;
        }
        Drawable drawable = this.replySelector;
        if (drawable != null) {
            this.replySelectorPressed = false;
            drawable.setState(StateSet.NOTHING);
            invalidate();
        }
        Drawable drawable2 = this.nameStatusSelector;
        if (drawable2 != null) {
            drawable2.setState(StateSet.NOTHING);
        }
        Drawable drawable3 = this.nameLayoutSelector;
        if (drawable3 != null) {
            drawable3.setState(StateSet.NOTHING);
        }
        Drawable drawable4 = this.boostCounterLayoutSelector;
        if (drawable4 != null) {
            drawable4.setState(StateSet.NOTHING);
        }
        resetCodeSelectors();
        ButtonBounce buttonBounce = this.replyBounce;
        if (buttonBounce != null) {
            buttonBounce.setPressed(false);
        }
        ButtonBounce buttonBounce2 = this.titleLabelBounce;
        if (buttonBounce2 != null) {
            buttonBounce2.setPressed(false);
        }
        ButtonBounce buttonBounce3 = this.factCheckWhatBounce;
        if (buttonBounce3 != null) {
            buttonBounce3.setPressed(false);
        }
        MessageTopicButton messageTopicButton = this.topicButton;
        if (messageTopicButton != null) {
            messageTopicButton.resetClick();
        }
        this.forwardNamePressed = false;
        ForwardBackground forwardBackground = this.forwardBg;
        if (forwardBackground != null) {
            forwardBackground.setPressed(false);
        }
        this.pressedEffect = false;
        ButtonBounce buttonBounce4 = this.effectDrawableBounce;
        if (buttonBounce4 != null) {
            buttonBounce4.setPressed(false);
        }
        if (this.pressedEmoji != null) {
            this.pressedEmoji = null;
        }
        LinkSpanDrawable linkSpanDrawable = this.pressedFactCheckLink;
        if (linkSpanDrawable != null) {
            if (linkSpanDrawable.getSpan() instanceof URLSpanMono) {
                this.hadLongPress = true;
                this.delegate.didPressUrl(this, this.pressedFactCheckLink.getSpan(), true);
                return true;
            } else if (this.pressedFactCheckLink.getSpan() instanceof URLSpanNoUnderline) {
                URLSpanNoUnderline uRLSpanNoUnderline = (URLSpanNoUnderline) this.pressedFactCheckLink.getSpan();
                if (ChatActivity.isClickableLink(uRLSpanNoUnderline.getURL()) || uRLSpanNoUnderline.getURL().startsWith("/")) {
                    this.hadLongPress = true;
                    this.delegate.didPressUrl(this, this.pressedFactCheckLink.getSpan(), true);
                    return true;
                }
            } else if (this.pressedFactCheckLink.getSpan() instanceof URLSpan) {
                this.hadLongPress = true;
                this.delegate.didPressUrl(this, this.pressedFactCheckLink.getSpan(), true);
                return true;
            }
        }
        LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
        if (linkSpanDrawable2 != null) {
            if (linkSpanDrawable2.getSpan() instanceof URLSpanMono) {
                this.hadLongPress = true;
                this.delegate.didPressUrl(this, this.pressedLink.getSpan(), true);
                return true;
            } else if (this.pressedLink.getSpan() instanceof URLSpanNoUnderline) {
                URLSpanNoUnderline uRLSpanNoUnderline2 = (URLSpanNoUnderline) this.pressedLink.getSpan();
                if (ChatActivity.isClickableLink(uRLSpanNoUnderline2.getURL()) || uRLSpanNoUnderline2.getURL().startsWith("/")) {
                    this.hadLongPress = true;
                    this.delegate.didPressUrl(this, this.pressedLink.getSpan(), true);
                    return true;
                }
            } else if (this.pressedLink.getSpan() instanceof URLSpan) {
                this.hadLongPress = true;
                this.delegate.didPressUrl(this, this.pressedLink.getSpan(), true);
                return true;
            }
        }
        resetPressedLink(-1);
        if (this.buttonPressed != 0 || this.miniButtonPressed != 0 || this.videoButtonPressed != 0 || this.pressedBotButton != -1) {
            this.buttonPressed = 0;
            this.miniButtonPressed = 0;
            this.videoButtonPressed = 0;
            this.pressedBotButton = -1;
            invalidate();
        }
        this.linkPreviewPressed = false;
        this.sideButtonPressed = false;
        this.pressedSideButton = 0;
        this.imagePressed = false;
        this.timePressed = false;
        this.gamePreviewPressed = false;
        this.giveawayMessageCell.setButtonPressed(false);
        this.giveawayResultsMessageCell.setButtonPressed(false);
        resetContactButtonsPressedState();
        if (this.pressedVoteButton != -1 || this.pollHintPressed || this.psaHintPressed || this.instantPressed || this.otherPressed || this.commentButtonPressed) {
            this.commentButtonPressed = false;
            this.instantPressed = false;
            setInstantButtonPressed(false);
            this.pressedVoteButton = -1;
            this.pollHintPressed = false;
            this.psaHintPressed = false;
            this.otherPressed = false;
            if (Build.VERSION.SDK_INT >= 21) {
                int i3 = 0;
                while (true) {
                    Drawable[] drawableArr = this.selectorDrawable;
                    if (i3 >= drawableArr.length) {
                        break;
                    }
                    if (drawableArr[i3] != null) {
                        drawableArr[i3].setState(StateSet.NOTHING);
                    }
                    i3++;
                }
                Drawable drawable5 = this.linkPreviewSelector;
                if (drawable5 != null) {
                    drawable5.setState(StateSet.NOTHING);
                }
            }
            ButtonBounce buttonBounce5 = this.linkPreviewBounce;
            if (buttonBounce5 != null) {
                buttonBounce5.setPressed(false);
            }
            invalidate();
        }
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        if (chatMessageCellDelegate != null) {
            if (this.avatarPressed) {
                TLRPC$User tLRPC$User = this.currentUser;
                if (tLRPC$User != null) {
                    if (tLRPC$User.id != 0) {
                        z = chatMessageCellDelegate.didLongPressUserAvatar(this, tLRPC$User, this.lastTouchX, this.lastTouchY);
                    }
                } else {
                    TLRPC$Chat tLRPC$Chat = this.currentChat;
                    if (tLRPC$Chat != null) {
                        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.currentMessageObject.messageOwner.fwd_from;
                        if (tLRPC$MessageFwdHeader != null) {
                            if ((tLRPC$MessageFwdHeader.flags & 16) != 0) {
                                i2 = tLRPC$MessageFwdHeader.saved_from_msg_id;
                            } else {
                                i2 = tLRPC$MessageFwdHeader.channel_post;
                            }
                            i = i2;
                        } else {
                            i = 0;
                        }
                        z = chatMessageCellDelegate.didLongPressChannelAvatar(this, tLRPC$Chat, i, this.lastTouchX, this.lastTouchY);
                    }
                }
            }
            if (!z) {
                this.delegate.didLongPress(this, this.lastTouchX, this.lastTouchY);
            }
        }
        return true;
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
                return;
            }
            setInvalidatesParent(true);
            invalidate();
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

    private boolean invalidateParentForce() {
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
        Runnable runnable = super.invalidateCallback;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.invalidateCallback;
        if (runnable2 != null) {
            runnable2.run();
            return;
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
        Runnable runnable = this.invalidateCallback;
        if (runnable != null) {
            runnable.run();
            return;
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

    public void setInvalidateCallback(Runnable runnable) {
        this.invalidateCallback = runnable;
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (this.currentMessageObject == null) {
            return;
        }
        Runnable runnable = this.invalidateCallback;
        if (runnable != null) {
            runnable.run();
            return;
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
        double duration = messageObject.getDuration();
        double d = f;
        Double.isNaN(d);
        messageObject.audioProgressSec = (int) (duration * d);
        updatePlayingMessageProgress();
    }

    public boolean isAnimatingPollAnswer() {
        return this.animatePollAnswerAlpha;
    }

    private void updateWaveform() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.updateWaveform():void");
    }

    private void updateSeekBarWaveformWidth(Canvas canvas) {
        int i;
        this.seekBarWaveformTranslateX = 0;
        int i2 = -AndroidUtilities.dp((this.hasLinkPreview ? 10 : 0) + 92);
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateBackgroundBoundsInner && ((i = this.documentAttachType) == 3 || i == 7)) {
            int i3 = this.backgroundWidth;
            int i4 = (int) ((i3 - transitionParams.toDeltaLeft) + transitionParams.toDeltaRight);
            int i5 = (int) ((i3 - transitionParams.deltaLeft) + transitionParams.deltaRight);
            if (this.isRoundVideo && !this.drawBackground) {
                i5 = (int) (i5 + (getVideoTranscriptionProgress() * AndroidUtilities.dp(8.0f)));
                i4 += AndroidUtilities.dp(8.0f);
            }
            TransitionParams transitionParams2 = this.transitionParams;
            if (transitionParams2.toDeltaLeft == 0.0f && transitionParams2.toDeltaRight == 0.0f) {
                i4 = i5;
            }
            SeekBarWaveform seekBarWaveform = this.seekBarWaveform;
            if (seekBarWaveform != null) {
                if (transitionParams2.animateUseTranscribeButton) {
                    seekBarWaveform.setSize(((i5 + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()))) - AndroidUtilities.dp(this.hasLinkPreview ? 10.0f : 0.0f), AndroidUtilities.dp(30.0f), i3 + i2 + (!this.useTranscribeButton ? -AndroidUtilities.dp(34.0f) : 0), i4 + i2 + (this.useTranscribeButton ? -AndroidUtilities.dp(34.0f) : 0));
                } else {
                    seekBarWaveform.setSize(((i5 + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress()))) - AndroidUtilities.dp(this.hasLinkPreview ? 10.0f : 0.0f), AndroidUtilities.dp(30.0f), (i3 + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())), (i4 + i2) - ((int) (AndroidUtilities.dp(34.0f) * getUseTranscribeButtonProgress())));
                }
            }
            SeekBar seekBar = this.seekBar;
            if (seekBar != null) {
                seekBar.setSize((i5 - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)))) - AndroidUtilities.dp((this.documentAttachType != 5 ? 72 : 65) + (this.hasLinkPreview ? 20 : 0)), AndroidUtilities.dp(30.0f));
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
            seekBar2.setSize((this.backgroundWidth - ((int) (getUseTranscribeButtonProgress() * AndroidUtilities.dp(34.0f)))) - AndroidUtilities.dp((this.documentAttachType != 5 ? 72 : 65) + (this.hasLinkPreview ? 20 : 0)), AndroidUtilities.dp(30.0f));
        }
    }

    private int createDocumentLayout(int i, MessageObject messageObject) {
        int i2;
        int i3 = i;
        if (messageObject.type == 0) {
            this.documentAttach = MessageObject.getMedia(messageObject.messageOwner).webpage.document;
        } else {
            this.documentAttach = messageObject.getDocument();
        }
        TLRPC$Document tLRPC$Document = this.documentAttach;
        int i4 = 0;
        if (tLRPC$Document == null) {
            return 0;
        }
        double d = 0.0d;
        if (MessageObject.isVoiceDocument(tLRPC$Document)) {
            this.documentAttachType = 3;
            int i5 = 0;
            while (true) {
                if (i5 >= this.documentAttach.attributes.size()) {
                    break;
                }
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = this.documentAttach.attributes.get(i5);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                    d = tLRPC$DocumentAttribute.duration;
                    break;
                }
                i5++;
            }
            AndroidUtilities.dp(94.0f);
            Math.ceil(Theme.chat_audioTimePaint.measureText("00:00"));
            this.availableTimeWidth = i3 - AndroidUtilities.dp(18.0f);
            measureTime(messageObject);
            int dp = AndroidUtilities.dp(174.0f) + this.timeWidth;
            if (!this.hasLinkPreview) {
                this.backgroundWidth = Math.min(i3, dp + ((int) Math.ceil(Theme.chat_audioTimePaint.measureText(AndroidUtilities.formatLongDuration((int) d)))));
            }
            this.seekBarWaveform.setMessageObject(messageObject);
            return 0;
        } else if (MessageObject.isVideoDocument(this.documentAttach)) {
            this.documentAttachType = 4;
            if (!messageObject.needDrawBluredPreview()) {
                updatePlayingMessageProgress();
                String format = String.format("%s", AndroidUtilities.formatFileSize(this.documentAttach.size));
                this.docTitleWidth = (int) Math.ceil(Theme.chat_infoPaint.measureText(format));
                this.docTitleLayout = new StaticLayout(format, Theme.chat_infoPaint, this.docTitleWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return 0;
        } else if (MessageObject.isMusicDocument(this.documentAttach)) {
            this.documentAttachType = 5;
            int dp2 = i3 - AndroidUtilities.dp(92.0f);
            if (dp2 < 0) {
                dp2 = AndroidUtilities.dp(100.0f);
            }
            int i6 = dp2;
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicTitle().replace('\n', ' '), Theme.chat_audioTitlePaint, i6 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.chat_audioTitlePaint, i6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.songLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.songX = -((int) Math.ceil(this.songLayout.getLineLeft(0)));
            }
            StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicAuthor().replace('\n', ' '), Theme.chat_audioPerformerPaint, i6, TextUtils.TruncateAt.END), Theme.chat_audioPerformerPaint, i6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.performerLayout = staticLayout2;
            if (staticLayout2.getLineCount() > 0) {
                this.performerX = -((int) Math.ceil(this.performerLayout.getLineLeft(0)));
            }
            while (true) {
                if (i4 >= this.documentAttach.attributes.size()) {
                    break;
                }
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute2 = this.documentAttach.attributes.get(i4);
                if (tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeAudio) {
                    d = tLRPC$DocumentAttribute2.duration;
                    break;
                }
                i4++;
            }
            int i7 = (int) d;
            int ceil = (int) Math.ceil(Theme.chat_audioTimePaint.measureText(AndroidUtilities.formatShortDuration(i7, i7)));
            AndroidUtilities.dp(86.0f);
            this.availableTimeWidth = this.backgroundWidth - AndroidUtilities.dp(28.0f);
            return ceil;
        } else if (MessageObject.isGifDocument(this.documentAttach, messageObject.hasValidGroupId())) {
            this.documentAttachType = 2;
            if (!messageObject.needDrawBluredPreview()) {
                String string = LocaleController.getString("AttachGif", R.string.AttachGif);
                this.infoWidth = (int) Math.ceil(Theme.chat_infoPaint.measureText(string));
                this.infoLayout = new StaticLayout(string, Theme.chat_infoPaint, this.infoWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                String format2 = String.format("%s", AndroidUtilities.formatFileSize(this.documentAttach.size));
                this.docTitleWidth = (int) Math.ceil(Theme.chat_infoPaint.measureText(format2));
                this.docTitleLayout = new StaticLayout(format2, Theme.chat_infoPaint, this.docTitleWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return 0;
        } else {
            String str = this.documentAttach.mime_type;
            boolean z = (str != null && (str.toLowerCase().startsWith("image/") || this.documentAttach.mime_type.toLowerCase().startsWith("video/mp4"))) || MessageObject.isDocumentHasThumb(this.documentAttach);
            this.drawPhotoImage = z;
            if (!z) {
                i3 += AndroidUtilities.dp(30.0f);
            }
            this.documentAttachType = 1;
            String documentFileName = FileLoader.getDocumentFileName(this.documentAttach);
            if (documentFileName.length() == 0) {
                documentFileName = LocaleController.getString("AttachDocument", R.string.AttachDocument);
            }
            StaticLayout createStaticLayout = StaticLayoutEx.createStaticLayout(documentFileName, Theme.chat_docNamePaint, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.MIDDLE, i3, 2, false);
            this.docTitleLayout = createStaticLayout;
            this.docTitleOffsetX = Integer.MIN_VALUE;
            if (createStaticLayout != null && createStaticLayout.getLineCount() > 0) {
                int i8 = 0;
                while (i4 < this.docTitleLayout.getLineCount()) {
                    i8 = Math.max(i8, (int) Math.ceil(this.docTitleLayout.getLineWidth(i4)));
                    this.docTitleOffsetX = Math.max(this.docTitleOffsetX, (int) Math.ceil(-this.docTitleLayout.getLineLeft(i4)));
                    i4++;
                }
                i2 = Math.min(i3, i8);
            } else {
                this.docTitleOffsetX = 0;
                i2 = i3;
            }
            int dp3 = i3 - AndroidUtilities.dp(30.0f);
            TextPaint textPaint = Theme.chat_infoPaint;
            int min = Math.min(dp3, (int) Math.ceil(textPaint.measureText("000.0 mm / " + AndroidUtilities.formatFileSize(this.documentAttach.size))));
            this.infoWidth = min;
            CharSequence ellipsize = TextUtils.ellipsize(AndroidUtilities.formatFileSize(this.documentAttach.size) + " " + FileLoader.getDocumentExtension(this.documentAttach), Theme.chat_infoPaint, (float) min, TextUtils.TruncateAt.END);
            try {
                if (this.infoWidth < 0) {
                    this.infoWidth = AndroidUtilities.dp(10.0f);
                }
                this.infoLayout = new StaticLayout(ellipsize, Theme.chat_infoPaint, this.infoWidth + AndroidUtilities.dp(6.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (this.drawPhotoImage) {
                this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320);
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
                this.currentPhotoObjectThumb = closestPhotoSizeWithSize;
                TLRPC$PhotoSize tLRPC$PhotoSize = this.currentPhotoObject;
                if (tLRPC$PhotoSize == null || tLRPC$PhotoSize == closestPhotoSizeWithSize) {
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
            return i2;
        }
    }

    private void calcBackgroundWidth(int r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.calcBackgroundWidth(int, int, int):void");
    }

    public boolean setHighlightedText(String str) {
        return setHighlightedText(str, false, -1, false);
    }

    public boolean setHighlightedText(java.lang.String r18, boolean r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setHighlightedText(java.lang.String, boolean, int, boolean):boolean");
    }

    private void highlight(int i, int i2, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        if (arrayList == null) {
            return;
        }
        int i3 = i2 - i;
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                break;
            }
            MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i4);
            if (i < textLayoutBlock.charactersOffset || i >= textLayoutBlock.charactersEnd) {
                i4++;
            } else {
                this.linkSelectionBlockNum = i4;
                resetUrlPaths();
                try {
                    LinkPath obtainNewUrlPath = obtainNewUrlPath();
                    obtainNewUrlPath.setUseCornerPathImplementation(true);
                    obtainNewUrlPath.setCurrentLayout(textLayoutBlock.textLayout, i, 0.0f);
                    textLayoutBlock.textLayout.getSelectionPath(i, i2, obtainNewUrlPath);
                    obtainNewUrlPath.closeRects();
                    float f = textLayoutBlock.height + textLayoutBlock.padBottom;
                    if (i2 >= textLayoutBlock.charactersOffset + i3) {
                        for (int i5 = i4 + 1; i5 < arrayList.size(); i5++) {
                            MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList.get(i5);
                            int i6 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                            LinkPath obtainNewUrlPath2 = obtainNewUrlPath();
                            obtainNewUrlPath2.setUseCornerPathImplementation(true);
                            float f2 = f + textLayoutBlock2.padTop;
                            obtainNewUrlPath2.setCurrentLayout(textLayoutBlock2.textLayout, 0, f2);
                            f = f2 + textLayoutBlock2.height + textLayoutBlock2.padBottom;
                            textLayoutBlock2.textLayout.getSelectionPath(0, i2 - textLayoutBlock2.charactersOffset, obtainNewUrlPath2);
                            obtainNewUrlPath2.closeRects();
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

    public boolean setHighlightedSpan(CharacterStyle characterStyle) {
        int i;
        int i2;
        int i3;
        int i4;
        MessageObject messageObject = this.messageObjectToSet;
        if (messageObject == null) {
            messageObject = this.currentMessageObject;
        }
        this.highlightedQuote = false;
        if (messageObject == null || messageObject.messageOwner.message == null || characterStyle == null) {
            if (!this.urlPathSelection.isEmpty()) {
                this.linkSelectionBlockNum = -1;
                this.highlightedQuote = false;
                resetUrlPaths();
                invalidate();
            }
            return false;
        }
        if (this.captionLayout != null && !TextUtils.isEmpty(messageObject.caption)) {
            CharSequence charSequence = messageObject.caption;
            if (charSequence instanceof Spannable) {
                Spanned spanned = (Spanned) charSequence;
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length > 0) {
                    for (CharacterStyle characterStyle2 : characterStyleArr) {
                        if (characterStyle2 == characterStyle) {
                            i4 = spanned.getSpanStart(characterStyle);
                            i3 = spanned.getSpanEnd(characterStyle);
                            break;
                        }
                    }
                }
                i3 = -1;
                i4 = -1;
                if (i4 >= 0 && i3 >= 0) {
                    int i5 = i3 - i4;
                    for (int i6 = 0; i6 < this.captionLayout.textLayoutBlocks.size(); i6++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = this.captionLayout.textLayoutBlocks.get(i6);
                        if (i4 >= textLayoutBlock.charactersOffset && i4 < textLayoutBlock.charactersEnd) {
                            this.linkSelectionBlockNum = i6;
                            this.highlightedQuote = false;
                            resetUrlPaths();
                            try {
                                LinkPath obtainNewUrlPath = obtainNewUrlPath();
                                obtainNewUrlPath.setCurrentLayout(textLayoutBlock.textLayout, i4, 0.0f);
                                textLayoutBlock.textLayout.getSelectionPath(i4, i3, obtainNewUrlPath);
                                if (i3 >= textLayoutBlock.charactersOffset + i5) {
                                    for (int i7 = i6 + 1; i7 < this.captionLayout.textLayoutBlocks.size(); i7++) {
                                        MessageObject.TextLayoutBlock textLayoutBlock2 = this.captionLayout.textLayoutBlocks.get(i7);
                                        int i8 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                                        LinkPath obtainNewUrlPath2 = obtainNewUrlPath();
                                        obtainNewUrlPath2.setCurrentLayout(textLayoutBlock2.textLayout, 0, textLayoutBlock2.height);
                                        textLayoutBlock2.textLayout.getSelectionPath(0, i3 - textLayoutBlock2.charactersOffset, obtainNewUrlPath2);
                                        if (i3 < (textLayoutBlock.charactersOffset + i8) - 1) {
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            invalidate();
                            return true;
                        }
                    }
                }
            }
        }
        CharSequence charSequence2 = messageObject.messageText;
        if ((charSequence2 instanceof Spanned) && messageObject.textLayoutBlocks != null) {
            Spanned spanned2 = (Spanned) charSequence2;
            CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spanned2.getSpans(0, spanned2.length(), CharacterStyle.class);
            if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                for (CharacterStyle characterStyle3 : characterStyleArr2) {
                    if (characterStyle3 == characterStyle) {
                        i2 = spanned2.getSpanStart(characterStyle);
                        i = spanned2.getSpanEnd(characterStyle);
                        break;
                    }
                }
            }
            i = -1;
            i2 = -1;
            if (i2 >= 0 && i >= 0) {
                int i9 = i - i2;
                for (int i10 = 0; i10 < messageObject.textLayoutBlocks.size(); i10++) {
                    MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(i10);
                    if (i2 >= textLayoutBlock3.charactersOffset && i2 < textLayoutBlock3.charactersEnd) {
                        this.linkSelectionBlockNum = i10;
                        this.highlightedQuote = false;
                        resetUrlPaths();
                        try {
                            LinkPath obtainNewUrlPath3 = obtainNewUrlPath();
                            obtainNewUrlPath3.setCurrentLayout(textLayoutBlock3.textLayout, i2, 0.0f);
                            textLayoutBlock3.textLayout.getSelectionPath(i2, i, obtainNewUrlPath3);
                            if (i >= textLayoutBlock3.charactersOffset + i9) {
                                for (int i11 = i10 + 1; i11 < messageObject.textLayoutBlocks.size(); i11++) {
                                    MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(i11);
                                    int i12 = textLayoutBlock4.charactersEnd - textLayoutBlock4.charactersOffset;
                                    LinkPath obtainNewUrlPath4 = obtainNewUrlPath();
                                    obtainNewUrlPath4.setCurrentLayout(textLayoutBlock4.textLayout, 0, textLayoutBlock4.height);
                                    textLayoutBlock4.textLayout.getSelectionPath(0, i - textLayoutBlock4.charactersOffset, obtainNewUrlPath4);
                                    if (i < (textLayoutBlock3.charactersOffset + i12) - 1) {
                                        break;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                        invalidate();
                        return true;
                    }
                }
            }
        }
        if (!this.urlPathSelection.isEmpty()) {
            this.linkSelectionBlockNum = -1;
            this.highlightedQuote = false;
            resetUrlPaths();
            invalidate();
        }
        return false;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        ReactionsLayoutInBubble reactionsLayoutInBubble;
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.selectorDrawable;
            if (drawable != drawableArr[0] && drawable != drawableArr[1] && drawable != this.linkPreviewSelector && drawable != this.nameLayoutSelector && drawable != this.replySelector && (((reactionsLayoutInBubble = this.reactionsLayoutInBubble) == null || !reactionsLayoutInBubble.verifyDrawable(drawable)) && !(drawable instanceof LoadingDrawable))) {
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
        boolean isCurrentLocationTimeExpired;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || (isCurrentLocationTimeExpired = isCurrentLocationTimeExpired(messageObject)) == this.locationExpired) {
            return;
        }
        this.locationExpired = isCurrentLocationTimeExpired;
        if (!isCurrentLocationTimeExpired) {
            AndroidUtilities.runOnUIThread(this.invalidateRunnable, 1000L);
            this.scheduledInvalidate = true;
            int dp = this.backgroundWidth - AndroidUtilities.dp(91.0f);
            this.docTitleLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), Theme.chat_locationTitlePaint, dp, TextUtils.TruncateAt.END), Theme.chat_locationTitlePaint, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        this.currentMessageObject = null;
        setMessageObject(messageObject2, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop);
    }

    public void setIsUpdating(boolean z) {
        this.isUpdating = true;
    }

    public void setMessageObject(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z, boolean z2) {
        if (this.attachedToWindow && !this.frozen) {
            setMessageContent(messageObject, groupedMessages, z, z2);
            return;
        }
        this.messageObjectToSet = messageObject;
        this.groupedMessagesToSet = groupedMessages;
        this.bottomNearToSet = z;
        this.topNearToSet = z2;
    }

    private int getAdditionalWidthForPosition(MessageObject.GroupedMessagePosition groupedMessagePosition) {
        if (groupedMessagePosition != null) {
            int dp = (groupedMessagePosition.flags & 2) == 0 ? 0 + AndroidUtilities.dp(4.0f) : 0;
            return (groupedMessagePosition.flags & 1) == 0 ? dp + AndroidUtilities.dp(4.0f) : dp;
        }
        return 0;
    }

    public void createSelectorDrawable(final int i) {
        int themedColor;
        ReplyMessageLine replyMessageLine;
        ReplyMessageLine replyMessageLine2;
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
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
        Drawable[] drawableArr = this.selectorDrawable;
        if (drawableArr[i] == null) {
            this.selectorMaskDrawable[i] = new MaskDrawable() {
                {
                    super();
                }

                @Override
                public void updatePath() {
                    Rect bounds = getBounds();
                    this.rect.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                    this.path.rewind();
                    if (ChatMessageCell.this.selectorDrawableMaskType[i] != 3 && ChatMessageCell.this.selectorDrawableMaskType[i] != 4) {
                        if (ChatMessageCell.this.selectorDrawableMaskType[i] == 2) {
                            boolean z = ChatMessageCell.this.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.isOutOwner();
                            for (int i2 = 0; i2 < 4; i2++) {
                                if (!ChatMessageCell.this.instantTextNewLine) {
                                    if (i2 == (z ? 3 : 2)) {
                                        float[] fArr = ChatMessageCell.radii;
                                        int i3 = i2 * 2;
                                        float dp = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                                        ChatMessageCell.radii[i3 + 1] = dp;
                                        fArr[i3] = dp;
                                    } else if (((ChatMessageCell.this.mediaBackground && ChatMessageCell.this.currentPosition == null) || ChatMessageCell.this.pinnedBottom) && (i2 == 2 || i2 == 3)) {
                                        float[] fArr2 = ChatMessageCell.radii;
                                        int i4 = i2 * 2;
                                        float[] fArr3 = ChatMessageCell.radii;
                                        int i5 = i4 + 1;
                                        float dp2 = AndroidUtilities.dp(ChatMessageCell.this.pinnedBottom ? Math.min(5, SharedConfig.bubbleRadius) : SharedConfig.bubbleRadius);
                                        fArr3[i5] = dp2;
                                        fArr2[i4] = dp2;
                                    }
                                }
                                float[] fArr4 = ChatMessageCell.radii;
                                int i6 = i2 * 2;
                                ChatMessageCell.radii[i6 + 1] = 0.0f;
                                fArr4[i6] = 0.0f;
                            }
                            if (!z) {
                                ChatMessageCell chatMessageCell = ChatMessageCell.this;
                                if (!chatMessageCell.drawPinnedBottom && chatMessageCell.currentPosition == null && (ChatMessageCell.this.currentPosition == null || ChatMessageCell.this.pollInstantViewTouchesBottom)) {
                                    this.path.moveTo(this.rect.left + AndroidUtilities.dp(6.0f), this.rect.top);
                                    this.path.lineTo(this.rect.left + AndroidUtilities.dp(6.0f), (this.rect.bottom - AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(5.0f));
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(this.rect.left + AndroidUtilities.dp(-7.0f), this.rect.bottom - AndroidUtilities.dp(23.0f), this.rect.left + AndroidUtilities.dp(6.0f), this.rect.bottom);
                                    this.path.arcTo(rectF, 0.0f, 83.0f, false);
                                    RectF rectF2 = this.rect;
                                    rectF.set(this.rect.right - (ChatMessageCell.radii[4] * 2.0f), this.rect.bottom - (ChatMessageCell.radii[5] * 2.0f), rectF2.right, rectF2.bottom);
                                    this.path.arcTo(rectF, 90.0f, -90.0f, false);
                                    Path path = this.path;
                                    RectF rectF3 = this.rect;
                                    path.lineTo(rectF3.right, rectF3.top);
                                    this.path.close();
                                    this.path.close();
                                    return;
                                }
                            }
                            this.path.addRoundRect(this.rect, ChatMessageCell.radii, Path.Direction.CW);
                            this.path.close();
                            return;
                        }
                        float dp3 = ChatMessageCell.this.selectorDrawableMaskType[i] == 0 ? AndroidUtilities.dp(6.0f) : 0.0f;
                        this.path.addRoundRect(this.rect, dp3, dp3, Path.Direction.CW);
                        return;
                    }
                    this.path.addCircle(this.rect.centerX(), this.rect.centerY(), AndroidUtilities.dp(ChatMessageCell.this.selectorDrawableMaskType[i] == 3 ? 16.0f : 20.0f), Path.Direction.CW);
                }
            };
            int[][] iArr = {StateSet.WILD_CARD};
            int[] iArr2 = new int[1];
            iArr2[0] = 436207615 & getThemedColor(this.currentMessageObject.isOutOwner() ? Theme.key_chat_outPreviewInstantText : Theme.key_chat_inPreviewInstantText);
            this.selectorDrawable[i] = new BaseCell.RippleDrawableSafe(new ColorStateList(iArr, iArr2), null, this.selectorMaskDrawable[i]);
            this.selectorDrawable[i].setCallback(this);
        } else {
            Theme.setSelectorDrawableColor(drawableArr[i], themedColor & 436207615, true);
        }
        this.selectorDrawable[i].setVisible(true, false);
    }

    public static class MaskDrawable extends Drawable {
        protected final Paint maskPaint;
        public final Path path;
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

        public void updatePath() {
            throw null;
        }

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
        int measureText;
        if (Build.VERSION.SDK_INT >= 21 && this.drawInstantView) {
            createSelectorDrawable(0);
        }
        if (this.drawInstantView && this.instantViewLayout == null) {
            this.instantWidth = AndroidUtilities.dp(33.0f);
            String str = this.instantViewButtonText;
            if (str == null) {
                int i = this.drawInstantViewType;
                if (i == 12) {
                    str = LocaleController.getString(R.string.OpenChannelPost);
                } else if (i == 1) {
                    str = LocaleController.getString(R.string.OpenChannel);
                } else if (i == 13) {
                    str = LocaleController.getString(R.string.SendMessage).toUpperCase();
                } else if (i == 10) {
                    str = LocaleController.getString(R.string.OpenBot);
                } else if (i == 2) {
                    str = LocaleController.getString(R.string.OpenGroup);
                } else if (i == 3) {
                    str = LocaleController.getString(R.string.OpenMessage);
                } else if (i == 5) {
                    str = LocaleController.getString(R.string.ViewContact);
                } else if (i == 6) {
                    str = LocaleController.getString(R.string.OpenBackground);
                } else if (i == 7) {
                    str = LocaleController.getString(R.string.OpenTheme);
                } else if (i == 8) {
                    if (this.pollVoted || this.pollClosed) {
                        str = LocaleController.getString(R.string.PollViewResults);
                    } else {
                        str = LocaleController.getString(R.string.PollSubmitVotes);
                    }
                } else if (i == 9 || i == 11) {
                    TLRPC$TL_webPage tLRPC$TL_webPage = (TLRPC$TL_webPage) MessageObject.getMedia(this.currentMessageObject.messageOwner).webpage;
                    if (tLRPC$TL_webPage != null && tLRPC$TL_webPage.url.contains("voicechat=")) {
                        str = LocaleController.getString(R.string.VoipGroupJoinAsSpeaker);
                    } else {
                        str = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                    }
                } else if (i == 25) {
                    str = LocaleController.getString(R.string.VoipGroupJoinAsLinstener);
                } else if (i == 14) {
                    str = LocaleController.getString(R.string.ViewChatList).toUpperCase();
                } else if (i == 15) {
                    str = LocaleController.getString(R.string.BotWebAppInstantViewOpen).toUpperCase();
                } else if (i == 16) {
                    str = LocaleController.getString(R.string.OpenLink).toUpperCase();
                } else if (i == 17) {
                    str = LocaleController.getString(R.string.ViewStory).toUpperCase();
                } else if (i == 18 || i == 22) {
                    str = LocaleController.getString(R.string.BoostLinkButton);
                } else if (i == 19) {
                    str = LocaleController.getString(R.string.BoostingHowItWork);
                } else if (i == 20) {
                    str = LocaleController.getString(R.string.OpenGift);
                } else if (i == 21) {
                    str = LocaleController.getString(R.string.AppUpdate);
                } else if (i == 23) {
                    str = LocaleController.getString(R.string.OpenStickerSet);
                } else if (i == 24) {
                    str = LocaleController.getString(R.string.OpenEmojiSet);
                } else {
                    str = LocaleController.getString(R.string.InstantView);
                }
            }
            if (this.currentMessageObject.isSponsored() && this.backgroundWidth < (measureText = (int) (Theme.chat_instantViewPaint.measureText(str) + AndroidUtilities.dp(75.0f)))) {
                this.backgroundWidth = measureText;
            }
            int dp = this.backgroundWidth - AndroidUtilities.dp(75.0f);
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(str, Theme.chat_instantViewPaint, dp, TextUtils.TruncateAt.END), Theme.chat_instantViewPaint, dp + AndroidUtilities.dp(2.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.instantViewLayout = staticLayout;
            this.instantViewLayoutWidth = staticLayout.getLineCount() > 0 ? this.instantViewLayout.getLineWidth(0) : 0.0f;
            this.instantViewLayoutLeft = this.instantViewLayout.getLineCount() > 0 ? this.instantViewLayout.getLineLeft(0) : 0.0f;
            this.instantWidth = this.backgroundWidth - AndroidUtilities.dp(this.drawInstantViewType == 8 ? 13.0f : 34.0f);
            int dp2 = this.totalHeight + AndroidUtilities.dp(46.0f);
            this.totalHeight = dp2;
            if (this.currentMessageObject.type == 12) {
                this.totalHeight = dp2 + AndroidUtilities.dp(14.0f);
            }
            if (this.currentMessageObject.isSponsored()) {
                this.totalHeight += AndroidUtilities.dp(2.0f);
            }
            StaticLayout staticLayout2 = this.instantViewLayout;
            if (staticLayout2 == null || staticLayout2.getLineCount() <= 0) {
                return;
            }
            double d = this.instantWidth;
            double ceil = Math.ceil(this.instantViewLayout.getLineWidth(0));
            Double.isNaN(d);
            this.instantTextX = (((int) (d - ceil)) / 2) + (this.drawInstantViewType == 0 ? AndroidUtilities.dp(8.0f) : 0);
            int lineLeft = (int) this.instantViewLayout.getLineLeft(0);
            this.instantTextLeftX = lineLeft;
            this.instantTextX += -lineLeft;
        }
    }

    private void createContactButtons() {
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            createSelectorDrawable(0);
        }
        if (this.drawContact) {
            boolean z = this.drawContactView;
            if (this.drawContactSendMessage) {
                boolean z2 = (z ? 1 : 0) | true;
                i = (z ? 1 : 0) + 1;
                z = z2;
            } else {
                i = z ? 1 : 0;
            }
            if (this.drawContactAdd) {
                z = (z ? 1 : 0) | true;
                i++;
            }
            if (i == 0) {
                this.contactButtons = null;
                this.drawnContactButtonsFlag = 0;
                return;
            }
            this.totalHeight += AndroidUtilities.dp(60.0f);
            if (z != this.drawnContactButtonsFlag) {
                this.drawnContactButtonsFlag = 0;
                int dp = (this.backgroundWidth - AndroidUtilities.dp(75.0f)) / i;
                float dpf2 = (this.backgroundWidth - AndroidUtilities.dpf2(37.0f)) / i;
                ArrayList<InstantViewButton> arrayList = this.contactButtons;
                if (arrayList == null) {
                    this.contactButtons = new ArrayList<>(i);
                } else {
                    arrayList.clear();
                }
                if (this.drawContactView) {
                    this.drawnContactButtonsFlag = 1 | this.drawnContactButtonsFlag;
                    this.contactButtons.add(createInstantViewButton(5, LocaleController.getString("ViewContact", R.string.ViewContact), dp, dpf2));
                }
                if (this.drawContactSendMessage) {
                    this.drawnContactButtonsFlag |= 2;
                    this.contactButtons.add(createInstantViewButton(30, LocaleController.getString("SharedContactMessage", R.string.SharedContactMessage), dp, dpf2));
                }
                if (this.drawContactAdd) {
                    this.drawnContactButtonsFlag |= 4;
                    this.contactButtons.add(createInstantViewButton(31, LocaleController.getString("SharedContactAdd", R.string.SharedContactAdd), dp, dpf2));
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
            double d = instantViewButton.buttonWidth;
            double ceil = Math.ceil(instantViewButton.layout.getLineWidth(0));
            Double.isNaN(d);
            instantViewButton.textX = ((float) (d - ceil)) / 2.0f;
            InstantViewButton.access$5024(instantViewButton, (int) instantViewButton.layout.getLineLeft(0));
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
            setMessageObject(messageObject2, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop);
            this.inLayout = false;
        }
        updateSelectionTextPosition();
        setMeasuredDimension(isWidthAdaptive() ? getBoundsRight() - getBoundsLeft() : View.MeasureSpec.getSize(i), this.totalHeight + this.keyboardHeight);
    }

    public void forceResetMessageObject() {
        MessageObject messageObject = this.messageObjectToSet;
        if (messageObject == null) {
            messageObject = this.currentMessageObject;
        }
        this.currentMessageObject = null;
        setMessageObject(messageObject, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop);
    }

    private int getGroupPhotosWidth() {
        int parentWidth = getParentWidth();
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.preview) {
            parentWidth = this.parentWidth;
        }
        if (AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
            return parentWidth;
        }
        if (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2) {
            int i = (parentWidth / 100) * 35;
            if (i < AndroidUtilities.dp(320.0f)) {
                i = AndroidUtilities.dp(320.0f);
            }
            return parentWidth - i;
        }
        return parentWidth;
    }

    public int getExtraTextX() {
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
            return (int) ((AndroidUtilities.roundPlayingMessageSize - AndroidUtilities.roundMessageSize) * 0.7f);
        }
        return 0;
    }

    @Override
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int dp;
        int dp2;
        MessageObject messageObject;
        int i7;
        int dp3;
        int i8;
        int i9;
        int dp4;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        int dp5;
        int dp6;
        int i10;
        int dp7;
        int i11;
        int i12;
        int dp8;
        int dp9;
        MessageObject.TextLayoutBlocks textLayoutBlocks3;
        MessageObject.TextLayoutBlocks textLayoutBlocks4;
        MessageObject.TextLayoutBlocks textLayoutBlocks5;
        int dp10;
        int dp11;
        int dp12;
        if (this.currentMessageObject == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        int i13 = 0;
        if (this.lastSize != measuredHeight || !this.wasLayout) {
            this.layoutWidth = getMeasuredWidth();
            this.layoutHeight = getMeasuredHeight() - this.substractBackgroundHeight;
            if (this.timeTextWidth < 0) {
                this.timeTextWidth = AndroidUtilities.dp(10.0f);
            }
            if (this.currentTimeString != null) {
                this.timeLayout = new StaticLayout(this.currentTimeString, Theme.chat_timePaint, this.timeTextWidth + AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                this.timeLayout = null;
            }
            if (this.mediaBackground) {
                if (this.currentMessageObject.isOutOwner()) {
                    this.timeX = (this.layoutWidth - this.timeWidth) - AndroidUtilities.dp(42.0f);
                } else {
                    this.timeX = (this.backgroundWidth - AndroidUtilities.dp(4.0f)) - this.timeWidth;
                    if (this.currentMessageObject.isAnyKindOfSticker()) {
                        this.timeX = Math.max(AndroidUtilities.dp(26.0f), this.timeX);
                    }
                    if (this.isAvatarVisible && !isWidthAdaptive()) {
                        this.timeX += AndroidUtilities.dp(48.0f);
                    }
                    MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
                    if (groupedMessagePosition != null && (i5 = groupedMessagePosition.leftSpanOffset) != 0) {
                        this.timeX += (int) Math.ceil((i5 / 1000.0f) * getGroupPhotosWidth());
                    }
                    if (this.captionLayout != null && this.currentPosition != null) {
                        this.timeX += AndroidUtilities.dp(4.0f);
                    }
                }
                if (SharedConfig.bubbleRadius >= 10 && this.captionLayout == null && (i6 = this.documentAttachType) != 7 && i6 != 6) {
                    this.timeX -= AndroidUtilities.dp(2.0f);
                }
            } else if (this.currentMessageObject.isOutOwner()) {
                this.timeX = (this.layoutWidth - this.timeWidth) - AndroidUtilities.dp(38.5f);
            } else {
                this.timeX = (this.backgroundWidth - AndroidUtilities.dp(9.0f)) - this.timeWidth;
                if (this.currentMessageObject.isAnyKindOfSticker()) {
                    this.timeX = Math.max(0, this.timeX);
                }
                if (this.isAvatarVisible && !isWidthAdaptive()) {
                    this.timeX += AndroidUtilities.dp(48.0f);
                }
                if (shouldDrawTimeOnMedia()) {
                    this.timeX -= AndroidUtilities.dp(7.0f);
                }
            }
            int extraTimeX = this.timeX - getExtraTimeX();
            this.timeX = extraTimeX;
            if (this.effectId != 0) {
                this.timeX = extraTimeX + AndroidUtilities.dp(18.0f);
            }
            if ((this.currentMessageObject.messageOwner.flags & 1024) != 0) {
                String str = this.currentViewsString;
                if (str == null) {
                    str = "";
                }
                this.viewsLayout = new StaticLayout(str, Theme.chat_timePaint, this.viewsTextWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                this.viewsLayout = null;
            }
            if (this.currentRepliesString != null && !this.currentMessageObject.scheduled) {
                this.repliesLayout = new StaticLayout(this.currentRepliesString, Theme.chat_timePaint, this.repliesTextWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                this.repliesLayout = null;
            }
            if (this.isAvatarVisible) {
                this.avatarImage.setImageCoords(AndroidUtilities.dp(this.currentMessageObject.isRepostPreview ? 15.0f : 6.0f), this.avatarImage.getImageY(), AndroidUtilities.dp(this.currentMessageObject.isRepostPreview ? 36.0f : 42.0f), AndroidUtilities.dp(this.currentMessageObject.isRepostPreview ? 36.0f : 42.0f));
            }
            if (this.currentMessageObject.type == 20 && this.currentUnlockString != null) {
                this.unlockLayout = new StaticLayout(this.currentUnlockString, Theme.chat_unlockExtendedMediaTextPaint, this.unlockTextWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int i14 = ((TLRPC$TL_messageExtendedMediaPreview) this.currentMessageObject.messageOwner.media.extended_media.get(0)).video_duration;
                if (i14 != 0) {
                    String formatDuration = AndroidUtilities.formatDuration(i14, false);
                    this.durationWidth = (int) Math.ceil(Theme.chat_durationPaint.measureText(formatDuration));
                    this.videoInfoLayout = new StaticLayout(formatDuration, Theme.chat_durationPaint, this.durationWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    this.videoInfoLayout = null;
                }
            } else {
                this.unlockLayout = null;
            }
            this.wasLayout = true;
        }
        this.lastSize = measuredHeight;
        if (this.currentMessageObject.type == 0) {
            this.textY = AndroidUtilities.dp(10.0f) + this.namesOffset;
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
                dp11 = this.textY + this.currentMessageObject.textHeight(this.transitionParams);
                dp12 = AndroidUtilities.dp(10.0f);
            } else {
                dp11 = this.linkPreviewY + this.linkPreviewHeight + AndroidUtilities.dp(this.drawInstantView ? 46.0f : 0.0f);
                dp12 = AndroidUtilities.dp(this.linkPreviewHeight > 0 ? 4.0f : -8.0f);
            }
            this.factCheckY = dp11 + dp12;
        }
        if (this.groupMedia != null) {
            if (this.currentMessageObject.isOutOwner()) {
                if (this.mediaBackground) {
                    dp10 = (this.layoutWidth - this.backgroundWidth) - AndroidUtilities.dp(3.0f);
                } else {
                    dp10 = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(6.0f);
                }
            } else if ((this.isChat || this.currentMessageObject.isRepostPreview) && this.isAvatarVisible && !this.isPlayingRound) {
                dp10 = AndroidUtilities.dp(63.0f);
            } else {
                dp10 = AndroidUtilities.dp(15.0f);
            }
            this.groupMedia.x = dp10 - AndroidUtilities.dp(2.0f);
        }
        if (this.isRoundVideo) {
            updatePlayingMessageProgress();
        }
        int i15 = this.documentAttachType;
        if (i15 == 3 || i15 == 7) {
            if (this.currentMessageObject.isOutOwner()) {
                this.seekBarX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(57.0f);
                this.buttonX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(14.0f);
                this.timeAudioX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(67.0f);
            } else if (needDrawAvatar()) {
                this.seekBarX = AndroidUtilities.dp(114.0f);
                this.buttonX = AndroidUtilities.dp(71.0f);
                this.timeAudioX = AndroidUtilities.dp(124.0f);
            } else {
                this.seekBarX = AndroidUtilities.dp(66.0f);
                this.buttonX = AndroidUtilities.dp(23.0f);
                this.timeAudioX = AndroidUtilities.dp(76.0f);
            }
            if (this.hasLinkPreview) {
                this.seekBarX += AndroidUtilities.dp(10.0f);
                this.buttonX += AndroidUtilities.dp(10.0f);
                this.timeAudioX += AndroidUtilities.dp(10.0f);
            }
            updateSeekBarWaveformWidth(null);
            this.seekBarY = AndroidUtilities.dp(13.0f) + this.namesOffset + this.mediaOffsetY + ((!this.captionAbove || (textLayoutBlocks2 = this.captionLayout) == null) ? 0 : textLayoutBlocks2.textHeight(this.transitionParams));
            int dp13 = AndroidUtilities.dp(13.0f) + this.namesOffset + this.mediaOffsetY + ((!this.captionAbove || (textLayoutBlocks = this.captionLayout) == null) ? 0 : textLayoutBlocks.textHeight(this.transitionParams));
            this.buttonY = dp13;
            RadialProgress2 radialProgress2 = this.radialProgress;
            int i16 = this.buttonX;
            radialProgress2.setProgressRect(i16, dp13, AndroidUtilities.dp(44.0f) + i16, this.buttonY + AndroidUtilities.dp(44.0f));
            updatePlayingMessageProgress();
            if (this.documentAttachType == 7) {
                MessageObject messageObject2 = this.currentMessageObject;
                if (messageObject2.type == 0 && (this.hasLinkPreview || this.hasGamePreview || this.hasInvoicePreview)) {
                    if (this.hasGamePreview) {
                        i7 = this.unmovedTextX - AndroidUtilities.dp(10.0f);
                    } else {
                        if (this.hasInvoicePreview) {
                            i9 = this.unmovedTextX;
                            dp4 = AndroidUtilities.dp(1.0f);
                        } else {
                            i9 = this.unmovedTextX;
                            dp4 = AndroidUtilities.dp(1.0f);
                        }
                        i7 = i9 + dp4;
                    }
                    if (this.isSmallImage) {
                        dp = i7 + this.backgroundWidth;
                        dp2 = AndroidUtilities.dp(81.0f);
                        dp -= dp2;
                    } else {
                        dp3 = this.hasInvoicePreview ? -AndroidUtilities.dp(6.3f) : AndroidUtilities.dp(10.0f);
                        dp = i7 + dp3;
                    }
                } else {
                    if (messageObject2.isOutOwner()) {
                        if (this.mediaBackground) {
                            dp = this.layoutWidth - this.backgroundWidth;
                            dp2 = AndroidUtilities.dp(3.0f);
                        } else {
                            i7 = this.layoutWidth - this.backgroundWidth;
                            dp3 = AndroidUtilities.dp(6.0f);
                            dp = i7 + dp3;
                        }
                    } else {
                        if ((this.isChat || ((messageObject = this.currentMessageObject) != null && messageObject.forceAvatar)) && this.isAvatarVisible && (!this.isPlayingRound || this.currentMessageObject.isVoiceTranscriptionOpen())) {
                            dp = AndroidUtilities.dp(63.0f);
                        } else {
                            dp = AndroidUtilities.dp(15.0f);
                        }
                        MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.currentPosition;
                        if (groupedMessagePosition2 != null && !groupedMessagePosition2.edge) {
                            dp2 = AndroidUtilities.dp(10.0f);
                        }
                    }
                    dp -= dp2;
                }
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = this.currentPosition;
                if (groupedMessagePosition3 != null) {
                    if ((groupedMessagePosition3.flags & 1) == 0) {
                        dp -= AndroidUtilities.dp(2.0f);
                    }
                    if (this.currentPosition.leftSpanOffset != 0) {
                        dp += (int) Math.ceil((i8 / 1000.0f) * getGroupPhotosWidth());
                    }
                }
                if (this.currentMessageObject.type != 0) {
                    dp -= AndroidUtilities.dp(2.0f);
                }
                if (this.currentMessageObject.isVoiceTranscriptionOpen()) {
                    dp += AndroidUtilities.dp(10.0f);
                }
                TransitionParams transitionParams = this.transitionParams;
                if (!transitionParams.imageChangeBoundsTransition || transitionParams.updatePhotoImageX) {
                    transitionParams.updatePhotoImageX = false;
                    ImageReceiver imageReceiver = this.photoImage;
                    imageReceiver.setImageCoords(dp, this.currentMessageObject.type != 5 ? this.linkPreviewY : imageReceiver.getImageY(), this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
                }
            }
        } else if (i15 == 5) {
            if (this.currentMessageObject.isOutOwner()) {
                this.seekBarX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(56.0f);
                this.buttonX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(14.0f);
                this.timeAudioX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(67.0f);
            } else if (needDrawAvatar()) {
                this.seekBarX = AndroidUtilities.dp(113.0f);
                this.buttonX = AndroidUtilities.dp(71.0f);
                this.timeAudioX = AndroidUtilities.dp(124.0f);
            } else {
                this.seekBarX = AndroidUtilities.dp(65.0f);
                this.buttonX = AndroidUtilities.dp(23.0f);
                this.timeAudioX = AndroidUtilities.dp(76.0f);
            }
            if (this.hasLinkPreview) {
                this.seekBarX += AndroidUtilities.dp(10.0f);
                this.buttonX += AndroidUtilities.dp(10.0f);
                this.timeAudioX += AndroidUtilities.dp(10.0f);
            }
            updateSeekBarWaveformWidth(null);
            this.seekBarY = AndroidUtilities.dp(29.0f) + this.namesOffset + this.mediaOffsetY + ((!this.captionAbove || (textLayoutBlocks5 = this.captionLayout) == null) ? 0 : textLayoutBlocks5.textHeight(this.transitionParams));
            int dp14 = AndroidUtilities.dp(13.0f) + this.namesOffset + this.mediaOffsetY;
            if (this.captionAbove && (textLayoutBlocks4 = this.captionLayout) != null) {
                i13 = textLayoutBlocks4.textHeight(this.transitionParams);
            }
            int i17 = dp14 + i13;
            this.buttonY = i17;
            RadialProgress2 radialProgress22 = this.radialProgress;
            int i18 = this.buttonX;
            radialProgress22.setProgressRect(i18, i17, AndroidUtilities.dp(44.0f) + i18, this.buttonY + AndroidUtilities.dp(44.0f));
            updatePlayingMessageProgress();
        } else if (i15 == 1 && !this.drawPhotoImage) {
            if (this.currentMessageObject.isOutOwner()) {
                this.buttonX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(14.0f);
            } else if (needDrawAvatar()) {
                this.buttonX = AndroidUtilities.dp(71.0f);
            } else {
                this.buttonX = AndroidUtilities.dp(23.0f);
            }
            if (this.hasLinkPreview) {
                this.buttonX += AndroidUtilities.dp(10.0f);
            }
            int dp15 = AndroidUtilities.dp(13.0f) + this.namesOffset + this.mediaOffsetY;
            if (this.captionAbove && (textLayoutBlocks3 = this.captionLayout) != null) {
                i13 = textLayoutBlocks3.textHeight(this.transitionParams);
            }
            int i19 = dp15 + i13;
            this.buttonY = i19;
            RadialProgress2 radialProgress23 = this.radialProgress;
            int i20 = this.buttonX;
            radialProgress23.setProgressRect(i20, i19, AndroidUtilities.dp(44.0f) + i20, this.buttonY + AndroidUtilities.dp(44.0f));
            this.photoImage.setImageCoords(this.buttonX - AndroidUtilities.dp(10.0f), this.buttonY - AndroidUtilities.dp(10.0f), this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
        } else {
            MessageObject messageObject3 = this.currentMessageObject;
            int i21 = messageObject3.type;
            if (i21 == 12) {
                if (messageObject3.isOutOwner()) {
                    dp9 = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(26.0f);
                } else if (needDrawAvatar()) {
                    dp9 = AndroidUtilities.dp(84.0f);
                } else {
                    dp9 = AndroidUtilities.dp(35.0f);
                }
                this.photoImage.setImageCoords(dp9, AndroidUtilities.dp(24.0f) + this.namesOffset, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f));
                return;
            }
            if (i21 == 0 && (this.hasLinkPreview || this.hasGamePreview || this.hasInvoicePreview)) {
                if (this.hasGamePreview) {
                    i10 = this.unmovedTextX - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.hasInvoicePreview) {
                        i12 = this.unmovedTextX;
                        dp8 = AndroidUtilities.dp(1.0f);
                    } else {
                        i12 = this.unmovedTextX;
                        dp8 = AndroidUtilities.dp(1.0f);
                    }
                    i10 = i12 + dp8;
                }
                if (this.isSmallImage) {
                    dp5 = i10 + this.backgroundWidth;
                    dp6 = AndroidUtilities.dp(81.0f);
                    dp5 -= dp6;
                } else {
                    dp7 = this.hasInvoicePreview ? -AndroidUtilities.dp(6.3f) : AndroidUtilities.dp(10.0f);
                    dp5 = i10 + dp7;
                }
            } else {
                if (messageObject3.isOutOwner()) {
                    if (this.mediaBackground) {
                        dp5 = this.layoutWidth - this.backgroundWidth;
                        dp6 = AndroidUtilities.dp(3.0f);
                    } else {
                        i10 = this.layoutWidth - this.backgroundWidth;
                        dp7 = AndroidUtilities.dp(6.0f);
                        dp5 = i10 + dp7;
                    }
                } else {
                    if ((this.isChat || this.currentMessageObject.isRepostPreview) && this.isAvatarVisible && !this.isPlayingRound) {
                        dp5 = AndroidUtilities.dp(63.0f);
                    } else {
                        dp5 = AndroidUtilities.dp(15.0f);
                    }
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = this.currentPosition;
                    if (groupedMessagePosition4 != null && !groupedMessagePosition4.edge) {
                        dp6 = AndroidUtilities.dp(10.0f);
                    }
                }
                dp5 -= dp6;
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition5 = this.currentPosition;
            if (groupedMessagePosition5 != null) {
                if ((groupedMessagePosition5.flags & 1) == 0) {
                    dp5 -= AndroidUtilities.dp(2.0f);
                }
                if (this.currentPosition.leftSpanOffset != 0) {
                    dp5 += (int) Math.ceil((i11 / 1000.0f) * getGroupPhotosWidth());
                }
            }
            if (this.currentMessageObject.type != 0) {
                dp5 -= AndroidUtilities.dp(2.0f);
            }
            if (this.drawInstantViewType == 17) {
                dp5 = (int) (dp5 + AndroidUtilities.dp(10.0f) + ((this.instantWidth - this.photoImage.getImageWidth()) / 2.0f));
            }
            TransitionParams transitionParams2 = this.transitionParams;
            if (!transitionParams2.imageChangeBoundsTransition || transitionParams2.updatePhotoImageX) {
                transitionParams2.updatePhotoImageX = false;
                ImageReceiver imageReceiver2 = this.photoImage;
                imageReceiver2.setImageCoords(dp5, imageReceiver2.getImageY(), this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
            }
            this.buttonX = (int) (dp5 + ((this.photoImage.getImageWidth() - AndroidUtilities.dp(48.0f)) / 2.0f));
            int imageY = (int) (this.photoImage.getImageY() + ((this.photoImage.getImageHeight() - AndroidUtilities.dp(48.0f)) / 2.0f));
            this.buttonY = imageY;
            RadialProgress2 radialProgress24 = this.radialProgress;
            int i22 = this.buttonX;
            radialProgress24.setProgressRect(i22, imageY, AndroidUtilities.dp(48.0f) + i22, this.buttonY + AndroidUtilities.dp(48.0f));
            this.deleteProgressRect.set(this.buttonX + AndroidUtilities.dp(5.0f), this.buttonY + AndroidUtilities.dp(5.0f), this.buttonX + AndroidUtilities.dp(43.0f), this.buttonY + AndroidUtilities.dp(43.0f));
            int i23 = this.documentAttachType;
            if (i23 == 4 || i23 == 2) {
                this.videoButtonX = (int) (this.photoImage.getImageX() + AndroidUtilities.dp(8.0f));
                int imageY2 = (int) (this.photoImage.getImageY() + AndroidUtilities.dp(8.0f));
                this.videoButtonY = imageY2;
                RadialProgress2 radialProgress25 = this.videoRadialProgress;
                int i24 = this.videoButtonX;
                radialProgress25.setProgressRect(i24, imageY2, AndroidUtilities.dp(24.0f) + i24, this.videoButtonY + AndroidUtilities.dp(24.0f));
            }
        }
    }

    public boolean needDelayRoundProgressDraw() {
        MessageObject messageObject;
        int i = this.documentAttachType;
        return (i == 7 || i == 4) && (messageObject = this.currentMessageObject) != null && messageObject.type != 5 && MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
    }

    public void drawRoundProgress(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawRoundProgress(android.graphics.Canvas):void");
    }

    private void updatePollAnimations(long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.updatePollAnimations(long):void");
    }

    public void drawContent(final android.graphics.Canvas r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawContent(android.graphics.Canvas, boolean):void");
    }

    public void lambda$drawContent$10(Canvas canvas) {
        this.radialProgress.draw(canvas);
    }

    public void startRevealMedia(float f, float f2) {
        float sqrt = (float) Math.sqrt(Math.pow(this.photoImage.getImageWidth(), 2.0d) + Math.pow(this.photoImage.getImageHeight(), 2.0d));
        this.mediaSpoilerRevealMaxRadius = sqrt;
        startRevealMedia(f, f2, sqrt);
    }

    private void startRevealMedia(float f, float f2, float f3) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject.isMediaSpoilersRevealed || this.mediaSpoilerRevealProgress != 0.0f) {
            return;
        }
        if (messageObject.type == 3) {
            messageObject.forceUpdate = true;
            messageObject.revealingMediaSpoilers = true;
            setMessageContent(messageObject, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop);
            MessageObject messageObject2 = this.currentMessageObject;
            messageObject2.revealingMediaSpoilers = false;
            messageObject2.forceUpdate = false;
            if (this.currentMessagesGroup != null) {
                this.radialProgress.setProgress(0.0f, false);
            }
        }
        this.mediaSpoilerRevealX = f;
        this.mediaSpoilerRevealY = f2;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(MathUtils.clamp(this.mediaSpoilerRevealMaxRadius * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatMessageCell.this.lambda$startRevealMedia$11(valueAnimator);
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

    public void lambda$startRevealMedia$11(ValueAnimator valueAnimator) {
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
        this.mediaSpoilerPath.addRoundRect(rectF, this.mediaSpoilerRadii, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.mediaSpoilerPath);
        if (this.mediaSpoilerRevealProgress != 0.0f) {
            this.mediaSpoilerPath.rewind();
            this.mediaSpoilerPath.addCircle(this.mediaSpoilerRevealX, this.mediaSpoilerRevealY, this.mediaSpoilerRevealMaxRadius * this.mediaSpoilerRevealProgress, Path.Direction.CW);
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
        if (this.mediaSpoilerEffect2 != null) {
            canvas.translate(this.photoImage.getImageX(), this.photoImage.getImageY());
            this.mediaSpoilerEffect2.draw(canvas, this, (int) this.photoImage.getImageWidth(), (int) this.photoImage.getImageHeight(), this.photoImage.getAlpha(), this.drawingToBitmap);
            invalidate();
            return;
        }
        this.mediaSpoilerEffect.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(-1) * 0.325f * this.photoImage.getAlpha())));
        this.mediaSpoilerEffect.setBounds((int) this.photoImage.getImageX(), (int) this.photoImage.getImageY(), (int) this.photoImage.getImageX2(), (int) this.photoImage.getImageY2());
        this.mediaSpoilerEffect.draw(canvas);
        invalidate();
    }

    private float getUseTranscribeButtonProgress() {
        TransitionParams transitionParams = this.transitionParams;
        if (!transitionParams.animateUseTranscribeButton) {
            return this.useTranscribeButton ? 1.0f : 0.0f;
        } else if (this.useTranscribeButton) {
            return transitionParams.animateChangeProgress;
        } else {
            return 1.0f - transitionParams.animateChangeProgress;
        }
    }

    public void updateReactionLayoutPosition() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.updateReactionLayoutPosition():void");
    }

    public float getPhotoBottom() {
        GroupMedia groupMedia = this.groupMedia;
        if (groupMedia != null) {
            return groupMedia.y + groupMedia.height;
        }
        return this.photoImage.getImageY2();
    }

    public void drawVoiceOnce(Canvas canvas, float f, Runnable runnable) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.isVoiceOnce()) {
            float centerX = this.radialProgress.progressRect.centerX();
            double lerp = AndroidUtilities.lerp(190, 45, f) / 180.0f;
            Double.isNaN(lerp);
            float cos = centerX + (((float) Math.cos(lerp * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f));
            float centerY = this.radialProgress.progressRect.centerY();
            double lerp2 = AndroidUtilities.lerp(190, 45, f) / 180.0f;
            Double.isNaN(lerp2);
            float sin = centerY + (((float) Math.sin(lerp2 * 3.141592653589793d)) * AndroidUtilities.dp(22.6274f));
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
                float centerX2 = this.radialProgress.progressRect.centerX();
                RectF rectF2 = this.radialProgress.progressRect;
                canvas.scale(f3, f3, centerX2, AndroidUtilities.lerp(rectF2.top, rectF2.bottom, 0.5f));
                if (this.onceFire == null) {
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.fire_once, "fire_once", AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), true, null);
                    this.onceFire = rLottieDrawable;
                    rLottieDrawable.setMasterParent(this);
                    this.onceFire.setAllowDecodeSingleFrame(true);
                    this.onceFire.setAutoRepeat(1);
                    this.onceFire.start();
                    this.onceFire.scaleByCanvas = true;
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
            canvas.drawCircle(cos, sin, AndroidUtilities.dp((f * 1.5f) + 10.0f) * f, this.onceClearPaint);
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
            canvas.saveLayerAlpha(cos - AndroidUtilities.dp(10.0f), sin - AndroidUtilities.dp(10.0f), cos + AndroidUtilities.dp(10.0f), sin + AndroidUtilities.dp(10.0f), 255, 31);
            canvas.drawCircle(cos, sin, AndroidUtilities.dp(10.0f) * f, this.radialProgress.circlePaint);
            this.oncePeriod.setClear(AndroidUtilities.computePerceivedBrightness(this.radialProgress.circlePaint.getColor()) > 0.8f);
            this.oncePeriod.setCenterXY(cos, sin);
            this.oncePeriod.draw(canvas, f);
            canvas.restore();
            return;
        }
        runnable.run();
    }

    public void drawLinkPreview(android.graphics.Canvas r47, float r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawLinkPreview(android.graphics.Canvas, float):void");
    }

    public void drawFactCheck(Canvas canvas, float f) {
        int dp;
        int extraTextX;
        int i;
        int dp2;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition == null || groupedMessagePosition.last) {
            float f2 = this.hasFactCheck ? 1.0f : 0.0f;
            TransitionParams transitionParams = this.transitionParams;
            if (transitionParams.animateFactCheck) {
                f2 = AndroidUtilities.lerp(1.0f - f2, f2, transitionParams.animateChangeProgress);
            }
            float f3 = f * f2;
            if (f3 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight();
            TransitionParams transitionParams2 = this.transitionParams;
            float dp3 = ((backgroundDrawableRight + (transitionParams2 != null ? transitionParams2.deltaRight : 0.0f)) - AndroidUtilities.dp(10 + ((!this.currentMessageObject.isOutOwner() || this.mediaBackground || this.drawPinnedBottom) ? 0 : 6))) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i = (int) this.captionX;
            } else if (this.currentMessageObject.isOutOwner()) {
                i = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                if (this.currentMessageObject.type == 19) {
                    i -= Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + i) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                }
            } else {
                if (this.mediaBackground) {
                    dp = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f);
                    extraTextX = getExtraTextX();
                } else {
                    dp = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
                    extraTextX = getExtraTextX();
                }
                i = dp + extraTextX;
            }
            int dp4 = ((int) (i + this.transitionParams.deltaLeft)) - AndroidUtilities.dp(1.33f);
            int i2 = this.factCheckY;
            float f4 = dp4;
            int i3 = (int) (dp3 - f4);
            int i4 = this.factCheckHeight;
            TransitionParams transitionParams3 = this.transitionParams;
            if (transitionParams3.animateFactCheckHeight) {
                i4 = AndroidUtilities.lerp(transitionParams3.animateFactCheckHeightFrom, i4, transitionParams3.animateChangeProgress);
            }
            float f5 = (!this.factCheckLarge || (getPrimaryMessageObject() != null && getPrimaryMessageObject().factCheckExpanded)) ? 1.0f : 0.0f;
            TransitionParams transitionParams4 = this.transitionParams;
            if (transitionParams4.animateFactCheckExpanded) {
                AndroidUtilities.lerp(1.0f - f5, f5, transitionParams4.animateChangeProgress);
            }
            if (this.factCheckLine == null) {
                this.factCheckLine = new ReplyMessageLine(this);
            }
            int factCheck = this.factCheckLine.setFactCheck(this.resourcesProvider);
            canvas.save();
            canvas.translate(f4, i2);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i3, i4);
            ButtonBounce buttonBounce = this.factCheckBounce;
            float scale = buttonBounce != null ? buttonBounce.getScale(0.01f) : 1.0f;
            canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
            this.factCheckLine.drawBackground(canvas, rectF, 5.0f, 5.0f, 5.0f, f3, false, false);
            this.factCheckLine.drawLine(canvas, rectF, f3);
            Text text = this.factCheckTitle;
            if (text != null) {
                text.draw(canvas, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(12.0f), factCheck, f3);
                if (this.factCheckWhat != null) {
                    rectF.set((int) (AndroidUtilities.dp(10.0f) + this.factCheckTitle.getCurrentWidth() + AndroidUtilities.dp(4.0f)), AndroidUtilities.dp(4.33f), AndroidUtilities.dp(10.0f) + dp2 + this.factCheckWhat.getCurrentWidth(), AndroidUtilities.dp(21.66f));
                    ButtonBounce buttonBounce2 = this.factCheckWhatBounce;
                    float scale2 = buttonBounce2 != null ? buttonBounce2.getScale(0.1f) : 1.0f;
                    canvas.save();
                    canvas.scale(scale2, scale2, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), this.factCheckLine.backgroundPaint);
                    this.factCheckWhat.draw(canvas, dp2 + AndroidUtilities.dp(5.0f), AndroidUtilities.dp(12.0f), factCheck, f3);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public void drawFactCheckText(Canvas canvas, float f) {
        int dp;
        int extraTextX;
        int i;
        float f2;
        int i2;
        float f3;
        float f4;
        RectF rectF;
        TextPaint textPaint;
        TextPaint textPaint2;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition == null || groupedMessagePosition.last) {
            float f5 = this.hasFactCheck ? 1.0f : 0.0f;
            TransitionParams transitionParams = this.transitionParams;
            if (transitionParams.animateFactCheck) {
                f5 = AndroidUtilities.lerp(1.0f - f5, f5, transitionParams.animateChangeProgress);
            }
            float f6 = f * f5;
            if (f6 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = getBackgroundDrawableRight();
            TransitionParams transitionParams2 = this.transitionParams;
            float dp2 = ((backgroundDrawableRight + (transitionParams2 != null ? transitionParams2.deltaRight : 0.0f)) - AndroidUtilities.dp(10 + ((!this.currentMessageObject.isOutOwner() || this.mediaBackground || this.drawPinnedBottom) ? 0 : 6))) - getExtraTextX();
            MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
            if (groupedMessages != null && !groupedMessages.isDocuments) {
                i = (int) this.captionX;
            } else {
                if (this.currentMessageObject.isOutOwner()) {
                    i = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                    if (this.currentMessageObject.type == 19) {
                        i -= Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + i) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                    }
                } else {
                    if (this.mediaBackground) {
                        dp = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f);
                        extraTextX = getExtraTextX();
                    } else {
                        dp = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f);
                        extraTextX = getExtraTextX();
                    }
                    i = dp + extraTextX;
                }
            }
            int dp3 = ((int) (i + this.transitionParams.deltaLeft)) - AndroidUtilities.dp(1.33f);
            int i3 = this.factCheckY;
            float f7 = dp3;
            int i4 = (int) (dp2 - f7);
            int i5 = this.factCheckHeight;
            TransitionParams transitionParams3 = this.transitionParams;
            if (transitionParams3.animateFactCheckHeight) {
                i5 = AndroidUtilities.lerp(transitionParams3.animateFactCheckHeightFrom, i5, transitionParams3.animateChangeProgress);
            }
            int i6 = i5;
            float f8 = (!this.factCheckLarge || (getPrimaryMessageObject() != null && getPrimaryMessageObject().factCheckExpanded)) ? 1.0f : 0.0f;
            TransitionParams transitionParams4 = this.transitionParams;
            if (transitionParams4.animateFactCheckExpanded) {
                f8 = AndroidUtilities.lerp(1.0f - f8, f8, transitionParams4.animateChangeProgress);
            }
            float f9 = f8;
            if (this.factCheckLine == null) {
                this.factCheckLine = new ReplyMessageLine(this);
            }
            int factCheck = this.factCheckLine.setFactCheck(this.resourcesProvider);
            canvas.save();
            canvas.translate(f7, i3);
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f10 = i4;
            float f11 = i6;
            rectF2.set(0.0f, 0.0f, f10, f11);
            ButtonBounce buttonBounce = this.factCheckBounce;
            float scale = buttonBounce != null ? buttonBounce.getScale(0.01f) : 1.0f;
            canvas.scale(scale, scale, rectF2.centerX(), rectF2.centerY());
            if (this.factCheckTextLayout != null) {
                if (this.factCheckLarge) {
                    f3 = f11;
                    f4 = f10;
                    rectF = rectF2;
                    f2 = f9;
                    i2 = factCheck;
                    canvas.saveLayerAlpha(0.0f, 0.0f, f10, i6 - 1, 255, 31);
                } else {
                    f3 = f11;
                    f4 = f10;
                    rectF = rectF2;
                    f2 = f9;
                    i2 = factCheck;
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dp(10.0f) - this.factCheckTextLayoutLeft, AndroidUtilities.dp(22.0f));
                Theme.chat_replyTextPaint.linkColor = i2;
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
                Theme.chat_replyTextPaint.setAlpha((int) (alpha * f6));
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate != null && chatMessageCellDelegate.getTextSelectionHelper() != null && getDelegate().getTextSelectionHelper().isSelected(this.currentMessageObject)) {
                    this.delegate.getTextSelectionHelper().drawFactCheck(this.currentMessageObject.isOutOwner(), this.factCheckTextLayout, canvas);
                }
                this.factCheckTextLayout.draw(canvas);
                canvas.restore();
                Theme.chat_replyTextPaint.setAlpha(alpha);
                rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(22.0f) + this.factCheckTextLayoutHeight + AndroidUtilities.dp(6.33f), i4 - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(22.0f) + this.factCheckTextLayoutHeight + AndroidUtilities.dp(6.33f) + 1);
                Theme.chat_titleLabelTextPaint.setColor(i2);
                Theme.chat_titleLabelTextPaint.setAlpha((int) (textPaint.getAlpha() * 0.5f * f6));
                canvas.drawRect(rectF, Theme.chat_titleLabelTextPaint);
                canvas.save();
                canvas.translate(AndroidUtilities.dp(10.0f) - this.factCheckText2LayoutLeft, AndroidUtilities.dp(22.0f) + this.factCheckTextLayoutHeight + AndroidUtilities.dp(12.66f));
                Theme.chat_titleLabelTextPaint.setColor(i2);
                Theme.chat_titleLabelTextPaint.setAlpha((int) (textPaint2.getAlpha() * f6));
                this.factCheckText2Layout.draw(canvas);
                canvas.restore();
                if (this.clip == null) {
                    this.clip = new GradientClip();
                }
                if (this.factCheckLarge) {
                    canvas.save();
                    int dp4 = AndroidUtilities.dp((AndroidUtilities.dp(22.0f) + this.factCheckTextLayoutHeight) + AndroidUtilities.dp(12.66f) < i6 ? 20.0f : 24.0f);
                    rectF.set(0.0f, (i6 - AndroidUtilities.dp(6.66f)) - dp4, f4, f3);
                    float f12 = (1.0f - f2) * f6;
                    this.clip.draw(canvas, rectF, 3, f12);
                    float f13 = i6 - dp4;
                    rectF.set(i4 - AndroidUtilities.dp(60.0f), f13, i4 - AndroidUtilities.dp(32.0f), f3);
                    this.clip.draw(canvas, rectF, 2, f12);
                    rectF.set(i4 - AndroidUtilities.dp(32.0f), f13, f4, f3);
                    canvas.drawRect(rectF, this.clip.getPaint(2, f12));
                    canvas.restore();
                    canvas.restore();
                }
            } else {
                f2 = f9;
                i2 = factCheck;
            }
            if (this.factCheckLarge) {
                if (this.factCheckArrow == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
                    this.factCheckArrow = mutate;
                    this.factCheckArrowColor = i2;
                    mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
                }
                if (i2 != this.factCheckArrowColor) {
                    Drawable drawable = this.factCheckArrow;
                    this.factCheckArrowColor = i2;
                    drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
                }
                canvas.save();
                int dp5 = AndroidUtilities.dp(16.0f);
                this.factCheckArrow.setBounds((i4 - dp5) - AndroidUtilities.dp(7.0f), (i6 - dp5) - AndroidUtilities.dp(5.0f), i4 - AndroidUtilities.dp(7.0f), i6 - AndroidUtilities.dp(5.0f));
                canvas.rotate(AndroidUtilities.lerp(0, 180, f2), this.factCheckArrow.getBounds().centerX(), this.factCheckArrow.getBounds().centerY());
                this.factCheckArrow.setAlpha((int) (f6 * 255.0f));
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
        return (this.currentMessagesGroup == null || (this.currentPosition.flags & 4) != 0) && !this.hasLinkPreview && ((messageObject = this.currentMessageObject) == null || !messageObject.isRepostPreview);
    }

    private void drawContact(Canvas canvas) {
        boolean z;
        float f;
        if (this.contactLine == null) {
            this.contactLine = new ReplyMessageLine(this);
        }
        int check = this.contactLine.check(this.currentMessageObject, this.currentUser, this.currentChat, this.resourcesProvider, 4);
        if (this.contactBounce == null) {
            this.contactBounce = new ButtonBounce(this, 2.0f, 2.0f);
        }
        int imageX = (int) (this.photoImage.getImageX() - AndroidUtilities.dp(13.0f));
        int dp = this.layoutHeight - AndroidUtilities.dp(62.0f);
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.isEmpty && !reactionsLayoutInBubble.isSmall) {
            dp -= reactionsLayoutInBubble.totalHeight;
        }
        if (this.drawCommentButton) {
            dp -= AndroidUtilities.dp(shouldDrawTimeOnMedia() ? 39.3f : 41.0f);
        }
        int i = dp;
        if (this.contactRect == null) {
            this.contactRect = new RectF();
        }
        int backgroundDrawableRight = (getBackgroundDrawableRight() - (AndroidUtilities.dp(10.0f) + ((!this.currentMessageObject.isOutOwner() || this.mediaBackground || this.drawPinnedBottom) ? 0 : AndroidUtilities.dp(6.0f)))) - getExtraTextX();
        this.contactRect.set(imageX, this.photoImage.getImageY() - AndroidUtilities.dp(9.0f), backgroundDrawableRight, AndroidUtilities.dp(38.0f) + i);
        float scale = this.contactBounce.getScale(0.0125f);
        boolean z2 = scale != 1.0f;
        if (z2) {
            canvas.save();
            canvas.scale(scale, scale, this.contactRect.centerX(), this.contactRect.centerY());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Drawable[] drawableArr = this.selectorDrawable;
            if (drawableArr[0] != null) {
                this.selectorDrawableMaskType[0] = 0;
                drawableArr[0].setBounds(imageX, (int) (this.photoImage.getImageY() - AndroidUtilities.dp(9.0f)), backgroundDrawableRight, AndroidUtilities.dp(38.0f) + i);
                if (this.selectorDrawableColor != Theme.multAlpha(this.contactLine.getColor(), 0.1f)) {
                    Drawable drawable = this.selectorDrawable[0];
                    int multAlpha = Theme.multAlpha(this.contactLine.getColor(), 0.1f);
                    this.selectorDrawableColor = multAlpha;
                    Theme.setSelectorDrawableColor(drawable, multAlpha, true);
                }
                this.selectorDrawable[0].draw(canvas);
            }
        }
        float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
        int i2 = (int) floor;
        this.contactLine.drawBackground(canvas, this.contactRect, floor, floor, floor, 1.0f);
        this.contactLine.drawLine(canvas, this.contactRect, 1.0f);
        Theme.chat_contactNamePaint.setColor(check);
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
        ArrayList<InstantViewButton> arrayList = this.contactButtons;
        if (arrayList != null && arrayList.size() > 0) {
            Theme.chat_instantViewPaint.setColor(check);
            Theme.chat_instantViewButtonPaint.setColor(Theme.multAlpha(check, 0.1f));
            int alpha = Theme.chat_instantViewPaint.getAlpha();
            Theme.chat_instantViewPaint.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(AndroidUtilities.dp(10.0f) + this.contactRect.left, AndroidUtilities.dp(2.0f) + i, this.contactRect.right - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(2.0f) + i + Math.max(1, AndroidUtilities.dp(0.66f)), Theme.chat_instantViewPaint);
            Theme.chat_instantViewPaint.setAlpha(alpha);
            int dp2 = i + AndroidUtilities.dp(2.0f);
            float dp3 = imageX + AndroidUtilities.dp(3.0f);
            ArrayList<InstantViewButton> arrayList2 = this.contactButtons;
            boolean z3 = arrayList2 != null && arrayList2.size() > 1;
            int backgroundColor = this.contactLine.getBackgroundColor();
            int i3 = 0;
            while (i3 < this.contactButtons.size()) {
                InstantViewButton instantViewButton = this.contactButtons.get(i3);
                float min = Math.min(instantViewButton.buttonWidth + dp3, this.contactRect.right);
                instantViewButton.rect.set(dp3, dp2, min, AndroidUtilities.dp(36.0f) + dp2);
                if (z3 && instantViewButton.selectorDrawable == null) {
                    this.linkPreviewSelectorColor = backgroundColor;
                    instantViewButton.selectorDrawable = Theme.createRadSelectorDrawable(backgroundColor, 0, 0, i3 == this.contactButtons.size() - 1 ? i2 : 0, 0);
                    instantViewButton.selectorDrawable.setCallback(this);
                }
                if (instantViewButton.selectorDrawable != null) {
                    instantViewButton.selectorDrawable.setBounds((int) dp3, dp2, (int) min, AndroidUtilities.dp(36.0f) + dp2);
                    instantViewButton.selectorDrawable.draw(canvas);
                }
                if (z2 || instantViewButton.buttonBounce == null) {
                    z = false;
                    f = 1.0f;
                } else {
                    f = instantViewButton.buttonBounce.getScale(0.02f);
                    z = f != 1.0f;
                }
                if (z) {
                    canvas.save();
                    canvas.scale(f, f, instantViewButton.rect.centerX(), instantViewButton.rect.centerY());
                }
                if (instantViewButton.layout != null) {
                    canvas.save();
                    canvas.translate(instantViewButton.textX + dp3, AndroidUtilities.dp(10.5f) + dp2);
                    instantViewButton.layout.draw(canvas);
                    canvas.restore();
                }
                if (z) {
                    canvas.restore();
                }
                dp3 += instantViewButton.buttonWidth;
                i3++;
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    private void drawBotButtons(Canvas canvas, ArrayList<BotButton> arrayList, int i) {
        int dp;
        Drawable themedDrawable;
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (SizeNotifierFrameLayout.drawingBlur) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        float f = 1.0f;
        if (messageObject != null && messageObject.isOutOwner()) {
            dp = (getMeasuredWidth() - this.widthForButtons) - AndroidUtilities.dp(10.0f);
        } else {
            dp = this.backgroundDrawableLeft + AndroidUtilities.dp((this.mediaBackground || this.drawPinnedBottom) ? 1.0f : 7.0f);
        }
        float f2 = 2.0f;
        float dp2 = (this.layoutHeight - AndroidUtilities.dp(2.0f)) + this.transitionParams.deltaBottom;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            BotButton botButton = arrayList.get(i2);
            float f4 = botButton.y + botButton.height;
            if (f4 > f3) {
                f3 = f4;
            }
        }
        this.rect.set(0.0f, dp2, getMeasuredWidth(), f3 + dp2);
        if (i != 255) {
            canvas.saveLayerAlpha(this.rect, i, 31);
        } else {
            canvas.save();
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            BotButton botButton2 = arrayList.get(i3);
            float dp3 = ((botButton2.y + this.layoutHeight) - AndroidUtilities.dp(f2)) + this.transitionParams.deltaBottom;
            float pressScale = botButton2.getPressScale();
            this.rect.set(botButton2.x + dp, dp3, botButton2.x + dp + botButton2.width, botButton2.height + dp3);
            canvas.save();
            if (pressScale != f) {
                canvas.scale(pressScale, pressScale, this.rect.centerX(), this.rect.centerY());
            }
            applyServiceShaderMatrix();
            Arrays.fill(this.botButtonRadii, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
            if (botButton2.hasPositionFlag(9)) {
                float[] fArr = this.botButtonRadii;
                float dp4 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[7] = dp4;
                fArr[6] = dp4;
            }
            if (botButton2.hasPositionFlag(10)) {
                float[] fArr2 = this.botButtonRadii;
                float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr2[5] = dp5;
                fArr2[4] = dp5;
            }
            this.botButtonPath.rewind();
            this.botButtonPath.addRoundRect(this.rect, this.botButtonRadii, Path.Direction.CW);
            canvas.drawPath(this.botButtonPath, getThemedPaint("paintChatActionBackground"));
            if (hasGradientService()) {
                canvas.drawPath(this.botButtonPath, Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            boolean z = (((botButton2.button instanceof TLRPC$TL_keyboardButtonCallback) || (botButton2.button instanceof TLRPC$TL_keyboardButtonGame) || (botButton2.button instanceof TLRPC$TL_keyboardButtonBuy) || (botButton2.button instanceof TLRPC$TL_keyboardButtonUrlAuth)) && SendMessagesHelper.getInstance(this.currentAccount).isSendingCallback(this.currentMessageObject, botButton2.button)) || ((botButton2.button instanceof TLRPC$TL_keyboardButtonRequestGeoLocation) && SendMessagesHelper.getInstance(this.currentAccount).isSendingCurrentLocation(this.currentMessageObject, botButton2.button)) || ((botButton2.button instanceof TLRPC$TL_keyboardButtonUrl) && (chatMessageCellDelegate = this.delegate) != null && chatMessageCellDelegate.isProgressLoading(this, 3) && this.delegate.getProgressLoadingBotButtonUrl(this) == botButton2.button.url);
            canvas.save();
            canvas.clipPath(this.botButtonPath);
            if (z) {
                if (botButton2.loadingDrawable == null) {
                    botButton2.loadingDrawable = new LoadingDrawable();
                    botButton2.loadingDrawable.setRadiiDp(5.5f);
                    botButton2.loadingDrawable.setAppearByGradient(true);
                    botButton2.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else if (botButton2.loadingDrawable.isDisappeared() || botButton2.loadingDrawable.isDisappearing()) {
                    botButton2.loadingDrawable.reset();
                    botButton2.loadingDrawable.resetDisappear();
                }
            } else if (botButton2.loadingDrawable != null && !botButton2.loadingDrawable.isDisappearing() && !botButton2.loadingDrawable.isDisappeared()) {
                botButton2.loadingDrawable.disappear();
            }
            if (botButton2.loadingDrawable != null && (z || botButton2.loadingDrawable.isDisappearing())) {
                this.rect.inset(AndroidUtilities.dpf2(0.625f), AndroidUtilities.dpf2(0.625f));
                botButton2.loadingDrawable.setRadii(this.botButtonRadii);
                botButton2.loadingDrawable.setBounds(this.rect);
                LoadingDrawable loadingDrawable = botButton2.loadingDrawable;
                int i4 = Theme.key_chat_serviceBackgroundSelector;
                loadingDrawable.setColors(Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), f), Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), 2.5f), Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), 3.0f), Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), 10.0f));
                botButton2.loadingDrawable.setAlpha(255);
                botButton2.loadingDrawable.draw(canvas);
                invalidateOutbounds();
            }
            if (botButton2.selectorDrawable != null) {
                int i5 = (int) dp3;
                botButton2.selectorDrawable.setBounds(botButton2.x + dp, i5, botButton2.x + dp + botButton2.width, botButton2.height + i5);
                botButton2.selectorDrawable.setAlpha(255);
                botButton2.selectorDrawable.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(botButton2.x + dp + AndroidUtilities.dp(5.0f), ((AndroidUtilities.dp(44.0f) - botButton2.title.getLineBottom(botButton2.title.getLineCount() - 1)) / 2) + dp3);
            botButton2.title.draw(canvas);
            canvas.restore();
            if (!(botButton2.button instanceof TLRPC$TL_keyboardButtonWebView)) {
                if (botButton2.button instanceof TLRPC$TL_keyboardButtonUrl) {
                    if (!AndroidUtilities.isWebAppLink(botButton2.button.url)) {
                        if (botButton2.isInviteButton) {
                            themedDrawable = getThemedDrawable("drawable_botInvite");
                        } else {
                            themedDrawable = getThemedDrawable("drawableBotLink");
                        }
                    } else {
                        themedDrawable = getThemedDrawable("drawableBotWebView");
                    }
                    BaseCell.setDrawableBounds(themedDrawable, (((botButton2.x + botButton2.width) - AndroidUtilities.dp(3.0f)) - themedDrawable.getIntrinsicWidth()) + dp, dp3 + AndroidUtilities.dp(3.0f));
                    themedDrawable.draw(canvas);
                } else if (!(botButton2.button instanceof TLRPC$TL_keyboardButtonSwitchInline) && !(botButton2.button instanceof TLRPC$TL_keyboardButtonRequestPeer)) {
                    if ((botButton2.button instanceof TLRPC$TL_keyboardButtonBuy) && this.hasInvoicePreview && this.hasInvoicePrice) {
                        BaseCell.setDrawableBounds(Theme.chat_botCardDrawable, (((botButton2.x + botButton2.width) - AndroidUtilities.dp(5.0f)) - Theme.chat_botCardDrawable.getIntrinsicWidth()) + dp, dp3 + AndroidUtilities.dp(4.0f));
                        Theme.chat_botCardDrawable.draw(canvas);
                    }
                } else {
                    Drawable themedDrawable2 = getThemedDrawable("drawableBotInline");
                    BaseCell.setDrawableBounds(themedDrawable2, (((botButton2.x + botButton2.width) - AndroidUtilities.dp(3.0f)) - themedDrawable2.getIntrinsicWidth()) + dp, dp3 + AndroidUtilities.dp(3.0f));
                    themedDrawable2.draw(canvas);
                }
            } else {
                Drawable themedDrawable3 = getThemedDrawable("drawableBotWebView");
                BaseCell.setDrawableBounds(themedDrawable3, (((botButton2.x + botButton2.width) - AndroidUtilities.dp(3.0f)) - themedDrawable3.getIntrinsicWidth()) + dp, dp3 + AndroidUtilities.dp(3.0f));
                themedDrawable3.draw(canvas);
            }
            canvas.restore();
            i3++;
            f = 1.0f;
            f2 = 2.0f;
        }
        canvas.restore();
    }

    private boolean allowDrawPhotoImage() {
        return !this.currentMessageObject.hasMediaSpoilers() || this.currentMessageObject.isMediaSpoilersRevealed || this.mediaSpoilerRevealProgress != 0.0f || this.blurredPhotoImage.getBitmap() == null;
    }

    public void layoutTextXY(boolean z) {
        int dp;
        int i;
        int dp2;
        int dp3;
        if (this.currentMessageObject.isOutOwner()) {
            this.textX = (z ? (int) (this.backgroundDrawableLeft + this.transitionParams.deltaLeft) : getCurrentBackgroundLeft()) + AndroidUtilities.dp(11.0f) + getExtraTextX();
        } else {
            int currentBackgroundLeft = z ? (int) (this.backgroundDrawableLeft + this.transitionParams.deltaLeft) : getCurrentBackgroundLeft();
            if (this.currentMessageObject.type == 19) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp((this.mediaBackground || !this.drawPinnedBottom) ? 17.0f : 11.0f);
            }
            this.textX = currentBackgroundLeft + dp + getExtraTextX();
        }
        if (this.hasGamePreview) {
            this.textX += AndroidUtilities.dp(11.0f);
            int dp4 = AndroidUtilities.dp(14.0f) + this.namesOffset;
            this.textY = dp4;
            StaticLayout staticLayout = this.siteNameLayout;
            if (staticLayout != null) {
                this.textY = dp4 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            }
        } else if (this.hasInvoicePreview) {
            int dp5 = AndroidUtilities.dp(14.0f) + this.namesOffset;
            this.textY = dp5;
            StaticLayout staticLayout2 = this.siteNameLayout;
            if (staticLayout2 != null) {
                this.textY = dp5 + staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            }
        } else if (this.currentMessageObject.type == 19) {
            this.textY = AndroidUtilities.dp(6.0f) + this.namesOffset;
            if (!this.currentMessageObject.isOut()) {
                this.textX = getCurrentBackgroundLeft();
            } else {
                this.textX -= AndroidUtilities.dp(4.0f);
            }
        } else {
            int dp6 = AndroidUtilities.dp(8.0f) + this.namesOffset;
            this.textY = dp6;
            if (this.currentMessageObject.hasCodeAtTop && (i = SharedConfig.bubbleRadius) > 10) {
                this.textY = dp6 + AndroidUtilities.dp(i < 15 ? 1.0f : 2.0f);
            }
            if (this.currentMessageObject.hasCodeAtTop && this.namesOffset > 0) {
                this.textY += AndroidUtilities.dp(5.0f);
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
            dp2 = this.textY + this.currentMessageObject.textHeight(this.transitionParams);
            dp3 = AndroidUtilities.dp(10.0f);
        } else {
            dp2 = this.linkPreviewY + this.linkPreviewHeight + AndroidUtilities.dp(this.drawInstantView ? 46.0f : 0.0f);
            dp3 = AndroidUtilities.dp(this.linkPreviewHeight <= 0 ? -8.0f : 4.0f);
        }
        this.factCheckY = dp2 + dp3;
        this.unmovedTextX = this.textX;
        if (this.currentMessageObject.textXOffset == 0.0f || this.replyNameLayout == null) {
            return;
        }
        int dp7 = this.backgroundWidth - AndroidUtilities.dp(31.0f);
        MessageObject messageObject = this.currentMessageObject;
        int i2 = dp7 - messageObject.textWidth;
        if (!this.hasNewLineForTime) {
            i2 -= this.timeWidth + AndroidUtilities.dp((messageObject.isOutOwner() ? 20 : 0) + 4);
        }
        if (i2 > 0) {
            this.textX += i2 - getExtraTimeX();
        }
    }

    public void drawMessageText(Canvas canvas) {
        float f;
        TransitionParams transitionParams;
        int i;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.isSponsored()) {
            return;
        }
        int i2 = this.textY;
        float f2 = i2;
        TransitionParams transitionParams2 = this.transitionParams;
        if (transitionParams2.animateText) {
            float f3 = transitionParams2.animateFromTextY;
            float f4 = transitionParams2.animateChangeProgress;
            f2 = (f3 * (1.0f - f4)) + (i2 * f4);
        }
        float f5 = f2;
        if (transitionParams2.animateChangeProgress != 1.0f && transitionParams2.animateMessageText) {
            canvas.save();
            Theme.MessageDrawable messageDrawable = this.currentBackgroundDrawable;
            if (messageDrawable != null) {
                Rect bounds = messageDrawable.getBounds();
                if (this.currentMessageObject.isOutOwner() && !this.mediaBackground && !this.pinnedBottom) {
                    canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                } else {
                    canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                }
            }
            drawMessageText(this.textX, f5, canvas, this.transitionParams.animateOutTextBlocks, this.transitionParams.animateOutTextXOffset, false, 1.0f - this.transitionParams.animateChangeProgress, true, false, false);
            float f6 = this.textX;
            MessageObject messageObject2 = this.currentMessageObject;
            drawMessageText(f6, f5, canvas, messageObject2.textLayoutBlocks, messageObject2.textXOffset, true, this.transitionParams.animateChangeProgress, true, false, false);
            canvas.restore();
            return;
        }
        boolean z = transitionParams2.animateLinkAbove;
        if (z && this.currentBackgroundDrawable != null) {
            if (z) {
                float f7 = i2;
                int i3 = this.linkPreviewAbove ? 1 : -1;
                TransitionParams transitionParams3 = this.transitionParams;
                f5 = f7 + (i3 * this.currentMessageObject.textHeight(transitionParams2) * (1.0f - transitionParams3.animateChangeProgress));
                f = transitionParams3.animateFromTextY - (((this.linkPreviewAbove ? 1 : -1) * this.currentMessageObject.textHeight(transitionParams3)) * this.transitionParams.animateChangeProgress);
            } else {
                f = f5;
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
            canvas.clipRect(f8, f9, rectF.right, this.currentMessageObject.textHeight(transitionParams) + f9 + AndroidUtilities.dp(4.0f));
            float f10 = this.textX;
            MessageObject messageObject3 = this.currentMessageObject;
            drawMessageText(f10, f, canvas, messageObject3.textLayoutBlocks, messageObject3.textXOffset, false, 1.0f - this.transitionParams.animateChangeProgress, true, false, false);
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
            canvas.clipRect(rectF.left, this.textY, rectF.right, i + this.currentMessageObject.textHeight(this.transitionParams) + AndroidUtilities.dp(4.0f));
            float f11 = this.textX;
            MessageObject messageObject4 = this.currentMessageObject;
            drawMessageText(f11, f5, canvas, messageObject4.textLayoutBlocks, messageObject4.textXOffset, true, 1.0f, true, false, false);
            canvas.restore();
            return;
        }
        float f12 = this.textX;
        MessageObject messageObject5 = this.currentMessageObject;
        drawMessageText(f12, f5, canvas, messageObject5.textLayoutBlocks, messageObject5.textXOffset, true, 1.0f, true, false, false);
    }

    public void drawMessageText(Canvas canvas, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z, float f, boolean z2) {
        int i = this.textY;
        float f2 = i;
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateText) {
            float f3 = transitionParams.animateFromTextY;
            float f4 = transitionParams.animateChangeProgress;
            f2 = (f3 * (1.0f - f4)) + (i * f4);
        }
        float f5 = f2;
        float f6 = this.textX;
        MessageObject messageObject = this.currentMessageObject;
        drawMessageText(f6, f5, canvas, arrayList, messageObject == null ? 0.0f : messageObject.textXOffset, z, f, false, z2, false);
    }

    @android.annotation.SuppressLint({"Range"})
    public void drawMessageText(float r43, float r44, android.graphics.Canvas r45, java.util.ArrayList<org.telegram.messenger.MessageObject.TextLayoutBlock> r46, float r47, boolean r48, float r49, boolean r50, boolean r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawMessageText(float, float, android.graphics.Canvas, java.util.ArrayList, float, boolean, float, boolean, boolean, boolean):void");
    }

    public org.telegram.ui.Components.AnimatedEmojiSpan[] getAnimatedEmojiSpans() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.getAnimatedEmojiSpans():org.telegram.ui.Components.AnimatedEmojiSpan[]");
    }

    public void updateCaptionLayout() {
        float imageX;
        float imageY;
        float imageHeight;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        float f;
        int i;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        int i2;
        MessageObject messageObject = this.currentMessageObject;
        int i3 = messageObject.type;
        boolean z = true;
        if (i3 == 1 || i3 == 20 || this.documentAttachType == 4 || i3 == 8 || i3 == 23) {
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
            float dp = imageY + imageHeight + AndroidUtilities.dp(6.0f);
            this.captionY = imageY + AndroidUtilities.lerp(imageHeight + AndroidUtilities.dp(6.0f), (this.captionLayout == null ? 0 : -textLayoutBlocks.textHeight()) - AndroidUtilities.dp(4.0f), mediaAbove());
            f = dp;
            z = false;
        } else {
            float f2 = 41.3f;
            float f3 = 0.0f;
            if (this.hasOldCaptionPreview) {
                this.captionX = this.backgroundDrawableLeft + AndroidUtilities.dp(messageObject.isOutOwner() ? 11.0f : 17.0f) + this.captionOffsetX;
                int dp2 = (((this.totalHeight - this.captionHeight) - AndroidUtilities.dp(this.drawPinnedTop ? 9.0f : 10.0f)) - this.linkPreviewHeight) - AndroidUtilities.dp(17.0f);
                if (!this.drawCommentButton || this.drawSideButton == 3) {
                    f2 = 0.0f;
                } else if (!shouldDrawTimeOnMedia()) {
                    f2 = 43.0f;
                }
                f = dp2 - AndroidUtilities.dp(f2);
                this.captionY = AndroidUtilities.lerp(f, AndroidUtilities.dp(9.0f) + this.namesOffset, mediaAbove());
            } else {
                if (this.isRoundVideo) {
                    this.captionX = getBackgroundDrawableLeft() + AndroidUtilities.dp((this.currentMessageObject.isOutOwner() ? 0 : 6) + 11);
                } else {
                    int i4 = this.backgroundDrawableLeft;
                    if (!messageObject.isOutOwner() && !this.mediaBackground && !this.drawPinnedBottom) {
                        r9 = 17.0f;
                    }
                    this.captionX = i4 + AndroidUtilities.dp(r9) + this.captionOffsetX;
                }
                int dp3 = (this.totalHeight - this.captionHeight) - AndroidUtilities.dp(this.drawPinnedTop ? 9.0f : 10.0f);
                if (!this.drawCommentButton || this.drawSideButton == 3) {
                    f2 = 0.0f;
                } else if (!shouldDrawTimeOnMedia()) {
                    f2 = 43.0f;
                }
                int dp4 = dp3 - AndroidUtilities.dp(f2);
                ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                if (reactionsLayoutInBubble.isEmpty || reactionsLayoutInBubble.isSmall) {
                    i2 = 0;
                } else {
                    if (this.currentMessageObject.type == 9 && this.currentPosition == null) {
                        f3 = 10.0f;
                    }
                    i2 = AndroidUtilities.dp(f3) + this.reactionsLayoutInBubble.totalHeight;
                }
                f = dp4 - i2;
                this.captionY = AndroidUtilities.lerp(f, AndroidUtilities.dp(9.0f) + this.namesOffset, mediaAbove());
            }
        }
        this.captionX += getExtraTextX();
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 == null || (i = messageObject2.type) == 0 || i == 24 || messageObject2.isGiveawayOrGiveawayResults() || this.currentMessageObject.isSponsored()) {
            return;
        }
        if (z && this.hasFactCheck) {
            this.captionY -= (this.factCheckHeight + AndroidUtilities.dp(16.0f)) * (1.0f - mediaAbove());
        }
        this.factCheckY = (int) (((f - (z ? this.factCheckHeight + AndroidUtilities.dp(14.0f) : 0)) + AndroidUtilities.lerp(this.captionLayout != null ? textLayoutBlocks2.textHeight(this.transitionParams) + AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(6.0f), mediaAbove())) - this.transitionParams.deltaTop);
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
            } else if (i9 == -1) {
                if (this.documentAttachType == 1) {
                    if (this.drawPhotoImage && (this.currentPhotoObject != null || this.currentPhotoObjectThumb != null)) {
                        if (this.photoImage.hasBitmapImage()) {
                            return 4;
                        }
                        MessageObject messageObject2 = this.currentMessageObject;
                        if (messageObject2.mediaExists || messageObject2.attachPathExists) {
                            return 4;
                        }
                    }
                    return 5;
                } else if (this.currentMessageObject.needDrawBluredPreview()) {
                    return 7;
                } else {
                    if (this.hasEmbed) {
                        return 0;
                    }
                }
            }
        }
        MessageObject messageObject3 = this.currentMessageObject;
        return (messageObject3 != null && this.isRoundVideo && messageObject3.isVoiceTranscriptionOpen()) ? 0 : 4;
    }

    public int getMaxNameWidth() {
        int min;
        int dp;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i;
        int i2;
        int dp2;
        int parentWidth;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i3 = this.documentAttachType;
        if (i3 == 6 || i3 == 8 || (i = (messageObject2 = this.currentMessageObject).type) == 5) {
            if (AndroidUtilities.isTablet()) {
                min = AndroidUtilities.getMinTabletSide();
                dp = AndroidUtilities.dp(needDrawAvatar() ? 42.0f : 0.0f);
            } else {
                min = Math.min(getParentWidth(), AndroidUtilities.displaySize.y);
                dp = AndroidUtilities.dp(needDrawAvatar() ? 42.0f : 0.0f);
            }
            int i4 = min - dp;
            MessageObject messageObject3 = this.currentMessageObject;
            if (messageObject3 != null && messageObject3.isSaved && messageObject3.isOutOwner() && checkNeedDrawShareButton(this.currentMessageObject)) {
                i4 -= AndroidUtilities.dp(25.0f);
            }
            if (this.isPlayingRound && ((messageObject = this.currentMessageObject) == null || !messageObject.isVoiceTranscriptionOpen())) {
                return (i4 - (this.backgroundWidth - (AndroidUtilities.roundPlayingMessageSize - AndroidUtilities.roundMessageSize))) - AndroidUtilities.dp(57.0f);
            }
            return (i4 - this.backgroundWidth) - AndroidUtilities.dp(57.0f);
        }
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && !groupedMessages.isDocuments) {
            if (AndroidUtilities.isTablet()) {
                parentWidth = AndroidUtilities.getMinTabletSide();
            } else {
                parentWidth = getParentWidth();
            }
            i2 = 0;
            for (int i5 = 0; i5 < this.currentMessagesGroup.posArray.size(); i5++) {
                if (this.currentMessagesGroup.posArray.get(i5).minY != 0) {
                    break;
                }
                double d = i2;
                double ceil = Math.ceil(((groupedMessagePosition.pw + groupedMessagePosition.leftSpanOffset) / 1000.0f) * parentWidth);
                Double.isNaN(d);
                i2 = (int) (d + ceil);
            }
            dp2 = AndroidUtilities.dp((needDrawAvatar() ? 48 : 0) + 31);
        } else if (i == 19) {
            return Math.max(messageObject2.textWidth, (int) (((AndroidUtilities.displaySize.x - AndroidUtilities.dp(52.0f)) - (this.isAvatarVisible ? AndroidUtilities.dp(48.0f) : 0)) * 0.5f));
        } else {
            i2 = this.backgroundWidth;
            if (messageObject2 != null && messageObject2.isSaved && messageObject2.isOutOwner() && checkNeedDrawShareButton(this.currentMessageObject)) {
                i2 -= AndroidUtilities.dp(25.0f);
            }
            dp2 = AndroidUtilities.dp(this.mediaBackground ? 22.0f : 31.0f);
        }
        return i2 - dp2;
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
            TLRPC$Document tLRPC$Document = this.documentAttach;
            MessageObject messageObject2 = this.currentMessageObject;
            fileLoader.loadFile(tLRPC$Document, messageObject2, 2, messageObject2.shouldEncryptPhotoOrVideo() ? 2 : 0);
            this.currentMessageObject.loadingCancelled = false;
        } else if (i3 == 4 || i3 == 7) {
            createLoadingProgressLayout(this.documentAttach);
            FileLoader fileLoader2 = FileLoader.getInstance(this.currentAccount);
            TLRPC$Document tLRPC$Document2 = this.documentAttach;
            MessageObject messageObject3 = this.currentMessageObject;
            fileLoader2.loadFile(tLRPC$Document2, messageObject3, 2, messageObject3.shouldEncryptPhotoOrVideo() ? 2 : 0);
            this.currentMessageObject.loadingCancelled = false;
        }
        this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, true);
        invalidate();
    }

    private void didPressButton(boolean z, boolean z2) {
        MessageObject messageObject;
        MessageObject messageObject2;
        TLRPC$PhotoSize tLRPC$PhotoSize;
        String str;
        MessageObject messageObject3;
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
                tLRPC$PhotoSize = this.currentPhotoObject;
                str = ((tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize) || "s".equals(tLRPC$PhotoSize.type)) ? this.currentPhotoFilterThumb : this.currentPhotoFilter;
            } else {
                tLRPC$PhotoSize = this.currentPhotoObjectThumb;
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
                    TLRPC$Document document = this.currentMessageObject.getDocument();
                    MessageObject messageObject6 = this.currentMessageObject;
                    fileLoader.loadFile(document, messageObject6, 2, messageObject6.shouldEncryptPhotoOrVideo() ? 2 : 1);
                } else {
                    MessageObject messageObject7 = this.currentMessageObject;
                    messageObject7.gifState = 2.0f;
                    TLRPC$Document document2 = messageObject7.getDocument();
                    this.photoImage.setForceLoading(true);
                    this.photoImage.setImage(ImageLocation.getForDocument(document2), null, ImageLocation.getForObject(tLRPC$PhotoSize, document2), str2, document2.size, null, this.currentMessageObject, 0);
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
        } else if (i == 1 && (!this.drawVideoImageButton || z2)) {
            this.photoImage.setForceLoading(false);
            int i6 = this.documentAttachType;
            if (i6 == 3 || i6 == 5 || (i6 == 7 && (messageObject2 = this.currentMessageObject) != null && messageObject2.isVoiceTranscriptionOpen())) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                }
            } else if (this.currentMessageObject.isOut() && !this.drawVideoImageButton && (this.currentMessageObject.isSending() || this.currentMessageObject.isEditing())) {
                if (this.radialProgress.getIcon() != 6) {
                    this.delegate.didPressCancelSendButton(this);
                }
            } else {
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
            }
        } else if (i != 2) {
            if (i == 3 || i == 0) {
                if (this.hasMiniProgress == 2 && this.miniButtonState != 1) {
                    this.miniButtonState = 1;
                    this.radialProgress.setProgress(0.0f, false);
                    this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, z);
                }
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate != null) {
                    chatMessageCellDelegate.didPressImage(this, 0.0f, 0.0f);
                }
            } else if (i == 4) {
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
                }
            }
        } else {
            MessageObject messageObject11 = this.currentMessageObject;
            if (messageObject11 != null && messageObject11.type == 23) {
                this.delegate.didPressImage(this, 0.0f, 0.0f);
            } else if (this.documentAttachType == 7 && messageObject11 != null && messageObject11.isVoiceTranscriptionOpen()) {
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
                }
            } else {
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
                if (this.isRoundVideo) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                        this.photoImage.setAllowStartAnimation(true);
                        this.photoImage.startAnimation();
                    }
                } else {
                    this.photoImage.setAllowStartAnimation(true);
                    this.photoImage.startAnimation();
                }
                this.currentMessageObject.gifState = 0.0f;
                this.buttonState = -1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            }
        }
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        int i = this.documentAttachType;
        updateButtonState(true, i == 3 || i == 5, false);
    }

    @Override
    public void onSuccessDownload(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.onSuccessDownload(java.lang.String):void");
    }

    @Override
    public void didSetImage(org.telegram.messenger.ImageReceiver r5, boolean r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.didSetImage(org.telegram.messenger.ImageReceiver, boolean, boolean, boolean):void");
    }

    public boolean setCurrentDiceValue(boolean z) {
        MessagesController.DiceFrameSuccess diceFrameSuccess;
        if (this.currentMessageObject.isDice()) {
            Drawable drawable = this.photoImage.getDrawable();
            if (drawable instanceof RLottieDrawable) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                String diceEmoji = this.currentMessageObject.getDiceEmoji();
                TLRPC$TL_messages_stickerSet stickerSetByEmojiOrName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(diceEmoji);
                if (stickerSetByEmojiOrName != null) {
                    int diceValue = this.currentMessageObject.getDiceValue();
                    if ("🎰".equals(this.currentMessageObject.getDiceEmoji())) {
                        if (diceValue >= 0 && diceValue <= 64) {
                            ((SlotsDrawable) rLottieDrawable).setDiceNumber(this, diceValue, stickerSetByEmojiOrName, z);
                            if (this.currentMessageObject.isOut()) {
                                rLottieDrawable.setOnFinishCallback(this.diceFinishCallback, Integer.MAX_VALUE);
                            }
                            this.currentMessageObject.wasUnread = false;
                        }
                        if (!rLottieDrawable.hasBaseDice() && stickerSetByEmojiOrName.documents.size() > 0) {
                            ((SlotsDrawable) rLottieDrawable).setBaseDice(this, stickerSetByEmojiOrName);
                        }
                    } else {
                        if (!rLottieDrawable.hasBaseDice() && stickerSetByEmojiOrName.documents.size() > 0) {
                            TLRPC$Document tLRPC$Document = stickerSetByEmojiOrName.documents.get(0);
                            if (rLottieDrawable.setBaseDice(FileLoader.getInstance(this.currentAccount).getPathToAttach(tLRPC$Document, true))) {
                                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                            } else {
                                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(tLRPC$Document), this.currentMessageObject, this);
                                FileLoader.getInstance(this.currentAccount).loadFile(tLRPC$Document, stickerSetByEmojiOrName, 1, 1);
                            }
                        }
                        if (diceValue >= 0 && diceValue < stickerSetByEmojiOrName.documents.size()) {
                            if (!z && this.currentMessageObject.isOut() && (diceFrameSuccess = MessagesController.getInstance(this.currentAccount).diceSuccess.get(diceEmoji)) != null && diceFrameSuccess.num == diceValue) {
                                rLottieDrawable.setOnFinishCallback(this.diceFinishCallback, diceFrameSuccess.frame);
                            }
                            TLRPC$Document tLRPC$Document2 = stickerSetByEmojiOrName.documents.get(Math.max(diceValue, 0));
                            if (rLottieDrawable.setDiceNumber(FileLoader.getInstance(this.currentAccount).getPathToAttach(tLRPC$Document2, true), z)) {
                                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                            } else {
                                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(tLRPC$Document2), this.currentMessageObject, this);
                                FileLoader.getInstance(this.currentAccount).loadFile(tLRPC$Document2, stickerSetByEmojiOrName, 1, 1);
                            }
                            this.currentMessageObject.wasUnread = false;
                        }
                    }
                } else {
                    MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(diceEmoji, true, true);
                }
            }
            return true;
        }
        return false;
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
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, ((float) j) / ((float) j2));
        this.currentMessageObject.loadedFileSize = j;
        createLoadingProgressLayout(j, j2);
        if (this.drawVideoImageButton) {
            this.videoRadialProgress.setProgress(min, true);
        } else {
            this.radialProgress.setProgress(min, true);
        }
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            if (this.hasMiniProgress != 0) {
                if (this.miniButtonState != 1) {
                    updateButtonState(false, false, false);
                }
            } else if (this.buttonState != 4) {
                updateButtonState(false, false, false);
            }
        } else if (this.hasMiniProgress != 0) {
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
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, ((float) j) / ((float) j2));
        this.currentMessageObject.loadedFileSize = j;
        this.radialProgress.setProgress(min, true);
        if (j == j2 && this.currentPosition != null && SendMessagesHelper.getInstance(this.currentAccount).isSendingMessage(this.currentMessageObject.getId()) && ((i = this.buttonState) == 1 || (i == 4 && this.documentAttachType == 5))) {
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

    private void createLoadingProgressLayout(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return;
        }
        long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(FileLoader.getDocumentFileName(tLRPC$Document));
        if (fileProgressSizes != null) {
            createLoadingProgressLayout(fileProgressSizes[0], fileProgressSizes[1]);
        } else {
            createLoadingProgressLayout(this.currentMessageObject.loadedFileSize, tLRPC$Document.size);
        }
    }

    private void createLoadingProgressLayout(long r17, long r19) {
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

    private void measureTime(org.telegram.messenger.MessageObject r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.measureTime(org.telegram.messenger.MessageObject):void");
    }

    private boolean shouldDrawSelectionOverlay() {
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

    private boolean isDrawSelectionBackground() {
        MessageObject messageObject;
        return ((isPressed() && this.isCheckPressed) || ((!this.isCheckPressed && this.isPressed) || this.isHighlighted)) && !textIsSelectionMode() && !hasSelectionOverlay() && ((messageObject = this.currentMessageObject) == null || !messageObject.preview);
    }

    public boolean isOpenChatByShare(MessageObject messageObject) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
        return (tLRPC$MessageFwdHeader == null || tLRPC$MessageFwdHeader.saved_from_peer == null || ((chatMessageCellDelegate = this.delegate) != null && !chatMessageCellDelegate.isReplyOrSelf())) ? false : true;
    }

    public boolean checkNeedDrawShareButton(org.telegram.messenger.MessageObject r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkNeedDrawShareButton(org.telegram.messenger.MessageObject):boolean");
    }

    public boolean isInsideBackground(float f, float f2) {
        if (this.currentBackgroundDrawable != null) {
            int i = this.backgroundDrawableLeft;
            if (f >= i && f <= i + this.backgroundDrawableRight) {
                return true;
            }
        }
        return false;
    }

    private void updateCurrentUserAndChat() {
        TLRPC$Peer tLRPC$Peer;
        if (this.currentMessageObject == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.currentMessageObject.messageOwner.fwd_from;
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (tLRPC$MessageFwdHeader != null && (tLRPC$MessageFwdHeader.from_id instanceof TLRPC$TL_peerChannel) && (this.currentMessageObject.getDialogId() == clientUserId || this.currentMessageObject.getDialogId() == 1271266957)) {
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tLRPC$MessageFwdHeader.from_id.channel_id));
        } else if (tLRPC$MessageFwdHeader != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.saved_from_peer) != null) {
            long j = tLRPC$Peer.user_id;
            if (j != 0) {
                if (!this.isSavedChat) {
                    TLRPC$Peer tLRPC$Peer2 = tLRPC$MessageFwdHeader.from_id;
                    if (tLRPC$Peer2 instanceof TLRPC$TL_peerUser) {
                        this.currentUser = messagesController.getUser(Long.valueOf(tLRPC$Peer2.user_id));
                        return;
                    }
                }
                this.currentUser = messagesController.getUser(Long.valueOf(j));
            } else if (tLRPC$Peer.channel_id != 0) {
                if (this.currentMessageObject.isSavedFromMegagroup()) {
                    TLRPC$Peer tLRPC$Peer3 = tLRPC$MessageFwdHeader.from_id;
                    if (tLRPC$Peer3 instanceof TLRPC$TL_peerUser) {
                        this.currentUser = messagesController.getUser(Long.valueOf(tLRPC$Peer3.user_id));
                        return;
                    }
                }
                this.currentChat = messagesController.getChat(Long.valueOf(tLRPC$MessageFwdHeader.saved_from_peer.channel_id));
            } else {
                long j2 = tLRPC$Peer.chat_id;
                if (j2 != 0) {
                    TLRPC$Peer tLRPC$Peer4 = tLRPC$MessageFwdHeader.from_id;
                    if (tLRPC$Peer4 instanceof TLRPC$TL_peerUser) {
                        this.currentUser = messagesController.getUser(Long.valueOf(tLRPC$Peer4.user_id));
                    } else {
                        this.currentChat = messagesController.getChat(Long.valueOf(j2));
                    }
                }
            }
        } else if (tLRPC$MessageFwdHeader != null && (tLRPC$MessageFwdHeader.from_id instanceof TLRPC$TL_peerUser) && (tLRPC$MessageFwdHeader.imported || this.currentMessageObject.getDialogId() == clientUserId)) {
            this.currentUser = messagesController.getUser(Long.valueOf(tLRPC$MessageFwdHeader.from_id.user_id));
        } else if (tLRPC$MessageFwdHeader != null && !TextUtils.isEmpty(tLRPC$MessageFwdHeader.saved_from_name) && (tLRPC$MessageFwdHeader.imported || this.currentMessageObject.getDialogId() == clientUserId)) {
            TLRPC$TL_user tLRPC$TL_user = new TLRPC$TL_user();
            this.currentUser = tLRPC$TL_user;
            tLRPC$TL_user.first_name = tLRPC$MessageFwdHeader.saved_from_name;
        } else if (tLRPC$MessageFwdHeader != null && !TextUtils.isEmpty(tLRPC$MessageFwdHeader.from_name) && (tLRPC$MessageFwdHeader.imported || this.currentMessageObject.getDialogId() == clientUserId)) {
            TLRPC$TL_user tLRPC$TL_user2 = new TLRPC$TL_user();
            this.currentUser = tLRPC$TL_user2;
            tLRPC$TL_user2.first_name = tLRPC$MessageFwdHeader.from_name;
        } else {
            long fromChatId = this.currentMessageObject.getFromChatId();
            if (DialogObject.isEncryptedDialog(this.currentMessageObject.getDialogId())) {
                if (this.currentMessageObject.isOutOwner()) {
                    this.currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                    return;
                }
                TLRPC$EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.currentMessageObject.getDialogId())));
                if (encryptedChat != null) {
                    this.currentUser = messagesController.getUser(Long.valueOf(encryptedChat.user_id));
                }
            } else if (DialogObject.isUserDialog(fromChatId) && !this.currentMessageObject.messageOwner.post) {
                this.currentUser = messagesController.getUser(Long.valueOf(fromChatId));
            } else if (DialogObject.isChatDialog(fromChatId)) {
                this.currentChat = messagesController.getChat(Long.valueOf(-fromChatId));
            } else {
                TLRPC$Message tLRPC$Message = this.currentMessageObject.messageOwner;
                if (tLRPC$Message.post) {
                    this.currentChat = messagesController.getChat(Long.valueOf(tLRPC$Message.peer_id.channel_id));
                }
            }
        }
    }

    private void setMessageObjectInternal(org.telegram.messenger.MessageObject r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setMessageObjectInternal(org.telegram.messenger.MessageObject):void");
    }

    private String getNameFromDialogId(long j) {
        TLRPC$Chat chat;
        if (j > 0) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            if (user != null) {
                return UserObject.getUserName(user);
            }
            return null;
        } else if (j >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j))) == null) {
            return null;
        } else {
            return chat.title;
        }
    }

    protected boolean isNeedAuthorName() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject.forceAvatar) {
            return true;
        }
        if (messageObject.isSponsored() || this.currentMessageObject.isGiveawayOrGiveawayResults()) {
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
        TLRPC$User tLRPC$User = this.currentUser;
        if (tLRPC$User != null) {
            return UserObject.getUserName(tLRPC$User);
        }
        TLRPC$Chat tLRPC$Chat = this.currentChat;
        if (tLRPC$Chat != null) {
            return tLRPC$Chat.title;
        }
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || !messageObject.isSponsored()) ? "DELETED" : this.currentMessageObject.sponsoredTitle;
    }

    private Object getAuthorStatus() {
        TLRPC$User tLRPC$User = this.currentUser;
        if (tLRPC$User != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(tLRPC$User);
            if (emojiStatusDocumentId != null) {
                return emojiStatusDocumentId;
            }
            if (this.currentUser.premium) {
                return ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_premium_liststar).mutate();
            }
            return null;
        }
        return null;
    }

    private String getForwardedMessageText(MessageObject messageObject) {
        if (this.hasPsaHint) {
            String string = LocaleController.getString("PsaMessage_" + messageObject.messageOwner.fwd_from.psa_type);
            return string == null ? LocaleController.getString("PsaMessageDefault", R.string.PsaMessageDefault) : string;
        }
        return LocaleController.getString(R.string.ForwardedFrom);
    }

    public int getExtraInsetHeight() {
        int i = this.addedCaptionHeight;
        if (this.hasFactCheck) {
            i += AndroidUtilities.dp((this.reactionsLayoutInBubble.isEmpty ? 18 : 0) + 2) + this.factCheckHeight;
        }
        if (this.drawCommentButton) {
            i += AndroidUtilities.dp(shouldDrawTimeOnMedia() ? 41.3f : 43.0f);
        }
        return (this.reactionsLayoutInBubble.isEmpty || !this.currentMessageObject.shouldDrawReactionsInLayout()) ? i : i + this.reactionsLayoutInBubble.totalHeight;
    }

    public ImageReceiver getAvatarImage() {
        if (this.isAvatarVisible) {
            return this.avatarImage;
        }
        return null;
    }

    public float getCheckBoxTranslation() {
        return this.checkBoxTranslation;
    }

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
        if (transitionParams.animateBackgroundBoundsInner) {
            if (transitionParams.transformGroupToSingleMessage) {
                return f - getTranslationY();
            }
            if (transitionParams.moveCaption) {
                float f2 = this.captionY;
                TransitionParams transitionParams2 = this.transitionParams;
                float f3 = transitionParams2.animateChangeProgress;
                return (f2 * f3) + (transitionParams2.captionFromY * (1.0f - f3));
            }
            return f;
        }
        return f;
    }

    public boolean isDrawPinnedBottom() {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        return this.mediaBackground || this.drawPinnedBottom || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && this.currentMessagesGroup.isDocuments);
    }

    public void drawCheckBox(Canvas canvas) {
        float f;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.isSending()) {
            return;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2.type == 27 || messageObject2.isSendError() || this.checkBox == null) {
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
            float y = getY();
            MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
            if (groupedMessages != null && groupedMessages.messages.size() > 1) {
                f = (getTop() + this.currentMessagesGroup.transitionParams.offsetTop) - getTranslationY();
            } else {
                f = y + this.transitionParams.deltaTop;
            }
            canvas.translate(0.0f, f + this.transitionYOffsetForDrawables);
            this.checkBox.draw(canvas);
            canvas.restore();
        }
    }

    public void setBackgroundTopY(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setBackgroundTopY(boolean):void");
    }

    public void setBackgroundTopY(int i) {
        int i2;
        int i3;
        boolean z;
        MessageObject messageObject;
        Theme.MessageDrawable messageDrawable = this.currentBackgroundDrawable;
        int i4 = this.parentWidth;
        int i5 = this.parentHeight;
        if (i5 == 0) {
            i4 = getParentWidth();
            i5 = AndroidUtilities.displaySize.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i3 = view.getMeasuredHeight();
                i2 = measuredWidth;
                float f = this.parentViewTopOffset;
                z = false;
                messageDrawable.setTop((int) (i + f), i2, i3, (int) f, this.blurredViewTopOffset, this.blurredViewBottomOffset, this.pinnedTop, (this.pinnedBottom && this.transitionParams.changePinnedBottomProgress == 1.0f) ? false : true);
                messageObject = this.currentMessageObject;
                if (messageObject != null && messageObject.hasInlineBotButtons()) {
                    z = true;
                }
                messageDrawable.setBotButtonsBottom(z);
            }
        }
        i2 = i4;
        i3 = i5;
        float f2 = this.parentViewTopOffset;
        z = false;
        messageDrawable.setTop((int) (i + f2), i2, i3, (int) f2, this.blurredViewTopOffset, this.blurredViewBottomOffset, this.pinnedTop, (this.pinnedBottom && this.transitionParams.changePinnedBottomProgress == 1.0f) ? false : true);
        messageObject = this.currentMessageObject;
        if (messageObject != null) {
            z = true;
        }
        messageDrawable.setBotButtonsBottom(z);
    }

    public void setDrawableBoundsInner(Drawable drawable, int i, int i2, int i3, int i4) {
        if (drawable != null) {
            float f = i4 + i2;
            TransitionParams transitionParams = this.transitionParams;
            float f2 = transitionParams.deltaBottom;
            this.transitionYOffsetForDrawables = (f + f2) - ((int) (f + f2));
            drawable.setBounds((int) (i + transitionParams.deltaLeft), (int) (i2 + transitionParams.deltaTop), (int) (i + i3 + transitionParams.deltaRight), (int) (f + f2));
        }
    }

    public void setupTextColors() {
        if (this.currentMessageObject.isOutOwner()) {
            TextPaint textPaint = Theme.chat_msgTextPaint;
            int i = Theme.key_chat_messageTextOut;
            textPaint.setColor(getThemedColor(i));
            Theme.chat_msgGameTextPaint.setColor(getThemedColor(i));
            Theme.chat_msgTextCodePaint.setColor(getThemedColor(i));
            Theme.chat_msgTextCode2Paint.setColor(getThemedColor(i));
            Theme.chat_msgTextCode3Paint.setColor(getThemedColor(i));
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
            return;
        }
        TextPaint textPaint9 = Theme.chat_msgTextPaint;
        int i2 = Theme.key_chat_messageTextIn;
        textPaint9.setColor(getThemedColor(i2));
        Theme.chat_msgGameTextPaint.setColor(getThemedColor(i2));
        Theme.chat_msgTextCodePaint.setColor(getThemedColor(i2));
        Theme.chat_msgTextCode2Paint.setColor(getThemedColor(i2));
        Theme.chat_msgTextCode3Paint.setColor(getThemedColor(i2));
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

    @Override
    public int getBoundsLeft() {
        int i;
        int dp;
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
            i = AndroidUtilities.dp(f);
        } else {
            i = 0;
        }
        int dp2 = (z && (checkNeedDrawShareButton(this.currentMessageObject) || this.useTranscribeButton)) ? AndroidUtilities.dp(48.0f) : 0;
        int i2 = Integer.MAX_VALUE;
        if (this.botButtons != null) {
            MessageObject messageObject3 = this.currentMessageObject;
            if (messageObject3 != null && messageObject3.isOutOwner()) {
                dp = (getMeasuredWidth() - this.widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                dp = this.backgroundDrawableLeft + AndroidUtilities.dp((this.mediaBackground || this.drawPinnedBottom) ? 1.0f : 7.0f);
            }
            for (int i3 = 0; i3 < this.botButtons.size(); i3++) {
                i2 = Math.max(i2, this.botButtons.get(i3).x + dp);
            }
        }
        return Math.max(0, Math.min(i2, (getBackgroundDrawableLeft() - i) - dp2));
    }

    @Override
    public int getBoundsRight() {
        int dp;
        MessageObject messageObject = this.currentMessageObject;
        int i = 0;
        int dp2 = ((messageObject != null && !messageObject.isOutOwner()) && (checkNeedDrawShareButton(this.currentMessageObject) || this.useTranscribeButton)) ? AndroidUtilities.dp(48.0f) : 0;
        if (this.botButtons != null) {
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null && messageObject2.isOutOwner()) {
                dp = (getMeasuredWidth() - this.widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                dp = this.backgroundDrawableLeft + AndroidUtilities.dp((this.mediaBackground || this.drawPinnedBottom) ? 1.0f : 7.0f);
            }
            int i2 = 0;
            while (i < this.botButtons.size()) {
                BotButton botButton = this.botButtons.get(i);
                i2 = Math.max(i2, botButton.x + dp + botButton.width);
                i++;
            }
            i = i2;
        }
        return Math.max(getBackgroundDrawableRight() + dp2, i);
    }

    @Override
    @SuppressLint({"WrongCall"})
    public void onDraw(Canvas canvas) {
        int i;
        boolean z;
        MessageObject messageObject;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        MessageTopicButton messageTopicButton;
        MessageTopicButton messageTopicButton2;
        Theme.MessageDrawable messageDrawable;
        MessageObject messageObject2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.currentMessageObject == null || this.doNotDraw) {
            return;
        }
        if (!this.wasLayout) {
            onLayout(false, getLeft(), getTop(), getRight(), getBottom());
        }
        if (this.enterTransitionInProgress && this.currentMessageObject.isAnimatedEmojiStickers()) {
            return;
        }
        if (this.channelRecommendationsCell != null && this.currentMessageObject.type == 27) {
            ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
            if (chatMessageCellDelegate == null || chatMessageCellDelegate.canDrawOutboundsContent()) {
                this.channelRecommendationsCell.draw(canvas);
            }
            this.transitionParams.recordDrawingState();
            return;
        }
        setupTextColors();
        if (this.documentAttach != null) {
            int i7 = this.documentAttachType;
            if (i7 == 3 || i7 == 7) {
                if (this.currentMessageObject.isOutOwner()) {
                    this.seekBarWaveform.setColors(getThemedColor(Theme.key_chat_outVoiceSeekbar), getThemedColor(Theme.key_chat_outVoiceSeekbarFill), getThemedColor(Theme.key_chat_outVoiceSeekbarSelected));
                    SeekBar seekBar = this.seekBar;
                    int themedColor = getThemedColor(Theme.key_chat_outAudioSeekbar);
                    int themedColor2 = getThemedColor(Theme.key_chat_outAudioCacheSeekbar);
                    int i8 = Theme.key_chat_outAudioSeekbarFill;
                    seekBar.setColors(themedColor, themedColor2, getThemedColor(i8), getThemedColor(i8), getThemedColor(Theme.key_chat_outAudioSeekbarSelected));
                } else if (this.hasLinkPreview && this.linkLine != null) {
                    this.seekBarWaveform.setColors(Theme.adaptHue(getThemedColor(Theme.key_chat_inVoiceSeekbar), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(Theme.key_chat_inVoiceSeekbarFill), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(Theme.key_chat_inVoiceSeekbarSelected), this.linkLine.getColor()));
                    SeekBar seekBar2 = this.seekBar;
                    int adaptHue = Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioSeekbar), this.linkLine.getColor());
                    int adaptHue2 = Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioCacheSeekbar), this.linkLine.getColor());
                    int i9 = Theme.key_chat_inAudioSeekbarFill;
                    seekBar2.setColors(adaptHue, adaptHue2, Theme.adaptHue(getThemedColor(i9), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(i9), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioSeekbarSelected), this.linkLine.getColor()));
                } else {
                    this.seekBarWaveform.setColors(getThemedColor(Theme.key_chat_inVoiceSeekbar), getThemedColor(Theme.key_chat_inVoiceSeekbarFill), getThemedColor(Theme.key_chat_inVoiceSeekbarSelected));
                    SeekBar seekBar3 = this.seekBar;
                    int themedColor3 = getThemedColor(Theme.key_chat_inAudioSeekbar);
                    int themedColor4 = getThemedColor(Theme.key_chat_inAudioCacheSeekbar);
                    int i10 = Theme.key_chat_inAudioSeekbarFill;
                    seekBar3.setColors(themedColor3, themedColor4, getThemedColor(i10), getThemedColor(i10), getThemedColor(Theme.key_chat_inAudioSeekbarSelected));
                }
            } else if (i7 == 5) {
                if (this.currentMessageObject.isOutOwner()) {
                    SeekBar seekBar4 = this.seekBar;
                    int themedColor5 = getThemedColor(Theme.key_chat_outAudioSeekbar);
                    int themedColor6 = getThemedColor(Theme.key_chat_outAudioCacheSeekbar);
                    int i11 = Theme.key_chat_outAudioSeekbarFill;
                    seekBar4.setColors(themedColor5, themedColor6, getThemedColor(i11), getThemedColor(i11), getThemedColor(Theme.key_chat_outAudioSeekbarSelected));
                } else if (this.hasLinkPreview && this.linkLine != null) {
                    SeekBar seekBar5 = this.seekBar;
                    int adaptHue3 = Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioSeekbar), this.linkLine.getColor());
                    int adaptHue4 = Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioCacheSeekbar), this.linkLine.getColor());
                    int i12 = Theme.key_chat_inAudioSeekbarFill;
                    seekBar5.setColors(adaptHue3, adaptHue4, Theme.adaptHue(getThemedColor(i12), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(i12), this.linkLine.getColor()), Theme.adaptHue(getThemedColor(Theme.key_chat_inAudioSeekbarSelected), this.linkLine.getColor()));
                } else {
                    SeekBar seekBar6 = this.seekBar;
                    int themedColor7 = getThemedColor(Theme.key_chat_inAudioSeekbar);
                    int themedColor8 = getThemedColor(Theme.key_chat_inAudioCacheSeekbar);
                    int i13 = Theme.key_chat_inAudioSeekbarFill;
                    seekBar6.setColors(themedColor7, themedColor8, getThemedColor(i13), getThemedColor(i13), getThemedColor(Theme.key_chat_inAudioSeekbarSelected));
                }
            }
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3.type == 5) {
            TextPaint textPaint = Theme.chat_timePaint;
            int themedColor9 = getThemedColor(Theme.key_chat_serviceText);
            if (isDrawSelectionBackground()) {
                i6 = this.currentMessageObject.isOutOwner() ? Theme.key_chat_outTimeSelectedText : Theme.key_chat_inTimeSelectedText;
            } else {
                i6 = this.currentMessageObject.isOutOwner() ? Theme.key_chat_outTimeText : Theme.key_chat_inTimeText;
            }
            textPaint.setColor(ColorUtils.blendARGB(themedColor9, getThemedColor(i6), getVideoTranscriptionProgress()));
        } else if (this.mediaBackground) {
            if (messageObject3.shouldDrawWithoutBackground()) {
                Theme.chat_timePaint.setColor(getThemedColor(Theme.key_chat_serviceText));
            } else {
                Theme.chat_timePaint.setColor(getThemedColor(Theme.key_chat_mediaTimeText));
            }
        } else if (messageObject3.isOutOwner()) {
            Theme.chat_timePaint.setColor(getThemedColor(isDrawSelectionBackground() ? Theme.key_chat_outTimeSelectedText : Theme.key_chat_outTimeText));
        } else {
            Theme.chat_timePaint.setColor(getThemedColor(isDrawSelectionBackground() ? Theme.key_chat_inTimeSelectedText : Theme.key_chat_inTimeText));
        }
        if (isWidthAdaptive()) {
            canvas.save();
            canvas.translate(-getBoundsLeft(), 0.0f);
        }
        drawBackgroundInternal(canvas, false);
        if (this.isHighlightedAnimated) {
            long currentTimeMillis = System.currentTimeMillis();
            long abs = Math.abs(currentTimeMillis - this.lastHighlightProgressTime);
            if (abs > 17) {
                abs = 17;
            }
            int i14 = (int) (this.highlightProgress - abs);
            this.highlightProgress = i14;
            this.lastHighlightProgressTime = currentTimeMillis;
            if (i14 <= 0) {
                this.highlightProgress = 0;
                this.isHighlightedAnimated = false;
                if (this.highlightedQuote) {
                    resetUrlPaths();
                }
                this.highlightedQuote = false;
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
        if (this.alphaInternal != 1.0f) {
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            Theme.MessageDrawable messageDrawable2 = this.currentBackgroundDrawable;
            if (messageDrawable2 != null) {
                i5 = messageDrawable2.getBounds().top;
                i4 = this.currentBackgroundDrawable.getBounds().bottom;
                i3 = this.currentBackgroundDrawable.getBounds().left;
                i2 = this.currentBackgroundDrawable.getBounds().right;
            } else {
                i2 = measuredWidth;
                i3 = 0;
                i4 = measuredHeight;
                i5 = 0;
            }
            if (this.drawSideButton != 0) {
                if (this.currentMessageObject.isOutOwner()) {
                    i3 -= AndroidUtilities.dp(40.0f);
                } else {
                    i2 += AndroidUtilities.dp(40.0f);
                }
            }
            if (getY() < 0.0f) {
                i5 = (int) (-getY());
            }
            float y = getY() + getMeasuredHeight();
            int i15 = this.parentHeight;
            if (y > i15) {
                i4 = (int) (i15 - getY());
            }
            this.rect.set(i3, i5, i2, i4);
            i = canvas.saveLayerAlpha(this.rect, (int) (this.alphaInternal * 255.0f), 31);
        } else {
            i = Integer.MIN_VALUE;
        }
        if (!this.transitionParams.animateBackgroundBoundsInner || (messageDrawable = this.currentBackgroundDrawable) == null || this.isRoundVideo || ((messageObject2 = this.currentMessageObject) != null && messageObject2.sendPreview)) {
            z = false;
        } else {
            Rect bounds = messageDrawable.getBounds();
            canvas.save();
            canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            z = true;
        }
        drawContent(canvas, false);
        ExpiredStoryView expiredStoryView = this.expiredStoryView;
        if (expiredStoryView != null && expiredStoryView.visible) {
            expiredStoryView.draw(canvas, this);
        }
        if (z) {
            canvas.restore();
        }
        if (this.replyNameLayout != null) {
            float f = this.replyTextHeight;
            TransitionParams transitionParams = this.transitionParams;
            if (transitionParams != null && transitionParams.animateReplyTextLayout != null) {
                f = AndroidUtilities.lerp(this.transitionParams.animateFromReplyTextHeight, f, this.transitionParams.animateChangeProgress);
            }
            this.replyHeight = AndroidUtilities.dp(9.0f) + Theme.chat_replyNamePaint.getTextSize() + Math.max(f - AndroidUtilities.dp(3.66f), Theme.chat_replyTextPaint.getTextSize());
            if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                MessageObject messageObject4 = this.currentMessageObject;
                if (messageObject4.type != 19) {
                    if (messageObject4.isOutOwner()) {
                        int dp = AndroidUtilities.dp(23.0f);
                        this.replyStartX = dp;
                        if (this.isPlayingRound) {
                            this.replyStartX = dp - (AndroidUtilities.roundPlayingMessageSize - AndroidUtilities.roundMessageSize);
                        }
                    } else if (this.currentMessageObject.type == 5) {
                        this.replyStartX = this.backgroundDrawableLeft + this.backgroundDrawableRight + AndroidUtilities.dp(4.0f);
                    } else {
                        this.replyStartX = this.backgroundDrawableLeft + this.backgroundDrawableRight + AndroidUtilities.dp(17.0f);
                    }
                    if (this.drawForwardedName) {
                        int dp2 = AndroidUtilities.dp(4.0f) + (((int) Theme.chat_forwardNamePaint.getTextSize()) * 2);
                        this.forwardHeight = dp2;
                        this.replyStartY = this.forwardNameY + dp2 + AndroidUtilities.dp(6.0f);
                    } else {
                        int dp3 = AndroidUtilities.dp(12.0f);
                        this.replyStartY = dp3;
                        if (this.drawTopic && (messageTopicButton2 = this.topicButton) != null) {
                            this.replyStartY = dp3 + messageTopicButton2.height() + AndroidUtilities.dp(10.0f);
                        }
                    }
                    this.replyStartY += AndroidUtilities.dp(0.66f);
                }
            }
            if (this.currentMessageObject.isOutOwner()) {
                int dp4 = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                this.replyStartX = dp4;
                if (this.currentMessageObject.type == 19) {
                    this.replyStartX = dp4 - Math.max(0, ((Math.max(this.replyNameWidth, this.replyTextWidth) + dp4) + AndroidUtilities.dp(14.0f)) - AndroidUtilities.displaySize.x);
                }
            } else if (this.mediaBackground) {
                this.replyStartX = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
            } else {
                this.replyStartX = this.backgroundDrawableLeft + AndroidUtilities.dp(this.drawPinnedBottom ? 12.0f : 18.0f) + getExtraTextX();
            }
            if (this.currentMessageObject.type == 19) {
                this.replyStartX -= AndroidUtilities.dp(7.0f);
            }
            this.forwardHeight = AndroidUtilities.dp(4.0f) + (((int) Theme.chat_forwardNamePaint.getTextSize()) * 2);
            int dp5 = AndroidUtilities.dp(12.0f) + ((!this.drawNameLayout || this.nameLayout == null) ? 0 : AndroidUtilities.dp(6.0f) + ((int) Theme.chat_namePaint.getTextSize())) + ((!this.drawForwardedName || this.forwardedNameLayout[0] == null) ? 0 : AndroidUtilities.dp(4.0f) + this.forwardHeight);
            this.replyStartY = dp5;
            if (this.drawTopic && (messageTopicButton = this.topicButton) != null) {
                this.replyStartY = dp5 + messageTopicButton.height() + AndroidUtilities.dp(5.0f);
            }
            this.replyStartY += AndroidUtilities.dp(0.66f);
        }
        if (this.currentPosition == null && !this.transitionParams.animateBackgroundBoundsInner && (!this.enterTransitionInProgress || this.currentMessageObject.isVoice())) {
            drawNamesLayout(canvas, 1.0f);
        }
        if ((!this.autoPlayingMedia || !MediaController.getInstance().isPlayingMessageAndReadyToDraw(this.currentMessageObject) || this.isRoundVideo) && !this.transitionParams.animateBackgroundBoundsInner && ((messageObject = this.currentMessageObject) == null || !messageObject.preview)) {
            drawOverlays(canvas);
        }
        if ((this.drawTime || !this.mediaBackground) && !this.forceNotDrawTime && !this.transitionParams.animateBackgroundBoundsInner && ((!this.enterTransitionInProgress || this.currentMessageObject.isVoice()) && (!this.currentMessageObject.isQuickReply() || this.currentMessageObject.isSendError()))) {
            drawTime(canvas, 1.0f, false);
        }
        if ((this.controlsAlpha != 1.0f || this.timeAlpha != 1.0f) && this.currentMessageObject.type != 5) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long abs2 = Math.abs(this.lastControlsAlphaChangeTime - currentTimeMillis2);
            long j = this.totalChangeTime + (abs2 <= 17 ? abs2 : 17L);
            this.totalChangeTime = j;
            if (j > 200) {
                this.totalChangeTime = 200L;
            }
            this.lastControlsAlphaChangeTime = currentTimeMillis2;
            if (this.controlsAlpha != 1.0f) {
                this.controlsAlpha = AndroidUtilities.decelerateInterpolator.getInterpolation(((float) this.totalChangeTime) / 200.0f);
            }
            if (this.timeAlpha != 1.0f) {
                this.timeAlpha = AndroidUtilities.decelerateInterpolator.getInterpolation(((float) this.totalChangeTime) / 200.0f);
            }
            invalidate();
            if (this.forceNotDrawTime && (groupedMessagePosition = this.currentPosition) != null && groupedMessagePosition.last && getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
        if ((this.drawBackground || this.transitionParams.animateDrawBackground) && shouldDrawSelectionOverlay() && this.currentMessagesGroup == null && hasSelectionOverlay()) {
            if (this.selectionOverlayPaint == null) {
                this.selectionOverlayPaint = new Paint(1);
            }
            this.selectionOverlayPaint.setColor(getSelectionOverlayColor());
            int alpha = this.selectionOverlayPaint.getAlpha();
            this.selectionOverlayPaint.setAlpha((int) (alpha * getHighlightAlpha() * getAlpha()));
            if (this.selectionOverlayPaint.getAlpha() > 0) {
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.currentBackgroundDrawable.drawCached(canvas, this.backgroundCacheParams, this.selectionOverlayPaint);
                canvas.restore();
            }
            this.selectionOverlayPaint.setAlpha(alpha);
        }
        ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
        if (chatMessageCellDelegate2 == null || chatMessageCellDelegate2.canDrawOutboundsContent() || this.transitionParams.messageEntering || getAlpha() != 1.0f) {
            drawOutboundsContent(canvas);
        }
        if (i != Integer.MIN_VALUE) {
            canvas.restoreToCount(i);
        }
        if (isWidthAdaptive()) {
            canvas.restore();
        }
        updateSelectionTextPosition();
    }

    @android.annotation.SuppressLint({"WrongCall"})
    public void drawBackgroundInternal(android.graphics.Canvas r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawBackgroundInternal(android.graphics.Canvas, boolean):void");
    }

    private void animateCheckboxTranslation() {
        boolean z = this.checkBoxVisible;
        if (z || this.checkBoxAnimationInProgress) {
            if ((z && this.checkBoxAnimationProgress == 1.0f) || (!z && this.checkBoxAnimationProgress == 0.0f)) {
                this.checkBoxAnimationInProgress = false;
            }
            this.checkBoxTranslation = (int) Math.ceil((z ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(this.checkBoxAnimationProgress) * AndroidUtilities.dp(35.0f));
            if (!this.currentMessageObject.isOutOwner() || this.currentMessageObject.hasWideCode) {
                updateTranslation();
            }
            if (this.checkBoxAnimationInProgress) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.lastCheckBoxAnimationTime;
                this.lastCheckBoxAnimationTime = elapsedRealtime;
                if (this.checkBoxVisible) {
                    float f = this.checkBoxAnimationProgress + (((float) j) / 200.0f);
                    this.checkBoxAnimationProgress = f;
                    if (f > 1.0f) {
                        this.checkBoxAnimationProgress = 1.0f;
                    }
                } else {
                    float f2 = this.checkBoxAnimationProgress - (((float) j) / 200.0f);
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
        int dp = AndroidUtilities.dp(32.0f);
        if (this.commentLayout != null) {
            this.sideStartY -= AndroidUtilities.dp(18.0f);
            dp += AndroidUtilities.dp(18.0f);
        }
        RectF rectF = this.rect;
        float f2 = this.sideStartX;
        rectF.set(f2, this.sideStartY, AndroidUtilities.dp(32.0f) + f2, this.sideStartY + dp);
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
                    TextPaint textPaint = Theme.chat_stickerCommentCountPaint;
                    double d = this.transitionParams.animateChangeProgress;
                    Double.isNaN(d);
                    double d2 = f;
                    Double.isNaN(d2);
                    textPaint.setAlpha((int) ((1.0d - d) * 255.0d * d2));
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

    private void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(i, i2, f, f2);
        } else {
            Theme.applyServiceShaderMatrix(i, i2, f, f2);
        }
    }

    public boolean hasOutboundsContent() {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.effectDrawable;
        if ((swapAnimatedEmojiDrawable2 == null || swapAnimatedEmojiDrawable2.isNotEmpty() <= 0.0f) && !this.hasFactCheck) {
            if (this.transitionParams.animateExpandedQuotes && ((i = (messageObject2 = this.currentMessageObject).type) == 0 || i == 24 || i == 19 || messageObject2.isGiveawayOrGiveawayResults())) {
                return true;
            }
            if (this.channelRecommendationsCell == null || (messageObject = this.currentMessageObject) == null || messageObject.type != 27) {
                if (getAlpha() != 1.0f) {
                    return false;
                }
                if ((this.transitionParams.transitionBotButtons.isEmpty() || !this.transitionParams.animateBotButtonsChanged) && this.botButtons.isEmpty() && this.drawSideButton == 0) {
                    if (!this.drawNameLayout || this.nameLayout == null || (swapAnimatedEmojiDrawable = this.currentNameStatusDrawable) == null || swapAnimatedEmojiDrawable.getDrawable() == null) {
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.animatedEmojiStack;
                        if (emojiGroupedSpans == null || emojiGroupedSpans.holders.isEmpty()) {
                            if (this.drawTopic && this.topicButton != null) {
                                MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
                                if (groupedMessagePosition == null) {
                                    return true;
                                }
                                if (groupedMessagePosition.minY == 0 && groupedMessagePosition.minX == 0) {
                                    return true;
                                }
                            }
                            if (this.currentMessagesGroup == null) {
                                TransitionParams transitionParams = this.transitionParams;
                                if (((transitionParams.animateReplaceCaptionLayout && transitionParams.animateChangeProgress != 1.0f) || (transitionParams.animateChangeProgress != 1.0f && transitionParams.animateMessageText)) && transitionParams.animateOutAnimateEmoji != null && !this.transitionParams.animateOutAnimateEmoji.holders.isEmpty()) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public void drawOutboundsContent(Canvas canvas) {
        TransitionParams transitionParams;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        float f;
        float f2;
        float f3;
        MessageObject.GroupedMessagePosition groupedMessagePosition2;
        float dp;
        int extraTextX;
        int themedColor;
        TLRPC$User tLRPC$User;
        TLRPC$TL_peerColor tLRPC$TL_peerColor;
        float dp2;
        float f4;
        int i;
        int i2;
        int i3;
        float dp3;
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject;
        ChannelRecommendationsCell channelRecommendationsCell = this.channelRecommendationsCell;
        if (channelRecommendationsCell != null && (messageObject = this.currentMessageObject) != null && messageObject.type == 27) {
            channelRecommendationsCell.draw(canvas);
            return;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 == null) {
            return;
        }
        int i4 = messageObject2.type;
        if ((i4 == 0 || i4 == 24 || i4 == 19 || messageObject2.isGiveawayOrGiveawayResults()) && this.transitionParams.animateExpandedQuotes) {
            layoutTextXY(false);
            drawMessageText(canvas);
        }
        if (this.currentMessagesGroup != null) {
            updateCaptionLayout();
            drawFactCheck(canvas, 1.0f);
        }
        drawFactCheckText(canvas, 1.0f);
        if (!this.enterTransitionInProgress) {
            drawAnimatedEmojis(canvas, 1.0f);
        }
        if (this.currentNameStatusDrawable != null && this.drawNameLayout && this.nameLayout != null && (((groupedMessagePosition2 = this.currentPosition) == null || (groupedMessagePosition2.minX == 0 && groupedMessagePosition2.minY == 0)) && (!this.currentMessageObject.deleted || this.drawingToBitmap || (groupedMessages = this.currentMessagesGroup) == null || groupedMessages.messages.size() < 1))) {
            if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                i = getThemedColor(Theme.key_chat_stickerNameText);
                if (this.currentMessageObject.isOutOwner()) {
                    dp3 = AndroidUtilities.dp(28.0f);
                } else {
                    dp3 = this.backgroundDrawableLeft + this.transitionParams.deltaLeft + this.backgroundDrawableRight + AndroidUtilities.dp(22.0f);
                }
                dp2 = this.layoutHeight - AndroidUtilities.dp(38.0f);
                f4 = dp3 - this.nameOffsetX;
            } else {
                float f5 = 11.0f;
                if (this.mediaBackground || this.currentMessageObject.isOutOwner()) {
                    dp = this.backgroundDrawableLeft + this.transitionParams.deltaLeft + AndroidUtilities.dp(11.0f);
                    extraTextX = getExtraTextX();
                } else {
                    dp = this.backgroundDrawableLeft + this.transitionParams.deltaLeft + AndroidUtilities.dp((this.mediaBackground || !this.drawPinnedBottom) ? 17.0f : 17.0f);
                    extraTextX = getExtraTextX();
                }
                float f6 = dp + extraTextX;
                if (this.currentMessageObject.isOutOwner() && ChatObject.isChannel(this.currentChat)) {
                    Theme.MessageDrawable messageDrawable = this.currentBackgroundDrawable;
                    if (messageDrawable != null && messageDrawable.hasGradient()) {
                        themedColor = getThemedColor(Theme.key_chat_messageTextOut);
                    } else {
                        themedColor = getThemedColor(Theme.key_chat_outForwardedNameText);
                    }
                } else if (this.currentMessageObject.isOutOwner()) {
                    themedColor = getThemedColor(Theme.key_chat_outForwardedNameText);
                } else {
                    MessageObject messageObject3 = this.currentMessageObject;
                    if (messageObject3.overrideLinkColor >= 0 || ((messageObject3.isFromUser() && this.currentUser != null) || ((this.currentMessageObject.isFromChannel() && this.currentChat != null) || ((tLRPC$TL_peerColor = this.currentMessageObject.sponsoredColor) != null && tLRPC$TL_peerColor.color != -1)))) {
                        MessageObject messageObject4 = this.currentMessageObject;
                        int i5 = messageObject4.overrideLinkColor;
                        if (i5 < 0) {
                            TLRPC$TL_peerColor tLRPC$TL_peerColor2 = messageObject4.sponsoredColor;
                            if (tLRPC$TL_peerColor2 != null) {
                                i5 = tLRPC$TL_peerColor2.color;
                            } else if (messageObject4.isFromUser() && (tLRPC$User = this.currentUser) != null) {
                                i5 = UserObject.getColorId(tLRPC$User);
                            } else {
                                i5 = ChatObject.getColorId(this.currentChat);
                            }
                        }
                        if (i5 < 7) {
                            themedColor = getThemedColor(Theme.keys_avatar_nameInMessage[i5]);
                        } else {
                            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).peerColors;
                            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i5) : null;
                            if (color != null) {
                                themedColor = color.getColor(0, this.resourcesProvider);
                            } else {
                                themedColor = getThemedColor(Theme.key_chat_inForwardedNameText);
                            }
                        }
                    } else {
                        themedColor = getThemedColor(Theme.key_chat_inForwardedNameText);
                    }
                }
                dp2 = AndroidUtilities.dp(this.drawPinnedTop ? 9.0f : 10.0f);
                int i6 = themedColor;
                f4 = f6;
                i = i6;
            }
            MessageObject.GroupedMessages groupedMessages2 = this.currentMessagesGroup;
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams2 = groupedMessages2.transitionParams;
                if (transitionParams2.backgroundChangeBounds) {
                    f4 += transitionParams2.offsetLeft;
                    dp2 += transitionParams2.offsetTop - getTranslationY();
                }
            }
            float f7 = f4 + this.animationOffsetX;
            TransitionParams transitionParams3 = this.transitionParams;
            float f8 = dp2 + transitionParams3.deltaTop;
            if (transitionParams3.animateSign) {
                f7 = ((f7 - this.transitionParams.animateNameX) * this.transitionParams.animateChangeProgress) + this.transitionParams.animateNameX;
            }
            this.currentNameStatusDrawable.setBounds((int) (Math.abs(f7) + (this.viaNameWidth > 0 ? i2 - AndroidUtilities.dp(32.0f) : this.nameLayoutWidth) + AndroidUtilities.dp(2.0f)), (int) (((this.nameLayout.getHeight() / 2) + f8) - AndroidUtilities.dp(10.0f)), (int) (Math.abs(f7) + (this.viaNameWidth > 0 ? i3 - AndroidUtilities.dp(32.0f) : this.nameLayoutWidth) + AndroidUtilities.dp(22.0f)), (int) (f8 + (this.nameLayout.getHeight() / 2) + AndroidUtilities.dp(10.0f)));
            this.currentNameStatusDrawable.setColor(Integer.valueOf(ColorUtils.setAlphaComponent(i, 115)));
            this.currentNameStatusDrawable.draw(canvas);
        }
        if (this.drawTopic && this.topicButton != null && ((groupedMessagePosition = this.currentPosition) == null || (groupedMessagePosition.minY == 0 && groupedMessagePosition.minX == 0))) {
            if (!this.isRoundVideo || this.hasLinkPreview) {
                f = 1.0f;
            } else {
                f = (1.0f - getVideoTranscriptionProgress()) * 1.0f;
                TransitionParams transitionParams4 = this.transitionParams;
                if (transitionParams4.animatePlayingRound) {
                    if (this.isPlayingRound) {
                        f3 = 1.0f - transitionParams4.animateChangeProgress;
                    } else {
                        f3 = transitionParams4.animateChangeProgress;
                    }
                    f *= f3;
                } else if (this.isPlayingRound) {
                    f = 0.0f;
                }
            }
            if (!this.transitionParams.animateForwardedLayout) {
                f2 = 1.0f;
            } else if (!this.currentMessageObject.needDrawForwarded()) {
                f2 = 1.0f - this.transitionParams.animateChangeProgress;
            } else {
                f2 = this.transitionParams.animateChangeProgress;
            }
            this.topicButton.drawOutbounds(canvas, f2 * f);
        }
        if (!this.transitionParams.transitionBotButtons.isEmpty()) {
            if (this.transitionParams.animateBotButtonsChanged) {
                drawBotButtons(canvas, this.transitionParams.transitionBotButtons, (int) (MathUtils.clamp(1.0f - ((float) Math.pow(transitionParams.animateChangeProgress, 2.0d)), 0.0f, 1.0f) * 255.0f));
            }
        }
        if (!this.botButtons.isEmpty()) {
            ArrayList<BotButton> arrayList = this.botButtons;
            TransitionParams transitionParams5 = this.transitionParams;
            drawBotButtons(canvas, arrayList, transitionParams5.animateBotButtonsChanged ? (int) (transitionParams5.animateChangeProgress * 255.0f) : 255);
        }
        drawSideButton(canvas);
    }

    public void drawAnimatedEmojis(Canvas canvas, float f) {
        drawAnimatedEmojiMessageText(canvas, f);
        if (shouldDrawCaptionLayout()) {
            drawAnimatedEmojiCaption(canvas, f);
        }
    }

    private void drawAnimatedEmojiMessageText(Canvas canvas, float f) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.isSponsored()) {
            return;
        }
        int i = this.textY;
        float f2 = i;
        TransitionParams transitionParams = this.transitionParams;
        if (transitionParams.animateText) {
            float f3 = transitionParams.animateFromTextY;
            float f4 = transitionParams.animateChangeProgress;
            f2 = (f3 * (1.0f - f4)) + (i * f4);
        }
        float f5 = f2;
        if (transitionParams.animateChangeProgress != 1.0f && transitionParams.animateMessageText) {
            canvas.save();
            Theme.MessageDrawable messageDrawable = this.currentBackgroundDrawable;
            if (messageDrawable != null) {
                Rect bounds = messageDrawable.getBounds();
                if (this.currentMessageObject.isOutOwner() && !this.mediaBackground && !this.pinnedBottom) {
                    canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(10.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                } else {
                    canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                }
            }
            drawAnimatedEmojiMessageText(this.textX, f5, canvas, this.transitionParams.animateOutTextBlocks, this.transitionParams.animateOutAnimateEmoji, false, f * (1.0f - this.transitionParams.animateChangeProgress), this.currentMessageObject.textXOffset, false);
            float f6 = this.textX;
            MessageObject messageObject2 = this.currentMessageObject;
            drawAnimatedEmojiMessageText(f6, f5, canvas, messageObject2.textLayoutBlocks, this.animatedEmojiStack, true, f * this.transitionParams.animateChangeProgress, messageObject2.textXOffset, false);
            canvas.restore();
            return;
        }
        float f7 = this.textX;
        MessageObject messageObject3 = this.currentMessageObject;
        drawAnimatedEmojiMessageText(f7, f5, canvas, messageObject3.textLayoutBlocks, this.animatedEmojiStack, true, f, messageObject3.textXOffset, false);
    }

    private void drawAnimatedEmojiMessageText(float r27, float r28, android.graphics.Canvas r29, java.util.ArrayList<org.telegram.messenger.MessageObject.TextLayoutBlock> r30, org.telegram.ui.Components.AnimatedEmojiSpan.EmojiGroupedSpans r31, boolean r32, float r33, float r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawAnimatedEmojiMessageText(float, float, android.graphics.Canvas, java.util.ArrayList, org.telegram.ui.Components.AnimatedEmojiSpan$EmojiGroupedSpans, boolean, float, float, boolean):void");
    }

    public void drawAnimatedEmojiCaption(android.graphics.Canvas r17, float r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawAnimatedEmojiCaption(android.graphics.Canvas, float):void");
    }

    private void drawSideButton(Canvas canvas) {
        MessageObject.GroupedMessages groupedMessages;
        if (this.drawSideButton != 0) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
            if (groupedMessagePosition == null || (groupedMessages = this.currentMessagesGroup) == null || !groupedMessages.isDocuments || groupedMessagePosition.last) {
                if (this.currentMessageObject.isOutOwner()) {
                    float dp = this.transitionParams.lastBackgroundLeft - AndroidUtilities.dp(40.0f);
                    this.sideStartX = dp;
                    MessageObject.GroupedMessages groupedMessages2 = this.currentMessagesGroup;
                    if (groupedMessages2 != null) {
                        this.sideStartX = dp + (groupedMessages2.transitionParams.offsetLeft - this.animationOffsetX);
                    }
                } else {
                    float dp2 = this.transitionParams.lastBackgroundRight + AndroidUtilities.dp(8.0f);
                    this.sideStartX = dp2;
                    MessageObject.GroupedMessages groupedMessages3 = this.currentMessagesGroup;
                    if (groupedMessages3 != null) {
                        this.sideStartX = dp2 + (groupedMessages3.transitionParams.offsetRight - this.animationOffsetX);
                    }
                }
                if (this.drawSideButton == 4) {
                    this.sideStartY = AndroidUtilities.dp(6.0f);
                } else {
                    float dp3 = (this.layoutHeight + this.transitionParams.deltaBottom) - AndroidUtilities.dp(41.0f);
                    this.sideStartY = dp3;
                    MessageObject messageObject = this.currentMessageObject;
                    if (messageObject.type == 19 && messageObject.textWidth < this.timeTextWidth) {
                        this.sideStartY = dp3 - AndroidUtilities.dp(22.0f);
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
                    float dp4 = ((this.layoutHeight + this.transitionParams.deltaBottom) - AndroidUtilities.dp(32.0f)) / 2.0f;
                    if (this.sideStartY < dp4) {
                        this.sideStartY = dp4;
                    }
                }
                if (!this.currentMessageObject.isOutOwner() && this.isRoundVideo && !this.hasLinkPreview) {
                    float dp5 = this.isAvatarVisible ? (AndroidUtilities.roundPlayingMessageSize - AndroidUtilities.roundMessageSize) * 0.7f : AndroidUtilities.dp(50.0f);
                    float videoTranscriptionProgress = this.isPlayingRound ? (1.0f - getVideoTranscriptionProgress()) * dp5 : 0.0f;
                    float dp6 = this.isPlayingRound ? AndroidUtilities.dp(28.0f) * (1.0f - getVideoTranscriptionProgress()) : 0.0f;
                    TransitionParams transitionParams2 = this.transitionParams;
                    if (transitionParams2.animatePlayingRound) {
                        videoTranscriptionProgress = (this.isPlayingRound ? transitionParams2.animateChangeProgress : 1.0f - transitionParams2.animateChangeProgress) * (1.0f - getVideoTranscriptionProgress()) * dp5;
                        dp6 = AndroidUtilities.dp(28.0f) * (this.isPlayingRound ? this.transitionParams.animateChangeProgress : 1.0f - this.transitionParams.animateChangeProgress) * (1.0f - getVideoTranscriptionProgress());
                    }
                    this.sideStartX -= videoTranscriptionProgress;
                    this.sideStartY -= dp6;
                }
                if (this.drawSideButton == 3) {
                    if (!this.enterTransitionInProgress || this.currentMessageObject.isVoice()) {
                        drawCommentButton(canvas, 1.0f);
                    }
                } else if (SizeNotifierFrameLayout.drawingBlur) {
                } else {
                    RectF rectF = this.rect;
                    float f3 = this.sideStartX;
                    rectF.set(f3, this.sideStartY, AndroidUtilities.dp(32.0f) + f3, this.sideStartY + AndroidUtilities.dp(this.drawSideButton2 == 5 ? 64.0f : 32.0f));
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
                            this.sideButtonPathCorners1 = r2;
                            float dp7 = AndroidUtilities.dp(16.0f);
                            float[] fArr = {dp7, dp7, dp7, dp7};
                        }
                        if (this.sideButtonPathCorners2 == null) {
                            this.sideButtonPathCorners2 = r2;
                            float dp8 = AndroidUtilities.dp(16.0f);
                            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, dp8, dp8, dp8, dp8};
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f4 = this.sideStartX;
                        rectF2.set(f4, this.sideStartY, AndroidUtilities.dp(32.0f) + f4, this.sideStartY + AndroidUtilities.dp(32.0f));
                        this.sideButtonPath1.addRoundRect(rectF2, this.sideButtonPathCorners1, Path.Direction.CW);
                        rectF2.set(this.sideStartX, this.sideStartY + AndroidUtilities.dp(32.0f), this.sideStartX + AndroidUtilities.dp(32.0f), this.sideStartY + AndroidUtilities.dp(64.0f));
                        this.sideButtonPath2.addRoundRect(rectF2, this.sideButtonPathCorners2, Path.Direction.CW);
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
                        int dp9 = (int) (this.sideStartX + AndroidUtilities.dp(16.0f));
                        int dp10 = (int) (this.sideStartY + AndroidUtilities.dp(16.0f));
                        Drawable themedDrawable2 = getThemedDrawable("drawableCloseIcon");
                        int intrinsicWidth = themedDrawable2.getIntrinsicWidth() / 2;
                        int intrinsicHeight = themedDrawable2.getIntrinsicHeight() / 2;
                        themedDrawable2.setBounds(dp9 - intrinsicWidth, dp10 - intrinsicHeight, intrinsicWidth + dp9, intrinsicHeight + dp10);
                        BaseCell.setDrawableBounds(themedDrawable2, this.sideStartX + AndroidUtilities.dp(4.0f), this.sideStartY + AndroidUtilities.dp(4.0f));
                        canvas.save();
                        canvas.scale(0.65f, 0.65f, themedDrawable2.getBounds().centerX(), themedDrawable2.getBounds().centerY());
                        themedDrawable2.draw(canvas);
                        canvas.restore();
                        if (this.drawSideButton2 == 5) {
                            Drawable themedDrawable3 = getThemedDrawable("drawableMoreIcon");
                            int intrinsicWidth2 = themedDrawable3.getIntrinsicWidth() / 2;
                            int intrinsicHeight2 = themedDrawable3.getIntrinsicHeight() / 2;
                            themedDrawable3.setBounds(dp9 - intrinsicWidth2, dp10 - intrinsicHeight2, dp9 + intrinsicWidth2, dp10 + intrinsicHeight2);
                            BaseCell.setDrawableBounds(themedDrawable3, this.sideStartX + AndroidUtilities.dp(4.0f), this.sideStartY + AndroidUtilities.dp(34.0f));
                            themedDrawable3.draw(canvas);
                        }
                    } else {
                        int dp11 = (int) (this.sideStartX + AndroidUtilities.dp(16.0f));
                        int dp12 = (int) (this.sideStartY + AndroidUtilities.dp(16.0f));
                        Drawable themedDrawable4 = getThemedDrawable("drawableShareIcon");
                        int intrinsicWidth3 = themedDrawable4.getIntrinsicWidth() / 2;
                        int intrinsicHeight3 = themedDrawable4.getIntrinsicHeight() / 2;
                        themedDrawable4.setBounds(dp11 - intrinsicWidth3, dp12 - intrinsicHeight3, dp11 + intrinsicWidth3, dp12 + intrinsicHeight3);
                        BaseCell.setDrawableBounds(themedDrawable4, this.sideStartX + AndroidUtilities.dp(4.0f), this.sideStartY + AndroidUtilities.dp(4.0f));
                        themedDrawable4.draw(canvas);
                    }
                }
            }
        }
    }

    public void setTimeAlpha(float f) {
        this.timeAlpha = f;
    }

    public float getTimeAlpha() {
        return this.timeAlpha;
    }

    public int getBackgroundDrawableLeft() {
        int dp;
        int dp2;
        int i;
        MessageObject messageObject = getMessageObject();
        if (messageObject != null && messageObject.isOutOwner()) {
            if (this.isRoundVideo) {
                return (this.layoutWidth - this.backgroundWidth) - ((int) ((1.0f - getVideoTranscriptionProgress()) * AndroidUtilities.dp(9.0f)));
            }
            return (this.layoutWidth - this.backgroundWidth) - (this.mediaBackground ? AndroidUtilities.dp(9.0f) : 0);
        }
        if (this.isRoundVideo) {
            if ((this.isChat || (messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar))) && this.isAvatarVisible) {
                r1 = 48;
            }
            dp = AndroidUtilities.dp(r1 + 3) + ((int) (AndroidUtilities.dp(6.0f) * (1.0f - getVideoTranscriptionProgress())));
        } else {
            if ((this.isChat || (messageObject != null && (messageObject.isRepostPreview || messageObject.forceAvatar))) && this.isAvatarVisible) {
                r1 = 48;
            }
            dp = AndroidUtilities.dp(r1 + (this.mediaBackground ? 9 : 3));
        }
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null && !groupedMessages.isDocuments && (i = this.currentPosition.leftSpanOffset) != 0) {
            dp += (int) Math.ceil((i / 1000.0f) * getGroupPhotosWidth());
        }
        if (this.isRoundVideo) {
            if (!this.drawPinnedBottom) {
                return dp;
            }
            dp2 = (int) (AndroidUtilities.dp(6.0f) * (1.0f - getVideoTranscriptionProgress()));
        } else if (this.mediaBackground || !this.drawPinnedBottom) {
            return dp;
        } else {
            dp2 = AndroidUtilities.dp(6.0f);
        }
        return dp + dp2;
    }

    public int getBackgroundDrawableRight() {
        int dp;
        int backgroundDrawableLeft;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i = this.backgroundWidth;
        if (this.isRoundVideo) {
            dp = i - ((int) (getVideoTranscriptionProgress() * AndroidUtilities.dp(3.0f)));
            if (this.drawPinnedBottom && (messageObject2 = this.currentMessageObject) != null && messageObject2.isOutOwner()) {
                dp = (int) (dp - (AndroidUtilities.dp(6.0f) * (1.0f - getVideoTranscriptionProgress())));
            }
            if (this.drawPinnedBottom && ((messageObject = this.currentMessageObject) == null || !messageObject.isOutOwner())) {
                dp = (int) (dp - (AndroidUtilities.dp(6.0f) * (1.0f - getVideoTranscriptionProgress())));
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        } else {
            dp = i - (this.mediaBackground ? 0 : AndroidUtilities.dp(3.0f));
            if (!this.mediaBackground && this.drawPinnedBottom) {
                dp -= AndroidUtilities.dp(6.0f);
            }
            backgroundDrawableLeft = getBackgroundDrawableLeft();
        }
        return backgroundDrawableLeft + dp;
    }

    public int getBackgroundDrawableTop() {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        int dp = ((groupedMessagePosition == null || (groupedMessagePosition.flags & 4) != 0) ? 0 : 0 - AndroidUtilities.dp(3.0f)) + (this.drawPinnedTop ? 0 : AndroidUtilities.dp(1.0f));
        return (this.mediaBackground || !this.drawPinnedTop) ? dp : dp - AndroidUtilities.dp(1.0f);
    }

    public int getBackgroundDrawableBottom() {
        int i;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        int i2 = 0;
        if (groupedMessagePosition != null) {
            int i3 = 4;
            i = (groupedMessagePosition.flags & 4) == 0 ? AndroidUtilities.dp(3.0f) + 0 : 0;
            if ((this.currentPosition.flags & 8) == 0) {
                MessageObject messageObject = this.currentMessageObject;
                if (messageObject != null && messageObject.isOutOwner()) {
                    i3 = 3;
                }
                i += AndroidUtilities.dp(i3);
            }
        } else {
            i = 0;
        }
        boolean z = this.drawPinnedBottom;
        if (!z || !this.drawPinnedTop) {
            if (z) {
                i2 = AndroidUtilities.dp(1.0f);
            } else {
                i2 = AndroidUtilities.dp(2.0f);
            }
        }
        int backgroundDrawableTop = ((getBackgroundDrawableTop() + this.layoutHeight) - i2) + i;
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

    public boolean hasNameLayout() {
        if (!this.drawNameLayout || this.nameLayout == null) {
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
            return this.replyNameLayout != null || this.drawTopic;
        }
        return true;
    }

    public boolean isDrawNameLayout() {
        return this.drawNameLayout && this.nameLayout != null;
    }

    public boolean isDrawTopic() {
        return this.drawTopic;
    }

    public float getDrawTopicHeight() {
        MessageTopicButton messageTopicButton = this.topicButton;
        if (messageTopicButton != null) {
            return messageTopicButton.height();
        }
        return 0.0f;
    }

    public boolean isAdminLayoutChanged() {
        return !TextUtils.equals(this.lastPostAuthor, this.currentMessageObject.messageOwner.post_author);
    }

    public void drawNamesLayout(android.graphics.Canvas r42, float r43) {
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

    public Theme.MessageDrawable getCurrentBackgroundDrawable(boolean z) {
        if (z) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
            boolean z2 = groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && this.currentMessagesGroup.isDocuments && !this.drawPinnedBottom;
            if (this.currentMessageObject.isOutOwner()) {
                if (!this.mediaBackground && !this.drawPinnedBottom && !z2) {
                    this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgOut");
                } else {
                    this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgOutMedia");
                }
            } else if (!this.mediaBackground && !this.drawPinnedBottom && !z2) {
                this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgIn");
            } else {
                this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgInMedia");
            }
        }
        this.currentBackgroundDrawable.getBackgroundDrawable();
        return this.currentBackgroundDrawable;
    }

    private boolean shouldDrawCaptionLayout() {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || messageObject.preview || ((groupedMessagePosition = this.currentPosition) != null && ((groupedMessages = this.currentMessagesGroup) == null || !groupedMessages.isDocuments || (groupedMessagePosition.flags & 8) != 0)) || this.transitionParams.animateBackgroundBoundsInner || (this.enterTransitionInProgress && messageObject.isVoice())) ? false : true;
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

    public void drawReactionsLayout(Canvas canvas, float f) {
        if (this.isRoundVideo) {
            this.reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f - getVideoTranscriptionProgress();
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
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
        if (reactionsLayoutInBubble.drawServiceShaderBackground > 0.0f) {
            applyServiceShaderMatrix();
        }
        if (getAlpha() != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) (getAlpha() * 255.0f), 31);
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
        if (reactionsLayoutInBubble2.drawServiceShaderBackground > 0.0f || !this.transitionParams.animateBackgroundBoundsInner || this.currentPosition != null || this.isRoundVideo) {
            TransitionParams transitionParams = this.transitionParams;
            reactionsLayoutInBubble2.draw(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f, null);
        } else {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + this.transitionParams.deltaBottom);
            ReactionsLayoutInBubble reactionsLayoutInBubble3 = this.reactionsLayoutInBubble;
            TransitionParams transitionParams2 = this.transitionParams;
            reactionsLayoutInBubble3.draw(canvas, transitionParams2.animateChange ? transitionParams2.animateChangeProgress : 1.0f, null);
            canvas.restore();
        }
        if (getAlpha() != 1.0f) {
            canvas.restore();
        }
    }

    private void drawCaptionLayout(android.graphics.Canvas r32, org.telegram.messenger.MessageObject.TextLayoutBlocks r33, boolean r34, boolean r35, float r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawCaptionLayout(android.graphics.Canvas, org.telegram.messenger.MessageObject$TextLayoutBlocks, boolean, boolean, float):void");
    }

    public void drawProgressLoadingLink(Canvas canvas, int i) {
        updateProgressLoadingLink();
        ArrayList<LoadingDrawableLocation> arrayList = this.progressLoadingLinkDrawables;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        int themedColor = getThemedColor((messageObject == null || !messageObject.isOutOwner()) ? Theme.key_chat_linkSelectBackground : Theme.key_chat_outLinkSelectBackground);
        int i2 = 0;
        while (i2 < this.progressLoadingLinkDrawables.size()) {
            LoadingDrawableLocation loadingDrawableLocation = this.progressLoadingLinkDrawables.get(i2);
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
            ArrayList<LoadingDrawableLocation> arrayList = this.progressLoadingLinkDrawables;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            for (int i = 0; i < this.progressLoadingLinkDrawables.size(); i++) {
                LoadingDrawableLocation loadingDrawableLocation = this.progressLoadingLinkDrawables.get(i);
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
        LoadingDrawableLocation loadingDrawableLocation2 = new LoadingDrawableLocation(this);
        loadingDrawableLocation2.drawable = this.progressLoadingLinkCurrentDrawable;
        loadingDrawableLocation2.blockNum = -3;
        if (this.progressLoadingLinkDrawables == null) {
            this.progressLoadingLinkDrawables = new ArrayList<>();
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

    private boolean findProgressLoadingLink(LoadingDrawableLocation loadingDrawableLocation, LinkPath linkPath, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        if (arrayList == null) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (findProgressLoadingLink(loadingDrawableLocation, linkPath, arrayList.get(i).textLayout, 0.0f, i)) {
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
                } else if (characterStyleArr[i2] == this.progressLoadingLink) {
                    loadingDrawableLocation.blockNum = i;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (loadingDrawableLocation.blockNum == i) {
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
        return false;
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

    private void drawTimeInternal(android.graphics.Canvas r41, float r42, boolean r43, float r44, android.text.StaticLayout r45, float r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawTimeInternal(android.graphics.Canvas, float, boolean, float, android.text.StaticLayout, float, boolean):void");
    }

    public void createStatusDrawableAnimator(int i, int i2, final boolean z) {
        boolean z2 = false;
        boolean z3 = (i2 & 1) != 0;
        boolean z4 = (i2 & 2) != 0;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        if (!((i & 4) != 0) && z6 && z4 && !z5 && z3) {
            z2 = true;
        }
        if (!this.transitionParams.messageEntering || z2) {
            this.statusDrawableProgress = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.statusDrawableAnimator = ofFloat;
            if (z2) {
                ofFloat.setDuration(220L);
            } else {
                ofFloat.setDuration(150L);
            }
            this.statusDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animateFromStatusDrawableParams = i;
            this.animateToStatusDrawableParams = i2;
            this.statusDrawableAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatMessageCell.this.lambda$createStatusDrawableAnimator$12(z, valueAnimator);
                }
            });
            this.statusDrawableAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    int createStatusDrawableParams = ChatMessageCell.this.transitionParams.createStatusDrawableParams();
                    if (ChatMessageCell.this.animateToStatusDrawableParams == createStatusDrawableParams) {
                        ChatMessageCell.this.statusDrawableAnimationInProgress = false;
                        ChatMessageCell chatMessageCell = ChatMessageCell.this;
                        chatMessageCell.transitionParams.lastStatusDrawableParams = chatMessageCell.animateToStatusDrawableParams;
                        return;
                    }
                    ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
                    chatMessageCell2.createStatusDrawableAnimator(chatMessageCell2.animateToStatusDrawableParams, createStatusDrawableParams, z);
                }
            });
            this.statusDrawableAnimationInProgress = true;
            this.statusDrawableAnimator.start();
        }
    }

    public void lambda$createStatusDrawableAnimator$12(boolean z, ValueAnimator valueAnimator) {
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
        TransitionParams transitionParams = this.transitionParams;
        return transitionParams.shouldAnimateTimeX ? AndroidUtilities.lerp(transitionParams.animateFromTimeX, this.timeX, transitionParams.animateChangeProgress) : this.timeX;
    }

    public float getTimeY() {
        int i;
        int i2 = 0;
        if (shouldDrawTimeOnMedia()) {
            if (this.drawCommentButton) {
                i2 = AndroidUtilities.dp(41.3f);
            }
        } else if (this.currentMessageObject.isSponsored()) {
            i = -AndroidUtilities.dp(48.0f);
            if (this.hasNewLineForTime) {
                i -= AndroidUtilities.dp(4.0f);
            }
            return getTimeY(i);
        } else if (this.drawCommentButton) {
            i2 = AndroidUtilities.dp(43.0f);
        }
        i = -i2;
        return getTimeY(i);
    }

    public float getTimeY(float f) {
        if (shouldDrawTimeOnMedia() && this.documentAttachType != 7) {
            return ((getPhotoBottom() + this.additionalTimeOffsetY) - AndroidUtilities.dp(7.3f)) - this.timeLayout.getHeight();
        }
        float dp = ((this.layoutHeight - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 7.5f : 6.5f)) - this.timeLayout.getHeight()) + f;
        if (this.isRoundVideo) {
            dp -= (AndroidUtilities.dp(this.drawPinnedBottom ? 4.0f : 5.0f) + this.reactionsLayoutInBubble.getCurrentTotalHeight(this.transitionParams.animateChangeProgress)) * (1.0f - getVideoTranscriptionProgress());
        }
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages != null) {
            MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
            float f2 = dp + transitionParams.offsetBottom;
            return transitionParams.backgroundChangeBounds ? f2 - getTranslationY() : f2;
        }
        TransitionParams transitionParams2 = this.transitionParams;
        return dp + (transitionParams2.deltaBottom - transitionParams2.deltaTop);
    }

    private void drawViewsAndRepliesLayout(android.graphics.Canvas r25, float r26, float r27, float r28, float r29, float r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawViewsAndRepliesLayout(android.graphics.Canvas, float, float, float, float, float, boolean):void");
    }

    private void drawStatusDrawable(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5, float f2, float f3, float f4, boolean z6, boolean z7) {
        float photoBottom;
        int dp;
        int dp2;
        int i;
        Drawable themedDrawable;
        Drawable drawable;
        int i2;
        MessageObject messageObject;
        boolean z8 = (f4 == 1.0f || z6) ? false : true;
        float f5 = (f4 * 0.5f) + 0.5f;
        float f6 = z8 ? f * f4 : f;
        if (this.documentAttachType != 7 || ((messageObject = this.currentMessageObject) != null && messageObject.isRoundOnce())) {
            photoBottom = getPhotoBottom() + this.additionalTimeOffsetY;
        } else {
            photoBottom = f3 - ((AndroidUtilities.dp(this.drawPinnedBottom ? 4.0f : 5.0f) + this.reactionsLayoutInBubble.getCurrentTotalHeight(this.transitionParams.animateChangeProgress)) * (1.0f - getVideoTranscriptionProgress()));
        }
        float dp3 = photoBottom - AndroidUtilities.dp(8.5f);
        MessageObject messageObject2 = this.currentMessageObject;
        float dp4 = (messageObject2 == null || !messageObject2.isAnyKindOfSticker()) ? 0.0f : AndroidUtilities.dp(-6.0f);
        if (z3) {
            MsgClockDrawable msgClockDrawable = Theme.chat_msgClockDrawable;
            if (shouldDrawTimeOnMedia()) {
                if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                    i2 = getThemedColor(Theme.key_chat_serviceText);
                    BaseCell.setDrawableBounds(msgClockDrawable, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 24.0f : 22.0f)) - msgClockDrawable.getIntrinsicWidth()) + dp4, (dp3 - msgClockDrawable.getIntrinsicHeight()) + f2);
                    msgClockDrawable.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                } else {
                    i2 = getThemedColor(Theme.key_chat_mediaSentClock);
                    BaseCell.setDrawableBounds(msgClockDrawable, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 24.0f : 22.0f)) - msgClockDrawable.getIntrinsicWidth()) + dp4, (dp3 - msgClockDrawable.getIntrinsicHeight()) + f2);
                    msgClockDrawable.setAlpha((int) (f6 * 255.0f));
                }
            } else {
                int themedColor = getThemedColor(Theme.key_chat_outSentClock);
                BaseCell.setDrawableBounds(msgClockDrawable, (this.layoutWidth - AndroidUtilities.dp(18.5f)) - msgClockDrawable.getIntrinsicWidth(), ((f3 - AndroidUtilities.dp(8.5f)) - msgClockDrawable.getIntrinsicHeight()) + f2);
                msgClockDrawable.setAlpha((int) (f6 * 255.0f));
                i2 = themedColor;
            }
            msgClockDrawable.setColor(i2);
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
        float f7 = 9.0f;
        if (z2) {
            if (shouldDrawTimeOnMedia()) {
                if (z6) {
                    canvas.save();
                }
                if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                    drawable = getThemedDrawable("drawableMsgStickerCheck");
                    if (z) {
                        if (z6) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (1.0f - f4), 0.0f);
                        }
                        BaseCell.setDrawableBounds(drawable, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 28.3f : 26.3f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f2);
                    } else {
                        BaseCell.setDrawableBounds(drawable, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 23.5f : 21.5f)) - drawable.getIntrinsicWidth()) + dp4, (dp3 - drawable.getIntrinsicHeight()) + f2);
                    }
                    drawable.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                } else {
                    if (z) {
                        if (z6) {
                            canvas.translate(AndroidUtilities.dp(4.8f) * (1.0f - f4), 0.0f);
                        }
                        BaseCell.setDrawableBounds(Theme.chat_msgMediaCheckDrawable, (this.layoutWidth - AndroidUtilities.dp(z5 ? 28.3f : 26.3f)) - Theme.chat_msgMediaCheckDrawable.getIntrinsicWidth(), (dp3 - Theme.chat_msgMediaCheckDrawable.getIntrinsicHeight()) + f2);
                    } else {
                        BaseCell.setDrawableBounds(Theme.chat_msgMediaCheckDrawable, (this.layoutWidth - AndroidUtilities.dp(z5 ? 23.5f : 21.5f)) - Theme.chat_msgMediaCheckDrawable.getIntrinsicWidth(), (dp3 - Theme.chat_msgMediaCheckDrawable.getIntrinsicHeight()) + f2);
                    }
                    Theme.chat_msgMediaCheckDrawable.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                    drawable = Theme.chat_msgMediaCheckDrawable;
                }
                if (z8) {
                    canvas.save();
                    canvas.scale(f5, f5, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                }
                drawable.draw(canvas);
                if (z8) {
                    canvas.restore();
                }
                if (z6) {
                    canvas.restore();
                }
                drawable.setAlpha(255);
            } else {
                if (z6) {
                    canvas.save();
                }
                if (z) {
                    if (z6) {
                        canvas.translate(AndroidUtilities.dp(4.0f) * (1.0f - f4), 0.0f);
                    }
                    themedDrawable = getThemedDrawable(z7 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                    BaseCell.setDrawableBounds(themedDrawable, ((this.layoutWidth - AndroidUtilities.dp(22.5f)) - themedDrawable.getIntrinsicWidth()) + dp4, ((f3 - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 9.0f : 8.0f)) - themedDrawable.getIntrinsicHeight()) + f2);
                } else {
                    themedDrawable = getThemedDrawable(z7 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                    BaseCell.setDrawableBounds(themedDrawable, ((this.layoutWidth - AndroidUtilities.dp(18.5f)) - themedDrawable.getIntrinsicWidth()) + dp4, ((f3 - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 9.0f : 8.0f)) - themedDrawable.getIntrinsicHeight()) + f2);
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
                Drawable themedDrawable2 = this.currentMessageObject.shouldDrawWithoutBackground() ? getThemedDrawable("drawableMsgStickerHalfCheck") : Theme.chat_msgMediaHalfCheckDrawable;
                BaseCell.setDrawableBounds(themedDrawable2, ((this.layoutWidth - AndroidUtilities.dp(z5 ? 23.5f : 21.5f)) - themedDrawable2.getIntrinsicWidth()) + dp4, (dp3 - themedDrawable2.getIntrinsicHeight()) + f2);
                themedDrawable2.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                if (z8 || z6) {
                    canvas.save();
                    canvas.scale(f5, f5, themedDrawable2.getBounds().centerX(), themedDrawable2.getBounds().centerY());
                }
                themedDrawable2.draw(canvas);
                if (z8 || z6) {
                    canvas.restore();
                }
                themedDrawable2.setAlpha(255);
            } else {
                Drawable themedDrawable3 = getThemedDrawable(z7 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                float dp5 = (this.layoutWidth - AndroidUtilities.dp(18.0f)) - themedDrawable3.getIntrinsicWidth();
                if (!this.pinnedBottom && !this.pinnedTop) {
                    f7 = 8.0f;
                }
                BaseCell.setDrawableBounds(themedDrawable3, dp5, ((f3 - AndroidUtilities.dp(f7)) - themedDrawable3.getIntrinsicHeight()) + f2);
                themedDrawable3.setAlpha((int) (f6 * 255.0f));
                if (z8 || z6) {
                    canvas.save();
                    canvas.scale(f5, f5, themedDrawable3.getBounds().centerX(), themedDrawable3.getBounds().centerY());
                }
                themedDrawable3.draw(canvas);
                if (z8 || z6) {
                    canvas.restore();
                }
                themedDrawable3.setAlpha(255);
            }
        }
        if (z4) {
            if (shouldDrawTimeOnMedia()) {
                dp = this.layoutWidth - AndroidUtilities.dp(34.5f);
                dp2 = AndroidUtilities.dp(26.5f);
            } else {
                dp = this.layoutWidth - AndroidUtilities.dp(32.0f);
                dp2 = AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 22.0f : 21.0f);
            }
            float f8 = (f3 - dp2) + f2;
            this.rect.set((int) (dp + dp4), f8, AndroidUtilities.dp(14.0f) + i, AndroidUtilities.dp(14.0f) + f8);
            int alpha = Theme.chat_msgErrorPaint.getAlpha();
            Theme.chat_msgErrorPaint.setAlpha((int) (alpha * f6));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.chat_msgErrorPaint);
            Theme.chat_msgErrorPaint.setAlpha(alpha);
            BaseCell.setDrawableBounds(Theme.chat_msgErrorDrawable, i + AndroidUtilities.dp(6.0f), f8 + AndroidUtilities.dp(2.0f));
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

    public void drawOverlays(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawOverlays(android.graphics.Canvas):void");
    }

    public void drawRadialProgress(Canvas canvas) {
        boolean isRoundOnce = this.currentMessageObject.isRoundOnce();
        if (isRoundOnce) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.radialProgress.getProgressRect());
            rectF.inset(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.radialProgressAlpha * 255.0f), 31);
        } else {
            canvas.save();
            int i = this.currentMessageObject.type;
            if (this.drawPhotoImage && (i == 3 || i == 1 || i == 8)) {
                canvas.clipRect(this.photoImage.getImageX(), this.photoImage.getImageY(), this.photoImage.getImageX2(), this.photoImage.getImageY2());
            }
        }
        if (this.currentMessageObject.needDrawBluredPreview()) {
            drawPhotoBlurRect(canvas, this.radialProgress.getProgressRect());
        }
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.iconScale = 1.0f;
        radialProgress2.draw(canvas);
        if (isRoundOnce) {
            canvas.save();
            drawPhotoBlurRect(canvas, getRadialProgress().getProgressRect());
            getRadialProgress().draw(canvas);
            RectF progressRect = getRadialProgress().getProgressRect();
            float centerX = progressRect.centerX() + AndroidUtilities.dp(18.0f);
            float centerY = progressRect.centerY() + AndroidUtilities.dp(18.0f);
            float dp = AndroidUtilities.dp(10.0f);
            float dp2 = AndroidUtilities.dp(1.33f) + dp;
            if (this.clipPaint == null) {
                Paint paint = new Paint(1);
                this.clipPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            canvas.drawCircle(centerX, centerY, dp2, this.clipPaint);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(centerX - dp, centerY - dp, centerX + dp, dp + centerY);
            drawPhotoBlurRect(canvas, rectF2);
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
            periodDrawable3.diameterDp = 14.0f;
            periodDrawable3.setTextSize(10.0f);
            this.oncePeriod.setClear(false);
            this.oncePeriod.setCenterXY(centerX, centerY);
            this.oncePeriod.draw(canvas, 1.0f);
            canvas.restore();
        }
        canvas.restore();
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

    public MessageObject getMessageObject() {
        MessageObject messageObject = this.messageObjectToSet;
        return messageObject != null ? messageObject : this.currentMessageObject;
    }

    public TLRPC$Document getStreamingMedia() {
        int i = this.documentAttachType;
        if (i == 4 || i == 7 || i == 2) {
            return this.documentAttach;
        }
        return null;
    }

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
        } else if (this.drawBackground) {
            return transitionParams.animateChangeProgress;
        } else {
            return 1.0f - transitionParams.animateChangeProgress;
        }
    }

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

    public MessageObject.GroupedMessages getCurrentMessagesGroup() {
        return this.currentMessagesGroup;
    }

    public MessageObject.GroupedMessagePosition getCurrentPosition() {
        return this.currentPosition;
    }

    public int getLayoutHeight() {
        return this.layoutHeight;
    }

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        ChatMessageCellDelegate chatMessageCellDelegate;
        ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
        if (chatMessageCellDelegate2 == null || !chatMessageCellDelegate2.onAccessibilityAction(i, bundle)) {
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
                ChatMessageCellDelegate chatMessageCellDelegate3 = this.delegate;
                if (chatMessageCellDelegate3 != null) {
                    if (this.currentMessageObject.type == 16) {
                        chatMessageCellDelegate3.didLongPress(this, 0.0f, 0.0f);
                    } else {
                        chatMessageCellDelegate3.didPressOther(this, this.otherX, this.otherY);
                    }
                }
            } else if (i == R.id.acc_action_open_forwarded_origin && (chatMessageCellDelegate = this.delegate) != null) {
                TLRPC$Chat tLRPC$Chat = this.currentForwardChannel;
                if (tLRPC$Chat != null) {
                    chatMessageCellDelegate.didPressChannelAvatar(this, tLRPC$Chat, this.currentMessageObject.messageOwner.fwd_from.channel_post, this.lastTouchX, this.lastTouchY, false);
                } else {
                    TLRPC$User tLRPC$User = this.currentForwardUser;
                    if (tLRPC$User != null) {
                        chatMessageCellDelegate.didPressUserAvatar(this, tLRPC$User, this.lastTouchX, this.lastTouchY, false);
                    } else if (this.currentForwardName != null) {
                        chatMessageCellDelegate.didPressHiddenForward(this);
                    }
                }
            }
            if ((this.currentMessageObject.isVoice() || this.currentMessageObject.isRoundVideo() || (this.currentMessageObject.isMusic() && MediaController.getInstance().isPlayingMessage(this.currentMessageObject))) && this.seekBarAccessibilityDelegate.performAccessibilityActionInternal(i, bundle)) {
                return true;
            }
            return super.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    public void setAnimationRunning(boolean z, boolean z2) {
        this.animationRunning = z;
        if (z) {
            this.willRemoved = z2;
        } else {
            this.willRemoved = false;
        }
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            for (int i = 0; i < this.accessibilityVirtualViewBounds.size(); i++) {
                if (this.accessibilityVirtualViewBounds.valueAt(i).contains(x, y)) {
                    int keyAt = this.accessibilityVirtualViewBounds.keyAt(i);
                    if (keyAt != this.currentFocusedVirtualView) {
                        this.currentFocusedVirtualView = keyAt;
                        sendAccessibilityEventForVirtualView(keyAt, 32768);
                        return true;
                    }
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
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            obtain.setPackageName(getContext().getPackageName());
            obtain.setSource(this, i);
            if (str != null) {
                obtain.getText().add(str);
            }
            if (getParent() != null) {
                getParent().requestSendAccessibilityEvent(this, obtain);
            }
        }
    }

    public static Point getMessageSize(int i, int i2) {
        return getMessageSize(i, i2, 0, 0);
    }

    private static org.telegram.ui.Components.Point getMessageSize(int r3, int r4, int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.getMessageSize(int, int, int, int):org.telegram.ui.Components.Point");
    }

    public StaticLayout getDescriptionlayout() {
        return this.descriptionLayout;
    }

    public StaticLayout getFactCheckLayout() {
        return this.factCheckTextLayout;
    }

    public void setSelectedBackgroundProgress(float f) {
        this.selectedBackgroundProgress = f;
        invalidate();
    }

    public int computeHeight(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z) {
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
                    setMessageContent(messageObject2, groupedMessages, false, false);
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
        setMessageContent(messageObject, groupedMessages, false, false);
        this.photoImage.setIgnoreImageSet(false);
        this.avatarImage.setIgnoreImageSet(false);
        this.replyImageReceiver.setIgnoreImageSet(false);
        this.locationImageReceiver.setIgnoreImageSet(false);
        updateCaptionLayout();
        return this.totalHeight + this.keyboardHeight;
    }

    public int computeWidth(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages) {
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
                    setMessageContent(messageObject2, groupedMessages, false, false);
                    i += this.backgroundWidth;
                }
            }
            return i;
        }
        setMessageContent(messageObject, groupedMessages, false, false);
        this.photoImage.setIgnoreImageSet(false);
        this.avatarImage.setIgnoreImageSet(false);
        this.replyImageReceiver.setIgnoreImageSet(false);
        this.locationImageReceiver.setIgnoreImageSet(false);
        updateCaptionLayout();
        return this.backgroundWidth;
    }

    public void shakeView() {
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(View.ROTATION, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.2f, 3.0f), Keyframe.ofFloat(0.4f, -3.0f), Keyframe.ofFloat(0.6f, 3.0f), Keyframe.ofFloat(0.8f, -3.0f), Keyframe.ofFloat(1.0f, 0.0f));
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.5f, 0.97f);
        Keyframe ofFloat3 = Keyframe.ofFloat(1.0f, 1.0f);
        PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(View.SCALE_X, ofFloat, ofFloat2, ofFloat3);
        PropertyValuesHolder ofKeyframe3 = PropertyValuesHolder.ofKeyframe(View.SCALE_Y, ofFloat, ofFloat2, ofFloat3);
        AnimatorSet animatorSet = new AnimatorSet();
        this.shakeAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofPropertyValuesHolder(this, ofKeyframe), ObjectAnimator.ofPropertyValuesHolder(this, ofKeyframe2), ObjectAnimator.ofPropertyValuesHolder(this, ofKeyframe3));
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

    private void updateTranslation() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        setTranslationX(this.slidingOffsetX + this.animationOffsetX + ((!messageObject.isOutOwner() || this.currentMessageObject.hasWideCode) ? this.checkBoxTranslation : 0));
    }

    public float getNonAnimationTranslationX(boolean z) {
        boolean z2;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && !messageObject.isOutOwner()) {
            if (z && ((z2 = this.checkBoxVisible) || this.checkBoxAnimationInProgress)) {
                this.checkBoxTranslation = (int) Math.ceil((z2 ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(this.checkBoxAnimationProgress) * AndroidUtilities.dp(35.0f));
            }
            return this.slidingOffsetX + this.checkBoxTranslation;
        }
        return this.slidingOffsetX;
    }

    public float getSlidingOffsetX() {
        return this.slidingOffsetX;
    }

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

    public SeekBar getSeekBar() {
        return this.seekBar;
    }

    public SeekBarWaveform getSeekBarWaveform() {
        return this.seekBarWaveform;
    }

    public class MessageAccessibilityNodeProvider extends AccessibilityNodeProvider {
        private Path linkPath;
        private Rect rect;
        private RectF rectF;

        private MessageAccessibilityNodeProvider() {
            this.linkPath = new Path();
            this.rectF = new RectF();
            this.rect = new Rect();
        }

        private class ProfileSpan extends ClickableSpan {
            private TLRPC$User user;

            public ProfileSpan(TLRPC$User tLRPC$User) {
                this.user = tLRPC$User;
            }

            @Override
            public void onClick(View view) {
                if (ChatMessageCell.this.delegate != null) {
                    ChatMessageCell.this.delegate.didPressUserAvatar(ChatMessageCell.this, this.user, 0.0f, 0.0f, false);
                }
            }
        }

        @Override
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            boolean z;
            int i2;
            String str;
            String formatShortNumber;
            int i3;
            String str2;
            boolean z2;
            boolean z3;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i4;
            CharacterStyle[] characterStyleArr;
            TLRPC$ReactionCount tLRPC$ReactionCount;
            boolean z4;
            TLRPC$MessagePeerReaction tLRPC$MessagePeerReaction;
            int i5;
            String str3;
            String string;
            CharacterStyle[] characterStyleArr2;
            CharacterStyle[] characterStyleArr3;
            String string2;
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
            int[] iArr = {0, 0};
            ChatMessageCell.this.getLocationOnScreen(iArr);
            if (i == -1) {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ChatMessageCell.this);
                ChatMessageCell.this.onInitializeAccessibilityNodeInfo(obtain);
                boolean z5 = ChatMessageCell.this.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.isOut() && !ChatMessageCell.this.currentMessageObject.scheduled && ChatMessageCell.this.currentMessageObject.isUnread();
                boolean z6 = ChatMessageCell.this.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.isContentUnread();
                long j = ChatMessageCell.this.currentMessageObject != null ? ChatMessageCell.this.currentMessageObject.loadedFileSize : 0L;
                ChatMessageCell chatMessageCell = ChatMessageCell.this;
                if (chatMessageCell.accessibilityText == null || chatMessageCell.accessibilityTextUnread != z5 || ChatMessageCell.this.accessibilityTextContentUnread != z6 || ChatMessageCell.this.accessibilityTextFileSize != j) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
                    if (chatMessageCell2.isChat && chatMessageCell2.currentUser != null && !ChatMessageCell.this.currentMessageObject.isOut()) {
                        spannableStringBuilder.append((CharSequence) UserObject.getUserName(ChatMessageCell.this.currentUser));
                        spannableStringBuilder.setSpan(new ProfileSpan(ChatMessageCell.this.currentUser), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append('\n');
                    }
                    if (ChatMessageCell.this.drawForwardedName) {
                        int i6 = 0;
                        while (i6 < 2) {
                            if (ChatMessageCell.this.forwardedNameLayout[i6] != null && ChatMessageCell.this.forwardedNameLayout[i6].getText() != null) {
                                spannableStringBuilder.append(ChatMessageCell.this.forwardedNameLayout[i6].getText());
                                spannableStringBuilder.append(i6 == 0 ? " " : "\n");
                            }
                            i6++;
                        }
                    }
                    if (ChatMessageCell.this.documentAttach != null && ChatMessageCell.this.documentAttachType == 1) {
                        String attachFileName = FileLoader.getAttachFileName(ChatMessageCell.this.documentAttach);
                        if (attachFileName.indexOf(46) != -1) {
                            spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.AccDescrDocumentType, attachFileName.substring(attachFileName.lastIndexOf(46) + 1).toUpperCase(Locale.ROOT)));
                        }
                    }
                    if (!TextUtils.isEmpty(ChatMessageCell.this.currentMessageObject.messageText)) {
                        spannableStringBuilder.append(ChatMessageCell.this.currentMessageObject.messageText);
                    }
                    if (ChatMessageCell.this.documentAttach == null || !((ChatMessageCell.this.documentAttachType == 1 || ChatMessageCell.this.documentAttachType == 2 || ChatMessageCell.this.documentAttachType == 4) && ChatMessageCell.this.buttonState == 1 && ChatMessageCell.this.loadingProgressLayout != null)) {
                        charSequence = ", ";
                    } else {
                        spannableStringBuilder.append((CharSequence) "\n");
                        boolean isSending = ChatMessageCell.this.currentMessageObject.isSending();
                        charSequence = ", ";
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString(isSending ? "AccDescrUploadProgress" : "AccDescrDownloadProgress", isSending ? R.string.AccDescrUploadProgress : R.string.AccDescrDownloadProgress, AndroidUtilities.formatFileSize(ChatMessageCell.this.currentMessageObject.loadedFileSize), AndroidUtilities.formatFileSize(ChatMessageCell.this.lastLoadingSizeTotal)));
                    }
                    if (!ChatMessageCell.this.currentMessageObject.isMusic()) {
                        charSequence2 = charSequence;
                        if (ChatMessageCell.this.currentMessageObject.isVoice() || ChatMessageCell.this.isRoundVideo) {
                            spannableStringBuilder.append(charSequence2);
                            spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) ChatMessageCell.this.currentMessageObject.getDuration()));
                            spannableStringBuilder.append(charSequence2);
                            if (ChatMessageCell.this.currentMessageObject.isContentUnread()) {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgNotPlayed", R.string.AccDescrMsgNotPlayed));
                            } else {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgPlayed", R.string.AccDescrMsgPlayed));
                            }
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, ChatMessageCell.this.currentMessageObject.getMusicAuthor(), ChatMessageCell.this.currentMessageObject.getMusicTitle()));
                        charSequence2 = charSequence;
                        spannableStringBuilder.append(charSequence2);
                        spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) ChatMessageCell.this.currentMessageObject.getDuration()));
                    }
                    if (ChatMessageCell.this.lastPoll != null) {
                        spannableStringBuilder.append(charSequence2);
                        spannableStringBuilder.append((CharSequence) ChatMessageCell.this.lastPoll.question.text);
                        spannableStringBuilder.append(charSequence2);
                        if (!ChatMessageCell.this.pollClosed) {
                            if (ChatMessageCell.this.lastPoll.quiz) {
                                if (ChatMessageCell.this.lastPoll.public_voters) {
                                    string = LocaleController.getString("QuizPoll", R.string.QuizPoll);
                                } else {
                                    string = LocaleController.getString("AnonymousQuizPoll", R.string.AnonymousQuizPoll);
                                }
                            } else if (ChatMessageCell.this.lastPoll.public_voters) {
                                string = LocaleController.getString("PublicPoll", R.string.PublicPoll);
                            } else {
                                string = LocaleController.getString("AnonymousPoll", R.string.AnonymousPoll);
                            }
                        } else {
                            string = LocaleController.getString("FinalResults", R.string.FinalResults);
                        }
                        spannableStringBuilder.append((CharSequence) string);
                    }
                    if (ChatMessageCell.this.documentAttach != null) {
                        if (ChatMessageCell.this.documentAttachType == 4) {
                            spannableStringBuilder.append(charSequence2);
                            spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) ChatMessageCell.this.currentMessageObject.getDuration()));
                        }
                        if (ChatMessageCell.this.buttonState == 0 || ChatMessageCell.this.documentAttachType == 1) {
                            spannableStringBuilder.append(charSequence2);
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.formatFileSize(ChatMessageCell.this.documentAttach.size));
                        }
                    }
                    if (!ChatMessageCell.this.currentMessageObject.isVoiceTranscriptionOpen()) {
                        if (MessageObject.getMedia(ChatMessageCell.this.currentMessageObject.messageOwner) != null && !TextUtils.isEmpty(ChatMessageCell.this.currentMessageObject.caption)) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            spannableStringBuilder.append(ChatMessageCell.this.currentMessageObject.caption);
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append(ChatMessageCell.this.currentMessageObject.getVoiceTranscription());
                    }
                    if (ChatMessageCell.this.currentMessageObject.isOut()) {
                        if (!ChatMessageCell.this.currentMessageObject.isSent()) {
                            if (!ChatMessageCell.this.currentMessageObject.isSending()) {
                                if (ChatMessageCell.this.currentMessageObject.isSendError()) {
                                    spannableStringBuilder.append((CharSequence) "\n");
                                    spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSendingError", R.string.AccDescrMsgSendingError));
                                }
                            } else {
                                spannableStringBuilder.append((CharSequence) "\n");
                                spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSending", R.string.AccDescrMsgSending));
                                float progress = ChatMessageCell.this.radialProgress.getProgress();
                                if (progress > 0.0f) {
                                    spannableStringBuilder.append((CharSequence) Integer.toString(Math.round(progress * 100.0f))).append((CharSequence) "%");
                                }
                            }
                        } else {
                            spannableStringBuilder.append((CharSequence) "\n");
                            if (ChatMessageCell.this.currentMessageObject.scheduled) {
                                spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrScheduledDate", R.string.AccDescrScheduledDate, ChatMessageCell.this.currentTimeString));
                            } else {
                                spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, LocaleController.getString("TodayAt", R.string.TodayAt) + " " + ((Object) ChatMessageCell.this.currentTimeString)));
                                spannableStringBuilder.append(charSequence2);
                                if (ChatMessageCell.this.currentMessageObject.isUnread()) {
                                    i5 = R.string.AccDescrMsgUnread;
                                    str3 = "AccDescrMsgUnread";
                                } else {
                                    i5 = R.string.AccDescrMsgRead;
                                    str3 = "AccDescrMsgRead";
                                }
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(str3, i5));
                            }
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, LocaleController.getString("TodayAt", R.string.TodayAt) + " " + ((Object) ChatMessageCell.this.currentTimeString)));
                    }
                    if (ChatMessageCell.this.getRepliesCount() > 0 && !ChatMessageCell.this.hasCommentLayout()) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfReplies", ChatMessageCell.this.getRepliesCount(), new Object[0]));
                    }
                    if (ChatMessageCell.this.currentMessageObject.messageOwner.reactions != null && ChatMessageCell.this.currentMessageObject.messageOwner.reactions.results != null) {
                        String str4 = "";
                        if (ChatMessageCell.this.currentMessageObject.messageOwner.reactions.results.size() == 1) {
                            TLRPC$ReactionCount tLRPC$ReactionCount2 = ChatMessageCell.this.currentMessageObject.messageOwner.reactions.results.get(0);
                            TLRPC$Reaction tLRPC$Reaction = tLRPC$ReactionCount2.reaction;
                            String str5 = tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji ? ((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon : "";
                            int i7 = tLRPC$ReactionCount2.count;
                            if (i7 == 1) {
                                spannableStringBuilder.append((CharSequence) "\n");
                                if (ChatMessageCell.this.currentMessageObject.messageOwner.reactions.recent_reactions == null || ChatMessageCell.this.currentMessageObject.messageOwner.reactions.recent_reactions.size() != 1 || (tLRPC$MessagePeerReaction = ChatMessageCell.this.currentMessageObject.messageOwner.reactions.recent_reactions.get(0)) == null) {
                                    z4 = false;
                                } else {
                                    TLRPC$User user = MessagesController.getInstance(ChatMessageCell.this.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(tLRPC$MessagePeerReaction.peer_id)));
                                    z4 = UserObject.isUserSelf(user);
                                    if (user != null) {
                                        str4 = UserObject.getFirstName(user);
                                    }
                                }
                                if (z4) {
                                    spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrYouReactedWith", R.string.AccDescrYouReactedWith, str5));
                                } else {
                                    spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrReactedWith", R.string.AccDescrReactedWith, str4, str5));
                                }
                            } else if (i7 > 1) {
                                spannableStringBuilder.append((CharSequence) "\n");
                                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", tLRPC$ReactionCount2.count, str5));
                            }
                        } else {
                            spannableStringBuilder.append((CharSequence) LocaleController.getString("Reactions", R.string.Reactions)).append((CharSequence) ": ");
                            int size = ChatMessageCell.this.currentMessageObject.messageOwner.reactions.results.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                TLRPC$Reaction tLRPC$Reaction2 = ChatMessageCell.this.currentMessageObject.messageOwner.reactions.results.get(i8).reaction;
                                spannableStringBuilder.append((CharSequence) (tLRPC$Reaction2 instanceof TLRPC$TL_reactionEmoji ? ((TLRPC$TL_reactionEmoji) tLRPC$Reaction2).emoticon : "")).append((CharSequence) " ").append((CharSequence) (tLRPC$ReactionCount.count + ""));
                                if (i8 + 1 < size) {
                                    spannableStringBuilder.append(charSequence2);
                                }
                            }
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                    }
                    if ((ChatMessageCell.this.currentMessageObject.messageOwner.flags & 1024) != 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        i4 = 0;
                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfViews", ChatMessageCell.this.currentMessageObject.messageOwner.views, new Object[0]));
                    } else {
                        i4 = 0;
                    }
                    spannableStringBuilder.append((CharSequence) "\n");
                    for (final CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(i4, spannableStringBuilder.length(), ClickableSpan.class)) {
                        int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                        int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                        spannableStringBuilder.removeSpan(characterStyle);
                        spannableStringBuilder.setSpan(new ClickableSpan() {
                            @Override
                            public void onClick(View view) {
                                CharacterStyle characterStyle2 = characterStyle;
                                if (!(characterStyle2 instanceof ProfileSpan)) {
                                    if (ChatMessageCell.this.delegate != null) {
                                        ChatMessageCell.this.delegate.didPressUrl(ChatMessageCell.this, characterStyle, false);
                                        return;
                                    }
                                    return;
                                }
                                ((ProfileSpan) characterStyle2).onClick(view);
                            }
                        }, spanStart, spanEnd, 33);
                    }
                    ChatMessageCell chatMessageCell3 = ChatMessageCell.this;
                    chatMessageCell3.accessibilityText = spannableStringBuilder;
                    chatMessageCell3.accessibilityTextUnread = z5;
                    ChatMessageCell.this.accessibilityTextContentUnread = z6;
                    ChatMessageCell.this.accessibilityTextFileSize = j;
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 < 24) {
                    obtain.setContentDescription(ChatMessageCell.this.accessibilityText.toString());
                } else {
                    obtain.setText(ChatMessageCell.this.accessibilityText);
                }
                obtain.setEnabled(true);
                if (i9 >= 19 && (collectionItemInfo = obtain.getCollectionItemInfo()) != null) {
                    obtain.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), 1, 0, 1, false));
                }
                if (i9 >= 21) {
                    obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                    int iconForCurrentState = ChatMessageCell.this.getIconForCurrentState();
                    if (iconForCurrentState == 0) {
                        string2 = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
                    } else if (iconForCurrentState == 1) {
                        string2 = LocaleController.getString("AccActionPause", R.string.AccActionPause);
                    } else if (iconForCurrentState == 2) {
                        string2 = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
                    } else if (iconForCurrentState == 3) {
                        string2 = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
                    } else if (iconForCurrentState == 5) {
                        string2 = LocaleController.getString("AccActionOpenFile", R.string.AccActionOpenFile);
                    } else {
                        string2 = ChatMessageCell.this.currentMessageObject.type == 16 ? LocaleController.getString("CallAgain", R.string.CallAgain) : null;
                    }
                    obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
                    obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                    if (ChatMessageCell.this.getMiniIconForCurrentState() == 2) {
                        obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, LocaleController.getString("AccActionDownload", R.string.AccActionDownload)));
                    }
                } else {
                    obtain.addAction(16);
                    obtain.addAction(32);
                }
                if ((ChatMessageCell.this.currentMessageObject.isVoice() || ChatMessageCell.this.currentMessageObject.isRoundVideo() || ChatMessageCell.this.currentMessageObject.isMusic()) && MediaController.getInstance().isPlayingMessage(ChatMessageCell.this.currentMessageObject)) {
                    ChatMessageCell.this.seekBarAccessibilityDelegate.onInitializeAccessibilityNodeInfoInternal(obtain);
                }
                if (ChatMessageCell.this.useTranscribeButton) {
                    ChatMessageCell chatMessageCell4 = ChatMessageCell.this;
                    if (chatMessageCell4.transcribeButton != null) {
                        obtain.addChild(chatMessageCell4, 493);
                    }
                }
                if (i9 < 24) {
                    ChatMessageCell chatMessageCell5 = ChatMessageCell.this;
                    if (chatMessageCell5.isChat && chatMessageCell5.currentUser != null && !ChatMessageCell.this.currentMessageObject.isOut()) {
                        obtain.addChild(ChatMessageCell.this, 5000);
                    }
                    if (ChatMessageCell.this.currentMessageObject.messageText instanceof Spannable) {
                        Spannable spannable = (Spannable) ChatMessageCell.this.currentMessageObject.messageText;
                        int i10 = 0;
                        for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class)) {
                            obtain.addChild(ChatMessageCell.this, i10 + 2000);
                            i10++;
                        }
                    }
                    if (ChatMessageCell.this.currentMessageObject.caption instanceof Spannable) {
                        ChatMessageCell chatMessageCell6 = ChatMessageCell.this;
                        if (chatMessageCell6.captionLayout != null) {
                            Spannable spannable2 = (Spannable) chatMessageCell6.currentMessageObject.caption;
                            int i11 = 0;
                            for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class)) {
                                obtain.addChild(ChatMessageCell.this, i11 + 3000);
                                i11++;
                            }
                        }
                    }
                }
                Iterator it = ChatMessageCell.this.botButtons.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    BotButton botButton = (BotButton) it.next();
                    obtain.addChild(ChatMessageCell.this, i12 + 1000);
                    i12++;
                }
                if (ChatMessageCell.this.hintButtonVisible && ChatMessageCell.this.pollHintX != -1 && ChatMessageCell.this.currentMessageObject.isPoll()) {
                    obtain.addChild(ChatMessageCell.this, 495);
                }
                Iterator it2 = ChatMessageCell.this.pollButtons.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    PollButton pollButton = (PollButton) it2.next();
                    obtain.addChild(ChatMessageCell.this, i13 + 500);
                    i13++;
                }
                if (ChatMessageCell.this.drawInstantView && !ChatMessageCell.this.instantButtonRect.isEmpty()) {
                    obtain.addChild(ChatMessageCell.this, 499);
                }
                if (ChatMessageCell.this.drawContact && ChatMessageCell.this.contactRect != null && !ChatMessageCell.this.contactRect.isEmpty()) {
                    obtain.addChild(ChatMessageCell.this, 492);
                    if (ChatMessageCell.this.contactButtons != null && ChatMessageCell.this.contactButtons.size() > 1) {
                        Iterator it3 = ChatMessageCell.this.contactButtons.iterator();
                        while (it3.hasNext()) {
                            InstantViewButton instantViewButton = (InstantViewButton) it3.next();
                            if (ChatMessageCell.this.drawContactView && instantViewButton.type == 5 && !instantViewButton.rect.isEmpty()) {
                                obtain.addChild(ChatMessageCell.this, 491);
                            }
                            if (ChatMessageCell.this.drawContactAdd && instantViewButton.type == 31 && !instantViewButton.rect.isEmpty()) {
                                obtain.addChild(ChatMessageCell.this, 490);
                            }
                            if (ChatMessageCell.this.drawContactSendMessage && instantViewButton.type == 30 && !instantViewButton.rect.isEmpty()) {
                                obtain.addChild(ChatMessageCell.this, 489);
                            }
                        }
                    }
                }
                if (ChatMessageCell.this.commentLayout != null) {
                    obtain.addChild(ChatMessageCell.this, 496);
                }
                if (ChatMessageCell.this.drawSideButton == 1 || ChatMessageCell.this.drawSideButton == 2) {
                    obtain.addChild(ChatMessageCell.this, 498);
                }
                ChatMessageCell chatMessageCell7 = ChatMessageCell.this;
                if (chatMessageCell7.replyNameLayout != null) {
                    obtain.addChild(chatMessageCell7, 497);
                }
                if (ChatMessageCell.this.forwardedNameLayout[0] != null && ChatMessageCell.this.forwardedNameLayout[1] != null) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, LocaleController.getString("AccActionOpenForwardedOrigin", R.string.AccActionOpenForwardedOrigin)));
                    } else {
                        obtain.addChild(ChatMessageCell.this, 494);
                    }
                }
                if (ChatMessageCell.this.drawSelectionBackground || ChatMessageCell.this.getBackground() != null) {
                    obtain.setSelected(true);
                }
                return obtain;
            }
            AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
            obtain2.setSource(ChatMessageCell.this, i);
            obtain2.setParent(ChatMessageCell.this);
            obtain2.setPackageName(ChatMessageCell.this.getContext().getPackageName());
            if (i == 5000) {
                if (ChatMessageCell.this.currentUser == null) {
                    return null;
                }
                obtain2.setText(UserObject.getUserName(ChatMessageCell.this.currentUser));
                this.rect.set((int) ChatMessageCell.this.nameX, (int) ChatMessageCell.this.nameY, (int) (ChatMessageCell.this.nameX + ChatMessageCell.this.nameWidth), (int) (ChatMessageCell.this.nameY + (ChatMessageCell.this.nameLayout != null ? ChatMessageCell.this.nameLayout.getHeight() : 10)));
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClassName("android.widget.TextView");
                obtain2.setEnabled(true);
                obtain2.setClickable(true);
                obtain2.setLongClickable(true);
                obtain2.addAction(16);
                obtain2.addAction(32);
            } else if (i >= 3000) {
                if (!(ChatMessageCell.this.currentMessageObject.caption instanceof Spannable)) {
                    return null;
                }
                ChatMessageCell chatMessageCell8 = ChatMessageCell.this;
                if (chatMessageCell8.captionLayout == null) {
                    return null;
                }
                Spannable spannable3 = (Spannable) chatMessageCell8.currentMessageObject.caption;
                ClickableSpan linkById = getLinkById(i, false);
                if (linkById == null) {
                    return null;
                }
                int[] realSpanStartAndEnd = ChatMessageCell.this.getRealSpanStartAndEnd(spannable3, linkById);
                obtain2.setText(spannable3.subSequence(realSpanStartAndEnd[0], realSpanStartAndEnd[1]).toString());
                Iterator<MessageObject.TextLayoutBlock> it4 = ChatMessageCell.this.captionLayout.textLayoutBlocks.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z3 = true;
                        break;
                    }
                    MessageObject.TextLayoutBlock next = it4.next();
                    int length = next.textLayout.getText().length();
                    int i14 = next.charactersOffset;
                    if (i14 <= realSpanStartAndEnd[0] && length + i14 >= realSpanStartAndEnd[1]) {
                        next.textLayout.getSelectionPath(realSpanStartAndEnd[0] - i14, realSpanStartAndEnd[1] - i14, this.linkPath);
                        this.linkPath.computeBounds(this.rectF, true);
                        Rect rect = this.rect;
                        RectF rectF = this.rectF;
                        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        Rect rect2 = this.rect;
                        ChatMessageCell chatMessageCell9 = ChatMessageCell.this;
                        rect2.offset(0, (int) next.textYOffset(chatMessageCell9.captionLayout.textLayoutBlocks, chatMessageCell9.transitionParams));
                        Rect rect3 = this.rect;
                        ChatMessageCell chatMessageCell10 = ChatMessageCell.this;
                        rect3.offset(chatMessageCell10.textX, chatMessageCell10.textY);
                        obtain2.setBoundsInParent(this.rect);
                        if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null) {
                            ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                        }
                        z3 = true;
                        this.rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(this.rect);
                    }
                }
                obtain2.setClassName("android.widget.TextView");
                obtain2.setEnabled(z3);
                obtain2.setClickable(z3);
                obtain2.setLongClickable(z3);
                obtain2.addAction(16);
                obtain2.addAction(32);
            } else if (i >= 2000) {
                if (!(ChatMessageCell.this.currentMessageObject.messageText instanceof Spannable)) {
                    return null;
                }
                Spannable spannable4 = (Spannable) ChatMessageCell.this.currentMessageObject.messageText;
                ClickableSpan linkById2 = getLinkById(i, false);
                if (linkById2 == null) {
                    return null;
                }
                int[] realSpanStartAndEnd2 = ChatMessageCell.this.getRealSpanStartAndEnd(spannable4, linkById2);
                obtain2.setText(spannable4.subSequence(realSpanStartAndEnd2[0], realSpanStartAndEnd2[1]).toString());
                Iterator<MessageObject.TextLayoutBlock> it5 = ChatMessageCell.this.currentMessageObject.textLayoutBlocks.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z2 = true;
                        break;
                    }
                    MessageObject.TextLayoutBlock next2 = it5.next();
                    int length2 = next2.textLayout.getText().length();
                    int i15 = next2.charactersOffset;
                    if (i15 <= realSpanStartAndEnd2[0] && length2 + i15 >= realSpanStartAndEnd2[1]) {
                        next2.textLayout.getSelectionPath(realSpanStartAndEnd2[0] - i15, realSpanStartAndEnd2[1] - i15, this.linkPath);
                        this.linkPath.computeBounds(this.rectF, true);
                        Rect rect4 = this.rect;
                        RectF rectF2 = this.rectF;
                        rect4.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        this.rect.offset(0, (int) next2.textYOffset(ChatMessageCell.this.currentMessageObject.textLayoutBlocks, ChatMessageCell.this.transitionParams));
                        Rect rect5 = this.rect;
                        ChatMessageCell chatMessageCell11 = ChatMessageCell.this;
                        rect5.offset(chatMessageCell11.textX, chatMessageCell11.textY);
                        obtain2.setBoundsInParent(this.rect);
                        if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null) {
                            ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                        }
                        z2 = true;
                        this.rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(this.rect);
                    }
                }
                obtain2.setClassName("android.widget.TextView");
                obtain2.setEnabled(z2);
                obtain2.setClickable(z2);
                obtain2.setLongClickable(z2);
                obtain2.addAction(16);
                obtain2.addAction(32);
            } else if (i >= 1000) {
                int i16 = i - 1000;
                if (i16 >= ChatMessageCell.this.botButtons.size()) {
                    return null;
                }
                BotButton botButton2 = (BotButton) ChatMessageCell.this.botButtons.get(i16);
                obtain2.setText(botButton2.title.getText());
                obtain2.setClassName("android.widget.Button");
                obtain2.setEnabled(true);
                obtain2.setClickable(true);
                obtain2.addAction(16);
                this.rect.set(botButton2.x, botButton2.y, botButton2.x + botButton2.width, botButton2.y + botButton2.height);
                this.rect.offset(ChatMessageCell.this.currentMessageObject.isOutOwner() ? (ChatMessageCell.this.getMeasuredWidth() - ChatMessageCell.this.widthForButtons) - AndroidUtilities.dp(10.0f) : ChatMessageCell.this.backgroundDrawableLeft + AndroidUtilities.dp(ChatMessageCell.this.mediaBackground ? 1.0f : 7.0f), ChatMessageCell.this.layoutHeight);
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
            } else if (i >= 500) {
                int i17 = i - 500;
                if (i17 >= ChatMessageCell.this.pollButtons.size()) {
                    return null;
                }
                PollButton pollButton2 = (PollButton) ChatMessageCell.this.pollButtons.get(i17);
                StringBuilder sb = new StringBuilder(pollButton2.title.getText());
                if (ChatMessageCell.this.pollVoted) {
                    obtain2.setSelected(pollButton2.chosen);
                    sb.append(", ");
                    sb.append(pollButton2.percent);
                    sb.append("%");
                    if (ChatMessageCell.this.lastPoll != null && ChatMessageCell.this.lastPoll.quiz && (pollButton2.chosen || pollButton2.correct)) {
                        sb.append(", ");
                        if (pollButton2.correct) {
                            i3 = R.string.AccDescrQuizCorrectAnswer;
                            str2 = "AccDescrQuizCorrectAnswer";
                        } else {
                            i3 = R.string.AccDescrQuizIncorrectAnswer;
                            str2 = "AccDescrQuizIncorrectAnswer";
                        }
                        sb.append(LocaleController.getString(str2, i3));
                    }
                } else {
                    obtain2.setClassName("android.widget.Button");
                }
                obtain2.setText(sb);
                obtain2.setEnabled(true);
                obtain2.addAction(16);
                int i18 = pollButton2.y;
                ChatMessageCell chatMessageCell12 = ChatMessageCell.this;
                int i19 = i18 + chatMessageCell12.namesOffset;
                int dp = chatMessageCell12.backgroundWidth - AndroidUtilities.dp(76.0f);
                Rect rect6 = this.rect;
                int i20 = pollButton2.x;
                rect6.set(i20, i19, dp + i20, pollButton2.height + i19);
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClickable(true);
            } else if (i == 495) {
                obtain2.setClassName("android.widget.Button");
                obtain2.setEnabled(true);
                obtain2.setText(LocaleController.getString("AccDescrQuizExplanation", R.string.AccDescrQuizExplanation));
                obtain2.addAction(16);
                this.rect.set(ChatMessageCell.this.pollHintX - AndroidUtilities.dp(8.0f), ChatMessageCell.this.pollHintY - AndroidUtilities.dp(8.0f), ChatMessageCell.this.pollHintX + AndroidUtilities.dp(32.0f), ChatMessageCell.this.pollHintY + AndroidUtilities.dp(32.0f));
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null || !((Rect) ChatMessageCell.this.accessibilityVirtualViewBounds.get(i)).equals(this.rect)) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClickable(true);
            } else if (i == 499) {
                obtain2.setClassName("android.widget.Button");
                obtain2.setEnabled(true);
                if (ChatMessageCell.this.instantViewLayout != null) {
                    obtain2.setText(ChatMessageCell.this.instantViewLayout.getText());
                }
                obtain2.addAction(16);
                ChatMessageCell.this.instantButtonRect.round(this.rect);
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null || !((Rect) ChatMessageCell.this.accessibilityVirtualViewBounds.get(i)).equals(this.rect)) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClickable(true);
            } else if (i == 492) {
                obtain2.setClassName("android.widget.Button");
                obtain2.setEnabled(true);
                if (ChatMessageCell.this.titleLayout != null) {
                    obtain2.setText(ChatMessageCell.this.titleLayout.getText());
                }
                obtain2.addAction(16);
                ChatMessageCell.this.contactRect.round(this.rect);
                if (ChatMessageCell.this.contactButtons != null && ChatMessageCell.this.contactButtons.size() > 1) {
                    InstantViewButton instantViewButton2 = (InstantViewButton) ChatMessageCell.this.contactButtons.get(0);
                    if (!instantViewButton2.rect.isEmpty()) {
                        Rect rect7 = this.rect;
                        rect7.set(rect7.left, rect7.top, rect7.right, (int) (rect7.bottom - instantViewButton2.rect.height()));
                    }
                }
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null || !((Rect) ChatMessageCell.this.accessibilityVirtualViewBounds.get(i)).equals(this.rect)) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClickable(true);
            } else if (i == 491 || i == 490 || i == 489) {
                int i21 = i != 491 ? i == 490 ? 31 : 30 : 5;
                for (int i22 = 0; i22 < ChatMessageCell.this.contactButtons.size(); i22++) {
                    InstantViewButton instantViewButton3 = (InstantViewButton) ChatMessageCell.this.contactButtons.get(i22);
                    if (instantViewButton3.type == i21) {
                        obtain2.setClassName("android.widget.Button");
                        obtain2.setEnabled(true);
                        if (instantViewButton3.layout != null) {
                            obtain2.setText(instantViewButton3.layout.getText());
                        }
                        obtain2.addAction(16);
                        instantViewButton3.rect.round(this.rect);
                        obtain2.setBoundsInParent(this.rect);
                        if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null || !((Rect) ChatMessageCell.this.accessibilityVirtualViewBounds.get(i)).equals(this.rect)) {
                            ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                        }
                        z = true;
                        this.rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(this.rect);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(z);
                        obtain2.setVisibleToUser(z);
                        return obtain2;
                    }
                }
            } else if (i == 498) {
                obtain2.setClassName("android.widget.ImageButton");
                obtain2.setEnabled(true);
                ChatMessageCell chatMessageCell13 = ChatMessageCell.this;
                if (chatMessageCell13.isOpenChatByShare(chatMessageCell13.currentMessageObject)) {
                    obtain2.setContentDescription(LocaleController.getString("AccDescrOpenChat", R.string.AccDescrOpenChat));
                } else {
                    obtain2.setContentDescription(LocaleController.getString("ShareFile", R.string.ShareFile));
                }
                obtain2.addAction(16);
                this.rect.set((int) ChatMessageCell.this.sideStartX, (int) ChatMessageCell.this.sideStartY, ((int) ChatMessageCell.this.sideStartX) + AndroidUtilities.dp(40.0f), ((int) ChatMessageCell.this.sideStartY) + AndroidUtilities.dp(32.0f));
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null || !((Rect) ChatMessageCell.this.accessibilityVirtualViewBounds.get(i)).equals(this.rect)) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClickable(true);
            } else if (i == 497) {
                obtain2.setEnabled(true);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString("Reply", R.string.Reply));
                sb2.append(", ");
                StaticLayout staticLayout = ChatMessageCell.this.replyNameLayout;
                if (staticLayout != null) {
                    sb2.append(staticLayout.getText());
                    sb2.append(", ");
                }
                StaticLayout staticLayout2 = ChatMessageCell.this.replyTextLayout;
                if (staticLayout2 != null) {
                    sb2.append(staticLayout2.getText());
                }
                obtain2.setContentDescription(sb2.toString());
                obtain2.addAction(16);
                Rect rect8 = this.rect;
                ChatMessageCell chatMessageCell14 = ChatMessageCell.this;
                int i23 = chatMessageCell14.replyStartX;
                ChatMessageCell chatMessageCell15 = ChatMessageCell.this;
                rect8.set(i23, chatMessageCell14.replyStartY, Math.max(chatMessageCell14.replyNameWidth, ChatMessageCell.this.replyTextWidth) + i23, chatMessageCell15.replyStartY + ((int) chatMessageCell15.replyHeight));
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null || !((Rect) ChatMessageCell.this.accessibilityVirtualViewBounds.get(i)).equals(this.rect)) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClickable(true);
            } else if (i == 494) {
                obtain2.setEnabled(true);
                StringBuilder sb3 = new StringBuilder();
                if (ChatMessageCell.this.forwardedNameLayout[0] != null && ChatMessageCell.this.forwardedNameLayout[1] != null) {
                    int i24 = 0;
                    while (i24 < 2) {
                        sb3.append(ChatMessageCell.this.forwardedNameLayout[i24].getText());
                        sb3.append(i24 == 0 ? " " : "\n");
                        i24++;
                    }
                }
                obtain2.setContentDescription(sb3.toString());
                obtain2.addAction(16);
                int min = (int) Math.min(ChatMessageCell.this.forwardNameX - ChatMessageCell.this.forwardNameOffsetX[0], ChatMessageCell.this.forwardNameX - ChatMessageCell.this.forwardNameOffsetX[1]);
                this.rect.set(min, ChatMessageCell.this.forwardNameY, ChatMessageCell.this.forwardedNameWidth + min, ChatMessageCell.this.forwardNameY + ChatMessageCell.this.forwardHeight);
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null || !((Rect) ChatMessageCell.this.accessibilityVirtualViewBounds.get(i)).equals(this.rect)) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClickable(true);
            } else if (i == 496) {
                obtain2.setClassName("android.widget.Button");
                obtain2.setEnabled(true);
                int repliesCount = ChatMessageCell.this.getRepliesCount();
                if (ChatMessageCell.this.currentMessageObject != null && !ChatMessageCell.this.currentMessageObject.shouldDrawWithoutBackground() && !ChatMessageCell.this.currentMessageObject.isAnimatedEmoji()) {
                    if (ChatMessageCell.this.isRepliesChat) {
                        formatShortNumber = LocaleController.getString("ViewInChat", R.string.ViewInChat);
                    } else {
                        formatShortNumber = repliesCount == 0 ? LocaleController.getString("LeaveAComment", R.string.LeaveAComment) : LocaleController.formatPluralString("CommentsCount", repliesCount, new Object[0]);
                    }
                } else {
                    formatShortNumber = (ChatMessageCell.this.isRepliesChat || repliesCount <= 0) ? null : LocaleController.formatShortNumber(repliesCount, null);
                }
                if (formatShortNumber != null) {
                    obtain2.setText(formatShortNumber);
                }
                obtain2.addAction(16);
                this.rect.set(ChatMessageCell.this.commentButtonRect);
                obtain2.setBoundsInParent(this.rect);
                if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null || !((Rect) ChatMessageCell.this.accessibilityVirtualViewBounds.get(i)).equals(this.rect)) {
                    ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                }
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClickable(true);
            } else if (i == 493) {
                obtain2.setClassName("android.widget.Button");
                obtain2.setEnabled(true);
                if (ChatMessageCell.this.currentMessageObject.isVoiceTranscriptionOpen()) {
                    i2 = R.string.AccActionCloseTranscription;
                    str = "AccActionCloseTranscription";
                } else {
                    i2 = R.string.AccActionOpenTranscription;
                    str = "AccActionOpenTranscription";
                }
                obtain2.setText(LocaleController.getString(str, i2));
                obtain2.addAction(16);
                ChatMessageCell chatMessageCell16 = ChatMessageCell.this;
                if (chatMessageCell16.transcribeButton != null) {
                    this.rect.set((int) chatMessageCell16.transcribeX, (int) ChatMessageCell.this.transcribeY, (int) (ChatMessageCell.this.transcribeX + ChatMessageCell.this.transcribeButton.width()), (int) (ChatMessageCell.this.transcribeY + ChatMessageCell.this.transcribeButton.height()));
                }
                obtain2.setBoundsInParent(this.rect);
                this.rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(this.rect);
                obtain2.setClickable(true);
            }
            z = true;
            obtain2.setFocusable(z);
            obtain2.setVisibleToUser(z);
            return obtain2;
        }

        @Override
        public boolean performAction(int r9, int r10, android.os.Bundle r11) {
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
        Theme.MessageDrawable messageDrawable = this.currentBackgroundDrawable;
        if (messageDrawable == null) {
            return 0;
        }
        int i = messageDrawable.getBounds().left;
        if (this.currentMessageObject.isOutOwner() || this.transitionParams.changePinnedBottomProgress == 1.0f) {
            return i;
        }
        boolean z = this.isRoundVideo;
        if ((z || !this.mediaBackground) && !this.drawPinnedBottom) {
            if (z) {
                return (int) (i - (AndroidUtilities.dp(6.0f) * getVideoTranscriptionProgress()));
            }
            return i - AndroidUtilities.dp(6.0f);
        }
        return i;
    }

    public int getCurrentBackgroundRight() {
        Theme.MessageDrawable messageDrawable = this.currentBackgroundDrawable;
        if (messageDrawable == null) {
            return getWidth();
        }
        int i = messageDrawable.getBounds().right;
        if (!this.currentMessageObject.isOutOwner() || this.transitionParams.changePinnedBottomProgress == 1.0f) {
            return i;
        }
        boolean z = this.isRoundVideo;
        if ((z || !this.mediaBackground) && !this.drawPinnedBottom) {
            if (z) {
                return (int) (i + (AndroidUtilities.dp(6.0f) * getVideoTranscriptionProgress()));
            }
            return i + AndroidUtilities.dp(6.0f);
        }
        return i;
    }

    public TransitionParams getTransitionParams() {
        return this.transitionParams;
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
        boolean animateBotButtonsChanged;
        private boolean animateButton;
        public boolean animateChange;
        private int animateCommentArrowX;
        private boolean animateCommentDrawUnread;
        private int animateCommentUnreadX;
        private float animateCommentX;
        private boolean animateComments;
        private StaticLayout animateCommentsLayout;
        public boolean animateDrawBackground;
        private boolean animateDrawCommentNumber;
        public boolean animateDrawNameLayout;
        public boolean animateDrawingTimeAlpha;
        private boolean animateEditedEnter;
        private StaticLayout animateEditedLayout;
        private int animateEditedWidthDiff;
        public boolean animateExpandedQuotes;
        public HashSet<Integer> animateExpandedQuotesFrom;
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
        private float animateFromReplyTextHeight;
        public float animateFromReplyY;
        public float animateFromRoundVideoDotY;
        public float animateFromTextY;
        public int animateFromTimeX;
        public float animateFromTimeXPinned;
        private float animateFromTimeXReplies;
        private float animateFromTimeXViews;
        public boolean animateLinkAbove;
        public boolean animateLinkPreviewHeight;
        public boolean animateLinkPreviewY;
        public boolean animateLocationIsExpired;
        public boolean animateMediaAbove;
        private boolean animateMediaOffsetY;
        public boolean animateMessageText;
        private float animateNameX;
        private AnimatedEmojiSpan.EmojiGroupedSpans animateOutAnimateEmoji;
        private AnimatedEmojiSpan.EmojiGroupedSpans animateOutAnimateEmojiReply;
        private MessageObject.TextLayoutBlocks animateOutCaptionLayout;
        private ArrayList<MessageObject.TextLayoutBlock> animateOutTextBlocks;
        private float animateOutTextXOffset;
        private boolean animatePinned;
        public boolean animatePlayingRound;
        public boolean animateRadius;
        public boolean animateRecommendationsExpanded;
        boolean animateReplaceCaptionLayout;
        private boolean animateReplies;
        private StaticLayout animateRepliesLayout;
        private StaticLayout animateReplyTextLayout;
        public float animateReplyTextOffset;
        public boolean animateRoundVideoDotY;
        private boolean animateShouldDrawMenuDrawable;
        private boolean animateShouldDrawTimeOnMedia;
        private boolean animateSign;
        public boolean animateSmallImage;
        public boolean animateText;
        private StaticLayout animateTimeLayout;
        private int animateTimeWidth;
        public float animateToImageH;
        public float animateToImageW;
        public float animateToImageX;
        public float animateToImageY;
        public int[] animateToRadius;
        private int animateTotalCommentWidth;
        public boolean animateUseTranscribeButton;
        private StaticLayout animateViewsLayout;
        public float captionFromX;
        public float captionFromY;
        public float deltaBottom;
        public float deltaLeft;
        public float deltaRight;
        public float deltaTop;
        public boolean drawPinnedBottomBackground;
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
        public MessageObject.TextLayoutBlocks lastDrawingCaptionLayout;
        public float lastDrawingCaptionX;
        public float lastDrawingCaptionY;
        public boolean lastDrawingEdited;
        public HashSet<Integer> lastDrawingExpandedQuotes;
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
        public boolean lastDrawingRecommendationsExpanded;
        public float lastDrawingReplyTextHeight;
        public boolean lastDrawingSmallImage;
        public ArrayList<MessageObject.TextLayoutBlock> lastDrawingTextBlocks;
        public float lastDrawingTextY;
        public boolean lastDrawnForwardedName;
        public StaticLayout lastDrawnReplyTextLayout;
        public int lastForwardNameWidth;
        public float lastForwardNameX;
        public int lastForwardedNamesOffset;
        public boolean lastIsPinned;
        public boolean lastIsPlayingRound;
        public boolean lastLocatinIsExpired;
        public int lastMediaOffsetY;
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
        private ArrayList<BotButton> lastDrawBotButtons = new ArrayList<>();
        private ArrayList<BotButton> transitionBotButtons = new ArrayList<>();
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
            boolean z = true;
            this.wasDraw = true;
            this.lastDrawingImageX = ChatMessageCell.this.photoImage.getImageX();
            this.lastDrawingImageY = ChatMessageCell.this.photoImage.getImageY();
            this.lastDrawingImageW = ChatMessageCell.this.photoImage.getImageWidth();
            this.lastDrawingImageH = ChatMessageCell.this.photoImage.getImageHeight();
            System.arraycopy(ChatMessageCell.this.photoImage.getRoundRadius(), 0, this.imageRoundRadius, 0, 4);
            Theme.MessageDrawable messageDrawable = ChatMessageCell.this.currentBackgroundDrawable;
            if (messageDrawable != null) {
                this.lastDrawingBackgroundRect.set(messageDrawable.getBounds());
            }
            this.lastDrawingTextBlocks = ChatMessageCell.this.currentMessageObject != null ? ChatMessageCell.this.currentMessageObject.textLayoutBlocks : null;
            this.lastDrawingEdited = ChatMessageCell.this.edited;
            this.lastDrawingCaptionX = ChatMessageCell.this.captionX;
            ChatMessageCell chatMessageCell = ChatMessageCell.this;
            this.lastDrawingCaptionY = chatMessageCell.captionY;
            this.lastDrawingCaptionLayout = chatMessageCell.captionLayout;
            this.lastDrawBotButtons.clear();
            if (!ChatMessageCell.this.botButtons.isEmpty()) {
                this.lastDrawBotButtons.addAll(ChatMessageCell.this.botButtons);
            }
            this.lastDrawingSmallImage = ChatMessageCell.this.isSmallImage;
            ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
            this.lastDrawingLinkPreviewHeight = chatMessageCell2.linkPreviewHeight;
            this.lastDrawingLinkAbove = chatMessageCell2.linkPreviewAbove;
            this.lastDrawingMediaAbove = chatMessageCell2.captionAbove;
            this.lastDrawingRecommendationsExpanded = chatMessageCell2.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.type == 27 && (channelRecommendationsCell = ChatMessageCell.this.channelRecommendationsCell) != null && channelRecommendationsCell.isExpanded();
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
            ChatMessageCell chatMessageCell3 = ChatMessageCell.this;
            this.lastIsPinned = chatMessageCell3.isPinned;
            this.lastSignMessage = chatMessageCell3.lastPostAuthor;
            this.lastDrawBackground = ChatMessageCell.this.drawBackground;
            this.lastUseTranscribeButton = ChatMessageCell.this.useTranscribeButton;
            this.lastButtonX = ChatMessageCell.this.buttonX;
            this.lastButtonY = ChatMessageCell.this.buttonY;
            this.lastMediaOffsetY = ChatMessageCell.this.mediaOffsetY;
            this.lastDrawTime = !ChatMessageCell.this.forceNotDrawTime;
            ChatMessageCell chatMessageCell4 = ChatMessageCell.this;
            this.lastTimeX = chatMessageCell4.timeX;
            this.lastTimeLayout = chatMessageCell4.timeLayout;
            this.lastTimeWidth = chatMessageCell4.timeWidth;
            this.lastShouldDrawTimeOnMedia = chatMessageCell4.shouldDrawTimeOnMedia();
            this.lastTopOffset = ChatMessageCell.this.getTopMediaOffset();
            this.lastShouldDrawMenuDrawable = ChatMessageCell.this.shouldDrawMenuDrawable();
            this.lastLocatinIsExpired = ChatMessageCell.this.locationExpired;
            this.lastIsPlayingRound = ChatMessageCell.this.isPlayingRound;
            ChatMessageCell chatMessageCell5 = ChatMessageCell.this;
            this.lastDrawingTextY = chatMessageCell5.textY;
            int i = chatMessageCell5.textX;
            this.lastDrawingLinkPreviewY = chatMessageCell5.linkPreviewY;
            this.lastDrawnForwardedNameLayout[0] = ChatMessageCell.this.forwardedNameLayout[0];
            this.lastDrawnForwardedNameLayout[1] = ChatMessageCell.this.forwardedNameLayout[1];
            this.lastDrawnForwardedName = ChatMessageCell.this.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.needDrawForwarded();
            this.lastForwardNameX = ChatMessageCell.this.forwardNameX;
            ChatMessageCell chatMessageCell6 = ChatMessageCell.this;
            this.lastForwardedNamesOffset = chatMessageCell6.namesOffset;
            this.lastForwardNameWidth = chatMessageCell6.forwardedNameWidth;
            this.lastBackgroundLeft = ChatMessageCell.this.getCurrentBackgroundLeft();
            Theme.MessageDrawable messageDrawable2 = ChatMessageCell.this.currentBackgroundDrawable;
            if (messageDrawable2 != null) {
                this.lastBackgroundRight = messageDrawable2.getBounds().right;
            }
            this.lastTextXOffset = ChatMessageCell.this.currentMessageObject != null ? ChatMessageCell.this.currentMessageObject.textXOffset : 0.0f;
            this.lastDrawingReplyTextHeight = ChatMessageCell.this.replyTextHeight;
            ChatMessageCell chatMessageCell7 = ChatMessageCell.this;
            this.lastDrawnReplyTextLayout = chatMessageCell7.replyTextLayout;
            this.lastReplyTextXOffset = chatMessageCell7.replyTextOffset;
            chatMessageCell7.reactionsLayoutInBubble.recordDrawingState();
            ChatMessageCell chatMessageCell8 = ChatMessageCell.this;
            if (chatMessageCell8.replyNameLayout != null) {
                this.lastDrawReplyY = chatMessageCell8.replyStartY;
            } else {
                this.lastDrawReplyY = 0.0f;
            }
            this.lastDrawNameLayout = chatMessageCell8.drawNameLayout;
            this.lastDrawingFactCheckHeight = ChatMessageCell.this.factCheckHeight;
            this.lastDrawingFactCheckExpanded = (ChatMessageCell.this.getPrimaryMessageObject() == null || !ChatMessageCell.this.getPrimaryMessageObject().factCheckExpanded) ? false : false;
            this.lastDrawingFactCheck = ChatMessageCell.this.hasFactCheck;
            this.lastDrawingExpandedQuotes = ChatMessageCell.this.getPrimaryMessageObject() != null ? ChatMessageCell.this.getPrimaryMessageObject().expandedQuotes : null;
        }

        public void recordDrawingStatePreview() {
            this.lastDrawnForwardedNameLayout[0] = ChatMessageCell.this.forwardedNameLayout[0];
            this.lastDrawnForwardedNameLayout[1] = ChatMessageCell.this.forwardedNameLayout[1];
            this.lastDrawnForwardedName = ChatMessageCell.this.currentMessageObject.needDrawForwarded();
            this.lastForwardNameX = ChatMessageCell.this.forwardNameX;
            ChatMessageCell chatMessageCell = ChatMessageCell.this;
            this.lastForwardedNamesOffset = chatMessageCell.namesOffset;
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
            this.animateDrawNameLayout = false;
            this.animateOutTextBlocks = null;
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
            this.animateLinkAbove = false;
            this.animateMediaAbove = false;
            this.animateRecommendationsExpanded = false;
            this.animateDrawingTimeAlpha = false;
            this.animateLocationIsExpired = false;
            this.animatePlayingRound = false;
            this.animateText = false;
            this.animateLinkPreviewY = false;
            this.animateFactCheckHeight = false;
            this.animateFactCheckExpanded = false;
            this.animateExpandedQuotes = false;
            this.animateFactCheck = false;
            this.animateForwardedLayout = false;
            StaticLayout[] staticLayoutArr = this.animatingForwardedNameLayout;
            staticLayoutArr[0] = null;
            staticLayoutArr[1] = null;
            this.animateRoundVideoDotY = false;
            ChatMessageCell.this.reactionsLayoutInBubble.resetAnimation();
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
        float f = this.nameX + this.nameOffsetX;
        int i = this.viaNameWidth;
        return (int) (f + (i > 0 ? i - AndroidUtilities.dp(32.0f) : this.nameLayoutWidth) + AndroidUtilities.dp(2.0f) + (AndroidUtilities.dp(20.0f) / 2));
    }

    public int getNameStatusY() {
        float f = this.nameY;
        StaticLayout staticLayout = this.nameLayout;
        return (int) (f + ((staticLayout == null ? 0 : staticLayout.getHeight()) / 2));
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
        return (this.isChat && !this.isSavedPreviewChat && ((!this.isThreadPost || this.isForum) && (messageObject2 = this.currentMessageObject) != null && !messageObject2.isOutOwner() && this.currentMessageObject.needDrawAvatar())) || ((messageObject = this.currentMessageObject) != null && messageObject.forceAvatar);
    }

    public boolean drawPhotoImage(Canvas canvas) {
        return this.photoImage.draw(canvas);
    }

    public boolean areTags() {
        TLRPC$Message tLRPC$Message;
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions;
        MessageObject primaryMessageObject = getPrimaryMessageObject();
        if (primaryMessageObject == null || (tLRPC$Message = primaryMessageObject.messageOwner) == null || (tLRPC$TL_messageReactions = tLRPC$Message.reactions) == null) {
            return false;
        }
        return tLRPC$TL_messageReactions.reactions_as_tags;
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
            TLRPC$PhotoSize tLRPC$PhotoSize = this.currentPhotoObject;
            if (tLRPC$PhotoSize == null) {
                return null;
            }
            return FileLoader.getAttachFileName(tLRPC$PhotoSize);
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
        } else if (i2 != 0) {
            return FileLoader.getAttachFileName(this.documentAttach);
        } else {
            TLRPC$PhotoSize tLRPC$PhotoSize2 = this.currentPhotoObject;
            if (tLRPC$PhotoSize2 != null) {
                return FileLoader.getAttachFileName(tLRPC$PhotoSize2);
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

    public TLRPC$TL_availableEffect getEffect() {
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
}
