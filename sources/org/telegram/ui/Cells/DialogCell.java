package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BubbleCounterPath;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DialogCellTags;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.PhotoBubbleClip;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ScamDrawable;
import org.telegram.ui.Components.StatusDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TimerDrawable;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.VectorAvatarThumbDrawable;
import org.telegram.ui.Components.dialogs.DialogMediaIconsHelper;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.RightSlidingDialogContainer;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.community.CommunityArrowDrawable;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;
import org.telegram.ui.web.AddressBarList;

public class DialogCell extends BaseCell implements StoriesListPlaceProvider.AvatarOverlaysView, Theme.Colorable {
    private static final float BADGE_DRAWABLE_OFFSET = 2.3330002f;
    private static final float BADGE_DRAWABLE_SIZE = 16.0f;
    private static final float BADGE_GAP = 17.0f;
    private static final float BADGE_MARGIN = 15.666f;
    private static final float BADGE_SIZE = 20.666f;
    private static final float BADGE_TEXT_MIN_WIDTH = 8.0f;
    private static final float BADGE_TEXT_PADDING = 6.333f;
    public static final int SENT_STATE_NOTHING = -1;
    public static final int SENT_STATE_PROGRESS = 0;
    public static final int SENT_STATE_READ = 2;
    public static final int SENT_STATE_SENT = 1;
    private int[] adaptiveEmojiColor;
    private ColorFilter[] adaptiveEmojiColorFilter;
    public int addForumHeightForTags;
    public int addHeightForTags;
    private boolean allowBotOpenButton;
    private int animateFromStatusDrawableParams;
    private int animateToStatusDrawableParams;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack2;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack3;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStackName;
    private boolean animatingArchiveAvatar;
    private float animatingArchiveAvatarProgress;
    private BoolAnimator animatorPollVotesMentionVisible;
    private boolean applyName;
    private float archiveBackgroundProgress;
    private GradientDrawable archiveFadeGradientDrawable;
    private int archiveFadeGradientDrawableColor;
    private boolean archiveHidden;
    protected PullForegroundDrawable archivedChatsDrawable;
    private boolean attachedToWindow;
    private AvatarDrawable avatarDrawable;
    public ImageReceiver avatarImage;
    public int avatarStart;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerification;
    private int bottomClip;
    private PhotoBubbleClip bubbleClip;
    private Paint buttonBackgroundPaint;
    private boolean buttonCreated;
    private StaticLayout buttonLayout;
    private int buttonLeft;
    private int buttonTop;
    CanvasButton canvasButton;
    public boolean channelShouldUseLineWidth;
    private TLRPC.Chat chat;
    private float chatCallProgress;
    protected CheckBox2 checkBox;
    private int checkDrawLeft;
    private int checkDrawLeft1;
    private int checkDrawTop;
    public float chekBoxPaddingTop;
    private boolean clearingDialog;
    private float clipProgress;
    private int clockDrawLeft;
    public float collapseOffset;
    public boolean collapsed;
    private CommunityArrowDrawable communityArrowDrawable;
    private float cornerProgress;
    private StaticLayout countAnimationInLayout;
    private boolean countAnimationIncrement;
    private StaticLayout countAnimationStableLayout;
    private ValueAnimator countAnimator;
    private float countChangeProgress;
    private StaticLayout countLayout;
    private int countLeft;
    private int countLeftOld;
    private StaticLayout countOldLayout;
    private int countTop;
    private int countWidth;
    private int countWidthOld;
    private Paint counterPaintOutline;
    private Path counterPath;
    private RectF counterPathRect;
    private int currentAccount;
    private long currentDialogCommunityId;
    private int currentDialogFolderDialogsCount;
    private int currentDialogFolderId;
    private long currentDialogId;
    private int currentEditDate;
    private TextPaint currentMessagePaint;
    private float currentRevealBounceProgress;
    private float currentRevealProgress;
    private CustomDialog customDialog;
    private String customMessage;
    DialogCellDelegate delegate;
    private boolean dialogMuted;
    private float dialogMutedProgress;
    private int dialogsType;
    private TLRPC.DraftMessage draftMessage;
    private boolean draftVoice;
    public boolean drawArchive;
    public boolean drawAvatar;
    public boolean drawAvatarSelector;
    private boolean drawBotVerified;
    private boolean drawCheck1;
    private boolean drawCheck2;
    private boolean drawClock;
    private boolean drawCommunityAvatar;
    private boolean drawCount;
    private boolean drawCount2;
    private boolean drawError;
    private boolean drawForwardIcon;
    private boolean drawGiftIcon;
    private boolean drawMention;
    public boolean drawMonoforumAvatar;
    private boolean drawNameLock;
    private boolean drawPin;
    private boolean drawPinBackground;
    private boolean drawPinForced;
    private boolean[] drawPlay;
    private boolean drawPollVotesMention;
    private boolean drawPremium;
    private boolean drawReactionMention;
    private boolean drawReorder;
    private boolean drawRevealBackground;
    private int drawScam;
    private boolean[] drawSpoiler;
    private boolean drawUnmute;
    private boolean drawVerified;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatus;
    private final View emojiStatusView;
    private TLRPC.EncryptedChat encryptedChat;
    private int errorLeft;
    private int errorTop;
    private Paint fadePaint;
    private Paint fadePaintBack;
    private int folderId;
    protected boolean forbidDraft;
    protected boolean forbidVerified;
    private ForumFormattedNames forumFormattedNames;
    public TLRPC.TL_forumTopic forumTopic;
    public boolean fullSeparator;
    public boolean fullSeparator2;
    private ArrayList<MessageObject> groupMessages;
    private int halfCheckDrawLeft;
    private boolean hasCall;
    private boolean hasNameInMessage;
    private boolean hasUnmutedCommunityDialogs;
    private boolean hasUnmutedTopics;
    private boolean hasVideoThumb;
    public int heightDefault;
    public int heightThreeLines;
    public boolean inPreviewMode;
    private float innerProgress;
    public boolean insideCommunityList;
    public boolean insideCommunityListNoDialog;
    private BounceInterpolator interpolator;
    public boolean isDialogCell;
    public boolean isForChannelSubscriberCell;
    private boolean isForum;
    public boolean isHiddenInCommunity;
    public boolean isMonoForumTopicDialog;
    public boolean isSavedDialog;
    public boolean isSavedDialogCell;
    private boolean isSelected;
    private boolean isShareToStoryCell;
    private boolean isSliding;
    private boolean isTopic;
    public boolean isTransitionSupport;
    long lastDialogChangedTime;
    private int lastDrawSwipeMessageStringId;
    private RLottieDrawable lastDrawTranslationDrawable;
    private int lastMessageDate;
    private CharSequence lastMessageString;
    private CharSequence lastPrintString;
    private int lastSendState;
    int lastSize;
    private int lastStatusDrawableParams;
    private boolean lastTopicMessageUnread;
    private boolean lastUnreadState;
    private long lastUpdateTime;
    private int lock2Left;
    private Drawable lockDrawable;
    private boolean markUnread;
    private int mentionCount;
    private StaticLayout mentionLayout;
    private int mentionLeft;
    private int mentionWidth;
    private MessageObject message;
    private int messageId;
    private StaticLayout messageLayout;
    private int messageLeft;
    private StaticLayout messageNameLayout;
    private int messageNameLeft;
    private int messageNameTop;
    public int messagePaddingStart;
    private int messageTop;
    boolean moving;
    public int nameAdditionalsForChannelSubscriber;
    private boolean nameIsEllipsized;
    public StaticLayout nameLayout;
    private boolean nameLayoutEllipsizeByGradient;
    private boolean nameLayoutEllipsizeLeft;
    private boolean nameLayoutFits;
    public float nameLayoutTranslateX;
    public int nameLeft;
    private int nameLockLeft;
    private int nameLockTop;
    private int nameMuteLeft;
    private int nameMutedIconLeft;
    public int namePaddingEnd;
    public int nameWidth;
    private boolean needEmoji;
    private Utilities.Callback<TLRPC.User> onOpenButtonClick;
    private float onlineProgress;
    private boolean openBot;
    private final Paint openButtonBackgroundPaint;
    private final ButtonBounce openButtonBounce;
    private final RectF openButtonRect;
    private Text openButtonText;
    protected boolean overrideSwipeAction;
    protected int overrideSwipeActionBackgroundColorKey;
    protected RLottieDrawable overrideSwipeActionDrawable;
    protected int overrideSwipeActionRevealBackgroundColorKey;
    protected int overrideSwipeActionStringId;
    protected String overrideSwipeActionStringKey;
    private int paintIndex;
    private DialogsActivity parentFragment;
    private int pinLeft;
    private int pinTop;
    private int pollVotesMentionCount;
    private int pollVotesMentionLeft;
    private DialogsAdapter.DialogsPreloader preloader;
    private boolean premiumBlocked;
    private final AnimatedFloat premiumBlockedT;
    private PremiumGradient.PremiumGradientTools premiumGradient;
    private int printingStringType;
    private int progressStage;
    private boolean promoDialog;
    private int reactionMentionCount;
    private int reactionMentionLeft;
    private ValueAnimator reactionsMentionsAnimator;
    private float reactionsMentionsChangeProgress;
    private int readOutboxMaxId;
    private RectF rect;
    private int reorderGradientLastColor;
    private Paint reorderGradientPaint;
    private float reorderIconProgress;
    public ShareDialogCell.RepostStoryDrawable repostStoryDrawable;
    private final Theme.ResourcesProvider resourcesProvider;
    public float rightFragmentOffset;
    private float rightFragmentOpenedProgress;
    private boolean showTopicIconInName;
    private boolean showTtl;
    private List<SpoilerEffect> spoilers;
    private List<SpoilerEffect> spoilers2;
    private Stack<SpoilerEffect> spoilersPool;
    private Stack<SpoilerEffect> spoilersPool2;
    private Drawable starBg;
    private int starBgColor;
    private Drawable starFg;
    private final AnimatedFloat starsBlockedT;
    private long starsPriceBlocked;
    private boolean statusDrawableAnimationInProgress;
    private ValueAnimator statusDrawableAnimator;
    private int statusDrawableLeft;
    private float statusDrawableProgress;
    public final StoriesUtilities.AvatarStoryParams storyParams;
    public boolean swipeCanceled;
    private int swipeMessageTextId;
    private StaticLayout swipeMessageTextLayout;
    private int swipeMessageWidth;
    public DialogCellTags tags;
    private int tagsLeft;
    private int tagsRight;
    private Paint thumbBackgroundPaint;
    private ImageReceiver[] thumbImage;
    private boolean[] thumbImageSeen;
    private Path thumbPath;
    int thumbSize;
    private SpoilerEffect thumbSpoiler;
    private int thumbsCount;
    private StaticLayout timeLayout;
    private int timeLeft;
    private int timeTop;
    private TimerDrawable timerDrawable;
    private Paint timerPaint;
    private Paint timerPaint2;
    private String titleOverride;
    private int topClip;
    int topMessageTopicEndIndex;
    int topMessageTopicStartIndex;
    private Paint topicCounterPaint;
    protected Drawable[] topicIconInName;
    private boolean topicMuted;
    protected int translateY;
    private boolean translationAnimationStarted;
    private RLottieDrawable translationDrawable;
    protected float translationX;
    private int ttlPeriod;
    private float ttlProgress;
    private boolean twoLinesForName;
    private StaticLayout typingLayout;
    private int typingLeft;
    private int unreadCount;
    private Runnable unsubscribePremiumBlocked;
    private final DialogUpdateHelper updateHelper;
    private boolean updateLayout;
    public boolean useForceThreeLines;
    public boolean useFromUserAsAvatar;
    private boolean useMeForMyMessages;
    public boolean useSeparator;
    private TLRPC.User user;
    private boolean visibleOnScreen;
    private boolean wasDrawnOnline;
    protected float xOffset;

    public final class AnonymousClass3 extends CheckBox2 {
        public final int $r8$classId;
        public final ViewGroup this$0;

        public AnonymousClass3(ViewGroup viewGroup, Context context, Theme.ResourcesProvider resourcesProvider, int i) {
            super(context, 21, resourcesProvider);
            this.$r8$classId = i;
            this.this$0 = viewGroup;
        }

        @Override
        public final void invalidate() {
            switch (this.$r8$classId) {
                case 0:
                    super.invalidate();
                    ((DialogCell) this.this$0).invalidate();
                    break;
                case 1:
                    super.invalidate();
                    ((GalleryListView.Cell) this.this$0).invalidate();
                    break;
                default:
                    super.invalidate();
                    ((AddressBarList.BookmarkView) this.this$0).invalidate();
                    break;
            }
        }

        public AnonymousClass3(GalleryListView.Cell cell, Context context, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(context, 24, darkThemeResourceProvider);
            this.$r8$classId = 1;
            this.this$0 = cell;
        }
    }

    public final class AnonymousClass4 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final DialogCell this$0;

        public AnonymousClass4(DialogCell dialogCell, int i) {
            this.$r8$classId = i;
            this.this$0 = dialogCell;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    DialogCell dialogCell = this.this$0;
                    dialogCell.countChangeProgress = 1.0f;
                    dialogCell.countOldLayout = null;
                    dialogCell.countAnimationStableLayout = null;
                    dialogCell.countAnimationInLayout = null;
                    dialogCell.invalidate();
                    break;
                case 1:
                    DialogCell dialogCell2 = this.this$0;
                    dialogCell2.reactionsMentionsChangeProgress = 1.0f;
                    dialogCell2.invalidate();
                    break;
                default:
                    DialogCell dialogCell3 = this.this$0;
                    int i = (dialogCell3.drawClock ? 1 : 0) + (dialogCell3.drawCheck1 ? 2 : 0) + (dialogCell3.drawCheck2 ? 4 : 0);
                    if (dialogCell3.animateToStatusDrawableParams != i) {
                        dialogCell3.createStatusDrawableAnimator(dialogCell3.animateToStatusDrawableParams, i);
                    } else {
                        dialogCell3.statusDrawableAnimationInProgress = false;
                        dialogCell3.lastStatusDrawableParams = dialogCell3.animateToStatusDrawableParams;
                    }
                    dialogCell3.invalidate();
                    break;
            }
        }
    }

    public final class BounceInterpolator implements Interpolator {
        @Override
        public final float getInterpolation(float f) {
            if (f < 0.33f) {
                return (f / 0.33f) * 0.1f;
            }
            float f2 = f - 0.33f;
            return f2 < 0.33f ? TextureRenderer$$ExternalSyntheticOutline0.m(f2, 0.34f, 0.15f, 0.1f) : (((f2 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
        }
    }

    public final class CustomDialog {
        public int date;
        public int id;
        public boolean isMedia;
        public String message;
        public boolean muted;
        public String name;
        public boolean pinned;
        public int sent = -1;
        public int type;
        public int unread_count;
        public boolean verified;
    }

    public interface DialogCellDelegate {
        boolean canClickButtonInside();

        void onButtonClicked(DialogCell dialogCell);

        void onButtonLongPress(DialogCell dialogCell);

        void openHiddenStories();

        void openStory(DialogCell dialogCell, Runnable runnable);

        void showChatPreview(DialogCell dialogCell);
    }

    public final class DialogUpdateHelper {
        public long lastDrawnDialogId;
        public boolean lastDrawnDialogIsFolder;
        public int lastDrawnDraftHash;
        public boolean lastDrawnHasCall;
        public long lastDrawnMessageId;
        public boolean lastDrawnPinned;
        public Integer lastDrawnPrintingType;
        public long lastDrawnReadState;
        public int lastDrawnSizeHash;
        public boolean lastDrawnTranslated;
        public int lastKnownTypingType;
        public int lastTopicsCount;
        public long startWaitingTime;
        public boolean typingOutToTop;
        public float typingProgres;
        public boolean waitngNewMessageFroTypingAnimation = false;

        public DialogUpdateHelper() {
        }

        public final boolean update() {
            int iHashCode;
            int size;
            boolean z;
            boolean z2;
            TLRPC.DraftMessage draft;
            int i;
            int i2;
            DialogCell dialogCell = DialogCell.this;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(dialogCell.currentAccount).dialogs_dict.get(dialogCell.currentDialogId);
            if (dialog == null) {
                if (dialogCell.dialogsType != 3 || this.lastDrawnDialogId == dialogCell.currentDialogId) {
                    return false;
                }
                this.lastDrawnDialogId = dialogCell.currentDialogId;
                return true;
            }
            if (dialogCell.message == null) {
                iHashCode = 0;
            } else {
                iHashCode = dialogCell.message.hashCode() + dialogCell.message.getId();
            }
            long j = ((long) dialog.read_inbox_max_id) + (((long) dialog.read_outbox_max_id) << 8) + (((long) (dialog.unread_count + (dialog.unread_mark ? -1 : 0))) << 16) + ((long) (dialog.unread_reactions_count > 0 ? 262144 : 0)) + ((long) (dialog.unread_mentions_count > 0 ? 524288 : 0)) + ((long) (dialog.unread_poll_votes_count > 0 ? 2097152 : 0));
            if (dialogCell.isForumCell()) {
                int[] forumUnreadCount = MessagesController.getInstance(dialogCell.currentAccount).getTopicsController().getForumUnreadCount(-dialogCell.currentDialogId);
                if (forumUnreadCount[2] > 0) {
                    j |= 1048576;
                }
                if (forumUnreadCount[4] > 0) {
                    j |= 4194304;
                }
            }
            Integer printingStringType = (dialogCell.isForumCell() || !(dialogCell.isDialogCell || dialogCell.isTopic) || TextUtils.isEmpty(MessagesController.getInstance(dialogCell.currentAccount).getPrintingString(dialogCell.currentDialogId, (long) dialogCell.getTopicId(), true))) ? null : MessagesController.getInstance(dialogCell.currentAccount).getPrintingStringType(dialogCell.currentDialogId, dialogCell.getTopicId());
            int measuredWidth = dialogCell.getMeasuredWidth() + (dialogCell.getMeasuredHeight() << 16);
            if (dialogCell.isForumCell()) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(dialogCell.currentAccount).getTopicsController().getTopics(-dialogCell.currentDialogId);
                size = topics == null ? -1 : topics.size();
                if (size == -1 && MessagesController.getInstance(dialogCell.currentAccount).getTopicsController().endIsReached(-dialogCell.currentDialogId)) {
                    size = 0;
                }
            } else {
                size = 0;
            }
            if (dialogCell.isTopic) {
                z = false;
                z2 = MediaDataController.getInstance(dialogCell.currentAccount).getDraftVoice(dialogCell.currentDialogId, (long) dialogCell.getTopicId()) != null;
                draft = !z2 ? MediaDataController.getInstance(dialogCell.currentAccount).getDraft(dialogCell.currentDialogId, dialogCell.getTopicId()) : null;
                if (draft != null && TextUtils.isEmpty(draft.message)) {
                    draft = null;
                }
            } else {
                iHashCode = iHashCode;
                z = false;
                if (dialogCell.isDialogCell) {
                    z2 = MediaDataController.getInstance(dialogCell.currentAccount).getDraftVoice(dialogCell.currentDialogId, 0L) != null;
                    if (!z2) {
                        draft = MediaDataController.getInstance(dialogCell.currentAccount).getDraft(dialogCell.currentDialogId, 0L);
                    }
                } else {
                    z2 = false;
                }
                draft = null;
            }
            if (draft == null) {
                i = 0;
            } else {
                int iHashCode2 = draft.message.hashCode();
                TLRPC.InputReplyTo inputReplyTo = draft.reply_to;
                i = (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : 0) + iHashCode2;
            }
            boolean z3 = dialogCell.chat != null && dialogCell.chat.call_active && dialogCell.chat.call_not_empty;
            boolean zIsTranslatingDialog = MessagesController.getInstance(dialogCell.currentAccount).getTranslateController().isTranslatingDialog(dialogCell.currentDialogId);
            if (this.lastDrawnSizeHash == measuredWidth && this.lastDrawnMessageId == iHashCode && this.lastDrawnTranslated == zIsTranslatingDialog && this.lastDrawnDialogId == dialogCell.currentDialogId && this.lastDrawnDialogIsFolder == dialog.isFolder && this.lastDrawnReadState == j && Objects.equals(this.lastDrawnPrintingType, printingStringType) && this.lastTopicsCount == size && i == this.lastDrawnDraftHash && this.lastDrawnPinned == dialogCell.drawPin && this.lastDrawnHasCall == z3 && dialogCell.draftVoice == z2) {
                return z;
            }
            if (this.lastDrawnDialogId == dialogCell.currentDialogId) {
                if (!Objects.equals(this.lastDrawnPrintingType, printingStringType) || this.waitngNewMessageFroTypingAnimation) {
                    boolean z4 = this.waitngNewMessageFroTypingAnimation;
                    if (z4 || printingStringType != null) {
                        if (z4 && this.lastDrawnMessageId != iHashCode) {
                            this.waitngNewMessageFroTypingAnimation = false;
                        }
                        i2 = i;
                        if (this.lastDrawnMessageId != iHashCode) {
                            this.typingOutToTop = false;
                        } else {
                            this.typingOutToTop = true;
                        }
                    } else {
                        this.waitngNewMessageFroTypingAnimation = true;
                        this.startWaitingTime = System.currentTimeMillis();
                    }
                    i2 = i;
                    if (this.lastDrawnMessageId != iHashCode) {
                        this.typingOutToTop = false;
                    } else {
                        this.typingOutToTop = true;
                    }
                }
                if (printingStringType != null) {
                    this.lastKnownTypingType = printingStringType.intValue();
                }
                this.lastDrawnDialogId = dialogCell.currentDialogId;
                this.lastDrawnMessageId = iHashCode;
                this.lastDrawnDialogIsFolder = dialog.isFolder;
                this.lastDrawnReadState = j;
                this.lastDrawnPrintingType = printingStringType;
                this.lastDrawnSizeHash = measuredWidth;
                this.lastDrawnDraftHash = i2;
                this.lastTopicsCount = size;
                this.lastDrawnPinned = dialogCell.drawPin;
                this.lastDrawnHasCall = z3;
                this.lastDrawnTranslated = zIsTranslatingDialog;
                return true;
            }
            this.typingProgres = printingStringType == null ? 0.0f : 1.0f;
            this.waitngNewMessageFroTypingAnimation = false;
            i2 = i;
            if (printingStringType != null) {
                this.lastKnownTypingType = printingStringType.intValue();
            }
            this.lastDrawnDialogId = dialogCell.currentDialogId;
            this.lastDrawnMessageId = iHashCode;
            this.lastDrawnDialogIsFolder = dialog.isFolder;
            this.lastDrawnReadState = j;
            this.lastDrawnPrintingType = printingStringType;
            this.lastDrawnSizeHash = measuredWidth;
            this.lastDrawnDraftHash = i2;
            this.lastTopicsCount = size;
            this.lastDrawnPinned = dialogCell.drawPin;
            this.lastDrawnHasCall = z3;
            this.lastDrawnTranslated = zIsTranslatingDialog;
            return true;
        }

        public final void updateAnimationValues() {
            float f;
            boolean z = this.waitngNewMessageFroTypingAnimation;
            DialogCell dialogCell = DialogCell.this;
            if (z) {
                if (System.currentTimeMillis() - this.startWaitingTime > 100) {
                    this.waitngNewMessageFroTypingAnimation = false;
                }
                dialogCell.invalidate();
                return;
            }
            if (this.lastDrawnPrintingType != null && dialogCell.typingLayout != null) {
                float f2 = this.typingProgres;
                if (f2 != 1.0f) {
                    this.typingProgres = f2 + 0.08f;
                    dialogCell.invalidate();
                } else if (this.lastDrawnPrintingType == null) {
                    f = this.typingProgres;
                    if (f != 0.0f) {
                        this.typingProgres = f - 0.08f;
                        dialogCell.invalidate();
                    }
                }
            } else if (this.lastDrawnPrintingType == null) {
                f = this.typingProgres;
                if (f != 0.0f) {
                    this.typingProgres = f - 0.08f;
                    dialogCell.invalidate();
                }
            }
            this.typingProgres = Utilities.clamp(this.typingProgres, 1.0f, 0.0f);
        }
    }

    public final class FixedWidthSpan extends ReplacementSpan {
        public final int width;

        public FixedWidthSpan(int i) {
            this.width = i;
        }

        @Override
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        @Override
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            if (fontMetricsInt == null) {
                fontMetricsInt = paint.getFontMetricsInt();
            }
            if (fontMetricsInt != null) {
                int i3 = 1 - (fontMetricsInt.descent - fontMetricsInt.ascent);
                fontMetricsInt.descent = i3;
                fontMetricsInt.bottom = i3;
                fontMetricsInt.ascent = -1;
                fontMetricsInt.top = -1;
            }
            return this.width;
        }
    }

    public final class ForumFormattedNames {
        public HashMap avatarSpans;
        public CharSequence formattedNames;
        public boolean isLoadingState;
        public int lastMessageId;
        public boolean lastTopicMessageUnread;
        public final DialogCell parent;
        public int topMessageTopicEndIndex;

        public ForumFormattedNames(DialogCell dialogCell) {
            this.parent = dialogCell;
        }
    }

    public DialogCell(DialogsActivity dialogsActivity, Context context, boolean z, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.drawArchive = true;
        this.drawAvatar = true;
        int i2 = 0;
        this.drawMonoforumAvatar = false;
        this.avatarStart = 11;
        this.messagePaddingStart = 72;
        this.heightDefault = 70;
        this.heightThreeLines = 76;
        this.addHeightForTags = 3;
        this.addForumHeightForTags = 11;
        this.chekBoxPaddingTop = 42.0f;
        StoriesUtilities.AvatarStoryParams avatarStoryParams = new StoriesUtilities.AvatarStoryParams() {
            @Override
            public final boolean isAvatarClickable(long j, TLRPC.Chat chat, TLRPC.User user) {
                return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || DialogCell.this.insideCommunityList) ? false : true;
            }

            @Override
            public final boolean onAvatarClick(View view, long j) {
                DialogCell dialogCell = DialogCell.this;
                if (dialogCell.parentFragment != null && !dialogCell.insideCommunityList) {
                    if (j > 0) {
                        TLRPC.User user = MessagesController.getInstance(dialogCell.currentAccount).getUser(Long.valueOf(j));
                        if (user != null && user.linked_community_id != 0) {
                            dialogCell.parentFragment.showDialog(new CommunitySheet(dialogCell.parentFragment, user.linked_community_id, null, null));
                            return true;
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(dialogCell.currentAccount).getChat(Long.valueOf(-j));
                        if (chat != null && chat.linked_community_id != 0) {
                            dialogCell.parentFragment.showDialog(new CommunitySheet(dialogCell.parentFragment, chat.linked_community_id, null, null));
                            return true;
                        }
                    }
                }
                return super.onAvatarClick(view, j);
            }

            @Override
            public final void onLongPress() {
                DialogCell dialogCell = DialogCell.this;
                DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
                if (dialogCellDelegate == null) {
                    return;
                }
                dialogCellDelegate.showChatPreview(dialogCell);
            }

            @Override
            public final void openStory(long j, Runnable runnable) {
                DialogCell dialogCell = DialogCell.this;
                if (dialogCell.delegate == null) {
                    return;
                }
                if (dialogCell.currentDialogFolderId != 0) {
                    dialogCell.delegate.openHiddenStories();
                    return;
                }
                DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
                if (dialogCellDelegate != null) {
                    dialogCellDelegate.openStory(dialogCell, null);
                }
            }
        };
        this.storyParams = avatarStoryParams;
        this.visibleOnScreen = true;
        this.collapseOffset = 0.0f;
        this.hasUnmutedTopics = false;
        this.hasUnmutedCommunityDialogs = false;
        this.openButtonBounce = new ButtonBounce(this);
        this.openButtonBackgroundPaint = new Paint(1);
        this.openButtonRect = new RectF();
        this.overrideSwipeAction = false;
        this.thumbImageSeen = new boolean[3];
        this.thumbImage = new ImageReceiver[3];
        this.drawPlay = new boolean[3];
        this.drawSpoiler = new boolean[3];
        this.avatarImage = new ImageReceiver(this);
        this.avatarDrawable = new AvatarDrawable();
        this.interpolator = new BounceInterpolator();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.starsBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.spoilersPool = new Stack<>();
        this.spoilers = new ArrayList();
        this.spoilersPool2 = new Stack<>();
        this.spoilers2 = new ArrayList();
        this.drawCount2 = true;
        this.animatorPollVotesMentionVisible = new BoolAnimator(this, cubicBezierInterpolator, 320L);
        this.countChangeProgress = 1.0f;
        this.reactionsMentionsChangeProgress = 1.0f;
        this.rect = new RectF();
        this.lastStatusDrawableParams = -1;
        this.readOutboxMaxId = -1;
        this.updateHelper = new DialogUpdateHelper();
        avatarStoryParams.allowLongress = true;
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = dialogsActivity;
        Theme.createDialogsResources(context);
        this.drawMonoforumAvatar = false;
        this.drawCommunityAvatar = false;
        this.avatarImage.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.thumbImage;
            if (i2 >= imageReceiverArr.length) {
                this.useForceThreeLines = z;
                this.currentAccount = i;
                View view = new View(context) {
                    @Override
                    public final void onDraw(Canvas canvas) {
                        DialogCell dialogCell = DialogCell.this;
                        dialogCell.emojiStatus.setBounds(0, 0, getWidth(), getHeight());
                        dialogCell.emojiStatus.draw(canvas);
                    }
                };
                this.emojiStatusView = view;
                addView(view);
                this.emojiStatus = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, AndroidUtilities.dp(22.0f));
                this.botVerification = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(17.0f));
                this.avatarImage.setAllowLoadingOnAttachedOnly(true);
                return;
            }
            imageReceiverArr[i2] = new ImageReceiver(this);
            ImageReceiver imageReceiver = this.thumbImage[i2];
            imageReceiver.ignoreNotifications = true;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
            this.thumbImage[i2].setAllowLoadingOnAttachedOnly(true);
            i2++;
        }
    }

    public static SpannableStringBuilder formatInternal(int i, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 1) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i == 2) {
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i == 3) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
            return spannableStringBuilder;
        }
        if (i != 4) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private MessageObject getCaptionMessage() {
        CharSequence charSequence;
        if (this.groupMessages == null) {
            MessageObject messageObject = this.message;
            if (messageObject == null || messageObject.caption == null) {
                return null;
            }
            return messageObject;
        }
        MessageObject messageObject2 = null;
        int i = 0;
        for (int i2 = 0; i2 < this.groupMessages.size(); i2++) {
            MessageObject messageObject3 = this.groupMessages.get(i2);
            if (messageObject3 != null && (charSequence = messageObject3.caption) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i++;
                }
                messageObject2 = messageObject3;
            }
        }
        if (i > 1) {
            return null;
        }
        return messageObject2;
    }

    private int getCollapsedHeight() {
        int iDp = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? this.heightThreeLines : this.heightDefault) + 1;
        if (this.twoLinesForName) {
            iDp += AndroidUtilities.dp(20.0f);
        }
        if (!hasTags() || ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !isForumCell())) {
            return iDp;
        }
        return AndroidUtilities.dp(isForumCell() ? this.addForumHeightForTags : this.addHeightForTags) + iDp;
    }

    private Paint getPaintReorderGradient() {
        int color = Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider);
        if (this.reorderGradientLastColor != color || this.reorderGradientPaint == null) {
            this.reorderGradientLastColor = color;
            if (this.reorderGradientPaint == null) {
                this.reorderGradientPaint = new Paint(1);
            }
            this.reorderGradientPaint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, color}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.reorderGradientPaint;
    }

    private TextPaint getTimeTextPaint() {
        if (this.drawCount) {
            return isCounterMuted() ? Theme.dialogs_timePaintBold : Theme.dialogs_timePaintBoldAccent;
        }
        return Theme.dialogs_timePaint;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.forumTopic;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public DialogCell allowBotOpenButton(boolean z, Utilities.Callback<TLRPC.User> callback) {
        this.allowBotOpenButton = z;
        this.onOpenButtonClick = callback;
        return this;
    }

    public void animateArchiveAvatar() {
        if (this.avatarDrawable.getAvatarType() != 2) {
            return;
        }
        this.animatingArchiveAvatar = true;
        this.animatingArchiveAvatarProgress = 0.0f;
        Theme.dialogs_archiveAvatarDrawable.setProgress(0.0f);
        Theme.dialogs_archiveAvatarDrawable.start();
        invalidate();
    }

    public final CharSequence applyThumbs(CharSequence charSequence) {
        if (this.thumbsCount <= 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        spannableStringBuilderValueOf.insert(0, (CharSequence) " ");
        spannableStringBuilderValueOf.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 3)), 0, 1, 33);
        return spannableStringBuilderValueOf;
    }

    public void buildLayout() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.DialogCell.buildLayout():void");
    }

    public boolean checkCurrentDialogIndex(boolean z) {
        return false;
    }

    public void checkHeight() {
        if (getMeasuredHeight() <= 0 || getMeasuredHeight() == computeHeight()) {
            return;
        }
        requestLayout();
    }

    public final void checkTtl() {
        CheckBox2 checkBox2;
        boolean z = this.ttlPeriod > 0 && !this.hasCall && !isOnline() && ((checkBox2 = this.checkBox) == null || !checkBox2.isChecked()) && !this.storyParams.drawnLive;
        this.showTtl = z;
        this.ttlProgress = z ? 1.0f : 0.0f;
    }

    public final int computeHeight() {
        if (!isForumCell() || this.isTransitionSupport || this.collapsed) {
            return getCollapsedHeight();
        }
        int iDp = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 86.0f : 91.0f);
        if (this.useSeparator) {
            iDp++;
        }
        return hasTags() ? AndroidUtilities.dp(this.addForumHeightForTags) + iDp : iDp;
    }

    public final void createStatusDrawableAnimator(int i, int i2) {
        this.statusDrawableProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.statusDrawableAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(220L);
        this.statusDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.animateFromStatusDrawableParams = i;
        this.animateToStatusDrawableParams = i2;
        this.statusDrawableAnimator.addUpdateListener(new DialogCell$$ExternalSyntheticLambda0(this, 0));
        this.statusDrawableAnimator.addListener(new AnonymousClass4(this, 2));
        this.statusDrawableAnimationInProgress = true;
        this.statusDrawableAnimator.start();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.isTopic && !this.isShareToStoryCell && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.storyParams.checkOnTouchEvent(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawAvatarOverlays(Canvas canvas) {
        boolean z;
        float f;
        int iDp;
        int i;
        float fDp;
        float fDp2;
        float fDp3;
        float f2;
        float fDp4;
        float fDp5;
        float fDp6;
        float f3;
        float fDp7;
        float fDp8;
        float f4;
        float fDp9;
        float fDp10;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        int i2;
        float f13;
        boolean z2;
        float f14;
        float fDp11;
        TLRPC.Chat chat = this.chat;
        boolean z3 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z = false;
        } else {
            float imageY2 = this.avatarImage.getImageY2();
            float imageX2 = this.avatarImage.getImageX2();
            CheckBox2 checkBox2 = this.checkBox;
            float progress = (checkBox2 == null || !checkBox2.isChecked()) ? 1.0f : 1.0f - this.checkBox.getProgress();
            if (this.starBg == null) {
                this.starBg = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
            if (this.starBgColor != color) {
                Drawable drawable = this.starBg;
                this.starBgColor = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            if (this.starFg == null) {
                this.starFg = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int iDp2 = AndroidUtilities.dp(19.33f);
            Rect rect = AndroidUtilities.rectTmp2;
            int i3 = (int) imageX2;
            int i4 = (int) imageY2;
            int i5 = i4 - iDp2;
            rect.set((AndroidUtilities.dp(1.66f) + i3) - iDp2, i5, AndroidUtilities.dp(1.66f) + i3, i4);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.starBg.setBounds(rect);
            int i6 = (int) (progress * 255.0f);
            this.starBg.setAlpha(i6);
            this.starBg.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i3) - iDp2, i5, AndroidUtilities.dp(1.66f) + i3, i4);
            this.starFg.setBounds(rect);
            this.starFg.setAlpha(i6);
            this.starFg.draw(canvas);
            z = true;
        }
        float f15 = this.premiumBlockedT.set(this.premiumBlocked && !z);
        float f16 = 10.0f;
        if (f15 > 0.0f) {
            float centerY = this.avatarImage.getCenterY() + AndroidUtilities.dp(18.0f);
            float centerX = this.avatarImage.getCenterX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * f15, Theme.dialogs_onlineCirclePaint);
            if (this.premiumGradient == null) {
                this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, this.resourcesProvider);
            }
            this.premiumGradient.gradientMatrix((int) (centerX - AndroidUtilities.dp(10.0f)), (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), (int) (AndroidUtilities.dp(10.0f) + centerY), 0.0f, 0.0f);
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * f15, this.premiumGradient.paint);
            if (this.lockDrawable == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable2 = this.lockDrawable;
            drawable2.setBounds((int) (centerX - (((drawable2.getIntrinsicWidth() / 2.0f) * 0.875f) * f15)), (int) (centerY - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f15)), (int) (((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f15) + centerX), (int) (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f15) + centerY));
            this.lockDrawable.setAlpha((int) (f15 * 255.0f));
            this.lockDrawable.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.isDialogCell || this.currentDialogFolderId != 0 || z) {
            return false;
        }
        boolean z4 = (this.ttlPeriod <= 0 || isOnline() || this.hasCall || this.storyParams.drawnLive) ? false : true;
        this.showTtl = z4;
        if (this.rightFragmentOpenedProgress != 1.0f && (z4 || this.ttlProgress > 0.0f)) {
            TimerDrawable timerDrawable = this.timerDrawable;
            if (timerDrawable != null) {
                int time = timerDrawable.getTime();
                int i7 = this.ttlPeriod;
                if (time != i7 && i7 > 0) {
                    this.timerDrawable = TimerDrawable.getTtlIconForDialogs(this.ttlPeriod);
                }
            } else {
                this.timerDrawable = TimerDrawable.getTtlIconForDialogs(this.ttlPeriod);
            }
            if (this.timerPaint == null) {
                this.timerPaint = new Paint(1);
                Paint paint = new Paint(1);
                this.timerPaint2 = paint;
                paint.setColor(838860800);
            }
            int imageY3 = (int) (this.avatarImage.getImageY2() - AndroidUtilities.dp(9.0f));
            int iDp3 = (int) (LocaleController.isRTL ? this.storyParams.originalAvatarRect.left + AndroidUtilities.dp(9.0f) : this.storyParams.originalAvatarRect.right - AndroidUtilities.dp(9.0f));
            this.timerDrawable.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.timerDrawable.setTime(this.ttlPeriod);
            if (this.avatarImage.updateThumbShaderMatrix()) {
                ImageReceiver imageReceiver = this.avatarImage;
                BitmapShader bitmapShader = imageReceiver.thumbShader;
                if (bitmapShader != null) {
                    this.timerPaint.setShader(bitmapShader);
                } else {
                    BitmapShader bitmapShader2 = imageReceiver.staticThumbShader;
                    if (bitmapShader2 != null) {
                        this.timerPaint.setShader(bitmapShader2);
                    }
                }
            } else {
                this.timerPaint.setShader(null);
                if (this.avatarImage.getBitmap() != null && !this.avatarImage.getBitmap().isRecycled()) {
                    this.timerPaint.setColor(AndroidUtilities.getDominantColor(this.avatarImage.getBitmap()));
                } else if (this.avatarImage.getDrawable() instanceof VectorAvatarThumbDrawable) {
                    this.timerPaint.setColor(((VectorAvatarThumbDrawable) this.avatarImage.getDrawable()).gradientTools.getAverageColor());
                } else {
                    this.timerPaint.setColor(this.avatarDrawable.getColor2());
                }
            }
            canvas.save();
            float progress2 = (1.0f - this.rightFragmentOpenedProgress) * this.ttlProgress;
            CheckBox2 checkBox3 = this.checkBox;
            if (checkBox3 != null) {
                progress2 *= 1.0f - checkBox3.getProgress();
            }
            float f17 = iDp3;
            float f18 = imageY3;
            canvas.scale(progress2, progress2, f17, f18);
            canvas.drawCircle(f17, f18, AndroidUtilities.dpf2(11.0f), this.timerPaint);
            canvas.drawCircle(f17, f18, AndroidUtilities.dpf2(11.0f), this.timerPaint2);
            canvas.save();
            canvas.translate(f17 - AndroidUtilities.dpf2(11.0f), f18 - AndroidUtilities.dpf2(11.0f));
            this.timerDrawable.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.user;
        if (user == null || MessagesController.isSupportUser(user) || this.user.bot) {
            TLRPC.Chat chat2 = this.chat;
            if (chat2 != null) {
                boolean z5 = chat2.call_active && chat2.call_not_empty;
                this.hasCall = z5;
                if ((z5 || this.chatCallProgress != 0.0f) && this.rightFragmentOpenedProgress < 1.0f) {
                    CheckBox2 checkBox4 = this.checkBox;
                    float progress3 = (checkBox4 == null || !checkBox4.isChecked()) ? 1.0f : 1.0f - this.checkBox.getProgress();
                    int iDp4 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                    if (LocaleController.isRTL) {
                        float f19 = this.storyParams.originalAvatarRect.left;
                        f = 0.10666667f;
                        if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f16 = 6.0f;
                        }
                        iDp = (int) (f19 + AndroidUtilities.dp(f16));
                    } else {
                        f = 0.10666667f;
                        float f20 = this.storyParams.originalAvatarRect.right;
                        if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f16 = 6.0f;
                        }
                        iDp = (int) (f20 - AndroidUtilities.dp(f16));
                    }
                    if (this.rightFragmentOpenedProgress != 0.0f) {
                        canvas.save();
                        float f21 = 1.0f - this.rightFragmentOpenedProgress;
                        canvas.scale(f21, f21, iDp, iDp4);
                    }
                    Paint paint2 = Theme.dialogs_onlineCirclePaint;
                    int i8 = Theme.key_windowBackgroundWhite;
                    paint2.setColor(Theme.getColor(i8, this.resourcesProvider));
                    float f22 = iDp;
                    float f23 = iDp4;
                    canvas.drawCircle(f22, f23, AndroidUtilities.dp(11.0f) * this.chatCallProgress * progress3, Theme.dialogs_onlineCirclePaint);
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                    canvas.drawCircle(f22, f23, AndroidUtilities.dp(9.0f) * this.chatCallProgress * progress3, Theme.dialogs_onlineCirclePaint);
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(i8, this.resourcesProvider));
                    if (!LiteMode.isEnabled(360928)) {
                        this.innerProgress = 0.65f;
                    }
                    int i9 = this.progressStage;
                    if (i9 == 0) {
                        i = 360928;
                        fDp = (AndroidUtilities.dp(4.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                        fDp9 = AndroidUtilities.dp(3.0f);
                        fDp10 = AndroidUtilities.dp(2.0f);
                        f5 = this.innerProgress;
                    } else {
                        i = 360928;
                        if (i9 == 1) {
                            fDp4 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                            fDp7 = AndroidUtilities.dp(1.0f);
                            fDp8 = AndroidUtilities.dp(4.0f);
                            f4 = this.innerProgress;
                        } else {
                            if (i9 == 2) {
                                fDp4 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(2.0f) * this.innerProgress);
                                fDp5 = AndroidUtilities.dp(5.0f);
                                fDp6 = AndroidUtilities.dp(4.0f);
                                f3 = this.innerProgress;
                            } else {
                                if (i9 == 3) {
                                    fDp = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.innerProgress);
                                    fDp2 = AndroidUtilities.dp(1.0f);
                                    fDp3 = AndroidUtilities.dp(2.0f);
                                    f2 = this.innerProgress;
                                } else if (i9 == 4) {
                                    fDp = (AndroidUtilities.dp(4.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                                    fDp9 = AndroidUtilities.dp(3.0f);
                                    fDp10 = AndroidUtilities.dp(2.0f);
                                    f5 = this.innerProgress;
                                } else if (i9 == 5) {
                                    fDp4 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                    fDp7 = AndroidUtilities.dp(1.0f);
                                    fDp8 = AndroidUtilities.dp(4.0f);
                                    f4 = this.innerProgress;
                                } else if (i9 == 6) {
                                    fDp4 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                    fDp5 = AndroidUtilities.dp(5.0f);
                                    fDp6 = AndroidUtilities.dp(4.0f);
                                    f3 = this.innerProgress;
                                } else {
                                    fDp = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                    fDp2 = AndroidUtilities.dp(1.0f);
                                    fDp3 = AndroidUtilities.dp(2.0f);
                                    f2 = this.innerProgress;
                                }
                                f6 = fDp2 + (fDp3 * f2);
                                if (this.chatCallProgress >= 1.0f || progress3 < 1.0f) {
                                    canvas.save();
                                    float f24 = this.chatCallProgress * progress3;
                                    canvas.scale(f24, f24, f22, f23);
                                }
                                this.rect.set(iDp - AndroidUtilities.dp(1.0f), f23 - fDp, AndroidUtilities.dp(1.0f) + iDp, fDp + f23);
                                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                                float f25 = f23 - f6;
                                float f26 = f23 + f6;
                                this.rect.set(iDp - AndroidUtilities.dp(5.0f), f25, iDp - AndroidUtilities.dp(3.0f), f26);
                                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                                this.rect.set(AndroidUtilities.dp(3.0f) + iDp, f25, AndroidUtilities.dp(5.0f) + iDp, f26);
                                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                                if (this.chatCallProgress >= 1.0f || progress3 < 1.0f) {
                                    canvas.restore();
                                }
                                if (LiteMode.isEnabled(i)) {
                                    f12 = this.innerProgress + 0.04f;
                                    this.innerProgress = f12;
                                    if (f12 >= 1.0f) {
                                        this.innerProgress = 0.0f;
                                        i2 = this.progressStage + 1;
                                        this.progressStage = i2;
                                        if (i2 >= 8) {
                                            this.progressStage = 0;
                                        }
                                    }
                                    z3 = true;
                                }
                                if (this.hasCall) {
                                    f10 = this.chatCallProgress;
                                    if (f10 < 1.0f) {
                                        f11 = f10 + f;
                                        this.chatCallProgress = f11;
                                        if (f11 > 1.0f) {
                                            this.chatCallProgress = 1.0f;
                                        }
                                    }
                                } else {
                                    f8 = this.chatCallProgress;
                                    if (f8 > 0.0f) {
                                        f9 = f8 - f;
                                        this.chatCallProgress = f9;
                                        if (f9 < 0.0f) {
                                            this.chatCallProgress = 0.0f;
                                        }
                                    }
                                }
                                if (this.rightFragmentOpenedProgress != 0.0f) {
                                    canvas.restore();
                                }
                            }
                            f7 = fDp5 - (fDp6 * f3);
                            fDp = fDp4;
                            f6 = f7;
                            if (this.chatCallProgress >= 1.0f) {
                                canvas.save();
                                float f27 = this.chatCallProgress * progress3;
                                canvas.scale(f27, f27, f22, f23);
                            } else {
                                canvas.save();
                                float f28 = this.chatCallProgress * progress3;
                                canvas.scale(f28, f28, f22, f23);
                            }
                            this.rect.set(iDp - AndroidUtilities.dp(1.0f), f23 - fDp, AndroidUtilities.dp(1.0f) + iDp, fDp + f23);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            float f29 = f23 - f6;
                            float f210 = f23 + f6;
                            this.rect.set(iDp - AndroidUtilities.dp(5.0f), f29, iDp - AndroidUtilities.dp(3.0f), f210);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            this.rect.set(AndroidUtilities.dp(3.0f) + iDp, f29, AndroidUtilities.dp(5.0f) + iDp, f210);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            if (this.chatCallProgress >= 1.0f) {
                                canvas.restore();
                            } else {
                                canvas.restore();
                            }
                            if (LiteMode.isEnabled(i)) {
                                f12 = this.innerProgress + 0.04f;
                                this.innerProgress = f12;
                                if (f12 >= 1.0f) {
                                    this.innerProgress = 0.0f;
                                    i2 = this.progressStage + 1;
                                    this.progressStage = i2;
                                    if (i2 >= 8) {
                                        this.progressStage = 0;
                                    }
                                }
                                z3 = true;
                            }
                            if (this.hasCall) {
                                f10 = this.chatCallProgress;
                                if (f10 < 1.0f) {
                                    f11 = f10 + f;
                                    this.chatCallProgress = f11;
                                    if (f11 > 1.0f) {
                                        this.chatCallProgress = 1.0f;
                                    }
                                }
                            } else {
                                f8 = this.chatCallProgress;
                                if (f8 > 0.0f) {
                                    f9 = f8 - f;
                                    this.chatCallProgress = f9;
                                    if (f9 < 0.0f) {
                                        this.chatCallProgress = 0.0f;
                                    }
                                }
                            }
                            if (this.rightFragmentOpenedProgress != 0.0f) {
                                canvas.restore();
                            }
                        }
                        f7 = fDp7 + (fDp8 * f4);
                        fDp = fDp4;
                        f6 = f7;
                        if (this.chatCallProgress >= 1.0f) {
                            canvas.save();
                            float f211 = this.chatCallProgress * progress3;
                            canvas.scale(f211, f211, f22, f23);
                        } else {
                            canvas.save();
                            float f212 = this.chatCallProgress * progress3;
                            canvas.scale(f212, f212, f22, f23);
                        }
                        this.rect.set(iDp - AndroidUtilities.dp(1.0f), f23 - fDp, AndroidUtilities.dp(1.0f) + iDp, fDp + f23);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        float f213 = f23 - f6;
                        float f214 = f23 + f6;
                        this.rect.set(iDp - AndroidUtilities.dp(5.0f), f213, iDp - AndroidUtilities.dp(3.0f), f214);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        this.rect.set(AndroidUtilities.dp(3.0f) + iDp, f213, AndroidUtilities.dp(5.0f) + iDp, f214);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        if (this.chatCallProgress >= 1.0f) {
                            canvas.restore();
                        } else {
                            canvas.restore();
                        }
                        if (LiteMode.isEnabled(i)) {
                            f12 = this.innerProgress + 0.04f;
                            this.innerProgress = f12;
                            if (f12 >= 1.0f) {
                                this.innerProgress = 0.0f;
                                i2 = this.progressStage + 1;
                                this.progressStage = i2;
                                if (i2 >= 8) {
                                    this.progressStage = 0;
                                }
                            }
                            z3 = true;
                        }
                        if (this.hasCall) {
                            f10 = this.chatCallProgress;
                            if (f10 < 1.0f) {
                                f11 = f10 + f;
                                this.chatCallProgress = f11;
                                if (f11 > 1.0f) {
                                    this.chatCallProgress = 1.0f;
                                }
                            }
                        } else {
                            f8 = this.chatCallProgress;
                            if (f8 > 0.0f) {
                                f9 = f8 - f;
                                this.chatCallProgress = f9;
                                if (f9 < 0.0f) {
                                    this.chatCallProgress = 0.0f;
                                }
                            }
                        }
                        if (this.rightFragmentOpenedProgress != 0.0f) {
                            canvas.restore();
                        }
                    }
                    f6 = fDp9 - (fDp10 * f5);
                    if (this.chatCallProgress >= 1.0f) {
                        canvas.save();
                        float f215 = this.chatCallProgress * progress3;
                        canvas.scale(f215, f215, f22, f23);
                    } else {
                        canvas.save();
                        float f216 = this.chatCallProgress * progress3;
                        canvas.scale(f216, f216, f22, f23);
                    }
                    this.rect.set(iDp - AndroidUtilities.dp(1.0f), f23 - fDp, AndroidUtilities.dp(1.0f) + iDp, fDp + f23);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    float f217 = f23 - f6;
                    float f218 = f23 + f6;
                    this.rect.set(iDp - AndroidUtilities.dp(5.0f), f217, iDp - AndroidUtilities.dp(3.0f), f218);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    this.rect.set(AndroidUtilities.dp(3.0f) + iDp, f217, AndroidUtilities.dp(5.0f) + iDp, f218);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    if (this.chatCallProgress >= 1.0f) {
                        canvas.restore();
                    } else {
                        canvas.restore();
                    }
                    if (LiteMode.isEnabled(i)) {
                        f12 = this.innerProgress + 0.04f;
                        this.innerProgress = f12;
                        if (f12 >= 1.0f) {
                            this.innerProgress = 0.0f;
                            i2 = this.progressStage + 1;
                            this.progressStage = i2;
                            if (i2 >= 8) {
                                this.progressStage = 0;
                            }
                        }
                        z3 = true;
                    }
                    if (this.hasCall) {
                        f10 = this.chatCallProgress;
                        if (f10 < 1.0f) {
                            f11 = f10 + f;
                            this.chatCallProgress = f11;
                            if (f11 > 1.0f) {
                                this.chatCallProgress = 1.0f;
                            }
                        }
                    } else {
                        f8 = this.chatCallProgress;
                        if (f8 > 0.0f) {
                            f9 = f8 - f;
                            this.chatCallProgress = f9;
                            if (f9 < 0.0f) {
                                this.chatCallProgress = 0.0f;
                            }
                        }
                    }
                    if (this.rightFragmentOpenedProgress != 0.0f) {
                        canvas.restore();
                    }
                }
            }
            if (this.showTtl) {
                f14 = this.ttlProgress;
                if (f14 < 1.0f) {
                    this.ttlProgress = f14 + f;
                    z2 = true;
                } else {
                    z2 = z3;
                }
            } else {
                f13 = this.ttlProgress;
                if (f13 > 0.0f) {
                    this.ttlProgress = f13 - f;
                    z2 = true;
                } else {
                    z2 = z3;
                }
            }
            this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
            return z2;
        }
        boolean zIsOnline = isOnline();
        this.wasDrawnOnline = zIsOnline;
        if (zIsOnline || this.onlineProgress != 0.0f) {
            int iDp5 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
            if (LocaleController.isRTL) {
                float f30 = this.storyParams.originalAvatarRect.left;
                if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                    f16 = 6.0f;
                }
                fDp11 = f30 + AndroidUtilities.dp(f16);
            } else {
                float f31 = this.storyParams.originalAvatarRect.right;
                if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                    f16 = 6.0f;
                }
                fDp11 = f31 - AndroidUtilities.dp(f16);
            }
            int i10 = (int) fDp11;
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            float f32 = i10;
            float f33 = iDp5;
            canvas.drawCircle(f32, f33, AndroidUtilities.dp(7.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
            canvas.drawCircle(f32, f33, AndroidUtilities.dp(5.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
            if (zIsOnline) {
                float f34 = this.onlineProgress;
                if (f34 < 1.0f) {
                    float f35 = f34 + 0.10666667f;
                    this.onlineProgress = f35;
                    if (f35 > 1.0f) {
                        this.onlineProgress = 1.0f;
                    }
                    z3 = true;
                }
            } else {
                float f36 = this.onlineProgress;
                if (f36 > 0.0f) {
                    float f37 = f36 - 0.10666667f;
                    this.onlineProgress = f37;
                    if (f37 < 0.0f) {
                        this.onlineProgress = 0.0f;
                    }
                    z3 = true;
                }
            }
        }
        f = 0.10666667f;
        if (this.showTtl) {
            f14 = this.ttlProgress;
            if (f14 < 1.0f) {
                this.ttlProgress = f14 + f;
                z2 = true;
            } else {
                z2 = z3;
            }
        } else {
            f13 = this.ttlProgress;
            if (f13 > 0.0f) {
                this.ttlProgress = f13 - f;
                z2 = true;
            } else {
                z2 = z3;
            }
        }
        this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
        return z2;
    }

    public final void drawCheckStatus(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f) {
        if (f != 0.0f || z4) {
            float f2 = (f * 0.5f) + 0.5f;
            if (z) {
                BaseCell.setDrawableBounds((Drawable) Theme.dialogs_clockDrawable, this.clockDrawLeft, this.checkDrawTop);
                if (f != 1.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, Theme.dialogs_clockDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                    Theme.dialogs_clockDrawable.setAlpha((int) (f * 255.0f));
                }
                Theme.dialogs_clockDrawable.draw(canvas);
                if (f != 1.0f) {
                    canvas.restore();
                    Theme.dialogs_clockDrawable.setAlpha(255);
                }
                invalidate();
                return;
            }
            if (z3) {
                if (!z2) {
                    BaseCell.setDrawableBounds(Theme.dialogs_checkDrawable, this.checkDrawLeft1, this.checkDrawTop);
                    if (f != 1.0f) {
                        canvas.save();
                        canvas.scale(f2, f2, Theme.dialogs_checkDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                        Theme.dialogs_checkDrawable.setAlpha((int) (f * 255.0f));
                    }
                    Theme.dialogs_checkDrawable.draw(canvas);
                    if (f != 1.0f) {
                        canvas.restore();
                        Theme.dialogs_checkDrawable.setAlpha(255);
                        return;
                    }
                    return;
                }
                BaseCell.setDrawableBounds(Theme.dialogs_halfCheckDrawable, this.halfCheckDrawLeft, this.checkDrawTop);
                if (z4) {
                    canvas.save();
                    canvas.scale(f2, f2, Theme.dialogs_halfCheckDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                    Theme.dialogs_halfCheckDrawable.setAlpha((int) (f * 255.0f));
                }
                if (!z4 && f != 0.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, Theme.dialogs_halfCheckDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                    int i = (int) (255.0f * f);
                    Theme.dialogs_halfCheckDrawable.setAlpha(i);
                    Theme.dialogs_checkReadDrawable.setAlpha(i);
                }
                Theme.dialogs_halfCheckDrawable.draw(canvas);
                if (z4) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f) * AndroidUtilities.dp(4.0f), 0.0f);
                }
                BaseCell.setDrawableBounds(Theme.dialogs_checkReadDrawable, this.checkDrawLeft, this.checkDrawTop);
                Theme.dialogs_checkReadDrawable.draw(canvas);
                if (z4) {
                    canvas.restore();
                    Theme.dialogs_halfCheckDrawable.setAlpha(255);
                }
                if (z4 || f == 0.0f) {
                    return;
                }
                canvas.restore();
                Theme.dialogs_halfCheckDrawable.setAlpha(255);
                Theme.dialogs_checkReadDrawable.setAlpha(255);
            }
        }
    }

    public final void drawCounter(Canvas canvas, boolean z, int i, int i2, int i3, float f, boolean z2) {
        float f2;
        Paint paint;
        boolean z3;
        RectF rectF;
        RectF rectF2;
        boolean z4 = isForumCell() || isFolderCell();
        if (!(this.drawCount && this.drawCount2) && this.countChangeProgress == 1.0f) {
            return;
        }
        float f3 = (this.unreadCount != 0 || this.markUnread) ? this.countChangeProgress : 1.0f - this.countChangeProgress;
        int i4 = 255;
        if (z2) {
            if (this.counterPaintOutline == null) {
                Paint paint2 = new Paint();
                this.counterPaintOutline = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.counterPaintOutline.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.counterPaintOutline.setStrokeJoin(Paint.Join.ROUND);
                this.counterPaintOutline.setStrokeCap(Paint.Cap.ROUND);
            }
            int color = Theme.getColor(null, Theme.key_chats_pinnedOverlay, false);
            f2 = 1.0f;
            this.counterPaintOutline.setColor(ColorUtils.blendARGB(Color.alpha(color) / 255.0f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false), ColorUtils.setAlphaComponent(color, 255)));
        } else {
            f2 = 1.0f;
        }
        if (this.isTopic && this.forumTopic.read_inbox_max_id == 0) {
            if (this.topicCounterPaint == null) {
                this.topicCounterPaint = new Paint();
            }
            paint = this.topicCounterPaint;
            int color2 = Theme.getColor(z ? Theme.key_topics_unreadCounterMuted : Theme.key_topics_unreadCounter, this.resourcesProvider);
            paint.setColor(color2);
            Theme.dialogs_countTextPaint2.setColor(color2);
            i4 = z ? 30 : 40;
            z3 = true;
        } else {
            paint = (z || this.currentDialogFolderId != 0) ? Theme.dialogs_countGrayPaint : Theme.dialogs_countPaint;
            z3 = false;
        }
        StaticLayout staticLayout = this.countOldLayout;
        if (staticLayout == null || this.unreadCount == 0) {
            if (this.unreadCount != 0) {
                staticLayout = this.countLayout;
            }
            paint.setAlpha((int) ((f2 - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint2.setAlpha((int) ((f2 - this.reorderIconProgress) * 255.0f));
            float f4 = i;
            this.rect.set(i2, f4, AndroidUtilities.dp(12.666f) + this.countWidth + i2, AndroidUtilities.dp(20.666f) + i);
            int iSave = canvas.save();
            if (f != f2) {
                canvas.scale(f, f, this.rect.centerX(), this.rect.centerY());
            }
            if (f3 != f2) {
                canvas.scale(f3, f3, this.rect.centerX(), this.rect.centerY());
            }
            if (z4) {
                if (this.counterPath == null || (rectF = this.counterPathRect) == null || !rectF.equals(this.rect)) {
                    RectF rectF3 = this.counterPathRect;
                    if (rectF3 == null) {
                        this.counterPathRect = new RectF(this.rect);
                    } else {
                        rectF3.set(this.rect);
                    }
                    if (this.counterPath == null) {
                        this.counterPath = new Path();
                    }
                    BubbleCounterPath.addBubbleRect(this.counterPath, this.counterPathRect, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.counterPath, paint);
                if (z2) {
                    canvas.drawPath(this.counterPath, this.counterPaintOutline);
                }
            } else {
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.counterPaintOutline);
                }
            }
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(6.333f) + i2, AndroidUtilities.dpf2(3.0f) + f4);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(iSave);
        } else {
            paint.setAlpha((int) ((f2 - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint2.setAlpha((int) ((f2 - this.reorderIconProgress) * 255.0f));
            float f5 = f3 * 2.0f;
            float f6 = f5 > f2 ? 1.0f : f5;
            float f7 = f2 - f6;
            float f8 = (i3 * f7) + (i2 * f6);
            float f9 = i;
            this.rect.set(f8, f9, (this.countWidthOld * f7) + (this.countWidth * f6) + f8 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i);
            float interpolation = ((f3 <= 0.5f ? CubicBezierInterpolator.EASE_OUT.getInterpolation(f5) : CubicBezierInterpolator.EASE_IN.getInterpolation(f2 - ((f3 - 0.5f) * 2.0f))) * 0.1f) + f2;
            canvas.save();
            float f10 = interpolation * f;
            canvas.scale(f10, f10, this.rect.centerX(), this.rect.centerY());
            if (z4) {
                if (this.counterPath == null || (rectF2 = this.counterPathRect) == null || !rectF2.equals(this.rect)) {
                    RectF rectF4 = this.counterPathRect;
                    if (rectF4 == null) {
                        this.counterPathRect = new RectF(this.rect);
                    } else {
                        rectF4.set(this.rect);
                    }
                    if (this.counterPath == null) {
                        this.counterPath = new Path();
                    }
                    BubbleCounterPath.addBubbleRect(this.counterPath, this.counterPathRect, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.counterPath, paint);
                if (z2) {
                    canvas.drawPath(this.counterPath, this.counterPaintOutline);
                }
            } else {
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.counterPaintOutline);
                }
            }
            if (this.countAnimationStableLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f8, AndroidUtilities.dpf2(3.0f) + f9);
                this.countAnimationStableLayout.draw(canvas);
                canvas.restore();
            }
            int alpha = Theme.dialogs_countTextPaint2.getAlpha();
            float f11 = alpha;
            Theme.dialogs_countTextPaint2.setAlpha((int) (f11 * f6));
            if (this.countAnimationInLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f8, AndroidUtilities.dpf2(3.0f) + ((this.countAnimationIncrement ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f7) + f9);
                this.countAnimationInLayout.draw(canvas);
                canvas.restore();
            } else if (this.countLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f8, AndroidUtilities.dpf2(3.0f) + ((this.countAnimationIncrement ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f7) + f9);
                this.countLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countOldLayout != null) {
                Theme.dialogs_countTextPaint2.setAlpha((int) (f11 * f7));
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f8, AndroidUtilities.dpf2(3.0f) + ((this.countAnimationIncrement ? -AndroidUtilities.dp(17.0f) : AndroidUtilities.dp(17.0f)) * f6) + f9);
                this.countOldLayout.draw(canvas);
                canvas.restore();
            }
            Theme.dialogs_countTextPaint2.setAlpha(alpha);
            canvas.restore();
        }
        if (z3) {
            Theme.dialogs_countTextPaint2.setColor(Theme.getColor(null, Theme.key_chats_unreadCounterText, false));
        }
    }

    public boolean drawLock2() {
        return false;
    }

    public final MessageObject findFolderTopMessage() {
        ArrayList<TLRPC.Dialog> dialogsArray;
        DialogsActivity dialogsActivity = this.parentFragment;
        if (dialogsActivity == null || (dialogsArray = dialogsActivity.getDialogsArray(this.currentAccount, this.dialogsType, this.currentDialogFolderId, false)) == null || dialogsArray.isEmpty()) {
            return null;
        }
        int size = dialogsArray.size();
        MessageObject messageObject = null;
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = dialogsArray.get(i);
            LongSparseArray longSparseArray = MessagesController.getInstance(this.currentAccount).dialogMessage;
            if (longSparseArray != null) {
                ArrayList arrayList = (ArrayList) longSparseArray.get(dialog.id);
                MessageObject messageObject2 = (arrayList == null || arrayList.isEmpty()) ? null : (MessageObject) arrayList.get(0);
                if (messageObject2 != null && (messageObject == null || messageObject2.messageOwner.date > messageObject.messageOwner.date)) {
                    messageObject = messageObject2;
                }
                if (dialog.pinnedNum == 0 && messageObject != null) {
                    return messageObject;
                }
            }
        }
        return messageObject;
    }

    public final CharSequence formatArchivedDialogNames() {
        TLRPC.User user;
        String string;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.currentDialogFolderId);
        this.currentDialogFolderDialogsCount = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = dialogs.get(i);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(messagesController, dialog.id);
                    user = encryptedChatM != null ? messagesController.getUser(Long.valueOf(encryptedChatM.user_id)) : null;
                } else if (DialogObject.isUserDialog(dialog.id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.id));
                    user = null;
                }
                if (chat != null) {
                    string = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else {
                    string = UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = string.length() + length;
                spannableStringBuilder.append((CharSequence) string);
                if (dialog.unread_count > 0) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        if (MessagesController.getInstance(this.currentAccount).storiesController.getTotalStoriesCount(true) > 0) {
            int iMax = Math.max(1, MessagesController.getInstance(this.currentAccount).storiesController.getTotalStoriesCount(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Stories", iMax, new Object[0]));
        }
        return Emoji.replaceEmoji(spannableStringBuilder, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
    }

    public final CharSequence formatCommunityDialogNames() {
        TLRPC.User user;
        String string;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.currentDialogId);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(messagesController, dialog.id);
                    user = encryptedChatM != null ? messagesController.getUser(Long.valueOf(encryptedChatM.user_id)) : null;
                } else if (DialogObject.isUserDialog(dialog.id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.id));
                    user = null;
                }
                if (chat != null) {
                    string = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else {
                    string = UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = string.length() + length;
                spannableStringBuilder.append((CharSequence) string);
                if (dialog.unread_count > 0) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
    }

    public final CharSequence formatTopicsNames() {
        ArrayList arrayList;
        long topicId;
        boolean z;
        int length;
        if (this.forumFormattedNames == null) {
            this.forumFormattedNames = new ForumFormattedNames(this);
        }
        ForumFormattedNames forumFormattedNames = this.forumFormattedNames;
        int i = this.currentAccount;
        MessageObject messageObject = this.message;
        TLRPC.Chat chat = this.chat;
        forumFormattedNames.getClass();
        int id = (messageObject == null || chat == null) ? 0 : messageObject.getId();
        if (forumFormattedNames.lastMessageId != id || forumFormattedNames.isLoadingState) {
            forumFormattedNames.avatarSpans = null;
            forumFormattedNames.topMessageTopicEndIndex = 0;
            forumFormattedNames.lastTopicMessageUnread = false;
            forumFormattedNames.isLoadingState = false;
            forumFormattedNames.lastMessageId = id;
            TextPaint textPaint = Theme.dialogs_messagePaint[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i).getTopicsController().getTopics(chat.id);
                if (topics != null && !topics.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(topics);
                    Collections.sort(arrayList2, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(3)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (messageObject == null || ChatObject.isMonoForum(chat)) {
                        arrayList = arrayList2;
                        topicId = 0;
                        z = false;
                        length = 0;
                    } else {
                        topicId = MessageObject.getTopicId(i, messageObject.messageOwner, true);
                        arrayList = arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i).getTopicsController().findTopic(chat.id, topicId);
                        if (tL_forumTopicFindTopic != null) {
                            CharSequence topicSpannedName = ForumUtilities.getTopicSpannedName(tL_forumTopicFindTopic, textPaint, null);
                            spannableStringBuilder.append(topicSpannedName);
                            length = tL_forumTopicFindTopic.unread_count > 0 ? topicSpannedName.length() : 0;
                            forumFormattedNames.topMessageTopicEndIndex = topicSpannedName.length();
                            if (messageObject.isOutOwner()) {
                                forumFormattedNames.lastTopicMessageUnread = false;
                            } else {
                                forumFormattedNames.lastTopicMessageUnread = tL_forumTopicFindTopic.unread_count > 0;
                            }
                        } else {
                            forumFormattedNames.lastTopicMessageUnread = false;
                            length = 0;
                        }
                        if (forumFormattedNames.lastTopicMessageUnread) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new FixedWidthSpan(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (ChatObject.isMonoForum(chat)) {
                        forumFormattedNames.avatarSpans = new HashMap();
                        int i2 = 0;
                        while (i2 < Math.min(4, arrayList.size())) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            ArrayList arrayList3 = arrayList;
                            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList3.get(i2)).from_id);
                            AvatarSpan avatarSpan = new AvatarSpan(forumFormattedNames.parent, i);
                            avatarSpan.needDrawShadow = false;
                            avatarSpan.setDialogId(peerDialogId);
                            forumFormattedNames.avatarSpans.put(Long.valueOf(peerDialogId), avatarSpan);
                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                            spannableStringBuilderValueOf.insert(0, (CharSequence) "  ");
                            spannableStringBuilderValueOf.setSpan(avatarSpan, 0, 1, 33);
                            spannableStringBuilder.append((CharSequence) spannableStringBuilderValueOf);
                            i2++;
                            arrayList = arrayList3;
                        }
                    } else {
                        ArrayList arrayList4 = arrayList;
                        int i3 = 0;
                        boolean z2 = true;
                        for (int i4 = 4; i3 < Math.min(i4, arrayList4.size()); i4 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList4.get(i3)).id != topicId) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z2 && z) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(ForumUtilities.getTopicSpannedName((TLRPC.ForumTopic) arrayList4.get(i3), textPaint, null));
                                z2 = false;
                            }
                            i3++;
                        }
                    }
                    if (length > 0) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, Theme.key_chats_name, null), 0, Math.min(spannableStringBuilder.length(), length + 2), 0);
                    }
                    forumFormattedNames.formattedNames = spannableStringBuilder;
                } else if (MessagesController.getInstance(i).getTopicsController().endIsReached(chat.id)) {
                    forumFormattedNames.formattedNames = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                } else {
                    MessagesController.getInstance(i).getTopicsController().preloadTopics(chat.id);
                    forumFormattedNames.formattedNames = LocaleController.getString(R.string.Loading);
                    forumFormattedNames.isLoadingState = true;
                }
            }
        }
        this.forumFormattedNames.getClass();
        this.topMessageTopicStartIndex = 0;
        ForumFormattedNames forumFormattedNames2 = this.forumFormattedNames;
        this.topMessageTopicEndIndex = forumFormattedNames2.topMessageTopicEndIndex;
        this.lastTopicMessageUnread = forumFormattedNames2.lastTopicMessageUnread;
        return forumFormattedNames2.formattedNames;
    }

    public final ColorFilter getAdaptiveEmojiColorFilter$1(int i, int i2) {
        if (this.adaptiveEmojiColorFilter == null) {
            this.adaptiveEmojiColor = new int[4];
            this.adaptiveEmojiColorFilter = new ColorFilter[4];
        }
        if (i2 != this.adaptiveEmojiColor[i] || this.adaptiveEmojiColorFilter[i] == null) {
            ColorFilter[] colorFilterArr = this.adaptiveEmojiColorFilter;
            this.adaptiveEmojiColor[i] = i2;
            colorFilterArr[i] = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
        return this.adaptiveEmojiColorFilter[i];
    }

    public float getClipProgress() {
        return this.clipProgress;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCurrentDialogFolderId() {
        return this.currentDialogFolderId;
    }

    public long getDialogId() {
        return this.currentDialogId;
    }

    public boolean getHasUnread() {
        return this.unreadCount != 0 || this.markUnread;
    }

    public boolean getIsMuted() {
        return this.dialogMuted;
    }

    public boolean getIsPinned() {
        return this.drawPin || this.drawPinForced;
    }

    public MessageObject getMessage() {
        return this.message;
    }

    public int getMessageId() {
        return this.messageId;
    }

    public String getMessageNameString() {
        TLRPC.Chat chat;
        TLRPC.User user;
        String str;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        MessageObject messageObject;
        TLRPC.Message message2;
        TLRPC.User user2;
        MessageObject messageObject2;
        TLRPC.Message message3;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Message message4;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        TLRPC.MessageFwdHeader messageFwdHeader4;
        MessageObject messageObject3 = this.message;
        if (messageObject3 == null) {
            return null;
        }
        long fromChatId = messageObject3.getFromChatId();
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (!this.isSavedDialog && this.currentDialogId == clientUserId) {
            long savedDialogId = this.message.getSavedDialogId();
            if (savedDialogId == clientUserId) {
                return null;
            }
            if (savedDialogId != 2666000) {
                TLRPC.Message message5 = this.message.messageOwner;
                if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                    long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader4.saved_from_id);
                    if (peerDialogId == 0) {
                        peerDialogId = DialogObject.getPeerDialogId(this.message.messageOwner.fwd_from.from_id);
                    }
                    if (peerDialogId > 0 && peerDialogId != savedDialogId) {
                        return null;
                    }
                }
                fromChatId = savedDialogId;
            }
        }
        if (this.isSavedDialog && (message4 = this.message.messageOwner) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
            fromChatId = DialogObject.getPeerDialogId(messageFwdHeader3.saved_from_id);
            if (fromChatId == 0) {
                fromChatId = DialogObject.getPeerDialogId(this.message.messageOwner.fwd_from.from_id);
            }
        }
        if (DialogObject.isUserDialog(fromChatId)) {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
            chat = null;
        } else {
            chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
            user = null;
        }
        long j = this.currentDialogId;
        if (j == clientUserId) {
            if (user != null) {
                return AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", ""));
            }
            if (chat != null) {
                return AndroidUtilities.escape(chat.title.replace("\n", ""));
            }
            return null;
        }
        if (j == 489000 && (messageObject2 = this.message) != null && (message3 = messageObject2.messageOwner) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
            String str3 = messageFwdHeader2.from_name;
            if (str3 != null) {
                return AndroidUtilities.escape(str3);
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(messageFwdHeader2.from_id);
            if (DialogObject.isUserDialog(peerDialogId2)) {
                return UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId2)));
            }
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId2));
            return chat2 == null ? "" : chat2.title;
        }
        if (this.message.isOutOwner() && user != null) {
            return LocaleController.getString(R.string.FromYou);
        }
        if (!this.isSavedDialog && (messageObject = this.message) != null && (message2 = messageObject.messageOwner) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.message.messageOwner.from_id.user_id))) != null) {
            return AndroidUtilities.escape(UserObject.getFirstName(user2).replace("\n", ""));
        }
        MessageObject messageObject4 = this.message;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageFwdHeader = message.fwd_from) != null && (str2 = messageFwdHeader.from_name) != null) {
            return AndroidUtilities.escape(str2);
        }
        if (user == null) {
            return (chat == null || (str = chat.title) == null) ? "DELETED" : AndroidUtilities.escape(str.replace("\n", ""));
        }
        if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
            return UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace("\n", ""));
        }
        return AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", ""));
    }

    public SpannableStringBuilder getMessageStringFormatted(int i, String str, CharSequence charSequence, boolean z) {
        String strSubSequence;
        CharSequence charSequenceReplaceNewLines;
        TLRPC.Message message;
        CharSequence string;
        String pluralString;
        String pluralString2;
        CharSequence charSequence2;
        String str2;
        SpannableStringBuilder spannableStringBuilderValueOf;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        MessageObject captionMessage = getCaptionMessage();
        MessageObject messageObject = this.message;
        CharSequence charSequence3 = messageObject != null ? messageObject.messageText : null;
        this.applyName = true;
        if (!TextUtils.isEmpty(str)) {
            return formatInternal(i, str, charSequence);
        }
        MessageObject messageObject2 = this.message;
        TLRPC.Message message2 = messageObject2.messageOwner;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence4 = messageObject2.messageTextShort;
            if (charSequence4 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.isTopic)) {
                charSequence4 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                spannableStringBuilderValueOf = formatInternal(i, charSequence4, charSequence);
                if ((this.message.topicIconDrawable[0] instanceof ForumBubbleDrawable) && (tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-this.message.getDialogId(), MessageObject.getTopicId(this.currentAccount, this.message.messageOwner, true))) != null) {
                    ((ForumBubbleDrawable) this.message.topicIconDrawable[0]).setColor(tL_forumTopicFindTopic.icon_color);
                }
            } else {
                this.applyName = false;
                spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence4);
            }
            if (z) {
                applyThumbs(spannableStringBuilderValueOf);
            }
            return spannableStringBuilderValueOf;
        }
        if (captionMessage != null && (charSequence2 = captionMessage.caption) != null) {
            String string2 = charSequence2.toString();
            if (!this.needEmoji) {
                str2 = "";
            } else if (captionMessage.isVideo()) {
                str2 = "📹 ";
            } else if (captionMessage.isVoice()) {
                str2 = "🎤 ";
            } else if (captionMessage.isMusic()) {
                str2 = "🎧 ";
            } else {
                str2 = captionMessage.isPhoto() ? "🖼 " : "📎 ";
            }
            if (captionMessage.hasHighlightedWords() && !TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                CharSequence charSequenceEllipsizeCenterEnd = captionMessage.messageTrimmedToHighlight;
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 47);
                if (this.hasNameInMessage) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.currentMessagePaint.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.currentMessagePaint.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                    charSequenceEllipsizeCenterEnd = AndroidUtilities.ellipsizeCenterEnd(charSequenceEllipsizeCenterEnd, captionMessage.highlightedWords.get(0), measuredWidth, this.currentMessagePaint, 130);
                }
                return new SpannableStringBuilder(str2).append(charSequenceEllipsizeCenterEnd);
            }
            int length = string2.length();
            String strSubSequence2 = string2;
            if (length > 150) {
                strSubSequence2 = string2.subSequence(0, 150);
            }
            SpannableString spannableString = new SpannableString(strSubSequence2);
            captionMessage.spoilLoginCode();
            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, strSubSequence2, spannableString, 264);
            TLRPC.Message message3 = captionMessage.messageOwner;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.currentMessagePaint;
                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint != null ? textPaint.getFontMetricsInt() : null);
            }
            CharSequence charSequenceAppend = new SpannableStringBuilder(str2).append(AndroidUtilities.replaceNewLines(spannableString));
            if (z) {
                charSequenceAppend = applyThumbs(charSequenceAppend);
            }
            return formatInternal(i, charSequenceAppend, charSequence);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        if (richMessage != null) {
            boolean zIsBlueBlock = richMessage.blocks.size() == 1 ? MessageObject.isBlueBlock(this.message.messageOwner.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder internal = formatInternal(i, this.message.messageText, charSequence);
            if (zIsBlueBlock && !isForumCell()) {
                try {
                    internal.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_actionMessage, this.resourcesProvider), this.hasNameInMessage ? charSequence.length() + 2 : 0, internal.length(), 33);
                    return internal;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return internal;
        }
        if (message2.media == null || messageObject2.isMediaEmpty()) {
            MessageObject messageObject3 = this.message;
            String str3 = messageObject3.messageOwner.message;
            if (str3 == null) {
                return new SpannableStringBuilder();
            }
            if (messageObject3.hasHighlightedWords()) {
                CharSequence charSequence5 = this.message.messageTrimmedToHighlight;
                if (charSequence5 != null) {
                    charSequenceReplaceNewLines = str3;
                    charSequenceReplaceNewLines = charSequence5;
                }
                charSequenceReplaceNewLines = str3;
                int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 33);
                if (this.hasNameInMessage) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.currentMessagePaint.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.currentMessagePaint.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    charSequenceReplaceNewLines = AndroidUtilities.ellipsizeCenterEnd(charSequenceReplaceNewLines, this.message.highlightedWords.get(0), measuredWidth2, this.currentMessagePaint, 130);
                }
            } else {
                if (str3.length() > 150) {
                    strSubSequence = str3;
                    strSubSequence = str3.subSequence(0, 150);
                }
                strSubSequence = str3;
                charSequenceReplaceNewLines = AndroidUtilities.replaceNewLines(strSubSequence);
            }
            ?? spannableString2 = new SpannableString(charSequenceReplaceNewLines);
            MessageObject messageObject4 = this.message;
            if (messageObject4 != null) {
                messageObject4.spoilLoginCode();
            }
            MediaDataController.addTextStyleRuns(this.message, (Spannable) spannableString2, 264);
            MessageObject messageObject5 = this.message;
            if (messageObject5 != null && (message = messageObject5.messageOwner) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                TextPaint textPaint2 = this.currentMessagePaint;
                MediaDataController.addAnimatedEmojiSpans(arrayList2, spannableString2, textPaint2 != null ? textPaint2.getFontMetricsInt() : null);
            }
            if (z) {
                spannableString2 = applyThumbs(spannableString2);
            }
            return formatInternal(i, spannableString2, charSequence);
        }
        this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
        int i2 = Theme.key_chats_attachMessage;
        MessageObject messageObject6 = this.message;
        TLRPC.MessageMedia messageMedia = messageObject6.messageOwner.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
            if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                string = DialogMediaIconsHelper.addDialogMediaSpan(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
            } else {
                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                string = DialogMediaIconsHelper.addDialogMediaSpan(R.drawable.dialog_media_poll_20, spannableString3, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
            if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                string = DialogMediaIconsHelper.addDialogMediaSpan(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
            } else {
                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4);
                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                string = DialogMediaIconsHelper.addDialogMediaSpan(R.drawable.dialog_media_checklist_20, spannableString4, true);
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            string = DialogMediaIconsHelper.addDialogMediaSpan(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
        } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            string = messageMedia.title;
        } else if (messageObject6.type == 14) {
            string = Fragment$$ExternalSyntheticOutline0.m("🎧 \u2068", messageObject6.getMusicAuthor(), " - ", this.message.getMusicTitle(), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            if (this.hasVideoThumb) {
                pluralString2 = size > 1 ? LocaleController.formatPluralString("Media", size, new Object[0]) : LocaleController.getString(R.string.AttachVideo);
            } else {
                pluralString2 = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
            }
            string = StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.AttachPaidMedia, pluralString2), 1.13f, (ColoredImageSpan[]) null);
            i2 = Theme.key_chats_actionMessage;
        } else if (this.thumbsCount > 1) {
            if (this.hasVideoThumb) {
                ArrayList<MessageObject> arrayList3 = this.groupMessages;
                pluralString = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
            } else {
                ArrayList<MessageObject> arrayList4 = this.groupMessages;
                pluralString = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
            }
            string = pluralString;
            i2 = Theme.key_chats_actionMessage;
        } else {
            string = charSequence3.toString();
            i2 = Theme.key_chats_actionMessage;
        }
        if (string instanceof String) {
            string = ((String) string).replace('\n', ' ');
        }
        if (z) {
            string = applyThumbs(string);
        }
        SpannableStringBuilder internal2 = formatInternal(i, string, charSequence);
        if (!isForumCell()) {
            try {
                internal2.setSpan(new ForegroundColorSpanThemable(i2, this.resourcesProvider), this.hasNameInMessage ? charSequence.length() + 2 : 0, internal2.length(), 33);
                return internal2;
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return internal2;
    }

    public long getStarsPrice() {
        return this.starsPriceBlocked;
    }

    @Override
    public float getTranslationX() {
        return this.translationX;
    }

    public boolean hasTags() {
        DialogCellTags dialogCellTags = this.tags;
        return (dialogCellTags == null || dialogCellTags.isEmpty()) ? false : true;
    }

    @Override
    public void invalidate() {
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.translationDrawable || drawable == Theme.dialogs_archiveAvatarDrawable) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    public final boolean isCounterMuted() {
        if (isDialogCommunity()) {
            return !this.hasUnmutedCommunityDialogs;
        }
        if (this.isTopic) {
            return this.topicMuted;
        }
        TLRPC.Chat chat = this.chat;
        if (chat != null && chat.forum && this.forumTopic == null) {
            return !this.hasUnmutedTopics;
        }
        return this.dialogMuted;
    }

    public boolean isDialogCommunity() {
        return ChatObject.isCommunity(this.chat);
    }

    public boolean isDialogFolder() {
        return this.currentDialogFolderId > 0;
    }

    public boolean isDrawArchive() {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.drawArchive) {
            return (this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic = this.forumTopic) != null && tL_forumTopic.id == 1)) && this.translationX == 0.0f && this.archivedChatsDrawable != null;
        }
        return false;
    }

    public boolean isFolderCell() {
        return this.currentDialogFolderId != 0;
    }

    public boolean isForumCell() {
        TLRPC.Chat chat;
        if (isDialogFolder() || this.insideCommunityListNoDialog || (chat = this.chat) == null) {
            return false;
        }
        return (chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, this.chat))) && !this.isTopic;
    }

    public boolean isMoving() {
        return this.moving;
    }

    public final boolean isOnline() {
        TLRPC.User user;
        if (!isForumCell() && !this.storyParams.drawnLive && (user = this.user) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            if (userStatus != null && userStatus.expires <= 0 && MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(this.user.id))) {
                return true;
            }
            TLRPC.UserStatus userStatus2 = this.user.status;
            if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointInsideAvatar(float f, float f2) {
        if (LocaleController.isRTL) {
            return f >= ((float) (getMeasuredWidth() - AndroidUtilities.dp(60.0f))) && f < ((float) getMeasuredWidth());
        }
        return f >= 0.0f && f < ((float) AndroidUtilities.dp(60.0f));
    }

    public boolean isUnread() {
        return (this.unreadCount != 0 || this.markUnread) && !this.dialogMuted;
    }

    public final void lambda$createStatusDrawableAnimator$4(ValueAnimator valueAnimator) {
        this.statusDrawableProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void lambda$onDraw$2() {
        DialogCellDelegate dialogCellDelegate = this.delegate;
        if (dialogCellDelegate != null) {
            dialogCellDelegate.onButtonClicked(this);
        }
    }

    public final void lambda$onDraw$3() {
        DialogCellDelegate dialogCellDelegate = this.delegate;
        if (dialogCellDelegate != null) {
            dialogCellDelegate.onButtonLongPress(this);
        }
    }

    public final void lambda$showPremiumBlocked$5(Object[] objArr) {
        updatePremiumBlocked(true);
    }

    public final void lambda$update$0(ValueAnimator valueAnimator) {
        this.countChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void lambda$update$1(ValueAnimator valueAnimator) {
        this.reactionsMentionsChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.thumbImage;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].onAttachedToWindow();
            i++;
        }
        resetPinnedArchiveState();
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack, this.messageLayout);
        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
        this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
        this.animatedEmojiStackName = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStackName, this.nameLayout);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.attach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerification;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.attach();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isSliding = false;
        this.drawRevealBackground = false;
        this.currentRevealProgress = 0.0f;
        this.attachedToWindow = false;
        this.reorderIconProgress = (getIsPinned() && this.drawReorder) ? 1.0f : 0.0f;
        this.avatarImage.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.thumbImage;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].onDetachedFromWindow();
            i++;
        }
        RLottieDrawable rLottieDrawable = this.translationDrawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
            this.translationDrawable.setProgress(0.0f);
            this.translationDrawable.setCallback(null);
            this.translationDrawable = null;
            this.translationAnimationStarted = false;
        }
        DialogsAdapter.DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.preloadDialogsPool.remove(Long.valueOf(this.currentDialogId));
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.detach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerification;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.detach();
        }
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack);
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack2);
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack3);
        AnimatedEmojiSpan.release(this, this.animatedEmojiStackName);
        this.storyParams.onDetachFromWindow();
        this.canvasButton = null;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int color;
        int color2;
        int i;
        String string;
        int i2;
        String str;
        float measuredWidth;
        float f3;
        float f4;
        float f5;
        int i3;
        String str2;
        float f6;
        boolean z;
        int iM$2;
        int intrinsicWidth;
        int intrinsicHeight;
        String str3;
        float f7;
        float f8;
        String str4;
        int iCeil;
        int i4;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        float f9;
        RLottieDrawable rLottieDrawable;
        float f10;
        float f11;
        float f12;
        DialogCell dialogCell;
        int i5;
        int i6;
        float f13;
        float f14;
        boolean z2;
        boolean z3;
        DialogCell dialogCell2;
        float f15;
        Canvas canvas2;
        boolean z4;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        boolean z5;
        float f23;
        float f24;
        int i7;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        int color3;
        int iDp;
        int alpha;
        float f32;
        float measuredHeight;
        TLRPC.TL_forumTopic tL_forumTopic;
        StoriesUtilities.AvatarStoryParams avatarStoryParams;
        boolean z6;
        boolean z7;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        int iSaveLayerAlpha;
        int i8;
        float f33;
        float f34;
        int i9;
        float f35;
        float f36;
        DialogCell dialogCell3;
        float f37;
        boolean z8;
        ScamDrawable scamDrawable;
        ScamDrawable scamDrawable2;
        float f38;
        int iDp2;
        boolean z9;
        float floatValue;
        boolean zIsCounterMuted;
        float f39;
        Drawable drawable;
        Drawable drawable2;
        Paint paint;
        int i10;
        DialogCellTags dialogCellTags;
        float f40;
        int i11;
        RectF rectF;
        Path path;
        float fDp;
        float f41;
        float f42;
        float f43;
        float f44;
        int iDp3;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i16;
        int i17;
        int i18;
        boolean z14;
        boolean z15;
        boolean z16;
        int i19;
        int i20;
        int i21;
        int i22;
        RectF rectF2;
        float f45;
        DialogUpdateHelper dialogUpdateHelper;
        float fM;
        StaticLayout staticLayout2;
        int i23;
        StatusDrawable chatStatusDrawable;
        DialogUpdateHelper dialogUpdateHelper2;
        float fM2;
        int iDp4;
        float f46;
        DialogUpdateHelper dialogUpdateHelper3;
        float f47;
        int i24;
        CustomDialog customDialog;
        DialogsActivity dialogsActivity;
        RightSlidingDialogContainer rightSlidingDialogContainer;
        TLRPC.TL_forumTopic tL_forumTopic3;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final DialogCell dialogCell4 = this;
        Canvas canvas3 = canvas;
        float f48 = 13.5f;
        float f49 = 12.0f;
        if (!(dialogCell4.currentDialogId == 0 && dialogCell4.customDialog == null) && dialogCell4.visibleOnScreen) {
            boolean z17 = dialogCell4.drawArchive;
            if (z17 && ((dialogCell4.currentDialogFolderId != 0 || (dialogCell4.isTopic && (tL_forumTopic4 = dialogCell4.forumTopic) != null && tL_forumTopic4.id == 1)) && (pullForegroundDrawable2 = dialogCell4.archivedChatsDrawable) != null && pullForegroundDrawable2.outProgress == 0.0f && dialogCell4.translationX == 0.0f)) {
                canvas3.save();
                canvas3.translate(0.0f, (-dialogCell4.translateY) - dialogCell4.rightFragmentOffset);
                canvas3.clipRect(0.0f, (1.0f - dialogCell4.archivedChatsDrawable.getPullProgress()) * dialogCell4.getMeasuredHeight(), dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                dialogCell4.archivedChatsDrawable.draw(canvas3);
                canvas3.restore();
                dialogCell4.emojiStatusView.setVisibility(4);
                return;
            }
            boolean z18 = z17 && (dialogCell4.currentDialogFolderId != 0 || (dialogCell4.isTopic && (tL_forumTopic3 = dialogCell4.forumTopic) != null && tL_forumTopic3.id == 1)) && dialogCell4.archivedChatsDrawable != null && dialogCell4.translationX == 0.0f && (dialogsActivity = dialogCell4.parentFragment) != null && dialogsActivity.hasHiddenArchive() && ((rightSlidingDialogContainer = dialogCell4.parentFragment.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment());
            PullForegroundDrawable pullForegroundDrawable3 = dialogCell4.archivedChatsDrawable;
            float pullProgress = pullForegroundDrawable3 != null ? pullForegroundDrawable3.getPullProgress() : 1.0f;
            if (z18) {
                canvas3.save();
                canvas3.clipRect(0.0f, (1.0f - pullProgress) * dialogCell4.getMeasuredHeight(), dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
            }
            if (dialogCell4.clipProgress == 0.0f || Build.VERSION.SDK_INT == 24) {
                f = 1.0f;
            } else {
                canvas3.save();
                f = 1.0f;
                canvas3.clipRect(0.0f, dialogCell4.topClip * dialogCell4.clipProgress, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight() - ((int) (dialogCell4.bottomClip * dialogCell4.clipProgress)));
            }
            if (dialogCell4.translationX == 0.0f && dialogCell4.cornerProgress == 0.0f) {
                RLottieDrawable rLottieDrawable2 = dialogCell4.translationDrawable;
                if (rLottieDrawable2 != null) {
                    rLottieDrawable2.stop();
                    dialogCell4.translationDrawable.setProgress(0.0f);
                    dialogCell4.translationDrawable.setCallback(null);
                    dialogCell4.translationDrawable = null;
                    dialogCell4.translationAnimationStarted = false;
                }
                f2 = 0.053333335f;
                f3 = 0.069565214f;
                f4 = 22.0f;
            } else {
                canvas3.save();
                canvas3.translate(0.0f, -dialogCell4.translateY);
                if (dialogCell4.overrideSwipeAction) {
                    color = Theme.getColor(dialogCell4.overrideSwipeActionBackgroundColorKey, dialogCell4.resourcesProvider);
                    color2 = Theme.getColor(dialogCell4.overrideSwipeActionRevealBackgroundColorKey, dialogCell4.resourcesProvider);
                    String str5 = dialogCell4.overrideSwipeActionStringKey;
                    i = dialogCell4.overrideSwipeActionStringId;
                    string = LocaleController.getString(str5, i);
                    f2 = 0.053333335f;
                    dialogCell4.translationDrawable = dialogCell4.overrideSwipeActionDrawable;
                } else {
                    f2 = 0.053333335f;
                    if (dialogCell4.currentDialogFolderId != 0) {
                        if (dialogCell4.archiveHidden) {
                            color = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                            color2 = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                            i = R.string.UnhideFromTop;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_unpinArchiveDrawable;
                        } else {
                            color = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                            color2 = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                            i = R.string.HideOnTop;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_pinArchiveDrawable;
                        }
                    } else if (dialogCell4.promoDialog) {
                        color = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                        color2 = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                        i = R.string.PsaHide;
                        string = LocaleController.getString(i);
                        dialogCell4.translationDrawable = Theme.dialogs_hidePsaDrawable;
                    } else if (dialogCell4.folderId == 0) {
                        color = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                        color2 = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                        if (ChatObject.isCommunity(dialogCell4.chat)) {
                            i = R.string.SwipeUngroupCommunity;
                            string = LocaleController.getString(i);
                            color = Theme.getColor(Theme.key_dialogSwipeRemove, dialogCell4.resourcesProvider);
                            dialogCell4.translationDrawable = Theme.dialogs_swipeCommunityUngroup;
                            i2 = color;
                        } else if (SharedConfig.getChatSwipeAction(dialogCell4.currentAccount) == 3) {
                            if (dialogCell4.dialogMuted) {
                                i = R.string.SwipeUnmute;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipeUnmuteDrawable;
                            } else {
                                i = R.string.SwipeMute;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipeMuteDrawable;
                            }
                        } else if (SharedConfig.getChatSwipeAction(dialogCell4.currentAccount) == 4) {
                            i = R.string.SwipeDeleteChat;
                            string = LocaleController.getString(i);
                            color = Theme.getColor(Theme.key_dialogSwipeRemove, dialogCell4.resourcesProvider);
                            dialogCell4.translationDrawable = Theme.dialogs_swipeDeleteDrawable;
                        } else if (SharedConfig.getChatSwipeAction(dialogCell4.currentAccount) == 1) {
                            if (dialogCell4.unreadCount > 0 || dialogCell4.markUnread) {
                                i = R.string.SwipeMarkAsRead;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipeReadDrawable;
                            } else {
                                i = R.string.SwipeMarkAsUnread;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipeUnreadDrawable;
                            }
                        } else if (SharedConfig.getChatSwipeAction(dialogCell4.currentAccount) != 0) {
                            i = R.string.Archive;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_archiveDrawable;
                        } else if (dialogCell4.getIsPinned()) {
                            i = R.string.SwipeUnpin;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_swipeUnpinDrawable;
                        } else {
                            i = R.string.SwipePin;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_swipePinDrawable;
                        }
                        str = string;
                        if (dialogCell4.swipeCanceled || (rLottieDrawable = dialogCell4.lastDrawTranslationDrawable) == null) {
                            dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                            dialogCell4.lastDrawSwipeMessageStringId = i;
                        } else {
                            dialogCell4.translationDrawable = rLottieDrawable;
                            i = dialogCell4.lastDrawSwipeMessageStringId;
                        }
                        if (!dialogCell4.translationAnimationStarted && Math.abs(dialogCell4.translationX) > AndroidUtilities.dp(43.0f)) {
                            dialogCell4.translationAnimationStarted = true;
                            dialogCell4.translationDrawable.setProgress(0.0f);
                            dialogCell4.translationDrawable.setCallback(dialogCell4);
                            dialogCell4.translationDrawable.start();
                        }
                        measuredWidth = dialogCell4.getMeasuredWidth() + dialogCell4.translationX;
                        f3 = 0.069565214f;
                        f4 = 22.0f;
                        if (dialogCell4.currentRevealProgress < f) {
                            Theme.dialogs_pinnedPaint.setColor(color);
                            i3 = i;
                            f5 = measuredWidth;
                            f6 = 0.0f;
                            z = true;
                            str2 = str;
                            canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                            if (dialogCell4.currentRevealProgress == 0.0f) {
                                if (Theme.dialogs_archiveDrawableRecolored) {
                                    Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                                    Theme.dialogs_archiveDrawableRecolored = false;
                                }
                                if (Theme.dialogs_hidePsaDrawableRecolored) {
                                    Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                                    RLottieDrawable rLottieDrawable3 = Theme.dialogs_hidePsaDrawable;
                                    int i25 = Theme.key_chats_archiveBackground;
                                    rLottieDrawable3.setLayerColor("Line 1", Theme.getNonAnimatedColor(i25));
                                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i25));
                                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i25));
                                    Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                                    Theme.dialogs_hidePsaDrawableRecolored = false;
                                }
                            }
                        } else {
                            f5 = measuredWidth;
                            i3 = i;
                            str2 = str;
                            f6 = 0.0f;
                            z = true;
                        }
                        int measuredWidth2 = (dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.translationDrawable.getIntrinsicWidth() / 2);
                        iM$2 = OKLCH.m$2(52.0f, dialogCell4.getMeasuredHeight(), 2);
                        intrinsicWidth = (dialogCell4.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
                        intrinsicHeight = (dialogCell4.translationDrawable.getIntrinsicHeight() / 2) + iM$2;
                        if (dialogCell4.currentRevealProgress > f6) {
                            canvas3.save();
                            str3 = str2;
                            canvas3.clipRect(f5 - AndroidUtilities.dp(8.0f), f6, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                            Theme.dialogs_pinnedPaint.setColor(i2);
                            f7 = 0.0f;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, AndroidUtilities.accelerateInterpolator.getInterpolation(dialogCell4.currentRevealProgress) * ((float) Math.sqrt(((intrinsicHeight - dialogCell4.getMeasuredHeight()) * (intrinsicHeight - dialogCell4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), Theme.dialogs_pinnedPaint);
                            canvas3.restore();
                            if (!Theme.dialogs_archiveDrawableRecolored) {
                                Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                                Theme.dialogs_archiveDrawableRecolored = z;
                            }
                            if (!Theme.dialogs_hidePsaDrawableRecolored) {
                                Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                                RLottieDrawable rLottieDrawable4 = Theme.dialogs_hidePsaDrawable;
                                int i26 = Theme.key_chats_archivePinBackground;
                                rLottieDrawable4.setLayerColor("Line 1", Theme.getNonAnimatedColor(i26));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i26));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i26));
                                Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                                Theme.dialogs_hidePsaDrawableRecolored = z;
                            }
                        } else {
                            str3 = str2;
                            f7 = 0.0f;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, iM$2);
                        f8 = dialogCell4.currentRevealBounceProgress;
                        if (f8 != f7 && f8 != f) {
                            float interpolation = dialogCell4.interpolator.getInterpolation(f8) + f;
                            canvas3.scale(interpolation, interpolation, dialogCell4.translationDrawable.getIntrinsicWidth() / 2, dialogCell4.translationDrawable.getIntrinsicHeight() / 2);
                        }
                        BaseCell.setDrawableBounds((Drawable) dialogCell4.translationDrawable, 0, 0);
                        dialogCell4.translationDrawable.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f5, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                        str4 = str3;
                        iCeil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str4));
                        i4 = i3;
                        if (dialogCell4.swipeMessageTextId == i4 || dialogCell4.swipeMessageWidth != dialogCell4.getMeasuredWidth()) {
                            dialogCell4.swipeMessageTextId = i4;
                            dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                            TextPaint textPaint = Theme.dialogs_archiveTextPaint;
                            int iMin = Math.min(AndroidUtilities.dp(80.0f), iCeil);
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str4, textPaint, iMin, alignment, 1.0f, 0.0f, false);
                            dialogCell4.swipeMessageTextLayout = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                dialogCell4.swipeMessageTextLayout = new StaticLayout(str4, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), iCeil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (dialogCell4.swipeMessageTextLayout != null) {
                            canvas3.save();
                            if (dialogCell4.swipeMessageTextLayout.getLineCount() > 1) {
                                f9 = -AndroidUtilities.dp(4.0f);
                            } else {
                                f9 = 0.0f;
                            }
                            canvas3.translate((dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.swipeMessageTextLayout.getWidth() / 2.0f), AndroidUtilities.dp(36.0f) + iM$2 + f9);
                            dialogCell4.swipeMessageTextLayout.draw(canvas3);
                            canvas3.restore();
                        }
                        canvas3.restore();
                    } else {
                        color = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                        color2 = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                        i = R.string.Unarchive;
                        string = LocaleController.getString(i);
                        dialogCell4.translationDrawable = Theme.dialogs_unarchiveDrawable;
                    }
                }
                i2 = color2;
                str = string;
                if (dialogCell4.swipeCanceled) {
                    dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                    dialogCell4.lastDrawSwipeMessageStringId = i;
                } else {
                    dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                    dialogCell4.lastDrawSwipeMessageStringId = i;
                }
                if (!dialogCell4.translationAnimationStarted) {
                    dialogCell4.translationAnimationStarted = true;
                    dialogCell4.translationDrawable.setProgress(0.0f);
                    dialogCell4.translationDrawable.setCallback(dialogCell4);
                    dialogCell4.translationDrawable.start();
                }
                measuredWidth = dialogCell4.getMeasuredWidth() + dialogCell4.translationX;
                f3 = 0.069565214f;
                f4 = 22.0f;
                if (dialogCell4.currentRevealProgress < f) {
                    Theme.dialogs_pinnedPaint.setColor(color);
                    i3 = i;
                    f5 = measuredWidth;
                    f6 = 0.0f;
                    z = true;
                    str2 = str;
                    canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                    if (dialogCell4.currentRevealProgress == 0.0f) {
                        if (Theme.dialogs_archiveDrawableRecolored) {
                            Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                            Theme.dialogs_archiveDrawableRecolored = false;
                        }
                        if (Theme.dialogs_hidePsaDrawableRecolored) {
                            Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                            RLottieDrawable rLottieDrawable5 = Theme.dialogs_hidePsaDrawable;
                            int i27 = Theme.key_chats_archiveBackground;
                            rLottieDrawable5.setLayerColor("Line 1", Theme.getNonAnimatedColor(i27));
                            Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i27));
                            Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i27));
                            Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                            Theme.dialogs_hidePsaDrawableRecolored = false;
                        }
                    }
                } else {
                    f5 = measuredWidth;
                    i3 = i;
                    str2 = str;
                    f6 = 0.0f;
                    z = true;
                }
                int measuredWidth3 = (dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.translationDrawable.getIntrinsicWidth() / 2);
                iM$2 = OKLCH.m$2(52.0f, dialogCell4.getMeasuredHeight(), 2);
                intrinsicWidth = (dialogCell4.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth3;
                intrinsicHeight = (dialogCell4.translationDrawable.getIntrinsicHeight() / 2) + iM$2;
                if (dialogCell4.currentRevealProgress > f6) {
                    canvas3.save();
                    str3 = str2;
                    canvas3.clipRect(f5 - AndroidUtilities.dp(8.0f), f6, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                    Theme.dialogs_pinnedPaint.setColor(i2);
                    f7 = 0.0f;
                    canvas3.drawCircle(intrinsicWidth, intrinsicHeight, AndroidUtilities.accelerateInterpolator.getInterpolation(dialogCell4.currentRevealProgress) * ((float) Math.sqrt(((intrinsicHeight - dialogCell4.getMeasuredHeight()) * (intrinsicHeight - dialogCell4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), Theme.dialogs_pinnedPaint);
                    canvas3.restore();
                    if (!Theme.dialogs_archiveDrawableRecolored) {
                        Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                        Theme.dialogs_archiveDrawableRecolored = z;
                    }
                    if (!Theme.dialogs_hidePsaDrawableRecolored) {
                        Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                        RLottieDrawable rLottieDrawable6 = Theme.dialogs_hidePsaDrawable;
                        int i28 = Theme.key_chats_archivePinBackground;
                        rLottieDrawable6.setLayerColor("Line 1", Theme.getNonAnimatedColor(i28));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i28));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i28));
                        Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                        Theme.dialogs_hidePsaDrawableRecolored = z;
                    }
                } else {
                    str3 = str2;
                    f7 = 0.0f;
                }
                canvas3.save();
                canvas3.translate(measuredWidth3, iM$2);
                f8 = dialogCell4.currentRevealBounceProgress;
                if (f8 != f7) {
                    float interpolation2 = dialogCell4.interpolator.getInterpolation(f8) + f;
                    canvas3.scale(interpolation2, interpolation2, dialogCell4.translationDrawable.getIntrinsicWidth() / 2, dialogCell4.translationDrawable.getIntrinsicHeight() / 2);
                }
                BaseCell.setDrawableBounds((Drawable) dialogCell4.translationDrawable, 0, 0);
                dialogCell4.translationDrawable.draw(canvas3);
                canvas3.restore();
                canvas3.clipRect(f5, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                str4 = str3;
                iCeil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str4));
                i4 = i3;
                if (dialogCell4.swipeMessageTextId == i4) {
                    dialogCell4.swipeMessageTextId = i4;
                    dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                    TextPaint textPaint2 = Theme.dialogs_archiveTextPaint;
                    int iMin2 = Math.min(AndroidUtilities.dp(80.0f), iCeil);
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    staticLayout = new StaticLayout(str4, textPaint2, iMin2, alignment, 1.0f, 0.0f, false);
                    dialogCell4.swipeMessageTextLayout = staticLayout;
                    if (staticLayout.getLineCount() > 1) {
                        dialogCell4.swipeMessageTextLayout = new StaticLayout(str4, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), iCeil), alignment, 1.0f, 0.0f, false);
                    }
                } else {
                    dialogCell4.swipeMessageTextId = i4;
                    dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                    TextPaint textPaint3 = Theme.dialogs_archiveTextPaint;
                    int iMin3 = Math.min(AndroidUtilities.dp(80.0f), iCeil);
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    staticLayout = new StaticLayout(str4, textPaint3, iMin3, alignment, 1.0f, 0.0f, false);
                    dialogCell4.swipeMessageTextLayout = staticLayout;
                    if (staticLayout.getLineCount() > 1) {
                        dialogCell4.swipeMessageTextLayout = new StaticLayout(str4, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), iCeil), alignment, 1.0f, 0.0f, false);
                    }
                }
                if (dialogCell4.swipeMessageTextLayout != null) {
                    canvas3.save();
                    if (dialogCell4.swipeMessageTextLayout.getLineCount() > 1) {
                        f9 = -AndroidUtilities.dp(4.0f);
                    } else {
                        f9 = 0.0f;
                    }
                    canvas3.translate((dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.swipeMessageTextLayout.getWidth() / 2.0f), AndroidUtilities.dp(36.0f) + iM$2 + f9);
                    dialogCell4.swipeMessageTextLayout.draw(canvas3);
                    canvas3.restore();
                }
                canvas3.restore();
            }
            if (dialogCell4.translationX != 0.0f) {
                canvas3.save();
                canvas3.translate(dialogCell4.translationX, 0.0f);
                f10 = 0.0f + dialogCell4.translationX;
            } else {
                f10 = 0.0f;
            }
            float fDp2 = AndroidUtilities.dp(8.0f) * dialogCell4.cornerProgress;
            if (dialogCell4.isSelected) {
                f11 = 0.0f;
                dialogCell4.rect.set(0.0f, 0.0f, dialogCell4.getMeasuredWidth(), AndroidUtilities.lerp(dialogCell4.getMeasuredHeight(), dialogCell4.getCollapsedHeight(), dialogCell4.rightFragmentOpenedProgress));
                dialogCell4.rect.offset(0.0f, (-dialogCell4.translateY) + dialogCell4.collapseOffset);
                canvas3.drawRoundRect(dialogCell4.rect, fDp2, fDp2, Theme.dialogs_tabletSeletedPaint);
            } else {
                f11 = 0.0f;
            }
            canvas3.save();
            canvas3.translate(f11, (-dialogCell4.rightFragmentOffset) * dialogCell4.rightFragmentOpenedProgress);
            if (dialogCell4.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || dialogCell4.archiveBackgroundProgress != f11)) {
                Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider), dialogCell4.archiveBackgroundProgress, 1.0f));
                Paint paint2 = Theme.dialogs_pinnedPaint;
                paint2.setAlpha((int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * paint2.getAlpha()));
            } else if (dialogCell4.getIsPinned() || dialogCell4.drawPinBackground) {
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider));
                Paint paint3 = Theme.dialogs_pinnedPaint;
                paint3.setAlpha((int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * paint3.getAlpha()));
            }
            canvas3.restore();
            dialogCell4.updateHelper.updateAnimationValues();
            if (dialogCell4.collapseOffset != 0.0f) {
                canvas3.save();
                canvas3.translate(0.0f, dialogCell4.collapseOffset);
                f12 = 0.0f + dialogCell4.collapseOffset;
            } else {
                f12 = 0.0f;
            }
            float f50 = dialogCell4.rightFragmentOpenedProgress;
            if (f50 != 1.0f) {
                if (f50 != 0.0f) {
                    float fClamp = Utilities.clamp(f50 / 0.4f, 1.0f, 0.0f);
                    if (SharedConfig.getDevicePerformanceClass() >= 2) {
                        f13 = 6.0f;
                        iSaveLayerAlpha = canvas3.saveLayerAlpha(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, fClamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1)), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), (int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * 255.0f), 31);
                    } else {
                        f13 = 6.0f;
                        int iSave = canvas3.save();
                        canvas3.clipRect(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, fClamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1)), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                        iSaveLayerAlpha = iSave;
                    }
                    canvas3.translate((-(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * dialogCell4.rightFragmentOpenedProgress, 0.0f);
                    f10 += (-(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * dialogCell4.rightFragmentOpenedProgress;
                } else {
                    f13 = 6.0f;
                    iSaveLayerAlpha = -1;
                }
                float f51 = f10;
                if (dialogCell4.translationX != 0.0f || dialogCell4.cornerProgress != 0.0f) {
                    canvas3.save();
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell4.resourcesProvider));
                    dialogCell4.rect.set(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                    dialogCell4.rect.offset(0.0f, -dialogCell4.translateY);
                    canvas3.drawRoundRect(dialogCell4.rect, fDp2, fDp2, Theme.dialogs_pinnedPaint);
                    if (dialogCell4.isSelected) {
                        canvas3.drawRoundRect(dialogCell4.rect, fDp2, fDp2, Theme.dialogs_tabletSeletedPaint);
                    }
                    if (dialogCell4.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || dialogCell4.archiveBackgroundProgress != 0.0f)) {
                        Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider), dialogCell4.archiveBackgroundProgress, 1.0f));
                        Paint paint4 = Theme.dialogs_pinnedPaint;
                        paint4.setAlpha((int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * paint4.getAlpha()));
                    } else if (dialogCell4.getIsPinned() || dialogCell4.drawPinBackground) {
                        Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider));
                        Paint paint5 = Theme.dialogs_pinnedPaint;
                        paint5.setAlpha((int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * paint5.getAlpha()));
                    }
                    canvas3.restore();
                }
                if (dialogCell4.translationX != 0.0f) {
                    float f52 = dialogCell4.cornerProgress;
                    if (f52 < 1.0f) {
                        float f53 = f52 + 0.10666667f;
                        dialogCell4.cornerProgress = f53;
                        if (f53 > 1.0f) {
                            dialogCell4.cornerProgress = 1.0f;
                        }
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    float f54 = dialogCell4.cornerProgress;
                    if (f54 > 0.0f) {
                        float f55 = f54 - 0.10666667f;
                        dialogCell4.cornerProgress = f55;
                        if (f55 < 0.0f) {
                            dialogCell4.cornerProgress = 0.0f;
                        }
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (dialogCell4.drawNameLock) {
                    BaseCell.setDrawableBounds(Theme.dialogs_lockDrawable, dialogCell4.nameLockLeft, dialogCell4.nameLockTop);
                    Theme.dialogs_lockDrawable.draw(canvas3);
                }
                int iDp5 = AndroidUtilities.dp((dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 14.0f);
                if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                    iDp5 -= AndroidUtilities.dp(dialogCell4.isForumCell() ? 8.0f : 9.0f);
                }
                if (dialogCell4.nameLayout != null) {
                    if (!dialogCell4.nameLayoutEllipsizeByGradient || dialogCell4.nameLayoutFits) {
                        i8 = iSaveLayerAlpha;
                        f14 = 5.0f;
                    } else {
                        if (dialogCell4.nameLayoutEllipsizeLeft && dialogCell4.fadePaint == null) {
                            Paint paint6 = new Paint();
                            dialogCell4.fadePaint = paint6;
                            paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                            dialogCell4.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        } else if (dialogCell4.fadePaintBack == null) {
                            Paint paint7 = new Paint();
                            dialogCell4.fadePaintBack = paint7;
                            paint7.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                            dialogCell4.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        }
                        i8 = iSaveLayerAlpha;
                        f14 = 5.0f;
                        canvas3.saveLayerAlpha(0.0f, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), 255, 31);
                        int i29 = dialogCell4.nameLeft;
                        canvas3.clipRect(i29, 0, dialogCell4.nameWidth + i29, dialogCell4.getMeasuredHeight());
                    }
                    if (dialogCell4.currentDialogFolderId != 0) {
                        TextPaint textPaint4 = Theme.dialogs_namePaint[dialogCell4.paintIndex];
                        int color4 = Theme.getColor(Theme.key_chats_nameArchived, dialogCell4.resourcesProvider);
                        textPaint4.linkColor = color4;
                        textPaint4.setColor(color4);
                    } else if (dialogCell4.encryptedChat != null || ((customDialog = dialogCell4.customDialog) != null && customDialog.type == 2)) {
                        TextPaint textPaint5 = Theme.dialogs_namePaint[dialogCell4.paintIndex];
                        int color5 = Theme.getColor(Theme.key_chats_secretName, dialogCell4.resourcesProvider);
                        textPaint5.linkColor = color5;
                        textPaint5.setColor(color5);
                    } else {
                        TextPaint textPaint6 = Theme.dialogs_namePaint[dialogCell4.paintIndex];
                        int color6 = Theme.getColor(Theme.key_chats_name, dialogCell4.resourcesProvider);
                        textPaint6.linkColor = color6;
                        textPaint6.setColor(color6);
                    }
                    canvas3.save();
                    canvas3.translate(dialogCell4.nameLeft + dialogCell4.nameLayoutTranslateX, iDp5);
                    SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.nameLayout);
                    StaticLayout staticLayout3 = dialogCell4.nameLayout;
                    i6 = 2;
                    f33 = 0.0f;
                    f34 = 1.0f;
                    i9 = -1;
                    f35 = 2.0f;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout3, dialogCell4.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(0, staticLayout3.getPaint().getColor()));
                    canvas3.restore();
                    if (dialogCell4.nameLayoutEllipsizeByGradient && !dialogCell4.nameLayoutFits) {
                        canvas3.save();
                        if (dialogCell4.nameLayoutEllipsizeLeft) {
                            canvas3.translate(dialogCell4.nameLeft, 0.0f);
                            canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), dialogCell4.getMeasuredHeight(), dialogCell4.fadePaint);
                        } else {
                            canvas3.translate((dialogCell4.nameLeft + dialogCell4.nameWidth) - AndroidUtilities.dp(24.0f), 0.0f);
                            canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), dialogCell4.getMeasuredHeight(), dialogCell4.fadePaintBack);
                        }
                        canvas3.restore();
                        canvas3.restore();
                    }
                } else {
                    i8 = iSaveLayerAlpha;
                    i6 = 2;
                    f33 = 0.0f;
                    f34 = 1.0f;
                    f14 = 5.0f;
                    i9 = -1;
                    f35 = 2.0f;
                }
                if (dialogCell4.timeLayout != null && dialogCell4.currentDialogFolderId == 0) {
                    canvas3.save();
                    canvas3.translate(dialogCell4.timeLeft, dialogCell4.timeTop);
                    TextPaint timeTextPaint = dialogCell4.getTimeTextPaint();
                    if (dialogCell4.getIsPinned()) {
                        canvas3.translate(AndroidUtilities.dp(20.0f), f33);
                        float height = (dialogCell4.timeLayout.getHeight() / f35) - AndroidUtilities.dp(8.5f);
                        float f56 = -AndroidUtilities.dp(20.0f);
                        float fDp3 = AndroidUtilities.dp(f13) + dialogCell4.timeLayout.getWidth();
                        Drawable drawable3 = (!dialogCell4.drawCount || dialogCell4.isCounterMuted()) ? Theme.dialogs_pinnedDrawable2 : Theme.dialogs_pinnedDrawable2Accent;
                        int iDp6 = (int) (((AndroidUtilities.dp(17.0f) - drawable3.getIntrinsicHeight()) / f35) + height);
                        int iDp7 = AndroidUtilities.dp(4.0f) + ((int) f56);
                        drawable3.setBounds(iDp7, iDp6, drawable3.getIntrinsicWidth() + iDp7, drawable3.getIntrinsicHeight() + iDp6);
                        int alpha2 = timeTextPaint.getAlpha();
                        timeTextPaint.setAlpha(27);
                        canvas3.drawRoundRect(f56, height, fDp3, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                        timeTextPaint.setAlpha(alpha2);
                        drawable3.draw(canvas3);
                    }
                    int color7 = dialogCell4.timeLayout.getPaint().getColor();
                    boolean z19 = color7 != timeTextPaint.getColor();
                    if (z19) {
                        dialogCell4.timeLayout.getPaint().setColor(timeTextPaint.getColor());
                    }
                    SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.timeLayout);
                    if (z19) {
                        dialogCell4.timeLayout.getPaint().setColor(color7);
                    }
                    canvas3.restore();
                }
                if (dialogCell4.drawLock2()) {
                    Theme.dialogs_lock2Drawable.setBounds(dialogCell4.lock2Left, ((dialogCell4.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i6) + dialogCell4.timeTop, Theme.dialogs_lock2Drawable.getIntrinsicWidth() + dialogCell4.lock2Left, Theme.dialogs_lock2Drawable.getIntrinsicHeight() + ((dialogCell4.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i6) + dialogCell4.timeTop);
                    Theme.dialogs_lock2Drawable.draw(canvas3);
                }
                if (dialogCell4.messageNameLayout != null && !dialogCell4.isForumCell()) {
                    if (dialogCell4.currentDialogFolderId != 0) {
                        TextPaint textPaint7 = Theme.dialogs_messageNamePaint;
                        int color8 = Theme.getColor(Theme.key_chats_nameMessageArchived_threeLines, dialogCell4.resourcesProvider);
                        textPaint7.linkColor = color8;
                        textPaint7.setColor(color8);
                    } else if (dialogCell4.draftMessage != null) {
                        TextPaint textPaint8 = Theme.dialogs_messageNamePaint;
                        int color9 = Theme.getColor(Theme.key_chats_draft, dialogCell4.resourcesProvider);
                        textPaint8.linkColor = color9;
                        textPaint8.setColor(color9);
                    } else {
                        TextPaint textPaint9 = Theme.dialogs_messageNamePaint;
                        int color10 = Theme.getColor(Theme.key_chats_nameMessage_threeLines, dialogCell4.resourcesProvider);
                        textPaint9.linkColor = color10;
                        textPaint9.setColor(color10);
                    }
                    canvas3.save();
                    canvas3.translate(dialogCell4.messageNameLeft, dialogCell4.messageNameTop);
                    try {
                        SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.messageNameLayout);
                        StaticLayout staticLayout4 = dialogCell4.messageNameLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout4, dialogCell4.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(1, staticLayout4.getPaint().getColor()));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    canvas3.restore();
                }
                if (dialogCell4.messageLayout != null) {
                    if (dialogCell4.currentDialogFolderId == 0) {
                        TextPaint textPaint10 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                        int color11 = Theme.getColor(Theme.key_chats_message, dialogCell4.resourcesProvider);
                        textPaint10.linkColor = color11;
                        textPaint10.setColor(color11);
                    } else if (dialogCell4.chat != null) {
                        TextPaint textPaint11 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                        int color12 = Theme.getColor(Theme.key_chats_nameMessageArchived, dialogCell4.resourcesProvider);
                        textPaint11.linkColor = color12;
                        textPaint11.setColor(color12);
                    } else {
                        TextPaint textPaint12 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                        int color13 = Theme.getColor(Theme.key_chats_messageArchived, dialogCell4.resourcesProvider);
                        textPaint12.linkColor = color13;
                        textPaint12.setColor(color13);
                    }
                    float fDp4 = AndroidUtilities.dp(14.0f);
                    DialogUpdateHelper dialogUpdateHelper4 = dialogCell4.updateHelper;
                    float fDp5 = dialogUpdateHelper4.typingOutToTop ? dialogCell4.messageTop - (dialogUpdateHelper4.typingProgres * fDp4) : dialogCell4.messageTop + (dialogUpdateHelper4.typingProgres * fDp4);
                    if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                        fDp5 -= AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f);
                    }
                    if (dialogCell4.updateHelper.typingProgres != f34) {
                        canvas3.save();
                        canvas3.translate(dialogCell4.messageLeft, fDp5);
                        int alpha3 = dialogCell4.messageLayout.getPaint().getAlpha();
                        dialogCell4.messageLayout.getPaint().setAlpha((int) ((f34 - dialogCell4.updateHelper.typingProgres) * alpha3));
                        if (dialogCell4.spoilers.isEmpty()) {
                            f45 = fDp4;
                            i24 = alpha3;
                            f36 = 0.0f;
                            SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.messageLayout);
                            StaticLayout staticLayout5 = dialogCell4.messageLayout;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout5, dialogCell4.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(i6, staticLayout5.getPaint().getColor()));
                        } else {
                            try {
                                canvas3.save();
                                SpoilerEffect.clipOutCanvas(canvas3, dialogCell4.spoilers);
                                SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.messageLayout);
                                try {
                                    StaticLayout staticLayout6 = dialogCell4.messageLayout;
                                    try {
                                        try {
                                            i24 = alpha3;
                                            f45 = fDp4;
                                            f36 = 0.0f;
                                            try {
                                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout6, dialogCell4.animatedEmojiStack, -0.075f, dialogCell4.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(i6, staticLayout6.getPaint().getColor()));
                                                canvas3.restore();
                                                for (int i30 = 0; i30 < dialogCell4.spoilers.size(); i30++) {
                                                    SpoilerEffect spoilerEffect = dialogCell4.spoilers.get(i30);
                                                    spoilerEffect.setColor(dialogCell4.messageLayout.getPaint().getColor());
                                                    spoilerEffect.draw(canvas3);
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                FileLog.e(e);
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            f45 = fDp4;
                                            i24 = alpha3;
                                            f36 = 0.0f;
                                            FileLog.e(e);
                                            dialogCell4.messageLayout.getPaint().setAlpha(i24);
                                            canvas3.restore();
                                            canvas3.save();
                                            dialogUpdateHelper = dialogCell4.updateHelper;
                                            if (dialogUpdateHelper.typingOutToTop) {
                                                fM = DiffUtil.m(1.0f, dialogUpdateHelper.typingProgres, f45, dialogCell4.messageTop);
                                            } else {
                                                fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper.typingProgres, f45, dialogCell4.messageTop);
                                            }
                                            if (dialogCell4.useForceThreeLines) {
                                                if (dialogCell4.isForumCell()) {
                                                    f47 = 10.0f;
                                                } else {
                                                    f47 = 11.0f;
                                                }
                                                fM -= AndroidUtilities.dp(f47);
                                            } else {
                                                if (dialogCell4.isForumCell()) {
                                                    f47 = 10.0f;
                                                } else {
                                                    f47 = 11.0f;
                                                }
                                                fM -= AndroidUtilities.dp(f47);
                                            }
                                            canvas3.translate(dialogCell4.typingLeft, fM);
                                            staticLayout2 = dialogCell4.typingLayout;
                                            if (staticLayout2 != null) {
                                                int alpha4 = staticLayout2.getPaint().getAlpha();
                                                dialogCell4.typingLayout.getPaint().setAlpha((int) (alpha4 * dialogCell4.updateHelper.typingProgres));
                                                dialogCell4.typingLayout.draw(canvas3);
                                                dialogCell4.typingLayout.getPaint().setAlpha(alpha4);
                                            }
                                            canvas3.restore();
                                            if (dialogCell4.typingLayout != null) {
                                                i23 = dialogCell4.printingStringType;
                                                if (i23 < 0) {
                                                    dialogUpdateHelper3 = dialogCell4.updateHelper;
                                                    if (dialogUpdateHelper3.typingProgres > f36) {
                                                        if (i23 < 0) {
                                                            i23 = dialogCell4.updateHelper.lastKnownTypingType;
                                                        }
                                                        chatStatusDrawable = Theme.getChatStatusDrawable(i23);
                                                        if (chatStatusDrawable != null) {
                                                            canvas3.save();
                                                            int color14 = Theme.getColor(Theme.key_chats_actionMessage);
                                                            chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(color14, (int) (Color.alpha(color14) * dialogCell4.updateHelper.typingProgres)));
                                                            dialogUpdateHelper2 = dialogCell4.updateHelper;
                                                            if (dialogUpdateHelper2.typingOutToTop) {
                                                                fM2 = DiffUtil.m(1.0f, dialogUpdateHelper2.typingProgres, f45, dialogCell4.messageTop);
                                                            } else {
                                                                fM2 = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper2.typingProgres, f45, dialogCell4.messageTop);
                                                            }
                                                            if (dialogCell4.useForceThreeLines) {
                                                                if (dialogCell4.isForumCell()) {
                                                                    f46 = 10.0f;
                                                                } else {
                                                                    f46 = 11.0f;
                                                                }
                                                                fM2 -= AndroidUtilities.dp(f46);
                                                            } else {
                                                                if (dialogCell4.isForumCell()) {
                                                                    f46 = 10.0f;
                                                                } else {
                                                                    f46 = 11.0f;
                                                                }
                                                                fM2 -= AndroidUtilities.dp(f46);
                                                            }
                                                            if (i23 != 1) {
                                                                float f57 = dialogCell4.statusDrawableLeft;
                                                                if (i23 == 1) {
                                                                    iDp4 = AndroidUtilities.dp(1.0f);
                                                                } else {
                                                                    iDp4 = 0;
                                                                }
                                                                canvas3.translate(f57, fM2 + iDp4);
                                                            } else {
                                                                float f58 = dialogCell4.statusDrawableLeft;
                                                                if (i23 == 1) {
                                                                    iDp4 = AndroidUtilities.dp(1.0f);
                                                                } else {
                                                                    iDp4 = 0;
                                                                }
                                                                canvas3.translate(f58, fM2 + iDp4);
                                                            }
                                                            chatStatusDrawable.draw(canvas3);
                                                            dialogCell4.invalidate();
                                                            canvas3.restore();
                                                        }
                                                    }
                                                } else {
                                                    if (i23 < 0) {
                                                        i23 = dialogCell4.updateHelper.lastKnownTypingType;
                                                    }
                                                    chatStatusDrawable = Theme.getChatStatusDrawable(i23);
                                                    if (chatStatusDrawable != null) {
                                                        canvas3.save();
                                                        int color15 = Theme.getColor(Theme.key_chats_actionMessage);
                                                        chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(color15, (int) (Color.alpha(color15) * dialogCell4.updateHelper.typingProgres)));
                                                        dialogUpdateHelper2 = dialogCell4.updateHelper;
                                                        if (dialogUpdateHelper2.typingOutToTop) {
                                                            fM2 = DiffUtil.m(1.0f, dialogUpdateHelper2.typingProgres, f45, dialogCell4.messageTop);
                                                        } else {
                                                            fM2 = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper2.typingProgres, f45, dialogCell4.messageTop);
                                                        }
                                                        if (dialogCell4.useForceThreeLines) {
                                                            if (dialogCell4.isForumCell()) {
                                                                f46 = 10.0f;
                                                            } else {
                                                                f46 = 11.0f;
                                                            }
                                                            fM2 -= AndroidUtilities.dp(f46);
                                                        } else {
                                                            if (dialogCell4.isForumCell()) {
                                                                f46 = 10.0f;
                                                            } else {
                                                                f46 = 11.0f;
                                                            }
                                                            fM2 -= AndroidUtilities.dp(f46);
                                                        }
                                                        if (i23 != 1) {
                                                            float f59 = dialogCell4.statusDrawableLeft;
                                                            if (i23 == 1) {
                                                                iDp4 = AndroidUtilities.dp(1.0f);
                                                            } else {
                                                                iDp4 = 0;
                                                            }
                                                            canvas3.translate(f59, fM2 + iDp4);
                                                        } else {
                                                            float f510 = dialogCell4.statusDrawableLeft;
                                                            if (i23 == 1) {
                                                                iDp4 = AndroidUtilities.dp(1.0f);
                                                            } else {
                                                                iDp4 = 0;
                                                            }
                                                            canvas3.translate(f510, fM2 + iDp4);
                                                        }
                                                        chatStatusDrawable.draw(canvas3);
                                                        dialogCell4.invalidate();
                                                        canvas3.restore();
                                                    }
                                                }
                                            }
                                            if (dialogCell4.buttonLayout != null) {
                                                canvas3.save();
                                                if (dialogCell4.buttonBackgroundPaint == null) {
                                                    dialogCell4.buttonBackgroundPaint = new Paint(1);
                                                }
                                                if (dialogCell4.canvasButton == null) {
                                                    CanvasButton canvasButton = new CanvasButton(dialogCell4);
                                                    dialogCell4.canvasButton = canvasButton;
                                                    final int i31 = 0;
                                                    canvasButton.setDelegate(new Runnable(dialogCell4) {
                                                        public final DialogCell f$0;

                                                        {
                                                            this.f$0 = dialogCell4;
                                                        }

                                                        @Override
                                                        public final void run() {
                                                            switch (i31) {
                                                                case 0:
                                                                    this.f$0.lambda$onDraw$2();
                                                                    break;
                                                                default:
                                                                    this.f$0.lambda$onDraw$3();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    final int i32 = 1;
                                                    dialogCell4.canvasButton.setLongPress(new Runnable(dialogCell4) {
                                                        public final DialogCell f$0;

                                                        {
                                                            this.f$0 = dialogCell4;
                                                        }

                                                        @Override
                                                        public final void run() {
                                                            switch (i32) {
                                                                case 0:
                                                                    this.f$0.lambda$onDraw$2();
                                                                    break;
                                                                default:
                                                                    this.f$0.lambda$onDraw$3();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                if (dialogCell4.lastTopicMessageUnread) {
                                                    CanvasButton canvasButton2 = dialogCell4.canvasButton;
                                                    int color16 = dialogCell4.currentMessagePaint.getColor();
                                                    if (Theme.isCurrentThemeDark()) {
                                                        i21 = 36;
                                                    } else {
                                                        i21 = 26;
                                                    }
                                                    canvasButton2.setColor(ColorUtils.setAlphaComponent(color16, i21));
                                                    if (!dialogCell4.buttonCreated) {
                                                        dialogCell4.canvasButton.rewind();
                                                        i22 = dialogCell4.topMessageTopicEndIndex;
                                                        if (i22 != dialogCell4.topMessageTopicStartIndex) {
                                                            float fDp6 = dialogCell4.messageTop;
                                                            fDp6 = dialogCell4.useForceThreeLines ? fDp6 - AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f) : fDp6 - AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f);
                                                            rectF2 = AndroidUtilities.rectTmp;
                                                            float primaryHorizontal = dialogCell4.messageLayout.getPrimaryHorizontal(0) + AndroidUtilities.dp(f35) + dialogCell4.messageLeft;
                                                            float f60 = dialogCell4.messageLeft;
                                                            StaticLayout staticLayout7 = dialogCell4.messageLayout;
                                                            rectF2.set(primaryHorizontal, fDp6, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), dialogCell4.topMessageTopicEndIndex)) + f60) - AndroidUtilities.dp(3.0f), dialogCell4.buttonTop - AndroidUtilities.dp(4.0f));
                                                            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                                                            if (rectF2.right > rectF2.left) {
                                                                dialogCell4.canvasButton.addRect(rectF2);
                                                            }
                                                        }
                                                        float lineLeft = dialogCell4.buttonLayout.getLineLeft(0);
                                                        RectF rectF3 = AndroidUtilities.rectTmp;
                                                        rectF3.set(dialogCell4.buttonLeft + lineLeft + AndroidUtilities.dp(f35), AndroidUtilities.dp(f35) + dialogCell4.buttonTop, dialogCell4.buttonLayout.getLineWidth(0) + dialogCell4.buttonLeft + lineLeft + AndroidUtilities.dp(12.0f), dialogCell4.buttonLayout.getHeight() + dialogCell4.buttonTop);
                                                        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                                                        dialogCell4.canvasButton.addRect(rectF3);
                                                    }
                                                    dialogCell4.canvasButton.draw(canvas3);
                                                    Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                                                    Drawable drawable4 = Theme.dialogs_forum_arrowDrawable;
                                                    RectF rectF4 = AndroidUtilities.rectTmp;
                                                    BaseCell.setDrawableBounds(drawable4, rectF4.right - AndroidUtilities.dp(18.0f), ImageReceiver$$ExternalSyntheticOutline0.m(rectF4.height(), Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight(), 2.0f, rectF4.top));
                                                    Theme.dialogs_forum_arrowDrawable.draw(canvas3);
                                                }
                                                canvas3.translate(dialogCell4.buttonLeft, dialogCell4.buttonTop);
                                                if (dialogCell4.spoilers2.isEmpty()) {
                                                    SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.buttonLayout);
                                                    StaticLayout staticLayout8 = dialogCell4.buttonLayout;
                                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout8, dialogCell4.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(3, staticLayout8.getPaint().getColor()));
                                                } else {
                                                    try {
                                                        canvas3.save();
                                                        SpoilerEffect.clipOutCanvas(canvas3, dialogCell4.spoilers2);
                                                        SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.buttonLayout);
                                                        StaticLayout staticLayout9 = dialogCell4.buttonLayout;
                                                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout9, dialogCell4.animatedEmojiStack3, -0.075f, dialogCell4.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(3, staticLayout9.getPaint().getColor()));
                                                        canvas3.restore();
                                                        for (i19 = 0; i19 < dialogCell4.spoilers2.size(); i19++) {
                                                            SpoilerEffect spoilerEffect2 = dialogCell4.spoilers2.get(i19);
                                                            spoilerEffect2.setColor(dialogCell4.buttonLayout.getPaint().getColor());
                                                            spoilerEffect2.draw(canvas3);
                                                        }
                                                    } catch (Exception e4) {
                                                        FileLog.e(e4);
                                                    }
                                                }
                                                canvas.restore();
                                            }
                                            if (dialogCell4.currentDialogFolderId == 0) {
                                                boolean z20 = dialogCell4.drawClock;
                                                if (dialogCell4.drawCheck1) {
                                                    i12 = 2;
                                                } else {
                                                    i12 = 0;
                                                }
                                                int i33 = (z20 ? 1 : 0) + i12;
                                                if (dialogCell4.drawCheck2) {
                                                    i13 = 4;
                                                } else {
                                                    i13 = 0;
                                                }
                                                i14 = i33 + i13;
                                                i15 = dialogCell4.lastStatusDrawableParams;
                                                if (i15 >= 0) {
                                                    dialogCell4.createStatusDrawableAnimator(i15, i14);
                                                }
                                                z10 = dialogCell4.statusDrawableAnimationInProgress;
                                                if (z10) {
                                                    i14 = dialogCell4.animateToStatusDrawableParams;
                                                }
                                                if ((i14 & 1) != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if ((i14 & 2) != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if ((i14 & 4) != 0) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (z10) {
                                                    i18 = dialogCell4.animateFromStatusDrawableParams;
                                                    if ((i18 & 1) != 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if ((i18 & 2) != 0) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if ((i18 & 4) != 0) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if (z11) {
                                                    }
                                                    boolean z21 = z12;
                                                    boolean z22 = z15;
                                                    canvas3 = canvas;
                                                    dialogCell4.drawCheckStatus(canvas3, z14, z22, z16, false, 1.0f - dialogCell4.statusDrawableProgress);
                                                    dialogCell4.drawCheckStatus(canvas3, z11, z21, z13, false, dialogCell4.statusDrawableProgress);
                                                    dialogCell3 = this;
                                                    boolean z23 = dialogCell3.drawClock;
                                                    if (dialogCell3.drawCheck1) {
                                                        i16 = 2;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int i34 = (z23 ? 1 : 0) + i16;
                                                    if (dialogCell3.drawCheck2) {
                                                        i17 = 4;
                                                    } else {
                                                        i17 = 0;
                                                    }
                                                    dialogCell3.lastStatusDrawableParams = i34 + i17;
                                                } else {
                                                    dialogCell4 = this;
                                                    canvas3 = canvas;
                                                    dialogCell4.drawCheckStatus(canvas3, z11, z12, z13, false, 1.0f);
                                                }
                                                dialogCell3 = dialogCell4;
                                                boolean z24 = dialogCell3.drawClock;
                                                if (dialogCell3.drawCheck1) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i35 = (z24 ? 1 : 0) + i16;
                                                if (dialogCell3.drawCheck2) {
                                                    i17 = 4;
                                                } else {
                                                    i17 = 0;
                                                }
                                                dialogCell3.lastStatusDrawableParams = i35 + i17;
                                            } else {
                                                canvas3 = canvas;
                                                dialogCell3 = dialogCell4;
                                            }
                                            f37 = 12.5f;
                                            if (dialogCell3.drawBotVerified) {
                                                if (dialogCell3.useForceThreeLines) {
                                                    f44 = 12.5f;
                                                } else {
                                                    f44 = 12.5f;
                                                }
                                                iDp3 = AndroidUtilities.dp(f44);
                                                iDp3 = dialogCell3.useForceThreeLines ? iDp3 - AndroidUtilities.dp(9.0f) : iDp3 - AndroidUtilities.dp(9.0f);
                                                swapAnimatedEmojiDrawable = dialogCell3.botVerification;
                                                if (swapAnimatedEmojiDrawable != null) {
                                                    swapAnimatedEmojiDrawable.setBounds(dialogCell3.nameLeft - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + iDp3, dialogCell3.nameLeft - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f) + iDp3);
                                                    dialogCell3.botVerification.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                                                    dialogCell3.botVerification.draw(canvas3);
                                                }
                                            }
                                            if (dialogCell3.drawUnmute) {
                                                z8 = true;
                                            } else {
                                                z8 = true;
                                            }
                                            if (dialogCell3.dialogsType != i6) {
                                                i5 = 17;
                                            } else {
                                                i5 = 17;
                                            }
                                            if (dialogCell3.drawVerified) {
                                                if (!dialogCell3.useForceThreeLines) {
                                                    f48 = 16.5f;
                                                }
                                                float fDp7 = AndroidUtilities.dp(f48);
                                                fDp7 = dialogCell3.useForceThreeLines ? fDp7 - AndroidUtilities.dp(9.0f) : fDp7 - AndroidUtilities.dp(9.0f);
                                                BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp7);
                                                BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp7);
                                                Theme.dialogs_verifiedDrawable.draw(canvas3);
                                                Theme.dialogs_verifiedCheckDrawable.draw(canvas3);
                                            } else {
                                                if (dialogCell3.drawPremium) {
                                                    if (dialogCell3.useForceThreeLines) {
                                                        f38 = 12.5f;
                                                    } else {
                                                        f38 = 12.5f;
                                                    }
                                                    iDp2 = AndroidUtilities.dp(f38);
                                                    iDp2 = dialogCell3.useForceThreeLines ? iDp2 - AndroidUtilities.dp(9.0f) : iDp2 - AndroidUtilities.dp(9.0f);
                                                    if (dialogCell3.emojiStatus != null) {
                                                        dialogCell3.emojiStatusView.setTranslationX((f51 + dialogCell3.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                                                        dialogCell3.emojiStatusView.setTranslationY((f12 + iDp2) - AndroidUtilities.dp(4.0f));
                                                        if (dialogCell3.rightFragmentOpenedProgress > 0.0f) {
                                                            dialogCell3.emojiStatus.setBounds(dialogCell3.nameMuteLeft - AndroidUtilities.dp(2.0f), iDp2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(20.0f) + dialogCell3.nameMuteLeft, AndroidUtilities.dp(f4) + (iDp2 - AndroidUtilities.dp(4.0f)));
                                                            dialogCell3.emojiStatus.draw(canvas3);
                                                            z9 = false;
                                                        } else {
                                                            z9 = true;
                                                        }
                                                        dialogCell3.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                                                        z2 = z9;
                                                    } else {
                                                        Drawable drawable5 = PremiumGradient.getInstance().premiumStarDrawableMini;
                                                        int iDp8 = dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f);
                                                        if (!dialogCell3.useForceThreeLines) {
                                                            f37 = 15.5f;
                                                        }
                                                        BaseCell.setDrawableBounds(drawable5, iDp8, AndroidUtilities.dp(f37));
                                                        drawable5.draw(canvas3);
                                                    }
                                                    if (dialogCell3.drawReorder) {
                                                        if (!LocaleController.isRTL) {
                                                            Paint paintReorderGradient = dialogCell3.getPaintReorderGradient();
                                                            paintReorderGradient.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                            canvas3.save();
                                                            canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(24.0f), dialogCell3.pinTop);
                                                            canvas.drawRect(0.0f, 0.0f, dialogCell3.getMeasuredWidth() - (dialogCell3.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient);
                                                            canvas3 = canvas;
                                                            canvas3.restore();
                                                        }
                                                        Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                                                        Theme.dialogs_reorderDrawable.draw(canvas3);
                                                    } else {
                                                        if (!LocaleController.isRTL) {
                                                            Paint paintReorderGradient2 = dialogCell3.getPaintReorderGradient();
                                                            paintReorderGradient2.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                            canvas3.save();
                                                            canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(24.0f), dialogCell3.pinTop);
                                                            canvas.drawRect(0.0f, 0.0f, dialogCell3.getMeasuredWidth() - (dialogCell3.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient2);
                                                            canvas3 = canvas;
                                                            canvas3.restore();
                                                        }
                                                        Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                                                        Theme.dialogs_reorderDrawable.draw(canvas3);
                                                    }
                                                    floatValue = dialogCell3.animatorPollVotesMentionVisible.getFloatValue();
                                                    if (dialogCell3.drawError) {
                                                        if (dialogCell3.drawCount) {
                                                        }
                                                        zIsCounterMuted = dialogCell3.isCounterMuted();
                                                        canvas3 = canvas;
                                                        drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                                                        dialogCell = this;
                                                        if (dialogCell.drawMention) {
                                                            Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            if (dialogCell.mentionLayout != null) {
                                                                int i36 = dialogCell.mentionLeft;
                                                                dialogCell.rect.set(i36, dialogCell.countTop, AndroidUtilities.dp(12.666f) + i36 + dialogCell.mentionWidth, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                                if (zIsCounterMuted) {
                                                                    paint = Theme.dialogs_countPaint;
                                                                } else {
                                                                    paint = Theme.dialogs_countPaint;
                                                                }
                                                                RectF rectF5 = dialogCell.rect;
                                                                canvas3.drawRoundRect(rectF5, rectF5.height() / 2.0f, dialogCell.rect.height() / 2.0f, paint);
                                                                Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                                canvas3.save();
                                                                canvas3.translate(AndroidUtilities.dp(6.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(4.0f) + dialogCell.countTop);
                                                                dialogCell.mentionLayout.draw(canvas3);
                                                                canvas3.restore();
                                                            } else {
                                                                Drawable drawable6 = Theme.dialogs_mentionDrawable;
                                                                drawable6.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                                DrawableUtils.setBounds(drawable6, AndroidUtilities.dp(10.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                                drawable6.draw(canvas3);
                                                            }
                                                        }
                                                        if (dialogCell.drawReactionMention) {
                                                            int i37 = dialogCell.reactionMentionLeft;
                                                            dialogCell.rect.set(i37, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i37, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                            f39 = dialogCell.reactionsMentionsChangeProgress;
                                                            if (f39 == 1.0f) {
                                                                f39 = 1.0f;
                                                            } else if (!dialogCell.drawReactionMention) {
                                                                f39 = 1.0f - f39;
                                                            }
                                                            if (zIsCounterMuted) {
                                                                drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                            } else {
                                                                drawable = Theme.dialogs_reactionsMentionDrawable;
                                                            }
                                                            drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i37, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                            DrawableUtils.drawWithScale(canvas3, drawable, f39);
                                                        } else {
                                                            int i38 = dialogCell.reactionMentionLeft;
                                                            dialogCell.rect.set(i38, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i38, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                            f39 = dialogCell.reactionsMentionsChangeProgress;
                                                            if (f39 == 1.0f) {
                                                                f39 = 1.0f;
                                                            } else if (!dialogCell.drawReactionMention) {
                                                                f39 = 1.0f - f39;
                                                            }
                                                            if (zIsCounterMuted) {
                                                                drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                            } else {
                                                                drawable = Theme.dialogs_reactionsMentionDrawable;
                                                            }
                                                            drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i38, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                            DrawableUtils.drawWithScale(canvas3, drawable, f39);
                                                        }
                                                        if (dialogCell.drawPollVotesMention) {
                                                            int i39 = dialogCell.pollVotesMentionLeft;
                                                            dialogCell.rect.set(i39, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i39, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                            if (zIsCounterMuted) {
                                                                drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                            } else {
                                                                drawable2 = Theme.dialogs_pollMentionDrawable;
                                                            }
                                                            drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i39, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                            DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                                                        } else {
                                                            int i310 = dialogCell.pollVotesMentionLeft;
                                                            dialogCell.rect.set(i310, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i310, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                            if (zIsCounterMuted) {
                                                                drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                            } else {
                                                                drawable2 = Theme.dialogs_pollMentionDrawable;
                                                            }
                                                            drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i310, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                            DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                                                        }
                                                        if (dialogCell.thumbsCount > 0) {
                                                            f40 = dialogCell.updateHelper.typingProgres;
                                                            if (f40 != 1.0f) {
                                                                if (f40 > 0.0f) {
                                                                    canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f40) * 255.0f), 31);
                                                                    canvas3 = canvas;
                                                                    if (dialogCell.updateHelper.typingOutToTop) {
                                                                        fDp = -AndroidUtilities.dp(14.0f);
                                                                        f41 = dialogCell.updateHelper.typingProgres;
                                                                    } else {
                                                                        fDp = AndroidUtilities.dp(14.0f);
                                                                        f41 = dialogCell.updateHelper.typingProgres;
                                                                    }
                                                                    canvas3.translate(0.0f, fDp * f41);
                                                                }
                                                                i11 = 0;
                                                                while (i11 < dialogCell.thumbsCount) {
                                                                    if (dialogCell.thumbImageSeen[i11]) {
                                                                        if (dialogCell.thumbBackgroundPaint == null) {
                                                                            Paint paint8 = new Paint(1);
                                                                            dialogCell.thumbBackgroundPaint = paint8;
                                                                            paint8.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                            dialogCell.thumbBackgroundPaint.setColor(0);
                                                                        }
                                                                        rectF = AndroidUtilities.rectTmp;
                                                                        rectF.set(dialogCell.thumbImage[i11].getImageX(), dialogCell.thumbImage[i11].getImageY(), dialogCell.thumbImage[i11].getImageX2(), dialogCell.thumbImage[i11].getImageY2());
                                                                        dialogCell.thumbImage[i11].draw(canvas3);
                                                                        if (!dialogCell.drawSpoiler[i11]) {
                                                                            path = dialogCell.thumbPath;
                                                                            if (path == null) {
                                                                                dialogCell.thumbPath = new Path();
                                                                            } else {
                                                                                path.rewind();
                                                                            }
                                                                            dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i11].getRoundRadius()[0], dialogCell.thumbImage[i11].getRoundRadius()[1], Path.Direction.CW);
                                                                            canvas3.save();
                                                                            canvas3.clipPath(dialogCell.thumbPath);
                                                                            if (dialogCell.thumbSpoiler == null) {
                                                                                dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                            }
                                                                            dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                                                            dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i11].getImageX(), (int) dialogCell.thumbImage[i11].getImageY(), (int) dialogCell.thumbImage[i11].getImageX2(), (int) dialogCell.thumbImage[i11].getImageY2());
                                                                            dialogCell.thumbSpoiler.draw(canvas3);
                                                                            dialogCell.invalidate();
                                                                            canvas3.restore();
                                                                        }
                                                                        if (dialogCell.drawPlay[i11]) {
                                                                            BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i11].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i6)), (int) (dialogCell.thumbImage[i11].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i6)));
                                                                            Theme.dialogs_playDrawable.draw(canvas3);
                                                                        }
                                                                    }
                                                                    i11++;
                                                                    i9 = -1;
                                                                }
                                                                i10 = -1;
                                                                if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                                                    canvas3.restore();
                                                                }
                                                            } else {
                                                                i10 = -1;
                                                            }
                                                        } else {
                                                            i10 = -1;
                                                        }
                                                        dialogCellTags = dialogCell.tags;
                                                        if (dialogCellTags != null) {
                                                            canvas3.save();
                                                            canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                            dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                            canvas3.restore();
                                                        }
                                                        if (i8 != i10) {
                                                            canvas3.restoreToCount(i8);
                                                        }
                                                        if (dialogCell.animatingArchiveAvatar) {
                                                            canvas3.save();
                                                            float interpolation3 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                            canvas3.scale(interpolation3, interpolation3, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
                                                        }
                                                        if (dialogCell.drawAvatar) {
                                                            if (dialogCell.drawMonoforumAvatar) {
                                                                if (dialogCell.bubbleClip == null) {
                                                                    dialogCell.bubbleClip = new PhotoBubbleClip();
                                                                }
                                                                dialogCell.bubbleClip.setBounds((int) dialogCell.storyParams.originalAvatarRect.centerX(), (int) dialogCell.storyParams.originalAvatarRect.centerY(), (int) (dialogCell.storyParams.originalAvatarRect.width() / 2.0f));
                                                                canvas3.save();
                                                                canvas3.clipPath(dialogCell.bubbleClip);
                                                                dialogCell.avatarImage.setImageCoords(dialogCell.storyParams.originalAvatarRect);
                                                                dialogCell.avatarImage.draw(canvas3);
                                                                canvas3.restore();
                                                            } else if (dialogCell.drawCommunityAvatar) {
                                                                DrawableUtils.setBounds(dialogCell.avatarImage, AndroidUtilities.dpf2(1.0f) + dialogCell.storyParams.originalAvatarRect.centerX(), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                                                                DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY(), AndroidUtilities.dp(48.0f));
                                                                dialogCell.avatarImage.draw(canvas3);
                                                            } else {
                                                                avatarStoryParams = dialogCell.storyParams;
                                                                z6 = dialogCell.isShareToStoryCell;
                                                                if (z6) {
                                                                    z7 = true;
                                                                } else {
                                                                    z7 = true;
                                                                }
                                                                avatarStoryParams.drawHiddenStoriesAsSegments = z7;
                                                                int i40 = avatarStoryParams.forceState;
                                                                if (z6) {
                                                                    avatarStoryParams.forceState = 1;
                                                                }
                                                                StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                                                                if (dialogCell.storyParams.drawnLive) {
                                                                    dialogCell.checkTtl();
                                                                }
                                                                dialogCell.storyParams.forceState = i40;
                                                            }
                                                            if (!dialogCell.insideCommunityList) {
                                                                float fCenterX = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                                float fCenterY = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                                if (dialogCell.communityArrowDrawable == null) {
                                                                    dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                                }
                                                                DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX, fCenterY, i5);
                                                                canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                                                                dialogCell.communityArrowDrawable.draw(canvas3);
                                                            }
                                                        }
                                                        if (dialogCell.animatingArchiveAvatar) {
                                                            canvas3.restore();
                                                        }
                                                        if (dialogCell.avatarImage.getVisible()) {
                                                            z3 = true;
                                                        }
                                                        if (dialogCell.rightFragmentOpenedProgress > 0.0f) {
                                                            dialogCell2 = dialogCell;
                                                        } else {
                                                            dialogCell2 = dialogCell;
                                                        }
                                                        if (dialogCell2.collapseOffset != 0.0f) {
                                                            canvas3.restore();
                                                        }
                                                        if (dialogCell2.translationX != 0.0f) {
                                                            canvas3.restore();
                                                        }
                                                        if (dialogCell2.drawArchive) {
                                                            canvas3.save();
                                                            canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                                                            canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                                            dialogCell2.archivedChatsDrawable.draw(canvas3);
                                                            canvas3.restore();
                                                        }
                                                        if (dialogCell2.useSeparator) {
                                                            if (dialogCell2.fullSeparator) {
                                                                iDp = 0;
                                                            } else {
                                                                iDp = 0;
                                                            }
                                                            if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                                                alpha = Theme.dividerPaint.getAlpha();
                                                                f32 = dialogCell2.rightFragmentOpenedProgress;
                                                                if (f32 != 0.0f) {
                                                                    Theme.dividerPaint.setAlpha((int) ((1.0f - f32) * alpha));
                                                                }
                                                                measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                                if (LocaleController.isRTL) {
                                                                    canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                                                                } else {
                                                                    canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                                                                }
                                                                f15 = 0.0f;
                                                                if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                                    Theme.dividerPaint.setAlpha(alpha);
                                                                }
                                                            } else {
                                                                f15 = 0.0f;
                                                            }
                                                        } else {
                                                            f15 = 0.0f;
                                                        }
                                                        if (dialogCell2.clipProgress == f15) {
                                                            canvas2 = canvas;
                                                        } else if (Build.VERSION.SDK_INT != 24) {
                                                            canvas.restore();
                                                            canvas2 = canvas;
                                                        } else {
                                                            Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell2.resourcesProvider));
                                                            canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                                                            canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                                                            canvas2 = canvas;
                                                        }
                                                        if (z18) {
                                                            float f61 = 1.0f - pullProgress;
                                                            int measuredHeight2 = (int) (dialogCell2.getMeasuredHeight() * f61);
                                                            color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                                                            if (dialogCell2.archiveFadeGradientDrawable == null) {
                                                                dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                                            }
                                                            if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                                                                dialogCell2.archiveFadeGradientDrawableColor = color3;
                                                                dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                                                            }
                                                            float fClamp2 = MathUtils.clamp((f61 - 0.05f) * 10.0f, 0.0f, 1.0f);
                                                            dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight2, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(f13) + measuredHeight2);
                                                            dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp2 * 255.0f));
                                                            dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                            canvas2.restore();
                                                        }
                                                        z4 = dialogCell2.drawReorder;
                                                        if (z4) {
                                                            if (z4) {
                                                                f19 = dialogCell2.reorderIconProgress;
                                                                if (f19 < 1.0f) {
                                                                    f20 = f19 + 0.09411765f;
                                                                    dialogCell2.reorderIconProgress = f20;
                                                                    if (f20 > 1.0f) {
                                                                        dialogCell2.reorderIconProgress = 1.0f;
                                                                    }
                                                                    f17 = 0.0f;
                                                                } else {
                                                                    f17 = 0.0f;
                                                                }
                                                            } else {
                                                                f16 = dialogCell2.reorderIconProgress;
                                                                f17 = 0.0f;
                                                                if (f16 > 0.0f) {
                                                                    f18 = f16 - 0.09411765f;
                                                                    dialogCell2.reorderIconProgress = f18;
                                                                    if (f18 < 0.0f) {
                                                                        dialogCell2.reorderIconProgress = 0.0f;
                                                                    }
                                                                }
                                                            }
                                                            z3 = true;
                                                        } else {
                                                            if (z4) {
                                                                f19 = dialogCell2.reorderIconProgress;
                                                                if (f19 < 1.0f) {
                                                                    f20 = f19 + 0.09411765f;
                                                                    dialogCell2.reorderIconProgress = f20;
                                                                    if (f20 > 1.0f) {
                                                                        dialogCell2.reorderIconProgress = 1.0f;
                                                                    }
                                                                    f17 = 0.0f;
                                                                } else {
                                                                    f17 = 0.0f;
                                                                }
                                                            } else {
                                                                f16 = dialogCell2.reorderIconProgress;
                                                                f17 = 0.0f;
                                                                if (f16 > 0.0f) {
                                                                    f18 = f16 - 0.09411765f;
                                                                    dialogCell2.reorderIconProgress = f18;
                                                                    if (f18 < 0.0f) {
                                                                        dialogCell2.reorderIconProgress = 0.0f;
                                                                    }
                                                                }
                                                            }
                                                            z3 = true;
                                                        }
                                                        if (dialogCell2.archiveHidden) {
                                                            f30 = dialogCell2.archiveBackgroundProgress;
                                                            if (f30 > f17) {
                                                                f31 = f30 - f3;
                                                                dialogCell2.archiveBackgroundProgress = f31;
                                                                if (f31 < f17) {
                                                                    dialogCell2.archiveBackgroundProgress = f17;
                                                                }
                                                                if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                                                                    dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                                }
                                                                z3 = true;
                                                            }
                                                        } else {
                                                            f21 = dialogCell2.archiveBackgroundProgress;
                                                            if (f21 < 1.0f) {
                                                                f22 = f21 + f3;
                                                                dialogCell2.archiveBackgroundProgress = f22;
                                                                if (f22 > 1.0f) {
                                                                    dialogCell2.archiveBackgroundProgress = 1.0f;
                                                                }
                                                                if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                                                                    dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                                }
                                                                z3 = true;
                                                            }
                                                        }
                                                        if (dialogCell2.animatingArchiveAvatar) {
                                                            f29 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                            dialogCell2.animatingArchiveAvatarProgress = f29;
                                                            if (f29 >= 170.0f) {
                                                                dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                                                                dialogCell2.animatingArchiveAvatar = false;
                                                            }
                                                            z5 = true;
                                                        } else {
                                                            z5 = z3;
                                                        }
                                                        if (dialogCell2.drawRevealBackground) {
                                                            f25 = dialogCell2.currentRevealBounceProgress;
                                                            if (f25 < 1.0f) {
                                                                f28 = f25 + 0.09411765f;
                                                                dialogCell2.currentRevealBounceProgress = f28;
                                                                if (f28 > 1.0f) {
                                                                    dialogCell2.currentRevealBounceProgress = 1.0f;
                                                                    z5 = true;
                                                                }
                                                            }
                                                            f26 = dialogCell2.currentRevealProgress;
                                                            if (f26 < 1.0f) {
                                                                f27 = f26 + f2;
                                                                dialogCell2.currentRevealProgress = f27;
                                                                if (f27 > 1.0f) {
                                                                    dialogCell2.currentRevealProgress = 1.0f;
                                                                }
                                                                z5 = true;
                                                            }
                                                        } else {
                                                            if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                                dialogCell2.currentRevealBounceProgress = 0.0f;
                                                                z5 = true;
                                                            }
                                                            f23 = dialogCell2.currentRevealProgress;
                                                            if (f23 > 0.0f) {
                                                                f24 = f23 - f2;
                                                                dialogCell2.currentRevealProgress = f24;
                                                                if (f24 < 0.0f) {
                                                                    dialogCell2.currentRevealProgress = 0.0f;
                                                                }
                                                                z5 = true;
                                                            }
                                                        }
                                                        View view = dialogCell2.emojiStatusView;
                                                        if (z2) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 4;
                                                        }
                                                        view.setVisibility(i7);
                                                        if (z5) {
                                                            dialogCell2.invalidate();
                                                        }
                                                    }
                                                    Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                                                    RectF rectF6 = dialogCell3.rect;
                                                    int i41 = dialogCell3.errorLeft;
                                                    rectF6.set(i41, dialogCell3.errorTop, AndroidUtilities.dp(20.666f) + i41, AndroidUtilities.dp(20.666f) + dialogCell3.errorTop);
                                                    RectF rectF7 = dialogCell3.rect;
                                                    float f62 = AndroidUtilities.density * 10.5f;
                                                    canvas3.drawRoundRect(rectF7, f62, f62, Theme.dialogs_errorPaint);
                                                    BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, AndroidUtilities.dp(4.5f) + dialogCell3.errorLeft, AndroidUtilities.dp(f14) + dialogCell3.errorTop);
                                                    Theme.dialogs_errorDrawable.draw(canvas3);
                                                    dialogCell = dialogCell3;
                                                    if (dialogCell.thumbsCount > 0) {
                                                        f40 = dialogCell.updateHelper.typingProgres;
                                                        if (f40 != 1.0f) {
                                                            if (f40 > 0.0f) {
                                                                canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f40) * 255.0f), 31);
                                                                canvas3 = canvas;
                                                                if (dialogCell.updateHelper.typingOutToTop) {
                                                                    fDp = -AndroidUtilities.dp(14.0f);
                                                                    f41 = dialogCell.updateHelper.typingProgres;
                                                                } else {
                                                                    fDp = AndroidUtilities.dp(14.0f);
                                                                    f41 = dialogCell.updateHelper.typingProgres;
                                                                }
                                                                canvas3.translate(0.0f, fDp * f41);
                                                            }
                                                            i11 = 0;
                                                            while (i11 < dialogCell.thumbsCount) {
                                                                if (dialogCell.thumbImageSeen[i11]) {
                                                                    if (dialogCell.thumbBackgroundPaint == null) {
                                                                        Paint paint9 = new Paint(1);
                                                                        dialogCell.thumbBackgroundPaint = paint9;
                                                                        paint9.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                        dialogCell.thumbBackgroundPaint.setColor(0);
                                                                    }
                                                                    rectF = AndroidUtilities.rectTmp;
                                                                    rectF.set(dialogCell.thumbImage[i11].getImageX(), dialogCell.thumbImage[i11].getImageY(), dialogCell.thumbImage[i11].getImageX2(), dialogCell.thumbImage[i11].getImageY2());
                                                                    dialogCell.thumbImage[i11].draw(canvas3);
                                                                    if (!dialogCell.drawSpoiler[i11]) {
                                                                        path = dialogCell.thumbPath;
                                                                        if (path == null) {
                                                                            dialogCell.thumbPath = new Path();
                                                                        } else {
                                                                            path.rewind();
                                                                        }
                                                                        dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i11].getRoundRadius()[0], dialogCell.thumbImage[i11].getRoundRadius()[1], Path.Direction.CW);
                                                                        canvas3.save();
                                                                        canvas3.clipPath(dialogCell.thumbPath);
                                                                        if (dialogCell.thumbSpoiler == null) {
                                                                            dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                        }
                                                                        dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                                                        dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i11].getImageX(), (int) dialogCell.thumbImage[i11].getImageY(), (int) dialogCell.thumbImage[i11].getImageX2(), (int) dialogCell.thumbImage[i11].getImageY2());
                                                                        dialogCell.thumbSpoiler.draw(canvas3);
                                                                        dialogCell.invalidate();
                                                                        canvas3.restore();
                                                                    }
                                                                    if (dialogCell.drawPlay[i11]) {
                                                                        BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i11].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i6)), (int) (dialogCell.thumbImage[i11].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i6)));
                                                                        Theme.dialogs_playDrawable.draw(canvas3);
                                                                    }
                                                                }
                                                                i11++;
                                                                i9 = -1;
                                                            }
                                                            i10 = -1;
                                                            if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                                                canvas3.restore();
                                                            }
                                                        } else {
                                                            i10 = -1;
                                                        }
                                                    } else {
                                                        i10 = -1;
                                                    }
                                                    dialogCellTags = dialogCell.tags;
                                                    if (dialogCellTags != null) {
                                                        canvas3.save();
                                                        canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                        dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                        canvas3.restore();
                                                    }
                                                    if (i8 != i10) {
                                                        canvas3.restoreToCount(i8);
                                                    }
                                                    if (dialogCell.animatingArchiveAvatar) {
                                                        canvas3.save();
                                                        float interpolation4 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                        canvas3.scale(interpolation4, interpolation4, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
                                                    }
                                                    if (dialogCell.drawAvatar) {
                                                        if (dialogCell.drawMonoforumAvatar) {
                                                            if (dialogCell.bubbleClip == null) {
                                                                dialogCell.bubbleClip = new PhotoBubbleClip();
                                                            }
                                                            dialogCell.bubbleClip.setBounds((int) dialogCell.storyParams.originalAvatarRect.centerX(), (int) dialogCell.storyParams.originalAvatarRect.centerY(), (int) (dialogCell.storyParams.originalAvatarRect.width() / 2.0f));
                                                            canvas3.save();
                                                            canvas3.clipPath(dialogCell.bubbleClip);
                                                            dialogCell.avatarImage.setImageCoords(dialogCell.storyParams.originalAvatarRect);
                                                            dialogCell.avatarImage.draw(canvas3);
                                                            canvas3.restore();
                                                        } else if (dialogCell.drawCommunityAvatar) {
                                                            DrawableUtils.setBounds(dialogCell.avatarImage, AndroidUtilities.dpf2(1.0f) + dialogCell.storyParams.originalAvatarRect.centerX(), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                                                            DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY(), AndroidUtilities.dp(48.0f));
                                                            dialogCell.avatarImage.draw(canvas3);
                                                        } else {
                                                            avatarStoryParams = dialogCell.storyParams;
                                                            z6 = dialogCell.isShareToStoryCell;
                                                            if (z6) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = true;
                                                            }
                                                            avatarStoryParams.drawHiddenStoriesAsSegments = z7;
                                                            int i42 = avatarStoryParams.forceState;
                                                            if (z6) {
                                                                avatarStoryParams.forceState = 1;
                                                            }
                                                            StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                                                            if (dialogCell.storyParams.drawnLive) {
                                                                dialogCell.checkTtl();
                                                            }
                                                            dialogCell.storyParams.forceState = i42;
                                                        }
                                                        if (!dialogCell.insideCommunityList) {
                                                            float fCenterX2 = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                            float fCenterY2 = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                            if (dialogCell.communityArrowDrawable == null) {
                                                                dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                            }
                                                            DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX2, fCenterY2, i5);
                                                            canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                                                            dialogCell.communityArrowDrawable.draw(canvas3);
                                                        }
                                                    }
                                                    if (dialogCell.animatingArchiveAvatar) {
                                                        canvas3.restore();
                                                    }
                                                    if (dialogCell.avatarImage.getVisible()) {
                                                        z3 = true;
                                                    }
                                                    if (dialogCell.rightFragmentOpenedProgress > 0.0f) {
                                                        dialogCell2 = dialogCell;
                                                    } else {
                                                        dialogCell2 = dialogCell;
                                                    }
                                                    if (dialogCell2.collapseOffset != 0.0f) {
                                                        canvas3.restore();
                                                    }
                                                    if (dialogCell2.translationX != 0.0f) {
                                                        canvas3.restore();
                                                    }
                                                    if (dialogCell2.drawArchive) {
                                                        canvas3.save();
                                                        canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                                                        canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                                        dialogCell2.archivedChatsDrawable.draw(canvas3);
                                                        canvas3.restore();
                                                    }
                                                    if (dialogCell2.useSeparator) {
                                                        f15 = 0.0f;
                                                    } else {
                                                        if (dialogCell2.fullSeparator) {
                                                            iDp = 0;
                                                        } else {
                                                            iDp = 0;
                                                        }
                                                        if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                                            alpha = Theme.dividerPaint.getAlpha();
                                                            f32 = dialogCell2.rightFragmentOpenedProgress;
                                                            if (f32 != 0.0f) {
                                                                Theme.dividerPaint.setAlpha((int) ((1.0f - f32) * alpha));
                                                            }
                                                            measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                            if (LocaleController.isRTL) {
                                                                canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                                                            } else {
                                                                canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                                                            }
                                                            f15 = 0.0f;
                                                            if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                                Theme.dividerPaint.setAlpha(alpha);
                                                            }
                                                        } else {
                                                            f15 = 0.0f;
                                                        }
                                                    }
                                                    if (dialogCell2.clipProgress == f15) {
                                                        canvas2 = canvas;
                                                    } else if (Build.VERSION.SDK_INT != 24) {
                                                        canvas.restore();
                                                        canvas2 = canvas;
                                                    } else {
                                                        Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell2.resourcesProvider));
                                                        canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                                                        canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                                                        canvas2 = canvas;
                                                    }
                                                    if (z18) {
                                                        float f63 = 1.0f - pullProgress;
                                                        int measuredHeight3 = (int) (dialogCell2.getMeasuredHeight() * f63);
                                                        color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                                                        if (dialogCell2.archiveFadeGradientDrawable == null) {
                                                            dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                                        }
                                                        if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                                                            dialogCell2.archiveFadeGradientDrawableColor = color3;
                                                            dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                                                        }
                                                        float fClamp3 = MathUtils.clamp((f63 - 0.05f) * 10.0f, 0.0f, 1.0f);
                                                        dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight3, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(f13) + measuredHeight3);
                                                        dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp3 * 255.0f));
                                                        dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                        canvas2.restore();
                                                    }
                                                    z4 = dialogCell2.drawReorder;
                                                    if (z4) {
                                                        if (z4) {
                                                            f19 = dialogCell2.reorderIconProgress;
                                                            if (f19 < 1.0f) {
                                                                f20 = f19 + 0.09411765f;
                                                                dialogCell2.reorderIconProgress = f20;
                                                                if (f20 > 1.0f) {
                                                                    dialogCell2.reorderIconProgress = 1.0f;
                                                                }
                                                                f17 = 0.0f;
                                                            } else {
                                                                f17 = 0.0f;
                                                            }
                                                        } else {
                                                            f16 = dialogCell2.reorderIconProgress;
                                                            f17 = 0.0f;
                                                            if (f16 > 0.0f) {
                                                                f18 = f16 - 0.09411765f;
                                                                dialogCell2.reorderIconProgress = f18;
                                                                if (f18 < 0.0f) {
                                                                    dialogCell2.reorderIconProgress = 0.0f;
                                                                }
                                                            }
                                                        }
                                                        z3 = true;
                                                    } else {
                                                        if (z4) {
                                                            f19 = dialogCell2.reorderIconProgress;
                                                            if (f19 < 1.0f) {
                                                                f20 = f19 + 0.09411765f;
                                                                dialogCell2.reorderIconProgress = f20;
                                                                if (f20 > 1.0f) {
                                                                    dialogCell2.reorderIconProgress = 1.0f;
                                                                }
                                                                f17 = 0.0f;
                                                            } else {
                                                                f17 = 0.0f;
                                                            }
                                                        } else {
                                                            f16 = dialogCell2.reorderIconProgress;
                                                            f17 = 0.0f;
                                                            if (f16 > 0.0f) {
                                                                f18 = f16 - 0.09411765f;
                                                                dialogCell2.reorderIconProgress = f18;
                                                                if (f18 < 0.0f) {
                                                                    dialogCell2.reorderIconProgress = 0.0f;
                                                                }
                                                            }
                                                        }
                                                        z3 = true;
                                                    }
                                                    if (dialogCell2.archiveHidden) {
                                                        f30 = dialogCell2.archiveBackgroundProgress;
                                                        if (f30 > f17) {
                                                            f31 = f30 - f3;
                                                            dialogCell2.archiveBackgroundProgress = f31;
                                                            if (f31 < f17) {
                                                                dialogCell2.archiveBackgroundProgress = f17;
                                                            }
                                                            if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                                                                dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                            }
                                                            z3 = true;
                                                        }
                                                    } else {
                                                        f21 = dialogCell2.archiveBackgroundProgress;
                                                        if (f21 < 1.0f) {
                                                            f22 = f21 + f3;
                                                            dialogCell2.archiveBackgroundProgress = f22;
                                                            if (f22 > 1.0f) {
                                                                dialogCell2.archiveBackgroundProgress = 1.0f;
                                                            }
                                                            if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                                                                dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                            }
                                                            z3 = true;
                                                        }
                                                    }
                                                    if (dialogCell2.animatingArchiveAvatar) {
                                                        f29 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                        dialogCell2.animatingArchiveAvatarProgress = f29;
                                                        if (f29 >= 170.0f) {
                                                            dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                                                            dialogCell2.animatingArchiveAvatar = false;
                                                        }
                                                        z5 = true;
                                                    } else {
                                                        z5 = z3;
                                                    }
                                                    if (dialogCell2.drawRevealBackground) {
                                                        f25 = dialogCell2.currentRevealBounceProgress;
                                                        if (f25 < 1.0f) {
                                                            f28 = f25 + 0.09411765f;
                                                            dialogCell2.currentRevealBounceProgress = f28;
                                                            if (f28 > 1.0f) {
                                                                dialogCell2.currentRevealBounceProgress = 1.0f;
                                                                z5 = true;
                                                            }
                                                        }
                                                        f26 = dialogCell2.currentRevealProgress;
                                                        if (f26 < 1.0f) {
                                                            f27 = f26 + f2;
                                                            dialogCell2.currentRevealProgress = f27;
                                                            if (f27 > 1.0f) {
                                                                dialogCell2.currentRevealProgress = 1.0f;
                                                            }
                                                            z5 = true;
                                                        }
                                                    } else {
                                                        if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                            dialogCell2.currentRevealBounceProgress = 0.0f;
                                                            z5 = true;
                                                        }
                                                        f23 = dialogCell2.currentRevealProgress;
                                                        if (f23 > 0.0f) {
                                                            f24 = f23 - f2;
                                                            dialogCell2.currentRevealProgress = f24;
                                                            if (f24 < 0.0f) {
                                                                dialogCell2.currentRevealProgress = 0.0f;
                                                            }
                                                            z5 = true;
                                                        }
                                                    }
                                                    View view2 = dialogCell2.emojiStatusView;
                                                    if (z2) {
                                                        i7 = 0;
                                                    } else {
                                                        i7 = 4;
                                                    }
                                                    view2.setVisibility(i7);
                                                    if (z5) {
                                                        dialogCell2.invalidate();
                                                    }
                                                }
                                                if (dialogCell3.drawScam != 0) {
                                                    if (!dialogCell3.useForceThreeLines) {
                                                        f49 = 15.0f;
                                                    }
                                                    int iDp9 = AndroidUtilities.dp(f49);
                                                    iDp9 = dialogCell3.useForceThreeLines ? iDp9 - AndroidUtilities.dp(9.0f) : iDp9 - AndroidUtilities.dp(9.0f);
                                                    if (dialogCell3.drawScam == 1) {
                                                        scamDrawable = Theme.dialogs_scamDrawable;
                                                    } else {
                                                        scamDrawable = Theme.dialogs_fakeDrawable;
                                                    }
                                                    BaseCell.setDrawableBounds((Drawable) scamDrawable, dialogCell3.nameMuteLeft, iDp9);
                                                    if (dialogCell3.drawScam == 1) {
                                                        scamDrawable2 = Theme.dialogs_scamDrawable;
                                                    } else {
                                                        scamDrawable2 = Theme.dialogs_fakeDrawable;
                                                    }
                                                    scamDrawable2.draw(canvas3);
                                                }
                                            }
                                            z2 = false;
                                            if (dialogCell3.drawReorder) {
                                                if (!LocaleController.isRTL) {
                                                    Paint paintReorderGradient3 = dialogCell3.getPaintReorderGradient();
                                                    paintReorderGradient3.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                    canvas3.save();
                                                    canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(24.0f), dialogCell3.pinTop);
                                                    canvas.drawRect(0.0f, 0.0f, dialogCell3.getMeasuredWidth() - (dialogCell3.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient3);
                                                    canvas3 = canvas;
                                                    canvas3.restore();
                                                }
                                                Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                                                Theme.dialogs_reorderDrawable.draw(canvas3);
                                            } else {
                                                if (!LocaleController.isRTL) {
                                                    Paint paintReorderGradient4 = dialogCell3.getPaintReorderGradient();
                                                    paintReorderGradient4.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                    canvas3.save();
                                                    canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(24.0f), dialogCell3.pinTop);
                                                    canvas.drawRect(0.0f, 0.0f, dialogCell3.getMeasuredWidth() - (dialogCell3.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient4);
                                                    canvas3 = canvas;
                                                    canvas3.restore();
                                                }
                                                Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                                                Theme.dialogs_reorderDrawable.draw(canvas3);
                                            }
                                            floatValue = dialogCell3.animatorPollVotesMentionVisible.getFloatValue();
                                            if (dialogCell3.drawError) {
                                                if (dialogCell3.drawCount) {
                                                }
                                                zIsCounterMuted = dialogCell3.isCounterMuted();
                                                canvas3 = canvas;
                                                drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                                                dialogCell = this;
                                                if (dialogCell.drawMention) {
                                                    Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    if (dialogCell.mentionLayout != null) {
                                                        int i311 = dialogCell.mentionLeft;
                                                        dialogCell.rect.set(i311, dialogCell.countTop, AndroidUtilities.dp(12.666f) + i311 + dialogCell.mentionWidth, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                        if (zIsCounterMuted) {
                                                            paint = Theme.dialogs_countPaint;
                                                        } else {
                                                            paint = Theme.dialogs_countPaint;
                                                        }
                                                        RectF rectF8 = dialogCell.rect;
                                                        canvas3.drawRoundRect(rectF8, rectF8.height() / 2.0f, dialogCell.rect.height() / 2.0f, paint);
                                                        Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                        canvas3.save();
                                                        canvas3.translate(AndroidUtilities.dp(6.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(4.0f) + dialogCell.countTop);
                                                        dialogCell.mentionLayout.draw(canvas3);
                                                        canvas3.restore();
                                                    } else {
                                                        Drawable drawable7 = Theme.dialogs_mentionDrawable;
                                                        drawable7.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                        DrawableUtils.setBounds(drawable7, AndroidUtilities.dp(10.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                        drawable7.draw(canvas3);
                                                    }
                                                }
                                                if (dialogCell.drawReactionMention) {
                                                    int i312 = dialogCell.reactionMentionLeft;
                                                    dialogCell.rect.set(i312, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i312, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                    f39 = dialogCell.reactionsMentionsChangeProgress;
                                                    if (f39 == 1.0f) {
                                                        f39 = 1.0f;
                                                    } else if (!dialogCell.drawReactionMention) {
                                                        f39 = 1.0f - f39;
                                                    }
                                                    if (zIsCounterMuted) {
                                                        drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                    } else {
                                                        drawable = Theme.dialogs_reactionsMentionDrawable;
                                                    }
                                                    drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i312, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                    DrawableUtils.drawWithScale(canvas3, drawable, f39);
                                                } else {
                                                    int i313 = dialogCell.reactionMentionLeft;
                                                    dialogCell.rect.set(i313, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i313, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                    f39 = dialogCell.reactionsMentionsChangeProgress;
                                                    if (f39 == 1.0f) {
                                                        f39 = 1.0f;
                                                    } else if (!dialogCell.drawReactionMention) {
                                                        f39 = 1.0f - f39;
                                                    }
                                                    if (zIsCounterMuted) {
                                                        drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                    } else {
                                                        drawable = Theme.dialogs_reactionsMentionDrawable;
                                                    }
                                                    drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i313, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                    DrawableUtils.drawWithScale(canvas3, drawable, f39);
                                                }
                                                if (dialogCell.drawPollVotesMention) {
                                                    int i314 = dialogCell.pollVotesMentionLeft;
                                                    dialogCell.rect.set(i314, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i314, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                    if (zIsCounterMuted) {
                                                        drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                    } else {
                                                        drawable2 = Theme.dialogs_pollMentionDrawable;
                                                    }
                                                    drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i314, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                    DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                                                } else {
                                                    int i315 = dialogCell.pollVotesMentionLeft;
                                                    dialogCell.rect.set(i315, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i315, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                    if (zIsCounterMuted) {
                                                        drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                    } else {
                                                        drawable2 = Theme.dialogs_pollMentionDrawable;
                                                    }
                                                    drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i315, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                                    DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                                                }
                                                if (dialogCell.thumbsCount > 0) {
                                                    f40 = dialogCell.updateHelper.typingProgres;
                                                    if (f40 != 1.0f) {
                                                        if (f40 > 0.0f) {
                                                            canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f40) * 255.0f), 31);
                                                            canvas3 = canvas;
                                                            if (dialogCell.updateHelper.typingOutToTop) {
                                                                fDp = -AndroidUtilities.dp(14.0f);
                                                                f41 = dialogCell.updateHelper.typingProgres;
                                                            } else {
                                                                fDp = AndroidUtilities.dp(14.0f);
                                                                f41 = dialogCell.updateHelper.typingProgres;
                                                            }
                                                            canvas3.translate(0.0f, fDp * f41);
                                                        }
                                                        i11 = 0;
                                                        while (i11 < dialogCell.thumbsCount) {
                                                            if (dialogCell.thumbImageSeen[i11]) {
                                                                if (dialogCell.thumbBackgroundPaint == null) {
                                                                    Paint paint10 = new Paint(1);
                                                                    dialogCell.thumbBackgroundPaint = paint10;
                                                                    paint10.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                    dialogCell.thumbBackgroundPaint.setColor(0);
                                                                }
                                                                rectF = AndroidUtilities.rectTmp;
                                                                rectF.set(dialogCell.thumbImage[i11].getImageX(), dialogCell.thumbImage[i11].getImageY(), dialogCell.thumbImage[i11].getImageX2(), dialogCell.thumbImage[i11].getImageY2());
                                                                dialogCell.thumbImage[i11].draw(canvas3);
                                                                if (!dialogCell.drawSpoiler[i11]) {
                                                                    path = dialogCell.thumbPath;
                                                                    if (path == null) {
                                                                        dialogCell.thumbPath = new Path();
                                                                    } else {
                                                                        path.rewind();
                                                                    }
                                                                    dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i11].getRoundRadius()[0], dialogCell.thumbImage[i11].getRoundRadius()[1], Path.Direction.CW);
                                                                    canvas3.save();
                                                                    canvas3.clipPath(dialogCell.thumbPath);
                                                                    if (dialogCell.thumbSpoiler == null) {
                                                                        dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                    }
                                                                    dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                                                    dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i11].getImageX(), (int) dialogCell.thumbImage[i11].getImageY(), (int) dialogCell.thumbImage[i11].getImageX2(), (int) dialogCell.thumbImage[i11].getImageY2());
                                                                    dialogCell.thumbSpoiler.draw(canvas3);
                                                                    dialogCell.invalidate();
                                                                    canvas3.restore();
                                                                }
                                                                if (dialogCell.drawPlay[i11]) {
                                                                    BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i11].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i6)), (int) (dialogCell.thumbImage[i11].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i6)));
                                                                    Theme.dialogs_playDrawable.draw(canvas3);
                                                                }
                                                            }
                                                            i11++;
                                                            i9 = -1;
                                                        }
                                                        i10 = -1;
                                                        if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                                            canvas3.restore();
                                                        }
                                                    } else {
                                                        i10 = -1;
                                                    }
                                                } else {
                                                    i10 = -1;
                                                }
                                                dialogCellTags = dialogCell.tags;
                                                if (dialogCellTags != null) {
                                                    canvas3.save();
                                                    canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                    dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                    canvas3.restore();
                                                }
                                                if (i8 != i10) {
                                                    canvas3.restoreToCount(i8);
                                                }
                                                if (dialogCell.animatingArchiveAvatar) {
                                                    canvas3.save();
                                                    float interpolation5 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                    canvas3.scale(interpolation5, interpolation5, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
                                                }
                                                if (dialogCell.drawAvatar) {
                                                    if (dialogCell.drawMonoforumAvatar) {
                                                        if (dialogCell.bubbleClip == null) {
                                                            dialogCell.bubbleClip = new PhotoBubbleClip();
                                                        }
                                                        dialogCell.bubbleClip.setBounds((int) dialogCell.storyParams.originalAvatarRect.centerX(), (int) dialogCell.storyParams.originalAvatarRect.centerY(), (int) (dialogCell.storyParams.originalAvatarRect.width() / 2.0f));
                                                        canvas3.save();
                                                        canvas3.clipPath(dialogCell.bubbleClip);
                                                        dialogCell.avatarImage.setImageCoords(dialogCell.storyParams.originalAvatarRect);
                                                        dialogCell.avatarImage.draw(canvas3);
                                                        canvas3.restore();
                                                    } else if (dialogCell.drawCommunityAvatar) {
                                                        DrawableUtils.setBounds(dialogCell.avatarImage, AndroidUtilities.dpf2(1.0f) + dialogCell.storyParams.originalAvatarRect.centerX(), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                                                        DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY(), AndroidUtilities.dp(48.0f));
                                                        dialogCell.avatarImage.draw(canvas3);
                                                    } else {
                                                        avatarStoryParams = dialogCell.storyParams;
                                                        z6 = dialogCell.isShareToStoryCell;
                                                        if (z6) {
                                                            z7 = true;
                                                        } else {
                                                            z7 = true;
                                                        }
                                                        avatarStoryParams.drawHiddenStoriesAsSegments = z7;
                                                        int i43 = avatarStoryParams.forceState;
                                                        if (z6) {
                                                            avatarStoryParams.forceState = 1;
                                                        }
                                                        StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                                                        if (dialogCell.storyParams.drawnLive) {
                                                            dialogCell.checkTtl();
                                                        }
                                                        dialogCell.storyParams.forceState = i43;
                                                    }
                                                    if (!dialogCell.insideCommunityList) {
                                                        float fCenterX3 = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                        float fCenterY3 = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                        if (dialogCell.communityArrowDrawable == null) {
                                                            dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                        }
                                                        DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX3, fCenterY3, i5);
                                                        canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                                                        dialogCell.communityArrowDrawable.draw(canvas3);
                                                    }
                                                }
                                                if (dialogCell.animatingArchiveAvatar) {
                                                    canvas3.restore();
                                                }
                                                if (dialogCell.avatarImage.getVisible()) {
                                                    z3 = true;
                                                }
                                                if (dialogCell.rightFragmentOpenedProgress > 0.0f) {
                                                    dialogCell2 = dialogCell;
                                                } else {
                                                    dialogCell2 = dialogCell;
                                                }
                                                if (dialogCell2.collapseOffset != 0.0f) {
                                                    canvas3.restore();
                                                }
                                                if (dialogCell2.translationX != 0.0f) {
                                                    canvas3.restore();
                                                }
                                                if (dialogCell2.drawArchive) {
                                                    canvas3.save();
                                                    canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                                                    canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                                    dialogCell2.archivedChatsDrawable.draw(canvas3);
                                                    canvas3.restore();
                                                }
                                                if (dialogCell2.useSeparator) {
                                                    f15 = 0.0f;
                                                } else {
                                                    if (dialogCell2.fullSeparator) {
                                                        iDp = 0;
                                                    } else {
                                                        iDp = 0;
                                                    }
                                                    if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                                        alpha = Theme.dividerPaint.getAlpha();
                                                        f32 = dialogCell2.rightFragmentOpenedProgress;
                                                        if (f32 != 0.0f) {
                                                            Theme.dividerPaint.setAlpha((int) ((1.0f - f32) * alpha));
                                                        }
                                                        measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                        if (LocaleController.isRTL) {
                                                            canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                                                        } else {
                                                            canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                                                        }
                                                        f15 = 0.0f;
                                                        if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                            Theme.dividerPaint.setAlpha(alpha);
                                                        }
                                                    } else {
                                                        f15 = 0.0f;
                                                    }
                                                }
                                                if (dialogCell2.clipProgress == f15) {
                                                    canvas2 = canvas;
                                                } else if (Build.VERSION.SDK_INT != 24) {
                                                    canvas.restore();
                                                    canvas2 = canvas;
                                                } else {
                                                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell2.resourcesProvider));
                                                    canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                                                    canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                                                    canvas2 = canvas;
                                                }
                                                if (z18) {
                                                    float f64 = 1.0f - pullProgress;
                                                    int measuredHeight4 = (int) (dialogCell2.getMeasuredHeight() * f64);
                                                    color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                                                    if (dialogCell2.archiveFadeGradientDrawable == null) {
                                                        dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                                    }
                                                    if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                                                        dialogCell2.archiveFadeGradientDrawableColor = color3;
                                                        dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                                                    }
                                                    float fClamp4 = MathUtils.clamp((f64 - 0.05f) * 10.0f, 0.0f, 1.0f);
                                                    dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight4, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(f13) + measuredHeight4);
                                                    dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp4 * 255.0f));
                                                    dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                    canvas2.restore();
                                                }
                                                z4 = dialogCell2.drawReorder;
                                                if (z4) {
                                                    if (z4) {
                                                        f19 = dialogCell2.reorderIconProgress;
                                                        if (f19 < 1.0f) {
                                                            f20 = f19 + 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f20;
                                                            if (f20 > 1.0f) {
                                                                dialogCell2.reorderIconProgress = 1.0f;
                                                            }
                                                            f17 = 0.0f;
                                                        } else {
                                                            f17 = 0.0f;
                                                        }
                                                    } else {
                                                        f16 = dialogCell2.reorderIconProgress;
                                                        f17 = 0.0f;
                                                        if (f16 > 0.0f) {
                                                            f18 = f16 - 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f18;
                                                            if (f18 < 0.0f) {
                                                                dialogCell2.reorderIconProgress = 0.0f;
                                                            }
                                                        }
                                                    }
                                                    z3 = true;
                                                } else {
                                                    if (z4) {
                                                        f19 = dialogCell2.reorderIconProgress;
                                                        if (f19 < 1.0f) {
                                                            f20 = f19 + 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f20;
                                                            if (f20 > 1.0f) {
                                                                dialogCell2.reorderIconProgress = 1.0f;
                                                            }
                                                            f17 = 0.0f;
                                                        } else {
                                                            f17 = 0.0f;
                                                        }
                                                    } else {
                                                        f16 = dialogCell2.reorderIconProgress;
                                                        f17 = 0.0f;
                                                        if (f16 > 0.0f) {
                                                            f18 = f16 - 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f18;
                                                            if (f18 < 0.0f) {
                                                                dialogCell2.reorderIconProgress = 0.0f;
                                                            }
                                                        }
                                                    }
                                                    z3 = true;
                                                }
                                                if (dialogCell2.archiveHidden) {
                                                    f30 = dialogCell2.archiveBackgroundProgress;
                                                    if (f30 > f17) {
                                                        f31 = f30 - f3;
                                                        dialogCell2.archiveBackgroundProgress = f31;
                                                        if (f31 < f17) {
                                                            dialogCell2.archiveBackgroundProgress = f17;
                                                        }
                                                        if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                                                            dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                        }
                                                        z3 = true;
                                                    }
                                                } else {
                                                    f21 = dialogCell2.archiveBackgroundProgress;
                                                    if (f21 < 1.0f) {
                                                        f22 = f21 + f3;
                                                        dialogCell2.archiveBackgroundProgress = f22;
                                                        if (f22 > 1.0f) {
                                                            dialogCell2.archiveBackgroundProgress = 1.0f;
                                                        }
                                                        if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                                                            dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                        }
                                                        z3 = true;
                                                    }
                                                }
                                                if (dialogCell2.animatingArchiveAvatar) {
                                                    f29 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                    dialogCell2.animatingArchiveAvatarProgress = f29;
                                                    if (f29 >= 170.0f) {
                                                        dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                                                        dialogCell2.animatingArchiveAvatar = false;
                                                    }
                                                    z5 = true;
                                                } else {
                                                    z5 = z3;
                                                }
                                                if (dialogCell2.drawRevealBackground) {
                                                    f25 = dialogCell2.currentRevealBounceProgress;
                                                    if (f25 < 1.0f) {
                                                        f28 = f25 + 0.09411765f;
                                                        dialogCell2.currentRevealBounceProgress = f28;
                                                        if (f28 > 1.0f) {
                                                            dialogCell2.currentRevealBounceProgress = 1.0f;
                                                            z5 = true;
                                                        }
                                                    }
                                                    f26 = dialogCell2.currentRevealProgress;
                                                    if (f26 < 1.0f) {
                                                        f27 = f26 + f2;
                                                        dialogCell2.currentRevealProgress = f27;
                                                        if (f27 > 1.0f) {
                                                            dialogCell2.currentRevealProgress = 1.0f;
                                                        }
                                                        z5 = true;
                                                    }
                                                } else {
                                                    if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                        dialogCell2.currentRevealBounceProgress = 0.0f;
                                                        z5 = true;
                                                    }
                                                    f23 = dialogCell2.currentRevealProgress;
                                                    if (f23 > 0.0f) {
                                                        f24 = f23 - f2;
                                                        dialogCell2.currentRevealProgress = f24;
                                                        if (f24 < 0.0f) {
                                                            dialogCell2.currentRevealProgress = 0.0f;
                                                        }
                                                        z5 = true;
                                                    }
                                                }
                                                View view3 = dialogCell2.emojiStatusView;
                                                if (z2) {
                                                    i7 = 0;
                                                } else {
                                                    i7 = 4;
                                                }
                                                view3.setVisibility(i7);
                                                if (z5) {
                                                    dialogCell2.invalidate();
                                                }
                                            }
                                            Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                                            RectF rectF9 = dialogCell3.rect;
                                            int i44 = dialogCell3.errorLeft;
                                            rectF9.set(i44, dialogCell3.errorTop, AndroidUtilities.dp(20.666f) + i44, AndroidUtilities.dp(20.666f) + dialogCell3.errorTop);
                                            RectF rectF10 = dialogCell3.rect;
                                            float f65 = AndroidUtilities.density * 10.5f;
                                            canvas3.drawRoundRect(rectF10, f65, f65, Theme.dialogs_errorPaint);
                                            BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, AndroidUtilities.dp(4.5f) + dialogCell3.errorLeft, AndroidUtilities.dp(f14) + dialogCell3.errorTop);
                                            Theme.dialogs_errorDrawable.draw(canvas3);
                                            dialogCell = dialogCell3;
                                            if (dialogCell.thumbsCount > 0) {
                                                f40 = dialogCell.updateHelper.typingProgres;
                                                if (f40 != 1.0f) {
                                                    if (f40 > 0.0f) {
                                                        canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f40) * 255.0f), 31);
                                                        canvas3 = canvas;
                                                        if (dialogCell.updateHelper.typingOutToTop) {
                                                            fDp = -AndroidUtilities.dp(14.0f);
                                                            f41 = dialogCell.updateHelper.typingProgres;
                                                        } else {
                                                            fDp = AndroidUtilities.dp(14.0f);
                                                            f41 = dialogCell.updateHelper.typingProgres;
                                                        }
                                                        canvas3.translate(0.0f, fDp * f41);
                                                    }
                                                    i11 = 0;
                                                    while (i11 < dialogCell.thumbsCount) {
                                                        if (dialogCell.thumbImageSeen[i11]) {
                                                            if (dialogCell.thumbBackgroundPaint == null) {
                                                                Paint paint11 = new Paint(1);
                                                                dialogCell.thumbBackgroundPaint = paint11;
                                                                paint11.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                dialogCell.thumbBackgroundPaint.setColor(0);
                                                            }
                                                            rectF = AndroidUtilities.rectTmp;
                                                            rectF.set(dialogCell.thumbImage[i11].getImageX(), dialogCell.thumbImage[i11].getImageY(), dialogCell.thumbImage[i11].getImageX2(), dialogCell.thumbImage[i11].getImageY2());
                                                            dialogCell.thumbImage[i11].draw(canvas3);
                                                            if (!dialogCell.drawSpoiler[i11]) {
                                                                path = dialogCell.thumbPath;
                                                                if (path == null) {
                                                                    dialogCell.thumbPath = new Path();
                                                                } else {
                                                                    path.rewind();
                                                                }
                                                                dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i11].getRoundRadius()[0], dialogCell.thumbImage[i11].getRoundRadius()[1], Path.Direction.CW);
                                                                canvas3.save();
                                                                canvas3.clipPath(dialogCell.thumbPath);
                                                                if (dialogCell.thumbSpoiler == null) {
                                                                    dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                }
                                                                dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                                                dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i11].getImageX(), (int) dialogCell.thumbImage[i11].getImageY(), (int) dialogCell.thumbImage[i11].getImageX2(), (int) dialogCell.thumbImage[i11].getImageY2());
                                                                dialogCell.thumbSpoiler.draw(canvas3);
                                                                dialogCell.invalidate();
                                                                canvas3.restore();
                                                            }
                                                            if (dialogCell.drawPlay[i11]) {
                                                                BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i11].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i6)), (int) (dialogCell.thumbImage[i11].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i6)));
                                                                Theme.dialogs_playDrawable.draw(canvas3);
                                                            }
                                                        }
                                                        i11++;
                                                        i9 = -1;
                                                    }
                                                    i10 = -1;
                                                    if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                                        canvas3.restore();
                                                    }
                                                } else {
                                                    i10 = -1;
                                                }
                                            } else {
                                                i10 = -1;
                                            }
                                            dialogCellTags = dialogCell.tags;
                                            if (dialogCellTags != null) {
                                                canvas3.save();
                                                canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                canvas3.restore();
                                            }
                                            if (i8 != i10) {
                                                canvas3.restoreToCount(i8);
                                            }
                                            if (dialogCell.animatingArchiveAvatar) {
                                                canvas3.save();
                                                float interpolation6 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                canvas3.scale(interpolation6, interpolation6, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
                                            }
                                            if (dialogCell.drawAvatar) {
                                                if (dialogCell.drawMonoforumAvatar) {
                                                    if (dialogCell.bubbleClip == null) {
                                                        dialogCell.bubbleClip = new PhotoBubbleClip();
                                                    }
                                                    dialogCell.bubbleClip.setBounds((int) dialogCell.storyParams.originalAvatarRect.centerX(), (int) dialogCell.storyParams.originalAvatarRect.centerY(), (int) (dialogCell.storyParams.originalAvatarRect.width() / 2.0f));
                                                    canvas3.save();
                                                    canvas3.clipPath(dialogCell.bubbleClip);
                                                    dialogCell.avatarImage.setImageCoords(dialogCell.storyParams.originalAvatarRect);
                                                    dialogCell.avatarImage.draw(canvas3);
                                                    canvas3.restore();
                                                } else if (dialogCell.drawCommunityAvatar) {
                                                    DrawableUtils.setBounds(dialogCell.avatarImage, AndroidUtilities.dpf2(1.0f) + dialogCell.storyParams.originalAvatarRect.centerX(), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                                                    DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY(), AndroidUtilities.dp(48.0f));
                                                    dialogCell.avatarImage.draw(canvas3);
                                                } else {
                                                    avatarStoryParams = dialogCell.storyParams;
                                                    z6 = dialogCell.isShareToStoryCell;
                                                    if (z6) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = true;
                                                    }
                                                    avatarStoryParams.drawHiddenStoriesAsSegments = z7;
                                                    int i45 = avatarStoryParams.forceState;
                                                    if (z6) {
                                                        avatarStoryParams.forceState = 1;
                                                    }
                                                    StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                                                    if (dialogCell.storyParams.drawnLive) {
                                                        dialogCell.checkTtl();
                                                    }
                                                    dialogCell.storyParams.forceState = i45;
                                                }
                                                if (!dialogCell.insideCommunityList) {
                                                    float fCenterX4 = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                    float fCenterY4 = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                    if (dialogCell.communityArrowDrawable == null) {
                                                        dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                    }
                                                    DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX4, fCenterY4, i5);
                                                    canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                                                    dialogCell.communityArrowDrawable.draw(canvas3);
                                                }
                                            }
                                            if (dialogCell.animatingArchiveAvatar) {
                                                canvas3.restore();
                                            }
                                            if (dialogCell.avatarImage.getVisible()) {
                                                z3 = true;
                                            }
                                            if (dialogCell.rightFragmentOpenedProgress > 0.0f) {
                                                dialogCell2 = dialogCell;
                                            } else {
                                                dialogCell2 = dialogCell;
                                            }
                                            if (dialogCell2.collapseOffset != 0.0f) {
                                                canvas3.restore();
                                            }
                                            if (dialogCell2.translationX != 0.0f) {
                                                canvas3.restore();
                                            }
                                            if (dialogCell2.drawArchive) {
                                                canvas3.save();
                                                canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                                                canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                                dialogCell2.archivedChatsDrawable.draw(canvas3);
                                                canvas3.restore();
                                            }
                                            if (dialogCell2.useSeparator) {
                                                f15 = 0.0f;
                                            } else {
                                                if (dialogCell2.fullSeparator) {
                                                    iDp = 0;
                                                } else {
                                                    iDp = 0;
                                                }
                                                if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                                    alpha = Theme.dividerPaint.getAlpha();
                                                    f32 = dialogCell2.rightFragmentOpenedProgress;
                                                    if (f32 != 0.0f) {
                                                        Theme.dividerPaint.setAlpha((int) ((1.0f - f32) * alpha));
                                                    }
                                                    measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                    if (LocaleController.isRTL) {
                                                        canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                                                    } else {
                                                        canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                                                    }
                                                    f15 = 0.0f;
                                                    if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                        Theme.dividerPaint.setAlpha(alpha);
                                                    }
                                                } else {
                                                    f15 = 0.0f;
                                                }
                                            }
                                            if (dialogCell2.clipProgress == f15) {
                                                canvas2 = canvas;
                                            } else if (Build.VERSION.SDK_INT != 24) {
                                                canvas.restore();
                                                canvas2 = canvas;
                                            } else {
                                                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell2.resourcesProvider));
                                                canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                                                canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                                                canvas2 = canvas;
                                            }
                                            if (z18) {
                                                float f66 = 1.0f - pullProgress;
                                                int measuredHeight5 = (int) (dialogCell2.getMeasuredHeight() * f66);
                                                color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                                                if (dialogCell2.archiveFadeGradientDrawable == null) {
                                                    dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                                }
                                                if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                                                    dialogCell2.archiveFadeGradientDrawableColor = color3;
                                                    dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                                                }
                                                float fClamp5 = MathUtils.clamp((f66 - 0.05f) * 10.0f, 0.0f, 1.0f);
                                                dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight5, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(f13) + measuredHeight5);
                                                dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp5 * 255.0f));
                                                dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                canvas2.restore();
                                            }
                                            z4 = dialogCell2.drawReorder;
                                            if (z4) {
                                                if (z4) {
                                                    f19 = dialogCell2.reorderIconProgress;
                                                    if (f19 < 1.0f) {
                                                        f20 = f19 + 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f20;
                                                        if (f20 > 1.0f) {
                                                            dialogCell2.reorderIconProgress = 1.0f;
                                                        }
                                                        f17 = 0.0f;
                                                    } else {
                                                        f17 = 0.0f;
                                                    }
                                                } else {
                                                    f16 = dialogCell2.reorderIconProgress;
                                                    f17 = 0.0f;
                                                    if (f16 > 0.0f) {
                                                        f18 = f16 - 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f18;
                                                        if (f18 < 0.0f) {
                                                            dialogCell2.reorderIconProgress = 0.0f;
                                                        }
                                                    }
                                                }
                                                z3 = true;
                                            } else {
                                                if (z4) {
                                                    f19 = dialogCell2.reorderIconProgress;
                                                    if (f19 < 1.0f) {
                                                        f20 = f19 + 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f20;
                                                        if (f20 > 1.0f) {
                                                            dialogCell2.reorderIconProgress = 1.0f;
                                                        }
                                                        f17 = 0.0f;
                                                    } else {
                                                        f17 = 0.0f;
                                                    }
                                                } else {
                                                    f16 = dialogCell2.reorderIconProgress;
                                                    f17 = 0.0f;
                                                    if (f16 > 0.0f) {
                                                        f18 = f16 - 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f18;
                                                        if (f18 < 0.0f) {
                                                            dialogCell2.reorderIconProgress = 0.0f;
                                                        }
                                                    }
                                                }
                                                z3 = true;
                                            }
                                            if (dialogCell2.archiveHidden) {
                                                f30 = dialogCell2.archiveBackgroundProgress;
                                                if (f30 > f17) {
                                                    f31 = f30 - f3;
                                                    dialogCell2.archiveBackgroundProgress = f31;
                                                    if (f31 < f17) {
                                                        dialogCell2.archiveBackgroundProgress = f17;
                                                    }
                                                    if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                                                        dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                    }
                                                    z3 = true;
                                                }
                                            } else {
                                                f21 = dialogCell2.archiveBackgroundProgress;
                                                if (f21 < 1.0f) {
                                                    f22 = f21 + f3;
                                                    dialogCell2.archiveBackgroundProgress = f22;
                                                    if (f22 > 1.0f) {
                                                        dialogCell2.archiveBackgroundProgress = 1.0f;
                                                    }
                                                    if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                                                        dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                    }
                                                    z3 = true;
                                                }
                                            }
                                            if (dialogCell2.animatingArchiveAvatar) {
                                                f29 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                dialogCell2.animatingArchiveAvatarProgress = f29;
                                                if (f29 >= 170.0f) {
                                                    dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                                                    dialogCell2.animatingArchiveAvatar = false;
                                                }
                                                z5 = true;
                                            } else {
                                                z5 = z3;
                                            }
                                            if (dialogCell2.drawRevealBackground) {
                                                f25 = dialogCell2.currentRevealBounceProgress;
                                                if (f25 < 1.0f) {
                                                    f28 = f25 + 0.09411765f;
                                                    dialogCell2.currentRevealBounceProgress = f28;
                                                    if (f28 > 1.0f) {
                                                        dialogCell2.currentRevealBounceProgress = 1.0f;
                                                        z5 = true;
                                                    }
                                                }
                                                f26 = dialogCell2.currentRevealProgress;
                                                if (f26 < 1.0f) {
                                                    f27 = f26 + f2;
                                                    dialogCell2.currentRevealProgress = f27;
                                                    if (f27 > 1.0f) {
                                                        dialogCell2.currentRevealProgress = 1.0f;
                                                    }
                                                    z5 = true;
                                                }
                                            } else {
                                                if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                    dialogCell2.currentRevealBounceProgress = 0.0f;
                                                    z5 = true;
                                                }
                                                f23 = dialogCell2.currentRevealProgress;
                                                if (f23 > 0.0f) {
                                                    f24 = f23 - f2;
                                                    dialogCell2.currentRevealProgress = f24;
                                                    if (f24 < 0.0f) {
                                                        dialogCell2.currentRevealProgress = 0.0f;
                                                    }
                                                    z5 = true;
                                                }
                                            }
                                            View view4 = dialogCell2.emojiStatusView;
                                            if (z2) {
                                                i7 = 0;
                                            } else {
                                                i7 = 4;
                                            }
                                            view4.setVisibility(i7);
                                            if (z5) {
                                                dialogCell2.invalidate();
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        f45 = fDp4;
                                        i24 = alpha3;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    i24 = alpha3;
                                    f45 = fDp4;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                f45 = fDp4;
                                i24 = alpha3;
                            }
                        }
                        dialogCell4.messageLayout.getPaint().setAlpha(i24);
                        canvas3.restore();
                    } else {
                        f45 = fDp4;
                        f36 = 0.0f;
                    }
                    canvas3.save();
                    dialogUpdateHelper = dialogCell4.updateHelper;
                    if (dialogUpdateHelper.typingOutToTop) {
                        fM = DiffUtil.m(1.0f, dialogUpdateHelper.typingProgres, f45, dialogCell4.messageTop);
                    } else {
                        fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper.typingProgres, f45, dialogCell4.messageTop);
                    }
                    if (((dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                        if (dialogCell4.isForumCell()) {
                            f47 = 10.0f;
                        } else {
                            f47 = 11.0f;
                        }
                        fM -= AndroidUtilities.dp(f47);
                    }
                    canvas3.translate(dialogCell4.typingLeft, fM);
                    staticLayout2 = dialogCell4.typingLayout;
                    if (staticLayout2 != null && dialogCell4.updateHelper.typingProgres > f36) {
                        int alpha5 = staticLayout2.getPaint().getAlpha();
                        dialogCell4.typingLayout.getPaint().setAlpha((int) (alpha5 * dialogCell4.updateHelper.typingProgres));
                        dialogCell4.typingLayout.draw(canvas3);
                        dialogCell4.typingLayout.getPaint().setAlpha(alpha5);
                    }
                    canvas3.restore();
                    if (dialogCell4.typingLayout != null) {
                        i23 = dialogCell4.printingStringType;
                        if (i23 < 0) {
                            dialogUpdateHelper3 = dialogCell4.updateHelper;
                            if (dialogUpdateHelper3.typingProgres > f36 && dialogUpdateHelper3.lastKnownTypingType >= 0) {
                                if (i23 < 0) {
                                    i23 = dialogCell4.updateHelper.lastKnownTypingType;
                                }
                                chatStatusDrawable = Theme.getChatStatusDrawable(i23);
                                if (chatStatusDrawable != null) {
                                    canvas3.save();
                                    int color17 = Theme.getColor(Theme.key_chats_actionMessage);
                                    chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(color17, (int) (Color.alpha(color17) * dialogCell4.updateHelper.typingProgres)));
                                    dialogUpdateHelper2 = dialogCell4.updateHelper;
                                    if (dialogUpdateHelper2.typingOutToTop) {
                                        fM2 = DiffUtil.m(1.0f, dialogUpdateHelper2.typingProgres, f45, dialogCell4.messageTop);
                                    } else {
                                        fM2 = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper2.typingProgres, f45, dialogCell4.messageTop);
                                    }
                                    if (((dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                                        if (dialogCell4.isForumCell()) {
                                            f46 = 10.0f;
                                        } else {
                                            f46 = 11.0f;
                                        }
                                        fM2 -= AndroidUtilities.dp(f46);
                                    }
                                    if (i23 != 1 || i23 == 4) {
                                        float f511 = dialogCell4.statusDrawableLeft;
                                        if (i23 == 1) {
                                            iDp4 = AndroidUtilities.dp(1.0f);
                                        } else {
                                            iDp4 = 0;
                                        }
                                        canvas3.translate(f511, fM2 + iDp4);
                                    } else {
                                        canvas3.translate(dialogCell4.statusDrawableLeft, ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / f35) + fM2);
                                    }
                                    chatStatusDrawable.draw(canvas3);
                                    dialogCell4.invalidate();
                                    canvas3.restore();
                                }
                            }
                        } else {
                            if (i23 < 0) {
                                i23 = dialogCell4.updateHelper.lastKnownTypingType;
                            }
                            chatStatusDrawable = Theme.getChatStatusDrawable(i23);
                            if (chatStatusDrawable != null) {
                                canvas3.save();
                                int color18 = Theme.getColor(Theme.key_chats_actionMessage);
                                chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(color18, (int) (Color.alpha(color18) * dialogCell4.updateHelper.typingProgres)));
                                dialogUpdateHelper2 = dialogCell4.updateHelper;
                                if (dialogUpdateHelper2.typingOutToTop) {
                                    fM2 = DiffUtil.m(1.0f, dialogUpdateHelper2.typingProgres, f45, dialogCell4.messageTop);
                                } else {
                                    fM2 = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper2.typingProgres, f45, dialogCell4.messageTop);
                                }
                                if (dialogCell4.useForceThreeLines) {
                                    if (dialogCell4.isForumCell()) {
                                        f46 = 10.0f;
                                    } else {
                                        f46 = 11.0f;
                                    }
                                    fM2 -= AndroidUtilities.dp(f46);
                                } else {
                                    if (dialogCell4.isForumCell()) {
                                        f46 = 10.0f;
                                    } else {
                                        f46 = 11.0f;
                                    }
                                    fM2 -= AndroidUtilities.dp(f46);
                                }
                                if (i23 != 1) {
                                    float f512 = dialogCell4.statusDrawableLeft;
                                    if (i23 == 1) {
                                        iDp4 = AndroidUtilities.dp(1.0f);
                                    } else {
                                        iDp4 = 0;
                                    }
                                    canvas3.translate(f512, fM2 + iDp4);
                                } else {
                                    float f513 = dialogCell4.statusDrawableLeft;
                                    if (i23 == 1) {
                                        iDp4 = AndroidUtilities.dp(1.0f);
                                    } else {
                                        iDp4 = 0;
                                    }
                                    canvas3.translate(f513, fM2 + iDp4);
                                }
                                chatStatusDrawable.draw(canvas3);
                                dialogCell4.invalidate();
                                canvas3.restore();
                            }
                        }
                    }
                } else {
                    f36 = 0.0f;
                }
                if (dialogCell4.buttonLayout != null) {
                    canvas3.save();
                    if (dialogCell4.buttonBackgroundPaint == null) {
                        dialogCell4.buttonBackgroundPaint = new Paint(1);
                    }
                    if (dialogCell4.canvasButton == null) {
                        CanvasButton canvasButton3 = new CanvasButton(dialogCell4);
                        dialogCell4.canvasButton = canvasButton3;
                        final int i316 = 0;
                        canvasButton3.setDelegate(new Runnable(dialogCell4) {
                            public final DialogCell f$0;

                            {
                                this.f$0 = dialogCell4;
                            }

                            @Override
                            public final void run() {
                                switch (i316) {
                                    case 0:
                                        this.f$0.lambda$onDraw$2();
                                        break;
                                    default:
                                        this.f$0.lambda$onDraw$3();
                                        break;
                                }
                            }
                        });
                        final int i317 = 1;
                        dialogCell4.canvasButton.setLongPress(new Runnable(dialogCell4) {
                            public final DialogCell f$0;

                            {
                                this.f$0 = dialogCell4;
                            }

                            @Override
                            public final void run() {
                                switch (i317) {
                                    case 0:
                                        this.f$0.lambda$onDraw$2();
                                        break;
                                    default:
                                        this.f$0.lambda$onDraw$3();
                                        break;
                                }
                            }
                        });
                    }
                    if (dialogCell4.lastTopicMessageUnread && dialogCell4.topMessageTopicEndIndex != dialogCell4.topMessageTopicStartIndex && ((i20 = dialogCell4.dialogsType) == 0 || i20 == 7 || i20 == 8)) {
                        CanvasButton canvasButton4 = dialogCell4.canvasButton;
                        int color19 = dialogCell4.currentMessagePaint.getColor();
                        if (Theme.isCurrentThemeDark()) {
                            i21 = 36;
                        } else {
                            i21 = 26;
                        }
                        canvasButton4.setColor(ColorUtils.setAlphaComponent(color19, i21));
                        if (!dialogCell4.buttonCreated) {
                            dialogCell4.canvasButton.rewind();
                            i22 = dialogCell4.topMessageTopicEndIndex;
                            if (i22 != dialogCell4.topMessageTopicStartIndex && i22 > 0) {
                                float fDp8 = dialogCell4.messageTop;
                                if (((dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                                }
                                rectF2 = AndroidUtilities.rectTmp;
                                float primaryHorizontal2 = dialogCell4.messageLayout.getPrimaryHorizontal(0) + AndroidUtilities.dp(f35) + dialogCell4.messageLeft;
                                float f67 = dialogCell4.messageLeft;
                                StaticLayout staticLayout10 = dialogCell4.messageLayout;
                                rectF2.set(primaryHorizontal2, fDp8, (staticLayout10.getPrimaryHorizontal(Math.min(staticLayout10.getText().length(), dialogCell4.topMessageTopicEndIndex)) + f67) - AndroidUtilities.dp(3.0f), dialogCell4.buttonTop - AndroidUtilities.dp(4.0f));
                                rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                                if (rectF2.right > rectF2.left) {
                                    dialogCell4.canvasButton.addRect(rectF2);
                                }
                            }
                            float lineLeft2 = dialogCell4.buttonLayout.getLineLeft(0);
                            RectF rectF11 = AndroidUtilities.rectTmp;
                            rectF11.set(dialogCell4.buttonLeft + lineLeft2 + AndroidUtilities.dp(f35), AndroidUtilities.dp(f35) + dialogCell4.buttonTop, dialogCell4.buttonLayout.getLineWidth(0) + dialogCell4.buttonLeft + lineLeft2 + AndroidUtilities.dp(12.0f), dialogCell4.buttonLayout.getHeight() + dialogCell4.buttonTop);
                            rectF11.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                            dialogCell4.canvasButton.addRect(rectF11);
                        }
                        dialogCell4.canvasButton.draw(canvas3);
                        Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                        Drawable drawable8 = Theme.dialogs_forum_arrowDrawable;
                        RectF rectF12 = AndroidUtilities.rectTmp;
                        BaseCell.setDrawableBounds(drawable8, rectF12.right - AndroidUtilities.dp(18.0f), ImageReceiver$$ExternalSyntheticOutline0.m(rectF12.height(), Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight(), 2.0f, rectF12.top));
                        Theme.dialogs_forum_arrowDrawable.draw(canvas3);
                    }
                    canvas3.translate(dialogCell4.buttonLeft, dialogCell4.buttonTop);
                    if (dialogCell4.spoilers2.isEmpty()) {
                        canvas3.save();
                        SpoilerEffect.clipOutCanvas(canvas3, dialogCell4.spoilers2);
                        SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.buttonLayout);
                        StaticLayout staticLayout11 = dialogCell4.buttonLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout11, dialogCell4.animatedEmojiStack3, -0.075f, dialogCell4.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(3, staticLayout11.getPaint().getColor()));
                        canvas3.restore();
                        while (i19 < dialogCell4.spoilers2.size()) {
                            SpoilerEffect spoilerEffect3 = dialogCell4.spoilers2.get(i19);
                            spoilerEffect3.setColor(dialogCell4.buttonLayout.getPaint().getColor());
                            spoilerEffect3.draw(canvas3);
                        }
                    } else {
                        SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.buttonLayout);
                        StaticLayout staticLayout12 = dialogCell4.buttonLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout12, dialogCell4.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(3, staticLayout12.getPaint().getColor()));
                    }
                    canvas.restore();
                }
                if (dialogCell4.currentDialogFolderId == 0) {
                    boolean z25 = dialogCell4.drawClock;
                    if (dialogCell4.drawCheck1) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i318 = (z25 ? 1 : 0) + i12;
                    if (dialogCell4.drawCheck2) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    i14 = i318 + i13;
                    i15 = dialogCell4.lastStatusDrawableParams;
                    if (i15 >= 0 && i15 != i14 && !dialogCell4.statusDrawableAnimationInProgress) {
                        dialogCell4.createStatusDrawableAnimator(i15, i14);
                    }
                    z10 = dialogCell4.statusDrawableAnimationInProgress;
                    if (z10) {
                        i14 = dialogCell4.animateToStatusDrawableParams;
                    }
                    if ((i14 & 1) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i14 & 2) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((i14 & 4) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z10) {
                        i18 = dialogCell4.animateFromStatusDrawableParams;
                        if ((i18 & 1) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i18 & 2) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if ((i18 & 4) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (!z11 || z14 || !z16 || z15 || !z12 || z13 == 0) {
                            boolean z26 = z12;
                            boolean z27 = z15;
                            canvas3 = canvas;
                            dialogCell4.drawCheckStatus(canvas3, z14, z27, z16, false, 1.0f - dialogCell4.statusDrawableProgress);
                            dialogCell4.drawCheckStatus(canvas3, z11, z26, z13, false, dialogCell4.statusDrawableProgress);
                            dialogCell3 = this;
                        } else {
                            canvas3 = canvas;
                            dialogCell4.drawCheckStatus(canvas3, z11, z12, z13, true, dialogCell4.statusDrawableProgress);
                        }
                        boolean z28 = dialogCell3.drawClock;
                        if (dialogCell3.drawCheck1) {
                            i16 = 2;
                        } else {
                            i16 = 0;
                        }
                        int i319 = (z28 ? 1 : 0) + i16;
                        if (dialogCell3.drawCheck2) {
                            i17 = 4;
                        } else {
                            i17 = 0;
                        }
                        dialogCell3.lastStatusDrawableParams = i319 + i17;
                    } else {
                        dialogCell4 = this;
                        canvas3 = canvas;
                        dialogCell4.drawCheckStatus(canvas3, z11, z12, z13, false, 1.0f);
                    }
                    dialogCell3 = dialogCell4;
                    boolean z29 = dialogCell3.drawClock;
                    if (dialogCell3.drawCheck1) {
                        i16 = 2;
                    } else {
                        i16 = 0;
                    }
                    int i3110 = (z29 ? 1 : 0) + i16;
                    if (dialogCell3.drawCheck2) {
                        i17 = 4;
                    } else {
                        i17 = 0;
                    }
                    dialogCell3.lastStatusDrawableParams = i3110 + i17;
                } else {
                    canvas3 = canvas;
                    dialogCell3 = dialogCell4;
                }
                f37 = 12.5f;
                if (dialogCell3.drawBotVerified) {
                    if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        f44 = 12.5f;
                    } else {
                        f44 = 15.5f;
                    }
                    iDp3 = AndroidUtilities.dp(f44);
                    if (((dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    swapAnimatedEmojiDrawable = dialogCell3.botVerification;
                    if (swapAnimatedEmojiDrawable != null) {
                        swapAnimatedEmojiDrawable.setBounds(dialogCell3.nameLeft - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + iDp3, dialogCell3.nameLeft - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f) + iDp3);
                        dialogCell3.botVerification.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                        dialogCell3.botVerification.draw(canvas3);
                    }
                }
                if (dialogCell3.drawUnmute || dialogCell3.dialogMuted || dialogCell3.isHiddenInCommunity) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (dialogCell3.dialogsType != i6 || ((!z8 && dialogCell3.dialogMutedProgress <= f36) || dialogCell3.drawVerified || dialogCell3.drawScam != 0)) {
                    i5 = 17;
                } else {
                    if (z8) {
                        float f68 = dialogCell3.dialogMutedProgress;
                        if (f68 != 1.0f) {
                            float f69 = f68 + 0.10666667f;
                            dialogCell3.dialogMutedProgress = f69;
                            if (f69 > 1.0f) {
                                dialogCell3.dialogMutedProgress = 1.0f;
                            } else {
                                dialogCell3.invalidate();
                            }
                        } else if (!z8) {
                            f42 = dialogCell3.dialogMutedProgress;
                            if (f42 != f36) {
                                f43 = f42 - 0.10666667f;
                                dialogCell3.dialogMutedProgress = f43;
                                if (f43 < f36) {
                                    dialogCell3.dialogMutedProgress = 0.0f;
                                } else {
                                    dialogCell3.invalidate();
                                }
                            }
                        }
                    } else if (!z8) {
                        f42 = dialogCell3.dialogMutedProgress;
                        if (f42 != f36) {
                            f43 = f42 - 0.10666667f;
                            dialogCell3.dialogMutedProgress = f43;
                            if (f43 < f36) {
                                dialogCell3.dialogMutedProgress = 0.0f;
                            } else {
                                dialogCell3.invalidate();
                            }
                        }
                    }
                    float fDp9 = (dialogCell3.drawPremium ? dialogCell3.nameMutedIconLeft : dialogCell3.nameMuteLeft) - AndroidUtilities.dp((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                    float fDp10 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                    if (((!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                        fDp10 -= AndroidUtilities.dp(dialogCell3.isForumCell() ? 8.0f : 9.0f);
                    }
                    BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, fDp9, fDp10);
                    BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, fDp9, fDp10);
                    i5 = 17;
                    DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                    if (dialogCell3.dialogMutedProgress != 1.0f) {
                        canvas3.save();
                        float f70 = dialogCell3.dialogMutedProgress;
                        canvas3.scale(f70, f70, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
                        if (dialogCell3.isHiddenInCommunity) {
                            Theme.dialogs_hiddenDrawable.setAlpha((int) (dialogCell3.dialogMutedProgress * 255.0f));
                            Theme.dialogs_hiddenDrawable.draw(canvas3);
                            Theme.dialogs_hiddenDrawable.setAlpha(255);
                        } else if (dialogCell3.drawUnmute) {
                            Theme.dialogs_unmuteDrawable.setAlpha((int) (dialogCell3.dialogMutedProgress * 255.0f));
                            Theme.dialogs_unmuteDrawable.draw(canvas3);
                            Theme.dialogs_unmuteDrawable.setAlpha(255);
                        } else {
                            Theme.dialogs_muteDrawable.setAlpha((int) (dialogCell3.dialogMutedProgress * 255.0f));
                            Theme.dialogs_muteDrawable.draw(canvas3);
                            Theme.dialogs_muteDrawable.setAlpha(255);
                        }
                        canvas3.restore();
                    } else if (dialogCell3.isHiddenInCommunity) {
                        Theme.dialogs_hiddenDrawable.draw(canvas3);
                    } else if (dialogCell3.drawUnmute) {
                        Theme.dialogs_unmuteDrawable.draw(canvas3);
                    } else {
                        Theme.dialogs_muteDrawable.draw(canvas3);
                    }
                }
                if (dialogCell3.drawVerified) {
                    if (!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f48 = 16.5f;
                    }
                    float fDp11 = AndroidUtilities.dp(f48);
                    if (((dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp11);
                    BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp11);
                    Theme.dialogs_verifiedDrawable.draw(canvas3);
                    Theme.dialogs_verifiedCheckDrawable.draw(canvas3);
                } else if (dialogCell3.drawPremium) {
                    if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        f38 = 12.5f;
                    } else {
                        f38 = 15.5f;
                    }
                    iDp2 = AndroidUtilities.dp(f38);
                    if (((dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    if (dialogCell3.emojiStatus != null) {
                        dialogCell3.emojiStatusView.setTranslationX((f51 + dialogCell3.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                        dialogCell3.emojiStatusView.setTranslationY((f12 + iDp2) - AndroidUtilities.dp(4.0f));
                        if (dialogCell3.rightFragmentOpenedProgress > 0.0f) {
                            dialogCell3.emojiStatus.setBounds(dialogCell3.nameMuteLeft - AndroidUtilities.dp(2.0f), iDp2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(20.0f) + dialogCell3.nameMuteLeft, AndroidUtilities.dp(f4) + (iDp2 - AndroidUtilities.dp(4.0f)));
                            dialogCell3.emojiStatus.draw(canvas3);
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        dialogCell3.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                        z2 = z9;
                    } else {
                        Drawable drawable9 = PremiumGradient.getInstance().premiumStarDrawableMini;
                        int iDp10 = dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f);
                        if (!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f37 = 15.5f;
                        }
                        BaseCell.setDrawableBounds(drawable9, iDp10, AndroidUtilities.dp(f37));
                        drawable9.draw(canvas3);
                    }
                    if (dialogCell3.drawReorder || dialogCell3.reorderIconProgress != 0.0f) {
                        if (!LocaleController.isRTL) {
                            Paint paintReorderGradient5 = dialogCell3.getPaintReorderGradient();
                            paintReorderGradient5.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                            canvas3.save();
                            canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(24.0f), dialogCell3.pinTop);
                            canvas.drawRect(0.0f, 0.0f, dialogCell3.getMeasuredWidth() - (dialogCell3.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient5);
                            canvas3 = canvas;
                            canvas3.restore();
                        }
                        Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                        Theme.dialogs_reorderDrawable.draw(canvas3);
                    }
                    floatValue = dialogCell3.animatorPollVotesMentionVisible.getFloatValue();
                    if (dialogCell3.drawError) {
                        Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                        RectF rectF13 = dialogCell3.rect;
                        int i46 = dialogCell3.errorLeft;
                        rectF13.set(i46, dialogCell3.errorTop, AndroidUtilities.dp(20.666f) + i46, AndroidUtilities.dp(20.666f) + dialogCell3.errorTop);
                        RectF rectF14 = dialogCell3.rect;
                        float f610 = AndroidUtilities.density * 10.5f;
                        canvas3.drawRoundRect(rectF14, f610, f610, Theme.dialogs_errorPaint);
                        BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, AndroidUtilities.dp(4.5f) + dialogCell3.errorLeft, AndroidUtilities.dp(f14) + dialogCell3.errorTop);
                        Theme.dialogs_errorDrawable.draw(canvas3);
                    } else {
                        if (((!dialogCell3.drawCount || dialogCell3.drawMention) && dialogCell3.drawCount2) || dialogCell3.countChangeProgress != 1.0f || dialogCell3.drawReactionMention || dialogCell3.reactionsMentionsChangeProgress != 1.0f || dialogCell3.drawPollVotesMention || floatValue > 0.0f) {
                            zIsCounterMuted = dialogCell3.isCounterMuted();
                            canvas3 = canvas;
                            drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                            dialogCell = this;
                            if (dialogCell.drawMention) {
                                Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                if (dialogCell.mentionLayout != null) {
                                    int i3111 = dialogCell.mentionLeft;
                                    dialogCell.rect.set(i3111, dialogCell.countTop, AndroidUtilities.dp(12.666f) + i3111 + dialogCell.mentionWidth, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                    if (zIsCounterMuted || dialogCell.folderId == 0) {
                                        paint = Theme.dialogs_countPaint;
                                    } else {
                                        paint = Theme.dialogs_countGrayPaint;
                                    }
                                    RectF rectF15 = dialogCell.rect;
                                    canvas3.drawRoundRect(rectF15, rectF15.height() / 2.0f, dialogCell.rect.height() / 2.0f, paint);
                                    Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                    canvas3.save();
                                    canvas3.translate(AndroidUtilities.dp(6.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(4.0f) + dialogCell.countTop);
                                    dialogCell.mentionLayout.draw(canvas3);
                                    canvas3.restore();
                                } else {
                                    Drawable drawable10 = Theme.dialogs_mentionDrawable;
                                    drawable10.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                    DrawableUtils.setBounds(drawable10, AndroidUtilities.dp(10.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                    drawable10.draw(canvas3);
                                }
                            }
                            if (dialogCell.drawReactionMention || dialogCell.reactionsMentionsChangeProgress != 1.0f) {
                                int i3112 = dialogCell.reactionMentionLeft;
                                dialogCell.rect.set(i3112, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i3112, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                f39 = dialogCell.reactionsMentionsChangeProgress;
                                if (f39 == 1.0f) {
                                    f39 = 1.0f;
                                } else if (!dialogCell.drawReactionMention) {
                                    f39 = 1.0f - f39;
                                }
                                if (zIsCounterMuted) {
                                    drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                } else {
                                    drawable = Theme.dialogs_reactionsMentionDrawable;
                                }
                                drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i3112, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                DrawableUtils.drawWithScale(canvas3, drawable, f39);
                            }
                            if ((dialogCell.drawPollVotesMention || floatValue > 0.0f) && floatValue != 0.0f) {
                                int i3113 = dialogCell.pollVotesMentionLeft;
                                dialogCell.rect.set(i3113, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i3113, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                if (zIsCounterMuted) {
                                    drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                } else {
                                    drawable2 = Theme.dialogs_pollMentionDrawable;
                                }
                                drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i3113, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                                DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                            }
                        } else {
                            if (dialogCell3.openBot) {
                                canvas3.save();
                                float scale = dialogCell3.openButtonBounce.getScale(0.05f);
                                canvas3.scale(scale, scale, dialogCell3.openButtonRect.centerX(), dialogCell3.openButtonRect.centerY());
                                dialogCell3.openButtonBackgroundPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, dialogCell3.resourcesProvider));
                                RectF rectF16 = dialogCell3.openButtonRect;
                                canvas3.drawRoundRect(rectF16, rectF16.height() / 2.0f, dialogCell3.openButtonRect.height() / 2.0f, dialogCell3.openButtonBackgroundPaint);
                                Text text = dialogCell3.openButtonText;
                                if (text != null) {
                                    text.draw(canvas3, dialogCell3.openButtonRect.left + AndroidUtilities.dp(13.0f), dialogCell3.openButtonRect.centerY(), Theme.getColor(Theme.key_featuredStickers_buttonText, dialogCell3.resourcesProvider), 1.0f);
                                }
                                canvas.restore();
                            }
                            canvas3 = canvas;
                        }
                        if (dialogCell.thumbsCount > 0) {
                            f40 = dialogCell.updateHelper.typingProgres;
                            if (f40 != 1.0f) {
                                if (f40 > 0.0f) {
                                    canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f40) * 255.0f), 31);
                                    canvas3 = canvas;
                                    if (dialogCell.updateHelper.typingOutToTop) {
                                        fDp = -AndroidUtilities.dp(14.0f);
                                        f41 = dialogCell.updateHelper.typingProgres;
                                    } else {
                                        fDp = AndroidUtilities.dp(14.0f);
                                        f41 = dialogCell.updateHelper.typingProgres;
                                    }
                                    canvas3.translate(0.0f, fDp * f41);
                                }
                                i11 = 0;
                                while (i11 < dialogCell.thumbsCount) {
                                    if (dialogCell.thumbImageSeen[i11]) {
                                        if (dialogCell.thumbBackgroundPaint == null) {
                                            Paint paint12 = new Paint(1);
                                            dialogCell.thumbBackgroundPaint = paint12;
                                            paint12.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                            dialogCell.thumbBackgroundPaint.setColor(0);
                                        }
                                        rectF = AndroidUtilities.rectTmp;
                                        rectF.set(dialogCell.thumbImage[i11].getImageX(), dialogCell.thumbImage[i11].getImageY(), dialogCell.thumbImage[i11].getImageX2(), dialogCell.thumbImage[i11].getImageY2());
                                        dialogCell.thumbImage[i11].draw(canvas3);
                                        if (!dialogCell.drawSpoiler[i11]) {
                                            path = dialogCell.thumbPath;
                                            if (path == null) {
                                                dialogCell.thumbPath = new Path();
                                            } else {
                                                path.rewind();
                                            }
                                            dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i11].getRoundRadius()[0], dialogCell.thumbImage[i11].getRoundRadius()[1], Path.Direction.CW);
                                            canvas3.save();
                                            canvas3.clipPath(dialogCell.thumbPath);
                                            if (dialogCell.thumbSpoiler == null) {
                                                dialogCell.thumbSpoiler = new SpoilerEffect();
                                            }
                                            dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                            dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i11].getImageX(), (int) dialogCell.thumbImage[i11].getImageY(), (int) dialogCell.thumbImage[i11].getImageX2(), (int) dialogCell.thumbImage[i11].getImageY2());
                                            dialogCell.thumbSpoiler.draw(canvas3);
                                            dialogCell.invalidate();
                                            canvas3.restore();
                                        }
                                        if (dialogCell.drawPlay[i11]) {
                                            BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i11].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i6)), (int) (dialogCell.thumbImage[i11].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i6)));
                                            Theme.dialogs_playDrawable.draw(canvas3);
                                        }
                                    }
                                    i11++;
                                    i9 = -1;
                                }
                                i10 = -1;
                                if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                    canvas3.restore();
                                }
                            } else {
                                i10 = -1;
                            }
                        } else {
                            i10 = -1;
                        }
                        dialogCellTags = dialogCell.tags;
                        if (dialogCellTags != null && !dialogCellTags.isEmpty()) {
                            canvas3.save();
                            canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                            dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                            canvas3.restore();
                        }
                        if (i8 != i10) {
                            canvas3.restoreToCount(i8);
                        }
                    }
                    dialogCell = dialogCell3;
                    if (dialogCell.thumbsCount > 0) {
                        f40 = dialogCell.updateHelper.typingProgres;
                        if (f40 != 1.0f) {
                            if (f40 > 0.0f) {
                                canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f40) * 255.0f), 31);
                                canvas3 = canvas;
                                if (dialogCell.updateHelper.typingOutToTop) {
                                    fDp = -AndroidUtilities.dp(14.0f);
                                    f41 = dialogCell.updateHelper.typingProgres;
                                } else {
                                    fDp = AndroidUtilities.dp(14.0f);
                                    f41 = dialogCell.updateHelper.typingProgres;
                                }
                                canvas3.translate(0.0f, fDp * f41);
                            }
                            i11 = 0;
                            while (i11 < dialogCell.thumbsCount) {
                                if (dialogCell.thumbImageSeen[i11]) {
                                    if (dialogCell.thumbBackgroundPaint == null) {
                                        Paint paint13 = new Paint(1);
                                        dialogCell.thumbBackgroundPaint = paint13;
                                        paint13.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                        dialogCell.thumbBackgroundPaint.setColor(0);
                                    }
                                    rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dialogCell.thumbImage[i11].getImageX(), dialogCell.thumbImage[i11].getImageY(), dialogCell.thumbImage[i11].getImageX2(), dialogCell.thumbImage[i11].getImageY2());
                                    dialogCell.thumbImage[i11].draw(canvas3);
                                    if (!dialogCell.drawSpoiler[i11]) {
                                        path = dialogCell.thumbPath;
                                        if (path == null) {
                                            dialogCell.thumbPath = new Path();
                                        } else {
                                            path.rewind();
                                        }
                                        dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i11].getRoundRadius()[0], dialogCell.thumbImage[i11].getRoundRadius()[1], Path.Direction.CW);
                                        canvas3.save();
                                        canvas3.clipPath(dialogCell.thumbPath);
                                        if (dialogCell.thumbSpoiler == null) {
                                            dialogCell.thumbSpoiler = new SpoilerEffect();
                                        }
                                        dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                        dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i11].getImageX(), (int) dialogCell.thumbImage[i11].getImageY(), (int) dialogCell.thumbImage[i11].getImageX2(), (int) dialogCell.thumbImage[i11].getImageY2());
                                        dialogCell.thumbSpoiler.draw(canvas3);
                                        dialogCell.invalidate();
                                        canvas3.restore();
                                    }
                                    if (dialogCell.drawPlay[i11]) {
                                        BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i11].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i6)), (int) (dialogCell.thumbImage[i11].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i6)));
                                        Theme.dialogs_playDrawable.draw(canvas3);
                                    }
                                }
                                i11++;
                                i9 = -1;
                            }
                            i10 = -1;
                            if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                canvas3.restore();
                            }
                        } else {
                            i10 = -1;
                        }
                    } else {
                        i10 = -1;
                    }
                    dialogCellTags = dialogCell.tags;
                    if (dialogCellTags != null) {
                        canvas3.save();
                        canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                        dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                        canvas3.restore();
                    }
                    if (i8 != i10) {
                        canvas3.restoreToCount(i8);
                    }
                } else if (dialogCell3.drawScam != 0) {
                    if (!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f49 = 15.0f;
                    }
                    int iDp11 = AndroidUtilities.dp(f49);
                    if (((dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    if (dialogCell3.drawScam == 1) {
                        scamDrawable = Theme.dialogs_scamDrawable;
                    } else {
                        scamDrawable = Theme.dialogs_fakeDrawable;
                    }
                    BaseCell.setDrawableBounds((Drawable) scamDrawable, dialogCell3.nameMuteLeft, iDp11);
                    if (dialogCell3.drawScam == 1) {
                        scamDrawable2 = Theme.dialogs_scamDrawable;
                    } else {
                        scamDrawable2 = Theme.dialogs_fakeDrawable;
                    }
                    scamDrawable2.draw(canvas3);
                }
                z2 = false;
                if (dialogCell3.drawReorder) {
                    if (!LocaleController.isRTL) {
                        Paint paintReorderGradient6 = dialogCell3.getPaintReorderGradient();
                        paintReorderGradient6.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                        canvas3.save();
                        canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(24.0f), dialogCell3.pinTop);
                        canvas.drawRect(0.0f, 0.0f, dialogCell3.getMeasuredWidth() - (dialogCell3.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient6);
                        canvas3 = canvas;
                        canvas3.restore();
                    }
                    Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                    Theme.dialogs_reorderDrawable.draw(canvas3);
                } else {
                    if (!LocaleController.isRTL) {
                        Paint paintReorderGradient7 = dialogCell3.getPaintReorderGradient();
                        paintReorderGradient7.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                        canvas3.save();
                        canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(24.0f), dialogCell3.pinTop);
                        canvas.drawRect(0.0f, 0.0f, dialogCell3.getMeasuredWidth() - (dialogCell3.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient7);
                        canvas3 = canvas;
                        canvas3.restore();
                    }
                    Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                    Theme.dialogs_reorderDrawable.draw(canvas3);
                }
                floatValue = dialogCell3.animatorPollVotesMentionVisible.getFloatValue();
                if (dialogCell3.drawError) {
                    Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                    RectF rectF17 = dialogCell3.rect;
                    int i47 = dialogCell3.errorLeft;
                    rectF17.set(i47, dialogCell3.errorTop, AndroidUtilities.dp(20.666f) + i47, AndroidUtilities.dp(20.666f) + dialogCell3.errorTop);
                    RectF rectF18 = dialogCell3.rect;
                    float f611 = AndroidUtilities.density * 10.5f;
                    canvas3.drawRoundRect(rectF18, f611, f611, Theme.dialogs_errorPaint);
                    BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, AndroidUtilities.dp(4.5f) + dialogCell3.errorLeft, AndroidUtilities.dp(f14) + dialogCell3.errorTop);
                    Theme.dialogs_errorDrawable.draw(canvas3);
                } else {
                    if (dialogCell3.drawCount) {
                    }
                    zIsCounterMuted = dialogCell3.isCounterMuted();
                    canvas3 = canvas;
                    drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                    dialogCell = this;
                    if (dialogCell.drawMention) {
                        Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        if (dialogCell.mentionLayout != null) {
                            int i3114 = dialogCell.mentionLeft;
                            dialogCell.rect.set(i3114, dialogCell.countTop, AndroidUtilities.dp(12.666f) + i3114 + dialogCell.mentionWidth, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                            if (zIsCounterMuted) {
                                paint = Theme.dialogs_countPaint;
                            } else {
                                paint = Theme.dialogs_countPaint;
                            }
                            RectF rectF19 = dialogCell.rect;
                            canvas3.drawRoundRect(rectF19, rectF19.height() / 2.0f, dialogCell.rect.height() / 2.0f, paint);
                            Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                            canvas3.save();
                            canvas3.translate(AndroidUtilities.dp(6.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(4.0f) + dialogCell.countTop);
                            dialogCell.mentionLayout.draw(canvas3);
                            canvas3.restore();
                        } else {
                            Drawable drawable11 = Theme.dialogs_mentionDrawable;
                            drawable11.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                            DrawableUtils.setBounds(drawable11, AndroidUtilities.dp(10.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                            drawable11.draw(canvas3);
                        }
                    }
                    if (dialogCell.drawReactionMention) {
                        int i3115 = dialogCell.reactionMentionLeft;
                        dialogCell.rect.set(i3115, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i3115, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                        f39 = dialogCell.reactionsMentionsChangeProgress;
                        if (f39 == 1.0f) {
                            f39 = 1.0f;
                        } else if (!dialogCell.drawReactionMention) {
                            f39 = 1.0f - f39;
                        }
                        if (zIsCounterMuted) {
                            drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                        } else {
                            drawable = Theme.dialogs_reactionsMentionDrawable;
                        }
                        drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i3115, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                        DrawableUtils.drawWithScale(canvas3, drawable, f39);
                    } else {
                        int i3116 = dialogCell.reactionMentionLeft;
                        dialogCell.rect.set(i3116, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i3116, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                        f39 = dialogCell.reactionsMentionsChangeProgress;
                        if (f39 == 1.0f) {
                            f39 = 1.0f;
                        } else if (!dialogCell.drawReactionMention) {
                            f39 = 1.0f - f39;
                        }
                        if (zIsCounterMuted) {
                            drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                        } else {
                            drawable = Theme.dialogs_reactionsMentionDrawable;
                        }
                        drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i3116, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                        DrawableUtils.drawWithScale(canvas3, drawable, f39);
                    }
                    if (dialogCell.drawPollVotesMention) {
                        int i3117 = dialogCell.pollVotesMentionLeft;
                        dialogCell.rect.set(i3117, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i3117, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                        if (zIsCounterMuted) {
                            drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                        } else {
                            drawable2 = Theme.dialogs_pollMentionDrawable;
                        }
                        drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i3117, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                        DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                    } else {
                        int i3118 = dialogCell.pollVotesMentionLeft;
                        dialogCell.rect.set(i3118, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i3118, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                        if (zIsCounterMuted) {
                            drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                        } else {
                            drawable2 = Theme.dialogs_pollMentionDrawable;
                        }
                        drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i3118, AndroidUtilities.dp(10.333f) + dialogCell.countTop, i5);
                        DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                    }
                    if (dialogCell.thumbsCount > 0) {
                        f40 = dialogCell.updateHelper.typingProgres;
                        if (f40 != 1.0f) {
                            if (f40 > 0.0f) {
                                canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f40) * 255.0f), 31);
                                canvas3 = canvas;
                                if (dialogCell.updateHelper.typingOutToTop) {
                                    fDp = -AndroidUtilities.dp(14.0f);
                                    f41 = dialogCell.updateHelper.typingProgres;
                                } else {
                                    fDp = AndroidUtilities.dp(14.0f);
                                    f41 = dialogCell.updateHelper.typingProgres;
                                }
                                canvas3.translate(0.0f, fDp * f41);
                            }
                            i11 = 0;
                            while (i11 < dialogCell.thumbsCount) {
                                if (dialogCell.thumbImageSeen[i11]) {
                                    if (dialogCell.thumbBackgroundPaint == null) {
                                        Paint paint14 = new Paint(1);
                                        dialogCell.thumbBackgroundPaint = paint14;
                                        paint14.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                        dialogCell.thumbBackgroundPaint.setColor(0);
                                    }
                                    rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dialogCell.thumbImage[i11].getImageX(), dialogCell.thumbImage[i11].getImageY(), dialogCell.thumbImage[i11].getImageX2(), dialogCell.thumbImage[i11].getImageY2());
                                    dialogCell.thumbImage[i11].draw(canvas3);
                                    if (!dialogCell.drawSpoiler[i11]) {
                                        path = dialogCell.thumbPath;
                                        if (path == null) {
                                            dialogCell.thumbPath = new Path();
                                        } else {
                                            path.rewind();
                                        }
                                        dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i11].getRoundRadius()[0], dialogCell.thumbImage[i11].getRoundRadius()[1], Path.Direction.CW);
                                        canvas3.save();
                                        canvas3.clipPath(dialogCell.thumbPath);
                                        if (dialogCell.thumbSpoiler == null) {
                                            dialogCell.thumbSpoiler = new SpoilerEffect();
                                        }
                                        dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                        dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i11].getImageX(), (int) dialogCell.thumbImage[i11].getImageY(), (int) dialogCell.thumbImage[i11].getImageX2(), (int) dialogCell.thumbImage[i11].getImageY2());
                                        dialogCell.thumbSpoiler.draw(canvas3);
                                        dialogCell.invalidate();
                                        canvas3.restore();
                                    }
                                    if (dialogCell.drawPlay[i11]) {
                                        BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i11].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i6)), (int) (dialogCell.thumbImage[i11].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i6)));
                                        Theme.dialogs_playDrawable.draw(canvas3);
                                    }
                                }
                                i11++;
                                i9 = -1;
                            }
                            i10 = -1;
                            if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                canvas3.restore();
                            }
                        } else {
                            i10 = -1;
                        }
                    } else {
                        i10 = -1;
                    }
                    dialogCellTags = dialogCell.tags;
                    if (dialogCellTags != null) {
                        canvas3.save();
                        canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                        dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                        canvas3.restore();
                    }
                    if (i8 != i10) {
                        canvas3.restoreToCount(i8);
                    }
                }
                dialogCell = dialogCell3;
                if (dialogCell.thumbsCount > 0) {
                    f40 = dialogCell.updateHelper.typingProgres;
                    if (f40 != 1.0f) {
                        if (f40 > 0.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f40) * 255.0f), 31);
                            canvas3 = canvas;
                            if (dialogCell.updateHelper.typingOutToTop) {
                                fDp = -AndroidUtilities.dp(14.0f);
                                f41 = dialogCell.updateHelper.typingProgres;
                            } else {
                                fDp = AndroidUtilities.dp(14.0f);
                                f41 = dialogCell.updateHelper.typingProgres;
                            }
                            canvas3.translate(0.0f, fDp * f41);
                        }
                        i11 = 0;
                        while (i11 < dialogCell.thumbsCount) {
                            if (dialogCell.thumbImageSeen[i11]) {
                                if (dialogCell.thumbBackgroundPaint == null) {
                                    Paint paint15 = new Paint(1);
                                    dialogCell.thumbBackgroundPaint = paint15;
                                    paint15.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                    dialogCell.thumbBackgroundPaint.setColor(0);
                                }
                                rectF = AndroidUtilities.rectTmp;
                                rectF.set(dialogCell.thumbImage[i11].getImageX(), dialogCell.thumbImage[i11].getImageY(), dialogCell.thumbImage[i11].getImageX2(), dialogCell.thumbImage[i11].getImageY2());
                                dialogCell.thumbImage[i11].draw(canvas3);
                                if (!dialogCell.drawSpoiler[i11]) {
                                    path = dialogCell.thumbPath;
                                    if (path == null) {
                                        dialogCell.thumbPath = new Path();
                                    } else {
                                        path.rewind();
                                    }
                                    dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i11].getRoundRadius()[0], dialogCell.thumbImage[i11].getRoundRadius()[1], Path.Direction.CW);
                                    canvas3.save();
                                    canvas3.clipPath(dialogCell.thumbPath);
                                    if (dialogCell.thumbSpoiler == null) {
                                        dialogCell.thumbSpoiler = new SpoilerEffect();
                                    }
                                    dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                    dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i11].getImageX(), (int) dialogCell.thumbImage[i11].getImageY(), (int) dialogCell.thumbImage[i11].getImageX2(), (int) dialogCell.thumbImage[i11].getImageY2());
                                    dialogCell.thumbSpoiler.draw(canvas3);
                                    dialogCell.invalidate();
                                    canvas3.restore();
                                }
                                if (dialogCell.drawPlay[i11]) {
                                    BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i11].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i6)), (int) (dialogCell.thumbImage[i11].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i6)));
                                    Theme.dialogs_playDrawable.draw(canvas3);
                                }
                            }
                            i11++;
                            i9 = -1;
                        }
                        i10 = -1;
                        if (dialogCell.updateHelper.typingProgres > 0.0f) {
                            canvas3.restore();
                        }
                    } else {
                        i10 = -1;
                    }
                } else {
                    i10 = -1;
                }
                dialogCellTags = dialogCell.tags;
                if (dialogCellTags != null) {
                    canvas3.save();
                    canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                    dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                    canvas3.restore();
                }
                if (i8 != i10) {
                    canvas3.restoreToCount(i8);
                }
            } else {
                dialogCell = dialogCell4;
                i5 = 17;
                i6 = 2;
                f13 = 6.0f;
                f14 = 5.0f;
                z2 = false;
                z3 = false;
            }
            if (dialogCell.animatingArchiveAvatar) {
                canvas3.save();
                float interpolation7 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                canvas3.scale(interpolation7, interpolation7, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
            }
            if (dialogCell.drawAvatar && (!dialogCell.isTopic || (tL_forumTopic2 = dialogCell.forumTopic) == null || tL_forumTopic2.id != 1 || (pullForegroundDrawable = dialogCell.archivedChatsDrawable) == null || !pullForegroundDrawable.isDraw())) {
                if (dialogCell.drawMonoforumAvatar) {
                    if (dialogCell.bubbleClip == null) {
                        dialogCell.bubbleClip = new PhotoBubbleClip();
                    }
                    dialogCell.bubbleClip.setBounds((int) dialogCell.storyParams.originalAvatarRect.centerX(), (int) dialogCell.storyParams.originalAvatarRect.centerY(), (int) (dialogCell.storyParams.originalAvatarRect.width() / 2.0f));
                    canvas3.save();
                    canvas3.clipPath(dialogCell.bubbleClip);
                    dialogCell.avatarImage.setImageCoords(dialogCell.storyParams.originalAvatarRect);
                    dialogCell.avatarImage.draw(canvas3);
                    canvas3.restore();
                } else if (dialogCell.drawCommunityAvatar) {
                    DrawableUtils.setBounds(dialogCell.avatarImage, AndroidUtilities.dpf2(1.0f) + dialogCell.storyParams.originalAvatarRect.centerX(), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                    DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY(), AndroidUtilities.dp(48.0f));
                    dialogCell.avatarImage.draw(canvas3);
                } else {
                    avatarStoryParams = dialogCell.storyParams;
                    z6 = dialogCell.isShareToStoryCell;
                    if (z6 || dialogCell.currentDialogFolderId != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    avatarStoryParams.drawHiddenStoriesAsSegments = z7;
                    int i48 = avatarStoryParams.forceState;
                    if (z6) {
                        avatarStoryParams.forceState = 1;
                    }
                    StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                    if (dialogCell.storyParams.drawnLive) {
                        dialogCell.checkTtl();
                    }
                    dialogCell.storyParams.forceState = i48;
                }
                if (!dialogCell.insideCommunityList && ((((chat = dialogCell.chat) != null && chat.linked_community_id != 0) || ((user = dialogCell.user) != null && user.linked_community_id != 0)) && !dialogCell.drawCommunityAvatar && dialogCell.isDialogCell && !dialogCell.isDialogFolder())) {
                    float fCenterX5 = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                    float fCenterY5 = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                    if (dialogCell.communityArrowDrawable == null) {
                        dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                    }
                    DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX5, fCenterY5, i5);
                    canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                    dialogCell.communityArrowDrawable.draw(canvas3);
                }
            }
            if (dialogCell.animatingArchiveAvatar) {
                canvas3.restore();
            }
            if (dialogCell.avatarImage.getVisible() && drawAvatarOverlays(canvas)) {
                z3 = true;
            }
            if (dialogCell.rightFragmentOpenedProgress > 0.0f || dialogCell.currentDialogFolderId != 0) {
                dialogCell2 = dialogCell;
            } else {
                boolean zIsCounterMuted2 = dialogCell.isCounterMuted();
                RectF rectF20 = dialogCell.storyParams.originalAvatarRect;
                int iWidth = (int) (((rectF20.width() + rectF20.left) - dialogCell.countWidth) - AndroidUtilities.dp(f14));
                RectF rectF21 = dialogCell.storyParams.originalAvatarRect;
                drawCounter(canvas3, zIsCounterMuted2, (int) ((dialogCell.storyParams.originalAvatarRect.height() + dialogCell.avatarImage.getImageY()) - AndroidUtilities.dp(f4)), iWidth, (int) (((rectF21.width() + rectF21.left) - dialogCell.countWidthOld) - AndroidUtilities.dp(f14)), dialogCell.rightFragmentOpenedProgress, true);
                dialogCell2 = this;
            }
            if (dialogCell2.collapseOffset != 0.0f) {
                canvas3.restore();
            }
            if (dialogCell2.translationX != 0.0f) {
                canvas3.restore();
            }
            if (dialogCell2.drawArchive && ((dialogCell2.currentDialogFolderId != 0 || (dialogCell2.isTopic && (tL_forumTopic = dialogCell2.forumTopic) != null && tL_forumTopic.id == 1)) && dialogCell2.translationX == 0.0f && dialogCell2.archivedChatsDrawable != null)) {
                canvas3.save();
                canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                dialogCell2.archivedChatsDrawable.draw(canvas3);
                canvas3.restore();
            }
            if (dialogCell2.useSeparator) {
                f15 = 0.0f;
            } else {
                if (dialogCell2.fullSeparator || (!(dialogCell2.currentDialogFolderId == 0 || !dialogCell2.archiveHidden || dialogCell2.fullSeparator2) || (dialogCell2.fullSeparator2 && !dialogCell2.archiveHidden))) {
                    iDp = 0;
                } else {
                    iDp = AndroidUtilities.dp(dialogCell2.messagePaddingStart);
                }
                if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                    alpha = Theme.dividerPaint.getAlpha();
                    f32 = dialogCell2.rightFragmentOpenedProgress;
                    if (f32 != 0.0f) {
                        Theme.dividerPaint.setAlpha((int) ((1.0f - f32) * alpha));
                    }
                    measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                    if (LocaleController.isRTL) {
                        canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                    } else {
                        canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                    }
                    f15 = 0.0f;
                    if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                        Theme.dividerPaint.setAlpha(alpha);
                    }
                } else {
                    f15 = 0.0f;
                }
            }
            if (dialogCell2.clipProgress == f15) {
                canvas2 = canvas;
            } else if (Build.VERSION.SDK_INT != 24) {
                canvas.restore();
                canvas2 = canvas;
            } else {
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell2.resourcesProvider));
                canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                canvas2 = canvas;
            }
            if (z18) {
                float f612 = 1.0f - pullProgress;
                int measuredHeight6 = (int) (dialogCell2.getMeasuredHeight() * f612);
                color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                if (dialogCell2.archiveFadeGradientDrawable == null) {
                    dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                }
                if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                    dialogCell2.archiveFadeGradientDrawableColor = color3;
                    dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                }
                float fClamp6 = MathUtils.clamp((f612 - 0.05f) * 10.0f, 0.0f, 1.0f);
                dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight6, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(f13) + measuredHeight6);
                dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp6 * 255.0f));
                dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                canvas2.restore();
            }
            z4 = dialogCell2.drawReorder;
            if (z4 || dialogCell2.reorderIconProgress != 0.0f) {
                if (z4) {
                    f19 = dialogCell2.reorderIconProgress;
                    if (f19 < 1.0f) {
                        f20 = f19 + 0.09411765f;
                        dialogCell2.reorderIconProgress = f20;
                        if (f20 > 1.0f) {
                            dialogCell2.reorderIconProgress = 1.0f;
                        }
                        f17 = 0.0f;
                    } else {
                        f17 = 0.0f;
                    }
                } else {
                    f16 = dialogCell2.reorderIconProgress;
                    f17 = 0.0f;
                    if (f16 > 0.0f) {
                        f18 = f16 - 0.09411765f;
                        dialogCell2.reorderIconProgress = f18;
                        if (f18 < 0.0f) {
                            dialogCell2.reorderIconProgress = 0.0f;
                        }
                    }
                }
                z3 = true;
            } else {
                f17 = 0.0f;
            }
            if (dialogCell2.archiveHidden) {
                f30 = dialogCell2.archiveBackgroundProgress;
                if (f30 > f17) {
                    f31 = f30 - f3;
                    dialogCell2.archiveBackgroundProgress = f31;
                    if (f31 < f17) {
                        dialogCell2.archiveBackgroundProgress = f17;
                    }
                    if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                        dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                    }
                    z3 = true;
                }
            } else {
                f21 = dialogCell2.archiveBackgroundProgress;
                if (f21 < 1.0f) {
                    f22 = f21 + f3;
                    dialogCell2.archiveBackgroundProgress = f22;
                    if (f22 > 1.0f) {
                        dialogCell2.archiveBackgroundProgress = 1.0f;
                    }
                    if (dialogCell2.avatarDrawable.getAvatarType() == i6) {
                        dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                    }
                    z3 = true;
                }
            }
            if (dialogCell2.animatingArchiveAvatar) {
                f29 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                dialogCell2.animatingArchiveAvatarProgress = f29;
                if (f29 >= 170.0f) {
                    dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                    dialogCell2.animatingArchiveAvatar = false;
                }
                z5 = true;
            } else {
                z5 = z3;
            }
            if (dialogCell2.drawRevealBackground) {
                f25 = dialogCell2.currentRevealBounceProgress;
                if (f25 < 1.0f) {
                    f28 = f25 + 0.09411765f;
                    dialogCell2.currentRevealBounceProgress = f28;
                    if (f28 > 1.0f) {
                        dialogCell2.currentRevealBounceProgress = 1.0f;
                        z5 = true;
                    }
                }
                f26 = dialogCell2.currentRevealProgress;
                if (f26 < 1.0f) {
                    f27 = f26 + f2;
                    dialogCell2.currentRevealProgress = f27;
                    if (f27 > 1.0f) {
                        dialogCell2.currentRevealProgress = 1.0f;
                    }
                    z5 = true;
                }
            } else {
                if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                    dialogCell2.currentRevealBounceProgress = 0.0f;
                    z5 = true;
                }
                f23 = dialogCell2.currentRevealProgress;
                if (f23 > 0.0f) {
                    f24 = f23 - f2;
                    dialogCell2.currentRevealProgress = f24;
                    if (f24 < 0.0f) {
                        dialogCell2.currentRevealProgress = 0.0f;
                    }
                    z5 = true;
                }
            }
            View view5 = dialogCell2.emojiStatusView;
            if (z2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            view5.setVisibility(i7);
            if (z5) {
                dialogCell2.invalidate();
            }
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        PullForegroundDrawable pullForegroundDrawable;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isFolderCell() && (pullForegroundDrawable = this.archivedChatsDrawable) != null && SharedConfig.archiveHidden && pullForegroundDrawable.getPullProgress() == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!isFolderCell() && this.parentFragment != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null || !checkBox2.isChecked()) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.rightFragmentOpenedProgress != 0.0f || this.isTopic || this.isShareToStoryCell || !this.storyParams.checkOnTouchEvent(motionEvent, this)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        if (this.currentDialogId == 0 && this.customDialog == null) {
            return;
        }
        View view = this.emojiStatusView;
        if (view != null) {
            view.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        }
        if (this.checkBox != null) {
            int iDp2 = AndroidUtilities.dp(this.messagePaddingStart - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 29 : 27));
            if (this.inPreviewMode) {
                iDp2 = AndroidUtilities.dp(8.0f);
                iDp = (getMeasuredHeight() - this.checkBox.getMeasuredHeight()) >> 1;
            } else {
                if (LocaleController.isRTL) {
                    iDp2 = (i3 - i) - iDp2;
                }
                iDp = AndroidUtilities.dp(this.chekBoxPaddingTop + ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6 : 0));
            }
            CheckBox2 checkBox2 = this.checkBox;
            checkBox2.layout(iDp2, iDp, checkBox2.getMeasuredWidth() + iDp2, this.checkBox.getMeasuredHeight() + iDp);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.lastSize || this.updateLayout) {
            this.updateLayout = false;
            this.lastSize = measuredWidth;
            try {
                buildLayout();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        View view = this.emojiStatusView;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        if (this.isTopic) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? this.heightThreeLines : this.heightDefault;
            if (!hasTags() || ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !isForumCell())) {
                i3 = 0;
            } else {
                i3 = isForumCell() ? this.addForumHeightForTags : this.addHeightForTags;
            }
            setMeasuredDimension(size, AndroidUtilities.dp(i4 + i3) + (this.useSeparator ? 1 : 0));
            this.twoLinesForName = false;
            if (this.isTopic && !hasTags()) {
                buildLayout();
                if (this.nameIsEllipsized) {
                    this.twoLinesForName = true;
                    buildLayout();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), computeHeight());
        this.topClip = 0;
        this.bottomClip = getMeasuredHeight();
    }

    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        MessageObject captionMessage;
        TLRPC.User user;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb = new StringBuilder();
        String str = this.titleOverride;
        if (str != null) {
            sb.append(str);
            sb.append(". ");
        } else if (this.currentDialogFolderId == 1) {
            sb.append(LocaleController.getString(R.string.ArchivedChats));
            sb.append(". ");
        } else {
            if (this.encryptedChat != null) {
                sb.append(LocaleController.getString(R.string.AccDescrSecretChat));
                sb.append(". ");
            }
            if (!this.isTopic || this.forumTopic == null) {
                TLRPC.User user2 = this.user;
                if (user2 != null) {
                    if (UserObject.isReplyUser(user2)) {
                        sb.append(LocaleController.getString(R.string.RepliesTitle));
                    } else if (UserObject.isAnonymous(this.user)) {
                        sb.append(LocaleController.getString(R.string.AnonymousForward));
                    } else {
                        if (this.user.bot) {
                            sb.append(LocaleController.getString(R.string.Bot));
                            sb.append(". ");
                        }
                        TLRPC.User user3 = this.user;
                        if (user3.self) {
                            sb.append(LocaleController.getString(R.string.SavedMessages));
                        } else {
                            sb.append(ContactsController.formatName(user3.first_name, user3.last_name));
                        }
                    }
                    sb.append(". ");
                } else {
                    TLRPC.Chat chat = this.chat;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb.append(LocaleController.getString(R.string.AccDescrChannel));
                        } else {
                            sb.append(LocaleController.getString(R.string.AccDescrGroup));
                        }
                        sb.append(". ");
                        sb.append(this.chat.title);
                        sb.append(". ");
                    }
                }
            } else {
                sb.append(LocaleController.getString(R.string.AccDescrTopic));
                sb.append(". ");
                sb.append(this.forumTopic.title);
                sb.append(". ");
            }
        }
        if (this.drawVerified) {
            sb.append(LocaleController.getString(R.string.AccDescrVerified));
            sb.append(". ");
        }
        if (this.dialogMuted) {
            sb.append(LocaleController.getString(R.string.AccDescrNotificationsMuted));
            sb.append(". ");
        }
        if (isOnline()) {
            sb.append(LocaleController.getString(R.string.AccDescrUserOnline));
            sb.append(". ");
        }
        int i = this.unreadCount;
        if (i > 0) {
            sb.append(LocaleController.formatPluralString("NewMessages", i, new Object[0]));
            sb.append(". ");
        }
        int i2 = this.mentionCount;
        if (i2 > 0) {
            sb.append(LocaleController.formatPluralString("AccDescrMentionCount", i2, new Object[0]));
            sb.append(". ");
        }
        if (this.reactionMentionCount > 0) {
            sb.append(LocaleController.getString(R.string.AccDescrMentionReaction));
            sb.append(". ");
        }
        MessageObject messageObject = this.message;
        if (messageObject == null || this.currentDialogFolderId != 0) {
            accessibilityEvent.setContentDescription(sb);
            setContentDescription(sb);
            return;
        }
        int i3 = this.lastMessageDate;
        if (i3 == 0) {
            i3 = messageObject.messageOwner.date;
        }
        String dateAudio = LocaleController.formatDateAudio(i3, true);
        if (this.message.isOut()) {
            sb.append(LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, dateAudio));
        } else {
            sb.append(LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, dateAudio));
        }
        sb.append(". ");
        if (this.chat != null && !this.message.isOut() && this.message.isFromUser() && this.message.messageOwner.action == null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.message.messageOwner.from_id.user_id))) != null) {
            sb.append(ContactsController.formatName(user.first_name, user.last_name));
            sb.append(". ");
        }
        if (this.encryptedChat == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.message.messageText);
            if (!this.message.isMediaEmpty() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.caption)) {
                if (sb2.length() > 0) {
                    sb2.append(". ");
                }
                sb2.append(captionMessage.caption);
            }
            StaticLayout staticLayout = this.messageLayout;
            int length = staticLayout == null ? -1 : staticLayout.getText().length();
            if (length > 0) {
                int length2 = sb2.length();
                int iIndexOf = sb2.indexOf("\n", length);
                if (iIndexOf < length2 && iIndexOf >= 0) {
                    length2 = iIndexOf;
                }
                int iIndexOf2 = sb2.indexOf("\t", length);
                if (iIndexOf2 < length2 && iIndexOf2 >= 0) {
                    length2 = iIndexOf2;
                }
                int iIndexOf3 = sb2.indexOf(" ", length);
                if (iIndexOf3 < length2 && iIndexOf3 >= 0) {
                    length2 = iIndexOf3;
                }
                sb.append(sb2.substring(0, length2));
            } else {
                sb.append((CharSequence) sb2);
            }
        }
        accessibilityEvent.setContentDescription(sb);
        setContentDescription(sb);
    }

    public void onReorderStateChanged(boolean z, boolean z2) {
        if ((!getIsPinned() && z) || this.drawReorder == z) {
            if (getIsPinned()) {
                return;
            }
            this.drawReorder = false;
        } else {
            this.drawReorder = z;
            if (z2) {
                this.reorderIconProgress = z ? 0.0f : 1.0f;
            } else {
                this.reorderIconProgress = z ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.DialogCell.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        DialogsActivity dialogsActivity;
        if (i != R.id.acc_action_chat_preview || (dialogsActivity = this.parentFragment) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        dialogsActivity.showChatPreview(this);
        return true;
    }

    @Override
    public void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void resetPinnedArchiveState() {
        boolean z = SharedConfig.archiveHidden;
        this.archiveHidden = z;
        float f = z ? 0.0f : 1.0f;
        this.archiveBackgroundProgress = f;
        this.avatarDrawable.setArchivedAvatarHiddenProgress(f);
        this.clipProgress = 0.0f;
        this.isSliding = false;
        this.reorderIconProgress = (getIsPinned() && this.drawReorder) ? 1.0f : 0.0f;
        this.attachedToWindow = true;
        this.cornerProgress = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
        if (swapAnimatedEmojiDrawable != null && this.attachedToWindow) {
            swapAnimatedEmojiDrawable.attach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerification;
        if (swapAnimatedEmojiDrawable2 == null || !this.attachedToWindow) {
            return;
        }
        swapAnimatedEmojiDrawable2.attach();
    }

    public boolean separateMessageNameLine() {
        return (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags();
    }

    public void setArchivedPullAnimation(PullForegroundDrawable pullForegroundDrawable) {
        this.archivedChatsDrawable = pullForegroundDrawable;
    }

    public void setBottomClip(int i) {
        this.bottomClip = i;
    }

    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null || z) {
            if (checkBox2 == null) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, getContext(), this.resourcesProvider, 0);
                this.checkBox = anonymousClass3;
                anonymousClass3.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                this.checkBox.setDrawUnchecked(false);
                this.checkBox.setDrawBackgroundAsArc(3);
                addView(this.checkBox);
            }
            this.checkBox.setChecked(z, z2);
            checkTtl();
        }
    }

    public void setClipProgress(float f) {
        this.clipProgress = f;
        invalidate();
    }

    public void setCurrentDialogId(long j) {
        this.currentDialogId = j;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.customMessage, str)) {
            return;
        }
        this.customMessage = str;
        buildLayout();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.customMessage = str;
    }

    public void setDialog(TLRPC.Dialog dialog, int i, int i2) {
        TLRPC.Message message;
        TLRPC.User user;
        if (this.currentDialogId != dialog.id) {
            ValueAnimator valueAnimator = this.statusDrawableAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.statusDrawableAnimator.cancel();
            }
            this.statusDrawableAnimationInProgress = false;
            this.lastStatusDrawableParams = -1;
        }
        this.currentDialogId = dialog.id;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.isDialogCell = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.currentDialogCommunityId = dialog.community_id;
        } else {
            this.currentDialogCommunityId = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.currentDialogFolderId = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            PullForegroundDrawable pullForegroundDrawable = this.archivedChatsDrawable;
            if (pullForegroundDrawable != null) {
                pullForegroundDrawable.setCell(this);
            }
        } else {
            this.currentDialogFolderId = 0;
        }
        this.dialogsType = i;
        showPremiumBlocked(i == 3);
        if (this.tags == null) {
            this.tags = new DialogCellTags(this);
        }
        this.folderId = i2;
        this.messageId = 0;
        if (update(0, false)) {
            requestLayout();
        }
        if (this.user != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id))) != null) {
            this.user = user;
        }
        this.onlineProgress = isOnline() ? 1.0f : 0.0f;
        TLRPC.Chat chat = this.chat;
        boolean z = chat != null && chat.call_active && chat.call_not_empty;
        this.hasCall = z;
        this.chatCallProgress = z ? 1.0f : 0.0f;
        MessageObject messageObject = this.message;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.lastUnreadState) {
                ChatThemeController.getInstance(this.currentAccount).setDialogTheme(this.currentDialogId, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
            }
        }
        checkTtl();
    }

    public void setDialogCellDelegate(DialogCellDelegate dialogCellDelegate) {
        this.delegate = dialogCellDelegate;
    }

    public void setDialogSelected(boolean z) {
        if (this.isSelected != z) {
            invalidate();
        }
        this.isSelected = z;
    }

    public void setForumTopic(TLRPC.TL_forumTopic tL_forumTopic, long j, MessageObject messageObject, boolean z, boolean z2) {
        PullForegroundDrawable pullForegroundDrawable;
        this.forumTopic = tL_forumTopic;
        this.isTopic = tL_forumTopic != null;
        if (this.currentDialogId != j) {
            this.lastStatusDrawableParams = -1;
        }
        if (messageObject != null) {
            Drawable drawable = messageObject.topicIconDrawable[0];
            if (drawable instanceof ForumBubbleDrawable) {
                ((ForumBubbleDrawable) drawable).setColor(tL_forumTopic.icon_color);
            }
        }
        this.currentDialogId = j;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.message = messageObject;
        this.isDialogCell = false;
        this.showTopicIconInName = z;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            this.lastMessageDate = message.date;
            this.currentEditDate = message.edit_date;
            this.markUnread = false;
            this.messageId = messageObject.getId();
            this.lastUnreadState = messageObject.isUnread();
        }
        MessageObject messageObject2 = this.message;
        if (messageObject2 != null) {
            this.lastSendState = messageObject2.messageOwner.send_state;
        }
        if (!z2) {
            this.lastStatusDrawableParams = -1;
        }
        if (tL_forumTopic != null) {
            this.groupMessages = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.forumTopic;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (pullForegroundDrawable = this.archivedChatsDrawable) != null) {
            pullForegroundDrawable.setCell(this);
        }
        update(0, z2);
    }

    public void setIsShareToStoryCell() {
        this.repostStoryDrawable = new ShareDialogCell.RepostStoryDrawable(getContext(), this, false, R.drawable.forward_to_stories, this.resourcesProvider);
        this.isShareToStoryCell = true;
    }

    public void setIsTransitionSupport(boolean z) {
        this.isTransitionSupport = z;
    }

    public void setMoving(boolean z) {
        this.moving = z;
    }

    public void setOpenBotButton(boolean z) {
        if (this.openBot == z) {
            return;
        }
        if (this.openButtonText == null) {
            this.openButtonText = new Text(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.openBot = z;
        this.openButtonBounce.setPressed(false);
    }

    public void setPinForced(boolean z) {
        this.drawPinForced = z;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            buildLayout();
        }
        invalidate();
    }

    public void setPreloader(DialogsAdapter.DialogsPreloader dialogsPreloader) {
        this.preloader = dialogsPreloader;
    }

    public void setRightFragmentOpenedProgress(float f) {
        if (this.rightFragmentOpenedProgress != f) {
            this.rightFragmentOpenedProgress = f;
            invalidate();
        }
    }

    public void setSliding(boolean z) {
        this.isSliding = z;
    }

    public final void setThumb(int i, MessageObject messageObject) {
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
        TLObject tLObject = messageObject.photoThumbsObject;
        if (messageObject.isStoryMedia()) {
            TL_stories.StoryItem storyItem = messageObject.messageOwner.media.storyItem;
            if (storyItem == null || (messageMedia = storyItem.media) == null) {
                return;
            }
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                arrayList = document.thumbs;
                tLObject = document;
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    arrayList = photo.sizes;
                    tLObject = photo;
                }
            }
        }
        TLRPC.PhotoSize strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
        if (strippedPhotoSize == null) {
            strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 40);
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
        TLRPC.PhotoSize photoSize = strippedPhotoSize != closestPhotoSizeWithSize ? closestPhotoSizeWithSize : null;
        if (photoSize == null || !DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject)) {
            photoSize = strippedPhotoSize;
        }
        if (strippedPhotoSize != null) {
            this.hasVideoThumb = this.hasVideoThumb || messageObject.isVideo() || messageObject.isRoundVideo();
            int i2 = this.thumbsCount;
            if (i2 < 3) {
                this.thumbsCount = i2 + 1;
                this.drawPlay[i] = (messageObject.isVideo() || messageObject.isRoundVideo()) && !messageObject.hasMediaSpoilers();
                this.drawSpoiler[i] = messageObject.hasMediaSpoilers();
                int i3 = (messageObject.type != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = messageObject.hasMediaSpoilers() ? "5_5_b" : "20_20";
                this.thumbImage[i].setImage(ImageLocation.getForObject(photoSize, tLObject), str, ImageLocation.getForObject(strippedPhotoSize, tLObject), str, i3, null, messageObject, 0);
                this.thumbImage[i].setRoundRadius(AndroidUtilities.dp(messageObject.isRoundVideo() ? 18.0f : 2.0f));
                this.needEmoji = false;
            }
        }
    }

    public void setTitleOverride(String str) {
        this.titleOverride = str;
    }

    public void setTopClip(int i) {
        this.topClip = i;
    }

    @Override
    public void setTranslationX(float f) {
        if (f == this.translationX) {
            return;
        }
        this.translationX = f;
        RLottieDrawable rLottieDrawable = this.translationDrawable;
        if (rLottieDrawable != null && f == 0.0f) {
            rLottieDrawable.setProgress(0.0f);
            this.translationAnimationStarted = false;
            this.archiveHidden = SharedConfig.archiveHidden;
            this.currentRevealProgress = 0.0f;
            this.isSliding = false;
        }
        float f2 = this.translationX;
        if (f2 != 0.0f) {
            this.isSliding = true;
        } else {
            this.currentRevealBounceProgress = 0.0f;
            this.currentRevealProgress = 0.0f;
            this.drawRevealBackground = false;
        }
        if (this.isSliding && !this.swipeCanceled) {
            boolean z = this.drawRevealBackground;
            boolean z2 = Math.abs(f2) >= ((float) getMeasuredWidth()) * 0.45f;
            this.drawRevealBackground = z2;
            if (z != z2 && this.archiveHidden == SharedConfig.archiveHidden) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z) {
        if (this.visibleOnScreen == z) {
            return;
        }
        this.visibleOnScreen = z;
        if (z) {
            invalidate();
        }
    }

    public void showPremiumBlocked(boolean z) {
        Runnable runnable = this.unsubscribePremiumBlocked;
        if (z != (runnable != null)) {
            if (!z && runnable != null) {
                runnable.run();
                this.unsubscribePremiumBlocked = null;
            } else if (z) {
                this.unsubscribePremiumBlocked = NotificationCenter.getInstance(this.currentAccount).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new DialogCell$$ExternalSyntheticLambda6(this, 0));
            }
        }
    }

    public void startOutAnimation() {
        PullForegroundDrawable pullForegroundDrawable = this.archivedChatsDrawable;
        if (pullForegroundDrawable != null) {
            if (this.isTopic) {
                pullForegroundDrawable.outCy = AndroidUtilities.dp(24.0f);
                this.archivedChatsDrawable.outCx = AndroidUtilities.dp(24.0f);
                PullForegroundDrawable pullForegroundDrawable2 = this.archivedChatsDrawable;
                pullForegroundDrawable2.outRadius = 0.0f;
                pullForegroundDrawable2.outImageSize = 0.0f;
            } else {
                pullForegroundDrawable.outCy = this.storyParams.originalAvatarRect.centerY();
                this.archivedChatsDrawable.outCx = this.storyParams.originalAvatarRect.centerX();
                this.archivedChatsDrawable.outRadius = this.storyParams.originalAvatarRect.width() / 2.0f;
                if (!MessagesController.getInstance(this.currentAccount).getStoriesController().hiddenListStories.isEmpty()) {
                    this.archivedChatsDrawable.outRadius -= AndroidUtilities.dpf2(3.5f);
                }
                this.archivedChatsDrawable.outImageSize = this.avatarImage.getBitmapWidth();
            }
            this.archivedChatsDrawable.startOutAnimation();
        }
    }

    public boolean update(int i) {
        return update(i, true);
    }

    @Override
    public void updateColors() {
    }

    public void updateMessageThumbs() {
        TLRPC.Message message;
        int i;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z;
        TLObject tLObject;
        TLRPC.PhotoSize strippedPhotoSize;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        float f;
        TLRPC.PhotoSize photoSize;
        boolean z2;
        int i2;
        int i3;
        TLRPC.PhotoSize photoSize2;
        MessageObject messageObject = this.message;
        if (messageObject == null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason);
        MessageObject messageObject2 = this.message;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.thumbsCount = 0;
                this.hasVideoThumb = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i4 = 0;
                for (int i5 = 0; i5 < tL_messageMediaPaidMedia.extended_media.size() && this.thumbsCount < 3; i5++) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i5);
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        i = i4 + 1;
                        TLRPC.PhotoSize photoSize3 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                        if (i4 < 3 && photoSize3 != null) {
                            this.hasVideoThumb = false;
                            int i6 = this.thumbsCount;
                            if (i6 < 3) {
                                this.thumbsCount = i6 + 1;
                                this.drawPlay[i4] = false;
                                this.drawSpoiler[i4] = true;
                                this.thumbImage[i4].setImage(ImageLocation.getForObject(photoSize3, this.message.messageOwner), "2_2_b", null, null, 0, null, this.message, 0);
                                this.thumbImage[i4].setRoundRadius(AndroidUtilities.dp(2.0f));
                                this.needEmoji = false;
                            }
                        }
                    } else {
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            i = i4 + 1;
                            TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                TLRPC.Photo photo2 = messageMedia2.photo;
                                arrayList = photo2.sizes;
                                photo = photo2;
                            } else {
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                    boolean zIsVideoDocument = MessageObject.isVideoDocument(messageMedia2.document);
                                    TLRPC.Document document = messageMedia2.document;
                                    z = zIsVideoDocument;
                                    arrayList = document.thumbs;
                                    tLObject = document;
                                } else {
                                    photo = null;
                                    arrayList = null;
                                }
                                strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                                if (strippedPhotoSize == null) {
                                    strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 40);
                                }
                                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
                                if (strippedPhotoSize == closestPhotoSizeWithSize) {
                                    closestPhotoSizeWithSize = null;
                                }
                                if (closestPhotoSizeWithSize != null) {
                                    photoSize2 = closestPhotoSizeWithSize;
                                    f = 2.0f;
                                    if (!DownloadController.getInstance(this.currentAccount).canDownloadMedia(1, closestPhotoSizeWithSize.size)) {
                                        photoSize = photoSize2;
                                    }
                                    if (strippedPhotoSize != null) {
                                        if (!this.hasVideoThumb || z) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        this.hasVideoThumb = z2;
                                        i2 = this.thumbsCount;
                                        if (i2 < 3) {
                                            this.thumbsCount = i2 + 1;
                                            this.drawPlay[i4] = z;
                                            this.drawSpoiler[i4] = false;
                                            if (!z || photoSize == null) {
                                                i3 = 0;
                                            } else {
                                                i3 = photoSize.size;
                                            }
                                            this.thumbImage[i4].setImage(ImageLocation.getForObject(photoSize, tLObject), "20_20", ImageLocation.getForObject(strippedPhotoSize, tLObject), "20_20", i3, null, this.message, 0);
                                            this.thumbImage[i4].setRoundRadius(AndroidUtilities.dp(f));
                                            this.needEmoji = false;
                                        }
                                    }
                                } else {
                                    f = 2.0f;
                                }
                                photoSize = strippedPhotoSize;
                                if (strippedPhotoSize != null) {
                                    if (this.hasVideoThumb) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    this.hasVideoThumb = z2;
                                    i2 = this.thumbsCount;
                                    if (i2 < 3) {
                                        this.thumbsCount = i2 + 1;
                                        this.drawPlay[i4] = z;
                                        this.drawSpoiler[i4] = false;
                                        if (z) {
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                        }
                                        this.thumbImage[i4].setImage(ImageLocation.getForObject(photoSize, tLObject), "20_20", ImageLocation.getForObject(strippedPhotoSize, tLObject), "20_20", i3, null, this.message, 0);
                                        this.thumbImage[i4].setRoundRadius(AndroidUtilities.dp(f));
                                        this.needEmoji = false;
                                    }
                                }
                            }
                            z = false;
                            tLObject = photo;
                            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                            if (strippedPhotoSize == null) {
                                strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 40);
                            }
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
                            if (strippedPhotoSize == closestPhotoSizeWithSize) {
                                closestPhotoSizeWithSize = null;
                            }
                            if (closestPhotoSizeWithSize != null) {
                                photoSize2 = closestPhotoSizeWithSize;
                                f = 2.0f;
                                if (!DownloadController.getInstance(this.currentAccount).canDownloadMedia(1, closestPhotoSizeWithSize.size)) {
                                    photoSize = photoSize2;
                                }
                                if (strippedPhotoSize != null) {
                                    if (this.hasVideoThumb) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    this.hasVideoThumb = z2;
                                    i2 = this.thumbsCount;
                                    if (i2 < 3) {
                                        this.thumbsCount = i2 + 1;
                                        this.drawPlay[i4] = z;
                                        this.drawSpoiler[i4] = false;
                                        if (z) {
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                        }
                                        this.thumbImage[i4].setImage(ImageLocation.getForObject(photoSize, tLObject), "20_20", ImageLocation.getForObject(strippedPhotoSize, tLObject), "20_20", i3, null, this.message, 0);
                                        this.thumbImage[i4].setRoundRadius(AndroidUtilities.dp(f));
                                        this.needEmoji = false;
                                    }
                                }
                            } else {
                                f = 2.0f;
                            }
                            photoSize = strippedPhotoSize;
                            if (strippedPhotoSize != null) {
                                if (this.hasVideoThumb) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                this.hasVideoThumb = z2;
                                i2 = this.thumbsCount;
                                if (i2 < 3) {
                                    this.thumbsCount = i2 + 1;
                                    this.drawPlay[i4] = z;
                                    this.drawSpoiler[i4] = false;
                                    if (z) {
                                        i3 = 0;
                                    } else {
                                        i3 = 0;
                                    }
                                    this.thumbImage[i4].setImage(ImageLocation.getForObject(photoSize, tLObject), "20_20", ImageLocation.getForObject(strippedPhotoSize, tLObject), "20_20", i3, null, this.message, 0);
                                    this.thumbImage[i4].setRoundRadius(AndroidUtilities.dp(f));
                                    this.needEmoji = false;
                                }
                            }
                        }
                    }
                    i4 = i;
                }
                return;
            }
        }
        ArrayList<MessageObject> arrayList2 = this.groupMessages;
        if (arrayList2 != null && arrayList2.size() > 1 && TextUtils.isEmpty(restrictionReason) && this.currentDialogFolderId == 0 && this.encryptedChat == null) {
            this.thumbsCount = 0;
            this.hasVideoThumb = false;
            Collections.sort(this.groupMessages, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(2)));
            for (int i7 = 0; i7 < Math.min(3, this.groupMessages.size()); i7++) {
                MessageObject messageObject3 = this.groupMessages.get(i7);
                if (messageObject3 != null && !messageObject3.needDrawBluredPreview() && (messageObject3.isPhoto() || messageObject3.isNewGif() || messageObject3.isVideo() || messageObject3.isRoundVideo() || messageObject3.isStoryMedia())) {
                    String str = messageObject3.isWebpage() ? messageObject3.messageOwner.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        setThumb(i7, messageObject3);
                    }
                }
            }
            return;
        }
        MessageObject messageObject4 = this.message;
        if (messageObject4 == null || this.currentDialogFolderId != 0) {
            return;
        }
        this.thumbsCount = 0;
        this.hasVideoThumb = false;
        if (messageObject4.needDrawBluredPreview()) {
            return;
        }
        if (this.message.isPhoto() || this.message.isNewGif() || this.message.isVideo() || this.message.isRoundVideo() || this.message.isStoryMedia()) {
            String str2 = this.message.isWebpage() ? this.message.messageOwner.media.webpage.type : null;
            if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                return;
            }
            if (str2 == null || !str2.startsWith("telegram_")) {
                setThumb(0, this.message);
            }
        }
    }

    public final void updatePremiumBlocked(boolean z) {
        TL_account.RequirementToContact requirementToContactIsUserContactBlocked = (this.unsubscribePremiumBlocked == null || this.user == null) ? null : MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.user.id);
        if (this.premiumBlocked == DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked) && this.starsPriceBlocked == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
            return;
        }
        this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
        this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
        if (!z) {
            this.premiumBlockedT.set(this.premiumBlocked, true);
            this.starsBlockedT.set(this.starsPriceBlocked > 0, true);
        }
        invalidate();
    }

    public final void updateThumbsPosition() {
        if (this.thumbsCount > 0) {
            StaticLayout staticLayout = isForumCell() ? this.buttonLayout : this.messageLayout;
            int i = isForumCell() ? this.buttonLeft : this.messageLeft;
            if (staticLayout == null) {
                return;
            }
            try {
                CharSequence text = staticLayout.getText();
                if (text instanceof Spanned) {
                    FixedWidthSpan[] fixedWidthSpanArr = (FixedWidthSpan[]) ((Spanned) text).getSpans(0, text.length(), FixedWidthSpan.class);
                    if (fixedWidthSpanArr == null || fixedWidthSpanArr.length <= 0) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            this.thumbImageSeen[i2] = false;
                        }
                        return;
                    }
                    int spanStart = ((Spanned) text).getSpanStart(fixedWidthSpanArr[0]);
                    if (spanStart < 0) {
                        spanStart = 0;
                    }
                    int iCeil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                    if (iCeil != 0 && !this.drawForwardIcon && !this.drawGiftIcon) {
                        iCeil += AndroidUtilities.dp(3.0f);
                    }
                    for (int i3 = 0; i3 < this.thumbsCount; i3++) {
                        this.thumbImage[i3].setImageX(i + iCeil + AndroidUtilities.dp((this.thumbSize + 2) * i3));
                        this.thumbImageSeen[i3] = true;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public boolean update(int i, boolean z) {
        long j;
        boolean z2;
        char c;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        ?? r4;
        boolean z7;
        boolean z8;
        long dialogId;
        boolean zIsDialogMuted;
        boolean zIsDialogMuted2;
        boolean z9;
        TLRPC.User user;
        ?? r5;
        int i3;
        ?? chat;
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        boolean z12;
        int iDp;
        TLRPC.User user2;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        TLRPC.EncryptedChat encryptedChatM;
        MessageObject messageObjectFindFolderTopMessage;
        TLRPC.User user3;
        char c2;
        boolean z13;
        char c3;
        CharSequence charSequence;
        MessageObject messageObject2;
        int i4;
        int i5;
        MessageObject messageObject3;
        TLRPC.Dialog dialog;
        TLRPC.Chat chat4;
        int i6;
        int i7;
        int i8;
        int archiveUnreadCount;
        TLRPC.Chat chat5;
        ForumFormattedNames forumFormattedNames;
        HashMap map;
        TLRPC.Chat chat6;
        boolean z14;
        MessageObject messageObject4;
        long botVerificationIcon;
        TLRPC.Chat chat7;
        TLRPC.User user4;
        boolean zIsForumCell = isForumCell();
        boolean z15 = false;
        this.drawAvatarSelector = false;
        this.ttlPeriod = 0;
        CustomDialog customDialog = this.customDialog;
        if (customDialog != null) {
            this.lastMessageDate = customDialog.date;
            int i9 = customDialog.unread_count;
            this.lastUnreadState = i9 != 0;
            this.unreadCount = i9;
            this.drawPin = customDialog.pinned;
            this.dialogMuted = customDialog.muted;
            this.hasUnmutedTopics = false;
            this.hasUnmutedCommunityDialogs = false;
            this.avatarDrawable.setInfo(customDialog.id, customDialog.name, null);
            if (this.isShareToStoryCell) {
                this.avatarImage.setImage(null, "50_50", this.repostStoryDrawable, null, 0L);
            } else {
                this.avatarImage.setImage(null, "50_50", this.avatarDrawable, null, 0L);
            }
            int i10 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.thumbImage;
                if (i10 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i10].setImageBitmap((Drawable) null);
                i10++;
            }
            this.drawMonoforumAvatar = false;
            this.drawCommunityAvatar = false;
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(26.0f));
            this.drawUnmute = false;
            z7 = zIsForumCell;
            z3 = false;
            z4 = false;
        } else {
            int i11 = this.unreadCount;
            boolean z16 = this.reactionMentionCount != 0;
            boolean z17 = this.markUnread;
            this.hasUnmutedTopics = false;
            this.hasUnmutedCommunityDialogs = false;
            this.readOutboxMaxId = -1;
            if (this.isDialogCell) {
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                if (dialog2 != null) {
                    this.readOutboxMaxId = dialog2.read_outbox_max_id;
                    this.ttlPeriod = dialog2.ttl_period;
                    if (i == 0) {
                        j = 0;
                        this.clearingDialog = MessagesController.getInstance(this.currentAccount).isClearingDialog(dialog2.id);
                        ArrayList<MessageObject> arrayList = (ArrayList) MessagesController.getInstance(this.currentAccount).dialogMessage.get(dialog2.id);
                        this.groupMessages = arrayList;
                        MessageObject messageObject5 = (arrayList == null || arrayList.size() <= 0) ? null : this.groupMessages.get(0);
                        this.message = messageObject5;
                        this.lastUnreadState = messageObject5 != null && messageObject5.isUnread();
                        TLRPC.Chat chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog2.id));
                        if (chat8 != null && (chat8.forum || (chat8.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat8)))) {
                            int[] forumUnreadCount = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat8.id);
                            this.unreadCount = forumUnreadCount[0];
                            this.mentionCount = forumUnreadCount[1];
                            this.reactionMentionCount = forumUnreadCount[2];
                            this.hasUnmutedTopics = forumUnreadCount[3] != 0;
                            this.pollVotesMentionCount = forumUnreadCount[4];
                        } else if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                            this.unreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                            this.mentionCount = 0;
                            this.reactionMentionCount = 0;
                            this.pollVotesMentionCount = 0;
                        } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                            MessagesController.UnreadCounts communityUnreadCount = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog2.id);
                            this.unreadCount = communityUnreadCount.unreadCount;
                            this.mentionCount = communityUnreadCount.mentionCount;
                            this.reactionMentionCount = communityUnreadCount.reactionMentionCount;
                            this.pollVotesMentionCount = communityUnreadCount.pollVotesMentionCount;
                            this.hasUnmutedCommunityDialogs = communityUnreadCount.hasUnmutedUnreadDialogs;
                        } else {
                            this.unreadCount = dialog2.unread_count;
                            this.mentionCount = dialog2.unread_mentions_count;
                            this.reactionMentionCount = dialog2.unread_reactions_count;
                            this.pollVotesMentionCount = dialog2.unread_poll_votes_count;
                        }
                        if (ChatObject.isMonoForum(chat8)) {
                            this.mentionCount = 0;
                        }
                        this.markUnread = dialog2.unread_mark;
                        MessageObject messageObject6 = this.message;
                        this.currentEditDate = messageObject6 != null ? messageObject6.messageOwner.edit_date : 0;
                        this.lastMessageDate = dialog2.last_message_date;
                        int i12 = this.dialogsType;
                        if (i12 == 7 || i12 == 8) {
                            MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(this.currentAccount).selectedDialogFilter[this.dialogsType == 8 ? (char) 1 : (char) 0];
                            this.drawPin = dialogFilter != null && dialogFilter.pinnedDialogs.indexOfKey(dialog2.id) >= 0;
                        } else {
                            this.drawPin = this.currentDialogFolderId == 0 && dialog2.pinned;
                        }
                        MessageObject messageObject7 = this.message;
                        if (messageObject7 != null) {
                            this.lastSendState = messageObject7.messageOwner.send_state;
                        }
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                    this.unreadCount = 0;
                    this.mentionCount = 0;
                    this.reactionMentionCount = 0;
                    this.pollVotesMentionCount = 0;
                    this.currentEditDate = 0;
                    this.lastMessageDate = 0;
                    this.clearingDialog = false;
                }
                long j2 = this.currentDialogId;
                this.drawAvatarSelector = j2 != j && j2 == RightSlidingDialogContainer.fragmentDialogId;
            } else {
                j = 0;
                this.drawPin = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.forumTopic;
            if (tL_forumTopic != null) {
                this.unreadCount = tL_forumTopic.unread_count;
                this.mentionCount = tL_forumTopic.unread_mentions_count;
                this.reactionMentionCount = tL_forumTopic.unread_reactions_count;
                this.pollVotesMentionCount = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.dialogsType == 2) {
                this.drawPin = false;
            }
            DialogCellTags dialogCellTags = this.tags;
            if (dialogCellTags != null) {
                boolean zIsEmpty = dialogCellTags.isEmpty();
                z2 = zIsForumCell;
                c = 2;
                if (this.tags.update(this.currentAccount, this.dialogsType, this.currentDialogId)) {
                    if (zIsEmpty != this.tags.isEmpty()) {
                        z3 = true;
                        z4 = true;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    z5 = true;
                }
                if (i != 0) {
                    user3 = this.user;
                    if (user3 != null && !MessagesController.isSupportUser(user3) && !this.user.bot && (i & MessagesController.UPDATE_MASK_STATUS) != 0) {
                        this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id));
                        if (this.wasDrawnOnline != isOnline()) {
                            z5 = true;
                        }
                    }
                    if ((i & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                        if (this.user != null) {
                            user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id));
                            this.user = user4;
                            if (user4 != null || DialogObject.getEmojiStatusDocumentId(user4.emoji_status) == j) {
                                this.nameLayoutEllipsizeByGradient = true;
                                this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                this.emojiStatus.setParticles(false, z);
                            } else {
                                this.nameLayoutEllipsizeByGradient = true;
                                this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.user.emoji_status), z);
                                this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), z);
                            }
                            botVerificationIcon = DialogObject.getBotVerificationIcon(this.user);
                            z5 = true;
                        } else {
                            botVerificationIcon = j;
                        }
                        if (this.chat != null) {
                            chat7 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                            this.chat = chat7;
                            if (chat7 != null || DialogObject.getEmojiStatusDocumentId(chat7.emoji_status) == j) {
                                this.nameLayoutEllipsizeByGradient = true;
                                this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                this.emojiStatus.setParticles(false, z);
                            } else {
                                this.nameLayoutEllipsizeByGradient = true;
                                this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), z);
                                this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), z);
                            }
                            botVerificationIcon = DialogObject.getBotVerificationIcon(this.chat);
                            z5 = true;
                        }
                        if (botVerificationIcon != j) {
                            z13 = !this.drawBotVerified;
                            c2 = 4;
                            this.botVerification.set(botVerificationIcon, z);
                        } else {
                            c2 = 4;
                            z13 = this.drawBotVerified;
                            this.botVerification.set((Drawable) null, z);
                        }
                    } else {
                        c2 = 4;
                        z13 = false;
                    }
                    if ((!this.isDialogCell || this.isTopic) && (i & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                        z6 = z16;
                        c3 = 1;
                        CharSequence printingString = MessagesController.getInstance(this.currentAccount).getPrintingString(this.currentDialogId, getTopicId(), true);
                        charSequence = this.lastPrintString;
                        if ((charSequence == null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                        }
                    } else {
                        z6 = z16;
                        c3 = 1;
                    }
                    if (!z13 && (i & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0 && (messageObject4 = this.message) != null && messageObject4.messageText != this.lastMessageString) {
                        z13 = true;
                    }
                    if (!z13 && (i & MessagesController.UPDATE_MASK_CHAT) != 0 && this.chat != null) {
                        chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                        if (chat6 == null && chat6.call_active && chat6.call_not_empty) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14 != this.hasCall) {
                            z13 = true;
                        }
                    }
                    if (!z13 && (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat5 = this.chat) == null || (chat5.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat5)))) {
                        forumFormattedNames = this.forumFormattedNames;
                        if (forumFormattedNames != null && (map = forumFormattedNames.avatarSpans) != null && !map.isEmpty()) {
                            for (Map.Entry entry : forumFormattedNames.avatarSpans.entrySet()) {
                                ((AvatarSpan) entry.getValue()).setDialogId(((Long) entry.getKey()).longValue());
                            }
                        }
                        z13 = true;
                    }
                    if (!z13 && (i & MessagesController.UPDATE_MASK_NAME) != 0 && this.chat == null) {
                        z13 = true;
                    }
                    if (!z13 && (i & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 && this.user == null) {
                        z13 = true;
                    }
                    if (!z13 && (i & MessagesController.UPDATE_MASK_CHAT_NAME) != 0 && this.user == null) {
                        z13 = true;
                    }
                    if (z13) {
                        i2 = i11;
                    } else {
                        messageObject3 = this.message;
                        if (messageObject3 != null && this.lastUnreadState != messageObject3.isUnread()) {
                            this.lastUnreadState = this.message.isUnread();
                            z13 = true;
                        }
                        if (this.isDialogCell) {
                            dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                            if (dialog == null) {
                                chat4 = null;
                            } else {
                                chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                            }
                            if (chat4 == null && (chat4.forum || (chat4.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat4)))) {
                                i2 = i11;
                                int[] forumUnreadCount2 = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat4.id);
                                int i13 = forumUnreadCount2[0];
                                int i14 = forumUnreadCount2[c3];
                                int i15 = forumUnreadCount2[c];
                                this.hasUnmutedTopics = forumUnreadCount2[3] != 0;
                                int i16 = forumUnreadCount2[c2];
                                i6 = i14;
                                i8 = i16;
                                archiveUnreadCount = i13;
                                i7 = i15;
                            } else {
                                i2 = i11;
                                if (dialog instanceof TLRPC.TL_dialogFolder) {
                                    archiveUnreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                    i6 = 0;
                                    i7 = 0;
                                    i8 = 0;
                                } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                    MessagesController.UnreadCounts communityUnreadCount2 = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog.id);
                                    archiveUnreadCount = communityUnreadCount2.unreadCount;
                                    int i17 = communityUnreadCount2.mentionCount;
                                    int i18 = communityUnreadCount2.reactionMentionCount;
                                    i8 = communityUnreadCount2.pollVotesMentionCount;
                                    this.hasUnmutedCommunityDialogs = communityUnreadCount2.hasUnmutedUnreadDialogs;
                                    i6 = i17;
                                    i7 = i18;
                                } else if (dialog != null) {
                                    archiveUnreadCount = dialog.unread_count;
                                    i6 = dialog.unread_mentions_count;
                                    i7 = dialog.unread_reactions_count;
                                    i8 = dialog.unread_poll_votes_count;
                                } else {
                                    i6 = 0;
                                    i7 = 0;
                                    i8 = 0;
                                    archiveUnreadCount = 0;
                                }
                            }
                            if (ChatObject.isMonoForum(chat4)) {
                                i6 = 0;
                            }
                            if (dialog != null && (this.unreadCount != archiveUnreadCount || this.markUnread != dialog.unread_mark || this.mentionCount != i6 || this.reactionMentionCount != i7)) {
                                this.unreadCount = archiveUnreadCount;
                                this.mentionCount = i6;
                                this.markUnread = dialog.unread_mark;
                                this.reactionMentionCount = i7;
                                this.pollVotesMentionCount = i8;
                                z13 = true;
                            }
                        } else {
                            i2 = i11;
                        }
                    }
                    if (!z13 && (i & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject2 = this.message) != null) {
                        i4 = this.lastSendState;
                        i5 = messageObject2.messageOwner.send_state;
                        if (i4 != i5) {
                            this.lastSendState = i5;
                            z13 = true;
                        }
                    }
                    if (!z13) {
                        invalidate();
                        return z3;
                    }
                    r4 = 0;
                } else {
                    i2 = i11;
                    z6 = z16;
                    r4 = 0;
                }
                this.user = r4;
                this.chat = r4;
                this.encryptedChat = r4;
                if (this.currentDialogCommunityId != j) {
                    this.message = MessagesController.getInstance(this.currentAccount).findCommunityLastMessage(this.currentDialogCommunityId);
                }
                if (this.currentDialogFolderId != 0) {
                    this.dialogMuted = false;
                    this.drawUnmute = false;
                    messageObjectFindFolderTopMessage = findFolderTopMessage();
                    this.message = messageObjectFindFolderTopMessage;
                    if (messageObjectFindFolderTopMessage != null) {
                        dialogId = messageObjectFindFolderTopMessage.getDialogId();
                        z7 = z2;
                    } else {
                        z7 = z2;
                        dialogId = j;
                    }
                } else {
                    this.drawUnmute = false;
                    if (this.forumTopic != null) {
                        zIsDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, j);
                        z7 = z2;
                        zIsDialogMuted2 = MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, this.forumTopic.id);
                        this.topicMuted = zIsDialogMuted2;
                        if (zIsDialogMuted == zIsDialogMuted2) {
                            this.dialogMuted = false;
                            this.drawUnmute = false;
                        } else {
                            this.dialogMuted = zIsDialogMuted2;
                            this.drawUnmute = !zIsDialogMuted2;
                        }
                    } else {
                        z7 = z2;
                        if (this.isDialogCell || !MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, getTopicId())) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        this.dialogMuted = z8;
                    }
                    dialogId = this.currentDialogId;
                    j = 0;
                }
                if (dialogId != j) {
                    if (DialogObject.isEncryptedDialog(dialogId)) {
                        encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount), dialogId);
                        this.encryptedChat = encryptedChatM;
                        if (encryptedChatM != null) {
                            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.encryptedChat.user_id));
                        }
                    } else if (DialogObject.isUserDialog(dialogId)) {
                        this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                    } else {
                        TLRPC.Chat chat9 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                        this.chat = chat9;
                        if (!this.isDialogCell && chat9 != null && chat9.migrated_to != null && (chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.migrated_to.channel_id))) != null) {
                            this.chat = chat3;
                        }
                    }
                    if (this.useMeForMyMessages && this.user != null && this.message.isOutOwner()) {
                        this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
                    }
                }
                if (this.insideCommunityList && ChatObject.isCommunity(this.chat) && this.isDialogCell) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.drawCommunityAvatar = z9;
                if (this.currentDialogFolderId != 0) {
                    Theme.dialogs_archiveAvatarDrawable.setCallback(this);
                    this.avatarDrawable.setAvatarType(2);
                    this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                } else if (this.useFromUserAsAvatar || (messageObject = this.message) == null) {
                    user = this.user;
                    if (user != null) {
                        this.avatarDrawable.setInfo(this.currentAccount, user);
                        if (UserObject.isReplyUser(this.user)) {
                            this.avatarDrawable.setAvatarType(12);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        } else if (UserObject.isAnonymous(this.user)) {
                            this.avatarDrawable.setAvatarType(21);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        } else if (!UserObject.isUserSelf(this.user) && this.isSavedDialog && !this.isMonoForumTopicDialog) {
                            this.avatarDrawable.setAvatarType(22);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        } else if (UserObject.isUserSelf(this.user) || this.useMeForMyMessages || this.isMonoForumTopicDialog) {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        } else {
                            this.avatarDrawable.setAvatarType(1);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        }
                    } else {
                        r5 = this.chat;
                        if (r5 != 0) {
                            if (r5.monoforum) {
                                i3 = this.currentAccount;
                                ?? r8 = this.avatarDrawable;
                                ?? r9 = this.avatarImage;
                                int i19 = ForumUtilities.$r8$clinit;
                                if (ChatObject.isMonoForum(r5)) {
                                    chat = r4;
                                    chat = MessagesController.getInstance(i3).getChat(Long.valueOf(r5.linked_monoforum_id));
                                }
                                if (chat != 0) {
                                    r5 = chat;
                                }
                                r8.setInfo(i3, r5);
                                r9.setForUserOrChat(chat, r8);
                                this.avatarDrawable.setScaleSize(1.0f);
                            } else {
                                this.avatarDrawable.setInfo(this.currentAccount, r5);
                                this.avatarImage.setForUserOrChat(r5, this.avatarDrawable);
                            }
                        }
                        if (!z && ((i2 != this.unreadCount || z17 != this.markUnread) && (!this.isDialogCell || System.currentTimeMillis() - this.lastDialogChangedTime > 100))) {
                            ValueAnimator valueAnimator = this.countAnimator;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.countAnimator = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addUpdateListener(new DialogCell$$ExternalSyntheticLambda0(this, 1));
                            this.countAnimator.addListener(new AnonymousClass4(this, 0));
                            if ((i2 == 0 || this.markUnread) && (this.markUnread || !z17)) {
                                this.countAnimator.setDuration(220L);
                                this.countAnimator.setInterpolator(new OvershootInterpolator());
                            } else if (this.unreadCount == 0) {
                                this.countAnimator.setDuration(150L);
                                this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            } else {
                                this.countAnimator.setDuration(430L);
                                this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            }
                            if (this.drawCount && this.drawCount2 && this.countLayout != null) {
                                String str = String.format("%d", Integer.valueOf(i2));
                                String str2 = String.format("%d", Integer.valueOf(this.unreadCount));
                                if (str.length() == str2.length()) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str2);
                                    for (int i20 = 0; i20 < str.length(); i20++) {
                                        if (str.charAt(i20) == str2.charAt(i20)) {
                                            int i21 = i20 + 1;
                                            spannableStringBuilder.setSpan(new EmptyStubSpan(), i20, i21, 0);
                                            spannableStringBuilder2.setSpan(new EmptyStubSpan(), i20, i21, 0);
                                        } else {
                                            spannableStringBuilder3.setSpan(new EmptyStubSpan(), i20, i20 + 1, 0);
                                        }
                                    }
                                    int iMax = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str)));
                                    TextPaint textPaint = Theme.dialogs_countTextPaint2;
                                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                    this.countOldLayout = new StaticLayout(spannableStringBuilder, textPaint, iMax, alignment, 1.0f, 0.0f, false);
                                    this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, Theme.dialogs_countTextPaint2, iMax, alignment, 1.0f, 0.0f, false);
                                    this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, Theme.dialogs_countTextPaint2, iMax, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.countOldLayout = this.countLayout;
                                }
                            }
                            this.countWidthOld = this.countWidth;
                            this.countLeftOld = this.countLeft;
                            this.countAnimationIncrement = this.unreadCount > i2;
                            this.countAnimator.start();
                        }
                        BoolAnimator boolAnimator = this.animatorPollVotesMentionVisible;
                        if (this.pollVotesMentionCount != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolAnimator.setValue(z10, z);
                        if (this.reactionMentionCount != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z && z11 != z6) {
                            ValueAnimator valueAnimator2 = this.reactionsMentionsAnimator;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            this.reactionsMentionsChangeProgress = 0.0f;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.reactionsMentionsAnimator = valueAnimatorOfFloat2;
                            valueAnimatorOfFloat2.addUpdateListener(new DialogCell$$ExternalSyntheticLambda0(this, 2));
                            this.reactionsMentionsAnimator.addListener(new AnonymousClass4(this, 1));
                            if (z11) {
                                this.reactionsMentionsAnimator.setDuration(220L);
                                this.reactionsMentionsAnimator.setInterpolator(new OvershootInterpolator());
                            } else {
                                this.reactionsMentionsAnimator.setDuration(150L);
                                this.reactionsMentionsAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            }
                            this.reactionsMentionsAnimator.start();
                        }
                        if (isFolderCell() && (chat2 = this.chat) != null && chat2.monoforum) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.drawMonoforumAvatar = z12;
                        if (z12) {
                            iDp = 1;
                        } else if (this.drawCommunityAvatar) {
                            iDp = AndroidUtilities.dp(12.0f);
                        } else {
                            TLRPC.Chat chat10 = this.chat;
                            iDp = (!(chat10 == null && chat10.forum && this.currentDialogFolderId == 0 && !this.useFromUserAsAvatar) && (this.isSavedDialog || (user2 = this.user) == null || !user2.self || !MessagesController.getInstance(this.currentAccount).savedViewAsChats)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f);
                        }
                        this.avatarImage.setRoundRadius(iDp);
                        z15 = z5;
                    }
                } else {
                    this.avatarDrawable.setInfo(this.currentAccount, messageObject.getFromPeerObject());
                    this.avatarImage.setForUserOrChat(this.message.getFromPeerObject(), this.avatarDrawable);
                }
                if (!z) {
                }
                BoolAnimator boolAnimator2 = this.animatorPollVotesMentionVisible;
                if (this.pollVotesMentionCount != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolAnimator2.setValue(z10, z);
                if (this.reactionMentionCount != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z) {
                }
                if (isFolderCell()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                this.drawMonoforumAvatar = z12;
                if (z12) {
                    iDp = 1;
                } else if (this.drawCommunityAvatar) {
                    iDp = AndroidUtilities.dp(12.0f);
                } else {
                    TLRPC.Chat chat11 = this.chat;
                    if (chat11 == null) {
                    }
                }
                this.avatarImage.setRoundRadius(iDp);
                z15 = z5;
            } else {
                z2 = zIsForumCell;
                c = 2;
            }
            z3 = false;
            z4 = false;
            z5 = false;
            if (i != 0) {
                user3 = this.user;
                if (user3 != null) {
                    this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id));
                    if (this.wasDrawnOnline != isOnline()) {
                        z5 = true;
                    }
                }
                if ((i & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                    if (this.user != null) {
                        user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id));
                        this.user = user4;
                        if (user4 != null) {
                            this.nameLayoutEllipsizeByGradient = true;
                            this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                            this.emojiStatus.setParticles(false, z);
                        } else {
                            this.nameLayoutEllipsizeByGradient = true;
                            this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                            this.emojiStatus.setParticles(false, z);
                        }
                        botVerificationIcon = DialogObject.getBotVerificationIcon(this.user);
                        z5 = true;
                    } else {
                        botVerificationIcon = j;
                    }
                    if (this.chat != null) {
                        chat7 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                        this.chat = chat7;
                        if (chat7 != null) {
                            this.nameLayoutEllipsizeByGradient = true;
                            this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                            this.emojiStatus.setParticles(false, z);
                        } else {
                            this.nameLayoutEllipsizeByGradient = true;
                            this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                            this.emojiStatus.setParticles(false, z);
                        }
                        botVerificationIcon = DialogObject.getBotVerificationIcon(this.chat);
                        z5 = true;
                    }
                    if (botVerificationIcon != j) {
                        z13 = !this.drawBotVerified;
                        c2 = 4;
                        this.botVerification.set(botVerificationIcon, z);
                    } else {
                        c2 = 4;
                        z13 = this.drawBotVerified;
                        this.botVerification.set((Drawable) null, z);
                    }
                } else {
                    c2 = 4;
                    z13 = false;
                }
                if (this.isDialogCell) {
                    z6 = z16;
                    c3 = 1;
                    CharSequence printingString2 = MessagesController.getInstance(this.currentAccount).getPrintingString(this.currentDialogId, getTopicId(), true);
                    charSequence = this.lastPrintString;
                    z13 = charSequence == null ? true : true;
                } else {
                    z6 = z16;
                    c3 = 1;
                    CharSequence printingString3 = MessagesController.getInstance(this.currentAccount).getPrintingString(this.currentDialogId, getTopicId(), true);
                    charSequence = this.lastPrintString;
                    if (charSequence == null) {
                    }
                }
                if (!z13) {
                    z13 = true;
                }
                if (!z13) {
                    chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                    if (chat6 == null) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (z14 != this.hasCall) {
                        z13 = true;
                    }
                }
                if (!z13) {
                    forumFormattedNames = this.forumFormattedNames;
                    if (forumFormattedNames != null) {
                        while (r7.hasNext()) {
                            ((AvatarSpan) entry.getValue()).setDialogId(((Long) entry.getKey()).longValue());
                        }
                    }
                    z13 = true;
                }
                if (!z13) {
                    z13 = true;
                }
                if (!z13) {
                    z13 = true;
                }
                if (!z13) {
                    z13 = true;
                }
                if (z13) {
                    i2 = i11;
                } else {
                    messageObject3 = this.message;
                    if (messageObject3 != null) {
                        this.lastUnreadState = this.message.isUnread();
                        z13 = true;
                    }
                    if (this.isDialogCell) {
                        dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                        if (dialog == null) {
                            chat4 = null;
                        } else {
                            chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                        }
                        if (chat4 == null) {
                            i2 = i11;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                archiveUnreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                i6 = 0;
                                i7 = 0;
                                i8 = 0;
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount3 = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog.id);
                                archiveUnreadCount = communityUnreadCount3.unreadCount;
                                int i110 = communityUnreadCount3.mentionCount;
                                int i111 = communityUnreadCount3.reactionMentionCount;
                                i8 = communityUnreadCount3.pollVotesMentionCount;
                                this.hasUnmutedCommunityDialogs = communityUnreadCount3.hasUnmutedUnreadDialogs;
                                i6 = i110;
                                i7 = i111;
                            } else if (dialog != null) {
                                archiveUnreadCount = dialog.unread_count;
                                i6 = dialog.unread_mentions_count;
                                i7 = dialog.unread_reactions_count;
                                i8 = dialog.unread_poll_votes_count;
                            } else {
                                i6 = 0;
                                i7 = 0;
                                i8 = 0;
                                archiveUnreadCount = 0;
                            }
                        } else {
                            i2 = i11;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                archiveUnreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                i6 = 0;
                                i7 = 0;
                                i8 = 0;
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount4 = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog.id);
                                archiveUnreadCount = communityUnreadCount4.unreadCount;
                                int i112 = communityUnreadCount4.mentionCount;
                                int i113 = communityUnreadCount4.reactionMentionCount;
                                i8 = communityUnreadCount4.pollVotesMentionCount;
                                this.hasUnmutedCommunityDialogs = communityUnreadCount4.hasUnmutedUnreadDialogs;
                                i6 = i112;
                                i7 = i113;
                            } else if (dialog != null) {
                                archiveUnreadCount = dialog.unread_count;
                                i6 = dialog.unread_mentions_count;
                                i7 = dialog.unread_reactions_count;
                                i8 = dialog.unread_poll_votes_count;
                            } else {
                                i6 = 0;
                                i7 = 0;
                                i8 = 0;
                                archiveUnreadCount = 0;
                            }
                        }
                        if (ChatObject.isMonoForum(chat4)) {
                            i6 = 0;
                        }
                        if (dialog != null) {
                            this.unreadCount = archiveUnreadCount;
                            this.mentionCount = i6;
                            this.markUnread = dialog.unread_mark;
                            this.reactionMentionCount = i7;
                            this.pollVotesMentionCount = i8;
                            z13 = true;
                        }
                    } else {
                        i2 = i11;
                    }
                }
                if (!z13) {
                    i4 = this.lastSendState;
                    i5 = messageObject2.messageOwner.send_state;
                    if (i4 != i5) {
                        this.lastSendState = i5;
                        z13 = true;
                    }
                }
                if (!z13) {
                    invalidate();
                    return z3;
                }
                r4 = 0;
            } else {
                i2 = i11;
                z6 = z16;
                r4 = 0;
            }
            this.user = r4;
            this.chat = r4;
            this.encryptedChat = r4;
            if (this.currentDialogCommunityId != j) {
                this.message = MessagesController.getInstance(this.currentAccount).findCommunityLastMessage(this.currentDialogCommunityId);
            }
            if (this.currentDialogFolderId != 0) {
                this.dialogMuted = false;
                this.drawUnmute = false;
                messageObjectFindFolderTopMessage = findFolderTopMessage();
                this.message = messageObjectFindFolderTopMessage;
                if (messageObjectFindFolderTopMessage != null) {
                    dialogId = messageObjectFindFolderTopMessage.getDialogId();
                    z7 = z2;
                } else {
                    z7 = z2;
                    dialogId = j;
                }
            } else {
                this.drawUnmute = false;
                if (this.forumTopic != null) {
                    zIsDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, j);
                    z7 = z2;
                    zIsDialogMuted2 = MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, this.forumTopic.id);
                    this.topicMuted = zIsDialogMuted2;
                    if (zIsDialogMuted == zIsDialogMuted2) {
                        this.dialogMuted = false;
                        this.drawUnmute = false;
                    } else {
                        this.dialogMuted = zIsDialogMuted2;
                        this.drawUnmute = !zIsDialogMuted2;
                    }
                } else {
                    z7 = z2;
                    if (this.isDialogCell) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    this.dialogMuted = z8;
                }
                dialogId = this.currentDialogId;
                j = 0;
            }
            if (dialogId != j) {
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(this.currentAccount), dialogId);
                    this.encryptedChat = encryptedChatM;
                    if (encryptedChatM != null) {
                        this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(dialogId)) {
                    this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                } else {
                    TLRPC.Chat chat12 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                    this.chat = chat12;
                    if (!this.isDialogCell) {
                        this.chat = chat3;
                    }
                }
                if (this.useMeForMyMessages) {
                    this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
                }
            }
            if (this.insideCommunityList) {
                z9 = false;
            } else {
                z9 = false;
            }
            this.drawCommunityAvatar = z9;
            if (this.currentDialogFolderId != 0) {
                Theme.dialogs_archiveAvatarDrawable.setCallback(this);
                this.avatarDrawable.setAvatarType(2);
                this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
            } else {
                if (this.useFromUserAsAvatar) {
                    user = this.user;
                    if (user != null) {
                        this.avatarDrawable.setInfo(this.currentAccount, user);
                        if (UserObject.isReplyUser(this.user)) {
                            this.avatarDrawable.setAvatarType(12);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        } else if (UserObject.isAnonymous(this.user)) {
                            this.avatarDrawable.setAvatarType(21);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        } else if (!UserObject.isUserSelf(this.user)) {
                            if (UserObject.isUserSelf(this.user)) {
                                this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                            } else {
                                this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                            }
                        } else if (UserObject.isUserSelf(this.user)) {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        } else {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        }
                    } else {
                        r5 = this.chat;
                        if (r5 != 0) {
                            if (r5.monoforum) {
                                i3 = this.currentAccount;
                                ?? r10 = this.avatarDrawable;
                                ?? r11 = this.avatarImage;
                                int i114 = ForumUtilities.$r8$clinit;
                                if (ChatObject.isMonoForum(r5)) {
                                    chat = r4;
                                    chat = MessagesController.getInstance(i3).getChat(Long.valueOf(r5.linked_monoforum_id));
                                }
                                if (chat != 0) {
                                    r5 = chat;
                                }
                                r10.setInfo(i3, r5);
                                r11.setForUserOrChat(chat, r10);
                                this.avatarDrawable.setScaleSize(1.0f);
                            } else {
                                this.avatarDrawable.setInfo(this.currentAccount, r5);
                                this.avatarImage.setForUserOrChat(r5, this.avatarDrawable);
                            }
                        }
                    }
                } else {
                    user = this.user;
                    if (user != null) {
                        this.avatarDrawable.setInfo(this.currentAccount, user);
                        if (UserObject.isReplyUser(this.user)) {
                            this.avatarDrawable.setAvatarType(12);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        } else if (UserObject.isAnonymous(this.user)) {
                            this.avatarDrawable.setAvatarType(21);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        } else if (!UserObject.isUserSelf(this.user)) {
                            if (UserObject.isUserSelf(this.user)) {
                                this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                            } else {
                                this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                            }
                        } else if (UserObject.isUserSelf(this.user)) {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        } else {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        }
                    } else {
                        r5 = this.chat;
                        if (r5 != 0) {
                            if (r5.monoforum) {
                                i3 = this.currentAccount;
                                ?? r12 = this.avatarDrawable;
                                ?? r13 = this.avatarImage;
                                int i115 = ForumUtilities.$r8$clinit;
                                if (ChatObject.isMonoForum(r5)) {
                                    chat = r4;
                                    chat = MessagesController.getInstance(i3).getChat(Long.valueOf(r5.linked_monoforum_id));
                                }
                                if (chat != 0) {
                                    r5 = chat;
                                }
                                r12.setInfo(i3, r5);
                                r13.setForUserOrChat(chat, r12);
                                this.avatarDrawable.setScaleSize(1.0f);
                            } else {
                                this.avatarDrawable.setInfo(this.currentAccount, r5);
                                this.avatarImage.setForUserOrChat(r5, this.avatarDrawable);
                            }
                        }
                    }
                }
                if (!z) {
                }
                BoolAnimator boolAnimator3 = this.animatorPollVotesMentionVisible;
                if (this.pollVotesMentionCount != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolAnimator3.setValue(z10, z);
                if (this.reactionMentionCount != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z) {
                }
                if (isFolderCell()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                this.drawMonoforumAvatar = z12;
                if (z12) {
                    iDp = 1;
                } else if (this.drawCommunityAvatar) {
                    iDp = AndroidUtilities.dp(12.0f);
                } else {
                    TLRPC.Chat chat13 = this.chat;
                    if (chat13 == null) {
                    }
                }
                this.avatarImage.setRoundRadius(iDp);
                z15 = z5;
            }
            if (!z) {
            }
            BoolAnimator boolAnimator4 = this.animatorPollVotesMentionVisible;
            if (this.pollVotesMentionCount != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolAnimator4.setValue(z10, z);
            if (this.reactionMentionCount != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z) {
            }
            if (isFolderCell()) {
                z12 = false;
            } else {
                z12 = false;
            }
            this.drawMonoforumAvatar = z12;
            if (z12) {
                iDp = 1;
            } else if (this.drawCommunityAvatar) {
                iDp = AndroidUtilities.dp(12.0f);
            } else {
                TLRPC.Chat chat14 = this.chat;
                if (chat14 == null) {
                }
            }
            this.avatarImage.setRoundRadius(iDp);
            z15 = z5;
        }
        if (!this.isTopic && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z4 = true;
        }
        if (!z15) {
            int i22 = this.storyParams.currentState;
            StoriesUtilities.getPredictiveUnreadState(MessagesController.getInstance(this.currentAccount).getStoriesController(), getDialogId());
        }
        if (!z) {
            this.dialogMutedProgress = (this.dialogMuted || this.drawUnmute) ? 1.0f : 0.0f;
            ValueAnimator valueAnimator3 = this.countAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        boolean z18 = isForumCell() != z7 ? true : z3;
        if (z4) {
            if (this.attachedToWindow) {
                buildLayout();
            } else {
                this.updateLayout = true;
            }
        }
        updatePremiumBlocked(z);
        return z18;
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    public void setDialog(CustomDialog customDialog) {
        TLRPC.Message message;
        TLRPC.User user;
        this.customDialog = customDialog;
        this.messageId = 0;
        update(0);
        if (this.user != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id))) != null) {
            this.user = user;
        }
        this.onlineProgress = isOnline() ? 1.0f : 0.0f;
        TLRPC.Chat chat = this.chat;
        boolean z = chat != null && chat.call_active && chat.call_not_empty;
        this.hasCall = z;
        this.chatCallProgress = z ? 1.0f : 0.0f;
        MessageObject messageObject = this.message;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.lastUnreadState) {
                ChatThemeController.getInstance(this.currentAccount).setDialogTheme(this.currentDialogId, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
            }
        }
        checkTtl();
    }

    public void setDialog(long j, MessageObject messageObject, int i, boolean z, boolean z2) {
        if (this.currentDialogId != j) {
            this.lastStatusDrawableParams = -1;
        }
        this.currentDialogId = j;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.message = messageObject;
        this.useMeForMyMessages = z;
        this.isDialogCell = false;
        this.lastMessageDate = i;
        this.currentEditDate = messageObject != null ? messageObject.messageOwner.edit_date : 0;
        this.unreadCount = 0;
        this.markUnread = false;
        this.messageId = messageObject != null ? messageObject.getId() : 0;
        this.mentionCount = 0;
        this.reactionMentionCount = 0;
        this.pollVotesMentionCount = 0;
        this.lastUnreadState = messageObject != null && messageObject.isUnread();
        MessageObject messageObject2 = this.message;
        if (messageObject2 != null) {
            this.lastSendState = messageObject2.messageOwner.send_state;
        }
        update(0, z2);
    }

    public void setDialog(long j, MessageObject messageObject, ArrayList<MessageObject> arrayList, int i, boolean z, boolean z2) {
        if (this.currentDialogId != j) {
            this.lastStatusDrawableParams = -1;
        }
        this.currentDialogId = j;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.message = messageObject;
        this.useMeForMyMessages = z;
        this.isDialogCell = false;
        this.lastMessageDate = i;
        this.currentEditDate = messageObject != null ? messageObject.messageOwner.edit_date : 0;
        this.unreadCount = 0;
        this.markUnread = false;
        this.messageId = messageObject != null ? messageObject.getId() : 0;
        this.mentionCount = 0;
        this.reactionMentionCount = 0;
        this.pollVotesMentionCount = 0;
        this.lastUnreadState = messageObject != null && messageObject.isUnread();
        this.groupMessages = arrayList;
        MessageObject messageObject2 = this.message;
        if (messageObject2 != null) {
            this.lastSendState = messageObject2.messageOwner.send_state;
        }
        update(0, z2);
    }
}
