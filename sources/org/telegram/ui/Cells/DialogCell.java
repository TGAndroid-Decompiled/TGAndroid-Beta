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
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.ToIntFunction;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
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
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.community.CommunityArrowDrawable;
import org.telegram.ui.community.CommunitySheet;

public class DialogCell extends BaseCell implements StoriesListPlaceProvider.AvatarOverlaysView, Theme.Colorable {
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
    private ArrayList groupMessages;
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
    private Utilities.Callback onOpenButtonClick;
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
    private List spoilers;
    private List spoilers2;
    private Stack spoilersPool;
    private Stack spoilersPool2;
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

    public static class BounceInterpolator implements Interpolator {
        @Override
        public float getInterpolation(float f) {
            if (f < 0.33f) {
                return (f / 0.33f) * 0.1f;
            }
            float f2 = f - 0.33f;
            return f2 < 0.33f ? 0.1f - ((f2 / 0.34f) * 0.15f) : (((f2 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
        }
    }

    public static class CustomDialog {
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

    public boolean checkCurrentDialogIndex(boolean z) {
        return false;
    }

    protected boolean drawLock2() {
        return false;
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    @Override
    public void updateColors() {
    }

    public void setMoving(boolean z) {
        this.moving = z;
    }

    public boolean isMoving() {
        return this.moving;
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

    public void setRightFragmentOpenedProgress(float f) {
        if (this.rightFragmentOpenedProgress != f) {
            this.rightFragmentOpenedProgress = f;
            invalidate();
        }
    }

    public void setCurrentDialogId(long j) {
        this.currentDialogId = j;
    }

    public void setIsTransitionSupport(boolean z) {
        this.isTransitionSupport = z;
    }

    public void setIsShareToStoryCell() {
        this.repostStoryDrawable = new ShareDialogCell.RepostStoryDrawable(getContext(), this, R.drawable.forward_to_stories, this.resourcesProvider);
        this.isShareToStoryCell = true;
    }

    public void checkHeight() {
        if (getMeasuredHeight() <= 0 || getMeasuredHeight() == computeHeight()) {
            return;
        }
        requestLayout();
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

    public static class FixedWidthSpan extends ReplacementSpan {
        private int width;

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        public FixedWidthSpan(int i) {
            this.width = i;
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
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

    public DialogCell allowBotOpenButton(boolean z, Utilities.Callback callback) {
        this.allowBotOpenButton = z;
        this.onOpenButtonClick = callback;
        return this;
    }

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    public long getStarsPrice() {
        return this.starsPriceBlocked;
    }

    public DialogCell(DialogsActivity dialogsActivity, Context context, boolean z, boolean z2) {
        this(dialogsActivity, context, z, z2, UserConfig.selectedAccount, null);
    }

    public DialogCell(DialogsActivity dialogsActivity, Context context, boolean z, boolean z2, int i, Theme.ResourcesProvider resourcesProvider) {
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
        StoriesUtilities.AvatarStoryParams avatarStoryParams = new StoriesUtilities.AvatarStoryParams(0 == true ? 1 : 0) {
            @Override
            public boolean isAvatarClickable(long j, TLRPC.Chat chat, TLRPC.User user) {
                return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || DialogCell.this.insideCommunityList) ? false : true;
            }

            @Override
            public boolean onAvatarClick(View view, long j) {
                if (DialogCell.this.parentFragment != null) {
                    DialogCell dialogCell = DialogCell.this;
                    if (!dialogCell.insideCommunityList) {
                        if (j > 0) {
                            TLRPC.User user = MessagesController.getInstance(dialogCell.currentAccount).getUser(Long.valueOf(j));
                            if (user != null && user.linked_community_id != 0) {
                                DialogCell.this.parentFragment.showDialog(new CommunitySheet(DialogCell.this.parentFragment, user.linked_community_id));
                                return true;
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(dialogCell.currentAccount).getChat(Long.valueOf(-j));
                            if (chat != null && chat.linked_community_id != 0) {
                                DialogCell.this.parentFragment.showDialog(new CommunitySheet(DialogCell.this.parentFragment, chat.linked_community_id));
                                return true;
                            }
                        }
                    }
                }
                return super.onAvatarClick(view, j);
            }

            @Override
            public void openStory(long j, Runnable runnable) {
                DialogCell dialogCell = DialogCell.this;
                if (dialogCell.delegate == null) {
                    return;
                }
                if (dialogCell.currentDialogFolderId != 0) {
                    DialogCell.this.delegate.openHiddenStories();
                    return;
                }
                DialogCell dialogCell2 = DialogCell.this;
                DialogCellDelegate dialogCellDelegate = dialogCell2.delegate;
                if (dialogCellDelegate != null) {
                    dialogCellDelegate.openStory(dialogCell2, runnable);
                }
            }

            @Override
            public void onLongPress() {
                DialogCell dialogCell = DialogCell.this;
                DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
                if (dialogCellDelegate == null) {
                    return;
                }
                dialogCellDelegate.showChatPreview(dialogCell);
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
        this.spoilersPool = new Stack();
        this.spoilers = new ArrayList();
        this.spoilersPool2 = new Stack();
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
            if (i2 < imageReceiverArr.length) {
                imageReceiverArr[i2] = new ImageReceiver(this);
                ImageReceiver imageReceiver = this.thumbImage[i2];
                imageReceiver.ignoreNotifications = true;
                imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                this.thumbImage[i2].setAllowLoadingOnAttachedOnly(true);
                i2++;
            } else {
                this.useForceThreeLines = z2;
                this.currentAccount = i;
                View view = new View(context) {
                    @Override
                    protected void onDraw(Canvas canvas) {
                        DialogCell.this.emojiStatus.setBounds(0, 0, getWidth(), getHeight());
                        DialogCell.this.emojiStatus.draw(canvas);
                    }
                };
                this.emojiStatusView = view;
                addView(view);
                this.emojiStatus = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, AndroidUtilities.dp(22.0f));
                this.botVerification = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(17.0f));
                this.avatarImage.setAllowLoadingOnAttachedOnly(true);
                return;
            }
        }
    }

    @Override
    public void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.customMessage = str;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.customMessage, str)) {
            return;
        }
        this.customMessage = str;
        buildLayout();
        requestLayout();
    }

    public void setDialog(TLRPC.Dialog dialog, int i, int i2) {
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
        checkOnline();
        checkGroupCall();
        checkChatTheme();
        checkTtl();
    }

    public void setDialog(CustomDialog customDialog) {
        this.customDialog = customDialog;
        this.messageId = 0;
        update(0);
        checkOnline();
        checkGroupCall();
        checkChatTheme();
        checkTtl();
    }

    private void checkOnline() {
        TLRPC.User user;
        if (this.user != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id))) != null) {
            this.user = user;
        }
        this.onlineProgress = isOnline() ? 1.0f : 0.0f;
    }

    private boolean isOnline() {
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

    private void checkGroupCall() {
        TLRPC.Chat chat = this.chat;
        boolean z = chat != null && chat.call_active && chat.call_not_empty;
        this.hasCall = z;
        this.chatCallProgress = z ? 1.0f : 0.0f;
    }

    private void checkTtl() {
        CheckBox2 checkBox2;
        boolean z = this.ttlPeriod > 0 && !this.hasCall && !isOnline() && ((checkBox2 = this.checkBox) == null || !checkBox2.isChecked()) && !this.storyParams.drawnLive;
        this.showTtl = z;
        this.ttlProgress = z ? 1.0f : 0.0f;
    }

    private void checkChatTheme() {
        TLRPC.Message message;
        MessageObject messageObject = this.message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.lastUnreadState) {
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(this.currentDialogId, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
        }
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

    public void setDialog(long j, MessageObject messageObject, ArrayList arrayList, int i, boolean z, boolean z2) {
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

    public long getDialogId() {
        return this.currentDialogId;
    }

    public int getMessageId() {
        return this.messageId;
    }

    public void setPreloader(DialogsAdapter.DialogsPreloader dialogsPreloader) {
        this.preloader = dialogsPreloader;
    }

    @Override
    protected void onDetachedFromWindow() {
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
            dialogsPreloader.remove(this.currentDialogId);
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
    protected void onAttachedToWindow() {
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

    @Override
    protected void onMeasure(int i, int i2) {
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
            checkTwoLinesForName();
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), computeHeight());
        this.topClip = 0;
        this.bottomClip = getMeasuredHeight();
    }

    private int computeHeight() {
        if (isForumCell() && !this.isTransitionSupport && !this.collapsed) {
            int iDp = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 86.0f : 91.0f);
            if (this.useSeparator) {
                iDp++;
            }
            return hasTags() ? iDp + AndroidUtilities.dp(this.addForumHeightForTags) : iDp;
        }
        return getCollapsedHeight();
    }

    private int getCollapsedHeight() {
        int iDp = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? this.heightThreeLines : this.heightDefault) + 1;
        if (this.twoLinesForName) {
            iDp += AndroidUtilities.dp(20.0f);
        }
        if (!hasTags()) {
            return iDp;
        }
        if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !isForumCell()) {
            return iDp;
        }
        return iDp + AndroidUtilities.dp(isForumCell() ? this.addForumHeightForTags : this.addHeightForTags);
    }

    private void checkTwoLinesForName() {
        this.twoLinesForName = false;
        if (!this.isTopic || hasTags()) {
            return;
        }
        buildLayout();
        if (this.nameIsEllipsized) {
            this.twoLinesForName = true;
            buildLayout();
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        int measuredHeight = (getMeasuredHeight() + getMeasuredWidth()) << 16;
        if (measuredHeight != this.lastSize || this.updateLayout) {
            this.updateLayout = false;
            this.lastSize = measuredHeight;
            try {
                buildLayout();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
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

    public void setPinForced(boolean z) {
        this.drawPinForced = z;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            buildLayout();
        }
        invalidate();
    }

    private CharSequence formatArchivedDialogNames() {
        TLRPC.User user;
        String strEscape;
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
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(dialog.id)));
                    user = encryptedChat != null ? messagesController.getUser(Long.valueOf(encryptedChat.user_id)) : null;
                } else if (DialogObject.isUserDialog(dialog.id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.id));
                    user = null;
                }
                if (chat != null) {
                    strEscape = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else if (UserObject.isDeleted(user)) {
                    strEscape = LocaleController.getString(R.string.HiddenName);
                } else {
                    strEscape = AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = strEscape.length() + length;
                spannableStringBuilder.append((CharSequence) strEscape);
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

    private CharSequence formatCommunityDialogNames() {
        TLRPC.User user;
        String strEscape;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.currentDialogId);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(dialog.id)));
                    user = encryptedChat != null ? messagesController.getUser(Long.valueOf(encryptedChat.user_id)) : null;
                } else if (DialogObject.isUserDialog(dialog.id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.id));
                    user = null;
                }
                if (chat != null) {
                    strEscape = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else if (UserObject.isDeleted(user)) {
                    strEscape = LocaleController.getString(R.string.HiddenName);
                } else {
                    strEscape = AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = strEscape.length() + length;
                spannableStringBuilder.append((CharSequence) strEscape);
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

    public boolean hasTags() {
        DialogCellTags dialogCellTags = this.tags;
        return (dialogCellTags == null || dialogCellTags.isEmpty()) ? false : true;
    }

    public void buildLayout() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.DialogCell.buildLayout():void");
    }

    public void setTitleOverride(String str) {
        this.titleOverride = str;
    }

    private SpannableStringBuilder formatInternal(int i, CharSequence charSequence, CharSequence charSequence2) {
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

    private void updateThumbsPosition() {
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

    private CharSequence applyThumbs(CharSequence charSequence) {
        if (this.thumbsCount <= 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        spannableStringBuilderValueOf.insert(0, (CharSequence) " ");
        spannableStringBuilderValueOf.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 3)), 0, 1, 33);
        return spannableStringBuilderValueOf;
    }

    private CharSequence formatTopicsNames() {
        if (this.forumFormattedNames == null) {
            this.forumFormattedNames = new ForumFormattedNames(this);
        }
        this.forumFormattedNames.formatTopicsNames(this.currentAccount, this.message, this.chat);
        ForumFormattedNames forumFormattedNames = this.forumFormattedNames;
        this.topMessageTopicStartIndex = forumFormattedNames.topMessageTopicStartIndex;
        this.topMessageTopicEndIndex = forumFormattedNames.topMessageTopicEndIndex;
        this.lastTopicMessageUnread = forumFormattedNames.lastTopicMessageUnread;
        return forumFormattedNames.formattedNames;
    }

    public boolean isForumCell() {
        TLRPC.Chat chat;
        if (isDialogFolder() || this.insideCommunityListNoDialog || (chat = this.chat) == null) {
            return false;
        }
        return (chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, this.chat))) && !this.isTopic;
    }

    private void drawCheckStatus(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f) {
        if (f != 0.0f || z4) {
            float f2 = (f * 0.5f) + 0.5f;
            if (z) {
                BaseCell.setDrawableBounds(Theme.dialogs_clockDrawable, this.clockDrawLeft, this.checkDrawTop);
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
                if (z2) {
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
                        canvas.translate(AndroidUtilities.dp(4.0f) * (1.0f - f), 0.0f);
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
                    return;
                }
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
                }
            }
        }
    }

    public boolean isPointInsideAvatar(float f, float f2) {
        if (LocaleController.isRTL) {
            return f >= ((float) (getMeasuredWidth() - AndroidUtilities.dp(60.0f))) && f < ((float) getMeasuredWidth());
        }
        return f >= 0.0f && f < ((float) AndroidUtilities.dp(60.0f));
    }

    public void setDialogSelected(boolean z) {
        if (this.isSelected != z) {
            invalidate();
        }
        this.isSelected = z;
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

    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null || z) {
            if (checkBox2 == null) {
                CheckBox2 checkBox3 = new CheckBox2(getContext(), 21, this.resourcesProvider) {
                    @Override
                    public void invalidate() {
                        super.invalidate();
                        DialogCell.this.invalidate();
                    }
                };
                this.checkBox = checkBox3;
                checkBox3.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                this.checkBox.setDrawUnchecked(false);
                this.checkBox.setDrawBackgroundAsArc(3);
                addView(this.checkBox);
            }
            this.checkBox.setChecked(z, z2);
            checkTtl();
        }
    }

    private MessageObject findFolderTopMessage() {
        ArrayList dialogsArray;
        DialogsActivity dialogsActivity = this.parentFragment;
        if (dialogsActivity == null || (dialogsArray = dialogsActivity.getDialogsArray(this.currentAccount, this.dialogsType, this.currentDialogFolderId, false)) == null || dialogsArray.isEmpty()) {
            return null;
        }
        int size = dialogsArray.size();
        MessageObject messageObject = null;
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) dialogsArray.get(i);
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

    public boolean isFolderCell() {
        return this.currentDialogFolderId != 0;
    }

    public boolean update(int i) {
        return update(i, true);
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
        long dialogId;
        boolean zIsDialogMuted;
        boolean zIsDialogMuted2;
        boolean z8;
        TLRPC.User user;
        TLRPC.Chat chat;
        MessageObject messageObject;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.Chat chat2;
        int iDp;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        TLRPC.Chat chat4;
        TLRPC.EncryptedChat encryptedChat;
        MessageObject messageObjectFindFolderTopMessage;
        TLRPC.User user3;
        char c2;
        boolean z13;
        char c3;
        CharSequence charSequence;
        MessageObject messageObject2;
        int i3;
        int i4;
        MessageObject messageObject3;
        TLRPC.Dialog dialog;
        TLRPC.Chat chat5;
        int i5;
        int i6;
        int i7;
        int archiveUnreadCount;
        TLRPC.Chat chat6;
        ForumFormattedNames forumFormattedNames;
        TLRPC.Chat chat7;
        boolean z14;
        MessageObject messageObject4;
        long botVerificationIcon;
        TLRPC.Chat chat8;
        TLRPC.User user4;
        boolean zIsForumCell = isForumCell();
        boolean z15 = false;
        this.drawAvatarSelector = false;
        this.ttlPeriod = 0;
        CustomDialog customDialog = this.customDialog;
        if (customDialog != null) {
            this.lastMessageDate = customDialog.date;
            int i8 = customDialog.unread_count;
            this.lastUnreadState = i8 != 0;
            this.unreadCount = i8;
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
            int i9 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.thumbImage;
                if (i9 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i9].setImageBitmap((Drawable) null);
                i9++;
            }
            this.drawMonoforumAvatar = false;
            this.drawCommunityAvatar = false;
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(26.0f));
            this.drawUnmute = false;
            z2 = zIsForumCell;
            z3 = false;
            z4 = false;
        } else {
            int i10 = this.unreadCount;
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
                        ArrayList arrayList = (ArrayList) MessagesController.getInstance(this.currentAccount).dialogMessage.get(dialog2.id);
                        this.groupMessages = arrayList;
                        MessageObject messageObject5 = (arrayList == null || arrayList.size() <= 0) ? null : (MessageObject) this.groupMessages.get(0);
                        this.message = messageObject5;
                        this.lastUnreadState = messageObject5 != null && messageObject5.isUnread();
                        TLRPC.Chat chat9 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog2.id));
                        if (chat9 != null && (chat9.forum || (chat9.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat9)))) {
                            int[] forumUnreadCount = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat9.id);
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
                        if (ChatObject.isMonoForum(chat9)) {
                            this.mentionCount = 0;
                        }
                        this.markUnread = dialog2.unread_mark;
                        MessageObject messageObject6 = this.message;
                        this.currentEditDate = messageObject6 != null ? messageObject6.messageOwner.edit_date : 0;
                        this.lastMessageDate = dialog2.last_message_date;
                        int i11 = this.dialogsType;
                        if (i11 == 7 || i11 == 8) {
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
                            if (user4 == null && DialogObject.getEmojiStatusDocumentId(user4.emoji_status) != j) {
                                this.nameLayoutEllipsizeByGradient = true;
                                this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.user.emoji_status), z);
                                this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), z);
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
                            chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                            this.chat = chat8;
                            if (chat8 == null && DialogObject.getEmojiStatusDocumentId(chat8.emoji_status) != j) {
                                this.nameLayoutEllipsizeByGradient = true;
                                this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), z);
                                this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), z);
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
                        chat7 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                        if (chat7 == null && chat7.call_active && chat7.call_not_empty) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14 != this.hasCall) {
                            z13 = true;
                        }
                    }
                    if (!z13 && (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat6 = this.chat) == null || (chat6.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat6)))) {
                        forumFormattedNames = this.forumFormattedNames;
                        if (forumFormattedNames != null) {
                            forumFormattedNames.invalidateSpans();
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
                        i2 = i10;
                    } else {
                        messageObject3 = this.message;
                        if (messageObject3 != null && this.lastUnreadState != messageObject3.isUnread()) {
                            this.lastUnreadState = this.message.isUnread();
                            z13 = true;
                        }
                        if (this.isDialogCell) {
                            dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                            if (dialog == null) {
                                chat5 = null;
                            } else {
                                chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                            }
                            if (chat5 == null && (chat5.forum || (chat5.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat5)))) {
                                i2 = i10;
                                int[] forumUnreadCount2 = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat5.id);
                                int i12 = forumUnreadCount2[0];
                                int i13 = forumUnreadCount2[c3];
                                int i14 = forumUnreadCount2[c];
                                this.hasUnmutedTopics = forumUnreadCount2[3] != 0;
                                int i15 = forumUnreadCount2[c2];
                                i5 = i13;
                                i7 = i15;
                                archiveUnreadCount = i12;
                                i6 = i14;
                            } else {
                                i2 = i10;
                                if (dialog instanceof TLRPC.TL_dialogFolder) {
                                    archiveUnreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                    i5 = 0;
                                    i6 = 0;
                                    i7 = 0;
                                } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                    MessagesController.UnreadCounts communityUnreadCount2 = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog.id);
                                    archiveUnreadCount = communityUnreadCount2.unreadCount;
                                    int i16 = communityUnreadCount2.mentionCount;
                                    int i17 = communityUnreadCount2.reactionMentionCount;
                                    i7 = communityUnreadCount2.pollVotesMentionCount;
                                    this.hasUnmutedCommunityDialogs = communityUnreadCount2.hasUnmutedUnreadDialogs;
                                    i5 = i16;
                                    i6 = i17;
                                } else if (dialog != null) {
                                    archiveUnreadCount = dialog.unread_count;
                                    i5 = dialog.unread_mentions_count;
                                    i6 = dialog.unread_reactions_count;
                                    i7 = dialog.unread_poll_votes_count;
                                } else {
                                    i5 = 0;
                                    i6 = 0;
                                    i7 = 0;
                                    archiveUnreadCount = 0;
                                }
                            }
                            if (ChatObject.isMonoForum(chat5)) {
                                i5 = 0;
                            }
                            if (dialog != null && (this.unreadCount != archiveUnreadCount || this.markUnread != dialog.unread_mark || this.mentionCount != i5 || this.reactionMentionCount != i6)) {
                                this.unreadCount = archiveUnreadCount;
                                this.mentionCount = i5;
                                this.markUnread = dialog.unread_mark;
                                this.reactionMentionCount = i6;
                                this.pollVotesMentionCount = i7;
                                z13 = true;
                            }
                        } else {
                            i2 = i10;
                        }
                    }
                    if (!z13 && (i & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject2 = this.message) != null) {
                        i3 = this.lastSendState;
                        i4 = messageObject2.messageOwner.send_state;
                        if (i3 != i4) {
                            this.lastSendState = i4;
                            z13 = true;
                        }
                    }
                    if (!z13) {
                        invalidate();
                        return z3;
                    }
                    r4 = 0;
                } else {
                    i2 = i10;
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
                    } else {
                        dialogId = j;
                    }
                } else {
                    this.drawUnmute = false;
                    if (this.forumTopic != null) {
                        zIsDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, j);
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
                        if (this.isDialogCell || !MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, getTopicId())) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        this.dialogMuted = z7;
                    }
                    dialogId = this.currentDialogId;
                    j = 0;
                }
                if (dialogId != j) {
                    if (DialogObject.isEncryptedDialog(dialogId)) {
                        encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(dialogId)));
                        this.encryptedChat = encryptedChat;
                        if (encryptedChat != null) {
                            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.encryptedChat.user_id));
                        }
                    } else if (DialogObject.isUserDialog(dialogId)) {
                        this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                    } else {
                        TLRPC.Chat chat10 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                        this.chat = chat10;
                        if (!this.isDialogCell && chat10 != null && chat10.migrated_to != null && (chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.migrated_to.channel_id))) != null) {
                            this.chat = chat4;
                        }
                    }
                    if (this.useMeForMyMessages && this.user != null && this.message.isOutOwner()) {
                        this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
                    }
                }
                if (this.insideCommunityList && ChatObject.isCommunity(this.chat) && this.isDialogCell) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.drawCommunityAvatar = z8;
                if (this.currentDialogFolderId != 0) {
                    Theme.dialogs_archiveAvatarDrawable.setCallback(this);
                    this.avatarDrawable.setAvatarType(2);
                    this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                } else if (!this.useFromUserAsAvatar && (messageObject = this.message) != null) {
                    this.avatarDrawable.setInfo(this.currentAccount, messageObject.getFromPeerObject());
                    this.avatarImage.setForUserOrChat(this.message.getFromPeerObject(), this.avatarDrawable);
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
                        } else if (!UserObject.isUserSelf(this.user) && this.isSavedDialog && !this.isMonoForumTopicDialog) {
                            this.avatarDrawable.setAvatarType(22);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        } else if (!UserObject.isUserSelf(this.user) && !this.useMeForMyMessages && !this.isMonoForumTopicDialog) {
                            this.avatarDrawable.setAvatarType(1);
                            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                        } else {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        }
                    } else {
                        chat = this.chat;
                        if (chat != null) {
                            if (chat.monoforum) {
                                ForumUtilities.setMonoForumAvatar(this.currentAccount, chat, this.avatarDrawable, this.avatarImage);
                                this.avatarDrawable.setScaleSize(1.0f);
                            } else {
                                this.avatarDrawable.setInfo(this.currentAccount, chat);
                                this.avatarImage.setForUserOrChat(chat, this.avatarDrawable);
                            }
                        }
                        if (z || (i2 == this.unreadCount && z17 == this.markUnread)) {
                            z9 = z5;
                        } else {
                            if (this.isDialogCell) {
                                z9 = z5;
                                if (System.currentTimeMillis() - this.lastDialogChangedTime > 100) {
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
                                    ValueAnimator valueAnimator = this.reactionsMentionsAnimator;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    this.reactionsMentionsChangeProgress = 0.0f;
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    this.reactionsMentionsAnimator = valueAnimatorOfFloat;
                                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                        @Override
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            DialogCell.m1483$r8$lambda$4MJcpxSv6aRe2eKgPzb4WO4fgA(this.f$0, valueAnimator2);
                                        }
                                    });
                                    this.reactionsMentionsAnimator.addListener(new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animator) {
                                            DialogCell.this.reactionsMentionsChangeProgress = 1.0f;
                                            DialogCell.this.invalidate();
                                        }
                                    });
                                    if (z11) {
                                        this.reactionsMentionsAnimator.setDuration(220L);
                                        this.reactionsMentionsAnimator.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        this.reactionsMentionsAnimator.setDuration(150L);
                                        this.reactionsMentionsAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                    }
                                    this.reactionsMentionsAnimator.start();
                                }
                                if (isFolderCell() && (chat3 = this.chat) != null && chat3.monoforum) {
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
                                    chat2 = this.chat;
                                    if ((chat2 == null && chat2.forum && this.currentDialogFolderId == 0 && !this.useFromUserAsAvatar) || (!this.isSavedDialog && (user2 = this.user) != null && user2.self && MessagesController.getInstance(this.currentAccount).savedViewAsChats)) {
                                        iDp = AndroidUtilities.dp(16.0f);
                                    }
                                }
                                this.avatarImage.setRoundRadius(iDp);
                                z15 = z9;
                            } else {
                                z9 = z5;
                            }
                            ValueAnimator valueAnimator2 = this.countAnimator;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.countAnimator = valueAnimatorOfFloat2;
                            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                    DialogCell.m1484$r8$lambda$RqQBvBMWh2KGY2K5m0CRQI7VvA(this.f$0, valueAnimator3);
                                }
                            });
                            this.countAnimator.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    DialogCell.this.countChangeProgress = 1.0f;
                                    DialogCell.this.countOldLayout = null;
                                    DialogCell.this.countAnimationStableLayout = null;
                                    DialogCell.this.countAnimationInLayout = null;
                                    DialogCell.this.invalidate();
                                }
                            });
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
                                    for (int i18 = 0; i18 < str.length(); i18++) {
                                        if (str.charAt(i18) == str2.charAt(i18)) {
                                            int i19 = i18 + 1;
                                            spannableStringBuilder.setSpan(new EmptyStubSpan(), i18, i19, 0);
                                            spannableStringBuilder2.setSpan(new EmptyStubSpan(), i18, i19, 0);
                                        } else {
                                            spannableStringBuilder3.setSpan(new EmptyStubSpan(), i18, i18 + 1, 0);
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
                                chat2 = this.chat;
                                iDp = chat2 == null ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(28.0f);
                            }
                            this.avatarImage.setRoundRadius(iDp);
                            z15 = z9;
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
                            chat2 = this.chat;
                            if (chat2 == null) {
                            }
                        }
                        this.avatarImage.setRoundRadius(iDp);
                        z15 = z9;
                    }
                }
                if (z) {
                    z9 = z5;
                } else {
                    z9 = z5;
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
                    chat2 = this.chat;
                    if (chat2 == null) {
                    }
                }
                this.avatarImage.setRoundRadius(iDp);
                z15 = z9;
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
                        if (user4 == null) {
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
                        chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                        this.chat = chat8;
                        if (chat8 == null) {
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
                    chat7 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                    if (chat7 == null) {
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
                        forumFormattedNames.invalidateSpans();
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
                    i2 = i10;
                } else {
                    messageObject3 = this.message;
                    if (messageObject3 != null) {
                        this.lastUnreadState = this.message.isUnread();
                        z13 = true;
                    }
                    if (this.isDialogCell) {
                        dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                        if (dialog == null) {
                            chat5 = null;
                        } else {
                            chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                        }
                        if (chat5 == null) {
                            i2 = i10;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                archiveUnreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount3 = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog.id);
                                archiveUnreadCount = communityUnreadCount3.unreadCount;
                                int i110 = communityUnreadCount3.mentionCount;
                                int i111 = communityUnreadCount3.reactionMentionCount;
                                i7 = communityUnreadCount3.pollVotesMentionCount;
                                this.hasUnmutedCommunityDialogs = communityUnreadCount3.hasUnmutedUnreadDialogs;
                                i5 = i110;
                                i6 = i111;
                            } else if (dialog != null) {
                                archiveUnreadCount = dialog.unread_count;
                                i5 = dialog.unread_mentions_count;
                                i6 = dialog.unread_reactions_count;
                                i7 = dialog.unread_poll_votes_count;
                            } else {
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                                archiveUnreadCount = 0;
                            }
                        } else {
                            i2 = i10;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                archiveUnreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount4 = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog.id);
                                archiveUnreadCount = communityUnreadCount4.unreadCount;
                                int i112 = communityUnreadCount4.mentionCount;
                                int i113 = communityUnreadCount4.reactionMentionCount;
                                i7 = communityUnreadCount4.pollVotesMentionCount;
                                this.hasUnmutedCommunityDialogs = communityUnreadCount4.hasUnmutedUnreadDialogs;
                                i5 = i112;
                                i6 = i113;
                            } else if (dialog != null) {
                                archiveUnreadCount = dialog.unread_count;
                                i5 = dialog.unread_mentions_count;
                                i6 = dialog.unread_reactions_count;
                                i7 = dialog.unread_poll_votes_count;
                            } else {
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                                archiveUnreadCount = 0;
                            }
                        }
                        if (ChatObject.isMonoForum(chat5)) {
                            i5 = 0;
                        }
                        if (dialog != null) {
                            this.unreadCount = archiveUnreadCount;
                            this.mentionCount = i5;
                            this.markUnread = dialog.unread_mark;
                            this.reactionMentionCount = i6;
                            this.pollVotesMentionCount = i7;
                            z13 = true;
                        }
                    } else {
                        i2 = i10;
                    }
                }
                if (!z13) {
                    i3 = this.lastSendState;
                    i4 = messageObject2.messageOwner.send_state;
                    if (i3 != i4) {
                        this.lastSendState = i4;
                        z13 = true;
                    }
                }
                if (!z13) {
                    invalidate();
                    return z3;
                }
                r4 = 0;
            } else {
                i2 = i10;
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
                } else {
                    dialogId = j;
                }
            } else {
                this.drawUnmute = false;
                if (this.forumTopic != null) {
                    zIsDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, j);
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
                    if (this.isDialogCell) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    this.dialogMuted = z7;
                }
                dialogId = this.currentDialogId;
                j = 0;
            }
            if (dialogId != j) {
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(dialogId)));
                    this.encryptedChat = encryptedChat;
                    if (encryptedChat != null) {
                        this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(dialogId)) {
                    this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                } else {
                    TLRPC.Chat chat11 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialogId));
                    this.chat = chat11;
                    if (!this.isDialogCell) {
                        this.chat = chat4;
                    }
                }
                if (this.useMeForMyMessages) {
                    this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
                }
            }
            if (this.insideCommunityList) {
                z8 = false;
            } else {
                z8 = false;
            }
            this.drawCommunityAvatar = z8;
            if (this.currentDialogFolderId != 0) {
                Theme.dialogs_archiveAvatarDrawable.setCallback(this);
                this.avatarDrawable.setAvatarType(2);
                this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
            } else {
                if (!this.useFromUserAsAvatar) {
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
                            if (!UserObject.isUserSelf(this.user)) {
                                this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                            } else {
                                this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                            }
                        } else if (!UserObject.isUserSelf(this.user)) {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        } else {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        }
                    } else {
                        chat = this.chat;
                        if (chat != null) {
                            if (chat.monoforum) {
                                ForumUtilities.setMonoForumAvatar(this.currentAccount, chat, this.avatarDrawable, this.avatarImage);
                                this.avatarDrawable.setScaleSize(1.0f);
                            } else {
                                this.avatarDrawable.setInfo(this.currentAccount, chat);
                                this.avatarImage.setForUserOrChat(chat, this.avatarDrawable);
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
                            if (!UserObject.isUserSelf(this.user)) {
                                this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                            } else {
                                this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                            }
                        } else if (!UserObject.isUserSelf(this.user)) {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        } else {
                            this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                        }
                    } else {
                        chat = this.chat;
                        if (chat != null) {
                            if (chat.monoforum) {
                                ForumUtilities.setMonoForumAvatar(this.currentAccount, chat, this.avatarDrawable, this.avatarImage);
                                this.avatarDrawable.setScaleSize(1.0f);
                            } else {
                                this.avatarDrawable.setInfo(this.currentAccount, chat);
                                this.avatarImage.setForUserOrChat(chat, this.avatarDrawable);
                            }
                        }
                    }
                }
                if (z) {
                    z9 = z5;
                } else {
                    z9 = z5;
                }
                BoolAnimator boolAnimator5 = this.animatorPollVotesMentionVisible;
                if (this.pollVotesMentionCount != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolAnimator5.setValue(z10, z);
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
                    chat2 = this.chat;
                    if (chat2 == null) {
                    }
                }
                this.avatarImage.setRoundRadius(iDp);
                z15 = z9;
            }
            if (z) {
                z9 = z5;
            } else {
                z9 = z5;
            }
            BoolAnimator boolAnimator6 = this.animatorPollVotesMentionVisible;
            if (this.pollVotesMentionCount != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolAnimator6.setValue(z10, z);
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
                chat2 = this.chat;
                if (chat2 == null) {
                }
            }
            this.avatarImage.setRoundRadius(iDp);
            z15 = z9;
        }
        if (!this.isTopic && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z4 = true;
        }
        if (!z15) {
            int i20 = this.storyParams.currentState;
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
        boolean z18 = isForumCell() != z2 ? true : z3;
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

    public static void m1484$r8$lambda$RqQBvBMWh2KGY2K5m0CRQI7VvA(DialogCell dialogCell, ValueAnimator valueAnimator) {
        dialogCell.getClass();
        dialogCell.countChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogCell.invalidate();
    }

    public static void m1483$r8$lambda$4MJcpxSv6aRe2eKgPzb4WO4fgA(DialogCell dialogCell, ValueAnimator valueAnimator) {
        dialogCell.getClass();
        dialogCell.reactionsMentionsChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogCell.invalidate();
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.forumTopic;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    @Override
    public float getTranslationX() {
        return this.translationX;
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

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int color;
        int color2;
        int i;
        String string;
        int i2;
        int i3;
        String str;
        float measuredWidth;
        int i4;
        float f4;
        boolean z;
        int measuredHeight;
        int intrinsicWidth;
        int intrinsicHeight;
        int i5;
        float f5;
        String str2;
        float f6;
        String str3;
        int iCeil;
        int i6;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        float f7;
        RLottieDrawable rLottieDrawable;
        float f8;
        float f9;
        float f10;
        DialogCell dialogCell;
        int i7;
        float f11;
        boolean z2;
        boolean z3;
        float f12;
        boolean z4;
        DialogCell dialogCell2;
        float f13;
        Canvas canvas2;
        boolean z5;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i8;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        int color3;
        int iDp;
        int alpha;
        float f30;
        float measuredHeight2;
        TLRPC.TL_forumTopic tL_forumTopic;
        StoriesUtilities.AvatarStoryParams avatarStoryParams;
        boolean z6;
        boolean z7;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        int i9;
        boolean z8;
        int i10;
        float f31;
        int i11;
        int i12;
        float f32;
        DialogCell dialogCell3;
        boolean z9;
        float f33;
        ScamDrawable scamDrawable;
        ScamDrawable scamDrawable2;
        float f34;
        int iDp2;
        boolean z10;
        float floatValue;
        boolean zIsCounterMuted;
        float f35;
        Drawable drawable;
        Drawable drawable2;
        Paint paint;
        int i13;
        DialogCellTags dialogCellTags;
        int i14;
        float f36;
        int i15;
        RectF rectF;
        Path path;
        float fDp;
        float f37;
        float f38;
        float f39;
        float f40;
        int i16;
        float f41;
        float f42;
        float fDp2;
        float f43;
        float f44;
        float f45;
        float f46;
        int iDp3;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i21;
        int i22;
        int i23;
        boolean z15;
        boolean z16;
        boolean z17;
        int i24;
        int i25;
        int i26;
        int i27;
        RectF rectF2;
        float fDp3;
        float f47;
        DialogUpdateHelper dialogUpdateHelper;
        float fDp4;
        StaticLayout staticLayout2;
        int i28;
        StatusDrawable chatStatusDrawable;
        DialogUpdateHelper dialogUpdateHelper2;
        float fDp5;
        int iDp4;
        float f48;
        DialogUpdateHelper dialogUpdateHelper3;
        float f49;
        int i29;
        Drawable drawable3;
        CustomDialog customDialog;
        float f50;
        int iSaveLayerAlpha;
        DialogsActivity dialogsActivity;
        RightSlidingDialogContainer rightSlidingDialogContainer;
        TLRPC.TL_forumTopic tL_forumTopic3;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final DialogCell dialogCell4 = this;
        Canvas canvas3 = canvas;
        float f51 = 12.5f;
        if (!(dialogCell4.currentDialogId == 0 && dialogCell4.customDialog == null) && dialogCell4.visibleOnScreen) {
            boolean z18 = dialogCell4.drawArchive;
            if (z18 && ((dialogCell4.currentDialogFolderId != 0 || (dialogCell4.isTopic && (tL_forumTopic4 = dialogCell4.forumTopic) != null && tL_forumTopic4.id == 1)) && (pullForegroundDrawable2 = dialogCell4.archivedChatsDrawable) != null && pullForegroundDrawable2.outProgress == 0.0f && dialogCell4.translationX == 0.0f)) {
                canvas3.save();
                canvas3.translate(0.0f, (-dialogCell4.translateY) - dialogCell4.rightFragmentOffset);
                canvas3.clipRect(0.0f, dialogCell4.getMeasuredHeight() * (1.0f - dialogCell4.archivedChatsDrawable.getPullProgress()), dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                dialogCell4.archivedChatsDrawable.draw(canvas3);
                canvas3.restore();
                dialogCell4.emojiStatusView.setVisibility(4);
                return;
            }
            boolean z19 = z18 && (dialogCell4.currentDialogFolderId != 0 || (dialogCell4.isTopic && (tL_forumTopic3 = dialogCell4.forumTopic) != null && tL_forumTopic3.id == 1)) && dialogCell4.archivedChatsDrawable != null && dialogCell4.translationX == 0.0f && (dialogsActivity = dialogCell4.parentFragment) != null && dialogsActivity.hasHiddenArchive() && ((rightSlidingDialogContainer = dialogCell4.parentFragment.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment());
            PullForegroundDrawable pullForegroundDrawable3 = dialogCell4.archivedChatsDrawable;
            float pullProgress = pullForegroundDrawable3 != null ? pullForegroundDrawable3.getPullProgress() : 1.0f;
            if (z19) {
                canvas3.save();
                f = 74.0f;
                canvas3.clipRect(0.0f, dialogCell4.getMeasuredHeight() * (1.0f - pullProgress), dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
            } else {
                f = 74.0f;
            }
            if (dialogCell4.clipProgress == 0.0f || Build.VERSION.SDK_INT == 24) {
                f2 = 1.0f;
            } else {
                canvas3.save();
                f2 = 1.0f;
                canvas3.clipRect(0.0f, dialogCell4.topClip * dialogCell4.clipProgress, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight() - ((int) (dialogCell4.bottomClip * dialogCell4.clipProgress)));
            }
            if (dialogCell4.translationX != 0.0f || dialogCell4.cornerProgress != 0.0f) {
                canvas3.save();
                canvas3.translate(0.0f, -dialogCell4.translateY);
                if (dialogCell4.overrideSwipeAction) {
                    color = Theme.getColor(dialogCell4.overrideSwipeActionBackgroundColorKey, dialogCell4.resourcesProvider);
                    color2 = Theme.getColor(dialogCell4.overrideSwipeActionRevealBackgroundColorKey, dialogCell4.resourcesProvider);
                    String str4 = dialogCell4.overrideSwipeActionStringKey;
                    f3 = 4.0f;
                    i = dialogCell4.overrideSwipeActionStringId;
                    string = LocaleController.getString(str4, i);
                    dialogCell4.translationDrawable = dialogCell4.overrideSwipeActionDrawable;
                } else {
                    f3 = 4.0f;
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
                        } else if (SharedConfig.getChatSwipeAction(dialogCell4.currentAccount) == 0) {
                            if (dialogCell4.getIsPinned()) {
                                i = R.string.SwipeUnpin;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipeUnpinDrawable;
                            } else {
                                i = R.string.SwipePin;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipePinDrawable;
                            }
                        } else {
                            i = R.string.Archive;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_archiveDrawable;
                        }
                        i3 = i;
                        str = string;
                        if (!dialogCell4.swipeCanceled && (rLottieDrawable = dialogCell4.lastDrawTranslationDrawable) != null) {
                            dialogCell4.translationDrawable = rLottieDrawable;
                            i3 = dialogCell4.lastDrawSwipeMessageStringId;
                        } else {
                            dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                            dialogCell4.lastDrawSwipeMessageStringId = i3;
                        }
                        if (!dialogCell4.translationAnimationStarted && Math.abs(dialogCell4.translationX) > AndroidUtilities.dp(43.0f)) {
                            dialogCell4.translationAnimationStarted = true;
                            dialogCell4.translationDrawable.setProgress(0.0f);
                            dialogCell4.translationDrawable.setCallback(dialogCell4);
                            dialogCell4.translationDrawable.start();
                        }
                        measuredWidth = dialogCell4.getMeasuredWidth() + dialogCell4.translationX;
                        if (dialogCell4.currentRevealProgress < f2) {
                            Theme.dialogs_pinnedPaint.setColor(color);
                            i4 = i3;
                            f4 = measuredWidth;
                            z = true;
                            canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                            if (dialogCell4.currentRevealProgress == 0.0f) {
                                if (Theme.dialogs_archiveDrawableRecolored) {
                                    Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                                    Theme.dialogs_archiveDrawableRecolored = false;
                                }
                                if (Theme.dialogs_hidePsaDrawableRecolored) {
                                    Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                                    RLottieDrawable rLottieDrawable2 = Theme.dialogs_hidePsaDrawable;
                                    int i30 = Theme.key_chats_archiveBackground;
                                    rLottieDrawable2.setLayerColor("Line 1", Theme.getNonAnimatedColor(i30));
                                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i30));
                                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i30));
                                    Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                                    Theme.dialogs_hidePsaDrawableRecolored = false;
                                }
                            }
                        } else {
                            i4 = i3;
                            f4 = measuredWidth;
                            z = true;
                        }
                        int measuredWidth2 = (dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.translationDrawable.getIntrinsicWidth() / 2);
                        measuredHeight = (dialogCell4.getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
                        intrinsicWidth = (dialogCell4.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
                        intrinsicHeight = (dialogCell4.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight;
                        if (dialogCell4.currentRevealProgress > 0.0f) {
                            canvas3.save();
                            i5 = i4;
                            str2 = str;
                            canvas3.clipRect(f4 - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                            Theme.dialogs_pinnedPaint.setColor(i2);
                            f5 = f4;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, ((float) Math.sqrt((intrinsicWidth * intrinsicWidth) + ((intrinsicHeight - dialogCell4.getMeasuredHeight()) * (intrinsicHeight - dialogCell4.getMeasuredHeight())))) * AndroidUtilities.accelerateInterpolator.getInterpolation(dialogCell4.currentRevealProgress), Theme.dialogs_pinnedPaint);
                            canvas3.restore();
                            if (!Theme.dialogs_archiveDrawableRecolored) {
                                Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                                Theme.dialogs_archiveDrawableRecolored = z;
                            }
                            if (!Theme.dialogs_hidePsaDrawableRecolored) {
                                Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                                RLottieDrawable rLottieDrawable3 = Theme.dialogs_hidePsaDrawable;
                                int i31 = Theme.key_chats_archivePinBackground;
                                rLottieDrawable3.setLayerColor("Line 1", Theme.getNonAnimatedColor(i31));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i31));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i31));
                                Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                                Theme.dialogs_hidePsaDrawableRecolored = z;
                            }
                        } else {
                            i5 = i4;
                            f5 = f4;
                            str2 = str;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, measuredHeight);
                        f6 = dialogCell4.currentRevealBounceProgress;
                        if (f6 != 0.0f && f6 != f2) {
                            float interpolation = dialogCell4.interpolator.getInterpolation(f6) + f2;
                            canvas3.scale(interpolation, interpolation, dialogCell4.translationDrawable.getIntrinsicWidth() / 2, dialogCell4.translationDrawable.getIntrinsicHeight() / 2);
                        }
                        BaseCell.setDrawableBounds((Drawable) dialogCell4.translationDrawable, 0, 0);
                        dialogCell4.translationDrawable.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f5, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                        str3 = str2;
                        iCeil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str3));
                        i6 = i5;
                        if (dialogCell4.swipeMessageTextId == i6 || dialogCell4.swipeMessageWidth != dialogCell4.getMeasuredWidth()) {
                            dialogCell4.swipeMessageTextId = i6;
                            dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                            TextPaint textPaint = Theme.dialogs_archiveTextPaint;
                            int iMin = Math.min(AndroidUtilities.dp(80.0f), iCeil);
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str3, textPaint, iMin, alignment, 1.0f, 0.0f, false);
                            dialogCell4.swipeMessageTextLayout = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                dialogCell4.swipeMessageTextLayout = new StaticLayout(str3, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), iCeil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (dialogCell4.swipeMessageTextLayout != null) {
                            canvas3.save();
                            if (dialogCell4.swipeMessageTextLayout.getLineCount() > 1) {
                                f7 = -AndroidUtilities.dp(f3);
                            } else {
                                f7 = 0.0f;
                            }
                            canvas3.translate((dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.swipeMessageTextLayout.getWidth() / 2.0f), measuredHeight + AndroidUtilities.dp(36.0f) + f7);
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
                i3 = i;
                str = string;
                if (!dialogCell4.swipeCanceled) {
                    dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                    dialogCell4.lastDrawSwipeMessageStringId = i3;
                } else {
                    dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                    dialogCell4.lastDrawSwipeMessageStringId = i3;
                }
                if (!dialogCell4.translationAnimationStarted) {
                    dialogCell4.translationAnimationStarted = true;
                    dialogCell4.translationDrawable.setProgress(0.0f);
                    dialogCell4.translationDrawable.setCallback(dialogCell4);
                    dialogCell4.translationDrawable.start();
                }
                measuredWidth = dialogCell4.getMeasuredWidth() + dialogCell4.translationX;
                if (dialogCell4.currentRevealProgress < f2) {
                    Theme.dialogs_pinnedPaint.setColor(color);
                    i4 = i3;
                    f4 = measuredWidth;
                    z = true;
                    canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                    if (dialogCell4.currentRevealProgress == 0.0f) {
                        if (Theme.dialogs_archiveDrawableRecolored) {
                            Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                            Theme.dialogs_archiveDrawableRecolored = false;
                        }
                        if (Theme.dialogs_hidePsaDrawableRecolored) {
                            Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                            RLottieDrawable rLottieDrawable4 = Theme.dialogs_hidePsaDrawable;
                            int i32 = Theme.key_chats_archiveBackground;
                            rLottieDrawable4.setLayerColor("Line 1", Theme.getNonAnimatedColor(i32));
                            Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i32));
                            Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i32));
                            Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                            Theme.dialogs_hidePsaDrawableRecolored = false;
                        }
                    }
                } else {
                    i4 = i3;
                    f4 = measuredWidth;
                    z = true;
                }
                int measuredWidth3 = (dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.translationDrawable.getIntrinsicWidth() / 2);
                measuredHeight = (dialogCell4.getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
                intrinsicWidth = (dialogCell4.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth3;
                intrinsicHeight = (dialogCell4.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight;
                if (dialogCell4.currentRevealProgress > 0.0f) {
                    canvas3.save();
                    i5 = i4;
                    str2 = str;
                    canvas3.clipRect(f4 - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                    Theme.dialogs_pinnedPaint.setColor(i2);
                    f5 = f4;
                    canvas3.drawCircle(intrinsicWidth, intrinsicHeight, ((float) Math.sqrt((intrinsicWidth * intrinsicWidth) + ((intrinsicHeight - dialogCell4.getMeasuredHeight()) * (intrinsicHeight - dialogCell4.getMeasuredHeight())))) * AndroidUtilities.accelerateInterpolator.getInterpolation(dialogCell4.currentRevealProgress), Theme.dialogs_pinnedPaint);
                    canvas3.restore();
                    if (!Theme.dialogs_archiveDrawableRecolored) {
                        Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                        Theme.dialogs_archiveDrawableRecolored = z;
                    }
                    if (!Theme.dialogs_hidePsaDrawableRecolored) {
                        Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                        RLottieDrawable rLottieDrawable5 = Theme.dialogs_hidePsaDrawable;
                        int i33 = Theme.key_chats_archivePinBackground;
                        rLottieDrawable5.setLayerColor("Line 1", Theme.getNonAnimatedColor(i33));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i33));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i33));
                        Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                        Theme.dialogs_hidePsaDrawableRecolored = z;
                    }
                } else {
                    i5 = i4;
                    f5 = f4;
                    str2 = str;
                }
                canvas3.save();
                canvas3.translate(measuredWidth3, measuredHeight);
                f6 = dialogCell4.currentRevealBounceProgress;
                if (f6 != 0.0f) {
                    float interpolation2 = dialogCell4.interpolator.getInterpolation(f6) + f2;
                    canvas3.scale(interpolation2, interpolation2, dialogCell4.translationDrawable.getIntrinsicWidth() / 2, dialogCell4.translationDrawable.getIntrinsicHeight() / 2);
                }
                BaseCell.setDrawableBounds((Drawable) dialogCell4.translationDrawable, 0, 0);
                dialogCell4.translationDrawable.draw(canvas3);
                canvas3.restore();
                canvas3.clipRect(f5, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                str3 = str2;
                iCeil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str3));
                i6 = i5;
                if (dialogCell4.swipeMessageTextId == i6) {
                    dialogCell4.swipeMessageTextId = i6;
                    dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                    TextPaint textPaint2 = Theme.dialogs_archiveTextPaint;
                    int iMin2 = Math.min(AndroidUtilities.dp(80.0f), iCeil);
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    staticLayout = new StaticLayout(str3, textPaint2, iMin2, alignment, 1.0f, 0.0f, false);
                    dialogCell4.swipeMessageTextLayout = staticLayout;
                    if (staticLayout.getLineCount() > 1) {
                        dialogCell4.swipeMessageTextLayout = new StaticLayout(str3, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), iCeil), alignment, 1.0f, 0.0f, false);
                    }
                } else {
                    dialogCell4.swipeMessageTextId = i6;
                    dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                    TextPaint textPaint3 = Theme.dialogs_archiveTextPaint;
                    int iMin3 = Math.min(AndroidUtilities.dp(80.0f), iCeil);
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    staticLayout = new StaticLayout(str3, textPaint3, iMin3, alignment, 1.0f, 0.0f, false);
                    dialogCell4.swipeMessageTextLayout = staticLayout;
                    if (staticLayout.getLineCount() > 1) {
                        dialogCell4.swipeMessageTextLayout = new StaticLayout(str3, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), iCeil), alignment, 1.0f, 0.0f, false);
                    }
                }
                if (dialogCell4.swipeMessageTextLayout != null) {
                    canvas3.save();
                    if (dialogCell4.swipeMessageTextLayout.getLineCount() > 1) {
                        f7 = -AndroidUtilities.dp(f3);
                    } else {
                        f7 = 0.0f;
                    }
                    canvas3.translate((dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.swipeMessageTextLayout.getWidth() / 2.0f), measuredHeight + AndroidUtilities.dp(36.0f) + f7);
                    dialogCell4.swipeMessageTextLayout.draw(canvas3);
                    canvas3.restore();
                }
                canvas3.restore();
            } else {
                RLottieDrawable rLottieDrawable6 = dialogCell4.translationDrawable;
                if (rLottieDrawable6 != null) {
                    rLottieDrawable6.stop();
                    dialogCell4.translationDrawable.setProgress(0.0f);
                    dialogCell4.translationDrawable.setCallback(null);
                    dialogCell4.translationDrawable = null;
                    dialogCell4.translationAnimationStarted = false;
                }
                f3 = 4.0f;
            }
            if (dialogCell4.translationX != 0.0f) {
                canvas3.save();
                canvas3.translate(dialogCell4.translationX, 0.0f);
                f8 = dialogCell4.translationX + 0.0f;
            } else {
                f8 = 0.0f;
            }
            float fDp6 = AndroidUtilities.dp(8.0f) * dialogCell4.cornerProgress;
            if (dialogCell4.isSelected) {
                f9 = 0.0f;
                dialogCell4.rect.set(0.0f, 0.0f, dialogCell4.getMeasuredWidth(), AndroidUtilities.lerp(dialogCell4.getMeasuredHeight(), dialogCell4.getCollapsedHeight(), dialogCell4.rightFragmentOpenedProgress));
                dialogCell4.rect.offset(0.0f, (-dialogCell4.translateY) + dialogCell4.collapseOffset);
                canvas3.drawRoundRect(dialogCell4.rect, fDp6, fDp6, Theme.dialogs_tabletSeletedPaint);
            } else {
                f9 = 0.0f;
            }
            canvas3.save();
            canvas3.translate(f9, (-dialogCell4.rightFragmentOffset) * dialogCell4.rightFragmentOpenedProgress);
            if (dialogCell4.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || dialogCell4.archiveBackgroundProgress != f9)) {
                Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider), dialogCell4.archiveBackgroundProgress, 1.0f));
                Paint paint2 = Theme.dialogs_pinnedPaint;
                paint2.setAlpha((int) (paint2.getAlpha() * (1.0f - dialogCell4.rightFragmentOpenedProgress)));
            } else if (dialogCell4.getIsPinned() || dialogCell4.drawPinBackground) {
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider));
                Paint paint3 = Theme.dialogs_pinnedPaint;
                paint3.setAlpha((int) (paint3.getAlpha() * (1.0f - dialogCell4.rightFragmentOpenedProgress)));
            }
            canvas3.restore();
            dialogCell4.updateHelper.updateAnimationValues();
            if (dialogCell4.collapseOffset != 0.0f) {
                canvas3.save();
                canvas3.translate(0.0f, dialogCell4.collapseOffset);
                f10 = 0.0f + dialogCell4.collapseOffset;
            } else {
                f10 = 0.0f;
            }
            float f52 = dialogCell4.rightFragmentOpenedProgress;
            if (f52 != 1.0f) {
                if (f52 != 0.0f) {
                    float fClamp = Utilities.clamp(f52 / 0.4f, 1.0f, 0.0f);
                    if (SharedConfig.getDevicePerformanceClass() >= 2) {
                        iSaveLayerAlpha = canvas3.saveLayerAlpha(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - fClamp)), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), (int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * 255.0f), 31);
                        f50 = 0.0f;
                    } else {
                        int iSave = canvas3.save();
                        f50 = 0.0f;
                        canvas3.clipRect(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - fClamp)), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                        iSaveLayerAlpha = iSave;
                    }
                    canvas3.translate((-(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(f))) * 0.7f * dialogCell4.rightFragmentOpenedProgress, f50);
                    f8 += (-(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(f))) * 0.7f * dialogCell4.rightFragmentOpenedProgress;
                    i9 = iSaveLayerAlpha;
                } else {
                    i9 = -1;
                }
                float f53 = f8;
                if (dialogCell4.translationX != 0.0f || dialogCell4.cornerProgress != 0.0f) {
                    canvas3.save();
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell4.resourcesProvider));
                    dialogCell4.rect.set(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                    dialogCell4.rect.offset(0.0f, -dialogCell4.translateY);
                    canvas3.drawRoundRect(dialogCell4.rect, fDp6, fDp6, Theme.dialogs_pinnedPaint);
                    if (dialogCell4.isSelected) {
                        canvas3.drawRoundRect(dialogCell4.rect, fDp6, fDp6, Theme.dialogs_tabletSeletedPaint);
                    }
                    if (dialogCell4.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || dialogCell4.archiveBackgroundProgress != 0.0f)) {
                        Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider), dialogCell4.archiveBackgroundProgress, 1.0f));
                        Paint paint4 = Theme.dialogs_pinnedPaint;
                        paint4.setAlpha((int) (paint4.getAlpha() * (1.0f - dialogCell4.rightFragmentOpenedProgress)));
                    } else if (dialogCell4.getIsPinned() || dialogCell4.drawPinBackground) {
                        Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider));
                        Paint paint5 = Theme.dialogs_pinnedPaint;
                        paint5.setAlpha((int) (paint5.getAlpha() * (1.0f - dialogCell4.rightFragmentOpenedProgress)));
                    }
                    canvas3.restore();
                }
                if (dialogCell4.translationX != 0.0f) {
                    float f54 = dialogCell4.cornerProgress;
                    if (f54 < 1.0f) {
                        float f55 = f54 + 0.10666667f;
                        dialogCell4.cornerProgress = f55;
                        if (f55 > 1.0f) {
                            dialogCell4.cornerProgress = 1.0f;
                        }
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                } else {
                    float f56 = dialogCell4.cornerProgress;
                    if (f56 > 0.0f) {
                        float f57 = f56 - 0.10666667f;
                        dialogCell4.cornerProgress = f57;
                        if (f57 < 0.0f) {
                            dialogCell4.cornerProgress = 0.0f;
                        }
                        z8 = true;
                    } else {
                        z8 = false;
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
                    if (dialogCell4.nameLayoutEllipsizeByGradient && !dialogCell4.nameLayoutFits) {
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
                        canvas3.saveLayerAlpha(0.0f, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), 255, 31);
                        int i34 = dialogCell4.nameLeft;
                        canvas3.clipRect(i34, 0, dialogCell4.nameWidth + i34, dialogCell4.getMeasuredHeight());
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
                    SpoilerEffect.layoutDrawMaybe(dialogCell4.nameLayout, canvas3);
                    StaticLayout staticLayout3 = dialogCell4.nameLayout;
                    i11 = -1;
                    i10 = i9;
                    i7 = 2;
                    f31 = 0.0f;
                    f11 = 10.0f;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout3, dialogCell4.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(0, staticLayout3.getPaint().getColor()));
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
                    i10 = i9;
                    i7 = 2;
                    f31 = 0.0f;
                    i11 = -1;
                    f11 = 10.0f;
                }
                if (dialogCell4.timeLayout != null && dialogCell4.currentDialogFolderId == 0) {
                    canvas3.save();
                    canvas3.translate(dialogCell4.timeLeft, dialogCell4.timeTop);
                    TextPaint timeTextPaint = dialogCell4.getTimeTextPaint();
                    if (dialogCell4.getIsPinned()) {
                        canvas3.translate(AndroidUtilities.dp(20.0f), f31);
                        float height = (dialogCell4.timeLayout.getHeight() / 2.0f) - AndroidUtilities.dp(8.5f);
                        float f58 = -AndroidUtilities.dp(20.0f);
                        float width = dialogCell4.timeLayout.getWidth() + AndroidUtilities.dp(6.0f);
                        if (dialogCell4.drawCount && !dialogCell4.isCounterMuted()) {
                            drawable3 = Theme.dialogs_pinnedDrawable2Accent;
                        } else {
                            drawable3 = Theme.dialogs_pinnedDrawable2;
                        }
                        int iDp6 = (int) (((AndroidUtilities.dp(17.0f) - drawable3.getIntrinsicHeight()) / 2.0f) + height);
                        int iDp7 = ((int) f58) + AndroidUtilities.dp(f3);
                        drawable3.setBounds(iDp7, iDp6, drawable3.getIntrinsicWidth() + iDp7, drawable3.getIntrinsicHeight() + iDp6);
                        int alpha2 = timeTextPaint.getAlpha();
                        timeTextPaint.setAlpha(27);
                        canvas3.drawRoundRect(f58, height, width, AndroidUtilities.dp(17.0f) + height, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                        timeTextPaint.setAlpha(alpha2);
                        drawable3.draw(canvas3);
                    }
                    int color7 = dialogCell4.timeLayout.getPaint().getColor();
                    boolean z20 = color7 != timeTextPaint.getColor();
                    if (z20) {
                        dialogCell4.timeLayout.getPaint().setColor(timeTextPaint.getColor());
                    }
                    SpoilerEffect.layoutDrawMaybe(dialogCell4.timeLayout, canvas3);
                    if (z20) {
                        dialogCell4.timeLayout.getPaint().setColor(color7);
                    }
                    canvas3.restore();
                }
                if (dialogCell4.drawLock2()) {
                    Theme.dialogs_lock2Drawable.setBounds(dialogCell4.lock2Left, dialogCell4.timeTop + ((dialogCell4.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i7), dialogCell4.lock2Left + Theme.dialogs_lock2Drawable.getIntrinsicWidth(), dialogCell4.timeTop + ((dialogCell4.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i7) + Theme.dialogs_lock2Drawable.getIntrinsicHeight());
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
                        SpoilerEffect.layoutDrawMaybe(dialogCell4.messageNameLayout, canvas3);
                        StaticLayout staticLayout4 = dialogCell4.messageNameLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout4, dialogCell4.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(1, staticLayout4.getPaint().getColor()));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    canvas3.restore();
                }
                if (dialogCell4.messageLayout != null) {
                    if (dialogCell4.currentDialogFolderId != 0) {
                        if (dialogCell4.chat != null) {
                            TextPaint textPaint10 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                            int color11 = Theme.getColor(Theme.key_chats_nameMessageArchived, dialogCell4.resourcesProvider);
                            textPaint10.linkColor = color11;
                            textPaint10.setColor(color11);
                        } else {
                            TextPaint textPaint11 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                            int color12 = Theme.getColor(Theme.key_chats_messageArchived, dialogCell4.resourcesProvider);
                            textPaint11.linkColor = color12;
                            textPaint11.setColor(color12);
                        }
                    } else {
                        TextPaint textPaint12 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                        int color13 = Theme.getColor(Theme.key_chats_message, dialogCell4.resourcesProvider);
                        textPaint12.linkColor = color13;
                        textPaint12.setColor(color13);
                    }
                    float fDp7 = AndroidUtilities.dp(14.0f);
                    DialogUpdateHelper dialogUpdateHelper4 = dialogCell4.updateHelper;
                    if (dialogUpdateHelper4.typingOutToTop) {
                        fDp3 = dialogCell4.messageTop - (dialogUpdateHelper4.typingProgres * fDp7);
                    } else {
                        fDp3 = dialogCell4.messageTop + (dialogUpdateHelper4.typingProgres * fDp7);
                    }
                    if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                        fDp3 -= AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f);
                    }
                    if (dialogCell4.updateHelper.typingProgres != 1.0f) {
                        canvas3.save();
                        canvas3.translate(dialogCell4.messageLeft, fDp3);
                        int alpha3 = dialogCell4.messageLayout.getPaint().getAlpha();
                        dialogCell4.messageLayout.getPaint().setAlpha((int) (alpha3 * (1.0f - dialogCell4.updateHelper.typingProgres)));
                        if (!dialogCell4.spoilers.isEmpty()) {
                            try {
                                canvas3.save();
                                SpoilerEffect.clipOutCanvas(canvas3, dialogCell4.spoilers);
                                SpoilerEffect.layoutDrawMaybe(dialogCell4.messageLayout, canvas3);
                                try {
                                    StaticLayout staticLayout5 = dialogCell4.messageLayout;
                                    try {
                                        try {
                                            f47 = fDp7;
                                            i29 = alpha3;
                                            f32 = 0.0f;
                                            try {
                                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout5, dialogCell4.animatedEmojiStack, -0.075f, dialogCell4.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(i7, staticLayout5.getPaint().getColor()));
                                                canvas3.restore();
                                                for (int i35 = 0; i35 < dialogCell4.spoilers.size(); i35++) {
                                                    SpoilerEffect spoilerEffect = (SpoilerEffect) dialogCell4.spoilers.get(i35);
                                                    spoilerEffect.setColor(dialogCell4.messageLayout.getPaint().getColor());
                                                    spoilerEffect.draw(canvas3);
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                FileLog.e(e);
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            f47 = fDp7;
                                            i29 = alpha3;
                                            f32 = 0.0f;
                                            FileLog.e(e);
                                            dialogCell4.messageLayout.getPaint().setAlpha(i29);
                                            canvas3.restore();
                                            canvas3.save();
                                            dialogUpdateHelper = dialogCell4.updateHelper;
                                            if (dialogUpdateHelper.typingOutToTop) {
                                                fDp4 = dialogCell4.messageTop + ((1.0f - dialogUpdateHelper.typingProgres) * f47);
                                            } else {
                                                fDp4 = dialogCell4.messageTop - ((1.0f - dialogUpdateHelper.typingProgres) * f47);
                                            }
                                            if (dialogCell4.useForceThreeLines) {
                                                if (dialogCell4.isForumCell()) {
                                                    f49 = 10.0f;
                                                } else {
                                                    f49 = 11.0f;
                                                }
                                                fDp4 -= AndroidUtilities.dp(f49);
                                            } else {
                                                if (dialogCell4.isForumCell()) {
                                                    f49 = 10.0f;
                                                } else {
                                                    f49 = 11.0f;
                                                }
                                                fDp4 -= AndroidUtilities.dp(f49);
                                            }
                                            canvas3.translate(dialogCell4.typingLeft, fDp4);
                                            staticLayout2 = dialogCell4.typingLayout;
                                            if (staticLayout2 != null) {
                                                int alpha4 = staticLayout2.getPaint().getAlpha();
                                                dialogCell4.typingLayout.getPaint().setAlpha((int) (alpha4 * dialogCell4.updateHelper.typingProgres));
                                                dialogCell4.typingLayout.draw(canvas3);
                                                dialogCell4.typingLayout.getPaint().setAlpha(alpha4);
                                            }
                                            canvas3.restore();
                                            if (dialogCell4.typingLayout == null) {
                                                i12 = 4;
                                            } else {
                                                i28 = dialogCell4.printingStringType;
                                                if (i28 < 0) {
                                                    dialogUpdateHelper3 = dialogCell4.updateHelper;
                                                    if (dialogUpdateHelper3.typingProgres > f32) {
                                                    }
                                                    i12 = 4;
                                                } else {
                                                    if (i28 < 0) {
                                                        i28 = dialogCell4.updateHelper.lastKnownTypingType;
                                                    }
                                                    chatStatusDrawable = Theme.getChatStatusDrawable(i28);
                                                    if (chatStatusDrawable != null) {
                                                        canvas3.save();
                                                        int color14 = Theme.getColor(Theme.key_chats_actionMessage);
                                                        chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(color14, (int) (Color.alpha(color14) * dialogCell4.updateHelper.typingProgres)));
                                                        dialogUpdateHelper2 = dialogCell4.updateHelper;
                                                        if (dialogUpdateHelper2.typingOutToTop) {
                                                            fDp5 = dialogCell4.messageTop + ((1.0f - dialogUpdateHelper2.typingProgres) * f47);
                                                        } else {
                                                            fDp5 = dialogCell4.messageTop - ((1.0f - dialogUpdateHelper2.typingProgres) * f47);
                                                        }
                                                        if (dialogCell4.useForceThreeLines) {
                                                            if (dialogCell4.isForumCell()) {
                                                                f48 = 10.0f;
                                                            } else {
                                                                f48 = 11.0f;
                                                            }
                                                            fDp5 -= AndroidUtilities.dp(f48);
                                                        } else {
                                                            if (dialogCell4.isForumCell()) {
                                                                f48 = 10.0f;
                                                            } else {
                                                                f48 = 11.0f;
                                                            }
                                                            fDp5 -= AndroidUtilities.dp(f48);
                                                        }
                                                        i12 = 4;
                                                        if (i28 != 1) {
                                                            float f59 = dialogCell4.statusDrawableLeft;
                                                            if (i28 == 1) {
                                                                iDp4 = AndroidUtilities.dp(1.0f);
                                                            } else {
                                                                iDp4 = 0;
                                                            }
                                                            canvas3.translate(f59, fDp5 + iDp4);
                                                        } else {
                                                            float f510 = dialogCell4.statusDrawableLeft;
                                                            if (i28 == 1) {
                                                                iDp4 = AndroidUtilities.dp(1.0f);
                                                            } else {
                                                                iDp4 = 0;
                                                            }
                                                            canvas3.translate(f510, fDp5 + iDp4);
                                                        }
                                                        chatStatusDrawable.draw(canvas3);
                                                        dialogCell4.invalidate();
                                                        canvas3.restore();
                                                    } else {
                                                        i12 = 4;
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
                                                    canvasButton.setDelegate(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            DialogCell.$r8$lambda$Bm6dPIvEl1CBIJ0rkgFJeuc8aDc(this.f$0);
                                                        }
                                                    });
                                                    dialogCell4.canvasButton.setLongPress(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            DialogCell.$r8$lambda$es4jnDRNX4B_rZRqrp8h9ARVsrg(this.f$0);
                                                        }
                                                    });
                                                }
                                                if (dialogCell4.lastTopicMessageUnread) {
                                                    CanvasButton canvasButton2 = dialogCell4.canvasButton;
                                                    int color15 = dialogCell4.currentMessagePaint.getColor();
                                                    if (Theme.isCurrentThemeDark()) {
                                                        i26 = 36;
                                                    } else {
                                                        i26 = 26;
                                                    }
                                                    canvasButton2.setColor(ColorUtils.setAlphaComponent(color15, i26));
                                                    if (!dialogCell4.buttonCreated) {
                                                        dialogCell4.canvasButton.rewind();
                                                        i27 = dialogCell4.topMessageTopicEndIndex;
                                                        if (i27 != dialogCell4.topMessageTopicStartIndex) {
                                                            float fDp8 = dialogCell4.messageTop;
                                                            fDp8 = dialogCell4.useForceThreeLines ? fDp8 - AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f) : fDp8 - AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f);
                                                            rectF2 = AndroidUtilities.rectTmp;
                                                            float fDp9 = dialogCell4.messageLeft + AndroidUtilities.dp(2.0f) + dialogCell4.messageLayout.getPrimaryHorizontal(0);
                                                            float f60 = dialogCell4.messageLeft;
                                                            StaticLayout staticLayout6 = dialogCell4.messageLayout;
                                                            rectF2.set(fDp9, fDp8, (f60 + staticLayout6.getPrimaryHorizontal(Math.min(staticLayout6.getText().length(), dialogCell4.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), dialogCell4.buttonTop - AndroidUtilities.dp(f3));
                                                            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(f3));
                                                            if (rectF2.right > rectF2.left) {
                                                                dialogCell4.canvasButton.addRect(rectF2);
                                                            }
                                                        }
                                                        float lineLeft = dialogCell4.buttonLayout.getLineLeft(0);
                                                        RectF rectF3 = AndroidUtilities.rectTmp;
                                                        rectF3.set(dialogCell4.buttonLeft + lineLeft + AndroidUtilities.dp(2.0f), dialogCell4.buttonTop + AndroidUtilities.dp(2.0f), dialogCell4.buttonLeft + lineLeft + dialogCell4.buttonLayout.getLineWidth(0) + AndroidUtilities.dp(12.0f), dialogCell4.buttonTop + dialogCell4.buttonLayout.getHeight());
                                                        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                                                        dialogCell4.canvasButton.addRect(rectF3);
                                                    }
                                                    dialogCell4.canvasButton.draw(canvas3);
                                                    Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                                                    Drawable drawable4 = Theme.dialogs_forum_arrowDrawable;
                                                    RectF rectF4 = AndroidUtilities.rectTmp;
                                                    BaseCell.setDrawableBounds(drawable4, rectF4.right - AndroidUtilities.dp(18.0f), rectF4.top + ((rectF4.height() - Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight()) / 2.0f));
                                                    Theme.dialogs_forum_arrowDrawable.draw(canvas3);
                                                }
                                                canvas3.translate(dialogCell4.buttonLeft, dialogCell4.buttonTop);
                                                if (!dialogCell4.spoilers2.isEmpty()) {
                                                    try {
                                                        canvas3.save();
                                                        SpoilerEffect.clipOutCanvas(canvas3, dialogCell4.spoilers2);
                                                        SpoilerEffect.layoutDrawMaybe(dialogCell4.buttonLayout, canvas3);
                                                        StaticLayout staticLayout7 = dialogCell4.buttonLayout;
                                                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout7, dialogCell4.animatedEmojiStack3, -0.075f, dialogCell4.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(3, staticLayout7.getPaint().getColor()));
                                                        canvas3.restore();
                                                        for (i24 = 0; i24 < dialogCell4.spoilers2.size(); i24++) {
                                                            SpoilerEffect spoilerEffect2 = (SpoilerEffect) dialogCell4.spoilers2.get(i24);
                                                            spoilerEffect2.setColor(dialogCell4.buttonLayout.getPaint().getColor());
                                                            spoilerEffect2.draw(canvas3);
                                                        }
                                                    } catch (Exception e4) {
                                                        FileLog.e(e4);
                                                    }
                                                } else {
                                                    SpoilerEffect.layoutDrawMaybe(dialogCell4.buttonLayout, canvas3);
                                                    StaticLayout staticLayout8 = dialogCell4.buttonLayout;
                                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout8, dialogCell4.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(3, staticLayout8.getPaint().getColor()));
                                                }
                                                canvas.restore();
                                            }
                                            if (dialogCell4.currentDialogFolderId == 0) {
                                                boolean z21 = dialogCell4.drawClock;
                                                if (dialogCell4.drawCheck1) {
                                                    i17 = 2;
                                                } else {
                                                    i17 = 0;
                                                }
                                                int i36 = (z21 ? 1 : 0) + i17;
                                                if (dialogCell4.drawCheck2) {
                                                    i18 = 4;
                                                } else {
                                                    i18 = 0;
                                                }
                                                i19 = i36 + i18;
                                                i20 = dialogCell4.lastStatusDrawableParams;
                                                if (i20 >= 0) {
                                                    dialogCell4.createStatusDrawableAnimator(i20, i19);
                                                }
                                                z11 = dialogCell4.statusDrawableAnimationInProgress;
                                                if (z11) {
                                                    i19 = dialogCell4.animateToStatusDrawableParams;
                                                }
                                                if ((i19 & 1) != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if ((i19 & 2) != 0) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if ((i19 & i12) != 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z11) {
                                                    i23 = dialogCell4.animateFromStatusDrawableParams;
                                                    if ((i23 & 1) != 0) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if ((i23 & 2) != 0) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if ((i23 & i12) != 0) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z12) {
                                                    }
                                                    canvas3 = canvas;
                                                    dialogCell4.drawCheckStatus(canvas3, z15, z16, z17, false, 1.0f - dialogCell4.statusDrawableProgress);
                                                    dialogCell4.drawCheckStatus(canvas3, z12, z13, z14, false, dialogCell4.statusDrawableProgress);
                                                    dialogCell3 = this;
                                                    boolean z22 = dialogCell3.drawClock;
                                                    if (dialogCell3.drawCheck1) {
                                                        i21 = 2;
                                                    } else {
                                                        i21 = 0;
                                                    }
                                                    int i37 = (z22 ? 1 : 0) + i21;
                                                    if (dialogCell3.drawCheck2) {
                                                        i22 = 4;
                                                    } else {
                                                        i22 = 0;
                                                    }
                                                    dialogCell3.lastStatusDrawableParams = i37 + i22;
                                                } else {
                                                    dialogCell4 = this;
                                                    canvas3 = canvas;
                                                    dialogCell4.drawCheckStatus(canvas3, z12, z13, z14, false, 1.0f);
                                                }
                                                dialogCell3 = dialogCell4;
                                                boolean z23 = dialogCell3.drawClock;
                                                if (dialogCell3.drawCheck1) {
                                                    i21 = 2;
                                                } else {
                                                    i21 = 0;
                                                }
                                                int i38 = (z23 ? 1 : 0) + i21;
                                                if (dialogCell3.drawCheck2) {
                                                    i22 = 4;
                                                } else {
                                                    i22 = 0;
                                                }
                                                dialogCell3.lastStatusDrawableParams = i38 + i22;
                                            } else {
                                                canvas3 = canvas;
                                                dialogCell3 = dialogCell4;
                                            }
                                            if (dialogCell3.drawBotVerified) {
                                                if (dialogCell3.useForceThreeLines) {
                                                    f46 = 12.5f;
                                                } else {
                                                    f46 = 12.5f;
                                                }
                                                iDp3 = AndroidUtilities.dp(f46);
                                                iDp3 = dialogCell3.useForceThreeLines ? iDp3 - AndroidUtilities.dp(9.0f) : iDp3 - AndroidUtilities.dp(9.0f);
                                                swapAnimatedEmojiDrawable = dialogCell3.botVerification;
                                                if (swapAnimatedEmojiDrawable != null) {
                                                    swapAnimatedEmojiDrawable.setBounds(dialogCell3.nameLeft - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + iDp3, dialogCell3.nameLeft - AndroidUtilities.dp(2.0f), iDp3 + AndroidUtilities.dp(16.0f));
                                                    dialogCell3.botVerification.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                                                    dialogCell3.botVerification.draw(canvas3);
                                                }
                                            }
                                            if (dialogCell3.drawUnmute) {
                                                z9 = true;
                                            } else {
                                                z9 = true;
                                            }
                                            if (dialogCell3.dialogsType != i7) {
                                                if (z9) {
                                                    f44 = dialogCell3.dialogMutedProgress;
                                                    if (f44 != 1.0f) {
                                                        f45 = f44 + 0.10666667f;
                                                        dialogCell3.dialogMutedProgress = f45;
                                                        if (f45 > 1.0f) {
                                                            dialogCell3.dialogMutedProgress = 1.0f;
                                                        } else {
                                                            dialogCell3.invalidate();
                                                        }
                                                    } else if (!z9) {
                                                        f39 = dialogCell3.dialogMutedProgress;
                                                        if (f39 != f32) {
                                                            f40 = f39 - 0.10666667f;
                                                            dialogCell3.dialogMutedProgress = f40;
                                                            if (f40 < f32) {
                                                                dialogCell3.dialogMutedProgress = 0.0f;
                                                            } else {
                                                                dialogCell3.invalidate();
                                                            }
                                                        }
                                                    }
                                                } else if (!z9) {
                                                    f39 = dialogCell3.dialogMutedProgress;
                                                    if (f39 != f32) {
                                                        f40 = f39 - 0.10666667f;
                                                        dialogCell3.dialogMutedProgress = f40;
                                                        if (f40 < f32) {
                                                            dialogCell3.dialogMutedProgress = 0.0f;
                                                        } else {
                                                            dialogCell3.invalidate();
                                                        }
                                                    }
                                                }
                                                if (dialogCell3.drawPremium) {
                                                    i16 = dialogCell3.nameMutedIconLeft;
                                                } else {
                                                    i16 = dialogCell3.nameMuteLeft;
                                                }
                                                if (dialogCell3.useForceThreeLines) {
                                                    f41 = 0.0f;
                                                } else {
                                                    f41 = 0.0f;
                                                }
                                                float fDp10 = i16 - AndroidUtilities.dp(f41);
                                                if (SharedConfig.useThreeLinesLayout) {
                                                    f42 = 13.5f;
                                                } else {
                                                    f42 = 17.5f;
                                                }
                                                fDp2 = AndroidUtilities.dp(f42);
                                                if (dialogCell3.useForceThreeLines) {
                                                    if (dialogCell3.isForumCell()) {
                                                        f43 = 8.0f;
                                                    } else {
                                                        f43 = 9.0f;
                                                    }
                                                    fDp2 -= AndroidUtilities.dp(f43);
                                                } else {
                                                    if (dialogCell3.isForumCell()) {
                                                        f43 = 8.0f;
                                                    } else {
                                                        f43 = 9.0f;
                                                    }
                                                    fDp2 -= AndroidUtilities.dp(f43);
                                                }
                                                BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, fDp10, fDp2);
                                                BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, fDp10, fDp2);
                                                DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                                                if (dialogCell3.dialogMutedProgress != 1.0f) {
                                                    canvas3.save();
                                                    float f61 = dialogCell3.dialogMutedProgress;
                                                    canvas3.scale(f61, f61, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
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
                                                if (dialogCell3.useForceThreeLines) {
                                                    f38 = 13.5f;
                                                } else {
                                                    f38 = 13.5f;
                                                }
                                                float fDp11 = AndroidUtilities.dp(f38);
                                                fDp11 = dialogCell3.useForceThreeLines ? fDp11 - AndroidUtilities.dp(9.0f) : fDp11 - AndroidUtilities.dp(9.0f);
                                                BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp11);
                                                BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp11);
                                                Theme.dialogs_verifiedDrawable.draw(canvas3);
                                                Theme.dialogs_verifiedCheckDrawable.draw(canvas3);
                                            } else {
                                                if (dialogCell3.drawPremium) {
                                                    if (dialogCell3.useForceThreeLines) {
                                                        f34 = 12.5f;
                                                    } else {
                                                        f34 = 12.5f;
                                                    }
                                                    iDp2 = AndroidUtilities.dp(f34);
                                                    iDp2 = dialogCell3.useForceThreeLines ? iDp2 - AndroidUtilities.dp(9.0f) : iDp2 - AndroidUtilities.dp(9.0f);
                                                    if (dialogCell3.emojiStatus != null) {
                                                        dialogCell3.emojiStatusView.setTranslationX((f53 + dialogCell3.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                                                        dialogCell3.emojiStatusView.setTranslationY((f10 + iDp2) - AndroidUtilities.dp(f3));
                                                        if (dialogCell3.rightFragmentOpenedProgress > 0.0f) {
                                                            dialogCell3.emojiStatus.setBounds(dialogCell3.nameMuteLeft - AndroidUtilities.dp(2.0f), iDp2 - AndroidUtilities.dp(f3), dialogCell3.nameMuteLeft + AndroidUtilities.dp(20.0f), (iDp2 - AndroidUtilities.dp(f3)) + AndroidUtilities.dp(22.0f));
                                                            dialogCell3.emojiStatus.draw(canvas3);
                                                            z10 = false;
                                                        } else {
                                                            z10 = true;
                                                        }
                                                        dialogCell3.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                                                        z3 = z10;
                                                    } else {
                                                        Drawable drawable5 = PremiumGradient.getInstance().premiumStarDrawableMini;
                                                        int iDp8 = dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f);
                                                        if (!dialogCell3.useForceThreeLines) {
                                                            f51 = 15.5f;
                                                        }
                                                        BaseCell.setDrawableBounds(drawable5, iDp8, AndroidUtilities.dp(f51));
                                                        drawable5.draw(canvas3);
                                                    }
                                                    if (!dialogCell3.drawReorder) {
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
                                                        Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                                                        RectF rectF5 = dialogCell3.rect;
                                                        int i39 = dialogCell3.errorLeft;
                                                        rectF5.set(i39, dialogCell3.errorTop, i39 + AndroidUtilities.dp(20.666f), dialogCell3.errorTop + AndroidUtilities.dp(20.666f));
                                                        RectF rectF6 = dialogCell3.rect;
                                                        float f62 = AndroidUtilities.density * 10.5f;
                                                        canvas3.drawRoundRect(rectF6, f62, f62, Theme.dialogs_errorPaint);
                                                        BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, dialogCell3.errorLeft + AndroidUtilities.dp(4.5f), dialogCell3.errorTop + AndroidUtilities.dp(5.0f));
                                                        Theme.dialogs_errorDrawable.draw(canvas3);
                                                    } else {
                                                        if (!dialogCell3.drawCount) {
                                                        }
                                                        zIsCounterMuted = dialogCell3.isCounterMuted();
                                                        canvas3 = canvas;
                                                        drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                                                        dialogCell = this;
                                                        if (dialogCell.drawMention) {
                                                            Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            if (dialogCell.mentionLayout != null) {
                                                                int i40 = dialogCell.mentionLeft;
                                                                dialogCell.rect.set(i40, dialogCell.countTop, i40 + dialogCell.mentionWidth + AndroidUtilities.dp(12.666f), dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                                if (zIsCounterMuted) {
                                                                    paint = Theme.dialogs_countPaint;
                                                                } else {
                                                                    paint = Theme.dialogs_countPaint;
                                                                }
                                                                RectF rectF7 = dialogCell.rect;
                                                                canvas3.drawRoundRect(rectF7, rectF7.height() / 2.0f, dialogCell.rect.height() / 2.0f, paint);
                                                                Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                                canvas3.save();
                                                                canvas3.translate(dialogCell.mentionLeft + AndroidUtilities.dp(6.333f), dialogCell.countTop + AndroidUtilities.dp(f3));
                                                                dialogCell.mentionLayout.draw(canvas3);
                                                                canvas3.restore();
                                                            } else {
                                                                Drawable drawable6 = Theme.dialogs_mentionDrawable;
                                                                drawable6.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                                DrawableUtils.setBounds(drawable6, dialogCell.mentionLeft + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                                drawable6.draw(canvas3);
                                                            }
                                                        }
                                                        if (!dialogCell.drawReactionMention) {
                                                            int i41 = dialogCell.reactionMentionLeft;
                                                            dialogCell.rect.set(i41, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i41, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                            f35 = dialogCell.reactionsMentionsChangeProgress;
                                                            if (f35 == 1.0f) {
                                                                f35 = 1.0f;
                                                            } else if (!dialogCell.drawReactionMention) {
                                                                f35 = 1.0f - f35;
                                                            }
                                                            if (zIsCounterMuted) {
                                                                drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                            } else {
                                                                drawable = Theme.dialogs_reactionsMentionDrawable;
                                                            }
                                                            drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            DrawableUtils.setBounds(drawable, i41 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                            DrawableUtils.drawWithScale(canvas3, drawable, f35);
                                                        } else {
                                                            int i42 = dialogCell.reactionMentionLeft;
                                                            dialogCell.rect.set(i42, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i42, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                            f35 = dialogCell.reactionsMentionsChangeProgress;
                                                            if (f35 == 1.0f) {
                                                                f35 = 1.0f;
                                                            } else if (!dialogCell.drawReactionMention) {
                                                                f35 = 1.0f - f35;
                                                            }
                                                            if (zIsCounterMuted) {
                                                                drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                            } else {
                                                                drawable = Theme.dialogs_reactionsMentionDrawable;
                                                            }
                                                            drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            DrawableUtils.setBounds(drawable, i42 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                            DrawableUtils.drawWithScale(canvas3, drawable, f35);
                                                        }
                                                        if (!dialogCell.drawPollVotesMention) {
                                                            int i43 = dialogCell.pollVotesMentionLeft;
                                                            dialogCell.rect.set(i43, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i43, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                            if (zIsCounterMuted) {
                                                                drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                            } else {
                                                                drawable2 = Theme.dialogs_pollMentionDrawable;
                                                            }
                                                            drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            DrawableUtils.setBounds(drawable2, i43 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                            DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                                                        } else {
                                                            int i44 = dialogCell.pollVotesMentionLeft;
                                                            dialogCell.rect.set(i44, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i44, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                            if (zIsCounterMuted) {
                                                                drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                            } else {
                                                                drawable2 = Theme.dialogs_pollMentionDrawable;
                                                            }
                                                            drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                            DrawableUtils.setBounds(drawable2, i44 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                            DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                                                        }
                                                        if (dialogCell.thumbsCount > 0) {
                                                            f36 = dialogCell.updateHelper.typingProgres;
                                                            if (f36 != 1.0f) {
                                                                if (f36 > 0.0f) {
                                                                    canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f36) * 255.0f), 31);
                                                                    canvas3 = canvas;
                                                                    if (dialogCell.updateHelper.typingOutToTop) {
                                                                        fDp = -AndroidUtilities.dp(14.0f);
                                                                        f37 = dialogCell.updateHelper.typingProgres;
                                                                    } else {
                                                                        fDp = AndroidUtilities.dp(14.0f);
                                                                        f37 = dialogCell.updateHelper.typingProgres;
                                                                    }
                                                                    canvas3.translate(0.0f, fDp * f37);
                                                                }
                                                                i15 = 0;
                                                                while (i15 < dialogCell.thumbsCount) {
                                                                    if (dialogCell.thumbImageSeen[i15]) {
                                                                        if (dialogCell.thumbBackgroundPaint == null) {
                                                                            Paint paint8 = new Paint(1);
                                                                            dialogCell.thumbBackgroundPaint = paint8;
                                                                            paint8.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                            dialogCell.thumbBackgroundPaint.setColor(0);
                                                                        }
                                                                        rectF = AndroidUtilities.rectTmp;
                                                                        rectF.set(dialogCell.thumbImage[i15].getImageX(), dialogCell.thumbImage[i15].getImageY(), dialogCell.thumbImage[i15].getImageX2(), dialogCell.thumbImage[i15].getImageY2());
                                                                        dialogCell.thumbImage[i15].draw(canvas3);
                                                                        if (!dialogCell.drawSpoiler[i15]) {
                                                                            path = dialogCell.thumbPath;
                                                                            if (path == null) {
                                                                                dialogCell.thumbPath = new Path();
                                                                            } else {
                                                                                path.rewind();
                                                                            }
                                                                            dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i15].getRoundRadius()[0], dialogCell.thumbImage[i15].getRoundRadius()[1], Path.Direction.CW);
                                                                            canvas3.save();
                                                                            canvas3.clipPath(dialogCell.thumbPath);
                                                                            if (dialogCell.thumbSpoiler == null) {
                                                                                dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                            }
                                                                            dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                                                            dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i15].getImageX(), (int) dialogCell.thumbImage[i15].getImageY(), (int) dialogCell.thumbImage[i15].getImageX2(), (int) dialogCell.thumbImage[i15].getImageY2());
                                                                            dialogCell.thumbSpoiler.draw(canvas3);
                                                                            dialogCell.invalidate();
                                                                            canvas3.restore();
                                                                        }
                                                                        if (dialogCell.drawPlay[i15]) {
                                                                            BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i15].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i7)), (int) (dialogCell.thumbImage[i15].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i7)));
                                                                            Theme.dialogs_playDrawable.draw(canvas3);
                                                                        }
                                                                    }
                                                                    i15++;
                                                                    i11 = -1;
                                                                }
                                                                i13 = -1;
                                                                if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                                                    canvas3.restore();
                                                                }
                                                            } else {
                                                                i13 = -1;
                                                            }
                                                        } else {
                                                            i13 = -1;
                                                        }
                                                        dialogCellTags = dialogCell.tags;
                                                        if (dialogCellTags != null) {
                                                            canvas3.save();
                                                            canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                            dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                            canvas3.restore();
                                                        }
                                                        i14 = i10;
                                                        if (i14 != i13) {
                                                            canvas3.restoreToCount(i14);
                                                        }
                                                        z2 = z8;
                                                        if (dialogCell.animatingArchiveAvatar) {
                                                            canvas3.save();
                                                            f12 = 170.0f;
                                                            float interpolation3 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                            canvas3.scale(interpolation3, interpolation3, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
                                                        } else {
                                                            f12 = 170.0f;
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
                                                                DrawableUtils.setBounds(dialogCell.avatarImage, dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dpf2(1.0f), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), 17);
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
                                                                float fCenterX = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                                float fCenterY = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                                if (dialogCell.communityArrowDrawable == null) {
                                                                    dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                                }
                                                                DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX, fCenterY, 17);
                                                                canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                                                                dialogCell.communityArrowDrawable.draw(canvas3);
                                                            }
                                                        }
                                                        if (dialogCell.animatingArchiveAvatar) {
                                                            canvas3.restore();
                                                        }
                                                        if (dialogCell.avatarImage.getVisible()) {
                                                            z4 = z2;
                                                        } else {
                                                            z4 = z2;
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
                                                            canvas3.clipRect(0.0f, dialogCell2.getMeasuredHeight() * (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
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
                                                                f30 = dialogCell2.rightFragmentOpenedProgress;
                                                                if (f30 != 0.0f) {
                                                                    Theme.dividerPaint.setAlpha((int) (alpha * (1.0f - f30)));
                                                                }
                                                                measuredHeight2 = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                                if (LocaleController.isRTL) {
                                                                    canvas.drawLine(0.0f, measuredHeight2, dialogCell2.getMeasuredWidth() - iDp, measuredHeight2, Theme.dividerPaint);
                                                                } else {
                                                                    canvas.drawLine(iDp, measuredHeight2, dialogCell2.getMeasuredWidth(), measuredHeight2, Theme.dividerPaint);
                                                                }
                                                                f13 = 0.0f;
                                                                if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                                    Theme.dividerPaint.setAlpha(alpha);
                                                                }
                                                            } else {
                                                                f13 = 0.0f;
                                                            }
                                                        } else {
                                                            f13 = 0.0f;
                                                        }
                                                        if (dialogCell2.clipProgress == f13) {
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
                                                        if (z19) {
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
                                                            float fClamp2 = MathUtils.clamp((f63 - 0.05f) * f11, 0.0f, 1.0f);
                                                            dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight3, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight3);
                                                            dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp2 * 255.0f));
                                                            dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                            canvas2.restore();
                                                        }
                                                        z5 = dialogCell2.drawReorder;
                                                        if (z5) {
                                                            if (z5) {
                                                                f17 = dialogCell2.reorderIconProgress;
                                                                if (f17 < 1.0f) {
                                                                    f18 = f17 + 0.09411765f;
                                                                    dialogCell2.reorderIconProgress = f18;
                                                                    if (f18 > 1.0f) {
                                                                        dialogCell2.reorderIconProgress = 1.0f;
                                                                    }
                                                                    f15 = 0.0f;
                                                                } else {
                                                                    f15 = 0.0f;
                                                                }
                                                            } else {
                                                                f14 = dialogCell2.reorderIconProgress;
                                                                f15 = 0.0f;
                                                                if (f14 > 0.0f) {
                                                                    f16 = f14 - 0.09411765f;
                                                                    dialogCell2.reorderIconProgress = f16;
                                                                    if (f16 < 0.0f) {
                                                                        dialogCell2.reorderIconProgress = 0.0f;
                                                                    }
                                                                }
                                                            }
                                                            z4 = true;
                                                        } else {
                                                            if (z5) {
                                                                f17 = dialogCell2.reorderIconProgress;
                                                                if (f17 < 1.0f) {
                                                                    f18 = f17 + 0.09411765f;
                                                                    dialogCell2.reorderIconProgress = f18;
                                                                    if (f18 > 1.0f) {
                                                                        dialogCell2.reorderIconProgress = 1.0f;
                                                                    }
                                                                    f15 = 0.0f;
                                                                } else {
                                                                    f15 = 0.0f;
                                                                }
                                                            } else {
                                                                f14 = dialogCell2.reorderIconProgress;
                                                                f15 = 0.0f;
                                                                if (f14 > 0.0f) {
                                                                    f16 = f14 - 0.09411765f;
                                                                    dialogCell2.reorderIconProgress = f16;
                                                                    if (f16 < 0.0f) {
                                                                        dialogCell2.reorderIconProgress = 0.0f;
                                                                    }
                                                                }
                                                            }
                                                            z4 = true;
                                                        }
                                                        if (dialogCell2.archiveHidden) {
                                                            f28 = dialogCell2.archiveBackgroundProgress;
                                                            if (f28 > f15) {
                                                                f29 = f28 - 0.069565214f;
                                                                dialogCell2.archiveBackgroundProgress = f29;
                                                                if (f29 < f15) {
                                                                    dialogCell2.archiveBackgroundProgress = f15;
                                                                }
                                                                if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                                                    dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                                }
                                                                z4 = true;
                                                            }
                                                        } else {
                                                            f19 = dialogCell2.archiveBackgroundProgress;
                                                            if (f19 < 1.0f) {
                                                                f20 = f19 + 0.069565214f;
                                                                dialogCell2.archiveBackgroundProgress = f20;
                                                                if (f20 > 1.0f) {
                                                                    dialogCell2.archiveBackgroundProgress = 1.0f;
                                                                }
                                                                if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                                                    dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                                }
                                                                z4 = true;
                                                            }
                                                        }
                                                        if (dialogCell2.animatingArchiveAvatar) {
                                                            f27 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                            dialogCell2.animatingArchiveAvatarProgress = f27;
                                                            if (f27 >= f12) {
                                                                dialogCell2.animatingArchiveAvatarProgress = f12;
                                                                dialogCell2.animatingArchiveAvatar = false;
                                                            }
                                                            z4 = true;
                                                        }
                                                        if (dialogCell2.drawRevealBackground) {
                                                            f23 = dialogCell2.currentRevealBounceProgress;
                                                            if (f23 < 1.0f) {
                                                                f26 = f23 + 0.09411765f;
                                                                dialogCell2.currentRevealBounceProgress = f26;
                                                                if (f26 > 1.0f) {
                                                                    dialogCell2.currentRevealBounceProgress = 1.0f;
                                                                    z4 = true;
                                                                }
                                                            }
                                                            f24 = dialogCell2.currentRevealProgress;
                                                            if (f24 < 1.0f) {
                                                                f25 = f24 + 0.053333335f;
                                                                dialogCell2.currentRevealProgress = f25;
                                                                if (f25 > 1.0f) {
                                                                    dialogCell2.currentRevealProgress = 1.0f;
                                                                }
                                                                z4 = true;
                                                            }
                                                        } else {
                                                            if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                                dialogCell2.currentRevealBounceProgress = 0.0f;
                                                                z4 = true;
                                                            }
                                                            f21 = dialogCell2.currentRevealProgress;
                                                            if (f21 > 0.0f) {
                                                                f22 = f21 - 0.053333335f;
                                                                dialogCell2.currentRevealProgress = f22;
                                                                if (f22 < 0.0f) {
                                                                    dialogCell2.currentRevealProgress = 0.0f;
                                                                }
                                                                z4 = true;
                                                            }
                                                        }
                                                        View view = dialogCell2.emojiStatusView;
                                                        if (z3) {
                                                            i8 = 0;
                                                        } else {
                                                            i8 = 4;
                                                        }
                                                        view.setVisibility(i8);
                                                        if (z4) {
                                                            dialogCell2.invalidate();
                                                        }
                                                    }
                                                    dialogCell = dialogCell3;
                                                    if (dialogCell.thumbsCount > 0) {
                                                        f36 = dialogCell.updateHelper.typingProgres;
                                                        if (f36 != 1.0f) {
                                                            if (f36 > 0.0f) {
                                                                canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f36) * 255.0f), 31);
                                                                canvas3 = canvas;
                                                                if (dialogCell.updateHelper.typingOutToTop) {
                                                                    fDp = -AndroidUtilities.dp(14.0f);
                                                                    f37 = dialogCell.updateHelper.typingProgres;
                                                                } else {
                                                                    fDp = AndroidUtilities.dp(14.0f);
                                                                    f37 = dialogCell.updateHelper.typingProgres;
                                                                }
                                                                canvas3.translate(0.0f, fDp * f37);
                                                            }
                                                            i15 = 0;
                                                            while (i15 < dialogCell.thumbsCount) {
                                                                if (dialogCell.thumbImageSeen[i15]) {
                                                                    if (dialogCell.thumbBackgroundPaint == null) {
                                                                        Paint paint9 = new Paint(1);
                                                                        dialogCell.thumbBackgroundPaint = paint9;
                                                                        paint9.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                        dialogCell.thumbBackgroundPaint.setColor(0);
                                                                    }
                                                                    rectF = AndroidUtilities.rectTmp;
                                                                    rectF.set(dialogCell.thumbImage[i15].getImageX(), dialogCell.thumbImage[i15].getImageY(), dialogCell.thumbImage[i15].getImageX2(), dialogCell.thumbImage[i15].getImageY2());
                                                                    dialogCell.thumbImage[i15].draw(canvas3);
                                                                    if (!dialogCell.drawSpoiler[i15]) {
                                                                        path = dialogCell.thumbPath;
                                                                        if (path == null) {
                                                                            dialogCell.thumbPath = new Path();
                                                                        } else {
                                                                            path.rewind();
                                                                        }
                                                                        dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i15].getRoundRadius()[0], dialogCell.thumbImage[i15].getRoundRadius()[1], Path.Direction.CW);
                                                                        canvas3.save();
                                                                        canvas3.clipPath(dialogCell.thumbPath);
                                                                        if (dialogCell.thumbSpoiler == null) {
                                                                            dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                        }
                                                                        dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                                                        dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i15].getImageX(), (int) dialogCell.thumbImage[i15].getImageY(), (int) dialogCell.thumbImage[i15].getImageX2(), (int) dialogCell.thumbImage[i15].getImageY2());
                                                                        dialogCell.thumbSpoiler.draw(canvas3);
                                                                        dialogCell.invalidate();
                                                                        canvas3.restore();
                                                                    }
                                                                    if (dialogCell.drawPlay[i15]) {
                                                                        BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i15].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i7)), (int) (dialogCell.thumbImage[i15].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i7)));
                                                                        Theme.dialogs_playDrawable.draw(canvas3);
                                                                    }
                                                                }
                                                                i15++;
                                                                i11 = -1;
                                                            }
                                                            i13 = -1;
                                                            if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                                                canvas3.restore();
                                                            }
                                                        } else {
                                                            i13 = -1;
                                                        }
                                                    } else {
                                                        i13 = -1;
                                                    }
                                                    dialogCellTags = dialogCell.tags;
                                                    if (dialogCellTags != null) {
                                                        canvas3.save();
                                                        canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                        dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                        canvas3.restore();
                                                    }
                                                    i14 = i10;
                                                    if (i14 != i13) {
                                                        canvas3.restoreToCount(i14);
                                                    }
                                                    z2 = z8;
                                                    if (dialogCell.animatingArchiveAvatar) {
                                                        canvas3.save();
                                                        f12 = 170.0f;
                                                        float interpolation4 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                        canvas3.scale(interpolation4, interpolation4, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
                                                    } else {
                                                        f12 = 170.0f;
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
                                                            DrawableUtils.setBounds(dialogCell.avatarImage, dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dpf2(1.0f), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), 17);
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
                                                            int i46 = avatarStoryParams.forceState;
                                                            if (z6) {
                                                                avatarStoryParams.forceState = 1;
                                                            }
                                                            StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                                                            if (dialogCell.storyParams.drawnLive) {
                                                                dialogCell.checkTtl();
                                                            }
                                                            dialogCell.storyParams.forceState = i46;
                                                        }
                                                        if (!dialogCell.insideCommunityList) {
                                                            float fCenterX2 = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                            float fCenterY2 = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                            if (dialogCell.communityArrowDrawable == null) {
                                                                dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                            }
                                                            DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX2, fCenterY2, 17);
                                                            canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                                                            dialogCell.communityArrowDrawable.draw(canvas3);
                                                        }
                                                    }
                                                    if (dialogCell.animatingArchiveAvatar) {
                                                        canvas3.restore();
                                                    }
                                                    if (dialogCell.avatarImage.getVisible()) {
                                                        z4 = z2;
                                                    } else {
                                                        z4 = z2;
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
                                                        canvas3.clipRect(0.0f, dialogCell2.getMeasuredHeight() * (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                                        dialogCell2.archivedChatsDrawable.draw(canvas3);
                                                        canvas3.restore();
                                                    }
                                                    if (dialogCell2.useSeparator) {
                                                        f13 = 0.0f;
                                                    } else {
                                                        if (dialogCell2.fullSeparator) {
                                                            iDp = 0;
                                                        } else {
                                                            iDp = 0;
                                                        }
                                                        if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                                            alpha = Theme.dividerPaint.getAlpha();
                                                            f30 = dialogCell2.rightFragmentOpenedProgress;
                                                            if (f30 != 0.0f) {
                                                                Theme.dividerPaint.setAlpha((int) (alpha * (1.0f - f30)));
                                                            }
                                                            measuredHeight2 = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                            if (LocaleController.isRTL) {
                                                                canvas.drawLine(0.0f, measuredHeight2, dialogCell2.getMeasuredWidth() - iDp, measuredHeight2, Theme.dividerPaint);
                                                            } else {
                                                                canvas.drawLine(iDp, measuredHeight2, dialogCell2.getMeasuredWidth(), measuredHeight2, Theme.dividerPaint);
                                                            }
                                                            f13 = 0.0f;
                                                            if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                                Theme.dividerPaint.setAlpha(alpha);
                                                            }
                                                        } else {
                                                            f13 = 0.0f;
                                                        }
                                                    }
                                                    if (dialogCell2.clipProgress == f13) {
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
                                                    if (z19) {
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
                                                        float fClamp3 = MathUtils.clamp((f64 - 0.05f) * f11, 0.0f, 1.0f);
                                                        dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight4, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight4);
                                                        dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp3 * 255.0f));
                                                        dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                        canvas2.restore();
                                                    }
                                                    z5 = dialogCell2.drawReorder;
                                                    if (z5) {
                                                        if (z5) {
                                                            f17 = dialogCell2.reorderIconProgress;
                                                            if (f17 < 1.0f) {
                                                                f18 = f17 + 0.09411765f;
                                                                dialogCell2.reorderIconProgress = f18;
                                                                if (f18 > 1.0f) {
                                                                    dialogCell2.reorderIconProgress = 1.0f;
                                                                }
                                                                f15 = 0.0f;
                                                            } else {
                                                                f15 = 0.0f;
                                                            }
                                                        } else {
                                                            f14 = dialogCell2.reorderIconProgress;
                                                            f15 = 0.0f;
                                                            if (f14 > 0.0f) {
                                                                f16 = f14 - 0.09411765f;
                                                                dialogCell2.reorderIconProgress = f16;
                                                                if (f16 < 0.0f) {
                                                                    dialogCell2.reorderIconProgress = 0.0f;
                                                                }
                                                            }
                                                        }
                                                        z4 = true;
                                                    } else {
                                                        if (z5) {
                                                            f17 = dialogCell2.reorderIconProgress;
                                                            if (f17 < 1.0f) {
                                                                f18 = f17 + 0.09411765f;
                                                                dialogCell2.reorderIconProgress = f18;
                                                                if (f18 > 1.0f) {
                                                                    dialogCell2.reorderIconProgress = 1.0f;
                                                                }
                                                                f15 = 0.0f;
                                                            } else {
                                                                f15 = 0.0f;
                                                            }
                                                        } else {
                                                            f14 = dialogCell2.reorderIconProgress;
                                                            f15 = 0.0f;
                                                            if (f14 > 0.0f) {
                                                                f16 = f14 - 0.09411765f;
                                                                dialogCell2.reorderIconProgress = f16;
                                                                if (f16 < 0.0f) {
                                                                    dialogCell2.reorderIconProgress = 0.0f;
                                                                }
                                                            }
                                                        }
                                                        z4 = true;
                                                    }
                                                    if (dialogCell2.archiveHidden) {
                                                        f28 = dialogCell2.archiveBackgroundProgress;
                                                        if (f28 > f15) {
                                                            f29 = f28 - 0.069565214f;
                                                            dialogCell2.archiveBackgroundProgress = f29;
                                                            if (f29 < f15) {
                                                                dialogCell2.archiveBackgroundProgress = f15;
                                                            }
                                                            if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                                                dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                            }
                                                            z4 = true;
                                                        }
                                                    } else {
                                                        f19 = dialogCell2.archiveBackgroundProgress;
                                                        if (f19 < 1.0f) {
                                                            f20 = f19 + 0.069565214f;
                                                            dialogCell2.archiveBackgroundProgress = f20;
                                                            if (f20 > 1.0f) {
                                                                dialogCell2.archiveBackgroundProgress = 1.0f;
                                                            }
                                                            if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                                                dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                            }
                                                            z4 = true;
                                                        }
                                                    }
                                                    if (dialogCell2.animatingArchiveAvatar) {
                                                        f27 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                        dialogCell2.animatingArchiveAvatarProgress = f27;
                                                        if (f27 >= f12) {
                                                            dialogCell2.animatingArchiveAvatarProgress = f12;
                                                            dialogCell2.animatingArchiveAvatar = false;
                                                        }
                                                        z4 = true;
                                                    }
                                                    if (dialogCell2.drawRevealBackground) {
                                                        f23 = dialogCell2.currentRevealBounceProgress;
                                                        if (f23 < 1.0f) {
                                                            f26 = f23 + 0.09411765f;
                                                            dialogCell2.currentRevealBounceProgress = f26;
                                                            if (f26 > 1.0f) {
                                                                dialogCell2.currentRevealBounceProgress = 1.0f;
                                                                z4 = true;
                                                            }
                                                        }
                                                        f24 = dialogCell2.currentRevealProgress;
                                                        if (f24 < 1.0f) {
                                                            f25 = f24 + 0.053333335f;
                                                            dialogCell2.currentRevealProgress = f25;
                                                            if (f25 > 1.0f) {
                                                                dialogCell2.currentRevealProgress = 1.0f;
                                                            }
                                                            z4 = true;
                                                        }
                                                    } else {
                                                        if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                            dialogCell2.currentRevealBounceProgress = 0.0f;
                                                            z4 = true;
                                                        }
                                                        f21 = dialogCell2.currentRevealProgress;
                                                        if (f21 > 0.0f) {
                                                            f22 = f21 - 0.053333335f;
                                                            dialogCell2.currentRevealProgress = f22;
                                                            if (f22 < 0.0f) {
                                                                dialogCell2.currentRevealProgress = 0.0f;
                                                            }
                                                            z4 = true;
                                                        }
                                                    }
                                                    View view2 = dialogCell2.emojiStatusView;
                                                    if (z3) {
                                                        i8 = 0;
                                                    } else {
                                                        i8 = 4;
                                                    }
                                                    view2.setVisibility(i8);
                                                    if (z4) {
                                                        dialogCell2.invalidate();
                                                    }
                                                }
                                                if (dialogCell3.drawScam != 0) {
                                                    if (dialogCell3.useForceThreeLines) {
                                                        f33 = 12.0f;
                                                    } else {
                                                        f33 = 12.0f;
                                                    }
                                                    int iDp9 = AndroidUtilities.dp(f33);
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
                                            z3 = false;
                                            if (!dialogCell3.drawReorder) {
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
                                                Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                                                RectF rectF8 = dialogCell3.rect;
                                                int i310 = dialogCell3.errorLeft;
                                                rectF8.set(i310, dialogCell3.errorTop, i310 + AndroidUtilities.dp(20.666f), dialogCell3.errorTop + AndroidUtilities.dp(20.666f));
                                                RectF rectF9 = dialogCell3.rect;
                                                float f65 = AndroidUtilities.density * 10.5f;
                                                canvas3.drawRoundRect(rectF9, f65, f65, Theme.dialogs_errorPaint);
                                                BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, dialogCell3.errorLeft + AndroidUtilities.dp(4.5f), dialogCell3.errorTop + AndroidUtilities.dp(5.0f));
                                                Theme.dialogs_errorDrawable.draw(canvas3);
                                            } else {
                                                if (!dialogCell3.drawCount) {
                                                }
                                                zIsCounterMuted = dialogCell3.isCounterMuted();
                                                canvas3 = canvas;
                                                drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                                                dialogCell = this;
                                                if (dialogCell.drawMention) {
                                                    Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    if (dialogCell.mentionLayout != null) {
                                                        int i47 = dialogCell.mentionLeft;
                                                        dialogCell.rect.set(i47, dialogCell.countTop, i47 + dialogCell.mentionWidth + AndroidUtilities.dp(12.666f), dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                        if (zIsCounterMuted) {
                                                            paint = Theme.dialogs_countPaint;
                                                        } else {
                                                            paint = Theme.dialogs_countPaint;
                                                        }
                                                        RectF rectF10 = dialogCell.rect;
                                                        canvas3.drawRoundRect(rectF10, rectF10.height() / 2.0f, dialogCell.rect.height() / 2.0f, paint);
                                                        Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                        canvas3.save();
                                                        canvas3.translate(dialogCell.mentionLeft + AndroidUtilities.dp(6.333f), dialogCell.countTop + AndroidUtilities.dp(f3));
                                                        dialogCell.mentionLayout.draw(canvas3);
                                                        canvas3.restore();
                                                    } else {
                                                        Drawable drawable7 = Theme.dialogs_mentionDrawable;
                                                        drawable7.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                        DrawableUtils.setBounds(drawable7, dialogCell.mentionLeft + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                        drawable7.draw(canvas3);
                                                    }
                                                }
                                                if (!dialogCell.drawReactionMention) {
                                                    int i48 = dialogCell.reactionMentionLeft;
                                                    dialogCell.rect.set(i48, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i48, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                    f35 = dialogCell.reactionsMentionsChangeProgress;
                                                    if (f35 == 1.0f) {
                                                        f35 = 1.0f;
                                                    } else if (!dialogCell.drawReactionMention) {
                                                        f35 = 1.0f - f35;
                                                    }
                                                    if (zIsCounterMuted) {
                                                        drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                    } else {
                                                        drawable = Theme.dialogs_reactionsMentionDrawable;
                                                    }
                                                    drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable, i48 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                    DrawableUtils.drawWithScale(canvas3, drawable, f35);
                                                } else {
                                                    int i49 = dialogCell.reactionMentionLeft;
                                                    dialogCell.rect.set(i49, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i49, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                    f35 = dialogCell.reactionsMentionsChangeProgress;
                                                    if (f35 == 1.0f) {
                                                        f35 = 1.0f;
                                                    } else if (!dialogCell.drawReactionMention) {
                                                        f35 = 1.0f - f35;
                                                    }
                                                    if (zIsCounterMuted) {
                                                        drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                    } else {
                                                        drawable = Theme.dialogs_reactionsMentionDrawable;
                                                    }
                                                    drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable, i49 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                    DrawableUtils.drawWithScale(canvas3, drawable, f35);
                                                }
                                                if (!dialogCell.drawPollVotesMention) {
                                                    int i410 = dialogCell.pollVotesMentionLeft;
                                                    dialogCell.rect.set(i410, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i410, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                    if (zIsCounterMuted) {
                                                        drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                    } else {
                                                        drawable2 = Theme.dialogs_pollMentionDrawable;
                                                    }
                                                    drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable2, i410 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                    DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                                                } else {
                                                    int i411 = dialogCell.pollVotesMentionLeft;
                                                    dialogCell.rect.set(i411, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i411, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                                    if (zIsCounterMuted) {
                                                        drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                    } else {
                                                        drawable2 = Theme.dialogs_pollMentionDrawable;
                                                    }
                                                    drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable2, i411 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                                    DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                                                }
                                                if (dialogCell.thumbsCount > 0) {
                                                    f36 = dialogCell.updateHelper.typingProgres;
                                                    if (f36 != 1.0f) {
                                                        if (f36 > 0.0f) {
                                                            canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f36) * 255.0f), 31);
                                                            canvas3 = canvas;
                                                            if (dialogCell.updateHelper.typingOutToTop) {
                                                                fDp = -AndroidUtilities.dp(14.0f);
                                                                f37 = dialogCell.updateHelper.typingProgres;
                                                            } else {
                                                                fDp = AndroidUtilities.dp(14.0f);
                                                                f37 = dialogCell.updateHelper.typingProgres;
                                                            }
                                                            canvas3.translate(0.0f, fDp * f37);
                                                        }
                                                        i15 = 0;
                                                        while (i15 < dialogCell.thumbsCount) {
                                                            if (dialogCell.thumbImageSeen[i15]) {
                                                                if (dialogCell.thumbBackgroundPaint == null) {
                                                                    Paint paint10 = new Paint(1);
                                                                    dialogCell.thumbBackgroundPaint = paint10;
                                                                    paint10.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                    dialogCell.thumbBackgroundPaint.setColor(0);
                                                                }
                                                                rectF = AndroidUtilities.rectTmp;
                                                                rectF.set(dialogCell.thumbImage[i15].getImageX(), dialogCell.thumbImage[i15].getImageY(), dialogCell.thumbImage[i15].getImageX2(), dialogCell.thumbImage[i15].getImageY2());
                                                                dialogCell.thumbImage[i15].draw(canvas3);
                                                                if (!dialogCell.drawSpoiler[i15]) {
                                                                    path = dialogCell.thumbPath;
                                                                    if (path == null) {
                                                                        dialogCell.thumbPath = new Path();
                                                                    } else {
                                                                        path.rewind();
                                                                    }
                                                                    dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i15].getRoundRadius()[0], dialogCell.thumbImage[i15].getRoundRadius()[1], Path.Direction.CW);
                                                                    canvas3.save();
                                                                    canvas3.clipPath(dialogCell.thumbPath);
                                                                    if (dialogCell.thumbSpoiler == null) {
                                                                        dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                    }
                                                                    dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                                                    dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i15].getImageX(), (int) dialogCell.thumbImage[i15].getImageY(), (int) dialogCell.thumbImage[i15].getImageX2(), (int) dialogCell.thumbImage[i15].getImageY2());
                                                                    dialogCell.thumbSpoiler.draw(canvas3);
                                                                    dialogCell.invalidate();
                                                                    canvas3.restore();
                                                                }
                                                                if (dialogCell.drawPlay[i15]) {
                                                                    BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i15].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i7)), (int) (dialogCell.thumbImage[i15].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i7)));
                                                                    Theme.dialogs_playDrawable.draw(canvas3);
                                                                }
                                                            }
                                                            i15++;
                                                            i11 = -1;
                                                        }
                                                        i13 = -1;
                                                        if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                                            canvas3.restore();
                                                        }
                                                    } else {
                                                        i13 = -1;
                                                    }
                                                } else {
                                                    i13 = -1;
                                                }
                                                dialogCellTags = dialogCell.tags;
                                                if (dialogCellTags != null) {
                                                    canvas3.save();
                                                    canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                    dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                    canvas3.restore();
                                                }
                                                i14 = i10;
                                                if (i14 != i13) {
                                                    canvas3.restoreToCount(i14);
                                                }
                                                z2 = z8;
                                                if (dialogCell.animatingArchiveAvatar) {
                                                    canvas3.save();
                                                    f12 = 170.0f;
                                                    float interpolation5 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                    canvas3.scale(interpolation5, interpolation5, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
                                                } else {
                                                    f12 = 170.0f;
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
                                                        DrawableUtils.setBounds(dialogCell.avatarImage, dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dpf2(1.0f), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), 17);
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
                                                        int i412 = avatarStoryParams.forceState;
                                                        if (z6) {
                                                            avatarStoryParams.forceState = 1;
                                                        }
                                                        StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                                                        if (dialogCell.storyParams.drawnLive) {
                                                            dialogCell.checkTtl();
                                                        }
                                                        dialogCell.storyParams.forceState = i412;
                                                    }
                                                    if (!dialogCell.insideCommunityList) {
                                                        float fCenterX3 = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                        float fCenterY3 = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                        if (dialogCell.communityArrowDrawable == null) {
                                                            dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                        }
                                                        DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX3, fCenterY3, 17);
                                                        canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                                                        dialogCell.communityArrowDrawable.draw(canvas3);
                                                    }
                                                }
                                                if (dialogCell.animatingArchiveAvatar) {
                                                    canvas3.restore();
                                                }
                                                if (dialogCell.avatarImage.getVisible()) {
                                                    z4 = z2;
                                                } else {
                                                    z4 = z2;
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
                                                    canvas3.clipRect(0.0f, dialogCell2.getMeasuredHeight() * (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                                    dialogCell2.archivedChatsDrawable.draw(canvas3);
                                                    canvas3.restore();
                                                }
                                                if (dialogCell2.useSeparator) {
                                                    f13 = 0.0f;
                                                } else {
                                                    if (dialogCell2.fullSeparator) {
                                                        iDp = 0;
                                                    } else {
                                                        iDp = 0;
                                                    }
                                                    if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                                        alpha = Theme.dividerPaint.getAlpha();
                                                        f30 = dialogCell2.rightFragmentOpenedProgress;
                                                        if (f30 != 0.0f) {
                                                            Theme.dividerPaint.setAlpha((int) (alpha * (1.0f - f30)));
                                                        }
                                                        measuredHeight2 = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                        if (LocaleController.isRTL) {
                                                            canvas.drawLine(0.0f, measuredHeight2, dialogCell2.getMeasuredWidth() - iDp, measuredHeight2, Theme.dividerPaint);
                                                        } else {
                                                            canvas.drawLine(iDp, measuredHeight2, dialogCell2.getMeasuredWidth(), measuredHeight2, Theme.dividerPaint);
                                                        }
                                                        f13 = 0.0f;
                                                        if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                            Theme.dividerPaint.setAlpha(alpha);
                                                        }
                                                    } else {
                                                        f13 = 0.0f;
                                                    }
                                                }
                                                if (dialogCell2.clipProgress == f13) {
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
                                                if (z19) {
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
                                                    float fClamp4 = MathUtils.clamp((f66 - 0.05f) * f11, 0.0f, 1.0f);
                                                    dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight5, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight5);
                                                    dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp4 * 255.0f));
                                                    dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                    canvas2.restore();
                                                }
                                                z5 = dialogCell2.drawReorder;
                                                if (z5) {
                                                    if (z5) {
                                                        f17 = dialogCell2.reorderIconProgress;
                                                        if (f17 < 1.0f) {
                                                            f18 = f17 + 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f18;
                                                            if (f18 > 1.0f) {
                                                                dialogCell2.reorderIconProgress = 1.0f;
                                                            }
                                                            f15 = 0.0f;
                                                        } else {
                                                            f15 = 0.0f;
                                                        }
                                                    } else {
                                                        f14 = dialogCell2.reorderIconProgress;
                                                        f15 = 0.0f;
                                                        if (f14 > 0.0f) {
                                                            f16 = f14 - 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f16;
                                                            if (f16 < 0.0f) {
                                                                dialogCell2.reorderIconProgress = 0.0f;
                                                            }
                                                        }
                                                    }
                                                    z4 = true;
                                                } else {
                                                    if (z5) {
                                                        f17 = dialogCell2.reorderIconProgress;
                                                        if (f17 < 1.0f) {
                                                            f18 = f17 + 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f18;
                                                            if (f18 > 1.0f) {
                                                                dialogCell2.reorderIconProgress = 1.0f;
                                                            }
                                                            f15 = 0.0f;
                                                        } else {
                                                            f15 = 0.0f;
                                                        }
                                                    } else {
                                                        f14 = dialogCell2.reorderIconProgress;
                                                        f15 = 0.0f;
                                                        if (f14 > 0.0f) {
                                                            f16 = f14 - 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f16;
                                                            if (f16 < 0.0f) {
                                                                dialogCell2.reorderIconProgress = 0.0f;
                                                            }
                                                        }
                                                    }
                                                    z4 = true;
                                                }
                                                if (dialogCell2.archiveHidden) {
                                                    f28 = dialogCell2.archiveBackgroundProgress;
                                                    if (f28 > f15) {
                                                        f29 = f28 - 0.069565214f;
                                                        dialogCell2.archiveBackgroundProgress = f29;
                                                        if (f29 < f15) {
                                                            dialogCell2.archiveBackgroundProgress = f15;
                                                        }
                                                        if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                                            dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                        }
                                                        z4 = true;
                                                    }
                                                } else {
                                                    f19 = dialogCell2.archiveBackgroundProgress;
                                                    if (f19 < 1.0f) {
                                                        f20 = f19 + 0.069565214f;
                                                        dialogCell2.archiveBackgroundProgress = f20;
                                                        if (f20 > 1.0f) {
                                                            dialogCell2.archiveBackgroundProgress = 1.0f;
                                                        }
                                                        if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                                            dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                        }
                                                        z4 = true;
                                                    }
                                                }
                                                if (dialogCell2.animatingArchiveAvatar) {
                                                    f27 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                    dialogCell2.animatingArchiveAvatarProgress = f27;
                                                    if (f27 >= f12) {
                                                        dialogCell2.animatingArchiveAvatarProgress = f12;
                                                        dialogCell2.animatingArchiveAvatar = false;
                                                    }
                                                    z4 = true;
                                                }
                                                if (dialogCell2.drawRevealBackground) {
                                                    f23 = dialogCell2.currentRevealBounceProgress;
                                                    if (f23 < 1.0f) {
                                                        f26 = f23 + 0.09411765f;
                                                        dialogCell2.currentRevealBounceProgress = f26;
                                                        if (f26 > 1.0f) {
                                                            dialogCell2.currentRevealBounceProgress = 1.0f;
                                                            z4 = true;
                                                        }
                                                    }
                                                    f24 = dialogCell2.currentRevealProgress;
                                                    if (f24 < 1.0f) {
                                                        f25 = f24 + 0.053333335f;
                                                        dialogCell2.currentRevealProgress = f25;
                                                        if (f25 > 1.0f) {
                                                            dialogCell2.currentRevealProgress = 1.0f;
                                                        }
                                                        z4 = true;
                                                    }
                                                } else {
                                                    if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                        dialogCell2.currentRevealBounceProgress = 0.0f;
                                                        z4 = true;
                                                    }
                                                    f21 = dialogCell2.currentRevealProgress;
                                                    if (f21 > 0.0f) {
                                                        f22 = f21 - 0.053333335f;
                                                        dialogCell2.currentRevealProgress = f22;
                                                        if (f22 < 0.0f) {
                                                            dialogCell2.currentRevealProgress = 0.0f;
                                                        }
                                                        z4 = true;
                                                    }
                                                }
                                                View view3 = dialogCell2.emojiStatusView;
                                                if (z3) {
                                                    i8 = 0;
                                                } else {
                                                    i8 = 4;
                                                }
                                                view3.setVisibility(i8);
                                                if (z4) {
                                                    dialogCell2.invalidate();
                                                }
                                            }
                                            dialogCell = dialogCell3;
                                            if (dialogCell.thumbsCount > 0) {
                                                f36 = dialogCell.updateHelper.typingProgres;
                                                if (f36 != 1.0f) {
                                                    if (f36 > 0.0f) {
                                                        canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f36) * 255.0f), 31);
                                                        canvas3 = canvas;
                                                        if (dialogCell.updateHelper.typingOutToTop) {
                                                            fDp = -AndroidUtilities.dp(14.0f);
                                                            f37 = dialogCell.updateHelper.typingProgres;
                                                        } else {
                                                            fDp = AndroidUtilities.dp(14.0f);
                                                            f37 = dialogCell.updateHelper.typingProgres;
                                                        }
                                                        canvas3.translate(0.0f, fDp * f37);
                                                    }
                                                    i15 = 0;
                                                    while (i15 < dialogCell.thumbsCount) {
                                                        if (dialogCell.thumbImageSeen[i15]) {
                                                            if (dialogCell.thumbBackgroundPaint == null) {
                                                                Paint paint11 = new Paint(1);
                                                                dialogCell.thumbBackgroundPaint = paint11;
                                                                paint11.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                dialogCell.thumbBackgroundPaint.setColor(0);
                                                            }
                                                            rectF = AndroidUtilities.rectTmp;
                                                            rectF.set(dialogCell.thumbImage[i15].getImageX(), dialogCell.thumbImage[i15].getImageY(), dialogCell.thumbImage[i15].getImageX2(), dialogCell.thumbImage[i15].getImageY2());
                                                            dialogCell.thumbImage[i15].draw(canvas3);
                                                            if (!dialogCell.drawSpoiler[i15]) {
                                                                path = dialogCell.thumbPath;
                                                                if (path == null) {
                                                                    dialogCell.thumbPath = new Path();
                                                                } else {
                                                                    path.rewind();
                                                                }
                                                                dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i15].getRoundRadius()[0], dialogCell.thumbImage[i15].getRoundRadius()[1], Path.Direction.CW);
                                                                canvas3.save();
                                                                canvas3.clipPath(dialogCell.thumbPath);
                                                                if (dialogCell.thumbSpoiler == null) {
                                                                    dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                }
                                                                dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                                                dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i15].getImageX(), (int) dialogCell.thumbImage[i15].getImageY(), (int) dialogCell.thumbImage[i15].getImageX2(), (int) dialogCell.thumbImage[i15].getImageY2());
                                                                dialogCell.thumbSpoiler.draw(canvas3);
                                                                dialogCell.invalidate();
                                                                canvas3.restore();
                                                            }
                                                            if (dialogCell.drawPlay[i15]) {
                                                                BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i15].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i7)), (int) (dialogCell.thumbImage[i15].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i7)));
                                                                Theme.dialogs_playDrawable.draw(canvas3);
                                                            }
                                                        }
                                                        i15++;
                                                        i11 = -1;
                                                    }
                                                    i13 = -1;
                                                    if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                                        canvas3.restore();
                                                    }
                                                } else {
                                                    i13 = -1;
                                                }
                                            } else {
                                                i13 = -1;
                                            }
                                            dialogCellTags = dialogCell.tags;
                                            if (dialogCellTags != null) {
                                                canvas3.save();
                                                canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                canvas3.restore();
                                            }
                                            i14 = i10;
                                            if (i14 != i13) {
                                                canvas3.restoreToCount(i14);
                                            }
                                            z2 = z8;
                                            if (dialogCell.animatingArchiveAvatar) {
                                                canvas3.save();
                                                f12 = 170.0f;
                                                float interpolation6 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                canvas3.scale(interpolation6, interpolation6, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
                                            } else {
                                                f12 = 170.0f;
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
                                                    DrawableUtils.setBounds(dialogCell.avatarImage, dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dpf2(1.0f), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), 17);
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
                                                    int i413 = avatarStoryParams.forceState;
                                                    if (z6) {
                                                        avatarStoryParams.forceState = 1;
                                                    }
                                                    StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                                                    if (dialogCell.storyParams.drawnLive) {
                                                        dialogCell.checkTtl();
                                                    }
                                                    dialogCell.storyParams.forceState = i413;
                                                }
                                                if (!dialogCell.insideCommunityList) {
                                                    float fCenterX4 = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                    float fCenterY4 = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                    if (dialogCell.communityArrowDrawable == null) {
                                                        dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                    }
                                                    DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX4, fCenterY4, 17);
                                                    canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                                                    dialogCell.communityArrowDrawable.draw(canvas3);
                                                }
                                            }
                                            if (dialogCell.animatingArchiveAvatar) {
                                                canvas3.restore();
                                            }
                                            if (dialogCell.avatarImage.getVisible()) {
                                                z4 = z2;
                                            } else {
                                                z4 = z2;
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
                                                canvas3.clipRect(0.0f, dialogCell2.getMeasuredHeight() * (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                                dialogCell2.archivedChatsDrawable.draw(canvas3);
                                                canvas3.restore();
                                            }
                                            if (dialogCell2.useSeparator) {
                                                f13 = 0.0f;
                                            } else {
                                                if (dialogCell2.fullSeparator) {
                                                    iDp = 0;
                                                } else {
                                                    iDp = 0;
                                                }
                                                if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                                    alpha = Theme.dividerPaint.getAlpha();
                                                    f30 = dialogCell2.rightFragmentOpenedProgress;
                                                    if (f30 != 0.0f) {
                                                        Theme.dividerPaint.setAlpha((int) (alpha * (1.0f - f30)));
                                                    }
                                                    measuredHeight2 = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                    if (LocaleController.isRTL) {
                                                        canvas.drawLine(0.0f, measuredHeight2, dialogCell2.getMeasuredWidth() - iDp, measuredHeight2, Theme.dividerPaint);
                                                    } else {
                                                        canvas.drawLine(iDp, measuredHeight2, dialogCell2.getMeasuredWidth(), measuredHeight2, Theme.dividerPaint);
                                                    }
                                                    f13 = 0.0f;
                                                    if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                        Theme.dividerPaint.setAlpha(alpha);
                                                    }
                                                } else {
                                                    f13 = 0.0f;
                                                }
                                            }
                                            if (dialogCell2.clipProgress == f13) {
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
                                            if (z19) {
                                                float f67 = 1.0f - pullProgress;
                                                int measuredHeight6 = (int) (dialogCell2.getMeasuredHeight() * f67);
                                                color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                                                if (dialogCell2.archiveFadeGradientDrawable == null) {
                                                    dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                                }
                                                if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                                                    dialogCell2.archiveFadeGradientDrawableColor = color3;
                                                    dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                                                }
                                                float fClamp5 = MathUtils.clamp((f67 - 0.05f) * f11, 0.0f, 1.0f);
                                                dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight6, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight6);
                                                dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp5 * 255.0f));
                                                dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                canvas2.restore();
                                            }
                                            z5 = dialogCell2.drawReorder;
                                            if (z5) {
                                                if (z5) {
                                                    f17 = dialogCell2.reorderIconProgress;
                                                    if (f17 < 1.0f) {
                                                        f18 = f17 + 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f18;
                                                        if (f18 > 1.0f) {
                                                            dialogCell2.reorderIconProgress = 1.0f;
                                                        }
                                                        f15 = 0.0f;
                                                    } else {
                                                        f15 = 0.0f;
                                                    }
                                                } else {
                                                    f14 = dialogCell2.reorderIconProgress;
                                                    f15 = 0.0f;
                                                    if (f14 > 0.0f) {
                                                        f16 = f14 - 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f16;
                                                        if (f16 < 0.0f) {
                                                            dialogCell2.reorderIconProgress = 0.0f;
                                                        }
                                                    }
                                                }
                                                z4 = true;
                                            } else {
                                                if (z5) {
                                                    f17 = dialogCell2.reorderIconProgress;
                                                    if (f17 < 1.0f) {
                                                        f18 = f17 + 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f18;
                                                        if (f18 > 1.0f) {
                                                            dialogCell2.reorderIconProgress = 1.0f;
                                                        }
                                                        f15 = 0.0f;
                                                    } else {
                                                        f15 = 0.0f;
                                                    }
                                                } else {
                                                    f14 = dialogCell2.reorderIconProgress;
                                                    f15 = 0.0f;
                                                    if (f14 > 0.0f) {
                                                        f16 = f14 - 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f16;
                                                        if (f16 < 0.0f) {
                                                            dialogCell2.reorderIconProgress = 0.0f;
                                                        }
                                                    }
                                                }
                                                z4 = true;
                                            }
                                            if (dialogCell2.archiveHidden) {
                                                f28 = dialogCell2.archiveBackgroundProgress;
                                                if (f28 > f15) {
                                                    f29 = f28 - 0.069565214f;
                                                    dialogCell2.archiveBackgroundProgress = f29;
                                                    if (f29 < f15) {
                                                        dialogCell2.archiveBackgroundProgress = f15;
                                                    }
                                                    if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                                        dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                    }
                                                    z4 = true;
                                                }
                                            } else {
                                                f19 = dialogCell2.archiveBackgroundProgress;
                                                if (f19 < 1.0f) {
                                                    f20 = f19 + 0.069565214f;
                                                    dialogCell2.archiveBackgroundProgress = f20;
                                                    if (f20 > 1.0f) {
                                                        dialogCell2.archiveBackgroundProgress = 1.0f;
                                                    }
                                                    if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                                        dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                                    }
                                                    z4 = true;
                                                }
                                            }
                                            if (dialogCell2.animatingArchiveAvatar) {
                                                f27 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                dialogCell2.animatingArchiveAvatarProgress = f27;
                                                if (f27 >= f12) {
                                                    dialogCell2.animatingArchiveAvatarProgress = f12;
                                                    dialogCell2.animatingArchiveAvatar = false;
                                                }
                                                z4 = true;
                                            }
                                            if (dialogCell2.drawRevealBackground) {
                                                f23 = dialogCell2.currentRevealBounceProgress;
                                                if (f23 < 1.0f) {
                                                    f26 = f23 + 0.09411765f;
                                                    dialogCell2.currentRevealBounceProgress = f26;
                                                    if (f26 > 1.0f) {
                                                        dialogCell2.currentRevealBounceProgress = 1.0f;
                                                        z4 = true;
                                                    }
                                                }
                                                f24 = dialogCell2.currentRevealProgress;
                                                if (f24 < 1.0f) {
                                                    f25 = f24 + 0.053333335f;
                                                    dialogCell2.currentRevealProgress = f25;
                                                    if (f25 > 1.0f) {
                                                        dialogCell2.currentRevealProgress = 1.0f;
                                                    }
                                                    z4 = true;
                                                }
                                            } else {
                                                if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                    dialogCell2.currentRevealBounceProgress = 0.0f;
                                                    z4 = true;
                                                }
                                                f21 = dialogCell2.currentRevealProgress;
                                                if (f21 > 0.0f) {
                                                    f22 = f21 - 0.053333335f;
                                                    dialogCell2.currentRevealProgress = f22;
                                                    if (f22 < 0.0f) {
                                                        dialogCell2.currentRevealProgress = 0.0f;
                                                    }
                                                    z4 = true;
                                                }
                                            }
                                            View view4 = dialogCell2.emojiStatusView;
                                            if (z3) {
                                                i8 = 0;
                                            } else {
                                                i8 = 4;
                                            }
                                            view4.setVisibility(i8);
                                            if (z4) {
                                                dialogCell2.invalidate();
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        f47 = fDp7;
                                        i29 = alpha3;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    i29 = alpha3;
                                    f47 = fDp7;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                f47 = fDp7;
                                i29 = alpha3;
                            }
                        } else {
                            f47 = fDp7;
                            i29 = alpha3;
                            f32 = 0.0f;
                            SpoilerEffect.layoutDrawMaybe(dialogCell4.messageLayout, canvas3);
                            StaticLayout staticLayout9 = dialogCell4.messageLayout;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout9, dialogCell4.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(i7, staticLayout9.getPaint().getColor()));
                        }
                        dialogCell4.messageLayout.getPaint().setAlpha(i29);
                        canvas3.restore();
                    } else {
                        f47 = fDp7;
                        f32 = 0.0f;
                    }
                    canvas3.save();
                    dialogUpdateHelper = dialogCell4.updateHelper;
                    if (dialogUpdateHelper.typingOutToTop) {
                        fDp4 = dialogCell4.messageTop + ((1.0f - dialogUpdateHelper.typingProgres) * f47);
                    } else {
                        fDp4 = dialogCell4.messageTop - ((1.0f - dialogUpdateHelper.typingProgres) * f47);
                    }
                    if (((dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                        if (dialogCell4.isForumCell()) {
                            f49 = 10.0f;
                        } else {
                            f49 = 11.0f;
                        }
                        fDp4 -= AndroidUtilities.dp(f49);
                    }
                    canvas3.translate(dialogCell4.typingLeft, fDp4);
                    staticLayout2 = dialogCell4.typingLayout;
                    if (staticLayout2 != null && dialogCell4.updateHelper.typingProgres > f32) {
                        int alpha5 = staticLayout2.getPaint().getAlpha();
                        dialogCell4.typingLayout.getPaint().setAlpha((int) (alpha5 * dialogCell4.updateHelper.typingProgres));
                        dialogCell4.typingLayout.draw(canvas3);
                        dialogCell4.typingLayout.getPaint().setAlpha(alpha5);
                    }
                    canvas3.restore();
                    if (dialogCell4.typingLayout == null) {
                        i12 = 4;
                    } else {
                        i28 = dialogCell4.printingStringType;
                        if (i28 < 0) {
                            dialogUpdateHelper3 = dialogCell4.updateHelper;
                            if (dialogUpdateHelper3.typingProgres > f32 || dialogUpdateHelper3.lastKnownTypingType < 0) {
                                i12 = 4;
                            } else {
                                if (i28 < 0) {
                                    i28 = dialogCell4.updateHelper.lastKnownTypingType;
                                }
                                chatStatusDrawable = Theme.getChatStatusDrawable(i28);
                                if (chatStatusDrawable != null) {
                                    canvas3.save();
                                    int color16 = Theme.getColor(Theme.key_chats_actionMessage);
                                    chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(color16, (int) (Color.alpha(color16) * dialogCell4.updateHelper.typingProgres)));
                                    dialogUpdateHelper2 = dialogCell4.updateHelper;
                                    if (dialogUpdateHelper2.typingOutToTop) {
                                        fDp5 = dialogCell4.messageTop + ((1.0f - dialogUpdateHelper2.typingProgres) * f47);
                                    } else {
                                        fDp5 = dialogCell4.messageTop - ((1.0f - dialogUpdateHelper2.typingProgres) * f47);
                                    }
                                    if (((dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                                        if (dialogCell4.isForumCell()) {
                                            f48 = 10.0f;
                                        } else {
                                            f48 = 11.0f;
                                        }
                                        fDp5 -= AndroidUtilities.dp(f48);
                                    }
                                    i12 = 4;
                                    if (i28 != 1 || i28 == 4) {
                                        float f511 = dialogCell4.statusDrawableLeft;
                                        if (i28 == 1) {
                                            iDp4 = AndroidUtilities.dp(1.0f);
                                        } else {
                                            iDp4 = 0;
                                        }
                                        canvas3.translate(f511, fDp5 + iDp4);
                                    } else {
                                        canvas3.translate(dialogCell4.statusDrawableLeft, fDp5 + ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / 2.0f));
                                    }
                                    chatStatusDrawable.draw(canvas3);
                                    dialogCell4.invalidate();
                                    canvas3.restore();
                                } else {
                                    i12 = 4;
                                }
                            }
                        } else {
                            if (i28 < 0) {
                                i28 = dialogCell4.updateHelper.lastKnownTypingType;
                            }
                            chatStatusDrawable = Theme.getChatStatusDrawable(i28);
                            if (chatStatusDrawable != null) {
                                canvas3.save();
                                int color17 = Theme.getColor(Theme.key_chats_actionMessage);
                                chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(color17, (int) (Color.alpha(color17) * dialogCell4.updateHelper.typingProgres)));
                                dialogUpdateHelper2 = dialogCell4.updateHelper;
                                if (dialogUpdateHelper2.typingOutToTop) {
                                    fDp5 = dialogCell4.messageTop + ((1.0f - dialogUpdateHelper2.typingProgres) * f47);
                                } else {
                                    fDp5 = dialogCell4.messageTop - ((1.0f - dialogUpdateHelper2.typingProgres) * f47);
                                }
                                if (dialogCell4.useForceThreeLines) {
                                    if (dialogCell4.isForumCell()) {
                                        f48 = 10.0f;
                                    } else {
                                        f48 = 11.0f;
                                    }
                                    fDp5 -= AndroidUtilities.dp(f48);
                                } else {
                                    if (dialogCell4.isForumCell()) {
                                        f48 = 10.0f;
                                    } else {
                                        f48 = 11.0f;
                                    }
                                    fDp5 -= AndroidUtilities.dp(f48);
                                }
                                i12 = 4;
                                if (i28 != 1) {
                                    float f512 = dialogCell4.statusDrawableLeft;
                                    if (i28 == 1) {
                                        iDp4 = AndroidUtilities.dp(1.0f);
                                    } else {
                                        iDp4 = 0;
                                    }
                                    canvas3.translate(f512, fDp5 + iDp4);
                                } else {
                                    float f513 = dialogCell4.statusDrawableLeft;
                                    if (i28 == 1) {
                                        iDp4 = AndroidUtilities.dp(1.0f);
                                    } else {
                                        iDp4 = 0;
                                    }
                                    canvas3.translate(f513, fDp5 + iDp4);
                                }
                                chatStatusDrawable.draw(canvas3);
                                dialogCell4.invalidate();
                                canvas3.restore();
                            } else {
                                i12 = 4;
                            }
                        }
                    }
                } else {
                    i12 = 4;
                    f32 = 0.0f;
                }
                if (dialogCell4.buttonLayout != null) {
                    canvas3.save();
                    if (dialogCell4.buttonBackgroundPaint == null) {
                        dialogCell4.buttonBackgroundPaint = new Paint(1);
                    }
                    if (dialogCell4.canvasButton == null) {
                        CanvasButton canvasButton3 = new CanvasButton(dialogCell4);
                        dialogCell4.canvasButton = canvasButton3;
                        canvasButton3.setDelegate(new Runnable() {
                            @Override
                            public final void run() {
                                DialogCell.$r8$lambda$Bm6dPIvEl1CBIJ0rkgFJeuc8aDc(this.f$0);
                            }
                        });
                        dialogCell4.canvasButton.setLongPress(new Runnable() {
                            @Override
                            public final void run() {
                                DialogCell.$r8$lambda$es4jnDRNX4B_rZRqrp8h9ARVsrg(this.f$0);
                            }
                        });
                    }
                    if (dialogCell4.lastTopicMessageUnread && dialogCell4.topMessageTopicEndIndex != dialogCell4.topMessageTopicStartIndex && ((i25 = dialogCell4.dialogsType) == 0 || i25 == 7 || i25 == 8)) {
                        CanvasButton canvasButton4 = dialogCell4.canvasButton;
                        int color18 = dialogCell4.currentMessagePaint.getColor();
                        if (Theme.isCurrentThemeDark()) {
                            i26 = 36;
                        } else {
                            i26 = 26;
                        }
                        canvasButton4.setColor(ColorUtils.setAlphaComponent(color18, i26));
                        if (!dialogCell4.buttonCreated) {
                            dialogCell4.canvasButton.rewind();
                            i27 = dialogCell4.topMessageTopicEndIndex;
                            if (i27 != dialogCell4.topMessageTopicStartIndex && i27 > 0) {
                                float fDp12 = dialogCell4.messageTop;
                                if (((dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                                }
                                rectF2 = AndroidUtilities.rectTmp;
                                float fDp13 = dialogCell4.messageLeft + AndroidUtilities.dp(2.0f) + dialogCell4.messageLayout.getPrimaryHorizontal(0);
                                float f68 = dialogCell4.messageLeft;
                                StaticLayout staticLayout10 = dialogCell4.messageLayout;
                                rectF2.set(fDp13, fDp12, (f68 + staticLayout10.getPrimaryHorizontal(Math.min(staticLayout10.getText().length(), dialogCell4.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), dialogCell4.buttonTop - AndroidUtilities.dp(f3));
                                rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(f3));
                                if (rectF2.right > rectF2.left) {
                                    dialogCell4.canvasButton.addRect(rectF2);
                                }
                            }
                            float lineLeft2 = dialogCell4.buttonLayout.getLineLeft(0);
                            RectF rectF11 = AndroidUtilities.rectTmp;
                            rectF11.set(dialogCell4.buttonLeft + lineLeft2 + AndroidUtilities.dp(2.0f), dialogCell4.buttonTop + AndroidUtilities.dp(2.0f), dialogCell4.buttonLeft + lineLeft2 + dialogCell4.buttonLayout.getLineWidth(0) + AndroidUtilities.dp(12.0f), dialogCell4.buttonTop + dialogCell4.buttonLayout.getHeight());
                            rectF11.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                            dialogCell4.canvasButton.addRect(rectF11);
                        }
                        dialogCell4.canvasButton.draw(canvas3);
                        Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                        Drawable drawable8 = Theme.dialogs_forum_arrowDrawable;
                        RectF rectF12 = AndroidUtilities.rectTmp;
                        BaseCell.setDrawableBounds(drawable8, rectF12.right - AndroidUtilities.dp(18.0f), rectF12.top + ((rectF12.height() - Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight()) / 2.0f));
                        Theme.dialogs_forum_arrowDrawable.draw(canvas3);
                    }
                    canvas3.translate(dialogCell4.buttonLeft, dialogCell4.buttonTop);
                    if (!dialogCell4.spoilers2.isEmpty()) {
                        canvas3.save();
                        SpoilerEffect.clipOutCanvas(canvas3, dialogCell4.spoilers2);
                        SpoilerEffect.layoutDrawMaybe(dialogCell4.buttonLayout, canvas3);
                        StaticLayout staticLayout11 = dialogCell4.buttonLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout11, dialogCell4.animatedEmojiStack3, -0.075f, dialogCell4.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(3, staticLayout11.getPaint().getColor()));
                        canvas3.restore();
                        while (i24 < dialogCell4.spoilers2.size()) {
                            SpoilerEffect spoilerEffect3 = (SpoilerEffect) dialogCell4.spoilers2.get(i24);
                            spoilerEffect3.setColor(dialogCell4.buttonLayout.getPaint().getColor());
                            spoilerEffect3.draw(canvas3);
                        }
                    } else {
                        SpoilerEffect.layoutDrawMaybe(dialogCell4.buttonLayout, canvas3);
                        StaticLayout staticLayout12 = dialogCell4.buttonLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout12, dialogCell4.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(3, staticLayout12.getPaint().getColor()));
                    }
                    canvas.restore();
                }
                if (dialogCell4.currentDialogFolderId == 0) {
                    boolean z24 = dialogCell4.drawClock;
                    if (dialogCell4.drawCheck1) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i311 = (z24 ? 1 : 0) + i17;
                    if (dialogCell4.drawCheck2) {
                        i18 = 4;
                    } else {
                        i18 = 0;
                    }
                    i19 = i311 + i18;
                    i20 = dialogCell4.lastStatusDrawableParams;
                    if (i20 >= 0 && i20 != i19 && !dialogCell4.statusDrawableAnimationInProgress) {
                        dialogCell4.createStatusDrawableAnimator(i20, i19);
                    }
                    z11 = dialogCell4.statusDrawableAnimationInProgress;
                    if (z11) {
                        i19 = dialogCell4.animateToStatusDrawableParams;
                    }
                    if ((i19 & 1) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((i19 & 2) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i19 & i12) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z11) {
                        i23 = dialogCell4.animateFromStatusDrawableParams;
                        if ((i23 & 1) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if ((i23 & 2) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i23 & i12) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z12 && !z15 && z17 && !z16 && z13 != 0 && z14 != 0) {
                            canvas3 = canvas;
                            dialogCell4.drawCheckStatus(canvas3, z12, z13, z14, true, dialogCell4.statusDrawableProgress);
                        } else {
                            canvas3 = canvas;
                            dialogCell4.drawCheckStatus(canvas3, z15, z16, z17, false, 1.0f - dialogCell4.statusDrawableProgress);
                            dialogCell4.drawCheckStatus(canvas3, z12, z13, z14, false, dialogCell4.statusDrawableProgress);
                            dialogCell3 = this;
                        }
                        boolean z25 = dialogCell3.drawClock;
                        if (dialogCell3.drawCheck1) {
                            i21 = 2;
                        } else {
                            i21 = 0;
                        }
                        int i312 = (z25 ? 1 : 0) + i21;
                        if (dialogCell3.drawCheck2) {
                            i22 = 4;
                        } else {
                            i22 = 0;
                        }
                        dialogCell3.lastStatusDrawableParams = i312 + i22;
                    } else {
                        dialogCell4 = this;
                        canvas3 = canvas;
                        dialogCell4.drawCheckStatus(canvas3, z12, z13, z14, false, 1.0f);
                    }
                    dialogCell3 = dialogCell4;
                    boolean z26 = dialogCell3.drawClock;
                    if (dialogCell3.drawCheck1) {
                        i21 = 2;
                    } else {
                        i21 = 0;
                    }
                    int i313 = (z26 ? 1 : 0) + i21;
                    if (dialogCell3.drawCheck2) {
                        i22 = 4;
                    } else {
                        i22 = 0;
                    }
                    dialogCell3.lastStatusDrawableParams = i313 + i22;
                } else {
                    canvas3 = canvas;
                    dialogCell3 = dialogCell4;
                }
                if (dialogCell3.drawBotVerified) {
                    if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        f46 = 12.5f;
                    } else {
                        f46 = 15.5f;
                    }
                    iDp3 = AndroidUtilities.dp(f46);
                    if (((dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    swapAnimatedEmojiDrawable = dialogCell3.botVerification;
                    if (swapAnimatedEmojiDrawable != null) {
                        swapAnimatedEmojiDrawable.setBounds(dialogCell3.nameLeft - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + iDp3, dialogCell3.nameLeft - AndroidUtilities.dp(2.0f), iDp3 + AndroidUtilities.dp(16.0f));
                        dialogCell3.botVerification.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                        dialogCell3.botVerification.draw(canvas3);
                    }
                }
                if (dialogCell3.drawUnmute || dialogCell3.dialogMuted || dialogCell3.isHiddenInCommunity) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (dialogCell3.dialogsType != i7 && ((z9 || dialogCell3.dialogMutedProgress > f32) && !dialogCell3.drawVerified && dialogCell3.drawScam == 0)) {
                    if (z9) {
                        f44 = dialogCell3.dialogMutedProgress;
                        if (f44 != 1.0f) {
                            f45 = f44 + 0.10666667f;
                            dialogCell3.dialogMutedProgress = f45;
                            if (f45 > 1.0f) {
                                dialogCell3.dialogMutedProgress = 1.0f;
                            } else {
                                dialogCell3.invalidate();
                            }
                        } else if (!z9) {
                            f39 = dialogCell3.dialogMutedProgress;
                            if (f39 != f32) {
                                f40 = f39 - 0.10666667f;
                                dialogCell3.dialogMutedProgress = f40;
                                if (f40 < f32) {
                                    dialogCell3.dialogMutedProgress = 0.0f;
                                } else {
                                    dialogCell3.invalidate();
                                }
                            }
                        }
                    } else if (!z9) {
                        f39 = dialogCell3.dialogMutedProgress;
                        if (f39 != f32) {
                            f40 = f39 - 0.10666667f;
                            dialogCell3.dialogMutedProgress = f40;
                            if (f40 < f32) {
                                dialogCell3.dialogMutedProgress = 0.0f;
                            } else {
                                dialogCell3.invalidate();
                            }
                        }
                    }
                    if (dialogCell3.drawPremium) {
                        i16 = dialogCell3.nameMutedIconLeft;
                    } else {
                        i16 = dialogCell3.nameMuteLeft;
                    }
                    if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        f41 = 0.0f;
                    } else {
                        f41 = 1.0f;
                    }
                    float fDp14 = i16 - AndroidUtilities.dp(f41);
                    if (SharedConfig.useThreeLinesLayout) {
                        f42 = 13.5f;
                    } else {
                        f42 = 17.5f;
                    }
                    fDp2 = AndroidUtilities.dp(f42);
                    if (((dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                        if (dialogCell3.isForumCell()) {
                            f43 = 8.0f;
                        } else {
                            f43 = 9.0f;
                        }
                        fDp2 -= AndroidUtilities.dp(f43);
                    }
                    BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, fDp14, fDp2);
                    BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, fDp14, fDp2);
                    DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                    if (dialogCell3.dialogMutedProgress != 1.0f) {
                        canvas3.save();
                        float f69 = dialogCell3.dialogMutedProgress;
                        canvas3.scale(f69, f69, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
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
                    if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        f38 = 13.5f;
                    } else {
                        f38 = 16.5f;
                    }
                    float fDp15 = AndroidUtilities.dp(f38);
                    if (((dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp15);
                    BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp15);
                    Theme.dialogs_verifiedDrawable.draw(canvas3);
                    Theme.dialogs_verifiedCheckDrawable.draw(canvas3);
                } else if (dialogCell3.drawPremium) {
                    if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        f34 = 12.5f;
                    } else {
                        f34 = 15.5f;
                    }
                    iDp2 = AndroidUtilities.dp(f34);
                    if (((dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    if (dialogCell3.emojiStatus != null) {
                        dialogCell3.emojiStatusView.setTranslationX((f53 + dialogCell3.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                        dialogCell3.emojiStatusView.setTranslationY((f10 + iDp2) - AndroidUtilities.dp(f3));
                        if (dialogCell3.rightFragmentOpenedProgress > 0.0f) {
                            dialogCell3.emojiStatus.setBounds(dialogCell3.nameMuteLeft - AndroidUtilities.dp(2.0f), iDp2 - AndroidUtilities.dp(f3), dialogCell3.nameMuteLeft + AndroidUtilities.dp(20.0f), (iDp2 - AndroidUtilities.dp(f3)) + AndroidUtilities.dp(22.0f));
                            dialogCell3.emojiStatus.draw(canvas3);
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dialogCell3.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                        z3 = z10;
                    } else {
                        Drawable drawable9 = PremiumGradient.getInstance().premiumStarDrawableMini;
                        int iDp10 = dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f);
                        if (!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f51 = 15.5f;
                        }
                        BaseCell.setDrawableBounds(drawable9, iDp10, AndroidUtilities.dp(f51));
                        drawable9.draw(canvas3);
                    }
                    if (!dialogCell3.drawReorder || dialogCell3.reorderIconProgress != 0.0f) {
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
                        int i314 = dialogCell3.errorLeft;
                        rectF13.set(i314, dialogCell3.errorTop, i314 + AndroidUtilities.dp(20.666f), dialogCell3.errorTop + AndroidUtilities.dp(20.666f));
                        RectF rectF14 = dialogCell3.rect;
                        float f610 = AndroidUtilities.density * 10.5f;
                        canvas3.drawRoundRect(rectF14, f610, f610, Theme.dialogs_errorPaint);
                        BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, dialogCell3.errorLeft + AndroidUtilities.dp(4.5f), dialogCell3.errorTop + AndroidUtilities.dp(5.0f));
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
                                    int i414 = dialogCell.mentionLeft;
                                    dialogCell.rect.set(i414, dialogCell.countTop, i414 + dialogCell.mentionWidth + AndroidUtilities.dp(12.666f), dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                    if (zIsCounterMuted || dialogCell.folderId == 0) {
                                        paint = Theme.dialogs_countPaint;
                                    } else {
                                        paint = Theme.dialogs_countGrayPaint;
                                    }
                                    RectF rectF15 = dialogCell.rect;
                                    canvas3.drawRoundRect(rectF15, rectF15.height() / 2.0f, dialogCell.rect.height() / 2.0f, paint);
                                    Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                    canvas3.save();
                                    canvas3.translate(dialogCell.mentionLeft + AndroidUtilities.dp(6.333f), dialogCell.countTop + AndroidUtilities.dp(f3));
                                    dialogCell.mentionLayout.draw(canvas3);
                                    canvas3.restore();
                                } else {
                                    Drawable drawable10 = Theme.dialogs_mentionDrawable;
                                    drawable10.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                    DrawableUtils.setBounds(drawable10, dialogCell.mentionLeft + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                    drawable10.draw(canvas3);
                                }
                            }
                            if (!dialogCell.drawReactionMention || dialogCell.reactionsMentionsChangeProgress != 1.0f) {
                                int i415 = dialogCell.reactionMentionLeft;
                                dialogCell.rect.set(i415, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i415, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                f35 = dialogCell.reactionsMentionsChangeProgress;
                                if (f35 == 1.0f) {
                                    f35 = 1.0f;
                                } else if (!dialogCell.drawReactionMention) {
                                    f35 = 1.0f - f35;
                                }
                                if (zIsCounterMuted) {
                                    drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                } else {
                                    drawable = Theme.dialogs_reactionsMentionDrawable;
                                }
                                drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                DrawableUtils.setBounds(drawable, i415 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                DrawableUtils.drawWithScale(canvas3, drawable, f35);
                            }
                            if ((!dialogCell.drawPollVotesMention || floatValue > 0.0f) && floatValue != 0.0f) {
                                int i416 = dialogCell.pollVotesMentionLeft;
                                dialogCell.rect.set(i416, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i416, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                if (zIsCounterMuted) {
                                    drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                } else {
                                    drawable2 = Theme.dialogs_pollMentionDrawable;
                                }
                                drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                DrawableUtils.setBounds(drawable2, i416 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
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
                            f36 = dialogCell.updateHelper.typingProgres;
                            if (f36 != 1.0f) {
                                if (f36 > 0.0f) {
                                    canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f36) * 255.0f), 31);
                                    canvas3 = canvas;
                                    if (dialogCell.updateHelper.typingOutToTop) {
                                        fDp = -AndroidUtilities.dp(14.0f);
                                        f37 = dialogCell.updateHelper.typingProgres;
                                    } else {
                                        fDp = AndroidUtilities.dp(14.0f);
                                        f37 = dialogCell.updateHelper.typingProgres;
                                    }
                                    canvas3.translate(0.0f, fDp * f37);
                                }
                                i15 = 0;
                                while (i15 < dialogCell.thumbsCount) {
                                    if (dialogCell.thumbImageSeen[i15]) {
                                        if (dialogCell.thumbBackgroundPaint == null) {
                                            Paint paint12 = new Paint(1);
                                            dialogCell.thumbBackgroundPaint = paint12;
                                            paint12.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                            dialogCell.thumbBackgroundPaint.setColor(0);
                                        }
                                        rectF = AndroidUtilities.rectTmp;
                                        rectF.set(dialogCell.thumbImage[i15].getImageX(), dialogCell.thumbImage[i15].getImageY(), dialogCell.thumbImage[i15].getImageX2(), dialogCell.thumbImage[i15].getImageY2());
                                        dialogCell.thumbImage[i15].draw(canvas3);
                                        if (!dialogCell.drawSpoiler[i15]) {
                                            path = dialogCell.thumbPath;
                                            if (path == null) {
                                                dialogCell.thumbPath = new Path();
                                            } else {
                                                path.rewind();
                                            }
                                            dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i15].getRoundRadius()[0], dialogCell.thumbImage[i15].getRoundRadius()[1], Path.Direction.CW);
                                            canvas3.save();
                                            canvas3.clipPath(dialogCell.thumbPath);
                                            if (dialogCell.thumbSpoiler == null) {
                                                dialogCell.thumbSpoiler = new SpoilerEffect();
                                            }
                                            dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                            dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i15].getImageX(), (int) dialogCell.thumbImage[i15].getImageY(), (int) dialogCell.thumbImage[i15].getImageX2(), (int) dialogCell.thumbImage[i15].getImageY2());
                                            dialogCell.thumbSpoiler.draw(canvas3);
                                            dialogCell.invalidate();
                                            canvas3.restore();
                                        }
                                        if (dialogCell.drawPlay[i15]) {
                                            BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i15].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i7)), (int) (dialogCell.thumbImage[i15].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i7)));
                                            Theme.dialogs_playDrawable.draw(canvas3);
                                        }
                                    }
                                    i15++;
                                    i11 = -1;
                                }
                                i13 = -1;
                                if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                    canvas3.restore();
                                }
                            } else {
                                i13 = -1;
                            }
                        } else {
                            i13 = -1;
                        }
                        dialogCellTags = dialogCell.tags;
                        if (dialogCellTags != null && !dialogCellTags.isEmpty()) {
                            canvas3.save();
                            canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                            dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                            canvas3.restore();
                        }
                        i14 = i10;
                        if (i14 != i13) {
                            canvas3.restoreToCount(i14);
                        }
                        z2 = z8;
                    }
                    dialogCell = dialogCell3;
                    if (dialogCell.thumbsCount > 0) {
                        f36 = dialogCell.updateHelper.typingProgres;
                        if (f36 != 1.0f) {
                            if (f36 > 0.0f) {
                                canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f36) * 255.0f), 31);
                                canvas3 = canvas;
                                if (dialogCell.updateHelper.typingOutToTop) {
                                    fDp = -AndroidUtilities.dp(14.0f);
                                    f37 = dialogCell.updateHelper.typingProgres;
                                } else {
                                    fDp = AndroidUtilities.dp(14.0f);
                                    f37 = dialogCell.updateHelper.typingProgres;
                                }
                                canvas3.translate(0.0f, fDp * f37);
                            }
                            i15 = 0;
                            while (i15 < dialogCell.thumbsCount) {
                                if (dialogCell.thumbImageSeen[i15]) {
                                    if (dialogCell.thumbBackgroundPaint == null) {
                                        Paint paint13 = new Paint(1);
                                        dialogCell.thumbBackgroundPaint = paint13;
                                        paint13.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                        dialogCell.thumbBackgroundPaint.setColor(0);
                                    }
                                    rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dialogCell.thumbImage[i15].getImageX(), dialogCell.thumbImage[i15].getImageY(), dialogCell.thumbImage[i15].getImageX2(), dialogCell.thumbImage[i15].getImageY2());
                                    dialogCell.thumbImage[i15].draw(canvas3);
                                    if (!dialogCell.drawSpoiler[i15]) {
                                        path = dialogCell.thumbPath;
                                        if (path == null) {
                                            dialogCell.thumbPath = new Path();
                                        } else {
                                            path.rewind();
                                        }
                                        dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i15].getRoundRadius()[0], dialogCell.thumbImage[i15].getRoundRadius()[1], Path.Direction.CW);
                                        canvas3.save();
                                        canvas3.clipPath(dialogCell.thumbPath);
                                        if (dialogCell.thumbSpoiler == null) {
                                            dialogCell.thumbSpoiler = new SpoilerEffect();
                                        }
                                        dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                        dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i15].getImageX(), (int) dialogCell.thumbImage[i15].getImageY(), (int) dialogCell.thumbImage[i15].getImageX2(), (int) dialogCell.thumbImage[i15].getImageY2());
                                        dialogCell.thumbSpoiler.draw(canvas3);
                                        dialogCell.invalidate();
                                        canvas3.restore();
                                    }
                                    if (dialogCell.drawPlay[i15]) {
                                        BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i15].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i7)), (int) (dialogCell.thumbImage[i15].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i7)));
                                        Theme.dialogs_playDrawable.draw(canvas3);
                                    }
                                }
                                i15++;
                                i11 = -1;
                            }
                            i13 = -1;
                            if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                canvas3.restore();
                            }
                        } else {
                            i13 = -1;
                        }
                    } else {
                        i13 = -1;
                    }
                    dialogCellTags = dialogCell.tags;
                    if (dialogCellTags != null) {
                        canvas3.save();
                        canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                        dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                        canvas3.restore();
                    }
                    i14 = i10;
                    if (i14 != i13) {
                        canvas3.restoreToCount(i14);
                    }
                    z2 = z8;
                } else if (dialogCell3.drawScam != 0) {
                    if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        f33 = 12.0f;
                    } else {
                        f33 = 15.0f;
                    }
                    int iDp11 = AndroidUtilities.dp(f33);
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
                z3 = false;
                if (!dialogCell3.drawReorder) {
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
                    int i315 = dialogCell3.errorLeft;
                    rectF17.set(i315, dialogCell3.errorTop, i315 + AndroidUtilities.dp(20.666f), dialogCell3.errorTop + AndroidUtilities.dp(20.666f));
                    RectF rectF18 = dialogCell3.rect;
                    float f611 = AndroidUtilities.density * 10.5f;
                    canvas3.drawRoundRect(rectF18, f611, f611, Theme.dialogs_errorPaint);
                    BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, dialogCell3.errorLeft + AndroidUtilities.dp(4.5f), dialogCell3.errorTop + AndroidUtilities.dp(5.0f));
                    Theme.dialogs_errorDrawable.draw(canvas3);
                } else {
                    if (!dialogCell3.drawCount) {
                    }
                    zIsCounterMuted = dialogCell3.isCounterMuted();
                    canvas3 = canvas;
                    drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                    dialogCell = this;
                    if (dialogCell.drawMention) {
                        Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        if (dialogCell.mentionLayout != null) {
                            int i417 = dialogCell.mentionLeft;
                            dialogCell.rect.set(i417, dialogCell.countTop, i417 + dialogCell.mentionWidth + AndroidUtilities.dp(12.666f), dialogCell.countTop + AndroidUtilities.dp(20.666f));
                            if (zIsCounterMuted) {
                                paint = Theme.dialogs_countPaint;
                            } else {
                                paint = Theme.dialogs_countPaint;
                            }
                            RectF rectF19 = dialogCell.rect;
                            canvas3.drawRoundRect(rectF19, rectF19.height() / 2.0f, dialogCell.rect.height() / 2.0f, paint);
                            Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                            canvas3.save();
                            canvas3.translate(dialogCell.mentionLeft + AndroidUtilities.dp(6.333f), dialogCell.countTop + AndroidUtilities.dp(f3));
                            dialogCell.mentionLayout.draw(canvas3);
                            canvas3.restore();
                        } else {
                            Drawable drawable11 = Theme.dialogs_mentionDrawable;
                            drawable11.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                            DrawableUtils.setBounds(drawable11, dialogCell.mentionLeft + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                            drawable11.draw(canvas3);
                        }
                    }
                    if (!dialogCell.drawReactionMention) {
                        int i418 = dialogCell.reactionMentionLeft;
                        dialogCell.rect.set(i418, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i418, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                        f35 = dialogCell.reactionsMentionsChangeProgress;
                        if (f35 == 1.0f) {
                            f35 = 1.0f;
                        } else if (!dialogCell.drawReactionMention) {
                            f35 = 1.0f - f35;
                        }
                        if (zIsCounterMuted) {
                            drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                        } else {
                            drawable = Theme.dialogs_reactionsMentionDrawable;
                        }
                        drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable, i418 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                        DrawableUtils.drawWithScale(canvas3, drawable, f35);
                    } else {
                        int i419 = dialogCell.reactionMentionLeft;
                        dialogCell.rect.set(i419, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i419, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                        f35 = dialogCell.reactionsMentionsChangeProgress;
                        if (f35 == 1.0f) {
                            f35 = 1.0f;
                        } else if (!dialogCell.drawReactionMention) {
                            f35 = 1.0f - f35;
                        }
                        if (zIsCounterMuted) {
                            drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                        } else {
                            drawable = Theme.dialogs_reactionsMentionDrawable;
                        }
                        drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable, i419 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                        DrawableUtils.drawWithScale(canvas3, drawable, f35);
                    }
                    if (!dialogCell.drawPollVotesMention) {
                        int i4110 = dialogCell.pollVotesMentionLeft;
                        dialogCell.rect.set(i4110, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i4110, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                        if (zIsCounterMuted) {
                            drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                        } else {
                            drawable2 = Theme.dialogs_pollMentionDrawable;
                        }
                        drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable2, i4110 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                        DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                    } else {
                        int i4111 = dialogCell.pollVotesMentionLeft;
                        dialogCell.rect.set(i4111, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i4111, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                        if (zIsCounterMuted) {
                            drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                        } else {
                            drawable2 = Theme.dialogs_pollMentionDrawable;
                        }
                        drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable2, i4111 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                        DrawableUtils.drawWithScale(canvas3, drawable2, floatValue);
                    }
                    if (dialogCell.thumbsCount > 0) {
                        f36 = dialogCell.updateHelper.typingProgres;
                        if (f36 != 1.0f) {
                            if (f36 > 0.0f) {
                                canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f36) * 255.0f), 31);
                                canvas3 = canvas;
                                if (dialogCell.updateHelper.typingOutToTop) {
                                    fDp = -AndroidUtilities.dp(14.0f);
                                    f37 = dialogCell.updateHelper.typingProgres;
                                } else {
                                    fDp = AndroidUtilities.dp(14.0f);
                                    f37 = dialogCell.updateHelper.typingProgres;
                                }
                                canvas3.translate(0.0f, fDp * f37);
                            }
                            i15 = 0;
                            while (i15 < dialogCell.thumbsCount) {
                                if (dialogCell.thumbImageSeen[i15]) {
                                    if (dialogCell.thumbBackgroundPaint == null) {
                                        Paint paint14 = new Paint(1);
                                        dialogCell.thumbBackgroundPaint = paint14;
                                        paint14.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                        dialogCell.thumbBackgroundPaint.setColor(0);
                                    }
                                    rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dialogCell.thumbImage[i15].getImageX(), dialogCell.thumbImage[i15].getImageY(), dialogCell.thumbImage[i15].getImageX2(), dialogCell.thumbImage[i15].getImageY2());
                                    dialogCell.thumbImage[i15].draw(canvas3);
                                    if (!dialogCell.drawSpoiler[i15]) {
                                        path = dialogCell.thumbPath;
                                        if (path == null) {
                                            dialogCell.thumbPath = new Path();
                                        } else {
                                            path.rewind();
                                        }
                                        dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i15].getRoundRadius()[0], dialogCell.thumbImage[i15].getRoundRadius()[1], Path.Direction.CW);
                                        canvas3.save();
                                        canvas3.clipPath(dialogCell.thumbPath);
                                        if (dialogCell.thumbSpoiler == null) {
                                            dialogCell.thumbSpoiler = new SpoilerEffect();
                                        }
                                        dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                        dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i15].getImageX(), (int) dialogCell.thumbImage[i15].getImageY(), (int) dialogCell.thumbImage[i15].getImageX2(), (int) dialogCell.thumbImage[i15].getImageY2());
                                        dialogCell.thumbSpoiler.draw(canvas3);
                                        dialogCell.invalidate();
                                        canvas3.restore();
                                    }
                                    if (dialogCell.drawPlay[i15]) {
                                        BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i15].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i7)), (int) (dialogCell.thumbImage[i15].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i7)));
                                        Theme.dialogs_playDrawable.draw(canvas3);
                                    }
                                }
                                i15++;
                                i11 = -1;
                            }
                            i13 = -1;
                            if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                canvas3.restore();
                            }
                        } else {
                            i13 = -1;
                        }
                    } else {
                        i13 = -1;
                    }
                    dialogCellTags = dialogCell.tags;
                    if (dialogCellTags != null) {
                        canvas3.save();
                        canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                        dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                        canvas3.restore();
                    }
                    i14 = i10;
                    if (i14 != i13) {
                        canvas3.restoreToCount(i14);
                    }
                    z2 = z8;
                }
                dialogCell = dialogCell3;
                if (dialogCell.thumbsCount > 0) {
                    f36 = dialogCell.updateHelper.typingProgres;
                    if (f36 != 1.0f) {
                        if (f36 > 0.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f36) * 255.0f), 31);
                            canvas3 = canvas;
                            if (dialogCell.updateHelper.typingOutToTop) {
                                fDp = -AndroidUtilities.dp(14.0f);
                                f37 = dialogCell.updateHelper.typingProgres;
                            } else {
                                fDp = AndroidUtilities.dp(14.0f);
                                f37 = dialogCell.updateHelper.typingProgres;
                            }
                            canvas3.translate(0.0f, fDp * f37);
                        }
                        i15 = 0;
                        while (i15 < dialogCell.thumbsCount) {
                            if (dialogCell.thumbImageSeen[i15]) {
                                if (dialogCell.thumbBackgroundPaint == null) {
                                    Paint paint15 = new Paint(1);
                                    dialogCell.thumbBackgroundPaint = paint15;
                                    paint15.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                    dialogCell.thumbBackgroundPaint.setColor(0);
                                }
                                rectF = AndroidUtilities.rectTmp;
                                rectF.set(dialogCell.thumbImage[i15].getImageX(), dialogCell.thumbImage[i15].getImageY(), dialogCell.thumbImage[i15].getImageX2(), dialogCell.thumbImage[i15].getImageY2());
                                dialogCell.thumbImage[i15].draw(canvas3);
                                if (!dialogCell.drawSpoiler[i15]) {
                                    path = dialogCell.thumbPath;
                                    if (path == null) {
                                        dialogCell.thumbPath = new Path();
                                    } else {
                                        path.rewind();
                                    }
                                    dialogCell.thumbPath.addRoundRect(rectF, dialogCell.thumbImage[i15].getRoundRadius()[0], dialogCell.thumbImage[i15].getRoundRadius()[1], Path.Direction.CW);
                                    canvas3.save();
                                    canvas3.clipPath(dialogCell.thumbPath);
                                    if (dialogCell.thumbSpoiler == null) {
                                        dialogCell.thumbSpoiler = new SpoilerEffect();
                                    }
                                    dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                    dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i15].getImageX(), (int) dialogCell.thumbImage[i15].getImageY(), (int) dialogCell.thumbImage[i15].getImageX2(), (int) dialogCell.thumbImage[i15].getImageY2());
                                    dialogCell.thumbSpoiler.draw(canvas3);
                                    dialogCell.invalidate();
                                    canvas3.restore();
                                }
                                if (dialogCell.drawPlay[i15]) {
                                    BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i15].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i7)), (int) (dialogCell.thumbImage[i15].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i7)));
                                    Theme.dialogs_playDrawable.draw(canvas3);
                                }
                            }
                            i15++;
                            i11 = -1;
                        }
                        i13 = -1;
                        if (dialogCell.updateHelper.typingProgres > 0.0f) {
                            canvas3.restore();
                        }
                    } else {
                        i13 = -1;
                    }
                } else {
                    i13 = -1;
                }
                dialogCellTags = dialogCell.tags;
                if (dialogCellTags != null) {
                    canvas3.save();
                    canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                    dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                    canvas3.restore();
                }
                i14 = i10;
                if (i14 != i13) {
                    canvas3.restoreToCount(i14);
                }
                z2 = z8;
            } else {
                dialogCell = dialogCell4;
                i7 = 2;
                f11 = 10.0f;
                z2 = false;
                z3 = false;
            }
            if (dialogCell.animatingArchiveAvatar) {
                canvas3.save();
                f12 = 170.0f;
                float interpolation7 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                canvas3.scale(interpolation7, interpolation7, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
            } else {
                f12 = 170.0f;
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
                    DrawableUtils.setBounds(dialogCell.avatarImage, dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dpf2(1.0f), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), 17);
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
                    int i4112 = avatarStoryParams.forceState;
                    if (z6) {
                        avatarStoryParams.forceState = 1;
                    }
                    StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                    if (dialogCell.storyParams.drawnLive) {
                        dialogCell.checkTtl();
                    }
                    dialogCell.storyParams.forceState = i4112;
                }
                if (!dialogCell.insideCommunityList && ((((chat = dialogCell.chat) != null && chat.linked_community_id != 0) || ((user = dialogCell.user) != null && user.linked_community_id != 0)) && !dialogCell.drawCommunityAvatar && dialogCell.isDialogCell && !dialogCell.isDialogFolder())) {
                    float fCenterX5 = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                    float fCenterY5 = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                    if (dialogCell.communityArrowDrawable == null) {
                        dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                    }
                    DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX5, fCenterY5, 17);
                    canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                    dialogCell.communityArrowDrawable.draw(canvas3);
                }
            }
            if (dialogCell.animatingArchiveAvatar) {
                canvas3.restore();
            }
            if (dialogCell.avatarImage.getVisible() || !drawAvatarOverlays(canvas)) {
                z4 = z2;
            } else {
                z4 = true;
            }
            if (dialogCell.rightFragmentOpenedProgress > 0.0f || dialogCell.currentDialogFolderId != 0) {
                dialogCell2 = dialogCell;
            } else {
                boolean zIsCounterMuted2 = dialogCell.isCounterMuted();
                RectF rectF20 = dialogCell.storyParams.originalAvatarRect;
                int iWidth = (int) (((rectF20.left + rectF20.width()) - dialogCell.countWidth) - AndroidUtilities.dp(5.0f));
                RectF rectF21 = dialogCell.storyParams.originalAvatarRect;
                drawCounter(canvas3, zIsCounterMuted2, (int) ((dialogCell.avatarImage.getImageY() + dialogCell.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), iWidth, (int) (((rectF21.left + rectF21.width()) - dialogCell.countWidthOld) - AndroidUtilities.dp(5.0f)), dialogCell.rightFragmentOpenedProgress, true);
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
                canvas3.clipRect(0.0f, dialogCell2.getMeasuredHeight() * (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                dialogCell2.archivedChatsDrawable.draw(canvas3);
                canvas3.restore();
            }
            if (dialogCell2.useSeparator) {
                f13 = 0.0f;
            } else {
                if (dialogCell2.fullSeparator || (!(dialogCell2.currentDialogFolderId == 0 || !dialogCell2.archiveHidden || dialogCell2.fullSeparator2) || (dialogCell2.fullSeparator2 && !dialogCell2.archiveHidden))) {
                    iDp = 0;
                } else {
                    iDp = AndroidUtilities.dp(dialogCell2.messagePaddingStart);
                }
                if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                    alpha = Theme.dividerPaint.getAlpha();
                    f30 = dialogCell2.rightFragmentOpenedProgress;
                    if (f30 != 0.0f) {
                        Theme.dividerPaint.setAlpha((int) (alpha * (1.0f - f30)));
                    }
                    measuredHeight2 = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                    if (LocaleController.isRTL) {
                        canvas.drawLine(0.0f, measuredHeight2, dialogCell2.getMeasuredWidth() - iDp, measuredHeight2, Theme.dividerPaint);
                    } else {
                        canvas.drawLine(iDp, measuredHeight2, dialogCell2.getMeasuredWidth(), measuredHeight2, Theme.dividerPaint);
                    }
                    f13 = 0.0f;
                    if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                        Theme.dividerPaint.setAlpha(alpha);
                    }
                } else {
                    f13 = 0.0f;
                }
            }
            if (dialogCell2.clipProgress == f13) {
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
            if (z19) {
                float f612 = 1.0f - pullProgress;
                int measuredHeight7 = (int) (dialogCell2.getMeasuredHeight() * f612);
                color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                if (dialogCell2.archiveFadeGradientDrawable == null) {
                    dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                }
                if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                    dialogCell2.archiveFadeGradientDrawableColor = color3;
                    dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                }
                float fClamp6 = MathUtils.clamp((f612 - 0.05f) * f11, 0.0f, 1.0f);
                dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight7, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight7);
                dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp6 * 255.0f));
                dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                canvas2.restore();
            }
            z5 = dialogCell2.drawReorder;
            if (z5 || dialogCell2.reorderIconProgress != 0.0f) {
                if (z5) {
                    f17 = dialogCell2.reorderIconProgress;
                    if (f17 < 1.0f) {
                        f18 = f17 + 0.09411765f;
                        dialogCell2.reorderIconProgress = f18;
                        if (f18 > 1.0f) {
                            dialogCell2.reorderIconProgress = 1.0f;
                        }
                        f15 = 0.0f;
                    } else {
                        f15 = 0.0f;
                    }
                } else {
                    f14 = dialogCell2.reorderIconProgress;
                    f15 = 0.0f;
                    if (f14 > 0.0f) {
                        f16 = f14 - 0.09411765f;
                        dialogCell2.reorderIconProgress = f16;
                        if (f16 < 0.0f) {
                            dialogCell2.reorderIconProgress = 0.0f;
                        }
                    }
                }
                z4 = true;
            } else {
                f15 = 0.0f;
            }
            if (dialogCell2.archiveHidden) {
                f28 = dialogCell2.archiveBackgroundProgress;
                if (f28 > f15) {
                    f29 = f28 - 0.069565214f;
                    dialogCell2.archiveBackgroundProgress = f29;
                    if (f29 < f15) {
                        dialogCell2.archiveBackgroundProgress = f15;
                    }
                    if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                        dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                    }
                    z4 = true;
                }
            } else {
                f19 = dialogCell2.archiveBackgroundProgress;
                if (f19 < 1.0f) {
                    f20 = f19 + 0.069565214f;
                    dialogCell2.archiveBackgroundProgress = f20;
                    if (f20 > 1.0f) {
                        dialogCell2.archiveBackgroundProgress = 1.0f;
                    }
                    if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                        dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                    }
                    z4 = true;
                }
            }
            if (dialogCell2.animatingArchiveAvatar) {
                f27 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                dialogCell2.animatingArchiveAvatarProgress = f27;
                if (f27 >= f12) {
                    dialogCell2.animatingArchiveAvatarProgress = f12;
                    dialogCell2.animatingArchiveAvatar = false;
                }
                z4 = true;
            }
            if (dialogCell2.drawRevealBackground) {
                f23 = dialogCell2.currentRevealBounceProgress;
                if (f23 < 1.0f) {
                    f26 = f23 + 0.09411765f;
                    dialogCell2.currentRevealBounceProgress = f26;
                    if (f26 > 1.0f) {
                        dialogCell2.currentRevealBounceProgress = 1.0f;
                        z4 = true;
                    }
                }
                f24 = dialogCell2.currentRevealProgress;
                if (f24 < 1.0f) {
                    f25 = f24 + 0.053333335f;
                    dialogCell2.currentRevealProgress = f25;
                    if (f25 > 1.0f) {
                        dialogCell2.currentRevealProgress = 1.0f;
                    }
                    z4 = true;
                }
            } else {
                if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                    dialogCell2.currentRevealBounceProgress = 0.0f;
                    z4 = true;
                }
                f21 = dialogCell2.currentRevealProgress;
                if (f21 > 0.0f) {
                    f22 = f21 - 0.053333335f;
                    dialogCell2.currentRevealProgress = f22;
                    if (f22 < 0.0f) {
                        dialogCell2.currentRevealProgress = 0.0f;
                    }
                    z4 = true;
                }
            }
            View view5 = dialogCell2.emojiStatusView;
            if (z3) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            view5.setVisibility(i8);
            if (z4) {
                dialogCell2.invalidate();
            }
        }
    }

    public static void $r8$lambda$Bm6dPIvEl1CBIJ0rkgFJeuc8aDc(DialogCell dialogCell) {
        DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
        if (dialogCellDelegate != null) {
            dialogCellDelegate.onButtonClicked(dialogCell);
        }
    }

    public static void $r8$lambda$es4jnDRNX4B_rZRqrp8h9ARVsrg(DialogCell dialogCell) {
        DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
        if (dialogCellDelegate != null) {
            dialogCellDelegate.onButtonLongPress(dialogCell);
        }
    }

    private TextPaint getTimeTextPaint() {
        if (this.drawCount) {
            return isCounterMuted() ? Theme.dialogs_timePaintBold : Theme.dialogs_timePaintBoldAccent;
        }
        return Theme.dialogs_timePaint;
    }

    private boolean isCounterMuted() {
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

    @Override
    public boolean drawAvatarOverlays(Canvas canvas) {
        boolean z;
        float f;
        int iDp;
        int i;
        float f2;
        float fDp;
        float fDp2;
        float fDp3;
        float f3;
        float fDp4;
        float fDp5;
        float f4;
        float fDp6;
        float f5;
        boolean z2;
        float f6;
        float fDp7;
        float fDp8;
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
            int color = Theme.getColor(Theme.key_windowBackgroundWhite);
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
            int i2 = (int) imageX2;
            int i3 = (int) imageY2;
            int i4 = i3 - iDp2;
            rect.set((AndroidUtilities.dp(1.66f) + i2) - iDp2, i4, AndroidUtilities.dp(1.66f) + i2, i3);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.starBg.setBounds(rect);
            int i5 = (int) (progress * 255.0f);
            this.starBg.setAlpha(i5);
            this.starBg.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i2) - iDp2, i4, i2 + AndroidUtilities.dp(1.66f), i3);
            this.starFg.setBounds(rect);
            this.starFg.setAlpha(i5);
            this.starFg.draw(canvas);
            z = true;
        }
        float f7 = this.premiumBlockedT.set(this.premiumBlocked && !z);
        float f8 = 10.0f;
        if (f7 > 0.0f) {
            float centerY = this.avatarImage.getCenterY() + AndroidUtilities.dp(18.0f);
            float centerX = this.avatarImage.getCenterX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * f7, Theme.dialogs_onlineCirclePaint);
            if (this.premiumGradient == null) {
                this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, this.resourcesProvider);
            }
            this.premiumGradient.gradientMatrix((int) (centerX - AndroidUtilities.dp(10.0f)), (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), (int) (AndroidUtilities.dp(10.0f) + centerY), 0.0f, 0.0f);
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * f7, this.premiumGradient.paint);
            if (this.lockDrawable == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable2 = this.lockDrawable;
            drawable2.setBounds((int) (centerX - (((drawable2.getIntrinsicWidth() / 2.0f) * 0.875f) * f7)), (int) (centerY - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f7)), (int) (centerX + ((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f7)), (int) (centerY + ((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f7)));
            this.lockDrawable.setAlpha((int) (f7 * 255.0f));
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
                int i6 = this.ttlPeriod;
                if (time != i6 && i6 > 0) {
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
            if (LocaleController.isRTL) {
                fDp8 = this.storyParams.originalAvatarRect.left + AndroidUtilities.dp(9.0f);
            } else {
                fDp8 = this.storyParams.originalAvatarRect.right - AndroidUtilities.dp(9.0f);
            }
            int i7 = (int) fDp8;
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
            float progress2 = this.ttlProgress * (1.0f - this.rightFragmentOpenedProgress);
            CheckBox2 checkBox3 = this.checkBox;
            if (checkBox3 != null) {
                progress2 *= 1.0f - checkBox3.getProgress();
            }
            float f9 = i7;
            float f10 = imageY3;
            canvas.scale(progress2, progress2, f9, f10);
            canvas.drawCircle(f9, f10, AndroidUtilities.dpf2(11.0f), this.timerPaint);
            canvas.drawCircle(f9, f10, AndroidUtilities.dpf2(11.0f), this.timerPaint2);
            canvas.save();
            canvas.translate(f9 - AndroidUtilities.dpf2(11.0f), f10 - AndroidUtilities.dpf2(11.0f));
            this.timerDrawable.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.user;
        if (user != null && !MessagesController.isSupportUser(user) && !this.user.bot) {
            boolean zIsOnline = isOnline();
            this.wasDrawnOnline = zIsOnline;
            if (zIsOnline || this.onlineProgress != 0.0f) {
                int iDp3 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                if (LocaleController.isRTL) {
                    float f11 = this.storyParams.originalAvatarRect.left;
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f8 = 6.0f;
                    }
                    fDp7 = f11 + AndroidUtilities.dp(f8);
                } else {
                    float f12 = this.storyParams.originalAvatarRect.right;
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f8 = 6.0f;
                    }
                    fDp7 = f12 - AndroidUtilities.dp(f8);
                }
                int i8 = (int) fDp7;
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                float f13 = i8;
                float f14 = iDp3;
                canvas.drawCircle(f13, f14, AndroidUtilities.dp(7.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                canvas.drawCircle(f13, f14, AndroidUtilities.dp(5.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
                if (zIsOnline) {
                    float f15 = this.onlineProgress;
                    if (f15 < 1.0f) {
                        float f16 = f15 + 0.10666667f;
                        this.onlineProgress = f16;
                        if (f16 > 1.0f) {
                            this.onlineProgress = 1.0f;
                        }
                        z3 = true;
                    }
                } else {
                    float f17 = this.onlineProgress;
                    if (f17 > 0.0f) {
                        float f18 = f17 - 0.10666667f;
                        this.onlineProgress = f18;
                        if (f18 < 0.0f) {
                            this.onlineProgress = 0.0f;
                        }
                        z3 = true;
                    }
                }
            }
        } else {
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
                        f = 9.0f;
                        if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f8 = 6.0f;
                        }
                        iDp = (int) (f19 + AndroidUtilities.dp(f8));
                    } else {
                        f = 9.0f;
                        float f20 = this.storyParams.originalAvatarRect.right;
                        if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f8 = 6.0f;
                        }
                        iDp = (int) (f20 - AndroidUtilities.dp(f8));
                    }
                    if (this.rightFragmentOpenedProgress != 0.0f) {
                        canvas.save();
                        float f21 = 1.0f - this.rightFragmentOpenedProgress;
                        canvas.scale(f21, f21, iDp, iDp4);
                    }
                    Paint paint2 = Theme.dialogs_onlineCirclePaint;
                    int i9 = Theme.key_windowBackgroundWhite;
                    paint2.setColor(Theme.getColor(i9, this.resourcesProvider));
                    float f22 = iDp;
                    float f23 = iDp4;
                    canvas.drawCircle(f22, f23, AndroidUtilities.dp(11.0f) * this.chatCallProgress * progress3, Theme.dialogs_onlineCirclePaint);
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                    canvas.drawCircle(f22, f23, AndroidUtilities.dp(f) * this.chatCallProgress * progress3, Theme.dialogs_onlineCirclePaint);
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(i9, this.resourcesProvider));
                    if (!LiteMode.isEnabled(360928)) {
                        this.innerProgress = 0.65f;
                    }
                    int i10 = this.progressStage;
                    if (i10 == 0) {
                        i = 360928;
                        fDp = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.innerProgress);
                        f2 = 0.10666667f;
                        fDp6 = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.innerProgress);
                    } else {
                        i = 360928;
                        f2 = 0.10666667f;
                        if (i10 == 1) {
                            fDp = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                            fDp2 = AndroidUtilities.dp(1.0f);
                            fDp3 = AndroidUtilities.dp(4.0f);
                            f3 = this.innerProgress;
                        } else {
                            if (i10 == 2) {
                                fDp = (AndroidUtilities.dp(2.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                                fDp4 = AndroidUtilities.dp(5.0f);
                                fDp5 = AndroidUtilities.dp(4.0f);
                                f4 = this.innerProgress;
                            } else if (i10 == 3) {
                                fDp = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.innerProgress);
                                fDp2 = AndroidUtilities.dp(1.0f);
                                fDp3 = AndroidUtilities.dp(2.0f);
                                f3 = this.innerProgress;
                            } else if (i10 == 4) {
                                fDp = (AndroidUtilities.dp(4.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                                fDp4 = AndroidUtilities.dp(3.0f);
                                fDp5 = AndroidUtilities.dp(2.0f);
                                f4 = this.innerProgress;
                            } else if (i10 == 5) {
                                fDp = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                fDp2 = AndroidUtilities.dp(1.0f);
                                fDp3 = AndroidUtilities.dp(4.0f);
                                f3 = this.innerProgress;
                            } else if (i10 == 6) {
                                fDp = (AndroidUtilities.dp(4.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                                fDp4 = AndroidUtilities.dp(5.0f);
                                fDp5 = AndroidUtilities.dp(4.0f);
                                f4 = this.innerProgress;
                            } else {
                                fDp = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                fDp2 = AndroidUtilities.dp(1.0f);
                                fDp3 = AndroidUtilities.dp(2.0f);
                                f3 = this.innerProgress;
                            }
                            fDp6 = fDp4 - (fDp5 * f4);
                        }
                        fDp6 = fDp2 + (fDp3 * f3);
                    }
                    if (this.chatCallProgress < 1.0f || progress3 < 1.0f) {
                        canvas.save();
                        float f24 = this.chatCallProgress * progress3;
                        canvas.scale(f24, f24, f22, f23);
                    }
                    this.rect.set(iDp - AndroidUtilities.dp(1.0f), f23 - fDp, iDp + AndroidUtilities.dp(1.0f), fDp + f23);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    float f25 = f23 - fDp6;
                    float f26 = f23 + fDp6;
                    this.rect.set(iDp - AndroidUtilities.dp(5.0f), f25, iDp - AndroidUtilities.dp(3.0f), f26);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    this.rect.set(AndroidUtilities.dp(3.0f) + iDp, f25, iDp + AndroidUtilities.dp(5.0f), f26);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    if (this.chatCallProgress < 1.0f || progress3 < 1.0f) {
                        canvas.restore();
                    }
                    if (LiteMode.isEnabled(i)) {
                        float f27 = this.innerProgress + 0.04f;
                        this.innerProgress = f27;
                        if (f27 >= 1.0f) {
                            this.innerProgress = 0.0f;
                            int i11 = this.progressStage + 1;
                            this.progressStage = i11;
                            if (i11 >= 8) {
                                this.progressStage = 0;
                            }
                        }
                        z3 = true;
                    }
                    if (this.hasCall) {
                        float f28 = this.chatCallProgress;
                        if (f28 < 1.0f) {
                            float f29 = f28 + f2;
                            this.chatCallProgress = f29;
                            if (f29 > 1.0f) {
                                this.chatCallProgress = 1.0f;
                            }
                        }
                    } else {
                        float f30 = this.chatCallProgress;
                        if (f30 > 0.0f) {
                            float f31 = f30 - f2;
                            this.chatCallProgress = f31;
                            if (f31 < 0.0f) {
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
                f6 = this.ttlProgress;
                if (f6 < 1.0f) {
                    this.ttlProgress = f6 + f2;
                    z2 = true;
                } else {
                    z2 = z3;
                }
            } else {
                f5 = this.ttlProgress;
                if (f5 > 0.0f) {
                    this.ttlProgress = f5 - f2;
                    z2 = true;
                } else {
                    z2 = z3;
                }
            }
            this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
            return z2;
        }
        f2 = 0.10666667f;
        if (this.showTtl) {
            f6 = this.ttlProgress;
            if (f6 < 1.0f) {
                this.ttlProgress = f6 + f2;
                z2 = true;
            } else {
                z2 = z3;
            }
        } else {
            f5 = this.ttlProgress;
            if (f5 > 0.0f) {
                this.ttlProgress = f5 - f2;
                z2 = true;
            } else {
                z2 = z3;
            }
        }
        this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
        return z2;
    }

    private void drawCounter(Canvas canvas, boolean z, int i, int i2, int i3, float f, boolean z2) {
        Paint paint;
        boolean z3;
        RectF rectF;
        float interpolation;
        RectF rectF2;
        boolean z4 = isForumCell() || isFolderCell();
        if (!(this.drawCount && this.drawCount2) && this.countChangeProgress == 1.0f) {
            return;
        }
        float f2 = (this.unreadCount != 0 || this.markUnread) ? this.countChangeProgress : 1.0f - this.countChangeProgress;
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
            int color = Theme.getColor(Theme.key_chats_pinnedOverlay);
            this.counterPaintOutline.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhite), ColorUtils.setAlphaComponent(color, 255), Color.alpha(color) / 255.0f));
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
            paint.setAlpha((int) ((1.0f - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
            float f3 = i;
            this.rect.set(i2, f3, this.countWidth + i2 + AndroidUtilities.dp(12.666f), i + AndroidUtilities.dp(20.666f));
            int iSave = canvas.save();
            if (f != 1.0f) {
                canvas.scale(f, f, this.rect.centerX(), this.rect.centerY());
            }
            if (f2 != 1.0f) {
                canvas.scale(f2, f2, this.rect.centerX(), this.rect.centerY());
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
                canvas.translate(i2 + AndroidUtilities.dp(6.333f), f3 + AndroidUtilities.dpf2(3.0f));
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(iSave);
        } else {
            paint.setAlpha((int) ((1.0f - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
            float f4 = f2 * 2.0f;
            float f5 = f4 > 1.0f ? 1.0f : f4;
            float f6 = 1.0f - f5;
            float f7 = (i2 * f5) + (i3 * f6);
            float f8 = i;
            this.rect.set(f7, f8, (this.countWidth * f5) + f7 + (this.countWidthOld * f6) + AndroidUtilities.dp(12.666f), i + AndroidUtilities.dp(20.666f));
            if (f2 <= 0.5f) {
                interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f4);
            } else {
                interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(1.0f - ((f2 - 0.5f) * 2.0f));
            }
            float f9 = (interpolation * 0.1f) + 1.0f;
            canvas.save();
            float f10 = f9 * f;
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
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f7, AndroidUtilities.dpf2(3.0f) + f8);
                this.countAnimationStableLayout.draw(canvas);
                canvas.restore();
            }
            int alpha = Theme.dialogs_countTextPaint2.getAlpha();
            float f11 = alpha;
            Theme.dialogs_countTextPaint2.setAlpha((int) (f11 * f5));
            if (this.countAnimationInLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f7, ((this.countAnimationIncrement ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f6) + f8 + AndroidUtilities.dpf2(3.0f));
                this.countAnimationInLayout.draw(canvas);
                canvas.restore();
            } else if (this.countLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f7, ((this.countAnimationIncrement ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f6) + f8 + AndroidUtilities.dpf2(3.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countOldLayout != null) {
                Theme.dialogs_countTextPaint2.setAlpha((int) (f11 * f6));
                canvas.save();
                canvas.translate(f7 + AndroidUtilities.dpf2(6.333f), ((this.countAnimationIncrement ? -AndroidUtilities.dp(17.0f) : AndroidUtilities.dp(17.0f)) * f5) + f8 + AndroidUtilities.dpf2(3.0f));
                this.countOldLayout.draw(canvas);
                canvas.restore();
            }
            Theme.dialogs_countTextPaint2.setAlpha(alpha);
            canvas.restore();
        }
        if (z3) {
            Theme.dialogs_countTextPaint2.setColor(Theme.getColor(Theme.key_chats_unreadCounterText));
        }
    }

    public void createStatusDrawableAnimator(int i, int i2) {
        this.statusDrawableProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.statusDrawableAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(220L);
        this.statusDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.animateFromStatusDrawableParams = i;
        this.animateToStatusDrawableParams = i2;
        this.statusDrawableAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DialogCell.$r8$lambda$i7dvedqxuFQCCk6gtIiIlb2DeWQ(this.f$0, valueAnimator);
            }
        });
        this.statusDrawableAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                int i3 = (DialogCell.this.drawClock ? 1 : 0) + (DialogCell.this.drawCheck1 ? 2 : 0) + (DialogCell.this.drawCheck2 ? 4 : 0);
                if (DialogCell.this.animateToStatusDrawableParams == i3) {
                    DialogCell.this.statusDrawableAnimationInProgress = false;
                    DialogCell dialogCell = DialogCell.this;
                    dialogCell.lastStatusDrawableParams = dialogCell.animateToStatusDrawableParams;
                } else {
                    DialogCell dialogCell2 = DialogCell.this;
                    dialogCell2.createStatusDrawableAnimator(dialogCell2.animateToStatusDrawableParams, i3);
                }
                DialogCell.this.invalidate();
            }
        });
        this.statusDrawableAnimationInProgress = true;
        this.statusDrawableAnimator.start();
    }

    public static void $r8$lambda$i7dvedqxuFQCCk6gtIiIlb2DeWQ(DialogCell dialogCell, ValueAnimator valueAnimator) {
        dialogCell.getClass();
        dialogCell.statusDrawableProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogCell.invalidate();
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
                if (MessagesController.getInstance(this.currentAccount).getStoriesController().hasHiddenStories()) {
                    this.archivedChatsDrawable.outRadius -= AndroidUtilities.dpf2(3.5f);
                }
                this.archivedChatsDrawable.outImageSize = this.avatarImage.getBitmapWidth();
            }
            this.archivedChatsDrawable.startOutAnimation();
        }
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

    public void setSliding(boolean z) {
        this.isSliding = z;
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.translationDrawable || drawable == Theme.dialogs_archiveAvatarDrawable) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        DialogsActivity dialogsActivity;
        if (i == R.id.acc_action_chat_preview && (dialogsActivity = this.parentFragment) != null) {
            dialogsActivity.showChatPreview(this);
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
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
            if (this.isTopic && this.forumTopic != null) {
                sb.append(LocaleController.getString(R.string.AccDescrTopic));
                sb.append(". ");
                sb.append(this.forumTopic.title);
                sb.append(". ");
            } else {
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
            MessageObject messageObject3 = (MessageObject) this.groupMessages.get(i2);
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

    public void updateMessageThumbs() {
        TLRPC.Message message;
        int i;
        MessageObject messageObject = this.message;
        if (messageObject == null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason);
        MessageObject messageObject2 = this.message;
        int i2 = 0;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.thumbsCount = 0;
                this.hasVideoThumb = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i3 = 0;
                while (i2 < tL_messageMediaPaidMedia.extended_media.size() && this.thumbsCount < 3) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i2);
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        i = i3 + 1;
                        setThumb(i3, ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb);
                    } else {
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            i = i3 + 1;
                            setThumb(i3, ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media);
                        }
                        i2++;
                    }
                    i3 = i;
                    i2++;
                }
                return;
            }
        }
        ArrayList arrayList = this.groupMessages;
        if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(restrictionReason) && this.currentDialogFolderId == 0 && this.encryptedChat == null) {
            this.thumbsCount = 0;
            this.hasVideoThumb = false;
            Collections.sort(this.groupMessages, Comparator$CC.comparingInt(new ToIntFunction() {
                @Override
                public final int applyAsInt(Object obj) {
                    return ((MessageObject) obj).getId();
                }
            }));
            while (i2 < Math.min(3, this.groupMessages.size())) {
                MessageObject messageObject3 = (MessageObject) this.groupMessages.get(i2);
                if (messageObject3 != null && !messageObject3.needDrawBluredPreview() && (messageObject3.isPhoto() || messageObject3.isNewGif() || messageObject3.isVideo() || messageObject3.isRoundVideo() || messageObject3.isStoryMedia())) {
                    String str = messageObject3.isWebpage() ? messageObject3.messageOwner.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        setThumb(i2, messageObject3);
                    }
                }
                i2++;
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

    private void setThumb(int i, MessageObject messageObject) {
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

    private void setThumb(int i, TLRPC.MessageMedia messageMedia) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z;
        TLObject tLObject;
        TLRPC.PhotoSize strippedPhotoSize;
        TLRPC.PhotoSize photoSize;
        boolean z2;
        int i2;
        int i3;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo2 = messageMedia.photo;
            arrayList = photo2.sizes;
            photo = photo2;
        } else {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                boolean zIsVideoDocument = MessageObject.isVideoDocument(messageMedia.document);
                TLRPC.Document document = messageMedia.document;
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
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
            photoSize = strippedPhotoSize != closestPhotoSizeWithSize ? closestPhotoSizeWithSize : null;
            if (photoSize != null || !DownloadController.getInstance(this.currentAccount).canDownloadMedia(1, photoSize.size)) {
                photoSize = strippedPhotoSize;
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
                    this.drawPlay[i] = z;
                    this.drawSpoiler[i] = false;
                    if (!z || photoSize == null) {
                        i3 = 0;
                    } else {
                        i3 = photoSize.size;
                    }
                    this.thumbImage[i].setImage(ImageLocation.getForObject(photoSize, tLObject), "20_20", ImageLocation.getForObject(strippedPhotoSize, tLObject), "20_20", i3, null, this.message, 0);
                    this.thumbImage[i].setRoundRadius(AndroidUtilities.dp(2.0f));
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
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
        if (strippedPhotoSize != closestPhotoSizeWithSize2) {
        }
        if (photoSize != null) {
            photoSize = strippedPhotoSize;
        } else {
            photoSize = strippedPhotoSize;
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
                this.drawPlay[i] = z;
                this.drawSpoiler[i] = false;
                if (z) {
                    i3 = 0;
                } else {
                    i3 = 0;
                }
                this.thumbImage[i].setImage(ImageLocation.getForObject(photoSize, tLObject), "20_20", ImageLocation.getForObject(strippedPhotoSize, tLObject), "20_20", i3, null, this.message, 0);
                this.thumbImage[i].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.needEmoji = false;
            }
        }
    }

    private void setThumb(int i, TLRPC.PhotoSize photoSize) {
        if (i < 3 && photoSize != null) {
            this.hasVideoThumb = false;
            int i2 = this.thumbsCount;
            if (i2 < 3) {
                this.thumbsCount = i2 + 1;
                this.drawPlay[i] = false;
                this.drawSpoiler[i] = true;
                this.thumbImage[i].setImage(ImageLocation.getForObject(photoSize, this.message.messageOwner), "2_2_b", null, null, 0, null, this.message, 0);
                this.thumbImage[i].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.needEmoji = false;
            }
        }
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
            if (chat != null && (str = chat.title) != null) {
                return AndroidUtilities.escape(str.replace("\n", ""));
            }
            return "DELETED";
        }
        if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
            if (UserObject.isDeleted(user)) {
                return LocaleController.getString(R.string.HiddenName);
            }
            return AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace("\n", ""));
        }
        return AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", ""));
    }

    public SpannableStringBuilder getMessageStringFormatted(int i, String str, CharSequence charSequence, boolean z) {
        TLRPC.Message message;
        CharSequence string;
        String pluralString;
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
            CharSequence string2 = charSequence2.toString();
            if (!this.needEmoji) {
                str2 = "";
            } else if (captionMessage.isVideo()) {
                str2 = "📹 ";
            } else if (captionMessage.isVoice()) {
                str2 = "🎤 ";
            } else if (captionMessage.isMusic()) {
                str2 = "🎧 ";
            } else if (captionMessage.isPhoto()) {
                str2 = "🖼 ";
            } else {
                str2 = "📎 ";
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
            if (string2.length() > 150) {
                string2 = string2.subSequence(0, 150);
            }
            SpannableString spannableString = new SpannableString(string2);
            captionMessage.spoilLoginCode();
            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, string2, spannableString, 264);
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
        if (message2.media != null && !messageObject2.isMediaEmpty()) {
            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
            int i2 = Theme.key_chats_attachMessage;
            MessageObject messageObject3 = this.message;
            TLRPC.MessageMedia messageMedia = messageObject3.messageOwner.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                    MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2);
                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                    string = DialogMediaIconsHelper.addDialogMediaSpan(spannableString2, R.drawable.dialog_media_poll_20, true);
                } else {
                    string = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities.text, R.drawable.dialog_media_poll_20, true);
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                    TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                    MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3);
                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                    string = DialogMediaIconsHelper.addDialogMediaSpan(spannableString3, R.drawable.dialog_media_checklist_20, true);
                } else {
                    string = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities3.text, R.drawable.dialog_media_checklist_20, true);
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                string = DialogMediaIconsHelper.addDialogMediaSpan(messageMedia.game.title, R.drawable.dialog_media_game_20, true);
            } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                string = messageMedia.title;
            } else if (messageObject3.type == 14) {
                string = String.format("🎧 \u2068%s - %s\u2069", messageObject3.getMusicAuthor(), this.message.getMusicTitle());
            } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                if (this.hasVideoThumb) {
                    pluralString = size > 1 ? LocaleController.formatPluralString("Media", size, new Object[0]) : LocaleController.getString(R.string.AttachVideo);
                } else {
                    pluralString = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                }
                string = StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.AttachPaidMedia, pluralString));
                i2 = Theme.key_chats_actionMessage;
            } else if (this.thumbsCount > 1) {
                if (this.hasVideoThumb) {
                    ArrayList arrayList2 = this.groupMessages;
                    string = LocaleController.formatPluralString("Media", arrayList2 == null ? 0 : arrayList2.size(), new Object[0]);
                } else {
                    ArrayList arrayList3 = this.groupMessages;
                    string = LocaleController.formatPluralString("Photos", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
                }
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
        MessageObject messageObject4 = this.message;
        CharSequence charSequenceReplaceNewLines = messageObject4.messageOwner.message;
        if (charSequenceReplaceNewLines != null) {
            if (messageObject4.hasHighlightedWords()) {
                CharSequence charSequence5 = this.message.messageTrimmedToHighlight;
                if (charSequence5 != null) {
                    charSequenceReplaceNewLines = charSequence5;
                }
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
                if (charSequenceReplaceNewLines.length() > 150) {
                    charSequenceReplaceNewLines = charSequenceReplaceNewLines.subSequence(0, 150);
                }
                charSequenceReplaceNewLines = AndroidUtilities.replaceNewLines(charSequenceReplaceNewLines);
            }
            ?? spannableString4 = new SpannableString(charSequenceReplaceNewLines);
            MessageObject messageObject5 = this.message;
            if (messageObject5 != null) {
                messageObject5.spoilLoginCode();
            }
            MediaDataController.addTextStyleRuns(this.message, (Spannable) spannableString4, 264);
            MessageObject messageObject6 = this.message;
            if (messageObject6 != null && (message = messageObject6.messageOwner) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                TextPaint textPaint2 = this.currentMessagePaint;
                MediaDataController.addAnimatedEmojiSpans(arrayList4, spannableString4, textPaint2 != null ? textPaint2.getFontMetricsInt() : null);
            }
            if (z) {
                spannableString4 = applyThumbs(spannableString4);
            }
            return formatInternal(i, spannableString4, charSequence);
        }
        return new SpannableStringBuilder();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.rightFragmentOpenedProgress != 0.0f || this.isTopic || this.isShareToStoryCell || !this.storyParams.checkOnTouchEvent(motionEvent, this)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.isTopic && !this.isShareToStoryCell && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.storyParams.checkOnTouchEvent(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CanvasButton canvasButton;
        int i;
        if (this.rightFragmentOpenedProgress == 0.0f && !this.isTopic && !this.isShareToStoryCell && this.storyParams.checkOnTouchEvent(motionEvent, this)) {
            return true;
        }
        DialogCellDelegate dialogCellDelegate = this.delegate;
        if (dialogCellDelegate == null || dialogCellDelegate.canClickButtonInside()) {
            if (this.openBot) {
                boolean zContains = this.openButtonRect.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    this.openButtonBounce.setPressed(zContains);
                } else {
                    if (this.openButtonBounce.isPressed() && motionEvent.getAction() == 1) {
                        Utilities.Callback callback = this.onOpenButtonClick;
                        if (callback != null) {
                            callback.run(this.user);
                        }
                        this.openButtonBounce.setPressed(false);
                        return true;
                    }
                    if (this.openButtonBounce.isPressed() && motionEvent.getAction() == 3) {
                        this.openButtonBounce.setPressed(false);
                        return true;
                    }
                }
                if (zContains) {
                    return true;
                }
            }
            if (this.lastTopicMessageUnread && (canvasButton = this.canvasButton) != null && this.buttonLayout != null && (((i = this.dialogsType) == 0 || i == 7 || i == 8) && canvasButton.checkTouchEvent(motionEvent))) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClipProgress(float f) {
        this.clipProgress = f;
        invalidate();
    }

    public float getClipProgress() {
        return this.clipProgress;
    }

    public void setTopClip(int i) {
        this.topClip = i;
    }

    public void setBottomClip(int i) {
        this.bottomClip = i;
    }

    public void setArchivedPullAnimation(PullForegroundDrawable pullForegroundDrawable) {
        this.archivedChatsDrawable = pullForegroundDrawable;
    }

    public int getCurrentDialogFolderId() {
        return this.currentDialogFolderId;
    }

    public boolean isDialogFolder() {
        return this.currentDialogFolderId > 0;
    }

    public boolean isDialogCommunity() {
        return ChatObject.isCommunity(this.chat);
    }

    public MessageObject getMessage() {
        return this.message;
    }

    public void setDialogCellDelegate(DialogCellDelegate dialogCellDelegate) {
        this.delegate = dialogCellDelegate;
    }

    private class DialogUpdateHelper {
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
        long startWaitingTime;
        public boolean typingOutToTop;
        public float typingProgres;
        boolean waitngNewMessageFroTypingAnimation;

        private DialogUpdateHelper() {
            this.waitngNewMessageFroTypingAnimation = false;
        }

        public boolean update() {
            Integer printingStringType;
            int size;
            boolean z;
            boolean z2;
            TLRPC.DraftMessage draft;
            int i;
            int i2;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(DialogCell.this.currentAccount).dialogs_dict.get(DialogCell.this.currentDialogId);
            if (dialog == null) {
                if (DialogCell.this.dialogsType != 3 || this.lastDrawnDialogId == DialogCell.this.currentDialogId) {
                    return false;
                }
                this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                return true;
            }
            int id = DialogCell.this.message == null ? 0 : DialogCell.this.message.getId() + DialogCell.this.message.hashCode();
            long j = ((long) dialog.read_inbox_max_id) + (((long) dialog.read_outbox_max_id) << 8) + (((long) (dialog.unread_count + (dialog.unread_mark ? -1 : 0))) << 16) + ((long) (dialog.unread_reactions_count > 0 ? 262144 : 0)) + ((long) (dialog.unread_mentions_count > 0 ? 524288 : 0)) + ((long) (dialog.unread_poll_votes_count > 0 ? 2097152 : 0));
            if (DialogCell.this.isForumCell()) {
                int[] forumUnreadCount = MessagesController.getInstance(DialogCell.this.currentAccount).getTopicsController().getForumUnreadCount(-DialogCell.this.currentDialogId);
                if (forumUnreadCount[2] > 0) {
                    j |= 1048576;
                }
                if (forumUnreadCount[4] > 0) {
                    j |= 4194304;
                }
            }
            if (DialogCell.this.isForumCell()) {
                printingStringType = null;
            } else {
                DialogCell dialogCell = DialogCell.this;
                if ((dialogCell.isDialogCell || dialogCell.isTopic) && !TextUtils.isEmpty(MessagesController.getInstance(DialogCell.this.currentAccount).getPrintingString(DialogCell.this.currentDialogId, DialogCell.this.getTopicId(), true))) {
                    printingStringType = MessagesController.getInstance(DialogCell.this.currentAccount).getPrintingStringType(DialogCell.this.currentDialogId, DialogCell.this.getTopicId());
                } else {
                    printingStringType = null;
                }
            }
            int measuredWidth = DialogCell.this.getMeasuredWidth() + (DialogCell.this.getMeasuredHeight() << 16);
            if (DialogCell.this.isForumCell()) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(DialogCell.this.currentAccount).getTopicsController().getTopics(-DialogCell.this.currentDialogId);
                size = topics == null ? -1 : topics.size();
                if (size == -1 && MessagesController.getInstance(DialogCell.this.currentAccount).getTopicsController().endIsReached(-DialogCell.this.currentDialogId)) {
                    size = 0;
                }
            } else {
                size = 0;
            }
            if (DialogCell.this.isTopic) {
                z = false;
                z2 = MediaDataController.getInstance(DialogCell.this.currentAccount).getDraftVoice(DialogCell.this.currentDialogId, (long) DialogCell.this.getTopicId()) != null;
                TLRPC.DraftMessage draft2 = !z2 ? MediaDataController.getInstance(DialogCell.this.currentAccount).getDraft(DialogCell.this.currentDialogId, DialogCell.this.getTopicId()) : null;
                draft = (draft2 == null || !TextUtils.isEmpty(draft2.message)) ? draft2 : null;
            } else {
                z = false;
                DialogCell dialogCell2 = DialogCell.this;
                if (dialogCell2.isDialogCell) {
                    z2 = MediaDataController.getInstance(dialogCell2.currentAccount).getDraftVoice(DialogCell.this.currentDialogId, 0L) != null;
                    if (!z2) {
                        draft = MediaDataController.getInstance(DialogCell.this.currentAccount).getDraft(DialogCell.this.currentDialogId, 0L);
                    }
                } else {
                    z2 = false;
                }
            }
            if (draft == null) {
                i = 0;
            } else {
                int iHashCode = draft.message.hashCode();
                TLRPC.InputReplyTo inputReplyTo = draft.reply_to;
                i = iHashCode + (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : 0);
            }
            boolean z3 = DialogCell.this.chat != null && DialogCell.this.chat.call_active && DialogCell.this.chat.call_not_empty;
            boolean zIsTranslatingDialog = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
            if (this.lastDrawnSizeHash == measuredWidth && this.lastDrawnMessageId == id && this.lastDrawnTranslated == zIsTranslatingDialog && this.lastDrawnDialogId == DialogCell.this.currentDialogId && this.lastDrawnDialogIsFolder == dialog.isFolder && this.lastDrawnReadState == j && Objects.equals(this.lastDrawnPrintingType, printingStringType) && this.lastTopicsCount == size && i == this.lastDrawnDraftHash && this.lastDrawnPinned == DialogCell.this.drawPin && this.lastDrawnHasCall == z3 && DialogCell.this.draftVoice == z2) {
                return z;
            }
            if (this.lastDrawnDialogId != DialogCell.this.currentDialogId) {
                this.typingProgres = printingStringType == null ? 0.0f : 1.0f;
                this.waitngNewMessageFroTypingAnimation = false;
            } else {
                if (!Objects.equals(this.lastDrawnPrintingType, printingStringType) || this.waitngNewMessageFroTypingAnimation) {
                    boolean z4 = this.waitngNewMessageFroTypingAnimation;
                    if (z4 || printingStringType != null) {
                        if (z4 && this.lastDrawnMessageId != id) {
                            this.waitngNewMessageFroTypingAnimation = false;
                        }
                        i2 = i;
                        if (this.lastDrawnMessageId != id) {
                            this.typingOutToTop = false;
                        } else {
                            this.typingOutToTop = true;
                        }
                    } else {
                        this.waitngNewMessageFroTypingAnimation = true;
                        this.startWaitingTime = System.currentTimeMillis();
                    }
                    i2 = i;
                    if (this.lastDrawnMessageId != id) {
                        this.typingOutToTop = false;
                    } else {
                        this.typingOutToTop = true;
                    }
                }
                if (printingStringType != null) {
                    this.lastKnownTypingType = printingStringType.intValue();
                }
                this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                this.lastDrawnMessageId = id;
                this.lastDrawnDialogIsFolder = dialog.isFolder;
                this.lastDrawnReadState = j;
                this.lastDrawnPrintingType = printingStringType;
                this.lastDrawnSizeHash = measuredWidth;
                this.lastDrawnDraftHash = i2;
                this.lastTopicsCount = size;
                this.lastDrawnPinned = DialogCell.this.drawPin;
                this.lastDrawnHasCall = z3;
                this.lastDrawnTranslated = zIsTranslatingDialog;
                return true;
            }
            i2 = i;
            if (printingStringType != null) {
                this.lastKnownTypingType = printingStringType.intValue();
            }
            this.lastDrawnDialogId = DialogCell.this.currentDialogId;
            this.lastDrawnMessageId = id;
            this.lastDrawnDialogIsFolder = dialog.isFolder;
            this.lastDrawnReadState = j;
            this.lastDrawnPrintingType = printingStringType;
            this.lastDrawnSizeHash = measuredWidth;
            this.lastDrawnDraftHash = i2;
            this.lastTopicsCount = size;
            this.lastDrawnPinned = DialogCell.this.drawPin;
            this.lastDrawnHasCall = z3;
            this.lastDrawnTranslated = zIsTranslatingDialog;
            return true;
        }

        public void updateAnimationValues() {
            float f;
            if (!this.waitngNewMessageFroTypingAnimation) {
                if (this.lastDrawnPrintingType != null && DialogCell.this.typingLayout != null) {
                    float f2 = this.typingProgres;
                    if (f2 != 1.0f) {
                        this.typingProgres = f2 + 0.08f;
                        DialogCell.this.invalidate();
                    } else if (this.lastDrawnPrintingType == null) {
                        f = this.typingProgres;
                        if (f != 0.0f) {
                            this.typingProgres = f - 0.08f;
                            DialogCell.this.invalidate();
                        }
                    }
                } else if (this.lastDrawnPrintingType == null) {
                    f = this.typingProgres;
                    if (f != 0.0f) {
                        this.typingProgres = f - 0.08f;
                        DialogCell.this.invalidate();
                    }
                }
                this.typingProgres = Utilities.clamp(this.typingProgres, 1.0f, 0.0f);
                return;
            }
            if (System.currentTimeMillis() - this.startWaitingTime > 100) {
                this.waitngNewMessageFroTypingAnimation = false;
            }
            DialogCell.this.invalidate();
        }
    }

    @Override
    public void invalidate() {
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    static class ForumFormattedNames {
        HashMap avatarSpans;
        CharSequence formattedNames;
        boolean isLoadingState;
        int lastMessageId;
        boolean lastTopicMessageUnread;
        private final DialogCell parent;
        int topMessageTopicEndIndex;
        int topMessageTopicStartIndex;

        ForumFormattedNames(DialogCell dialogCell) {
            this.parent = dialogCell;
        }

        public void invalidateSpans() {
            HashMap map = this.avatarSpans;
            if (map == null || map.isEmpty()) {
                return;
            }
            for (Map.Entry entry : this.avatarSpans.entrySet()) {
                ((AvatarSpan) entry.getValue()).setDialogId(((Long) entry.getKey()).longValue());
            }
        }

        public void formatTopicsNames(int i, MessageObject messageObject, TLRPC.Chat chat) {
            long topicId;
            boolean z;
            int length;
            int id = (messageObject == null || chat == null) ? 0 : messageObject.getId();
            if (this.lastMessageId != id || this.isLoadingState) {
                this.avatarSpans = null;
                this.topMessageTopicStartIndex = 0;
                this.topMessageTopicEndIndex = 0;
                this.lastTopicMessageUnread = false;
                this.isLoadingState = false;
                this.lastMessageId = id;
                TextPaint textPaint = Theme.dialogs_messagePaint[0];
                if (chat != null) {
                    ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i).getTopicsController().getTopics(chat.id);
                    boolean z2 = true;
                    if (topics != null && !topics.isEmpty()) {
                        ArrayList arrayList = new ArrayList(topics);
                        Collections.sort(arrayList, Comparator$CC.comparingInt(new ToIntFunction() {
                            @Override
                            public final int applyAsInt(Object obj) {
                                return DialogCell.ForumFormattedNames.$r8$lambda$uICq3jFQRNqxUSEcmTlTge6AEXo((TLRPC.TL_forumTopic) obj);
                            }
                        }));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (messageObject == null || ChatObject.isMonoForum(chat)) {
                            topicId = 0;
                            z = false;
                            length = 0;
                        } else {
                            topicId = MessageObject.getTopicId(i, messageObject.messageOwner, true);
                            TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i).getTopicsController().findTopic(chat.id, topicId);
                            if (tL_forumTopicFindTopic != null) {
                                CharSequence topicSpannedName = ForumUtilities.getTopicSpannedName(tL_forumTopicFindTopic, textPaint, false);
                                spannableStringBuilder.append(topicSpannedName);
                                length = tL_forumTopicFindTopic.unread_count > 0 ? topicSpannedName.length() : 0;
                                this.topMessageTopicStartIndex = 0;
                                this.topMessageTopicEndIndex = topicSpannedName.length();
                                if (messageObject.isOutOwner()) {
                                    this.lastTopicMessageUnread = false;
                                } else {
                                    this.lastTopicMessageUnread = tL_forumTopicFindTopic.unread_count > 0;
                                }
                            } else {
                                this.lastTopicMessageUnread = false;
                                length = 0;
                            }
                            if (this.lastTopicMessageUnread) {
                                spannableStringBuilder.append((CharSequence) " ");
                                spannableStringBuilder.setSpan(new FixedWidthSpan(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (ChatObject.isMonoForum(chat)) {
                            this.avatarSpans = new HashMap();
                            for (int i2 = 0; i2 < Math.min(4, arrayList.size()); i2++) {
                                if (spannableStringBuilder.length() != 0) {
                                    spannableStringBuilder.append((CharSequence) "  ");
                                }
                                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i2)).from_id);
                                AvatarSpan avatarSpan = new AvatarSpan(this.parent, i);
                                avatarSpan.needDrawShadow = false;
                                avatarSpan.setDialogId(peerDialogId);
                                this.avatarSpans.put(Long.valueOf(peerDialogId), avatarSpan);
                                SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                                spannableStringBuilderValueOf.insert(0, (CharSequence) "  ");
                                spannableStringBuilderValueOf.setSpan(avatarSpan, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableStringBuilderValueOf);
                            }
                        } else {
                            int i3 = 0;
                            for (int i4 = 4; i3 < Math.min(i4, arrayList.size()); i4 = 4) {
                                if (((TLRPC.TL_forumTopic) arrayList.get(i3)).id != topicId) {
                                    if (spannableStringBuilder.length() != 0) {
                                        if (z2 && z) {
                                            spannableStringBuilder.append((CharSequence) " ");
                                        } else {
                                            spannableStringBuilder.append((CharSequence) ", ");
                                        }
                                    }
                                    spannableStringBuilder.append(ForumUtilities.getTopicSpannedName((TLRPC.ForumTopic) arrayList.get(i3), textPaint, false));
                                    z2 = false;
                                }
                                i3++;
                            }
                        }
                        if (length > 0) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, Theme.key_chats_name, null), 0, Math.min(spannableStringBuilder.length(), length + 2), 0);
                        }
                        this.formattedNames = spannableStringBuilder;
                        return;
                    }
                    if (MessagesController.getInstance(i).getTopicsController().endIsReached(chat.id)) {
                        this.formattedNames = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                        return;
                    }
                    MessagesController.getInstance(i).getTopicsController().preloadTopics(chat.id);
                    this.formattedNames = LocaleController.getString(R.string.Loading);
                    this.isLoadingState = true;
                }
            }
        }

        public static int $r8$lambda$uICq3jFQRNqxUSEcmTlTge6AEXo(TLRPC.TL_forumTopic tL_forumTopic) {
            return -tL_forumTopic.top_message;
        }
    }

    private ColorFilter getAdaptiveEmojiColorFilter(int i, int i2) {
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

    public void showPremiumBlocked(boolean z) {
        Runnable runnable = this.unsubscribePremiumBlocked;
        if (z != (runnable != null)) {
            if (!z && runnable != null) {
                runnable.run();
                this.unsubscribePremiumBlocked = null;
            } else if (z) {
                this.unsubscribePremiumBlocked = NotificationCenter.getInstance(this.currentAccount).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.updatePremiumBlocked(true);
                    }
                });
            }
        }
    }

    public void updatePremiumBlocked(boolean z) {
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
}
