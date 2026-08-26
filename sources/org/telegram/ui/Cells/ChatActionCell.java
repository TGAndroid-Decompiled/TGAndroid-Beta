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
import android.text.Spanned;
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
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
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
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda8;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda102;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda356;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CommunityAvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Premium.StarParticlesView;
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
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.UploadingDotsSpannable;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.CommunityUtils;

public class ChatActionCell extends BaseCell implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, IMessageCell {
    public static final HashMap monthsToEmoticon;
    public final int TAG;
    public SpannableStringBuilder accessibilityText;
    public boolean actionPressed;
    public int adaptiveEmojiColor;
    public PorterDuffColorFilter adaptiveEmojiColorFilter;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    public boolean attachedToWindow;
    public final AvatarDrawable avatarDrawable;
    public final StoriesUtilities.AvatarStoryParams avatarStoryParams;
    public int backgroundButtonTop;
    public int backgroundHeight;
    public int backgroundLeft;
    public final Path backgroundPath;
    public final Path backgroundPath2;
    public RectF backgroundRect;
    public int backgroundRectHeight;
    public int backgroundRight;
    public SuggestBirthdayActionLayout birthdayLayout;
    public final Path botButtonPath;
    public final float[] botButtonRadii;
    public final ArrayList botButtons;
    public BotInlineKeyboard.Source botInlineButtons;
    public final ButtonBounce bounce;
    public boolean buttonClickableAsImage;
    public final boolean canDrawInParent;
    public GiftSheet.CardBackground cardBackground;
    public Path clipPath;
    public final int currentAccount;
    public MessageObject currentMessageObject;
    public ImageLocation currentVideoLocation;
    public int customDate;
    public CharSequence customText;
    public ChatActionCellDelegate delegate;
    public float dimAmount;
    public final Paint dimPaint;
    public boolean firstInChat;
    public boolean forceWasUnread;
    public boolean giftButtonPressed;
    public final RectF giftButtonRect;
    public TLRPC.VideoSize giftEffectAnimation;
    public int giftPremiumAdditionalHeight;
    public StaticLayout giftPremiumButtonLayout;
    public float giftPremiumButtonWidth;
    public Text giftPremiumReleasedText;
    public TextLayout giftPremiumText;
    public GradientClip giftPremiumTextClip;
    public boolean giftPremiumTextCollapsed;
    public int giftPremiumTextCollapsedHeight;
    public final AnimatedFloat giftPremiumTextExpandedAnimated;
    public Text giftPremiumTextMore;
    public int giftPremiumTextMoreH;
    public int giftPremiumTextMoreX;
    public int giftPremiumTextMoreY;
    public boolean giftPremiumTextUncollapsed;
    public StaticLayout giftPremiumTitleLayout;
    public int giftRectSize;
    public Paint giftReleasedBackgroundPaint;
    public CornerPathEffect giftRibbonPaintEffect;
    public ColorMatrixColorFilter giftRibbonPaintFilter;
    public boolean giftRibbonPaintFilterDark;
    public Path giftRibbonPath;
    public Text giftRibbonText;
    public TLRPC.Document giftSticker;
    public final ChatActivity$$ExternalSyntheticLambda356 giftStickerDelegate;
    public final TextPaint giftSubtitlePaint;
    public final TextPaint giftTextPaint;
    public final TextPaint giftTitlePaint;
    public boolean hasReplyMessage;
    public boolean imagePressed;
    public final ImageReceiver imageReceiver;
    public boolean invalidateColors;
    public Runnable invalidateListener;
    public boolean invalidatePath;
    public View invalidateWithParent;
    public boolean invalidatesParent;
    public boolean isAllChats;
    public boolean isBotForum;
    public boolean isForum;
    public boolean isMonoForum;
    public boolean isSideMenued;
    public boolean isSpoilerRevealing;
    public float lastTouchX;
    public float lastTouchY;
    public final ArrayList lineHeights;
    public final ArrayList lineWidths;
    public LoadingDrawable loadingDrawable;
    public boolean offerExpired;
    public View.OnClickListener onActionClick;
    public int overriddenMaxWidth;
    public int overrideBackground;
    public Paint overrideBackgroundPaint;
    public int overrideText;
    public TextPaint overrideTextPaint;
    public int pressedBotButton;
    public URLSpan pressedLink;
    public final int[] pressedState;
    public int previousWidth;
    public float progressToProgress;
    public RadialProgressView progressView;
    public final RadialProgress2 radialProgress;
    public final float[] radii;
    public final ReactionsLayoutInBubble reactionsLayoutInBubble;
    public final RectF rect;
    public final View rippleView;
    public StaticLayout settingWallpaperLayout;
    public TextPaint settingWallpaperPaint;
    public float settingWallpaperProgress;
    public StaticLayout settingWallpaperProgressTextLayout;
    public boolean showTopicSeparator;
    public int sideMenuWidth;
    public SpoilerEffect spoilerPressed;
    public final ArrayList spoilers;
    public final Stack spoilersPool;
    public final StarGiftUniqueActionLayout starGiftLayout;
    public float starGiftLayoutX;
    public float starGiftLayoutY;
    public final StarParticlesView.Drawable starParticlesDrawable;
    public final Path starsPath;
    public int starsSize;
    public int stickerSize;
    public int textHeight;
    public StaticLayout textLayout;
    public TextPaint textPaint;
    public boolean textPressed;
    public int textWidth;
    public int textX;
    public int textXLeft;
    public int textY;
    public final Theme.ResourcesProvider themeDelegate;
    public int titleHeight;
    public StaticLayout titleLayout;
    public int titleXLeft;
    public TopicSeparator topicSeparator;
    public int topicSeparatorTopPadding;
    public final TransitionParams transitionParams;
    public float viewTop;
    public float viewTranslationX;
    public boolean visiblePartSet;
    public Drawable wallpaperPreviewDrawable;
    public boolean wasLayout;

    public interface ChatActionCellDelegate {
        boolean canDrawOutboundsContent();

        void didClickButton(ChatActionCell chatActionCell);

        void didClickImage(ChatActionCell chatActionCell);

        boolean didLongPress(ChatActionCell chatActionCell, float f, float f2);

        void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str);

        void didOpenPremiumGiftChannel(ChatActionCell chatActionCell, String str);

        void didPressReaction(ChatActionCell chatActionCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2);

        void didPressReplyMessage(ChatActionCell chatActionCell, int i);

        void didPressTaskLink(ChatActionCell chatActionCell, int i, int i2);

        void forceUpdate(ChatActionCell chatActionCell);

        BaseFragment getBaseFragment();

        long getDialogId();

        long getTopicId();

        void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported);

        void needOpenUserProfile(long j);

        void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize);

        void onTopicClick(ChatActionCell chatActionCell);
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
        zzlc.m(1, map, "1⃣", 3, "2⃣");
        zzlc.m(6, map, "3⃣", 12, "4⃣");
        map.put(24, "5⃣");
    }

    public ChatActionCell(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder createOption(int i, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            Theme$$ExternalSyntheticApiModelOutline3.m1065m$1();
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
        for (int i = 0; i < drawable.particles.size(); i++) {
            StarParticlesView.Drawable.Particle particle = (StarParticlesView.Drawable.Particle) drawable.particles.get(i);
            particle.lifeTime = (System.currentTimeMillis() - drawable.pausedTime) + particle.lifeTime;
        }
        invalidate();
    }

    public final void buildLayout() {
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
        boolean z6;
        SpannableStringBuilder spannableStringBuilder3;
        TLObject userOrChat;
        long peerDialogId2;
        boolean z7;
        boolean z8;
        int i3;
        TL_stars.StarGift starGift;
        String str;
        boolean z9;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        CharSequence charSequenceReplaceTags4;
        String string6;
        TL_stars.StarGift starGift2;
        String string7;
        CharSequence string8;
        CharSequence charSequence4;
        TL_stars.StarGift starGift3;
        SpannableStringBuilder spannableStringBuilder4;
        String publicUsername;
        int i4;
        int i5;
        char c;
        Object objValueOf;
        TLRPC.Peer peer2;
        String string9;
        TLRPC.MessageAction messageAction4;
        TLRPC.Message message2;
        TLRPC.MessageAction messageAction5;
        int i6;
        TLRPC.Chat chat;
        TLRPC.User user6;
        String name;
        CharSequence charSequenceReplaceCharSequence2;
        TLRPC.Message message3;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject2 = this.currentMessageObject;
        int i7 = this.currentAccount;
        if (messageObject2 != null) {
            if (messageObject2.isExpiredStory()) {
                charSequenceReplaceCharSequence = messageObject2.messageOwner.media.user_id != UserConfig.getInstance(i7).getClientUserId() ? StoriesUtilities.createExpiredStoryString(R.string.ExpiredStoryMention, true, new Object[0]) : StoriesUtilities.createExpiredStoryString(R.string.ExpiredStoryMentioned, true, MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())).first_name);
            } else {
                ChatActionCellDelegate chatActionCellDelegate = this.delegate;
                if (chatActionCellDelegate != null && chatActionCellDelegate.getTopicId() == 0 && MessageObject.isTopicActionMessage(messageObject2)) {
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i7).getTopicsController().findTopic(-messageObject2.getDialogId(), MessageObject.getTopicId(i7, messageObject2.messageOwner, true));
                    int i8 = ForumUtilities.$r8$clinit;
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
                                int i9 = tL_messageActionTopicEdit.flags;
                                if ((i9 & 8) != 0) {
                                    charSequenceReplaceCharSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(tL_messageActionTopicEdit.hidden ? R.string.TopicHidden2 : R.string.TopicShown2), name);
                                } else {
                                    j = 0;
                                    if ((i9 & 4) != 0) {
                                        charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(tL_messageActionTopicEdit.closed ? R.string.TopicWasClosedAction : R.string.TopicWasReopenedAction), ForumUtilities.getTopicSpannedName(tL_forumTopicFindTopic, null, null)), name);
                                    } else {
                                        int i10 = i9 & 1;
                                        if (i10 != 0 && (i9 & 2) != 0) {
                                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                            tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                            charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction2), ForumUtilities.getTopicSpannedName(tL_forumTopic, null, null)), name);
                                        } else if (i10 != 0) {
                                            charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction), tL_messageActionTopicEdit.title), name);
                                        } else if ((i9 & 2) != 0) {
                                            TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                            tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                            tL_forumTopic2.title = "";
                                            charSequenceReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasIconChangedToAction), ForumUtilities.getTopicSpannedName(tL_forumTopic2, null, null)), name);
                                        }
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
        if (messageObject3 != null && messageObject3.isRepostPreview) {
            charSequenceReplaceCharSequence = "";
        }
        if (messageObject3 != null && (message2 = messageObject3.messageOwner) != null && (messageAction5 = message2.action) != null) {
            if (messageAction5 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i6 = R.drawable.mini_checklist_add;
            } else if (messageAction5 instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction5;
                i6 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i6 = 0;
            }
            if (i6 != 0) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(charSequenceReplaceCharSequence);
                spannableStringBuilder5.insert(0, (CharSequence) "i ");
                spannableStringBuilder5.setSpan(new ColoredImageSpan(i6), 0, 1, 33);
                charSequenceReplaceCharSequence = spannableStringBuilder5;
            }
        }
        createLayout(this.previousWidth, charSequenceReplaceCharSequence);
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
                    createGiftPremiumLayouts(null, null, charSequenceReplaceCharSequence, false, !ChatObject.canManageMonoForum(i7, messageObject2.getDialogId()) ? LocaleController.getString(R.string.StarsBuy) : null, 11, null, this.giftRectSize, false);
                    this.textLayout = null;
                    this.textHeight = 0;
                    this.titleLayout = null;
                    this.titleHeight = 0;
                    this.textY = 0;
                } else {
                    charSequence = charSequenceReplaceCharSequence;
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
                            } else {
                                TextPaint textPaint = this.giftTextPaint;
                                if (i == 30) {
                                    user5 = MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
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
                                        long clientUserId2 = UserConfig.getInstance(i7).getClientUserId();
                                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageObject2.messageOwner.action;
                                        if (messageObject2.isOutOwner() != (!tL_messageActionStarGiftUnique.upgrade)) {
                                            clientUserId2 = messageObject2.getDialogId();
                                        }
                                        TLRPC.User user7 = MessagesController.getInstance(i7).getUser(Long.valueOf(clientUserId2));
                                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                        spannableStringBuilder6.append((CharSequence) LocaleController.getString(tL_messageActionStarGiftUnique.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                                        if (user7 != null && user7.photo != null) {
                                            spannableStringBuilder6.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan = new AvatarSpan(this, 18.0f, i7);
                                            avatarSpan.setUser(user7);
                                            spannableStringBuilder6.setSpan(avatarSpan, spannableStringBuilder6.length() - 2, spannableStringBuilder6.length() - 1, 33);
                                        }
                                        spannableStringBuilder6.append((CharSequence) UserObject.getForcedFirstName(user7));
                                        createGiftPremiumLayouts(spannableStringBuilder6, null, LocaleController.getString(R.string.Gift2ActionUpgradeRefundedText), false, LocaleController.getString(R.string.ActionGiftStarsView), 12, LocaleController.getString(R.string.Gift2UniqueRibbon), this.giftRectSize, true);
                                    } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                        tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                        j2 = tL_messageActionStarGift.convert_stars;
                                        clientUserId = UserConfig.getInstance(i7).getClientUserId();
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
                                        z6 = z5;
                                        spannableStringBuilder3 = new SpannableStringBuilder();
                                        userOrChat = MessagesController.getInstance(i7).getUserOrChat(fromChatId2);
                                        peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                        z7 = z4;
                                        TLObject userOrChat2 = MessagesController.getInstance(i7).getUserOrChat(peerDialogId2);
                                        if (tL_messageActionStarGift.can_upgrade || tL_messageActionStarGift.converted || tL_messageActionStarGift.upgrade_stars <= j || tL_messageActionStarGift.upgraded) {
                                            z8 = false;
                                        } else {
                                            z8 = true;
                                        }
                                        if (peerDialogId2 == j && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTitleTo)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat2)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan2 = new AvatarSpan(this, 18.0f, i7);
                                                AvatarDrawable avatarDrawable = avatarSpan2.avatarDrawable;
                                                avatarDrawable.setInfo(avatarSpan2.currentAccount, userOrChat2);
                                                avatarSpan2.imageReceiver.setForUserOrChat(userOrChat2, avatarDrawable);
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
                                                AvatarSpan avatarSpan3 = new AvatarSpan(this, 18.0f, i7);
                                                AvatarDrawable avatarDrawable2 = avatarSpan3.avatarDrawable;
                                                avatarDrawable2.setInfo(avatarSpan3.currentAccount, userOrChat);
                                                avatarSpan3.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable2);
                                                spannableStringBuilder3.setSpan(avatarSpan3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                            }
                                            spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                                        } else if (tL_messageActionStarGift.gift_num > 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                        } else {
                                            spannableStringBuilder3.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) LocaleController.formatNumber(tL_messageActionStarGift.gift_num, ','));
                                        }
                                        z9 = !((messageObject2.isOutOwner() || z6) && tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j && MessagesController.getInstance(i7).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(i7).getCurrentTime() - messageObject2.messageOwner.date) > 0 && !tL_messageActionStarGift.refunded;
                                        if (tL_messageActionStarGift.refunded) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                                        } else {
                                            tL_textWithEntities2 = tL_messageActionStarGift.message;
                                            if (tL_textWithEntities2 == null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                                MessageObject.addEntitiesToText(spannableStringBuilder7, tL_messageActionStarGift.message.entities, false, false, true, true);
                                                charSequenceReplaceTags4 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder7, textPaint.getFontMetricsInt(), false, (int[]) null), tL_messageActionStarGift.message.entities, textPaint.getFontMetricsInt());
                                            } else if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z7) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z9 || j2 <= j) {
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
                                            } else if (z8) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z9 && j2 > j) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j2, UserObject.getForcedFirstName(user5)));
                                                } else if (tL_messageActionStarGift.can_upgrade) {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user5)));
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user5)));
                                                }
                                            } else if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (tL_messageActionStarGift.saved) {
                                                if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                }
                                            } else if (z9) {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            }
                                        }
                                        starGift2 = tL_messageActionStarGift.gift;
                                        if (starGift2 == null && starGift2.limited) {
                                            int i11 = R.string.Gift2Limited1OfRibbon;
                                            int i12 = starGift2.availability_total;
                                            if (i12 > 1500) {
                                                c = 0;
                                                objValueOf = AndroidUtilities.formatWholeNumber(i12, 0);
                                            } else {
                                                c = 0;
                                                objValueOf = Integer.valueOf(i12);
                                            }
                                            Object[] objArr = new Object[1];
                                            objArr[c] = objValueOf;
                                            string7 = LocaleController.formatString(i11, objArr);
                                        } else {
                                            string7 = null;
                                        }
                                        string8 = LocaleController.getString(R.string.ActionGiftStarsView);
                                        if (messageObject2.isOutOwner() || tL_messageActionStarGift.forceIn || z8) {
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            charSequence4 = string8;
                                            if (!messageObject2.isOutOwner() && z8) {
                                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                spannableStringBuilder8.append((CharSequence) "^  ");
                                                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan.setScale(0.8f, 0.8f);
                                                spannableStringBuilder8.setSpan(coloredImageSpan, 0, 1, 33);
                                                spannableStringBuilder8.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder8;
                                            }
                                        }
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i7).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                                            spannableStringBuilder4 = null;
                                        } else {
                                            String string10 = LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@".concat(publicUsername));
                                            int i13 = StarGiftSheet.$r8$clinit;
                                            int iIndexOf = string10.indexOf("**");
                                            int iIndexOf2 = string10.indexOf("**", iIndexOf + 1);
                                            String strReplace = string10.replace("**", "");
                                            if (iIndexOf < 0 || iIndexOf2 < 0 || (i5 = iIndexOf2 - iIndexOf) <= 2) {
                                                iIndexOf = -1;
                                                i4 = 0;
                                            } else {
                                                i4 = i5 - 2;
                                            }
                                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder(strReplace);
                                            if (iIndexOf >= 0) {
                                                spannableStringBuilder9.setSpan(new ChatEditActivity.AnonymousClass9(1), iIndexOf, i4 + iIndexOf, 0);
                                            }
                                            spannableStringBuilder4 = spannableStringBuilder9;
                                        }
                                        createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true);
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
                                        iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i7).getCurrentTime());
                                        if (iMax == 0) {
                                            spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                        } else {
                                            shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                            if (shortDuration2.endsWith(".")) {
                                                shortDuration2 = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
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
                                } else if (i == 34) {
                                    createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else if (i == 35) {
                                    tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                                    spannableStringBuilder = new SpannableStringBuilder();
                                    shortName = DialogObject.getShortName(MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())));
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
                                        String string11 = LocaleController.getString(R.string.SharingOfferDisable1);
                                        int i14 = R.drawable.floating_check;
                                        spannableStringBuilder.append((CharSequence) createOption(i14, string11));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) createOption(i14, LocaleController.getString(R.string.SharingOfferDisable2)));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) createOption(i14, LocaleController.getString(R.string.SharingOfferDisable3)));
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        spannableStringBuilder.append((CharSequence) createOption(i14, LocaleController.getString(R.string.SharingOfferDisable4)));
                                    } else {
                                        spannableStringBuilder.append((CharSequence) "\n\n");
                                        String string12 = LocaleController.getString(R.string.SharingOfferEnable1);
                                        int i15 = R.drawable.floating_check;
                                        spannableStringBuilder.append((CharSequence) createOption(i15, string12));
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
                                } else if (i == 31) {
                                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(starGift4.title);
                                    sb.append(" #");
                                    strM = BillingController$$ExternalSyntheticOutline0.m(starGift4.num, ',', sb);
                                    fromChatId = messageObject2.getFromChatId();
                                    if (UserConfig.getInstance(i7).getClientUserId() == fromChatId) {
                                        string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                                    } else {
                                        string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i7, fromChatId), strM);
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
                                    boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i7);
                                    if (peerDialogId > j) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    String shortName2 = DialogObject.getShortName(i7, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                                    String shortName3 = DialogObject.getShortName(i7, -tL_messageActionChangeCommunity.community_id);
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
                                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                        MessageObject.addEntitiesToText(spannableStringBuilder11, tL_textWithEntities.entities, false, false, true, true);
                                        string4 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder11, textPaint.getFontMetricsInt(), false, (int[]) null), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                                    }
                                    if (string4 == null) {
                                        string4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                                    }
                                    CharSequence charSequence5 = string4;
                                    messageObject = this.currentMessageObject;
                                    if (messageObject != null) {
                                        message = messageObject.messageOwner;
                                        messageAction2 = message.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                            if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
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
                                    createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence5, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                                } else if (i == 21) {
                                    tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                                    MessagesController messagesController = MessagesController.getInstance(i7);
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
                                    if (user3.id == UserConfig.getInstance(i7).clientUserId) {
                                        user4 = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId()));
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
                                    CharSequence charSequence6 = string2;
                                    if (tL_messageActionSuggestProfilePhoto.video && ((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) {
                                        string3 = LocaleController.getString(R.string.ViewPhotoAction);
                                    } else {
                                        string3 = LocaleController.getString(R.string.ViewVideoAction);
                                    }
                                    createGiftPremiumLayouts(null, null, charSequence6, false, string3, 11, null, this.giftRectSize, true);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                } else if (i == 22) {
                                    MessagesController messagesController2 = MessagesController.getInstance(i7);
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
                                            if (user2 == null && user2.id == UserConfig.getInstance(i7).clientUserId) {
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
                                    user = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                                    if (user.self) {
                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
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
                            createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
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
                        } else {
                            TextPaint textPaint2 = this.giftTextPaint;
                            if (i == 30) {
                                user5 = MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
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
                                        clientUserId = UserConfig.getInstance(i7).getClientUserId();
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
                                        z6 = z5;
                                        spannableStringBuilder3 = new SpannableStringBuilder();
                                        userOrChat = MessagesController.getInstance(i7).getUserOrChat(fromChatId2);
                                        peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                        z7 = z4;
                                        TLObject userOrChat3 = MessagesController.getInstance(i7).getUserOrChat(peerDialogId2);
                                        if (tL_messageActionStarGift.can_upgrade) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        if (peerDialogId2 == j) {
                                            if (!z6) {
                                                if (tL_messageActionStarGift.prepaid_upgrade) {
                                                    i3 = R.string.Gift2ActionUpgradeTitle;
                                                } else {
                                                    i3 = R.string.Gift2ActionTitle;
                                                }
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                                if (DialogObject.hasPhoto(userOrChat)) {
                                                    spannableStringBuilder3.append((CharSequence) "a ");
                                                    AvatarSpan avatarSpan4 = new AvatarSpan(this, 18.0f, i7);
                                                    AvatarDrawable avatarDrawable3 = avatarSpan4.avatarDrawable;
                                                    avatarDrawable3.setInfo(avatarSpan4.currentAccount, userOrChat);
                                                    avatarSpan4.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable3);
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
                                                AvatarSpan avatarSpan5 = new AvatarSpan(this, 18.0f, i7);
                                                AvatarDrawable avatarDrawable4 = avatarSpan5.avatarDrawable;
                                                avatarDrawable4.setInfo(avatarSpan5.currentAccount, userOrChat);
                                                avatarSpan5.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable4);
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
                                                } else if (z7) {
                                                    if (tL_messageActionStarGift.converted) {
                                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                    } else if (z9) {
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
                                                } else if (z8) {
                                                    if (messageObject2.isOutOwner()) {
                                                        string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                    } else {
                                                        string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                    }
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                                } else if (messageObject2.isOutOwner()) {
                                                    if (!z9) {
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
                                                    if (z9) {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                    } else {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                    }
                                                } else if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                                }
                                            } else if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z7) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z9) {
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
                                            } else if (z8) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z9) {
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
                                                if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        }
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
                                                ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan2.setScale(0.8f, 0.8f);
                                                spannableStringBuilder12.setSpan(coloredImageSpan2, 0, 1, 33);
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
                                                ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan3.setScale(0.8f, 0.8f);
                                                spannableStringBuilder13.setSpan(coloredImageSpan3, 0, 1, 33);
                                                spannableStringBuilder13.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder13;
                                            }
                                        }
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null) {
                                            spannableStringBuilder4 = null;
                                        } else {
                                            spannableStringBuilder4 = null;
                                        }
                                        createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true);
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
                                    clientUserId = UserConfig.getInstance(i7).getClientUserId();
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
                                    z6 = z5;
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(i7).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    z7 = z4;
                                    TLObject userOrChat4 = MessagesController.getInstance(i7).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    if (peerDialogId2 == j) {
                                        if (!z6) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i3 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan6 = new AvatarSpan(this, 18.0f, i7);
                                                AvatarDrawable avatarDrawable5 = avatarSpan6.avatarDrawable;
                                                avatarDrawable5.setInfo(avatarSpan6.currentAccount, userOrChat);
                                                avatarSpan6.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable5);
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
                                            AvatarSpan avatarSpan7 = new AvatarSpan(this, 18.0f, i7);
                                            AvatarDrawable avatarDrawable6 = avatarSpan7.avatarDrawable;
                                            avatarDrawable6.setInfo(avatarSpan7.currentAccount, userOrChat);
                                            avatarSpan7.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable6);
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
                                            } else if (z7) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z9) {
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
                                            } else if (z8) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z9) {
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
                                                if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z7) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z9) {
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
                                        } else if (z8) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z9) {
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
                                            if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z9) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    }
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
                                            ColoredImageSpan coloredImageSpan4 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan4.setScale(0.8f, 0.8f);
                                            spannableStringBuilder14.setSpan(coloredImageSpan4, 0, 1, 33);
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
                                            ColoredImageSpan coloredImageSpan5 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan5.setScale(0.8f, 0.8f);
                                            spannableStringBuilder15.setSpan(coloredImageSpan5, 0, 1, 33);
                                            spannableStringBuilder15.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder15;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilder4 = null;
                                    } else {
                                        spannableStringBuilder4 = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true);
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
                                    iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i7).getCurrentTime());
                                    if (iMax == 0) {
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                    } else {
                                        shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                        if (shortDuration2.endsWith(".")) {
                                            shortDuration2 = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
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
                            } else if (i == 34) {
                                createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())));
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
                                    String string13 = LocaleController.getString(R.string.SharingOfferDisable1);
                                    int i16 = R.drawable.floating_check;
                                    spannableStringBuilder.append((CharSequence) createOption(i16, string13));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i16, LocaleController.getString(R.string.SharingOfferDisable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i16, LocaleController.getString(R.string.SharingOfferDisable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i16, LocaleController.getString(R.string.SharingOfferDisable4)));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string14 = LocaleController.getString(R.string.SharingOfferEnable1);
                                    int i17 = R.drawable.floating_check;
                                    spannableStringBuilder.append((CharSequence) createOption(i17, string14));
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
                            } else if (i == 31) {
                                TL_stars.StarGift starGift5 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(starGift5.title);
                                sb2.append(" #");
                                strM = BillingController$$ExternalSyntheticOutline0.m(starGift5.num, ',', sb2);
                                fromChatId = messageObject2.getFromChatId();
                                if (UserConfig.getInstance(i7).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i7, fromChatId), strM);
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
                                boolean zIsChannelAndNotMegaGroup2 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i7);
                                if (peerDialogId > j) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                String shortName4 = DialogObject.getShortName(i7, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                                String shortName5 = DialogObject.getShortName(i7, -tL_messageActionChangeCommunity2.community_id);
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
                                CharSequence charSequence7 = string4;
                                messageObject = this.currentMessageObject;
                                if (messageObject != null) {
                                    message = messageObject.messageOwner;
                                    messageAction2 = message.action;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                        i2 = R.string.ActionGiftPremiumView;
                                    } else {
                                        if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                                            i2 = R.string.GiftPremiumUseGiftBtn;
                                        } else {
                                            i2 = R.string.ActionGiftPremiumView;
                                        }
                                    }
                                } else {
                                    i2 = R.string.ActionGiftPremiumView;
                                }
                                createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence7, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                            } else if (i == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                                MessagesController messagesController3 = MessagesController.getInstance(i7);
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
                                if (user3.id == UserConfig.getInstance(i7).clientUserId) {
                                    user4 = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId()));
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
                                CharSequence charSequence8 = string2;
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                createGiftPremiumLayouts(null, null, charSequence8, false, string3, 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 22) {
                                MessagesController messagesController4 = MessagesController.getInstance(i7);
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
                                user = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
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
            } else {
                charSequence = charSequenceReplaceCharSequence;
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
                        } else {
                            TextPaint textPaint3 = this.giftTextPaint;
                            if (i == 30) {
                                user5 = MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
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
                                        clientUserId = UserConfig.getInstance(i7).getClientUserId();
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
                                        z6 = z5;
                                        spannableStringBuilder3 = new SpannableStringBuilder();
                                        userOrChat = MessagesController.getInstance(i7).getUserOrChat(fromChatId2);
                                        peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                        z7 = z4;
                                        TLObject userOrChat5 = MessagesController.getInstance(i7).getUserOrChat(peerDialogId2);
                                        if (tL_messageActionStarGift.can_upgrade) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        if (peerDialogId2 == j) {
                                            if (!z6) {
                                                if (tL_messageActionStarGift.prepaid_upgrade) {
                                                    i3 = R.string.Gift2ActionUpgradeTitle;
                                                } else {
                                                    i3 = R.string.Gift2ActionTitle;
                                                }
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                                if (DialogObject.hasPhoto(userOrChat)) {
                                                    spannableStringBuilder3.append((CharSequence) "a ");
                                                    AvatarSpan avatarSpan8 = new AvatarSpan(this, 18.0f, i7);
                                                    AvatarDrawable avatarDrawable7 = avatarSpan8.avatarDrawable;
                                                    avatarDrawable7.setInfo(avatarSpan8.currentAccount, userOrChat);
                                                    avatarSpan8.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable7);
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
                                                AvatarSpan avatarSpan9 = new AvatarSpan(this, 18.0f, i7);
                                                AvatarDrawable avatarDrawable8 = avatarSpan9.avatarDrawable;
                                                avatarDrawable8.setInfo(avatarSpan9.currentAccount, userOrChat);
                                                avatarSpan9.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable8);
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
                                                } else if (z7) {
                                                    if (tL_messageActionStarGift.converted) {
                                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                    } else if (z9) {
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
                                                } else if (z8) {
                                                    if (messageObject2.isOutOwner()) {
                                                        string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                    } else {
                                                        string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                    }
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                                } else if (messageObject2.isOutOwner()) {
                                                    if (!z9) {
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
                                                    if (z9) {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                    } else {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                    }
                                                } else if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                                }
                                            } else if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z7) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z9) {
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
                                            } else if (z8) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z9) {
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
                                                if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        }
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
                                                ColoredImageSpan coloredImageSpan6 = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan6.setScale(0.8f, 0.8f);
                                                spannableStringBuilder17.setSpan(coloredImageSpan6, 0, 1, 33);
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
                                                ColoredImageSpan coloredImageSpan7 = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan7.setScale(0.8f, 0.8f);
                                                spannableStringBuilder18.setSpan(coloredImageSpan7, 0, 1, 33);
                                                spannableStringBuilder18.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder18;
                                            }
                                        }
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null) {
                                            spannableStringBuilder4 = null;
                                        } else {
                                            spannableStringBuilder4 = null;
                                        }
                                        createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true);
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
                                    clientUserId = UserConfig.getInstance(i7).getClientUserId();
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
                                    z6 = z5;
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(i7).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    z7 = z4;
                                    TLObject userOrChat6 = MessagesController.getInstance(i7).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    if (peerDialogId2 == j) {
                                        if (!z6) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i3 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan10 = new AvatarSpan(this, 18.0f, i7);
                                                AvatarDrawable avatarDrawable9 = avatarSpan10.avatarDrawable;
                                                avatarDrawable9.setInfo(avatarSpan10.currentAccount, userOrChat);
                                                avatarSpan10.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable9);
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
                                            AvatarSpan avatarSpan11 = new AvatarSpan(this, 18.0f, i7);
                                            AvatarDrawable avatarDrawable10 = avatarSpan11.avatarDrawable;
                                            avatarDrawable10.setInfo(avatarSpan11.currentAccount, userOrChat);
                                            avatarSpan11.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable10);
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
                                            } else if (z7) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z9) {
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
                                            } else if (z8) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z9) {
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
                                                if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z7) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z9) {
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
                                        } else if (z8) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z9) {
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
                                            if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z9) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    }
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
                                            ColoredImageSpan coloredImageSpan8 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan8.setScale(0.8f, 0.8f);
                                            spannableStringBuilder19.setSpan(coloredImageSpan8, 0, 1, 33);
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
                                            ColoredImageSpan coloredImageSpan9 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan9.setScale(0.8f, 0.8f);
                                            spannableStringBuilder110.setSpan(coloredImageSpan9, 0, 1, 33);
                                            spannableStringBuilder110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder110;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilder4 = null;
                                    } else {
                                        spannableStringBuilder4 = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true);
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
                                    iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i7).getCurrentTime());
                                    if (iMax == 0) {
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                    } else {
                                        shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                        if (shortDuration2.endsWith(".")) {
                                            shortDuration2 = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
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
                            } else if (i == 34) {
                                createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())));
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
                                    String string15 = LocaleController.getString(R.string.SharingOfferDisable1);
                                    int i18 = R.drawable.floating_check;
                                    spannableStringBuilder.append((CharSequence) createOption(i18, string15));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i18, LocaleController.getString(R.string.SharingOfferDisable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i18, LocaleController.getString(R.string.SharingOfferDisable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i18, LocaleController.getString(R.string.SharingOfferDisable4)));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string16 = LocaleController.getString(R.string.SharingOfferEnable1);
                                    int i19 = R.drawable.floating_check;
                                    spannableStringBuilder.append((CharSequence) createOption(i19, string16));
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
                            } else if (i == 31) {
                                TL_stars.StarGift starGift6 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(starGift6.title);
                                sb3.append(" #");
                                strM = BillingController$$ExternalSyntheticOutline0.m(starGift6.num, ',', sb3);
                                fromChatId = messageObject2.getFromChatId();
                                if (UserConfig.getInstance(i7).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i7, fromChatId), strM);
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
                                boolean zIsChannelAndNotMegaGroup3 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i7);
                                if (peerDialogId > j) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                String shortName6 = DialogObject.getShortName(i7, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                                String shortName7 = DialogObject.getShortName(i7, -tL_messageActionChangeCommunity3.community_id);
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
                                CharSequence charSequence9 = string4;
                                messageObject = this.currentMessageObject;
                                if (messageObject != null) {
                                    message = messageObject.messageOwner;
                                    messageAction2 = message.action;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                        i2 = R.string.ActionGiftPremiumView;
                                    } else {
                                        if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                                            i2 = R.string.GiftPremiumUseGiftBtn;
                                        } else {
                                            i2 = R.string.ActionGiftPremiumView;
                                        }
                                    }
                                } else {
                                    i2 = R.string.ActionGiftPremiumView;
                                }
                                createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence9, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                            } else if (i == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                                MessagesController messagesController5 = MessagesController.getInstance(i7);
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
                                if (user3.id == UserConfig.getInstance(i7).clientUserId) {
                                    user4 = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId()));
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
                                CharSequence charSequence10 = string2;
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                createGiftPremiumLayouts(null, null, charSequence10, false, string3, 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 22) {
                                MessagesController messagesController6 = MessagesController.getInstance(i7);
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
                                user = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
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
                            ImageReceiver imageReceiver4 = this.imageReceiver;
                            float f7 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                            float fDp4 = AndroidUtilities.dp(19.0f) + this.textHeight;
                            float f8 = AndroidUtilities.roundMessageSize;
                            imageReceiver4.setImageCoords(f7, fDp4, f8, f8);
                        } else if (i == 25) {
                            createGiftPremiumChannelLayouts();
                        } else {
                            TextPaint textPaint4 = this.giftTextPaint;
                            if (i == 30) {
                                user5 = MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
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
                                        clientUserId = UserConfig.getInstance(i7).getClientUserId();
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
                                        z6 = z5;
                                        spannableStringBuilder3 = new SpannableStringBuilder();
                                        userOrChat = MessagesController.getInstance(i7).getUserOrChat(fromChatId2);
                                        peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                        z7 = z4;
                                        TLObject userOrChat7 = MessagesController.getInstance(i7).getUserOrChat(peerDialogId2);
                                        if (tL_messageActionStarGift.can_upgrade) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                        if (peerDialogId2 == j) {
                                            if (!z6) {
                                                if (tL_messageActionStarGift.prepaid_upgrade) {
                                                    i3 = R.string.Gift2ActionUpgradeTitle;
                                                } else {
                                                    i3 = R.string.Gift2ActionTitle;
                                                }
                                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                                if (DialogObject.hasPhoto(userOrChat)) {
                                                    spannableStringBuilder3.append((CharSequence) "a ");
                                                    AvatarSpan avatarSpan12 = new AvatarSpan(this, 18.0f, i7);
                                                    AvatarDrawable avatarDrawable11 = avatarSpan12.avatarDrawable;
                                                    avatarDrawable11.setInfo(avatarSpan12.currentAccount, userOrChat);
                                                    avatarSpan12.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable11);
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
                                                AvatarSpan avatarSpan13 = new AvatarSpan(this, 18.0f, i7);
                                                AvatarDrawable avatarDrawable12 = avatarSpan13.avatarDrawable;
                                                avatarDrawable12.setInfo(avatarSpan13.currentAccount, userOrChat);
                                                avatarSpan13.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable12);
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
                                                } else if (z7) {
                                                    if (tL_messageActionStarGift.converted) {
                                                        charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                    } else if (z9) {
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
                                                } else if (z8) {
                                                    if (messageObject2.isOutOwner()) {
                                                        string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                    } else {
                                                        string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                    }
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                                } else if (messageObject2.isOutOwner()) {
                                                    if (!z9) {
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
                                                    if (z9) {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                    } else {
                                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                    }
                                                } else if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                                }
                                            } else if (tL_messageActionStarGift.auction_acquired) {
                                                charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                            } else if (z7) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z9) {
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
                                            } else if (z8) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z9) {
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
                                                if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        }
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
                                                ColoredImageSpan coloredImageSpan10 = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan10.setScale(0.8f, 0.8f);
                                                spannableStringBuilder112.setSpan(coloredImageSpan10, 0, 1, 33);
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
                                                ColoredImageSpan coloredImageSpan11 = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan11.setScale(0.8f, 0.8f);
                                                spannableStringBuilder113.setSpan(coloredImageSpan11, 0, 1, 33);
                                                spannableStringBuilder113.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                                charSequence4 = spannableStringBuilder113;
                                            }
                                        }
                                        starGift3 = tL_messageActionStarGift.gift;
                                        if (starGift3 != null) {
                                            spannableStringBuilder4 = null;
                                        } else {
                                            spannableStringBuilder4 = null;
                                        }
                                        createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true);
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
                                    clientUserId = UserConfig.getInstance(i7).getClientUserId();
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
                                    z6 = z5;
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(i7).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    z7 = z4;
                                    TLObject userOrChat8 = MessagesController.getInstance(i7).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    if (peerDialogId2 == j) {
                                        if (!z6) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i3 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan14 = new AvatarSpan(this, 18.0f, i7);
                                                AvatarDrawable avatarDrawable13 = avatarSpan14.avatarDrawable;
                                                avatarDrawable13.setInfo(avatarSpan14.currentAccount, userOrChat);
                                                avatarSpan14.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable13);
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
                                            AvatarSpan avatarSpan15 = new AvatarSpan(this, 18.0f, i7);
                                            AvatarDrawable avatarDrawable14 = avatarSpan15.avatarDrawable;
                                            avatarDrawable14.setInfo(avatarSpan15.currentAccount, userOrChat);
                                            avatarSpan15.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable14);
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
                                            } else if (z7) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z9) {
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
                                            } else if (z8) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z9) {
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
                                                if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z7) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z9) {
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
                                        } else if (z8) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z9) {
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
                                            if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z9) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    }
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
                                            ColoredImageSpan coloredImageSpan12 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan12.setScale(0.8f, 0.8f);
                                            spannableStringBuilder114.setSpan(coloredImageSpan12, 0, 1, 33);
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
                                            ColoredImageSpan coloredImageSpan13 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan13.setScale(0.8f, 0.8f);
                                            spannableStringBuilder115.setSpan(coloredImageSpan13, 0, 1, 33);
                                            spannableStringBuilder115.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder115;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilder4 = null;
                                    } else {
                                        spannableStringBuilder4 = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true);
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
                                    iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i7).getCurrentTime());
                                    if (iMax == 0) {
                                        spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                    } else {
                                        shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                        if (shortDuration2.endsWith(".")) {
                                            shortDuration2 = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
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
                            } else if (i == 34) {
                                createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 35) {
                                tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                                spannableStringBuilder = new SpannableStringBuilder();
                                shortName = DialogObject.getShortName(MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())));
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
                                    String string17 = LocaleController.getString(R.string.SharingOfferDisable1);
                                    int i110 = R.drawable.floating_check;
                                    spannableStringBuilder.append((CharSequence) createOption(i110, string17));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i110, LocaleController.getString(R.string.SharingOfferDisable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i110, LocaleController.getString(R.string.SharingOfferDisable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i110, LocaleController.getString(R.string.SharingOfferDisable4)));
                                } else {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    String string18 = LocaleController.getString(R.string.SharingOfferEnable1);
                                    int i111 = R.drawable.floating_check;
                                    spannableStringBuilder.append((CharSequence) createOption(i111, string18));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i111, LocaleController.getString(R.string.SharingOfferEnable2)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i111, LocaleController.getString(R.string.SharingOfferEnable3)));
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                    spannableStringBuilder.append((CharSequence) createOption(i111, LocaleController.getString(R.string.SharingOfferEnable4)));
                                }
                                createGiftPremiumLayouts(null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 31) {
                                TL_stars.StarGift starGift7 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(starGift7.title);
                                sb4.append(" #");
                                strM = BillingController$$ExternalSyntheticOutline0.m(starGift7.num, ',', sb4);
                                fromChatId = messageObject2.getFromChatId();
                                if (UserConfig.getInstance(i7).getClientUserId() == fromChatId) {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                                } else {
                                    string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i7, fromChatId), strM);
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
                                boolean zIsChannelAndNotMegaGroup4 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i7);
                                if (peerDialogId > j) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                String shortName8 = DialogObject.getShortName(i7, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                                String shortName9 = DialogObject.getShortName(i7, -tL_messageActionChangeCommunity4.community_id);
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
                                CharSequence charSequence11 = string4;
                                messageObject = this.currentMessageObject;
                                if (messageObject != null) {
                                    message = messageObject.messageOwner;
                                    messageAction2 = message.action;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                        i2 = R.string.ActionGiftPremiumView;
                                    } else {
                                        if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                                            i2 = R.string.GiftPremiumUseGiftBtn;
                                        } else {
                                            i2 = R.string.ActionGiftPremiumView;
                                        }
                                    }
                                } else {
                                    i2 = R.string.ActionGiftPremiumView;
                                }
                                createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence11, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                            } else if (i == 21) {
                                tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                                MessagesController messagesController7 = MessagesController.getInstance(i7);
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
                                if (user3.id == UserConfig.getInstance(i7).clientUserId) {
                                    user4 = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId()));
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
                                CharSequence charSequence12 = string2;
                                if (tL_messageActionSuggestProfilePhoto.video) {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                } else {
                                    string3 = LocaleController.getString(R.string.ViewVideoAction);
                                }
                                createGiftPremiumLayouts(null, null, charSequence12, false, string3, 11, null, this.giftRectSize, true);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (i == 22) {
                                MessagesController messagesController8 = MessagesController.getInstance(i7);
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
                                user = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                                if (user.self) {
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
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
                    i = messageObject2.type;
                    if (i == 11) {
                        ImageReceiver imageReceiver5 = this.imageReceiver;
                        float f9 = (this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f;
                        float fDp5 = AndroidUtilities.dp(19.0f) + this.textHeight;
                        float f10 = AndroidUtilities.roundMessageSize;
                        imageReceiver5.setImageCoords(f9, fDp5, f10, f10);
                    } else if (i == 25) {
                        createGiftPremiumChannelLayouts();
                    } else {
                        TextPaint textPaint5 = this.giftTextPaint;
                        if (i == 30) {
                            user5 = MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
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
                                    clientUserId = UserConfig.getInstance(i7).getClientUserId();
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
                                    z6 = z5;
                                    spannableStringBuilder3 = new SpannableStringBuilder();
                                    userOrChat = MessagesController.getInstance(i7).getUserOrChat(fromChatId2);
                                    peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                    z7 = z4;
                                    TLObject userOrChat9 = MessagesController.getInstance(i7).getUserOrChat(peerDialogId2);
                                    if (tL_messageActionStarGift.can_upgrade) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    if (peerDialogId2 == j) {
                                        if (!z6) {
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i3 = R.string.Gift2ActionUpgradeTitle;
                                            } else {
                                                i3 = R.string.Gift2ActionTitle;
                                            }
                                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                            if (DialogObject.hasPhoto(userOrChat)) {
                                                spannableStringBuilder3.append((CharSequence) "a ");
                                                AvatarSpan avatarSpan16 = new AvatarSpan(this, 18.0f, i7);
                                                AvatarDrawable avatarDrawable15 = avatarSpan16.avatarDrawable;
                                                avatarDrawable15.setInfo(avatarSpan16.currentAccount, userOrChat);
                                                avatarSpan16.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable15);
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
                                            AvatarSpan avatarSpan17 = new AvatarSpan(this, 18.0f, i7);
                                            AvatarDrawable avatarDrawable16 = avatarSpan17.avatarDrawable;
                                            avatarDrawable16.setInfo(avatarSpan17.currentAccount, userOrChat);
                                            avatarSpan17.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable16);
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
                                            } else if (z7) {
                                                if (tL_messageActionStarGift.converted) {
                                                    charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                                } else if (z9) {
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
                                            } else if (z8) {
                                                if (messageObject2.isOutOwner()) {
                                                    string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                                } else {
                                                    string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                                }
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                            } else if (messageObject2.isOutOwner()) {
                                                if (!z9) {
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
                                                if (z9) {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                                } else {
                                                    charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                                }
                                            } else if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                            } else {
                                                charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                            }
                                        } else if (tL_messageActionStarGift.auction_acquired) {
                                            charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                        } else if (z7) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z9) {
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
                                        } else if (z8) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z9) {
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
                                            if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z9) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    }
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
                                            ColoredImageSpan coloredImageSpan14 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan14.setScale(0.8f, 0.8f);
                                            spannableStringBuilder117.setSpan(coloredImageSpan14, 0, 1, 33);
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
                                            ColoredImageSpan coloredImageSpan15 = new ColoredImageSpan(R.drawable.gift_unpack);
                                            coloredImageSpan15.setScale(0.8f, 0.8f);
                                            spannableStringBuilder118.setSpan(coloredImageSpan15, 0, 1, 33);
                                            spannableStringBuilder118.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                            charSequence4 = spannableStringBuilder118;
                                        }
                                    }
                                    starGift3 = tL_messageActionStarGift.gift;
                                    if (starGift3 != null) {
                                        spannableStringBuilder4 = null;
                                    } else {
                                        spannableStringBuilder4 = null;
                                    }
                                    createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true);
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
                                clientUserId = UserConfig.getInstance(i7).getClientUserId();
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
                                z6 = z5;
                                spannableStringBuilder3 = new SpannableStringBuilder();
                                userOrChat = MessagesController.getInstance(i7).getUserOrChat(fromChatId2);
                                peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                                z7 = z4;
                                TLObject userOrChat10 = MessagesController.getInstance(i7).getUserOrChat(peerDialogId2);
                                if (tL_messageActionStarGift.can_upgrade) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (peerDialogId2 == j) {
                                    if (!z6) {
                                        if (tL_messageActionStarGift.prepaid_upgrade) {
                                            i3 = R.string.Gift2ActionUpgradeTitle;
                                        } else {
                                            i3 = R.string.Gift2ActionTitle;
                                        }
                                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(i3)).append((CharSequence) " ");
                                        if (DialogObject.hasPhoto(userOrChat)) {
                                            spannableStringBuilder3.append((CharSequence) "a ");
                                            AvatarSpan avatarSpan18 = new AvatarSpan(this, 18.0f, i7);
                                            AvatarDrawable avatarDrawable17 = avatarSpan18.avatarDrawable;
                                            avatarDrawable17.setInfo(avatarSpan18.currentAccount, userOrChat);
                                            avatarSpan18.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable17);
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
                                        AvatarSpan avatarSpan19 = new AvatarSpan(this, 18.0f, i7);
                                        AvatarDrawable avatarDrawable18 = avatarSpan19.avatarDrawable;
                                        avatarDrawable18.setInfo(avatarSpan19.currentAccount, userOrChat);
                                        avatarSpan19.imageReceiver.setForUserOrChat(userOrChat, avatarDrawable18);
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
                                        } else if (z7) {
                                            if (tL_messageActionStarGift.converted) {
                                                charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                            } else if (z9) {
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
                                        } else if (z8) {
                                            if (messageObject2.isOutOwner()) {
                                                string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                            } else {
                                                string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                            }
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                        } else if (messageObject2.isOutOwner()) {
                                            if (!z9) {
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
                                            if (z9) {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                            } else {
                                                charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                            }
                                        } else if (z9) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                        } else {
                                            charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                        }
                                    } else if (tL_messageActionStarGift.auction_acquired) {
                                        charSequenceReplaceTags4 = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                                    } else if (z7) {
                                        if (tL_messageActionStarGift.converted) {
                                            charSequenceReplaceTags4 = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j2);
                                        } else if (z9) {
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
                                    } else if (z8) {
                                        if (messageObject2.isOutOwner()) {
                                            string6 = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user5));
                                        } else {
                                            string6 = LocaleController.getString(R.string.Gift2ActionUpgrade);
                                        }
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(string6);
                                    } else if (messageObject2.isOutOwner()) {
                                        if (!z9) {
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
                                        if (z9) {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (z9) {
                                        charSequenceReplaceTags4 = LocaleController.getString(R.string.Gift2ActionBotInfo);
                                    } else {
                                        charSequenceReplaceTags4 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j2));
                                    }
                                }
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
                                        ColoredImageSpan coloredImageSpan16 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan16.setScale(0.8f, 0.8f);
                                        spannableStringBuilder119.setSpan(coloredImageSpan16, 0, 1, 33);
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
                                        ColoredImageSpan coloredImageSpan17 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan17.setScale(0.8f, 0.8f);
                                        spannableStringBuilder1110.setSpan(coloredImageSpan17, 0, 1, 33);
                                        spannableStringBuilder1110.append((CharSequence) LocaleController.getString(R.string.Gift2Unpack));
                                        charSequence4 = spannableStringBuilder1110;
                                    }
                                }
                                starGift3 = tL_messageActionStarGift.gift;
                                if (starGift3 != null) {
                                    spannableStringBuilder4 = null;
                                } else {
                                    spannableStringBuilder4 = null;
                                }
                                createGiftPremiumLayouts(spannableStringBuilder3, spannableStringBuilder4, charSequenceReplaceTags4, false, charSequence4, 11, string7, this.giftRectSize, true);
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
                                iMax = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i7).getCurrentTime());
                                if (iMax == 0) {
                                    spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                                } else {
                                    shortDuration2 = LocaleController.formatShortDuration2(iMax);
                                    if (shortDuration2.endsWith(".")) {
                                        shortDuration2 = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 0, shortDuration2);
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
                        } else if (i == 34) {
                            createGiftPremiumLayouts(null, null, charSequence, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 35) {
                            tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message4.action;
                            spannableStringBuilder = new SpannableStringBuilder();
                            shortName = DialogObject.getShortName(MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())));
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
                                String string19 = LocaleController.getString(R.string.SharingOfferDisable1);
                                int i112 = R.drawable.floating_check;
                                spannableStringBuilder.append((CharSequence) createOption(i112, string19));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i112, LocaleController.getString(R.string.SharingOfferDisable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i112, LocaleController.getString(R.string.SharingOfferDisable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i112, LocaleController.getString(R.string.SharingOfferDisable4)));
                            } else {
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                String string110 = LocaleController.getString(R.string.SharingOfferEnable1);
                                int i113 = R.drawable.floating_check;
                                spannableStringBuilder.append((CharSequence) createOption(i113, string110));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i113, LocaleController.getString(R.string.SharingOfferEnable2)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i113, LocaleController.getString(R.string.SharingOfferEnable3)));
                                spannableStringBuilder.append((CharSequence) "\n\n");
                                spannableStringBuilder.append((CharSequence) createOption(i113, LocaleController.getString(R.string.SharingOfferEnable4)));
                            }
                            createGiftPremiumLayouts(null, null, spannableStringBuilder, false, null, 11, null, this.giftRectSize, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 31) {
                            TL_stars.StarGift starGift8 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message4.action).theme).gift;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(starGift8.title);
                            sb5.append(" #");
                            strM = BillingController$$ExternalSyntheticOutline0.m(starGift8.num, ',', sb5);
                            fromChatId = messageObject2.getFromChatId();
                            if (UserConfig.getInstance(i7).getClientUserId() == fromChatId) {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByYou, strM);
                            } else {
                                string5 = LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i7, fromChatId), strM);
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
                            boolean zIsChannelAndNotMegaGroup5 = ChatObject.isChannelAndNotMegaGroup(-peerDialogId, i7);
                            if (peerDialogId > j) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            String shortName10 = DialogObject.getShortName(i7, DialogObject.getPeerDialogId(messageObject2.messageOwner.from_id));
                            String shortName11 = DialogObject.getShortName(i7, -tL_messageActionChangeCommunity5.community_id);
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
                            CharSequence charSequence13 = string4;
                            messageObject = this.currentMessageObject;
                            if (messageObject != null) {
                                message = messageObject.messageOwner;
                                messageAction2 = message.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                                    i2 = R.string.ActionGiftPremiumView;
                                } else {
                                    if (((messageAction2 == null || (messageAction2 instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) ? UserObject.isUserSelf(MessagesController.getInstance(i7).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id))) : false) {
                                        i2 = R.string.GiftPremiumUseGiftBtn;
                                    } else {
                                        i2 = R.string.ActionGiftPremiumView;
                                    }
                                }
                            } else {
                                i2 = R.string.ActionGiftPremiumView;
                            }
                            createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject2.messageOwner.action.months), null, charSequence13, true, LocaleController.getString(i2), 11, null, this.giftRectSize, false);
                        } else if (i == 21) {
                            tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message4.action;
                            MessagesController messagesController9 = MessagesController.getInstance(i7);
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
                            if (user3.id == UserConfig.getInstance(i7).clientUserId) {
                                user4 = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId()));
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
                            CharSequence charSequence14 = string2;
                            if (tL_messageActionSuggestProfilePhoto.video) {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            } else {
                                string3 = LocaleController.getString(R.string.ViewVideoAction);
                            }
                            createGiftPremiumLayouts(null, null, charSequence14, false, string3, 11, null, this.giftRectSize, true);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        } else if (i == 22) {
                            MessagesController messagesController10 = MessagesController.getInstance(i7);
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
                            user = MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                            if (user.self) {
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i7).getUser(Long.valueOf(messageObject2.getDialogId())).first_name));
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
        }
        int iDp = AndroidUtilities.dp(12.0f);
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        reactionsLayoutInBubble.x = iDp;
        reactionsLayoutInBubble.measure(this.previousWidth - AndroidUtilities.dp(24.0f), 1);
    }

    public final void checkLeftRightBounds() {
        float f = this.backgroundLeft;
        RectF rectF = this.rect;
        this.backgroundLeft = (int) Math.min(f, rectF.left);
        this.backgroundRight = (int) Math.max(this.backgroundRight, rectF.right);
    }

    public final boolean checkUnreadReactions(float f, int i) {
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.hasUnreadReactions) {
            return false;
        }
        float y = getY() + reactionsLayoutInBubble.y;
        return y > f && (y + ((float) reactionsLayoutInBubble.height)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i);
    }

    public final void createGiftPremiumChannelLayouts() {
        SpannableStringBuilder spannableStringBuilder;
        int iDp = this.giftRectSize - AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.giftTitlePaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        TextPaint textPaint2 = this.giftTextPaint;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
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
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.giftPremiumTitleLayout = new StaticLayout(spannableStringBuilderValueOf, textPaint, iDp, alignment, 1.1f, 0.0f, false);
        this.giftPremiumReleasedText = null;
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            AnimatedEmojiSpan.release((ChatActionCell) textLayout.this$0, (AnimatedEmojiSpan.EmojiGroupedSpans) textLayout.emoji);
        }
        TextLayout textLayout2 = new TextLayout(this);
        this.giftPremiumText = textLayout2;
        textLayout2.setText(spannableStringBuilder, textPaint2, iDp);
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
            TextPaint textPaint = this.giftTitlePaint;
            if (messageObject2 == null || messageObject2.type != 30) {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            }
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            spannableStringBuilderValueOf.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilderValueOf.length(), 33);
            r4 = 0;
            this.giftPremiumTitleLayout = new StaticLayout(spannableStringBuilderValueOf, textPaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r4 = 0;
            this.giftPremiumTitleLayout = null;
        }
        if (spannableStringBuilder != null) {
            Text text = new Text(spannableStringBuilder, 10.0f, null);
            this.giftPremiumReleasedText = text;
            text.paint.linkColor = -1;
        } else {
            this.giftPremiumReleasedText = null;
        }
        MessageObject messageObject3 = this.currentMessageObject;
        TextPaint textPaint2 = this.giftTextPaint;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 == null || !(isNewStyleButtonLayout() || (i3 = this.currentMessageObject.type) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }
        int iDp2 = i4 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.currentMessageObject;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (iCutInFancyHalf = HintView2.cutInFancyHalf(charSequence4, textPaint2)) < iDp2 && iCutInFancyHalf > iDp2 / 5.0f) {
            iDp2 = iCutInFancyHalf;
        }
        if (charSequence4 == null) {
            TextLayout textLayout = this.giftPremiumText;
            if (textLayout != null) {
                AnimatedEmojiSpan.release((ChatActionCell) textLayout.this$0, (AnimatedEmojiSpan.EmojiGroupedSpans) textLayout.emoji);
                this.giftPremiumText = null;
            }
            this.giftPremiumTextCollapsed = r4;
        } else {
            if (this.giftPremiumText == null) {
                this.giftPremiumText = new TextLayout(this);
            }
            try {
                ReplaceEmoji = Emoji.replaceEmoji(charSequence4, textPaint2.getFontMetricsInt(), r4);
            } catch (Exception unused) {
                ReplaceEmoji = charSequence4;
            }
            this.giftPremiumText.setText(ReplaceEmoji, textPaint2, iDp2);
            if (!z || ((StaticLayout) this.giftPremiumText.layout).getLineCount() <= 3) {
                this.giftPremiumTextCollapsed = r4;
                this.giftPremiumTextExpandedAnimated.set(true, true);
                this.giftPremiumTextCollapsedHeight = r4;
            } else {
                this.giftPremiumTextCollapsed = !this.giftPremiumTextUncollapsed;
                this.giftPremiumTextCollapsedHeight = ((StaticLayout) this.giftPremiumText.layout).getLineBottom(2);
                this.giftPremiumTextMore = new Text(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.giftPremiumText.layout).getLineBottom(2);
                this.giftPremiumTextMoreY = lineBottom;
                this.giftPremiumTextMoreH = lineBottom - ((StaticLayout) this.giftPremiumText.layout).getLineTop(2);
                this.giftPremiumTextMoreX = (int) ((StaticLayout) this.giftPremiumText.layout).getLineRight(2);
            }
            if (this.giftPremiumTextCollapsed) {
                int lineEnd = ((StaticLayout) this.giftPremiumText.layout).getLineEnd(2) - 1;
                ?? r10 = this.giftPremiumText;
                if (lineEnd >= 0) {
                    SubSequence = ReplaceEmoji;
                    SubSequence = ReplaceEmoji.subSequence(r4, lineEnd);
                }
                SubSequence = ReplaceEmoji;
                r10.setText(SubSequence, textPaint2, iDp2);
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
        text2.ellipsizeWidth = AndroidUtilities.dp(62.0f);
    }

    public final void createLayout(int i, CharSequence charSequence) {
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
            this.textY = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.titleHeight, 11.0f, iDp2);
        }
        this.textXLeft = (i - (isMessageActionSuggestedPostApproval() ? this.textWidth : this.textLayout.getWidth())) / 2;
        this.titleXLeft = (i - i4) / 2;
        Stack stack = this.spoilersPool;
        ArrayList arrayList = this.spoilers;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence2 instanceof Spannable) {
            StaticLayout staticLayout2 = this.textLayout;
            int i6 = this.textX;
            SpoilerEffect.addSpoilers(this, staticLayout2, i6, i6 + this.textWidth, (Spannable) charSequence2, stack, arrayList, null);
        }
    }

    @Override
    public final void didPressReactionFromLayout(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            chatActionCellDelegate.didPressReaction(this, reactionCount, z, f, f2);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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

    public final void drawBackground(Canvas canvas, boolean z) {
        Paint paint;
        Paint paint2;
        Theme.ResourcesProvider resourcesProvider;
        float f;
        float f2;
        float f3;
        float f4;
        ChatActionCell chatActionCell;
        Paint paint3;
        Paint paint4;
        int alpha;
        int alpha2;
        Canvas canvas2;
        int i;
        TextLayout textLayout;
        RectF rectF;
        int iIntValue;
        float f5;
        float f6;
        int i2;
        ChatActionCell chatActionCell2 = this;
        if (!chatActionCell2.canDrawInParent || ((!chatActionCell2.hasGradientService() || z) && (chatActionCell2.hasGradientService() || !z))) {
            Paint themedPaint = chatActionCell2.getThemedPaint("paintChatActionBackground");
            Paint themedPaint2 = chatActionCell2.getThemedPaint("paintChatActionBackgroundDarken");
            chatActionCell2.textPaint = (TextPaint) chatActionCell2.getThemedPaint("paintChatActionText");
            int i3 = chatActionCell2.overrideBackground;
            Theme.ResourcesProvider resourcesProvider2 = chatActionCell2.themeDelegate;
            if (i3 >= 0) {
                int color = Theme.getColor(i3, resourcesProvider2);
                if (chatActionCell2.overrideBackgroundPaint == null) {
                    Paint paint5 = new Paint(1);
                    chatActionCell2.overrideBackgroundPaint = paint5;
                    paint5.setColor(color);
                    TextPaint textPaint = new TextPaint(1);
                    chatActionCell2.overrideTextPaint = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    chatActionCell2.overrideTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    chatActionCell2.overrideTextPaint.setColor(Theme.getColor(chatActionCell2.overrideText, resourcesProvider2));
                }
                themedPaint = chatActionCell2.overrideBackgroundPaint;
                chatActionCell2.textPaint = chatActionCell2.overrideTextPaint;
            }
            boolean z2 = chatActionCell2.invalidatePath;
            Path path = chatActionCell2.backgroundPath;
            if (z2) {
                chatActionCell2.invalidatePath = false;
                chatActionCell2.backgroundLeft = chatActionCell2.getWidth();
                chatActionCell2.backgroundRight = 0;
                ArrayList arrayList = chatActionCell2.lineWidths;
                arrayList.clear();
                StaticLayout staticLayout = chatActionCell2.textLayout;
                int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
                int iDp = AndroidUtilities.dp(11.0f);
                f = 6.0f;
                int iDp2 = AndroidUtilities.dp(8.0f);
                int iM = 0;
                f2 = 8.0f;
                int i4 = 0;
                while (iM < lineCount) {
                    int iCeil = (int) Math.ceil(chatActionCell2.textLayout.getLineWidth(iM));
                    if (iM != 0 && (i2 = i4 - iCeil) > 0 && i2 <= (iDp * 1.5f) + iDp2) {
                        iCeil = i4;
                    }
                    iM = LocationController$$ExternalSyntheticOutline0.m(iCeil, iM, 1, arrayList);
                    i4 = iCeil;
                }
                f3 = 2.0f;
                f4 = 4.0f;
                for (int i5 = lineCount - 2; i5 >= 0; i5--) {
                    int iIntValue2 = ((Integer) arrayList.get(i5)).intValue();
                    int i6 = i4 - iIntValue2;
                    if (i6 <= 0 || i6 > (iDp * 1.5f) + iDp2) {
                        i4 = iIntValue2;
                    }
                    arrayList.set(i5, Integer.valueOf(i4));
                }
                int iDp3 = AndroidUtilities.dp(4.0f);
                int measuredWidth = chatActionCell2.getMeasuredWidth() / 2;
                int iDp4 = AndroidUtilities.dp(3.0f);
                int iDp5 = AndroidUtilities.dp(6.0f);
                int i7 = iDp - iDp4;
                ArrayList arrayList2 = chatActionCell2.lineHeights;
                arrayList2.clear();
                path.reset();
                float f7 = measuredWidth;
                path.moveTo(f7, iDp3);
                int i8 = i4;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    rectF = chatActionCell2.rect;
                    if (i10 >= lineCount) {
                        break;
                    }
                    int iIntValue3 = ((Integer) arrayList.get(i10)).intValue();
                    int i11 = lineCount;
                    int lineBottom = chatActionCell2.textLayout.getLineBottom(i10);
                    int i12 = i11 - 1;
                    int iIntValue4 = i10 < i12 ? ((Integer) arrayList.get(i10 + 1)).intValue() : 0;
                    int iDp6 = lineBottom - i9;
                    if (i10 == 0 || iIntValue3 > i8) {
                        iDp6 = AndroidUtilities.dp(3.0f) + iDp6;
                    }
                    if (i10 == i12 || iIntValue3 > iIntValue4) {
                        iDp6 = AndroidUtilities.dp(3.0f) + iDp6;
                    }
                    Paint paint6 = themedPaint;
                    float f8 = (iIntValue3 / 2.0f) + f7;
                    int i13 = (i10 == i12 || iIntValue3 >= iIntValue4 || i10 == 0 || iIntValue3 >= i8) ? iDp2 : iDp5;
                    if (i10 == 0 || iIntValue3 > i8) {
                        f6 = f8;
                        rectF.set((f6 - iDp4) - iDp, iDp3, f6 + i7, (iDp * 2) + iDp3);
                        checkLeftRightBounds();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f6 = f8;
                        if (iIntValue3 < i8) {
                            float f9 = f6 + i7;
                            int i14 = i13 * 2;
                            rectF.set(f9, iDp3, i14 + f9, i14 + iDp3);
                            checkLeftRightBounds();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        }
                    }
                    iDp3 += iDp6;
                    if (i10 != i12 && iIntValue3 < iIntValue4) {
                        iDp3 -= AndroidUtilities.dp(3.0f);
                        iDp6 -= AndroidUtilities.dp(3.0f);
                    }
                    if (i10 != 0 && iIntValue3 < i8) {
                        iDp3 -= AndroidUtilities.dp(3.0f);
                        iDp6 -= AndroidUtilities.dp(3.0f);
                    }
                    arrayList2.add(Integer.valueOf(iDp6));
                    if (i10 == i12 || iIntValue3 > iIntValue4) {
                        rectF.set((f6 - iDp4) - iDp, iDp3 - (iDp * 2), f6 + i7, iDp3);
                        checkLeftRightBounds();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    } else if (iIntValue3 < iIntValue4) {
                        float f10 = f6 + i7;
                        int i15 = i13 * 2;
                        rectF.set(f10, iDp3 - i15, i15 + f10, iDp3);
                        checkLeftRightBounds();
                        path.arcTo(rectF, 180.0f, -90.0f);
                    }
                    i10++;
                    chatActionCell2 = this;
                    i8 = iIntValue3;
                    lineCount = i11;
                    i9 = lineBottom;
                    themedPaint2 = themedPaint2;
                    themedPaint = paint6;
                    resourcesProvider2 = resourcesProvider2;
                    arrayList = arrayList;
                }
                paint = themedPaint;
                paint2 = themedPaint2;
                ArrayList arrayList3 = arrayList;
                resourcesProvider = resourcesProvider2;
                int i16 = lineCount - 1;
                int i17 = i16;
                while (i17 >= 0) {
                    if (i17 != 0) {
                        arrayList3 = arrayList3;
                        iIntValue = ((Integer) arrayList3.get(i17 - 1)).intValue();
                    } else {
                        arrayList3 = arrayList3;
                        iIntValue = 0;
                    }
                    int iIntValue5 = ((Integer) arrayList3.get(i17)).intValue();
                    int iIntValue6 = i17 != i16 ? ((Integer) arrayList3.get(i17 + 1)).intValue() : 0;
                    this.textLayout.getLineBottom(i17);
                    float f11 = measuredWidth - (iIntValue5 / 2);
                    int i18 = (i17 == i16 || iIntValue5 >= iIntValue6 || i17 == 0 || iIntValue5 >= iIntValue) ? iDp2 : iDp5;
                    if (i17 == i16 || iIntValue5 > iIntValue6) {
                        f5 = f11;
                        rectF.set(f5 - i7, iDp3 - (iDp * 2), f5 + iDp4 + iDp, iDp3);
                        checkLeftRightBounds();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (iIntValue5 < iIntValue6) {
                        float f12 = f11 - i7;
                        int i19 = i18 * 2;
                        f5 = f11;
                        rectF.set(f12 - i19, iDp3 - i19, f12, iDp3);
                        checkLeftRightBounds();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        f5 = f11;
                    }
                    iDp3 -= ((Integer) arrayList2.get(i17)).intValue();
                    if (i17 == 0 || iIntValue5 > iIntValue) {
                        rectF.set(f5 - i7, iDp3, f5 + iDp4 + iDp, (iDp * 2) + iDp3);
                        checkLeftRightBounds();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    } else if (iIntValue5 < iIntValue) {
                        float f13 = f5 - i7;
                        int i20 = i18 * 2;
                        rectF.set(f13 - i20, iDp3, f13, i20 + iDp3);
                        checkLeftRightBounds();
                        path.arcTo(rectF, 0.0f, -90.0f);
                    }
                    i17--;
                }
                chatActionCell = this;
                path.close();
                if (chatActionCell.isMessageActionSuggestedPostApproval() && !chatActionCell.isNewStyleButtonLayout()) {
                    rectF.left = (f7 - (chatActionCell.textWidth / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = iDp3;
                    rectF.right = (chatActionCell.textWidth / 2.0f) + f7 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + iDp3 + chatActionCell.textHeight + chatActionCell.titleHeight;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = themedPaint;
                paint2 = themedPaint2;
                resourcesProvider = resourcesProvider2;
                f = 6.0f;
                f2 = 8.0f;
                f3 = 2.0f;
                f4 = 4.0f;
                chatActionCell = chatActionCell2;
            }
            if (!chatActionCell.visiblePartSet) {
                chatActionCell.backgroundHeight = ((ViewGroup) chatActionCell.getParent()).getMeasuredHeight();
            }
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(f4), chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight);
            } else {
                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(f4));
            }
            if (!z || (chatActionCell.getAlpha() == 1.0f && !(chatActionCell instanceof ChatActivity.AnonymousClass29))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z3 = chatActionCell instanceof ChatActivity.AnonymousClass29;
                if (z3) {
                    int alpha3 = paint4.getAlpha();
                    int alpha4 = paint3.getAlpha();
                    paint4.setAlpha((int) (alpha3 * (z3 ? 0.75f : 1.0f)));
                    paint3.setAlpha((int) (alpha4 * (z3 ? 0.75f : 1.0f)));
                    alpha = alpha3;
                    alpha2 = alpha4;
                } else {
                    alpha = -1;
                    alpha2 = -1;
                }
            } else {
                alpha = paint.getAlpha();
                alpha2 = paint2.getAlpha();
                boolean z4 = chatActionCell instanceof ChatActivity.AnonymousClass29;
                paint4 = paint;
                paint4.setAlpha((int) (chatActionCell.getAlpha() * alpha * (z4 ? 0.75f : 1.0f)));
                float alpha5 = chatActionCell.getAlpha() * alpha2;
                float f14 = z4 ? 0.75f : 1.0f;
                paint3 = paint2;
                paint3.setAlpha((int) (alpha5 * f14));
            }
            MessageObject messageObject = chatActionCell.currentMessageObject;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (chatActionCell.hasGradientService() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (chatActionCell.dimAmount > 0.0f) {
                    Paint paint7 = chatActionCell.dimPaint;
                    int alpha6 = paint7.getAlpha();
                    if (z) {
                        paint7.setAlpha((int) (chatActionCell.getAlpha() * alpha6));
                    }
                    canvas2.drawPath(path, paint7);
                    paint7.setAlpha(alpha6);
                }
            } else {
                canvas2 = canvas;
            }
            MessageObject messageObject2 = chatActionCell.currentMessageObject;
            StarGiftUniqueActionLayout starGiftUniqueActionLayout = chatActionCell.starGiftLayout;
            if (starGiftUniqueActionLayout.has()) {
                float fDp = starGiftUniqueActionLayout.animatorVisualWidth.factor + AndroidUtilities.dp(f2);
                float width = (chatActionCell.getWidth() - fDp) / f3;
                float fDp2 = starGiftUniqueActionLayout.repost ? 0.0f : AndroidUtilities.dp(12.0f) + chatActionCell.textY + chatActionCell.textHeight;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(width, fDp2, fDp + width, starGiftUniqueActionLayout.height + fDp2 + AndroidUtilities.dp(f2));
                if (chatActionCell.backgroundRect == null) {
                    chatActionCell.backgroundRect = new RectF();
                }
                chatActionCell.backgroundRect.set(rectF2);
                canvas2.drawRoundRect(chatActionCell.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (chatActionCell.hasGradientService()) {
                    canvas2.drawRoundRect(chatActionCell.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (chatActionCell.birthdayLayout != null) {
                float fDp3 = AndroidUtilities.dp(174.0f);
                SuggestBirthdayActionLayout suggestBirthdayActionLayout = chatActionCell.birthdayLayout;
                suggestBirthdayActionLayout.getClass();
                float fDp4 = AndroidUtilities.dp(140.0f) + suggestBirthdayActionLayout.text.layout.getHeight() + (suggestBirthdayActionLayout.hasButton ? AndroidUtilities.dp(40.0f) : 0);
                float width2 = (chatActionCell.getWidth() - fDp3) / f3;
                if (chatActionCell.backgroundRect == null) {
                    chatActionCell.backgroundRect = new RectF();
                }
                chatActionCell.backgroundRect.set(width2, AndroidUtilities.dp(f4), fDp3 + width2, AndroidUtilities.dp(f4) + fDp4);
                canvas2.drawRoundRect(chatActionCell.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (chatActionCell.hasGradientService()) {
                    canvas2.drawRoundRect(chatActionCell.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (chatActionCell.isButtonLayout(messageObject2)) {
                float width3 = (chatActionCell.getWidth() - chatActionCell.giftRectSize) / f3;
                float f15 = chatActionCell.textY + chatActionCell.textHeight;
                if (chatActionCell.isNewStyleButtonLayout()) {
                    float fDp5 = f15 + AndroidUtilities.dp(f4);
                    AndroidUtilities.rectTmp.set(width3, fDp5, chatActionCell.giftRectSize + width3, chatActionCell.backgroundRectHeight + fDp5);
                } else {
                    float fDp6 = f15 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f16 = chatActionCell.giftRectSize;
                    rectF3.set(width3, fDp6, width3 + f16, f16 + fDp6 + chatActionCell.giftPremiumAdditionalHeight);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !chatActionCell.giftPremiumTextCollapsed && (textLayout = chatActionCell.giftPremiumText) != null && chatActionCell.giftPremiumTextCollapsedHeight > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, chatActionCell.giftPremiumTextExpandedAnimated.value, ((StaticLayout) textLayout.layout).getHeight() - chatActionCell.giftPremiumTextCollapsedHeight, rectF4.bottom);
                }
                if (chatActionCell.backgroundRect == null) {
                    chatActionCell.backgroundRect = new RectF();
                }
                chatActionCell.backgroundRect.set(AndroidUtilities.rectTmp);
                if (messageObject2 == null || (!((i = messageObject2.type) == 33 || i == 35) || chatActionCell.botInlineButtons == null)) {
                    canvas2.drawRoundRect(chatActionCell.backgroundRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (chatActionCell.hasGradientService()) {
                        canvas2.drawRoundRect(chatActionCell.backgroundRect, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                } else {
                    float fDp7 = AndroidUtilities.dp(16.0f);
                    float[] fArr = chatActionCell.radii;
                    Arrays.fill(fArr, fDp7);
                    float fDp8 = AndroidUtilities.dp(f);
                    fArr[7] = fDp8;
                    fArr[6] = fDp8;
                    fArr[5] = fDp8;
                    fArr[4] = fDp8;
                    Path path2 = chatActionCell.backgroundPath2;
                    path2.rewind();
                    path2.addRoundRect(chatActionCell.backgroundRect, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (chatActionCell.hasGradientService()) {
                        canvas2.drawPath(path2, paint3);
                    }
                }
            }
            if (alpha >= 0) {
                paint4.setAlpha(alpha);
                paint3.setAlpha(alpha2);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
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

    public final void drawOutboundsContent(Canvas canvas) {
        float f;
        float f2;
        float fDp;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f3 = 2.0f;
        canvas2.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.textXLeft, this.textY);
        StaticLayout staticLayout = this.textLayout;
        AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, staticLayout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? getAdaptiveEmojiColorFilter(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.starGiftLayout;
        float f4 = 4.0f;
        if (starGiftUniqueActionLayout.has()) {
            canvas2.save();
            float width = (getWidth() - starGiftUniqueActionLayout.animatorVisualWidth.factor) / 2.0f;
            if (starGiftUniqueActionLayout.repost) {
                fDp = AndroidUtilities.dp(4.0f);
            } else {
                fDp = AndroidUtilities.dp(16.0f) + this.textY + this.textHeight;
            }
            canvas2.translate(width, fDp);
            starGiftUniqueActionLayout.drawOutbounds(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        TopicSeparator topicSeparator = this.topicSeparator;
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (topicSeparator != null) {
            float alpha = getAlpha();
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(this.viewTranslationX, this.viewTop + 0.0f, getMeasuredWidth(), this.backgroundHeight);
            } else {
                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + 0.0f);
            }
            this.topicSeparator.draw(canvas, getWidth(), this.sideMenuWidth, 0.0f, 1.0f, alpha, this.showTopicSeparator);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.botButtons;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.backgroundHeight);
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        float width2 = (getWidth() - this.giftRectSize) / 2.0f;
        float fDp2 = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.textY + this.textHeight + this.backgroundRectHeight;
        float fDp3 = (this.giftRectSize - AndroidUtilities.dp(4.0f)) / 2.0f;
        int i = 0;
        while (i < arrayList.size()) {
            BotButton botButton = (BotButton) arrayList.get(i);
            float pressScale = botButton.getPressScale();
            float fDp4 = ((AndroidUtilities.dp(f4) + fDp3) * i) + width2;
            float f5 = fDp4 + fDp3;
            RectF rectF = this.rect;
            rectF.set(fDp4, fDp2, f5, botButton.height + fDp2);
            canvas2.save();
            if (pressScale != 1.0f) {
                f = 4.0f;
                canvas2.scale(pressScale, pressScale, rectF.centerX(), rectF.centerY());
            } else {
                f = 4.0f;
            }
            float fDp5 = AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius));
            float[] fArr = this.botButtonRadii;
            Arrays.fill(fArr, fDp5);
            if ((botButton.positionFlags & 9) == 9) {
                float fDp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[7] = fDp6;
                fArr[6] = fDp6;
            }
            if ((botButton.positionFlags & 10) == 10) {
                float fDp7 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[5] = fDp7;
                fArr[4] = fDp7;
            }
            Path path = this.botButtonPath;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, getThemedPaint("paintChatActionBackground"));
            if (hasGradientService()) {
                canvas2.drawPath(path, Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            canvas2.save();
            canvas2.clipPath(path);
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
            float fM = ImageReceiver$$ExternalSyntheticOutline0.m(fDp3 - (botButton.title.getWidth() + (botButton.iconDrawable != null ? AndroidUtilities.dp(f) : 0)), f6, f3, fDp4);
            Drawable drawable = botButton.iconDrawable;
            if (drawable != null) {
                int i3 = (int) fM;
                f2 = 2.0f;
                drawable.setBounds(i3, (int) (((botButton.height - AndroidUtilities.dp(24.0f)) / f3) + fDp2), AndroidUtilities.dp(24.0f) + i3, AndroidUtilities.dp(24.0f) + ((int) (((botButton.height - AndroidUtilities.dp(24.0f)) / 2.0f) + fDp2)));
                botButton.iconDrawable.setAlpha(botButton.isLocked ? 128 : 255);
                botButton.iconDrawable.draw(canvas2);
                fM += f6;
            } else {
                f2 = 2.0f;
            }
            botButton.title.ellipsizeWidth = Math.max(1, (((int) fDp3) - AndroidUtilities.dp(15.0f)) - iDp);
            botButton.title.draw(canvas2, fM, (AndroidUtilities.dp(40.0f) / f2) + fDp2, botButton.isLocked ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i++;
            f4 = 4.0f;
            f3 = 2.0f;
        }
    }

    @Override
    public final boolean drawPinnedBottom() {
        return false;
    }

    @Override
    public final boolean drawPinnedTop() {
        return false;
    }

    public final void drawReactions(Canvas canvas, boolean z) {
        if (this.canDrawInParent) {
            if (hasGradientService() && !z) {
                return;
            }
            if (!hasGradientService() && z) {
                return;
            }
        }
        drawReactionsLayout(canvas, z, null);
    }

    public final void drawReactionsLayout(Canvas canvas, boolean z, Integer num) {
        float alpha = z ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.backgroundHeight);
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        boolean z2 = reactionsLayoutInBubble.isSmall;
        TransitionParams transitionParams = this.transitionParams;
        if (!z2 || (transitionParams.animateChange && reactionsLayoutInBubble.animateHeight)) {
            reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f;
            if (alpha < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            }
            reactionsLayoutInBubble.draw(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f, num);
            if (alpha < 1.0f) {
                canvas.restore();
            }
        }
    }

    public final void drawScrimReaction(Canvas canvas, Integer num, float f, boolean z) {
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (reactionsLayoutInBubble.isSmall) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.backgroundHeight);
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        reactionsLayoutInBubble.scrimProgress = f;
        reactionsLayoutInBubble.scrimDirection = z;
        reactionsLayoutInBubble.draw(canvas, this.transitionParams.animateChangeProgress, num);
    }

    public final void drawScrimReactionPreview(ChatActivity.ChatActivityFragmentView chatActivityFragmentView, Canvas canvas, int i, Integer num, float f) {
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (reactionsLayoutInBubble.isSmall) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.backgroundHeight);
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        reactionsLayoutInBubble.scrimProgress = f;
        reactionsLayoutInBubble.drawPreview(chatActivityFragmentView, canvas, i, num);
    }

    public final PorterDuffColorFilter getAdaptiveEmojiColorFilter(int i) {
        if (i != this.adaptiveEmojiColor || this.adaptiveEmojiColorFilter == null) {
            this.adaptiveEmojiColor = i;
            this.adaptiveEmojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        return this.adaptiveEmojiColorFilter;
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.starGiftLayout;
        if (starGiftUniqueActionLayout.has()) {
            int width = ((int) (getWidth() - (starGiftUniqueActionLayout.animatorVisualWidth.factor + AndroidUtilities.dp(8.0f)))) / 2;
            return starGiftUniqueActionLayout.repost ? width : Math.min(this.backgroundLeft, width);
        }
        if (isButtonLayout(this.currentMessageObject)) {
            return RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(getWidth(), this.giftRectSize, 2, this.sideMenuWidth / 2);
        }
        int iMin = this.backgroundLeft;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            iMin = Math.min((int) imageReceiver.getImageX(), iMin);
        }
        return (this.sideMenuWidth / 2) + iMin;
    }

    @Override
    public int getBoundsRight() {
        int iMax;
        int width;
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.starGiftLayout;
        if (starGiftUniqueActionLayout.has()) {
            int iDp = ((int) ((starGiftUniqueActionLayout.animatorVisualWidth.factor + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            return starGiftUniqueActionLayout.repost ? iDp : Math.max(this.backgroundRight, iDp);
        }
        if (isButtonLayout(this.currentMessageObject)) {
            iMax = this.sideMenuWidth / 2;
            width = (getWidth() + this.giftRectSize) / 2;
        } else {
            iMax = this.backgroundRight;
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                iMax = Math.max((int) imageReceiver.getImageX2(), iMax);
            }
            width = this.sideMenuWidth / 2;
        }
        return width + iMax;
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

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

    public final boolean hasGradientService() {
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
    public final void invalidate() {
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

    public final void invalidateOutbounds() {
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

    @Override
    public final void onAttachedToWindow() {
        ChatActionCellDelegate chatActionCellDelegate;
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.imageReceiver.onAttachedToWindow();
        int i = 0;
        setStarsPaused(false);
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            textLayout.emoji = AnimatedEmojiSpan.update(0, (View) textLayout.this$0, false, (AnimatedEmojiSpan.EmojiGroupedSpans) textLayout.emoji, (StaticLayout) textLayout.layout);
        }
        int i2 = this.currentAccount;
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.diceStickersDidLoad);
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
            suggestBirthdayActionLayout.sticker.masterParent = suggestBirthdayActionLayout.view;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        int i = this.currentAccount;
        DownloadController.getInstance(i).removeLoadingFileObserver(this);
        this.imageReceiver.onDetachedFromWindow();
        setStarsPaused(true);
        this.wasLayout = false;
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack);
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            AnimatedEmojiSpan.release((ChatActionCell) textLayout.this$0, (AnimatedEmojiSpan.EmojiGroupedSpans) textLayout.emoji);
        }
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.avatarStoryParams.reset();
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
            suggestBirthdayActionLayout.sticker.masterParent = null;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        TextPaint textPaint;
        RadialProgress2 radialProgress2;
        ArrayList arrayList;
        TextPaint textPaint2;
        int i2;
        ChatActionCell chatActionCell;
        float fDp;
        float fDp2;
        ChatActionCell chatActionCell2;
        float f2;
        float f3;
        float f4;
        Text text;
        float f5;
        float f6;
        int i3;
        TextPaint textPaint3;
        int i4;
        Text text2;
        ChatActionCellDelegate chatActionCellDelegate;
        StaticLayout staticLayout;
        PorterDuffColorFilter adaptiveEmojiColorFilter;
        int size;
        int i5;
        TextPaint textPaint4;
        TextPaint textPaint5;
        TextPaint textPaint6;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        MessageObject messageObject = this.currentMessageObject;
        float f7 = this.giftPremiumTextExpandedAnimated.set(!this.giftPremiumTextCollapsed);
        int imageSize = this.stickerSize;
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.starGiftLayout;
        boolean zHas = starGiftUniqueActionLayout.has();
        TextPaint textPaint7 = this.giftTextPaint;
        ImageReceiver imageReceiver = this.imageReceiver;
        StoriesUtilities.AvatarStoryParams avatarStoryParams = this.avatarStoryParams;
        if (!zHas && this.birthdayLayout == null && isButtonLayout(messageObject)) {
            this.stickerSize = this.giftRectSize - AndroidUtilities.dp(106.0f);
            if (isNewStyleButtonLayout()) {
                imageSize = getImageSize(messageObject);
                f = 16.0f;
                int iDp = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                float fDp3 = (this.previousWidth - imageSize) / 2.0f;
                float fDp4 = iDp;
                if (messageObject.isStoryMention()) {
                    avatarStoryParams.storyItem = messageObject.messageOwner.media.storyItem;
                }
                float f8 = imageSize;
                avatarStoryParams.originalAvatarRect.set(fDp3, fDp4, fDp3 + f8, f8 + fDp4);
                int i6 = messageObject.type;
                if (i6 == 31 || i6 == 33 || i6 == 34 || i6 == 35) {
                    fDp3 += AndroidUtilities.dp(10.0f);
                    fDp4 += AndroidUtilities.dp(10.0f);
                    imageSize -= AndroidUtilities.dp(20.0f);
                }
                if (messageObject.type == 37) {
                    fDp3 += AndroidUtilities.dp(2.0f);
                }
                imageReceiver.setImageCoords(fDp3, fDp4, Math.max(0, imageSize), Math.max(0, imageSize));
                int i7 = messageObject.type;
                if (i7 == 31 || i7 == 33 || i7 == 34 || i7 == 35) {
                    imageSize += AndroidUtilities.dp(20.0f);
                }
            } else {
                f = 16.0f;
                int i8 = messageObject.type;
                if (i8 == 11) {
                    int i9 = this.previousWidth;
                    int i10 = this.stickerSize;
                    float f9 = i10;
                    imageReceiver.setImageCoords((i9 - i10) / 2.0f, (this.giftRectSize * 0.075f) + this.textY + this.textHeight, f9, f9);
                } else if (i8 == 25) {
                    imageSize = (int) (this.stickerSize * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                    float f10 = imageSize;
                    imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.giftRectSize * 0.075f) + (this.textY + this.textHeight)) - AndroidUtilities.dp(22.0f), f10, f10);
                } else if (messageObject.isStarGiftAction()) {
                    float f11 = imageSize;
                    imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, (this.giftRectSize * 0.075f) + this.textY + this.textHeight + AndroidUtilities.dp(2.0f), f11, f11);
                } else if (messageObject.type == 30) {
                    imageSize = (int) (this.stickerSize * 1.1f);
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        float f12 = imageSize;
                        imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.giftRectSize * 0.075f) + (this.textY + this.textHeight)) - AndroidUtilities.dp(12.0f), f12, f12);
                    } else {
                        float f13 = imageSize;
                        imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.giftRectSize * 0.075f) + (this.textY + this.textHeight)) - AndroidUtilities.dp(22.0f), f13, f13);
                    }
                } else {
                    imageSize = (int) (this.stickerSize * 1.0f);
                    float f14 = imageSize;
                    imageReceiver.setImageCoords((this.previousWidth - imageSize) / 2.0f, ((this.giftRectSize * 0.075f) + (this.textY + this.textHeight)) - AndroidUtilities.dp(4.0f), f14, f14);
                }
                textPaint4 = (TextPaint) getThemedPaint("paintChatActionText");
                this.textPaint = textPaint4;
                if (textPaint4 != null) {
                    textPaint5 = this.giftTitlePaint;
                    if (textPaint5 != null && textPaint5.getColor() != this.textPaint.getColor()) {
                        this.giftTitlePaint.setColor(this.textPaint.getColor());
                    }
                    textPaint6 = this.giftSubtitlePaint;
                    if (textPaint6 != null && textPaint6.getColor() != this.textPaint.getColor()) {
                        textPaint6.setColor(this.textPaint.getColor());
                        textPaint6.linkColor = this.textPaint.getColor();
                    }
                    if (textPaint7 != null && textPaint7.getColor() != this.textPaint.getColor()) {
                        textPaint7.setColor(this.textPaint.getColor());
                        textPaint7.linkColor = this.textPaint.getColor();
                    }
                }
            }
            textPaint4 = (TextPaint) getThemedPaint("paintChatActionText");
            this.textPaint = textPaint4;
            if (textPaint4 != null) {
                textPaint5 = this.giftTitlePaint;
                if (textPaint5 != null) {
                    this.giftTitlePaint.setColor(this.textPaint.getColor());
                }
                textPaint6 = this.giftSubtitlePaint;
                if (textPaint6 != null) {
                    textPaint6.setColor(this.textPaint.getColor());
                    textPaint6.linkColor = this.textPaint.getColor();
                }
                if (textPaint7 != null) {
                    textPaint7.setColor(this.textPaint.getColor());
                    textPaint7.linkColor = this.textPaint.getColor();
                }
            }
        } else {
            f = 16.0f;
        }
        drawBackground(canvas2, false);
        boolean zHas2 = starGiftUniqueActionLayout.has();
        RadialProgress2 radialProgress3 = this.radialProgress;
        if (zHas2) {
            canvas2.save();
            float width = (getWidth() - starGiftUniqueActionLayout.getWidth()) / 2.0f;
            this.starGiftLayoutX = width;
            float fDp5 = starGiftUniqueActionLayout.repost ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(f) + this.textY + this.textHeight;
            this.starGiftLayoutY = fDp5;
            canvas2.translate(width, fDp5);
            starGiftUniqueActionLayout.draw(canvas2);
            ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
            if (chatActionCellDelegate2 == null || chatActionCellDelegate2.canDrawOutboundsContent()) {
                starGiftUniqueActionLayout.drawOutbounds(canvas2);
            }
            canvas2.restore();
        } else {
            if (this.birthdayLayout == null) {
                if (isButtonLayout(messageObject) || (messageObject != null && messageObject.type == 11)) {
                    GiftSheet.CardBackground cardBackground = this.cardBackground;
                    if (cardBackground != null && ((i = messageObject.type) == 31 || i == 37 || i == 33)) {
                        cardBackground.setBounds((int) (imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (imageReceiver.getImageWidth() + imageReceiver.getImageX() + AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(14.0f)));
                        this.cardBackground.draw(canvas2);
                    }
                    if (this.wallpaperPreviewDrawable != null) {
                        canvas2.save();
                        canvas2.translate(imageReceiver.getImageX(), imageReceiver.getImageY());
                        Path path = this.clipPath;
                        if (path == null) {
                            this.clipPath = new Path();
                        } else {
                            path.rewind();
                        }
                        this.clipPath.addCircle(imageReceiver.getImageWidth() / 2.0f, imageReceiver.getImageHeight() / 2.0f, imageReceiver.getImageWidth() / 2.0f, Path.Direction.CW);
                        canvas2.clipPath(this.clipPath);
                        this.wallpaperPreviewDrawable.setBounds(0, 0, (int) imageReceiver.getImageWidth(), (int) imageReceiver.getImageHeight());
                        this.wallpaperPreviewDrawable.draw(canvas2);
                        canvas2.restore();
                    } else if (messageObject.isStoryMention()) {
                        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                        long j = messageMedia.user_id;
                        avatarStoryParams.storyId = messageMedia.id;
                        StoriesUtilities.drawAvatarWithStory(j, canvas2, imageReceiver, avatarStoryParams);
                    } else {
                        imageReceiver.draw(canvas2);
                    }
                    if (messageObject.type == 37) {
                        DrawableUtils.drawCommunityCardDrawable(canvas2, Theme.dialogs_communityCardsDrawable, imageReceiver.getImageX() + AndroidUtilities.dp(26.0f), imageReceiver.getImageY() + AndroidUtilities.dp(26.0f), AndroidUtilities.dp(52.0f));
                    }
                    radialProgress3.progressRect.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageWidth() + imageReceiver.getImageX(), imageReceiver.getImageHeight() + imageReceiver.getImageY());
                    int i11 = messageObject.type;
                    if (i11 != 21) {
                        if (i11 == 22) {
                            float uploadingInfoProgress = getUploadingInfoProgress(messageObject);
                            radialProgress3.setProgress(uploadingInfoProgress, true);
                            radialProgress3.setCircleRadius(AndroidUtilities.dp(26.0f));
                            radialProgress3.maxIconSize = AndroidUtilities.dp(24.0f);
                            radialProgress3.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
                            if (uploadingInfoProgress == 1.0f) {
                                radialProgress3.setIcon(4, true, true);
                            } else {
                                radialProgress3.setIcon(3, true, true);
                            }
                            radialProgress3.draw(canvas2);
                        }
                        textPaint = this.textPaint;
                        radialProgress2 = radialProgress3;
                        arrayList = this.spoilers;
                        if (textPaint != null || this.textLayout == null) {
                            textPaint2 = textPaint7;
                            radialProgress2 = radialProgress2;
                            i2 = 22;
                            imageSize = imageSize;
                        } else {
                            canvas2.save();
                            canvas2.translate(this.textXLeft, this.textY);
                            if (this.textLayout.getPaint() != this.textPaint) {
                                buildLayout();
                            }
                            canvas2.save();
                            SpoilerEffect.clipOutCanvas(canvas2, arrayList);
                            SpoilerEffect.layoutDrawMaybe(canvas2, this.textLayout);
                            ChatActionCellDelegate chatActionCellDelegate3 = this.delegate;
                            if (chatActionCellDelegate3 == null || chatActionCellDelegate3.canDrawOutboundsContent()) {
                                StaticLayout staticLayout2 = this.textLayout;
                                textPaint2 = textPaint7;
                                i2 = 22;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout2, this.animatedEmojiStack, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout2 == null ? null : getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor()));
                                canvas2 = canvas;
                            } else {
                                textPaint2 = textPaint7;
                                i2 = 22;
                            }
                            canvas2.restore();
                            int size2 = arrayList.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                SpoilerEffect spoilerEffect = (SpoilerEffect) obj;
                                spoilerEffect.setColor(this.textLayout.getPaint().getColor());
                                spoilerEffect.draw(canvas2);
                            }
                            canvas2.restore();
                        }
                        if (this.textPaint != null && this.titleLayout != null) {
                            canvas2.save();
                            canvas2.translate(this.titleXLeft, this.textY - this.titleHeight);
                            if (this.titleLayout.getPaint() != this.textPaint) {
                                buildLayout();
                            }
                            canvas2.save();
                            SpoilerEffect.clipOutCanvas(canvas2, arrayList);
                            SpoilerEffect.layoutDrawMaybe(canvas2, this.titleLayout);
                            chatActionCellDelegate = this.delegate;
                            if (chatActionCellDelegate != null || chatActionCellDelegate.canDrawOutboundsContent()) {
                                StaticLayout staticLayout3 = this.titleLayout;
                                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.animatedEmojiStack;
                                staticLayout = this.textLayout;
                                if (staticLayout == null) {
                                    adaptiveEmojiColorFilter = null;
                                } else {
                                    adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout.getPaint().getColor());
                                }
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout3, emojiGroupedSpans, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
                                canvas2 = canvas;
                            }
                            canvas2.restore();
                            size = arrayList.size();
                            i5 = 0;
                            while (i5 < size) {
                                Object obj2 = arrayList.get(i5);
                                i5++;
                                SpoilerEffect spoilerEffect2 = (SpoilerEffect) obj2;
                                spoilerEffect2.setColor(this.titleLayout.getPaint().getColor());
                                spoilerEffect2.draw(canvas2);
                            }
                            canvas2.restore();
                        }
                        if (starGiftUniqueActionLayout.has() && isButtonLayout(messageObject)) {
                            canvas2.save();
                            float fDp6 = (this.previousWidth - this.giftRectSize) / 2.0f;
                            if (messageObject.type != i2) {
                                fDp6 += AndroidUtilities.dp(8.0f);
                            }
                            float f15 = fDp6;
                            if (isNewStyleButtonLayout()) {
                                RectF rectF = this.backgroundRect;
                                fDp = (rectF != null ? rectF.top : AndroidUtilities.dp(4.0f) + this.textY + this.textHeight) + (imageSize > 0 ? RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 16.0f, imageSize) : AndroidUtilities.dp(16.0f));
                            } else {
                                float fDp7 = (this.giftRectSize * 0.075f) + this.textY + this.textHeight + (messageObject.type == 21 ? imageSize : this.stickerSize) + AndroidUtilities.dp(4.0f);
                                if (messageObject.type == 21) {
                                    fDp7 += AndroidUtilities.dp(16.0f);
                                }
                                fDp = fDp7;
                                if (messageObject.isStarGiftAction()) {
                                    fDp += AndroidUtilities.dp(12.0f);
                                } else if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                                    fDp -= AndroidUtilities.dp(3.66f);
                                }
                            }
                            int i13 = messageObject.type;
                            if (i13 == 31 || i13 == 37 || i13 == 33) {
                                fDp -= AndroidUtilities.dp(3.66f);
                            }
                            canvas2.translate(f15, fDp);
                            if (this.giftPremiumTitleLayout != null) {
                                canvas2.save();
                                canvas2.translate(((this.giftRectSize - AndroidUtilities.dp(16.0f)) - this.giftPremiumTitleLayout.getWidth()) / 2.0f, 0.0f);
                                this.giftPremiumTitleLayout.draw(canvas2);
                                canvas2.restore();
                                fDp2 = this.giftPremiumTitleLayout.getHeight() + fDp + AndroidUtilities.dp(messageObject.type == 25 ? 6.0f : 0.0f);
                            } else {
                                fDp2 = fDp - AndroidUtilities.dp(4.0f);
                            }
                            float fDp8 = fDp2;
                            canvas2.restore();
                            if (this.giftPremiumTitleLayout != null && (text2 = this.giftPremiumReleasedText) != null) {
                                float width2 = text2.getWidth() + AndroidUtilities.dp(12.0f);
                                float fM = ImageReceiver$$ExternalSyntheticOutline0.m(this.giftRectSize - AndroidUtilities.dp(16.0f), width2, 2.0f, f15);
                                float height = fDp + this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(14.0f);
                                if (this.giftReleasedBackgroundPaint == null) {
                                    this.giftReleasedBackgroundPaint = new Paint(1);
                                }
                                this.giftReleasedBackgroundPaint.setColor(Theme.isCurrentThemeDark() ? 285212671 : 268435456);
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                rectF2.set(fM, height - AndroidUtilities.dp(8.0f), width2 + fM, AndroidUtilities.dp(8.0f) + height);
                                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.giftReleasedBackgroundPaint);
                                this.giftPremiumReleasedText.draw(fM + AndroidUtilities.dp(6.0f), height, 1.0f, -855638017, canvas2);
                                fDp8 += AndroidUtilities.dp(24.0f);
                            }
                            float fDp9 = fDp8 + AndroidUtilities.dp(4.0f);
                            if (messageObject.type == 18) {
                                fDp9 += AndroidUtilities.dp(2.0f);
                            }
                            float f16 = fDp9;
                            canvas2.save();
                            canvas2.translate(f15, f16);
                            if (messageObject.type == i2) {
                                RadialProgress2 radialProgress4 = radialProgress2;
                                f4 = 1.0f;
                                if ((radialProgress4.drawMiniIcon ? radialProgress4.miniMediaActionDrawable : radialProgress4.mediaActionDrawable).getTransitionProgress() != 1.0f || radialProgress4.getIcon() != 4) {
                                    Canvas canvas3 = canvas2;
                                    f3 = 8.0f;
                                    if (this.settingWallpaperLayout == null) {
                                        TextPaint textPaint8 = new TextPaint();
                                        this.settingWallpaperPaint = textPaint8;
                                        textPaint8.setTextSize(AndroidUtilities.dp(13.0f));
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                                        int iIndexOf = spannableStringBuilder.toString().indexOf("...");
                                        if (iIndexOf < 0) {
                                            iIndexOf = spannableStringBuilder.toString().indexOf("…");
                                            i4 = 1;
                                        } else {
                                            i4 = 3;
                                        }
                                        if (iIndexOf >= 0) {
                                            SpannableString spannableString = new SpannableString("…");
                                            UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                                            uploadingDotsSpannable.fixTop = true;
                                            uploadingDotsSpannable.setParent(this);
                                            spannableString.setSpan(uploadingDotsSpannable, 0, spannableString.length(), 33);
                                            spannableStringBuilder.replace(iIndexOf, i4 + iIndexOf, (CharSequence) spannableString);
                                        }
                                        TextPaint textPaint9 = this.settingWallpaperPaint;
                                        TextLayout textLayout = this.giftPremiumText;
                                        this.settingWallpaperLayout = new StaticLayout(spannableStringBuilder, textPaint9, textLayout == null ? 1 : textLayout.width, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    }
                                    float uploadingInfoProgress2 = getUploadingInfoProgress(messageObject);
                                    if (this.settingWallpaperProgressTextLayout == null || this.settingWallpaperProgress != uploadingInfoProgress2) {
                                        this.settingWallpaperProgress = uploadingInfoProgress2;
                                        String strM = SurfaceContainer$$ExternalSyntheticOutline0.m((int) (uploadingInfoProgress2 * 100.0f), "%", new StringBuilder());
                                        TextLayout textLayout2 = this.giftPremiumText;
                                        int i14 = textLayout2 == null ? 1 : textLayout2.width;
                                        f2 = f15;
                                        TextPaint textPaint10 = textPaint2;
                                        i3 = 4;
                                        textPaint3 = textPaint10;
                                        this.settingWallpaperProgressTextLayout = new StaticLayout(strM, textPaint10, i14, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    } else {
                                        f2 = f15;
                                        textPaint3 = textPaint2;
                                        i3 = 4;
                                    }
                                    this.settingWallpaperPaint.setColor(textPaint3.getColor());
                                    if (radialProgress4.getIcon() == i3) {
                                        float transitionProgress = (radialProgress4.drawMiniIcon ? radialProgress4.miniMediaActionDrawable : radialProgress4.mediaActionDrawable).getTransitionProgress();
                                        int color = textPaint3.getColor();
                                        float f17 = 1.0f - transitionProgress;
                                        this.settingWallpaperPaint.setAlpha((int) (Color.alpha(color) * f17));
                                        textPaint3.setAlpha((int) (Color.alpha(color) * transitionProgress));
                                        textPaint3.linkColor = textPaint3.getColor();
                                        if (this.giftPremiumText != null) {
                                            float f18 = (transitionProgress * 0.2f) + 0.8f;
                                            canvas3.save();
                                            canvas3.scale(f18, f18, this.giftRectSize / 2.0f, ((StaticLayout) this.giftPremiumText.layout).getHeight() / 2.0f);
                                            canvas3.translate((this.giftRectSize - ((StaticLayout) this.giftPremiumText.layout).getWidth()) / 2.0f, 0.0f);
                                            TextLayout textLayout3 = this.giftPremiumText;
                                            textLayout3.x = ((this.giftRectSize - ((StaticLayout) textLayout3.layout).getWidth()) / 2.0f) + f2;
                                            this.giftPremiumText.y = f16;
                                            int color2 = textPaint3.getColor();
                                            TextLayout textLayout4 = this.giftPremiumText;
                                            SpoilerEffect.renderWithRipple(this, false, color2, 0, (AtomicReference) textLayout4.patchedLayout, 1, (StaticLayout) textLayout4.layout, textLayout4.spoilers, canvas3, false);
                                            TextLayout textLayout5 = this.giftPremiumText;
                                            chatActionCell2 = this;
                                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, (StaticLayout) textLayout5.layout, (AnimatedEmojiSpan.EmojiGroupedSpans) textLayout5.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(textPaint3.getColor()));
                                            canvas2 = canvas;
                                            canvas2.restore();
                                        } else {
                                            canvas2 = canvas3;
                                            chatActionCell2 = this;
                                        }
                                        textPaint3.setAlpha((int) (Color.alpha(color) * f17));
                                        textPaint3.linkColor = textPaint3.getColor();
                                        float f19 = (f17 * 0.2f) + 0.8f;
                                        canvas2.save();
                                        canvas2.scale(f19, f19, chatActionCell2.giftRectSize / 2.0f, chatActionCell2.settingWallpaperLayout.getHeight() / 2.0f);
                                        canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                                        SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell2.settingWallpaperLayout);
                                        canvas2.restore();
                                        canvas2.save();
                                        canvas2.translate(0.0f, AndroidUtilities.dp(4.0f) + chatActionCell2.settingWallpaperLayout.getHeight());
                                        canvas2.scale(f19, f19, chatActionCell2.giftRectSize / 2.0f, chatActionCell2.settingWallpaperProgressTextLayout.getHeight() / 2.0f);
                                        canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, 0.0f);
                                        SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell2.settingWallpaperProgressTextLayout);
                                        canvas2.restore();
                                        textPaint3.setColor(color);
                                        textPaint3.linkColor = color;
                                    } else {
                                        canvas2 = canvas3;
                                        chatActionCell2 = this;
                                        f2 = f2;
                                        canvas2.save();
                                        canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                                        chatActionCell2.settingWallpaperLayout.draw(canvas2);
                                        canvas2.restore();
                                        canvas2.save();
                                        canvas2.translate((chatActionCell2.giftRectSize - chatActionCell2.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + chatActionCell2.settingWallpaperLayout.getHeight());
                                        SpoilerEffect.layoutDrawMaybe(canvas2, chatActionCell2.settingWallpaperProgressTextLayout);
                                        canvas2.restore();
                                    }
                                    chatActionCell = chatActionCell2;
                                } else if (this.giftPremiumText != null) {
                                    canvas2.save();
                                    canvas2.translate((this.giftRectSize - ((StaticLayout) this.giftPremiumText.layout).getWidth()) / 2.0f, 0.0f);
                                    TextLayout textLayout6 = this.giftPremiumText;
                                    textLayout6.x = ((this.giftRectSize - ((StaticLayout) textLayout6.layout).getWidth()) / 2.0f) + f15;
                                    this.giftPremiumText.y = f16;
                                    int color3 = textPaint2.getColor();
                                    TextLayout textLayout7 = this.giftPremiumText;
                                    f3 = 8.0f;
                                    SpoilerEffect.renderWithRipple(this, false, color3, 0, (AtomicReference) textLayout7.patchedLayout, 1, (StaticLayout) textLayout7.layout, textLayout7.spoilers, canvas2, false);
                                    TextLayout textLayout8 = this.giftPremiumText;
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, (StaticLayout) textLayout8.layout, (AnimatedEmojiSpan.EmojiGroupedSpans) textLayout8.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(textPaint2.getColor()));
                                    canvas.restore();
                                    f2 = f15;
                                    chatActionCell = this;
                                    canvas2 = canvas;
                                } else {
                                    f3 = 8.0f;
                                    f2 = f15;
                                    chatActionCell = this;
                                }
                            } else {
                                chatActionCell2 = this;
                                f2 = f15;
                                TextPaint textPaint11 = textPaint2;
                                f3 = 8.0f;
                                f4 = 1.0f;
                                TextLayout textLayout9 = chatActionCell2.giftPremiumText;
                                if (textLayout9 != null) {
                                    float height2 = ((StaticLayout) textLayout9.layout).getHeight();
                                    if (f7 < 1.0f) {
                                        height2 = AndroidUtilities.lerp(chatActionCell2.giftPremiumTextCollapsedHeight, height2, f7);
                                        RectF rectF3 = AndroidUtilities.rectTmp;
                                        rectF3.set(0.0f, -AndroidUtilities.dp(20.0f), chatActionCell2.getWidth(), height2);
                                        canvas2.saveLayerAlpha(rectF3, 255, 31);
                                    } else {
                                        canvas2.save();
                                    }
                                    canvas2.translate(((chatActionCell2.giftRectSize - AndroidUtilities.dp(16.0f)) - ((StaticLayout) chatActionCell2.giftPremiumText.layout).getWidth()) / 2.0f, 0.0f);
                                    chatActionCell2.giftPremiumText.x = (((chatActionCell2.giftRectSize - AndroidUtilities.dp(16.0f)) - ((StaticLayout) chatActionCell2.giftPremiumText.layout).getWidth()) / 2.0f) + f2;
                                    TextLayout textLayout10 = chatActionCell2.giftPremiumText;
                                    textLayout10.y = f16;
                                    int color4 = textLayout10.paint.getColor();
                                    TextLayout textLayout11 = chatActionCell2.giftPremiumText;
                                    float f20 = height2;
                                    SpoilerEffect.renderWithRipple(chatActionCell2, false, color4, 0, (AtomicReference) textLayout11.patchedLayout, 1, (StaticLayout) textLayout11.layout, textLayout11.spoilers, canvas2, false);
                                    TextLayout textLayout12 = chatActionCell2.giftPremiumText;
                                    StaticLayout staticLayout4 = (StaticLayout) textLayout12.layout;
                                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = (AnimatedEmojiSpan.EmojiGroupedSpans) textLayout12.emoji;
                                    PorterDuffColorFilter adaptiveEmojiColorFilter2 = chatActionCell2.getAdaptiveEmojiColorFilter(textPaint11.getColor());
                                    chatActionCell = chatActionCell2;
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout4, emojiGroupedSpans2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter2);
                                    canvas2 = canvas;
                                    if (f7 < 1.0f && chatActionCell.giftPremiumTextMore != null) {
                                        canvas2.save();
                                        if (chatActionCell.giftPremiumTextClip == null) {
                                            chatActionCell.giftPremiumTextClip = new GradientClip();
                                        }
                                        canvas2.translate((-((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - ((StaticLayout) chatActionCell.giftPremiumText.layout).getWidth())) / 2.0f, 0.0f);
                                        RectF rectF4 = AndroidUtilities.rectTmp;
                                        rectF4.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + chatActionCell.giftPremiumTextMoreX, chatActionCell.giftPremiumTextMoreY);
                                        float f21 = 1.0f - f7;
                                        chatActionCell.giftPremiumTextClip.clipOut(canvas2, rectF4, f21);
                                        rectF4.set((chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(16.0f), (chatActionCell.giftPremiumTextMoreY - chatActionCell.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (chatActionCell.giftPremiumTextMoreX - chatActionCell.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), chatActionCell.giftPremiumTextMoreY);
                                        chatActionCell.giftPremiumTextClip.draw(canvas2, rectF4, 2, f21);
                                        rectF4.set(0.0f, f20 - AndroidUtilities.dp(12.0f), chatActionCell.getWidth(), f20);
                                        chatActionCell.giftPremiumTextClip.draw(canvas2, rectF4, 3, (1.0f - f21) * f21 * 4.0f);
                                        canvas2.restore();
                                    }
                                    canvas2.restore();
                                    if (f7 < 1.0f && (text = chatActionCell.giftPremiumTextMore) != null) {
                                        text.draw((chatActionCell.giftPremiumTextMoreX - text.getCurrentWidth()) + AndroidUtilities.dp(5.0f), (chatActionCell.giftPremiumTextMoreY - (chatActionCell.giftPremiumTextMoreH / 2.0f)) - AndroidUtilities.dp(1.0f), 1.0f - f7, chatActionCell.giftPremiumText.paint.getColor(), canvas2);
                                    }
                                } else {
                                    chatActionCell = chatActionCell2;
                                }
                            }
                            canvas2.restore();
                            if (chatActionCell.giftPremiumTitleLayout == null) {
                                AndroidUtilities.dp(f3);
                            }
                            TextLayout textLayout13 = chatActionCell.giftPremiumText;
                            if (textLayout13 != null) {
                                AndroidUtilities.lerp(chatActionCell.giftPremiumTextCollapsedHeight, ((StaticLayout) textLayout13.layout).getHeight(), f7);
                            }
                            StaticLayout staticLayout5 = chatActionCell.giftPremiumButtonLayout;
                            if (staticLayout5 != null) {
                                staticLayout5.getHeight();
                            }
                            chatActionCell.getHeight();
                            AndroidUtilities.dp(f3);
                            Theme.ResourcesProvider resourcesProvider = chatActionCell.themeDelegate;
                            if (resourcesProvider != null) {
                                resourcesProvider.applyServiceShaderMatrix(chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f), chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight);
                            } else {
                                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(4.0f));
                            }
                            float scale = chatActionCell.bounce.getScale(0.02f);
                            canvas2.save();
                            RectF rectF5 = chatActionCell.giftButtonRect;
                            canvas2.scale(scale, scale, rectF5.centerX(), rectF5.centerY());
                            if (chatActionCell.giftPremiumButtonLayout != null) {
                                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.getThemedPaint("paintChatActionBackgroundSelected"));
                                if (chatActionCell.hasGradientService()) {
                                    canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), chatActionCell.getThemedPaint("paintChatActionBackgroundDarken"));
                                }
                                float f22 = chatActionCell.dimAmount;
                                Paint paint = chatActionCell.dimPaint;
                                if (f22 > 0.0f) {
                                    canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                }
                                if (chatActionCell.getMessageObject().type == 31 || chatActionCell.getMessageObject().type == 37 || chatActionCell.getMessageObject().type == 33) {
                                    boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
                                    int color5 = paint.getColor();
                                    paint.setColor(zIsDark ? 620756991 : 268435456);
                                    canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                    paint.setColor(color5);
                                }
                                if (chatActionCell.getMessageObject().type == 31 || chatActionCell.getMessageObject().type == 37 || chatActionCell.getMessageObject().type == 33 || chatActionCell.getMessageObject().type == 21 || chatActionCell.getMessageObject().type == 22 || chatActionCell.getMessageObject().type == 24) {
                                    chatActionCell.invalidate();
                                } else {
                                    Path path2 = chatActionCell.starsPath;
                                    path2.rewind();
                                    path2.addRoundRect(rectF5, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                                    canvas2.save();
                                    canvas2.clipPath(path2);
                                    chatActionCell.starParticlesDrawable.onDraw(canvas2);
                                    if (!chatActionCell.starParticlesDrawable.paused) {
                                        chatActionCell.invalidate();
                                    }
                                    canvas2.restore();
                                }
                            }
                            boolean z = messageObject.settingAvatar;
                            if (z) {
                                float f23 = chatActionCell.progressToProgress;
                                if (f23 != f4) {
                                    chatActionCell.progressToProgress = f23 + 0.10666667f;
                                } else if (z) {
                                    f5 = chatActionCell.progressToProgress;
                                    f6 = 0.0f;
                                    if (f5 != 0.0f) {
                                        chatActionCell.progressToProgress = f5 - 0.10666667f;
                                    }
                                }
                                f6 = 0.0f;
                            } else if (z) {
                                f6 = 0.0f;
                            } else {
                                f5 = chatActionCell.progressToProgress;
                                f6 = 0.0f;
                                if (f5 != 0.0f) {
                                    chatActionCell.progressToProgress = f5 - 0.10666667f;
                                }
                            }
                            float fClamp = Utilities.clamp(chatActionCell.progressToProgress, 1.0f, f6);
                            chatActionCell.progressToProgress = fClamp;
                            if (fClamp != f6) {
                                if (chatActionCell.progressView == null) {
                                    chatActionCell.progressView = new RadialProgressView(chatActionCell.getContext());
                                }
                                int iDp2 = AndroidUtilities.dp(16.0f);
                                canvas2.save();
                                float f24 = chatActionCell.progressToProgress;
                                canvas2.scale(f24, f24, rectF5.centerX(), rectF5.centerY());
                                chatActionCell.progressView.setSize(iDp2);
                                chatActionCell.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                                chatActionCell.progressView.draw(canvas2, rectF5.centerX(), rectF5.centerY());
                                canvas2.restore();
                            }
                            if (chatActionCell.progressToProgress != 1.0f && chatActionCell.giftPremiumButtonLayout != null) {
                                canvas2.save();
                                float f25 = 1.0f - chatActionCell.progressToProgress;
                                canvas2.scale(f25, f25, rectF5.centerX(), rectF5.centerY());
                                canvas2.translate(f2, rectF5.top + AndroidUtilities.dp(7.0f));
                                canvas2.translate(((chatActionCell.giftRectSize - AndroidUtilities.dp(16.0f)) - chatActionCell.giftPremiumButtonLayout.getWidth()) / 2.0f, 0.0f);
                                chatActionCell.giftPremiumButtonLayout.draw(canvas2);
                                canvas2.restore();
                            }
                            if (messageObject.flickerLoading) {
                                if (chatActionCell.loadingDrawable == null) {
                                    LoadingDrawable loadingDrawable = new LoadingDrawable(resourcesProvider);
                                    chatActionCell.loadingDrawable = loadingDrawable;
                                    loadingDrawable.setGradientScale();
                                    LoadingDrawable loadingDrawable2 = chatActionCell.loadingDrawable;
                                    loadingDrawable2.appearByGradient = true;
                                    loadingDrawable2.setColors(Theme.multAlpha(0.08f, -1), Theme.multAlpha(0.2f, -1), Theme.multAlpha(0.2f, -1), Theme.multAlpha(0.7f, -1));
                                    chatActionCell.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                                }
                                LoadingDrawable loadingDrawable3 = chatActionCell.loadingDrawable;
                                loadingDrawable3.disappearStart = -1L;
                                loadingDrawable3.setBounds(rectF5);
                                LoadingDrawable loadingDrawable4 = chatActionCell.loadingDrawable;
                                loadingDrawable4.getClass();
                                loadingDrawable4.setRadii(AndroidUtilities.dp(16.0f));
                                chatActionCell.loadingDrawable.draw(canvas2);
                            } else {
                                LoadingDrawable loadingDrawable5 = chatActionCell.loadingDrawable;
                                if (loadingDrawable5 != null) {
                                    loadingDrawable5.setBounds(rectF5);
                                    LoadingDrawable loadingDrawable6 = chatActionCell.loadingDrawable;
                                    loadingDrawable6.getClass();
                                    loadingDrawable6.setRadii(AndroidUtilities.dp(16.0f));
                                    chatActionCell.loadingDrawable.disappear();
                                    chatActionCell.loadingDrawable.draw(canvas2);
                                    if (chatActionCell.loadingDrawable.isDisappeared()) {
                                        chatActionCell.loadingDrawable.start = -1L;
                                    }
                                }
                            }
                            canvas2.restore();
                            if (chatActionCell.backgroundRect != null && chatActionCell.giftRibbonPath != null && chatActionCell.giftRibbonText != null) {
                                Paint themedPaint = chatActionCell.getThemedPaint("paintChatActionBackground");
                                Paint themedPaint2 = chatActionCell.getThemedPaint("paintChatActionBackgroundDarken");
                                float fDp10 = (chatActionCell.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                float fDp11 = chatActionCell.backgroundRect.top - AndroidUtilities.dp(2.0f);
                                if (resourcesProvider != null) {
                                    resourcesProvider.applyServiceShaderMatrix(chatActionCell.viewTranslationX + fDp10, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp11, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight);
                                } else {
                                    Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX + fDp10, chatActionCell.viewTop + AndroidUtilities.dp(4.0f) + fDp11);
                                }
                                canvas2.save();
                                canvas2.translate(fDp10, fDp11);
                                ColorFilter colorFilter = themedPaint.getColorFilter();
                                PathEffect pathEffect = themedPaint.getPathEffect();
                                boolean zIsDark2 = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
                                if (chatActionCell.giftRibbonPaintFilter == null || chatActionCell.giftRibbonPaintFilterDark != zIsDark2) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    if ((themedPaint.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                        ((ColorMatrixColorFilter) themedPaint.getColorFilter()).getColorMatrix(colorMatrix);
                                    }
                                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, zIsDark2 ? 0.1f : -0.08f);
                                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, zIsDark2 ? 0.15f : 0.1f);
                                    chatActionCell.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                                    chatActionCell.giftRibbonPaintFilterDark = zIsDark2;
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
                                chatActionCell.giftRibbonText.draw(AndroidUtilities.dp(40.43f) - (chatActionCell.giftRibbonText.getCurrentWidth() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas2);
                                canvas2.restore();
                            }
                        } else {
                            chatActionCell = this;
                        }
                        chatActionCell.drawReactions(canvas2, false);
                        chatActionCell.transitionParams.recordDrawingState();
                        canvas2.restore();
                    }
                    ImageUpdater imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id);
                    if (imageUpdater != null) {
                        radialProgress3.setProgress(imageUpdater.currentImageProgress, true);
                        radialProgress3.setCircleRadius(((int) (imageReceiver.getImageWidth() * 0.5f)) + 1);
                        radialProgress3.maxIconSize = AndroidUtilities.dp(24.0f);
                        radialProgress3.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
                        if (imageUpdater.currentImageProgress == 1.0f) {
                            radialProgress3.setIcon(4, true, true);
                        } else {
                            radialProgress3.setIcon(3, true, true);
                        }
                    }
                    radialProgress3.draw(canvas2);
                }
                textPaint = this.textPaint;
                radialProgress2 = radialProgress3;
                arrayList = this.spoilers;
                if (textPaint != null) {
                    textPaint2 = textPaint7;
                    radialProgress2 = radialProgress2;
                    i2 = 22;
                    imageSize = imageSize;
                } else {
                    textPaint2 = textPaint7;
                    radialProgress2 = radialProgress2;
                    i2 = 22;
                    imageSize = imageSize;
                }
                if (this.textPaint != null) {
                    canvas2.save();
                    canvas2.translate(this.titleXLeft, this.textY - this.titleHeight);
                    if (this.titleLayout.getPaint() != this.textPaint) {
                        buildLayout();
                    }
                    canvas2.save();
                    SpoilerEffect.clipOutCanvas(canvas2, arrayList);
                    SpoilerEffect.layoutDrawMaybe(canvas2, this.titleLayout);
                    chatActionCellDelegate = this.delegate;
                    if (chatActionCellDelegate != null) {
                        StaticLayout staticLayout6 = this.titleLayout;
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans3 = this.animatedEmojiStack;
                        staticLayout = this.textLayout;
                        if (staticLayout == null) {
                            adaptiveEmojiColorFilter = null;
                        } else {
                            adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout.getPaint().getColor());
                        }
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, emojiGroupedSpans3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
                        canvas2 = canvas;
                    } else {
                        StaticLayout staticLayout7 = this.titleLayout;
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans4 = this.animatedEmojiStack;
                        staticLayout = this.textLayout;
                        if (staticLayout == null) {
                            adaptiveEmojiColorFilter = null;
                        } else {
                            adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout.getPaint().getColor());
                        }
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout7, emojiGroupedSpans4, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                    size = arrayList.size();
                    i5 = 0;
                    while (i5 < size) {
                        Object obj3 = arrayList.get(i5);
                        i5++;
                        SpoilerEffect spoilerEffect3 = (SpoilerEffect) obj3;
                        spoilerEffect3.setColor(this.titleLayout.getPaint().getColor());
                        spoilerEffect3.draw(canvas2);
                    }
                    canvas2.restore();
                }
                if (starGiftUniqueActionLayout.has()) {
                    chatActionCell = this;
                } else {
                    chatActionCell = this;
                }
                chatActionCell.drawReactions(canvas2, false);
                chatActionCell.transitionParams.recordDrawingState();
                canvas2.restore();
            }
            canvas2.save();
            this.birthdayLayout.draw(canvas2);
            canvas2.restore();
        }
        textPaint = this.textPaint;
        radialProgress2 = radialProgress3;
        arrayList = this.spoilers;
        if (textPaint != null) {
            textPaint2 = textPaint7;
            radialProgress2 = radialProgress2;
            i2 = 22;
            imageSize = imageSize;
        } else {
            textPaint2 = textPaint7;
            radialProgress2 = radialProgress2;
            i2 = 22;
            imageSize = imageSize;
        }
        if (this.textPaint != null) {
            canvas2.save();
            canvas2.translate(this.titleXLeft, this.textY - this.titleHeight);
            if (this.titleLayout.getPaint() != this.textPaint) {
                buildLayout();
            }
            canvas2.save();
            SpoilerEffect.clipOutCanvas(canvas2, arrayList);
            SpoilerEffect.layoutDrawMaybe(canvas2, this.titleLayout);
            chatActionCellDelegate = this.delegate;
            if (chatActionCellDelegate != null) {
                StaticLayout staticLayout8 = this.titleLayout;
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans5 = this.animatedEmojiStack;
                staticLayout = this.textLayout;
                if (staticLayout == null) {
                    adaptiveEmojiColorFilter = null;
                } else {
                    adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout.getPaint().getColor());
                }
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout8, emojiGroupedSpans5, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
                canvas2 = canvas;
            } else {
                StaticLayout staticLayout9 = this.titleLayout;
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans6 = this.animatedEmojiStack;
                staticLayout = this.textLayout;
                if (staticLayout == null) {
                    adaptiveEmojiColorFilter = null;
                } else {
                    adaptiveEmojiColorFilter = getAdaptiveEmojiColorFilter(staticLayout.getPaint().getColor());
                }
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout9, emojiGroupedSpans6, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, adaptiveEmojiColorFilter);
                canvas2 = canvas;
            }
            canvas2.restore();
            size = arrayList.size();
            i5 = 0;
            while (i5 < size) {
                Object obj4 = arrayList.get(i5);
                i5++;
                SpoilerEffect spoilerEffect4 = (SpoilerEffect) obj4;
                spoilerEffect4.setColor(this.titleLayout.getPaint().getColor());
                spoilerEffect4.draw(canvas2);
            }
            canvas2.restore();
        }
        if (starGiftUniqueActionLayout.has()) {
            chatActionCell = this;
        } else {
            chatActionCell = this;
        }
        chatActionCell.drawReactions(canvas2, false);
        chatActionCell.transitionParams.recordDrawingState();
        canvas2.restore();
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
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
                spannableStringBuilder.setSpan(new AboutLinkCell.AnonymousClass5(1, this, characterStyle), spanStart, spanEnd, 33);
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
    public final boolean onLongPress() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            return chatActionCellDelegate.didLongPress(this, this.lastTouchX, this.lastTouchY);
        }
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iDp;
        float f;
        boolean z;
        int imageSize;
        float f2;
        TextLayout textLayout;
        int iDp2;
        float f3;
        StaticLayout staticLayout;
        float f4;
        float fDp;
        TextLayout textLayout2;
        int height;
        MessageObject messageObject;
        float f5;
        int iDp3;
        StaticLayout staticLayout2;
        RectF rectF;
        float f6;
        MessageObject messageObject2;
        TLRPC.Message message;
        int measuredWidth;
        StarParticlesView.Drawable drawable;
        int iDp4;
        int iDp5;
        int i3;
        float f7;
        int i4;
        int iDp6;
        float fM;
        StaticLayout staticLayout3;
        int height2;
        float f8;
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
            int i8 = messageObject3.type;
            ImageReceiver imageReceiver = this.imageReceiver;
            if (i8 == 37) {
                this.stickerSize = AndroidUtilities.dp(52.0f);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
            } else if (isNewStyleButtonLayout()) {
                imageReceiver.setRoundRadius(this.stickerSize / 2);
            } else {
                imageReceiver.setRoundRadius(0);
            }
        }
        int iMax = Math.max(AndroidUtilities.dp(30.0f), View.MeasureSpec.getSize(i));
        if (this.previousWidth != iMax) {
            this.wasLayout = true;
            this.previousWidth = iMax;
            buildLayout();
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
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = this.starGiftLayout;
        boolean zHas = starGiftUniqueActionLayout.has();
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (zHas) {
            iDp10 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(starGiftUniqueActionLayout.height, 8.0f, starGiftUniqueActionLayout.repost ? 0 : AndroidUtilities.dp(16.0f) + this.textY + this.textHeight);
            if (!reactionsLayoutInBubble.isEmpty) {
                reactionsLayoutInBubble.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble.height;
                i5 = reactionsLayoutInBubble.totalHeight;
                iDp10 += i5;
            }
        } else {
            SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
            if (suggestBirthdayActionLayout != null) {
                iDp10 = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(140.0f) + suggestBirthdayActionLayout.text.layout.getHeight() + (suggestBirthdayActionLayout.hasButton ? AndroidUtilities.dp(40.0f) : 0);
                if (!reactionsLayoutInBubble.isEmpty) {
                    reactionsLayoutInBubble.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble.height;
                    i5 = reactionsLayoutInBubble.totalHeight;
                    iDp10 += i5;
                }
            } else if (isButtonLayout(messageObject3)) {
                if (messageObject3 != null) {
                    f = 40.0f;
                    z = messageObject3.type == 25;
                    imageSize = getImageSize(messageObject3);
                    if (isNewStyleButtonLayout()) {
                        f2 = 24.0f;
                        int iDp11 = AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                        if (imageSize > 0) {
                            iDp7 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 16.0f, imageSize);
                        } else {
                            iDp7 = AndroidUtilities.dp(16.0f);
                        }
                        int i9 = iDp11 + iDp7;
                        textLayout3 = this.giftPremiumText;
                        if (textLayout3 == null) {
                            iDp8 = 0;
                        } else {
                            iDp8 = AndroidUtilities.dp(4.0f) + ((StaticLayout) textLayout3.layout).getHeight();
                        }
                        f3 = i9 + iDp8;
                    } else {
                        f2 = 24.0f;
                        float fDp2 = (this.giftRectSize * 0.075f) + this.textY + this.textHeight + imageSize + AndroidUtilities.dp(4.0f);
                        textLayout = this.giftPremiumText;
                        if (textLayout == null) {
                            iDp2 = 0;
                        } else {
                            iDp2 = AndroidUtilities.dp(4.0f) + ((StaticLayout) textLayout.layout).getHeight();
                        }
                        f3 = iDp2 + fDp2;
                    }
                    this.giftPremiumAdditionalHeight = 0;
                    staticLayout = this.giftPremiumTitleLayout;
                    if (staticLayout != null) {
                        float height3 = f3 + staticLayout.getHeight();
                        if (this.giftPremiumTitleLayout.getLineCount() > 1) {
                            f4 = 8.0f;
                            this.giftPremiumAdditionalHeight = (this.giftPremiumTitleLayout.getHeight() - this.giftPremiumTitleLayout.getLineTop(1)) + this.giftPremiumAdditionalHeight;
                        } else {
                            f4 = 8.0f;
                        }
                        if (z) {
                            f8 = 6.0f;
                        } else {
                            f8 = 0.0f;
                        }
                        fDp = height3 + AndroidUtilities.dp(f8);
                        if (this.giftPremiumReleasedText != null) {
                            fDp += AndroidUtilities.dp(f2);
                        }
                    } else {
                        f4 = 8.0f;
                        fDp = f3 - AndroidUtilities.dp(12.0f);
                        this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(30.0f);
                    }
                    textLayout2 = this.giftPremiumText;
                    if (textLayout2 == null) {
                        height = 0;
                    } else {
                        height = ((StaticLayout) textLayout2.layout).getHeight();
                    }
                    if (this.giftPremiumText == null) {
                        this.giftPremiumAdditionalHeight = 0;
                    } else {
                        messageObject = this.currentMessageObject;
                        if (messageObject.type != 18 || messageObject.isStarGiftAction()) {
                            int i10 = this.giftPremiumAdditionalHeight;
                            if (this.giftPremiumButtonLayout == null) {
                                f5 = 0.0f;
                            } else {
                                f5 = 10.0f;
                            }
                            this.giftPremiumAdditionalHeight = zzlb.m(height, f5, i10);
                        } else if (this.currentMessageObject.type == 30) {
                            this.giftPremiumAdditionalHeight = zzlb.m(height, 20.0f, this.giftPremiumAdditionalHeight);
                        } else if (this.giftPremiumTextCollapsed) {
                            this.giftPremiumAdditionalHeight += height;
                        } else if (((StaticLayout) this.giftPremiumText.layout).getLineCount() > 2) {
                            this.giftPremiumAdditionalHeight = ((((StaticLayout) this.giftPremiumText.layout).getLineCount() * (((StaticLayout) this.giftPremiumText.layout).getLineBottom(0) - ((StaticLayout) this.giftPremiumText.layout).getLineTop(0))) - 2) + this.giftPremiumAdditionalHeight;
                        }
                    }
                    if (this.giftPremiumReleasedText != null) {
                        this.giftPremiumAdditionalHeight = AndroidUtilities.dp(f2) + this.giftPremiumAdditionalHeight;
                    }
                    int iDp12 = this.giftPremiumAdditionalHeight - AndroidUtilities.dp(z ? 14.0f : 0.0f);
                    this.giftPremiumAdditionalHeight = iDp12;
                    iDp += iDp12;
                    iDp3 = AndroidUtilities.dp(14.0f) + this.textHeight + iDp;
                    staticLayout2 = this.giftPremiumButtonLayout;
                    rectF = this.giftButtonRect;
                    if (staticLayout2 != null) {
                        fM = ImageReceiver$$ExternalSyntheticOutline0.m((iDp3 - fDp) - staticLayout2.getHeight(), AndroidUtilities.dp(f4), 2.0f, fDp);
                        if (this.currentMessageObject.isStarGiftAction()) {
                            fM += AndroidUtilities.dp(4.0f);
                        }
                        float f9 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                        float fDp3 = f9 - AndroidUtilities.dp(18.0f);
                        float fDp4 = fM - AndroidUtilities.dp(f4);
                        f6 = 2.0f;
                        float fDp5 = f9 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f);
                        staticLayout3 = this.giftPremiumButtonLayout;
                        if (staticLayout3 != null) {
                            height2 = staticLayout3.getHeight();
                        } else {
                            height2 = 0;
                        }
                        rectF.set(fDp3, fDp4, fDp5, fM + height2 + AndroidUtilities.dp(f4));
                    } else {
                        f6 = 2.0f;
                        iDp -= AndroidUtilities.dp(f);
                        this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(f);
                        messageObject2 = this.currentMessageObject;
                        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            iDp -= AndroidUtilities.dp(f4);
                            this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(f4);
                        }
                    }
                    measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                    drawable = this.starParticlesDrawable;
                    drawable.rect.set(rectF);
                    drawable.rect2.set(rectF);
                    if (this.starsSize != measuredWidth) {
                        this.starsSize = measuredWidth;
                        drawable.resetPositions();
                    }
                    if (isNewStyleButtonLayout()) {
                        iDp4 = AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                        this.backgroundRectHeight = 0;
                        if (imageSize > 0) {
                            iDp5 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 16.0f, imageSize);
                        } else {
                            iDp5 = AndroidUtilities.dp(16.0f);
                        }
                        this.backgroundRectHeight = iDp5;
                        if (this.giftPremiumReleasedText != null) {
                            this.backgroundRectHeight = AndroidUtilities.dp(15.0f) + iDp5;
                        }
                        i3 = this.backgroundRectHeight + height;
                        this.backgroundRectHeight = i3;
                        f7 = (this.previousWidth - this.giftPremiumButtonWidth) / f6;
                        if (this.giftPremiumButtonLayout != null) {
                            this.backgroundButtonTop = AndroidUtilities.dp(7.0f) + i3 + iDp4;
                            rectF.set(f7 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f7 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 8.0f, this.giftPremiumButtonLayout.getHeight() + this.backgroundButtonTop));
                            this.backgroundRectHeight = (int) (rectF.height() + AndroidUtilities.dp(4.0f) + this.backgroundRectHeight);
                        } else if (!isMessageActionSuggestedPostApproval() && (i4 = messageObject3.type) != 34 && i4 != 33 && i4 != 35) {
                            rectF.set(f7 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f7 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 8.0f, AndroidUtilities.dp(17.0f) + this.backgroundButtonTop));
                            this.backgroundRectHeight = AndroidUtilities.dp(17.0f) + this.backgroundRectHeight;
                        }
                        int iDp13 = AndroidUtilities.dp(15.0f) + this.backgroundRectHeight;
                        this.backgroundRectHeight = iDp13;
                        iDp6 = AndroidUtilities.dp(6.0f) + iDp4 + iDp13;
                        if (!reactionsLayoutInBubble.isEmpty) {
                            reactionsLayoutInBubble.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble.height;
                            iDp6 += reactionsLayoutInBubble.totalHeight;
                        }
                        iDp10 = iDp6;
                        if (this.botInlineButtons != null) {
                            iDp10 += AndroidUtilities.dp(44.0f);
                        }
                    }
                    rectF.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
                } else {
                    f = 40.0f;
                }
                imageSize = getImageSize(messageObject3);
                if (isNewStyleButtonLayout()) {
                    f2 = 24.0f;
                    int iDp14 = AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                    if (imageSize > 0) {
                        iDp7 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 16.0f, imageSize);
                    } else {
                        iDp7 = AndroidUtilities.dp(16.0f);
                    }
                    int i11 = iDp14 + iDp7;
                    textLayout3 = this.giftPremiumText;
                    if (textLayout3 == null) {
                        iDp8 = 0;
                    } else {
                        iDp8 = AndroidUtilities.dp(4.0f) + ((StaticLayout) textLayout3.layout).getHeight();
                    }
                    f3 = i11 + iDp8;
                } else {
                    f2 = 24.0f;
                    float fDp6 = (this.giftRectSize * 0.075f) + this.textY + this.textHeight + imageSize + AndroidUtilities.dp(4.0f);
                    textLayout = this.giftPremiumText;
                    if (textLayout == null) {
                        iDp2 = 0;
                    } else {
                        iDp2 = AndroidUtilities.dp(4.0f) + ((StaticLayout) textLayout.layout).getHeight();
                    }
                    f3 = iDp2 + fDp6;
                }
                this.giftPremiumAdditionalHeight = 0;
                staticLayout = this.giftPremiumTitleLayout;
                if (staticLayout != null) {
                    float height4 = f3 + staticLayout.getHeight();
                    if (this.giftPremiumTitleLayout.getLineCount() > 1) {
                        f4 = 8.0f;
                        this.giftPremiumAdditionalHeight = (this.giftPremiumTitleLayout.getHeight() - this.giftPremiumTitleLayout.getLineTop(1)) + this.giftPremiumAdditionalHeight;
                    } else {
                        f4 = 8.0f;
                    }
                    if (z) {
                        f8 = 6.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    fDp = height4 + AndroidUtilities.dp(f8);
                    if (this.giftPremiumReleasedText != null) {
                        fDp += AndroidUtilities.dp(f2);
                    }
                } else {
                    f4 = 8.0f;
                    fDp = f3 - AndroidUtilities.dp(12.0f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(30.0f);
                }
                textLayout2 = this.giftPremiumText;
                if (textLayout2 == null) {
                    height = 0;
                } else {
                    height = ((StaticLayout) textLayout2.layout).getHeight();
                }
                if (this.giftPremiumText == null) {
                    this.giftPremiumAdditionalHeight = 0;
                } else {
                    messageObject = this.currentMessageObject;
                    if (messageObject.type != 18) {
                        int i12 = this.giftPremiumAdditionalHeight;
                        if (this.giftPremiumButtonLayout == null) {
                            f5 = 0.0f;
                        } else {
                            f5 = 10.0f;
                        }
                        this.giftPremiumAdditionalHeight = zzlb.m(height, f5, i12);
                    } else {
                        int i13 = this.giftPremiumAdditionalHeight;
                        if (this.giftPremiumButtonLayout == null) {
                            f5 = 0.0f;
                        } else {
                            f5 = 10.0f;
                        }
                        this.giftPremiumAdditionalHeight = zzlb.m(height, f5, i13);
                    }
                }
                if (this.giftPremiumReleasedText != null) {
                    this.giftPremiumAdditionalHeight = AndroidUtilities.dp(f2) + this.giftPremiumAdditionalHeight;
                }
                int iDp15 = this.giftPremiumAdditionalHeight - AndroidUtilities.dp(z ? 14.0f : 0.0f);
                this.giftPremiumAdditionalHeight = iDp15;
                iDp += iDp15;
                iDp3 = AndroidUtilities.dp(14.0f) + this.textHeight + iDp;
                staticLayout2 = this.giftPremiumButtonLayout;
                rectF = this.giftButtonRect;
                if (staticLayout2 != null) {
                    fM = ImageReceiver$$ExternalSyntheticOutline0.m((iDp3 - fDp) - staticLayout2.getHeight(), AndroidUtilities.dp(f4), 2.0f, fDp);
                    if (this.currentMessageObject.isStarGiftAction()) {
                        fM += AndroidUtilities.dp(4.0f);
                    }
                    float f10 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    float fDp7 = f10 - AndroidUtilities.dp(18.0f);
                    float fDp8 = fM - AndroidUtilities.dp(f4);
                    f6 = 2.0f;
                    float fDp9 = f10 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f);
                    staticLayout3 = this.giftPremiumButtonLayout;
                    if (staticLayout3 != null) {
                        height2 = staticLayout3.getHeight();
                    } else {
                        height2 = 0;
                    }
                    rectF.set(fDp7, fDp8, fDp9, fM + height2 + AndroidUtilities.dp(f4));
                } else {
                    f6 = 2.0f;
                    iDp -= AndroidUtilities.dp(f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(f);
                    messageObject2 = this.currentMessageObject;
                    if (messageObject2 != null) {
                        iDp -= AndroidUtilities.dp(f4);
                        this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(f4);
                    }
                }
                measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                drawable = this.starParticlesDrawable;
                drawable.rect.set(rectF);
                drawable.rect2.set(rectF);
                if (this.starsSize != measuredWidth) {
                    this.starsSize = measuredWidth;
                    drawable.resetPositions();
                }
                if (isNewStyleButtonLayout()) {
                    iDp4 = AndroidUtilities.dp(4.0f) + this.textY + this.textHeight;
                    this.backgroundRectHeight = 0;
                    if (imageSize > 0) {
                        iDp5 = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 16.0f, imageSize);
                    } else {
                        iDp5 = AndroidUtilities.dp(16.0f);
                    }
                    this.backgroundRectHeight = iDp5;
                    if (this.giftPremiumReleasedText != null) {
                        this.backgroundRectHeight = AndroidUtilities.dp(15.0f) + iDp5;
                    }
                    i3 = this.backgroundRectHeight + height;
                    this.backgroundRectHeight = i3;
                    f7 = (this.previousWidth - this.giftPremiumButtonWidth) / f6;
                    if (this.giftPremiumButtonLayout != null) {
                        this.backgroundButtonTop = AndroidUtilities.dp(7.0f) + i3 + iDp4;
                        rectF.set(f7 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f7 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 8.0f, this.giftPremiumButtonLayout.getHeight() + this.backgroundButtonTop));
                        this.backgroundRectHeight = (int) (rectF.height() + AndroidUtilities.dp(4.0f) + this.backgroundRectHeight);
                    } else if (!isMessageActionSuggestedPostApproval()) {
                        rectF.set(f7 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f7 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 8.0f, AndroidUtilities.dp(17.0f) + this.backgroundButtonTop));
                        this.backgroundRectHeight = AndroidUtilities.dp(17.0f) + this.backgroundRectHeight;
                    }
                    int iDp16 = AndroidUtilities.dp(15.0f) + this.backgroundRectHeight;
                    this.backgroundRectHeight = iDp16;
                    iDp6 = AndroidUtilities.dp(6.0f) + iDp4 + iDp16;
                    if (!reactionsLayoutInBubble.isEmpty) {
                        reactionsLayoutInBubble.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble.height;
                        iDp6 += reactionsLayoutInBubble.totalHeight;
                    }
                    iDp10 = iDp6;
                    if (this.botInlineButtons != null) {
                        iDp10 += AndroidUtilities.dp(44.0f);
                    }
                }
                rectF.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
            }
        }
        if (this.currentMessageObject != null && !reactionsLayoutInBubble.isEmpty) {
            reactionsLayoutInBubble.totalHeight = AndroidUtilities.dp(8.0f) + reactionsLayoutInBubble.height;
            iDp += reactionsLayoutInBubble.totalHeight;
        }
        if (isMessageActionSuggestedPostApproval()) {
            iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.titleHeight, 24.0f, iDp);
        }
        if (messageObject3 == null || !isNewStyleButtonLayout()) {
            setMeasuredDimension(iMax, AndroidUtilities.dp(14.0f) + this.topicSeparatorTopPadding + this.textHeight + iDp);
        } else {
            setMeasuredDimension(iMax, this.topicSeparatorTopPadding + iDp10);
        }
        reactionsLayoutInBubble.y = (getMeasuredHeight() - getPaddingTop()) - reactionsLayoutInBubble.totalHeight;
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
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
        float f;
        ImageUpdater imageUpdater;
        boolean z;
        TextLayout textLayout;
        TextLayout textLayout2;
        TLRPC.Message message;
        boolean z2;
        boolean z3;
        int i;
        BotInlineKeyboard.ButtonCustom buttonCustom;
        MessageObject messageObject;
        TLRPC.Message message2;
        MessageObject messageObject2;
        TLRPC.Message message3;
        TLRPC.Message message4;
        long j;
        AmountUtils$Amount amountUtils$AmountFromDecimal;
        int i2;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        boolean z4;
        int i3;
        int iRound;
        StaticLayout staticLayout;
        ArrayList arrayList;
        boolean z5;
        boolean z6;
        TLRPC.Message message5;
        int i4;
        final ChatActionCell chatActionCell = this;
        MessageObject messageObject3 = chatActionCell.currentMessageObject;
        float x = motionEvent.getX() - (chatActionCell.sideMenuWidth / 2.0f);
        chatActionCell.lastTouchX = x;
        float y = motionEvent.getY() + chatActionCell.getPaddingTop();
        chatActionCell.lastTouchY = y;
        if (messageObject3 == null) {
            if (chatActionCell.onActionClick != null) {
                if (motionEvent.getAction() == 0) {
                    if (x >= chatActionCell.backgroundLeft && x <= chatActionCell.backgroundRight) {
                        chatActionCell.actionPressed = true;
                        return true;
                    }
                } else if (chatActionCell.actionPressed) {
                    if (motionEvent.getAction() == 1) {
                        chatActionCell.onActionClick.onClick(chatActionCell);
                        chatActionCell.actionPressed = false;
                    } else if (motionEvent.getAction() == 3) {
                        chatActionCell.actionPressed = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        TopicSeparator topicSeparator = chatActionCell.topicSeparator;
        if (topicSeparator != null && topicSeparator.onTouchEvent(motionEvent, false)) {
            return true;
        }
        SuggestBirthdayActionLayout suggestBirthdayActionLayout = chatActionCell.birthdayLayout;
        if (suggestBirthdayActionLayout != null) {
            f = 2.0f;
            boolean zContains = suggestBirthdayActionLayout.buttonRect.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            ButtonBounce buttonBounce = suggestBirthdayActionLayout.bounce;
            if (action == 0) {
                buttonBounce.setPressed(zContains);
            } else if (motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1) {
                    if (buttonBounce.isPressed) {
                        suggestBirthdayActionLayout.open();
                    }
                    buttonBounce.setPressed(false);
                } else if (motionEvent.getAction() == 3) {
                    buttonBounce.setPressed(false);
                }
            }
            if (buttonBounce.isPressed) {
                return true;
            }
        } else {
            f = 2.0f;
        }
        StarGiftUniqueActionLayout starGiftUniqueActionLayout = chatActionCell.starGiftLayout;
        if ((starGiftUniqueActionLayout.has() && starGiftUniqueActionLayout.onTouchEvent(chatActionCell.starGiftLayoutX, chatActionCell.starGiftLayoutY, motionEvent)) || chatActionCell.reactionsLayoutInBubble.checkTouchEvent(motionEvent)) {
            return true;
        }
        int action2 = motionEvent.getAction();
        RectF rectF = chatActionCell.giftButtonRect;
        ImageReceiver imageReceiver = chatActionCell.imageReceiver;
        View view = chatActionCell.rippleView;
        ButtonBounce buttonBounce2 = chatActionCell.bounce;
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
        int i5 = chatActionCell.currentAccount;
        if (action2 != 0) {
            if (motionEvent.getAction() != 2) {
                chatActionCell.cancelCheckLongPress();
            }
            if (chatActionCell.actionPressed) {
                if (motionEvent.getAction() == 2) {
                    if (x < chatActionCell.backgroundLeft || x > chatActionCell.backgroundRight) {
                        z2 = false;
                        chatActionCell.actionPressed = false;
                    }
                } else if (motionEvent.getAction() == 1) {
                    View.OnClickListener onClickListener = chatActionCell.onActionClick;
                    if (onClickListener != null) {
                        onClickListener.onClick(chatActionCell);
                    }
                    chatActionCell.actionPressed = false;
                } else if (motionEvent.getAction() == 3) {
                    chatActionCell.actionPressed = false;
                }
                z2 = false;
            } else {
                if (chatActionCell.textPressed) {
                    int action3 = motionEvent.getAction();
                    if (action3 == 1) {
                        chatActionCell.textPressed = false;
                        view.setPressed(false);
                        buttonBounce2.setPressed(false);
                        if (chatActionCell.delegate == null || messageObject3.replyMessageObject == null || (message = messageObject3.messageOwner) == null || !TlUtils.isInstance(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                            if (chatActionCell.giftPremiumTextCollapsed && !chatActionCell.giftPremiumTextUncollapsed && (textLayout2 = chatActionCell.giftPremiumText) != null) {
                                int height = ((StaticLayout) textLayout2.layout).getHeight() - chatActionCell.giftPremiumTextCollapsedHeight;
                                chatActionCell.giftPremiumTextUncollapsed = true;
                                ChatActionCellDelegate chatActionCellDelegate = chatActionCell.delegate;
                                if (chatActionCellDelegate == null) {
                                    return true;
                                }
                                chatActionCellDelegate.forceUpdate(chatActionCell);
                                if (!(chatActionCell.getParent() instanceof RecyclerListView)) {
                                    return true;
                                }
                                ((RecyclerListView) chatActionCell.getParent()).smoothScrollBy(0, AndroidUtilities.dp(24.0f) + height, null);
                                return true;
                            }
                            if (chatActionCell.birthdayLayout != null && chatActionCell.backgroundRect.contains(motionEvent.getX(), motionEvent.getY())) {
                                chatActionCell.birthdayLayout.open();
                                return true;
                            }
                        } else {
                            chatActionCell.delegate.didPressReplyMessage(chatActionCell, chatActionCell.currentMessageObject.getReplyMsgId());
                        }
                    } else if (action3 == 2) {
                        TextLayout textLayout3 = chatActionCell.giftPremiumText;
                        if (textLayout3 == null || !chatActionCell.giftPremiumTextCollapsed) {
                            chatActionCell.textPressed = false;
                        } else {
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            float f2 = textLayout3.x;
                            float f3 = textLayout3.y;
                            float width = ((StaticLayout) textLayout3.layout).getWidth() + f2;
                            TextLayout textLayout4 = chatActionCell.giftPremiumText;
                            rectF2.set(f2, f3, width, textLayout4.y + ((StaticLayout) textLayout4.layout).getHeight());
                            if (!rectF2.contains(x, y)) {
                                chatActionCell.textPressed = false;
                            }
                        }
                        z2 = true;
                    } else if (action3 == 3) {
                        chatActionCell.textPressed = false;
                        buttonBounce2.setPressed(false);
                    }
                } else if (chatActionCell.giftButtonPressed) {
                    int action4 = motionEvent.getAction();
                    if (action4 == 1) {
                        chatActionCell.imagePressed = false;
                        chatActionCell.giftButtonPressed = false;
                        view.setPressed(false);
                        buttonBounce2.setPressed(false);
                        if (chatActionCell.delegate != null) {
                            int i6 = messageObject3.type;
                            if (i6 == 37) {
                                chatActionCell.playSoundEffect(0);
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment != null) {
                                    new CommunitySheet(safeLastFragment, ((TLRPC.TL_messageActionChangeCommunity) messageObject3.messageOwner.action).community_id, null, null).show();
                                }
                            } else if (i6 == 31) {
                                chatActionCell.playSoundEffect(0);
                                chatActionCell.openStarsGiftTransaction();
                            } else if (i6 == 25) {
                                chatActionCell.playSoundEffect(0);
                                if (chatActionCell.delegate != null) {
                                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(28, chatActionCell, (TLRPC.TL_messageActionGiftCode) chatActionCell.currentMessageObject.messageOwner.action));
                                }
                            } else if (i6 == 18) {
                                chatActionCell.playSoundEffect(0);
                                chatActionCell.openPremiumGiftPreview();
                            } else if (i6 == 30) {
                                chatActionCell.playSoundEffect(0);
                                chatActionCell.openStarsGiftTransaction();
                            } else {
                                TLRPC.Message message6 = messageObject3.messageOwner;
                                if (message6 != null) {
                                    TLRPC.MessageAction messageAction = message6.action;
                                    if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                        chatActionCell.playSoundEffect(0);
                                        MessageSuggestionParams messageSuggestionParamsObtainSuggestionOffer = chatActionCell.currentMessageObject.obtainSuggestionOffer();
                                        AmountUtils$Amount amountUtils$Amount = messageSuggestionParamsObtainSuggestionOffer.amount;
                                        if (amountUtils$Amount != null && amountUtils$Amount.currency == amountUtils$Currency) {
                                            new StarsIntroActivity.StarsNeededSheet(chatActionCell.getContext(), chatActionCell.themeDelegate, messageSuggestionParamsObtainSuggestionOffer.amount.nanos / 1000000000, 13, ForumUtilities.getMonoForumTitle(i5, chatActionCell.currentMessageObject.getDialogId()), null, chatActionCell.currentMessageObject.getDialogId()).show();
                                        }
                                    } else if (MessagesController.getInstance(i5).photoSuggestion.get(messageObject3.messageOwner.local_id) == null) {
                                        if (chatActionCell.buttonClickableAsImage) {
                                            chatActionCell.delegate.didClickImage(chatActionCell);
                                        } else {
                                            chatActionCell.delegate.didClickButton(chatActionCell);
                                        }
                                    }
                                } else if (MessagesController.getInstance(i5).photoSuggestion.get(messageObject3.messageOwner.local_id) == null) {
                                    if (chatActionCell.buttonClickableAsImage) {
                                        chatActionCell.delegate.didClickImage(chatActionCell);
                                    } else {
                                        chatActionCell.delegate.didClickButton(chatActionCell);
                                    }
                                }
                            }
                        }
                    } else if (action4 != 2) {
                        if (action4 == 3) {
                            chatActionCell.imagePressed = false;
                            chatActionCell.giftButtonPressed = false;
                            view.setPressed(false);
                            buttonBounce2.setPressed(false);
                        }
                    } else if (!chatActionCell.isButtonLayout(messageObject3) || (!rectF.contains(x, y) && !chatActionCell.backgroundRect.contains(x, y))) {
                        chatActionCell.giftButtonPressed = false;
                        view.setPressed(false);
                        buttonBounce2.setPressed(false);
                    }
                } else if (chatActionCell.imagePressed) {
                    int action5 = motionEvent.getAction();
                    if (action5 == 1) {
                        chatActionCell.imagePressed = false;
                        if (chatActionCell.giftPremiumTextCollapsed && !chatActionCell.giftPremiumTextUncollapsed && (textLayout = chatActionCell.giftPremiumText) != null) {
                            int height2 = ((StaticLayout) textLayout.layout).getHeight() - chatActionCell.giftPremiumTextCollapsedHeight;
                            chatActionCell.giftPremiumTextUncollapsed = true;
                            ChatActionCellDelegate chatActionCellDelegate2 = chatActionCell.delegate;
                            if (chatActionCellDelegate2 == null) {
                                return true;
                            }
                            chatActionCellDelegate2.forceUpdate(chatActionCell);
                            if (!(chatActionCell.getParent() instanceof RecyclerListView)) {
                                return true;
                            }
                            ((RecyclerListView) chatActionCell.getParent()).smoothScrollBy(0, AndroidUtilities.dp(16.0f) + height2, null);
                            return true;
                        }
                        int i7 = messageObject3.type;
                        if (i7 == 31) {
                            chatActionCell.openStarsGiftTransaction();
                        } else if (i7 == 25) {
                            if (chatActionCell.delegate != null) {
                                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(28, chatActionCell, (TLRPC.TL_messageActionGiftCode) chatActionCell.currentMessageObject.messageOwner.action));
                            }
                        } else if (i7 == 18) {
                            chatActionCell.openPremiumGiftPreview();
                        } else if (i7 == 30) {
                            chatActionCell.openStarsGiftTransaction();
                        } else if (chatActionCell.delegate != null) {
                            if (i7 != 21 || (imageUpdater = MessagesController.getInstance(i5).photoSuggestion.get(messageObject3.messageOwner.local_id)) == null) {
                                chatActionCell.delegate.didClickImage(chatActionCell);
                                chatActionCell.playSoundEffect(0);
                            } else {
                                imageUpdater.canceled = true;
                                String str = imageUpdater.uploadingImage;
                                int i8 = imageUpdater.currentAccount;
                                if (str != null) {
                                    z = false;
                                    FileLoader.getInstance(i8).cancelFileUpload(imageUpdater.uploadingImage, false);
                                } else {
                                    z = false;
                                }
                                if (imageUpdater.uploadingVideo != null) {
                                    FileLoader.getInstance(i8).cancelFileUpload(imageUpdater.uploadingVideo, z);
                                }
                                ImageUpdater.ImageUpdaterDelegate imageUpdaterDelegate = imageUpdater.delegate;
                                if (imageUpdaterDelegate != null) {
                                    imageUpdaterDelegate.didUploadFailed();
                                }
                            }
                        }
                    } else if (action5 != 2) {
                        if (action5 == 3) {
                            chatActionCell.imagePressed = false;
                        }
                    } else if (chatActionCell.isNewStyleButtonLayout()) {
                        if (!chatActionCell.backgroundRect.contains(x, y)) {
                            chatActionCell.imagePressed = false;
                        }
                    } else if (!imageReceiver.isInsideImage(x, y)) {
                        chatActionCell.imagePressed = false;
                    }
                }
                z2 = false;
            }
        } else if (chatActionCell.delegate != null) {
            if ((messageObject3.type == 11 || chatActionCell.isButtonLayout(messageObject3)) && imageReceiver.isInsideImage(x, y)) {
                chatActionCell.imagePressed = true;
                z5 = true;
            } else {
                z5 = false;
            }
            if (chatActionCell.radialProgress.mediaActionDrawable.nextIcon == 4 && (((i4 = messageObject3.type) == 21 || i4 == 22) && chatActionCell.backgroundRect.contains(x, y))) {
                chatActionCell.imagePressed = true;
                z5 = true;
            }
            TextLayout textLayout5 = chatActionCell.giftPremiumText;
            if (textLayout5 != null && chatActionCell.giftPremiumTextCollapsed) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f4 = textLayout5.x;
                float f5 = textLayout5.y;
                float width2 = ((StaticLayout) textLayout5.layout).getWidth() + f4;
                TextLayout textLayout6 = chatActionCell.giftPremiumText;
                rectF3.set(f4, f5, width2, textLayout6.y + ((StaticLayout) textLayout6.layout).getHeight());
                if (rectF3.contains(x, y)) {
                    chatActionCell.textPressed = true;
                    z5 = true;
                }
            }
            if (chatActionCell.isButtonLayout(messageObject3) && chatActionCell.giftPremiumButtonLayout != null && (rectF.contains(x, y) || (chatActionCell.buttonClickableAsImage && chatActionCell.backgroundRect.contains(x, y)))) {
                z6 = true;
                chatActionCell.giftButtonPressed = true;
                view.setPressed(true);
                buttonBounce2.setPressed(true);
                z5 = true;
            } else {
                z6 = true;
            }
            if (!z5 && chatActionCell.isMessageActionSuggestedPostApproval()) {
                chatActionCell.textPressed = z6;
                z5 = true;
            }
            if (!z5) {
                MessageObject messageObject4 = chatActionCell.currentMessageObject;
                if (TlUtils.isInstance((messageObject4 == null || (message5 = messageObject4.messageOwner) == null) ? null : message5.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                    chatActionCell.textPressed = true;
                    z5 = true;
                }
            }
            if (z5) {
                chatActionCell.startCheckLongPress$1();
            }
            z2 = z5;
        } else {
            z2 = false;
        }
        if (!z2 && (motionEvent.getAction() == 0 || ((chatActionCell.pressedLink != null || chatActionCell.spoilerPressed != null) && motionEvent.getAction() == 1))) {
            TextLayout textLayout7 = chatActionCell.giftPremiumText;
            if (textLayout7 != null && (arrayList = textLayout7.spoilers) != null && !arrayList.isEmpty() && !chatActionCell.isSpoilerRevealing) {
                ArrayList arrayList2 = chatActionCell.giftPremiumText.spoilers;
                int size = arrayList2.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    SpoilerEffect spoilerEffect = (SpoilerEffect) obj;
                    Rect bounds = spoilerEffect.getBounds();
                    TextLayout textLayout8 = chatActionCell.giftPremiumText;
                    if (bounds.contains((int) (x - textLayout8.x), (int) (y - textLayout8.y))) {
                        chatActionCell.pressedLink = null;
                        if (motionEvent.getAction() == 0) {
                            chatActionCell.spoilerPressed = spoilerEffect;
                        } else {
                            SpoilerEffect spoilerEffect2 = chatActionCell.spoilerPressed;
                            if (spoilerEffect == spoilerEffect2) {
                                chatActionCell.isSpoilerRevealing = true;
                                spoilerEffect2.onRippleEndCallback = new ChatActionCell$$ExternalSyntheticLambda3(chatActionCell, 2);
                                float fSqrt = (float) Math.sqrt(Math.pow(((StaticLayout) chatActionCell.giftPremiumText.layout).getHeight(), 2.0d) + Math.pow(((StaticLayout) chatActionCell.giftPremiumText.layout).getWidth(), 2.0d));
                                SpoilerEffect spoilerEffect3 = chatActionCell.spoilerPressed;
                                TextLayout textLayout9 = chatActionCell.giftPremiumText;
                                spoilerEffect3.startRipple((int) (x - textLayout9.x), (int) (y - textLayout9.y), fSqrt, false);
                                chatActionCell.invalidate();
                            }
                        }
                        z2 = true;
                        break;
                    }
                }
            }
            if (z2 || (staticLayout = chatActionCell.textLayout) == null) {
                chatActionCell.pressedLink = null;
            } else {
                int i10 = chatActionCell.textX;
                if (x >= i10) {
                    int i11 = chatActionCell.textY;
                    float f6 = i11;
                    if (y < f6 || x > i10 + chatActionCell.textWidth || y > i11 + chatActionCell.textHeight) {
                        chatActionCell.pressedLink = null;
                    } else {
                        float f7 = y - f6;
                        float f8 = x - chatActionCell.textXLeft;
                        if (!z2) {
                            int lineForVertical = staticLayout.getLineForVertical((int) f7);
                            int offsetForHorizontal = chatActionCell.textLayout.getOffsetForHorizontal(lineForVertical, f8);
                            float lineLeft = chatActionCell.textLayout.getLineLeft(lineForVertical);
                            if (lineLeft > f8 || chatActionCell.textLayout.getLineWidth(lineForVertical) + lineLeft < f8) {
                                chatActionCell.pressedLink = null;
                            } else {
                                CharSequence charSequence = messageObject3.messageText;
                                if (charSequence instanceof Spannable) {
                                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                    if (uRLSpanArr.length != 0) {
                                        if (motionEvent.getAction() == 0) {
                                            chatActionCell.pressedLink = uRLSpanArr[0];
                                        } else {
                                            URLSpan uRLSpan = uRLSpanArr[0];
                                            URLSpan uRLSpan2 = chatActionCell.pressedLink;
                                            if (uRLSpan == uRLSpan2) {
                                                chatActionCell.openLink(uRLSpan2);
                                            }
                                        }
                                        z2 = true;
                                    } else {
                                        chatActionCell.pressedLink = null;
                                    }
                                } else {
                                    chatActionCell.pressedLink = null;
                                }
                            }
                        }
                    }
                } else {
                    chatActionCell.pressedLink = null;
                }
            }
        }
        if (z2) {
            z3 = z2;
        } else {
            ArrayList arrayList3 = chatActionCell.botButtons;
            if (arrayList3.isEmpty()) {
                z3 = false;
            } else {
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                float width3 = (chatActionCell.getWidth() - chatActionCell.giftRectSize) / f;
                float fDp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + chatActionCell.textY + chatActionCell.textHeight + chatActionCell.backgroundRectHeight;
                float fDp2 = (chatActionCell.giftRectSize - AndroidUtilities.dp(4.0f)) / f;
                int action6 = motionEvent.getAction();
                Theme.ResourcesProvider resourcesProvider = chatActionCell.themeDelegate;
                if (action6 == 0) {
                    chatActionCell.pressedBotButton = -1;
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        BotButton botButton = (BotButton) arrayList3.get(i12);
                        float fDp3 = ((AndroidUtilities.dp(4.0f) + fDp2) * i12) + width3;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(fDp3, fDp, fDp3 + fDp2, botButton.height + fDp);
                        float f9 = x2;
                        float f10 = y2;
                        if (rectF4.contains(f9, f10)) {
                            chatActionCell.pressedBotButton = i12;
                            chatActionCell.invalidateOutbounds();
                            if (botButton.selectorDrawable == null) {
                                BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_chat_serviceBackgroundSelector, resourcesProvider), 6, 6);
                                botButton.selectorDrawable = rippleDrawableSafeCreateRadSelectorDrawable;
                                rippleDrawableSafeCreateRadSelectorDrawable.setCallback(chatActionCell);
                            }
                            botButton.selectorDrawable.setHotspot(f9, f10);
                            botButton.selectorDrawable.setState(chatActionCell.pressedState);
                            botButton.setPressed(!botButton.isLocked);
                            z3 = true;
                        }
                    }
                } else if (motionEvent.getAction() != 1) {
                    if (motionEvent.getAction() == 3 && (i = chatActionCell.pressedBotButton) != -1) {
                        BotButton botButton2 = (BotButton) arrayList3.get(i);
                        BaseCell.RippleDrawableSafe rippleDrawableSafe = botButton2.selectorDrawable;
                        if (rippleDrawableSafe != null) {
                            rippleDrawableSafe.setState(StateSet.NOTHING);
                        }
                        botButton2.setPressed(false);
                        chatActionCell.pressedBotButton = -1;
                        chatActionCell.invalidateOutbounds();
                    }
                    z3 = false;
                } else if (chatActionCell.pressedBotButton != -1) {
                    chatActionCell.playSoundEffect(0);
                    BotButton botButton3 = (BotButton) arrayList3.get(chatActionCell.pressedBotButton);
                    BaseCell.RippleDrawableSafe rippleDrawableSafe2 = botButton3.selectorDrawable;
                    if (rippleDrawableSafe2 != null) {
                        rippleDrawableSafe2.setState(StateSet.NOTHING);
                    }
                    botButton3.setPressed(false);
                    if (chatActionCell.delegate != null && !botButton3.isLocked && (buttonCustom = botButton3.buttonCustom) != null && chatActionCell.getMessageObject() != null) {
                        int i13 = buttonCustom.id;
                        if (i13 == 5) {
                            ChatActionCellDelegate chatActionCellDelegate3 = chatActionCell.delegate;
                            BaseFragment baseFragment = chatActionCellDelegate3 != null ? chatActionCellDelegate3.getBaseFragment() : null;
                            if (baseFragment != null && chatActionCell.currentMessageObject != null) {
                                AlertsCreator.showSimpleConfirmAlert(baseFragment, LocaleController.getString(R.string.GiftOfferRejectConfirmTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferRejectConfirmText, DialogObject.getShortName(chatActionCell.currentMessageObject.getDialogId()))), LocaleController.getString(R.string.GiftOfferRejectConfirmConfirm), true, new ArticleViewer$$ExternalSyntheticLambda8(26, chatActionCell, baseFragment));
                            }
                        } else if (i13 == 6) {
                            MessageObject messageObject5 = chatActionCell.currentMessageObject;
                            if (messageObject5 != null && (message4 = messageObject5.messageOwner) != null) {
                                TLRPC.MessageAction messageAction2 = message4.action;
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                    TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                                    Context context = chatActionCell.getContext();
                                    long dialogId = chatActionCell.currentMessageObject.getDialogId();
                                    int id = chatActionCell.currentMessageObject.getId();
                                    int[] iArr = GiftOfferSheet.ALLOWED_DURATIONS;
                                    AmountUtils$Amount amountUtils$AmountOfSafe = AmountUtils$Amount.ofSafe(tL_messageActionStarGiftPurchaseOffer.price);
                                    AmountUtils$Currency amountUtils$Currency2 = amountUtils$AmountOfSafe.currency;
                                    AmountUtils$Amount amountUtils$AmountFromNano = AmountUtils$Amount.fromNano((amountUtils$AmountOfSafe.nanos * ((long) (amountUtils$Currency2 == amountUtils$Currency ? MessagesController.getInstance(i5).config.starsStarGiftResaleCommissionPermille.get() : MessagesController.getInstance(i5).config.tonStarGiftResaleCommissionPermille.get()))) / 1000, amountUtils$Currency2);
                                    TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(starGift.title);
                                    sb.append(" #");
                                    String strM = BillingController$$ExternalSyntheticOutline0.m(starGift.num, ',', sb);
                                    TLObject user = dialogId >= 0 ? MessagesController.getInstance(i5).getUser(Long.valueOf(dialogId)) : MessagesController.getInstance(i5).getChat(Long.valueOf(-dialogId));
                                    String strAsFormatString = amountUtils$AmountOfSafe.asFormatString();
                                    String strAsFormatString2 = amountUtils$AmountFromNano.asFormatString();
                                    AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.TON;
                                    AmountUtils$Currency amountUtils$Currency4 = amountUtils$AmountOfSafe.currency;
                                    boolean z7 = amountUtils$Currency4 == amountUtils$Currency3;
                                    LinearLayout linearLayoutM = zzkf.m(context, 1);
                                    linearLayoutM.addView(new StarGiftSheet.GiftTransferTopView(context, starGift, user), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
                                    TextView textView = new TextView(context);
                                    OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 16.0f);
                                    textView.setText(AndroidUtilities.replaceTags(amountUtils$Currency4 == amountUtils$Currency ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellStars, strAsFormatString, DialogObject.getShortName(dialogId), strM, strAsFormatString2) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellTON, strAsFormatString, DialogObject.getShortName(dialogId), strM, strAsFormatString2)));
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
                                    boolean z8 = z7;
                                    double dPow = starGift.value_usd_amount / Math.pow(10.0d, BillingController.getInstance().getCurrencyExp("USD"));
                                    if (amountUtils$Currency4 == amountUtils$Currency3) {
                                        amountUtils$AmountFromDecimal = new AmountUtils$Amount((long) ((dPow / MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get()) * 1000000000), amountUtils$Currency3).round(2);
                                    } else {
                                        if (amountUtils$Currency4 == amountUtils$Currency) {
                                            amountUtils$AmountFromDecimal = new AmountUtils$Amount((long) (((dPow * 100000.0d) / ((double) MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000)) * 1000000000), amountUtils$Currency).round(0);
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
                                                    z4 = true;
                                                } else {
                                                    i2 = 1;
                                                }
                                                TextView textView2 = new TextView(context);
                                                textView2.setTextSize(i2, 13.0f);
                                                textView2.setGravity(17);
                                                textView2.setText(spannableStringBuilderReplaceTags);
                                                if (z4) {
                                                    i3 = Theme.key_text_RedRegular;
                                                } else {
                                                    i3 = Theme.key_windowBackgroundWhiteGrayText;
                                                }
                                                textView2.setTextColor(Theme.getColor(i3, resourcesProvider));
                                                linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
                                            } else {
                                                i2 = 1;
                                                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, RendererCapabilities.CC.m((int) Math.round(((amountUtils$AmountFromNano.asDouble() / amountUtils$AmountFromDecimal.asDouble()) - 1.0d) * 100.0d), "%"), starGift.title));
                                            }
                                            z4 = false;
                                            TextView textView3 = new TextView(context);
                                            textView3.setTextSize(i2, 13.0f);
                                            textView3.setGravity(17);
                                            textView3.setText(spannableStringBuilderReplaceTags);
                                            if (z4) {
                                                i3 = Theme.key_text_RedRegular;
                                            } else {
                                                i3 = Theme.key_windowBackgroundWhiteGrayText;
                                            }
                                            textView3.setTextColor(Theme.getColor(i3, resourcesProvider));
                                            linearLayoutM.addView(textView3, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
                                        }
                                        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
                                        builder.setView(linearLayoutM);
                                        builder.setPositiveButton(StarsIntroActivity.replaceStars(z8, LocaleController.formatString(R.string.GiftOfferSellFor, strAsFormatString2), 1.13f), new EditTextCaption$$ExternalSyntheticLambda2(id, i5, lastFragment));
                                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                        builder.alertDialog.show();
                                    }
                                    j = 0;
                                    if (amountUtils$AmountFromDecimal.asDouble() > 0.0d) {
                                        if (amountUtils$AmountFromDecimal.nanos >= amountUtils$AmountFromNano.nanos) {
                                            iRound = (int) Math.round((1.0d - (amountUtils$AmountFromNano.asDouble() / amountUtils$AmountFromDecimal.asDouble())) * 100.0d);
                                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountLowerHint2, RendererCapabilities.CC.m(iRound, "%"), starGift.title));
                                            if (iRound > 10) {
                                                i2 = 1;
                                                z4 = true;
                                            } else {
                                                i2 = 1;
                                            }
                                            TextView textView4 = new TextView(context);
                                            textView4.setTextSize(i2, 13.0f);
                                            textView4.setGravity(17);
                                            textView4.setText(spannableStringBuilderReplaceTags);
                                            if (z4) {
                                                i3 = Theme.key_text_RedRegular;
                                            } else {
                                                i3 = Theme.key_windowBackgroundWhiteGrayText;
                                            }
                                            textView4.setTextColor(Theme.getColor(i3, resourcesProvider));
                                            linearLayoutM.addView(textView4, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
                                        } else {
                                            i2 = 1;
                                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, RendererCapabilities.CC.m((int) Math.round(((amountUtils$AmountFromNano.asDouble() / amountUtils$AmountFromDecimal.asDouble()) - 1.0d) * 100.0d), "%"), starGift.title));
                                        }
                                        z4 = false;
                                        TextView textView5 = new TextView(context);
                                        textView5.setTextSize(i2, 13.0f);
                                        textView5.setGravity(17);
                                        textView5.setText(spannableStringBuilderReplaceTags);
                                        if (z4) {
                                            i3 = Theme.key_text_RedRegular;
                                        } else {
                                            i3 = Theme.key_windowBackgroundWhiteGrayText;
                                        }
                                        textView5.setTextColor(Theme.getColor(i3, resourcesProvider));
                                        linearLayoutM.addView(textView5, LayoutHelper.createLinear(-1, -2, 49, 40, 12, 40, 9));
                                    }
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, resourcesProvider);
                                    builder2.setView(linearLayoutM);
                                    builder2.setPositiveButton(StarsIntroActivity.replaceStars(z8, LocaleController.formatString(R.string.GiftOfferSellFor, strAsFormatString2), 1.13f), new EditTextCaption$$ExternalSyntheticLambda2(id, i5, lastFragment));
                                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                    builder2.alertDialog.show();
                                }
                            }
                            chatActionCell = this;
                        } else if (i13 == 7) {
                            chatActionCell = this;
                            ChatActionCellDelegate chatActionCellDelegate4 = chatActionCell.delegate;
                            BaseFragment baseFragment2 = chatActionCellDelegate4 != null ? chatActionCellDelegate4.getBaseFragment() : null;
                            if (baseFragment2 != null && (messageObject2 = chatActionCell.currentMessageObject) != null && (message3 = messageObject2.messageOwner) != null) {
                                TLRPC.MessageAction messageAction3 = message3.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                    final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                    final int i14 = 0;
                                    AlertsCreator.showSimpleConfirmAlert(baseFragment2, LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelText : R.string.SharingOfferEnableCancelText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(chatActionCell) {
                                        public final ChatActionCell f$0;

                                        {
                                            this.f$0 = chatActionCell;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    ChatActionCell chatActionCell2 = this.f$0;
                                                    MessagesController.getInstance(chatActionCell2.currentAccount).toggleChatNoForwards(chatActionCell2.currentMessageObject.getDialogId(), chatActionCell2.currentMessageObject.getId(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                    break;
                                                default:
                                                    ChatActionCell chatActionCell3 = this.f$0;
                                                    MessagesController.getInstance(chatActionCell3.currentAccount).toggleChatNoForwards(chatActionCell3.currentMessageObject.getDialogId(), chatActionCell3.currentMessageObject.getId(), tL_messageActionNoForwardsRequest.new_value, null);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        } else {
                            chatActionCell = this;
                            if (i13 == 8) {
                                ChatActionCellDelegate chatActionCellDelegate5 = chatActionCell.delegate;
                                BaseFragment baseFragment3 = chatActionCellDelegate5 != null ? chatActionCellDelegate5.getBaseFragment() : null;
                                if (baseFragment3 != null && (messageObject = chatActionCell.currentMessageObject) != null && (message2 = messageObject.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction4 = message2.action;
                                    if (messageAction4 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                        final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction4;
                                        final int i15 = 1;
                                        AlertsCreator.showSimpleConfirmAlert(baseFragment3, LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableConfirmText : R.string.SharingOfferEnableConfirmText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(chatActionCell) {
                                            public final ChatActionCell f$0;

                                            {
                                                this.f$0 = chatActionCell;
                                            }

                                            @Override
                                            public final void run() {
                                                switch (i15) {
                                                    case 0:
                                                        ChatActionCell chatActionCell2 = this.f$0;
                                                        MessagesController.getInstance(chatActionCell2.currentAccount).toggleChatNoForwards(chatActionCell2.currentMessageObject.getDialogId(), chatActionCell2.currentMessageObject.getId(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                        break;
                                                    default:
                                                        ChatActionCell chatActionCell3 = this.f$0;
                                                        MessagesController.getInstance(chatActionCell3.currentAccount).toggleChatNoForwards(chatActionCell3.currentMessageObject.getDialogId(), chatActionCell3.currentMessageObject.getId(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    }
                    chatActionCell.pressedBotButton = -1;
                    chatActionCell.invalidateOutbounds();
                }
                z3 = false;
            }
        }
        return !z3 ? super.onTouchEvent(motionEvent) : z3;
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
                TLObject tLObject = ((URLSpanNoUnderline) uRLSpan).object;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    ForumUtilities.openTopic(this.delegate.getBaseFragment(), -this.delegate.getDialogId(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.pressedLink;
            if (uRLSpan2 instanceof URLSpanNoUnderline) {
                TLObject tLObject2 = ((URLSpanNoUnderline) uRLSpan2).object;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.delegate.needOpenInviteLink((TLRPC.TL_chatInviteExported) tLObject2);
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
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(this, tL_premiumGiftOption, str, 5));
        }
    }

    public final void openStarsGiftTransaction() {
        TLRPC.Message message;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        StoriesUtilities.AvatarStoryParams avatarStoryParams = this.avatarStoryParams;
        if (z) {
            Context context = getContext();
            TLRPC.Message message2 = this.currentMessageObject.messageOwner;
            int i = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            Theme.ResourcesProvider resourcesProvider = avatarStoryParams.resourcesProvider;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            StarsIntroActivity.showTransactionSheet(context, false, 0L, this.currentAccount, starsTransaction, resourcesProvider);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.currentMessageObject.messageOwner;
            int i2 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            Theme.ResourcesProvider resourcesProvider2 = avatarStoryParams.resourcesProvider;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i2;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= 8192;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            StarsIntroActivity.showTransactionSheet(context2, false, 0L, this.currentAccount, starsTransaction2, resourcesProvider2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.currentMessageObject.messageOwner;
            int i3 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            Theme.ResourcesProvider resourcesProvider3 = avatarStoryParams.resourcesProvider;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i3;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            StarsIntroActivity.showTransactionSheet(context3, false, 0L, this.currentAccount, starsTransaction3, resourcesProvider3);
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
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                StarGiftSheet starGiftSheet2 = new StarGiftSheet(this.currentAccount, getContext(), this.themeDelegate, this.currentMessageObject.getDialogId(), null);
                starGiftSheet2.set(this.currentMessageObject, (StarsController.IGiftsList) null);
                starGiftSheet2.show();
                return;
            } else {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment == null) {
                    return;
                }
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.UniqueGiftNotFoundBurned, BulletinFactory.of(safeLastFragment), R.raw.fire_on, 36);
                return;
            }
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
    public final void setAnimationRunning(boolean z, boolean z2) {
    }

    public final void setCustomDate(int i, boolean z, boolean z2) {
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

    public final void setOverrideColor(int i, int i2) {
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
        ArrayList arrayList = this.spoilers;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((SpoilerEffect) obj).invalidateSelf();
        }
    }

    public final void setVisiblePart(float f, int i) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
        this.viewTranslationX = 0.0f;
    }

    @Override
    public final boolean shouldDrawAlphaLayer() {
        return false;
    }

    public final void updateTextInternal(boolean z) {
        if (getMeasuredWidth() != 0) {
            createLayout(getMeasuredWidth(), this.customText);
            invalidate();
        }
        if (this.wasLayout) {
            buildLayout();
        } else if (z) {
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda3(this, 3));
        } else {
            requestLayout();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.wallpaperPreviewDrawable || super.verifyDrawable(drawable);
    }

    @Override
    public final boolean willRemovedAfterAnimation() {
        return false;
    }

    public ChatActionCell(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.bounce = new ButtonBounce(this, 1.0f, 5.0f);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        StoriesUtilities.AvatarStoryParams avatarStoryParams = new StoriesUtilities.AvatarStoryParams(null, false);
        this.avatarStoryParams = avatarStoryParams;
        this.showTopicSeparator = true;
        this.giftButtonRect = new RectF();
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack();
        this.reactionsLayoutInBubble = new ReactionsLayoutInBubble(this);
        this.overrideBackground = -1;
        this.overrideText = -1;
        this.lineWidths = new ArrayList();
        this.lineHeights = new ArrayList();
        this.backgroundPath = new Path();
        this.rect = new RectF();
        this.invalidatePath = true;
        this.invalidateColors = false;
        this.giftPremiumTextUncollapsed = false;
        this.giftPremiumTextCollapsed = false;
        this.giftPremiumTextExpandedAnimated = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.buttonClickableAsImage = true;
        TextPaint textPaint = new TextPaint(1);
        this.giftTitlePaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.giftTextPaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.giftSubtitlePaint = textPaint3;
        this.radialProgress = new RadialProgress2(null, this);
        this.giftStickerDelegate = new ChatActivity$$ExternalSyntheticLambda356(this, 2);
        this.starsPath = new Path();
        this.botButtons = new ArrayList();
        this.dimPaint = new Paint(1);
        this.backgroundPath2 = new Path();
        this.radii = new float[8];
        this.botButtonRadii = new float[8];
        this.botButtonPath = new Path();
        this.pressedState = new int[]{16842910, 16842919};
        this.transitionParams = new TransitionParams();
        avatarStoryParams.drawSegments = false;
        this.canDrawInParent = z;
        this.themeDelegate = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.TAG = DownloadController.getInstance(i).generateObserverTag();
        this.starGiftLayout = new StarGiftUniqueActionLayout(resourcesProvider, this, i);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.rippleView = view;
        view.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
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

    public final void setMessageObject(MessageObject messageObject, boolean z) {
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z2;
        String str;
        Object obj;
        String str2;
        Object obj2;
        String str3;
        TLRPC.Document document;
        String str4;
        TLRPC.Document document2;
        TLRPC.Document giftDocument;
        BotInlineKeyboard.Source source;
        boolean z3;
        int i;
        int i2;
        int rowsCount;
        int i3;
        int columnsCount;
        int i4;
        BotButton botButton;
        int iconRes;
        boolean z4;
        boolean z5;
        boolean z6;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        float f;
        TLRPC.Message message;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str5;
        int i5;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
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
            boolean z7 = messageObject3 == null || messageObject3.stableId != messageObject2.stableId;
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
            if (textLayout != null && z7) {
                AnimatedEmojiSpan.release((ChatActionCell) textLayout.this$0, (AnimatedEmojiSpan.EmojiGroupedSpans) textLayout.emoji);
                this.giftPremiumText = null;
                this.giftPremiumTextUncollapsed = false;
            }
            if (z7 || messageObject2.reactionsChanged) {
                messageObject2.reactionsChanged = false;
                TLRPC.Message message2 = messageObject2.messageOwner;
                boolean z8 = (message2 == null || (tL_messageReactions = message2.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                if (messageObject2.shouldDrawReactions()) {
                    this.reactionsLayoutInBubble.setMessage(messageObject2, !messageObject2.shouldDrawReactionsInLayout(), z8, this.themeDelegate);
                } else {
                    this.reactionsLayoutInBubble.setMessage(null, false, false, this.themeDelegate);
                }
            }
            if (messageObject2.type == 32) {
                if (this.birthdayLayout == null) {
                    SuggestBirthdayActionLayout suggestBirthdayActionLayout = new SuggestBirthdayActionLayout(this.currentAccount, this, this.themeDelegate);
                    this.birthdayLayout = suggestBirthdayActionLayout;
                    if (this.attachedToWindow) {
                        suggestBirthdayActionLayout.sticker.masterParent = suggestBirthdayActionLayout.view;
                    }
                }
                SuggestBirthdayActionLayout suggestBirthdayActionLayout2 = this.birthdayLayout;
                suggestBirthdayActionLayout2.getClass();
                TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject2.messageOwner.action;
                suggestBirthdayActionLayout2.birthday = tL_messageActionSuggestBirthday.birthday;
                Text text = new Text(TextUtils.concat(messageObject2.messageText, ":"), 13.0f, null);
                text.maxLines = 6;
                text.setText(text.layout.getText());
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                text.align();
                text.maxWidth = AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f);
                text.setText(text.layout.getText());
                suggestBirthdayActionLayout2.text = text;
                int i6 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
                Text[] textArr = new Text[i6];
                suggestBirthdayActionLayout2.titles = textArr;
                suggestBirthdayActionLayout2.values = new Text[i6];
                textArr[0] = new Text(LocaleController.getString(R.string.DateDay), 11.0f, null);
                suggestBirthdayActionLayout2.values[0] = new Text("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
                suggestBirthdayActionLayout2.titles[1] = new Text(LocaleController.getString(R.string.DateMonth), 11.0f, null);
                Text[] textArr2 = suggestBirthdayActionLayout2.values;
                StringBuilder sb = new StringBuilder("");
                int i7 = tL_messageActionSuggestBirthday.birthday.month - 1;
                sb.append((i7 < 0 || i7 >= 12) ? DiffUtil.m(i7, "") : LocaleController.getString(new int[]{R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December}[i7]));
                textArr2[1] = new Text(sb.toString(), 11.0f, AndroidUtilities.bold());
                if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
                    suggestBirthdayActionLayout2.titles[2] = new Text(LocaleController.getString(R.string.DateYear), 11.0f, null);
                    suggestBirthdayActionLayout2.values[2] = new Text("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
                }
                suggestBirthdayActionLayout2.hasButton = !messageObject2.isOutOwner();
                Theme.ResourcesProvider resourcesProvider = suggestBirthdayActionLayout2.resourcesProvider;
                suggestBirthdayActionLayout2.buttonPaint.setColor(resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark() ? Theme.multAlpha(0.12f, -1) : Theme.multAlpha(0.12f, -16777216));
                suggestBirthdayActionLayout2.button = new Text(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
            } else {
                SuggestBirthdayActionLayout suggestBirthdayActionLayout3 = this.birthdayLayout;
                if (suggestBirthdayActionLayout3 != null) {
                    suggestBirthdayActionLayout3.sticker.masterParent = null;
                    this.birthdayLayout = null;
                }
            }
            boolean z9 = !z7;
            this.starGiftLayout.set(messageObject2, z9);
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
                    showDrawableFindDrawable.view = this;
                }
            } else {
                setStateListAnimator(null);
                this.overriddenMaxWidth = 0;
            }
            if (messageObject2.isStoryMention()) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject2.messageOwner.media.user_id));
                this.avatarDrawable.setInfo(this.currentAccount, user);
                TL_stories.StoryItem storyItem = messageObject2.messageOwner.media.storyItem;
                if (storyItem == null || !storyItem.noforwards) {
                    StoriesUtilities.setImage(this.imageReceiver, storyItem);
                } else {
                    this.imageReceiver.setForUserOrChat(user, this.avatarDrawable, null, true, 0, true);
                }
                this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
            } else {
                int i8 = messageObject2.type;
                if (i8 == 22) {
                    if (messageObject2.strippedThumb == null) {
                        int size = messageObject2.photoThumbs.size();
                        for (int i9 = 0; i9 < size && !(messageObject2.photoThumbs.get(i9) instanceof TLRPC.TL_photoStrippedSize); i9++) {
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
                        Theme.ResourcesProvider resourcesProvider2 = this.themeDelegate;
                        boolean zIsDark = resourcesProvider2 != null ? resourcesProvider2.isDark() : Theme.currentTheme.isDark();
                        this.imageReceiver.clearImage();
                        int i10 = this.currentAccount;
                        String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(wallPaper);
                        int i11 = PreviewView.$r8$clinit;
                        EmojiThemes theme = ChatThemeController.getInstance(i10).getTheme(new ThemeKey(wallpaperEmoticon, null));
                        Drawable cachedWallpaper = theme == null ? Theme.getCachedWallpaper() : PreviewView.getBackgroundDrawableFromTheme(i10, theme, zIsDark);
                        this.wallpaperPreviewDrawable = cachedWallpaper;
                        if (cachedWallpaper != null) {
                            cachedWallpaper.setCallback(this);
                        }
                    } else if (wallPaper != null && (str5 = wallPaper.uploadingImage) != null) {
                        this.imageReceiver.setImage(ImageLocation.getForPath(str5), "150_150_wallpaper" + wallPaper.id + ChatBackgroundDrawable.hash(wallPaper.settings), null, null, ChatBackgroundDrawable.createThumb(wallPaper), 0L, null, wallPaper, 1);
                        this.wallpaperPreviewDrawable = null;
                    } else if (wallPaper != null) {
                        TLObject tLObject = messageObject2.photoThumbsObject;
                        TLRPC.Document document3 = tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document;
                        this.imageReceiver.setImage(ImageLocation.getForDocument(document3), "150_150_wallpaper" + wallPaper.id + ChatBackgroundDrawable.hash(wallPaper.settings), null, null, ChatBackgroundDrawable.createThumb(wallPaper), 0L, null, wallPaper, 1);
                        this.wallpaperPreviewDrawable = null;
                    } else {
                        this.wallpaperPreviewDrawable = null;
                    }
                    this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                    if (getUploadingInfoProgress(messageObject) == 1.0f) {
                        this.radialProgress.setProgress(1.0f, z9);
                        this.radialProgress.setIcon(4, z9, z9);
                    } else {
                        this.radialProgress.setIcon(3, z9, z9);
                    }
                } else if (i8 == 21) {
                    this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                    this.imageReceiver.setAllowStartLottieAnimation(true);
                    this.imageReceiver.setDelegate(null);
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) messageObject2.messageOwner.action;
                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_messageActionSuggestProfilePhoto.photo.video_sizes, 1000);
                    ArrayList<TLRPC.VideoSize> arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    ImageLocation forPhoto = (arrayList == null || arrayList.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = messageObject2.messageOwner.action.photo;
                    if (messageObject2.strippedThumb != null) {
                        photoSize2 = null;
                        break;
                    }
                    int size2 = messageObject2.photoThumbs.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            photoSize2 = null;
                            break;
                        }
                        photoSize2 = messageObject2.photoThumbs.get(i12);
                        if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, 1000);
                    if (closestPhotoSizeWithSize != null) {
                        if (closestVideoSizeWithSize != null) {
                            this.imageReceiver.setImage(forPhoto, "g", ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject, 0);
                            messageObject2 = messageObject;
                        } else {
                            this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject2, 0);
                        }
                    }
                    this.imageReceiver.setAllowStartLottieAnimation(false);
                    ImageUpdater imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject2.messageOwner.local_id);
                    if (imageUpdater != null) {
                        f = 1.0f;
                        if (imageUpdater.currentImageProgress != 1.0f) {
                            this.radialProgress.setIcon(3, z9, z9);
                        }
                    } else {
                        f = 1.0f;
                    }
                    this.radialProgress.setProgress(f, z9);
                    this.radialProgress.setIcon(4, z9, z9);
                } else if (i8 == 31 || i8 == 33 || i8 == 30 || i8 == 18 || i8 == 25 || i8 == 35) {
                    TLRPC.Document document4 = null;
                    this.imageReceiver.setRoundRadius(0);
                    TLRPC.MessageAction messageAction2 = messageObject2.messageOwner.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                        long j = MessagesController.getInstance(this.currentAccount).config.noForwardsRequestExpirePeriod.get(TimeUnit.SECONDS);
                        if (tL_messageActionNoForwardsRequest.expired) {
                            z2 = z7;
                        } else {
                            z2 = z7;
                            if (((long) messageObject2.messageOwner.date) + j >= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                                z6 = false;
                            }
                            this.offerExpired = z6;
                            if (!messageObject2.isOut() && !tL_messageActionNoForwardsRequest.expired && !this.offerExpired) {
                                BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
                                builder.addSharingOfferKeyboard();
                                this.botInlineButtons = builder.build();
                            }
                        }
                        z6 = true;
                        this.offerExpired = z6;
                        if (!messageObject2.isOut()) {
                            BotInlineKeyboard.Builder builder2 = new BotInlineKeyboard.Builder();
                            builder2.addSharingOfferKeyboard();
                            this.botInlineButtons = builder2.build();
                        }
                    } else {
                        z2 = z7;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                            if (starGift != null) {
                                TLRPC.Document giftDocument2 = TlUtils.getGiftDocument(starGift);
                                if (this.cardBackground == null) {
                                    this.cardBackground = new GiftSheet.CardBackground(this, this.themeDelegate, false);
                                }
                                this.cardBackground.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                giftDocument = giftDocument2;
                            } else {
                                giftDocument = null;
                            }
                            this.offerExpired = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                            if (!messageObject2.isOut() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.offerExpired) {
                                BotInlineKeyboard.Builder builder3 = new BotInlineKeyboard.Builder();
                                builder3.addGiftOfferKeyboard();
                                this.botInlineButtons = builder3.build();
                            }
                        } else {
                            if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                TL_stars.StarGift starGift2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                if (starGift2 != null) {
                                    giftDocument = TlUtils.getGiftDocument(starGift2);
                                    if (this.cardBackground == null) {
                                        this.cardBackground = new GiftSheet.CardBackground(this, this.themeDelegate, false);
                                    }
                                    this.cardBackground.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                                }
                            } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                if (starGift3 != null) {
                                    document2 = starGift3.sticker;
                                } else {
                                    document2 = null;
                                }
                                obj2 = messageObject2;
                                str2 = null;
                                document4 = document2;
                                obj = null;
                            } else {
                                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                    if (tL_messageActionStarGiftUnique.refunded) {
                                        TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                        if (starGift4 != null) {
                                            document2 = starGift4.getDocument();
                                        } else {
                                            document2 = null;
                                        }
                                        obj2 = messageObject2;
                                        str2 = null;
                                        document4 = document2;
                                        obj = null;
                                    }
                                }
                                if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
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
                                String str6 = str;
                                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str6);
                                if (stickerSetByName == null) {
                                    stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str6);
                                }
                                if (stickerSetByName != null) {
                                    TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                    int i13 = messageAction3.months;
                                    if (messageObject2.type == 30) {
                                        String str7 = "3⃣";
                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                            long j2 = messageAction3.cryptoAmount;
                                            if (j2 <= 10000000000L) {
                                                str7 = "2⃣";
                                            } else if (j2 <= 50000000000L) {
                                                str7 = "1⃣";
                                            }
                                        } else {
                                            long j3 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                            if (j3 <= 1000) {
                                                str7 = "2⃣";
                                            } else if (j3 >= 2500) {
                                                str7 = "4⃣";
                                            }
                                        }
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 < stickerSetByName.packs.size()) {
                                                TLRPC.TL_stickerPack tL_stickerPack = stickerSetByName.packs.get(i14);
                                                if (!TextUtils.equals(tL_stickerPack.emoticon, str7) || tL_stickerPack.documents.isEmpty()) {
                                                    i14++;
                                                } else {
                                                    long jLongValue = tL_stickerPack.documents.get(0).longValue();
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i15 < stickerSetByName.documents.size()) {
                                                            TLRPC.Document document5 = stickerSetByName.documents.get(i15);
                                                            long j4 = jLongValue;
                                                            if (document5 != null && document5.id == j4) {
                                                                str3 = str6;
                                                                document = document5;
                                                                break;
                                                            } else {
                                                                i15++;
                                                                jLongValue = j4;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            str3 = str6;
                                            document = null;
                                            break;
                                        }
                                    }
                                    String str8 = (String) monthsToEmoticon.get(Integer.valueOf(i13));
                                    ArrayList<TLRPC.TL_stickerPack> arrayList2 = stickerSetByName.packs;
                                    int size3 = arrayList2.size();
                                    TLRPC.Document document6 = null;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= size3) {
                                            str3 = str6;
                                            break;
                                        }
                                        TLRPC.TL_stickerPack tL_stickerPack2 = arrayList2.get(i16);
                                        i16++;
                                        TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                        if (!Objects.equals(tL_stickerPack3.emoticon, str8)) {
                                            str3 = str6;
                                            str4 = str8;
                                            break;
                                        }
                                        ArrayList<Long> arrayList3 = tL_stickerPack3.documents;
                                        int size4 = arrayList3.size();
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 >= size4) {
                                                str3 = str6;
                                                str4 = str8;
                                                break;
                                            }
                                            Long l = arrayList3.get(i17);
                                            i17++;
                                            long jLongValue2 = l.longValue();
                                            ArrayList<TLRPC.Document> arrayList4 = stickerSetByName.documents;
                                            int size5 = arrayList4.size();
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 >= size5) {
                                                    str3 = str6;
                                                    str4 = str8;
                                                    break;
                                                }
                                                TLRPC.Document document7 = arrayList4.get(i18);
                                                i18++;
                                                TLRPC.Document document8 = document7;
                                                str3 = str6;
                                                str4 = str8;
                                                if (document8.id == jLongValue2) {
                                                    document6 = document8;
                                                    break;
                                                } else {
                                                    str6 = str3;
                                                    str8 = str4;
                                                }
                                            }
                                            if (document6 != null) {
                                                break;
                                            }
                                            str6 = str3;
                                            str8 = str4;
                                        }
                                        if (document6 != null) {
                                            break;
                                        }
                                        str6 = str3;
                                        str8 = str4;
                                    }
                                    document = document6;
                                    if (document == null && !stickerSetByName.documents.isEmpty()) {
                                        document = stickerSetByName.documents.get(0);
                                    }
                                    obj2 = stickerSetByName;
                                    document4 = document;
                                    obj = obj2;
                                    str2 = str3;
                                } else {
                                    obj = stickerSetByName;
                                    str2 = str6;
                                    obj2 = null;
                                    document4 = null;
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
                                            Drawable drawable = getResources().getDrawable(iconRes);
                                            botButton.iconDrawable = drawable;
                                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                        }
                                        botButton.height = AndroidUtilities.dp(40.0f);
                                        int i19 = botButton.positionFlags | 8;
                                        botButton.positionFlags = i19;
                                        if (i4 == 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        int flag = BitwiseUtils.setFlag(i19, 1, z4);
                                        botButton.positionFlags = flag;
                                        if (i4 == 1) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        botButton.positionFlags = BitwiseUtils.setFlag(flag, 2, z5);
                                        botButton.title = new Text(button.getText(), (TextPaint) getThemedPaint("paintChatBotButton"));
                                        this.botButtons.add(botButton);
                                    }
                                }
                            }
                            this.forceWasUnread = messageObject2.wasUnread;
                            this.giftSticker = document4;
                            if (document4 != null) {
                                this.imageReceiver.setAllowStartLottieAnimation(true);
                                i = messageObject2.type;
                                if (i != 31 && i != 37 && i != 33) {
                                    this.imageReceiver.setDelegate(this.giftStickerDelegate);
                                }
                                this.giftEffectAnimation = null;
                                for (i2 = 0; i2 < document4.video_thumbs.size(); i2++) {
                                    if ("f".equals(document4.video_thumbs.get(i2).type)) {
                                        this.giftEffectAnimation = document4.video_thumbs.get(i2);
                                        break;
                                    }
                                }
                                if (z2 || messageObject2.type != 18) {
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document4, Theme.key_windowBackgroundGray, 0.3f);
                                    this.imageReceiver.setAutoRepeat(0);
                                    ImageReceiver imageReceiver = this.imageReceiver;
                                    ImageLocation forDocument = ImageLocation.getForDocument(document4);
                                    Locale locale = Locale.US;
                                    imageReceiver.setImage(forDocument, SurfaceContainer$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb, "tgs", obj2, 1);
                                }
                            } else if (str2 != null) {
                                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                                if (obj == null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                mediaDataController.loadStickersByEmojiOrName(str2, false, z3);
                            }
                        }
                        str2 = null;
                        obj2 = null;
                        document4 = giftDocument;
                        obj = null;
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
                                        Drawable drawable2 = getResources().getDrawable(iconRes);
                                        botButton.iconDrawable = drawable2;
                                        drawable2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                    }
                                    botButton.height = AndroidUtilities.dp(40.0f);
                                    int i110 = botButton.positionFlags | 8;
                                    botButton.positionFlags = i110;
                                    if (i4 == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    int flag2 = BitwiseUtils.setFlag(i110, 1, z4);
                                    botButton.positionFlags = flag2;
                                    if (i4 == 1) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    botButton.positionFlags = BitwiseUtils.setFlag(flag2, 2, z5);
                                    botButton.title = new Text(button2.getText(), (TextPaint) getThemedPaint("paintChatBotButton"));
                                    this.botButtons.add(botButton);
                                }
                            }
                        }
                        this.forceWasUnread = messageObject2.wasUnread;
                        this.giftSticker = document4;
                        if (document4 != null) {
                            this.imageReceiver.setAllowStartLottieAnimation(true);
                            i = messageObject2.type;
                            if (i != 31) {
                                this.imageReceiver.setDelegate(this.giftStickerDelegate);
                            }
                            this.giftEffectAnimation = null;
                            while (i2 < document4.video_thumbs.size()) {
                                if ("f".equals(document4.video_thumbs.get(i2).type)) {
                                    this.giftEffectAnimation = document4.video_thumbs.get(i2);
                                    break;
                                }
                            }
                            if (z2) {
                                SvgHelper.SvgDrawable svgThumb2 = DocumentObject.getSvgThumb(document4, Theme.key_windowBackgroundGray, 0.3f);
                                this.imageReceiver.setAutoRepeat(0);
                                ImageReceiver imageReceiver2 = this.imageReceiver;
                                ImageLocation forDocument2 = ImageLocation.getForDocument(document4);
                                Locale locale2 = Locale.US;
                                imageReceiver2.setImage(forDocument2, SurfaceContainer$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb2, "tgs", obj2, 1);
                            } else {
                                SvgHelper.SvgDrawable svgThumb3 = DocumentObject.getSvgThumb(document4, Theme.key_windowBackgroundGray, 0.3f);
                                this.imageReceiver.setAutoRepeat(0);
                                ImageReceiver imageReceiver3 = this.imageReceiver;
                                ImageLocation forDocument3 = ImageLocation.getForDocument(document4);
                                Locale locale3 = Locale.US;
                                imageReceiver3.setImage(forDocument3, SurfaceContainer$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb3, "tgs", obj2, 1);
                            }
                        } else if (str2 != null) {
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(this.currentAccount);
                            if (obj == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            mediaDataController2.loadStickersByEmojiOrName(str2, false, z3);
                        }
                    }
                    str2 = null;
                    obj = null;
                    obj2 = null;
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
                                    Drawable drawable3 = getResources().getDrawable(iconRes);
                                    botButton.iconDrawable = drawable3;
                                    drawable3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                botButton.height = AndroidUtilities.dp(40.0f);
                                int i111 = botButton.positionFlags | 8;
                                botButton.positionFlags = i111;
                                if (i4 == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int flag3 = BitwiseUtils.setFlag(i111, 1, z4);
                                botButton.positionFlags = flag3;
                                if (i4 == 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                botButton.positionFlags = BitwiseUtils.setFlag(flag3, 2, z5);
                                botButton.title = new Text(button3.getText(), (TextPaint) getThemedPaint("paintChatBotButton"));
                                this.botButtons.add(botButton);
                            }
                        }
                    }
                    this.forceWasUnread = messageObject2.wasUnread;
                    this.giftSticker = document4;
                    if (document4 != null) {
                        this.imageReceiver.setAllowStartLottieAnimation(true);
                        i = messageObject2.type;
                        if (i != 31) {
                            this.imageReceiver.setDelegate(this.giftStickerDelegate);
                        }
                        this.giftEffectAnimation = null;
                        while (i2 < document4.video_thumbs.size()) {
                            if ("f".equals(document4.video_thumbs.get(i2).type)) {
                                this.giftEffectAnimation = document4.video_thumbs.get(i2);
                                break;
                            }
                        }
                        if (z2) {
                            SvgHelper.SvgDrawable svgThumb4 = DocumentObject.getSvgThumb(document4, Theme.key_windowBackgroundGray, 0.3f);
                            this.imageReceiver.setAutoRepeat(0);
                            ImageReceiver imageReceiver4 = this.imageReceiver;
                            ImageLocation forDocument4 = ImageLocation.getForDocument(document4);
                            Locale locale4 = Locale.US;
                            imageReceiver4.setImage(forDocument4, SurfaceContainer$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb4, "tgs", obj2, 1);
                        } else {
                            SvgHelper.SvgDrawable svgThumb5 = DocumentObject.getSvgThumb(document4, Theme.key_windowBackgroundGray, 0.3f);
                            this.imageReceiver.setAutoRepeat(0);
                            ImageReceiver imageReceiver5 = this.imageReceiver;
                            ImageLocation forDocument5 = ImageLocation.getForDocument(document4);
                            Locale locale5 = Locale.US;
                            imageReceiver5.setImage(forDocument5, SurfaceContainer$$ExternalSyntheticOutline0.m(messageObject2.stableId, "160_160_nr_messageId="), svgThumb5, "tgs", obj2, 1);
                        }
                    } else if (str2 != null) {
                        MediaDataController mediaDataController3 = MediaDataController.getInstance(this.currentAccount);
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        mediaDataController3.loadStickersByEmojiOrName(str2, false, z3);
                    }
                } else if (i8 == 37) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) messageObject2.messageOwner.action).community_id));
                    this.imageReceiver.setAllowStartLottieAnimation(true);
                    this.imageReceiver.setDelegate(null);
                    this.imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                    this.imageReceiver.setAutoRepeatCount(1);
                    this.avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                    this.imageReceiver.setForUserOrChat(chat, new CommunityAvatarDrawable(getContext(), AndroidUtilities.dp(14.0f)), chat);
                } else if (i8 == 11) {
                    this.imageReceiver.setAllowStartLottieAnimation(true);
                    this.imageReceiver.setDelegate(null);
                    this.imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
                    this.imageReceiver.setAutoRepeatCount(1);
                    this.avatarDrawable.setInfo(messageObject2.getDialogId(), null, null, null, null);
                    if (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        this.imageReceiver.setImage(null, null, this.avatarDrawable, null, messageObject2, 0);
                    } else {
                        if (messageObject2.strippedThumb != null) {
                            photoSize = null;
                            break;
                        }
                        int size6 = messageObject2.photoThumbs.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size6) {
                                photoSize = null;
                                break;
                            }
                            photoSize = messageObject2.photoThumbs.get(i20);
                            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            } else {
                                i20++;
                            }
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, 640);
                        if (closestPhotoSizeWithSize2 != null) {
                            TLRPC.Photo photo2 = messageObject2.messageOwner.action.photo;
                            if (photo2.video_sizes.isEmpty() || !SharedConfig.isAutoplayGifs()) {
                                videoSize = null;
                            } else {
                                TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                if (messageObject2.mediaExists || DownloadController.getInstance(this.currentAccount).canDownloadMedia(4, closestVideoSizeWithSize2.size)) {
                                    videoSize = closestVideoSizeWithSize2;
                                } else {
                                    this.currentVideoLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize2, photo2);
                                    DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(closestVideoSizeWithSize2), messageObject2, this);
                                    videoSize = null;
                                }
                            }
                            if (videoSize != null) {
                                this.imageReceiver.setImage(ImageLocation.getForPhoto(videoSize, photo2), "g", ImageLocation.getForObject(photoSize, messageObject2.photoThumbsObject), "50_50_b", messageObject2.strippedThumb, 0L, null, messageObject2, 1);
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
            if (this.firstInChat && this.isAllChats && this.isSideMenued && (this.isForum || this.isMonoForum || this.isBotForum)) {
                this.topicSeparatorTopPadding = AndroidUtilities.dp(33.0f);
                if (this.topicSeparator == null) {
                    TopicSeparator topicSeparator = new TopicSeparator(this.currentAccount, this, this.themeDelegate, true);
                    this.topicSeparator = topicSeparator;
                    topicSeparator.onClickListener = new ChatActionCell$$ExternalSyntheticLambda3(this, 1);
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
                TopicSeparator topicSeparator2 = this.topicSeparator;
                if (topicSeparator2 != null) {
                    topicSeparator2.detach();
                    this.topicSeparator = null;
                }
                i5 = 0;
                this.topicSeparatorTopPadding = 0;
            }
            int paddingTop = getPaddingTop();
            int i21 = this.topicSeparatorTopPadding;
            if (paddingTop != i21) {
                setPadding(i5, i21, i5, i5);
            }
            this.rippleView.setVisibility((!isButtonLayout(messageObject) || this.starGiftLayout.has()) ? 8 : 0);
            int i22 = ForumUtilities.$r8$clinit;
            if (messageObject2.getDialogId() <= 0 && (tL_forumTopicFindTopic = MessagesController.getInstance(messageObject2.currentAccount).getTopicsController().findTopic(-messageObject2.getDialogId(), MessageObject.getTopicId(messageObject2.currentAccount, messageObject2.messageOwner, true))) != null) {
                Drawable drawable4 = messageObject2.topicIconDrawable[0];
                if (drawable4 instanceof ForumBubbleDrawable) {
                    ((ForumBubbleDrawable) drawable4).setColor(tL_forumTopicFindTopic.icon_color);
                }
            }
            requestLayout();
        }
    }

    @Override
    public final void invalidate(Rect rect) {
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

    public final class TextLayout {
        public Object emoji;
        public Object layout;
        public TextPaint paint;
        public final Object patchedLayout;
        public final ArrayList spoilers;
        public final Object this$0;
        public int width;
        public float x;
        public float y;

        public TextLayout() {
            TextPaint textPaint = new TextPaint(1);
            this.paint = textPaint;
            this.x = 1.0f;
            this.layout = new HashMap();
            this.patchedLayout = new RectF();
            this.emoji = new RectF();
            Paint paint = new Paint();
            this.this$0 = paint;
            this.spoilers = new ArrayList();
            this.y = 1000.0f / AndroidUtilities.screenRefreshRate;
            this.width = 25;
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setColor(-1);
            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
            if (devicePerformanceClass == 0) {
                this.x = 0.25f;
            } else if (devicePerformanceClass != 1) {
                this.x = 0.75f;
            } else {
                this.x = 0.5f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(this.x * 24.0f));
            paint.setColor(-1);
        }

        public void setText(CharSequence charSequence, TextPaint textPaint, int i) {
            ChatActionCell chatActionCell;
            this.paint = textPaint;
            this.width = i;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
            this.layout = staticLayout;
            ChatActionCell chatActionCell2 = (ChatActionCell) this.this$0;
            MessageObject messageObject = chatActionCell2.currentMessageObject;
            ArrayList arrayList = this.spoilers;
            if (messageObject == null || !messageObject.isSpoilersRevealed) {
                int i2 = SpoilerEffect.MAX_PARTICLES_PER_ENTITY;
                if (staticLayout.getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) staticLayout.getText();
                    chatActionCell = chatActionCell2;
                    SpoilerEffect.addSpoilers(chatActionCell, staticLayout, -1, i, spanned, null, arrayList, null);
                }
                this.emoji = AnimatedEmojiSpan.update(0, (View) chatActionCell, false, (AnimatedEmojiSpan.EmojiGroupedSpans) this.emoji, (StaticLayout) this.layout);
            }
            if (arrayList != null) {
                arrayList.clear();
            }
            chatActionCell = chatActionCell2;
            this.emoji = AnimatedEmojiSpan.update(0, (View) chatActionCell, false, (AnimatedEmojiSpan.EmojiGroupedSpans) this.emoji, (StaticLayout) this.layout);
        }

        public TextLayout(ChatActionCell chatActionCell) {
            this.this$0 = chatActionCell;
            this.spoilers = new ArrayList();
            this.patchedLayout = new AtomicReference();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
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
