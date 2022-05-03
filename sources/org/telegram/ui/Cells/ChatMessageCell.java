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
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
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
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Toast;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
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
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoPlayerRewinder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatInvite;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageReplies;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Poll;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonBuy;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonCallback;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonGame;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonRequestGeoLocation;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonSwitchInline;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonUrl;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonUrlAuth;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonWebView;
import org.telegram.tgnet.TLRPC$TL_messageReactions;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.tgnet.TLRPC$TL_pollAnswer;
import org.telegram.tgnet.TLRPC$TL_pollAnswerVoters;
import org.telegram.tgnet.TLRPC$TL_reactionCount;
import org.telegram.tgnet.TLRPC$TL_user;
import org.telegram.tgnet.TLRPC$TL_webPage;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedNumberLayout;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.InfiniteProgress;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.MessageBackgroundDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.MsgClockDrawable;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.RoundVideoPlayingDrawable;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.SeekBarAccessibilityDelegate;
import org.telegram.ui.Components.SeekBarWaveform;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TimerParticles;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanBrowser;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.VideoForwardDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;

public class ChatMessageCell extends BaseCell implements SeekBar.SeekBarDelegate, ImageReceiver.ImageReceiverDelegate, DownloadController.FileDownloadProgressListener, TextSelectionHelper.SelectableView, NotificationCenter.NotificationCenterDelegate {
    private static float[] radii = new float[8];
    private final boolean ALPHA_PROPERTY_WORKAROUND;
    public Property<ChatMessageCell, Float> ANIMATION_OFFSET_X;
    private int TAG;
    CharSequence accessibilityText;
    private SparseArray<Rect> accessibilityVirtualViewBounds;
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
    private int authorX;
    private boolean autoPlayingMedia;
    private int availableTimeWidth;
    private AvatarDrawable avatarDrawable;
    private ImageReceiver avatarImage;
    private boolean avatarPressed;
    private Theme.MessageDrawable.PathDrawParams backgroundCacheParams;
    private MessageBackgroundDrawable backgroundDrawable;
    private int backgroundDrawableLeft;
    private int backgroundDrawableRight;
    private int backgroundDrawableTop;
    private int backgroundHeight;
    private int backgroundWidth;
    private int blurredViewBottomOffset;
    private int blurredViewTopOffset;
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
    private int captionHeight;
    private StaticLayout captionLayout;
    private int captionOffsetX;
    private AtomicReference<Layout> captionPatchedSpoilersLayout;
    private List<SpoilerEffect> captionSpoilers;
    private Stack<SpoilerEffect> captionSpoilersPool;
    private int captionWidth;
    private float captionX;
    private float captionY;
    private CheckBoxBase checkBox;
    private boolean checkBoxAnimationInProgress;
    private float checkBoxAnimationProgress;
    private int checkBoxTranslation;
    private boolean checkBoxVisible;
    private boolean checkOnlyButtonPressed;
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
    private AnimatedNumberLayout commentNumberLayout;
    private int commentNumberWidth;
    private InfiniteProgress commentProgress;
    private float commentProgressAlpha;
    private long commentProgressLastUpadteTime;
    private int commentUnreadX;
    private int commentWidth;
    private int commentX;
    private AvatarDrawable contactAvatarDrawable;
    private float controlsAlpha;
    private int currentAccount;
    private Theme.MessageDrawable currentBackgroundDrawable;
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
    private String currentNameString;
    private TLRPC$FileLocation currentPhoto;
    private String currentPhotoFilter;
    private String currentPhotoFilterThumb;
    private TLRPC$PhotoSize currentPhotoObject;
    private TLRPC$PhotoSize currentPhotoObjectThumb;
    private BitmapDrawable currentPhotoObjectThumbStripped;
    private MessageObject.GroupedMessagePosition currentPosition;
    private String currentRepliesString;
    private TLRPC$PhotoSize currentReplyPhoto;
    private float currentSelectedBackgroundAlpha;
    private String currentTimeString;
    private String currentUrl;
    private TLRPC$User currentUser;
    private TLRPC$User currentViaBotUser;
    private String currentViewsString;
    private WebFile currentWebFile;
    private ChatMessageCellDelegate delegate;
    private RectF deleteProgressRect;
    private StaticLayout descriptionLayout;
    private int descriptionX;
    private int descriptionY;
    private Runnable diceFinishCallback;
    private boolean disallowLongPress;
    private StaticLayout docTitleLayout;
    private int docTitleOffsetX;
    private int docTitleWidth;
    private TLRPC$Document documentAttach;
    private int documentAttachType;
    private boolean drawBackground;
    private boolean drawCommentButton;
    private boolean drawCommentNumber;
    private boolean drawForwardedName;
    public boolean drawFromPinchToZoom;
    private boolean drawImageButton;
    private boolean drawInstantView;
    private int drawInstantViewType;
    private boolean drawMediaCheckBox;
    private boolean drawName;
    private boolean drawNameLayout;
    private boolean drawPhotoImage;
    public boolean drawPinnedBottom;
    private boolean drawPinnedTop;
    private boolean drawRadialCheckBackground;
    private boolean drawSelectionBackground;
    private int drawSideButton;
    private boolean drawTime;
    private float drawTimeX;
    private float drawTimeY;
    private boolean drawVideoImageButton;
    private boolean drawVideoSize;
    private StaticLayout durationLayout;
    private int durationWidth;
    private boolean edited;
    boolean enterTransitionInProgress;
    private boolean firstCircleLength;
    private int firstVisibleBlockNum;
    private boolean forceNotDrawTime;
    private boolean forwardBotPressed;
    private int forwardNameCenterX;
    private float[] forwardNameOffsetX;
    private boolean forwardNamePressed;
    private float forwardNameX;
    private int forwardNameY;
    private StaticLayout[] forwardedNameLayout;
    private int forwardedNameWidth;
    private boolean fullyDraw;
    private boolean gamePreviewPressed;
    private LinearGradient gradientShader;
    private boolean groupPhotoInvisible;
    private MessageObject.GroupedMessages groupedMessagesToSet;
    private boolean hadLongPress;
    public boolean hasDiscussion;
    private boolean hasEmbed;
    private boolean hasGamePreview;
    private boolean hasInvoicePreview;
    private boolean hasLinkPreview;
    private int hasMiniProgress;
    private boolean hasNewLineForTime;
    private boolean hasOldCaptionPreview;
    private boolean hasPsaHint;
    private int highlightProgress;
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
    private boolean inLayout;
    private StaticLayout infoLayout;
    private int infoWidth;
    private int infoX;
    private boolean insantTextNewLine;
    private boolean instantButtonPressed;
    private RectF instantButtonRect;
    private boolean instantPressed;
    private int instantTextLeftX;
    private int instantTextX;
    private StaticLayout instantViewLayout;
    private int instantWidth;
    private Runnable invalidateRunnable;
    private boolean invalidateSpoilersParent;
    private boolean invalidatesParent;
    private boolean isAvatarVisible;
    public boolean isBlurred;
    public boolean isBot;
    private boolean isCaptionSpoilerPressed;
    public boolean isChat;
    private boolean isCheckPressed;
    private boolean isHighlighted;
    private boolean isHighlightedAnimated;
    public boolean isMegagroup;
    public boolean isPinned;
    public boolean isPinnedChat;
    private boolean isPlayingRound;
    private boolean isPressed;
    public boolean isRepliesChat;
    private boolean isRoundVideo;
    private boolean isSmallImage;
    private boolean isSpoilerRevealing;
    public boolean isThreadChat;
    private boolean isThreadPost;
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
    private int lastTime;
    private float lastTouchX;
    private float lastTouchY;
    private int lastViewsCount;
    private int lastVisibleBlockNum;
    private WebFile lastWebFile;
    private int lastWidth;
    private int layoutHeight;
    private int layoutWidth;
    private int linkBlockNum;
    private int linkPreviewHeight;
    private boolean linkPreviewPressed;
    private int linkSelectionBlockNum;
    public long linkedChatId;
    private LinkSpanDrawable.LinkCollector links;
    private StaticLayout loadingProgressLayout;
    private boolean locationExpired;
    private ImageReceiver locationImageReceiver;
    private boolean mediaBackground;
    private CheckBoxBase mediaCheckBox;
    private int mediaOffsetY;
    private boolean mediaWasInvisible;
    private MessageObject messageObjectToSet;
    private int miniButtonPressed;
    private int miniButtonState;
    private MotionBackgroundDrawable motionBackgroundDrawable;
    private StaticLayout nameLayout;
    private float nameOffsetX;
    private int nameWidth;
    private float nameX;
    private float nameY;
    private int namesOffset;
    private boolean needNewVisiblePart;
    public boolean needReplyImage;
    private int noSoundCenterX;
    private boolean otherPressed;
    private int otherX;
    private int otherY;
    private int overideShouldDrawTimeOnMedia;
    private int parentHeight;
    public float parentViewTopOffset;
    private int parentWidth;
    private StaticLayout performerLayout;
    private int performerX;
    private ImageReceiver photoImage;
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
    private boolean pollUnvoteInProgress;
    private boolean pollVoteInProgress;
    private int pollVoteInProgressNum;
    private boolean pollVoted;
    private int pressedBotButton;
    private LinkSpanDrawable pressedLink;
    private int pressedLinkType;
    private int[] pressedState;
    private int pressedVoteButton;
    private float psaButtonProgress;
    private boolean psaButtonVisible;
    private int psaHelpX;
    private int psaHelpY;
    private boolean psaHintPressed;
    private RadialProgress2 radialProgress;
    public final ReactionsLayoutInBubble reactionsLayoutInBubble;
    private RectF rect;
    private Path rectPath;
    private StaticLayout repliesLayout;
    private int repliesTextWidth;
    public ImageReceiver replyImageReceiver;
    public StaticLayout replyNameLayout;
    private int replyNameOffset;
    private int replyNameWidth;
    private boolean replyPanelIsForward;
    private boolean replyPressed;
    public List<SpoilerEffect> replySpoilers;
    private Stack<SpoilerEffect> replySpoilersPool;
    public int replyStartX;
    public int replyStartY;
    public StaticLayout replyTextLayout;
    private int replyTextOffset;
    private int replyTextWidth;
    private final Theme.ResourcesProvider resourcesProvider;
    private float roundPlayingDrawableProgress;
    private float roundProgressAlpha;
    float roundSeekbarOutAlpha;
    float roundSeekbarOutProgress;
    int roundSeekbarTouched;
    private float roundToPauseProgress;
    private float roundToPauseProgress2;
    private RoundVideoPlayingDrawable roundVideoPlayingDrawable;
    private Path sPath;
    private boolean scheduledInvalidate;
    private Rect scrollRect;
    private SeekBar seekBar;
    private SeekBarAccessibilityDelegate seekBarAccessibilityDelegate;
    private SeekBarWaveform seekBarWaveform;
    private int seekBarX;
    private int seekBarY;
    float seekbarRoundX;
    float seekbarRoundY;
    private float selectedBackgroundProgress;
    private Paint selectionOverlayPaint;
    private Drawable[] selectorDrawable;
    private int[] selectorDrawableMaskType;
    private AnimatorSet shakeAnimation;
    private boolean sideButtonPressed;
    private float sideStartX;
    private float sideStartY;
    private StaticLayout siteNameLayout;
    private boolean siteNameRtl;
    private int siteNameWidth;
    private float slidingOffsetX;
    private StaticLayout songLayout;
    private int songX;
    private SpoilerEffect spoilerPressed;
    private AtomicReference<Layout> spoilersPatchedReplyTextLayout;
    private boolean statusDrawableAnimationInProgress;
    private ValueAnimator statusDrawableAnimator;
    private float statusDrawableProgress;
    private int substractBackgroundHeight;
    private int textX;
    private int textY;
    private float timeAlpha;
    private int timeAudioX;
    private StaticLayout timeLayout;
    private boolean timePressed;
    private int timeTextWidth;
    private boolean timeWasInvisible;
    private int timeWidth;
    private int timeWidthAudio;
    private int timeX;
    private TimerParticles timerParticles;
    private float timerTransitionProgress;
    private StaticLayout titleLayout;
    private int titleX;
    private float toSeekBarProgress;
    private boolean topNearToSet;
    private long totalChangeTime;
    private int totalCommentWidth;
    private int totalHeight;
    private int totalVisibleBlocksCount;
    private final TransitionParams transitionParams;
    float transitionYOffsetForDrawables;
    private int unmovedTextX;
    private Runnable unregisterFlagSecure;
    private ArrayList<LinkPath> urlPathCache;
    private ArrayList<LinkPath> urlPathSelection;
    private boolean useSeekBarWaweform;
    private int viaNameWidth;
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
    private float voteCurrentCircleLength;
    private float voteCurrentProgressTime;
    private long voteLastUpdateTime;
    private float voteRadOffset;
    private boolean voteRisingCircleLength;
    private boolean wasLayout;
    private boolean wasPinned;
    private boolean wasSending;
    private int widthBeforeNewTimeLine;
    private int widthForButtons;
    private boolean willRemoved;

    public interface ChatMessageCellDelegate {

        public final class CC {
            public static boolean $default$canDrawOutboundsContent(ChatMessageCellDelegate chatMessageCellDelegate) {
                return true;
            }

            public static boolean $default$canPerformActions(ChatMessageCellDelegate chatMessageCellDelegate) {
                return false;
            }

            public static void $default$didLongPress(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static boolean $default$didLongPressChannelAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2) {
                return false;
            }

            public static boolean $default$didLongPressUserAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2) {
                return false;
            }

            public static void $default$didPressBotButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
            }

            public static void $default$didPressCancelSendButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressChannelAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2) {
            }

            public static void $default$didPressCommentButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressHiddenForward(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressHint(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressImage(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didPressInstantButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressOther(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, float f, float f2) {
            }

            public static void $default$didPressReaction(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$TL_reactionCount tLRPC$TL_reactionCount, boolean z) {
            }

            public static void $default$didPressReplyMessage(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, int i) {
            }

            public static void $default$didPressSideButton(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressTime(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
            }

            public static void $default$didPressUrl(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
            }

            public static void $default$didPressUserAvatar(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2) {
            }

            public static void $default$didPressViaBot(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, String str) {
            }

            public static void $default$didPressViaBotNotInline(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, long j) {
            }

            public static void $default$didPressVoteButtons(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
            }

            public static void $default$didStartVideoStream(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
            }

            public static String $default$getAdminRank(ChatMessageCellDelegate chatMessageCellDelegate, long j) {
                return null;
            }

            public static PinchToZoomHelper $default$getPinchToZoomHelper(ChatMessageCellDelegate chatMessageCellDelegate) {
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

            public static boolean $default$keyboardIsOpened(ChatMessageCellDelegate chatMessageCellDelegate) {
                return false;
            }

            public static void $default$needOpenWebView(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
            }

            public static boolean $default$needPlayMessage(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
                return false;
            }

            public static void $default$needReloadPolls(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static void $default$onDiceFinished(ChatMessageCellDelegate chatMessageCellDelegate) {
            }

            public static void $default$setShouldNotRepeatSticker(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
            }

            public static boolean $default$shouldDrawThreadProgress(ChatMessageCellDelegate chatMessageCellDelegate, ChatMessageCell chatMessageCell) {
                return false;
            }

            public static boolean $default$shouldRepeatSticker(ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject) {
                return true;
            }

            public static void $default$videoTimerReached(ChatMessageCellDelegate chatMessageCellDelegate) {
            }
        }

        boolean canDrawOutboundsContent();

        boolean canPerformActions();

        void didLongPress(ChatMessageCell chatMessageCell, float f, float f2);

        boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2);

        boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2);

        void didPressBotButton(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton);

        void didPressCancelSendButton(ChatMessageCell chatMessageCell);

        void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i, float f, float f2);

        void didPressCommentButton(ChatMessageCell chatMessageCell);

        void didPressHiddenForward(ChatMessageCell chatMessageCell);

        void didPressHint(ChatMessageCell chatMessageCell, int i);

        void didPressImage(ChatMessageCell chatMessageCell, float f, float f2);

        void didPressInstantButton(ChatMessageCell chatMessageCell, int i);

        void didPressOther(ChatMessageCell chatMessageCell, float f, float f2);

        void didPressReaction(ChatMessageCell chatMessageCell, TLRPC$TL_reactionCount tLRPC$TL_reactionCount, boolean z);

        void didPressReplyMessage(ChatMessageCell chatMessageCell, int i);

        void didPressSideButton(ChatMessageCell chatMessageCell);

        void didPressTime(ChatMessageCell chatMessageCell);

        void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z);

        void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2);

        void didPressViaBot(ChatMessageCell chatMessageCell, String str);

        void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j);

        void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList<TLRPC$TL_pollAnswer> arrayList, int i, int i2, int i3);

        void didStartVideoStream(MessageObject messageObject);

        String getAdminRank(long j);

        PinchToZoomHelper getPinchToZoomHelper();

        TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper();

        boolean hasSelectedMessages();

        void invalidateBlur();

        boolean isLandscape();

        boolean keyboardIsOpened();

        void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2);

        boolean needPlayMessage(MessageObject messageObject);

        void needReloadPolls();

        void onDiceFinished();

        void setShouldNotRepeatSticker(MessageObject messageObject);

        boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell);

        boolean shouldRepeatSticker(MessageObject messageObject);

        void videoTimerReached();
    }

    private boolean intersect(float f, float f2, float f3, float f4) {
        return f <= f3 ? f2 >= f3 : f <= f4;
    }

    public RadialProgress2 getRadialProgress() {
        return this.radialProgress;
    }

    public void setEnterTransitionInProgress(boolean z) {
        this.enterTransitionInProgress = z;
        invalidate();
    }

    public ReactionsLayoutInBubble.ReactionButton getReactionButton(String str) {
        return this.reactionsLayoutInBubble.getReactionButton(str);
    }

    public MessageObject getPrimaryMessageObject() {
        MessageObject messageObject = this.currentMessageObject;
        MessageObject findPrimaryMessageObject = (messageObject == null || this.currentMessagesGroup == null || !messageObject.hasValidGroupId()) ? null : this.currentMessagesGroup.findPrimaryMessageObject();
        return findPrimaryMessageObject != null ? findPrimaryMessageObject : this.currentMessageObject;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
        } else if (i == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        for (SpoilerEffect spoilerEffect : this.captionSpoilers) {
            spoilerEffect.setSuppressUpdates(z);
        }
        for (SpoilerEffect spoilerEffect2 : this.replySpoilers) {
            spoilerEffect2.setSuppressUpdates(z);
        }
        if (!(getMessageObject() == null || getMessageObject().textLayoutBlocks == null)) {
            Iterator<MessageObject.TextLayoutBlock> it = getMessageObject().textLayoutBlocks.iterator();
            while (it.hasNext()) {
                for (SpoilerEffect spoilerEffect3 : it.next().spoilers) {
                    spoilerEffect3.setSuppressUpdates(z);
                }
            }
        }
    }

    public boolean hasSpoilers() {
        if ((hasCaptionLayout() && !this.captionSpoilers.isEmpty()) || (this.replyTextLayout != null && !this.replySpoilers.isEmpty())) {
            return true;
        }
        if (getMessageObject() == null || getMessageObject().textLayoutBlocks == null) {
            return false;
        }
        Iterator<MessageObject.TextLayoutBlock> it = getMessageObject().textLayoutBlocks.iterator();
        while (it.hasNext()) {
            if (!it.next().spoilers.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void updateSpoilersVisiblePart(int i, int i2) {
        if (hasCaptionLayout()) {
            float f = -this.captionY;
            for (SpoilerEffect spoilerEffect : this.captionSpoilers) {
                spoilerEffect.setVisibleBounds(0.0f, i + f, getWidth(), i2 + f);
            }
        }
        StaticLayout staticLayout = this.replyTextLayout;
        if (staticLayout != null) {
            float height = (-this.replyStartY) - staticLayout.getHeight();
            for (SpoilerEffect spoilerEffect2 : this.replySpoilers) {
                spoilerEffect2.setVisibleBounds(0.0f, i + height, getWidth(), i2 + height);
            }
        }
        if (!(getMessageObject() == null || getMessageObject().textLayoutBlocks == null)) {
            Iterator<MessageObject.TextLayoutBlock> it = getMessageObject().textLayoutBlocks.iterator();
            while (it.hasNext()) {
                MessageObject.TextLayoutBlock next = it.next();
                for (SpoilerEffect spoilerEffect3 : next.spoilers) {
                    spoilerEffect3.setVisibleBounds(0.0f, (i - next.textYOffset) - this.textY, getWidth(), (i2 - next.textYOffset) - this.textY);
                }
            }
        }
    }

    public void setScrimReaction(String str) {
        this.reactionsLayoutInBubble.setScrimReaction(str);
    }

    public void drawScrimReaction(Canvas canvas, String str) {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition != null) {
            int i = groupedMessagePosition.flags;
            if ((i & 8) == 0 || (i & 1) == 0) {
                return;
            }
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.isSmall) {
            reactionsLayoutInBubble.draw(canvas, this.transitionParams.animateChangeProgress, str);
        }
    }

    public boolean checkUnreadReactions(float f, int i) {
        if (!this.reactionsLayoutInBubble.hasUnreadReactions) {
            return false;
        }
        float y = getY();
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        float f2 = y + reactionsLayoutInBubble.y;
        return f2 > f && (f2 + ((float) reactionsLayoutInBubble.height)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i);
    }

    public void markReactionsAsRead() {
        this.reactionsLayoutInBubble.hasUnreadReactions = false;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            messageObject.markReactionsAsRead();
        }
    }

    public static class BotButton {
        private int angle;
        private TLRPC$KeyboardButton button;
        private int height;
        private boolean isInviteButton;
        private long lastUpdateTime;
        private float progressAlpha;
        private StaticLayout title;
        private int width;
        private int x;
        private int y;

        private BotButton() {
        }

        static float access$2716(BotButton botButton, float f) {
            float f2 = botButton.progressAlpha + f;
            botButton.progressAlpha = f2;
            return f2;
        }

        static float access$2724(BotButton botButton, float f) {
            float f2 = botButton.progressAlpha - f;
            botButton.progressAlpha = f2;
            return f2;
        }

        static int access$2816(BotButton botButton, float f) {
            int i = (int) (botButton.angle + f);
            botButton.angle = i;
            return i;
        }

        static int access$2820(BotButton botButton, int i) {
            int i2 = botButton.angle - i;
            botButton.angle = i2;
            return i2;
        }
    }

    public static class PollButton {
        private TLRPC$TL_pollAnswer answer;
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

        static int access$1712(PollButton pollButton, int i) {
            int i2 = pollButton.percent + i;
            pollButton.percent = i2;
            return i2;
        }

        static float access$2424(PollButton pollButton, float f) {
            float f2 = pollButton.decimal - f;
            pollButton.decimal = f2;
            return f2;
        }
    }

    public ChatMessageCell(Context context) {
        this(context, false, null);
    }

    public ChatMessageCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.reactionsLayoutInBubble = new ReactionsLayoutInBubble(this);
        this.scrollRect = new Rect();
        this.imageBackgroundGradientRotation = 45;
        this.selectorDrawable = new Drawable[2];
        this.selectorDrawableMaskType = new int[2];
        this.instantButtonRect = new RectF();
        this.pressedState = new int[]{16842910, 16842919};
        this.deleteProgressRect = new RectF();
        this.rect = new RectF();
        this.timeAlpha = 1.0f;
        this.controlsAlpha = 1.0f;
        this.links = new LinkSpanDrawable.LinkCollector(this);
        this.urlPathCache = new ArrayList<>();
        this.urlPathSelection = new ArrayList<>();
        this.rectPath = new Path();
        this.pollButtons = new ArrayList<>();
        this.botButtons = new ArrayList<>();
        this.botButtonsByData = new HashMap<>();
        this.botButtonsByPosition = new HashMap<>();
        this.currentAccount = UserConfig.selectedAccount;
        this.isCheckPressed = true;
        this.drawBackground = true;
        this.backgroundWidth = 100;
        this.commentButtonRect = new Rect();
        this.spoilersPatchedReplyTextLayout = new AtomicReference<>();
        this.forwardedNameLayout = new StaticLayout[2];
        this.forwardNameOffsetX = new float[2];
        this.drawTime = true;
        this.ALPHA_PROPERTY_WORKAROUND = Build.VERSION.SDK_INT == 28;
        this.alphaInternal = 1.0f;
        this.transitionParams = new TransitionParams();
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
        this.captionSpoilers = new ArrayList();
        this.captionSpoilersPool = new Stack<>();
        this.captionPatchedSpoilersLayout = new AtomicReference<>();
        this.sPath = new Path();
        this.hadLongPress = false;
        this.ANIMATION_OFFSET_X = new Property<ChatMessageCell, Float>(this, Float.class, "animationOffsetX") {
            public Float get(ChatMessageCell chatMessageCell) {
                return Float.valueOf(chatMessageCell.animationOffsetX);
            }

            public void set(ChatMessageCell chatMessageCell, Float f) {
                chatMessageCell.setAnimationOffsetX(f.floatValue());
            }
        };
        this.resourcesProvider = resourcesProvider;
        this.canDrawBackgroundInParent = z;
        this.backgroundDrawable = new MessageBackgroundDrawable(this);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.avatarImage = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(21.0f));
        this.avatarDrawable = new AvatarDrawable();
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.replyImageReceiver = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(2.0f));
        ImageReceiver imageReceiver3 = new ImageReceiver(this);
        this.locationImageReceiver = imageReceiver3;
        imageReceiver3.setRoundRadius(AndroidUtilities.dp(26.1f));
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.contactAvatarDrawable = new AvatarDrawable();
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.photoImage = imageReceiver4;
        imageReceiver4.setUseRoundForThumbDrawable(true);
        this.photoImage.setDelegate(this);
        this.radialProgress = new RadialProgress2(this, resourcesProvider);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, resourcesProvider);
        this.videoRadialProgress = radialProgress2;
        radialProgress2.setDrawBackground(false);
        this.videoRadialProgress.setCircleRadius(AndroidUtilities.dp(15.0f));
        SeekBar seekBar = new SeekBar(this);
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
                    return ChatMessageCell.this.useSeekBarWaweform ? ChatMessageCell.this.seekBarWaveform.getProgress() : ChatMessageCell.this.seekBar.getProgress();
                }
                return 0.0f;
            }

            @Override
            public void setProgress(float f) {
                if (ChatMessageCell.this.currentMessageObject.isMusic()) {
                    ChatMessageCell.this.seekBar.setProgress(f);
                } else if (!ChatMessageCell.this.currentMessageObject.isVoice()) {
                    return;
                } else {
                    if (ChatMessageCell.this.useSeekBarWaweform) {
                        ChatMessageCell.this.seekBarWaveform.setProgress(f);
                    } else {
                        ChatMessageCell.this.seekBar.setProgress(f);
                    }
                }
                ChatMessageCell.this.onSeekBarDrag(f);
                ChatMessageCell.this.invalidate();
            }
        };
        this.roundVideoPlayingDrawable = new RoundVideoPlayingDrawable(this, resourcesProvider);
        setImportantForAccessibility(1);
    }

    private void createPollUI() {
        if (this.pollAvatarImages == null) {
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
                this.pollAvatarDrawables[i].setTextSize(AndroidUtilities.dp(6.0f));
                i++;
            }
            this.pollCheckBox = new CheckBoxBase[10];
            int i2 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr = this.pollCheckBox;
                if (i2 < checkBoxBaseArr.length) {
                    checkBoxBaseArr[i2] = new CheckBoxBase(this, 20, this.resourcesProvider);
                    this.pollCheckBox[i2].setDrawUnchecked(false);
                    this.pollCheckBox[i2].setBackgroundType(9);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private void createCommentUI() {
        if (this.commentAvatarImages == null) {
            this.commentAvatarImages = new ImageReceiver[3];
            this.commentAvatarDrawables = new AvatarDrawable[3];
            this.commentAvatarImagesVisible = new boolean[3];
            int i = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.commentAvatarImages;
                if (i < imageReceiverArr.length) {
                    imageReceiverArr[i] = new ImageReceiver(this);
                    this.commentAvatarImages[i].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.commentAvatarDrawables[i] = new AvatarDrawable();
                    this.commentAvatarDrawables[i].setTextSize(AndroidUtilities.dp(8.0f));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void resetPressedLink(int i) {
        if (i != -1) {
            this.links.removeLinks(Integer.valueOf(i));
        } else {
            this.links.clear();
        }
        if (this.pressedLink == null) {
            return;
        }
        if (this.pressedLinkType == i || i == -1) {
            this.pressedLink = null;
            this.pressedLinkType = -1;
            invalidate();
        }
    }

    private void resetUrlPaths() {
        if (!this.urlPathSelection.isEmpty()) {
            this.urlPathCache.addAll(this.urlPathSelection);
            this.urlPathSelection.clear();
        }
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
        boolean z;
        int i;
        int i2;
        TextStyleSpan.TextStyleRun style;
        TLRPC$MessageEntity tLRPC$MessageEntity;
        if (!(characterStyle instanceof URLSpanBrowser) || (style = ((URLSpanBrowser) characterStyle).getStyle()) == null || (tLRPC$MessageEntity = style.urlEntity) == null) {
            i2 = 0;
            i = 0;
            z = false;
        } else {
            i = tLRPC$MessageEntity.offset;
            i2 = tLRPC$MessageEntity.length + i;
            z = true;
        }
        if (!z) {
            i = spannable.getSpanStart(characterStyle);
            i2 = spannable.getSpanEnd(characterStyle);
        }
        return new int[]{i, i2};
    }

    private boolean checkTextBlockMotionEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkTextBlockMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkCaptionMotionEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkCaptionMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkGameMotionEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkGameMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkLinkPreviewMotionEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkLinkPreviewMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkPollButtonMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.currentMessageObject.eventId != 0 || this.pollVoteInProgress || this.pollUnvoteInProgress || this.pollButtons.isEmpty()) {
            return false;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject.type != 17 || !messageObject.isSent()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.pressedVoteButton = -1;
            this.pollHintPressed = false;
            if (!this.hintButtonVisible || (i = this.pollHintX) == -1 || x < i || x > i + AndroidUtilities.dp(40.0f) || y < (i2 = this.pollHintY) || y > i2 + AndroidUtilities.dp(40.0f)) {
                for (int i3 = 0; i3 < this.pollButtons.size(); i3++) {
                    PollButton pollButton = this.pollButtons.get(i3);
                    int dp = (pollButton.y + this.namesOffset) - AndroidUtilities.dp(13.0f);
                    int i4 = pollButton.x;
                    if (x >= i4 && x <= (i4 + this.backgroundWidth) - AndroidUtilities.dp(31.0f) && y >= dp && y <= pollButton.height + dp + AndroidUtilities.dp(26.0f)) {
                        this.pressedVoteButton = i3;
                        if (!this.pollVoted && !this.pollClosed) {
                            this.selectorDrawableMaskType[0] = 1;
                            if (Build.VERSION.SDK_INT >= 21) {
                                Drawable[] drawableArr = this.selectorDrawable;
                                if (drawableArr[0] != null) {
                                    drawableArr[0].setBounds(pollButton.x - AndroidUtilities.dp(9.0f), dp, (pollButton.x + this.backgroundWidth) - AndroidUtilities.dp(22.0f), pollButton.height + dp + AndroidUtilities.dp(26.0f));
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
            this.pollHintPressed = true;
            this.selectorDrawableMaskType[0] = 3;
            if (Build.VERSION.SDK_INT >= 21) {
                Drawable[] drawableArr2 = this.selectorDrawable;
                if (drawableArr2[0] != null) {
                    drawableArr2[0].setBounds(this.pollHintX - AndroidUtilities.dp(8.0f), this.pollHintY - AndroidUtilities.dp(8.0f), this.pollHintX + AndroidUtilities.dp(32.0f), this.pollHintY + AndroidUtilities.dp(32.0f));
                    this.selectorDrawable[0].setHotspot(x, y);
                    this.selectorDrawable[0].setState(this.pressedState);
                }
            }
            invalidate();
            return true;
        } else if (motionEvent.getAction() == 1) {
            if (this.pollHintPressed) {
                playSoundEffect(0);
                this.delegate.didPressHint(this, 0);
                this.pollHintPressed = false;
                if (Build.VERSION.SDK_INT < 21) {
                    return false;
                }
                Drawable[] drawableArr3 = this.selectorDrawable;
                if (drawableArr3[0] == null) {
                    return false;
                }
                drawableArr3[0].setState(StateSet.NOTHING);
                return false;
            } else if (this.pressedVoteButton == -1) {
                return false;
            } else {
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
                    TLRPC$TL_pollAnswer tLRPC$TL_pollAnswer = pollButton2.answer;
                    if (this.pollVoted || this.pollClosed) {
                        ArrayList<TLRPC$TL_pollAnswer> arrayList = new ArrayList<>();
                        arrayList.add(tLRPC$TL_pollAnswer);
                        this.delegate.didPressVoteButtons(this, arrayList, pollButton2.count, pollButton2.x + AndroidUtilities.dp(50.0f), this.namesOffset + pollButton2.y);
                    } else if (!this.lastPoll.multiple_choice) {
                        this.pollVoteInProgressNum = this.pressedVoteButton;
                        this.pollVoteInProgress = true;
                        this.vibrateOnPollVote = true;
                        this.voteCurrentProgressTime = 0.0f;
                        this.firstCircleLength = true;
                        this.voteCurrentCircleLength = 360.0f;
                        this.voteRisingCircleLength = false;
                        ArrayList<TLRPC$TL_pollAnswer> arrayList2 = new ArrayList<>();
                        arrayList2.add(tLRPC$TL_pollAnswer);
                        this.delegate.didPressVoteButtons(this, arrayList2, -1, 0, 0);
                    } else if (this.currentMessageObject.checkedVotes.contains(tLRPC$TL_pollAnswer)) {
                        this.currentMessageObject.checkedVotes.remove(tLRPC$TL_pollAnswer);
                        this.pollCheckBox[this.pressedVoteButton].setChecked(false, true);
                    } else {
                        this.currentMessageObject.checkedVotes.add(tLRPC$TL_pollAnswer);
                        this.pollCheckBox[this.pressedVoteButton].setChecked(true, true);
                    }
                }
                this.pressedVoteButton = -1;
                invalidate();
                return false;
            }
        } else if (motionEvent.getAction() != 2) {
            return false;
        } else {
            if ((this.pressedVoteButton == -1 && !this.pollHintPressed) || Build.VERSION.SDK_INT < 21) {
                return false;
            }
            Drawable[] drawableArr5 = this.selectorDrawable;
            if (drawableArr5[0] == null) {
                return false;
            }
            drawableArr5[0].setHotspot(x, y);
            return false;
        }
    }

    private boolean checkInstantButtonMotionEvent(MotionEvent motionEvent) {
        if (!this.currentMessageObject.isSponsored() && (!this.drawInstantView || this.currentMessageObject.type == 0)) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i = 2;
        if (motionEvent.getAction() == 0) {
            if (this.drawInstantView) {
                float f = x;
                float f2 = y;
                if (this.instantButtonRect.contains(f, f2)) {
                    int[] iArr = this.selectorDrawableMaskType;
                    if (this.lastPoll == null) {
                        i = 0;
                    }
                    iArr[0] = i;
                    this.instantPressed = true;
                    if (Build.VERSION.SDK_INT >= 21 && this.selectorDrawable[0] != null && this.instantButtonRect.contains(f, f2)) {
                        this.selectorDrawable[0].setHotspot(f, f2);
                        this.selectorDrawable[0].setState(this.pressedState);
                        this.instantButtonPressed = true;
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
                this.instantButtonPressed = false;
                this.instantPressed = false;
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

    private void invalidateWithParent() {
        if (!(this.currentMessagesGroup == null || getParent() == null)) {
            ((ViewGroup) getParent()).invalidate();
        }
        invalidate();
    }

    private boolean checkCommentButtonMotionEvent(MotionEvent motionEvent) {
        int i = 0;
        if (!this.drawCommentButton) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition == null || (groupedMessagePosition.flags & 1) != 0 || !this.commentButtonRect.contains(x, y)) {
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

    private boolean checkOtherButtonMotionEvent(MotionEvent motionEvent) {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i = this.documentAttachType;
        if ((i == 5 || i == 1) && (groupedMessagePosition = this.currentPosition) != null && (groupedMessagePosition.flags & 4) == 0) {
            return false;
        }
        int i2 = this.currentMessageObject.type;
        boolean z = i2 == 16;
        if (!z) {
            z = (i == 1 || i2 == 12 || i == 5 || i == 4 || i == 2 || i2 == 8) && !this.hasGamePreview && !this.hasInvoicePreview;
        }
        if (!z) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject.type == 16) {
                ?? isVideoCall = messageObject.isVideoCall();
                int i3 = this.otherX;
                if (x >= i3) {
                    if (x <= i3 + AndroidUtilities.dp((isVideoCall == 0 ? 202 : 200) + 30) && y >= this.otherY - AndroidUtilities.dp(14.0f) && y <= this.otherY + AndroidUtilities.dp(50.0f)) {
                        this.otherPressed = true;
                        this.selectorDrawableMaskType[0] = 4;
                        if (Build.VERSION.SDK_INT >= 21 && this.selectorDrawable[0] != null) {
                            int dp = this.otherX + AndroidUtilities.dp(isVideoCall == 0 ? 202.0f : 200.0f) + (Theme.chat_msgInCallDrawable[isVideoCall == true ? 1 : 0].getIntrinsicWidth() / 2);
                            int intrinsicHeight = this.otherY + (Theme.chat_msgInCallDrawable[isVideoCall].getIntrinsicHeight() / 2);
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

    private boolean checkDateMotionEvent(MotionEvent motionEvent) {
        if (!this.currentMessageObject.isImportedForward()) {
            return false;
        }
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

    private boolean checkRoundSeekbar(MotionEvent motionEvent) {
        if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || !MediaController.getInstance().isMessagePaused()) {
            return false;
        }
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

    private boolean checkPhotoImageMotionEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkPhotoImageMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkAudioMotionEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.checkAudioMotionEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkSpoilersMotionEvent(MotionEvent motionEvent) {
        int i;
        if (this.isSpoilerRevealing) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int i2 = this.textX;
            if (x >= i2 && y >= (i = this.textY)) {
                MessageObject messageObject = this.currentMessageObject;
                if (x <= i2 + messageObject.textWidth && y <= i + messageObject.textHeight) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
                    for (int i3 = 0; i3 < arrayList.size() && arrayList.get(i3).textYOffset <= y; i3++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i3);
                        int i4 = textLayoutBlock.isRtl() ? (int) this.currentMessageObject.textXOffset : 0;
                        for (SpoilerEffect spoilerEffect : textLayoutBlock.spoilers) {
                            if (spoilerEffect.getBounds().contains((x - this.textX) + i4, (int) ((y - this.textY) - textLayoutBlock.textYOffset))) {
                                this.spoilerPressed = spoilerEffect;
                                this.isCaptionSpoilerPressed = false;
                                return true;
                            }
                        }
                    }
                }
            }
            if (hasCaptionLayout()) {
                float f = x;
                float f2 = this.captionX;
                if (f >= f2) {
                    float f3 = y;
                    if (f3 >= this.captionY && f <= f2 + this.captionLayout.getWidth() && f3 <= this.captionY + this.captionLayout.getHeight()) {
                        for (SpoilerEffect spoilerEffect2 : this.captionSpoilers) {
                            if (spoilerEffect2.getBounds().contains((int) (f - this.captionX), (int) (f3 - this.captionY))) {
                                this.spoilerPressed = spoilerEffect2;
                                this.isCaptionSpoilerPressed = true;
                                return true;
                            }
                        }
                    }
                }
            }
        } else if (actionMasked == 1 && this.spoilerPressed != null) {
            playSoundEffect(0);
            this.sPath.rewind();
            if (this.isCaptionSpoilerPressed) {
                for (SpoilerEffect spoilerEffect3 : this.captionSpoilers) {
                    Rect bounds = spoilerEffect3.getBounds();
                    this.sPath.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                }
            } else {
                Iterator<MessageObject.TextLayoutBlock> it = this.currentMessageObject.textLayoutBlocks.iterator();
                while (it.hasNext()) {
                    MessageObject.TextLayoutBlock next = it.next();
                    for (SpoilerEffect spoilerEffect4 : next.spoilers) {
                        Rect bounds2 = spoilerEffect4.getBounds();
                        float f4 = next.textYOffset;
                        this.sPath.addRect(bounds2.left, bounds2.top + f4, bounds2.right, bounds2.bottom + f4, Path.Direction.CW);
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
            if (this.isCaptionSpoilerPressed) {
                for (SpoilerEffect spoilerEffect5 : this.captionSpoilers) {
                    spoilerEffect5.startRipple(x - this.captionX, y - this.captionY, sqrt);
                }
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList2 = this.currentMessageObject.textLayoutBlocks;
                if (arrayList2 != null) {
                    Iterator<MessageObject.TextLayoutBlock> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        MessageObject.TextLayoutBlock next2 = it2.next();
                        int i5 = next2.isRtl() ? (int) this.currentMessageObject.textXOffset : 0;
                        for (SpoilerEffect spoilerEffect6 : next2.spoilers) {
                            spoilerEffect6.startRipple((x - this.textX) + i5, (y - next2.textYOffset) - this.textY, sqrt);
                        }
                    }
                }
            }
            if (getParent() instanceof RecyclerListView) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    if (childAt instanceof ChatMessageCell) {
                        final ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        if (chatMessageCell.getMessageObject() != null && chatMessageCell.getMessageObject().getReplyMsgId() == getMessageObject().getId() && !chatMessageCell.replySpoilers.isEmpty()) {
                            chatMessageCell.replySpoilers.get(0).setOnRippleEndCallback(new Runnable() {
                                @Override
                                public final void run() {
                                    ChatMessageCell.this.lambda$checkSpoilersMotionEvent$3(chatMessageCell);
                                }
                            });
                            for (SpoilerEffect spoilerEffect7 : chatMessageCell.replySpoilers) {
                                spoilerEffect7.startRipple(spoilerEffect7.getBounds().centerX(), spoilerEffect7.getBounds().centerY(), sqrt);
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
                ChatMessageCell.this.lambda$checkSpoilersMotionEvent$0();
            }
        });
    }

    public void lambda$checkSpoilersMotionEvent$0() {
        this.isSpoilerRevealing = false;
        getMessageObject().isSpoilersRevealed = true;
        if (this.isCaptionSpoilerPressed) {
            this.captionSpoilers.clear();
        } else {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = this.currentMessageObject.textLayoutBlocks;
            if (arrayList != null) {
                Iterator<MessageObject.TextLayoutBlock> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().spoilers.clear();
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
        if (this.botButtons.isEmpty() || this.currentMessageObject.eventId != 0) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            if (this.currentMessageObject.isOutOwner()) {
                i = (getMeasuredWidth() - this.widthForButtons) - AndroidUtilities.dp(10.0f);
            } else {
                i = this.backgroundDrawableLeft + AndroidUtilities.dp(this.mediaBackground ? 1.0f : 7.0f);
            }
            for (int i2 = 0; i2 < this.botButtons.size(); i2++) {
                BotButton botButton = this.botButtons.get(i2);
                int dp = (botButton.y + this.layoutHeight) - AndroidUtilities.dp(2.0f);
                if (x >= botButton.x + i && x <= botButton.x + i + botButton.width && y >= dp && y <= dp + botButton.height) {
                    this.pressedBotButton = i2;
                    invalidate();
                    return true;
                }
            }
            return false;
        } else if (motionEvent.getAction() != 1 || this.pressedBotButton == -1) {
            return false;
        } else {
            playSoundEffect(0);
            if (this.currentMessageObject.scheduled) {
                Toast.makeText(getContext(), LocaleController.getString("MessageScheduledBotAction", R.string.MessageScheduledBotAction), 1).show();
            } else {
                BotButton botButton2 = this.botButtons.get(this.pressedBotButton);
                if (botButton2.button != null) {
                    this.delegate.didPressBotButton(this, botButton2.button);
                }
            }
            this.pressedBotButton = -1;
            invalidate();
            return false;
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean checkReactionsTouchEvent(MotionEvent motionEvent) {
        MessageObject.GroupedMessages groupedMessages;
        if (!this.currentMessageObject.hasValidGroupId() || (groupedMessages = this.currentMessagesGroup) == null || groupedMessages.isDocuments) {
            return this.reactionsLayoutInBubble.chekTouchEvent(motionEvent);
        }
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
                    if (!((i2 & 8) == 0 || (i2 & 1) == 0)) {
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

    private boolean checkPinchToZoom(MotionEvent motionEvent) {
        ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
        PinchToZoomHelper pinchToZoomHelper = chatMessageCellDelegate == null ? null : chatMessageCellDelegate.getPinchToZoomHelper();
        if (this.currentMessageObject == null || !this.photoImage.hasNotThumb() || pinchToZoomHelper == null || this.currentMessageObject.isSticker() || this.currentMessageObject.isAnimatedEmoji()) {
            return false;
        }
        if ((this.currentMessageObject.isVideo() && !this.autoPlayingMedia) || this.isRoundVideo || this.currentMessageObject.isAnimatedSticker()) {
            return false;
        }
        if ((!this.currentMessageObject.isDocument() || this.currentMessageObject.isGif()) && !this.currentMessageObject.needDrawBluredPreview()) {
            return pinchToZoomHelper.checkPinchToZoom(motionEvent, this, this.photoImage, this.currentMessageObject);
        }
        return false;
    }

    private boolean checkTextSelection(MotionEvent motionEvent) {
        MessageObject messageObject;
        TLRPC$Message tLRPC$Message;
        int i;
        int i2;
        int i3;
        MessageObject.GroupedMessages groupedMessages;
        TextSelectionHelper.ChatListTextSelectionHelper textSelectionHelper = this.delegate.getTextSelectionHelper();
        if (textSelectionHelper == null || MessagesController.getInstance(this.currentAccount).isChatNoForwards(this.currentMessageObject.getChatId()) || ((tLRPC$Message = (messageObject = this.currentMessageObject).messageOwner) != null && tLRPC$Message.noforwards)) {
            return false;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
        if (!((arrayList != null && !arrayList.isEmpty()) || hasCaptionLayout())) {
            return false;
        }
        if ((!this.drawSelectionBackground && this.currentMessagesGroup == null) || !(this.currentMessagesGroup == null || this.delegate.hasSelectedMessages())) {
            return false;
        }
        if (!this.currentMessageObject.hasValidGroupId() || (groupedMessages = this.currentMessagesGroup) == null || groupedMessages.isDocuments) {
            if (hasCaptionLayout()) {
                textSelectionHelper.setIsDescription(false);
                textSelectionHelper.setMaybeTextCord((int) this.captionX, (int) this.captionY);
            } else if (this.descriptionLayout == null || motionEvent.getY() <= this.descriptionY) {
                textSelectionHelper.setIsDescription(false);
                textSelectionHelper.setMaybeTextCord(this.textX, this.textY);
            } else {
                textSelectionHelper.setIsDescription(true);
                if (this.hasGamePreview) {
                    i = this.unmovedTextX - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.hasInvoicePreview) {
                        i3 = this.unmovedTextX;
                        i2 = AndroidUtilities.dp(1.0f);
                    } else {
                        i3 = this.unmovedTextX;
                        i2 = AndroidUtilities.dp(1.0f);
                    }
                    i = i3 + i2;
                }
                textSelectionHelper.setMaybeTextCord(i + AndroidUtilities.dp(10.0f) + this.descriptionX, this.descriptionY);
            }
            textSelectionHelper.setMessageObject(this);
            return textSelectionHelper.onTouchEvent(motionEvent);
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                MessageObject.GroupedMessagePosition currentPosition = chatMessageCell.getCurrentPosition();
                if (currentMessagesGroup != null && currentMessagesGroup.groupId == this.currentMessagesGroup.groupId) {
                    int i5 = currentPosition.flags;
                    if (!((i5 & 8) == 0 || (i5 & 1) == 0)) {
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
        }
        return false;
    }

    private void updateSelectionTextPosition() {
        int i;
        int i2;
        int i3;
        if (getDelegate() != null && getDelegate().getTextSelectionHelper() != null && getDelegate().getTextSelectionHelper().isSelected(this.currentMessageObject)) {
            int textSelectionType = getDelegate().getTextSelectionHelper().getTextSelectionType(this);
            if (textSelectionType == TextSelectionHelper.ChatListTextSelectionHelper.TYPE_DESCRIPTION) {
                if (this.hasGamePreview) {
                    i = this.unmovedTextX - AndroidUtilities.dp(10.0f);
                } else {
                    if (this.hasInvoicePreview) {
                        i3 = this.unmovedTextX;
                        i2 = AndroidUtilities.dp(1.0f);
                    } else {
                        i3 = this.unmovedTextX;
                        i2 = AndroidUtilities.dp(1.0f);
                    }
                    i = i3 + i2;
                }
                getDelegate().getTextSelectionHelper().updateTextPosition(i + AndroidUtilities.dp(10.0f) + this.descriptionX, this.descriptionY);
            } else if (textSelectionType == TextSelectionHelper.ChatListTextSelectionHelper.TYPE_CAPTION) {
                getDelegate().getTextSelectionHelper().updateTextPosition((int) this.captionX, (int) this.captionY);
            } else {
                getDelegate().getTextSelectionHelper().updateTextPosition(this.textX, this.textY);
            }
        }
    }

    public ArrayList<PollButton> getPollButtons() {
        return this.pollButtons;
    }

    public void updatePlayingMessageProgress() {
        String formatShortDuration;
        int i;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            VideoPlayerRewinder videoPlayerRewinder = this.videoPlayerRewinder;
            if (!(videoPlayerRewinder == null || videoPlayerRewinder.rewindCount == 0 || !videoPlayerRewinder.rewindByBackSeek)) {
                messageObject.audioProgress = videoPlayerRewinder.getVideoProgress();
            }
            int i2 = 0;
            if (this.documentAttachType == 4) {
                if (this.infoLayout == null || (!PhotoViewer.isPlayingMessage(this.currentMessageObject) && !MediaController.getInstance().isGoingToShowMessageObject(this.currentMessageObject))) {
                    AnimatedFileDrawable animation = this.photoImage.getAnimation();
                    if (animation != null) {
                        MessageObject messageObject2 = this.currentMessageObject;
                        i2 = animation.getDurationMs() / 1000;
                        messageObject2.audioPlayerDuration = i2;
                        MessageObject messageObject3 = this.currentMessageObject;
                        TLRPC$Message tLRPC$Message = messageObject3.messageOwner;
                        if (tLRPC$Message.ttl > 0 && tLRPC$Message.destroyTime == 0 && !messageObject3.needDrawBluredPreview() && this.currentMessageObject.isVideo() && animation.hasBitmap()) {
                            this.delegate.didStartVideoStream(this.currentMessageObject);
                        }
                    }
                    if (i2 == 0) {
                        i2 = this.currentMessageObject.getDuration();
                    }
                    if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                        float f = i2;
                        i2 = (int) (f - (this.currentMessageObject.audioProgress * f));
                    } else if (animation != null) {
                        if (i2 != 0) {
                            i2 -= animation.getCurrentProgressMs() / 1000;
                        }
                        if (this.delegate != null && animation.getCurrentProgressMs() >= 3000) {
                            this.delegate.videoTimerReached();
                        }
                    }
                    if (this.lastTime != i2) {
                        String formatShortDuration2 = AndroidUtilities.formatShortDuration(i2);
                        this.infoWidth = (int) Math.ceil(Theme.chat_infoPaint.measureText(formatShortDuration2));
                        this.infoLayout = new StaticLayout(formatShortDuration2, Theme.chat_infoPaint, this.infoWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.lastTime = i2;
                    }
                }
            } else if (this.isRoundVideo) {
                TLRPC$Document document = this.currentMessageObject.getDocument();
                int i3 = 0;
                while (true) {
                    if (i3 >= document.attributes.size()) {
                        i = 0;
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i3);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                        i = tLRPC$DocumentAttribute.duration;
                        break;
                    }
                    i3++;
                }
                if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                    i = Math.max(0, i - this.currentMessageObject.audioProgressSec);
                }
                if (this.lastTime != i) {
                    this.lastTime = i;
                    String formatLongDuration = AndroidUtilities.formatLongDuration(i);
                    this.timeWidthAudio = (int) Math.ceil(Theme.chat_timePaint.measureText(formatLongDuration));
                    this.durationLayout = new StaticLayout(formatLongDuration, Theme.chat_timePaint, this.timeWidthAudio, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                float f2 = this.currentMessageObject.audioProgress;
                if (f2 != 0.0f) {
                    this.lastDrawingAudioProgress = f2;
                    if (f2 > 0.9f) {
                        this.lastDrawingAudioProgress = 1.0f;
                    }
                }
                invalidate();
            } else if (this.documentAttach != null) {
                if (this.useSeekBarWaweform) {
                    if (!this.seekBarWaveform.isDragging()) {
                        this.seekBarWaveform.setProgress(this.currentMessageObject.audioProgress, true);
                    }
                } else if (!this.seekBar.isDragging()) {
                    this.seekBar.setProgress(this.currentMessageObject.audioProgress);
                    this.seekBar.setBufferedProgress(this.currentMessageObject.bufferedProgress);
                }
                if (this.documentAttachType == 3) {
                    if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= this.documentAttach.attributes.size()) {
                                break;
                            }
                            TLRPC$DocumentAttribute tLRPC$DocumentAttribute2 = this.documentAttach.attributes.get(i4);
                            if (tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeAudio) {
                                i2 = tLRPC$DocumentAttribute2.duration;
                                break;
                            }
                            i4++;
                        }
                    } else {
                        i2 = this.currentMessageObject.audioProgressSec;
                    }
                    if (this.lastTime != i2) {
                        this.lastTime = i2;
                        String formatLongDuration2 = AndroidUtilities.formatLongDuration(i2);
                        this.timeWidthAudio = (int) Math.ceil(Theme.chat_audioTimePaint.measureText(formatLongDuration2));
                        this.durationLayout = new StaticLayout(formatLongDuration2, Theme.chat_audioTimePaint, this.timeWidthAudio, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                } else {
                    int duration = this.currentMessageObject.getDuration();
                    if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                        i2 = this.currentMessageObject.audioProgressSec;
                    }
                    if (this.lastTime != i2) {
                        this.lastTime = i2;
                        this.durationLayout = new StaticLayout(AndroidUtilities.formatShortDuration(i2, duration), Theme.chat_audioTimePaint, (int) Math.ceil(Theme.chat_audioTimePaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                invalidate();
            }
        }
    }

    public void setFullyDraw(boolean z) {
        this.fullyDraw = z;
    }

    public void setParentViewSize(int i, int i2) {
        Theme.MessageDrawable messageDrawable;
        this.parentWidth = i;
        this.parentHeight = i2;
        this.backgroundHeight = i2;
        if ((this.currentMessageObject != null && hasGradientService() && this.currentMessageObject.shouldDrawWithoutBackground()) || ((messageDrawable = this.currentBackgroundDrawable) != null && messageDrawable.getGradientShader() != null)) {
            invalidate();
        }
    }

    public void setVisiblePart(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        MessageObject.TextLayoutBlock textLayoutBlock;
        this.parentWidth = i4;
        this.parentHeight = i5;
        this.backgroundHeight = i5;
        this.blurredViewTopOffset = i6;
        this.blurredViewBottomOffset = i7;
        this.viewTop = f2;
        if (!(i3 == i5 && f == this.parentViewTopOffset)) {
            this.parentViewTopOffset = f;
            this.parentHeight = i3;
        }
        if (this.currentMessageObject != null && hasGradientService() && this.currentMessageObject.shouldDrawWithoutBackground()) {
            invalidate();
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.textLayoutBlocks != null) {
            int i8 = i - this.textY;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i10 < this.currentMessageObject.textLayoutBlocks.size() && this.currentMessageObject.textLayoutBlocks.get(i10).textYOffset <= i8) {
                i10++;
                i11 = i10;
            }
            int i12 = -1;
            int i13 = -1;
            while (i11 < this.currentMessageObject.textLayoutBlocks.size()) {
                float f3 = this.currentMessageObject.textLayoutBlocks.get(i11).textYOffset;
                float f4 = i8;
                if (intersect(f3, textLayoutBlock.height + f3, f4, i8 + i2)) {
                    if (i12 == -1) {
                        i12 = i11;
                    }
                    i9++;
                    i13 = i11;
                } else if (f3 > f4) {
                    break;
                }
                i11++;
            }
            if (this.lastVisibleBlockNum != i13 || this.firstVisibleBlockNum != i12 || this.totalVisibleBlocksCount != i9) {
                this.lastVisibleBlockNum = i13;
                this.firstVisibleBlockNum = i12;
                this.totalVisibleBlocksCount = i9;
                invalidate();
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
        TLRPC$WebPage tLRPC$WebPage;
        boolean z;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject.type == 1 || messageObject.isAnyKindOfSticker()) {
            int i = this.buttonState;
            if (i == -1) {
                this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
            } else if (i == 0) {
                didPressButton(true, false);
            }
        } else {
            MessageObject messageObject2 = this.currentMessageObject;
            int i2 = messageObject2.type;
            if (i2 == 12) {
                long j = messageObject2.messageOwner.media.user_id;
                TLRPC$User tLRPC$User = null;
                if (j != 0) {
                    tLRPC$User = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                }
                this.delegate.didPressUserAvatar(this, tLRPC$User, this.lastTouchX, this.lastTouchY);
            } else if (i2 == 5) {
                if (this.buttonState != -1) {
                    didPressButton(true, false);
                } else if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) {
                    this.delegate.needPlayMessage(this.currentMessageObject);
                } else {
                    MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject);
                }
            } else if (i2 == 8) {
                int i3 = this.buttonState;
                if (i3 == -1 || (i3 == 1 && this.canStreamVideo && this.autoPlayingMedia)) {
                    this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                } else if (i3 == 2 || i3 == 0) {
                    didPressButton(true, false);
                }
            } else {
                int i4 = this.documentAttachType;
                if (i4 == 4) {
                    int i5 = this.buttonState;
                    if (i5 == -1 || ((z = this.drawVideoImageButton) && (this.autoPlayingMedia || (SharedConfig.streamMedia && this.canStreamVideo)))) {
                        this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                    } else if (z) {
                        didPressButton(true, true);
                    } else if (i5 == 0 || i5 == 3) {
                        didPressButton(true, false);
                    }
                } else if (i2 == 4) {
                    this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                } else if (i4 == 1) {
                    if (this.buttonState == -1) {
                        this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                    }
                } else if (i4 == 2) {
                    if (this.buttonState == -1 && (tLRPC$WebPage = messageObject2.messageOwner.media.webpage) != null) {
                        String str = tLRPC$WebPage.embed_url;
                        if (str == null || str.length() == 0) {
                            Browser.openUrl(getContext(), tLRPC$WebPage.url);
                        } else {
                            this.delegate.needOpenWebView(this.currentMessageObject, tLRPC$WebPage.embed_url, tLRPC$WebPage.site_name, tLRPC$WebPage.description, tLRPC$WebPage.url, tLRPC$WebPage.embed_width, tLRPC$WebPage.embed_height);
                        }
                    }
                } else if (this.hasInvoicePreview && this.buttonState == -1) {
                    this.delegate.didPressImage(this, this.lastTouchX, this.lastTouchY);
                }
            }
        }
    }

    private void updateSecretTimeText(MessageObject messageObject) {
        String secretTimeString;
        if (messageObject != null && messageObject.needDrawBluredPreview() && (secretTimeString = messageObject.getSecretTimeString()) != null) {
            int ceil = (int) Math.ceil(Theme.chat_infoPaint.measureText(secretTimeString));
            this.infoWidth = ceil;
            this.infoLayout = new StaticLayout(TextUtils.ellipsize(secretTimeString, Theme.chat_infoPaint, ceil, TextUtils.TruncateAt.END), Theme.chat_infoPaint, this.infoWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    private boolean isPhotoDataChanged(org.telegram.messenger.MessageObject r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.isPhotoDataChanged(org.telegram.messenger.MessageObject):boolean");
    }

    public int getRepliesCount() {
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages == null || groupedMessages.messages.isEmpty()) {
            return this.currentMessageObject.getRepliesCount();
        }
        return this.currentMessagesGroup.messages.get(0).getRepliesCount();
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

    private void updateCaptionSpoilers() {
        this.captionSpoilersPool.addAll(this.captionSpoilers);
        this.captionSpoilers.clear();
        if (this.captionLayout != null && !getMessageObject().isSpoilersRevealed) {
            SpoilerEffect.addSpoilers(this, this.captionLayout, this.captionSpoilersPool, this.captionSpoilers);
        }
    }

    private boolean isUserDataChanged() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.isUserDataChanged():boolean");
    }

    public ImageReceiver getPhotoImage() {
        return this.photoImage;
    }

    public int getNoSoundIconCenterX() {
        return this.noSoundCenterX;
    }

    public int getForwardNameCenterX() {
        float f;
        TLRPC$User tLRPC$User = this.currentUser;
        if (tLRPC$User == null || tLRPC$User.id != 0) {
            f = this.forwardNameX + this.forwardNameCenterX;
        } else {
            f = this.avatarImage.getCenterX();
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

    public TLRPC$User getCurrentUser() {
        return this.currentUser;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startSpoilers);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopSpoilers);
        cancelShakeAnimation();
        if (!this.animationRunning) {
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
            this.radialProgress.onDetachedFromWindow();
            this.videoRadialProgress.onDetachedFromWindow();
            this.avatarImage.onDetachedFromWindow();
            if (this.pollAvatarImages != null) {
                int i2 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.pollAvatarImages;
                    if (i2 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i2].onDetachedFromWindow();
                    i2++;
                }
            }
            if (this.commentAvatarImages != null) {
                int i3 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr2 = this.commentAvatarImages;
                    if (i3 >= imageReceiverArr2.length) {
                        break;
                    }
                    imageReceiverArr2[i3].onDetachedFromWindow();
                    i3++;
                }
            }
            this.replyImageReceiver.onDetachedFromWindow();
            this.locationImageReceiver.onDetachedFromWindow();
            this.photoImage.onDetachedFromWindow();
            if (!(!this.addedForTest || this.currentUrl == null || this.currentWebFile == null)) {
                ImageLoader.getInstance().removeTestWebFile(this.currentUrl);
                this.addedForTest = false;
            }
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            if (!(getDelegate() == null || getDelegate().getTextSelectionHelper() == null)) {
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
            Runnable runnable = this.unregisterFlagSecure;
            if (runnable != null) {
                runnable.run();
                this.unregisterFlagSecure = null;
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startSpoilers);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopSpoilers);
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
        float f = 0.0f;
        this.animationOffsetX = 0.0f;
        this.slidingOffsetX = 0.0f;
        this.checkBoxTranslation = 0;
        updateTranslation();
        this.radialProgress.onAttachedToWindow();
        this.videoRadialProgress.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
        this.avatarImage.setParentView((View) getParent());
        if (this.pollAvatarImages != null) {
            int i2 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.pollAvatarImages;
                if (i2 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i2].onAttachedToWindow();
                i2++;
            }
        }
        if (this.commentAvatarImages != null) {
            int i3 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr2 = this.commentAvatarImages;
                if (i3 >= imageReceiverArr2.length) {
                    break;
                }
                imageReceiverArr2[i3].onAttachedToWindow();
                i3++;
            }
        }
        this.replyImageReceiver.onAttachedToWindow();
        this.locationImageReceiver.onAttachedToWindow();
        if (!this.photoImage.onAttachedToWindow()) {
            updateButtonState(false, false, false);
        } else if (this.drawPhotoImage) {
            updateButtonState(false, false, false);
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null && (this.isRoundVideo || messageObject3.isVideo())) {
            checkVideoPlayback(true, null);
        }
        int i4 = this.documentAttachType;
        if (i4 != 4 || !this.autoPlayingMedia) {
            this.animatingNoSoundPlaying = false;
            this.animatingNoSoundProgress = 0.0f;
            this.animatingDrawVideoImageButtonProgress = ((i4 == 4 || i4 == 2) && this.drawVideoSize) ? 1.0f : 0.0f;
        } else {
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
            this.animatingNoSoundPlaying = isPlayingMessage;
            this.animatingNoSoundProgress = isPlayingMessage ? 0.0f : 1.0f;
            this.animatingNoSound = 0;
        }
        if (!(getDelegate() == null || getDelegate().getTextSelectionHelper() == null)) {
            getDelegate().getTextSelectionHelper().onChatMessageCellAttached(this);
        }
        if (this.documentAttachType == 5) {
            if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                f = 1.0f;
            }
            this.toSeekBarProgress = f;
        }
        this.reactionsLayoutInBubble.onAttachToWindow();
        updateFlagSecure();
    }

    private void setMessageContent(org.telegram.messenger.MessageObject r70, org.telegram.messenger.MessageObject.GroupedMessages r71, boolean r72, boolean r73) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setMessageContent(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean, boolean):void");
    }

    public static int lambda$setMessageContent$4(PollButton pollButton, PollButton pollButton2) {
        if (pollButton.decimal > pollButton2.decimal) {
            return -1;
        }
        if (pollButton.decimal < pollButton2.decimal) {
            return 1;
        }
        if (pollButton.decimal != pollButton2.decimal) {
            return 0;
        }
        if (pollButton.percent > pollButton2.percent) {
            return 1;
        }
        return pollButton.percent < pollButton2.percent ? -1 : 0;
    }

    private void updateFlagSecure() {
        Runnable runnable;
        TLRPC$Message tLRPC$Message;
        MessageObject messageObject = this.currentMessageObject;
        boolean z = (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || !tLRPC$Message.noforwards) ? false : true;
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (z && this.unregisterFlagSecure == null && findActivity != null) {
            this.unregisterFlagSecure = AndroidUtilities.registerFlagSecure(findActivity.getWindow());
        } else if (!z && (runnable = this.unregisterFlagSecure) != null) {
            runnable.run();
            this.unregisterFlagSecure = null;
        }
    }

    public void checkVideoPlayback(boolean z, Bitmap bitmap) {
        if (!this.currentMessageObject.isVideo()) {
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
        } else if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
            this.photoImage.setAllowStartAnimation(false);
            this.photoImage.stopAnimation();
        } else {
            this.photoImage.setAllowStartAnimation(true);
            this.photoImage.startAnimation();
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
        if (!this.isRoundVideo || !this.isPlayingRound || !MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || ((this.lastTouchX - this.photoImage.getCenterX()) * (this.lastTouchX - this.photoImage.getCenterX())) + ((this.lastTouchY - this.photoImage.getCenterY()) * (this.lastTouchY - this.photoImage.getCenterY())) >= (this.photoImage.getImageWidth() / 2.0f) * (this.photoImage.getImageWidth() / 2.0f) || (this.lastTouchX <= this.photoImage.getCenterX() + (this.photoImage.getImageWidth() / 4.0f) && this.lastTouchX >= this.photoImage.getCenterX() - (this.photoImage.getImageWidth() / 4.0f))) {
            LinkSpanDrawable linkSpanDrawable = this.pressedLink;
            if (linkSpanDrawable != null) {
                if (linkSpanDrawable.getSpan() instanceof URLSpanMono) {
                    this.hadLongPress = true;
                    this.delegate.didPressUrl(this, this.pressedLink.getSpan(), true);
                    return true;
                } else if (this.pressedLink.getSpan() instanceof URLSpanNoUnderline) {
                    URLSpanNoUnderline uRLSpanNoUnderline = (URLSpanNoUnderline) this.pressedLink.getSpan();
                    if (ChatActivity.isClickableLink(uRLSpanNoUnderline.getURL()) || uRLSpanNoUnderline.getURL().startsWith("/")) {
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
            if (!(this.buttonPressed == 0 && this.miniButtonPressed == 0 && this.videoButtonPressed == 0 && this.pressedBotButton == -1)) {
                this.buttonPressed = 0;
                this.miniButtonPressed = 0;
                this.videoButtonPressed = 0;
                this.pressedBotButton = -1;
                invalidate();
            }
            this.linkPreviewPressed = false;
            this.sideButtonPressed = false;
            this.imagePressed = false;
            this.timePressed = false;
            this.gamePreviewPressed = false;
            if (this.pressedVoteButton != -1 || this.pollHintPressed || this.psaHintPressed || this.instantPressed || this.otherPressed || this.commentButtonPressed) {
                this.commentButtonPressed = false;
                this.instantButtonPressed = false;
                this.instantPressed = false;
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
                }
                invalidate();
            }
            ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
            if (chatMessageCellDelegate != null) {
                if (this.avatarPressed) {
                    TLRPC$User tLRPC$User = this.currentUser;
                    if (tLRPC$User == null) {
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
                    } else if (tLRPC$User.id != 0) {
                        z = chatMessageCellDelegate.didLongPressUserAvatar(this, tLRPC$User, this.lastTouchX, this.lastTouchY);
                    }
                }
                if (!z) {
                    this.delegate.didLongPress(this, this.lastTouchX, this.lastTouchY);
                }
            }
            return true;
        }
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

    public void showHintButton(boolean z, boolean z2, int i) {
        float f = 1.0f;
        if (i == -1 || i == 0) {
            if (this.hintButtonVisible != z) {
                this.hintButtonVisible = z;
                if (!z2) {
                    this.hintButtonProgress = z ? 1.0f : 0.0f;
                } else {
                    invalidate();
                }
            } else {
                return;
            }
        }
        if ((i == -1 || i == 1) && this.psaButtonVisible != z) {
            this.psaButtonVisible = z;
            if (!z2) {
                if (!z) {
                    f = 0.0f;
                }
                this.psaButtonProgress = f;
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
        if (this.useSeekBarWaweform) {
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

    @Override
    public void invalidate() {
        ChatMessageCellDelegate chatMessageCellDelegate;
        if (this.currentMessageObject != null) {
            super.invalidate();
            if ((this.invalidatesParent || (this.currentMessagesGroup != null && !this.links.isEmpty())) && getParent() != null) {
                View view = (View) getParent();
                if (view.getParent() != null) {
                    view.invalidate();
                    ((View) view.getParent()).invalidate();
                }
            }
            if (this.isBlurred && (chatMessageCellDelegate = this.delegate) != null) {
                chatMessageCellDelegate.invalidateBlur();
            }
        }
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        if (this.currentMessageObject != null) {
            super.invalidate(i, i2, i3, i4);
            if (this.invalidatesParent && getParent() != null) {
                ((View) getParent()).invalidate(((int) getX()) + i, ((int) getY()) + i2, ((int) getX()) + i3, ((int) getY()) + i4);
            }
        }
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
        if (this.isHighlighted != z) {
            this.isHighlighted = z;
            if (!z) {
                this.lastHighlightProgressTime = System.currentTimeMillis();
                this.isHighlightedAnimated = true;
                this.highlightProgress = 300;
            } else {
                this.isHighlightedAnimated = false;
                this.highlightProgress = 0;
            }
            updateRadialProgressBackground();
            if (this.useSeekBarWaweform) {
                this.seekBarWaveform.setSelected(isDrawSelectionBackground());
            } else {
                this.seekBar.setSelected(isDrawSelectionBackground());
            }
            invalidate();
            if (getParent() != null) {
                ((View) getParent()).invalidate();
            }
        }
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        updateRadialProgressBackground();
        if (this.useSeekBarWaweform) {
            this.seekBarWaveform.setSelected(isDrawSelectionBackground());
        } else {
            this.seekBar.setSelected(isDrawSelectionBackground());
        }
        invalidate();
    }

    private void updateRadialProgressBackground() {
        if (!this.drawRadialCheckBackground) {
            boolean z = true;
            boolean z2 = (this.isHighlighted || this.isPressed || isPressed()) && (!this.drawPhotoImage || !this.photoImage.hasBitmapImage());
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
    }

    @Override
    public void onSeekBarDrag(float f) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            messageObject.audioProgress = f;
            MediaController.getInstance().seekToProgress(this.currentMessageObject, f);
            updatePlayingMessageProgress();
        }
    }

    @Override
    public void onSeekBarContinuousDrag(float f) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            messageObject.audioProgress = f;
            messageObject.audioProgressSec = (int) (messageObject.getDuration() * f);
            updatePlayingMessageProgress();
        }
    }

    public boolean isAnimatingPollAnswer() {
        return this.animatePollAnswerAlpha;
    }

    private void updateWaveform() {
        if (this.currentMessageObject != null && this.documentAttachType == 3) {
            boolean z = false;
            for (int i = 0; i < this.documentAttach.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = this.documentAttach.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                    byte[] bArr = tLRPC$DocumentAttribute.waveform;
                    if (bArr == null || bArr.length == 0) {
                        MediaController.getInstance().generateWaveform(this.currentMessageObject);
                    }
                    byte[] bArr2 = tLRPC$DocumentAttribute.waveform;
                    if (bArr2 != null) {
                        z = true;
                    }
                    this.useSeekBarWaweform = z;
                    this.seekBarWaveform.setWaveform(bArr2);
                    return;
                }
            }
        }
    }

    private int createDocumentLayout(int i, MessageObject messageObject) {
        int i2;
        int i3;
        int i4 = i;
        if (messageObject.type == 0) {
            this.documentAttach = messageObject.messageOwner.media.webpage.document;
        } else {
            this.documentAttach = messageObject.getDocument();
        }
        TLRPC$Document tLRPC$Document = this.documentAttach;
        int i5 = 0;
        if (tLRPC$Document == null) {
            return 0;
        }
        if (MessageObject.isVoiceDocument(tLRPC$Document)) {
            this.documentAttachType = 3;
            int i6 = 0;
            while (true) {
                if (i6 >= this.documentAttach.attributes.size()) {
                    i3 = 0;
                    break;
                }
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = this.documentAttach.attributes.get(i6);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                    i3 = tLRPC$DocumentAttribute.duration;
                    break;
                }
                i6++;
            }
            this.widthBeforeNewTimeLine = (i4 - AndroidUtilities.dp(94.0f)) - ((int) Math.ceil(Theme.chat_audioTimePaint.measureText("00:00")));
            this.availableTimeWidth = i4 - AndroidUtilities.dp(18.0f);
            measureTime(messageObject);
            int dp = AndroidUtilities.dp(174.0f) + this.timeWidth;
            if (!this.hasLinkPreview) {
                this.backgroundWidth = Math.min(i4, dp + ((int) Math.ceil(Theme.chat_audioTimePaint.measureText(AndroidUtilities.formatLongDuration(i3)))));
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
            int dp2 = i4 - AndroidUtilities.dp(92.0f);
            if (dp2 < 0) {
                dp2 = AndroidUtilities.dp(100.0f);
            }
            int i7 = dp2;
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicTitle().replace('\n', ' '), Theme.chat_audioTitlePaint, i7 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.chat_audioTitlePaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.songLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.songX = -((int) Math.ceil(this.songLayout.getLineLeft(0)));
            }
            StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(messageObject.getMusicAuthor().replace('\n', ' '), Theme.chat_audioPerformerPaint, i7, TextUtils.TruncateAt.END), Theme.chat_audioPerformerPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.performerLayout = staticLayout2;
            if (staticLayout2.getLineCount() > 0) {
                this.performerX = -((int) Math.ceil(this.performerLayout.getLineLeft(0)));
            }
            int i8 = 0;
            while (true) {
                if (i8 >= this.documentAttach.attributes.size()) {
                    break;
                }
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute2 = this.documentAttach.attributes.get(i8);
                if (tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeAudio) {
                    i5 = tLRPC$DocumentAttribute2.duration;
                    break;
                }
                i8++;
            }
            int ceil = (int) Math.ceil(Theme.chat_audioTimePaint.measureText(AndroidUtilities.formatShortDuration(i5, i5)));
            this.widthBeforeNewTimeLine = (this.backgroundWidth - AndroidUtilities.dp(86.0f)) - ceil;
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
                i4 += AndroidUtilities.dp(30.0f);
            }
            this.documentAttachType = 1;
            String documentFileName = FileLoader.getDocumentFileName(this.documentAttach);
            if (documentFileName.length() == 0) {
                documentFileName = LocaleController.getString("AttachDocument", R.string.AttachDocument);
            }
            StaticLayout createStaticLayout = StaticLayoutEx.createStaticLayout(documentFileName, Theme.chat_docNamePaint, i4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.MIDDLE, i4, 2, false);
            this.docTitleLayout = createStaticLayout;
            this.docTitleOffsetX = Integer.MIN_VALUE;
            if (createStaticLayout == null || createStaticLayout.getLineCount() <= 0) {
                this.docTitleOffsetX = 0;
                i2 = i4;
            } else {
                int i9 = 0;
                while (i5 < this.docTitleLayout.getLineCount()) {
                    i9 = Math.max(i9, (int) Math.ceil(this.docTitleLayout.getLineWidth(i5)));
                    this.docTitleOffsetX = Math.max(this.docTitleOffsetX, (int) Math.ceil(-this.docTitleLayout.getLineLeft(i5)));
                    i5++;
                }
                i2 = Math.min(i4, i9);
            }
            int dp3 = i4 - AndroidUtilities.dp(30.0f);
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
                this.currentPhotoObjectThumb = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 40);
                if ((DownloadController.getInstance(this.currentAccount).getAutodownloadMask() & 1) == 0) {
                    this.currentPhotoObject = null;
                }
                TLRPC$PhotoSize tLRPC$PhotoSize = this.currentPhotoObject;
                if (tLRPC$PhotoSize == null || tLRPC$PhotoSize == this.currentPhotoObjectThumb) {
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
                this.photoImage.setImage(ImageLocation.getForObject(this.currentPhotoObject, messageObject.photoThumbsObject), "86_86", ImageLocation.getForObject(this.currentPhotoObjectThumb, messageObject.photoThumbsObject), this.currentPhotoFilter, this.currentPhotoObjectThumbStripped, 0, null, messageObject, 1);
            }
            return i2;
        }
    }

    private void calcBackgroundWidth(int i, int i2, int i3) {
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        boolean z = reactionsLayoutInBubble.isEmpty;
        int i4 = (z || reactionsLayoutInBubble.isSmall) ? this.currentMessageObject.lastLineWidth : reactionsLayoutInBubble.lastLineX;
        boolean z2 = false;
        if (z || reactionsLayoutInBubble.isSmall ? this.hasLinkPreview || this.hasOldCaptionPreview || this.hasGamePreview || this.hasInvoicePreview || i - i4 < i2 || this.currentMessageObject.hasRtl : i - i4 < i2 || this.currentMessageObject.hasRtl) {
            z2 = true;
        }
        if (z2) {
            this.totalHeight += AndroidUtilities.dp(14.0f);
            this.hasNewLineForTime = true;
            int max = Math.max(i3, i4) + AndroidUtilities.dp(31.0f);
            this.backgroundWidth = max;
            this.backgroundWidth = Math.max(max, (this.currentMessageObject.isOutOwner() ? this.timeWidth + AndroidUtilities.dp(17.0f) : this.timeWidth) + AndroidUtilities.dp(31.0f));
            return;
        }
        int extraTextX = (i3 - getExtraTextX()) - i4;
        if (extraTextX < 0 || extraTextX > i2) {
            this.backgroundWidth = Math.max(i3, i4 + i2) + AndroidUtilities.dp(31.0f);
        } else {
            this.backgroundWidth = ((i3 + i2) - extraTextX) + AndroidUtilities.dp(31.0f);
        }
    }

    public void setHighlightedText(String str) {
        MessageObject messageObject = this.messageObjectToSet;
        if (messageObject == null) {
            messageObject = this.currentMessageObject;
        }
        if (messageObject != null && messageObject.messageOwner.message != null && !TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.message.toLowerCase();
            int length = lowerCase2.length();
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < length; i3++) {
                int min = Math.min(lowerCase.length(), length - i3);
                int i4 = 0;
                for (int i5 = 0; i5 < min; i5++) {
                    boolean z = lowerCase2.charAt(i3 + i5) == lowerCase.charAt(i5);
                    if (z) {
                        if (i4 != 0 || i3 == 0 || " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(lowerCase2.charAt(i3 - 1)) >= 0) {
                            i4++;
                        } else {
                            z = false;
                        }
                    }
                    if (!z || i5 == min - 1) {
                        if (i4 > 0 && i4 > i2) {
                            i = i3;
                            i2 = i4;
                        }
                    }
                }
            }
            if (i != -1) {
                int length2 = lowerCase2.length();
                for (int i6 = i + i2; i6 < length2 && " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(lowerCase2.charAt(i6)) < 0; i6++) {
                    i2++;
                }
                int i7 = i + i2;
                if (this.captionLayout != null && !TextUtils.isEmpty(messageObject.caption)) {
                    resetUrlPaths();
                    try {
                        LinkPath obtainNewUrlPath = obtainNewUrlPath();
                        obtainNewUrlPath.setCurrentLayout(this.captionLayout, i, 0.0f);
                        this.captionLayout.getSelectionPath(i, i7, obtainNewUrlPath);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    invalidate();
                } else if (messageObject.textLayoutBlocks != null) {
                    for (int i8 = 0; i8 < messageObject.textLayoutBlocks.size(); i8++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = messageObject.textLayoutBlocks.get(i8);
                        if (i >= textLayoutBlock.charactersOffset && i < textLayoutBlock.charactersEnd) {
                            this.linkSelectionBlockNum = i8;
                            resetUrlPaths();
                            try {
                                LinkPath obtainNewUrlPath2 = obtainNewUrlPath();
                                obtainNewUrlPath2.setCurrentLayout(textLayoutBlock.textLayout, i, 0.0f);
                                textLayoutBlock.textLayout.getSelectionPath(i, i7, obtainNewUrlPath2);
                                if (i7 >= textLayoutBlock.charactersOffset + i2) {
                                    for (int i9 = i8 + 1; i9 < messageObject.textLayoutBlocks.size(); i9++) {
                                        MessageObject.TextLayoutBlock textLayoutBlock2 = messageObject.textLayoutBlocks.get(i9);
                                        int i10 = textLayoutBlock2.charactersEnd - textLayoutBlock2.charactersOffset;
                                        LinkPath obtainNewUrlPath3 = obtainNewUrlPath();
                                        obtainNewUrlPath3.setCurrentLayout(textLayoutBlock2.textLayout, 0, textLayoutBlock2.height);
                                        textLayoutBlock2.textLayout.getSelectionPath(0, i7 - textLayoutBlock2.charactersOffset, obtainNewUrlPath3);
                                        if (i7 < (textLayoutBlock.charactersOffset + i10) - 1) {
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            invalidate();
                            return;
                        }
                    }
                }
            } else if (!this.urlPathSelection.isEmpty()) {
                this.linkSelectionBlockNum = -1;
                resetUrlPaths();
                invalidate();
            }
        } else if (!this.urlPathSelection.isEmpty()) {
            this.linkSelectionBlockNum = -1;
            resetUrlPaths();
            invalidate();
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            Drawable[] drawableArr = this.selectorDrawable;
            if (drawable != drawableArr[0] && drawable != drawableArr[1]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (this.currentMessagesGroup != null && drawable == this.selectorDrawable[1]) {
            invalidateWithParent();
        }
    }

    private boolean isCurrentLocationTimeExpired(MessageObject messageObject) {
        return this.currentMessageObject.messageOwner.media.period % 60 == 0 ? Math.abs(ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - messageObject.messageOwner.date) > messageObject.messageOwner.media.period : Math.abs(ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - messageObject.messageOwner.date) > messageObject.messageOwner.media.period + (-5);
    }

    public void checkLocationExpired() {
        boolean isCurrentLocationTimeExpired;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && (isCurrentLocationTimeExpired = isCurrentLocationTimeExpired(messageObject)) != this.locationExpired) {
            this.locationExpired = isCurrentLocationTimeExpired;
            if (!isCurrentLocationTimeExpired) {
                AndroidUtilities.runOnUIThread(this.invalidateRunnable, 1000L);
                this.scheduledInvalidate = true;
                int dp = this.backgroundWidth - AndroidUtilities.dp(91.0f);
                this.docTitleLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString("AttachLiveLocation", R.string.AttachLiveLocation), Theme.chat_locationTitlePaint, dp, TextUtils.TruncateAt.END), Theme.chat_locationTitlePaint, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                return;
            }
            MessageObject messageObject2 = this.currentMessageObject;
            this.currentMessageObject = null;
            setMessageObject(messageObject2, this.currentMessagesGroup, this.pinnedBottom, this.pinnedTop);
        }
    }

    public void setIsUpdating(boolean z) {
        this.isUpdating = true;
    }

    public void setMessageObject(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z, boolean z2) {
        if (this.attachedToWindow) {
            setMessageContent(messageObject, groupedMessages, z, z2);
            return;
        }
        this.messageObjectToSet = messageObject;
        this.groupedMessagesToSet = groupedMessages;
        this.bottomNearToSet = z;
        this.topNearToSet = z2;
    }

    private int getAdditionalWidthForPosition(MessageObject.GroupedMessagePosition groupedMessagePosition) {
        int i = 0;
        if (groupedMessagePosition == null) {
            return 0;
        }
        if ((groupedMessagePosition.flags & 2) == 0) {
            i = 0 + AndroidUtilities.dp(4.0f);
        }
        return (groupedMessagePosition.flags & 1) == 0 ? i + AndroidUtilities.dp(4.0f) : i;
    }

    public void createSelectorDrawable(final int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            String str = "chat_outPreviewInstantText";
            if (this.psaHintPressed) {
                i2 = getThemedColor(this.currentMessageObject.isOutOwner() ? "chat_outViews" : "chat_inViews");
            } else {
                i2 = getThemedColor(this.currentMessageObject.isOutOwner() ? str : "chat_inPreviewInstantText");
            }
            Drawable[] drawableArr = this.selectorDrawable;
            if (drawableArr[i] == null) {
                final Paint paint = new Paint(1);
                paint.setColor(-1);
                Drawable drawable = new Drawable() {
                    RectF rect = new RectF();
                    Path path = new Path();

                    @Override
                    public int getOpacity() {
                        return -2;
                    }

                    @Override
                    public void setAlpha(int i3) {
                    }

                    @Override
                    public void setColorFilter(ColorFilter colorFilter) {
                    }

                    @Override
                    public void draw(Canvas canvas) {
                        Rect bounds = getBounds();
                        this.rect.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                        if (ChatMessageCell.this.selectorDrawableMaskType[i] == 3 || ChatMessageCell.this.selectorDrawableMaskType[i] == 4) {
                            canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), AndroidUtilities.dp(ChatMessageCell.this.selectorDrawableMaskType[i] == 3 ? 16.0f : 20.0f), paint);
                            return;
                        }
                        float f = 0.0f;
                        if (ChatMessageCell.this.selectorDrawableMaskType[i] == 2) {
                            this.path.reset();
                            boolean z = ChatMessageCell.this.currentMessageObject != null && ChatMessageCell.this.currentMessageObject.isOutOwner();
                            for (int i3 = 0; i3 < 4; i3++) {
                                if (!ChatMessageCell.this.insantTextNewLine) {
                                    if (i3 == 2 && !z) {
                                        float[] fArr = ChatMessageCell.radii;
                                        int i4 = i3 * 2;
                                        float dp = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                                        ChatMessageCell.radii[i4 + 1] = dp;
                                        fArr[i4] = dp;
                                    } else if (i3 == 3 && z) {
                                        float[] fArr2 = ChatMessageCell.radii;
                                        int i5 = i3 * 2;
                                        float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                                        ChatMessageCell.radii[i5 + 1] = dp2;
                                        fArr2[i5] = dp2;
                                    } else if ((ChatMessageCell.this.mediaBackground || ChatMessageCell.this.pinnedBottom) && (i3 == 2 || i3 == 3)) {
                                        float[] fArr3 = ChatMessageCell.radii;
                                        int i6 = i3 * 2;
                                        float[] fArr4 = ChatMessageCell.radii;
                                        int i7 = i6 + 1;
                                        float dp3 = AndroidUtilities.dp(ChatMessageCell.this.pinnedBottom ? Math.min(5, SharedConfig.bubbleRadius) : SharedConfig.bubbleRadius);
                                        fArr4[i7] = dp3;
                                        fArr3[i6] = dp3;
                                    }
                                }
                                float[] fArr5 = ChatMessageCell.radii;
                                int i8 = i3 * 2;
                                ChatMessageCell.radii[i8 + 1] = 0.0f;
                                fArr5[i8] = 0.0f;
                            }
                            this.path.addRoundRect(this.rect, ChatMessageCell.radii, Path.Direction.CW);
                            this.path.close();
                            canvas.drawPath(this.path, paint);
                            return;
                        }
                        RectF rectF = this.rect;
                        float dp4 = ChatMessageCell.this.selectorDrawableMaskType[i] == 0 ? AndroidUtilities.dp(6.0f) : 0.0f;
                        if (ChatMessageCell.this.selectorDrawableMaskType[i] == 0) {
                            f = AndroidUtilities.dp(6.0f);
                        }
                        canvas.drawRoundRect(rectF, dp4, f, paint);
                    }
                };
                int[][] iArr = {StateSet.WILD_CARD};
                int[] iArr2 = new int[1];
                if (!this.currentMessageObject.isOutOwner()) {
                    str = "chat_inPreviewInstantText";
                }
                iArr2[0] = getThemedColor(str) & 436207615;
                this.selectorDrawable[i] = new RippleDrawable(new ColorStateList(iArr, iArr2), null, drawable);
                this.selectorDrawable[i].setCallback(this);
            } else {
                Theme.setSelectorDrawableColor(drawableArr[i], i2 & 436207615, true);
            }
            this.selectorDrawable[i].setVisible(true, false);
        }
    }

    private void createInstantViewButton() {
        String str;
        int measureText;
        if (Build.VERSION.SDK_INT >= 21 && this.drawInstantView) {
            createSelectorDrawable(0);
        }
        if (this.drawInstantView && this.instantViewLayout == null) {
            this.instantWidth = AndroidUtilities.dp(33.0f);
            int i = this.drawInstantViewType;
            if (i == 12) {
                str = LocaleController.getString("OpenChannelPost", R.string.OpenChannelPost);
            } else if (i == 1) {
                str = LocaleController.getString("OpenChannel", R.string.OpenChannel);
            } else if (i == 13) {
                str = LocaleController.getString("SendMessage", R.string.SendMessage).toUpperCase();
            } else if (i == 10) {
                str = LocaleController.getString("OpenBot", R.string.OpenBot);
            } else if (i == 2) {
                str = LocaleController.getString("OpenGroup", R.string.OpenGroup);
            } else if (i == 3) {
                str = LocaleController.getString("OpenMessage", R.string.OpenMessage);
            } else if (i == 5) {
                str = LocaleController.getString("ViewContact", R.string.ViewContact);
            } else if (i == 6) {
                str = LocaleController.getString("OpenBackground", R.string.OpenBackground);
            } else if (i == 7) {
                str = LocaleController.getString("OpenTheme", R.string.OpenTheme);
            } else if (i == 8) {
                if (this.pollVoted || this.pollClosed) {
                    str = LocaleController.getString("PollViewResults", R.string.PollViewResults);
                } else {
                    str = LocaleController.getString("PollSubmitVotes", R.string.PollSubmitVotes);
                }
            } else if (i == 9 || i == 11) {
                TLRPC$TL_webPage tLRPC$TL_webPage = (TLRPC$TL_webPage) this.currentMessageObject.messageOwner.media.webpage;
                if (tLRPC$TL_webPage == null || !tLRPC$TL_webPage.url.contains("voicechat=")) {
                    str = LocaleController.getString("VoipGroupJoinAsLinstener", R.string.VoipGroupJoinAsLinstener);
                } else {
                    str = LocaleController.getString("VoipGroupJoinAsSpeaker", R.string.VoipGroupJoinAsSpeaker);
                }
            } else {
                str = LocaleController.getString("InstantView", R.string.InstantView);
            }
            if (this.currentMessageObject.isSponsored() && this.backgroundWidth < (measureText = (int) (Theme.chat_instantViewPaint.measureText(str) + AndroidUtilities.dp(75.0f)))) {
                this.backgroundWidth = measureText;
            }
            int dp = this.backgroundWidth - AndroidUtilities.dp(75.0f);
            this.instantViewLayout = new StaticLayout(TextUtils.ellipsize(str, Theme.chat_instantViewPaint, dp, TextUtils.TruncateAt.END), Theme.chat_instantViewPaint, dp + AndroidUtilities.dp(2.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (this.drawInstantViewType == 8) {
                this.instantWidth = this.backgroundWidth - AndroidUtilities.dp(13.0f);
            } else {
                this.instantWidth = this.backgroundWidth - AndroidUtilities.dp(34.0f);
            }
            int dp2 = this.totalHeight + AndroidUtilities.dp(46.0f);
            this.totalHeight = dp2;
            if (this.currentMessageObject.type == 12) {
                this.totalHeight = dp2 + AndroidUtilities.dp(14.0f);
            }
            if (this.currentMessageObject.isSponsored() && this.hasNewLineForTime) {
                this.totalHeight += AndroidUtilities.dp(16.0f);
            }
            StaticLayout staticLayout = this.instantViewLayout;
            if (staticLayout != null && staticLayout.getLineCount() > 0) {
                double d = this.instantWidth;
                double ceil = Math.ceil(this.instantViewLayout.getLineWidth(0));
                Double.isNaN(d);
                this.instantTextX = (((int) (d - ceil)) / 2) + (this.drawInstantViewType == 0 ? AndroidUtilities.dp(8.0f) : 0);
                int lineLeft = (int) this.instantViewLayout.getLineLeft(0);
                this.instantTextLeftX = lineLeft;
                this.instantTextX += -lineLeft;
            }
        }
    }

    @Override
    public void requestLayout() {
        if (!this.inLayout) {
            super.requestLayout();
        }
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
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.totalHeight + this.keyboardHeight);
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
        if (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2) {
            return parentWidth;
        }
        int i = (parentWidth / 100) * 35;
        if (i < AndroidUtilities.dp(320.0f)) {
            i = AndroidUtilities.dp(320.0f);
        }
        return parentWidth - i;
    }

    private int getExtraTextX() {
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
        if (this.currentMessageObject.isOutOwner() || !this.isPlayingRound || !this.isAvatarVisible || this.currentMessageObject.type != 5) {
            return 0;
        }
        return (int) ((AndroidUtilities.roundPlayingMessageSize - AndroidUtilities.roundMessageSize) * 0.7f);
    }

    @Override
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.currentMessageObject != null) {
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            int i15 = 10;
            if (this.lastSize != measuredHeight || !this.wasLayout) {
                this.layoutWidth = getMeasuredWidth();
                this.layoutHeight = getMeasuredHeight() - this.substractBackgroundHeight;
                if (this.timeTextWidth < 0) {
                    this.timeTextWidth = AndroidUtilities.dp(10.0f);
                }
                this.timeLayout = new StaticLayout(this.currentTimeString, Theme.chat_timePaint, AndroidUtilities.dp(100.0f) + this.timeTextWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (this.mediaBackground) {
                    if (this.currentMessageObject.isOutOwner()) {
                        this.timeX = (this.layoutWidth - this.timeWidth) - AndroidUtilities.dp(42.0f);
                    } else {
                        this.timeX = (this.backgroundWidth - AndroidUtilities.dp(4.0f)) - this.timeWidth;
                        if (this.currentMessageObject.isAnyKindOfSticker()) {
                            this.timeX = Math.max(AndroidUtilities.dp(26.0f), this.timeX);
                        }
                        if (this.isAvatarVisible) {
                            this.timeX += AndroidUtilities.dp(48.0f);
                        }
                        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
                        if (!(groupedMessagePosition == null || (i14 = groupedMessagePosition.leftSpanOffset) == 0)) {
                            this.timeX += (int) Math.ceil((i14 / 1000.0f) * getGroupPhotosWidth());
                        }
                        if (!(this.captionLayout == null || this.currentPosition == null)) {
                            this.timeX += AndroidUtilities.dp(4.0f);
                        }
                    }
                    if (SharedConfig.bubbleRadius >= 10 && this.captionLayout == null && (i13 = this.documentAttachType) != 7 && i13 != 6) {
                        this.timeX -= AndroidUtilities.dp(2.0f);
                    }
                } else if (this.currentMessageObject.isOutOwner()) {
                    this.timeX = (this.layoutWidth - this.timeWidth) - AndroidUtilities.dp(38.5f);
                } else {
                    this.timeX = (this.backgroundWidth - AndroidUtilities.dp(9.0f)) - this.timeWidth;
                    if (this.currentMessageObject.isAnyKindOfSticker()) {
                        this.timeX = Math.max(0, this.timeX);
                    }
                    if (this.isAvatarVisible) {
                        this.timeX += AndroidUtilities.dp(48.0f);
                    }
                    if (shouldDrawTimeOnMedia()) {
                        this.timeX -= AndroidUtilities.dp(7.0f);
                    }
                }
                this.timeX -= getExtraTimeX();
                if ((this.currentMessageObject.messageOwner.flags & 1024) != 0) {
                    this.viewsLayout = new StaticLayout(this.currentViewsString, Theme.chat_timePaint, this.viewsTextWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else {
                    this.viewsLayout = null;
                }
                if (this.currentRepliesString == null || this.currentMessageObject.scheduled) {
                    this.repliesLayout = null;
                } else {
                    this.repliesLayout = new StaticLayout(this.currentRepliesString, Theme.chat_timePaint, this.repliesTextWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                if (this.isAvatarVisible) {
                    this.avatarImage.setImageCoords(AndroidUtilities.dp(6.0f), this.avatarImage.getImageY(), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
                }
                this.wasLayout = true;
            }
            this.lastSize = measuredHeight;
            if (this.currentMessageObject.type == 0) {
                this.textY = AndroidUtilities.dp(10.0f) + this.namesOffset;
            }
            if (this.isRoundVideo) {
                updatePlayingMessageProgress();
            }
            int i16 = this.documentAttachType;
            if (i16 == 3) {
                if (this.currentMessageObject.isOutOwner()) {
                    this.seekBarX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(57.0f);
                    this.buttonX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(14.0f);
                    this.timeAudioX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(67.0f);
                } else if (!this.isChat || this.isThreadPost || !this.currentMessageObject.needDrawAvatar()) {
                    this.seekBarX = AndroidUtilities.dp(66.0f);
                    this.buttonX = AndroidUtilities.dp(23.0f);
                    this.timeAudioX = AndroidUtilities.dp(76.0f);
                } else {
                    this.seekBarX = AndroidUtilities.dp(114.0f);
                    this.buttonX = AndroidUtilities.dp(71.0f);
                    this.timeAudioX = AndroidUtilities.dp(124.0f);
                }
                if (this.hasLinkPreview) {
                    this.seekBarX += AndroidUtilities.dp(10.0f);
                    this.buttonX += AndroidUtilities.dp(10.0f);
                    this.timeAudioX += AndroidUtilities.dp(10.0f);
                }
                this.seekBarWaveform.setSize(this.backgroundWidth - AndroidUtilities.dp((this.hasLinkPreview ? 10 : 0) + 92), AndroidUtilities.dp(30.0f));
                SeekBar seekBar = this.seekBar;
                int i17 = this.backgroundWidth;
                if (!this.hasLinkPreview) {
                    i15 = 0;
                }
                seekBar.setSize(i17 - AndroidUtilities.dp(i15 + 72), AndroidUtilities.dp(30.0f));
                this.seekBarY = AndroidUtilities.dp(13.0f) + this.namesOffset + this.mediaOffsetY;
                int dp = AndroidUtilities.dp(13.0f) + this.namesOffset + this.mediaOffsetY;
                this.buttonY = dp;
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i18 = this.buttonX;
                radialProgress2.setProgressRect(i18, dp, AndroidUtilities.dp(44.0f) + i18, this.buttonY + AndroidUtilities.dp(44.0f));
                updatePlayingMessageProgress();
            } else if (i16 == 5) {
                if (this.currentMessageObject.isOutOwner()) {
                    this.seekBarX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(56.0f);
                    this.buttonX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(14.0f);
                    this.timeAudioX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(67.0f);
                } else if (!this.isChat || this.isThreadPost || !this.currentMessageObject.needDrawAvatar()) {
                    this.seekBarX = AndroidUtilities.dp(65.0f);
                    this.buttonX = AndroidUtilities.dp(23.0f);
                    this.timeAudioX = AndroidUtilities.dp(76.0f);
                } else {
                    this.seekBarX = AndroidUtilities.dp(113.0f);
                    this.buttonX = AndroidUtilities.dp(71.0f);
                    this.timeAudioX = AndroidUtilities.dp(124.0f);
                }
                if (this.hasLinkPreview) {
                    this.seekBarX += AndroidUtilities.dp(10.0f);
                    this.buttonX += AndroidUtilities.dp(10.0f);
                    this.timeAudioX += AndroidUtilities.dp(10.0f);
                }
                SeekBar seekBar2 = this.seekBar;
                int i19 = this.backgroundWidth;
                if (!this.hasLinkPreview) {
                    i15 = 0;
                }
                seekBar2.setSize(i19 - AndroidUtilities.dp(i15 + 65), AndroidUtilities.dp(30.0f));
                this.seekBarY = AndroidUtilities.dp(29.0f) + this.namesOffset + this.mediaOffsetY;
                int dp2 = AndroidUtilities.dp(13.0f) + this.namesOffset + this.mediaOffsetY;
                this.buttonY = dp2;
                RadialProgress2 radialProgress22 = this.radialProgress;
                int i20 = this.buttonX;
                radialProgress22.setProgressRect(i20, dp2, AndroidUtilities.dp(44.0f) + i20, this.buttonY + AndroidUtilities.dp(44.0f));
                updatePlayingMessageProgress();
            } else if (i16 != 1 || this.drawPhotoImage) {
                MessageObject messageObject = this.currentMessageObject;
                int i21 = messageObject.type;
                if (i21 == 12) {
                    if (messageObject.isOutOwner()) {
                        i12 = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(14.0f);
                    } else if (!this.isChat || this.isThreadPost || !this.currentMessageObject.needDrawAvatar()) {
                        i12 = AndroidUtilities.dp(23.0f);
                    } else {
                        i12 = AndroidUtilities.dp(72.0f);
                    }
                    this.photoImage.setImageCoords(i12, AndroidUtilities.dp(13.0f) + this.namesOffset, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f));
                    return;
                }
                if (i21 != 0 || (!this.hasLinkPreview && !this.hasGamePreview && !this.hasInvoicePreview)) {
                    if (!messageObject.isOutOwner()) {
                        if (!this.isChat || !this.isAvatarVisible || this.isPlayingRound) {
                            i5 = AndroidUtilities.dp(15.0f);
                        } else {
                            i5 = AndroidUtilities.dp(63.0f);
                        }
                        MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.currentPosition;
                        if (groupedMessagePosition2 != null && !groupedMessagePosition2.edge) {
                            i9 = AndroidUtilities.dp(10.0f);
                        }
                    } else if (this.mediaBackground) {
                        i5 = this.layoutWidth - this.backgroundWidth;
                        i9 = AndroidUtilities.dp(3.0f);
                    } else {
                        i8 = this.layoutWidth - this.backgroundWidth;
                        i7 = AndroidUtilities.dp(6.0f);
                        i5 = i8 + i7;
                    }
                    i5 -= i9;
                } else {
                    if (this.hasGamePreview) {
                        i8 = this.unmovedTextX - AndroidUtilities.dp(10.0f);
                    } else {
                        if (this.hasInvoicePreview) {
                            i11 = this.unmovedTextX;
                            i10 = AndroidUtilities.dp(1.0f);
                        } else {
                            i11 = this.unmovedTextX;
                            i10 = AndroidUtilities.dp(1.0f);
                        }
                        i8 = i11 + i10;
                    }
                    if (this.isSmallImage) {
                        i5 = i8 + this.backgroundWidth;
                        i9 = AndroidUtilities.dp(81.0f);
                        i5 -= i9;
                    } else {
                        i7 = this.hasInvoicePreview ? -AndroidUtilities.dp(6.3f) : AndroidUtilities.dp(10.0f);
                        i5 = i8 + i7;
                    }
                }
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = this.currentPosition;
                if (groupedMessagePosition3 != null) {
                    if ((groupedMessagePosition3.flags & 1) == 0) {
                        i5 -= AndroidUtilities.dp(2.0f);
                    }
                    if (this.currentPosition.leftSpanOffset != 0) {
                        i5 += (int) Math.ceil((i6 / 1000.0f) * getGroupPhotosWidth());
                    }
                }
                if (this.currentMessageObject.type != 0) {
                    i5 -= AndroidUtilities.dp(2.0f);
                }
                TransitionParams transitionParams = this.transitionParams;
                if (!transitionParams.imageChangeBoundsTransition || transitionParams.updatePhotoImageX) {
                    transitionParams.updatePhotoImageX = false;
                    ImageReceiver imageReceiver = this.photoImage;
                    imageReceiver.setImageCoords(i5, imageReceiver.getImageY(), this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
                }
                this.buttonX = (int) (i5 + ((this.photoImage.getImageWidth() - AndroidUtilities.dp(48.0f)) / 2.0f));
                int imageY = (int) (this.photoImage.getImageY() + ((this.photoImage.getImageHeight() - AndroidUtilities.dp(48.0f)) / 2.0f));
                this.buttonY = imageY;
                RadialProgress2 radialProgress23 = this.radialProgress;
                int i22 = this.buttonX;
                radialProgress23.setProgressRect(i22, imageY, AndroidUtilities.dp(48.0f) + i22, this.buttonY + AndroidUtilities.dp(48.0f));
                this.deleteProgressRect.set(this.buttonX + AndroidUtilities.dp(5.0f), this.buttonY + AndroidUtilities.dp(5.0f), this.buttonX + AndroidUtilities.dp(43.0f), this.buttonY + AndroidUtilities.dp(43.0f));
                int i23 = this.documentAttachType;
                if (i23 == 4 || i23 == 2) {
                    this.videoButtonX = (int) (this.photoImage.getImageX() + AndroidUtilities.dp(8.0f));
                    int imageY2 = (int) (this.photoImage.getImageY() + AndroidUtilities.dp(8.0f));
                    this.videoButtonY = imageY2;
                    RadialProgress2 radialProgress24 = this.videoRadialProgress;
                    int i24 = this.videoButtonX;
                    radialProgress24.setProgressRect(i24, imageY2, AndroidUtilities.dp(24.0f) + i24, this.videoButtonY + AndroidUtilities.dp(24.0f));
                }
            } else {
                if (this.currentMessageObject.isOutOwner()) {
                    this.buttonX = (this.layoutWidth - this.backgroundWidth) + AndroidUtilities.dp(14.0f);
                } else if (!this.isChat || this.isThreadPost || !this.currentMessageObject.needDrawAvatar()) {
                    this.buttonX = AndroidUtilities.dp(23.0f);
                } else {
                    this.buttonX = AndroidUtilities.dp(71.0f);
                }
                if (this.hasLinkPreview) {
                    this.buttonX += AndroidUtilities.dp(10.0f);
                }
                int dp3 = AndroidUtilities.dp(13.0f) + this.namesOffset + this.mediaOffsetY;
                this.buttonY = dp3;
                RadialProgress2 radialProgress25 = this.radialProgress;
                int i25 = this.buttonX;
                radialProgress25.setProgressRect(i25, dp3, AndroidUtilities.dp(44.0f) + i25, this.buttonY + AndroidUtilities.dp(44.0f));
                this.photoImage.setImageCoords(this.buttonX - AndroidUtilities.dp(10.0f), this.buttonY - AndroidUtilities.dp(10.0f), this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
            }
        }
    }

    public boolean needDelayRoundProgressDraw() {
        int i = this.documentAttachType;
        return (i == 7 || i == 4) && this.currentMessageObject.type != 5 && MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
    }

    public void drawRoundProgress(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawRoundProgress(android.graphics.Canvas):void");
    }

    private void updatePollAnimations(long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.updatePollAnimations(long):void");
    }

    private void drawContent(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawContent(android.graphics.Canvas):void");
    }

    public void updateReactionLayoutPosition() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.updateReactionLayoutPosition():void");
    }

    public void drawLinkPreview(Canvas canvas, float f) {
        int dp;
        int i;
        int dp2;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r11;
        Drawable drawable;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        int i10;
        int i11;
        int i12;
        Paint paint;
        if (this.currentMessageObject.isSponsored() || this.hasLinkPreview || this.hasGamePreview || this.hasInvoicePreview) {
            if (this.hasGamePreview) {
                dp = AndroidUtilities.dp(14.0f) + this.namesOffset;
                i2 = this.unmovedTextX - AndroidUtilities.dp(10.0f);
            } else {
                if (this.hasInvoicePreview) {
                    dp = AndroidUtilities.dp(14.0f) + this.namesOffset;
                    i = this.unmovedTextX;
                    dp2 = AndroidUtilities.dp(1.0f);
                } else if (this.currentMessageObject.isSponsored()) {
                    dp = (this.textY + this.currentMessageObject.textHeight) - AndroidUtilities.dp(2.0f);
                    if (this.hasNewLineForTime) {
                        dp += AndroidUtilities.dp(16.0f);
                    }
                    i = this.unmovedTextX;
                    dp2 = AndroidUtilities.dp(1.0f);
                } else {
                    dp = this.textY + this.currentMessageObject.textHeight + AndroidUtilities.dp(8.0f);
                    i = this.unmovedTextX;
                    dp2 = AndroidUtilities.dp(1.0f);
                }
                i2 = i + dp2;
            }
            int i13 = dp;
            int i14 = i2;
            if (!this.hasInvoicePreview && !this.currentMessageObject.isSponsored()) {
                Theme.chat_replyLinePaint.setColor(getThemedColor(this.currentMessageObject.isOutOwner() ? "chat_outPreviewLine" : "chat_inPreviewLine"));
                if (f != 1.0f) {
                    Theme.chat_replyLinePaint.setAlpha((int) (paint.getAlpha() * f));
                }
                canvas.drawRect(i14, i13 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + i14, this.linkPreviewHeight + i13 + AndroidUtilities.dp(3.0f), Theme.chat_replyLinePaint);
            }
            if (this.siteNameLayout != null) {
                i3 = i13 - AndroidUtilities.dp(1.0f);
                Theme.chat_replyNamePaint.setColor(getThemedColor(this.currentMessageObject.isOutOwner() ? "chat_outSiteNameText" : "chat_inSiteNameText"));
                if (f != 1.0f) {
                    Theme.chat_replyNamePaint.setAlpha((int) (Theme.chat_replyLinePaint.getAlpha() * f));
                }
                canvas.save();
                if (this.siteNameRtl) {
                    i12 = (this.backgroundWidth - this.siteNameWidth) - AndroidUtilities.dp(32.0f);
                    if (this.isSmallImage) {
                        i12 -= AndroidUtilities.dp(54.0f);
                    }
                } else {
                    i12 = this.hasInvoicePreview ? 0 : AndroidUtilities.dp(10.0f);
                }
                canvas.translate(i12 + i14, i13 - AndroidUtilities.dp(3.0f));
                this.siteNameLayout.draw(canvas);
                canvas.restore();
                StaticLayout staticLayout = this.siteNameLayout;
                i4 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + i13;
            } else {
                i4 = i13;
                i3 = 0;
            }
            if ((this.hasGamePreview || this.hasInvoicePreview) && (i11 = this.currentMessageObject.textHeight) != 0) {
                i13 += i11 + AndroidUtilities.dp(4.0f);
                i4 += this.currentMessageObject.textHeight + AndroidUtilities.dp(4.0f);
            }
            if ((!this.drawPhotoImage || !this.drawInstantView || (i10 = this.drawInstantViewType) == 9 || i10 == 13 || i10 == 11 || i10 == 1) && (this.drawInstantViewType != 6 || this.imageBackgroundColor == 0)) {
                r11 = 1;
                i5 = 0;
            } else {
                if (i4 != i13) {
                    i4 += AndroidUtilities.dp(2.0f);
                }
                int i15 = i4;
                if (this.imageBackgroundSideColor != 0) {
                    int dp3 = AndroidUtilities.dp(10.0f) + i14;
                    ImageReceiver imageReceiver = this.photoImage;
                    float f2 = dp3;
                    imageReceiver.setImageCoords(((this.imageBackgroundSideWidth - imageReceiver.getImageWidth()) / 2.0f) + f2, i15, this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
                    this.rect.set(f2, this.photoImage.getImageY(), dp3 + this.imageBackgroundSideWidth, this.photoImage.getImageY2());
                    Theme.chat_instantViewPaint.setColor(ColorUtils.setAlphaComponent(this.imageBackgroundSideColor, (int) (f * 255.0f)));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_instantViewPaint);
                } else {
                    this.photoImage.setImageCoords(AndroidUtilities.dp(10.0f) + i14, i15, this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
                }
                if (this.imageBackgroundColor != 0) {
                    this.rect.set(this.photoImage.getImageX(), this.photoImage.getImageY(), this.photoImage.getImageX2(), this.photoImage.getImageY2());
                    if (this.imageBackgroundGradientColor1 == 0) {
                        Theme.chat_instantViewPaint.setShader(null);
                        Theme.chat_instantViewPaint.setColor(this.imageBackgroundColor);
                        if (f != 1.0f) {
                            Theme.chat_instantViewPaint.setAlpha((int) (f * 255.0f));
                        }
                    } else if (this.imageBackgroundGradientColor2 == 0) {
                        if (this.gradientShader == null) {
                            Rect gradientPoints = BackgroundGradientDrawable.getGradientPoints(AndroidUtilities.getWallpaperRotation(this.imageBackgroundGradientRotation, false), (int) this.rect.width(), (int) this.rect.height());
                            this.gradientShader = new LinearGradient(gradientPoints.left, gradientPoints.top, gradientPoints.right, gradientPoints.bottom, new int[]{this.imageBackgroundColor, this.imageBackgroundGradientColor1}, (float[]) null, Shader.TileMode.CLAMP);
                        }
                        Theme.chat_instantViewPaint.setShader(this.gradientShader);
                        if (f != 1.0f) {
                            Theme.chat_instantViewPaint.setAlpha((int) (f * 255.0f));
                        }
                    } else if (this.motionBackgroundDrawable == null) {
                        MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(this.imageBackgroundColor, this.imageBackgroundGradientColor1, this.imageBackgroundGradientColor2, this.imageBackgroundGradientColor3, true);
                        this.motionBackgroundDrawable = motionBackgroundDrawable;
                        if (this.imageBackgroundIntensity < 0.0f) {
                            this.photoImage.setGradientBitmap(motionBackgroundDrawable.getBitmap());
                        }
                        if (!this.photoImage.hasImageSet()) {
                            this.motionBackgroundDrawable.setRoundRadius(AndroidUtilities.dp(4.0f));
                        }
                    }
                    MotionBackgroundDrawable motionBackgroundDrawable2 = this.motionBackgroundDrawable;
                    if (motionBackgroundDrawable2 != null) {
                        RectF rectF = this.rect;
                        motionBackgroundDrawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        this.motionBackgroundDrawable.draw(canvas);
                        i9 = i15;
                        z2 = true;
                        i5 = 0;
                    } else if (this.imageBackgroundSideColor != 0) {
                        i9 = i15;
                        i5 = 0;
                        z2 = true;
                        canvas.drawRect(this.photoImage.getImageX(), this.photoImage.getImageY(), this.photoImage.getImageX2(), this.photoImage.getImageY2(), Theme.chat_instantViewPaint);
                    } else {
                        i9 = i15;
                        z2 = true;
                        i5 = 0;
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_instantViewPaint);
                    }
                    Theme.chat_instantViewPaint.setShader(null);
                    Theme.chat_instantViewPaint.setAlpha(255);
                    z = z2;
                } else {
                    i9 = i15;
                    z = true;
                    i5 = 0;
                }
                if (this.drawPhotoImage && this.drawInstantView && this.drawInstantViewType != 9) {
                    if (this.drawImageButton) {
                        int dp4 = AndroidUtilities.dp(48.0f);
                        float f3 = dp4;
                        int imageX = (int) (this.photoImage.getImageX() + ((this.photoImage.getImageWidth() - f3) / 2.0f));
                        this.buttonX = imageX;
                        this.buttonX = imageX;
                        int imageY = (int) (this.photoImage.getImageY() + ((this.photoImage.getImageHeight() - f3) / 2.0f));
                        this.buttonY = imageY;
                        this.buttonY = imageY;
                        RadialProgress2 radialProgress2 = this.radialProgress;
                        int i16 = this.buttonX;
                        radialProgress2.setProgressRect(i16, imageY, i16 + dp4, dp4 + imageY);
                    }
                    ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                    if (chatMessageCellDelegate == null || chatMessageCellDelegate.getPinchToZoomHelper() == null || !this.delegate.getPinchToZoomHelper().isInOverlayModeFor(this)) {
                        if (f != 1.0f) {
                            this.photoImage.setAlpha(f);
                            this.imageDrawn = this.photoImage.draw(canvas);
                            this.photoImage.setAlpha(1.0f);
                        } else {
                            this.imageDrawn = this.photoImage.draw(canvas);
                        }
                    }
                }
                i4 = (int) (i9 + this.photoImage.getImageHeight() + AndroidUtilities.dp(6.0f));
                r11 = z;
            }
            if (this.currentMessageObject.isOutOwner()) {
                int i17 = (int) (f * 255.0f);
                Theme.chat_replyNamePaint.setColor(ColorUtils.setAlphaComponent(getThemedColor("chat_messageTextOut"), i17));
                Theme.chat_replyTextPaint.setColor(ColorUtils.setAlphaComponent(getThemedColor("chat_messageTextOut"), i17));
            } else {
                int i18 = (int) (f * 255.0f);
                Theme.chat_replyNamePaint.setColor(ColorUtils.setAlphaComponent(getThemedColor("chat_messageTextIn"), i18));
                Theme.chat_replyTextPaint.setColor(ColorUtils.setAlphaComponent(getThemedColor("chat_messageTextIn"), i18));
            }
            if (this.titleLayout != null) {
                if (i4 != i13) {
                    i4 += AndroidUtilities.dp(2.0f);
                }
                if (i3 == 0) {
                    i3 = i4 - AndroidUtilities.dp(1.0f);
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dp(10.0f) + i14 + this.titleX, i4 - AndroidUtilities.dp(3.0f));
                this.titleLayout.draw(canvas);
                canvas.restore();
                StaticLayout staticLayout2 = this.titleLayout;
                i4 += staticLayout2.getLineBottom(staticLayout2.getLineCount() - r11);
            }
            if (this.authorLayout != null) {
                if (i4 != i13) {
                    i4 += AndroidUtilities.dp(2.0f);
                }
                if (i3 == 0) {
                    i3 = i4 - AndroidUtilities.dp(1.0f);
                }
                canvas.save();
                canvas.translate(AndroidUtilities.dp(10.0f) + i14 + this.authorX, i4 - AndroidUtilities.dp(3.0f));
                this.authorLayout.draw(canvas);
                canvas.restore();
                StaticLayout staticLayout3 = this.authorLayout;
                i4 += staticLayout3.getLineBottom(staticLayout3.getLineCount() - r11);
            }
            if (this.descriptionLayout != null) {
                if (i4 != i13) {
                    i4 += AndroidUtilities.dp(2.0f);
                }
                if (i3 == 0) {
                    i3 = i4 - AndroidUtilities.dp(1.0f);
                }
                this.descriptionY = i4 - AndroidUtilities.dp(3.0f);
                canvas.save();
                canvas.translate((this.hasInvoicePreview ? 0 : AndroidUtilities.dp(10.0f)) + i14 + this.descriptionX, this.descriptionY);
                if (this.linkBlockNum == -10 && this.links.draw(canvas)) {
                    invalidate();
                }
                ChatMessageCellDelegate chatMessageCellDelegate2 = this.delegate;
                if (!(chatMessageCellDelegate2 == null || chatMessageCellDelegate2.getTextSelectionHelper() == null || !getDelegate().getTextSelectionHelper().isSelected(this.currentMessageObject))) {
                    this.delegate.getTextSelectionHelper().drawDescription(this.currentMessageObject.isOutOwner(), this.descriptionLayout, canvas);
                }
                this.descriptionLayout.draw(canvas);
                canvas.restore();
                StaticLayout staticLayout4 = this.descriptionLayout;
                int lineCount = staticLayout4.getLineCount();
                int i19 = r11 == true ? 1 : 0;
                int i20 = r11 == true ? 1 : 0;
                int i21 = r11 == true ? 1 : 0;
                int i22 = r11 == true ? 1 : 0;
                int i23 = r11 == true ? 1 : 0;
                int i24 = r11 == true ? 1 : 0;
                int i25 = r11 == true ? 1 : 0;
                i4 += staticLayout4.getLineBottom(lineCount - i19);
            }
            int i26 = i3;
            if (this.drawPhotoImage && (!this.drawInstantView || (i8 = this.drawInstantViewType) == 9 || i8 == 11 || i8 == 13 || i8 == r11)) {
                if (i4 != i13) {
                    i4 += AndroidUtilities.dp(2.0f);
                }
                if (this.isSmallImage) {
                    this.photoImage.setImageCoords((this.backgroundWidth + i14) - AndroidUtilities.dp(81.0f), i26, this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
                } else {
                    this.photoImage.setImageCoords((this.hasInvoicePreview ? -AndroidUtilities.dp(6.3f) : AndroidUtilities.dp(10.0f)) + i14, i4, this.photoImage.getImageWidth(), this.photoImage.getImageHeight());
                    if (this.drawImageButton) {
                        int dp5 = AndroidUtilities.dp(48.0f);
                        float f4 = dp5;
                        int imageX2 = (int) (this.photoImage.getImageX() + ((this.photoImage.getImageWidth() - f4) / 2.0f));
                        this.buttonX = imageX2;
                        this.buttonX = imageX2;
                        int imageY2 = (int) (this.photoImage.getImageY() + ((this.photoImage.getImageHeight() - f4) / 2.0f));
                        this.buttonY = imageY2;
                        this.buttonY = imageY2;
                        RadialProgress2 radialProgress22 = this.radialProgress;
                        int i27 = this.buttonX;
                        radialProgress22.setProgressRect(i27, imageY2, i27 + dp5, dp5 + imageY2);
                    }
                }
                if (!this.isRoundVideo || !MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || !MediaController.getInstance().isVideoDrawingReady() || !canvas.isHardwareAccelerated()) {
                    ChatMessageCellDelegate chatMessageCellDelegate3 = this.delegate;
                    if (chatMessageCellDelegate3 == null || chatMessageCellDelegate3.getPinchToZoomHelper() == null || !this.delegate.getPinchToZoomHelper().isInOverlayModeFor(this)) {
                        if (f != 1.0f) {
                            this.photoImage.setAlpha(f);
                            this.imageDrawn = this.photoImage.draw(canvas);
                            this.photoImage.setAlpha(1.0f);
                        } else {
                            this.imageDrawn = this.photoImage.draw(canvas);
                        }
                    }
                } else {
                    this.imageDrawn = r11;
                    this.drawTime = r11;
                }
            }
            int i28 = this.documentAttachType;
            if (i28 == 4 || i28 == 2) {
                this.videoButtonX = (int) (this.photoImage.getImageX() + AndroidUtilities.dp(8.0f));
                int imageY3 = (int) (this.photoImage.getImageY() + AndroidUtilities.dp(8.0f));
                this.videoButtonY = imageY3;
                RadialProgress2 radialProgress23 = this.videoRadialProgress;
                int i29 = this.videoButtonX;
                radialProgress23.setProgressRect(i29, imageY3, AndroidUtilities.dp(24.0f) + i29, this.videoButtonY + AndroidUtilities.dp(24.0f));
            }
            Paint themedPaint = getThemedPaint("paintChatTimeBackground");
            if (this.photosCountLayout != null && this.photoImage.getVisible()) {
                int imageX3 = (int) (((this.photoImage.getImageX() + this.photoImage.getImageWidth()) - AndroidUtilities.dp(8.0f)) - this.photosCountWidth);
                int imageY4 = (int) ((this.photoImage.getImageY() + this.photoImage.getImageHeight()) - AndroidUtilities.dp(19.0f));
                this.rect.set(imageX3 - AndroidUtilities.dp(4.0f), imageY4 - AndroidUtilities.dp(1.5f), this.photosCountWidth + imageX3 + AndroidUtilities.dp(4.0f), imageY4 + AndroidUtilities.dp(14.5f));
                int alpha = themedPaint.getAlpha();
                themedPaint.setAlpha((int) (alpha * this.controlsAlpha));
                Theme.chat_durationPaint.setAlpha((int) (this.controlsAlpha * 255.0f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), themedPaint);
                themedPaint.setAlpha(alpha);
                canvas.save();
                canvas.translate(imageX3, imageY4);
                this.photosCountLayout.draw(canvas);
                canvas.restore();
                Theme.chat_durationPaint.setAlpha(255);
            }
            if (this.videoInfoLayout != null && ((!this.drawPhotoImage || this.photoImage.getVisible()) && this.imageBackgroundSideColor == 0)) {
                if (!this.hasGamePreview && !this.hasInvoicePreview && this.documentAttachType != 8) {
                    i6 = (int) (((this.photoImage.getImageX() + this.photoImage.getImageWidth()) - AndroidUtilities.dp(8.0f)) - this.durationWidth);
                    int imageY5 = (int) ((this.photoImage.getImageY() + this.photoImage.getImageHeight()) - AndroidUtilities.dp(19.0f));
                    this.rect.set(i6 - AndroidUtilities.dp(4.0f), imageY5 - AndroidUtilities.dp(1.5f), this.durationWidth + i6 + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.5f) + imageY5);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), getThemedPaint("paintChatTimeBackground"));
                    i7 = imageY5;
                } else if (this.drawPhotoImage) {
                    i6 = (int) (this.photoImage.getImageX() + AndroidUtilities.dp(8.5f));
                    i7 = (int) (this.photoImage.getImageY() + AndroidUtilities.dp(6.0f));
                    this.rect.set(i6 - AndroidUtilities.dp(4.0f), i7 - AndroidUtilities.dp(1.5f), this.durationWidth + i6 + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(this.documentAttachType == 8 ? 14.5f : 16.5f) + i7);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), themedPaint);
                } else {
                    i7 = i4;
                    i6 = i14;
                }
                canvas.save();
                canvas.translate(i6, i7);
                if (this.hasInvoicePreview) {
                    if (this.drawPhotoImage) {
                        Theme.chat_shipmentPaint.setColor(getThemedColor("chat_previewGameText"));
                    } else if (this.currentMessageObject.isOutOwner()) {
                        Theme.chat_shipmentPaint.setColor(getThemedColor("chat_messageTextOut"));
                    } else {
                        Theme.chat_shipmentPaint.setColor(getThemedColor("chat_messageTextIn"));
                    }
                }
                this.videoInfoLayout.draw(canvas);
                canvas.restore();
            }
            if (this.drawInstantView) {
                int dp6 = i13 + this.linkPreviewHeight + AndroidUtilities.dp(10.0f);
                Paint paint2 = Theme.chat_instantViewRectPaint;
                if (this.currentMessageObject.isOutOwner()) {
                    drawable = getThemedDrawable("drawableMsgOutInstant");
                    Theme.chat_instantViewPaint.setColor(getThemedColor("chat_outPreviewInstantText"));
                    paint2.setColor(getThemedColor("chat_outPreviewInstantText"));
                } else {
                    drawable = Theme.chat_msgInInstantDrawable;
                    Theme.chat_instantViewPaint.setColor(getThemedColor("chat_inPreviewInstantText"));
                    paint2.setColor(getThemedColor("chat_inPreviewInstantText"));
                }
                this.instantButtonRect.set(i14, dp6, this.instantWidth + i14, AndroidUtilities.dp(36.0f) + dp6);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.selectorDrawableMaskType[i5] = i5;
                    this.selectorDrawable[i5].setBounds(i14, dp6, this.instantWidth + i14, AndroidUtilities.dp(36.0f) + dp6);
                    this.selectorDrawable[i5].draw(canvas);
                }
                canvas.drawRoundRect(this.instantButtonRect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
                if (this.drawInstantViewType == 0) {
                    BaseCell.setDrawableBounds(drawable, ((this.instantTextLeftX + this.instantTextX) + i14) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(11.5f) + dp6, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(13.0f));
                    drawable.draw(canvas);
                }
                if (this.instantViewLayout != null) {
                    canvas.save();
                    canvas.translate(i14 + this.instantTextX, dp6 + AndroidUtilities.dp(10.5f));
                    this.instantViewLayout.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public boolean shouldDrawMenuDrawable() {
        return this.currentMessagesGroup == null || (this.currentPosition.flags & 4) != 0;
    }

    private void drawBotButtons(Canvas canvas, ArrayList<BotButton> arrayList, float f) {
        int dp;
        BotButton botButton;
        Drawable drawable;
        if (this.currentMessageObject.isOutOwner()) {
            dp = (getMeasuredWidth() - this.widthForButtons) - AndroidUtilities.dp(10.0f);
        } else {
            dp = this.backgroundDrawableLeft + AndroidUtilities.dp((this.mediaBackground || this.drawPinnedBottom) ? 1.0f : 7.0f);
        }
        int i = dp;
        float f2 = 2.0f;
        float dp2 = (this.layoutHeight - AndroidUtilities.dp(2.0f)) + this.transitionParams.deltaBottom;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            BotButton botButton2 = arrayList.get(i2);
            float f4 = botButton2.y + botButton2.height;
            if (f4 > f3) {
                f3 = f4;
            }
        }
        this.rect.set(0.0f, dp2, getMeasuredWidth(), f3 + dp2);
        if (f != 1.0f) {
            canvas.saveLayerAlpha(this.rect, (int) (f * 255.0f), 31);
        } else {
            canvas.save();
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            BotButton botButton3 = arrayList.get(i3);
            float dp3 = ((botButton3.y + this.layoutHeight) - AndroidUtilities.dp(f2)) + this.transitionParams.deltaBottom;
            this.rect.set(botButton3.x + i, dp3, botButton3.x + i + botButton3.width, botButton3.height + dp3);
            applyServiceShaderMatrix();
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), getThemedPaint(i3 == this.pressedBotButton ? "paintChatActionBackgroundSelected" : "paintChatActionBackground"));
            if (hasGradientService()) {
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            canvas.save();
            boolean z = true;
            canvas.translate(botButton3.x + i + AndroidUtilities.dp(5.0f), ((AndroidUtilities.dp(44.0f) - botButton3.title.getLineBottom(botButton3.title.getLineCount() - 1)) / 2) + dp3);
            botButton3.title.draw(canvas);
            canvas.restore();
            if (botButton3.button instanceof TLRPC$TL_keyboardButtonWebView) {
                Drawable themedDrawable = getThemedDrawable("drawableBotWebView");
                BaseCell.setDrawableBounds(themedDrawable, (((botButton3.x + botButton3.width) - AndroidUtilities.dp(3.0f)) - themedDrawable.getIntrinsicWidth()) + i, dp3 + AndroidUtilities.dp(3.0f));
                themedDrawable.draw(canvas);
            } else if (botButton3.button instanceof TLRPC$TL_keyboardButtonUrl) {
                if (botButton3.isInviteButton) {
                    drawable = getThemedDrawable("drawable_botInvite");
                } else {
                    drawable = getThemedDrawable("drawableBotLink");
                }
                BaseCell.setDrawableBounds(drawable, (((botButton3.x + botButton3.width) - AndroidUtilities.dp(3.0f)) - drawable.getIntrinsicWidth()) + i, dp3 + AndroidUtilities.dp(3.0f));
                drawable.draw(canvas);
            } else if (botButton3.button instanceof TLRPC$TL_keyboardButtonSwitchInline) {
                Drawable themedDrawable2 = getThemedDrawable("drawableBotInline");
                BaseCell.setDrawableBounds(themedDrawable2, (((botButton3.x + botButton3.width) - AndroidUtilities.dp(3.0f)) - themedDrawable2.getIntrinsicWidth()) + i, dp3 + AndroidUtilities.dp(3.0f));
                themedDrawable2.draw(canvas);
            } else if ((botButton3.button instanceof TLRPC$TL_keyboardButtonCallback) || (botButton3.button instanceof TLRPC$TL_keyboardButtonRequestGeoLocation) || (botButton3.button instanceof TLRPC$TL_keyboardButtonGame) || (botButton3.button instanceof TLRPC$TL_keyboardButtonBuy) || (botButton3.button instanceof TLRPC$TL_keyboardButtonUrlAuth)) {
                if (botButton3.button instanceof TLRPC$TL_keyboardButtonBuy) {
                    BaseCell.setDrawableBounds(Theme.chat_botCardDrawable, (((botButton3.x + botButton3.width) - AndroidUtilities.dp(5.0f)) - Theme.chat_botCardDrawable.getIntrinsicWidth()) + i, AndroidUtilities.dp(4.0f) + dp3);
                    Theme.chat_botCardDrawable.draw(canvas);
                }
                if (((!(botButton3.button instanceof TLRPC$TL_keyboardButtonCallback) && !(botButton3.button instanceof TLRPC$TL_keyboardButtonGame) && !(botButton3.button instanceof TLRPC$TL_keyboardButtonBuy) && !(botButton3.button instanceof TLRPC$TL_keyboardButtonUrlAuth)) || !SendMessagesHelper.getInstance(this.currentAccount).isSendingCallback(this.currentMessageObject, botButton3.button)) && (!(botButton3.button instanceof TLRPC$TL_keyboardButtonRequestGeoLocation) || !SendMessagesHelper.getInstance(this.currentAccount).isSendingCurrentLocation(this.currentMessageObject, botButton3.button))) {
                    z = false;
                }
                if (z || botButton3.progressAlpha != 0.0f) {
                    Theme.chat_botProgressPaint.setAlpha(Math.min(255, (int) (botButton3.progressAlpha * 255.0f)));
                    int dp4 = ((botButton3.x + botButton3.width) - AndroidUtilities.dp(12.0f)) + i;
                    if (botButton3.button instanceof TLRPC$TL_keyboardButtonBuy) {
                        dp3 += AndroidUtilities.dp(26.0f);
                    }
                    this.rect.set(dp4, AndroidUtilities.dp(4.0f) + dp3, dp4 + AndroidUtilities.dp(8.0f), dp3 + AndroidUtilities.dp(12.0f));
                    canvas.drawArc(this.rect, botButton3.angle, 220.0f, false, Theme.chat_botProgressPaint);
                    invalidate();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (Math.abs(botButton3.lastUpdateTime - System.currentTimeMillis()) < 1000) {
                        long j = currentTimeMillis - botButton3.lastUpdateTime;
                        botButton = botButton3;
                        BotButton.access$2816(botButton, ((float) (360 * j)) / 2000.0f);
                        BotButton.access$2820(botButton, (botButton.angle / 360) * 360);
                        if (z) {
                            if (botButton.progressAlpha < 1.0f) {
                                BotButton.access$2716(botButton, ((float) j) / 200.0f);
                                if (botButton.progressAlpha > 1.0f) {
                                    botButton.progressAlpha = 1.0f;
                                }
                            }
                        } else if (botButton.progressAlpha > 0.0f) {
                            BotButton.access$2724(botButton, ((float) j) / 200.0f);
                            if (botButton.progressAlpha < 0.0f) {
                                botButton.progressAlpha = 0.0f;
                            }
                        }
                    } else {
                        botButton = botButton3;
                    }
                    botButton.lastUpdateTime = currentTimeMillis;
                }
            }
            i3++;
            f2 = 2.0f;
        }
        canvas.restore();
    }

    @android.annotation.SuppressLint({"Range"})
    public void drawMessageText(android.graphics.Canvas r25, java.util.ArrayList<org.telegram.messenger.MessageObject.TextLayoutBlock> r26, boolean r27, float r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawMessageText(android.graphics.Canvas, java.util.ArrayList, boolean, float, boolean):void");
    }

    public void updateCaptionLayout() {
        float f;
        float f2;
        float f3;
        MessageObject messageObject = this.currentMessageObject;
        int i = messageObject.type;
        if (i == 1 || this.documentAttachType == 4 || i == 8) {
            TransitionParams transitionParams = this.transitionParams;
            if (transitionParams.imageChangeBoundsTransition) {
                f2 = transitionParams.animateToImageX;
                f = transitionParams.animateToImageY;
                f3 = transitionParams.animateToImageH;
            } else {
                f2 = this.photoImage.getImageX();
                f = this.photoImage.getImageY();
                f3 = this.photoImage.getImageHeight();
            }
            this.captionX = f2 + AndroidUtilities.dp(5.0f) + this.captionOffsetX;
            this.captionY = f + f3 + AndroidUtilities.dp(6.0f);
        } else {
            float f4 = 41.3f;
            float f5 = 9.0f;
            float f6 = 11.0f;
            if (this.hasOldCaptionPreview) {
                int i2 = this.backgroundDrawableLeft;
                if (!messageObject.isOutOwner()) {
                    f6 = 17.0f;
                }
                this.captionX = i2 + AndroidUtilities.dp(f6) + this.captionOffsetX;
                int i3 = this.totalHeight - this.captionHeight;
                if (!this.drawPinnedTop) {
                    f5 = 10.0f;
                }
                float dp = ((i3 - AndroidUtilities.dp(f5)) - this.linkPreviewHeight) - AndroidUtilities.dp(17.0f);
                this.captionY = dp;
                if (this.drawCommentButton && this.drawSideButton != 3) {
                    if (!shouldDrawTimeOnMedia()) {
                        f4 = 43.0f;
                    }
                    this.captionY = dp - AndroidUtilities.dp(f4);
                }
            } else {
                int i4 = this.backgroundDrawableLeft;
                if (!messageObject.isOutOwner() && !this.mediaBackground && !this.drawPinnedBottom) {
                    f6 = 17.0f;
                }
                this.captionX = i4 + AndroidUtilities.dp(f6) + this.captionOffsetX;
                int i5 = this.totalHeight - this.captionHeight;
                if (!this.drawPinnedTop) {
                    f5 = 10.0f;
                }
                float dp2 = i5 - AndroidUtilities.dp(f5);
                this.captionY = dp2;
                if (this.drawCommentButton && this.drawSideButton != 3) {
                    if (!shouldDrawTimeOnMedia()) {
                        f4 = 43.0f;
                    }
                    this.captionY = dp2 - AndroidUtilities.dp(f4);
                }
                ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                if (!reactionsLayoutInBubble.isEmpty && !reactionsLayoutInBubble.isSmall) {
                    this.captionY -= reactionsLayoutInBubble.totalHeight;
                }
            }
        }
        this.captionX += getExtraTextX();
    }

    private boolean textIsSelectionMode() {
        return getCurrentMessagesGroup() == null && this.delegate.getTextSelectionHelper() != null && this.delegate.getTextSelectionHelper().isSelected(this.currentMessageObject);
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
        int i = this.documentAttachType;
        if (i == 3 || i == 5) {
            if (this.currentMessageObject.isOutOwner()) {
                this.radialProgress.setColors("chat_outLoader", "chat_outLoaderSelected", "chat_outMediaIcon", "chat_outMediaIconSelected");
            } else {
                this.radialProgress.setColors("chat_inLoader", "chat_inLoaderSelected", "chat_inMediaIcon", "chat_inMediaIconSelected");
            }
            int i2 = this.buttonState;
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
            return i2 == 4 ? 3 : 0;
        }
        if (i != 1 || this.drawPhotoImage) {
            this.radialProgress.setColors("chat_mediaLoaderPhoto", "chat_mediaLoaderPhotoSelected", "chat_mediaLoaderPhotoIcon", "chat_mediaLoaderPhotoIconSelected");
            this.videoRadialProgress.setColors("chat_mediaLoaderPhoto", "chat_mediaLoaderPhotoSelected", "chat_mediaLoaderPhotoIcon", "chat_mediaLoaderPhotoIconSelected");
            int i3 = this.buttonState;
            if (i3 < 0 || i3 >= 4) {
                if (i3 == -1) {
                    if (this.documentAttachType == 1) {
                        if (this.drawPhotoImage && !(this.currentPhotoObject == null && this.currentPhotoObjectThumb == null)) {
                            if (this.photoImage.hasBitmapImage()) {
                                return 4;
                            }
                            MessageObject messageObject = this.currentMessageObject;
                            if (messageObject.mediaExists || messageObject.attachPathExists) {
                                return 4;
                            }
                        }
                        return 5;
                    } else if (this.currentMessageObject.needDrawBluredPreview()) {
                        MessageObject messageObject2 = this.currentMessageObject;
                        if (messageObject2.messageOwner.destroyTime != 0) {
                            return messageObject2.isOutOwner() ? 9 : 11;
                        }
                        return 7;
                    } else if (this.hasEmbed) {
                        return 0;
                    }
                }
            } else if (i3 == 0) {
                return 2;
            } else {
                if (i3 == 1) {
                    return 3;
                }
                return (i3 != 2 && this.autoPlayingMedia) ? 4 : 0;
            }
        } else {
            if (this.currentMessageObject.isOutOwner()) {
                this.radialProgress.setColors("chat_outLoader", "chat_outLoaderSelected", "chat_outMediaIcon", "chat_outMediaIconSelected");
            } else {
                this.radialProgress.setColors("chat_inLoader", "chat_inLoaderSelected", "chat_inMediaIcon", "chat_inMediaIconSelected");
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
        }
        return 4;
    }

    private int getMaxNameWidth() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.getMaxNameWidth():int");
    }

    public void updateButtonState(boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.updateButtonState(boolean, boolean, boolean):void");
    }

    private void didPressMiniButton(boolean z) {
        int i = this.miniButtonState;
        if (i == 0) {
            this.miniButtonState = 1;
            this.radialProgress.setProgress(0.0f, false);
            this.currentMessageObject.putInDownloadsStore = true;
            int i2 = this.documentAttachType;
            if (i2 == 3 || i2 == 5) {
                FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 1, 0);
                this.currentMessageObject.loadingCancelled = false;
            } else if (i2 == 4) {
                createLoadingProgressLayout(this.documentAttach);
                FileLoader fileLoader = FileLoader.getInstance(this.currentAccount);
                TLRPC$Document tLRPC$Document = this.documentAttach;
                MessageObject messageObject = this.currentMessageObject;
                fileLoader.loadFile(tLRPC$Document, messageObject, 1, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
                this.currentMessageObject.loadingCancelled = false;
            }
            this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, true);
            invalidate();
        } else if (i == 1) {
            int i3 = this.documentAttachType;
            if ((i3 == 3 || i3 == 5) && MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                MediaController.getInstance().cleanupPlayer(true, true);
            }
            this.miniButtonState = 0;
            this.currentMessageObject.loadingCancelled = true;
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.documentAttach);
            this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, true);
            invalidate();
        }
    }

    private void didPressButton(boolean z, boolean z2) {
        String str;
        TLRPC$PhotoSize tLRPC$PhotoSize;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            messageObject.putInDownloadsStore = true;
        }
        int i = this.buttonState;
        int i2 = 2;
        if (i == 0 && (!this.drawVideoImageButton || z2)) {
            int i3 = this.documentAttachType;
            if (i3 == 3 || i3 == 5) {
                if (this.miniButtonState == 0) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 1, 0);
                    this.currentMessageObject.loadingCancelled = false;
                }
                if (this.delegate.needPlayMessage(this.currentMessageObject)) {
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
            if (this.currentPhotoObject == null || (!this.photoImage.hasNotThumb() && this.currentPhotoObjectThumb != null)) {
                tLRPC$PhotoSize = this.currentPhotoObjectThumb;
                str = this.currentPhotoFilterThumb;
            } else {
                tLRPC$PhotoSize = this.currentPhotoObject;
                str = ((tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize) || "s".equals(tLRPC$PhotoSize.type)) ? this.currentPhotoFilterThumb : this.currentPhotoFilter;
            }
            String str2 = str;
            MessageObject messageObject2 = this.currentMessageObject;
            int i4 = messageObject2.type;
            if (i4 == 1) {
                this.photoImage.setForceLoading(true);
                ImageReceiver imageReceiver = this.photoImage;
                ImageLocation forObject = ImageLocation.getForObject(this.currentPhotoObject, this.photoParentObject);
                String str3 = this.currentPhotoFilter;
                ImageLocation forObject2 = ImageLocation.getForObject(this.currentPhotoObjectThumb, this.photoParentObject);
                String str4 = this.currentPhotoFilterThumb;
                BitmapDrawable bitmapDrawable = this.currentPhotoObjectThumbStripped;
                int i5 = this.currentPhotoObject.size;
                MessageObject messageObject3 = this.currentMessageObject;
                imageReceiver.setImage(forObject, str3, forObject2, str4, bitmapDrawable, i5, null, messageObject3, messageObject3.shouldEncryptPhotoOrVideo() ? 2 : 0);
            } else if (i4 == 8) {
                FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 1, 0);
                if (this.currentMessageObject.loadedFileSize > 0) {
                    createLoadingProgressLayout(this.documentAttach);
                }
            } else if (this.isRoundVideo) {
                if (messageObject2.isSecretMedia()) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.currentMessageObject.getDocument(), this.currentMessageObject, 1, 1);
                } else {
                    MessageObject messageObject4 = this.currentMessageObject;
                    messageObject4.gifState = 2.0f;
                    TLRPC$Document document = messageObject4.getDocument();
                    this.photoImage.setForceLoading(true);
                    this.photoImage.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForObject(tLRPC$PhotoSize, document), str2, document.size, null, this.currentMessageObject, 0);
                }
            } else if (i4 == 9) {
                FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 1, 0);
                if (this.currentMessageObject.loadedFileSize > 0) {
                    createLoadingProgressLayout(this.documentAttach);
                }
            } else {
                int i6 = this.documentAttachType;
                if (i6 == 4) {
                    FileLoader fileLoader = FileLoader.getInstance(this.currentAccount);
                    TLRPC$Document tLRPC$Document = this.documentAttach;
                    MessageObject messageObject5 = this.currentMessageObject;
                    if (!messageObject5.shouldEncryptPhotoOrVideo()) {
                        i2 = 0;
                    }
                    fileLoader.loadFile(tLRPC$Document, messageObject5, 1, i2);
                    MessageObject messageObject6 = this.currentMessageObject;
                    if (messageObject6.loadedFileSize > 0) {
                        createLoadingProgressLayout(messageObject6.getDocument());
                    }
                } else if (i4 != 0 || i6 == 0) {
                    this.photoImage.setForceLoading(true);
                    this.photoImage.setImage(ImageLocation.getForObject(this.currentPhotoObject, this.photoParentObject), this.currentPhotoFilter, ImageLocation.getForObject(this.currentPhotoObjectThumb, this.photoParentObject), this.currentPhotoFilterThumb, this.currentPhotoObjectThumbStripped, 0, null, this.currentMessageObject, 0);
                } else if (i6 == 2) {
                    this.photoImage.setForceLoading(true);
                    this.photoImage.setImage(ImageLocation.getForDocument(this.documentAttach), null, ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), this.currentPhotoFilterThumb, this.documentAttach.size, null, this.currentMessageObject, 0);
                    MessageObject messageObject7 = this.currentMessageObject;
                    messageObject7.gifState = 2.0f;
                    if (messageObject7.loadedFileSize > 0) {
                        createLoadingProgressLayout(messageObject7.getDocument());
                    }
                } else if (i6 == 1) {
                    FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 0, 0);
                } else if (i6 == 8) {
                    this.photoImage.setImage(ImageLocation.getForDocument(this.documentAttach), this.currentPhotoFilter, ImageLocation.getForDocument(this.currentPhotoObject, this.documentAttach), "b1", 0, "jpg", this.currentMessageObject, 1);
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
            int i7 = this.documentAttachType;
            if (i7 == 3 || i7 == 5) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                }
            } else if (!this.currentMessageObject.isOut() || this.drawVideoImageButton || (!this.currentMessageObject.isSending() && !this.currentMessageObject.isEditing())) {
                MessageObject messageObject8 = this.currentMessageObject;
                messageObject8.loadingCancelled = true;
                int i8 = this.documentAttachType;
                if (i8 == 2 || i8 == 4 || i8 == 1 || i8 == 8) {
                    FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.documentAttach);
                } else {
                    int i9 = messageObject8.type;
                    if (i9 == 0 || i9 == 1 || i9 == 8 || i9 == 5) {
                        ImageLoader.getInstance().cancelForceLoadingForImageReceiver(this.photoImage);
                        this.photoImage.cancelLoadImage();
                    } else if (i9 == 9) {
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
            } else if (this.radialProgress.getIcon() != 6) {
                this.delegate.didPressCancelSendButton(this);
            }
        } else if (i == 2) {
            int i10 = this.documentAttachType;
            if (i10 == 3 || i10 == 5) {
                this.radialProgress.setProgress(0.0f, false);
                FileLoader.getInstance(this.currentAccount).loadFile(this.documentAttach, this.currentMessageObject, 1, 0);
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
        } else if (i == 3 || i == 0) {
            if (this.hasMiniProgress == 2 && this.miniButtonState != 1) {
                this.miniButtonState = 1;
                this.radialProgress.setProgress(0.0f, false);
                this.radialProgress.setMiniIcon(getMiniIconForCurrentState(), false, z);
            }
            this.delegate.didPressImage(this, 0.0f, 0.0f);
        } else if (i == 4) {
            int i11 = this.documentAttachType;
            if (i11 != 3 && i11 != 5) {
                return;
            }
            if ((!messageObject.isOut() || (!this.currentMessageObject.isSending() && !this.currentMessageObject.isEditing())) && !this.currentMessageObject.isSendError()) {
                this.currentMessageObject.loadingCancelled = true;
                FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.documentAttach);
                this.buttonState = 2;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
            } else if (this.delegate != null && this.radialProgress.getIcon() != 6) {
                this.delegate.didPressCancelSendButton(this);
            }
        }
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        int i = this.documentAttachType;
        updateButtonState(true, i == 3 || i == 5, false);
    }

    @Override
    public void onSuccessDownload(java.lang.String r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.onSuccessDownload(java.lang.String):void");
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        int i;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && z) {
            if (!setCurrentDiceValue(!z3 && !messageObject.wasUnread) && !z2) {
                MessageObject messageObject2 = this.currentMessageObject;
                if (!messageObject2.mediaExists && !messageObject2.attachPathExists) {
                    int i2 = messageObject2.type;
                    if ((i2 == 0 && ((i = this.documentAttachType) == 8 || i == 0 || i == 6)) || i2 == 1) {
                        messageObject2.mediaExists = true;
                        updateButtonState(false, true, false);
                    }
                }
            }
        }
    }

    public boolean setCurrentDiceValue(boolean z) {
        MessagesController.DiceFrameSuccess diceFrameSuccess;
        if (!this.currentMessageObject.isDice()) {
            return false;
        }
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
                            rLottieDrawable.setOnFinishCallback(this.diceFinishCallback, ConnectionsManager.DEFAULT_DATACENTER_ID);
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
        createLoadingProgressLayout(j, j2);
    }

    private void createLoadingProgressLayout(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            long[] fileProgressSizes = ImageLoader.getInstance().getFileProgressSizes(FileLoader.getDocumentFileName(tLRPC$Document));
            if (fileProgressSizes != null) {
                createLoadingProgressLayout(fileProgressSizes[0], fileProgressSizes[1]);
            } else {
                createLoadingProgressLayout(this.currentMessageObject.loadedFileSize, tLRPC$Document.size);
            }
        }
    }

    private void createLoadingProgressLayout(long r17, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.createLoadingProgressLayout(long, long):void");
    }

    @Override
    public void onProvideStructure(ViewStructure viewStructure) {
        super.onProvideStructure(viewStructure);
        if (this.allowAssistant && Build.VERSION.SDK_INT >= 23) {
            CharSequence charSequence = this.currentMessageObject.messageText;
            if (charSequence == null || charSequence.length() <= 0) {
                CharSequence charSequence2 = this.currentMessageObject.caption;
                if (charSequence2 != null && charSequence2.length() > 0) {
                    viewStructure.setText(this.currentMessageObject.caption);
                    return;
                }
                return;
            }
            viewStructure.setText(this.currentMessageObject.messageText);
        }
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

    private Integer getSelectionOverlayColor() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider == null) {
            return null;
        }
        MessageObject messageObject = this.currentMessageObject;
        return resourcesProvider.getColor((messageObject == null || !messageObject.isOut()) ? "chat_inBubbleSelectedOverlay" : "chat_outBubbleSelectedOverlay");
    }

    private boolean hasSelectionOverlay() {
        Integer selectionOverlayColor = getSelectionOverlayColor();
        return (selectionOverlayColor == null || selectionOverlayColor.intValue() == -65536) ? false : true;
    }

    private boolean isDrawSelectionBackground() {
        return ((isPressed() && this.isCheckPressed) || ((!this.isCheckPressed && this.isPressed) || this.isHighlighted)) && !textIsSelectionMode() && !hasSelectionOverlay();
    }

    public boolean isOpenChatByShare(MessageObject messageObject) {
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
        return (tLRPC$MessageFwdHeader == null || tLRPC$MessageFwdHeader.saved_from_peer == null) ? false : true;
    }

    private boolean checkNeedDrawShareButton(MessageObject messageObject) {
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2.deleted || messageObject2.isSponsored()) {
            return false;
        }
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition == null || this.currentMessagesGroup.isDocuments || groupedMessagePosition.last) {
            return messageObject.needDrawShareButton();
        }
        return false;
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
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.currentMessageObject.messageOwner.fwd_from;
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (tLRPC$MessageFwdHeader != null && (tLRPC$MessageFwdHeader.from_id instanceof TLRPC$TL_peerChannel) && this.currentMessageObject.getDialogId() == clientUserId) {
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tLRPC$MessageFwdHeader.from_id.channel_id));
        } else if (tLRPC$MessageFwdHeader != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.saved_from_peer) != null) {
            long j = tLRPC$Peer.user_id;
            if (j != 0) {
                TLRPC$Peer tLRPC$Peer2 = tLRPC$MessageFwdHeader.from_id;
                if (tLRPC$Peer2 instanceof TLRPC$TL_peerUser) {
                    this.currentUser = messagesController.getUser(Long.valueOf(tLRPC$Peer2.user_id));
                } else {
                    this.currentUser = messagesController.getUser(Long.valueOf(j));
                }
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
        } else if (tLRPC$MessageFwdHeader == null || TextUtils.isEmpty(tLRPC$MessageFwdHeader.from_name) || (!tLRPC$MessageFwdHeader.imported && this.currentMessageObject.getDialogId() != clientUserId)) {
            long fromChatId = this.currentMessageObject.getFromChatId();
            if (DialogObject.isUserDialog(fromChatId) && !this.currentMessageObject.messageOwner.post) {
                this.currentUser = messagesController.getUser(Long.valueOf(fromChatId));
            } else if (DialogObject.isChatDialog(fromChatId)) {
                this.currentChat = messagesController.getChat(Long.valueOf(-fromChatId));
            } else {
                TLRPC$Message tLRPC$Message = this.currentMessageObject.messageOwner;
                if (tLRPC$Message.post) {
                    this.currentChat = messagesController.getChat(Long.valueOf(tLRPC$Message.peer_id.channel_id));
                }
            }
        } else {
            TLRPC$TL_user tLRPC$TL_user = new TLRPC$TL_user();
            this.currentUser = tLRPC$TL_user;
            tLRPC$TL_user.first_name = tLRPC$MessageFwdHeader.from_name;
        }
    }

    private void setMessageObjectInternal(org.telegram.messenger.MessageObject r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setMessageObjectInternal(org.telegram.messenger.MessageObject):void");
    }

    private boolean isNeedAuthorName() {
        return (this.isPinnedChat && this.currentMessageObject.type == 0) || ((!this.pinnedTop || (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup)) && this.drawName && this.isChat && (!this.currentMessageObject.isOutOwner() || (this.currentMessageObject.isSupergroup() && this.currentMessageObject.isFromGroup()))) || (this.currentMessageObject.isImportedForward() && this.currentMessageObject.messageOwner.fwd_from.from_id == null);
    }

    private String getAuthorName() {
        TLRPC$Chat tLRPC$Chat;
        String str;
        String str2;
        TLRPC$User tLRPC$User = this.currentUser;
        if (tLRPC$User != null) {
            return UserObject.getUserName(tLRPC$User);
        }
        TLRPC$Chat tLRPC$Chat2 = this.currentChat;
        if (tLRPC$Chat2 != null) {
            return tLRPC$Chat2.title;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isSponsored()) {
            return "DELETED";
        }
        TLRPC$ChatInvite tLRPC$ChatInvite = this.currentMessageObject.sponsoredChatInvite;
        return (tLRPC$ChatInvite == null || (str2 = tLRPC$ChatInvite.title) == null) ? (tLRPC$ChatInvite == null || (tLRPC$Chat = tLRPC$ChatInvite.chat) == null || (str = tLRPC$Chat.title) == null) ? "" : str : str2;
    }

    private String getForwardedMessageText(MessageObject messageObject) {
        if (!this.hasPsaHint) {
            return LocaleController.getString("ForwardedMessage", R.string.ForwardedMessage);
        }
        String string = LocaleController.getString("PsaMessage_" + messageObject.messageOwner.fwd_from.psa_type);
        return string == null ? LocaleController.getString("PsaMessageDefault", R.string.PsaMessageDefault) : string;
    }

    public int getExtraInsetHeight() {
        int i = this.addedCaptionHeight;
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
        return this.captionX;
    }

    public boolean isDrawPinnedBottom() {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        return this.mediaBackground || this.drawPinnedBottom || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && this.currentMessagesGroup.isDocuments);
    }

    public void drawCheckBox(Canvas canvas) {
        float f;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && !messageObject.isSending() && !this.currentMessageObject.isSendError() && this.checkBox != null) {
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
                if (groupedMessages == null || groupedMessages.messages.size() <= 1) {
                    f = y + this.transitionParams.deltaTop;
                } else {
                    f = (getTop() + this.currentMessagesGroup.transitionParams.offsetTop) - getTranslationY();
                }
                canvas.translate(0.0f, f + this.transitionYOffsetForDrawables);
                this.checkBox.draw(canvas);
                canvas.restore();
            }
        }
    }

    public void setBackgroundTopY(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.setBackgroundTopY(boolean):void");
    }

    public void setBackgroundTopY(int i) {
        int i2;
        int i3;
        Theme.MessageDrawable messageDrawable = this.currentBackgroundDrawable;
        int i4 = this.parentWidth;
        int i5 = this.parentHeight;
        if (i5 == 0) {
            i4 = getParentWidth();
            i5 = AndroidUtilities.displaySize.y;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                i3 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                float f = this.parentViewTopOffset;
                messageDrawable.setTop((int) (i + f), i3, i2, (int) f, this.blurredViewTopOffset, this.blurredViewBottomOffset, this.pinnedTop, !this.pinnedBottom || this.transitionParams.changePinnedBottomProgress != 1.0f);
            }
        }
        i2 = i5;
        i3 = i4;
        float f2 = this.parentViewTopOffset;
        messageDrawable.setTop((int) (i + f2), i3, i2, (int) f2, this.blurredViewTopOffset, this.blurredViewBottomOffset, this.pinnedTop, !this.pinnedBottom || this.transitionParams.changePinnedBottomProgress != 1.0f);
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

    @Override
    @SuppressLint({"WrongCall"})
    protected void onDraw(Canvas canvas) {
        int i;
        boolean z;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        Theme.MessageDrawable messageDrawable;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.currentMessageObject != null) {
            boolean z2 = this.wasLayout;
            if (z2 || this.animationRunning) {
                if (!z2) {
                    onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                }
                if (this.currentMessageObject.isOutOwner()) {
                    Theme.chat_msgTextPaint.setColor(getThemedColor("chat_messageTextOut"));
                    Theme.chat_msgGameTextPaint.setColor(getThemedColor("chat_messageTextOut"));
                    Theme.chat_msgGameTextPaint.linkColor = getThemedColor("chat_messageLinkOut");
                    Theme.chat_replyTextPaint.linkColor = getThemedColor("chat_messageLinkOut");
                    Theme.chat_msgTextPaint.linkColor = getThemedColor("chat_messageLinkOut");
                } else {
                    Theme.chat_msgTextPaint.setColor(getThemedColor("chat_messageTextIn"));
                    Theme.chat_msgGameTextPaint.setColor(getThemedColor("chat_messageTextIn"));
                    Theme.chat_msgGameTextPaint.linkColor = getThemedColor("chat_messageLinkIn");
                    Theme.chat_replyTextPaint.linkColor = getThemedColor("chat_messageLinkIn");
                    Theme.chat_msgTextPaint.linkColor = getThemedColor("chat_messageLinkIn");
                }
                if (this.documentAttach != null) {
                    int i6 = this.documentAttachType;
                    if (i6 == 3) {
                        if (this.currentMessageObject.isOutOwner()) {
                            this.seekBarWaveform.setColors(getThemedColor("chat_outVoiceSeekbar"), getThemedColor("chat_outVoiceSeekbarFill"), getThemedColor("chat_outVoiceSeekbarSelected"));
                            this.seekBar.setColors(getThemedColor("chat_outAudioSeekbar"), getThemedColor("chat_outAudioCacheSeekbar"), getThemedColor("chat_outAudioSeekbarFill"), getThemedColor("chat_outAudioSeekbarFill"), getThemedColor("chat_outAudioSeekbarSelected"));
                        } else {
                            this.seekBarWaveform.setColors(getThemedColor("chat_inVoiceSeekbar"), getThemedColor("chat_inVoiceSeekbarFill"), getThemedColor("chat_inVoiceSeekbarSelected"));
                            this.seekBar.setColors(getThemedColor("chat_inAudioSeekbar"), getThemedColor("chat_inAudioCacheSeekbar"), getThemedColor("chat_inAudioSeekbarFill"), getThemedColor("chat_inAudioSeekbarFill"), getThemedColor("chat_inAudioSeekbarSelected"));
                        }
                    } else if (i6 == 5) {
                        if (this.currentMessageObject.isOutOwner()) {
                            this.seekBar.setColors(getThemedColor("chat_outAudioSeekbar"), getThemedColor("chat_outAudioCacheSeekbar"), getThemedColor("chat_outAudioSeekbarFill"), getThemedColor("chat_outAudioSeekbarFill"), getThemedColor("chat_outAudioSeekbarSelected"));
                        } else {
                            this.seekBar.setColors(getThemedColor("chat_inAudioSeekbar"), getThemedColor("chat_inAudioCacheSeekbar"), getThemedColor("chat_inAudioSeekbarFill"), getThemedColor("chat_inAudioSeekbarFill"), getThemedColor("chat_inAudioSeekbarSelected"));
                        }
                    }
                }
                MessageObject messageObject = this.currentMessageObject;
                if (messageObject.type == 5) {
                    Theme.chat_timePaint.setColor(getThemedColor("chat_serviceText"));
                } else if (this.mediaBackground) {
                    if (messageObject.shouldDrawWithoutBackground()) {
                        Theme.chat_timePaint.setColor(getThemedColor("chat_serviceText"));
                    } else {
                        Theme.chat_timePaint.setColor(getThemedColor("chat_mediaTimeText"));
                    }
                } else if (messageObject.isOutOwner()) {
                    Theme.chat_timePaint.setColor(getThemedColor(isDrawSelectionBackground() ? "chat_outTimeSelectedText" : "chat_outTimeText"));
                } else {
                    Theme.chat_timePaint.setColor(getThemedColor(isDrawSelectionBackground() ? "chat_inTimeSelectedText" : "chat_inTimeText"));
                }
                drawBackgroundInternal(canvas, false);
                long j = 17;
                if (this.isHighlightedAnimated) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long abs = Math.abs(currentTimeMillis - this.lastHighlightProgressTime);
                    if (abs > 17) {
                        abs = 17;
                    }
                    int i7 = (int) (this.highlightProgress - abs);
                    this.highlightProgress = i7;
                    this.lastHighlightProgressTime = currentTimeMillis;
                    if (i7 <= 0) {
                        this.highlightProgress = 0;
                        this.isHighlightedAnimated = false;
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
                    int i8 = this.parentHeight;
                    if (y > i8) {
                        i4 = (int) (i8 - getY());
                    }
                    this.rect.set(i3, i5, i2, i4);
                    i = canvas.saveLayerAlpha(this.rect, (int) (this.alphaInternal * 255.0f), 31);
                } else {
                    i = Integer.MIN_VALUE;
                }
                if (!this.transitionParams.animateBackgroundBoundsInner || (messageDrawable = this.currentBackgroundDrawable) == null || this.isRoundVideo) {
                    z = false;
                } else {
                    Rect bounds = messageDrawable.getBounds();
                    canvas.save();
                    canvas.clipRect(bounds.left + AndroidUtilities.dp(4.0f), bounds.top + AndroidUtilities.dp(4.0f), bounds.right - AndroidUtilities.dp(4.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
                    z = true;
                }
                drawContent(canvas);
                if (z) {
                    canvas.restore();
                }
                ChatMessageCellDelegate chatMessageCellDelegate = this.delegate;
                if (chatMessageCellDelegate == null || chatMessageCellDelegate.canDrawOutboundsContent() || getAlpha() != 1.0f) {
                    drawOutboundsContent(canvas);
                }
                if (this.replyNameLayout != null) {
                    float f = 12.0f;
                    if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                        if (this.currentMessageObject.isOutOwner()) {
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
                            this.replyStartY = this.forwardNameY + AndroidUtilities.dp(38.0f);
                        } else {
                            this.replyStartY = AndroidUtilities.dp(12.0f);
                        }
                    } else {
                        if (this.currentMessageObject.isOutOwner()) {
                            this.replyStartX = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                        } else if (this.mediaBackground) {
                            this.replyStartX = this.backgroundDrawableLeft + AndroidUtilities.dp(12.0f) + getExtraTextX();
                        } else {
                            int i9 = this.backgroundDrawableLeft;
                            if (!this.drawPinnedBottom) {
                                f = 18.0f;
                            }
                            this.replyStartX = i9 + AndroidUtilities.dp(f) + getExtraTextX();
                        }
                        this.replyStartY = AndroidUtilities.dp(12 + ((!this.drawForwardedName || this.forwardedNameLayout[0] == null) ? 0 : 36) + ((!this.drawNameLayout || this.nameLayout == null) ? 0 : 20));
                    }
                }
                if (this.currentPosition == null && !this.transitionParams.animateBackgroundBoundsInner && (!this.enterTransitionInProgress || this.currentMessageObject.isVoice())) {
                    drawNamesLayout(canvas, 1.0f);
                }
                if ((!this.autoPlayingMedia || !MediaController.getInstance().isPlayingMessageAndReadyToDraw(this.currentMessageObject) || this.isRoundVideo) && !this.transitionParams.animateBackgroundBoundsInner) {
                    drawOverlays(canvas);
                }
                if ((this.drawTime || !this.mediaBackground) && !this.forceNotDrawTime && !this.transitionParams.animateBackgroundBoundsInner && (!this.enterTransitionInProgress || this.currentMessageObject.isVoice())) {
                    drawTime(canvas, 1.0f, false);
                }
                if (!((this.controlsAlpha == 1.0f && this.timeAlpha == 1.0f) || this.currentMessageObject.type == 5)) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long abs2 = Math.abs(this.lastControlsAlphaChangeTime - currentTimeMillis2);
                    if (abs2 <= 17) {
                        j = abs2;
                    }
                    long j2 = this.totalChangeTime + j;
                    this.totalChangeTime = j2;
                    if (j2 > 100) {
                        this.totalChangeTime = 100L;
                    }
                    this.lastControlsAlphaChangeTime = currentTimeMillis2;
                    if (this.controlsAlpha != 1.0f) {
                        this.controlsAlpha = AndroidUtilities.decelerateInterpolator.getInterpolation(((float) this.totalChangeTime) / 100.0f);
                    }
                    if (this.timeAlpha != 1.0f) {
                        this.timeAlpha = AndroidUtilities.decelerateInterpolator.getInterpolation(((float) this.totalChangeTime) / 100.0f);
                    }
                    invalidate();
                    if (this.forceNotDrawTime && (groupedMessagePosition = this.currentPosition) != null && groupedMessagePosition.last && getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                }
                if (this.drawBackground && shouldDrawSelectionOverlay() && this.currentMessagesGroup == null) {
                    if (this.selectionOverlayPaint == null) {
                        this.selectionOverlayPaint = new Paint(1);
                    }
                    this.selectionOverlayPaint.setColor(getSelectionOverlayColor().intValue());
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
                if (i != Integer.MIN_VALUE) {
                    canvas.restoreToCount(i);
                }
                updateSelectionTextPosition();
                return;
            }
            forceLayout();
        }
    }

    @SuppressLint({"WrongCall"})
    public void drawBackgroundInternal(Canvas canvas, boolean z) {
        float f;
        Drawable drawable;
        boolean z2;
        Theme.MessageDrawable messageDrawable;
        int i;
        int i2;
        MessageObject.GroupedMessages groupedMessages;
        int i3;
        int i4;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        Drawable drawable2;
        int i5;
        int i6;
        int i7;
        int i8;
        Drawable drawable3;
        int i9;
        int i10;
        int i11;
        int i12;
        if (this.currentMessageObject != null) {
            boolean z3 = this.wasLayout;
            if (z3 || this.animationRunning) {
                if (!z3) {
                    onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                }
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.currentPosition;
                boolean z4 = groupedMessagePosition2 != null && (groupedMessagePosition2.flags & 8) == 0 && this.currentMessagesGroup.isDocuments && !this.drawPinnedBottom;
                if (this.currentMessageObject.isOutOwner()) {
                    if (this.transitionParams.changePinnedBottomProgress < 1.0f || this.mediaBackground || this.drawPinnedBottom || z4) {
                        this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgOutMedia");
                        this.currentBackgroundSelectedDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgOutMediaSelected");
                        this.transitionParams.drawPinnedBottomBackground = true;
                    } else {
                        this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgOut");
                        this.currentBackgroundSelectedDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgOutSelected");
                        this.transitionParams.drawPinnedBottomBackground = false;
                    }
                    setBackgroundTopY(true);
                    if (!isDrawSelectionBackground() || (this.currentPosition != null && getBackground() == null)) {
                        drawable3 = this.currentBackgroundDrawable.getShadowDrawable();
                    } else {
                        drawable3 = this.currentBackgroundSelectedDrawable.getShadowDrawable();
                    }
                    Drawable drawable4 = drawable3;
                    this.backgroundDrawableLeft = (this.layoutWidth - this.backgroundWidth) - (!this.mediaBackground ? 0 : AndroidUtilities.dp(9.0f));
                    int dp = this.backgroundWidth - (this.mediaBackground ? 0 : AndroidUtilities.dp(3.0f));
                    this.backgroundDrawableRight = dp;
                    MessageObject.GroupedMessages groupedMessages2 = this.currentMessagesGroup;
                    if (groupedMessages2 != null && !groupedMessages2.isDocuments && !this.currentPosition.edge) {
                        this.backgroundDrawableRight = dp + AndroidUtilities.dp(10.0f);
                    }
                    int i13 = this.backgroundDrawableLeft;
                    if (z4 || this.transitionParams.changePinnedBottomProgress == 1.0f) {
                        if (!this.mediaBackground && this.drawPinnedBottom) {
                            this.backgroundDrawableRight -= AndroidUtilities.dp(6.0f);
                        }
                    } else if (!this.mediaBackground) {
                        this.backgroundDrawableRight -= AndroidUtilities.dp(6.0f);
                    }
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = this.currentPosition;
                    if (groupedMessagePosition3 != null) {
                        if ((groupedMessagePosition3.flags & 2) == 0) {
                            this.backgroundDrawableRight += AndroidUtilities.dp(SharedConfig.bubbleRadius + 2);
                        }
                        if ((this.currentPosition.flags & 1) == 0) {
                            i13 -= AndroidUtilities.dp(SharedConfig.bubbleRadius + 2);
                            this.backgroundDrawableRight += AndroidUtilities.dp(SharedConfig.bubbleRadius + 2);
                        }
                        if ((this.currentPosition.flags & 4) == 0) {
                            i11 = 0 - AndroidUtilities.dp(SharedConfig.bubbleRadius + 3);
                            i10 = AndroidUtilities.dp(SharedConfig.bubbleRadius + 3) + 0;
                        } else {
                            i11 = 0;
                            i10 = 0;
                        }
                        if ((this.currentPosition.flags & 8) == 0) {
                            i10 += AndroidUtilities.dp(SharedConfig.bubbleRadius + 3);
                        }
                        i9 = i13;
                    } else {
                        i9 = i13;
                        i11 = 0;
                        i10 = 0;
                    }
                    boolean z5 = this.drawPinnedBottom;
                    if (z5 && this.drawPinnedTop) {
                        i12 = 0;
                    } else if (z5) {
                        i12 = AndroidUtilities.dp(1.0f);
                    } else {
                        i12 = AndroidUtilities.dp(2.0f);
                    }
                    int dp2 = i11 + (this.drawPinnedTop ? 0 : AndroidUtilities.dp(1.0f));
                    this.backgroundDrawableTop = dp2;
                    int i14 = (this.layoutHeight - i12) + i10;
                    if (z4) {
                        setDrawableBoundsInner(this.currentBackgroundDrawable, i9, dp2 - i11, this.backgroundDrawableRight, (i14 - i10) + 10);
                        setDrawableBoundsInner(this.currentBackgroundSelectedDrawable, this.backgroundDrawableLeft, this.backgroundDrawableTop, this.backgroundDrawableRight - AndroidUtilities.dp(6.0f), i14);
                    } else {
                        int i15 = i9;
                        setDrawableBoundsInner(this.currentBackgroundDrawable, i15, dp2, this.backgroundDrawableRight, i14);
                        setDrawableBoundsInner(this.currentBackgroundSelectedDrawable, i15, this.backgroundDrawableTop, this.backgroundDrawableRight, i14);
                    }
                    setDrawableBoundsInner(drawable4, i9, this.backgroundDrawableTop, this.backgroundDrawableRight, i14);
                    drawable = drawable4;
                    f = 1.0f;
                } else {
                    f = 1.0f;
                    if (this.transitionParams.changePinnedBottomProgress < 1.0f || this.mediaBackground || this.drawPinnedBottom || z4) {
                        this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgInMedia");
                        this.currentBackgroundSelectedDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgInMediaSelected");
                        this.transitionParams.drawPinnedBottomBackground = true;
                    } else {
                        this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgIn");
                        this.currentBackgroundSelectedDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgInSelected");
                        this.transitionParams.drawPinnedBottomBackground = false;
                    }
                    setBackgroundTopY(true);
                    if (!isDrawSelectionBackground() || (this.currentPosition != null && getBackground() == null)) {
                        drawable2 = this.currentBackgroundDrawable.getShadowDrawable();
                    } else {
                        drawable2 = this.currentBackgroundSelectedDrawable.getShadowDrawable();
                    }
                    Drawable drawable5 = drawable2;
                    this.backgroundDrawableLeft = AndroidUtilities.dp(((!this.isChat || !this.isAvatarVisible) ? 0 : 48) + (!this.mediaBackground ? 3 : 9));
                    this.backgroundDrawableRight = this.backgroundWidth - (this.mediaBackground ? 0 : AndroidUtilities.dp(3.0f));
                    MessageObject.GroupedMessages groupedMessages3 = this.currentMessagesGroup;
                    if (groupedMessages3 != null && !groupedMessages3.isDocuments) {
                        if (!this.currentPosition.edge) {
                            this.backgroundDrawableLeft -= AndroidUtilities.dp(10.0f);
                            this.backgroundDrawableRight += AndroidUtilities.dp(10.0f);
                        }
                        if (this.currentPosition.leftSpanOffset != 0) {
                            this.backgroundDrawableLeft += (int) Math.ceil((i8 / 1000.0f) * getGroupPhotosWidth());
                        }
                    }
                    boolean z6 = this.mediaBackground;
                    if ((!z6 && this.drawPinnedBottom) || (!z4 && this.transitionParams.changePinnedBottomProgress != 1.0f)) {
                        if (this.drawPinnedBottom || !z6) {
                            this.backgroundDrawableRight -= AndroidUtilities.dp(6.0f);
                        }
                        if (!this.mediaBackground) {
                            this.backgroundDrawableLeft += AndroidUtilities.dp(6.0f);
                        }
                    }
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = this.currentPosition;
                    if (groupedMessagePosition4 != null) {
                        if ((groupedMessagePosition4.flags & 2) == 0) {
                            this.backgroundDrawableRight += AndroidUtilities.dp(SharedConfig.bubbleRadius + 2);
                        }
                        if ((this.currentPosition.flags & 1) == 0) {
                            this.backgroundDrawableLeft -= AndroidUtilities.dp(SharedConfig.bubbleRadius + 2);
                            this.backgroundDrawableRight += AndroidUtilities.dp(SharedConfig.bubbleRadius + 2);
                        }
                        if ((this.currentPosition.flags & 4) == 0) {
                            i6 = 0 - AndroidUtilities.dp(SharedConfig.bubbleRadius + 3);
                            i5 = AndroidUtilities.dp(SharedConfig.bubbleRadius + 3) + 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                        if ((this.currentPosition.flags & 8) == 0) {
                            i5 += AndroidUtilities.dp(SharedConfig.bubbleRadius + 4);
                        }
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    boolean z7 = this.drawPinnedBottom;
                    if (z7 && this.drawPinnedTop) {
                        i7 = 0;
                    } else if (z7) {
                        i7 = AndroidUtilities.dp(1.0f);
                    } else {
                        i7 = AndroidUtilities.dp(2.0f);
                    }
                    int dp3 = (this.drawPinnedTop ? 0 : AndroidUtilities.dp(1.0f)) + i6;
                    this.backgroundDrawableTop = dp3;
                    int i16 = (this.layoutHeight - i7) + i5;
                    setDrawableBoundsInner(this.currentBackgroundDrawable, this.backgroundDrawableLeft, dp3, this.backgroundDrawableRight, i16);
                    if (z4) {
                        setDrawableBoundsInner(this.currentBackgroundSelectedDrawable, AndroidUtilities.dp(6.0f) + this.backgroundDrawableLeft, this.backgroundDrawableTop, this.backgroundDrawableRight - AndroidUtilities.dp(6.0f), i16);
                    } else {
                        setDrawableBoundsInner(this.currentBackgroundSelectedDrawable, this.backgroundDrawableLeft, this.backgroundDrawableTop, this.backgroundDrawableRight, i16);
                    }
                    setDrawableBoundsInner(drawable5, this.backgroundDrawableLeft, this.backgroundDrawableTop, this.backgroundDrawableRight, i16);
                    drawable = drawable5;
                }
                if (!this.currentMessageObject.isOutOwner() && this.transitionParams.changePinnedBottomProgress != f && !this.mediaBackground && !this.drawPinnedBottom) {
                    this.backgroundDrawableLeft -= AndroidUtilities.dp(6.0f);
                    this.backgroundDrawableRight += AndroidUtilities.dp(6.0f);
                }
                if (this.hasPsaHint) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition5 = this.currentPosition;
                    if (groupedMessagePosition5 != null && (groupedMessagePosition5.flags & 2) == 0) {
                        int groupPhotosWidth = getGroupPhotosWidth();
                        i3 = 0;
                        for (int i17 = 0; i17 < this.currentMessagesGroup.posArray.size(); i17++) {
                            if (this.currentMessagesGroup.posArray.get(i17).minY != 0) {
                                break;
                            }
                            double d = i3;
                            double ceil = Math.ceil(((groupedMessagePosition.pw + groupedMessagePosition.leftSpanOffset) / 1000.0f) * groupPhotosWidth);
                            Double.isNaN(d);
                            i3 = (int) (d + ceil);
                        }
                    } else {
                        i3 = this.currentBackgroundDrawable.getBounds().right;
                    }
                    Drawable drawable6 = Theme.chat_psaHelpDrawable[this.currentMessageObject.isOutOwner() ? 1 : 0];
                    if (this.currentMessageObject.type == 5) {
                        i4 = AndroidUtilities.dp(12.0f);
                    } else {
                        i4 = AndroidUtilities.dp((this.drawNameLayout ? 19 : 0) + 10);
                    }
                    this.psaHelpX = (i3 - drawable6.getIntrinsicWidth()) - AndroidUtilities.dp(this.currentMessageObject.isOutOwner() ? 20.0f : 14.0f);
                    this.psaHelpY = i4 + AndroidUtilities.dp(4.0f);
                }
                boolean z8 = this.checkBoxVisible;
                if (z8 || this.checkBoxAnimationInProgress) {
                    if ((z8 && this.checkBoxAnimationProgress == f) || (!z8 && this.checkBoxAnimationProgress == 0.0f)) {
                        this.checkBoxAnimationInProgress = false;
                    }
                    this.checkBoxTranslation = (int) Math.ceil((z8 ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(this.checkBoxAnimationProgress) * AndroidUtilities.dp(35.0f));
                    if (!this.currentMessageObject.isOutOwner()) {
                        updateTranslation();
                    }
                    int dp4 = AndroidUtilities.dp(21.0f);
                    this.checkBox.setBounds(AndroidUtilities.dp(-27.0f) + this.checkBoxTranslation, (this.currentBackgroundDrawable.getBounds().bottom - AndroidUtilities.dp(8.0f)) - dp4, dp4, dp4);
                    if (this.checkBoxAnimationInProgress) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j = elapsedRealtime - this.lastCheckBoxAnimationTime;
                        this.lastCheckBoxAnimationTime = elapsedRealtime;
                        if (this.checkBoxVisible) {
                            float f2 = this.checkBoxAnimationProgress + (((float) j) / 200.0f);
                            this.checkBoxAnimationProgress = f2;
                            if (f2 > f) {
                                this.checkBoxAnimationProgress = f;
                            }
                        } else {
                            float f3 = this.checkBoxAnimationProgress - (((float) j) / 200.0f);
                            this.checkBoxAnimationProgress = f3;
                            if (f3 <= 0.0f) {
                                this.checkBoxAnimationProgress = 0.0f;
                            }
                        }
                        invalidate();
                        ((View) getParent()).invalidate();
                    }
                }
                if (z || !drawBackgroundInParent()) {
                    if (this.transitionYOffsetForDrawables != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, this.transitionYOffsetForDrawables);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.drawBackground && this.currentBackgroundDrawable != null && ((this.currentPosition == null || (isDrawSelectionBackground() && (this.currentMessageObject.isMusic() || this.currentMessageObject.isDocument()))) && (!this.enterTransitionInProgress || this.currentMessageObject.isVoice()))) {
                        float f4 = this.alphaInternal;
                        if (z) {
                            f4 *= getAlpha();
                        }
                        if (hasSelectionOverlay()) {
                            this.currentSelectedBackgroundAlpha = 0.0f;
                            int i18 = (int) (f4 * 255.0f);
                            this.currentBackgroundDrawable.setAlpha(i18);
                            this.currentBackgroundDrawable.drawCached(canvas, this.backgroundCacheParams);
                            if (drawable != null && this.currentPosition == null) {
                                drawable.setAlpha(i18);
                                drawable.draw(canvas);
                            }
                        } else {
                            if (this.isHighlightedAnimated) {
                                this.currentBackgroundDrawable.setAlpha((int) (f4 * 255.0f));
                                this.currentBackgroundDrawable.drawCached(canvas, this.backgroundCacheParams);
                                float highlightAlpha = getHighlightAlpha();
                                this.currentSelectedBackgroundAlpha = highlightAlpha;
                                if (this.currentPosition == null) {
                                    this.currentBackgroundSelectedDrawable.setAlpha((int) (highlightAlpha * f4 * 255.0f));
                                    this.currentBackgroundSelectedDrawable.drawCached(canvas, this.backgroundCacheParams);
                                }
                            } else if (this.selectedBackgroundProgress != 0.0f && ((groupedMessages = this.currentMessagesGroup) == null || !groupedMessages.isDocuments)) {
                                this.currentBackgroundDrawable.drawCached(canvas, this.backgroundCacheParams);
                                float f5 = this.selectedBackgroundProgress;
                                this.currentSelectedBackgroundAlpha = f5;
                                this.currentBackgroundSelectedDrawable.setAlpha((int) (f5 * f4 * 255.0f));
                                this.currentBackgroundSelectedDrawable.drawCached(canvas, this.backgroundCacheParams);
                                if (this.currentBackgroundDrawable.getGradientShader() == null) {
                                    drawable = null;
                                }
                            } else if (!isDrawSelectionBackground() || (this.currentPosition != null && !this.currentMessageObject.isMusic() && !this.currentMessageObject.isDocument() && getBackground() == null)) {
                                this.currentSelectedBackgroundAlpha = 0.0f;
                                this.currentBackgroundDrawable.setAlpha((int) (f4 * 255.0f));
                                this.currentBackgroundDrawable.drawCached(canvas, this.backgroundCacheParams);
                            } else {
                                if (this.currentPosition != null) {
                                    canvas.save();
                                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                                }
                                this.currentSelectedBackgroundAlpha = f;
                                this.currentBackgroundSelectedDrawable.setAlpha((int) (f4 * 255.0f));
                                this.currentBackgroundSelectedDrawable.drawCached(canvas, this.backgroundCacheParams);
                                if (this.currentPosition != null) {
                                    canvas.restore();
                                }
                            }
                            if (drawable != null && this.currentPosition == null) {
                                drawable.setAlpha((int) (f4 * 255.0f));
                                drawable.draw(canvas);
                            }
                            if (this.transitionParams.changePinnedBottomProgress != f && this.currentPosition == null) {
                                if (this.currentMessageObject.isOutOwner()) {
                                    Theme.MessageDrawable messageDrawable2 = (Theme.MessageDrawable) getThemedDrawable("drawableMsgOut");
                                    Rect bounds = this.currentBackgroundDrawable.getBounds();
                                    messageDrawable2.setBounds(bounds.left, bounds.top, bounds.right + AndroidUtilities.dp(6.0f), bounds.bottom);
                                    canvas.save();
                                    canvas.clipRect(bounds.right - AndroidUtilities.dp(12.0f), bounds.bottom - AndroidUtilities.dp(16.0f), bounds.right + AndroidUtilities.dp(12.0f), bounds.bottom);
                                    int i19 = this.parentWidth;
                                    int i20 = this.parentHeight;
                                    if (i20 == 0) {
                                        i19 = getParentWidth();
                                        i20 = AndroidUtilities.displaySize.y;
                                        if (getParent() instanceof View) {
                                            View view = (View) getParent();
                                            int measuredWidth = view.getMeasuredWidth();
                                            i = view.getMeasuredHeight();
                                            i2 = measuredWidth;
                                            float y = getY();
                                            float f6 = this.parentViewTopOffset;
                                            messageDrawable2.setTop((int) (y + f6), i2, i, (int) f6, this.blurredViewTopOffset, this.blurredViewBottomOffset, this.pinnedTop, this.pinnedBottom);
                                            messageDrawable2.setAlpha((int) (((!this.mediaBackground || this.pinnedBottom) ? f - this.transitionParams.changePinnedBottomProgress : this.transitionParams.changePinnedBottomProgress) * 255.0f));
                                            messageDrawable2.draw(canvas);
                                            messageDrawable2.setAlpha(255);
                                            canvas.restore();
                                        }
                                    }
                                    i2 = i19;
                                    i = i20;
                                    float y2 = getY();
                                    float f62 = this.parentViewTopOffset;
                                    messageDrawable2.setTop((int) (y2 + f62), i2, i, (int) f62, this.blurredViewTopOffset, this.blurredViewBottomOffset, this.pinnedTop, this.pinnedBottom);
                                    messageDrawable2.setAlpha((int) (((!this.mediaBackground || this.pinnedBottom) ? f - this.transitionParams.changePinnedBottomProgress : this.transitionParams.changePinnedBottomProgress) * 255.0f));
                                    messageDrawable2.draw(canvas);
                                    messageDrawable2.setAlpha(255);
                                    canvas.restore();
                                } else {
                                    if (this.transitionParams.drawPinnedBottomBackground) {
                                        messageDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgIn");
                                    } else {
                                        messageDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgInMedia");
                                    }
                                    messageDrawable.setAlpha((int) (((this.mediaBackground || this.pinnedBottom) ? f - this.transitionParams.changePinnedBottomProgress : this.transitionParams.changePinnedBottomProgress) * 255.0f));
                                    Rect bounds2 = this.currentBackgroundDrawable.getBounds();
                                    messageDrawable.setBounds(bounds2.left - AndroidUtilities.dp(6.0f), bounds2.top, bounds2.right, bounds2.bottom);
                                    canvas.save();
                                    canvas.clipRect(bounds2.left - AndroidUtilities.dp(6.0f), bounds2.bottom - AndroidUtilities.dp(16.0f), bounds2.left + AndroidUtilities.dp(6.0f), bounds2.bottom);
                                    messageDrawable.draw(canvas);
                                    messageDrawable.setAlpha(255);
                                    canvas.restore();
                                }
                            }
                        }
                    }
                    if (z2) {
                        canvas.restore();
                        return;
                    }
                    return;
                }
                return;
            }
            forceLayout();
        }
    }

    public boolean drawBackgroundInParent() {
        MessageObject messageObject;
        if (!this.canDrawBackgroundInParent || (messageObject = this.currentMessageObject) == null || !messageObject.isOutOwner()) {
            return false;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getCurrentColor("chat_outBubbleGradient") != null : Theme.getColorOrNull("chat_outBubbleGradient") != null;
    }

    public void drawCommentButton(Canvas canvas, float f) {
        if (this.drawSideButton == 3) {
            int dp = AndroidUtilities.dp(32.0f);
            if (this.commentLayout != null) {
                this.sideStartY -= AndroidUtilities.dp(18.0f);
                dp += AndroidUtilities.dp(18.0f);
            }
            RectF rectF = this.rect;
            float f2 = this.sideStartX;
            rectF.set(f2, this.sideStartY, AndroidUtilities.dp(32.0f) + f2, this.sideStartY + dp);
            applyServiceShaderMatrix();
            String str = "paintChatActionBackground";
            if (f != 1.0f) {
                int alpha = getThemedPaint(str).getAlpha();
                getThemedPaint(str).setAlpha((int) (alpha * f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), getThemedPaint(str));
                getThemedPaint(str).setAlpha(alpha);
            } else {
                RectF rectF2 = this.rect;
                float dp2 = AndroidUtilities.dp(16.0f);
                float dp3 = AndroidUtilities.dp(16.0f);
                if (this.sideButtonPressed) {
                    str = "paintChatActionBackgroundSelected";
                }
                canvas.drawRoundRect(rectF2, dp2, dp3, getThemedPaint(str));
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
                Theme.chat_stickerCommentCountPaint.setColor(getThemedColor("chat_stickerReplyNameText"));
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
        if (getAlpha() != 1.0f) {
            return false;
        }
        return (!this.transitionParams.transitionBotButtons.isEmpty() && this.transitionParams.animateBotButtonsChanged) || !this.botButtons.isEmpty() || this.drawSideButton != 0;
    }

    public void drawOutboundsContent(Canvas canvas) {
        float f = 1.0f;
        if (!this.transitionParams.transitionBotButtons.isEmpty()) {
            TransitionParams transitionParams = this.transitionParams;
            if (transitionParams.animateBotButtonsChanged) {
                drawBotButtons(canvas, transitionParams.transitionBotButtons, 1.0f - this.transitionParams.animateChangeProgress);
            }
        }
        if (!this.botButtons.isEmpty()) {
            ArrayList<BotButton> arrayList = this.botButtons;
            TransitionParams transitionParams2 = this.transitionParams;
            if (transitionParams2.animateBotButtonsChanged) {
                f = transitionParams2.animateChangeProgress;
            }
            drawBotButtons(canvas, arrayList, f);
        }
        drawSideButton(canvas);
    }

    private void drawSideButton(Canvas canvas) {
        if (this.drawSideButton != 0) {
            if (this.currentMessageObject.isOutOwner()) {
                float dp = this.transitionParams.lastBackgroundLeft - AndroidUtilities.dp(40.0f);
                this.sideStartX = dp;
                MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
                if (groupedMessages != null) {
                    this.sideStartX = dp + (groupedMessages.transitionParams.offsetLeft - this.animationOffsetX);
                }
            } else {
                float dp2 = this.transitionParams.lastBackgroundRight + AndroidUtilities.dp(8.0f);
                this.sideStartX = dp2;
                MessageObject.GroupedMessages groupedMessages2 = this.currentMessagesGroup;
                if (groupedMessages2 != null) {
                    this.sideStartX = dp2 + (groupedMessages2.transitionParams.offsetRight - this.animationOffsetX);
                }
            }
            float dp3 = (this.layoutHeight - AndroidUtilities.dp(41.0f)) + this.transitionParams.deltaBottom;
            this.sideStartY = dp3;
            MessageObject.GroupedMessages groupedMessages3 = this.currentMessagesGroup;
            if (groupedMessages3 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages3.transitionParams;
                float f = dp3 + transitionParams.offsetBottom;
                this.sideStartY = f;
                if (transitionParams.backgroundChangeBounds) {
                    this.sideStartY = f - getTranslationY();
                }
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
            if (!reactionsLayoutInBubble.isSmall && reactionsLayoutInBubble.drawServiceShaderBackground) {
                this.sideStartY -= reactionsLayoutInBubble.getCurrentTotalHeight(this.transitionParams.animateChangeProgress);
            }
            if (!this.currentMessageObject.isOutOwner() && this.isRoundVideo && this.isAvatarVisible) {
                float f2 = (AndroidUtilities.roundPlayingMessageSize - AndroidUtilities.roundMessageSize) * 0.7f;
                boolean z = this.isPlayingRound;
                float f3 = z ? f2 : 0.0f;
                TransitionParams transitionParams2 = this.transitionParams;
                if (transitionParams2.animatePlayingRound) {
                    f3 = (z ? transitionParams2.animateChangeProgress : 1.0f - transitionParams2.animateChangeProgress) * f2;
                }
                this.sideStartX -= f3;
            }
            if (this.drawSideButton != 3) {
                RectF rectF = this.rect;
                float f4 = this.sideStartX;
                rectF.set(f4, this.sideStartY, AndroidUtilities.dp(32.0f) + f4, this.sideStartY + AndroidUtilities.dp(32.0f));
                applyServiceShaderMatrix();
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), getThemedPaint(this.sideButtonPressed ? "paintChatActionBackgroundSelected" : "paintChatActionBackground"));
                if (hasGradientService()) {
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
                }
                if (this.drawSideButton == 2) {
                    Drawable themedDrawable = getThemedDrawable("drawableGoIcon");
                    if (this.currentMessageObject.isOutOwner()) {
                        BaseCell.setDrawableBounds(themedDrawable, this.sideStartX + AndroidUtilities.dp(10.0f), this.sideStartY + AndroidUtilities.dp(9.0f));
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, themedDrawable.getBounds().centerX(), themedDrawable.getBounds().centerY());
                    } else {
                        BaseCell.setDrawableBounds(themedDrawable, this.sideStartX + AndroidUtilities.dp(12.0f), this.sideStartY + AndroidUtilities.dp(9.0f));
                    }
                    themedDrawable.draw(canvas);
                    if (this.currentMessageObject.isOutOwner()) {
                        canvas.restore();
                        return;
                    }
                    return;
                }
                Drawable themedDrawable2 = getThemedDrawable("drawableShareIcon");
                BaseCell.setDrawableBounds(themedDrawable2, this.sideStartX + AndroidUtilities.dp(8.0f), this.sideStartY + AndroidUtilities.dp(9.0f));
                themedDrawable2.draw(canvas);
            } else if (!this.enterTransitionInProgress || this.currentMessageObject.isVoice()) {
                drawCommentButton(canvas, 1.0f);
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
        int i;
        int i2 = 0;
        if (this.currentMessageObject.isOutOwner()) {
            int i3 = this.layoutWidth - this.backgroundWidth;
            if (this.mediaBackground) {
                i2 = AndroidUtilities.dp(9.0f);
            }
            return i3 - i2;
        }
        if (this.isChat && this.isAvatarVisible) {
            i2 = 48;
        }
        int dp = AndroidUtilities.dp(i2 + (!this.mediaBackground ? 3 : 9));
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (!(groupedMessages == null || groupedMessages.isDocuments || (i = this.currentPosition.leftSpanOffset) == 0)) {
            dp += (int) Math.ceil((i / 1000.0f) * getGroupPhotosWidth());
        }
        return (this.mediaBackground || !this.drawPinnedBottom) ? dp : dp + AndroidUtilities.dp(6.0f);
    }

    public int getBackgroundDrawableRight() {
        int dp = this.backgroundWidth - (this.mediaBackground ? 0 : AndroidUtilities.dp(3.0f));
        if (!this.mediaBackground && this.drawPinnedBottom && this.currentMessageObject.isOutOwner()) {
            dp -= AndroidUtilities.dp(6.0f);
        }
        if (!this.mediaBackground && this.drawPinnedBottom && !this.currentMessageObject.isOutOwner()) {
            dp -= AndroidUtilities.dp(6.0f);
        }
        return getBackgroundDrawableLeft() + dp;
    }

    public int getBackgroundDrawableTop() {
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        int i = 0;
        int dp = (groupedMessagePosition == null || (groupedMessagePosition.flags & 4) != 0) ? 0 : 0 - AndroidUtilities.dp(3.0f);
        if (!this.drawPinnedTop) {
            i = AndroidUtilities.dp(1.0f);
        }
        return dp + i;
    }

    public int getBackgroundDrawableBottom() {
        int i;
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        int i2 = 0;
        if (groupedMessagePosition != null) {
            int i3 = 4;
            i = (groupedMessagePosition.flags & 4) == 0 ? AndroidUtilities.dp(3.0f) + 0 : 0;
            if ((this.currentPosition.flags & 8) == 0) {
                if (this.currentMessageObject.isOutOwner()) {
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
        return ((getBackgroundDrawableTop() + this.layoutHeight) - i2) + i;
    }

    public void drawBackground(android.graphics.Canvas r16, int r17, int r18, int r19, int r20, boolean r21, boolean r22, boolean r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawBackground(android.graphics.Canvas, int, int, int, int, boolean, boolean, boolean, int):void");
    }

    public boolean hasNameLayout() {
        if (this.drawNameLayout && this.nameLayout != null) {
            return true;
        }
        if (this.drawForwardedName) {
            StaticLayout[] staticLayoutArr = this.forwardedNameLayout;
            if (!(staticLayoutArr[0] == null || staticLayoutArr[1] == null)) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
                if (groupedMessagePosition == null) {
                    return true;
                }
                if (groupedMessagePosition.minY == 0 && groupedMessagePosition.minX == 0) {
                    return true;
                }
            }
        }
        return this.replyNameLayout != null;
    }

    public boolean isDrawNameLayout() {
        return this.drawNameLayout && this.nameLayout != null;
    }

    public boolean isAdminLayoutChanged() {
        return !TextUtils.equals(this.lastPostAuthor, this.currentMessageObject.messageOwner.post_author);
    }

    public void drawNamesLayout(android.graphics.Canvas r29, float r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawNamesLayout(android.graphics.Canvas, float):void");
    }

    public boolean hasCaptionLayout() {
        return this.captionLayout != null;
    }

    public StaticLayout getCaptionLayout() {
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
        int i;
        if (this.drawSelectionBackground || !this.isHighlightedAnimated || (i = this.highlightProgress) >= 300) {
            return 1.0f;
        }
        return i / 300.0f;
    }

    public void setCheckBoxVisible(boolean z, boolean z2) {
        MessageObject.GroupedMessages groupedMessages;
        MessageObject.GroupedMessages groupedMessages2;
        if (z && this.checkBox == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(this, 21, this.resourcesProvider);
            this.checkBox = checkBoxBase;
            if (this.attachedToWindow) {
                checkBoxBase.onAttachedToWindow();
            }
        }
        if (z && this.mediaCheckBox == null && (((groupedMessages = this.currentMessagesGroup) != null && groupedMessages.messages.size() > 1) || ((groupedMessages2 = this.groupedMessagesToSet) != null && groupedMessages2.messages.size() > 1))) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(this, 21, this.resourcesProvider);
            this.mediaCheckBox = checkBoxBase2;
            checkBoxBase2.setUseDefaultCheck(true);
            if (this.attachedToWindow) {
                this.mediaCheckBox.onAttachedToWindow();
            }
        }
        float f = 1.0f;
        if (this.checkBoxVisible != z) {
            this.checkBoxAnimationInProgress = z2;
            this.checkBoxVisible = z;
            if (z2) {
                this.lastCheckBoxAnimationTime = SystemClock.elapsedRealtime();
            } else {
                if (!z) {
                    f = 0.0f;
                }
                this.checkBoxAnimationProgress = f;
            }
            invalidate();
        } else if (z2 != this.checkBoxAnimationInProgress && !z2) {
            if (!z) {
                f = 0.0f;
            }
            this.checkBoxAnimationProgress = f;
            invalidate();
        }
    }

    public void setChecked(boolean z, boolean z2, boolean z3) {
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
                if (this.mediaBackground || this.drawPinnedBottom || z2) {
                    this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgOutMedia");
                } else {
                    this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgOut");
                }
            } else if (this.mediaBackground || this.drawPinnedBottom || z2) {
                this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgInMedia");
            } else {
                this.currentBackgroundDrawable = (Theme.MessageDrawable) getThemedDrawable("drawableMsgIn");
            }
        }
        this.currentBackgroundDrawable.getBackgroundDrawable();
        return this.currentBackgroundDrawable;
    }

    public void drawCaptionLayout(Canvas canvas, boolean z, float f) {
        TransitionParams transitionParams = this.transitionParams;
        float f2 = 1.0f;
        if (!transitionParams.animateReplaceCaptionLayout || transitionParams.animateChangeProgress == 1.0f) {
            drawCaptionLayout(canvas, this.captionLayout, z, f);
        } else {
            drawCaptionLayout(canvas, transitionParams.animateOutCaptionLayout, z, (1.0f - this.transitionParams.animateChangeProgress) * f);
            drawCaptionLayout(canvas, this.captionLayout, z, f * this.transitionParams.animateChangeProgress);
        }
        if (!z) {
            MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
            if (groupedMessagePosition != null) {
                int i = groupedMessagePosition.flags;
                if ((i & 8) == 0 || (i & 1) == 0) {
                    return;
                }
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
            if (!reactionsLayoutInBubble.isSmall) {
                if (reactionsLayoutInBubble.drawServiceShaderBackground) {
                    applyServiceShaderMatrix();
                }
                ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
                if (reactionsLayoutInBubble2.drawServiceShaderBackground || !this.transitionParams.animateBackgroundBoundsInner || this.currentPosition != null) {
                    TransitionParams transitionParams2 = this.transitionParams;
                    if (transitionParams2.animateChange) {
                        f2 = transitionParams2.animateChangeProgress;
                    }
                    reactionsLayoutInBubble2.draw(canvas, f2, null);
                    return;
                }
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), getBackgroundDrawableBottom() + this.transitionParams.deltaBottom);
                ReactionsLayoutInBubble reactionsLayoutInBubble3 = this.reactionsLayoutInBubble;
                TransitionParams transitionParams3 = this.transitionParams;
                if (transitionParams3.animateChange) {
                    f2 = transitionParams3.animateChangeProgress;
                }
                reactionsLayoutInBubble3.draw(canvas, f2, null);
                canvas.restore();
            }
        }
    }

    private void drawCaptionLayout(android.graphics.Canvas r26, android.text.StaticLayout r27, boolean r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawCaptionLayout(android.graphics.Canvas, android.text.StaticLayout, boolean, float):void");
    }

    public boolean needDrawTime() {
        return !this.forceNotDrawTime;
    }

    public boolean shouldDrawTimeOnMedia() {
        int i = this.overideShouldDrawTimeOnMedia;
        if (i != 0) {
            return i == 1;
        }
        if (!this.mediaBackground || this.captionLayout != null) {
            return false;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        return reactionsLayoutInBubble.isEmpty || reactionsLayoutInBubble.isSmall || this.currentMessageObject.isAnyKindOfSticker() || this.currentMessageObject.isRoundVideo();
    }

    public void drawTime(android.graphics.Canvas r17, float r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawTime(android.graphics.Canvas, float, boolean):void");
    }

    private void drawTimeInternal(Canvas canvas, float f, boolean z, float f2, StaticLayout staticLayout, float f3, boolean z2) {
        int i;
        float f4;
        float f5;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        boolean z7;
        int i6;
        Paint paint;
        boolean z8;
        int i7;
        boolean z9;
        int i8;
        boolean z10;
        int i9;
        float f6;
        TextPaint textPaint;
        if (((this.drawTime && !this.groupPhotoInvisible) || !shouldDrawTimeOnMedia()) && staticLayout != null) {
            MessageObject messageObject = this.currentMessageObject;
            if ((!messageObject.deleted || this.currentPosition == null) && (i = messageObject.type) != 16) {
                if (i == 5) {
                    Theme.chat_timePaint.setColor(getThemedColor("chat_serviceText"));
                } else if (shouldDrawTimeOnMedia()) {
                    if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                        Theme.chat_timePaint.setColor(getThemedColor("chat_serviceText"));
                    } else {
                        Theme.chat_timePaint.setColor(getThemedColor("chat_mediaTimeText"));
                    }
                } else if (this.currentMessageObject.isOutOwner()) {
                    Theme.chat_timePaint.setColor(getThemedColor(z2 ? "chat_outTimeSelectedText" : "chat_outTimeText"));
                } else {
                    Theme.chat_timePaint.setColor(getThemedColor(z2 ? "chat_inTimeSelectedText" : "chat_inTimeText"));
                }
                float f7 = getTransitionParams().animateDrawingTimeAlpha ? getTransitionParams().animateChangeProgress * f : f;
                if (f7 != 1.0f) {
                    Theme.chat_timePaint.setAlpha((int) (textPaint.getAlpha() * f7));
                }
                canvas.save();
                if (this.drawPinnedBottom && !shouldDrawTimeOnMedia()) {
                    canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
                }
                TransitionParams transitionParams = this.transitionParams;
                float f8 = this.layoutHeight + transitionParams.deltaBottom;
                if (transitionParams.shouldAnimateTimeX) {
                    float f9 = transitionParams.animateChangeProgress;
                    f4 = (transitionParams.animateFromTimeX * (1.0f - f9)) + (this.timeX * f9);
                } else {
                    f4 = f2;
                }
                MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
                if (groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) {
                    f5 = f2;
                } else {
                    f8 -= getTranslationY();
                    float f10 = this.currentMessagesGroup.transitionParams.offsetRight;
                    f5 = f2 + f10;
                    f4 += f10;
                }
                if (this.drawPinnedBottom && shouldDrawTimeOnMedia()) {
                    f8 += AndroidUtilities.dp(1.0f);
                }
                float f11 = f8;
                TransitionParams transitionParams2 = this.transitionParams;
                boolean z11 = transitionParams2.animateBackgroundBoundsInner;
                if (z11) {
                    float f12 = this.animationOffsetX;
                    f5 += f12;
                    f4 += f12;
                }
                float f13 = f5;
                ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                if (reactionsLayoutInBubble.isSmall) {
                    if (!z11 || transitionParams2.deltaRight == 0.0f) {
                        f6 = reactionsLayoutInBubble.getCurrentWidth(transitionParams2.animateChangeProgress);
                    } else {
                        f6 = reactionsLayoutInBubble.getCurrentWidth(1.0f);
                    }
                    f4 += f6;
                }
                if (this.transitionParams.animateEditedEnter) {
                    f4 -= this.transitionParams.animateEditedWidthDiff * (1.0f - this.transitionParams.animateChangeProgress);
                }
                float f14 = f4;
                if (shouldDrawTimeOnMedia()) {
                    int i10 = -(this.drawCommentButton ? AndroidUtilities.dp(41.3f) : 0);
                    if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                        paint = getThemedPaint("paintChatActionBackground");
                    } else {
                        paint = getThemedPaint("paintChatTimeBackground");
                    }
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * this.timeAlpha * f7));
                    Theme.chat_timePaint.setAlpha((int) (this.timeAlpha * 255.0f * f7));
                    int i11 = this.documentAttachType;
                    float f15 = 4.0f;
                    if (i11 == 7 || i11 == 6) {
                        i7 = AndroidUtilities.dp(4.0f);
                        z8 = false;
                    } else {
                        int[] roundRadius = this.photoImage.getRoundRadius();
                        i7 = Math.min(AndroidUtilities.dp(8.0f), Math.max(roundRadius[2], roundRadius[3]));
                        z8 = SharedConfig.bubbleRadius >= 10;
                    }
                    if (z8) {
                        f15 = 6.0f;
                    }
                    float dp = f13 - AndroidUtilities.dp(f15);
                    float imageY2 = this.additionalTimeOffsetY + this.photoImage.getImageY2();
                    float dp2 = imageY2 - AndroidUtilities.dp(23.0f);
                    this.rect.set(dp, dp2, dp + f3 + AndroidUtilities.dp((z8 ? 12 : 8) + (this.currentMessageObject.isOutOwner() ? 20 : 0)), AndroidUtilities.dp(17.0f) + dp2);
                    applyServiceShaderMatrix();
                    float f16 = i7;
                    canvas.drawRoundRect(this.rect, f16, f16, paint);
                    if (paint == getThemedPaint("paintChatActionBackground") && hasGradientService()) {
                        int alpha2 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
                        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha2 * this.timeAlpha * f7));
                        canvas.drawRoundRect(this.rect, f16, f16, Theme.chat_actionBackgroundGradientDarkenPaint);
                        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha2);
                    }
                    paint.setAlpha(alpha);
                    float f17 = -staticLayout.getLineLeft(0);
                    if (this.reactionsLayoutInBubble.isSmall) {
                        updateReactionLayoutPosition();
                        this.reactionsLayoutInBubble.draw(canvas, this.transitionParams.animateChangeProgress, null);
                    }
                    if ((!ChatObject.isChannel(this.currentChat) || this.currentChat.megagroup) && (this.currentMessageObject.messageOwner.flags & 1024) == 0 && this.repliesLayout == null && !this.isPinned) {
                        z9 = z8;
                        i8 = i10;
                    } else {
                        float lineWidth = f17 + (this.timeWidth - staticLayout.getLineWidth(0));
                        ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
                        if (reactionsLayoutInBubble2.isSmall && !reactionsLayoutInBubble2.isEmpty) {
                            lineWidth -= reactionsLayoutInBubble2.width;
                        }
                        f17 = lineWidth;
                        int createStatusDrawableParams = this.transitionParams.createStatusDrawableParams();
                        int i12 = this.transitionParams.lastStatusDrawableParams;
                        if (i12 >= 0 && i12 != createStatusDrawableParams && !this.statusDrawableAnimationInProgress) {
                            createStatusDrawableAnimator(i12, createStatusDrawableParams, z);
                        }
                        boolean z12 = this.statusDrawableAnimationInProgress;
                        if (z12) {
                            createStatusDrawableParams = this.animateToStatusDrawableParams;
                        }
                        if ((createStatusDrawableParams & 4) != 0) {
                            i9 = 8;
                            z10 = true;
                        } else {
                            i9 = 8;
                            z10 = false;
                        }
                        boolean z13 = (createStatusDrawableParams & i9) != 0;
                        if (z12) {
                            int i13 = this.animateFromStatusDrawableParams;
                            boolean z14 = (i13 & 4) != 0;
                            boolean z15 = (i13 & i9) != 0;
                            float f18 = i10;
                            float f19 = f7;
                            z9 = z8;
                            i8 = i10;
                            drawClockOrErrorLayout(canvas, z14, z15, f11, f19, f18, f13, 1.0f - this.statusDrawableProgress, z2);
                            drawClockOrErrorLayout(canvas, z10, z13, f11, f19, f18, f13, this.statusDrawableProgress, z2);
                            if (!this.currentMessageObject.isOutOwner()) {
                                if (!z14 && !z15) {
                                    drawViewsAndRepliesLayout(canvas, f11, f7, f18, f13, 1.0f - this.statusDrawableProgress, z2);
                                }
                                if (!z10 && !z13) {
                                    drawViewsAndRepliesLayout(canvas, f11, f7, f18, f13, this.statusDrawableProgress, z2);
                                }
                            }
                        } else {
                            z9 = z8;
                            i8 = i10;
                            if (!this.currentMessageObject.isOutOwner() && !z10 && !z13) {
                                drawViewsAndRepliesLayout(canvas, f11, f7, i8, f13, 1.0f, z2);
                            }
                            drawClockOrErrorLayout(canvas, z10, z13, f11, f7, i8, f13, 1.0f, z2);
                        }
                        if (this.currentMessageObject.isOutOwner()) {
                            drawViewsAndRepliesLayout(canvas, f11, f7, i8, f13, 1.0f, z2);
                        }
                        TransitionParams transitionParams3 = this.transitionParams;
                        transitionParams3.lastStatusDrawableParams = transitionParams3.createStatusDrawableParams();
                        if (z10 && z && getParent() != null) {
                            ((View) getParent()).invalidate();
                        }
                    }
                    canvas.save();
                    float f20 = f14 + f17;
                    this.drawTimeX = f20;
                    float dp3 = (imageY2 - AndroidUtilities.dp(7.3f)) - staticLayout.getHeight();
                    this.drawTimeY = dp3;
                    canvas.translate(f20, dp3);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    Theme.chat_timePaint.setAlpha(255);
                    z3 = z9;
                    i2 = i8;
                } else {
                    if (this.currentMessageObject.isSponsored()) {
                        i5 = -AndroidUtilities.dp(48.0f);
                        if (this.hasNewLineForTime) {
                            i5 -= AndroidUtilities.dp(16.0f);
                        }
                    } else {
                        i5 = -(this.drawCommentButton ? AndroidUtilities.dp(43.0f) : 0);
                    }
                    int i14 = i5;
                    float f21 = -staticLayout.getLineLeft(0);
                    if (this.reactionsLayoutInBubble.isSmall) {
                        updateReactionLayoutPosition();
                        this.reactionsLayoutInBubble.draw(canvas, this.transitionParams.animateChangeProgress, null);
                    }
                    if ((ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup) || (this.currentMessageObject.messageOwner.flags & 1024) != 0 || this.repliesLayout != null || this.transitionParams.animateReplies || this.isPinned || this.transitionParams.animatePinned) {
                        float lineWidth2 = f21 + (this.timeWidth - staticLayout.getLineWidth(0));
                        ReactionsLayoutInBubble reactionsLayoutInBubble3 = this.reactionsLayoutInBubble;
                        if (reactionsLayoutInBubble3.isSmall && !reactionsLayoutInBubble3.isEmpty) {
                            lineWidth2 -= reactionsLayoutInBubble3.width;
                        }
                        f21 = lineWidth2;
                        int createStatusDrawableParams2 = this.transitionParams.createStatusDrawableParams();
                        int i15 = this.transitionParams.lastStatusDrawableParams;
                        if (i15 >= 0 && i15 != createStatusDrawableParams2 && !this.statusDrawableAnimationInProgress) {
                            createStatusDrawableAnimator(i15, createStatusDrawableParams2, z);
                        }
                        boolean z16 = this.statusDrawableAnimationInProgress;
                        if (z16) {
                            createStatusDrawableParams2 = this.animateToStatusDrawableParams;
                        }
                        if ((createStatusDrawableParams2 & 4) != 0) {
                            i6 = 8;
                            z7 = true;
                        } else {
                            i6 = 8;
                            z7 = false;
                        }
                        boolean z17 = (createStatusDrawableParams2 & i6) != 0;
                        if (z16) {
                            int i16 = this.animateFromStatusDrawableParams;
                            boolean z18 = (i16 & 4) != 0;
                            boolean z19 = (i16 & i6) != 0;
                            float f22 = i14;
                            float f23 = f7;
                            drawClockOrErrorLayout(canvas, z18, z19, f11, f23, f22, f13, 1.0f - this.statusDrawableProgress, z2);
                            drawClockOrErrorLayout(canvas, z7, z17, f11, f23, f22, f13, this.statusDrawableProgress, z2);
                            if (!this.currentMessageObject.isOutOwner()) {
                                if (!z18 && !z19) {
                                    drawViewsAndRepliesLayout(canvas, f11, f7, f22, f13, 1.0f - this.statusDrawableProgress, z2);
                                }
                                if (!z7 && !z17) {
                                    drawViewsAndRepliesLayout(canvas, f11, f7, f22, f13, this.statusDrawableProgress, z2);
                                }
                            }
                        } else {
                            if (!this.currentMessageObject.isOutOwner() && !z7 && !z17) {
                                drawViewsAndRepliesLayout(canvas, f11, f7, i14, f13, 1.0f, z2);
                            }
                            drawClockOrErrorLayout(canvas, z7, z17, f11, f7, i14, f13, 1.0f, z2);
                        }
                        if (this.currentMessageObject.isOutOwner()) {
                            drawViewsAndRepliesLayout(canvas, f11, f7, i14, f13, 1.0f, z2);
                        }
                        TransitionParams transitionParams4 = this.transitionParams;
                        transitionParams4.lastStatusDrawableParams = transitionParams4.createStatusDrawableParams();
                        if (z7 && z && getParent() != null) {
                            ((View) getParent()).invalidate();
                        }
                    }
                    canvas.save();
                    float f24 = 6.5f;
                    if (this.transitionParams.animateEditedEnter) {
                        TransitionParams transitionParams5 = this.transitionParams;
                        if (transitionParams5.animateChangeProgress != 1.0f) {
                            if (transitionParams5.animateEditedLayout != null) {
                                float f25 = f14 + f21;
                                if (this.pinnedBottom || this.pinnedTop) {
                                    f24 = 7.5f;
                                }
                                canvas.translate(f25, ((f11 - AndroidUtilities.dp(f24)) - staticLayout.getHeight()) + i14);
                                int alpha3 = Theme.chat_timePaint.getAlpha();
                                Theme.chat_timePaint.setAlpha((int) (alpha3 * this.transitionParams.animateChangeProgress));
                                this.transitionParams.animateEditedLayout.draw(canvas);
                                Theme.chat_timePaint.setAlpha(alpha3);
                                this.transitionParams.animateTimeLayout.draw(canvas);
                            } else {
                                int alpha4 = Theme.chat_timePaint.getAlpha();
                                canvas.save();
                                float f26 = i14;
                                canvas.translate(this.transitionParams.animateFromTimeX + f21, ((f11 - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 7.5f : 6.5f)) - staticLayout.getHeight()) + f26);
                                float f27 = alpha4;
                                Theme.chat_timePaint.setAlpha((int) ((1.0f - this.transitionParams.animateChangeProgress) * f27));
                                this.transitionParams.animateTimeLayout.draw(canvas);
                                canvas.restore();
                                float f28 = f14 + f21;
                                if (this.pinnedBottom || this.pinnedTop) {
                                    f24 = 7.5f;
                                }
                                canvas.translate(f28, ((f11 - AndroidUtilities.dp(f24)) - staticLayout.getHeight()) + f26);
                                Theme.chat_timePaint.setAlpha((int) (f27 * this.transitionParams.animateChangeProgress));
                                staticLayout.draw(canvas);
                                Theme.chat_timePaint.setAlpha(alpha4);
                            }
                            canvas.restore();
                            i2 = i14;
                            z3 = false;
                        }
                    }
                    float f29 = f14 + f21;
                    this.drawTimeX = f29;
                    if (this.pinnedBottom || this.pinnedTop) {
                        f24 = 7.5f;
                    }
                    float dp4 = ((f11 - AndroidUtilities.dp(f24)) - staticLayout.getHeight()) + i14;
                    this.drawTimeY = dp4;
                    canvas.translate(f29, dp4);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    i2 = i14;
                    z3 = false;
                }
                if (this.currentMessageObject.isOutOwner()) {
                    int createStatusDrawableParams3 = this.transitionParams.createStatusDrawableParams();
                    int i17 = this.transitionParams.lastStatusDrawableParams;
                    if (i17 >= 0 && i17 != createStatusDrawableParams3 && !this.statusDrawableAnimationInProgress) {
                        createStatusDrawableAnimator(i17, createStatusDrawableParams3, z);
                    }
                    if (this.statusDrawableAnimationInProgress) {
                        createStatusDrawableParams3 = this.animateToStatusDrawableParams;
                    }
                    boolean z20 = (createStatusDrawableParams3 & 1) != 0;
                    boolean z21 = (createStatusDrawableParams3 & 2) != 0;
                    boolean z22 = (createStatusDrawableParams3 & 4) != 0;
                    if ((createStatusDrawableParams3 & 8) != 0) {
                        i3 = 16;
                        z4 = true;
                    } else {
                        i3 = 16;
                        z4 = false;
                    }
                    boolean z23 = (createStatusDrawableParams3 & i3) != 0;
                    if (this.transitionYOffsetForDrawables != 0.0f) {
                        canvas.save();
                        canvas.translate(0.0f, this.transitionYOffsetForDrawables);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (this.statusDrawableAnimationInProgress) {
                        int i18 = this.animateFromStatusDrawableParams;
                        boolean z24 = (i18 & 1) != 0;
                        boolean z25 = (i18 & 2) != 0;
                        boolean z26 = (i18 & 4) != 0;
                        if ((i18 & 8) != 0) {
                            i4 = 16;
                            z6 = true;
                        } else {
                            i4 = 16;
                            z6 = false;
                        }
                        boolean z27 = (i18 & i4) != 0;
                        if (z26 || z23 || z27 || !z25 || !z21 || z24 || !z20) {
                            float f30 = i2;
                            float f31 = f7;
                            boolean z28 = z3;
                            drawStatusDrawable(canvas, z24, z25, z26, z6, z27, f31, z28, f30, f11, 1.0f - this.statusDrawableProgress, false, z2);
                            drawStatusDrawable(canvas, z20, z21, z22, z4, z23, f31, z28, f30, f11, this.statusDrawableProgress, false, z2);
                        } else {
                            drawStatusDrawable(canvas, z20, z21, z22, z4, z23, f7, z3, i2, f11, this.statusDrawableProgress, true, z2);
                        }
                    } else {
                        drawStatusDrawable(canvas, z20, z21, z22, z4, z23, f7, z3, i2, f11, 1.0f, false, z2);
                    }
                    if (z5) {
                        canvas.restore();
                    }
                    TransitionParams transitionParams6 = this.transitionParams;
                    transitionParams6.lastStatusDrawableParams = transitionParams6.createStatusDrawableParams();
                    if (z && z22 && getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                }
                canvas.restore();
            }
        }
    }

    public void createStatusDrawableAnimator(int i, int i2, final boolean z) {
        boolean z2 = false;
        boolean z3 = (i2 & 1) != 0;
        boolean z4 = (i2 & 2) != 0;
        boolean z5 = (i2 & 16) != 0;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        boolean z8 = (i & 4) != 0;
        boolean z9 = (i & 16) != 0;
        if (!z8 && !z5 && !z9 && z7 && z4 && !z6 && z3) {
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
                    ChatMessageCell.this.lambda$createStatusDrawableAnimator$5(z, valueAnimator);
                }
            });
            this.statusDrawableAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    int createStatusDrawableParams = ChatMessageCell.this.transitionParams.createStatusDrawableParams();
                    if (ChatMessageCell.this.animateToStatusDrawableParams != createStatusDrawableParams) {
                        ChatMessageCell chatMessageCell = ChatMessageCell.this;
                        chatMessageCell.createStatusDrawableAnimator(chatMessageCell.animateToStatusDrawableParams, createStatusDrawableParams, z);
                        return;
                    }
                    ChatMessageCell.this.statusDrawableAnimationInProgress = false;
                    ChatMessageCell.this.transitionParams.lastStatusDrawableParams = ChatMessageCell.this.animateToStatusDrawableParams;
                }
            });
            this.statusDrawableAnimationInProgress = true;
            this.statusDrawableAnimator.start();
        }
    }

    public void lambda$createStatusDrawableAnimator$5(boolean z, ValueAnimator valueAnimator) {
        this.statusDrawableProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
        if (z && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    private void drawClockOrErrorLayout(Canvas canvas, boolean z, boolean z2, float f, float f2, float f3, float f4, float f5, boolean z3) {
        float f6;
        int i;
        float f7;
        int i2 = 0;
        boolean z4 = f5 != 1.0f;
        float f8 = (f5 * 0.5f) + 0.5f;
        float f9 = f2 * f5;
        if (z) {
            if (!this.currentMessageObject.isOutOwner()) {
                MsgClockDrawable msgClockDrawable = Theme.chat_msgClockDrawable;
                String str = "chat_mediaSentClock";
                if (shouldDrawTimeOnMedia()) {
                    i = getThemedColor(str);
                } else {
                    if (z3) {
                        str = "chat_outSentClockSelected";
                    }
                    i = getThemedColor(str);
                }
                msgClockDrawable.setColor(i);
                if (shouldDrawTimeOnMedia()) {
                    f7 = (this.photoImage.getImageY2() + this.additionalTimeOffsetY) - AndroidUtilities.dp(9.0f);
                } else {
                    f7 = (f - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 9.5f : 8.5f)) + f3;
                }
                if (!this.currentMessageObject.scheduled) {
                    i2 = AndroidUtilities.dp(11.0f);
                }
                BaseCell.setDrawableBounds(msgClockDrawable, f4 + i2, f7 - msgClockDrawable.getIntrinsicHeight());
                msgClockDrawable.setAlpha((int) (f9 * 255.0f));
                if (z4) {
                    canvas.save();
                    canvas.scale(f8, f8, msgClockDrawable.getBounds().centerX(), msgClockDrawable.getBounds().centerY());
                }
                msgClockDrawable.draw(canvas);
                msgClockDrawable.setAlpha(255);
                invalidate();
                if (z4) {
                    canvas.restore();
                }
            }
        } else if (z2 && !this.currentMessageObject.isOutOwner()) {
            if (!this.currentMessageObject.scheduled) {
                i2 = AndroidUtilities.dp(11.0f);
            }
            float f10 = f4 + i2;
            float f11 = 21.5f;
            if (shouldDrawTimeOnMedia()) {
                f6 = (this.photoImage.getImageY2() + this.additionalTimeOffsetY) - AndroidUtilities.dp(21.5f);
            } else {
                if (!this.pinnedBottom && !this.pinnedTop) {
                    f11 = 20.5f;
                }
                f6 = (f - AndroidUtilities.dp(f11)) + f3;
            }
            this.rect.set(f10, f6, AndroidUtilities.dp(14.0f) + f10, AndroidUtilities.dp(14.0f) + f6);
            int alpha = Theme.chat_msgErrorPaint.getAlpha();
            int i3 = (int) (f9 * 255.0f);
            Theme.chat_msgErrorPaint.setAlpha(i3);
            if (z4) {
                canvas.save();
                canvas.scale(f8, f8, this.rect.centerX(), this.rect.centerY());
            }
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.chat_msgErrorPaint);
            Theme.chat_msgErrorPaint.setAlpha(alpha);
            Drawable themedDrawable = getThemedDrawable("drawableMsgError");
            BaseCell.setDrawableBounds(themedDrawable, f10 + AndroidUtilities.dp(6.0f), f6 + AndroidUtilities.dp(2.0f));
            themedDrawable.setAlpha(i3);
            themedDrawable.draw(canvas);
            themedDrawable.setAlpha(255);
            if (z4) {
                canvas.restore();
            }
        }
    }

    private void drawViewsAndRepliesLayout(android.graphics.Canvas r24, float r25, float r26, float r27, float r28, float r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawViewsAndRepliesLayout(android.graphics.Canvas, float, float, float, float, float, boolean):void");
    }

    private void drawStatusDrawable(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, boolean z6, float f2, float f3, float f4, boolean z7, boolean z8) {
        int dp;
        int dp2;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        int i;
        boolean z9 = f4 != 1.0f && !z7;
        float f5 = (f4 * 0.5f) + 0.5f;
        float f6 = z9 ? f * f4 : f;
        float imageY2 = (this.photoImage.getImageY2() + this.additionalTimeOffsetY) - AndroidUtilities.dp(8.5f);
        if (z3) {
            MsgClockDrawable msgClockDrawable = Theme.chat_msgClockDrawable;
            if (!shouldDrawTimeOnMedia()) {
                int themedColor = getThemedColor("chat_outSentClock");
                BaseCell.setDrawableBounds(msgClockDrawable, (this.layoutWidth - AndroidUtilities.dp(18.5f)) - msgClockDrawable.getIntrinsicWidth(), ((f3 - AndroidUtilities.dp(8.5f)) - msgClockDrawable.getIntrinsicHeight()) + f2);
                msgClockDrawable.setAlpha((int) (f6 * 255.0f));
                i = themedColor;
            } else if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                i = getThemedColor("chat_serviceText");
                BaseCell.setDrawableBounds(msgClockDrawable, (this.layoutWidth - AndroidUtilities.dp(z6 ? 24.0f : 22.0f)) - msgClockDrawable.getIntrinsicWidth(), (imageY2 - msgClockDrawable.getIntrinsicHeight()) + f2);
                msgClockDrawable.setAlpha((int) (this.timeAlpha * 255.0f * f6));
            } else {
                i = getThemedColor("chat_mediaSentClock");
                BaseCell.setDrawableBounds(msgClockDrawable, (this.layoutWidth - AndroidUtilities.dp(z6 ? 24.0f : 22.0f)) - msgClockDrawable.getIntrinsicWidth(), (imageY2 - msgClockDrawable.getIntrinsicHeight()) + f2);
                msgClockDrawable.setAlpha((int) (f6 * 255.0f));
            }
            msgClockDrawable.setColor(i);
            if (z9) {
                canvas.save();
                canvas.scale(f5, f5, msgClockDrawable.getBounds().centerX(), msgClockDrawable.getBounds().centerY());
            }
            msgClockDrawable.draw(canvas);
            msgClockDrawable.setAlpha(255);
            if (z9) {
                canvas.restore();
            }
            invalidate();
        }
        if (!z5) {
            float f7 = 23.5f;
            if (z2) {
                if (shouldDrawTimeOnMedia()) {
                    if (z7) {
                        canvas.save();
                    }
                    float f8 = 28.3f;
                    if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                        drawable3 = getThemedDrawable("drawableMsgStickerCheck");
                        if (z) {
                            if (z7) {
                                canvas.translate(AndroidUtilities.dp(4.8f) * (1.0f - f4), 0.0f);
                            }
                            int i2 = this.layoutWidth;
                            if (!z6) {
                                f8 = 26.3f;
                            }
                            BaseCell.setDrawableBounds(drawable3, (i2 - AndroidUtilities.dp(f8)) - drawable3.getIntrinsicWidth(), (imageY2 - drawable3.getIntrinsicHeight()) + f2);
                        } else {
                            BaseCell.setDrawableBounds(drawable3, (this.layoutWidth - AndroidUtilities.dp(z6 ? 23.5f : 21.5f)) - drawable3.getIntrinsicWidth(), (imageY2 - drawable3.getIntrinsicHeight()) + f2);
                        }
                        drawable3.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                    } else {
                        if (z) {
                            if (z7) {
                                canvas.translate(AndroidUtilities.dp(4.8f) * (1.0f - f4), 0.0f);
                            }
                            Drawable drawable5 = Theme.chat_msgMediaCheckDrawable;
                            int i3 = this.layoutWidth;
                            if (!z6) {
                                f8 = 26.3f;
                            }
                            BaseCell.setDrawableBounds(drawable5, (i3 - AndroidUtilities.dp(f8)) - Theme.chat_msgMediaCheckDrawable.getIntrinsicWidth(), (imageY2 - Theme.chat_msgMediaCheckDrawable.getIntrinsicHeight()) + f2);
                        } else {
                            BaseCell.setDrawableBounds(Theme.chat_msgMediaCheckDrawable, (this.layoutWidth - AndroidUtilities.dp(z6 ? 23.5f : 21.5f)) - Theme.chat_msgMediaCheckDrawable.getIntrinsicWidth(), (imageY2 - Theme.chat_msgMediaCheckDrawable.getIntrinsicHeight()) + f2);
                        }
                        Theme.chat_msgMediaCheckDrawable.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                        drawable3 = Theme.chat_msgMediaCheckDrawable;
                    }
                    if (z9) {
                        canvas.save();
                        canvas.scale(f5, f5, drawable3.getBounds().centerX(), drawable3.getBounds().centerY());
                    }
                    drawable3.draw(canvas);
                    if (z9) {
                        canvas.restore();
                    }
                    if (z7) {
                        canvas.restore();
                    }
                    drawable3.setAlpha(255);
                } else {
                    if (z7) {
                        canvas.save();
                    }
                    if (z) {
                        if (z7) {
                            canvas.translate(AndroidUtilities.dp(4.0f) * (1.0f - f4), 0.0f);
                        }
                        drawable2 = getThemedDrawable(z8 ? "drawableMsgOutCheckReadSelected" : "drawableMsgOutCheckRead");
                        BaseCell.setDrawableBounds(drawable2, (this.layoutWidth - AndroidUtilities.dp(22.5f)) - drawable2.getIntrinsicWidth(), ((f3 - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 9.0f : 8.0f)) - drawable2.getIntrinsicHeight()) + f2);
                    } else {
                        Drawable themedDrawable = getThemedDrawable(z8 ? "drawableMsgOutCheckSelected" : "drawableMsgOutCheck");
                        BaseCell.setDrawableBounds(themedDrawable, (this.layoutWidth - AndroidUtilities.dp(18.5f)) - themedDrawable.getIntrinsicWidth(), ((f3 - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 9.0f : 8.0f)) - themedDrawable.getIntrinsicHeight()) + f2);
                        drawable2 = themedDrawable;
                    }
                    drawable2.setAlpha((int) (f6 * 255.0f));
                    if (z9) {
                        canvas.save();
                        canvas.scale(f5, f5, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
                    }
                    drawable2.draw(canvas);
                    if (z9) {
                        canvas.restore();
                    }
                    if (z7) {
                        canvas.restore();
                    }
                    drawable2.setAlpha(255);
                }
            }
            if (z) {
                if (shouldDrawTimeOnMedia()) {
                    if (this.currentMessageObject.shouldDrawWithoutBackground()) {
                        drawable = getThemedDrawable("drawableMsgStickerHalfCheck");
                        int i4 = this.layoutWidth;
                        if (!z6) {
                            f7 = 21.5f;
                        }
                        BaseCell.setDrawableBounds(drawable, (i4 - AndroidUtilities.dp(f7)) - drawable.getIntrinsicWidth(), (imageY2 - drawable.getIntrinsicHeight()) + f2);
                        drawable.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                    } else {
                        drawable = Theme.chat_msgMediaHalfCheckDrawable;
                        int i5 = this.layoutWidth;
                        if (!z6) {
                            f7 = 21.5f;
                        }
                        BaseCell.setDrawableBounds(drawable, (i5 - AndroidUtilities.dp(f7)) - drawable.getIntrinsicWidth(), (imageY2 - drawable.getIntrinsicHeight()) + f2);
                        drawable.setAlpha((int) (this.timeAlpha * 255.0f * f6));
                    }
                    if (z9 || z7) {
                        canvas.save();
                        canvas.scale(f5, f5, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                    }
                    drawable.draw(canvas);
                    if (z9 || z7) {
                        canvas.restore();
                    }
                    drawable.setAlpha(255);
                } else {
                    Drawable themedDrawable2 = getThemedDrawable(z8 ? "drawableMsgOutHalfCheckSelected" : "drawableMsgOutHalfCheck");
                    BaseCell.setDrawableBounds(themedDrawable2, (this.layoutWidth - AndroidUtilities.dp(18.0f)) - themedDrawable2.getIntrinsicWidth(), ((f3 - AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 9.0f : 8.0f)) - themedDrawable2.getIntrinsicHeight()) + f2);
                    themedDrawable2.setAlpha((int) (f6 * 255.0f));
                    if (z9 || z7) {
                        canvas.save();
                        canvas.scale(f5, f5, themedDrawable2.getBounds().centerX(), themedDrawable2.getBounds().centerY());
                    }
                    themedDrawable2.draw(canvas);
                    if (z9 || z7) {
                        canvas.restore();
                    }
                    themedDrawable2.setAlpha(255);
                }
            }
        } else if (z || z2) {
            if (shouldDrawTimeOnMedia()) {
                BaseCell.setDrawableBounds(Theme.chat_msgBroadcastMediaDrawable, (this.layoutWidth - AndroidUtilities.dp(z6 ? 26.0f : 24.0f)) - Theme.chat_msgBroadcastMediaDrawable.getIntrinsicWidth(), ((f3 - AndroidUtilities.dp(14.0f)) - Theme.chat_msgBroadcastMediaDrawable.getIntrinsicHeight()) + f2);
                Theme.chat_msgBroadcastMediaDrawable.setAlpha((int) (f6 * 255.0f));
                drawable4 = Theme.chat_msgBroadcastMediaDrawable;
            } else {
                BaseCell.setDrawableBounds(Theme.chat_msgBroadcastDrawable, (this.layoutWidth - AndroidUtilities.dp(20.5f)) - Theme.chat_msgBroadcastDrawable.getIntrinsicWidth(), ((f3 - AndroidUtilities.dp(8.0f)) - Theme.chat_msgBroadcastDrawable.getIntrinsicHeight()) + f2);
                Theme.chat_msgBroadcastDrawable.setAlpha((int) (f6 * 255.0f));
                drawable4 = Theme.chat_msgBroadcastDrawable;
            }
            if (z9) {
                canvas.save();
                canvas.scale(f5, f5, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
            }
            drawable4.draw(canvas);
            if (z9) {
                canvas.restore();
            }
            drawable4.setAlpha(255);
        }
        if (z4) {
            if (shouldDrawTimeOnMedia()) {
                dp = this.layoutWidth - AndroidUtilities.dp(34.5f);
                dp2 = AndroidUtilities.dp(26.5f);
            } else {
                dp = this.layoutWidth - AndroidUtilities.dp(32.0f);
                dp2 = AndroidUtilities.dp((this.pinnedBottom || this.pinnedTop) ? 22.0f : 21.0f);
            }
            float f9 = (f3 - dp2) + f2;
            this.rect.set(dp, f9, AndroidUtilities.dp(14.0f) + dp, AndroidUtilities.dp(14.0f) + f9);
            int alpha = Theme.chat_msgErrorPaint.getAlpha();
            Theme.chat_msgErrorPaint.setAlpha((int) (alpha * f6));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.chat_msgErrorPaint);
            Theme.chat_msgErrorPaint.setAlpha(alpha);
            BaseCell.setDrawableBounds(Theme.chat_msgErrorDrawable, dp + AndroidUtilities.dp(6.0f), f9 + AndroidUtilities.dp(2.0f));
            Theme.chat_msgErrorDrawable.setAlpha((int) (f6 * 255.0f));
            if (z9) {
                canvas.save();
                canvas.scale(f5, f5, Theme.chat_msgErrorDrawable.getBounds().centerX(), Theme.chat_msgErrorDrawable.getBounds().centerY());
            }
            Theme.chat_msgErrorDrawable.draw(canvas);
            Theme.chat_msgErrorDrawable.setAlpha(255);
            if (z9) {
                canvas.restore();
            }
        }
    }

    public void drawOverlays(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ChatMessageCell.drawOverlays(android.graphics.Canvas):void");
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
        if (groupedMessages == null || !groupedMessages.isDocuments) {
            return this.pinnedBottom;
        }
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition == null || (groupedMessagePosition.flags & 8) == 0) {
            return true;
        }
        return this.pinnedBottom;
    }

    public boolean drawPinnedTop() {
        MessageObject.GroupedMessages groupedMessages = this.currentMessagesGroup;
        if (groupedMessages == null || !groupedMessages.isDocuments) {
            return this.pinnedTop;
        }
        MessageObject.GroupedMessagePosition groupedMessagePosition = this.currentPosition;
        if (groupedMessagePosition == null || (groupedMessagePosition.flags & 4) == 0) {
            return true;
        }
        return this.pinnedTop;
    }

    public boolean isPinnedBottom() {
        return this.pinnedBottom;
    }

    public boolean isPinnedTop() {
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
        } else if (i == R.id.acc_action_msg_options && (chatMessageCellDelegate = this.delegate) != null) {
            if (this.currentMessageObject.type == 16) {
                chatMessageCellDelegate.didLongPress(this, 0.0f, 0.0f);
            } else {
                chatMessageCellDelegate.didPressOther(this, this.otherX, this.otherY);
            }
        }
        if ((this.currentMessageObject.isVoice() || (this.currentMessageObject.isMusic() && MediaController.getInstance().isPlayingMessage(this.currentMessageObject))) && this.seekBarAccessibilityDelegate.performAccessibilityActionInternal(i, bundle)) {
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAnimationRunning(boolean z, boolean z2) {
        this.animationRunning = z;
        if (z) {
            this.willRemoved = z2;
        } else {
            this.willRemoved = false;
        }
        if (getParent() == null && this.attachedToWindow) {
            onDetachedFromWindow();
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
                    if (keyAt == this.currentFocusedVirtualView) {
                        return true;
                    }
                    this.currentFocusedVirtualView = keyAt;
                    sendAccessibilityEventForVirtualView(keyAt, 32768);
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
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            obtain.setPackageName(getContext().getPackageName());
            obtain.setSource(this, i);
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

    public void setSelectedBackgroundProgress(float f) {
        this.selectedBackgroundProgress = f;
        invalidate();
    }

    public int computeHeight(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages) {
        this.photoImage.setIgnoreImageSet(true);
        this.avatarImage.setIgnoreImageSet(true);
        this.replyImageReceiver.setIgnoreImageSet(true);
        this.locationImageReceiver.setIgnoreImageSet(true);
        if (groupedMessages == null || groupedMessages.messages.size() == 1) {
            setMessageContent(messageObject, groupedMessages, false, false);
            this.photoImage.setIgnoreImageSet(false);
            this.avatarImage.setIgnoreImageSet(false);
            this.replyImageReceiver.setIgnoreImageSet(false);
            this.locationImageReceiver.setIgnoreImageSet(false);
            return this.totalHeight + this.keyboardHeight;
        }
        int i = 0;
        for (int i2 = 0; i2 < groupedMessages.messages.size(); i2++) {
            MessageObject messageObject2 = groupedMessages.messages.get(i2);
            MessageObject.GroupedMessagePosition groupedMessagePosition = groupedMessages.positions.get(messageObject2);
            if (!(groupedMessagePosition == null || (groupedMessagePosition.flags & 1) == 0)) {
                setMessageContent(messageObject2, groupedMessages, false, false);
                i += this.totalHeight + this.keyboardHeight;
            }
        }
        return i;
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
        if (messageObject != null) {
            setTranslationX(this.slidingOffsetX + this.animationOffsetX + (!messageObject.isOutOwner() ? this.checkBoxTranslation : 0));
        }
    }

    public float getNonAnimationTranslationX(boolean z) {
        boolean z2;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.isOutOwner()) {
            return this.slidingOffsetX;
        }
        if (z && ((z2 = this.checkBoxVisible) || this.checkBoxAnimationInProgress)) {
            this.checkBoxTranslation = (int) Math.ceil((z2 ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(this.checkBoxAnimationProgress) * AndroidUtilities.dp(35.0f));
        }
        return this.slidingOffsetX + this.checkBoxTranslation;
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

    private class MessageAccessibilityNodeProvider extends AccessibilityNodeProvider {
        private Path linkPath;
        private Rect rect;
        private RectF rectF;

        private MessageAccessibilityNodeProvider() {
            this.linkPath = new Path();
            this.rectF = new RectF();
            this.rect = new Rect();
        }

        @Override
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            CharacterStyle[] characterStyleArr;
            CharacterStyle[] characterStyleArr2;
            String str;
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
            String str2;
            CharacterStyle[] characterStyleArr3;
            String str3;
            int i2;
            String str4;
            int[] iArr = {0, 0};
            ChatMessageCell.this.getLocationOnScreen(iArr);
            if (i == -1) {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ChatMessageCell.this);
                ChatMessageCell.this.onInitializeAccessibilityNodeInfo(obtain);
                if (ChatMessageCell.this.accessibilityText == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ChatMessageCell chatMessageCell = ChatMessageCell.this;
                    if (chatMessageCell.isChat && chatMessageCell.currentUser != null && !ChatMessageCell.this.currentMessageObject.isOut()) {
                        spannableStringBuilder.append((CharSequence) UserObject.getUserName(ChatMessageCell.this.currentUser));
                        spannableStringBuilder.append('\n');
                    }
                    if (ChatMessageCell.this.drawForwardedName) {
                        int i3 = 0;
                        while (i3 < 2) {
                            if (ChatMessageCell.this.forwardedNameLayout[i3] != null) {
                                spannableStringBuilder.append(ChatMessageCell.this.forwardedNameLayout[i3].getText());
                                spannableStringBuilder.append(i3 == 0 ? " " : "\n");
                            }
                            i3++;
                        }
                    }
                    if (!TextUtils.isEmpty(ChatMessageCell.this.currentMessageObject.messageText)) {
                        spannableStringBuilder.append(ChatMessageCell.this.currentMessageObject.messageText);
                    }
                    if (ChatMessageCell.this.documentAttach == null || !(ChatMessageCell.this.documentAttachType == 1 || ChatMessageCell.this.documentAttachType == 2 || ChatMessageCell.this.documentAttachType == 4)) {
                        str2 = " ";
                    } else {
                        if (ChatMessageCell.this.buttonState != 1 || ChatMessageCell.this.loadingProgressLayout == null) {
                            str2 = " ";
                            if (ChatMessageCell.this.buttonState == 0 || ChatMessageCell.this.documentAttachType == 1) {
                                spannableStringBuilder.append((CharSequence) ", ");
                                spannableStringBuilder.append((CharSequence) AndroidUtilities.formatFileSize(ChatMessageCell.this.documentAttach.size));
                            }
                        } else {
                            spannableStringBuilder.append((CharSequence) "\n");
                            boolean isSending = ChatMessageCell.this.currentMessageObject.isSending();
                            str2 = " ";
                            spannableStringBuilder.append((CharSequence) LocaleController.formatString(isSending ? "AccDescrUploadProgress" : "AccDescrDownloadProgress", isSending ? R.string.AccDescrUploadProgress : R.string.AccDescrDownloadProgress, AndroidUtilities.formatFileSize(ChatMessageCell.this.currentMessageObject.loadedFileSize), AndroidUtilities.formatFileSize(ChatMessageCell.this.lastLoadingSizeTotal)));
                        }
                        if (ChatMessageCell.this.documentAttachType == 4) {
                            spannableStringBuilder.append((CharSequence) ", ");
                            spannableStringBuilder.append((CharSequence) LocaleController.formatDuration(ChatMessageCell.this.currentMessageObject.getDuration()));
                        }
                    }
                    if (ChatMessageCell.this.currentMessageObject.isMusic()) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, ChatMessageCell.this.currentMessageObject.getMusicAuthor(), ChatMessageCell.this.currentMessageObject.getMusicTitle()));
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) LocaleController.formatDuration(ChatMessageCell.this.currentMessageObject.getDuration()));
                    } else if (ChatMessageCell.this.currentMessageObject.isVoice() || ChatMessageCell.this.isRoundVideo) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) LocaleController.formatDuration(ChatMessageCell.this.currentMessageObject.getDuration()));
                        if (ChatMessageCell.this.currentMessageObject.isContentUnread()) {
                            spannableStringBuilder.append((CharSequence) ", ");
                            spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgNotPlayed", R.string.AccDescrMsgNotPlayed));
                        }
                    }
                    if (ChatMessageCell.this.lastPoll != null) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) ChatMessageCell.this.lastPoll.question);
                        spannableStringBuilder.append((CharSequence) ", ");
                        if (ChatMessageCell.this.pollClosed) {
                            str4 = LocaleController.getString("FinalResults", R.string.FinalResults);
                        } else if (ChatMessageCell.this.lastPoll.quiz) {
                            if (ChatMessageCell.this.lastPoll.public_voters) {
                                str4 = LocaleController.getString("QuizPoll", R.string.QuizPoll);
                            } else {
                                str4 = LocaleController.getString("AnonymousQuizPoll", R.string.AnonymousQuizPoll);
                            }
                        } else if (ChatMessageCell.this.lastPoll.public_voters) {
                            str4 = LocaleController.getString("PublicPoll", R.string.PublicPoll);
                        } else {
                            str4 = LocaleController.getString("AnonymousPoll", R.string.AnonymousPoll);
                        }
                        spannableStringBuilder.append((CharSequence) str4);
                    }
                    if (ChatMessageCell.this.currentMessageObject.messageOwner.media != null && !TextUtils.isEmpty(ChatMessageCell.this.currentMessageObject.caption)) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append(ChatMessageCell.this.currentMessageObject.caption);
                    }
                    if (!ChatMessageCell.this.currentMessageObject.isOut()) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, LocaleController.getString("TodayAt", R.string.TodayAt) + str2 + ChatMessageCell.this.currentTimeString));
                    } else if (ChatMessageCell.this.currentMessageObject.isSent()) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        if (ChatMessageCell.this.currentMessageObject.scheduled) {
                            spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrScheduledDate", R.string.AccDescrScheduledDate, ChatMessageCell.this.currentTimeString));
                        } else {
                            spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, LocaleController.getString("TodayAt", R.string.TodayAt) + str2 + ChatMessageCell.this.currentTimeString));
                            spannableStringBuilder.append((CharSequence) ", ");
                            if (ChatMessageCell.this.currentMessageObject.isUnread()) {
                                i2 = R.string.AccDescrMsgUnread;
                                str3 = "AccDescrMsgUnread";
                            } else {
                                i2 = R.string.AccDescrMsgRead;
                                str3 = "AccDescrMsgRead";
                            }
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(str3, i2));
                        }
                    } else if (ChatMessageCell.this.currentMessageObject.isSending()) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSending", R.string.AccDescrMsgSending));
                        float progress = ChatMessageCell.this.radialProgress.getProgress();
                        if (progress > 0.0f) {
                            spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) Integer.toString(Math.round(progress * 100.0f))).append((CharSequence) "%");
                        }
                    } else if (ChatMessageCell.this.currentMessageObject.isSendError()) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSendingError", R.string.AccDescrMsgSendingError));
                    }
                    if ((ChatMessageCell.this.currentMessageObject.messageOwner.flags & 1024) != 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfViews", ChatMessageCell.this.currentMessageObject.messageOwner.views));
                    }
                    spannableStringBuilder.append((CharSequence) "\n");
                    for (final CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                        int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                        int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                        spannableStringBuilder.removeSpan(characterStyle);
                        spannableStringBuilder.setSpan(new ClickableSpan() {
                            @Override
                            public void onClick(View view) {
                                if (ChatMessageCell.this.delegate != null) {
                                    ChatMessageCell.this.delegate.didPressUrl(ChatMessageCell.this, characterStyle, false);
                                }
                            }
                        }, spanStart, spanEnd, 33);
                    }
                    ChatMessageCell.this.accessibilityText = spannableStringBuilder;
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 24) {
                    obtain.setContentDescription(ChatMessageCell.this.accessibilityText.toString());
                } else {
                    obtain.setText(ChatMessageCell.this.accessibilityText);
                }
                obtain.setEnabled(true);
                if (i4 >= 19 && (collectionItemInfo = obtain.getCollectionItemInfo()) != null) {
                    obtain.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), 1, 0, 1, false));
                }
                if (i4 >= 21) {
                    obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
                    int iconForCurrentState = ChatMessageCell.this.getIconForCurrentState();
                    if (iconForCurrentState == 0) {
                        str = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
                    } else if (iconForCurrentState == 1) {
                        str = LocaleController.getString("AccActionPause", R.string.AccActionPause);
                    } else if (iconForCurrentState == 2) {
                        str = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
                    } else if (iconForCurrentState == 3) {
                        str = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
                    } else if (iconForCurrentState != 5) {
                        str = ChatMessageCell.this.currentMessageObject.type == 16 ? LocaleController.getString("CallAgain", R.string.CallAgain) : null;
                    } else {
                        str = LocaleController.getString("AccActionOpenFile", R.string.AccActionOpenFile);
                    }
                    obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, str));
                    obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
                    if (ChatMessageCell.this.getMiniIconForCurrentState() == 2) {
                        obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, LocaleController.getString("AccActionDownload", R.string.AccActionDownload)));
                    }
                } else {
                    obtain.addAction(16);
                    obtain.addAction(32);
                }
                if ((ChatMessageCell.this.currentMessageObject.isVoice() || ChatMessageCell.this.currentMessageObject.isMusic()) && MediaController.getInstance().isPlayingMessage(ChatMessageCell.this.currentMessageObject)) {
                    ChatMessageCell.this.seekBarAccessibilityDelegate.onInitializeAccessibilityNodeInfoInternal(obtain);
                }
                if (i4 < 24) {
                    if (ChatMessageCell.this.currentMessageObject.messageText instanceof Spannable) {
                        Spannable spannable = (Spannable) ChatMessageCell.this.currentMessageObject.messageText;
                        int i5 = 0;
                        for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class)) {
                            obtain.addChild(ChatMessageCell.this, i5 + 2000);
                            i5++;
                        }
                    }
                    if ((ChatMessageCell.this.currentMessageObject.caption instanceof Spannable) && ChatMessageCell.this.captionLayout != null) {
                        Spannable spannable2 = (Spannable) ChatMessageCell.this.currentMessageObject.caption;
                        int i6 = 0;
                        for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class)) {
                            obtain.addChild(ChatMessageCell.this, i6 + 3000);
                            i6++;
                        }
                    }
                }
                Iterator it = ChatMessageCell.this.botButtons.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    BotButton botButton = (BotButton) it.next();
                    obtain.addChild(ChatMessageCell.this, i7 + 1000);
                    i7++;
                }
                if (ChatMessageCell.this.hintButtonVisible && ChatMessageCell.this.pollHintX != -1 && ChatMessageCell.this.currentMessageObject.isPoll()) {
                    obtain.addChild(ChatMessageCell.this, 495);
                }
                Iterator it2 = ChatMessageCell.this.pollButtons.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    PollButton pollButton = (PollButton) it2.next();
                    obtain.addChild(ChatMessageCell.this, i8 + 500);
                    i8++;
                }
                if (ChatMessageCell.this.drawInstantView && !ChatMessageCell.this.instantButtonRect.isEmpty()) {
                    obtain.addChild(ChatMessageCell.this, 499);
                }
                if (ChatMessageCell.this.commentLayout != null) {
                    obtain.addChild(ChatMessageCell.this, 496);
                }
                if (ChatMessageCell.this.drawSideButton == 1) {
                    obtain.addChild(ChatMessageCell.this, 498);
                }
                ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
                if (chatMessageCell2.replyNameLayout != null) {
                    obtain.addChild(chatMessageCell2, 497);
                }
                if (!(ChatMessageCell.this.forwardedNameLayout[0] == null || ChatMessageCell.this.forwardedNameLayout[1] == null)) {
                    obtain.addChild(ChatMessageCell.this, 494);
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
            if (i >= 3000) {
                if (!(ChatMessageCell.this.currentMessageObject.caption instanceof Spannable) || ChatMessageCell.this.captionLayout == null) {
                    return null;
                }
                Spannable spannable3 = (Spannable) ChatMessageCell.this.currentMessageObject.caption;
                ClickableSpan linkById = getLinkById(i, true);
                if (linkById == null) {
                    return null;
                }
                int[] realSpanStartAndEnd = ChatMessageCell.this.getRealSpanStartAndEnd(spannable3, linkById);
                obtain2.setText(spannable3.subSequence(realSpanStartAndEnd[0], realSpanStartAndEnd[1]).toString());
                ChatMessageCell.this.captionLayout.getText().length();
                ChatMessageCell.this.captionLayout.getSelectionPath(realSpanStartAndEnd[0], realSpanStartAndEnd[1], this.linkPath);
                this.linkPath.computeBounds(this.rectF, true);
                Rect rect = this.rect;
                RectF rectF = this.rectF;
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.rect.offset((int) ChatMessageCell.this.captionX, (int) ChatMessageCell.this.captionY);
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
                Iterator<MessageObject.TextLayoutBlock> it3 = ChatMessageCell.this.currentMessageObject.textLayoutBlocks.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    MessageObject.TextLayoutBlock next = it3.next();
                    int length = next.textLayout.getText().length();
                    int i9 = next.charactersOffset;
                    if (i9 <= realSpanStartAndEnd2[0] && length + i9 >= realSpanStartAndEnd2[1]) {
                        next.textLayout.getSelectionPath(realSpanStartAndEnd2[0] - i9, realSpanStartAndEnd2[1] - i9, this.linkPath);
                        this.linkPath.computeBounds(this.rectF, true);
                        Rect rect2 = this.rect;
                        RectF rectF2 = this.rectF;
                        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        this.rect.offset(0, (int) next.textYOffset);
                        this.rect.offset(ChatMessageCell.this.textX, ChatMessageCell.this.textY);
                        obtain2.setBoundsInParent(this.rect);
                        if (ChatMessageCell.this.accessibilityVirtualViewBounds.get(i) == null) {
                            ChatMessageCell.this.accessibilityVirtualViewBounds.put(i, new Rect(this.rect));
                        }
                        this.rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(this.rect);
                    }
                }
                obtain2.setClassName("android.widget.TextView");
                obtain2.setEnabled(true);
                obtain2.setClickable(true);
                obtain2.setLongClickable(true);
                obtain2.addAction(16);
                obtain2.addAction(32);
            } else if (i >= 1000) {
                int i10 = i - 1000;
                if (i10 >= ChatMessageCell.this.botButtons.size()) {
                    return null;
                }
                BotButton botButton2 = (BotButton) ChatMessageCell.this.botButtons.get(i10);
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
                int i11 = i - 500;
                if (i11 >= ChatMessageCell.this.pollButtons.size()) {
                    return null;
                }
                PollButton pollButton2 = (PollButton) ChatMessageCell.this.pollButtons.get(i11);
                StringBuilder sb = new StringBuilder(pollButton2.title.getText());
                if (!ChatMessageCell.this.pollVoted) {
                    obtain2.setClassName("android.widget.Button");
                } else {
                    obtain2.setSelected(pollButton2.chosen);
                    sb.append(", ");
                    sb.append(pollButton2.percent);
                    sb.append("%");
                    if (ChatMessageCell.this.lastPoll != null && ChatMessageCell.this.lastPoll.quiz && pollButton2.correct) {
                        sb.append(", ");
                        sb.append(LocaleController.getString("AccDescrQuizCorrectAnswer", R.string.AccDescrQuizCorrectAnswer));
                    }
                }
                obtain2.setText(sb);
                obtain2.setEnabled(true);
                obtain2.addAction(16);
                int i12 = pollButton2.y + ChatMessageCell.this.namesOffset;
                int dp = ChatMessageCell.this.backgroundWidth - AndroidUtilities.dp(76.0f);
                Rect rect3 = this.rect;
                int i13 = pollButton2.x;
                rect3.set(i13, i12, dp + i13, pollButton2.height + i12);
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
            } else if (i == 498) {
                obtain2.setClassName("android.widget.ImageButton");
                obtain2.setEnabled(true);
                ChatMessageCell chatMessageCell3 = ChatMessageCell.this;
                if (chatMessageCell3.isOpenChatByShare(chatMessageCell3.currentMessageObject)) {
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
                Rect rect4 = this.rect;
                ChatMessageCell chatMessageCell4 = ChatMessageCell.this;
                int i14 = chatMessageCell4.replyStartX;
                rect4.set(i14, chatMessageCell4.replyStartY, Math.max(chatMessageCell4.replyNameWidth, ChatMessageCell.this.replyTextWidth) + i14, ChatMessageCell.this.replyStartY + AndroidUtilities.dp(35.0f));
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
                if (!(ChatMessageCell.this.forwardedNameLayout[0] == null || ChatMessageCell.this.forwardedNameLayout[1] == null)) {
                    int i15 = 0;
                    while (i15 < 2) {
                        sb3.append(ChatMessageCell.this.forwardedNameLayout[i15].getText());
                        sb3.append(i15 == 0 ? " " : "\n");
                        i15++;
                    }
                }
                obtain2.setContentDescription(sb3.toString());
                obtain2.addAction(16);
                int min = (int) Math.min(ChatMessageCell.this.forwardNameX - ChatMessageCell.this.forwardNameOffsetX[0], ChatMessageCell.this.forwardNameX - ChatMessageCell.this.forwardNameOffsetX[1]);
                this.rect.set(min, ChatMessageCell.this.forwardNameY, ChatMessageCell.this.forwardedNameWidth + min, ChatMessageCell.this.forwardNameY + AndroidUtilities.dp(32.0f));
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
                if (ChatMessageCell.this.commentLayout != null) {
                    obtain2.setText(ChatMessageCell.this.commentLayout.getText());
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
            }
            obtain2.setFocusable(true);
            obtain2.setVisibleToUser(true);
            return obtain2;
        }

        @Override
        public boolean performAction(int i, int i2, Bundle bundle) {
            if (i == -1) {
                ChatMessageCell.this.performAccessibilityAction(i2, bundle);
            } else if (i2 == 64) {
                ChatMessageCell.this.sendAccessibilityEventForVirtualView(i, 32768);
            } else {
                boolean z = false;
                if (i2 == 16) {
                    if (i >= 3000) {
                        ClickableSpan linkById = getLinkById(i, true);
                        if (linkById != null) {
                            ChatMessageCell.this.delegate.didPressUrl(ChatMessageCell.this, linkById, false);
                            ChatMessageCell.this.sendAccessibilityEventForVirtualView(i, 1);
                        }
                    } else if (i >= 2000) {
                        ClickableSpan linkById2 = getLinkById(i, false);
                        if (linkById2 != null) {
                            ChatMessageCell.this.delegate.didPressUrl(ChatMessageCell.this, linkById2, false);
                            ChatMessageCell.this.sendAccessibilityEventForVirtualView(i, 1);
                        }
                    } else if (i >= 1000) {
                        int i3 = i - 1000;
                        if (i3 >= ChatMessageCell.this.botButtons.size()) {
                            return false;
                        }
                        BotButton botButton = (BotButton) ChatMessageCell.this.botButtons.get(i3);
                        if (!(ChatMessageCell.this.delegate == null || botButton.button == null)) {
                            ChatMessageCell.this.delegate.didPressBotButton(ChatMessageCell.this, botButton.button);
                        }
                        ChatMessageCell.this.sendAccessibilityEventForVirtualView(i, 1);
                    } else if (i >= 500) {
                        int i4 = i - 500;
                        if (i4 >= ChatMessageCell.this.pollButtons.size()) {
                            return false;
                        }
                        PollButton pollButton = (PollButton) ChatMessageCell.this.pollButtons.get(i4);
                        if (ChatMessageCell.this.delegate != null) {
                            ArrayList<TLRPC$TL_pollAnswer> arrayList = new ArrayList<>();
                            arrayList.add(pollButton.answer);
                            ChatMessageCell.this.delegate.didPressVoteButtons(ChatMessageCell.this, arrayList, -1, 0, 0);
                        }
                        ChatMessageCell.this.sendAccessibilityEventForVirtualView(i, 1);
                    } else if (i == 495) {
                        if (ChatMessageCell.this.delegate != null) {
                            ChatMessageCell.this.delegate.didPressHint(ChatMessageCell.this, 0);
                        }
                    } else if (i == 499) {
                        if (ChatMessageCell.this.delegate != null) {
                            ChatMessageCellDelegate chatMessageCellDelegate = ChatMessageCell.this.delegate;
                            ChatMessageCell chatMessageCell = ChatMessageCell.this;
                            chatMessageCellDelegate.didPressInstantButton(chatMessageCell, chatMessageCell.drawInstantViewType);
                        }
                    } else if (i == 498) {
                        if (ChatMessageCell.this.delegate != null) {
                            ChatMessageCell.this.delegate.didPressSideButton(ChatMessageCell.this);
                        }
                    } else if (i == 497) {
                        if (ChatMessageCell.this.delegate != null) {
                            ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
                            if ((!chatMessageCell2.isThreadChat || chatMessageCell2.currentMessageObject.getReplyTopMsgId() != 0) && ChatMessageCell.this.currentMessageObject.hasValidReplyMessageObject()) {
                                ChatMessageCellDelegate chatMessageCellDelegate2 = ChatMessageCell.this.delegate;
                                ChatMessageCell chatMessageCell3 = ChatMessageCell.this;
                                chatMessageCellDelegate2.didPressReplyMessage(chatMessageCell3, chatMessageCell3.currentMessageObject.getReplyMsgId());
                            }
                        }
                    } else if (i == 494) {
                        if (ChatMessageCell.this.delegate != null) {
                            if (ChatMessageCell.this.currentForwardChannel != null) {
                                ChatMessageCellDelegate chatMessageCellDelegate3 = ChatMessageCell.this.delegate;
                                ChatMessageCell chatMessageCell4 = ChatMessageCell.this;
                                chatMessageCellDelegate3.didPressChannelAvatar(chatMessageCell4, chatMessageCell4.currentForwardChannel, ChatMessageCell.this.currentMessageObject.messageOwner.fwd_from.channel_post, ChatMessageCell.this.lastTouchX, ChatMessageCell.this.lastTouchY);
                            } else if (ChatMessageCell.this.currentForwardUser != null) {
                                ChatMessageCellDelegate chatMessageCellDelegate4 = ChatMessageCell.this.delegate;
                                ChatMessageCell chatMessageCell5 = ChatMessageCell.this;
                                chatMessageCellDelegate4.didPressUserAvatar(chatMessageCell5, chatMessageCell5.currentForwardUser, ChatMessageCell.this.lastTouchX, ChatMessageCell.this.lastTouchY);
                            } else if (ChatMessageCell.this.currentForwardName != null) {
                                ChatMessageCell.this.delegate.didPressHiddenForward(ChatMessageCell.this);
                            }
                        }
                    } else if (i == 496 && ChatMessageCell.this.delegate != null) {
                        ChatMessageCell chatMessageCell6 = ChatMessageCell.this;
                        if (chatMessageCell6.isRepliesChat) {
                            chatMessageCell6.delegate.didPressSideButton(ChatMessageCell.this);
                        } else {
                            chatMessageCell6.delegate.didPressCommentButton(ChatMessageCell.this);
                        }
                    }
                } else if (i2 == 32) {
                    if (i >= 3000) {
                        z = true;
                    }
                    ClickableSpan linkById3 = getLinkById(i, z);
                    if (linkById3 != null) {
                        ChatMessageCell.this.delegate.didPressUrl(ChatMessageCell.this, linkById3, true);
                        ChatMessageCell.this.sendAccessibilityEventForVirtualView(i, 2);
                    }
                }
            }
            return true;
        }

        private ClickableSpan getLinkById(int i, boolean z) {
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
        boolean z = true;
        boolean z2 = f == 1.0f;
        if (getAlpha() != 1.0f) {
            z = false;
        }
        if (z2 != z) {
            invalidate();
        }
        if (this.ALPHA_PROPERTY_WORKAROUND) {
            this.alphaInternal = f;
            invalidate();
            return;
        }
        super.setAlpha(f);
    }

    public int getCurrentBackgroundLeft() {
        int i = this.currentBackgroundDrawable.getBounds().left;
        return (this.currentMessageObject.isOutOwner() || this.transitionParams.changePinnedBottomProgress == 1.0f || this.mediaBackground || this.drawPinnedBottom) ? i : i - AndroidUtilities.dp(6.0f);
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
        private boolean animateDrawCommentNumber;
        public boolean animateDrawingTimeAlpha;
        private boolean animateEditedEnter;
        private StaticLayout animateEditedLayout;
        private int animateEditedWidthDiff;
        int animateForwardNameWidth;
        float animateForwardNameX;
        public boolean animateForwardedLayout;
        public int animateForwardedNamesOffset;
        private float animateFromButtonX;
        private float animateFromButtonY;
        public float animateFromReplyY;
        public float animateFromRoundVideoDotY;
        public float animateFromTextY;
        public int animateFromTimeX;
        public float animateFromTimeXPinned;
        private float animateFromTimeXReplies;
        private float animateFromTimeXViews;
        public boolean animateLocationIsExpired;
        boolean animateMessageText;
        private float animateNameX;
        private StaticLayout animateOutCaptionLayout;
        private ArrayList<MessageObject.TextLayoutBlock> animateOutTextBlocks;
        private boolean animatePinned;
        public boolean animatePlayingRound;
        public boolean animateRadius;
        boolean animateReplaceCaptionLayout;
        private boolean animateReplies;
        private StaticLayout animateRepliesLayout;
        public boolean animateRoundVideoDotY;
        private boolean animateShouldDrawMenuDrawable;
        private boolean animateShouldDrawTimeOnMedia;
        private boolean animateSign;
        public boolean animateText;
        private StaticLayout animateTimeLayout;
        private int animateTimeWidth;
        public float animateToImageH;
        public float animateToImageW;
        public float animateToImageX;
        public float animateToImageY;
        public int[] animateToRadius;
        private int animateTotalCommentWidth;
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
        private float lastButtonX;
        private float lastButtonY;
        private int lastCommentArrowX;
        private boolean lastCommentDrawUnread;
        private StaticLayout lastCommentLayout;
        private int lastCommentUnreadX;
        private float lastCommentX;
        private int lastCommentsCount;
        private boolean lastDrawCommentNumber;
        public StaticLayout lastDrawDocTitleLayout;
        public StaticLayout lastDrawInfoLayout;
        public float lastDrawLocationExpireProgress;
        public String lastDrawLocationExpireText;
        public float lastDrawReplyY;
        public float lastDrawRoundVideoDotY;
        public boolean lastDrawTime;
        private StaticLayout lastDrawingCaptionLayout;
        public float lastDrawingCaptionX;
        public float lastDrawingCaptionY;
        private boolean lastDrawingEdited;
        public float lastDrawingImageH;
        public float lastDrawingImageW;
        public float lastDrawingImageX;
        public float lastDrawingImageY;
        private ArrayList<MessageObject.TextLayoutBlock> lastDrawingTextBlocks;
        public float lastDrawingTextY;
        public boolean lastDrawnForwardedName;
        int lastForwardNameWidth;
        float lastForwardNameX;
        public int lastForwardedNamesOffset;
        private boolean lastIsPinned;
        private boolean lastIsPlayingRound;
        public boolean lastLocatinIsExpired;
        private int lastRepliesCount;
        private StaticLayout lastRepliesLayout;
        private boolean lastShouldDrawMenuDrawable;
        private boolean lastShouldDrawTimeOnMedia;
        private String lastSignMessage;
        private StaticLayout lastTimeLayout;
        private int lastTimeWidth;
        public int lastTimeX;
        public float lastTimeXPinned;
        private float lastTimeXReplies;
        private float lastTimeXViews;
        public int lastTopOffset;
        private int lastTotalCommentWidth;
        private int lastViewsCount;
        private StaticLayout lastViewsLayout;
        public boolean messageEntering;
        private boolean moveCaption;
        public boolean shouldAnimateTimeX;
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
            this.wasDraw = true;
            this.lastDrawingImageX = ChatMessageCell.this.photoImage.getImageX();
            this.lastDrawingImageY = ChatMessageCell.this.photoImage.getImageY();
            this.lastDrawingImageW = ChatMessageCell.this.photoImage.getImageWidth();
            this.lastDrawingImageH = ChatMessageCell.this.photoImage.getImageHeight();
            System.arraycopy(ChatMessageCell.this.photoImage.getRoundRadius(), 0, this.imageRoundRadius, 0, 4);
            if (ChatMessageCell.this.currentBackgroundDrawable != null) {
                this.lastDrawingBackgroundRect.set(ChatMessageCell.this.currentBackgroundDrawable.getBounds());
            }
            this.lastDrawingTextBlocks = ChatMessageCell.this.currentMessageObject.textLayoutBlocks;
            this.lastDrawingEdited = ChatMessageCell.this.edited;
            this.lastDrawingCaptionX = ChatMessageCell.this.captionX;
            this.lastDrawingCaptionY = ChatMessageCell.this.captionY;
            this.lastDrawingCaptionLayout = ChatMessageCell.this.captionLayout;
            this.lastDrawBotButtons.clear();
            if (!ChatMessageCell.this.botButtons.isEmpty()) {
                this.lastDrawBotButtons.addAll(ChatMessageCell.this.botButtons);
            }
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
            ChatMessageCell chatMessageCell = ChatMessageCell.this;
            this.lastIsPinned = chatMessageCell.isPinned;
            this.lastSignMessage = chatMessageCell.lastPostAuthor;
            this.lastButtonX = ChatMessageCell.this.buttonX;
            this.lastButtonY = ChatMessageCell.this.buttonY;
            this.lastDrawTime = !ChatMessageCell.this.forceNotDrawTime;
            this.lastTimeX = ChatMessageCell.this.timeX;
            this.lastTimeLayout = ChatMessageCell.this.timeLayout;
            this.lastTimeWidth = ChatMessageCell.this.timeWidth;
            this.lastShouldDrawTimeOnMedia = ChatMessageCell.this.shouldDrawTimeOnMedia();
            this.lastTopOffset = ChatMessageCell.this.getTopMediaOffset();
            this.lastShouldDrawMenuDrawable = ChatMessageCell.this.shouldDrawMenuDrawable();
            this.lastLocatinIsExpired = ChatMessageCell.this.locationExpired;
            this.lastIsPlayingRound = ChatMessageCell.this.isPlayingRound;
            this.lastDrawingTextY = ChatMessageCell.this.textY;
            int unused = ChatMessageCell.this.textX;
            this.lastDrawnForwardedNameLayout[0] = ChatMessageCell.this.forwardedNameLayout[0];
            this.lastDrawnForwardedNameLayout[1] = ChatMessageCell.this.forwardedNameLayout[1];
            this.lastDrawnForwardedName = ChatMessageCell.this.currentMessageObject.needDrawForwarded();
            this.lastForwardNameX = ChatMessageCell.this.forwardNameX;
            this.lastForwardedNamesOffset = ChatMessageCell.this.namesOffset;
            this.lastForwardNameWidth = ChatMessageCell.this.forwardedNameWidth;
            this.lastBackgroundLeft = ChatMessageCell.this.getCurrentBackgroundLeft();
            this.lastBackgroundRight = ChatMessageCell.this.currentBackgroundDrawable.getBounds().right;
            ChatMessageCell.this.reactionsLayoutInBubble.recordDrawingState();
            ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
            if (chatMessageCell2.replyNameLayout != null) {
                this.lastDrawReplyY = chatMessageCell2.replyStartY;
            } else {
                this.lastDrawReplyY = 0.0f;
            }
        }

        public void recordDrawingStatePreview() {
            this.lastDrawnForwardedNameLayout[0] = ChatMessageCell.this.forwardedNameLayout[0];
            this.lastDrawnForwardedNameLayout[1] = ChatMessageCell.this.forwardedNameLayout[1];
            this.lastDrawnForwardedName = ChatMessageCell.this.currentMessageObject.needDrawForwarded();
            this.lastForwardNameX = ChatMessageCell.this.forwardNameX;
            this.lastForwardedNamesOffset = ChatMessageCell.this.namesOffset;
            this.lastForwardNameWidth = ChatMessageCell.this.forwardedNameWidth;
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
            if (!(!this.imageChangeBoundsTransition || this.animateToImageW == 0.0f || this.animateToImageH == 0.0f)) {
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
            this.animateOutTextBlocks = null;
            this.animateEditedLayout = null;
            this.animateTimeLayout = null;
            this.animateEditedEnter = false;
            this.animateReplaceCaptionLayout = false;
            this.transformGroupToSingleMessage = false;
            this.animateOutCaptionLayout = null;
            this.moveCaption = false;
            this.animateDrawingTimeAlpha = false;
            this.transitionBotButtons.clear();
            this.animateButton = false;
            this.animateReplies = false;
            this.animateRepliesLayout = null;
            this.animateComments = false;
            this.animateCommentsLayout = null;
            this.animateViewsLayout = null;
            this.animateShouldDrawTimeOnMedia = false;
            this.animateShouldDrawMenuDrawable = false;
            this.shouldAnimateTimeX = false;
            this.animateSign = false;
            this.animateDrawingTimeAlpha = false;
            this.animateLocationIsExpired = false;
            this.animatePlayingRound = false;
            this.animateText = false;
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

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    private Drawable getThemedDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : Theme.getThemeDrawable(str);
    }

    private Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    private boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService();
    }
}
