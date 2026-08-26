package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
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
import android.view.animation.OvershootInterpolator;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
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
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
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
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.MsgClockDrawable;
import org.telegram.ui.Components.PhotoBubbleClip;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.PullForegroundDrawable$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ScamDrawable;
import org.telegram.ui.Components.StatusDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TimerDrawable;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.VectorAvatarThumbDrawable;
import org.telegram.ui.Components.dialogs.DialogMediaIconsHelper;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.QrActivity;
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
    public int[] adaptiveEmojiColor;
    public ColorFilter[] adaptiveEmojiColorFilter;
    public final int addForumHeightForTags;
    public final int addHeightForTags;
    public boolean allowBotOpenButton;
    public int animateFromStatusDrawableParams;
    public int animateToStatusDrawableParams;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack2;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack3;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStackName;
    public boolean animatingArchiveAvatar;
    public float animatingArchiveAvatarProgress;
    public final BoolAnimator animatorPollVotesMentionVisible;
    public boolean applyName;
    public float archiveBackgroundProgress;
    public GradientDrawable archiveFadeGradientDrawable;
    public int archiveFadeGradientDrawableColor;
    public boolean archiveHidden;
    public PullForegroundDrawable archivedChatsDrawable;
    public boolean attachedToWindow;
    public final AvatarDrawable avatarDrawable;
    public final ImageReceiver avatarImage;
    public int avatarStart;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerification;
    public int bottomClip;
    public PhotoBubbleClip bubbleClip;
    public Paint buttonBackgroundPaint;
    public StaticLayout buttonLayout;
    public int buttonLeft;
    public int buttonTop;
    public CanvasButton canvasButton;
    public TLRPC.Chat chat;
    public float chatCallProgress;
    public AnonymousClass3 checkBox;
    public int checkDrawLeft;
    public int checkDrawLeft1;
    public int checkDrawTop;
    public float chekBoxPaddingTop;
    public boolean clearingDialog;
    public float clipProgress;
    public int clockDrawLeft;
    public float collapseOffset;
    public boolean collapsed;
    public CommunityArrowDrawable communityArrowDrawable;
    public float cornerProgress;
    public StaticLayout countAnimationInLayout;
    public boolean countAnimationIncrement;
    public StaticLayout countAnimationStableLayout;
    public ValueAnimator countAnimator;
    public float countChangeProgress;
    public StaticLayout countLayout;
    public int countLeft;
    public int countLeftOld;
    public StaticLayout countOldLayout;
    public int countTop;
    public int countWidth;
    public int countWidthOld;
    public Paint counterPaintOutline;
    public Path counterPath;
    public RectF counterPathRect;
    public final int currentAccount;
    public long currentDialogCommunityId;
    public int currentDialogFolderDialogsCount;
    public int currentDialogFolderId;
    public long currentDialogId;
    public TextPaint currentMessagePaint;
    public float currentRevealBounceProgress;
    public float currentRevealProgress;
    public CustomDialog customDialog;
    public String customMessage;
    public DialogCellDelegate delegate;
    public boolean dialogMuted;
    public float dialogMutedProgress;
    public int dialogsType;
    public TLRPC.DraftMessage draftMessage;
    public boolean draftVoice;
    public final boolean drawArchive;
    public boolean drawAvatar;
    public boolean drawBotVerified;
    public boolean drawCheck1;
    public boolean drawCheck2;
    public boolean drawClock;
    public boolean drawCommunityAvatar;
    public boolean drawCount;
    public boolean drawCount2;
    public boolean drawError;
    public boolean drawForwardIcon;
    public boolean drawGiftIcon;
    public boolean drawMention;
    public boolean drawMonoforumAvatar;
    public boolean drawNameLock;
    public boolean drawPin;
    public boolean drawPinBackground;
    public boolean drawPinForced;
    public final boolean[] drawPlay;
    public boolean drawPollVotesMention;
    public boolean drawPremium;
    public boolean drawReactionMention;
    public boolean drawReorder;
    public boolean drawRevealBackground;
    public int drawScam;
    public final boolean[] drawSpoiler;
    public boolean drawUnmute;
    public boolean drawVerified;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatus;
    public final QrActivity.AnonymousClass2 emojiStatusView;
    public TLRPC.EncryptedChat encryptedChat;
    public int errorLeft;
    public int errorTop;
    public Paint fadePaint;
    public Paint fadePaintBack;
    public int folderId;
    public boolean forbidVerified;
    public ForumFormattedNames forumFormattedNames;
    public TLRPC.TL_forumTopic forumTopic;
    public boolean fullSeparator;
    public ArrayList groupMessages;
    public int halfCheckDrawLeft;
    public boolean hasCall;
    public boolean hasNameInMessage;
    public boolean hasUnmutedCommunityDialogs;
    public boolean hasUnmutedTopics;
    public boolean hasVideoThumb;
    public int heightDefault;
    public int heightThreeLines;
    public boolean inPreviewMode;
    public float innerProgress;
    public boolean insideCommunityList;
    public boolean insideCommunityListNoDialog;
    public final ViewPager.AnonymousClass2 interpolator;
    public boolean isDialogCell;
    public boolean isHiddenInCommunity;
    public boolean isMonoForumTopicDialog;
    public boolean isSavedDialog;
    public boolean isSavedDialogCell;
    public boolean isSelected;
    public boolean isShareToStoryCell;
    public boolean isSliding;
    public boolean isTopic;
    public boolean isTransitionSupport;
    public long lastDialogChangedTime;
    public int lastDrawSwipeMessageStringId;
    public RLottieDrawable lastDrawTranslationDrawable;
    public int lastMessageDate;
    public CharSequence lastMessageString;
    public CharSequence lastPrintString;
    public int lastSendState;
    public int lastSize;
    public int lastStatusDrawableParams;
    public boolean lastTopicMessageUnread;
    public boolean lastUnreadState;
    public int lock2Left;
    public Drawable lockDrawable;
    public boolean markUnread;
    public int mentionCount;
    public StaticLayout mentionLayout;
    public int mentionLeft;
    public int mentionWidth;
    public MessageObject message;
    public int messageId;
    public StaticLayout messageLayout;
    public int messageLeft;
    public StaticLayout messageNameLayout;
    public int messageNameLeft;
    public int messageNameTop;
    public int messagePaddingStart;
    public int messageTop;
    public boolean moving;
    public boolean nameIsEllipsized;
    public StaticLayout nameLayout;
    public boolean nameLayoutEllipsizeByGradient;
    public boolean nameLayoutEllipsizeLeft;
    public boolean nameLayoutFits;
    public float nameLayoutTranslateX;
    public int nameLeft;
    public int nameLockLeft;
    public int nameLockTop;
    public int nameMuteLeft;
    public int nameMutedIconLeft;
    public int nameWidth;
    public boolean needEmoji;
    public DialogCell$$ExternalSyntheticLambda6 onOpenButtonClick;
    public float onlineProgress;
    public boolean openBot;
    public final Paint openButtonBackgroundPaint;
    public final ButtonBounce openButtonBounce;
    public final RectF openButtonRect;
    public Text openButtonText;
    public boolean overrideSwipeAction;
    public int overrideSwipeActionBackgroundColorKey;
    public RLottieDrawable overrideSwipeActionDrawable;
    public int overrideSwipeActionRevealBackgroundColorKey;
    public int overrideSwipeActionStringId;
    public String overrideSwipeActionStringKey;
    public int paintIndex;
    public final DialogsActivity parentFragment;
    public int pinLeft;
    public int pinTop;
    public int pollVotesMentionCount;
    public int pollVotesMentionLeft;
    public DialogsAdapter.DialogsPreloader preloader;
    public boolean premiumBlocked;
    public final AnimatedFloat premiumBlockedT;
    public PremiumGradient.PremiumGradientTools premiumGradient;
    public int printingStringType;
    public int progressStage;
    public boolean promoDialog;
    public int reactionMentionCount;
    public int reactionMentionLeft;
    public ValueAnimator reactionsMentionsAnimator;
    public float reactionsMentionsChangeProgress;
    public int readOutboxMaxId;
    public final RectF rect;
    public int reorderGradientLastColor;
    public Paint reorderGradientPaint;
    public float reorderIconProgress;
    public ShareDialogCell.RepostStoryDrawable repostStoryDrawable;
    public final Theme.ResourcesProvider resourcesProvider;
    public float rightFragmentOffset;
    public float rightFragmentOpenedProgress;
    public boolean showTopicIconInName;
    public boolean showTtl;
    public final ArrayList spoilers;
    public final ArrayList spoilers2;
    public final Stack spoilersPool;
    public final Stack spoilersPool2;
    public Drawable starBg;
    public int starBgColor;
    public Drawable starFg;
    public final AnimatedFloat starsBlockedT;
    public long starsPriceBlocked;
    public boolean statusDrawableAnimationInProgress;
    public ValueAnimator statusDrawableAnimator;
    public int statusDrawableLeft;
    public float statusDrawableProgress;
    public final AnonymousClass1 storyParams;
    public boolean swipeCanceled;
    public int swipeMessageTextId;
    public StaticLayout swipeMessageTextLayout;
    public int swipeMessageWidth;
    public DialogCellTags tags;
    public int tagsLeft;
    public int tagsRight;
    public Paint thumbBackgroundPaint;
    public final ImageReceiver[] thumbImage;
    public final boolean[] thumbImageSeen;
    public Path thumbPath;
    public int thumbSize;
    public SpoilerEffect thumbSpoiler;
    public int thumbsCount;
    public StaticLayout timeLayout;
    public int timeLeft;
    public int timeTop;
    public TimerDrawable timerDrawable;
    public Paint timerPaint;
    public Paint timerPaint2;
    public String titleOverride;
    public int topClip;
    public int topMessageTopicEndIndex;
    public Paint topicCounterPaint;
    public Drawable[] topicIconInName;
    public boolean topicMuted;
    public int translateY;
    public boolean translationAnimationStarted;
    public RLottieDrawable translationDrawable;
    public float translationX;
    public int ttlPeriod;
    public float ttlProgress;
    public boolean twoLinesForName;
    public StaticLayout typingLayout;
    public int typingLeft;
    public int unreadCount;
    public Runnable unsubscribePremiumBlocked;
    public final DialogUpdateHelper updateHelper;
    public boolean updateLayout;
    public final boolean useForceThreeLines;
    public boolean useFromUserAsAvatar;
    public boolean useMeForMyMessages;
    public boolean useSeparator;
    public TLRPC.User user;
    public boolean visibleOnScreen;
    public boolean wasDrawnOnline;
    public float xOffset;

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
                    int i2 = dialogCell3.animateToStatusDrawableParams;
                    if (i2 != i) {
                        dialogCell3.createStatusDrawableAnimator(i2, i);
                    } else {
                        dialogCell3.statusDrawableAnimationInProgress = false;
                        dialogCell3.lastStatusDrawableParams = i2;
                    }
                    dialogCell3.invalidate();
                    break;
            }
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

        void openStory(DialogCell dialogCell);

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
                if (dialogCell.dialogsType == 3) {
                    long j = this.lastDrawnDialogId;
                    long j2 = dialogCell.currentDialogId;
                    if (j != j2) {
                        this.lastDrawnDialogId = j2;
                        return true;
                    }
                }
                return false;
            }
            MessageObject messageObject = dialogCell.message;
            if (messageObject == null) {
                iHashCode = 0;
            } else {
                iHashCode = dialogCell.message.hashCode() + messageObject.getId();
            }
            long j3 = ((long) dialog.read_inbox_max_id) + (((long) dialog.read_outbox_max_id) << 8) + (((long) (dialog.unread_count + (dialog.unread_mark ? -1 : 0))) << 16) + ((long) (dialog.unread_reactions_count > 0 ? 262144 : 0)) + ((long) (dialog.unread_mentions_count > 0 ? 524288 : 0)) + ((long) (dialog.unread_poll_votes_count > 0 ? 2097152 : 0));
            boolean zIsForumCell = dialogCell.isForumCell();
            int i3 = dialogCell.currentAccount;
            if (zIsForumCell) {
                int[] forumUnreadCount = MessagesController.getInstance(i3).getTopicsController().getForumUnreadCount(-dialogCell.currentDialogId);
                if (forumUnreadCount[2] > 0) {
                    j3 |= 1048576;
                }
                if (forumUnreadCount[4] > 0) {
                    j3 |= 4194304;
                }
            }
            Integer printingStringType = (dialogCell.isForumCell() || !(dialogCell.isDialogCell || dialogCell.isTopic) || TextUtils.isEmpty(MessagesController.getInstance(i3).getPrintingString(dialogCell.currentDialogId, (long) dialogCell.getTopicId(), true))) ? null : MessagesController.getInstance(i3).getPrintingStringType(dialogCell.currentDialogId, dialogCell.getTopicId());
            int measuredWidth = dialogCell.getMeasuredWidth() + (dialogCell.getMeasuredHeight() << 16);
            if (dialogCell.isForumCell()) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i3).getTopicsController().getTopics(-dialogCell.currentDialogId);
                size = topics == null ? -1 : topics.size();
                if (size == -1 && MessagesController.getInstance(i3).getTopicsController().endIsReached(-dialogCell.currentDialogId)) {
                    size = 0;
                }
            } else {
                size = 0;
            }
            if (dialogCell.isTopic) {
                z = false;
                z2 = MediaDataController.getInstance(i3).getDraftVoice(dialogCell.currentDialogId, (long) dialogCell.getTopicId()) != null;
                draft = !z2 ? MediaDataController.getInstance(i3).getDraft(dialogCell.currentDialogId, dialogCell.getTopicId()) : null;
                if (draft != null && TextUtils.isEmpty(draft.message)) {
                    draft = null;
                }
            } else {
                i3 = i3;
                z = false;
                if (dialogCell.isDialogCell) {
                    z2 = MediaDataController.getInstance(i3).getDraftVoice(dialogCell.currentDialogId, 0L) != null;
                    if (!z2) {
                        draft = MediaDataController.getInstance(i3).getDraft(dialogCell.currentDialogId, 0L);
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
            TLRPC.Chat chat = dialogCell.chat;
            boolean z3 = chat != null && chat.call_active && chat.call_not_empty;
            boolean zIsTranslatingDialog = MessagesController.getInstance(i3).getTranslateController().isTranslatingDialog(dialogCell.currentDialogId);
            if (this.lastDrawnSizeHash == measuredWidth && this.lastDrawnMessageId == iHashCode && this.lastDrawnTranslated == zIsTranslatingDialog && this.lastDrawnDialogId == dialogCell.currentDialogId && this.lastDrawnDialogIsFolder == dialog.isFolder && this.lastDrawnReadState == j3 && Objects.equals(this.lastDrawnPrintingType, printingStringType) && this.lastTopicsCount == size && i == this.lastDrawnDraftHash && this.lastDrawnPinned == dialogCell.drawPin && this.lastDrawnHasCall == z3 && dialogCell.draftVoice == z2) {
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
                this.lastDrawnReadState = j3;
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
            this.lastDrawnReadState = j3;
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
            Integer num = this.lastDrawnPrintingType;
            if (num != null && dialogCell.typingLayout != null) {
                float f2 = this.typingProgres;
                if (f2 != 1.0f) {
                    this.typingProgres = f2 + 0.08f;
                    dialogCell.invalidate();
                } else if (num == null) {
                    f = this.typingProgres;
                    if (f != 0.0f) {
                        this.typingProgres = f - 0.08f;
                        dialogCell.invalidate();
                    }
                }
            } else if (num == null) {
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
        this.drawMonoforumAvatar = false;
        this.avatarStart = 11;
        this.messagePaddingStart = 72;
        this.heightDefault = 70;
        this.heightThreeLines = 76;
        this.addHeightForTags = 3;
        this.addForumHeightForTags = 11;
        this.chekBoxPaddingTop = 42.0f;
        ?? r9 = new StoriesUtilities.AvatarStoryParams() {
            @Override
            public final boolean isAvatarClickable(TLRPC.Chat chat, TLRPC.User user) {
                return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || DialogCell.this.insideCommunityList) ? false : true;
            }

            @Override
            public final boolean onAvatarClick(long j) {
                DialogCell dialogCell = DialogCell.this;
                if (dialogCell.parentFragment == null || dialogCell.insideCommunityList) {
                    return false;
                }
                DialogsActivity dialogsActivity2 = dialogCell.parentFragment;
                int i2 = dialogCell.currentAccount;
                if (j > 0) {
                    TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(j));
                    if (user == null || user.linked_community_id == 0) {
                        return false;
                    }
                    dialogsActivity2.showDialog(new CommunitySheet(dialogCell.parentFragment, user.linked_community_id, null, null));
                    return true;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-j));
                if (chat == null || chat.linked_community_id == 0) {
                    return false;
                }
                dialogsActivity2.showDialog(new CommunitySheet(dialogCell.parentFragment, chat.linked_community_id, null, null));
                return true;
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
            public final void openStory(long j) {
                DialogCell dialogCell = DialogCell.this;
                DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
                if (dialogCellDelegate == null) {
                    return;
                }
                if (dialogCell.currentDialogFolderId != 0) {
                    dialogCellDelegate.openHiddenStories();
                } else {
                    dialogCellDelegate.openStory(dialogCell);
                }
            }
        };
        this.storyParams = r9;
        this.visibleOnScreen = true;
        this.collapseOffset = 0.0f;
        this.hasUnmutedTopics = false;
        this.hasUnmutedCommunityDialogs = false;
        this.openButtonBounce = new ButtonBounce(this, 1.0f, 5.0f);
        this.openButtonBackgroundPaint = new Paint(1);
        this.openButtonRect = new RectF();
        this.overrideSwipeAction = false;
        this.thumbImageSeen = new boolean[3];
        this.thumbImage = new ImageReceiver[3];
        this.drawPlay = new boolean[3];
        this.drawSpoiler = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarImage = imageReceiver;
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.interpolator = new ViewPager.AnonymousClass2(3);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.starsBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.spoilersPool = new Stack();
        this.spoilers = new ArrayList();
        this.spoilersPool2 = new Stack();
        this.spoilers2 = new ArrayList();
        this.drawCount2 = true;
        this.animatorPollVotesMentionVisible = new BoolAnimator(320L, this, cubicBezierInterpolator);
        this.countChangeProgress = 1.0f;
        this.reactionsMentionsChangeProgress = 1.0f;
        this.rect = new RectF();
        this.lastStatusDrawableParams = -1;
        this.readOutboxMaxId = -1;
        this.updateHelper = new DialogUpdateHelper();
        r9.allowLongress = true;
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = dialogsActivity;
        Theme.createDialogsResources(context);
        this.drawMonoforumAvatar = false;
        this.drawCommunityAvatar = false;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
        int i2 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.thumbImage;
            if (i2 >= imageReceiverArr.length) {
                this.useForceThreeLines = z;
                this.currentAccount = i;
                QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, context, 4);
                this.emojiStatusView = anonymousClass2;
                addView(anonymousClass2);
                this.emojiStatus = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(anonymousClass2, false, AndroidUtilities.dp(22.0f), 7);
                this.botVerification = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(17.0f), 7);
                this.avatarImage.setAllowLoadingOnAttachedOnly(true);
                return;
            }
            imageReceiverArr[i2] = new ImageReceiver(this);
            ImageReceiver imageReceiver2 = this.thumbImage[i2];
            imageReceiver2.ignoreNotifications = true;
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(2.0f));
            this.thumbImage[i2].setAllowLoadingOnAttachedOnly(true);
            i2++;
        }
    }

    public static SpannableStringBuilder formatInternal(CharSequence charSequence, CharSequence charSequence2, int i) {
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

    private int getCollapsedHeight() {
        boolean z = this.useForceThreeLines;
        int iDp = AndroidUtilities.dp((z || SharedConfig.useThreeLinesLayout) ? this.heightThreeLines : this.heightDefault) + 1;
        if (this.twoLinesForName) {
            iDp += AndroidUtilities.dp(20.0f);
        }
        if (!hasTags() || ((z || SharedConfig.useThreeLinesLayout) && !isForumCell())) {
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

    public final void animateArchiveAvatar() {
        if (this.avatarDrawable.avatarType != 2) {
            return;
        }
        this.animatingArchiveAvatar = true;
        this.animatingArchiveAvatarProgress = 0.0f;
        Theme.dialogs_archiveAvatarDrawable.setProgress(0.0f, true);
        Theme.dialogs_archiveAvatarDrawable.start();
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
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

    public void buildLayout$1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.DialogCell.buildLayout$1():void");
    }

    public final void checkTtl() {
        AnonymousClass3 anonymousClass3;
        boolean z = this.ttlPeriod > 0 && !this.hasCall && !isOnline() && ((anonymousClass3 = this.checkBox) == null || !anonymousClass3.checkBoxBase.isChecked) && !this.storyParams.drawnLive;
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
        this.statusDrawableAnimator.addUpdateListener(new DialogCell$$ExternalSyntheticLambda0(this, 2));
        this.statusDrawableAnimator.addListener(new AnonymousClass4(this, 2));
        this.statusDrawableAnimationInProgress = true;
        this.statusDrawableAnimator.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.isTopic && !this.isShareToStoryCell && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            checkOnTouchEvent(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean drawAvatarOverlays(Canvas canvas) {
        boolean z;
        float f;
        float fDp;
        float f2;
        int i;
        float fDp2;
        float fDp3;
        float fDp4;
        float f3;
        float fDp5;
        float fDp6;
        float fDp7;
        float f4;
        float fDp8;
        float fDp9;
        float f5;
        float fDp10;
        float fDp11;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i2;
        float f14;
        boolean z2;
        float f15;
        float fDp12;
        int iChangeColorAccent;
        float progress;
        AnonymousClass3 anonymousClass3;
        TLRPC.Chat chat = this.chat;
        boolean z3 = false;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z = false;
        } else {
            float imageY2 = this.avatarImage.getImageY2();
            float imageX2 = this.avatarImage.getImageX2();
            AnonymousClass3 anonymousClass4 = this.checkBox;
            float progress2 = (anonymousClass4 == null || !anonymousClass4.checkBoxBase.isChecked) ? 1.0f : 1.0f - anonymousClass4.getProgress();
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
            int iDp = AndroidUtilities.dp(19.33f);
            Rect rect = AndroidUtilities.rectTmp2;
            int i3 = (int) imageX2;
            int i4 = (int) imageY2;
            int i5 = i4 - iDp;
            rect.set((AndroidUtilities.dp(1.66f) + i3) - iDp, i5, AndroidUtilities.dp(1.66f) + i3, i4);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.starBg.setBounds(rect);
            int i6 = (int) (progress2 * 255.0f);
            this.starBg.setAlpha(i6);
            this.starBg.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i3) - iDp, i5, AndroidUtilities.dp(1.66f) + i3, i4);
            this.starFg.setBounds(rect);
            this.starFg.setAlpha(i6);
            this.starFg.draw(canvas);
            z = true;
        }
        float f16 = this.premiumBlockedT.set(this.premiumBlocked && !z);
        float f17 = 10.0f;
        if (f16 > 0.0f) {
            float centerY = this.avatarImage.getCenterY() + AndroidUtilities.dp(18.0f);
            float centerX = this.avatarImage.getCenterX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * f16, Theme.dialogs_onlineCirclePaint);
            if (this.premiumGradient == null) {
                this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, this.resourcesProvider);
            }
            this.premiumGradient.gradientMatrix((int) (centerX - AndroidUtilities.dp(10.0f)), 0.0f, (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), 0.0f, (int) (AndroidUtilities.dp(10.0f) + centerY));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * f16, this.premiumGradient.paint);
            if (this.lockDrawable == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable2 = this.lockDrawable;
            drawable2.setBounds((int) (centerX - (((drawable2.getIntrinsicWidth() / 2.0f) * 0.875f) * f16)), (int) (centerY - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f16)), (int) (((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f16) + centerX), (int) (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f16) + centerY));
            this.lockDrawable.setAlpha((int) (f16 * 255.0f));
            this.lockDrawable.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.isDialogCell || this.currentDialogFolderId != 0 || z) {
            return false;
        }
        boolean z4 = (this.ttlPeriod <= 0 || isOnline() || this.hasCall || this.storyParams.drawnLive) ? false : true;
        this.showTtl = z4;
        if (this.rightFragmentOpenedProgress == 1.0f || (!z4 && this.ttlProgress <= 0.0f)) {
            f = 9.0f;
        } else {
            TimerDrawable timerDrawable = this.timerDrawable;
            if (timerDrawable != null) {
                int i7 = timerDrawable.time;
                int i8 = this.ttlPeriod;
                if (i7 != i8 && i8 > 0) {
                    int i9 = this.ttlPeriod;
                    TimerDrawable timerDrawable2 = new TimerDrawable(ApplicationLoader.applicationContext, null);
                    timerDrawable2.isDialog = true;
                    timerDrawable2.setTime(i9);
                    this.timerDrawable = timerDrawable2;
                }
            } else {
                int i10 = this.ttlPeriod;
                TimerDrawable timerDrawable3 = new TimerDrawable(ApplicationLoader.applicationContext, null);
                timerDrawable3.isDialog = true;
                timerDrawable3.setTime(i10);
                this.timerDrawable = timerDrawable3;
            }
            if (this.timerPaint == null) {
                this.timerPaint = new Paint(1);
                Paint paint = new Paint(1);
                this.timerPaint2 = paint;
                paint.setColor(838860800);
            }
            int imageY3 = (int) (this.avatarImage.getImageY2() - AndroidUtilities.dp(9.0f));
            int iDp2 = (int) (LocaleController.isRTL ? this.storyParams.originalAvatarRect.left + AndroidUtilities.dp(9.0f) : this.storyParams.originalAvatarRect.right - AndroidUtilities.dp(9.0f));
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
                    VectorAvatarThumbDrawable vectorAvatarThumbDrawable = (VectorAvatarThumbDrawable) this.avatarImage.getDrawable();
                    Paint paint2 = this.timerPaint;
                    GradientTools gradientTools = vectorAvatarThumbDrawable.gradientTools;
                    int iBlendARGB = gradientTools.color1;
                    int i11 = gradientTools.color2;
                    f = 9.0f;
                    if (i11 != 0) {
                        iBlendARGB = ColorUtils.blendARGB(0.5f, iBlendARGB, i11);
                    }
                    int i12 = gradientTools.color3;
                    if (i12 != 0) {
                        iBlendARGB = ColorUtils.blendARGB(0.5f, iBlendARGB, i12);
                    }
                    int i13 = gradientTools.color4;
                    if (i13 != 0) {
                        iBlendARGB = ColorUtils.blendARGB(0.5f, iBlendARGB, i13);
                    }
                    paint2.setColor(iBlendARGB);
                } else {
                    f = 9.0f;
                    Paint paint3 = this.timerPaint;
                    AvatarDrawable avatarDrawable = this.avatarDrawable;
                    if (avatarDrawable.needApplyColorAccent) {
                        int i14 = avatarDrawable.color2;
                        Theme.ThemeAccent accent = Theme.currentTheme.getAccent(false);
                        iChangeColorAccent = Theme.changeColorAccent(Theme.currentTheme, accent != null ? accent.accentColor : 0, i14);
                    } else {
                        iChangeColorAccent = avatarDrawable.color2;
                    }
                    paint3.setColor(iChangeColorAccent);
                }
                canvas.save();
                progress = (1.0f - this.rightFragmentOpenedProgress) * this.ttlProgress;
                anonymousClass3 = this.checkBox;
                if (anonymousClass3 != null) {
                    progress *= 1.0f - anonymousClass3.getProgress();
                }
                float f18 = iDp2;
                float f19 = imageY3;
                canvas.scale(progress, progress, f18, f19);
                canvas.drawCircle(f18, f19, AndroidUtilities.dpf2(11.0f), this.timerPaint);
                canvas.drawCircle(f18, f19, AndroidUtilities.dpf2(11.0f), this.timerPaint2);
                canvas.save();
                canvas.translate(f18 - AndroidUtilities.dpf2(11.0f), f19 - AndroidUtilities.dpf2(11.0f));
                this.timerDrawable.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            f = 9.0f;
            canvas.save();
            progress = (1.0f - this.rightFragmentOpenedProgress) * this.ttlProgress;
            anonymousClass3 = this.checkBox;
            if (anonymousClass3 != null) {
                progress *= 1.0f - anonymousClass3.getProgress();
            }
            float f110 = iDp2;
            float f111 = imageY3;
            canvas.scale(progress, progress, f110, f111);
            canvas.drawCircle(f110, f111, AndroidUtilities.dpf2(11.0f), this.timerPaint);
            canvas.drawCircle(f110, f111, AndroidUtilities.dpf2(11.0f), this.timerPaint2);
            canvas.save();
            canvas.translate(f110 - AndroidUtilities.dpf2(11.0f), f111 - AndroidUtilities.dpf2(11.0f));
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
                    AnonymousClass3 anonymousClass5 = this.checkBox;
                    float progress3 = (anonymousClass5 == null || !anonymousClass5.checkBoxBase.isChecked) ? 1.0f : 1.0f - anonymousClass5.getProgress();
                    int iDp3 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                    if (LocaleController.isRTL) {
                        float f20 = this.storyParams.originalAvatarRect.left;
                        if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f17 = 6.0f;
                        }
                        fDp = f20 + AndroidUtilities.dp(f17);
                    } else {
                        float f21 = this.storyParams.originalAvatarRect.right;
                        if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f17 = 6.0f;
                        }
                        fDp = f21 - AndroidUtilities.dp(f17);
                    }
                    int i15 = (int) fDp;
                    if (this.rightFragmentOpenedProgress != 0.0f) {
                        canvas.save();
                        float f22 = 1.0f - this.rightFragmentOpenedProgress;
                        canvas.scale(f22, f22, i15, iDp3);
                    }
                    Paint paint4 = Theme.dialogs_onlineCirclePaint;
                    int i16 = Theme.key_windowBackgroundWhite;
                    paint4.setColor(Theme.getColor(i16, this.resourcesProvider));
                    float f23 = i15;
                    float f24 = iDp3;
                    canvas.drawCircle(f23, f24, AndroidUtilities.dp(11.0f) * this.chatCallProgress * progress3, Theme.dialogs_onlineCirclePaint);
                    f2 = 0.10666667f;
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                    canvas.drawCircle(f23, f24, AndroidUtilities.dp(f) * this.chatCallProgress * progress3, Theme.dialogs_onlineCirclePaint);
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(i16, this.resourcesProvider));
                    if (!LiteMode.isEnabled(360928)) {
                        this.innerProgress = 0.65f;
                    }
                    int i17 = this.progressStage;
                    if (i17 == 0) {
                        i = 360928;
                        fDp2 = (AndroidUtilities.dp(4.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                        fDp10 = AndroidUtilities.dp(3.0f);
                        fDp11 = AndroidUtilities.dp(2.0f);
                        f6 = this.innerProgress;
                    } else {
                        i = 360928;
                        if (i17 == 1) {
                            fDp5 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                            fDp8 = AndroidUtilities.dp(1.0f);
                            fDp9 = AndroidUtilities.dp(4.0f);
                            f5 = this.innerProgress;
                        } else {
                            if (i17 == 2) {
                                fDp5 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(2.0f) * this.innerProgress);
                                fDp6 = AndroidUtilities.dp(5.0f);
                                fDp7 = AndroidUtilities.dp(4.0f);
                                f4 = this.innerProgress;
                            } else {
                                if (i17 == 3) {
                                    fDp2 = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.innerProgress);
                                    fDp3 = AndroidUtilities.dp(1.0f);
                                    fDp4 = AndroidUtilities.dp(2.0f);
                                    f3 = this.innerProgress;
                                } else if (i17 == 4) {
                                    fDp2 = (AndroidUtilities.dp(4.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                                    fDp10 = AndroidUtilities.dp(3.0f);
                                    fDp11 = AndroidUtilities.dp(2.0f);
                                    f6 = this.innerProgress;
                                } else if (i17 == 5) {
                                    fDp5 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                    fDp8 = AndroidUtilities.dp(1.0f);
                                    fDp9 = AndroidUtilities.dp(4.0f);
                                    f5 = this.innerProgress;
                                } else if (i17 == 6) {
                                    fDp5 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                    fDp6 = AndroidUtilities.dp(5.0f);
                                    fDp7 = AndroidUtilities.dp(4.0f);
                                    f4 = this.innerProgress;
                                } else {
                                    fDp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                    fDp3 = AndroidUtilities.dp(1.0f);
                                    fDp4 = AndroidUtilities.dp(2.0f);
                                    f3 = this.innerProgress;
                                }
                                f7 = fDp3 + (fDp4 * f3);
                                if (this.chatCallProgress >= 1.0f || progress3 < 1.0f) {
                                    canvas.save();
                                    float f25 = this.chatCallProgress * progress3;
                                    canvas.scale(f25, f25, f23, f24);
                                }
                                this.rect.set(i15 - AndroidUtilities.dp(1.0f), f24 - fDp2, AndroidUtilities.dp(1.0f) + i15, fDp2 + f24);
                                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                                float f26 = f24 - f7;
                                float f27 = f24 + f7;
                                this.rect.set(i15 - AndroidUtilities.dp(5.0f), f26, i15 - AndroidUtilities.dp(3.0f), f27);
                                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                                this.rect.set(AndroidUtilities.dp(3.0f) + i15, f26, AndroidUtilities.dp(5.0f) + i15, f27);
                                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                                if (this.chatCallProgress >= 1.0f || progress3 < 1.0f) {
                                    canvas.restore();
                                }
                                if (LiteMode.isEnabled(i)) {
                                    f13 = this.innerProgress + 0.04f;
                                    this.innerProgress = f13;
                                    if (f13 >= 1.0f) {
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
                                    f11 = this.chatCallProgress;
                                    if (f11 < 1.0f) {
                                        f12 = f11 + 0.10666667f;
                                        this.chatCallProgress = f12;
                                        if (f12 > 1.0f) {
                                            this.chatCallProgress = 1.0f;
                                        }
                                    }
                                } else {
                                    f9 = this.chatCallProgress;
                                    if (f9 > 0.0f) {
                                        f10 = f9 - 0.10666667f;
                                        this.chatCallProgress = f10;
                                        if (f10 < 0.0f) {
                                            this.chatCallProgress = 0.0f;
                                        }
                                    }
                                }
                                if (this.rightFragmentOpenedProgress != 0.0f) {
                                    canvas.restore();
                                }
                            }
                            f8 = fDp6 - (fDp7 * f4);
                            fDp2 = fDp5;
                            f7 = f8;
                            if (this.chatCallProgress >= 1.0f) {
                                canvas.save();
                                float f28 = this.chatCallProgress * progress3;
                                canvas.scale(f28, f28, f23, f24);
                            } else {
                                canvas.save();
                                float f29 = this.chatCallProgress * progress3;
                                canvas.scale(f29, f29, f23, f24);
                            }
                            this.rect.set(i15 - AndroidUtilities.dp(1.0f), f24 - fDp2, AndroidUtilities.dp(1.0f) + i15, fDp2 + f24);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            float f210 = f24 - f7;
                            float f211 = f24 + f7;
                            this.rect.set(i15 - AndroidUtilities.dp(5.0f), f210, i15 - AndroidUtilities.dp(3.0f), f211);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            this.rect.set(AndroidUtilities.dp(3.0f) + i15, f210, AndroidUtilities.dp(5.0f) + i15, f211);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            if (this.chatCallProgress >= 1.0f) {
                                canvas.restore();
                            } else {
                                canvas.restore();
                            }
                            if (LiteMode.isEnabled(i)) {
                                f13 = this.innerProgress + 0.04f;
                                this.innerProgress = f13;
                                if (f13 >= 1.0f) {
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
                                f11 = this.chatCallProgress;
                                if (f11 < 1.0f) {
                                    f12 = f11 + 0.10666667f;
                                    this.chatCallProgress = f12;
                                    if (f12 > 1.0f) {
                                        this.chatCallProgress = 1.0f;
                                    }
                                }
                            } else {
                                f9 = this.chatCallProgress;
                                if (f9 > 0.0f) {
                                    f10 = f9 - 0.10666667f;
                                    this.chatCallProgress = f10;
                                    if (f10 < 0.0f) {
                                        this.chatCallProgress = 0.0f;
                                    }
                                }
                            }
                            if (this.rightFragmentOpenedProgress != 0.0f) {
                                canvas.restore();
                            }
                        }
                        f8 = fDp8 + (fDp9 * f5);
                        fDp2 = fDp5;
                        f7 = f8;
                        if (this.chatCallProgress >= 1.0f) {
                            canvas.save();
                            float f212 = this.chatCallProgress * progress3;
                            canvas.scale(f212, f212, f23, f24);
                        } else {
                            canvas.save();
                            float f213 = this.chatCallProgress * progress3;
                            canvas.scale(f213, f213, f23, f24);
                        }
                        this.rect.set(i15 - AndroidUtilities.dp(1.0f), f24 - fDp2, AndroidUtilities.dp(1.0f) + i15, fDp2 + f24);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        float f214 = f24 - f7;
                        float f215 = f24 + f7;
                        this.rect.set(i15 - AndroidUtilities.dp(5.0f), f214, i15 - AndroidUtilities.dp(3.0f), f215);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        this.rect.set(AndroidUtilities.dp(3.0f) + i15, f214, AndroidUtilities.dp(5.0f) + i15, f215);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        if (this.chatCallProgress >= 1.0f) {
                            canvas.restore();
                        } else {
                            canvas.restore();
                        }
                        if (LiteMode.isEnabled(i)) {
                            f13 = this.innerProgress + 0.04f;
                            this.innerProgress = f13;
                            if (f13 >= 1.0f) {
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
                            f11 = this.chatCallProgress;
                            if (f11 < 1.0f) {
                                f12 = f11 + 0.10666667f;
                                this.chatCallProgress = f12;
                                if (f12 > 1.0f) {
                                    this.chatCallProgress = 1.0f;
                                }
                            }
                        } else {
                            f9 = this.chatCallProgress;
                            if (f9 > 0.0f) {
                                f10 = f9 - 0.10666667f;
                                this.chatCallProgress = f10;
                                if (f10 < 0.0f) {
                                    this.chatCallProgress = 0.0f;
                                }
                            }
                        }
                        if (this.rightFragmentOpenedProgress != 0.0f) {
                            canvas.restore();
                        }
                    }
                    f7 = fDp10 - (fDp11 * f6);
                    if (this.chatCallProgress >= 1.0f) {
                        canvas.save();
                        float f216 = this.chatCallProgress * progress3;
                        canvas.scale(f216, f216, f23, f24);
                    } else {
                        canvas.save();
                        float f217 = this.chatCallProgress * progress3;
                        canvas.scale(f217, f217, f23, f24);
                    }
                    this.rect.set(i15 - AndroidUtilities.dp(1.0f), f24 - fDp2, AndroidUtilities.dp(1.0f) + i15, fDp2 + f24);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    float f218 = f24 - f7;
                    float f219 = f24 + f7;
                    this.rect.set(i15 - AndroidUtilities.dp(5.0f), f218, i15 - AndroidUtilities.dp(3.0f), f219);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    this.rect.set(AndroidUtilities.dp(3.0f) + i15, f218, AndroidUtilities.dp(5.0f) + i15, f219);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    if (this.chatCallProgress >= 1.0f) {
                        canvas.restore();
                    } else {
                        canvas.restore();
                    }
                    if (LiteMode.isEnabled(i)) {
                        f13 = this.innerProgress + 0.04f;
                        this.innerProgress = f13;
                        if (f13 >= 1.0f) {
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
                        f11 = this.chatCallProgress;
                        if (f11 < 1.0f) {
                            f12 = f11 + 0.10666667f;
                            this.chatCallProgress = f12;
                            if (f12 > 1.0f) {
                                this.chatCallProgress = 1.0f;
                            }
                        }
                    } else {
                        f9 = this.chatCallProgress;
                        if (f9 > 0.0f) {
                            f10 = f9 - 0.10666667f;
                            this.chatCallProgress = f10;
                            if (f10 < 0.0f) {
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
                f15 = this.ttlProgress;
                if (f15 < 1.0f) {
                    this.ttlProgress = f15 + f2;
                    z2 = true;
                } else {
                    z2 = z3;
                }
            } else {
                f14 = this.ttlProgress;
                if (f14 > 0.0f) {
                    this.ttlProgress = f14 - f2;
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
            int iDp4 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
            if (LocaleController.isRTL) {
                float f30 = this.storyParams.originalAvatarRect.left;
                if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                    f17 = 6.0f;
                }
                fDp12 = f30 + AndroidUtilities.dp(f17);
            } else {
                float f31 = this.storyParams.originalAvatarRect.right;
                if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                    f17 = 6.0f;
                }
                fDp12 = f31 - AndroidUtilities.dp(f17);
            }
            int i18 = (int) fDp12;
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            float f32 = i18;
            float f33 = iDp4;
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
        f2 = 0.10666667f;
        if (this.showTtl) {
            f15 = this.ttlProgress;
            if (f15 < 1.0f) {
                this.ttlProgress = f15 + f2;
                z2 = true;
            } else {
                z2 = z3;
            }
        } else {
            f14 = this.ttlProgress;
            if (f14 > 0.0f) {
                this.ttlProgress = f14 - f2;
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
                MsgClockDrawable msgClockDrawable = Theme.dialogs_clockDrawable;
                int i = this.clockDrawLeft;
                int i2 = this.checkDrawTop;
                msgClockDrawable.getClass();
                BaseCell.setDrawableBounds(msgClockDrawable, i, i2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
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
                if (StoryViewer.animationInProgress) {
                    return;
                }
                super.invalidate();
                return;
            }
            if (z3) {
                if (!z2) {
                    Drawable drawable = Theme.dialogs_checkDrawable;
                    BaseCell.setDrawableBounds(drawable, this.checkDrawLeft1, this.checkDrawTop, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
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
                Drawable drawable2 = Theme.dialogs_halfCheckDrawable;
                BaseCell.setDrawableBounds(drawable2, this.halfCheckDrawLeft, this.checkDrawTop, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                if (z4) {
                    canvas.save();
                    canvas.scale(f2, f2, Theme.dialogs_halfCheckDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                    Theme.dialogs_halfCheckDrawable.setAlpha((int) (f * 255.0f));
                }
                if (!z4 && f != 0.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, Theme.dialogs_halfCheckDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                    int i3 = (int) (255.0f * f);
                    Theme.dialogs_halfCheckDrawable.setAlpha(i3);
                    Theme.dialogs_checkReadDrawable.setAlpha(i3);
                }
                Theme.dialogs_halfCheckDrawable.draw(canvas);
                if (z4) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate((1.0f - f) * AndroidUtilities.dp(4.0f), 0.0f);
                }
                Drawable drawable3 = Theme.dialogs_checkReadDrawable;
                BaseCell.setDrawableBounds(drawable3, this.checkDrawLeft, this.checkDrawTop, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
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
        RectF rectF3 = this.rect;
        if (staticLayout == null || this.unreadCount == 0) {
            if (this.unreadCount != 0) {
                staticLayout = this.countLayout;
            }
            paint.setAlpha((int) ((f2 - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint2.setAlpha((int) ((f2 - this.reorderIconProgress) * 255.0f));
            float f4 = i;
            rectF3.set(i2, f4, AndroidUtilities.dp(12.666f) + this.countWidth + i2, AndroidUtilities.dp(20.666f) + i);
            int iSave = canvas.save();
            if (f != f2) {
                canvas.scale(f, f, rectF3.centerX(), rectF3.centerY());
            }
            if (f3 != f2) {
                canvas.scale(f3, f3, rectF3.centerX(), rectF3.centerY());
            }
            if (z4) {
                if (this.counterPath == null || (rectF = this.counterPathRect) == null || !rectF.equals(rectF3)) {
                    RectF rectF4 = this.counterPathRect;
                    if (rectF4 == null) {
                        this.counterPathRect = new RectF(rectF3);
                    } else {
                        rectF4.set(rectF3);
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
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.counterPaintOutline);
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
            rectF3.set(f8, f9, (this.countWidthOld * f7) + (this.countWidth * f6) + f8 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i);
            float interpolation = ((f3 <= 0.5f ? CubicBezierInterpolator.EASE_OUT.getInterpolation(f5) : CubicBezierInterpolator.EASE_IN.getInterpolation(f2 - ((f3 - 0.5f) * 2.0f))) * 0.1f) + f2;
            canvas.save();
            float f10 = interpolation * f;
            canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
            if (z4) {
                if (this.counterPath == null || (rectF2 = this.counterPathRect) == null || !rectF2.equals(rectF3)) {
                    RectF rectF5 = this.counterPathRect;
                    if (rectF5 == null) {
                        this.counterPathRect = new RectF(rectF3);
                    } else {
                        rectF5.set(rectF3);
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
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.counterPaintOutline);
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

    public final CharSequence formatArchivedDialogNames() {
        TLRPC.User user;
        String string;
        int i = this.currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.currentDialogFolderId);
        this.currentDialogFolderDialogsCount = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Dialog dialog = dialogs.get(i2);
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
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        if (MessagesController.getInstance(i).storiesController.getTotalStoriesCount(true) > 0) {
            int iMax = Math.max(1, MessagesController.getInstance(i).storiesController.getTotalStoriesCount(true));
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
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider)), length, length2, 33);
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
        int i;
        long j;
        long topicId;
        boolean z;
        int length;
        if (this.forumFormattedNames == null) {
            this.forumFormattedNames = new ForumFormattedNames(this);
        }
        ForumFormattedNames forumFormattedNames = this.forumFormattedNames;
        MessageObject messageObject = this.message;
        TLRPC.Chat chat = this.chat;
        forumFormattedNames.getClass();
        boolean z2 = false;
        int id = (messageObject == null || chat == null) ? 0 : messageObject.getId();
        if (forumFormattedNames.lastMessageId != id || forumFormattedNames.isLoadingState) {
            forumFormattedNames.avatarSpans = null;
            forumFormattedNames.topMessageTopicEndIndex = 0;
            forumFormattedNames.lastTopicMessageUnread = false;
            forumFormattedNames.isLoadingState = false;
            forumFormattedNames.lastMessageId = id;
            TextPaint textPaint = Theme.dialogs_messagePaint[0];
            if (chat != null) {
                int i2 = this.currentAccount;
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i2).getTopicsController().getTopics(chat.id);
                if (topics != null && !topics.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(topics);
                    Collections.sort(arrayList2, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(3)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (messageObject == null || ChatObject.isMonoForum(chat)) {
                        arrayList = arrayList2;
                        i = 1;
                        j = 0;
                        topicId = 0;
                        z = false;
                        length = 0;
                    } else {
                        topicId = MessageObject.getTopicId(i2, messageObject.messageOwner, true);
                        j = 0;
                        arrayList = arrayList2;
                        i = 1;
                        TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i2).getTopicsController().findTopic(chat.id, topicId);
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
                        int i3 = 0;
                        while (i3 < Math.min(4, arrayList.size())) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            ArrayList arrayList3 = arrayList;
                            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList3.get(i3)).from_id);
                            AvatarSpan avatarSpan = new AvatarSpan(forumFormattedNames.parent, 18.0f, i2);
                            avatarSpan.needDrawShadow = z2;
                            int i4 = avatarSpan.currentAccount;
                            if (peerDialogId >= j) {
                                avatarSpan.setUser(MessagesController.getInstance(i4).getUser(Long.valueOf(peerDialogId)));
                            } else {
                                avatarSpan.setChat(MessagesController.getInstance(i4).getChat(Long.valueOf(-peerDialogId)));
                            }
                            forumFormattedNames.avatarSpans.put(Long.valueOf(peerDialogId), avatarSpan);
                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                            spannableStringBuilderValueOf.insert(0, (CharSequence) "  ");
                            spannableStringBuilderValueOf.setSpan(avatarSpan, 0, i, 33);
                            spannableStringBuilder.append((CharSequence) spannableStringBuilderValueOf);
                            i3++;
                            arrayList = arrayList3;
                            z2 = false;
                            i = 1;
                        }
                    } else {
                        ArrayList arrayList4 = arrayList;
                        int i5 = 0;
                        boolean z3 = true;
                        for (int i6 = 4; i5 < Math.min(i6, arrayList4.size()); i6 = 4) {
                            if (((TLRPC.TL_forumTopic) arrayList4.get(i5)).id != topicId) {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z3 && z) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                spannableStringBuilder.append(ForumUtilities.getTopicSpannedName((TLRPC.ForumTopic) arrayList4.get(i5), textPaint, null));
                                z3 = false;
                            }
                            i5++;
                        }
                    }
                    if (length > 0) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), Theme.key_chats_name, 0), 0, Math.min(spannableStringBuilder.length(), length + 2), 0);
                    }
                    forumFormattedNames.formattedNames = spannableStringBuilder;
                } else if (MessagesController.getInstance(i2).getTopicsController().endIsReached(chat.id)) {
                    forumFormattedNames.formattedNames = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                } else {
                    MessagesController.getInstance(i2).getTopicsController().preloadTopics(chat.id);
                    forumFormattedNames.formattedNames = LocaleController.getString(R.string.Loading);
                    forumFormattedNames.isLoadingState = true;
                }
            }
        }
        this.forumFormattedNames.getClass();
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

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.DialogCell.getMessageNameString():java.lang.String");
    }

    public final SpannableStringBuilder getMessageStringFormatted(int i, String str, CharSequence charSequence, boolean z) {
        String strSubSequence;
        CharSequence charSequenceReplaceNewLines;
        TLRPC.Message message;
        CharSequence string;
        String pluralString;
        CharSequence charSequence2;
        String str2;
        SpannableStringBuilder spannableStringBuilderValueOf;
        MessageObject captionMessage = getCaptionMessage();
        MessageObject messageObject = this.message;
        CharSequence charSequence3 = messageObject != null ? messageObject.messageText : null;
        this.applyName = true;
        if (!TextUtils.isEmpty(str)) {
            return formatInternal(str, charSequence, i);
        }
        MessageObject messageObject2 = this.message;
        TLRPC.Message message2 = messageObject2.messageOwner;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence4 = messageObject2.messageTextShort;
            if (charSequence4 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.isTopic)) {
                charSequence4 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                spannableStringBuilderValueOf = formatInternal(charSequence4, charSequence, i);
                if (this.message.topicIconDrawable[0] instanceof ForumBubbleDrawable) {
                    int i2 = this.currentAccount;
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i2).getTopicsController().findTopic(-this.message.getDialogId(), MessageObject.getTopicId(i2, this.message.messageOwner, true));
                    if (tL_forumTopicFindTopic != null) {
                        ((ForumBubbleDrawable) this.message.topicIconDrawable[0]).setColor(tL_forumTopicFindTopic.icon_color);
                    }
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
            return formatInternal(charSequenceAppend, charSequence, i);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (richMessage != null) {
            boolean zIsBlueBlock = richMessage.blocks.size() == 1 ? MessageObject.isBlueBlock(this.message.messageOwner.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder internal = formatInternal(this.message.messageText, charSequence, i);
            if (zIsBlueBlock && !isForumCell()) {
                try {
                    internal.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_actionMessage, resourcesProvider), this.hasNameInMessage ? charSequence.length() + 2 : 0, internal.length(), 33);
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
            return formatInternal(spannableString2, charSequence, i);
        }
        this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
        int i3 = Theme.key_chats_attachMessage;
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
            string = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 \u2068", messageObject6.getMusicAuthor(), " - ", this.message.getMusicTitle(), "\u2069");
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
            if (this.hasVideoThumb) {
                pluralString = size > 1 ? LocaleController.formatPluralString("Media", size, new Object[0]) : LocaleController.getString(R.string.AttachVideo);
            } else {
                pluralString = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
            }
            string = StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.AttachPaidMedia, pluralString), 1.13f, (ColoredImageSpan[]) null);
            i3 = Theme.key_chats_actionMessage;
        } else if (this.thumbsCount > 1) {
            if (this.hasVideoThumb) {
                ArrayList arrayList3 = this.groupMessages;
                string = LocaleController.formatPluralString("Media", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
            } else {
                ArrayList arrayList4 = this.groupMessages;
                string = LocaleController.formatPluralString("Photos", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
            }
            i3 = Theme.key_chats_actionMessage;
        } else {
            string = charSequence3.toString();
            i3 = Theme.key_chats_actionMessage;
        }
        if (string instanceof String) {
            string = ((String) string).replace('\n', ' ');
        }
        if (z) {
            string = applyThumbs(string);
        }
        SpannableStringBuilder internal2 = formatInternal(string, charSequence, i);
        if (!isForumCell()) {
            try {
                internal2.setSpan(new ForegroundColorSpanThemable(i3, resourcesProvider), this.hasNameInMessage ? charSequence.length() + 2 : 0, internal2.length(), 33);
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

    public final boolean hasTags() {
        DialogCellTags dialogCellTags = this.tags;
        return (dialogCellTags == null || dialogCellTags.tags.isEmpty()) ? false : true;
    }

    @Override
    public final void invalidate() {
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.translationDrawable || drawable == Theme.dialogs_archiveAvatarDrawable) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final boolean isCounterMuted() {
        if (ChatObject.isCommunity(this.chat)) {
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

    public final boolean isDialogFolder() {
        return this.currentDialogFolderId > 0;
    }

    public final boolean isFolderCell() {
        return this.currentDialogFolderId != 0;
    }

    public boolean isForumCell() {
        TLRPC.Chat chat;
        if (isDialogFolder() || this.insideCommunityListNoDialog || (chat = this.chat) == null) {
            return false;
        }
        return (chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, this.chat))) && !this.isTopic;
    }

    public final boolean isOnline() {
        TLRPC.User user;
        if (!isForumCell() && !this.storyParams.drawnLive && (user = this.user) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i = this.currentAccount;
            if (userStatus != null && userStatus.expires <= 0 && MessagesController.getInstance(i).onlinePrivacy.containsKey(Long.valueOf(this.user.id))) {
                return true;
            }
            TLRPC.UserStatus userStatus2 = this.user.status;
            if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i).getCurrentTime()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isPointInsideAvatar(float f) {
        if (LocaleController.isRTL) {
            return f >= ((float) (getMeasuredWidth() - AndroidUtilities.dp(60.0f))) && f < ((float) getMeasuredWidth());
        }
        return f >= 0.0f && f < ((float) AndroidUtilities.dp(60.0f));
    }

    public final void lambda$createStatusDrawableAnimator$4(ValueAnimator valueAnimator) {
        this.statusDrawableProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    public final void lambda$update$0(ValueAnimator valueAnimator) {
        this.countChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    public final void lambda$update$1(ValueAnimator valueAnimator) {
        this.reactionsMentionsChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
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
            rLottieDrawable.isRunning = false;
            rLottieDrawable.checkChoreographer$1();
            this.translationDrawable.setProgress(0.0f, true);
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
        reset();
        this.canvasButton = null;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int color;
        int color2;
        int i;
        String string;
        int i2;
        String str;
        int i3;
        int i4;
        float measuredWidth;
        String str2;
        Theme.ResourcesProvider resourcesProvider;
        boolean z;
        QrActivity.AnonymousClass2 anonymousClass2;
        float f;
        String str3;
        int iM$2;
        int intrinsicWidth;
        int intrinsicHeight;
        float f2;
        String str4;
        int i5;
        float f3;
        String str5;
        int iCeil;
        int i6;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        float f4;
        boolean z2;
        RLottieDrawable rLottieDrawable;
        float f5;
        float f6;
        Theme.ResourcesProvider resourcesProvider2;
        float f7;
        DialogCell dialogCell;
        Theme.ResourcesProvider resourcesProvider3;
        ViewPager.AnonymousClass2 anonymousClass3;
        QrActivity.AnonymousClass2 anonymousClass4;
        boolean z3;
        boolean z4;
        boolean z5;
        ImageReceiver imageReceiver;
        boolean z6;
        AnonymousClass1 anonymousClass1;
        DialogCell dialogCell2;
        float f8;
        Canvas canvas2;
        boolean z7;
        float f9;
        float f10;
        float f11;
        boolean z8;
        float f12;
        float f13;
        float f14;
        float f15;
        AvatarDrawable avatarDrawable;
        float f16;
        float f17;
        int i7;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        AvatarDrawable avatarDrawable2;
        int color3;
        int iDp;
        int alpha;
        float f25;
        float measuredHeight;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z9;
        boolean z10;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        int i8;
        int iSaveLayerAlpha;
        int i9;
        boolean z11;
        QrActivity.AnonymousClass2 anonymousClass5;
        float f26;
        int i10;
        RectF rectF;
        DialogCell dialogCell3;
        float f27;
        boolean z12;
        float f28;
        ScamDrawable scamDrawable;
        ScamDrawable scamDrawable2;
        float f29;
        int iDp2;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        boolean z13;
        float f30;
        RectF rectF2;
        boolean zIsCounterMuted;
        float f31;
        Drawable drawable;
        Drawable drawable2;
        Paint paint;
        DialogCellTags dialogCellTags;
        int i11;
        float f32;
        int i12;
        RectF rectF3;
        ImageReceiver[] imageReceiverArr;
        Path path;
        float fDp;
        float f33;
        float f34;
        float f35;
        float f36;
        int i13;
        float f37;
        float f38;
        float fDp2;
        float f39;
        float f40;
        float f41;
        float f42;
        int iDp3;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i18;
        int i19;
        int i20;
        boolean z18;
        boolean z19;
        boolean z20;
        ArrayList arrayList;
        int i21;
        int i22;
        int i23;
        int i24;
        BaseCell.RippleDrawableSafe rippleDrawableSafe;
        RectF rectF4;
        float f43;
        float fM;
        StaticLayout staticLayout2;
        int i25;
        StatusDrawable chatStatusDrawable;
        float fM2;
        int iDp4;
        float f44;
        float f45;
        int i26;
        CustomDialog customDialog;
        float f46;
        DialogsActivity.AnonymousClass27 anonymousClass27;
        TLRPC.TL_forumTopic tL_forumTopic3;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final DialogCell dialogCell4 = this;
        Canvas canvas3 = canvas;
        ViewPager.AnonymousClass2 anonymousClass6 = dialogCell4.interpolator;
        DialogsActivity dialogsActivity = dialogCell4.parentFragment;
        boolean z21 = dialogCell4.drawArchive;
        if (!(dialogCell4.currentDialogId == 0 && dialogCell4.customDialog == null) && dialogCell4.visibleOnScreen) {
            QrActivity.AnonymousClass2 anonymousClass7 = dialogCell4.emojiStatusView;
            if (z21 && ((dialogCell4.currentDialogFolderId != 0 || (dialogCell4.isTopic && (tL_forumTopic4 = dialogCell4.forumTopic) != null && tL_forumTopic4.id == 1)) && (pullForegroundDrawable2 = dialogCell4.archivedChatsDrawable) != null && pullForegroundDrawable2.outProgress == 0.0f && dialogCell4.translationX == 0.0f)) {
                canvas3.save();
                canvas3.translate(0.0f, (-dialogCell4.translateY) - dialogCell4.rightFragmentOffset);
                canvas3.clipRect(0.0f, (1.0f - dialogCell4.archivedChatsDrawable.pullProgress) * dialogCell4.getMeasuredHeight(), dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                dialogCell4.archivedChatsDrawable.draw(canvas3, false);
                canvas3.restore();
                anonymousClass7.setVisibility(4);
                return;
            }
            boolean z22 = z21 && (dialogCell4.currentDialogFolderId != 0 || (dialogCell4.isTopic && (tL_forumTopic3 = dialogCell4.forumTopic) != null && tL_forumTopic3.id == 1)) && dialogCell4.archivedChatsDrawable != null && dialogCell4.translationX == 0.0f && dialogsActivity != null && dialogsActivity.hasHiddenArchive() && ((anonymousClass27 = dialogsActivity.rightSlidingDialogContainer) == null || !anonymousClass27.hasFragment());
            PullForegroundDrawable pullForegroundDrawable3 = dialogCell4.archivedChatsDrawable;
            float f47 = pullForegroundDrawable3 != null ? pullForegroundDrawable3.pullProgress : 1.0f;
            if (z22) {
                canvas3.save();
                canvas3.clipRect(0.0f, (1.0f - f47) * dialogCell4.getMeasuredHeight(), dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
            }
            if (dialogCell4.clipProgress != 0.0f && Build.VERSION.SDK_INT != 24) {
                canvas3.save();
                canvas3.clipRect(0.0f, dialogCell4.topClip * dialogCell4.clipProgress, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight() - ((int) (dialogCell4.bottomClip * dialogCell4.clipProgress)));
            }
            float f48 = dialogCell4.translationX;
            Theme.ResourcesProvider resourcesProvider4 = dialogCell4.resourcesProvider;
            if (f48 == 0.0f && dialogCell4.cornerProgress == 0.0f) {
                RLottieDrawable rLottieDrawable2 = dialogCell4.translationDrawable;
                if (rLottieDrawable2 != null) {
                    rLottieDrawable2.stop();
                    dialogCell4.translationDrawable.setProgress(0.0f, true);
                    dialogCell4.translationDrawable.setCallback(null);
                    dialogCell4.translationDrawable = null;
                    dialogCell4.translationAnimationStarted = false;
                }
                resourcesProvider = resourcesProvider4;
                z = z21;
                anonymousClass2 = anonymousClass7;
                f = 2.0f;
            } else {
                canvas3.save();
                canvas3.translate(0.0f, -dialogCell4.translateY);
                if (dialogCell4.overrideSwipeAction) {
                    color = Theme.getColor(dialogCell4.overrideSwipeActionBackgroundColorKey, resourcesProvider4);
                    color2 = Theme.getColor(dialogCell4.overrideSwipeActionRevealBackgroundColorKey, resourcesProvider4);
                    String str6 = dialogCell4.overrideSwipeActionStringKey;
                    i = dialogCell4.overrideSwipeActionStringId;
                    string = LocaleController.getString(str6, i);
                    dialogCell4.translationDrawable = dialogCell4.overrideSwipeActionDrawable;
                } else if (dialogCell4.currentDialogFolderId != 0) {
                    if (dialogCell4.archiveHidden) {
                        color = Theme.getColor(Theme.key_chats_archivePinBackground, resourcesProvider4);
                        color2 = Theme.getColor(Theme.key_chats_archiveBackground, resourcesProvider4);
                        i = R.string.UnhideFromTop;
                        string = LocaleController.getString(i);
                        dialogCell4.translationDrawable = Theme.dialogs_unpinArchiveDrawable;
                    } else {
                        color = Theme.getColor(Theme.key_chats_archiveBackground, resourcesProvider4);
                        color2 = Theme.getColor(Theme.key_chats_archivePinBackground, resourcesProvider4);
                        i = R.string.HideOnTop;
                        string = LocaleController.getString(i);
                        dialogCell4.translationDrawable = Theme.dialogs_pinArchiveDrawable;
                    }
                } else if (dialogCell4.promoDialog) {
                    color = Theme.getColor(Theme.key_chats_archiveBackground, resourcesProvider4);
                    color2 = Theme.getColor(Theme.key_chats_archivePinBackground, resourcesProvider4);
                    i = R.string.PsaHide;
                    string = LocaleController.getString(i);
                    dialogCell4.translationDrawable = Theme.dialogs_hidePsaDrawable;
                } else if (dialogCell4.folderId == 0) {
                    color = Theme.getColor(Theme.key_chats_archiveBackground, resourcesProvider4);
                    color2 = Theme.getColor(Theme.key_chats_archivePinBackground, resourcesProvider4);
                    if (ChatObject.isCommunity(dialogCell4.chat)) {
                        int i27 = R.string.SwipeUngroupCommunity;
                        String string2 = LocaleController.getString(i27);
                        color = Theme.getColor(Theme.key_dialogSwipeRemove, resourcesProvider4);
                        dialogCell4.translationDrawable = Theme.dialogs_swipeCommunityUngroup;
                        i2 = i27;
                        str = string2;
                        i3 = color;
                    } else {
                        int i28 = dialogCell4.currentAccount;
                        if (SharedConfig.getChatSwipeAction(i28) == 3) {
                            if (dialogCell4.dialogMuted) {
                                i = R.string.SwipeUnmute;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipeUnmuteDrawable;
                            } else {
                                i = R.string.SwipeMute;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipeMuteDrawable;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i28) == 4) {
                            i = R.string.SwipeDeleteChat;
                            string = LocaleController.getString(i);
                            color = Theme.getColor(Theme.key_dialogSwipeRemove, resourcesProvider4);
                            dialogCell4.translationDrawable = Theme.dialogs_swipeDeleteDrawable;
                        } else if (SharedConfig.getChatSwipeAction(i28) == 1) {
                            if (dialogCell4.unreadCount > 0 || dialogCell4.markUnread) {
                                i = R.string.SwipeMarkAsRead;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipeReadDrawable;
                            } else {
                                i = R.string.SwipeMarkAsUnread;
                                string = LocaleController.getString(i);
                                dialogCell4.translationDrawable = Theme.dialogs_swipeUnreadDrawable;
                            }
                        } else if (SharedConfig.getChatSwipeAction(i28) != 0) {
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
                    }
                    if (dialogCell4.swipeCanceled || (rLottieDrawable = dialogCell4.lastDrawTranslationDrawable) == null) {
                        dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                        dialogCell4.lastDrawSwipeMessageStringId = i2;
                    } else {
                        dialogCell4.translationDrawable = rLottieDrawable;
                        i2 = dialogCell4.lastDrawSwipeMessageStringId;
                    }
                    i4 = i2;
                    if (!dialogCell4.translationAnimationStarted && Math.abs(dialogCell4.translationX) > AndroidUtilities.dp(43.0f)) {
                        dialogCell4.translationAnimationStarted = true;
                        dialogCell4.translationDrawable.setProgress(0.0f, true);
                        dialogCell4.translationDrawable.setCallback(dialogCell4);
                        dialogCell4.translationDrawable.start();
                    }
                    measuredWidth = dialogCell4.getMeasuredWidth() + dialogCell4.translationX;
                    if (dialogCell4.currentRevealProgress < 1.0f) {
                        Theme.dialogs_pinnedPaint.setColor(color);
                        resourcesProvider = resourcesProvider4;
                        anonymousClass2 = anonymousClass7;
                        z = z21;
                        f = 2.0f;
                        str3 = "Line 1";
                        canvas3 = canvas;
                        str2 = "Arrow";
                        canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                        if (dialogCell4.currentRevealProgress == 0.0f) {
                            if (Theme.dialogs_archiveDrawableRecolored) {
                                Theme.dialogs_archiveDrawable.setLayerColor(Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground), str2);
                                Theme.dialogs_archiveDrawableRecolored = false;
                            }
                            if (Theme.dialogs_hidePsaDrawableRecolored) {
                                RLottieDrawable rLottieDrawable3 = Theme.dialogs_hidePsaDrawable;
                                rLottieDrawable3.applyingLayerColors = true;
                                int i29 = Theme.key_chats_archiveBackground;
                                rLottieDrawable3.setLayerColor(Theme.getNonAnimatedColor(i29), str3);
                                Theme.dialogs_hidePsaDrawable.setLayerColor(Theme.getNonAnimatedColor(i29), "Line 2");
                                Theme.dialogs_hidePsaDrawable.setLayerColor(Theme.getNonAnimatedColor(i29), "Line 3");
                                Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                                Theme.dialogs_hidePsaDrawableRecolored = false;
                            }
                        }
                    } else {
                        canvas3 = canvas;
                        str2 = "Arrow";
                        resourcesProvider = resourcesProvider4;
                        z = z21;
                        anonymousClass2 = anonymousClass7;
                        f = 2.0f;
                        str3 = "Line 1";
                    }
                    int measuredWidth2 = (dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.translationDrawable.getIntrinsicWidth() / 2);
                    iM$2 = OKLCH.m$2(52.0f, dialogCell4.getMeasuredHeight(), 2);
                    intrinsicWidth = (dialogCell4.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
                    intrinsicHeight = (dialogCell4.translationDrawable.getIntrinsicHeight() / 2) + iM$2;
                    if (dialogCell4.currentRevealProgress > 0.0f) {
                        canvas3.save();
                        i5 = i4;
                        str4 = str;
                        f2 = measuredWidth;
                        canvas3.clipRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                        Theme.dialogs_pinnedPaint.setColor(i3);
                        canvas3.drawCircle(intrinsicWidth, intrinsicHeight, AndroidUtilities.accelerateInterpolator.getInterpolation(dialogCell4.currentRevealProgress) * ((float) Math.sqrt(((intrinsicHeight - dialogCell4.getMeasuredHeight()) * (intrinsicHeight - dialogCell4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), Theme.dialogs_pinnedPaint);
                        canvas3.restore();
                        if (Theme.dialogs_archiveDrawableRecolored) {
                            z2 = true;
                        } else {
                            Theme.dialogs_archiveDrawable.setLayerColor(Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground), str2);
                            z2 = true;
                            Theme.dialogs_archiveDrawableRecolored = true;
                        }
                        if (!Theme.dialogs_hidePsaDrawableRecolored) {
                            RLottieDrawable rLottieDrawable4 = Theme.dialogs_hidePsaDrawable;
                            rLottieDrawable4.applyingLayerColors = z2;
                            int i30 = Theme.key_chats_archivePinBackground;
                            rLottieDrawable4.setLayerColor(Theme.getNonAnimatedColor(i30), str3);
                            Theme.dialogs_hidePsaDrawable.setLayerColor(Theme.getNonAnimatedColor(i30), "Line 2");
                            Theme.dialogs_hidePsaDrawable.setLayerColor(Theme.getNonAnimatedColor(i30), "Line 3");
                            Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                            Theme.dialogs_hidePsaDrawableRecolored = true;
                        }
                    } else {
                        f2 = measuredWidth;
                        str4 = str;
                        i5 = i4;
                    }
                    canvas3.save();
                    canvas3.translate(measuredWidth2, iM$2);
                    f3 = dialogCell4.currentRevealBounceProgress;
                    if (f3 != 0.0f && f3 != 1.0f) {
                        float interpolation = anonymousClass6.getInterpolation(f3) + 1.0f;
                        canvas3.scale(interpolation, interpolation, dialogCell4.translationDrawable.getIntrinsicWidth() / 2, dialogCell4.translationDrawable.getIntrinsicHeight() / 2);
                    }
                    BaseCell.setDrawableBounds(0, 0, dialogCell4.translationDrawable);
                    dialogCell4.translationDrawable.draw(canvas3);
                    canvas3.restore();
                    canvas3.clipRect(f2, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                    str5 = str4;
                    iCeil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str5));
                    i6 = i5;
                    if (dialogCell4.swipeMessageTextId == i6 || dialogCell4.swipeMessageWidth != dialogCell4.getMeasuredWidth()) {
                        dialogCell4.swipeMessageTextId = i6;
                        dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                        TextPaint textPaint = Theme.dialogs_archiveTextPaint;
                        int iMin = Math.min(AndroidUtilities.dp(80.0f), iCeil);
                        alignment = Layout.Alignment.ALIGN_CENTER;
                        staticLayout = new StaticLayout(str5, textPaint, iMin, alignment, 1.0f, 0.0f, false);
                        dialogCell4.swipeMessageTextLayout = staticLayout;
                        if (staticLayout.getLineCount() > 1) {
                            dialogCell4.swipeMessageTextLayout = new StaticLayout(str5, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), iCeil), alignment, 1.0f, 0.0f, false);
                        }
                    }
                    if (dialogCell4.swipeMessageTextLayout != null) {
                        canvas3.save();
                        if (dialogCell4.swipeMessageTextLayout.getLineCount() > 1) {
                            f4 = -AndroidUtilities.dp(4.0f);
                        } else {
                            f4 = 0.0f;
                        }
                        canvas3.translate((dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.swipeMessageTextLayout.getWidth() / f), AndroidUtilities.dp(36.0f) + iM$2 + f4);
                        dialogCell4.swipeMessageTextLayout.draw(canvas3);
                        canvas3.restore();
                    }
                    canvas3.restore();
                } else {
                    color = Theme.getColor(Theme.key_chats_archivePinBackground, resourcesProvider4);
                    color2 = Theme.getColor(Theme.key_chats_archiveBackground, resourcesProvider4);
                    i = R.string.Unarchive;
                    string = LocaleController.getString(i);
                    dialogCell4.translationDrawable = Theme.dialogs_unarchiveDrawable;
                }
                String str7 = string;
                i3 = color2;
                i2 = i;
                str = str7;
                if (dialogCell4.swipeCanceled) {
                    dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                    dialogCell4.lastDrawSwipeMessageStringId = i2;
                } else {
                    dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                    dialogCell4.lastDrawSwipeMessageStringId = i2;
                }
                i4 = i2;
                if (!dialogCell4.translationAnimationStarted) {
                    dialogCell4.translationAnimationStarted = true;
                    dialogCell4.translationDrawable.setProgress(0.0f, true);
                    dialogCell4.translationDrawable.setCallback(dialogCell4);
                    dialogCell4.translationDrawable.start();
                }
                measuredWidth = dialogCell4.getMeasuredWidth() + dialogCell4.translationX;
                if (dialogCell4.currentRevealProgress < 1.0f) {
                    Theme.dialogs_pinnedPaint.setColor(color);
                    resourcesProvider = resourcesProvider4;
                    anonymousClass2 = anonymousClass7;
                    z = z21;
                    f = 2.0f;
                    str3 = "Line 1";
                    canvas3 = canvas;
                    str2 = "Arrow";
                    canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                    if (dialogCell4.currentRevealProgress == 0.0f) {
                        if (Theme.dialogs_archiveDrawableRecolored) {
                            Theme.dialogs_archiveDrawable.setLayerColor(Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground), str2);
                            Theme.dialogs_archiveDrawableRecolored = false;
                        }
                        if (Theme.dialogs_hidePsaDrawableRecolored) {
                            RLottieDrawable rLottieDrawable5 = Theme.dialogs_hidePsaDrawable;
                            rLottieDrawable5.applyingLayerColors = true;
                            int i210 = Theme.key_chats_archiveBackground;
                            rLottieDrawable5.setLayerColor(Theme.getNonAnimatedColor(i210), str3);
                            Theme.dialogs_hidePsaDrawable.setLayerColor(Theme.getNonAnimatedColor(i210), "Line 2");
                            Theme.dialogs_hidePsaDrawable.setLayerColor(Theme.getNonAnimatedColor(i210), "Line 3");
                            Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                            Theme.dialogs_hidePsaDrawableRecolored = false;
                        }
                    }
                } else {
                    canvas3 = canvas;
                    str2 = "Arrow";
                    resourcesProvider = resourcesProvider4;
                    z = z21;
                    anonymousClass2 = anonymousClass7;
                    f = 2.0f;
                    str3 = "Line 1";
                }
                int measuredWidth3 = (dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.translationDrawable.getIntrinsicWidth() / 2);
                iM$2 = OKLCH.m$2(52.0f, dialogCell4.getMeasuredHeight(), 2);
                intrinsicWidth = (dialogCell4.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth3;
                intrinsicHeight = (dialogCell4.translationDrawable.getIntrinsicHeight() / 2) + iM$2;
                if (dialogCell4.currentRevealProgress > 0.0f) {
                    canvas3.save();
                    i5 = i4;
                    str4 = str;
                    f2 = measuredWidth;
                    canvas3.clipRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                    Theme.dialogs_pinnedPaint.setColor(i3);
                    canvas3.drawCircle(intrinsicWidth, intrinsicHeight, AndroidUtilities.accelerateInterpolator.getInterpolation(dialogCell4.currentRevealProgress) * ((float) Math.sqrt(((intrinsicHeight - dialogCell4.getMeasuredHeight()) * (intrinsicHeight - dialogCell4.getMeasuredHeight())) + (intrinsicWidth * intrinsicWidth))), Theme.dialogs_pinnedPaint);
                    canvas3.restore();
                    if (Theme.dialogs_archiveDrawableRecolored) {
                        Theme.dialogs_archiveDrawable.setLayerColor(Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground), str2);
                        z2 = true;
                        Theme.dialogs_archiveDrawableRecolored = true;
                    } else {
                        z2 = true;
                    }
                    if (!Theme.dialogs_hidePsaDrawableRecolored) {
                        RLottieDrawable rLottieDrawable6 = Theme.dialogs_hidePsaDrawable;
                        rLottieDrawable6.applyingLayerColors = z2;
                        int i31 = Theme.key_chats_archivePinBackground;
                        rLottieDrawable6.setLayerColor(Theme.getNonAnimatedColor(i31), str3);
                        Theme.dialogs_hidePsaDrawable.setLayerColor(Theme.getNonAnimatedColor(i31), "Line 2");
                        Theme.dialogs_hidePsaDrawable.setLayerColor(Theme.getNonAnimatedColor(i31), "Line 3");
                        Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                        Theme.dialogs_hidePsaDrawableRecolored = true;
                    }
                } else {
                    f2 = measuredWidth;
                    str4 = str;
                    i5 = i4;
                }
                canvas3.save();
                canvas3.translate(measuredWidth3, iM$2);
                f3 = dialogCell4.currentRevealBounceProgress;
                if (f3 != 0.0f) {
                    float interpolation2 = anonymousClass6.getInterpolation(f3) + 1.0f;
                    canvas3.scale(interpolation2, interpolation2, dialogCell4.translationDrawable.getIntrinsicWidth() / 2, dialogCell4.translationDrawable.getIntrinsicHeight() / 2);
                }
                BaseCell.setDrawableBounds(0, 0, dialogCell4.translationDrawable);
                dialogCell4.translationDrawable.draw(canvas3);
                canvas3.restore();
                canvas3.clipRect(f2, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                str5 = str4;
                iCeil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str5));
                i6 = i5;
                if (dialogCell4.swipeMessageTextId == i6) {
                    dialogCell4.swipeMessageTextId = i6;
                    dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                    TextPaint textPaint2 = Theme.dialogs_archiveTextPaint;
                    int iMin2 = Math.min(AndroidUtilities.dp(80.0f), iCeil);
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    staticLayout = new StaticLayout(str5, textPaint2, iMin2, alignment, 1.0f, 0.0f, false);
                    dialogCell4.swipeMessageTextLayout = staticLayout;
                    if (staticLayout.getLineCount() > 1) {
                        dialogCell4.swipeMessageTextLayout = new StaticLayout(str5, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), iCeil), alignment, 1.0f, 0.0f, false);
                    }
                } else {
                    dialogCell4.swipeMessageTextId = i6;
                    dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                    TextPaint textPaint3 = Theme.dialogs_archiveTextPaint;
                    int iMin3 = Math.min(AndroidUtilities.dp(80.0f), iCeil);
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    staticLayout = new StaticLayout(str5, textPaint3, iMin3, alignment, 1.0f, 0.0f, false);
                    dialogCell4.swipeMessageTextLayout = staticLayout;
                    if (staticLayout.getLineCount() > 1) {
                        dialogCell4.swipeMessageTextLayout = new StaticLayout(str5, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), iCeil), alignment, 1.0f, 0.0f, false);
                    }
                }
                if (dialogCell4.swipeMessageTextLayout != null) {
                    canvas3.save();
                    if (dialogCell4.swipeMessageTextLayout.getLineCount() > 1) {
                        f4 = -AndroidUtilities.dp(4.0f);
                    } else {
                        f4 = 0.0f;
                    }
                    canvas3.translate((dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.swipeMessageTextLayout.getWidth() / f), AndroidUtilities.dp(36.0f) + iM$2 + f4);
                    dialogCell4.swipeMessageTextLayout.draw(canvas3);
                    canvas3.restore();
                }
                canvas3.restore();
            }
            if (dialogCell4.translationX != 0.0f) {
                canvas3.save();
                canvas3.translate(dialogCell4.translationX, 0.0f);
                f5 = dialogCell4.translationX + 0.0f;
            } else {
                f5 = 0.0f;
            }
            float fDp3 = AndroidUtilities.dp(8.0f) * dialogCell4.cornerProgress;
            boolean z23 = dialogCell4.isSelected;
            RectF rectF5 = dialogCell4.rect;
            if (z23) {
                f6 = 0.0f;
                rectF5.set(0.0f, 0.0f, dialogCell4.getMeasuredWidth(), AndroidUtilities.lerp(dialogCell4.getMeasuredHeight(), dialogCell4.getCollapsedHeight(), dialogCell4.rightFragmentOpenedProgress));
                rectF5.offset(0.0f, (-dialogCell4.translateY) + dialogCell4.collapseOffset);
                canvas3.drawRoundRect(rectF5, fDp3, fDp3, Theme.dialogs_tabletSeletedPaint);
            } else {
                f6 = 0.0f;
            }
            canvas3.save();
            canvas3.translate(f6, (-dialogCell4.rightFragmentOffset) * dialogCell4.rightFragmentOpenedProgress);
            if (dialogCell4.currentDialogFolderId == 0 || (SharedConfig.archiveHidden && dialogCell4.archiveBackgroundProgress == f6)) {
                resourcesProvider2 = resourcesProvider;
                if (dialogCell4.getIsPinned() || dialogCell4.drawPinBackground) {
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, resourcesProvider2));
                    Paint paint2 = Theme.dialogs_pinnedPaint;
                    paint2.setAlpha((int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * paint2.getAlpha()));
                }
            } else {
                resourcesProvider2 = resourcesProvider;
                Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, resourcesProvider2), dialogCell4.archiveBackgroundProgress, 1.0f));
                Paint paint3 = Theme.dialogs_pinnedPaint;
                paint3.setAlpha((int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * paint3.getAlpha()));
            }
            canvas3.restore();
            DialogUpdateHelper dialogUpdateHelper = dialogCell4.updateHelper;
            dialogUpdateHelper.updateAnimationValues();
            if (dialogCell4.collapseOffset != 0.0f) {
                canvas3.save();
                canvas3.translate(0.0f, dialogCell4.collapseOffset);
                f7 = 0.0f + dialogCell4.collapseOffset;
            } else {
                f7 = 0.0f;
            }
            float f49 = dialogCell4.rightFragmentOpenedProgress;
            if (f49 != 1.0f) {
                if (f49 != 0.0f) {
                    float fClamp = Utilities.clamp(f49 / 0.4f, 1.0f, 0.0f);
                    if (SharedConfig.getDevicePerformanceClass() >= 2) {
                        i8 = -1;
                        iSaveLayerAlpha = canvas3.saveLayerAlpha(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, fClamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1)), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), (int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * 255.0f), 31);
                        f46 = 0.0f;
                    } else {
                        i8 = -1;
                        int iSave = canvas3.save();
                        f46 = 0.0f;
                        canvas3.clipRect(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, fClamp, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1)), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                        iSaveLayerAlpha = iSave;
                    }
                    canvas3.translate((-(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * dialogCell4.rightFragmentOpenedProgress, f46);
                    f5 += (-(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * dialogCell4.rightFragmentOpenedProgress;
                } else {
                    f7 = f7;
                    i8 = -1;
                    iSaveLayerAlpha = -1;
                }
                float f50 = f5;
                if (dialogCell4.translationX != 0.0f || dialogCell4.cornerProgress != 0.0f) {
                    canvas3.save();
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider2));
                    rectF5.set(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                    rectF5.offset(0.0f, -dialogCell4.translateY);
                    canvas3.drawRoundRect(rectF5, fDp3, fDp3, Theme.dialogs_pinnedPaint);
                    if (dialogCell4.isSelected) {
                        canvas3.drawRoundRect(rectF5, fDp3, fDp3, Theme.dialogs_tabletSeletedPaint);
                    }
                    if (dialogCell4.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || dialogCell4.archiveBackgroundProgress != 0.0f)) {
                        Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, resourcesProvider2), dialogCell4.archiveBackgroundProgress, 1.0f));
                        Paint paint4 = Theme.dialogs_pinnedPaint;
                        paint4.setAlpha((int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * paint4.getAlpha()));
                    } else if (dialogCell4.getIsPinned() || dialogCell4.drawPinBackground) {
                        Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, resourcesProvider2));
                        Paint paint5 = Theme.dialogs_pinnedPaint;
                        paint5.setAlpha((int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * paint5.getAlpha()));
                    }
                    canvas3.restore();
                }
                if (dialogCell4.translationX != 0.0f) {
                    float f51 = dialogCell4.cornerProgress;
                    if (f51 < 1.0f) {
                        float f52 = f51 + 0.10666667f;
                        dialogCell4.cornerProgress = f52;
                        if (f52 > 1.0f) {
                            dialogCell4.cornerProgress = 1.0f;
                        }
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    float f53 = dialogCell4.cornerProgress;
                    if (f53 > 0.0f) {
                        float f54 = f53 - 0.10666667f;
                        dialogCell4.cornerProgress = f54;
                        if (f54 < 0.0f) {
                            dialogCell4.cornerProgress = 0.0f;
                        }
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (dialogCell4.drawNameLock) {
                    BaseCell.setDrawableBounds(dialogCell4.nameLockLeft, dialogCell4.nameLockTop, Theme.dialogs_lockDrawable);
                    Theme.dialogs_lockDrawable.draw(canvas3);
                }
                boolean z24 = dialogCell4.useForceThreeLines;
                int iDp5 = AndroidUtilities.dp((z24 || SharedConfig.useThreeLinesLayout) ? 10.0f : 14.0f);
                if (((!z24 && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                    iDp5 -= AndroidUtilities.dp(dialogCell4.isForumCell() ? 8.0f : 9.0f);
                }
                if (dialogCell4.nameLayout != null) {
                    if (!dialogCell4.nameLayoutEllipsizeByGradient || dialogCell4.nameLayoutFits) {
                        i9 = iSaveLayerAlpha;
                        f26 = 24.0f;
                    } else {
                        if (dialogCell4.nameLayoutEllipsizeLeft && dialogCell4.fadePaint == null) {
                            Paint paint6 = new Paint();
                            dialogCell4.fadePaint = paint6;
                            paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{i8, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                            dialogCell4.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        } else if (dialogCell4.fadePaintBack == null) {
                            Paint paint7 = new Paint();
                            dialogCell4.fadePaintBack = paint7;
                            paint7.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, i8}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                            dialogCell4.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        }
                        f26 = 24.0f;
                        i9 = iSaveLayerAlpha;
                        canvas3.saveLayerAlpha(0.0f, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), 255, 31);
                        int i32 = dialogCell4.nameLeft;
                        canvas3.clipRect(i32, 0, dialogCell4.nameWidth + i32, dialogCell4.getMeasuredHeight());
                    }
                    if (dialogCell4.currentDialogFolderId != 0) {
                        TextPaint textPaint4 = Theme.dialogs_namePaint[dialogCell4.paintIndex];
                        int color4 = Theme.getColor(Theme.key_chats_nameArchived, resourcesProvider2);
                        textPaint4.linkColor = color4;
                        textPaint4.setColor(color4);
                    } else if (dialogCell4.encryptedChat != null || ((customDialog = dialogCell4.customDialog) != null && customDialog.type == 2)) {
                        TextPaint textPaint5 = Theme.dialogs_namePaint[dialogCell4.paintIndex];
                        int color5 = Theme.getColor(Theme.key_chats_secretName, resourcesProvider2);
                        textPaint5.linkColor = color5;
                        textPaint5.setColor(color5);
                    } else {
                        TextPaint textPaint6 = Theme.dialogs_namePaint[dialogCell4.paintIndex];
                        int color6 = Theme.getColor(Theme.key_chats_name, resourcesProvider2);
                        textPaint6.linkColor = color6;
                        textPaint6.setColor(color6);
                    }
                    canvas3.save();
                    canvas3.translate(dialogCell4.nameLeft + dialogCell4.nameLayoutTranslateX, iDp5);
                    SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.nameLayout);
                    StaticLayout staticLayout3 = dialogCell4.nameLayout;
                    z11 = z24;
                    anonymousClass3 = anonymousClass6;
                    anonymousClass5 = anonymousClass2;
                    resourcesProvider3 = resourcesProvider2;
                    i10 = -1;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout3, dialogCell4.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(0, staticLayout3.getPaint().getColor()));
                    canvas3.restore();
                    if (dialogCell4.nameLayoutEllipsizeByGradient && !dialogCell4.nameLayoutFits) {
                        canvas3.save();
                        if (dialogCell4.nameLayoutEllipsizeLeft) {
                            canvas3.translate(dialogCell4.nameLeft, 0.0f);
                            canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f26), dialogCell4.getMeasuredHeight(), dialogCell4.fadePaint);
                        } else {
                            canvas3.translate((dialogCell4.nameLeft + dialogCell4.nameWidth) - AndroidUtilities.dp(f26), 0.0f);
                            canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(f26), dialogCell4.getMeasuredHeight(), dialogCell4.fadePaintBack);
                        }
                        canvas3.restore();
                        canvas3.restore();
                    }
                } else {
                    i9 = iSaveLayerAlpha;
                    z11 = z24;
                    resourcesProvider3 = resourcesProvider2;
                    anonymousClass3 = anonymousClass6;
                    anonymousClass5 = anonymousClass2;
                    f26 = 24.0f;
                    i10 = -1;
                }
                if (dialogCell4.timeLayout != null && dialogCell4.currentDialogFolderId == 0) {
                    canvas3.save();
                    canvas3.translate(dialogCell4.timeLeft, dialogCell4.timeTop);
                    TextPaint timeTextPaint = dialogCell4.getTimeTextPaint();
                    if (dialogCell4.getIsPinned()) {
                        canvas3.translate(AndroidUtilities.dp(20.0f), 0.0f);
                        float height = (dialogCell4.timeLayout.getHeight() / f) - AndroidUtilities.dp(8.5f);
                        float f55 = -AndroidUtilities.dp(20.0f);
                        float fDp4 = AndroidUtilities.dp(6.0f) + dialogCell4.timeLayout.getWidth();
                        Drawable drawable3 = (!dialogCell4.drawCount || dialogCell4.isCounterMuted()) ? Theme.dialogs_pinnedDrawable2 : Theme.dialogs_pinnedDrawable2Accent;
                        int iDp6 = (int) (((AndroidUtilities.dp(17.0f) - drawable3.getIntrinsicHeight()) / f) + height);
                        int iDp7 = AndroidUtilities.dp(4.0f) + ((int) f55);
                        drawable3.setBounds(iDp7, iDp6, drawable3.getIntrinsicWidth() + iDp7, drawable3.getIntrinsicHeight() + iDp6);
                        int alpha2 = timeTextPaint.getAlpha();
                        timeTextPaint.setAlpha(27);
                        canvas3.drawRoundRect(f55, height, fDp4, AndroidUtilities.dp(17.0f) + height, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                        timeTextPaint.setAlpha(alpha2);
                        drawable3.draw(canvas3);
                    }
                    int color7 = dialogCell4.timeLayout.getPaint().getColor();
                    boolean z25 = color7 != timeTextPaint.getColor();
                    if (z25) {
                        dialogCell4.timeLayout.getPaint().setColor(timeTextPaint.getColor());
                    }
                    SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.timeLayout);
                    if (z25) {
                        dialogCell4.timeLayout.getPaint().setColor(color7);
                    }
                    canvas3.restore();
                }
                if (dialogCell4.drawLock2()) {
                    Theme.dialogs_lock2Drawable.setBounds(dialogCell4.lock2Left, ((dialogCell4.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / 2) + dialogCell4.timeTop, Theme.dialogs_lock2Drawable.getIntrinsicWidth() + dialogCell4.lock2Left, Theme.dialogs_lock2Drawable.getIntrinsicHeight() + ((dialogCell4.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / 2) + dialogCell4.timeTop);
                    Theme.dialogs_lock2Drawable.draw(canvas3);
                }
                if (dialogCell4.messageNameLayout != null && !dialogCell4.isForumCell()) {
                    if (dialogCell4.currentDialogFolderId != 0) {
                        TextPaint textPaint7 = Theme.dialogs_messageNamePaint;
                        int color8 = Theme.getColor(Theme.key_chats_nameMessageArchived_threeLines, resourcesProvider3);
                        textPaint7.linkColor = color8;
                        textPaint7.setColor(color8);
                    } else if (dialogCell4.draftMessage != null) {
                        TextPaint textPaint8 = Theme.dialogs_messageNamePaint;
                        int color9 = Theme.getColor(Theme.key_chats_draft, resourcesProvider3);
                        textPaint8.linkColor = color9;
                        textPaint8.setColor(color9);
                    } else {
                        TextPaint textPaint9 = Theme.dialogs_messageNamePaint;
                        int color10 = Theme.getColor(Theme.key_chats_nameMessage_threeLines, resourcesProvider3);
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
                        int color11 = Theme.getColor(Theme.key_chats_message, resourcesProvider3);
                        textPaint10.linkColor = color11;
                        textPaint10.setColor(color11);
                    } else if (dialogCell4.chat != null) {
                        TextPaint textPaint11 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                        int color12 = Theme.getColor(Theme.key_chats_nameMessageArchived, resourcesProvider3);
                        textPaint11.linkColor = color12;
                        textPaint11.setColor(color12);
                    } else {
                        TextPaint textPaint12 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                        int color13 = Theme.getColor(Theme.key_chats_messageArchived, resourcesProvider3);
                        textPaint12.linkColor = color13;
                        textPaint12.setColor(color13);
                    }
                    float fDp5 = AndroidUtilities.dp(14.0f);
                    float fDp6 = dialogUpdateHelper.typingOutToTop ? dialogCell4.messageTop - (dialogUpdateHelper.typingProgres * fDp5) : dialogCell4.messageTop + (dialogUpdateHelper.typingProgres * fDp5);
                    if (((!z11 && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                        fDp6 -= AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f);
                    }
                    if (dialogUpdateHelper.typingProgres != 1.0f) {
                        canvas3.save();
                        canvas3.translate(dialogCell4.messageLeft, fDp6);
                        int alpha3 = dialogCell4.messageLayout.getPaint().getAlpha();
                        dialogCell4.messageLayout.getPaint().setAlpha((int) ((1.0f - dialogUpdateHelper.typingProgres) * alpha3));
                        ArrayList arrayList2 = dialogCell4.spoilers;
                        if (arrayList2.isEmpty()) {
                            f43 = fDp5;
                            rectF = rectF5;
                            i26 = alpha3;
                            SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.messageLayout);
                            StaticLayout staticLayout5 = dialogCell4.messageLayout;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout5, dialogCell4.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(2, staticLayout5.getPaint().getColor()));
                        } else {
                            try {
                                canvas3.save();
                                SpoilerEffect.clipOutCanvas(canvas3, arrayList2);
                                SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.messageLayout);
                                try {
                                    StaticLayout staticLayout6 = dialogCell4.messageLayout;
                                    try {
                                        rectF = rectF5;
                                        i26 = alpha3;
                                        f43 = fDp5;
                                        try {
                                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout6, dialogCell4.animatedEmojiStack, -0.075f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(2, staticLayout6.getPaint().getColor()));
                                            canvas3.restore();
                                            for (int i33 = 0; i33 < arrayList2.size(); i33++) {
                                                SpoilerEffect spoilerEffect = (SpoilerEffect) arrayList2.get(i33);
                                                spoilerEffect.setColor(dialogCell4.messageLayout.getPaint().getColor());
                                                spoilerEffect.draw(canvas3);
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            FileLog.e(e);
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        f43 = fDp5;
                                        rectF = rectF5;
                                        i26 = alpha3;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    f43 = fDp5;
                                    rectF = rectF5;
                                    i26 = alpha3;
                                    FileLog.e(e);
                                    dialogCell4.messageLayout.getPaint().setAlpha(i26);
                                    canvas3.restore();
                                    canvas3.save();
                                    if (dialogUpdateHelper.typingOutToTop) {
                                        fM = DiffUtil.m(1.0f, dialogUpdateHelper.typingProgres, f43, dialogCell4.messageTop);
                                    } else {
                                        fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper.typingProgres, f43, dialogCell4.messageTop);
                                    }
                                    if (z11) {
                                        if (dialogCell4.isForumCell()) {
                                            f45 = 10.0f;
                                        } else {
                                            f45 = 11.0f;
                                        }
                                        fM -= AndroidUtilities.dp(f45);
                                    } else {
                                        if (dialogCell4.isForumCell()) {
                                            f45 = 10.0f;
                                        } else {
                                            f45 = 11.0f;
                                        }
                                        fM -= AndroidUtilities.dp(f45);
                                    }
                                    canvas3.translate(dialogCell4.typingLeft, fM);
                                    staticLayout2 = dialogCell4.typingLayout;
                                    if (staticLayout2 != null) {
                                        int alpha4 = staticLayout2.getPaint().getAlpha();
                                        dialogCell4.typingLayout.getPaint().setAlpha((int) (alpha4 * dialogUpdateHelper.typingProgres));
                                        dialogCell4.typingLayout.draw(canvas3);
                                        dialogCell4.typingLayout.getPaint().setAlpha(alpha4);
                                    }
                                    canvas3.restore();
                                    if (dialogCell4.typingLayout != null) {
                                        if (i25 < 0) {
                                            i25 = dialogUpdateHelper.lastKnownTypingType;
                                        }
                                        chatStatusDrawable = Theme.getChatStatusDrawable(i25);
                                        if (chatStatusDrawable != null) {
                                            canvas3.save();
                                            int color14 = Theme.getColor(Theme.key_chats_actionMessage);
                                            chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(color14, (int) (Color.alpha(color14) * dialogUpdateHelper.typingProgres)));
                                            if (dialogUpdateHelper.typingOutToTop) {
                                                fM2 = DiffUtil.m(1.0f, dialogUpdateHelper.typingProgres, f43, dialogCell4.messageTop);
                                            } else {
                                                fM2 = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper.typingProgres, f43, dialogCell4.messageTop);
                                            }
                                            if (z11) {
                                                if (dialogCell4.isForumCell()) {
                                                    f44 = 10.0f;
                                                } else {
                                                    f44 = 11.0f;
                                                }
                                                fM2 -= AndroidUtilities.dp(f44);
                                            } else {
                                                if (dialogCell4.isForumCell()) {
                                                    f44 = 10.0f;
                                                } else {
                                                    f44 = 11.0f;
                                                }
                                                fM2 -= AndroidUtilities.dp(f44);
                                            }
                                            if (i25 != 1) {
                                                float f56 = dialogCell4.statusDrawableLeft;
                                                if (i25 == 1) {
                                                    iDp4 = AndroidUtilities.dp(1.0f);
                                                } else {
                                                    iDp4 = 0;
                                                }
                                                canvas3.translate(f56, fM2 + iDp4);
                                            } else {
                                                float f57 = dialogCell4.statusDrawableLeft;
                                                if (i25 == 1) {
                                                    iDp4 = AndroidUtilities.dp(1.0f);
                                                } else {
                                                    iDp4 = 0;
                                                }
                                                canvas3.translate(f57, fM2 + iDp4);
                                            }
                                            chatStatusDrawable.draw(canvas3);
                                            dialogCell4.invalidate();
                                            canvas3.restore();
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
                                            final int i34 = 0;
                                            canvasButton.setDelegate(new Runnable(dialogCell4) {
                                                public final DialogCell f$0;

                                                {
                                                    this.f$0 = dialogCell4;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i34) {
                                                        case 0:
                                                            DialogCell dialogCell5 = this.f$0;
                                                            DialogCell.DialogCellDelegate dialogCellDelegate = dialogCell5.delegate;
                                                            if (dialogCellDelegate != null) {
                                                                dialogCellDelegate.onButtonClicked(dialogCell5);
                                                            }
                                                            break;
                                                        default:
                                                            DialogCell dialogCell6 = this.f$0;
                                                            DialogCell.DialogCellDelegate dialogCellDelegate2 = dialogCell6.delegate;
                                                            if (dialogCellDelegate2 != null) {
                                                                dialogCellDelegate2.onButtonLongPress(dialogCell6);
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            final int i35 = 1;
                                            dialogCell4.canvasButton.setLongPress(new Runnable(dialogCell4) {
                                                public final DialogCell f$0;

                                                {
                                                    this.f$0 = dialogCell4;
                                                }

                                                @Override
                                                public final void run() {
                                                    switch (i35) {
                                                        case 0:
                                                            DialogCell dialogCell5 = this.f$0;
                                                            DialogCell.DialogCellDelegate dialogCellDelegate = dialogCell5.delegate;
                                                            if (dialogCellDelegate != null) {
                                                                dialogCellDelegate.onButtonClicked(dialogCell5);
                                                            }
                                                            break;
                                                        default:
                                                            DialogCell dialogCell6 = this.f$0;
                                                            DialogCell.DialogCellDelegate dialogCellDelegate2 = dialogCell6.delegate;
                                                            if (dialogCellDelegate2 != null) {
                                                                dialogCellDelegate2.onButtonLongPress(dialogCell6);
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        if (dialogCell4.lastTopicMessageUnread) {
                                            CanvasButton canvasButton2 = dialogCell4.canvasButton;
                                            int color15 = dialogCell4.currentMessagePaint.getColor();
                                            if (Theme.isCurrentThemeDark()) {
                                                i23 = 36;
                                            } else {
                                                i23 = 26;
                                            }
                                            canvasButton2.setColor(ColorUtils.setAlphaComponent(color15, i23));
                                            dialogCell4.canvasButton.rewind();
                                            i24 = dialogCell4.topMessageTopicEndIndex;
                                            if (i24 != 0) {
                                                float fDp7 = dialogCell4.messageTop;
                                                fDp7 = z11 ? fDp7 - AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f) : fDp7 - AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f);
                                                rectF4 = AndroidUtilities.rectTmp;
                                                float primaryHorizontal = dialogCell4.messageLayout.getPrimaryHorizontal(0) + AndroidUtilities.dp(f) + dialogCell4.messageLeft;
                                                float f58 = dialogCell4.messageLeft;
                                                StaticLayout staticLayout7 = dialogCell4.messageLayout;
                                                rectF4.set(primaryHorizontal, fDp7, (staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), dialogCell4.topMessageTopicEndIndex)) + f58) - AndroidUtilities.dp(3.0f), dialogCell4.buttonTop - AndroidUtilities.dp(4.0f));
                                                rectF4.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                                                if (rectF4.right > rectF4.left) {
                                                    dialogCell4.canvasButton.addRect(rectF4);
                                                }
                                            }
                                            float lineLeft = dialogCell4.buttonLayout.getLineLeft(0);
                                            RectF rectF6 = AndroidUtilities.rectTmp;
                                            rectF6.set(dialogCell4.buttonLeft + lineLeft + AndroidUtilities.dp(f), AndroidUtilities.dp(f) + dialogCell4.buttonTop, dialogCell4.buttonLayout.getLineWidth(0) + dialogCell4.buttonLeft + lineLeft + AndroidUtilities.dp(12.0f), dialogCell4.buttonLayout.getHeight() + dialogCell4.buttonTop);
                                            rectF6.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                                            dialogCell4.canvasButton.addRect(rectF6);
                                            CanvasButton canvasButton3 = dialogCell4.canvasButton;
                                            canvasButton3.drawInternal(canvas3, canvasButton3.paint);
                                            rippleDrawableSafe = canvasButton3.selectorDrawable;
                                            if (rippleDrawableSafe != null) {
                                                rippleDrawableSafe.draw(canvas3);
                                            }
                                            Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                                            BaseCell.setDrawableBounds(Theme.dialogs_forum_arrowDrawable, rectF6.right - AndroidUtilities.dp(18.0f), ImageReceiver$$ExternalSyntheticOutline0.m(rectF6.height(), Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight(), 2.0f, rectF6.top));
                                            Theme.dialogs_forum_arrowDrawable.draw(canvas3);
                                        }
                                        canvas3.translate(dialogCell4.buttonLeft, dialogCell4.buttonTop);
                                        arrayList = dialogCell4.spoilers2;
                                        if (arrayList.isEmpty()) {
                                            SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.buttonLayout);
                                            StaticLayout staticLayout8 = dialogCell4.buttonLayout;
                                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout8, dialogCell4.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(3, staticLayout8.getPaint().getColor()));
                                        } else {
                                            try {
                                                canvas3.save();
                                                SpoilerEffect.clipOutCanvas(canvas3, arrayList);
                                                SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.buttonLayout);
                                                StaticLayout staticLayout9 = dialogCell4.buttonLayout;
                                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout9, dialogCell4.animatedEmojiStack3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(3, staticLayout9.getPaint().getColor()));
                                                canvas3.restore();
                                                for (i21 = 0; i21 < arrayList.size(); i21++) {
                                                    SpoilerEffect spoilerEffect2 = (SpoilerEffect) arrayList.get(i21);
                                                    spoilerEffect2.setColor(dialogCell4.buttonLayout.getPaint().getColor());
                                                    spoilerEffect2.draw(canvas3);
                                                }
                                            } catch (Exception e5) {
                                                FileLog.e(e5);
                                            }
                                        }
                                        canvas.restore();
                                    }
                                    if (dialogCell4.currentDialogFolderId == 0) {
                                        boolean z26 = dialogCell4.drawClock;
                                        if (dialogCell4.drawCheck1) {
                                            i14 = 2;
                                        } else {
                                            i14 = 0;
                                        }
                                        int i36 = (z26 ? 1 : 0) + i14;
                                        if (dialogCell4.drawCheck2) {
                                            i15 = 4;
                                        } else {
                                            i15 = 0;
                                        }
                                        i16 = i36 + i15;
                                        i17 = dialogCell4.lastStatusDrawableParams;
                                        if (i17 >= 0) {
                                            dialogCell4.createStatusDrawableAnimator(i17, i16);
                                        }
                                        z14 = dialogCell4.statusDrawableAnimationInProgress;
                                        if (z14) {
                                            i16 = dialogCell4.animateToStatusDrawableParams;
                                        }
                                        if ((i16 & 1) != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if ((i16 & 2) != 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if ((i16 & 4) != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if (z14) {
                                            i20 = dialogCell4.animateFromStatusDrawableParams;
                                            if ((i20 & 1) != 0) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if ((i20 & 2) != 0) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            if ((i20 & 4) != 0) {
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            if (z15) {
                                            }
                                            boolean z27 = z18;
                                            canvas3 = canvas;
                                            dialogCell4.drawCheckStatus(canvas3, z27, z19, z20, false, 1.0f - dialogCell4.statusDrawableProgress);
                                            dialogCell4.drawCheckStatus(canvas3, z15, z16, z17, false, dialogCell4.statusDrawableProgress);
                                            dialogCell3 = this;
                                            boolean z28 = dialogCell3.drawClock;
                                            if (dialogCell3.drawCheck1) {
                                                i18 = 2;
                                            } else {
                                                i18 = 0;
                                            }
                                            int i37 = (z28 ? 1 : 0) + i18;
                                            if (dialogCell3.drawCheck2) {
                                                i19 = 4;
                                            } else {
                                                i19 = 0;
                                            }
                                            dialogCell3.lastStatusDrawableParams = i37 + i19;
                                        } else {
                                            dialogCell4 = this;
                                            canvas3 = canvas;
                                            dialogCell4.drawCheckStatus(canvas3, z15, z16, z17, false, 1.0f);
                                        }
                                        dialogCell3 = dialogCell4;
                                        boolean z29 = dialogCell3.drawClock;
                                        if (dialogCell3.drawCheck1) {
                                            i18 = 2;
                                        } else {
                                            i18 = 0;
                                        }
                                        int i38 = (z29 ? 1 : 0) + i18;
                                        if (dialogCell3.drawCheck2) {
                                            i19 = 4;
                                        } else {
                                            i19 = 0;
                                        }
                                        dialogCell3.lastStatusDrawableParams = i38 + i19;
                                    } else {
                                        canvas3 = canvas;
                                        dialogCell3 = dialogCell4;
                                    }
                                    f27 = 12.5f;
                                    if (dialogCell3.drawBotVerified) {
                                        if (z11) {
                                            f42 = 12.5f;
                                        } else {
                                            f42 = 12.5f;
                                        }
                                        iDp3 = AndroidUtilities.dp(f42);
                                        iDp3 = z11 ? iDp3 - AndroidUtilities.dp(9.0f) : iDp3 - AndroidUtilities.dp(9.0f);
                                        swapAnimatedEmojiDrawable2 = dialogCell3.botVerification;
                                        if (swapAnimatedEmojiDrawable2 != null) {
                                            swapAnimatedEmojiDrawable2.setBounds(dialogCell3.nameLeft - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + iDp3, dialogCell3.nameLeft - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f) + iDp3);
                                            zzli.m(Theme.key_chats_verifiedBackground, resourcesProvider3, swapAnimatedEmojiDrawable2);
                                            swapAnimatedEmojiDrawable2.draw(canvas3);
                                        }
                                    }
                                    if (dialogCell3.drawUnmute) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                    }
                                    if (dialogCell3.dialogsType != 2) {
                                        if (z12) {
                                            f40 = dialogCell3.dialogMutedProgress;
                                            if (f40 != 1.0f) {
                                                f41 = f40 + 0.10666667f;
                                                dialogCell3.dialogMutedProgress = f41;
                                                if (f41 > 1.0f) {
                                                    dialogCell3.dialogMutedProgress = 1.0f;
                                                } else {
                                                    dialogCell3.invalidate();
                                                }
                                            } else if (!z12) {
                                                f35 = dialogCell3.dialogMutedProgress;
                                                if (f35 != 0.0f) {
                                                    f36 = f35 - 0.10666667f;
                                                    dialogCell3.dialogMutedProgress = f36;
                                                    if (f36 < 0.0f) {
                                                        dialogCell3.dialogMutedProgress = 0.0f;
                                                    } else {
                                                        dialogCell3.invalidate();
                                                    }
                                                }
                                            }
                                        } else if (!z12) {
                                            f35 = dialogCell3.dialogMutedProgress;
                                            if (f35 != 0.0f) {
                                                f36 = f35 - 0.10666667f;
                                                dialogCell3.dialogMutedProgress = f36;
                                                if (f36 < 0.0f) {
                                                    dialogCell3.dialogMutedProgress = 0.0f;
                                                } else {
                                                    dialogCell3.invalidate();
                                                }
                                            }
                                        }
                                        if (dialogCell3.drawPremium) {
                                            i13 = dialogCell3.nameMutedIconLeft;
                                        } else {
                                            i13 = dialogCell3.nameMuteLeft;
                                        }
                                        if (z11) {
                                            f37 = 0.0f;
                                        } else {
                                            f37 = 0.0f;
                                        }
                                        float fDp8 = i13 - AndroidUtilities.dp(f37);
                                        if (SharedConfig.useThreeLinesLayout) {
                                            f38 = 13.5f;
                                        } else {
                                            f38 = 17.5f;
                                        }
                                        fDp2 = AndroidUtilities.dp(f38);
                                        if (z11) {
                                            if (dialogCell3.isForumCell()) {
                                                f39 = 8.0f;
                                            } else {
                                                f39 = 9.0f;
                                            }
                                            fDp2 -= AndroidUtilities.dp(f39);
                                        } else {
                                            if (dialogCell3.isForumCell()) {
                                                f39 = 8.0f;
                                            } else {
                                                f39 = 9.0f;
                                            }
                                            fDp2 -= AndroidUtilities.dp(f39);
                                        }
                                        BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, fDp8, fDp2);
                                        BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, fDp8, fDp2);
                                        DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                                        if (dialogCell3.dialogMutedProgress != 1.0f) {
                                            canvas3.save();
                                            float f59 = dialogCell3.dialogMutedProgress;
                                            canvas3.scale(f59, f59, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
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
                                        if (z11) {
                                            f34 = 13.5f;
                                        } else {
                                            f34 = 13.5f;
                                        }
                                        float fDp9 = AndroidUtilities.dp(f34);
                                        fDp9 = z11 ? fDp9 - AndroidUtilities.dp(9.0f) : fDp9 - AndroidUtilities.dp(9.0f);
                                        BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp9);
                                        BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp9);
                                        Theme.dialogs_verifiedDrawable.draw(canvas3);
                                        Theme.dialogs_verifiedCheckDrawable.draw(canvas3);
                                        anonymousClass4 = anonymousClass5;
                                    } else {
                                        if (dialogCell3.drawPremium) {
                                            if (z11) {
                                                f29 = 12.5f;
                                            } else {
                                                f29 = 12.5f;
                                            }
                                            iDp2 = AndroidUtilities.dp(f29);
                                            iDp2 = z11 ? iDp2 - AndroidUtilities.dp(9.0f) : iDp2 - AndroidUtilities.dp(9.0f);
                                            swapAnimatedEmojiDrawable = dialogCell3.emojiStatus;
                                            if (swapAnimatedEmojiDrawable != null) {
                                                anonymousClass4 = anonymousClass5;
                                                anonymousClass4.setTranslationX((f50 + dialogCell3.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                                                anonymousClass4.setTranslationY((f7 + iDp2) - AndroidUtilities.dp(4.0f));
                                                if (dialogCell3.rightFragmentOpenedProgress > 0.0f) {
                                                    swapAnimatedEmojiDrawable.setBounds(dialogCell3.nameMuteLeft - AndroidUtilities.dp(2.0f), iDp2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(20.0f) + dialogCell3.nameMuteLeft, AndroidUtilities.dp(22.0f) + (iDp2 - AndroidUtilities.dp(4.0f)));
                                                    swapAnimatedEmojiDrawable.draw(canvas3);
                                                    z13 = false;
                                                } else {
                                                    z13 = true;
                                                }
                                                zzli.m(Theme.key_chats_verifiedBackground, resourcesProvider3, swapAnimatedEmojiDrawable);
                                                z3 = z13;
                                            } else {
                                                anonymousClass4 = anonymousClass5;
                                                Drawable drawable4 = PremiumGradient.getInstance().premiumStarDrawableMini;
                                                int iDp8 = dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f);
                                                if (!z11) {
                                                    f27 = 15.5f;
                                                }
                                                BaseCell.setDrawableBounds(iDp8, AndroidUtilities.dp(f27), drawable4);
                                                drawable4.draw(canvas3);
                                            }
                                            if (dialogCell3.drawReorder) {
                                                if (!LocaleController.isRTL) {
                                                    Paint paintReorderGradient = dialogCell3.getPaintReorderGradient();
                                                    paintReorderGradient.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                    canvas3.save();
                                                    canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(f26), dialogCell3.pinTop);
                                                    canvas.drawRect(0.0f, 0.0f, RichMessageLayout$$ExternalSyntheticOutline1.m(dialogCell3.pinLeft, 24.0f, dialogCell3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient);
                                                    canvas3 = canvas;
                                                    canvas3.restore();
                                                }
                                                Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                BaseCell.setDrawableBounds(dialogCell3.pinLeft, dialogCell3.pinTop, Theme.dialogs_reorderDrawable);
                                                Theme.dialogs_reorderDrawable.draw(canvas3);
                                            } else {
                                                if (!LocaleController.isRTL) {
                                                    Paint paintReorderGradient2 = dialogCell3.getPaintReorderGradient();
                                                    paintReorderGradient2.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                    canvas3.save();
                                                    canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(f26), dialogCell3.pinTop);
                                                    canvas.drawRect(0.0f, 0.0f, RichMessageLayout$$ExternalSyntheticOutline1.m(dialogCell3.pinLeft, 24.0f, dialogCell3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient2);
                                                    canvas3 = canvas;
                                                    canvas3.restore();
                                                }
                                                Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                                BaseCell.setDrawableBounds(dialogCell3.pinLeft, dialogCell3.pinTop, Theme.dialogs_reorderDrawable);
                                                Theme.dialogs_reorderDrawable.draw(canvas3);
                                            }
                                            f30 = dialogCell3.animatorPollVotesMentionVisible.floatValue;
                                            if (dialogCell3.drawError) {
                                                rectF2 = rectF;
                                                if (dialogCell3.drawCount) {
                                                }
                                                zIsCounterMuted = dialogCell3.isCounterMuted();
                                                canvas3 = canvas;
                                                drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                                                dialogCell = this;
                                                if (dialogCell.drawMention) {
                                                    Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    if (dialogCell.mentionLayout != null) {
                                                        int i39 = dialogCell.mentionLeft;
                                                        rectF2.set(i39, dialogCell.countTop, AndroidUtilities.dp(12.666f) + i39 + dialogCell.mentionWidth, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                        if (zIsCounterMuted) {
                                                            paint = Theme.dialogs_countPaint;
                                                        } else {
                                                            paint = Theme.dialogs_countPaint;
                                                        }
                                                        canvas3.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
                                                        Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                        canvas3.save();
                                                        canvas3.translate(AndroidUtilities.dp(6.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(4.0f) + dialogCell.countTop);
                                                        dialogCell.mentionLayout.draw(canvas3);
                                                        canvas3.restore();
                                                    } else {
                                                        Drawable drawable5 = Theme.dialogs_mentionDrawable;
                                                        drawable5.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                        DrawableUtils.setBounds(drawable5, AndroidUtilities.dp(10.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                                        drawable5.draw(canvas3);
                                                    }
                                                }
                                                if (dialogCell.drawReactionMention) {
                                                    int i40 = dialogCell.reactionMentionLeft;
                                                    rectF2.set(i40, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i40, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                    f31 = dialogCell.reactionsMentionsChangeProgress;
                                                    if (f31 == 1.0f) {
                                                        f31 = 1.0f;
                                                    } else if (!dialogCell.drawReactionMention) {
                                                        f31 = 1.0f - f31;
                                                    }
                                                    if (zIsCounterMuted) {
                                                        drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                    } else {
                                                        drawable = Theme.dialogs_reactionsMentionDrawable;
                                                    }
                                                    drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i40, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                                    DrawableUtils.drawWithScale(canvas3, drawable, f31);
                                                } else {
                                                    int i41 = dialogCell.reactionMentionLeft;
                                                    rectF2.set(i41, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i41, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                    f31 = dialogCell.reactionsMentionsChangeProgress;
                                                    if (f31 == 1.0f) {
                                                        f31 = 1.0f;
                                                    } else if (!dialogCell.drawReactionMention) {
                                                        f31 = 1.0f - f31;
                                                    }
                                                    if (zIsCounterMuted) {
                                                        drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                                    } else {
                                                        drawable = Theme.dialogs_reactionsMentionDrawable;
                                                    }
                                                    drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i41, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                                    DrawableUtils.drawWithScale(canvas3, drawable, f31);
                                                }
                                                if (dialogCell.drawPollVotesMention) {
                                                    int i42 = dialogCell.pollVotesMentionLeft;
                                                    rectF2.set(i42, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i42, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                    if (zIsCounterMuted) {
                                                        drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                    } else {
                                                        drawable2 = Theme.dialogs_pollMentionDrawable;
                                                    }
                                                    drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i42, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                                    DrawableUtils.drawWithScale(canvas3, drawable2, f30);
                                                } else {
                                                    int i43 = dialogCell.pollVotesMentionLeft;
                                                    rectF2.set(i43, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i43, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                    if (zIsCounterMuted) {
                                                        drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                                    } else {
                                                        drawable2 = Theme.dialogs_pollMentionDrawable;
                                                    }
                                                    drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                    DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i43, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                                    DrawableUtils.drawWithScale(canvas3, drawable2, f30);
                                                }
                                                if (dialogCell.thumbsCount > 0) {
                                                    f32 = dialogUpdateHelper.typingProgres;
                                                    if (f32 != 1.0f) {
                                                        if (f32 > 0.0f) {
                                                            canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f32) * 255.0f), 31);
                                                            canvas3 = canvas;
                                                            if (dialogUpdateHelper.typingOutToTop) {
                                                                fDp = -AndroidUtilities.dp(14.0f);
                                                                f33 = dialogUpdateHelper.typingProgres;
                                                            } else {
                                                                fDp = AndroidUtilities.dp(14.0f);
                                                                f33 = dialogUpdateHelper.typingProgres;
                                                            }
                                                            canvas3.translate(0.0f, fDp * f33);
                                                        }
                                                        i12 = 0;
                                                        while (i12 < dialogCell.thumbsCount) {
                                                            if (dialogCell.thumbImageSeen[i12]) {
                                                                if (dialogCell.thumbBackgroundPaint == null) {
                                                                    Paint paint8 = new Paint(1);
                                                                    dialogCell.thumbBackgroundPaint = paint8;
                                                                    paint8.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                    dialogCell.thumbBackgroundPaint.setColor(0);
                                                                }
                                                                rectF3 = AndroidUtilities.rectTmp;
                                                                imageReceiverArr = dialogCell.thumbImage;
                                                                rectF3.set(imageReceiverArr[i12].getImageX(), imageReceiverArr[i12].getImageY(), imageReceiverArr[i12].getImageX2(), imageReceiverArr[i12].getImageY2());
                                                                imageReceiverArr[i12].draw(canvas3);
                                                                if (dialogCell.drawSpoiler[i12]) {
                                                                    path = dialogCell.thumbPath;
                                                                    if (path == null) {
                                                                        dialogCell.thumbPath = new Path();
                                                                    } else {
                                                                        path.rewind();
                                                                    }
                                                                    dialogCell.thumbPath.addRoundRect(rectF3, imageReceiverArr[i12].getRoundRadius()[0], imageReceiverArr[i12].getRoundRadius()[1], Path.Direction.CW);
                                                                    canvas3.save();
                                                                    canvas3.clipPath(dialogCell.thumbPath);
                                                                    if (dialogCell.thumbSpoiler == null) {
                                                                        dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                    }
                                                                    dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i10) * 0.325f)));
                                                                    dialogCell.thumbSpoiler.setBounds((int) imageReceiverArr[i12].getImageX(), (int) imageReceiverArr[i12].getImageY(), (int) imageReceiverArr[i12].getImageX2(), (int) imageReceiverArr[i12].getImageY2());
                                                                    dialogCell.thumbSpoiler.draw(canvas3);
                                                                    dialogCell.invalidate();
                                                                    canvas3.restore();
                                                                }
                                                                if (dialogCell.drawPlay[i12]) {
                                                                    BaseCell.setDrawableBounds((int) (imageReceiverArr[i12].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i12].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)), Theme.dialogs_playDrawable);
                                                                    Theme.dialogs_playDrawable.draw(canvas3);
                                                                }
                                                            }
                                                            i12++;
                                                            i10 = -1;
                                                        }
                                                        if (dialogUpdateHelper.typingProgres > 0.0f) {
                                                            canvas3.restore();
                                                        }
                                                    }
                                                }
                                                dialogCellTags = dialogCell.tags;
                                                if (dialogCellTags != null) {
                                                    canvas3.save();
                                                    canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                    dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                    canvas3.restore();
                                                }
                                                i11 = i9;
                                                if (i11 != -1) {
                                                    canvas3.restoreToCount(i11);
                                                }
                                                z5 = dialogCell.animatingArchiveAvatar;
                                                imageReceiver = dialogCell.avatarImage;
                                                if (z5) {
                                                    canvas3.save();
                                                    float interpolation3 = anonymousClass3.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                    canvas3.scale(interpolation3, interpolation3, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                                }
                                                z6 = dialogCell.drawAvatar;
                                                anonymousClass1 = dialogCell.storyParams;
                                                if (z6) {
                                                    if (dialogCell.drawMonoforumAvatar) {
                                                        if (dialogCell.bubbleClip == null) {
                                                            dialogCell.bubbleClip = new PhotoBubbleClip();
                                                        }
                                                        dialogCell.bubbleClip.setBounds((int) anonymousClass1.originalAvatarRect.centerX(), (int) anonymousClass1.originalAvatarRect.centerY(), (int) (anonymousClass1.originalAvatarRect.width() / 2.0f));
                                                        canvas3.save();
                                                        canvas3.clipPath(dialogCell.bubbleClip);
                                                        imageReceiver.setImageCoords(anonymousClass1.originalAvatarRect);
                                                        imageReceiver.draw(canvas3);
                                                        canvas3.restore();
                                                    } else if (dialogCell.drawCommunityAvatar) {
                                                        DrawableUtils.setBounds(imageReceiver, AndroidUtilities.dpf2(1.0f) + anonymousClass1.originalAvatarRect.centerX(), anonymousClass1.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                                                        DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, imageReceiver.getCenterX(), imageReceiver.getCenterY(), AndroidUtilities.dp(48.0f));
                                                        imageReceiver.draw(canvas3);
                                                    } else {
                                                        z9 = dialogCell.isShareToStoryCell;
                                                        if (z9) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = true;
                                                        }
                                                        anonymousClass1.drawHiddenStoriesAsSegments = z10;
                                                        int i44 = anonymousClass1.forceState;
                                                        if (z9) {
                                                            anonymousClass1.forceState = 1;
                                                        }
                                                        StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, imageReceiver, anonymousClass1);
                                                        if (anonymousClass1.drawnLive) {
                                                            dialogCell.checkTtl();
                                                        }
                                                        anonymousClass1.forceState = i44;
                                                    }
                                                    if (!dialogCell.insideCommunityList) {
                                                        float fCenterX = anonymousClass1.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                        float fCenterY = anonymousClass1.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                        if (dialogCell.communityArrowDrawable == null) {
                                                            dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                        }
                                                        DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX, fCenterY, 17);
                                                        canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3)));
                                                        dialogCell.communityArrowDrawable.draw(canvas3);
                                                    }
                                                }
                                                if (dialogCell.animatingArchiveAvatar) {
                                                    canvas3.restore();
                                                }
                                                if (imageReceiver.getVisible()) {
                                                    z4 = true;
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
                                                if (z) {
                                                    canvas3.save();
                                                    canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                                                    canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.pullProgress) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                                    dialogCell2.archivedChatsDrawable.draw(canvas3, false);
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
                                                        f25 = dialogCell2.rightFragmentOpenedProgress;
                                                        if (f25 != 0.0f) {
                                                            Theme.dividerPaint.setAlpha((int) ((1.0f - f25) * alpha));
                                                        }
                                                        measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                        if (LocaleController.isRTL) {
                                                            canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                                                        } else {
                                                            canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                                                        }
                                                        f8 = 0.0f;
                                                        if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                            Theme.dividerPaint.setAlpha(alpha);
                                                        }
                                                    } else {
                                                        f8 = 0.0f;
                                                    }
                                                } else {
                                                    f8 = 0.0f;
                                                }
                                                if (dialogCell2.clipProgress == f8) {
                                                    canvas2 = canvas;
                                                } else if (Build.VERSION.SDK_INT != 24) {
                                                    canvas.restore();
                                                    canvas2 = canvas;
                                                } else {
                                                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3));
                                                    canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                                                    canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                                                    canvas2 = canvas;
                                                }
                                                if (z22) {
                                                    float f60 = 1.0f - f47;
                                                    int measuredHeight2 = (int) (dialogCell2.getMeasuredHeight() * f60);
                                                    color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                                                    if (dialogCell2.archiveFadeGradientDrawable == null) {
                                                        dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                                    }
                                                    if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                                                        dialogCell2.archiveFadeGradientDrawableColor = color3;
                                                        dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                                                    }
                                                    float fClamp2 = MathUtils.clamp((f60 - 0.05f) * 10.0f, 0.0f, 1.0f);
                                                    dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight2, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight2);
                                                    dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp2 * 255.0f));
                                                    dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                    canvas2.restore();
                                                }
                                                z7 = dialogCell2.drawReorder;
                                                if (z7) {
                                                    if (z7) {
                                                        f12 = dialogCell2.reorderIconProgress;
                                                        if (f12 < 1.0f) {
                                                            f13 = f12 + 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f13;
                                                            if (f13 > 1.0f) {
                                                                dialogCell2.reorderIconProgress = 1.0f;
                                                            }
                                                            f10 = 0.0f;
                                                        }
                                                        f10 = 0.0f;
                                                        z8 = z4;
                                                    } else {
                                                        f9 = dialogCell2.reorderIconProgress;
                                                        f10 = 0.0f;
                                                        if (f9 > 0.0f) {
                                                            f11 = f9 - 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f11;
                                                            if (f11 < 0.0f) {
                                                                dialogCell2.reorderIconProgress = 0.0f;
                                                            }
                                                        } else {
                                                            z8 = z4;
                                                        }
                                                    }
                                                    z8 = true;
                                                } else {
                                                    if (z7) {
                                                        f12 = dialogCell2.reorderIconProgress;
                                                        if (f12 < 1.0f) {
                                                            f13 = f12 + 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f13;
                                                            if (f13 > 1.0f) {
                                                                dialogCell2.reorderIconProgress = 1.0f;
                                                            }
                                                            f10 = 0.0f;
                                                        }
                                                        f10 = 0.0f;
                                                        z8 = z4;
                                                    } else {
                                                        f9 = dialogCell2.reorderIconProgress;
                                                        f10 = 0.0f;
                                                        if (f9 > 0.0f) {
                                                            f11 = f9 - 0.09411765f;
                                                            dialogCell2.reorderIconProgress = f11;
                                                            if (f11 < 0.0f) {
                                                                dialogCell2.reorderIconProgress = 0.0f;
                                                            }
                                                        } else {
                                                            z8 = z4;
                                                        }
                                                    }
                                                    z8 = true;
                                                }
                                                if (dialogCell2.archiveHidden) {
                                                    f23 = dialogCell2.archiveBackgroundProgress;
                                                    if (f23 > f10) {
                                                        f24 = f23 - 0.069565214f;
                                                        dialogCell2.archiveBackgroundProgress = f24;
                                                        if (f24 < f10) {
                                                            dialogCell2.archiveBackgroundProgress = f10;
                                                        }
                                                        avatarDrawable2 = dialogCell2.avatarDrawable;
                                                        if (avatarDrawable2.avatarType == 2) {
                                                            avatarDrawable2.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                                                        }
                                                        z8 = true;
                                                    }
                                                } else {
                                                    f14 = dialogCell2.archiveBackgroundProgress;
                                                    if (f14 < 1.0f) {
                                                        f15 = f14 + 0.069565214f;
                                                        dialogCell2.archiveBackgroundProgress = f15;
                                                        if (f15 > 1.0f) {
                                                            dialogCell2.archiveBackgroundProgress = 1.0f;
                                                        }
                                                        avatarDrawable = dialogCell2.avatarDrawable;
                                                        if (avatarDrawable.avatarType == 2) {
                                                            avatarDrawable.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                                                        }
                                                        z8 = true;
                                                    }
                                                }
                                                if (dialogCell2.animatingArchiveAvatar) {
                                                    f22 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                    dialogCell2.animatingArchiveAvatarProgress = f22;
                                                    if (f22 >= 170.0f) {
                                                        dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                                                        dialogCell2.animatingArchiveAvatar = false;
                                                    }
                                                    z8 = true;
                                                }
                                                if (dialogCell2.drawRevealBackground) {
                                                    f18 = dialogCell2.currentRevealBounceProgress;
                                                    if (f18 < 1.0f) {
                                                        f21 = f18 + 0.09411765f;
                                                        dialogCell2.currentRevealBounceProgress = f21;
                                                        if (f21 > 1.0f) {
                                                            dialogCell2.currentRevealBounceProgress = 1.0f;
                                                            z8 = true;
                                                        }
                                                    }
                                                    f19 = dialogCell2.currentRevealProgress;
                                                    if (f19 < 1.0f) {
                                                        f20 = f19 + 0.053333335f;
                                                        dialogCell2.currentRevealProgress = f20;
                                                        if (f20 > 1.0f) {
                                                            dialogCell2.currentRevealProgress = 1.0f;
                                                        }
                                                        z8 = true;
                                                    }
                                                } else {
                                                    if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                        dialogCell2.currentRevealBounceProgress = 0.0f;
                                                        z8 = true;
                                                    }
                                                    f16 = dialogCell2.currentRevealProgress;
                                                    if (f16 > 0.0f) {
                                                        f17 = f16 - 0.053333335f;
                                                        dialogCell2.currentRevealProgress = f17;
                                                        if (f17 < 0.0f) {
                                                            dialogCell2.currentRevealProgress = 0.0f;
                                                        }
                                                        z8 = true;
                                                    }
                                                }
                                                if (z3) {
                                                    i7 = 0;
                                                } else {
                                                    i7 = 4;
                                                }
                                                anonymousClass4.setVisibility(i7);
                                                if (z8) {
                                                    dialogCell2.invalidate();
                                                }
                                            }
                                            Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                                            int i45 = dialogCell3.errorLeft;
                                            RectF rectF7 = rectF;
                                            rectF7.set(i45, dialogCell3.errorTop, AndroidUtilities.dp(20.666f) + i45, AndroidUtilities.dp(20.666f) + dialogCell3.errorTop);
                                            float f61 = AndroidUtilities.density * 10.5f;
                                            canvas3.drawRoundRect(rectF7, f61, f61, Theme.dialogs_errorPaint);
                                            BaseCell.setDrawableBounds(AndroidUtilities.dp(4.5f) + dialogCell3.errorLeft, AndroidUtilities.dp(5.0f) + dialogCell3.errorTop, Theme.dialogs_errorDrawable);
                                            Theme.dialogs_errorDrawable.draw(canvas3);
                                            dialogCell = dialogCell3;
                                            if (dialogCell.thumbsCount > 0) {
                                                f32 = dialogUpdateHelper.typingProgres;
                                                if (f32 != 1.0f) {
                                                    if (f32 > 0.0f) {
                                                        canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f32) * 255.0f), 31);
                                                        canvas3 = canvas;
                                                        if (dialogUpdateHelper.typingOutToTop) {
                                                            fDp = -AndroidUtilities.dp(14.0f);
                                                            f33 = dialogUpdateHelper.typingProgres;
                                                        } else {
                                                            fDp = AndroidUtilities.dp(14.0f);
                                                            f33 = dialogUpdateHelper.typingProgres;
                                                        }
                                                        canvas3.translate(0.0f, fDp * f33);
                                                    }
                                                    i12 = 0;
                                                    while (i12 < dialogCell.thumbsCount) {
                                                        if (dialogCell.thumbImageSeen[i12]) {
                                                            if (dialogCell.thumbBackgroundPaint == null) {
                                                                Paint paint9 = new Paint(1);
                                                                dialogCell.thumbBackgroundPaint = paint9;
                                                                paint9.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                                dialogCell.thumbBackgroundPaint.setColor(0);
                                                            }
                                                            rectF3 = AndroidUtilities.rectTmp;
                                                            imageReceiverArr = dialogCell.thumbImage;
                                                            rectF3.set(imageReceiverArr[i12].getImageX(), imageReceiverArr[i12].getImageY(), imageReceiverArr[i12].getImageX2(), imageReceiverArr[i12].getImageY2());
                                                            imageReceiverArr[i12].draw(canvas3);
                                                            if (dialogCell.drawSpoiler[i12]) {
                                                                path = dialogCell.thumbPath;
                                                                if (path == null) {
                                                                    dialogCell.thumbPath = new Path();
                                                                } else {
                                                                    path.rewind();
                                                                }
                                                                dialogCell.thumbPath.addRoundRect(rectF3, imageReceiverArr[i12].getRoundRadius()[0], imageReceiverArr[i12].getRoundRadius()[1], Path.Direction.CW);
                                                                canvas3.save();
                                                                canvas3.clipPath(dialogCell.thumbPath);
                                                                if (dialogCell.thumbSpoiler == null) {
                                                                    dialogCell.thumbSpoiler = new SpoilerEffect();
                                                                }
                                                                dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i10) * 0.325f)));
                                                                dialogCell.thumbSpoiler.setBounds((int) imageReceiverArr[i12].getImageX(), (int) imageReceiverArr[i12].getImageY(), (int) imageReceiverArr[i12].getImageX2(), (int) imageReceiverArr[i12].getImageY2());
                                                                dialogCell.thumbSpoiler.draw(canvas3);
                                                                dialogCell.invalidate();
                                                                canvas3.restore();
                                                            }
                                                            if (dialogCell.drawPlay[i12]) {
                                                                BaseCell.setDrawableBounds((int) (imageReceiverArr[i12].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i12].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)), Theme.dialogs_playDrawable);
                                                                Theme.dialogs_playDrawable.draw(canvas3);
                                                            }
                                                        }
                                                        i12++;
                                                        i10 = -1;
                                                    }
                                                    if (dialogUpdateHelper.typingProgres > 0.0f) {
                                                        canvas3.restore();
                                                    }
                                                }
                                            }
                                            dialogCellTags = dialogCell.tags;
                                            if (dialogCellTags != null) {
                                                canvas3.save();
                                                canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                                dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                                canvas3.restore();
                                            }
                                            i11 = i9;
                                            if (i11 != -1) {
                                                canvas3.restoreToCount(i11);
                                            }
                                            z5 = dialogCell.animatingArchiveAvatar;
                                            imageReceiver = dialogCell.avatarImage;
                                            if (z5) {
                                                canvas3.save();
                                                float interpolation4 = anonymousClass3.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                                canvas3.scale(interpolation4, interpolation4, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                            }
                                            z6 = dialogCell.drawAvatar;
                                            anonymousClass1 = dialogCell.storyParams;
                                            if (z6) {
                                                if (dialogCell.drawMonoforumAvatar) {
                                                    if (dialogCell.bubbleClip == null) {
                                                        dialogCell.bubbleClip = new PhotoBubbleClip();
                                                    }
                                                    dialogCell.bubbleClip.setBounds((int) anonymousClass1.originalAvatarRect.centerX(), (int) anonymousClass1.originalAvatarRect.centerY(), (int) (anonymousClass1.originalAvatarRect.width() / 2.0f));
                                                    canvas3.save();
                                                    canvas3.clipPath(dialogCell.bubbleClip);
                                                    imageReceiver.setImageCoords(anonymousClass1.originalAvatarRect);
                                                    imageReceiver.draw(canvas3);
                                                    canvas3.restore();
                                                } else if (dialogCell.drawCommunityAvatar) {
                                                    DrawableUtils.setBounds(imageReceiver, AndroidUtilities.dpf2(1.0f) + anonymousClass1.originalAvatarRect.centerX(), anonymousClass1.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                                                    DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, imageReceiver.getCenterX(), imageReceiver.getCenterY(), AndroidUtilities.dp(48.0f));
                                                    imageReceiver.draw(canvas3);
                                                } else {
                                                    z9 = dialogCell.isShareToStoryCell;
                                                    if (z9) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = true;
                                                    }
                                                    anonymousClass1.drawHiddenStoriesAsSegments = z10;
                                                    int i46 = anonymousClass1.forceState;
                                                    if (z9) {
                                                        anonymousClass1.forceState = 1;
                                                    }
                                                    StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, imageReceiver, anonymousClass1);
                                                    if (anonymousClass1.drawnLive) {
                                                        dialogCell.checkTtl();
                                                    }
                                                    anonymousClass1.forceState = i46;
                                                }
                                                if (!dialogCell.insideCommunityList) {
                                                    float fCenterX2 = anonymousClass1.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                    float fCenterY2 = anonymousClass1.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                    if (dialogCell.communityArrowDrawable == null) {
                                                        dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                    }
                                                    DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX2, fCenterY2, 17);
                                                    canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3)));
                                                    dialogCell.communityArrowDrawable.draw(canvas3);
                                                }
                                            }
                                            if (dialogCell.animatingArchiveAvatar) {
                                                canvas3.restore();
                                            }
                                            if (imageReceiver.getVisible()) {
                                                z4 = true;
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
                                            if (z) {
                                                canvas3.save();
                                                canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                                                canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.pullProgress) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                                dialogCell2.archivedChatsDrawable.draw(canvas3, false);
                                                canvas3.restore();
                                            }
                                            if (dialogCell2.useSeparator) {
                                                f8 = 0.0f;
                                            } else {
                                                if (dialogCell2.fullSeparator) {
                                                    iDp = 0;
                                                } else {
                                                    iDp = 0;
                                                }
                                                if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                                    alpha = Theme.dividerPaint.getAlpha();
                                                    f25 = dialogCell2.rightFragmentOpenedProgress;
                                                    if (f25 != 0.0f) {
                                                        Theme.dividerPaint.setAlpha((int) ((1.0f - f25) * alpha));
                                                    }
                                                    measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                    if (LocaleController.isRTL) {
                                                        canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                                                    } else {
                                                        canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                                                    }
                                                    f8 = 0.0f;
                                                    if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                        Theme.dividerPaint.setAlpha(alpha);
                                                    }
                                                } else {
                                                    f8 = 0.0f;
                                                }
                                            }
                                            if (dialogCell2.clipProgress == f8) {
                                                canvas2 = canvas;
                                            } else if (Build.VERSION.SDK_INT != 24) {
                                                canvas.restore();
                                                canvas2 = canvas;
                                            } else {
                                                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3));
                                                canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                                                canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                                                canvas2 = canvas;
                                            }
                                            if (z22) {
                                                float f62 = 1.0f - f47;
                                                int measuredHeight3 = (int) (dialogCell2.getMeasuredHeight() * f62);
                                                color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                                                if (dialogCell2.archiveFadeGradientDrawable == null) {
                                                    dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                                }
                                                if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                                                    dialogCell2.archiveFadeGradientDrawableColor = color3;
                                                    dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                                                }
                                                float fClamp3 = MathUtils.clamp((f62 - 0.05f) * 10.0f, 0.0f, 1.0f);
                                                dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight3, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight3);
                                                dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp3 * 255.0f));
                                                dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                                canvas2.restore();
                                            }
                                            z7 = dialogCell2.drawReorder;
                                            if (z7) {
                                                if (z7) {
                                                    f12 = dialogCell2.reorderIconProgress;
                                                    if (f12 < 1.0f) {
                                                        f13 = f12 + 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f13;
                                                        if (f13 > 1.0f) {
                                                            dialogCell2.reorderIconProgress = 1.0f;
                                                        }
                                                        f10 = 0.0f;
                                                    }
                                                    f10 = 0.0f;
                                                    z8 = z4;
                                                } else {
                                                    f9 = dialogCell2.reorderIconProgress;
                                                    f10 = 0.0f;
                                                    if (f9 > 0.0f) {
                                                        f11 = f9 - 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f11;
                                                        if (f11 < 0.0f) {
                                                            dialogCell2.reorderIconProgress = 0.0f;
                                                        }
                                                    } else {
                                                        z8 = z4;
                                                    }
                                                }
                                                z8 = true;
                                            } else {
                                                if (z7) {
                                                    f12 = dialogCell2.reorderIconProgress;
                                                    if (f12 < 1.0f) {
                                                        f13 = f12 + 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f13;
                                                        if (f13 > 1.0f) {
                                                            dialogCell2.reorderIconProgress = 1.0f;
                                                        }
                                                        f10 = 0.0f;
                                                    }
                                                    f10 = 0.0f;
                                                    z8 = z4;
                                                } else {
                                                    f9 = dialogCell2.reorderIconProgress;
                                                    f10 = 0.0f;
                                                    if (f9 > 0.0f) {
                                                        f11 = f9 - 0.09411765f;
                                                        dialogCell2.reorderIconProgress = f11;
                                                        if (f11 < 0.0f) {
                                                            dialogCell2.reorderIconProgress = 0.0f;
                                                        }
                                                    } else {
                                                        z8 = z4;
                                                    }
                                                }
                                                z8 = true;
                                            }
                                            if (dialogCell2.archiveHidden) {
                                                f23 = dialogCell2.archiveBackgroundProgress;
                                                if (f23 > f10) {
                                                    f24 = f23 - 0.069565214f;
                                                    dialogCell2.archiveBackgroundProgress = f24;
                                                    if (f24 < f10) {
                                                        dialogCell2.archiveBackgroundProgress = f10;
                                                    }
                                                    avatarDrawable2 = dialogCell2.avatarDrawable;
                                                    if (avatarDrawable2.avatarType == 2) {
                                                        avatarDrawable2.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                                                    }
                                                    z8 = true;
                                                }
                                            } else {
                                                f14 = dialogCell2.archiveBackgroundProgress;
                                                if (f14 < 1.0f) {
                                                    f15 = f14 + 0.069565214f;
                                                    dialogCell2.archiveBackgroundProgress = f15;
                                                    if (f15 > 1.0f) {
                                                        dialogCell2.archiveBackgroundProgress = 1.0f;
                                                    }
                                                    avatarDrawable = dialogCell2.avatarDrawable;
                                                    if (avatarDrawable.avatarType == 2) {
                                                        avatarDrawable.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                                                    }
                                                    z8 = true;
                                                }
                                            }
                                            if (dialogCell2.animatingArchiveAvatar) {
                                                f22 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                                dialogCell2.animatingArchiveAvatarProgress = f22;
                                                if (f22 >= 170.0f) {
                                                    dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                                                    dialogCell2.animatingArchiveAvatar = false;
                                                }
                                                z8 = true;
                                            }
                                            if (dialogCell2.drawRevealBackground) {
                                                f18 = dialogCell2.currentRevealBounceProgress;
                                                if (f18 < 1.0f) {
                                                    f21 = f18 + 0.09411765f;
                                                    dialogCell2.currentRevealBounceProgress = f21;
                                                    if (f21 > 1.0f) {
                                                        dialogCell2.currentRevealBounceProgress = 1.0f;
                                                        z8 = true;
                                                    }
                                                }
                                                f19 = dialogCell2.currentRevealProgress;
                                                if (f19 < 1.0f) {
                                                    f20 = f19 + 0.053333335f;
                                                    dialogCell2.currentRevealProgress = f20;
                                                    if (f20 > 1.0f) {
                                                        dialogCell2.currentRevealProgress = 1.0f;
                                                    }
                                                    z8 = true;
                                                }
                                            } else {
                                                if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                    dialogCell2.currentRevealBounceProgress = 0.0f;
                                                    z8 = true;
                                                }
                                                f16 = dialogCell2.currentRevealProgress;
                                                if (f16 > 0.0f) {
                                                    f17 = f16 - 0.053333335f;
                                                    dialogCell2.currentRevealProgress = f17;
                                                    if (f17 < 0.0f) {
                                                        dialogCell2.currentRevealProgress = 0.0f;
                                                    }
                                                    z8 = true;
                                                }
                                            }
                                            if (z3) {
                                                i7 = 0;
                                            } else {
                                                i7 = 4;
                                            }
                                            anonymousClass4.setVisibility(i7);
                                            if (z8) {
                                                dialogCell2.invalidate();
                                            }
                                        }
                                        anonymousClass4 = anonymousClass5;
                                        if (dialogCell3.drawScam != 0) {
                                            if (z11) {
                                                f28 = 12.0f;
                                            } else {
                                                f28 = 12.0f;
                                            }
                                            int iDp9 = AndroidUtilities.dp(f28);
                                            iDp9 = z11 ? iDp9 - AndroidUtilities.dp(9.0f) : iDp9 - AndroidUtilities.dp(9.0f);
                                            if (dialogCell3.drawScam == 1) {
                                                scamDrawable = Theme.dialogs_scamDrawable;
                                            } else {
                                                scamDrawable = Theme.dialogs_fakeDrawable;
                                            }
                                            BaseCell.setDrawableBounds(dialogCell3.nameMuteLeft, iDp9, scamDrawable);
                                            if (dialogCell3.drawScam == 1) {
                                                scamDrawable2 = Theme.dialogs_scamDrawable;
                                            } else {
                                                scamDrawable2 = Theme.dialogs_fakeDrawable;
                                            }
                                            scamDrawable2.draw(canvas3);
                                        }
                                    }
                                    z3 = false;
                                    if (dialogCell3.drawReorder) {
                                        if (!LocaleController.isRTL) {
                                            Paint paintReorderGradient3 = dialogCell3.getPaintReorderGradient();
                                            paintReorderGradient3.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                            canvas3.save();
                                            canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(f26), dialogCell3.pinTop);
                                            canvas.drawRect(0.0f, 0.0f, RichMessageLayout$$ExternalSyntheticOutline1.m(dialogCell3.pinLeft, 24.0f, dialogCell3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient3);
                                            canvas3 = canvas;
                                            canvas3.restore();
                                        }
                                        Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                        BaseCell.setDrawableBounds(dialogCell3.pinLeft, dialogCell3.pinTop, Theme.dialogs_reorderDrawable);
                                        Theme.dialogs_reorderDrawable.draw(canvas3);
                                    } else {
                                        if (!LocaleController.isRTL) {
                                            Paint paintReorderGradient4 = dialogCell3.getPaintReorderGradient();
                                            paintReorderGradient4.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                            canvas3.save();
                                            canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(f26), dialogCell3.pinTop);
                                            canvas.drawRect(0.0f, 0.0f, RichMessageLayout$$ExternalSyntheticOutline1.m(dialogCell3.pinLeft, 24.0f, dialogCell3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient4);
                                            canvas3 = canvas;
                                            canvas3.restore();
                                        }
                                        Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                        BaseCell.setDrawableBounds(dialogCell3.pinLeft, dialogCell3.pinTop, Theme.dialogs_reorderDrawable);
                                        Theme.dialogs_reorderDrawable.draw(canvas3);
                                    }
                                    f30 = dialogCell3.animatorPollVotesMentionVisible.floatValue;
                                    if (dialogCell3.drawError) {
                                        rectF2 = rectF;
                                        if (dialogCell3.drawCount) {
                                        }
                                        zIsCounterMuted = dialogCell3.isCounterMuted();
                                        canvas3 = canvas;
                                        drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                                        dialogCell = this;
                                        if (dialogCell.drawMention) {
                                            Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                            if (dialogCell.mentionLayout != null) {
                                                int i310 = dialogCell.mentionLeft;
                                                rectF2.set(i310, dialogCell.countTop, AndroidUtilities.dp(12.666f) + i310 + dialogCell.mentionWidth, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                                if (zIsCounterMuted) {
                                                    paint = Theme.dialogs_countPaint;
                                                } else {
                                                    paint = Theme.dialogs_countPaint;
                                                }
                                                canvas3.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
                                                Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                canvas3.save();
                                                canvas3.translate(AndroidUtilities.dp(6.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(4.0f) + dialogCell.countTop);
                                                dialogCell.mentionLayout.draw(canvas3);
                                                canvas3.restore();
                                            } else {
                                                Drawable drawable6 = Theme.dialogs_mentionDrawable;
                                                drawable6.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                                DrawableUtils.setBounds(drawable6, AndroidUtilities.dp(10.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                                drawable6.draw(canvas3);
                                            }
                                        }
                                        if (dialogCell.drawReactionMention) {
                                            int i47 = dialogCell.reactionMentionLeft;
                                            rectF2.set(i47, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i47, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                            f31 = dialogCell.reactionsMentionsChangeProgress;
                                            if (f31 == 1.0f) {
                                                f31 = 1.0f;
                                            } else if (!dialogCell.drawReactionMention) {
                                                f31 = 1.0f - f31;
                                            }
                                            if (zIsCounterMuted) {
                                                drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                            } else {
                                                drawable = Theme.dialogs_reactionsMentionDrawable;
                                            }
                                            drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                            DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i47, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                            DrawableUtils.drawWithScale(canvas3, drawable, f31);
                                        } else {
                                            int i48 = dialogCell.reactionMentionLeft;
                                            rectF2.set(i48, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i48, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                            f31 = dialogCell.reactionsMentionsChangeProgress;
                                            if (f31 == 1.0f) {
                                                f31 = 1.0f;
                                            } else if (!dialogCell.drawReactionMention) {
                                                f31 = 1.0f - f31;
                                            }
                                            if (zIsCounterMuted) {
                                                drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                            } else {
                                                drawable = Theme.dialogs_reactionsMentionDrawable;
                                            }
                                            drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                            DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i48, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                            DrawableUtils.drawWithScale(canvas3, drawable, f31);
                                        }
                                        if (dialogCell.drawPollVotesMention) {
                                            int i49 = dialogCell.pollVotesMentionLeft;
                                            rectF2.set(i49, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i49, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                            if (zIsCounterMuted) {
                                                drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                            } else {
                                                drawable2 = Theme.dialogs_pollMentionDrawable;
                                            }
                                            drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                            DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i49, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                            DrawableUtils.drawWithScale(canvas3, drawable2, f30);
                                        } else {
                                            int i410 = dialogCell.pollVotesMentionLeft;
                                            rectF2.set(i410, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i410, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                            if (zIsCounterMuted) {
                                                drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                            } else {
                                                drawable2 = Theme.dialogs_pollMentionDrawable;
                                            }
                                            drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                            DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i410, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                            DrawableUtils.drawWithScale(canvas3, drawable2, f30);
                                        }
                                        if (dialogCell.thumbsCount > 0) {
                                            f32 = dialogUpdateHelper.typingProgres;
                                            if (f32 != 1.0f) {
                                                if (f32 > 0.0f) {
                                                    canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f32) * 255.0f), 31);
                                                    canvas3 = canvas;
                                                    if (dialogUpdateHelper.typingOutToTop) {
                                                        fDp = -AndroidUtilities.dp(14.0f);
                                                        f33 = dialogUpdateHelper.typingProgres;
                                                    } else {
                                                        fDp = AndroidUtilities.dp(14.0f);
                                                        f33 = dialogUpdateHelper.typingProgres;
                                                    }
                                                    canvas3.translate(0.0f, fDp * f33);
                                                }
                                                i12 = 0;
                                                while (i12 < dialogCell.thumbsCount) {
                                                    if (dialogCell.thumbImageSeen[i12]) {
                                                        if (dialogCell.thumbBackgroundPaint == null) {
                                                            Paint paint10 = new Paint(1);
                                                            dialogCell.thumbBackgroundPaint = paint10;
                                                            paint10.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                            dialogCell.thumbBackgroundPaint.setColor(0);
                                                        }
                                                        rectF3 = AndroidUtilities.rectTmp;
                                                        imageReceiverArr = dialogCell.thumbImage;
                                                        rectF3.set(imageReceiverArr[i12].getImageX(), imageReceiverArr[i12].getImageY(), imageReceiverArr[i12].getImageX2(), imageReceiverArr[i12].getImageY2());
                                                        imageReceiverArr[i12].draw(canvas3);
                                                        if (dialogCell.drawSpoiler[i12]) {
                                                            path = dialogCell.thumbPath;
                                                            if (path == null) {
                                                                dialogCell.thumbPath = new Path();
                                                            } else {
                                                                path.rewind();
                                                            }
                                                            dialogCell.thumbPath.addRoundRect(rectF3, imageReceiverArr[i12].getRoundRadius()[0], imageReceiverArr[i12].getRoundRadius()[1], Path.Direction.CW);
                                                            canvas3.save();
                                                            canvas3.clipPath(dialogCell.thumbPath);
                                                            if (dialogCell.thumbSpoiler == null) {
                                                                dialogCell.thumbSpoiler = new SpoilerEffect();
                                                            }
                                                            dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i10) * 0.325f)));
                                                            dialogCell.thumbSpoiler.setBounds((int) imageReceiverArr[i12].getImageX(), (int) imageReceiverArr[i12].getImageY(), (int) imageReceiverArr[i12].getImageX2(), (int) imageReceiverArr[i12].getImageY2());
                                                            dialogCell.thumbSpoiler.draw(canvas3);
                                                            dialogCell.invalidate();
                                                            canvas3.restore();
                                                        }
                                                        if (dialogCell.drawPlay[i12]) {
                                                            BaseCell.setDrawableBounds((int) (imageReceiverArr[i12].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i12].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)), Theme.dialogs_playDrawable);
                                                            Theme.dialogs_playDrawable.draw(canvas3);
                                                        }
                                                    }
                                                    i12++;
                                                    i10 = -1;
                                                }
                                                if (dialogUpdateHelper.typingProgres > 0.0f) {
                                                    canvas3.restore();
                                                }
                                            }
                                        }
                                        dialogCellTags = dialogCell.tags;
                                        if (dialogCellTags != null) {
                                            canvas3.save();
                                            canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                            dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                            canvas3.restore();
                                        }
                                        i11 = i9;
                                        if (i11 != -1) {
                                            canvas3.restoreToCount(i11);
                                        }
                                        z5 = dialogCell.animatingArchiveAvatar;
                                        imageReceiver = dialogCell.avatarImage;
                                        if (z5) {
                                            canvas3.save();
                                            float interpolation5 = anonymousClass3.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                            canvas3.scale(interpolation5, interpolation5, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        }
                                        z6 = dialogCell.drawAvatar;
                                        anonymousClass1 = dialogCell.storyParams;
                                        if (z6) {
                                            if (dialogCell.drawMonoforumAvatar) {
                                                if (dialogCell.bubbleClip == null) {
                                                    dialogCell.bubbleClip = new PhotoBubbleClip();
                                                }
                                                dialogCell.bubbleClip.setBounds((int) anonymousClass1.originalAvatarRect.centerX(), (int) anonymousClass1.originalAvatarRect.centerY(), (int) (anonymousClass1.originalAvatarRect.width() / 2.0f));
                                                canvas3.save();
                                                canvas3.clipPath(dialogCell.bubbleClip);
                                                imageReceiver.setImageCoords(anonymousClass1.originalAvatarRect);
                                                imageReceiver.draw(canvas3);
                                                canvas3.restore();
                                            } else if (dialogCell.drawCommunityAvatar) {
                                                DrawableUtils.setBounds(imageReceiver, AndroidUtilities.dpf2(1.0f) + anonymousClass1.originalAvatarRect.centerX(), anonymousClass1.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                                                DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, imageReceiver.getCenterX(), imageReceiver.getCenterY(), AndroidUtilities.dp(48.0f));
                                                imageReceiver.draw(canvas3);
                                            } else {
                                                z9 = dialogCell.isShareToStoryCell;
                                                if (z9) {
                                                    z10 = true;
                                                } else {
                                                    z10 = true;
                                                }
                                                anonymousClass1.drawHiddenStoriesAsSegments = z10;
                                                int i411 = anonymousClass1.forceState;
                                                if (z9) {
                                                    anonymousClass1.forceState = 1;
                                                }
                                                StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, imageReceiver, anonymousClass1);
                                                if (anonymousClass1.drawnLive) {
                                                    dialogCell.checkTtl();
                                                }
                                                anonymousClass1.forceState = i411;
                                            }
                                            if (!dialogCell.insideCommunityList) {
                                                float fCenterX3 = anonymousClass1.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                float fCenterY3 = anonymousClass1.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                if (dialogCell.communityArrowDrawable == null) {
                                                    dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                                }
                                                DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX3, fCenterY3, 17);
                                                canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3)));
                                                dialogCell.communityArrowDrawable.draw(canvas3);
                                            }
                                        }
                                        if (dialogCell.animatingArchiveAvatar) {
                                            canvas3.restore();
                                        }
                                        if (imageReceiver.getVisible()) {
                                            z4 = true;
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
                                        if (z) {
                                            canvas3.save();
                                            canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                                            canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.pullProgress) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                            dialogCell2.archivedChatsDrawable.draw(canvas3, false);
                                            canvas3.restore();
                                        }
                                        if (dialogCell2.useSeparator) {
                                            f8 = 0.0f;
                                        } else {
                                            if (dialogCell2.fullSeparator) {
                                                iDp = 0;
                                            } else {
                                                iDp = 0;
                                            }
                                            if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                                alpha = Theme.dividerPaint.getAlpha();
                                                f25 = dialogCell2.rightFragmentOpenedProgress;
                                                if (f25 != 0.0f) {
                                                    Theme.dividerPaint.setAlpha((int) ((1.0f - f25) * alpha));
                                                }
                                                measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                                if (LocaleController.isRTL) {
                                                    canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                                                } else {
                                                    canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                                                }
                                                f8 = 0.0f;
                                                if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                    Theme.dividerPaint.setAlpha(alpha);
                                                }
                                            } else {
                                                f8 = 0.0f;
                                            }
                                        }
                                        if (dialogCell2.clipProgress == f8) {
                                            canvas2 = canvas;
                                        } else if (Build.VERSION.SDK_INT != 24) {
                                            canvas.restore();
                                            canvas2 = canvas;
                                        } else {
                                            Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3));
                                            canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                                            canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                                            canvas2 = canvas;
                                        }
                                        if (z22) {
                                            float f63 = 1.0f - f47;
                                            int measuredHeight4 = (int) (dialogCell2.getMeasuredHeight() * f63);
                                            color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                                            if (dialogCell2.archiveFadeGradientDrawable == null) {
                                                dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                            }
                                            if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                                                dialogCell2.archiveFadeGradientDrawableColor = color3;
                                                dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                                            }
                                            float fClamp4 = MathUtils.clamp((f63 - 0.05f) * 10.0f, 0.0f, 1.0f);
                                            dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight4, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight4);
                                            dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp4 * 255.0f));
                                            dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                            canvas2.restore();
                                        }
                                        z7 = dialogCell2.drawReorder;
                                        if (z7) {
                                            if (z7) {
                                                f12 = dialogCell2.reorderIconProgress;
                                                if (f12 < 1.0f) {
                                                    f13 = f12 + 0.09411765f;
                                                    dialogCell2.reorderIconProgress = f13;
                                                    if (f13 > 1.0f) {
                                                        dialogCell2.reorderIconProgress = 1.0f;
                                                    }
                                                    f10 = 0.0f;
                                                }
                                                f10 = 0.0f;
                                                z8 = z4;
                                            } else {
                                                f9 = dialogCell2.reorderIconProgress;
                                                f10 = 0.0f;
                                                if (f9 > 0.0f) {
                                                    f11 = f9 - 0.09411765f;
                                                    dialogCell2.reorderIconProgress = f11;
                                                    if (f11 < 0.0f) {
                                                        dialogCell2.reorderIconProgress = 0.0f;
                                                    }
                                                } else {
                                                    z8 = z4;
                                                }
                                            }
                                            z8 = true;
                                        } else {
                                            if (z7) {
                                                f12 = dialogCell2.reorderIconProgress;
                                                if (f12 < 1.0f) {
                                                    f13 = f12 + 0.09411765f;
                                                    dialogCell2.reorderIconProgress = f13;
                                                    if (f13 > 1.0f) {
                                                        dialogCell2.reorderIconProgress = 1.0f;
                                                    }
                                                    f10 = 0.0f;
                                                }
                                                f10 = 0.0f;
                                                z8 = z4;
                                            } else {
                                                f9 = dialogCell2.reorderIconProgress;
                                                f10 = 0.0f;
                                                if (f9 > 0.0f) {
                                                    f11 = f9 - 0.09411765f;
                                                    dialogCell2.reorderIconProgress = f11;
                                                    if (f11 < 0.0f) {
                                                        dialogCell2.reorderIconProgress = 0.0f;
                                                    }
                                                } else {
                                                    z8 = z4;
                                                }
                                            }
                                            z8 = true;
                                        }
                                        if (dialogCell2.archiveHidden) {
                                            f23 = dialogCell2.archiveBackgroundProgress;
                                            if (f23 > f10) {
                                                f24 = f23 - 0.069565214f;
                                                dialogCell2.archiveBackgroundProgress = f24;
                                                if (f24 < f10) {
                                                    dialogCell2.archiveBackgroundProgress = f10;
                                                }
                                                avatarDrawable2 = dialogCell2.avatarDrawable;
                                                if (avatarDrawable2.avatarType == 2) {
                                                    avatarDrawable2.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                                                }
                                                z8 = true;
                                            }
                                        } else {
                                            f14 = dialogCell2.archiveBackgroundProgress;
                                            if (f14 < 1.0f) {
                                                f15 = f14 + 0.069565214f;
                                                dialogCell2.archiveBackgroundProgress = f15;
                                                if (f15 > 1.0f) {
                                                    dialogCell2.archiveBackgroundProgress = 1.0f;
                                                }
                                                avatarDrawable = dialogCell2.avatarDrawable;
                                                if (avatarDrawable.avatarType == 2) {
                                                    avatarDrawable.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                                                }
                                                z8 = true;
                                            }
                                        }
                                        if (dialogCell2.animatingArchiveAvatar) {
                                            f22 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                            dialogCell2.animatingArchiveAvatarProgress = f22;
                                            if (f22 >= 170.0f) {
                                                dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                                                dialogCell2.animatingArchiveAvatar = false;
                                            }
                                            z8 = true;
                                        }
                                        if (dialogCell2.drawRevealBackground) {
                                            f18 = dialogCell2.currentRevealBounceProgress;
                                            if (f18 < 1.0f) {
                                                f21 = f18 + 0.09411765f;
                                                dialogCell2.currentRevealBounceProgress = f21;
                                                if (f21 > 1.0f) {
                                                    dialogCell2.currentRevealBounceProgress = 1.0f;
                                                    z8 = true;
                                                }
                                            }
                                            f19 = dialogCell2.currentRevealProgress;
                                            if (f19 < 1.0f) {
                                                f20 = f19 + 0.053333335f;
                                                dialogCell2.currentRevealProgress = f20;
                                                if (f20 > 1.0f) {
                                                    dialogCell2.currentRevealProgress = 1.0f;
                                                }
                                                z8 = true;
                                            }
                                        } else {
                                            if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                                dialogCell2.currentRevealBounceProgress = 0.0f;
                                                z8 = true;
                                            }
                                            f16 = dialogCell2.currentRevealProgress;
                                            if (f16 > 0.0f) {
                                                f17 = f16 - 0.053333335f;
                                                dialogCell2.currentRevealProgress = f17;
                                                if (f17 < 0.0f) {
                                                    dialogCell2.currentRevealProgress = 0.0f;
                                                }
                                                z8 = true;
                                            }
                                        }
                                        if (z3) {
                                            i7 = 0;
                                        } else {
                                            i7 = 4;
                                        }
                                        anonymousClass4.setVisibility(i7);
                                        if (z8) {
                                            dialogCell2.invalidate();
                                        }
                                    }
                                    Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                                    int i412 = dialogCell3.errorLeft;
                                    RectF rectF8 = rectF;
                                    rectF8.set(i412, dialogCell3.errorTop, AndroidUtilities.dp(20.666f) + i412, AndroidUtilities.dp(20.666f) + dialogCell3.errorTop);
                                    float f64 = AndroidUtilities.density * 10.5f;
                                    canvas3.drawRoundRect(rectF8, f64, f64, Theme.dialogs_errorPaint);
                                    BaseCell.setDrawableBounds(AndroidUtilities.dp(4.5f) + dialogCell3.errorLeft, AndroidUtilities.dp(5.0f) + dialogCell3.errorTop, Theme.dialogs_errorDrawable);
                                    Theme.dialogs_errorDrawable.draw(canvas3);
                                    dialogCell = dialogCell3;
                                    if (dialogCell.thumbsCount > 0) {
                                        f32 = dialogUpdateHelper.typingProgres;
                                        if (f32 != 1.0f) {
                                            if (f32 > 0.0f) {
                                                canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f32) * 255.0f), 31);
                                                canvas3 = canvas;
                                                if (dialogUpdateHelper.typingOutToTop) {
                                                    fDp = -AndroidUtilities.dp(14.0f);
                                                    f33 = dialogUpdateHelper.typingProgres;
                                                } else {
                                                    fDp = AndroidUtilities.dp(14.0f);
                                                    f33 = dialogUpdateHelper.typingProgres;
                                                }
                                                canvas3.translate(0.0f, fDp * f33);
                                            }
                                            i12 = 0;
                                            while (i12 < dialogCell.thumbsCount) {
                                                if (dialogCell.thumbImageSeen[i12]) {
                                                    if (dialogCell.thumbBackgroundPaint == null) {
                                                        Paint paint11 = new Paint(1);
                                                        dialogCell.thumbBackgroundPaint = paint11;
                                                        paint11.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                                        dialogCell.thumbBackgroundPaint.setColor(0);
                                                    }
                                                    rectF3 = AndroidUtilities.rectTmp;
                                                    imageReceiverArr = dialogCell.thumbImage;
                                                    rectF3.set(imageReceiverArr[i12].getImageX(), imageReceiverArr[i12].getImageY(), imageReceiverArr[i12].getImageX2(), imageReceiverArr[i12].getImageY2());
                                                    imageReceiverArr[i12].draw(canvas3);
                                                    if (dialogCell.drawSpoiler[i12]) {
                                                        path = dialogCell.thumbPath;
                                                        if (path == null) {
                                                            dialogCell.thumbPath = new Path();
                                                        } else {
                                                            path.rewind();
                                                        }
                                                        dialogCell.thumbPath.addRoundRect(rectF3, imageReceiverArr[i12].getRoundRadius()[0], imageReceiverArr[i12].getRoundRadius()[1], Path.Direction.CW);
                                                        canvas3.save();
                                                        canvas3.clipPath(dialogCell.thumbPath);
                                                        if (dialogCell.thumbSpoiler == null) {
                                                            dialogCell.thumbSpoiler = new SpoilerEffect();
                                                        }
                                                        dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i10) * 0.325f)));
                                                        dialogCell.thumbSpoiler.setBounds((int) imageReceiverArr[i12].getImageX(), (int) imageReceiverArr[i12].getImageY(), (int) imageReceiverArr[i12].getImageX2(), (int) imageReceiverArr[i12].getImageY2());
                                                        dialogCell.thumbSpoiler.draw(canvas3);
                                                        dialogCell.invalidate();
                                                        canvas3.restore();
                                                    }
                                                    if (dialogCell.drawPlay[i12]) {
                                                        BaseCell.setDrawableBounds((int) (imageReceiverArr[i12].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i12].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)), Theme.dialogs_playDrawable);
                                                        Theme.dialogs_playDrawable.draw(canvas3);
                                                    }
                                                }
                                                i12++;
                                                i10 = -1;
                                            }
                                            if (dialogUpdateHelper.typingProgres > 0.0f) {
                                                canvas3.restore();
                                            }
                                        }
                                    }
                                    dialogCellTags = dialogCell.tags;
                                    if (dialogCellTags != null) {
                                        canvas3.save();
                                        canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                        dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                        canvas3.restore();
                                    }
                                    i11 = i9;
                                    if (i11 != -1) {
                                        canvas3.restoreToCount(i11);
                                    }
                                    z5 = dialogCell.animatingArchiveAvatar;
                                    imageReceiver = dialogCell.avatarImage;
                                    if (z5) {
                                        canvas3.save();
                                        float interpolation6 = anonymousClass3.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                                        canvas3.scale(interpolation6, interpolation6, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                    }
                                    z6 = dialogCell.drawAvatar;
                                    anonymousClass1 = dialogCell.storyParams;
                                    if (z6) {
                                        if (dialogCell.drawMonoforumAvatar) {
                                            if (dialogCell.bubbleClip == null) {
                                                dialogCell.bubbleClip = new PhotoBubbleClip();
                                            }
                                            dialogCell.bubbleClip.setBounds((int) anonymousClass1.originalAvatarRect.centerX(), (int) anonymousClass1.originalAvatarRect.centerY(), (int) (anonymousClass1.originalAvatarRect.width() / 2.0f));
                                            canvas3.save();
                                            canvas3.clipPath(dialogCell.bubbleClip);
                                            imageReceiver.setImageCoords(anonymousClass1.originalAvatarRect);
                                            imageReceiver.draw(canvas3);
                                            canvas3.restore();
                                        } else if (dialogCell.drawCommunityAvatar) {
                                            DrawableUtils.setBounds(imageReceiver, AndroidUtilities.dpf2(1.0f) + anonymousClass1.originalAvatarRect.centerX(), anonymousClass1.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                                            DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, imageReceiver.getCenterX(), imageReceiver.getCenterY(), AndroidUtilities.dp(48.0f));
                                            imageReceiver.draw(canvas3);
                                        } else {
                                            z9 = dialogCell.isShareToStoryCell;
                                            if (z9) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            anonymousClass1.drawHiddenStoriesAsSegments = z10;
                                            int i413 = anonymousClass1.forceState;
                                            if (z9) {
                                                anonymousClass1.forceState = 1;
                                            }
                                            StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, imageReceiver, anonymousClass1);
                                            if (anonymousClass1.drawnLive) {
                                                dialogCell.checkTtl();
                                            }
                                            anonymousClass1.forceState = i413;
                                        }
                                        if (!dialogCell.insideCommunityList) {
                                            float fCenterX4 = anonymousClass1.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                            float fCenterY4 = anonymousClass1.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                            if (dialogCell.communityArrowDrawable == null) {
                                                dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                                            }
                                            DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX4, fCenterY4, 17);
                                            canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3)));
                                            dialogCell.communityArrowDrawable.draw(canvas3);
                                        }
                                    }
                                    if (dialogCell.animatingArchiveAvatar) {
                                        canvas3.restore();
                                    }
                                    if (imageReceiver.getVisible()) {
                                        z4 = true;
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
                                    if (z) {
                                        canvas3.save();
                                        canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                                        canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.pullProgress) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                        dialogCell2.archivedChatsDrawable.draw(canvas3, false);
                                        canvas3.restore();
                                    }
                                    if (dialogCell2.useSeparator) {
                                        f8 = 0.0f;
                                    } else {
                                        if (dialogCell2.fullSeparator) {
                                            iDp = 0;
                                        } else {
                                            iDp = 0;
                                        }
                                        if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                                            alpha = Theme.dividerPaint.getAlpha();
                                            f25 = dialogCell2.rightFragmentOpenedProgress;
                                            if (f25 != 0.0f) {
                                                Theme.dividerPaint.setAlpha((int) ((1.0f - f25) * alpha));
                                            }
                                            measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                                            if (LocaleController.isRTL) {
                                                canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                                            } else {
                                                canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                                            }
                                            f8 = 0.0f;
                                            if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                                                Theme.dividerPaint.setAlpha(alpha);
                                            }
                                        } else {
                                            f8 = 0.0f;
                                        }
                                    }
                                    if (dialogCell2.clipProgress == f8) {
                                        canvas2 = canvas;
                                    } else if (Build.VERSION.SDK_INT != 24) {
                                        canvas.restore();
                                        canvas2 = canvas;
                                    } else {
                                        Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3));
                                        canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                                        canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                                        canvas2 = canvas;
                                    }
                                    if (z22) {
                                        float f65 = 1.0f - f47;
                                        int measuredHeight5 = (int) (dialogCell2.getMeasuredHeight() * f65);
                                        color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                                        if (dialogCell2.archiveFadeGradientDrawable == null) {
                                            dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                                        }
                                        if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                                            dialogCell2.archiveFadeGradientDrawableColor = color3;
                                            dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                                        }
                                        float fClamp5 = MathUtils.clamp((f65 - 0.05f) * 10.0f, 0.0f, 1.0f);
                                        dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight5, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight5);
                                        dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp5 * 255.0f));
                                        dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                    z7 = dialogCell2.drawReorder;
                                    if (z7) {
                                        if (z7) {
                                            f12 = dialogCell2.reorderIconProgress;
                                            if (f12 < 1.0f) {
                                                f13 = f12 + 0.09411765f;
                                                dialogCell2.reorderIconProgress = f13;
                                                if (f13 > 1.0f) {
                                                    dialogCell2.reorderIconProgress = 1.0f;
                                                }
                                                f10 = 0.0f;
                                            }
                                            f10 = 0.0f;
                                            z8 = z4;
                                        } else {
                                            f9 = dialogCell2.reorderIconProgress;
                                            f10 = 0.0f;
                                            if (f9 > 0.0f) {
                                                f11 = f9 - 0.09411765f;
                                                dialogCell2.reorderIconProgress = f11;
                                                if (f11 < 0.0f) {
                                                    dialogCell2.reorderIconProgress = 0.0f;
                                                }
                                            } else {
                                                z8 = z4;
                                            }
                                        }
                                        z8 = true;
                                    } else {
                                        if (z7) {
                                            f12 = dialogCell2.reorderIconProgress;
                                            if (f12 < 1.0f) {
                                                f13 = f12 + 0.09411765f;
                                                dialogCell2.reorderIconProgress = f13;
                                                if (f13 > 1.0f) {
                                                    dialogCell2.reorderIconProgress = 1.0f;
                                                }
                                                f10 = 0.0f;
                                            }
                                            f10 = 0.0f;
                                            z8 = z4;
                                        } else {
                                            f9 = dialogCell2.reorderIconProgress;
                                            f10 = 0.0f;
                                            if (f9 > 0.0f) {
                                                f11 = f9 - 0.09411765f;
                                                dialogCell2.reorderIconProgress = f11;
                                                if (f11 < 0.0f) {
                                                    dialogCell2.reorderIconProgress = 0.0f;
                                                }
                                            } else {
                                                z8 = z4;
                                            }
                                        }
                                        z8 = true;
                                    }
                                    if (dialogCell2.archiveHidden) {
                                        f23 = dialogCell2.archiveBackgroundProgress;
                                        if (f23 > f10) {
                                            f24 = f23 - 0.069565214f;
                                            dialogCell2.archiveBackgroundProgress = f24;
                                            if (f24 < f10) {
                                                dialogCell2.archiveBackgroundProgress = f10;
                                            }
                                            avatarDrawable2 = dialogCell2.avatarDrawable;
                                            if (avatarDrawable2.avatarType == 2) {
                                                avatarDrawable2.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                                            }
                                            z8 = true;
                                        }
                                    } else {
                                        f14 = dialogCell2.archiveBackgroundProgress;
                                        if (f14 < 1.0f) {
                                            f15 = f14 + 0.069565214f;
                                            dialogCell2.archiveBackgroundProgress = f15;
                                            if (f15 > 1.0f) {
                                                dialogCell2.archiveBackgroundProgress = 1.0f;
                                            }
                                            avatarDrawable = dialogCell2.avatarDrawable;
                                            if (avatarDrawable.avatarType == 2) {
                                                avatarDrawable.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                                            }
                                            z8 = true;
                                        }
                                    }
                                    if (dialogCell2.animatingArchiveAvatar) {
                                        f22 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                        dialogCell2.animatingArchiveAvatarProgress = f22;
                                        if (f22 >= 170.0f) {
                                            dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                                            dialogCell2.animatingArchiveAvatar = false;
                                        }
                                        z8 = true;
                                    }
                                    if (dialogCell2.drawRevealBackground) {
                                        f18 = dialogCell2.currentRevealBounceProgress;
                                        if (f18 < 1.0f) {
                                            f21 = f18 + 0.09411765f;
                                            dialogCell2.currentRevealBounceProgress = f21;
                                            if (f21 > 1.0f) {
                                                dialogCell2.currentRevealBounceProgress = 1.0f;
                                                z8 = true;
                                            }
                                        }
                                        f19 = dialogCell2.currentRevealProgress;
                                        if (f19 < 1.0f) {
                                            f20 = f19 + 0.053333335f;
                                            dialogCell2.currentRevealProgress = f20;
                                            if (f20 > 1.0f) {
                                                dialogCell2.currentRevealProgress = 1.0f;
                                            }
                                            z8 = true;
                                        }
                                    } else {
                                        if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                            dialogCell2.currentRevealBounceProgress = 0.0f;
                                            z8 = true;
                                        }
                                        f16 = dialogCell2.currentRevealProgress;
                                        if (f16 > 0.0f) {
                                            f17 = f16 - 0.053333335f;
                                            dialogCell2.currentRevealProgress = f17;
                                            if (f17 < 0.0f) {
                                                dialogCell2.currentRevealProgress = 0.0f;
                                            }
                                            z8 = true;
                                        }
                                    }
                                    if (z3) {
                                        i7 = 0;
                                    } else {
                                        i7 = 4;
                                    }
                                    anonymousClass4.setVisibility(i7);
                                    if (z8) {
                                        dialogCell2.invalidate();
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                f43 = fDp5;
                            }
                        }
                        dialogCell4.messageLayout.getPaint().setAlpha(i26);
                        canvas3.restore();
                    } else {
                        f43 = fDp5;
                        rectF = rectF5;
                    }
                    canvas3.save();
                    if (dialogUpdateHelper.typingOutToTop) {
                        fM = DiffUtil.m(1.0f, dialogUpdateHelper.typingProgres, f43, dialogCell4.messageTop);
                    } else {
                        fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper.typingProgres, f43, dialogCell4.messageTop);
                    }
                    if (((z11 && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                        if (dialogCell4.isForumCell()) {
                            f45 = 10.0f;
                        } else {
                            f45 = 11.0f;
                        }
                        fM -= AndroidUtilities.dp(f45);
                    }
                    canvas3.translate(dialogCell4.typingLeft, fM);
                    staticLayout2 = dialogCell4.typingLayout;
                    if (staticLayout2 != null && dialogUpdateHelper.typingProgres > 0.0f) {
                        int alpha5 = staticLayout2.getPaint().getAlpha();
                        dialogCell4.typingLayout.getPaint().setAlpha((int) (alpha5 * dialogUpdateHelper.typingProgres));
                        dialogCell4.typingLayout.draw(canvas3);
                        dialogCell4.typingLayout.getPaint().setAlpha(alpha5);
                    }
                    canvas3.restore();
                    if (dialogCell4.typingLayout != null && ((i25 = dialogCell4.printingStringType) >= 0 || (dialogUpdateHelper.typingProgres > 0.0f && dialogUpdateHelper.lastKnownTypingType >= 0))) {
                        if (i25 < 0) {
                            i25 = dialogUpdateHelper.lastKnownTypingType;
                        }
                        chatStatusDrawable = Theme.getChatStatusDrawable(i25);
                        if (chatStatusDrawable != null) {
                            canvas3.save();
                            int color16 = Theme.getColor(Theme.key_chats_actionMessage);
                            chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(color16, (int) (Color.alpha(color16) * dialogUpdateHelper.typingProgres)));
                            if (dialogUpdateHelper.typingOutToTop) {
                                fM2 = DiffUtil.m(1.0f, dialogUpdateHelper.typingProgres, f43, dialogCell4.messageTop);
                            } else {
                                fM2 = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, dialogUpdateHelper.typingProgres, f43, dialogCell4.messageTop);
                            }
                            if (((z11 && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                                if (dialogCell4.isForumCell()) {
                                    f44 = 10.0f;
                                } else {
                                    f44 = 11.0f;
                                }
                                fM2 -= AndroidUtilities.dp(f44);
                            }
                            if (i25 != 1 || i25 == 4) {
                                float f510 = dialogCell4.statusDrawableLeft;
                                if (i25 == 1) {
                                    iDp4 = AndroidUtilities.dp(1.0f);
                                } else {
                                    iDp4 = 0;
                                }
                                canvas3.translate(f510, fM2 + iDp4);
                            } else {
                                canvas3.translate(dialogCell4.statusDrawableLeft, ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / f) + fM2);
                            }
                            chatStatusDrawable.draw(canvas3);
                            dialogCell4.invalidate();
                            canvas3.restore();
                        }
                    }
                } else {
                    rectF = rectF5;
                }
                if (dialogCell4.buttonLayout != null) {
                    canvas3.save();
                    if (dialogCell4.buttonBackgroundPaint == null) {
                        dialogCell4.buttonBackgroundPaint = new Paint(1);
                    }
                    if (dialogCell4.canvasButton == null) {
                        CanvasButton canvasButton4 = new CanvasButton(dialogCell4);
                        dialogCell4.canvasButton = canvasButton4;
                        final int i311 = 0;
                        canvasButton4.setDelegate(new Runnable(dialogCell4) {
                            public final DialogCell f$0;

                            {
                                this.f$0 = dialogCell4;
                            }

                            @Override
                            public final void run() {
                                switch (i311) {
                                    case 0:
                                        DialogCell dialogCell5 = this.f$0;
                                        DialogCell.DialogCellDelegate dialogCellDelegate = dialogCell5.delegate;
                                        if (dialogCellDelegate != null) {
                                            dialogCellDelegate.onButtonClicked(dialogCell5);
                                        }
                                        break;
                                    default:
                                        DialogCell dialogCell6 = this.f$0;
                                        DialogCell.DialogCellDelegate dialogCellDelegate2 = dialogCell6.delegate;
                                        if (dialogCellDelegate2 != null) {
                                            dialogCellDelegate2.onButtonLongPress(dialogCell6);
                                        }
                                        break;
                                }
                            }
                        });
                        final int i312 = 1;
                        dialogCell4.canvasButton.setLongPress(new Runnable(dialogCell4) {
                            public final DialogCell f$0;

                            {
                                this.f$0 = dialogCell4;
                            }

                            @Override
                            public final void run() {
                                switch (i312) {
                                    case 0:
                                        DialogCell dialogCell5 = this.f$0;
                                        DialogCell.DialogCellDelegate dialogCellDelegate = dialogCell5.delegate;
                                        if (dialogCellDelegate != null) {
                                            dialogCellDelegate.onButtonClicked(dialogCell5);
                                        }
                                        break;
                                    default:
                                        DialogCell dialogCell6 = this.f$0;
                                        DialogCell.DialogCellDelegate dialogCellDelegate2 = dialogCell6.delegate;
                                        if (dialogCellDelegate2 != null) {
                                            dialogCellDelegate2.onButtonLongPress(dialogCell6);
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (dialogCell4.lastTopicMessageUnread && dialogCell4.topMessageTopicEndIndex != 0 && ((i22 = dialogCell4.dialogsType) == 0 || i22 == 7 || i22 == 8)) {
                        CanvasButton canvasButton5 = dialogCell4.canvasButton;
                        int color17 = dialogCell4.currentMessagePaint.getColor();
                        if (Theme.isCurrentThemeDark()) {
                            i23 = 36;
                        } else {
                            i23 = 26;
                        }
                        canvasButton5.setColor(ColorUtils.setAlphaComponent(color17, i23));
                        dialogCell4.canvasButton.rewind();
                        i24 = dialogCell4.topMessageTopicEndIndex;
                        if (i24 != 0 && i24 > 0) {
                            float fDp10 = dialogCell4.messageTop;
                            if (((z11 && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                            }
                            rectF4 = AndroidUtilities.rectTmp;
                            float primaryHorizontal2 = dialogCell4.messageLayout.getPrimaryHorizontal(0) + AndroidUtilities.dp(f) + dialogCell4.messageLeft;
                            float f511 = dialogCell4.messageLeft;
                            StaticLayout staticLayout10 = dialogCell4.messageLayout;
                            rectF4.set(primaryHorizontal2, fDp10, (staticLayout10.getPrimaryHorizontal(Math.min(staticLayout10.getText().length(), dialogCell4.topMessageTopicEndIndex)) + f511) - AndroidUtilities.dp(3.0f), dialogCell4.buttonTop - AndroidUtilities.dp(4.0f));
                            rectF4.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                            if (rectF4.right > rectF4.left) {
                                dialogCell4.canvasButton.addRect(rectF4);
                            }
                        }
                        float lineLeft2 = dialogCell4.buttonLayout.getLineLeft(0);
                        RectF rectF9 = AndroidUtilities.rectTmp;
                        rectF9.set(dialogCell4.buttonLeft + lineLeft2 + AndroidUtilities.dp(f), AndroidUtilities.dp(f) + dialogCell4.buttonTop, dialogCell4.buttonLayout.getLineWidth(0) + dialogCell4.buttonLeft + lineLeft2 + AndroidUtilities.dp(12.0f), dialogCell4.buttonLayout.getHeight() + dialogCell4.buttonTop);
                        rectF9.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                        dialogCell4.canvasButton.addRect(rectF9);
                        CanvasButton canvasButton6 = dialogCell4.canvasButton;
                        canvasButton6.drawInternal(canvas3, canvasButton6.paint);
                        rippleDrawableSafe = canvasButton6.selectorDrawable;
                        if (rippleDrawableSafe != null) {
                            rippleDrawableSafe.draw(canvas3);
                        }
                        Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                        BaseCell.setDrawableBounds(Theme.dialogs_forum_arrowDrawable, rectF9.right - AndroidUtilities.dp(18.0f), ImageReceiver$$ExternalSyntheticOutline0.m(rectF9.height(), Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight(), 2.0f, rectF9.top));
                        Theme.dialogs_forum_arrowDrawable.draw(canvas3);
                    }
                    canvas3.translate(dialogCell4.buttonLeft, dialogCell4.buttonTop);
                    arrayList = dialogCell4.spoilers2;
                    if (arrayList.isEmpty()) {
                        canvas3.save();
                        SpoilerEffect.clipOutCanvas(canvas3, arrayList);
                        SpoilerEffect.layoutDrawMaybe(canvas3, dialogCell4.buttonLayout);
                        StaticLayout staticLayout11 = dialogCell4.buttonLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout11, dialogCell4.animatedEmojiStack3, -0.075f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter$1(3, staticLayout11.getPaint().getColor()));
                        canvas3.restore();
                        while (i21 < arrayList.size()) {
                            SpoilerEffect spoilerEffect3 = (SpoilerEffect) arrayList.get(i21);
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
                    boolean z210 = dialogCell4.drawClock;
                    if (dialogCell4.drawCheck1) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    int i313 = (z210 ? 1 : 0) + i14;
                    if (dialogCell4.drawCheck2) {
                        i15 = 4;
                    } else {
                        i15 = 0;
                    }
                    i16 = i313 + i15;
                    i17 = dialogCell4.lastStatusDrawableParams;
                    if (i17 >= 0 && i17 != i16 && !dialogCell4.statusDrawableAnimationInProgress) {
                        dialogCell4.createStatusDrawableAnimator(i17, i16);
                    }
                    z14 = dialogCell4.statusDrawableAnimationInProgress;
                    if (z14) {
                        i16 = dialogCell4.animateToStatusDrawableParams;
                    }
                    if ((i16 & 1) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i16 & 2) != 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i16 & 4) != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z14) {
                        i20 = dialogCell4.animateFromStatusDrawableParams;
                        if ((i20 & 1) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if ((i20 & 2) != 0) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i20 & 4) != 0) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (!z15 || z18 || !z20 || z19 || !z16 || z17 == 0) {
                            boolean z211 = z18;
                            canvas3 = canvas;
                            dialogCell4.drawCheckStatus(canvas3, z211, z19, z20, false, 1.0f - dialogCell4.statusDrawableProgress);
                            dialogCell4.drawCheckStatus(canvas3, z15, z16, z17, false, dialogCell4.statusDrawableProgress);
                            dialogCell3 = this;
                        } else {
                            canvas3 = canvas;
                            dialogCell4.drawCheckStatus(canvas3, z15, z16, z17, true, dialogCell4.statusDrawableProgress);
                        }
                        boolean z212 = dialogCell3.drawClock;
                        if (dialogCell3.drawCheck1) {
                            i18 = 2;
                        } else {
                            i18 = 0;
                        }
                        int i314 = (z212 ? 1 : 0) + i18;
                        if (dialogCell3.drawCheck2) {
                            i19 = 4;
                        } else {
                            i19 = 0;
                        }
                        dialogCell3.lastStatusDrawableParams = i314 + i19;
                    } else {
                        dialogCell4 = this;
                        canvas3 = canvas;
                        dialogCell4.drawCheckStatus(canvas3, z15, z16, z17, false, 1.0f);
                    }
                    dialogCell3 = dialogCell4;
                    boolean z213 = dialogCell3.drawClock;
                    if (dialogCell3.drawCheck1) {
                        i18 = 2;
                    } else {
                        i18 = 0;
                    }
                    int i315 = (z213 ? 1 : 0) + i18;
                    if (dialogCell3.drawCheck2) {
                        i19 = 4;
                    } else {
                        i19 = 0;
                    }
                    dialogCell3.lastStatusDrawableParams = i315 + i19;
                } else {
                    canvas3 = canvas;
                    dialogCell3 = dialogCell4;
                }
                f27 = 12.5f;
                if (dialogCell3.drawBotVerified) {
                    if (z11 || SharedConfig.useThreeLinesLayout) {
                        f42 = 12.5f;
                    } else {
                        f42 = 15.5f;
                    }
                    iDp3 = AndroidUtilities.dp(f42);
                    if (((z11 && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    swapAnimatedEmojiDrawable2 = dialogCell3.botVerification;
                    if (swapAnimatedEmojiDrawable2 != null) {
                        swapAnimatedEmojiDrawable2.setBounds(dialogCell3.nameLeft - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + iDp3, dialogCell3.nameLeft - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f) + iDp3);
                        zzli.m(Theme.key_chats_verifiedBackground, resourcesProvider3, swapAnimatedEmojiDrawable2);
                        swapAnimatedEmojiDrawable2.draw(canvas3);
                    }
                }
                if (dialogCell3.drawUnmute || dialogCell3.dialogMuted || dialogCell3.isHiddenInCommunity) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (dialogCell3.dialogsType != 2 && ((z12 || dialogCell3.dialogMutedProgress > 0.0f) && !dialogCell3.drawVerified && dialogCell3.drawScam == 0)) {
                    if (z12) {
                        f40 = dialogCell3.dialogMutedProgress;
                        if (f40 != 1.0f) {
                            f41 = f40 + 0.10666667f;
                            dialogCell3.dialogMutedProgress = f41;
                            if (f41 > 1.0f) {
                                dialogCell3.dialogMutedProgress = 1.0f;
                            } else {
                                dialogCell3.invalidate();
                            }
                        } else if (!z12) {
                            f35 = dialogCell3.dialogMutedProgress;
                            if (f35 != 0.0f) {
                                f36 = f35 - 0.10666667f;
                                dialogCell3.dialogMutedProgress = f36;
                                if (f36 < 0.0f) {
                                    dialogCell3.dialogMutedProgress = 0.0f;
                                } else {
                                    dialogCell3.invalidate();
                                }
                            }
                        }
                    } else if (!z12) {
                        f35 = dialogCell3.dialogMutedProgress;
                        if (f35 != 0.0f) {
                            f36 = f35 - 0.10666667f;
                            dialogCell3.dialogMutedProgress = f36;
                            if (f36 < 0.0f) {
                                dialogCell3.dialogMutedProgress = 0.0f;
                            } else {
                                dialogCell3.invalidate();
                            }
                        }
                    }
                    if (dialogCell3.drawPremium) {
                        i13 = dialogCell3.nameMutedIconLeft;
                    } else {
                        i13 = dialogCell3.nameMuteLeft;
                    }
                    if (z11 || SharedConfig.useThreeLinesLayout) {
                        f37 = 0.0f;
                    } else {
                        f37 = 1.0f;
                    }
                    float fDp11 = i13 - AndroidUtilities.dp(f37);
                    if (SharedConfig.useThreeLinesLayout) {
                        f38 = 13.5f;
                    } else {
                        f38 = 17.5f;
                    }
                    fDp2 = AndroidUtilities.dp(f38);
                    if (((z11 && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                        if (dialogCell3.isForumCell()) {
                            f39 = 8.0f;
                        } else {
                            f39 = 9.0f;
                        }
                        fDp2 -= AndroidUtilities.dp(f39);
                    }
                    BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, fDp11, fDp2);
                    BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, fDp11, fDp2);
                    DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                    if (dialogCell3.dialogMutedProgress != 1.0f) {
                        canvas3.save();
                        float f512 = dialogCell3.dialogMutedProgress;
                        canvas3.scale(f512, f512, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
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
                    if (z11 || SharedConfig.useThreeLinesLayout) {
                        f34 = 13.5f;
                    } else {
                        f34 = 16.5f;
                    }
                    float fDp12 = AndroidUtilities.dp(f34);
                    if (((z11 && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp12);
                    BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), fDp12);
                    Theme.dialogs_verifiedDrawable.draw(canvas3);
                    Theme.dialogs_verifiedCheckDrawable.draw(canvas3);
                    anonymousClass4 = anonymousClass5;
                } else if (dialogCell3.drawPremium) {
                    if (z11 || SharedConfig.useThreeLinesLayout) {
                        f29 = 12.5f;
                    } else {
                        f29 = 15.5f;
                    }
                    iDp2 = AndroidUtilities.dp(f29);
                    if (((z11 && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    }
                    swapAnimatedEmojiDrawable = dialogCell3.emojiStatus;
                    if (swapAnimatedEmojiDrawable != null) {
                        anonymousClass4 = anonymousClass5;
                        anonymousClass4.setTranslationX((f50 + dialogCell3.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                        anonymousClass4.setTranslationY((f7 + iDp2) - AndroidUtilities.dp(4.0f));
                        if (dialogCell3.rightFragmentOpenedProgress > 0.0f) {
                            swapAnimatedEmojiDrawable.setBounds(dialogCell3.nameMuteLeft - AndroidUtilities.dp(2.0f), iDp2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(20.0f) + dialogCell3.nameMuteLeft, AndroidUtilities.dp(22.0f) + (iDp2 - AndroidUtilities.dp(4.0f)));
                            swapAnimatedEmojiDrawable.draw(canvas3);
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        zzli.m(Theme.key_chats_verifiedBackground, resourcesProvider3, swapAnimatedEmojiDrawable);
                        z3 = z13;
                    } else {
                        anonymousClass4 = anonymousClass5;
                        Drawable drawable7 = PremiumGradient.getInstance().premiumStarDrawableMini;
                        int iDp10 = dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f);
                        if (!z11 && !SharedConfig.useThreeLinesLayout) {
                            f27 = 15.5f;
                        }
                        BaseCell.setDrawableBounds(iDp10, AndroidUtilities.dp(f27), drawable7);
                        drawable7.draw(canvas3);
                    }
                    if (dialogCell3.drawReorder || dialogCell3.reorderIconProgress != 0.0f) {
                        if (!LocaleController.isRTL) {
                            Paint paintReorderGradient5 = dialogCell3.getPaintReorderGradient();
                            paintReorderGradient5.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                            canvas3.save();
                            canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(f26), dialogCell3.pinTop);
                            canvas.drawRect(0.0f, 0.0f, RichMessageLayout$$ExternalSyntheticOutline1.m(dialogCell3.pinLeft, 24.0f, dialogCell3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient5);
                            canvas3 = canvas;
                            canvas3.restore();
                        }
                        Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(dialogCell3.pinLeft, dialogCell3.pinTop, Theme.dialogs_reorderDrawable);
                        Theme.dialogs_reorderDrawable.draw(canvas3);
                    }
                    f30 = dialogCell3.animatorPollVotesMentionVisible.floatValue;
                    if (dialogCell3.drawError) {
                        Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                        int i414 = dialogCell3.errorLeft;
                        RectF rectF10 = rectF;
                        rectF10.set(i414, dialogCell3.errorTop, AndroidUtilities.dp(20.666f) + i414, AndroidUtilities.dp(20.666f) + dialogCell3.errorTop);
                        float f66 = AndroidUtilities.density * 10.5f;
                        canvas3.drawRoundRect(rectF10, f66, f66, Theme.dialogs_errorPaint);
                        BaseCell.setDrawableBounds(AndroidUtilities.dp(4.5f) + dialogCell3.errorLeft, AndroidUtilities.dp(5.0f) + dialogCell3.errorTop, Theme.dialogs_errorDrawable);
                        Theme.dialogs_errorDrawable.draw(canvas3);
                    } else {
                        rectF2 = rectF;
                        if (((!dialogCell3.drawCount || dialogCell3.drawMention) && dialogCell3.drawCount2) || dialogCell3.countChangeProgress != 1.0f || dialogCell3.drawReactionMention || dialogCell3.reactionsMentionsChangeProgress != 1.0f || dialogCell3.drawPollVotesMention || f30 > 0.0f) {
                            zIsCounterMuted = dialogCell3.isCounterMuted();
                            canvas3 = canvas;
                            drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                            dialogCell = this;
                            if (dialogCell.drawMention) {
                                Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                if (dialogCell.mentionLayout != null) {
                                    int i316 = dialogCell.mentionLeft;
                                    rectF2.set(i316, dialogCell.countTop, AndroidUtilities.dp(12.666f) + i316 + dialogCell.mentionWidth, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                    if (zIsCounterMuted || dialogCell.folderId == 0) {
                                        paint = Theme.dialogs_countPaint;
                                    } else {
                                        paint = Theme.dialogs_countGrayPaint;
                                    }
                                    canvas3.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
                                    Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                    canvas3.save();
                                    canvas3.translate(AndroidUtilities.dp(6.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(4.0f) + dialogCell.countTop);
                                    dialogCell.mentionLayout.draw(canvas3);
                                    canvas3.restore();
                                } else {
                                    Drawable drawable8 = Theme.dialogs_mentionDrawable;
                                    drawable8.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                    DrawableUtils.setBounds(drawable8, AndroidUtilities.dp(10.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                    drawable8.draw(canvas3);
                                }
                            }
                            if (dialogCell.drawReactionMention || dialogCell.reactionsMentionsChangeProgress != 1.0f) {
                                int i415 = dialogCell.reactionMentionLeft;
                                rectF2.set(i415, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i415, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                f31 = dialogCell.reactionsMentionsChangeProgress;
                                if (f31 == 1.0f) {
                                    f31 = 1.0f;
                                } else if (!dialogCell.drawReactionMention) {
                                    f31 = 1.0f - f31;
                                }
                                if (zIsCounterMuted) {
                                    drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                } else {
                                    drawable = Theme.dialogs_reactionsMentionDrawable;
                                }
                                drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i415, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                DrawableUtils.drawWithScale(canvas3, drawable, f31);
                            }
                            if ((dialogCell.drawPollVotesMention || f30 > 0.0f) && f30 != 0.0f) {
                                int i416 = dialogCell.pollVotesMentionLeft;
                                rectF2.set(i416, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i416, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                                if (zIsCounterMuted) {
                                    drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                } else {
                                    drawable2 = Theme.dialogs_pollMentionDrawable;
                                }
                                drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i416, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                                DrawableUtils.drawWithScale(canvas3, drawable2, f30);
                            }
                        } else {
                            if (dialogCell3.openBot) {
                                canvas3.save();
                                float scale = dialogCell3.openButtonBounce.getScale(0.05f);
                                RectF rectF11 = dialogCell3.openButtonRect;
                                canvas3.scale(scale, scale, rectF11.centerX(), rectF11.centerY());
                                dialogCell3.openButtonBackgroundPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider3));
                                canvas3.drawRoundRect(rectF11, rectF11.height() / 2.0f, rectF11.height() / 2.0f, dialogCell3.openButtonBackgroundPaint);
                                Text text = dialogCell3.openButtonText;
                                if (text != null) {
                                    text.draw(rectF11.left + AndroidUtilities.dp(13.0f), rectF11.centerY(), 1.0f, Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider3), canvas);
                                }
                                canvas.restore();
                            }
                            canvas3 = canvas;
                        }
                        if (dialogCell.thumbsCount > 0) {
                            f32 = dialogUpdateHelper.typingProgres;
                            if (f32 != 1.0f) {
                                if (f32 > 0.0f) {
                                    canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f32) * 255.0f), 31);
                                    canvas3 = canvas;
                                    if (dialogUpdateHelper.typingOutToTop) {
                                        fDp = -AndroidUtilities.dp(14.0f);
                                        f33 = dialogUpdateHelper.typingProgres;
                                    } else {
                                        fDp = AndroidUtilities.dp(14.0f);
                                        f33 = dialogUpdateHelper.typingProgres;
                                    }
                                    canvas3.translate(0.0f, fDp * f33);
                                }
                                i12 = 0;
                                while (i12 < dialogCell.thumbsCount) {
                                    if (dialogCell.thumbImageSeen[i12]) {
                                        if (dialogCell.thumbBackgroundPaint == null) {
                                            Paint paint12 = new Paint(1);
                                            dialogCell.thumbBackgroundPaint = paint12;
                                            paint12.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                            dialogCell.thumbBackgroundPaint.setColor(0);
                                        }
                                        rectF3 = AndroidUtilities.rectTmp;
                                        imageReceiverArr = dialogCell.thumbImage;
                                        rectF3.set(imageReceiverArr[i12].getImageX(), imageReceiverArr[i12].getImageY(), imageReceiverArr[i12].getImageX2(), imageReceiverArr[i12].getImageY2());
                                        imageReceiverArr[i12].draw(canvas3);
                                        if (dialogCell.drawSpoiler[i12]) {
                                            path = dialogCell.thumbPath;
                                            if (path == null) {
                                                dialogCell.thumbPath = new Path();
                                            } else {
                                                path.rewind();
                                            }
                                            dialogCell.thumbPath.addRoundRect(rectF3, imageReceiverArr[i12].getRoundRadius()[0], imageReceiverArr[i12].getRoundRadius()[1], Path.Direction.CW);
                                            canvas3.save();
                                            canvas3.clipPath(dialogCell.thumbPath);
                                            if (dialogCell.thumbSpoiler == null) {
                                                dialogCell.thumbSpoiler = new SpoilerEffect();
                                            }
                                            dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i10) * 0.325f)));
                                            dialogCell.thumbSpoiler.setBounds((int) imageReceiverArr[i12].getImageX(), (int) imageReceiverArr[i12].getImageY(), (int) imageReceiverArr[i12].getImageX2(), (int) imageReceiverArr[i12].getImageY2());
                                            dialogCell.thumbSpoiler.draw(canvas3);
                                            dialogCell.invalidate();
                                            canvas3.restore();
                                        }
                                        if (dialogCell.drawPlay[i12]) {
                                            BaseCell.setDrawableBounds((int) (imageReceiverArr[i12].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i12].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)), Theme.dialogs_playDrawable);
                                            Theme.dialogs_playDrawable.draw(canvas3);
                                        }
                                    }
                                    i12++;
                                    i10 = -1;
                                }
                                if (dialogUpdateHelper.typingProgres > 0.0f) {
                                    canvas3.restore();
                                }
                            }
                        }
                        dialogCellTags = dialogCell.tags;
                        if (dialogCellTags != null && !dialogCellTags.tags.isEmpty()) {
                            canvas3.save();
                            canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                            dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                            canvas3.restore();
                        }
                        i11 = i9;
                        if (i11 != -1) {
                            canvas3.restoreToCount(i11);
                        }
                    }
                    dialogCell = dialogCell3;
                    if (dialogCell.thumbsCount > 0) {
                        f32 = dialogUpdateHelper.typingProgres;
                        if (f32 != 1.0f) {
                            if (f32 > 0.0f) {
                                canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f32) * 255.0f), 31);
                                canvas3 = canvas;
                                if (dialogUpdateHelper.typingOutToTop) {
                                    fDp = -AndroidUtilities.dp(14.0f);
                                    f33 = dialogUpdateHelper.typingProgres;
                                } else {
                                    fDp = AndroidUtilities.dp(14.0f);
                                    f33 = dialogUpdateHelper.typingProgres;
                                }
                                canvas3.translate(0.0f, fDp * f33);
                            }
                            i12 = 0;
                            while (i12 < dialogCell.thumbsCount) {
                                if (dialogCell.thumbImageSeen[i12]) {
                                    if (dialogCell.thumbBackgroundPaint == null) {
                                        Paint paint13 = new Paint(1);
                                        dialogCell.thumbBackgroundPaint = paint13;
                                        paint13.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                        dialogCell.thumbBackgroundPaint.setColor(0);
                                    }
                                    rectF3 = AndroidUtilities.rectTmp;
                                    imageReceiverArr = dialogCell.thumbImage;
                                    rectF3.set(imageReceiverArr[i12].getImageX(), imageReceiverArr[i12].getImageY(), imageReceiverArr[i12].getImageX2(), imageReceiverArr[i12].getImageY2());
                                    imageReceiverArr[i12].draw(canvas3);
                                    if (dialogCell.drawSpoiler[i12]) {
                                        path = dialogCell.thumbPath;
                                        if (path == null) {
                                            dialogCell.thumbPath = new Path();
                                        } else {
                                            path.rewind();
                                        }
                                        dialogCell.thumbPath.addRoundRect(rectF3, imageReceiverArr[i12].getRoundRadius()[0], imageReceiverArr[i12].getRoundRadius()[1], Path.Direction.CW);
                                        canvas3.save();
                                        canvas3.clipPath(dialogCell.thumbPath);
                                        if (dialogCell.thumbSpoiler == null) {
                                            dialogCell.thumbSpoiler = new SpoilerEffect();
                                        }
                                        dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i10) * 0.325f)));
                                        dialogCell.thumbSpoiler.setBounds((int) imageReceiverArr[i12].getImageX(), (int) imageReceiverArr[i12].getImageY(), (int) imageReceiverArr[i12].getImageX2(), (int) imageReceiverArr[i12].getImageY2());
                                        dialogCell.thumbSpoiler.draw(canvas3);
                                        dialogCell.invalidate();
                                        canvas3.restore();
                                    }
                                    if (dialogCell.drawPlay[i12]) {
                                        BaseCell.setDrawableBounds((int) (imageReceiverArr[i12].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i12].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)), Theme.dialogs_playDrawable);
                                        Theme.dialogs_playDrawable.draw(canvas3);
                                    }
                                }
                                i12++;
                                i10 = -1;
                            }
                            if (dialogUpdateHelper.typingProgres > 0.0f) {
                                canvas3.restore();
                            }
                        }
                    }
                    dialogCellTags = dialogCell.tags;
                    if (dialogCellTags != null) {
                        canvas3.save();
                        canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                        dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                        canvas3.restore();
                    }
                    i11 = i9;
                    if (i11 != -1) {
                        canvas3.restoreToCount(i11);
                    }
                } else {
                    anonymousClass4 = anonymousClass5;
                    if (dialogCell3.drawScam != 0) {
                        if (z11 || SharedConfig.useThreeLinesLayout) {
                            f28 = 12.0f;
                        } else {
                            f28 = 15.0f;
                        }
                        int iDp11 = AndroidUtilities.dp(f28);
                        if (((z11 && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                        }
                        if (dialogCell3.drawScam == 1) {
                            scamDrawable = Theme.dialogs_scamDrawable;
                        } else {
                            scamDrawable = Theme.dialogs_fakeDrawable;
                        }
                        BaseCell.setDrawableBounds(dialogCell3.nameMuteLeft, iDp11, scamDrawable);
                        if (dialogCell3.drawScam == 1) {
                            scamDrawable2 = Theme.dialogs_scamDrawable;
                        } else {
                            scamDrawable2 = Theme.dialogs_fakeDrawable;
                        }
                        scamDrawable2.draw(canvas3);
                    }
                }
                z3 = false;
                if (dialogCell3.drawReorder) {
                    if (!LocaleController.isRTL) {
                        Paint paintReorderGradient6 = dialogCell3.getPaintReorderGradient();
                        paintReorderGradient6.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                        canvas3.save();
                        canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(f26), dialogCell3.pinTop);
                        canvas.drawRect(0.0f, 0.0f, RichMessageLayout$$ExternalSyntheticOutline1.m(dialogCell3.pinLeft, 24.0f, dialogCell3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient6);
                        canvas3 = canvas;
                        canvas3.restore();
                    }
                    Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                    BaseCell.setDrawableBounds(dialogCell3.pinLeft, dialogCell3.pinTop, Theme.dialogs_reorderDrawable);
                    Theme.dialogs_reorderDrawable.draw(canvas3);
                } else {
                    if (!LocaleController.isRTL) {
                        Paint paintReorderGradient7 = dialogCell3.getPaintReorderGradient();
                        paintReorderGradient7.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                        canvas3.save();
                        canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(f26), dialogCell3.pinTop);
                        canvas.drawRect(0.0f, 0.0f, RichMessageLayout$$ExternalSyntheticOutline1.m(dialogCell3.pinLeft, 24.0f, dialogCell3.getMeasuredWidth()), AndroidUtilities.dp(24.0f), paintReorderGradient7);
                        canvas3 = canvas;
                        canvas3.restore();
                    }
                    Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                    BaseCell.setDrawableBounds(dialogCell3.pinLeft, dialogCell3.pinTop, Theme.dialogs_reorderDrawable);
                    Theme.dialogs_reorderDrawable.draw(canvas3);
                }
                f30 = dialogCell3.animatorPollVotesMentionVisible.floatValue;
                if (dialogCell3.drawError) {
                    Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                    int i417 = dialogCell3.errorLeft;
                    RectF rectF12 = rectF;
                    rectF12.set(i417, dialogCell3.errorTop, AndroidUtilities.dp(20.666f) + i417, AndroidUtilities.dp(20.666f) + dialogCell3.errorTop);
                    float f67 = AndroidUtilities.density * 10.5f;
                    canvas3.drawRoundRect(rectF12, f67, f67, Theme.dialogs_errorPaint);
                    BaseCell.setDrawableBounds(AndroidUtilities.dp(4.5f) + dialogCell3.errorLeft, AndroidUtilities.dp(5.0f) + dialogCell3.errorTop, Theme.dialogs_errorDrawable);
                    Theme.dialogs_errorDrawable.draw(canvas3);
                } else {
                    rectF2 = rectF;
                    if (dialogCell3.drawCount) {
                    }
                    zIsCounterMuted = dialogCell3.isCounterMuted();
                    canvas3 = canvas;
                    drawCounter(canvas3, zIsCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                    dialogCell = this;
                    if (dialogCell.drawMention) {
                        Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        if (dialogCell.mentionLayout != null) {
                            int i317 = dialogCell.mentionLeft;
                            rectF2.set(i317, dialogCell.countTop, AndroidUtilities.dp(12.666f) + i317 + dialogCell.mentionWidth, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                            if (zIsCounterMuted) {
                                paint = Theme.dialogs_countPaint;
                            } else {
                                paint = Theme.dialogs_countPaint;
                            }
                            canvas3.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
                            Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                            canvas3.save();
                            canvas3.translate(AndroidUtilities.dp(6.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(4.0f) + dialogCell.countTop);
                            dialogCell.mentionLayout.draw(canvas3);
                            canvas3.restore();
                        } else {
                            Drawable drawable9 = Theme.dialogs_mentionDrawable;
                            drawable9.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                            DrawableUtils.setBounds(drawable9, AndroidUtilities.dp(10.333f) + dialogCell.mentionLeft, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                            drawable9.draw(canvas3);
                        }
                    }
                    if (dialogCell.drawReactionMention) {
                        int i418 = dialogCell.reactionMentionLeft;
                        rectF2.set(i418, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i418, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                        f31 = dialogCell.reactionsMentionsChangeProgress;
                        if (f31 == 1.0f) {
                            f31 = 1.0f;
                        } else if (!dialogCell.drawReactionMention) {
                            f31 = 1.0f - f31;
                        }
                        if (zIsCounterMuted) {
                            drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                        } else {
                            drawable = Theme.dialogs_reactionsMentionDrawable;
                        }
                        drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i418, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                        DrawableUtils.drawWithScale(canvas3, drawable, f31);
                    } else {
                        int i419 = dialogCell.reactionMentionLeft;
                        rectF2.set(i419, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i419, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                        f31 = dialogCell.reactionsMentionsChangeProgress;
                        if (f31 == 1.0f) {
                            f31 = 1.0f;
                        } else if (!dialogCell.drawReactionMention) {
                            f31 = 1.0f - f31;
                        }
                        if (zIsCounterMuted) {
                            drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                        } else {
                            drawable = Theme.dialogs_reactionsMentionDrawable;
                        }
                        drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable, AndroidUtilities.dp(10.333f) + i419, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                        DrawableUtils.drawWithScale(canvas3, drawable, f31);
                    }
                    if (dialogCell.drawPollVotesMention) {
                        int i4110 = dialogCell.pollVotesMentionLeft;
                        rectF2.set(i4110, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i4110, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                        if (zIsCounterMuted) {
                            drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                        } else {
                            drawable2 = Theme.dialogs_pollMentionDrawable;
                        }
                        drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i4110, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                        DrawableUtils.drawWithScale(canvas3, drawable2, f30);
                    } else {
                        int i4111 = dialogCell.pollVotesMentionLeft;
                        rectF2.set(i4111, dialogCell.countTop, AndroidUtilities.dp(20.666f) + i4111, AndroidUtilities.dp(20.666f) + dialogCell.countTop);
                        if (zIsCounterMuted) {
                            drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                        } else {
                            drawable2 = Theme.dialogs_pollMentionDrawable;
                        }
                        drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable2, AndroidUtilities.dp(10.333f) + i4111, AndroidUtilities.dp(10.333f) + dialogCell.countTop, 17);
                        DrawableUtils.drawWithScale(canvas3, drawable2, f30);
                    }
                    if (dialogCell.thumbsCount > 0) {
                        f32 = dialogUpdateHelper.typingProgres;
                        if (f32 != 1.0f) {
                            if (f32 > 0.0f) {
                                canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f32) * 255.0f), 31);
                                canvas3 = canvas;
                                if (dialogUpdateHelper.typingOutToTop) {
                                    fDp = -AndroidUtilities.dp(14.0f);
                                    f33 = dialogUpdateHelper.typingProgres;
                                } else {
                                    fDp = AndroidUtilities.dp(14.0f);
                                    f33 = dialogUpdateHelper.typingProgres;
                                }
                                canvas3.translate(0.0f, fDp * f33);
                            }
                            i12 = 0;
                            while (i12 < dialogCell.thumbsCount) {
                                if (dialogCell.thumbImageSeen[i12]) {
                                    if (dialogCell.thumbBackgroundPaint == null) {
                                        Paint paint14 = new Paint(1);
                                        dialogCell.thumbBackgroundPaint = paint14;
                                        paint14.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                        dialogCell.thumbBackgroundPaint.setColor(0);
                                    }
                                    rectF3 = AndroidUtilities.rectTmp;
                                    imageReceiverArr = dialogCell.thumbImage;
                                    rectF3.set(imageReceiverArr[i12].getImageX(), imageReceiverArr[i12].getImageY(), imageReceiverArr[i12].getImageX2(), imageReceiverArr[i12].getImageY2());
                                    imageReceiverArr[i12].draw(canvas3);
                                    if (dialogCell.drawSpoiler[i12]) {
                                        path = dialogCell.thumbPath;
                                        if (path == null) {
                                            dialogCell.thumbPath = new Path();
                                        } else {
                                            path.rewind();
                                        }
                                        dialogCell.thumbPath.addRoundRect(rectF3, imageReceiverArr[i12].getRoundRadius()[0], imageReceiverArr[i12].getRoundRadius()[1], Path.Direction.CW);
                                        canvas3.save();
                                        canvas3.clipPath(dialogCell.thumbPath);
                                        if (dialogCell.thumbSpoiler == null) {
                                            dialogCell.thumbSpoiler = new SpoilerEffect();
                                        }
                                        dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i10) * 0.325f)));
                                        dialogCell.thumbSpoiler.setBounds((int) imageReceiverArr[i12].getImageX(), (int) imageReceiverArr[i12].getImageY(), (int) imageReceiverArr[i12].getImageX2(), (int) imageReceiverArr[i12].getImageY2());
                                        dialogCell.thumbSpoiler.draw(canvas3);
                                        dialogCell.invalidate();
                                        canvas3.restore();
                                    }
                                    if (dialogCell.drawPlay[i12]) {
                                        BaseCell.setDrawableBounds((int) (imageReceiverArr[i12].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i12].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)), Theme.dialogs_playDrawable);
                                        Theme.dialogs_playDrawable.draw(canvas3);
                                    }
                                }
                                i12++;
                                i10 = -1;
                            }
                            if (dialogUpdateHelper.typingProgres > 0.0f) {
                                canvas3.restore();
                            }
                        }
                    }
                    dialogCellTags = dialogCell.tags;
                    if (dialogCellTags != null) {
                        canvas3.save();
                        canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                        dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                        canvas3.restore();
                    }
                    i11 = i9;
                    if (i11 != -1) {
                        canvas3.restoreToCount(i11);
                    }
                }
                dialogCell = dialogCell3;
                if (dialogCell.thumbsCount > 0) {
                    f32 = dialogUpdateHelper.typingProgres;
                    if (f32 != 1.0f) {
                        if (f32 > 0.0f) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f32) * 255.0f), 31);
                            canvas3 = canvas;
                            if (dialogUpdateHelper.typingOutToTop) {
                                fDp = -AndroidUtilities.dp(14.0f);
                                f33 = dialogUpdateHelper.typingProgres;
                            } else {
                                fDp = AndroidUtilities.dp(14.0f);
                                f33 = dialogUpdateHelper.typingProgres;
                            }
                            canvas3.translate(0.0f, fDp * f33);
                        }
                        i12 = 0;
                        while (i12 < dialogCell.thumbsCount) {
                            if (dialogCell.thumbImageSeen[i12]) {
                                if (dialogCell.thumbBackgroundPaint == null) {
                                    Paint paint15 = new Paint(1);
                                    dialogCell.thumbBackgroundPaint = paint15;
                                    paint15.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                    dialogCell.thumbBackgroundPaint.setColor(0);
                                }
                                rectF3 = AndroidUtilities.rectTmp;
                                imageReceiverArr = dialogCell.thumbImage;
                                rectF3.set(imageReceiverArr[i12].getImageX(), imageReceiverArr[i12].getImageY(), imageReceiverArr[i12].getImageX2(), imageReceiverArr[i12].getImageY2());
                                imageReceiverArr[i12].draw(canvas3);
                                if (dialogCell.drawSpoiler[i12]) {
                                    path = dialogCell.thumbPath;
                                    if (path == null) {
                                        dialogCell.thumbPath = new Path();
                                    } else {
                                        path.rewind();
                                    }
                                    dialogCell.thumbPath.addRoundRect(rectF3, imageReceiverArr[i12].getRoundRadius()[0], imageReceiverArr[i12].getRoundRadius()[1], Path.Direction.CW);
                                    canvas3.save();
                                    canvas3.clipPath(dialogCell.thumbPath);
                                    if (dialogCell.thumbSpoiler == null) {
                                        dialogCell.thumbSpoiler = new SpoilerEffect();
                                    }
                                    dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i10) * 0.325f)));
                                    dialogCell.thumbSpoiler.setBounds((int) imageReceiverArr[i12].getImageX(), (int) imageReceiverArr[i12].getImageY(), (int) imageReceiverArr[i12].getImageX2(), (int) imageReceiverArr[i12].getImageY2());
                                    dialogCell.thumbSpoiler.draw(canvas3);
                                    dialogCell.invalidate();
                                    canvas3.restore();
                                }
                                if (dialogCell.drawPlay[i12]) {
                                    BaseCell.setDrawableBounds((int) (imageReceiverArr[i12].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (imageReceiverArr[i12].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)), Theme.dialogs_playDrawable);
                                    Theme.dialogs_playDrawable.draw(canvas3);
                                }
                            }
                            i12++;
                            i10 = -1;
                        }
                        if (dialogUpdateHelper.typingProgres > 0.0f) {
                            canvas3.restore();
                        }
                    }
                }
                dialogCellTags = dialogCell.tags;
                if (dialogCellTags != null) {
                    canvas3.save();
                    canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                    dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                    canvas3.restore();
                }
                i11 = i9;
                if (i11 != -1) {
                    canvas3.restoreToCount(i11);
                }
            } else {
                dialogCell = dialogCell4;
                resourcesProvider3 = resourcesProvider2;
                anonymousClass3 = anonymousClass6;
                anonymousClass4 = anonymousClass2;
                z3 = false;
                z4 = false;
            }
            z5 = dialogCell.animatingArchiveAvatar;
            imageReceiver = dialogCell.avatarImage;
            if (z5) {
                canvas3.save();
                float interpolation7 = anonymousClass3.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
                canvas3.scale(interpolation7, interpolation7, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            }
            z6 = dialogCell.drawAvatar;
            anonymousClass1 = dialogCell.storyParams;
            if (z6 && (!dialogCell.isTopic || (tL_forumTopic2 = dialogCell.forumTopic) == null || tL_forumTopic2.id != 1 || (pullForegroundDrawable = dialogCell.archivedChatsDrawable) == null || !pullForegroundDrawable.willDraw || pullForegroundDrawable.isOut)) {
                if (dialogCell.drawMonoforumAvatar) {
                    if (dialogCell.bubbleClip == null) {
                        dialogCell.bubbleClip = new PhotoBubbleClip();
                    }
                    dialogCell.bubbleClip.setBounds((int) anonymousClass1.originalAvatarRect.centerX(), (int) anonymousClass1.originalAvatarRect.centerY(), (int) (anonymousClass1.originalAvatarRect.width() / 2.0f));
                    canvas3.save();
                    canvas3.clipPath(dialogCell.bubbleClip);
                    imageReceiver.setImageCoords(anonymousClass1.originalAvatarRect);
                    imageReceiver.draw(canvas3);
                    canvas3.restore();
                } else if (dialogCell.drawCommunityAvatar) {
                    DrawableUtils.setBounds(imageReceiver, AndroidUtilities.dpf2(1.0f) + anonymousClass1.originalAvatarRect.centerX(), anonymousClass1.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
                    DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, imageReceiver.getCenterX(), imageReceiver.getCenterY(), AndroidUtilities.dp(48.0f));
                    imageReceiver.draw(canvas3);
                } else {
                    z9 = dialogCell.isShareToStoryCell;
                    if (z9 || dialogCell.currentDialogFolderId != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    anonymousClass1.drawHiddenStoriesAsSegments = z10;
                    int i4112 = anonymousClass1.forceState;
                    if (z9) {
                        anonymousClass1.forceState = 1;
                    }
                    StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, imageReceiver, anonymousClass1);
                    if (anonymousClass1.drawnLive) {
                        dialogCell.checkTtl();
                    }
                    anonymousClass1.forceState = i4112;
                }
                if (!dialogCell.insideCommunityList && ((((chat = dialogCell.chat) != null && chat.linked_community_id != 0) || ((user = dialogCell.user) != null && user.linked_community_id != 0)) && !dialogCell.drawCommunityAvatar && dialogCell.isDialogCell && !dialogCell.isDialogFolder())) {
                    float fCenterX5 = anonymousClass1.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                    float fCenterY5 = anonymousClass1.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                    if (dialogCell.communityArrowDrawable == null) {
                        dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                    }
                    DrawableUtils.setBounds(dialogCell.communityArrowDrawable, fCenterX5, fCenterY5, 17);
                    canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3)));
                    dialogCell.communityArrowDrawable.draw(canvas3);
                }
            }
            if (dialogCell.animatingArchiveAvatar) {
                canvas3.restore();
            }
            if (imageReceiver.getVisible() && drawAvatarOverlays(canvas)) {
                z4 = true;
            }
            if (dialogCell.rightFragmentOpenedProgress > 0.0f || dialogCell.currentDialogFolderId != 0) {
                dialogCell2 = dialogCell;
            } else {
                boolean zIsCounterMuted2 = dialogCell.isCounterMuted();
                RectF rectF13 = anonymousClass1.originalAvatarRect;
                int iWidth = (int) (((rectF13.width() + rectF13.left) - dialogCell.countWidth) - AndroidUtilities.dp(5.0f));
                RectF rectF14 = anonymousClass1.originalAvatarRect;
                drawCounter(canvas3, zIsCounterMuted2, (int) ((anonymousClass1.originalAvatarRect.height() + imageReceiver.getImageY()) - AndroidUtilities.dp(22.0f)), iWidth, (int) (((rectF14.width() + rectF14.left) - dialogCell.countWidthOld) - AndroidUtilities.dp(5.0f)), dialogCell.rightFragmentOpenedProgress, true);
                dialogCell2 = this;
            }
            if (dialogCell2.collapseOffset != 0.0f) {
                canvas3.restore();
            }
            if (dialogCell2.translationX != 0.0f) {
                canvas3.restore();
            }
            if (z && ((dialogCell2.currentDialogFolderId != 0 || (dialogCell2.isTopic && (tL_forumTopic = dialogCell2.forumTopic) != null && tL_forumTopic.id == 1)) && dialogCell2.translationX == 0.0f && dialogCell2.archivedChatsDrawable != null)) {
                canvas3.save();
                canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                canvas3.clipRect(0.0f, (1.0f - dialogCell2.archivedChatsDrawable.pullProgress) * dialogCell2.getMeasuredHeight(), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                dialogCell2.archivedChatsDrawable.draw(canvas3, false);
                canvas3.restore();
            }
            if (dialogCell2.useSeparator) {
                f8 = 0.0f;
            } else {
                if (dialogCell2.fullSeparator || (dialogCell2.currentDialogFolderId != 0 && dialogCell2.archiveHidden)) {
                    iDp = 0;
                } else {
                    iDp = AndroidUtilities.dp(dialogCell2.messagePaddingStart);
                }
                if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                    alpha = Theme.dividerPaint.getAlpha();
                    f25 = dialogCell2.rightFragmentOpenedProgress;
                    if (f25 != 0.0f) {
                        Theme.dividerPaint.setAlpha((int) ((1.0f - f25) * alpha));
                    }
                    measuredHeight = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                    if (LocaleController.isRTL) {
                        canvas.drawLine(0.0f, measuredHeight, dialogCell2.getMeasuredWidth() - iDp, measuredHeight, Theme.dividerPaint);
                    } else {
                        canvas.drawLine(iDp, measuredHeight, dialogCell2.getMeasuredWidth(), measuredHeight, Theme.dividerPaint);
                    }
                    f8 = 0.0f;
                    if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                        Theme.dividerPaint.setAlpha(alpha);
                    }
                } else {
                    f8 = 0.0f;
                }
            }
            if (dialogCell2.clipProgress == f8) {
                canvas2 = canvas;
            } else if (Build.VERSION.SDK_INT != 24) {
                canvas.restore();
                canvas2 = canvas;
            } else {
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider3));
                canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                canvas2 = canvas;
            }
            if (z22) {
                float f68 = 1.0f - f47;
                int measuredHeight6 = (int) (dialogCell2.getMeasuredHeight() * f68);
                color3 = Theme.getColor(Theme.key_windowBackgroundWhite);
                if (dialogCell2.archiveFadeGradientDrawable == null) {
                    dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                }
                if (dialogCell2.archiveFadeGradientDrawableColor != color3) {
                    dialogCell2.archiveFadeGradientDrawableColor = color3;
                    dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color3, 16777215 & color3});
                }
                float fClamp6 = MathUtils.clamp((f68 - 0.05f) * 10.0f, 0.0f, 1.0f);
                dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight6, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight6);
                dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (fClamp6 * 255.0f));
                dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                canvas2.restore();
            }
            z7 = dialogCell2.drawReorder;
            if (z7 || dialogCell2.reorderIconProgress != 0.0f) {
                if (z7) {
                    f12 = dialogCell2.reorderIconProgress;
                    if (f12 < 1.0f) {
                        f13 = f12 + 0.09411765f;
                        dialogCell2.reorderIconProgress = f13;
                        if (f13 > 1.0f) {
                            dialogCell2.reorderIconProgress = 1.0f;
                        }
                        f10 = 0.0f;
                    }
                    f10 = 0.0f;
                    z8 = z4;
                } else {
                    f9 = dialogCell2.reorderIconProgress;
                    f10 = 0.0f;
                    if (f9 > 0.0f) {
                        f11 = f9 - 0.09411765f;
                        dialogCell2.reorderIconProgress = f11;
                        if (f11 < 0.0f) {
                            dialogCell2.reorderIconProgress = 0.0f;
                        }
                    } else {
                        z8 = z4;
                    }
                }
                z8 = true;
            } else {
                f10 = 0.0f;
                z8 = z4;
            }
            if (dialogCell2.archiveHidden) {
                f23 = dialogCell2.archiveBackgroundProgress;
                if (f23 > f10) {
                    f24 = f23 - 0.069565214f;
                    dialogCell2.archiveBackgroundProgress = f24;
                    if (f24 < f10) {
                        dialogCell2.archiveBackgroundProgress = f10;
                    }
                    avatarDrawable2 = dialogCell2.avatarDrawable;
                    if (avatarDrawable2.avatarType == 2) {
                        avatarDrawable2.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                    }
                    z8 = true;
                }
            } else {
                f14 = dialogCell2.archiveBackgroundProgress;
                if (f14 < 1.0f) {
                    f15 = f14 + 0.069565214f;
                    dialogCell2.archiveBackgroundProgress = f15;
                    if (f15 > 1.0f) {
                        dialogCell2.archiveBackgroundProgress = 1.0f;
                    }
                    avatarDrawable = dialogCell2.avatarDrawable;
                    if (avatarDrawable.avatarType == 2) {
                        avatarDrawable.archivedAvatarProgress = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress);
                    }
                    z8 = true;
                }
            }
            if (dialogCell2.animatingArchiveAvatar) {
                f22 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                dialogCell2.animatingArchiveAvatarProgress = f22;
                if (f22 >= 170.0f) {
                    dialogCell2.animatingArchiveAvatarProgress = 170.0f;
                    dialogCell2.animatingArchiveAvatar = false;
                }
                z8 = true;
            }
            if (dialogCell2.drawRevealBackground) {
                f18 = dialogCell2.currentRevealBounceProgress;
                if (f18 < 1.0f) {
                    f21 = f18 + 0.09411765f;
                    dialogCell2.currentRevealBounceProgress = f21;
                    if (f21 > 1.0f) {
                        dialogCell2.currentRevealBounceProgress = 1.0f;
                        z8 = true;
                    }
                }
                f19 = dialogCell2.currentRevealProgress;
                if (f19 < 1.0f) {
                    f20 = f19 + 0.053333335f;
                    dialogCell2.currentRevealProgress = f20;
                    if (f20 > 1.0f) {
                        dialogCell2.currentRevealProgress = 1.0f;
                    }
                    z8 = true;
                }
            } else {
                if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                    dialogCell2.currentRevealBounceProgress = 0.0f;
                    z8 = true;
                }
                f16 = dialogCell2.currentRevealProgress;
                if (f16 > 0.0f) {
                    f17 = f16 - 0.053333335f;
                    dialogCell2.currentRevealProgress = f17;
                    if (f17 < 0.0f) {
                        dialogCell2.currentRevealProgress = 0.0f;
                    }
                    z8 = true;
                }
            }
            if (z3) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            anonymousClass4.setVisibility(i7);
            if (z8) {
                dialogCell2.invalidate();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        PullForegroundDrawable pullForegroundDrawable;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isFolderCell() && (pullForegroundDrawable = this.archivedChatsDrawable) != null && SharedConfig.archiveHidden && pullForegroundDrawable.pullProgress == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!isFolderCell() && this.parentFragment != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        AnonymousClass3 anonymousClass3 = this.checkBox;
        if (anonymousClass3 == null || !anonymousClass3.checkBoxBase.isChecked) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.rightFragmentOpenedProgress != 0.0f || this.isTopic || this.isShareToStoryCell || !checkOnTouchEvent(motionEvent, this)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        int iDp2;
        if (this.currentDialogId == 0 && this.customDialog == null) {
            return;
        }
        QrActivity.AnonymousClass2 anonymousClass2 = this.emojiStatusView;
        if (anonymousClass2 != null) {
            anonymousClass2.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        }
        if (this.checkBox != null) {
            int i5 = this.messagePaddingStart;
            boolean z2 = this.useForceThreeLines;
            int iDp3 = AndroidUtilities.dp(i5 - ((z2 || SharedConfig.useThreeLinesLayout) ? 29 : 27));
            if (this.inPreviewMode) {
                iDp2 = AndroidUtilities.dp(8.0f);
                iDp = (getMeasuredHeight() - this.checkBox.getMeasuredHeight()) >> 1;
            } else {
                if (LocaleController.isRTL) {
                    iDp3 = (i3 - i) - iDp3;
                }
                int i6 = iDp3;
                iDp = AndroidUtilities.dp(this.chekBoxPaddingTop + ((z2 || SharedConfig.useThreeLinesLayout) ? 6 : 0));
                iDp2 = i6;
            }
            AnonymousClass3 anonymousClass3 = this.checkBox;
            anonymousClass3.layout(iDp2, iDp, anonymousClass3.getMeasuredWidth() + iDp2, this.checkBox.getMeasuredHeight() + iDp);
        }
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (measuredWidth != this.lastSize || this.updateLayout) {
            this.updateLayout = false;
            this.lastSize = measuredWidth;
            try {
                buildLayout$1();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        QrActivity.AnonymousClass2 anonymousClass2 = this.emojiStatusView;
        if (anonymousClass2 != null) {
            anonymousClass2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        }
        AnonymousClass3 anonymousClass3 = this.checkBox;
        if (anonymousClass3 != null) {
            anonymousClass3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        if (this.isTopic) {
            int size = View.MeasureSpec.getSize(i);
            boolean z = this.useForceThreeLines;
            int i4 = (z || SharedConfig.useThreeLinesLayout) ? this.heightThreeLines : this.heightDefault;
            if (!hasTags() || ((z || SharedConfig.useThreeLinesLayout) && !isForumCell())) {
                i3 = 0;
            } else {
                i3 = isForumCell() ? this.addForumHeightForTags : this.addHeightForTags;
            }
            setMeasuredDimension(size, AndroidUtilities.dp(i4 + i3) + (this.useSeparator ? 1 : 0));
            this.twoLinesForName = false;
            if (this.isTopic && !hasTags()) {
                buildLayout$1();
                if (this.nameIsEllipsized) {
                    this.twoLinesForName = true;
                    buildLayout$1();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), computeHeight());
        this.topClip = 0;
        this.bottomClip = getMeasuredHeight();
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
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

    public final void onReorderStateChanged(boolean z, boolean z2) {
        if ((!getIsPinned() && z) || this.drawReorder == z) {
            if (getIsPinned()) {
                return;
            }
            this.drawReorder = false;
            return;
        }
        this.drawReorder = z;
        if (z2) {
            this.reorderIconProgress = z ? 0.0f : 1.0f;
        } else {
            this.reorderIconProgress = z ? 1.0f : 0.0f;
        }
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.DialogCell.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        DialogsActivity dialogsActivity;
        if (i != R.id.acc_action_chat_preview || (dialogsActivity = this.parentFragment) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        dialogsActivity.showChatPreview(this);
        return true;
    }

    @Override
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public final void resetPinnedArchiveState() {
        boolean z = SharedConfig.archiveHidden;
        this.archiveHidden = z;
        float f = z ? 0.0f : 1.0f;
        this.archiveBackgroundProgress = f;
        this.avatarDrawable.archivedAvatarProgress = f;
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

    public void setArchivedPullAnimation(PullForegroundDrawable pullForegroundDrawable) {
        this.archivedChatsDrawable = pullForegroundDrawable;
    }

    public void setBottomClip(int i) {
        this.bottomClip = i;
    }

    public final void setChecked(boolean z, boolean z2) {
        AnonymousClass3 anonymousClass3 = this.checkBox;
        if (anonymousClass3 != null || z) {
            if (anonymousClass3 == null) {
                AnonymousClass3 anonymousClass4 = new AnonymousClass3(this, getContext(), this.resourcesProvider, 0);
                this.checkBox = anonymousClass4;
                anonymousClass4.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                this.checkBox.setDrawUnchecked(false);
                this.checkBox.setDrawBackgroundAsArc(3);
                addView(this.checkBox);
            }
            this.checkBox.checkBoxBase.setChecked(-1, z, z2);
            checkTtl();
        }
    }

    public void setClipProgress(float f) {
        this.clipProgress = f;
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    public void setCurrentDialogId(long j) {
        this.currentDialogId = j;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.customMessage, str)) {
            return;
        }
        this.customMessage = str;
        buildLayout$1();
        requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.customMessage = str;
    }

    public final void setDialog(TLRPC.Dialog dialog, int i, int i2) {
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
                pullForegroundDrawable.cell = this;
                pullForegroundDrawable.updateColors();
            }
        } else {
            this.currentDialogFolderId = 0;
        }
        this.dialogsType = i;
        boolean z = i == 3;
        Runnable runnable = this.unsubscribePremiumBlocked;
        boolean z2 = runnable != null;
        int i3 = this.currentAccount;
        if (z != z2) {
            if (!z && runnable != null) {
                runnable.run();
                this.unsubscribePremiumBlocked = null;
            } else if (z) {
                this.unsubscribePremiumBlocked = NotificationCenter.getInstance(i3).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new DialogCell$$ExternalSyntheticLambda6(this, 0));
            }
        }
        if (this.tags == null) {
            this.tags = new DialogCellTags(this);
        }
        this.folderId = i2;
        this.messageId = 0;
        if (update(0, false)) {
            requestLayout();
        }
        if (this.user != null && (user = MessagesController.getInstance(i3).getUser(Long.valueOf(this.user.id))) != null) {
            this.user = user;
        }
        this.onlineProgress = isOnline() ? 1.0f : 0.0f;
        TLRPC.Chat chat = this.chat;
        boolean z3 = chat != null && chat.call_active && chat.call_not_empty;
        this.hasCall = z3;
        this.chatCallProgress = z3 ? 1.0f : 0.0f;
        MessageObject messageObject = this.message;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.lastUnreadState) {
                ChatThemeController.getInstance(i3).setDialogTheme(this.currentDialogId, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
            }
        }
        checkTtl();
    }

    public void setDialogCellDelegate(DialogCellDelegate dialogCellDelegate) {
        this.delegate = dialogCellDelegate;
    }

    public void setDialogSelected(boolean z) {
        if (this.isSelected != z && !StoryViewer.animationInProgress) {
            super.invalidate();
        }
        this.isSelected = z;
    }

    public final void setForumTopic(TLRPC.TL_forumTopic tL_forumTopic, long j, MessageObject messageObject, boolean z, boolean z2) {
        PullForegroundDrawable pullForegroundDrawable;
        this.forumTopic = tL_forumTopic;
        this.isTopic = tL_forumTopic != null;
        if (this.currentDialogId != j) {
            this.lastStatusDrawableParams = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof ForumBubbleDrawable) {
            ((ForumBubbleDrawable) drawable).setColor(tL_forumTopic.icon_color);
        }
        this.currentDialogId = j;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.message = messageObject;
        this.isDialogCell = false;
        this.showTopicIconInName = z;
        this.lastMessageDate = messageObject.messageOwner.date;
        this.markUnread = false;
        this.messageId = messageObject.getId();
        this.lastUnreadState = messageObject.isUnread();
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
            pullForegroundDrawable.cell = this;
            pullForegroundDrawable.updateColors();
        }
        update(0, z2);
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
            buildLayout$1();
        }
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    public void setPreloader(DialogsAdapter.DialogsPreloader dialogsPreloader) {
        this.preloader = dialogsPreloader;
    }

    public void setRightFragmentOpenedProgress(float f) {
        if (this.rightFragmentOpenedProgress != f) {
            this.rightFragmentOpenedProgress = f;
            if (StoryViewer.animationInProgress) {
                return;
            }
            super.invalidate();
        }
    }

    public void setSliding(boolean z) {
        this.isSliding = z;
    }

    public final void setThumb(MessageObject messageObject, int i) {
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
                ImageReceiver[] imageReceiverArr = this.thumbImage;
                String str2 = str;
                imageReceiverArr[i].setImage(ImageLocation.getForObject(photoSize, tLObject), str2, ImageLocation.getForObject(strippedPhotoSize, tLObject), str2, i3, null, messageObject, 0);
                imageReceiverArr[i].setRoundRadius(AndroidUtilities.dp(messageObject.isRoundVideo() ? 18.0f : 2.0f));
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
            rLottieDrawable.setProgress(0.0f, true);
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
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    public void setVisible(boolean z) {
        if (this.visibleOnScreen == z) {
            return;
        }
        this.visibleOnScreen = z;
        if (!z || StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    public final void startOutAnimation() {
        PullForegroundDrawable pullForegroundDrawable = this.archivedChatsDrawable;
        if (pullForegroundDrawable != null) {
            if (this.isTopic) {
                pullForegroundDrawable.outCy = AndroidUtilities.dp(24.0f);
                this.archivedChatsDrawable.outCx = AndroidUtilities.dp(24.0f);
                this.archivedChatsDrawable.outRadius = 0.0f;
            } else {
                AnonymousClass1 anonymousClass1 = this.storyParams;
                pullForegroundDrawable.outCy = anonymousClass1.originalAvatarRect.centerY();
                PullForegroundDrawable pullForegroundDrawable2 = this.archivedChatsDrawable;
                RectF rectF = anonymousClass1.originalAvatarRect;
                pullForegroundDrawable2.outCx = rectF.centerX();
                this.archivedChatsDrawable.outRadius = rectF.width() / 2.0f;
                if (!MessagesController.getInstance(this.currentAccount).getStoriesController().hiddenListStories.isEmpty()) {
                    this.archivedChatsDrawable.outRadius -= AndroidUtilities.dpf2(3.5f);
                }
                PullForegroundDrawable pullForegroundDrawable3 = this.archivedChatsDrawable;
                this.avatarImage.getBitmapWidth();
                pullForegroundDrawable3.getClass();
            }
            PullForegroundDrawable pullForegroundDrawable4 = this.archivedChatsDrawable;
            if (pullForegroundDrawable4.animateOut || pullForegroundDrawable4.listView == null) {
                return;
            }
            AnimatorSet animatorSet = pullForegroundDrawable4.outAnimator;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                pullForegroundDrawable4.outAnimator.cancel();
            }
            pullForegroundDrawable4.animateOut = true;
            pullForegroundDrawable4.bounceIn = true;
            pullForegroundDrawable4.bounceProgress = 0.0f;
            pullForegroundDrawable4.listView.getTranslationY();
            AndroidUtilities.dp(100.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new PullForegroundDrawable$$ExternalSyntheticLambda0(pullForegroundDrawable4, 5));
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            valueAnimatorOfFloat.setDuration(250L);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new PullForegroundDrawable$$ExternalSyntheticLambda0(pullForegroundDrawable4, 6));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
            valueAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator);
            valueAnimatorOfFloat2.setDuration(150L);
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new PullForegroundDrawable$$ExternalSyntheticLambda0(pullForegroundDrawable4, 7));
            valueAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator);
            valueAnimatorOfFloat3.setDuration(135L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            pullForegroundDrawable4.outAnimator = animatorSet2;
            animatorSet2.addListener(new ItemOptions.AnonymousClass3(pullForegroundDrawable4, 21));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
            animatorSet3.setStartDelay(180L);
            pullForegroundDrawable4.outAnimator.playTogether(valueAnimatorOfFloat, animatorSet3);
            pullForegroundDrawable4.outAnimator.start();
        }
    }

    public final boolean update(int i, boolean z) {
        boolean z2;
        AvatarDrawable avatarDrawable;
        long j;
        char c;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        long dialogId;
        boolean zIsDialogMuted;
        boolean zIsDialogMuted2;
        boolean z7;
        int i3;
        boolean z8;
        boolean z9;
        ImageReceiver imageReceiver;
        AvatarDrawable avatarDrawable2;
        int i4;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        MessageObject messageObject;
        int i5;
        boolean z10;
        boolean z11;
        boolean z12;
        int iDp;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        boolean z13;
        ValueAnimator valueAnimator;
        boolean z14;
        TLRPC.Chat chat4;
        TLRPC.EncryptedChat encryptedChatM;
        DialogsActivity dialogsActivity;
        ArrayList dialogsArray;
        MessageObject messageObject2;
        TLRPC.User user3;
        boolean z15;
        CharSequence charSequence;
        MessageObject messageObject3;
        int i6;
        int i7;
        MessageObject messageObject4;
        TLRPC.Dialog dialog;
        TLRPC.Chat chat5;
        int archiveUnreadCount;
        int i8;
        int i9;
        int i10;
        int i11;
        TLRPC.Chat chat6;
        ForumFormattedNames forumFormattedNames;
        HashMap map;
        AvatarSpan avatarSpan;
        Long l;
        long jLongValue;
        TLRPC.Chat chat7;
        boolean z16;
        MessageObject messageObject5;
        TLRPC.User user4;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        long botVerificationIcon;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2;
        TLRPC.Chat chat8;
        TLRPC.User user5;
        boolean z17;
        int i12;
        DialogCell dialogCell;
        DialogCellTags.Tag tag;
        MessagesController.DialogFilter dialogFilter;
        String str;
        boolean zIsForumCell = isForumCell();
        boolean z18 = false;
        this.ttlPeriod = 0;
        CustomDialog customDialog = this.customDialog;
        ImageReceiver imageReceiver2 = this.avatarImage;
        AvatarDrawable avatarDrawable3 = this.avatarDrawable;
        int i13 = this.currentAccount;
        if (customDialog != null) {
            this.lastMessageDate = customDialog.date;
            int i14 = customDialog.unread_count;
            this.lastUnreadState = i14 != 0;
            this.unreadCount = i14;
            this.drawPin = customDialog.pinned;
            this.dialogMuted = customDialog.muted;
            this.hasUnmutedTopics = false;
            this.hasUnmutedCommunityDialogs = false;
            avatarDrawable3.setInfo(customDialog.id, customDialog.name, null, null, null);
            if (this.isShareToStoryCell) {
                imageReceiver2.setImage(null, "50_50", this.repostStoryDrawable, null, 0L);
            } else {
                imageReceiver2.setImage(null, "50_50", avatarDrawable3, null, 0L);
            }
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.thumbImage;
                if (i15 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i15].setImageBitmap((Drawable) null);
                i15++;
            }
            this.drawMonoforumAvatar = false;
            this.drawCommunityAvatar = false;
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(26.0f));
            this.drawUnmute = false;
            i5 = i13;
            z2 = zIsForumCell;
            z3 = false;
            z4 = false;
        } else {
            int i16 = this.unreadCount;
            boolean z19 = this.reactionMentionCount != 0;
            boolean z20 = this.markUnread;
            this.hasUnmutedTopics = false;
            this.hasUnmutedCommunityDialogs = false;
            this.readOutboxMaxId = -1;
            if (this.isDialogCell) {
                j = 0;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.get(this.currentDialogId);
                if (dialog2 != null) {
                    this.readOutboxMaxId = dialog2.read_outbox_max_id;
                    this.ttlPeriod = dialog2.ttl_period;
                    if (i == 0) {
                        avatarDrawable = avatarDrawable3;
                        c = 1;
                        this.clearingDialog = MessagesController.getInstance(i13).isClearingDialog(dialog2.id);
                        ArrayList arrayList = (ArrayList) MessagesController.getInstance(i13).dialogMessage.get(dialog2.id);
                        this.groupMessages = arrayList;
                        MessageObject messageObject6 = (arrayList == null || arrayList.size() <= 0) ? null : (MessageObject) this.groupMessages.get(0);
                        this.message = messageObject6;
                        this.lastUnreadState = messageObject6 != null && messageObject6.isUnread();
                        TLRPC.Chat chat9 = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog2.id));
                        if (chat9 == null || !(chat9.forum || (chat9.monoforum && ChatObject.canManageMonoForum(i13, chat9)))) {
                            z2 = zIsForumCell;
                            if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                this.unreadCount = MessagesStorage.getInstance(i13).getArchiveUnreadCount();
                                this.mentionCount = 0;
                                this.reactionMentionCount = 0;
                                this.pollVotesMentionCount = 0;
                            } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount = MessagesController.getInstance(i13).getCommunityUnreadCount(-dialog2.id);
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
                        } else {
                            z2 = zIsForumCell;
                            int[] forumUnreadCount = MessagesController.getInstance(i13).getTopicsController().getForumUnreadCount(chat9.id);
                            this.unreadCount = forumUnreadCount[0];
                            this.mentionCount = forumUnreadCount[1];
                            this.reactionMentionCount = forumUnreadCount[2];
                            this.hasUnmutedTopics = forumUnreadCount[3] != 0;
                            this.pollVotesMentionCount = forumUnreadCount[4];
                        }
                        if (ChatObject.isMonoForum(chat9)) {
                            this.mentionCount = 0;
                        }
                        this.markUnread = dialog2.unread_mark;
                        MessageObject messageObject7 = this.message;
                        if (messageObject7 != null) {
                            int i17 = messageObject7.messageOwner.edit_date;
                        }
                        this.lastMessageDate = dialog2.last_message_date;
                        int i18 = this.dialogsType;
                        if (i18 == 7 || i18 == 8) {
                            MessagesController.DialogFilter dialogFilter2 = MessagesController.getInstance(i13).selectedDialogFilter[this.dialogsType == 8 ? (char) 1 : (char) 0];
                            this.drawPin = dialogFilter2 != null && dialogFilter2.pinnedDialogs.indexOfKey(dialog2.id) >= 0;
                        } else {
                            this.drawPin = this.currentDialogFolderId == 0 && dialog2.pinned;
                        }
                        MessageObject messageObject8 = this.message;
                        if (messageObject8 != null) {
                            this.lastSendState = messageObject8.messageOwner.send_state;
                        }
                    } else {
                        z2 = zIsForumCell;
                        avatarDrawable = avatarDrawable3;
                        c = 1;
                    }
                } else {
                    z2 = zIsForumCell;
                    avatarDrawable = avatarDrawable3;
                    c = 1;
                    this.unreadCount = 0;
                    this.mentionCount = 0;
                    this.reactionMentionCount = 0;
                    this.pollVotesMentionCount = 0;
                    this.lastMessageDate = 0;
                    this.clearingDialog = false;
                }
                if (this.currentDialogId != 0) {
                    int i19 = RightSlidingDialogContainer.$r8$clinit;
                }
            } else {
                z2 = zIsForumCell;
                avatarDrawable = avatarDrawable3;
                j = 0;
                c = 1;
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
                boolean zIsEmpty = dialogCellTags.tags.isEmpty();
                DialogCellTags dialogCellTags2 = this.tags;
                int i20 = this.dialogsType;
                long j2 = this.currentDialogId;
                dialogCellTags2.getClass();
                AccountInstance accountInstance = AccountInstance.getInstance(i13);
                MessagesController messagesController = MessagesController.getInstance(i13);
                boolean z21 = messagesController.folderTags;
                ArrayList arrayList2 = dialogCellTags2.tags;
                if (z21 && accountInstance.getUserConfig().isPremium()) {
                    ArrayList<MessagesController.DialogFilter> arrayList3 = messagesController.dialogFilters;
                    MessagesController.DialogFilter dialogFilter3 = i20 == 7 ? messagesController.selectedDialogFilter[0] : i20 == 8 ? messagesController.selectedDialogFilter[c] : null;
                    ArrayList arrayList4 = dialogCellTags2.filters;
                    arrayList4.clear();
                    if (i20 == 0 || i20 == 7 || i20 == 8) {
                        int i21 = 0;
                        while (i21 < arrayList3.size()) {
                            MessagesController.DialogFilter dialogFilter4 = arrayList3.get(i21);
                            if (dialogFilter4 == null || dialogFilter4 == dialogFilter3) {
                                i12 = i21;
                            } else {
                                i12 = i21;
                                if (dialogFilter4.color >= 0 && dialogFilter4.includesDialog(accountInstance, j2)) {
                                    arrayList4.add(dialogFilter4);
                                }
                            }
                            i21 = i12 + 1;
                        }
                    }
                    z17 = false;
                    int i22 = 0;
                    while (true) {
                        int size = arrayList2.size();
                        dialogCell = dialogCellTags2.parentView;
                        if (i22 >= size) {
                            break;
                        }
                        DialogCellTags.Tag tag2 = (DialogCellTags.Tag) arrayList2.get(i22);
                        int i23 = 0;
                        while (true) {
                            if (i23 >= arrayList4.size()) {
                                dialogFilter = null;
                                break;
                            }
                            if (((MessagesController.DialogFilter) arrayList4.get(i23)).id == tag2.filterId) {
                                dialogFilter = (MessagesController.DialogFilter) arrayList4.get(i23);
                                break;
                            }
                            i23++;
                        }
                        if (dialogFilter == null) {
                            arrayList2.remove(i22);
                            i22--;
                        } else {
                            if (dialogFilter.color != tag2.colorId || ((str = dialogFilter.name) != null && tag2.text != null && str.length() != tag2.text.getText().length())) {
                                arrayList2.set(i22, DialogCellTags.Tag.fromFilter(dialogCell, dialogFilter));
                            }
                            i22++;
                        }
                        z17 = true;
                        i22++;
                    }
                    for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                        MessagesController.DialogFilter dialogFilter5 = (MessagesController.DialogFilter) arrayList4.get(i24);
                        int i25 = 0;
                        while (true) {
                            if (i25 >= arrayList2.size()) {
                                tag = null;
                                break;
                            }
                            if (((DialogCellTags.Tag) arrayList2.get(i25)).filterId == dialogFilter5.id) {
                                tag = (DialogCellTags.Tag) arrayList2.get(i25);
                                break;
                            }
                            i25++;
                        }
                        if (tag == null) {
                            arrayList2.add(i24, DialogCellTags.Tag.fromFilter(dialogCell, dialogFilter5));
                            z17 = true;
                        }
                    }
                    arrayList4.clear();
                } else {
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    arrayList2.clear();
                    z17 = !zIsEmpty2;
                }
                if (z17) {
                    if (zIsEmpty != this.tags.tags.isEmpty()) {
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
                        this.user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.user.id));
                        if (this.wasDrawnOnline != isOnline()) {
                            z5 = true;
                        }
                    }
                    if ((i & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                        user4 = this.user;
                        swapAnimatedEmojiDrawable = this.emojiStatus;
                        if (user4 != null) {
                            user5 = MessagesController.getInstance(i13).getUser(Long.valueOf(this.user.id));
                            this.user = user5;
                            if (user5 != null || DialogObject.getEmojiStatusDocumentId(user5.emoji_status) == j) {
                                this.nameLayoutEllipsizeByGradient = true;
                                swapAnimatedEmojiDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                swapAnimatedEmojiDrawable.setParticles(false, z);
                            } else {
                                this.nameLayoutEllipsizeByGradient = true;
                                swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(this.user.emoji_status), z);
                                swapAnimatedEmojiDrawable.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), z);
                            }
                            botVerificationIcon = DialogObject.getBotVerificationIcon(this.user);
                            z5 = true;
                        } else {
                            botVerificationIcon = j;
                        }
                        if (this.chat != null) {
                            chat8 = MessagesController.getInstance(i13).getChat(Long.valueOf(this.chat.id));
                            this.chat = chat8;
                            if (chat8 != null || DialogObject.getEmojiStatusDocumentId(chat8.emoji_status) == j) {
                                this.nameLayoutEllipsizeByGradient = true;
                                swapAnimatedEmojiDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                swapAnimatedEmojiDrawable.setParticles(false, z);
                            } else {
                                this.nameLayoutEllipsizeByGradient = true;
                                swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), z);
                                swapAnimatedEmojiDrawable.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), z);
                            }
                            botVerificationIcon = DialogObject.getBotVerificationIcon(this.chat);
                            z5 = true;
                        }
                        swapAnimatedEmojiDrawable2 = this.botVerification;
                        if (botVerificationIcon != j) {
                            z15 = !this.drawBotVerified;
                            swapAnimatedEmojiDrawable2.set(botVerificationIcon, z);
                        } else {
                            z15 = this.drawBotVerified;
                            swapAnimatedEmojiDrawable2.set((Drawable) null, z);
                        }
                    } else {
                        z15 = false;
                    }
                    if ((this.isDialogCell || this.isTopic) && (i & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                        CharSequence printingString = MessagesController.getInstance(i13).getPrintingString(this.currentDialogId, getTopicId(), true);
                        charSequence = this.lastPrintString;
                        if ((charSequence == null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                        }
                    }
                    if (!z15 && (i & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0 && (messageObject5 = this.message) != null && messageObject5.messageText != this.lastMessageString) {
                        z15 = true;
                    }
                    if (!z15 && (i & MessagesController.UPDATE_MASK_CHAT) != 0 && this.chat != null) {
                        chat7 = MessagesController.getInstance(i13).getChat(Long.valueOf(this.chat.id));
                        if (chat7 == null && chat7.call_active && chat7.call_not_empty) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16 != this.hasCall) {
                            z15 = true;
                        }
                    }
                    if (!z15 && (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat6 = this.chat) == null || (chat6.monoforum && ChatObject.canManageMonoForum(i13, chat6)))) {
                        forumFormattedNames = this.forumFormattedNames;
                        if (forumFormattedNames != null && (map = forumFormattedNames.avatarSpans) != null && !map.isEmpty()) {
                            for (Map.Entry entry : forumFormattedNames.avatarSpans.entrySet()) {
                                avatarSpan = (AvatarSpan) entry.getValue();
                                l = (Long) entry.getKey();
                                jLongValue = l.longValue();
                                if (jLongValue >= j) {
                                    avatarSpan.setUser(MessagesController.getInstance(avatarSpan.currentAccount).getUser(l));
                                } else {
                                    avatarSpan.setChat(MessagesController.getInstance(avatarSpan.currentAccount).getChat(Long.valueOf(-jLongValue)));
                                }
                            }
                        }
                        z15 = true;
                    }
                    if (!z15 && (i & MessagesController.UPDATE_MASK_NAME) != 0 && this.chat == null) {
                        z15 = true;
                    }
                    if (!z15 && (i & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 && this.user == null) {
                        z15 = true;
                    }
                    if (!z15 && (i & MessagesController.UPDATE_MASK_CHAT_NAME) != 0 && this.user == null) {
                        z15 = true;
                    }
                    if (!z15) {
                        messageObject4 = this.message;
                        if (messageObject4 != null && this.lastUnreadState != messageObject4.isUnread()) {
                            this.lastUnreadState = this.message.isUnread();
                            z15 = true;
                        }
                        if (this.isDialogCell) {
                            dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.get(this.currentDialogId);
                            if (dialog == null) {
                                chat5 = null;
                            } else {
                                chat5 = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog.id));
                            }
                            if (chat5 == null && (chat5.forum || (chat5.monoforum && ChatObject.canManageMonoForum(i13, chat5)))) {
                                int[] forumUnreadCount2 = MessagesController.getInstance(i13).getTopicsController().getForumUnreadCount(chat5.id);
                                i11 = forumUnreadCount2[0];
                                i10 = forumUnreadCount2[1];
                                i9 = forumUnreadCount2[2];
                                this.hasUnmutedTopics = forumUnreadCount2[3] != 0;
                                i8 = forumUnreadCount2[4];
                            } else {
                                if (dialog instanceof TLRPC.TL_dialogFolder) {
                                    archiveUnreadCount = MessagesStorage.getInstance(i13).getArchiveUnreadCount();
                                } else {
                                    if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                        MessagesController.UnreadCounts communityUnreadCount2 = MessagesController.getInstance(i13).getCommunityUnreadCount(-dialog.id);
                                        i11 = communityUnreadCount2.unreadCount;
                                        i10 = communityUnreadCount2.mentionCount;
                                        i9 = communityUnreadCount2.reactionMentionCount;
                                        i8 = communityUnreadCount2.pollVotesMentionCount;
                                        this.hasUnmutedCommunityDialogs = communityUnreadCount2.hasUnmutedUnreadDialogs;
                                    } else if (dialog != null) {
                                        archiveUnreadCount = dialog.unread_count;
                                        int i26 = dialog.unread_mentions_count;
                                        int i27 = dialog.unread_reactions_count;
                                        i8 = dialog.unread_poll_votes_count;
                                        i9 = i27;
                                        i10 = i26;
                                    } else {
                                        archiveUnreadCount = 0;
                                    }
                                    if (ChatObject.isMonoForum(chat5)) {
                                        i10 = 0;
                                    }
                                    if (dialog != null && (this.unreadCount != archiveUnreadCount || this.markUnread != dialog.unread_mark || this.mentionCount != i10 || this.reactionMentionCount != i9)) {
                                        this.unreadCount = archiveUnreadCount;
                                        this.mentionCount = i10;
                                        this.markUnread = dialog.unread_mark;
                                        this.reactionMentionCount = i9;
                                        this.pollVotesMentionCount = i8;
                                        z15 = true;
                                    }
                                }
                                i10 = 0;
                                i9 = 0;
                                i8 = 0;
                                if (ChatObject.isMonoForum(chat5)) {
                                    i10 = 0;
                                }
                                if (dialog != null) {
                                    this.unreadCount = archiveUnreadCount;
                                    this.mentionCount = i10;
                                    this.markUnread = dialog.unread_mark;
                                    this.reactionMentionCount = i9;
                                    this.pollVotesMentionCount = i8;
                                    z15 = true;
                                }
                            }
                            archiveUnreadCount = i11;
                            if (ChatObject.isMonoForum(chat5)) {
                                i10 = 0;
                            }
                            if (dialog != null) {
                                this.unreadCount = archiveUnreadCount;
                                this.mentionCount = i10;
                                this.markUnread = dialog.unread_mark;
                                this.reactionMentionCount = i9;
                                this.pollVotesMentionCount = i8;
                                z15 = true;
                            }
                        }
                    }
                    if (!z15 && (i & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject3 = this.message) != null) {
                        i6 = this.lastSendState;
                        i7 = messageObject3.messageOwner.send_state;
                        if (i6 != i7) {
                            this.lastSendState = i7;
                            z15 = true;
                        }
                    }
                    if (!z15) {
                        if (StoryViewer.animationInProgress) {
                            return z3;
                        }
                        super.invalidate();
                        return z3;
                    }
                }
                this.user = null;
                this.chat = null;
                this.encryptedChat = null;
                if (this.currentDialogCommunityId != j) {
                    this.message = MessagesController.getInstance(i13).findCommunityLastMessage(this.currentDialogCommunityId);
                }
                i2 = this.currentDialogFolderId;
                if (i2 != 0) {
                    this.dialogMuted = false;
                    this.drawUnmute = false;
                    dialogsActivity = this.parentFragment;
                    if (dialogsActivity == null) {
                        messageObject2 = null;
                    } else {
                        dialogsArray = dialogsActivity.getDialogsArray(i13, this.dialogsType, i2, false);
                        if (dialogsArray != null || dialogsArray.isEmpty()) {
                            messageObject2 = null;
                        } else {
                            int size2 = dialogsArray.size();
                            messageObject2 = null;
                            int i28 = 0;
                            while (i28 < size2) {
                                TLRPC.Dialog dialog3 = (TLRPC.Dialog) dialogsArray.get(i28);
                                LongSparseArray longSparseArray = MessagesController.getInstance(i13).dialogMessage;
                                int i29 = size2;
                                if (longSparseArray != null) {
                                    ArrayList arrayList5 = (ArrayList) longSparseArray.get(dialog3.id);
                                    MessageObject messageObject9 = (arrayList5 == null || arrayList5.isEmpty()) ? null : (MessageObject) arrayList5.get(0);
                                    if (messageObject9 != null && (messageObject2 == null || messageObject9.messageOwner.date > messageObject2.messageOwner.date)) {
                                        messageObject2 = messageObject9;
                                    }
                                    if (dialog3.pinnedNum == 0 && messageObject2 != null) {
                                        break;
                                    }
                                }
                                i28++;
                                size2 = i29;
                            }
                        }
                    }
                    this.message = messageObject2;
                    if (messageObject2 != null) {
                        dialogId = messageObject2.getDialogId();
                    } else {
                        dialogId = j;
                    }
                } else {
                    this.drawUnmute = false;
                    if (this.forumTopic != null) {
                        zIsDialogMuted = MessagesController.getInstance(i13).isDialogMuted(this.currentDialogId, j);
                        zIsDialogMuted2 = MessagesController.getInstance(i13).isDialogMuted(this.currentDialogId, this.forumTopic.id);
                        this.topicMuted = zIsDialogMuted2;
                        if (zIsDialogMuted == zIsDialogMuted2) {
                            this.dialogMuted = false;
                            this.drawUnmute = false;
                        } else {
                            this.dialogMuted = zIsDialogMuted2;
                            this.drawUnmute = !zIsDialogMuted2;
                        }
                    } else {
                        if (this.isDialogCell || !MessagesController.getInstance(i13).isDialogMuted(this.currentDialogId, getTopicId())) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        this.dialogMuted = z6;
                    }
                    dialogId = this.currentDialogId;
                    j = 0;
                }
                if (dialogId != j) {
                    if (DialogObject.isEncryptedDialog(dialogId)) {
                        encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(i13), dialogId);
                        this.encryptedChat = encryptedChatM;
                        if (encryptedChatM != null) {
                            this.user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.encryptedChat.user_id));
                        }
                    } else if (DialogObject.isUserDialog(dialogId)) {
                        this.user = MessagesController.getInstance(i13).getUser(Long.valueOf(dialogId));
                    } else {
                        TLRPC.Chat chat10 = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialogId));
                        this.chat = chat10;
                        if (!this.isDialogCell && chat10 != null && chat10.migrated_to != null && (chat4 = MessagesController.getInstance(i13).getChat(Long.valueOf(this.chat.migrated_to.channel_id))) != null) {
                            this.chat = chat4;
                        }
                    }
                    if (this.useMeForMyMessages && this.user != null && this.message.isOutOwner()) {
                        this.user = MessagesController.getInstance(i13).getUser(Long.valueOf(UserConfig.getInstance(i13).clientUserId));
                    }
                }
                if (this.insideCommunityList && ChatObject.isCommunity(this.chat) && this.isDialogCell) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.drawCommunityAvatar = z7;
                if (this.currentDialogFolderId != 0) {
                    Theme.dialogs_archiveAvatarDrawable.setCallback(this);
                    AvatarDrawable avatarDrawable4 = avatarDrawable;
                    avatarDrawable4.setAvatarType(2);
                    i3 = i13;
                    z8 = z19;
                    z9 = z20;
                    imageReceiver = imageReceiver2;
                    i4 = i16;
                    imageReceiver.setImage(null, null, avatarDrawable4, null, this.user, 0);
                } else {
                    i3 = i13;
                    z8 = z19;
                    z9 = z20;
                    avatarDrawable2 = avatarDrawable;
                    i4 = i16;
                    if (this.useFromUserAsAvatar || (messageObject = this.message) == null) {
                        imageReceiver = imageReceiver2;
                        imageReceiver = imageReceiver2;
                        user = this.user;
                        if (user != null) {
                            avatarDrawable2.setInfo(i3, user);
                            if (UserObject.isReplyUser(this.user)) {
                                avatarDrawable2.setAvatarType(12);
                                imageReceiver.setImage(null, null, avatarDrawable2, null, this.user, 0);
                            } else if (UserObject.isAnonymous(this.user)) {
                                avatarDrawable2.setAvatarType(21);
                                imageReceiver.setImage(null, null, avatarDrawable2, null, this.user, 0);
                            } else if (!UserObject.isUserSelf(this.user) && this.isSavedDialog && !this.isMonoForumTopicDialog) {
                                avatarDrawable2.setAvatarType(22);
                                imageReceiver.setImage(null, null, avatarDrawable2, null, this.user, 0);
                            } else if (UserObject.isUserSelf(this.user) || this.useMeForMyMessages || this.isMonoForumTopicDialog) {
                                imageReceiver.setForUserOrChat(this.user, avatarDrawable2, null, true, 1, false);
                            } else {
                                avatarDrawable2.setAvatarType(1);
                                imageReceiver.setImage(null, null, avatarDrawable2, null, this.user, 0);
                            }
                        } else {
                            chat = this.chat;
                            if (chat != null) {
                                if (chat.monoforum) {
                                    int i30 = ForumUtilities.$r8$clinit;
                                    if (ChatObject.isMonoForum(chat)) {
                                        chat2 = MessagesController.getInstance(i3).getChat(Long.valueOf(chat.linked_monoforum_id));
                                    } else {
                                        chat2 = null;
                                    }
                                    if (chat2 != null) {
                                        chat = chat2;
                                    }
                                    avatarDrawable2.setInfo(i3, chat);
                                    imageReceiver.setForUserOrChat(chat2, avatarDrawable2);
                                    avatarDrawable2.scaleSize = 1.0f;
                                } else {
                                    avatarDrawable2.setInfo(i3, chat);
                                    imageReceiver.setForUserOrChat(chat, avatarDrawable2);
                                }
                            }
                            if (z) {
                                if (i4 == this.unreadCount) {
                                    z13 = z9;
                                    if (z13 != this.markUnread) {
                                        i5 = i3;
                                    }
                                } else {
                                    z13 = z9;
                                }
                                if (this.isDialogCell) {
                                    i5 = i3;
                                    if (System.currentTimeMillis() - this.lastDialogChangedTime > 100) {
                                    }
                                } else {
                                    i5 = i3;
                                }
                                valueAnimator = this.countAnimator;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                this.countAnimator = valueAnimatorOfFloat;
                                valueAnimatorOfFloat.addUpdateListener(new DialogCell$$ExternalSyntheticLambda0(this, 0));
                                this.countAnimator.addListener(new AnonymousClass4(this, 0));
                                if ((i4 != 0 || this.markUnread) && (this.markUnread || !z13)) {
                                    this.countAnimator.setDuration(220L);
                                    this.countAnimator.setInterpolator(new OvershootInterpolator());
                                } else if (this.unreadCount == 0) {
                                    this.countAnimator.setDuration(150L);
                                    this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                } else {
                                    this.countAnimator.setDuration(430L);
                                    this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                }
                                if (this.drawCount || !this.drawCount2 || this.countLayout == null) {
                                    z3 = z3;
                                    z4 = z4;
                                } else {
                                    String str2 = String.format("%d", Integer.valueOf(i4));
                                    String str3 = String.format("%d", Integer.valueOf(this.unreadCount));
                                    if (str2.length() == str3.length()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str3);
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str3);
                                        int i31 = 0;
                                        while (i31 < str2.length()) {
                                            boolean z22 = z3;
                                            if (str2.charAt(i31) == str3.charAt(i31)) {
                                                boolean z23 = false;
                                                int i32 = i31 + 1;
                                                spannableStringBuilder.setSpan(new CountrySelectActivity.AnonymousClass5(z23), i31, i32, 0);
                                                spannableStringBuilder2.setSpan(new CountrySelectActivity.AnonymousClass5(z23), i31, i32, 0);
                                            } else {
                                                spannableStringBuilder3.setSpan(new CountrySelectActivity.AnonymousClass5(false), i31, i31 + 1, 0);
                                            }
                                            i31++;
                                            z3 = z22;
                                            z4 = z4;
                                        }
                                        z3 = z3;
                                        z4 = z4;
                                        int iMax = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str2)));
                                        TextPaint textPaint = Theme.dialogs_countTextPaint2;
                                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                        this.countOldLayout = new StaticLayout(spannableStringBuilder, textPaint, iMax, alignment, 1.0f, 0.0f, false);
                                        this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, Theme.dialogs_countTextPaint2, iMax, alignment, 1.0f, 0.0f, false);
                                        this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, Theme.dialogs_countTextPaint2, iMax, alignment, 1.0f, 0.0f, false);
                                    } else {
                                        z3 = z3;
                                        z4 = z4;
                                        this.countOldLayout = this.countLayout;
                                    }
                                }
                                this.countWidthOld = this.countWidth;
                                this.countLeftOld = this.countLeft;
                                if (this.unreadCount > i4) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                this.countAnimationIncrement = z14;
                                this.countAnimator.start();
                            } else {
                                i5 = i3;
                            }
                            if (this.pollVotesMentionCount != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.animatorPollVotesMentionVisible.setValue(z10, z);
                            if (this.reactionMentionCount != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z && z11 != z8) {
                                ValueAnimator valueAnimator2 = this.reactionsMentionsAnimator;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                this.reactionsMentionsChangeProgress = 0.0f;
                                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                this.reactionsMentionsAnimator = valueAnimatorOfFloat2;
                                valueAnimatorOfFloat2.addUpdateListener(new DialogCell$$ExternalSyntheticLambda0(this, 1));
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
                                TLRPC.Chat chat11 = this.chat;
                                iDp = (!(chat11 == null && chat11.forum && this.currentDialogFolderId == 0 && !this.useFromUserAsAvatar) && (this.isSavedDialog || (user2 = this.user) == null || !user2.self || !MessagesController.getInstance(i5).savedViewAsChats)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f);
                            }
                            imageReceiver.setRoundRadius(iDp);
                            z18 = z5;
                        }
                    } else {
                        imageReceiver = imageReceiver2;
                        avatarDrawable2.setInfo(i3, messageObject.getFromPeerObject());
                        imageReceiver.setForUserOrChat(this.message.getFromPeerObject(), avatarDrawable2);
                    }
                }
                if (z) {
                    i5 = i3;
                } else {
                    if (i4 == this.unreadCount) {
                        z13 = z9;
                        if (z13 != this.markUnread) {
                            i5 = i3;
                        }
                    } else {
                        z13 = z9;
                    }
                    if (this.isDialogCell) {
                        i5 = i3;
                        if (System.currentTimeMillis() - this.lastDialogChangedTime > 100) {
                        }
                    } else {
                        i5 = i3;
                    }
                    valueAnimator = this.countAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.countAnimator = valueAnimatorOfFloat3;
                    valueAnimatorOfFloat3.addUpdateListener(new DialogCell$$ExternalSyntheticLambda0(this, 0));
                    this.countAnimator.addListener(new AnonymousClass4(this, 0));
                    if (i4 != 0) {
                        this.countAnimator.setDuration(220L);
                        this.countAnimator.setInterpolator(new OvershootInterpolator());
                    } else {
                        this.countAnimator.setDuration(220L);
                        this.countAnimator.setInterpolator(new OvershootInterpolator());
                    }
                    if (this.drawCount) {
                        z3 = z3;
                        z4 = z4;
                    } else {
                        z3 = z3;
                        z4 = z4;
                    }
                    this.countWidthOld = this.countWidth;
                    this.countLeftOld = this.countLeft;
                    if (this.unreadCount > i4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.countAnimationIncrement = z14;
                    this.countAnimator.start();
                }
                if (this.pollVotesMentionCount != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.animatorPollVotesMentionVisible.setValue(z10, z);
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
                    TLRPC.Chat chat12 = this.chat;
                    if (chat12 == null) {
                    }
                }
                imageReceiver.setRoundRadius(iDp);
                z18 = z5;
            } else {
                avatarDrawable = avatarDrawable;
                i16 = i16;
            }
            z3 = false;
            z4 = false;
            z5 = false;
            if (i != 0) {
                user3 = this.user;
                if (user3 != null) {
                    this.user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.user.id));
                    if (this.wasDrawnOnline != isOnline()) {
                        z5 = true;
                    }
                }
                if ((i & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                    user4 = this.user;
                    swapAnimatedEmojiDrawable = this.emojiStatus;
                    if (user4 != null) {
                        user5 = MessagesController.getInstance(i13).getUser(Long.valueOf(this.user.id));
                        this.user = user5;
                        if (user5 != null) {
                            this.nameLayoutEllipsizeByGradient = true;
                            swapAnimatedEmojiDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                            swapAnimatedEmojiDrawable.setParticles(false, z);
                        } else {
                            this.nameLayoutEllipsizeByGradient = true;
                            swapAnimatedEmojiDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                            swapAnimatedEmojiDrawable.setParticles(false, z);
                        }
                        botVerificationIcon = DialogObject.getBotVerificationIcon(this.user);
                        z5 = true;
                    } else {
                        botVerificationIcon = j;
                    }
                    if (this.chat != null) {
                        chat8 = MessagesController.getInstance(i13).getChat(Long.valueOf(this.chat.id));
                        this.chat = chat8;
                        if (chat8 != null) {
                            this.nameLayoutEllipsizeByGradient = true;
                            swapAnimatedEmojiDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                            swapAnimatedEmojiDrawable.setParticles(false, z);
                        } else {
                            this.nameLayoutEllipsizeByGradient = true;
                            swapAnimatedEmojiDrawable.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                            swapAnimatedEmojiDrawable.setParticles(false, z);
                        }
                        botVerificationIcon = DialogObject.getBotVerificationIcon(this.chat);
                        z5 = true;
                    }
                    swapAnimatedEmojiDrawable2 = this.botVerification;
                    if (botVerificationIcon != j) {
                        z15 = !this.drawBotVerified;
                        swapAnimatedEmojiDrawable2.set(botVerificationIcon, z);
                    } else {
                        z15 = this.drawBotVerified;
                        swapAnimatedEmojiDrawable2.set((Drawable) null, z);
                    }
                } else {
                    z15 = false;
                }
                if (this.isDialogCell) {
                    CharSequence printingString2 = MessagesController.getInstance(i13).getPrintingString(this.currentDialogId, getTopicId(), true);
                    charSequence = this.lastPrintString;
                    if (charSequence == null) {
                    }
                } else {
                    CharSequence printingString3 = MessagesController.getInstance(i13).getPrintingString(this.currentDialogId, getTopicId(), true);
                    charSequence = this.lastPrintString;
                    z15 = charSequence == null ? true : true;
                }
                if (!z15) {
                    z15 = true;
                }
                if (!z15) {
                    chat7 = MessagesController.getInstance(i13).getChat(Long.valueOf(this.chat.id));
                    if (chat7 == null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z16 != this.hasCall) {
                        z15 = true;
                    }
                }
                if (!z15) {
                    forumFormattedNames = this.forumFormattedNames;
                    if (forumFormattedNames != null) {
                        while (r5.hasNext()) {
                            avatarSpan = (AvatarSpan) entry.getValue();
                            l = (Long) entry.getKey();
                            jLongValue = l.longValue();
                            if (jLongValue >= j) {
                                avatarSpan.setUser(MessagesController.getInstance(avatarSpan.currentAccount).getUser(l));
                            } else {
                                avatarSpan.setChat(MessagesController.getInstance(avatarSpan.currentAccount).getChat(Long.valueOf(-jLongValue)));
                            }
                        }
                    }
                    z15 = true;
                }
                if (!z15) {
                    z15 = true;
                }
                if (!z15) {
                    z15 = true;
                }
                if (!z15) {
                    z15 = true;
                }
                if (!z15) {
                    messageObject4 = this.message;
                    if (messageObject4 != null) {
                        this.lastUnreadState = this.message.isUnread();
                        z15 = true;
                    }
                    if (this.isDialogCell) {
                        dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.get(this.currentDialogId);
                        if (dialog == null) {
                            chat5 = null;
                        } else {
                            chat5 = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog.id));
                        }
                        if (chat5 == null) {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                archiveUnreadCount = MessagesStorage.getInstance(i13).getArchiveUnreadCount();
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount3 = MessagesController.getInstance(i13).getCommunityUnreadCount(-dialog.id);
                                i11 = communityUnreadCount3.unreadCount;
                                i10 = communityUnreadCount3.mentionCount;
                                i9 = communityUnreadCount3.reactionMentionCount;
                                i8 = communityUnreadCount3.pollVotesMentionCount;
                                this.hasUnmutedCommunityDialogs = communityUnreadCount3.hasUnmutedUnreadDialogs;
                                archiveUnreadCount = i11;
                            } else if (dialog != null) {
                                archiveUnreadCount = dialog.unread_count;
                                int i210 = dialog.unread_mentions_count;
                                int i211 = dialog.unread_reactions_count;
                                i8 = dialog.unread_poll_votes_count;
                                i9 = i211;
                                i10 = i210;
                            } else {
                                archiveUnreadCount = 0;
                            }
                            i10 = 0;
                            i9 = 0;
                            i8 = 0;
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                archiveUnreadCount = MessagesStorage.getInstance(i13).getArchiveUnreadCount();
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount4 = MessagesController.getInstance(i13).getCommunityUnreadCount(-dialog.id);
                                i11 = communityUnreadCount4.unreadCount;
                                i10 = communityUnreadCount4.mentionCount;
                                i9 = communityUnreadCount4.reactionMentionCount;
                                i8 = communityUnreadCount4.pollVotesMentionCount;
                                this.hasUnmutedCommunityDialogs = communityUnreadCount4.hasUnmutedUnreadDialogs;
                                archiveUnreadCount = i11;
                            } else if (dialog != null) {
                                archiveUnreadCount = dialog.unread_count;
                                int i212 = dialog.unread_mentions_count;
                                int i213 = dialog.unread_reactions_count;
                                i8 = dialog.unread_poll_votes_count;
                                i9 = i213;
                                i10 = i212;
                            } else {
                                archiveUnreadCount = 0;
                            }
                            i10 = 0;
                            i9 = 0;
                            i8 = 0;
                        }
                        if (ChatObject.isMonoForum(chat5)) {
                            i10 = 0;
                        }
                        if (dialog != null) {
                            this.unreadCount = archiveUnreadCount;
                            this.mentionCount = i10;
                            this.markUnread = dialog.unread_mark;
                            this.reactionMentionCount = i9;
                            this.pollVotesMentionCount = i8;
                            z15 = true;
                        }
                    }
                }
                if (!z15) {
                    i6 = this.lastSendState;
                    i7 = messageObject3.messageOwner.send_state;
                    if (i6 != i7) {
                        this.lastSendState = i7;
                        z15 = true;
                    }
                }
                if (!z15) {
                    if (StoryViewer.animationInProgress) {
                        return z3;
                    }
                    super.invalidate();
                    return z3;
                }
            }
            this.user = null;
            this.chat = null;
            this.encryptedChat = null;
            if (this.currentDialogCommunityId != j) {
                this.message = MessagesController.getInstance(i13).findCommunityLastMessage(this.currentDialogCommunityId);
            }
            i2 = this.currentDialogFolderId;
            if (i2 != 0) {
                this.dialogMuted = false;
                this.drawUnmute = false;
                dialogsActivity = this.parentFragment;
                if (dialogsActivity == null) {
                    messageObject2 = null;
                } else {
                    dialogsArray = dialogsActivity.getDialogsArray(i13, this.dialogsType, i2, false);
                    if (dialogsArray != null) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = null;
                    }
                }
                this.message = messageObject2;
                if (messageObject2 != null) {
                    dialogId = messageObject2.getDialogId();
                } else {
                    dialogId = j;
                }
            } else {
                this.drawUnmute = false;
                if (this.forumTopic != null) {
                    zIsDialogMuted = MessagesController.getInstance(i13).isDialogMuted(this.currentDialogId, j);
                    zIsDialogMuted2 = MessagesController.getInstance(i13).isDialogMuted(this.currentDialogId, this.forumTopic.id);
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
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    this.dialogMuted = z6;
                }
                dialogId = this.currentDialogId;
                j = 0;
            }
            if (dialogId != j) {
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(i13), dialogId);
                    this.encryptedChat = encryptedChatM;
                    if (encryptedChatM != null) {
                        this.user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.encryptedChat.user_id));
                    }
                } else if (DialogObject.isUserDialog(dialogId)) {
                    this.user = MessagesController.getInstance(i13).getUser(Long.valueOf(dialogId));
                } else {
                    TLRPC.Chat chat13 = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialogId));
                    this.chat = chat13;
                    if (!this.isDialogCell) {
                        this.chat = chat4;
                    }
                }
                if (this.useMeForMyMessages) {
                    this.user = MessagesController.getInstance(i13).getUser(Long.valueOf(UserConfig.getInstance(i13).clientUserId));
                }
            }
            if (this.insideCommunityList) {
                z7 = false;
            } else {
                z7 = false;
            }
            this.drawCommunityAvatar = z7;
            if (this.currentDialogFolderId != 0) {
                Theme.dialogs_archiveAvatarDrawable.setCallback(this);
                AvatarDrawable avatarDrawable5 = avatarDrawable;
                avatarDrawable5.setAvatarType(2);
                i3 = i13;
                z8 = z19;
                z9 = z20;
                imageReceiver = imageReceiver2;
                i4 = i16;
                imageReceiver.setImage(null, null, avatarDrawable5, null, this.user, 0);
            } else {
                i3 = i13;
                z8 = z19;
                z9 = z20;
                avatarDrawable2 = avatarDrawable;
                i4 = i16;
                if (this.useFromUserAsAvatar) {
                    imageReceiver = imageReceiver2;
                    imageReceiver = imageReceiver2;
                    user = this.user;
                    if (user != null) {
                        avatarDrawable2.setInfo(i3, user);
                        if (UserObject.isReplyUser(this.user)) {
                            avatarDrawable2.setAvatarType(12);
                            imageReceiver.setImage(null, null, avatarDrawable2, null, this.user, 0);
                        } else if (UserObject.isAnonymous(this.user)) {
                            avatarDrawable2.setAvatarType(21);
                            imageReceiver.setImage(null, null, avatarDrawable2, null, this.user, 0);
                        } else if (!UserObject.isUserSelf(this.user)) {
                            if (UserObject.isUserSelf(this.user)) {
                                imageReceiver.setForUserOrChat(this.user, avatarDrawable2, null, true, 1, false);
                            } else {
                                imageReceiver.setForUserOrChat(this.user, avatarDrawable2, null, true, 1, false);
                            }
                        } else if (UserObject.isUserSelf(this.user)) {
                            imageReceiver.setForUserOrChat(this.user, avatarDrawable2, null, true, 1, false);
                        } else {
                            imageReceiver.setForUserOrChat(this.user, avatarDrawable2, null, true, 1, false);
                        }
                    } else {
                        chat = this.chat;
                        if (chat != null) {
                            if (chat.monoforum) {
                                int i33 = ForumUtilities.$r8$clinit;
                                if (ChatObject.isMonoForum(chat)) {
                                    chat2 = MessagesController.getInstance(i3).getChat(Long.valueOf(chat.linked_monoforum_id));
                                } else {
                                    chat2 = null;
                                }
                                if (chat2 != null) {
                                    chat = chat2;
                                }
                                avatarDrawable2.setInfo(i3, chat);
                                imageReceiver.setForUserOrChat(chat2, avatarDrawable2);
                                avatarDrawable2.scaleSize = 1.0f;
                            } else {
                                avatarDrawable2.setInfo(i3, chat);
                                imageReceiver.setForUserOrChat(chat, avatarDrawable2);
                            }
                        }
                    }
                } else {
                    imageReceiver = imageReceiver2;
                    imageReceiver = imageReceiver2;
                    user = this.user;
                    if (user != null) {
                        avatarDrawable2.setInfo(i3, user);
                        if (UserObject.isReplyUser(this.user)) {
                            avatarDrawable2.setAvatarType(12);
                            imageReceiver.setImage(null, null, avatarDrawable2, null, this.user, 0);
                        } else if (UserObject.isAnonymous(this.user)) {
                            avatarDrawable2.setAvatarType(21);
                            imageReceiver.setImage(null, null, avatarDrawable2, null, this.user, 0);
                        } else if (!UserObject.isUserSelf(this.user)) {
                            if (UserObject.isUserSelf(this.user)) {
                                imageReceiver.setForUserOrChat(this.user, avatarDrawable2, null, true, 1, false);
                            } else {
                                imageReceiver.setForUserOrChat(this.user, avatarDrawable2, null, true, 1, false);
                            }
                        } else if (UserObject.isUserSelf(this.user)) {
                            imageReceiver.setForUserOrChat(this.user, avatarDrawable2, null, true, 1, false);
                        } else {
                            imageReceiver.setForUserOrChat(this.user, avatarDrawable2, null, true, 1, false);
                        }
                    } else {
                        chat = this.chat;
                        if (chat != null) {
                            if (chat.monoforum) {
                                int i34 = ForumUtilities.$r8$clinit;
                                if (ChatObject.isMonoForum(chat)) {
                                    chat2 = MessagesController.getInstance(i3).getChat(Long.valueOf(chat.linked_monoforum_id));
                                } else {
                                    chat2 = null;
                                }
                                if (chat2 != null) {
                                    chat = chat2;
                                }
                                avatarDrawable2.setInfo(i3, chat);
                                imageReceiver.setForUserOrChat(chat2, avatarDrawable2);
                                avatarDrawable2.scaleSize = 1.0f;
                            } else {
                                avatarDrawable2.setInfo(i3, chat);
                                imageReceiver.setForUserOrChat(chat, avatarDrawable2);
                            }
                        }
                    }
                }
                if (z) {
                    i5 = i3;
                } else {
                    if (i4 == this.unreadCount) {
                        z13 = z9;
                        if (z13 != this.markUnread) {
                            i5 = i3;
                        }
                    } else {
                        z13 = z9;
                    }
                    if (this.isDialogCell) {
                        i5 = i3;
                        if (System.currentTimeMillis() - this.lastDialogChangedTime > 100) {
                        }
                    } else {
                        i5 = i3;
                    }
                    valueAnimator = this.countAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.countAnimator = valueAnimatorOfFloat4;
                    valueAnimatorOfFloat4.addUpdateListener(new DialogCell$$ExternalSyntheticLambda0(this, 0));
                    this.countAnimator.addListener(new AnonymousClass4(this, 0));
                    if (i4 != 0) {
                        this.countAnimator.setDuration(220L);
                        this.countAnimator.setInterpolator(new OvershootInterpolator());
                    } else {
                        this.countAnimator.setDuration(220L);
                        this.countAnimator.setInterpolator(new OvershootInterpolator());
                    }
                    if (this.drawCount) {
                        z3 = z3;
                        z4 = z4;
                    } else {
                        z3 = z3;
                        z4 = z4;
                    }
                    this.countWidthOld = this.countWidth;
                    this.countLeftOld = this.countLeft;
                    if (this.unreadCount > i4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.countAnimationIncrement = z14;
                    this.countAnimator.start();
                }
                if (this.pollVotesMentionCount != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.animatorPollVotesMentionVisible.setValue(z10, z);
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
                imageReceiver.setRoundRadius(iDp);
                z18 = z5;
            }
            if (z) {
                i5 = i3;
            } else {
                if (i4 == this.unreadCount) {
                    z13 = z9;
                    if (z13 != this.markUnread) {
                        i5 = i3;
                    }
                } else {
                    z13 = z9;
                }
                if (this.isDialogCell) {
                    i5 = i3;
                    if (System.currentTimeMillis() - this.lastDialogChangedTime > 100) {
                    }
                } else {
                    i5 = i3;
                }
                valueAnimator = this.countAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.countAnimator = valueAnimatorOfFloat5;
                valueAnimatorOfFloat5.addUpdateListener(new DialogCell$$ExternalSyntheticLambda0(this, 0));
                this.countAnimator.addListener(new AnonymousClass4(this, 0));
                if (i4 != 0) {
                    this.countAnimator.setDuration(220L);
                    this.countAnimator.setInterpolator(new OvershootInterpolator());
                } else {
                    this.countAnimator.setDuration(220L);
                    this.countAnimator.setInterpolator(new OvershootInterpolator());
                }
                if (this.drawCount) {
                    z3 = z3;
                    z4 = z4;
                } else {
                    z3 = z3;
                    z4 = z4;
                }
                this.countWidthOld = this.countWidth;
                this.countLeftOld = this.countLeft;
                if (this.unreadCount > i4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.countAnimationIncrement = z14;
                this.countAnimator.start();
            }
            if (this.pollVotesMentionCount != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.animatorPollVotesMentionVisible.setValue(z10, z);
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
                TLRPC.Chat chat15 = this.chat;
                if (chat15 == null) {
                }
            }
            imageReceiver.setRoundRadius(iDp);
            z18 = z5;
        }
        boolean z24 = (this.isTopic || (getMeasuredWidth() == 0 && getMeasuredHeight() == 0)) ? z4 : true;
        if (!z18) {
            int i35 = this.storyParams.currentState;
            StoriesUtilities.getPredictiveUnreadState(MessagesController.getInstance(i5).getStoriesController(), getDialogId());
        }
        if (!z) {
            this.dialogMutedProgress = (this.dialogMuted || this.drawUnmute) ? 1.0f : 0.0f;
            ValueAnimator valueAnimator3 = this.countAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        if (isForumCell() != z2) {
            z3 = true;
        }
        if (z24) {
            if (this.attachedToWindow) {
                buildLayout$1();
            } else {
                this.updateLayout = true;
            }
        }
        updatePremiumBlocked(z);
        return z3;
    }

    @Override
    public final void updateColors$1() {
    }

    public final void updateMessageThumbs() {
        TLRPC.Message message;
        int i;
        Object obj;
        boolean z;
        ?? r14;
        TLObject tLObject;
        TLRPC.PhotoSize strippedPhotoSize;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        TLObject tLObject2;
        MessageObject messageObject = this.message;
        if (messageObject == null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason);
        MessageObject messageObject2 = this.message;
        int i5 = 3;
        TLRPC.PhotoSize photoSize2 = null;
        boolean z4 = false;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.thumbsCount = 0;
                this.hasVideoThumb = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i6 = 0;
                int i7 = 0;
                while (i6 < tL_messageMediaPaidMedia.extended_media.size() && this.thumbsCount < i5) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i6);
                    boolean z5 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
                    boolean[] zArr = this.drawSpoiler;
                    boolean[] zArr2 = this.drawPlay;
                    ImageReceiver[] imageReceiverArr = this.thumbImage;
                    if (z5) {
                        i = i7 + 1;
                        TLRPC.PhotoSize photoSize3 = ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb;
                        if (i7 < i5 && photoSize3 != null) {
                            this.hasVideoThumb = z4;
                            int i8 = this.thumbsCount;
                            if (i8 < i5) {
                                this.thumbsCount = i8 + 1;
                                zArr2[i7] = z4;
                                zArr[i7] = true;
                                imageReceiverArr[i7].setImage(ImageLocation.getForObject(photoSize3, this.message.messageOwner), "2_2_b", null, null, z4 ? 1L : 0L, null, this.message, 0);
                                imageReceiverArr[i7].setRoundRadius(AndroidUtilities.dp(2.0f));
                                this.needEmoji = z4;
                            }
                        }
                    } else {
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                            i = i7 + 1;
                            TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                TLRPC.Photo photo = messageMedia2.photo;
                                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                                tLObject2 = photo;
                                obj = arrayList;
                            } else {
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                                    boolean zIsVideoDocument = MessageObject.isVideoDocument(messageMedia2.document);
                                    TLRPC.Document document = messageMedia2.document;
                                    z = zIsVideoDocument;
                                    r14 = document.thumbs;
                                    tLObject = document;
                                } else {
                                    TLRPC.PhotoSize photoSize4 = photoSize2;
                                    obj = photoSize4;
                                    tLObject2 = photoSize4;
                                }
                                strippedPhotoSize = FileLoader.getStrippedPhotoSize(r14);
                                if (strippedPhotoSize == null) {
                                    strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(r14, 40);
                                }
                                photoSize = strippedPhotoSize;
                                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(r14, AndroidUtilities.getPhotoSize(), z4, photoSize2, true);
                                if (photoSize == closestPhotoSizeWithSize) {
                                    closestPhotoSizeWithSize = photoSize2;
                                }
                                if (closestPhotoSizeWithSize != null) {
                                    i2 = i7;
                                    z2 = false;
                                    if (!DownloadController.getInstance(this.currentAccount).canDownloadMedia(1, closestPhotoSizeWithSize.size)) {
                                    }
                                    if (photoSize != null) {
                                        if (!this.hasVideoThumb || z) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        this.hasVideoThumb = z3;
                                        i3 = this.thumbsCount;
                                        if (i3 < 3) {
                                            this.thumbsCount = i3 + 1;
                                            zArr2[i2] = z;
                                            zArr[i2] = z2;
                                            if (!z || closestPhotoSizeWithSize == null) {
                                                i4 = 0;
                                            } else {
                                                i4 = closestPhotoSizeWithSize.size;
                                            }
                                            imageReceiverArr[i2].setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, tLObject), "20_20", ImageLocation.getForObject(photoSize, tLObject), "20_20", i4, null, this.message, 0);
                                            imageReceiverArr[i2].setRoundRadius(AndroidUtilities.dp(2.0f));
                                            this.needEmoji = false;
                                        }
                                    }
                                } else {
                                    i2 = i7;
                                    z2 = false;
                                }
                                closestPhotoSizeWithSize = photoSize;
                                if (photoSize != null) {
                                    if (this.hasVideoThumb) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    this.hasVideoThumb = z3;
                                    i3 = this.thumbsCount;
                                    if (i3 < 3) {
                                        this.thumbsCount = i3 + 1;
                                        zArr2[i2] = z;
                                        zArr[i2] = z2;
                                        if (z) {
                                            i4 = 0;
                                        } else {
                                            i4 = 0;
                                        }
                                        imageReceiverArr[i2].setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, tLObject), "20_20", ImageLocation.getForObject(photoSize, tLObject), "20_20", i4, null, this.message, 0);
                                        imageReceiverArr[i2].setRoundRadius(AndroidUtilities.dp(2.0f));
                                        this.needEmoji = false;
                                    }
                                }
                            }
                            z = false;
                            tLObject = tLObject2;
                            r14 = obj;
                            strippedPhotoSize = FileLoader.getStrippedPhotoSize(r14);
                            if (strippedPhotoSize == null) {
                                strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(r14, 40);
                            }
                            photoSize = strippedPhotoSize;
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(r14, AndroidUtilities.getPhotoSize(), z4, photoSize2, true);
                            if (photoSize == closestPhotoSizeWithSize) {
                                closestPhotoSizeWithSize = photoSize2;
                            }
                            if (closestPhotoSizeWithSize != null) {
                                i2 = i7;
                                z2 = false;
                                if (!DownloadController.getInstance(this.currentAccount).canDownloadMedia(1, closestPhotoSizeWithSize.size)) {
                                }
                                if (photoSize != null) {
                                    if (this.hasVideoThumb) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    this.hasVideoThumb = z3;
                                    i3 = this.thumbsCount;
                                    if (i3 < 3) {
                                        this.thumbsCount = i3 + 1;
                                        zArr2[i2] = z;
                                        zArr[i2] = z2;
                                        if (z) {
                                            i4 = 0;
                                        } else {
                                            i4 = 0;
                                        }
                                        imageReceiverArr[i2].setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, tLObject), "20_20", ImageLocation.getForObject(photoSize, tLObject), "20_20", i4, null, this.message, 0);
                                        imageReceiverArr[i2].setRoundRadius(AndroidUtilities.dp(2.0f));
                                        this.needEmoji = false;
                                    }
                                }
                            } else {
                                i2 = i7;
                                z2 = false;
                            }
                            closestPhotoSizeWithSize = photoSize;
                            if (photoSize != null) {
                                if (this.hasVideoThumb) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                this.hasVideoThumb = z3;
                                i3 = this.thumbsCount;
                                if (i3 < 3) {
                                    this.thumbsCount = i3 + 1;
                                    zArr2[i2] = z;
                                    zArr[i2] = z2;
                                    if (z) {
                                        i4 = 0;
                                    } else {
                                        i4 = 0;
                                    }
                                    imageReceiverArr[i2].setImage(ImageLocation.getForObject(closestPhotoSizeWithSize, tLObject), "20_20", ImageLocation.getForObject(photoSize, tLObject), "20_20", i4, null, this.message, 0);
                                    imageReceiverArr[i2].setRoundRadius(AndroidUtilities.dp(2.0f));
                                    this.needEmoji = false;
                                }
                            }
                        }
                        i6++;
                        i5 = 3;
                        photoSize2 = null;
                        z4 = false;
                    }
                    i7 = i;
                    i6++;
                    i5 = 3;
                    photoSize2 = null;
                    z4 = false;
                }
                return;
            }
        }
        ArrayList arrayList2 = this.groupMessages;
        if (arrayList2 != null && arrayList2.size() > 1 && TextUtils.isEmpty(restrictionReason) && this.currentDialogFolderId == 0 && this.encryptedChat == null) {
            this.thumbsCount = 0;
            this.hasVideoThumb = false;
            Collections.sort(this.groupMessages, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(2)));
            for (int i9 = 0; i9 < Math.min(3, this.groupMessages.size()); i9++) {
                MessageObject messageObject3 = (MessageObject) this.groupMessages.get(i9);
                if (messageObject3 != null && !messageObject3.needDrawBluredPreview() && (messageObject3.isPhoto() || messageObject3.isNewGif() || messageObject3.isVideo() || messageObject3.isRoundVideo() || messageObject3.isStoryMedia())) {
                    String str = messageObject3.isWebpage() ? messageObject3.messageOwner.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        setThumb(messageObject3, i9);
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
                setThumb(this.message, 0);
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
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
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
                    boolean[] zArr = this.thumbImageSeen;
                    if (fixedWidthSpanArr == null || fixedWidthSpanArr.length <= 0) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            zArr[i2] = false;
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
                        zArr[i3] = true;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
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
        update(0, true);
        TLRPC.User user2 = this.user;
        int i = this.currentAccount;
        if (user2 != null && (user = MessagesController.getInstance(i).getUser(Long.valueOf(this.user.id))) != null) {
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
                ChatThemeController.getInstance(i).setDialogTheme(this.currentDialogId, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
            }
        }
        checkTtl();
    }

    public final void setDialog(long j, MessageObject messageObject, int i, boolean z, boolean z2) {
        if (this.currentDialogId != j) {
            this.lastStatusDrawableParams = -1;
        }
        this.currentDialogId = j;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.message = messageObject;
        this.useMeForMyMessages = z;
        this.isDialogCell = false;
        this.lastMessageDate = i;
        if (messageObject != null) {
            int i2 = messageObject.messageOwner.edit_date;
        }
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
}
