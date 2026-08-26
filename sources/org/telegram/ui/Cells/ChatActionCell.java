package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CommunityAvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SuggestBirthdayActionLayout;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TopicSeparator;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Gifts.GiftMessageDrawable;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.UploadingDotsSpannable;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.CommunityUtils;

public class ChatActionCell extends BaseCell implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, IMessageCell {
    private static final boolean USE_PREMIUM_GIFT_LOCAL_STICKER = false;
    private static final boolean USE_PREMIUM_GIFT_MONTHS_AS_EMOJI_NUMBERS = false;
    private static Map<Integer, String> monthsToEmoticon;
    private int TAG;
    private SpannableStringBuilder accessibilityText;
    private boolean actionPressed;
    private int adaptiveEmojiColor;
    private ColorFilter adaptiveEmojiColorFilter;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    private boolean attachedToWindow;
    private AvatarDrawable avatarDrawable;
    StoriesUtilities.AvatarStoryParams avatarStoryParams;
    private int backgroundButtonTop;
    private int backgroundHeight;
    private int backgroundLeft;
    private Path backgroundPath;
    private final Path backgroundPath2;
    private RectF backgroundRect;
    private int backgroundRectHeight;
    private int backgroundRight;
    public SuggestBirthdayActionLayout birthdayLayout;
    private final Path botButtonPath;
    private final float[] botButtonRadii;
    private ArrayList<BotButton> botButtons;
    private BotInlineKeyboard.Source botInlineButtons;
    private final ButtonBounce bounce;
    private boolean buttonClickableAsImage;
    private boolean canDrawInParent;
    private GiftSheet.CardBackground cardBackground;
    private Path clipPath;
    private int currentAccount;
    private MessageObject currentMessageObject;
    private ImageLocation currentVideoLocation;
    private int customDate;
    private CharSequence customText;
    private ChatActionCellDelegate delegate;
    private float dimAmount;
    private final Paint dimPaint;
    public boolean firstInChat;
    private boolean forceWasUnread;
    private boolean giftButtonPressed;
    private RectF giftButtonRect;
    private TLRPC.VideoSize giftEffectAnimation;
    private int giftPremiumAdditionalHeight;
    private StaticLayout giftPremiumButtonLayout;
    private float giftPremiumButtonWidth;
    private Text giftPremiumReleasedText;
    private StaticLayout giftPremiumSubtitleLayout;
    private TextLayout giftPremiumText;
    private GradientClip giftPremiumTextClip;
    private boolean giftPremiumTextCollapsed;
    private int giftPremiumTextCollapsedHeight;
    private AnimatedFloat giftPremiumTextExpandedAnimated;
    private Text giftPremiumTextMore;
    private int giftPremiumTextMoreH;
    private int giftPremiumTextMoreX;
    private int giftPremiumTextMoreY;
    private boolean giftPremiumTextUncollapsed;
    private StaticLayout giftPremiumTitleLayout;
    private boolean giftRectEmpty;
    private int giftRectSize;
    private Paint giftReleasedBackgroundPaint;
    private CornerPathEffect giftRibbonPaintEffect;
    private ColorMatrixColorFilter giftRibbonPaintFilter;
    private boolean giftRibbonPaintFilterDark;
    private Path giftRibbonPath;
    private Text giftRibbonText;
    private TLRPC.Document giftSticker;
    private ImageReceiver.ImageReceiverDelegate giftStickerDelegate;
    private TextPaint giftSubtitlePaint;
    private TextPaint giftTextPaint;
    private TextPaint giftTitlePaint;
    private boolean hasReplyMessage;
    private boolean imagePressed;
    private ImageReceiver imageReceiver;
    private boolean invalidateColors;
    private Runnable invalidateListener;
    private boolean invalidatePath;
    private View invalidateWithParent;
    private boolean invalidatesParent;
    public boolean isAllChats;
    public boolean isBotForum;
    public boolean isForum;
    public boolean isMonoForum;
    public boolean isSideMenuEnabled;
    public boolean isSideMenued;
    private boolean isSpoilerRevealing;
    private float lastTouchX;
    private float lastTouchY;
    private ArrayList<Integer> lineHeights;
    private ArrayList<Integer> lineWidths;
    private LoadingDrawable loadingDrawable;
    private boolean offerExpired;
    private View.OnClickListener onActionClick;
    private int overriddenMaxWidth;
    private int overrideBackground;
    private Paint overrideBackgroundPaint;
    private int overrideColor;
    private int overrideText;
    private TextPaint overrideTextPaint;
    private int pressedBotButton;
    private URLSpan pressedLink;
    private final int[] pressedState;
    private int previousWidth;
    float progressToProgress;
    RadialProgressView progressView;
    private RadialProgress2 radialProgress;
    private final float[] radii;
    public final ReactionsLayoutInBubble reactionsLayoutInBubble;
    private RectF rect;
    private View rippleView;
    private StaticLayout settingWallpaperLayout;
    TextPaint settingWallpaperPaint;
    private float settingWallpaperProgress;
    private StaticLayout settingWallpaperProgressTextLayout;
    public boolean showTopicSeparator;
    public float sideMenuAlpha;
    public int sideMenuWidth;
    private SpoilerEffect spoilerPressed;
    public List<SpoilerEffect> spoilers;
    private Stack<SpoilerEffect> spoilersPool;
    public final StarGiftUniqueActionLayout starGiftLayout;
    public float starGiftLayoutX;
    public float starGiftLayoutY;
    private StarParticlesView.Drawable starParticlesDrawable;
    private Path starsPath;
    private int starsSize;
    private int stickerSize;
    private int textHeight;
    private StaticLayout textLayout;
    TextPaint textPaint;
    private boolean textPressed;
    private int textWidth;
    private int textX;
    private int textXLeft;
    private int textY;
    private Theme.ResourcesProvider themeDelegate;
    private int titleHeight;
    private StaticLayout titleLayout;
    private int titleXLeft;
    public TopicSeparator topicSeparator;
    private int topicSeparatorTopPadding;
    public final TransitionParams transitionParams;
    private ColoredImageSpan upgradeIconSpan;
    private float viewTop;
    private float viewTranslationX;
    private boolean visiblePartSet;
    private Drawable wallpaperPreviewDrawable;
    private boolean wasLayout;

    public interface ChatActionCellDelegate {
        boolean canDrawOutboundsContent();

        void didClickButton(ChatActionCell chatActionCell);

        void didClickImage(ChatActionCell chatActionCell);

        boolean didLongPress(ChatActionCell chatActionCell, float f, float f2);

        void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z);

        void didOpenPremiumGiftChannel(ChatActionCell chatActionCell, String str, boolean z);

        void didPressReaction(ChatActionCell chatActionCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2);

        void didPressReplyMessage(ChatActionCell chatActionCell, int i);

        void didPressTaskLink(ChatActionCell chatActionCell, int i, int i2);

        void forceUpdate(ChatActionCell chatActionCell, boolean z);

        BaseFragment getBaseFragment();

        long getDialogId();

        long getTopicId();

        void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported);

        void needOpenUserProfile(long j);

        void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize);

        void onTopicClick(ChatActionCell chatActionCell);
    }

    public final class TextLayout {
        public AnimatedEmojiSpan.EmojiGroupedSpans emoji;
        public StaticLayout layout;
        public TextPaint paint;
        public int width;
        public float x;
        public float y;
        public final ArrayList spoilers = new ArrayList();
        public final AtomicReference patchedLayout = new AtomicReference();

        public TextLayout() {
        }

        public final void setText(CharSequence charSequence, TextPaint textPaint, int i) {
            this.paint = textPaint;
            this.width = i;
            this.layout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
            ChatActionCell chatActionCell = ChatActionCell.this;
            MessageObject messageObject = chatActionCell.currentMessageObject;
            ArrayList arrayList = this.spoilers;
            if (messageObject == null || !chatActionCell.currentMessageObject.isSpoilersRevealed) {
                SpoilerEffect.addSpoilers(ChatActionCell.this, this.layout, -1, i, null, arrayList);
            } else if (arrayList != null) {
                arrayList.clear();
            }
            this.emoji = AnimatedEmojiSpan.update(0, (View) chatActionCell, false, this.emoji, this.layout);
        }
    }

    public final class TransitionParams {
        public boolean animateChange;
        public float animateChangeProgress = 1.0f;
        public boolean wasDraw;

        public TransitionParams() {
        }

        public final void recordDrawingState() {
            this.wasDraw = true;
            ChatActionCell.this.reactionsLayoutInBubble.recordDrawingState();
        }
    }

    static {
        HashMap map = new HashMap();
        monthsToEmoticon = map;
        map.put(1, "1⃣");
        monthsToEmoticon.put(3, "2⃣");
        monthsToEmoticon.put(6, "3⃣");
        monthsToEmoticon.put(12, "4⃣");
        monthsToEmoticon.put(24, "5⃣");
    }

    public ChatActionCell(Context context) {
        this(context, false, null);
    }

    public static SpannableStringBuilder createOption(int i, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            Theme$$ExternalSyntheticApiModelOutline3.m1072m$1();
            spannableStringBuilder.setSpan(Theme$$ExternalSyntheticApiModelOutline3.m(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private void setStarsPaused(boolean z) {
        StarParticlesView.Drawable drawable = this.starParticlesDrawable;
        if (z == drawable.paused) {
            return;
        }
        drawable.paused = z;
        if (z) {
            drawable.pausedTime = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < this.starParticlesDrawable.particles.size(); i++) {
            StarParticlesView.Drawable.Particle particle = this.starParticlesDrawable.particles.get(i);
            particle.lifeTime = (System.currentTimeMillis() - this.starParticlesDrawable.pausedTime) + particle.lifeTime;
        }
        invalidate();
    }

    public final void buildLayout$1() {
        long j;
        CharSequence charSequenceReplaceCharSequence;
        CharSequence charSequence;
        int i;
        TLRPC.User user;
        CharSequence charSequenceReplaceTags;
        long dialogId;
        TLRPC.User user2;
        CharSequence charSequence2;
        CharSequence string;
        CharSequence charSequence3;
        boolean z;
        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto;
        long dialogId2;
        TLRPC.User user3;
        boolean z2;
        CharSequence string2;
        CharSequence string3;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.User user4;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        TLRPC.MessageAction messageAction;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        CharSequence string4;
        MessageObject messageObject;
        int i2;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction2;
        long peerDialogId;
        boolean z3;
        String strM;
        long fromChatId;
        String string5;
        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest;
        SpannableStringBuilder spannableStringBuilder;
        String shortName;
        CharSequence charSequenceReplaceTags2;
        CharSequence charSequenceReplaceTags3;
        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer;
        SpannableStringBuilder spannableStringBuilder2;
        int iMax;
        String shortDuration2;
        TLRPC.User user5;
        TLRPC.MessageAction messageAction3;
        TLRPC.TL_messageActionStarGift tL_messageActionStarGift;
        long j2;
        long clientUserId;
        TLRPC.Peer peer;
        boolean z4;
        boolean z5;
        long fromChatId2;
        SpannableStringBuilder spannableStringBuilder3;
        TLObject userOrChat;
        long peerDialogId2;
        boolean z6;
        long j3;
        boolean z7;
        int i3;
        TL_stars.StarGift starGift;
        String str;
        boolean z8;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        CharSequence charSequenceReplaceTags4;
        String string6;
        TL_stars.StarGift starGift2;
        String string7;
        CharSequence string8;
        CharSequence charSequence4;
        TL_stars.StarGift starGift3;
        SpannableStringBuilder spannableStringBuilderReplaceSingleTagToLink;
        String publicUsername;
        char c;
        Object objValueOf;
        TLRPC.Peer peer2;
        String string9;
        TLRPC.MessageAction messageAction4;
        TLRPC.Message message2;
        TLRPC.MessageAction messageAction5;
        int i4;
        TLRPC.Chat chat;
        TLRPC.User user6;
        String name;
        CharSequence charSequenceReplaceCharSequence2;
        TLRPC.Message message3;
        TLRPC.MessageMedia messageMedia;
        this.giftRectEmpty = false;
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null) {
            if (messageObject2.isExpiredStory()) {
                charSequenceReplaceCharSequence = messageObject2.messageOwner.media.user_id != UserConfig.getInstance(this.currentAccount).getClientUserId() ? StoriesUtilities.createExpiredStoryString(R.string.ExpiredStoryMention, true, new Object[0]) : StoriesUtilities.createExpiredStoryString(R.string.ExpiredStoryMentioned, true, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())).first_name);
            } else {
                ChatActionCellDelegate chatActionCellDelegate = this.delegate;
                if (chatActionCellDelegate != null && chatActionCellDelegate.getTopicId() == 0 && MessageObject.isTopicActionMessage(messageObject2)) {
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-messageObject2.getDialogId(), MessageObject.getTopicId(this.currentAccount, messageObject2.messageOwner, true));
                    int i5 = ForumUtilities.$r8$clinit;
                    if (tL_forumTopicFindTopic == null) {
                        j = 0;
                        charSequenceReplaceCharSequence = null;
                    } else {
                        TLRPC.MessageAction messageAction6 = messageObject2.messageOwner.action;
                        if (messageAction6 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequenceReplaceCharSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), ForumUtilities.getTopicSpannedName(tL_forumTopicFindTopic, null, null));
                        } else {
                            if (messageAction6 instanceof TLRPC.TL_messageActionTopicEdit) {
                                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction6;
                                long fromChatId3 = messageObject2.getFromChatId();
                                if (DialogObject.isUserDialog(fromChatId3)) {
                                    user6 = MessagesController.getInstance(messageObject2.currentAccount).getUser(Long.valueOf(fromChatId3));
                                    chat = null;
                                } else {
                                    chat = MessagesController.getInstance(messageObject2.currentAccount).getChat(Long.valueOf(-fromChatId3));
                                    user6 = null;
                                }
                                if (user6 != null) {
                                    name = ContactsController.formatName(user6.first_name, user6.last_name);
                                } else {
                                    name = chat != null ? chat.title : null;
                                }
                                int i6 = tL_messageActionTopicEdit.flags;
                                if ((i6 & 8) != 0) {
                                    charSequenceReplaceCharSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(tL_messageActionTopicEdit.hidden ? R.string.TopicHidden2 : R.string.TopicShown2), name);
                                } else if ((i6 & 4) != 0) {
                                    charSequenceReplaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(tL_messageActionTopicEdit.closed ? R.string.TopicWasClosedAction : R.string.TopicWasReopenedAction), ForumUtilities.getTopicSpannedName(tL_forumTopicFindTopic, null, null)), name);
                                } else {
                                    int i7 = i6 & 1;
                                    if (i7 == 0 || (i6 & 2) == 0) {
                                        j = 0;
                                        if (i7 != 0) {
                                            charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction), tL_messageActionTopicEdit.title), name);
                                        } else if ((i6 & 2) != 0) {
                                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                            tL_forumTopic.title = "";
                                            charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasIconChangedToAction), ForumUtilities.getTopicSpannedName(tL_forumTopic, null, null)), name);
                                        }
                                    } else {
                                        TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                        j = 0;
                                        tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                        tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                                        charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction2), ForumUtilities.getTopicSpannedName(tL_forumTopic2, null, null)), name);
                                    }
                                    charSequenceReplaceCharSequence = charSequenceReplaceCharSequence2;
                                }
                            } else {
                                j = 0;
                            }
                            charSequenceReplaceCharSequence = null;
                        }
                    }
                } else {
                    j = 0;
                    charSequenceReplaceCharSequence = null;
                }
                if (charSequenceReplaceCharSequence == null) {
                    message3 = messageObject2.messageOwner;
                    if (message3 != null || (messageMedia = message3.media) == null || messageMedia.ttl_seconds == 0) {
                        charSequenceReplaceCharSequence = AnimatedEmojiSpan.cloneSpans(messageObject2.messageText);
                    } else if (messageMedia.photo != null) {
                        charSequenceReplaceCharSequence = LocaleController.getString(R.string.AttachPhotoExpired);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        if (!(document instanceof TLRPC.TL_documentEmpty) && (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || document != null)) {
                            charSequenceReplaceCharSequence = AnimatedEmojiSpan.cloneSpans(messageObject2.messageText);
                        } else if (messageMedia.voice) {
                            charSequenceReplaceCharSequence = LocaleController.getString(R.string.AttachVoiceExpired);
                        } else {
                            charSequenceReplaceCharSequence = messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachVideoExpired);
                        }
                    }
                }
            }
            j = 0;
            if (charSequenceReplaceCharSequence == null) {
                message3 = messageObject2.messageOwner;
                if (message3 != null) {
                    charSequenceReplaceCharSequence = AnimatedEmojiSpan.cloneSpans(messageObject2.messageText);
                } else {
                    charSequenceReplaceCharSequence = AnimatedEmojiSpan.cloneSpans(messageObject2.messageText);
                }
            }
        } else {
            j = 0;
            charSequenceReplaceCharSequence = this.customText;
        }
        MessageObject messageObject3 = this.currentMessageObject;
        CharSequence charSequence5 = (messageObject3 == null || !messageObject3.isRepostPreview) ? charSequenceReplaceCharSequence : "";
        if (messageObject3 != null && (message2 = messageObject3.messageOwner) != null && (messageAction5 = message2.action) != null) {
            if (messageAction5 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i4 = R.drawable.mini_checklist_add;
            } else if (messageAction5 instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction5;
                i4 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequence5);
                spannableStringBuilder4.insert(0, (CharSequence) "i ");
                spannableStringBuilder4.setSpan(new ColoredImageSpan(i4), 0, 1, 33);
                charSequence5 = spannableStringBuilder4;
            }
        }
        createLayout(charSequence5, this.previousWidth);
        if (this.birthdayLayout != null) {
            this.textLayout = null;
            this.textHeight = 0;
            this.titleLayout = null;
            this.titleHeight = 0;
            this.textY = 0;
        }
        if (messageObject2 != null) {
            TLRPC.Message message4 = messageObject2.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction7 = message4.action;
                if ((messageAction7 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction7).balance_too_low) {
                    createGiftPremiumLayouts(null, null, charSequence5, false, !ChatObject.canManageMonoForum(this.currentAccount, messageObject2.getDialogId()) ? LocaleController.getString(R.string.StarsBuy) : null, 11, null, this.giftRectSize, false);
                    this.textLayout = null;
                    this.textHeight = 0;
                    this.titleLayout = null;
                    this.titleHeight = 0;
                    this.textY = 0;
                    this.giftRectEmpty = true;
                } else {
                    charSequence = charSequence5;
                    if (message4 != null) {
                        messageAction4 = message4.action;
                        if ((messageAction4 instanceof TLRPC.TL_messageActionSuggestedPostApproval) || !((TLRPC.TL_messageActionSuggestedPostApproval) messageAction4).rejected) {
                            i = messageObject2.type;
                            if (i == 11) {
                                ImageReceiver imageReceiver = this.imageReceiver;
                                float f = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                                float fDp = AndroidUtilities.dp(19.0f) + this.textHeight;
                                float f2 = AndroidUtilities.roundMessageSize;
                                imageReceiver.setImageCoords(f, fDp, f2, f2);
                            } else if (i == 25) {
                                createGiftPremiumChannelLayouts();
                            } else if (i == 30) {
                                user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                                messageAction3 = messageObject2.messageOwner.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                    CharSequence pluralStringComma = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction3).stars);
                                    if (this.currentMessageObject.isOutOwner()) {
                                        string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                    } else {
                                        string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                    }
                                    createGiftPremiumLayouts(pluralStringComma, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                } else if (!(messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).refunded) {
                                    long clientUserId2 = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageObject2.messageOwner.action;
                                    if (messageObject2.isOutOwner() != (!tL_messageActionStarGiftUnique.upgrade)) {
                                        clientUserId2 = messageObject2.getDialogId();
                                    }
                                    TLRPC.User user7 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(clientUserId2));
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                    spannableStringBuilder5.append((CharSequence) LocaleController.getString(tL_messageActionStarGiftUnique.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                                    if (user7 != null && user7.photo != null) {
                                        spannableStringBuilder5.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan.setUser(user7);
                                        spannableStringBuilder5.setSpan(avatarSpan, spannableStringBuilder5.length() - 2, spannableStringBuilder5.length() - 1, 33);
                                    }
                                    spannableStringBuilder5.append((CharSequence) UserObject.getForcedFirstName(user7));
                                    createGiftPremiumLayouts(spannableStringBuilder5, null, LocaleController.getString(R.string.Gift2ActionUpgradeRefundedText), false, LocaleController.getString(R.string.ActionGiftStarsView), 12, LocaleController.getString(R.string.Gift2UniqueRibbon), this.giftRectSize, true);
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    j2 = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null || (tL_messageActionStarGift.prepaid_upgrade && !(peer instanceof TLRPC.TL_peerChannel))) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (messageObject2.getDialogId() == clientUserId || z4) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    fromChatId2 = messageObject2.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade && (peer2 = tL_messageActionStarGift.from_id) != null) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    TLObject userOrChat2 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade || tL_messageActionStarGift.converted) {
                                        z6 = z5;
                                        j3 = peerDialogId2;
                                    } else {
                                        z6 = z5;
                                        j3 = peerDialogId2;
                                        if (tL_messageActionStarGift.upgrade_stars > j && !tL_messageActionStarGift.upgraded) {
                                            z7 = true;
                                        }
                                        if (j3 == j && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTitleTo)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat2)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan2 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan2.setObject(userOrChat2);
                                                spannableStringBuilder3.setSpan(avatarSpan2, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat2));
                                        } else if (!z6) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i3 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan3 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan3.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) LocaleController.formatNumber(tL_messageActionStarGift.gift_num, ','));
                                        }
                                        z8 = !((messageObject2.isOutOwner() || z6) && tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - messageObject2.messageOwner.date) > 0 && !tL_messageActionStarGift.refunded;
                                        if (tL_messageActionStarGift.refunded) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                        } else {
                                            tL_textWithEntities2 = tL_messageActionStarGift.message;
                                            if (tL_textWithEntities2 == null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                                MessageObject.addEntitiesToText(spannableStringBuilder6, tL_messageActionStarGift.message.entities, false, false, true, true);
                                                charSequenceReplaceTags4 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder6, this.giftTextPaint.getFontMetricsInt(), false, (int[]) null), tL_messageActionStarGift.message.entities, this.giftTextPaint.getFontMetricsInt());
                                            } else if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z4) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z8 || j2 <= j) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfoChannel", (int) j2));
                                                }
                                            } else if (z6) {
                                                if (!tL_messageActionStarGift.converted && j2 > j) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z7) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z8 && j2 > j) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j2, UserObject.getForcedFirstName(user5)));
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z8) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                }
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            }
                                        }
                                        CharSequence charSequence6 = charSequenceReplaceTags4;
                                        starGift2 = tL_messageActionStarGift.gift;
                                        if (starGift2 == null && starGift2.limited) {
                                            int i8 = R.string.Gift2Limited1OfRibbon;
                                            int i9 = starGift2.availability_total;
                                            if (i9 > 1500) {
                                                c = 0;
                                                objValueOf = AndroidUtilities.formatWholeNumber(i9, 0);
                                            } else {
                                                c = 0;
                                                objValueOf = Integer.valueOf(i9);
                                            }
                                            Object[] objArr = new Object[1];
                                            objArr[c] = objValueOf;
                                            string7 = LocaleController.formatString(i8, objArr);
                                        } else {
                                            string7 = null;
                                        }
                                        string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                        if (messageObject2.isOutOwner() || tL_messageActionStarGift.forceIn || z7) {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject2.isOutOwner() && z7) {
                                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                spannableStringBuilder7.append((CharSequence) "^  ");
                                                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan.setScale(0.8f, 0.8f);
                                                spannableStringBuilder7.setSpan(coloredImageSpan, 0, 1, 33);
                                                spannableStringBuilder7.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder7;
                                            }
                                        }
                                        CharSequence charSequence7 = charSequence4;
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                                            spannableStringBuilderReplaceSingleTagToLink = null;
                                        } else {
                                            spannableStringBuilderReplaceSingleTagToLink = StarGiftSheet.replaceSingleTagToLink(LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@".concat(publicUsername)));
                                        }
                                        createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence6, false, charSequence7, 11, string7, this.giftRectSize, true);
                                    }
                                    z7 = false;
                                    if (j3 == j) {
                                        if (!z6) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i3 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan4 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan4.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan4, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else if (!z6) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i3 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i3 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan5 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan5.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan5, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (tL_messageActionStarGift.refunded) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                    } else {
                                        tL_textWithEntities2 = tL_messageActionStarGift.message;
                                        if (tL_textWithEntities2 == null) {
                                            if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z4) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z8) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z6) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z7) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z8) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z8) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z6) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z7) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z8) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    }
                                    CharSequence charSequence8 = charSequenceReplaceTags4;
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject2.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                            spannableStringBuilder8.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan2.setScale(0.8f, 0.8f);
                                            spannableStringBuilder8.setSpan(coloredImageSpan2, 0, 1, 33);
                                            spannableStringBuilder8.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder8;
                                        }
                                    } else {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                                            spannableStringBuilder9.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan3.setScale(0.8f, 0.8f);
                                            spannableStringBuilder9.setSpan(coloredImageSpan3, 0, 1, 33);
                                            spannableStringBuilder9.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder9;
                                        }
                                    }
                                    CharSequence charSequence9 = charSequence4;
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilderReplaceSingleTagToLink = null;
                                    } else {
                                        spannableStringBuilderReplaceSingleTagToLink = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence8, false, charSequence9, 11, string7, this.giftRectSize, true);
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                            } else if (i == 33) {
                                tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message4.action;
                                spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                                spannableStringBuilder2.append((CharSequence) "\n\n");
                                if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                                } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                                } else {
                                    iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                                    if (iMax == 0) {
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                    } else {
                                        shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                        if (shortDuration2.endsWith(".")) {
                                            shortDuration2 = Fragment$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
                                        }
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                                    }
                                }
                                createGiftPremiumLayouts(null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = false;
                            } else if (i == 34) {
                                createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = true;
                            } else if (i == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())));
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    if (messageObject2.isOut()) {
                                        charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags3);
                                } else {
                                    if (messageObject2.isOut()) {
                                        charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                    } else {
                                        charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                    }
                                    spannableStringBuilder.append(charSequenceReplaceTags2);
                                }
                                if (tL_messageActionNoForwardsRequest.new_value) {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string10 = LocaleController.getString(R.string.SharingOfferDisable1);
                                    int i10 = R.drawable.floating_check;
                                    spannableStringBuilder.append((CharSequence) createOption(i10, string10));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i10, LocaleController.getString(R.string.SharingOfferDisable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i10, LocaleController.getString(R.string.SharingOfferDisable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i10, LocaleController.getString(R.string.SharingOfferDisable4)));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string11 = LocaleController.getString(R.string.SharingOfferEnable1);
                                    int i11 = R.drawable.floating_check;
                                    spannableStringBuilder.append((CharSequence) createOption(i11, string11));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i11, LocaleController.getString(R.string.SharingOfferEnable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i11, LocaleController.getString(R.string.SharingOfferEnable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i11, LocaleController.getString(R.string.SharingOfferEnable4)));
                                }
                                createGiftPremiumLayouts(null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                                this.giftRectEmpty = true;
                            } else if (i == 31) {
                                TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                                StringBuilder sb = new StringBuilder();
                                sb.append(starGift4.title);
                                sb.append(" #");
                                strM = BillingController$$ExternalSyntheticOutline0.m(starGift4.num, ',', sb);
                                fromChatId = messageObject2.getFromChatId();
                                if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), strM);
                                }
                                createGiftPremiumLayouts(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 37) {
                                TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message4.action;
                                peerDialogId = DialogObject.getPeerDialogId(message4.peer_id);
                                boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                                if (peerDialogId > j) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                String shortName2 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                                String shortName3 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity.community_id);
                                SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder();
                                spannableStringBuilder10.append((CharSequence) CommunityUtils.buildServiceMessageText(messageObject2, shortName3, shortName2, zIsChannelAndNotMegaGroup, z3));
                                createGiftPremiumLayouts(null, null, spannableStringBuilder10, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 18) {
                                messageAction = message4.action;
                                if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                                    tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                                } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                    tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                                } else {
                                    tL_textWithEntities = null;
                                }
                                if (tL_textWithEntities != null || TextUtils.isEmpty(tL_textWithEntities.text)) {
                                    string4 = null;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(tL_textWithEntities.text);
                                    this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                    MessageObject.addEntitiesToText(spannableStringBuilder11, tL_textWithEntities.entities, false, false, true, true);
                                    string4 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder11, this.giftTextPaint.getFontMetricsInt(), false, (int[]) null), tL_textWithEntities.entities, this.giftTextPaint.getFontMetricsInt());
                                }
                                if (string4 == null) {
                                    string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                                }
                                CharSequence charSequence10 = string4;
                                messageObject = this.currentMessageObject;
                                if (messageObject != null) {
                                    message = messageObject.messageOwner;
                                    messageAction2 = message.action;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                        if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                                            i2 = R.string.ActionGiftPremiumView;
                                        } else {
                                            i2 = R.string.GiftPremiumUseGiftBtn;
                                        }
                                    } else {
                                        i2 = R.string.ActionGiftPremiumView;
                                    }
                                } else {
                                    i2 = R.string.ActionGiftPremiumView;
                                }
                                createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence10, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                            } else if (i == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                                if (messageObject2.isOutOwner()) {
                                    dialogId2 = j;
                                } else {
                                    dialogId2 = messageObject2.getDialogId();
                                }
                                user3 = messagesController.getUser(Long.valueOf(dialogId2));
                                if (tL_messageActionSuggestProfilePhoto.video && ((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty())) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId()));
                                    if (z2) {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                                    } else {
                                        string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                    }
                                } else if (z2) {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                                } else {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                                }
                                CharSequence charSequence11 = string2;
                                if (tL_messageActionSuggestProfilePhoto.video && ((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) {
                                    string3 = LocaleController.getString(R.string.ViewPhotoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                createGiftPremiumLayouts(null, null, charSequence11, false, string3, 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 22) {
                                MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                                if (messageObject2.isOutOwner()) {
                                    dialogId = j;
                                } else {
                                    dialogId = messageObject2.getDialogId();
                                }
                                user2 = messagesController2.getUser(Long.valueOf(dialogId));
                                if (messageObject2.getDialogId() < j) {
                                    charSequence3 = messageObject2.messageText;
                                } else {
                                    if (messageObject2.isOutOwner() && messageObject2.isWallpaperForBoth() && messageObject2.isCurrentWallpaper()) {
                                        charSequence2 = messageObject2.messageText;
                                        string = LocaleController.getString(R.string.RemoveWallpaperAction);
                                        z = false;
                                    } else {
                                        if (user2 == null && user2.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                            charSequence3 = messageObject2.messageText;
                                        } else {
                                            charSequence2 = messageObject2.messageText;
                                            string = LocaleController.getString(R.string.ViewWallpaperAction);
                                        }
                                        z = true;
                                    }
                                    createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                                charSequence2 = charSequence3;
                                string = null;
                                z = true;
                                createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (messageObject2.isStoryMention()) {
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                                } else {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                                }
                                createGiftPremiumLayouts(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else {
                            createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        }
                    } else {
                        i = messageObject2.type;
                        if (i == 11) {
                            ImageReceiver imageReceiver2 = this.imageReceiver;
                            float f3 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp2 = AndroidUtilities.dp(19.0f) + this.textHeight;
                            float f4 = AndroidUtilities.roundMessageSize;
                            imageReceiver2.setImageCoords(f3, fDp2, f4, f4);
                        } else if (i == 25) {
                            createGiftPremiumChannelLayouts();
                        } else if (i == 30) {
                            user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                            messageAction3 = messageObject2.messageOwner.action;
                            if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                CharSequence pluralStringComma2 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction3).stars);
                                if (this.currentMessageObject.isOutOwner()) {
                                    string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                } else {
                                    string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                }
                                createGiftPremiumLayouts(pluralStringComma2, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                            } else if (!(messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    j2 = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (messageObject2.getDialogId() == clientUserId) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    fromChatId2 = messageObject2.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    TLObject userOrChat3 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z6 = z5;
                                        j3 = peerDialogId2;
                                        z7 = false;
                                    } else {
                                        z6 = z5;
                                        j3 = peerDialogId2;
                                        z7 = false;
                                    }
                                    if (j3 == j) {
                                        if (!z6) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i3 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan6 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan6.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan6, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else if (!z6) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i3 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i3 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan7 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan7.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan7, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (tL_messageActionStarGift.refunded) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                    } else {
                                        tL_textWithEntities2 = tL_messageActionStarGift.message;
                                        if (tL_textWithEntities2 == null) {
                                            if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z4) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z8) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z6) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z7) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z8) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z8) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z6) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z7) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z8) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    }
                                    CharSequence charSequence12 = charSequenceReplaceTags4;
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject2.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder();
                                            spannableStringBuilder12.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan4 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan4.setScale(0.8f, 0.8f);
                                            spannableStringBuilder12.setSpan(coloredImageSpan4, 0, 1, 33);
                                            spannableStringBuilder12.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder12;
                                        }
                                    } else {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder13 = new SpannableStringBuilder();
                                            spannableStringBuilder13.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan5 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan5.setScale(0.8f, 0.8f);
                                            spannableStringBuilder13.setSpan(coloredImageSpan5, 0, 1, 33);
                                            spannableStringBuilder13.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder13;
                                        }
                                    }
                                    CharSequence charSequence13 = charSequence4;
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilderReplaceSingleTagToLink = null;
                                    } else {
                                        spannableStringBuilderReplaceSingleTagToLink = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence12, false, charSequence13, 11, string7, this.giftRectSize, true);
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                            } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                j2 = tL_messageActionStarGift.convert_stars;
                                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                peer = tL_messageActionStarGift.peer;
                                if (peer != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (messageObject2.getDialogId() == clientUserId) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                fromChatId2 = messageObject2.getFromChatId();
                                if (!tL_messageActionStarGift.prepaid_upgrade) {
                                    fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                }
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                TLObject userOrChat4 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    z6 = z5;
                                    j3 = peerDialogId2;
                                    z7 = false;
                                } else {
                                    z6 = z5;
                                    j3 = peerDialogId2;
                                    z7 = false;
                                }
                                if (j3 == j) {
                                    if (!z6) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i3 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i3 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan8 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan8.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan8, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else if (!z6) {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i3 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i3 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan9 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan9.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan9, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                } else if (tL_messageActionStarGift.gift_num > 0) {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                } else {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                }
                                if (messageObject2.isOutOwner()) {
                                }
                                if (tL_messageActionStarGift.refunded) {
                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                } else {
                                    tL_textWithEntities2 = tL_messageActionStarGift.message;
                                    if (tL_textWithEntities2 == null) {
                                        if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z6) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z7) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z8) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z4) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z6) {
                                        if (!tL_messageActionStarGift.converted) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                        }
                                    } else if (z7) {
                                        if (messageObject2.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject2.isOutOwner()) {
                                        if (!z8) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (z8) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                    }
                                }
                                CharSequence charSequence14 = charSequenceReplaceTags4;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject2.isOutOwner()) {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder14 = new SpannableStringBuilder();
                                        spannableStringBuilder14.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan6 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan6.setScale(0.8f, 0.8f);
                                        spannableStringBuilder14.setSpan(coloredImageSpan6, 0, 1, 33);
                                        spannableStringBuilder14.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder14;
                                    }
                                } else {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder15 = new SpannableStringBuilder();
                                        spannableStringBuilder15.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan7 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan7.setScale(0.8f, 0.8f);
                                        spannableStringBuilder15.setSpan(coloredImageSpan7, 0, 1, 33);
                                        spannableStringBuilder15.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder15;
                                    }
                                }
                                CharSequence charSequence15 = charSequence4;
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    spannableStringBuilderReplaceSingleTagToLink = null;
                                } else {
                                    spannableStringBuilderReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence14, false, charSequence15, 11, string7, this.giftRectSize, true);
                            } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else if (i == 33) {
                            tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message4.action;
                            spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder2.append((CharSequence) "\n\n");
                            if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                            } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                            } else {
                                iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                                if (iMax == 0) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                } else {
                                    shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                    if (shortDuration2.endsWith(".")) {
                                        shortDuration2 = Fragment$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
                                    }
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                                }
                            }
                            createGiftPremiumLayouts(null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = false;
                        } else if (i == 34) {
                            createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        } else if (i == 35) {
                            tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                            spannableStringBuilder = new SpannableStringBuilder();
                            shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())));
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                if (messageObject2.isOut()) {
                                    charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                } else {
                                    charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags3);
                            } else {
                                if (messageObject2.isOut()) {
                                    charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                } else {
                                    charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags2);
                            }
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                String string12 = LocaleController.getString(R.string.SharingOfferDisable1);
                                int i12 = R.drawable.floating_check;
                                spannableStringBuilder.append((CharSequence) createOption(i12, string12));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i12, LocaleController.getString(R.string.SharingOfferDisable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i12, LocaleController.getString(R.string.SharingOfferDisable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i12, LocaleController.getString(R.string.SharingOfferDisable4)));
                            } else {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                String string13 = LocaleController.getString(R.string.SharingOfferEnable1);
                                int i13 = R.drawable.floating_check;
                                spannableStringBuilder.append((CharSequence) createOption(i13, string13));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i13, LocaleController.getString(R.string.SharingOfferEnable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i13, LocaleController.getString(R.string.SharingOfferEnable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i13, LocaleController.getString(R.string.SharingOfferEnable4)));
                            }
                            createGiftPremiumLayouts(null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        } else if (i == 31) {
                            TL_stars.StarGift starGift5 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(starGift5.title);
                            sb2.append(" #");
                            strM = BillingController$$ExternalSyntheticOutline0.m(starGift5.num, ',', sb2);
                            fromChatId = messageObject2.getFromChatId();
                            if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                            } else {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), strM);
                            }
                            createGiftPremiumLayouts(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 37) {
                            TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity2 = (TLRPC.TL_messageActionChangeCommunity) message4.action;
                            peerDialogId = DialogObject.getPeerDialogId(message4.peer_id);
                            boolean zIsChannelAndNotMegaGroup2 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                            if (peerDialogId > j) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            String shortName4 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                            String shortName5 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity2.community_id);
                            SpannableStringBuilder spannableStringBuilder16 = new SpannableStringBuilder();
                            spannableStringBuilder16.append((CharSequence) CommunityUtils.buildServiceMessageText(messageObject2, shortName5, shortName4, zIsChannelAndNotMegaGroup2, z3));
                            createGiftPremiumLayouts(null, null, spannableStringBuilder16, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 18) {
                            messageAction = message4.action;
                            if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                                tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                            } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                            } else {
                                tL_textWithEntities = null;
                            }
                            if (tL_textWithEntities != null) {
                                string4 = null;
                            } else {
                                string4 = null;
                            }
                            if (string4 == null) {
                                string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                            }
                            CharSequence charSequence16 = string4;
                            messageObject = this.currentMessageObject;
                            if (messageObject != null) {
                                message = messageObject.messageOwner;
                                messageAction2 = message.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                    i2 = R.string.ActionGiftPremiumView;
                                } else {
                                    if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                                        i2 = R.string.GiftPremiumUseGiftBtn;
                                    } else {
                                        i2 = R.string.ActionGiftPremiumView;
                                    }
                                }
                            } else {
                                i2 = R.string.ActionGiftPremiumView;
                            }
                            createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence16, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                        } else if (i == 21) {
                            tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                            MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
                            if (messageObject2.isOutOwner()) {
                                dialogId2 = j;
                            } else {
                                dialogId2 = messageObject2.getDialogId();
                            }
                            user3 = messagesController3.getUser(Long.valueOf(dialogId2));
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId()));
                                if (z2) {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                                } else {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                }
                            } else if (z2) {
                                string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                            } else {
                                string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                            }
                            CharSequence charSequence17 = string2;
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            } else {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            }
                            createGiftPremiumLayouts(null, null, charSequence17, false, string3, 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 22) {
                            MessagesController messagesController4 = MessagesController.getInstance(this.currentAccount);
                            if (messageObject2.isOutOwner()) {
                                dialogId = j;
                            } else {
                                dialogId = messageObject2.getDialogId();
                            }
                            user2 = messagesController4.getUser(Long.valueOf(dialogId));
                            if (messageObject2.getDialogId() < j) {
                                charSequence3 = messageObject2.messageText;
                            } else {
                                if (messageObject2.isOutOwner()) {
                                }
                                if (user2 == null) {
                                }
                                charSequence2 = messageObject2.messageText;
                                string = LocaleController.getString(R.string.ViewWallpaperAction);
                                z = true;
                                createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                            charSequence2 = charSequence3;
                            string = null;
                            z = true;
                            createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (messageObject2.isStoryMention()) {
                            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                            if (user.self) {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                            } else {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                            }
                            createGiftPremiumLayouts(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                    }
                }
            } else {
                charSequence = charSequence5;
                if (message4 != null) {
                    messageAction4 = message4.action;
                    if (messageAction4 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                        i = messageObject2.type;
                        if (i == 11) {
                            ImageReceiver imageReceiver3 = this.imageReceiver;
                            float f5 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp3 = AndroidUtilities.dp(19.0f) + this.textHeight;
                            float f6 = AndroidUtilities.roundMessageSize;
                            imageReceiver3.setImageCoords(f5, fDp3, f6, f6);
                        } else if (i == 25) {
                            createGiftPremiumChannelLayouts();
                        } else if (i == 30) {
                            user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                            messageAction3 = messageObject2.messageOwner.action;
                            if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                CharSequence pluralStringComma3 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction3).stars);
                                if (this.currentMessageObject.isOutOwner()) {
                                    string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                } else {
                                    string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                }
                                createGiftPremiumLayouts(pluralStringComma3, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                            } else if (!(messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    j2 = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (messageObject2.getDialogId() == clientUserId) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    fromChatId2 = messageObject2.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    TLObject userOrChat5 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z6 = z5;
                                        j3 = peerDialogId2;
                                        z7 = false;
                                    } else {
                                        z6 = z5;
                                        j3 = peerDialogId2;
                                        z7 = false;
                                    }
                                    if (j3 == j) {
                                        if (!z6) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i3 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan10 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan10.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan10, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else if (!z6) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i3 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i3 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan11 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan11.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan11, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (tL_messageActionStarGift.refunded) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                    } else {
                                        tL_textWithEntities2 = tL_messageActionStarGift.message;
                                        if (tL_textWithEntities2 == null) {
                                            if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z4) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z8) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z6) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z7) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z8) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z8) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z6) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z7) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z8) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    }
                                    CharSequence charSequence18 = charSequenceReplaceTags4;
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject2.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder17 = new SpannableStringBuilder();
                                            spannableStringBuilder17.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan8 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan8.setScale(0.8f, 0.8f);
                                            spannableStringBuilder17.setSpan(coloredImageSpan8, 0, 1, 33);
                                            spannableStringBuilder17.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder17;
                                        }
                                    } else {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder18 = new SpannableStringBuilder();
                                            spannableStringBuilder18.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan9 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan9.setScale(0.8f, 0.8f);
                                            spannableStringBuilder18.setSpan(coloredImageSpan9, 0, 1, 33);
                                            spannableStringBuilder18.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder18;
                                        }
                                    }
                                    CharSequence charSequence19 = charSequence4;
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilderReplaceSingleTagToLink = null;
                                    } else {
                                        spannableStringBuilderReplaceSingleTagToLink = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence18, false, charSequence19, 11, string7, this.giftRectSize, true);
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                            } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                j2 = tL_messageActionStarGift.convert_stars;
                                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                peer = tL_messageActionStarGift.peer;
                                if (peer != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (messageObject2.getDialogId() == clientUserId) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                fromChatId2 = messageObject2.getFromChatId();
                                if (!tL_messageActionStarGift.prepaid_upgrade) {
                                    fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                }
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                TLObject userOrChat6 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    z6 = z5;
                                    j3 = peerDialogId2;
                                    z7 = false;
                                } else {
                                    z6 = z5;
                                    j3 = peerDialogId2;
                                    z7 = false;
                                }
                                if (j3 == j) {
                                    if (!z6) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i3 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i3 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan12 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan12.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan12, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else if (!z6) {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i3 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i3 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan13 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan13.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan13, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                } else if (tL_messageActionStarGift.gift_num > 0) {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                } else {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                }
                                if (messageObject2.isOutOwner()) {
                                }
                                if (tL_messageActionStarGift.refunded) {
                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                } else {
                                    tL_textWithEntities2 = tL_messageActionStarGift.message;
                                    if (tL_textWithEntities2 == null) {
                                        if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z6) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z7) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z8) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z4) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z6) {
                                        if (!tL_messageActionStarGift.converted) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                        }
                                    } else if (z7) {
                                        if (messageObject2.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject2.isOutOwner()) {
                                        if (!z8) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (z8) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                    }
                                }
                                CharSequence charSequence110 = charSequenceReplaceTags4;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject2.isOutOwner()) {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder19 = new SpannableStringBuilder();
                                        spannableStringBuilder19.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan10 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan10.setScale(0.8f, 0.8f);
                                        spannableStringBuilder19.setSpan(coloredImageSpan10, 0, 1, 33);
                                        spannableStringBuilder19.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder19;
                                    }
                                } else {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder110 = new SpannableStringBuilder();
                                        spannableStringBuilder110.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan11 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan11.setScale(0.8f, 0.8f);
                                        spannableStringBuilder110.setSpan(coloredImageSpan11, 0, 1, 33);
                                        spannableStringBuilder110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder110;
                                    }
                                }
                                CharSequence charSequence111 = charSequence4;
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    spannableStringBuilderReplaceSingleTagToLink = null;
                                } else {
                                    spannableStringBuilderReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence110, false, charSequence111, 11, string7, this.giftRectSize, true);
                            } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else if (i == 33) {
                            tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message4.action;
                            spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder2.append((CharSequence) "\n\n");
                            if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                            } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                            } else {
                                iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                                if (iMax == 0) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                } else {
                                    shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                    if (shortDuration2.endsWith(".")) {
                                        shortDuration2 = Fragment$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
                                    }
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                                }
                            }
                            createGiftPremiumLayouts(null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = false;
                        } else if (i == 34) {
                            createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        } else if (i == 35) {
                            tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                            spannableStringBuilder = new SpannableStringBuilder();
                            shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())));
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                if (messageObject2.isOut()) {
                                    charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                } else {
                                    charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags3);
                            } else {
                                if (messageObject2.isOut()) {
                                    charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                } else {
                                    charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags2);
                            }
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                String string14 = LocaleController.getString(R.string.SharingOfferDisable1);
                                int i14 = R.drawable.floating_check;
                                spannableStringBuilder.append((CharSequence) createOption(i14, string14));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i14, LocaleController.getString(R.string.SharingOfferDisable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i14, LocaleController.getString(R.string.SharingOfferDisable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i14, LocaleController.getString(R.string.SharingOfferDisable4)));
                            } else {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                String string15 = LocaleController.getString(R.string.SharingOfferEnable1);
                                int i15 = R.drawable.floating_check;
                                spannableStringBuilder.append((CharSequence) createOption(i15, string15));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i15, LocaleController.getString(R.string.SharingOfferEnable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i15, LocaleController.getString(R.string.SharingOfferEnable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i15, LocaleController.getString(R.string.SharingOfferEnable4)));
                            }
                            createGiftPremiumLayouts(null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        } else if (i == 31) {
                            TL_stars.StarGift starGift6 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(starGift6.title);
                            sb3.append(" #");
                            strM = BillingController$$ExternalSyntheticOutline0.m(starGift6.num, ',', sb3);
                            fromChatId = messageObject2.getFromChatId();
                            if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                            } else {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), strM);
                            }
                            createGiftPremiumLayouts(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 37) {
                            TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity3 = (TLRPC.TL_messageActionChangeCommunity) message4.action;
                            peerDialogId = DialogObject.getPeerDialogId(message4.peer_id);
                            boolean zIsChannelAndNotMegaGroup3 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                            if (peerDialogId > j) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            String shortName6 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                            String shortName7 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity3.community_id);
                            SpannableStringBuilder spannableStringBuilder111 = new SpannableStringBuilder();
                            spannableStringBuilder111.append((CharSequence) CommunityUtils.buildServiceMessageText(messageObject2, shortName7, shortName6, zIsChannelAndNotMegaGroup3, z3));
                            createGiftPremiumLayouts(null, null, spannableStringBuilder111, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 18) {
                            messageAction = message4.action;
                            if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                                tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                            } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                            } else {
                                tL_textWithEntities = null;
                            }
                            if (tL_textWithEntities != null) {
                                string4 = null;
                            } else {
                                string4 = null;
                            }
                            if (string4 == null) {
                                string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                            }
                            CharSequence charSequence112 = string4;
                            messageObject = this.currentMessageObject;
                            if (messageObject != null) {
                                message = messageObject.messageOwner;
                                messageAction2 = message.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                    i2 = R.string.ActionGiftPremiumView;
                                } else {
                                    if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                                        i2 = R.string.GiftPremiumUseGiftBtn;
                                    } else {
                                        i2 = R.string.ActionGiftPremiumView;
                                    }
                                }
                            } else {
                                i2 = R.string.ActionGiftPremiumView;
                            }
                            createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence112, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                        } else if (i == 21) {
                            tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                            MessagesController messagesController5 = MessagesController.getInstance(this.currentAccount);
                            if (messageObject2.isOutOwner()) {
                                dialogId2 = j;
                            } else {
                                dialogId2 = messageObject2.getDialogId();
                            }
                            user3 = messagesController5.getUser(Long.valueOf(dialogId2));
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId()));
                                if (z2) {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                                } else {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                }
                            } else if (z2) {
                                string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                            } else {
                                string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                            }
                            CharSequence charSequence113 = string2;
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            } else {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            }
                            createGiftPremiumLayouts(null, null, charSequence113, false, string3, 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 22) {
                            MessagesController messagesController6 = MessagesController.getInstance(this.currentAccount);
                            if (messageObject2.isOutOwner()) {
                                dialogId = j;
                            } else {
                                dialogId = messageObject2.getDialogId();
                            }
                            user2 = messagesController6.getUser(Long.valueOf(dialogId));
                            if (messageObject2.getDialogId() < j) {
                                charSequence3 = messageObject2.messageText;
                            } else {
                                if (messageObject2.isOutOwner()) {
                                }
                                if (user2 == null) {
                                }
                                charSequence2 = messageObject2.messageText;
                                string = LocaleController.getString(R.string.ViewWallpaperAction);
                                z = true;
                                createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                            charSequence2 = charSequence3;
                            string = null;
                            z = true;
                            createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (messageObject2.isStoryMention()) {
                            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                            if (user.self) {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                            } else {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                            }
                            createGiftPremiumLayouts(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                    } else {
                        i = messageObject2.type;
                        if (i == 11) {
                            ImageReceiver imageReceiver4 = this.imageReceiver;
                            float f7 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp4 = AndroidUtilities.dp(19.0f) + this.textHeight;
                            float f8 = AndroidUtilities.roundMessageSize;
                            imageReceiver4.setImageCoords(f7, fDp4, f8, f8);
                        } else if (i == 25) {
                            createGiftPremiumChannelLayouts();
                        } else if (i == 30) {
                            user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                            messageAction3 = messageObject2.messageOwner.action;
                            if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                CharSequence pluralStringComma4 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction3).stars);
                                if (this.currentMessageObject.isOutOwner()) {
                                    string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                                } else {
                                    string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                                }
                                createGiftPremiumLayouts(pluralStringComma4, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                            } else if (!(messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    j2 = tL_messageActionStarGift.convert_stars;
                                    clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                    peer = tL_messageActionStarGift.peer;
                                    if (peer != null) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (messageObject2.getDialogId() == clientUserId) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    fromChatId2 = messageObject2.getFromChatId();
                                    if (!tL_messageActionStarGift.prepaid_upgrade) {
                                        fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                    }
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    TLObject userOrChat7 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z6 = z5;
                                        j3 = peerDialogId2;
                                        z7 = false;
                                    } else {
                                        z6 = z5;
                                        j3 = peerDialogId2;
                                        z7 = false;
                                    }
                                    if (j3 == j) {
                                        if (!z6) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i3 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan14 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                                avatarSpan14.setObject(userOrChat);
                                                spannableStringBuilder3.setSpan(avatarSpan14, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        }
                                    } else if (!z6) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i3 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i3 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan15 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan15.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan15, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                    if (messageObject2.isOutOwner()) {
                                    }
                                    if (tL_messageActionStarGift.refunded) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                    } else {
                                        tL_textWithEntities2 = tL_messageActionStarGift.message;
                                        if (tL_textWithEntities2 == null) {
                                            if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z4) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z8) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                                }
                                            } else if (z6) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (z7) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z8) {
                                                    if (tL_messageActionStarGift.can_upgrade) {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                    } else {
                                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                    }
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z8) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z6) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z7) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z8) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    }
                                    CharSequence charSequence114 = charSequenceReplaceTags4;
                                    starGift2 = tL_messageActionStarGift.gift;
                                    if (starGift2 == null) {
                                        string7 = null;
                                    } else {
                                        string7 = null;
                                    }
                                    string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                    if (messageObject2.isOutOwner()) {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder112 = new SpannableStringBuilder();
                                            spannableStringBuilder112.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan12 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan12.setScale(0.8f, 0.8f);
                                            spannableStringBuilder112.setSpan(coloredImageSpan12, 0, 1, 33);
                                            spannableStringBuilder112.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder112;
                                        }
                                    } else {
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        charSequence4 = string8;
                                        if (!messageObject2.isOutOwner()) {
                                            SpannableStringBuilder spannableStringBuilder113 = new SpannableStringBuilder();
                                            spannableStringBuilder113.append((CharSequence) "^  ");
                                            ColoredImageSpan coloredImageSpan13 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan13.setScale(0.8f, 0.8f);
                                            spannableStringBuilder113.setSpan(coloredImageSpan13, 0, 1, 33);
                                            spannableStringBuilder113.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder113;
                                        }
                                    }
                                    CharSequence charSequence115 = charSequence4;
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilderReplaceSingleTagToLink = null;
                                    } else {
                                        spannableStringBuilderReplaceSingleTagToLink = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence114, false, charSequence115, 11, string7, this.giftRectSize, true);
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else {
                                    createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                            } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                j2 = tL_messageActionStarGift.convert_stars;
                                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                peer = tL_messageActionStarGift.peer;
                                if (peer != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (messageObject2.getDialogId() == clientUserId) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                fromChatId2 = messageObject2.getFromChatId();
                                if (!tL_messageActionStarGift.prepaid_upgrade) {
                                    fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                }
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                TLObject userOrChat8 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    z6 = z5;
                                    j3 = peerDialogId2;
                                    z7 = false;
                                } else {
                                    z6 = z5;
                                    j3 = peerDialogId2;
                                    z7 = false;
                                }
                                if (j3 == j) {
                                    if (!z6) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i3 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i3 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan16 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan16.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan16, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else if (!z6) {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i3 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i3 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan17 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan17.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan17, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                } else if (tL_messageActionStarGift.gift_num > 0) {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                } else {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                }
                                if (messageObject2.isOutOwner()) {
                                }
                                if (tL_messageActionStarGift.refunded) {
                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                } else {
                                    tL_textWithEntities2 = tL_messageActionStarGift.message;
                                    if (tL_textWithEntities2 == null) {
                                        if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z6) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z7) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z8) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z4) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z6) {
                                        if (!tL_messageActionStarGift.converted) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                        }
                                    } else if (z7) {
                                        if (messageObject2.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject2.isOutOwner()) {
                                        if (!z8) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (z8) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                    }
                                }
                                CharSequence charSequence116 = charSequenceReplaceTags4;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject2.isOutOwner()) {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder114 = new SpannableStringBuilder();
                                        spannableStringBuilder114.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan14 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan14.setScale(0.8f, 0.8f);
                                        spannableStringBuilder114.setSpan(coloredImageSpan14, 0, 1, 33);
                                        spannableStringBuilder114.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder114;
                                    }
                                } else {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder115 = new SpannableStringBuilder();
                                        spannableStringBuilder115.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan15 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan15.setScale(0.8f, 0.8f);
                                        spannableStringBuilder115.setSpan(coloredImageSpan15, 0, 1, 33);
                                        spannableStringBuilder115.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder115;
                                    }
                                }
                                CharSequence charSequence117 = charSequence4;
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    spannableStringBuilderReplaceSingleTagToLink = null;
                                } else {
                                    spannableStringBuilderReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence116, false, charSequence117, 11, string7, this.giftRectSize, true);
                            } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else if (i == 33) {
                            tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message4.action;
                            spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                            spannableStringBuilder2.append((CharSequence) "\n\n");
                            if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                            } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                            } else {
                                iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                                if (iMax == 0) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                } else {
                                    shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                    if (shortDuration2.endsWith(".")) {
                                        shortDuration2 = Fragment$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
                                    }
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                                }
                            }
                            createGiftPremiumLayouts(null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = false;
                        } else if (i == 34) {
                            createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        } else if (i == 35) {
                            tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                            spannableStringBuilder = new SpannableStringBuilder();
                            shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())));
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                if (messageObject2.isOut()) {
                                    charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                                } else {
                                    charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags3);
                            } else {
                                if (messageObject2.isOut()) {
                                    charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                                } else {
                                    charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                                }
                                spannableStringBuilder.append(charSequenceReplaceTags2);
                            }
                            if (tL_messageActionNoForwardsRequest.new_value) {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                String string16 = LocaleController.getString(R.string.SharingOfferDisable1);
                                int i16 = R.drawable.floating_check;
                                spannableStringBuilder.append((CharSequence) createOption(i16, string16));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i16, LocaleController.getString(R.string.SharingOfferDisable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i16, LocaleController.getString(R.string.SharingOfferDisable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i16, LocaleController.getString(R.string.SharingOfferDisable4)));
                            } else {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                String string17 = LocaleController.getString(R.string.SharingOfferEnable1);
                                int i17 = R.drawable.floating_check;
                                spannableStringBuilder.append((CharSequence) createOption(i17, string17));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i17, LocaleController.getString(R.string.SharingOfferEnable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i17, LocaleController.getString(R.string.SharingOfferEnable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i17, LocaleController.getString(R.string.SharingOfferEnable4)));
                            }
                            createGiftPremiumLayouts(null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        } else if (i == 31) {
                            TL_stars.StarGift starGift7 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(starGift7.title);
                            sb4.append(" #");
                            strM = BillingController$$ExternalSyntheticOutline0.m(starGift7.num, ',', sb4);
                            fromChatId = messageObject2.getFromChatId();
                            if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                            } else {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), strM);
                            }
                            createGiftPremiumLayouts(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 37) {
                            TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity4 = (TLRPC.TL_messageActionChangeCommunity) message4.action;
                            peerDialogId = DialogObject.getPeerDialogId(message4.peer_id);
                            boolean zIsChannelAndNotMegaGroup4 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                            if (peerDialogId > j) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            String shortName8 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                            String shortName9 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity4.community_id);
                            SpannableStringBuilder spannableStringBuilder116 = new SpannableStringBuilder();
                            spannableStringBuilder116.append((CharSequence) CommunityUtils.buildServiceMessageText(messageObject2, shortName9, shortName8, zIsChannelAndNotMegaGroup4, z3));
                            createGiftPremiumLayouts(null, null, spannableStringBuilder116, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 18) {
                            messageAction = message4.action;
                            if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                                tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                            } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                                tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                            } else {
                                tL_textWithEntities = null;
                            }
                            if (tL_textWithEntities != null) {
                                string4 = null;
                            } else {
                                string4 = null;
                            }
                            if (string4 == null) {
                                string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                            }
                            CharSequence charSequence118 = string4;
                            messageObject = this.currentMessageObject;
                            if (messageObject != null) {
                                message = messageObject.messageOwner;
                                messageAction2 = message.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                    i2 = R.string.ActionGiftPremiumView;
                                } else {
                                    if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                                        i2 = R.string.GiftPremiumUseGiftBtn;
                                    } else {
                                        i2 = R.string.ActionGiftPremiumView;
                                    }
                                }
                            } else {
                                i2 = R.string.ActionGiftPremiumView;
                            }
                            createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence118, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                        } else if (i == 21) {
                            tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                            MessagesController messagesController7 = MessagesController.getInstance(this.currentAccount);
                            if (messageObject2.isOutOwner()) {
                                dialogId2 = j;
                            } else {
                                dialogId2 = messageObject2.getDialogId();
                            }
                            user3 = messagesController7.getUser(Long.valueOf(dialogId2));
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId()));
                                if (z2) {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                                } else {
                                    string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                }
                            } else if (z2) {
                                string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                            } else {
                                string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                            }
                            CharSequence charSequence119 = string2;
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            } else {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            }
                            createGiftPremiumLayouts(null, null, charSequence119, false, string3, 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 22) {
                            MessagesController messagesController8 = MessagesController.getInstance(this.currentAccount);
                            if (messageObject2.isOutOwner()) {
                                dialogId = j;
                            } else {
                                dialogId = messageObject2.getDialogId();
                            }
                            user2 = messagesController8.getUser(Long.valueOf(dialogId));
                            if (messageObject2.getDialogId() < j) {
                                charSequence3 = messageObject2.messageText;
                            } else {
                                if (messageObject2.isOutOwner()) {
                                }
                                if (user2 == null) {
                                }
                                charSequence2 = messageObject2.messageText;
                                string = LocaleController.getString(R.string.ViewWallpaperAction);
                                z = true;
                                createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                            charSequence2 = charSequence3;
                            string = null;
                            z = true;
                            createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (messageObject2.isStoryMention()) {
                            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                            if (user.self) {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                            } else {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                            }
                            createGiftPremiumLayouts(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                    }
                } else {
                    i = messageObject2.type;
                    if (i == 11) {
                        ImageReceiver imageReceiver5 = this.imageReceiver;
                        float f9 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                        float fDp5 = AndroidUtilities.dp(19.0f) + this.textHeight;
                        float f10 = AndroidUtilities.roundMessageSize;
                        imageReceiver5.setImageCoords(f9, fDp5, f10, f10);
                    } else if (i == 25) {
                        createGiftPremiumChannelLayouts();
                    } else if (i == 30) {
                        user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                        messageAction3 = messageObject2.messageOwner.action;
                        if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                            CharSequence pluralStringComma5 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction3).stars);
                            if (this.currentMessageObject.isOutOwner()) {
                                string9 = LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user5));
                            } else {
                                string9 = LocaleController.getString(R.string.ActionGiftStarsSubtitleYou);
                            }
                            createGiftPremiumLayouts(pluralStringComma5, null, AndroidUtilities.replaceTags(string9), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                        } else if (!(messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                            if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                j2 = tL_messageActionStarGift.convert_stars;
                                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                peer = tL_messageActionStarGift.peer;
                                if (peer != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (messageObject2.getDialogId() == clientUserId) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                fromChatId2 = messageObject2.getFromChatId();
                                if (!tL_messageActionStarGift.prepaid_upgrade) {
                                    fromChatId2 = DialogObject.getPeerDialogId(peer2);
                                }
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                TLObject userOrChat9 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    z6 = z5;
                                    j3 = peerDialogId2;
                                    z7 = false;
                                } else {
                                    z6 = z5;
                                    j3 = peerDialogId2;
                                    z7 = false;
                                }
                                if (j3 == j) {
                                    if (!z6) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i3 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i3 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan18 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                            avatarSpan18.setObject(userOrChat);
                                            spannableStringBuilder3.setSpan(avatarSpan18, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                        }
                                        spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                    } else if (tL_messageActionStarGift.gift_num > 0) {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    } else {
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    }
                                } else if (!z6) {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i3 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i3 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan19 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan19.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan19, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                } else if (tL_messageActionStarGift.gift_num > 0) {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                } else {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                }
                                if (messageObject2.isOutOwner()) {
                                }
                                if (tL_messageActionStarGift.refunded) {
                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                } else {
                                    tL_textWithEntities2 = tL_messageActionStarGift.message;
                                    if (tL_textWithEntities2 == null) {
                                        if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z4) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z8) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                            }
                                        } else if (z6) {
                                            if (!tL_messageActionStarGift.converted) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (z7) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z8) {
                                                if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (tL_messageActionStarGift.saved) {
                                            if (z8) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z4) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z6) {
                                        if (!tL_messageActionStarGift.converted) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                        }
                                    } else if (z7) {
                                        if (messageObject2.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject2.isOutOwner()) {
                                        if (!z8) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (z8) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                    }
                                }
                                CharSequence charSequence1110 = charSequenceReplaceTags4;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 == null) {
                                    string7 = null;
                                } else {
                                    string7 = null;
                                }
                                string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject2.isOutOwner()) {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder117 = new SpannableStringBuilder();
                                        spannableStringBuilder117.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan16 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan16.setScale(0.8f, 0.8f);
                                        spannableStringBuilder117.setSpan(coloredImageSpan16, 0, 1, 33);
                                        spannableStringBuilder117.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder117;
                                    }
                                } else {
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    charSequence4 = string8;
                                    if (!messageObject2.isOutOwner()) {
                                        SpannableStringBuilder spannableStringBuilder118 = new SpannableStringBuilder();
                                        spannableStringBuilder118.append((CharSequence) "^  ");
                                        ColoredImageSpan coloredImageSpan17 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan17.setScale(0.8f, 0.8f);
                                        spannableStringBuilder118.setSpan(coloredImageSpan17, 0, 1, 33);
                                        spannableStringBuilder118.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder118;
                                    }
                                }
                                CharSequence charSequence1111 = charSequence4;
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    spannableStringBuilderReplaceSingleTagToLink = null;
                                } else {
                                    spannableStringBuilderReplaceSingleTagToLink = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence1110, false, charSequence1111, 11, string7, this.giftRectSize, true);
                            } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else {
                                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                            tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                            j2 = tL_messageActionStarGift.convert_stars;
                            clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                            peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (messageObject2.getDialogId() == clientUserId) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            fromChatId2 = messageObject2.getFromChatId();
                            if (!tL_messageActionStarGift.prepaid_upgrade) {
                                fromChatId2 = DialogObject.getPeerDialogId(peer2);
                            }
                            spannableStringBuilder3 = new SpannableStringBuilder();
                            userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId2);
                            peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                            TLObject userOrChat10 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId2);
                            if (tL_messageActionStarGift.can_upgrade) {
                                z6 = z5;
                                j3 = peerDialogId2;
                                z7 = false;
                            } else {
                                z6 = z5;
                                j3 = peerDialogId2;
                                z7 = false;
                            }
                            if (j3 == j) {
                                if (!z6) {
                                    if (tL_messageActionStarGift.prepaid_upgrade) {
                                        i3 = R.string.Gift2ActionUpgradeTitle;
                                    } else {
                                        i3 = R.string.Gift2ActionTitle;
                                    }
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder3.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan110 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan110.setObject(userOrChat);
                                        spannableStringBuilder3.setSpan(avatarSpan110, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                    }
                                    spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                } else if (tL_messageActionStarGift.gift_num > 0) {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                } else {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                }
                            } else if (!z6) {
                                if (tL_messageActionStarGift.prepaid_upgrade) {
                                    i3 = R.string.Gift2ActionUpgradeTitle;
                                } else {
                                    i3 = R.string.Gift2ActionTitle;
                                }
                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                if (DialogObject.hasPhoto(userOrChat)) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    AvatarSpan avatarSpan111 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                    avatarSpan111.setObject(userOrChat);
                                    spannableStringBuilder3.setSpan(avatarSpan111, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                            } else if (tL_messageActionStarGift.gift_num > 0) {
                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                            } else {
                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                            }
                            if (messageObject2.isOutOwner()) {
                            }
                            if (tL_messageActionStarGift.refunded) {
                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                            } else {
                                tL_textWithEntities2 = tL_messageActionStarGift.message;
                                if (tL_textWithEntities2 == null) {
                                    if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z4) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (z8) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                        }
                                    } else if (z6) {
                                        if (!tL_messageActionStarGift.converted) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                        }
                                    } else if (z7) {
                                        if (messageObject2.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject2.isOutOwner()) {
                                        if (!z8) {
                                            if (tL_messageActionStarGift.can_upgrade) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                            }
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (z8) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (z8) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                    }
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                } else if (z4) {
                                    if (tL_messageActionStarGift.converted) {
                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                    } else if (z8) {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert));
                                    }
                                } else if (z6) {
                                    if (!tL_messageActionStarGift.converted) {
                                        if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                        }
                                    } else if (tL_messageActionStarGift.can_upgrade) {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade));
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert));
                                    }
                                } else if (z7) {
                                    if (messageObject2.isOutOwner()) {
                                        string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                    } else {
                                        string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                    }
                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                } else if (messageObject2.isOutOwner()) {
                                    if (!z8) {
                                        if (tL_messageActionStarGift.can_upgrade) {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                        }
                                    } else if (tL_messageActionStarGift.can_upgrade) {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                    }
                                } else if (tL_messageActionStarGift.converted) {
                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                } else if (tL_messageActionStarGift.saved) {
                                    if (z8) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                    } else {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                    }
                                } else if (z8) {
                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                } else {
                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                }
                            }
                            CharSequence charSequence1112 = charSequenceReplaceTags4;
                            starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null) {
                                string7 = null;
                            } else {
                                string7 = null;
                            }
                            string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                            if (messageObject2.isOutOwner()) {
                                charSequence4 = string8;
                                charSequence4 = string8;
                                charSequence4 = string8;
                                if (!messageObject2.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder119 = new SpannableStringBuilder();
                                    spannableStringBuilder119.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan18 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan18.setScale(0.8f, 0.8f);
                                    spannableStringBuilder119.setSpan(coloredImageSpan18, 0, 1, 33);
                                    spannableStringBuilder119.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence4 = spannableStringBuilder119;
                                }
                            } else {
                                charSequence4 = string8;
                                charSequence4 = string8;
                                charSequence4 = string8;
                                if (!messageObject2.isOutOwner()) {
                                    SpannableStringBuilder spannableStringBuilder1110 = new SpannableStringBuilder();
                                    spannableStringBuilder1110.append((CharSequence) "^  ");
                                    ColoredImageSpan coloredImageSpan19 = new ColoredImageSpan(R.drawable.gift_unpack);
                                    coloredImageSpan19.setScale(0.8f, 0.8f);
                                    spannableStringBuilder1110.setSpan(coloredImageSpan19, 0, 1, 33);
                                    spannableStringBuilder1110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                    charSequence4 = spannableStringBuilder1110;
                                }
                            }
                            CharSequence charSequence1113 = charSequence4;
                            starGift3 = tL_messageActionStarGift.gift;
                            if (starGift3 != null) {
                                spannableStringBuilderReplaceSingleTagToLink = null;
                            } else {
                                spannableStringBuilderReplaceSingleTagToLink = null;
                            }
                            createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilderReplaceSingleTagToLink, charSequence1112, false, charSequence1113, 11, string7, this.giftRectSize, true);
                        } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                            createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else {
                            createGiftPremiumLayouts(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.currentMessageObject.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                    } else if (i == 33) {
                        tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message4.action;
                        spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                            spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                        } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                            spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                        } else {
                            iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                            if (iMax == 0) {
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                            } else {
                                shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                if (shortDuration2.endsWith(".")) {
                                    shortDuration2 = Fragment$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
                                }
                                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, shortDuration2)));
                            }
                        }
                        createGiftPremiumLayouts(null, null, spannableStringBuilder2, false, null, 11, null, this.giftRectSize, false);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                        this.giftRectEmpty = false;
                    } else if (i == 34) {
                        createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                        this.giftRectEmpty = true;
                    } else if (i == 35) {
                        tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                        spannableStringBuilder = new SpannableStringBuilder();
                        shortName = DialogObject.getShortName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())));
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            if (messageObject2.isOut()) {
                                charSequenceReplaceTags3 = LocaleController.getString(R.string.SharingOfferDisableHeaderYou);
                            } else {
                                charSequenceReplaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName));
                            }
                            spannableStringBuilder.append(charSequenceReplaceTags3);
                        } else {
                            if (messageObject2.isOut()) {
                                charSequenceReplaceTags2 = LocaleController.getString(R.string.SharingOfferEnableHeaderYou);
                            } else {
                                charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName));
                            }
                            spannableStringBuilder.append(charSequenceReplaceTags2);
                        }
                        if (tL_messageActionNoForwardsRequest.new_value) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            String string18 = LocaleController.getString(R.string.SharingOfferDisable1);
                            int i18 = R.drawable.floating_check;
                            spannableStringBuilder.append((CharSequence) createOption(i18, string18));
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) createOption(i18, LocaleController.getString(R.string.SharingOfferDisable2)));
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) createOption(i18, LocaleController.getString(R.string.SharingOfferDisable3)));
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) createOption(i18, LocaleController.getString(R.string.SharingOfferDisable4)));
                        } else {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            String string19 = LocaleController.getString(R.string.SharingOfferEnable1);
                            int i19 = R.drawable.floating_check;
                            spannableStringBuilder.append((CharSequence) createOption(i19, string19));
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) createOption(i19, LocaleController.getString(R.string.SharingOfferEnable2)));
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) createOption(i19, LocaleController.getString(R.string.SharingOfferEnable3)));
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) createOption(i19, LocaleController.getString(R.string.SharingOfferEnable4)));
                        }
                        createGiftPremiumLayouts(null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                        this.giftRectEmpty = true;
                    } else if (i == 31) {
                        TL_stars.StarGift starGift8 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(starGift8.title);
                        sb5.append(" #");
                        strM = BillingController$$ExternalSyntheticOutline0.m(starGift8.num, ',', sb5);
                        fromChatId = messageObject2.getFromChatId();
                        if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId) {
                            string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                        } else {
                            string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId), strM);
                        }
                        createGiftPremiumLayouts(null, null, AndroidUtilities.replaceTags(string5), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                    } else if (i == 37) {
                        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity5 = (TLRPC.TL_messageActionChangeCommunity) message4.action;
                        peerDialogId = DialogObject.getPeerDialogId(message4.peer_id);
                        boolean zIsChannelAndNotMegaGroup5 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, this.currentAccount);
                        if (peerDialogId > j) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String shortName10 = DialogObject.getShortName(this.currentAccount, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                        String shortName11 = DialogObject.getShortName(this.currentAccount, -tL_messageActionChangeCommunity5.community_id);
                        SpannableStringBuilder spannableStringBuilder1111 = new SpannableStringBuilder();
                        spannableStringBuilder1111.append((CharSequence) CommunityUtils.buildServiceMessageText(messageObject2, shortName11, shortName10, zIsChannelAndNotMegaGroup5, z3));
                        createGiftPremiumLayouts(null, null, spannableStringBuilder1111, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                    } else if (i == 18) {
                        messageAction = message4.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
                            tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
                        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
                            tL_textWithEntities = ((TLRPC.TL_messageActionGiftCode) messageAction).message;
                        } else {
                            tL_textWithEntities = null;
                        }
                        if (tL_textWithEntities != null) {
                            string4 = null;
                        } else {
                            string4 = null;
                        }
                        if (string4 == null) {
                            string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                        }
                        CharSequence charSequence1114 = string4;
                        messageObject = this.currentMessageObject;
                        if (messageObject != null) {
                            message = messageObject.messageOwner;
                            messageAction2 = message.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                i2 = R.string.ActionGiftPremiumView;
                            } else {
                                if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                                    i2 = R.string.GiftPremiumUseGiftBtn;
                                } else {
                                    i2 = R.string.ActionGiftPremiumView;
                                }
                            }
                        } else {
                            i2 = R.string.ActionGiftPremiumView;
                        }
                        createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence1114, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                    } else if (i == 21) {
                        tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                        MessagesController messagesController9 = MessagesController.getInstance(this.currentAccount);
                        if (messageObject2.isOutOwner()) {
                            dialogId2 = j;
                        } else {
                            dialogId2 = messageObject2.getDialogId();
                        }
                        user3 = messagesController9.getUser(Long.valueOf(dialogId2));
                        if (tL_messageActionSuggestProfilePhoto.video) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                            user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId()));
                            if (z2) {
                                string2 = LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                            } else {
                                string2 = LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                            }
                        } else if (z2) {
                            string2 = LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                        } else {
                            string2 = LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                        }
                        CharSequence charSequence1115 = string2;
                        if (tL_messageActionSuggestProfilePhoto.video) {
                            string3 = LocaleController.getString(R.string.ViewVideoAction);
                        } else {
                            string3 = LocaleController.getString(R.string.ViewVideoAction);
                        }
                        createGiftPremiumLayouts(null, null, charSequence1115, false, string3, 11, null, this.giftRectSize, true);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                    } else if (i == 22) {
                        MessagesController messagesController10 = MessagesController.getInstance(this.currentAccount);
                        if (messageObject2.isOutOwner()) {
                            dialogId = j;
                        } else {
                            dialogId = messageObject2.getDialogId();
                        }
                        user2 = messagesController10.getUser(Long.valueOf(dialogId));
                        if (messageObject2.getDialogId() < j) {
                            charSequence3 = messageObject2.messageText;
                        } else {
                            if (messageObject2.isOutOwner()) {
                            }
                            if (user2 == null) {
                            }
                            charSequence2 = messageObject2.messageText;
                            string = LocaleController.getString(R.string.ViewWallpaperAction);
                            z = true;
                            createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                        charSequence2 = charSequence3;
                        string = null;
                        z = true;
                        createGiftPremiumLayouts(null, null, charSequence2, false, string, 11, null, this.giftRectSize, z);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                    } else if (messageObject2.isStoryMention()) {
                        user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                        if (user.self) {
                            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
                        } else {
                            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user.first_name));
                        }
                        createGiftPremiumLayouts(null, null, charSequenceReplaceTags, false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.giftRectSize, true);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.titleLayout = null;
                        this.titleHeight = 0;
                        this.textY = 0;
                    }
                }
            }
        }
        this.reactionsLayoutInBubble.x = AndroidUtilities.dp(12.0f);
        this.reactionsLayoutInBubble.measure(this.previousWidth - AndroidUtilities.dp(24.0f), 1);
    }

    public final void checkLeftRightBounds() {
        this.backgroundLeft = (int) Math.min(this.backgroundLeft, this.rect.left);
        this.backgroundRight = (int) Math.max(this.backgroundRight, this.rect.right);
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

    public final void createGiftPremiumChannelLayouts() {
        SpannableStringBuilder spannableStringBuilder;
        int iDp = this.giftRectSize - AndroidUtilities.dp(16.0f);
        this.giftTitlePaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action;
        int i = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        String str = chat == null ? null : chat.title;
        boolean z = tL_messageActionGiftCode.via_giveaway;
        String string = tL_messageActionGiftCode.unclaimed ? LocaleController.getString("BoostingUnclaimedPrize", R.string.BoostingUnclaimedPrize) : LocaleController.getString("BoostingCongratulations", R.string.BoostingCongratulations);
        String pluralString = i == 12 ? LocaleController.formatPluralString("BoldYears", 1, new Object[0]) : LocaleController.formatPluralString("BoldMonths", i, new Object[0]);
        if (!z) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(str == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString("BoostingReceivedGiftFrom", R.string.BoostingReceivedGiftFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedGiftDuration, pluralString)));
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingYouHaveUnclaimedPrize, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingUnclaimedPrizeDuration, pluralString)));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeDuration, pluralString)));
        }
        String string2 = LocaleController.getString("BoostingReceivedGiftOpenBtn", R.string.BoostingReceivedGiftOpenBtn);
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
        spannableStringBuilderValueOf.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilderValueOf.length(), 33);
        TextPaint textPaint = this.giftTitlePaint;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.giftPremiumTitleLayout = new StaticLayout(spannableStringBuilderValueOf, textPaint, iDp, alignment, 1.1f, 0.0f, false);
        this.giftPremiumSubtitleLayout = null;
        this.giftPremiumReleasedText = null;
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            AnimatedEmojiSpan.release(ChatActionCell.this, textLayout.emoji);
        }
        TextLayout textLayout2 = new TextLayout();
        this.giftPremiumText = textLayout2;
        textLayout2.setText(spannableStringBuilder, this.giftTextPaint, iDp);
        SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(string2);
        spannableStringBuilderValueOf2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilderValueOf2.length(), 33);
        this.giftPremiumTextCollapsed = false;
        this.giftPremiumTextCollapsedHeight = 0;
        this.giftPremiumTextMore = null;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilderValueOf2, (TextPaint) getThemedPaint("paintChatActionText"), iDp, alignment, 1.0f, 0.0f, false);
        this.giftPremiumButtonLayout = staticLayout;
        this.buttonClickableAsImage = true;
        float f = 0.0f;
        for (int i2 = 0; i2 < staticLayout.getLineCount(); i2++) {
            float fCeil = (int) Math.ceil(staticLayout.getLineWidth(i2));
            if (fCeil > f) {
                f = fCeil;
            }
        }
        this.giftPremiumButtonWidth = f;
    }

    public final void createGiftPremiumLayouts(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, String str, int i2, boolean z2) {
        ?? r4;
        int i3;
        ?? ReplaceEmoji;
        ?? SubSequence;
        int iCutInFancyHalf;
        CharSequence charSequence4 = charSequence2;
        int iDp = i2 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 30) {
            iDp -= AndroidUtilities.dp(16.0f);
        }
        int i4 = iDp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 == null || messageObject2.type != 30) {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(16.0f));
            } else {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(14.0f));
            }
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            spannableStringBuilderValueOf.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilderValueOf.length(), 33);
            r4 = 0;
            this.giftPremiumTitleLayout = new StaticLayout(spannableStringBuilderValueOf, this.giftTitlePaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r4 = 0;
            this.giftPremiumTitleLayout = null;
        }
        this.giftPremiumSubtitleLayout = null;
        if (spannableStringBuilder != null) {
            Text text = new Text(spannableStringBuilder, 10.0f);
            this.giftPremiumReleasedText = text;
            text.paint.linkColor = -1;
        } else {
            this.giftPremiumReleasedText = null;
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null && messageObject3.type == 35) {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 == null || !(isNewStyleButtonLayout() || (i3 = this.currentMessageObject.type) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33)) {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(15.0f));
        } else {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        }
        int iDp2 = i4 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.currentMessageObject;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (iCutInFancyHalf = HintView2.cutInFancyHalf(charSequence4, this.giftTextPaint)) < iDp2 && iCutInFancyHalf > iDp2 / 5.0f) {
            iDp2 = iCutInFancyHalf;
        }
        if (charSequence4 == null) {
            TextLayout textLayout = this.giftPremiumText;
            if (textLayout != null) {
                AnimatedEmojiSpan.release(ChatActionCell.this, textLayout.emoji);
                this.giftPremiumText = null;
            }
            this.giftPremiumTextCollapsed = r4;
        } else {
            if (this.giftPremiumText == null) {
                this.giftPremiumText = new TextLayout();
            }
            try {
                ReplaceEmoji = Emoji.replaceEmoji(charSequence4, this.giftTextPaint.getFontMetricsInt(), r4);
            } catch (Exception unused) {
                ReplaceEmoji = charSequence4;
            }
            this.giftPremiumText.setText(ReplaceEmoji, this.giftTextPaint, iDp2);
            if (!z || this.giftPremiumText.layout.getLineCount() <= 3) {
                this.giftPremiumTextCollapsed = r4;
                this.giftPremiumTextExpandedAnimated.set(true, true);
                this.giftPremiumTextCollapsedHeight = r4;
            } else {
                this.giftPremiumTextCollapsed = !this.giftPremiumTextUncollapsed;
                this.giftPremiumTextCollapsedHeight = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMore = new Text(LocaleController.getString(R.string.Gift2CaptionMore), this.giftTextPaint.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMoreY = lineBottom;
                this.giftPremiumTextMoreH = lineBottom - this.giftPremiumText.layout.getLineTop(2);
                this.giftPremiumTextMoreX = (int) this.giftPremiumText.layout.getLineRight(2);
            }
            if (this.giftPremiumTextCollapsed) {
                int lineEnd = this.giftPremiumText.layout.getLineEnd(2) - 1;
                ?? r9 = this.giftPremiumText;
                if (lineEnd >= 0) {
                    SubSequence = ReplaceEmoji;
                    SubSequence = ReplaceEmoji.subSequence(r4, lineEnd);
                }
                SubSequence = ReplaceEmoji;
                r9.setText(SubSequence, this.giftTextPaint, iDp2);
            }
        }
        float f = 0.0f;
        if (charSequence3 != null) {
            ?? ValueOf = SpannableStringBuilder.valueOf(charSequence3);
            ValueOf.setSpan(new TypefaceSpan(AndroidUtilities.bold()), r4, ValueOf.length(), 33);
            StaticLayout staticLayout = new StaticLayout(ValueOf, (TextPaint) getThemedPaint("paintChatActionText"), i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.giftPremiumButtonLayout = staticLayout;
            this.buttonClickableAsImage = z2 && !this.giftPremiumTextCollapsed;
            for (int i5 = 0; i5 < staticLayout.getLineCount(); i5++) {
                float fCeil = (int) Math.ceil(staticLayout.getLineWidth(i5));
                if (fCeil > f) {
                    f = fCeil;
                }
            }
            this.giftPremiumButtonWidth = f;
        } else {
            this.giftPremiumButtonLayout = null;
            this.buttonClickableAsImage = r4;
            this.giftPremiumButtonWidth = 0.0f;
        }
        if (str == null) {
            this.giftRibbonPath = null;
            this.giftRibbonText = null;
            return;
        }
        if (this.giftRibbonPaintEffect == null) {
            this.giftRibbonPaintEffect = new CornerPathEffect(AndroidUtilities.dp(5.0f));
        }
        if (this.giftRibbonPath == null) {
            Path path = new Path();
            this.giftRibbonPath = path;
            GiftSheet.RibbonDrawable.fillRibbonPath(path, 1.35f, r4);
        }
        Text text2 = new Text(str, i, AndroidUtilities.bold());
        this.giftRibbonText = text2;
        text2.ellipsize(AndroidUtilities.dp(62.0f));
    }

    public final void createLayout(CharSequence charSequence, int i) {
        CharSequence charSequenceReplaceEmoji;
        ChatActionCellDelegate chatActionCellDelegate;
        TLRPC.Message message;
        MessageObject messageObject;
        int i2;
        int iDp = i - AndroidUtilities.dp(30.0f);
        if (this.isSideMenued) {
            iDp -= AndroidUtilities.dp(64.0f);
        }
        if (isMessageActionSuggestedPostApproval()) {
            iDp = Math.min(iDp - AndroidUtilities.dp(this.isSideMenued ? 28.0f : 82.0f), AndroidUtilities.dp(272.0f));
        }
        if (iDp < 0) {
            return;
        }
        int i3 = this.overriddenMaxWidth;
        if (i3 > 0) {
            iDp = Math.min(i3, iDp);
        }
        int i4 = iDp;
        this.invalidatePath = true;
        TextPaint textPaint = (isMessageActionSuggestedPostApproval() || ((messageObject = this.currentMessageObject) != null && ((i2 = messageObject.type) == 34 || i2 == 35))) ? (TextPaint) getThemedPaint("paintChatActionText3") : (messageObject == null || !messageObject.drawServiceWithDefaultTypeface) ? (TextPaint) getThemedPaint("paintChatActionText") : (TextPaint) getThemedPaint("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (isMessageActionSuggestedPostApproval()) {
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class)) {
                    spannable.removeSpan(emojiSpan);
                }
            }
            charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        } else {
            charSequenceReplaceEmoji = charSequence;
        }
        CharSequence charSequence2 = charSequenceReplaceEmoji;
        this.textLayout = new StaticLayout(charSequenceReplaceEmoji, textPaint, i4, isMessageActionSuggestedPostApproval() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.titleLayout = null;
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.titleLayout = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        this.textHeight = 0;
        this.textWidth = 0;
        this.titleHeight = 0;
        StaticLayout staticLayout = this.titleLayout;
        if (staticLayout != null) {
            int height = staticLayout.getHeight();
            this.titleHeight = height;
            this.titleHeight = AndroidUtilities.dp(12.0f) + height;
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 == null || !messageObject3.isRepostPreview) {
            try {
                int lineCount = this.textLayout.getLineCount();
                for (int i5 = 0; i5 < lineCount; i5++) {
                    try {
                        float lineWidth = this.textLayout.getLineWidth(i5);
                        float f = i4;
                        if (lineWidth > f) {
                            lineWidth = f;
                        }
                        this.textHeight = (int) Math.max(this.textHeight, Math.ceil(this.textLayout.getLineBottom(i5)));
                        this.textWidth = (int) Math.max(this.textWidth, Math.ceil(lineWidth));
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        this.textX = (i - this.textWidth) / 2;
        int iDp2 = AndroidUtilities.dp(7.0f);
        this.textY = iDp2;
        if (this.titleLayout != null) {
            this.textY = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(11.0f, this.titleHeight, iDp2);
        }
        this.textXLeft = (i - (isMessageActionSuggestedPostApproval() ? this.textWidth : this.textLayout.getWidth())) / 2;
        this.titleXLeft = (i - i4) / 2;
        this.spoilersPool.addAll(this.spoilers);
        this.spoilers.clear();
        if (charSequence2 instanceof Spannable) {
            StaticLayout staticLayout2 = this.textLayout;
            int i6 = this.textX;
            SpoilerEffect.addSpoilers(this, staticLayout2, i6, i6 + this.textWidth, (Spannable) charSequence2, this.spoilersPool, this.spoilers, null);
        }
    }

    public final void didPressCustomBotButton(BotInlineKeyboard.ButtonCustom buttonCustom) {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        TLRPC.Message message3;
        char c;
        int i;
        String string;
        long j;
        AmountUtils$Amount amountUtils$AmountFromDecimal;
        int i2;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        boolean z;
        int i3;
        int iRound;
        if (getMessageObject() == null) {
            return;
        }
        int i4 = buttonCustom.id;
        if (i4 == 5) {
            ChatActionCellDelegate chatActionCellDelegate = this.delegate;
            BaseFragment baseFragment = chatActionCellDelegate != null ? chatActionCellDelegate.getBaseFragment() : null;
            if (baseFragment == null || this.currentMessageObject == null) {
                return;
            }
            AlertsCreator.showSimpleConfirmAlert(baseFragment, LocaleController.getString(R.string.GiftOfferRejectConfirmTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferRejectConfirmText, DialogObject.getShortName(this.currentMessageObject.getDialogId()))), LocaleController.getString(R.string.GiftOfferRejectConfirmConfirm), true, new ChatActionCell$$ExternalSyntheticLambda8(15, this, baseFragment));
            return;
        }
        if (i4 != 6) {
            if (i4 == 7) {
                ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
                BaseFragment baseFragment2 = chatActionCellDelegate2 != null ? chatActionCellDelegate2.getBaseFragment() : null;
                if (baseFragment2 == null || (messageObject2 = this.currentMessageObject) == null || (message2 = messageObject2.messageOwner) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction = message2.action;
                if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                    final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction;
                    final int i5 = 0;
                    AlertsCreator.showSimpleConfirmAlert(baseFragment2, LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelText : R.string.SharingOfferEnableCancelText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) {
                        public final ChatActionCell f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    this.f$0.lambda$didPressCustomBotButton$9(tL_messageActionNoForwardsRequest);
                                    break;
                                default:
                                    this.f$0.lambda$didPressCustomBotButton$10(tL_messageActionNoForwardsRequest);
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (i4 == 8) {
                ChatActionCellDelegate chatActionCellDelegate3 = this.delegate;
                BaseFragment baseFragment3 = chatActionCellDelegate3 != null ? chatActionCellDelegate3.getBaseFragment() : null;
                if (baseFragment3 == null || (messageObject = this.currentMessageObject) == null || (message = messageObject.messageOwner) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction2 = message.action;
                if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                    final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                    final int i6 = 1;
                    AlertsCreator.showSimpleConfirmAlert(baseFragment3, LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableConfirmText : R.string.SharingOfferEnableConfirmText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) {
                        public final ChatActionCell f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    this.f$0.lambda$didPressCustomBotButton$9(tL_messageActionNoForwardsRequest2);
                                    break;
                                default:
                                    this.f$0.lambda$didPressCustomBotButton$10(tL_messageActionNoForwardsRequest2);
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null && (message3 = messageObject3.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message3.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction3;
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                Context context = getContext();
                Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
                int i7 = this.currentAccount;
                long dialogId = this.currentMessageObject.getDialogId();
                int id = this.currentMessageObject.getId();
                int[] iArr = GiftOfferSheet.ALLOWED_DURATIONS;
                AmountUtils$Amount amountUtils$AmountOfSafe = AmountUtils$Amount.ofSafe(tL_messageActionStarGiftPurchaseOffer.price);
                AmountUtils$Currency amountUtils$Currency = amountUtils$AmountOfSafe.currency;
                AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
                if (amountUtils$Currency == amountUtils$Currency2) {
                    c = 2;
                    i = MessagesController.getInstance(i7).config.starsStarGiftResaleCommissionPermille.get();
                } else {
                    c = 2;
                    i = MessagesController.getInstance(i7).config.tonStarGiftResaleCommissionPermille.get();
                }
                AmountUtils$Amount amountUtils$AmountFromNano = AmountUtils$Amount.fromNano((amountUtils$AmountOfSafe.nanos * ((long) i)) / 1000, amountUtils$Currency);
                TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                StringBuilder sb = new StringBuilder();
                sb.append(starGift.title);
                sb.append(" #");
                String strM = BillingController$$ExternalSyntheticOutline0.m(starGift.num, ',', sb);
                TLObject user = dialogId >= 0 ? MessagesController.getInstance(i7).getUser(Long.valueOf(dialogId)) : MessagesController.getInstance(i7).getChat(Long.valueOf(-dialogId));
                String strAsFormatString = amountUtils$AmountOfSafe.asFormatString();
                String strAsFormatString2 = amountUtils$AmountFromNano.asFormatString();
                AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.TON;
                AmountUtils$Currency amountUtils$Currency4 = amountUtils$AmountOfSafe.currency;
                boolean z2 = amountUtils$Currency4 == amountUtils$Currency3;
                LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
                linearLayoutM.addView(new StarGiftSheet.GiftTransferTopView(context, starGift, user), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
                TextView textView = new TextView(context);
                OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 16.0f);
                if (amountUtils$Currency4 == amountUtils$Currency2) {
                    int i8 = R.string.GiftOfferTransferInfoTextSellStars;
                    String shortName = DialogObject.getShortName(dialogId);
                    Object[] objArr = new Object[4];
                    objArr[0] = strAsFormatString;
                    objArr[1] = shortName;
                    objArr[c] = strM;
                    objArr[3] = strAsFormatString2;
                    string = LocaleController.formatString(i8, objArr);
                } else {
                    int i9 = R.string.GiftOfferTransferInfoTextSellTON;
                    String shortName2 = DialogObject.getShortName(dialogId);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = strAsFormatString;
                    objArr2[1] = shortName2;
                    objArr2[c] = strM;
                    objArr2[3] = strAsFormatString2;
                    string = LocaleController.formatString(i9, objArr2);
                }
                textView.setText(AndroidUtilities.replaceTags(string));
                linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                TableView tableView = new TableView(context, resourcesProvider);
                frameLayout.addView(tableView, LayoutHelper.createFrame(-1, -1, 119));
                StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                StarGiftSheet.addAttributeRow(tableView, StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 48, 23, 16, 23, 4));
                double dPow = starGift.value_usd_amount / Math.pow(10.0d, BillingController.getInstance().getCurrencyExp("USD"));
                if (amountUtils$Currency4 != amountUtils$Currency3) {
                    if (amountUtils$Currency4 == amountUtils$Currency2) {
                        amountUtils$AmountFromDecimal = new AmountUtils$Amount((long) (((dPow * 100000.0d) / ((double) MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000)) * 1000000000), amountUtils$Currency2).round(0);
                    } else {
                        j = 0;
                        amountUtils$AmountFromDecimal = AmountUtils$Amount.fromDecimal(0L, amountUtils$Currency4);
                    }
                    if (amountUtils$AmountFromDecimal.asDouble() > 0.0d && starGift.value_usd_amount > j) {
                        if (amountUtils$AmountFromDecimal.nanos >= amountUtils$AmountFromNano.nanos) {
                            iRound = (int) Math.round((1.0d - (amountUtils$AmountFromNano.asDouble() / amountUtils$AmountFromDecimal.asDouble())) * 100.0d);
                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountLowerHint2, RendererCapabilities.CC.m(iRound, "%"), starGift.title));
                            if (iRound > 10) {
                                i2 = 1;
                                z = true;
                            } else {
                                i2 = 1;
                            }
                            TextView textView2 = new TextView(context);
                            textView2.setTextSize(i2, 13.0f);
                            textView2.setGravity(17);
                            textView2.setText(spannableStringBuilderReplaceTags);
                            if (z) {
                                i3 = Theme.key_text_RedRegular;
                            } else {
                                i3 = Theme.key_windowBackgroundWhiteGrayText;
                            }
                            textView2.setTextColor(Theme.getColor(i3, resourcesProvider));
                            linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
                        } else {
                            int iRound2 = (int) Math.round(((amountUtils$AmountFromNano.asDouble() / amountUtils$AmountFromDecimal.asDouble()) - 1.0d) * 100.0d);
                            i2 = 1;
                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, RendererCapabilities.CC.m(iRound2, "%"), starGift.title));
                        }
                        z = false;
                        TextView textView3 = new TextView(context);
                        textView3.setTextSize(i2, 13.0f);
                        textView3.setGravity(17);
                        textView3.setText(spannableStringBuilderReplaceTags);
                        if (z) {
                            i3 = Theme.key_text_RedRegular;
                        } else {
                            i3 = Theme.key_windowBackgroundWhiteGrayText;
                        }
                        textView3.setTextColor(Theme.getColor(i3, resourcesProvider));
                        linearLayoutM.addView(textView3, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
                    }
                    new AlertDialog.Builder(context, 0, resourcesProvider).setView(linearLayoutM).setPositiveButton(StarsIntroActivity.replaceStars(z2, LocaleController.formatString(R.string.GiftOfferSellFor, strAsFormatString2), 1.13f), new GiftOfferSheet$$ExternalSyntheticLambda0(id, i7, lastFragment)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().show();
                }
                amountUtils$AmountFromDecimal = new AmountUtils$Amount((long) ((dPow / MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get()) * 1000000000), amountUtils$Currency3).round(2);
                j = 0;
                if (amountUtils$AmountFromDecimal.asDouble() > 0.0d) {
                    if (amountUtils$AmountFromDecimal.nanos >= amountUtils$AmountFromNano.nanos) {
                        iRound = (int) Math.round((1.0d - (amountUtils$AmountFromNano.asDouble() / amountUtils$AmountFromDecimal.asDouble())) * 100.0d);
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountLowerHint2, RendererCapabilities.CC.m(iRound, "%"), starGift.title));
                        if (iRound > 10) {
                            i2 = 1;
                            z = true;
                        } else {
                            i2 = 1;
                        }
                        TextView textView4 = new TextView(context);
                        textView4.setTextSize(i2, 13.0f);
                        textView4.setGravity(17);
                        textView4.setText(spannableStringBuilderReplaceTags);
                        if (z) {
                            i3 = Theme.key_text_RedRegular;
                        } else {
                            i3 = Theme.key_windowBackgroundWhiteGrayText;
                        }
                        textView4.setTextColor(Theme.getColor(i3, resourcesProvider));
                        linearLayoutM.addView(textView4, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
                    } else {
                        int iRound3 = (int) Math.round(((amountUtils$AmountFromNano.asDouble() / amountUtils$AmountFromDecimal.asDouble()) - 1.0d) * 100.0d);
                        i2 = 1;
                        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, RendererCapabilities.CC.m(iRound3, "%"), starGift.title));
                    }
                    z = false;
                    TextView textView5 = new TextView(context);
                    textView5.setTextSize(i2, 13.0f);
                    textView5.setGravity(17);
                    textView5.setText(spannableStringBuilderReplaceTags);
                    if (z) {
                        i3 = Theme.key_text_RedRegular;
                    } else {
                        i3 = Theme.key_windowBackgroundWhiteGrayText;
                    }
                    textView5.setTextColor(Theme.getColor(i3, resourcesProvider));
                    linearLayoutM.addView(textView5, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
                }
                new AlertDialog.Builder(context, 0, resourcesProvider).setView(linearLayoutM).setPositiveButton(StarsIntroActivity.replaceStars(z2, LocaleController.formatString(R.string.GiftOfferSellFor, strAsFormatString2), 1.13f), new GiftOfferSheet$$ExternalSyntheticLambda0(id, i7, lastFragment)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().show();
            }
        }
    }

    @Override
    public void didPressReactionFromLayout(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            chatActionCellDelegate.didPressReaction(this, reactionCount, z, f, f2);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageObject messageObject;
        if (i == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
            return;
        }
        if (i == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i == NotificationCenter.didUpdatePremiumGiftStickers || i == NotificationCenter.starGiftsLoaded || i == NotificationCenter.didUpdateTonGiftStickers) {
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null) {
                setMessageObject(messageObject2, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.currentAccount).premiumGiftsStickerPack) && (messageObject = this.currentMessageObject) != null) {
            setMessageObject(messageObject, true);
        }
    }

    public void drawBackground(Canvas canvas, boolean z) {
        Paint paint;
        float f;
        float f2;
        float f3;
        float f4;
        Paint paint2;
        int alpha;
        int alpha2;
        Canvas canvas2;
        int i;
        TextLayout textLayout;
        float f5;
        float f6;
        int iDp;
        int i2;
        if (this.canDrawInParent) {
            if (hasGradientService() && !z) {
                return;
            }
            if (!hasGradientService() && z) {
                return;
            }
        }
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        Paint themedPaint2 = getThemedPaint("paintChatActionBackgroundDarken");
        this.textPaint = (TextPaint) getThemedPaint("paintChatActionText");
        int i3 = this.overrideBackground;
        if (i3 >= 0) {
            int color = Theme.getColor(i3, this.themeDelegate);
            if (this.overrideBackgroundPaint == null) {
                Paint paint3 = new Paint(1);
                this.overrideBackgroundPaint = paint3;
                paint3.setColor(color);
                TextPaint textPaint = new TextPaint(1);
                this.overrideTextPaint = textPaint;
                textPaint.setTypeface(AndroidUtilities.bold());
                this.overrideTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                this.overrideTextPaint.setColor(Theme.getColor(this.overrideText, this.themeDelegate));
            }
            themedPaint = this.overrideBackgroundPaint;
            this.textPaint = this.overrideTextPaint;
        }
        if (this.invalidatePath) {
            this.invalidatePath = false;
            this.backgroundLeft = getWidth();
            this.backgroundRight = 0;
            this.lineWidths.clear();
            StaticLayout staticLayout = this.textLayout;
            int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
            int iDp2 = AndroidUtilities.dp(11.0f);
            int iDp3 = AndroidUtilities.dp(8.0f);
            int iM = 0;
            int i4 = 0;
            while (iM < lineCount) {
                int iCeil = (int) Math.ceil(this.textLayout.getLineWidth(iM));
                if (iM != 0 && (i2 = i4 - iCeil) > 0) {
                    if (i2 <= (iDp2 * 1.5f) + iDp3) {
                    }
                    iM = LocationController$$ExternalSyntheticOutline0.m(i4, iM, 1, this.lineWidths);
                }
                i4 = iCeil;
                iM = LocationController$$ExternalSyntheticOutline0.m(i4, iM, 1, this.lineWidths);
            }
            f = 6.0f;
            f2 = 8.0f;
            f3 = 2.0f;
            for (int i5 = lineCount - 2; i5 >= 0; i5--) {
                int iIntValue = this.lineWidths.get(i5).intValue();
                int i6 = i4 - iIntValue;
                if (i6 <= 0 || i6 > (iDp2 * 1.5f) + iDp3) {
                    i4 = iIntValue;
                }
                this.lineWidths.set(i5, Integer.valueOf(i4));
            }
            int iDp4 = AndroidUtilities.dp(4.0f);
            int measuredWidth = getMeasuredWidth() / 2;
            int iDp5 = AndroidUtilities.dp(3.0f);
            int iDp6 = AndroidUtilities.dp(6.0f);
            int i7 = iDp2 - iDp5;
            this.lineHeights.clear();
            this.backgroundPath.reset();
            f4 = 4.0f;
            float f7 = measuredWidth;
            this.backgroundPath.moveTo(f7, iDp4);
            int i8 = 0;
            int i9 = 0;
            while (i8 < lineCount) {
                int iIntValue2 = this.lineWidths.get(i8).intValue();
                int i10 = i9;
                int lineBottom = this.textLayout.getLineBottom(i8);
                int i11 = lineCount - 1;
                int iIntValue3 = i8 < i11 ? this.lineWidths.get(i8 + 1).intValue() : 0;
                int iDp7 = lineBottom - i10;
                if (i8 == 0 || iIntValue2 > i4) {
                    iDp7 = AndroidUtilities.dp(3.0f) + iDp7;
                }
                if (i8 == i11 || iIntValue2 > iIntValue3) {
                    iDp7 = AndroidUtilities.dp(3.0f) + iDp7;
                }
                int i12 = iDp7;
                float f8 = (iIntValue2 / 2.0f) + f7;
                int i13 = (i8 == i11 || iIntValue2 >= iIntValue3 || i8 == 0 || iIntValue2 >= i4) ? iDp3 : iDp6;
                if (i8 == 0 || iIntValue2 > i4) {
                    f6 = f8;
                    this.rect.set((f6 - iDp5) - iDp2, iDp4, f6 + i7, (iDp2 * 2) + iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, 90.0f);
                } else if (iIntValue2 < i4) {
                    f6 = f8;
                    float f9 = f6 + i7;
                    int i14 = i13 * 2;
                    this.rect.set(f9, iDp4, i14 + f9, i14 + iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, -90.0f);
                } else {
                    f6 = f8;
                }
                iDp4 += i12;
                if (i8 == i11 || iIntValue2 >= iIntValue3) {
                    iDp = i12;
                } else {
                    iDp4 -= AndroidUtilities.dp(3.0f);
                    iDp = i12 - AndroidUtilities.dp(3.0f);
                }
                if (i8 != 0 && iIntValue2 < i4) {
                    iDp4 -= AndroidUtilities.dp(3.0f);
                    iDp -= AndroidUtilities.dp(3.0f);
                }
                this.lineHeights.add(Integer.valueOf(iDp));
                if (i8 == i11 || iIntValue2 > iIntValue3) {
                    this.rect.set((f6 - iDp5) - iDp2, iDp4 - (iDp2 * 2), f6 + i7, iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 0.0f, 90.0f);
                } else if (iIntValue2 < iIntValue3) {
                    float f10 = f6 + i7;
                    int i15 = i13 * 2;
                    this.rect.set(f10, iDp4 - i15, i15 + f10, iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 180.0f, -90.0f);
                }
                i8++;
                i4 = iIntValue2;
                i9 = lineBottom;
                f7 = f7;
                lineCount = lineCount;
                iDp3 = iDp3;
                iDp6 = iDp6;
                themedPaint2 = themedPaint2;
            }
            paint = themedPaint2;
            float f11 = f7;
            int i16 = iDp3;
            int i17 = iDp6;
            int i18 = lineCount - 1;
            int i19 = i18;
            while (i19 >= 0) {
                int iIntValue4 = i19 != 0 ? this.lineWidths.get(i19 - 1).intValue() : 0;
                int iIntValue5 = this.lineWidths.get(i19).intValue();
                int iIntValue6 = i19 != i18 ? this.lineWidths.get(i19 + 1).intValue() : 0;
                this.textLayout.getLineBottom(i19);
                float f12 = measuredWidth - (iIntValue5 / 2);
                int i20 = (i19 == i18 || iIntValue5 >= iIntValue6 || i19 == 0 || iIntValue5 >= iIntValue4) ? i16 : i17;
                if (i19 == i18 || iIntValue5 > iIntValue6) {
                    f5 = f12;
                    this.rect.set(f5 - i7, iDp4 - (iDp2 * 2), f5 + iDp5 + iDp2, iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, 90.0f);
                } else if (iIntValue5 < iIntValue6) {
                    float f13 = f12 - i7;
                    int i21 = i20 * 2;
                    f5 = f12;
                    this.rect.set(f13 - i21, iDp4 - i21, f13, iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, -90.0f);
                } else {
                    f5 = f12;
                }
                iDp4 -= this.lineHeights.get(i19).intValue();
                if (i19 == 0 || iIntValue5 > iIntValue4) {
                    this.rect.set(f5 - i7, iDp4, f5 + iDp5 + iDp2, (iDp2 * 2) + iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 180.0f, 90.0f);
                } else if (iIntValue5 < iIntValue4) {
                    float f14 = f5 - i7;
                    int i22 = i20 * 2;
                    this.rect.set(f14 - i22, iDp4, f14, i22 + iDp4);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 0.0f, -90.0f);
                }
                i19--;
            }
            this.backgroundPath.close();
            if (isMessageActionSuggestedPostApproval() && !isNewStyleButtonLayout()) {
                this.rect.left = (f11 - (this.textWidth / 2.0f)) - AndroidUtilities.dp(17.0f);
                RectF rectF = this.rect;
                rectF.top = iDp4;
                rectF.right = (this.textWidth / 2.0f) + f11 + AndroidUtilities.dp(17.0f);
                this.rect.bottom = AndroidUtilities.dp(28.0f) + iDp4 + this.textHeight + this.titleHeight;
                this.backgroundPath.reset();
                this.backgroundPath.addRoundRect(this.rect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                this.backgroundPath.close();
            }
        } else {
            paint = themedPaint2;
            f = 6.0f;
            f2 = 8.0f;
            f3 = 2.0f;
            f4 = 4.0f;
        }
        if (!this.visiblePartSet) {
            this.backgroundHeight = ((ViewGroup) getParent()).getMeasuredHeight();
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(f4));
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(f4));
        }
        if (!z || (getAlpha() == 1.0f && !isFloating())) {
            paint2 = paint;
            if (isFloating()) {
                alpha = themedPaint.getAlpha();
                alpha2 = paint2.getAlpha();
                themedPaint.setAlpha((int) (alpha * (isFloating() ? 0.75f : 1.0f)));
                paint2.setAlpha((int) (alpha2 * (isFloating() ? 0.75f : 1.0f)));
            } else {
                alpha = -1;
                alpha2 = -1;
            }
        } else {
            alpha = themedPaint.getAlpha();
            alpha2 = paint.getAlpha();
            themedPaint.setAlpha((int) (getAlpha() * alpha * (isFloating() ? 0.75f : 1.0f)));
            paint2 = paint;
            paint2.setAlpha((int) (getAlpha() * alpha2 * (isFloating() ? 0.75f : 1.0f)));
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isRepostPreview) {
            canvas2 = canvas;
            canvas2.drawPath(this.backgroundPath, themedPaint);
            if (hasGradientService() && paint2.getAlpha() > 0) {
                canvas2.drawPath(this.backgroundPath, paint2);
            }
            if (this.dimAmount > 0.0f) {
                int alpha3 = this.dimPaint.getAlpha();
                if (z) {
                    this.dimPaint.setAlpha((int) (getAlpha() * alpha3));
                }
                canvas2.drawPath(this.backgroundPath, this.dimPaint);
                this.dimPaint.setAlpha(alpha3);
            }
        } else {
            canvas2 = canvas;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (this.starGiftLayout.has()) {
            float fDp = this.starGiftLayout.animatorVisualWidth.factor + AndroidUtilities.dp(f2);
            float width = (getWidth() - fDp) / f3;
            float fDp2 = this.starGiftLayout.repost ? 0.0f : AndroidUtilities.dp(12.0f) + this.textY + this.textHeight;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(width, fDp2, fDp + width, this.starGiftLayout.height + fDp2 + AndroidUtilities.dp(f2));
            if (this.backgroundRect == null) {
                this.backgroundRect = new RectF();
            }
            this.backgroundRect.set(rectF2);
            canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), themedPaint);
            if (hasGradientService()) {
                canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint2);
            }
        } else {
            SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
            if (suggestBirthdayActionLayout != null) {
                float fWidth = suggestBirthdayActionLayout.width();
                float fHeight = this.birthdayLayout.height();
                float width2 = (getWidth() - fWidth) / f3;
                if (this.backgroundRect == null) {
                    this.backgroundRect = new RectF();
                }
                this.backgroundRect.set(width2, AndroidUtilities.dp(f4), fWidth + width2, AndroidUtilities.dp(f4) + fHeight);
                canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), themedPaint);
                if (hasGradientService()) {
                    canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint2);
                }
            } else if (isButtonLayout(messageObject2)) {
                float width3 = (getWidth() - this.giftRectSize) / f3;
                float f15 = this.textY + this.textHeight;
                if (isNewStyleButtonLayout()) {
                    float fDp3 = f15 + AndroidUtilities.dp(f4);
                    AndroidUtilities.rectTmp.set(width3, fDp3, this.giftRectSize + width3, this.backgroundRectHeight + fDp3);
                } else {
                    float fDp4 = f15 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f16 = this.giftRectSize;
                    rectF3.set(width3, fDp4, width3 + f16, f16 + fDp4 + this.giftPremiumAdditionalHeight);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !this.giftPremiumTextCollapsed && (textLayout = this.giftPremiumText) != null && this.giftPremiumTextCollapsedHeight > 0) {
                    AndroidUtilities.rectTmp.bottom -= (1.0f - this.giftPremiumTextExpandedAnimated.get()) * (textLayout.layout.getHeight() - this.giftPremiumTextCollapsedHeight);
                }
                if (this.backgroundRect == null) {
                    this.backgroundRect = new RectF();
                }
                this.backgroundRect.set(AndroidUtilities.rectTmp);
                if (messageObject2 == null || (!((i = messageObject2.type) == 33 || i == 35) || this.botInlineButtons == null)) {
                    canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), themedPaint);
                    if (hasGradientService()) {
                        canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint2);
                    }
                } else {
                    Arrays.fill(this.radii, AndroidUtilities.dp(16.0f));
                    float[] fArr = this.radii;
                    float fDp5 = AndroidUtilities.dp(f);
                    fArr[7] = fDp5;
                    fArr[6] = fDp5;
                    fArr[5] = fDp5;
                    fArr[4] = fDp5;
                    this.backgroundPath2.rewind();
                    this.backgroundPath2.addRoundRect(this.backgroundRect, this.radii, Path.Direction.CW);
                    canvas2.drawPath(this.backgroundPath2, themedPaint);
                    if (hasGradientService()) {
                        canvas2.drawPath(this.backgroundPath2, paint2);
                    }
                }
            }
        }
        if (alpha >= 0) {
            themedPaint.setAlpha(alpha);
            paint2.setAlpha(alpha2);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.rippleView) {
            return super.drawChild(canvas, view, j);
        }
        float scale = this.bounce.getScale(0.02f);
        canvas.save();
        canvas.scale(scale, scale, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public void drawOutboundsContent(Canvas canvas) {
        float f;
        float fDp;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f2 = 2.0f;
        canvas2.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.textXLeft, this.textY);
        StaticLayout staticLayout = this.textLayout;
        AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, staticLayout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? getAdaptiveEmojiColorFilter(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        float f3 = 4.0f;
        if (this.starGiftLayout.has()) {
            canvas2.save();
            float width = getWidth();
            StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.starGiftLayout;
            float f4 = (width - starGiftUniqueActionLayout.animatorVisualWidth.factor) / 2.0f;
            if (starGiftUniqueActionLayout.repost) {
                fDp = AndroidUtilities.dp(4.0f);
            } else {
                fDp = AndroidUtilities.dp(16.0f) + this.textY + this.textHeight;
            }
            canvas2.translate(f4, fDp);
            this.starGiftLayout.drawOutbounds(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        if (this.topicSeparator != null) {
            float alpha = getAlpha();
            Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + 0.0f);
            } else {
                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + 0.0f);
            }
            this.topicSeparator.draw(canvas, getWidth(), this.sideMenuWidth, 0.0f, 1.0f, alpha, this.showTopicSeparator);
            canvas2 = canvas;
        }
        ArrayList<BotButton> arrayList = this.botButtons;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider2 = this.themeDelegate;
        if (resourcesProvider2 != null) {
            resourcesProvider2.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        float width2 = (getWidth() - this.giftRectSize) / 2.0f;
        float fDp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.textY + this.textHeight + this.backgroundRectHeight;
        float fDp3 = (this.giftRectSize - AndroidUtilities.dp(4.0f)) / 2.0f;
        int i = 0;
        while (i < arrayList.size()) {
            BotButton botButton = arrayList.get(i);
            float pressScale = botButton.getPressScale();
            float fDp4 = ((AndroidUtilities.dp(f3) + fDp3) * i) + width2;
            float f5 = fDp4 + fDp3;
            this.rect.set(fDp4, fDp2, f5, botButton.height + fDp2);
            canvas2.save();
            if (pressScale != 1.0f) {
                canvas2.scale(pressScale, pressScale, this.rect.centerX(), this.rect.centerY());
            }
            Arrays.fill(this.botButtonRadii, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
            if ((botButton.positionFlags & 9) == 9) {
                float[] fArr = this.botButtonRadii;
                float fDp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[7] = fDp5;
                fArr[6] = fDp5;
            }
            if ((botButton.positionFlags & 10) == 10) {
                float[] fArr2 = this.botButtonRadii;
                float fDp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr2[5] = fDp6;
                fArr2[4] = fDp6;
            }
            this.botButtonPath.rewind();
            this.botButtonPath.addRoundRect(this.rect, this.botButtonRadii, Path.Direction.CW);
            canvas2.drawPath(this.botButtonPath, getThemedPaint("paintChatActionBackground"));
            if (hasGradientService()) {
                canvas2.drawPath(this.botButtonPath, Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            canvas2.save();
            canvas2.clipPath(this.botButtonPath);
            BaseCell.RippleDrawableSafe rippleDrawableSafe = botButton.selectorDrawable;
            if (rippleDrawableSafe != null) {
                int i2 = (int) fDp2;
                rippleDrawableSafe.setBounds((int) fDp4, i2, (int) f5, botButton.height + i2);
                botButton.selectorDrawable.setAlpha(255);
                botButton.selectorDrawable.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            int iDp = botButton.iconDrawable != null ? AndroidUtilities.dp(26.0f) : 0;
            float f6 = iDp;
            float fM = ImageReceiver$$ExternalSyntheticOutline0.m(fDp3 - (botButton.title.getWidth() + (botButton.iconDrawable != null ? AndroidUtilities.dp(4.0f) : 0)), f6, f2, fDp4);
            Drawable drawable = botButton.iconDrawable;
            if (drawable != null) {
                int i3 = (int) fM;
                f = 2.0f;
                drawable.setBounds(i3, (int) (((botButton.height - AndroidUtilities.dp(24.0f)) / f2) + fDp2), AndroidUtilities.dp(24.0f) + i3, AndroidUtilities.dp(24.0f) + ((int) (((botButton.height - AndroidUtilities.dp(24.0f)) / 2.0f) + fDp2)));
                botButton.iconDrawable.setAlpha(botButton.isLocked ? 128 : 255);
                botButton.iconDrawable.draw(canvas2);
                fM += f6;
            } else {
                f = 2.0f;
            }
            botButton.title.ellipsize(Math.max(1, (((int) fDp3) - AndroidUtilities.dp(15.0f)) - iDp));
            botButton.title.draw(canvas2, fM, (AndroidUtilities.dp(40.0f) / f) + fDp2, botButton.isLocked ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i++;
            f3 = 4.0f;
            f2 = 2.0f;
        }
    }

    @Override
    public boolean drawPinnedBottom() {
        return false;
    }

    @Override
    public boolean drawPinnedTop() {
        return false;
    }

    public void drawReactions(Canvas canvas, boolean z, Integer num) {
        if (this.canDrawInParent) {
            if (hasGradientService() && !z) {
                return;
            }
            if (!hasGradientService() && z) {
                return;
            }
        }
        drawReactionsLayout(canvas, z, num);
    }

    public void drawReactionsLayout(Canvas canvas, boolean z, Integer num) {
        float alpha = z ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.isSmall || (this.transitionParams.animateChange && reactionsLayoutInBubble.animateHeight)) {
            reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f;
            if (alpha < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
            TransitionParams transitionParams = this.transitionParams;
            reactionsLayoutInBubble2.draw(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f, num);
            if (alpha < 1.0f) {
                canvas.restore();
            }
        }
    }

    public void drawReactionsLayoutOverlay(Canvas canvas, boolean z) {
        float alpha = z ? getAlpha() : 1.0f;
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.isSmall || (this.transitionParams.animateChange && reactionsLayoutInBubble.animateHeight)) {
            reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f;
            if (alpha < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
            TransitionParams transitionParams = this.transitionParams;
            reactionsLayoutInBubble2.drawOverlay(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f);
            if (alpha < 1.0f) {
                canvas.restore();
            }
        }
    }

    public void drawScrimReaction(Canvas canvas, Integer num, float f, boolean z) {
        if (this.reactionsLayoutInBubble.isSmall) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        reactionsLayoutInBubble.scrimProgress = f;
        reactionsLayoutInBubble.scrimDirection = z;
        reactionsLayoutInBubble.draw(canvas, this.transitionParams.animateChangeProgress, num);
    }

    public void drawScrimReactionPreview(View view, Canvas canvas, int i, Integer num, float f) {
        if (this.reactionsLayoutInBubble.isSmall) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        reactionsLayoutInBubble.scrimProgress = f;
        reactionsLayoutInBubble.drawPreview(view, canvas, i, num);
    }

    public final ColorFilter getAdaptiveEmojiColorFilter(int i) {
        if (i != this.adaptiveEmojiColor || this.adaptiveEmojiColorFilter == null) {
            this.adaptiveEmojiColor = i;
            this.adaptiveEmojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        return this.adaptiveEmojiColorFilter;
    }

    @Override
    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (this.starGiftLayout.has()) {
            int width = ((int) (getWidth() - (this.starGiftLayout.animatorVisualWidth.factor + AndroidUtilities.dp(8.0f)))) / 2;
            return this.starGiftLayout.repost ? width : Math.min(this.backgroundLeft, width);
        }
        if (isButtonLayout(this.currentMessageObject)) {
            return RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(getWidth(), this.giftRectSize, 2, this.sideMenuWidth / 2);
        }
        int iMin = this.backgroundLeft;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            iMin = Math.min((int) this.imageReceiver.getImageX(), iMin);
        }
        return (this.sideMenuWidth / 2) + iMin;
    }

    @Override
    public int getBoundsRight() {
        int iMax;
        int width;
        if (this.starGiftLayout.has()) {
            int iDp = ((int) ((this.starGiftLayout.animatorVisualWidth.factor + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            return this.starGiftLayout.repost ? iDp : Math.max(this.backgroundRight, iDp);
        }
        if (isButtonLayout(this.currentMessageObject)) {
            iMax = this.sideMenuWidth / 2;
            width = (getWidth() + this.giftRectSize) / 2;
        } else {
            iMax = this.backgroundRight;
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                iMax = Math.max((int) this.imageReceiver.getImageX2(), iMax);
            }
            width = this.sideMenuWidth / 2;
        }
        return width + iMax;
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    @Override
    public MessageObject.GroupedMessagePosition getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.customDate;
    }

    public ChatActionCellDelegate getDelegate() {
        return this.delegate;
    }

    @Override
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public final int getImageSize(MessageObject messageObject) {
        int i;
        int iDp = this.stickerSize;
        int i2 = messageObject.type;
        if (i2 == 37) {
            iDp = AndroidUtilities.dp(52.0f);
        } else if (i2 == 21 || isNewStyleButtonLayout()) {
            iDp = AndroidUtilities.dp(78.0f);
        }
        if (isMessageActionSuggestedPostApproval() || (i = messageObject.type) == 34 || i == 35) {
            return 0;
        }
        return iDp;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override
    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    public ImageReceiver getPhotoImage() {
        return this.imageReceiver;
    }

    public ReactionsLayoutInBubble.ReactionButton getReactionButton(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        return this.reactionsLayoutInBubble.getReactionButton(visibleReaction);
    }

    public ReactionsLayoutInBubble getReactionsLayout() {
        return this.reactionsLayoutInBubble;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public TransitionParams getTransitionParams() {
        return this.transitionParams;
    }

    public final float getUploadingInfoProgress(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject == null) {
            return 1.0f;
        }
        try {
            if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.currentAccount)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                return messagesController.uploadingWallpaperInfo.uploadingProgress;
            }
            return 1.0f;
        } catch (Exception e) {
            FileLog.e(e);
            return 1.0f;
        }
    }

    public boolean hasButton() {
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || !isButtonLayout(messageObject) || this.giftPremiumButtonLayout == null) ? false : true;
    }

    public boolean hasGradientService() {
        if (this.overrideBackgroundPaint != null) {
            return false;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            return resourcesProvider.hasGradientService();
        }
        return Theme.hasGradientService();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        View view = this.invalidateWithParent;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.invalidateListener;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.invalidatesParent || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    public void invalidateOutbounds() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null && chatActionCellDelegate.canDrawOutboundsContent()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean isButtonLayout(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        int i = messageObject.type;
        return i == 30 || i == 18 || i == 25 || isNewStyleButtonLayout();
    }

    public boolean isCellAttachedToWindow() {
        return this.attachedToWindow;
    }

    public boolean isFloating() {
        return false;
    }

    public final boolean isMessageActionSuggestedPostApproval() {
        TLRPC.Message message;
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean isNewStyleButtonLayout() {
        MessageObject messageObject;
        int i;
        if (this.starGiftLayout.has() || this.birthdayLayout != null || (i = (messageObject = this.currentMessageObject).type) == 31 || i == 37 || i == 33 || i == 35 || i == 34 || i == 21 || i == 22 || messageObject.isStoryMention()) {
            return true;
        }
        TLRPC.Message message = this.currentMessageObject.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return false;
        }
        TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
        return tL_messageActionSuggestedPostApproval.balance_too_low || tL_messageActionSuggestedPostApproval.rejected;
    }

    public final void lambda$didPressCustomBotButton$10(TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest) {
        MessagesController.getInstance(this.currentAccount).toggleChatNoForwards(this.currentMessageObject.getDialogId(), this.currentMessageObject.getId(), tL_messageActionNoForwardsRequest.new_value, null);
    }

    public final void lambda$didPressCustomBotButton$7(BaseFragment baseFragment, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(14, baseFragment, tL_error));
        }
    }

    public final void lambda$didPressCustomBotButton$8(BaseFragment baseFragment) {
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = getMessageObject().getId();
        tL_resolveStarGiftOffer.decline = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_resolveStarGiftOffer, new BotBiometry$$ExternalSyntheticLambda10(1, this, baseFragment));
    }

    public final void lambda$didPressCustomBotButton$9(TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest) {
        MessagesController.getInstance(this.currentAccount).toggleChatNoForwards(this.currentMessageObject.getDialogId(), this.currentMessageObject.getId(), tL_messageActionNoForwardsRequest.prev_value, null);
    }

    public final void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        RLottieDrawable lottieAnimation;
        ChatActionCellDelegate chatActionCellDelegate;
        if (!z || (lottieAnimation = this.imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.playedGiftAnimation) {
            if (lottieAnimation.getCurrentFrame() < 1) {
                lottieAnimation.stop();
                lottieAnimation.setCurrentFrame(lottieAnimation.getFramesCount() - 1, false);
                return;
            }
            return;
        }
        messageObject.playedGiftAnimation = true;
        lottieAnimation.setCurrentFrame(0, false);
        AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda16(lottieAnimation, 0));
        if (messageObject.wasUnread || this.forceWasUnread) {
            messageObject.wasUnread = false;
            this.forceWasUnread = false;
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (getContext() instanceof LaunchActivity) {
                ((LaunchActivity) getContext()).getFireworksOverlay().start();
            }
            TLRPC.VideoSize videoSize = this.giftEffectAnimation;
            if (videoSize == null || (chatActionCellDelegate = this.delegate) == null) {
                return;
            }
            chatActionCellDelegate.needShowEffectOverlay(this, this.giftSticker, videoSize);
        }
    }

    public final void lambda$onTouchEvent$2() {
        this.isSpoilerRevealing = false;
        getMessageObject().isSpoilersRevealed = true;
        ArrayList arrayList = this.giftPremiumText.spoilers;
        if (arrayList != null) {
            arrayList.clear();
        }
        invalidate();
    }

    public final void lambda$onTouchEvent$3() {
        post(new ChatActionCell$$ExternalSyntheticLambda3(this, 3));
    }

    public final void lambda$openPremiumGiftChannel$4(TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode) {
        this.delegate.didOpenPremiumGiftChannel(this, tL_messageActionGiftCode.slug, false);
    }

    public final void lambda$openPremiumGiftPreview$5(TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        this.delegate.didOpenPremiumGift(this, tL_premiumGiftOption, str, false);
    }

    public final void lambda$setMessageObject$1() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            chatActionCellDelegate.onTopicClick(this);
        }
    }

    public void markReactionsAsRead() {
        this.reactionsLayoutInBubble.hasUnreadReactions = false;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.markReactionsAsRead();
    }

    public int measuredWidth() {
        return getMeasuredWidth();
    }

    @Override
    public void onAttachedToWindow() {
        ChatActionCellDelegate chatActionCellDelegate;
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.imageReceiver.onAttachedToWindow();
        int i = 0;
        setStarsPaused(false);
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            textLayout.emoji = AnimatedEmojiSpan.update(0, (View) ChatActionCell.this, false, textLayout.emoji, textLayout.layout);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 21) {
            setMessageObject(messageObject, true);
        }
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.starGiftLayout;
        starGiftUniqueActionLayout.attached = true;
        if (starGiftUniqueActionLayout.action != null) {
            starGiftUniqueActionLayout.imageReceiver.onAttachedToWindow();
            starGiftUniqueActionLayout.emoji.attach();
            starGiftUniqueActionLayout.messageDrawable.avatarReceiver.onAttachedToWindow();
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        reactionsLayoutInBubble.attached = true;
        while (true) {
            ArrayList arrayList = reactionsLayoutInBubble.reactionButtons;
            if (i >= arrayList.size()) {
                break;
            }
            ((ReactionsLayoutInBubble.ReactionButton) arrayList.get(i)).attach();
            i++;
        }
        TopicSeparator topicSeparator = this.topicSeparator;
        if (topicSeparator != null) {
            topicSeparator.attach();
        }
        SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
        if (suggestBirthdayActionLayout != null) {
            suggestBirthdayActionLayout.attach();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        this.imageReceiver.onDetachedFromWindow();
        setStarsPaused(true);
        this.wasLayout = false;
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack);
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            AnimatedEmojiSpan.release(ChatActionCell.this, textLayout.emoji);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.avatarStoryParams.onDetachFromWindow();
        this.transitionParams.wasDraw = false;
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.starGiftLayout;
        starGiftUniqueActionLayout.attached = false;
        starGiftUniqueActionLayout.imageReceiver.onDetachedFromWindow();
        starGiftUniqueActionLayout.emoji.detach();
        GiftMessageDrawable giftMessageDrawable = starGiftUniqueActionLayout.messageDrawable;
        giftMessageDrawable.avatarReceiver.onDetachedFromWindow();
        AnimatedEmojiSpan.release((View) null, giftMessageDrawable.emojiGroupedSpans);
        giftMessageDrawable.emojiGroupedSpans = null;
        this.reactionsLayoutInBubble.onDetachFromWindow();
        TopicSeparator topicSeparator = this.topicSeparator;
        if (topicSeparator != null) {
            topicSeparator.detach();
        }
        SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
        if (suggestBirthdayActionLayout != null) {
            suggestBirthdayActionLayout.detach();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        ChatActionCell chatActionCell;
        float fDp;
        float fDp2;
        int i3;
        int i4;
        float fDp3;
        float fDp4;
        float fDp5;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        TextLayout textLayout;
        float height;
        float f9;
        Text text;
        TextLayout textLayout2;
        StaticLayout staticLayout;
        Theme.ResourcesProvider resourcesProvider;
        boolean z;
        float f10;
        float fClamp;
        LoadingDrawable loadingDrawable;
        Paint themedPaint;
        Paint themedPaint2;
        float fDp6;
        float fDp7;
        Theme.ResourcesProvider resourcesProvider2;
        Theme.ResourcesProvider resourcesProvider3;
        boolean zIsCurrentThemeDark;
        ColorMatrix colorMatrix;
        float f11;
        float f12;
        Theme.ResourcesProvider resourcesProvider4;
        boolean zIsCurrentThemeDark2;
        int i5;
        int i6;
        float uploadingInfoProgress;
        TextLayout textLayout3;
        int i7;
        float transitionProgress;
        int color;
        int i8;
        SpannableStringBuilder spannableStringBuilder;
        int iIndexOf;
        int i9;
        TextLayout textLayout4;
        int i10;
        Text text2;
        int i11;
        float height2;
        float f13;
        ChatActionCellDelegate chatActionCellDelegate;
        StaticLayout staticLayout2;
        ColorFilter adaptiveEmojiColorFilter;
        TextPaint textPaint;
        TextPaint textPaint2;
        TextPaint textPaint3;
        TextPaint textPaint4;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        MessageObject messageObject = this.currentMessageObject;
        float f14 = this.giftPremiumTextExpandedAnimated.set(!this.giftPremiumTextCollapsed);
        int imageSize = this.stickerSize;
        if (!this.starGiftLayout.has() && this.birthdayLayout == null && isButtonLayout(messageObject)) {
            this.stickerSize = this.giftRectSize - AndroidUtilities.dp(106.0f);
            if (isNewStyleButtonLayout()) {
                imageSize = getImageSize(messageObject);
                f = 1.0f;
                int iDp = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                float fDp8 = (this.previousWidth - imageSize) / 2.0f;
                float fDp9 = iDp;
                if (messageObject.isStoryMention()) {
                    f2 = 16.0f;
                    this.avatarStoryParams.storyItem = messageObject.messageOwner.media.storyItem;
                } else {
                    f2 = 16.0f;
                }
                float f15 = imageSize;
                this.avatarStoryParams.originalAvatarRect.set(fDp8, fDp9, fDp8 + f15, f15 + fDp9);
                int i12 = messageObject.type;
                if (i12 == 31 || i12 == 33 || i12 == 34 || i12 == 35) {
                    fDp8 += AndroidUtilities.dp(10.0f);
                    fDp9 += AndroidUtilities.dp(10.0f);
                    imageSize -= AndroidUtilities.dp(20.0f);
                }
                if (messageObject.type == 37) {
                    fDp8 += AndroidUtilities.dp(2.0f);
                }
                this.imageReceiver.setImageCoords(fDp8, fDp9, Math.max(0, imageSize), Math.max(0, imageSize));
                int i13 = messageObject.type;
                if (i13 == 31 || i13 == 33 || i13 == 34 || i13 == 35) {
                    imageSize += AndroidUtilities.dp(20.0f);
                }
            } else {
                f = 1.0f;
                f2 = 16.0f;
                int i14 = messageObject.type;
                if (i14 == 11) {
                    ImageReceiver imageReceiver = this.imageReceiver;
                    int i15 = this.previousWidth;
                    int i16 = this.stickerSize;
                    float f16 = i16;
                    imageReceiver.setImageCoords((i15 - i16) / 2.0f, (this.giftRectSize * 0.075f) + this.textY + this.textHeight, f16, f16);
                } else if (i14 == 25) {
                    imageSize = (int) (this.stickerSize * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                    float f17 = imageSize;
                    this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.giftRectSize * 0.075f) + (this.textY + this.textHeight)) - AndroidUtilities.dp(22.0f), f17, f17);
                } else if (messageObject.isStarGiftAction()) {
                    float f18 = imageSize;
                    this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, (this.giftRectSize * 0.075f) + this.textY + this.textHeight + AndroidUtilities.dp(2.0f), f18, f18);
                } else if (messageObject.type == 30) {
                    imageSize = (int) (this.stickerSize * 1.1f);
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        float f19 = imageSize;
                        this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.giftRectSize * 0.075f) + (this.textY + this.textHeight)) - AndroidUtilities.dp(12.0f), f19, f19);
                    } else {
                        float f20 = imageSize;
                        this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.giftRectSize * 0.075f) + (this.textY + this.textHeight)) - AndroidUtilities.dp(22.0f), f20, f20);
                    }
                } else {
                    imageSize = (int) (this.stickerSize * 1.0f);
                    float f21 = imageSize;
                    this.imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.giftRectSize * 0.075f) + (this.textY + this.textHeight)) - AndroidUtilities.dp(4.0f), f21, f21);
                }
                textPaint = (TextPaint) getThemedPaint("paintChatActionText");
                this.textPaint = textPaint;
                if (textPaint != null) {
                    textPaint2 = this.giftTitlePaint;
                    if (textPaint2 != null && textPaint2.getColor() != this.textPaint.getColor()) {
                        this.giftTitlePaint.setColor(this.textPaint.getColor());
                    }
                    textPaint3 = this.giftSubtitlePaint;
                    if (textPaint3 != null && textPaint3.getColor() != this.textPaint.getColor()) {
                        this.giftSubtitlePaint.setColor(this.textPaint.getColor());
                        this.giftSubtitlePaint.linkColor = this.textPaint.getColor();
                    }
                    textPaint4 = this.giftTextPaint;
                    if (textPaint4 != null && textPaint4.getColor() != this.textPaint.getColor()) {
                        this.giftTextPaint.setColor(this.textPaint.getColor());
                        this.giftTextPaint.linkColor = this.textPaint.getColor();
                    }
                }
            }
            textPaint = (TextPaint) getThemedPaint("paintChatActionText");
            this.textPaint = textPaint;
            if (textPaint != null) {
                textPaint2 = this.giftTitlePaint;
                if (textPaint2 != null) {
                    this.giftTitlePaint.setColor(this.textPaint.getColor());
                }
                textPaint3 = this.giftSubtitlePaint;
                if (textPaint3 != null) {
                    this.giftSubtitlePaint.setColor(this.textPaint.getColor());
                    this.giftSubtitlePaint.linkColor = this.textPaint.getColor();
                }
                textPaint4 = this.giftTextPaint;
                if (textPaint4 != null) {
                    this.giftTextPaint.setColor(this.textPaint.getColor());
                    this.giftTextPaint.linkColor = this.textPaint.getColor();
                }
            }
        } else {
            f = 1.0f;
            f2 = 16.0f;
        }
        int i17 = imageSize;
        drawBackground(canvas2, false);
        if (this.starGiftLayout.has()) {
            canvas2.save();
            float width = (getWidth() - this.starGiftLayout.getWidth()) / 2.0f;
            this.starGiftLayoutX = width;
            float fDp10 = this.starGiftLayout.repost ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(f2) + this.textY + this.textHeight;
            this.starGiftLayoutY = fDp10;
            canvas2.translate(width, fDp10);
            this.starGiftLayout.draw(canvas2);
            ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
            if (chatActionCellDelegate2 == null || chatActionCellDelegate2.canDrawOutboundsContent()) {
                this.starGiftLayout.drawOutbounds(canvas2);
            }
            canvas2.restore();
        } else {
            if (this.birthdayLayout == null) {
                if (isButtonLayout(messageObject) || (messageObject != null && messageObject.type == 11)) {
                    GiftSheet.CardBackground cardBackground = this.cardBackground;
                    if (cardBackground == null || !((i = messageObject.type) == 31 || i == 37 || i == 33)) {
                        f3 = 14.0f;
                    } else {
                        f3 = 14.0f;
                        cardBackground.setBounds((int) (this.imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (this.imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (this.imageReceiver.getImageWidth() + this.imageReceiver.getImageX() + AndroidUtilities.dp(13.33f)), (int) (this.imageReceiver.getImageHeight() + this.imageReceiver.getImageY() + AndroidUtilities.dp(14.0f)));
                        this.cardBackground.draw(canvas2);
                    }
                    if (this.wallpaperPreviewDrawable != null) {
                        canvas2.save();
                        canvas2.translate(this.imageReceiver.getImageX(), this.imageReceiver.getImageY());
                        Path path = this.clipPath;
                        if (path == null) {
                            this.clipPath = new Path();
                        } else {
                            path.rewind();
                        }
                        this.clipPath.addCircle(this.imageReceiver.getImageWidth() / 2.0f, this.imageReceiver.getImageHeight() / 2.0f, this.imageReceiver.getImageWidth() / 2.0f, Path.Direction.CW);
                        canvas2.clipPath(this.clipPath);
                        this.wallpaperPreviewDrawable.setBounds(0, 0, (int) this.imageReceiver.getImageWidth(), (int) this.imageReceiver.getImageHeight());
                        this.wallpaperPreviewDrawable.draw(canvas2);
                        canvas2.restore();
                    } else if (messageObject.isStoryMention()) {
                        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                        long j = messageMedia.user_id;
                        StoriesUtilities.AvatarStoryParams avatarStoryParams = this.avatarStoryParams;
                        avatarStoryParams.storyId = messageMedia.id;
                        StoriesUtilities.drawAvatarWithStory(j, canvas2, this.imageReceiver, avatarStoryParams);
                    } else {
                        this.imageReceiver.draw(canvas2);
                    }
                    if (messageObject.type == 37) {
                        DrawableUtils.drawCommunityCardDrawable(canvas2, Theme.dialogs_communityCardsDrawable, this.imageReceiver.getImageX() + AndroidUtilities.dp(26.0f), this.imageReceiver.getImageY() + AndroidUtilities.dp(26.0f), AndroidUtilities.dp(52.0f));
                    }
                    this.radialProgress.setProgressRect(this.imageReceiver.getImageX(), this.imageReceiver.getImageY(), this.imageReceiver.getImageWidth() + this.imageReceiver.getImageX(), this.imageReceiver.getImageHeight() + this.imageReceiver.getImageY());
                    int i18 = messageObject.type;
                    if (i18 == 21) {
                        ImageUpdater imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id);
                        if (imageUpdater != null) {
                            this.radialProgress.setProgress(imageUpdater.getCurrentImageProgress(), true);
                            this.radialProgress.setCircleRadius(((int) (this.imageReceiver.getImageWidth() * 0.5f)) + 1);
                            this.radialProgress.setMaxIconSize(AndroidUtilities.dp(24.0f));
                            this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
                            if (imageUpdater.getCurrentImageProgress() == f) {
                                this.radialProgress.setIcon(4, true, true);
                            } else {
                                this.radialProgress.setIcon(3, true, true);
                            }
                        }
                        this.radialProgress.draw(canvas2);
                    } else if (i18 == 22) {
                        float uploadingInfoProgress2 = getUploadingInfoProgress(messageObject);
                        this.radialProgress.setProgress(uploadingInfoProgress2, true);
                        this.radialProgress.setCircleRadius(AndroidUtilities.dp(26.0f));
                        this.radialProgress.setMaxIconSize(AndroidUtilities.dp(24.0f));
                        this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
                        if (uploadingInfoProgress2 == f) {
                            this.radialProgress.setIcon(4, true, true);
                        } else {
                            this.radialProgress.setIcon(3, true, true);
                        }
                        this.radialProgress.draw(canvas2);
                    }
                }
                if (this.textPaint != null || this.textLayout == null) {
                    i2 = 22;
                } else {
                    canvas2.save();
                    canvas2.translate(this.textXLeft, this.textY);
                    if (this.textLayout.getPaint() != this.textPaint) {
                        buildLayout$1();
                    }
                    canvas2.save();
                    SpoilerEffect.clipOutCanvas(canvas2, this.spoilers);
                    SpoilerEffect.layoutDrawMaybe(canvas2, this.textLayout);
                    ChatActionCellDelegate chatActionCellDelegate3 = this.delegate;
                    if (chatActionCellDelegate3 == null || chatActionCellDelegate3.canDrawOutboundsContent()) {
                        StaticLayout staticLayout3 = this.textLayout;
                        i2 = 22;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, staticLayout3, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout3 == null ? null : getAdaptiveEmojiColorFilter(staticLayout3.getPaint().getColor()));
                    } else {
                        i2 = 22;
                    }
                    canvas2.restore();
                    for (SpoilerEffect spoilerEffect : this.spoilers) {
                        spoilerEffect.setColor(this.textLayout.getPaint().getColor());
                        spoilerEffect.draw(canvas2);
                    }
                    canvas2.restore();
                }
                if (this.textPaint != null && this.titleLayout != null) {
                    canvas2.save();
                    canvas2.translate(this.titleXLeft, this.textY - this.titleHeight);
                    if (this.titleLayout.getPaint() != this.textPaint) {
                        buildLayout$1();
                    }
                    canvas2.save();
                    SpoilerEffect.clipOutCanvas(canvas2, this.spoilers);
                    SpoilerEffect.layoutDrawMaybe(canvas2, this.titleLayout);
                    chatActionCellDelegate = this.delegate;
                    if (chatActionCellDelegate != null || chatActionCellDelegate.canDrawOutboundsContent()) {
                        StaticLayout staticLayout4 = this.titleLayout;
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.animatedEmojiStack;
                        List<SpoilerEffect> list = this.spoilers;
                        staticLayout2 = this.textLayout;
                        if (staticLayout2 == null) {
                            adaptiveEmojiColorFilter = null;
                        } else {
                            adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor());
                        }
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, staticLayout4, emojiGroupedSpans, 0.0f, list, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
                    }
                    canvas2.restore();
                    for (SpoilerEffect spoilerEffect2 : this.spoilers) {
                        spoilerEffect2.setColor(this.titleLayout.getPaint().getColor());
                        spoilerEffect2.draw(canvas2);
                    }
                    canvas2.restore();
                }
                if (this.starGiftLayout.has() && isButtonLayout(messageObject)) {
                    canvas2.save();
                    float fDp11 = (this.previousWidth - this.giftRectSize) / 2.0f;
                    if (messageObject.type != i2) {
                        fDp11 += AndroidUtilities.dp(8.0f);
                    }
                    float f22 = fDp11;
                    if (isNewStyleButtonLayout()) {
                        RectF rectF = this.backgroundRect;
                        fDp = rectF != null ? rectF.top : AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                        fDp2 = i17 > 0 ? RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(16.0f, 2, i17) : AndroidUtilities.dp(16.0f);
                    } else {
                        float f23 = (this.giftRectSize * 0.075f) + this.textY + this.textHeight;
                        if (messageObject.type != 21) {
                            i17 = this.stickerSize;
                        }
                        float fDp12 = f23 + i17 + AndroidUtilities.dp(4.0f);
                        if (messageObject.type == 21) {
                            fDp12 += AndroidUtilities.dp(16.0f);
                        }
                        fDp = fDp12;
                        if (messageObject.isStarGiftAction()) {
                            fDp2 = AndroidUtilities.dp(12.0f);
                        } else if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                            fDp -= AndroidUtilities.dp(3.66f);
                        }
                        i3 = messageObject.type;
                        if (i3 != 31 || i3 == 37) {
                            i4 = 33;
                        } else {
                            i4 = 33;
                            if (i3 == 33) {
                            }
                            canvas2.translate(f22, fDp);
                            if (this.giftPremiumTitleLayout != null) {
                                canvas2.save();
                                canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(16.0f)) - this.giftPremiumTitleLayout.getWidth()) / 2.0f, 0.0f);
                                this.giftPremiumTitleLayout.draw(canvas2);
                                canvas2.restore();
                                height2 = this.giftPremiumTitleLayout.getHeight() + fDp;
                                if (this.giftPremiumSubtitleLayout != null) {
                                    canvas2.save();
                                    canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(16.0f)) - this.giftPremiumSubtitleLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + this.giftPremiumTitleLayout.getHeight());
                                    this.giftPremiumSubtitleLayout.draw(canvas2);
                                    canvas2.restore();
                                    height2 += AndroidUtilities.dp(10.0f) + this.giftPremiumSubtitleLayout.getHeight();
                                }
                                if (messageObject.type == 25) {
                                    f13 = 6.0f;
                                } else {
                                    f13 = 0.0f;
                                }
                                fDp3 = height2 + AndroidUtilities.dp(f13);
                            } else {
                                fDp3 = fDp - AndroidUtilities.dp(4.0f);
                            }
                            fDp4 = fDp3;
                            canvas2.restore();
                            if (this.giftPremiumTitleLayout != null && (text2 = this.giftPremiumReleasedText) != null) {
                                float width2 = text2.getWidth() + AndroidUtilities.dp(12.0f);
                                float fM = ImageReceiver$$ExternalSyntheticOutline0.m(this.giftRectSize - AndroidUtilities.dp(16.0f), width2, 2.0f, f22);
                                float height3 = fDp + this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(f3);
                                if (this.giftReleasedBackgroundPaint == null) {
                                    this.giftReleasedBackgroundPaint = new Paint(1);
                                }
                                Paint paint = this.giftReleasedBackgroundPaint;
                                if (Theme.isCurrentThemeDark()) {
                                    i11 = 285212671;
                                } else {
                                    i11 = 268435456;
                                }
                                paint.setColor(i11);
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                rectF2.set(fM, height3 - AndroidUtilities.dp(8.0f), width2 + fM, AndroidUtilities.dp(8.0f) + height3);
                                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.giftReleasedBackgroundPaint);
                                this.giftPremiumReleasedText.draw(canvas, AndroidUtilities.dp(6.0f) + fM, height3, -855638017, 1.0f);
                                canvas2 = canvas;
                                fDp4 += AndroidUtilities.dp(24.0f);
                            }
                            fDp5 = fDp4 + AndroidUtilities.dp(4.0f);
                            if (messageObject.type == 18) {
                                fDp5 += AndroidUtilities.dp(2.0f);
                            }
                            f4 = fDp5;
                            canvas2.save();
                            canvas2.translate(f22, f4);
                            if (messageObject.type == i2) {
                                f8 = 1.0f;
                                if (this.radialProgress.getTransitionProgress() == 1.0f) {
                                    i6 = 4;
                                    if (this.radialProgress.getIcon() == 4) {
                                        if (this.giftPremiumText != null) {
                                            canvas2.save();
                                            canvas2.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                            TextLayout textLayout5 = this.giftPremiumText;
                                            textLayout5.x = ((this.giftRectSize - textLayout5.layout.getWidth()) / 2.0f) + f22;
                                            this.giftPremiumText.y = f4;
                                            int color2 = this.giftTextPaint.getColor();
                                            TextLayout textLayout6 = this.giftPremiumText;
                                            f5 = f22;
                                            f6 = 0.0f;
                                            f7 = 8.0f;
                                            SpoilerEffect.renderWithRipple(this, false, color2, 0, textLayout6.patchedLayout, 1, textLayout6.layout, textLayout6.spoilers, canvas, false);
                                            TextLayout textLayout7 = this.giftPremiumText;
                                            chatActionCell = this;
                                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout7.layout, textLayout7.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                            canvas2 = canvas;
                                            canvas2.restore();
                                        } else {
                                            f5 = f22;
                                            f6 = 0.0f;
                                            f7 = 8.0f;
                                            chatActionCell = this;
                                        }
                                    }
                                } else {
                                    i6 = 4;
                                }
                                chatActionCell = this;
                                f5 = f22;
                                f6 = 0.0f;
                                f7 = 8.0f;
                                if (chatActionCell.settingWallpaperLayout == null) {
                                    TextPaint textPaint5 = new TextPaint();
                                    chatActionCell.settingWallpaperPaint = textPaint5;
                                    textPaint5.setTextSize(AndroidUtilities.dp(13.0f));
                                    spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                                    iIndexOf = spannableStringBuilder.toString().indexOf("...");
                                    if (iIndexOf < 0) {
                                        iIndexOf = spannableStringBuilder.toString().indexOf("…");
                                        i9 = 1;
                                    } else {
                                        i9 = 3;
                                    }
                                    if (iIndexOf >= 0) {
                                        SpannableString spannableString = new SpannableString("…");
                                        UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                                        uploadingDotsSpannable.fixTop = true;
                                        uploadingDotsSpannable.setParent(chatActionCell);
                                        spannableString.setSpan(uploadingDotsSpannable, 0, spannableString.length(), i4);
                                        spannableStringBuilder.replace(iIndexOf, iIndexOf + i9, (CharSequence) spannableString);
                                    }
                                    TextPaint textPaint6 = chatActionCell.settingWallpaperPaint;
                                    textLayout4 = chatActionCell.giftPremiumText;
                                    if (textLayout4 == null) {
                                        i10 = 1;
                                    } else {
                                        i10 = textLayout4.width;
                                    }
                                    chatActionCell.settingWallpaperLayout = new StaticLayout(spannableStringBuilder, textPaint6, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                }
                                uploadingInfoProgress = chatActionCell.getUploadingInfoProgress(messageObject);
                                if (chatActionCell.settingWallpaperProgressTextLayout != null || chatActionCell.settingWallpaperProgress != uploadingInfoProgress) {
                                    chatActionCell.settingWallpaperProgress = uploadingInfoProgress;
                                    String strM = Fragment$$ExternalSyntheticOutline0.m((int) (uploadingInfoProgress * 100.0f), "%", new StringBuilder());
                                    TextPaint textPaint7 = chatActionCell.giftTextPaint;
                                    textLayout3 = chatActionCell.giftPremiumText;
                                    if (textLayout3 == null) {
                                        i7 = 1;
                                    } else {
                                        i7 = textLayout3.width;
                                    }
                                    chatActionCell.settingWallpaperProgressTextLayout = new StaticLayout(strM, textPaint7, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                }
                                chatActionCell.settingWallpaperPaint.setColor(chatActionCell.giftTextPaint.getColor());
                                if (chatActionCell.radialProgress.getIcon() == i6) {
                                    transitionProgress = chatActionCell.radialProgress.getTransitionProgress();
                                    color = chatActionCell.giftTextPaint.getColor();
                                    float f24 = 1.0f - transitionProgress;
                                    chatActionCell.settingWallpaperPaint.setAlpha((int) (Color.alpha(color) * f24));
                                    chatActionCell.giftTextPaint.setAlpha((int) (Color.alpha(color) * transitionProgress));
                                    TextPaint textPaint8 = chatActionCell.giftTextPaint;
                                    textPaint8.linkColor = textPaint8.getColor();
                                    if (chatActionCell.giftPremiumText != null) {
                                        float f25 = (transitionProgress * 0.2f) + 0.8f;
                                        canvas2.save();
                                        canvas2.scale(f25, f25, chatActionCell.giftRectSize / 2.0f, chatActionCell.giftPremiumText.layout.getHeight() / 2.0f);
                                        canvas2.translate((chatActionCell.giftRectSize - chatActionCell.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                        TextLayout textLayout8 = chatActionCell.giftPremiumText;
                                        textLayout8.x = ((chatActionCell.giftRectSize - textLayout8.layout.getWidth()) / 2.0f) + f5;
                                        chatActionCell.giftPremiumText.y = f4;
                                        int color3 = chatActionCell.giftTextPaint.getColor();
                                        TextLayout textLayout9 = chatActionCell.giftPremiumText;
                                        i8 = color;
                                        SpoilerEffect.renderWithRipple(chatActionCell, false, color3, 0, textLayout9.patchedLayout, 1, textLayout9.layout, textLayout9.spoilers, canvas, false);
                                        TextLayout textLayout10 = chatActionCell.giftPremiumText;
                                        StaticLayout staticLayout5 = textLayout10.layout;
                                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = textLayout10.emoji;
                                        ColorFilter adaptiveEmojiColorFilter2 = chatActionCell.getAdaptiveEmojiColorFilter(chatActionCell.giftTextPaint.getColor());
                                        chatActionCell = chatActionCell;
                                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout5, emojiGroupedSpans2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter2);
                                        canvas2 = canvas;
                                        canvas2.restore();
                                    } else {
                                        i8 = color;
                                    }
                                    chatActionCell.giftTextPaint.setAlpha((int) (Color.alpha(i8) * f24));
                                    TextPaint textPaint9 = chatActionCell.giftTextPaint;
                                    textPaint9.linkColor = textPaint9.getColor();
                                    float f26 = (f24 * 0.2f) + 0.8f;
                                    canvas2.save();
                                    canvas2.scale(f26, f26, chatActionCell.giftRectSize / 2.0f, chatActionCell.settingWallpaperLayout.getHeight() / 2.0f);
                                    canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                                    SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell.settingWallpaperLayout);
                                    canvas2.restore();
                                    canvas2.save();
                                    canvas2.translate(0.0f, AndroidUtilities.dp(4.0f) + chatActionCell.settingWallpaperLayout.getHeight());
                                    canvas2.scale(f26, f26, chatActionCell.giftRectSize / 2.0f, chatActionCell.settingWallpaperProgressTextLayout.getHeight() / 2.0f);
                                    canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, 0.0f);
                                    SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell.settingWallpaperProgressTextLayout);
                                    canvas2.restore();
                                    int i19 = i8;
                                    chatActionCell.giftTextPaint.setColor(i19);
                                    chatActionCell.giftTextPaint.linkColor = i19;
                                } else {
                                    canvas2.save();
                                    canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                                    chatActionCell.settingWallpaperLayout.draw(canvas2);
                                    canvas2.restore();
                                    canvas2.save();
                                    canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + chatActionCell.settingWallpaperLayout.getHeight());
                                    SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell.settingWallpaperProgressTextLayout);
                                    canvas2.restore();
                                }
                            } else {
                                chatActionCell = this;
                                f5 = f22;
                                f6 = 0.0f;
                                f7 = 8.0f;
                                f8 = 1.0f;
                                textLayout = chatActionCell.giftPremiumText;
                                if (textLayout != null) {
                                    height = textLayout.layout.getHeight();
                                    if (f14 < 1.0f) {
                                        height = AndroidUtilities.lerp(chatActionCell.giftPremiumTextCollapsedHeight, height, f14);
                                        RectF rectF3 = AndroidUtilities.rectTmp;
                                        rectF3.set(0.0f, -AndroidUtilities.dp(20.0f), chatActionCell.getWidth(), height);
                                        canvas2.saveLayerAlpha(rectF3, 255, 31);
                                    } else {
                                        canvas2.save();
                                    }
                                    canvas2.translate(((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                    chatActionCell.giftPremiumText.x = (((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumText.layout.getWidth()) / 2.0f) + f5;
                                    TextLayout textLayout11 = chatActionCell.giftPremiumText;
                                    textLayout11.y = f4;
                                    int color4 = textLayout11.paint.getColor();
                                    TextLayout textLayout12 = chatActionCell.giftPremiumText;
                                    f9 = height;
                                    SpoilerEffect.renderWithRipple(chatActionCell, false, color4, 0, textLayout12.patchedLayout, 1, textLayout12.layout, textLayout12.spoilers, canvas, false);
                                    TextLayout textLayout13 = chatActionCell.giftPremiumText;
                                    StaticLayout staticLayout6 = textLayout13.layout;
                                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans3 = textLayout13.emoji;
                                    ColorFilter adaptiveEmojiColorFilter3 = chatActionCell.getAdaptiveEmojiColorFilter(chatActionCell.giftTextPaint.getColor());
                                    chatActionCell = chatActionCell;
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, emojiGroupedSpans3, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter3);
                                    canvas2 = canvas;
                                    if (f14 < 1.0f && chatActionCell.giftPremiumTextMore != null) {
                                        canvas2.save();
                                        if (chatActionCell.giftPremiumTextClip == null) {
                                            chatActionCell.giftPremiumTextClip = new GradientClip();
                                        }
                                        canvas2.translate((-((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumText.layout.getWidth())) / 2.0f, 0.0f);
                                        RectF rectF4 = AndroidUtilities.rectTmp;
                                        rectF4.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + chatActionCell.giftPremiumTextMoreX, chatActionCell.giftPremiumTextMoreY);
                                        float f27 = 1.0f - f14;
                                        chatActionCell.giftPremiumTextClip.clipOut(canvas2, rectF4, f27);
                                        rectF4.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(16.0f), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), chatActionCell.giftPremiumTextMoreY);
                                        chatActionCell.giftPremiumTextClip.draw(canvas2, rectF4, 2, f27);
                                        rectF4.set(0.0f, f9 - AndroidUtilities.dp(12.0f), chatActionCell.getWidth(), f9);
                                        chatActionCell.giftPremiumTextClip.draw(canvas2, rectF4, 3, (1.0f - f27) * f27 * 4.0f);
                                        canvas2.restore();
                                    }
                                    canvas2.restore();
                                    if (f14 < 1.0f && (text = chatActionCell.giftPremiumTextMore) != null) {
                                        text.draw(canvas2, (chatActionCell.giftPremiumTextMoreX - text.getCurrentWidth()) + AndroidUtilities.dp(5.0f), (chatActionCell.giftPremiumTextMoreY - (chatActionCell.giftPremiumTextMoreH / 2.0f)) - AndroidUtilities.dp(1.0f), chatActionCell.giftPremiumText.paint.getColor(), 1.0f - f14);
                                    }
                                }
                            }
                            canvas2.restore();
                            if (chatActionCell.giftPremiumTitleLayout == null) {
                                AndroidUtilities.dp(f7);
                            }
                            textLayout2 = chatActionCell.giftPremiumText;
                            if (textLayout2 != null) {
                                AndroidUtilities.lerp(chatActionCell.giftPremiumTextCollapsedHeight, textLayout2.layout.getHeight(), f14);
                            }
                            staticLayout = chatActionCell.giftPremiumButtonLayout;
                            if (staticLayout != null) {
                                staticLayout.getHeight();
                            }
                            chatActionCell.getHeight();
                            AndroidUtilities.dp(f7);
                            resourcesProvider = chatActionCell.themeDelegate;
                            if (resourcesProvider != null) {
                                resourcesProvider.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
                            } else {
                                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
                            }
                            float scale = chatActionCell.bounce.getScale(0.02f);
                            canvas2.save();
                            canvas2.scale(scale, scale, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                            if (chatActionCell.giftPremiumButtonLayout != null) {
                                canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.getThemedPaint("paintChatActionBackgroundSelected"));
                                if (chatActionCell.hasGradientService()) {
                                    canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.getThemedPaint("paintChatActionBackgroundDarken"));
                                }
                                if (chatActionCell.dimAmount > f6) {
                                    canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                                }
                                if (chatActionCell.getMessageObject().type != 31 || chatActionCell.getMessageObject().type == 37 || chatActionCell.getMessageObject().type == 33) {
                                    resourcesProvider4 = chatActionCell.themeDelegate;
                                    if (resourcesProvider4 != null) {
                                        zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                                    } else {
                                        zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                                    }
                                    int color5 = chatActionCell.dimPaint.getColor();
                                    Paint paint2 = chatActionCell.dimPaint;
                                    if (zIsCurrentThemeDark2) {
                                        i5 = 620756991;
                                    } else {
                                        i5 = 268435456;
                                    }
                                    paint2.setColor(i5);
                                    canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                                    chatActionCell.dimPaint.setColor(color5);
                                }
                                if (chatActionCell.getMessageObject().type != 31 || chatActionCell.getMessageObject().type == 37 || chatActionCell.getMessageObject().type == 33 || chatActionCell.getMessageObject().type == 21 || chatActionCell.getMessageObject().type == 22 || chatActionCell.getMessageObject().type == 24) {
                                    chatActionCell.invalidate();
                                } else {
                                    chatActionCell.starsPath.rewind();
                                    chatActionCell.starsPath.addRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                                    canvas2.save();
                                    canvas2.clipPath(chatActionCell.starsPath);
                                    chatActionCell.starParticlesDrawable.onDraw(canvas2);
                                    if (!chatActionCell.starParticlesDrawable.paused) {
                                        chatActionCell.invalidate();
                                    }
                                    canvas2.restore();
                                }
                            }
                            z = messageObject.settingAvatar;
                            if (z) {
                                f12 = chatActionCell.progressToProgress;
                                if (f12 != f8) {
                                    chatActionCell.progressToProgress = f12 + 0.10666667f;
                                } else if (!z) {
                                    f10 = chatActionCell.progressToProgress;
                                    if (f10 != f6) {
                                        chatActionCell.progressToProgress = f10 - 0.10666667f;
                                    }
                                }
                            } else if (!z) {
                                f10 = chatActionCell.progressToProgress;
                                if (f10 != f6) {
                                    chatActionCell.progressToProgress = f10 - 0.10666667f;
                                }
                            }
                            fClamp = Utilities.clamp(chatActionCell.progressToProgress, 1.0f, f6);
                            chatActionCell.progressToProgress = fClamp;
                            if (fClamp != f6) {
                                if (chatActionCell.progressView == null) {
                                    chatActionCell.progressView = new RadialProgressView(chatActionCell.getContext());
                                }
                                int iDp2 = AndroidUtilities.dp(16.0f);
                                canvas2.save();
                                float f28 = chatActionCell.progressToProgress;
                                canvas2.scale(f28, f28, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                                chatActionCell.progressView.setSize(iDp2);
                                chatActionCell.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                                chatActionCell.progressView.draw(canvas2, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                                canvas2.restore();
                            }
                            if (chatActionCell.progressToProgress != 1.0f && chatActionCell.giftPremiumButtonLayout != null) {
                                canvas2.save();
                                float f29 = 1.0f - chatActionCell.progressToProgress;
                                canvas2.scale(f29, f29, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                                canvas2.translate(f5, chatActionCell.giftButtonRect.top + AndroidUtilities.dp(7.0f));
                                canvas2.translate(((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumButtonLayout.getWidth()) / 2.0f, f6);
                                chatActionCell.giftPremiumButtonLayout.draw(canvas2);
                                canvas2.restore();
                            }
                            if (messageObject.flickerLoading) {
                                if (chatActionCell.loadingDrawable == null) {
                                    LoadingDrawable loadingDrawable2 = new LoadingDrawable(chatActionCell.themeDelegate);
                                    chatActionCell.loadingDrawable = loadingDrawable2;
                                    loadingDrawable2.setGradientScale(2.0f);
                                    chatActionCell.loadingDrawable.setAppearByGradient(true);
                                    chatActionCell.loadingDrawable.setColors(Theme.multAlpha(0.08f, -1), Theme.multAlpha(0.2f, -1), Theme.multAlpha(0.2f, -1), Theme.multAlpha(0.7f, -1));
                                    chatActionCell.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                                }
                                chatActionCell.loadingDrawable.resetDisappear();
                                chatActionCell.loadingDrawable.setBounds(chatActionCell.giftButtonRect);
                                chatActionCell.loadingDrawable.setRadiiDp(16.0f);
                                chatActionCell.loadingDrawable.draw(canvas2);
                            } else {
                                loadingDrawable = chatActionCell.loadingDrawable;
                                if (loadingDrawable != null) {
                                    loadingDrawable.setBounds(chatActionCell.giftButtonRect);
                                    chatActionCell.loadingDrawable.setRadiiDp(16.0f);
                                    chatActionCell.loadingDrawable.disappear();
                                    chatActionCell.loadingDrawable.draw(canvas2);
                                    if (chatActionCell.loadingDrawable.isDisappeared()) {
                                        chatActionCell.loadingDrawable.reset();
                                    }
                                }
                            }
                            canvas2.restore();
                            if (chatActionCell.backgroundRect != null && chatActionCell.giftRibbonPath != null && chatActionCell.giftRibbonText != null) {
                                themedPaint = chatActionCell.getThemedPaint("paintChatActionBackground");
                                themedPaint2 = chatActionCell.getThemedPaint("paintChatActionBackgroundDarken");
                                fDp6 = (chatActionCell.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                fDp7 = chatActionCell.backgroundRect.top - AndroidUtilities.dp(2.0f);
                                resourcesProvider2 = chatActionCell.themeDelegate;
                                if (resourcesProvider2 != null) {
                                    resourcesProvider2.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp6, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp7);
                                } else {
                                    Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp6, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp7);
                                }
                                canvas2.save();
                                canvas2.translate(fDp6, fDp7);
                                ColorFilter colorFilter = themedPaint.getColorFilter();
                                PathEffect pathEffect = themedPaint.getPathEffect();
                                resourcesProvider3 = chatActionCell.themeDelegate;
                                if (resourcesProvider3 != null) {
                                    zIsCurrentThemeDark = resourcesProvider3.isDark();
                                } else {
                                    zIsCurrentThemeDark = Theme.isCurrentThemeDark();
                                }
                                if (chatActionCell.giftRibbonPaintFilter != null || chatActionCell.giftRibbonPaintFilterDark != zIsCurrentThemeDark) {
                                    colorMatrix = new ColorMatrix();
                                    if ((themedPaint.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                        ((ColorMatrixColorFilter) themedPaint.getColorFilter()).getColorMatrix(colorMatrix);
                                    }
                                    if (zIsCurrentThemeDark) {
                                        f11 = 0.1f;
                                    } else {
                                        f11 = -0.08f;
                                    }
                                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, zIsCurrentThemeDark ? 0.15f : 0.1f);
                                    chatActionCell.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                                    chatActionCell.giftRibbonPaintFilterDark = zIsCurrentThemeDark;
                                }
                                themedPaint.setColorFilter(chatActionCell.giftRibbonPaintFilter);
                                themedPaint.setPathEffect(chatActionCell.giftRibbonPaintEffect);
                                canvas2.drawPath(chatActionCell.giftRibbonPath, themedPaint);
                                themedPaint.setColorFilter(colorFilter);
                                themedPaint.setPathEffect(pathEffect);
                                if (chatActionCell.hasGradientService()) {
                                    PathEffect pathEffect2 = themedPaint2.getPathEffect();
                                    themedPaint2.setPathEffect(chatActionCell.giftRibbonPaintEffect);
                                    canvas2.drawPath(chatActionCell.giftRibbonPath, themedPaint2);
                                    themedPaint2.setPathEffect(pathEffect2);
                                }
                                canvas2.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                chatActionCell.giftRibbonText.draw(canvas2, AndroidUtilities.dp(40.43f) - (chatActionCell.giftRibbonText.getCurrentWidth() / 2.0f), AndroidUtilities.dp(26.0f), -1, 1.0f);
                                canvas2.restore();
                            }
                        }
                        fDp -= AndroidUtilities.dp(3.66f);
                        canvas2.translate(f22, fDp);
                        if (this.giftPremiumTitleLayout != null) {
                            canvas2.save();
                            canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(16.0f)) - this.giftPremiumTitleLayout.getWidth()) / 2.0f, 0.0f);
                            this.giftPremiumTitleLayout.draw(canvas2);
                            canvas2.restore();
                            height2 = this.giftPremiumTitleLayout.getHeight() + fDp;
                            if (this.giftPremiumSubtitleLayout != null) {
                                canvas2.save();
                                canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(16.0f)) - this.giftPremiumSubtitleLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + this.giftPremiumTitleLayout.getHeight());
                                this.giftPremiumSubtitleLayout.draw(canvas2);
                                canvas2.restore();
                                height2 += AndroidUtilities.dp(10.0f) + this.giftPremiumSubtitleLayout.getHeight();
                            }
                            if (messageObject.type == 25) {
                                f13 = 6.0f;
                            } else {
                                f13 = 0.0f;
                            }
                            fDp3 = height2 + AndroidUtilities.dp(f13);
                        } else {
                            fDp3 = fDp - AndroidUtilities.dp(4.0f);
                        }
                        fDp4 = fDp3;
                        canvas2.restore();
                        if (this.giftPremiumTitleLayout != null) {
                            float width3 = text2.getWidth() + AndroidUtilities.dp(12.0f);
                            float fM2 = ImageReceiver$$ExternalSyntheticOutline0.m(this.giftRectSize - AndroidUtilities.dp(16.0f), width3, 2.0f, f22);
                            float height4 = fDp + this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(f3);
                            if (this.giftReleasedBackgroundPaint == null) {
                                this.giftReleasedBackgroundPaint = new Paint(1);
                            }
                            Paint paint3 = this.giftReleasedBackgroundPaint;
                            if (Theme.isCurrentThemeDark()) {
                                i11 = 285212671;
                            } else {
                                i11 = 268435456;
                            }
                            paint3.setColor(i11);
                            RectF rectF5 = AndroidUtilities.rectTmp;
                            rectF5.set(fM2, height4 - AndroidUtilities.dp(8.0f), width3 + fM2, AndroidUtilities.dp(8.0f) + height4);
                            canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.giftReleasedBackgroundPaint);
                            this.giftPremiumReleasedText.draw(canvas, AndroidUtilities.dp(6.0f) + fM2, height4, -855638017, 1.0f);
                            canvas2 = canvas;
                            fDp4 += AndroidUtilities.dp(24.0f);
                        }
                        fDp5 = fDp4 + AndroidUtilities.dp(4.0f);
                        if (messageObject.type == 18) {
                            fDp5 += AndroidUtilities.dp(2.0f);
                        }
                        f4 = fDp5;
                        canvas2.save();
                        canvas2.translate(f22, f4);
                        if (messageObject.type == i2) {
                            f8 = 1.0f;
                            if (this.radialProgress.getTransitionProgress() == 1.0f) {
                                i6 = 4;
                                if (this.radialProgress.getIcon() == 4) {
                                    if (this.giftPremiumText != null) {
                                        canvas2.save();
                                        canvas2.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                        TextLayout textLayout14 = this.giftPremiumText;
                                        textLayout14.x = ((this.giftRectSize - textLayout14.layout.getWidth()) / 2.0f) + f22;
                                        this.giftPremiumText.y = f4;
                                        int color6 = this.giftTextPaint.getColor();
                                        TextLayout textLayout15 = this.giftPremiumText;
                                        f5 = f22;
                                        f6 = 0.0f;
                                        f7 = 8.0f;
                                        SpoilerEffect.renderWithRipple(this, false, color6, 0, textLayout15.patchedLayout, 1, textLayout15.layout, textLayout15.spoilers, canvas, false);
                                        TextLayout textLayout16 = this.giftPremiumText;
                                        chatActionCell = this;
                                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout16.layout, textLayout16.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                        canvas2 = canvas;
                                        canvas2.restore();
                                    } else {
                                        f5 = f22;
                                        f6 = 0.0f;
                                        f7 = 8.0f;
                                        chatActionCell = this;
                                    }
                                }
                            } else {
                                i6 = 4;
                            }
                            chatActionCell = this;
                            f5 = f22;
                            f6 = 0.0f;
                            f7 = 8.0f;
                            if (chatActionCell.settingWallpaperLayout == null) {
                                TextPaint textPaint10 = new TextPaint();
                                chatActionCell.settingWallpaperPaint = textPaint10;
                                textPaint10.setTextSize(AndroidUtilities.dp(13.0f));
                                spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                                iIndexOf = spannableStringBuilder.toString().indexOf("...");
                                if (iIndexOf < 0) {
                                    iIndexOf = spannableStringBuilder.toString().indexOf("…");
                                    i9 = 1;
                                } else {
                                    i9 = 3;
                                }
                                if (iIndexOf >= 0) {
                                    SpannableString spannableString2 = new SpannableString("…");
                                    UploadingDotsSpannable uploadingDotsSpannable2 = new UploadingDotsSpannable();
                                    uploadingDotsSpannable2.fixTop = true;
                                    uploadingDotsSpannable2.setParent(chatActionCell);
                                    spannableString2.setSpan(uploadingDotsSpannable2, 0, spannableString2.length(), i4);
                                    spannableStringBuilder.replace(iIndexOf, iIndexOf + i9, (CharSequence) spannableString2);
                                }
                                TextPaint textPaint11 = chatActionCell.settingWallpaperPaint;
                                textLayout4 = chatActionCell.giftPremiumText;
                                if (textLayout4 == null) {
                                    i10 = 1;
                                } else {
                                    i10 = textLayout4.width;
                                }
                                chatActionCell.settingWallpaperLayout = new StaticLayout(spannableStringBuilder, textPaint11, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            uploadingInfoProgress = chatActionCell.getUploadingInfoProgress(messageObject);
                            if (chatActionCell.settingWallpaperProgressTextLayout != null) {
                                chatActionCell.settingWallpaperProgress = uploadingInfoProgress;
                                String strM2 = Fragment$$ExternalSyntheticOutline0.m((int) (uploadingInfoProgress * 100.0f), "%", new StringBuilder());
                                TextPaint textPaint12 = chatActionCell.giftTextPaint;
                                textLayout3 = chatActionCell.giftPremiumText;
                                if (textLayout3 == null) {
                                    i7 = 1;
                                } else {
                                    i7 = textLayout3.width;
                                }
                                chatActionCell.settingWallpaperProgressTextLayout = new StaticLayout(strM2, textPaint12, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            } else {
                                chatActionCell.settingWallpaperProgress = uploadingInfoProgress;
                                String strM3 = Fragment$$ExternalSyntheticOutline0.m((int) (uploadingInfoProgress * 100.0f), "%", new StringBuilder());
                                TextPaint textPaint13 = chatActionCell.giftTextPaint;
                                textLayout3 = chatActionCell.giftPremiumText;
                                if (textLayout3 == null) {
                                    i7 = 1;
                                } else {
                                    i7 = textLayout3.width;
                                }
                                chatActionCell.settingWallpaperProgressTextLayout = new StaticLayout(strM3, textPaint13, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            chatActionCell.settingWallpaperPaint.setColor(chatActionCell.giftTextPaint.getColor());
                            if (chatActionCell.radialProgress.getIcon() == i6) {
                                transitionProgress = chatActionCell.radialProgress.getTransitionProgress();
                                color = chatActionCell.giftTextPaint.getColor();
                                float f210 = 1.0f - transitionProgress;
                                chatActionCell.settingWallpaperPaint.setAlpha((int) (Color.alpha(color) * f210));
                                chatActionCell.giftTextPaint.setAlpha((int) (Color.alpha(color) * transitionProgress));
                                TextPaint textPaint14 = chatActionCell.giftTextPaint;
                                textPaint14.linkColor = textPaint14.getColor();
                                if (chatActionCell.giftPremiumText != null) {
                                    float f211 = (transitionProgress * 0.2f) + 0.8f;
                                    canvas2.save();
                                    canvas2.scale(f211, f211, chatActionCell.giftRectSize / 2.0f, chatActionCell.giftPremiumText.layout.getHeight() / 2.0f);
                                    canvas2.translate((chatActionCell.giftRectSize - chatActionCell.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                    TextLayout textLayout17 = chatActionCell.giftPremiumText;
                                    textLayout17.x = ((chatActionCell.giftRectSize - textLayout17.layout.getWidth()) / 2.0f) + f5;
                                    chatActionCell.giftPremiumText.y = f4;
                                    int color7 = chatActionCell.giftTextPaint.getColor();
                                    TextLayout textLayout18 = chatActionCell.giftPremiumText;
                                    i8 = color;
                                    SpoilerEffect.renderWithRipple(chatActionCell, false, color7, 0, textLayout18.patchedLayout, 1, textLayout18.layout, textLayout18.spoilers, canvas, false);
                                    TextLayout textLayout19 = chatActionCell.giftPremiumText;
                                    StaticLayout staticLayout7 = textLayout19.layout;
                                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans4 = textLayout19.emoji;
                                    ColorFilter adaptiveEmojiColorFilter4 = chatActionCell.getAdaptiveEmojiColorFilter(chatActionCell.giftTextPaint.getColor());
                                    chatActionCell = chatActionCell;
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout7, emojiGroupedSpans4, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter4);
                                    canvas2 = canvas;
                                    canvas2.restore();
                                } else {
                                    i8 = color;
                                }
                                chatActionCell.giftTextPaint.setAlpha((int) (Color.alpha(i8) * f210));
                                TextPaint textPaint15 = chatActionCell.giftTextPaint;
                                textPaint15.linkColor = textPaint15.getColor();
                                float f212 = (f210 * 0.2f) + 0.8f;
                                canvas2.save();
                                canvas2.scale(f212, f212, chatActionCell.giftRectSize / 2.0f, chatActionCell.settingWallpaperLayout.getHeight() / 2.0f);
                                canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                                SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell.settingWallpaperLayout);
                                canvas2.restore();
                                canvas2.save();
                                canvas2.translate(0.0f, AndroidUtilities.dp(4.0f) + chatActionCell.settingWallpaperLayout.getHeight());
                                canvas2.scale(f212, f212, chatActionCell.giftRectSize / 2.0f, chatActionCell.settingWallpaperProgressTextLayout.getHeight() / 2.0f);
                                canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, 0.0f);
                                SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell.settingWallpaperProgressTextLayout);
                                canvas2.restore();
                                int i110 = i8;
                                chatActionCell.giftTextPaint.setColor(i110);
                                chatActionCell.giftTextPaint.linkColor = i110;
                            } else {
                                canvas2.save();
                                canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                                chatActionCell.settingWallpaperLayout.draw(canvas2);
                                canvas2.restore();
                                canvas2.save();
                                canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + chatActionCell.settingWallpaperLayout.getHeight());
                                SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell.settingWallpaperProgressTextLayout);
                                canvas2.restore();
                            }
                        } else {
                            chatActionCell = this;
                            f5 = f22;
                            f6 = 0.0f;
                            f7 = 8.0f;
                            f8 = 1.0f;
                            textLayout = chatActionCell.giftPremiumText;
                            if (textLayout != null) {
                                height = textLayout.layout.getHeight();
                                if (f14 < 1.0f) {
                                    height = AndroidUtilities.lerp(chatActionCell.giftPremiumTextCollapsedHeight, height, f14);
                                    RectF rectF6 = AndroidUtilities.rectTmp;
                                    rectF6.set(0.0f, -AndroidUtilities.dp(20.0f), chatActionCell.getWidth(), height);
                                    canvas2.saveLayerAlpha(rectF6, 255, 31);
                                } else {
                                    canvas2.save();
                                }
                                canvas2.translate(((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                chatActionCell.giftPremiumText.x = (((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumText.layout.getWidth()) / 2.0f) + f5;
                                TextLayout textLayout110 = chatActionCell.giftPremiumText;
                                textLayout110.y = f4;
                                int color8 = textLayout110.paint.getColor();
                                TextLayout textLayout111 = chatActionCell.giftPremiumText;
                                f9 = height;
                                SpoilerEffect.renderWithRipple(chatActionCell, false, color8, 0, textLayout111.patchedLayout, 1, textLayout111.layout, textLayout111.spoilers, canvas, false);
                                TextLayout textLayout112 = chatActionCell.giftPremiumText;
                                StaticLayout staticLayout8 = textLayout112.layout;
                                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans5 = textLayout112.emoji;
                                ColorFilter adaptiveEmojiColorFilter5 = chatActionCell.getAdaptiveEmojiColorFilter(chatActionCell.giftTextPaint.getColor());
                                chatActionCell = chatActionCell;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout8, emojiGroupedSpans5, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter5);
                                canvas2 = canvas;
                                if (f14 < 1.0f) {
                                    canvas2.save();
                                    if (chatActionCell.giftPremiumTextClip == null) {
                                        chatActionCell.giftPremiumTextClip = new GradientClip();
                                    }
                                    canvas2.translate((-((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumText.layout.getWidth())) / 2.0f, 0.0f);
                                    RectF rectF7 = AndroidUtilities.rectTmp;
                                    rectF7.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + chatActionCell.giftPremiumTextMoreX, chatActionCell.giftPremiumTextMoreY);
                                    float f213 = 1.0f - f14;
                                    chatActionCell.giftPremiumTextClip.clipOut(canvas2, rectF7, f213);
                                    rectF7.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(16.0f), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), chatActionCell.giftPremiumTextMoreY);
                                    chatActionCell.giftPremiumTextClip.draw(canvas2, rectF7, 2, f213);
                                    rectF7.set(0.0f, f9 - AndroidUtilities.dp(12.0f), chatActionCell.getWidth(), f9);
                                    chatActionCell.giftPremiumTextClip.draw(canvas2, rectF7, 3, (1.0f - f213) * f213 * 4.0f);
                                    canvas2.restore();
                                }
                                canvas2.restore();
                                if (f14 < 1.0f) {
                                    text.draw(canvas2, (chatActionCell.giftPremiumTextMoreX - text.getCurrentWidth()) + AndroidUtilities.dp(5.0f), (chatActionCell.giftPremiumTextMoreY - (chatActionCell.giftPremiumTextMoreH / 2.0f)) - AndroidUtilities.dp(1.0f), chatActionCell.giftPremiumText.paint.getColor(), 1.0f - f14);
                                }
                            }
                        }
                        canvas2.restore();
                        if (chatActionCell.giftPremiumTitleLayout == null) {
                            AndroidUtilities.dp(f7);
                        }
                        textLayout2 = chatActionCell.giftPremiumText;
                        if (textLayout2 != null) {
                            AndroidUtilities.lerp(chatActionCell.giftPremiumTextCollapsedHeight, textLayout2.layout.getHeight(), f14);
                        }
                        staticLayout = chatActionCell.giftPremiumButtonLayout;
                        if (staticLayout != null) {
                            staticLayout.getHeight();
                        }
                        chatActionCell.getHeight();
                        AndroidUtilities.dp(f7);
                        resourcesProvider = chatActionCell.themeDelegate;
                        if (resourcesProvider != null) {
                            resourcesProvider.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
                        } else {
                            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
                        }
                        float scale2 = chatActionCell.bounce.getScale(0.02f);
                        canvas2.save();
                        canvas2.scale(scale2, scale2, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                        if (chatActionCell.giftPremiumButtonLayout != null) {
                            canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.getThemedPaint("paintChatActionBackgroundSelected"));
                            if (chatActionCell.hasGradientService()) {
                                canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.getThemedPaint("paintChatActionBackgroundDarken"));
                            }
                            if (chatActionCell.dimAmount > f6) {
                                canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                            }
                            if (chatActionCell.getMessageObject().type != 31) {
                                resourcesProvider4 = chatActionCell.themeDelegate;
                                if (resourcesProvider4 != null) {
                                    zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                                } else {
                                    zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                                }
                                int color9 = chatActionCell.dimPaint.getColor();
                                Paint paint4 = chatActionCell.dimPaint;
                                if (zIsCurrentThemeDark2) {
                                    i5 = 620756991;
                                } else {
                                    i5 = 268435456;
                                }
                                paint4.setColor(i5);
                                canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                                chatActionCell.dimPaint.setColor(color9);
                            } else {
                                resourcesProvider4 = chatActionCell.themeDelegate;
                                if (resourcesProvider4 != null) {
                                    zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                                } else {
                                    zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                                }
                                int color10 = chatActionCell.dimPaint.getColor();
                                Paint paint5 = chatActionCell.dimPaint;
                                if (zIsCurrentThemeDark2) {
                                    i5 = 620756991;
                                } else {
                                    i5 = 268435456;
                                }
                                paint5.setColor(i5);
                                canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                                chatActionCell.dimPaint.setColor(color10);
                            }
                            if (chatActionCell.getMessageObject().type != 31) {
                                chatActionCell.invalidate();
                            } else {
                                chatActionCell.invalidate();
                            }
                        }
                        z = messageObject.settingAvatar;
                        if (z) {
                            f12 = chatActionCell.progressToProgress;
                            if (f12 != f8) {
                                chatActionCell.progressToProgress = f12 + 0.10666667f;
                            } else if (!z) {
                                f10 = chatActionCell.progressToProgress;
                                if (f10 != f6) {
                                    chatActionCell.progressToProgress = f10 - 0.10666667f;
                                }
                            }
                        } else if (!z) {
                            f10 = chatActionCell.progressToProgress;
                            if (f10 != f6) {
                                chatActionCell.progressToProgress = f10 - 0.10666667f;
                            }
                        }
                        fClamp = Utilities.clamp(chatActionCell.progressToProgress, 1.0f, f6);
                        chatActionCell.progressToProgress = fClamp;
                        if (fClamp != f6) {
                            if (chatActionCell.progressView == null) {
                                chatActionCell.progressView = new RadialProgressView(chatActionCell.getContext());
                            }
                            int iDp3 = AndroidUtilities.dp(16.0f);
                            canvas2.save();
                            float f214 = chatActionCell.progressToProgress;
                            canvas2.scale(f214, f214, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                            chatActionCell.progressView.setSize(iDp3);
                            chatActionCell.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                            chatActionCell.progressView.draw(canvas2, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                            canvas2.restore();
                        }
                        if (chatActionCell.progressToProgress != 1.0f) {
                            canvas2.save();
                            float f215 = 1.0f - chatActionCell.progressToProgress;
                            canvas2.scale(f215, f215, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                            canvas2.translate(f5, chatActionCell.giftButtonRect.top + AndroidUtilities.dp(7.0f));
                            canvas2.translate(((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumButtonLayout.getWidth()) / 2.0f, f6);
                            chatActionCell.giftPremiumButtonLayout.draw(canvas2);
                            canvas2.restore();
                        }
                        if (messageObject.flickerLoading) {
                            if (chatActionCell.loadingDrawable == null) {
                                LoadingDrawable loadingDrawable3 = new LoadingDrawable(chatActionCell.themeDelegate);
                                chatActionCell.loadingDrawable = loadingDrawable3;
                                loadingDrawable3.setGradientScale(2.0f);
                                chatActionCell.loadingDrawable.setAppearByGradient(true);
                                chatActionCell.loadingDrawable.setColors(Theme.multAlpha(0.08f, -1), Theme.multAlpha(0.2f, -1), Theme.multAlpha(0.2f, -1), Theme.multAlpha(0.7f, -1));
                                chatActionCell.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                            }
                            chatActionCell.loadingDrawable.resetDisappear();
                            chatActionCell.loadingDrawable.setBounds(chatActionCell.giftButtonRect);
                            chatActionCell.loadingDrawable.setRadiiDp(16.0f);
                            chatActionCell.loadingDrawable.draw(canvas2);
                        } else {
                            loadingDrawable = chatActionCell.loadingDrawable;
                            if (loadingDrawable != null) {
                                loadingDrawable.setBounds(chatActionCell.giftButtonRect);
                                chatActionCell.loadingDrawable.setRadiiDp(16.0f);
                                chatActionCell.loadingDrawable.disappear();
                                chatActionCell.loadingDrawable.draw(canvas2);
                                if (chatActionCell.loadingDrawable.isDisappeared()) {
                                    chatActionCell.loadingDrawable.reset();
                                }
                            }
                        }
                        canvas2.restore();
                        if (chatActionCell.backgroundRect != null) {
                            themedPaint = chatActionCell.getThemedPaint("paintChatActionBackground");
                            themedPaint2 = chatActionCell.getThemedPaint("paintChatActionBackgroundDarken");
                            fDp6 = (chatActionCell.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                            fDp7 = chatActionCell.backgroundRect.top - AndroidUtilities.dp(2.0f);
                            resourcesProvider2 = chatActionCell.themeDelegate;
                            if (resourcesProvider2 != null) {
                                resourcesProvider2.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp6, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp7);
                            } else {
                                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp6, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp7);
                            }
                            canvas2.save();
                            canvas2.translate(fDp6, fDp7);
                            ColorFilter colorFilter2 = themedPaint.getColorFilter();
                            PathEffect pathEffect3 = themedPaint.getPathEffect();
                            resourcesProvider3 = chatActionCell.themeDelegate;
                            if (resourcesProvider3 != null) {
                                zIsCurrentThemeDark = resourcesProvider3.isDark();
                            } else {
                                zIsCurrentThemeDark = Theme.isCurrentThemeDark();
                            }
                            if (chatActionCell.giftRibbonPaintFilter != null) {
                                colorMatrix = new ColorMatrix();
                                if (themedPaint.getColorFilter() instanceof ColorMatrixColorFilter) {
                                    ((ColorMatrixColorFilter) themedPaint.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                if (zIsCurrentThemeDark) {
                                    f11 = 0.1f;
                                } else {
                                    f11 = -0.08f;
                                }
                                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, zIsCurrentThemeDark ? 0.15f : 0.1f);
                                chatActionCell.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                                chatActionCell.giftRibbonPaintFilterDark = zIsCurrentThemeDark;
                            } else {
                                colorMatrix = new ColorMatrix();
                                if (themedPaint.getColorFilter() instanceof ColorMatrixColorFilter) {
                                    ((ColorMatrixColorFilter) themedPaint.getColorFilter()).getColorMatrix(colorMatrix);
                                }
                                if (zIsCurrentThemeDark) {
                                    f11 = 0.1f;
                                } else {
                                    f11 = -0.08f;
                                }
                                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, zIsCurrentThemeDark ? 0.15f : 0.1f);
                                chatActionCell.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                                chatActionCell.giftRibbonPaintFilterDark = zIsCurrentThemeDark;
                            }
                            themedPaint.setColorFilter(chatActionCell.giftRibbonPaintFilter);
                            themedPaint.setPathEffect(chatActionCell.giftRibbonPaintEffect);
                            canvas2.drawPath(chatActionCell.giftRibbonPath, themedPaint);
                            themedPaint.setColorFilter(colorFilter2);
                            themedPaint.setPathEffect(pathEffect3);
                            if (chatActionCell.hasGradientService()) {
                                PathEffect pathEffect4 = themedPaint2.getPathEffect();
                                themedPaint2.setPathEffect(chatActionCell.giftRibbonPaintEffect);
                                canvas2.drawPath(chatActionCell.giftRibbonPath, themedPaint2);
                                themedPaint2.setPathEffect(pathEffect4);
                            }
                            canvas2.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                            chatActionCell.giftRibbonText.draw(canvas2, AndroidUtilities.dp(40.43f) - (chatActionCell.giftRibbonText.getCurrentWidth() / 2.0f), AndroidUtilities.dp(26.0f), -1, 1.0f);
                            canvas2.restore();
                        }
                    }
                    fDp += fDp2;
                    i3 = messageObject.type;
                    if (i3 != 31) {
                        i4 = 33;
                        fDp -= AndroidUtilities.dp(3.66f);
                    } else {
                        i4 = 33;
                        fDp -= AndroidUtilities.dp(3.66f);
                    }
                    canvas2.translate(f22, fDp);
                    if (this.giftPremiumTitleLayout != null) {
                        canvas2.save();
                        canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(16.0f)) - this.giftPremiumTitleLayout.getWidth()) / 2.0f, 0.0f);
                        this.giftPremiumTitleLayout.draw(canvas2);
                        canvas2.restore();
                        height2 = this.giftPremiumTitleLayout.getHeight() + fDp;
                        if (this.giftPremiumSubtitleLayout != null) {
                            canvas2.save();
                            canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(16.0f)) - this.giftPremiumSubtitleLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + this.giftPremiumTitleLayout.getHeight());
                            this.giftPremiumSubtitleLayout.draw(canvas2);
                            canvas2.restore();
                            height2 += AndroidUtilities.dp(10.0f) + this.giftPremiumSubtitleLayout.getHeight();
                        }
                        if (messageObject.type == 25) {
                            f13 = 6.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        fDp3 = height2 + AndroidUtilities.dp(f13);
                    } else {
                        fDp3 = fDp - AndroidUtilities.dp(4.0f);
                    }
                    fDp4 = fDp3;
                    canvas2.restore();
                    if (this.giftPremiumTitleLayout != null) {
                        float width4 = text2.getWidth() + AndroidUtilities.dp(12.0f);
                        float fM3 = ImageReceiver$$ExternalSyntheticOutline0.m(this.giftRectSize - AndroidUtilities.dp(16.0f), width4, 2.0f, f22);
                        float height5 = fDp + this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(f3);
                        if (this.giftReleasedBackgroundPaint == null) {
                            this.giftReleasedBackgroundPaint = new Paint(1);
                        }
                        Paint paint6 = this.giftReleasedBackgroundPaint;
                        if (Theme.isCurrentThemeDark()) {
                            i11 = 285212671;
                        } else {
                            i11 = 268435456;
                        }
                        paint6.setColor(i11);
                        RectF rectF8 = AndroidUtilities.rectTmp;
                        rectF8.set(fM3, height5 - AndroidUtilities.dp(8.0f), width4 + fM3, AndroidUtilities.dp(8.0f) + height5);
                        canvas2.drawRoundRect(rectF8, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.giftReleasedBackgroundPaint);
                        this.giftPremiumReleasedText.draw(canvas, AndroidUtilities.dp(6.0f) + fM3, height5, -855638017, 1.0f);
                        canvas2 = canvas;
                        fDp4 += AndroidUtilities.dp(24.0f);
                    }
                    fDp5 = fDp4 + AndroidUtilities.dp(4.0f);
                    if (messageObject.type == 18) {
                        fDp5 += AndroidUtilities.dp(2.0f);
                    }
                    f4 = fDp5;
                    canvas2.save();
                    canvas2.translate(f22, f4);
                    if (messageObject.type == i2) {
                        f8 = 1.0f;
                        if (this.radialProgress.getTransitionProgress() == 1.0f) {
                            i6 = 4;
                            if (this.radialProgress.getIcon() == 4) {
                                if (this.giftPremiumText != null) {
                                    canvas2.save();
                                    canvas2.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                    TextLayout textLayout113 = this.giftPremiumText;
                                    textLayout113.x = ((this.giftRectSize - textLayout113.layout.getWidth()) / 2.0f) + f22;
                                    this.giftPremiumText.y = f4;
                                    int color11 = this.giftTextPaint.getColor();
                                    TextLayout textLayout114 = this.giftPremiumText;
                                    f5 = f22;
                                    f6 = 0.0f;
                                    f7 = 8.0f;
                                    SpoilerEffect.renderWithRipple(this, false, color11, 0, textLayout114.patchedLayout, 1, textLayout114.layout, textLayout114.spoilers, canvas, false);
                                    TextLayout textLayout115 = this.giftPremiumText;
                                    chatActionCell = this;
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout115.layout, textLayout115.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                    canvas2 = canvas;
                                    canvas2.restore();
                                } else {
                                    f5 = f22;
                                    f6 = 0.0f;
                                    f7 = 8.0f;
                                    chatActionCell = this;
                                }
                            }
                        } else {
                            i6 = 4;
                        }
                        chatActionCell = this;
                        f5 = f22;
                        f6 = 0.0f;
                        f7 = 8.0f;
                        if (chatActionCell.settingWallpaperLayout == null) {
                            TextPaint textPaint16 = new TextPaint();
                            chatActionCell.settingWallpaperPaint = textPaint16;
                            textPaint16.setTextSize(AndroidUtilities.dp(13.0f));
                            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                            iIndexOf = spannableStringBuilder.toString().indexOf("...");
                            if (iIndexOf < 0) {
                                iIndexOf = spannableStringBuilder.toString().indexOf("…");
                                i9 = 1;
                            } else {
                                i9 = 3;
                            }
                            if (iIndexOf >= 0) {
                                SpannableString spannableString3 = new SpannableString("…");
                                UploadingDotsSpannable uploadingDotsSpannable3 = new UploadingDotsSpannable();
                                uploadingDotsSpannable3.fixTop = true;
                                uploadingDotsSpannable3.setParent(chatActionCell);
                                spannableString3.setSpan(uploadingDotsSpannable3, 0, spannableString3.length(), i4);
                                spannableStringBuilder.replace(iIndexOf, iIndexOf + i9, (CharSequence) spannableString3);
                            }
                            TextPaint textPaint17 = chatActionCell.settingWallpaperPaint;
                            textLayout4 = chatActionCell.giftPremiumText;
                            if (textLayout4 == null) {
                                i10 = 1;
                            } else {
                                i10 = textLayout4.width;
                            }
                            chatActionCell.settingWallpaperLayout = new StaticLayout(spannableStringBuilder, textPaint17, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        uploadingInfoProgress = chatActionCell.getUploadingInfoProgress(messageObject);
                        if (chatActionCell.settingWallpaperProgressTextLayout != null) {
                            chatActionCell.settingWallpaperProgress = uploadingInfoProgress;
                            String strM4 = Fragment$$ExternalSyntheticOutline0.m((int) (uploadingInfoProgress * 100.0f), "%", new StringBuilder());
                            TextPaint textPaint18 = chatActionCell.giftTextPaint;
                            textLayout3 = chatActionCell.giftPremiumText;
                            if (textLayout3 == null) {
                                i7 = 1;
                            } else {
                                i7 = textLayout3.width;
                            }
                            chatActionCell.settingWallpaperProgressTextLayout = new StaticLayout(strM4, textPaint18, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            chatActionCell.settingWallpaperProgress = uploadingInfoProgress;
                            String strM5 = Fragment$$ExternalSyntheticOutline0.m((int) (uploadingInfoProgress * 100.0f), "%", new StringBuilder());
                            TextPaint textPaint19 = chatActionCell.giftTextPaint;
                            textLayout3 = chatActionCell.giftPremiumText;
                            if (textLayout3 == null) {
                                i7 = 1;
                            } else {
                                i7 = textLayout3.width;
                            }
                            chatActionCell.settingWallpaperProgressTextLayout = new StaticLayout(strM5, textPaint19, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        chatActionCell.settingWallpaperPaint.setColor(chatActionCell.giftTextPaint.getColor());
                        if (chatActionCell.radialProgress.getIcon() == i6) {
                            transitionProgress = chatActionCell.radialProgress.getTransitionProgress();
                            color = chatActionCell.giftTextPaint.getColor();
                            float f216 = 1.0f - transitionProgress;
                            chatActionCell.settingWallpaperPaint.setAlpha((int) (Color.alpha(color) * f216));
                            chatActionCell.giftTextPaint.setAlpha((int) (Color.alpha(color) * transitionProgress));
                            TextPaint textPaint110 = chatActionCell.giftTextPaint;
                            textPaint110.linkColor = textPaint110.getColor();
                            if (chatActionCell.giftPremiumText != null) {
                                float f217 = (transitionProgress * 0.2f) + 0.8f;
                                canvas2.save();
                                canvas2.scale(f217, f217, chatActionCell.giftRectSize / 2.0f, chatActionCell.giftPremiumText.layout.getHeight() / 2.0f);
                                canvas2.translate((chatActionCell.giftRectSize - chatActionCell.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                TextLayout textLayout116 = chatActionCell.giftPremiumText;
                                textLayout116.x = ((chatActionCell.giftRectSize - textLayout116.layout.getWidth()) / 2.0f) + f5;
                                chatActionCell.giftPremiumText.y = f4;
                                int color12 = chatActionCell.giftTextPaint.getColor();
                                TextLayout textLayout117 = chatActionCell.giftPremiumText;
                                i8 = color;
                                SpoilerEffect.renderWithRipple(chatActionCell, false, color12, 0, textLayout117.patchedLayout, 1, textLayout117.layout, textLayout117.spoilers, canvas, false);
                                TextLayout textLayout118 = chatActionCell.giftPremiumText;
                                StaticLayout staticLayout9 = textLayout118.layout;
                                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans6 = textLayout118.emoji;
                                ColorFilter adaptiveEmojiColorFilter6 = chatActionCell.getAdaptiveEmojiColorFilter(chatActionCell.giftTextPaint.getColor());
                                chatActionCell = chatActionCell;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout9, emojiGroupedSpans6, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter6);
                                canvas2 = canvas;
                                canvas2.restore();
                            } else {
                                i8 = color;
                            }
                            chatActionCell.giftTextPaint.setAlpha((int) (Color.alpha(i8) * f216));
                            TextPaint textPaint111 = chatActionCell.giftTextPaint;
                            textPaint111.linkColor = textPaint111.getColor();
                            float f218 = (f216 * 0.2f) + 0.8f;
                            canvas2.save();
                            canvas2.scale(f218, f218, chatActionCell.giftRectSize / 2.0f, chatActionCell.settingWallpaperLayout.getHeight() / 2.0f);
                            canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                            SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell.settingWallpaperLayout);
                            canvas2.restore();
                            canvas2.save();
                            canvas2.translate(0.0f, AndroidUtilities.dp(4.0f) + chatActionCell.settingWallpaperLayout.getHeight());
                            canvas2.scale(f218, f218, chatActionCell.giftRectSize / 2.0f, chatActionCell.settingWallpaperProgressTextLayout.getHeight() / 2.0f);
                            canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, 0.0f);
                            SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell.settingWallpaperProgressTextLayout);
                            canvas2.restore();
                            int i111 = i8;
                            chatActionCell.giftTextPaint.setColor(i111);
                            chatActionCell.giftTextPaint.linkColor = i111;
                        } else {
                            canvas2.save();
                            canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                            chatActionCell.settingWallpaperLayout.draw(canvas2);
                            canvas2.restore();
                            canvas2.save();
                            canvas2.translate((chatActionCell.giftRectSize - chatActionCell.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + chatActionCell.settingWallpaperLayout.getHeight());
                            SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell.settingWallpaperProgressTextLayout);
                            canvas2.restore();
                        }
                    } else {
                        chatActionCell = this;
                        f5 = f22;
                        f6 = 0.0f;
                        f7 = 8.0f;
                        f8 = 1.0f;
                        textLayout = chatActionCell.giftPremiumText;
                        if (textLayout != null) {
                            height = textLayout.layout.getHeight();
                            if (f14 < 1.0f) {
                                height = AndroidUtilities.lerp(chatActionCell.giftPremiumTextCollapsedHeight, height, f14);
                                RectF rectF9 = AndroidUtilities.rectTmp;
                                rectF9.set(0.0f, -AndroidUtilities.dp(20.0f), chatActionCell.getWidth(), height);
                                canvas2.saveLayerAlpha(rectF9, 255, 31);
                            } else {
                                canvas2.save();
                            }
                            canvas2.translate(((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                            chatActionCell.giftPremiumText.x = (((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumText.layout.getWidth()) / 2.0f) + f5;
                            TextLayout textLayout119 = chatActionCell.giftPremiumText;
                            textLayout119.y = f4;
                            int color13 = textLayout119.paint.getColor();
                            TextLayout textLayout1110 = chatActionCell.giftPremiumText;
                            f9 = height;
                            SpoilerEffect.renderWithRipple(chatActionCell, false, color13, 0, textLayout1110.patchedLayout, 1, textLayout1110.layout, textLayout1110.spoilers, canvas, false);
                            TextLayout textLayout1111 = chatActionCell.giftPremiumText;
                            StaticLayout staticLayout10 = textLayout1111.layout;
                            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans7 = textLayout1111.emoji;
                            ColorFilter adaptiveEmojiColorFilter7 = chatActionCell.getAdaptiveEmojiColorFilter(chatActionCell.giftTextPaint.getColor());
                            chatActionCell = chatActionCell;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout10, emojiGroupedSpans7, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter7);
                            canvas2 = canvas;
                            if (f14 < 1.0f) {
                                canvas2.save();
                                if (chatActionCell.giftPremiumTextClip == null) {
                                    chatActionCell.giftPremiumTextClip = new GradientClip();
                                }
                                canvas2.translate((-((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumText.layout.getWidth())) / 2.0f, 0.0f);
                                RectF rectF10 = AndroidUtilities.rectTmp;
                                rectF10.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + chatActionCell.giftPremiumTextMoreX, chatActionCell.giftPremiumTextMoreY);
                                float f219 = 1.0f - f14;
                                chatActionCell.giftPremiumTextClip.clipOut(canvas2, rectF10, f219);
                                rectF10.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(16.0f), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), chatActionCell.giftPremiumTextMoreY);
                                chatActionCell.giftPremiumTextClip.draw(canvas2, rectF10, 2, f219);
                                rectF10.set(0.0f, f9 - AndroidUtilities.dp(12.0f), chatActionCell.getWidth(), f9);
                                chatActionCell.giftPremiumTextClip.draw(canvas2, rectF10, 3, (1.0f - f219) * f219 * 4.0f);
                                canvas2.restore();
                            }
                            canvas2.restore();
                            if (f14 < 1.0f) {
                                text.draw(canvas2, (chatActionCell.giftPremiumTextMoreX - text.getCurrentWidth()) + AndroidUtilities.dp(5.0f), (chatActionCell.giftPremiumTextMoreY - (chatActionCell.giftPremiumTextMoreH / 2.0f)) - AndroidUtilities.dp(1.0f), chatActionCell.giftPremiumText.paint.getColor(), 1.0f - f14);
                            }
                        }
                    }
                    canvas2.restore();
                    if (chatActionCell.giftPremiumTitleLayout == null) {
                        AndroidUtilities.dp(f7);
                    }
                    textLayout2 = chatActionCell.giftPremiumText;
                    if (textLayout2 != null) {
                        AndroidUtilities.lerp(chatActionCell.giftPremiumTextCollapsedHeight, textLayout2.layout.getHeight(), f14);
                    }
                    staticLayout = chatActionCell.giftPremiumButtonLayout;
                    if (staticLayout != null) {
                        staticLayout.getHeight();
                    }
                    chatActionCell.getHeight();
                    AndroidUtilities.dp(f7);
                    resourcesProvider = chatActionCell.themeDelegate;
                    if (resourcesProvider != null) {
                        resourcesProvider.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
                    } else {
                        Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
                    }
                    float scale3 = chatActionCell.bounce.getScale(0.02f);
                    canvas2.save();
                    canvas2.scale(scale3, scale3, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                    if (chatActionCell.giftPremiumButtonLayout != null) {
                        canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.getThemedPaint("paintChatActionBackgroundSelected"));
                        if (chatActionCell.hasGradientService()) {
                            canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.getThemedPaint("paintChatActionBackgroundDarken"));
                        }
                        if (chatActionCell.dimAmount > f6) {
                            canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                        }
                        if (chatActionCell.getMessageObject().type != 31) {
                            resourcesProvider4 = chatActionCell.themeDelegate;
                            if (resourcesProvider4 != null) {
                                zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                            } else {
                                zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                            }
                            int color14 = chatActionCell.dimPaint.getColor();
                            Paint paint7 = chatActionCell.dimPaint;
                            if (zIsCurrentThemeDark2) {
                                i5 = 620756991;
                            } else {
                                i5 = 268435456;
                            }
                            paint7.setColor(i5);
                            canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                            chatActionCell.dimPaint.setColor(color14);
                        } else {
                            resourcesProvider4 = chatActionCell.themeDelegate;
                            if (resourcesProvider4 != null) {
                                zIsCurrentThemeDark2 = resourcesProvider4.isDark();
                            } else {
                                zIsCurrentThemeDark2 = Theme.isCurrentThemeDark();
                            }
                            int color15 = chatActionCell.dimPaint.getColor();
                            Paint paint8 = chatActionCell.dimPaint;
                            if (zIsCurrentThemeDark2) {
                                i5 = 620756991;
                            } else {
                                i5 = 268435456;
                            }
                            paint8.setColor(i5);
                            canvas2.drawRoundRect(chatActionCell.giftButtonRect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.dimPaint);
                            chatActionCell.dimPaint.setColor(color15);
                        }
                        if (chatActionCell.getMessageObject().type != 31) {
                            chatActionCell.invalidate();
                        } else {
                            chatActionCell.invalidate();
                        }
                    }
                    z = messageObject.settingAvatar;
                    if (z) {
                        f12 = chatActionCell.progressToProgress;
                        if (f12 != f8) {
                            chatActionCell.progressToProgress = f12 + 0.10666667f;
                        } else if (!z) {
                            f10 = chatActionCell.progressToProgress;
                            if (f10 != f6) {
                                chatActionCell.progressToProgress = f10 - 0.10666667f;
                            }
                        }
                    } else if (!z) {
                        f10 = chatActionCell.progressToProgress;
                        if (f10 != f6) {
                            chatActionCell.progressToProgress = f10 - 0.10666667f;
                        }
                    }
                    fClamp = Utilities.clamp(chatActionCell.progressToProgress, 1.0f, f6);
                    chatActionCell.progressToProgress = fClamp;
                    if (fClamp != f6) {
                        if (chatActionCell.progressView == null) {
                            chatActionCell.progressView = new RadialProgressView(chatActionCell.getContext());
                        }
                        int iDp4 = AndroidUtilities.dp(16.0f);
                        canvas2.save();
                        float f2110 = chatActionCell.progressToProgress;
                        canvas2.scale(f2110, f2110, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                        chatActionCell.progressView.setSize(iDp4);
                        chatActionCell.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                        chatActionCell.progressView.draw(canvas2, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                        canvas2.restore();
                    }
                    if (chatActionCell.progressToProgress != 1.0f) {
                        canvas2.save();
                        float f2111 = 1.0f - chatActionCell.progressToProgress;
                        canvas2.scale(f2111, f2111, chatActionCell.giftButtonRect.centerX(), chatActionCell.giftButtonRect.centerY());
                        canvas2.translate(f5, chatActionCell.giftButtonRect.top + AndroidUtilities.dp(7.0f));
                        canvas2.translate(((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumButtonLayout.getWidth()) / 2.0f, f6);
                        chatActionCell.giftPremiumButtonLayout.draw(canvas2);
                        canvas2.restore();
                    }
                    if (messageObject.flickerLoading) {
                        if (chatActionCell.loadingDrawable == null) {
                            LoadingDrawable loadingDrawable4 = new LoadingDrawable(chatActionCell.themeDelegate);
                            chatActionCell.loadingDrawable = loadingDrawable4;
                            loadingDrawable4.setGradientScale(2.0f);
                            chatActionCell.loadingDrawable.setAppearByGradient(true);
                            chatActionCell.loadingDrawable.setColors(Theme.multAlpha(0.08f, -1), Theme.multAlpha(0.2f, -1), Theme.multAlpha(0.2f, -1), Theme.multAlpha(0.7f, -1));
                            chatActionCell.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                        }
                        chatActionCell.loadingDrawable.resetDisappear();
                        chatActionCell.loadingDrawable.setBounds(chatActionCell.giftButtonRect);
                        chatActionCell.loadingDrawable.setRadiiDp(16.0f);
                        chatActionCell.loadingDrawable.draw(canvas2);
                    } else {
                        loadingDrawable = chatActionCell.loadingDrawable;
                        if (loadingDrawable != null) {
                            loadingDrawable.setBounds(chatActionCell.giftButtonRect);
                            chatActionCell.loadingDrawable.setRadiiDp(16.0f);
                            chatActionCell.loadingDrawable.disappear();
                            chatActionCell.loadingDrawable.draw(canvas2);
                            if (chatActionCell.loadingDrawable.isDisappeared()) {
                                chatActionCell.loadingDrawable.reset();
                            }
                        }
                    }
                    canvas2.restore();
                    if (chatActionCell.backgroundRect != null) {
                        themedPaint = chatActionCell.getThemedPaint("paintChatActionBackground");
                        themedPaint2 = chatActionCell.getThemedPaint("paintChatActionBackgroundDarken");
                        fDp6 = (chatActionCell.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                        fDp7 = chatActionCell.backgroundRect.top - AndroidUtilities.dp(2.0f);
                        resourcesProvider2 = chatActionCell.themeDelegate;
                        if (resourcesProvider2 != null) {
                            resourcesProvider2.applyServiceShaderMatrix(chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp6, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp7);
                        } else {
                            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp6, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp7);
                        }
                        canvas2.save();
                        canvas2.translate(fDp6, fDp7);
                        ColorFilter colorFilter3 = themedPaint.getColorFilter();
                        PathEffect pathEffect5 = themedPaint.getPathEffect();
                        resourcesProvider3 = chatActionCell.themeDelegate;
                        if (resourcesProvider3 != null) {
                            zIsCurrentThemeDark = resourcesProvider3.isDark();
                        } else {
                            zIsCurrentThemeDark = Theme.isCurrentThemeDark();
                        }
                        if (chatActionCell.giftRibbonPaintFilter != null) {
                            colorMatrix = new ColorMatrix();
                            if (themedPaint.getColorFilter() instanceof ColorMatrixColorFilter) {
                                ((ColorMatrixColorFilter) themedPaint.getColorFilter()).getColorMatrix(colorMatrix);
                            }
                            if (zIsCurrentThemeDark) {
                                f11 = 0.1f;
                            } else {
                                f11 = -0.08f;
                            }
                            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, zIsCurrentThemeDark ? 0.15f : 0.1f);
                            chatActionCell.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                            chatActionCell.giftRibbonPaintFilterDark = zIsCurrentThemeDark;
                        } else {
                            colorMatrix = new ColorMatrix();
                            if (themedPaint.getColorFilter() instanceof ColorMatrixColorFilter) {
                                ((ColorMatrixColorFilter) themedPaint.getColorFilter()).getColorMatrix(colorMatrix);
                            }
                            if (zIsCurrentThemeDark) {
                                f11 = 0.1f;
                            } else {
                                f11 = -0.08f;
                            }
                            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, zIsCurrentThemeDark ? 0.15f : 0.1f);
                            chatActionCell.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                            chatActionCell.giftRibbonPaintFilterDark = zIsCurrentThemeDark;
                        }
                        themedPaint.setColorFilter(chatActionCell.giftRibbonPaintFilter);
                        themedPaint.setPathEffect(chatActionCell.giftRibbonPaintEffect);
                        canvas2.drawPath(chatActionCell.giftRibbonPath, themedPaint);
                        themedPaint.setColorFilter(colorFilter3);
                        themedPaint.setPathEffect(pathEffect5);
                        if (chatActionCell.hasGradientService()) {
                            PathEffect pathEffect6 = themedPaint2.getPathEffect();
                            themedPaint2.setPathEffect(chatActionCell.giftRibbonPaintEffect);
                            canvas2.drawPath(chatActionCell.giftRibbonPath, themedPaint2);
                            themedPaint2.setPathEffect(pathEffect6);
                        }
                        canvas2.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                        chatActionCell.giftRibbonText.draw(canvas2, AndroidUtilities.dp(40.43f) - (chatActionCell.giftRibbonText.getCurrentWidth() / 2.0f), AndroidUtilities.dp(26.0f), -1, 1.0f);
                        canvas2.restore();
                    }
                } else {
                    chatActionCell = this;
                }
                chatActionCell.drawReactions(canvas2, false, null);
                chatActionCell.transitionParams.recordDrawingState();
                canvas2.restore();
            }
            canvas2.save();
            this.birthdayLayout.draw(canvas2);
            canvas2.restore();
        }
        f3 = 14.0f;
        if (this.textPaint != null) {
            i2 = 22;
        } else {
            i2 = 22;
        }
        if (this.textPaint != null) {
            canvas2.save();
            canvas2.translate(this.titleXLeft, this.textY - this.titleHeight);
            if (this.titleLayout.getPaint() != this.textPaint) {
                buildLayout$1();
            }
            canvas2.save();
            SpoilerEffect.clipOutCanvas(canvas2, this.spoilers);
            SpoilerEffect.layoutDrawMaybe(canvas2, this.titleLayout);
            chatActionCellDelegate = this.delegate;
            if (chatActionCellDelegate != null) {
                StaticLayout staticLayout11 = this.titleLayout;
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans8 = this.animatedEmojiStack;
                List<SpoilerEffect> list2 = this.spoilers;
                staticLayout2 = this.textLayout;
                if (staticLayout2 == null) {
                    adaptiveEmojiColorFilter = null;
                } else {
                    adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor());
                }
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, staticLayout11, emojiGroupedSpans8, 0.0f, list2, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
            } else {
                StaticLayout staticLayout12 = this.titleLayout;
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans9 = this.animatedEmojiStack;
                List<SpoilerEffect> list3 = this.spoilers;
                staticLayout2 = this.textLayout;
                if (staticLayout2 == null) {
                    adaptiveEmojiColorFilter = null;
                } else {
                    adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor());
                }
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, staticLayout12, emojiGroupedSpans9, 0.0f, list3, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
            }
            canvas2.restore();
            while (r2.hasNext()) {
                spoilerEffect2.setColor(this.titleLayout.getPaint().getColor());
                spoilerEffect2.draw(canvas2);
            }
            canvas2.restore();
        }
        if (this.starGiftLayout.has()) {
            chatActionCell = this;
        } else {
            chatActionCell = this;
        }
        chatActionCell.drawReactions(canvas2, false, null);
        chatActionCell.transitionParams.recordDrawingState();
        canvas2.restore();
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        MessageObject messageObject = this.currentMessageObject;
        if (TextUtils.isEmpty(this.customText) && messageObject == null) {
            return;
        }
        if (this.accessibilityText == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.customText) ? this.customText : messageObject.messageText);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new AboutLinkCell.AnonymousClass5(this, characterStyle, 1), spanStart, spanEnd, 33);
            }
            this.accessibilityText = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.accessibilityText.toString());
        } else {
            accessibilityNodeInfo.setText(this.accessibilityText);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.rippleView;
        RectF rectF = this.giftButtonRect;
        view.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override
    public boolean onLongPress() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            return chatActionCellDelegate.didLongPress(this, this.lastTouchX, this.lastTouchY);
        }
        return false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        int iDp;
        float f;
        boolean z;
        int imageSize;
        TextLayout textLayout;
        int iDp2;
        float f2;
        StaticLayout staticLayout;
        float f3;
        float fDp;
        TextLayout textLayout2;
        int height;
        MessageObject messageObject;
        float f4;
        int iDp3;
        StaticLayout staticLayout2;
        float f5;
        MessageObject messageObject2;
        TLRPC.Message message;
        int measuredWidth;
        int iDp4;
        int iDp5;
        StaticLayout staticLayout3;
        int i3;
        float f6;
        int i4;
        int iDp6;
        ReactionsLayoutInBubble reactionsLayoutInBubble;
        float fM;
        StaticLayout staticLayout4;
        int height2;
        float f7;
        StaticLayout staticLayout5;
        int iDp7;
        TextLayout textLayout3;
        int iDp8;
        int i5;
        int i6;
        int iDp9;
        int i7;
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 == null && this.customText == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(14.0f) + this.topicSeparatorTopPadding + this.textHeight);
            return;
        }
        int iDp10 = 0;
        if (isButtonLayout(messageObject3)) {
            this.giftRectSize = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            if ((!AndroidUtilities.isTablet() && ((i7 = messageObject3.type) == 18 || i7 == 30 || isMessageActionSuggestedPostApproval())) || messageObject3.type == 35) {
                this.giftRectSize = (int) (this.giftRectSize * 1.2f);
            }
            this.stickerSize = this.giftRectSize - AndroidUtilities.dp(106.0f);
            if (messageObject3.type == 31) {
                this.giftRectSize = Math.min(this.giftRectSize, AndroidUtilities.dp(192.0f));
                this.stickerSize = AndroidUtilities.dp(78.0f);
            }
            if (messageObject3.type == 33) {
                this.giftRectSize = Math.min(this.giftRectSize, AndroidUtilities.dp(220.0f));
                this.stickerSize = AndroidUtilities.dp(78.0f);
            }
            if (messageObject3.type == 37) {
                this.stickerSize = AndroidUtilities.dp(52.0f);
                this.imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
            } else if (isNewStyleButtonLayout()) {
                this.imageReceiver.setRoundRadius(this.stickerSize / 2);
            } else {
                this.imageReceiver.setRoundRadius(0);
            }
        }
        int iMax = Math.max(AndroidUtilities.dp(30.0f), View.MeasureSpec.getSize(i));
        if (this.previousWidth != iMax) {
            this.wasLayout = true;
            this.previousWidth = iMax;
            buildLayout$1();
        }
        if (messageObject3 == null) {
            iDp = 0;
        } else {
            if (messageObject3.type == 11) {
                i6 = AndroidUtilities.roundMessageSize;
                iDp9 = AndroidUtilities.dp(10.0f);
            } else if (isButtonLayout(messageObject3)) {
                i6 = this.giftRectSize;
                iDp9 = AndroidUtilities.dp(12.0f);
            } else {
                iDp = 0;
            }
            iDp = iDp9 + i6;
        }
        if (this.starGiftLayout.has()) {
            iDp10 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, this.starGiftLayout.height, this.starGiftLayout.repost ? 0 : AndroidUtilities.dp(16.0f) + this.textY + this.textHeight);
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
            if (!reactionsLayoutInBubble2.isEmpty) {
                reactionsLayoutInBubble2.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble2.height;
                i5 = this.reactionsLayoutInBubble.totalHeight;
                iDp10 += i5;
            }
        } else {
            SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
            if (suggestBirthdayActionLayout != null) {
                iDp10 = AndroidUtilities.dp(12.0f) + suggestBirthdayActionLayout.height();
                ReactionsLayoutInBubble reactionsLayoutInBubble3 = this.reactionsLayoutInBubble;
                if (!reactionsLayoutInBubble3.isEmpty) {
                    reactionsLayoutInBubble3.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble3.height;
                    i5 = this.reactionsLayoutInBubble.totalHeight;
                    iDp10 += i5;
                }
            } else if (isButtonLayout(messageObject3)) {
                if (messageObject3 != null) {
                    f = 24.0f;
                    z = messageObject3.type == 25;
                    imageSize = getImageSize(messageObject3);
                    if (isNewStyleButtonLayout()) {
                        int iDp11 = AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                        if (imageSize > 0) {
                            iDp7 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(16.0f, 2, imageSize);
                        } else {
                            iDp7 = AndroidUtilities.dp(16.0f);
                        }
                        int i8 = iDp11 + iDp7;
                        textLayout3 = this.giftPremiumText;
                        if (textLayout3 == null) {
                            iDp8 = 0;
                        } else {
                            iDp8 = AndroidUtilities.dp(4.0f) + textLayout3.layout.getHeight();
                        }
                        f2 = i8 + iDp8;
                    } else {
                        float fDp2 = (this.giftRectSize * 0.075f) + this.textY + this.textHeight + imageSize + AndroidUtilities.dp(4.0f);
                        textLayout = this.giftPremiumText;
                        if (textLayout == null) {
                            iDp2 = 0;
                        } else {
                            iDp2 = AndroidUtilities.dp(4.0f) + textLayout.layout.getHeight();
                        }
                        f2 = iDp2 + fDp2;
                    }
                    this.giftPremiumAdditionalHeight = 0;
                    staticLayout = this.giftPremiumTitleLayout;
                    if (staticLayout != null) {
                        float height3 = f2 + staticLayout.getHeight();
                        if (this.giftPremiumTitleLayout.getLineCount() > 1) {
                            f3 = 8.0f;
                            this.giftPremiumAdditionalHeight = (this.giftPremiumTitleLayout.getHeight() - this.giftPremiumTitleLayout.getLineTop(1)) + this.giftPremiumAdditionalHeight;
                        } else {
                            f3 = 8.0f;
                        }
                        if (z) {
                            f7 = 6.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        fDp = height3 + AndroidUtilities.dp(f7);
                        staticLayout5 = this.giftPremiumSubtitleLayout;
                        if (staticLayout5 != null) {
                            fDp += AndroidUtilities.dp(9.0f) + staticLayout5.getHeight();
                        }
                        if (this.giftPremiumReleasedText != null) {
                            fDp += AndroidUtilities.dp(f);
                        }
                    } else {
                        f3 = 8.0f;
                        fDp = f2 - AndroidUtilities.dp(12.0f);
                        this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(30.0f);
                    }
                    textLayout2 = this.giftPremiumText;
                    if (textLayout2 == null) {
                        height = 0;
                    } else {
                        height = textLayout2.layout.getHeight();
                    }
                    if (this.giftPremiumText == null) {
                        this.giftPremiumAdditionalHeight = 0;
                    } else if (this.giftPremiumSubtitleLayout != null) {
                        this.giftPremiumAdditionalHeight = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(10.0f, height, this.giftPremiumAdditionalHeight);
                    } else {
                        messageObject = this.currentMessageObject;
                        if (messageObject.type != 18 || messageObject.isStarGiftAction()) {
                            int i9 = this.giftPremiumAdditionalHeight;
                            if (this.giftPremiumButtonLayout == null) {
                                f4 = 0.0f;
                            } else {
                                f4 = 10.0f;
                            }
                            this.giftPremiumAdditionalHeight = zzkl.m(f4, height, i9);
                        } else if (this.currentMessageObject.type == 30) {
                            this.giftPremiumAdditionalHeight = zzkl.m(20.0f, height, this.giftPremiumAdditionalHeight);
                        } else if (this.giftPremiumTextCollapsed) {
                            this.giftPremiumAdditionalHeight += height;
                        } else if (this.giftPremiumText.layout.getLineCount() > 2) {
                            this.giftPremiumAdditionalHeight = ((this.giftPremiumText.layout.getLineCount() * (this.giftPremiumText.layout.getLineBottom(0) - this.giftPremiumText.layout.getLineTop(0))) - 2) + this.giftPremiumAdditionalHeight;
                        }
                    }
                    if (this.giftPremiumReleasedText != null) {
                        this.giftPremiumAdditionalHeight = AndroidUtilities.dp(f) + this.giftPremiumAdditionalHeight;
                    }
                    int iDp12 = this.giftPremiumAdditionalHeight - AndroidUtilities.dp(z ? 14.0f : 0.0f);
                    this.giftPremiumAdditionalHeight = iDp12;
                    iDp += iDp12;
                    iDp3 = AndroidUtilities.dp(14.0f) + this.textHeight + iDp;
                    staticLayout2 = this.giftPremiumButtonLayout;
                    if (staticLayout2 != null) {
                        fM = ImageReceiver$$ExternalSyntheticOutline0.m((iDp3 - fDp) - staticLayout2.getHeight(), AndroidUtilities.dp(f3), 2.0f, fDp);
                        if (this.currentMessageObject.isStarGiftAction()) {
                            fM += AndroidUtilities.dp(4.0f);
                        }
                        float f8 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                        RectF rectF = this.giftButtonRect;
                        float fDp3 = f8 - AndroidUtilities.dp(18.0f);
                        float fDp4 = fM - AndroidUtilities.dp(f3);
                        f5 = 2.0f;
                        float fDp5 = f8 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f);
                        staticLayout4 = this.giftPremiumButtonLayout;
                        if (staticLayout4 != null) {
                            height2 = staticLayout4.getHeight();
                        } else {
                            height2 = 0;
                        }
                        rectF.set(fDp3, fDp4, fDp5, fM + height2 + AndroidUtilities.dp(f3));
                    } else {
                        f5 = 2.0f;
                        iDp -= AndroidUtilities.dp(40.0f);
                        this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(40.0f);
                        messageObject2 = this.currentMessageObject;
                        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            iDp -= AndroidUtilities.dp(f3);
                            this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(f3);
                        }
                    }
                    measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                    this.starParticlesDrawable.rect.set(this.giftButtonRect);
                    this.starParticlesDrawable.rect2.set(this.giftButtonRect);
                    if (this.starsSize != measuredWidth) {
                        this.starsSize = measuredWidth;
                        this.starParticlesDrawable.resetPositions();
                    }
                    if (isNewStyleButtonLayout()) {
                        iDp4 = AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                        this.backgroundRectHeight = 0;
                        if (imageSize > 0) {
                            iDp5 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(16.0f, 2, imageSize);
                        } else {
                            iDp5 = AndroidUtilities.dp(16.0f);
                        }
                        this.backgroundRectHeight = iDp5;
                        staticLayout3 = this.giftPremiumSubtitleLayout;
                        if (staticLayout3 != null) {
                            this.backgroundRectHeight = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(10.0f, staticLayout3.getHeight(), iDp5);
                        }
                        if (this.giftPremiumReleasedText != null) {
                            this.backgroundRectHeight = AndroidUtilities.dp(15.0f) + this.backgroundRectHeight;
                        }
                        i3 = this.backgroundRectHeight + height;
                        this.backgroundRectHeight = i3;
                        f6 = (this.previousWidth - this.giftPremiumButtonWidth) / f5;
                        if (this.giftPremiumButtonLayout != null) {
                            this.backgroundButtonTop = AndroidUtilities.dp(7.0f) + i3 + iDp4;
                            this.giftButtonRect.set(f6 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f6 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(8.0f, 2, this.giftPremiumButtonLayout.getHeight() + this.backgroundButtonTop));
                            this.backgroundRectHeight = (int) (this.giftButtonRect.height() + AndroidUtilities.dp(4.0f) + this.backgroundRectHeight);
                        } else if (!isMessageActionSuggestedPostApproval() && (i4 = messageObject3.type) != 34 && i4 != 33 && i4 != 35) {
                            this.giftButtonRect.set(f6 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f6 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(8.0f, 2, AndroidUtilities.dp(17.0f) + this.backgroundButtonTop));
                            this.backgroundRectHeight = AndroidUtilities.dp(17.0f) + this.backgroundRectHeight;
                        }
                        int iDp13 = AndroidUtilities.dp(15.0f) + this.backgroundRectHeight;
                        this.backgroundRectHeight = iDp13;
                        iDp6 = AndroidUtilities.dp(6.0f) + iDp4 + iDp13;
                        reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                        if (!reactionsLayoutInBubble.isEmpty) {
                            reactionsLayoutInBubble.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble.height;
                            iDp6 += this.reactionsLayoutInBubble.totalHeight;
                        }
                        iDp10 = iDp6;
                        if (this.botInlineButtons != null) {
                            iDp10 += AndroidUtilities.dp(44.0f);
                        }
                    }
                    this.giftButtonRect.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
                } else {
                    f = 24.0f;
                }
                imageSize = getImageSize(messageObject3);
                if (isNewStyleButtonLayout()) {
                    int iDp14 = AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                    if (imageSize > 0) {
                        iDp7 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(16.0f, 2, imageSize);
                    } else {
                        iDp7 = AndroidUtilities.dp(16.0f);
                    }
                    int i10 = iDp14 + iDp7;
                    textLayout3 = this.giftPremiumText;
                    if (textLayout3 == null) {
                        iDp8 = 0;
                    } else {
                        iDp8 = AndroidUtilities.dp(4.0f) + textLayout3.layout.getHeight();
                    }
                    f2 = i10 + iDp8;
                } else {
                    float fDp6 = (this.giftRectSize * 0.075f) + this.textY + this.textHeight + imageSize + AndroidUtilities.dp(4.0f);
                    textLayout = this.giftPremiumText;
                    if (textLayout == null) {
                        iDp2 = 0;
                    } else {
                        iDp2 = AndroidUtilities.dp(4.0f) + textLayout.layout.getHeight();
                    }
                    f2 = iDp2 + fDp6;
                }
                this.giftPremiumAdditionalHeight = 0;
                staticLayout = this.giftPremiumTitleLayout;
                if (staticLayout != null) {
                    float height4 = f2 + staticLayout.getHeight();
                    if (this.giftPremiumTitleLayout.getLineCount() > 1) {
                        f3 = 8.0f;
                        this.giftPremiumAdditionalHeight = (this.giftPremiumTitleLayout.getHeight() - this.giftPremiumTitleLayout.getLineTop(1)) + this.giftPremiumAdditionalHeight;
                    } else {
                        f3 = 8.0f;
                    }
                    if (z) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    fDp = height4 + AndroidUtilities.dp(f7);
                    staticLayout5 = this.giftPremiumSubtitleLayout;
                    if (staticLayout5 != null) {
                        fDp += AndroidUtilities.dp(9.0f) + staticLayout5.getHeight();
                    }
                    if (this.giftPremiumReleasedText != null) {
                        fDp += AndroidUtilities.dp(f);
                    }
                } else {
                    f3 = 8.0f;
                    fDp = f2 - AndroidUtilities.dp(12.0f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(30.0f);
                }
                textLayout2 = this.giftPremiumText;
                if (textLayout2 == null) {
                    height = 0;
                } else {
                    height = textLayout2.layout.getHeight();
                }
                if (this.giftPremiumText == null) {
                    this.giftPremiumAdditionalHeight = 0;
                } else if (this.giftPremiumSubtitleLayout != null) {
                    this.giftPremiumAdditionalHeight = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(10.0f, height, this.giftPremiumAdditionalHeight);
                } else {
                    messageObject = this.currentMessageObject;
                    if (messageObject.type != 18) {
                        int i11 = this.giftPremiumAdditionalHeight;
                        if (this.giftPremiumButtonLayout == null) {
                            f4 = 0.0f;
                        } else {
                            f4 = 10.0f;
                        }
                        this.giftPremiumAdditionalHeight = zzkl.m(f4, height, i11);
                    } else {
                        int i12 = this.giftPremiumAdditionalHeight;
                        if (this.giftPremiumButtonLayout == null) {
                            f4 = 0.0f;
                        } else {
                            f4 = 10.0f;
                        }
                        this.giftPremiumAdditionalHeight = zzkl.m(f4, height, i12);
                    }
                }
                if (this.giftPremiumReleasedText != null) {
                    this.giftPremiumAdditionalHeight = AndroidUtilities.dp(f) + this.giftPremiumAdditionalHeight;
                }
                int iDp15 = this.giftPremiumAdditionalHeight - AndroidUtilities.dp(z ? 14.0f : 0.0f);
                this.giftPremiumAdditionalHeight = iDp15;
                iDp += iDp15;
                iDp3 = AndroidUtilities.dp(14.0f) + this.textHeight + iDp;
                staticLayout2 = this.giftPremiumButtonLayout;
                if (staticLayout2 != null) {
                    fM = ImageReceiver$$ExternalSyntheticOutline0.m((iDp3 - fDp) - staticLayout2.getHeight(), AndroidUtilities.dp(f3), 2.0f, fDp);
                    if (this.currentMessageObject.isStarGiftAction()) {
                        fM += AndroidUtilities.dp(4.0f);
                    }
                    float f9 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    RectF rectF2 = this.giftButtonRect;
                    float fDp7 = f9 - AndroidUtilities.dp(18.0f);
                    float fDp8 = fM - AndroidUtilities.dp(f3);
                    f5 = 2.0f;
                    float fDp9 = f9 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f);
                    staticLayout4 = this.giftPremiumButtonLayout;
                    if (staticLayout4 != null) {
                        height2 = staticLayout4.getHeight();
                    } else {
                        height2 = 0;
                    }
                    rectF2.set(fDp7, fDp8, fDp9, fM + height2 + AndroidUtilities.dp(f3));
                } else {
                    f5 = 2.0f;
                    iDp -= AndroidUtilities.dp(40.0f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(40.0f);
                    messageObject2 = this.currentMessageObject;
                    if (messageObject2 != null) {
                        iDp -= AndroidUtilities.dp(f3);
                        this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(f3);
                    }
                }
                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                this.starParticlesDrawable.rect.set(this.giftButtonRect);
                this.starParticlesDrawable.rect2.set(this.giftButtonRect);
                if (this.starsSize != measuredWidth) {
                    this.starsSize = measuredWidth;
                    this.starParticlesDrawable.resetPositions();
                }
                if (isNewStyleButtonLayout()) {
                    iDp4 = AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                    this.backgroundRectHeight = 0;
                    if (imageSize > 0) {
                        iDp5 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(16.0f, 2, imageSize);
                    } else {
                        iDp5 = AndroidUtilities.dp(16.0f);
                    }
                    this.backgroundRectHeight = iDp5;
                    staticLayout3 = this.giftPremiumSubtitleLayout;
                    if (staticLayout3 != null) {
                        this.backgroundRectHeight = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(10.0f, staticLayout3.getHeight(), iDp5);
                    }
                    if (this.giftPremiumReleasedText != null) {
                        this.backgroundRectHeight = AndroidUtilities.dp(15.0f) + this.backgroundRectHeight;
                    }
                    i3 = this.backgroundRectHeight + height;
                    this.backgroundRectHeight = i3;
                    f6 = (this.previousWidth - this.giftPremiumButtonWidth) / f5;
                    if (this.giftPremiumButtonLayout != null) {
                        this.backgroundButtonTop = AndroidUtilities.dp(7.0f) + i3 + iDp4;
                        this.giftButtonRect.set(f6 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f6 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(8.0f, 2, this.giftPremiumButtonLayout.getHeight() + this.backgroundButtonTop));
                        this.backgroundRectHeight = (int) (this.giftButtonRect.height() + AndroidUtilities.dp(4.0f) + this.backgroundRectHeight);
                    } else if (!isMessageActionSuggestedPostApproval()) {
                        this.giftButtonRect.set(f6 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f6 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(8.0f, 2, AndroidUtilities.dp(17.0f) + this.backgroundButtonTop));
                        this.backgroundRectHeight = AndroidUtilities.dp(17.0f) + this.backgroundRectHeight;
                    }
                    int iDp16 = AndroidUtilities.dp(15.0f) + this.backgroundRectHeight;
                    this.backgroundRectHeight = iDp16;
                    iDp6 = AndroidUtilities.dp(6.0f) + iDp4 + iDp16;
                    reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                    if (!reactionsLayoutInBubble.isEmpty) {
                        reactionsLayoutInBubble.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble.height;
                        iDp6 += this.reactionsLayoutInBubble.totalHeight;
                    }
                    iDp10 = iDp6;
                    if (this.botInlineButtons != null) {
                        iDp10 += AndroidUtilities.dp(44.0f);
                    }
                }
                this.giftButtonRect.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
            }
        }
        if (this.currentMessageObject != null) {
            ReactionsLayoutInBubble reactionsLayoutInBubble4 = this.reactionsLayoutInBubble;
            if (!reactionsLayoutInBubble4.isEmpty) {
                reactionsLayoutInBubble4.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble4.height;
                iDp += this.reactionsLayoutInBubble.totalHeight;
            }
        }
        if (isMessageActionSuggestedPostApproval()) {
            iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(24.0f, this.titleHeight, iDp);
        }
        if (messageObject3 == null || !isNewStyleButtonLayout()) {
            setMeasuredDimension(iMax, AndroidUtilities.dp(14.0f) + this.topicSeparatorTopPadding + this.textHeight + iDp);
        } else {
            setMeasuredDimension(iMax, this.topicSeparatorTopPadding + iDp10);
        }
        this.reactionsLayoutInBubble.y = (getMeasuredHeight() - getPaddingTop()) - this.reactionsLayoutInBubble.totalHeight;
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.type != 11) {
            return;
        }
        int size = messageObject.photoThumbs.size();
        for (int i = 0; i < size; i++) {
            photoSize = messageObject.photoThumbs.get(i);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                this.imageReceiver.setImage(this.currentVideoLocation, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.avatarDrawable, 0L, null, messageObject, 1);
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            }
        }
        photoSize = null;
        this.imageReceiver.setImage(this.currentVideoLocation, "g", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.avatarDrawable, 0L, null, messageObject, 1);
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        SuggestBirthdayActionLayout suggestBirthdayActionLayout;
        float f;
        ImageUpdater imageUpdater;
        TextLayout textLayout;
        TextLayout textLayout2;
        TLRPC.Message message;
        boolean z;
        int i;
        BotInlineKeyboard.ButtonCustom buttonCustom;
        StaticLayout staticLayout;
        ArrayList arrayList;
        boolean z2;
        char c;
        TLRPC.Message message2;
        int i2;
        MessageObject messageObject = this.currentMessageObject;
        float x = motionEvent.getX() - (this.sideMenuWidth / 2.0f);
        this.lastTouchX = x;
        float y = motionEvent.getY() + getPaddingTop();
        this.lastTouchY = y;
        boolean z3 = true;
        if (messageObject == null) {
            if (this.onActionClick != null) {
                if (motionEvent.getAction() == 0) {
                    if (x >= this.backgroundLeft && x <= this.backgroundRight) {
                        this.actionPressed = true;
                        return true;
                    }
                } else if (this.actionPressed) {
                    if (motionEvent.getAction() == 1) {
                        this.onActionClick.onClick(this);
                        this.actionPressed = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.actionPressed = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        TopicSeparator topicSeparator = this.topicSeparator;
        if ((topicSeparator == null || !topicSeparator.onTouchEvent(motionEvent, false)) && (((suggestBirthdayActionLayout = this.birthdayLayout) == null || !suggestBirthdayActionLayout.onTouchEvent(motionEvent)) && ((!this.starGiftLayout.has() || !this.starGiftLayout.onTouchEvent(motionEvent, this.starGiftLayoutX, this.starGiftLayoutY)) && !this.reactionsLayoutInBubble.checkTouchEvent(motionEvent)))) {
            if (motionEvent.getAction() != 0) {
                f = 2.0f;
                if (motionEvent.getAction() != 2) {
                    cancelCheckLongPress();
                }
                if (this.actionPressed) {
                    if (motionEvent.getAction() == 2) {
                        if (x < this.backgroundLeft || x > this.backgroundRight) {
                            z = false;
                            this.actionPressed = false;
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View.OnClickListener onClickListener = this.onActionClick;
                        if (onClickListener != null) {
                            onClickListener.onClick(this);
                        }
                        this.actionPressed = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.actionPressed = false;
                    }
                    z = false;
                } else if (this.textPressed) {
                    int action = motionEvent.getAction();
                    if (action == 1) {
                        View view = this.rippleView;
                        this.textPressed = false;
                        view.setPressed(false);
                        this.bounce.setPressed(false);
                        if (this.delegate != null && messageObject.replyMessageObject != null && (message = messageObject.messageOwner) != null && TlUtils.isInstance(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                            this.delegate.didPressReplyMessage(this, this.currentMessageObject.getReplyMsgId());
                        } else if (this.giftPremiumTextCollapsed && !this.giftPremiumTextUncollapsed && (textLayout2 = this.giftPremiumText) != null) {
                            int height = textLayout2.layout.getHeight() - this.giftPremiumTextCollapsedHeight;
                            this.giftPremiumTextUncollapsed = true;
                            ChatActionCellDelegate chatActionCellDelegate = this.delegate;
                            if (chatActionCellDelegate != null) {
                                chatActionCellDelegate.forceUpdate(this, false);
                                if (getParent() instanceof RecyclerListView) {
                                    ((RecyclerListView) getParent()).smoothScrollBy(0, AndroidUtilities.dp(24.0f) + height);
                                    return true;
                                }
                            }
                        } else if (this.birthdayLayout != null && this.backgroundRect.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.birthdayLayout.open();
                            return true;
                        }
                    } else if (action == 2) {
                        TextLayout textLayout3 = this.giftPremiumText;
                        if (textLayout3 == null || !this.giftPremiumTextCollapsed) {
                            this.textPressed = false;
                        } else {
                            RectF rectF = AndroidUtilities.rectTmp;
                            float f2 = textLayout3.x;
                            float f3 = textLayout3.y;
                            float width = textLayout3.layout.getWidth() + f2;
                            TextLayout textLayout4 = this.giftPremiumText;
                            rectF.set(f2, f3, width, textLayout4.y + textLayout4.layout.getHeight());
                            if (!rectF.contains(x, y)) {
                                this.textPressed = false;
                            }
                        }
                        z = true;
                    } else if (action == 3) {
                        this.textPressed = false;
                        this.bounce.setPressed(false);
                    }
                    z = false;
                } else {
                    if (this.giftButtonPressed) {
                        int action2 = motionEvent.getAction();
                        if (action2 == 1) {
                            this.imagePressed = false;
                            View view2 = this.rippleView;
                            this.giftButtonPressed = false;
                            view2.setPressed(false);
                            this.bounce.setPressed(false);
                            if (this.delegate != null) {
                                int i3 = messageObject.type;
                                if (i3 == 37) {
                                    playSoundEffect(0);
                                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                    if (safeLastFragment != null) {
                                        new CommunitySheet(safeLastFragment, ((TLRPC.TL_messageActionChangeCommunity) messageObject.messageOwner.action).community_id, null, null).show();
                                    }
                                } else if (i3 == 31) {
                                    playSoundEffect(0);
                                    openStarsGiftTransaction();
                                } else if (i3 == 25) {
                                    playSoundEffect(0);
                                    openPremiumGiftChannel();
                                } else if (i3 == 18) {
                                    playSoundEffect(0);
                                    openPremiumGiftPreview();
                                } else if (i3 == 30) {
                                    playSoundEffect(0);
                                    openStarsGiftTransaction();
                                } else {
                                    TLRPC.Message message3 = messageObject.messageOwner;
                                    if (message3 != null) {
                                        TLRPC.MessageAction messageAction = message3.action;
                                        if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                            playSoundEffect(0);
                                            MessageSuggestionParams messageSuggestionParamsObtainSuggestionOffer = this.currentMessageObject.obtainSuggestionOffer();
                                            AmountUtils$Amount amountUtils$Amount = messageSuggestionParamsObtainSuggestionOffer.amount;
                                            if (amountUtils$Amount != null && amountUtils$Amount.currency == AmountUtils$Currency.STARS) {
                                                new StarsIntroActivity.StarsNeededSheet(getContext(), this.themeDelegate, messageSuggestionParamsObtainSuggestionOffer.amount.nanos / 1000000000, 13, ForumUtilities.getMonoForumTitle(this.currentAccount, this.currentMessageObject.getDialogId()), null, this.currentMessageObject.getDialogId()).show();
                                            }
                                        } else if (MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id) == null) {
                                            if (this.buttonClickableAsImage) {
                                                this.delegate.didClickImage(this);
                                            } else {
                                                this.delegate.didClickButton(this);
                                            }
                                        }
                                    } else if (MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id) == null) {
                                        if (this.buttonClickableAsImage) {
                                            this.delegate.didClickImage(this);
                                        } else {
                                            this.delegate.didClickButton(this);
                                        }
                                    }
                                }
                            }
                        } else if (action2 != 2) {
                            if (action2 == 3) {
                                this.imagePressed = false;
                                View view3 = this.rippleView;
                                this.giftButtonPressed = false;
                                view3.setPressed(false);
                                this.bounce.setPressed(false);
                            }
                        } else if (!isButtonLayout(messageObject) || (!this.giftButtonRect.contains(x, y) && !this.backgroundRect.contains(x, y))) {
                            View view4 = this.rippleView;
                            this.giftButtonPressed = false;
                            view4.setPressed(false);
                            this.bounce.setPressed(false);
                        }
                    } else if (this.imagePressed) {
                        int action3 = motionEvent.getAction();
                        if (action3 == 1) {
                            this.imagePressed = false;
                            if (!this.giftPremiumTextCollapsed || this.giftPremiumTextUncollapsed || (textLayout = this.giftPremiumText) == null) {
                                int i4 = messageObject.type;
                                if (i4 == 31) {
                                    openStarsGiftTransaction();
                                } else if (i4 == 25) {
                                    openPremiumGiftChannel();
                                } else if (i4 == 18) {
                                    openPremiumGiftPreview();
                                } else if (i4 == 30) {
                                    openStarsGiftTransaction();
                                } else if (this.delegate != null) {
                                    if (i4 != 21 || (imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id)) == null) {
                                        this.delegate.didClickImage(this);
                                        playSoundEffect(0);
                                    } else {
                                        imageUpdater.cancel();
                                    }
                                }
                            } else {
                                int height2 = textLayout.layout.getHeight() - this.giftPremiumTextCollapsedHeight;
                                this.giftPremiumTextUncollapsed = true;
                                ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
                                if (chatActionCellDelegate2 != null) {
                                    chatActionCellDelegate2.forceUpdate(this, false);
                                    if (getParent() instanceof RecyclerListView) {
                                        ((RecyclerListView) getParent()).smoothScrollBy(0, AndroidUtilities.dp(16.0f) + height2);
                                    }
                                }
                            }
                        } else if (action3 != 2) {
                            if (action3 == 3) {
                                this.imagePressed = false;
                            }
                        } else if (isNewStyleButtonLayout()) {
                            if (!this.backgroundRect.contains(x, y)) {
                                this.imagePressed = false;
                            }
                        } else if (!this.imageReceiver.isInsideImage(x, y)) {
                            this.imagePressed = false;
                        }
                    }
                    z = false;
                }
            } else if (this.delegate != null) {
                f = 2.0f;
                if ((messageObject.type == 11 || isButtonLayout(messageObject)) && this.imageReceiver.isInsideImage(x, y)) {
                    this.imagePressed = true;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.radialProgress.getIcon() == 4 && (((i2 = messageObject.type) == 21 || i2 == 22) && this.backgroundRect.contains(x, y))) {
                    this.imagePressed = true;
                    z2 = true;
                }
                TextLayout textLayout5 = this.giftPremiumText;
                if (textLayout5 == null || !this.giftPremiumTextCollapsed) {
                    c = 0;
                } else {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f4 = textLayout5.x;
                    float f5 = textLayout5.y;
                    float width2 = textLayout5.layout.getWidth() + f4;
                    TextLayout textLayout6 = this.giftPremiumText;
                    c = 0;
                    rectF2.set(f4, f5, width2, textLayout6.y + textLayout6.layout.getHeight());
                    if (rectF2.contains(x, y)) {
                        this.textPressed = true;
                        z2 = true;
                    }
                }
                if (isButtonLayout(messageObject) && this.giftPremiumButtonLayout != null && (this.giftButtonRect.contains(x, y) || (this.buttonClickableAsImage && this.backgroundRect.contains(x, y)))) {
                    View view5 = this.rippleView;
                    this.giftButtonPressed = true;
                    view5.setPressed(true);
                    this.bounce.setPressed(true);
                    z2 = true;
                }
                if (!z2 && isMessageActionSuggestedPostApproval()) {
                    this.textPressed = true;
                    z2 = true;
                }
                if (!z2) {
                    MessageObject messageObject2 = this.currentMessageObject;
                    TLRPC.MessageAction messageAction2 = (messageObject2 == null || (message2 = messageObject2.messageOwner) == null) ? null : message2.action;
                    Class[] clsArr = new Class[2];
                    clsArr[c] = TLRPC.TL_messageActionSuggestedPostRefund.class;
                    clsArr[1] = TLRPC.TL_messageActionSuggestedPostSuccess.class;
                    if (TlUtils.isInstance(messageAction2, clsArr)) {
                        this.textPressed = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    startCheckLongPress();
                }
                z = z2;
            } else {
                f = 2.0f;
                z = false;
            }
            if (!z && (motionEvent.getAction() == 0 || ((this.pressedLink != null || this.spoilerPressed != null) && motionEvent.getAction() == 1))) {
                TextLayout textLayout7 = this.giftPremiumText;
                if (textLayout7 != null && (arrayList = textLayout7.spoilers) != null && !arrayList.isEmpty() && !this.isSpoilerRevealing) {
                    ArrayList arrayList2 = this.giftPremiumText.spoilers;
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList2.get(i5);
                        i5++;
                        SpoilerEffect spoilerEffect = (SpoilerEffect) obj;
                        Rect bounds = spoilerEffect.getBounds();
                        TextLayout textLayout8 = this.giftPremiumText;
                        if (bounds.contains((int) (x - textLayout8.x), (int) (y - textLayout8.y))) {
                            this.pressedLink = null;
                            if (motionEvent.getAction() == 0) {
                                this.spoilerPressed = spoilerEffect;
                            } else {
                                SpoilerEffect spoilerEffect2 = this.spoilerPressed;
                                if (spoilerEffect == spoilerEffect2) {
                                    this.isSpoilerRevealing = true;
                                    spoilerEffect2.onRippleEndCallback = new ChatActionCell$$ExternalSyntheticLambda3(this, 4);
                                    float fSqrt = (float) Math.sqrt(Math.pow(this.giftPremiumText.layout.getHeight(), 2.0d) + Math.pow(this.giftPremiumText.layout.getWidth(), 2.0d));
                                    SpoilerEffect spoilerEffect3 = this.spoilerPressed;
                                    TextLayout textLayout9 = this.giftPremiumText;
                                    spoilerEffect3.startRipple((int) (x - textLayout9.x), (int) (y - textLayout9.y), fSqrt, false);
                                    invalidate();
                                }
                            }
                            z = true;
                            break;
                        }
                    }
                }
                if (z || (staticLayout = this.textLayout) == null) {
                    this.pressedLink = null;
                } else {
                    int i6 = this.textX;
                    if (x >= i6) {
                        int i7 = this.textY;
                        float f6 = i7;
                        if (y < f6 || x > i6 + this.textWidth || y > i7 + this.textHeight) {
                            this.pressedLink = null;
                        } else {
                            float f7 = y - f6;
                            float f8 = x - this.textXLeft;
                            if (!z) {
                                int lineForVertical = staticLayout.getLineForVertical((int) f7);
                                int offsetForHorizontal = this.textLayout.getOffsetForHorizontal(lineForVertical, f8);
                                float lineLeft = this.textLayout.getLineLeft(lineForVertical);
                                if (lineLeft > f8 || this.textLayout.getLineWidth(lineForVertical) + lineLeft < f8) {
                                    this.pressedLink = null;
                                } else {
                                    CharSequence charSequence = messageObject.messageText;
                                    if (charSequence instanceof Spannable) {
                                        URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                        if (uRLSpanArr.length != 0) {
                                            if (motionEvent.getAction() == 0) {
                                                this.pressedLink = uRLSpanArr[0];
                                            } else {
                                                URLSpan uRLSpan = uRLSpanArr[0];
                                                URLSpan uRLSpan2 = this.pressedLink;
                                                if (uRLSpan == uRLSpan2) {
                                                    openLink(uRLSpan2);
                                                }
                                            }
                                            z = true;
                                        } else {
                                            this.pressedLink = null;
                                        }
                                    } else {
                                        this.pressedLink = null;
                                    }
                                }
                            }
                        }
                    } else {
                        this.pressedLink = null;
                    }
                }
            }
            if (z) {
                z3 = z;
            } else if (this.botButtons.isEmpty()) {
                z3 = false;
            } else {
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                float width3 = (getWidth() - this.giftRectSize) / f;
                float fDp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.textY + this.textHeight + this.backgroundRectHeight;
                float fDp2 = (this.giftRectSize - AndroidUtilities.dp(4.0f)) / f;
                if (motionEvent.getAction() == 0) {
                    this.pressedBotButton = -1;
                    for (int i8 = 0; i8 < this.botButtons.size(); i8++) {
                        BotButton botButton = this.botButtons.get(i8);
                        float fDp3 = ((AndroidUtilities.dp(4.0f) + fDp2) * i8) + width3;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(fDp3, fDp, fDp3 + fDp2, botButton.height + fDp);
                        float f9 = x2;
                        float f10 = y2;
                        if (rectF3.contains(f9, f10)) {
                            this.pressedBotButton = i8;
                            invalidateOutbounds();
                            if (botButton.selectorDrawable == null) {
                                BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_chat_serviceBackgroundSelector, this.themeDelegate), 6, 6);
                                botButton.selectorDrawable = rippleDrawableSafeCreateRadSelectorDrawable;
                                rippleDrawableSafeCreateRadSelectorDrawable.setCallback(this);
                            }
                            botButton.selectorDrawable.setHotspot(f9, f10);
                            botButton.selectorDrawable.setState(this.pressedState);
                            botButton.setPressed(!botButton.isLocked);
                        }
                    }
                } else if (motionEvent.getAction() != 1) {
                    if (motionEvent.getAction() == 3 && (i = this.pressedBotButton) != -1) {
                        BotButton botButton2 = this.botButtons.get(i);
                        BaseCell.RippleDrawableSafe rippleDrawableSafe = botButton2.selectorDrawable;
                        if (rippleDrawableSafe != null) {
                            rippleDrawableSafe.setState(StateSet.NOTHING);
                        }
                        botButton2.setPressed(false);
                        this.pressedBotButton = -1;
                        invalidateOutbounds();
                    }
                    z3 = false;
                } else if (this.pressedBotButton != -1) {
                    playSoundEffect(0);
                    BotButton botButton3 = this.botButtons.get(this.pressedBotButton);
                    BaseCell.RippleDrawableSafe rippleDrawableSafe2 = botButton3.selectorDrawable;
                    if (rippleDrawableSafe2 != null) {
                        rippleDrawableSafe2.setState(StateSet.NOTHING);
                    }
                    botButton3.setPressed(false);
                    if (this.delegate != null && !botButton3.isLocked && (buttonCustom = botButton3.buttonCustom) != null) {
                        didPressCustomBotButton(buttonCustom);
                    }
                    this.pressedBotButton = -1;
                    invalidateOutbounds();
                }
                z3 = false;
            }
            return !z3 ? super.onTouchEvent(motionEvent) : z3;
        }
        return true;
    }

    public final void openLink(CharacterStyle characterStyle) {
        if (this.delegate == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.delegate.didPressTaskLink(this, this.currentMessageObject.getReplyMsgId(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.pressedLink;
            if (uRLSpan instanceof URLSpanNoUnderline) {
                TLObject object = ((URLSpanNoUnderline) uRLSpan).getObject();
                if (object instanceof TLRPC.TL_forumTopic) {
                    ForumUtilities.openTopic(this.delegate.getBaseFragment(), -this.delegate.getDialogId(), (TLRPC.TL_forumTopic) object, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.pressedLink;
            if (uRLSpan2 instanceof URLSpanNoUnderline) {
                TLObject object2 = ((URLSpanNoUnderline) uRLSpan2).getObject();
                if (object2 instanceof TLRPC.TL_chatInviteExported) {
                    this.delegate.needOpenInviteLink((TLRPC.TL_chatInviteExported) object2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.delegate.didPressReplyMessage(this, this.currentMessageObject.getReplyMsgId());
        } else if (url.startsWith("http")) {
            Browser.openUrl(getContext(), url);
        } else {
            this.delegate.needOpenUserProfile(Long.parseLong(url));
        }
    }

    public final void openPremiumGiftChannel() {
        if (this.delegate != null) {
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(0, this, (TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action));
        }
    }

    public final void openPremiumGiftPreview() {
        String str;
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        TLRPC.Message message = this.currentMessageObject.messageOwner;
        TLRPC.MessageAction messageAction = message.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        boolean z = messageAction instanceof TLRPC.TL_messageActionGiftCode;
        if (z) {
            if (((z || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                str = null;
            } else {
                str = ((TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action).slug;
            }
        } else {
            str = null;
        }
        if (this.delegate != null) {
            AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(this, tL_premiumGiftOption, str, 2));
        }
    }

    public final void openStarsGiftTransaction() {
        TLRPC.Message message;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionGiftStars) {
            Context context = getContext();
            int i = this.currentAccount;
            TLRPC.Message message2 = this.currentMessageObject.messageOwner;
            int i2 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            Theme.ResourcesProvider resourcesProvider = this.avatarStoryParams.resourcesProvider;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i2;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            StarsIntroActivity.showTransactionSheet(context, false, 0L, i, starsTransaction, resourcesProvider);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            int i3 = this.currentAccount;
            TLRPC.Message message3 = this.currentMessageObject.messageOwner;
            int i4 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            Theme.ResourcesProvider resourcesProvider2 = this.avatarStoryParams.resourcesProvider;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i4;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= 8192;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            StarsIntroActivity.showTransactionSheet(context2, false, 0L, i3, starsTransaction2, resourcesProvider2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            int i5 = this.currentAccount;
            TLRPC.Message message4 = this.currentMessageObject.messageOwner;
            int i6 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            Theme.ResourcesProvider resourcesProvider3 = this.avatarStoryParams.resourcesProvider;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i6;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            StarsIntroActivity.showTransactionSheet(context3, false, 0L, i5, starsTransaction3, resourcesProvider3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            StarGiftSheet starGiftSheet = new StarGiftSheet(this.currentAccount, getContext(), this.themeDelegate, this.currentMessageObject.getDialogId(), null);
            starGiftSheet.set(this.currentMessageObject, (StarsController.IGiftsList) null);
            starGiftSheet.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment == null) {
                    return;
                }
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.UniqueGiftNotFoundBurned, BulletinFactory.of(safeLastFragment), R.raw.fire_on);
                return;
            }
            StarGiftSheet starGiftSheet2 = new StarGiftSheet(this.currentAccount, getContext(), this.themeDelegate, this.currentMessageObject.getDialogId(), null);
            starGiftSheet2.set(this.currentMessageObject, (StarsController.IGiftsList) null);
            starGiftSheet2.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    StarGiftSheet starGiftSheet3 = new StarGiftSheet(this.currentAccount, getContext(), this.themeDelegate, this.currentMessageObject.getDialogId(), null);
                    starGiftSheet3.set(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    starGiftSheet3.show();
                }
            }
        }
    }

    @Override
    public void setAnimationRunning(boolean z, boolean z2) {
    }

    public void setCustomDate(int i, boolean z, boolean z2) {
        String dateChat;
        int i2 = this.customDate;
        if (i2 == i || i2 / 3600 == i / 3600) {
            return;
        }
        if (z) {
            dateChat = i == 2147483646 ? LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline) : LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i));
        } else {
            dateChat = LocaleController.formatDateChat(i);
        }
        this.customDate = i;
        CharSequence charSequence = this.customText;
        if (charSequence == null || !TextUtils.equals(dateChat, charSequence)) {
            this.customText = dateChat;
            this.accessibilityText = null;
            updateTextInternal(z2);
        }
    }

    public void setCustomText(CharSequence charSequence) {
        this.customText = charSequence;
        if (charSequence != null) {
            updateTextInternal(false);
        }
    }

    public void setDelegate(ChatActionCellDelegate chatActionCellDelegate) {
        this.delegate = chatActionCellDelegate;
    }

    public void setInvalidateColors(boolean z) {
        if (this.invalidateColors == z) {
            return;
        }
        this.invalidateColors = z;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.invalidateListener = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.invalidateWithParent = view;
    }

    public void setInvalidatesParent(boolean z) {
        this.invalidatesParent = z;
    }

    public void setMessageObject(MessageObject messageObject) {
        setMessageObject(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.onActionClick = onClickListener;
    }

    public void setOverrideColor(int i, int i2) {
        this.overrideBackground = i;
        this.overrideText = i2;
    }

    public void setOverrideTextMaxWidth(int i) {
        this.overriddenMaxWidth = i;
    }

    public void setScrimReaction(Integer num) {
        this.reactionsLayoutInBubble.scrimViewReaction = num;
    }

    public void setShowTopic(boolean z) {
        if (this.showTopicSeparator != z) {
            this.showTopicSeparator = z;
            invalidateOutbounds();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        Iterator<SpoilerEffect> it = this.spoilers.iterator();
        while (it.hasNext()) {
            it.next().invalidateSelf();
        }
    }

    public void setVisiblePart(float f, int i) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
        this.viewTranslationX = 0.0f;
    }

    @Override
    public boolean shouldDrawAlphaLayer() {
        return false;
    }

    public boolean showingCancelButton() {
        RadialProgress2 radialProgress2 = this.radialProgress;
        return radialProgress2 != null && radialProgress2.getIcon() == 3;
    }

    public final void updateTextInternal(boolean z) {
        if (getMeasuredWidth() != 0) {
            createLayout(this.customText, getMeasuredWidth());
            invalidate();
        }
        if (this.wasLayout) {
            buildLayout$1();
        } else if (z) {
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda3(this, 1));
        } else {
            requestLayout();
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.wallpaperPreviewDrawable || super.verifyDrawable(drawable);
    }

    @Override
    public boolean willRemovedAfterAnimation() {
        return false;
    }

    public ChatActionCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.bounce = new ButtonBounce(this);
        this.currentAccount = UserConfig.selectedAccount;
        this.avatarStoryParams = new StoriesUtilities.AvatarStoryParams(false, null);
        this.showTopicSeparator = true;
        this.giftButtonRect = new RectF();
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.reactionsLayoutInBubble = new ReactionsLayoutInBubble(this);
        this.overrideBackground = -1;
        this.overrideText = -1;
        this.lineWidths = new ArrayList<>();
        this.lineHeights = new ArrayList<>();
        this.backgroundPath = new Path();
        this.rect = new RectF();
        this.invalidatePath = true;
        this.invalidateColors = false;
        this.giftPremiumTextUncollapsed = false;
        this.giftPremiumTextCollapsed = false;
        this.giftPremiumTextExpandedAnimated = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.buttonClickableAsImage = true;
        this.giftTitlePaint = new TextPaint(1);
        this.giftTextPaint = new TextPaint(1);
        this.giftSubtitlePaint = new TextPaint(1);
        this.radialProgress = new RadialProgress2(this);
        this.giftStickerDelegate = new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 17);
        this.starsPath = new Path();
        this.botButtons = new ArrayList<>();
        this.dimPaint = new Paint(1);
        this.backgroundPath2 = new Path();
        this.radii = new float[8];
        this.botButtonRadii = new float[8];
        this.botButtonPath = new Path();
        this.pressedState = new int[]{16842910, 16842919};
        this.transitionParams = new TransitionParams();
        this.avatarStoryParams.drawSegments = false;
        this.canDrawInParent = z;
        this.themeDelegate = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.avatarDrawable = new AvatarDrawable();
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.starGiftLayout = new StarGiftUniqueActionLayout(this.currentAccount, this, resourcesProvider);
        this.giftTitlePaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.giftSubtitlePaint.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        this.giftTextPaint.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.rippleView = view;
        view.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        this.rippleView.setVisibility(8);
        addView(this.rippleView);
        StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(10);
        this.starParticlesDrawable = drawable;
        drawable.type = 100;
        drawable.isCircle = false;
        drawable.roundEffect = true;
        drawable.useRotate = false;
        drawable.useBlur = true;
        drawable.checkBounds = true;
        drawable.size1 = 1;
        drawable.k3 = 0.98f;
        drawable.k2 = 0.98f;
        drawable.k1 = 0.98f;
        drawable.paused = false;
        drawable.speedScale = 0.0f;
        drawable.minLifeTime = 750L;
        drawable.randLifeTime = 750;
        drawable.init();
    }

    public void setMessageObject(MessageObject messageObject, boolean z) {
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        String str;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.Document document;
        Object obj;
        TLRPC.Document document2;
        String str2;
        TLRPC.Document document3;
        TLRPC.Document giftDocument;
        BotInlineKeyboard.Source source;
        boolean z2;
        int i;
        int i2;
        int rowsCount;
        int i3;
        int columnsCount;
        int i4;
        BotButton botButton;
        int iconRes;
        boolean z3;
        boolean z4;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize closestVideoSizeWithSize;
        TLRPC.PhotoSize photoSize2;
        boolean z5;
        float f;
        TLRPC.Message message;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str3;
        TopicSeparator topicSeparator;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        Drawable drawable;
        StaticLayout staticLayout;
        MessageObject messageObject2 = messageObject;
        if (messageObject2 == null) {
            return;
        }
        if (this.currentMessageObject != messageObject2 || (!((staticLayout = this.textLayout) == null || TextUtils.equals(staticLayout.getText(), messageObject2.messageText)) || (!(this.hasReplyMessage || messageObject2.replyMessageObject == null) || z || messageObject2.type == 21 || messageObject2.forceUpdate))) {
            if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
                FileLog.e(new IllegalStateException("Wrong thread!!!"));
            }
            this.botButtons.clear();
            this.botInlineButtons = null;
            this.accessibilityText = null;
            MessageObject messageObject3 = this.currentMessageObject;
            boolean z6 = messageObject3 == null || messageObject3.stableId != messageObject2.stableId;
            if (messageObject3 != null) {
                messageObject2.playedGiftAnimation = messageObject3.playedGiftAnimation;
            }
            this.currentMessageObject = messageObject2;
            messageObject2.forceUpdate = false;
            this.hasReplyMessage = messageObject2.replyMessageObject != null;
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.previousWidth = 0;
            this.isSpoilerRevealing = false;
            TextLayout textLayout = this.giftPremiumText;
            if (textLayout != null && z6) {
                AnimatedEmojiSpan.release(ChatActionCell.this, textLayout.emoji);
                this.giftPremiumText = null;
                this.giftPremiumTextUncollapsed = false;
            }
            if (z6 || messageObject2.reactionsChanged) {
                messageObject2.reactionsChanged = false;
                TLRPC.Message message2 = messageObject2.messageOwner;
                boolean z7 = (message2 == null || (tL_messageReactions = message2.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                if (messageObject2.shouldDrawReactions()) {
                    this.reactionsLayoutInBubble.setMessage(messageObject2, !messageObject2.shouldDrawReactionsInLayout(), z7, this.themeDelegate);
                } else {
                    this.reactionsLayoutInBubble.setMessage(null, false, false, this.themeDelegate);
                }
            }
            if (messageObject2.type == 32) {
                if (this.birthdayLayout == null) {
                    this.birthdayLayout = new SuggestBirthdayActionLayout(this.currentAccount, this, this.themeDelegate);
                    if (isCellAttachedToWindow()) {
                        this.birthdayLayout.attach();
                    }
                }
                this.birthdayLayout.set(messageObject2);
            } else {
                SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
                if (suggestBirthdayActionLayout != null) {
                    suggestBirthdayActionLayout.detach();
                    this.birthdayLayout = null;
                }
            }
            StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.starGiftLayout;
            boolean z8 = !z6;
            starGiftUniqueActionLayout.widthExpanded = false;
            starGiftUniqueActionLayout.currentMessageObject = messageObject2;
            TLRPC.Message message3 = messageObject2.messageOwner;
            if (message3 != null) {
                TLRPC.MessageAction messageAction2 = message3.action;
                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                } else {
                    tL_messageActionStarGiftUnique = null;
                }
            } else {
                tL_messageActionStarGiftUnique = null;
            }
            if (tL_messageActionStarGiftUnique == null || tL_messageActionStarGiftUnique.refunded || !(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                tL_messageActionStarGiftUnique = null;
            }
            boolean z9 = starGiftUniqueActionLayout.attached;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = starGiftUniqueActionLayout.emoji;
            ImageReceiver imageReceiver = starGiftUniqueActionLayout.imageReceiver;
            if (z9 && tL_messageActionStarGiftUnique != null && starGiftUniqueActionLayout.action == null) {
                imageReceiver.onAttachedToWindow();
                swapAnimatedEmojiDrawable.attach();
                starGiftUniqueActionLayout.messageDrawable.avatarReceiver.onAttachedToWindow();
            }
            starGiftUniqueActionLayout.action = tL_messageActionStarGiftUnique;
            starGiftUniqueActionLayout.repost = messageObject2.isRepostPreview;
            if (tL_messageActionStarGiftUnique != null) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique.gift;
                starGiftUniqueActionLayout.backdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                starGiftUniqueActionLayout.pattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique2.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = starGiftUniqueActionLayout.model;
                starGiftUniqueActionLayout.model = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique2.attributes, TL_stars.starGiftAttributeModel.class);
                Paint paint = starGiftUniqueActionLayout.backgroundPaint;
                starGiftUniqueActionLayout.gradient = null;
                paint.setShader(null);
                TL_stars.starGiftAttributePattern stargiftattributepattern = starGiftUniqueActionLayout.pattern;
                if (stargiftattributepattern != null) {
                    swapAnimatedEmojiDrawable.set(stargiftattributepattern.document, z8);
                } else {
                    swapAnimatedEmojiDrawable.set((Drawable) null, z8);
                }
                TL_stars.starGiftAttributeModel stargiftattributemodel2 = starGiftUniqueActionLayout.model;
                if (stargiftattributemodel2 != null) {
                    if (stargiftattributemodel != null) {
                        tL_starGiftUnique = tL_starGiftUnique2;
                        if (stargiftattributemodel.document.id != stargiftattributemodel2.document.id) {
                        }
                    } else {
                        tL_starGiftUnique = tL_starGiftUnique2;
                    }
                    if (starGiftUniqueActionLayout.repost) {
                        imageReceiver.setAllowStartLottieAnimation(true);
                        imageReceiver.setAllowStartAnimation(true);
                        imageReceiver.setAutoRepeat(1);
                    } else {
                        imageReceiver.setAutoRepeatCount(0);
                        imageReceiver.clearDecorators();
                        imageReceiver.setAutoRepeat(0);
                    }
                    StarsIntroActivity.setGiftImage(imageReceiver, starGiftUniqueActionLayout.model.document, 110);
                } else {
                    tL_starGiftUnique = tL_starGiftUnique2;
                }
                boolean z10 = tL_starGiftUnique.burned;
                starGiftUniqueActionLayout.burned = z10;
                GiftSheet.RibbonDrawable ribbonDrawable = starGiftUniqueActionLayout.ribbon;
                if (z10) {
                    int color = Theme.getColor(Theme.key_text_RedBold, starGiftUniqueActionLayout.resourcesProvider);
                    ribbonDrawable.paint.setShader(null);
                    ribbonDrawable.paint.setColor(color);
                    ribbonDrawable.setText(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
                } else {
                    ribbonDrawable.setBackdrop(starGiftUniqueActionLayout.backdrop, true, false);
                    ribbonDrawable.setText(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
                }
                if (starGiftUniqueActionLayout.repost) {
                    starGiftUniqueActionLayout.width = AndroidUtilities.dp(200.0f);
                } else {
                    starGiftUniqueActionLayout.width = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
                    if (!AndroidUtilities.isTablet()) {
                        starGiftUniqueActionLayout.width = (int) (starGiftUniqueActionLayout.width * 1.2f);
                    }
                    starGiftUniqueActionLayout.width -= AndroidUtilities.dp(8.0f);
                }
                starGiftUniqueActionLayout.setInternal(messageObject2, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                FactorAnimator factorAnimator = starGiftUniqueActionLayout.animatorVisualWidth;
                if (z6) {
                    factorAnimator.forceFactor(starGiftUniqueActionLayout.width);
                } else {
                    int iRound = Math.round(factorAnimator.isAnimating ? factorAnimator.toFactor : factorAnimator.factor);
                    int i8 = starGiftUniqueActionLayout.width;
                    if (iRound != i8) {
                        factorAnimator.animateTo(i8);
                    }
                }
            }
            this.imageReceiver.setAutoRepeatCount(0);
            this.imageReceiver.clearDecorators();
            if (messageObject2.type != 22) {
                this.wallpaperPreviewDrawable = null;
            }
            if (messageObject2.actionDeleteGroupEventId != -1) {
                ScaleStateListAnimator.apply(this, 0.02f, 1.2f);
                this.overriddenMaxWidth = Math.max(AndroidUtilities.dp(250.0f), HintView2.cutInFancyHalf(messageObject2.messageText, (TextPaint) getThemedPaint("paintChatActionText")));
                ProfileActivity.ShowDrawable showDrawableFindDrawable = ChannelAdminLogActivity.findDrawable(messageObject2.messageText);
                if (showDrawableFindDrawable != null) {
                    showDrawableFindDrawable.setView(this);
                }
            } else {
                ScaleStateListAnimator.reset(this);
                this.overriddenMaxWidth = 0;
            }
            if (!messageObject2.isStoryMention()) {
                int i9 = messageObject2.type;
                if (i9 == 22) {
                    if (messageObject2.strippedThumb == null) {
                        int size = messageObject2.photoThumbs.size();
                        for (int i10 = 0; i10 < size && !(messageObject2.photoThumbs.get(i10) instanceof TLRPC.TL_photoStrippedSize); i10++) {
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject2.currentEvent;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                        } else {
                            message = messageObject2.messageOwner;
                            if (message != null || (messageAction = message.action) == null) {
                                wallPaper = null;
                            } else {
                                wallPaper = messageAction.wallpaper;
                            }
                        }
                    } else {
                        message = messageObject2.messageOwner;
                        if (message != null) {
                            wallPaper = null;
                        } else {
                            wallPaper = null;
                        }
                    }
                    if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
                        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                        this.imageReceiver.clearImage();
                        int i11 = this.currentAccount;
                        String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(wallPaper);
                        int i12 = PreviewView.$r8$clinit;
                        EmojiThemes theme = ChatThemeController.getInstance(i11).getTheme(new ThemeKey(wallpaperEmoticon, null));
                        Drawable cachedWallpaper = theme == null ? Theme.getCachedWallpaper() : PreviewView.getBackgroundDrawableFromTheme(theme, i11, zIsDark);
                        this.wallpaperPreviewDrawable = cachedWallpaper;
                        if (cachedWallpaper != null) {
                            cachedWallpaper.setCallback(this);
                        }
                    } else if (wallPaper != null && (str3 = wallPaper.uploadingImage) != null) {
                        this.imageReceiver.setImage(ImageLocation.getForPath(str3), "150_150_wallpaper" + wallPaper.id + ChatBackgroundDrawable.hash(wallPaper.settings), null, null, ChatBackgroundDrawable.createThumb(wallPaper), 0L, null, wallPaper, 1);
                        this.wallpaperPreviewDrawable = null;
                    } else if (wallPaper != null) {
                        TLObject tLObject = messageObject2.photoThumbsObject;
                        TLRPC.Document document4 = tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document;
                        this.imageReceiver.setImage(ImageLocation.getForDocument(document4), "150_150_wallpaper" + wallPaper.id + ChatBackgroundDrawable.hash(wallPaper.settings), null, null, ChatBackgroundDrawable.createThumb(wallPaper), 0L, null, wallPaper, 1);
                        this.wallpaperPreviewDrawable = null;
                    } else {
                        this.wallpaperPreviewDrawable = null;
                    }
                    this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                    if (getUploadingInfoProgress(messageObject) == 1.0f) {
                        this.radialProgress.setProgress(1.0f, z8);
                        this.radialProgress.setIcon(4, z8, z8);
                    } else {
                        this.radialProgress.setIcon(3, z8, z8);
                    }
                } else if (i9 == 21) {
                    this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                    this.imageReceiver.setAllowStartLottieAnimation(true);
                    this.imageReceiver.setDelegate(null);
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) messageObject2.messageOwner.action;
                    TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(tL_messageActionSuggestProfilePhoto.photo.video_sizes, 1000);
                    ArrayList<TLRPC.VideoSize> arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    ImageLocation forPhoto = (arrayList == null || arrayList.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize2, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = messageObject2.messageOwner.action.photo;
                    if (messageObject2.strippedThumb != null) {
                        photoSize2 = null;
                        break;
                    }
                    int size2 = messageObject2.photoThumbs.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size2) {
                            photoSize2 = null;
                            break;
                        }
                        photoSize2 = messageObject2.photoThumbs.get(i13);
                        if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, 1000);
                    if (closestPhotoSizeWithSize == null) {
                        z5 = z8;
                        f = 1.0f;
                    } else if (closestVideoSizeWithSize2 != null) {
                        z5 = z8;
                        f = 1.0f;
                        this.imageReceiver.setImage(forPhoto, "g", ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject, 0);
                        messageObject2 = messageObject;
                    } else {
                        z5 = z8;
                        f = 1.0f;
                        this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject2, 0);
                    }
                    this.imageReceiver.setAllowStartLottieAnimation(false);
                    ImageUpdater imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject2.messageOwner.local_id);
                    if (imageUpdater == null || imageUpdater.getCurrentImageProgress() == f) {
                        boolean z11 = z5;
                        this.radialProgress.setProgress(f, z11);
                        this.radialProgress.setIcon(4, z11, z11);
                    } else {
                        boolean z12 = z5;
                        this.radialProgress.setIcon(3, z12, z12);
                    }
                } else {
                    String str4 = null;
                    int i14 = 1;
                    if (i9 == 31 || i9 == 33 || i9 == 30 || i9 == 18 || i9 == 25 || i9 == 35) {
                        this.imageReceiver.setRoundRadius(0);
                        TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                        if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                            TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                            this.offerExpired = tL_messageActionNoForwardsRequest.expired || ((long) messageObject2.messageOwner.date) + MessagesController.getInstance(this.currentAccount).config.noForwardsRequestExpirePeriod.get(TimeUnit.SECONDS) < ((long) ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                            if (!messageObject2.isOut() && !tL_messageActionNoForwardsRequest.expired && !this.offerExpired) {
                                BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
                                builder.addSharingOfferKeyboard();
                                this.botInlineButtons = builder.build();
                            }
                        } else {
                            if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction3;
                                TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                if (starGift != null) {
                                    giftDocument = TlUtils.getGiftDocument(starGift);
                                    if (this.cardBackground == null) {
                                        this.cardBackground = new GiftSheet.CardBackground(this, this.themeDelegate, false);
                                    }
                                    this.cardBackground.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    giftDocument = null;
                                }
                                this.offerExpired = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                                if (!messageObject2.isOut() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.offerExpired) {
                                    BotInlineKeyboard.Builder builder2 = new BotInlineKeyboard.Builder();
                                    builder2.addGiftOfferKeyboard();
                                    this.botInlineButtons = builder2.build();
                                }
                                document = giftDocument;
                            } else {
                                if (messageAction3 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                    TL_stars.StarGift starGift2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction3).theme).gift;
                                    if (starGift2 != null) {
                                        TLRPC.Document giftDocument2 = TlUtils.getGiftDocument(starGift2);
                                        if (this.cardBackground == null) {
                                            this.cardBackground = new GiftSheet.CardBackground(this, this.themeDelegate, false);
                                        }
                                        this.cardBackground.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                                        document = giftDocument2;
                                    }
                                    obj = tL_messages_stickerSet;
                                } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction3).gift;
                                    if (starGift3 != null) {
                                        document3 = starGift3.sticker;
                                    } else {
                                        document3 = null;
                                    }
                                    document = document3;
                                    z6 = z6;
                                    obj = messageObject2;
                                    tL_messages_stickerSet = null;
                                } else {
                                    if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                                        if (tL_messageActionStarGiftUnique2.refunded) {
                                            TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique2.gift;
                                            if (starGift4 != null) {
                                                document3 = starGift4.getDocument();
                                            } else {
                                                document3 = null;
                                            }
                                            document = document3;
                                            z6 = z6;
                                            obj = messageObject2;
                                            tL_messages_stickerSet = null;
                                        }
                                    }
                                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                        str = UserConfig.getInstance(this.currentAccount).premiumTonStickerPack;
                                        if (str == null) {
                                            MediaDataController.getInstance(this.currentAccount).checkTonGiftStickers();
                                            return;
                                        }
                                    } else {
                                        str = UserConfig.getInstance(this.currentAccount).premiumGiftsStickerPack;
                                        if (str == null) {
                                            MediaDataController.getInstance(this.currentAccount).checkPremiumGiftStickers();
                                            return;
                                        }
                                    }
                                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str);
                                    if (stickerSetByName == null) {
                                        stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str);
                                    }
                                    if (stickerSetByName != null) {
                                        TLRPC.MessageAction messageAction4 = messageObject2.messageOwner.action;
                                        int i15 = messageAction4.months;
                                        if (messageObject2.type == 30) {
                                            String str5 = "3⃣";
                                            if (messageAction4 instanceof TLRPC.TL_messageActionGiftTon) {
                                                long j = messageAction4.cryptoAmount;
                                                if (j <= 10000000000L) {
                                                    str5 = "2⃣";
                                                } else if (j <= 50000000000L) {
                                                    str5 = "1⃣";
                                                }
                                            } else {
                                                long j2 = messageAction4 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction4).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction4).stars;
                                                if (j2 <= 1000) {
                                                    str5 = "2⃣";
                                                } else if (j2 >= 2500) {
                                                    str5 = "4⃣";
                                                }
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 < stickerSetByName.packs.size()) {
                                                    TLRPC.TL_stickerPack tL_stickerPack = stickerSetByName.packs.get(i16);
                                                    if (!TextUtils.equals(tL_stickerPack.emoticon, str5) || tL_stickerPack.documents.isEmpty()) {
                                                        i16++;
                                                    } else {
                                                        long jLongValue = tL_stickerPack.documents.get(0).longValue();
                                                        int i17 = 0;
                                                        while (true) {
                                                            if (i17 < stickerSetByName.documents.size()) {
                                                                document2 = stickerSetByName.documents.get(i17);
                                                                if (document2 == null || document2.id != jLongValue) {
                                                                    i17++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                z6 = z6;
                                                document2 = null;
                                                if (document2 == null || stickerSetByName.documents.isEmpty()) {
                                                    str4 = str;
                                                    tL_messages_stickerSet = stickerSetByName;
                                                    obj = tL_messages_stickerSet;
                                                    document = document2;
                                                } else {
                                                    document = stickerSetByName.documents.get(0);
                                                    str4 = str;
                                                    tL_messages_stickerSet = stickerSetByName;
                                                    obj = tL_messages_stickerSet;
                                                }
                                            }
                                        } else {
                                            String str6 = monthsToEmoticon.get(Integer.valueOf(i15));
                                            ArrayList<TLRPC.TL_stickerPack> arrayList2 = stickerSetByName.packs;
                                            int size3 = arrayList2.size();
                                            document2 = null;
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 < size3) {
                                                    TLRPC.TL_stickerPack tL_stickerPack2 = arrayList2.get(i18);
                                                    i18 += i14;
                                                    TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                                    if (!Objects.equals(tL_stickerPack3.emoticon, str6)) {
                                                        str2 = str6;
                                                        z6 = z6;
                                                        break;
                                                    }
                                                    ArrayList<Long> arrayList3 = tL_stickerPack3.documents;
                                                    int size4 = arrayList3.size();
                                                    int i19 = 0;
                                                    while (true) {
                                                        if (i19 >= size4) {
                                                            str2 = str6;
                                                            z6 = z6;
                                                            break;
                                                        }
                                                        Long l = arrayList3.get(i19);
                                                        i19 += i14;
                                                        long jLongValue2 = l.longValue();
                                                        ArrayList<TLRPC.Document> arrayList4 = stickerSetByName.documents;
                                                        int size5 = arrayList4.size();
                                                        int i20 = 0;
                                                        while (true) {
                                                            if (i20 >= size5) {
                                                                str2 = str6;
                                                                z6 = z6;
                                                                break;
                                                            }
                                                            TLRPC.Document document5 = arrayList4.get(i20);
                                                            i20++;
                                                            ArrayList<TLRPC.Document> arrayList5 = arrayList4;
                                                            TLRPC.Document document6 = document5;
                                                            str2 = str6;
                                                            z6 = z6;
                                                            if (document6.id == jLongValue2) {
                                                                document2 = document6;
                                                                break;
                                                            } else {
                                                                z6 = z6;
                                                                arrayList4 = arrayList5;
                                                                str6 = str2;
                                                            }
                                                        }
                                                        if (document2 != null) {
                                                            break;
                                                        }
                                                        z6 = z6;
                                                        str6 = str2;
                                                        i14 = 1;
                                                    }
                                                    if (document2 == null) {
                                                        z6 = z6;
                                                        str6 = str2;
                                                        i14 = 1;
                                                    }
                                                }
                                                if (document2 == null) {
                                                    str4 = str;
                                                    tL_messages_stickerSet = stickerSetByName;
                                                    obj = tL_messages_stickerSet;
                                                    document = document2;
                                                } else {
                                                    str4 = str;
                                                    tL_messages_stickerSet = stickerSetByName;
                                                    obj = tL_messages_stickerSet;
                                                    document = document2;
                                                }
                                            }
                                        }
                                        z6 = z6;
                                        if (document2 == null) {
                                            str4 = str;
                                            tL_messages_stickerSet = stickerSetByName;
                                            obj = tL_messages_stickerSet;
                                            document = document2;
                                        } else {
                                            str4 = str;
                                            tL_messages_stickerSet = stickerSetByName;
                                            obj = tL_messages_stickerSet;
                                            document = document2;
                                        }
                                    } else {
                                        z6 = z6;
                                        str4 = str;
                                        tL_messages_stickerSet = stickerSetByName;
                                        document = null;
                                        obj = null;
                                    }
                                }
                                source = this.botInlineButtons;
                                if (source != null) {
                                    rowsCount = source.getRowsCount();
                                    for (i3 = 0; i3 < rowsCount; i3++) {
                                        columnsCount = this.botInlineButtons.getColumnsCount(i3);
                                        for (i4 = 0; i4 < columnsCount; i4++) {
                                            BotInlineKeyboard.Button button = this.botInlineButtons.getButton(i3, i4);
                                            botButton = new BotButton(new ChatActionCell$$ExternalSyntheticLambda3(this, 0));
                                            botButton.buttonCustom = (BotInlineKeyboard.ButtonCustom) button;
                                            iconRes = button.getIconRes();
                                            if (iconRes != 0) {
                                                Drawable drawable2 = getResources().getDrawable(iconRes);
                                                botButton.iconDrawable = drawable2;
                                                drawable2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                            }
                                            botButton.height = AndroidUtilities.dp(40.0f);
                                            int i21 = botButton.positionFlags | 8;
                                            botButton.positionFlags = i21;
                                            if (i4 == 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            int flag = BitwiseUtils.setFlag(i21, 1, z3);
                                            botButton.positionFlags = flag;
                                            if (i4 == 1) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            botButton.positionFlags = BitwiseUtils.setFlag(flag, 2, z4);
                                            botButton.title = new Text(button.getText(), (TextPaint) getThemedPaint("paintChatBotButton"));
                                            this.botButtons.add(botButton);
                                        }
                                    }
                                }
                                this.forceWasUnread = messageObject2.wasUnread;
                                this.giftSticker = document;
                                if (document != null) {
                                    this.imageReceiver.setAllowStartLottieAnimation(true);
                                    i = messageObject2.type;
                                    if (i != 31 && i != 37 && i != 33) {
                                        this.imageReceiver.setDelegate(this.giftStickerDelegate);
                                    }
                                    this.giftEffectAnimation = null;
                                    for (i2 = 0; i2 < document.video_thumbs.size(); i2++) {
                                        if ("f".equals(document.video_thumbs.get(i2).type)) {
                                            this.giftEffectAnimation = document.video_thumbs.get(i2);
                                            break;
                                        }
                                    }
                                    if (z6 || messageObject2.type != 18) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                        this.imageReceiver.setAutoRepeat(0);
                                        ImageReceiver imageReceiver2 = this.imageReceiver;
                                        ImageLocation forDocument = ImageLocation.getForDocument(document);
                                        Locale locale = Locale.US;
                                        imageReceiver2.setImage(forDocument, Fragment$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb, "tgs", obj, 1);
                                    }
                                } else if (str4 != null) {
                                    MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                                    if (tL_messages_stickerSet == null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    mediaDataController.loadStickersByEmojiOrName(str4, false, z2);
                                }
                            }
                            tL_messages_stickerSet = null;
                            obj = tL_messages_stickerSet;
                            source = this.botInlineButtons;
                            if (source != null) {
                                rowsCount = source.getRowsCount();
                                while (i3 < rowsCount) {
                                    columnsCount = this.botInlineButtons.getColumnsCount(i3);
                                    while (i4 < columnsCount) {
                                        BotInlineKeyboard.Button button2 = this.botInlineButtons.getButton(i3, i4);
                                        botButton = new BotButton(new ChatActionCell$$ExternalSyntheticLambda3(this, 0));
                                        botButton.buttonCustom = (BotInlineKeyboard.ButtonCustom) button2;
                                        iconRes = button2.getIconRes();
                                        if (iconRes != 0) {
                                            Drawable drawable3 = getResources().getDrawable(iconRes);
                                            botButton.iconDrawable = drawable3;
                                            drawable3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                        }
                                        botButton.height = AndroidUtilities.dp(40.0f);
                                        int i22 = botButton.positionFlags | 8;
                                        botButton.positionFlags = i22;
                                        if (i4 == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        int flag2 = BitwiseUtils.setFlag(i22, 1, z3);
                                        botButton.positionFlags = flag2;
                                        if (i4 == 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        botButton.positionFlags = BitwiseUtils.setFlag(flag2, 2, z4);
                                        botButton.title = new Text(button2.getText(), (TextPaint) getThemedPaint("paintChatBotButton"));
                                        this.botButtons.add(botButton);
                                    }
                                }
                            }
                            this.forceWasUnread = messageObject2.wasUnread;
                            this.giftSticker = document;
                            if (document != null) {
                                this.imageReceiver.setAllowStartLottieAnimation(true);
                                i = messageObject2.type;
                                if (i != 31) {
                                    this.imageReceiver.setDelegate(this.giftStickerDelegate);
                                }
                                this.giftEffectAnimation = null;
                                while (i2 < document.video_thumbs.size()) {
                                    if ("f".equals(document.video_thumbs.get(i2).type)) {
                                        this.giftEffectAnimation = document.video_thumbs.get(i2);
                                        break;
                                    }
                                }
                                if (z6) {
                                    SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                    this.imageReceiver.setAutoRepeat(0);
                                    ImageReceiver imageReceiver3 = this.imageReceiver;
                                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                                    Locale locale2 = Locale.US;
                                    imageReceiver3.setImage(forDocument2, Fragment$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb2, "tgs", obj, 1);
                                } else {
                                    SvgHelper.SvgDrawable svgThumb3 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                    this.imageReceiver.setAutoRepeat(0);
                                    ImageReceiver imageReceiver4 = this.imageReceiver;
                                    ImageLocation forDocument3 = ImageLocation.getForDocument(document);
                                    Locale locale3 = Locale.US;
                                    imageReceiver4.setImage(forDocument3, Fragment$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb3, "tgs", obj, 1);
                                }
                            } else if (str4 != null) {
                                MediaDataController mediaDataController2 = MediaDataController.getInstance(this.currentAccount);
                                if (tL_messages_stickerSet == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                mediaDataController2.loadStickersByEmojiOrName(str4, false, z2);
                            }
                        }
                        document = null;
                        tL_messages_stickerSet = null;
                        obj = tL_messages_stickerSet;
                        source = this.botInlineButtons;
                        if (source != null) {
                            rowsCount = source.getRowsCount();
                            while (i3 < rowsCount) {
                                columnsCount = this.botInlineButtons.getColumnsCount(i3);
                                while (i4 < columnsCount) {
                                    BotInlineKeyboard.Button button3 = this.botInlineButtons.getButton(i3, i4);
                                    botButton = new BotButton(new ChatActionCell$$ExternalSyntheticLambda3(this, 0));
                                    botButton.buttonCustom = (BotInlineKeyboard.ButtonCustom) button3;
                                    iconRes = button3.getIconRes();
                                    if (iconRes != 0) {
                                        Drawable drawable4 = getResources().getDrawable(iconRes);
                                        botButton.iconDrawable = drawable4;
                                        drawable4.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                    }
                                    botButton.height = AndroidUtilities.dp(40.0f);
                                    int i23 = botButton.positionFlags | 8;
                                    botButton.positionFlags = i23;
                                    if (i4 == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    int flag3 = BitwiseUtils.setFlag(i23, 1, z3);
                                    botButton.positionFlags = flag3;
                                    if (i4 == 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    botButton.positionFlags = BitwiseUtils.setFlag(flag3, 2, z4);
                                    botButton.title = new Text(button3.getText(), (TextPaint) getThemedPaint("paintChatBotButton"));
                                    this.botButtons.add(botButton);
                                }
                            }
                        }
                        this.forceWasUnread = messageObject2.wasUnread;
                        this.giftSticker = document;
                        if (document != null) {
                            this.imageReceiver.setAllowStartLottieAnimation(true);
                            i = messageObject2.type;
                            if (i != 31) {
                                this.imageReceiver.setDelegate(this.giftStickerDelegate);
                            }
                            this.giftEffectAnimation = null;
                            while (i2 < document.video_thumbs.size()) {
                                if ("f".equals(document.video_thumbs.get(i2).type)) {
                                    this.giftEffectAnimation = document.video_thumbs.get(i2);
                                    break;
                                }
                            }
                            if (z6) {
                                SvgHelper.SvgDrawable svgThumb4 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                this.imageReceiver.setAutoRepeat(0);
                                ImageReceiver imageReceiver5 = this.imageReceiver;
                                ImageLocation forDocument4 = ImageLocation.getForDocument(document);
                                Locale locale4 = Locale.US;
                                imageReceiver5.setImage(forDocument4, Fragment$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb4, "tgs", obj, 1);
                            } else {
                                SvgHelper.SvgDrawable svgThumb5 = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                this.imageReceiver.setAutoRepeat(0);
                                ImageReceiver imageReceiver6 = this.imageReceiver;
                                ImageLocation forDocument5 = ImageLocation.getForDocument(document);
                                Locale locale5 = Locale.US;
                                imageReceiver6.setImage(forDocument5, Fragment$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb5, "tgs", obj, 1);
                            }
                        } else if (str4 != null) {
                            MediaDataController mediaDataController3 = MediaDataController.getInstance(this.currentAccount);
                            if (tL_messages_stickerSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            mediaDataController3.loadStickersByEmojiOrName(str4, false, z2);
                        }
                    } else if (i9 == 37) {
                        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) messageObject2.messageOwner.action).community_id));
                        this.imageReceiver.setAllowStartLottieAnimation(true);
                        this.imageReceiver.setDelegate(null);
                        this.imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                        this.imageReceiver.setAutoRepeatCount(1);
                        this.avatarDrawable.setInfo(chat);
                        this.imageReceiver.setForUserOrChat(chat, new CommunityAvatarDrawable(getContext(), AndroidUtilities.dp(14.0f)), chat);
                    } else if (i9 == 11) {
                        this.imageReceiver.setAllowStartLottieAnimation(true);
                        this.imageReceiver.setDelegate(null);
                        this.imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
                        this.imageReceiver.setAutoRepeatCount(1);
                        this.avatarDrawable.setInfo(messageObject2.getDialogId(), null, null);
                        if (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                            this.imageReceiver.setImage(null, null, this.avatarDrawable, null, messageObject2, 0);
                        } else {
                            if (messageObject2.strippedThumb != null) {
                                photoSize = null;
                                break;
                            }
                            int size6 = messageObject2.photoThumbs.size();
                            int i24 = 0;
                            while (true) {
                                if (i24 >= size6) {
                                    photoSize = null;
                                    break;
                                }
                                TLRPC.PhotoSize photoSize3 = messageObject2.photoThumbs.get(i24);
                                if (photoSize3 instanceof TLRPC.TL_photoStrippedSize) {
                                    photoSize = photoSize3;
                                    break;
                                }
                                i24++;
                            }
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, 640);
                            if (closestPhotoSizeWithSize2 != null) {
                                TLRPC.Photo photo2 = messageObject2.messageOwner.action.photo;
                                if (photo2.video_sizes.isEmpty() || !SharedConfig.isAutoplayGifs()) {
                                    closestVideoSizeWithSize = null;
                                } else {
                                    closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                    if (!messageObject2.mediaExists && !DownloadController.getInstance(this.currentAccount).canDownloadMedia(4, closestVideoSizeWithSize.size)) {
                                        this.currentVideoLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2);
                                        DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(closestVideoSizeWithSize), messageObject2, this);
                                        closestVideoSizeWithSize = null;
                                    }
                                }
                                if (closestVideoSizeWithSize != null) {
                                    this.imageReceiver.setImage(ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2), "g", ImageLocation.getForObject(photoSize, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject2, 1);
                                } else {
                                    this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject2.photoThumbsObject), "150_150", ImageLocation.getForObject(photoSize, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject2, 1);
                                }
                            } else {
                                this.imageReceiver.setImageBitmap(this.avatarDrawable);
                            }
                        }
                        this.imageReceiver.setVisible(!PhotoViewer.isShowingImage(messageObject2), false);
                    } else {
                        this.imageReceiver.setAllowStartLottieAnimation(true);
                        this.imageReceiver.setDelegate(null);
                        this.imageReceiver.setImageBitmap((Bitmap) null);
                    }
                }
                if (!this.firstInChat && this.isAllChats && this.isSideMenued && (this.isForum || this.isMonoForum || this.isBotForum)) {
                    this.topicSeparatorTopPadding = AndroidUtilities.dp(33.0f);
                    if (this.topicSeparator == null) {
                        TopicSeparator topicSeparator2 = new TopicSeparator(this.currentAccount, this, this.themeDelegate, true);
                        this.topicSeparator = topicSeparator2;
                        topicSeparator2.setOnClickListener(new ChatActionCell$$ExternalSyntheticLambda3(this, 2));
                    }
                    if (this.topicSeparator.update(this.currentMessageObject)) {
                        if (this.attachedToWindow) {
                            this.topicSeparator.attach();
                        }
                        i5 = 0;
                    } else {
                        this.topicSeparator.detach();
                        this.topicSeparator = null;
                        i5 = 0;
                        this.topicSeparatorTopPadding = 0;
                    }
                } else {
                    topicSeparator = this.topicSeparator;
                    if (topicSeparator != null) {
                        topicSeparator.detach();
                        this.topicSeparator = null;
                    }
                    i5 = 0;
                    this.topicSeparatorTopPadding = 0;
                }
                paddingTop = getPaddingTop();
                i6 = this.topicSeparatorTopPadding;
                if (paddingTop != i6) {
                    setPadding(i5, i6, i5, i5);
                }
                View view = this.rippleView;
                if (isButtonLayout(messageObject) || this.starGiftLayout.has()) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                view.setVisibility(i7);
                int i25 = ForumUtilities.$r8$clinit;
                if (messageObject2.getDialogId() <= 0 && (tL_forumTopicFindTopic = MessagesController.getInstance(messageObject2.currentAccount).getTopicsController().findTopic(-messageObject2.getDialogId(), MessageObject.getTopicId(messageObject2.currentAccount, messageObject2.messageOwner, true))) != null) {
                    drawable = messageObject2.topicIconDrawable[0];
                    if (drawable instanceof ForumBubbleDrawable) {
                        ((ForumBubbleDrawable) drawable).setColor(tL_forumTopicFindTopic.icon_color);
                    }
                }
                requestLayout();
            }
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
            this.avatarDrawable.setInfo(this.currentAccount, user);
            TL_stories.StoryItem storyItem = messageObject2.messageOwner.media.storyItem;
            if (storyItem == null || !storyItem.noforwards) {
                StoriesUtilities.setImage(this.imageReceiver, storyItem);
            } else {
                this.imageReceiver.setForUserOrChat(user, this.avatarDrawable, null, true, 0, true);
            }
            this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
            if (!this.firstInChat) {
                topicSeparator = this.topicSeparator;
                if (topicSeparator != null) {
                    topicSeparator.detach();
                    this.topicSeparator = null;
                }
                i5 = 0;
                this.topicSeparatorTopPadding = 0;
            } else {
                topicSeparator = this.topicSeparator;
                if (topicSeparator != null) {
                    topicSeparator.detach();
                    this.topicSeparator = null;
                }
                i5 = 0;
                this.topicSeparatorTopPadding = 0;
            }
            paddingTop = getPaddingTop();
            i6 = this.topicSeparatorTopPadding;
            if (paddingTop != i6) {
                setPadding(i5, i6, i5, i5);
            }
            View view2 = this.rippleView;
            if (isButtonLayout(messageObject)) {
                i7 = 8;
            } else {
                i7 = 8;
            }
            view2.setVisibility(i7);
            int i26 = ForumUtilities.$r8$clinit;
            if (messageObject2.getDialogId() <= 0) {
                drawable = messageObject2.topicIconDrawable[0];
                if (drawable instanceof ForumBubbleDrawable) {
                    ((ForumBubbleDrawable) drawable).setColor(tL_forumTopicFindTopic.icon_color);
                }
            }
            requestLayout();
        }
    }

    public void setVisiblePart(float f, float f2, int i, float f3) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
        this.viewTranslationX = f2;
        this.dimAmount = f3;
        this.dimPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f3 * 255.0f)));
        invalidate();
    }

    @Override
    public void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.invalidateWithParent;
        if (view != null) {
            view.invalidate();
        }
        if (!this.invalidatesParent || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        View view = this.invalidateWithParent;
        if (view != null) {
            view.invalidate();
        }
        if (!this.invalidatesParent || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }
}
